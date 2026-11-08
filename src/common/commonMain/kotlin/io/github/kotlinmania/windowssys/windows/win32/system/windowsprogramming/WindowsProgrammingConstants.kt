package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val AADBE_ADD_ENTRY: UInt = 1u

public val AADBE_DEL_ENTRY: UInt = 2u

public val ACTCTX_FLAG_APPLICATION_NAME_VALID: UInt = 32u

public val ACTCTX_FLAG_ASSEMBLY_DIRECTORY_VALID: UInt = 4u

public val ACTCTX_FLAG_HMODULE_VALID: UInt = 128u

public val ACTCTX_FLAG_LANGID_VALID: UInt = 2u

public val ACTCTX_FLAG_PROCESSOR_ARCHITECTURE_VALID: UInt = 1u

public val ACTCTX_FLAG_RESOURCE_NAME_VALID: UInt = 8u

public val ACTCTX_FLAG_SET_PROCESS_DEFAULT: UInt = 16u

public val ACTCTX_FLAG_SOURCE_IS_ASSEMBLYREF: UInt = 64u

public val ACTIVATION_CONTEXT_BASIC_INFORMATION_DEFINED: UInt = 1u

public val AC_LINE_BACKUP_POWER: UInt = 2u

public val AC_LINE_OFFLINE: UInt = 0u

public val AC_LINE_ONLINE: UInt = 1u

public val AC_LINE_UNKNOWN: UInt = 255u

public val ADN_DEL_IF_EMPTY: UInt = 1u

public val ADN_DEL_UNC_PATHS: UInt = 8u

public val ADN_DONT_DEL_DIR: UInt = 4u

public val ADN_DONT_DEL_SUBDIRS: UInt = 2u

public val AFSR_BACKNEW: UInt = 2u

public val AFSR_EXTRAINCREFCNT: UInt = 2048u

public val AFSR_NODELETENEW: UInt = 4u

public val AFSR_NOMESSAGES: UInt = 8u

public val AFSR_NOPROGRESS: UInt = 16u

public val AFSR_RESTORE: UInt = 1u

public val AFSR_UPDREFCNT: UInt = 512u

public val AFSR_USEREFCNT: UInt = 1024u

public val AIF_FORCE_FILE_IN_USE: UInt = 8u

public val AIF_NOLANGUAGECHECK: UInt = 268435456u

public val AIF_NOOVERWRITE: UInt = 16u

public val AIF_NOSKIP: UInt = 2u

public val AIF_NOVERSIONCHECK: UInt = 4u

public val AIF_NO_VERSION_DIALOG: UInt = 32u

public val AIF_QUIET: UInt = 536870912u

public val AIF_REPLACEONLY: UInt = 1024u

public val AIF_WARNIFSKIP: UInt = 1u

public val ALINF_BKINSTALL: UInt = 32u

public val ALINF_CHECKBKDATA: UInt = 128u

public val ALINF_DELAYREGISTEROCX: UInt = 512u

public val ALINF_NGCONV: UInt = 8u

public val ALINF_QUIET: UInt = 4u

public val ALINF_ROLLBACK: UInt = 64u

public val ALINF_ROLLBKDOALL: UInt = 256u

public val ALINF_UPDHLPDLLS: UInt = 16u

public val ARSR_NOMESSAGES: UInt = 8u

public val ARSR_REGSECTION: UInt = 128u

public val ARSR_REMOVREGBKDATA: UInt = 4096u

public val ARSR_RESTORE: UInt = 1u

public val ATOM_FLAG_GLOBAL: UInt = 2u

public val AT_ARP: UInt = 640u

public val AT_ENTITY: TDIENTITY_ENTITY_TYPE = 640u

public val AT_NULL: UInt = 642u

public val BACKUP_GHOSTED_FILE_EXTENTS: UInt = 11u

public val BACKUP_INVALID: UInt = 0u

public val BASE_SEARCH_PATH_DISABLE_SAFE_SEARCHMODE: UInt = 65536u

public val BASE_SEARCH_PATH_ENABLE_SAFE_SEARCHMODE: UInt = 1u

public val BASE_SEARCH_PATH_PERMANENT: UInt = 32768u

public val BATTERY_FLAG_CHARGING: UInt = 8u

public val BATTERY_FLAG_CRITICAL: UInt = 4u

public val BATTERY_FLAG_HIGH: UInt = 1u

public val BATTERY_FLAG_LOW: UInt = 2u

public val BATTERY_FLAG_NO_BATTERY: UInt = 128u

public val BATTERY_FLAG_UNKNOWN: UInt = 255u

public val BATTERY_LIFE_UNKNOWN: UInt = 4294967295u

public val BATTERY_PERCENTAGE_UNKNOWN: UInt = 255u

public val BAUD_075: UInt = 1u

public val BAUD_110: UInt = 2u

public val BAUD_115200: UInt = 131072u

public val BAUD_1200: UInt = 64u

public val BAUD_128K: UInt = 65536u

public val BAUD_134_5: UInt = 4u

public val BAUD_14400: UInt = 4096u

public val BAUD_150: UInt = 8u

public val BAUD_1800: UInt = 128u

public val BAUD_19200: UInt = 8192u

public val BAUD_2400: UInt = 256u

public val BAUD_300: UInt = 16u

public val BAUD_38400: UInt = 16384u

public val BAUD_4800: UInt = 512u

public val BAUD_56K: UInt = 32768u

public val BAUD_57600: UInt = 262144u

public val BAUD_600: UInt = 32u

public val BAUD_7200: UInt = 1024u

public val BAUD_9600: UInt = 2048u

public val BAUD_USER: UInt = 268435456u

public val CATID_DeleteBrowsingHistory: GUID = GUID.from_u128(U128(0x31caf6e4d6aa4090uL, 0xa050a5ac8972e9efuL))

public val CBR_110: UInt = 110u

public val CBR_115200: UInt = 115200u

public val CBR_1200: UInt = 1200u

public val CBR_128000: UInt = 128000u

public val CBR_14400: UInt = 14400u

public val CBR_19200: UInt = 19200u

