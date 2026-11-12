package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public val E_APPLICATION_TRIAL_LICENSE_EXPIRED: Hresult = 0x8027025Du.toInt()

public val E_APPLICATION_VIEW_EXITING: Hresult = 0x8000001Bu.toInt()

public val E_ASYNC_OPERATION_NOT_STARTED: Hresult = 0x80000019u.toInt()

public val E_AUDIO_ENGINE_NODE_NOT_FOUND: Hresult = 0x80660001u.toInt()

public val E_BLUETOOTH_ATT_ATTRIBUTE_NOT_FOUND: Hresult = 0x8065000Au.toInt()

public val E_BLUETOOTH_ATT_ATTRIBUTE_NOT_LONG: Hresult = 0x8065000Bu.toInt()

public val E_BLUETOOTH_ATT_INSUFFICIENT_AUTHENTICATION: Hresult = 0x80650005u.toInt()

public val E_BLUETOOTH_ATT_INSUFFICIENT_AUTHORIZATION: Hresult = 0x80650008u.toInt()

public val E_BLUETOOTH_ATT_INSUFFICIENT_ENCRYPTION: Hresult = 0x8065000Fu.toInt()

public val E_BLUETOOTH_ATT_INSUFFICIENT_ENCRYPTION_KEY_SIZE: Hresult = 0x8065000Cu.toInt()

public val E_BLUETOOTH_ATT_INSUFFICIENT_RESOURCES: Hresult = 0x80650011u.toInt()

public val E_BLUETOOTH_ATT_INVALID_ATTRIBUTE_VALUE_LENGTH: Hresult = 0x8065000Du.toInt()

public val E_BLUETOOTH_ATT_INVALID_HANDLE: Hresult = 0x80650001u.toInt()

public val E_BLUETOOTH_ATT_INVALID_OFFSET: Hresult = 0x80650007u.toInt()

public val E_BLUETOOTH_ATT_INVALID_PDU: Hresult = 0x80650004u.toInt()

public val E_BLUETOOTH_ATT_PREPARE_QUEUE_FULL: Hresult = 0x80650009u.toInt()

public val E_BLUETOOTH_ATT_READ_NOT_PERMITTED: Hresult = 0x80650002u.toInt()

public val E_BLUETOOTH_ATT_REQUEST_NOT_SUPPORTED: Hresult = 0x80650006u.toInt()

public val E_BLUETOOTH_ATT_UNKNOWN_ERROR: Hresult = 0x80651000u.toInt()

public val E_BLUETOOTH_ATT_UNLIKELY: Hresult = 0x8065000Eu.toInt()

public val E_BLUETOOTH_ATT_UNSUPPORTED_GROUP_TYPE: Hresult = 0x80650010u.toInt()

public val E_BLUETOOTH_ATT_WRITE_NOT_PERMITTED: Hresult = 0x80650003u.toInt()

public val E_BOUNDS: Hresult = 0x8000000Bu.toInt()

public val E_CHANGED_STATE: Hresult = 0x8000000Cu.toInt()

public val E_ELEVATED_ACTIVATION_NOT_SUPPORTED: Hresult = 0x80270251u.toInt()

public val E_FAIL: Hresult = 0x80004005u.toInt()

public val E_FULL_ADMIN_NOT_SUPPORTED: Hresult = 0x80270253u.toInt()

public val E_HANDLE: Hresult = 0x80070006u.toInt()

public val E_HDAUDIO_CONNECTION_LIST_NOT_SUPPORTED: Hresult = 0x80660003u.toInt()

public val E_HDAUDIO_EMPTY_CONNECTION_LIST: Hresult = 0x80660002u.toInt()

public val E_HDAUDIO_NO_LOGICAL_DEVICES_CREATED: Hresult = 0x80660004u.toInt()

public val E_HDAUDIO_NULL_LINKED_LIST_ENTRY: Hresult = 0x80660005u.toInt()

public val E_ILLEGAL_DELEGATE_ASSIGNMENT: Hresult = 0x80000018u.toInt()

public val E_ILLEGAL_METHOD_CALL: Hresult = 0x8000000Eu.toInt()

public val E_ILLEGAL_STATE_CHANGE: Hresult = 0x8000000Du.toInt()

public val E_INVALIDARG: Hresult = 0x80070057u.toInt()

public val E_INVALID_PROTOCOL_FORMAT: Hresult = 0x83760002u.toInt()

public val E_INVALID_PROTOCOL_OPERATION: Hresult = 0x83760001u.toInt()

public val E_MBN_BAD_SIM: Hresult = 0x80548202u.toInt()

public val E_MBN_CONTEXT_NOT_ACTIVATED: Hresult = 0x80548201u.toInt()

public val E_MBN_DATA_CLASS_NOT_AVAILABLE: Hresult = 0x80548203u.toInt()

public val E_MBN_DEFAULT_PROFILE_EXIST: Hresult = 0x80548219u.toInt()

public val E_MBN_FAILURE: Hresult = 0x80548212u.toInt()

public val E_MBN_INVALID_ACCESS_STRING: Hresult = 0x80548204u.toInt()

public val E_MBN_INVALID_CACHE: Hresult = 0x8054820Cu.toInt()

public val E_MBN_INVALID_PROFILE: Hresult = 0x80548218u.toInt()

public val E_MBN_MAX_ACTIVATED_CONTEXTS: Hresult = 0x80548205u.toInt()

public val E_MBN_NOT_REGISTERED: Hresult = 0x8054820Du.toInt()

public val E_MBN_PACKET_SVC_DETACHED: Hresult = 0x80548206u.toInt()

public val E_MBN_PIN_DISABLED: Hresult = 0x80548211u.toInt()

public val E_MBN_PIN_NOT_SUPPORTED: Hresult = 0x8054820Fu.toInt()

public val E_MBN_PIN_REQUIRED: Hresult = 0x80548210u.toInt()

public val E_MBN_PROVIDERS_NOT_FOUND: Hresult = 0x8054820Eu.toInt()

public val E_MBN_PROVIDER_NOT_VISIBLE: Hresult = 0x80548207u.toInt()

public val E_MBN_RADIO_POWER_OFF: Hresult = 0x80548208u.toInt()

public val E_MBN_SERVICE_NOT_ACTIVATED: Hresult = 0x80548209u.toInt()

public val E_MBN_SIM_NOT_INSERTED: Hresult = 0x8054820Au.toInt()

public val E_MBN_SMS_ENCODING_NOT_SUPPORTED: Hresult = 0x80548220u.toInt()

public val E_MBN_SMS_FILTER_NOT_SUPPORTED: Hresult = 0x80548221u.toInt()

public val E_MBN_SMS_FORMAT_NOT_SUPPORTED: Hresult = 0x80548227u.toInt()

public val E_MBN_SMS_INVALID_MEMORY_INDEX: Hresult = 0x80548222u.toInt()

public val E_MBN_SMS_LANG_NOT_SUPPORTED: Hresult = 0x80548223u.toInt()

public val E_MBN_SMS_MEMORY_FAILURE: Hresult = 0x80548224u.toInt()

public val E_MBN_SMS_MEMORY_FULL: Hresult = 0x80548229u.toInt()

public val E_MBN_SMS_NETWORK_TIMEOUT: Hresult = 0x80548225u.toInt()

public val E_MBN_SMS_OPERATION_NOT_ALLOWED: Hresult = 0x80548228u.toInt()

public val E_MBN_SMS_UNKNOWN_SMSC_ADDRESS: Hresult = 0x80548226u.toInt()

public val E_MBN_VOICE_CALL_IN_PROGRESS: Hresult = 0x8054820Bu.toInt()

public val E_MONITOR_RESOLUTION_TOO_LOW: Hresult = 0x80270250u.toInt()

public val E_MULTIPLE_EXTENSIONS_FOR_APPLICATION: Hresult = 0x80270255u.toInt()

public val E_MULTIPLE_PACKAGES_FOR_FAMILY: Hresult = 0x80270256u.toInt()

public val E_NOINTERFACE: Hresult = 0x80004002u.toInt()

public val E_NOTIMPL: Hresult = 0x80004001u.toInt()

public val E_OUTOFMEMORY: Hresult = 0x8007000Eu.toInt()

public val E_POINTER: Hresult = 0x80004003u.toInt()

public val E_PROTOCOL_EXTENSIONS_NOT_SUPPORTED: Hresult = 0x83760003u.toInt()

public val E_PROTOCOL_VERSION_NOT_SUPPORTED: Hresult = 0x83760005u.toInt()

public val E_SKYDRIVE_FILE_NOT_UPLOADED: Hresult = 0x80270263u.toInt()

public val E_SKYDRIVE_ROOT_TARGET_CANNOT_INDEX: Hresult = 0x80270262u.toInt()

public val E_SKYDRIVE_ROOT_TARGET_FILE_SYSTEM_NOT_SUPPORTED: Hresult = 0x80270260u.toInt()

public val E_SKYDRIVE_ROOT_TARGET_OVERLAP: Hresult = 0x80270261u.toInt()

public val E_SKYDRIVE_ROOT_TARGET_VOLUME_ROOT_NOT_SUPPORTED: Hresult = 0x80270265u.toInt()

public val E_SKYDRIVE_UPDATE_AVAILABILITY_FAIL: Hresult = 0x80270264u.toInt()

public val E_STRING_NOT_NULL_TERMINATED: Hresult = 0x80000017u.toInt()

public val E_SUBPROTOCOL_NOT_SUPPORTED: Hresult = 0x83760004u.toInt()

public val E_SYNCENGINE_CLIENT_UPDATE_NEEDED: Hresult = 0x8802D006u.toInt()

public val E_SYNCENGINE_FILE_IDENTIFIER_UNKNOWN: Hresult = 0x8802C002u.toInt()

public val E_SYNCENGINE_FILE_SIZE_EXCEEDS_REMAINING_QUOTA: Hresult = 0x8802B002u.toInt()

public val E_SYNCENGINE_FILE_SIZE_OVER_LIMIT: Hresult = 0x8802B001u.toInt()

public val E_SYNCENGINE_FILE_SYNC_PARTNER_ERROR: Hresult = 0x8802B005u.toInt()

public val E_SYNCENGINE_FOLDER_INACCESSIBLE: Hresult = 0x8802D001u.toInt()

public val E_SYNCENGINE_FOLDER_IN_REDIRECTION: Hresult = 0x8802D00Bu.toInt()

public val E_SYNCENGINE_FOLDER_ITEM_COUNT_LIMIT_EXCEEDED: Hresult = 0x8802B004u.toInt()

public val E_SYNCENGINE_PATH_LENGTH_LIMIT_EXCEEDED: Hresult = 0x8802D004u.toInt()

public val E_SYNCENGINE_PROXY_AUTHENTICATION_REQUIRED: Hresult = 0x8802D007u.toInt()

public val E_SYNCENGINE_REMOTE_PATH_LENGTH_LIMIT_EXCEEDED: Hresult = 0x8802D005u.toInt()

public val E_SYNCENGINE_REQUEST_BLOCKED_BY_SERVICE: Hresult = 0x8802C006u.toInt()

public val E_SYNCENGINE_REQUEST_BLOCKED_DUE_TO_CLIENT_ERROR: Hresult = 0x8802C007u.toInt()

public val E_SYNCENGINE_SERVICE_AUTHENTICATION_FAILED: Hresult = 0x8802C003u.toInt()

public val E_SYNCENGINE_SERVICE_RETURNED_UNEXPECTED_SIZE: Hresult = 0x8802C005u.toInt()

public val E_SYNCENGINE_STORAGE_SERVICE_BLOCKED: Hresult = 0x8802D00Au.toInt()

public val E_SYNCENGINE_STORAGE_SERVICE_PROVISIONING_FAILED: Hresult = 0x8802D008u.toInt()

public val E_SYNCENGINE_SYNC_PAUSED_BY_SERVICE: Hresult = 0x8802B006u.toInt()

public val E_SYNCENGINE_UNKNOWN_SERVICE_ERROR: Hresult = 0x8802C004u.toInt()

public val E_SYNCENGINE_UNSUPPORTED_FILE_NAME: Hresult = 0x8802B003u.toInt()

public val E_SYNCENGINE_UNSUPPORTED_FOLDER_NAME: Hresult = 0x8802D002u.toInt()

public val E_SYNCENGINE_UNSUPPORTED_MARKET: Hresult = 0x8802D003u.toInt()

public val E_SYNCENGINE_UNSUPPORTED_REPARSE_POINT: Hresult = 0x8802D009u.toInt()

public val E_UAC_DISABLED: Hresult = 0x80270252u.toInt()

public val E_UNEXPECTED: Hresult = 0x8000FFFFu.toInt()

public val FACILITY_ACPI_ERROR_CODE: NtstatusFacilityCode = 20u

public val FACILITY_APP_EXEC: NtstatusFacilityCode = 236u

public val FACILITY_AUDIO_KERNEL: NtstatusFacilityCode = 68u

public val FACILITY_BCD_ERROR_CODE: NtstatusFacilityCode = 57u

public val FACILITY_BTH_ATT: NtstatusFacilityCode = 66u

public val FACILITY_CLUSTER_ERROR_CODE: NtstatusFacilityCode = 19u

public val FACILITY_CODCLASS_ERROR_CODE: NtstatusFacilityCode = 6u

public val FACILITY_COMMONLOG: NtstatusFacilityCode = 26u

public val FACILITY_DEBUGGER: NtstatusFacilityCode = 1u

public val FACILITY_DRIVER_FRAMEWORK: NtstatusFacilityCode = 32u

public val FACILITY_FILTER_MANAGER: NtstatusFacilityCode = 28u

public val FACILITY_FIREWIRE_ERROR_CODE: NtstatusFacilityCode = 18u

public val FACILITY_FVE_ERROR_CODE: NtstatusFacilityCode = 33u

public val FACILITY_FWP_ERROR_CODE: NtstatusFacilityCode = 34u

public val FACILITY_GRAPHICS_KERNEL: NtstatusFacilityCode = 30u

public val FACILITY_HID_ERROR_CODE: NtstatusFacilityCode = 17u

public val FACILITY_HYPERVISOR: NtstatusFacilityCode = 53u

public val FACILITY_INTERIX: NtstatusFacilityCode = 153u

public val FACILITY_IO_ERROR_CODE: NtstatusFacilityCode = 4u

public val FACILITY_IPSEC: NtstatusFacilityCode = 54u

public val FACILITY_LICENSING: NtstatusFacilityCode = 234u

public val FACILITY_MAXIMUM_VALUE: NtstatusFacilityCode = 237u

public val FACILITY_MCA_ERROR_CODE: NtstatusFacilityCode = 5u

public val FACILITY_MONITOR: NtstatusFacilityCode = 29u

public val FACILITY_NDIS_ERROR_CODE: NtstatusFacilityCode = 35u

public val FACILITY_NTCERT: NtstatusFacilityCode = 8u

public val FACILITY_NTSSPI: NtstatusFacilityCode = 9u

public val FACILITY_NTWIN32: NtstatusFacilityCode = 7u

public val FACILITY_NT_IORING: NtstatusFacilityCode = 70u

public val FACILITY_PLATFORM_MANIFEST: NtstatusFacilityCode = 235u

public val FACILITY_QUIC_ERROR_CODE: NtstatusFacilityCode = 36u

public val FACILITY_RDBSS: NtstatusFacilityCode = 65u

public val FACILITY_RESUME_KEY_FILTER: NtstatusFacilityCode = 64u

public val FACILITY_RPC_RUNTIME: NtstatusFacilityCode = 2u

public val FACILITY_RPC_STUBS: NtstatusFacilityCode = 3u

public val FACILITY_RTPM: NtstatusFacilityCode = 42u

public val FACILITY_SDBUS: NtstatusFacilityCode = 81u

public val FACILITY_SECUREBOOT: NtstatusFacilityCode = 67u

public val FACILITY_SECURITY_CORE: NtstatusFacilityCode = 232u

public val FACILITY_SHARED_VHDX: NtstatusFacilityCode = 92u

public val FACILITY_SMB: NtstatusFacilityCode = 93u

public val FACILITY_SPACES: NtstatusFacilityCode = 231u

public val FACILITY_SXS_ERROR_CODE: NtstatusFacilityCode = 21u

public val FACILITY_SYSTEM_INTEGRITY: NtstatusFacilityCode = 233u

public val FACILITY_TERMINAL_SERVER: NtstatusFacilityCode = 10u

public val FACILITY_TPM: NtstatusFacilityCode = 41u

public val FACILITY_TRANSACTION: NtstatusFacilityCode = 25u

public val FACILITY_USB_ERROR_CODE: NtstatusFacilityCode = 16u

public val FACILITY_VIDEO: NtstatusFacilityCode = 27u

public val FACILITY_VIRTUALIZATION: NtstatusFacilityCode = 55u

public val FACILITY_VOLMGR: NtstatusFacilityCode = 56u

public val FACILITY_VOLSNAP: NtstatusFacilityCode = 80u

public val FACILITY_VSM: NtstatusFacilityCode = 69u

public val FACILITY_WIN32K_NTGDI: NtstatusFacilityCode = 63u

public val FACILITY_WIN32K_NTUSER: NtstatusFacilityCode = 62u

public val FACILITY_XVS: NtstatusFacilityCode = 94u

public val FACILTIY_MUI_ERROR_CODE: UInt = 11u

public val FALSE: Bool = 0

public val FA_E_HOMEGROUP_NOT_AVAILABLE: Hresult = 0x80270222u.toInt()

public val FA_E_MAX_PERSISTED_ITEMS_REACHED: Hresult = 0x80270220u.toInt()

public val FDAEMON_E_CHANGEUPDATEFAILED: Hresult = 0x80041684u.toInt()

public val FDAEMON_E_FATALERROR: Hresult = 0x80041682u.toInt()

public val FDAEMON_E_LOWRESOURCE: Hresult = 0x80041681u.toInt()

public val FDAEMON_E_NOWORDLIST: Hresult = 0x80041687u.toInt()

public val FDAEMON_E_PARTITIONDELETED: Hresult = 0x80041683u.toInt()

public val FDAEMON_E_TOOMANYFILTEREDBLOCKS: Hresult = 0x80041688u.toInt()

public val FDAEMON_E_WORDLISTCOMMITFAILED: Hresult = 0x80041686u.toInt()

public val FDAEMON_W_EMPTYWORDLIST: Hresult = 0x41685u.toInt()

public val FDAEMON_W_WORDLISTFULL: Hresult = 0x41680u.toInt()

public val FILTER_E_ALREADY_OPEN: Hresult = 0x80041736u.toInt()

public val FILTER_E_CONTENTINDEXCORRUPT: Hresult = 0xC0041734u.toInt()

public val FILTER_E_IN_USE: Hresult = 0x80041738u.toInt()

public val FILTER_E_NOT_OPEN: Hresult = 0x80041739u.toInt()

public val FILTER_E_NO_SUCH_PROPERTY: Hresult = 0x8004173Bu.toInt()

public val FILTER_E_OFFLINE: Hresult = 0x8004173Du.toInt()

public val FILTER_E_PARTIALLY_FILTERED: Hresult = 0x8004173Eu.toInt()

public val FILTER_E_TOO_BIG: Hresult = 0x80041730u.toInt()

