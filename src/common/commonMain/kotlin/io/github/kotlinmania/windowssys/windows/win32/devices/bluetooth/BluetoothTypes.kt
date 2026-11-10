package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public typealias AuthenticationRequirements = Int

public typealias BluetoothAuthenticationMethod = Int

public typealias BluetoothAuthenticationRequirements = Int

public typealias BluetoothIoCapability = Int

public typealias BthLeGattDescriptorType = Int

public typealias BthLeGattEventType = Int

public typealias HandleSdpType = ULong

public typealias HbluetoothDeviceFind = COpaquePointer?

public typealias HbluetoothRadioFind = COpaquePointer?

public typealias IoCapability = Int

public typealias NodeContainerType = Int

public fun interface PfnbluetoothGattEventCallbackFn {
    public operator fun invoke(eventtype: BthLeGattEventType, eventoutparameter: COpaquePointer?, context: COpaquePointer?)
}

public typealias PfnbluetoothGattEventCallback = PfnbluetoothGattEventCallbackFn?

public fun interface PfnAuthenticationCallbackFn {
    public operator fun invoke(pvparam: COpaquePointer?, pdevice: COpaquePointer?): Bool
}

public typealias PfnAuthenticationCallback = PfnAuthenticationCallbackFn?

public fun interface PfnAuthenticationCallbackExFn {
    public operator fun invoke(pvparam: COpaquePointer?, pauthcallbackparams: COpaquePointer?): Bool
}

public typealias PfnAuthenticationCallbackEx = PfnAuthenticationCallbackExFn?

public fun interface PfnBluetoothEnumAttributesCallbackFn {
    public operator fun invoke(uattribid: UInt, pvaluestream: COpaquePointer?, cbstreamsize: UInt, pvparam: COpaquePointer?): Bool
}

public typealias PfnBluetoothEnumAttributesCallback = PfnBluetoothEnumAttributesCallbackFn?

public fun interface PfnDeviceCallbackFn {
    public operator fun invoke(pvparam: COpaquePointer?, pdevice: COpaquePointer?): Bool
}

public typealias PfnDeviceCallback = PfnDeviceCallbackFn?

public typealias SdpSpecifictype = Int

public typealias SdpType = Int
