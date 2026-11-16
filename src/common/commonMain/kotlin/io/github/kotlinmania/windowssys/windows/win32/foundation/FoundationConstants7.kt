package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public val STATUS_VID_MESSAGE_QUEUE_NAME_TOO_LONG: Ntstatus = 0xC0370007u.toInt()

public val STATUS_VID_MMIO_RANGE_DESTROYED: Ntstatus = 0xC0370021u.toInt()

public val STATUS_VID_NOTIFICATION_QUEUE_ALREADY_ASSOCIATED: Ntstatus = 0xC0370011u.toInt()

public val STATUS_VID_NO_MEMORY_BLOCK_NOTIFICATION_QUEUE: Ntstatus = 0xC0370016u.toInt()

public val STATUS_VID_PAGE_RANGE_OVERFLOW: Ntstatus = 0xC0370013u.toInt()

public val STATUS_VID_PARTITION_ALREADY_EXISTS: Ntstatus = 0xC0370008u.toInt()

public val STATUS_VID_PARTITION_DOES_NOT_EXIST: Ntstatus = 0xC0370009u.toInt()

public val STATUS_VID_PARTITION_NAME_NOT_FOUND: Ntstatus = 0xC037000Au.toInt()

public val STATUS_VID_PARTITION_NAME_TOO_LONG: Ntstatus = 0xC0370006u.toInt()

public val STATUS_VID_PROCESS_ALREADY_SET: Ntstatus = 0xC0370030u.toInt()

public val STATUS_VID_QUEUE_FULL: Ntstatus = 0xC0370003u.toInt()

public val STATUS_VID_REMOTE_NODE_PARENT_GPA_PAGES_USED: Ntstatus = 0x80370001u.toInt()

public val STATUS_VID_RESERVE_PAGE_SET_IS_BEING_USED: Ntstatus = 0xC0370023u.toInt()

public val STATUS_VID_RESERVE_PAGE_SET_TOO_SMALL: Ntstatus = 0xC0370024u.toInt()

public val STATUS_VID_SAVED_STATE_CORRUPT: Ntstatus = 0xC0370027u.toInt()

public val STATUS_VID_SAVED_STATE_INCOMPATIBLE: Ntstatus = 0xC0370029u.toInt()

public val STATUS_VID_SAVED_STATE_UNRECOGNIZED_ITEM: Ntstatus = 0xC0370028u.toInt()

public val STATUS_VID_STOP_PENDING: Ntstatus = 0xC037001Cu.toInt()

public val STATUS_VID_TOO_MANY_HANDLERS: Ntstatus = 0xC0370002u.toInt()

public val STATUS_VID_VIRTUAL_PROCESSOR_LIMIT_EXCEEDED: Ntstatus = 0xC037001Bu.toInt()

public val STATUS_VID_VTL_ACCESS_DENIED: Ntstatus = 0xC037002Au.toInt()

public val STATUS_VIRTDISK_DISK_ALREADY_OWNED: Ntstatus = 0xC03A001Eu.toInt()

public val STATUS_VIRTDISK_DISK_ONLINE_AND_WRITABLE: Ntstatus = 0xC03A001Fu.toInt()

public val STATUS_VIRTDISK_NOT_VIRTUAL_DISK: Ntstatus = 0xC03A0015u.toInt()

public val STATUS_VIRTDISK_PROVIDER_NOT_FOUND: Ntstatus = 0xC03A0014u.toInt()

public val STATUS_VIRTDISK_UNSUPPORTED_DISK_SECTOR_SIZE: Ntstatus = 0xC03A001Du.toInt()

public val STATUS_VIRTUAL_CIRCUIT_CLOSED: Ntstatus = 0xC00000D6u.toInt()

public val STATUS_VIRTUAL_DISK_LIMITATION: Ntstatus = 0xC03A001Au.toInt()

public val STATUS_VIRUS_DELETED: Ntstatus = 0xC0000907u.toInt()

public val STATUS_VIRUS_INFECTED: Ntstatus = 0xC0000906u.toInt()

public val STATUS_VOLMGR_ALL_DISKS_FAILED: Ntstatus = 0xC0380029u.toInt()

public val STATUS_VOLMGR_BAD_BOOT_DISK: Ntstatus = 0xC038004Fu.toInt()

public val STATUS_VOLMGR_DATABASE_FULL: Ntstatus = 0xC0380001u.toInt()

public val STATUS_VOLMGR_DIFFERENT_SECTOR_SIZE: Ntstatus = 0xC038004Eu.toInt()

public val STATUS_VOLMGR_DISK_CONFIGURATION_CORRUPTED: Ntstatus = 0xC0380002u.toInt()

public val STATUS_VOLMGR_DISK_CONFIGURATION_NOT_IN_SYNC: Ntstatus = 0xC0380003u.toInt()

public val STATUS_VOLMGR_DISK_CONTAINS_NON_SIMPLE_VOLUME: Ntstatus = 0xC0380005u.toInt()

public val STATUS_VOLMGR_DISK_DUPLICATE: Ntstatus = 0xC0380006u.toInt()

public val STATUS_VOLMGR_DISK_DYNAMIC: Ntstatus = 0xC0380007u.toInt()

public val STATUS_VOLMGR_DISK_ID_INVALID: Ntstatus = 0xC0380008u.toInt()

public val STATUS_VOLMGR_DISK_INVALID: Ntstatus = 0xC0380009u.toInt()

public val STATUS_VOLMGR_DISK_LAST_VOTER: Ntstatus = 0xC038000Au.toInt()

public val STATUS_VOLMGR_DISK_LAYOUT_INVALID: Ntstatus = 0xC038000Bu.toInt()

public val STATUS_VOLMGR_DISK_LAYOUT_NON_BASIC_BETWEEN_BASIC_PARTITIONS: Ntstatus = 0xC038000Cu.toInt()

public val STATUS_VOLMGR_DISK_LAYOUT_NOT_CYLINDER_ALIGNED: Ntstatus = 0xC038000Du.toInt()

public val STATUS_VOLMGR_DISK_LAYOUT_PARTITIONS_TOO_SMALL: Ntstatus = 0xC038000Eu.toInt()

public val STATUS_VOLMGR_DISK_LAYOUT_PRIMARY_BETWEEN_LOGICAL_PARTITIONS: Ntstatus = 0xC038000Fu.toInt()

public val STATUS_VOLMGR_DISK_LAYOUT_TOO_MANY_PARTITIONS: Ntstatus = 0xC0380010u.toInt()

public val STATUS_VOLMGR_DISK_MISSING: Ntstatus = 0xC0380011u.toInt()

public val STATUS_VOLMGR_DISK_NOT_EMPTY: Ntstatus = 0xC0380012u.toInt()

public val STATUS_VOLMGR_DISK_NOT_ENOUGH_SPACE: Ntstatus = 0xC0380013u.toInt()

public val STATUS_VOLMGR_DISK_REVECTORING_FAILED: Ntstatus = 0xC0380014u.toInt()

public val STATUS_VOLMGR_DISK_SECTOR_SIZE_INVALID: Ntstatus = 0xC0380015u.toInt()

public val STATUS_VOLMGR_DISK_SET_NOT_CONTAINED: Ntstatus = 0xC0380016u.toInt()

public val STATUS_VOLMGR_DISK_USED_BY_MULTIPLE_MEMBERS: Ntstatus = 0xC0380017u.toInt()

public val STATUS_VOLMGR_DISK_USED_BY_MULTIPLE_PLEXES: Ntstatus = 0xC0380018u.toInt()

public val STATUS_VOLMGR_DYNAMIC_DISK_NOT_SUPPORTED: Ntstatus = 0xC0380019u.toInt()

public val STATUS_VOLMGR_EXTENT_ALREADY_USED: Ntstatus = 0xC038001Au.toInt()

public val STATUS_VOLMGR_EXTENT_NOT_CONTIGUOUS: Ntstatus = 0xC038001Bu.toInt()

public val STATUS_VOLMGR_EXTENT_NOT_IN_PUBLIC_REGION: Ntstatus = 0xC038001Cu.toInt()

public val STATUS_VOLMGR_EXTENT_NOT_SECTOR_ALIGNED: Ntstatus = 0xC038001Du.toInt()

public val STATUS_VOLMGR_EXTENT_OVERLAPS_EBR_PARTITION: Ntstatus = 0xC038001Eu.toInt()

public val STATUS_VOLMGR_EXTENT_VOLUME_LENGTHS_DO_NOT_MATCH: Ntstatus = 0xC038001Fu.toInt()

public val STATUS_VOLMGR_FAULT_TOLERANT_NOT_SUPPORTED: Ntstatus = 0xC0380020u.toInt()

public val STATUS_VOLMGR_INCOMPLETE_DISK_MIGRATION: Ntstatus = 0x80380002u.toInt()

public val STATUS_VOLMGR_INCOMPLETE_REGENERATION: Ntstatus = 0x80380001u.toInt()

public val STATUS_VOLMGR_INTERLEAVE_LENGTH_INVALID: Ntstatus = 0xC0380021u.toInt()

public val STATUS_VOLMGR_MAXIMUM_REGISTERED_USERS: Ntstatus = 0xC0380022u.toInt()

public val STATUS_VOLMGR_MEMBER_INDEX_DUPLICATE: Ntstatus = 0xC0380024u.toInt()

public val STATUS_VOLMGR_MEMBER_INDEX_INVALID: Ntstatus = 0xC0380025u.toInt()

public val STATUS_VOLMGR_MEMBER_IN_SYNC: Ntstatus = 0xC0380023u.toInt()

public val STATUS_VOLMGR_MEMBER_MISSING: Ntstatus = 0xC0380026u.toInt()

public val STATUS_VOLMGR_MEMBER_NOT_DETACHED: Ntstatus = 0xC0380027u.toInt()

public val STATUS_VOLMGR_MEMBER_REGENERATING: Ntstatus = 0xC0380028u.toInt()

public val STATUS_VOLMGR_MIRROR_NOT_SUPPORTED: Ntstatus = 0xC038005Bu.toInt()

public val STATUS_VOLMGR_NOTIFICATION_RESET: Ntstatus = 0xC038002Cu.toInt()

public val STATUS_VOLMGR_NOT_PRIMARY_PACK: Ntstatus = 0xC0380052u.toInt()

public val STATUS_VOLMGR_NO_REGISTERED_USERS: Ntstatus = 0xC038002Au.toInt()

public val STATUS_VOLMGR_NO_SUCH_USER: Ntstatus = 0xC038002Bu.toInt()

public val STATUS_VOLMGR_NO_VALID_LOG_COPIES: Ntstatus = 0xC0380058u.toInt()

public val STATUS_VOLMGR_NUMBER_OF_DISKS_INVALID: Ntstatus = 0xC038005Au.toInt()

public val STATUS_VOLMGR_NUMBER_OF_DISKS_IN_MEMBER_INVALID: Ntstatus = 0xC0380055u.toInt()

public val STATUS_VOLMGR_NUMBER_OF_DISKS_IN_PLEX_INVALID: Ntstatus = 0xC0380054u.toInt()

public val STATUS_VOLMGR_NUMBER_OF_EXTENTS_INVALID: Ntstatus = 0xC038004Du.toInt()

public val STATUS_VOLMGR_NUMBER_OF_MEMBERS_INVALID: Ntstatus = 0xC038002Du.toInt()

public val STATUS_VOLMGR_NUMBER_OF_PLEXES_INVALID: Ntstatus = 0xC038002Eu.toInt()

public val STATUS_VOLMGR_PACK_CONFIG_OFFLINE: Ntstatus = 0xC0380050u.toInt()

public val STATUS_VOLMGR_PACK_CONFIG_ONLINE: Ntstatus = 0xC0380051u.toInt()

public val STATUS_VOLMGR_PACK_CONFIG_UPDATE_FAILED: Ntstatus = 0xC0380004u.toInt()

public val STATUS_VOLMGR_PACK_DUPLICATE: Ntstatus = 0xC038002Fu.toInt()

public val STATUS_VOLMGR_PACK_HAS_QUORUM: Ntstatus = 0xC0380034u.toInt()

public val STATUS_VOLMGR_PACK_ID_INVALID: Ntstatus = 0xC0380030u.toInt()

public val STATUS_VOLMGR_PACK_INVALID: Ntstatus = 0xC0380031u.toInt()

public val STATUS_VOLMGR_PACK_LOG_UPDATE_FAILED: Ntstatus = 0xC0380053u.toInt()

public val STATUS_VOLMGR_PACK_NAME_INVALID: Ntstatus = 0xC0380032u.toInt()

public val STATUS_VOLMGR_PACK_OFFLINE: Ntstatus = 0xC0380033u.toInt()

public val STATUS_VOLMGR_PACK_WITHOUT_QUORUM: Ntstatus = 0xC0380035u.toInt()

public val STATUS_VOLMGR_PARTITION_STYLE_INVALID: Ntstatus = 0xC0380036u.toInt()

public val STATUS_VOLMGR_PARTITION_UPDATE_FAILED: Ntstatus = 0xC0380037u.toInt()

public val STATUS_VOLMGR_PLEX_INDEX_DUPLICATE: Ntstatus = 0xC0380039u.toInt()

public val STATUS_VOLMGR_PLEX_INDEX_INVALID: Ntstatus = 0xC038003Au.toInt()

public val STATUS_VOLMGR_PLEX_IN_SYNC: Ntstatus = 0xC0380038u.toInt()

public val STATUS_VOLMGR_PLEX_LAST_ACTIVE: Ntstatus = 0xC038003Bu.toInt()

public val STATUS_VOLMGR_PLEX_MISSING: Ntstatus = 0xC038003Cu.toInt()

public val STATUS_VOLMGR_PLEX_NOT_RAID5: Ntstatus = 0xC038003Fu.toInt()

public val STATUS_VOLMGR_PLEX_NOT_SIMPLE: Ntstatus = 0xC0380040u.toInt()

public val STATUS_VOLMGR_PLEX_NOT_SIMPLE_SPANNED: Ntstatus = 0xC0380057u.toInt()

public val STATUS_VOLMGR_PLEX_REGENERATING: Ntstatus = 0xC038003Du.toInt()

public val STATUS_VOLMGR_PLEX_TYPE_INVALID: Ntstatus = 0xC038003Eu.toInt()

public val STATUS_VOLMGR_PRIMARY_PACK_PRESENT: Ntstatus = 0xC0380059u.toInt()

public val STATUS_VOLMGR_RAID5_NOT_SUPPORTED: Ntstatus = 0xC038005Cu.toInt()

public val STATUS_VOLMGR_STRUCTURE_SIZE_INVALID: Ntstatus = 0xC0380041u.toInt()

public val STATUS_VOLMGR_TOO_MANY_NOTIFICATION_REQUESTS: Ntstatus = 0xC0380042u.toInt()

public val STATUS_VOLMGR_TRANSACTION_IN_PROGRESS: Ntstatus = 0xC0380043u.toInt()

public val STATUS_VOLMGR_UNEXPECTED_DISK_LAYOUT_CHANGE: Ntstatus = 0xC0380044u.toInt()

public val STATUS_VOLMGR_VOLUME_CONTAINS_MISSING_DISK: Ntstatus = 0xC0380045u.toInt()

