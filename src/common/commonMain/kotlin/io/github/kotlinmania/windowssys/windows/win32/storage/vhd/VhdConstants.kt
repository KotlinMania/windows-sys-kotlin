package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val APPLY_SNAPSHOT_VHDSET_FLAG_NONE: ApplySnapshotVhdsetFlag = 0

public val APPLY_SNAPSHOT_VHDSET_FLAG_WRITEABLE: ApplySnapshotVhdsetFlag = 1

public val APPLY_SNAPSHOT_VHDSET_VERSION_1: ApplySnapshotVhdsetVersion = 1

public val APPLY_SNAPSHOT_VHDSET_VERSION_UNSPECIFIED: ApplySnapshotVhdsetVersion = 0

public val ATTACH_VIRTUAL_DISK_FLAG_AT_BOOT: AttachVirtualDiskFlag = 1024

public val ATTACH_VIRTUAL_DISK_FLAG_BYPASS_DEFAULT_ENCRYPTION_POLICY: AttachVirtualDiskFlag = 32

public val ATTACH_VIRTUAL_DISK_FLAG_NONE: AttachVirtualDiskFlag = 0

public val ATTACH_VIRTUAL_DISK_FLAG_NON_PNP: AttachVirtualDiskFlag = 64

public val ATTACH_VIRTUAL_DISK_FLAG_NO_DRIVE_LETTER: AttachVirtualDiskFlag = 2

public val ATTACH_VIRTUAL_DISK_FLAG_NO_LOCAL_HOST: AttachVirtualDiskFlag = 8

public val ATTACH_VIRTUAL_DISK_FLAG_NO_SECURITY_DESCRIPTOR: AttachVirtualDiskFlag = 16

public val ATTACH_VIRTUAL_DISK_FLAG_PERMANENT_LIFETIME: AttachVirtualDiskFlag = 4

public val ATTACH_VIRTUAL_DISK_FLAG_READ_ONLY: AttachVirtualDiskFlag = 1

public val ATTACH_VIRTUAL_DISK_FLAG_REGISTER_VOLUME: AttachVirtualDiskFlag = 512

public val ATTACH_VIRTUAL_DISK_FLAG_RESTRICTED_RANGE: AttachVirtualDiskFlag = 128

public val ATTACH_VIRTUAL_DISK_FLAG_SINGLE_PARTITION: AttachVirtualDiskFlag = 256

public val ATTACH_VIRTUAL_DISK_VERSION_1: AttachVirtualDiskVersion = 1

public val ATTACH_VIRTUAL_DISK_VERSION_2: AttachVirtualDiskVersion = 2

public val ATTACH_VIRTUAL_DISK_VERSION_UNSPECIFIED: AttachVirtualDiskVersion = 0

public val COMPACT_VIRTUAL_DISK_FLAG_NONE: CompactVirtualDiskFlag = 0

public val COMPACT_VIRTUAL_DISK_FLAG_NO_BLOCK_MOVES: CompactVirtualDiskFlag = 2

public val COMPACT_VIRTUAL_DISK_FLAG_NO_ZERO_SCAN: CompactVirtualDiskFlag = 1

public val COMPACT_VIRTUAL_DISK_VERSION_1: CompactVirtualDiskVersion = 1

public val COMPACT_VIRTUAL_DISK_VERSION_UNSPECIFIED: CompactVirtualDiskVersion = 0

public val CREATE_VIRTUAL_DISK_FLAG_CREATE_BACKING_STORAGE: CreateVirtualDiskFlag = 8

public val CREATE_VIRTUAL_DISK_FLAG_DO_NOT_COPY_METADATA_FROM_PARENT: CreateVirtualDiskFlag = 4

public val CREATE_VIRTUAL_DISK_FLAG_FULL_PHYSICAL_ALLOCATION: CreateVirtualDiskFlag = 1

public val CREATE_VIRTUAL_DISK_FLAG_NONE: CreateVirtualDiskFlag = 0

public val CREATE_VIRTUAL_DISK_FLAG_PMEM_COMPATIBLE: CreateVirtualDiskFlag = 256

public val CREATE_VIRTUAL_DISK_FLAG_PRESERVE_PARENT_CHANGE_TRACKING_STATE: CreateVirtualDiskFlag = 32

public val CREATE_VIRTUAL_DISK_FLAG_PREVENT_WRITES_TO_SOURCE_DISK: CreateVirtualDiskFlag = 2

