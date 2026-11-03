@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ACPI_REAL_TIME(
    public var Year: UShort = 0u,
    public var Month: UByte = 0u,
    public var Day: UByte = 0u,
    public var Hour: UByte = 0u,
    public var Minute: UByte = 0u,
    public var Second: UByte = 0u,
    public var Valid: UByte = 0u,
    public var Milliseconds: UShort = 0u,
    public var TimeZone: Short = 0,
    public var DayLight: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ACPI_REAL_TIME) return false
        if (this.Year != other.Year) return false
        if (this.Month != other.Month) return false
        if (this.Day != other.Day) return false
        if (this.Hour != other.Hour) return false
        if (this.Minute != other.Minute) return false
        if (this.Second != other.Second) return false
        if (this.Valid != other.Valid) return false
        if (this.Milliseconds != other.Milliseconds) return false
        if (this.TimeZone != other.TimeZone) return false
        if (this.DayLight != other.DayLight) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Year.hashCode()
        result = 31 * result + this.Month.hashCode()
        result = 31 * result + this.Day.hashCode()
        result = 31 * result + this.Hour.hashCode()
        result = 31 * result + this.Minute.hashCode()
        result = 31 * result + this.Second.hashCode()
        result = 31 * result + this.Valid.hashCode()
        result = 31 * result + this.Milliseconds.hashCode()
        result = 31 * result + this.TimeZone.hashCode()
        result = 31 * result + this.DayLight.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class ACPI_TIME_AND_ALARM_CAPABILITIES(
    public var AcWakeSupported: Boolean = false,
    public var DcWakeSupported: Boolean = false,
    public var S4AcWakeSupported: Boolean = false,
    public var S4DcWakeSupported: Boolean = false,
    public var S5AcWakeSupported: Boolean = false,
    public var S5DcWakeSupported: Boolean = false,
    public var S4S5WakeStatusSupported: Boolean = false,
    public var DeepestWakeSystemState: UInt = 0u,
    public var RealTimeFeaturesSupported: Boolean = false,
    public var RealTimeResolution: ACPI_TIME_RESOLUTION = 0,
)

public data class ADMINISTRATOR_POWER_POLICY(
    public var MinSleep: SYSTEM_POWER_STATE = 0,
    public var MaxSleep: SYSTEM_POWER_STATE = 0,
    public var MinVideoTimeout: UInt = 0u,
    public var MaxVideoTimeout: UInt = 0u,
    public var MinSpindownTimeout: UInt = 0u,
    public var MaxSpindownTimeout: UInt = 0u,
)

public data class BATTERY_CHARGER_STATUS(public var Type: BATTERY_CHARGING_SOURCE_TYPE = 0, public var VaData: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BATTERY_CHARGER_STATUS) return false
        if (this.Type != other.Type) return false
        if (!this.VaData.contentEquals(other.VaData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.VaData.contentHashCode()
        return result
    }
}

public data class BATTERY_CHARGING_SOURCE(public var Type: BATTERY_CHARGING_SOURCE_TYPE = 0, public var MaxCurrent: UInt = 0u)

public data class BATTERY_CHARGING_SOURCE_INFORMATION(public var Type: BATTERY_CHARGING_SOURCE_TYPE = 0, public var SourceOnline: Boolean = false)

public data class BATTERY_INFORMATION(
    public var Capabilities: UInt = 0u,
    public var Technology: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var Chemistry: UByteArray = UByteArray(4),
    public var DesignedCapacity: UInt = 0u,
    public var FullChargedCapacity: UInt = 0u,
    public var DefaultAlert1: UInt = 0u,
    public var DefaultAlert2: UInt = 0u,
    public var CriticalBias: UInt = 0u,
    public var CycleCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BATTERY_INFORMATION) return false
        if (this.Capabilities != other.Capabilities) return false
        if (this.Technology != other.Technology) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.Chemistry.contentEquals(other.Chemistry)) return false
        if (this.DesignedCapacity != other.DesignedCapacity) return false
        if (this.FullChargedCapacity != other.FullChargedCapacity) return false
        if (this.DefaultAlert1 != other.DefaultAlert1) return false
        if (this.DefaultAlert2 != other.DefaultAlert2) return false
        if (this.CriticalBias != other.CriticalBias) return false
        if (this.CycleCount != other.CycleCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Capabilities.hashCode()
        result = 31 * result + this.Technology.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Chemistry.contentHashCode()
        result = 31 * result + this.DesignedCapacity.hashCode()
        result = 31 * result + this.FullChargedCapacity.hashCode()
        result = 31 * result + this.DefaultAlert1.hashCode()
        result = 31 * result + this.DefaultAlert2.hashCode()
        result = 31 * result + this.CriticalBias.hashCode()
        result = 31 * result + this.CycleCount.hashCode()
        return result
    }
}

public data class BATTERY_MANUFACTURE_DATE(
    public var Day: UByte = 0u,
    public var Month: UByte = 0u,
    public var Year: UShort = 0u,
)

public data class BATTERY_QUERY_INFORMATION(
    public var BatteryTag: UInt = 0u,
    public var InformationLevel: BATTERY_QUERY_INFORMATION_LEVEL = 0,
    public var AtRate: UInt = 0u,
)

