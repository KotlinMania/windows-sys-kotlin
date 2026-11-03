@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.nvme

public data class ACTIVE_LATENCY_CONFIGURATION(public var Anonymous: ACTIVE_LATENCY_CONFIGURATION_0 = ACTIVE_LATENCY_CONFIGURATION_0())

public data class ACTIVE_LATENCY_CONFIGURATION_0(public var Anonymous: ACTIVE_LATENCY_CONFIGURATION_0_0 = ACTIVE_LATENCY_CONFIGURATION_0_0(), public var AsUshort: UShort = 0u)

public data class ACTIVE_LATENCY_CONFIGURATION_0_0(public var _bitfield: UShort = 0u)

public data class BUCKET_COUNTER(
    public var Reserved: UInt = 0u,
    public var Trim: UInt = 0u,
    public var Write: UInt = 0u,
    public var Read: UInt = 0u,
)

public data class DEBUG_BIT_FIELD(public var _bitfield: UShort = 0u)

public data class DSSD_POWER_STATE_DESCRIPTOR(public var _bitfield: UByte = 0u)

public data class FIRMWARE_ACTIVATION_HISTORY_ENTRY(
    public var VersionNumber: UByte = 0u,
    public var Length: UByte = 0u,
    public var Reserved0: UShort = 0u,
    public var ActivationCount: UShort = 0u,
    public var Timestamp: ULong = 0uL,
    public var Reserved1: ULong = 0uL,
    public var PowerCycleCount: ULong = 0uL,
    public var PreviousFirmware: ULong = 0uL,
    public var NewFirmware: ULong = 0uL,
    public var SlotNumber: UByte = 0u,
    public var CommitActionType: UByte = 0u,
    public var Result: UShort = 0u,
    public var Reserved2: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FIRMWARE_ACTIVATION_HISTORY_ENTRY) return false
        if (this.VersionNumber != other.VersionNumber) return false
        if (this.Length != other.Length) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.ActivationCount != other.ActivationCount) return false
        if (this.Timestamp != other.Timestamp) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.PowerCycleCount != other.PowerCycleCount) return false
        if (this.PreviousFirmware != other.PreviousFirmware) return false
        if (this.NewFirmware != other.NewFirmware) return false
        if (this.SlotNumber != other.SlotNumber) return false
        if (this.CommitActionType != other.CommitActionType) return false
        if (this.Result != other.Result) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VersionNumber.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.ActivationCount.hashCode()
        result = 31 * result + this.Timestamp.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.PowerCycleCount.hashCode()
        result = 31 * result + this.PreviousFirmware.hashCode()
        result = 31 * result + this.NewFirmware.hashCode()
        result = 31 * result + this.SlotNumber.hashCode()
        result = 31 * result + this.CommitActionType.hashCode()
        result = 31 * result + this.Result.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class LATENCY_MONITOR_FEATURE_STATUS(public var Anonymous: LATENCY_MONITOR_FEATURE_STATUS_0 = LATENCY_MONITOR_FEATURE_STATUS_0())

public data class LATENCY_MONITOR_FEATURE_STATUS_0(public var Anonymous: LATENCY_MONITOR_FEATURE_STATUS_0_0 = LATENCY_MONITOR_FEATURE_STATUS_0_0(), public var AsUchar: UByte = 0u)

public data class LATENCY_MONITOR_FEATURE_STATUS_0_0(public var _bitfield: UByte = 0u)

public data class LATENCY_STAMP(
    public var Trim3: ULong = 0uL,
    public var Write3: ULong = 0uL,
    public var Read3: ULong = 0uL,
    public var Trim2: ULong = 0uL,
    public var Write2: ULong = 0uL,
    public var Read2: ULong = 0uL,
    public var Trim1: ULong = 0uL,
    public var Write1: ULong = 0uL,
    public var Read1: ULong = 0uL,
    public var Trim0: ULong = 0uL,
    public var Write0: ULong = 0uL,
    public var Read0: ULong = 0uL,
)

public data class LATENCY_STAMP_UNITS(public var _bitfield: UShort = 0u)

public data class MEASURED_LATENCY(
    public var Trim3: UShort = 0u,
    public var Write3: UShort = 0u,
    public var Read3: UShort = 0u,
    public var Trim2: UShort = 0u,
    public var Write2: UShort = 0u,
    public var Read2: UShort = 0u,
    public var Trim1: UShort = 0u,
    public var Write1: UShort = 0u,
    public var Read1: UShort = 0u,
    public var Trim0: UShort = 0u,
    public var Write0: UShort = 0u,
    public var Read0: UShort = 0u,
)

public data class NVME_ACTIVE_NAMESPACE_ID_LIST(public var NSID: UIntArray = UIntArray(1024)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_ACTIVE_NAMESPACE_ID_LIST) return false
        if (!this.NSID.contentEquals(other.NSID)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.NSID.contentHashCode()
    }
}

public data class NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS(public var Anonymous: NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS_0 = NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS_0(), public var AsUlonglong: ULong = 0uL)

public data class NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS_0(public var _bitfield: ULong = 0uL)

public data class NVME_ADMIN_QUEUE_ATTRIBUTES(public var Anonymous: NVME_ADMIN_QUEUE_ATTRIBUTES_0 = NVME_ADMIN_QUEUE_ATTRIBUTES_0(), public var AsUlong: UInt = 0u)

public data class NVME_ADMIN_QUEUE_ATTRIBUTES_0(public var _bitfield: UInt = 0u)

public data class NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS(public var Anonymous: NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS_0 = NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS_0(), public var AsUlonglong: ULong = 0uL)

public data class NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS_0(public var _bitfield: ULong = 0uL)

public data class NVME_AUTO_POWER_STATE_TRANSITION_ENTRY(public var _bitfield: UInt = 0u, public var Reserved1: UInt = 0u)

