@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr

public data class AcpiRealTime(
    public var year: UShort = 0u,
    public var month: UByte = 0u,
    public var day: UByte = 0u,
    public var hour: UByte = 0u,
    public var minute: UByte = 0u,
    public var second: UByte = 0u,
    public var valid: UByte = 0u,
    public var milliseconds: UShort = 0u,
    public var timeZone: Short = 0,
    public var dayLight: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcpiRealTime) return false
        if (this.year != other.year) return false
        if (this.month != other.month) return false
        if (this.day != other.day) return false
        if (this.hour != other.hour) return false
        if (this.minute != other.minute) return false
        if (this.second != other.second) return false
        if (this.valid != other.valid) return false
        if (this.milliseconds != other.milliseconds) return false
        if (this.timeZone != other.timeZone) return false
        if (this.dayLight != other.dayLight) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.year.hashCode()
        result = 31 * result + this.month.hashCode()
        result = 31 * result + this.day.hashCode()
        result = 31 * result + this.hour.hashCode()
        result = 31 * result + this.minute.hashCode()
        result = 31 * result + this.second.hashCode()
        result = 31 * result + this.valid.hashCode()
        result = 31 * result + this.milliseconds.hashCode()
        result = 31 * result + this.timeZone.hashCode()
        result = 31 * result + this.dayLight.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class AcpiTimeAndAlarmCapabilities(
    public var acWakeSupported: Boolean = false,
    public var dcWakeSupported: Boolean = false,
    public var s4AcWakeSupported: Boolean = false,
    public var s4DcWakeSupported: Boolean = false,
    public var s5AcWakeSupported: Boolean = false,
    public var s5DcWakeSupported: Boolean = false,
    public var s4S5WakeStatusSupported: Boolean = false,
    public var deepestWakeSystemState: UInt = 0u,
    public var realTimeFeaturesSupported: Boolean = false,
    public var realTimeResolution: AcpiTimeResolution = 0,
)

public data class AdministratorPowerPolicy(
    public var minSleep: SystemPowerState = 0,
    public var maxSleep: SystemPowerState = 0,
    public var minVideoTimeout: UInt = 0u,
    public var maxVideoTimeout: UInt = 0u,
    public var minSpindownTimeout: UInt = 0u,
    public var maxSpindownTimeout: UInt = 0u,
)

public data class BatteryChargerStatus(
    public var type: BatteryChargingSourceType = 0,
    public var vaData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BatteryChargerStatus) return false
        if (this.type != other.type) return false
        if (!this.vaData.contentEquals(other.vaData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.vaData.contentHashCode()
        return result
    }
}

public data class BatteryChargingSource(
    public var type: BatteryChargingSourceType = 0,
    public var maxCurrent: UInt = 0u,
)

public data class BatteryChargingSourceInformation(
    public var type: BatteryChargingSourceType = 0,
    public var sourceOnline: Boolean = false,
)

public data class BatteryInformation(
    public var capabilities: UInt = 0u,
    public var technology: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var chemistry: UByteArray = UByteArray(4),
    public var designedCapacity: UInt = 0u,
    public var fullChargedCapacity: UInt = 0u,
    public var defaultAlert1: UInt = 0u,
    public var defaultAlert2: UInt = 0u,
    public var criticalBias: UInt = 0u,
    public var cycleCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BatteryInformation) return false
        if (this.capabilities != other.capabilities) return false
        if (this.technology != other.technology) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.chemistry.contentEquals(other.chemistry)) return false
        if (this.designedCapacity != other.designedCapacity) return false
        if (this.fullChargedCapacity != other.fullChargedCapacity) return false
        if (this.defaultAlert1 != other.defaultAlert1) return false
        if (this.defaultAlert2 != other.defaultAlert2) return false
        if (this.criticalBias != other.criticalBias) return false
        if (this.cycleCount != other.cycleCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.technology.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.chemistry.contentHashCode()
        result = 31 * result + this.designedCapacity.hashCode()
        result = 31 * result + this.fullChargedCapacity.hashCode()
        result = 31 * result + this.defaultAlert1.hashCode()
        result = 31 * result + this.defaultAlert2.hashCode()
        result = 31 * result + this.criticalBias.hashCode()
        result = 31 * result + this.cycleCount.hashCode()
        return result
    }
}

public data class BatteryManufactureDate(
    public var day: UByte = 0u,
    public var month: UByte = 0u,
    public var year: UShort = 0u,
)

public data class BatteryQueryInformation(
    public var batteryTag: UInt = 0u,
    public var informationLevel: BatteryQueryInformationLevel = 0,
    public var atRate: UInt = 0u,
)

public data class BatteryReportingScale(
    public var granularity: UInt = 0u,
    public var capacity: UInt = 0u,
)

