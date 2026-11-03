package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias HCS_CREATE_OPTIONS = Int

public fun interface HCS_EVENT_CALLBACKFn {
    public operator fun invoke(event: Long, context: Long)
}

public typealias HCS_EVENT_CALLBACK = HCS_EVENT_CALLBACKFn?

public typealias HCS_EVENT_OPTIONS = Int

public typealias HCS_EVENT_TYPE = Int

public typealias HCS_NOTIFICATIONS = Int

public fun interface HCS_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(notificationtype: UInt, context: Long, notificationstatus: HRESULT, notificationdata: PCWSTR)
}

public typealias HCS_NOTIFICATION_CALLBACK = HCS_NOTIFICATION_CALLBACKFn?

public typealias HCS_NOTIFICATION_FLAGS = Int

public typealias HCS_OPERATION = Long

public fun interface HCS_OPERATION_COMPLETIONFn {
    public operator fun invoke(operation: HCS_OPERATION, context: Long)
}

public typealias HCS_OPERATION_COMPLETION = HCS_OPERATION_COMPLETIONFn?

public typealias HCS_OPERATION_OPTIONS = Int

public typealias HCS_OPERATION_TYPE = Int

public typealias HCS_PROCESS = Long

public typealias HCS_RESOURCE_TYPE = Int

public typealias HCS_SYSTEM = Long