public val STATUS_VOLMGR_VOLUME_ID_INVALID: Ntstatus = 0xC0380046u.toInt()

public val STATUS_VOLMGR_VOLUME_LENGTH_INVALID: Ntstatus = 0xC0380047u.toInt()

public val STATUS_VOLMGR_VOLUME_LENGTH_NOT_SECTOR_SIZE_MULTIPLE: Ntstatus = 0xC0380048u.toInt()

public val STATUS_VOLMGR_VOLUME_MIRRORED: Ntstatus = 0xC0380056u.toInt()

public val STATUS_VOLMGR_VOLUME_NOT_MIRRORED: Ntstatus = 0xC0380049u.toInt()

public val STATUS_VOLMGR_VOLUME_NOT_RETAINED: Ntstatus = 0xC038004Au.toInt()

public val STATUS_VOLMGR_VOLUME_OFFLINE: Ntstatus = 0xC038004Bu.toInt()

public val STATUS_VOLMGR_VOLUME_RETAINED: Ntstatus = 0xC038004Cu.toInt()

public val STATUS_VOLSNAP_ACTIVATION_TIMEOUT: Ntstatus = 0xC0500004u.toInt()

public val STATUS_VOLSNAP_BOOTFILE_NOT_VALID: Ntstatus = 0xC0500003u.toInt()

public val STATUS_VOLSNAP_HIBERNATE_READY: Ntstatus = 0x125u.toInt()

public val STATUS_VOLSNAP_NO_BYPASSIO_WITH_SNAPSHOT: Ntstatus = 0xC0500005u.toInt()

public val STATUS_VOLSNAP_PREPARE_HIBERNATE: Ntstatus = 0xC0000407u.toInt()

public val STATUS_VOLUME_DIRTY: Ntstatus = 0xC0000806u.toInt()

public val STATUS_VOLUME_DISMOUNTED: Ntstatus = 0xC000026Eu.toInt()

public val STATUS_VOLUME_MOUNTED: Ntstatus = 0x109u.toInt()

public val STATUS_VOLUME_NOT_CLUSTER_ALIGNED: Ntstatus = 0xC00004A4u.toInt()

public val STATUS_VOLUME_NOT_SUPPORTED: Ntstatus = 0xC00004C6u.toInt()

public val STATUS_VOLUME_NOT_UPGRADED: Ntstatus = 0xC000029Cu.toInt()

public val STATUS_VOLUME_UPGRADE_DISABLED: Ntstatus = 0xC00004DBu.toInt()

public val STATUS_VOLUME_UPGRADE_DISABLED_TILL_OS_DOWNGRADE_EXPIRED: Ntstatus = 0xC00004DCu.toInt()

public val STATUS_VOLUME_UPGRADE_NOT_NEEDED: Ntstatus = 0xC00004D9u.toInt()

public val STATUS_VOLUME_UPGRADE_PENDING: Ntstatus = 0xC00004DAu.toInt()

public val STATUS_VOLUME_WRITE_ACCESS_DENIED: Ntstatus = 0xC00004D3u.toInt()

public val STATUS_VRF_VOLATILE_CFG_AND_IO_ENABLED: Ntstatus = 0xC0000C08u.toInt()

public val STATUS_VRF_VOLATILE_NMI_REGISTERED: Ntstatus = 0xC0000C0Eu.toInt()

public val STATUS_VRF_VOLATILE_NOT_RUNNABLE_SYSTEM: Ntstatus = 0xC0000C0Bu.toInt()

public val STATUS_VRF_VOLATILE_NOT_STOPPABLE: Ntstatus = 0xC0000C09u.toInt()

public val STATUS_VRF_VOLATILE_NOT_SUPPORTED_RULECLASS: Ntstatus = 0xC0000C0Cu.toInt()

public val STATUS_VRF_VOLATILE_PROTECTED_DRIVER: Ntstatus = 0xC0000C0Du.toInt()

public val STATUS_VRF_VOLATILE_SAFE_MODE: Ntstatus = 0xC0000C0Au.toInt()

public val STATUS_VRF_VOLATILE_SETTINGS_CONFLICT: Ntstatus = 0xC0000C0Fu.toInt()

public val STATUS_VSM_DMA_PROTECTION_NOT_IN_USE: Ntstatus = 0xC0450001u.toInt()

public val STATUS_VSM_NOT_INITIALIZED: Ntstatus = 0xC0450000u.toInt()

public val STATUS_WAIT_0: Ntstatus = 0x0u.toInt()

public val STATUS_WAIT_1: Ntstatus = 0x1u.toInt()

public val STATUS_WAIT_2: Ntstatus = 0x2u.toInt()

public val STATUS_WAIT_3: Ntstatus = 0x3u.toInt()

public val STATUS_WAIT_63: Ntstatus = 0x3Fu.toInt()

public val STATUS_WAIT_FOR_OPLOCK: Ntstatus = 0x367u.toInt()

public val STATUS_WAKE_SYSTEM: Ntstatus = 0x40000294u.toInt()

public val STATUS_WAKE_SYSTEM_DEBUGGER: Ntstatus = 0x80000007u.toInt()

public val STATUS_WAS_LOCKED: Ntstatus = 0x40000019u.toInt()

public val STATUS_WAS_UNLOCKED: Ntstatus = 0x40000017u.toInt()

public val STATUS_WEAK_WHFBKEY_BLOCKED: Ntstatus = 0xC00001B3u.toInt()

public val STATUS_WIM_NOT_BOOTABLE: Ntstatus = 0xC0000487u.toInt()

public val STATUS_WMI_ALREADY_DISABLED: Ntstatus = 0xC0000302u.toInt()

public val STATUS_WMI_ALREADY_ENABLED: Ntstatus = 0xC0000303u.toInt()

public val STATUS_WMI_GUID_DISCONNECTED: Ntstatus = 0xC0000301u.toInt()

public val STATUS_WMI_GUID_NOT_FOUND: Ntstatus = 0xC0000295u.toInt()

public val STATUS_WMI_INSTANCE_NOT_FOUND: Ntstatus = 0xC0000296u.toInt()

public val STATUS_WMI_ITEMID_NOT_FOUND: Ntstatus = 0xC0000297u.toInt()

public val STATUS_WMI_NOT_SUPPORTED: Ntstatus = 0xC00002DDu.toInt()

public val STATUS_WMI_READ_ONLY: Ntstatus = 0xC00002C6u.toInt()

public val STATUS_WMI_SET_FAILURE: Ntstatus = 0xC00002C7u.toInt()

public val STATUS_WMI_TRY_AGAIN: Ntstatus = 0xC0000298u.toInt()

public val STATUS_WOF_FILE_RESOURCE_TABLE_CORRUPT: Ntstatus = 0xC000A2A7u.toInt()

public val STATUS_WOF_WIM_HEADER_CORRUPT: Ntstatus = 0xC000A2A5u.toInt()

public val STATUS_WOF_WIM_RESOURCE_TABLE_CORRUPT: Ntstatus = 0xC000A2A6u.toInt()

public val STATUS_WORKING_SET_LIMIT_RANGE: Ntstatus = 0x40000002u.toInt()

public val STATUS_WORKING_SET_QUOTA: Ntstatus = 0xC00000A1u.toInt()

public val STATUS_WOW_ASSERTION: Ntstatus = 0xC0009898u.toInt()

public val STATUS_WRONG_COMPARTMENT: Ntstatus = 0xC000A085u.toInt()

public val STATUS_WRONG_CREDENTIAL_HANDLE: Ntstatus = 0xC00002F2u.toInt()

public val STATUS_WRONG_EFS: Ntstatus = 0xC000028Fu.toInt()

public val STATUS_WRONG_PASSWORD_CORE: Ntstatus = 0xC0000149u.toInt()

public val STATUS_WRONG_VOLUME: Ntstatus = 0xC0000012u.toInt()

public val STATUS_WX86_BREAKPOINT: Ntstatus = 0x4000001Fu.toInt()

public val STATUS_WX86_CONTINUE: Ntstatus = 0x4000001Du.toInt()

public val STATUS_WX86_CREATEWX86TIB: Ntstatus = 0x40000028u.toInt()

public val STATUS_WX86_EXCEPTION_CHAIN: Ntstatus = 0x40000022u.toInt()

public val STATUS_WX86_EXCEPTION_CONTINUE: Ntstatus = 0x40000020u.toInt()

public val STATUS_WX86_EXCEPTION_LASTCHANCE: Ntstatus = 0x40000021u.toInt()

public val STATUS_WX86_FLOAT_STACK_CHECK: Ntstatus = 0xC0000270u.toInt()

public val STATUS_WX86_INTERNAL_ERROR: Ntstatus = 0xC000026Fu.toInt()

public val STATUS_WX86_SINGLE_STEP: Ntstatus = 0x4000001Eu.toInt()

public val STATUS_WX86_UNSIMULATE: Ntstatus = 0x4000001Cu.toInt()

public val STATUS_XMLDSIG_ERROR: Ntstatus = 0xC000A084u.toInt()

public val STATUS_XML_ENCODING_MISMATCH: Ntstatus = 0xC0150021u.toInt()

public val STATUS_XML_PARSE_ERROR: Ntstatus = 0xC000A083u.toInt()

public val STG_E_ABNORMALAPIEXIT: Hresult = 0x800300FAu.toInt()

public val STG_E_ACCESSDENIED: Hresult = 0x80030005u.toInt()

public val STG_E_BADBASEADDRESS: Hresult = 0x80030110u.toInt()

public val STG_E_CANTSAVE: Hresult = 0x80030103u.toInt()

public val STG_E_CSS_AUTHENTICATION_FAILURE: Hresult = 0x80030306u.toInt()

public val STG_E_CSS_KEY_NOT_ESTABLISHED: Hresult = 0x80030308u.toInt()

public val STG_E_CSS_KEY_NOT_PRESENT: Hresult = 0x80030307u.toInt()

public val STG_E_CSS_REGION_MISMATCH: Hresult = 0x8003030Au.toInt()

public val STG_E_CSS_SCRAMBLED_SECTOR: Hresult = 0x80030309u.toInt()

public val STG_E_DEVICE_UNRESPONSIVE: Hresult = 0x8003020Au.toInt()

public val STG_E_DISKISWRITEPROTECTED: Hresult = 0x80030013u.toInt()

public val STG_E_DOCFILECORRUPT: Hresult = 0x80030109u.toInt()

public val STG_E_DOCFILETOOLARGE: Hresult = 0x80030111u.toInt()

public val STG_E_EXTANTMARSHALLINGS: Hresult = 0x80030108u.toInt()

public val STG_E_FILEALREADYEXISTS: Hresult = 0x80030050u.toInt()

public val STG_E_FILENOTFOUND: Hresult = 0x80030002u.toInt()

public val STG_E_FIRMWARE_IMAGE_INVALID: Hresult = 0x80030209u.toInt()

public val STG_E_FIRMWARE_SLOT_INVALID: Hresult = 0x80030208u.toInt()

public val STG_E_INCOMPLETE: Hresult = 0x80030201u.toInt()

public val STG_E_INSUFFICIENTMEMORY: Hresult = 0x80030008u.toInt()

public val STG_E_INUSE: Hresult = 0x80030100u.toInt()

public val STG_E_INVALIDFLAG: Hresult = 0x800300FFu.toInt()

public val STG_E_INVALIDFUNCTION: Hresult = 0x80030001u.toInt()

public val STG_E_INVALIDHANDLE: Hresult = 0x80030006u.toInt()

public val STG_E_INVALIDHEADER: Hresult = 0x800300FBu.toInt()

public val STG_E_INVALIDNAME: Hresult = 0x800300FCu.toInt()

public val STG_E_INVALIDPARAMETER: Hresult = 0x80030057u.toInt()

public val STG_E_INVALIDPOINTER: Hresult = 0x80030009u.toInt()

public val STG_E_LOCKVIOLATION: Hresult = 0x80030021u.toInt()

public val STG_E_MEDIUMFULL: Hresult = 0x80030070u.toInt()

public val STG_E_NOMOREFILES: Hresult = 0x80030012u.toInt()

public val STG_E_NOTCURRENT: Hresult = 0x80030101u.toInt()

public val STG_E_NOTFILEBASEDSTORAGE: Hresult = 0x80030107u.toInt()

public val STG_E_NOTSIMPLEFORMAT: Hresult = 0x80030112u.toInt()

public val STG_E_OLDDLL: Hresult = 0x80030105u.toInt()

public val STG_E_OLDFORMAT: Hresult = 0x80030104u.toInt()

public val STG_E_PATHNOTFOUND: Hresult = 0x80030003u.toInt()

public val STG_E_PROPSETMISMATCHED: Hresult = 0x800300F0u.toInt()

public val STG_E_READFAULT: Hresult = 0x8003001Eu.toInt()

public val STG_E_RESETS_EXHAUSTED: Hresult = 0x8003030Bu.toInt()

public val STG_E_REVERTED: Hresult = 0x80030102u.toInt()

public val STG_E_SEEKERROR: Hresult = 0x80030019u.toInt()

public val STG_E_SHAREREQUIRED: Hresult = 0x80030106u.toInt()

public val STG_E_SHAREVIOLATION: Hresult = 0x80030020u.toInt()

public val STG_E_STATUS_COPY_PROTECTION_FAILURE: Hresult = 0x80030305u.toInt()

public val STG_E_TERMINATED: Hresult = 0x80030202u.toInt()

public val STG_E_TOOMANYOPENFILES: Hresult = 0x80030004u.toInt()

public val STG_E_UNIMPLEMENTEDFUNCTION: Hresult = 0x800300FEu.toInt()

public val STG_E_UNKNOWN: Hresult = 0x800300FDu.toInt()

public val STG_E_WRITEFAULT: Hresult = 0x8003001Du.toInt()

public val STG_S_BLOCK: Hresult = 0x30201u.toInt()

public val STG_S_CANNOTCONSOLIDATE: Hresult = 0x30206u.toInt()

public val STG_S_CONSOLIDATIONFAILED: Hresult = 0x30205u.toInt()

public val STG_S_CONVERTED: Hresult = 0x30200u.toInt()

public val STG_S_MONITORING: Hresult = 0x30203u.toInt()

public val STG_S_MULTIPLEOPENS: Hresult = 0x30204u.toInt()

public val STG_S_POWER_CYCLE_REQUIRED: Hresult = 0x30207u.toInt()

public val STG_S_RETRYNOW: Hresult = 0x30202u.toInt()

public val STILL_ACTIVE: Ntstatus = 0x103u.toInt()

public val STORE_ERROR_LICENSE_REVOKED: Int = 15864

public val STORE_ERROR_PENDING_COM_TRANSACTION: Int = 15863

public val STORE_ERROR_UNLICENSED: Int = 15861

public val STORE_ERROR_UNLICENSED_USER: Int = 15862

public val STRICT: UInt = 1u

public val SUCCESS: UInt = 0u

public val S_APPLICATION_ACTIVATION_ERROR_HANDLED_BY_DIALOG: Hresult = 0x270259u.toInt()

public val S_FALSE: Hresult = 0x1u.toInt()

public val S_OK: Hresult = 0x0u.toInt()

public val S_STORE_LAUNCHED_FOR_REMEDIATION: Hresult = 0x270258u.toInt()

