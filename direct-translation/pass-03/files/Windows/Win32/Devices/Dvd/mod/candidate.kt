// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AACS_BINDING_NONCE {
//     pub BindingNonce: [u8; 16],
//     pub MAC: [u8; 16],
// }

// UNSUPPORTED Rust 7:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_BINDING_NONCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 12:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AACS_CERTIFICATE {
//     pub Nonce: [u8; 20],
//     pub Certificate: [u8; 92],
// }

// UNSUPPORTED Rust 18:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_CERTIFICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 23:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AACS_CHALLENGE_KEY {
//     pub EllipticCurvePoint: [u8; 40],
//     pub Signature: [u8; 40],
// }

// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_CHALLENGE_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 34:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AACS_MEDIA_ID {
//     pub MediaID: [u8; 16],
//     pub MAC: [u8; 16],
// }

// UNSUPPORTED Rust 40:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_MEDIA_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_READ_BINDING_NONCE` (
    public var `SessionId`: UInt,
    public var `NumberOfSectors`: UInt,
    public var `StartLba`: ULong,
    public var `Anonymous`: `AACS_READ_BINDING_NONCE_0`,
)
// UNSUPPORTED Rust 53:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_READ_BINDING_NONCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 58:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AACS_READ_BINDING_NONCE_0 {
//     pub Handle: super::super::Foundation::HANDLE,
//     pub ForceStructureLengthToMatch64bit: u64,
// }

// UNSUPPORTED Rust 64:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_READ_BINDING_NONCE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AACS_SEND_CERTIFICATE` (
    public var `SessionId`: UInt,
    public var `Certificate`: `AACS_CERTIFICATE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AACS_SEND_CHALLENGE_KEY` (
    public var `SessionId`: UInt,
    public var `ChallengeKey`: `AACS_CHALLENGE_KEY`,
)
// UNSUPPORTED Rust 81:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AACS_SERIAL_NUMBER {
//     pub PrerecordedSerialNumber: [u8; 16],
//     pub MAC: [u8; 16],
// }

// UNSUPPORTED Rust 87:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_SERIAL_NUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 92:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AACS_VOLUME_ID {
//     pub VolumeID: [u8; 16],
//     pub MAC: [u8; 16],
// }

// UNSUPPORTED Rust 98:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AACS_VOLUME_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 103:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BD_DISC_WRITE_PROTECT_PAC {
//     pub Header: BD_PAC_HEADER,
//     pub KnownPACEntireDiscFlags: u8,
//     pub Reserved1: [u8; 3],
//     pub WriteProtectControlByte: u8,
//     pub Reserved2: [u8; 7],
//     pub WriteProtectPassword: [u8; 32],
// }

// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BD_DISC_WRITE_PROTECT_PAC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 118:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BD_PAC_HEADER {
//     pub PACId: [u8; 3],
//     pub PACFormatNumber: u8,
//     pub PACUpdateCount: [u8; 4],
//     pub UnknownPACRules: [u8; 4],
//     pub UnkownPACEntireDiscFlag: u8,
//     pub Reserved1: [u8; 2],
//     pub NumberOfSegments: u8,
//     pub Segments: [u8; 256],
//     pub Reserved2: [u8; 112],
// }

