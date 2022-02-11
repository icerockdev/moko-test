buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
    dependencies {
        classpath(":test-build-logic")
    }
}

plugins {
    alias(libs.plugins.nexusPublish)
}

nexusPublishing {
    repositories {
        sonatype {
            username.set(System.getenv("OSSRH_USER"))
            password.set(System.getenv("OSSRH_KEY"))
        }
    }
}

// temporary fix for Apple Silicon (remove after 1.6.20 update)
rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin> {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().nodeVersion = "16.0.0"
}