public val TBSIMP_E_BUFFER_TOO_SMALL: Hresult = 0x80290200u.toInt()

public val TBSIMP_E_CLEANUP_FAILED: Hresult = 0x80290201u.toInt()

public val TBSIMP_E_COMMAND_CANCELED: Hresult = 0x8029020Bu.toInt()

public val TBSIMP_E_COMMAND_FAILED: Hresult = 0x80290211u.toInt()

public val TBSIMP_E_DUPLICATE_VHANDLE: Hresult = 0x80290206u.toInt()

public val TBSIMP_E_HASH_BAD_KEY: Hresult = 0x80290205u.toInt()

public val TBSIMP_E_HASH_TABLE_FULL: Hresult = 0x80290216u.toInt()

public val TBSIMP_E_INVALID_CONTEXT_HANDLE: Hresult = 0x80290202u.toInt()

public val TBSIMP_E_INVALID_CONTEXT_PARAM: Hresult = 0x80290203u.toInt()

public val TBSIMP_E_INVALID_OUTPUT_POINTER: Hresult = 0x80290207u.toInt()

public val TBSIMP_E_INVALID_PARAMETER: Hresult = 0x80290208u.toInt()

public val TBSIMP_E_INVALID_RESOURCE: Hresult = 0x80290214u.toInt()

public val TBSIMP_E_LIST_NOT_FOUND: Hresult = 0x8029020Eu.toInt()

public val TBSIMP_E_LIST_NO_MORE_ITEMS: Hresult = 0x8029020Du.toInt()

public val TBSIMP_E_NOTHING_TO_UNLOAD: Hresult = 0x80290215u.toInt()

public val TBSIMP_E_NOT_ENOUGH_SPACE: Hresult = 0x8029020Fu.toInt()

public val TBSIMP_E_NOT_ENOUGH_TPM_CONTEXTS: Hresult = 0x80290210u.toInt()

public val TBSIMP_E_NO_EVENT_LOG: Hresult = 0x8029021Bu.toInt()

public val TBSIMP_E_OUT_OF_MEMORY: Hresult = 0x8029020Cu.toInt()

public val TBSIMP_E_PPI_NOT_SUPPORTED: Hresult = 0x80290219u.toInt()

public val TBSIMP_E_RESOURCE_EXPIRED: Hresult = 0x80290213u.toInt()

public val TBSIMP_E_RPC_INIT_FAILED: Hresult = 0x80290209u.toInt()

public val TBSIMP_E_SCHEDULER_NOT_RUNNING: Hresult = 0x8029020Au.toInt()

public val TBSIMP_E_TOO_MANY_RESOURCES: Hresult = 0x80290218u.toInt()

public val TBSIMP_E_TOO_MANY_TBS_CONTEXTS: Hresult = 0x80290217u.toInt()

public val TBSIMP_E_TPM_ERROR: Hresult = 0x80290204u.toInt()

public val TBSIMP_E_TPM_INCOMPATIBLE: Hresult = 0x8029021Au.toInt()

public val TBSIMP_E_UNKNOWN_ORDINAL: Hresult = 0x80290212u.toInt()

public val TBS_E_ACCESS_DENIED: Hresult = 0x80284012u.toInt()

public val TBS_E_BAD_PARAMETER: Hresult = 0x80284002u.toInt()

public val TBS_E_BUFFER_TOO_LARGE: Hresult = 0x8028400Eu.toInt()

public val TBS_E_COMMAND_CANCELED: Hresult = 0x8028400Du.toInt()

public val TBS_E_INSUFFICIENT_BUFFER: Hresult = 0x80284005u.toInt()

public val TBS_E_INTERNAL_ERROR: Hresult = 0x80284001u.toInt()

public val TBS_E_INVALID_CONTEXT: Hresult = 0x80284004u.toInt()

public val TBS_E_INVALID_CONTEXT_PARAM: Hresult = 0x80284007u.toInt()

public val TBS_E_INVALID_OUTPUT_POINTER: Hresult = 0x80284003u.toInt()

public val TBS_E_IOERROR: Hresult = 0x80284006u.toInt()

public val TBS_E_NO_EVENT_LOG: Hresult = 0x80284011u.toInt()

public val TBS_E_OWNERAUTH_NOT_FOUND: Hresult = 0x80284015u.toInt()

public val TBS_E_PPI_FUNCTION_UNSUPPORTED: Hresult = 0x80284014u.toInt()

public val TBS_E_PPI_NOT_SUPPORTED: Hresult = 0x8028400Cu.toInt()

public val TBS_E_PROVISIONING_INCOMPLETE: Hresult = 0x80284016u.toInt()

public val TBS_E_PROVISIONING_NOT_ALLOWED: Hresult = 0x80284013u.toInt()

public val TBS_E_SERVICE_DISABLED: Hresult = 0x80284010u.toInt()

public val TBS_E_SERVICE_NOT_RUNNING: Hresult = 0x80284008u.toInt()

public val TBS_E_SERVICE_START_PENDING: Hresult = 0x8028400Bu.toInt()

public val TBS_E_TOO_MANY_RESOURCES: Hresult = 0x8028400Au.toInt()

public val TBS_E_TOO_MANY_TBS_CONTEXTS: Hresult = 0x80284009u.toInt()

public val TBS_E_TPM_NOT_FOUND: Hresult = 0x8028400Fu.toInt()

public val TPC_E_INITIALIZE_FAIL: Hresult = 0x80040223u.toInt()

public val TPC_E_INVALID_CONFIGURATION: Hresult = 0x80040239u.toInt()

public val TPC_E_INVALID_DATA_FROM_RECOGNIZER: Hresult = 0x8004023Au.toInt()

public val TPC_E_INVALID_INPUT_RECT: Hresult = 0x80040219u.toInt()

public val TPC_E_INVALID_PACKET_DESCRIPTION: Hresult = 0x80040233u.toInt()

public val TPC_E_INVALID_PROPERTY: Hresult = 0x80040241u.toInt()

public val TPC_E_INVALID_RIGHTS: Hresult = 0x80040236u.toInt()

public val TPC_E_INVALID_STROKE: Hresult = 0x80040222u.toInt()

public val TPC_E_NOT_RELEVANT: Hresult = 0x80040232u.toInt()

public val TPC_E_NO_DEFAULT_TABLET: Hresult = 0x80040212u.toInt()

public val TPC_E_OUT_OF_ORDER_CALL: Hresult = 0x80040237u.toInt()

public val TPC_E_QUEUE_FULL: Hresult = 0x80040238u.toInt()

public val TPC_E_RECOGNIZER_NOT_REGISTERED: Hresult = 0x80040235u.toInt()

public val TPC_E_UNKNOWN_PROPERTY: Hresult = 0x8004021Bu.toInt()

public val TPC_S_INTERRUPTED: Hresult = 0x40253u.toInt()

public val TPC_S_NO_DATA_TO_PROCESS: Hresult = 0x40254u.toInt()

public val TPC_S_TRUNCATED: Hresult = 0x40252u.toInt()

public val TPMAPI_E_ACCESS_DENIED: Hresult = 0x80290108u.toInt()

public val TPMAPI_E_AUTHORIZATION_FAILED: Hresult = 0x80290109u.toInt()

public val TPMAPI_E_AUTHORIZATION_REVOKED: Hresult = 0x80290126u.toInt()

public val TPMAPI_E_AUTHORIZING_KEY_NOT_SUPPORTED: Hresult = 0x80290128u.toInt()

public val TPMAPI_E_BUFFER_TOO_SMALL: Hresult = 0x80290106u.toInt()

public val TPMAPI_E_EMPTY_TCG_LOG: Hresult = 0x8029011Au.toInt()

public val TPMAPI_E_ENCRYPTION_FAILED: Hresult = 0x80290110u.toInt()

public val TPMAPI_E_ENDORSEMENT_AUTH_NOT_NULL: Hresult = 0x80290125u.toInt()

public val TPMAPI_E_FIPS_RNG_CHECK_FAILED: Hresult = 0x80290119u.toInt()

public val TPMAPI_E_INTERNAL_ERROR: Hresult = 0x80290107u.toInt()

public val TPMAPI_E_INVALID_AUTHORIZATION_SIGNATURE: Hresult = 0x80290129u.toInt()

public val TPMAPI_E_INVALID_CONTEXT_HANDLE: Hresult = 0x8029010Au.toInt()

public val TPMAPI_E_INVALID_CONTEXT_PARAMS: Hresult = 0x80290115u.toInt()

public val TPMAPI_E_INVALID_DELEGATE_BLOB: Hresult = 0x80290114u.toInt()

public val TPMAPI_E_INVALID_ENCODING: Hresult = 0x8029010Eu.toInt()

public val TPMAPI_E_INVALID_KEY_BLOB: Hresult = 0x80290116u.toInt()

public val TPMAPI_E_INVALID_KEY_PARAMS: Hresult = 0x80290111u.toInt()

public val TPMAPI_E_INVALID_KEY_SIZE: Hresult = 0x8029010Fu.toInt()

public val TPMAPI_E_INVALID_MIGRATION_AUTHORIZATION_BLOB: Hresult = 0x80290112u.toInt()

public val TPMAPI_E_INVALID_OUTPUT_POINTER: Hresult = 0x80290103u.toInt()

public val TPMAPI_E_INVALID_OWNER_AUTH: Hresult = 0x80290118u.toInt()

public val TPMAPI_E_INVALID_PARAMETER: Hresult = 0x80290104u.toInt()

public val TPMAPI_E_INVALID_PCR_DATA: Hresult = 0x80290117u.toInt()

public val TPMAPI_E_INVALID_PCR_INDEX: Hresult = 0x80290113u.toInt()

public val TPMAPI_E_INVALID_POLICYAUTH_BLOB_TYPE: Hresult = 0x8029012Eu.toInt()

public val TPMAPI_E_INVALID_STATE: Hresult = 0x80290100u.toInt()

public val TPMAPI_E_INVALID_TCG_LOG_ENTRY: Hresult = 0x8029011Bu.toInt()

public val TPMAPI_E_INVALID_TPM_VERSION: Hresult = 0x8029012Du.toInt()

public val TPMAPI_E_MALFORMED_AUTHORIZATION_KEY: Hresult = 0x80290127u.toInt()

public val TPMAPI_E_MALFORMED_AUTHORIZATION_OTHER: Hresult = 0x8029012Bu.toInt()

public val TPMAPI_E_MALFORMED_AUTHORIZATION_POLICY: Hresult = 0x8029012Au.toInt()

public val TPMAPI_E_MESSAGE_TOO_LARGE: Hresult = 0x8029010Du.toInt()

public val TPMAPI_E_NOT_ENOUGH_DATA: Hresult = 0x80290101u.toInt()

public val TPMAPI_E_NO_AUTHORIZATION_CHAIN_FOUND: Hresult = 0x80290122u.toInt()

public val TPMAPI_E_NV_BITS_NOT_DEFINED: Hresult = 0x8029011Fu.toInt()

public val TPMAPI_E_NV_BITS_NOT_READY: Hresult = 0x80290120u.toInt()

public val TPMAPI_E_OUT_OF_MEMORY: Hresult = 0x80290105u.toInt()

public val TPMAPI_E_OWNER_AUTH_NOT_NULL: Hresult = 0x80290124u.toInt()

public val TPMAPI_E_POLICY_DENIES_OPERATION: Hresult = 0x8029011Eu.toInt()

public val TPMAPI_E_SEALING_KEY_CHANGED: Hresult = 0x8029012Cu.toInt()

public val TPMAPI_E_SEALING_KEY_NOT_AVAILABLE: Hresult = 0x80290121u.toInt()

public val TPMAPI_E_SVN_COUNTER_NOT_AVAILABLE: Hresult = 0x80290123u.toInt()

public val TPMAPI_E_TBS_COMMUNICATION_ERROR: Hresult = 0x8029010Bu.toInt()

public val TPMAPI_E_TCG_INVALID_DIGEST_ENTRY: Hresult = 0x8029011Du.toInt()

public val TPMAPI_E_TCG_SEPARATOR_ABSENT: Hresult = 0x8029011Cu.toInt()

public val TPMAPI_E_TOO_MUCH_DATA: Hresult = 0x80290102u.toInt()

public val TPMAPI_E_TPM_COMMAND_ERROR: Hresult = 0x8029010Cu.toInt()

public val TPM_20_E_ASYMMETRIC: Hresult = 0x80280081u.toInt()

public val TPM_20_E_ATTRIBUTES: Hresult = 0x80280082u.toInt()

public val TPM_20_E_AUTHSIZE: Hresult = 0x80280144u.toInt()

public val TPM_20_E_AUTH_CONTEXT: Hresult = 0x80280145u.toInt()

public val TPM_20_E_AUTH_FAIL: Hresult = 0x8028008Eu.toInt()

public val TPM_20_E_AUTH_MISSING: Hresult = 0x80280125u.toInt()

public val TPM_20_E_AUTH_TYPE: Hresult = 0x80280124u.toInt()

public val TPM_20_E_AUTH_UNAVAILABLE: Hresult = 0x8028012Fu.toInt()

public val TPM_20_E_BAD_AUTH: Hresult = 0x802800A2u.toInt()

public val TPM_20_E_BAD_CONTEXT: Hresult = 0x80280150u.toInt()

public val TPM_20_E_BINDING: Hresult = 0x802800A5u.toInt()

public val TPM_20_E_CANCELED: Hresult = 0x80280909u.toInt()

public val TPM_20_E_COMMAND_CODE: Hresult = 0x80280143u.toInt()

public val TPM_20_E_COMMAND_SIZE: Hresult = 0x80280142u.toInt()

public val TPM_20_E_CONTEXT_GAP: Hresult = 0x80280901u.toInt()

public val TPM_20_E_CPHASH: Hresult = 0x80280151u.toInt()

public val TPM_20_E_CURVE: Hresult = 0x802800A6u.toInt()

public val TPM_20_E_DISABLED: Hresult = 0x80280120u.toInt()

public val TPM_20_E_ECC_CURVE: Hresult = 0x80280123u.toInt()

public val TPM_20_E_ECC_POINT: Hresult = 0x802800A7u.toInt()

public val TPM_20_E_EXCLUSIVE: Hresult = 0x80280121u.toInt()

public val TPM_20_E_EXPIRED: Hresult = 0x802800A3u.toInt()

public val TPM_20_E_FAILURE: Hresult = 0x80280101u.toInt()

public val TPM_20_E_HANDLE: Hresult = 0x8028008Bu.toInt()

public val TPM_20_E_HASH: Hresult = 0x80280083u.toInt()

public val TPM_20_E_HIERARCHY: Hresult = 0x80280085u.toInt()

public val TPM_20_E_HMAC: Hresult = 0x80280119u.toInt()

public val TPM_20_E_INITIALIZE: Hresult = 0x80280100u.toInt()

public val TPM_20_E_INSUFFICIENT: Hresult = 0x8028009Au.toInt()

public val TPM_20_E_INTEGRITY: Hresult = 0x8028009Fu.toInt()

public val TPM_20_E_KDF: Hresult = 0x8028008Cu.toInt()

public val TPM_20_E_KEY: Hresult = 0x8028009Cu.toInt()