public val CBR_2400: UInt = 2400u

public val CBR_256000: UInt = 256000u

public val CBR_300: UInt = 300u

public val CBR_38400: UInt = 38400u

public val CBR_4800: UInt = 4800u

public val CBR_56000: UInt = 56000u

public val CBR_57600: UInt = 57600u

public val CBR_600: UInt = 600u

public val CBR_9600: UInt = 9600u

public val CE_DNS: UInt = 2048u

public val CE_IOE: UInt = 1024u

public val CE_MODE: UInt = 32768u

public val CE_OOP: UInt = 4096u

public val CE_PTO: UInt = 512u

public val CE_TXFULL: UInt = 256u

public val CL_NL_ENTITY: TDIENTITY_ENTITY_TYPE = 769u

public val CL_NL_IP: UInt = 771u

public val CL_NL_IPX: UInt = 769u

public val CL_TL_ENTITY: TDIENTITY_ENTITY_TYPE = 1025u

public val CL_TL_NBF: UInt = 1025u

public val CL_TL_UDP: UInt = 1027u

public val CODEINTEGRITY_OPTION_DEBUGMODE_ENABLED: UInt = 128u

public val CODEINTEGRITY_OPTION_ENABLED: UInt = 1u

public val CODEINTEGRITY_OPTION_FLIGHTING_ENABLED: UInt = 512u

public val CODEINTEGRITY_OPTION_FLIGHT_BUILD: UInt = 256u

public val CODEINTEGRITY_OPTION_HVCI_IUM_ENABLED: UInt = 8192u

public val CODEINTEGRITY_OPTION_HVCI_KMCI_AUDITMODE_ENABLED: UInt = 2048u

public val CODEINTEGRITY_OPTION_HVCI_KMCI_ENABLED: UInt = 1024u

public val CODEINTEGRITY_OPTION_HVCI_KMCI_STRICTMODE_ENABLED: UInt = 4096u

public val CODEINTEGRITY_OPTION_PREPRODUCTION_BUILD: UInt = 64u

public val CODEINTEGRITY_OPTION_TESTSIGN: UInt = 2u

public val CODEINTEGRITY_OPTION_TEST_BUILD: UInt = 32u

public val CODEINTEGRITY_OPTION_UMCI_AUDITMODE_ENABLED: UInt = 8u

public val CODEINTEGRITY_OPTION_UMCI_ENABLED: UInt = 4u

public val CODEINTEGRITY_OPTION_UMCI_EXCLUSIONPATHS_ENABLED: UInt = 16u

public val COMMPROP_INITIALIZED: UInt = 3879531822u

public val CONTEXT_SIZE: UInt = 16u

public val CO_NL_ENTITY: TDIENTITY_ENTITY_TYPE = 768u

public val CO_TL_ENTITY: TDIENTITY_ENTITY_TYPE = 1024u

public val CO_TL_NBF: UInt = 1024u

public val CO_TL_SPP: UInt = 1030u

public val CO_TL_SPX: UInt = 1026u

public val CO_TL_TCP: UInt = 1028u

public val CP_DIRECT: UInt = 2u

public val CP_HWND: UInt = 0u

public val CP_LEVEL: UInt = 3u

public val CP_OPEN: UInt = 1u

public val CREATE_FOR_DIR: UInt = 2u

public val CREATE_FOR_IMPORT: UInt = 1u

public val CRITICAL_SECTION_NO_DEBUG_INFO: UInt = 16777216u

public val CameraUIControl: GUID = GUID.from_u128(U128(0x16d5a2beb1c547b3uL, 0x8eaeccbcf452c7e8uL))

public val DCICREATEOFFSCREENSURFACE: UInt = 2u

public val DCICREATEOVERLAYSURFACE: UInt = 3u

public val DCICREATEPRIMARYSURFACE: UInt = 1u

public val DCIENUMSURFACE: UInt = 4u

public val DCIESCAPE: UInt = 5u

public val DCI_1632_ACCESS: UInt = 64u

public val DCI_ASYNC: UInt = 1024u

public val DCI_CANOVERLAY: UInt = 65536u

public val DCI_CAN_STRETCHX: UInt = 4096u

public val DCI_CAN_STRETCHXN: UInt = 16384u

public val DCI_CAN_STRETCHY: UInt = 8192u

public val DCI_CAN_STRETCHYN: UInt = 32768u

public val DCI_CHROMAKEY: UInt = 32u

public val DCI_DWORDALIGN: UInt = 256u

public val DCI_DWORDSIZE: UInt = 128u

public val DCI_ERR_CURRENTLYNOTAVAIL: Int = -5

public val DCI_ERR_HEIGHTALIGN: Int = -21

public val DCI_ERR_INVALIDCLIPLIST: Int = -15

public val DCI_ERR_INVALIDPOSITION: Int = -13

public val DCI_ERR_INVALIDRECT: Int = -6

public val DCI_ERR_INVALIDSTRETCH: Int = -14

public val DCI_ERR_OUTOFMEMORY: Int = -12

public val DCI_ERR_SURFACEISOBSCURED: Int = -16

public val DCI_ERR_TOOBIGHEIGHT: Int = -9

public val DCI_ERR_TOOBIGSIZE: Int = -11

public val DCI_ERR_TOOBIGWIDTH: Int = -10

public val DCI_ERR_UNSUPPORTEDFORMAT: Int = -7

public val DCI_ERR_UNSUPPORTEDMASK: Int = -8

public val DCI_ERR_WIDTHALIGN: Int = -20

public val DCI_ERR_XALIGN: Int = -17

public val DCI_ERR_XYALIGN: Int = -19

public val DCI_ERR_YALIGN: Int = -18

public val DCI_FAIL_GENERIC: Int = -1

public val DCI_FAIL_INVALIDSURFACE: Int = -3

public val DCI_FAIL_UNSUPPORTED: Int = -4

public val DCI_FAIL_UNSUPPORTEDVERSION: Int = -2

public val DCI_OFFSCREEN: UInt = 1u

public val DCI_OK: UInt = 0u

public val DCI_OVERLAY: UInt = 2u

