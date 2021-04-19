/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("mpp-library-convention")
    id("substitutions-convention")
}

dependencies {
    commonMainImplementation(Deps.Libs.MultiPlatform.coroutines)

    commonTestImplementation(Deps.Libs.MultiPlatform.mokoTest)
}