public data class BATTERY_REPORTING_SCALE(public var Granularity: UInt = 0u, public var Capacity: UInt = 0u)

public data class BATTERY_SET_INFORMATION(
    public var BatteryTag: UInt = 0u,
    public var InformationLevel: BATTERY_SET_INFORMATION_LEVEL = 0,
    public var Buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BATTERY_SET_INFORMATION) return false
        if (this.BatteryTag != other.BatteryTag) return false
        if (this.InformationLevel != other.InformationLevel) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BatteryTag.hashCode()
        result = 31 * result + this.InformationLevel.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class BATTERY_STATUS(
    public var PowerState: UInt = 0u,
    public var Capacity: UInt = 0u,
    public var Voltage: UInt = 0u,
    public var Rate: Int = 0,
)

public data class BATTERY_USB_CHARGER_STATUS(
    public var Type: BATTERY_CHARGING_SOURCE_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var Flags: UInt = 0u,
    public var MaxCurrent: UInt = 0u,
    public var Voltage: UInt = 0u,
    public var PortType: USB_CHARGER_PORT = 0,
    public var PortId: ULong = 0uL,
    public var PowerSourceInformation: Long = 0L,
    public var OemCharger: GUID = GUID(),
)

public data class BATTERY_WAIT_STATUS(
    public var BatteryTag: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var PowerState: UInt = 0u,
    public var LowCapacity: UInt = 0u,
    public var HighCapacity: UInt = 0u,
)

public data class CM_POWER_DATA(
    public var PD_Size: UInt = 0u,
    public var PD_MostRecentPowerState: DEVICE_POWER_STATE = 0,
    public var PD_Capabilities: UInt = 0u,
    public var PD_D1Latency: UInt = 0u,
    public var PD_D2Latency: UInt = 0u,
    public var PD_D3Latency: UInt = 0u,
    public var PD_PowerStateMapping: IntArray = IntArray(7),
    public var PD_DeepestSystemWake: SYSTEM_POWER_STATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CM_POWER_DATA) return false
        if (this.PD_Size != other.PD_Size) return false
        if (this.PD_MostRecentPowerState != other.PD_MostRecentPowerState) return false
        if (this.PD_Capabilities != other.PD_Capabilities) return false
        if (this.PD_D1Latency != other.PD_D1Latency) return false
        if (this.PD_D2Latency != other.PD_D2Latency) return false
        if (this.PD_D3Latency != other.PD_D3Latency) return false
        if (!this.PD_PowerStateMapping.contentEquals(other.PD_PowerStateMapping)) return false
        if (this.PD_DeepestSystemWake != other.PD_DeepestSystemWake) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PD_Size.hashCode()
        result = 31 * result + this.PD_MostRecentPowerState.hashCode()
        result = 31 * result + this.PD_Capabilities.hashCode()
        result = 31 * result + this.PD_D1Latency.hashCode()
        result = 31 * result + this.PD_D2Latency.hashCode()
        result = 31 * result + this.PD_D3Latency.hashCode()
        result = 31 * result + this.PD_PowerStateMapping.contentHashCode()
        result = 31 * result + this.PD_DeepestSystemWake.hashCode()
        return result
    }
}

public data class DEVICE_NOTIFY_SUBSCRIBE_PARAMETERS(public var Callback: PDEVICE_NOTIFY_CALLBACK_ROUTINE = null, public var Context: Long = 0L)

public data class EMI_CHANNEL_MEASUREMENT_DATA(public var AbsoluteEnergy: ULong = 0uL, public var AbsoluteTime: ULong = 0uL)

public data class EMI_CHANNEL_V2(
    public var MeasurementUnit: EMI_MEASUREMENT_UNIT = 0,
    public var ChannelNameSize: UShort = 0u,
    public var ChannelName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMI_CHANNEL_V2) return false
        if (this.MeasurementUnit != other.MeasurementUnit) return false
        if (this.ChannelNameSize != other.ChannelNameSize) return false
        if (!this.ChannelName.contentEquals(other.ChannelName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MeasurementUnit.hashCode()
        result = 31 * result + this.ChannelNameSize.hashCode()
        result = 31 * result + this.ChannelName.contentHashCode()
        return result
    }
}

public data class EMI_MEASUREMENT_DATA_V2(public var ChannelData: List<EMI_CHANNEL_MEASUREMENT_DATA> = List(1) { EMI_CHANNEL_MEASUREMENT_DATA() })

public data class EMI_METADATA_SIZE(public var MetadataSize: UInt = 0u)