public data class BatterySetInformation(
    public var batteryTag: UInt = 0u,
    public var informationLevel: BatterySetInformationLevel = 0,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BatterySetInformation) return false
        if (this.batteryTag != other.batteryTag) return false
        if (this.informationLevel != other.informationLevel) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.batteryTag.hashCode()
        result = 31 * result + this.informationLevel.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class BatteryStatus(
    public var powerState: UInt = 0u,
    public var capacity: UInt = 0u,
    public var voltage: UInt = 0u,
    public var rate: Int = 0,
)

public data class BatteryUsbChargerStatus(
    public var type: BatteryChargingSourceType = 0,
    public var reserved: UInt = 0u,
    public var flags: UInt = 0u,
    public var maxCurrent: UInt = 0u,
    public var voltage: UInt = 0u,
    public var portType: UsbChargerPort = 0,
    public var portId: ULong = 0uL,
    public var powerSourceInformation: COpaquePointer? = null,
    public var oemCharger: Guid = Guid(),
)

public data class BatteryWaitStatus(
    public var batteryTag: UInt = 0u,
    public var timeout: UInt = 0u,
    public var powerState: UInt = 0u,
    public var lowCapacity: UInt = 0u,
    public var highCapacity: UInt = 0u,
)

public data class CmPowerData(
    public var pdSize: UInt = 0u,
    public var pdMostRecentPowerState: DevicePowerState = 0,
    public var pdCapabilities: UInt = 0u,
    public var pdD1Latency: UInt = 0u,
    public var pdD2Latency: UInt = 0u,
    public var pdD3Latency: UInt = 0u,
    public var pdPowerStateMapping: IntArray = IntArray(7),
    public var pdDeepestSystemWake: SystemPowerState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPowerData) return false
        if (this.pdSize != other.pdSize) return false
        if (this.pdMostRecentPowerState != other.pdMostRecentPowerState) return false
        if (this.pdCapabilities != other.pdCapabilities) return false
        if (this.pdD1Latency != other.pdD1Latency) return false
        if (this.pdD2Latency != other.pdD2Latency) return false
        if (this.pdD3Latency != other.pdD3Latency) return false
        if (!this.pdPowerStateMapping.contentEquals(other.pdPowerStateMapping)) return false
        if (this.pdDeepestSystemWake != other.pdDeepestSystemWake) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pdSize.hashCode()
        result = 31 * result + this.pdMostRecentPowerState.hashCode()
        result = 31 * result + this.pdCapabilities.hashCode()
        result = 31 * result + this.pdD1Latency.hashCode()
        result = 31 * result + this.pdD2Latency.hashCode()
        result = 31 * result + this.pdD3Latency.hashCode()
        result = 31 * result + this.pdPowerStateMapping.contentHashCode()
        result = 31 * result + this.pdDeepestSystemWake.hashCode()
        return result
    }
}

public data class DeviceNotifySubscribeParameters(
    public var callback: PdeviceNotifyCallbackRoutine = null,
    public var context: COpaquePointer? = null,
)

public data class EmiChannelMeasurementData(
    public var absoluteEnergy: ULong = 0uL,
    public var absoluteTime: ULong = 0uL,
)

public data class EmiChannelV2(
    public var measurementUnit: EmiMeasurementUnit = 0,
    public var channelNameSize: UShort = 0u,
    public var channelName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EmiChannelV2) return false
        if (this.measurementUnit != other.measurementUnit) return false
        if (this.channelNameSize != other.channelNameSize) return false
        if (!this.channelName.contentEquals(other.channelName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.measurementUnit.hashCode()
        result = 31 * result + this.channelNameSize.hashCode()
        result = 31 * result + this.channelName.contentHashCode()
        return result
    }
}

public data class EmiMeasurementDataV2(
    public var channelData: List<EmiChannelMeasurementData> = List(1) { EmiChannelMeasurementData() },
)

public data class EmiMetadataSize(
    public var metadataSize: UInt = 0u,
)

public data class EmiMetadataV1(
    public var measurementUnit: EmiMeasurementUnit = 0,
    public var hardwareOEM: UShortArray = UShortArray(16),
    public var hardwareModel: UShortArray = UShortArray(16),
    public var hardwareRevision: UShort = 0u,
    public var meteredHardwareNameSize: UShort = 0u,
    public var meteredHardwareName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EmiMetadataV1) return false
        if (this.measurementUnit != other.measurementUnit) return false
        if (!this.hardwareOEM.contentEquals(other.hardwareOEM)) return false
        if (!this.hardwareModel.contentEquals(other.hardwareModel)) return false
        if (this.hardwareRevision != other.hardwareRevision) return false
        if (this.meteredHardwareNameSize != other.meteredHardwareNameSize) return false
        if (!this.meteredHardwareName.contentEquals(other.meteredHardwareName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.measurementUnit.hashCode()
        result = 31 * result + this.hardwareOEM.contentHashCode()
        result = 31 * result + this.hardwareModel.contentHashCode()
        result = 31 * result + this.hardwareRevision.hashCode()
        result = 31 * result + this.meteredHardwareNameSize.hashCode()
        result = 31 * result + this.meteredHardwareName.contentHashCode()
        return result
    }
}

