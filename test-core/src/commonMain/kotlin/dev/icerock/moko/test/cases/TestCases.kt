/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.test.cases

import kotlin.test.AfterTest
import kotlin.test.BeforeTest

abstract class TestCases {
    abstract val rules: List<Rule>

    @BeforeTest
    open fun testRulesSetup() {
        rules.forEach { it.setup() }
    }

    @AfterTest
    open fun testRulesTearDown() {
        rules.forEach { it.tearDown() }
    }

    interface Rule {
        fun setup()
        fun tearDown()
    }
}
