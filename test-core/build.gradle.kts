/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */
plugins {
    id("mpp-library-convention")
    id("stub-javadoc-convention")
    id("publication-convention")
    id("detekt-convention")
}

dependencies {
    commonMainImplementation(Deps.Libs.MultiPlatform.coroutines)

    commonMainApi(Deps.Libs.Tests.kotlinTestJUnit)
    androidMainApi(Deps.Libs.Tests.coroutinesTest)
    androidMainApi(Deps.Libs.Tests.androidCoreTesting)
}
