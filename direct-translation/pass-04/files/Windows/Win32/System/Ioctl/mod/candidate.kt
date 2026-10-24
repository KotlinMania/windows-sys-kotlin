// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `ABL_5_WO`: `STORAGE_MEDIA_TYPE` = 64;
public const val `ADR_1`: `STORAGE_MEDIA_TYPE` = 90;
public const val `ADR_2`: `STORAGE_MEDIA_TYPE` = 91;
public const val `AIT1_8mm`: `STORAGE_MEDIA_TYPE` = 38;
public const val `AIT_8mm`: `STORAGE_MEDIA_TYPE` = 89;
public const val `AME_8mm`: `STORAGE_MEDIA_TYPE` = 37;
public const val `ASSERT_ALTERNATE`: UInt = 9u;
public const val `ASSERT_PRIMARY`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ASYNC_DUPLICATE_EXTENTS_STATUS` (
    public var `Version`: UInt,
    public var `State`: `DUPLICATE_EXTENTS_STATE`,
    public var `SourceFileOffset`: ULong,
    public var `TargetFileOffset`: ULong,
    public var `ByteCount`: ULong,
    public var `BytesDuplicated`: ULong,
)
public const val `ATAPI_ID_CMD`: UInt = 161u;
public const val `AVATAR_F2`: `STORAGE_MEDIA_TYPE` = 78;
public const val `AllElements`: `ELEMENT_TYPE` = 0;
public const val `AtaDataTypeIdentify`: `STORAGE_PROTOCOL_ATA_DATA_TYPE` = 1;
public const val `AtaDataTypeLogPage`: `STORAGE_PROTOCOL_ATA_DATA_TYPE` = 2;
public const val `AtaDataTypeUnknown`: `STORAGE_PROTOCOL_ATA_DATA_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BIN_COUNT` (
    public var `BinRange`: `BIN_RANGE`,
    public var `BinCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BIN_RANGE` (
    public var `StartValue`: Long,
    public var `Length`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BIN_RESULTS` (
    public var `NumberOfBins`: UInt,
    public var `BinCounts`: Array<`BIN_COUNT`>,
)
// UNSUPPORTED Rust 43:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BIN_RESULTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BIN_TYPES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BOOT_AREA_INFO` (
    public var `BootSectorCount`: UInt,
    public var `BootSectors`: Array<`BOOT_AREA_INFO_0`>,
)
// UNSUPPORTED Rust 55:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BOOT_AREA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BOOT_AREA_INFO_0` (
    public var `Offset`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BULK_SECURITY_TEST_DATA` (
    public var `DesiredAccess`: UInt,
    public var `SecurityIds`: UIntArray,
)
// UNSUPPORTED Rust 71:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BULK_SECURITY_TEST_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CAP_ATAPI_ID_CMD`: UInt = 2u;
public const val `CAP_ATA_ID_CMD`: UInt = 1u;
public const val `CAP_SMART_CMD`: UInt = 4u;
public const val `CDB_SIZE`: UInt = 16u;
public const val `CD_R`: `STORAGE_MEDIA_TYPE` = 52;
public const val `CD_ROM`: `STORAGE_MEDIA_TYPE` = 51;
public const val `CD_RW`: `STORAGE_MEDIA_TYPE` = 53;
public const val `CHANGER_BAR_CODE_SCANNER_INSTALLED`: `CHANGER_FEATURES` = 1u;
public const val `CHANGER_CARTRIDGE_MAGAZINE`: `CHANGER_FEATURES` = 256u;
public const val `CHANGER_CLEANER_ACCESS_NOT_VALID`: `CHANGER_FEATURES` = 262144u;
public const val `CHANGER_CLEANER_AUTODISMOUNT`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483652u;
public const val `CHANGER_CLEANER_OPS_NOT_SUPPORTED`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483712u;
public const val `CHANGER_CLEANER_SLOT`: `CHANGER_FEATURES` = 64u;
public const val `CHANGER_CLOSE_IEPORT`: `CHANGER_FEATURES` = 4u;
public typealias `CHANGER_DEVICE_PROBLEM_TYPE` = Int;
public const val `CHANGER_DEVICE_REINITIALIZE_CAPABLE`: `CHANGER_FEATURES` = 134217728u;
public const val `CHANGER_DRIVE_CLEANING_REQUIRED`: `CHANGER_FEATURES` = 65536u;
public const val `CHANGER_DRIVE_EMPTY_ON_DOOR_ACCESS`: `CHANGER_FEATURES` = 536870912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_ELEMENT` (
    public var `ElementType`: `ELEMENT_TYPE`,
    public var `ElementAddress`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_ELEMENT_LIST` (
    public var `Element`: `CHANGER_ELEMENT`,
    public var `NumberOfElements`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHANGER_ELEMENT_STATUS` (
    public var `Element`: `CHANGER_ELEMENT`,
    public var `SrcElementAddress`: `CHANGER_ELEMENT`,
    public var `Flags`: `CHANGER_ELEMENT_STATUS_FLAGS`,
    public var `ExceptionCode`: UInt,
    public var `TargetId`: UByte,
    public var `Lun`: UByte,
    public var `Reserved`: UShort,
    public var `PrimaryVolumeID`: UByteArray,
    public var `AlternateVolumeID`: UByteArray,
)
// UNSUPPORTED Rust 119:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CHANGER_ELEMENT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHANGER_ELEMENT_STATUS_EX` (
    public var `Element`: `CHANGER_ELEMENT`,
    public var `SrcElementAddress`: `CHANGER_ELEMENT`,
    public var `Flags`: `CHANGER_ELEMENT_STATUS_FLAGS`,
    public var `ExceptionCode`: UInt,
    public var `TargetId`: UByte,
    public var `Lun`: UByte,
    public var `Reserved`: UShort,
    public var `PrimaryVolumeID`: UByteArray,
    public var `AlternateVolumeID`: UByteArray,
    public var `VendorIdentification`: UByteArray,
    public var `ProductIdentification`: UByteArray,
    public var `SerialNumber`: UByteArray,
)
// UNSUPPORTED Rust 140:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CHANGER_ELEMENT_STATUS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CHANGER_ELEMENT_STATUS_FLAGS` = UInt;
public const val `CHANGER_EXCHANGE_MEDIA`: `CHANGER_FEATURES` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_EXCHANGE_MEDIUM` (
    public var `Transport`: `CHANGER_ELEMENT`,
    public var `Source`: `CHANGER_ELEMENT`,
    public var `Destination1`: `CHANGER_ELEMENT`,
    public var `Destination2`: `CHANGER_ELEMENT`,
    public var `Flip1`: Boolean,
    public var `Flip2`: Boolean,
)
public typealias `CHANGER_FEATURES` = UInt;
public const val `CHANGER_IEPORT_USER_CONTROL_CLOSE`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483904u;
public const val `CHANGER_IEPORT_USER_CONTROL_OPEN`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483776u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_INITIALIZE_ELEMENT_STATUS` (
    public var `ElementList`: `CHANGER_ELEMENT_LIST`,
    public var `BarCodeScan`: Boolean,
)
public const val `CHANGER_INIT_ELEM_STAT_WITH_RANGE`: `CHANGER_FEATURES` = 2u;
public const val `CHANGER_KEYPAD_ENABLE_DISABLE`: `CHANGER_FEATURES` = 268435456u;
public const val `CHANGER_LOCK_UNLOCK`: `CHANGER_FEATURES` = 128u;
public const val `CHANGER_MEDIUM_FLIP`: `CHANGER_FEATURES` = 512u;
public const val `CHANGER_MOVE_EXTENDS_IEPORT`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147484160u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_MOVE_MEDIUM` (
    public var `Transport`: `CHANGER_ELEMENT`,
    public var `Source`: `CHANGER_ELEMENT`,
    public var `Destination`: `CHANGER_ELEMENT`,
    public var `Flip`: Boolean,
)
public const val `CHANGER_MOVE_RETRACTS_IEPORT`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147484672u;
public const val `CHANGER_OPEN_IEPORT`: `CHANGER_FEATURES` = 8u;
public const val `CHANGER_POSITION_TO_ELEMENT`: `CHANGER_FEATURES` = 1024u;
public const val `CHANGER_PREDISMOUNT_ALIGN_TO_DRIVE`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483650u;
public const val `CHANGER_PREDISMOUNT_ALIGN_TO_SLOT`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483649u;
public const val `CHANGER_PREDISMOUNT_EJECT_REQUIRED`: `CHANGER_FEATURES` = 131072u;
public const val `CHANGER_PREMOUNT_EJECT_REQUIRED`: `CHANGER_FEATURES` = 524288u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHANGER_PRODUCT_DATA` (
    public var `VendorId`: UByteArray,
    public var `ProductId`: UByteArray,
    public var `Revision`: UByteArray,
    public var `SerialNumber`: UByteArray,
    public var `DeviceType`: UByte,
)
// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CHANGER_PRODUCT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_READ_ELEMENT_STATUS` (
    public var `ElementList`: `CHANGER_ELEMENT_LIST`,
    public var `VolumeTagInfo`: Boolean,
)
public const val `CHANGER_REPORT_IEPORT_STATE`: `CHANGER_FEATURES` = 2048u;
public const val `CHANGER_RESERVED_BIT`: UInt = 2147483648u;
public const val `CHANGER_RTN_MEDIA_TO_ORIGINAL_ADDR`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483680u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHANGER_SEND_VOLUME_TAG_INFORMATION` (
    public var `StartingElement`: `CHANGER_ELEMENT`,
    public var `ActionCode`: UInt,
    public var `VolumeIDTemplate`: UByteArray,
)
// UNSUPPORTED Rust 216:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CHANGER_SEND_VOLUME_TAG_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CHANGER_SERIAL_NUMBER_VALID`: `CHANGER_FEATURES` = 67108864u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_SET_ACCESS` (
    public var `Element`: `CHANGER_ELEMENT`,
    public var `Control`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CHANGER_SET_POSITION` (
    public var `Transport`: `CHANGER_ELEMENT`,
    public var `Destination`: `CHANGER_ELEMENT`,
    public var `Flip`: Boolean,
)
public const val `CHANGER_SLOTS_USE_TRAYS`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483664u;
public const val `CHANGER_STATUS_NON_VOLATILE`: `CHANGER_FEATURES` = 16u;
public const val `CHANGER_STORAGE_DRIVE`: `CHANGER_FEATURES` = 4096u;
public const val `CHANGER_STORAGE_IEPORT`: `CHANGER_FEATURES` = 8192u;
public const val `CHANGER_STORAGE_SLOT`: `CHANGER_FEATURES` = 16384u;
public const val `CHANGER_STORAGE_TRANSPORT`: `CHANGER_FEATURES` = 32768u;
public const val `CHANGER_TO_DRIVE`: UInt = 8u;
public const val `CHANGER_TO_IEPORT`: UInt = 4u;
public const val `CHANGER_TO_SLOT`: UInt = 2u;
public const val `CHANGER_TO_TRANSPORT`: UInt = 1u;
public const val `CHANGER_TRUE_EXCHANGE_CAPABLE`: `GET_CHANGER_PARAMETERS_FEATURES1` = 2147483656u;
public const val `CHANGER_VOLUME_ASSERT`: `CHANGER_FEATURES` = 4194304u;
public const val `CHANGER_VOLUME_IDENTIFICATION`: `CHANGER_FEATURES` = 1048576u;
public const val `CHANGER_VOLUME_REPLACE`: `CHANGER_FEATURES` = 8388608u;
public const val `CHANGER_VOLUME_SEARCH`: `CHANGER_FEATURES` = 2097152u;
public const val `CHANGER_VOLUME_UNDEFINE`: `CHANGER_FEATURES` = 16777216u;
public const val `CHECKSUM_TYPE_CRC32`: UInt = 1u;
public const val `CHECKSUM_TYPE_CRC64`: UInt = 2u;
public const val `CHECKSUM_TYPE_ECC`: UInt = 3u;
public const val `CHECKSUM_TYPE_FIRST_UNUSED_TYPE`: UInt = 5u;
public const val `CHECKSUM_TYPE_NONE`: UInt = 0u;
public const val `CHECKSUM_TYPE_SHA256`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLASS_MEDIA_CHANGE_CONTEXT` (
    public var `MediaChangeCount`: UInt,
    public var `NewState`: UInt,
)
public const val `CLEANER_CARTRIDGE`: `STORAGE_MEDIA_TYPE` = 50;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLUSTER_RANGE` (
    public var `StartingCluster`: Long,
    public var `ClusterCount`: Long,
)
public const val `CONTAINER_ROOT_INFO_FLAG_BIND_DO_NOT_MAP_NAME`: UInt = 256u;
public const val `CONTAINER_ROOT_INFO_FLAG_BIND_EXCEPTION_ROOT`: UInt = 128u;
public const val `CONTAINER_ROOT_INFO_FLAG_BIND_ROOT`: UInt = 32u;
public const val `CONTAINER_ROOT_INFO_FLAG_BIND_TARGET_ROOT`: UInt = 64u;
public const val `CONTAINER_ROOT_INFO_FLAG_LAYER_ROOT`: UInt = 2u;
public const val `CONTAINER_ROOT_INFO_FLAG_SCRATCH_ROOT`: UInt = 1u;
public const val `CONTAINER_ROOT_INFO_FLAG_UNION_LAYER_ROOT`: UInt = 512u;
public const val `CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_EXCEPTION_ROOT`: UInt = 16u;
public const val `CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_ROOT`: UInt = 4u;
public const val `CONTAINER_ROOT_INFO_FLAG_VIRTUALIZATION_TARGET_ROOT`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CONTAINER_ROOT_INFO_INPUT` (
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTAINER_ROOT_INFO_OUTPUT` (
    public var `ContainerRootIdLength`: UShort,
    public var `ContainerRootId`: UByteArray,
)
// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONTAINER_ROOT_INFO_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONTAINER_ROOT_INFO_VALID_FLAGS`: UInt = 1023u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CONTAINER_VOLUME_STATE` (
    public var `Flags`: UInt,
)
public const val `CONTAINER_VOLUME_STATE_HOSTING_CONTAINER`: UInt = 1u;
public const val `COPYFILE_SIS_FLAGS`: UInt = 3u;
public const val `COPYFILE_SIS_LINK`: UInt = 1u;
public const val `COPYFILE_SIS_REPLACE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_DISK` (
    public var `PartitionStyle`: `PARTITION_STYLE`,
    public var `Anonymous`: `CREATE_DISK_0`,
)
// UNSUPPORTED Rust 312:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREATE_DISK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 317:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CREATE_DISK_0 {
//     pub Mbr: CREATE_DISK_MBR,
//     pub Gpt: CREATE_DISK_GPT,
// }

// UNSUPPORTED Rust 323:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREATE_DISK_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CREATE_DISK_GPT` (
    public var `DiskId`: `windows_sys`.`core`.`GUID`,
    public var `MaxPartitionCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CREATE_DISK_MBR` (
    public var `Signature`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CREATE_USN_JOURNAL_DATA` (
    public var `MaximumSize`: ULong,
    public var `AllocationDelta`: ULong,
)
public typealias `CSVFS_DISK_CONNECTIVITY` = Int;
public typealias `CSV_CONTROL_OP` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_CONTROL_PARAM` (
    public var `Operation`: `CSV_CONTROL_OP`,
    public var `Unused`: Long,
)
public const val `CSV_INVALID_DEVICE_NUMBER`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_IS_OWNED_BY_CSVFS` (
    public var `OwnedByCSVFS`: Boolean,
)
public const val `CSV_MGMTLOCK_CHECK_VOLUME_REDIRECTED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_MGMT_LOCK` (
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_NAMESPACE_INFO` (
    public var `Version`: UInt,
    public var `DeviceNumber`: UInt,
    public var `StartingOffset`: Long,
    public var `SectorSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CSV_QUERY_FILE_REVISION` (
    public var `FileId`: Long,
    public var `FileRevision`: LongArray,
)
// UNSUPPORTED Rust 379:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CSV_QUERY_FILE_REVISION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CSV_QUERY_FILE_REVISION_FILE_ID_128` (
    public var `FileId`: `super`.`super`.`Storage`.`FileSystem`.`FILE_ID_128`,
    public var `FileRevision`: LongArray,
)
// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CSV_QUERY_FILE_REVISION_FILE_ID_128 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CSV_QUERY_MDS_PATH` (
    public var `MdsNodeId`: UInt,
    public var `DsNodeId`: UInt,
    public var `PathLength`: UInt,
    public var `Path`: UShortArray,
)
// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CSV_QUERY_MDS_PATH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CSV_QUERY_MDS_PATH_FLAG_CSV_DIRECT_IO_ENABLED`: UInt = 2u;
public const val `CSV_QUERY_MDS_PATH_FLAG_SMB_BYPASS_CSV_ENABLED`: UInt = 4u;
public const val `CSV_QUERY_MDS_PATH_FLAG_STORAGE_ON_THIS_NODE_IS_CONNECTED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_QUERY_MDS_PATH_V2` (
    public var `Version`: Long,
    public var `RequiredSize`: UInt,
    public var `MdsNodeId`: UInt,
    public var `DsNodeId`: UInt,
    public var `Flags`: UInt,
    public var `DiskConnectivity`: `CSVFS_DISK_CONNECTIVITY`,
    public var `VolumeId`: `windows_sys`.`core`.`GUID`,
    public var `IpAddressOffset`: UInt,
    public var `IpAddressLength`: UInt,
    public var `PathOffset`: UInt,
    public var `PathLength`: UInt,
)
public const val `CSV_QUERY_MDS_PATH_V2_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_QUERY_REDIRECT_STATE` (
    public var `MdsNodeId`: UInt,
    public var `DsNodeId`: UInt,
    public var `FileRedirected`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT` (
    public var `VetoedFromAltitudeIntegral`: ULong,
    public var `VetoedFromAltitudeDecimal`: ULong,
    public var `Reason`: UShortArray,
)
// UNSUPPORTED Rust 443:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_QUERY_VOLUME_ID` (
    public var `VolumeId`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_QUERY_VOLUME_REDIRECT_STATE` (
    public var `MdsNodeId`: UInt,
    public var `DsNodeId`: UInt,
    public var `IsDiskConnected`: Boolean,
    public var `ClusterEnableDirectIo`: Boolean,
    public var `DiskConnectivity`: `CSVFS_DISK_CONNECTIVITY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CSV_SET_VOLUME_ID` (
    public var `VolumeId`: `windows_sys`.`core`.`GUID`,
)
public const val `CYGNET_12_WO`: `STORAGE_MEDIA_TYPE` = 69;
public const val `ChangerDoor`: `ELEMENT_TYPE` = 5;
public const val `ChangerDrive`: `ELEMENT_TYPE` = 4;
public const val `ChangerIEPort`: `ELEMENT_TYPE` = 3;
public const val `ChangerKeypad`: `ELEMENT_TYPE` = 6;
public const val `ChangerMaxElement`: `ELEMENT_TYPE` = 7;
public const val `ChangerSlot`: `ELEMENT_TYPE` = 2;
public const val `ChangerTransport`: `ELEMENT_TYPE` = 1;
public const val `CsvControlDisableCaching`: `CSV_CONTROL_OP` = 19;
public const val `CsvControlEnableCaching`: `CSV_CONTROL_OP` = 20;
public const val `CsvControlEnableUSNRangeModificationTracking`: `CSV_CONTROL_OP` = 13;
public const val `CsvControlGetCsvFsMdsPathV2`: `CSV_CONTROL_OP` = 18;
public const val `CsvControlMarkHandleLocalVolumeMount`: `CSV_CONTROL_OP` = 14;
public const val `CsvControlQueryFileRevision`: `CSV_CONTROL_OP` = 6;
public const val `CsvControlQueryFileRevisionFileId128`: `CSV_CONTROL_OP` = 9;
public const val `CsvControlQueryMdsPath`: `CSV_CONTROL_OP` = 8;
public const val `CsvControlQueryMdsPathNoPause`: `CSV_CONTROL_OP` = 23;
public const val `CsvControlQueryRedirectState`: `CSV_CONTROL_OP` = 4;
public const val `CsvControlQueryVolumeId`: `CSV_CONTROL_OP` = 25;
public const val `CsvControlQueryVolumeRedirectState`: `CSV_CONTROL_OP` = 10;
public const val `CsvControlSetVolumeId`: `CSV_CONTROL_OP` = 24;
public const val `CsvControlStartForceDFO`: `CSV_CONTROL_OP` = 21;
public const val `CsvControlStartRedirectFile`: `CSV_CONTROL_OP` = 2;
public const val `CsvControlStopForceDFO`: `CSV_CONTROL_OP` = 22;
public const val `CsvControlStopRedirectFile`: `CSV_CONTROL_OP` = 3;
public const val `CsvControlUnmarkHandleLocalVolumeMount`: `CSV_CONTROL_OP` = 15;
public const val `CsvFsDiskConnectivityAllNodes`: `CSVFS_DISK_CONNECTIVITY` = 3;
public const val `CsvFsDiskConnectivityMdsNodeOnly`: `CSVFS_DISK_CONNECTIVITY` = 1;
public const val `CsvFsDiskConnectivityNone`: `CSVFS_DISK_CONNECTIVITY` = 0;
public const val `CsvFsDiskConnectivitySubsetOfNodes`: `CSVFS_DISK_CONNECTIVITY` = 2;
public const val `DAX_ALLOC_ALIGNMENT_FLAG_FALLBACK_SPECIFIED`: UInt = 2u;
public const val `DAX_ALLOC_ALIGNMENT_FLAG_MANDATORY`: UInt = 1u;
public const val `DDS_4mm`: `STORAGE_MEDIA_TYPE` = 32;
public const val `DDUMP_FLAG_DATA_READ_FROM_DEVICE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DECRYPTION_STATUS_BUFFER` (
    public var `NoEncryptedStreams`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DELETE_USN_JOURNAL_DATA` (
    public var `UsnJournalID`: ULong,
    public var `DeleteFlags`: `USN_DELETE_FLAGS`,
)
public typealias `DETECTION_TYPE` = Int;
public const val `DEVICEDUMP_CAP_PRIVATE_SECTION`: UInt = 1u;
public const val `DEVICEDUMP_CAP_RESTRICTED_SECTION`: UInt = 2u;
public typealias `DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE` = Int;
public const val `DEVICEDUMP_MAX_IDSTRING`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICEDUMP_PRIVATE_SUBSECTION` (
    public var `dwFlags`: UInt,
    public var `GPLogId`: `GP_LOG_PAGE_DESCRIPTOR`,
    public var `bData`: UByteArray,
)
// UNSUPPORTED Rust 524:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEDUMP_PRIVATE_SUBSECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICEDUMP_PUBLIC_SUBSECTION` (
    public var `dwFlags`: UInt,
    public var `GPLogTable`: Array<`GP_LOG_PAGE_DESCRIPTOR`>,
    public var `szDescription`: ByteArray,
    public var `bData`: UByteArray,
)
// UNSUPPORTED Rust 537:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEDUMP_PUBLIC_SUBSECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICEDUMP_RESTRICTED_SUBSECTION` (
    public var `bData`: UByteArray,
)
// UNSUPPORTED Rust 547:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEDUMP_RESTRICTED_SUBSECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 132 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICEDUMP_SECTION_HEADER` (
    public var `guidDeviceDataId`: `windows_sys`.`core`.`GUID`,
    public var `sOrganizationID`: UByteArray,
    public var `dwFirmwareRevision`: UInt,
    public var `sModelNumber`: UByteArray,
    public var `szDeviceManufacturingID`: UByteArray,
    public var `dwFlags`: UInt,
    public var `bRestrictedPrivateDataVersion`: UInt,
    public var `dwFirmwareIssueId`: UInt,
    public var `szIssueDescriptionString`: UByteArray,
)
// UNSUPPORTED Rust 565:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEDUMP_SECTION_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICEDUMP_STORAGEDEVICE_DATA` (
    public var `Descriptor`: `DEVICEDUMP_STRUCTURE_VERSION`,
    public var `SectionHeader`: `DEVICEDUMP_SECTION_HEADER`,
    public var `dwBufferSize`: UInt,
    public var `dwReasonForCollection`: UInt,
    public var `PublicData`: `DEVICEDUMP_SUBSECTION_POINTER`,
    public var `RestrictedData`: `DEVICEDUMP_SUBSECTION_POINTER`,
    public var `PrivateData`: `DEVICEDUMP_SUBSECTION_POINTER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP` (
    public var `Descriptor`: `DEVICEDUMP_STRUCTURE_VERSION`,
    public var `dwReasonForCollection`: UInt,
    public var `cDriverName`: UByteArray,
    public var `uiNumRecords`: UInt,
    public var `RecordArray`: Array<`DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD`>,
)
// UNSUPPORTED Rust 590:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEDUMP_STORAGESTACK_PUBLIC_DUMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD` (
    public var `Cdb`: UByteArray,
    public var `Command`: UByteArray,
    public var `StartTime`: ULong,
    public var `EndTime`: ULong,
    public var `OperationStatus`: UInt,
    public var `OperationError`: UInt,
    public var `StackSpecific`: `DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0`,
)
// UNSUPPORTED Rust 606:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 611:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0 {
//     pub ExternalStack: DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_0,
//     pub AtaPort: DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_1,
//     pub StorPort: DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_2,
// }

