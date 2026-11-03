package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.windowssys.core.PCWSTR

public data class DEVPROP_FILTER_EXPRESSION(public var Operator: DEVPROP_OPERATOR = 0u, public var Property: Properties.DEVPROPERTY = Properties.DEVPROPERTY())

public data class DEV_OBJECT(
    public var ObjectType: DEV_OBJECT_TYPE = 0,
    public var pszObjectId: PCWSTR = 0L,
    public var cPropertyCount: UInt = 0u,
    public var pProperties: Long = 0L,
)

public data class DEV_QUERY_PARAMETER(
    public var Key: Foundation.DEVPROPKEY = Foundation.DEVPROPKEY(),
    public var Type: Properties.DEVPROPTYPE = Properties.DEVPROPTYPE(),
    public var BufferSize: UInt = 0u,
    public var Buffer: Long = 0L,
)

public data class DEV_QUERY_RESULT_ACTION_DATA(public var Action: DEV_QUERY_RESULT_ACTION = 0, public var Data: DEV_QUERY_RESULT_ACTION_DATA_0 = DEV_QUERY_RESULT_ACTION_DATA_0())

public data class DEV_QUERY_RESULT_ACTION_DATA_0(public var State: DEV_QUERY_STATE = 0, public var DeviceObject: DEV_OBJECT = DEV_OBJECT())
