import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.gradle.model.internal.core.ModelNodes.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("multiplatform") version "1.9.21"
    antlr
}

val antlrKotlinVersion = extra["antlrKotlinVersion"]

kotlin {
    jvm()
    js {
        browser {

        }
        nodejs {

        }
        //binaries.executable()
        generateTypeScriptDefinitions()
    }

    sourceSets {
//        val commonAntlr by creating {
//            dependencies {
//                //api(kotlin("stdlib-common"))
//                // add antlr-kotlin-runtime
//                // otherwise, the generated sources will not compile
//                api("com.strumenta:antlr-kotlin-runtime:$antlrKotlinVersion")
//                // antlr-kotlin-runtime-jvm is automatically added as an jvm dependency by gradle
//            }
//            // you have to add the generated sources the to the kotlin compiler source directory list
//            // this is not required if you use src/commonAntlr/kotlin
//            // and want to add the generated sources to version control
//            kotlin.srcDir(layout.buildDirectory.get().dir("generatedAntlr"))
//        }

        val commonMain by getting {
            //dependsOn(commonAntlr)
            dependencies {
                implementation("com.strumenta:antlr-kotlin-runtime:$antlrKotlinVersion")
            }
            kotlin.srcDir(layout.buildDirectory.get().dir("generatedAntlr"))
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

repositories {
    //mavenLocal()
    // used to download antlr4
    mavenCentral()
}

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
    setSource(layout.projectDirectory.dir("src/commonMain/antlr"))

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

//    sourceSets {
//        val generatedAntlr by creating {
//            java.srcDir(layout.buildDirectory.get().dir("generatedAntlr"))
//        }
//    }
//    sourceSets.getByName("main") {
//        java.srcDir(layout.buildDirectory.get().dir("generatedAntlr"))
//    }
}

tasks.withType<KotlinCompile<*>> {
    dependsOn(generateKotlinGrammarSource)
}

tasks {
    findByName("jsMainClasses")!!.dependsOn("generateTestGrammarSource")
    findByName("jvmMainClasses")!!.dependsOn("generateTestGrammarSource")
}

tasks.withType(Test::class).all {
    testLogging {
        showStandardStreams = true
        showExceptions = true
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        events = setOf(TestLogEvent.PASSED, TestLogEvent.FAILED, TestLogEvent.SKIPPED)
    }
}
