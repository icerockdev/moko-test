/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.test.cases

// for ios we should not do anything
actual class InstantTaskRule actual constructor() : TestCases.Rule {

    override fun setup() {
    }

    override fun tearDown() {
    }
}