public val TPM_20_E_KEY_SIZE: Hresult = 0x80280087u.toInt()

public val TPM_20_E_LOCALITY: Hresult = 0x80280907u.toInt()

public val TPM_20_E_LOCKOUT: Hresult = 0x80280921u.toInt()

public val TPM_20_E_MEMORY: Hresult = 0x80280904u.toInt()

public val TPM_20_E_MGF: Hresult = 0x80280088u.toInt()

public val TPM_20_E_MODE: Hresult = 0x80280089u.toInt()

public val TPM_20_E_NEEDS_TEST: Hresult = 0x80280153u.toInt()

public val TPM_20_E_NONCE: Hresult = 0x8028008Fu.toInt()

public val TPM_20_E_NO_RESULT: Hresult = 0x80280154u.toInt()

public val TPM_20_E_NV_AUTHORIZATION: Hresult = 0x80280149u.toInt()

public val TPM_20_E_NV_DEFINED: Hresult = 0x8028014Cu.toInt()

public val TPM_20_E_NV_LOCKED: Hresult = 0x80280148u.toInt()

public val TPM_20_E_NV_RANGE: Hresult = 0x80280146u.toInt()

public val TPM_20_E_NV_RATE: Hresult = 0x80280920u.toInt()

public val TPM_20_E_NV_SIZE: Hresult = 0x80280147u.toInt()

public val TPM_20_E_NV_SPACE: Hresult = 0x8028014Bu.toInt()

public val TPM_20_E_NV_UNAVAILABLE: Hresult = 0x80280923u.toInt()

public val TPM_20_E_NV_UNINITIALIZED: Hresult = 0x8028014Au.toInt()

public val TPM_20_E_OBJECT_HANDLES: Hresult = 0x80280906u.toInt()

public val TPM_20_E_OBJECT_MEMORY: Hresult = 0x80280902u.toInt()

public val TPM_20_E_PARENT: Hresult = 0x80280152u.toInt()

public val TPM_20_E_PCR: Hresult = 0x80280127u.toInt()

public val TPM_20_E_PCR_CHANGED: Hresult = 0x80280128u.toInt()

public val TPM_20_E_POLICY: Hresult = 0x80280126u.toInt()

public val TPM_20_E_POLICY_CC: Hresult = 0x802800A4u.toInt()

public val TPM_20_E_POLICY_FAIL: Hresult = 0x8028009Du.toInt()

public val TPM_20_E_PP: Hresult = 0x80280090u.toInt()

public val TPM_20_E_PRIVATE: Hresult = 0x8028010Bu.toInt()

public val TPM_20_E_RANGE: Hresult = 0x8028008Du.toInt()

public val TPM_20_E_REBOOT: Hresult = 0x80280130u.toInt()

public val TPM_20_E_RESERVED_BITS: Hresult = 0x802800A1u.toInt()

public val TPM_20_E_RETRY: Hresult = 0x80280922u.toInt()

public val TPM_20_E_SCHEME: Hresult = 0x80280092u.toInt()

public val TPM_20_E_SELECTOR: Hresult = 0x80280098u.toInt()

public val TPM_20_E_SENSITIVE: Hresult = 0x80280155u.toInt()

public val TPM_20_E_SEQUENCE: Hresult = 0x80280103u.toInt()

public val TPM_20_E_SESSION_HANDLES: Hresult = 0x80280905u.toInt()

public val TPM_20_E_SESSION_MEMORY: Hresult = 0x80280903u.toInt()

public val TPM_20_E_SIGNATURE: Hresult = 0x8028009Bu.toInt()

public val TPM_20_E_SIZE: Hresult = 0x80280095u.toInt()

public val TPM_20_E_SYMMETRIC: Hresult = 0x80280096u.toInt()

public val TPM_20_E_TAG: Hresult = 0x80280097u.toInt()

public val TPM_20_E_TESTING: Hresult = 0x8028090Au.toInt()

public val TPM_20_E_TICKET: Hresult = 0x802800A0u.toInt()

public val TPM_20_E_TOO_MANY_CONTEXTS: Hresult = 0x8028012Eu.toInt()

public val TPM_20_E_TYPE: Hresult = 0x8028008Au.toInt()

public val TPM_20_E_UNBALANCED: Hresult = 0x80280131u.toInt()

public val TPM_20_E_UPGRADE: Hresult = 0x8028012Du.toInt()

public val TPM_20_E_VALUE: Hresult = 0x80280084u.toInt()

public val TPM_20_E_YIELDED: Hresult = 0x80280908u.toInt()

public val TPM_E_AREA_LOCKED: Hresult = 0x8028003Cu.toInt()

public val TPM_E_ATTESTATION_CHALLENGE_NOT_SET: Hresult = 0x80290412u.toInt()

public val TPM_E_AUDITFAILURE: Hresult = 0x80280004u.toInt()

public val TPM_E_AUDITFAIL_SUCCESSFUL: Hresult = 0x80280031u.toInt()

public val TPM_E_AUDITFAIL_UNSUCCESSFUL: Hresult = 0x80280030u.toInt()

public val TPM_E_AUTH2FAIL: Hresult = 0x8028001Du.toInt()

public val TPM_E_AUTHFAIL: Hresult = 0x80280001u.toInt()

public val TPM_E_AUTH_CONFLICT: Hresult = 0x8028003Bu.toInt()

public val TPM_E_BADCONTEXT: Hresult = 0x8028005Au.toInt()

public val TPM_E_BADINDEX: Hresult = 0x80280002u.toInt()

public val TPM_E_BADTAG: Hresult = 0x8028001Eu.toInt()

public val TPM_E_BAD_ATTRIBUTES: Hresult = 0x80280042u.toInt()

public val TPM_E_BAD_COUNTER: Hresult = 0x80280045u.toInt()

public val TPM_E_BAD_DATASIZE: Hresult = 0x8028002Bu.toInt()

public val TPM_E_BAD_DELEGATE: Hresult = 0x80280059u.toInt()

public val TPM_E_BAD_HANDLE: Hresult = 0x80280058u.toInt()

public val TPM_E_BAD_KEY_PROPERTY: Hresult = 0x80280028u.toInt()

public val TPM_E_BAD_LOCALITY: Hresult = 0x8028003Du.toInt()

public val TPM_E_BAD_MIGRATION: Hresult = 0x80280029u.toInt()

public val TPM_E_BAD_MODE: Hresult = 0x8028002Cu.toInt()

public val TPM_E_BAD_ORDINAL: Hresult = 0x8028000Au.toInt()

public val TPM_E_BAD_PARAMETER: Hresult = 0x80280003u.toInt()

public val TPM_E_BAD_PARAM_SIZE: Hresult = 0x80280019u.toInt()

public val TPM_E_BAD_PRESENCE: Hresult = 0x8028002Du.toInt()

public val TPM_E_BAD_SCHEME: Hresult = 0x8028002Au.toInt()

public val TPM_E_BAD_SIGNATURE: Hresult = 0x80280062u.toInt()

public val TPM_E_BAD_TYPE: Hresult = 0x80280034u.toInt()

public val TPM_E_BAD_VERSION: Hresult = 0x8028002Eu.toInt()

public val TPM_E_BUFFER_LENGTH_MISMATCH: Hresult = 0x8029041Eu.toInt()

public val TPM_E_CLAIM_TYPE_NOT_SUPPORTED: Hresult = 0x8029041Cu.toInt()

public val TPM_E_CLEAR_DISABLED: Hresult = 0x80280005u.toInt()

public val TPM_E_COMMAND_BLOCKED: Hresult = 0x80280400u.toInt()

public val TPM_E_CONTEXT_GAP: Hresult = 0x80280047u.toInt()

public val TPM_E_DAA_INPUT_DATA0: Hresult = 0x80280051u.toInt()

public val TPM_E_DAA_INPUT_DATA1: Hresult = 0x80280052u.toInt()

public val TPM_E_DAA_ISSUER_SETTINGS: Hresult = 0x80280053u.toInt()

public val TPM_E_DAA_ISSUER_VALIDITY: Hresult = 0x80280056u.toInt()

public val TPM_E_DAA_RESOURCES: Hresult = 0x80280050u.toInt()

public val TPM_E_DAA_STAGE: Hresult = 0x80280055u.toInt()

public val TPM_E_DAA_TPM_SETTINGS: Hresult = 0x80280054u.toInt()

public val TPM_E_DAA_WRONG_W: Hresult = 0x80280057u.toInt()

public val TPM_E_DEACTIVATED: Hresult = 0x80280006u.toInt()

public val TPM_E_DECRYPT_ERROR: Hresult = 0x80280021u.toInt()

public val TPM_E_DEFEND_LOCK_RUNNING: Hresult = 0x80280803u.toInt()

public val TPM_E_DELEGATE_ADMIN: Hresult = 0x8028004Du.toInt()

public val TPM_E_DELEGATE_FAMILY: Hresult = 0x8028004Cu.toInt()

public val TPM_E_DELEGATE_LOCK: Hresult = 0x8028004Bu.toInt()

public val TPM_E_DISABLED: Hresult = 0x80280007u.toInt()

public val TPM_E_DISABLED_CMD: Hresult = 0x80280008u.toInt()

public val TPM_E_DOING_SELFTEST: Hresult = 0x80280802u.toInt()

public val TPM_E_DUPLICATE_VHANDLE: Hresult = 0x80280402u.toInt()

public val TPM_E_EMBEDDED_COMMAND_BLOCKED: Hresult = 0x80280403u.toInt()

public val TPM_E_EMBEDDED_COMMAND_UNSUPPORTED: Hresult = 0x80280404u.toInt()

public val TPM_E_ENCRYPT_ERROR: Hresult = 0x80280020u.toInt()

public val TPM_E_ERROR_MASK: Hresult = 0x80280000u.toInt()

public val TPM_E_FAIL: Hresult = 0x80280009u.toInt()

public val TPM_E_FAILEDSELFTEST: Hresult = 0x8028001Cu.toInt()

public val TPM_E_FAMILYCOUNT: Hresult = 0x80280040u.toInt()

public val TPM_E_INAPPROPRIATE_ENC: Hresult = 0x8028000Eu.toInt()

public val TPM_E_INAPPROPRIATE_SIG: Hresult = 0x80280027u.toInt()

public val TPM_E_INSTALL_DISABLED: Hresult = 0x8028000Bu.toInt()

public val TPM_E_INVALID_AUTHHANDLE: Hresult = 0x80280022u.toInt()

public val TPM_E_INVALID_FAMILY: Hresult = 0x80280037u.toInt()

public val TPM_E_INVALID_HANDLE: Hresult = 0x80280401u.toInt()

public val TPM_E_INVALID_KEYHANDLE: Hresult = 0x8028000Cu.toInt()

public val TPM_E_INVALID_KEYUSAGE: Hresult = 0x80280024u.toInt()

public val TPM_E_INVALID_OWNER_AUTH: Hresult = 0x80290601u.toInt()

public val TPM_E_INVALID_PCR_INFO: Hresult = 0x80280010u.toInt()

public val TPM_E_INVALID_POSTINIT: Hresult = 0x80280026u.toInt()

public val TPM_E_INVALID_RESOURCE: Hresult = 0x80280035u.toInt()

public val TPM_E_INVALID_STRUCTURE: Hresult = 0x80280043u.toInt()

public val TPM_E_IOERROR: Hresult = 0x8028001Fu.toInt()

public val TPM_E_KEYNOTFOUND: Hresult = 0x8028000Du.toInt()

public val TPM_E_KEY_ALREADY_FINALIZED: Hresult = 0x80290414u.toInt()

public val TPM_E_KEY_NOTSUPPORTED: Hresult = 0x8028003Au.toInt()

public val TPM_E_KEY_NOT_AUTHENTICATED: Hresult = 0x80290418u.toInt()

public val TPM_E_KEY_NOT_FINALIZED: Hresult = 0x80290411u.toInt()

public val TPM_E_KEY_NOT_LOADED: Hresult = 0x8029040Fu.toInt()

public val TPM_E_KEY_NOT_SIGNING_KEY: Hresult = 0x8029041Au.toInt()

public val TPM_E_KEY_OWNER_CONTROL: Hresult = 0x80280044u.toInt()

public val TPM_E_KEY_USAGE_POLICY_INVALID: Hresult = 0x80290416u.toInt()

public val TPM_E_KEY_USAGE_POLICY_NOT_SUPPORTED: Hresult = 0x80290415u.toInt()

public val TPM_E_LOCKED_OUT: Hresult = 0x8029041Bu.toInt()

public val TPM_E_MAXNVWRITES: Hresult = 0x80280048u.toInt()

public val TPM_E_MA_AUTHORITY: Hresult = 0x8028005Fu.toInt()

public val TPM_E_MA_DESTINATION: Hresult = 0x8028005Du.toInt()

public val TPM_E_MA_SOURCE: Hresult = 0x8028005Eu.toInt()

public val TPM_E_MA_TICKET_SIGNATURE: Hresult = 0x8028005Cu.toInt()

public val TPM_E_MIGRATEFAIL: Hresult = 0x8028000Fu.toInt()

public val TPM_E_NEEDS_SELFTEST: Hresult = 0x80280801u.toInt()

public val TPM_E_NOCONTEXTSPACE: Hresult = 0x80280063u.toInt()

public val TPM_E_NOOPERATOR: Hresult = 0x80280049u.toInt()

public val TPM_E_NOSPACE: Hresult = 0x80280011u.toInt()

public val TPM_E_NOSRK: Hresult = 0x80280012u.toInt()

public val TPM_E_NOTFIPS: Hresult = 0x80280036u.toInt()

public val TPM_E_NOTLOCAL: Hresult = 0x80280033u.toInt()

public val TPM_E_NOTRESETABLE: Hresult = 0x80280032u.toInt()

public val TPM_E_NOTSEALED_BLOB: Hresult = 0x80280013u.toInt()

public val TPM_E_NOT_FULLWRITE: Hresult = 0x80280046u.toInt()

public val TPM_E_NOT_PCR_BOUND: Hresult = 0x80290413u.toInt()

public val TPM_E_NO_ENDORSEMENT: Hresult = 0x80280023u.toInt()

public val TPM_E_NO_KEY_CERTIFICATION: Hresult = 0x80290410u.toInt()

public val TPM_E_NO_NV_PERMISSION: Hresult = 0x80280038u.toInt()

public val TPM_E_NO_WRAP_TRANSPORT: Hresult = 0x8028002Fu.toInt()

public val TPM_E_OWNER_CONTROL: Hresult = 0x8028004Fu.toInt()

public val TPM_E_OWNER_SET: Hresult = 0x80280014u.toInt()

public val TPM_E_PCP_AUTHENTICATION_FAILED: Hresult = 0x80290408u.toInt()

public val TPM_E_PCP_AUTHENTICATION_IGNORED: Hresult = 0x80290409u.toInt()

public val TPM_E_PCP_BUFFER_TOO_SMALL: Hresult = 0x80290406u.toInt()

public val TPM_E_PCP_DEVICE_NOT_READY: Hresult = 0x80290401u.toInt()

public val TPM_E_PCP_ERROR_MASK: Hresult = 0x80290400u.toInt()

public val TPM_E_PCP_FLAG_NOT_SUPPORTED: Hresult = 0x80290404u.toInt()