public val FILTER_E_UNREACHABLE: Hresult = 0x80041737u.toInt()

public val FILTER_S_CONTENTSCAN_DELAYED: Hresult = 0x41733u.toInt()

public val FILTER_S_DISK_FULL: Hresult = 0x41735u.toInt()

public val FILTER_S_FULL_CONTENTSCAN_IMMEDIATE: Hresult = 0x41732u.toInt()

public val FILTER_S_NO_PROPSETS: Hresult = 0x4173Au.toInt()

public val FILTER_S_NO_SECURITY_DESCRIPTOR: Hresult = 0x4173Cu.toInt()

public val FILTER_S_PARTIAL_CONTENTSCAN_IMMEDIATE: Hresult = 0x41731u.toInt()

public val FRS_ERR_AUTHENTICATION: Int = 8008

public val FRS_ERR_CHILD_TO_PARENT_COMM: Int = 8011

public val FRS_ERR_INSUFFICIENT_PRIV: Int = 8007

public val FRS_ERR_INTERNAL: Int = 8005

public val FRS_ERR_INTERNAL_API: Int = 8004

public val FRS_ERR_INVALID_API_SEQUENCE: Int = 8001

public val FRS_ERR_INVALID_SERVICE_PARAMETER: Int = 8017

public val FRS_ERR_PARENT_AUTHENTICATION: Int = 8010

public val FRS_ERR_PARENT_INSUFFICIENT_PRIV: Int = 8009

public val FRS_ERR_PARENT_TO_CHILD_COMM: Int = 8012

public val FRS_ERR_SERVICE_COMM: Int = 8006

public val FRS_ERR_STARTING_SERVICE: Int = 8002

public val FRS_ERR_STOPPING_SERVICE: Int = 8003

public val FRS_ERR_SYSVOL_DEMOTE: Int = 8016

public val FRS_ERR_SYSVOL_IS_BUSY: Int = 8015

public val FRS_ERR_SYSVOL_POPULATE: Int = 8013

public val FRS_ERR_SYSVOL_POPULATE_TIMEOUT: Int = 8014

public val FVE_E_AAD_ENDPOINT_BUSY: Hresult = 0x803100E1u.toInt()

public val FVE_E_AAD_SERVER_FAIL_BACKOFF: Hresult = 0x803100EAu.toInt()

public val FVE_E_AAD_SERVER_FAIL_RETRY_AFTER: Hresult = 0x803100E9u.toInt()

public val FVE_E_ACTION_NOT_ALLOWED: Hresult = 0x80310009u.toInt()

public val FVE_E_ADBACKUP_NOT_ENABLED: Hresult = 0x803100D5u.toInt()

public val FVE_E_AD_ATTR_NOT_SET: Hresult = 0x8031000Eu.toInt()

public val FVE_E_AD_BACKUP_REQUIRED_POLICY_NOT_SET_FIXED_DRIVE: Hresult = 0x803100DBu.toInt()

public val FVE_E_AD_BACKUP_REQUIRED_POLICY_NOT_SET_OS_DRIVE: Hresult = 0x803100DAu.toInt()

public val FVE_E_AD_BACKUP_REQUIRED_POLICY_NOT_SET_REMOVABLE_DRIVE: Hresult = 0x803100DCu.toInt()

public val FVE_E_AD_GUID_NOT_FOUND: Hresult = 0x8031000Fu.toInt()

public val FVE_E_AD_INSUFFICIENT_BUFFER: Hresult = 0x8031001Au.toInt()

public val FVE_E_AD_INVALID_DATASIZE: Hresult = 0x8031000Cu.toInt()

public val FVE_E_AD_INVALID_DATATYPE: Hresult = 0x8031000Bu.toInt()

public val FVE_E_AD_NO_VALUES: Hresult = 0x8031000Du.toInt()

public val FVE_E_AD_SCHEMA_NOT_INSTALLED: Hresult = 0x8031000Au.toInt()

public val FVE_E_AUTH_INVALID_APPLICATION: Hresult = 0x80310044u.toInt()

public val FVE_E_AUTH_INVALID_CONFIG: Hresult = 0x80310045u.toInt()

public val FVE_E_AUTOUNLOCK_ENABLED: Hresult = 0x80310029u.toInt()

public val FVE_E_BAD_DATA: Hresult = 0x80310016u.toInt()

public val FVE_E_BAD_INFORMATION: Hresult = 0x80310010u.toInt()

public val FVE_E_BAD_PARTITION_SIZE: Hresult = 0x80310014u.toInt()

public val FVE_E_BCD_APPLICATIONS_PATH_INCORRECT: Hresult = 0x80310052u.toInt()

public val FVE_E_BOOTABLE_CDDVD: Hresult = 0x80310030u.toInt()

public val FVE_E_BUFFER_TOO_LARGE: Hresult = 0x803100CFu.toInt()

public val FVE_E_CANNOT_ENCRYPT_NO_KEY: Hresult = 0x8031002Eu.toInt()

public val FVE_E_CANNOT_SET_FVEK_ENCRYPTED: Hresult = 0x8031002Du.toInt()

public val FVE_E_CANT_LOCK_AUTOUNLOCK_ENABLED_VOLUME: Hresult = 0x80310097u.toInt()

public val FVE_E_CLUSTERING_NOT_SUPPORTED: Hresult = 0x8031001Eu.toInt()

public val FVE_E_CONV_READ: Hresult = 0x8031001Bu.toInt()

public val FVE_E_CONV_RECOVERY_FAILED: Hresult = 0x80310088u.toInt()

public val FVE_E_CONV_WRITE: Hresult = 0x8031001Cu.toInt()

public val FVE_E_DATASET_FULL: Hresult = 0x803100EBu.toInt()

public val FVE_E_DEBUGGER_ENABLED: Hresult = 0x8031004Fu.toInt()

public val FVE_E_DEVICELOCKOUT_COUNTER_MISMATCH: Hresult = 0x803100CEu.toInt()

public val FVE_E_DEVICE_LOCKOUT_COUNTER_UNAVAILABLE: Hresult = 0x803100CDu.toInt()

public val FVE_E_DEVICE_NOT_JOINED: Hresult = 0x803100E0u.toInt()

public val FVE_E_DE_DEVICE_LOCKEDOUT: Hresult = 0x803100CAu.toInt()

public val FVE_E_DE_FIXED_DATA_NOT_SUPPORTED: Hresult = 0x803100C5u.toInt()

public val FVE_E_DE_HARDWARE_NOT_COMPLIANT: Hresult = 0x803100C6u.toInt()

public val FVE_E_DE_OS_VOLUME_NOT_PROTECTED: Hresult = 0x803100C9u.toInt()

public val FVE_E_DE_PREVENTED_FOR_OS: Hresult = 0x803100D1u.toInt()

public val FVE_E_DE_PROTECTION_NOT_YET_ENABLED: Hresult = 0x803100CBu.toInt()

public val FVE_E_DE_PROTECTION_SUSPENDED: Hresult = 0x803100C8u.toInt()

public val FVE_E_DE_VOLUME_NOT_SUPPORTED: Hresult = 0x803100D3u.toInt()

public val FVE_E_DE_VOLUME_OPTED_OUT: Hresult = 0x803100D2u.toInt()

public val FVE_E_DE_WINRE_NOT_CONFIGURED: Hresult = 0x803100C7u.toInt()

public val FVE_E_DRY_RUN_FAILED: Hresult = 0x8031004Du.toInt()

public val FVE_E_DV_NOT_ALLOWED_BY_GP: Hresult = 0x80310071u.toInt()

public val FVE_E_DV_NOT_SUPPORTED_ON_FS: Hresult = 0x80310070u.toInt()

public val FVE_E_EDRIVE_BAND_ENUMERATION_FAILED: Hresult = 0x803100E3u.toInt()

public val FVE_E_EDRIVE_BAND_IN_USE: Hresult = 0x803100B0u.toInt()

public val FVE_E_EDRIVE_DISALLOWED_BY_GP: Hresult = 0x803100B1u.toInt()

public val FVE_E_EDRIVE_DRY_RUN_FAILED: Hresult = 0x803100BCu.toInt()

public val FVE_E_EDRIVE_DV_NOT_SUPPORTED: Hresult = 0x803100B4u.toInt()

public val FVE_E_EDRIVE_INCOMPATIBLE_FIRMWARE: Hresult = 0x803100BFu.toInt()

public val FVE_E_EDRIVE_INCOMPATIBLE_VOLUME: Hresult = 0x803100B2u.toInt()

public val FVE_E_EDRIVE_NO_FAILOVER_TO_SW: Hresult = 0x803100AFu.toInt()

public val FVE_E_EFI_ONLY: Hresult = 0x8031009Cu.toInt()

public val FVE_E_ENH_PIN_INVALID: Hresult = 0x80310099u.toInt()

public val FVE_E_EOW_NOT_SUPPORTED_IN_VERSION: Hresult = 0x803100D4u.toInt()

public val FVE_E_EXECUTE_REQUEST_SENT_TOO_SOON: Hresult = 0x803100DEu.toInt()

public val FVE_E_FAILED_AUTHENTICATION: Hresult = 0x80310027u.toInt()

public val FVE_E_FAILED_SECTOR_SIZE: Hresult = 0x80310026u.toInt()

public val FVE_E_FAILED_WRONG_FS: Hresult = 0x80310013u.toInt()

public val FVE_E_FIPS_DISABLE_PROTECTION_NOT_ALLOWED: Hresult = 0x80310046u.toInt()

public val FVE_E_FIPS_HASH_KDF_NOT_ALLOWED: Hresult = 0x80310098u.toInt()

public val FVE_E_FIPS_PREVENTS_EXTERNAL_KEY_EXPORT: Hresult = 0x80310038u.toInt()

public val FVE_E_FIPS_PREVENTS_PASSPHRASE: Hresult = 0x8031006Cu.toInt()

public val FVE_E_FIPS_PREVENTS_RECOVERY_PASSWORD: Hresult = 0x80310037u.toInt()

public val FVE_E_FIPS_RNG_CHECK_FAILED: Hresult = 0x80310036u.toInt()

public val FVE_E_FIRMWARE_TYPE_NOT_SUPPORTED: Hresult = 0x80310048u.toInt()

public val FVE_E_FOREIGN_VOLUME: Hresult = 0x80310023u.toInt()

public val FVE_E_FS_MOUNTED: Hresult = 0x8031004Bu.toInt()

public val FVE_E_FS_NOT_EXTENDED: Hresult = 0x80310047u.toInt()

public val FVE_E_FULL_ENCRYPTION_NOT_ALLOWED_ON_TP_STORAGE: Hresult = 0x803100A5u.toInt()

public val FVE_E_HIDDEN_VOLUME: Hresult = 0x80310056u.toInt()

public val FVE_E_INVALID_BITLOCKER_OID: Hresult = 0x8031006Eu.toInt()

public val FVE_E_INVALID_DATUM_TYPE: Hresult = 0x8031009Bu.toInt()

public val FVE_E_INVALID_KEY_FORMAT: Hresult = 0x80310034u.toInt()

public val FVE_E_INVALID_NBP_CERT: Hresult = 0x803100E2u.toInt()

public val FVE_E_INVALID_NKP_CERT: Hresult = 0x8031009Fu.toInt()

public val FVE_E_INVALID_PASSWORD_FORMAT: Hresult = 0x80310035u.toInt()

public val FVE_E_INVALID_PIN_CHARS: Hresult = 0x8031009Au.toInt()

public val FVE_E_INVALID_PIN_CHARS_DETAILED: Hresult = 0x803100CCu.toInt()

public val FVE_E_INVALID_PROTECTOR_TYPE: Hresult = 0x8031003Au.toInt()

public val FVE_E_INVALID_STARTUP_OPTIONS: Hresult = 0x8031005Bu.toInt()

public val FVE_E_KEYFILE_INVALID: Hresult = 0x8031003Du.toInt()

public val FVE_E_KEYFILE_NOT_FOUND: Hresult = 0x8031003Cu.toInt()

public val FVE_E_KEYFILE_NO_VMK: Hresult = 0x8031003Eu.toInt()

public val FVE_E_KEY_LENGTH_NOT_SUPPORTED_BY_EDRIVE: Hresult = 0x803100A7u.toInt()

public val FVE_E_KEY_PROTECTOR_NOT_SUPPORTED: Hresult = 0x80310069u.toInt()

public val FVE_E_KEY_REQUIRED: Hresult = 0x8031001Du.toInt()

public val FVE_E_KEY_ROTATION_NOT_ENABLED: Hresult = 0x803100DFu.toInt()

public val FVE_E_KEY_ROTATION_NOT_SUPPORTED: Hresult = 0x803100DDu.toInt()

public val FVE_E_LIVEID_ACCOUNT_BLOCKED: Hresult = 0x803100C3u.toInt()

public val FVE_E_LIVEID_ACCOUNT_SUSPENDED: Hresult = 0x803100C2u.toInt()

public val FVE_E_LOCKED_VOLUME: Hresult = 0x80310000u.toInt()

public val FVE_E_METADATA_FULL: Hresult = 0x803100ECu.toInt()

public val FVE_E_MOR_FAILED: Hresult = 0x80310055u.toInt()

public val FVE_E_MULTIPLE_NKP_CERTS: Hresult = 0x8031009Du.toInt()

public val FVE_E_NON_BITLOCKER_KU: Hresult = 0x80310093u.toInt()

public val FVE_E_NON_BITLOCKER_OID: Hresult = 0x80310085u.toInt()

public val FVE_E_NOT_ACTIVATED: Hresult = 0x80310008u.toInt()

public val FVE_E_NOT_ALLOWED_IN_SAFE_MODE: Hresult = 0x80310040u.toInt()

public val FVE_E_NOT_ALLOWED_IN_VERSION: Hresult = 0x80310053u.toInt()

public val FVE_E_NOT_ALLOWED_ON_CLUSTER: Hresult = 0x803100AEu.toInt()

public val FVE_E_NOT_ALLOWED_ON_CSV_STACK: Hresult = 0x803100ADu.toInt()

public val FVE_E_NOT_ALLOWED_TO_UPGRADE_WHILE_CONVERTING: Hresult = 0x803100B3u.toInt()

public val FVE_E_NOT_DATA_VOLUME: Hresult = 0x80310019u.toInt()

public val FVE_E_NOT_DECRYPTED: Hresult = 0x80310039u.toInt()

public val FVE_E_NOT_DE_VOLUME: Hresult = 0x803100D7u.toInt()

public val FVE_E_NOT_ENCRYPTED: Hresult = 0x80310001u.toInt()

public val FVE_E_NOT_ON_STACK: Hresult = 0x8031004Au.toInt()

public val FVE_E_NOT_OS_VOLUME: Hresult = 0x80310028u.toInt()

public val FVE_E_NOT_PROVISIONED_ON_ALL_VOLUMES: Hresult = 0x803100C4u.toInt()

public val FVE_E_NOT_SUPPORTED: Hresult = 0x80310015u.toInt()

public val FVE_E_NO_AUTOUNLOCK_MASTER_KEY: Hresult = 0x80310054u.toInt()

public val FVE_E_NO_BOOTMGR_METRIC: Hresult = 0x80310005u.toInt()

public val FVE_E_NO_BOOTSECTOR_METRIC: Hresult = 0x80310004u.toInt()

public val FVE_E_NO_EXISTING_PASSPHRASE: Hresult = 0x803100A8u.toInt()

public val FVE_E_NO_EXISTING_PIN: Hresult = 0x803100A0u.toInt()

public val FVE_E_NO_FEATURE_LICENSE: Hresult = 0x8031005Au.toInt()

public val FVE_E_NO_LICENSE: Hresult = 0x80310049u.toInt()

public val FVE_E_NO_MBR_METRIC: Hresult = 0x80310003u.toInt()

public val FVE_E_NO_PASSPHRASE_WITH_TPM: Hresult = 0x803100ABu.toInt()

public val FVE_E_NO_PREBOOT_KEYBOARD_DETECTED: Hresult = 0x803100B5u.toInt()

public val FVE_E_NO_PREBOOT_KEYBOARD_OR_WINRE_DETECTED: Hresult = 0x803100B6u.toInt()

public val FVE_E_NO_PROTECTORS_TO_TEST: Hresult = 0x8031003Bu.toInt()

public val FVE_E_NO_SUCH_CAPABILITY_ON_TARGET: Hresult = 0x803100D0u.toInt()

public val FVE_E_NO_TPM_BIOS: Hresult = 0x80310002u.toInt()

public val FVE_E_NO_TPM_WITH_PASSPHRASE: Hresult = 0x803100ACu.toInt()

public val FVE_E_OPERATION_NOT_SUPPORTED_ON_VISTA_VOLUME: Hresult = 0x80310096u.toInt()

public val FVE_E_OSV_KSR_NOT_ALLOWED: Hresult = 0x803100D9u.toInt()

public val FVE_E_OS_NOT_PROTECTED: Hresult = 0x80310020u.toInt()

public val FVE_E_OS_VOLUME_PASSPHRASE_NOT_ALLOWED: Hresult = 0x8031006Du.toInt()

public val FVE_E_OVERLAPPED_UPDATE: Hresult = 0x80310024u.toInt()

public val FVE_E_PASSPHRASE_PROTECTOR_CHANGE_BY_STD_USER_DISALLOWED: Hresult = 0x803100C1u.toInt()

public val FVE_E_PASSPHRASE_TOO_LONG: Hresult = 0x803100AAu.toInt()

public val FVE_E_PIN_INVALID: Hresult = 0x80310043u.toInt()

public val FVE_E_PIN_PROTECTOR_CHANGE_BY_STD_USER_DISALLOWED: Hresult = 0x803100A2u.toInt()

public val FVE_E_POLICY_CONFLICT_FDV_RK_OFF_AUK_ON: Hresult = 0x80310083u.toInt()

public val FVE_E_POLICY_CONFLICT_FDV_RP_OFF_ADB_ON: Hresult = 0x80310091u.toInt()

public val FVE_E_POLICY_CONFLICT_OSV_RP_OFF_ADB_ON: Hresult = 0x80310090u.toInt()

public val FVE_E_POLICY_CONFLICT_RDV_RK_OFF_AUK_ON: Hresult = 0x80310084u.toInt()

public val FVE_E_POLICY_CONFLICT_RDV_RP_OFF_ADB_ON: Hresult = 0x80310092u.toInt()

public val FVE_E_POLICY_CONFLICT_RO_AND_STARTUP_KEY_REQUIRED: Hresult = 0x80310087u.toInt()

public val FVE_E_POLICY_INVALID_ENHANCED_BCD_SETTINGS: Hresult = 0x803100BEu.toInt()

public val FVE_E_POLICY_INVALID_PASSPHRASE_LENGTH: Hresult = 0x80310080u.toInt()

public val FVE_E_POLICY_INVALID_PIN_LENGTH: Hresult = 0x80310068u.toInt()

public val FVE_E_POLICY_ON_RDV_EXCLUSION_LIST: Hresult = 0x803100E4u.toInt()

public val FVE_E_POLICY_PASSPHRASE_NOT_ALLOWED: Hresult = 0x8031006Au.toInt()

public val FVE_E_POLICY_PASSPHRASE_REQUIRED: Hresult = 0x8031006Bu.toInt()