public val DCI_PRIMARY: UInt = 0u

public val DCI_STATUS_CHROMAKEYCHANGED: UInt = 16u

public val DCI_STATUS_FORMATCHANGED: UInt = 4u

public val DCI_STATUS_POINTERCHANGED: UInt = 1u

public val DCI_STATUS_STRIDECHANGED: UInt = 2u

public val DCI_STATUS_SURFACEINFOCHANGED: UInt = 8u

public val DCI_STATUS_WASSTILLDRAWING: UInt = 32u

public val DCI_SURFACE_TYPE: UInt = 15u

public val DCI_VERSION: UInt = 256u

public val DCI_VISIBLE: UInt = 16u

public val DCI_WRITEONLY: UInt = 512u

public val DEACTIVATE_ACTCTX_FLAG_FORCE_EARLY_DEACTIVATION: UInt = 1u

public val DECISION_LOCATION_AUDIT: DECISION_LOCATION = 2

public val DECISION_LOCATION_ENFORCE_STATE_LIST: DECISION_LOCATION = 7

public val DECISION_LOCATION_ENTERPRISE_DEFINED_CLASS_ID: DECISION_LOCATION = 4

public val DECISION_LOCATION_FAILED_CONVERT_GUID: DECISION_LOCATION = 3

public val DECISION_LOCATION_GLOBAL_BUILT_IN_LIST: DECISION_LOCATION = 5

public val DECISION_LOCATION_NOT_FOUND: DECISION_LOCATION = 8

public val DECISION_LOCATION_PARAMETER_VALIDATION: DECISION_LOCATION = 1

public val DECISION_LOCATION_PROVIDER_BUILT_IN_LIST: DECISION_LOCATION = 6

public val DECISION_LOCATION_REFRESH_GLOBAL_DATA: DECISION_LOCATION = 0

public val DECISION_LOCATION_UNKNOWN: DECISION_LOCATION = 9

public val DELAYLOAD_GPA_FAILURE: UInt = 4u

public val DELETE_BROWSING_HISTORY_COOKIES: UInt = 2u

public val DELETE_BROWSING_HISTORY_DOWNLOADHISTORY: UInt = 64u

public val DELETE_BROWSING_HISTORY_FORMDATA: UInt = 8u

public val DELETE_BROWSING_HISTORY_HISTORY: UInt = 1u

public val DELETE_BROWSING_HISTORY_PASSWORDS: UInt = 16u

public val DELETE_BROWSING_HISTORY_PRESERVEFAVORITES: UInt = 32u

public val DELETE_BROWSING_HISTORY_TIF: UInt = 4u

public val DOCKINFO_DOCKED: UInt = 2u

public val DOCKINFO_UNDOCKED: UInt = 1u

public val DOCKINFO_USER_SUPPLIED: UInt = 4u

public val DRIVE_CDROM: UInt = 5u

public val DRIVE_FIXED: UInt = 3u

public val DRIVE_NO_ROOT_DIR: UInt = 1u

public val DRIVE_RAMDISK: UInt = 6u

public val DRIVE_REMOTE: UInt = 4u

public val DRIVE_REMOVABLE: UInt = 2u

public val DRIVE_UNKNOWN: UInt = 0u

public val DTR_CONTROL_DISABLE: UInt = 0u

public val DTR_CONTROL_ENABLE: UInt = 1u

public val DTR_CONTROL_HANDSHAKE: UInt = 2u

public val DefaultBrowserSyncSettings: GUID = GUID.from_u128(U128(0x3ac8342331124aa6uL, 0x9b5b1feb23d0c5f9uL))

public val EFSRPC_SECURE_ONLY: UInt = 8u

public val EFS_DROP_ALTERNATE_STREAMS: UInt = 16u

public val EFS_USE_RECOVERY_KEYS: UInt = 1u

public val ENTITY_LIST_ID: UInt = 0u

public val ENTITY_TYPE_ID: UInt = 1u

public val ER_ENTITY: TDIENTITY_ENTITY_TYPE = 896u

public val ER_ICMP: UInt = 896u

public val EVENTLOG_FULL_INFO: UInt = 0u

public val EditionUpgradeBroker: GUID = GUID.from_u128(U128(0xc42708274f3945dfuL, 0x928812ff6b85a921uL))

public val EditionUpgradeHelper: GUID = GUID.from_u128(U128(0x1776df3b9af4e50uL, 0x9b1c56e93116d704uL))

public val EndpointIoControlType: TDI_TL_IO_CONTROL_TYPE = 0

public val FAIL_FAST_GENERATE_EXCEPTION_ADDRESS: UInt = 1u

public val FAIL_FAST_NO_HARD_ERROR_DLG: UInt = 2u

public val FEATURE_CHANGE_TIME_MODULE_RELOAD: FEATURE_CHANGE_TIME = 1

public val FEATURE_CHANGE_TIME_READ: FEATURE_CHANGE_TIME = 0

public val FEATURE_CHANGE_TIME_REBOOT: FEATURE_CHANGE_TIME = 3

public val FEATURE_CHANGE_TIME_SESSION: FEATURE_CHANGE_TIME = 2

public val FEATURE_ENABLED_STATE_DEFAULT: FEATURE_ENABLED_STATE = 0

public val FEATURE_ENABLED_STATE_DISABLED: FEATURE_ENABLED_STATE = 1

public val FEATURE_ENABLED_STATE_ENABLED: FEATURE_ENABLED_STATE = 2

public val FIBER_FLAG_FLOAT_SWITCH: UInt = 1u

public val FILE_CREATED: UInt = 2u

public val FILE_DIR_DISALLOWED: UInt = 9u

public val FILE_DOES_NOT_EXIST: UInt = 5u

public val FILE_ENCRYPTABLE: UInt = 0u

public val FILE_EXISTS: UInt = 4u

public val FILE_FLAG_IGNORE_IMPERSONATED_DEVICEMAP: UInt = 131072u

public val FILE_FLAG_OPEN_REQUIRING_OPLOCK: UInt = 262144u

public val FILE_IS_ENCRYPTED: UInt = 1u

