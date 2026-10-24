// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `ADR_ENCODES_CURRENT_POSITION`: UInt = 1u;
public const val `ADR_ENCODES_ISRC`: UInt = 3u;
public const val `ADR_ENCODES_MEDIA_CATALOG`: UInt = 2u;
public const val `ADR_NO_MODE_INFORMATION`: UInt = 0u;
public const val `AUDIO_DATA_TRACK`: UInt = 4u;
public const val `AUDIO_STATUS_IN_PROGRESS`: UInt = 17u;
public const val `AUDIO_STATUS_NOT_SUPPORTED`: UInt = 0u;
public const val `AUDIO_STATUS_NO_STATUS`: UInt = 21u;
public const val `AUDIO_STATUS_PAUSED`: UInt = 18u;
public const val `AUDIO_STATUS_PLAY_COMPLETE`: UInt = 19u;
public const val `AUDIO_STATUS_PLAY_ERROR`: UInt = 20u;
public const val `AUDIO_WITH_PREEMPHASIS`: UInt = 1u;
public const val `CDDA`: `TRACK_MODE_TYPE` = 2;
public const val `CDROM_CD_TEXT_PACK_ALBUM_NAME`: UInt = 128u;
public const val `CDROM_CD_TEXT_PACK_ARRANGER`: UInt = 132u;
public const val `CDROM_CD_TEXT_PACK_COMPOSER`: UInt = 131u;
public const val `CDROM_CD_TEXT_PACK_DISC_ID`: UInt = 134u;
public const val `CDROM_CD_TEXT_PACK_GENRE`: UInt = 135u;
public const val `CDROM_CD_TEXT_PACK_MESSAGES`: UInt = 133u;
public const val `CDROM_CD_TEXT_PACK_PERFORMER`: UInt = 129u;
public const val `CDROM_CD_TEXT_PACK_SIZE_INFO`: UInt = 143u;
public const val `CDROM_CD_TEXT_PACK_SONGWRITER`: UInt = 130u;
public const val `CDROM_CD_TEXT_PACK_TOC_INFO`: UInt = 136u;
public const val `CDROM_CD_TEXT_PACK_TOC_INFO2`: UInt = 137u;
public const val `CDROM_CD_TEXT_PACK_UPC_EAN`: UInt = 142u;
public const val `CDROM_DISK_AUDIO_TRACK`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_DISK_DATA` (
    public var `DiskData`: UInt,
)
public const val `CDROM_DISK_DATA_TRACK`: UInt = 2u;
// UNSUPPORTED Rust 33:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_EXCEPTION_PERFORMANCE_DESCRIPTOR {
//     pub Lba: [u8; 4],
//     pub Time: [u8; 2],
// }

// UNSUPPORTED Rust 39:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_EXCEPTION_PERFORMANCE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_EXCLUSIVE_ACCESS` (
    public var `RequestType`: `EXCLUSIVE_ACCESS_REQUEST_TYPE`,
    public var `Flags`: UInt,
)
public const val `CDROM_EXCLUSIVE_CALLER_LENGTH`: UInt = 64u;
// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_EXCLUSIVE_LOCK {
//     pub Access: CDROM_EXCLUSIVE_ACCESS,
//     pub CallerName: [u8; 64],
// }

// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_EXCLUSIVE_LOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 62:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_EXCLUSIVE_LOCK_STATE {
//     pub LockState: bool,
//     pub CallerName: [u8; 64],
// }

// UNSUPPORTED Rust 68:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_EXCLUSIVE_LOCK_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CDROM_IN_EXCLUSIVE_MODE`: UInt = 1u;
public const val `CDROM_LOCK_IGNORE_VOLUME`: UInt = 1u;
// UNSUPPORTED Rust 75:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_NOMINAL_PERFORMANCE_DESCRIPTOR {
//     pub StartLba: [u8; 4],
//     pub StartPerformance: [u8; 4],
//     pub EndLba: [u8; 4],
//     pub EndPerformance: [u8; 4],
// }

