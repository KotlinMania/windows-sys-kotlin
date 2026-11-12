package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public fun interface OndemandNotificationCallbackFn {
    public operator fun invoke(param0: ConstPtr<CVoid>)
}

public typealias OndemandNotificationCallback = OndemandNotificationCallbackFn?

public typealias WcmConnectionCost = Int

public typealias WcmConnectionCostSource = Int

public typealias WcmMediaType = Int

public typealias WcmProperty = Int
