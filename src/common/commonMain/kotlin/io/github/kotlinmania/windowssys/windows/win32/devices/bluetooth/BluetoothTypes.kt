package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public typealias HbluetoothDeviceFind = MutPtr<CVoid>

public typealias HbluetoothRadioFind = MutPtr<CVoid>

public typealias IoCapability = Int

public typealias NodeContainerType = Int

public fun interface PfnbluetoothGattEventCallbackFn {
    public operator fun invoke(eventtype: BthLeGattEventType, eventoutparameter: ConstPtr<CVoid>, context: ConstPtr<CVoid>)
}

public typealias PfnbluetoothGattEventCallback = PfnbluetoothGattEventCallbackFn?

public fun interface PfnAuthenticationCallbackFn {
    public operator fun invoke(pvparam: MutPtr<CVoid>, pdevice: MutPtr<BluetoothDeviceInfo>): Bool
}

public typealias PfnAuthenticationCallback = PfnAuthenticationCallbackFn?

public fun interface PfnAuthenticationCallbackExFn {
    public operator fun invoke(pvparam: ConstPtr<CVoid>, pauthcallbackparams: ConstPtr<BluetoothAuthenticationCallbackParams>): Bool
}

public typealias PfnAuthenticationCallbackEx = PfnAuthenticationCallbackExFn?

public fun interface PfnBluetoothEnumAttributesCallbackFn {
    public operator fun invoke(uattribid: UInt, pvaluestream: ConstPtr<UByte>, cbstreamsize: UInt, pvparam: ConstPtr<CVoid>): Bool
}

public typealias PfnBluetoothEnumAttributesCallback = PfnBluetoothEnumAttributesCallbackFn?

public fun interface PfnDeviceCallbackFn {
    public operator fun invoke(pvparam: MutPtr<CVoid>, pdevice: ConstPtr<BluetoothDeviceInfo>): Bool
}

public typealias PfnDeviceCallback = PfnDeviceCallbackFn?

public typealias SdpSpecifictype = Int

public typealias SdpType = Int
