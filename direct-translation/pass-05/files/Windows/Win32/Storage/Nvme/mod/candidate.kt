// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTIVE_LATENCY_CONFIGURATION` (
    public var `Anonymous`: `ACTIVE_LATENCY_CONFIGURATION_0`,
)
// UNSUPPORTED Rust 6:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTIVE_LATENCY_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 11:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union ACTIVE_LATENCY_CONFIGURATION_0 {
//     pub Anonymous: ACTIVE_LATENCY_CONFIGURATION_0_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 17:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTIVE_LATENCY_CONFIGURATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ACTIVE_LATENCY_CONFIGURATION_0_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BUCKET_COUNTER` (
    public var `Reserved`: UInt,
    public var `Trim`: UInt,
    public var `Write`: UInt,
    public var `Read`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEBUG_BIT_FIELD` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DSSD_POWER_STATE_DESCRIPTOR` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 14 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FIRMWARE_ACTIVATION_HISTORY_ENTRY` (
    public var `VersionNumber`: UByte,
    public var `Length`: UByte,
    public var `Reserved0`: UShort,
    public var `ActivationCount`: UShort,
    public var `Timestamp`: ULong,
    public var `Reserved1`: ULong,
    public var `PowerCycleCount`: ULong,
    public var `PreviousFirmware`: ULong,
    public var `NewFirmware`: ULong,
    public var `SlotNumber`: UByte,
    public var `CommitActionType`: UByte,
    public var `Result`: UShort,
    public var `Reserved2`: UByteArray,
)
// UNSUPPORTED Rust 62:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FIRMWARE_ACTIVATION_HISTORY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FIRMWARE_ACTIVATION_HISTORY_ENTRY_VERSION_1`: UInt = 1u;
// UNSUPPORTED Rust 68:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MFND_CHILD_CONTROLLER_EVENT_LOG_PAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98bcce18_a5f0_bf35_a544_d97f259d669c);

// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_MFND_CHILD_CONTROLLER_EVENT_LOG_PAGEGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98bcce18_a5f0_bf35_a544_d97f259d669c);

// UNSUPPORTED Rust 70:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_DEVICE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d054297_e1d1_98c9_5d49_584b913c05b7);

// UNSUPPORTED Rust 71:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_DEVICE_CAPABILITIESGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d054297_e1d1_98c9_5d49_584b913c05b7);

// UNSUPPORTED Rust 72:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_ERROR_RECOVERY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2131d944_30fe_ae34_ab4d_fd3dba83195a);

// UNSUPPORTED Rust 73:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_ERROR_RECOVERYGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2131d944_30fe_ae34_ab4d_fd3dba83195a);

// UNSUPPORTED Rust 74:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x769a796d_dab4_a3f6_e24d_b28aacf31cd1);

// UNSUPPORTED Rust 75:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORYGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x769a796d_dab4_a3f6_e24d_b28aacf31cd1);

// UNSUPPORTED Rust 76:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_LATENCY_MONITOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8cc07a92_84d0_9c6c_7043_e6d4585ed485);

// UNSUPPORTED Rust 77:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_LATENCY_MONITORGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8cc07a92_84d0_9c6c_7043_e6d4585ed485);

// UNSUPPORTED Rust 78:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_SMART_INFORMATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2810afc5_bfea_a4f2_9c4f_6f7cc914d5af);

// UNSUPPORTED Rust 79:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_SMART_INFORMATIONGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2810afc5_bfea_a4f2_9c4f_6f7cc914d5af);

// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_TCG_CONFIGURATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd244006_e07e_83e6_c047_54fa9d2ae054);

// UNSUPPORTED Rust 81:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_TCG_CONFIGURATIONGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd244006_e07e_83e6_c047_54fa9d2ae054);

// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_TCG_HISTORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x704b513e_09c6_9490_274e_d0969690d788);

// UNSUPPORTED Rust 83:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_TCG_HISTORYGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x704b513e_09c6_9490_274e_d0969690d788);

// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e9c722f_2399_bb2c_6348_32d0b798bbc7);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_OCP_DEVICE_UNSUPPORTED_REQUIREMENTSGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e9c722f_2399_bb2c_6348_32d0b798bbc7);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_WCS_DEVICE_ERROR_RECOVERY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2131d944_30fe_ae34_ab4d_fd3dba83195a);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_WCS_DEVICE_ERROR_RECOVERYGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2131d944_30fe_ae34_ab4d_fd3dba83195a);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_WCS_DEVICE_SMART_ATTRIBUTES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2810afc5_bfea_a4f2_9c4f_6f7cc914d5af);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_WCS_DEVICE_SMART_ATTRIBUTESGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2810afc5_bfea_a4f2_9c4f_6f7cc914d5af);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LATENCY_MONITOR_FEATURE_STATUS` (
    public var `Anonymous`: `LATENCY_MONITOR_FEATURE_STATUS_0`,
)
// UNSUPPORTED Rust 95:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LATENCY_MONITOR_FEATURE_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 100:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LATENCY_MONITOR_FEATURE_STATUS_0 {
//     pub Anonymous: LATENCY_MONITOR_FEATURE_STATUS_0_0,
//     pub AsUchar: u8,
// }

// UNSUPPORTED Rust 106:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LATENCY_MONITOR_FEATURE_STATUS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LATENCY_MONITOR_FEATURE_STATUS_0_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LATENCY_STAMP` (
    public var `Trim3`: ULong,
    public var `Write3`: ULong,
    public var `Read3`: ULong,
    public var `Trim2`: ULong,
    public var `Write2`: ULong,
    public var `Read2`: ULong,
    public var `Trim1`: ULong,
    public var `Write1`: ULong,
    public var `Read1`: ULong,
    public var `Trim0`: ULong,
    public var `Write0`: ULong,
    public var `Read0`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LATENCY_STAMP_UNITS` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MEASURED_LATENCY` (
    public var `Trim3`: UShort,
    public var `Write3`: UShort,
    public var `Read3`: UShort,
    public var `Trim2`: UShort,
    public var `Write2`: UShort,
    public var `Read2`: UShort,
    public var `Trim1`: UShort,
    public var `Write1`: UShort,
    public var `Read1`: UShort,
    public var `Trim0`: UShort,
    public var `Write0`: UShort,
    public var `Read0`: UShort,
)
public typealias `NVME_ACCESS_FREQUENCIES` = Int;
public const val `NVME_ACCESS_FREQUENCY_FR_WRITE_FR_READ`: `NVME_ACCESS_FREQUENCIES` = 5;
public const val `NVME_ACCESS_FREQUENCY_FR_WRITE_INFR_READ`: `NVME_ACCESS_FREQUENCIES` = 4;
public const val `NVME_ACCESS_FREQUENCY_INFR_WRITE_FR_READ`: `NVME_ACCESS_FREQUENCIES` = 3;
public const val `NVME_ACCESS_FREQUENCY_INFR_WRITE_INFR_READ`: `NVME_ACCESS_FREQUENCIES` = 2;
public const val `NVME_ACCESS_FREQUENCY_NONE`: `NVME_ACCESS_FREQUENCIES` = 0;
public const val `NVME_ACCESS_FREQUENCY_ONE_TIME_READ`: `NVME_ACCESS_FREQUENCIES` = 6;
public const val `NVME_ACCESS_FREQUENCY_SPECULATIVE_READ`: `NVME_ACCESS_FREQUENCIES` = 7;
public const val `NVME_ACCESS_FREQUENCY_TYPICAL`: `NVME_ACCESS_FREQUENCIES` = 1;
public const val `NVME_ACCESS_FREQUENCY_WILL_BE_OVERWRITTEN`: `NVME_ACCESS_FREQUENCIES` = 8;
public typealias `NVME_ACCESS_LATENCIES` = Int;
public const val `NVME_ACCESS_LATENCY_IDLE`: `NVME_ACCESS_LATENCIES` = 1;
public const val `NVME_ACCESS_LATENCY_LOW`: `NVME_ACCESS_LATENCIES` = 3;
public const val `NVME_ACCESS_LATENCY_NONE`: `NVME_ACCESS_LATENCIES` = 0;
public const val `NVME_ACCESS_LATENCY_NORMAL`: `NVME_ACCESS_LATENCIES` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1024 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_ACTIVE_NAMESPACE_ID_LIST` (
    public var `NSID`: UIntArray,
)
// UNSUPPORTED Rust 173:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ACTIVE_NAMESPACE_ID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_ADMIN_COMMANDS` = Int;
public const val `NVME_ADMIN_COMMAND_ABORT`: `NVME_ADMIN_COMMANDS` = 8;
public const val `NVME_ADMIN_COMMAND_ASYNC_EVENT_REQUEST`: `NVME_ADMIN_COMMANDS` = 12;
public const val `NVME_ADMIN_COMMAND_CREATE_IO_CQ`: `NVME_ADMIN_COMMANDS` = 5;
public const val `NVME_ADMIN_COMMAND_CREATE_IO_SQ`: `NVME_ADMIN_COMMANDS` = 1;
public const val `NVME_ADMIN_COMMAND_DELETE_IO_CQ`: `NVME_ADMIN_COMMANDS` = 4;
public const val `NVME_ADMIN_COMMAND_DELETE_IO_SQ`: `NVME_ADMIN_COMMANDS` = 0;
public const val `NVME_ADMIN_COMMAND_DEVICE_SELF_TEST`: `NVME_ADMIN_COMMANDS` = 20;
public const val `NVME_ADMIN_COMMAND_DIRECTIVE_RECEIVE`: `NVME_ADMIN_COMMANDS` = 26;
public const val `NVME_ADMIN_COMMAND_DIRECTIVE_SEND`: `NVME_ADMIN_COMMANDS` = 25;
public const val `NVME_ADMIN_COMMAND_DOORBELL_BUFFER_CONFIG`: `NVME_ADMIN_COMMANDS` = 124;
public const val `NVME_ADMIN_COMMAND_FIRMWARE_ACTIVATE`: `NVME_ADMIN_COMMANDS` = 16;
public const val `NVME_ADMIN_COMMAND_FIRMWARE_COMMIT`: `NVME_ADMIN_COMMANDS` = 16;
public const val `NVME_ADMIN_COMMAND_FIRMWARE_IMAGE_DOWNLOAD`: `NVME_ADMIN_COMMANDS` = 17;
public const val `NVME_ADMIN_COMMAND_FORMAT_NVM`: `NVME_ADMIN_COMMANDS` = 128;
public const val `NVME_ADMIN_COMMAND_GET_FEATURES`: `NVME_ADMIN_COMMANDS` = 10;
public const val `NVME_ADMIN_COMMAND_GET_LBA_STATUS`: `NVME_ADMIN_COMMANDS` = 134;
public const val `NVME_ADMIN_COMMAND_GET_LOG_PAGE`: `NVME_ADMIN_COMMANDS` = 2;
public const val `NVME_ADMIN_COMMAND_IDENTIFY`: `NVME_ADMIN_COMMANDS` = 6;
public const val `NVME_ADMIN_COMMAND_NAMESPACE_ATTACHMENT`: `NVME_ADMIN_COMMANDS` = 21;
public const val `NVME_ADMIN_COMMAND_NAMESPACE_MANAGEMENT`: `NVME_ADMIN_COMMANDS` = 13;
public const val `NVME_ADMIN_COMMAND_NVME_MI_RECEIVE`: `NVME_ADMIN_COMMANDS` = 30;
public const val `NVME_ADMIN_COMMAND_NVME_MI_SEND`: `NVME_ADMIN_COMMANDS` = 29;
public const val `NVME_ADMIN_COMMAND_SANITIZE`: `NVME_ADMIN_COMMANDS` = 132;
public const val `NVME_ADMIN_COMMAND_SECURITY_RECEIVE`: `NVME_ADMIN_COMMANDS` = 130;
public const val `NVME_ADMIN_COMMAND_SECURITY_SEND`: `NVME_ADMIN_COMMANDS` = 129;
public const val `NVME_ADMIN_COMMAND_SET_FEATURES`: `NVME_ADMIN_COMMANDS` = 9;
public const val `NVME_ADMIN_COMMAND_VIRTUALIZATION_MANAGEMENT`: `NVME_ADMIN_COMMANDS` = 28;
// UNSUPPORTED Rust 206:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS {
//     pub Anonymous: NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS_0,
//     pub AsUlonglong: u64,
// }

// UNSUPPORTED Rust 212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS_0` (
    public var `_bitfield`: ULong,
)
// UNSUPPORTED Rust 222:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_ADMIN_QUEUE_ATTRIBUTES {
//     pub Anonymous: NVME_ADMIN_QUEUE_ATTRIBUTES_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 228:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ADMIN_QUEUE_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ADMIN_QUEUE_ATTRIBUTES_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 238:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS {
//     pub Anonymous: NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS_0,
//     pub AsUlonglong: u64,
// }