public val FILE_MAXIMUM_DISPOSITION: UInt = 5u

public val FILE_NO_COMPRESSION: UInt = 32768u

public val FILE_OPENED: UInt = 1u

public val FILE_OPEN_NO_RECALL: UInt = 4194304u

public val FILE_OPEN_REMOTE_INSTANCE: UInt = 1024u

public val FILE_OVERWRITTEN: UInt = 3u

public val FILE_READ_ONLY: UInt = 8u

public val FILE_RENAME_FLAG_POSIX_SEMANTICS: UInt = 2u

public val FILE_RENAME_FLAG_REPLACE_IF_EXISTS: UInt = 1u

public val FILE_RENAME_FLAG_SUPPRESS_PIN_STATE_INHERITANCE: UInt = 4u

public val FILE_ROOT_DIR: UInt = 3u

public val FILE_SKIP_COMPLETION_PORT_ON_SUCCESS: UInt = 1u

public val FILE_SKIP_SET_EVENT_ON_HANDLE: UInt = 2u

public val FILE_SUPERSEDED: UInt = 0u

public val FILE_SYSTEM_ATTR: UInt = 2u

public val FILE_SYSTEM_DIR: UInt = 4u

public val FILE_SYSTEM_NOT_SUPPORT: UInt = 6u

public val FILE_UNKNOWN: UInt = 5u

public val FILE_USER_DISALLOWED: UInt = 7u

public val FILE_VALID_MAILSLOT_OPTION_FLAGS: UInt = 50u

public val FILE_VALID_OPTION_FLAGS: UInt = 16777215u

public val FILE_VALID_PIPE_OPTION_FLAGS: UInt = 50u

public val FILE_VALID_SET_FLAGS: UInt = 54u

public val FIND_ACTCTX_SECTION_KEY_RETURN_ASSEMBLY_METADATA: UInt = 4u

public val FIND_ACTCTX_SECTION_KEY_RETURN_FLAGS: UInt = 2u

public val FIND_ACTCTX_SECTION_KEY_RETURN_HACTCTX: UInt = 1u

public val FORMAT_MESSAGE_MAX_WIDTH_MASK: UInt = 255u

public val FS_CASE_IS_PRESERVED: UInt = 2u

public val FS_CASE_SENSITIVE: UInt = 1u

public val FS_FILE_COMPRESSION: UInt = 16u

public val FS_FILE_ENCRYPTION: UInt = 131072u

public val FS_PERSISTENT_ACLS: UInt = 8u

public val FS_UNICODE_STORED_ON_DISK: UInt = 4u

public val FS_VOL_IS_COMPRESSED: UInt = 32768u

public val GENERIC_ENTITY: TDIENTITY_ENTITY_TYPE = 0u

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_A_A: PCSTR = s("GetSystemWow64DirectoryA")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_A_T: PCWSTR = w("GetSystemWow64DirectoryA")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_A_W: PCWSTR = w("GetSystemWow64DirectoryA")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_T_A: PCWSTR = w("GetSystemWow64DirectoryW")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_T_T: PCWSTR = w("GetSystemWow64DirectoryW")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_T_W: PCWSTR = w("GetSystemWow64DirectoryW")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_W_A: PCSTR = s("GetSystemWow64DirectoryW")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_W_T: PCWSTR = w("GetSystemWow64DirectoryW")

public val GET_SYSTEM_WOW64_DIRECTORY_NAME_W_W: PCWSTR = w("GetSystemWow64DirectoryW")

public val GMEM_DDESHARE: UInt = 8192u

public val GMEM_DISCARDABLE: UInt = 256u

public val GMEM_DISCARDED: UInt = 16384u

public val GMEM_INVALID_HANDLE: UInt = 32768u

public val GMEM_LOCKCOUNT: UInt = 255u

public val GMEM_LOWER: UInt = 4096u

public val GMEM_MODIFY: UInt = 128u

public val GMEM_NOCOMPACT: UInt = 16u

public val GMEM_NODISCARD: UInt = 32u

public val GMEM_NOTIFY: UInt = 16384u

public val GMEM_NOT_BANKED: UInt = 4096u

public val GMEM_SHARE: UInt = 8192u

public val GMEM_VALID_FLAGS: UInt = 32626u

public val GetSockOptIoControlType: TDI_TL_IO_CONTROL_TYPE = 2

public val HANJA_WINDOW: UInt = 2u

public val HINSTANCE_ERROR: UInt = 32u

public val HW_PROFILE_GUIDLEN: UInt = 39u

public val IE4_BACKNEW: UInt = 2u

public val IE4_EXTRAINCREFCNT: UInt = 2048u

public val IE4_FRDOALL: UInt = 256u

public val IE4_NODELETENEW: UInt = 4u

public val IE4_NOENUMKEY: UInt = 32u

public val IE4_NOMESSAGES: UInt = 8u

public val IE4_NOPROGRESS: UInt = 16u

public val IE4_NO_CRC_MAPPING: UInt = 64u

public val IE4_REGSECTION: UInt = 128u

public val IE4_REMOVREGBKDATA: UInt = 4096u

public val IE4_RESTORE: UInt = 1u

public val IE4_UPDREFCNT: UInt = 512u

public val IE4_USEREFCNT: UInt = 1024u

public val IE_BADID: Int = -1

public val IE_BAUDRATE: Int = -12

public val IE_BYTESIZE: Int = -11

public val IE_DEFAULT: Int = -5

public val IE_HARDWARE: Int = -10

public val IE_MEMORY: Int = -4

public val IE_NOPEN: Int = -3

public val IE_OPEN: Int = -2

public val IF_ENTITY: TDIENTITY_ENTITY_TYPE = 512u

public val IF_GENERIC: UInt = 512u

public val IF_MIB: UInt = 514u

public val IGNORE: UInt = 0u

public val IMEA_INIT: UInt = 1u

public val IMEA_NEXT: UInt = 2u

public val IMEA_PREV: UInt = 3u

public val IME_BANJAtoJUNJA: UInt = 19u

public val IME_ENABLE_CONVERT: UInt = 2u