public val FVE_E_POLICY_PASSPHRASE_REQUIRES_ASCII: Hresult = 0x803100A4u.toInt()

public val FVE_E_POLICY_PASSPHRASE_TOO_SIMPLE: Hresult = 0x80310081u.toInt()

public val FVE_E_POLICY_PASSWORD_REQUIRED: Hresult = 0x8031002Cu.toInt()

public val FVE_E_POLICY_PROHIBITS_SELFSIGNED: Hresult = 0x80310086u.toInt()

public val FVE_E_POLICY_RECOVERY_KEY_NOT_ALLOWED: Hresult = 0x8031005Eu.toInt()

public val FVE_E_POLICY_RECOVERY_KEY_REQUIRED: Hresult = 0x8031005Fu.toInt()

public val FVE_E_POLICY_RECOVERY_PASSWORD_NOT_ALLOWED: Hresult = 0x8031005Cu.toInt()

public val FVE_E_POLICY_RECOVERY_PASSWORD_REQUIRED: Hresult = 0x8031005Du.toInt()

public val FVE_E_POLICY_REQUIRES_RECOVERY_PASSWORD_ON_TOUCH_DEVICE: Hresult = 0x803100B8u.toInt()

public val FVE_E_POLICY_REQUIRES_STARTUP_PIN_ON_TOUCH_DEVICE: Hresult = 0x803100B7u.toInt()

public val FVE_E_POLICY_STARTUP_KEY_NOT_ALLOWED: Hresult = 0x80310062u.toInt()

public val FVE_E_POLICY_STARTUP_KEY_REQUIRED: Hresult = 0x80310063u.toInt()

public val FVE_E_POLICY_STARTUP_PIN_KEY_NOT_ALLOWED: Hresult = 0x80310064u.toInt()

public val FVE_E_POLICY_STARTUP_PIN_KEY_REQUIRED: Hresult = 0x80310065u.toInt()

public val FVE_E_POLICY_STARTUP_PIN_NOT_ALLOWED: Hresult = 0x80310060u.toInt()

public val FVE_E_POLICY_STARTUP_PIN_REQUIRED: Hresult = 0x80310061u.toInt()

public val FVE_E_POLICY_STARTUP_TPM_NOT_ALLOWED: Hresult = 0x80310066u.toInt()

public val FVE_E_POLICY_STARTUP_TPM_REQUIRED: Hresult = 0x80310067u.toInt()

public val FVE_E_POLICY_USER_CERTIFICATE_NOT_ALLOWED: Hresult = 0x80310072u.toInt()

public val FVE_E_POLICY_USER_CERTIFICATE_REQUIRED: Hresult = 0x80310073u.toInt()

public val FVE_E_POLICY_USER_CERT_MUST_BE_HW: Hresult = 0x80310074u.toInt()

public val FVE_E_POLICY_USER_CONFIGURE_FDV_AUTOUNLOCK_NOT_ALLOWED: Hresult = 0x80310075u.toInt()

public val FVE_E_POLICY_USER_CONFIGURE_RDV_AUTOUNLOCK_NOT_ALLOWED: Hresult = 0x80310076u.toInt()

public val FVE_E_POLICY_USER_CONFIGURE_RDV_NOT_ALLOWED: Hresult = 0x80310077u.toInt()

public val FVE_E_POLICY_USER_DISABLE_RDV_NOT_ALLOWED: Hresult = 0x80310079u.toInt()

public val FVE_E_POLICY_USER_ENABLE_RDV_NOT_ALLOWED: Hresult = 0x80310078u.toInt()

public val FVE_E_PREDICTED_TPM_PROTECTOR_NOT_SUPPORTED: Hresult = 0x803100E5u.toInt()

public val FVE_E_PRIVATEKEY_AUTH_FAILED: Hresult = 0x80310094u.toInt()

public val FVE_E_PROTECTION_CANNOT_BE_DISABLED: Hresult = 0x803100D8u.toInt()

public val FVE_E_PROTECTION_DISABLED: Hresult = 0x80310021u.toInt()

public val FVE_E_PROTECTOR_CHANGE_MAX_PASSPHRASE_CHANGE_ATTEMPTS_REACHED: Hresult = 0x803100C0u.toInt()

public val FVE_E_PROTECTOR_CHANGE_MAX_PIN_CHANGE_ATTEMPTS_REACHED: Hresult = 0x803100A3u.toInt()

public val FVE_E_PROTECTOR_CHANGE_PASSPHRASE_MISMATCH: Hresult = 0x803100A9u.toInt()

public val FVE_E_PROTECTOR_CHANGE_PIN_MISMATCH: Hresult = 0x803100A1u.toInt()

public val FVE_E_PROTECTOR_EXISTS: Hresult = 0x80310031u.toInt()

public val FVE_E_PROTECTOR_NOT_FOUND: Hresult = 0x80310033u.toInt()

public val FVE_E_PUBKEY_NOT_ALLOWED: Hresult = 0x80310058u.toInt()

public val FVE_E_RAW_ACCESS: Hresult = 0x80310050u.toInt()

public val FVE_E_RAW_BLOCKED: Hresult = 0x80310051u.toInt()

public val FVE_E_REBOOT_REQUIRED: Hresult = 0x8031004Eu.toInt()

public val FVE_E_RECOVERY_KEY_REQUIRED: Hresult = 0x80310022u.toInt()

public val FVE_E_RECOVERY_PARTITION: Hresult = 0x80310082u.toInt()

public val FVE_E_RELATIVE_PATH: Hresult = 0x80310032u.toInt()

public val FVE_E_REMOVAL_OF_DRA_FAILED: Hresult = 0x80310095u.toInt()

public val FVE_E_REMOVAL_OF_NKP_FAILED: Hresult = 0x8031009Eu.toInt()

public val FVE_E_SECUREBOOT_CONFIGURATION_INVALID: Hresult = 0x803100BBu.toInt()

public val FVE_E_SECUREBOOT_DISABLED: Hresult = 0x803100BAu.toInt()

public val FVE_E_SECURE_KEY_REQUIRED: Hresult = 0x80310007u.toInt()

public val FVE_E_SETUP_TPM_CALLBACK_NOT_SUPPORTED: Hresult = 0x803100E6u.toInt()

public val FVE_E_SHADOW_COPY_PRESENT: Hresult = 0x803100BDu.toInt()

public val FVE_E_SYSTEM_VOLUME: Hresult = 0x80310012u.toInt()

public val FVE_E_TOKEN_NOT_IMPERSONATED: Hresult = 0x8031004Cu.toInt()

public val FVE_E_TOO_SMALL: Hresult = 0x80310011u.toInt()

public val FVE_E_TPM_CONTEXT_SETUP_NOT_SUPPORTED: Hresult = 0x803100E7u.toInt()

public val FVE_E_TPM_DISABLED: Hresult = 0x8031003Fu.toInt()

public val FVE_E_TPM_INVALID_PCR: Hresult = 0x80310041u.toInt()

public val FVE_E_TPM_NOT_OWNED: Hresult = 0x80310018u.toInt()

public val FVE_E_TPM_NO_VMK: Hresult = 0x80310042u.toInt()

public val FVE_E_TPM_SRK_AUTH_NOT_ZERO: Hresult = 0x80310025u.toInt()

public val FVE_E_TRANSIENT_STATE: Hresult = 0x80310057u.toInt()

public val FVE_E_UPDATE_INVALID_CONFIG: Hresult = 0x803100E8u.toInt()

public val FVE_E_VIRTUALIZED_SPACE_TOO_BIG: Hresult = 0x80310089u.toInt()

public val FVE_E_VOLUME_BOUND_ALREADY: Hresult = 0x8031001Fu.toInt()

public val FVE_E_VOLUME_EXTEND_PREVENTS_EOW_DECRYPT: Hresult = 0x803100D6u.toInt()

public val FVE_E_VOLUME_HANDLE_OPEN: Hresult = 0x80310059u.toInt()

public val FVE_E_VOLUME_NOT_BOUND: Hresult = 0x80310017u.toInt()

public val FVE_E_VOLUME_TOO_SMALL: Hresult = 0x8031006Fu.toInt()

public val FVE_E_WIPE_CANCEL_NOT_APPLICABLE: Hresult = 0x803100B9u.toInt()

public val FVE_E_WIPE_NOT_ALLOWED_ON_TP_STORAGE: Hresult = 0x803100A6u.toInt()

public val FVE_E_WRONG_BOOTMGR: Hresult = 0x80310006u.toInt()

public val FVE_E_WRONG_BOOTSECTOR: Hresult = 0x8031002Au.toInt()

public val FVE_E_WRONG_SYSTEM_FS: Hresult = 0x8031002Bu.toInt()

public val FWP_E_ACTION_INCOMPATIBLE_WITH_LAYER: Hresult = 0x8032002Cu.toInt()

public val FWP_E_ACTION_INCOMPATIBLE_WITH_SUBLAYER: Hresult = 0x8032002Du.toInt()

public val FWP_E_ALREADY_EXISTS: Hresult = 0x80320009u.toInt()

public val FWP_E_BUILTIN_OBJECT: Hresult = 0x80320017u.toInt()

public val FWP_E_CALLOUT_NOTIFICATION_FAILED: Hresult = 0x80320037u.toInt()

public val FWP_E_CALLOUT_NOT_FOUND: Hresult = 0x80320001u.toInt()

public val FWP_E_CONDITION_NOT_FOUND: Hresult = 0x80320002u.toInt()

public val FWP_E_CONNECTIONS_DISABLED: Hresult = 0x80320041u.toInt()

public val FWP_E_CONTEXT_INCOMPATIBLE_WITH_CALLOUT: Hresult = 0x8032002Fu.toInt()

public val FWP_E_CONTEXT_INCOMPATIBLE_WITH_LAYER: Hresult = 0x8032002Eu.toInt()

public val FWP_E_DROP_NOICMP: Hresult = 0x80320104u.toInt()

public val FWP_E_DUPLICATE_AUTH_METHOD: Hresult = 0x8032003Cu.toInt()

public val FWP_E_DUPLICATE_CONDITION: Hresult = 0x8032002Au.toInt()

public val FWP_E_DUPLICATE_KEYMOD: Hresult = 0x8032002Bu.toInt()

public val FWP_E_DYNAMIC_SESSION_IN_PROGRESS: Hresult = 0x8032000Bu.toInt()

public val FWP_E_EM_NOT_SUPPORTED: Hresult = 0x80320032u.toInt()

public val FWP_E_FILTER_NOT_FOUND: Hresult = 0x80320003u.toInt()

public val FWP_E_IKEEXT_NOT_RUNNING: Hresult = 0x80320044u.toInt()

public val FWP_E_INCOMPATIBLE_AUTH_METHOD: Hresult = 0x80320030u.toInt()

public val FWP_E_INCOMPATIBLE_CIPHER_TRANSFORM: Hresult = 0x8032003Au.toInt()

public val FWP_E_INCOMPATIBLE_DH_GROUP: Hresult = 0x80320031u.toInt()

public val FWP_E_INCOMPATIBLE_LAYER: Hresult = 0x80320014u.toInt()

public val FWP_E_INCOMPATIBLE_SA_STATE: Hresult = 0x8032001Bu.toInt()

public val FWP_E_INCOMPATIBLE_TXN: Hresult = 0x80320011u.toInt()

public val FWP_E_INVALID_ACTION_TYPE: Hresult = 0x80320024u.toInt()

public val FWP_E_INVALID_AUTH_TRANSFORM: Hresult = 0x80320038u.toInt()

public val FWP_E_INVALID_CIPHER_TRANSFORM: Hresult = 0x80320039u.toInt()

public val FWP_E_INVALID_DNS_NAME: Hresult = 0x80320042u.toInt()

public val FWP_E_INVALID_ENUMERATOR: Hresult = 0x8032001Du.toInt()

public val FWP_E_INVALID_FLAGS: Hresult = 0x8032001Eu.toInt()

public val FWP_E_INVALID_INTERVAL: Hresult = 0x80320021u.toInt()

public val FWP_E_INVALID_NET_MASK: Hresult = 0x8032001Fu.toInt()

public val FWP_E_INVALID_PARAMETER: Hresult = 0x80320035u.toInt()

public val FWP_E_INVALID_RANGE: Hresult = 0x80320020u.toInt()

public val FWP_E_INVALID_TRANSFORM_COMBINATION: Hresult = 0x8032003Bu.toInt()

public val FWP_E_INVALID_TUNNEL_ENDPOINT: Hresult = 0x8032003Du.toInt()

public val FWP_E_INVALID_WEIGHT: Hresult = 0x80320025u.toInt()

public val FWP_E_IN_USE: Hresult = 0x8032000Au.toInt()

public val FWP_E_KEY_DICTATION_INVALID_KEYING_MATERIAL: Hresult = 0x80320040u.toInt()

public val FWP_E_KEY_DICTATOR_ALREADY_REGISTERED: Hresult = 0x8032003Fu.toInt()

public val FWP_E_KM_CLIENTS_ONLY: Hresult = 0x80320015u.toInt()

public val FWP_E_L2_DRIVER_NOT_READY: Hresult = 0x8032003Eu.toInt()

public val FWP_E_LAYER_NOT_FOUND: Hresult = 0x80320004u.toInt()

public val FWP_E_LIFETIME_MISMATCH: Hresult = 0x80320016u.toInt()

public val FWP_E_MATCH_TYPE_MISMATCH: Hresult = 0x80320026u.toInt()

public val FWP_E_NET_EVENTS_DISABLED: Hresult = 0x80320013u.toInt()

public val FWP_E_NEVER_MATCH: Hresult = 0x80320033u.toInt()

public val FWP_E_NOTIFICATION_DROPPED: Hresult = 0x80320019u.toInt()

public val FWP_E_NOT_FOUND: Hresult = 0x80320008u.toInt()

public val FWP_E_NO_TXN_IN_PROGRESS: Hresult = 0x8032000Du.toInt()

public val FWP_E_NULL_DISPLAY_NAME: Hresult = 0x80320023u.toInt()

public val FWP_E_NULL_POINTER: Hresult = 0x8032001Cu.toInt()

public val FWP_E_OUT_OF_BOUNDS: Hresult = 0x80320028u.toInt()

public val FWP_E_PROVIDER_CONTEXT_MISMATCH: Hresult = 0x80320034u.toInt()

public val FWP_E_PROVIDER_CONTEXT_NOT_FOUND: Hresult = 0x80320006u.toInt()

public val FWP_E_PROVIDER_NOT_FOUND: Hresult = 0x80320005u.toInt()

public val FWP_E_RESERVED: Hresult = 0x80320029u.toInt()

public val FWP_E_SESSION_ABORTED: Hresult = 0x80320010u.toInt()

public val FWP_E_STILL_ON: Hresult = 0x80320043u.toInt()

public val FWP_E_SUBLAYER_NOT_FOUND: Hresult = 0x80320007u.toInt()

public val FWP_E_TIMEOUT: Hresult = 0x80320012u.toInt()

public val FWP_E_TOO_MANY_CALLOUTS: Hresult = 0x80320018u.toInt()

public val FWP_E_TOO_MANY_SUBLAYERS: Hresult = 0x80320036u.toInt()

public val FWP_E_TRAFFIC_MISMATCH: Hresult = 0x8032001Au.toInt()

public val FWP_E_TXN_ABORTED: Hresult = 0x8032000Fu.toInt()

public val FWP_E_TXN_IN_PROGRESS: Hresult = 0x8032000Eu.toInt()

public val FWP_E_TYPE_MISMATCH: Hresult = 0x80320027u.toInt()

public val FWP_E_WRONG_SESSION: Hresult = 0x8032000Cu.toInt()

public val FWP_E_ZERO_LENGTH_ARRAY: Hresult = 0x80320022u.toInt()

public val GCN_E_DEFAULTNAMESPACE_EXISTS: Hresult = 0x803B0029u.toInt()

public val GCN_E_MODULE_NOT_FOUND: Hresult = 0x803B0021u.toInt()

public val GCN_E_NETADAPTER_NOT_FOUND: Hresult = 0x803B0026u.toInt()

public val GCN_E_NETADAPTER_TIMEOUT: Hresult = 0x803B0025u.toInt()

public val GCN_E_NETCOMPARTMENT_NOT_FOUND: Hresult = 0x803B0027u.toInt()

public val GCN_E_NETINTERFACE_NOT_FOUND: Hresult = 0x803B0028u.toInt()

public val GCN_E_NO_REQUEST_HANDLERS: Hresult = 0x803B0022u.toInt()

public val GCN_E_REQUEST_UNSUPPORTED: Hresult = 0x803B0023u.toInt()

public val GCN_E_RUNTIMEKEYS_FAILED: Hresult = 0x803B0024u.toInt()

public val GENERIC_ALL: GenericAccessRights = 268435456u

public val GENERIC_EXECUTE: GenericAccessRights = 536870912u

public val GENERIC_READ: GenericAccessRights = 2147483648u

public val GENERIC_WRITE: GenericAccessRights = 1073741824u

public val HANDLE_FLAG_INHERIT: HandleFlags = 1u

public val HANDLE_FLAG_PROTECT_FROM_CLOSE: HandleFlags = 2u

public val HCN_E_ADAPTER_NOT_FOUND: Hresult = 0x803B0006u.toInt()

public val HCN_E_ADDR_INVALID_OR_RESERVED: Hresult = 0x803B002Fu.toInt()

public val HCN_E_DEGRADED_OPERATION: Hresult = 0x803B0017u.toInt()

public val HCN_E_ENDPOINT_ALREADY_ATTACHED: Hresult = 0x803B0014u.toInt()

public val HCN_E_ENDPOINT_NAMESPACE_ALREADY_EXISTS: Hresult = 0x803B002Bu.toInt()

public val HCN_E_ENDPOINT_NOT_ATTACHED: Hresult = 0x803B0034u.toInt()

public val HCN_E_ENDPOINT_NOT_FOUND: Hresult = 0x803B0002u.toInt()

public val HCN_E_ENDPOINT_NOT_LOCAL: Hresult = 0x803B0035u.toInt()

public val HCN_E_ENDPOINT_SHARING_DISABLED: Hresult = 0x803B001Du.toInt()

public val HCN_E_ENTITY_HAS_REFERENCES: Hresult = 0x803B002Cu.toInt()

public val HCN_E_GUID_CONVERSION_FAILURE: Hresult = 0x803B0019u.toInt()

public val HCN_E_ICS_DISABLED: Hresult = 0x803B002Au.toInt()

public val HCN_E_INVALID_ENDPOINT: Hresult = 0x803B000Cu.toInt()

public val HCN_E_INVALID_INTERNAL_PORT: Hresult = 0x803B002Du.toInt()

public val HCN_E_INVALID_IP: Hresult = 0x803B001Eu.toInt()

public val HCN_E_INVALID_IP_SUBNET: Hresult = 0x803B0033u.toInt()

public val HCN_E_INVALID_JSON: Hresult = 0x803B001Bu.toInt()

public val HCN_E_INVALID_JSON_REFERENCE: Hresult = 0x803B001Cu.toInt()

public val HCN_E_INVALID_NETWORK: Hresult = 0x803B000Au.toInt()