// UNSUPPORTED Rust 244:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS_0` (
    public var `_bitfield`: ULong,
)
public typealias `NVME_AMS_OPTION` = Int;
public const val `NVME_AMS_ROUND_ROBIN`: `NVME_AMS_OPTION` = 0;
public const val `NVME_AMS_WEIGHTED_ROUND_ROBIN_URGENT`: `NVME_AMS_OPTION` = 1;
public const val `NVME_ASYNC_ERROR_DIAG_FAILURE`: `NVME_ASYNC_EVENT_ERROR_STATUS_CODES` = 2;
public const val `NVME_ASYNC_ERROR_FIRMWARE_IMAGE_LOAD_ERROR`: `NVME_ASYNC_EVENT_ERROR_STATUS_CODES` = 5;
public const val `NVME_ASYNC_ERROR_INVALID_DOORBELL_WRITE_VALUE`: `NVME_ASYNC_EVENT_ERROR_STATUS_CODES` = 1;
public const val `NVME_ASYNC_ERROR_INVALID_SUBMISSION_QUEUE`: `NVME_ASYNC_EVENT_ERROR_STATUS_CODES` = 0;
public const val `NVME_ASYNC_ERROR_PERSISTENT_INTERNAL_DEVICE_ERROR`: `NVME_ASYNC_EVENT_ERROR_STATUS_CODES` = 3;
public const val `NVME_ASYNC_ERROR_TRANSIENT_INTERNAL_DEVICE_ERROR`: `NVME_ASYNC_EVENT_ERROR_STATUS_CODES` = 4;
public typealias `NVME_ASYNC_EVENT_ERROR_STATUS_CODES` = Int;
public typealias `NVME_ASYNC_EVENT_HEALTH_STATUS_CODES` = Int;
public typealias `NVME_ASYNC_EVENT_IO_COMMAND_SET_STATUS_CODES` = Int;
public typealias `NVME_ASYNC_EVENT_NOTICE_CODES` = Int;
public typealias `NVME_ASYNC_EVENT_TYPES` = Int;
public const val `NVME_ASYNC_EVENT_TYPE_ERROR_STATUS`: `NVME_ASYNC_EVENT_TYPES` = 0;
public const val `NVME_ASYNC_EVENT_TYPE_HEALTH_STATUS`: `NVME_ASYNC_EVENT_TYPES` = 1;
public const val `NVME_ASYNC_EVENT_TYPE_IO_COMMAND_SET_STATUS`: `NVME_ASYNC_EVENT_TYPES` = 6;
public const val `NVME_ASYNC_EVENT_TYPE_NOTICE`: `NVME_ASYNC_EVENT_TYPES` = 2;
public const val `NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC`: `NVME_ASYNC_EVENT_TYPES` = 7;
public typealias `NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC_CODES` = Int;
public const val `NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC_DEVICE_PANIC`: `NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC_CODES` = 1;
public const val `NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC_RESERVED`: `NVME_ASYNC_EVENT_TYPE_VENDOR_SPECIFIC_CODES` = 0;
public const val `NVME_ASYNC_HEALTH_NVM_SUBSYSTEM_RELIABILITY`: `NVME_ASYNC_EVENT_HEALTH_STATUS_CODES` = 0;
public const val `NVME_ASYNC_HEALTH_SPARE_BELOW_THRESHOLD`: `NVME_ASYNC_EVENT_HEALTH_STATUS_CODES` = 2;
public const val `NVME_ASYNC_HEALTH_TEMPERATURE_THRESHOLD`: `NVME_ASYNC_EVENT_HEALTH_STATUS_CODES` = 1;
public const val `NVME_ASYNC_IO_CMD_SANITIZE_OPERATION_COMPLETED`: `NVME_ASYNC_EVENT_IO_COMMAND_SET_STATUS_CODES` = 1;
public const val `NVME_ASYNC_IO_CMD_SANITIZE_OPERATION_COMPLETED_WITH_UNEXPECTED_DEALLOCATION`: `NVME_ASYNC_EVENT_IO_COMMAND_SET_STATUS_CODES` = 2;
public const val `NVME_ASYNC_IO_CMD_SET_RESERVATION_LOG_PAGE_AVAILABLE`: `NVME_ASYNC_EVENT_IO_COMMAND_SET_STATUS_CODES` = 0;
public const val `NVME_ASYNC_NOTICE_ASYMMETRIC_ACCESS_CHANGE`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 3;
public const val `NVME_ASYNC_NOTICE_ENDURANCE_GROUP_EVENT_AGGREGATE_LOG_CHANGE`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 6;
public const val `NVME_ASYNC_NOTICE_FIRMWARE_ACTIVATION_STARTING`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 1;
public const val `NVME_ASYNC_NOTICE_LBA_STATUS_INFORMATION_ALERT`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 5;
public const val `NVME_ASYNC_NOTICE_NAMESPACE_ATTRIBUTE_CHANGED`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 0;
public const val `NVME_ASYNC_NOTICE_PREDICTABLE_LATENCY_EVENT_AGGREGATE_LOG_CHANGE`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 4;
public const val `NVME_ASYNC_NOTICE_TELEMETRY_LOG_CHANGED`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 2;
public const val `NVME_ASYNC_NOTICE_ZONE_DESCRIPTOR_CHANGED`: `NVME_ASYNC_EVENT_NOTICE_CODES` = 239;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_AUTO_POWER_STATE_TRANSITION_ENTRY` (
    public var `_bitfield`: UInt,
    public var `Reserved1`: UInt,
)
public const val `NVME_CC_SHN_ABRUPT_SHUTDOWN`: `NVME_CC_SHN_SHUTDOWN_NOTIFICATIONS` = 2;
public const val `NVME_CC_SHN_NORMAL_SHUTDOWN`: `NVME_CC_SHN_SHUTDOWN_NOTIFICATIONS` = 1;
public const val `NVME_CC_SHN_NO_NOTIFICATION`: `NVME_CC_SHN_SHUTDOWN_NOTIFICATIONS` = 0;
public typealias `NVME_CC_SHN_SHUTDOWN_NOTIFICATIONS` = Int;
// UNSUPPORTED Rust 300:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO {
//     pub Anonymous: NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW0_FEATURE_ENABLE_IEEE1667_SILO_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 316:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW0_FEATURE_ERROR_INJECTION {
//     pub Anonymous: NVME_CDW0_FEATURE_ERROR_INJECTION_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 322:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW0_FEATURE_ERROR_INJECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW0_FEATURE_ERROR_INJECTION_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 332:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE {
//     pub Anonymous: NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW0_FEATURE_READONLY_WRITETHROUGH_MODE_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW0_RESERVATION_PERSISTENCE` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 353:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_ABORT {
//     pub Anonymous: NVME_CDW10_ABORT_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 359:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_ABORT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_ABORT_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 369:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_CREATE_IO_QUEUE {
//     pub Anonymous: NVME_CDW10_CREATE_IO_QUEUE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_CREATE_IO_QUEUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_CREATE_IO_QUEUE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 385:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_DATASET_MANAGEMENT {
//     pub Anonymous: NVME_CDW10_DATASET_MANAGEMENT_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_DATASET_MANAGEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_DATASET_MANAGEMENT_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_DIRECTIVE_RECEIVE` (
    public var `NUMD`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_DIRECTIVE_SEND` (
    public var `NUMD`: UInt,
)
// UNSUPPORTED Rust 411:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_FIRMWARE_ACTIVATE {
//     pub Anonymous: NVME_CDW10_FIRMWARE_ACTIVATE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 417:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_FIRMWARE_ACTIVATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_FIRMWARE_ACTIVATE_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_FIRMWARE_DOWNLOAD` (
    public var `NUMD`: UInt,
)
// UNSUPPORTED Rust 432:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_FORMAT_NVM {
//     pub Anonymous: NVME_CDW10_FORMAT_NVM_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_FORMAT_NVM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_FORMAT_NVM_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 448:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_GET_FEATURES {
//     pub Anonymous: NVME_CDW10_GET_FEATURES_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_GET_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_GET_FEATURES_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 464:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_GET_LOG_PAGE {
//     pub Anonymous: NVME_CDW10_GET_LOG_PAGE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 470:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_GET_LOG_PAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_GET_LOG_PAGE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 480:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_GET_LOG_PAGE_V13 {
//     pub Anonymous: NVME_CDW10_GET_LOG_PAGE_V13_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 486:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_GET_LOG_PAGE_V13 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_GET_LOG_PAGE_V13_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 496:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_IDENTIFY {
//     pub Anonymous: NVME_CDW10_IDENTIFY_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 502:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_IDENTIFY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_IDENTIFY_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 512:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_RESERVATION_ACQUIRE {
//     pub Anonymous: NVME_CDW10_RESERVATION_ACQUIRE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_RESERVATION_ACQUIRE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_RESERVATION_ACQUIRE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 528:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_RESERVATION_REGISTER {
//     pub Anonymous: NVME_CDW10_RESERVATION_REGISTER_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 534:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_RESERVATION_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_RESERVATION_REGISTER_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 544:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_RESERVATION_RELEASE {
//     pub Anonymous: NVME_CDW10_RESERVATION_RELEASE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_RESERVATION_RELEASE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_RESERVATION_RELEASE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 560:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_RESERVATION_REPORT {
//     pub Anonymous: NVME_CDW10_RESERVATION_REPORT_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 566:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_RESERVATION_REPORT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_RESERVATION_REPORT_0` (
    public var `NUMD`: UInt,
)
// UNSUPPORTED Rust 576:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_SANITIZE {
//     pub Anonymous: NVME_CDW10_SANITIZE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_SANITIZE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_SANITIZE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 592:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_SECURITY_SEND_RECEIVE {
//     pub Anonymous: NVME_CDW10_SECURITY_SEND_RECEIVE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 598:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_SECURITY_SEND_RECEIVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_SECURITY_SEND_RECEIVE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 608:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW10_SET_FEATURES {
//     pub Anonymous: NVME_CDW10_SET_FEATURES_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 614:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW10_SET_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_SET_FEATURES_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_ZONE_APPEND` (
    public var `SLBA`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_ZONE_MANAGEMENT_RECEIVE` (
    public var `SLBA`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW10_ZONE_MANAGEMENT_SEND` (
    public var `SLBA`: ULong,
)
// UNSUPPORTED Rust 639:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_CREATE_IO_CQ {
//     pub Anonymous: NVME_CDW11_CREATE_IO_CQ_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 645:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_CREATE_IO_CQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_CREATE_IO_CQ_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 655:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_CREATE_IO_SQ {
//     pub Anonymous: NVME_CDW11_CREATE_IO_SQ_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 661:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_CREATE_IO_SQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_CREATE_IO_SQ_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 671:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_DATASET_MANAGEMENT {
//     pub Anonymous: NVME_CDW11_DATASET_MANAGEMENT_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 677:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_DATASET_MANAGEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_DATASET_MANAGEMENT_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 687:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_DIRECTIVE_RECEIVE {
//     pub Anonymous: NVME_CDW11_DIRECTIVE_RECEIVE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_DIRECTIVE_RECEIVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_DIRECTIVE_RECEIVE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 703:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_DIRECTIVE_SEND {
//     pub Anonymous: NVME_CDW11_DIRECTIVE_SEND_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 709:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_DIRECTIVE_SEND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_DIRECTIVE_SEND_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 719:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURES {
//     pub NumberOfQueues: NVME_CDW11_FEATURE_NUMBER_OF_QUEUES,
//     pub InterruptCoalescing: NVME_CDW11_FEATURE_INTERRUPT_COALESCING,
//     pub InterruptVectorConfig: NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG,
//     pub LbaRangeType: NVME_CDW11_FEATURE_LBA_RANGE_TYPE,
//     pub Arbitration: NVME_CDW11_FEATURE_ARBITRATION,
//     pub VolatileWriteCache: NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE,
//     pub AsyncEventConfig: NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG,
//     pub PowerManagement: NVME_CDW11_FEATURE_POWER_MANAGEMENT,
//     pub AutoPowerStateTransition: NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION,
//     pub TemperatureThreshold: NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD,
//     pub ErrorRecovery: NVME_CDW11_FEATURE_ERROR_RECOVERY,
//     pub HostMemoryBuffer: NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER,
//     pub WriteAtomicityNormal: NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL,
//     pub NonOperationalPowerState: NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE,
//     pub IoCommandSetProfile: NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE,
//     pub ErrorInjection: NVME_CDW0_FEATURE_ERROR_INJECTION,
//     pub HostIdentifier: NVME_CDW11_FEATURE_HOST_IDENTIFIER,
//     pub ReservationPersistence: NVME_CDW11_FEATURE_RESERVATION_PERSISTENCE,
//     pub ReservationNotificationMask: NVME_CDW11_FEATURE_RESERVATION_NOTIFICATION_MASK,
//     pub GetHostMetadata: NVME_CDW11_FEATURE_GET_HOST_METADATA,
//     pub SetHostMetadata: NVME_CDW11_FEATURE_SET_HOST_METADATA,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 750:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_ARBITRATION {
//     pub Anonymous: NVME_CDW11_FEATURE_ARBITRATION_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 756:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_ARBITRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_ARBITRATION_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 766:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG {
//     pub Anonymous: NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 772:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_ASYNC_EVENT_CONFIG_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 782:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION {
//     pub Anonymous: NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 788:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_AUTO_POWER_STATE_TRANSITION_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 798:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY {
//     pub Anonymous: NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 804:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_CLEAR_FW_UPDATE_HISTORY_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 814:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS {
//     pub Anonymous: NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 820:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 830:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO {
//     pub Anonymous: NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 836:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_ENABLE_IEEE1667_SILO_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 846:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_ERROR_RECOVERY {
//     pub Anonymous: NVME_CDW11_FEATURE_ERROR_RECOVERY_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 852:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_ERROR_RECOVERY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_ERROR_RECOVERY_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 862:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_GET_HOST_METADATA {
//     pub Anonymous: NVME_CDW11_FEATURE_GET_HOST_METADATA_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 868:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_GET_HOST_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_GET_HOST_METADATA_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_HOST_IDENTIFIER` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 883:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER {
//     pub Anonymous: NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 889:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_HOST_MEMORY_BUFFER_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 899:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_INTERRUPT_COALESCING {
//     pub Anonymous: NVME_CDW11_FEATURE_INTERRUPT_COALESCING_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 905:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_INTERRUPT_COALESCING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_INTERRUPT_COALESCING_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 915:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG {
//     pub Anonymous: NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 921:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_INTERRUPT_VECTOR_CONFIG_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 931:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE {
//     pub Anonymous: NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 937:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_IO_COMMAND_SET_PROFILE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 947:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_LBA_RANGE_TYPE {
//     pub Anonymous: NVME_CDW11_FEATURE_LBA_RANGE_TYPE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 953:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_LBA_RANGE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_LBA_RANGE_TYPE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 963:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE {
//     pub Anonymous: NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 969:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_NON_OPERATIONAL_POWER_STATE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 979:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_NUMBER_OF_QUEUES {
//     pub Anonymous: NVME_CDW11_FEATURE_NUMBER_OF_QUEUES_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 985:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_NUMBER_OF_QUEUES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_NUMBER_OF_QUEUES_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 995:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_POWER_MANAGEMENT {
//     pub Anonymous: NVME_CDW11_FEATURE_POWER_MANAGEMENT_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1001:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_POWER_MANAGEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_POWER_MANAGEMENT_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1011:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE {
//     pub Anonymous: NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1017:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_READONLY_WRITETHROUGH_MODE_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_RESERVATION_NOTIFICATION_MASK` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_RESERVATION_PERSISTENCE` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1037:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_SET_HOST_METADATA {
//     pub Anonymous: NVME_CDW11_FEATURE_SET_HOST_METADATA_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_SET_HOST_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_SET_HOST_METADATA_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1053:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY {
//     pub Anonymous: NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1059:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_SUPPORTED_CAPABILITY_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1069:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD {
//     pub Anonymous: NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1075:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_TEMPERATURE_THRESHOLD_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1085:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE {
//     pub Anonymous: NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1091:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_VOLATILE_WRITE_CACHE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1101:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL {
//     pub Anonymous: NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1107:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FEATURE_WRITE_ATOMICITY_NORMAL_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_FIRMWARE_DOWNLOAD` (
    public var `OFST`: UInt,
)
// UNSUPPORTED Rust 1122:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_GET_LOG_PAGE {
//     pub Anonymous: NVME_CDW11_GET_LOG_PAGE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1128:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_GET_LOG_PAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_GET_LOG_PAGE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1138:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_IDENTIFY {
//     pub Anonymous1: NVME_CDW11_IDENTIFY_0,
//     pub Anonymous2: NVME_CDW11_IDENTIFY_1,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_IDENTIFY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_IDENTIFY_0` (
    public var `NVMSETID`: UShort,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_IDENTIFY_1` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1161:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_RESERVATION_REPORT {
//     pub Anonymous: NVME_CDW11_RESERVATION_REPORT_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1167:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_RESERVATION_REPORT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_RESERVATION_REPORT_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1177:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW11_SANITIZE {
//     pub Anonymous: NVME_CDW11_SANITIZE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1183:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW11_SANITIZE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_SANITIZE_0` (
    public var `OVRPAT`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_SECURITY_RECEIVE` (
    public var `AL`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW11_SECURITY_SEND` (
    public var `TL`: UInt,
)
// UNSUPPORTED Rust 1203:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_DIRECTIVE_RECEIVE {
//     pub AllocateResources: NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1209:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_DIRECTIVE_RECEIVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1214:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES {
//     pub Anonymous: NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1220:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW12_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1230:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_DIRECTIVE_SEND {
//     pub EnableDirective: NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1236:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_DIRECTIVE_SEND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1241:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE {
//     pub Anonymous: NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1247:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW12_DIRECTIVE_SEND_IDENTIFY_ENABLE_DIRECTIVE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1257:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_FEATURES {
//     pub HostMemoryBuffer: NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1263:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1268:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER {
//     pub Anonymous: NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW12_FEATURE_HOST_MEMORY_BUFFER_0` (
    public var `HSIZE`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW12_GET_LOG_PAGE` (
    public var `LPOL`: UInt,
)
// UNSUPPORTED Rust 1289:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_READ_WRITE {
//     pub Anonymous: NVME_CDW12_READ_WRITE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1295:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_READ_WRITE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW12_READ_WRITE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1305:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW12_ZONE_APPEND {
//     pub Anonymous: NVME_CDW12_ZONE_APPEND_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1311:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW12_ZONE_APPEND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW12_ZONE_APPEND_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1321:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW13_FEATURES {
//     pub HostMemoryBuffer: NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW13_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1332:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER {
//     pub Anonymous: NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW13_FEATURE_HOST_MEMORY_BUFFER_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW13_GET_LOG_PAGE` (
    public var `LPOU`: UInt,
)
// UNSUPPORTED Rust 1353:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW13_READ_WRITE {
//     pub Anonymous: NVME_CDW13_READ_WRITE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1359:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW13_READ_WRITE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW13_READ_WRITE_0` (
    public var `DSM`: `NVME_CDW13_READ_WRITE_0_0`,
    public var `Reserved`: UByte,
    public var `DSPEC`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW13_READ_WRITE_0_0` (
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 1376:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW13_ZONE_MANAGEMENT_RECEIVE {
//     pub Anonymous: NVME_CDW13_ZONE_MANAGEMENT_RECEIVE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW13_ZONE_MANAGEMENT_RECEIVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW13_ZONE_MANAGEMENT_RECEIVE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1392:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW13_ZONE_MANAGEMENT_SEND {
//     pub Anonymous: NVME_CDW13_ZONE_MANAGEMENT_SEND_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1398:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW13_ZONE_MANAGEMENT_SEND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW13_ZONE_MANAGEMENT_SEND_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1408:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW14_FEATURES {
//     pub HostMemoryBuffer: NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1414:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW14_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1419:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER {
//     pub Anonymous: NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1425:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW14_FEATURE_HOST_MEMORY_BUFFER_0` (
    public var `HMDLUA`: UInt,
)
// UNSUPPORTED Rust 1435:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW14_GET_LOG_PAGE {
//     pub Anonymous: NVME_CDW14_GET_LOG_PAGE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1441:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW14_GET_LOG_PAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW14_GET_LOG_PAGE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1451:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW15_FEATURES {
//     pub HostMemoryBuffer: NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1457:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW15_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1462:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER {
//     pub Anonymous: NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1468:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW15_FEATURE_HOST_MEMORY_BUFFER_0` (
    public var `HMDLEC`: UInt,
)
// UNSUPPORTED Rust 1478:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW15_READ_WRITE {
//     pub Anonymous: NVME_CDW15_READ_WRITE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1484:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW15_READ_WRITE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW15_READ_WRITE_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1494:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CDW15_ZONE_APPEND {
//     pub Anonymous: NVME_CDW15_ZONE_APPEND_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1500:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CDW15_ZONE_APPEND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CDW15_ZONE_APPEND_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1024 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_CHANGED_NAMESPACE_LIST_LOG` (
    public var `NSID`: UIntArray,
)
// UNSUPPORTED Rust 1515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CHANGED_NAMESPACE_LIST_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 511 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_CHANGED_ZONE_LIST_LOG` (
    public var `ZoneIdentifiersCount`: UShort,
    public var `Reserved`: UByteArray,
    public var `ZoneIdentifier`: ULongArray,
)
// UNSUPPORTED Rust 1527:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CHANGED_ZONE_LIST_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_CMBSZ_SIZE_UNITS` = Int;
public const val `NVME_CMBSZ_SIZE_UNITS_16MB`: `NVME_CMBSZ_SIZE_UNITS` = 3;
public const val `NVME_CMBSZ_SIZE_UNITS_1MB`: `NVME_CMBSZ_SIZE_UNITS` = 2;
public const val `NVME_CMBSZ_SIZE_UNITS_256MB`: `NVME_CMBSZ_SIZE_UNITS` = 4;
public const val `NVME_CMBSZ_SIZE_UNITS_4GB`: `NVME_CMBSZ_SIZE_UNITS` = 5;
public const val `NVME_CMBSZ_SIZE_UNITS_4KB`: `NVME_CMBSZ_SIZE_UNITS` = 0;
public const val `NVME_CMBSZ_SIZE_UNITS_64GB`: `NVME_CMBSZ_SIZE_UNITS` = 6;
public const val `NVME_CMBSZ_SIZE_UNITS_64KB`: `NVME_CMBSZ_SIZE_UNITS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND` (
    public var `CDW0`: `NVME_COMMAND_DWORD0`,
    public var `NSID`: UInt,
    public var `Reserved0`: UIntArray,
    public var `MPTR`: ULong,
    public var `PRP1`: ULong,
    public var `PRP2`: ULong,
    public var `u`: `NVME_COMMAND_0`,
)
// UNSUPPORTED Rust 1551:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1556:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMMAND_0 {
//     pub GENERAL: NVME_COMMAND_0_0,
//     pub IDENTIFY: NVME_COMMAND_0_1,
//     pub ABORT: NVME_COMMAND_0_2,
//     pub GETFEATURES: NVME_COMMAND_0_3,
//     pub SETFEATURES: NVME_COMMAND_0_4,
//     pub GETLOGPAGE: NVME_COMMAND_0_5,
//     pub CREATEIOCQ: NVME_COMMAND_0_6,
//     pub CREATEIOSQ: NVME_COMMAND_0_7,
//     pub DATASETMANAGEMENT: NVME_COMMAND_0_8,
//     pub SECURITYSEND: NVME_COMMAND_0_9,
//     pub SECURITYRECEIVE: NVME_COMMAND_0_10,
//     pub FIRMWAREDOWNLOAD: NVME_COMMAND_0_11,
//     pub FIRMWAREACTIVATE: NVME_COMMAND_0_12,
//     pub FORMATNVM: NVME_COMMAND_0_13,
//     pub DIRECTIVERECEIVE: NVME_COMMAND_0_14,
//     pub DIRECTIVESEND: NVME_COMMAND_0_15,
//     pub SANITIZE: NVME_COMMAND_0_16,
//     pub READWRITE: NVME_COMMAND_0_17,
//     pub RESERVATIONACQUIRE: NVME_COMMAND_0_18,
//     pub RESERVATIONREGISTER: NVME_COMMAND_0_19,
//     pub RESERVATIONRELEASE: NVME_COMMAND_0_20,
//     pub RESERVATIONREPORT: NVME_COMMAND_0_21,
//     pub ZONEMANAGEMENTSEND: NVME_COMMAND_0_22,
//     pub ZONEMANAGEMENTRECEIVE: NVME_COMMAND_0_23,
//     pub ZONEAPPEND: NVME_COMMAND_0_24,
// }