// UNSUPPORTED Rust 131:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BD_PAC_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DISC_CONTROL_BLOCK_TYPE` = Int;
// UNSUPPORTED Rust 137:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_ASF {
//     pub Reserved0: [u8; 3],
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 143:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_ASF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 148:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_BCA_DESCRIPTOR {
//     pub BCAInformation: [u8; 1],
// }

// UNSUPPORTED Rust 153:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_BCA_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 158:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_BD_SPARE_AREA_INFORMATION {
//     pub Reserved1: [u8; 4],
//     pub NumberOfFreeSpareBlocks: [u8; 4],
//     pub NumberOfAllocatedSpareBlocks: [u8; 4],
// }

// UNSUPPORTED Rust 165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_BD_SPARE_AREA_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DVD_CGMS_COPY_ONCE`: UInt = 16u;
public const val `DVD_CGMS_COPY_PERMITTED`: UInt = 0u;
public const val `DVD_CGMS_COPY_PROTECT_MASK`: UInt = 24u;
public const val `DVD_CGMS_NO_COPY`: UInt = 24u;
public const val `DVD_CGMS_RESERVED_MASK`: UInt = 120u;
public const val `DVD_COPYRIGHTED`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_DESCRIPTOR` (
    public var `CopyrightProtectionType`: UByte,
    public var `RegionManagementInformation`: UByte,
    public var `Reserved`: UShort,
)
// UNSUPPORTED Rust 183:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR {
//     pub Anonymous: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0,
//     pub Reserved0: [u8; 3],
// }

// UNSUPPORTED Rust 189:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 194:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0 {
//     pub Dvdrom: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_0,
//     pub DvdRecordable_Version1: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_1,
//     pub Dvdram: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_2,
//     pub DvdRecordable: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_3,
//     pub CPR_MAI: u8,
// }

// UNSUPPORTED Rust 203:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_1` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_3` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_2` (
    public var `Reserved0003`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_0` (
    public var `_bitfield`: UByte,
)
public const val `DVD_COPYRIGHT_MASK`: UInt = 64u;
// UNSUPPORTED Rust 229:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DVD_COPY_PROTECT_KEY {
//     pub KeyLength: u32,
//     pub SessionId: u32,
//     pub KeyType: DVD_KEY_TYPE,
//     pub KeyFlags: u32,
//     pub Parameters: DVD_COPY_PROTECT_KEY_0,
//     pub KeyData: [u8; 1],
// }

// UNSUPPORTED Rust 239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_COPY_PROTECT_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 244:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union DVD_COPY_PROTECT_KEY_0 {
//     pub FileHandle: super::super::Foundation::HANDLE,
//     pub TitleOffset: i64,
// }

// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_COPY_PROTECT_KEY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 255:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DVD_DESCRIPTOR_HEADER {
//     pub Length: u16,
//     pub Reserved: [u8; 2],
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DESCRIPTOR_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 267:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_HEADER {
//     pub ContentDescriptor: [u8; 4],
//     pub ProhibitedActions: DVD_DISC_CONTROL_BLOCK_HEADER_0,
//     pub VendorId: [u8; 32],
// }

// UNSUPPORTED Rust 274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 279:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DVD_DISC_CONTROL_BLOCK_HEADER_0 {
//     pub Anonymous: DVD_DISC_CONTROL_BLOCK_HEADER_0_0,
//     pub AsByte: [u8; 4],
// }

// UNSUPPORTED Rust 285:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 290:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_HEADER_0_0 {
//     pub ReservedDoNotUse_UseAsByteInstead_0: [u8; 3],
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_HEADER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 301:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_LIST {
//     pub header: DVD_DISC_CONTROL_BLOCK_HEADER,
//     pub Reserved0: u8,
//     pub ReadabldDCBs: u8,
//     pub Reserved1: u8,
//     pub WritableDCBs: u8,
//     pub Dcbs: [DVD_DISC_CONTROL_BLOCK_LIST_DCB; 1],
// }

// UNSUPPORTED Rust 311:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 316:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_LIST_DCB {
//     pub DcbIdentifier: [u8; 4],
// }

// UNSUPPORTED Rust 321:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_LIST_DCB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 326:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_SESSION {
//     pub header: DVD_DISC_CONTROL_BLOCK_HEADER,
//     pub SessionNumber: [u8; 2],
//     pub Reserved0: [u8; 22],
//     pub DiscID: [u8; 32],
//     pub Reserved1: [u8; 32],
//     pub SessionItem: [DVD_DISC_CONTROL_BLOCK_SESSION_ITEM; 504],
//     pub Reserved2: [u8; 24576],
// }

// UNSUPPORTED Rust 337:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_SESSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 342:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_SESSION_ITEM {
//     pub AsByte: [u8; 16],
// }

// UNSUPPORTED Rust 347:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_SESSION_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 352:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT {
//     pub header: DVD_DISC_CONTROL_BLOCK_HEADER,
//     pub UpdateCount: [u8; 4],
//     pub WriteProtectActions: DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0,
//     pub Reserved0: [u8; 16],
//     pub UpdatePassword: [u8; 32],
//     pub Reserved1: [u8; 32672],
// }

// UNSUPPORTED Rust 362:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 367:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0 {
//     pub Anonymous: DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0,
//     pub AsByte: [u8; 4],
// }

// UNSUPPORTED Rust 373:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 378:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0 {
//     pub ReservedDoNotUse_UseAsByteInstead_0: [u8; 3],
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 384:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 389:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DISK_KEY_DESCRIPTOR {
//     pub DiskKeyData: [u8; 2048],
// }

// UNSUPPORTED Rust 394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DISK_KEY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 399:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE {
//     pub Reserved1: [u8; 4],
//     pub JumpIntervalSize: [u8; 4],
// }

// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 410:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DUAL_LAYER_MANUAL_LAYER_JUMP {
//     pub Reserved1: [u8; 4],
//     pub ManualJumpLayerAddress: [u8; 4],
// }

// UNSUPPORTED Rust 416:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DUAL_LAYER_MANUAL_LAYER_JUMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 421:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS {
//     pub _bitfield: u8,
//     pub Reserved1: [u8; 3],
//     pub ShiftedMiddleAreaStartAddress: [u8; 4],
// }

// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 433:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DUAL_LAYER_RECORDING_INFORMATION {
//     pub _bitfield: u8,
//     pub Reserved1: [u8; 3],
//     pub Layer0Sectors: [u8; 4],
// }

// UNSUPPORTED Rust 440:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DUAL_LAYER_RECORDING_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 445:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_DUAL_LAYER_REMAPPING_INFORMATION {
//     pub Reserved1: [u8; 4],
//     pub RemappingAddress: [u8; 4],
// }

// UNSUPPORTED Rust 451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_DUAL_LAYER_REMAPPING_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 456:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_FULL_LAYER_DESCRIPTOR {
//     pub commonHeader: DVD_LAYER_DESCRIPTOR,
//     pub MediaSpecific: [u8; 2031],
// }

// UNSUPPORTED Rust 462:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_FULL_LAYER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DVD_KEY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_LAYER_DESCRIPTOR` (
    public var `_bitfield1`: UByte,
    public var `_bitfield2`: UByte,
    public var `_bitfield3`: UByte,
    public var `_bitfield4`: UByte,
    public var `StartingDataSector`: UInt,
    public var `EndDataSector`: UInt,
    public var `EndLayerZeroSector`: UInt,
    public var `_bitfield5`: UByte,
)
// UNSUPPORTED Rust 480:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS {
//     pub TypeCodeOfFormatLayer: [u8; 2],
// }

// UNSUPPORTED Rust 485:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS_TYPE_CODE` (
    public var `NumberOfRecognizedFormatLayers`: UByte,
    public var `_bitfield`: UByte,
)
// UNSUPPORTED Rust 496:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_MANUFACTURER_DESCRIPTOR {
//     pub ManufacturingInformation: [u8; 2048],
// }

// UNSUPPORTED Rust 501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_MANUFACTURER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DVD_NOT_COPYRIGHTED`: UInt = 0u;
// UNSUPPORTED Rust 507:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_PRERECORDED_INFORMATION {
//     pub FieldID_1: u8,
//     pub DiscApplicationCode: u8,
//     pub DiscPhysicalCode: u8,
//     pub LastAddressOfDataRecordableArea: [u8; 3],
//     pub _bitfield: u8,
//     pub Reserved0: u8,
//     pub FieldID_2: u8,
//     pub OpcSuggestedCode: u8,
//     pub WavelengthCode: u8,
//     pub WriteStrategyCode: [u8; 4],
//     pub Reserved2: u8,
//     pub FieldID_3: u8,
//     pub ManufacturerId_3: [u8; 6],
//     pub Reserved3: u8,
//     pub FieldID_4: u8,
//     pub ManufacturerId_4: [u8; 6],
//     pub Reserved4: u8,
//     pub FieldID_5: u8,
//     pub ManufacturerId_5: [u8; 6],
//     pub Reserved5: u8,
//     pub Reserved99: [u8; 24],
// }

// UNSUPPORTED Rust 532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_PRERECORDED_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_RAM_MEDIUM_STATUS` (
    public var `_bitfield`: UByte,
    public var `DiscTypeIdentification`: UByte,
    public var `Reserved2`: UByte,
    public var `MediaSpecificWriteInhibitInformation`: UByte,
)
// UNSUPPORTED Rust 545:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_RAM_RECORDING_TYPE {
//     pub _bitfield: u8,
//     pub Reserved2: [u8; 3],
// }