public val HCN_E_INVALID_NETWORK_TYPE: Hresult = 0x803B000Bu.toInt()

public val HCN_E_INVALID_POLICY: Hresult = 0x803B000Du.toInt()

public val HCN_E_INVALID_POLICY_TYPE: Hresult = 0x803B000Eu.toInt()

public val HCN_E_INVALID_PREFIX: Hresult = 0x803B0030u.toInt()

public val HCN_E_INVALID_REMOTE_ENDPOINT_OPERATION: Hresult = 0x803B000Fu.toInt()

public val HCN_E_INVALID_SUBNET: Hresult = 0x803B0032u.toInt()

public val HCN_E_LAYER_ALREADY_EXISTS: Hresult = 0x803B0011u.toInt()

public val HCN_E_LAYER_NOT_FOUND: Hresult = 0x803B0003u.toInt()

public val HCN_E_MANAGER_STOPPED: Hresult = 0x803B0020u.toInt()

public val HCN_E_MAPPING_NOT_SUPPORTED: Hresult = 0x803B0016u.toInt()

public val HCN_E_NAMESPACE_ATTACH_FAILED: Hresult = 0x803B002Eu.toInt()

public val HCN_E_NETWORK_ALREADY_EXISTS: Hresult = 0x803B0010u.toInt()

public val HCN_E_NETWORK_NOT_FOUND: Hresult = 0x803B0001u.toInt()

public val HCN_E_OBJECT_USED_AFTER_UNLOAD: Hresult = 0x803B0031u.toInt()

public val HCN_E_POLICY_ALREADY_EXISTS: Hresult = 0x803B0012u.toInt()

public val HCN_E_POLICY_NOT_FOUND: Hresult = 0x803B0008u.toInt()

public val HCN_E_PORT_ALREADY_EXISTS: Hresult = 0x803B0013u.toInt()

public val HCN_E_PORT_NOT_FOUND: Hresult = 0x803B0007u.toInt()

public val HCN_E_REGKEY_FAILURE: Hresult = 0x803B001Au.toInt()

public val HCN_E_REQUEST_UNSUPPORTED: Hresult = 0x803B0015u.toInt()

public val HCN_E_SHARED_SWITCH_MODIFICATION: Hresult = 0x803B0018u.toInt()

public val HCN_E_SUBNET_NOT_FOUND: Hresult = 0x803B0005u.toInt()

public val HCN_E_SWITCH_EXTENSION_NOT_FOUND: Hresult = 0x803B001Fu.toInt()

public val HCN_E_SWITCH_NOT_FOUND: Hresult = 0x803B0004u.toInt()

public val HCN_E_VFP_NOT_ALLOWED: Hresult = 0x803B0037u.toInt()

public val HCN_E_VFP_PORTSETTING_NOT_FOUND: Hresult = 0x803B0009u.toInt()

public val HCN_INTERFACEPARAMETERS_ALREADY_APPLIED: Hresult = 0x803B0036u.toInt()

public val HCS_E_ACCESS_DENIED: Hresult = 0x8037011Bu.toInt()

public val HCS_E_CONNECTION_CLOSED: Hresult = 0x8037010Au.toInt()

public val HCS_E_CONNECTION_TIMEOUT: Hresult = 0x80370109u.toInt()

public val HCS_E_CONNECT_FAILED: Hresult = 0x80370108u.toInt()

public val HCS_E_GUEST_CRITICAL_ERROR: Hresult = 0x8037011Cu.toInt()

public val HCS_E_HYPERV_NOT_INSTALLED: Hresult = 0x80370102u.toInt()

public val HCS_E_IMAGE_MISMATCH: Hresult = 0x80370101u.toInt()

public val HCS_E_INVALID_JSON: Hresult = 0x8037010Du.toInt()

public val HCS_E_INVALID_LAYER: Hresult = 0x80370112u.toInt()

public val HCS_E_INVALID_STATE: Hresult = 0x80370105u.toInt()

public val HCS_E_OPERATION_ALREADY_CANCELLED: Hresult = 0x80370121u.toInt()

public val HCS_E_OPERATION_ALREADY_STARTED: Hresult = 0x80370116u.toInt()

public val HCS_E_OPERATION_NOT_STARTED: Hresult = 0x80370115u.toInt()

public val HCS_E_OPERATION_PENDING: Hresult = 0x80370117u.toInt()

public val HCS_E_OPERATION_RESULT_ALLOCATION_FAILED: Hresult = 0x8037011Au.toInt()

public val HCS_E_OPERATION_SYSTEM_CALLBACK_ALREADY_SET: Hresult = 0x80370119u.toInt()

public val HCS_E_OPERATION_TIMEOUT: Hresult = 0x80370118u.toInt()

public val HCS_E_PROCESS_ALREADY_STOPPED: Hresult = 0x8037011Fu.toInt()

public val HCS_E_PROCESS_INFO_NOT_AVAILABLE: Hresult = 0x8037011Du.toInt()

public val HCS_E_PROTOCOL_ERROR: Hresult = 0x80370111u.toInt()

public val HCS_E_SERVICE_DISCONNECT: Hresult = 0x8037011Eu.toInt()

public val HCS_E_SERVICE_NOT_AVAILABLE: Hresult = 0x80370114u.toInt()

public val HCS_E_SYSTEM_ALREADY_EXISTS: Hresult = 0x8037010Fu.toInt()

public val HCS_E_SYSTEM_ALREADY_STOPPED: Hresult = 0x80370110u.toInt()

public val HCS_E_SYSTEM_NOT_CONFIGURED_FOR_OPERATION: Hresult = 0x80370120u.toInt()

public val HCS_E_SYSTEM_NOT_FOUND: Hresult = 0x8037010Eu.toInt()

public val HCS_E_TERMINATED: Hresult = 0x80370107u.toInt()

public val HCS_E_TERMINATED_DURING_START: Hresult = 0x80370100u.toInt()

public val HCS_E_UNEXPECTED_EXIT: Hresult = 0x80370106u.toInt()

public val HCS_E_UNKNOWN_MESSAGE: Hresult = 0x8037010Bu.toInt()

public val HCS_E_UNSUPPORTED_PROTOCOL_VERSION: Hresult = 0x8037010Cu.toInt()

public val HCS_E_WINDOWS_INSIDER_REQUIRED: Hresult = 0x80370113u.toInt()

public val HSP_BASE_ERROR_MASK: Hresult = 0x81290100u.toInt()

public val HSP_BASE_INTERNAL_ERROR: Hresult = 0x812901FFu.toInt()

public val HSP_BS_ERROR_MASK: Hresult = 0x81281000u.toInt()

public val HSP_BS_INTERNAL_ERROR: Hresult = 0x812810FFu.toInt()

public val HSP_DRV_ERROR_MASK: Hresult = 0x81290000u.toInt()

public val HSP_DRV_INTERNAL_ERROR: Hresult = 0x812900FFu.toInt()

public val HSP_E_ERROR_MASK: Hresult = 0x81280000u.toInt()

public val HSP_E_INTERNAL_ERROR: Hresult = 0x81280FFFu.toInt()

public val HSP_KSP_ALGORITHM_NOT_SUPPORTED: Hresult = 0x81290209u.toInt()

public val HSP_KSP_BUFFER_TOO_SMALL: Hresult = 0x81290205u.toInt()

public val HSP_KSP_DEVICE_NOT_READY: Hresult = 0x81290201u.toInt()

public val HSP_KSP_ERROR_MASK: Hresult = 0x81290200u.toInt()

public val HSP_KSP_INTERNAL_ERROR: Hresult = 0x812902FFu.toInt()

public val HSP_KSP_INVALID_DATA: Hresult = 0x81290207u.toInt()

public val HSP_KSP_INVALID_FLAGS: Hresult = 0x81290208u.toInt()

public val HSP_KSP_INVALID_KEY_HANDLE: Hresult = 0x81290203u.toInt()

public val HSP_KSP_INVALID_KEY_TYPE: Hresult = 0x8129020Cu.toInt()

public val HSP_KSP_INVALID_PARAMETER: Hresult = 0x81290204u.toInt()

public val HSP_KSP_INVALID_PROVIDER_HANDLE: Hresult = 0x81290202u.toInt()

public val HSP_KSP_KEY_ALREADY_FINALIZED: Hresult = 0x8129020Au.toInt()

public val HSP_KSP_KEY_EXISTS: Hresult = 0x81290215u.toInt()

public val HSP_KSP_KEY_LOAD_FAIL: Hresult = 0x81290217u.toInt()

public val HSP_KSP_KEY_MISSING: Hresult = 0x81290216u.toInt()

public val HSP_KSP_KEY_NOT_FINALIZED: Hresult = 0x8129020Bu.toInt()

public val HSP_KSP_NOT_SUPPORTED: Hresult = 0x81290206u.toInt()

public val HSP_KSP_NO_MEMORY: Hresult = 0x81290210u.toInt()

public val HSP_KSP_NO_MORE_ITEMS: Hresult = 0x81290218u.toInt()

public val HSP_KSP_PARAMETER_NOT_SET: Hresult = 0x81290211u.toInt()

public val HTTP_E_STATUS_AMBIGUOUS: Hresult = 0x8019012Cu.toInt()

public val HTTP_E_STATUS_BAD_GATEWAY: Hresult = 0x801901F6u.toInt()

public val HTTP_E_STATUS_BAD_METHOD: Hresult = 0x80190195u.toInt()

public val HTTP_E_STATUS_BAD_REQUEST: Hresult = 0x80190190u.toInt()

public val HTTP_E_STATUS_CONFLICT: Hresult = 0x80190199u.toInt()

public val HTTP_E_STATUS_DENIED: Hresult = 0x80190191u.toInt()

public val HTTP_E_STATUS_EXPECTATION_FAILED: Hresult = 0x801901A1u.toInt()

public val HTTP_E_STATUS_FORBIDDEN: Hresult = 0x80190193u.toInt()

public val HTTP_E_STATUS_GATEWAY_TIMEOUT: Hresult = 0x801901F8u.toInt()

public val HTTP_E_STATUS_GONE: Hresult = 0x8019019Au.toInt()

public val HTTP_E_STATUS_LENGTH_REQUIRED: Hresult = 0x8019019Bu.toInt()

public val HTTP_E_STATUS_MOVED: Hresult = 0x8019012Du.toInt()

public val HTTP_E_STATUS_NONE_ACCEPTABLE: Hresult = 0x80190196u.toInt()

public val HTTP_E_STATUS_NOT_FOUND: Hresult = 0x80190194u.toInt()

public val HTTP_E_STATUS_NOT_MODIFIED: Hresult = 0x80190130u.toInt()

public val HTTP_E_STATUS_NOT_SUPPORTED: Hresult = 0x801901F5u.toInt()

public val HTTP_E_STATUS_PAYMENT_REQ: Hresult = 0x80190192u.toInt()

public val HTTP_E_STATUS_PRECOND_FAILED: Hresult = 0x8019019Cu.toInt()

public val HTTP_E_STATUS_PROXY_AUTH_REQ: Hresult = 0x80190197u.toInt()

public val HTTP_E_STATUS_RANGE_NOT_SATISFIABLE: Hresult = 0x801901A0u.toInt()

public val HTTP_E_STATUS_REDIRECT: Hresult = 0x8019012Eu.toInt()

public val HTTP_E_STATUS_REDIRECT_KEEP_VERB: Hresult = 0x80190133u.toInt()

public val HTTP_E_STATUS_REDIRECT_METHOD: Hresult = 0x8019012Fu.toInt()

public val HTTP_E_STATUS_REQUEST_TIMEOUT: Hresult = 0x80190198u.toInt()

public val HTTP_E_STATUS_REQUEST_TOO_LARGE: Hresult = 0x8019019Du.toInt()

public val HTTP_E_STATUS_SERVER_ERROR: Hresult = 0x801901F4u.toInt()

public val HTTP_E_STATUS_SERVICE_UNAVAIL: Hresult = 0x801901F7u.toInt()

public val HTTP_E_STATUS_UNEXPECTED: Hresult = 0x80190001u.toInt()

public val HTTP_E_STATUS_UNEXPECTED_CLIENT_ERROR: Hresult = 0x80190004u.toInt()

public val HTTP_E_STATUS_UNEXPECTED_REDIRECTION: Hresult = 0x80190003u.toInt()

public val HTTP_E_STATUS_UNEXPECTED_SERVER_ERROR: Hresult = 0x80190005u.toInt()

public val HTTP_E_STATUS_UNSUPPORTED_MEDIA: Hresult = 0x8019019Fu.toInt()

public val HTTP_E_STATUS_URI_TOO_LONG: Hresult = 0x8019019Eu.toInt()

public val HTTP_E_STATUS_USE_PROXY: Hresult = 0x80190131u.toInt()

public val HTTP_E_STATUS_VERSION_NOT_SUP: Hresult = 0x801901F9u.toInt()

public val INPLACE_E_FIRST: Int = -2147221088

public val INPLACE_E_LAST: Int = -2147221073

public val INPLACE_E_NOTOOLSPACE: Hresult = 0x800401A1u.toInt()

public val INPLACE_E_NOTUNDOABLE: Hresult = 0x800401A0u.toInt()

public val INPLACE_S_FIRST: Int = 262560

public val INPLACE_S_LAST: Int = 262575

public val INPLACE_S_TRUNCATED: Hresult = 0x401A0u.toInt()

public val INPUT_E_DEVICE_INFO: Hresult = 0x80400006u.toInt()

public val INPUT_E_DEVICE_PROPERTY: Hresult = 0x80400008u.toInt()

public val INPUT_E_FRAME: Hresult = 0x80400004u.toInt()

public val INPUT_E_HISTORY: Hresult = 0x80400005u.toInt()

public val INPUT_E_MULTIMODAL: Hresult = 0x80400002u.toInt()

public val INPUT_E_OUT_OF_ORDER: Hresult = 0x80400000u.toInt()

public val INPUT_E_PACKET: Hresult = 0x80400003u.toInt()

public val INPUT_E_REENTRANCY: Hresult = 0x80400001u.toInt()

public val INPUT_E_TRANSFORM: Hresult = 0x80400007u.toInt()

public val INVALID_HANDLE_VALUE: Handle = MutPtr((-1).toLong())

public val IORING_E_COMPLETION_QUEUE_TOO_BIG: Hresult = 0x80460005u.toInt()

public val IORING_E_COMPLETION_QUEUE_TOO_FULL: Hresult = 0x80460008u.toInt()

public val IORING_E_CORRUPT: Hresult = 0x80460007u.toInt()

public val IORING_E_REQUIRED_FLAG_NOT_SUPPORTED: Hresult = 0x80460001u.toInt()

public val IORING_E_SUBMISSION_QUEUE_FULL: Hresult = 0x80460002u.toInt()

public val IORING_E_SUBMISSION_QUEUE_TOO_BIG: Hresult = 0x80460004u.toInt()

public val IORING_E_SUBMIT_IN_PROGRESS: Hresult = 0x80460006u.toInt()

public val IORING_E_VERSION_NOT_SUPPORTED: Hresult = 0x80460003u.toInt()

public val IO_BAD_BLOCK_WITH_NAME: Ntstatus = 0xC004001Fu.toInt()

public val IO_CDROM_EXCLUSIVE_LOCK: Ntstatus = 0x40040085u.toInt()

public val IO_DRIVER_CANCEL_TIMEOUT: Ntstatus = 0x80040036u.toInt()

public val IO_DUMP_CALLBACK_EXCEPTION: Ntstatus = 0xC00400A3u.toInt()

public val IO_DUMP_CREATION_SUCCESS: Ntstatus = 0x400A2u.toInt()

public val IO_DUMP_DIRECT_CONFIG_FAILED: Ntstatus = 0xC0040030u.toInt()

public val IO_DUMP_DRIVER_LOAD_FAILURE: Ntstatus = 0xC004002Du.toInt()

public val IO_DUMP_DUMPFILE_CONFLICT: Ntstatus = 0xC004002Fu.toInt()

public val IO_DUMP_INITIALIZATION_FAILURE: Ntstatus = 0xC004002Eu.toInt()

public val IO_DUMP_INIT_DEDICATED_DUMP_FAILURE: Ntstatus = 0xC00400A4u.toInt()

public val IO_DUMP_PAGE_CONFIG_FAILED: Ntstatus = 0xC0040031u.toInt()

public val IO_DUMP_POINTER_FAILURE: Ntstatus = 0xC004002Cu.toInt()

public val IO_ERROR_DISK_RESOURCES_EXHAUSTED: Ntstatus = 0xC0040096u.toInt()

public val IO_ERROR_DUMP_CREATION_ERROR: Ntstatus = 0xC00400A1u.toInt()

public val IO_ERROR_IO_HARDWARE_ERROR: Ntstatus = 0xC004009Au.toInt()

public val IO_ERR_BAD_BLOCK: Ntstatus = 0xC0040007u.toInt()

public val IO_ERR_BAD_FIRMWARE: Ntstatus = 0xC0040019u.toInt()

public val IO_ERR_CONFIGURATION_ERROR: Ntstatus = 0xC0040003u.toInt()

public val IO_ERR_CONTROLLER_ERROR: Ntstatus = 0xC004000Bu.toInt()

public val IO_ERR_DMA_CONFLICT_DETECTED: Ntstatus = 0xC0040017u.toInt()

public val IO_ERR_DMA_RESOURCE_CONFLICT: Ntstatus = 0xC004001Bu.toInt()

public val IO_ERR_DRIVER_ERROR: Ntstatus = 0xC0040004u.toInt()

public val IO_ERR_INCORRECT_IRQL: Ntstatus = 0xC004000Du.toInt()

public val IO_ERR_INSUFFICIENT_RESOURCES: Ntstatus = 0xC0040002u.toInt()

public val IO_ERR_INTERNAL_ERROR: Ntstatus = 0xC004000Cu.toInt()

public val IO_ERR_INTERRUPT_RESOURCE_CONFLICT: Ntstatus = 0xC004001Cu.toInt()

public val IO_ERR_INVALID_IOBASE: Ntstatus = 0xC004000Eu.toInt()

public val IO_ERR_INVALID_REQUEST: Ntstatus = 0xC0040010u.toInt()

public val IO_ERR_IRQ_CONFLICT_DETECTED: Ntstatus = 0xC0040018u.toInt()

public val IO_ERR_LAYERED_FAILURE: Ntstatus = 0xC0040012u.toInt()

public val IO_ERR_MEMORY_CONFLICT_DETECTED: Ntstatus = 0xC0040015u.toInt()

public val IO_ERR_MEMORY_RESOURCE_CONFLICT: Ntstatus = 0xC004001Du.toInt()

public val IO_ERR_NOT_READY: Ntstatus = 0xC004000Fu.toInt()

public val IO_ERR_OVERRUN_ERROR: Ntstatus = 0xC0040008u.toInt()

public val IO_ERR_PARITY: Ntstatus = 0xC0040005u.toInt()

public val IO_ERR_PORT_CONFLICT_DETECTED: Ntstatus = 0xC0040016u.toInt()

public val IO_ERR_PORT_RESOURCE_CONFLICT: Ntstatus = 0xC004001Eu.toInt()

public val IO_ERR_PORT_TIMEOUT: Ntstatus = 0xC0040075u.toInt()

