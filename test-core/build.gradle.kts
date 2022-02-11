/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */
plugins {
    id("kmp-library-convention")
    id("stub-javadoc-convention")
    id("publication-convention")
    id("detekt-convention")
}

group = "dev.icerock.moko"
version = libs.versions.mokoTestVersion.get()

dependencies {
    commonMainApi(libs.coroutines)
    commonMainApi(libs.kotlinTestJUnit)
    commonMainApi(libs.coroutinesTest)
    
    androidMainApi(libs.androidCoreTesting)
}
