package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun oOBEComplete(isoobecomplete: MutPtr): Bool

public expect fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: ConstPtr, waithandle: MutPtr): Bool

public expect fun unregisterWaitUntilOOBECompleted(waithandle: ConstPtr): Bool