public val IO_ERR_PROTOCOL: Ntstatus = 0xC0040014u.toInt()

public val IO_ERR_RESET: Ntstatus = 0xC0040013u.toInt()

public val IO_ERR_RETRY_SUCCEEDED: Ntstatus = 0x40001u.toInt()

public val IO_ERR_SEEK_ERROR: Ntstatus = 0xC0040006u.toInt()

public val IO_ERR_SEQUENCE: Ntstatus = 0xC004000Au.toInt()

public val IO_ERR_THREAD_STUCK_IN_DEVICE_DRIVER: Ntstatus = 0xC004006Cu.toInt()

public val IO_ERR_TIMEOUT: Ntstatus = 0xC0040009u.toInt()

public val IO_ERR_VERSION: Ntstatus = 0xC0040011u.toInt()

public val IO_FILE_QUOTA_CORRUPT: Ntstatus = 0xC004002Au.toInt()

public val IO_FILE_QUOTA_FAILED: Ntstatus = 0x80040028u.toInt()

public val IO_FILE_QUOTA_LIMIT: Ntstatus = 0x40040025u.toInt()

public val IO_FILE_QUOTA_STARTED: Ntstatus = 0x40040026u.toInt()

public val IO_FILE_QUOTA_SUCCEEDED: Ntstatus = 0x40040027u.toInt()

public val IO_FILE_QUOTA_THRESHOLD: Ntstatus = 0x40040024u.toInt()

public val IO_FILE_SYSTEM_CORRUPT: Ntstatus = 0xC0040029u.toInt()

public val IO_FILE_SYSTEM_CORRUPT_WITH_NAME: Ntstatus = 0xC0040037u.toInt()

public val IO_INFO_THROTTLE_COMPLETE: Ntstatus = 0x40040077u.toInt()

public val IO_LOST_DELAYED_WRITE: Ntstatus = 0x80040032u.toInt()

public val IO_LOST_DELAYED_WRITE_NETWORK_DISCONNECTED: Ntstatus = 0x8004008Bu.toInt()

public val IO_LOST_DELAYED_WRITE_NETWORK_LOCAL_DISK_ERROR: Ntstatus = 0x8004008Du.toInt()

public val IO_LOST_DELAYED_WRITE_NETWORK_SERVER_ERROR: Ntstatus = 0x8004008Cu.toInt()

public val IO_RECOVERED_VIA_ECC: Ntstatus = 0x80040021u.toInt()

public val IO_SYSTEM_SLEEP_FAILED: Ntstatus = 0xC004002Bu.toInt()

public val IO_WARNING_ADAPTER_FIRMWARE_UPDATED: Ntstatus = 0x400400A0u.toInt()

public val IO_WARNING_ALLOCATION_FAILED: Ntstatus = 0x80040038u.toInt()

public val IO_WARNING_BUS_RESET: Ntstatus = 0x80040076u.toInt()

public val IO_WARNING_COMPLETION_TIME: Ntstatus = 0x8004009Bu.toInt()

public val IO_WARNING_DEVICE_HAS_INTERNAL_DUMP: Ntstatus = 0x8004008Fu.toInt()

public val IO_WARNING_DISK_CAPACITY_CHANGED: Ntstatus = 0x80040097u.toInt()

public val IO_WARNING_DISK_FIRMWARE_UPDATED: Ntstatus = 0x4004009Fu.toInt()

public val IO_WARNING_DISK_PROVISIONING_TYPE_CHANGED: Ntstatus = 0x80040098u.toInt()

public val IO_WARNING_DISK_SURPRISE_REMOVED: Ntstatus = 0x8004009Du.toInt()

public val IO_WARNING_DUMP_DISABLED_DEVICE_GONE: Ntstatus = 0x8004009Cu.toInt()

public val IO_WARNING_DUPLICATE_PATH: Ntstatus = 0x8004003Bu.toInt()

public val IO_WARNING_DUPLICATE_SIGNATURE: Ntstatus = 0x8004003Au.toInt()

public val IO_WARNING_INTERRUPT_STILL_PENDING: Ntstatus = 0x80040035u.toInt()

public val IO_WARNING_IO_OPERATION_RETRIED: Ntstatus = 0x80040099u.toInt()

public val IO_WARNING_LOG_FLUSH_FAILED: Ntstatus = 0x80040039u.toInt()

public val IO_WARNING_PAGING_FAILURE: Ntstatus = 0x80040033u.toInt()

public val IO_WARNING_REPEATED_DISK_GUID: Ntstatus = 0x8004009Eu.toInt()

public val IO_WARNING_RESET: Ntstatus = 0x80040081u.toInt()

public val IO_WARNING_SOFT_THRESHOLD_REACHED: Ntstatus = 0x80040090u.toInt()

public val IO_WARNING_SOFT_THRESHOLD_REACHED_EX: Ntstatus = 0x80040091u.toInt()

public val IO_WARNING_SOFT_THRESHOLD_REACHED_EX_LUN_LUN: Ntstatus = 0x80040092u.toInt()

public val IO_WARNING_SOFT_THRESHOLD_REACHED_EX_LUN_POOL: Ntstatus = 0x80040093u.toInt()

public val IO_WARNING_SOFT_THRESHOLD_REACHED_EX_POOL_LUN: Ntstatus = 0x80040094u.toInt()

public val IO_WARNING_SOFT_THRESHOLD_REACHED_EX_POOL_POOL: Ntstatus = 0x80040095u.toInt()

public val IO_WARNING_VOLUME_LOST_DISK_EXTENT: Ntstatus = 0x8004008Eu.toInt()

public val IO_WARNING_WRITE_FUA_PROBLEM: Ntstatus = 0x80040084u.toInt()

public val IO_WRITE_CACHE_DISABLED: Ntstatus = 0x80040022u.toInt()

public val IO_WRITE_CACHE_ENABLED: Ntstatus = 0x80040020u.toInt()

public val IO_WRN_BAD_FIRMWARE: Ntstatus = 0x8004001Au.toInt()

public val IO_WRN_FAILURE_PREDICTED: Ntstatus = 0x80040034u.toInt()

public val JSCRIPT_E_CANTEXECUTE: Hresult = 0x89020001u.toInt()

public val LANGUAGE_E_DATABASE_NOT_FOUND: Hresult = 0x80041784u.toInt()

public val LANGUAGE_S_LARGE_WORD: Hresult = 0x41781u.toInt()

public val MARSHAL_E_FIRST: Int = -2147221216

public val MARSHAL_E_LAST: Int = -2147221201

public val MARSHAL_S_FIRST: Int = 262432

public val MARSHAL_S_LAST: Int = 262447

public val MAX_PATH: UInt = 260u

public val MCA_BUS_ERROR: Ntstatus = 0xC005007Au.toInt()

public val MCA_BUS_TIMEOUT_ERROR: Ntstatus = 0xC005007Bu.toInt()

public val MCA_ERROR_CACHE: Ntstatus = 0xC005003Du.toInt()

public val MCA_ERROR_CPU: Ntstatus = 0xC0050072u.toInt()

public val MCA_ERROR_CPU_BUS: Ntstatus = 0xC0050041u.toInt()

public val MCA_ERROR_MAS: Ntstatus = 0xC0050045u.toInt()

public val MCA_ERROR_MEM_1_2: Ntstatus = 0xC0050049u.toInt()

public val MCA_ERROR_MEM_1_2_5: Ntstatus = 0xC005004Bu.toInt()

public val MCA_ERROR_MEM_1_2_5_4: Ntstatus = 0xC005004Du.toInt()

public val MCA_ERROR_MEM_UNKNOWN: Ntstatus = 0xC0050047u.toInt()

public val MCA_ERROR_PCI_BUS_MASTER_ABORT: Ntstatus = 0xC0050059u.toInt()

public val MCA_ERROR_PCI_BUS_MASTER_ABORT_NO_INFO: Ntstatus = 0xC005005Bu.toInt()

public val MCA_ERROR_PCI_BUS_PARITY: Ntstatus = 0xC0050051u.toInt()

public val MCA_ERROR_PCI_BUS_PARITY_NO_INFO: Ntstatus = 0xC0050053u.toInt()

public val MCA_ERROR_PCI_BUS_SERR: Ntstatus = 0xC0050055u.toInt()

public val MCA_ERROR_PCI_BUS_SERR_NO_INFO: Ntstatus = 0xC0050057u.toInt()

public val MCA_ERROR_PCI_BUS_TIMEOUT: Ntstatus = 0xC005005Du.toInt()

public val MCA_ERROR_PCI_BUS_TIMEOUT_NO_INFO: Ntstatus = 0xC005005Fu.toInt()

public val MCA_ERROR_PCI_BUS_UNKNOWN: Ntstatus = 0xC0050061u.toInt()

public val MCA_ERROR_PCI_DEVICE: Ntstatus = 0xC0050063u.toInt()

public val MCA_ERROR_PLATFORM_SPECIFIC: Ntstatus = 0xC0050067u.toInt()

public val MCA_ERROR_REGISTER_FILE: Ntstatus = 0xC0050043u.toInt()

public val MCA_ERROR_SMBIOS: Ntstatus = 0xC0050065u.toInt()

public val MCA_ERROR_SYSTEM_EVENT: Ntstatus = 0xC005004Fu.toInt()

public val MCA_ERROR_TLB: Ntstatus = 0xC005003Fu.toInt()

public val MCA_ERROR_UNKNOWN: Ntstatus = 0xC0050069u.toInt()

public val MCA_ERROR_UNKNOWN_NO_CPU: Ntstatus = 0xC005006Bu.toInt()

public val MCA_EXTERNAL_ERROR: Ntstatus = 0xC005007Fu.toInt()

public val MCA_FRC_ERROR: Ntstatus = 0xC0050080u.toInt()

public val MCA_INFO_CPU_THERMAL_THROTTLING_REMOVED: Ntstatus = 0x40050070u.toInt()

public val MCA_INFO_MEMORY_PAGE_MARKED_BAD: Ntstatus = 0x40050074u.toInt()

public val MCA_INFO_NO_MORE_CORRECTED_ERROR_LOGS: Ntstatus = 0x40050073u.toInt()

public val MCA_INTERNALTIMER_ERROR: Ntstatus = 0xC005007Cu.toInt()

public val MCA_MEMORYHIERARCHY_ERROR: Ntstatus = 0xC0050078u.toInt()

public val MCA_MICROCODE_ROM_PARITY_ERROR: Ntstatus = 0xC005007Eu.toInt()

public val MCA_TLB_ERROR: Ntstatus = 0xC0050079u.toInt()

public val MCA_WARNING_CACHE: Ntstatus = 0x8005003Cu.toInt()

public val MCA_WARNING_CMC_THRESHOLD_EXCEEDED: Ntstatus = 0x8005006Du.toInt()

public val MCA_WARNING_CPE_THRESHOLD_EXCEEDED: Ntstatus = 0x8005006Eu.toInt()

public val MCA_WARNING_CPU: Ntstatus = 0x80050071u.toInt()

public val MCA_WARNING_CPU_BUS: Ntstatus = 0x80050040u.toInt()

public val MCA_WARNING_CPU_THERMAL_THROTTLED: Ntstatus = 0x8005006Fu.toInt()

public val MCA_WARNING_MAS: Ntstatus = 0x80050044u.toInt()

public val MCA_WARNING_MEM_1_2: Ntstatus = 0x80050048u.toInt()

public val MCA_WARNING_MEM_1_2_5: Ntstatus = 0x8005004Au.toInt()

public val MCA_WARNING_MEM_1_2_5_4: Ntstatus = 0x8005004Cu.toInt()

public val MCA_WARNING_MEM_UNKNOWN: Ntstatus = 0x80050046u.toInt()

public val MCA_WARNING_PCI_BUS_MASTER_ABORT: Ntstatus = 0x80050058u.toInt()

public val MCA_WARNING_PCI_BUS_MASTER_ABORT_NO_INFO: Ntstatus = 0x8005005Au.toInt()

public val MCA_WARNING_PCI_BUS_PARITY: Ntstatus = 0x80050050u.toInt()

public val MCA_WARNING_PCI_BUS_PARITY_NO_INFO: Ntstatus = 0x80050052u.toInt()

public val MCA_WARNING_PCI_BUS_SERR: Ntstatus = 0x80050054u.toInt()

public val MCA_WARNING_PCI_BUS_SERR_NO_INFO: Ntstatus = 0x80050056u.toInt()

public val MCA_WARNING_PCI_BUS_TIMEOUT: Ntstatus = 0x8005005Cu.toInt()

public val MCA_WARNING_PCI_BUS_TIMEOUT_NO_INFO: Ntstatus = 0x8005005Eu.toInt()

public val MCA_WARNING_PCI_BUS_UNKNOWN: Ntstatus = 0x80050060u.toInt()

public val MCA_WARNING_PCI_DEVICE: Ntstatus = 0x80050062u.toInt()

public val MCA_WARNING_PLATFORM_SPECIFIC: Ntstatus = 0x80050066u.toInt()

public val MCA_WARNING_REGISTER_FILE: Ntstatus = 0x80050042u.toInt()

public val MCA_WARNING_SMBIOS: Ntstatus = 0x80050064u.toInt()

public val MCA_WARNING_SYSTEM_EVENT: Ntstatus = 0x8005004Eu.toInt()

public val MCA_WARNING_TLB: Ntstatus = 0x8005003Eu.toInt()

public val MCA_WARNING_UNKNOWN: Ntstatus = 0x80050068u.toInt()

public val MCA_WARNING_UNKNOWN_NO_CPU: Ntstatus = 0x8005006Au.toInt()

public val MEM_E_INVALID_LINK: Hresult = 0x80080010u.toInt()

public val MEM_E_INVALID_ROOT: Hresult = 0x80080009u.toInt()

public val MEM_E_INVALID_SIZE: Hresult = 0x80080011u.toInt()

public val MENROLL_S_ENROLLMENT_SUSPENDED: Hresult = 0x180011u.toInt()

public val MILAVERR_INSUFFICIENTVIDEORESOURCES: Hresult = 0x88980508u.toInt()

public val MILAVERR_INVALIDWMPVERSION: Hresult = 0x88980507u.toInt()

public val MILAVERR_MEDIAPLAYERCLOSED: Hresult = 0x8898050Du.toInt()

public val MILAVERR_MODULENOTLOADED: Hresult = 0x88980505u.toInt()

public val MILAVERR_NOCLOCK: Hresult = 0x88980500u.toInt()

public val MILAVERR_NOMEDIATYPE: Hresult = 0x88980501u.toInt()

public val MILAVERR_NOREADYFRAMES: Hresult = 0x88980504u.toInt()

public val MILAVERR_NOVIDEOMIXER: Hresult = 0x88980502u.toInt()

public val MILAVERR_NOVIDEOPRESENTER: Hresult = 0x88980503u.toInt()

public val MILAVERR_REQUESTEDTEXTURETOOBIG: Hresult = 0x8898050Au.toInt()

public val MILAVERR_SEEKFAILED: Hresult = 0x8898050Bu.toInt()

public val MILAVERR_UNEXPECTEDWMPFAILURE: Hresult = 0x8898050Cu.toInt()

public val MILAVERR_UNKNOWNHARDWAREERROR: Hresult = 0x8898050Eu.toInt()

public val MILAVERR_VIDEOACCELERATIONNOTAVAILABLE: Hresult = 0x88980509u.toInt()

public val MILAVERR_WMPFACTORYNOTREGISTERED: Hresult = 0x88980506u.toInt()

public val MILEFFECTSERR_ALREADYATTACHEDTOLISTENER: Hresult = 0x88980618u.toInt()

public val MILEFFECTSERR_CONNECTORNOTASSOCIATEDWITHEFFECT: Hresult = 0x88980612u.toInt()

public val MILEFFECTSERR_CONNECTORNOTCONNECTED: Hresult = 0x88980611u.toInt()

public val MILEFFECTSERR_CYCLEDETECTED: Hresult = 0x88980614u.toInt()

public val MILEFFECTSERR_EFFECTALREADYINAGRAPH: Hresult = 0x88980616u.toInt()

public val MILEFFECTSERR_EFFECTHASNOCHILDREN: Hresult = 0x88980617u.toInt()

public val MILEFFECTSERR_EFFECTINMORETHANONEGRAPH: Hresult = 0x88980615u.toInt()

public val MILEFFECTSERR_EFFECTNOTPARTOFGROUP: Hresult = 0x8898060Fu.toInt()

public val MILEFFECTSERR_EMPTYBOUNDS: Hresult = 0x8898061Au.toInt()

public val MILEFFECTSERR_NOINPUTSOURCEATTACHED: Hresult = 0x88980610u.toInt()

public val MILEFFECTSERR_NOTAFFINETRANSFORM: Hresult = 0x88980619u.toInt()

public val MILEFFECTSERR_OUTPUTSIZETOOLARGE: Hresult = 0x8898061Bu.toInt()

public val MILEFFECTSERR_RESERVED: Hresult = 0x88980613u.toInt()

public val MILEFFECTSERR_UNKNOWNPROPERTY: Hresult = 0x8898060Eu.toInt()

public val MILERR_ADAPTER_NOT_FOUND: Hresult = 0x8898009Eu.toInt()

public val MILERR_ALREADYLOCKED: Hresult = 0x88980086u.toInt()

public val MILERR_ALREADY_INITIALIZED: Hresult = 0x8898008Fu.toInt()

public val MILERR_BADNUMBER: Hresult = 0x8898000Au.toInt()

public val MILERR_COLORSPACE_NOT_SUPPORTED: Hresult = 0x8898009Fu.toInt()

public val MILERR_DEVICECANNOTRENDERTEXT: Hresult = 0x88980088u.toInt()

public val MILERR_DISPLAYFORMATNOTSUPPORTED: Hresult = 0x88980084u.toInt()

public val MILERR_DISPLAYID_ACCESS_DENIED: Hresult = 0x889800A1u.toInt()

public val MILERR_DISPLAYSTATEINVALID: Hresult = 0x88980006u.toInt()

public val MILERR_DXGI_ENUMERATION_OUT_OF_SYNC: Hresult = 0x8898009Du.toInt()

public val MILERR_GENERIC_IGNORE: Hresult = 0x8898008Bu.toInt()

public val MILERR_GLYPHBITMAPMISSED: Hresult = 0x88980089u.toInt()

public val MILERR_INSUFFICIENTBUFFER: Hresult = 0x88980002u.toInt()

public val MILERR_INTERNALERROR: Hresult = 0x88980080u.toInt()

public val MILERR_INVALIDCALL: Hresult = 0x88980085u.toInt()

public val MILERR_MALFORMEDGLYPHCACHE: Hresult = 0x8898008Au.toInt()

public val MILERR_MALFORMED_GUIDELINE_DATA: Hresult = 0x8898008Cu.toInt()

public val MILERR_MAX_TEXTURE_SIZE_EXCEEDED: Hresult = 0x8898009Au.toInt()

public val MILERR_MISMATCHED_SIZE: Hresult = 0x88980090u.toInt()

public val MILERR_MROW_READLOCK_FAILED: Hresult = 0x88980097u.toInt()

public val MILERR_MROW_UPDATE_FAILED: Hresult = 0x88980098u.toInt()