public val TPM_E_PCP_IFX_RSA_KEY_CREATION_BLOCKED: Hresult = 0x8029041Fu.toInt()

public val TPM_E_PCP_INTERNAL_ERROR: Hresult = 0x80290407u.toInt()

public val TPM_E_PCP_INVALID_HANDLE: Hresult = 0x80290402u.toInt()

public val TPM_E_PCP_INVALID_PARAMETER: Hresult = 0x80290403u.toInt()

public val TPM_E_PCP_KEY_HANDLE_INVALIDATED: Hresult = 0x80290422u.toInt()

public val TPM_E_PCP_KEY_NOT_AIK: Hresult = 0x80290419u.toInt()

public val TPM_E_PCP_NOT_SUPPORTED: Hresult = 0x80290405u.toInt()

public val TPM_E_PCP_PLATFORM_CLAIM_MAY_BE_OUTDATED: Hresult = 0x40290424u.toInt()

public val TPM_E_PCP_PLATFORM_CLAIM_OUTDATED: Hresult = 0x40290425u.toInt()

public val TPM_E_PCP_PLATFORM_CLAIM_REBOOT: Hresult = 0x40290426u.toInt()

public val TPM_E_PCP_POLICY_NOT_FOUND: Hresult = 0x8029040Au.toInt()

public val TPM_E_PCP_PROFILE_NOT_FOUND: Hresult = 0x8029040Bu.toInt()

public val TPM_E_PCP_RAW_POLICY_NOT_SUPPORTED: Hresult = 0x80290421u.toInt()

public val TPM_E_PCP_TICKET_MISSING: Hresult = 0x80290420u.toInt()

public val TPM_E_PCP_UNSUPPORTED_PSS_SALT: Hresult = 0x40290423u.toInt()

public val TPM_E_PCP_VALIDATION_FAILED: Hresult = 0x8029040Cu.toInt()

public val TPM_E_PCP_WRONG_PARENT: Hresult = 0x8029040Eu.toInt()

public val TPM_E_PERMANENTEK: Hresult = 0x80280061u.toInt()

public val TPM_E_PER_NOWRITE: Hresult = 0x8028003Fu.toInt()

public val TPM_E_PPI_ACPI_FAILURE: Hresult = 0x80290300u.toInt()

public val TPM_E_PPI_BIOS_FAILURE: Hresult = 0x80290302u.toInt()

public val TPM_E_PPI_BLOCKED_IN_BIOS: Hresult = 0x80290304u.toInt()

public val TPM_E_PPI_NOT_SUPPORTED: Hresult = 0x80290303u.toInt()

public val TPM_E_PPI_USER_ABORT: Hresult = 0x80290301u.toInt()

public val TPM_E_PROVISIONING_INCOMPLETE: Hresult = 0x80290600u.toInt()

public val TPM_E_READ_ONLY: Hresult = 0x8028003Eu.toInt()

public val TPM_E_REQUIRES_SIGN: Hresult = 0x80280039u.toInt()

public val TPM_E_RESOURCEMISSING: Hresult = 0x8028004Au.toInt()

public val TPM_E_RESOURCES: Hresult = 0x80280015u.toInt()

public val TPM_E_RETRY: Hresult = 0x80280800u.toInt()

public val TPM_E_SHA_ERROR: Hresult = 0x8028001Bu.toInt()

public val TPM_E_SHA_THREAD: Hresult = 0x8028001Au.toInt()

public val TPM_E_SHORTRANDOM: Hresult = 0x80280016u.toInt()

public val TPM_E_SIZE: Hresult = 0x80280017u.toInt()

public val TPM_E_SOFT_KEY_ERROR: Hresult = 0x80290417u.toInt()

public val TPM_E_TOOMANYCONTEXTS: Hresult = 0x8028005Bu.toInt()

public val TPM_E_TOO_MUCH_DATA: Hresult = 0x80290602u.toInt()

public val TPM_E_TPM_GENERATED_EPS: Hresult = 0x80290603u.toInt()

public val TPM_E_TRANSPORT_NOTEXCLUSIVE: Hresult = 0x8028004Eu.toInt()

public val TPM_E_VERSION_NOT_SUPPORTED: Hresult = 0x8029041Du.toInt()

public val TPM_E_WRITE_LOCKED: Hresult = 0x80280041u.toInt()

public val TPM_E_WRONGPCRVAL: Hresult = 0x80280018u.toInt()

public val TPM_E_WRONG_ENTITYTYPE: Hresult = 0x80280025u.toInt()

public val TPM_E_ZERO_EXHAUST_ENABLED: Hresult = 0x80290500u.toInt()

public val TRUE: Bool = 1

public val TRUST_E_ACTION_UNKNOWN: Hresult = 0x800B0002u.toInt()

public val TRUST_E_BAD_DIGEST: Hresult = 0x80096010u.toInt()

public val TRUST_E_BASIC_CONSTRAINTS: Hresult = 0x80096019u.toInt()

public val TRUST_E_CERT_SIGNATURE: Hresult = 0x80096004u.toInt()

public val TRUST_E_COUNTER_SIGNER: Hresult = 0x80096003u.toInt()

public val TRUST_E_EXPLICIT_DISTRUST: Hresult = 0x800B0111u.toInt()

public val TRUST_E_FAIL: Hresult = 0x800B010Bu.toInt()

public val TRUST_E_FINANCIAL_CRITERIA: Hresult = 0x8009601Eu.toInt()

public val TRUST_E_MALFORMED_SIGNATURE: Hresult = 0x80096011u.toInt()

public val TRUST_E_NOSIGNATURE: Hresult = 0x800B0100u.toInt()

public val TRUST_E_NO_SIGNER_CERT: Hresult = 0x80096002u.toInt()

public val TRUST_E_PROVIDER_UNKNOWN: Hresult = 0x800B0001u.toInt()

public val TRUST_E_SUBJECT_FORM_UNKNOWN: Hresult = 0x800B0003u.toInt()

public val TRUST_E_SUBJECT_NOT_TRUSTED: Hresult = 0x800B0004u.toInt()

public val TRUST_E_SYSTEM_ERROR: Hresult = 0x80096001u.toInt()

public val TRUST_E_TIME_STAMP: Hresult = 0x80096005u.toInt()

public val TYPE_E_AMBIGUOUSNAME: Hresult = 0x8002802Cu.toInt()

public val TYPE_E_BADMODULEKIND: Hresult = 0x800288BDu.toInt()

public val TYPE_E_BUFFERTOOSMALL: Hresult = 0x80028016u.toInt()

public val TYPE_E_CANTCREATETMPFILE: Hresult = 0x80028CA3u.toInt()

public val TYPE_E_CANTLOADLIBRARY: Hresult = 0x80029C4Au.toInt()

public val TYPE_E_CIRCULARTYPE: Hresult = 0x80029C84u.toInt()

public val TYPE_E_DLLFUNCTIONNOTFOUND: Hresult = 0x8002802Fu.toInt()

public val TYPE_E_DUPLICATEID: Hresult = 0x800288C6u.toInt()

public val TYPE_E_ELEMENTNOTFOUND: Hresult = 0x8002802Bu.toInt()

public val TYPE_E_FIELDNOTFOUND: Hresult = 0x80028017u.toInt()

public val TYPE_E_INCONSISTENTPROPFUNCS: Hresult = 0x80029C83u.toInt()

public val TYPE_E_INVALIDID: Hresult = 0x800288CFu.toInt()

public val TYPE_E_INVALIDSTATE: Hresult = 0x80028029u.toInt()

public val TYPE_E_INVDATAREAD: Hresult = 0x80028018u.toInt()

public val TYPE_E_IOERROR: Hresult = 0x80028CA2u.toInt()

public val TYPE_E_LIBNOTREGISTERED: Hresult = 0x8002801Du.toInt()

public val TYPE_E_NAMECONFLICT: Hresult = 0x8002802Du.toInt()

public val TYPE_E_OUTOFBOUNDS: Hresult = 0x80028CA1u.toInt()

public val TYPE_E_QUALIFIEDNAMEDISALLOWED: Hresult = 0x80028028u.toInt()

public val TYPE_E_REGISTRYACCESS: Hresult = 0x8002801Cu.toInt()

public val TYPE_E_SIZETOOBIG: Hresult = 0x800288C5u.toInt()

public val TYPE_E_TYPEMISMATCH: Hresult = 0x80028CA0u.toInt()

public val TYPE_E_UNDEFINEDTYPE: Hresult = 0x80028027u.toInt()

public val TYPE_E_UNKNOWNLCID: Hresult = 0x8002802Eu.toInt()

public val TYPE_E_UNSUPFORMAT: Hresult = 0x80028019u.toInt()

public val TYPE_E_WRONGTYPEKIND: Hresult = 0x8002802Au.toInt()

public val UCEERR_BLOCKSFULL: Hresult = 0x88980409u.toInt()

public val UCEERR_CHANNELSYNCABANDONED: Hresult = 0x88980414u.toInt()

public val UCEERR_CHANNELSYNCTIMEDOUT: Hresult = 0x88980413u.toInt()

public val UCEERR_COMMANDTRANSPORTDENIED: Hresult = 0x88980418u.toInt()

public val UCEERR_CONNECTIONIDLOOKUPFAILED: Hresult = 0x88980408u.toInt()

public val UCEERR_CTXSTACKFRSTTARGETNULL: Hresult = 0x88980407u.toInt()

public val UCEERR_FEEDBACK_UNSUPPORTED: Hresult = 0x88980417u.toInt()

public val UCEERR_GRAPHICSSTREAMALREADYOPEN: Hresult = 0x88980420u.toInt()

public val UCEERR_GRAPHICSSTREAMUNAVAILABLE: Hresult = 0x88980419u.toInt()

public val UCEERR_HANDLELOOKUPFAILED: Hresult = 0x88980405u.toInt()

public val UCEERR_ILLEGALHANDLE: Hresult = 0x88980404u.toInt()

public val UCEERR_ILLEGALPACKET: Hresult = 0x88980402u.toInt()

public val UCEERR_ILLEGALRECORDTYPE: Hresult = 0x8898040Cu.toInt()

public val UCEERR_INVALIDPACKETHEADER: Hresult = 0x88980400u.toInt()

public val UCEERR_MALFORMEDPACKET: Hresult = 0x88980403u.toInt()

public val UCEERR_MEMORYFAILURE: Hresult = 0x8898040Au.toInt()

public val UCEERR_MISSINGBEGINCOMMAND: Hresult = 0x88980412u.toInt()

public val UCEERR_MISSINGENDCOMMAND: Hresult = 0x88980411u.toInt()

public val UCEERR_NO_MULTIPLE_WORKER_THREADS: Hresult = 0x8898040Fu.toInt()

public val UCEERR_OUTOFHANDLES: Hresult = 0x8898040Du.toInt()

public val UCEERR_PACKETRECORDOUTOFRANGE: Hresult = 0x8898040Bu.toInt()

public val UCEERR_PARTITION_ZOMBIED: Hresult = 0x88980423u.toInt()

public val UCEERR_REMOTINGNOTSUPPORTED: Hresult = 0x88980410u.toInt()

public val UCEERR_RENDERTHREADFAILURE: Hresult = 0x88980406u.toInt()

public val UCEERR_TRANSPORTDISCONNECTED: Hresult = 0x88980421u.toInt()

public val UCEERR_TRANSPORTOVERLOADED: Hresult = 0x88980422u.toInt()

public val UCEERR_TRANSPORTUNAVAILABLE: Hresult = 0x88980416u.toInt()

public val UCEERR_UNCHANGABLE_UPDATE_ATTEMPTED: Hresult = 0x8898040Eu.toInt()

public val UCEERR_UNKNOWNPACKET: Hresult = 0x88980401u.toInt()

public val UCEERR_UNSUPPORTEDTRANSPORTVERSION: Hresult = 0x88980415u.toInt()

public val UI_E_AMBIGUOUS_MATCH: Hresult = 0x802A000Au.toInt()

public val UI_E_BOOLEAN_EXPECTED: Hresult = 0x802A0008u.toInt()

public val UI_E_CREATE_FAILED: Hresult = 0x802A0001u.toInt()

public val UI_E_DIFFERENT_OWNER: Hresult = 0x802A0009u.toInt()

public val UI_E_END_KEYFRAME_NOT_DETERMINED: Hresult = 0x802A0104u.toInt()

public val UI_E_FP_OVERFLOW: Hresult = 0x802A000Bu.toInt()

public val UI_E_ILLEGAL_REENTRANCY: Hresult = 0x802A0003u.toInt()

public val UI_E_INVALID_DIMENSION: Hresult = 0x802A010Bu.toInt()

public val UI_E_INVALID_OUTPUT: Hresult = 0x802A0007u.toInt()

public val UI_E_LOOPS_OVERLAP: Hresult = 0x802A0105u.toInt()

public val UI_E_OBJECT_SEALED: Hresult = 0x802A0004u.toInt()

public val UI_E_PRIMITIVE_OUT_OF_BOUNDS: Hresult = 0x802A010Cu.toInt()

public val UI_E_SHUTDOWN_CALLED: Hresult = 0x802A0002u.toInt()

public val UI_E_START_KEYFRAME_AFTER_END: Hresult = 0x802A0103u.toInt()

public val UI_E_STORYBOARD_ACTIVE: Hresult = 0x802A0101u.toInt()

public val UI_E_STORYBOARD_NOT_PLAYING: Hresult = 0x802A0102u.toInt()

public val UI_E_TIMER_CLIENT_ALREADY_CONNECTED: Hresult = 0x802A010Au.toInt()

public val UI_E_TIME_BEFORE_LAST_UPDATE: Hresult = 0x802A0109u.toInt()

public val UI_E_TRANSITION_ALREADY_USED: Hresult = 0x802A0106u.toInt()

public val UI_E_TRANSITION_ECLIPSED: Hresult = 0x802A0108u.toInt()

public val UI_E_TRANSITION_NOT_IN_STORYBOARD: Hresult = 0x802A0107u.toInt()

public val UI_E_VALUE_NOT_DETERMINED: Hresult = 0x802A0006u.toInt()

public val UI_E_VALUE_NOT_SET: Hresult = 0x802A0005u.toInt()

public val UI_E_WINDOW_CLOSED: Hresult = 0x802A0201u.toInt()

public val UI_E_WRONG_THREAD: Hresult = 0x802A000Cu.toInt()

public val UTC_E_ACTION_NOT_SUPPORTED_IN_DESTINATION: Hresult = 0x87C51044u.toInt()

public val UTC_E_AGENT_DIAGNOSTICS_TOO_LARGE: Hresult = 0x87C51055u.toInt()

public val UTC_E_ALTERNATIVE_TRACE_CANNOT_PREEMPT: Hresult = 0x87C51002u.toInt()

public val UTC_E_AOT_NOT_RUNNING: Hresult = 0x87C51003u.toInt()

public val UTC_E_API_BUSY: Hresult = 0x87C5102Bu.toInt()

public val UTC_E_API_NOT_SUPPORTED: Hresult = 0x87C5103Cu.toInt()

public val UTC_E_API_RESULT_UNAVAILABLE: Hresult = 0x87C51028u.toInt()

