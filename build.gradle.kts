plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.9.22" apply false
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks {
    wrapper {
        gradleVersion = "8.3"
        distributionType = Wrapper.DistributionType.ALL
    }
}