public val MILERR_NEED_RECREATE_AND_PRESENT: Hresult = 0x8898008Eu.toInt()

public val MILERR_NONINVERTIBLEMATRIX: Hresult = 0x88980007u.toInt()

public val MILERR_NOTLOCKED: Hresult = 0x88980087u.toInt()

public val MILERR_NOT_QUEUING_PRESENTS: Hresult = 0x88980094u.toInt()

public val MILERR_NO_HARDWARE_DEVICE: Hresult = 0x8898008Du.toInt()

public val MILERR_NO_REDIRECTION_SURFACE_AVAILABLE: Hresult = 0x88980091u.toInt()

public val MILERR_NO_REDIRECTION_SURFACE_RETRY_LATER: Hresult = 0x88980095u.toInt()

public val MILERR_OBJECTBUSY: Hresult = 0x88980001u.toInt()

public val MILERR_PREFILTER_NOT_SUPPORTED: Hresult = 0x889800A0u.toInt()

public val MILERR_QPC_TIME_WENT_BACKWARD: Hresult = 0x8898009Bu.toInt()

public val MILERR_QUEUED_PRESENT_NOT_SUPPORTED: Hresult = 0x88980093u.toInt()

public val MILERR_REMOTING_NOT_SUPPORTED: Hresult = 0x88980092u.toInt()

public val MILERR_SCANNER_FAILED: Hresult = 0x88980004u.toInt()

public val MILERR_SCREENACCESSDENIED: Hresult = 0x88980005u.toInt()

public val MILERR_SHADER_COMPILE_FAILED: Hresult = 0x88980099u.toInt()

public val MILERR_TERMINATED: Hresult = 0x88980009u.toInt()

public val MILERR_TOOMANYSHADERELEMNTS: Hresult = 0x88980096u.toInt()

public val MILERR_WIN32ERROR: Hresult = 0x88980003u.toInt()

public val MILERR_ZEROVECTOR: Hresult = 0x88980008u.toInt()

public val MK_E_CANTOPENFILE: Hresult = 0x800401EAu.toInt()

public val MK_E_CONNECTMANUALLY: Hresult = 0x800401E0u.toInt()

public val MK_E_ENUMERATION_FAILED: Hresult = 0x800401EFu.toInt()

public val MK_E_EXCEEDEDDEADLINE: Hresult = 0x800401E1u.toInt()

public val MK_E_FIRST: Int = -2147221024

public val MK_E_INTERMEDIATEINTERFACENOTSUPPORTED: Hresult = 0x800401E7u.toInt()

public val MK_E_INVALIDEXTENSION: Hresult = 0x800401E6u.toInt()

public val MK_E_LAST: Int = -2147221009

public val MK_E_MUSTBOTHERUSER: Hresult = 0x800401EBu.toInt()

public val MK_E_NEEDGENERIC: Hresult = 0x800401E2u.toInt()

public val MK_E_NOINVERSE: Hresult = 0x800401ECu.toInt()

public val MK_E_NOOBJECT: Hresult = 0x800401E5u.toInt()

public val MK_E_NOPREFIX: Hresult = 0x800401EEu.toInt()

public val MK_E_NOSTORAGE: Hresult = 0x800401EDu.toInt()

public val MK_E_NOTBINDABLE: Hresult = 0x800401E8u.toInt()

public val MK_E_NOTBOUND: Hresult = 0x800401E9u.toInt()

public val MK_E_NO_NORMALIZED: Hresult = 0x80080007u.toInt()

public val MK_E_SYNTAX: Hresult = 0x800401E4u.toInt()

public val MK_E_UNAVAILABLE: Hresult = 0x800401E3u.toInt()

public val MK_S_FIRST: Int = 262624

public val MK_S_HIM: Hresult = 0x401E5u.toInt()

public val MK_S_LAST: Int = 262639

public val MK_S_ME: Hresult = 0x401E4u.toInt()

public val MK_S_MONIKERALREADYREGISTERED: Hresult = 0x401E7u.toInt()

public val MK_S_REDUCED_TO_SELF: Hresult = 0x401E2u.toInt()

public val MK_S_US: Hresult = 0x401E6u.toInt()

public val MSDTC_E_DUPLICATE_RESOURCE: Hresult = 0x80110701u.toInt()

public val MSSIPOTF_E_BADVERSION: Hresult = 0x80097015u.toInt()

public val MSSIPOTF_E_BAD_FIRST_TABLE_PLACEMENT: Hresult = 0x80097008u.toInt()

public val MSSIPOTF_E_BAD_MAGICNUMBER: Hresult = 0x80097004u.toInt()

public val MSSIPOTF_E_BAD_OFFSET_TABLE: Hresult = 0x80097005u.toInt()

public val MSSIPOTF_E_CANTGETOBJECT: Hresult = 0x80097002u.toInt()

public val MSSIPOTF_E_CRYPT: Hresult = 0x80097014u.toInt()

public val MSSIPOTF_E_DSIG_STRUCTURE: Hresult = 0x80097016u.toInt()

public val MSSIPOTF_E_FAILED_HINTS_CHECK: Hresult = 0x80097011u.toInt()

public val MSSIPOTF_E_FAILED_POLICY: Hresult = 0x80097010u.toInt()

public val MSSIPOTF_E_FILE: Hresult = 0x80097013u.toInt()

public val MSSIPOTF_E_FILETOOSMALL: Hresult = 0x8009700Bu.toInt()

public val MSSIPOTF_E_FILE_CHECKSUM: Hresult = 0x8009700Du.toInt()

public val MSSIPOTF_E_NOHEADTABLE: Hresult = 0x80097003u.toInt()

public val MSSIPOTF_E_NOT_OPENTYPE: Hresult = 0x80097012u.toInt()

public val MSSIPOTF_E_OUTOFMEMRANGE: Hresult = 0x80097001u.toInt()

public val MSSIPOTF_E_PCONST_CHECK: Hresult = 0x80097017u.toInt()

public val MSSIPOTF_E_STRUCTURE: Hresult = 0x80097018u.toInt()

public val MSSIPOTF_E_TABLES_OVERLAP: Hresult = 0x80097009u.toInt()

public val MSSIPOTF_E_TABLE_CHECKSUM: Hresult = 0x8009700Cu.toInt()

public val MSSIPOTF_E_TABLE_LONGWORD: Hresult = 0x80097007u.toInt()

public val MSSIPOTF_E_TABLE_PADBYTES: Hresult = 0x8009700Au.toInt()

public val MSSIPOTF_E_TABLE_TAGORDER: Hresult = 0x80097006u.toInt()

public val NAP_E_CONFLICTING_ID: Hresult = 0x80270003u.toInt()

public val NAP_E_ENTITY_DISABLED: Hresult = 0x8027000Eu.toInt()

public val NAP_E_ID_NOT_FOUND: Hresult = 0x8027000Au.toInt()

public val NAP_E_INVALID_PACKET: Hresult = 0x80270001u.toInt()

public val NAP_E_MAXSIZE_TOO_SMALL: Hresult = 0x8027000Bu.toInt()

public val NAP_E_MISMATCHED_ID: Hresult = 0x80270008u.toInt()

public val NAP_E_MISSING_SOH: Hresult = 0x80270002u.toInt()

public val NAP_E_NETSH_GROUPPOLICY_ERROR: Hresult = 0x8027000Fu.toInt()

public val NAP_E_NOT_INITIALIZED: Hresult = 0x80270007u.toInt()

public val NAP_E_NOT_PENDING: Hresult = 0x80270009u.toInt()

public val NAP_E_NOT_REGISTERED: Hresult = 0x80270006u.toInt()

public val NAP_E_NO_CACHED_SOH: Hresult = 0x80270004u.toInt()

public val NAP_E_SERVICE_NOT_RUNNING: Hresult = 0x8027000Cu.toInt()

public val NAP_E_SHV_CONFIG_EXISTED: Hresult = 0x80270011u.toInt()

public val NAP_E_SHV_CONFIG_NOT_FOUND: Hresult = 0x80270012u.toInt()

public val NAP_E_SHV_TIMEOUT: Hresult = 0x80270013u.toInt()

public val NAP_E_STILL_BOUND: Hresult = 0x80270005u.toInt()

public val NAP_E_TOO_MANY_CALLS: Hresult = 0x80270010u.toInt()

public val NAP_S_CERT_ALREADY_PRESENT: Hresult = 0x27000Du.toInt()

public val NOERROR: UInt = 0u

public val NOT_AN_ERROR1: Hresult = 0x81600u.toInt()

public val NO_ERROR: Win32Error = 0u

public val NTDDI_MAXVER: UInt = 2560u

public val NTE_AUTHENTICATION_IGNORED: Hresult = 0x80090031u.toInt()

public val NTE_BAD_ALGID: Hresult = 0x80090008u.toInt()

public val NTE_BAD_DATA: Hresult = 0x80090005u.toInt()

public val NTE_BAD_FLAGS: Hresult = 0x80090009u.toInt()

public val NTE_BAD_HASH: Hresult = 0x80090002u.toInt()

public val NTE_BAD_HASH_STATE: Hresult = 0x8009000Cu.toInt()

public val NTE_BAD_KEY: Hresult = 0x80090003u.toInt()

public val NTE_BAD_KEYSET: Hresult = 0x80090016u.toInt()

public val NTE_BAD_KEYSET_PARAM: Hresult = 0x8009001Fu.toInt()

public val NTE_BAD_KEY_STATE: Hresult = 0x8009000Bu.toInt()

public val NTE_BAD_LEN: Hresult = 0x80090004u.toInt()

public val NTE_BAD_PROVIDER: Hresult = 0x80090013u.toInt()

public val NTE_BAD_PROV_TYPE: Hresult = 0x80090014u.toInt()

public val NTE_BAD_PUBLIC_KEY: Hresult = 0x80090015u.toInt()

public val NTE_BAD_SIGNATURE: Hresult = 0x80090006u.toInt()

public val NTE_BAD_TYPE: Hresult = 0x8009000Au.toInt()

public val NTE_BAD_UID: Hresult = 0x80090001u.toInt()

public val NTE_BAD_VER: Hresult = 0x80090007u.toInt()

public val NTE_BUFFERS_OVERLAP: Hresult = 0x8009002Bu.toInt()

public val NTE_BUFFER_TOO_SMALL: Hresult = 0x80090028u.toInt()

public val NTE_DECRYPTION_FAILURE: Hresult = 0x8009002Cu.toInt()

public val NTE_DEVICE_NOT_FOUND: Hresult = 0x80090035u.toInt()

public val NTE_DEVICE_NOT_READY: Hresult = 0x80090030u.toInt()

public val NTE_DOUBLE_ENCRYPT: Hresult = 0x80090012u.toInt()

public val NTE_ENCRYPTION_FAILURE: Hresult = 0x80090034u.toInt()

public val NTE_EXISTS: Hresult = 0x8009000Fu.toInt()

public val NTE_FAIL: Hresult = 0x80090020u.toInt()

public val NTE_FIXEDPARAMETER: Hresult = 0x80090025u.toInt()

public val NTE_HMAC_NOT_SUPPORTED: Hresult = 0x8009002Fu.toInt()

public val NTE_INCORRECT_PASSWORD: Hresult = 0x80090033u.toInt()

public val NTE_INTERNAL_ERROR: Hresult = 0x8009002Du.toInt()

public val NTE_INVALID_HANDLE: Hresult = 0x80090026u.toInt()

public val NTE_INVALID_PARAMETER: Hresult = 0x80090027u.toInt()

public val NTE_KEYSET_ENTRY_BAD: Hresult = 0x8009001Au.toInt()

public val NTE_KEYSET_NOT_DEF: Hresult = 0x80090019u.toInt()

public val NTE_NOT_ACTIVE_CONSOLE: Hresult = 0x80090038u.toInt()

public val NTE_NOT_FOUND: Hresult = 0x80090011u.toInt()

public val NTE_NOT_SUPPORTED: Hresult = 0x80090029u.toInt()

public val NTE_NO_KEY: Hresult = 0x8009000Du.toInt()

public val NTE_NO_MEMORY: Hresult = 0x8009000Eu.toInt()

public val NTE_NO_MORE_ITEMS: Hresult = 0x8009002Au.toInt()

public val NTE_OP_OK: UInt = 0u

public val NTE_PASSWORD_CHANGE_REQUIRED: Hresult = 0x80090037u.toInt()

public val NTE_PERM: Hresult = 0x80090010u.toInt()

public val NTE_PROVIDER_DLL_FAIL: Hresult = 0x8009001Du.toInt()

public val NTE_PROV_DLL_NOT_FOUND: Hresult = 0x8009001Eu.toInt()

public val NTE_PROV_TYPE_ENTRY_BAD: Hresult = 0x80090018u.toInt()

public val NTE_PROV_TYPE_NOT_DEF: Hresult = 0x80090017u.toInt()

public val NTE_PROV_TYPE_NO_MATCH: Hresult = 0x8009001Bu.toInt()

public val NTE_SIGNATURE_FILE_BAD: Hresult = 0x8009001Cu.toInt()

public val NTE_SILENT_CONTEXT: Hresult = 0x80090022u.toInt()

public val NTE_SYS_ERR: Hresult = 0x80090021u.toInt()

public val NTE_TEMPORARY_PROFILE: Hresult = 0x80090024u.toInt()

public val NTE_TOKEN_KEYSET_STORAGE_FULL: Hresult = 0x80090023u.toInt()

public val NTE_UI_REQUIRED: Hresult = 0x8009002Eu.toInt()

public val NTE_USER_CANCELLED: Hresult = 0x80090036u.toInt()

public val NTE_VALIDATION_FAILED: Hresult = 0x80090032u.toInt()

public val OBJ_CASE_INSENSITIVE: ObjectAttributeFlags = 64u

public val OBJ_DONT_REPARSE: ObjectAttributeFlags = 4096u

public val OBJ_EXCLUSIVE: ObjectAttributeFlags = 32u

public val OBJ_FORCE_ACCESS_CHECK: ObjectAttributeFlags = 1024u

public val OBJ_IGNORE_IMPERSONATED_DEVICEMAP: ObjectAttributeFlags = 2048u

public val OBJ_INHERIT: ObjectAttributeFlags = 2u

public val OBJ_KERNEL_HANDLE: ObjectAttributeFlags = 512u

public val OBJ_OPENIF: ObjectAttributeFlags = 128u

public val OBJ_OPENLINK: ObjectAttributeFlags = 256u

public val OBJ_PERMANENT: ObjectAttributeFlags = 16u

public val OBJ_VALID_ATTRIBUTES: ObjectAttributeFlags = 8178u

public val OLEOBJ_E_FIRST: Int = -2147221120

public val OLEOBJ_E_INVALIDVERB: Hresult = 0x80040181u.toInt()

public val OLEOBJ_E_LAST: Int = -2147221105

public val OLEOBJ_E_NOVERBS: Hresult = 0x80040180u.toInt()

public val OLEOBJ_S_CANNOT_DOVERB_NOW: Hresult = 0x40181u.toInt()

public val OLEOBJ_S_FIRST: Int = 262528

public val OLEOBJ_S_INVALIDHWND: Hresult = 0x40182u.toInt()

public val OLEOBJ_S_INVALIDVERB: Hresult = 0x40180u.toInt()

public val OLEOBJ_S_LAST: Int = 262543

public val OLE_E_ADVF: Hresult = 0x80040001u.toInt()

public val OLE_E_ADVISENOTSUPPORTED: Hresult = 0x80040003u.toInt()

public val OLE_E_BLANK: Hresult = 0x80040007u.toInt()

public val OLE_E_CANTCONVERT: Hresult = 0x80040011u.toInt()

public val OLE_E_CANT_BINDTOSOURCE: Hresult = 0x8004000Au.toInt()

public val OLE_E_CANT_GETMONIKER: Hresult = 0x80040009u.toInt()

public val OLE_E_CLASSDIFF: Hresult = 0x80040008u.toInt()

public val OLE_E_ENUM_NOMORE: Hresult = 0x80040002u.toInt()

public val OLE_E_FIRST: Hresult = 0x80040000u.toInt()

public val OLE_E_INVALIDHWND: Hresult = 0x8004000Fu.toInt()

public val OLE_E_INVALIDRECT: Hresult = 0x8004000Du.toInt()

public val OLE_E_LAST: Hresult = 0x800400FFu.toInt()

public val OLE_E_NOCACHE: Hresult = 0x80040006u.toInt()

public val OLE_E_NOCONNECTION: Hresult = 0x80040004u.toInt()

public val OLE_E_NOSTORAGE: Hresult = 0x80040012u.toInt()

public val OLE_E_NOTRUNNING: Hresult = 0x80040005u.toInt()

public val OLE_E_NOT_INPLACEACTIVE: Hresult = 0x80040010u.toInt()

public val OLE_E_OLEVERB: Hresult = 0x80040000u.toInt()

public val OLE_E_PROMPTSAVECANCELLED: Hresult = 0x8004000Cu.toInt()

public val OLE_E_STATIC: Hresult = 0x8004000Bu.toInt()

public val OLE_E_WRONGCOMPOBJ: Hresult = 0x8004000Eu.toInt()

public val OLE_S_FIRST: Hresult = 0x40000u.toInt()

public val OLE_S_LAST: Hresult = 0x400FFu.toInt()

public val OLE_S_MAC_CLIPFORMAT: Hresult = 0x40002u.toInt()

public val OLE_S_STATIC: Hresult = 0x40001u.toInt()

public val OLE_S_USEREG: Hresult = 0x40000u.toInt()

public val ONL_CONNECTION_COUNT_LIMIT: Hresult = 0x8086000Du.toInt()

public val ONL_E_ACCESS_DENIED_BY_TOU: Hresult = 0x80860002u.toInt()

public val ONL_E_ACCOUNT_LOCKED: Hresult = 0x80860007u.toInt()

public val ONL_E_ACCOUNT_SUSPENDED_ABUSE: Hresult = 0x8086000Bu.toInt()

public val ONL_E_ACCOUNT_SUSPENDED_COMPROIMISE: Hresult = 0x8086000Au.toInt()

public val ONL_E_ACCOUNT_UPDATE_REQUIRED: Hresult = 0x80860005u.toInt()

public val ONL_E_ACTION_REQUIRED: Hresult = 0x8086000Cu.toInt()

public val ONL_E_CONNECTED_ACCOUNT_CAN_NOT_SIGNOUT: Hresult = 0x8086000Eu.toInt()

public val ONL_E_EMAIL_VERIFICATION_REQUIRED: Hresult = 0x80860009u.toInt()

public val ONL_E_FORCESIGNIN: Hresult = 0x80860006u.toInt()

public val ONL_E_INVALID_APPLICATION: Hresult = 0x80860003u.toInt()

public val ONL_E_INVALID_AUTHENTICATION_TARGET: Hresult = 0x80860001u.toInt()

public val ONL_E_PARENTAL_CONSENT_REQUIRED: Hresult = 0x80860008u.toInt()

public val ONL_E_PASSWORD_UPDATE_REQUIRED: Hresult = 0x80860004u.toInt()

public val ONL_E_REQUEST_THROTTLED: Hresult = 0x80860010u.toInt()

public val ONL_E_USER_AUTHENTICATION_REQUIRED: Hresult = 0x8086000Fu.toInt()