// UNSUPPORTED Rust 551:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_RAM_RECORDING_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 556:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_RAM_SPARE_AREA_INFORMATION {
//     pub FreePrimarySpareSectors: [u8; 4],
//     pub FreeSupplementalSpareSectors: [u8; 4],
//     pub AllocatedSupplementalSpareSectors: [u8; 4],
// }

// UNSUPPORTED Rust 563:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_RAM_SPARE_AREA_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_READ_STRUCTURE` (
    public var `BlockByteOffset`: Long,
    public var `Format`: `DVD_STRUCTURE_FORMAT`,
    public var `SessionId`: UInt,
    public var `LayerNumber`: UByte,
)
// UNSUPPORTED Rust 576:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_RECORDING_MANAGEMENT_AREA_DATA {
//     pub LastRecordedRMASectorNumber: [u8; 4],
//     pub RMDBytes: [u8; 1],
// }

// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_RECORDING_MANAGEMENT_AREA_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_REGION` (
    public var `CopySystem`: UByte,
    public var `RegionData`: UByte,
    public var `SystemRegion`: UByte,
    public var `ResetCount`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_RPC_KEY` (
    public var `_bitfield`: UByte,
    public var `RegionMask`: UByte,
    public var `RpcScheme`: UByte,
    public var `Reserved02`: UByte,
)
public const val `DVD_SECTOR_NOT_PROTECTED`: UInt = 0u;
public const val `DVD_SECTOR_PROTECTED`: UInt = 32u;
public const val `DVD_SECTOR_PROTECT_MASK`: UInt = 32u;
// UNSUPPORTED Rust 606:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_SET_RPC_KEY {
//     pub PreferredDriveRegionCode: u8,
//     pub Reserved: [u8; 3],
// }

// UNSUPPORTED Rust 612:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_SET_RPC_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DVD_STRUCTURE_FORMAT` = Int;
// UNSUPPORTED Rust 618:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_STRUCTURE_LIST_ENTRY {
//     pub FormatCode: u8,
//     pub _bitfield: u8,
//     pub FormatLength: [u8; 2],
// }

// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_STRUCTURE_LIST_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 630:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_UNIQUE_DISC_IDENTIFIER {
//     pub Reserved0: [u8; 2],
//     pub RandomNumber: [u8; 2],
//     pub Year: [u8; 4],
//     pub Month: [u8; 2],
//     pub Day: [u8; 2],
//     pub Hour: [u8; 2],
//     pub Minute: [u8; 2],
//     pub Second: [u8; 2],
// }

// UNSUPPORTED Rust 642:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_UNIQUE_DISC_IDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 647:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DVD_WRITE_PROTECTION_STATUS {
//     pub _bitfield: u8,
//     pub Reserved1: [u8; 3],
// }

// UNSUPPORTED Rust 653:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DVD_WRITE_PROTECTION_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DiscControlBlockList`: `DISC_CONTROL_BLOCK_TYPE` = -1;
public const val `DvdAsf`: `DVD_KEY_TYPE` = 5;
public const val `DvdBCADescriptor`: `DVD_STRUCTURE_FORMAT` = 3;
public const val `DvdBusKey1`: `DVD_KEY_TYPE` = 2;
public const val `DvdBusKey2`: `DVD_KEY_TYPE` = 3;
public const val `DvdChallengeKey`: `DVD_KEY_TYPE` = 1;
public const val `DvdCopyrightDescriptor`: `DVD_STRUCTURE_FORMAT` = 1;
public const val `DvdDiskKey`: `DVD_KEY_TYPE` = 128;
public const val `DvdDiskKeyDescriptor`: `DVD_STRUCTURE_FORMAT` = 2;
public const val `DvdGetRpcKey`: `DVD_KEY_TYPE` = 8;
public const val `DvdInvalidateAGID`: `DVD_KEY_TYPE` = 63;
public const val `DvdManufacturerDescriptor`: `DVD_STRUCTURE_FORMAT` = 4;
public const val `DvdMaxDescriptor`: `DVD_STRUCTURE_FORMAT` = 5;
public const val `DvdPhysicalDescriptor`: `DVD_STRUCTURE_FORMAT` = 0;
public const val `DvdSetRpcKey`: `DVD_KEY_TYPE` = 6;
public const val `DvdTitleKey`: `DVD_KEY_TYPE` = 4;
public const val `FormattingDiscControlBlock`: `DISC_CONTROL_BLOCK_TYPE` = 1178878720;
// UNSUPPORTED Rust 675:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HD_DVD_R_MEDIUM_STATUS {
//     pub _bitfield: u8,
//     pub NumberOfRemainingRMDsInRDZ: u8,
//     pub NumberOfRemainingRMDsInCurrentRMZ: [u8; 2],
// }