public data class NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO(public var Anonymous: NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO_0 = NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW0_FEATURE_ERROR_INJECTION(public var Anonymous: NVME_CDW0_FEATURE_ERROR_INJECTION_0 = NVME_CDW0_FEATURE_ERROR_INJECTION_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW0_FEATURE_ERROR_INJECTION_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE(public var Anonymous: NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE_0 = NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW0_RESERVATION_PERSISTENCE(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_ABORT(public var Anonymous: NVME_CDW10_ABORT_0 = NVME_CDW10_ABORT_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_ABORT_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_CREATE_IO_QUEUE(public var Anonymous: NVME_CDW10_CREATE_IO_QUEUE_0 = NVME_CDW10_CREATE_IO_QUEUE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_CREATE_IO_QUEUE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_DATASET_MANAGEMENT(public var Anonymous: NVME_CDW10_DATASET_MANAGEMENT_0 = NVME_CDW10_DATASET_MANAGEMENT_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_DATASET_MANAGEMENT_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_DIRECTIVE_RECEIVE(public var NUMD: UInt = 0u)

public data class NVME_CDW10_DIRECTIVE_SEND(public var NUMD: UInt = 0u)

public data class NVME_CDW10_FIRMWARE_ACTIVATE(public var Anonymous: NVME_CDW10_FIRMWARE_ACTIVATE_0 = NVME_CDW10_FIRMWARE_ACTIVATE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_FIRMWARE_ACTIVATE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_FIRMWARE_DOWNLOAD(public var NUMD: UInt = 0u)

public data class NVME_CDW10_FORMAT_NVM(public var Anonymous: NVME_CDW10_FORMAT_NVM_0 = NVME_CDW10_FORMAT_NVM_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_FORMAT_NVM_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_GET_FEATURES(public var Anonymous: NVME_CDW10_GET_FEATURES_0 = NVME_CDW10_GET_FEATURES_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_GET_FEATURES_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_GET_LOG_PAGE(public var Anonymous: NVME_CDW10_GET_LOG_PAGE_0 = NVME_CDW10_GET_LOG_PAGE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_GET_LOG_PAGE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_GET_LOG_PAGE_V13(public var Anonymous: NVME_CDW10_GET_LOG_PAGE_V13_0 = NVME_CDW10_GET_LOG_PAGE_V13_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_GET_LOG_PAGE_V13_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_IDENTIFY(public var Anonymous: NVME_CDW10_IDENTIFY_0 = NVME_CDW10_IDENTIFY_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_IDENTIFY_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_RESERVATION_ACQUIRE(public var Anonymous: NVME_CDW10_RESERVATION_ACQUIRE_0 = NVME_CDW10_RESERVATION_ACQUIRE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_RESERVATION_ACQUIRE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_RESERVATION_REGISTER(public var Anonymous: NVME_CDW10_RESERVATION_REGISTER_0 = NVME_CDW10_RESERVATION_REGISTER_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_RESERVATION_REGISTER_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_RESERVATION_RELEASE(public var Anonymous: NVME_CDW10_RESERVATION_RELEASE_0 = NVME_CDW10_RESERVATION_RELEASE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_RESERVATION_RELEASE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_RESERVATION_REPORT(public var Anonymous: NVME_CDW10_RESERVATION_REPORT_0 = NVME_CDW10_RESERVATION_REPORT_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_RESERVATION_REPORT_0(public var NUMD: UInt = 0u)

public data class NVME_CDW10_SANITIZE(public var Anonymous: NVME_CDW10_SANITIZE_0 = NVME_CDW10_SANITIZE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_SANITIZE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_SECURITY_SEND_RECEIVE(public var Anonymous: NVME_CDW10_SECURITY_SEND_RECEIVE_0 = NVME_CDW10_SECURITY_SEND_RECEIVE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_SECURITY_SEND_RECEIVE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_SET_FEATURES(public var Anonymous: NVME_CDW10_SET_FEATURES_0 = NVME_CDW10_SET_FEATURES_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW10_SET_FEATURES_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW10_ZONE_APPEND(public var SLBA: ULong = 0uL)

public data class NVME_CDW10_ZONE_MANAGEMENT_RECEIVE(public var SLBA: ULong = 0uL)

public data class NVME_CDW10_ZONE_MANAGEMENT_SEND(public var SLBA: ULong = 0uL)

public data class NVME_CDW11_CREATE_IO_CQ(public var Anonymous: NVME_CDW11_CREATE_IO_CQ_0 = NVME_CDW11_CREATE_IO_CQ_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_CREATE_IO_CQ_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_CREATE_IO_SQ(public var Anonymous: NVME_CDW11_CREATE_IO_SQ_0 = NVME_CDW11_CREATE_IO_SQ_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_CREATE_IO_SQ_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_DATASET_MANAGEMENT(public var Anonymous: NVME_CDW11_DATASET_MANAGEMENT_0 = NVME_CDW11_DATASET_MANAGEMENT_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_DATASET_MANAGEMENT_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_DIRECTIVE_RECEIVE(public var Anonymous: NVME_CDW11_DIRECTIVE_RECEIVE_0 = NVME_CDW11_DIRECTIVE_RECEIVE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_DIRECTIVE_RECEIVE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_DIRECTIVE_SEND(public var Anonymous: NVME_CDW11_DIRECTIVE_SEND_0 = NVME_CDW11_DIRECTIVE_SEND_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_DIRECTIVE_SEND_0(public var _bitfield: UInt = 0u)

public class NVME_CDW11_FEATURES(
    public var NumberOfQueues: NVME_CDW11_FEATURE_NUMBER_OF_QUEUES = NVME_CDW11_FEATURE_NUMBER_OF_QUEUES(),
    public var InterruptCoalescing: NVME_CDW11_FEATURE_INTERRUPT_COALESCING = NVME_CDW11_FEATURE_INTERRUPT_COALESCING(),
    public var InterruptVectorConfig: NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG = NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG(),
    public var LbaRangeType: NVME_CDW11_FEATURE_LBA_RANGE_TYPE = NVME_CDW11_FEATURE_LBA_RANGE_TYPE(),
    public var Arbitration: NVME_CDW11_FEATURE_ARBITRATION = NVME_CDW11_FEATURE_ARBITRATION(),
    public var VolatileWriteCache: NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE = NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE(),
    public var AsyncEventConfig: NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG = NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG(),
    public var PowerManagement: NVME_CDW11_FEATURE_POWER_MANAGEMENT = NVME_CDW11_FEATURE_POWER_MANAGEMENT(),
    public var AutoPowerStateTransition: NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION = NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION(),
    public var TemperatureThreshold: NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD = NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD(),
    public var ErrorRecovery: NVME_CDW11_FEATURE_ERROR_RECOVERY = NVME_CDW11_FEATURE_ERROR_RECOVERY(),
    public var HostMemoryBuffer: NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER = NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER(),
    public var WriteAtomicityNormal: NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL = NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL(),
    public var NonOperationalPowerState: NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE = NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE(),
    public var IoCommandSetProfile: NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE = NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE(),
    public var ErrorInjection: NVME_CDW0_FEATURE_ERROR_INJECTION = NVME_CDW0_FEATURE_ERROR_INJECTION(),
    public var HostIdentifier: NVME_CDW11_FEATURE_HOST_IDENTIFIER = NVME_CDW11_FEATURE_HOST_IDENTIFIER(),
    public var ReservationPersistence: NVME_CDW11_FEATURE_RESERVATION_PERSISTENCE = NVME_CDW11_FEATURE_RESERVATION_PERSISTENCE(),
    public var ReservationNotificationMask: NVME_CDW11_FEATURE_RESERVATION_NOTIFICATION_MASK = NVME_CDW11_FEATURE_RESERVATION_NOTIFICATION_MASK(),
    public var GetHostMetadata: NVME_CDW11_FEATURE_GET_HOST_METADATA = NVME_CDW11_FEATURE_GET_HOST_METADATA(),
    public var SetHostMetadata: NVME_CDW11_FEATURE_SET_HOST_METADATA = NVME_CDW11_FEATURE_SET_HOST_METADATA(),
    public var AsUlong: UInt = 0u,
)

public data class NVME_CDW11_FEATURE_ARBITRATION(public var Anonymous: NVME_CDW11_FEATURE_ARBITRATION_0 = NVME_CDW11_FEATURE_ARBITRATION_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_ARBITRATION_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG(public var Anonymous: NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG_0 = NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION(public var Anonymous: NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION_0 = NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY(public var Anonymous: NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY_0 = NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS(public var Anonymous: NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS_0 = NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO(public var Anonymous: NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO_0 = NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_ERROR_RECOVERY(public var Anonymous: NVME_CDW11_FEATURE_ERROR_RECOVERY_0 = NVME_CDW11_FEATURE_ERROR_RECOVERY_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_ERROR_RECOVERY_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_GET_HOST_METADATA(public var Anonymous: NVME_CDW11_FEATURE_GET_HOST_METADATA_0 = NVME_CDW11_FEATURE_GET_HOST_METADATA_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_GET_HOST_METADATA_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_HOST_IDENTIFIER(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER(public var Anonymous: NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER_0 = NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_INTERRUPT_COALESCING(public var Anonymous: NVME_CDW11_FEATURE_INTERRUPT_COALESCING_0 = NVME_CDW11_FEATURE_INTERRUPT_COALESCING_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_INTERRUPT_COALESCING_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG(public var Anonymous: NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG_0 = NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE(public var Anonymous: NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE_0 = NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_LBA_RANGE_TYPE(public var Anonymous: NVME_CDW11_FEATURE_LBA_RANGE_TYPE_0 = NVME_CDW11_FEATURE_LBA_RANGE_TYPE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_LBA_RANGE_TYPE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE(public var Anonymous: NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE_0 = NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_NUMBER_OF_QUEUES(public var Anonymous: NVME_CDW11_FEATURE_NUMBER_OF_QUEUES_0 = NVME_CDW11_FEATURE_NUMBER_OF_QUEUES_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_NUMBER_OF_QUEUES_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_POWER_MANAGEMENT(public var Anonymous: NVME_CDW11_FEATURE_POWER_MANAGEMENT_0 = NVME_CDW11_FEATURE_POWER_MANAGEMENT_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_POWER_MANAGEMENT_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE(public var Anonymous: NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE_0 = NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_RESERVATION_NOTIFICATION_MASK(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_RESERVATION_PERSISTENCE(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_SET_HOST_METADATA(public var Anonymous: NVME_CDW11_FEATURE_SET_HOST_METADATA_0 = NVME_CDW11_FEATURE_SET_HOST_METADATA_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_SET_HOST_METADATA_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY(public var Anonymous: NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY_0 = NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD(public var Anonymous: NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD_0 = NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE(public var Anonymous: NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE_0 = NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL(public var Anonymous: NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL_0 = NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_FIRMWARE_DOWNLOAD(public var OFST: UInt = 0u)

public data class NVME_CDW11_GET_LOG_PAGE(public var Anonymous: NVME_CDW11_GET_LOG_PAGE_0 = NVME_CDW11_GET_LOG_PAGE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_GET_LOG_PAGE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_IDENTIFY(
    public var Anonymous1: NVME_CDW11_IDENTIFY_0 = NVME_CDW11_IDENTIFY_0(),
    public var Anonymous2: NVME_CDW11_IDENTIFY_1 = NVME_CDW11_IDENTIFY_1(),
    public var AsUlong: UInt = 0u,
)

public data class NVME_CDW11_IDENTIFY_0(public var NVMSETID: UShort = 0u, public var Reserved: UShort = 0u)

public data class NVME_CDW11_IDENTIFY_1(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_RESERVATION_REPORT(public var Anonymous: NVME_CDW11_RESERVATION_REPORT_0 = NVME_CDW11_RESERVATION_REPORT_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_RESERVATION_REPORT_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW11_SANITIZE(public var Anonymous: NVME_CDW11_SANITIZE_0 = NVME_CDW11_SANITIZE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW11_SANITIZE_0(public var OVRPAT: UInt = 0u)

public data class NVME_CDW11_SECURITY_RECEIVE(public var AL: UInt = 0u)

public data class NVME_CDW11_SECURITY_SEND(public var TL: UInt = 0u)

public data class NVME_CDW12_DIRECTIVE_RECEIVE(public var AllocateResources: NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES = NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES(public var Anonymous: NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0 = NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW12_DIRECTIVE_SEND(public var EnableDirective: NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE = NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE(public var Anonymous: NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE_0 = NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW12_FEATURES(public var HostMemoryBuffer: NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER = NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER(public var Anonymous: NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER_0 = NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER_0(public var HSIZE: UInt = 0u)

public data class NVME_CDW12_GET_LOG_PAGE(public var LPOL: UInt = 0u)

public data class NVME_CDW12_READ_WRITE(public var Anonymous: NVME_CDW12_READ_WRITE_0 = NVME_CDW12_READ_WRITE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_READ_WRITE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW12_ZONE_APPEND(public var Anonymous: NVME_CDW12_ZONE_APPEND_0 = NVME_CDW12_ZONE_APPEND_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW12_ZONE_APPEND_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW13_FEATURES(public var HostMemoryBuffer: NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER = NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER(), public var AsUlong: UInt = 0u)

public data class NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER(public var Anonymous: NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER_0 = NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW13_GET_LOG_PAGE(public var LPOU: UInt = 0u)

public data class NVME_CDW13_READ_WRITE(public var Anonymous: NVME_CDW13_READ_WRITE_0 = NVME_CDW13_READ_WRITE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW13_READ_WRITE_0(
    public var DSM: NVME_CDW13_READ_WRITE_0_0 = NVME_CDW13_READ_WRITE_0_0(),
    public var Reserved: UByte = 0u,
    public var DSPEC: UShort = 0u,
)

public data class NVME_CDW13_READ_WRITE_0_0(public var _bitfield: UByte = 0u)

public data class NVME_CDW13_ZONE_MANAGEMENT_RECEIVE(public var Anonymous: NVME_CDW13_ZONE_MANAGEMENT_RECEIVE_0 = NVME_CDW13_ZONE_MANAGEMENT_RECEIVE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW13_ZONE_MANAGEMENT_RECEIVE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW13_ZONE_MANAGEMENT_SEND(public var Anonymous: NVME_CDW13_ZONE_MANAGEMENT_SEND_0 = NVME_CDW13_ZONE_MANAGEMENT_SEND_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW13_ZONE_MANAGEMENT_SEND_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW14_FEATURES(public var HostMemoryBuffer: NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER = NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER(), public var AsUlong: UInt = 0u)

public data class NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER(public var Anonymous: NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER_0 = NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER_0(public var HMDLUA: UInt = 0u)

public data class NVME_CDW14_GET_LOG_PAGE(public var Anonymous: NVME_CDW14_GET_LOG_PAGE_0 = NVME_CDW14_GET_LOG_PAGE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW14_GET_LOG_PAGE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW15_FEATURES(public var HostMemoryBuffer: NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER = NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER(), public var AsUlong: UInt = 0u)

public data class NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER(public var Anonymous: NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER_0 = NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER_0(public var HMDLEC: UInt = 0u)

public data class NVME_CDW15_READ_WRITE(public var Anonymous: NVME_CDW15_READ_WRITE_0 = NVME_CDW15_READ_WRITE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW15_READ_WRITE_0(public var _bitfield: UInt = 0u)

public data class NVME_CDW15_ZONE_APPEND(public var Anonymous: NVME_CDW15_ZONE_APPEND_0 = NVME_CDW15_ZONE_APPEND_0(), public var AsUlong: UInt = 0u)

public data class NVME_CDW15_ZONE_APPEND_0(public var _bitfield: UInt = 0u)

public data class NVME_CHANGED_NAMESPACE_LIST_LOG(public var NSID: UIntArray = UIntArray(1024)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_CHANGED_NAMESPACE_LIST_LOG) return false
        if (!this.NSID.contentEquals(other.NSID)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.NSID.contentHashCode()
    }
}

public data class NVME_CHANGED_ZONE_LIST_LOG(
    public var ZoneIdentifiersCount: UShort = 0u,
    public var Reserved: UByteArray = UByteArray(6),
    public var ZoneIdentifier: ULongArray = ULongArray(511),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_CHANGED_ZONE_LIST_LOG) return false
        if (this.ZoneIdentifiersCount != other.ZoneIdentifiersCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.ZoneIdentifier.contentEquals(other.ZoneIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ZoneIdentifiersCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ZoneIdentifier.contentHashCode()
        return result
    }
}

public data class NVME_COMMAND(
    public var CDW0: NVME_COMMAND_DWORD0 = NVME_COMMAND_DWORD0(),
    public var NSID: UInt = 0u,
    public var Reserved0: UIntArray = UIntArray(2),
    public var MPTR: ULong = 0uL,
    public var PRP1: ULong = 0uL,
    public var PRP2: ULong = 0uL,
    public var u: NVME_COMMAND_0 = NVME_COMMAND_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_COMMAND) return false
        if (this.CDW0 != other.CDW0) return false
        if (this.NSID != other.NSID) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.MPTR != other.MPTR) return false
        if (this.PRP1 != other.PRP1) return false
        if (this.PRP2 != other.PRP2) return false
        if (this.u != other.u) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CDW0.hashCode()
        result = 31 * result + this.NSID.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.MPTR.hashCode()
        result = 31 * result + this.PRP1.hashCode()
        result = 31 * result + this.PRP2.hashCode()
        result = 31 * result + this.u.hashCode()
        return result
    }
}

public class NVME_COMMAND_0(
    public var GENERAL: NVME_COMMAND_0_0 = NVME_COMMAND_0_0(),
    public var IDENTIFY: NVME_COMMAND_0_1 = NVME_COMMAND_0_1(),
    public var ABORT: NVME_COMMAND_0_2 = NVME_COMMAND_0_2(),
    public var GETFEATURES: NVME_COMMAND_0_3 = NVME_COMMAND_0_3(),
    public var SETFEATURES: NVME_COMMAND_0_4 = NVME_COMMAND_0_4(),
    public var GETLOGPAGE: NVME_COMMAND_0_5 = NVME_COMMAND_0_5(),
    public var CREATEIOCQ: NVME_COMMAND_0_6 = NVME_COMMAND_0_6(),
    public var CREATEIOSQ: NVME_COMMAND_0_7 = NVME_COMMAND_0_7(),
    public var DATASETMANAGEMENT: NVME_COMMAND_0_8 = NVME_COMMAND_0_8(),
    public var SECURITYSEND: NVME_COMMAND_0_9 = NVME_COMMAND_0_9(),
    public var SECURITYRECEIVE: NVME_COMMAND_0_10 = NVME_COMMAND_0_10(),
    public var FIRMWAREDOWNLOAD: NVME_COMMAND_0_11 = NVME_COMMAND_0_11(),
    public var FIRMWAREACTIVATE: NVME_COMMAND_0_12 = NVME_COMMAND_0_12(),
    public var FORMATNVM: NVME_COMMAND_0_13 = NVME_COMMAND_0_13(),
    public var DIRECTIVERECEIVE: NVME_COMMAND_0_14 = NVME_COMMAND_0_14(),
    public var DIRECTIVESEND: NVME_COMMAND_0_15 = NVME_COMMAND_0_15(),
    public var SANITIZE: NVME_COMMAND_0_16 = NVME_COMMAND_0_16(),
    public var READWRITE: NVME_COMMAND_0_17 = NVME_COMMAND_0_17(),
    public var RESERVATIONACQUIRE: NVME_COMMAND_0_18 = NVME_COMMAND_0_18(),
    public var RESERVATIONREGISTER: NVME_COMMAND_0_19 = NVME_COMMAND_0_19(),
    public var RESERVATIONRELEASE: NVME_COMMAND_0_20 = NVME_COMMAND_0_20(),
    public var RESERVATIONREPORT: NVME_COMMAND_0_21 = NVME_COMMAND_0_21(),
    public var ZONEMANAGEMENTSEND: NVME_COMMAND_0_22 = NVME_COMMAND_0_22(),
    public var ZONEMANAGEMENTRECEIVE: NVME_COMMAND_0_23 = NVME_COMMAND_0_23(),
    public var ZONEAPPEND: NVME_COMMAND_0_24 = NVME_COMMAND_0_24(),
)

public data class NVME_COMMAND_0_2(
    public var CDW10: NVME_CDW10_ABORT = NVME_CDW10_ABORT(),
    public var CDW11: UInt = 0u,
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_6(
    public var CDW10: NVME_CDW10_CREATE_IO_QUEUE = NVME_CDW10_CREATE_IO_QUEUE(),
    public var CDW11: NVME_CDW11_CREATE_IO_CQ = NVME_CDW11_CREATE_IO_CQ(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_7(
    public var CDW10: NVME_CDW10_CREATE_IO_QUEUE = NVME_CDW10_CREATE_IO_QUEUE(),
    public var CDW11: NVME_CDW11_CREATE_IO_SQ = NVME_CDW11_CREATE_IO_SQ(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_8(
    public var CDW10: NVME_CDW10_DATASET_MANAGEMENT = NVME_CDW10_DATASET_MANAGEMENT(),
    public var CDW11: NVME_CDW11_DATASET_MANAGEMENT = NVME_CDW11_DATASET_MANAGEMENT(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_14(
    public var CDW10: NVME_CDW10_DIRECTIVE_RECEIVE = NVME_CDW10_DIRECTIVE_RECEIVE(),
    public var CDW11: NVME_CDW11_DIRECTIVE_RECEIVE = NVME_CDW11_DIRECTIVE_RECEIVE(),
    public var CDW12: NVME_CDW12_DIRECTIVE_RECEIVE = NVME_CDW12_DIRECTIVE_RECEIVE(),
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_15(
    public var CDW10: NVME_CDW10_DIRECTIVE_SEND = NVME_CDW10_DIRECTIVE_SEND(),
    public var CDW11: NVME_CDW11_DIRECTIVE_SEND = NVME_CDW11_DIRECTIVE_SEND(),
    public var CDW12: NVME_CDW12_DIRECTIVE_SEND = NVME_CDW12_DIRECTIVE_SEND(),
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_12(
    public var CDW10: NVME_CDW10_FIRMWARE_ACTIVATE = NVME_CDW10_FIRMWARE_ACTIVATE(),
    public var CDW11: UInt = 0u,
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_11(
    public var CDW10: NVME_CDW10_FIRMWARE_DOWNLOAD = NVME_CDW10_FIRMWARE_DOWNLOAD(),
    public var CDW11: NVME_CDW11_FIRMWARE_DOWNLOAD = NVME_CDW11_FIRMWARE_DOWNLOAD(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_13(
    public var CDW10: NVME_CDW10_FORMAT_NVM = NVME_CDW10_FORMAT_NVM(),
    public var CDW11: UInt = 0u,
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_0(
    public var CDW10: UInt = 0u,
    public var CDW11: UInt = 0u,
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_3(
    public var CDW10: NVME_CDW10_GET_FEATURES = NVME_CDW10_GET_FEATURES(),
    public var CDW11: NVME_CDW11_FEATURES = NVME_CDW11_FEATURES(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_5(
    public var Anonymous: NVME_COMMAND_0_5_0 = NVME_COMMAND_0_5_0(),
    public var CDW11: NVME_CDW11_GET_LOG_PAGE = NVME_CDW11_GET_LOG_PAGE(),
    public var CDW12: NVME_CDW12_GET_LOG_PAGE = NVME_CDW12_GET_LOG_PAGE(),
    public var CDW13: NVME_CDW13_GET_LOG_PAGE = NVME_CDW13_GET_LOG_PAGE(),
    public var CDW14: NVME_CDW14_GET_LOG_PAGE = NVME_CDW14_GET_LOG_PAGE(),
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_5_0(public var CDW10: NVME_CDW10_GET_LOG_PAGE = NVME_CDW10_GET_LOG_PAGE(), public var CDW10_V13: NVME_CDW10_GET_LOG_PAGE_V13 = NVME_CDW10_GET_LOG_PAGE_V13())

public data class NVME_COMMAND_0_1(
    public var CDW10: NVME_CDW10_IDENTIFY = NVME_CDW10_IDENTIFY(),
    public var CDW11: NVME_CDW11_IDENTIFY = NVME_CDW11_IDENTIFY(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_17(
    public var LBALOW: UInt = 0u,
    public var LBAHIGH: UInt = 0u,
    public var CDW12: NVME_CDW12_READ_WRITE = NVME_CDW12_READ_WRITE(),
    public var CDW13: NVME_CDW13_READ_WRITE = NVME_CDW13_READ_WRITE(),
    public var CDW14: UInt = 0u,
    public var CDW15: NVME_CDW15_READ_WRITE = NVME_CDW15_READ_WRITE(),
)

public data class NVME_COMMAND_0_18(
    public var CDW10: NVME_CDW10_RESERVATION_ACQUIRE = NVME_CDW10_RESERVATION_ACQUIRE(),
    public var CDW11: UInt = 0u,
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_19(
    public var CDW10: NVME_CDW10_RESERVATION_REGISTER = NVME_CDW10_RESERVATION_REGISTER(),
    public var CDW11: UInt = 0u,
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_20(
    public var CDW10: NVME_CDW10_RESERVATION_RELEASE = NVME_CDW10_RESERVATION_RELEASE(),
    public var CDW11: UInt = 0u,
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_21(
    public var CDW10: NVME_CDW10_RESERVATION_REPORT = NVME_CDW10_RESERVATION_REPORT(),
    public var CDW11: NVME_CDW11_RESERVATION_REPORT = NVME_CDW11_RESERVATION_REPORT(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_16(
    public var CDW10: NVME_CDW10_SANITIZE = NVME_CDW10_SANITIZE(),
    public var CDW11: NVME_CDW11_SANITIZE = NVME_CDW11_SANITIZE(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_10(
    public var CDW10: NVME_CDW10_SECURITY_SEND_RECEIVE = NVME_CDW10_SECURITY_SEND_RECEIVE(),
    public var CDW11: NVME_CDW11_SECURITY_RECEIVE = NVME_CDW11_SECURITY_RECEIVE(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_9(
    public var CDW10: NVME_CDW10_SECURITY_SEND_RECEIVE = NVME_CDW10_SECURITY_SEND_RECEIVE(),
    public var CDW11: NVME_CDW11_SECURITY_SEND = NVME_CDW11_SECURITY_SEND(),
    public var CDW12: UInt = 0u,
    public var CDW13: UInt = 0u,
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_4(
    public var CDW10: NVME_CDW10_SET_FEATURES = NVME_CDW10_SET_FEATURES(),
    public var CDW11: NVME_CDW11_FEATURES = NVME_CDW11_FEATURES(),
    public var CDW12: NVME_CDW12_FEATURES = NVME_CDW12_FEATURES(),
    public var CDW13: NVME_CDW13_FEATURES = NVME_CDW13_FEATURES(),
    public var CDW14: NVME_CDW14_FEATURES = NVME_CDW14_FEATURES(),
    public var CDW15: NVME_CDW15_FEATURES = NVME_CDW15_FEATURES(),
)

public data class NVME_COMMAND_0_24(
    public var CDW1011: NVME_CDW10_ZONE_APPEND = NVME_CDW10_ZONE_APPEND(),
    public var CDW12: NVME_CDW12_ZONE_APPEND = NVME_CDW12_ZONE_APPEND(),
    public var CDW13: UInt = 0u,
    public var ILBRT: UInt = 0u,
    public var CDW15: NVME_CDW15_ZONE_APPEND = NVME_CDW15_ZONE_APPEND(),
)

public data class NVME_COMMAND_0_23(
    public var CDW1011: NVME_CDW10_ZONE_MANAGEMENT_RECEIVE = NVME_CDW10_ZONE_MANAGEMENT_RECEIVE(),
    public var DWORDCOUNT: UInt = 0u,
    public var CDW13: NVME_CDW13_ZONE_MANAGEMENT_RECEIVE = NVME_CDW13_ZONE_MANAGEMENT_RECEIVE(),
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_0_22(
    public var CDW1011: NVME_CDW10_ZONE_MANAGEMENT_SEND = NVME_CDW10_ZONE_MANAGEMENT_SEND(),
    public var CDW12: UInt = 0u,
    public var CDW13: NVME_CDW13_ZONE_MANAGEMENT_SEND = NVME_CDW13_ZONE_MANAGEMENT_SEND(),
    public var CDW14: UInt = 0u,
    public var CDW15: UInt = 0u,
)

public data class NVME_COMMAND_DWORD0(public var Anonymous: NVME_COMMAND_DWORD0_0 = NVME_COMMAND_DWORD0_0(), public var AsUlong: UInt = 0u)

public data class NVME_COMMAND_DWORD0_0(public var _bitfield: UInt = 0u)

public data class NVME_COMMAND_EFFECTS_DATA(public var Anonymous: NVME_COMMAND_EFFECTS_DATA_0 = NVME_COMMAND_EFFECTS_DATA_0(), public var AsUlong: UInt = 0u)

public data class NVME_COMMAND_EFFECTS_DATA_0(public var _bitfield: UInt = 0u)

public data class NVME_COMMAND_EFFECTS_LOG(
    public var ACS: List<NVME_COMMAND_EFFECTS_DATA> = List(256) { NVME_COMMAND_EFFECTS_DATA() },
    public var IOCS: List<NVME_COMMAND_EFFECTS_DATA> = List(256) { NVME_COMMAND_EFFECTS_DATA() },
    public var Reserved: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_COMMAND_EFFECTS_LOG) return false
        if (this.ACS != other.ACS) return false
        if (this.IOCS != other.IOCS) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ACS.hashCode()
        result = 31 * result + this.IOCS.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class NVME_COMMAND_STATUS(public var Anonymous: NVME_COMMAND_STATUS_0 = NVME_COMMAND_STATUS_0(), public var AsUshort: UShort = 0u)

public data class NVME_COMMAND_STATUS_0(public var _bitfield: UShort = 0u)

public data class NVME_COMPLETION_DW0_ASYNC_EVENT_REQUEST(public var _bitfield: UInt = 0u)

public data class NVME_COMPLETION_DW0_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES(public var Anonymous: NVME_COMPLETION_DW0_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0 = NVME_COMPLETION_DW0_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0(), public var AsUlong: UInt = 0u)

public data class NVME_COMPLETION_DW0_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0(public var _bitfield: UInt = 0u)

public data class NVME_COMPLETION_ENTRY(
    public var DW0: UInt = 0u,
    public var DW1: UInt = 0u,
    public var DW2: NVME_COMPLETION_ENTRY_0 = NVME_COMPLETION_ENTRY_0(),
    public var DW3: NVME_COMPLETION_ENTRY_1 = NVME_COMPLETION_ENTRY_1(),
)

public data class NVME_COMPLETION_ENTRY_0(public var Anonymous: NVME_COMPLETION_ENTRY_0_0 = NVME_COMPLETION_ENTRY_0_0(), public var AsUlong: UInt = 0u)

public data class NVME_COMPLETION_ENTRY_0_0(public var SQHD: UShort = 0u, public var SQID: UShort = 0u)

public data class NVME_COMPLETION_ENTRY_1(public var Anonymous: NVME_COMPLETION_ENTRY_1_0 = NVME_COMPLETION_ENTRY_1_0(), public var AsUlong: UInt = 0u)

public data class NVME_COMPLETION_ENTRY_1_0(public var CID: UShort = 0u, public var Status: NVME_COMMAND_STATUS = NVME_COMMAND_STATUS())

public data class NVME_COMPLETION_QUEUE_HEAD_DOORBELL(public var Anonymous: NVME_COMPLETION_QUEUE_HEAD_DOORBELL_0 = NVME_COMPLETION_QUEUE_HEAD_DOORBELL_0(), public var AsUlong: UInt = 0u)

public data class NVME_COMPLETION_QUEUE_HEAD_DOORBELL_0(public var _bitfield: UInt = 0u)

public data class NVME_CONTEXT_ATTRIBUTES(public var Anonymous: NVME_CONTEXT_ATTRIBUTES_0 = NVME_CONTEXT_ATTRIBUTES_0(), public var AsUlong: UInt = 0u)

public data class NVME_CONTEXT_ATTRIBUTES_0(public var _bitfield: UInt = 0u)

public data class NVME_CONTROLLER_CAPABILITIES(public var Anonymous: NVME_CONTROLLER_CAPABILITIES_0 = NVME_CONTROLLER_CAPABILITIES_0(), public var AsUlonglong: ULong = 0uL)

public data class NVME_CONTROLLER_CAPABILITIES_0(public var _bitfield: ULong = 0uL)

public data class NVME_CONTROLLER_CONFIGURATION(public var Anonymous: NVME_CONTROLLER_CONFIGURATION_0 = NVME_CONTROLLER_CONFIGURATION_0(), public var AsUlong: UInt = 0u)

public data class NVME_CONTROLLER_CONFIGURATION_0(public var _bitfield: UInt = 0u)

public data class NVME_CONTROLLER_LIST(public var NumberOfIdentifiers: UShort = 0u, public var ControllerID: UShortArray = UShortArray(2047)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_CONTROLLER_LIST) return false
        if (this.NumberOfIdentifiers != other.NumberOfIdentifiers) return false
        if (!this.ControllerID.contentEquals(other.ControllerID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfIdentifiers.hashCode()
        result = 31 * result + this.ControllerID.contentHashCode()
        return result
    }
}

public data class NVME_CONTROLLER_MEMORY_BUFFER_LOCATION(public var Anonymous: NVME_CONTROLLER_MEMORY_BUFFER_LOCATION_0 = NVME_CONTROLLER_MEMORY_BUFFER_LOCATION_0(), public var AsUlong: UInt = 0u)

public data class NVME_CONTROLLER_MEMORY_BUFFER_LOCATION_0(public var _bitfield: UInt = 0u)

public data class NVME_CONTROLLER_MEMORY_BUFFER_SIZE(public var Anonymous: NVME_CONTROLLER_MEMORY_BUFFER_SIZE_0 = NVME_CONTROLLER_MEMORY_BUFFER_SIZE_0(), public var AsUlong: UInt = 0u)

public data class NVME_CONTROLLER_MEMORY_BUFFER_SIZE_0(public var _bitfield: UInt = 0u)

public data class NVME_CONTROLLER_REGISTERS(
    public var CAP: NVME_CONTROLLER_CAPABILITIES = NVME_CONTROLLER_CAPABILITIES(),
    public var VS: NVME_VERSION = NVME_VERSION(),
    public var INTMS: UInt = 0u,
    public var INTMC: UInt = 0u,
    public var CC: NVME_CONTROLLER_CONFIGURATION = NVME_CONTROLLER_CONFIGURATION(),
    public var Reserved0: UInt = 0u,
    public var CSTS: NVME_CONTROLLER_STATUS = NVME_CONTROLLER_STATUS(),
    public var NSSR: NVME_NVM_SUBSYSTEM_RESET = NVME_NVM_SUBSYSTEM_RESET(),
    public var AQA: NVME_ADMIN_QUEUE_ATTRIBUTES = NVME_ADMIN_QUEUE_ATTRIBUTES(),
    public var ASQ: NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS = NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS(),
    public var ACQ: NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS = NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS(),
    public var CMBLOC: NVME_CONTROLLER_MEMORY_BUFFER_LOCATION = NVME_CONTROLLER_MEMORY_BUFFER_LOCATION(),
    public var CMBSZ: NVME_CONTROLLER_MEMORY_BUFFER_SIZE = NVME_CONTROLLER_MEMORY_BUFFER_SIZE(),
    public var Reserved2: UIntArray = UIntArray(944),
    public var Reserved3: UIntArray = UIntArray(64),
    public var Doorbells: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_CONTROLLER_REGISTERS) return false
        if (this.CAP != other.CAP) return false
        if (this.VS != other.VS) return false
        if (this.INTMS != other.INTMS) return false
        if (this.INTMC != other.INTMC) return false
        if (this.CC != other.CC) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.CSTS != other.CSTS) return false
        if (this.NSSR != other.NSSR) return false
        if (this.AQA != other.AQA) return false
        if (this.ASQ != other.ASQ) return false
        if (this.ACQ != other.ACQ) return false
        if (this.CMBLOC != other.CMBLOC) return false
        if (this.CMBSZ != other.CMBSZ) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (!this.Doorbells.contentEquals(other.Doorbells)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CAP.hashCode()
        result = 31 * result + this.VS.hashCode()
        result = 31 * result + this.INTMS.hashCode()
        result = 31 * result + this.INTMC.hashCode()
        result = 31 * result + this.CC.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.CSTS.hashCode()
        result = 31 * result + this.NSSR.hashCode()
        result = 31 * result + this.AQA.hashCode()
        result = 31 * result + this.ASQ.hashCode()
        result = 31 * result + this.ACQ.hashCode()
        result = 31 * result + this.CMBLOC.hashCode()
        result = 31 * result + this.CMBSZ.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.Doorbells.contentHashCode()
        return result
    }
}

public data class NVME_CONTROLLER_STATUS(public var Anonymous: NVME_CONTROLLER_STATUS_0 = NVME_CONTROLLER_STATUS_0(), public var AsUlong: UInt = 0u)

public data class NVME_CONTROLLER_STATUS_0(public var _bitfield: UInt = 0u)

public data class NVME_DEVICE_SELF_TEST_LOG(
    public var CurrentOperation: NVME_DEVICE_SELF_TEST_LOG_0 = NVME_DEVICE_SELF_TEST_LOG_0(),
    public var CurrentCompletion: NVME_DEVICE_SELF_TEST_LOG_1 = NVME_DEVICE_SELF_TEST_LOG_1(),
    public var Reserved: UByteArray = UByteArray(2),
    public var ResultData: List<NVME_DEVICE_SELF_TEST_RESULT_DATA> = List(20) { NVME_DEVICE_SELF_TEST_RESULT_DATA() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_DEVICE_SELF_TEST_LOG) return false
        if (this.CurrentOperation != other.CurrentOperation) return false
        if (this.CurrentCompletion != other.CurrentCompletion) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.ResultData != other.ResultData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CurrentOperation.hashCode()
        result = 31 * result + this.CurrentCompletion.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ResultData.hashCode()
        return result
    }
}

public data class NVME_DEVICE_SELF_TEST_LOG_1(public var _bitfield: UByte = 0u)

public data class NVME_DEVICE_SELF_TEST_LOG_0(public var _bitfield: UByte = 0u)

public data class NVME_DEVICE_SELF_TEST_RESULT_DATA(
    public var Status: NVME_DEVICE_SELF_TEST_RESULT_DATA_0 = NVME_DEVICE_SELF_TEST_RESULT_DATA_0(),
    public var SegmentNumber: UByte = 0u,
    public var ValidDiagnostics: NVME_DEVICE_SELF_TEST_RESULT_DATA_1 = NVME_DEVICE_SELF_TEST_RESULT_DATA_1(),
    public var Reserved: UByte = 0u,
    public var POH: ULong = 0uL,
    public var NSID: UInt = 0u,
    public var FailingLBA: ULong = 0uL,
    public var StatusCodeType: NVME_DEVICE_SELF_TEST_RESULT_DATA_2 = NVME_DEVICE_SELF_TEST_RESULT_DATA_2(),
    public var StatusCode: UByte = 0u,
    public var VendorSpecific: UShort = 0u,
)

public data class NVME_DEVICE_SELF_TEST_RESULT_DATA_2(public var _bitfield: UByte = 0u)

public data class NVME_DEVICE_SELF_TEST_RESULT_DATA_0(public var _bitfield: UByte = 0u)

public data class NVME_DEVICE_SELF_TEST_RESULT_DATA_1(public var _bitfield: UByte = 0u)

public data class NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS(public var DirectivesSupported: NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR = NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR(), public var DirectivesEnabled: NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR = NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR())

public data class NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR(public var _bitfield: UByte = 0u, public var Reserved1: UByteArray = UByteArray(31)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_DIRECTIVE_STREAMS_GET_STATUS_DATA(public var OpenStreamCount: UShort = 0u, public var StreamIdentifiers: UShortArray = UShortArray(65535)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_DIRECTIVE_STREAMS_GET_STATUS_DATA) return false
        if (this.OpenStreamCount != other.OpenStreamCount) return false
        if (!this.StreamIdentifiers.contentEquals(other.StreamIdentifiers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OpenStreamCount.hashCode()
        result = 31 * result + this.StreamIdentifiers.contentHashCode()
        return result
    }
}

public data class NVME_DIRECTIVE_STREAMS_RETURN_PARAMETERS(
    public var MSL: UShort = 0u,
    public var NSSA: UShort = 0u,
    public var NSSO: UShort = 0u,
    public var Reserved0: UByteArray = UByteArray(10),
    public var SWS: UInt = 0u,
    public var SGS: UShort = 0u,
    public var NSA: UShort = 0u,
    public var NSO: UShort = 0u,
    public var Reserved1: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_DIRECTIVE_STREAMS_RETURN_PARAMETERS) return false
        if (this.MSL != other.MSL) return false
        if (this.NSSA != other.NSSA) return false
        if (this.NSSO != other.NSSO) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.SWS != other.SWS) return false
        if (this.SGS != other.SGS) return false
        if (this.NSA != other.NSA) return false
        if (this.NSO != other.NSO) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MSL.hashCode()
        result = 31 * result + this.NSSA.hashCode()
        result = 31 * result + this.NSSO.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.SWS.hashCode()
        result = 31 * result + this.SGS.hashCode()
        result = 31 * result + this.NSA.hashCode()
        result = 31 * result + this.NSO.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_ENDURANCE_GROUP_LOG(
    public var Reserved0: UInt = 0u,
    public var AvailableSpareThreshold: UByte = 0u,
    public var PercentageUsed: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(26),
    public var EnduranceEstimate: UByteArray = UByteArray(16),
    public var DataUnitsRead: UByteArray = UByteArray(16),
    public var DataUnitsWritten: UByteArray = UByteArray(16),
    public var MediaUnitsWritten: UByteArray = UByteArray(16),
    public var Reserved2: UByteArray = UByteArray(416),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_ENDURANCE_GROUP_LOG) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.AvailableSpareThreshold != other.AvailableSpareThreshold) return false
        if (this.PercentageUsed != other.PercentageUsed) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.EnduranceEstimate.contentEquals(other.EnduranceEstimate)) return false
        if (!this.DataUnitsRead.contentEquals(other.DataUnitsRead)) return false
        if (!this.DataUnitsWritten.contentEquals(other.DataUnitsWritten)) return false
        if (!this.MediaUnitsWritten.contentEquals(other.MediaUnitsWritten)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved0.hashCode()
        result = 31 * result + this.AvailableSpareThreshold.hashCode()
        result = 31 * result + this.PercentageUsed.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.EnduranceEstimate.contentHashCode()
        result = 31 * result + this.DataUnitsRead.contentHashCode()
        result = 31 * result + this.DataUnitsWritten.contentHashCode()
        result = 31 * result + this.MediaUnitsWritten.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class NVME_ERROR_INFO_LOG(
    public var ErrorCount: ULong = 0uL,
    public var SQID: UShort = 0u,
    public var CMDID: UShort = 0u,
    public var Status: NVME_COMMAND_STATUS = NVME_COMMAND_STATUS(),
    public var ParameterErrorLocation: NVME_ERROR_INFO_LOG_0 = NVME_ERROR_INFO_LOG_0(),
    public var Lba: ULong = 0uL,
    public var NameSpace: UInt = 0u,
    public var VendorInfoAvailable: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var CommandSpecificInfo: ULong = 0uL,
    public var Reserved1: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_ERROR_INFO_LOG) return false
        if (this.ErrorCount != other.ErrorCount) return false
        if (this.SQID != other.SQID) return false
        if (this.CMDID != other.CMDID) return false
        if (this.Status != other.Status) return false
        if (this.ParameterErrorLocation != other.ParameterErrorLocation) return false
        if (this.Lba != other.Lba) return false
        if (this.NameSpace != other.NameSpace) return false
        if (this.VendorInfoAvailable != other.VendorInfoAvailable) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.CommandSpecificInfo != other.CommandSpecificInfo) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ErrorCount.hashCode()
        result = 31 * result + this.SQID.hashCode()
        result = 31 * result + this.CMDID.hashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.ParameterErrorLocation.hashCode()
        result = 31 * result + this.Lba.hashCode()
        result = 31 * result + this.NameSpace.hashCode()
        result = 31 * result + this.VendorInfoAvailable.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.CommandSpecificInfo.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_ERROR_INFO_LOG_0(public var _bitfield: UShort = 0u)

public data class NVME_ERROR_INJECTION_ENTRY(
    public var Flags: NVME_ERROR_INJECTION_ENTRY_0 = NVME_ERROR_INJECTION_ENTRY_0(),
    public var Reserved1: UByte = 0u,
    public var ErrorInjectionType: UShort = 0u,
    public var ErrorInjectionTypeSpecific: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_ERROR_INJECTION_ENTRY) return false
        if (this.Flags != other.Flags) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.ErrorInjectionType != other.ErrorInjectionType) return false
        if (!this.ErrorInjectionTypeSpecific.contentEquals(other.ErrorInjectionTypeSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.ErrorInjectionType.hashCode()
        result = 31 * result + this.ErrorInjectionTypeSpecific.contentHashCode()
        return result
    }
}

public data class NVME_ERROR_INJECTION_ENTRY_0(public var Anonymous: NVME_ERROR_INJECTION_ENTRY_0_0 = NVME_ERROR_INJECTION_ENTRY_0_0(), public var AsUchar: UByte = 0u)