public val OR_INVALID_OID: Int = 1911

public val OR_INVALID_OXID: Int = 1910

public val OR_INVALID_SET: Int = 1912

public val OSS_ACCESS_SERIALIZATION_ERROR: Hresult = 0x80093013u.toInt()

public val OSS_API_DLL_NOT_LINKED: Hresult = 0x80093029u.toInt()

public val OSS_BAD_ARG: Hresult = 0x80093006u.toInt()

public val OSS_BAD_ENCRULES: Hresult = 0x80093016u.toInt()

public val OSS_BAD_PTR: Hresult = 0x8009300Bu.toInt()

public val OSS_BAD_TABLE: Hresult = 0x8009300Fu.toInt()

public val OSS_BAD_TIME: Hresult = 0x8009300Cu.toInt()

public val OSS_BAD_VERSION: Hresult = 0x80093007u.toInt()

public val OSS_BERDER_DLL_NOT_LINKED: Hresult = 0x8009302Au.toInt()

public val OSS_CANT_CLOSE_TRACE_FILE: Hresult = 0x8009302Eu.toInt()

public val OSS_CANT_OPEN_TRACE_FILE: Hresult = 0x8009301Bu.toInt()

public val OSS_CANT_OPEN_TRACE_WINDOW: Hresult = 0x80093018u.toInt()

public val OSS_COMPARATOR_CODE_NOT_LINKED: Hresult = 0x80093025u.toInt()

public val OSS_COMPARATOR_DLL_NOT_LINKED: Hresult = 0x80093024u.toInt()

public val OSS_CONSTRAINT_DLL_NOT_LINKED: Hresult = 0x80093023u.toInt()

public val OSS_CONSTRAINT_VIOLATED: Hresult = 0x80093011u.toInt()

public val OSS_COPIER_DLL_NOT_LINKED: Hresult = 0x80093022u.toInt()

public val OSS_DATA_ERROR: Hresult = 0x80093005u.toInt()

public val OSS_FATAL_ERROR: Hresult = 0x80093012u.toInt()

public val OSS_INDEFINITE_NOT_SUPPORTED: Hresult = 0x8009300Du.toInt()

public val OSS_LIMITED: Hresult = 0x8009300Au.toInt()

public val OSS_MEM_ERROR: Hresult = 0x8009300Eu.toInt()

public val OSS_MEM_MGR_DLL_NOT_LINKED: Hresult = 0x80093026u.toInt()

public val OSS_MORE_BUF: Hresult = 0x80093001u.toInt()

public val OSS_MORE_INPUT: Hresult = 0x80093004u.toInt()

public val OSS_MUTEX_NOT_CREATED: Hresult = 0x8009302Du.toInt()

public val OSS_NEGATIVE_UINTEGER: Hresult = 0x80093002u.toInt()

public val OSS_NULL_FCN: Hresult = 0x80093015u.toInt()

public val OSS_NULL_TBL: Hresult = 0x80093014u.toInt()

public val OSS_OID_DLL_NOT_LINKED: Hresult = 0x8009301Au.toInt()

public val OSS_OPEN_TYPE_ERROR: Hresult = 0x8009302Cu.toInt()

public val OSS_OUT_MEMORY: Hresult = 0x80093008u.toInt()

public val OSS_OUT_OF_RANGE: Hresult = 0x80093021u.toInt()

public val OSS_PDU_MISMATCH: Hresult = 0x80093009u.toInt()

public val OSS_PDU_RANGE: Hresult = 0x80093003u.toInt()

public val OSS_PDV_CODE_NOT_LINKED: Hresult = 0x80093028u.toInt()

public val OSS_PDV_DLL_NOT_LINKED: Hresult = 0x80093027u.toInt()

public val OSS_PER_DLL_NOT_LINKED: Hresult = 0x8009302Bu.toInt()

public val OSS_REAL_CODE_NOT_LINKED: Hresult = 0x80093020u.toInt()

public val OSS_REAL_DLL_NOT_LINKED: Hresult = 0x8009301Fu.toInt()

public val OSS_TABLE_MISMATCH: Hresult = 0x8009301Du.toInt()

public val OSS_TOO_LONG: Hresult = 0x80093010u.toInt()

public val OSS_TRACE_FILE_ALREADY_OPEN: Hresult = 0x8009301Cu.toInt()

public val OSS_TYPE_NOT_SUPPORTED: Hresult = 0x8009301Eu.toInt()

public val OSS_UNAVAIL_ENCRULES: Hresult = 0x80093017u.toInt()

public val OSS_UNIMPLEMENTED: Hresult = 0x80093019u.toInt()

public val PEERDIST_ERROR_ALREADY_COMPLETED: Int = 4060

public val PEERDIST_ERROR_ALREADY_EXISTS: Int = 4058

public val PEERDIST_ERROR_ALREADY_INITIALIZED: Int = 4055

public val PEERDIST_ERROR_CANNOT_PARSE_CONTENTINFO: Int = 4051

public val PEERDIST_ERROR_CONTENTINFO_VERSION_UNSUPPORTED: Int = 4050

public val PEERDIST_ERROR_INVALIDATED: Int = 4057

public val PEERDIST_ERROR_INVALID_CONFIGURATION: Int = 4063

public val PEERDIST_ERROR_MISSING_DATA: Int = 4052

public val PEERDIST_ERROR_NOT_INITIALIZED: Int = 4054

public val PEERDIST_ERROR_NOT_LICENSED: Int = 4064

public val PEERDIST_ERROR_NO_MORE: Int = 4053

public val PEERDIST_ERROR_OPERATION_NOTFOUND: Int = 4059

public val PEERDIST_ERROR_OUT_OF_BOUNDS: Int = 4061

public val PEERDIST_ERROR_SERVICE_UNAVAILABLE: Int = 4065

public val PEERDIST_ERROR_SHUTDOWN_IN_PROGRESS: Int = 4056

public val PEERDIST_ERROR_TRUST_FAILURE: Int = 4066

public val PEERDIST_ERROR_VERSION_UNSUPPORTED: Int = 4062

public val PEER_E_ALREADY_LISTENING: Hresult = 0x80630107u.toInt()

public val PEER_E_CANNOT_CONVERT_PEER_NAME: Hresult = 0x80634001u.toInt()

public val PEER_E_CANNOT_START_SERVICE: Hresult = 0x80630003u.toInt()

public val PEER_E_CERT_STORE_CORRUPTED: Hresult = 0x80630801u.toInt()

public val PEER_E_CHAIN_TOO_LONG: Hresult = 0x80630703u.toInt()

public val PEER_E_CIRCULAR_CHAIN_DETECTED: Hresult = 0x80630706u.toInt()

public val PEER_E_CLASSIFIER_TOO_LONG: Hresult = 0x80630201u.toInt()

public val PEER_E_CLOUD_NAME_AMBIGUOUS: Hresult = 0x80631005u.toInt()

public val PEER_E_CONNECTION_FAILED: Hresult = 0x80630109u.toInt()

public val PEER_E_CONNECTION_NOT_AUTHENTICATED: Hresult = 0x8063010Au.toInt()

public val PEER_E_CONNECTION_NOT_FOUND: Hresult = 0x80630103u.toInt()

public val PEER_E_CONNECTION_REFUSED: Hresult = 0x8063010Bu.toInt()

public val PEER_E_CONNECT_SELF: Hresult = 0x80630106u.toInt()

public val PEER_E_CONTACT_NOT_FOUND: Hresult = 0x80636001u.toInt()

public val PEER_E_DATABASE_ACCESSDENIED: Hresult = 0x80630302u.toInt()

public val PEER_E_DATABASE_ALREADY_PRESENT: Hresult = 0x80630305u.toInt()

public val PEER_E_DATABASE_NOT_PRESENT: Hresult = 0x80630306u.toInt()

public val PEER_E_DBINITIALIZATION_FAILED: Hresult = 0x80630303u.toInt()

public val PEER_E_DBNAME_CHANGED: Hresult = 0x80630011u.toInt()

public val PEER_E_DEFERRED_VALIDATION: Hresult = 0x80632030u.toInt()

public val PEER_E_DUPLICATE_GRAPH: Hresult = 0x80630012u.toInt()

public val PEER_E_EVENT_HANDLE_NOT_FOUND: Hresult = 0x80630501u.toInt()

public val PEER_E_FW_BLOCKED_BY_POLICY: Hresult = 0x80637009u.toInt()

public val PEER_E_FW_BLOCKED_BY_SHIELDS_UP: Hresult = 0x8063700Au.toInt()

public val PEER_E_FW_DECLINED: Hresult = 0x8063700Bu.toInt()

public val PEER_E_FW_EXCEPTION_DISABLED: Hresult = 0x80637008u.toInt()

public val PEER_E_GRAPH_IN_USE: Hresult = 0x80630015u.toInt()

public val PEER_E_GRAPH_NOT_READY: Hresult = 0x80630013u.toInt()

public val PEER_E_GRAPH_SHUTTING_DOWN: Hresult = 0x80630014u.toInt()

public val PEER_E_GROUPS_EXIST: Hresult = 0x80630204u.toInt()

public val PEER_E_GROUP_IN_USE: Hresult = 0x80632092u.toInt()

public val PEER_E_GROUP_NOT_READY: Hresult = 0x80632091u.toInt()

public val PEER_E_IDENTITY_DELETED: Hresult = 0x806320A0u.toInt()

public val PEER_E_IDENTITY_NOT_FOUND: Hresult = 0x80630401u.toInt()

public val PEER_E_INVALID_ADDRESS: Hresult = 0x80637007u.toInt()

public val PEER_E_INVALID_ATTRIBUTES: Hresult = 0x80630602u.toInt()

public val PEER_E_INVALID_CLASSIFIER: Hresult = 0x80632060u.toInt()

public val PEER_E_INVALID_CLASSIFIER_PROPERTY: Hresult = 0x80632072u.toInt()

public val PEER_E_INVALID_CREDENTIAL: Hresult = 0x80632082u.toInt()

public val PEER_E_INVALID_CREDENTIAL_INFO: Hresult = 0x80632081u.toInt()

public val PEER_E_INVALID_DATABASE: Hresult = 0x80630016u.toInt()

public val PEER_E_INVALID_FRIENDLY_NAME: Hresult = 0x80632070u.toInt()

public val PEER_E_INVALID_GRAPH: Hresult = 0x80630010u.toInt()

public val PEER_E_INVALID_GROUP: Hresult = 0x80632093u.toInt()

public val PEER_E_INVALID_GROUP_PROPERTIES: Hresult = 0x80632040u.toInt()

public val PEER_E_INVALID_PEER_HOST_NAME: Hresult = 0x80634002u.toInt()

public val PEER_E_INVALID_PEER_NAME: Hresult = 0x80632050u.toInt()

public val PEER_E_INVALID_RECORD: Hresult = 0x80632010u.toInt()

public val PEER_E_INVALID_RECORD_EXPIRATION: Hresult = 0x80632080u.toInt()

public val PEER_E_INVALID_RECORD_SIZE: Hresult = 0x80632083u.toInt()

public val PEER_E_INVALID_ROLE_PROPERTY: Hresult = 0x80632071u.toInt()

public val PEER_E_INVALID_SEARCH: Hresult = 0x80630601u.toInt()

public val PEER_E_INVALID_TIME_PERIOD: Hresult = 0x80630705u.toInt()

public val PEER_E_INVITATION_NOT_TRUSTED: Hresult = 0x80630701u.toInt()

public val PEER_E_INVITE_CANCELLED: Hresult = 0x80637000u.toInt()

public val PEER_E_INVITE_RESPONSE_NOT_AVAILABLE: Hresult = 0x80637001u.toInt()

public val PEER_E_IPV6_NOT_INSTALLED: Hresult = 0x80630001u.toInt()

public val PEER_E_MAX_RECORD_SIZE_EXCEEDED: Hresult = 0x80630304u.toInt()

public val PEER_E_NODE_NOT_FOUND: Hresult = 0x80630108u.toInt()

public val PEER_E_NOT_AUTHORIZED: Hresult = 0x80632020u.toInt()

public val PEER_E_NOT_INITIALIZED: Hresult = 0x80630002u.toInt()

public val PEER_E_NOT_LICENSED: Hresult = 0x80630004u.toInt()

public val PEER_E_NOT_SIGNED_IN: Hresult = 0x80637003u.toInt()

public val PEER_E_NO_CLOUD: Hresult = 0x80631001u.toInt()

public val PEER_E_NO_KEY_ACCESS: Hresult = 0x80630203u.toInt()

public val PEER_E_NO_MEMBERS_FOUND: Hresult = 0x80632094u.toInt()

public val PEER_E_NO_MEMBER_CONNECTIONS: Hresult = 0x80632095u.toInt()

public val PEER_E_NO_MORE: Hresult = 0x80634003u.toInt()

public val PEER_E_PASSWORD_DOES_NOT_MEET_POLICY: Hresult = 0x80632021u.toInt()

public val PEER_E_PNRP_DUPLICATE_PEER_NAME: Hresult = 0x80634005u.toInt()

public val PEER_E_PRIVACY_DECLINED: Hresult = 0x80637004u.toInt()

public val PEER_E_RECORD_NOT_FOUND: Hresult = 0x80630301u.toInt()

public val PEER_E_SERVICE_NOT_AVAILABLE: Hresult = 0x806320A1u.toInt()

public val PEER_E_TIMEOUT: Hresult = 0x80637005u.toInt()

public val PEER_E_TOO_MANY_ATTRIBUTES: Hresult = 0x80630017u.toInt()

public val PEER_E_TOO_MANY_IDENTITIES: Hresult = 0x80630202u.toInt()

public val PEER_E_UNABLE_TO_LISTEN: Hresult = 0x80632096u.toInt()

public val PEER_E_UNSUPPORTED_VERSION: Hresult = 0x80632090u.toInt()

public val PEER_S_ALREADY_A_MEMBER: Hresult = 0x630006u.toInt()

public val PEER_S_ALREADY_CONNECTED: Hresult = 0x632000u.toInt()

public val PEER_S_GRAPH_DATA_CREATED: Hresult = 0x630001u.toInt()

public val PEER_S_NO_CONNECTIVITY: Hresult = 0x630005u.toInt()

public val PEER_S_NO_EVENT_DATA: Hresult = 0x630002u.toInt()

public val PEER_S_SUBSCRIPTION_EXISTS: Hresult = 0x636000u.toInt()

public val PERSIST_E_NOTSELFSIZING: Hresult = 0x800B000Bu.toInt()

public val PERSIST_E_SIZEDEFINITE: Hresult = 0x800B0009u.toInt()

public val PERSIST_E_SIZEINDEFINITE: Hresult = 0x800B000Au.toInt()

public val PLA_E_CABAPI_FAILURE: Hresult = 0x80300113u.toInt()

public val PLA_E_CONFLICT_INCL_EXCL_API: Hresult = 0x80300105u.toInt()

public val PLA_E_CREDENTIALS_REQUIRED: Hresult = 0x80300103u.toInt()

public val PLA_E_DCS_ALREADY_EXISTS: Hresult = 0x803000B7u.toInt()

public val PLA_E_DCS_IN_USE: Hresult = 0x803000AAu.toInt()

public val PLA_E_DCS_NOT_FOUND: Hresult = 0x80300002u.toInt()

public val PLA_E_DCS_NOT_RUNNING: Hresult = 0x80300104u.toInt()

public val PLA_E_DCS_SINGLETON_REQUIRED: Hresult = 0x80300102u.toInt()

public val PLA_E_DCS_START_WAIT_TIMEOUT: Hresult = 0x8030010Au.toInt()

public val PLA_E_DC_ALREADY_EXISTS: Hresult = 0x80300109u.toInt()

public val PLA_E_DC_START_WAIT_TIMEOUT: Hresult = 0x8030010Bu.toInt()

public val PLA_E_EXE_ALREADY_CONFIGURED: Hresult = 0x80300107u.toInt()

public val PLA_E_EXE_FULL_PATH_REQUIRED: Hresult = 0x8030010Eu.toInt()

public val PLA_E_EXE_PATH_NOT_VALID: Hresult = 0x80300108u.toInt()

public val PLA_E_INVALID_SESSION_NAME: Hresult = 0x8030010Fu.toInt()

public val PLA_E_NETWORK_EXE_NOT_VALID: Hresult = 0x80300106u.toInt()

public val PLA_E_NO_DUPLICATES: Hresult = 0x8030010Du.toInt()

public val PLA_E_NO_MIN_DISK: Hresult = 0x80300070u.toInt()

public val PLA_E_PLA_CHANNEL_NOT_ENABLED: Hresult = 0x80300110u.toInt()

public val PLA_E_PROPERTY_CONFLICT: Hresult = 0x80300101u.toInt()

public val PLA_E_REPORT_WAIT_TIMEOUT: Hresult = 0x8030010Cu.toInt()

public val PLA_E_RULES_MANAGER_FAILED: Hresult = 0x80300112u.toInt()

public val PLA_E_TASKSCHED_CHANNEL_NOT_ENABLED: Hresult = 0x80300111u.toInt()

public val PLA_E_TOO_MANY_FOLDERS: Hresult = 0x80300045u.toInt()

public val PLA_S_PROPERTY_IGNORED: Hresult = 0x300100u.toInt()

public val PRESENTATION_ERROR_LOST: Hresult = 0x88810001u.toInt()

public val PSINK_E_INDEX_ONLY: Hresult = 0x80041791u.toInt()

public val PSINK_E_LARGE_ATTACHMENT: Hresult = 0x80041792u.toInt()

public val PSINK_E_QUERY_ONLY: Hresult = 0x80041790u.toInt()

public val PSINK_S_LARGE_WORD: Hresult = 0x41793u.toInt()

public val QPARSE_E_EXPECTING_BRACE: Hresult = 0x80041666u.toInt()

public val QPARSE_E_EXPECTING_COMMA: Hresult = 0x80041671u.toInt()

public val QPARSE_E_EXPECTING_CURRENCY: Hresult = 0x80041664u.toInt()

public val QPARSE_E_EXPECTING_DATE: Hresult = 0x80041663u.toInt()

public val QPARSE_E_EXPECTING_EOS: Hresult = 0x80041670u.toInt()

public val QPARSE_E_EXPECTING_GUID: Hresult = 0x80041665u.toInt()

public val QPARSE_E_EXPECTING_INTEGER: Hresult = 0x80041661u.toInt()

public val QPARSE_E_EXPECTING_PAREN: Hresult = 0x80041667u.toInt()

public val QPARSE_E_EXPECTING_PHRASE: Hresult = 0x8004166Au.toInt()

public val QPARSE_E_EXPECTING_PROPERTY: Hresult = 0x80041668u.toInt()

public val QPARSE_E_EXPECTING_REAL: Hresult = 0x80041662u.toInt()

public val QPARSE_E_EXPECTING_REGEX: Hresult = 0x8004166Cu.toInt()

public val QPARSE_E_EXPECTING_REGEX_PROPERTY: Hresult = 0x8004166Du.toInt()

public val QPARSE_E_INVALID_GROUPING: Hresult = 0x80041677u.toInt()

public val QPARSE_E_INVALID_LITERAL: Hresult = 0x8004166Eu.toInt()