public data class EmiMetadataV2(
    public var hardwareOEM: UShortArray = UShortArray(16),
    public var hardwareModel: UShortArray = UShortArray(16),
    public var hardwareRevision: UShort = 0u,
    public var channelCount: UShort = 0u,
    public var channels: List<EmiChannelV2> = List(1) { EmiChannelV2() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EmiMetadataV2) return false
        if (!this.hardwareOEM.contentEquals(other.hardwareOEM)) return false
        if (!this.hardwareModel.contentEquals(other.hardwareModel)) return false
        if (this.hardwareRevision != other.hardwareRevision) return false
        if (this.channelCount != other.channelCount) return false
        if (this.channels != other.channels) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hardwareOEM.contentHashCode()
        result = 31 * result + this.hardwareModel.contentHashCode()
        result = 31 * result + this.hardwareRevision.hashCode()
        result = 31 * result + this.channelCount.hashCode()
        result = 31 * result + this.channels.hashCode()
        return result
    }
}

public data class EmiVersion(
    public var emiVersion: UShort = 0u,
)

public data class GlobalMachinePowerPolicy(
    public var revision: UInt = 0u,
    public var lidOpenWakeAc: SystemPowerState = 0,
    public var lidOpenWakeDc: SystemPowerState = 0,
    public var broadcastCapacityResolution: UInt = 0u,
)

public data class GlobalPowerPolicy(
    public var user: GlobalUserPowerPolicy = GlobalUserPowerPolicy(),
    public var mach: GlobalMachinePowerPolicy = GlobalMachinePowerPolicy(),
)

public data class GlobalUserPowerPolicy(
    public var revision: UInt = 0u,
    public var powerButtonAc: PowerActionPolicy = PowerActionPolicy(),
    public var powerButtonDc: PowerActionPolicy = PowerActionPolicy(),
    public var sleepButtonAc: PowerActionPolicy = PowerActionPolicy(),
    public var sleepButtonDc: PowerActionPolicy = PowerActionPolicy(),
    public var lidCloseAc: PowerActionPolicy = PowerActionPolicy(),
    public var lidCloseDc: PowerActionPolicy = PowerActionPolicy(),
    public var dischargePolicy: List<SystemPowerLevel> = List(4) { SystemPowerLevel() },
    public var globalFlags: UInt = 0u,
)

public data class MachinePowerPolicy(
    public var revision: UInt = 0u,
    public var minSleepAc: SystemPowerState = 0,
    public var minSleepDc: SystemPowerState = 0,
    public var reducedLatencySleepAc: SystemPowerState = 0,
    public var reducedLatencySleepDc: SystemPowerState = 0,
    public var dozeTimeoutAc: UInt = 0u,
    public var dozeTimeoutDc: UInt = 0u,
    public var dozeS4TimeoutAc: UInt = 0u,
    public var dozeS4TimeoutDc: UInt = 0u,
    public var minThrottleAc: UByte = 0u,
    public var minThrottleDc: UByte = 0u,
    public var pad1: UByteArray = UByteArray(2),
    public var overThrottledAc: PowerActionPolicy = PowerActionPolicy(),
    public var overThrottledDc: PowerActionPolicy = PowerActionPolicy(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MachinePowerPolicy) return false
        if (this.revision != other.revision) return false
        if (this.minSleepAc != other.minSleepAc) return false
        if (this.minSleepDc != other.minSleepDc) return false
        if (this.reducedLatencySleepAc != other.reducedLatencySleepAc) return false
        if (this.reducedLatencySleepDc != other.reducedLatencySleepDc) return false
        if (this.dozeTimeoutAc != other.dozeTimeoutAc) return false
        if (this.dozeTimeoutDc != other.dozeTimeoutDc) return false
        if (this.dozeS4TimeoutAc != other.dozeS4TimeoutAc) return false
        if (this.dozeS4TimeoutDc != other.dozeS4TimeoutDc) return false
        if (this.minThrottleAc != other.minThrottleAc) return false
        if (this.minThrottleDc != other.minThrottleDc) return false
        if (!this.pad1.contentEquals(other.pad1)) return false
        if (this.overThrottledAc != other.overThrottledAc) return false
        if (this.overThrottledDc != other.overThrottledDc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.revision.hashCode()
        result = 31 * result + this.minSleepAc.hashCode()
        result = 31 * result + this.minSleepDc.hashCode()
        result = 31 * result + this.reducedLatencySleepAc.hashCode()
        result = 31 * result + this.reducedLatencySleepDc.hashCode()
        result = 31 * result + this.dozeTimeoutAc.hashCode()
        result = 31 * result + this.dozeTimeoutDc.hashCode()
        result = 31 * result + this.dozeS4TimeoutAc.hashCode()
        result = 31 * result + this.dozeS4TimeoutDc.hashCode()
        result = 31 * result + this.minThrottleAc.hashCode()
        result = 31 * result + this.minThrottleDc.hashCode()
        result = 31 * result + this.pad1.contentHashCode()
        result = 31 * result + this.overThrottledAc.hashCode()
        result = 31 * result + this.overThrottledDc.hashCode()
        return result
    }
}

