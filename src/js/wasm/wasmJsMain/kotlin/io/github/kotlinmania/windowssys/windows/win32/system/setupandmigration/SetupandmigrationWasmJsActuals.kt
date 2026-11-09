@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun OOBEComplete(isoobecomplete: Long): BOOL =
    0

public actual fun RegisterWaitUntilOOBECompleted(oobecompletedcallback: OOBE_COMPLETED_CALLBACK, callbackcontext: Long, waithandle: Long): BOOL =
    0

public actual fun UnregisterWaitUntilOOBECompleted(waithandle: Long): BOOL =
    0
