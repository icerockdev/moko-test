/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.test

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

fun CoroutineScope.waitChildrenCompletion() = runBlocking {
    val job = this@waitChildrenCompletion.coroutineContext[Job]
    val children = job?.children.orEmpty().toList()
    children.forEach { it.join() }
}