public val CREATE_VIRTUAL_DISK_FLAG_SPARSE_FILE: CreateVirtualDiskFlag = 128

public val CREATE_VIRTUAL_DISK_FLAG_SUPPORT_COMPRESSED_VOLUMES: CreateVirtualDiskFlag = 512

public val CREATE_VIRTUAL_DISK_FLAG_SUPPORT_SPARSE_FILES_ANY_FS: CreateVirtualDiskFlag = 1024

public val CREATE_VIRTUAL_DISK_FLAG_USE_CHANGE_TRACKING_SOURCE_LIMIT: CreateVirtualDiskFlag = 16

public val CREATE_VIRTUAL_DISK_FLAG_VHD_SET_USE_ORIGINAL_BACKING_STORAGE: CreateVirtualDiskFlag = 64

public val CREATE_VIRTUAL_DISK_PARAMETERS_DEFAULT_BLOCK_SIZE: UInt = 0u

public val CREATE_VIRTUAL_DISK_PARAMETERS_DEFAULT_SECTOR_SIZE: UInt = 0u

public val CREATE_VIRTUAL_DISK_VERSION_1: CreateVirtualDiskVersion = 1

public val CREATE_VIRTUAL_DISK_VERSION_2: CreateVirtualDiskVersion = 2

public val CREATE_VIRTUAL_DISK_VERSION_3: CreateVirtualDiskVersion = 3

public val CREATE_VIRTUAL_DISK_VERSION_4: CreateVirtualDiskVersion = 4

public val CREATE_VIRTUAL_DISK_VERSION_UNSPECIFIED: CreateVirtualDiskVersion = 0

public val DELETE_SNAPSHOT_VHDSET_FLAG_NONE: DeleteSnapshotVhdsetFlag = 0

public val DELETE_SNAPSHOT_VHDSET_FLAG_PERSIST_RCT: DeleteSnapshotVhdsetFlag = 1

public val DELETE_SNAPSHOT_VHDSET_VERSION_1: DeleteSnapshotVhdsetVersion = 1

public val DELETE_SNAPSHOT_VHDSET_VERSION_UNSPECIFIED: DeleteSnapshotVhdsetVersion = 0

public val DEPENDENT_DISK_FLAG_ALWAYS_ALLOW_SPARSE: DependentDiskFlag = 4096

public val DEPENDENT_DISK_FLAG_FULLY_ALLOCATED: DependentDiskFlag = 2

public val DEPENDENT_DISK_FLAG_MULT_BACKING_FILES: DependentDiskFlag = 1

public val DEPENDENT_DISK_FLAG_NONE: DependentDiskFlag = 0

public val DEPENDENT_DISK_FLAG_NO_DRIVE_LETTER: DependentDiskFlag = 128

public val DEPENDENT_DISK_FLAG_NO_HOST_DISK: DependentDiskFlag = 512

public val DEPENDENT_DISK_FLAG_PARENT: DependentDiskFlag = 256

public val DEPENDENT_DISK_FLAG_PERMANENT_LIFETIME: DependentDiskFlag = 1024

public val DEPENDENT_DISK_FLAG_READ_ONLY: DependentDiskFlag = 4

public val DEPENDENT_DISK_FLAG_REMOTE: DependentDiskFlag = 8

public val DEPENDENT_DISK_FLAG_REMOVABLE: DependentDiskFlag = 64

public val DEPENDENT_DISK_FLAG_SUPPORT_COMPRESSED_VOLUMES: DependentDiskFlag = 2048

public val DEPENDENT_DISK_FLAG_SUPPORT_ENCRYPTED_FILES: DependentDiskFlag = 8192

public val DEPENDENT_DISK_FLAG_SYSTEM_VOLUME: DependentDiskFlag = 16

public val DEPENDENT_DISK_FLAG_SYSTEM_VOLUME_PARENT: DependentDiskFlag = 32

public val DETACH_VIRTUAL_DISK_FLAG_NONE: DetachVirtualDiskFlag = 0

public val EXPAND_VIRTUAL_DISK_FLAG_NONE: ExpandVirtualDiskFlag = 0

public val EXPAND_VIRTUAL_DISK_FLAG_NOTIFY_CHANGE: ExpandVirtualDiskFlag = 1