public val IME_ENTERWORDREGISTERMODE: UInt = 24u

public val IME_GETCONVERSIONMODE: UInt = 17u

public val IME_GETIMECAPS: UInt = 3u

public val IME_GETOPEN: UInt = 5u

public val IME_GETVERSION: UInt = 7u

public val IME_JOHABtoKS: UInt = 21u

public val IME_JUNJAtoBANJA: UInt = 20u

public val IME_KStoJOHAB: UInt = 22u

public val IME_MAXPROCESS: UInt = 32u

public val IME_MODE_ALPHANUMERIC: UInt = 1u

public val IME_MODE_CODEINPUT: UInt = 128u

public val IME_MODE_DBCSCHAR: UInt = 16u

public val IME_MODE_HANJACONVERT: UInt = 4u

public val IME_MODE_HIRAGANA: UInt = 4u

public val IME_MODE_KATAKANA: UInt = 2u

public val IME_MODE_NOCODEINPUT: UInt = 256u

public val IME_MODE_NOROMAN: UInt = 64u

public val IME_MODE_ROMAN: UInt = 32u

public val IME_MODE_SBCSCHAR: UInt = 2u

public val IME_MOVEIMEWINDOW: UInt = 8u

public val IME_REQUEST_CONVERT: UInt = 1u

public val IME_RS_DISKERROR: UInt = 14u

public val IME_RS_ERROR: UInt = 1u

public val IME_RS_ILLEGAL: UInt = 6u

public val IME_RS_INVALID: UInt = 17u

public val IME_RS_NEST: UInt = 18u

public val IME_RS_NOIME: UInt = 2u

public val IME_RS_NOROOM: UInt = 10u

public val IME_RS_NOTFOUND: UInt = 7u

public val IME_RS_SYSTEMMODAL: UInt = 19u

public val IME_RS_TOOLONG: UInt = 5u

public val IME_SENDVKEY: UInt = 19u

public val IME_SETCONVERSIONFONTEX: UInt = 25u

public val IME_SETCONVERSIONMODE: UInt = 16u

public val IME_SETCONVERSIONWINDOW: UInt = 8u

public val IME_SETOPEN: UInt = 4u

public val IME_SET_MODE: UInt = 18u

public val INFO_CLASS_GENERIC: UInt = 256u

public val INFO_CLASS_IMPLEMENTATION: UInt = 768u

public val INFO_CLASS_PROTOCOL: UInt = 512u

public val INFO_TYPE_ADDRESS_OBJECT: UInt = 512u

public val INFO_TYPE_CONNECTION: UInt = 768u

public val INFO_TYPE_PROVIDER: UInt = 256u

public val INTERIM_WINDOW: UInt = 0u

public val INVALID_ENTITY_INSTANCE: Int = -1

public val IOCTL_TDI_TL_IO_CONTROL_ENDPOINT: UInt = 2162744u

public val IR_CHANGECONVERT: UInt = 289u

public val IR_CLOSECONVERT: UInt = 290u

public val IR_DBCSCHAR: UInt = 352u

public val IR_FULLCONVERT: UInt = 291u

public val IR_IMESELECT: UInt = 304u

public val IR_MODEINFO: UInt = 400u

public val IR_OPENCONVERT: UInt = 288u

public val IR_STRING: UInt = 320u

public val IR_STRINGEND: UInt = 257u

public val IR_STRINGEX: UInt = 384u

public val IR_STRINGSTART: UInt = 256u

public val IR_UNDETERMINE: UInt = 368u

public val KEY_ALL_KEYS: WLDP_KEY = 2

public val KEY_OVERRIDE: WLDP_KEY = 1

public val KEY_UNKNOWN: WLDP_KEY = 0

public val LIS_NOGRPCONV: UInt = 2u

public val LIS_QUIET: UInt = 1u

public val LOGON32_PROVIDER_VIRTUAL: UInt = 4u

public val LOGON32_PROVIDER_WINNT35: UInt = 1u

public val LOGON_ZERO_PASSWORD_BUFFER: UInt = 2147483648u

public val LPTx: UInt = 128u

public val MAXINTATOM: UInt = 49152u

public val MAX_COMPUTERNAME_LENGTH: UInt = 15u

public val MAX_TDI_ENTITIES: UInt = 4096u

public val MCW_DEFAULT: UInt = 0u

public val MCW_HIDDEN: UInt = 16u

public val MCW_RECT: UInt = 1u

public val MCW_SCREEN: UInt = 4u

public val MCW_VERTICAL: UInt = 8u

public val MCW_WINDOW: UInt = 2u

public val MICROSOFT_WINBASE_H_DEFINE_INTERLOCKED_CPLUSPLUS_OVERLOADS: UInt = 0u

public val MICROSOFT_WINDOWS_WINBASE_H_DEFINE_INTERLOCKED_CPLUSPLUS_OVERLOADS: UInt = 0u

public val MODE_WINDOW: UInt = 1u

public val OFS_MAXPATHNAME: UInt = 128u

public val OPERATION_API_VERSION: UInt = 1u

public val OVERWRITE_HIDDEN: UInt = 4u

public val PCF_16BITMODE: UInt = 512u

public val PCF_DTRDSR: UInt = 1u

public val PCF_INTTIMEOUTS: UInt = 128u

public val PCF_PARITY_CHECK: UInt = 8u

public val PCF_RLSD: UInt = 4u

public val PCF_RTSCTS: UInt = 2u

public val PCF_SETXCHAR: UInt = 32u

public val PCF_SPECIALCHARS: UInt = 256u

public val PCF_TOTALTIMEOUTS: UInt = 64u

public val PCF_XONXOFF: UInt = 16u

public val PROCESS_CREATION_ALL_APPLICATION_PACKAGES_OPT_OUT: UInt = 1u

public val PROCESS_CREATION_CHILD_PROCESS_OVERRIDE: UInt = 2u

public val PROCESS_CREATION_CHILD_PROCESS_RESTRICTED: UInt = 1u

public val PROCESS_CREATION_CHILD_PROCESS_RESTRICTED_UNLESS_SECURE: UInt = 4u