public val UTC_E_BINARY_MISSING: Hresult = 0x87C51034u.toInt()

public val UTC_E_CANNOT_LOAD_SCENARIO_EDITOR_XML: Hresult = 0x87C5101Fu.toInt()

public val UTC_E_CERT_REV_FAILED: Hresult = 0x87C5103Fu.toInt()

public val UTC_E_CHILD_PROCESS_FAILED: Hresult = 0x87C5101Du.toInt()

public val UTC_E_COMMAND_LINE_NOT_AUTHORIZED: Hresult = 0x87C5101Eu.toInt()

public val UTC_E_DELAY_TERMINATED: Hresult = 0x87C51025u.toInt()

public val UTC_E_DEVICE_TICKET_ERROR: Hresult = 0x87C51026u.toInt()

public val UTC_E_DIAGRULES_SCHEMAVERSION_MISMATCH: Hresult = 0x87C5100Au.toInt()

public val UTC_E_ESCALATION_ALREADY_RUNNING: Hresult = 0x87C5100Fu.toInt()

public val UTC_E_ESCALATION_CANCELLED_AT_SHUTDOWN: Hresult = 0x87C5105Au.toInt()

public val UTC_E_ESCALATION_DIRECTORY_ALREADY_EXISTS: Hresult = 0x87C5102Fu.toInt()

public val UTC_E_ESCALATION_NOT_AUTHORIZED: Hresult = 0x87C5101Bu.toInt()

public val UTC_E_ESCALATION_TIMED_OUT: Hresult = 0x87C51020u.toInt()

public val UTC_E_EVENTLOG_ENTRY_MALFORMED: Hresult = 0x87C51009u.toInt()

public val UTC_E_EXCLUSIVITY_NOT_AVAILABLE: Hresult = 0x87C5102Du.toInt()

public val UTC_E_EXE_TERMINATED: Hresult = 0x87C5101Au.toInt()

public val UTC_E_FAILED_TO_RECEIVE_AGENT_DIAGNOSTICS: Hresult = 0x87C51056u.toInt()

public val UTC_E_FAILED_TO_RESOLVE_CONTAINER_ID: Hresult = 0x87C51036u.toInt()

public val UTC_E_FAILED_TO_START_NDISCAP: Hresult = 0x87C51040u.toInt()

public val UTC_E_FILTER_FUNCTION_RESTRICTED: Hresult = 0x87C51048u.toInt()

public val UTC_E_FILTER_ILLEGAL_EVAL: Hresult = 0x87C51053u.toInt()

public val UTC_E_FILTER_INVALID_COMMAND: Hresult = 0x87C51052u.toInt()

public val UTC_E_FILTER_INVALID_FUNCTION: Hresult = 0x87C51050u.toInt()

public val UTC_E_FILTER_INVALID_FUNCTION_PARAMS: Hresult = 0x87C51051u.toInt()

public val UTC_E_FILTER_INVALID_TYPE: Hresult = 0x87C51046u.toInt()

public val UTC_E_FILTER_MISSING_ATTRIBUTE: Hresult = 0x87C51045u.toInt()

public val UTC_E_FILTER_VARIABLE_NOT_FOUND: Hresult = 0x87C51047u.toInt()

public val UTC_E_FILTER_VERSION_MISMATCH: Hresult = 0x87C51049u.toInt()

public val UTC_E_FORWARDER_ALREADY_DISABLED: Hresult = 0x87C51008u.toInt()

public val UTC_E_FORWARDER_ALREADY_ENABLED: Hresult = 0x87C51007u.toInt()

public val UTC_E_FORWARDER_PRODUCER_MISMATCH: Hresult = 0x87C51012u.toInt()

public val UTC_E_GETFILEINFOACTION_FILE_NOT_APPROVED: Hresult = 0x87C5105Bu.toInt()

public val UTC_E_GETFILE_EXTERNAL_PATH_NOT_APPROVED: Hresult = 0x87C5103Du.toInt()

public val UTC_E_GETFILE_FILE_PATH_NOT_APPROVED: Hresult = 0x87C5102Eu.toInt()

public val UTC_E_INSUFFICIENT_SPACE_TO_START_TRACE: Hresult = 0x87C51059u.toInt()

public val UTC_E_INTENTIONAL_SCRIPT_FAILURE: Hresult = 0x87C51013u.toInt()

public val UTC_E_INVALID_AGGREGATION_STRUCT: Hresult = 0x87C51043u.toInt()

public val UTC_E_INVALID_CUSTOM_FILTER: Hresult = 0x87C5100Cu.toInt()

public val UTC_E_INVALID_FILTER: Hresult = 0x87C51019u.toInt()

public val UTC_E_KERNELDUMP_LIMIT_REACHED: Hresult = 0x87C51041u.toInt()

public val UTC_E_MISSING_AGGREGATE_EVENT_TAG: Hresult = 0x87C51042u.toInt()

public val UTC_E_MULTIPLE_TIME_TRIGGER_ON_SINGLE_STATE: Hresult = 0x87C51033u.toInt()

public val UTC_E_NO_WER_LOGGER_SUPPORTED: Hresult = 0x87C51015u.toInt()

public val UTC_E_PERFTRACK_ALREADY_TRACING: Hresult = 0x87C51010u.toInt()

public val UTC_E_REACHED_MAX_ESCALATIONS: Hresult = 0x87C51011u.toInt()

public val UTC_E_REESCALATED_TOO_QUICKLY: Hresult = 0x87C5100Eu.toInt()

public val UTC_E_RPC_TIMEOUT: Hresult = 0x87C51029u.toInt()

public val UTC_E_RPC_WAIT_FAILED: Hresult = 0x87C5102Au.toInt()

public val UTC_E_SCENARIODEF_NOT_FOUND: Hresult = 0x87C51005u.toInt()

public val UTC_E_SCENARIODEF_SCHEMAVERSION_MISMATCH: Hresult = 0x87C51018u.toInt()

public val UTC_E_SCENARIO_HAS_NO_ACTIONS: Hresult = 0x87C51057u.toInt()

public val UTC_E_SCENARIO_THROTTLED: Hresult = 0x87C5103Bu.toInt()

public val UTC_E_SCRIPT_MISSING: Hresult = 0x87C5103Au.toInt()

public val UTC_E_SCRIPT_TERMINATED: Hresult = 0x87C5100Bu.toInt()

public val UTC_E_SCRIPT_TYPE_INVALID: Hresult = 0x87C51004u.toInt()

public val UTC_E_SETREGKEYACTION_TYPE_NOT_APPROVED: Hresult = 0x87C5105Cu.toInt()

public val UTC_E_SETUP_NOT_AUTHORIZED: Hresult = 0x87C5101Cu.toInt()

public val UTC_E_SETUP_TIMED_OUT: Hresult = 0x87C51021u.toInt()

public val UTC_E_SIF_NOT_SUPPORTED: Hresult = 0x87C51024u.toInt()

public val UTC_E_SQM_INIT_FAILED: Hresult = 0x87C51014u.toInt()

public val UTC_E_THROTTLED: Hresult = 0x87C51038u.toInt()

public val UTC_E_TIME_TRIGGER_INVALID_TIME_RANGE: Hresult = 0x87C51032u.toInt()

public val UTC_E_TIME_TRIGGER_ONLY_VALID_ON_SINGLE_TRANSITION: Hresult = 0x87C51031u.toInt()

public val UTC_E_TIME_TRIGGER_ON_START_INVALID: Hresult = 0x87C51030u.toInt()

public val UTC_E_TOGGLE_TRACE_STARTED: Hresult = 0x87C51001u.toInt()

public val UTC_E_TRACEPROFILE_NOT_FOUND: Hresult = 0x87C51006u.toInt()

public val UTC_E_TRACERS_DONT_EXIST: Hresult = 0x87C51016u.toInt()

public val UTC_E_TRACE_BUFFER_LIMIT_EXCEEDED: Hresult = 0x87C51027u.toInt()

public val UTC_E_TRACE_MIN_DURATION_REQUIREMENT_NOT_MET: Hresult = 0x87C5102Cu.toInt()

public val UTC_E_TRACE_NOT_RUNNING: Hresult = 0x87C5100Du.toInt()

public val UTC_E_TRACE_THROTTLED: Hresult = 0x87C5105Du.toInt()

public val UTC_E_TRIGGER_MISMATCH: Hresult = 0x87C51022u.toInt()

public val UTC_E_TRIGGER_NOT_FOUND: Hresult = 0x87C51023u.toInt()

public val UTC_E_TRY_GET_SCENARIO_TIMEOUT_EXCEEDED: Hresult = 0x87C5103Eu.toInt()

public val UTC_E_TTTRACER_RETURNED_ERROR: Hresult = 0x87C51054u.toInt()

public val UTC_E_TTTRACER_STORAGE_FULL: Hresult = 0x87C51058u.toInt()

public val UTC_E_UNABLE_TO_RESOLVE_SESSION: Hresult = 0x87C51037u.toInt()

public val UTC_E_UNAPPROVED_SCRIPT: Hresult = 0x87C51039u.toInt()

public val UTC_E_WINRT_INIT_FAILED: Hresult = 0x87C51017u.toInt()

public val VARIANT_FALSE: VariantBool = 0

public val VARIANT_TRUE: VariantBool = (-1).toShort()

public val VIEW_E_DRAW: Hresult = 0x80040140u.toInt()

public val VIEW_E_FIRST: Int = -2147221184

public val VIEW_E_LAST: Int = -2147221169

public val VIEW_S_ALREADY_FROZEN: Hresult = 0x40140u.toInt()

public val VIEW_S_FIRST: Int = 262464

public val VIEW_S_LAST: Int = 262479

public val VM_SAVED_STATE_DUMP_E_GUEST_MEMORY_NOT_FOUND: Hresult = 0xC0370501u.toInt()

public val VM_SAVED_STATE_DUMP_E_INVALID_VP_STATE: Hresult = 0xC0370506u.toInt()

public val VM_SAVED_STATE_DUMP_E_NESTED_VIRTUALIZATION_NOT_SUPPORTED: Hresult = 0xC0370503u.toInt()

public val VM_SAVED_STATE_DUMP_E_NO_VP_FOUND_IN_PARTITION_STATE: Hresult = 0xC0370502u.toInt()

public val VM_SAVED_STATE_DUMP_E_PARTITION_STATE_NOT_FOUND: Hresult = 0xC0370500u.toInt()

public val VM_SAVED_STATE_DUMP_E_VA_NOT_MAPPED: Hresult = 0xC0370505u.toInt()

public val VM_SAVED_STATE_DUMP_E_VP_VTL_NOT_ENABLED: Hresult = 0xC0370509u.toInt()

public val VM_SAVED_STATE_DUMP_E_WINDOWS_KERNEL_IMAGE_NOT_FOUND: Hresult = 0xC0370504u.toInt()

public val VOLMGR_KSR_BYPASS: Ntstatus = 0x80380003u.toInt()

public val VOLMGR_KSR_ERROR: Ntstatus = 0x80380001u.toInt()

public val VOLMGR_KSR_READ_ERROR: Ntstatus = 0x80380002u.toInt()

public val WAIT_ABANDONED: WaitEvent = 128u

public val WAIT_ABANDONED_0: WaitEvent = 128u

public val WAIT_FAILED: WaitEvent = 4294967295u

public val WAIT_IO_COMPLETION: WaitEvent = 192u

public val WAIT_OBJECT_0: WaitEvent = 0u

public val WAIT_TIMEOUT: WaitEvent = 258u

public val WARNING_IPSEC_MM_POLICY_PRUNED: Int = 13024

public val WARNING_IPSEC_QM_POLICY_PRUNED: Int = 13025

public val WARNING_NO_MD5_MIGRATION: UInt = 946u

public val WBREAK_E_BUFFER_TOO_SMALL: Hresult = 0x80041783u.toInt()

public val WBREAK_E_END_OF_TEXT: Hresult = 0x80041780u.toInt()

public val WBREAK_E_INIT_FAILED: Hresult = 0x80041785u.toInt()

public val WBREAK_E_QUERY_ONLY: Hresult = 0x80041782u.toInt()

public val WEB_E_INVALID_JSON_NUMBER: Hresult = 0x83750008u.toInt()

public val WEB_E_INVALID_JSON_STRING: Hresult = 0x83750007u.toInt()

public val WEB_E_INVALID_XML: Hresult = 0x83750002u.toInt()

public val WEB_E_JSON_VALUE_NOT_FOUND: Hresult = 0x83750009u.toInt()

public val WEB_E_MISSING_REQUIRED_ATTRIBUTE: Hresult = 0x83750004u.toInt()

public val WEB_E_MISSING_REQUIRED_ELEMENT: Hresult = 0x83750003u.toInt()

public val WEB_E_RESOURCE_TOO_LARGE: Hresult = 0x83750006u.toInt()

public val WEB_E_UNEXPECTED_CONTENT: Hresult = 0x83750005u.toInt()

public val WEB_E_UNSUPPORTED_FORMAT: Hresult = 0x83750001u.toInt()

public val WEP_E_BUFFER_TOO_LARGE: Hresult = 0x88010009u.toInt()

public val WEP_E_FIXED_DATA_NOT_SUPPORTED: Hresult = 0x88010002u.toInt()

public val WEP_E_HARDWARE_NOT_COMPLIANT: Hresult = 0x88010003u.toInt()

public val WEP_E_LOCK_NOT_CONFIGURED: Hresult = 0x88010004u.toInt()

public val WEP_E_NOT_PROVISIONED_ON_ALL_VOLUMES: Hresult = 0x88010001u.toInt()

public val WEP_E_NO_LICENSE: Hresult = 0x88010006u.toInt()

public val WEP_E_OS_NOT_PROTECTED: Hresult = 0x88010007u.toInt()

public val WEP_E_PROTECTION_SUSPENDED: Hresult = 0x88010005u.toInt()

public val WEP_E_UNEXPECTED_FAIL: Hresult = 0x88010008u.toInt()

public val WER_E_ALREADY_REPORTING: Hresult = 0x801B8004u.toInt()

public val WER_E_CANCELED: Hresult = 0x801B8001u.toInt()

public val WER_E_CRASH_FAILURE: Hresult = 0x801B8000u.toInt()

public val WER_E_DUMP_THROTTLED: Hresult = 0x801B8005u.toInt()

public val WER_E_INSUFFICIENT_CONSENT: Hresult = 0x801B8006u.toInt()

public val WER_E_NETWORK_FAILURE: Hresult = 0x801B8002u.toInt()

public val WER_E_NOT_INITIALIZED: Hresult = 0x801B8003u.toInt()

public val WER_E_TOO_HEAVY: Hresult = 0x801B8007u.toInt()

public val WER_S_ASSERT_CONTINUE: Hresult = 0x1B000Au.toInt()

public val WER_S_DISABLED: Hresult = 0x1B0003u.toInt()

public val WER_S_DISABLED_ARCHIVE: Hresult = 0x1B0006u.toInt()

public val WER_S_DISABLED_QUEUE: Hresult = 0x1B0005u.toInt()

public val WER_S_IGNORE_ALL_ASSERTS: Hresult = 0x1B0009u.toInt()

public val WER_S_IGNORE_ASSERT_INSTANCE: Hresult = 0x1B0008u.toInt()