public data class EMI_METADATA_V1(
    public var MeasurementUnit: EMI_MEASUREMENT_UNIT = 0,
    public var HardwareOEM: UShortArray = UShortArray(16),
    public var HardwareModel: UShortArray = UShortArray(16),
    public var HardwareRevision: UShort = 0u,
    public var MeteredHardwareNameSize: UShort = 0u,
    public var MeteredHardwareName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMI_METADATA_V1) return false
        if (this.MeasurementUnit != other.MeasurementUnit) return false
        if (!this.HardwareOEM.contentEquals(other.HardwareOEM)) return false
        if (!this.HardwareModel.contentEquals(other.HardwareModel)) return false
        if (this.HardwareRevision != other.HardwareRevision) return false
        if (this.MeteredHardwareNameSize != other.MeteredHardwareNameSize) return false
        if (!this.MeteredHardwareName.contentEquals(other.MeteredHardwareName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MeasurementUnit.hashCode()
        result = 31 * result + this.HardwareOEM.contentHashCode()
        result = 31 * result + this.HardwareModel.contentHashCode()
        result = 31 * result + this.HardwareRevision.hashCode()
        result = 31 * result + this.MeteredHardwareNameSize.hashCode()
        result = 31 * result + this.MeteredHardwareName.contentHashCode()
        return result
    }
}

public data class EMI_METADATA_V2(
    public var HardwareOEM: UShortArray = UShortArray(16),
    public var HardwareModel: UShortArray = UShortArray(16),
    public var HardwareRevision: UShort = 0u,
    public var ChannelCount: UShort = 0u,
    public var Channels: List<EMI_CHANNEL_V2> = List(1) { EMI_CHANNEL_V2() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMI_METADATA_V2) return false
        if (!this.HardwareOEM.contentEquals(other.HardwareOEM)) return false
        if (!this.HardwareModel.contentEquals(other.HardwareModel)) return false
        if (this.HardwareRevision != other.HardwareRevision) return false
        if (this.ChannelCount != other.ChannelCount) return false
        if (this.Channels != other.Channels) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HardwareOEM.contentHashCode()
        result = 31 * result + this.HardwareModel.contentHashCode()
        result = 31 * result + this.HardwareRevision.hashCode()
        result = 31 * result + this.ChannelCount.hashCode()
        result = 31 * result + this.Channels.hashCode()
        return result
    }
}

public data class EMI_VERSION(public var EmiVersion: UShort = 0u)

public data class GLOBAL_MACHINE_POWER_POLICY(
    public var Revision: UInt = 0u,
    public var LidOpenWakeAc: SYSTEM_POWER_STATE = 0,
    public var LidOpenWakeDc: SYSTEM_POWER_STATE = 0,
    public var BroadcastCapacityResolution: UInt = 0u,
)

public data class GLOBAL_POWER_POLICY(public var user: GLOBAL_USER_POWER_POLICY = GLOBAL_USER_POWER_POLICY(), public var mach: GLOBAL_MACHINE_POWER_POLICY = GLOBAL_MACHINE_POWER_POLICY())

public data class GLOBAL_USER_POWER_POLICY(
    public var Revision: UInt = 0u,
    public var PowerButtonAc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var PowerButtonDc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var SleepButtonAc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var SleepButtonDc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var LidCloseAc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var LidCloseDc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var DischargePolicy: List<SYSTEM_POWER_LEVEL> = List(4) { SYSTEM_POWER_LEVEL() },
    public var GlobalFlags: UInt = 0u,
)

public data class MACHINE_POWER_POLICY(
    public var Revision: UInt = 0u,
    public var MinSleepAc: SYSTEM_POWER_STATE = 0,
    public var MinSleepDc: SYSTEM_POWER_STATE = 0,
    public var ReducedLatencySleepAc: SYSTEM_POWER_STATE = 0,
    public var ReducedLatencySleepDc: SYSTEM_POWER_STATE = 0,
    public var DozeTimeoutAc: UInt = 0u,
    public var DozeTimeoutDc: UInt = 0u,
    public var DozeS4TimeoutAc: UInt = 0u,
    public var DozeS4TimeoutDc: UInt = 0u,
    public var MinThrottleAc: UByte = 0u,
    public var MinThrottleDc: UByte = 0u,
    public var pad1: UByteArray = UByteArray(2),
    public var OverThrottledAc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var OverThrottledDc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MACHINE_POWER_POLICY) return false
        if (this.Revision != other.Revision) return false
        if (this.MinSleepAc != other.MinSleepAc) return false
        if (this.MinSleepDc != other.MinSleepDc) return false
        if (this.ReducedLatencySleepAc != other.ReducedLatencySleepAc) return false
        if (this.ReducedLatencySleepDc != other.ReducedLatencySleepDc) return false
        if (this.DozeTimeoutAc != other.DozeTimeoutAc) return false
        if (this.DozeTimeoutDc != other.DozeTimeoutDc) return false
        if (this.DozeS4TimeoutAc != other.DozeS4TimeoutAc) return false
        if (this.DozeS4TimeoutDc != other.DozeS4TimeoutDc) return false
        if (this.MinThrottleAc != other.MinThrottleAc) return false
        if (this.MinThrottleDc != other.MinThrottleDc) return false
        if (!this.pad1.contentEquals(other.pad1)) return false
        if (this.OverThrottledAc != other.OverThrottledAc) return false
        if (this.OverThrottledDc != other.OverThrottledDc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Revision.hashCode()
        result = 31 * result + this.MinSleepAc.hashCode()
        result = 31 * result + this.MinSleepDc.hashCode()
        result = 31 * result + this.ReducedLatencySleepAc.hashCode()
        result = 31 * result + this.ReducedLatencySleepDc.hashCode()
        result = 31 * result + this.DozeTimeoutAc.hashCode()
        result = 31 * result + this.DozeTimeoutDc.hashCode()
        result = 31 * result + this.DozeS4TimeoutAc.hashCode()
        result = 31 * result + this.DozeS4TimeoutDc.hashCode()
        result = 31 * result + this.MinThrottleAc.hashCode()
        result = 31 * result + this.MinThrottleDc.hashCode()
        result = 31 * result + this.pad1.contentHashCode()
        result = 31 * result + this.OverThrottledAc.hashCode()
        result = 31 * result + this.OverThrottledDc.hashCode()
        return result
    }
}

