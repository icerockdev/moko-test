/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    api(libs.mobileMultiplatformGradlePlugin)
    api(libs.kotlinGradlePlugin)
    api(libs.androidGradlePlugin)
    api(libs.detektGradlePlugin)
}