public data class MachineProcessorPowerPolicy(
    public var revision: UInt = 0u,
    public var processorPolicyAc: ProcessorPowerPolicy = ProcessorPowerPolicy(),
    public var processorPolicyDc: ProcessorPowerPolicy = ProcessorPowerPolicy(),
)

public data class PowerbroadcastSetting(
    public var powerSetting: Guid = Guid(),
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PowerbroadcastSetting) return false
        if (this.powerSetting != other.powerSetting) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.powerSetting.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class PowerActionPolicy(
    public var action: PowerAction = 0,
    public var flags: UInt = 0u,
    public var eventCode: PowerActionPolicyEventCode = 0u,
)

public data class PowerIdleResiliency(
    public var coalescingTimeout: UInt = 0u,
    public var idleResiliencyPeriod: UInt = 0u,
)

public data class PowerMonitorInvocation(
    public var console: Boolean = false,
    public var requestReason: PowerMonitorRequestReason = 0,
)

public data class PowerPlatformInformation(
    public var aoAc: Boolean = false,
)

public data class PowerPolicy(
    public var user: UserPowerPolicy = UserPowerPolicy(),
    public var mach: MachinePowerPolicy = MachinePowerPolicy(),
)

public data class PowerSessionAllowExternalDmaDevices(
    public var isAllowed: Boolean = false,
)

public data class PowerSessionConnect(
    public var connected: Boolean = false,
    public var console: Boolean = false,
)

public data class PowerSessionRitState(
    public var active: Boolean = false,
    public var lastInputTime: ULong = 0uL,
)

public data class PowerSessionTimeouts(
    public var inputTimeout: UInt = 0u,
    public var displayTimeout: UInt = 0u,
)

public data class PowerSessionWinlogon(
    public var sessionId: UInt = 0u,
    public var console: Boolean = false,
    public var locked: Boolean = false,
)

public data class PowerUserPresence(
    public var userPresence: PowerUserPresenceType = 0,
)

public data class PpmIdlestateEvent(
    public var newState: UInt = 0u,
    public var oldState: UInt = 0u,
    public var processors: ULong = 0uL,
)

public data class PpmIdleAccounting(
    public var stateCount: UInt = 0u,
    public var totalTransitions: UInt = 0u,
    public var resetCount: UInt = 0u,
    public var startTime: ULong = 0uL,
    public var state: List<PpmIdleStateAccounting> = List(1) { PpmIdleStateAccounting() },
)

public data class PpmIdleAccountingEx(
    public var stateCount: UInt = 0u,
    public var totalTransitions: UInt = 0u,
    public var resetCount: UInt = 0u,
    public var abortCount: UInt = 0u,
    public var startTime: ULong = 0uL,
    public var state: List<PpmIdleStateAccountingEx> = List(1) { PpmIdleStateAccountingEx() },
)

public data class PpmIdleStateAccounting(
    public var idleTransitions: UInt = 0u,
    public var failedTransitions: UInt = 0u,
    public var invalidBucketIndex: UInt = 0u,
    public var totalTime: ULong = 0uL,
    public var idleTimeBuckets: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PpmIdleStateAccounting) return false
        if (this.idleTransitions != other.idleTransitions) return false
        if (this.failedTransitions != other.failedTransitions) return false
        if (this.invalidBucketIndex != other.invalidBucketIndex) return false
        if (this.totalTime != other.totalTime) return false
        if (!this.idleTimeBuckets.contentEquals(other.idleTimeBuckets)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.idleTransitions.hashCode()
        result = 31 * result + this.failedTransitions.hashCode()
        result = 31 * result + this.invalidBucketIndex.hashCode()
        result = 31 * result + this.totalTime.hashCode()
        result = 31 * result + this.idleTimeBuckets.contentHashCode()
        return result
    }
}

