package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

public fun interface ONDEMAND_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(param0: Long)
}

public typealias ONDEMAND_NOTIFICATION_CALLBACK = ONDEMAND_NOTIFICATION_CALLBACKFn?

public typealias WCM_CONNECTION_COST = Int

public typealias WCM_CONNECTION_COST_SOURCE = Int

public typealias WCM_MEDIA_TYPE = Int

public typealias WCM_PROPERTY = Int
