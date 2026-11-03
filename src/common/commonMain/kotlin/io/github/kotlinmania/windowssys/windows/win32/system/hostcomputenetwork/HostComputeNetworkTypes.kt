package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias HCN_NOTIFICATIONS = Int

public fun interface HCN_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(notificationtype: UInt, context: Long, notificationstatus: HRESULT, notificationdata: PCWSTR)
}

public typealias HCN_NOTIFICATION_CALLBACK = HCN_NOTIFICATION_CALLBACKFn?

public typealias HCN_PORT_ACCESS = Int

public typealias HCN_PORT_PROTOCOL = Int