public data class MACHINE_PROCESSOR_POWER_POLICY(
    public var Revision: UInt = 0u,
    public var ProcessorPolicyAc: PROCESSOR_POWER_POLICY = PROCESSOR_POWER_POLICY(),
    public var ProcessorPolicyDc: PROCESSOR_POWER_POLICY = PROCESSOR_POWER_POLICY(),
)

public data class POWERBROADCAST_SETTING(
    public var PowerSetting: GUID = GUID(),
    public var DataLength: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is POWERBROADCAST_SETTING) return false
        if (this.PowerSetting != other.PowerSetting) return false
        if (this.DataLength != other.DataLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PowerSetting.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class POWER_ACTION_POLICY(
    public var Action: POWER_ACTION = 0,
    public var Flags: UInt = 0u,
    public var EventCode: POWER_ACTION_POLICY_EVENT_CODE = 0u,
)

public data class POWER_IDLE_RESILIENCY(public var CoalescingTimeout: UInt = 0u, public var IdleResiliencyPeriod: UInt = 0u)

public data class POWER_MONITOR_INVOCATION(public var Console: Boolean = false, public var RequestReason: POWER_MONITOR_REQUEST_REASON = 0)

public data class POWER_PLATFORM_INFORMATION(public var AoAc: Boolean = false)

public data class POWER_POLICY(public var user: USER_POWER_POLICY = USER_POWER_POLICY(), public var mach: MACHINE_POWER_POLICY = MACHINE_POWER_POLICY())

public data class POWER_SESSION_ALLOW_EXTERNAL_DMA_DEVICES(public var IsAllowed: Boolean = false)

public data class POWER_SESSION_CONNECT(public var Connected: Boolean = false, public var Console: Boolean = false)

public data class POWER_SESSION_RIT_STATE(public var Active: Boolean = false, public var LastInputTime: ULong = 0uL)

public data class POWER_SESSION_TIMEOUTS(public var InputTimeout: UInt = 0u, public var DisplayTimeout: UInt = 0u)

public data class POWER_SESSION_WINLOGON(
    public var SessionId: UInt = 0u,
    public var Console: Boolean = false,
    public var Locked: Boolean = false,
)

public data class POWER_USER_PRESENCE(public var UserPresence: POWER_USER_PRESENCE_TYPE = 0)

public data class PPM_IDLESTATE_EVENT(
    public var NewState: UInt = 0u,
    public var OldState: UInt = 0u,
    public var Processors: ULong = 0uL,
)

public data class PPM_IDLE_ACCOUNTING(
    public var StateCount: UInt = 0u,
    public var TotalTransitions: UInt = 0u,
    public var ResetCount: UInt = 0u,
    public var StartTime: ULong = 0uL,
    public var State: List<PPM_IDLE_STATE_ACCOUNTING> = List(1) { PPM_IDLE_STATE_ACCOUNTING() },
)

public data class PPM_IDLE_ACCOUNTING_EX(
    public var StateCount: UInt = 0u,
    public var TotalTransitions: UInt = 0u,
    public var ResetCount: UInt = 0u,
    public var AbortCount: UInt = 0u,
    public var StartTime: ULong = 0uL,
    public var State: List<PPM_IDLE_STATE_ACCOUNTING_EX> = List(1) { PPM_IDLE_STATE_ACCOUNTING_EX() },
)

public data class PPM_IDLE_STATE_ACCOUNTING(
    public var IdleTransitions: UInt = 0u,
    public var FailedTransitions: UInt = 0u,
    public var InvalidBucketIndex: UInt = 0u,
    public var TotalTime: ULong = 0uL,
    public var IdleTimeBuckets: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PPM_IDLE_STATE_ACCOUNTING) return false
        if (this.IdleTransitions != other.IdleTransitions) return false
        if (this.FailedTransitions != other.FailedTransitions) return false
        if (this.InvalidBucketIndex != other.InvalidBucketIndex) return false
        if (this.TotalTime != other.TotalTime) return false
        if (!this.IdleTimeBuckets.contentEquals(other.IdleTimeBuckets)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IdleTransitions.hashCode()
        result = 31 * result + this.FailedTransitions.hashCode()
        result = 31 * result + this.InvalidBucketIndex.hashCode()
        result = 31 * result + this.TotalTime.hashCode()
        result = 31 * result + this.IdleTimeBuckets.contentHashCode()
        return result
    }
}