// UNSUPPORTED Rust 83:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_NOMINAL_PERFORMANCE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CDROM_NOT_IN_EXCLUSIVE_MODE`: UInt = 0u;
public const val `CDROM_NO_MEDIA_NOTIFICATIONS`: UInt = 2u;
public typealias `CDROM_OPC_INFO_TYPE` = Int;
public typealias `CDROM_PERFORMANCE_EXCEPTION_TYPE` = Int;
// UNSUPPORTED Rust 92:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_PERFORMANCE_HEADER {
//     pub DataLength: [u8; 4],
//     pub _bitfield: u8,
//     pub Reserved2: [u8; 3],
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_PERFORMANCE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_PERFORMANCE_REQUEST` (
    public var `RequestType`: `CDROM_PERFORMANCE_REQUEST_TYPE`,
    public var `PerformanceType`: `CDROM_PERFORMANCE_TYPE`,
    public var `Exceptions`: `CDROM_PERFORMANCE_EXCEPTION_TYPE`,
    public var `Tolerance`: `CDROM_PERFORMANCE_TOLERANCE_TYPE`,
    public var `StaringLba`: UInt,
)
public typealias `CDROM_PERFORMANCE_REQUEST_TYPE` = Int;
public typealias `CDROM_PERFORMANCE_TOLERANCE_TYPE` = Int;
public typealias `CDROM_PERFORMANCE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_PLAY_AUDIO_MSF` (
    public var `StartingM`: UByte,
    public var `StartingS`: UByte,
    public var `StartingF`: UByte,
    public var `EndingM`: UByte,
    public var `EndingS`: UByte,
    public var `EndingF`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_READ_TOC_EX` (
    public var `_bitfield`: UByte,
    public var `SessionTrack`: UByte,
    public var `Reserved2`: UByte,
    public var `Reserved3`: UByte,
)
public const val `CDROM_READ_TOC_EX_FORMAT_ATIP`: UInt = 4u;
public const val `CDROM_READ_TOC_EX_FORMAT_CDTEXT`: UInt = 5u;
public const val `CDROM_READ_TOC_EX_FORMAT_FULL_TOC`: UInt = 2u;
public const val `CDROM_READ_TOC_EX_FORMAT_PMA`: UInt = 3u;
public const val `CDROM_READ_TOC_EX_FORMAT_SESSION`: UInt = 1u;
public const val `CDROM_READ_TOC_EX_FORMAT_TOC`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_SEEK_AUDIO_MSF` (
    public var `M`: UByte,
    public var `S`: UByte,
    public var `F`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_SET_SPEED` (
    public var `RequestType`: `CDROM_SPEED_REQUEST`,
    public var `ReadSpeed`: UShort,
    public var `WriteSpeed`: UShort,
    public var `RotationControl`: `WRITE_ROTATION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_SET_STREAMING` (
    public var `RequestType`: `CDROM_SPEED_REQUEST`,
    public var `ReadSize`: UInt,
    public var `ReadTime`: UInt,
    public var `WriteSize`: UInt,
    public var `WriteTime`: UInt,
    public var `StartLba`: UInt,
    public var `EndLba`: UInt,
    public var `RotationControl`: `WRITE_ROTATION`,
    public var `RestoreDefaults`: Boolean,
    public var `SetExact`: Boolean,
    public var `RandomAccess`: Boolean,
    public var `Persistent`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_SIMPLE_OPC_INFO` (
    public var `RequestType`: `CDROM_OPC_INFO_TYPE`,
    public var `Exclude0`: Boolean,
    public var `Exclude1`: Boolean,
)
public typealias `CDROM_SPEED_REQUEST` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_STREAMING_CONTROL` (
    public var `RequestType`: `STREAMING_CONTROL_REQUEST_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_SUB_Q_DATA_FORMAT` (
    public var `Format`: UByte,
    public var `Track`: UByte,
)
// UNSUPPORTED Rust 191:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC {
//     pub Length: [u8; 2],
//     pub FirstTrack: u8,
//     pub LastTrack: u8,
//     pub TrackData: [TRACK_DATA; 100],
// }

// UNSUPPORTED Rust 199:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 204:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_ATIP_DATA {
//     pub Length: [u8; 2],
//     pub Reserved1: u8,
//     pub Reserved2: u8,
//     pub Descriptors: [CDROM_TOC_ATIP_DATA_BLOCK; 1],
// }

// UNSUPPORTED Rust 212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_ATIP_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 217:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_ATIP_DATA_BLOCK {
//     pub _bitfield1: u8,
//     pub _bitfield2: u8,
//     pub _bitfield3: u8,
//     pub Reserved7: u8,
//     pub LeadInMsf: [u8; 3],
//     pub Reserved8: u8,
//     pub LeadOutMsf: [u8; 3],
//     pub Reserved9: u8,
//     pub A1Values: [u8; 3],
//     pub Reserved10: u8,
//     pub A2Values: [u8; 3],
//     pub Reserved11: u8,
//     pub A3Values: [u8; 3],
//     pub Reserved12: u8,
// }

// UNSUPPORTED Rust 235:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_ATIP_DATA_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_CD_TEXT_DATA {
//     pub Length: [u8; 2],
//     pub Reserved1: u8,
//     pub Reserved2: u8,
//     pub Descriptors: [CDROM_TOC_CD_TEXT_DATA_BLOCK; 1],
// }

// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_CD_TEXT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 253:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_CD_TEXT_DATA_BLOCK {
//     pub PackType: u8,
//     pub _bitfield1: u8,
//     pub SequenceNumber: u8,
//     pub _bitfield2: u8,
//     pub Anonymous: CDROM_TOC_CD_TEXT_DATA_BLOCK_0,
//     pub CRC: [u8; 2],
// }

// UNSUPPORTED Rust 263:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_CD_TEXT_DATA_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 268:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CDROM_TOC_CD_TEXT_DATA_BLOCK_0 {
//     pub Text: [u8; 12],
//     pub WText: [u16; 6],
// }

// UNSUPPORTED Rust 274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_CD_TEXT_DATA_BLOCK_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 279:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_FULL_TOC_DATA {
//     pub Length: [u8; 2],
//     pub FirstCompleteSession: u8,
//     pub LastCompleteSession: u8,
//     pub Descriptors: [CDROM_TOC_FULL_TOC_DATA_BLOCK; 1],
// }

// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_FULL_TOC_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 292:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_FULL_TOC_DATA_BLOCK {
//     pub SessionNumber: u8,
//     pub _bitfield: u8,
//     pub Reserved1: u8,
//     pub Point: u8,
//     pub MsfExtra: [u8; 3],
//     pub Zero: u8,
//     pub Msf: [u8; 3],
// }

// UNSUPPORTED Rust 303:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_FULL_TOC_DATA_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 308:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_PMA_DATA {
//     pub Length: [u8; 2],
//     pub Reserved1: u8,
//     pub Reserved2: u8,
//     pub Descriptors: [CDROM_TOC_FULL_TOC_DATA_BLOCK; 1],
// }

// UNSUPPORTED Rust 316:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_PMA_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 321:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_TOC_SESSION_DATA {
//     pub Length: [u8; 2],
//     pub FirstCompleteSession: u8,
//     pub LastCompleteSession: u8,
//     pub TrackData: [TRACK_DATA; 1],
// }

// UNSUPPORTED Rust 329:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_TOC_SESSION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 334:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CDROM_WRITE_SPEED_DESCRIPTOR {
//     pub _bitfield: u8,
//     pub Reserved3: [u8; 3],
//     pub EndLba: [u8; 4],
//     pub ReadSpeed: [u8; 4],
//     pub WriteSpeed: [u8; 4],
// }

// UNSUPPORTED Rust 343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CDROM_WRITE_SPEED_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CDROM_WRITE_SPEED_REQUEST` (
    public var `RequestType`: `CDROM_PERFORMANCE_REQUEST_TYPE`,
)
public const val `CD_RAW_READ_C2_SIZE`: UInt = 296u;
public const val `CD_RAW_READ_SUBCODE_SIZE`: UInt = 96u;
public const val `CD_RAW_SECTOR_WITH_C2_SIZE`: UInt = 2648u;
public const val `CD_RAW_SECTOR_WITH_SUBCODE_SIZE`: UInt = 2448u;
public const val `Cdrom10Nominal20Exceptions`: `CDROM_PERFORMANCE_TOLERANCE_TYPE` = 1;
public const val `CdromCAVRotation`: `WRITE_ROTATION` = 1;
public const val `CdromDefaultRotation`: `WRITE_ROTATION` = 0;
public const val `CdromEntirePerformanceList`: `CDROM_PERFORMANCE_EXCEPTION_TYPE` = 2;
public const val `CdromNominalPerformance`: `CDROM_PERFORMANCE_EXCEPTION_TYPE` = 1;
public const val `CdromPerformanceExceptionsOnly`: `CDROM_PERFORMANCE_EXCEPTION_TYPE` = 3;
public const val `CdromPerformanceRequest`: `CDROM_PERFORMANCE_REQUEST_TYPE` = 1;
public const val `CdromReadPerformance`: `CDROM_PERFORMANCE_TYPE` = 1;
public const val `CdromSetSpeed`: `CDROM_SPEED_REQUEST` = 0;
public const val `CdromSetStreaming`: `CDROM_SPEED_REQUEST` = 1;
public const val `CdromStreamingDisable`: `STREAMING_CONTROL_REQUEST_TYPE` = 1;
public const val `CdromStreamingEnableForReadOnly`: `STREAMING_CONTROL_REQUEST_TYPE` = 2;
public const val `CdromStreamingEnableForReadWrite`: `STREAMING_CONTROL_REQUEST_TYPE` = 4;
public const val `CdromStreamingEnableForWriteOnly`: `STREAMING_CONTROL_REQUEST_TYPE` = 3;
public const val `CdromWritePerformance`: `CDROM_PERFORMANCE_TYPE` = 2;
public const val `CdromWriteSpeedRequest`: `CDROM_PERFORMANCE_REQUEST_TYPE` = 2;
public const val `DIGITAL_COPY_PERMITTED`: UInt = 2u;
public typealias `EXCLUSIVE_ACCESS_REQUEST_TYPE` = Int;
public const val `ExclusiveAccessLockDevice`: `EXCLUSIVE_ACCESS_REQUEST_TYPE` = 1;
public const val `ExclusiveAccessQueryState`: `EXCLUSIVE_ACCESS_REQUEST_TYPE` = 0;
public const val `ExclusiveAccessUnlockDevice`: `EXCLUSIVE_ACCESS_REQUEST_TYPE` = 2;
public const val `IOCTL_CDROM_BASE`: Int = 2;
public const val `IOCTL_CDROM_CHECK_VERIFY`: UInt = 149504u;
public const val `IOCTL_CDROM_CURRENT_POSITION`: UInt = 1u;
public const val `IOCTL_CDROM_DISK_TYPE`: UInt = 131136u;
public const val `IOCTL_CDROM_EJECT_MEDIA`: UInt = 149512u;
public const val `IOCTL_CDROM_ENABLE_STREAMING`: UInt = 147560u;
public const val `IOCTL_CDROM_EXCLUSIVE_ACCESS`: UInt = 180316u;
public const val `IOCTL_CDROM_FIND_NEW_DEVICES`: UInt = 149528u;
public const val `IOCTL_CDROM_GET_CONFIGURATION`: UInt = 147544u;
public const val `IOCTL_CDROM_GET_CONTROL`: UInt = 147508u;
public const val `IOCTL_CDROM_GET_DRIVE_GEOMETRY`: UInt = 147532u;
public const val `IOCTL_CDROM_GET_DRIVE_GEOMETRY_EX`: UInt = 147536u;
public const val `IOCTL_CDROM_GET_INQUIRY_DATA`: UInt = 147556u;
public const val `IOCTL_CDROM_GET_LAST_SESSION`: UInt = 147512u;
public const val `IOCTL_CDROM_GET_PERFORMANCE`: UInt = 147568u;
public const val `IOCTL_CDROM_GET_VOLUME`: UInt = 147476u;
public const val `IOCTL_CDROM_LOAD_MEDIA`: UInt = 149516u;
public const val `IOCTL_CDROM_MEDIA_CATALOG`: UInt = 2u;
public const val `IOCTL_CDROM_MEDIA_REMOVAL`: UInt = 149508u;
public const val `IOCTL_CDROM_PAUSE_AUDIO`: UInt = 147468u;
public const val `IOCTL_CDROM_PLAY_AUDIO_MSF`: UInt = 147480u;
public const val `IOCTL_CDROM_RAW_READ`: UInt = 147518u;
public const val `IOCTL_CDROM_READ_Q_CHANNEL`: UInt = 147500u;
public const val `IOCTL_CDROM_READ_TOC`: UInt = 147456u;
public const val `IOCTL_CDROM_READ_TOC_EX`: UInt = 147540u;
public const val `IOCTL_CDROM_RELEASE`: UInt = 149524u;
public const val `IOCTL_CDROM_RESERVE`: UInt = 149520u;
public const val `IOCTL_CDROM_RESUME_AUDIO`: UInt = 147472u;
public const val `IOCTL_CDROM_SEEK_AUDIO_MSF`: UInt = 147460u;
public const val `IOCTL_CDROM_SEND_OPC_INFORMATION`: UInt = 180332u;
public const val `IOCTL_CDROM_SET_SPEED`: UInt = 147552u;
public const val `IOCTL_CDROM_SET_VOLUME`: UInt = 147496u;
public const val `IOCTL_CDROM_SIMBAD`: UInt = 147468u;
public const val `IOCTL_CDROM_STOP_AUDIO`: UInt = 147464u;
public const val `IOCTL_CDROM_SUB_Q_CHANNEL`: UInt = 0u;
public const val `IOCTL_CDROM_TRACK_ISRC`: UInt = 3u;
public const val `IOCTL_CDROM_UNLOAD_DRIVER`: UInt = 151560u;
public const val `MAXIMUM_CDROM_INQUIRY_SIZE`: UInt = 260u;
public const val `MAXIMUM_CDROM_SIZE`: UInt = 804u;
public const val `MAXIMUM_NUMBER_TRACKS`: UInt = 100u;
public typealias `MEDIA_BLANK_TYPE` = Int;
public const val `MINIMUM_CDROM_INQUIRY_SIZE`: UInt = 36u;
public const val `MINIMUM_CDROM_READ_TOC_EX_SIZE`: UInt = 2u;
public const val `MediaBlankTypeEraseLastSession`: `MEDIA_BLANK_TYPE` = 6;
public const val `MediaBlankTypeFull`: `MEDIA_BLANK_TYPE` = 0;
public const val `MediaBlankTypeIncompleteTrack`: `MEDIA_BLANK_TYPE` = 2;
public const val `MediaBlankTypeMinimal`: `MEDIA_BLANK_TYPE` = 1;
public const val `MediaBlankTypeTrackTail`: `MEDIA_BLANK_TYPE` = 4;
public const val `MediaBlankTypeUncloseLastSession`: `MEDIA_BLANK_TYPE` = 5;
public const val `MediaBlankTypeUnreserveLastTrack`: `MEDIA_BLANK_TYPE` = 3;
public const val `OBSOLETE_IOCTL_CDROM_GET_CONTROL`: UInt = 147508u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAW_READ_INFO` (
    public var `DiskOffset`: Long,
    public var `SectorCount`: UInt,
    public var `TrackMode`: `TRACK_MODE_TYPE`,
)
public const val `RawWithC2`: `TRACK_MODE_TYPE` = 4;
public const val `RawWithC2AndSubCode`: `TRACK_MODE_TYPE` = 3;
public const val `RawWithSubCode`: `TRACK_MODE_TYPE` = 5;
public typealias `STREAMING_CONTROL_REQUEST_TYPE` = Int;
// UNSUPPORTED Rust 440:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SUB_Q_CHANNEL_DATA {
//     pub CurrentPosition: SUB_Q_CURRENT_POSITION,
//     pub MediaCatalog: SUB_Q_MEDIA_CATALOG_NUMBER,
//     pub TrackIsrc: SUB_Q_TRACK_ISRC,
// }

// UNSUPPORTED Rust 447:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SUB_Q_CHANNEL_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 452:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SUB_Q_CURRENT_POSITION {
//     pub Header: SUB_Q_HEADER,
//     pub FormatCode: u8,
//     pub _bitfield: u8,
//     pub TrackNumber: u8,
//     pub IndexNumber: u8,
//     pub AbsoluteAddress: [u8; 4],
//     pub TrackRelativeAddress: [u8; 4],
// }

// UNSUPPORTED Rust 463:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SUB_Q_CURRENT_POSITION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 468:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SUB_Q_HEADER {
//     pub Reserved: u8,
//     pub AudioStatus: u8,
//     pub DataLength: [u8; 2],
// }

// UNSUPPORTED Rust 475:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SUB_Q_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 480:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SUB_Q_MEDIA_CATALOG_NUMBER {
//     pub Header: SUB_Q_HEADER,
//     pub FormatCode: u8,
//     pub Reserved: [u8; 3],
//     pub _bitfield: u8,
//     pub MediaCatalog: [u8; 15],
// }

// UNSUPPORTED Rust 489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SUB_Q_MEDIA_CATALOG_NUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 494:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SUB_Q_TRACK_ISRC {
//     pub Header: SUB_Q_HEADER,
//     pub FormatCode: u8,
//     pub Reserved0: u8,
//     pub Track: u8,
//     pub Reserved1: u8,
//     pub _bitfield: u8,
//     pub TrackIsrc: [u8; 15],
// }

// UNSUPPORTED Rust 505:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SUB_Q_TRACK_ISRC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SimpleOpcInfo`: `CDROM_OPC_INFO_TYPE` = 1;
// UNSUPPORTED Rust 511:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TRACK_DATA {
//     pub Reserved: u8,
//     pub _bitfield: u8,
//     pub TrackNumber: u8,
//     pub Reserved1: u8,
//     pub Address: [u8; 4],
// }

// UNSUPPORTED Rust 520:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRACK_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TRACK_MODE_TYPE` = Int;
public const val `TWO_FOUR_CHANNEL_AUDIO`: UInt = 8u;
// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VOLUME_CONTROL {
//     pub PortVolume: [u8; 4],
// }

// UNSUPPORTED Rust 532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_CONTROL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WRITE_ROTATION` = Int;
public const val `XAForm2`: `TRACK_MODE_TYPE` = 1;
public const val `YellowMode2`: `TRACK_MODE_TYPE` = 0;