public val QPARSE_E_INVALID_QUERY: Hresult = 0x8004167Au.toInt()

public val QPARSE_E_INVALID_RANKMETHOD: Hresult = 0x8004167Bu.toInt()

public val QPARSE_E_INVALID_SORT_ORDER: Hresult = 0x80041675u.toInt()

public val QPARSE_E_NOT_YET_IMPLEMENTED: Hresult = 0x80041669u.toInt()

public val QPARSE_E_NO_SUCH_PROPERTY: Hresult = 0x8004166Fu.toInt()

public val QPARSE_E_NO_SUCH_SORT_PROPERTY: Hresult = 0x80041674u.toInt()

public val QPARSE_E_UNEXPECTED_EOS: Hresult = 0x80041672u.toInt()

public val QPARSE_E_UNEXPECTED_NOT: Hresult = 0x80041660u.toInt()

public val QPARSE_E_UNSUPPORTED_PROPERTY_TYPE: Hresult = 0x8004166Bu.toInt()

public val QPARSE_E_WEIGHT_OUT_OF_RANGE: Hresult = 0x80041673u.toInt()

public val QPLIST_E_BAD_GUID: Hresult = 0x80041659u.toInt()

public val QPLIST_E_BYREF_USED_WITHOUT_PTRTYPE: Hresult = 0x8004165Eu.toInt()

public val QPLIST_E_CANT_OPEN_FILE: Hresult = 0x80041651u.toInt()

public val QPLIST_E_CANT_SET_PROPERTY: Hresult = 0x8004165Bu.toInt()

public val QPLIST_E_DUPLICATE: Hresult = 0x8004165Cu.toInt()

public val QPLIST_E_EXPECTING_CLOSE_PAREN: Hresult = 0x80041657u.toInt()

public val QPLIST_E_EXPECTING_GUID: Hresult = 0x80041658u.toInt()

public val QPLIST_E_EXPECTING_INTEGER: Hresult = 0x80041656u.toInt()

public val QPLIST_E_EXPECTING_NAME: Hresult = 0x80041653u.toInt()

public val QPLIST_E_EXPECTING_PROP_SPEC: Hresult = 0x8004165Au.toInt()

public val QPLIST_E_EXPECTING_TYPE: Hresult = 0x80041654u.toInt()

public val QPLIST_E_READ_ERROR: Hresult = 0x80041652u.toInt()

public val QPLIST_E_UNRECOGNIZED_TYPE: Hresult = 0x80041655u.toInt()

public val QPLIST_E_VECTORBYREF_USED_ALONE: Hresult = 0x8004165Du.toInt()

public val QPLIST_S_DUPLICATE: Hresult = 0x41679u.toInt()

public val QUERY_E_ALLNOISE: Hresult = 0x80041605u.toInt()

public val QUERY_E_DIR_ON_REMOVABLE_DRIVE: Hresult = 0x8004160Bu.toInt()

public val QUERY_E_DUPLICATE_OUTPUT_COLUMN: Hresult = 0x80041608u.toInt()

public val QUERY_E_FAILED: Hresult = 0x80041600u.toInt()

public val QUERY_E_INVALIDCATEGORIZE: Hresult = 0x80041604u.toInt()

public val QUERY_E_INVALIDQUERY: Hresult = 0x80041601u.toInt()

public val QUERY_E_INVALIDRESTRICTION: Hresult = 0x80041602u.toInt()

public val QUERY_E_INVALIDSORT: Hresult = 0x80041603u.toInt()

public val QUERY_E_INVALID_DIRECTORY: Hresult = 0x8004160Au.toInt()

public val QUERY_E_INVALID_OUTPUT_COLUMN: Hresult = 0x80041609u.toInt()

public val QUERY_E_TIMEDOUT: Hresult = 0x80041607u.toInt()

public val QUERY_E_TOOCOMPLEX: Hresult = 0x80041606u.toInt()

public val QUERY_S_NO_QUERY: Hresult = 0x8004160Cu.toInt()

public val QUTIL_E_CANT_CONVERT_VROOT: Hresult = 0x80041676u.toInt()

public val QUTIL_E_INVALID_CODEPAGE: Hresult = 0xC0041678u.toInt()

public val REGDB_E_BADTHREADINGMODEL: Hresult = 0x80040156u.toInt()

public val REGDB_E_CLASSNOTREG: Hresult = 0x80040154u.toInt()

public val REGDB_E_FIRST: Int = -2147221168

public val REGDB_E_IIDNOTREG: Hresult = 0x80040155u.toInt()

public val REGDB_E_INVALIDVALUE: Hresult = 0x80040153u.toInt()

public val REGDB_E_KEYMISSING: Hresult = 0x80040152u.toInt()

public val REGDB_E_LAST: Int = -2147221153

public val REGDB_E_PACKAGEPOLICYVIOLATION: Hresult = 0x80040157u.toInt()

public val REGDB_E_READREGDB: Hresult = 0x80040150u.toInt()

public val REGDB_E_WRITEREGDB: Hresult = 0x80040151u.toInt()

public val REGDB_S_FIRST: Int = 262480

public val REGDB_S_LAST: Int = 262495

public val ROUTEBASE: UInt = 900u

public val ROUTEBASEEND: UInt = 957u

public val RO_E_BLOCKED_CROSS_ASTA_CALL: Hresult = 0x8000001Fu.toInt()

public val RO_E_CANNOT_ACTIVATE_FULL_TRUST_SERVER: Hresult = 0x80000020u.toInt()

public val RO_E_CANNOT_ACTIVATE_UNIVERSAL_APPLICATION_SERVER: Hresult = 0x80000021u.toInt()

public val RO_E_CHANGE_NOTIFICATION_IN_PROGRESS: Hresult = 0x80000015u.toInt()

public val RO_E_CLOSED: Hresult = 0x80000013u.toInt()

public val RO_E_COMMITTED: Hresult = 0x8000001Eu.toInt()

public val RO_E_ERROR_STRING_NOT_FOUND: Hresult = 0x80000016u.toInt()

public val RO_E_EXCLUSIVE_WRITE: Hresult = 0x80000014u.toInt()

public val RO_E_INVALID_METADATA_FILE: Hresult = 0x80000012u.toInt()

public val RO_E_METADATA_INVALID_TYPE_FORMAT: Hresult = 0x80000011u.toInt()

public val RO_E_METADATA_NAME_IS_NAMESPACE: Hresult = 0x80000010u.toInt()

public val RO_E_METADATA_NAME_NOT_FOUND: Hresult = 0x8000000Fu.toInt()

public val RO_E_MUST_BE_AGILE: Hresult = 0x8000001Cu.toInt()

public val RO_E_UNSUPPORTED_FROM_MTA: Hresult = 0x8000001Du.toInt()

public val RPC_E_ACCESS_DENIED: Hresult = 0x8001011Bu.toInt()

public val RPC_E_ATTEMPTED_MULTITHREAD: Hresult = 0x80010102u.toInt()

public val RPC_E_CALL_CANCELED: Hresult = 0x80010002u.toInt()

public val RPC_E_CALL_COMPLETE: Hresult = 0x80010117u.toInt()

public val RPC_E_CALL_REJECTED: Hresult = 0x80010001u.toInt()

public val RPC_E_CANTCALLOUT_AGAIN: Hresult = 0x80010011u.toInt()

public val RPC_E_CANTCALLOUT_INASYNCCALL: Hresult = 0x80010004u.toInt()

public val RPC_E_CANTCALLOUT_INEXTERNALCALL: Hresult = 0x80010005u.toInt()

public val RPC_E_CANTCALLOUT_ININPUTSYNCCALL: Hresult = 0x8001010Du.toInt()

public val RPC_E_CANTPOST_INSENDCALL: Hresult = 0x80010003u.toInt()

public val RPC_E_CANTTRANSMIT_CALL: Hresult = 0x8001000Au.toInt()

public val RPC_E_CHANGED_MODE: Hresult = 0x80010106u.toInt()

public val RPC_E_CLIENT_CANTMARSHAL_DATA: Hresult = 0x8001000Bu.toInt()

public val RPC_E_CLIENT_CANTUNMARSHAL_DATA: Hresult = 0x8001000Cu.toInt()

public val RPC_E_CLIENT_DIED: Hresult = 0x80010008u.toInt()

public val RPC_E_CONNECTION_TERMINATED: Hresult = 0x80010006u.toInt()

public val RPC_E_DISCONNECTED: Hresult = 0x80010108u.toInt()

public val RPC_E_FAULT: Hresult = 0x80010104u.toInt()

public val RPC_E_FULLSIC_REQUIRED: Hresult = 0x80010121u.toInt()

public val RPC_E_INVALIDMETHOD: Hresult = 0x80010107u.toInt()

public val RPC_E_INVALID_CALLDATA: Hresult = 0x8001010Cu.toInt()

public val RPC_E_INVALID_DATA: Hresult = 0x8001000Fu.toInt()

public val RPC_E_INVALID_DATAPACKET: Hresult = 0x80010009u.toInt()

public val RPC_E_INVALID_EXTENSION: Hresult = 0x80010112u.toInt()

public val RPC_E_INVALID_HEADER: Hresult = 0x80010111u.toInt()

public val RPC_E_INVALID_IPID: Hresult = 0x80010113u.toInt()

public val RPC_E_INVALID_OBJECT: Hresult = 0x80010114u.toInt()

public val RPC_E_INVALID_OBJREF: Hresult = 0x8001011Du.toInt()

public val RPC_E_INVALID_PARAMETER: Hresult = 0x80010010u.toInt()

public val RPC_E_INVALID_STD_NAME: Hresult = 0x80010122u.toInt()

public val RPC_E_NOT_REGISTERED: Hresult = 0x80010103u.toInt()

public val RPC_E_NO_CONTEXT: Hresult = 0x8001011Eu.toInt()

public val RPC_E_NO_GOOD_SECURITY_PACKAGES: Hresult = 0x8001011Au.toInt()

public val RPC_E_NO_SYNC: Hresult = 0x80010120u.toInt()

public val RPC_E_OUT_OF_RESOURCES: Hresult = 0x80010101u.toInt()

public val RPC_E_REMOTE_DISABLED: Hresult = 0x8001011Cu.toInt()

public val RPC_E_RETRY: Hresult = 0x80010109u.toInt()

public val RPC_E_SERVERCALL_REJECTED: Hresult = 0x8001010Bu.toInt()

public val RPC_E_SERVERCALL_RETRYLATER: Hresult = 0x8001010Au.toInt()

public val RPC_E_SERVERFAULT: Hresult = 0x80010105u.toInt()

public val RPC_E_SERVER_CANTMARSHAL_DATA: Hresult = 0x8001000Du.toInt()

public val RPC_E_SERVER_CANTUNMARSHAL_DATA: Hresult = 0x8001000Eu.toInt()

public val RPC_E_SERVER_DIED: Hresult = 0x80010007u.toInt()

public val RPC_E_SERVER_DIED_DNE: Hresult = 0x80010012u.toInt()

public val RPC_E_SYS_CALL_FAILED: Hresult = 0x80010100u.toInt()

public val RPC_E_THREAD_NOT_INIT: Hresult = 0x8001010Fu.toInt()

public val RPC_E_TIMEOUT: Hresult = 0x8001011Fu.toInt()

public val RPC_E_TOO_LATE: Hresult = 0x80010119u.toInt()

public val RPC_E_UNEXPECTED: Hresult = 0x8001FFFFu.toInt()

public val RPC_E_UNSECURE_CALL: Hresult = 0x80010118u.toInt()

public val RPC_E_VERSION_MISMATCH: Hresult = 0x80010110u.toInt()

public val RPC_E_WRONG_THREAD: Hresult = 0x8001010Eu.toInt()

public val RPC_NT_ADDRESS_ERROR: Ntstatus = 0xC0020045u.toInt()

public val RPC_NT_ALREADY_LISTENING: Ntstatus = 0xC002000Eu.toInt()

public val RPC_NT_ALREADY_REGISTERED: Ntstatus = 0xC002000Cu.toInt()

public val RPC_NT_BAD_STUB_DATA: Ntstatus = 0xC003000Cu.toInt()

public val RPC_NT_BINDING_HAS_NO_AUTH: Ntstatus = 0xC002002Fu.toInt()

public val RPC_NT_BINDING_INCOMPLETE: Ntstatus = 0xC0020051u.toInt()

public val RPC_NT_BYTE_COUNT_TOO_SMALL: Ntstatus = 0xC003000Bu.toInt()

public val RPC_NT_CALL_CANCELLED: Ntstatus = 0xC0020050u.toInt()

public val RPC_NT_CALL_FAILED: Ntstatus = 0xC002001Bu.toInt()

public val RPC_NT_CALL_FAILED_DNE: Ntstatus = 0xC002001Cu.toInt()

public val RPC_NT_CALL_IN_PROGRESS: Ntstatus = 0xC0020049u.toInt()

public val RPC_NT_CANNOT_SUPPORT: Ntstatus = 0xC0020041u.toInt()

public val RPC_NT_CANT_CREATE_ENDPOINT: Ntstatus = 0xC0020015u.toInt()

public val RPC_NT_COMM_FAILURE: Ntstatus = 0xC0020052u.toInt()

public val RPC_NT_COOKIE_AUTH_FAILED: Ntstatus = 0xC0020065u.toInt()

public val RPC_NT_DUPLICATE_ENDPOINT: Ntstatus = 0xC0020029u.toInt()

public val RPC_NT_ENTRY_ALREADY_EXISTS: Ntstatus = 0xC002003Du.toInt()

public val RPC_NT_ENTRY_NOT_FOUND: Ntstatus = 0xC002003Eu.toInt()

public val RPC_NT_ENUM_VALUE_OUT_OF_RANGE: Ntstatus = 0xC003000Au.toInt()

public val RPC_NT_FP_DIV_ZERO: Ntstatus = 0xC0020046u.toInt()

public val RPC_NT_FP_OVERFLOW: Ntstatus = 0xC0020048u.toInt()

public val RPC_NT_FP_UNDERFLOW: Ntstatus = 0xC0020047u.toInt()

public val RPC_NT_GROUP_MEMBER_NOT_FOUND: Ntstatus = 0xC002004Bu.toInt()

public val RPC_NT_INCOMPLETE_NAME: Ntstatus = 0xC0020038u.toInt()

public val RPC_NT_INTERFACE_NOT_FOUND: Ntstatus = 0xC002003Cu.toInt()

public val RPC_NT_INTERNAL_ERROR: Ntstatus = 0xC0020043u.toInt()

public val RPC_NT_INVALID_ASYNC_CALL: Ntstatus = 0xC0020063u.toInt()

public val RPC_NT_INVALID_ASYNC_HANDLE: Ntstatus = 0xC0020062u.toInt()

public val RPC_NT_INVALID_AUTH_IDENTITY: Ntstatus = 0xC0020032u.toInt()

public val RPC_NT_INVALID_BINDING: Ntstatus = 0xC0020003u.toInt()

public val RPC_NT_INVALID_BOUND: Ntstatus = 0xC0020023u.toInt()

public val RPC_NT_INVALID_ENDPOINT_FORMAT: Ntstatus = 0xC0020007u.toInt()

public val RPC_NT_INVALID_ES_ACTION: Ntstatus = 0xC0030059u.toInt()

public val RPC_NT_INVALID_NAF_ID: Ntstatus = 0xC0020040u.toInt()

public val RPC_NT_INVALID_NAME_SYNTAX: Ntstatus = 0xC0020025u.toInt()

public val RPC_NT_INVALID_NETWORK_OPTIONS: Ntstatus = 0xC0020019u.toInt()

public val RPC_NT_INVALID_NET_ADDR: Ntstatus = 0xC0020008u.toInt()

public val RPC_NT_INVALID_OBJECT: Ntstatus = 0xC002004Du.toInt()

public val RPC_NT_INVALID_PIPE_OBJECT: Ntstatus = 0xC003005Cu.toInt()

public val RPC_NT_INVALID_PIPE_OPERATION: Ntstatus = 0xC003005Du.toInt()

public val RPC_NT_INVALID_RPC_PROTSEQ: Ntstatus = 0xC0020005u.toInt()

public val RPC_NT_INVALID_STRING_BINDING: Ntstatus = 0xC0020001u.toInt()

public val RPC_NT_INVALID_STRING_UUID: Ntstatus = 0xC0020006u.toInt()

public val RPC_NT_INVALID_TAG: Ntstatus = 0xC0020022u.toInt()

public val RPC_NT_INVALID_TIMEOUT: Ntstatus = 0xC002000Au.toInt()

public val RPC_NT_INVALID_VERS_OPTION: Ntstatus = 0xC0020039u.toInt()

public val RPC_NT_MAX_CALLS_TOO_SMALL: Ntstatus = 0xC002002Bu.toInt()

public val RPC_NT_NAME_SERVICE_UNAVAILABLE: Ntstatus = 0xC002003Fu.toInt()

public val RPC_NT_NOTHING_TO_EXPORT: Ntstatus = 0xC0020037u.toInt()

public val RPC_NT_NOT_ALL_OBJS_UNEXPORTED: Ntstatus = 0xC002003Bu.toInt()

public val RPC_NT_NOT_CANCELLED: Ntstatus = 0xC0020058u.toInt()

public val RPC_NT_NOT_LISTENING: Ntstatus = 0xC0020010u.toInt()

public val RPC_NT_NOT_RPC_ERROR: Ntstatus = 0xC0020055u.toInt()

public val RPC_NT_NO_BINDINGS: Ntstatus = 0xC0020013u.toInt()

public val RPC_NT_NO_CALL_ACTIVE: Ntstatus = 0xC002001Au.toInt()

public val RPC_NT_NO_CONTEXT_AVAILABLE: Ntstatus = 0xC0020042u.toInt()

public val RPC_NT_NO_ENDPOINT_FOUND: Ntstatus = 0xC0020009u.toInt()

public val RPC_NT_NO_ENTRY_NAME: Ntstatus = 0xC0020024u.toInt()

public val RPC_NT_NO_INTERFACES: Ntstatus = 0xC002004Fu.toInt()

public val RPC_NT_NO_MORE_BINDINGS: Ntstatus = 0xC002004Au.toInt()

public val RPC_NT_NO_MORE_ENTRIES: Ntstatus = 0xC0030001u.toInt()

public val RPC_NT_NO_MORE_MEMBERS: Ntstatus = 0xC002003Au.toInt()

public val RPC_NT_NO_PRINC_NAME: Ntstatus = 0xC0020054u.toInt()

public val RPC_NT_NO_PROTSEQS: Ntstatus = 0xC0020014u.toInt()

public val RPC_NT_NO_PROTSEQS_REGISTERED: Ntstatus = 0xC002000Fu.toInt()

public val RPC_NT_NULL_REF_POINTER: Ntstatus = 0xC0030009u.toInt()

public val RPC_NT_OBJECT_NOT_FOUND: Ntstatus = 0xC002000Bu.toInt()

public val RPC_NT_OUT_OF_RESOURCES: Ntstatus = 0xC0020016u.toInt()

public val RPC_NT_PIPE_CLOSED: Ntstatus = 0xC003005Fu.toInt()

public val RPC_NT_PIPE_DISCIPLINE_ERROR: Ntstatus = 0xC0030060u.toInt()
