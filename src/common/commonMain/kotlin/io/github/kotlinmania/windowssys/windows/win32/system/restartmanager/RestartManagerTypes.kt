package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

public typealias RmAppStatus = Int

public typealias RmAppType = Int

public typealias RmFilterAction = Int

public typealias RmFilterTrigger = Int

public typealias RmRebootReason = Int

public typealias RmShutdownType = Int

public fun interface RmWriteStatusCallbackFn {
    public operator fun invoke(npercentcomplete: UInt)
}

public typealias RmWriteStatusCallback = RmWriteStatusCallbackFn?
