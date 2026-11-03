package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

public typealias RM_APP_STATUS = Int

public typealias RM_APP_TYPE = Int

public typealias RM_FILTER_ACTION = Int

public typealias RM_FILTER_TRIGGER = Int

public typealias RM_REBOOT_REASON = Int

public typealias RM_SHUTDOWN_TYPE = Int

public fun interface RM_WRITE_STATUS_CALLBACKFn {
    public operator fun invoke(npercentcomplete: UInt)
}

public typealias RM_WRITE_STATUS_CALLBACK = RM_WRITE_STATUS_CALLBACKFn?
