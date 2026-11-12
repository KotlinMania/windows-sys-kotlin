package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public fun interface OobeCompletedCallbackFn {
    public operator fun invoke(callbackcontext: ConstPtr<CVoid>)
}

public typealias OobeCompletedCallback = OobeCompletedCallbackFn?