public data class PPM_IDLE_STATE_ACCOUNTING_EX(
    public var TotalTime: ULong = 0uL,
    public var IdleTransitions: UInt = 0u,
    public var FailedTransitions: UInt = 0u,
    public var InvalidBucketIndex: UInt = 0u,
    public var MinTimeUs: UInt = 0u,
    public var MaxTimeUs: UInt = 0u,
    public var CancelledTransitions: UInt = 0u,
    public var IdleTimeBuckets: List<PPM_IDLE_STATE_BUCKET_EX> = List(16) { PPM_IDLE_STATE_BUCKET_EX() },
)

public data class PPM_IDLE_STATE_BUCKET_EX(
    public var TotalTimeUs: ULong = 0uL,
    public var MinTimeUs: UInt = 0u,
    public var MaxTimeUs: UInt = 0u,
    public var Count: UInt = 0u,
)

public data class PPM_PERFSTATE_DOMAIN_EVENT(
    public var State: UInt = 0u,
    public var Latency: UInt = 0u,
    public var Speed: UInt = 0u,
    public var Processors: ULong = 0uL,
)

public data class PPM_PERFSTATE_EVENT(
    public var State: UInt = 0u,
    public var Status: UInt = 0u,
    public var Latency: UInt = 0u,
    public var Speed: UInt = 0u,
    public var Processor: UInt = 0u,
)

public data class PPM_THERMALCHANGE_EVENT(public var ThermalConstraint: UInt = 0u, public var Processors: ULong = 0uL)

public data class PPM_THERMAL_POLICY_EVENT(public var Mode: UByte = 0u, public var Processors: ULong = 0uL)

public data class PPM_WMI_IDLE_STATE(
    public var Latency: UInt = 0u,
    public var Power: UInt = 0u,
    public var TimeCheck: UInt = 0u,
    public var PromotePercent: UByte = 0u,
    public var DemotePercent: UByte = 0u,
    public var StateType: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var StateFlags: UInt = 0u,
    public var Context: UInt = 0u,
    public var IdleHandler: UInt = 0u,
    public var Reserved1: UInt = 0u,
)

public data class PPM_WMI_IDLE_STATES(
    public var Type: UInt = 0u,
    public var Count: UInt = 0u,
    public var TargetState: UInt = 0u,
    public var OldState: UInt = 0u,
    public var TargetProcessors: ULong = 0uL,
    public var State: List<PPM_WMI_IDLE_STATE> = List(1) { PPM_WMI_IDLE_STATE() },
)

public data class PPM_WMI_IDLE_STATES_EX(
    public var Type: UInt = 0u,
    public var Count: UInt = 0u,
    public var TargetState: UInt = 0u,
    public var OldState: UInt = 0u,
    public var TargetProcessors: Long = 0L,
    public var State: List<PPM_WMI_IDLE_STATE> = List(1) { PPM_WMI_IDLE_STATE() },
)

public data class PPM_WMI_LEGACY_PERFSTATE(
    public var Frequency: UInt = 0u,
    public var Flags: UInt = 0u,
    public var PercentFrequency: UInt = 0u,
)

public data class PPM_WMI_PERF_STATE(
    public var Frequency: UInt = 0u,
    public var Power: UInt = 0u,
    public var PercentFrequency: UByte = 0u,
    public var IncreaseLevel: UByte = 0u,
    public var DecreaseLevel: UByte = 0u,
    public var Type: UByte = 0u,
    public var IncreaseTime: UInt = 0u,
    public var DecreaseTime: UInt = 0u,
    public var Control: ULong = 0uL,
    public var Status: ULong = 0uL,
    public var HitCount: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: ULong = 0uL,
    public var Reserved3: ULong = 0uL,
)

public class PPM_WMI_PERF_STATES(
    public var Count: UInt = 0u,
    public var MaxFrequency: UInt = 0u,
    public var CurrentState: UInt = 0u,
    public var MaxPerfState: UInt = 0u,
    public var MinPerfState: UInt = 0u,
    public var LowestPerfState: UInt = 0u,
    public var ThermalConstraint: UInt = 0u,
    public var BusyAdjThreshold: UByte = 0u,
    public var PolicyType: UByte = 0u,
    public var Type: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var TimerInterval: UInt = 0u,
    public var TargetProcessors: ULong = 0uL,
    public var PStateHandler: UInt = 0u,
    public var PStateContext: UInt = 0u,
    public var TStateHandler: UInt = 0u,
    public var TStateContext: UInt = 0u,
    public var FeedbackHandler: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: ULong = 0uL,
    public var State: List<PPM_WMI_PERF_STATE> = List(1) { PPM_WMI_PERF_STATE() },
)

public class PPM_WMI_PERF_STATES_EX(
    public var Count: UInt = 0u,
    public var MaxFrequency: UInt = 0u,
    public var CurrentState: UInt = 0u,
    public var MaxPerfState: UInt = 0u,
    public var MinPerfState: UInt = 0u,
    public var LowestPerfState: UInt = 0u,
    public var ThermalConstraint: UInt = 0u,
    public var BusyAdjThreshold: UByte = 0u,
    public var PolicyType: UByte = 0u,
    public var Type: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var TimerInterval: UInt = 0u,
    public var TargetProcessors: Long = 0L,
    public var PStateHandler: UInt = 0u,
    public var PStateContext: UInt = 0u,
    public var TStateHandler: UInt = 0u,
    public var TStateContext: UInt = 0u,
    public var FeedbackHandler: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: ULong = 0uL,
    public var State: List<PPM_WMI_PERF_STATE> = List(1) { PPM_WMI_PERF_STATE() },
)

