package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.COpaquePointer

public fun interface OobeCompletedCallbackFn {
    public operator fun invoke(callbackcontext: COpaquePointer?)
}

public typealias OobeCompletedCallback = OobeCompletedCallbackFn?
