/*
 * Copyright 2021 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.test

import kotlinx.coroutines.CoroutineScope

expect fun <T> runBlocking(
    block: suspend CoroutineScope.() -> T
): T