public data class PpmIdleStateAccountingEx(
    public var totalTime: ULong = 0uL,
    public var idleTransitions: UInt = 0u,
    public var failedTransitions: UInt = 0u,
    public var invalidBucketIndex: UInt = 0u,
    public var minTimeUs: UInt = 0u,
    public var maxTimeUs: UInt = 0u,
    public var cancelledTransitions: UInt = 0u,
    public var idleTimeBuckets: List<PpmIdleStateBucketEx> = List(16) { PpmIdleStateBucketEx() },
)

public data class PpmIdleStateBucketEx(
    public var totalTimeUs: ULong = 0uL,
    public var minTimeUs: UInt = 0u,
    public var maxTimeUs: UInt = 0u,
    public var count: UInt = 0u,
)

public data class PpmPerfstateDomainEvent(
    public var state: UInt = 0u,
    public var latency: UInt = 0u,
    public var speed: UInt = 0u,
    public var processors: ULong = 0uL,
)

public data class PpmPerfstateEvent(
    public var state: UInt = 0u,
    public var status: UInt = 0u,
    public var latency: UInt = 0u,
    public var speed: UInt = 0u,
    public var processor: UInt = 0u,
)

public data class PpmThermalchangeEvent(
    public var thermalConstraint: UInt = 0u,
    public var processors: ULong = 0uL,
)

public data class PpmThermalPolicyEvent(
    public var mode: UByte = 0u,
    public var processors: ULong = 0uL,
)

public data class PpmWmiIdleState(
    public var latency: UInt = 0u,
    public var power: UInt = 0u,
    public var timeCheck: UInt = 0u,
    public var promotePercent: UByte = 0u,
    public var demotePercent: UByte = 0u,
    public var stateType: UByte = 0u,
    public var reserved: UByte = 0u,
    public var stateFlags: UInt = 0u,
    public var context: UInt = 0u,
    public var idleHandler: UInt = 0u,
    public var reserved1: UInt = 0u,
)

public data class PpmWmiIdleStates(
    public var type: UInt = 0u,
    public var count: UInt = 0u,
    public var targetState: UInt = 0u,
    public var oldState: UInt = 0u,
    public var targetProcessors: ULong = 0uL,
    public var state: List<PpmWmiIdleState> = List(1) { PpmWmiIdleState() },
)

public data class PpmWmiIdleStatesEx(
    public var type: UInt = 0u,
    public var count: UInt = 0u,
    public var targetState: UInt = 0u,
    public var oldState: UInt = 0u,
    public var targetProcessors: COpaquePointer? = null,
    public var state: List<PpmWmiIdleState> = List(1) { PpmWmiIdleState() },
)

public data class PpmWmiLegacyPerfstate(
    public var frequency: UInt = 0u,
    public var flags: UInt = 0u,
    public var percentFrequency: UInt = 0u,
)

public data class PpmWmiPerfState(
    public var frequency: UInt = 0u,
    public var power: UInt = 0u,
    public var percentFrequency: UByte = 0u,
    public var increaseLevel: UByte = 0u,
    public var decreaseLevel: UByte = 0u,
    public var type: UByte = 0u,
    public var increaseTime: UInt = 0u,
    public var decreaseTime: UInt = 0u,
    public var control: ULong = 0uL,
    public var status: ULong = 0uL,
    public var hitCount: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: ULong = 0uL,
    public var reserved3: ULong = 0uL,
)

public class PpmWmiPerfStates(
    public var count: UInt = 0u,
    public var maxFrequency: UInt = 0u,
    public var currentState: UInt = 0u,
    public var maxPerfState: UInt = 0u,
    public var minPerfState: UInt = 0u,
    public var lowestPerfState: UInt = 0u,
    public var thermalConstraint: UInt = 0u,
    public var busyAdjThreshold: UByte = 0u,
    public var policyType: UByte = 0u,
    public var type: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timerInterval: UInt = 0u,
    public var targetProcessors: ULong = 0uL,
    public var pStateHandler: UInt = 0u,
    public var pStateContext: UInt = 0u,
    public var tStateHandler: UInt = 0u,
    public var tStateContext: UInt = 0u,
    public var feedbackHandler: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: ULong = 0uL,
    public var state: List<PpmWmiPerfState> = List(1) { PpmWmiPerfState() },
)

public class PpmWmiPerfStatesEx(
    public var count: UInt = 0u,
    public var maxFrequency: UInt = 0u,
    public var currentState: UInt = 0u,
    public var maxPerfState: UInt = 0u,
    public var minPerfState: UInt = 0u,
    public var lowestPerfState: UInt = 0u,
    public var thermalConstraint: UInt = 0u,
    public var busyAdjThreshold: UByte = 0u,
    public var policyType: UByte = 0u,
    public var type: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timerInterval: UInt = 0u,
    public var targetProcessors: COpaquePointer? = null,
    public var pStateHandler: UInt = 0u,
    public var pStateContext: UInt = 0u,
    public var tStateHandler: UInt = 0u,
    public var tStateContext: UInt = 0u,
    public var feedbackHandler: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: ULong = 0uL,
    public var state: List<PpmWmiPerfState> = List(1) { PpmWmiPerfState() },
)