public data class PROCESSOR_OBJECT_INFO(
    public var PhysicalID: UInt = 0u,
    public var PBlkAddress: UInt = 0u,
    public var PBlkLength: UByte = 0u,
)

public data class PROCESSOR_OBJECT_INFO_EX(
    public var PhysicalID: UInt = 0u,
    public var PBlkAddress: UInt = 0u,
    public var PBlkLength: UByte = 0u,
    public var InitialApicId: UInt = 0u,
)

public data class PROCESSOR_POWER_INFORMATION(
    public var Number: UInt = 0u,
    public var MaxMhz: UInt = 0u,
    public var CurrentMhz: UInt = 0u,
    public var MhzLimit: UInt = 0u,
    public var MaxIdleState: UInt = 0u,
    public var CurrentIdleState: UInt = 0u,
)

public data class PROCESSOR_POWER_POLICY(
    public var Revision: UInt = 0u,
    public var DynamicThrottle: UByte = 0u,
    public var Spare: UByteArray = UByteArray(3),
    public var _bitfield: UInt = 0u,
    public var PolicyCount: UInt = 0u,
    public var Policy: List<PROCESSOR_POWER_POLICY_INFO> = List(3) { PROCESSOR_POWER_POLICY_INFO() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESSOR_POWER_POLICY) return false
        if (this.Revision != other.Revision) return false
        if (this.DynamicThrottle != other.DynamicThrottle) return false
        if (!this.Spare.contentEquals(other.Spare)) return false
        if (this._bitfield != other._bitfield) return false
        if (this.PolicyCount != other.PolicyCount) return false
        if (this.Policy != other.Policy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Revision.hashCode()
        result = 31 * result + this.DynamicThrottle.hashCode()
        result = 31 * result + this.Spare.contentHashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.PolicyCount.hashCode()
        result = 31 * result + this.Policy.hashCode()
        return result
    }
}

public data class PROCESSOR_POWER_POLICY_INFO(
    public var TimeCheck: UInt = 0u,
    public var DemoteLimit: UInt = 0u,
    public var PromoteLimit: UInt = 0u,
    public var DemotePercent: UByte = 0u,
    public var PromotePercent: UByte = 0u,
    public var Spare: UByteArray = UByteArray(2),
    public var _bitfield: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESSOR_POWER_POLICY_INFO) return false
        if (this.TimeCheck != other.TimeCheck) return false
        if (this.DemoteLimit != other.DemoteLimit) return false
        if (this.PromoteLimit != other.PromoteLimit) return false
        if (this.DemotePercent != other.DemotePercent) return false
        if (this.PromotePercent != other.PromotePercent) return false
        if (!this.Spare.contentEquals(other.Spare)) return false
        if (this._bitfield != other._bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TimeCheck.hashCode()
        result = 31 * result + this.DemoteLimit.hashCode()
        result = 31 * result + this.PromoteLimit.hashCode()
        result = 31 * result + this.DemotePercent.hashCode()
        result = 31 * result + this.PromotePercent.hashCode()
        result = 31 * result + this.Spare.contentHashCode()
        result = 31 * result + this._bitfield.hashCode()
        return result
    }
}

public data class RESUME_PERFORMANCE(
    public var PostTimeMs: UInt = 0u,
    public var TotalResumeTimeMs: ULong = 0uL,
    public var ResumeCompleteTimestamp: ULong = 0uL,
)

public data class SET_POWER_SETTING_VALUE(
    public var Version: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var PowerCondition: SYSTEM_POWER_CONDITION = 0,
    public var DataLength: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SET_POWER_SETTING_VALUE) return false
        if (this.Version != other.Version) return false
        if (this.Guid != other.Guid) return false
        if (this.PowerCondition != other.PowerCondition) return false
        if (this.DataLength != other.DataLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Guid.hashCode()
        result = 31 * result + this.PowerCondition.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class SYSTEM_BATTERY_STATE(
    public var AcOnLine: Boolean = false,
    public var BatteryPresent: Boolean = false,
    public var Charging: Boolean = false,
    public var Discharging: Boolean = false,
    public var Spare1: BooleanArray = BooleanArray(3),
    public var Tag: UByte = 0u,
    public var MaxCapacity: UInt = 0u,
    public var RemainingCapacity: UInt = 0u,
    public var Rate: UInt = 0u,
    public var EstimatedTime: UInt = 0u,
    public var DefaultAlert1: UInt = 0u,
    public var DefaultAlert2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_BATTERY_STATE) return false
        if (this.AcOnLine != other.AcOnLine) return false
        if (this.BatteryPresent != other.BatteryPresent) return false
        if (this.Charging != other.Charging) return false
        if (this.Discharging != other.Discharging) return false
        if (!this.Spare1.contentEquals(other.Spare1)) return false
        if (this.Tag != other.Tag) return false
        if (this.MaxCapacity != other.MaxCapacity) return false
        if (this.RemainingCapacity != other.RemainingCapacity) return false
        if (this.Rate != other.Rate) return false
        if (this.EstimatedTime != other.EstimatedTime) return false
        if (this.DefaultAlert1 != other.DefaultAlert1) return false
        if (this.DefaultAlert2 != other.DefaultAlert2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AcOnLine.hashCode()
        result = 31 * result + this.BatteryPresent.hashCode()
        result = 31 * result + this.Charging.hashCode()
        result = 31 * result + this.Discharging.hashCode()
        result = 31 * result + this.Spare1.contentHashCode()
        result = 31 * result + this.Tag.hashCode()
        result = 31 * result + this.MaxCapacity.hashCode()
        result = 31 * result + this.RemainingCapacity.hashCode()
        result = 31 * result + this.Rate.hashCode()
        result = 31 * result + this.EstimatedTime.hashCode()
        result = 31 * result + this.DefaultAlert1.hashCode()
        result = 31 * result + this.DefaultAlert2.hashCode()
        return result
    }
}

