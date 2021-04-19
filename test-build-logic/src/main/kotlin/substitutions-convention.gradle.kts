/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

configurations.all {
    resolutionStrategy.dependencySubstitution {
        substitute(module(Deps.Libs.MultiPlatform.mokoTest))
            .with(project(":test"))
        substitute(module(Deps.Libs.MultiPlatform.mokoTestRoboelectric))
            .with(project(":test-roboelectric"))
    }
}
