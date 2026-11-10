package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun oOBEComplete(isoobecomplete: COpaquePointer?): Bool

public expect fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: COpaquePointer?, waithandle: COpaquePointer?): Bool

public expect fun unregisterWaitUntilOOBECompleted(waithandle: COpaquePointer?): Bool
