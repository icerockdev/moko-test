/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Deps {
    private const val kotlinVersion = "1.4.31"

    private const val androidCoreTestingVersion = "2.1.0"
    private const val roboelectricVersion = "4.4"

    private const val detektVersion = "1.15.0"

    private const val coroutinesVersion = "1.4.2"
    const val mokoTestVersion = "0.3.0"

    object Android {
        const val compileSdk = 29
        const val targetSdk = 29
        const val minSdk = 16
    }

    object Libs {
        object Android {
            const val roboelectric =
                "org.robolectric:robolectric:$roboelectricVersion"
        }

        object MultiPlatform {
            const val coroutines =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
            const val mokoTest = "dev.icerock.moko:test-core:$mokoTestVersion"
            const val mokoTestRoboelectric = "dev.icerock.moko:test-roboelectric:$mokoTestVersion"
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
