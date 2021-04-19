/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.test.cases

import android.annotation.SuppressLint
import androidx.arch.core.executor.ArchTaskExecutor
import androidx.arch.core.executor.TaskExecutor

// see androidx.arch.core.executor.testing.InstantTaskExecutorRule
@SuppressLint("RestrictedApi")
actual class InstantTaskRule actual constructor() : TestCases.Rule {

    override fun setup() {
        ArchTaskExecutor.getInstance().setDelegate(object : TaskExecutor() {
            override fun executeOnDiskIO(runnable: Runnable) {
                runnable.run()
            }

            override fun postToMainThread(runnable: Runnable) {
                runnable.run()
            }

            override fun isMainThread(): Boolean {
                return true
            }
        })
    }

    override fun tearDown() {
        ArchTaskExecutor.getInstance().setDelegate(null)
    }
}
