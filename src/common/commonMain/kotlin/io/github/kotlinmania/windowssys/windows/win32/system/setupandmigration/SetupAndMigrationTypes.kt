package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

public fun interface OOBE_COMPLETED_CALLBACKFn {
    public operator fun invoke(callbackcontext: Long)
}

public typealias OOBE_COMPLETED_CALLBACK = OOBE_COMPLETED_CALLBACKFn?
