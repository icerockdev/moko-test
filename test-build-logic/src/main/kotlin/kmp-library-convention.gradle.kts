/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("android-library-convention")
    id("org.jetbrains.kotlin.multiplatform")
    id("dev.icerock.mobile.multiplatform.android-manifest")
}

kotlin {
    android {
        publishAllLibraryVariants()
        publishLibraryVariantsGroupedByFlavor = true
    }
    // iOS
    iosArm32()
    iosArm64()
    iosX64()
    iosSimulatorArm64()
    // macOS
    macosArm64()
    macosX64()
    // watchOS
    watchosX64()
    watchosX86()
    watchosArm32()
    watchosArm64()
    watchosSimulatorArm64()
    // tvOS
    tvosArm64()
    tvosSimulatorArm64()
    tvosX64()
    // JVM
    jvm()
    // JS
    js(IR) {
        browser()
        nodejs()
    }
    // linux
    linuxX64()
    // windows
    mingwX64()

    sourceSets {
        val nonAndroidMain by creating
        val nonAndroidJsMain by creating
        nonAndroidMain.dependsOn(getByName("commonMain"))
        nonAndroidJsMain.dependsOn(getByName("commonMain"))

        listOf(
            getByName("iosArm32Main"),
            getByName("iosArm64Main"),
            getByName("iosX64Main"),
            getByName("iosSimulatorArm64Main"),
            getByName("macosArm64Main"),
            getByName("macosX64Main"),
            getByName("watchosX64Main"),
            getByName("watchosX86Main"),
            getByName("watchosArm32Main"),
            getByName("watchosArm64Main"),
            getByName("watchosSimulatorArm64Main"),
            getByName("tvosArm64Main"),
            getByName("tvosSimulatorArm64Main"),
            getByName("tvosX64Main"),
            getByName("jvmMain"),
            getByName("linuxX64Main"),
            getByName("mingwX64Main"),
        ).forEach {
            it.dependsOn(nonAndroidJsMain)
            it.dependsOn(nonAndroidMain)
        }

        getByName("jsMain").dependsOn(nonAndroidMain)
    }
}
