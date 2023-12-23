pluginManagement {
    val kotlinVersion: String by settings

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }

//    plugins {
//        id("org.jetbrains.kotlin.jvm") version kotlinVersion
//    }
}

rootProject.name = "antlr-kotlin-examples"
include("antlr-kotlin-examples-jvm")
include("antlr-kotlin-examples-wasi")