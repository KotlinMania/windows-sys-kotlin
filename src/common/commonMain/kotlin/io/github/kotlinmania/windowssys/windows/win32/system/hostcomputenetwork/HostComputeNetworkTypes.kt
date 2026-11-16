package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias HcnNotifications = Int

public fun interface HcnNotificationCallbackFn {
    public operator fun invoke(notificationtype: UInt, context: ConstPtr, notificationstatus: Hresult, notificationdata: Pcwstr)
}

public typealias HcnNotificationCallback = HcnNotificationCallbackFn?

public typealias HcnPortAccess = Int

public typealias HcnPortProtocol = Int
