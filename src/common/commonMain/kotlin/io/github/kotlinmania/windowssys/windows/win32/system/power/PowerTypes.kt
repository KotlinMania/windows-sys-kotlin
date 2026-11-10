package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

public typealias AcpiTimeResolution = Int

public typealias BatteryChargingSourceType = Int

public typealias BatteryQueryInformationLevel = Int

public typealias BatterySetInformationLevel = Int

public typealias DevicePowerCapabilities = UInt

public typealias DevicePowerState = Int

public typealias EffectivePowerMode = Int

public fun interface EffectivePowerModeCallbackFn {
    public operator fun invoke(mode: EffectivePowerMode, context: COpaquePointer?)
}

public typealias EffectivePowerModeCallback = EffectivePowerModeCallbackFn?

public typealias EmiMeasurementUnit = Int

public typealias ExecutionState = UInt

public typealias Hpowernotify = Long

public typealias LatencyTime = Int

public fun interface PdeviceNotifyCallbackRoutineFn {
    public operator fun invoke(context: COpaquePointer?, type: UInt, setting: COpaquePointer?): UInt
}

public typealias PdeviceNotifyCallbackRoutine = PdeviceNotifyCallbackRoutineFn?

public typealias PowerAction = Int

public typealias PowerActionPolicyEventCode = UInt

public typealias PowerCoolingMode = UShort

public typealias PowerDataAccessor = Int

public typealias PowerInformationLevel = Int

public typealias PowerMonitorRequestReason = Int

public typealias PowerMonitorRequestType = Int

public typealias PowerPlatformRole = Int

public typealias PowerPlatformRoleVersion = UInt

public typealias PowerRequestType = Int

public typealias PowerSettingAltitude = Int

public typealias PowerUserPresenceType = Int

public fun interface PwrschemesenumprocFn {
    public operator fun invoke(index: UInt, namesize: UInt, name: Pcwstr, descriptionsize: UInt, description: Pcwstr, policy: COpaquePointer?, context: Lparam): Boolean
}

public typealias Pwrschemesenumproc = PwrschemesenumprocFn?

public fun interface PwrschemesenumprocV1Fn {
    public operator fun invoke(index: UInt, namesize: UInt, name: COpaquePointer?, descriptionsize: UInt, description: COpaquePointer?, policy: COpaquePointer?, context: Lparam): Boolean
}

public typealias PwrschemesenumprocV1 = PwrschemesenumprocV1Fn?

public typealias SystemPowerCondition = Int

public typealias SystemPowerState = Int

public typealias UsbChargerPort = Int

public typealias UserActivityPresence = Int