public val PROCESS_CREATION_DESKTOP_APP_BREAKAWAY_DISABLE_PROCESS_TREE: UInt = 2u

public val PROCESS_CREATION_DESKTOP_APP_BREAKAWAY_ENABLE_PROCESS_TREE: UInt = 1u

public val PROCESS_CREATION_DESKTOP_APP_BREAKAWAY_OVERRIDE: UInt = 4u

public val PROCESS_CREATION_MITIGATION_POLICY_DEP_ATL_THUNK_ENABLE: UInt = 2u

public val PROCESS_CREATION_MITIGATION_POLICY_DEP_ENABLE: UInt = 1u

public val PROCESS_CREATION_MITIGATION_POLICY_SEHOP_ENABLE: UInt = 4u

public val PROC_THREAD_ATTRIBUTE_ADDITIVE: UInt = 262144u

public val PROC_THREAD_ATTRIBUTE_INPUT: UInt = 131072u

public val PROC_THREAD_ATTRIBUTE_NUMBER: UInt = 65535u

public val PROC_THREAD_ATTRIBUTE_THREAD: UInt = 65536u

public val PROTECTION_LEVEL_SAME: UInt = 4294967295u

public val PST_FAX: UInt = 33u

public val PST_LAT: UInt = 257u

public val PST_MODEM: UInt = 6u

public val PST_NETWORK_BRIDGE: UInt = 256u

public val PST_PARALLELPORT: UInt = 2u

public val PST_RS232: UInt = 1u

public val PST_RS422: UInt = 3u

public val PST_RS423: UInt = 4u

public val PST_RS449: UInt = 5u

public val PST_SCANNER: UInt = 34u

public val PST_TCPIP_TELNET: UInt = 258u

public val PST_UNSPECIFIED: UInt = 0u

public val PST_X25: UInt = 259u

public val QUERY_ACTCTX_FLAG_ACTCTX_IS_ADDRESS: UInt = 16u

public val QUERY_ACTCTX_FLAG_ACTCTX_IS_HMODULE: UInt = 8u

public val QUERY_ACTCTX_FLAG_NO_ADDREF: UInt = 2147483648u

public val QUERY_ACTCTX_FLAG_USE_ACTIVE_ACTCTX: UInt = 4u

public val RECOVERY_DEFAULT_PING_INTERVAL: UInt = 5000u

public val REG_RESTORE_LOG_KEY: PCWSTR = w("RegRestoreLogFile")

public val REG_SAVE_LOG_KEY: PCWSTR = w("RegSaveLogFile")

public val REMOTE_PROTOCOL_INFO_FLAG_LOOPBACK: UInt = 1u

public val REMOTE_PROTOCOL_INFO_FLAG_OFFLINE: UInt = 2u

public val REMOTE_PROTOCOL_INFO_FLAG_PERSISTENT_HANDLE: UInt = 4u

public val RESETDEV: UInt = 7u

public val RESTART_MAX_CMD_LINE: UInt = 1024u

public val RPI_FLAG_SMB2_SHARECAP_CLUSTER: UInt = 64u

public val RPI_FLAG_SMB2_SHARECAP_CONTINUOUS_AVAILABILITY: UInt = 16u

public val RPI_FLAG_SMB2_SHARECAP_DFS: UInt = 8u

public val RPI_FLAG_SMB2_SHARECAP_SCALEOUT: UInt = 32u

public val RPI_FLAG_SMB2_SHARECAP_TIMEWARP: UInt = 2u

public val RPI_SMB2_FLAG_SERVERCAP_DFS: UInt = 1u

public val RPI_SMB2_FLAG_SERVERCAP_DIRECTORY_LEASING: UInt = 32u

public val RPI_SMB2_FLAG_SERVERCAP_LARGEMTU: UInt = 4u

public val RPI_SMB2_FLAG_SERVERCAP_LEASING: UInt = 2u

public val RPI_SMB2_FLAG_SERVERCAP_MULTICHANNEL: UInt = 8u

public val RPI_SMB2_FLAG_SERVERCAP_PERSISTENT_HANDLES: UInt = 16u

public val RPI_SMB2_SHAREFLAG_COMPRESS_DATA: UInt = 2u

public val RPI_SMB2_SHAREFLAG_ENCRYPT_DATA: UInt = 1u

public val RSC_FLAG_DELAYREGISTEROCX: UInt = 512u

public val RSC_FLAG_INF: UInt = 1u

public val RSC_FLAG_NGCONV: UInt = 8u

public val RSC_FLAG_QUIET: UInt = 4u

public val RSC_FLAG_SETUPAPI: UInt = 1024u

public val RSC_FLAG_SKIPDISKSPACECHECK: UInt = 2u

public val RSC_FLAG_UPDHLPDLLS: UInt = 16u

public val RTS_CONTROL_DISABLE: UInt = 0u

public val RTS_CONTROL_ENABLE: UInt = 1u

public val RTS_CONTROL_HANDSHAKE: UInt = 2u

public val RTS_CONTROL_TOGGLE: UInt = 3u

public val RUNCMDS_DELAYPOSTCMD: UInt = 4u

public val RUNCMDS_NOWAIT: UInt = 2u

public val RUNCMDS_QUIET: UInt = 1u

public val SCS_32BIT_BINARY: UInt = 0u

public val SCS_64BIT_BINARY: UInt = 6u

public val SCS_DOS_BINARY: UInt = 1u

public val SCS_OS216_BINARY: UInt = 5u

public val SCS_PIF_BINARY: UInt = 3u

public val SCS_POSIX_BINARY: UInt = 4u

public val SCS_THIS_PLATFORM_BINARY: UInt = 6u

public val SCS_WOW_BINARY: UInt = 2u

public val SHUTDOWN_NORETRY: UInt = 1u

public val SP_BAUD: UInt = 2u

public val SP_DATABITS: UInt = 4u

public val SP_HANDSHAKING: UInt = 16u

public val SP_PARITY: UInt = 1u

public val SP_PARITY_CHECK: UInt = 32u

public val SP_RLSD: UInt = 64u

