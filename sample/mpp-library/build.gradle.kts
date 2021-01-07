/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    plugin(Deps.Plugins.androidLibrary)
    plugin(Deps.Plugins.kotlinMultiplatform)
    plugin(Deps.Plugins.mobileMultiplatform)
}

dependencies {
    commonMainImplementation(Deps.Libs.MultiPlatform.coroutines)

    commonMainImplementation(Deps.Libs.MultiPlatform.mokoMvvm)

    androidMainImplementation(Deps.Libs.Android.lifecycle)

    commonTestImplementation(Deps.Libs.MultiPlatform.mokoTest)
}