// UNSUPPORTED Rust 618:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_1` (
    public var `dwAtaPortSpecific`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_0` (
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD_0_2` (
    public var `SrbTag`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICEDUMP_STRUCTURE_VERSION` (
    public var `dwSignature`: UInt,
    public var `dwVersion`: UInt,
    public var `dwSize`: UInt,
)
public const val `DEVICEDUMP_STRUCTURE_VERSION_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICEDUMP_SUBSECTION_POINTER` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_COPY_OFFLOAD_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `MaximumTokenLifetime`: UInt,
    public var `DefaultTokenLifetime`: UInt,
    public var `MaximumTransferSize`: ULong,
    public var `OptimalTransferCount`: ULong,
    public var `MaximumDataDescriptors`: UInt,
    public var `MaximumTransferLengthPerDescriptor`: UInt,
    public var `OptimalTransferLengthPerDescriptor`: UInt,
    public var `OptimalTransferLengthGranularity`: UShort,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_COPY_OFFLOAD_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DATA_SET_LBP_STATE_PARAMETERS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `OutputVersion`: UInt,
)
public const val `DEVICE_DATA_SET_LBP_STATE_PARAMETERS_VERSION_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DATA_SET_LB_PROVISIONING_STATE` (
    public var `Size`: UInt,
    public var `Version`: UInt,
    public var `SlabSizeInBytes`: ULong,
    public var `SlabOffsetDeltaInBytes`: UInt,
    public var `SlabAllocationBitMapBitCount`: UInt,
    public var `SlabAllocationBitMapLength`: UInt,
    public var `SlabAllocationBitMap`: UIntArray,
)
// UNSUPPORTED Rust 693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DATA_SET_LB_PROVISIONING_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DATA_SET_LB_PROVISIONING_STATE_V2` (
    public var `Size`: UInt,
    public var `Version`: UInt,
    public var `SlabSizeInBytes`: ULong,
    public var `SlabOffsetDeltaInBytes`: ULong,
    public var `SlabAllocationBitMapBitCount`: UInt,
    public var `SlabAllocationBitMapLength`: UInt,
    public var `SlabAllocationBitMap`: UIntArray,
)
// UNSUPPORTED Rust 709:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DATA_SET_LB_PROVISIONING_STATE_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DATA_SET_RANGE` (
    public var `StartingOffset`: Long,
    public var `LengthInBytes`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DATA_SET_REPAIR_OUTPUT` (
    public var `ParityExtent`: `DEVICE_DATA_SET_RANGE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DATA_SET_REPAIR_PARAMETERS` (
    public var `NumberOfRepairCopies`: UInt,
    public var `SourceCopy`: UInt,
    public var `RepairCopies`: UIntArray,
)
// UNSUPPORTED Rust 732:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DATA_SET_REPAIR_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DATA_SET_SCRUB_EX_OUTPUT` (
    public var `BytesProcessed`: ULong,
    public var `BytesRepaired`: ULong,
    public var `BytesFailed`: ULong,
    public var `ParityExtent`: `DEVICE_DATA_SET_RANGE`,
    public var `BytesScrubbed`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DATA_SET_SCRUB_OUTPUT` (
    public var `BytesProcessed`: ULong,
    public var `BytesRepaired`: ULong,
    public var `BytesFailed`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DATA_SET_TOPOLOGY_ID_QUERY_OUTPUT` (
    public var `TopologyRangeBytes`: ULong,
    public var `TopologyId`: UByteArray,
)
// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DATA_SET_TOPOLOGY_ID_QUERY_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DSM_CONVERSION_OUTPUT` (
    public var `Version`: UInt,
    public var `Source`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DSM_DEFINITION` (
    public var `Action`: UInt,
    public var `SingleRange`: Boolean,
    public var `ParameterBlockAlignment`: UInt,
    public var `ParameterBlockLength`: UInt,
    public var `HasOutput`: Boolean,
    public var `OutputBlockAlignment`: UInt,
    public var `OutputBlockLength`: UInt,
)
public const val `DEVICE_DSM_FLAG_ALLOCATION_CONSOLIDATEABLE_ONLY`: UInt = 1073741824u;
public const val `DEVICE_DSM_FLAG_ENTIRE_DATA_SET_RANGE`: UInt = 1u;
public const val `DEVICE_DSM_FLAG_PHYSICAL_ADDRESSES_OMIT_TOTAL_RANGES`: UInt = 268435456u;
public const val `DEVICE_DSM_FLAG_REPAIR_INPUT_TOPOLOGY_ID_PRESENT`: UInt = 1073741824u;
public const val `DEVICE_DSM_FLAG_REPAIR_OUTPUT_PARITY_EXTENT`: UInt = 536870912u;
public const val `DEVICE_DSM_FLAG_SCRUB_OUTPUT_PARITY_EXTENT`: UInt = 536870912u;
public const val `DEVICE_DSM_FLAG_SCRUB_SKIP_IN_SYNC`: UInt = 268435456u;
public const val `DEVICE_DSM_FLAG_TRIM_BYPASS_RZAT`: UInt = 1073741824u;
public const val `DEVICE_DSM_FLAG_TRIM_NOT_FS_ALLOCATED`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DSM_FREE_SPACE_OUTPUT` (
    public var `Version`: UInt,
    public var `FreeSpace`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_LOST_QUERY_OUTPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Alignment`: ULong,
    public var `NumberOfBits`: UInt,
    public var `BitMap`: UIntArray,
)
// UNSUPPORTED Rust 805:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_LOST_QUERY_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_DSM_LOST_QUERY_PARAMETERS` (
    public var `Version`: UInt,
    public var `Granularity`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_NOTIFICATION_PARAMETERS` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `NumFileTypeIDs`: UInt,
    public var `FileTypeID`: Array<`windows_sys`.`core`.`GUID`>,
)
// UNSUPPORTED Rust 824:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_NOTIFICATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEVICE_DSM_NOTIFY_FLAG_BEGIN`: UInt = 1u;
public const val `DEVICE_DSM_NOTIFY_FLAG_END`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS` (
    public var `Size`: UInt,
    public var `TargetPriority`: UByte,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 838:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_NVCACHE_CHANGE_PRIORITY_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_OFFLOAD_READ_PARAMETERS` (
    public var `Flags`: UInt,
    public var `TimeToLive`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 850:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_OFFLOAD_READ_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_OFFLOAD_WRITE_PARAMETERS` (
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
    public var `TokenOffset`: ULong,
    public var `Token`: `STORAGE_OFFLOAD_TOKEN`,
)
// UNSUPPORTED Rust 863:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_OFFLOAD_WRITE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEVICE_DSM_PARAMETERS_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `TotalNumberOfRanges`: UInt,
    public var `NumberOfRangesReturned`: UInt,
    public var `Ranges`: Array<`DEVICE_STORAGE_ADDRESS_RANGE`>,
)
// UNSUPPORTED Rust 878:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT_V1`: UInt = 1u;
public const val `DEVICE_DSM_PHYSICAL_ADDRESSES_OUTPUT_VERSION_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_RANGE_ERROR_INFO` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `TotalNumberOfRanges`: UInt,
    public var `NumberOfRangesReturned`: UInt,
    public var `Ranges`: Array<`DEVICE_STORAGE_RANGE_ATTRIBUTES`>,
)
// UNSUPPORTED Rust 894:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_RANGE_ERROR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEVICE_DSM_RANGE_ERROR_INFO_VERSION_V1`: UInt = 1u;
public const val `DEVICE_DSM_RANGE_ERROR_OUTPUT_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_REPORT_ZONES_DATA` (
    public var `Size`: UInt,
    public var `ZoneCount`: UInt,
    public var `Attributes`: `STORAGE_ZONES_ATTRIBUTES`,
    public var `Reserved0`: UInt,
    public var `ZoneDescriptors`: Array<`STORAGE_ZONE_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 910:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_REPORT_ZONES_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_REPORT_ZONES_PARAMETERS` (
    public var `Size`: UInt,
    public var `ReportOption`: UByte,
    public var `Partial`: UByte,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 923:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_REPORT_ZONES_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_TIERING_QUERY_INPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `NumberOfTierIds`: UInt,
    public var `TierIds`: Array<`windows_sys`.`core`.`GUID`>,
)
// UNSUPPORTED Rust 937:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_TIERING_QUERY_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_DSM_TIERING_QUERY_OUTPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
    public var `Alignment`: ULong,
    public var `TotalNumberOfRegions`: UInt,
    public var `NumberOfRegionsReturned`: UInt,
    public var `Regions`: Array<`STORAGE_TIER_REGION`>,
)
// UNSUPPORTED Rust 954:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_DSM_TIERING_QUERY_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_INTERNAL_STATUS_DATA` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `T10VendorId`: ULong,
    public var `DataSet1Length`: UInt,
    public var `DataSet2Length`: UInt,
    public var `DataSet3Length`: UInt,
    public var `DataSet4Length`: UInt,
    public var `StatusDataVersion`: UByte,
    public var `Reserved`: UByteArray,
    public var `ReasonIdentifier`: UByteArray,
    public var `StatusDataLength`: UInt,
    public var `StatusData`: UByteArray,
)
// UNSUPPORTED Rust 975:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_INTERNAL_STATUS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE` = Int;
public typealias `DEVICE_INTERNAL_STATUS_DATA_SET` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_LB_PROVISIONING_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `_bitfield`: UByte,
    public var `Reserved1`: UByteArray,
    public var `OptimalUnmapGranularity`: ULong,
    public var `UnmapGranularityAlignment`: ULong,
    public var `MaxUnmapLbaCount`: UInt,
    public var `MaxUnmapBlockDescriptorCount`: UInt,
)
// UNSUPPORTED Rust 994:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_LB_PROVISIONING_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_LOCATION` (
    public var `Socket`: UInt,
    public var `Slot`: UInt,
    public var `Adapter`: UInt,
    public var `Port`: UInt,
    public var `Anonymous`: `DEVICE_LOCATION_0`,
)
// UNSUPPORTED Rust 1008:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_LOCATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1013:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVICE_LOCATION_0 {
//     pub Anonymous1: DEVICE_LOCATION_0_0,
//     pub Anonymous2: DEVICE_LOCATION_0_1,
// }

// UNSUPPORTED Rust 1019:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_LOCATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_LOCATION_0_0` (
    public var `Channel`: UInt,
    public var `Device`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_LOCATION_0_1` (
    public var `Target`: UInt,
    public var `Lun`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_MANAGE_DATA_SET_ATTRIBUTES` (
    public var `Size`: UInt,
    public var `Action`: UInt,
    public var `Flags`: UInt,
    public var `ParameterBlockOffset`: UInt,
    public var `ParameterBlockLength`: UInt,
    public var `DataSetRangesOffset`: UInt,
    public var `DataSetRangesLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT` (
    public var `Size`: UInt,
    public var `Action`: UInt,
    public var `Flags`: UInt,
    public var `OperationStatus`: UInt,
    public var `ExtendedError`: UInt,
    public var `TargetDetailedError`: UInt,
    public var `ReservedStatus`: UInt,
    public var `OutputBlockOffset`: UInt,
    public var `OutputBlockLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_MEDIA_INFO` (
    public var `DeviceSpecific`: `DEVICE_MEDIA_INFO_0`,
)
// UNSUPPORTED Rust 1066:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for DEVICE_MEDIA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1072:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub union DEVICE_MEDIA_INFO_0 {
//     pub DiskInfo: DEVICE_MEDIA_INFO_0_0,
//     pub RemovableDiskInfo: DEVICE_MEDIA_INFO_0_1,
//     pub TapeInfo: DEVICE_MEDIA_INFO_0_2,
// }

// UNSUPPORTED Rust 1080:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for DEVICE_MEDIA_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_MEDIA_INFO_0_0` (
    public var `Cylinders`: Long,
    public var `MediaType`: `STORAGE_MEDIA_TYPE`,
    public var `TracksPerCylinder`: UInt,
    public var `SectorsPerTrack`: UInt,
    public var `BytesPerSector`: UInt,
    public var `NumberMediaSides`: UInt,
    public var `MediaCharacteristics`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_MEDIA_INFO_0_1` (
    public var `Cylinders`: Long,
    public var `MediaType`: `STORAGE_MEDIA_TYPE`,
    public var `TracksPerCylinder`: UInt,
    public var `SectorsPerTrack`: UInt,
    public var `BytesPerSector`: UInt,
    public var `NumberMediaSides`: UInt,
    public var `MediaCharacteristics`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_MEDIA_INFO_0_2` (
    public var `MediaType`: `STORAGE_MEDIA_TYPE`,
    public var `MediaCharacteristics`: UInt,
    public var `CurrentBlockSize`: UInt,
    public var `BusType`: `super`.`super`.`Storage`.`FileSystem`.`STORAGE_BUS_TYPE`,
    public var `BusSpecificData`: `DEVICE_MEDIA_INFO_0_2_0`,
)
// UNSUPPORTED Rust 1120:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for DEVICE_MEDIA_INFO_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1126:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub union DEVICE_MEDIA_INFO_0_2_0 {
//     pub ScsiInformation: DEVICE_MEDIA_INFO_0_2_0_0,
// }

// UNSUPPORTED Rust 1132:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for DEVICE_MEDIA_INFO_0_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_MEDIA_INFO_0_2_0_0` (
    public var `MediumType`: UByte,
    public var `DensityCode`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_POWER_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceAttentionSupported`: Boolean,
    public var `AsynchronousNotificationSupported`: Boolean,
    public var `IdlePowerManagementEnabled`: Boolean,
    public var `D3ColdEnabled`: Boolean,
    public var `D3ColdSupported`: Boolean,
    public var `NoVerifyDuringIdlePower`: Boolean,
    public var `Reserved`: UByteArray,
    public var `IdleTimeoutInMS`: UInt,
)
// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_POWER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_SEEK_PENALTY_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `IncursSeekPenalty`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_STORAGE_ADDRESS_RANGE` (
    public var `StartAddress`: Long,
    public var `LengthInBytes`: ULong,
)
public const val `DEVICE_STORAGE_NO_ERRORS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEVICE_STORAGE_RANGE_ATTRIBUTES` (
    public var `LengthInBytes`: ULong,
    public var `Anonymous`: `DEVICE_STORAGE_RANGE_ATTRIBUTES_0`,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 1185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_STORAGE_RANGE_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1190:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEVICE_STORAGE_RANGE_ATTRIBUTES_0 {
//     pub AllFlags: u32,
//     pub Anonymous: DEVICE_STORAGE_RANGE_ATTRIBUTES_0_0,
// }

// UNSUPPORTED Rust 1196:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DEVICE_STORAGE_RANGE_ATTRIBUTES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_STORAGE_RANGE_ATTRIBUTES_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_TRIM_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `TrimEnabled`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVICE_WRITE_AGGREGATION_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `BenefitsFromWriteAggregation`: Boolean,
)
// UNSUPPORTED Rust 1220:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_Disk_Number: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 5 };

// UNSUPPORTED Rust 1221:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_Gpt_Name: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 9 };

// UNSUPPORTED Rust 1222:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_Gpt_Type: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 8 };

// UNSUPPORTED Rust 1223:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_Mbr_Type: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 7 };

// UNSUPPORTED Rust 1224:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_Partition_Number: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 6 };

// UNSUPPORTED Rust 1225:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_Portable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 2 };

// UNSUPPORTED Rust 1226:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_Removable_Media: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 3 };

// UNSUPPORTED Rust 1227:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_Storage_System_Critical: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4d1ebee8_0803_4774_9842_b77db50265e9), pid: 4 };

public const val `DISABLE_SMART`: UInt = 217u;
public const val `DISK_ATTRIBUTE_OFFLINE`: ULong = 1uL;
public const val `DISK_ATTRIBUTE_READ_ONLY`: ULong = 2uL;
public const val `DISK_BINNING`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_CACHE_INFORMATION` (
    public var `ParametersSavable`: Boolean,
    public var `ReadCacheEnabled`: Boolean,
    public var `WriteCacheEnabled`: Boolean,
    public var `ReadRetentionPriority`: `DISK_CACHE_RETENTION_PRIORITY`,
    public var `WriteRetentionPriority`: `DISK_CACHE_RETENTION_PRIORITY`,
    public var `DisablePrefetchTransferLength`: UShort,
    public var `PrefetchScalar`: Boolean,
    public var `Anonymous`: `DISK_CACHE_INFORMATION_0`,
)
// UNSUPPORTED Rust 1244:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_CACHE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1249:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISK_CACHE_INFORMATION_0 {
//     pub ScalarPrefetch: DISK_CACHE_INFORMATION_0_0,
//     pub BlockPrefetch: DISK_CACHE_INFORMATION_0_1,
// }

// UNSUPPORTED Rust 1255:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_CACHE_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_CACHE_INFORMATION_0_1` (
    public var `Minimum`: UShort,
    public var `Maximum`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_CACHE_INFORMATION_0_0` (
    public var `Minimum`: UShort,
    public var `Maximum`: UShort,
    public var `MaximumBlocks`: UShort,
)
public typealias `DISK_CACHE_RETENTION_PRIORITY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_CONTROLLER_NUMBER` (
    public var `ControllerNumber`: UInt,
    public var `DiskNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_DETECTION_INFO` (
    public var `SizeOfDetectInfo`: UInt,
    public var `DetectionType`: `DETECTION_TYPE`,
    public var `Anonymous`: `DISK_DETECTION_INFO_0`,
)
// UNSUPPORTED Rust 1287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_DETECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1292:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISK_DETECTION_INFO_0 {
//     pub Anonymous: DISK_DETECTION_INFO_0_0,
// }

// UNSUPPORTED Rust 1297:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_DETECTION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_DETECTION_INFO_0_0` (
    public var `Int13`: `DISK_INT13_INFO`,
    public var `ExInt13`: `DISK_EX_INT13_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_EXTENT` (
    public var `DiskNumber`: UInt,
    public var `StartingOffset`: Long,
    public var `ExtentLength`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_EX_INT13_INFO` (
    public var `ExBufferSize`: UShort,
    public var `ExFlags`: UShort,
    public var `ExCylinders`: UInt,
    public var `ExHeads`: UInt,
    public var `ExSectorsPerTrack`: UInt,
    public var `ExSectorsPerDrive`: ULong,
    public var `ExSectorSize`: UShort,
    public var `ExReserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_GEOMETRY` (
    public var `Cylinders`: Long,
    public var `MediaType`: `MEDIA_TYPE`,
    public var `TracksPerCylinder`: UInt,
    public var `SectorsPerTrack`: UInt,
    public var `BytesPerSector`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_GEOMETRY_EX` (
    public var `Geometry`: `DISK_GEOMETRY`,
    public var `DiskSize`: Long,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_GEOMETRY_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_GROW_PARTITION` (
    public var `PartitionNumber`: UInt,
    public var `BytesToGrow`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_HISTOGRAM` (
    public var `DiskSize`: Long,
    public var `Start`: Long,
    public var `End`: Long,
    public var `Average`: Long,
    public var `AverageRead`: Long,
    public var `AverageWrite`: Long,
    public var `Granularity`: UInt,
    public var `Size`: UInt,
    public var `ReadCount`: UInt,
    public var `WriteCount`: UInt,
    public var `Histogram`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HISTOGRAM_BUCKET`>?,
)
// UNSUPPORTED Rust 1369:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_HISTOGRAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_INT13_INFO` (
    public var `DriveSelect`: UShort,
    public var `MaxCylinders`: UInt,
    public var `SectorsPerTrack`: UShort,
    public var `MaxHeads`: UShort,
    public var `NumberDrives`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_LOGGING` (
    public var `Function`: UByte,
    public var `BufferAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferSize`: UInt,
)
// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_LOGGING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DISK_LOGGING_DUMP`: UInt = 2u;
public const val `DISK_LOGGING_START`: UInt = 0u;
public const val `DISK_LOGGING_STOP`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_PARTITION_INFO` (
    public var `SizeOfPartitionInfo`: UInt,
    public var `PartitionStyle`: `PARTITION_STYLE`,
    public var `Anonymous`: `DISK_PARTITION_INFO_0`,
)
// UNSUPPORTED Rust 1405:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_PARTITION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1410:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DISK_PARTITION_INFO_0 {
//     pub Mbr: DISK_PARTITION_INFO_0_0,
//     pub Gpt: DISK_PARTITION_INFO_0_1,
// }

// UNSUPPORTED Rust 1416:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_PARTITION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_PARTITION_INFO_0_1` (
    public var `DiskId`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_PARTITION_INFO_0_0` (
    public var `Signature`: UInt,
    public var `CheckSum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_PERFORMANCE` (
    public var `BytesRead`: Long,
    public var `BytesWritten`: Long,
    public var `ReadTime`: Long,
    public var `WriteTime`: Long,
    public var `IdleTime`: Long,
    public var `ReadCount`: UInt,
    public var `WriteCount`: UInt,
    public var `QueueDepth`: UInt,
    public var `SplitCount`: UInt,
    public var `QueryTime`: Long,
    public var `StorageDeviceNumber`: UInt,
    public var `StorageManagerName`: UShortArray,
)
// UNSUPPORTED Rust 1448:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_PERFORMANCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISK_RECORD` (
    public var `ByteOffset`: Long,
    public var `StartTime`: Long,
    public var `EndTime`: Long,
    public var `VirtualAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumberOfBytes`: UInt,
    public var `DeviceNumber`: UByte,
    public var `ReadRequest`: Boolean,
)
// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DISK_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DLT`: `STORAGE_MEDIA_TYPE` = 39;
public const val `DMI`: `STORAGE_MEDIA_TYPE` = 48;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVERSTATUS` (
    public var `bDriverError`: UByte,
    public var `bIDEError`: UByte,
    public var `bReserved`: UByteArray,
    public var `dwReserved`: UIntArray,
)
// UNSUPPORTED Rust 1479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVERSTATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DRIVE_LAYOUT_INFORMATION` (
    public var `PartitionCount`: UInt,
    public var `Signature`: UInt,
    public var `PartitionEntry`: Array<`PARTITION_INFORMATION`>,
)
// UNSUPPORTED Rust 1491:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVE_LAYOUT_INFORMATION {
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
public class `DRIVE_LAYOUT_INFORMATION_EX` (
    public var `PartitionStyle`: UInt,
    public var `PartitionCount`: UInt,
    public var `Anonymous`: `DRIVE_LAYOUT_INFORMATION_EX_0`,
    public var `PartitionEntry`: Array<`PARTITION_INFORMATION_EX`>,
)
// UNSUPPORTED Rust 1504:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVE_LAYOUT_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1509:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DRIVE_LAYOUT_INFORMATION_EX_0 {
//     pub Mbr: DRIVE_LAYOUT_INFORMATION_MBR,
//     pub Gpt: DRIVE_LAYOUT_INFORMATION_GPT,
// }

// UNSUPPORTED Rust 1515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DRIVE_LAYOUT_INFORMATION_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRIVE_LAYOUT_INFORMATION_GPT` (
    public var `DiskId`: `windows_sys`.`core`.`GUID`,
    public var `StartingUsableOffset`: Long,
    public var `UsableLength`: Long,
    public var `MaxPartitionCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRIVE_LAYOUT_INFORMATION_MBR` (
    public var `Signature`: UInt,
    public var `CheckSum`: UInt,
)
public const val `DST_L`: `STORAGE_MEDIA_TYPE` = 82;
public const val `DST_M`: `STORAGE_MEDIA_TYPE` = 81;
public const val `DST_S`: `STORAGE_MEDIA_TYPE` = 80;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DUPLICATE_EXTENTS_DATA` (
    public var `FileHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `SourceFileOffset`: Long,
    public var `TargetFileOffset`: Long,
    public var `ByteCount`: Long,
)
// UNSUPPORTED Rust 1545:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUPLICATE_EXTENTS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DUPLICATE_EXTENTS_DATA32` (
    public var `FileHandle`: UInt,
    public var `SourceFileOffset`: Long,
    public var `TargetFileOffset`: Long,
    public var `ByteCount`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DUPLICATE_EXTENTS_DATA_EX` (
    public var `Size`: ULong,
    public var `FileHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `SourceFileOffset`: Long,
    public var `TargetFileOffset`: Long,
    public var `ByteCount`: Long,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 1569:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUPLICATE_EXTENTS_DATA_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DUPLICATE_EXTENTS_DATA_EX32` (
    public var `Size`: UInt,
    public var `FileHandle`: UInt,
    public var `SourceFileOffset`: Long,
    public var `TargetFileOffset`: Long,
    public var `ByteCount`: Long,
    public var `Flags`: UInt,
)
public const val `DUPLICATE_EXTENTS_DATA_EX_ASYNC`: UInt = 2u;
public const val `DUPLICATE_EXTENTS_DATA_EX_SOURCE_ATOMIC`: UInt = 1u;
public typealias `DUPLICATE_EXTENTS_STATE` = Int;
public const val `DVD_R`: `STORAGE_MEDIA_TYPE` = 55;
public const val `DVD_RAM`: `STORAGE_MEDIA_TYPE` = 88;
public const val `DVD_ROM`: `STORAGE_MEDIA_TYPE` = 54;
public const val `DVD_RW`: `STORAGE_MEDIA_TYPE` = 56;
public const val `DV_6mm`: `STORAGE_MEDIA_TYPE` = 47;
public const val `DetectExInt13`: `DETECTION_TYPE` = 2;
public const val `DetectInt13`: `DETECTION_TYPE` = 1;
public const val `DetectNone`: `DETECTION_TYPE` = 0;
public const val `DeviceCurrentInternalStatusData`: `DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE` = 2;
public const val `DeviceCurrentInternalStatusDataHeader`: `DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE` = 1;
public const val `DeviceDsmActionFlag_NonDestructive`: UInt = 2147483648u;
public const val `DeviceInternalStatusDataRequestTypeUndefined`: `DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE` = 0;
public const val `DeviceProblemCHMError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 2;
public const val `DeviceProblemCHMMoveError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 6;
public const val `DeviceProblemCHMZeroError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 7;
public const val `DeviceProblemCalibrationError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 4;
public const val `DeviceProblemCartridgeEjectError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 11;
public const val `DeviceProblemCartridgeInsertError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 8;
public const val `DeviceProblemDoorOpen`: `CHANGER_DEVICE_PROBLEM_TYPE` = 3;
public const val `DeviceProblemDriveError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 13;
public const val `DeviceProblemGripperError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 12;
public const val `DeviceProblemHardware`: `CHANGER_DEVICE_PROBLEM_TYPE` = 1;
public const val `DeviceProblemNone`: `CHANGER_DEVICE_PROBLEM_TYPE` = 0;
public const val `DeviceProblemPositionError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 9;
public const val `DeviceProblemSensorError`: `CHANGER_DEVICE_PROBLEM_TYPE` = 10;
public const val `DeviceProblemTargetFailure`: `CHANGER_DEVICE_PROBLEM_TYPE` = 5;
public const val `DeviceSavedInternalStatusData`: `DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE` = 4;
public const val `DeviceSavedInternalStatusDataHeader`: `DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE` = 3;
public const val `DeviceStatusDataSet1`: `DEVICE_INTERNAL_STATUS_DATA_SET` = 1;
public const val `DeviceStatusDataSet2`: `DEVICE_INTERNAL_STATUS_DATA_SET` = 2;
public const val `DeviceStatusDataSet3`: `DEVICE_INTERNAL_STATUS_DATA_SET` = 3;
public const val `DeviceStatusDataSet4`: `DEVICE_INTERNAL_STATUS_DATA_SET` = 4;
public const val `DeviceStatusDataSetMax`: `DEVICE_INTERNAL_STATUS_DATA_SET` = 5;
public const val `DeviceStatusDataSetUndefined`: `DEVICE_INTERNAL_STATUS_DATA_SET` = 0;
public const val `DiskHealthHealthy`: `STORAGE_DISK_HEALTH_STATUS` = 3;
public const val `DiskHealthMax`: `STORAGE_DISK_HEALTH_STATUS` = 4;
public const val `DiskHealthUnhealthy`: `STORAGE_DISK_HEALTH_STATUS` = 1;
public const val `DiskHealthUnknown`: `STORAGE_DISK_HEALTH_STATUS` = 0;
public const val `DiskHealthWarning`: `STORAGE_DISK_HEALTH_STATUS` = 2;
public const val `DiskOpReasonBackgroundOperation`: `STORAGE_OPERATIONAL_STATUS_REASON` = 12;
public const val `DiskOpReasonComponent`: `STORAGE_OPERATIONAL_STATUS_REASON` = 10;
public const val `DiskOpReasonConfiguration`: `STORAGE_OPERATIONAL_STATUS_REASON` = 7;
public const val `DiskOpReasonDataPersistenceLossImminent`: `STORAGE_OPERATIONAL_STATUS_REASON` = 18;
public const val `DiskOpReasonDeviceController`: `STORAGE_OPERATIONAL_STATUS_REASON` = 8;
public const val `DiskOpReasonDisabledByPlatform`: `STORAGE_OPERATIONAL_STATUS_REASON` = 16;
public const val `DiskOpReasonEnergySource`: `STORAGE_OPERATIONAL_STATUS_REASON` = 6;
public const val `DiskOpReasonHealthCheck`: `STORAGE_OPERATIONAL_STATUS_REASON` = 14;
public const val `DiskOpReasonInvalidFirmware`: `STORAGE_OPERATIONAL_STATUS_REASON` = 13;
public const val `DiskOpReasonIo`: `STORAGE_OPERATIONAL_STATUS_REASON` = 3;
public const val `DiskOpReasonLostData`: `STORAGE_OPERATIONAL_STATUS_REASON` = 5;
public const val `DiskOpReasonLostDataPersistence`: `STORAGE_OPERATIONAL_STATUS_REASON` = 15;
public const val `DiskOpReasonLostWritePersistence`: `STORAGE_OPERATIONAL_STATUS_REASON` = 17;
public const val `DiskOpReasonMax`: `STORAGE_OPERATIONAL_STATUS_REASON` = 20;
public const val `DiskOpReasonMedia`: `STORAGE_OPERATIONAL_STATUS_REASON` = 2;
public const val `DiskOpReasonMediaController`: `STORAGE_OPERATIONAL_STATUS_REASON` = 9;
public const val `DiskOpReasonNVDIMM_N`: `STORAGE_OPERATIONAL_STATUS_REASON` = 11;
public const val `DiskOpReasonScsiSenseCode`: `STORAGE_OPERATIONAL_STATUS_REASON` = 1;
public const val `DiskOpReasonThresholdExceeded`: `STORAGE_OPERATIONAL_STATUS_REASON` = 4;
public const val `DiskOpReasonUnknown`: `STORAGE_OPERATIONAL_STATUS_REASON` = 0;
public const val `DiskOpReasonWritePersistenceLossImminent`: `STORAGE_OPERATIONAL_STATUS_REASON` = 19;
public const val `DiskOpStatusHardwareError`: `STORAGE_DISK_OPERATIONAL_STATUS` = 5;
public const val `DiskOpStatusInService`: `STORAGE_DISK_OPERATIONAL_STATUS` = 4;
public const val `DiskOpStatusMissing`: `STORAGE_DISK_OPERATIONAL_STATUS` = 8;
public const val `DiskOpStatusNone`: `STORAGE_DISK_OPERATIONAL_STATUS` = 0;
public const val `DiskOpStatusNotUsable`: `STORAGE_DISK_OPERATIONAL_STATUS` = 6;
public const val `DiskOpStatusOk`: `STORAGE_DISK_OPERATIONAL_STATUS` = 2;
public const val `DiskOpStatusPredictingFailure`: `STORAGE_DISK_OPERATIONAL_STATUS` = 3;
public const val `DiskOpStatusTransientError`: `STORAGE_DISK_OPERATIONAL_STATUS` = 7;
public const val `DiskOpStatusUnknown`: `STORAGE_DISK_OPERATIONAL_STATUS` = 1;
public const val `EFS_TRACKED_OFFSET_HEADER_FLAG`: UInt = 1u;
public const val `ELEMENT_STATUS_ACCESS`: `CHANGER_ELEMENT_STATUS_FLAGS` = 8u;
public const val `ELEMENT_STATUS_AVOLTAG`: `CHANGER_ELEMENT_STATUS_FLAGS` = 536870912u;
public const val `ELEMENT_STATUS_EXCEPT`: `CHANGER_ELEMENT_STATUS_FLAGS` = 4u;
public const val `ELEMENT_STATUS_EXENAB`: `CHANGER_ELEMENT_STATUS_FLAGS` = 16u;
public const val `ELEMENT_STATUS_FULL`: `CHANGER_ELEMENT_STATUS_FLAGS` = 1u;
public const val `ELEMENT_STATUS_ID_VALID`: `CHANGER_ELEMENT_STATUS_FLAGS` = 8192u;
public const val `ELEMENT_STATUS_IMPEXP`: `CHANGER_ELEMENT_STATUS_FLAGS` = 2u;
public const val `ELEMENT_STATUS_INENAB`: `CHANGER_ELEMENT_STATUS_FLAGS` = 32u;
public const val `ELEMENT_STATUS_INVERT`: `CHANGER_ELEMENT_STATUS_FLAGS` = 4194304u;
public const val `ELEMENT_STATUS_LUN_VALID`: `CHANGER_ELEMENT_STATUS_FLAGS` = 4096u;
public const val `ELEMENT_STATUS_NOT_BUS`: `CHANGER_ELEMENT_STATUS_FLAGS` = 32768u;
public const val `ELEMENT_STATUS_PRODUCT_DATA`: `CHANGER_ELEMENT_STATUS_FLAGS` = 64u;
public const val `ELEMENT_STATUS_PVOLTAG`: `CHANGER_ELEMENT_STATUS_FLAGS` = 268435456u;
public const val `ELEMENT_STATUS_SVALID`: `CHANGER_ELEMENT_STATUS_FLAGS` = 8388608u;
public typealias `ELEMENT_TYPE` = Int;
public const val `ENABLE_DISABLE_AUTOSAVE`: UInt = 210u;
public const val `ENABLE_DISABLE_AUTO_OFFLINE`: UInt = 219u;
public const val `ENABLE_SMART`: UInt = 216u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTED_DATA_INFO` (
    public var `StartingFileOffset`: ULong,
    public var `OutputBufferOffset`: UInt,
    public var `BytesWithinFileSize`: UInt,
    public var `BytesWithinValidDataLength`: UInt,
    public var `CompressionFormat`: UShort,
    public var `DataUnitShift`: UByte,
    public var `ChunkShift`: UByte,
    public var `ClusterShift`: UByte,
    public var `EncryptionFormat`: UByte,
    public var `NumberOfDataBlocks`: UShort,
    public var `DataBlockSize`: UIntArray,
)
// UNSUPPORTED Rust 1691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENCRYPTED_DATA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENCRYPTED_DATA_INFO_SPARSE_FILE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTION_BUFFER` (
    public var `EncryptionOperation`: UInt,
    public var `Private`: UByteArray,
)
// UNSUPPORTED Rust 1703:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENCRYPTION_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENCRYPTION_FORMAT_DEFAULT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENCRYPTION_KEY_CTRL_INPUT` (
    public var `HeaderSize`: UInt,
    public var `StructureSize`: UInt,
    public var `KeyOffset`: UShort,
    public var `KeySize`: UShort,
    public var `DplLock`: UInt,
    public var `DplUserId`: ULong,
    public var `DplCredentialId`: ULong,
)
public const val `ERROR_DRIVE_NOT_INSTALLED`: UInt = 8u;
public const val `ERROR_HISTORY_DIRECTORY_ENTRY_DEFAULT_COUNT`: UInt = 8u;
public const val `ERROR_INIT_STATUS_NEEDED`: UInt = 17u;
public const val `ERROR_LABEL_QUESTIONABLE`: UInt = 2u;
public const val `ERROR_LABEL_UNREADABLE`: UInt = 1u;
public const val `ERROR_SLOT_NOT_PRESENT`: UInt = 4u;
public const val `ERROR_TRAY_MALFUNCTION`: UInt = 16u;
public const val `ERROR_UNHANDLED_ERROR`: UInt = 4294967295u;
public const val `EXECUTE_OFFLINE_DIAGS`: UInt = 212u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXFAT_STATISTICS` (
    public var `CreateHits`: UInt,
    public var `SuccessfulCreates`: UInt,
    public var `FailedCreates`: UInt,
    public var `NonCachedReads`: UInt,
    public var `NonCachedReadBytes`: UInt,
    public var `NonCachedWrites`: UInt,
    public var `NonCachedWriteBytes`: UInt,
    public var `NonCachedDiskReads`: UInt,
    public var `NonCachedDiskWrites`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXTENDED_ENCRYPTED_DATA_INFO` (
    public var `ExtendedCode`: UInt,
    public var `Length`: UInt,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
)
public const val `EXTEND_IEPORT`: UInt = 2u;
public const val `EqualPriority`: `DISK_CACHE_RETENTION_PRIORITY` = 0;
public const val `F3_120M_512`: `MEDIA_TYPE` = 13;
public const val `F3_128Mb_512`: `MEDIA_TYPE` = 20;
public const val `F3_1Pt23_1024`: `MEDIA_TYPE` = 18;
public const val `F3_1Pt2_512`: `MEDIA_TYPE` = 17;
public const val `F3_1Pt44_512`: `MEDIA_TYPE` = 2;
public const val `F3_200Mb_512`: `MEDIA_TYPE` = 23;
public const val `F3_20Pt8_512`: `MEDIA_TYPE` = 4;
public const val `F3_230Mb_512`: `MEDIA_TYPE` = 21;
public const val `F3_240M_512`: `MEDIA_TYPE` = 24;
public const val `F3_2Pt88_512`: `MEDIA_TYPE` = 3;
public const val `F3_32M_512`: `MEDIA_TYPE` = 25;
public const val `F3_640_512`: `MEDIA_TYPE` = 14;
public const val `F3_720_512`: `MEDIA_TYPE` = 5;
public const val `F5_160_512`: `MEDIA_TYPE` = 10;
public const val `F5_180_512`: `MEDIA_TYPE` = 9;
public const val `F5_1Pt23_1024`: `MEDIA_TYPE` = 19;
public const val `F5_1Pt2_512`: `MEDIA_TYPE` = 1;
public const val `F5_320_1024`: `MEDIA_TYPE` = 8;
public const val `F5_320_512`: `MEDIA_TYPE` = 7;
public const val `F5_360_512`: `MEDIA_TYPE` = 6;
public const val `F5_640_512`: `MEDIA_TYPE` = 15;
public const val `F5_720_512`: `MEDIA_TYPE` = 16;
public const val `F8_256_128`: `MEDIA_TYPE` = 22;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FAT_STATISTICS` (
    public var `CreateHits`: UInt,
    public var `SuccessfulCreates`: UInt,
    public var `FailedCreates`: UInt,
    public var `NonCachedReads`: UInt,
    public var `NonCachedReadBytes`: UInt,
    public var `NonCachedWrites`: UInt,
    public var `NonCachedWriteBytes`: UInt,
    public var `NonCachedDiskReads`: UInt,
    public var `NonCachedDiskWrites`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILESYSTEM_STATISTICS` (
    public var `FileSystemType`: `FILESYSTEM_STATISTICS_TYPE`,
    public var `Version`: UShort,
    public var `SizeOfCompleteStructure`: UInt,
    public var `UserFileReads`: UInt,
    public var `UserFileReadBytes`: UInt,
    public var `UserDiskReads`: UInt,
    public var `UserFileWrites`: UInt,
    public var `UserFileWriteBytes`: UInt,
    public var `UserDiskWrites`: UInt,
    public var `MetaDataReads`: UInt,
    public var `MetaDataReadBytes`: UInt,
    public var `MetaDataDiskReads`: UInt,
    public var `MetaDataWrites`: UInt,
    public var `MetaDataWriteBytes`: UInt,
    public var `MetaDataDiskWrites`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILESYSTEM_STATISTICS_EX` (
    public var `FileSystemType`: `FILESYSTEM_STATISTICS_TYPE`,
    public var `Version`: UShort,
    public var `SizeOfCompleteStructure`: UInt,
    public var `UserFileReads`: ULong,
    public var `UserFileReadBytes`: ULong,
    public var `UserDiskReads`: ULong,
    public var `UserFileWrites`: ULong,
    public var `UserFileWriteBytes`: ULong,
    public var `UserDiskWrites`: ULong,
    public var `MetaDataReads`: ULong,
    public var `MetaDataReadBytes`: ULong,
    public var `MetaDataDiskReads`: ULong,
    public var `MetaDataWrites`: ULong,
    public var `MetaDataWriteBytes`: ULong,
    public var `MetaDataDiskWrites`: ULong,
)
public typealias `FILESYSTEM_STATISTICS_TYPE` = UShort;
public const val `FILESYSTEM_STATISTICS_TYPE_EXFAT`: `FILESYSTEM_STATISTICS_TYPE` = 3u;
public const val `FILESYSTEM_STATISTICS_TYPE_FAT`: `FILESYSTEM_STATISTICS_TYPE` = 2u;
public const val `FILESYSTEM_STATISTICS_TYPE_NTFS`: `FILESYSTEM_STATISTICS_TYPE` = 1u;
public const val `FILESYSTEM_STATISTICS_TYPE_REFS`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_ALLOCATED_RANGE_BUFFER` (
    public var `FileOffset`: Long,
    public var `Length`: Long,
)
public const val `FILE_ANY_ACCESS`: UInt = 0u;
public const val `FILE_CLEAR_ENCRYPTION`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_DESIRED_STORAGE_CLASS_INFORMATION` (
    public var `Class`: `FILE_STORAGE_TIER_CLASS`,
    public var `Flags`: UInt,
)
public const val `FILE_DEVICE_8042_PORT`: UInt = 39u;
public const val `FILE_DEVICE_ACPI`: UInt = 50u;
public const val `FILE_DEVICE_BATTERY`: UInt = 41u;
public const val `FILE_DEVICE_BEEP`: UInt = 1u;
public const val `FILE_DEVICE_BIOMETRIC`: UInt = 68u;
public const val `FILE_DEVICE_BLUETOOTH`: UInt = 65u;
public const val `FILE_DEVICE_BUS_EXTENDER`: UInt = 42u;
public const val `FILE_DEVICE_CD_ROM_FILE_SYSTEM`: UInt = 3u;
public const val `FILE_DEVICE_CHANGER`: UInt = 48u;
public const val `FILE_DEVICE_CONSOLE`: UInt = 80u;
public const val `FILE_DEVICE_CONTROLLER`: UInt = 4u;
public const val `FILE_DEVICE_CRYPT_PROVIDER`: UInt = 63u;
public const val `FILE_DEVICE_DATALINK`: UInt = 5u;
public const val `FILE_DEVICE_DEVAPI`: UInt = 71u;
public const val `FILE_DEVICE_DFS`: UInt = 6u;
public const val `FILE_DEVICE_DFS_FILE_SYSTEM`: UInt = 53u;
public const val `FILE_DEVICE_DFS_VOLUME`: UInt = 54u;
public const val `FILE_DEVICE_DISK_FILE_SYSTEM`: UInt = 8u;
public const val `FILE_DEVICE_EHSTOR`: UInt = 70u;
public const val `FILE_DEVICE_EVENT_COLLECTOR`: UInt = 95u;
public const val `FILE_DEVICE_FILE_SYSTEM`: UInt = 9u;
public const val `FILE_DEVICE_FIPS`: UInt = 58u;
public const val `FILE_DEVICE_FULLSCREEN_VIDEO`: UInt = 52u;
public const val `FILE_DEVICE_GPIO`: UInt = 72u;
public const val `FILE_DEVICE_HOLOGRAPHIC`: UInt = 91u;
public const val `FILE_DEVICE_INFINIBAND`: UInt = 59u;
public const val `FILE_DEVICE_INPORT_PORT`: UInt = 10u;
public const val `FILE_DEVICE_KEYBOARD`: UInt = 11u;
public const val `FILE_DEVICE_KS`: UInt = 47u;
public const val `FILE_DEVICE_KSEC`: UInt = 57u;
public const val `FILE_DEVICE_MAILSLOT`: UInt = 12u;
public const val `FILE_DEVICE_MASS_STORAGE`: UInt = 45u;
public const val `FILE_DEVICE_MIDI_IN`: UInt = 13u;
public const val `FILE_DEVICE_MIDI_OUT`: UInt = 14u;
public const val `FILE_DEVICE_MODEM`: UInt = 43u;
public const val `FILE_DEVICE_MOUSE`: UInt = 15u;
public const val `FILE_DEVICE_MT_COMPOSITE`: UInt = 66u;
public const val `FILE_DEVICE_MT_TRANSPORT`: UInt = 67u;
public const val `FILE_DEVICE_MULTI_UNC_PROVIDER`: UInt = 16u;
public const val `FILE_DEVICE_NAMED_PIPE`: UInt = 17u;
public const val `FILE_DEVICE_NETWORK`: UInt = 18u;
public const val `FILE_DEVICE_NETWORK_BROWSER`: UInt = 19u;
public const val `FILE_DEVICE_NETWORK_FILE_SYSTEM`: UInt = 20u;
public const val `FILE_DEVICE_NETWORK_REDIRECTOR`: UInt = 40u;
public const val `FILE_DEVICE_NFP`: UInt = 81u;
public const val `FILE_DEVICE_NULL`: UInt = 21u;
public const val `FILE_DEVICE_NVDIMM`: UInt = 90u;
public const val `FILE_DEVICE_PARALLEL_PORT`: UInt = 22u;
public const val `FILE_DEVICE_PERSISTENT_MEMORY`: UInt = 89u;
public const val `FILE_DEVICE_PHYSICAL_NETCARD`: UInt = 23u;
public const val `FILE_DEVICE_PMI`: UInt = 69u;
public const val `FILE_DEVICE_POINT_OF_SERVICE`: UInt = 84u;
public const val `FILE_DEVICE_PRINTER`: UInt = 24u;
public const val `FILE_DEVICE_PRM`: UInt = 94u;
public const val `FILE_DEVICE_SCANNER`: UInt = 25u;
public const val `FILE_DEVICE_SCREEN`: UInt = 28u;
public const val `FILE_DEVICE_SDFXHCI`: UInt = 92u;
public const val `FILE_DEVICE_SERENUM`: UInt = 55u;
public const val `FILE_DEVICE_SERIAL_MOUSE_PORT`: UInt = 26u;
public const val `FILE_DEVICE_SERIAL_PORT`: UInt = 27u;
public const val `FILE_DEVICE_SMB`: UInt = 46u;
public const val `FILE_DEVICE_SOUND`: UInt = 29u;
public const val `FILE_DEVICE_SOUNDWIRE`: UInt = 97u;
public const val `FILE_DEVICE_STORAGE_REPLICATION`: UInt = 85u;
public const val `FILE_DEVICE_STREAMS`: UInt = 30u;
public const val `FILE_DEVICE_SYSENV`: UInt = 82u;
public const val `FILE_DEVICE_TAPE_FILE_SYSTEM`: UInt = 32u;
public const val `FILE_DEVICE_TERMSRV`: UInt = 56u;
public const val `FILE_DEVICE_TRANSPORT`: UInt = 33u;
public const val `FILE_DEVICE_TRUST_ENV`: UInt = 86u;
public const val `FILE_DEVICE_UCM`: UInt = 87u;
public const val `FILE_DEVICE_UCMTCPCI`: UInt = 88u;
public const val `FILE_DEVICE_UCMUCSI`: UInt = 93u;
public const val `FILE_DEVICE_UNKNOWN`: UInt = 34u;
public const val `FILE_DEVICE_USB4`: UInt = 96u;
public const val `FILE_DEVICE_USBEX`: UInt = 73u;
public const val `FILE_DEVICE_VDM`: UInt = 44u;
public const val `FILE_DEVICE_VIDEO`: UInt = 35u;
public const val `FILE_DEVICE_VIRTUAL_BLOCK`: UInt = 83u;
public const val `FILE_DEVICE_VIRTUAL_DISK`: UInt = 36u;
public const val `FILE_DEVICE_VMBUS`: UInt = 62u;
public const val `FILE_DEVICE_WAVE_IN`: UInt = 37u;
public const val `FILE_DEVICE_WAVE_OUT`: UInt = 38u;
public const val `FILE_DEVICE_WPD`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_FS_PERSISTENT_VOLUME_INFORMATION` (
    public var `VolumeFlags`: UInt,
    public var `FlagMask`: UInt,
    public var `Version`: UInt,
    public var `Reserved`: UInt,
)
public const val `FILE_INITIATE_REPAIR_HINT1_ATTRIBUTE_NON_RESIDENT`: ULong = 137438953472uL;
public const val `FILE_INITIATE_REPAIR_HINT1_ATTRIBUTE_NOT_FOUND`: ULong = 4096uL;
public const val `FILE_INITIATE_REPAIR_HINT1_ATTRIBUTE_TOO_SMALL`: ULong = 68719476736uL;
public const val `FILE_INITIATE_REPAIR_HINT1_CLUSTERS_ALREADY_IN_USE`: ULong = 32768uL;
public const val `FILE_INITIATE_REPAIR_HINT1_DENY_DEFRAG`: ULong = 274877906944uL;
public const val `FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_IS_BASE_RECORD`: ULong = 524288uL;
public const val `FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_BASE_RECORD`: ULong = 8uL;
public const val `FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_EXIST`: ULong = 4uL;
public const val `FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_IN_USE`: ULong = 1uL;
public const val `FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_NOT_ORPHAN`: ULong = 262144uL;
public const val `FILE_INITIATE_REPAIR_HINT1_FILE_RECORD_REUSED`: ULong = 2uL;
public const val `FILE_INITIATE_REPAIR_HINT1_INDEX_ENTRY_MISMATCH`: ULong = 1099511627776uL;
public const val `FILE_INITIATE_REPAIR_HINT1_INVALID_ARRAY_LENGTH_COUNT`: ULong = 1048576uL;
public const val `FILE_INITIATE_REPAIR_HINT1_INVALID_LCN`: ULong = 4294967296uL;
public const val `FILE_INITIATE_REPAIR_HINT1_INVALID_ORPHAN_RECOVERY_NAME`: ULong = 2199023255552uL;
public const val `FILE_INITIATE_REPAIR_HINT1_INVALID_PARENT`: ULong = 8388608uL;
public const val `FILE_INITIATE_REPAIR_HINT1_INVALID_RUN_LENGTH`: ULong = 131072uL;
public const val `FILE_INITIATE_REPAIR_HINT1_INVALID_VCN`: ULong = 8589934592uL;
public const val `FILE_INITIATE_REPAIR_HINT1_LCN_NOT_EXIST`: ULong = 65536uL;
public const val `FILE_INITIATE_REPAIR_HINT1_MULTIPLE_FILE_NAME_ATTRIBUTES`: ULong = 4398046511104uL;
public const val `FILE_INITIATE_REPAIR_HINT1_NAME_CONFLICT`: ULong = 17179869184uL;
public const val `FILE_INITIATE_REPAIR_HINT1_NOTHING_WRONG`: ULong = 2048uL;
public const val `FILE_INITIATE_REPAIR_HINT1_NOT_IMPLEMENTED`: ULong = 32uL;
public const val `FILE_INITIATE_REPAIR_HINT1_ORPHAN`: ULong = 34359738368uL;
public const val `FILE_INITIATE_REPAIR_HINT1_ORPHAN_GENERATED`: ULong = 512uL;
public const val `FILE_INITIATE_REPAIR_HINT1_OUT_OF_GENERIC_NAMES`: ULong = 1073741824uL;
public const val `FILE_INITIATE_REPAIR_HINT1_OUT_OF_RESOURCE`: ULong = 2147483648uL;
public const val `FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_BASE_RECORD`: ULong = 134217728uL;
public const val `FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_EXIST`: ULong = 67108864uL;
public const val `FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_INDEX`: ULong = 268435456uL;
public const val `FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_NOT_IN_USE`: ULong = 16777216uL;
public const val `FILE_INITIATE_REPAIR_HINT1_PARENT_FILE_RECORD_REUSED`: ULong = 33554432uL;
public const val `FILE_INITIATE_REPAIR_HINT1_POTENTIAL_CROSSLINK`: ULong = 8192uL;
public const val `FILE_INITIATE_REPAIR_HINT1_PREVIOUS_PARENT_STILL_VALID`: ULong = 549755813888uL;
public const val `FILE_INITIATE_REPAIR_HINT1_RECURSIVELY_CORRUPTED`: ULong = 256uL;
public const val `FILE_INITIATE_REPAIR_HINT1_REPAIRED`: ULong = 1024uL;
public const val `FILE_INITIATE_REPAIR_HINT1_REPAIR_DISABLED`: ULong = 128uL;
public const val `FILE_INITIATE_REPAIR_HINT1_SID_MISMATCH`: ULong = 4194304uL;
public const val `FILE_INITIATE_REPAIR_HINT1_SID_VALID`: ULong = 2097152uL;
public const val `FILE_INITIATE_REPAIR_HINT1_STALE_INFORMATION`: ULong = 16384uL;
public const val `FILE_INITIATE_REPAIR_HINT1_SYSTEM_FILE`: ULong = 16uL;
public const val `FILE_INITIATE_REPAIR_HINT1_UNABLE_TO_REPAIR`: ULong = 64uL;
public const val `FILE_INITIATE_REPAIR_HINT1_VALID_INDEX_ENTRY`: ULong = 536870912uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_INITIATE_REPAIR_OUTPUT_BUFFER` (
    public var `Hint1`: ULong,
    public var `Hint2`: ULong,
    public var `Clsn`: ULong,
    public var `Status`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_LAYOUT_ENTRY` (
    public var `Version`: UInt,
    public var `NextFileOffset`: UInt,
    public var `Flags`: UInt,
    public var `FileAttributes`: UInt,
    public var `FileReferenceNumber`: ULong,
    public var `FirstNameOffset`: UInt,
    public var `FirstStreamOffset`: UInt,
    public var `ExtraInfoOffset`: UInt,
    public var `ExtraInfoLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_LAYOUT_INFO_ENTRY` (
    public var `BasicInformation`: `FILE_LAYOUT_INFO_ENTRY_0`,
    public var `OwnerId`: UInt,
    public var `SecurityId`: UInt,
    public var `Usn`: Long,
    public var `StorageReserveId`: `STORAGE_RESERVE_ID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_LAYOUT_INFO_ENTRY_0` (
    public var `CreationTime`: Long,
    public var `LastAccessTime`: Long,
    public var `LastWriteTime`: Long,
    public var `ChangeTime`: Long,
    public var `FileAttributes`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_LAYOUT_NAME_ENTRY` (
    public var `NextNameOffset`: UInt,
    public var `Flags`: UInt,
    public var `ParentFileReferenceNumber`: ULong,
    public var `FileNameLength`: UInt,
    public var `Reserved`: UInt,
    public var `FileName`: UShortArray,
)
// UNSUPPORTED Rust 2029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_LAYOUT_NAME_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_LAYOUT_NAME_ENTRY_DOS`: UInt = 2u;
public const val `FILE_LAYOUT_NAME_ENTRY_PRIMARY`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_LEVEL_TRIM` (
    public var `Key`: UInt,
    public var `NumRanges`: UInt,
    public var `Ranges`: Array<`FILE_LEVEL_TRIM_RANGE`>,
)
// UNSUPPORTED Rust 2043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_LEVEL_TRIM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_LEVEL_TRIM_OUTPUT` (
    public var `NumRangesProcessed`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_LEVEL_TRIM_RANGE` (
    public var `Offset`: ULong,
    public var `Length`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_MAKE_COMPATIBLE_BUFFER` (
    public var `CloseDisc`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_OBJECTID_BUFFER` (
    public var `ObjectId`: UByteArray,
    public var `Anonymous`: `FILE_OBJECTID_BUFFER_0`,
)
// UNSUPPORTED Rust 2070:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_OBJECTID_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2075:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_OBJECTID_BUFFER_0 {
//     pub Anonymous: FILE_OBJECTID_BUFFER_0_0,
//     pub ExtendedInfo: [u8; 48],
// }

// UNSUPPORTED Rust 2081:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_OBJECTID_BUFFER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_OBJECTID_BUFFER_0_0` (
    public var `BirthVolumeId`: UByteArray,
    public var `BirthObjectId`: UByteArray,
    public var `DomainId`: UByteArray,
)
// UNSUPPORTED Rust 2093:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_OBJECTID_BUFFER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_PREFETCH` (
    public var `Type`: UInt,
    public var `Count`: UInt,
    public var `Prefetch`: ULongArray,
)
// UNSUPPORTED Rust 2105:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_PREFETCH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_PREFETCH_EX` (
    public var `Type`: UInt,
    public var `Count`: UInt,
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Prefetch`: ULongArray,
)
// UNSUPPORTED Rust 2118:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_PREFETCH_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PREFETCH_TYPE_FOR_CREATE`: UInt = 1u;
public const val `FILE_PREFETCH_TYPE_FOR_CREATE_EX`: UInt = 3u;
public const val `FILE_PREFETCH_TYPE_FOR_DIRENUM`: UInt = 2u;
public const val `FILE_PREFETCH_TYPE_FOR_DIRENUM_EX`: UInt = 4u;
public const val `FILE_PREFETCH_TYPE_MAX`: UInt = 4u;
public const val `FILE_PROVIDER_COMPRESSION_MAXIMUM`: UInt = 4u;
public const val `FILE_PROVIDER_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_PROVIDER_EXTERNAL_INFO_V0` (
    public var `Version`: UInt,
    public var `Algorithm`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_PROVIDER_EXTERNAL_INFO_V1` (
    public var `Version`: UInt,
    public var `Algorithm`: UInt,
    public var `Flags`: UInt,
)
public const val `FILE_PROVIDER_FLAG_COMPRESS_ON_WRITE`: UInt = 1u;
public const val `FILE_PROVIDER_SINGLE_FILE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 34 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_QUERY_ON_DISK_VOL_INFO_BUFFER` (
    public var `DirectoryCount`: Long,
    public var `FileCount`: Long,
    public var `FsFormatMajVersion`: UShort,
    public var `FsFormatMinVersion`: UShort,
    public var `FsFormatName`: UShortArray,
    public var `FormatTime`: Long,
    public var `LastUpdateTime`: Long,
    public var `CopyrightInfo`: UShortArray,
    public var `AbstractInfo`: UShortArray,
    public var `FormattingImplementationInfo`: UShortArray,
    public var `LastModifyingImplementationInfo`: UShortArray,
)
// UNSUPPORTED Rust 2160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_QUERY_ON_DISK_VOL_INFO_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_QUERY_SPARING_BUFFER` (
    public var `SparingUnitBytes`: UInt,
    public var `SoftwareSparing`: Boolean,
    public var `TotalSpareBlocks`: UInt,
    public var `FreeSpareBlocks`: UInt,
)
public const val `FILE_READ_ACCESS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_REFERENCE_RANGE` (
    public var `StartingFileReferenceNumber`: ULong,
    public var `EndingFileReferenceNumber`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_REGION_INFO` (
    public var `FileOffset`: Long,
    public var `Length`: Long,
    public var `Usage`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_REGION_INPUT` (
    public var `FileOffset`: Long,
    public var `Length`: Long,
    public var `DesiredUsage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_REGION_OUTPUT` (
    public var `Flags`: UInt,
    public var `TotalRegionEntryCount`: UInt,
    public var `RegionEntryCount`: UInt,
    public var `Reserved`: UInt,
    public var `Region`: Array<`FILE_REGION_INFO`>,
)
// UNSUPPORTED Rust 2204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_REGION_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_REGION_USAGE_HUGE_PAGE_ALIGNMENT`: UInt = 16u;
public const val `FILE_REGION_USAGE_LARGE_PAGE_ALIGNMENT`: UInt = 8u;
public const val `FILE_REGION_USAGE_OTHER_PAGE_ALIGNMENT`: UInt = 4u;
public const val `FILE_REGION_USAGE_QUERY_ALIGNMENT`: UInt = 8u;
public const val `FILE_REGION_USAGE_VALID_CACHED_DATA`: UInt = 1u;
public const val `FILE_REGION_USAGE_VALID_NONCACHED_DATA`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_SET_DEFECT_MGMT_BUFFER` (
    public var `Disable`: Boolean,
)
public const val `FILE_SET_ENCRYPTION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_SET_SPARSE_BUFFER` (
    public var `SetSparse`: Boolean,
)
public const val `FILE_SPECIAL_ACCESS`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_STORAGE_TIER` (
    public var `Id`: `windows_sys`.`core`.`GUID`,
    public var `Name`: UShortArray,
    public var `Description`: UShortArray,
    public var `Flags`: ULong,
    public var `ProvisionedCapacity`: ULong,
    public var `MediaType`: `FILE_STORAGE_TIER_MEDIA_TYPE`,
    public var `Class`: `FILE_STORAGE_TIER_CLASS`,
)
// UNSUPPORTED Rust 2238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_STORAGE_TIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FILE_STORAGE_TIER_CLASS` = Int;
public const val `FILE_STORAGE_TIER_DESCRIPTION_LENGTH`: UInt = 512u;
public typealias `FILE_STORAGE_TIER_FLAGS` = UInt;
public const val `FILE_STORAGE_TIER_FLAG_NO_SEEK_PENALTY`: `FILE_STORAGE_TIER_FLAGS` = 131072u;
public const val `FILE_STORAGE_TIER_FLAG_PARITY`: UInt = 8388608u;
public const val `FILE_STORAGE_TIER_FLAG_READ_CACHE`: UInt = 4194304u;
public const val `FILE_STORAGE_TIER_FLAG_SMR`: UInt = 16777216u;
public const val `FILE_STORAGE_TIER_FLAG_WRITE_BACK_CACHE`: UInt = 2097152u;
public typealias `FILE_STORAGE_TIER_MEDIA_TYPE` = Int;
public const val `FILE_STORAGE_TIER_NAME_LENGTH`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_STORAGE_TIER_REGION` (
    public var `TierId`: `windows_sys`.`core`.`GUID`,
    public var `Offset`: ULong,
    public var `Length`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_SYSTEM_RECOGNITION_INFORMATION` (
    public var `FileSystem`: ByteArray,
)
// UNSUPPORTED Rust 2265:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_SYSTEM_RECOGNITION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_TYPE_NOTIFICATION_FLAG_USAGE_BEGIN`: UInt = 1u;
public const val `FILE_TYPE_NOTIFICATION_FLAG_USAGE_END`: UInt = 2u;
// UNSUPPORTED Rust 2272:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FILE_TYPE_NOTIFICATION_GUID_CRASHDUMP_FILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d453eb7_d2a6_4dbd_a2e3_fbd0ed9109a9);

// UNSUPPORTED Rust 2273:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FILE_TYPE_NOTIFICATION_GUID_HIBERNATION_FILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb7624d64_b9a3_4cf8_8011_5b86c940e7b7);

// UNSUPPORTED Rust 2274:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FILE_TYPE_NOTIFICATION_GUID_PAGE_FILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d0a64a1_38fc_4db8_9fe7_3f4352cd7c5c);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_TYPE_NOTIFICATION_INPUT` (
    public var `Flags`: UInt,
    public var `NumFileTypeIDs`: UInt,
    public var `FileTypeID`: Array<`windows_sys`.`core`.`GUID`>,
)
// UNSUPPORTED Rust 2282:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_TYPE_NOTIFICATION_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_WRITE_ACCESS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_ZERO_DATA_INFORMATION` (
    public var `FileOffset`: Long,
    public var `BeyondFinalZero`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_ZERO_DATA_INFORMATION_EX` (
    public var `FileOffset`: Long,
    public var `BeyondFinalZero`: Long,
    public var `Flags`: UInt,
)
public const val `FILE_ZERO_DATA_INFORMATION_FLAG_PRESERVE_CACHED_DATA`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FIND_BY_SID_DATA` (
    public var `Restart`: UInt,
    public var `Sid`: `super`.`super`.`Security`.`SID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FIND_BY_SID_OUTPUT` (
    public var `NextEntryOffset`: UInt,
    public var `FileIndex`: UInt,
    public var `FileNameLength`: UInt,
    public var `FileName`: UShortArray,
)
// UNSUPPORTED Rust 2317:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FIND_BY_SID_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLAG_USN_TRACK_MODIFIED_RANGES_ENABLE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FORMAT_EX_PARAMETERS` (
    public var `MediaType`: `MEDIA_TYPE`,
    public var `StartCylinderNumber`: UInt,
    public var `EndCylinderNumber`: UInt,
    public var `StartHeadNumber`: UInt,
    public var `EndHeadNumber`: UInt,
    public var `FormatGapLength`: UShort,
    public var `SectorsPerTrack`: UShort,
    public var `SectorNumber`: UShortArray,
)
// UNSUPPORTED Rust 2335:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FORMAT_EX_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FORMAT_PARAMETERS` (
    public var `MediaType`: `MEDIA_TYPE`,
    public var `StartCylinderNumber`: UInt,
    public var `EndCylinderNumber`: UInt,
    public var `StartHeadNumber`: UInt,
    public var `EndHeadNumber`: UInt,
)
public const val `FSBPIO_INFL_None`: `FS_BPIO_INFLAGS` = 0;
public const val `FSBPIO_INFL_SKIP_STORAGE_STACK_QUERY`: `FS_BPIO_INFLAGS` = 1;
public const val `FSBPIO_OUTFL_COMPATIBLE_STORAGE_DRIVER`: `FS_BPIO_OUTFLAGS` = 8;
public const val `FSBPIO_OUTFL_FILTER_ATTACH_BLOCKED`: `FS_BPIO_OUTFLAGS` = 4;
public const val `FSBPIO_OUTFL_None`: `FS_BPIO_OUTFLAGS` = 0;
public const val `FSBPIO_OUTFL_STREAM_BYPASS_PAUSED`: `FS_BPIO_OUTFLAGS` = 2;
public const val `FSBPIO_OUTFL_VOLUME_STACK_BYPASS_PAUSED`: `FS_BPIO_OUTFLAGS` = 1;
public const val `FSCTL_ADD_OVERLAY`: UInt = 623408u;
public const val `FSCTL_ADVANCE_FILE_ID`: UInt = 590532u;
public const val `FSCTL_ALLOW_EXTENDED_DASD_IO`: UInt = 589955u;
public const val `FSCTL_CLEAN_VOLUME_METADATA`: UInt = 590716u;
public const val `FSCTL_CLEAR_ALL_LCN_WEAK_REFERENCES`: UInt = 590956u;
public const val `FSCTL_CLEAR_LCN_WEAK_REFERENCE`: UInt = 590948u;
public const val `FSCTL_CORRUPTION_HANDLING`: UInt = 590432u;
public const val `FSCTL_CREATE_LCN_WEAK_REFERENCE`: UInt = 590944u;
public const val `FSCTL_CREATE_OR_GET_OBJECT_ID`: UInt = 590016u;
public const val `FSCTL_CREATE_USN_JOURNAL`: UInt = 590055u;
public const val `FSCTL_CSC_INTERNAL`: UInt = 590255u;
public const val `FSCTL_CSV_CONTROL`: UInt = 590548u;
public const val `FSCTL_CSV_GET_VOLUME_NAME_FOR_VOLUME_MOUNT_POINT`: UInt = 590420u;
public const val `FSCTL_CSV_GET_VOLUME_PATH_NAME`: UInt = 590416u;
public const val `FSCTL_CSV_GET_VOLUME_PATH_NAMES_FOR_VOLUME_NAME`: UInt = 590424u;
public const val `FSCTL_CSV_H_BREAKING_SYNC_TUNNEL_REQUEST`: UInt = 590564u;
public const val `FSCTL_CSV_INTERNAL`: UInt = 590444u;
public const val `FSCTL_CSV_MGMT_LOCK`: UInt = 590524u;
public const val `FSCTL_CSV_QUERY_DOWN_LEVEL_FILE_SYSTEM_CHARACTERISTICS`: UInt = 590528u;
public const val `FSCTL_CSV_QUERY_VETO_FILE_DIRECT_IO`: UInt = 590540u;
public const val `FSCTL_CSV_SYNC_TUNNEL_REQUEST`: UInt = 590536u;
public const val `FSCTL_CSV_TUNNEL_REQUEST`: UInt = 590404u;
public const val `FSCTL_DELETE_CORRUPTED_REFS_CONTAINER`: UInt = 590836u;
public const val `FSCTL_DELETE_EXTERNAL_BACKING`: UInt = 590612u;
public const val `FSCTL_DELETE_OBJECT_ID`: UInt = 589984u;
public const val `FSCTL_DELETE_REPARSE_POINT`: UInt = 589996u;
public const val `FSCTL_DELETE_USN_JOURNAL`: UInt = 590072u;
public const val `FSCTL_DFSR_SET_GHOST_HANDLE_STATE`: UInt = 590264u;
public const val `FSCTL_DISABLE_LOCAL_BUFFERING`: UInt = 590520u;
public const val `FSCTL_DISMOUNT_VOLUME`: UInt = 589856u;
public const val `FSCTL_DUPLICATE_CLUSTER`: UInt = 590940u;
public const val `FSCTL_DUPLICATE_EXTENTS_TO_FILE`: UInt = 623428u;
public const val `FSCTL_DUPLICATE_EXTENTS_TO_FILE_EX`: UInt = 623592u;
public const val `FSCTL_ENABLE_PER_IO_FLAGS`: UInt = 590892u;
public const val `FSCTL_ENABLE_UPGRADE`: UInt = 622800u;
public const val `FSCTL_ENCRYPTION_FSCTL_IO`: UInt = 590043u;
public const val `FSCTL_ENCRYPTION_KEY_CONTROL`: UInt = 590852u;
public const val `FSCTL_ENUM_EXTERNAL_BACKING`: UInt = 590616u;
public const val `FSCTL_ENUM_OVERLAY`: UInt = 590623u;
public const val `FSCTL_ENUM_USN_DATA`: UInt = 590003u;
public const val `FSCTL_EXTEND_VOLUME`: UInt = 590064u;
public const val `FSCTL_FILESYSTEM_GET_STATISTICS`: UInt = 589920u;
public const val `FSCTL_FILESYSTEM_GET_STATISTICS_EX`: UInt = 590732u;
public const val `FSCTL_FILE_LEVEL_TRIM`: UInt = 623112u;
public const val `FSCTL_FILE_PREFETCH`: UInt = 590112u;
public const val `FSCTL_FILE_TYPE_NOTIFICATION`: UInt = 590340u;
public const val `FSCTL_FIND_FILES_BY_SID`: UInt = 589967u;
public const val `FSCTL_GET_BOOT_AREA_INFO`: UInt = 590384u;
public const val `FSCTL_GET_COMPRESSION`: UInt = 589884u;
public const val `FSCTL_GET_EXTERNAL_BACKING`: UInt = 590608u;
public const val `FSCTL_GET_FILTER_FILE_IDENTIFIER`: UInt = 590788u;
public const val `FSCTL_GET_INTEGRITY_INFORMATION`: UInt = 590460u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSCTL_GET_INTEGRITY_INFORMATION_BUFFER` (
    public var `ChecksumAlgorithm`: UShort,
    public var `Reserved`: UShort,
    public var `Flags`: UInt,
    public var `ChecksumChunkSizeInBytes`: UInt,
    public var `ClusterSizeInBytes`: UInt,
)
public const val `FSCTL_GET_NTFS_FILE_RECORD`: UInt = 589928u;
public const val `FSCTL_GET_NTFS_VOLUME_DATA`: UInt = 589924u;
public const val `FSCTL_GET_OBJECT_ID`: UInt = 589980u;
public const val `FSCTL_GET_REFS_VOLUME_DATA`: UInt = 590552u;
public const val `FSCTL_GET_REPAIR`: UInt = 590236u;
public const val `FSCTL_GET_REPARSE_POINT`: UInt = 589992u;
public const val `FSCTL_GET_RETRIEVAL_POINTERS`: UInt = 589939u;
public const val `FSCTL_GET_RETRIEVAL_POINTERS_AND_REFCOUNT`: UInt = 590803u;
public const val `FSCTL_GET_RETRIEVAL_POINTER_BASE`: UInt = 590388u;
public const val `FSCTL_GET_RETRIEVAL_POINTER_COUNT`: UInt = 590891u;
public const val `FSCTL_GET_VOLUME_BITMAP`: UInt = 589935u;
public const val `FSCTL_GET_WOF_VERSION`: UInt = 590696u;
public const val `FSCTL_GHOST_FILE_EXTENTS`: UInt = 623532u;
public const val `FSCTL_HCS_ASYNC_TUNNEL_REQUEST`: UInt = 590704u;
public const val `FSCTL_HCS_SYNC_NO_WRITE_TUNNEL_REQUEST`: UInt = 590776u;
public const val `FSCTL_HCS_SYNC_TUNNEL_REQUEST`: UInt = 590700u;
public const val `FSCTL_INITIATE_FILE_METADATA_OPTIMIZATION`: UInt = 590684u;
public const val `FSCTL_INITIATE_REPAIR`: UInt = 590248u;
public const val `FSCTL_INTEGRITY_FLAG_CHECKSUM_ENFORCEMENT_OFF`: UInt = 1u;
public const val `FSCTL_INVALIDATE_VOLUMES`: UInt = 589908u;
public const val `FSCTL_IS_CSV_FILE`: UInt = 590408u;
public const val `FSCTL_IS_FILE_ON_CSV_VOLUME`: UInt = 590428u;
public const val `FSCTL_IS_PATHNAME_VALID`: UInt = 589868u;
public const val `FSCTL_IS_VOLUME_DIRTY`: UInt = 589944u;
public const val `FSCTL_IS_VOLUME_MOUNTED`: UInt = 589864u;
public const val `FSCTL_IS_VOLUME_OWNED_BYCSVFS`: UInt = 590456u;
public const val `FSCTL_LMR_QUERY_INFO`: UInt = 590968u;
public const val `FSCTL_LOCK_VOLUME`: UInt = 589848u;
public const val `FSCTL_LOOKUP_STREAM_FROM_CLUSTER`: UInt = 590332u;
public const val `FSCTL_MAKE_MEDIA_COMPATIBLE`: UInt = 622896u;
public const val `FSCTL_MANAGE_BYPASS_IO`: UInt = 590920u;
public const val `FSCTL_MARK_AS_SYSTEM_HIVE`: UInt = 589903u;
public const val `FSCTL_MARK_HANDLE`: UInt = 590076u;
public const val `FSCTL_MARK_VOLUME_DIRTY`: UInt = 589872u;
public const val `FSCTL_MOVE_FILE`: UInt = 589940u;
public const val `FSCTL_NOTIFY_DATA_CHANGE`: UInt = 590844u;
public const val `FSCTL_NOTIFY_STORAGE_SPACE_ALLOCATION`: UInt = 590748u;
public const val `FSCTL_OFFLOAD_READ`: UInt = 606820u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSCTL_OFFLOAD_READ_INPUT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `TokenTimeToLive`: UInt,
    public var `Reserved`: UInt,
    public var `FileOffset`: ULong,
    public var `CopyLength`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSCTL_OFFLOAD_READ_OUTPUT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `TransferLength`: ULong,
    public var `Token`: UByteArray,
)
// UNSUPPORTED Rust 2473:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FSCTL_OFFLOAD_READ_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSCTL_OFFLOAD_WRITE`: UInt = 623208u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSCTL_OFFLOAD_WRITE_INPUT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `FileOffset`: ULong,
    public var `CopyLength`: ULong,
    public var `TransferOffset`: ULong,
    public var `Token`: UByteArray,
)
// UNSUPPORTED Rust 2489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FSCTL_OFFLOAD_WRITE_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSCTL_OFFLOAD_WRITE_OUTPUT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `LengthWritten`: ULong,
)
public const val `FSCTL_OPBATCH_ACK_CLOSE_PENDING`: UInt = 589840u;
public const val `FSCTL_OPLOCK_BREAK_ACKNOWLEDGE`: UInt = 589836u;
public const val `FSCTL_OPLOCK_BREAK_ACK_NO_2`: UInt = 589904u;
public const val `FSCTL_OPLOCK_BREAK_NOTIFY`: UInt = 589844u;
public const val `FSCTL_QUERY_ALLOCATED_RANGES`: UInt = 606415u;
public const val `FSCTL_QUERY_ASYNC_DUPLICATE_EXTENTS_STATUS`: UInt = 590896u;
public const val `FSCTL_QUERY_BAD_RANGES`: UInt = 590828u;
public const val `FSCTL_QUERY_DEPENDENT_VOLUME`: UInt = 590320u;
public const val `FSCTL_QUERY_DIRECT_ACCESS_EXTENTS`: UInt = 590747u;
public const val `FSCTL_QUERY_DIRECT_IMAGE_ORIGINAL_BASE`: UInt = 590756u;
public const val `FSCTL_QUERY_EXTENT_READ_CACHE_INFO`: UInt = 590711u;
public const val `FSCTL_QUERY_FAT_BPB`: UInt = 589912u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSCTL_QUERY_FAT_BPB_BUFFER` (
    public var `First0x24BytesOfBootSector`: UByteArray,
)
// UNSUPPORTED Rust 2518:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FSCTL_QUERY_FAT_BPB_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSCTL_QUERY_FILE_LAYOUT`: UInt = 590455u;
public const val `FSCTL_QUERY_FILE_METADATA_OPTIMIZATION`: UInt = 590688u;
public const val `FSCTL_QUERY_FILE_REGIONS`: UInt = 590468u;
public const val `FSCTL_QUERY_FILE_SYSTEM_RECOGNITION`: UInt = 590412u;
public const val `FSCTL_QUERY_GHOSTED_FILE_EXTENTS`: UInt = 590768u;
public const val `FSCTL_QUERY_LCN_WEAK_REFERENCE`: UInt = 590952u;
public const val `FSCTL_QUERY_ON_DISK_VOLUME_INFO`: UInt = 590140u;
public const val `FSCTL_QUERY_PAGEFILE_ENCRYPTION`: UInt = 590312u;
public const val `FSCTL_QUERY_PERSISTENT_VOLUME_STATE`: UInt = 590396u;
public const val `FSCTL_QUERY_REFS_SMR_VOLUME_INFO`: UInt = 590812u;
public const val `FSCTL_QUERY_REFS_VOLUME_COUNTER_INFO`: UInt = 590715u;
public const val `FSCTL_QUERY_REGION_INFO`: UInt = 590576u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSCTL_QUERY_REGION_INFO_INPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `NumberOfTierIds`: UInt,
    public var `TierIds`: Array<`windows_sys`.`core`.`GUID`>,
)
// UNSUPPORTED Rust 2544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FSCTL_QUERY_REGION_INFO_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSCTL_QUERY_REGION_INFO_OUTPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
    public var `Alignment`: ULong,
    public var `TotalNumberOfRegions`: UInt,
    public var `NumberOfRegionsReturned`: UInt,
    public var `Regions`: Array<`FILE_STORAGE_TIER_REGION`>,
)
// UNSUPPORTED Rust 2561:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FSCTL_QUERY_REGION_INFO_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSCTL_QUERY_RETRIEVAL_POINTERS`: UInt = 589883u;
public const val `FSCTL_QUERY_SHARED_VIRTUAL_DISK_SUPPORT`: UInt = 590592u;
public const val `FSCTL_QUERY_SPARING_INFO`: UInt = 590136u;
public const val `FSCTL_QUERY_STORAGE_CLASSES`: UInt = 590572u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSCTL_QUERY_STORAGE_CLASSES_OUTPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: `FILE_STORAGE_TIER_FLAGS`,
    public var `TotalNumberOfTiers`: UInt,
    public var `NumberOfTiersReturned`: UInt,
    public var `Tiers`: Array<`FILE_STORAGE_TIER`>,
)
// UNSUPPORTED Rust 2580:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FSCTL_QUERY_STORAGE_CLASSES_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSCTL_QUERY_USN_JOURNAL`: UInt = 590068u;
public const val `FSCTL_QUERY_VOLUME_CONTAINER_STATE`: UInt = 590736u;
public const val `FSCTL_QUERY_VOLUME_NUMA_INFO`: UInt = 590804u;
public const val `FSCTL_READ_FILE_USN_DATA`: UInt = 590059u;
public const val `FSCTL_READ_FROM_PLEX`: UInt = 606494u;
public const val `FSCTL_READ_RAW_ENCRYPTED`: UInt = 590051u;
public const val `FSCTL_READ_UNPRIVILEGED_USN_JOURNAL`: UInt = 590763u;
public const val `FSCTL_READ_USN_JOURNAL`: UInt = 590011u;
public const val `FSCTL_REARRANGE_FILE`: UInt = 640032u;
public const val `FSCTL_RECALL_FILE`: UInt = 590103u;
public const val `FSCTL_REFS_CHECKPOINT_VOLUME`: UInt = 590972u;
public const val `FSCTL_REFS_DEALLOCATE_RANGES`: UInt = 590808u;
public const val `FSCTL_REFS_DEALLOCATE_RANGES_EX`: UInt = 590924u;
public const val `FSCTL_REFS_QUERY_VOLUME_COMPRESSION_INFO`: UInt = 590936u;
public const val `FSCTL_REFS_QUERY_VOLUME_DEDUP_INFO`: UInt = 590964u;
public const val `FSCTL_REFS_QUERY_VOLUME_IO_METRICS_INFO`: UInt = 590988u;
public const val `FSCTL_REFS_QUERY_VOLUME_TOTAL_SHARED_LCNS`: UInt = 590976u;
public const val `FSCTL_REFS_SET_VOLUME_COMPRESSION_INFO`: UInt = 590932u;
public const val `FSCTL_REFS_SET_VOLUME_DEDUP_INFO`: UInt = 590960u;
public const val `FSCTL_REFS_SET_VOLUME_IO_METRICS_INFO`: UInt = 590984u;
public const val `FSCTL_REFS_STREAM_SNAPSHOT_MANAGEMENT`: UInt = 590912u;
public const val `FSCTL_REMOVE_OVERLAY`: UInt = 623412u;
public const val `FSCTL_REPAIR_COPIES`: UInt = 639668u;
public const val `FSCTL_REQUEST_BATCH_OPLOCK`: UInt = 589832u;
public const val `FSCTL_REQUEST_FILTER_OPLOCK`: UInt = 589916u;
public const val `FSCTL_REQUEST_OPLOCK`: UInt = 590400u;
public const val `FSCTL_REQUEST_OPLOCK_LEVEL_1`: UInt = 589824u;
public const val `FSCTL_REQUEST_OPLOCK_LEVEL_2`: UInt = 589828u;
public const val `FSCTL_RESET_VOLUME_ALLOCATION_HINTS`: UInt = 590316u;
public const val `FSCTL_RKF_INTERNAL`: UInt = 590511u;
public const val `FSCTL_SCRUB_DATA`: UInt = 590512u;
public const val `FSCTL_SCRUB_UNDISCOVERABLE_ID`: UInt = 590840u;
public const val `FSCTL_SD_GLOBAL_CHANGE`: UInt = 590324u;
public const val `FSCTL_SECURITY_ID_CHECK`: UInt = 606391u;
public const val `FSCTL_SET_BOOTLOADER_ACCESSED`: UInt = 589903u;
public const val `FSCTL_SET_CACHED_RUNS_STATE`: UInt = 590928u;
public const val `FSCTL_SET_COMPRESSION`: UInt = 639040u;
public const val `FSCTL_SET_DAX_ALLOC_ALIGNMENT_HINT`: UInt = 590832u;
public const val `FSCTL_SET_DEFECT_MANAGEMENT`: UInt = 622900u;
public const val `FSCTL_SET_ENCRYPTION`: UInt = 590039u;
public const val `FSCTL_SET_EXTERNAL_BACKING`: UInt = 590604u;
public const val `FSCTL_SET_INTEGRITY_INFORMATION`: UInt = 639616u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FSCTL_SET_INTEGRITY_INFORMATION_BUFFER` (
    public var `ChecksumAlgorithm`: UShort,
    public var `Reserved`: UShort,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FSCTL_SET_INTEGRITY_INFORMATION_BUFFER_EX` (
    public var `EnableIntegrity`: UByte,
    public var `KeepIntegrityStateUnchanged`: UByte,
    public var `Reserved`: UShort,
    public var `Flags`: UInt,
    public var `Version`: UByte,
    public var `Reserved2`: UByteArray,
)
// UNSUPPORTED Rust 2644:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FSCTL_SET_INTEGRITY_INFORMATION_BUFFER_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FSCTL_SET_INTEGRITY_INFORMATION_EX`: UInt = 590720u;
public const val `FSCTL_SET_LAYER_ROOT`: UInt = 590740u;
public const val `FSCTL_SET_OBJECT_ID`: UInt = 589976u;
public const val `FSCTL_SET_OBJECT_ID_EXTENDED`: UInt = 590012u;
public const val `FSCTL_SET_PERSISTENT_VOLUME_STATE`: UInt = 590392u;
public const val `FSCTL_SET_PURGE_FAILURE_MODE`: UInt = 590448u;
public const val `FSCTL_SET_REFS_FILE_STRICTLY_SEQUENTIAL`: UInt = 590820u;
public const val `FSCTL_SET_REFS_SMR_VOLUME_GC_PARAMETERS`: UInt = 590816u;
public const val `FSCTL_SET_REPAIR`: UInt = 590232u;
public const val `FSCTL_SET_REPARSE_POINT`: UInt = 589988u;
public const val `FSCTL_SET_REPARSE_POINT_EX`: UInt = 590860u;
public const val `FSCTL_SET_SHORT_NAME_BEHAVIOR`: UInt = 590260u;
public const val `FSCTL_SET_SPARSE`: UInt = 590020u;
public const val `FSCTL_SET_VOLUME_COMPRESSION_STATE`: UInt = 590144u;
public const val `FSCTL_SET_ZERO_DATA`: UInt = 622792u;
public const val `FSCTL_SET_ZERO_ON_DEALLOCATION`: UInt = 590228u;
public const val `FSCTL_SHRINK_VOLUME`: UInt = 590256u;
public const val `FSCTL_SHUFFLE_FILE`: UInt = 639808u;
public const val `FSCTL_SIS_COPYFILE`: UInt = 590080u;
public const val `FSCTL_SIS_LINK_FILES`: UInt = 639236u;
public const val `FSCTL_SMB_SHARE_FLUSH_AND_PURGE`: UInt = 590908u;
public const val `FSCTL_SPARSE_OVERALLOCATE`: UInt = 590668u;
public const val `FSCTL_SSDI_STORAGE_REQUEST`: UInt = 590752u;
public const val `FSCTL_START_VIRTUALIZATION_INSTANCE`: UInt = 590784u;
public const val `FSCTL_START_VIRTUALIZATION_INSTANCE_EX`: UInt = 590848u;
public const val `FSCTL_STORAGE_QOS_CONTROL`: UInt = 590672u;
public const val `FSCTL_STREAMS_ASSOCIATE_ID`: UInt = 590792u;
public const val `FSCTL_STREAMS_QUERY_ID`: UInt = 590796u;
public const val `FSCTL_STREAMS_QUERY_PARAMETERS`: UInt = 590788u;
public const val `FSCTL_SUSPEND_OVERLAY`: UInt = 590724u;
public const val `FSCTL_SVHDX_ASYNC_TUNNEL_REQUEST`: UInt = 590692u;
public const val `FSCTL_SVHDX_SET_INITIATOR_INFORMATION`: UInt = 590600u;
public const val `FSCTL_SVHDX_SYNC_TUNNEL_REQUEST`: UInt = 590596u;
public const val `FSCTL_TXFS_CREATE_MINIVERSION`: UInt = 622972u;
public const val `FSCTL_TXFS_CREATE_SECONDARY_RM`: UInt = 622952u;
public const val `FSCTL_TXFS_GET_METADATA_INFO`: UInt = 606572u;
public const val `FSCTL_TXFS_GET_TRANSACTED_VERSION`: UInt = 606576u;
public const val `FSCTL_TXFS_LIST_TRANSACTIONS`: UInt = 606692u;
public const val `FSCTL_TXFS_LIST_TRANSACTION_LOCKED_FILES`: UInt = 606688u;
public const val `FSCTL_TXFS_MODIFY_RM`: UInt = 622916u;
public const val `FSCTL_TXFS_QUERY_RM_INFORMATION`: UInt = 606536u;
public const val `FSCTL_TXFS_READ_BACKUP_INFORMATION`: UInt = 606560u;
public const val `FSCTL_TXFS_READ_BACKUP_INFORMATION2`: UInt = 590328u;
public const val `FSCTL_TXFS_ROLLFORWARD_REDO`: UInt = 622928u;
public const val `FSCTL_TXFS_ROLLFORWARD_UNDO`: UInt = 622932u;
public const val `FSCTL_TXFS_SAVEPOINT_INFORMATION`: UInt = 622968u;
public const val `FSCTL_TXFS_SHUTDOWN_RM`: UInt = 622940u;
public const val `FSCTL_TXFS_START_RM`: UInt = 622936u;
public const val `FSCTL_TXFS_TRANSACTION_ACTIVE`: UInt = 606604u;
public const val `FSCTL_TXFS_WRITE_BACKUP_INFORMATION`: UInt = 622948u;
public const val `FSCTL_TXFS_WRITE_BACKUP_INFORMATION2`: UInt = 590336u;
public const val `FSCTL_UNLOCK_VOLUME`: UInt = 589852u;
public const val `FSCTL_UNMAP_SPACE`: UInt = 590772u;
public const val `FSCTL_UPDATE_OVERLAY`: UInt = 623416u;
public const val `FSCTL_UPGRADE_VOLUME`: UInt = 590980u;
public const val `FSCTL_USN_TRACK_MODIFIED_RANGES`: UInt = 590580u;
public const val `FSCTL_VIRTUAL_STORAGE_PASSTHROUGH`: UInt = 590884u;
public const val `FSCTL_VIRTUAL_STORAGE_QUERY_PROPERTY`: UInt = 590728u;
public const val `FSCTL_VIRTUAL_STORAGE_SET_BEHAVIOR`: UInt = 590856u;
public const val `FSCTL_WAIT_FOR_REPAIR`: UInt = 590240u;
public const val `FSCTL_WRITE_RAW_ENCRYPTED`: UInt = 590047u;
public const val `FSCTL_WRITE_USN_CLOSE_RECORD`: UInt = 590063u;
public const val `FSCTL_WRITE_USN_REASON`: UInt = 590544u;
public typealias `FS_BPIO_INFLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FS_BPIO_INFO` (
    public var `ActiveBypassIoCount`: UInt,
    public var `StorageDriverNameLen`: UShort,
    public var `StorageDriverName`: UShortArray,
)
// UNSUPPORTED Rust 2720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FS_BPIO_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FS_BPIO_INPUT` (
    public var `Operation`: `FS_BPIO_OPERATIONS`,
    public var `InFlags`: `FS_BPIO_INFLAGS`,
    public var `Reserved1`: ULong,
    public var `Reserved2`: ULong,
)
public typealias `FS_BPIO_OPERATIONS` = Int;
public const val `FS_BPIO_OP_DISABLE`: `FS_BPIO_OPERATIONS` = 2;
public const val `FS_BPIO_OP_ENABLE`: `FS_BPIO_OPERATIONS` = 1;
public const val `FS_BPIO_OP_GET_INFO`: `FS_BPIO_OPERATIONS` = 8;
public const val `FS_BPIO_OP_MAX_OPERATION`: `FS_BPIO_OPERATIONS` = 9;
public const val `FS_BPIO_OP_QUERY`: `FS_BPIO_OPERATIONS` = 3;
public const val `FS_BPIO_OP_STREAM_PAUSE`: `FS_BPIO_OPERATIONS` = 6;
public const val `FS_BPIO_OP_STREAM_RESUME`: `FS_BPIO_OPERATIONS` = 7;
public const val `FS_BPIO_OP_VOLUME_STACK_PAUSE`: `FS_BPIO_OPERATIONS` = 4;
public const val `FS_BPIO_OP_VOLUME_STACK_RESUME`: `FS_BPIO_OPERATIONS` = 5;
public typealias `FS_BPIO_OUTFLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FS_BPIO_OUTPUT` (
    public var `Operation`: `FS_BPIO_OPERATIONS`,
    public var `OutFlags`: `FS_BPIO_OUTFLAGS`,
    public var `Reserved1`: ULong,
    public var `Reserved2`: ULong,
    public var `Anonymous`: `FS_BPIO_OUTPUT_0`,
)
// UNSUPPORTED Rust 2753:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FS_BPIO_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2758:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FS_BPIO_OUTPUT_0 {
//     pub Enable: FS_BPIO_RESULTS,
//     pub Query: FS_BPIO_RESULTS,
//     pub VolumeStackResume: FS_BPIO_RESULTS,
//     pub StreamResume: FS_BPIO_RESULTS,
//     pub GetInfo: FS_BPIO_INFO,
// }

// UNSUPPORTED Rust 2767:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FS_BPIO_OUTPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FS_BPIO_RESULTS` (
    public var `OpStatus`: UInt,
    public var `FailingDriverNameLen`: UShort,
    public var `FailingDriverName`: UShortArray,
    public var `FailureReasonLen`: UShort,
    public var `FailureReason`: UShortArray,
)
// UNSUPPORTED Rust 2781:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FS_BPIO_RESULTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FW_ISSUEID_NO_ISSUE`: UInt = 0u;
public const val `FW_ISSUEID_UNKNOWN`: UInt = 4294967295u;
public const val `FileSnapStateInactive`: `DUPLICATE_EXTENTS_STATE` = 0;
public const val `FileSnapStateSource`: `DUPLICATE_EXTENTS_STATE` = 1;
public const val `FileSnapStateTarget`: `DUPLICATE_EXTENTS_STATE` = 2;
public const val `FileStorageTierClassCapacity`: `FILE_STORAGE_TIER_CLASS` = 1;
public const val `FileStorageTierClassMax`: `FILE_STORAGE_TIER_CLASS` = 3;
public const val `FileStorageTierClassPerformance`: `FILE_STORAGE_TIER_CLASS` = 2;
public const val `FileStorageTierClassUnspecified`: `FILE_STORAGE_TIER_CLASS` = 0;
public const val `FileStorageTierMediaTypeDisk`: `FILE_STORAGE_TIER_MEDIA_TYPE` = 1;
public const val `FileStorageTierMediaTypeMax`: `FILE_STORAGE_TIER_MEDIA_TYPE` = 5;
public const val `FileStorageTierMediaTypeScm`: `FILE_STORAGE_TIER_MEDIA_TYPE` = 4;
public const val `FileStorageTierMediaTypeSsd`: `FILE_STORAGE_TIER_MEDIA_TYPE` = 2;
public const val `FileStorageTierMediaTypeUnspecified`: `FILE_STORAGE_TIER_MEDIA_TYPE` = 0;
public const val `FixedMedia`: `MEDIA_TYPE` = 12;
public const val `FormFactor1_8`: `STORAGE_DEVICE_FORM_FACTOR` = 3;
public const val `FormFactor1_8Less`: `STORAGE_DEVICE_FORM_FACTOR` = 4;
public const val `FormFactor2_5`: `STORAGE_DEVICE_FORM_FACTOR` = 2;
public const val `FormFactor3_5`: `STORAGE_DEVICE_FORM_FACTOR` = 1;
public const val `FormFactorDimm`: `STORAGE_DEVICE_FORM_FACTOR` = 10;
public const val `FormFactorEmbedded`: `STORAGE_DEVICE_FORM_FACTOR` = 5;
public const val `FormFactorM_2`: `STORAGE_DEVICE_FORM_FACTOR` = 8;
public const val `FormFactorMemoryCard`: `STORAGE_DEVICE_FORM_FACTOR` = 6;
public const val `FormFactorPCIeBoard`: `STORAGE_DEVICE_FORM_FACTOR` = 9;
public const val `FormFactorUnknown`: `STORAGE_DEVICE_FORM_FACTOR` = 0;
public const val `FormFactormSata`: `STORAGE_DEVICE_FORM_FACTOR` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GETVERSIONINPARAMS` (
    public var `bVersion`: UByte,
    public var `bRevision`: UByte,
    public var `bReserved`: UByte,
    public var `bIDEDeviceMap`: UByte,
    public var `fCapabilities`: UInt,
    public var `dwReserved`: UIntArray,
)
// UNSUPPORTED Rust 2822:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GETVERSIONINPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GET_CHANGER_PARAMETERS` (
    public var `Size`: UInt,
    public var `NumberTransportElements`: UShort,
    public var `NumberStorageElements`: UShort,
    public var `NumberCleanerSlots`: UShort,
    public var `NumberIEElements`: UShort,
    public var `NumberDataTransferElements`: UShort,
    public var `NumberOfDoors`: UShort,
    public var `FirstSlotNumber`: UShort,
    public var `FirstDriveNumber`: UShort,
    public var `FirstTransportNumber`: UShort,
    public var `FirstIEPortNumber`: UShort,
    public var `FirstCleanerSlotAddress`: UShort,
    public var `MagazineSize`: UShort,
    public var `DriveCleanTimeout`: UInt,
    public var `Features0`: `CHANGER_FEATURES`,
    public var `Features1`: `GET_CHANGER_PARAMETERS_FEATURES1`,
    public var `MoveFromTransport`: UByte,
    public var `MoveFromSlot`: UByte,
    public var `MoveFromIePort`: UByte,
    public var `MoveFromDrive`: UByte,
    public var `ExchangeFromTransport`: UByte,
    public var `ExchangeFromSlot`: UByte,
    public var `ExchangeFromIePort`: UByte,
    public var `ExchangeFromDrive`: UByte,
    public var `LockUnlockCapabilities`: UByte,
    public var `PositionCapabilities`: UByte,
    public var `Reserved1`: UByteArray,
    public var `Reserved2`: UIntArray,
)
// UNSUPPORTED Rust 2859:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GET_CHANGER_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `GET_CHANGER_PARAMETERS_FEATURES1` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GET_DEVICE_INTERNAL_STATUS_DATA_REQUEST` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `RequestDataType`: `DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE`,
    public var `RequestDataSet`: `DEVICE_INTERNAL_STATUS_DATA_SET`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GET_DISK_ATTRIBUTES` (
    public var `Version`: UInt,
    public var `Reserved1`: UInt,
    public var `Attributes`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GET_FILTER_FILE_IDENTIFIER_INPUT` (
    public var `AltitudeLength`: UShort,
    public var `Altitude`: UShortArray,
)
// UNSUPPORTED Rust 2886:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GET_FILTER_FILE_IDENTIFIER_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GET_FILTER_FILE_IDENTIFIER_OUTPUT` (
    public var `FilterFileIdentifierLength`: UShort,
    public var `FilterFileIdentifier`: UByteArray,
)
// UNSUPPORTED Rust 2897:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GET_FILTER_FILE_IDENTIFIER_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GET_LENGTH_INFORMATION` (
    public var `Length`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GET_MEDIA_TYPES` (
    public var `DeviceType`: UInt,
    public var `MediaInfoCount`: UInt,
    public var `MediaInfo`: Array<`DEVICE_MEDIA_INFO`>,
)
// UNSUPPORTED Rust 2915:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for GET_MEDIA_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GET_VOLUME_BITMAP_FLAG_MASK_METADATA`: UInt = 1u;
public typealias `GPT_ATTRIBUTES` = ULong;
public const val `GPT_ATTRIBUTE_LEGACY_BIOS_BOOTABLE`: ULong = 4uL;
public const val `GPT_ATTRIBUTE_NO_BLOCK_IO_PROTOCOL`: ULong = 2uL;
public const val `GPT_ATTRIBUTE_PLATFORM_REQUIRED`: `GPT_ATTRIBUTES` = 1uL;
public const val `GPT_BASIC_DATA_ATTRIBUTE_DAX`: ULong = 288230376151711744uL;
public const val `GPT_BASIC_DATA_ATTRIBUTE_HIDDEN`: `GPT_ATTRIBUTES` = 4611686018427387904uL;
public const val `GPT_BASIC_DATA_ATTRIBUTE_NO_DRIVE_LETTER`: `GPT_ATTRIBUTES` = 9223372036854775808uL;
public const val `GPT_BASIC_DATA_ATTRIBUTE_OFFLINE`: ULong = 576460752303423488uL;
public const val `GPT_BASIC_DATA_ATTRIBUTE_READ_ONLY`: `GPT_ATTRIBUTES` = 1152921504606846976uL;
public const val `GPT_BASIC_DATA_ATTRIBUTE_SERVICE`: ULong = 144115188075855872uL;
public const val `GPT_BASIC_DATA_ATTRIBUTE_SHADOW_COPY`: `GPT_ATTRIBUTES` = 2305843009213693952uL;
public const val `GPT_SPACES_ATTRIBUTE_NO_METADATA`: ULong = 9223372036854775808uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GP_LOG_PAGE_DESCRIPTOR` (
    public var `LogAddress`: UShort,
    public var `LogSectors`: UShort,
)
// UNSUPPORTED Rust 2940:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVICEDUMP_DRIVER_STORAGE_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda82441d_7142_4bc1_b844_0807c5a4b67f);

// UNSUPPORTED Rust 2941:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVICEDUMP_STORAGE_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd8e2592f_1aab_4d56_a746_1f7585df40f4);

// UNSUPPORTED Rust 2942:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_CDCHANGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f56312_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2943:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_CDROM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f56308_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2944:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_COMPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x86e0d1e0_8089_11d0_9ce4_08003e301f73);

// UNSUPPORTED Rust 2945:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_DISK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f56307_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2946:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_FLOPPY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f56311_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2947:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_HIDDEN_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f108a28_9833_4b3b_b780_2c6b5fa5c062);

// UNSUPPORTED Rust 2948:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_MEDIUMCHANGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f56310_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2949:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_PARTITION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f5630a_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2950:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_SCM_PHYSICAL_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4283609d_4dc2_43be_bbb4_4f15dfce2c61);

// UNSUPPORTED Rust 2951:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_SERENUM_BUS_ENUMERATOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e978_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2952:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_SERVICE_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ead3d82_25ec_46bc_b7fd_c1f0df8f5037);

// UNSUPPORTED Rust 2953:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_SES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1790c9ec_47d5_4df3_b5af_9adf3cf23e48);

// UNSUPPORTED Rust 2954:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_STORAGEPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2accfe60_c130_11d2_b082_00a0c91efb8b);

// UNSUPPORTED Rust 2955:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_TAPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f5630b_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2956:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_UNIFIED_ACCESS_RPMB: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27447c21_bcc3_4d07_a05b_a3395bb4eee7);

// UNSUPPORTED Rust 2957:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_VMLUN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f416619_9f29_42a5_b20b_37e219ca02b0);

// UNSUPPORTED Rust 2958:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f5630d_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2959:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_WRITEONCEDISK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53f5630c_b6bf_11d0_94f2_00a0c91efb8b);

// UNSUPPORTED Rust 2960:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_ZNSDISK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb87941c5_ffdb_43c7_b6b1_20b632f0b109);

// UNSUPPORTED Rust 2961:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SCM_PD_HEALTH_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9da2d386_72f5_4ee3_8155_eca0678e3b06);

// UNSUPPORTED Rust 2962:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_SCM_PD_PASSTHROUGH_INVDIMM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4309ac30_0d11_11e4_9191_0800200c9a66);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HISTOGRAM_BUCKET` (
    public var `Reads`: UInt,
    public var `Writes`: UInt,
)
public const val `HIST_NO_OF_BUCKETS`: UInt = 24u;
public const val `HITACHI_12_WO`: `STORAGE_MEDIA_TYPE` = 68;
public const val `HealthStatusDisabled`: `STORAGE_COMPONENT_HEALTH_STATUS` = 4;
public const val `HealthStatusFailed`: `STORAGE_COMPONENT_HEALTH_STATUS` = 5;
public const val `HealthStatusNormal`: `STORAGE_COMPONENT_HEALTH_STATUS` = 1;
public const val `HealthStatusThrottled`: `STORAGE_COMPONENT_HEALTH_STATUS` = 2;
public const val `HealthStatusUnknown`: `STORAGE_COMPONENT_HEALTH_STATUS` = 0;
public const val `HealthStatusWarning`: `STORAGE_COMPONENT_HEALTH_STATUS` = 3;
public const val `IBM_3480`: `STORAGE_MEDIA_TYPE` = 41;
public const val `IBM_3490E`: `STORAGE_MEDIA_TYPE` = 42;
public const val `IBM_Magstar_3590`: `STORAGE_MEDIA_TYPE` = 43;
public const val `IBM_Magstar_MP`: `STORAGE_MEDIA_TYPE` = 44;
public const val `IDENTIFY_BUFFER_SIZE`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IDEREGS` (
    public var `bFeaturesReg`: UByte,
    public var `bSectorCountReg`: UByte,
    public var `bSectorNumberReg`: UByte,
    public var `bCylLowReg`: UByte,
    public var `bCylHighReg`: UByte,
    public var `bDriveHeadReg`: UByte,
    public var `bCommandReg`: UByte,
    public var `bReserved`: UByte,
)
public const val `ID_CMD`: UInt = 236u;
public const val `IOCTL_CHANGER_BASE`: UInt = 48u;
public const val `IOCTL_CHANGER_EXCHANGE_MEDIUM`: UInt = 3162144u;
public const val `IOCTL_CHANGER_GET_ELEMENT_STATUS`: UInt = 3194900u;
public const val `IOCTL_CHANGER_GET_PARAMETERS`: UInt = 3162112u;
public const val `IOCTL_CHANGER_GET_PRODUCT_DATA`: UInt = 3162120u;
public const val `IOCTL_CHANGER_GET_STATUS`: UInt = 3162116u;
public const val `IOCTL_CHANGER_INITIALIZE_ELEMENT_STATUS`: UInt = 3162136u;
public const val `IOCTL_CHANGER_MOVE_MEDIUM`: UInt = 3162148u;
public const val `IOCTL_CHANGER_QUERY_VOLUME_TAGS`: UInt = 3194924u;
public const val `IOCTL_CHANGER_REINITIALIZE_TRANSPORT`: UInt = 3162152u;
public const val `IOCTL_CHANGER_SET_ACCESS`: UInt = 3194896u;
public const val `IOCTL_CHANGER_SET_POSITION`: UInt = 3162140u;
public const val `IOCTL_DISK_BASE`: UInt = 7u;
public const val `IOCTL_DISK_CHECK_VERIFY`: UInt = 477184u;
public const val `IOCTL_DISK_CONTROLLER_NUMBER`: UInt = 458820u;
public const val `IOCTL_DISK_CREATE_DISK`: UInt = 507992u;
public const val `IOCTL_DISK_DELETE_DRIVE_LAYOUT`: UInt = 508160u;
public const val `IOCTL_DISK_EJECT_MEDIA`: UInt = 477192u;
public const val `IOCTL_DISK_FIND_NEW_DEVICES`: UInt = 477208u;
public const val `IOCTL_DISK_FORMAT_DRIVE`: UInt = 508876u;
public const val `IOCTL_DISK_FORMAT_TRACKS`: UInt = 507928u;
public const val `IOCTL_DISK_FORMAT_TRACKS_EX`: UInt = 507948u;
public const val `IOCTL_DISK_GET_CACHE_INFORMATION`: UInt = 475348u;
public const val `IOCTL_DISK_GET_DISK_ATTRIBUTES`: UInt = 458992u;
public const val `IOCTL_DISK_GET_DRIVE_GEOMETRY`: UInt = 458752u;
public const val `IOCTL_DISK_GET_DRIVE_GEOMETRY_EX`: UInt = 458912u;
public const val `IOCTL_DISK_GET_DRIVE_LAYOUT`: UInt = 475148u;
public const val `IOCTL_DISK_GET_DRIVE_LAYOUT_EX`: UInt = 458832u;
public const val `IOCTL_DISK_GET_LENGTH_INFO`: UInt = 475228u;
public const val `IOCTL_DISK_GET_MEDIA_TYPES`: UInt = 461824u;
public const val `IOCTL_DISK_GET_PARTITION_INFO`: UInt = 475140u;
public const val `IOCTL_DISK_GET_PARTITION_INFO_EX`: UInt = 458824u;
public const val `IOCTL_DISK_GET_WRITE_CACHE_STATE`: UInt = 475356u;
public const val `IOCTL_DISK_GROW_PARTITION`: UInt = 508112u;
public const val `IOCTL_DISK_HISTOGRAM_DATA`: UInt = 458804u;
public const val `IOCTL_DISK_HISTOGRAM_RESET`: UInt = 458808u;
public const val `IOCTL_DISK_HISTOGRAM_STRUCTURE`: UInt = 458800u;
public const val `IOCTL_DISK_IS_WRITABLE`: UInt = 458788u;
public const val `IOCTL_DISK_LOAD_MEDIA`: UInt = 477196u;
public const val `IOCTL_DISK_LOGGING`: UInt = 458792u;
public const val `IOCTL_DISK_MEDIA_REMOVAL`: UInt = 477188u;
public const val `IOCTL_DISK_PERFORMANCE`: UInt = 458784u;
public const val `IOCTL_DISK_PERFORMANCE_OFF`: UInt = 458848u;
public const val `IOCTL_DISK_REASSIGN_BLOCKS`: UInt = 507932u;
public const val `IOCTL_DISK_REASSIGN_BLOCKS_EX`: UInt = 508068u;
public const val `IOCTL_DISK_RELEASE`: UInt = 477204u;
public const val `IOCTL_DISK_REQUEST_DATA`: UInt = 458816u;
public const val `IOCTL_DISK_REQUEST_STRUCTURE`: UInt = 458812u;
public const val `IOCTL_DISK_RESERVE`: UInt = 477200u;
public const val `IOCTL_DISK_RESET_SNAPSHOT_INFO`: UInt = 508432u;
public const val `IOCTL_DISK_SENSE_DEVICE`: UInt = 459744u;
public const val `IOCTL_DISK_SET_CACHE_INFORMATION`: UInt = 508120u;
public const val `IOCTL_DISK_SET_DISK_ATTRIBUTES`: UInt = 508148u;
public const val `IOCTL_DISK_SET_DRIVE_LAYOUT`: UInt = 507920u;
public const val `IOCTL_DISK_SET_DRIVE_LAYOUT_EX`: UInt = 507988u;
public const val `IOCTL_DISK_SET_PARTITION_INFO`: UInt = 507912u;
public const val `IOCTL_DISK_SET_PARTITION_INFO_EX`: UInt = 507980u;
public const val `IOCTL_DISK_UPDATE_DRIVE_SIZE`: UInt = 508104u;
public const val `IOCTL_DISK_UPDATE_PROPERTIES`: UInt = 459072u;
public const val `IOCTL_DISK_VERIFY`: UInt = 458772u;
public const val `IOCTL_SCMBUS_BASE`: UInt = 89u;
public const val `IOCTL_SCMBUS_DEVICE_FUNCTION_BASE`: UInt = 0u;
public const val `IOCTL_SCM_BUS_GET_LOGICAL_DEVICES`: UInt = 5832704u;
public const val `IOCTL_SCM_BUS_GET_PHYSICAL_DEVICES`: UInt = 5832708u;
public const val `IOCTL_SCM_BUS_GET_REGIONS`: UInt = 5832712u;
public const val `IOCTL_SCM_BUS_QUERY_PROPERTY`: UInt = 5832716u;
public const val `IOCTL_SCM_BUS_REFRESH_NAMESPACE`: UInt = 5832728u;
public const val `IOCTL_SCM_BUS_RUNTIME_FW_ACTIVATE`: UInt = 5865488u;
public const val `IOCTL_SCM_BUS_SET_PROPERTY`: UInt = 5865492u;
public const val `IOCTL_SCM_LD_GET_INTERLEAVE_SET`: UInt = 5835776u;
public const val `IOCTL_SCM_LOGICAL_DEVICE_FUNCTION_BASE`: UInt = 768u;
public const val `IOCTL_SCM_PD_FIRMWARE_ACTIVATE`: UInt = 5871624u;
public const val `IOCTL_SCM_PD_FIRMWARE_DOWNLOAD`: UInt = 5871620u;
public const val `IOCTL_SCM_PD_PASSTHROUGH`: UInt = 5888012u;
public const val `IOCTL_SCM_PD_QUERY_PROPERTY`: UInt = 5838848u;
public const val `IOCTL_SCM_PD_REINITIALIZE_MEDIA`: UInt = 5871636u;
public const val `IOCTL_SCM_PD_SET_PROPERTY`: UInt = 5871640u;
public const val `IOCTL_SCM_PD_UPDATE_MANAGEMENT_STATUS`: UInt = 5838864u;
public const val `IOCTL_SCM_PHYSICAL_DEVICE_FUNCTION_BASE`: UInt = 1536u;
public const val `IOCTL_SERENUM_EXPOSE_HARDWARE`: UInt = 3604992u;
public const val `IOCTL_SERENUM_GET_PORT_NAME`: UInt = 3605004u;
public const val `IOCTL_SERENUM_PORT_DESC`: UInt = 3605000u;
public const val `IOCTL_SERENUM_REMOVE_HARDWARE`: UInt = 3604996u;
public const val `IOCTL_SERIAL_LSRMST_INSERT`: UInt = 1769596u;
public const val `IOCTL_STORAGE_ALLOCATE_BC_STREAM`: UInt = 3004420u;
public const val `IOCTL_STORAGE_ATTRIBUTE_MANAGEMENT`: UInt = 3005596u;
public const val `IOCTL_STORAGE_BASE`: UInt = 45u;
public const val `IOCTL_STORAGE_BC_VERSION`: UInt = 1u;
public const val `IOCTL_STORAGE_BREAK_RESERVATION`: UInt = 2969620u;
public const val `IOCTL_STORAGE_CHECK_PRIORITY_HINT_SUPPORT`: UInt = 2955392u;
public const val `IOCTL_STORAGE_CHECK_VERIFY`: UInt = 2967552u;
public const val `IOCTL_STORAGE_CHECK_VERIFY2`: UInt = 2951168u;
public const val `IOCTL_STORAGE_DEVICE_POWER_CAP`: UInt = 2956436u;
public const val `IOCTL_STORAGE_DEVICE_TELEMETRY_NOTIFY`: UInt = 3002820u;
public const val `IOCTL_STORAGE_DEVICE_TELEMETRY_QUERY_CAPS`: UInt = 3002824u;
public const val `IOCTL_STORAGE_DIAGNOSTIC`: UInt = 2956448u;
public const val `IOCTL_STORAGE_EJECTION_CONTROL`: UInt = 2951488u;
public const val `IOCTL_STORAGE_EJECT_MEDIA`: UInt = 2967560u;
public const val `IOCTL_STORAGE_ENABLE_IDLE_POWER`: UInt = 2956416u;
public const val `IOCTL_STORAGE_EVENT_NOTIFICATION`: UInt = 2956432u;
public const val `IOCTL_STORAGE_FAILURE_PREDICTION_CONFIG`: UInt = 2953476u;
public const val `IOCTL_STORAGE_FIND_NEW_DEVICES`: UInt = 2967576u;
public const val `IOCTL_STORAGE_FIRMWARE_ACTIVATE`: UInt = 3005448u;
public const val `IOCTL_STORAGE_FIRMWARE_DOWNLOAD`: UInt = 3005444u;
public const val `IOCTL_STORAGE_FIRMWARE_GET_INFO`: UInt = 2956288u;
public const val `IOCTL_STORAGE_FREE_BC_STREAM`: UInt = 3004424u;
public const val `IOCTL_STORAGE_GET_BC_PROPERTIES`: UInt = 2971648u;
public const val `IOCTL_STORAGE_GET_COUNTERS`: UInt = 2953480u;
public const val `IOCTL_STORAGE_GET_DEVICE_INTERNAL_LOG`: UInt = 2956484u;
public const val `IOCTL_STORAGE_GET_DEVICE_NUMBER`: UInt = 2953344u;
public const val `IOCTL_STORAGE_GET_DEVICE_NUMBER_EX`: UInt = 2953348u;
public const val `IOCTL_STORAGE_GET_DEVICE_TELEMETRY`: UInt = 3002816u;
public const val `IOCTL_STORAGE_GET_DEVICE_TELEMETRY_RAW`: UInt = 3002828u;
public const val `IOCTL_STORAGE_GET_HOTPLUG_INFO`: UInt = 2952212u;
public const val `IOCTL_STORAGE_GET_IDLE_POWERUP_REASON`: UInt = 2956420u;
public const val `IOCTL_STORAGE_GET_LB_PROVISIONING_MAP_RESOURCES`: UInt = 2970632u;
public const val `IOCTL_STORAGE_GET_MEDIA_SERIAL_NUMBER`: UInt = 2952208u;
public const val `IOCTL_STORAGE_GET_MEDIA_TYPES`: UInt = 2952192u;
public const val `IOCTL_STORAGE_GET_MEDIA_TYPES_EX`: UInt = 2952196u;
public const val `IOCTL_STORAGE_GET_PHYSICAL_ELEMENT_STATUS`: UInt = 2956452u;
public const val `IOCTL_STORAGE_LOAD_MEDIA`: UInt = 2967564u;
public const val `IOCTL_STORAGE_LOAD_MEDIA2`: UInt = 2951180u;
public const val `IOCTL_STORAGE_MANAGE_BYPASS_IO`: UInt = 2951360u;
public const val `IOCTL_STORAGE_MANAGE_DATA_SET_ATTRIBUTES`: UInt = 2987012u;
public const val `IOCTL_STORAGE_MCN_CONTROL`: UInt = 2951492u;
public const val `IOCTL_STORAGE_MEDIA_REMOVAL`: UInt = 2967556u;
public const val `IOCTL_STORAGE_PERSISTENT_RESERVE_IN`: UInt = 2969624u;
public const val `IOCTL_STORAGE_PERSISTENT_RESERVE_OUT`: UInt = 3002396u;
public const val `IOCTL_STORAGE_POWER_ACTIVE`: UInt = 2956424u;
public const val `IOCTL_STORAGE_POWER_IDLE`: UInt = 2956428u;
public const val `IOCTL_STORAGE_PREDICT_FAILURE`: UInt = 2953472u;
public const val `IOCTL_STORAGE_PROTOCOL_COMMAND`: UInt = 3003328u;
public const val `IOCTL_STORAGE_QUERY_PROPERTY`: UInt = 2954240u;
public const val `IOCTL_STORAGE_READ_CAPACITY`: UInt = 2969920u;
public const val `IOCTL_STORAGE_REINITIALIZE_MEDIA`: UInt = 2987584u;
public const val `IOCTL_STORAGE_RELEASE`: UInt = 2967572u;
public const val `IOCTL_STORAGE_REMOVE_ELEMENT_AND_TRUNCATE`: UInt = 2956480u;
public const val `IOCTL_STORAGE_RESERVE`: UInt = 2967568u;
public const val `IOCTL_STORAGE_RESET_BUS`: UInt = 2969600u;
public const val `IOCTL_STORAGE_RESET_DEVICE`: UInt = 2969604u;
public const val `IOCTL_STORAGE_RPMB_COMMAND`: UInt = 2956440u;
public const val `IOCTL_STORAGE_SET_HOTPLUG_INFO`: UInt = 3001368u;
public const val `IOCTL_STORAGE_SET_PROPERTY`: UInt = 2987004u;
public const val `IOCTL_STORAGE_SET_TEMPERATURE_THRESHOLD`: UInt = 3002880u;
public const val `IOCTL_STORAGE_START_DATA_INTEGRITY_CHECK`: UInt = 3004548u;
public const val `IOCTL_STORAGE_STOP_DATA_INTEGRITY_CHECK`: UInt = 3004552u;
public const val `IOMEGA_JAZ`: `STORAGE_MEDIA_TYPE` = 74;
public const val `IOMEGA_ZIP`: `STORAGE_MEDIA_TYPE` = 73;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IO_IRP_EXT_TRACK_OFFSET_HEADER` (
    public var `Validation`: UShort,
    public var `Flags`: UShort,
    public var `TrackedOffsetCallback`: `PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK`,
)
public const val `KODAK_14_WO`: `STORAGE_MEDIA_TYPE` = 70;
public const val `KeepPrefetchedData`: `DISK_CACHE_RETENTION_PRIORITY` = 1;
public const val `KeepReadData`: `DISK_CACHE_RETENTION_PRIORITY` = 2;
public const val `LMRQuerySessionInfo`: `LMR_QUERY_INFO_CLASS` = 1;
public typealias `LMR_QUERY_INFO_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LMR_QUERY_INFO_PARAM` (
    public var `Operation`: `LMR_QUERY_INFO_CLASS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LMR_QUERY_SESSION_INFO` (
    public var `SessionId`: ULong,
)
public const val `LOCK_ELEMENT`: UInt = 0u;
public const val `LOCK_UNLOCK_DOOR`: UInt = 2u;
public const val `LOCK_UNLOCK_IEPORT`: UInt = 1u;
public const val `LOCK_UNLOCK_KEYPAD`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOOKUP_STREAM_FROM_CLUSTER_ENTRY` (
    public var `OffsetToNext`: UInt,
    public var `Flags`: UInt,
    public var `Reserved`: Long,
    public var `Cluster`: Long,
    public var `FileName`: UShortArray,
)
// UNSUPPORTED Rust 3178:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LOOKUP_STREAM_FROM_CLUSTER_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_DATA`: UInt = 16777216u;
public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_INDEX`: UInt = 33554432u;
public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_MASK`: UInt = 4278190080u;
public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_ATTRIBUTE_SYSTEM`: UInt = 50331648u;
public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_DENY_DEFRAG_SET`: UInt = 2u;
public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_FS_SYSTEM_FILE`: UInt = 4u;
public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_PAGE_FILE`: UInt = 1u;
public const val `LOOKUP_STREAM_FROM_CLUSTER_ENTRY_FLAG_TXF_SYSTEM_FILE`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOOKUP_STREAM_FROM_CLUSTER_INPUT` (
    public var `Flags`: UInt,
    public var `NumberOfClusters`: UInt,
    public var `Cluster`: LongArray,
)
// UNSUPPORTED Rust 3198:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LOOKUP_STREAM_FROM_CLUSTER_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LOOKUP_STREAM_FROM_CLUSTER_OUTPUT` (
    public var `Offset`: UInt,
    public var `NumberOfMatches`: UInt,
    public var `BufferSizeRequired`: UInt,
)
public const val `LTO_Accelis`: `STORAGE_MEDIA_TYPE` = 87;
public const val `LTO_Ultrium`: `STORAGE_MEDIA_TYPE` = 86;
public const val `MARK_HANDLE_CLOUD_SYNC`: UInt = 2048u;
public const val `MARK_HANDLE_DISABLE_FILE_METADATA_OPTIMIZATION`: UInt = 4096u;
public const val `MARK_HANDLE_ENABLE_CPU_CACHE`: UInt = 268435456u;
public const val `MARK_HANDLE_ENABLE_USN_SOURCE_ON_PAGING_IO`: UInt = 8192u;
public const val `MARK_HANDLE_FILTER_METADATA`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MARK_HANDLE_INFO` (
    public var `Anonymous`: `MARK_HANDLE_INFO_0`,
    public var `VolumeHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `HandleInfo`: UInt,
)
// UNSUPPORTED Rust 3224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MARK_HANDLE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3229:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MARK_HANDLE_INFO_0 {
//     pub UsnSourceInfo: u32,
//     pub CopyNumber: u32,
// }

// UNSUPPORTED Rust 3235:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MARK_HANDLE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MARK_HANDLE_INFO32` (
    public var `Anonymous`: `MARK_HANDLE_INFO32_0`,
    public var `VolumeHandle`: UInt,
    public var `HandleInfo`: UInt,
)
// UNSUPPORTED Rust 3248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MARK_HANDLE_INFO32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3254:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union MARK_HANDLE_INFO32_0 {
//     pub UsnSourceInfo: u32,
//     pub CopyNumber: u32,
// }

// UNSUPPORTED Rust 3261:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MARK_HANDLE_INFO32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MARK_HANDLE_NOT_READ_COPY`: UInt = 256u;
public const val `MARK_HANDLE_NOT_REALTIME`: UInt = 64u;
public const val `MARK_HANDLE_NOT_TXF_SYSTEM_LOG`: UInt = 8u;
public const val `MARK_HANDLE_PROTECT_CLUSTERS`: UInt = 1u;
public const val `MARK_HANDLE_READ_COPY`: UInt = 128u;
public const val `MARK_HANDLE_REALTIME`: UInt = 32u;
public const val `MARK_HANDLE_RETURN_PURGE_FAILURE`: UInt = 1024u;
public const val `MARK_HANDLE_SKIP_COHERENCY_SYNC_DISALLOW_WRITES`: UInt = 16384u;
public const val `MARK_HANDLE_SUPPRESS_VOLUME_OPEN_FLUSH`: UInt = 32768u;
public const val `MARK_HANDLE_TXF_SYSTEM_LOG`: UInt = 4u;
public const val `MAXIMUM_ENCRYPTION_VALUE`: UInt = 4u;
public const val `MAX_FW_BUCKET_ID_LENGTH`: UInt = 132u;
public const val `MAX_INTERFACE_CODES`: UInt = 8u;
public const val `MAX_VOLUME_ID_SIZE`: UInt = 36u;
public const val `MAX_VOLUME_TEMPLATE_SIZE`: UInt = 40u;
public const val `MEDIA_CURRENTLY_MOUNTED`: UInt = 2147483648u;
public const val `MEDIA_ERASEABLE`: UInt = 1u;
public const val `MEDIA_READ_ONLY`: UInt = 4u;
public const val `MEDIA_READ_WRITE`: UInt = 8u;
public typealias `MEDIA_TYPE` = Int;
public const val `MEDIA_WRITE_ONCE`: UInt = 2u;
public const val `MEDIA_WRITE_PROTECTED`: UInt = 256u;
public const val `METHOD_BUFFERED`: UInt = 0u;
public const val `METHOD_DIRECT_FROM_HARDWARE`: UInt = 2u;
public const val `METHOD_DIRECT_TO_HARDWARE`: UInt = 1u;
public const val `METHOD_IN_DIRECT`: UInt = 1u;
public const val `METHOD_NEITHER`: UInt = 3u;
public const val `METHOD_OUT_DIRECT`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MFT_ENUM_DATA_V0` (
    public var `StartFileReferenceNumber`: ULong,
    public var `LowUsn`: Long,
    public var `HighUsn`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MFT_ENUM_DATA_V1` (
    public var `StartFileReferenceNumber`: ULong,
    public var `LowUsn`: Long,
    public var `HighUsn`: Long,
    public var `MinMajorVersion`: UShort,
    public var `MaxMajorVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MOVE_FILE_DATA` (
    public var `FileHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `StartingVcn`: Long,
    public var `StartingLcn`: Long,
    public var `ClusterCount`: UInt,
)
// UNSUPPORTED Rust 3319:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MOVE_FILE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOVE_FILE_DATA32` (
    public var `FileHandle`: UInt,
    public var `StartingVcn`: Long,
    public var `StartingLcn`: Long,
    public var `ClusterCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MOVE_FILE_RECORD_DATA` (
    public var `FileHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `SourceFileRecord`: Long,
    public var `TargetFileRecord`: Long,
)
// UNSUPPORTED Rust 3340:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MOVE_FILE_RECORD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MO_3_RW`: `STORAGE_MEDIA_TYPE` = 57;
public const val `MO_5_LIMDOW`: `STORAGE_MEDIA_TYPE` = 60;
public const val `MO_5_RW`: `STORAGE_MEDIA_TYPE` = 59;
public const val `MO_5_WO`: `STORAGE_MEDIA_TYPE` = 58;
public const val `MO_NFR_525`: `STORAGE_MEDIA_TYPE` = 71;
public const val `MP2_8mm`: `STORAGE_MEDIA_TYPE` = 79;
public const val `MP_8mm`: `STORAGE_MEDIA_TYPE` = 36;
public const val `MiniQic`: `STORAGE_MEDIA_TYPE` = 33;
public const val `NCTP`: `STORAGE_MEDIA_TYPE` = 40;
public const val `NIKON_12_RW`: `STORAGE_MEDIA_TYPE` = 72;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_EXTENDED_VOLUME_DATA` (
    public var `ByteCount`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `BytesPerPhysicalSector`: UInt,
    public var `LfsMajorVersion`: UShort,
    public var `LfsMinorVersion`: UShort,
    public var `MaxDeviceTrimExtentCount`: UInt,
    public var `MaxDeviceTrimByteCount`: UInt,
    public var `MaxVolumeTrimExtentCount`: UInt,
    public var `MaxVolumeTrimByteCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_FILE_RECORD_INPUT_BUFFER` (
    public var `FileReferenceNumber`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NTFS_FILE_RECORD_OUTPUT_BUFFER` (
    public var `FileReferenceNumber`: Long,
    public var `FileRecordLength`: UInt,
    public var `FileRecordBuffer`: UByteArray,
)
// UNSUPPORTED Rust 3381:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTFS_FILE_RECORD_OUTPUT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS` (
    public var `LogFileFullExceptions`: UInt,
    public var `OtherExceptions`: UInt,
    public var `MftReads`: UInt,
    public var `MftReadBytes`: UInt,
    public var `MftWrites`: UInt,
    public var `MftWriteBytes`: UInt,
    public var `MftWritesUserLevel`: `NTFS_STATISTICS_0`,
    public var `MftWritesFlushForLogFileFull`: UShort,
    public var `MftWritesLazyWriter`: UShort,
    public var `MftWritesUserRequest`: UShort,
    public var `Mft2Writes`: UInt,
    public var `Mft2WriteBytes`: UInt,
    public var `Mft2WritesUserLevel`: `NTFS_STATISTICS_1`,
    public var `Mft2WritesFlushForLogFileFull`: UShort,
    public var `Mft2WritesLazyWriter`: UShort,
    public var `Mft2WritesUserRequest`: UShort,
    public var `RootIndexReads`: UInt,
    public var `RootIndexReadBytes`: UInt,
    public var `RootIndexWrites`: UInt,
    public var `RootIndexWriteBytes`: UInt,
    public var `BitmapReads`: UInt,
    public var `BitmapReadBytes`: UInt,
    public var `BitmapWrites`: UInt,
    public var `BitmapWriteBytes`: UInt,
    public var `BitmapWritesFlushForLogFileFull`: UShort,
    public var `BitmapWritesLazyWriter`: UShort,
    public var `BitmapWritesUserRequest`: UShort,
    public var `BitmapWritesUserLevel`: `NTFS_STATISTICS_2`,
    public var `MftBitmapReads`: UInt,
    public var `MftBitmapReadBytes`: UInt,
    public var `MftBitmapWrites`: UInt,
    public var `MftBitmapWriteBytes`: UInt,
    public var `MftBitmapWritesFlushForLogFileFull`: UShort,
    public var `MftBitmapWritesLazyWriter`: UShort,
    public var `MftBitmapWritesUserRequest`: UShort,
    public var `MftBitmapWritesUserLevel`: `NTFS_STATISTICS_3`,
    public var `UserIndexReads`: UInt,
    public var `UserIndexReadBytes`: UInt,
    public var `UserIndexWrites`: UInt,
    public var `UserIndexWriteBytes`: UInt,
    public var `LogFileReads`: UInt,
    public var `LogFileReadBytes`: UInt,
    public var `LogFileWrites`: UInt,
    public var `LogFileWriteBytes`: UInt,
    public var `Allocate`: `NTFS_STATISTICS_4`,
    public var `DiskResourcesExhausted`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_4` (
    public var `Calls`: UInt,
    public var `Clusters`: UInt,
    public var `Hints`: UInt,
    public var `RunsReturned`: UInt,
    public var `HintsHonored`: UInt,
    public var `HintsClusters`: UInt,
    public var `Cache`: UInt,
    public var `CacheClusters`: UInt,
    public var `CacheMiss`: UInt,
    public var `CacheMissClusters`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_2` (
    public var `Write`: UShort,
    public var `Create`: UShort,
    public var `SetInfo`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_1` (
    public var `Write`: UShort,
    public var `Create`: UShort,
    public var `SetInfo`: UShort,
    public var `Flush`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_3` (
    public var `Write`: UShort,
    public var `Create`: UShort,
    public var `SetInfo`: UShort,
    public var `Flush`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_0` (
    public var `Write`: UShort,
    public var `Create`: UShort,
    public var `SetInfo`: UShort,
    public var `Flush`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_EX` (
    public var `LogFileFullExceptions`: UInt,
    public var `OtherExceptions`: UInt,
    public var `MftReads`: ULong,
    public var `MftReadBytes`: ULong,
    public var `MftWrites`: ULong,
    public var `MftWriteBytes`: ULong,
    public var `MftWritesUserLevel`: `NTFS_STATISTICS_EX_0`,
    public var `MftWritesFlushForLogFileFull`: UInt,
    public var `MftWritesLazyWriter`: UInt,
    public var `MftWritesUserRequest`: UInt,
    public var `Mft2Writes`: ULong,
    public var `Mft2WriteBytes`: ULong,
    public var `Mft2WritesUserLevel`: `NTFS_STATISTICS_EX_1`,
    public var `Mft2WritesFlushForLogFileFull`: UInt,
    public var `Mft2WritesLazyWriter`: UInt,
    public var `Mft2WritesUserRequest`: UInt,
    public var `RootIndexReads`: ULong,
    public var `RootIndexReadBytes`: ULong,
    public var `RootIndexWrites`: ULong,
    public var `RootIndexWriteBytes`: ULong,
    public var `BitmapReads`: ULong,
    public var `BitmapReadBytes`: ULong,
    public var `BitmapWrites`: ULong,
    public var `BitmapWriteBytes`: ULong,
    public var `BitmapWritesFlushForLogFileFull`: UInt,
    public var `BitmapWritesLazyWriter`: UInt,
    public var `BitmapWritesUserRequest`: UInt,
    public var `BitmapWritesUserLevel`: `NTFS_STATISTICS_EX_2`,
    public var `MftBitmapReads`: ULong,
    public var `MftBitmapReadBytes`: ULong,
    public var `MftBitmapWrites`: ULong,
    public var `MftBitmapWriteBytes`: ULong,
    public var `MftBitmapWritesFlushForLogFileFull`: UInt,
    public var `MftBitmapWritesLazyWriter`: UInt,
    public var `MftBitmapWritesUserRequest`: UInt,
    public var `MftBitmapWritesUserLevel`: `NTFS_STATISTICS_EX_3`,
    public var `UserIndexReads`: ULong,
    public var `UserIndexReadBytes`: ULong,
    public var `UserIndexWrites`: ULong,
    public var `UserIndexWriteBytes`: ULong,
    public var `LogFileReads`: ULong,
    public var `LogFileReadBytes`: ULong,
    public var `LogFileWrites`: ULong,
    public var `LogFileWriteBytes`: ULong,
    public var `Allocate`: `NTFS_STATISTICS_EX_4`,
    public var `DiskResourcesExhausted`: UInt,
    public var `VolumeTrimCount`: ULong,
    public var `VolumeTrimTime`: ULong,
    public var `VolumeTrimByteCount`: ULong,
    public var `FileLevelTrimCount`: ULong,
    public var `FileLevelTrimTime`: ULong,
    public var `FileLevelTrimByteCount`: ULong,
    public var `VolumeTrimSkippedCount`: ULong,
    public var `VolumeTrimSkippedByteCount`: ULong,
    public var `NtfsFillStatInfoFromMftRecordCalledCount`: ULong,
    public var `NtfsFillStatInfoFromMftRecordBailedBecauseOfAttributeListCount`: ULong,
    public var `NtfsFillStatInfoFromMftRecordBailedBecauseOfNonResReparsePointCount`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_EX_4` (
    public var `Calls`: UInt,
    public var `RunsReturned`: UInt,
    public var `Hints`: UInt,
    public var `HintsHonored`: UInt,
    public var `Cache`: UInt,
    public var `CacheMiss`: UInt,
    public var `Clusters`: ULong,
    public var `HintsClusters`: ULong,
    public var `CacheClusters`: ULong,
    public var `CacheMissClusters`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_EX_2` (
    public var `Write`: UInt,
    public var `Create`: UInt,
    public var `SetInfo`: UInt,
    public var `Flush`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_EX_1` (
    public var `Write`: UInt,
    public var `Create`: UInt,
    public var `SetInfo`: UInt,
    public var `Flush`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_EX_3` (
    public var `Write`: UInt,
    public var `Create`: UInt,
    public var `SetInfo`: UInt,
    public var `Flush`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_STATISTICS_EX_0` (
    public var `Write`: UInt,
    public var `Create`: UInt,
    public var `SetInfo`: UInt,
    public var `Flush`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTFS_VOLUME_DATA_BUFFER` (
    public var `VolumeSerialNumber`: Long,
    public var `NumberSectors`: Long,
    public var `TotalClusters`: Long,
    public var `FreeClusters`: Long,
    public var `TotalReserved`: Long,
    public var `BytesPerSector`: UInt,
    public var `BytesPerCluster`: UInt,
    public var `BytesPerFileRecordSegment`: UInt,
    public var `ClustersPerFileRecordSegment`: UInt,
    public var `MftValidDataLength`: Long,
    public var `MftStartLcn`: Long,
    public var `Mft2StartLcn`: Long,
    public var `MftZoneStart`: Long,
    public var `MftZoneEnd`: Long,
)
public const val `NVMeDataTypeFeature`: `STORAGE_PROTOCOL_NVME_DATA_TYPE` = 3;
public const val `NVMeDataTypeIdentify`: `STORAGE_PROTOCOL_NVME_DATA_TYPE` = 1;
public const val `NVMeDataTypeLogPage`: `STORAGE_PROTOCOL_NVME_DATA_TYPE` = 2;
public const val `NVMeDataTypeUnknown`: `STORAGE_PROTOCOL_NVME_DATA_TYPE` = 0;
public const val `OBSOLETE_DISK_GET_WRITE_CACHE_STATE`: UInt = 475356u;
public const val `OBSOLETE_IOCTL_STORAGE_RESET_BUS`: UInt = 3002368u;
public const val `OBSOLETE_IOCTL_STORAGE_RESET_DEVICE`: UInt = 3002372u;
public const val `OFFLOAD_READ_FLAG_ALL_ZERO_BEYOND_CURRENT_RANGE`: UInt = 1u;
public const val `OPLOCK_LEVEL_CACHE_HANDLE`: UInt = 2u;
public const val `OPLOCK_LEVEL_CACHE_READ`: UInt = 1u;
public const val `OPLOCK_LEVEL_CACHE_WRITE`: UInt = 4u;
public const val `PARTIITON_OS_DATA`: UInt = 41u;
public const val `PARTITION_BSP`: UInt = 43u;
public const val `PARTITION_DM`: UInt = 84u;
public const val `PARTITION_DPP`: UInt = 44u;
public const val `PARTITION_ENTRY_UNUSED`: UInt = 0u;
public const val `PARTITION_EXTENDED`: UInt = 5u;
public const val `PARTITION_EZDRIVE`: UInt = 85u;
public const val `PARTITION_FAT32`: UInt = 11u;
public const val `PARTITION_FAT32_XINT13`: UInt = 12u;
public const val `PARTITION_FAT_12`: UInt = 1u;
public const val `PARTITION_FAT_16`: UInt = 4u;
public const val `PARTITION_GPT`: UInt = 238u;
public const val `PARTITION_HUGE`: UInt = 6u;
public const val `PARTITION_IFS`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PARTITION_INFORMATION` (
    public var `StartingOffset`: Long,
    public var `PartitionLength`: Long,
    public var `HiddenSectors`: UInt,
    public var `PartitionNumber`: UInt,
    public var `PartitionType`: UByte,
    public var `BootIndicator`: Boolean,
    public var `RecognizedPartition`: Boolean,
    public var `RewritePartition`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PARTITION_INFORMATION_EX` (
    public var `PartitionStyle`: `PARTITION_STYLE`,
    public var `StartingOffset`: Long,
    public var `PartitionLength`: Long,
    public var `PartitionNumber`: UInt,
    public var `RewritePartition`: Boolean,
    public var `IsServicePartition`: Boolean,
    public var `Anonymous`: `PARTITION_INFORMATION_EX_0`,
)
// UNSUPPORTED Rust 3654:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PARTITION_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3659:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PARTITION_INFORMATION_EX_0 {
//     pub Mbr: PARTITION_INFORMATION_MBR,
//     pub Gpt: PARTITION_INFORMATION_GPT,
// }

// UNSUPPORTED Rust 3665:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PARTITION_INFORMATION_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PARTITION_INFORMATION_GPT` (
    public var `PartitionType`: `windows_sys`.`core`.`GUID`,
    public var `PartitionId`: `windows_sys`.`core`.`GUID`,
    public var `Attributes`: `GPT_ATTRIBUTES`,
    public var `Name`: UShortArray,
)
// UNSUPPORTED Rust 3678:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PARTITION_INFORMATION_GPT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PARTITION_INFORMATION_MBR` (
    public var `PartitionType`: UByte,
    public var `BootIndicator`: Boolean,
    public var `RecognizedPartition`: Boolean,
    public var `HiddenSectors`: UInt,
    public var `PartitionId`: `windows_sys`.`core`.`GUID`,
)
public const val `PARTITION_LDM`: UInt = 66u;
public const val `PARTITION_MAIN_OS`: UInt = 40u;
public const val `PARTITION_MSFT_RECOVERY`: UInt = 39u;
public const val `PARTITION_NTFT`: UInt = 128u;
public const val `PARTITION_OS2BOOTMGR`: UInt = 10u;
public const val `PARTITION_PREP`: UInt = 65u;
public const val `PARTITION_PRE_INSTALLED`: UInt = 42u;
public const val `PARTITION_SPACES`: UInt = 231u;
public const val `PARTITION_SPACES_DATA`: UInt = 215u;
public typealias `PARTITION_STYLE` = Int;
public const val `PARTITION_STYLE_GPT`: `PARTITION_STYLE` = 1;
public const val `PARTITION_STYLE_MBR`: `PARTITION_STYLE` = 0;
public const val `PARTITION_STYLE_RAW`: `PARTITION_STYLE` = 2;
public const val `PARTITION_SYSTEM`: UInt = 239u;
public const val `PARTITION_UNIX`: UInt = 99u;
public const val `PARTITION_WINDOWS_SYSTEM`: UInt = 45u;
public const val `PARTITION_XENIX_1`: UInt = 2u;
public const val `PARTITION_XENIX_2`: UInt = 3u;
public const val `PARTITION_XINT13`: UInt = 14u;
public const val `PARTITION_XINT13_EXTENDED`: UInt = 15u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PATHNAME_BUFFER` (
    public var `PathNameLength`: UInt,
    public var `Name`: UShortArray,
)
// UNSUPPORTED Rust 3718:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PATHNAME_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PC_5_RW`: `STORAGE_MEDIA_TYPE` = 62;
public const val `PC_5_WO`: `STORAGE_MEDIA_TYPE` = 61;
public const val `PD_5_RW`: `STORAGE_MEDIA_TYPE` = 63;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERF_BIN` (
    public var `NumberOfBins`: UInt,
    public var `TypeOfBin`: UInt,
    public var `BinsRanges`: Array<`BIN_RANGE`>,
)
// UNSUPPORTED Rust 3733:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERF_BIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERSISTENT_RESERVE_COMMAND` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Anonymous`: `PERSISTENT_RESERVE_COMMAND_0`,
)
// UNSUPPORTED Rust 3745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERSISTENT_RESERVE_COMMAND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3750:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PERSISTENT_RESERVE_COMMAND_0 {
//     pub PR_IN: PERSISTENT_RESERVE_COMMAND_0_0,
//     pub PR_OUT: PERSISTENT_RESERVE_COMMAND_0_1,
// }

// UNSUPPORTED Rust 3756:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERSISTENT_RESERVE_COMMAND_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERSISTENT_RESERVE_COMMAND_0_0` (
    public var `_bitfield`: UByte,
    public var `AllocationLength`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERSISTENT_RESERVE_COMMAND_0_1` (
    public var `_bitfield1`: UByte,
    public var `_bitfield2`: UByte,
    public var `ParameterList`: UByteArray,
)
// UNSUPPORTED Rust 3774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERSISTENT_RESERVE_COMMAND_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PERSISTENT_VOLUME_STATE_BACKED_BY_WIM`: UInt = 64u;
public const val `PERSISTENT_VOLUME_STATE_CHKDSK_RAN_ONCE`: UInt = 1024u;
public const val `PERSISTENT_VOLUME_STATE_CONTAINS_BACKING_WIM`: UInt = 32u;
public const val `PERSISTENT_VOLUME_STATE_DAX_FORMATTED`: UInt = 4096u;
public const val `PERSISTENT_VOLUME_STATE_DEV_VOLUME`: UInt = 8192u;
public const val `PERSISTENT_VOLUME_STATE_GLOBAL_METADATA_NO_SEEK_PENALTY`: UInt = 4u;
public const val `PERSISTENT_VOLUME_STATE_LOCAL_METADATA_NO_SEEK_PENALTY`: UInt = 8u;
public const val `PERSISTENT_VOLUME_STATE_MODIFIED_BY_CHKDSK`: UInt = 2048u;
public const val `PERSISTENT_VOLUME_STATE_NO_HEAT_GATHERING`: UInt = 16u;
public const val `PERSISTENT_VOLUME_STATE_NO_WRITE_AUTO_TIERING`: UInt = 128u;
public const val `PERSISTENT_VOLUME_STATE_REALLOCATE_ALL_DATA_WRITES`: UInt = 512u;
public const val `PERSISTENT_VOLUME_STATE_SHORT_NAME_CREATION_DISABLED`: UInt = 1u;
public const val `PERSISTENT_VOLUME_STATE_TRUSTED_VOLUME`: UInt = 16384u;
public const val `PERSISTENT_VOLUME_STATE_TXF_DISABLED`: UInt = 256u;
public const val `PERSISTENT_VOLUME_STATE_VOLUME_SCRUB_DISABLED`: UInt = 2u;
public const val `PHILIPS_12_WO`: `STORAGE_MEDIA_TYPE` = 67;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PHYSICAL_ELEMENT_STATUS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DescriptorCount`: UInt,
    public var `ReturnedDescriptorCount`: UInt,
    public var `ElementIdentifierBeingDepoped`: UInt,
    public var `Reserved`: UInt,
    public var `Descriptors`: Array<`PHYSICAL_ELEMENT_STATUS_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 3806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHYSICAL_ELEMENT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PHYSICAL_ELEMENT_STATUS_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `ElementIdentifier`: UInt,
    public var `PhysicalElementType`: UByte,
    public var `PhysicalElementHealth`: UByte,
    public var `Reserved1`: UByteArray,
    public var `AssociatedCapacity`: ULong,
    public var `Reserved2`: UIntArray,
)
// UNSUPPORTED Rust 3823:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHYSICAL_ELEMENT_STATUS_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PHYSICAL_ELEMENT_STATUS_REQUEST` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `StartingElement`: UInt,
    public var `Filter`: UByte,
    public var `ReportType`: UByte,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 3838:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHYSICAL_ELEMENT_STATUS_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PINNACLE_APEX_5_RW`: `STORAGE_MEDIA_TYPE` = 65;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PIO_IRP_EXT_PROCESS_TRACKED_OFFSET_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`IO_IRP_EXT_TRACK_OFFSET_HEADER`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IO_IRP_EXT_TRACK_OFFSET_HEADER`>?, Long) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PLEX_READ_DATA_REQUEST` (
    public var `ByteOffset`: Long,
    public var `ByteLength`: UInt,
    public var `PlexNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PREVENT_MEDIA_REMOVAL` (
    public var `PreventMediaRemoval`: Boolean,
)
public const val `PRODUCT_ID_LENGTH`: UInt = 16u;
public const val `PROJFS_PROTOCOL_VERSION`: UInt = 3u;
public const val `PropertyExistsQuery`: `STORAGE_QUERY_TYPE` = 1;
public const val `PropertyExistsSet`: `STORAGE_SET_TYPE` = 1;
public const val `PropertyMaskQuery`: `STORAGE_QUERY_TYPE` = 2;
public const val `PropertyQueryMaxDefined`: `STORAGE_QUERY_TYPE` = 3;
public const val `PropertySetMaxDefined`: `STORAGE_SET_TYPE` = 2;
public const val `PropertyStandardQuery`: `STORAGE_QUERY_TYPE` = 0;
public const val `PropertyStandardSet`: `STORAGE_SET_TYPE` = 0;
public const val `ProtocolTypeAta`: `STORAGE_PROTOCOL_TYPE` = 2;
public const val `ProtocolTypeMaxReserved`: `STORAGE_PROTOCOL_TYPE` = 127;
public const val `ProtocolTypeNvme`: `STORAGE_PROTOCOL_TYPE` = 3;
public const val `ProtocolTypeProprietary`: `STORAGE_PROTOCOL_TYPE` = 126;
public const val `ProtocolTypeScsi`: `STORAGE_PROTOCOL_TYPE` = 1;
public const val `ProtocolTypeSd`: `STORAGE_PROTOCOL_TYPE` = 4;
public const val `ProtocolTypeUfs`: `STORAGE_PROTOCOL_TYPE` = 5;
public const val `ProtocolTypeUnknown`: `STORAGE_PROTOCOL_TYPE` = 0;
public const val `QIC`: `STORAGE_MEDIA_TYPE` = 35;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUERY_BAD_RANGES_INPUT` (
    public var `Flags`: UInt,
    public var `NumRanges`: UInt,
    public var `Ranges`: Array<`QUERY_BAD_RANGES_INPUT_RANGE`>,
)
// UNSUPPORTED Rust 3882:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QUERY_BAD_RANGES_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QUERY_BAD_RANGES_INPUT_RANGE` (
    public var `StartOffset`: ULong,
    public var `LengthInBytes`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUERY_BAD_RANGES_OUTPUT` (
    public var `Flags`: UInt,
    public var `NumBadRanges`: UInt,
    public var `NextOffsetToLookUp`: ULong,
    public var `BadRanges`: Array<`QUERY_BAD_RANGES_OUTPUT_RANGE`>,
)
// UNSUPPORTED Rust 3901:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QUERY_BAD_RANGES_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QUERY_BAD_RANGES_OUTPUT_RANGE` (
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
    public var `StartOffset`: ULong,
    public var `LengthInBytes`: ULong,
)
public const val `QUERY_DEPENDENT_VOLUME_REQUEST_FLAG_GUEST_VOLUMES`: UInt = 2u;
public const val `QUERY_DEPENDENT_VOLUME_REQUEST_FLAG_HOST_VOLUMES`: UInt = 1u;
public typealias `QUERY_FILE_LAYOUT_FILTER_TYPE` = Int;
public const val `QUERY_FILE_LAYOUT_FILTER_TYPE_CLUSTERS`: `QUERY_FILE_LAYOUT_FILTER_TYPE` = 1;
public const val `QUERY_FILE_LAYOUT_FILTER_TYPE_FILEID`: `QUERY_FILE_LAYOUT_FILTER_TYPE` = 2;
public const val `QUERY_FILE_LAYOUT_FILTER_TYPE_NONE`: `QUERY_FILE_LAYOUT_FILTER_TYPE` = 0;
public const val `QUERY_FILE_LAYOUT_FILTER_TYPE_STORAGE_RESERVE_ID`: `QUERY_FILE_LAYOUT_FILTER_TYPE` = 3;
public const val `QUERY_FILE_LAYOUT_INCLUDE_EXTENTS`: UInt = 8u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_EXTRA_INFO`: UInt = 16u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_FILES_WITH_DSC_ATTRIBUTE`: UInt = 4096u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_FULL_PATH_IN_NAMES`: UInt = 64u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_NAMES`: UInt = 2u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_ONLY_FILES_WITH_SPECIFIC_ATTRIBUTES`: UInt = 2048u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAMS`: UInt = 4u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAMS_WITH_NO_CLUSTERS_ALLOCATED`: UInt = 32u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION`: UInt = 128u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_DATA_ATTRIBUTE`: UInt = 8192u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_DSC_ATTRIBUTE`: UInt = 256u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_EA_ATTRIBUTE`: UInt = 32768u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_EFS_ATTRIBUTE`: UInt = 1024u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_REPARSE_ATTRIBUTE`: UInt = 16384u;
public const val `QUERY_FILE_LAYOUT_INCLUDE_STREAM_INFORMATION_FOR_TXF_ATTRIBUTE`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `QUERY_FILE_LAYOUT_INPUT` (
    public var `Anonymous`: `QUERY_FILE_LAYOUT_INPUT_0`,
    public var `Flags`: UInt,
    public var `FilterType`: `QUERY_FILE_LAYOUT_FILTER_TYPE`,
    public var `Reserved`: UInt,
    public var `Filter`: `QUERY_FILE_LAYOUT_INPUT_1`,
)
// UNSUPPORTED Rust 3945:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QUERY_FILE_LAYOUT_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3950:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union QUERY_FILE_LAYOUT_INPUT_0 {
//     pub FilterEntryCount: u32,
//     pub NumberOfPairs: u32,
// }

// UNSUPPORTED Rust 3956:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QUERY_FILE_LAYOUT_INPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3961:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union QUERY_FILE_LAYOUT_INPUT_1 {
//     pub ClusterRanges: [CLUSTER_RANGE; 1],
//     pub FileReferenceRanges: [FILE_REFERENCE_RANGE; 1],
//     pub StorageReserveIds: [STORAGE_RESERVE_ID; 1],
// }

// UNSUPPORTED Rust 3968:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for QUERY_FILE_LAYOUT_INPUT_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `QUERY_FILE_LAYOUT_NUM_FILTER_TYPES`: `QUERY_FILE_LAYOUT_FILTER_TYPE` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QUERY_FILE_LAYOUT_OUTPUT` (
    public var `FileEntryCount`: UInt,
    public var `FirstFileOffset`: UInt,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
)
public const val `QUERY_FILE_LAYOUT_REPARSE_DATA_INVALID`: UInt = 1u;
public const val `QUERY_FILE_LAYOUT_REPARSE_TAG_INVALID`: UInt = 2u;
public const val `QUERY_FILE_LAYOUT_RESTART`: UInt = 1u;
public const val `QUERY_FILE_LAYOUT_SINGLE_INSTANCED`: UInt = 1u;
public const val `QUERY_STORAGE_CLASSES_FLAGS_MEASURE_READ`: UInt = 1073741824u;
public const val `QUERY_STORAGE_CLASSES_FLAGS_MEASURE_WRITE`: UInt = 2147483648u;
public const val `QUERY_STORAGE_CLASSES_FLAGS_NO_DEFRAG_VOLUME`: UInt = 536870912u;
public const val `READ_ATTRIBUTES`: UInt = 208u;
public const val `READ_ATTRIBUTE_BUFFER_SIZE`: UInt = 512u;
public const val `READ_COMPRESSION_INFO_VALID`: UInt = 32u;
public const val `READ_COPY_NUMBER_BYPASS_CACHE_FLAG`: UInt = 256u;
public const val `READ_COPY_NUMBER_KEY`: UInt = 1380142592u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `READ_ELEMENT_ADDRESS_INFO` (
    public var `NumberOfElements`: UInt,
    public var `ElementStatus`: Array<`CHANGER_ELEMENT_STATUS`>,
)
// UNSUPPORTED Rust 4000:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for READ_ELEMENT_ADDRESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `READ_FILE_USN_DATA` (
    public var `MinMajorVersion`: UShort,
    public var `MaxMajorVersion`: UShort,
)
public const val `READ_THRESHOLDS`: UInt = 209u;
public const val `READ_THRESHOLD_BUFFER_SIZE`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `READ_USN_JOURNAL_DATA_V0` (
    public var `StartUsn`: Long,
    public var `ReasonMask`: UInt,
    public var `ReturnOnlyOnClose`: UInt,
    public var `Timeout`: ULong,
    public var `BytesToWaitFor`: ULong,
    public var `UsnJournalID`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `READ_USN_JOURNAL_DATA_V1` (
    public var `StartUsn`: Long,
    public var `ReasonMask`: UInt,
    public var `ReturnOnlyOnClose`: UInt,
    public var `Timeout`: ULong,
    public var `BytesToWaitFor`: ULong,
    public var `UsnJournalID`: ULong,
    public var `MinMajorVersion`: UShort,
    public var `MaxMajorVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REASSIGN_BLOCKS` (
    public var `Reserved`: UShort,
    public var `Count`: UShort,
    public var `BlockNumber`: UIntArray,
)
// UNSUPPORTED Rust 4042:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REASSIGN_BLOCKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REASSIGN_BLOCKS_EX` (
    public var `Reserved`: UShort,
    public var `Count`: UShort,
    public var `BlockNumber`: LongArray,
)
// UNSUPPORTED Rust 4054:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REASSIGN_BLOCKS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RECOVERED_READS_VALID`: UInt = 4u;
public const val `RECOVERED_WRITES_VALID`: UInt = 1u;
public typealias `REFS_SMR_VOLUME_GC_ACTION` = Int;
public typealias `REFS_SMR_VOLUME_GC_METHOD` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REFS_SMR_VOLUME_GC_PARAMETERS` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `Action`: `REFS_SMR_VOLUME_GC_ACTION`,
    public var `Method`: `REFS_SMR_VOLUME_GC_METHOD`,
    public var `IoGranularity`: UInt,
    public var `CompressionFormat`: UInt,
    public var `Unused`: ULongArray,
)
// UNSUPPORTED Rust 4074:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REFS_SMR_VOLUME_GC_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REFS_SMR_VOLUME_GC_PARAMETERS_VERSION_V1`: UInt = 1u;
public typealias `REFS_SMR_VOLUME_GC_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REFS_SMR_VOLUME_INFO_OUTPUT` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `SizeOfRandomlyWritableTier`: Long,
    public var `FreeSpaceInRandomlyWritableTier`: Long,
    public var `SizeofSMRTier`: Long,
    public var `FreeSpaceInSMRTier`: Long,
    public var `UsableFreeSpaceInSMRTier`: Long,
    public var `VolumeGcState`: `REFS_SMR_VOLUME_GC_STATE`,
    public var `VolumeGcLastStatus`: UInt,
    public var `CurrentGcBandFillPercentage`: UInt,
    public var `Unused`: ULongArray,
)
// UNSUPPORTED Rust 4096:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REFS_SMR_VOLUME_INFO_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REFS_SMR_VOLUME_INFO_OUTPUT_VERSION_V0`: UInt = 0u;
public const val `REFS_SMR_VOLUME_INFO_OUTPUT_VERSION_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REFS_VOLUME_DATA_BUFFER` (
    public var `ByteCount`: UInt,
    public var `MajorVersion`: UInt,
    public var `MinorVersion`: UInt,
    public var `BytesPerPhysicalSector`: UInt,
    public var `VolumeSerialNumber`: Long,
    public var `NumberSectors`: Long,
    public var `TotalClusters`: Long,
    public var `FreeClusters`: Long,
    public var `TotalReserved`: Long,
    public var `BytesPerSector`: UInt,
    public var `BytesPerCluster`: UInt,
    public var `MaximumSizeOfResidentFile`: Long,
    public var `FastTierDataFillRatio`: UShort,
    public var `SlowTierDataFillRatio`: UShort,
    public var `DestagesFastTierToSlowTierRate`: UInt,
    public var `MetadataChecksumType`: UShort,
    public var `Reserved0`: UByteArray,
    public var `Reserved`: LongArray,
)
// UNSUPPORTED Rust 4125:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REFS_VOLUME_DATA_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REMOVE_ELEMENT_AND_TRUNCATE_REQUEST` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `RequestCapacity`: ULong,
    public var `ElementIdentifier`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REPAIR_COPIES_INPUT` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `FileOffset`: Long,
    public var `Length`: UInt,
    public var `SourceCopy`: UInt,
    public var `NumberOfRepairCopies`: UInt,
    public var `RepairCopies`: UIntArray,
)
// UNSUPPORTED Rust 4150:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REPAIR_COPIES_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REPAIR_COPIES_OUTPUT` (
    public var `Size`: UInt,
    public var `Status`: UInt,
    public var `ResumeFileOffset`: Long,
)
public const val `REPLACE_ALTERNATE`: UInt = 11u;
public const val `REPLACE_PRIMARY`: UInt = 10u;
public const val `REQUEST_OPLOCK_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REQUEST_OPLOCK_INPUT_BUFFER` (
    public var `StructureVersion`: UShort,
    public var `StructureLength`: UShort,
    public var `RequestedOplockLevel`: UInt,
    public var `Flags`: UInt,
)
public const val `REQUEST_OPLOCK_INPUT_FLAG_ACK`: UInt = 2u;
public const val `REQUEST_OPLOCK_INPUT_FLAG_COMPLETE_ACK_ON_CLOSE`: UInt = 4u;
public const val `REQUEST_OPLOCK_INPUT_FLAG_REQUEST`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REQUEST_OPLOCK_OUTPUT_BUFFER` (
    public var `StructureVersion`: UShort,
    public var `StructureLength`: UShort,
    public var `OriginalOplockLevel`: UInt,
    public var `NewOplockLevel`: UInt,
    public var `Flags`: UInt,
    public var `AccessMode`: UInt,
    public var `ShareMode`: UShort,
)
public const val `REQUEST_OPLOCK_OUTPUT_FLAG_ACK_REQUIRED`: UInt = 1u;
public const val `REQUEST_OPLOCK_OUTPUT_FLAG_MODES_PROVIDED`: UInt = 2u;
public const val `REQUEST_OPLOCK_OUTPUT_FLAG_WRITABLE_SECTION_PRESENT`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REQUEST_RAW_ENCRYPTED_DATA` (
    public var `FileOffset`: Long,
    public var `Length`: UInt,
)
public const val `RETRACT_IEPORT`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER` (
    public var `ExtentCount`: UInt,
    public var `StartingVcn`: Long,
    public var `Extents`: Array<`RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER_0`>,
)
// UNSUPPORTED Rust 4204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RETRIEVAL_POINTERS_AND_REFCOUNT_BUFFER_0` (
    public var `NextVcn`: Long,
    public var `Lcn`: Long,
    public var `ReferenceCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RETRIEVAL_POINTERS_BUFFER` (
    public var `ExtentCount`: UInt,
    public var `StartingVcn`: Long,
    public var `Extents`: Array<`RETRIEVAL_POINTERS_BUFFER_0`>,
)
// UNSUPPORTED Rust 4223:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RETRIEVAL_POINTERS_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RETRIEVAL_POINTERS_BUFFER_0` (
    public var `NextVcn`: Long,
    public var `Lcn`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RETRIEVAL_POINTER_BASE` (
    public var `FileAreaOffset`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RETRIEVAL_POINTER_COUNT` (
    public var `ExtentCount`: UInt,
)
public const val `RETURN_SMART_STATUS`: UInt = 218u;
public const val `REVISION_LENGTH`: UInt = 4u;
public const val `RemovableMedia`: `MEDIA_TYPE` = 11;
public const val `RequestLocation`: `BIN_TYPES` = 1;
public const val `RequestSize`: `BIN_TYPES` = 0;
public const val `SAIT`: `STORAGE_MEDIA_TYPE` = 93;
public const val `SAVE_ATTRIBUTE_VALUES`: UInt = 211u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceCount`: UInt,
    public var `Devices`: Array<`SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO`>,
)
// UNSUPPORTED Rust 4259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO` (
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
    public var `DeviceNumber`: UInt,
    public var `Flags`: `SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO_0`,
    public var `DeviceSize`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_BUS_DEDICATED_MEMORY_STATE` (
    public var `ActivateState`: Boolean,
)
public typealias `SCM_BUS_FIRMWARE_ACTIVATION_STATE` = Int;
public typealias `SCM_BUS_PROPERTY_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_BUS_PROPERTY_QUERY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `PropertyId`: `SCM_BUS_PROPERTY_ID`,
    public var `QueryType`: `SCM_BUS_QUERY_TYPE`,
    public var `AdditionalParameters`: UByteArray,
)
// UNSUPPORTED Rust 4293:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_BUS_PROPERTY_QUERY {
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
public class `SCM_BUS_PROPERTY_SET` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `PropertyId`: `SCM_BUS_PROPERTY_ID`,
    public var `SetType`: `SCM_BUS_SET_TYPE`,
    public var `AdditionalParameters`: UByteArray,
)
// UNSUPPORTED Rust 4307:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_BUS_PROPERTY_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCM_BUS_QUERY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_BUS_RUNTIME_FW_ACTIVATION_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `RuntimeFwActivationSupported`: Boolean,
    public var `FirmwareActivationState`: `SCM_BUS_FIRMWARE_ACTIVATION_STATE`,
    public var `FirmwareActivationCapability`: `SCM_BUS_RUNTIME_FW_ACTIVATION_INFO_0`,
    public var `EstimatedFirmwareActivationTimeInUSecs`: ULong,
    public var `EstimatedProcessorAccessQuiesceTimeInUSecs`: ULong,
    public var `EstimatedIOAccessQuiesceTimeInUSecs`: ULong,
    public var `PlatformSupportedMaxIOAccessQuiesceTimeInUSecs`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_BUS_RUNTIME_FW_ACTIVATION_INFO_0` (
    public var `_bitfield`: UInt,
)
public typealias `SCM_BUS_SET_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_INTERLEAVED_PD_INFO` (
    public var `DeviceHandle`: UInt,
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_LD_INTERLEAVE_SET_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `InterleaveSetSize`: UInt,
    public var `InterleaveSet`: Array<`SCM_INTERLEAVED_PD_INFO`>,
)
// UNSUPPORTED Rust 4346:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_LD_INTERLEAVE_SET_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_LOGICAL_DEVICES` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceCount`: UInt,
    public var `Devices`: Array<`SCM_LOGICAL_DEVICE_INSTANCE`>,
)
// UNSUPPORTED Rust 4359:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_LOGICAL_DEVICES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_LOGICAL_DEVICE_INSTANCE` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
    public var `SymbolicLink`: UShortArray,
)
// UNSUPPORTED Rust 4372:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_LOGICAL_DEVICE_INSTANCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCM_MAX_SYMLINK_LEN_IN_CHARS`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_DESCRIPTOR_HEADER` (
    public var `Version`: UInt,
    public var `Size`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_DEVICE_HANDLE` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
    public var `DeviceHandle`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_DEVICE_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
    public var `UnsafeShutdownCount`: UInt,
    public var `PersistentMemorySizeInBytes`: ULong,
    public var `VolatileMemorySizeInBytes`: ULong,
    public var `TotalMemorySizeInBytes`: ULong,
    public var `SlotNumber`: UInt,
    public var `DeviceHandle`: UInt,
    public var `PhysicalId`: UShort,
    public var `NumberOfFormatInterfaceCodes`: UByte,
    public var `FormatInterfaceCodes`: UShortArray,
    public var `VendorId`: UInt,
    public var `ProductId`: UInt,
    public var `SubsystemDeviceId`: UInt,
    public var `SubsystemVendorId`: UInt,
    public var `ManufacturingLocation`: UByte,
    public var `ManufacturingWeek`: UByte,
    public var `ManufacturingYear`: UByte,
    public var `SerialNumber4Byte`: UInt,
    public var `SerialNumberLengthInChars`: UInt,
    public var `SerialNumber`: ByteArray,
)
// UNSUPPORTED Rust 4418:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_DEVICE_SPECIFIC_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NumberOfProperties`: UInt,
    public var `DeviceSpecificProperties`: Array<`SCM_PD_DEVICE_SPECIFIC_PROPERTY`>,
)
// UNSUPPORTED Rust 4431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_DEVICE_SPECIFIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_DEVICE_SPECIFIC_PROPERTY` (
    public var `Name`: UShortArray,
    public var `Value`: Long,
)
// UNSUPPORTED Rust 4442:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_DEVICE_SPECIFIC_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_FIRMWARE_ACTIVATE` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Slot`: UByte,
)
public typealias `SCM_PD_FIRMWARE_ACTIVATION_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_FIRMWARE_DOWNLOAD` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Slot`: UByte,
    public var `Reserved`: UByteArray,
    public var `Offset`: ULong,
    public var `FirmwareImageSizeInBytes`: UInt,
    public var `FirmwareImage`: UByteArray,
)
// UNSUPPORTED Rust 4468:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_FIRMWARE_DOWNLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_FIRMWARE_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `ActiveSlot`: UByte,
    public var `NextActiveSlot`: UByte,
    public var `SlotCount`: UByte,
    public var `Slots`: Array<`SCM_PD_FIRMWARE_SLOT_INFO`>,
)
// UNSUPPORTED Rust 4483:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_FIRMWARE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCM_PD_FIRMWARE_LAST_DOWNLOAD`: UInt = 1u;
public const val `SCM_PD_FIRMWARE_REVISION_LENGTH_BYTES`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_FIRMWARE_SLOT_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SlotNumber`: UByte,
    public var `_bitfield`: UByte,
    public var `Reserved1`: UByteArray,
    public var `Revision`: UByteArray,
)
// UNSUPPORTED Rust 4500:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_FIRMWARE_SLOT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_FRU_ID_STRING` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `IdentifierSize`: UInt,
    public var `Identifier`: UByteArray,
)
// UNSUPPORTED Rust 4513:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_FRU_ID_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_HEALTH_NOTIFICATION_DATA` (
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
)
public typealias `SCM_PD_HEALTH_STATUS` = Int;
public typealias `SCM_PD_LAST_FW_ACTIVATION_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_LOCATION_STRING` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Location`: UShortArray,
)
// UNSUPPORTED Rust 4532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_LOCATION_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_MANAGEMENT_STATUS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Health`: `SCM_PD_HEALTH_STATUS`,
    public var `NumberOfOperationalStatus`: UInt,
    public var `NumberOfAdditionalReasons`: UInt,
    public var `OperationalStatus`: Array<`SCM_PD_OPERATIONAL_STATUS`>,
    public var `AdditionalReasons`: Array<`SCM_PD_OPERATIONAL_STATUS_REASON`>,
)
// UNSUPPORTED Rust 4548:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_MANAGEMENT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCM_PD_MAX_OPERATIONAL_STATUS`: UInt = 16u;
public typealias `SCM_PD_MEDIA_REINITIALIZATION_STATUS` = Int;
public typealias `SCM_PD_OPERATIONAL_STATUS` = Int;
public typealias `SCM_PD_OPERATIONAL_STATUS_REASON` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_PASSTHROUGH_INPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `ProtocolGuid`: `windows_sys`.`core`.`GUID`,
    public var `DataSize`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 4566:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_PASSTHROUGH_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_PASSTHROUGH_INVDIMM_INPUT` (
    public var `Opcode`: UInt,
    public var `OpcodeParametersLength`: UInt,
    public var `OpcodeParameters`: UByteArray,
)
// UNSUPPORTED Rust 4578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_PASSTHROUGH_INVDIMM_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_PASSTHROUGH_INVDIMM_OUTPUT` (
    public var `GeneralStatus`: UShort,
    public var `ExtendedStatus`: UShort,
    public var `OutputDataLength`: UInt,
    public var `OutputData`: UByteArray,
)
// UNSUPPORTED Rust 4591:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_PASSTHROUGH_INVDIMM_OUTPUT {
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
public class `SCM_PD_PASSTHROUGH_OUTPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `ProtocolGuid`: `windows_sys`.`core`.`GUID`,
    public var `DataSize`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 4605:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_PASSTHROUGH_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCM_PD_PROPERTY_ID` = Int;
public const val `SCM_PD_PROPERTY_NAME_LENGTH_IN_CHARS`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PD_PROPERTY_QUERY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `PropertyId`: `SCM_PD_PROPERTY_ID`,
    public var `QueryType`: `SCM_PD_QUERY_TYPE`,
    public var `AdditionalParameters`: UByteArray,
)
// UNSUPPORTED Rust 4621:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_PROPERTY_QUERY {
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
public class `SCM_PD_PROPERTY_SET` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `PropertyId`: `SCM_PD_PROPERTY_ID`,
    public var `SetType`: `SCM_PD_SET_TYPE`,
    public var `AdditionalParameters`: UByteArray,
)
// UNSUPPORTED Rust 4635:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PD_PROPERTY_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCM_PD_QUERY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_REINITIALIZE_MEDIA_INPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Options`: `SCM_PD_REINITIALIZE_MEDIA_INPUT_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_REINITIALIZE_MEDIA_INPUT_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_REINITIALIZE_MEDIA_OUTPUT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Status`: `SCM_PD_MEDIA_REINITIALIZATION_STATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE` (
    public var `ArmState`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_PD_RUNTIME_FW_ACTIVATION_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `LastFirmwareActivationStatus`: `SCM_PD_LAST_FW_ACTIVATION_STATUS`,
    public var `FirmwareActivationState`: `SCM_PD_FIRMWARE_ACTIVATION_STATE`,
)
public typealias `SCM_PD_SET_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PHYSICAL_DEVICES` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceCount`: UInt,
    public var `Devices`: Array<`SCM_PHYSICAL_DEVICE_INSTANCE`>,
)
// UNSUPPORTED Rust 4682:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PHYSICAL_DEVICES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_PHYSICAL_DEVICE_INSTANCE` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NfitHandle`: UInt,
    public var `SymbolicLink`: UShortArray,
)
// UNSUPPORTED Rust 4695:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_PHYSICAL_DEVICE_INSTANCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCM_REGION` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `NfitHandle`: UInt,
    public var `LogicalDeviceGuid`: `windows_sys`.`core`.`GUID`,
    public var `AddressRangeType`: `windows_sys`.`core`.`GUID`,
    public var `AssociatedId`: UInt,
    public var `Length`: ULong,
    public var `StartingDPA`: ULong,
    public var `BaseSPA`: ULong,
    public var `SPAOffset`: ULong,
    public var `RegionOffset`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCM_REGIONS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `RegionCount`: UInt,
    public var `Regions`: Array<`SCM_REGION`>,
)
// UNSUPPORTED Rust 4724:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCM_REGIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SCM_REGION_FLAG` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SD_CHANGE_MACHINE_SID_INPUT` (
    public var `CurrentMachineSIDOffset`: UShort,
    public var `CurrentMachineSIDLength`: UShort,
    public var `NewMachineSIDOffset`: UShort,
    public var `NewMachineSIDLength`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SD_CHANGE_MACHINE_SID_OUTPUT` (
    public var `NumSDChangedSuccess`: ULong,
    public var `NumSDChangedFail`: ULong,
    public var `NumSDUnused`: ULong,
    public var `NumSDTotal`: ULong,
    public var `NumMftSDChangedSuccess`: ULong,
    public var `NumMftSDChangedFail`: ULong,
    public var `NumMftSDTotal`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SD_ENUM_SDS_ENTRY` (
    public var `Hash`: UInt,
    public var `SecurityId`: UInt,
    public var `Offset`: ULong,
    public var `Length`: UInt,
    public var `Descriptor`: UByteArray,
)
// UNSUPPORTED Rust 4758:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SD_ENUM_SDS_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SD_ENUM_SDS_INPUT` (
    public var `StartingOffset`: ULong,
    public var `MaxSDEntriesToReturn`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SD_ENUM_SDS_OUTPUT` (
    public var `NextOffset`: ULong,
    public var `NumSDEntriesReturned`: ULong,
    public var `NumSDBytesReturned`: ULong,
    public var `SDEntry`: Array<`SD_ENUM_SDS_ENTRY`>,
)
// UNSUPPORTED Rust 4777:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SD_ENUM_SDS_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SD_GLOBAL_CHANGE_INPUT` (
    public var `Flags`: UInt,
    public var `ChangeType`: UInt,
    public var `Anonymous`: `SD_GLOBAL_CHANGE_INPUT_0`,
)
// UNSUPPORTED Rust 4789:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SD_GLOBAL_CHANGE_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4794:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SD_GLOBAL_CHANGE_INPUT_0 {
//     pub SdChange: SD_CHANGE_MACHINE_SID_INPUT,
//     pub SdQueryStats: SD_QUERY_STATS_INPUT,
//     pub SdEnumSds: SD_ENUM_SDS_INPUT,
// }