public val EXPAND_VIRTUAL_DISK_VERSION_1: ExpandVirtualDiskVersion = 1

public val EXPAND_VIRTUAL_DISK_VERSION_UNSPECIFIED: ExpandVirtualDiskVersion = 0

public val FORK_VIRTUAL_DISK_FLAG_EXISTING_FILE: ForkVirtualDiskFlag = 1

public val FORK_VIRTUAL_DISK_FLAG_NONE: ForkVirtualDiskFlag = 0

public val FORK_VIRTUAL_DISK_VERSION_1: ForkVirtualDiskVersion = 1

public val FORK_VIRTUAL_DISK_VERSION_UNSPECIFIED: ForkVirtualDiskVersion = 0

public val GET_STORAGE_DEPENDENCY_FLAG_DISK_HANDLE: GetStorageDependencyFlag = 2

public val GET_STORAGE_DEPENDENCY_FLAG_HOST_VOLUMES: GetStorageDependencyFlag = 1

public val GET_STORAGE_DEPENDENCY_FLAG_NONE: GetStorageDependencyFlag = 0

public val GET_VIRTUAL_DISK_INFO_CHANGE_TRACKING_STATE: GetVirtualDiskInfoVersion = 15

public val GET_VIRTUAL_DISK_INFO_FRAGMENTATION: GetVirtualDiskInfoVersion = 12

public val GET_VIRTUAL_DISK_INFO_IDENTIFIER: GetVirtualDiskInfoVersion = 2

public val GET_VIRTUAL_DISK_INFO_IS_4K_ALIGNED: GetVirtualDiskInfoVersion = 8

public val GET_VIRTUAL_DISK_INFO_IS_LOADED: GetVirtualDiskInfoVersion = 13

public val GET_VIRTUAL_DISK_INFO_PARENT_IDENTIFIER: GetVirtualDiskInfoVersion = 4

public val GET_VIRTUAL_DISK_INFO_PARENT_LOCATION: GetVirtualDiskInfoVersion = 3

public val GET_VIRTUAL_DISK_INFO_PARENT_TIMESTAMP: GetVirtualDiskInfoVersion = 5

public val GET_VIRTUAL_DISK_INFO_PHYSICAL_DISK: GetVirtualDiskInfoVersion = 9

public val GET_VIRTUAL_DISK_INFO_PROVIDER_SUBTYPE: GetVirtualDiskInfoVersion = 7

public val GET_VIRTUAL_DISK_INFO_SIZE: GetVirtualDiskInfoVersion = 1

public val GET_VIRTUAL_DISK_INFO_SMALLEST_SAFE_VIRTUAL_SIZE: GetVirtualDiskInfoVersion = 11

public val GET_VIRTUAL_DISK_INFO_UNSPECIFIED: GetVirtualDiskInfoVersion = 0

public val GET_VIRTUAL_DISK_INFO_VHD_PHYSICAL_SECTOR_SIZE: GetVirtualDiskInfoVersion = 10

public val GET_VIRTUAL_DISK_INFO_VIRTUAL_DISK_ID: GetVirtualDiskInfoVersion = 14

public val GET_VIRTUAL_DISK_INFO_VIRTUAL_STORAGE_TYPE: GetVirtualDiskInfoVersion = 6

public val MERGE_VIRTUAL_DISK_DEFAULT_MERGE_DEPTH: UInt = 1u

public val MERGE_VIRTUAL_DISK_FLAG_NONE: MergeVirtualDiskFlag = 0

public val MERGE_VIRTUAL_DISK_VERSION_1: MergeVirtualDiskVersion = 1

public val MERGE_VIRTUAL_DISK_VERSION_2: MergeVirtualDiskVersion = 2

public val MERGE_VIRTUAL_DISK_VERSION_UNSPECIFIED: MergeVirtualDiskVersion = 0

public val MIRROR_VIRTUAL_DISK_FLAG_ENABLE_SMB_COMPRESSION: MirrorVirtualDiskFlag = 4

public val MIRROR_VIRTUAL_DISK_FLAG_EXISTING_FILE: MirrorVirtualDiskFlag = 1

public val MIRROR_VIRTUAL_DISK_FLAG_IS_LIVE_MIGRATION: MirrorVirtualDiskFlag = 8

public val MIRROR_VIRTUAL_DISK_FLAG_NONE: MirrorVirtualDiskFlag = 0

