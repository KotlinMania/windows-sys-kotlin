package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.COpaquePointer

public fun interface OndemandNotificationCallbackFn {
    public operator fun invoke(param0: COpaquePointer?)
}

public typealias OndemandNotificationCallback = OndemandNotificationCallbackFn?

public typealias WcmConnectionCost = Int

public typealias WcmConnectionCostSource = Int

public typealias WcmMediaType = Int

public typealias WcmProperty = Int