public class SYSTEM_POWER_CAPABILITIES(
    public var PowerButtonPresent: Boolean = false,
    public var SleepButtonPresent: Boolean = false,
    public var LidPresent: Boolean = false,
    public var SystemS1: Boolean = false,
    public var SystemS2: Boolean = false,
    public var SystemS3: Boolean = false,
    public var SystemS4: Boolean = false,
    public var SystemS5: Boolean = false,
    public var HiberFilePresent: Boolean = false,
    public var FullWake: Boolean = false,
    public var VideoDimPresent: Boolean = false,
    public var ApmPresent: Boolean = false,
    public var UpsPresent: Boolean = false,
    public var ThermalControl: Boolean = false,
    public var ProcessorThrottle: Boolean = false,
    public var ProcessorMinThrottle: UByte = 0u,
    public var ProcessorMaxThrottle: UByte = 0u,
    public var FastSystemS4: Boolean = false,
    public var Hiberboot: Boolean = false,
    public var WakeAlarmPresent: Boolean = false,
    public var AoAc: Boolean = false,
    public var DiskSpinDown: Boolean = false,
    public var HiberFileType: UByte = 0u,
    public var AoAcConnectivitySupported: Boolean = false,
    public var spare3: UByteArray = UByteArray(6),
    public var SystemBatteriesPresent: Boolean = false,
    public var BatteriesAreShortTerm: Boolean = false,
    public var BatteryScale: List<BATTERY_REPORTING_SCALE> = List(3) { BATTERY_REPORTING_SCALE() },
    public var AcOnLineWake: SYSTEM_POWER_STATE = 0,
    public var SoftLidWake: SYSTEM_POWER_STATE = 0,
    public var RtcWake: SYSTEM_POWER_STATE = 0,
    public var MinDeviceWakeState: SYSTEM_POWER_STATE = 0,
    public var DefaultLowLatencyWake: SYSTEM_POWER_STATE = 0,
)

public data class SYSTEM_POWER_INFORMATION(
    public var MaxIdlenessAllowed: UInt = 0u,
    public var Idleness: UInt = 0u,
    public var TimeRemaining: UInt = 0u,
    public var CoolingMode: POWER_COOLING_MODE = 0u,
)

public data class SYSTEM_POWER_LEVEL(
    public var Enable: Boolean = false,
    public var Spare: UByteArray = UByteArray(3),
    public var BatteryLevel: UInt = 0u,
    public var PowerPolicy: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var MinSystemState: SYSTEM_POWER_STATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_POWER_LEVEL) return false
        if (this.Enable != other.Enable) return false
        if (!this.Spare.contentEquals(other.Spare)) return false
        if (this.BatteryLevel != other.BatteryLevel) return false
        if (this.PowerPolicy != other.PowerPolicy) return false
        if (this.MinSystemState != other.MinSystemState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Enable.hashCode()
        result = 31 * result + this.Spare.contentHashCode()
        result = 31 * result + this.BatteryLevel.hashCode()
        result = 31 * result + this.PowerPolicy.hashCode()
        result = 31 * result + this.MinSystemState.hashCode()
        return result
    }
}

public class SYSTEM_POWER_POLICY(
    public var Revision: UInt = 0u,
    public var PowerButton: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var SleepButton: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var LidClose: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var LidOpenWake: SYSTEM_POWER_STATE = 0,
    public var Reserved: UInt = 0u,
    public var Idle: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var IdleTimeout: UInt = 0u,
    public var IdleSensitivity: UByte = 0u,
    public var DynamicThrottle: UByte = 0u,
    public var Spare2: UByteArray = UByteArray(2),
    public var MinSleep: SYSTEM_POWER_STATE = 0,
    public var MaxSleep: SYSTEM_POWER_STATE = 0,
    public var ReducedLatencySleep: SYSTEM_POWER_STATE = 0,
    public var WinLogonFlags: UInt = 0u,
    public var Spare3: UInt = 0u,
    public var DozeS4Timeout: UInt = 0u,
    public var BroadcastCapacityResolution: UInt = 0u,
    public var DischargePolicy: List<SYSTEM_POWER_LEVEL> = List(4) { SYSTEM_POWER_LEVEL() },
    public var VideoTimeout: UInt = 0u,
    public var VideoDimDisplay: Boolean = false,
    public var VideoReserved: UIntArray = UIntArray(3),
    public var SpindownTimeout: UInt = 0u,
    public var OptimizeForPower: Boolean = false,
    public var FanThrottleTolerance: UByte = 0u,
    public var ForcedThrottle: UByte = 0u,
    public var MinThrottle: UByte = 0u,
    public var OverThrottled: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
)