public val MIRROR_VIRTUAL_DISK_FLAG_SKIP_MIRROR_ACTIVATION: MirrorVirtualDiskFlag = 2

public val MIRROR_VIRTUAL_DISK_VERSION_1: MirrorVirtualDiskVersion = 1

public val MIRROR_VIRTUAL_DISK_VERSION_UNSPECIFIED: MirrorVirtualDiskVersion = 0

public val MODIFY_VHDSET_DEFAULT_SNAPSHOT_PATH: ModifyVhdsetVersion = 3

public val MODIFY_VHDSET_FLAG_NONE: ModifyVhdsetFlag = 0

public val MODIFY_VHDSET_FLAG_WRITEABLE_SNAPSHOT: ModifyVhdsetFlag = 1

public val MODIFY_VHDSET_REMOVE_SNAPSHOT: ModifyVhdsetVersion = 2

public val MODIFY_VHDSET_SNAPSHOT_PATH: ModifyVhdsetVersion = 1

public val MODIFY_VHDSET_UNSPECIFIED: ModifyVhdsetVersion = 0

public val OPEN_VIRTUAL_DISK_FLAG_BLANK_FILE: OpenVirtualDiskFlag = 2

public val OPEN_VIRTUAL_DISK_FLAG_BOOT_DRIVE: OpenVirtualDiskFlag = 4

public val OPEN_VIRTUAL_DISK_FLAG_CACHED_IO: OpenVirtualDiskFlag = 8

public val OPEN_VIRTUAL_DISK_FLAG_CUSTOM_DIFF_CHAIN: OpenVirtualDiskFlag = 16

public val OPEN_VIRTUAL_DISK_FLAG_IGNORE_RELATIVE_PARENT_LOCATOR: OpenVirtualDiskFlag = 128

public val OPEN_VIRTUAL_DISK_FLAG_NONE: OpenVirtualDiskFlag = 0

public val OPEN_VIRTUAL_DISK_FLAG_NO_PARENTS: OpenVirtualDiskFlag = 1

public val OPEN_VIRTUAL_DISK_FLAG_NO_WRITE_HARDENING: OpenVirtualDiskFlag = 256

public val OPEN_VIRTUAL_DISK_FLAG_PARENT_CACHED_IO: OpenVirtualDiskFlag = 32

public val OPEN_VIRTUAL_DISK_FLAG_SUPPORT_COMPRESSED_VOLUMES: OpenVirtualDiskFlag = 512

public val OPEN_VIRTUAL_DISK_FLAG_SUPPORT_ENCRYPTED_FILES: OpenVirtualDiskFlag = 2048

public val OPEN_VIRTUAL_DISK_FLAG_SUPPORT_SPARSE_FILES_ANY_FS: OpenVirtualDiskFlag = 1024

public val OPEN_VIRTUAL_DISK_FLAG_VHDSET_FILE_ONLY: OpenVirtualDiskFlag = 64

public val OPEN_VIRTUAL_DISK_RW_DEPTH_DEFAULT: UInt = 1u

public val OPEN_VIRTUAL_DISK_VERSION_1: OpenVirtualDiskVersion = 1

public val OPEN_VIRTUAL_DISK_VERSION_2: OpenVirtualDiskVersion = 2

public val OPEN_VIRTUAL_DISK_VERSION_3: OpenVirtualDiskVersion = 3

public val OPEN_VIRTUAL_DISK_VERSION_UNSPECIFIED: OpenVirtualDiskVersion = 0

public val QUERY_CHANGES_VIRTUAL_DISK_FLAG_NONE: QueryChangesVirtualDiskFlag = 0

public val RAW_SCSI_VIRTUAL_DISK_FLAG_NONE: RawScsiVirtualDiskFlag = 0

public val RAW_SCSI_VIRTUAL_DISK_VERSION_1: RawScsiVirtualDiskVersion = 1

public val RAW_SCSI_VIRTUAL_DISK_VERSION_UNSPECIFIED: RawScsiVirtualDiskVersion = 0

public val RESIZE_VIRTUAL_DISK_FLAG_ALLOW_UNSAFE_VIRTUAL_SIZE: ResizeVirtualDiskFlag = 1

public val RESIZE_VIRTUAL_DISK_FLAG_NONE: ResizeVirtualDiskFlag = 0

