package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.core.BOOL

public typealias AUTHENTICATION_REQUIREMENTS = Int

public typealias BLUETOOTH_AUTHENTICATION_METHOD = Int

public typealias BLUETOOTH_AUTHENTICATION_REQUIREMENTS = Int

public typealias BLUETOOTH_IO_CAPABILITY = Int

public typealias BTH_LE_GATT_DESCRIPTOR_TYPE = Int

public typealias BTH_LE_GATT_EVENT_TYPE = Int

public typealias HANDLE_SDP_TYPE = ULong

public typealias HBLUETOOTH_DEVICE_FIND = Long

public typealias HBLUETOOTH_RADIO_FIND = Long

public typealias IO_CAPABILITY = Int

public typealias NodeContainerType = Int

public fun interface PFNBLUETOOTH_GATT_EVENT_CALLBACKFn {
    public operator fun invoke(eventtype: BTH_LE_GATT_EVENT_TYPE, eventoutparameter: Long, context: Long)
}

public typealias PFNBLUETOOTH_GATT_EVENT_CALLBACK = PFNBLUETOOTH_GATT_EVENT_CALLBACKFn?

public fun interface PFN_AUTHENTICATION_CALLBACKFn {
    public operator fun invoke(pvparam: Long, pdevice: Long): BOOL
}

public typealias PFN_AUTHENTICATION_CALLBACK = PFN_AUTHENTICATION_CALLBACKFn?

public fun interface PFN_AUTHENTICATION_CALLBACK_EXFn {
    public operator fun invoke(pvparam: Long, pauthcallbackparams: Long): BOOL
}

public typealias PFN_AUTHENTICATION_CALLBACK_EX = PFN_AUTHENTICATION_CALLBACK_EXFn?

public fun interface PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACKFn {
    public operator fun invoke(uattribid: UInt, pvaluestream: Long, cbstreamsize: UInt, pvparam: Long): BOOL
}

public typealias PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK = PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACKFn?

public fun interface PFN_DEVICE_CALLBACKFn {
    public operator fun invoke(pvparam: Long, pdevice: Long): BOOL
}

public typealias PFN_DEVICE_CALLBACK = PFN_DEVICE_CALLBACKFn?

public typealias SDP_SPECIFICTYPE = Int

public typealias SDP_TYPE = Int