// UNSUPPORTED Rust 682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HD_DVD_R_MEDIUM_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IOCTL_AACS_END_SESSION`: UInt = 3363020u;
public const val `IOCTL_AACS_GENERATE_BINDING_NONCE`: UInt = 3395824u;
public const val `IOCTL_AACS_GET_CERTIFICATE`: UInt = 3363028u;
public const val `IOCTL_AACS_GET_CHALLENGE_KEY`: UInt = 3363032u;
public const val `IOCTL_AACS_READ_BINDING_NONCE`: UInt = 3363052u;
public const val `IOCTL_AACS_READ_MEDIA_ID`: UInt = 3363048u;
public const val `IOCTL_AACS_READ_MEDIA_KEY_BLOCK`: UInt = 3363012u;
public const val `IOCTL_AACS_READ_MEDIA_KEY_BLOCK_SIZE`: UInt = 3363008u;
public const val `IOCTL_AACS_READ_SERIAL_NUMBER`: UInt = 3363044u;
public const val `IOCTL_AACS_READ_VOLUME_ID`: UInt = 3363040u;
public const val `IOCTL_AACS_SEND_CERTIFICATE`: UInt = 3363024u;
public const val `IOCTL_AACS_SEND_CHALLENGE_KEY`: UInt = 3363036u;
public const val `IOCTL_AACS_START_SESSION`: UInt = 3363016u;
public const val `IOCTL_DVD_BASE`: Int = 51;
public const val `IOCTL_DVD_END_SESSION`: UInt = 3362828u;
public const val `IOCTL_DVD_GET_REGION`: UInt = 3362836u;
public const val `IOCTL_DVD_READ_KEY`: UInt = 3362820u;
public const val `IOCTL_DVD_READ_STRUCTURE`: UInt = 3363136u;
public const val `IOCTL_DVD_SEND_KEY`: UInt = 3362824u;
public const val `IOCTL_DVD_SEND_KEY2`: UInt = 3395608u;
public const val `IOCTL_DVD_SET_READ_AHEAD`: UInt = 3362832u;
public const val `IOCTL_DVD_START_SESSION`: UInt = 3362816u;
public const val `IOCTL_STORAGE_SET_READ_AHEAD`: UInt = 2966528u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_SET_READ_AHEAD` (
    public var `TriggerAddress`: Long,
    public var `TargetAddress`: Long,
)
public const val `SessionInfoDiscControlBlock`: `DISC_CONTROL_BLOCK_TYPE` = 1396982528;
public const val `WriteInhibitDiscControlBlock`: `DISC_CONTROL_BLOCK_TYPE` = 1464091392;