public data class ProcessorObjectInfo(
    public var physicalID: UInt = 0u,
    public var pBlkAddress: UInt = 0u,
    public var pBlkLength: UByte = 0u,
)

public data class ProcessorObjectInfoEx(
    public var physicalID: UInt = 0u,
    public var pBlkAddress: UInt = 0u,
    public var pBlkLength: UByte = 0u,
    public var initialApicId: UInt = 0u,
)

public data class ProcessorPowerInformation(
    public var number: UInt = 0u,
    public var maxMhz: UInt = 0u,
    public var currentMhz: UInt = 0u,
    public var mhzLimit: UInt = 0u,
    public var maxIdleState: UInt = 0u,
    public var currentIdleState: UInt = 0u,
)

public data class ProcessorPowerPolicy(
    public var revision: UInt = 0u,
    public var dynamicThrottle: UByte = 0u,
    public var spare: UByteArray = UByteArray(3),
    public var bitfield: UInt = 0u,
    public var policyCount: UInt = 0u,
    public var policy: List<ProcessorPowerPolicyInfo> = List(3) { ProcessorPowerPolicyInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorPowerPolicy) return false
        if (this.revision != other.revision) return false
        if (this.dynamicThrottle != other.dynamicThrottle) return false
        if (!this.spare.contentEquals(other.spare)) return false
        if (this.bitfield != other.bitfield) return false
        if (this.policyCount != other.policyCount) return false
        if (this.policy != other.policy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.revision.hashCode()
        result = 31 * result + this.dynamicThrottle.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.policyCount.hashCode()
        result = 31 * result + this.policy.hashCode()
        return result
    }
}

public data class ProcessorPowerPolicyInfo(
    public var timeCheck: UInt = 0u,
    public var demoteLimit: UInt = 0u,
    public var promoteLimit: UInt = 0u,
    public var demotePercent: UByte = 0u,
    public var promotePercent: UByte = 0u,
    public var spare: UByteArray = UByteArray(2),
    public var bitfield: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorPowerPolicyInfo) return false
        if (this.timeCheck != other.timeCheck) return false
        if (this.demoteLimit != other.demoteLimit) return false
        if (this.promoteLimit != other.promoteLimit) return false
        if (this.demotePercent != other.demotePercent) return false
        if (this.promotePercent != other.promotePercent) return false
        if (!this.spare.contentEquals(other.spare)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeCheck.hashCode()
        result = 31 * result + this.demoteLimit.hashCode()
        result = 31 * result + this.promoteLimit.hashCode()
        result = 31 * result + this.demotePercent.hashCode()
        result = 31 * result + this.promotePercent.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }
}

public data class ResumePerformance(
    public var postTimeMs: UInt = 0u,
    public var totalResumeTimeMs: ULong = 0uL,
    public var resumeCompleteTimestamp: ULong = 0uL,
)

public data class SetPowerSettingValue(
    public var version: UInt = 0u,
    public var guid: Guid = Guid(),
    public var powerCondition: SystemPowerCondition = 0,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetPowerSettingValue) return false
        if (this.version != other.version) return false
        if (this.guid != other.guid) return false
        if (this.powerCondition != other.powerCondition) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.powerCondition.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class SystemBatteryState(
    public var acOnLine: Boolean = false,
    public var batteryPresent: Boolean = false,
    public var charging: Boolean = false,
    public var discharging: Boolean = false,
    public var spare1: BooleanArray = BooleanArray(3),
    public var tag: UByte = 0u,
    public var maxCapacity: UInt = 0u,
    public var remainingCapacity: UInt = 0u,
    public var rate: UInt = 0u,
    public var estimatedTime: UInt = 0u,
    public var defaultAlert1: UInt = 0u,
    public var defaultAlert2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemBatteryState) return false
        if (this.acOnLine != other.acOnLine) return false
        if (this.batteryPresent != other.batteryPresent) return false
        if (this.charging != other.charging) return false
        if (this.discharging != other.discharging) return false
        if (!this.spare1.contentEquals(other.spare1)) return false
        if (this.tag != other.tag) return false
        if (this.maxCapacity != other.maxCapacity) return false
        if (this.remainingCapacity != other.remainingCapacity) return false
        if (this.rate != other.rate) return false
        if (this.estimatedTime != other.estimatedTime) return false
        if (this.defaultAlert1 != other.defaultAlert1) return false
        if (this.defaultAlert2 != other.defaultAlert2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.acOnLine.hashCode()
        result = 31 * result + this.batteryPresent.hashCode()
        result = 31 * result + this.charging.hashCode()
        result = 31 * result + this.discharging.hashCode()
        result = 31 * result + this.spare1.contentHashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.maxCapacity.hashCode()
        result = 31 * result + this.remainingCapacity.hashCode()
        result = 31 * result + this.rate.hashCode()
        result = 31 * result + this.estimatedTime.hashCode()
        result = 31 * result + this.defaultAlert1.hashCode()
        result = 31 * result + this.defaultAlert2.hashCode()
        return result
    }
}

