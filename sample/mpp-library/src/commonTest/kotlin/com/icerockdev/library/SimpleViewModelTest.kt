/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package com.icerockdev.library

import dev.icerock.moko.test.AndroidArchitectureInstantTaskExecutorRule
import dev.icerock.moko.test.TestRule
import kotlin.test.Test
import kotlin.test.assertEquals

class SimpleViewModelTest {

    @get:TestRule
    val instantTaskExecutorRule = AndroidArchitectureInstantTaskExecutorRule()

    @Test
    fun `test view model changes`() {
        val simpleViewModel = SimpleViewModel()

        assertEquals(expected = "0", actual = simpleViewModel.counter.value)

        simpleViewModel.onCounterButtonPressed()

        assertEquals(expected = "1", actual = simpleViewModel.counter.value)
    }
}