// UNSUPPORTED Rust 4801:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SD_GLOBAL_CHANGE_INPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SD_GLOBAL_CHANGE_OUTPUT` (
    public var `Flags`: UInt,
    public var `ChangeType`: UInt,
    public var `Anonymous`: `SD_GLOBAL_CHANGE_OUTPUT_0`,
)
// UNSUPPORTED Rust 4813:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SD_GLOBAL_CHANGE_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4818:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SD_GLOBAL_CHANGE_OUTPUT_0 {
//     pub SdChange: SD_CHANGE_MACHINE_SID_OUTPUT,
//     pub SdQueryStats: SD_QUERY_STATS_OUTPUT,
//     pub SdEnumSds: SD_ENUM_SDS_OUTPUT,
// }

// UNSUPPORTED Rust 4825:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SD_GLOBAL_CHANGE_OUTPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SD_GLOBAL_CHANGE_TYPE_ENUM_SDS`: UInt = 131072u;
public const val `SD_GLOBAL_CHANGE_TYPE_MACHINE_SID`: UInt = 1u;
public const val `SD_GLOBAL_CHANGE_TYPE_QUERY_STATS`: UInt = 65536u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SD_QUERY_STATS_INPUT` (
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SD_QUERY_STATS_OUTPUT` (
    public var `SdsStreamSize`: ULong,
    public var `SdsAllocationSize`: ULong,
    public var `SiiStreamSize`: ULong,
    public var `SiiAllocationSize`: ULong,
    public var `SdhStreamSize`: ULong,
    public var `SdhAllocationSize`: ULong,
    public var `NumSDTotal`: ULong,
    public var `NumSDUnused`: ULong,
)
public const val `SEARCH_ALL`: UInt = 0u;
public const val `SEARCH_ALL_NO_SEQ`: UInt = 4u;
public const val `SEARCH_ALTERNATE`: UInt = 2u;
public const val `SEARCH_ALT_NO_SEQ`: UInt = 6u;
public const val `SEARCH_PRIMARY`: UInt = 1u;
public const val `SEARCH_PRI_NO_SEQ`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SENDCMDINPARAMS` (
    public var `cBufferSize`: UInt,
    public var `irDriveRegs`: `IDEREGS`,
    public var `bDriveNumber`: UByte,
    public var `bReserved`: UByteArray,
    public var `dwReserved`: UIntArray,
    public var `bBuffer`: UByteArray,
)
// UNSUPPORTED Rust 4866:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SENDCMDINPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SENDCMDOUTPARAMS` (
    public var `cBufferSize`: UInt,
    public var `DriverStatus`: `DRIVERSTATUS`,
    public var `bBuffer`: UByteArray,
)
// UNSUPPORTED Rust 4878:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SENDCMDOUTPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERIAL_IOC_FCR_DMA_MODE`: UInt = 8u;
public const val `SERIAL_IOC_FCR_FIFO_ENABLE`: UInt = 1u;
public const val `SERIAL_IOC_FCR_RCVR_RESET`: UInt = 2u;
public const val `SERIAL_IOC_FCR_RCVR_TRIGGER_LSB`: UInt = 64u;
public const val `SERIAL_IOC_FCR_RCVR_TRIGGER_MSB`: UInt = 128u;
public const val `SERIAL_IOC_FCR_RES1`: UInt = 16u;
public const val `SERIAL_IOC_FCR_RES2`: UInt = 32u;
public const val `SERIAL_IOC_FCR_XMIT_RESET`: UInt = 4u;
public const val `SERIAL_IOC_MCR_DTR`: UInt = 1u;
public const val `SERIAL_IOC_MCR_LOOP`: UInt = 16u;
public const val `SERIAL_IOC_MCR_OUT1`: UInt = 4u;
public const val `SERIAL_IOC_MCR_OUT2`: UInt = 8u;
public const val `SERIAL_IOC_MCR_RTS`: UInt = 2u;
public const val `SERIAL_NUMBER_LENGTH`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SET_DAX_ALLOC_ALIGNMENT_HINT_INPUT` (
    public var `Flags`: UInt,
    public var `AlignmentShift`: UInt,
    public var `FileOffsetToAlign`: ULong,
    public var `FallbackAlignmentShift`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SET_DISK_ATTRIBUTES` (
    public var `Version`: UInt,
    public var `Persist`: Boolean,
    public var `Reserved1`: UByteArray,
    public var `Attributes`: ULong,
    public var `AttributesMask`: ULong,
    public var `Reserved2`: UIntArray,
)
// UNSUPPORTED Rust 4915:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SET_DISK_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SET_PARTITION_INFORMATION` (
    public var `PartitionType`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SET_PARTITION_INFORMATION_EX` (
    public var `PartitionStyle`: `PARTITION_STYLE`,
    public var `Anonymous`: `SET_PARTITION_INFORMATION_EX_0`,
)
// UNSUPPORTED Rust 4931:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SET_PARTITION_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4936:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SET_PARTITION_INFORMATION_EX_0 {
//     pub Mbr: SET_PARTITION_INFORMATION,
//     pub Gpt: PARTITION_INFORMATION_GPT,
// }

// UNSUPPORTED Rust 4942:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SET_PARTITION_INFORMATION_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SET_PURGE_FAILURE_MODE_DISABLED`: UInt = 2u;
public const val `SET_PURGE_FAILURE_MODE_ENABLED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SET_PURGE_FAILURE_MODE_INPUT` (
    public var `Flags`: UInt,
)
public const val `SET_REPAIR_DISABLED_AND_BUGCHECK_ON_CORRUPT`: UInt = 16u;
public const val `SET_REPAIR_ENABLED`: UInt = 1u;
public const val `SET_REPAIR_VALID_MASK`: UInt = 25u;
public const val `SET_REPAIR_WARN_ABOUT_DATA_LOSS`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SHRINK_VOLUME_INFORMATION` (
    public var `ShrinkRequestType`: `SHRINK_VOLUME_REQUEST_TYPES`,
    public var `Flags`: ULong,
    public var `NewNumberOfSectors`: Long,
)
public typealias `SHRINK_VOLUME_REQUEST_TYPES` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SI_COPYFILE` (
    public var `SourceFileNameLength`: UInt,
    public var `DestinationFileNameLength`: UInt,
    public var `Flags`: UInt,
    public var `FileNameBuffer`: UShortArray,
)
// UNSUPPORTED Rust 4974:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SI_COPYFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SMART_ABORT_OFFLINE_SELFTEST`: UInt = 127u;
public const val `SMART_CMD`: UInt = 176u;
public const val `SMART_CYL_HI`: UInt = 194u;
public const val `SMART_CYL_LOW`: UInt = 79u;
public const val `SMART_ERROR_NO_MEM`: UInt = 7u;
public const val `SMART_EXTENDED_SELFTEST_CAPTIVE`: UInt = 130u;
public const val `SMART_EXTENDED_SELFTEST_OFFLINE`: UInt = 2u;
public const val `SMART_GET_VERSION`: UInt = 475264u;
public const val `SMART_IDE_ERROR`: UInt = 1u;
public const val `SMART_INVALID_BUFFER`: UInt = 4u;
public const val `SMART_INVALID_COMMAND`: UInt = 3u;
public const val `SMART_INVALID_DRIVE`: UInt = 5u;
public const val `SMART_INVALID_FLAG`: UInt = 2u;
public const val `SMART_INVALID_IOCTL`: UInt = 6u;
public const val `SMART_INVALID_REGISTER`: UInt = 8u;
public const val `SMART_LOG_SECTOR_SIZE`: UInt = 512u;
public const val `SMART_NOT_SUPPORTED`: UInt = 9u;
public const val `SMART_NO_ERROR`: UInt = 0u;
public const val `SMART_NO_IDE_DEVICE`: UInt = 10u;
public const val `SMART_OFFLINE_ROUTINE_OFFLINE`: UInt = 0u;
public const val `SMART_RCV_DRIVE_DATA`: UInt = 508040u;
public const val `SMART_RCV_DRIVE_DATA_EX`: UInt = 458892u;
public const val `SMART_READ_LOG`: UInt = 213u;
public const val `SMART_SEND_DRIVE_COMMAND`: UInt = 508036u;
public const val `SMART_SHORT_SELFTEST_CAPTIVE`: UInt = 129u;
public const val `SMART_SHORT_SELFTEST_OFFLINE`: UInt = 1u;
public const val `SMART_WRITE_LOG`: UInt = 214u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SMB_SHARE_FLUSH_AND_PURGE_INPUT` (
    public var `Version`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SMB_SHARE_FLUSH_AND_PURGE_OUTPUT` (
    public var `cEntriesPurged`: UInt,
)
public const val `SONY_12_WO`: `STORAGE_MEDIA_TYPE` = 66;
public const val `SONY_D2`: `STORAGE_MEDIA_TYPE` = 49;
public const val `SONY_DTF`: `STORAGE_MEDIA_TYPE` = 46;
public const val `SPACES_TRACKED_OFFSET_HEADER_FLAG`: UInt = 2u;
public const val `SRB_TYPE_SCSI_REQUEST_BLOCK`: UInt = 0u;
public const val `SRB_TYPE_STORAGE_REQUEST_BLOCK`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STARTING_LCN_INPUT_BUFFER` (
    public var `StartingLcn`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STARTING_LCN_INPUT_BUFFER_EX` (
    public var `StartingLcn`: Long,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STARTING_VCN_INPUT_BUFFER` (
    public var `StartingVcn`: Long,
)
public const val `STK_9840`: `STORAGE_MEDIA_TYPE` = 85;
public const val `STK_9940`: `STORAGE_MEDIA_TYPE` = 92;
public const val `STK_DATA_D3`: `STORAGE_MEDIA_TYPE` = 45;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ACCESS_ALIGNMENT_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `BytesPerCacheLine`: UInt,
    public var `BytesOffsetForCacheAlignment`: UInt,
    public var `BytesPerLogicalSector`: UInt,
    public var `BytesPerPhysicalSector`: UInt,
    public var `BytesOffsetForSectorAlignment`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ADAPTER_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `MaximumTransferLength`: UInt,
    public var `MaximumPhysicalPages`: UInt,
    public var `AlignmentMask`: UInt,
    public var `AdapterUsesPio`: Boolean,
    public var `AdapterScansDown`: Boolean,
    public var `CommandQueueing`: Boolean,
    public var `AcceleratedTransfer`: Boolean,
    public var `BusType`: UByte,
    public var `BusMajorVersion`: UShort,
    public var `BusMinorVersion`: UShort,
    public var `SrbType`: UByte,
    public var `AddressType`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_ADAPTER_SERIAL_NUMBER` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SerialNumber`: UShortArray,
)
// UNSUPPORTED Rust 5077:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_ADAPTER_SERIAL_NUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_ADAPTER_SERIAL_NUMBER_V1_MAX_LENGTH`: UInt = 128u;
public const val `STORAGE_ADDRESS_TYPE_BTL8`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_ALLOCATE_BC_STREAM_INPUT` (
    public var `Version`: UInt,
    public var `RequestsPerPeriod`: UInt,
    public var `Period`: UInt,
    public var `RetryFailures`: Boolean,
    public var `Discardable`: Boolean,
    public var `Reserved1`: BooleanArray,
    public var `AccessType`: UInt,
    public var `AccessMode`: UInt,
)
// UNSUPPORTED Rust 5096:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_ALLOCATE_BC_STREAM_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ALLOCATE_BC_STREAM_OUTPUT` (
    public var `RequestSize`: ULong,
    public var `NumOutStandingRequests`: UInt,
)
public typealias `STORAGE_ASSOCIATION_TYPE` = Int;
public const val `STORAGE_ATTRIBUTE_ASYNC_EVENT_NOTIFICATION`: UInt = 16u;
public const val `STORAGE_ATTRIBUTE_BLOCK_IO`: UInt = 2u;
public const val `STORAGE_ATTRIBUTE_BYTE_ADDRESSABLE_IO`: UInt = 1u;
public const val `STORAGE_ATTRIBUTE_DYNAMIC_PERSISTENCE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ATTRIBUTE_MGMT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Action`: `STORAGE_ATTRIBUTE_MGMT_ACTION`,
    public var `Attribute`: UInt,
)
public typealias `STORAGE_ATTRIBUTE_MGMT_ACTION` = Int;
public const val `STORAGE_ATTRIBUTE_PERF_SIZE_INDEPENDENT`: UInt = 32u;
public const val `STORAGE_ATTRIBUTE_VOLATILE`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_BREAK_RESERVATION_REQUEST` (
    public var `Length`: UInt,
    public var `_unused`: UByte,
    public var `PathId`: UByte,
    public var `TargetId`: UByte,
    public var `Lun`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_BUS_RESET_REQUEST` (
    public var `PathId`: UByte,
)
public typealias `STORAGE_COMPONENT_HEALTH_STATUS` = Int;
public const val `STORAGE_COMPONENT_ROLE_CACHE`: UInt = 1u;
public const val `STORAGE_COMPONENT_ROLE_DATA`: UInt = 4u;
public const val `STORAGE_COMPONENT_ROLE_TIERING`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_COUNTER` (
    public var `Type`: `STORAGE_COUNTER_TYPE`,
    public var `Value`: `STORAGE_COUNTER_0`,
)
// UNSUPPORTED Rust 5147:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_COUNTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5152:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_COUNTER_0 {
//     pub ManufactureDate: STORAGE_COUNTER_0_0,
//     pub AsUlonglong: u64,
// }

// UNSUPPORTED Rust 5158:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_COUNTER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_COUNTER_0_0` (
    public var `Week`: UInt,
    public var `Year`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_COUNTERS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NumberOfCounters`: UInt,
    public var `Counters`: Array<`STORAGE_COUNTER`>,
)
// UNSUPPORTED Rust 5177:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_COUNTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_COUNTER_TYPE` = Int;
// UNSUPPORTED Rust 5183:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const STORAGE_CRASH_TELEMETRY_REGKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Registry\\Machine\\System\\CurrentControlSet\\Control\\CrashControl\\StorageTelemetry");

public typealias `STORAGE_CRYPTO_ALGORITHM_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_CRYPTO_CAPABILITY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `CryptoCapabilityIndex`: UInt,
    public var `AlgorithmId`: `STORAGE_CRYPTO_ALGORITHM_ID`,
    public var `KeySize`: `STORAGE_CRYPTO_KEY_SIZE`,
    public var `DataUnitSizeBitmask`: UInt,
)
public const val `STORAGE_CRYPTO_CAPABILITY_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_CRYPTO_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NumKeysSupported`: UInt,
    public var `NumCryptoCapabilities`: UInt,
    public var `CryptoCapabilities`: Array<`STORAGE_CRYPTO_CAPABILITY`>,
)
// UNSUPPORTED Rust 5205:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_CRYPTO_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_CRYPTO_DESCRIPTOR_VERSION_1`: UInt = 1u;
public typealias `STORAGE_CRYPTO_KEY_SIZE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DESCRIPTOR_HEADER` (
    public var `Version`: UInt,
    public var `Size`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_ATTRIBUTES_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Attributes`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEVICE_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceType`: UByte,
    public var `DeviceTypeModifier`: UByte,
    public var `RemovableMedia`: Boolean,
    public var `CommandQueueing`: Boolean,
    public var `VendorIdOffset`: UInt,
    public var `ProductIdOffset`: UInt,
    public var `ProductRevisionOffset`: UInt,
    public var `SerialNumberOffset`: UInt,
    public var `BusType`: `super`.`super`.`Storage`.`FileSystem`.`STORAGE_BUS_TYPE`,
    public var `RawPropertiesLength`: UInt,
    public var `RawDeviceProperties`: UByteArray,
)
// UNSUPPORTED Rust 5243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for STORAGE_DEVICE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NumberOfFaultDomains`: UInt,
    public var `FaultDomainIds`: Array<`windows_sys`.`core`.`GUID`>,
)
// UNSUPPORTED Rust 5257:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DEVICE_FAULT_DOMAIN_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_DEVICE_FLAGS_PAGE_83_DEVICEGUID`: UInt = 4u;
public const val `STORAGE_DEVICE_FLAGS_RANDOM_DEVICEGUID_REASON_CONFLICT`: UInt = 1u;
public const val `STORAGE_DEVICE_FLAGS_RANDOM_DEVICEGUID_REASON_NOHWID`: UInt = 2u;
public typealias `STORAGE_DEVICE_FORM_FACTOR` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEVICE_ID_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NumberOfIdentifiers`: UInt,
    public var `Identifiers`: UByteArray,
)
// UNSUPPORTED Rust 5274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DEVICE_ID_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_IO_CAPABILITY_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `LunMaxIoCount`: UInt,
    public var `AdapterMaxIoCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_LED_STATE_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `State`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEVICE_LOCATION_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Location`: `DEVICE_LOCATION`,
    public var `StringOffset`: UInt,
)
// UNSUPPORTED Rust 5302:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DEVICE_LOCATION_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEVICE_MANAGEMENT_STATUS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Health`: `STORAGE_DISK_HEALTH_STATUS`,
    public var `NumberOfOperationalStatus`: UInt,
    public var `NumberOfAdditionalReasons`: UInt,
    public var `OperationalStatus`: Array<`STORAGE_DISK_OPERATIONAL_STATUS`>,
    public var `AdditionalReasons`: Array<`STORAGE_OPERATIONAL_REASON`>,
)
// UNSUPPORTED Rust 5318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DEVICE_MANAGEMENT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_DEVICE_MAX_OPERATIONAL_STATUS`: UInt = 16u;
public const val `STORAGE_DEVICE_NUMA_NODE_UNKNOWN`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_NUMA_PROPERTY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NumaNode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_NUMBER` (
    public var `DeviceType`: UInt,
    public var `DeviceNumber`: UInt,
    public var `PartitionNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEVICE_NUMBERS` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NumberOfDevices`: UInt,
    public var `Devices`: Array<`STORAGE_DEVICE_NUMBER`>,
)
// UNSUPPORTED Rust 5347:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DEVICE_NUMBERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_NUMBER_EX` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `DeviceType`: UInt,
    public var `DeviceNumber`: UInt,
    public var `DeviceGuid`: `windows_sys`.`core`.`GUID`,
    public var `PartitionNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_POWER_CAP` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Units`: `STORAGE_DEVICE_POWER_CAP_UNITS`,
    public var `MaxPower`: ULong,
)
public typealias `STORAGE_DEVICE_POWER_CAP_UNITS` = Int;
public const val `STORAGE_DEVICE_POWER_CAP_VERSION_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_RESILIENCY_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NameOffset`: UInt,
    public var `NumberOfLogicalCopies`: UInt,
    public var `NumberOfPhysicalCopies`: UInt,
    public var `PhysicalDiskRedundancy`: UInt,
    public var `NumberOfColumns`: UInt,
    public var `Interleave`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SupportsSelfEncryption`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SupportsSelfEncryption`: Boolean,
    public var `EncryptionType`: `STORAGE_ENCRYPTION_TYPE`,
)
// UNSUPPORTED Rust 5400:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const STORAGE_DEVICE_TELEMETRY_REGKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Registry\\Machine\\System\\CurrentControlSet\\Control\\Storage\\StorageTelemetry");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DEVICE_TIERING_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `TotalNumberOfTiers`: UInt,
    public var `NumberOfTiersReturned`: UInt,
    public var `Tiers`: Array<`STORAGE_TIER`>,
)
// UNSUPPORTED Rust 5411:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DEVICE_TIERING_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DEVICE_UNSAFE_SHUTDOWN_COUNT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `UnsafeShutdownCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_DIAGNOSTIC_DATA` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `ProviderId`: `windows_sys`.`core`.`GUID`,
    public var `BufferSize`: UInt,
    public var `Reserved`: UInt,
    public var `DiagnosticDataBuffer`: UByteArray,
)
// UNSUPPORTED Rust 5433:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_DIAGNOSTIC_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_DIAGNOSTIC_FLAG_ADAPTER_REQUEST`: UInt = 1u;
public typealias `STORAGE_DIAGNOSTIC_LEVEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_DIAGNOSTIC_REQUEST` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `TargetType`: `STORAGE_DIAGNOSTIC_TARGET_TYPE`,
    public var `Level`: `STORAGE_DIAGNOSTIC_LEVEL`,
)
public typealias `STORAGE_DIAGNOSTIC_TARGET_TYPE` = Int;
public typealias `STORAGE_DISK_HEALTH_STATUS` = Int;
public typealias `STORAGE_DISK_OPERATIONAL_STATUS` = Int;
public typealias `STORAGE_ENCRYPTION_TYPE` = Int;
public const val `STORAGE_EVENT_DEVICE_OPERATION`: ULong = 4uL;
public const val `STORAGE_EVENT_DEVICE_STATUS`: ULong = 2uL;
public const val `STORAGE_EVENT_MEDIA_STATUS`: ULong = 1uL;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_EVENT_NOTIFICATION` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Events`: ULong,
)
public const val `STORAGE_EVENT_NOTIFICATION_VERSION_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_FAILURE_PREDICTION_CONFIG` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Set`: Boolean,
    public var `Enabled`: Boolean,
    public var `Reserved`: UShort,
)
public const val `STORAGE_FAILURE_PREDICTION_CONFIG_V1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_FRU_ID_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `IdentifierSize`: UInt,
    public var `Identifier`: UByteArray,
)
// UNSUPPORTED Rust 5482:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_FRU_ID_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_GET_BC_PROPERTIES_OUTPUT` (
    public var `MaximumRequestsPerPeriod`: UInt,
    public var `MinimumPeriod`: UInt,
    public var `MaximumRequestSize`: ULong,
    public var `EstimatedTimePerRequest`: UInt,
    public var `NumOutStandingRequests`: UInt,
    public var `RequestSize`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_HOTPLUG_INFO` (
    public var `Size`: UInt,
    public var `MediaRemovable`: Boolean,
    public var `MediaHotplug`: Boolean,
    public var `DeviceHotplug`: Boolean,
    public var `WriteCacheEnableOverride`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_HW_ENDURANCE_DATA_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `EnduranceInfo`: `STORAGE_HW_ENDURANCE_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_HW_ENDURANCE_INFO` (
    public var `ValidFields`: UInt,
    public var `GroupId`: UInt,
    public var `Flags`: `STORAGE_HW_ENDURANCE_INFO_0`,
    public var `LifePercentage`: UInt,
    public var `BytesReadCount`: UByteArray,
    public var `ByteWriteCount`: UByteArray,
)
// UNSUPPORTED Rust 5523:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_HW_ENDURANCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_HW_ENDURANCE_INFO_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_HW_FIRMWARE_ACTIVATE` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Slot`: UByte,
    public var `Reserved0`: UByteArray,
)
// UNSUPPORTED Rust 5542:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_HW_FIRMWARE_ACTIVATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_HW_FIRMWARE_DOWNLOAD` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Slot`: UByte,
    public var `Reserved`: UByteArray,
    public var `Offset`: ULong,
    public var `BufferSize`: ULong,
    public var `ImageBuffer`: UByteArray,
)
// UNSUPPORTED Rust 5559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_HW_FIRMWARE_DOWNLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_HW_FIRMWARE_DOWNLOAD_V2` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Slot`: UByte,
    public var `Reserved`: UByteArray,
    public var `Offset`: ULong,
    public var `BufferSize`: ULong,
    public var `ImageSize`: UInt,
    public var `Reserved2`: UInt,
    public var `ImageBuffer`: UByteArray,
)
// UNSUPPORTED Rust 5578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_HW_FIRMWARE_DOWNLOAD_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_HW_FIRMWARE_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `_bitfield`: UByte,
    public var `SlotCount`: UByte,
    public var `ActiveSlot`: UByte,
    public var `PendingActivateSlot`: UByte,
    public var `FirmwareShared`: Boolean,
    public var `Reserved`: UByteArray,
    public var `ImagePayloadAlignment`: UInt,
    public var `ImagePayloadMaxSize`: UInt,
    public var `Slot`: Array<`STORAGE_HW_FIRMWARE_SLOT_INFO`>,
)
// UNSUPPORTED Rust 5598:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_HW_FIRMWARE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_HW_FIRMWARE_INFO_QUERY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
)
public const val `STORAGE_HW_FIRMWARE_INVALID_SLOT`: UInt = 255u;
public const val `STORAGE_HW_FIRMWARE_REQUEST_FLAG_CONTROLLER`: UInt = 1u;
public const val `STORAGE_HW_FIRMWARE_REQUEST_FLAG_FIRST_SEGMENT`: UInt = 4u;
public const val `STORAGE_HW_FIRMWARE_REQUEST_FLAG_LAST_SEGMENT`: UInt = 2u;
public const val `STORAGE_HW_FIRMWARE_REQUEST_FLAG_REPLACE_EXISTING_IMAGE`: UInt = 1073741824u;
public const val `STORAGE_HW_FIRMWARE_REQUEST_FLAG_SWITCH_TO_EXISTING_FIRMWARE`: UInt = 2147483648u;
public const val `STORAGE_HW_FIRMWARE_REVISION_LENGTH`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_HW_FIRMWARE_SLOT_INFO` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SlotNumber`: UByte,
    public var `_bitfield`: UByte,
    public var `Reserved1`: UByteArray,
    public var `Revision`: UByteArray,
)
// UNSUPPORTED Rust 5628:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_HW_FIRMWARE_SLOT_INFO {
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
public class `STORAGE_IDENTIFIER` (
    public var `CodeSet`: `STORAGE_IDENTIFIER_CODE_SET`,
    public var `Type`: `STORAGE_IDENTIFIER_TYPE`,
    public var `IdentifierSize`: UShort,
    public var `NextOffset`: UShort,
    public var `Association`: `STORAGE_ASSOCIATION_TYPE`,
    public var `Identifier`: UByteArray,
)
// UNSUPPORTED Rust 5643:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_IDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_IDENTIFIER_CODE_SET` = Int;
public typealias `STORAGE_IDENTIFIER_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_IDLE_POWER` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `_bitfield`: UInt,
    public var `D3IdleTimeout`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_IDLE_POWERUP_REASON` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `PowerupReason`: `STORAGE_POWERUP_REASON_TYPE`,
)
public const val `STORAGE_IDLE_POWERUP_REASON_VERSION_V1`: UInt = 1u;
public typealias `STORAGE_ID_NAA_FORMAT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_LB_PROVISIONING_MAP_RESOURCES` (
    public var `Size`: UInt,
    public var `Version`: UInt,
    public var `_bitfield1`: UByte,
    public var `Reserved1`: UByteArray,
    public var `_bitfield2`: UByte,
    public var `Reserved3`: UByteArray,
    public var `AvailableMappingResources`: ULong,
    public var `UsedMappingResources`: ULong,
)
// UNSUPPORTED Rust 5679:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_LB_PROVISIONING_MAP_RESOURCES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_MEDIA_SERIAL_NUMBER_DATA` (
    public var `Reserved`: UShort,
    public var `SerialNumberLength`: UShort,
    public var `SerialNumber`: UByteArray,
)
// UNSUPPORTED Rust 5691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_MEDIA_SERIAL_NUMBER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_MEDIA_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `MediumProductType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_MINIPORT_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Portdriver`: `STORAGE_PORT_CODE_SET`,
    public var `LUNResetSupported`: Boolean,
    public var `TargetResetSupported`: Boolean,
    public var `IoTimeoutValue`: UShort,
    public var `ExtraIoInfoSupported`: Boolean,
    public var `Flags`: `STORAGE_MINIPORT_DESCRIPTOR_0`,
    public var `Reserved0`: UByteArray,
    public var `Reserved1`: UInt,
)
// UNSUPPORTED Rust 5718:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_MINIPORT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5723:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_MINIPORT_DESCRIPTOR_0 {
//     pub Anonymous: STORAGE_MINIPORT_DESCRIPTOR_0_0,
//     pub AsBYTE: u8,
// }