public class SystemPowerCapabilities(
    public var powerButtonPresent: Boolean = false,
    public var sleepButtonPresent: Boolean = false,
    public var lidPresent: Boolean = false,
    public var systemS1: Boolean = false,
    public var systemS2: Boolean = false,
    public var systemS3: Boolean = false,
    public var systemS4: Boolean = false,
    public var systemS5: Boolean = false,
    public var hiberFilePresent: Boolean = false,
    public var fullWake: Boolean = false,
    public var videoDimPresent: Boolean = false,
    public var apmPresent: Boolean = false,
    public var upsPresent: Boolean = false,
    public var thermalControl: Boolean = false,
    public var processorThrottle: Boolean = false,
    public var processorMinThrottle: UByte = 0u,
    public var processorMaxThrottle: UByte = 0u,
    public var fastSystemS4: Boolean = false,
    public var hiberboot: Boolean = false,
    public var wakeAlarmPresent: Boolean = false,
    public var aoAc: Boolean = false,
    public var diskSpinDown: Boolean = false,
    public var hiberFileType: UByte = 0u,
    public var aoAcConnectivitySupported: Boolean = false,
    public var spare3: UByteArray = UByteArray(6),
    public var systemBatteriesPresent: Boolean = false,
    public var batteriesAreShortTerm: Boolean = false,
    public var batteryScale: List<BatteryReportingScale> = List(3) { BatteryReportingScale() },
    public var acOnLineWake: SystemPowerState = 0,
    public var softLidWake: SystemPowerState = 0,
    public var rtcWake: SystemPowerState = 0,
    public var minDeviceWakeState: SystemPowerState = 0,
    public var defaultLowLatencyWake: SystemPowerState = 0,
)

public data class SystemPowerInformation(
    public var maxIdlenessAllowed: UInt = 0u,
    public var idleness: UInt = 0u,
    public var timeRemaining: UInt = 0u,
    public var coolingMode: PowerCoolingMode = 0u,
)

public data class SystemPowerLevel(
    public var enable: Boolean = false,
    public var spare: UByteArray = UByteArray(3),
    public var batteryLevel: UInt = 0u,
    public var powerPolicy: PowerActionPolicy = PowerActionPolicy(),
    public var minSystemState: SystemPowerState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemPowerLevel) return false
        if (this.enable != other.enable) return false
        if (!this.spare.contentEquals(other.spare)) return false
        if (this.batteryLevel != other.batteryLevel) return false
        if (this.powerPolicy != other.powerPolicy) return false
        if (this.minSystemState != other.minSystemState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enable.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        result = 31 * result + this.batteryLevel.hashCode()
        result = 31 * result + this.powerPolicy.hashCode()
        result = 31 * result + this.minSystemState.hashCode()
        return result
    }
}

public class SystemPowerPolicy(
    public var revision: UInt = 0u,
    public var powerButton: PowerActionPolicy = PowerActionPolicy(),
    public var sleepButton: PowerActionPolicy = PowerActionPolicy(),
    public var lidClose: PowerActionPolicy = PowerActionPolicy(),
    public var lidOpenWake: SystemPowerState = 0,
    public var reserved: UInt = 0u,
    public var idle: PowerActionPolicy = PowerActionPolicy(),
    public var idleTimeout: UInt = 0u,
    public var idleSensitivity: UByte = 0u,
    public var dynamicThrottle: UByte = 0u,
    public var spare2: UByteArray = UByteArray(2),
    public var minSleep: SystemPowerState = 0,
    public var maxSleep: SystemPowerState = 0,
    public var reducedLatencySleep: SystemPowerState = 0,
    public var winLogonFlags: UInt = 0u,
    public var spare3: UInt = 0u,
    public var dozeS4Timeout: UInt = 0u,
    public var broadcastCapacityResolution: UInt = 0u,
    public var dischargePolicy: List<SystemPowerLevel> = List(4) { SystemPowerLevel() },
    public var videoTimeout: UInt = 0u,
    public var videoDimDisplay: Boolean = false,
    public var videoReserved: UIntArray = UIntArray(3),
    public var spindownTimeout: UInt = 0u,
    public var optimizeForPower: Boolean = false,
    public var fanThrottleTolerance: UByte = 0u,
    public var forcedThrottle: UByte = 0u,
    public var minThrottle: UByte = 0u,
    public var overThrottled: PowerActionPolicy = PowerActionPolicy(),
)

