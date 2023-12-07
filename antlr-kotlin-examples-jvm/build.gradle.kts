import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.gradle.model.internal.core.ModelNodes.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm")
    antlr
}


repositories {
    // used for local development and while building by travis ci and jitpack.io
    mavenLocal()
    // used to download antlr4
    mavenCentral()
    // used to download antlr-kotlin-runtime
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

val antlrKotlinVersion = extra["antlrKotlinVersion"]

dependencies {
    // The ANTLR 4 dependency, which instructs the Gradle ANTLR plugin
    // to use ANTLR 4 instead of the bundled version
    antlr("org.antlr:antlr4:4.13.1")

    // The ANTLR Kotlin target
    antlr("com.strumenta:antlr-kotlin-target:$antlrKotlinVersion")

    // The ANTLR Kotlin runtime
    implementation("com.strumenta:antlr-kotlin-runtime:$antlrKotlinVersion")

    testImplementation(kotlin("test"))
}

tasks {
    generateGrammarSource {
        // The default task is set up considering a Java source set,
        // which we might not have in a Kotlin project.
        // Using it is messier than simply registering a new task
        enabled = false
    }
}

val generateKotlinGrammarSource = tasks.register<AntlrTask>("generateKotlinGrammarSource") {
    dependsOn("cleanGenerateKotlinGrammarSource")

    // ANTLR .g4 files are under {example-project}/antlr
    setSource(layout.projectDirectory.dir("src/main/antlr"))

    val pkgName = "com.strumenta.antlrkotlin.parsers.generated"
    arguments = listOf(
        "-Dlanguage=Kotlin",    // We want to generate Kotlin sources
        "-visitor",             // We want visitors alongside listeners
        "-package", pkgName,    // We want the generated sources to have this package declared
        "-encoding", "UTF-8",   // We want the generated sources to be encoded in UTF-8
    )

    // Generated files are outputted inside standard sources,
    // but you can switch to output them under build/
    val outDir = "generatedAntlr/${pkgName.replace(".", "/")}"
    outputDirectory = layout.buildDirectory.get().dir(outDir).asFile

    sourceSets.getByName("main") {
        java.srcDir(layout.buildDirectory.get().dir("generatedAntlr"))
    }
}

tasks.withType<KotlinCompile<*>> {
    dependsOn(generateKotlinGrammarSource)
}

tasks {
    findByName("compileTestKotlin")!!.dependsOn("generateTestGrammarSource")
}

tasks.withType(Test::class).all {
    testLogging {
        showStandardStreams = true
        showExceptions = true
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        events = setOf(TestLogEvent.PASSED, TestLogEvent.FAILED, TestLogEvent.SKIPPED)
    }
}