// UNSUPPORTED Rust 1585:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_2` (
    public var `CDW10`: `NVME_CDW10_ABORT`,
    public var `CDW11`: UInt,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1600:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_6` (
    public var `CDW10`: `NVME_CDW10_CREATE_IO_QUEUE`,
    public var `CDW11`: `NVME_CDW11_CREATE_IO_CQ`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1615:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_7` (
    public var `CDW10`: `NVME_CDW10_CREATE_IO_QUEUE`,
    public var `CDW11`: `NVME_CDW11_CREATE_IO_SQ`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_8` (
    public var `CDW10`: `NVME_CDW10_DATASET_MANAGEMENT`,
    public var `CDW11`: `NVME_CDW11_DATASET_MANAGEMENT`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1645:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_8 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_14` (
    public var `CDW10`: `NVME_CDW10_DIRECTIVE_RECEIVE`,
    public var `CDW11`: `NVME_CDW11_DIRECTIVE_RECEIVE`,
    public var `CDW12`: `NVME_CDW12_DIRECTIVE_RECEIVE`,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1660:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_14 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_15` (
    public var `CDW10`: `NVME_CDW10_DIRECTIVE_SEND`,
    public var `CDW11`: `NVME_CDW11_DIRECTIVE_SEND`,
    public var `CDW12`: `NVME_CDW12_DIRECTIVE_SEND`,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1675:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_15 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_12` (
    public var `CDW10`: `NVME_CDW10_FIRMWARE_ACTIVATE`,
    public var `CDW11`: UInt,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1690:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_12 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMMAND_0_11` (
    public var `CDW10`: `NVME_CDW10_FIRMWARE_DOWNLOAD`,
    public var `CDW11`: `NVME_CDW11_FIRMWARE_DOWNLOAD`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_13` (
    public var `CDW10`: `NVME_CDW10_FORMAT_NVM`,
    public var `CDW11`: UInt,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1715:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_13 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMMAND_0_0` (
    public var `CDW10`: UInt,
    public var `CDW11`: UInt,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_3` (
    public var `CDW10`: `NVME_CDW10_GET_FEATURES`,
    public var `CDW11`: `NVME_CDW11_FEATURES`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1740:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_5` (
    public var `Anonymous`: `NVME_COMMAND_0_5_0`,
    public var `CDW11`: `NVME_CDW11_GET_LOG_PAGE`,
    public var `CDW12`: `NVME_CDW12_GET_LOG_PAGE`,
    public var `CDW13`: `NVME_CDW13_GET_LOG_PAGE`,
    public var `CDW14`: `NVME_CDW14_GET_LOG_PAGE`,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1755:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1760:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMMAND_0_5_0 {
//     pub CDW10: NVME_CDW10_GET_LOG_PAGE,
//     pub CDW10_V13: NVME_CDW10_GET_LOG_PAGE_V13,
// }

// UNSUPPORTED Rust 1766:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_5_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_1` (
    public var `CDW10`: `NVME_CDW10_IDENTIFY`,
    public var `CDW11`: `NVME_CDW11_IDENTIFY`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1781:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_17` (
    public var `LBALOW`: UInt,
    public var `LBAHIGH`: UInt,
    public var `CDW12`: `NVME_CDW12_READ_WRITE`,
    public var `CDW13`: `NVME_CDW13_READ_WRITE`,
    public var `CDW14`: UInt,
    public var `CDW15`: `NVME_CDW15_READ_WRITE`,
)
// UNSUPPORTED Rust 1796:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_17 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_18` (
    public var `CDW10`: `NVME_CDW10_RESERVATION_ACQUIRE`,
    public var `CDW11`: UInt,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1811:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_18 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_19` (
    public var `CDW10`: `NVME_CDW10_RESERVATION_REGISTER`,
    public var `CDW11`: UInt,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1826:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_19 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_20` (
    public var `CDW10`: `NVME_CDW10_RESERVATION_RELEASE`,
    public var `CDW11`: UInt,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1841:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_20 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_21` (
    public var `CDW10`: `NVME_CDW10_RESERVATION_REPORT`,
    public var `CDW11`: `NVME_CDW11_RESERVATION_REPORT`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1856:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_21 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_16` (
    public var `CDW10`: `NVME_CDW10_SANITIZE`,
    public var `CDW11`: `NVME_CDW11_SANITIZE`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_10` (
    public var `CDW10`: `NVME_CDW10_SECURITY_SEND_RECEIVE`,
    public var `CDW11`: `NVME_CDW11_SECURITY_RECEIVE`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1886:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_9` (
    public var `CDW10`: `NVME_CDW10_SECURITY_SEND_RECEIVE`,
    public var `CDW11`: `NVME_CDW11_SECURITY_SEND`,
    public var `CDW12`: UInt,
    public var `CDW13`: UInt,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1901:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_4` (
    public var `CDW10`: `NVME_CDW10_SET_FEATURES`,
    public var `CDW11`: `NVME_CDW11_FEATURES`,
    public var `CDW12`: `NVME_CDW12_FEATURES`,
    public var `CDW13`: `NVME_CDW13_FEATURES`,
    public var `CDW14`: `NVME_CDW14_FEATURES`,
    public var `CDW15`: `NVME_CDW15_FEATURES`,
)
// UNSUPPORTED Rust 1916:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_24` (
    public var `CDW1011`: `NVME_CDW10_ZONE_APPEND`,
    public var `CDW12`: `NVME_CDW12_ZONE_APPEND`,
    public var `CDW13`: UInt,
    public var `ILBRT`: UInt,
    public var `CDW15`: `NVME_CDW15_ZONE_APPEND`,
)
// UNSUPPORTED Rust 1930:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_24 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_23` (
    public var `CDW1011`: `NVME_CDW10_ZONE_MANAGEMENT_RECEIVE`,
    public var `DWORDCOUNT`: UInt,
    public var `CDW13`: `NVME_CDW13_ZONE_MANAGEMENT_RECEIVE`,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1944:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_23 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_0_22` (
    public var `CDW1011`: `NVME_CDW10_ZONE_MANAGEMENT_SEND`,
    public var `CDW12`: UInt,
    public var `CDW13`: `NVME_CDW13_ZONE_MANAGEMENT_SEND`,
    public var `CDW14`: UInt,
    public var `CDW15`: UInt,
)
// UNSUPPORTED Rust 1958:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_0_22 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1963:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMMAND_DWORD0 {
//     pub Anonymous: NVME_COMMAND_DWORD0_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1969:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_DWORD0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMMAND_DWORD0_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1979:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMMAND_EFFECTS_DATA {
//     pub Anonymous: NVME_COMMAND_EFFECTS_DATA_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1985:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_EFFECTS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMMAND_EFFECTS_DATA_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2048 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMMAND_EFFECTS_LOG` (
    public var `ACS`: Array<`NVME_COMMAND_EFFECTS_DATA`>,
    public var `IOCS`: Array<`NVME_COMMAND_EFFECTS_DATA`>,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 2002:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_EFFECTS_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMITS` = Int;
public const val `NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMIT_NONE`: `NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMITS` = 0;
public const val `NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMIT_SINGLE_PER_CONTROLLER`: `NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMITS` = 2;
public const val `NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMIT_SINGLE_PER_NAMESPACE`: `NVME_COMMAND_EFFECT_SBUMISSION_EXECUTION_LIMITS` = 1;
public typealias `NVME_COMMAND_SET_IDENTIFIERS` = Int;
public const val `NVME_COMMAND_SET_KEY_VALUE`: `NVME_COMMAND_SET_IDENTIFIERS` = 1;
public const val `NVME_COMMAND_SET_NVM`: `NVME_COMMAND_SET_IDENTIFIERS` = 0;
public const val `NVME_COMMAND_SET_ZONED_NAMESPACE`: `NVME_COMMAND_SET_IDENTIFIERS` = 2;
// UNSUPPORTED Rust 2015:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMMAND_STATUS {
//     pub Anonymous: NVME_COMMAND_STATUS_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 2021:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMMAND_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMMAND_STATUS_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMPLETION_DW0_ASYNC_EVENT_REQUEST` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMPLETION_DW0_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES` (
    public var `Anonymous`: `NVME_COMPLETION_DW0_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0`,
    public var `AsUlong`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMPLETION_DW0_DIRECTIVE_RECEIVE_STREAMS_ALLOCATE_RESOURCES_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMPLETION_ENTRY` (
    public var `DW0`: UInt,
    public var `DW1`: UInt,
    public var `DW2`: `NVME_COMPLETION_ENTRY_0`,
    public var `DW3`: `NVME_COMPLETION_ENTRY_1`,
)
// UNSUPPORTED Rust 2055:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMPLETION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2060:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMPLETION_ENTRY_0 {
//     pub Anonymous: NVME_COMPLETION_ENTRY_0_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2066:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMPLETION_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMPLETION_ENTRY_0_0` (
    public var `SQHD`: UShort,
    public var `SQID`: UShort,
)
// UNSUPPORTED Rust 2077:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMPLETION_ENTRY_1 {
//     pub Anonymous: NVME_COMPLETION_ENTRY_1_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2083:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMPLETION_ENTRY_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_COMPLETION_ENTRY_1_0` (
    public var `CID`: UShort,
    public var `Status`: `NVME_COMMAND_STATUS`,
)
// UNSUPPORTED Rust 2094:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMPLETION_ENTRY_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2099:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_COMPLETION_QUEUE_HEAD_DOORBELL {
//     pub Anonymous: NVME_COMPLETION_QUEUE_HEAD_DOORBELL_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2105:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_COMPLETION_QUEUE_HEAD_DOORBELL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_COMPLETION_QUEUE_HEAD_DOORBELL_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 2115:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CONTEXT_ATTRIBUTES {
//     pub Anonymous: NVME_CONTEXT_ATTRIBUTES_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTEXT_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CONTEXT_ATTRIBUTES_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 2131:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CONTROLLER_CAPABILITIES {
//     pub Anonymous: NVME_CONTROLLER_CAPABILITIES_0,
//     pub AsUlonglong: u64,
// }

// UNSUPPORTED Rust 2137:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTROLLER_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CONTROLLER_CAPABILITIES_0` (
    public var `_bitfield`: ULong,
)
// UNSUPPORTED Rust 2147:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CONTROLLER_CONFIGURATION {
//     pub Anonymous: NVME_CONTROLLER_CONFIGURATION_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2153:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTROLLER_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CONTROLLER_CONFIGURATION_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2047 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_CONTROLLER_LIST` (
    public var `NumberOfIdentifiers`: UShort,
    public var `ControllerID`: UShortArray,
)
// UNSUPPORTED Rust 2169:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTROLLER_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2174:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CONTROLLER_MEMORY_BUFFER_LOCATION {
//     pub Anonymous: NVME_CONTROLLER_MEMORY_BUFFER_LOCATION_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2180:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTROLLER_MEMORY_BUFFER_LOCATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CONTROLLER_MEMORY_BUFFER_LOCATION_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 2190:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CONTROLLER_MEMORY_BUFFER_SIZE {
//     pub Anonymous: NVME_CONTROLLER_MEMORY_BUFFER_SIZE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2196:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTROLLER_MEMORY_BUFFER_SIZE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CONTROLLER_MEMORY_BUFFER_SIZE_0` (
    public var `_bitfield`: UInt,
)
public const val `NVME_CONTROLLER_METADATA_CHIPSET_DRIVER_NAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 8;
public const val `NVME_CONTROLLER_METADATA_CHIPSET_DRIVER_VERSION`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 9;
public const val `NVME_CONTROLLER_METADATA_DISPLAY_DRIVER_NAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 14;
public const val `NVME_CONTROLLER_METADATA_DISPLAY_DRIVER_VERSION`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 15;
public typealias `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = Int;
public const val `NVME_CONTROLLER_METADATA_FIRMWARE_VERSION`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 12;
public const val `NVME_CONTROLLER_METADATA_HOST_DETERMINED_FAILURE_RECORD`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 16;
public const val `NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_CONTROLLER_NAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 1;
public const val `NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_DRIVER_FILENAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 13;
public const val `NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_DRIVER_NAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 2;
public const val `NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_DRIVER_VERSION`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 3;
public const val `NVME_CONTROLLER_METADATA_OPERATING_SYSTEM_NAME_AND_BUILD`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 10;
public const val `NVME_CONTROLLER_METADATA_PREBOOT_CONTROLLER_NAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 4;
public const val `NVME_CONTROLLER_METADATA_PREBOOT_DRIVER_NAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 5;
public const val `NVME_CONTROLLER_METADATA_PREBOOT_DRIVER_VERSION`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 6;
public const val `NVME_CONTROLLER_METADATA_SYSTEM_PROCESSOR_MODEL`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 7;
public const val `NVME_CONTROLLER_METADATA_SYSTEM_PRODUCT_NAME`: `NVME_CONTROLLER_METADATA_ELEMENT_TYPES` = 11;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 944 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_CONTROLLER_REGISTERS` (
    public var `CAP`: `NVME_CONTROLLER_CAPABILITIES`,
    public var `VS`: `NVME_VERSION`,
    public var `INTMS`: UInt,
    public var `INTMC`: UInt,
    public var `CC`: `NVME_CONTROLLER_CONFIGURATION`,
    public var `Reserved0`: UInt,
    public var `CSTS`: `NVME_CONTROLLER_STATUS`,
    public var `NSSR`: `NVME_NVM_SUBSYSTEM_RESET`,
    public var `AQA`: `NVME_ADMIN_QUEUE_ATTRIBUTES`,
    public var `ASQ`: `NVME_ADMIN_SUBMISSION_QUEUE_BASE_ADDRESS`,
    public var `ACQ`: `NVME_ADMIN_COMPLETION_QUEUE_BASE_ADDRESS`,
    public var `CMBLOC`: `NVME_CONTROLLER_MEMORY_BUFFER_LOCATION`,
    public var `CMBSZ`: `NVME_CONTROLLER_MEMORY_BUFFER_SIZE`,
    public var `Reserved2`: UIntArray,
    public var `Reserved3`: UIntArray,
    public var `Doorbells`: UIntArray,
)
// UNSUPPORTED Rust 2243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTROLLER_REGISTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2248:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_CONTROLLER_STATUS {
//     pub Anonymous: NVME_CONTROLLER_STATUS_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 2254:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_CONTROLLER_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_CONTROLLER_STATUS_0` (
    public var `_bitfield`: UInt,
)
public const val `NVME_CSS_ADMIN_COMMAND_SET_ONLY`: `NVME_CSS_COMMAND_SETS` = 7;
public const val `NVME_CSS_ALL_SUPPORTED_IO_COMMAND_SET`: `NVME_CSS_COMMAND_SETS` = 6;
public typealias `NVME_CSS_COMMAND_SETS` = Int;
public const val `NVME_CSS_NVM_COMMAND_SET`: `NVME_CSS_COMMAND_SETS` = 0;
public const val `NVME_CSTS_SHST_NO_SHUTDOWN`: `NVME_CSTS_SHST_SHUTDOWN_STATUS` = 0;
public const val `NVME_CSTS_SHST_SHUTDOWN_COMPLETED`: `NVME_CSTS_SHST_SHUTDOWN_STATUS` = 2;
public const val `NVME_CSTS_SHST_SHUTDOWN_IN_PROCESS`: `NVME_CSTS_SHST_SHUTDOWN_STATUS` = 1;
public typealias `NVME_CSTS_SHST_SHUTDOWN_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_DEVICE_SELF_TEST_LOG` (
    public var `CurrentOperation`: `NVME_DEVICE_SELF_TEST_LOG_0`,
    public var `CurrentCompletion`: `NVME_DEVICE_SELF_TEST_LOG_1`,
    public var `Reserved`: UByteArray,
    public var `ResultData`: Array<`NVME_DEVICE_SELF_TEST_RESULT_DATA`>,
)
// UNSUPPORTED Rust 2280:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_DEVICE_SELF_TEST_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_DEVICE_SELF_TEST_LOG_1` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_DEVICE_SELF_TEST_LOG_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_DEVICE_SELF_TEST_RESULT_DATA` (
    public var `Status`: `NVME_DEVICE_SELF_TEST_RESULT_DATA_0`,
    public var `SegmentNumber`: UByte,
    public var `ValidDiagnostics`: `NVME_DEVICE_SELF_TEST_RESULT_DATA_1`,
    public var `Reserved`: UByte,
    public var `POH`: ULong,
    public var `NSID`: UInt,
    public var `FailingLBA`: ULong,
    public var `StatusCodeType`: `NVME_DEVICE_SELF_TEST_RESULT_DATA_2`,
    public var `StatusCode`: UByte,
    public var `VendorSpecific`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_DEVICE_SELF_TEST_RESULT_DATA_2` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_DEVICE_SELF_TEST_RESULT_DATA_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_DEVICE_SELF_TEST_RESULT_DATA_1` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS` (
    public var `DirectivesSupported`: `NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR`,
    public var `DirectivesEnabled`: `NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 31 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR` (
    public var `_bitfield`: UByte,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 2336:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_DIRECTIVE_IDENTIFY_RETURN_PARAMETERS_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_DIRECTIVE_RECEIVE_IDENTIFY_OPERATIONS` = Int;
public const val `NVME_DIRECTIVE_RECEIVE_IDENTIFY_OPERATION_RETURN_PARAMETERS`: `NVME_DIRECTIVE_RECEIVE_IDENTIFY_OPERATIONS` = 1;
public typealias `NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATIONS` = Int;
public const val `NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATION_ALLOCATE_RESOURCES`: `NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATIONS` = 3;
public const val `NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATION_GET_STATUS`: `NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATIONS` = 2;
public const val `NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATION_RETURN_PARAMETERS`: `NVME_DIRECTIVE_RECEIVE_STREAMS_OPERATIONS` = 1;
public typealias `NVME_DIRECTIVE_SEND_IDENTIFY_OPERATIONS` = Int;
public const val `NVME_DIRECTIVE_SEND_IDENTIFY_OPERATION_ENABLE_DIRECTIVE`: `NVME_DIRECTIVE_SEND_IDENTIFY_OPERATIONS` = 1;
public typealias `NVME_DIRECTIVE_SEND_STREAMS_OPERATIONS` = Int;
public const val `NVME_DIRECTIVE_SEND_STREAMS_OPERATION_RELEASE_IDENTIFIER`: `NVME_DIRECTIVE_SEND_STREAMS_OPERATIONS` = 1;
public const val `NVME_DIRECTIVE_SEND_STREAMS_OPERATION_RELEASE_RESOURCES`: `NVME_DIRECTIVE_SEND_STREAMS_OPERATIONS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 65535 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_DIRECTIVE_STREAMS_GET_STATUS_DATA` (
    public var `OpenStreamCount`: UShort,
    public var `StreamIdentifiers`: UShortArray,
)
// UNSUPPORTED Rust 2358:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_DIRECTIVE_STREAMS_GET_STATUS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_DIRECTIVE_STREAMS_RETURN_PARAMETERS` (
    public var `MSL`: UShort,
    public var `NSSA`: UShort,
    public var `NSSO`: UShort,
    public var `Reserved0`: UByteArray,
    public var `SWS`: UInt,
    public var `SGS`: UShort,
    public var `NSA`: UShort,
    public var `NSO`: UShort,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 2376:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_DIRECTIVE_STREAMS_RETURN_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_DIRECTIVE_TYPES` = Int;
public const val `NVME_DIRECTIVE_TYPE_IDENTIFY`: `NVME_DIRECTIVE_TYPES` = 0;
public const val `NVME_DIRECTIVE_TYPE_STREAMS`: `NVME_DIRECTIVE_TYPES` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 26 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 416 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_ENDURANCE_GROUP_LOG` (
    public var `Reserved0`: UInt,
    public var `AvailableSpareThreshold`: UByte,
    public var `PercentageUsed`: UByte,
    public var `Reserved1`: UByteArray,
    public var `EnduranceEstimate`: UByteArray,
    public var `DataUnitsRead`: UByteArray,
    public var `DataUnitsWritten`: UByteArray,
    public var `MediaUnitsWritten`: UByteArray,
    public var `Reserved2`: UByteArray,
)
// UNSUPPORTED Rust 2397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ENDURANCE_GROUP_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 24 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_ERROR_INFO_LOG` (
    public var `ErrorCount`: ULong,
    public var `SQID`: UShort,
    public var `CMDID`: UShort,
    public var `Status`: `NVME_COMMAND_STATUS`,
    public var `ParameterErrorLocation`: `NVME_ERROR_INFO_LOG_0`,
    public var `Lba`: ULong,
    public var `NameSpace`: UInt,
    public var `VendorInfoAvailable`: UByte,
    public var `Reserved0`: UByteArray,
    public var `CommandSpecificInfo`: ULong,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 2417:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ERROR_INFO_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ERROR_INFO_LOG_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 28 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_ERROR_INJECTION_ENTRY` (
    public var `Flags`: `NVME_ERROR_INJECTION_ENTRY_0`,
    public var `Reserved1`: UByte,
    public var `ErrorInjectionType`: UShort,
    public var `ErrorInjectionTypeSpecific`: UByteArray,
)
// UNSUPPORTED Rust 2435:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ERROR_INJECTION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2440:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_ERROR_INJECTION_ENTRY_0 {
//     pub Anonymous: NVME_ERROR_INJECTION_ENTRY_0_0,
//     pub AsUchar: u8,
// }

// UNSUPPORTED Rust 2446:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ERROR_INJECTION_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ERROR_INJECTION_ENTRY_0_0` (
    public var `_bitfield`: UByte,
)
public typealias `NVME_ERROR_INJECTION_TYPES` = Int;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_CPU_CONTROLLER_HANG`: `NVME_ERROR_INJECTION_TYPES` = 1;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_DRAM_CORRUPTION_CRITICAL`: `NVME_ERROR_INJECTION_TYPES` = 5;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_DRAM_CORRUPTION_NONCRITICAL`: `NVME_ERROR_INJECTION_TYPES` = 6;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_HW_MALFUNCTION`: `NVME_ERROR_INJECTION_TYPES` = 9;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_LOGICAL_FW_ERROR`: `NVME_ERROR_INJECTION_TYPES` = 4;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_NAND_CORRUPTION`: `NVME_ERROR_INJECTION_TYPES` = 7;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_NAND_HANG`: `NVME_ERROR_INJECTION_TYPES` = 2;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_PLP_DEFECT`: `NVME_ERROR_INJECTION_TYPES` = 3;
public const val `NVME_ERROR_INJECTION_TYPE_DEVICE_PANIC_SRAM_CORRUPTION`: `NVME_ERROR_INJECTION_TYPES` = 8;
public const val `NVME_ERROR_INJECTION_TYPE_MAX`: `NVME_ERROR_INJECTION_TYPES` = 65535;
public const val `NVME_ERROR_INJECTION_TYPE_RESERVED0`: `NVME_ERROR_INJECTION_TYPES` = 0;
public const val `NVME_ERROR_INJECTION_TYPE_RESERVED1`: `NVME_ERROR_INJECTION_TYPES` = 10;
public const val `NVME_EXTENDED_HOST_IDENTIFIER_SIZE`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_EXTENDED_REPORT_ZONE_INFO` (
    public var `ZoneCount`: ULong,
    public var `Reserved`: ULongArray,
    public var `Desc`: Array<`NVME_ZONE_EXTENDED_REPORT_ZONE_DESC`>,
)
// UNSUPPORTED Rust 2477:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_EXTENDED_REPORT_ZONE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_FEATURES` = Int;
public const val `NVME_FEATURE_ARBITRATION`: `NVME_FEATURES` = 1;
public const val `NVME_FEATURE_ASYNC_EVENT_CONFIG`: `NVME_FEATURES` = 11;
public const val `NVME_FEATURE_AUTONOMOUS_POWER_STATE_TRANSITION`: `NVME_FEATURES` = 12;
public const val `NVME_FEATURE_CLEAR_FW_UPDATE_HISTORY`: `NVME_FEATURES` = 193;
public const val `NVME_FEATURE_CLEAR_PCIE_CORRECTABLE_ERROR_COUNTERS`: `NVME_FEATURES` = 195;
public const val `NVME_FEATURE_CONTROLLER_METADATA`: `NVME_FEATURES` = 126;
public const val `NVME_FEATURE_ENABLE_IEEE1667_SILO`: `NVME_FEATURES` = 196;
public const val `NVME_FEATURE_ENDURANCE_GROUP_EVENT_CONFIG`: `NVME_FEATURES` = 24;
public const val `NVME_FEATURE_ENHANCED_CONTROLLER_METADATA`: `NVME_FEATURES` = 125;
public const val `NVME_FEATURE_ERROR_INJECTION`: `NVME_FEATURES` = 192;
public const val `NVME_FEATURE_ERROR_RECOVERY`: `NVME_FEATURES` = 5;
public const val `NVME_FEATURE_HOST_BEHAVIOR_SUPPORT`: `NVME_FEATURES` = 22;
public const val `NVME_FEATURE_HOST_CONTROLLED_THERMAL_MANAGEMENT`: `NVME_FEATURES` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_FEATURE_HOST_IDENTIFIER_DATA` (
    public var `HOSTID`: UByteArray,
)
// UNSUPPORTED Rust 2501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_FEATURE_HOST_IDENTIFIER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_FEATURE_HOST_MEMORY_BUFFER`: `NVME_FEATURES` = 13;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4094 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_FEATURE_HOST_METADATA_DATA` (
    public var `NumberOfMetadataElementDescriptors`: UByte,
    public var `Reserved0`: UByte,
    public var `MetadataElementDescriptors`: UByteArray,
)
// UNSUPPORTED Rust 2514:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_FEATURE_HOST_METADATA_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_FEATURE_INTERRUPT_COALESCING`: `NVME_FEATURES` = 8;
public const val `NVME_FEATURE_INTERRUPT_VECTOR_CONFIG`: `NVME_FEATURES` = 9;
public const val `NVME_FEATURE_IO_COMMAND_SET_PROFILE`: `NVME_FEATURES` = 25;
public const val `NVME_FEATURE_KEEP_ALIVE`: `NVME_FEATURES` = 15;
public const val `NVME_FEATURE_LBA_RANGE_TYPE`: `NVME_FEATURES` = 3;
public const val `NVME_FEATURE_LBA_STATUS_INFORMATION_REPORT_INTERVAL`: `NVME_FEATURES` = 21;
public const val `NVME_FEATURE_NAMESPACE_METADATA`: `NVME_FEATURES` = 127;
public const val `NVME_FEATURE_NONOPERATIONAL_POWER_STATE`: `NVME_FEATURES` = 17;
public const val `NVME_FEATURE_NUMBER_OF_QUEUES`: `NVME_FEATURES` = 7;
public const val `NVME_FEATURE_NVM_HOST_IDENTIFIER`: `NVME_FEATURES` = 129;
public const val `NVME_FEATURE_NVM_NAMESPACE_WRITE_PROTECTION_CONFIG`: `NVME_FEATURES` = 132;
public const val `NVME_FEATURE_NVM_RESERVATION_NOTIFICATION_MASK`: `NVME_FEATURES` = 130;
public const val `NVME_FEATURE_NVM_RESERVATION_PERSISTANCE`: `NVME_FEATURES` = 131;
public const val `NVME_FEATURE_NVM_SOFTWARE_PROGRESS_MARKER`: `NVME_FEATURES` = 128;
public const val `NVME_FEATURE_PLP_HEALTH_MONITOR`: `NVME_FEATURES` = 197;
public const val `NVME_FEATURE_POWER_MANAGEMENT`: `NVME_FEATURES` = 2;
public const val `NVME_FEATURE_PREDICTABLE_LATENCY_MODE_CONFIG`: `NVME_FEATURES` = 19;
public const val `NVME_FEATURE_PREDICTABLE_LATENCY_MODE_WINDOW`: `NVME_FEATURES` = 20;
public const val `NVME_FEATURE_READONLY_WRITETHROUGH_MODE`: `NVME_FEATURES` = 194;
public const val `NVME_FEATURE_READ_RECOVERY_LEVEL_CONFIG`: `NVME_FEATURES` = 18;
public const val `NVME_FEATURE_SANITIZE_CONFIG`: `NVME_FEATURES` = 23;
public const val `NVME_FEATURE_TEMPERATURE_THRESHOLD`: `NVME_FEATURES` = 4;
public const val `NVME_FEATURE_TIMESTAMP`: `NVME_FEATURES` = 14;
public typealias `NVME_FEATURE_VALUE_CODES` = Int;
public const val `NVME_FEATURE_VALUE_CURRENT`: `NVME_FEATURE_VALUE_CODES` = 0;
public const val `NVME_FEATURE_VALUE_DEFAULT`: `NVME_FEATURE_VALUE_CODES` = 1;
public const val `NVME_FEATURE_VALUE_SAVED`: `NVME_FEATURE_VALUE_CODES` = 2;
public const val `NVME_FEATURE_VALUE_SUPPORTED_CAPABILITIES`: `NVME_FEATURE_VALUE_CODES` = 3;
public const val `NVME_FEATURE_VOLATILE_WRITE_CACHE`: `NVME_FEATURES` = 6;
public const val `NVME_FEATURE_WRITE_ATOMICITY`: `NVME_FEATURES` = 10;
public typealias `NVME_FIRMWARE_ACTIVATE_ACTIONS` = Int;
public const val `NVME_FIRMWARE_ACTIVATE_ACTION_ACTIVATE`: `NVME_FIRMWARE_ACTIVATE_ACTIONS` = 2;
public const val `NVME_FIRMWARE_ACTIVATE_ACTION_DOWNLOAD_TO_SLOT`: `NVME_FIRMWARE_ACTIVATE_ACTIONS` = 0;
public const val `NVME_FIRMWARE_ACTIVATE_ACTION_DOWNLOAD_TO_SLOT_AND_ACTIVATE`: `NVME_FIRMWARE_ACTIVATE_ACTIONS` = 1;
public const val `NVME_FIRMWARE_ACTIVATE_ACTION_DOWNLOAD_TO_SLOT_AND_ACTIVATE_IMMEDIATE`: `NVME_FIRMWARE_ACTIVATE_ACTIONS` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 448 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_FIRMWARE_SLOT_INFO_LOG` (
    public var `AFI`: `NVME_FIRMWARE_SLOT_INFO_LOG_0`,
    public var `Reserved0`: UByteArray,
    public var `FRS`: ULongArray,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 2562:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_FIRMWARE_SLOT_INFO_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_FIRMWARE_SLOT_INFO_LOG_0` (
    public var `_bitfield`: UByte,
)
public typealias `NVME_FUSED_OPERATION_CODES` = Int;
public const val `NVME_FUSED_OPERATION_FIRST_CMD`: `NVME_FUSED_OPERATION_CODES` = 1;
public const val `NVME_FUSED_OPERATION_NORMAL`: `NVME_FUSED_OPERATION_CODES` = 0;
public const val `NVME_FUSED_OPERATION_SECOND_CMD`: `NVME_FUSED_OPERATION_CODES` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 26 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 296 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_HEALTH_INFO_LOG` (
    public var `CriticalWarning`: `NVME_HEALTH_INFO_LOG_0`,
    public var `Temperature`: UByteArray,
    public var `AvailableSpare`: UByte,
    public var `AvailableSpareThreshold`: UByte,
    public var `PercentageUsed`: UByte,
    public var `Reserved0`: UByteArray,
    public var `DataUnitRead`: UByteArray,
    public var `DataUnitWritten`: UByteArray,
    public var `HostReadCommands`: UByteArray,
    public var `HostWrittenCommands`: UByteArray,
    public var `ControllerBusyTime`: UByteArray,
    public var `PowerCycle`: UByteArray,
    public var `PowerOnHours`: UByteArray,
    public var `UnsafeShutdowns`: UByteArray,
    public var `MediaErrors`: UByteArray,
    public var `ErrorInfoLogEntryCount`: UByteArray,
    public var `WarningCompositeTemperatureTime`: UInt,
    public var `CriticalCompositeTemperatureTime`: UInt,
    public var `TemperatureSensor1`: UShort,
    public var `TemperatureSensor2`: UShort,
    public var `TemperatureSensor3`: UShort,
    public var `TemperatureSensor4`: UShort,
    public var `TemperatureSensor5`: UShort,
    public var `TemperatureSensor6`: UShort,
    public var `TemperatureSensor7`: UShort,
    public var `TemperatureSensor8`: UShort,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 2607:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_HEALTH_INFO_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2612:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_HEALTH_INFO_LOG_0 {
//     pub Anonymous: NVME_HEALTH_INFO_LOG_0_0,
//     pub AsUchar: u8,
// }

// UNSUPPORTED Rust 2618:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_HEALTH_INFO_LOG_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_HEALTH_INFO_LOG_0_0` (
    public var `_bitfield`: UByte,
)
public const val `NVME_HOST_IDENTIFIER_SIZE`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_HOST_MEMORY_BUFFER_DESCRIPTOR_ENTRY` (
    public var `BADD`: ULong,
    public var `BSIZE`: UInt,
    public var `Reserved`: UInt,
)
public const val `NVME_HOST_METADATA_ADD_ENTRY_MULTIPLE`: `NVME_HOST_METADATA_ELEMENT_ACTIONS` = 2;
public const val `NVME_HOST_METADATA_ADD_REPLACE_ENTRY`: `NVME_HOST_METADATA_ELEMENT_ACTIONS` = 0;
public const val `NVME_HOST_METADATA_DELETE_ENTRY_MULTIPLE`: `NVME_HOST_METADATA_ELEMENT_ACTIONS` = 1;
public typealias `NVME_HOST_METADATA_ELEMENT_ACTIONS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_HOST_METADATA_ELEMENT_DESCRIPTOR` (
    public var `_bitfield`: UInt,
    public var `EVAL`: UByteArray,
)
// UNSUPPORTED Rust 2646:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_HOST_METADATA_ELEMENT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_IDENTIFIER_TYPE` = Int;
public const val `NVME_IDENTIFIER_TYPE_CSI`: `NVME_IDENTIFIER_TYPE` = 4;
public const val `NVME_IDENTIFIER_TYPE_CSI_LENGTH`: `NVME_IDENTIFIER_TYPE_LENGTH` = 1;
public const val `NVME_IDENTIFIER_TYPE_EUI64`: `NVME_IDENTIFIER_TYPE` = 1;
public const val `NVME_IDENTIFIER_TYPE_EUI64_LENGTH`: `NVME_IDENTIFIER_TYPE_LENGTH` = 8;
public typealias `NVME_IDENTIFIER_TYPE_LENGTH` = Int;
public const val `NVME_IDENTIFIER_TYPE_NGUID`: `NVME_IDENTIFIER_TYPE` = 2;
public const val `NVME_IDENTIFIER_TYPE_NGUID_LENGTH`: `NVME_IDENTIFIER_TYPE_LENGTH` = 16;
public const val `NVME_IDENTIFIER_TYPE_UUID`: `NVME_IDENTIFIER_TYPE` = 3;
public const val `NVME_IDENTIFIER_TYPE_UUID_LENGTH`: `NVME_IDENTIFIER_TYPE_LENGTH` = 16;
public const val `NVME_IDENTIFY_CNS_ACTIVE_NAMESPACES`: `NVME_IDENTIFY_CNS_CODES` = 2;
public const val `NVME_IDENTIFY_CNS_ACTIVE_NAMESPACE_LIST_IO_COMMAND_SET`: `NVME_IDENTIFY_CNS_CODES` = 7;
public const val `NVME_IDENTIFY_CNS_ALLOCATED_NAMESPACE`: `NVME_IDENTIFY_CNS_CODES` = 17;
public const val `NVME_IDENTIFY_CNS_ALLOCATED_NAMESPACE_IO_COMMAND_SET`: `NVME_IDENTIFY_CNS_CODES` = 27;
public const val `NVME_IDENTIFY_CNS_ALLOCATED_NAMESPACE_LIST`: `NVME_IDENTIFY_CNS_CODES` = 16;
public const val `NVME_IDENTIFY_CNS_ALLOCATED_NAMSPACE_LIST_IO_COMMAND_SET`: `NVME_IDENTIFY_CNS_CODES` = 26;
public typealias `NVME_IDENTIFY_CNS_CODES` = Int;
public const val `NVME_IDENTIFY_CNS_CONTROLLER`: `NVME_IDENTIFY_CNS_CODES` = 1;
public const val `NVME_IDENTIFY_CNS_CONTROLLER_LIST_OF_NSID`: `NVME_IDENTIFY_CNS_CODES` = 18;
public const val `NVME_IDENTIFY_CNS_CONTROLLER_LIST_OF_NVM_SUBSYSTEM`: `NVME_IDENTIFY_CNS_CODES` = 19;
public const val `NVME_IDENTIFY_CNS_DESCRIPTOR_NAMESPACE`: `NVME_IDENTIFY_CNS_CODES` = 3;
public const val `NVME_IDENTIFY_CNS_DESCRIPTOR_NAMESPACE_SIZE`: UInt = 4096u;
public const val `NVME_IDENTIFY_CNS_DOMAIN_LIST`: `NVME_IDENTIFY_CNS_CODES` = 24;
public const val `NVME_IDENTIFY_CNS_ENDURANCE_GROUP_LIST`: `NVME_IDENTIFY_CNS_CODES` = 25;
public const val `NVME_IDENTIFY_CNS_IO_COMMAND_SET`: `NVME_IDENTIFY_CNS_CODES` = 28;
public const val `NVME_IDENTIFY_CNS_NAMESPACE_GRANULARITY_LIST`: `NVME_IDENTIFY_CNS_CODES` = 22;
public const val `NVME_IDENTIFY_CNS_NVM_SET`: `NVME_IDENTIFY_CNS_CODES` = 4;
public const val `NVME_IDENTIFY_CNS_PRIMARY_CONTROLLER_CAPABILITIES`: `NVME_IDENTIFY_CNS_CODES` = 20;
public const val `NVME_IDENTIFY_CNS_SECONDARY_CONTROLLER_LIST`: `NVME_IDENTIFY_CNS_CODES` = 21;
public const val `NVME_IDENTIFY_CNS_SPECIFIC_CONTROLLER_IO_COMMAND_SET`: `NVME_IDENTIFY_CNS_CODES` = 6;
public const val `NVME_IDENTIFY_CNS_SPECIFIC_NAMESPACE`: `NVME_IDENTIFY_CNS_CODES` = 0;
public const val `NVME_IDENTIFY_CNS_SPECIFIC_NAMESPACE_IO_COMMAND_SET`: `NVME_IDENTIFY_CNS_CODES` = 5;
public const val `NVME_IDENTIFY_CNS_UUID_LIST`: `NVME_IDENTIFY_CNS_CODES` = 23;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 106 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 156 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 224 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 768 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1024 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_IDENTIFY_CONTROLLER_DATA` (
    public var `VID`: UShort,
    public var `SSVID`: UShort,
    public var `SN`: UByteArray,
    public var `MN`: UByteArray,
    public var `FR`: UByteArray,
    public var `RAB`: UByte,
    public var `IEEE`: UByteArray,
    public var `CMIC`: `NVME_IDENTIFY_CONTROLLER_DATA_0`,
    public var `MDTS`: UByte,
    public var `CNTLID`: UShort,
    public var `VER`: UInt,
    public var `RTD3R`: UInt,
    public var `RTD3E`: UInt,
    public var `OAES`: `NVME_IDENTIFY_CONTROLLER_DATA_1`,
    public var `CTRATT`: `NVME_IDENTIFY_CONTROLLER_DATA_2`,
    public var `RRLS`: `NVME_IDENTIFY_CONTROLLER_DATA_3`,
    public var `Reserved0`: UByteArray,
    public var `CNTRLTYPE`: UByte,
    public var `FGUID`: UByteArray,
    public var `CRDT1`: UShort,
    public var `CRDT2`: UShort,
    public var `CRDT3`: UShort,
    public var `Reserved0_1`: UByteArray,
    public var `ReservedForManagement`: UByteArray,
    public var `OACS`: `NVME_IDENTIFY_CONTROLLER_DATA_4`,
    public var `ACL`: UByte,
    public var `AERL`: UByte,
    public var `FRMW`: `NVME_IDENTIFY_CONTROLLER_DATA_5`,
    public var `LPA`: `NVME_IDENTIFY_CONTROLLER_DATA_6`,
    public var `ELPE`: UByte,
    public var `NPSS`: UByte,
    public var `AVSCC`: `NVME_IDENTIFY_CONTROLLER_DATA_7`,
    public var `APSTA`: `NVME_IDENTIFY_CONTROLLER_DATA_8`,
    public var `WCTEMP`: UShort,
    public var `CCTEMP`: UShort,
    public var `MTFA`: UShort,
    public var `HMPRE`: UInt,
    public var `HMMIN`: UInt,
    public var `TNVMCAP`: UByteArray,
    public var `UNVMCAP`: UByteArray,
    public var `RPMBS`: `NVME_IDENTIFY_CONTROLLER_DATA_9`,
    public var `EDSTT`: UShort,
    public var `DSTO`: UByte,
    public var `FWUG`: UByte,
    public var `KAS`: UShort,
    public var `HCTMA`: `NVME_IDENTIFY_CONTROLLER_DATA_10`,
    public var `MNTMT`: UShort,
    public var `MXTMT`: UShort,
    public var `SANICAP`: `NVME_IDENTIFY_CONTROLLER_DATA_11`,
    public var `HMMINDS`: UInt,
    public var `HMMAXD`: UShort,
    public var `NSETIDMAX`: UShort,
    public var `ENDGIDMAX`: UShort,
    public var `ANATT`: UByte,
    public var `ANACAP`: `NVME_IDENTIFY_CONTROLLER_DATA_12`,
    public var `ANAGRPMAX`: UInt,
    public var `NANAGRPID`: UInt,
    public var `PELS`: UInt,
    public var `Reserved1`: UByteArray,
    public var `SQES`: `NVME_IDENTIFY_CONTROLLER_DATA_13`,
    public var `CQES`: `NVME_IDENTIFY_CONTROLLER_DATA_14`,
    public var `MAXCMD`: UShort,
    public var `NN`: UInt,
    public var `ONCS`: `NVME_IDENTIFY_CONTROLLER_DATA_15`,
    public var `FUSES`: `NVME_IDENTIFY_CONTROLLER_DATA_16`,
    public var `FNA`: `NVME_IDENTIFY_CONTROLLER_DATA_17`,
    public var `VWC`: `NVME_IDENTIFY_CONTROLLER_DATA_18`,
    public var `AWUN`: UShort,
    public var `AWUPF`: UShort,
    public var `NVSCC`: `NVME_IDENTIFY_CONTROLLER_DATA_19`,
    public var `NWPC`: `NVME_IDENTIFY_CONTROLLER_DATA_20`,
    public var `ACWU`: UShort,
    public var `Reserved4`: UByteArray,
    public var `SGLS`: `NVME_IDENTIFY_CONTROLLER_DATA_21`,
    public var `MNAN`: UInt,
    public var `Reserved6`: UByteArray,
    public var `SUBNQN`: UByteArray,
    public var `Reserved7`: UByteArray,
    public var `Reserved8`: UByteArray,
    public var `PDS`: Array<`NVME_POWER_STATE_DESC`>,
    public var `VS`: UByteArray,
)
// UNSUPPORTED Rust 2769:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_IDENTIFY_CONTROLLER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_12` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_8` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_7` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_14` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_2` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_17` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_5` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_16` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_10` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_6` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_19` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_20` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_4` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_1` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_15` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_9` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_3` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_11` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_21` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_13` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_CONTROLLER_DATA_18` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_IDENTIFY_IO_COMMAND_SET` (
    public var `IOCommandSetVector`: ULongArray,
)
// UNSUPPORTED Rust 2889:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_IDENTIFY_IO_COMMAND_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 11 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 192 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3712 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_IDENTIFY_NAMESPACE_DATA` (
    public var `NSZE`: ULong,
    public var `NCAP`: ULong,
    public var `NUSE`: ULong,
    public var `NSFEAT`: `NVME_IDENTIFY_NAMESPACE_DATA_0`,
    public var `NLBAF`: UByte,
    public var `FLBAS`: `NVME_IDENTIFY_NAMESPACE_DATA_1`,
    public var `MC`: `NVME_IDENTIFY_NAMESPACE_DATA_2`,
    public var `DPC`: `NVME_IDENTIFY_NAMESPACE_DATA_3`,
    public var `DPS`: `NVME_IDENTIFY_NAMESPACE_DATA_4`,
    public var `NMIC`: `NVME_IDENTIFY_NAMESPACE_DATA_5`,
    public var `RESCAP`: `NVM_RESERVATION_CAPABILITIES`,
    public var `FPI`: `NVME_IDENTIFY_NAMESPACE_DATA_6`,
    public var `DLFEAT`: `NVME_IDENTIFY_NAMESPACE_DATA_7`,
    public var `NAWUN`: UShort,
    public var `NAWUPF`: UShort,
    public var `NACWU`: UShort,
    public var `NABSN`: UShort,
    public var `NABO`: UShort,
    public var `NABSPF`: UShort,
    public var `NOIOB`: UShort,
    public var `NVMCAP`: UByteArray,
    public var `NPWG`: UShort,
    public var `NPWA`: UShort,
    public var `NPDG`: UShort,
    public var `NPDA`: UShort,
    public var `NOWS`: UShort,
    public var `MSSRL`: UShort,
    public var `MCL`: UInt,
    public var `MSRC`: UByte,
    public var `Reserved2`: UByteArray,
    public var `ANAGRPID`: UInt,
    public var `Reserved3`: UByteArray,
    public var `NSATTR`: `NVME_IDENTIFY_NAMESPACE_DATA_8`,
    public var `NVMSETID`: UShort,
    public var `ENDGID`: UShort,
    public var `NGUID`: UByteArray,
    public var `EUI64`: UByteArray,
    public var `LBAF`: Array<`NVME_LBA_FORMAT`>,
    public var `Reserved4`: UByteArray,
    public var `VS`: UByteArray,
)
// UNSUPPORTED Rust 2938:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_IDENTIFY_NAMESPACE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_7` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_3` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_4` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_1` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_6` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_2` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_5` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_8` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_NAMESPACE_DATA_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_IDENTIFY_NAMESPACE_DESCRIPTOR` (
    public var `NIDT`: UByte,
    public var `NIDL`: UByte,
    public var `Reserved`: UByteArray,
    public var `NID`: UByteArray,
)
// UNSUPPORTED Rust 2996:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_IDENTIFY_NAMESPACE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4080 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_IDENTIFY_NVM_SPECIFIC_CONTROLLER_IO_COMMAND_SET` (
    public var `VSL`: UByte,
    public var `WZSL`: UByte,
    public var `WUSL`: UByte,
    public var `DMRL`: UByte,
    public var `DMRSL`: UInt,
    public var `DMSL`: ULong,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 3012:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_IDENTIFY_NVM_SPECIFIC_CONTROLLER_IO_COMMAND_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2796 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 768 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET` (
    public var `ZOC`: `NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_0`,
    public var `OZCS`: `NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_1`,
    public var `MAR`: UInt,
    public var `MOR`: UInt,
    public var `RRL`: UInt,
    public var `FRL`: UInt,
    public var `Reserved0`: UByteArray,
    public var `LBAEF`: Array<`NVME_LBA_ZONE_FORMAT`>,
    public var `Reserved1`: UByteArray,
    public var `VS`: UByteArray,
)
// UNSUPPORTED Rust 3031:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_1` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4095 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_IDENTIFY_ZNS_SPECIFIC_CONTROLLER_IO_COMMAND_SET` (
    public var `ZASL`: UByte,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 3052:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_IDENTIFY_ZNS_SPECIFIC_CONTROLLER_IO_COMMAND_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_IO_COMMAND_SET_COMBINATION_REJECTED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 43;
public const val `NVME_IO_COMMAND_SET_INVALID`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 44;
public const val `NVME_IO_COMMAND_SET_NOT_ENABLED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 42;
public const val `NVME_IO_COMMAND_SET_NOT_SUPPORTED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 41;
// UNSUPPORTED Rust 3061:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_LBA_FORMAT {
//     pub Anonymous: NVME_LBA_FORMAT_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 3067:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_LBA_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_LBA_FORMAT_0` (
    public var `MS`: UShort,
    public var `LBADS`: UByte,
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_LBA_RANGE` (
    public var `Attributes`: `NVME_CONTEXT_ATTRIBUTES`,
    public var `LogicalBlockCount`: UInt,
    public var `StartingLBA`: ULong,
)
// UNSUPPORTED Rust 3086:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_LBA_RANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 14 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_LBA_RANGET_TYPE_ENTRY` (
    public var `Type`: UByte,
    public var `Attributes`: `NVME_LBA_RANGET_TYPE_ENTRY_0`,
    public var `Reserved0`: UByteArray,
    public var `SLBA`: ULong,
    public var `NLB`: ULong,
    public var `GUID`: UByteArray,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 3102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_LBA_RANGET_TYPE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_LBA_RANGET_TYPE_ENTRY_0` (
    public var `_bitfield`: UByte,
)
public typealias `NVME_LBA_RANGE_TYPES` = Int;
public const val `NVME_LBA_RANGE_TYPE_CACHE`: `NVME_LBA_RANGE_TYPES` = 3;
public const val `NVME_LBA_RANGE_TYPE_FILESYSTEM`: `NVME_LBA_RANGE_TYPES` = 1;
public const val `NVME_LBA_RANGE_TYPE_PAGE_SWAP_FILE`: `NVME_LBA_RANGE_TYPES` = 4;
public const val `NVME_LBA_RANGE_TYPE_RAID`: `NVME_LBA_RANGE_TYPES` = 2;
public const val `NVME_LBA_RANGE_TYPE_RESERVED`: `NVME_LBA_RANGE_TYPES` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_LBA_ZONE_FORMAT` (
    public var `ZoneSize`: ULong,
    public var `ZDES`: UByte,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 3125:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_LBA_ZONE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_LOG_PAGES` = Int;
public const val `NVME_LOG_PAGE_ASYMMETRIC_NAMESPACE_ACCESS`: `NVME_LOG_PAGES` = 12;
public const val `NVME_LOG_PAGE_CHANGED_NAMESPACE_LIST`: `NVME_LOG_PAGES` = 4;
public const val `NVME_LOG_PAGE_CHANGED_ZONE_LIST`: `NVME_LOG_PAGES` = 191;
public const val `NVME_LOG_PAGE_COMMAND_EFFECTS`: `NVME_LOG_PAGES` = 5;
public const val `NVME_LOG_PAGE_DEVICE_SELF_TEST`: `NVME_LOG_PAGES` = 6;
public const val `NVME_LOG_PAGE_ENDURANCE_GROUP_EVENT_AGGREGATE`: `NVME_LOG_PAGES` = 15;
public const val `NVME_LOG_PAGE_ENDURANCE_GROUP_INFORMATION`: `NVME_LOG_PAGES` = 9;
public const val `NVME_LOG_PAGE_ERROR_INFO`: `NVME_LOG_PAGES` = 1;
public const val `NVME_LOG_PAGE_FIRMWARE_SLOT_INFO`: `NVME_LOG_PAGES` = 3;
public const val `NVME_LOG_PAGE_HEALTH_INFO`: `NVME_LOG_PAGES` = 2;
public const val `NVME_LOG_PAGE_LBA_STATUS_INFORMATION`: `NVME_LOG_PAGES` = 14;
public const val `NVME_LOG_PAGE_OCP_DEVICE_CAPABILITIES`: `NVME_VENDOR_LOG_PAGES` = 196;
public const val `NVME_LOG_PAGE_OCP_DEVICE_ERROR_RECOVERY`: `NVME_VENDOR_LOG_PAGES` = 193;
public const val `NVME_LOG_PAGE_OCP_DEVICE_SMART_INFORMATION`: `NVME_VENDOR_LOG_PAGES` = 192;
public const val `NVME_LOG_PAGE_OCP_FIRMWARE_ACTIVATION_HISTORY`: `NVME_VENDOR_LOG_PAGES` = 194;
public const val `NVME_LOG_PAGE_OCP_LATENCY_MONITOR`: `NVME_VENDOR_LOG_PAGES` = 195;
public const val `NVME_LOG_PAGE_OCP_TCG_CONFIGURATION`: `NVME_VENDOR_LOG_PAGES` = 200;
public const val `NVME_LOG_PAGE_OCP_TCG_HISTORY`: `NVME_VENDOR_LOG_PAGES` = 201;
public const val `NVME_LOG_PAGE_OCP_UNSUPPORTED_REQUIREMENTS`: `NVME_VENDOR_LOG_PAGES` = 197;
public const val `NVME_LOG_PAGE_PERSISTENT_EVENT_LOG`: `NVME_LOG_PAGES` = 13;
public const val `NVME_LOG_PAGE_PREDICTABLE_LATENCY_EVENT_AGGREGATE`: `NVME_LOG_PAGES` = 11;
public const val `NVME_LOG_PAGE_PREDICTABLE_LATENCY_NVM_SET`: `NVME_LOG_PAGES` = 10;
public const val `NVME_LOG_PAGE_RESERVATION_NOTIFICATION`: `NVME_LOG_PAGES` = 128;
public const val `NVME_LOG_PAGE_SANITIZE_STATUS`: `NVME_LOG_PAGES` = 129;
public const val `NVME_LOG_PAGE_TELEMETRY_CTLR_INITIATED`: `NVME_LOG_PAGES` = 8;
public const val `NVME_LOG_PAGE_TELEMETRY_HOST_INITIATED`: `NVME_LOG_PAGES` = 7;
public const val `NVME_MAX_HOST_IDENTIFIER_SIZE`: UInt = 16u;
public const val `NVME_MAX_LOG_SIZE`: UInt = 4096u;
public const val `NVME_MEDIA_ADDITIONALLY_MODIFIED_AFTER_SANITIZE_NOT_DEFINED`: `NVME_NO_DEALLOCATE_MODIFIES_MEDIA_AFTER_SANITIZE` = 0;
public const val `NVME_MEDIA_ADDITIONALLY_MOFIDIED_AFTER_SANITIZE`: `NVME_NO_DEALLOCATE_MODIFIES_MEDIA_AFTER_SANITIZE` = 2;
public const val `NVME_MEDIA_NOT_ADDITIONALLY_MODIFIED_AFTER_SANITIZE`: `NVME_NO_DEALLOCATE_MODIFIES_MEDIA_AFTER_SANITIZE` = 1;
public const val `NVME_NAMESPACE_ALL`: UInt = 4294967295u;
public typealias `NVME_NAMESPACE_METADATA_ELEMENT_TYPES` = Int;
public const val `NVME_NAMESPACE_METADATA_OPERATING_SYSTEM_NAMESPACE_NAME`: `NVME_NAMESPACE_METADATA_ELEMENT_TYPES` = 1;
public const val `NVME_NAMESPACE_METADATA_OPERATING_SYSTEM_NAMESPACE_NAME_QUALIFIER_1`: `NVME_NAMESPACE_METADATA_ELEMENT_TYPES` = 3;
public const val `NVME_NAMESPACE_METADATA_OPERATING_SYSTEM_NAMESPACE_NAME_QUALIFIER_2`: `NVME_NAMESPACE_METADATA_ELEMENT_TYPES` = 4;
public const val `NVME_NAMESPACE_METADATA_PREBOOT_NAMESPACE_NAME`: `NVME_NAMESPACE_METADATA_ELEMENT_TYPES` = 2;
public typealias `NVME_NO_DEALLOCATE_MODIFIES_MEDIA_AFTER_SANITIZE` = Int;
public typealias `NVME_NVM_COMMANDS` = Int;
public const val `NVME_NVM_COMMAND_COMPARE`: `NVME_NVM_COMMANDS` = 5;
public const val `NVME_NVM_COMMAND_COPY`: `NVME_NVM_COMMANDS` = 25;
public const val `NVME_NVM_COMMAND_DATASET_MANAGEMENT`: `NVME_NVM_COMMANDS` = 9;
public const val `NVME_NVM_COMMAND_FLUSH`: `NVME_NVM_COMMANDS` = 0;
public const val `NVME_NVM_COMMAND_READ`: `NVME_NVM_COMMANDS` = 2;
public const val `NVME_NVM_COMMAND_RESERVATION_ACQUIRE`: `NVME_NVM_COMMANDS` = 17;
public const val `NVME_NVM_COMMAND_RESERVATION_REGISTER`: `NVME_NVM_COMMANDS` = 13;
public const val `NVME_NVM_COMMAND_RESERVATION_RELEASE`: `NVME_NVM_COMMANDS` = 21;
public const val `NVME_NVM_COMMAND_RESERVATION_REPORT`: `NVME_NVM_COMMANDS` = 14;
public const val `NVME_NVM_COMMAND_VERIFY`: `NVME_NVM_COMMANDS` = 12;
public const val `NVME_NVM_COMMAND_WRITE`: `NVME_NVM_COMMANDS` = 1;
public const val `NVME_NVM_COMMAND_WRITE_UNCORRECTABLE`: `NVME_NVM_COMMANDS` = 4;
public const val `NVME_NVM_COMMAND_WRITE_ZEROES`: `NVME_NVM_COMMANDS` = 8;
public const val `NVME_NVM_COMMAND_ZONE_APPEND`: `NVME_NVM_COMMANDS` = 125;
public const val `NVME_NVM_COMMAND_ZONE_MANAGEMENT_RECEIVE`: `NVME_NVM_COMMANDS` = 122;
public const val `NVME_NVM_COMMAND_ZONE_MANAGEMENT_SEND`: `NVME_NVM_COMMANDS` = 121;
public typealias `NVME_NVM_QUEUE_PRIORITIES` = Int;
public const val `NVME_NVM_QUEUE_PRIORITY_HIGH`: `NVME_NVM_QUEUE_PRIORITIES` = 1;
public const val `NVME_NVM_QUEUE_PRIORITY_LOW`: `NVME_NVM_QUEUE_PRIORITIES` = 3;
public const val `NVME_NVM_QUEUE_PRIORITY_MEDIUM`: `NVME_NVM_QUEUE_PRIORITIES` = 2;
public const val `NVME_NVM_QUEUE_PRIORITY_URGENT`: `NVME_NVM_QUEUE_PRIORITIES` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_NVM_SUBSYSTEM_RESET` (
    public var `NSSRC`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 127 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3934 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_CAPABILITIES_LOG` (
    public var `PciePorts`: UShort,
    public var `OobMgmtSupport`: `NVME_OCP_DEVICE_CAPABILITIES_LOG_0`,
    public var `WriteZeroesCommand`: `NVME_OCP_DEVICE_CAPABILITIES_LOG_1`,
    public var `SanitizeCommand`: `NVME_OCP_DEVICE_CAPABILITIES_LOG_2`,
    public var `DatasetMgmtCommand`: `NVME_OCP_DEVICE_CAPABILITIES_LOG_3`,
    public var `WriteUncorrectableCommand`: `NVME_OCP_DEVICE_CAPABILITIES_LOG_4`,
    public var `FusedCommand`: `NVME_OCP_DEVICE_CAPABILITIES_LOG_5`,
    public var `MinimumValidDSSDPowerState`: UShort,
    public var `Reserved0`: UByte,
    public var `DssdDescriptors`: Array<`DSSD_POWER_STATE_DESCRIPTOR`>,
    public var `Reserved1`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3213:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_CAPABILITIES_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3218:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_CAPABILITIES_LOG_3 {
//     pub Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_3_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 3224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_CAPABILITIES_LOG_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_CAPABILITIES_LOG_3_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 3234:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_CAPABILITIES_LOG_5 {
//     pub Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_5_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 3240:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_CAPABILITIES_LOG_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_CAPABILITIES_LOG_5_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 3250:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_CAPABILITIES_LOG_0 {
//     pub Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_0_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 3256:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_CAPABILITIES_LOG_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_CAPABILITIES_LOG_0_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 3266:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_CAPABILITIES_LOG_2 {
//     pub Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_2_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 3272:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_CAPABILITIES_LOG_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_CAPABILITIES_LOG_2_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 3282:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_CAPABILITIES_LOG_4 {
//     pub Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_4_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 3288:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_CAPABILITIES_LOG_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_CAPABILITIES_LOG_4_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 3298:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_CAPABILITIES_LOG_1 {
//     pub Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_1_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 3304:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_CAPABILITIES_LOG_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_CAPABILITIES_LOG_1_0` (
    public var `_bitfield`: UShort,
)
public const val `NVME_OCP_DEVICE_CAPABILITIES_LOG_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 463 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_ERROR_RECOVERY_LOG_V2` (
    public var `PanicResetWaitTime`: UShort,
    public var `PanicResetAction`: `NVME_WCS_DEVICE_RESET_ACTION`,
    public var `DeviceRecoveryAction1`: UByte,
    public var `PanicId`: ULong,
    public var `DeviceCapabilitiesA`: `NVME_WCS_DEVICE_CAPABILITIES`,
    public var `VendorSpecificRecoveryCode`: UByte,
    public var `Reserved0`: UByteArray,
    public var `VendorSpecificCommandCDW12`: UInt,
    public var `VendorSpecificCommandCDW13`: UInt,
    public var `VendorSpecificCommandTimeout`: UByte,
    public var `DeviceRecoveryAction2`: UByte,
    public var `DeviceRecoveryAction2Timeout`: UByte,
    public var `Reserved1`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3334:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_ERROR_RECOVERY_LOG_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_OCP_DEVICE_ERROR_RECOVERY_LOG_VERSION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2790 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY_LOG` (
    public var `LID`: UByte,
    public var `Reserved0`: UByteArray,
    public var `ValidNumberOfEntries`: UInt,
    public var `Entries`: Array<`FIRMWARE_ACTIVATION_HISTORY_ENTRY`>,
    public var `Reserved1`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3351:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY_LOG_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 19 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 22 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 29 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_LATENCY_MONITOR_LOG` (
    public var `FeatureStatus`: `LATENCY_MONITOR_FEATURE_STATUS`,
    public var `Reserved0`: UByte,
    public var `ActiveBucketTimer`: UShort,
    public var `ActiveBucketTimerThreshold`: UShort,
    public var `ActiveThresholdA`: UByte,
    public var `ActiveThresholdB`: UByte,
    public var `ActiveThresholdC`: UByte,
    public var `ActiveThresholdD`: UByte,
    public var `ActiveLatencyConfig`: `ACTIVE_LATENCY_CONFIGURATION`,
    public var `ActiveLatencyMinimumWindow`: UByte,
    public var `Reserved1`: UByteArray,
    public var `ActiveBucketCounter0`: `BUCKET_COUNTER`,
    public var `ActiveBucketCounter1`: `BUCKET_COUNTER`,
    public var `ActiveBucketCounter2`: `BUCKET_COUNTER`,
    public var `ActiveBucketCounter3`: `BUCKET_COUNTER`,
    public var `ActiveLatencyStamp`: `LATENCY_STAMP`,
    public var `ActiveMeasuredLatency`: `MEASURED_LATENCY`,
    public var `ActiveLatencyStampUnits`: `LATENCY_STAMP_UNITS`,
    public var `Reserved2`: UByteArray,
    public var `StaticBucketCounter0`: `BUCKET_COUNTER`,
    public var `StaticBucketCounter1`: `BUCKET_COUNTER`,
    public var `StaticBucketCounter2`: `BUCKET_COUNTER`,
    public var `StaticBucketCounter3`: `BUCKET_COUNTER`,
    public var `StaticLatencyStamp`: `LATENCY_STAMP`,
    public var `StaticMeasuredLatency`: `MEASURED_LATENCY`,
    public var `StaticLatencyStampUnits`: `LATENCY_STAMP_UNITS`,
    public var `Reserved3`: UByteArray,
    public var `DebugLogTriggerEnable`: `DEBUG_BIT_FIELD`,
    public var `DebugLogMeasuredLatency`: UShort,
    public var `DebugLogLatencyStamp`: ULong,
    public var `DebugLogPointer`: UShort,
    public var `DebugCounterTriggerSource`: `DEBUG_BIT_FIELD`,
    public var `DebugLogStampUnits`: `NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0`,
    public var `Reserved4`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_LATENCY_MONITOR_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3402:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0 {
//     pub Anonymous: NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0_0,
//     pub AsUchar: u8,
// }

// UNSUPPORTED Rust 3408:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0_0` (
    public var `_bitfield`: UByte,
)
public const val `NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 286 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3` (
    public var `MediaUnitsWritten`: UByteArray,
    public var `MediaUnitsRead`: UByteArray,
    public var `BadUserNANDBlockCount`: `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_0`,
    public var `BadSystemNANDBlockCount`: `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_1`,
    public var `XORRecoveryCount`: ULong,
    public var `UnrecoverableReadErrorCount`: ULong,
    public var `SoftECCErrorCount`: ULong,
    public var `EndToEndCorrectionCounts`: `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_2`,
    public var `PercentageSystemDataUsed`: UByte,
    public var `RefreshCount`: UByteArray,
    public var `UserDataEraseCounts`: `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_3`,
    public var `ThermalThrottling`: `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_4`,
    public var `DSSDSpecVersion`: UByteArray,
    public var `PCIeCorrectableErrorCount`: ULong,
    public var `IncompleteShutdownCount`: UInt,
    public var `Reserved1`: UInt,
    public var `PercentageFreeBlocks`: UByte,
    public var `Reserved2`: UByteArray,
    public var `CapacitorHealth`: UShort,
    public var `NvmeErrata`: UByte,
    public var `Reserved3`: UByteArray,
    public var `UnalignedIOCount`: ULong,
    public var `SecurityVersionNumber`: ULong,
    public var `NUSE`: ULong,
    public var `PLPStartCount`: UByteArray,
    public var `EnduranceEstimate`: UByteArray,
    public var `PCIeLinkRetrainingCount`: ULong,
    public var `PowerStateChangeCount`: ULong,
    public var `Reserved4`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_1` (
    public var `RawCount`: UByteArray,
    public var `Normalized`: UByteArray,
)
// UNSUPPORTED Rust 3465:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_0` (
    public var `RawCount`: UByteArray,
    public var `Normalized`: UByteArray,
)
// UNSUPPORTED Rust 3476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_2` (
    public var `DetectedCounts`: UInt,
    public var `CorrectedCounts`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_4` (
    public var `EventCount`: UByte,
    public var `Status`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_3` (
    public var `MaximumCount`: UInt,
    public var `MinimumCount`: UInt,
)
public const val `NVME_OCP_DEVICE_SMART_INFORMATION_LOG_VERSION_3`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 462 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG` (
    public var `State`: `NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0`,
    public var `Reserved0`: UByteArray,
    public var `LSPActivationCount`: UByte,
    public var `TPRevertCount`: UByte,
    public var `LSPRevertCount`: UByte,
    public var `LOCount`: UByte,
    public var `SUMLOCount`: UByte,
    public var `RPLOCount`: UByte,
    public var `NPLOCount`: UByte,
    public var `RLLOCount`: UByte,
    public var `WLLOCount`: UByte,
    public var `RULOCount`: UByte,
    public var `WULOCount`: UByte,
    public var `Reserved1`: UByte,
    public var `SIDAuthTryCount`: UInt,
    public var `SIDAuthTryLimit`: UInt,
    public var `ResetCount`: UInt,
    public var `ResetLockCount`: UInt,
    public var `Reserved2`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3525:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3530:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0 {
//     pub Anonymous: NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0_0,
//     pub AsUchar: u8,
// }

// UNSUPPORTED Rust 3536:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0_0` (
    public var `_bitfield`: UByte,
)
public const val `NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 84 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 38 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_TCG_HISTORY_LOG` (
    public var `LID`: UByte,
    public var `Reserved0`: UByteArray,
    public var `HistoryEntryCount`: UInt,
    public var `HistoryEntries`: Array<`TCG_HISTORY_ENTRY`>,
    public var `Reserved1`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3558:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_TCG_HISTORY_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_OCP_DEVICE_TCG_HISTORY_LOG_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 14 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 253 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS_LOG` (
    public var `UnsupportedCount`: UShort,
    public var `Reserved0`: UByteArray,
    public var `UnsupportedReqList`: Array<`UNSUPPORTED_REQUIREMENT`>,
    public var `Reserved1`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 3574:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS_LOG_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_PERSISTENT_EVENT_LOG_EVENT_HEADER` (
    public var `EventType`: UByte,
    public var `EventTypeRevision`: UByte,
    public var `EventHeaderLength`: UByte,
    public var `Reserved0`: UByte,
    public var `ControllerIdentifier`: UShort,
    public var `EventTimestamp`: ULong,
    public var `Reserved1`: UByteArray,
    public var `VendorSpecificInformationLength`: UShort,
    public var `EventLength`: UShort,
)
// UNSUPPORTED Rust 3593:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_PERSISTENT_EVENT_LOG_EVENT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 108 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_PERSISTENT_EVENT_LOG_HEADER` (
    public var `LogIdentifier`: UByte,
    public var `Reserved0`: UByteArray,
    public var `TotalNumberOfEvents`: UInt,
    public var `TotalLogLength`: ULong,
    public var `LogRevision`: UByte,
    public var `Reserved1`: UByte,
    public var `LogHeaderLength`: UShort,
    public var `Timestamp`: ULong,
    public var `PowerOnHours`: UByteArray,
    public var `PowerCycleCount`: ULong,
    public var `PciVendorId`: UShort,
    public var `PciSubsystemVendorId`: UShort,
    public var `SerialNumber`: UByteArray,
    public var `ModelNumber`: UByteArray,
    public var `NVMSubsystemNVMeQualifiedName`: UByteArray,
    public var `Reserved`: UByteArray,
    public var `SupportedEventsBitmap`: UByteArray,
)
// UNSUPPORTED Rust 3620:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_PERSISTENT_EVENT_LOG_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_PERSISTENT_EVENT_TYPE_CHANGE_NAMESPACE`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 6;
public const val `NVME_PERSISTENT_EVENT_TYPE_FIRMWARE_COMMIT`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 2;
public const val `NVME_PERSISTENT_EVENT_TYPE_FORMAT_NVM_COMPLETION`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 8;
public const val `NVME_PERSISTENT_EVENT_TYPE_FORMAT_NVM_START`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 7;
public const val `NVME_PERSISTENT_EVENT_TYPE_MAX`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 255;
public const val `NVME_PERSISTENT_EVENT_TYPE_NVM_SUBSYSTEM_HARDWARE_ERROR`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 5;
public const val `NVME_PERSISTENT_EVENT_TYPE_POWER_ON_OR_RESET`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 4;
public const val `NVME_PERSISTENT_EVENT_TYPE_RESERVED0`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 0;
public const val `NVME_PERSISTENT_EVENT_TYPE_RESERVED1_BEGIN`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 14;
public const val `NVME_PERSISTENT_EVENT_TYPE_RESERVED1_END`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 221;
public const val `NVME_PERSISTENT_EVENT_TYPE_RESERVED2_BEGIN`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 224;
public const val `NVME_PERSISTENT_EVENT_TYPE_RESERVED2_END`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 255;
public const val `NVME_PERSISTENT_EVENT_TYPE_SANITIZE_COMPLETION`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 10;
public const val `NVME_PERSISTENT_EVENT_TYPE_SANITIZE_START`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 9;
public const val `NVME_PERSISTENT_EVENT_TYPE_SET_FEATURE`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 11;
public const val `NVME_PERSISTENT_EVENT_TYPE_SMART_HEALTH_LOG_SNAPSHOT`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 1;
public const val `NVME_PERSISTENT_EVENT_TYPE_TCG_DEFINED`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 223;
public const val `NVME_PERSISTENT_EVENT_TYPE_TELEMETRY_LOG_CREATED`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 12;
public const val `NVME_PERSISTENT_EVENT_TYPE_THERMAL_EXCURSION`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 13;
public const val `NVME_PERSISTENT_EVENT_TYPE_TIMESTAMP_CHANGE`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 3;
public const val `NVME_PERSISTENT_EVENT_TYPE_VENDOR_SPECIFIC_EVENT`: `NVME_PERSISTENT_EVENT_LOG_EVENT_TYPES` = 222;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_POWER_STATE_DESC` (
    public var `MP`: UShort,
    public var `Reserved0`: UByte,
    public var `_bitfield1`: UByte,
    public var `ENLAT`: UInt,
    public var `EXLAT`: UInt,
    public var `_bitfield2`: UByte,
    public var `_bitfield3`: UByte,
    public var `_bitfield4`: UByte,
    public var `_bitfield5`: UByte,
    public var `IDLP`: UShort,
    public var `_bitfield6`: UByte,
    public var `Reserved7`: UByte,
    public var `ACTP`: UShort,
    public var `_bitfield7`: UByte,
    public var `Reserved9`: UByteArray,
)
// UNSUPPORTED Rust 3665:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_POWER_STATE_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_PROTECTION_INFORMATION_NOT_ENABLED`: `NVME_PROTECTION_INFORMATION_TYPES` = 0;
public const val `NVME_PROTECTION_INFORMATION_TYPE1`: `NVME_PROTECTION_INFORMATION_TYPES` = 1;
public const val `NVME_PROTECTION_INFORMATION_TYPE2`: `NVME_PROTECTION_INFORMATION_TYPES` = 2;
public const val `NVME_PROTECTION_INFORMATION_TYPE3`: `NVME_PROTECTION_INFORMATION_TYPES` = 3;
public typealias `NVME_PROTECTION_INFORMATION_TYPES` = Int;
// UNSUPPORTED Rust 3675:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_PRP_ENTRY {
//     pub Anonymous: NVME_PRP_ENTRY_0,
//     pub AsUlonglong: u64,
// }

// UNSUPPORTED Rust 3681:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_PRP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_PRP_ENTRY_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_REGISTERED_CONTROLLER_DATA` (
    public var `CNTLID`: UShort,
    public var `RCSTS`: `NVME_REGISTERED_CONTROLLER_DATA_0`,
    public var `Reserved`: UByteArray,
    public var `HOSTID`: UByteArray,
    public var `RKEY`: ULong,
)
// UNSUPPORTED Rust 3700:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_REGISTERED_CONTROLLER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_REGISTERED_CONTROLLER_DATA_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_REGISTERED_CONTROLLER_EXTENDED_DATA` (
    public var `CNTLID`: UShort,
    public var `RCSTS`: `NVME_REGISTERED_CONTROLLER_EXTENDED_DATA_0`,
    public var `Reserved`: UByteArray,
    public var `RKEY`: ULong,
    public var `HOSTID`: UByteArray,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 3720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_REGISTERED_CONTROLLER_EXTENDED_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_REGISTERED_CONTROLLER_EXTENDED_DATA_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_REPORT_ZONE_INFO` (
    public var `ZoneCount`: ULong,
    public var `Reserved`: ULongArray,
    public var `ZoneDescriptor`: Array<`NVME_ZONE_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 3737:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_REPORT_ZONE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_RESERVATION_ACQUIRE_ACTIONS` = Int;
public const val `NVME_RESERVATION_ACQUIRE_ACTION_ACQUIRE`: `NVME_RESERVATION_ACQUIRE_ACTIONS` = 0;
public const val `NVME_RESERVATION_ACQUIRE_ACTION_PREEMPT`: `NVME_RESERVATION_ACQUIRE_ACTIONS` = 1;
public const val `NVME_RESERVATION_ACQUIRE_ACTION_PREEMPT_AND_ABORT`: `NVME_RESERVATION_ACQUIRE_ACTIONS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_RESERVATION_ACQUIRE_DATA_STRUCTURE` (
    public var `CRKEY`: ULong,
    public var `PRKEY`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_RESERVATION_NOTIFICATION_LOG` (
    public var `LogPageCount`: ULong,
    public var `LogPageType`: UByte,
    public var `AvailableLogPageCount`: UByte,
    public var `Reserved0`: UByteArray,
    public var `NameSpaceId`: UInt,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 3762:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_RESERVATION_NOTIFICATION_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_RESERVATION_NOTIFICATION_TYPES` = Int;
public const val `NVME_RESERVATION_NOTIFICATION_TYPE_EMPTY_LOG_PAGE`: `NVME_RESERVATION_NOTIFICATION_TYPES` = 0;
public const val `NVME_RESERVATION_NOTIFICATION_TYPE_REGISTRATION_PREEMPTED`: `NVME_RESERVATION_NOTIFICATION_TYPES` = 1;
public const val `NVME_RESERVATION_NOTIFICATION_TYPE_REGISTRATION_RELEASED`: `NVME_RESERVATION_NOTIFICATION_TYPES` = 2;
public const val `NVME_RESERVATION_NOTIFICATION_TYPE_RESERVATION_PREEPMPTED`: `NVME_RESERVATION_NOTIFICATION_TYPES` = 3;
public typealias `NVME_RESERVATION_REGISTER_ACTIONS` = Int;
public const val `NVME_RESERVATION_REGISTER_ACTION_REGISTER`: `NVME_RESERVATION_REGISTER_ACTIONS` = 0;
public const val `NVME_RESERVATION_REGISTER_ACTION_REPLACE`: `NVME_RESERVATION_REGISTER_ACTIONS` = 2;
public const val `NVME_RESERVATION_REGISTER_ACTION_UNREGISTER`: `NVME_RESERVATION_REGISTER_ACTIONS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_RESERVATION_REGISTER_DATA_STRUCTURE` (
    public var `CRKEY`: ULong,
    public var `NRKEY`: ULong,
)
public typealias `NVME_RESERVATION_REGISTER_PTPL_STATE_CHANGES` = Int;
public const val `NVME_RESERVATION_REGISTER_PTPL_STATE_NO_CHANGE`: `NVME_RESERVATION_REGISTER_PTPL_STATE_CHANGES` = 0;
public const val `NVME_RESERVATION_REGISTER_PTPL_STATE_RESERVED`: `NVME_RESERVATION_REGISTER_PTPL_STATE_CHANGES` = 1;
public const val `NVME_RESERVATION_REGISTER_PTPL_STATE_SET_TO_0`: `NVME_RESERVATION_REGISTER_PTPL_STATE_CHANGES` = 2;
public const val `NVME_RESERVATION_REGISTER_PTPL_STATE_SET_TO_1`: `NVME_RESERVATION_REGISTER_PTPL_STATE_CHANGES` = 3;
public typealias `NVME_RESERVATION_RELEASE_ACTIONS` = Int;
public const val `NVME_RESERVATION_RELEASE_ACTION_CLEAR`: `NVME_RESERVATION_RELEASE_ACTIONS` = 1;
public const val `NVME_RESERVATION_RELEASE_ACTION_RELEASE`: `NVME_RESERVATION_RELEASE_ACTIONS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_RESERVATION_RELEASE_DATA_STRUCTURE` (
    public var `CRKEY`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_RESERVATION_REPORT_STATUS_DATA_STRUCTURE` (
    public var `Header`: `NVME_RESERVATION_REPORT_STATUS_HEADER`,
    public var `RegisteredControllersData`: Array<`NVME_REGISTERED_CONTROLLER_DATA`>,
)
// UNSUPPORTED Rust 3801:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_RESERVATION_REPORT_STATUS_DATA_STRUCTURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_RESERVATION_REPORT_STATUS_EXTENDED_DATA_STRUCTURE` (
    public var `Header`: `NVME_RESERVATION_REPORT_STATUS_HEADER`,
    public var `Reserved1`: UByteArray,
    public var `RegisteredControllersExtendedData`: Array<`NVME_REGISTERED_CONTROLLER_EXTENDED_DATA`>,
)
// UNSUPPORTED Rust 3813:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_RESERVATION_REPORT_STATUS_EXTENDED_DATA_STRUCTURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 14 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_RESERVATION_REPORT_STATUS_HEADER` (
    public var `GEN`: UInt,
    public var `RTYPE`: UByte,
    public var `REGCTL`: UShort,
    public var `Reserved`: UByteArray,
    public var `PTPLS`: UByte,
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 3828:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_RESERVATION_REPORT_STATUS_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_RESERVATION_TYPES` = Int;
public const val `NVME_RESERVATION_TYPE_EXCLUSIVE_ACCESS`: `NVME_RESERVATION_TYPES` = 2;
public const val `NVME_RESERVATION_TYPE_EXCLUSIVE_ACCESS_ALL_REGISTRANTS`: `NVME_RESERVATION_TYPES` = 6;
public const val `NVME_RESERVATION_TYPE_EXCLUSIVE_ACCESS_REGISTRANTS_ONLY`: `NVME_RESERVATION_TYPES` = 4;
public const val `NVME_RESERVATION_TYPE_RESERVED`: `NVME_RESERVATION_TYPES` = 0;
public const val `NVME_RESERVATION_TYPE_WRITE_EXCLUSIVE`: `NVME_RESERVATION_TYPES` = 1;
public const val `NVME_RESERVATION_TYPE_WRITE_EXCLUSIVE_ALL_REGISTRANTS`: `NVME_RESERVATION_TYPES` = 5;
public const val `NVME_RESERVATION_TYPE_WRITE_EXCLUSIVE_REGISTRANTS_ONLY`: `NVME_RESERVATION_TYPES` = 3;
public typealias `NVME_SANITIZE_ACTION` = Int;
public const val `NVME_SANITIZE_ACTION_EXIT_FAILURE_MODE`: `NVME_SANITIZE_ACTION` = 1;
public const val `NVME_SANITIZE_ACTION_RESERVED`: `NVME_SANITIZE_ACTION` = 0;
public const val `NVME_SANITIZE_ACTION_START_BLOCK_ERASE_SANITIZE`: `NVME_SANITIZE_ACTION` = 2;
public const val `NVME_SANITIZE_ACTION_START_CRYPTO_ERASE_SANITIZE`: `NVME_SANITIZE_ACTION` = 4;
public const val `NVME_SANITIZE_ACTION_START_OVERWRITE_SANITIZE`: `NVME_SANITIZE_ACTION` = 3;
public const val `NVME_SANITIZE_OPERATION_FAILED`: `NVME_SANITIZE_OPERATION_STATUS` = 3;
public const val `NVME_SANITIZE_OPERATION_IN_PROGRESS`: `NVME_SANITIZE_OPERATION_STATUS` = 2;
public const val `NVME_SANITIZE_OPERATION_NONE`: `NVME_SANITIZE_OPERATION_STATUS` = 0;
public typealias `NVME_SANITIZE_OPERATION_STATUS` = Int;
public const val `NVME_SANITIZE_OPERATION_SUCCEEDED`: `NVME_SANITIZE_OPERATION_STATUS` = 1;
public const val `NVME_SANITIZE_OPERATION_SUCCEEDED_WITH_FORCED_DEALLOCATION`: `NVME_SANITIZE_OPERATION_STATUS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_SANITIZE_STATUS` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 480 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_SANITIZE_STATUS_LOG` (
    public var `SPROG`: UShort,
    public var `SSTAT`: `NVME_SANITIZE_STATUS`,
    public var `SCDW10`: UInt,
    public var `EstimatedTimeForOverwrite`: UInt,
    public var `EstimatedTimeForBlockErase`: UInt,
    public var `EstimatedTimeForCryptoErase`: UInt,
    public var `EstimatedTimeForOverwriteWithNoDeallocateMediaModification`: UInt,
    public var `EstimatedTimeForBlockEraseWithNoDeallocateMediaModification`: UInt,
    public var `EstimatedTimeForCryptoEraseWithNoDeallocateMediaModification`: UInt,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 3872:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_SANITIZE_STATUS_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_SCSI_NAME_STRING` (
    public var `PCIVendorID`: ByteArray,
    public var `ModelNumber`: ByteArray,
    public var `NamespaceID`: ByteArray,
    public var `SerialNumber`: ByteArray,
)
// UNSUPPORTED Rust 3885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_SCSI_NAME_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_SECURE_ERASE_CRYPTOGRAPHIC`: `NVME_SECURE_ERASE_SETTINGS` = 2;
public const val `NVME_SECURE_ERASE_NONE`: `NVME_SECURE_ERASE_SETTINGS` = 0;
public typealias `NVME_SECURE_ERASE_SETTINGS` = Int;
public const val `NVME_SECURE_ERASE_USER_DATA`: `NVME_SECURE_ERASE_SETTINGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_SET_ATTRIBUTES_ENTRY` (
    public var `Identifier`: UShort,
    public var `ENDGID`: UShort,
    public var `Reserved1`: UInt,
    public var `Random4KBReadTypical`: UInt,
    public var `OptimalWriteSize`: UInt,
    public var `TotalCapacity`: UByteArray,
    public var `UnallocatedCapacity`: UByteArray,
    public var `Reserved2`: UByteArray,
)
// UNSUPPORTED Rust 3906:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_SET_ATTRIBUTES_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_STATE_ZSC`: `ZONE_STATE` = 4;
public const val `NVME_STATE_ZSE`: `ZONE_STATE` = 1;
public const val `NVME_STATE_ZSEO`: `ZONE_STATE` = 3;
public const val `NVME_STATE_ZSF`: `ZONE_STATE` = 14;
public const val `NVME_STATE_ZSIO`: `ZONE_STATE` = 2;
public const val `NVME_STATE_ZSO`: `ZONE_STATE` = 15;
public const val `NVME_STATE_ZSRO`: `ZONE_STATE` = 13;
public const val `NVME_STATUS_ABORT_COMMAND_LIMIT_EXCEEDED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 3;
public const val `NVME_STATUS_ANA_ATTACH_FAILED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 37;
public const val `NVME_STATUS_ASYNC_EVENT_REQUEST_LIMIT_EXCEEDED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 5;
public const val `NVME_STATUS_ATOMIC_WRITE_UNIT_EXCEEDED`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 20;
public const val `NVME_STATUS_BOOT_PARTITION_WRITE_PROHIBITED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 30;
public const val `NVME_STATUS_COMMAND_ABORTED_DUE_TO_FAILED_FUSED_COMMAND`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 9;
public const val `NVME_STATUS_COMMAND_ABORTED_DUE_TO_FAILED_MISSING_COMMAND`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 10;
public const val `NVME_STATUS_COMMAND_ABORTED_DUE_TO_POWER_LOSS_NOTIFICATION`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 5;
public const val `NVME_STATUS_COMMAND_ABORTED_DUE_TO_PREEMPT_ABORT`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 27;
public const val `NVME_STATUS_COMMAND_ABORTED_DUE_TO_SQ_DELETION`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 8;
public const val `NVME_STATUS_COMMAND_ABORT_REQUESTED`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 7;
public const val `NVME_STATUS_COMMAND_ID_CONFLICT`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 3;
public const val `NVME_STATUS_COMMAND_SEQUENCE_ERROR`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 12;
public typealias `NVME_STATUS_COMMAND_SPECIFIC_CODES` = Int;
public const val `NVME_STATUS_COMPLETION_QUEUE_INVALID`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 0;
public const val `NVME_STATUS_CONTROLLER_LIST_INVALID`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 28;
public const val `NVME_STATUS_DATA_SGL_LENGTH_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 15;
public const val `NVME_STATUS_DATA_TRANSFER_ERROR`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 4;
public const val `NVME_STATUS_DEVICE_SELF_TEST_IN_PROGRESS`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 29;
public const val `NVME_STATUS_DIRECTIVE_ID_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 113;
public const val `NVME_STATUS_DIRECTIVE_TYPE_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 112;
public const val `NVME_STATUS_FEATURE_ID_NOT_SAVEABLE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 13;
public const val `NVME_STATUS_FEATURE_NOT_CHANGEABLE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 14;
public const val `NVME_STATUS_FEATURE_NOT_NAMESPACE_SPECIFIC`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 15;
public const val `NVME_STATUS_FIRMWARE_ACTIVATION_PROHIBITED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 19;
public const val `NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_CONVENTIONAL_RESET`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 11;
public const val `NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_MAX_TIME_VIOLATION`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 18;
public const val `NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_NVM_SUBSYSTEM_RESET`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 16;
public const val `NVME_STATUS_FIRMWARE_ACTIVATION_REQUIRES_RESET`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 17;
public const val `NVME_STATUS_FORMAT_IN_PROGRESS`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 132;
public typealias `NVME_STATUS_GENERIC_COMMAND_CODES` = Int;
public const val `NVME_STATUS_HOST_IDENTIFIER_INCONSISTENT_FORMAT`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 24;
public const val `NVME_STATUS_INTERNAL_DEVICE_ERROR`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 6;
public const val `NVME_STATUS_INVALID_ANA_GROUP_IDENTIFIER`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 36;
public const val `NVME_STATUS_INVALID_COMMAND_OPCODE`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 1;
public const val `NVME_STATUS_INVALID_CONTROLLER_IDENTIFIER`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 31;
public const val `NVME_STATUS_INVALID_FIELD_IN_COMMAND`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 2;
public const val `NVME_STATUS_INVALID_FIRMWARE_IMAGE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 7;
public const val `NVME_STATUS_INVALID_FIRMWARE_SLOT`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 6;
public const val `NVME_STATUS_INVALID_FORMAT`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 10;
public const val `NVME_STATUS_INVALID_INTERRUPT_VECTOR`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 8;
public const val `NVME_STATUS_INVALID_LOG_PAGE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 9;
public const val `NVME_STATUS_INVALID_NAMESPACE_OR_FORMAT`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 11;
public const val `NVME_STATUS_INVALID_NUMBER_OF_CONTROLLER_RESOURCES`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 33;
public const val `NVME_STATUS_INVALID_NUMBER_OF_SGL_DESCR`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 14;
public const val `NVME_STATUS_INVALID_QUEUE_DELETION`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 12;
public const val `NVME_STATUS_INVALID_QUEUE_IDENTIFIER`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 1;
public const val `NVME_STATUS_INVALID_RESOURCE_IDENTIFIER`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 34;
public const val `NVME_STATUS_INVALID_SECONDARY_CONTROLLER_STATE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 32;
public const val `NVME_STATUS_INVALID_SGL_LAST_SEGMENT_DESCR`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 13;
public const val `NVME_STATUS_INVALID_USE_OF_CONTROLLER_MEMORY_BUFFER`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 18;
public const val `NVME_STATUS_KEEP_ALIVE_TIMEOUT_EXPIRED`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 25;
public const val `NVME_STATUS_KEEP_ALIVE_TIMEOUT_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 26;
public const val `NVME_STATUS_MAX_QUEUE_SIZE_EXCEEDED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 2;
public typealias `NVME_STATUS_MEDIA_ERROR_CODES` = Int;
public const val `NVME_STATUS_METADATA_SGL_LENGTH_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 16;
public const val `NVME_STATUS_NAMESPACE_ALREADY_ATTACHED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 24;
public const val `NVME_STATUS_NAMESPACE_IDENTIFIER_UNAVAILABLE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 22;
public const val `NVME_STATUS_NAMESPACE_INSUFFICIENT_CAPACITY`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 21;
public const val `NVME_STATUS_NAMESPACE_IS_PRIVATE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 25;
public const val `NVME_STATUS_NAMESPACE_NOT_ATTACHED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 26;
public const val `NVME_STATUS_NAMESPACE_THIN_PROVISIONING_NOT_SUPPORTED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 27;
public const val `NVME_STATUS_NVM_ACCESS_DENIED`: `NVME_STATUS_MEDIA_ERROR_CODES` = 134;
public const val `NVME_STATUS_NVM_ATTEMPTED_WRITE_TO_READ_ONLY_RANGE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 130;
public const val `NVME_STATUS_NVM_CAPACITY_EXCEEDED`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 129;
public const val `NVME_STATUS_NVM_COMMAND_SIZE_LIMIT_EXCEEDED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 131;
public const val `NVME_STATUS_NVM_COMPARE_FAILURE`: `NVME_STATUS_MEDIA_ERROR_CODES` = 133;
public const val `NVME_STATUS_NVM_CONFLICTING_ATTRIBUTES`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 128;
public const val `NVME_STATUS_NVM_DEALLOCATED_OR_UNWRITTEN_LOGICAL_BLOCK`: `NVME_STATUS_MEDIA_ERROR_CODES` = 135;
public const val `NVME_STATUS_NVM_END_TO_END_APPLICATION_TAG_CHECK_ERROR`: `NVME_STATUS_MEDIA_ERROR_CODES` = 131;
public const val `NVME_STATUS_NVM_END_TO_END_GUARD_CHECK_ERROR`: `NVME_STATUS_MEDIA_ERROR_CODES` = 130;
public const val `NVME_STATUS_NVM_END_TO_END_REFERENCE_TAG_CHECK_ERROR`: `NVME_STATUS_MEDIA_ERROR_CODES` = 132;
public const val `NVME_STATUS_NVM_INVALID_PROTECTION_INFORMATION`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 129;
public const val `NVME_STATUS_NVM_LBA_OUT_OF_RANGE`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 128;
public const val `NVME_STATUS_NVM_NAMESPACE_NOT_READY`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 130;
public const val `NVME_STATUS_NVM_RESERVATION_CONFLICT`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 131;
public const val `NVME_STATUS_NVM_UNRECOVERED_READ_ERROR`: `NVME_STATUS_MEDIA_ERROR_CODES` = 129;
public const val `NVME_STATUS_NVM_WRITE_FAULT`: `NVME_STATUS_MEDIA_ERROR_CODES` = 128;
public const val `NVME_STATUS_OPERATION_DENIED`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 21;
public const val `NVME_STATUS_OVERLAPPING_RANGE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 20;
public const val `NVME_STATUS_PRP_OFFSET_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 19;
public const val `NVME_STATUS_RESERVED`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 23;
public const val `NVME_STATUS_SANITIZE_FAILED`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 28;
public const val `NVME_STATUS_SANITIZE_IN_PROGRESS`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 29;
public const val `NVME_STATUS_SANITIZE_PROHIBITED_ON_PERSISTENT_MEMORY`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 35;
public const val `NVME_STATUS_SGL_DATA_BLOCK_GRANULARITY_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 30;
public const val `NVME_STATUS_SGL_DESCR_TYPE_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 17;
public const val `NVME_STATUS_SGL_OFFSET_INVALID`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 22;
public const val `NVME_STATUS_STREAM_RESOURCE_ALLOCATION_FAILED`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 127;
public const val `NVME_STATUS_SUCCESS_COMPLETION`: `NVME_STATUS_GENERIC_COMMAND_CODES` = 0;
public typealias `NVME_STATUS_TYPES` = Int;
public const val `NVME_STATUS_TYPE_COMMAND_SPECIFIC`: `NVME_STATUS_TYPES` = 1;
public const val `NVME_STATUS_TYPE_GENERIC_COMMAND`: `NVME_STATUS_TYPES` = 0;
public const val `NVME_STATUS_TYPE_MEDIA_ERROR`: `NVME_STATUS_TYPES` = 2;
public const val `NVME_STATUS_TYPE_VENDOR_SPECIFIC`: `NVME_STATUS_TYPES` = 7;
public const val `NVME_STATUS_ZONE_BOUNDARY_ERROR`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 184;
public const val `NVME_STATUS_ZONE_FULL`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 185;
public const val `NVME_STATUS_ZONE_INVALID_FORMAT`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 127;
public const val `NVME_STATUS_ZONE_INVALID_STATE_TRANSITION`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 191;
public const val `NVME_STATUS_ZONE_INVALID_WRITE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 188;
public const val `NVME_STATUS_ZONE_OFFLINE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 187;
public const val `NVME_STATUS_ZONE_READ_ONLY`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 186;
public const val `NVME_STATUS_ZONE_TOO_MANY_ACTIVE`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 189;
public const val `NVME_STATUS_ZONE_TOO_MANY_OPEN`: `NVME_STATUS_COMMAND_SPECIFIC_CODES` = 190;
public const val `NVME_STREAMS_GET_STATUS_MAX_IDS`: UInt = 65535u;
public const val `NVME_STREAMS_ID_MAX`: UInt = 65535u;
public const val `NVME_STREAMS_ID_MIN`: UInt = 1u;
// UNSUPPORTED Rust 4025:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_SUBMISSION_QUEUE_TAIL_DOORBELL {
//     pub Anonymous: NVME_SUBMISSION_QUEUE_TAIL_DOORBELL_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 4031:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_SUBMISSION_QUEUE_TAIL_DOORBELL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_SUBMISSION_QUEUE_TAIL_DOORBELL_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 362 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_TELEMETRY_CONTROLLER_INITIATED_LOG` (
    public var `LogIdentifier`: UByte,
    public var `Reserved0`: UByteArray,
    public var `OrganizationID`: UByteArray,
    public var `Area1LastBlock`: UShort,
    public var `Area2LastBlock`: UShort,
    public var `Area3LastBlock`: UShort,
    public var `Reserved1`: UByteArray,
    public var `Area4LastBlock`: UInt,
    public var `Reserved2`: UByteArray,
    public var `ControllerInitiatedDataAvailable`: UByte,
    public var `ControllerInitiatedDataGenerationNumber`: UByte,
    public var `ReasonIdentifier`: UByteArray,
)
// UNSUPPORTED Rust 4057:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_TELEMETRY_CONTROLLER_INITIATED_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_TELEMETRY_DATA_BLOCK_SIZE`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 361 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_TELEMETRY_HOST_INITIATED_LOG` (
    public var `LogIdentifier`: UByte,
    public var `Reserved0`: UByteArray,
    public var `OrganizationID`: UByteArray,
    public var `Area1LastBlock`: UShort,
    public var `Area2LastBlock`: UShort,
    public var `Area3LastBlock`: UShort,
    public var `Reserved1`: UByteArray,
    public var `Area4LastBlock`: UInt,
    public var `Reserved2`: UByteArray,
    public var `HostInitiatedDataGenerationNumber`: UByte,
    public var `ControllerInitiatedDataAvailable`: UByte,
    public var `ControllerInitiatedDataGenerationNumber`: UByte,
    public var `ReasonIdentifier`: UByteArray,
)
// UNSUPPORTED Rust 4080:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_TELEMETRY_HOST_INITIATED_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_TEMPERATURE_OVER_THRESHOLD`: `NVME_TEMPERATURE_THRESHOLD_TYPES` = 0;
public typealias `NVME_TEMPERATURE_THRESHOLD_TYPES` = Int;
public const val `NVME_TEMPERATURE_UNDER_THRESHOLD`: `NVME_TEMPERATURE_THRESHOLD_TYPES` = 1;
public typealias `NVME_VENDOR_LOG_PAGES` = Int;
// UNSUPPORTED Rust 4089:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_VERSION {
//     pub Anonymous: NVME_VERSION_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 4095:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_VERSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_VERSION_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_WCS_DEVICE_CAPABILITIES` (
    public var `Anonymous`: `NVME_WCS_DEVICE_CAPABILITIES_0`,
)
// UNSUPPORTED Rust 4110:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4115:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_WCS_DEVICE_CAPABILITIES_0 {
//     pub Anonymous: NVME_WCS_DEVICE_CAPABILITIES_0_0,
//     pub AsULONG: u32,
// }

// UNSUPPORTED Rust 4121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_CAPABILITIES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_WCS_DEVICE_CAPABILITIES_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 466 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_WCS_DEVICE_ERROR_RECOVERY_LOG` (
    public var `PanicResetWaitTime`: UShort,
    public var `PanicResetAction`: `NVME_WCS_DEVICE_RESET_ACTION`,
    public var `DriveRecoveryAction`: UByte,
    public var `PanicId`: ULong,
    public var `DeviceCapabilitiesA`: `NVME_WCS_DEVICE_CAPABILITIES`,
    public var `VendorSpecificRecoveryCode`: UByte,
    public var `Reserved0`: UByteArray,
    public var `VendorSpecificCommandCDW12`: UInt,
    public var `VendorSpecificCommandCDW13`: UInt,
    public var `Reserved1`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 4147:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_ERROR_RECOVERY_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVME_WCS_DEVICE_ERROR_RECOVERY_LOG_VERSION_1`: UInt = 1u;
public typealias `NVME_WCS_DEVICE_RECOVERY_ACTION1` = Int;
public typealias `NVME_WCS_DEVICE_RECOVERY_ACTION2` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_WCS_DEVICE_RESET_ACTION` (
    public var `Anonymous`: `NVME_WCS_DEVICE_RESET_ACTION_0`,
)
// UNSUPPORTED Rust 4160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_RESET_ACTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4165:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVME_WCS_DEVICE_RESET_ACTION_0 {
//     pub Anonymous: NVME_WCS_DEVICE_RESET_ACTION_0_0,
//     pub AsUCHAR: u8,
// }

// UNSUPPORTED Rust 4171:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_RESET_ACTION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_WCS_DEVICE_RESET_ACTION_0_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 494 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG` (
    public var `VersionSpecificData`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 4188:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 302 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2` (
    public var `MediaUnitsWritten`: UByteArray,
    public var `MediaUnitsRead`: UByteArray,
    public var `BadUserNANDBlockCount`: `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_0`,
    public var `BadSystemNANDBlockCount`: `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_1`,
    public var `XORRecoveryCount`: ULong,
    public var `UnrecoverableReadErrorCount`: ULong,
    public var `SoftECCErrorCount`: ULong,
    public var `EndToEndCorrectionCounts`: `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_2`,
    public var `PercentageSystemDataUsed`: UByte,
    public var `RefreshCount`: UByteArray,
    public var `UserDataEraseCounts`: `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_3`,
    public var `ThermalThrottling`: `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_4`,
    public var `Reserved0`: UByteArray,
    public var `PCIeCorrectableErrorCount`: ULong,
    public var `IncompleteShutdownCount`: UInt,
    public var `Reserved1`: UInt,
    public var `PercentageFreeBlocks`: UByte,
    public var `Reserved2`: UByteArray,
    public var `CapacitorHealth`: UShort,
    public var `Reserved3`: UByteArray,
    public var `UnalignedIOCount`: ULong,
    public var `SecurityVersionNumber`: ULong,
    public var `NUSE`: ULong,
    public var `PLPStartCount`: UByteArray,
    public var `EnduranceEstimate`: UByteArray,
    public var `Reserved4`: UByteArray,
    public var `LogPageVersionNumber`: UShort,
    public var `LogPageGUID`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 4225:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_1` (
    public var `RawCount`: UByteArray,
    public var `Normalized`: UByteArray,
)
// UNSUPPORTED Rust 4236:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_0` (
    public var `RawCount`: UByteArray,
    public var `Normalized`: UByteArray,
)
// UNSUPPORTED Rust 4247:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_2` (
    public var `DetectedCounts`: UInt,
    public var `CorrectedCounts`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_4` (
    public var `EventCount`: UByte,
    public var `Status`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_3` (
    public var `MaximumCount`: UInt,
    public var `MinimumCount`: UInt,
)
public const val `NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_VERSION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_ZONE_DESCRIPTOR` (
    public var `Anonymous1`: `NVME_ZONE_DESCRIPTOR_0`,
    public var `Anonymous2`: `NVME_ZONE_DESCRIPTOR_1`,
    public var `ZA`: `NVME_ZONE_DESCRIPTOR_2`,
    public var `Reserved3`: UByteArray,
    public var `ZCAP`: ULong,
    public var `ZSLBA`: ULong,
    public var `WritePointer`: ULong,
    public var `Reserved4`: UByteArray,
)
// UNSUPPORTED Rust 4283:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ZONE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ZONE_DESCRIPTOR_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ZONE_DESCRIPTOR_1` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVME_ZONE_DESCRIPTOR_2` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_ZONE_DESCRIPTOR_EXTENSION` (
    public var `ZoneDescriptorExtensionInfo`: UByteArray,
)
// UNSUPPORTED Rust 4308:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ZONE_DESCRIPTOR_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVME_ZONE_EXTENDED_REPORT_ZONE_DESC` (
    public var `ZoneDescriptor`: `NVME_ZONE_DESCRIPTOR`,
    public var `ZoneDescriptorExtension`: Array<`NVME_ZONE_DESCRIPTOR_EXTENSION`>,
)
// UNSUPPORTED Rust 4319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVME_ZONE_EXTENDED_REPORT_ZONE_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NVME_ZONE_RECEIVE_ACTION` = Int;
public typealias `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = Int;
public const val `NVME_ZONE_RECEIVE_EXTENDED_REPORT_ZONES`: `NVME_ZONE_RECEIVE_ACTION` = 1;
public const val `NVME_ZONE_RECEIVE_REPORT_ZONES`: `NVME_ZONE_RECEIVE_ACTION` = 0;
public typealias `NVME_ZONE_SEND_ACTION` = Int;
public const val `NVME_ZONE_SEND_CLOSE`: `NVME_ZONE_SEND_ACTION` = 1;
public const val `NVME_ZONE_SEND_FINISH`: `NVME_ZONE_SEND_ACTION` = 2;
public const val `NVME_ZONE_SEND_OFFLINE`: `NVME_ZONE_SEND_ACTION` = 5;
public const val `NVME_ZONE_SEND_OPEN`: `NVME_ZONE_SEND_ACTION` = 3;
public const val `NVME_ZONE_SEND_RESET`: `NVME_ZONE_SEND_ACTION` = 4;
public const val `NVME_ZONE_SEND_SET_ZONE_DESCRIPTOR`: `NVME_ZONE_SEND_ACTION` = 16;
public const val `NVME_ZRA_ALL_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 0;
public const val `NVME_ZRA_CLOSED_STATE_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 4;
public const val `NVME_ZRA_EMPTY_STATE_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 1;
public const val `NVME_ZRA_EO_STATE_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 3;
public const val `NVME_ZRA_FULL_STATE_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 5;
public const val `NVME_ZRA_IO_STATE_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 2;
public const val `NVME_ZRA_OFFLINE_STATE_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 7;
public const val `NVME_ZRA_RO_STATE_ZONES`: `NVME_ZONE_RECEIVE_ACTION_SPECIFIC` = 6;
// UNSUPPORTED Rust 4343:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NVM_RESERVATION_CAPABILITIES {
//     pub Anonymous: NVM_RESERVATION_CAPABILITIES_0,
//     pub AsUchar: u8,
// }

// UNSUPPORTED Rust 4349:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVM_RESERVATION_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NVM_RESERVATION_CAPABILITIES_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 127 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NVM_SET_LIST` (
    public var `IdentifierCount`: UByte,
    public var `Reserved`: UByteArray,
    public var `Entry`: Array<`NVME_SET_ATTRIBUTES_ENTRY`>,
)
// UNSUPPORTED Rust 4366:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NVM_SET_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NVMeDeviceRecovery1Max`: `NVME_WCS_DEVICE_RECOVERY_ACTION1` = 15;
public const val `NVMeDeviceRecovery2Max`: `NVME_WCS_DEVICE_RECOVERY_ACTION2` = 15;
public const val `NVMeDeviceRecoveryControllerReset`: `NVME_WCS_DEVICE_RECOVERY_ACTION2` = 0;
public const val `NVMeDeviceRecoveryDeviceReplacement`: `NVME_WCS_DEVICE_RECOVERY_ACTION1` = 4;
public const val `NVMeDeviceRecoveryFormatNVM`: `NVME_WCS_DEVICE_RECOVERY_ACTION1` = 1;
public const val `NVMeDeviceRecoveryNoAction`: `NVME_WCS_DEVICE_RECOVERY_ACTION1` = 0;
public const val `NVMeDeviceRecoveryPERST`: `NVME_WCS_DEVICE_RECOVERY_ACTION2` = 3;
public const val `NVMeDeviceRecoveryPcieFunctionReset`: `NVME_WCS_DEVICE_RECOVERY_ACTION2` = 2;
public const val `NVMeDeviceRecoveryPcieHotReset`: `NVME_WCS_DEVICE_RECOVERY_ACTION2` = 5;
public const val `NVMeDeviceRecoveryPowerCycle`: `NVME_WCS_DEVICE_RECOVERY_ACTION2` = 4;
public const val `NVMeDeviceRecoverySanitize`: `NVME_WCS_DEVICE_RECOVERY_ACTION1` = 5;
public const val `NVMeDeviceRecoverySubsystemReset`: `NVME_WCS_DEVICE_RECOVERY_ACTION2` = 1;
public const val `NVMeDeviceRecoveryVendorAnalysis`: `NVME_WCS_DEVICE_RECOVERY_ACTION1` = 3;
public const val `NVMeDeviceRecoveryVendorSpecificCommand`: `NVME_WCS_DEVICE_RECOVERY_ACTION1` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCG_ACTIVATE_METHOD_SPECIFIC` (
    public var `RangeStartLengthPolicy`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCG_ASSIGN_METHOD_SPECIFIC` (
    public var `NamespaceId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCG_AUTH_METHOD_SPECIFIC` (
    public var `AuthorityId`: ULong,
    public var `TriesCount`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCG_BLOCKSID_METHOD_SPECIFIC` (
    public var `ClearEvents`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCG_HISTORY_ENTRY` (
    public var `VersionNumber`: UByte,
    public var `EntryLength`: UByte,
    public var `PowerCycleCount`: UShort,
    public var `TcgCommandCount`: UInt,
    public var `TcgCommandCompletionTS`: ULong,
    public var `InvokingId`: ULong,
    public var `MethodId`: ULong,
    public var `ComId`: UShort,
    public var `ProtocolId`: UByte,
    public var `TcgStatus`: UByte,
    public var `ProcessTime`: UShort,
    public var `CommandSpecific`: UByteArray,
)
// UNSUPPORTED Rust 4422:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCG_HISTORY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TCG_HISTORY_ENTRY_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TCG_REACTIVATE_METHOD_SPECIFIC` (
    public var `RangeStartLengthPolicy`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNSUPPORTED_REQUIREMENT` (
    public var `ReqId`: UByteArray,
)
// UNSUPPORTED Rust 4438:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UNSUPPORTED_REQUIREMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ZONE_STATE` = Int;
