/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

import com.android.build.gradle.BaseExtension

configure<BaseExtension> {
    compileSdkVersion(libs.versions.compileSdk.get().toInt())

    defaultConfig {
        minSdkVersion(libs.versions.minSdk.get().toInt())
        targetSdkVersion(libs.versions.targetSdk.get().toInt())
    }

    with(buildFeatures) {
        viewBinding = false
        aidl = false
        buildConfig = false
        prefab = false
        compose = false
        renderScript = false
        resValues = false
        shaders = false
    }
}
