/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

configurations.all {
    resolutionStrategy.dependencySubstitution {
        substitute(module(libs.mokoTestCore))
            .with(projects.testCore)
        substitute(module(libs.mokoTestRoboelectric))
            .with(arrayOf(projects.testRoboelectric))
    }
}
