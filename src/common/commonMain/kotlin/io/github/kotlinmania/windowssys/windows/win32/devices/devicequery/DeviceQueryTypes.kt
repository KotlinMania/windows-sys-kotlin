package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

public typealias DEVPROP_OPERATOR = UInt

public typealias DEV_OBJECT_TYPE = Int

public typealias DEV_QUERY_FLAGS = Int

public typealias DEV_QUERY_RESULT_ACTION = Int

public typealias DEV_QUERY_STATE = Int

public typealias HDEVQUERY = Long

public fun interface PDEV_QUERY_RESULT_CALLBACKFn {
    public operator fun invoke(hdevquery: HDEVQUERY, pcontext: Long, pactiondata: Long)
}

public typealias PDEV_QUERY_RESULT_CALLBACK = PDEV_QUERY_RESULT_CALLBACKFn?
