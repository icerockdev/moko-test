/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    val enableSharedTargets: Boolean = System.getProperty("IS_MAIN_HOST")?.let { it == "true" } ?: true
    if(enableSharedTargets) id("android-library-convention")
    id("org.jetbrains.kotlin.multiplatform")
    id("dev.icerock.mobile.multiplatform.android-manifest")
}

kotlin {
    val enableSharedTargets: Boolean = System.getProperty("IS_MAIN_HOST")?.let { it == "true" } ?: true

    if (enableSharedTargets) {
        android {
            publishAllLibraryVariants()
            publishLibraryVariantsGroupedByFlavor = true
        }
        // JVM
        jvm()
        // JS
        js(IR) {
            browser()
            nodejs()
        }
        // linux
        linuxX64()
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
    // windows
    mingwX64()

    sourceSets {
        val nonAndroidMain by creating
        val nonAndroidJsMain by creating
        nonAndroidMain.dependsOn(commonMain.get())
        nonAndroidJsMain.dependsOn(commonMain.get())

        listOfNotNull(
            findByName("iosArm32Main"),
            findByName("iosArm64Main"),
            findByName("iosX64Main"),
            findByName("iosSimulatorArm64Main"),
            findByName("macosArm64Main"),
            findByName("macosX64Main"),
            findByName("watchosX64Main"),
            findByName("watchosX86Main"),
            findByName("watchosArm32Main"),
            findByName("watchosArm64Main"),
            findByName("watchosSimulatorArm64Main"),
            findByName("tvosArm64Main"),
            findByName("tvosSimulatorArm64Main"),
            findByName("tvosX64Main"),
            findByName("jvmMain"),
            findByName("linuxX64Main"),
            findByName("mingwX64Main"),
        ).forEach {
            it.dependsOn(nonAndroidJsMain)
            it.dependsOn(nonAndroidMain)
        }

        findByName("jsMain")?.dependsOn(nonAndroidMain)

        commonMain.get().dependencies {
            implementation(kotlin("stdlib"))
        }
    }
}