public data class SystemPowerStatus(
    public var aCLineStatus: UByte = 0u,
    public var batteryFlag: UByte = 0u,
    public var batteryLifePercent: UByte = 0u,
    public var systemStatusFlag: UByte = 0u,
    public var batteryLifeTime: UInt = 0u,
    public var batteryFullLifeTime: UInt = 0u,
)

public data class ThermalEvent(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var type: UInt = 0u,
    public var temperature: UInt = 0u,
    public var tripPointTemperature: UInt = 0u,
    public var initiator: Pwstr = null,
)

public data class ThermalInformation(
    public var thermalStamp: UInt = 0u,
    public var thermalConstant1: UInt = 0u,
    public var thermalConstant2: UInt = 0u,
    public var processors: Int = 0,
    public var samplingPeriod: UInt = 0u,
    public var currentTemperature: UInt = 0u,
    public var passiveTripPoint: UInt = 0u,
    public var criticalTripPoint: UInt = 0u,
    public var activeTripPointCount: UByte = 0u,
    public var activeTripPoint: UIntArray = UIntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThermalInformation) return false
        if (this.thermalStamp != other.thermalStamp) return false
        if (this.thermalConstant1 != other.thermalConstant1) return false
        if (this.thermalConstant2 != other.thermalConstant2) return false
        if (this.processors != other.processors) return false
        if (this.samplingPeriod != other.samplingPeriod) return false
        if (this.currentTemperature != other.currentTemperature) return false
        if (this.passiveTripPoint != other.passiveTripPoint) return false
        if (this.criticalTripPoint != other.criticalTripPoint) return false
        if (this.activeTripPointCount != other.activeTripPointCount) return false
        if (!this.activeTripPoint.contentEquals(other.activeTripPoint)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.thermalStamp.hashCode()
        result = 31 * result + this.thermalConstant1.hashCode()
        result = 31 * result + this.thermalConstant2.hashCode()
        result = 31 * result + this.processors.hashCode()
        result = 31 * result + this.samplingPeriod.hashCode()
        result = 31 * result + this.currentTemperature.hashCode()
        result = 31 * result + this.passiveTripPoint.hashCode()
        result = 31 * result + this.criticalTripPoint.hashCode()
        result = 31 * result + this.activeTripPointCount.hashCode()
        result = 31 * result + this.activeTripPoint.contentHashCode()
        return result
    }
}

public data class ThermalPolicy(
    public var version: UInt = 0u,
    public var waitForUpdate: Boolean = false,
    public var hibernate: Boolean = false,
    public var critical: Boolean = false,
    public var thermalStandby: Boolean = false,
    public var activationReasons: UInt = 0u,
    public var passiveLimit: UInt = 0u,
    public var activeLevel: UInt = 0u,
    public var overThrottled: Boolean = false,
)

public data class ThermalWaitRead(
    public var timeout: UInt = 0u,
    public var lowTemperature: UInt = 0u,
    public var highTemperature: UInt = 0u,
)

public class UserPowerPolicy(
    public var revision: UInt = 0u,
    public var idleAc: PowerActionPolicy = PowerActionPolicy(),
    public var idleDc: PowerActionPolicy = PowerActionPolicy(),
    public var idleTimeoutAc: UInt = 0u,
    public var idleTimeoutDc: UInt = 0u,
    public var idleSensitivityAc: UByte = 0u,
    public var idleSensitivityDc: UByte = 0u,
    public var throttlePolicyAc: UByte = 0u,
    public var throttlePolicyDc: UByte = 0u,
    public var maxSleepAc: SystemPowerState = 0,
    public var maxSleepDc: SystemPowerState = 0,
    public var reserved: UIntArray = UIntArray(2),
    public var videoTimeoutAc: UInt = 0u,
    public var videoTimeoutDc: UInt = 0u,
    public var spindownTimeoutAc: UInt = 0u,
    public var spindownTimeoutDc: UInt = 0u,
    public var optimizeForPowerAc: Boolean = false,
    public var optimizeForPowerDc: Boolean = false,
    public var fanThrottleToleranceAc: UByte = 0u,
    public var fanThrottleToleranceDc: UByte = 0u,
    public var forcedThrottleAc: UByte = 0u,
    public var forcedThrottleDc: UByte = 0u,
)

public data class WakeAlarmInformation(
    public var timerIdentifier: UInt = 0u,
    public var timeout: UInt = 0u,
)