public val WER_S_REPORT_ASYNC: Hresult = 0x1B0007u.toInt()

public val WER_S_REPORT_DEBUG: Hresult = 0x1B0000u.toInt()

public val WER_S_REPORT_QUEUED: Hresult = 0x1B0002u.toInt()

public val WER_S_REPORT_UPLOADED: Hresult = 0x1B0001u.toInt()

public val WER_S_REPORT_UPLOADED_CAB: Hresult = 0x1B000Cu.toInt()

public val WER_S_SUSPENDED_UPLOAD: Hresult = 0x1B0004u.toInt()

public val WER_S_THROTTLED: Hresult = 0x1B000Bu.toInt()

public val WHV_E_GPA_RANGE_NOT_FOUND: Hresult = 0x80370305u.toInt()

public val WHV_E_INSUFFICIENT_BUFFER: Hresult = 0x80370301u.toInt()

public val WHV_E_INVALID_PARTITION_CONFIG: Hresult = 0x80370304u.toInt()

public val WHV_E_INVALID_VP_REGISTER_NAME: Hresult = 0x80370309u.toInt()

public val WHV_E_INVALID_VP_STATE: Hresult = 0x80370308u.toInt()

public val WHV_E_UNKNOWN_CAPABILITY: Hresult = 0x80370300u.toInt()

public val WHV_E_UNKNOWN_PROPERTY: Hresult = 0x80370302u.toInt()

public val WHV_E_UNSUPPORTED_HYPERVISOR_CONFIG: Hresult = 0x80370303u.toInt()

public val WHV_E_UNSUPPORTED_PROCESSOR_CONFIG: Hresult = 0x80370310u.toInt()

public val WHV_E_VP_ALREADY_EXISTS: Hresult = 0x80370306u.toInt()

public val WHV_E_VP_DOES_NOT_EXIST: Hresult = 0x80370307u.toInt()

public val WINCODEC_ERR_ALREADYLOCKED: Hresult = 0x88982F0Du.toInt()

public val WINCODEC_ERR_BADHEADER: Hresult = 0x88982F61u.toInt()

public val WINCODEC_ERR_BADIMAGE: Hresult = 0x88982F60u.toInt()

public val WINCODEC_ERR_BADMETADATAHEADER: Hresult = 0x88982F63u.toInt()

public val WINCODEC_ERR_BADSTREAMDATA: Hresult = 0x88982F70u.toInt()

public val WINCODEC_ERR_CODECNOTHUMBNAIL: Hresult = 0x88982F44u.toInt()

public val WINCODEC_ERR_CODECPRESENT: Hresult = 0x88982F43u.toInt()

public val WINCODEC_ERR_CODECTOOMANYSCANLINES: Hresult = 0x88982F46u.toInt()

public val WINCODEC_ERR_COMPONENTINITIALIZEFAILURE: Hresult = 0x88982F8Bu.toInt()

public val WINCODEC_ERR_COMPONENTNOTFOUND: Hresult = 0x88982F50u.toInt()

public val WINCODEC_ERR_DUPLICATEMETADATAPRESENT: Hresult = 0x88982F8Du.toInt()

public val WINCODEC_ERR_FRAMEMISSING: Hresult = 0x88982F62u.toInt()

public val WINCODEC_ERR_IMAGESIZEOUTOFRANGE: Hresult = 0x88982F51u.toInt()

public val WINCODEC_ERR_INSUFFICIENTBUFFER: Hresult = 0x88982F8Cu.toInt()

public val WINCODEC_ERR_INTERNALERROR: Hresult = 0x88982F48u.toInt()

public val WINCODEC_ERR_INVALIDJPEGSCANINDEX: Hresult = 0x88982F96u.toInt()

public val WINCODEC_ERR_INVALIDPROGRESSIVELEVEL: Hresult = 0x88982F95u.toInt()

public val WINCODEC_ERR_INVALIDQUERYCHARACTER: Hresult = 0x88982F93u.toInt()

public val WINCODEC_ERR_INVALIDQUERYREQUEST: Hresult = 0x88982F90u.toInt()

public val WINCODEC_ERR_INVALIDREGISTRATION: Hresult = 0x88982F8Au.toInt()

public val WINCODEC_ERR_NOTINITIALIZED: Hresult = 0x88982F0Cu.toInt()

public val WINCODEC_ERR_PALETTEUNAVAILABLE: Hresult = 0x88982F45u.toInt()

public val WINCODEC_ERR_PROPERTYNOTFOUND: Hresult = 0x88982F40u.toInt()

public val WINCODEC_ERR_PROPERTYNOTSUPPORTED: Hresult = 0x88982F41u.toInt()

public val WINCODEC_ERR_PROPERTYSIZE: Hresult = 0x88982F42u.toInt()

public val WINCODEC_ERR_PROPERTYUNEXPECTEDTYPE: Hresult = 0x88982F8Eu.toInt()

public val WINCODEC_ERR_REQUESTONLYVALIDATMETADATAROOT: Hresult = 0x88982F92u.toInt()

public val WINCODEC_ERR_SOURCERECTDOESNOTMATCHDIMENSIONS: Hresult = 0x88982F49u.toInt()

public val WINCODEC_ERR_STREAMNOTAVAILABLE: Hresult = 0x88982F73u.toInt()

public val WINCODEC_ERR_STREAMREAD: Hresult = 0x88982F72u.toInt()

public val WINCODEC_ERR_STREAMWRITE: Hresult = 0x88982F71u.toInt()

public val WINCODEC_ERR_TOOMUCHMETADATA: Hresult = 0x88982F52u.toInt()

public val WINCODEC_ERR_UNEXPECTEDMETADATATYPE: Hresult = 0x88982F91u.toInt()

public val WINCODEC_ERR_UNEXPECTEDSIZE: Hresult = 0x88982F8Fu.toInt()

public val WINCODEC_ERR_UNKNOWNIMAGEFORMAT: Hresult = 0x88982F07u.toInt()

public val WINCODEC_ERR_UNSUPPORTEDOPERATION: Hresult = 0x88982F81u.toInt()

public val WINCODEC_ERR_UNSUPPORTEDPIXELFORMAT: Hresult = 0x88982F80u.toInt()

public val WINCODEC_ERR_UNSUPPORTEDVERSION: Hresult = 0x88982F0Bu.toInt()

public val WINCODEC_ERR_VALUEOUTOFRANGE: Hresult = 0x88982F05u.toInt()

public val WINCODEC_ERR_WIN32ERROR: Hresult = 0x88982F94u.toInt()

public val WINCODEC_ERR_WRONGSTATE: Hresult = 0x88982F04u.toInt()

public val WININET_E_ASYNC_THREAD_FAILED: Hresult = 0x80072F0Fu.toInt()

public val WININET_E_BAD_AUTO_PROXY_SCRIPT: Hresult = 0x80072F86u.toInt()

public val WININET_E_BAD_OPTION_LENGTH: Hresult = 0x80072EEAu.toInt()

public val WININET_E_BAD_REGISTRY_PARAMETER: Hresult = 0x80072EF6u.toInt()

public val WININET_E_CANNOT_CONNECT: Hresult = 0x80072EFDu.toInt()

public val WININET_E_CHG_POST_IS_NON_SECURE: Hresult = 0x80072F0Au.toInt()

public val WININET_E_CLIENT_AUTH_CERT_NEEDED: Hresult = 0x80072F0Cu.toInt()

public val WININET_E_CLIENT_AUTH_NOT_SETUP: Hresult = 0x80072F0Eu.toInt()

public val WININET_E_CONNECTION_ABORTED: Hresult = 0x80072EFEu.toInt()

public val WININET_E_CONNECTION_RESET: Hresult = 0x80072EFFu.toInt()

public val WININET_E_COOKIE_DECLINED: Hresult = 0x80072F82u.toInt()

public val WININET_E_COOKIE_NEEDS_CONFIRMATION: Hresult = 0x80072F81u.toInt()

public val WININET_E_DECODING_FAILED: Hresult = 0x80072F8Fu.toInt()

public val WININET_E_DIALOG_PENDING: Hresult = 0x80072F11u.toInt()

public val WININET_E_DISCONNECTED: Hresult = 0x80072F83u.toInt()

public val WININET_E_DOWNLEVEL_SERVER: Hresult = 0x80072F77u.toInt()

public val WININET_E_EXTENDED_ERROR: Hresult = 0x80072EE3u.toInt()

public val WININET_E_FAILED_DUETOSECURITYCHECK: Hresult = 0x80072F8Bu.toInt()

public val WININET_E_FORCE_RETRY: Hresult = 0x80072F00u.toInt()

public val WININET_E_HANDLE_EXISTS: Hresult = 0x80072F04u.toInt()

public val WININET_E_HEADER_ALREADY_EXISTS: Hresult = 0x80072F7Bu.toInt()

public val WININET_E_HEADER_NOT_FOUND: Hresult = 0x80072F76u.toInt()

public val WININET_E_HTTPS_HTTP_SUBMIT_REDIR: Hresult = 0x80072F14u.toInt()

public val WININET_E_HTTPS_TO_HTTP_ON_REDIR: Hresult = 0x80072F08u.toInt()

public val WININET_E_HTTP_TO_HTTPS_ON_REDIR: Hresult = 0x80072F07u.toInt()

public val WININET_E_INCORRECT_FORMAT: Hresult = 0x80072EFBu.toInt()

public val WININET_E_INCORRECT_HANDLE_STATE: Hresult = 0x80072EF3u.toInt()

public val WININET_E_INCORRECT_HANDLE_TYPE: Hresult = 0x80072EF2u.toInt()

public val WININET_E_INCORRECT_PASSWORD: Hresult = 0x80072EEEu.toInt()

public val WININET_E_INCORRECT_USER_NAME: Hresult = 0x80072EEDu.toInt()

public val WININET_E_INTERNAL_ERROR: Hresult = 0x80072EE4u.toInt()

public val WININET_E_INVALID_CA: Hresult = 0x80072F0Du.toInt()

public val WININET_E_INVALID_HEADER: Hresult = 0x80072F79u.toInt()

public val WININET_E_INVALID_OPERATION: Hresult = 0x80072EF0u.toInt()

public val WININET_E_INVALID_OPTION: Hresult = 0x80072EE9u.toInt()

public val WININET_E_INVALID_PROXY_REQUEST: Hresult = 0x80072F01u.toInt()

public val WININET_E_INVALID_QUERY_REQUEST: Hresult = 0x80072F7Au.toInt()

public val WININET_E_INVALID_SERVER_RESPONSE: Hresult = 0x80072F78u.toInt()

public val WININET_E_INVALID_URL: Hresult = 0x80072EE5u.toInt()

public val WININET_E_ITEM_NOT_FOUND: Hresult = 0x80072EFCu.toInt()

public val WININET_E_LOGIN_FAILURE: Hresult = 0x80072EEFu.toInt()

public val WININET_E_LOGIN_FAILURE_DISPLAY_ENTITY_BODY: Hresult = 0x80072F8Eu.toInt()

public val WININET_E_MIXED_SECURITY: Hresult = 0x80072F09u.toInt()

public val WININET_E_NAME_NOT_RESOLVED: Hresult = 0x80072EE7u.toInt()

public val WININET_E_NEED_UI: Hresult = 0x80072F02u.toInt()

public val WININET_E_NOT_INITIALIZED: Hresult = 0x80072F8Cu.toInt()

public val WININET_E_NOT_PROXY_REQUEST: Hresult = 0x80072EF4u.toInt()

public val WININET_E_NOT_REDIRECTED: Hresult = 0x80072F80u.toInt()

public val WININET_E_NO_CALLBACK: Hresult = 0x80072EF9u.toInt()

public val WININET_E_NO_CONTEXT: Hresult = 0x80072EF8u.toInt()

public val WININET_E_NO_DIRECT_ACCESS: Hresult = 0x80072EF7u.toInt()

public val WININET_E_NO_NEW_CONTAINERS: Hresult = 0x80072F13u.toInt()

public val WININET_E_OPERATION_CANCELLED: Hresult = 0x80072EF1u.toInt()

public val WININET_E_OPTION_NOT_SETTABLE: Hresult = 0x80072EEBu.toInt()

public val WININET_E_OUT_OF_HANDLES: Hresult = 0x80072EE1u.toInt()

public val WININET_E_POST_IS_NON_SECURE: Hresult = 0x80072F0Bu.toInt()

public val WININET_E_PROTOCOL_NOT_FOUND: Hresult = 0x80072EE8u.toInt()

public val WININET_E_PROXY_SERVER_UNREACHABLE: Hresult = 0x80072F85u.toInt()

public val WININET_E_REDIRECT_FAILED: Hresult = 0x80072F7Cu.toInt()

public val WININET_E_REDIRECT_NEEDS_CONFIRMATION: Hresult = 0x80072F88u.toInt()

public val WININET_E_REDIRECT_SCHEME_CHANGE: Hresult = 0x80072F10u.toInt()

public val WININET_E_REGISTRY_VALUE_NOT_FOUND: Hresult = 0x80072EF5u.toInt()

public val WININET_E_REQUEST_PENDING: Hresult = 0x80072EFAu.toInt()

public val WININET_E_RETRY_DIALOG: Hresult = 0x80072F12u.toInt()

public val WININET_E_SECURITY_CHANNEL_ERROR: Hresult = 0x80072F7Du.toInt()

public val WININET_E_SEC_CERT_CN_INVALID: Hresult = 0x80072F06u.toInt()

public val WININET_E_SEC_CERT_DATE_INVALID: Hresult = 0x80072F05u.toInt()

public val WININET_E_SEC_CERT_ERRORS: Hresult = 0x80072F17u.toInt()

public val WININET_E_SEC_CERT_REVOKED: Hresult = 0x80072F8Au.toInt()

public val WININET_E_SEC_CERT_REV_FAILED: Hresult = 0x80072F19u.toInt()

public val WININET_E_SEC_INVALID_CERT: Hresult = 0x80072F89u.toInt()

public val WININET_E_SERVER_UNREACHABLE: Hresult = 0x80072F84u.toInt()

public val WININET_E_SHUTDOWN: Hresult = 0x80072EECu.toInt()

public val WININET_E_TCPIP_NOT_INSTALLED: Hresult = 0x80072F7Fu.toInt()

public val WININET_E_TIMEOUT: Hresult = 0x80072EE2u.toInt()

public val WININET_E_UNABLE_TO_CACHE_FILE: Hresult = 0x80072F7Eu.toInt()

public val WININET_E_UNABLE_TO_DOWNLOAD_SCRIPT: Hresult = 0x80072F87u.toInt()

public val WININET_E_UNRECOGNIZED_SCHEME: Hresult = 0x80072EE6u.toInt()

public val WINML_ERR_INVALID_BINDING: Hresult = 0x88900002u.toInt()

public val WINML_ERR_INVALID_DEVICE: Hresult = 0x88900001u.toInt()

public val WINML_ERR_SIZE_MISMATCH: Hresult = 0x88900004u.toInt()

public val WINML_ERR_VALUE_NOTFOUND: Hresult = 0x88900003u.toInt()

public val WINVER: UInt = 1280u

public val WINVER_MAXVER: UInt = 2560u