public data class SYSTEM_POWER_STATUS(
    public var ACLineStatus: UByte = 0u,
    public var BatteryFlag: UByte = 0u,
    public var BatteryLifePercent: UByte = 0u,
    public var SystemStatusFlag: UByte = 0u,
    public var BatteryLifeTime: UInt = 0u,
    public var BatteryFullLifeTime: UInt = 0u,
)

public data class THERMAL_EVENT(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Type: UInt = 0u,
    public var Temperature: UInt = 0u,
    public var TripPointTemperature: UInt = 0u,
    public var Initiator: PWSTR = 0L,
)

public data class THERMAL_INFORMATION(
    public var ThermalStamp: UInt = 0u,
    public var ThermalConstant1: UInt = 0u,
    public var ThermalConstant2: UInt = 0u,
    public var Processors: ULong = 0uL,
    public var SamplingPeriod: UInt = 0u,
    public var CurrentTemperature: UInt = 0u,
    public var PassiveTripPoint: UInt = 0u,
    public var CriticalTripPoint: UInt = 0u,
    public var ActiveTripPointCount: UByte = 0u,
    public var ActiveTripPoint: UIntArray = UIntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is THERMAL_INFORMATION) return false
        if (this.ThermalStamp != other.ThermalStamp) return false
        if (this.ThermalConstant1 != other.ThermalConstant1) return false
        if (this.ThermalConstant2 != other.ThermalConstant2) return false
        if (this.Processors != other.Processors) return false
        if (this.SamplingPeriod != other.SamplingPeriod) return false
        if (this.CurrentTemperature != other.CurrentTemperature) return false
        if (this.PassiveTripPoint != other.PassiveTripPoint) return false
        if (this.CriticalTripPoint != other.CriticalTripPoint) return false
        if (this.ActiveTripPointCount != other.ActiveTripPointCount) return false
        if (!this.ActiveTripPoint.contentEquals(other.ActiveTripPoint)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ThermalStamp.hashCode()
        result = 31 * result + this.ThermalConstant1.hashCode()
        result = 31 * result + this.ThermalConstant2.hashCode()
        result = 31 * result + this.Processors.hashCode()
        result = 31 * result + this.SamplingPeriod.hashCode()
        result = 31 * result + this.CurrentTemperature.hashCode()
        result = 31 * result + this.PassiveTripPoint.hashCode()
        result = 31 * result + this.CriticalTripPoint.hashCode()
        result = 31 * result + this.ActiveTripPointCount.hashCode()
        result = 31 * result + this.ActiveTripPoint.contentHashCode()
        return result
    }
}

public data class THERMAL_POLICY(
    public var Version: UInt = 0u,
    public var WaitForUpdate: Boolean = false,
    public var Hibernate: Boolean = false,
    public var Critical: Boolean = false,
    public var ThermalStandby: Boolean = false,
    public var ActivationReasons: UInt = 0u,
    public var PassiveLimit: UInt = 0u,
    public var ActiveLevel: UInt = 0u,
    public var OverThrottled: Boolean = false,
)

public data class THERMAL_WAIT_READ(
    public var Timeout: UInt = 0u,
    public var LowTemperature: UInt = 0u,
    public var HighTemperature: UInt = 0u,
)

public class USER_POWER_POLICY(
    public var Revision: UInt = 0u,
    public var IdleAc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var IdleDc: POWER_ACTION_POLICY = POWER_ACTION_POLICY(),
    public var IdleTimeoutAc: UInt = 0u,
    public var IdleTimeoutDc: UInt = 0u,
    public var IdleSensitivityAc: UByte = 0u,
    public var IdleSensitivityDc: UByte = 0u,
    public var ThrottlePolicyAc: UByte = 0u,
    public var ThrottlePolicyDc: UByte = 0u,
    public var MaxSleepAc: SYSTEM_POWER_STATE = 0,
    public var MaxSleepDc: SYSTEM_POWER_STATE = 0,
    public var Reserved: UIntArray = UIntArray(2),
    public var VideoTimeoutAc: UInt = 0u,
    public var VideoTimeoutDc: UInt = 0u,
    public var SpindownTimeoutAc: UInt = 0u,
    public var SpindownTimeoutDc: UInt = 0u,
    public var OptimizeForPowerAc: Boolean = false,
    public var OptimizeForPowerDc: Boolean = false,
    public var FanThrottleToleranceAc: UByte = 0u,
    public var FanThrottleToleranceDc: UByte = 0u,
    public var ForcedThrottleAc: UByte = 0u,
    public var ForcedThrottleDc: UByte = 0u,
)

public data class WAKE_ALARM_INFORMATION(public var TimerIdentifier: UInt = 0u, public var Timeout: UInt = 0u)
