/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.test

import kotlinx.coroutines.CoroutineScope

@Deprecated(
    message = "use runTest start from coroutines-test:1.6.0",
    replaceWith = ReplaceWith("runTest", imports = arrayOf("kotlinx.coroutines.test.runTest"))
)
actual fun <T> runBlocking(
    block: suspend CoroutineScope.() -> T
): T = throw IllegalArgumentException("JS can't have runBlocking. Please use runTest instead")