public val RESIZE_VIRTUAL_DISK_FLAG_RESIZE_TO_SMALLEST_SAFE_VIRTUAL_SIZE: ResizeVirtualDiskFlag = 2

public val RESIZE_VIRTUAL_DISK_VERSION_1: ResizeVirtualDiskVersion = 1

public val RESIZE_VIRTUAL_DISK_VERSION_UNSPECIFIED: ResizeVirtualDiskVersion = 0

public val SET_VIRTUAL_DISK_INFO_CHANGE_TRACKING_STATE: SetVirtualDiskInfoVersion = 6

public val SET_VIRTUAL_DISK_INFO_IDENTIFIER: SetVirtualDiskInfoVersion = 2

public val SET_VIRTUAL_DISK_INFO_PARENT_LOCATOR: SetVirtualDiskInfoVersion = 7

public val SET_VIRTUAL_DISK_INFO_PARENT_PATH: SetVirtualDiskInfoVersion = 1

public val SET_VIRTUAL_DISK_INFO_PARENT_PATH_WITH_DEPTH: SetVirtualDiskInfoVersion = 3

public val SET_VIRTUAL_DISK_INFO_PHYSICAL_SECTOR_SIZE: SetVirtualDiskInfoVersion = 4

public val SET_VIRTUAL_DISK_INFO_UNSPECIFIED: SetVirtualDiskInfoVersion = 0

public val SET_VIRTUAL_DISK_INFO_VIRTUAL_DISK_ID: SetVirtualDiskInfoVersion = 5

public val STORAGE_DEPENDENCY_INFO_VERSION_1: StorageDependencyInfoVersion = 1

public val STORAGE_DEPENDENCY_INFO_VERSION_2: StorageDependencyInfoVersion = 2

public val STORAGE_DEPENDENCY_INFO_VERSION_UNSPECIFIED: StorageDependencyInfoVersion = 0

public val TAKE_SNAPSHOT_VHDSET_FLAG_NONE: TakeSnapshotVhdsetFlag = 0

public val TAKE_SNAPSHOT_VHDSET_FLAG_WRITEABLE: TakeSnapshotVhdsetFlag = 1

public val TAKE_SNAPSHOT_VHDSET_VERSION_1: TakeSnapshotVhdsetVersion = 1

public val TAKE_SNAPSHOT_VHDSET_VERSION_UNSPECIFIED: TakeSnapshotVhdsetVersion = 0

public val VIRTUAL_DISK_ACCESS_ALL: VirtualDiskAccessMask = 4128768

public val VIRTUAL_DISK_ACCESS_ATTACH_RO: VirtualDiskAccessMask = 65536

public val VIRTUAL_DISK_ACCESS_ATTACH_RW: VirtualDiskAccessMask = 131072

public val VIRTUAL_DISK_ACCESS_CREATE: VirtualDiskAccessMask = 1048576

public val VIRTUAL_DISK_ACCESS_DETACH: VirtualDiskAccessMask = 262144

public val VIRTUAL_DISK_ACCESS_GET_INFO: VirtualDiskAccessMask = 524288

public val VIRTUAL_DISK_ACCESS_METAOPS: VirtualDiskAccessMask = 2097152

public val VIRTUAL_DISK_ACCESS_NONE: VirtualDiskAccessMask = 0

public val VIRTUAL_DISK_ACCESS_READ: VirtualDiskAccessMask = 851968

public val VIRTUAL_DISK_ACCESS_WRITABLE: VirtualDiskAccessMask = 3276800

public val VIRTUAL_DISK_MAXIMUM_CHANGE_TRACKING_ID_LENGTH: UInt = 256u

public val VIRTUAL_STORAGE_TYPE_DEVICE_ISO: UInt = 1u

public val VIRTUAL_STORAGE_TYPE_DEVICE_UNKNOWN: UInt = 0u

public val VIRTUAL_STORAGE_TYPE_DEVICE_VHD: UInt = 2u

public val VIRTUAL_STORAGE_TYPE_DEVICE_VHDSET: UInt = 4u

public val VIRTUAL_STORAGE_TYPE_DEVICE_VHDX: UInt = 3u

public val VIRTUAL_STORAGE_TYPE_VENDOR_MICROSOFT: Guid = Guid.fromU128(U128(0xec984aeca0f947e9uL, 0x901f71415a66345buL))

public val VIRTUAL_STORAGE_TYPE_VENDOR_UNKNOWN: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))