public val SP_SERIALCOMM: UInt = 1u

public val SP_STOPBITS: UInt = 8u

public val STARTF_HOLOGRAPHIC: UInt = 262144u

public val STORAGE_INFO_FLAGS_ALIGNED_DEVICE: UInt = 1u

public val STORAGE_INFO_FLAGS_PARTITION_ALIGNED_ON_DEVICE: UInt = 2u

public val STORAGE_INFO_OFFSET_UNKNOWN: UInt = 4294967295u

public val STREAM_CONTAINS_GHOSTED_FILE_EXTENTS: UInt = 16u

public val STREAM_CONTAINS_PROPERTIES: UInt = 4u

public val STREAM_CONTAINS_SECURITY: UInt = 2u

public val STREAM_MODIFIED_WHEN_READ: UInt = 1u

public val STREAM_NORMAL_ATTRIBUTE: UInt = 0u

public val STREAM_SPARSE_ATTRIBUTE: UInt = 8u

public val SYSTEM_STATUS_FLAG_POWER_SAVING_ON: UInt = 1u

public val S_ALLTHRESHOLD: UInt = 2u

public val S_LEGATO: UInt = 1u

public val S_NORMAL: UInt = 0u

public val S_PERIOD1024: UInt = 1u

public val S_PERIOD2048: UInt = 2u

public val S_PERIOD512: UInt = 0u

public val S_PERIODVOICE: UInt = 3u

public val S_QUEUEEMPTY: UInt = 0u

public val S_SERBDNT: Int = -5

public val S_SERDCC: Int = -7

public val S_SERDDR: Int = -14

public val S_SERDFQ: Int = -13

public val S_SERDLN: Int = -6

public val S_SERDMD: Int = -10

public val S_SERDPT: Int = -12

public val S_SERDSH: Int = -11

public val S_SERDSR: Int = -15

public val S_SERDST: Int = -16

public val S_SERDTP: Int = -8

public val S_SERDVL: Int = -9

public val S_SERDVNA: Int = -1

public val S_SERMACT: Int = -3

public val S_SEROFM: Int = -2

public val S_SERQFUL: Int = -4

public val S_STACCATO: UInt = 2u

public val S_THRESHOLD: UInt = 1u

public val S_WHITE1024: UInt = 5u

public val S_WHITE2048: UInt = 6u

public val S_WHITE512: UInt = 4u

public val S_WHITEVOICE: UInt = 7u

public val SetSockOptIoControlType: TDI_TL_IO_CONTROL_TYPE = 1

public val SocketIoControlType: TDI_TL_IO_CONTROL_TYPE = 3

public val TC_GP_TRAP: UInt = 2u

public val TC_HARDERR: UInt = 1u

public val TC_NORMAL: UInt = 0u

public val TC_SIGNAL: UInt = 3u

public val THREAD_PRIORITY_ERROR_RETURN: UInt = 2147483647u

public val UMS_VERSION: UInt = 256u

public val VALUENAME_BUILT_IN_LIST: VALUENAME = 2

public val VALUENAME_ENTERPRISE_DEFINED_CLASS_ID: VALUENAME = 1

public val VALUENAME_UNKNOWN: VALUENAME = 0

public val WINWATCHNOTIFY_CHANGED: UInt = 4u

public val WINWATCHNOTIFY_CHANGING: UInt = 3u

public val WINWATCHNOTIFY_DESTROY: UInt = 2u

public val WINWATCHNOTIFY_START: UInt = 0u

public val WINWATCHNOTIFY_STOP: UInt = 1u

public val WLDP_CANEXECUTEBUFFER_FN: PCSTR = s("WldpCanExecuteBuffer")

public val WLDP_CANEXECUTEFILE_FN: PCSTR = s("WldpCanExecuteFile")

public val WLDP_DLL: PCWSTR = w("WLDP.DLL")

public val WLDP_EXECUTION_EVALUATION_OPTION_EXECUTE_IN_INTERACTIVE_SESSION: WLDP_EXECUTION_EVALUATION_OPTIONS = 1

public val WLDP_EXECUTION_EVALUATION_OPTION_NONE: WLDP_EXECUTION_EVALUATION_OPTIONS = 0

public val WLDP_EXECUTION_POLICY_ALLOWED: WLDP_EXECUTION_POLICY = 1

public val WLDP_EXECUTION_POLICY_BLOCKED: WLDP_EXECUTION_POLICY = 0

public val WLDP_EXECUTION_POLICY_REQUIRE_SANDBOX: WLDP_EXECUTION_POLICY = 2

public val WLDP_FLAGS_SKIPSIGNATUREVALIDATION: UInt = 256u

public val WLDP_GETLOCKDOWNPOLICY_FN: PCSTR = s("WldpGetLockdownPolicy")

public val WLDP_HOST_CMD: GUID = GUID.from_u128(U128(0x5baea1d66f1c488euL, 0x8490347fa5c5067fuL))

public val WLDP_HOST_HTML: GUID = GUID.from_u128(U128(0xb35a71b6fe5648d6uL, 0x95432dff0ecded66uL))

public val WLDP_HOST_ID_ALL: WLDP_HOST_ID = 7

public val WLDP_HOST_ID_GLOBAL: WLDP_HOST_ID = 1

public val WLDP_HOST_ID_IE: WLDP_HOST_ID = 5

public val WLDP_HOST_ID_MAX: WLDP_HOST_ID = 8

public val WLDP_HOST_ID_MSI: WLDP_HOST_ID = 6

public val WLDP_HOST_ID_POWERSHELL: WLDP_HOST_ID = 4

public val WLDP_HOST_ID_UNKNOWN: WLDP_HOST_ID = 0

public val WLDP_HOST_ID_VBA: WLDP_HOST_ID = 2

public val WLDP_HOST_ID_WSH: WLDP_HOST_ID = 3

public val WLDP_HOST_INFORMATION_REVISION: UInt = 1u

public val WLDP_HOST_JAVASCRIPT: GUID = GUID.from_u128(U128(0x5629f0d51cca4feduL, 0xa1a336a8c18d74c0uL))