public val WPN_E_ACCESS_DENIED: Hresult = 0x803E0117u.toInt()

public val WPN_E_ALL_URL_NOT_COMPLETED: Hresult = 0x803E0203u.toInt()

public val WPN_E_CALLBACK_ALREADY_REGISTERED: Hresult = 0x803E0206u.toInt()

public val WPN_E_CHANNEL_CLOSED: Hresult = 0x803E0100u.toInt()

public val WPN_E_CHANNEL_REQUEST_NOT_COMPLETE: Hresult = 0x803E0101u.toInt()

public val WPN_E_CLOUD_AUTH_UNAVAILABLE: Hresult = 0x803E011Au.toInt()

public val WPN_E_CLOUD_DISABLED: Hresult = 0x803E0109u.toInt()

public val WPN_E_CLOUD_DISABLED_FOR_APP: Hresult = 0x803E020Bu.toInt()

public val WPN_E_CLOUD_INCAPABLE: Hresult = 0x803E0110u.toInt()

public val WPN_E_CLOUD_SERVICE_UNAVAILABLE: Hresult = 0x803E011Bu.toInt()

public val WPN_E_DEV_ID_SIZE: Hresult = 0x803E0120u.toInt()

public val WPN_E_DUPLICATE_CHANNEL: Hresult = 0x803E0104u.toInt()

public val WPN_E_DUPLICATE_REGISTRATION: Hresult = 0x803E0118u.toInt()

public val WPN_E_FAILED_LOCK_SCREEN_UPDATE_INTIALIZATION: Hresult = 0x803E011Cu.toInt()

public val WPN_E_GROUP_ALPHANUMERIC: Hresult = 0x803E020Au.toInt()

public val WPN_E_GROUP_SIZE: Hresult = 0x803E0209u.toInt()

public val WPN_E_IMAGE_NOT_FOUND_IN_CACHE: Hresult = 0x803E0202u.toInt()

public val WPN_E_INTERNET_INCAPABLE: Hresult = 0x803E0113u.toInt()

public val WPN_E_INVALID_APP: Hresult = 0x803E0102u.toInt()

public val WPN_E_INVALID_CLOUD_IMAGE: Hresult = 0x803E0204u.toInt()

public val WPN_E_INVALID_HTTP_STATUS_CODE: Hresult = 0x803E012Bu.toInt()

public val WPN_E_NOTIFICATION_DISABLED: Hresult = 0x803E0111u.toInt()

public val WPN_E_NOTIFICATION_HIDDEN: Hresult = 0x803E0107u.toInt()

public val WPN_E_NOTIFICATION_ID_MATCHED: Hresult = 0x803E0205u.toInt()

public val WPN_E_NOTIFICATION_INCAPABLE: Hresult = 0x803E0112u.toInt()

public val WPN_E_NOTIFICATION_NOT_POSTED: Hresult = 0x803E0108u.toInt()

public val WPN_E_NOTIFICATION_POSTED: Hresult = 0x803E0106u.toInt()

public val WPN_E_NOTIFICATION_SIZE: Hresult = 0x803E0115u.toInt()

public val WPN_E_NOTIFICATION_TYPE_DISABLED: Hresult = 0x803E0114u.toInt()

public val WPN_E_OUTSTANDING_CHANNEL_REQUEST: Hresult = 0x803E0103u.toInt()

public val WPN_E_OUT_OF_SESSION: Hresult = 0x803E0200u.toInt()

public val WPN_E_PLATFORM_UNAVAILABLE: Hresult = 0x803E0105u.toInt()

public val WPN_E_POWER_SAVE: Hresult = 0x803E0201u.toInt()

public val WPN_E_PUSH_NOTIFICATION_INCAPABLE: Hresult = 0x803E0119u.toInt()

public val WPN_E_STORAGE_LOCKED: Hresult = 0x803E0208u.toInt()

public val WPN_E_TAG_ALPHANUMERIC: Hresult = 0x803E012Au.toInt()

public val WPN_E_TAG_SIZE: Hresult = 0x803E0116u.toInt()

public val WPN_E_TOAST_NOTIFICATION_DROPPED: Hresult = 0x803E0207u.toInt()

public val WS_E_ADDRESS_IN_USE: Hresult = 0x803D000Bu.toInt()

public val WS_E_ADDRESS_NOT_AVAILABLE: Hresult = 0x803D000Cu.toInt()

public val WS_E_ENDPOINT_ACCESS_DENIED: Hresult = 0x803D0005u.toInt()

public val WS_E_ENDPOINT_ACTION_NOT_SUPPORTED: Hresult = 0x803D0011u.toInt()

public val WS_E_ENDPOINT_DISCONNECTED: Hresult = 0x803D0014u.toInt()

public val WS_E_ENDPOINT_FAILURE: Hresult = 0x803D000Fu.toInt()

public val WS_E_ENDPOINT_FAULT_RECEIVED: Hresult = 0x803D0013u.toInt()

public val WS_E_ENDPOINT_NOT_AVAILABLE: Hresult = 0x803D000Eu.toInt()

public val WS_E_ENDPOINT_NOT_FOUND: Hresult = 0x803D000Du.toInt()

public val WS_E_ENDPOINT_TOO_BUSY: Hresult = 0x803D0012u.toInt()

public val WS_E_ENDPOINT_UNREACHABLE: Hresult = 0x803D0010u.toInt()

public val WS_E_INVALID_ENDPOINT_URL: Hresult = 0x803D0020u.toInt()

public val WS_E_INVALID_FORMAT: Hresult = 0x803D0000u.toInt()

public val WS_E_INVALID_OPERATION: Hresult = 0x803D0003u.toInt()

public val WS_E_NOT_SUPPORTED: Hresult = 0x803D0017u.toInt()

public val WS_E_NO_TRANSLATION_AVAILABLE: Hresult = 0x803D0009u.toInt()

public val WS_E_NUMERIC_OVERFLOW: Hresult = 0x803D0002u.toInt()

public val WS_E_OBJECT_FAULTED: Hresult = 0x803D0001u.toInt()

public val WS_E_OPERATION_ABANDONED: Hresult = 0x803D0007u.toInt()

public val WS_E_OPERATION_ABORTED: Hresult = 0x803D0004u.toInt()

public val WS_E_OPERATION_TIMED_OUT: Hresult = 0x803D0006u.toInt()

public val WS_E_OTHER: Hresult = 0x803D0021u.toInt()

public val WS_E_PROXY_ACCESS_DENIED: Hresult = 0x803D0016u.toInt()

public val WS_E_PROXY_FAILURE: Hresult = 0x803D0015u.toInt()

public val WS_E_PROXY_REQUIRES_BASIC_AUTH: Hresult = 0x803D0018u.toInt()

public val WS_E_PROXY_REQUIRES_DIGEST_AUTH: Hresult = 0x803D0019u.toInt()

public val WS_E_PROXY_REQUIRES_NEGOTIATE_AUTH: Hresult = 0x803D001Bu.toInt()

public val WS_E_PROXY_REQUIRES_NTLM_AUTH: Hresult = 0x803D001Au.toInt()

public val WS_E_QUOTA_EXCEEDED: Hresult = 0x803D0008u.toInt()

public val WS_E_SECURITY_SYSTEM_FAILURE: Hresult = 0x803D0023u.toInt()

public val WS_E_SECURITY_TOKEN_EXPIRED: Hresult = 0x803D0022u.toInt()

public val WS_E_SECURITY_VERIFICATION_FAILURE: Hresult = 0x803D000Au.toInt()

public val WS_E_SERVER_REQUIRES_BASIC_AUTH: Hresult = 0x803D001Cu.toInt()

public val WS_E_SERVER_REQUIRES_DIGEST_AUTH: Hresult = 0x803D001Du.toInt()

public val WS_E_SERVER_REQUIRES_NEGOTIATE_AUTH: Hresult = 0x803D001Fu.toInt()

public val WS_E_SERVER_REQUIRES_NTLM_AUTH: Hresult = 0x803D001Eu.toInt()

public val WS_S_ASYNC: Hresult = 0x3D0000u.toInt()

public val WS_S_END: Hresult = 0x3D0001u.toInt()

public val XACT_E_ABORTED: Hresult = 0x8004D019u.toInt()

public val XACT_E_ABORTING: Hresult = 0x8004D029u.toInt()

public val XACT_E_ALREADYINPROGRESS: Hresult = 0x8004D018u.toInt()

public val XACT_E_ALREADYOTHERSINGLEPHASE: Hresult = 0x8004D000u.toInt()

public val XACT_E_CANTRETAIN: Hresult = 0x8004D001u.toInt()

public val XACT_E_CLERKEXISTS: Hresult = 0x8004D081u.toInt()

public val XACT_E_CLERKNOTFOUND: Hresult = 0x8004D080u.toInt()

public val XACT_E_COMMITFAILED: Hresult = 0x8004D002u.toInt()

public val XACT_E_COMMITPREVENTED: Hresult = 0x8004D003u.toInt()

public val XACT_E_CONNECTION_DENIED: Hresult = 0x8004D01Du.toInt()

public val XACT_E_CONNECTION_DOWN: Hresult = 0x8004D01Cu.toInt()

public val XACT_E_DEST_TMNOTAVAILABLE: Hresult = 0x8004D022u.toInt()

public val XACT_E_FIRST: UInt = 2147799040u

public val XACT_E_HEURISTICABORT: Hresult = 0x8004D004u.toInt()

public val XACT_E_HEURISTICCOMMIT: Hresult = 0x8004D005u.toInt()

public val XACT_E_HEURISTICDAMAGE: Hresult = 0x8004D006u.toInt()

public val XACT_E_HEURISTICDANGER: Hresult = 0x8004D007u.toInt()

public val XACT_E_INDOUBT: Hresult = 0x8004D016u.toInt()

public val XACT_E_INVALIDCOOKIE: Hresult = 0x8004D015u.toInt()

public val XACT_E_INVALIDLSN: Hresult = 0x8004D084u.toInt()

public val XACT_E_ISOLATIONLEVEL: Hresult = 0x8004D008u.toInt()

public val XACT_E_LAST: UInt = 2147799083u

public val XACT_E_LOGFULL: Hresult = 0x8004D01Au.toInt()

public val XACT_E_LU_TX_DISABLED: Hresult = 0x8004D02Cu.toInt()

public val XACT_E_NETWORK_TX_DISABLED: Hresult = 0x8004D024u.toInt()

public val XACT_E_NOASYNC: Hresult = 0x8004D009u.toInt()

public val XACT_E_NOENLIST: Hresult = 0x8004D00Au.toInt()

public val XACT_E_NOIMPORTOBJECT: Hresult = 0x8004D014u.toInt()

public val XACT_E_NOISORETAIN: Hresult = 0x8004D00Bu.toInt()

public val XACT_E_NORESOURCE: Hresult = 0x8004D00Cu.toInt()

public val XACT_E_NOTCURRENT: Hresult = 0x8004D00Du.toInt()

public val XACT_E_NOTIMEOUT: Hresult = 0x8004D017u.toInt()

public val XACT_E_NOTRANSACTION: Hresult = 0x8004D00Eu.toInt()

public val XACT_E_NOTSUPPORTED: Hresult = 0x8004D00Fu.toInt()

public val XACT_E_PARTNER_NETWORK_TX_DISABLED: Hresult = 0x8004D025u.toInt()

public val XACT_E_PULL_COMM_FAILURE: Hresult = 0x8004D02Bu.toInt()

public val XACT_E_PUSH_COMM_FAILURE: Hresult = 0x8004D02Au.toInt()

public val XACT_E_RECOVERYINPROGRESS: Hresult = 0x8004D082u.toInt()

public val XACT_E_REENLISTTIMEOUT: Hresult = 0x8004D01Eu.toInt()

public val XACT_E_REPLAYREQUEST: Hresult = 0x8004D085u.toInt()

public val XACT_E_TIP_CONNECT_FAILED: Hresult = 0x8004D01Fu.toInt()

public val XACT_E_TIP_DISABLED: Hresult = 0x8004D023u.toInt()

public val XACT_E_TIP_PROTOCOL_ERROR: Hresult = 0x8004D020u.toInt()

public val XACT_E_TIP_PULL_FAILED: Hresult = 0x8004D021u.toInt()

public val XACT_E_TMNOTAVAILABLE: Hresult = 0x8004D01Bu.toInt()

public val XACT_E_TRANSACTIONCLOSED: Hresult = 0x8004D083u.toInt()

public val XACT_E_UNABLE_TO_LOAD_DTC_PROXY: Hresult = 0x8004D028u.toInt()

public val XACT_E_UNABLE_TO_READ_DTC_CONFIG: Hresult = 0x8004D027u.toInt()

public val XACT_E_UNKNOWNRMGRID: Hresult = 0x8004D010u.toInt()

public val XACT_E_WRONGSTATE: Hresult = 0x8004D011u.toInt()

public val XACT_E_WRONGUOW: Hresult = 0x8004D012u.toInt()

public val XACT_E_XA_TX_DISABLED: Hresult = 0x8004D026u.toInt()

public val XACT_E_XTIONEXISTS: Hresult = 0x8004D013u.toInt()

public val XACT_S_ABORTING: Hresult = 0x4D008u.toInt()

public val XACT_S_ALLNORETAIN: Hresult = 0x4D007u.toInt()

public val XACT_S_ASYNC: Hresult = 0x4D000u.toInt()

public val XACT_S_DEFECT: Hresult = 0x4D001u.toInt()

public val XACT_S_FIRST: UInt = 315392u

public val XACT_S_LAST: UInt = 315408u

public val XACT_S_LASTRESOURCEMANAGER: Hresult = 0x4D010u.toInt()

public val XACT_S_LOCALLY_OK: Hresult = 0x4D00Au.toInt()

public val XACT_S_MADECHANGESCONTENT: Hresult = 0x4D005u.toInt()

public val XACT_S_MADECHANGESINFORM: Hresult = 0x4D006u.toInt()

public val XACT_S_OKINFORM: Hresult = 0x4D004u.toInt()

public val XACT_S_READONLY: Hresult = 0x4D002u.toInt()

public val XACT_S_SINGLEPHASE: Hresult = 0x4D009u.toInt()

public val XACT_S_SOMENORETAIN: Hresult = 0x4D003u.toInt()

public val XENROLL_E_CANNOT_ADD_ROOT_CERT: Hresult = 0x80095001u.toInt()

public val XENROLL_E_KEYSPEC_SMIME_MISMATCH: Hresult = 0x80095005u.toInt()

public val XENROLL_E_KEY_NOT_EXPORTABLE: Hresult = 0x80095000u.toInt()

public val XENROLL_E_RESPONSE_KA_HASH_MISMATCH: Hresult = 0x80095004u.toInt()

public val XENROLL_E_RESPONSE_KA_HASH_NOT_FOUND: Hresult = 0x80095002u.toInt()

public val XENROLL_E_RESPONSE_UNEXPECTED_KA_HASH: Hresult = 0x80095003u.toInt()

public val WIN32_IE_MAXVER: UInt = 2560u

public val WIN32_MAXVER: UInt = 2560u

public val WIN32_WINDOWS_MAXVER: UInt = 2560u

public val WIN32_WINNT_MAXVER: UInt = 2560u
