/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    plugin(Deps.Plugins.androidLibrary)
    plugin(Deps.Plugins.kotlinMultiplatform)
    plugin(Deps.Plugins.mobileMultiplatform)
    plugin(Deps.Plugins.mavenPublish)
}

group = "dev.icerock.moko"
version = Deps.mokoTestVersion

dependencies {
    commonMainImplementation(Deps.Libs.MultiPlatform.coroutines)

    commonMainApi(Deps.Libs.Tests.kotlinTestJUnit)
    androidMainApi(Deps.Libs.Tests.coroutinesTest)
    androidMainApi(Deps.Libs.Tests.androidCoreTesting)
}

publishing {
    repositories.maven("https://api.bintray.com/maven/icerockdev/moko/moko-test/;publish=1") {
        name = "bintray"

        credentials {
            username = System.getProperty("BINTRAY_USER")
            password = System.getProperty("BINTRAY_KEY")
        }
    }
}
