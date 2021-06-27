/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

import com.android.build.gradle.BaseExtension

configure<BaseExtension> {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(30)
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
