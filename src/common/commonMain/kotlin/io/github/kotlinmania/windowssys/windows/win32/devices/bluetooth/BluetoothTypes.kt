package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public typealias AuthenticationRequirements = Int

public typealias BluetoothAuthenticationMethod = Int

public typealias BluetoothAuthenticationRequirements = Int

public typealias BluetoothIoCapability = Int

public typealias BthLeGattDescriptorType = Int

public typealias BthLeGattEventType = Int

public typealias HandleSdpType = ULong

public typealias HbluetoothDeviceFind = MutPtr

public typealias HbluetoothRadioFind = MutPtr

public typealias IoCapability = Int

public typealias NodeContainerType = Int

public fun interface PfnbluetoothGattEventCallbackFn {
    public operator fun invoke(eventtype: BthLeGattEventType, eventoutparameter: ConstPtr, context: ConstPtr)
}

public typealias PfnbluetoothGattEventCallback = PfnbluetoothGattEventCallbackFn?

public fun interface PfnAuthenticationCallbackFn {
    public operator fun invoke(pvparam: MutPtr, pdevice: MutPtr): Bool
}

public typealias PfnAuthenticationCallback = PfnAuthenticationCallbackFn?

public fun interface PfnAuthenticationCallbackExFn {
    public operator fun invoke(pvparam: ConstPtr, pauthcallbackparams: ConstPtr): Bool
}

public typealias PfnAuthenticationCallbackEx = PfnAuthenticationCallbackExFn?

public fun interface PfnBluetoothEnumAttributesCallbackFn {
    public operator fun invoke(uattribid: UInt, pvaluestream: ConstPtr, cbstreamsize: UInt, pvparam: ConstPtr): Bool
}

public typealias PfnBluetoothEnumAttributesCallback = PfnBluetoothEnumAttributesCallbackFn?

public fun interface PfnDeviceCallbackFn {
    public operator fun invoke(pvparam: MutPtr, pdevice: ConstPtr): Bool
}

public typealias PfnDeviceCallback = PfnDeviceCallbackFn?

public typealias SdpSpecifictype = Int

public typealias SdpType = Int
