/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Deps {
    private const val kotlinVersion = "1.4.21"

    private const val androidLifecycleVersion = "2.2.0"
    private const val androidCoreTestingVersion = "2.1.0"

    private const val detektVersion = "1.15.0"

    private const val coroutinesVersion = "1.4.2"
    private const val mokoMvvmVersion = "0.8.1"
    const val mokoTestVersion = "0.1.0"

    object Android {
        const val compileSdk = 29
        const val targetSdk = 29
        const val minSdk = 16
    }

    object Plugins {
        val androidLibrary = GradlePlugin(id = "com.android.library")
        val kotlinMultiplatform = GradlePlugin(id = "org.jetbrains.kotlin.multiplatform")
        val mavenPublish = GradlePlugin(id = "org.gradle.maven-publish")

        val mobileMultiplatform = GradlePlugin(id = "dev.icerock.mobile.multiplatform")

        val detekt = GradlePlugin(
            id = "io.gitlab.arturbosch.detekt",
            version = detektVersion
        )
    }

    object Libs {
        object Android {
            const val lifecycle = "androidx.lifecycle:lifecycle-extensions:$androidLifecycleVersion"
            const val coroutines =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        }

        object MultiPlatform {
            const val coroutines =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
            const val mokoMvvm = "dev.icerock.moko:mvvm:$mokoMvvmVersion"
            const val mokoTest = "dev.icerock.moko:test:$mokoTestVersion"
        }

        object Tests {
            const val kotlinTestJUnit =
                "org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion"
            const val androidCoreTesting =
                "androidx.arch.core:core-testing:$androidCoreTestingVersion"
            const val coroutinesTest =
                "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion"
        }

        object Jvm {
            const val detektFormatting =
                "io.gitlab.arturbosch.detekt:detekt-formatting:$detektVersion"
        }
    }
}