public val WLDP_HOST_MAX: WLDP_HOST = 2

public val WLDP_HOST_MSI: GUID = GUID.from_u128(U128(0x624eb6116e7e4eecuL, 0x9bfef0ecdbfcf390uL))

public val WLDP_HOST_OTHER: GUID = GUID.from_u128(U128(0x626cbec3e1fa4227uL, 0x9800ed210274cf7cuL))

public val WLDP_HOST_POWERSHELL: GUID = GUID.from_u128(U128(0x8e9aaa7c198b4879uL, 0xae41a50d47ad6458uL))

public val WLDP_HOST_PYTHON: GUID = GUID.from_u128(U128(0xbfd557ef244842ecuL, 0x810b0d9f09352d4auL))

public val WLDP_HOST_RUNDLL32: WLDP_HOST = 0

public val WLDP_HOST_SVCHOST: WLDP_HOST = 1

public val WLDP_HOST_WINDOWS_SCRIPT_HOST: GUID = GUID.from_u128(U128(0xd30b84c529ce4ff3uL, 0x86eca30007a82e49uL))

public val WLDP_HOST_XML: GUID = GUID.from_u128(U128(0x5594be58c6bf4295uL, 0x82f4d494d20e3a36uL))

public val WLDP_ISAPPAPPROVEDBYPOLICY_FN: PCSTR = s("WldpIsAppApprovedByPolicy")

public val WLDP_ISCLASSINAPPROVEDLIST_FN: PCSTR = s("WldpIsClassInApprovedList")

public val WLDP_ISDYNAMICCODEPOLICYENABLED_FN: PCSTR = s("WldpIsDynamicCodePolicyEnabled")

public val WLDP_ISPRODUCTIONCONFIGURATION_FN: PCSTR = s("WldpIsProductionConfiguration")

public val WLDP_ISWCOSPRODUCTIONCONFIGURATION_FN: PCSTR = s("WldpIsWcosProductionConfiguration")

public val WLDP_LOCKDOWN_AUDIT_FLAG: UInt = 8u

public val WLDP_LOCKDOWN_CONFIG_CI_AUDIT_FLAG: UInt = 2u

public val WLDP_LOCKDOWN_CONFIG_CI_FLAG: UInt = 1u

public val WLDP_LOCKDOWN_DEFINED_FLAG: UInt = 2147483648u

public val WLDP_LOCKDOWN_EXCLUSION_FLAG: UInt = 16u

public val WLDP_LOCKDOWN_OFF: UInt = 2147483648u

public val WLDP_LOCKDOWN_UMCIENFORCE_FLAG: UInt = 4u

public val WLDP_LOCKDOWN_UNDEFINED: UInt = 0u

public val WLDP_POLICY_SETTING_AV_PERF_MODE: WLDP_POLICY_SETTING = 1000

public val WLDP_QUERYDANAMICCODETRUST_FN: PCSTR = s("WldpQueryDynamicCodeTrust")

public val WLDP_QUERYDEVICESECURITYINFORMATION_FN: PCSTR = s("WldpQueryDeviceSecurityInformation")

public val WLDP_QUERYDYNAMICCODETRUST_FN: PCSTR = s("WldpQueryDynamicCodeTrust")

public val WLDP_QUERYPOLICYSETTINGENABLED2_FN: PCSTR = s("WldpQueryPolicySettingEnabled2")

public val WLDP_QUERYPOLICYSETTINGENABLED_FN: PCSTR = s("WldpQueryPolicySettingEnabled")

public val WLDP_QUERYWINDOWSLOCKDOWNMODE_FN: PCSTR = s("WldpQueryWindowsLockdownMode")

public val WLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_FN: PCSTR = s("WldpQueryWindowsLockdownRestriction")

public val WLDP_RESETPRODUCTIONCONFIGURATION_FN: PCSTR = s("WldpResetProductionConfiguration")

public val WLDP_RESETWCOSPRODUCTIONCONFIGURATION_FN: PCSTR = s("WldpResetWcosProductionConfiguration")

public val WLDP_SETDYNAMICCODETRUST_FN: PCSTR = s("WldpSetDynamicCodeTrust")

public val WLDP_SETWINDOWSLOCKDOWNRESTRICTION_FN: PCSTR = s("WldpSetWindowsLockdownRestriction")

public val WLDP_WINDOWS_LOCKDOWN_MODE_LOCKED: WLDP_WINDOWS_LOCKDOWN_MODE = 2

public val WLDP_WINDOWS_LOCKDOWN_MODE_MAX: WLDP_WINDOWS_LOCKDOWN_MODE = 3

public val WLDP_WINDOWS_LOCKDOWN_MODE_TRIAL: WLDP_WINDOWS_LOCKDOWN_MODE = 1

public val WLDP_WINDOWS_LOCKDOWN_MODE_UNLOCKED: WLDP_WINDOWS_LOCKDOWN_MODE = 0

public val WLDP_WINDOWS_LOCKDOWN_RESTRICTION_MAX: WLDP_WINDOWS_LOCKDOWN_RESTRICTION = 3

public val WLDP_WINDOWS_LOCKDOWN_RESTRICTION_NONE: WLDP_WINDOWS_LOCKDOWN_RESTRICTION = 0

public val WLDP_WINDOWS_LOCKDOWN_RESTRICTION_NOUNLOCK: WLDP_WINDOWS_LOCKDOWN_RESTRICTION = 1

public val WLDP_WINDOWS_LOCKDOWN_RESTRICTION_NOUNLOCK_PERMANENT: WLDP_WINDOWS_LOCKDOWN_RESTRICTION = 2

public val WM_CONVERTREQUEST: UInt = 266u

public val WM_CONVERTRESULT: UInt = 267u

public val WM_IMEKEYDOWN: UInt = 656u

public val WM_IMEKEYUP: UInt = 657u

public val WM_IME_REPORT: UInt = 640u

public val WM_INTERIM: UInt = 268u

public val WM_WNT_CONVERTREQUESTEX: UInt = 265u

public val WinStationInformation: WINSTATIONINFOCLASS = 8
