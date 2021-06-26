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
    commonMainImplementation(libs.coroutines)

    androidMainImplementation(libs.roboelectric)
    commonMainApi(projects.testCore)

    commonMainApi(libs.kotlinTestJUnit)
    androidMainApi(libs.coroutinesTest)
    androidMainApi(libs.androidCoreTesting)
}