// UNSUPPORTED Rust 5729:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_MINIPORT_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_MINIPORT_DESCRIPTOR_0_0` (
    public var `_bitfield`: UByte,
)
public const val `STORAGE_OFFLOAD_MAX_TOKEN_LENGTH`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_OFFLOAD_READ_OUTPUT` (
    public var `OffloadReadFlags`: UInt,
    public var `Reserved`: UInt,
    public var `LengthProtected`: ULong,
    public var `TokenLength`: UInt,
    public var `Token`: `STORAGE_OFFLOAD_TOKEN`,
)
// UNSUPPORTED Rust 5749:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_OFFLOAD_READ_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_OFFLOAD_READ_RANGE_TRUNCATED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_OFFLOAD_TOKEN` (
    public var `TokenType`: UByteArray,
    public var `Reserved`: UByteArray,
    public var `TokenIdLength`: UByteArray,
    public var `Anonymous`: `STORAGE_OFFLOAD_TOKEN_0`,
)
// UNSUPPORTED Rust 5763:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_OFFLOAD_TOKEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5768:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_OFFLOAD_TOKEN_0 {
//     pub StorageOffloadZeroDataToken: STORAGE_OFFLOAD_TOKEN_0_0,
//     pub Token: [u8; 504],
// }

// UNSUPPORTED Rust 5774:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_OFFLOAD_TOKEN_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 504 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_OFFLOAD_TOKEN_0_0` (
    public var `Reserved2`: UByteArray,
)
// UNSUPPORTED Rust 5784:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_OFFLOAD_TOKEN_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_OFFLOAD_TOKEN_ID_LENGTH`: UInt = 504u;
public const val `STORAGE_OFFLOAD_TOKEN_INVALID`: UInt = 2u;
public const val `STORAGE_OFFLOAD_TOKEN_TYPE_ZERO_DATA`: UInt = 4294901761u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_OFFLOAD_WRITE_OUTPUT` (
    public var `OffloadWriteFlags`: UInt,
    public var `Reserved`: UInt,
    public var `LengthCopied`: ULong,
)
public const val `STORAGE_OFFLOAD_WRITE_RANGE_TRUNCATED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_OPERATIONAL_REASON` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Reason`: `STORAGE_OPERATIONAL_STATUS_REASON`,
    public var `RawBytes`: `STORAGE_OPERATIONAL_REASON_0`,
)
// UNSUPPORTED Rust 5808:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_OPERATIONAL_REASON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5813:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_OPERATIONAL_REASON_0 {
//     pub ScsiSenseKey: STORAGE_OPERATIONAL_REASON_0_0,
//     pub NVDIMM_N: STORAGE_OPERATIONAL_REASON_0_1,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 5820:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_OPERATIONAL_REASON_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_OPERATIONAL_REASON_0_1` (
    public var `CriticalHealth`: UByte,
    public var `ModuleHealth`: UByteArray,
    public var `ErrorThresholdStatus`: UByte,
)
// UNSUPPORTED Rust 5832:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_OPERATIONAL_REASON_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_OPERATIONAL_REASON_0_0` (
    public var `SenseKey`: UByte,
    public var `ASC`: UByte,
    public var `ASCQ`: UByte,
    public var `Reserved`: UByte,
)
public typealias `STORAGE_OPERATIONAL_STATUS_REASON` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PHYSICAL_ADAPTER_DATA` (
    public var `AdapterId`: UInt,
    public var `HealthStatus`: `STORAGE_COMPONENT_HEALTH_STATUS`,
    public var `CommandProtocol`: `STORAGE_PROTOCOL_TYPE`,
    public var `SpecVersion`: `STORAGE_SPEC_VERSION`,
    public var `Vendor`: UByteArray,
    public var `Model`: UByteArray,
    public var `FirmwareRevision`: UByteArray,
    public var `PhysicalLocation`: UByteArray,
    public var `ExpanderConnected`: Boolean,
    public var `Reserved0`: UByteArray,
    public var `Reserved1`: UIntArray,
)
// UNSUPPORTED Rust 5861:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PHYSICAL_ADAPTER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PHYSICAL_DEVICE_DATA` (
    public var `DeviceId`: UInt,
    public var `Role`: UInt,
    public var `HealthStatus`: `STORAGE_COMPONENT_HEALTH_STATUS`,
    public var `CommandProtocol`: `STORAGE_PROTOCOL_TYPE`,
    public var `SpecVersion`: `STORAGE_SPEC_VERSION`,
    public var `FormFactor`: `STORAGE_DEVICE_FORM_FACTOR`,
    public var `Vendor`: UByteArray,
    public var `Model`: UByteArray,
    public var `FirmwareRevision`: UByteArray,
    public var `Capacity`: ULong,
    public var `PhysicalLocation`: UByteArray,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 5882:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PHYSICAL_DEVICE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PHYSICAL_NODE_DATA` (
    public var `NodeId`: UInt,
    public var `AdapterCount`: UInt,
    public var `AdapterDataLength`: UInt,
    public var `AdapterDataOffset`: UInt,
    public var `DeviceCount`: UInt,
    public var `DeviceDataLength`: UInt,
    public var `DeviceDataOffset`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 5899:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PHYSICAL_NODE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `NodeCount`: UInt,
    public var `Reserved`: UInt,
    public var `Node`: Array<`STORAGE_PHYSICAL_NODE_DATA`>,
)
// UNSUPPORTED Rust 5913:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PHYSICAL_TOPOLOGY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_PORT_CODE_SET` = Int;
public typealias `STORAGE_POWERUP_REASON_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PREDICT_FAILURE` (
    public var `PredictFailure`: UInt,
    public var `VendorSpecific`: UByteArray,
)
// UNSUPPORTED Rust 5926:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PREDICT_FAILURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_PRIORITY_HINT_SUPPORT` (
    public var `SupportFlags`: UInt,
)
public const val `STORAGE_PRIORITY_HINT_SUPPORTED`: UInt = 1u;
public typealias `STORAGE_PROPERTY_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PROPERTY_QUERY` (
    public var `PropertyId`: `STORAGE_PROPERTY_ID`,
    public var `QueryType`: `STORAGE_QUERY_TYPE`,
    public var `AdditionalParameters`: UByteArray,
)
// UNSUPPORTED Rust 5945:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PROPERTY_QUERY {
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
public class `STORAGE_PROPERTY_SET` (
    public var `PropertyId`: `STORAGE_PROPERTY_ID`,
    public var `SetType`: `STORAGE_SET_TYPE`,
    public var `AdditionalParameters`: UByteArray,
)
// UNSUPPORTED Rust 5957:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PROPERTY_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_PROTOCOL_ATA_DATA_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PROTOCOL_COMMAND` (
    public var `Version`: UInt,
    public var `Length`: UInt,
    public var `ProtocolType`: `STORAGE_PROTOCOL_TYPE`,
    public var `Flags`: UInt,
    public var `ReturnStatus`: UInt,
    public var `ErrorCode`: UInt,
    public var `CommandLength`: UInt,
    public var `ErrorInfoLength`: UInt,
    public var `DataToDeviceTransferLength`: UInt,
    public var `DataFromDeviceTransferLength`: UInt,
    public var `TimeOutValue`: UInt,
    public var `ErrorInfoOffset`: UInt,
    public var `DataToDeviceBufferOffset`: UInt,
    public var `DataFromDeviceBufferOffset`: UInt,
    public var `CommandSpecific`: UInt,
    public var `Reserved0`: UInt,
    public var `FixedProtocolReturnData`: UInt,
    public var `Reserved1`: UIntArray,
    public var `Command`: UByteArray,
)
// UNSUPPORTED Rust 5986:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PROTOCOL_COMMAND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_PROTOCOL_COMMAND_FLAG_ADAPTER_REQUEST`: UInt = 2147483648u;
public const val `STORAGE_PROTOCOL_COMMAND_LENGTH_NVME`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_PROTOCOL_DATA_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `ProtocolSpecificData`: `STORAGE_PROTOCOL_SPECIFIC_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_PROTOCOL_DATA_DESCRIPTOR_EXT` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `ProtocolSpecificData`: `STORAGE_PROTOCOL_SPECIFIC_DATA_EXT`,
)
// UNSUPPORTED Rust 6007:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE {
//     pub Anonymous: STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 6013:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE_0` (
    public var `_bitfield`: UInt,
)
public typealias `STORAGE_PROTOCOL_NVME_DATA_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_PROTOCOL_SPECIFIC_DATA` (
    public var `ProtocolType`: `STORAGE_PROTOCOL_TYPE`,
    public var `DataType`: UInt,
    public var `ProtocolDataRequestValue`: UInt,
    public var `ProtocolDataRequestSubValue`: UInt,
    public var `ProtocolDataOffset`: UInt,
    public var `ProtocolDataLength`: UInt,
    public var `FixedProtocolReturnData`: UInt,
    public var `ProtocolDataRequestSubValue2`: UInt,
    public var `ProtocolDataRequestSubValue3`: UInt,
    public var `ProtocolDataRequestSubValue4`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_PROTOCOL_SPECIFIC_DATA_EXT` (
    public var `ProtocolType`: `STORAGE_PROTOCOL_TYPE`,
    public var `DataType`: UInt,
    public var `ProtocolDataValue`: UInt,
    public var `ProtocolDataSubValue`: UInt,
    public var `ProtocolDataOffset`: UInt,
    public var `ProtocolDataLength`: UInt,
    public var `FixedProtocolReturnData`: UInt,
    public var `ProtocolDataSubValue2`: UInt,
    public var `ProtocolDataSubValue3`: UInt,
    public var `ProtocolDataSubValue4`: UInt,
    public var `ProtocolDataSubValue5`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 6054:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_PROTOCOL_SPECIFIC_DATA_EXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_PROTOCOL_SPECIFIC_NVME_ADMIN_COMMAND`: UInt = 1u;
public const val `STORAGE_PROTOCOL_SPECIFIC_NVME_NVM_COMMAND`: UInt = 2u;
public const val `STORAGE_PROTOCOL_STATUS_BUSY`: UInt = 5u;
public const val `STORAGE_PROTOCOL_STATUS_DATA_OVERRUN`: UInt = 6u;
public const val `STORAGE_PROTOCOL_STATUS_ERROR`: UInt = 2u;
public const val `STORAGE_PROTOCOL_STATUS_INSUFFICIENT_RESOURCES`: UInt = 7u;
public const val `STORAGE_PROTOCOL_STATUS_INVALID_REQUEST`: UInt = 3u;
public const val `STORAGE_PROTOCOL_STATUS_NOT_SUPPORTED`: UInt = 255u;
public const val `STORAGE_PROTOCOL_STATUS_NO_DEVICE`: UInt = 4u;
public const val `STORAGE_PROTOCOL_STATUS_PENDING`: UInt = 0u;
public const val `STORAGE_PROTOCOL_STATUS_SUCCESS`: UInt = 1u;
public const val `STORAGE_PROTOCOL_STATUS_THROTTLED_REQUEST`: UInt = 8u;
public const val `STORAGE_PROTOCOL_STRUCTURE_VERSION`: UInt = 1u;
public typealias `STORAGE_PROTOCOL_TYPE` = Int;
public typealias `STORAGE_PROTOCOL_UFS_DATA_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_Vhd")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY` (
    public var `EntryLength`: UInt,
    public var `DependencyTypeFlags`: UInt,
    public var `ProviderSpecificFlags`: UInt,
    public var `VirtualStorageType`: `super`.`super`.`Storage`.`Vhd`.`VIRTUAL_STORAGE_TYPE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_Vhd")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY` (
    public var `EntryLength`: UInt,
    public var `DependencyTypeFlags`: UInt,
    public var `ProviderSpecificFlags`: UInt,
    public var `VirtualStorageType`: `super`.`super`.`Storage`.`Vhd`.`VIRTUAL_STORAGE_TYPE`,
    public var `AncestorLevel`: UInt,
    public var `HostVolumeNameOffset`: UInt,
    public var `HostVolumeNameSize`: UInt,
    public var `DependentVolumeNameOffset`: UInt,
    public var `DependentVolumeNameSize`: UInt,
    public var `RelativePathOffset`: UInt,
    public var `RelativePathSize`: UInt,
    public var `DependentDeviceNameOffset`: UInt,
    public var `DependentDeviceNameSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST` (
    public var `RequestLevel`: UInt,
    public var `RequestFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_Vhd")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE` (
    public var `ResponseLevel`: UInt,
    public var `NumberEntries`: UInt,
    public var `Anonymous`: `STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE_0`,
)
// UNSUPPORTED Rust 6115:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_Vhd")]
// impl Default for STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6121:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_Vhd")]
// #[derive(Clone, Copy)]
// pub union STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE_0 {
//     pub Lev1Depends: [STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY; 1],
//     pub Lev2Depends: [STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY; 1],
// }

// UNSUPPORTED Rust 6128:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_Vhd")]
// impl Default for STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_QUERY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_READ_CAPACITY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `BlockLength`: UInt,
    public var `NumberOfBlocks`: Long,
    public var `DiskLength`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_REINITIALIZE_MEDIA` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `TimeoutInSeconds`: UInt,
    public var `SanitizeOption`: `STORAGE_REINITIALIZE_MEDIA_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_REINITIALIZE_MEDIA_0` (
    public var `_bitfield`: UInt,
)
public typealias `STORAGE_RESERVE_ID` = Int;
public typealias `STORAGE_RPMB_COMMAND_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 196 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_RPMB_DATA_FRAME` (
    public var `Stuff`: UByteArray,
    public var `KeyOrMAC`: UByteArray,
    public var `Data`: UByteArray,
    public var `Nonce`: UByteArray,
    public var `WriteCounter`: UByteArray,
    public var `Address`: UByteArray,
    public var `BlockCount`: UByteArray,
    public var `OperationResult`: UByteArray,
    public var `RequestOrResponseType`: UByteArray,
)
// UNSUPPORTED Rust 6172:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_RPMB_DATA_FRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_RPMB_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `SizeInBytes`: UInt,
    public var `MaxReliableWriteSizeInBytes`: UInt,
    public var `FrameFormat`: `STORAGE_RPMB_FRAME_TYPE`,
)
public const val `STORAGE_RPMB_DESCRIPTOR_VERSION_1`: UInt = 1u;
public typealias `STORAGE_RPMB_FRAME_TYPE` = Int;
public const val `STORAGE_RPMB_MINIMUM_RELIABLE_WRITE_SIZE`: UInt = 512u;
public typealias `STORAGE_SANITIZE_METHOD` = Int;
public typealias `STORAGE_SET_TYPE` = Int;
// UNSUPPORTED Rust 6191:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_SPEC_VERSION {
//     pub Anonymous: STORAGE_SPEC_VERSION_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 6197:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_SPEC_VERSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_SPEC_VERSION_0` (
    public var `MinorVersion`: `STORAGE_SPEC_VERSION_0_0`,
    public var `MajorVersion`: UShort,
)
// UNSUPPORTED Rust 6208:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_SPEC_VERSION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6213:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_SPEC_VERSION_0_0 {
//     pub Anonymous: STORAGE_SPEC_VERSION_0_0_0,
//     pub AsUshort: u16,
// }

// UNSUPPORTED Rust 6219:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_SPEC_VERSION_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_SPEC_VERSION_0_0_0` (
    public var `SubMinor`: UByte,
    public var `Minor`: UByte,
)
public const val `STORAGE_SUPPORTED_FEATURES_BYPASS_IO`: UInt = 1u;
public const val `STORAGE_SUPPORTED_FEATURES_MASK`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_TEMPERATURE_DATA_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `CriticalTemperature`: Short,
    public var `WarningTemperature`: Short,
    public var `InfoCount`: UShort,
    public var `Reserved0`: UByteArray,
    public var `Reserved1`: UIntArray,
    public var `TemperatureInfo`: Array<`STORAGE_TEMPERATURE_INFO`>,
)
// UNSUPPORTED Rust 6244:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_TEMPERATURE_DATA_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_TEMPERATURE_INFO` (
    public var `Index`: UShort,
    public var `Temperature`: Short,
    public var `OverThreshold`: Short,
    public var `UnderThreshold`: Short,
    public var `OverThresholdChangable`: Boolean,
    public var `UnderThresholdChangable`: Boolean,
    public var `EventGenerated`: Boolean,
    public var `Reserved0`: UByte,
    public var `Reserved1`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_TEMPERATURE_THRESHOLD` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UShort,
    public var `Index`: UShort,
    public var `Threshold`: Short,
    public var `OverThreshold`: Boolean,
    public var `Reserved`: UByte,
)
public const val `STORAGE_TEMPERATURE_THRESHOLD_FLAG_ADAPTER_REQUEST`: UInt = 1u;
public const val `STORAGE_TEMPERATURE_VALUE_NOT_REPORTED`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_TIER` (
    public var `Id`: `windows_sys`.`core`.`GUID`,
    public var `Name`: UShortArray,
    public var `Description`: UShortArray,
    public var `Flags`: ULong,
    public var `ProvisionedCapacity`: ULong,
    public var `MediaType`: `STORAGE_TIER_MEDIA_TYPE`,
    public var `Class`: `STORAGE_TIER_CLASS`,
)
// UNSUPPORTED Rust 6286:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_TIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_TIER_CLASS` = Int;
public const val `STORAGE_TIER_DESCRIPTION_LENGTH`: UInt = 512u;
public const val `STORAGE_TIER_FLAG_NO_SEEK_PENALTY`: UInt = 131072u;
public const val `STORAGE_TIER_FLAG_PARITY`: UInt = 8388608u;
public const val `STORAGE_TIER_FLAG_READ_CACHE`: UInt = 4194304u;
public const val `STORAGE_TIER_FLAG_SMR`: UInt = 16777216u;
public const val `STORAGE_TIER_FLAG_WRITE_BACK_CACHE`: UInt = 2097152u;
public typealias `STORAGE_TIER_MEDIA_TYPE` = Int;
public const val `STORAGE_TIER_NAME_LENGTH`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_TIER_REGION` (
    public var `TierId`: `windows_sys`.`core`.`GUID`,
    public var `Offset`: ULong,
    public var `Length`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_WRITE_CACHE_PROPERTY` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `WriteCacheType`: `WRITE_CACHE_TYPE`,
    public var `WriteCacheEnabled`: `WRITE_CACHE_ENABLE`,
    public var `WriteCacheChangeable`: `WRITE_CACHE_CHANGE`,
    public var `WriteThroughSupported`: `WRITE_THROUGH`,
    public var `FlushCacheSupported`: Boolean,
    public var `UserDefinedPowerProtection`: Boolean,
    public var `NVCacheEnabled`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_ZONED_DEVICE_DESCRIPTOR` (
    public var `Version`: UInt,
    public var `Size`: UInt,
    public var `DeviceType`: `STORAGE_ZONED_DEVICE_TYPES`,
    public var `ZoneCount`: UInt,
    public var `ZoneAttributes`: `STORAGE_ZONED_DEVICE_DESCRIPTOR_0`,
    public var `ZoneGroupCount`: UInt,
    public var `ZoneGroup`: Array<`STORAGE_ZONE_GROUP`>,
)
// UNSUPPORTED Rust 6331:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_ZONED_DEVICE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6336:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STORAGE_ZONED_DEVICE_DESCRIPTOR_0 {
//     pub SequentialRequiredZone: STORAGE_ZONED_DEVICE_DESCRIPTOR_0_0,
//     pub SequentialPreferredZone: STORAGE_ZONED_DEVICE_DESCRIPTOR_0_1,
// }

// UNSUPPORTED Rust 6342:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_ZONED_DEVICE_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ZONED_DEVICE_DESCRIPTOR_0_1` (
    public var `OptimalOpenZoneCount`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_ZONED_DEVICE_DESCRIPTOR_0_0` (
    public var `MaxOpenZoneCount`: UInt,
    public var `UnrestrictedRead`: Boolean,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 6360:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_ZONED_DEVICE_DESCRIPTOR_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STORAGE_ZONED_DEVICE_TYPES` = Int;
public typealias `STORAGE_ZONES_ATTRIBUTES` = Int;
public typealias `STORAGE_ZONE_CONDITION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STORAGE_ZONE_DESCRIPTOR` (
    public var `Size`: UInt,
    public var `ZoneType`: `STORAGE_ZONE_TYPES`,
    public var `ZoneCondition`: `STORAGE_ZONE_CONDITION`,
    public var `ResetWritePointerRecommend`: Boolean,
    public var `Reserved0`: UByteArray,
    public var `ZoneSize`: ULong,
    public var `WritePointerOffset`: ULong,
)
// UNSUPPORTED Rust 6379:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STORAGE_ZONE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_ZONE_GROUP` (
    public var `ZoneCount`: UInt,
    public var `ZoneType`: `STORAGE_ZONE_TYPES`,
    public var `ZoneSize`: ULong,
)
public typealias `STORAGE_ZONE_TYPES` = Int;
public const val `STORATTRIBUTE_MANAGEMENT_STATE`: UInt = 1u;
public const val `STORATTRIBUTE_NONE`: UInt = 0u;
public const val `STREAMS_ASSOCIATE_ID_CLEAR`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STREAMS_ASSOCIATE_ID_INPUT_BUFFER` (
    public var `Flags`: UInt,
    public var `StreamId`: UInt,
)
public const val `STREAMS_ASSOCIATE_ID_SET`: UInt = 2u;
public const val `STREAMS_INVALID_ID`: UInt = 0u;
public const val `STREAMS_MAX_ID`: UInt = 65535u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STREAMS_QUERY_ID_OUTPUT_BUFFER` (
    public var `StreamId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STREAMS_QUERY_PARAMETERS_OUTPUT_BUFFER` (
    public var `OptimalWriteSize`: UInt,
    public var `StreamGranularitySize`: UInt,
    public var `StreamIdMin`: UInt,
    public var `StreamIdMax`: UInt,
)
public const val `STREAM_CLEAR_ENCRYPTION`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STREAM_EXTENT_ENTRY` (
    public var `Flags`: UInt,
    public var `ExtentInformation`: `STREAM_EXTENT_ENTRY_0`,
)
// UNSUPPORTED Rust 6424:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STREAM_EXTENT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6429:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STREAM_EXTENT_ENTRY_0 {
//     pub RetrievalPointers: RETRIEVAL_POINTERS_BUFFER,
// }

// UNSUPPORTED Rust 6434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STREAM_EXTENT_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STREAM_EXTENT_ENTRY_ALL_EXTENTS`: UInt = 2u;
public const val `STREAM_EXTENT_ENTRY_AS_RETRIEVAL_POINTERS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STREAM_INFORMATION_ENTRY` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `StreamInformation`: `STREAM_INFORMATION_ENTRY_0`,
)
// UNSUPPORTED Rust 6448:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STREAM_INFORMATION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6453:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STREAM_INFORMATION_ENTRY_0 {
//     pub DesiredStorageClass: STREAM_INFORMATION_ENTRY_0_0,
//     pub DataStream: STREAM_INFORMATION_ENTRY_0_1,
//     pub Reparse: STREAM_INFORMATION_ENTRY_0_2,
//     pub Ea: STREAM_INFORMATION_ENTRY_0_3,
// }

// UNSUPPORTED Rust 6461:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STREAM_INFORMATION_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STREAM_INFORMATION_ENTRY_0_1` (
    public var `Length`: UShort,
    public var `Flags`: UShort,
    public var `Reserved`: UInt,
    public var `Vdl`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STREAM_INFORMATION_ENTRY_0_0` (
    public var `Class`: `FILE_STORAGE_TIER_CLASS`,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STREAM_INFORMATION_ENTRY_0_3` (
    public var `Length`: UShort,
    public var `Flags`: UShort,
    public var `EaSize`: UInt,
    public var `EaInformationOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STREAM_INFORMATION_ENTRY_0_2` (
    public var `Length`: UShort,
    public var `Flags`: UShort,
    public var `ReparseDataSize`: UInt,
    public var `ReparseDataOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STREAM_LAYOUT_ENTRY` (
    public var `Version`: UInt,
    public var `NextStreamOffset`: UInt,
    public var `Flags`: UInt,
    public var `ExtentInformationOffset`: UInt,
    public var `AllocationSize`: Long,
    public var `EndOfFile`: Long,
    public var `StreamInformationOffset`: UInt,
    public var `AttributeTypeCode`: UInt,
    public var `AttributeFlags`: UInt,
    public var `StreamIdentifierLength`: UInt,
    public var `StreamIdentifier`: UShortArray,
)
// UNSUPPORTED Rust 6511:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STREAM_LAYOUT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STREAM_LAYOUT_ENTRY_HAS_INFORMATION`: UInt = 16u;
public const val `STREAM_LAYOUT_ENTRY_IMMOVABLE`: UInt = 1u;
public const val `STREAM_LAYOUT_ENTRY_NO_CLUSTERS_ALLOCATED`: UInt = 8u;
public const val `STREAM_LAYOUT_ENTRY_PINNED`: UInt = 2u;
public const val `STREAM_LAYOUT_ENTRY_RESIDENT`: UInt = 4u;
public const val `STREAM_SET_ENCRYPTION`: UInt = 3u;
public const val `SYQUEST_EZ135`: `STORAGE_MEDIA_TYPE` = 75;
public const val `SYQUEST_EZFLYER`: `STORAGE_MEDIA_TYPE` = 76;
public const val `SYQUEST_SYJET`: `STORAGE_MEDIA_TYPE` = 77;
public const val `ScmBusFirmwareActivationState_Armed`: `SCM_BUS_FIRMWARE_ACTIVATION_STATE` = 1;
public const val `ScmBusFirmwareActivationState_Busy`: `SCM_BUS_FIRMWARE_ACTIVATION_STATE` = 2;
public const val `ScmBusFirmwareActivationState_Idle`: `SCM_BUS_FIRMWARE_ACTIVATION_STATE` = 0;
public const val `ScmBusProperty_DedicatedMemoryInfo`: `SCM_BUS_PROPERTY_ID` = 1;
public const val `ScmBusProperty_DedicatedMemoryState`: `SCM_BUS_PROPERTY_ID` = 2;
public const val `ScmBusProperty_Max`: `SCM_BUS_PROPERTY_ID` = 3;
public const val `ScmBusProperty_RuntimeFwActivationInfo`: `SCM_BUS_PROPERTY_ID` = 0;
public const val `ScmBusQuery_Descriptor`: `SCM_BUS_QUERY_TYPE` = 0;
public const val `ScmBusQuery_IsSupported`: `SCM_BUS_QUERY_TYPE` = 1;
public const val `ScmBusQuery_Max`: `SCM_BUS_QUERY_TYPE` = 2;
public const val `ScmBusSet_Descriptor`: `SCM_BUS_SET_TYPE` = 0;
public const val `ScmBusSet_IsSupported`: `SCM_BUS_SET_TYPE` = 1;
public const val `ScmBusSet_Max`: `SCM_BUS_SET_TYPE` = 2;
public const val `ScmPdFirmwareActivationState_Armed`: `SCM_PD_FIRMWARE_ACTIVATION_STATE` = 1;
public const val `ScmPdFirmwareActivationState_Busy`: `SCM_PD_FIRMWARE_ACTIVATION_STATE` = 2;
public const val `ScmPdFirmwareActivationState_Idle`: `SCM_PD_FIRMWARE_ACTIVATION_STATE` = 0;
public const val `ScmPdLastFwActivaitonStatus_ActivationInProgress`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 4;
public const val `ScmPdLastFwActivaitonStatus_FwUnsupported`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 6;
public const val `ScmPdLastFwActivaitonStatus_Retry`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 5;
public const val `ScmPdLastFwActivaitonStatus_UnknownError`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 7;
public const val `ScmPdLastFwActivationStatus_ColdRebootRequired`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 3;
public const val `ScmPdLastFwActivationStatus_FwNotFound`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 2;
public const val `ScmPdLastFwActivationStatus_None`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 0;
public const val `ScmPdLastFwActivationStatus_Success`: `SCM_PD_LAST_FW_ACTIVATION_STATUS` = 1;
public const val `ScmPhysicalDeviceHealth_Healthy`: `SCM_PD_HEALTH_STATUS` = 3;
public const val `ScmPhysicalDeviceHealth_Max`: `SCM_PD_HEALTH_STATUS` = 4;
public const val `ScmPhysicalDeviceHealth_Unhealthy`: `SCM_PD_HEALTH_STATUS` = 1;
public const val `ScmPhysicalDeviceHealth_Unknown`: `SCM_PD_HEALTH_STATUS` = 0;
public const val `ScmPhysicalDeviceHealth_Warning`: `SCM_PD_HEALTH_STATUS` = 2;
public const val `ScmPhysicalDeviceOpReason_BackgroundOperation`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 9;
public const val `ScmPhysicalDeviceOpReason_Component`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 8;
public const val `ScmPhysicalDeviceOpReason_Configuration`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 5;
public const val `ScmPhysicalDeviceOpReason_DataPersistenceLossImminent`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 17;
public const val `ScmPhysicalDeviceOpReason_DeviceController`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 6;
public const val `ScmPhysicalDeviceOpReason_DisabledByPlatform`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 13;
public const val `ScmPhysicalDeviceOpReason_EnergySource`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 4;
public const val `ScmPhysicalDeviceOpReason_ExcessiveTemperature`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 21;
public const val `ScmPhysicalDeviceOpReason_FatalError`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 16;
public const val `ScmPhysicalDeviceOpReason_HealthCheck`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 11;
public const val `ScmPhysicalDeviceOpReason_InternalFailure`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 22;
public const val `ScmPhysicalDeviceOpReason_InvalidFirmware`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 10;
public const val `ScmPhysicalDeviceOpReason_LostData`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 3;
public const val `ScmPhysicalDeviceOpReason_LostDataPersistence`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 12;
public const val `ScmPhysicalDeviceOpReason_LostWritePersistence`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 15;
public const val `ScmPhysicalDeviceOpReason_Max`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 23;
public const val `ScmPhysicalDeviceOpReason_Media`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 1;
public const val `ScmPhysicalDeviceOpReason_MediaController`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 7;
public const val `ScmPhysicalDeviceOpReason_MediaRemainingSpareBlock`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 19;
public const val `ScmPhysicalDeviceOpReason_PerformanceDegradation`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 20;
public const val `ScmPhysicalDeviceOpReason_PermanentError`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 14;
public const val `ScmPhysicalDeviceOpReason_ThresholdExceeded`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 2;
public const val `ScmPhysicalDeviceOpReason_Unknown`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 0;
public const val `ScmPhysicalDeviceOpReason_WritePersistenceLossImminent`: `SCM_PD_OPERATIONAL_STATUS_REASON` = 18;
public const val `ScmPhysicalDeviceOpStatus_HardwareError`: `SCM_PD_OPERATIONAL_STATUS` = 4;
public const val `ScmPhysicalDeviceOpStatus_InService`: `SCM_PD_OPERATIONAL_STATUS` = 3;
public const val `ScmPhysicalDeviceOpStatus_Max`: `SCM_PD_OPERATIONAL_STATUS` = 8;
public const val `ScmPhysicalDeviceOpStatus_Missing`: `SCM_PD_OPERATIONAL_STATUS` = 7;
public const val `ScmPhysicalDeviceOpStatus_NotUsable`: `SCM_PD_OPERATIONAL_STATUS` = 5;
public const val `ScmPhysicalDeviceOpStatus_Ok`: `SCM_PD_OPERATIONAL_STATUS` = 1;
public const val `ScmPhysicalDeviceOpStatus_PredictingFailure`: `SCM_PD_OPERATIONAL_STATUS` = 2;
public const val `ScmPhysicalDeviceOpStatus_TransientError`: `SCM_PD_OPERATIONAL_STATUS` = 6;
public const val `ScmPhysicalDeviceOpStatus_Unknown`: `SCM_PD_OPERATIONAL_STATUS` = 0;
public const val `ScmPhysicalDeviceProperty_DeviceHandle`: `SCM_PD_PROPERTY_ID` = 5;
public const val `ScmPhysicalDeviceProperty_DeviceInfo`: `SCM_PD_PROPERTY_ID` = 0;
public const val `ScmPhysicalDeviceProperty_DeviceSpecificInfo`: `SCM_PD_PROPERTY_ID` = 4;
public const val `ScmPhysicalDeviceProperty_FirmwareInfo`: `SCM_PD_PROPERTY_ID` = 2;
public const val `ScmPhysicalDeviceProperty_FruIdString`: `SCM_PD_PROPERTY_ID` = 6;
public const val `ScmPhysicalDeviceProperty_LocationString`: `SCM_PD_PROPERTY_ID` = 3;
public const val `ScmPhysicalDeviceProperty_ManagementStatus`: `SCM_PD_PROPERTY_ID` = 1;
public const val `ScmPhysicalDeviceProperty_Max`: `SCM_PD_PROPERTY_ID` = 9;
public const val `ScmPhysicalDeviceProperty_RuntimeFwActivationArmState`: `SCM_PD_PROPERTY_ID` = 8;
public const val `ScmPhysicalDeviceProperty_RuntimeFwActivationInfo`: `SCM_PD_PROPERTY_ID` = 7;
public const val `ScmPhysicalDeviceQuery_Descriptor`: `SCM_PD_QUERY_TYPE` = 0;
public const val `ScmPhysicalDeviceQuery_IsSupported`: `SCM_PD_QUERY_TYPE` = 1;
public const val `ScmPhysicalDeviceQuery_Max`: `SCM_PD_QUERY_TYPE` = 2;
public const val `ScmPhysicalDeviceReinit_ColdBootNeeded`: `SCM_PD_MEDIA_REINITIALIZATION_STATUS` = 2;
public const val `ScmPhysicalDeviceReinit_Max`: `SCM_PD_MEDIA_REINITIALIZATION_STATUS` = 3;
public const val `ScmPhysicalDeviceReinit_RebootNeeded`: `SCM_PD_MEDIA_REINITIALIZATION_STATUS` = 1;
public const val `ScmPhysicalDeviceReinit_Success`: `SCM_PD_MEDIA_REINITIALIZATION_STATUS` = 0;
public const val `ScmPhysicalDeviceSet_Descriptor`: `SCM_PD_SET_TYPE` = 0;
public const val `ScmPhysicalDeviceSet_IsSupported`: `SCM_PD_SET_TYPE` = 1;
public const val `ScmPhysicalDeviceSet_Max`: `SCM_PD_SET_TYPE` = 2;
public const val `ScmRegionFlagLabel`: `SCM_REGION_FLAG` = 1;
public const val `ScmRegionFlagNone`: `SCM_REGION_FLAG` = 0;
public const val `ShrinkAbort`: `SHRINK_VOLUME_REQUEST_TYPES` = 3;
public const val `ShrinkCommit`: `SHRINK_VOLUME_REQUEST_TYPES` = 2;
public const val `ShrinkPrepare`: `SHRINK_VOLUME_REQUEST_TYPES` = 1;
public const val `SmrGcActionPause`: `REFS_SMR_VOLUME_GC_ACTION` = 3;
public const val `SmrGcActionStart`: `REFS_SMR_VOLUME_GC_ACTION` = 1;
public const val `SmrGcActionStartFullSpeed`: `REFS_SMR_VOLUME_GC_ACTION` = 2;
public const val `SmrGcActionStop`: `REFS_SMR_VOLUME_GC_ACTION` = 4;
public const val `SmrGcMethodCompaction`: `REFS_SMR_VOLUME_GC_METHOD` = 1;
public const val `SmrGcMethodCompression`: `REFS_SMR_VOLUME_GC_METHOD` = 2;
public const val `SmrGcMethodRotation`: `REFS_SMR_VOLUME_GC_METHOD` = 3;
public const val `SmrGcStateActive`: `REFS_SMR_VOLUME_GC_STATE` = 2;
public const val `SmrGcStateActiveFullSpeed`: `REFS_SMR_VOLUME_GC_STATE` = 3;
public const val `SmrGcStateInactive`: `REFS_SMR_VOLUME_GC_STATE` = 0;
public const val `SmrGcStatePaused`: `REFS_SMR_VOLUME_GC_STATE` = 1;
public const val `StorAttributeMgmt_ClearAttribute`: `STORAGE_ATTRIBUTE_MGMT_ACTION` = 0;
public const val `StorAttributeMgmt_ResetAttribute`: `STORAGE_ATTRIBUTE_MGMT_ACTION` = 2;
public const val `StorAttributeMgmt_SetAttribute`: `STORAGE_ATTRIBUTE_MGMT_ACTION` = 1;
public const val `StorRpmbAuthenticatedDeviceConfigRead`: `STORAGE_RPMB_COMMAND_TYPE` = 7;
public const val `StorRpmbAuthenticatedDeviceConfigWrite`: `STORAGE_RPMB_COMMAND_TYPE` = 6;
public const val `StorRpmbAuthenticatedRead`: `STORAGE_RPMB_COMMAND_TYPE` = 4;
public const val `StorRpmbAuthenticatedWrite`: `STORAGE_RPMB_COMMAND_TYPE` = 3;
public const val `StorRpmbProgramAuthKey`: `STORAGE_RPMB_COMMAND_TYPE` = 1;
public const val `StorRpmbQueryWriteCounter`: `STORAGE_RPMB_COMMAND_TYPE` = 2;
public const val `StorRpmbReadResultRequest`: `STORAGE_RPMB_COMMAND_TYPE` = 5;
public const val `StorageAccessAlignmentProperty`: `STORAGE_PROPERTY_ID` = 6;
public const val `StorageAdapterCryptoProperty`: `STORAGE_PROPERTY_ID` = 17;
public const val `StorageAdapterPhysicalTopologyProperty`: `STORAGE_PROPERTY_ID` = 53;
public const val `StorageAdapterProperty`: `STORAGE_PROPERTY_ID` = 1;
public const val `StorageAdapterProtocolSpecificProperty`: `STORAGE_PROPERTY_ID` = 49;
public const val `StorageAdapterRpmbProperty`: `STORAGE_PROPERTY_ID` = 16;
public const val `StorageAdapterSerialNumberProperty`: `STORAGE_PROPERTY_ID` = 57;
public const val `StorageAdapterTemperatureProperty`: `STORAGE_PROPERTY_ID` = 51;
public const val `StorageCounterTypeFlushLatency100NSMax`: `STORAGE_COUNTER_TYPE` = 20;
public const val `StorageCounterTypeLoadUnloadCycleCount`: `STORAGE_COUNTER_TYPE` = 12;
public const val `StorageCounterTypeLoadUnloadCycleCountMax`: `STORAGE_COUNTER_TYPE` = 13;
public const val `StorageCounterTypeManufactureDate`: `STORAGE_COUNTER_TYPE` = 9;
public const val `StorageCounterTypeMax`: `STORAGE_COUNTER_TYPE` = 21;
public const val `StorageCounterTypePowerOnHours`: `STORAGE_COUNTER_TYPE` = 17;
public const val `StorageCounterTypeReadErrorsCorrected`: `STORAGE_COUNTER_TYPE` = 4;
public const val `StorageCounterTypeReadErrorsTotal`: `STORAGE_COUNTER_TYPE` = 3;
public const val `StorageCounterTypeReadErrorsUncorrected`: `STORAGE_COUNTER_TYPE` = 5;
public const val `StorageCounterTypeReadLatency100NSMax`: `STORAGE_COUNTER_TYPE` = 18;
public const val `StorageCounterTypeStartStopCycleCount`: `STORAGE_COUNTER_TYPE` = 10;
public const val `StorageCounterTypeStartStopCycleCountMax`: `STORAGE_COUNTER_TYPE` = 11;
public const val `StorageCounterTypeTemperatureCelsius`: `STORAGE_COUNTER_TYPE` = 1;
public const val `StorageCounterTypeTemperatureCelsiusMax`: `STORAGE_COUNTER_TYPE` = 2;
public const val `StorageCounterTypeUnknown`: `STORAGE_COUNTER_TYPE` = 0;
public const val `StorageCounterTypeWearPercentage`: `STORAGE_COUNTER_TYPE` = 14;
public const val `StorageCounterTypeWearPercentageMax`: `STORAGE_COUNTER_TYPE` = 16;
public const val `StorageCounterTypeWearPercentageWarning`: `STORAGE_COUNTER_TYPE` = 15;
public const val `StorageCounterTypeWriteErrorsCorrected`: `STORAGE_COUNTER_TYPE` = 7;
public const val `StorageCounterTypeWriteErrorsTotal`: `STORAGE_COUNTER_TYPE` = 6;
public const val `StorageCounterTypeWriteErrorsUncorrected`: `STORAGE_COUNTER_TYPE` = 8;
public const val `StorageCounterTypeWriteLatency100NSMax`: `STORAGE_COUNTER_TYPE` = 19;
public const val `StorageCryptoAlgorithmAESECB`: `STORAGE_CRYPTO_ALGORITHM_ID` = 3;
public const val `StorageCryptoAlgorithmBitlockerAESCBC`: `STORAGE_CRYPTO_ALGORITHM_ID` = 2;
public const val `StorageCryptoAlgorithmESSIVAESCBC`: `STORAGE_CRYPTO_ALGORITHM_ID` = 4;
public const val `StorageCryptoAlgorithmMax`: `STORAGE_CRYPTO_ALGORITHM_ID` = 5;
public const val `StorageCryptoAlgorithmUnknown`: `STORAGE_CRYPTO_ALGORITHM_ID` = 0;
public const val `StorageCryptoAlgorithmXTSAES`: `STORAGE_CRYPTO_ALGORITHM_ID` = 1;
public const val `StorageCryptoKeySize128Bits`: `STORAGE_CRYPTO_KEY_SIZE` = 1;
public const val `StorageCryptoKeySize192Bits`: `STORAGE_CRYPTO_KEY_SIZE` = 2;
public const val `StorageCryptoKeySize256Bits`: `STORAGE_CRYPTO_KEY_SIZE` = 3;
public const val `StorageCryptoKeySize512Bits`: `STORAGE_CRYPTO_KEY_SIZE` = 4;
public const val `StorageCryptoKeySizeUnknown`: `STORAGE_CRYPTO_KEY_SIZE` = 0;
public const val `StorageDeviceAttributesProperty`: `STORAGE_PROPERTY_ID` = 55;
public const val `StorageDeviceCopyOffloadProperty`: `STORAGE_PROPERTY_ID` = 13;
public const val `StorageDeviceDeviceTelemetryProperty`: `STORAGE_PROPERTY_ID` = 10;
public const val `StorageDeviceEnduranceProperty`: `STORAGE_PROPERTY_ID` = 62;
public const val `StorageDeviceIdProperty`: `STORAGE_PROPERTY_ID` = 2;
public const val `StorageDeviceIoCapabilityProperty`: `STORAGE_PROPERTY_ID` = 48;
public const val `StorageDeviceLBProvisioningProperty`: `STORAGE_PROPERTY_ID` = 11;
public const val `StorageDeviceLedStateProperty`: `STORAGE_PROPERTY_ID` = 63;
public const val `StorageDeviceLocationProperty`: `STORAGE_PROPERTY_ID` = 58;
public const val `StorageDeviceManagementStatus`: `STORAGE_PROPERTY_ID` = 56;
public const val `StorageDeviceMediumProductType`: `STORAGE_PROPERTY_ID` = 15;
public const val `StorageDeviceNumaProperty`: `STORAGE_PROPERTY_ID` = 59;
public const val `StorageDevicePhysicalTopologyProperty`: `STORAGE_PROPERTY_ID` = 54;
public const val `StorageDevicePowerCapUnitsMilliwatts`: `STORAGE_DEVICE_POWER_CAP_UNITS` = 1;
public const val `StorageDevicePowerCapUnitsPercent`: `STORAGE_DEVICE_POWER_CAP_UNITS` = 0;
public const val `StorageDevicePowerProperty`: `STORAGE_PROPERTY_ID` = 12;
public const val `StorageDeviceProperty`: `STORAGE_PROPERTY_ID` = 0;
public const val `StorageDeviceProtocolSpecificProperty`: `STORAGE_PROPERTY_ID` = 50;
public const val `StorageDeviceResiliencyProperty`: `STORAGE_PROPERTY_ID` = 14;
public const val `StorageDeviceSeekPenaltyProperty`: `STORAGE_PROPERTY_ID` = 7;
public const val `StorageDeviceSelfEncryptionProperty`: `STORAGE_PROPERTY_ID` = 64;
public const val `StorageDeviceTemperatureProperty`: `STORAGE_PROPERTY_ID` = 52;
public const val `StorageDeviceTrimProperty`: `STORAGE_PROPERTY_ID` = 8;
public const val `StorageDeviceUniqueIdProperty`: `STORAGE_PROPERTY_ID` = 3;
public const val `StorageDeviceUnsafeShutdownCount`: `STORAGE_PROPERTY_ID` = 61;
public const val `StorageDeviceWriteAggregationProperty`: `STORAGE_PROPERTY_ID` = 9;
public const val `StorageDeviceWriteCacheProperty`: `STORAGE_PROPERTY_ID` = 4;
public const val `StorageDeviceZonedDeviceProperty`: `STORAGE_PROPERTY_ID` = 60;
public const val `StorageDiagnosticLevelDefault`: `STORAGE_DIAGNOSTIC_LEVEL` = 0;
public const val `StorageDiagnosticLevelMax`: `STORAGE_DIAGNOSTIC_LEVEL` = 1;
public const val `StorageDiagnosticTargetTypeHbaFirmware`: `STORAGE_DIAGNOSTIC_TARGET_TYPE` = 3;
public const val `StorageDiagnosticTargetTypeMax`: `STORAGE_DIAGNOSTIC_TARGET_TYPE` = 4;
public const val `StorageDiagnosticTargetTypeMiniport`: `STORAGE_DIAGNOSTIC_TARGET_TYPE` = 2;
public const val `StorageDiagnosticTargetTypePort`: `STORAGE_DIAGNOSTIC_TARGET_TYPE` = 1;
public const val `StorageDiagnosticTargetTypeUndefined`: `STORAGE_DIAGNOSTIC_TARGET_TYPE` = 0;
public const val `StorageEncryptionTypeEDrive`: `STORAGE_ENCRYPTION_TYPE` = 1;
public const val `StorageEncryptionTypeTcgOpal`: `STORAGE_ENCRYPTION_TYPE` = 2;
public const val `StorageEncryptionTypeUnknown`: `STORAGE_ENCRYPTION_TYPE` = 0;
public const val `StorageFruIdProperty`: `STORAGE_PROPERTY_ID` = 65;
public const val `StorageIdAssocDevice`: `STORAGE_ASSOCIATION_TYPE` = 0;
public const val `StorageIdAssocPort`: `STORAGE_ASSOCIATION_TYPE` = 1;
public const val `StorageIdAssocTarget`: `STORAGE_ASSOCIATION_TYPE` = 2;
public const val `StorageIdCodeSetAscii`: `STORAGE_IDENTIFIER_CODE_SET` = 2;
public const val `StorageIdCodeSetBinary`: `STORAGE_IDENTIFIER_CODE_SET` = 1;
public const val `StorageIdCodeSetReserved`: `STORAGE_IDENTIFIER_CODE_SET` = 0;
public const val `StorageIdCodeSetUtf8`: `STORAGE_IDENTIFIER_CODE_SET` = 3;
public const val `StorageIdNAAFormatIEEEERegisteredExtended`: `STORAGE_ID_NAA_FORMAT` = 5;
public const val `StorageIdNAAFormatIEEEExtended`: `STORAGE_ID_NAA_FORMAT` = 2;
public const val `StorageIdNAAFormatIEEERegistered`: `STORAGE_ID_NAA_FORMAT` = 3;
public const val `StorageIdTypeEUI64`: `STORAGE_IDENTIFIER_TYPE` = 2;
public const val `StorageIdTypeFCPHName`: `STORAGE_IDENTIFIER_TYPE` = 3;
public const val `StorageIdTypeLogicalUnitGroup`: `STORAGE_IDENTIFIER_TYPE` = 6;
public const val `StorageIdTypeMD5LogicalUnitIdentifier`: `STORAGE_IDENTIFIER_TYPE` = 7;
public const val `StorageIdTypePortRelative`: `STORAGE_IDENTIFIER_TYPE` = 4;
public const val `StorageIdTypeScsiNameString`: `STORAGE_IDENTIFIER_TYPE` = 8;
public const val `StorageIdTypeTargetPortGroup`: `STORAGE_IDENTIFIER_TYPE` = 5;
public const val `StorageIdTypeVendorId`: `STORAGE_IDENTIFIER_TYPE` = 1;
public const val `StorageIdTypeVendorSpecific`: `STORAGE_IDENTIFIER_TYPE` = 0;
public const val `StorageMiniportProperty`: `STORAGE_PROPERTY_ID` = 5;
public const val `StoragePortCodeSetATAport`: `STORAGE_PORT_CODE_SET` = 4;
public const val `StoragePortCodeSetReserved`: `STORAGE_PORT_CODE_SET` = 0;
public const val `StoragePortCodeSetSBP2port`: `STORAGE_PORT_CODE_SET` = 6;
public const val `StoragePortCodeSetSCSIport`: `STORAGE_PORT_CODE_SET` = 2;
public const val `StoragePortCodeSetSDport`: `STORAGE_PORT_CODE_SET` = 7;
public const val `StoragePortCodeSetSpaceport`: `STORAGE_PORT_CODE_SET` = 3;
public const val `StoragePortCodeSetStorport`: `STORAGE_PORT_CODE_SET` = 1;
public const val `StoragePortCodeSetUSBport`: `STORAGE_PORT_CODE_SET` = 5;
public const val `StoragePowerupDeviceAttention`: `STORAGE_POWERUP_REASON_TYPE` = 2;
public const val `StoragePowerupIO`: `STORAGE_POWERUP_REASON_TYPE` = 1;
public const val `StoragePowerupUnknown`: `STORAGE_POWERUP_REASON_TYPE` = 0;
public const val `StorageReserveIdHard`: `STORAGE_RESERVE_ID` = 1;
public const val `StorageReserveIdMax`: `STORAGE_RESERVE_ID` = 4;
public const val `StorageReserveIdNone`: `STORAGE_RESERVE_ID` = 0;
public const val `StorageReserveIdSoft`: `STORAGE_RESERVE_ID` = 2;
public const val `StorageReserveIdUpdateScratch`: `STORAGE_RESERVE_ID` = 3;
public const val `StorageRpmbFrameTypeMax`: `STORAGE_RPMB_FRAME_TYPE` = 2;
public const val `StorageRpmbFrameTypeStandard`: `STORAGE_RPMB_FRAME_TYPE` = 1;
public const val `StorageRpmbFrameTypeUnknown`: `STORAGE_RPMB_FRAME_TYPE` = 0;
public const val `StorageSanitizeMethodBlockErase`: `STORAGE_SANITIZE_METHOD` = 1;
public const val `StorageSanitizeMethodCryptoErase`: `STORAGE_SANITIZE_METHOD` = 2;
public const val `StorageSanitizeMethodDefault`: `STORAGE_SANITIZE_METHOD` = 0;
public const val `StorageTierClassCapacity`: `STORAGE_TIER_CLASS` = 1;
public const val `StorageTierClassMax`: `STORAGE_TIER_CLASS` = 3;
public const val `StorageTierClassPerformance`: `STORAGE_TIER_CLASS` = 2;
public const val `StorageTierClassUnspecified`: `STORAGE_TIER_CLASS` = 0;
public const val `StorageTierMediaTypeDisk`: `STORAGE_TIER_MEDIA_TYPE` = 1;
public const val `StorageTierMediaTypeMax`: `STORAGE_TIER_MEDIA_TYPE` = 5;
public const val `StorageTierMediaTypeScm`: `STORAGE_TIER_MEDIA_TYPE` = 4;
public const val `StorageTierMediaTypeSsd`: `STORAGE_TIER_MEDIA_TYPE` = 2;
public const val `StorageTierMediaTypeUnspecified`: `STORAGE_TIER_MEDIA_TYPE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_GET_STATISTICS` (
    public var `Operation`: UInt,
)
public const val `TAPE_RESET_STATISTICS`: Int = 2;
public const val `TAPE_RETURN_ENV_INFO`: Int = 1;
public const val `TAPE_RETURN_STATISTICS`: Int = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_STATISTICS` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `RecoveredWrites`: Long,
    public var `UnrecoveredWrites`: Long,
    public var `RecoveredReads`: Long,
    public var `UnrecoveredReads`: Long,
    public var `CompressionRatioReads`: UByte,
    public var `CompressionRatioWrites`: UByte,
)
public const val `TCCollectionApplicationRequested`: `DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE` = 2;
public const val `TCCollectionBugCheck`: `DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE` = 1;
public const val `TCCollectionDeviceRequested`: `DEVICEDUMP_COLLECTION_TYPEIDE_NOTIFICATION_TYPE` = 3;
public const val `TC_DEVICEDUMP_SUBSECTION_DESC_LENGTH`: UInt = 16u;
// UNSUPPORTED Rust 6788:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TC_PUBLIC_DATA_TYPE_ATAGP: windows_sys::core::PCSTR = windows_sys::core::s!("ATAGPLogPages");

// UNSUPPORTED Rust 6789:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TC_PUBLIC_DATA_TYPE_ATASMART: windows_sys::core::PCSTR = windows_sys::core::s!("ATASMARTPages");

public const val `TC_PUBLIC_DEVICEDUMP_CONTENT_GPLOG`: UInt = 2u;
public const val `TC_PUBLIC_DEVICEDUMP_CONTENT_GPLOG_MAX`: UInt = 16u;
public const val `TC_PUBLIC_DEVICEDUMP_CONTENT_SMART`: UInt = 1u;
public const val `TELEMETRY_COMMAND_SIZE`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_CREATE_MINIVERSION_INFO` (
    public var `StructureVersion`: UShort,
    public var `StructureLength`: UShort,
    public var `BaseVersion`: UInt,
    public var `MiniVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_GET_METADATA_INFO_OUT` (
    public var `TxfFileId`: `TXFS_GET_METADATA_INFO_OUT_0`,
    public var `LockingTransaction`: `windows_sys`.`core`.`GUID`,
    public var `LastLsn`: ULong,
    public var `TransactionState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_GET_METADATA_INFO_OUT_0` (
    public var `LowPart`: Long,
    public var `HighPart`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_GET_TRANSACTED_VERSION` (
    public var `ThisBaseVersion`: UInt,
    public var `LatestVersion`: UInt,
    public var `ThisMiniVersion`: UShort,
    public var `FirstMiniVersion`: UShort,
    public var `LatestMiniVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_LIST_TRANSACTIONS` (
    public var `NumberOfTransactions`: ULong,
    public var `BufferSizeRequired`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_LIST_TRANSACTIONS_ENTRY` (
    public var `TransactionId`: `windows_sys`.`core`.`GUID`,
    public var `TransactionState`: UInt,
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `Reserved3`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_LIST_TRANSACTION_LOCKED_FILES` (
    public var `KtmTransaction`: `windows_sys`.`core`.`GUID`,
    public var `NumberOfFiles`: ULong,
    public var `BufferSizeRequired`: ULong,
    public var `Offset`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY` (
    public var `Offset`: ULong,
    public var `NameFlags`: UInt,
    public var `FileId`: Long,
    public var `Reserved1`: UInt,
    public var `Reserved2`: UInt,
    public var `Reserved3`: Long,
    public var `FileName`: UShortArray,
)
// UNSUPPORTED Rust 6859:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY_FLAG_CREATED`: UInt = 1u;
public const val `TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY_FLAG_DELETED`: UInt = 2u;
public const val `TXFS_LOGGING_MODE_FULL`: UInt = 2u;
public const val `TXFS_LOGGING_MODE_SIMPLE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_MODIFY_RM` (
    public var `Flags`: `TXFS_RMF_LAGS`,
    public var `LogContainerCountMax`: UInt,
    public var `LogContainerCountMin`: UInt,
    public var `LogContainerCount`: UInt,
    public var `LogGrowthIncrement`: UInt,
    public var `LogAutoShrinkPercentage`: UInt,
    public var `Reserved`: ULong,
    public var `LoggingMode`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_QUERY_RM_INFORMATION` (
    public var `BytesRequired`: UInt,
    public var `TailLsn`: ULong,
    public var `CurrentLsn`: ULong,
    public var `ArchiveTailLsn`: ULong,
    public var `LogContainerSize`: ULong,
    public var `HighestVirtualClock`: Long,
    public var `LogContainerCount`: UInt,
    public var `LogContainerCountMax`: UInt,
    public var `LogContainerCountMin`: UInt,
    public var `LogGrowthIncrement`: UInt,
    public var `LogAutoShrinkPercentage`: UInt,
    public var `Flags`: `TXFS_RMF_LAGS`,
    public var `LoggingMode`: UShort,
    public var `Reserved`: UShort,
    public var `RmState`: UInt,
    public var `LogCapacity`: ULong,
    public var `LogFree`: ULong,
    public var `TopsSize`: ULong,
    public var `TopsUsed`: ULong,
    public var `TransactionCount`: ULong,
    public var `OnePCCount`: ULong,
    public var `TwoPCCount`: ULong,
    public var `NumberLogFileFull`: ULong,
    public var `OldestTransactionAge`: ULong,
    public var `RMName`: `windows_sys`.`core`.`GUID`,
    public var `TmLogPathOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TXFS_READ_BACKUP_INFORMATION_OUT` (
    public var `Anonymous`: `TXFS_READ_BACKUP_INFORMATION_OUT_0`,
)
// UNSUPPORTED Rust 6915:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TXFS_READ_BACKUP_INFORMATION_OUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6920:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TXFS_READ_BACKUP_INFORMATION_OUT_0 {
//     pub BufferLength: u32,
//     pub Buffer: [u8; 1],
// }

// UNSUPPORTED Rust 6926:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TXFS_READ_BACKUP_INFORMATION_OUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TXFS_RMF_LAGS` = UInt;
public const val `TXFS_RM_FLAG_DO_NOT_RESET_RM_AT_NEXT_START`: `TXFS_RMF_LAGS` = 32768u;
public const val `TXFS_RM_FLAG_ENFORCE_MINIMUM_SIZE`: `TXFS_RMF_LAGS` = 4096u;
public const val `TXFS_RM_FLAG_GROW_LOG`: `TXFS_RMF_LAGS` = 1024u;
public const val `TXFS_RM_FLAG_LOGGING_MODE`: `TXFS_RMF_LAGS` = 1u;
public const val `TXFS_RM_FLAG_LOG_AUTO_SHRINK_PERCENTAGE`: `TXFS_RMF_LAGS` = 64u;
public const val `TXFS_RM_FLAG_LOG_CONTAINER_COUNT_MAX`: `TXFS_RMF_LAGS` = 4u;
public const val `TXFS_RM_FLAG_LOG_CONTAINER_COUNT_MIN`: `TXFS_RMF_LAGS` = 8u;
public const val `TXFS_RM_FLAG_LOG_GROWTH_INCREMENT_NUM_CONTAINERS`: `TXFS_RMF_LAGS` = 16u;
public const val `TXFS_RM_FLAG_LOG_GROWTH_INCREMENT_PERCENT`: `TXFS_RMF_LAGS` = 32u;
public const val `TXFS_RM_FLAG_LOG_NO_CONTAINER_COUNT_MAX`: `TXFS_RMF_LAGS` = 128u;
public const val `TXFS_RM_FLAG_LOG_NO_CONTAINER_COUNT_MIN`: `TXFS_RMF_LAGS` = 256u;
public const val `TXFS_RM_FLAG_PREFER_AVAILABILITY`: `TXFS_RMF_LAGS` = 131072u;
public const val `TXFS_RM_FLAG_PREFER_CONSISTENCY`: `TXFS_RMF_LAGS` = 65536u;
public const val `TXFS_RM_FLAG_PRESERVE_CHANGES`: `TXFS_RMF_LAGS` = 8192u;
public const val `TXFS_RM_FLAG_RENAME_RM`: `TXFS_RMF_LAGS` = 2u;
public const val `TXFS_RM_FLAG_RESET_RM_AT_NEXT_START`: `TXFS_RMF_LAGS` = 16384u;
public const val `TXFS_RM_FLAG_SHRINK_LOG`: `TXFS_RMF_LAGS` = 2048u;
public const val `TXFS_RM_STATE_ACTIVE`: UInt = 2u;
public const val `TXFS_RM_STATE_NOT_STARTED`: UInt = 0u;
public const val `TXFS_RM_STATE_SHUTTING_DOWN`: UInt = 3u;
public const val `TXFS_RM_STATE_STARTING`: UInt = 1u;
public const val `TXFS_ROLLFORWARD_REDO_FLAG_USE_LAST_REDO_LSN`: UInt = 1u;
public const val `TXFS_ROLLFORWARD_REDO_FLAG_USE_LAST_VIRTUAL_CLOCK`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_ROLLFORWARD_REDO_INFORMATION` (
    public var `LastVirtualClock`: Long,
    public var `LastRedoLsn`: ULong,
    public var `HighestRecoveryLsn`: ULong,
    public var `Flags`: UInt,
)
public const val `TXFS_SAVEPOINT_CLEAR`: UInt = 4u;
public const val `TXFS_SAVEPOINT_CLEAR_ALL`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TXFS_SAVEPOINT_INFORMATION` (
    public var `KtmTransaction`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `ActionCode`: UInt,
    public var `SavepointId`: UInt,
)
// UNSUPPORTED Rust 6972:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TXFS_SAVEPOINT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TXFS_SAVEPOINT_ROLLBACK`: UInt = 2u;
public const val `TXFS_SAVEPOINT_SET`: UInt = 1u;
public const val `TXFS_START_RM_FLAG_LOGGING_MODE`: UInt = 1024u;
public const val `TXFS_START_RM_FLAG_LOG_AUTO_SHRINK_PERCENTAGE`: UInt = 32u;
public const val `TXFS_START_RM_FLAG_LOG_CONTAINER_COUNT_MAX`: UInt = 1u;
public const val `TXFS_START_RM_FLAG_LOG_CONTAINER_COUNT_MIN`: UInt = 2u;
public const val `TXFS_START_RM_FLAG_LOG_CONTAINER_SIZE`: UInt = 4u;
public const val `TXFS_START_RM_FLAG_LOG_GROWTH_INCREMENT_NUM_CONTAINERS`: UInt = 8u;
public const val `TXFS_START_RM_FLAG_LOG_GROWTH_INCREMENT_PERCENT`: UInt = 16u;
public const val `TXFS_START_RM_FLAG_LOG_NO_CONTAINER_COUNT_MAX`: UInt = 64u;
public const val `TXFS_START_RM_FLAG_LOG_NO_CONTAINER_COUNT_MIN`: UInt = 128u;
public const val `TXFS_START_RM_FLAG_PREFER_AVAILABILITY`: UInt = 8192u;
public const val `TXFS_START_RM_FLAG_PREFER_CONSISTENCY`: UInt = 4096u;
public const val `TXFS_START_RM_FLAG_PRESERVE_CHANGES`: UInt = 2048u;
public const val `TXFS_START_RM_FLAG_RECOVER_BEST_EFFORT`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TXFS_START_RM_INFORMATION` (
    public var `Flags`: UInt,
    public var `LogContainerSize`: ULong,
    public var `LogContainerCountMin`: UInt,
    public var `LogContainerCountMax`: UInt,
    public var `LogGrowthIncrement`: UInt,
    public var `LogAutoShrinkPercentage`: UInt,
    public var `TmLogPathOffset`: UInt,
    public var `TmLogPathLength`: UShort,
    public var `LoggingMode`: UShort,
    public var `LogPathLength`: UShort,
    public var `Reserved`: UShort,
    public var `LogPath`: UShortArray,
)
// UNSUPPORTED Rust 7008:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TXFS_START_RM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TXFS_TRANSACTED_VERSION_NONTRANSACTED`: UInt = 4294967294u;
public const val `TXFS_TRANSACTED_VERSION_UNCOMMITTED`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXFS_TRANSACTION_ACTIVE_INFO` (
    public var `TransactionsActiveAtSnapshot`: Boolean,
)
public const val `TXFS_TRANSACTION_STATE_ACTIVE`: UInt = 1u;
public const val `TXFS_TRANSACTION_STATE_NONE`: UInt = 0u;
public const val `TXFS_TRANSACTION_STATE_NOTACTIVE`: UInt = 3u;
public const val `TXFS_TRANSACTION_STATE_PREPARED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TXFS_WRITE_BACKUP_INFORMATION` (
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 7029:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TXFS_WRITE_BACKUP_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `Travan`: `STORAGE_MEDIA_TYPE` = 34;
public const val `UNDEFINE_ALTERNATE`: UInt = 13u;
public const val `UNDEFINE_PRIMARY`: UInt = 12u;
public const val `UNLOCK_ELEMENT`: UInt = 1u;
public const val `UNRECOVERED_READS_VALID`: UInt = 8u;
public const val `UNRECOVERED_WRITES_VALID`: UInt = 2u;
public typealias `USN_DELETE_FLAGS` = UInt;
public const val `USN_DELETE_FLAG_DELETE`: `USN_DELETE_FLAGS` = 1u;
public const val `USN_DELETE_FLAG_NOTIFY`: `USN_DELETE_FLAGS` = 2u;
public const val `USN_DELETE_VALID_FLAGS`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USN_JOURNAL_DATA_V0` (
    public var `UsnJournalID`: ULong,
    public var `FirstUsn`: Long,
    public var `NextUsn`: Long,
    public var `LowestValidUsn`: Long,
    public var `MaxUsn`: Long,
    public var `MaximumSize`: ULong,
    public var `AllocationDelta`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USN_JOURNAL_DATA_V1` (
    public var `UsnJournalID`: ULong,
    public var `FirstUsn`: Long,
    public var `NextUsn`: Long,
    public var `LowestValidUsn`: Long,
    public var `MaxUsn`: Long,
    public var `MaximumSize`: ULong,
    public var `AllocationDelta`: ULong,
    public var `MinSupportedMajorVersion`: UShort,
    public var `MaxSupportedMajorVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USN_JOURNAL_DATA_V2` (
    public var `UsnJournalID`: ULong,
    public var `FirstUsn`: Long,
    public var `NextUsn`: Long,
    public var `LowestValidUsn`: Long,
    public var `MaxUsn`: Long,
    public var `MaximumSize`: ULong,
    public var `AllocationDelta`: ULong,
    public var `MinSupportedMajorVersion`: UShort,
    public var `MaxSupportedMajorVersion`: UShort,
    public var `Flags`: UInt,
    public var `RangeTrackChunkSize`: ULong,
    public var `RangeTrackFileSizeThreshold`: Long,
)
public const val `USN_PAGE_SIZE`: UInt = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USN_RANGE_TRACK_OUTPUT` (
    public var `Usn`: Long,
)
public const val `USN_REASON_BASIC_INFO_CHANGE`: UInt = 32768u;
public const val `USN_REASON_CLOSE`: UInt = 2147483648u;
public const val `USN_REASON_COMPRESSION_CHANGE`: UInt = 131072u;
public const val `USN_REASON_DATA_EXTEND`: UInt = 2u;
public const val `USN_REASON_DATA_OVERWRITE`: UInt = 1u;
public const val `USN_REASON_DATA_TRUNCATION`: UInt = 4u;
public const val `USN_REASON_DESIRED_STORAGE_CLASS_CHANGE`: UInt = 16777216u;
public const val `USN_REASON_EA_CHANGE`: UInt = 1024u;
public const val `USN_REASON_ENCRYPTION_CHANGE`: UInt = 262144u;
public const val `USN_REASON_FILE_CREATE`: UInt = 256u;
public const val `USN_REASON_FILE_DELETE`: UInt = 512u;
public const val `USN_REASON_HARD_LINK_CHANGE`: UInt = 65536u;
public const val `USN_REASON_INDEXABLE_CHANGE`: UInt = 16384u;
public const val `USN_REASON_INTEGRITY_CHANGE`: UInt = 8388608u;
public const val `USN_REASON_NAMED_DATA_EXTEND`: UInt = 32u;
public const val `USN_REASON_NAMED_DATA_OVERWRITE`: UInt = 16u;
public const val `USN_REASON_NAMED_DATA_TRUNCATION`: UInt = 64u;
public const val `USN_REASON_OBJECT_ID_CHANGE`: UInt = 524288u;
public const val `USN_REASON_RENAME_NEW_NAME`: UInt = 8192u;
public const val `USN_REASON_RENAME_OLD_NAME`: UInt = 4096u;
public const val `USN_REASON_REPARSE_POINT_CHANGE`: UInt = 1048576u;
public const val `USN_REASON_SECURITY_CHANGE`: UInt = 2048u;
public const val `USN_REASON_STREAM_CHANGE`: UInt = 2097152u;
public const val `USN_REASON_TRANSACTED_CHANGE`: UInt = 4194304u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USN_RECORD_COMMON_HEADER` (
    public var `RecordLength`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USN_RECORD_EXTENT` (
    public var `Offset`: Long,
    public var `Length`: Long,
)
// UNSUPPORTED Rust 7127:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub union USN_RECORD_UNION {
//     pub Header: USN_RECORD_COMMON_HEADER,
//     pub V2: USN_RECORD_V2,
//     pub V3: USN_RECORD_V3,
//     pub V4: USN_RECORD_V4,
// }

// UNSUPPORTED Rust 7136:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for USN_RECORD_UNION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USN_RECORD_V2` (
    public var `RecordLength`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `FileReferenceNumber`: ULong,
    public var `ParentFileReferenceNumber`: ULong,
    public var `Usn`: Long,
    public var `TimeStamp`: Long,
    public var `Reason`: UInt,
    public var `SourceInfo`: UInt,
    public var `SecurityId`: UInt,
    public var `FileAttributes`: UInt,
    public var `FileNameLength`: UShort,
    public var `FileNameOffset`: UShort,
    public var `FileName`: UShortArray,
)
// UNSUPPORTED Rust 7160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USN_RECORD_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USN_RECORD_V3` (
    public var `RecordLength`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `FileReferenceNumber`: `super`.`super`.`Storage`.`FileSystem`.`FILE_ID_128`,
    public var `ParentFileReferenceNumber`: `super`.`super`.`Storage`.`FileSystem`.`FILE_ID_128`,
    public var `Usn`: Long,
    public var `TimeStamp`: Long,
    public var `Reason`: UInt,
    public var `SourceInfo`: UInt,
    public var `SecurityId`: UInt,
    public var `FileAttributes`: UInt,
    public var `FileNameLength`: UShort,
    public var `FileNameOffset`: UShort,
    public var `FileName`: UShortArray,
)
// UNSUPPORTED Rust 7184:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for USN_RECORD_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USN_RECORD_V4` (
    public var `Header`: `USN_RECORD_COMMON_HEADER`,
    public var `FileReferenceNumber`: `super`.`super`.`Storage`.`FileSystem`.`FILE_ID_128`,
    public var `ParentFileReferenceNumber`: `super`.`super`.`Storage`.`FileSystem`.`FILE_ID_128`,
    public var `Usn`: Long,
    public var `Reason`: UInt,
    public var `SourceInfo`: `USN_SOURCE_INFO_ID`,
    public var `RemainingExtents`: UInt,
    public var `NumberOfExtents`: UShort,
    public var `ExtentSize`: UShort,
    public var `Extents`: Array<`USN_RECORD_EXTENT`>,
)
// UNSUPPORTED Rust 7205:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for USN_RECORD_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `USN_SOURCE_AUXILIARY_DATA`: `USN_SOURCE_INFO_ID` = 2u;
public const val `USN_SOURCE_CLIENT_REPLICATION_MANAGEMENT`: `USN_SOURCE_INFO_ID` = 8u;
public const val `USN_SOURCE_DATA_MANAGEMENT`: `USN_SOURCE_INFO_ID` = 1u;
public typealias `USN_SOURCE_INFO_ID` = UInt;
public const val `USN_SOURCE_REPLICATION_MANAGEMENT`: `USN_SOURCE_INFO_ID` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `USN_TRACK_MODIFIED_RANGES` (
    public var `Flags`: UInt,
    public var `Unused`: UInt,
    public var `ChunkSize`: ULong,
    public var `FileSizeThreshold`: Long,
)
public const val `UfsDataTypeMax`: `STORAGE_PROTOCOL_UFS_DATA_TYPE` = 6;
public const val `UfsDataTypeQueryAttribute`: `STORAGE_PROTOCOL_UFS_DATA_TYPE` = 2;
public const val `UfsDataTypeQueryDescriptor`: `STORAGE_PROTOCOL_UFS_DATA_TYPE` = 1;
public const val `UfsDataTypeQueryDmeAttribute`: `STORAGE_PROTOCOL_UFS_DATA_TYPE` = 4;
public const val `UfsDataTypeQueryDmePeerAttribute`: `STORAGE_PROTOCOL_UFS_DATA_TYPE` = 5;
public const val `UfsDataTypeQueryFlag`: `STORAGE_PROTOCOL_UFS_DATA_TYPE` = 3;
public const val `UfsDataTypeUnknown`: `STORAGE_PROTOCOL_UFS_DATA_TYPE` = 0;
public const val `Unknown`: `MEDIA_TYPE` = 0;
public const val `VALID_NTFT`: UInt = 192u;
public const val `VENDOR_ID_LENGTH`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VERIFY_INFORMATION` (
    public var `StartingOffset`: Long,
    public var `Length`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUALIZATION_INSTANCE_INFO_INPUT` (
    public var `NumberOfWorkerThreads`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUALIZATION_INSTANCE_INFO_INPUT_EX` (
    public var `HeaderSize`: UShort,
    public var `Flags`: UInt,
    public var `NotificationInfoSize`: UInt,
    public var `NotificationInfoOffset`: UShort,
    public var `ProviderMajorVersion`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUALIZATION_INSTANCE_INFO_OUTPUT` (
    public var `VirtualizationInstanceID`: `windows_sys`.`core`.`GUID`,
)
public typealias `VIRTUAL_STORAGE_BEHAVIOR_CODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_STORAGE_SET_BEHAVIOR_INPUT` (
    public var `Size`: UInt,
    public var `BehaviorCode`: `VIRTUAL_STORAGE_BEHAVIOR_CODE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VOLUME_BITMAP_BUFFER` (
    public var `StartingLcn`: Long,
    public var `BitmapSize`: Long,
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 7274:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_BITMAP_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VOLUME_DISK_EXTENTS` (
    public var `NumberOfDiskExtents`: UInt,
    public var `Extents`: Array<`DISK_EXTENT`>,
)
// UNSUPPORTED Rust 7285:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_DISK_EXTENTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_GET_GPT_ATTRIBUTES_INFORMATION` (
    public var `GptAttributes`: ULong,
)
public const val `VOLUME_IS_DIRTY`: UInt = 1u;
public const val `VOLUME_SESSION_OPEN`: UInt = 4u;
public const val `VOLUME_UPGRADE_SCHEDULED`: UInt = 2u;
public const val `VXATape`: `STORAGE_MEDIA_TYPE` = 94;
public const val `VXATape_1`: `STORAGE_MEDIA_TYPE` = 83;
public const val `VXATape_2`: `STORAGE_MEDIA_TYPE` = 84;
public const val `VirtualStorageBehaviorCacheWriteBack`: `VIRTUAL_STORAGE_BEHAVIOR_CODE` = 2;
public const val `VirtualStorageBehaviorCacheWriteThrough`: `VIRTUAL_STORAGE_BEHAVIOR_CODE` = 1;
public const val `VirtualStorageBehaviorRestartIoProcessing`: `VIRTUAL_STORAGE_BEHAVIOR_CODE` = 4;
public const val `VirtualStorageBehaviorStopIoProcessing`: `VIRTUAL_STORAGE_BEHAVIOR_CODE` = 3;
public const val `VirtualStorageBehaviorUndefined`: `VIRTUAL_STORAGE_BEHAVIOR_CODE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIM_PROVIDER_ADD_OVERLAY_INPUT` (
    public var `WimType`: UInt,
    public var `WimIndex`: UInt,
    public var `WimFileNameOffset`: UInt,
    public var `WimFileNameLength`: UInt,
)
public const val `WIM_PROVIDER_CURRENT_VERSION`: UInt = 1u;
public const val `WIM_PROVIDER_EXTERNAL_FLAG_NOT_ACTIVE`: UInt = 1u;
public const val `WIM_PROVIDER_EXTERNAL_FLAG_SUSPENDED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIM_PROVIDER_EXTERNAL_INFO` (
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `DataSourceId`: Long,
    public var `ResourceHash`: UByteArray,
)
// UNSUPPORTED Rust 7325:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIM_PROVIDER_EXTERNAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIM_PROVIDER_OVERLAY_ENTRY` (
    public var `NextEntryOffset`: UInt,
    public var `DataSourceId`: Long,
    public var `WimGuid`: `windows_sys`.`core`.`GUID`,
    public var `WimFileNameOffset`: UInt,
    public var `WimType`: UInt,
    public var `WimIndex`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIM_PROVIDER_REMOVE_OVERLAY_INPUT` (
    public var `DataSourceId`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIM_PROVIDER_SUSPEND_OVERLAY_INPUT` (
    public var `DataSourceId`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIM_PROVIDER_UPDATE_OVERLAY_INPUT` (
    public var `DataSourceId`: Long,
    public var `WimFileNameOffset`: UInt,
    public var `WimFileNameLength`: UInt,
)
// UNSUPPORTED Rust 7358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WMI_DISK_GEOMETRY_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25007f51_57c2_11d1_a528_00a0c9062910);

public const val `WOF_CURRENT_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WOF_EXTERNAL_FILE_ID` (
    public var `FileId`: `super`.`super`.`Storage`.`FileSystem`.`FILE_ID_128`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WOF_EXTERNAL_INFO` (
    public var `Version`: UInt,
    public var `Provider`: UInt,
)
public const val `WOF_PROVIDER_CLOUD`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WOF_VERSION_INFO` (
    public var `WofVersion`: UInt,
)
public typealias `WRITE_CACHE_CHANGE` = Int;
public typealias `WRITE_CACHE_ENABLE` = Int;
public typealias `WRITE_CACHE_TYPE` = Int;
public const val `WRITE_COMPRESSION_INFO_VALID`: UInt = 16u;
public typealias `WRITE_THROUGH` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WRITE_USN_REASON_INPUT` (
    public var `Flags`: UInt,
    public var `UsnReasonToWrite`: UInt,
)
public const val `WriteCacheChangeUnknown`: `WRITE_CACHE_CHANGE` = 0;
public const val `WriteCacheChangeable`: `WRITE_CACHE_CHANGE` = 2;
public const val `WriteCacheDisabled`: `WRITE_CACHE_ENABLE` = 1;
public const val `WriteCacheEnableUnknown`: `WRITE_CACHE_ENABLE` = 0;
public const val `WriteCacheEnabled`: `WRITE_CACHE_ENABLE` = 2;
public const val `WriteCacheNotChangeable`: `WRITE_CACHE_CHANGE` = 1;
public const val `WriteCacheTypeNone`: `WRITE_CACHE_TYPE` = 1;
public const val `WriteCacheTypeUnknown`: `WRITE_CACHE_TYPE` = 0;
public const val `WriteCacheTypeWriteBack`: `WRITE_CACHE_TYPE` = 2;
public const val `WriteCacheTypeWriteThrough`: `WRITE_CACHE_TYPE` = 3;
public const val `WriteThroughNotSupported`: `WRITE_THROUGH` = 1;
public const val `WriteThroughSupported`: `WRITE_THROUGH` = 2;
public const val `WriteThroughUnknown`: `WRITE_THROUGH` = 0;
public const val `ZoneConditionClosed`: `STORAGE_ZONE_CONDITION` = 4;
public const val `ZoneConditionConventional`: `STORAGE_ZONE_CONDITION` = 0;
public const val `ZoneConditionEmpty`: `STORAGE_ZONE_CONDITION` = 1;
public const val `ZoneConditionExplicitlyOpened`: `STORAGE_ZONE_CONDITION` = 3;
public const val `ZoneConditionFull`: `STORAGE_ZONE_CONDITION` = 14;
public const val `ZoneConditionImplicitlyOpened`: `STORAGE_ZONE_CONDITION` = 2;
public const val `ZoneConditionOffline`: `STORAGE_ZONE_CONDITION` = 15;
public const val `ZoneConditionReadOnly`: `STORAGE_ZONE_CONDITION` = 13;
public const val `ZoneTypeConventional`: `STORAGE_ZONE_TYPES` = 1;
public const val `ZoneTypeMax`: `STORAGE_ZONE_TYPES` = 4;
public const val `ZoneTypeSequentialWritePreferred`: `STORAGE_ZONE_TYPES` = 3;
public const val `ZoneTypeSequentialWriteRequired`: `STORAGE_ZONE_TYPES` = 2;
public const val `ZoneTypeUnknown`: `STORAGE_ZONE_TYPES` = 0;
public const val `ZonedDeviceTypeDeviceManaged`: `STORAGE_ZONED_DEVICE_TYPES` = 3;
public const val `ZonedDeviceTypeHostAware`: `STORAGE_ZONED_DEVICE_TYPES` = 2;
public const val `ZonedDeviceTypeHostManaged`: `STORAGE_ZONED_DEVICE_TYPES` = 1;
public const val `ZonedDeviceTypeUnknown`: `STORAGE_ZONED_DEVICE_TYPES` = 0;
public const val `ZonesAttributeTypeAndLengthMayDifferent`: `STORAGE_ZONES_ATTRIBUTES` = 0;
public const val `ZonesAttributeTypeMayDifferentLengthSame`: `STORAGE_ZONES_ATTRIBUTES` = 3;
public const val `ZonesAttributeTypeSameLastZoneLengthDifferent`: `STORAGE_ZONES_ATTRIBUTES` = 2;
public const val `ZonesAttributeTypeSameLengthSame`: `STORAGE_ZONES_ATTRIBUTES` = 1;
