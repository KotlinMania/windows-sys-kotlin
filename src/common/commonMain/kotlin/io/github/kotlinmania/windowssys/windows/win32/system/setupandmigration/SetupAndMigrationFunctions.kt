package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun oOBEComplete(isoobecomplete: MutPtr<Bool>): Bool

public expect fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: ConstPtr<CVoid>, waithandle: MutPtr<MutPtr<CVoid>>): Bool

public expect fun unregisterWaitUntilOOBECompleted(waithandle: ConstPtr<CVoid>): Bool
