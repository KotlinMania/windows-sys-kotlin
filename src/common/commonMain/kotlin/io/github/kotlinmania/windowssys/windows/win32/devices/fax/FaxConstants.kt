package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public val CF_MSFAXSRV_DEVICE_ID: Pcwstr = w("FAXSRV_DeviceID")

public val CF_MSFAXSRV_FSP_GUID: Pcwstr = w("FAXSRV_FSPGuid")

public val CF_MSFAXSRV_ROUTEEXT_NAME: Pcwstr = w("FAXSRV_RoutingExtName")

public val CF_MSFAXSRV_ROUTING_METHOD_GUID: Pcwstr = w("FAXSRV_RoutingMethodGuid")

public val CF_MSFAXSRV_SERVER_NAME: Pcwstr = w("FAXSRV_ServerName")

public val DEV_ID_SRC_FAX: FaxEnumDeviceIdSource = 0

public val DEV_ID_SRC_TAPI: FaxEnumDeviceIdSource = 1

public val DRT_EMAIL: FaxEnumDeliveryReportTypes = 1

public val DRT_INBOX: FaxEnumDeliveryReportTypes = 2

public val DRT_NONE: FaxEnumDeliveryReportTypes = 0

public val FAXDEVRECEIVE_SIZE: UInt = 4096u

public val FAXDEVREPORTSTATUS_SIZE: UInt = 4096u

public val FAXLOG_CATEGORY_INBOUND: FaxEnumLogCategories = 3

public val FAXLOG_CATEGORY_INIT: FaxEnumLogCategories = 1

public val FAXLOG_CATEGORY_OUTBOUND: FaxEnumLogCategories = 2

public val FAXLOG_CATEGORY_UNKNOWN: FaxEnumLogCategories = 4

public val FAXLOG_LEVEL_MAX: FaxEnumLogLevels = 3

public val FAXLOG_LEVEL_MED: FaxEnumLogLevels = 2

public val FAXLOG_LEVEL_MIN: FaxEnumLogLevels = 1

public val FAXLOG_LEVEL_NONE: FaxEnumLogLevels = 0

public val FAX_CONFIG_QUERY: UInt = 4u

public val FAX_CONFIG_SET: UInt = 8u

public val FAX_ERR_BAD_GROUP_CONFIGURATION: Int = 7003

public val FAX_ERR_DEVICE_NUM_LIMIT_EXCEEDED: Int = 7010

public val FAX_ERR_DIRECTORY_IN_USE: Int = 7007

public val FAX_ERR_END: Int = 7013

public val FAX_ERR_FILE_ACCESS_DENIED: Int = 7008

public val FAX_ERR_GROUP_IN_USE: Int = 7004

public val FAX_ERR_GROUP_NOT_FOUND: Int = 7002

public val FAX_ERR_MESSAGE_NOT_FOUND: Int = 7009

public val FAX_ERR_NOT_NTFS: Int = 7006

public val FAX_ERR_NOT_SUPPORTED_ON_THIS_SKU: Int = 7011

public val FAX_ERR_RECIPIENTS_LIMIT: Int = 7013

public val FAX_ERR_RULE_NOT_FOUND: Int = 7005

public val FAX_ERR_SRV_OUTOFMEMORY: Int = 7001

public val FAX_ERR_START: Int = 7001

public val FAX_ERR_VERSION_MISMATCH: Int = 7012

public val FAX_E_BAD_GROUP_CONFIGURATION: Hresult = 0x80041B5Bu.toInt()

public val FAX_E_DEVICE_NUM_LIMIT_EXCEEDED: Hresult = 0x80041B62u.toInt()

public val FAX_E_DIRECTORY_IN_USE: Hresult = 0x80041B5Fu.toInt()

public val FAX_E_FILE_ACCESS_DENIED: Hresult = 0x80041B60u.toInt()

public val FAX_E_GROUP_IN_USE: Hresult = 0x80041B5Cu.toInt()

public val FAX_E_GROUP_NOT_FOUND: Hresult = 0x80041B5Au.toInt()

public val FAX_E_MESSAGE_NOT_FOUND: Hresult = 0x80041B61u.toInt()

public val FAX_E_NOT_NTFS: Hresult = 0x80041B5Eu.toInt()

public val FAX_E_NOT_SUPPORTED_ON_THIS_SKU: Hresult = 0x80041B63u.toInt()

public val FAX_E_RECIPIENTS_LIMIT: Hresult = 0x80041B65u.toInt()

public val FAX_E_RULE_NOT_FOUND: Hresult = 0x80041B5Du.toInt()

public val FAX_E_SRV_OUTOFMEMORY: Hresult = 0x80041B59u.toInt()

public val FAX_E_VERSION_MISMATCH: Hresult = 0x80041B64u.toInt()

public val FAX_JOB_MANAGE: UInt = 64u

public val FAX_JOB_QUERY: UInt = 2u

public val FAX_JOB_SUBMIT: UInt = 1u

public val FAX_PORT_QUERY: UInt = 16u

public val FAX_PORT_SET: UInt = 32u

public val FEI_ABORTING: UInt = 15u

public val FEI_ANSWERED: UInt = 21u

public val FEI_BAD_ADDRESS: UInt = 7u

public val FEI_BUSY: UInt = 5u

public val FEI_CALL_BLACKLISTED: UInt = 13u

public val FEI_CALL_DELAYED: UInt = 12u

public val FEI_COMPLETED: UInt = 4u

public val FEI_DELETED: UInt = 23u

public val FEI_DIALING: UInt = 1u

public val FEI_DISCONNECTED: UInt = 9u

public val FEI_FATAL_ERROR: UInt = 10u

public val FEI_FAXSVC_ENDED: UInt = 20u

public val FEI_FAXSVC_STARTED: UInt = 27u

public val FEI_HANDLED: UInt = 26u

public val FEI_IDLE: UInt = 19u

public val FEI_INITIALIZING: UInt = 24u

public val FEI_JOB_QUEUED: UInt = 22u

public val FEI_LINE_UNAVAILABLE: UInt = 25u

public val FEI_MODEM_POWERED_OFF: UInt = 18u

public val FEI_MODEM_POWERED_ON: UInt = 17u

public val FEI_NEVENTS: UInt = 27u

public val FEI_NOT_FAX_CALL: UInt = 11u

public val FEI_NO_ANSWER: UInt = 6u

public val FEI_NO_DIAL_TONE: UInt = 8u

public val FEI_RECEIVING: UInt = 3u

public val FEI_RINGING: UInt = 14u

public val FEI_ROUTING: UInt = 16u

public val FEI_SENDING: UInt = 2u

public val FPF_RECEIVE: UInt = 1u

public val FPF_SEND: UInt = 2u

public val FPF_VIRTUAL: UInt = 4u

public val FPS_ABORTING: UInt = 538968064u

public val FPS_ANSWERED: UInt = 545259520u

public val FPS_AVAILABLE: UInt = 537919488u

public val FPS_BAD_ADDRESS: UInt = 536871168u

public val FPS_BUSY: UInt = 536870976u

public val FPS_CALL_BLACKLISTED: UInt = 536887296u

public val FPS_CALL_DELAYED: UInt = 536879104u

public val FPS_COMPLETED: UInt = 536870920u

public val FPS_DIALING: UInt = 536870913u

public val FPS_DISCONNECTED: UInt = 536871936u

public val FPS_FATAL_ERROR: UInt = 536872960u

public val FPS_HANDLED: UInt = 536870928u

public val FPS_INITIALIZING: UInt = 536903680u

public val FPS_NOT_FAX_CALL: UInt = 536875008u

public val FPS_NO_ANSWER: UInt = 536871040u

public val FPS_NO_DIAL_TONE: UInt = 536871424u

public val FPS_OFFLINE: UInt = 536936448u

public val FPS_RECEIVING: UInt = 536870916u

public val FPS_RINGING: UInt = 537001984u

public val FPS_ROUTING: UInt = 541065216u

public val FPS_SENDING: UInt = 536870914u

public val FPS_UNAVAILABLE: UInt = 536870944u

public val FS_ANSWERED: UInt = 545259520u

public val FS_BAD_ADDRESS: UInt = 536871168u

public val FS_BUSY: UInt = 536870976u

public val FS_CALL_BLACKLISTED: UInt = 536887296u

public val FS_CALL_DELAYED: UInt = 536879104u

public val FS_COMPLETED: UInt = 536870920u

public val FS_DIALING: UInt = 536870913u

public val FS_DISCONNECTED: UInt = 536871936u

public val FS_FATAL_ERROR: UInt = 536872960u

public val FS_HANDLED: UInt = 536870928u

public val FS_INITIALIZING: UInt = 536870912u

public val FS_LINE_UNAVAILABLE: UInt = 536870944u

public val FS_NOT_FAX_CALL: UInt = 536875008u

public val FS_NO_ANSWER: UInt = 536871040u

public val FS_NO_DIAL_TONE: UInt = 536871424u

public val FS_RECEIVING: UInt = 536870916u

public val FS_TRANSMITTING: UInt = 536870914u

public val FS_USER_ABORT: UInt = 538968064u

public val IS_DIGITAL_CAMERA_STR: Pcwstr = w("IsDigitalCamera")

public val IS_DIGITAL_CAMERA_VAL: UInt = 1u

public val JC_DELETE: FaxEnumJobCommands = 1

public val JC_PAUSE: FaxEnumJobCommands = 2

public val JC_RESUME: FaxEnumJobCommands = 3

public val JC_UNKNOWN: FaxEnumJobCommands = 0

public val JSA_DISCOUNT_PERIOD: FaxEnumJobSendAttributes = 2

public val JSA_NOW: FaxEnumJobSendAttributes = 0

public val JSA_SPECIFIC_TIME: FaxEnumJobSendAttributes = 1

public val JS_DELETING: UInt = 2u

public val JS_FAILED: UInt = 4u

public val JS_INPROGRESS: UInt = 1u

public val JS_NOLINE: UInt = 16u

public val JS_PAUSED: UInt = 8u

public val JS_PENDING: UInt = 0u

public val JS_RETRIES_EXCEEDED: UInt = 64u

public val JS_RETRYING: UInt = 32u

public val JT_FAIL_RECEIVE: UInt = 4u

public val JT_RECEIVE: UInt = 2u

public val JT_ROUTING: UInt = 3u

public val JT_SEND: UInt = 1u

public val JT_UNKNOWN: UInt = 0u

public val MAX_NOTIFICATION_DATA: UInt = 64u

public val MS_FAXROUTE_EMAIL_GUID: Pcwstr = w("{6bbf7bfe-9af2-11d0-abf7-00c04fd91a4e}")

public val MS_FAXROUTE_FOLDER_GUID: Pcwstr = w("{92041a90-9af2-11d0-abf7-00c04fd91a4e}")

public val MS_FAXROUTE_PRINTING_GUID: Pcwstr = w("{aec1b37c-9af2-11d0-abf7-00c04fd91a4e}")

public val PORT_OPEN_MODIFY: FaxEnumPortOpenType = 2

public val PORT_OPEN_QUERY: FaxEnumPortOpenType = 1

public val QUERY_STATUS: FaxrouteEnable = -1

public val REGSTR_VAL_BAUDRATE: Pcwstr = w("BaudRate")

public val REGSTR_VAL_BAUDRATE_A: Pcstr = s("BaudRate")

public val REGSTR_VAL_DATA_W: Pcwstr = w("DeviceData")

public val REGSTR_VAL_DEVICESUBTYPE_W: Pcwstr = w("DeviceSubType")

public val REGSTR_VAL_DEVICETYPE_W: Pcwstr = w("DeviceType")

public val REGSTR_VAL_DEVICE_NAME_W: Pcwstr = w("DriverDesc")

public val REGSTR_VAL_DEV_NAME_W: Pcwstr = w("DeviceName")

public val REGSTR_VAL_DRIVER_DESC_W: Pcwstr = w("DriverDesc")

public val REGSTR_VAL_FRIENDLY_NAME_W: Pcwstr = w("FriendlyName")

public val REGSTR_VAL_GENERIC_CAPS_W: Pcwstr = w("Capabilities")

public val REGSTR_VAL_GUID: Pcwstr = w("GUID")

public val REGSTR_VAL_GUID_W: Pcwstr = w("GUID")

public val REGSTR_VAL_HARDWARE: Pcwstr = w("HardwareConfig")

public val REGSTR_VAL_HARDWARE_W: Pcwstr = w("HardwareConfig")

public val REGSTR_VAL_LAUNCHABLE: Pcwstr = w("Launchable")

public val REGSTR_VAL_LAUNCHABLE_W: Pcwstr = w("Launchable")

public val REGSTR_VAL_LAUNCH_APPS: Pcwstr = w("LaunchApplications")

public val REGSTR_VAL_LAUNCH_APPS_W: Pcwstr = w("LaunchApplications")

public val REGSTR_VAL_SHUTDOWNDELAY: Pcwstr = w("ShutdownIfUnusedDelay")

public val REGSTR_VAL_SHUTDOWNDELAY_W: Pcwstr = w("ShutdownIfUnusedDelay")

public val REGSTR_VAL_TYPE_W: Pcwstr = w("Type")

public val REGSTR_VAL_VENDOR_NAME_W: Pcwstr = w("Vendor")

public val SEND_TO_FAX_RECIPIENT_ATTACHMENT: SendToMode = 0

public val STATUS_DISABLE: FaxrouteEnable = 0

public val STATUS_ENABLE: FaxrouteEnable = 1

public val STIEDFL_ALLDEVICES: UInt = 0u

public val STIEDFL_ATTACHEDONLY: UInt = 1u

public val STIERR_ALREADY_INITIALIZED: Hresult = 0x800704DFu.toInt()

public val STIERR_BADDRIVER: Hresult = 0x80070077u.toInt()

public val STIERR_BETA_VERSION: Hresult = 0x80070481u.toInt()

public val STIERR_DEVICENOTREG: Int = -2147221164

public val STIERR_DEVICE_LOCKED: Hresult = 0x80070021u.toInt()

public val STIERR_DEVICE_NOTREADY: Hresult = 0x80070015u.toInt()

public val STIERR_GENERIC: Int = -2147467259

public val STIERR_HANDLEEXISTS: Hresult = 0x800700B7u.toInt()

public val STIERR_INVALID_DEVICE_NAME: Hresult = 0x8007007Bu.toInt()

public val STIERR_INVALID_HW_TYPE: Hresult = 0x8007000Du.toInt()

public val STIERR_INVALID_PARAM: Int = -2147024809

public val STIERR_NEEDS_LOCK: Hresult = 0x8007009Eu.toInt()

public val STIERR_NOEVENTS: Hresult = 0x80070103u.toInt()

public val STIERR_NOINTERFACE: Int = -2147467262

public val STIERR_NOTINITIALIZED: Int = -2147024891

public val STIERR_NOT_INITIALIZED: Hresult = 0x80070015u.toInt()

public val STIERR_OBJECTNOTFOUND: Hresult = 0x80070002u.toInt()

public val STIERR_OLD_VERSION: Hresult = 0x8007047Eu.toInt()

public val STIERR_OUTOFMEMORY: Int = -2147024882

public val STIERR_READONLY: Int = -2147024891

public val STIERR_SHARING_VIOLATION: Hresult = 0x80070020u.toInt()

public val STIERR_UNSUPPORTED: Int = -2147467263

public val STI_ADD_DEVICE_BROADCAST_ACTION: Pcstr = s("Arrival")

public val STI_ADD_DEVICE_BROADCAST_STRING: Pcstr = s("STI\\")

public val STI_CHANGENOEFFECT: Int = 1

public val STI_DEVICE_CREATE_BOTH: UInt = 3u

public val STI_DEVICE_CREATE_DATA: UInt = 2u

public val STI_DEVICE_CREATE_FOR_MONITOR: UInt = 16777216u

public val STI_DEVICE_CREATE_MASK: UInt = 65535u

public val STI_DEVICE_CREATE_STATUS: UInt = 1u

public val STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP: Pcwstr = w("DefaultLaunchApp")

public val STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP_A: Pcstr = s("DefaultLaunchApp")

public val STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS: Pcwstr = w("DisableNotifications")

public val STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS_A: Pcstr = s("DisableNotifications")

public val STI_DEVICE_VALUE_ICM_PROFILE: Pcwstr = w("ICMProfile")

public val STI_DEVICE_VALUE_ICM_PROFILE_A: Pcstr = s("ICMProfile")

public val STI_DEVICE_VALUE_ISIS_NAME: Pcwstr = w("ISISDriverName")

public val STI_DEVICE_VALUE_ISIS_NAME_A: Pcstr = s("ISISDriverName")

public val STI_DEVICE_VALUE_TIMEOUT: Pcwstr = w("PollTimeout")

public val STI_DEVICE_VALUE_TIMEOUT_A: Pcstr = s("PollTimeout")

public val STI_DEVICE_VALUE_TWAIN_NAME: Pcwstr = w("TwainDS")

public val STI_DEVICE_VALUE_TWAIN_NAME_A: Pcstr = s("TwainDS")

public val STI_DEVSTATUS_EVENTS_STATE: UInt = 2u

public val STI_DEVSTATUS_ONLINE_STATE: UInt = 1u

public val STI_DIAGCODE_HWPRESENCE: UInt = 1u

public val STI_ERROR_NO_ERROR: Int = 0

public val STI_EVENTHANDLING_ENABLED: UInt = 1u

public val STI_EVENTHANDLING_PENDING: UInt = 4u

public val STI_EVENTHANDLING_POLLING: UInt = 2u

public val STI_GENCAP_AUTO_PORTSELECT: UInt = 8u

public val STI_GENCAP_COMMON_MASK: UInt = 255u

public val STI_GENCAP_GENERATE_ARRIVALEVENT: UInt = 4u

public val STI_GENCAP_NOTIFICATIONS: UInt = 1u

public val STI_GENCAP_POLLING_NEEDED: UInt = 2u

public val STI_GENCAP_SUBSET: UInt = 32u

public val STI_GENCAP_WIA: UInt = 16u

public val STI_HW_CONFIG_PARALLEL: UInt = 16u

public val STI_HW_CONFIG_SCSI: UInt = 2u

public val STI_HW_CONFIG_SERIAL: UInt = 8u

public val STI_HW_CONFIG_UNKNOWN: UInt = 1u

public val STI_HW_CONFIG_USB: UInt = 4u

public val STI_MAX_INTERNAL_NAME_LENGTH: UInt = 128u

public val STI_NOTCONNECTED: Int = 1

public val STI_OK: Int = 0

public val STI_ONLINESTATE_BUSY: UInt = 256u

public val STI_ONLINESTATE_ERROR: UInt = 4u

public val STI_ONLINESTATE_INITIALIZING: UInt = 1024u

public val STI_ONLINESTATE_IO_ACTIVE: UInt = 128u

public val STI_ONLINESTATE_OFFLINE: UInt = 64u

public val STI_ONLINESTATE_OPERATIONAL: UInt = 1u

public val STI_ONLINESTATE_PAPER_JAM: UInt = 16u

public val STI_ONLINESTATE_PAPER_PROBLEM: UInt = 32u

public val STI_ONLINESTATE_PAUSED: UInt = 8u

public val STI_ONLINESTATE_PENDING: UInt = 2u

public val STI_ONLINESTATE_POWER_SAVE: UInt = 8192u

public val STI_ONLINESTATE_TRANSFERRING: UInt = 512u

public val STI_ONLINESTATE_USER_INTERVENTION: UInt = 4096u

public val STI_ONLINESTATE_WARMING_UP: UInt = 2048u

public val STI_RAW_RESERVED: UInt = 4096u

public val STI_REMOVE_DEVICE_BROADCAST_ACTION: Pcstr = s("Removal")

public val STI_REMOVE_DEVICE_BROADCAST_STRING: Pcstr = s("STI\\")

public val STI_SUBSCRIBE_FLAG_EVENT: UInt = 2u

public val STI_SUBSCRIBE_FLAG_WINDOW: UInt = 1u

public val STI_TRACE_ERROR: UInt = 4u

public val STI_TRACE_INFORMATION: UInt = 1u

public val STI_TRACE_WARNING: UInt = 2u

public val STI_UNICODE: UInt = 1u

public val STI_USD_GENCAP_NATIVE_PUSHSUPPORT: UInt = 1u

public val STI_VERSION: UInt = 2u

public val STI_VERSION_FLAG_MASK: UInt = 4278190080u

public val STI_VERSION_FLAG_UNICODE: UInt = 16777216u

public val STI_VERSION_MIN_ALLOWED: UInt = 2u

public val STI_VERSION_REAL: UInt = 2u

public val SUPPORTS_MSCPLUS_STR: Pcwstr = w("SupportsMSCPlus")

public val SUPPORTS_MSCPLUS_VAL: UInt = 1u

public val STI_DEVICE_TYPE_DEFAULT: StiDeviceMjType = 0

public val STI_DEVICE_TYPE_DIGITAL_CAMERA: StiDeviceMjType = 2

public val STI_DEVICE_TYPE_SCANNER: StiDeviceMjType = 1

public val STI_DEVICE_TYPE_STREAMING_VIDEO: StiDeviceMjType = 3

public val WIA_INCOMPAT_XP: UInt = 1u

public val FAET_FXSSVC_ENDED: FaxAccountEventsTypeEnum = 16

public val FAET_IN_ARCHIVE: FaxAccountEventsTypeEnum = 4

public val FAET_IN_QUEUE: FaxAccountEventsTypeEnum = 1

public val FAET_NONE: FaxAccountEventsTypeEnum = 0

public val FAET_OUT_ARCHIVE: FaxAccountEventsTypeEnum = 8

public val FAET_OUT_QUEUE: FaxAccountEventsTypeEnum = 2

public val FAR2MANAGE_ARCHIVES: FaxAccessRightsEnum2 = 256

public val FAR2MANAGE_CONFIG: FaxAccessRightsEnum2 = 64

public val FAR2MANAGE_OUT_JOBS: FaxAccessRightsEnum2 = 16

public val FAR2MANAGE_RECEIVE_FOLDER: FaxAccessRightsEnum2 = 512

public val FAR2QUERY_ARCHIVES: FaxAccessRightsEnum2 = 128

public val FAR2QUERY_CONFIG: FaxAccessRightsEnum2 = 32

public val FAR2QUERY_OUT_JOBS: FaxAccessRightsEnum2 = 8

public val FAR2SUBMIT_HIGH: FaxAccessRightsEnum2 = 4

public val FAR2SUBMIT_LOW: FaxAccessRightsEnum2 = 1

public val FAR2SUBMIT_NORMAL: FaxAccessRightsEnum2 = 2

public val FAR_MANAGE_CONFIG: FaxAccessRightsEnum = 64

public val FAR_MANAGE_IN_ARCHIVE: FaxAccessRightsEnum = 256

public val FAR_MANAGE_JOBS: FaxAccessRightsEnum = 16

public val FAR_MANAGE_OUT_ARCHIVE: FaxAccessRightsEnum = 1024

public val FAR_QUERY_CONFIG: FaxAccessRightsEnum = 32

public val FAR_QUERY_IN_ARCHIVE: FaxAccessRightsEnum = 128

public val FAR_QUERY_JOBS: FaxAccessRightsEnum = 8

public val FAR_QUERY_OUT_ARCHIVE: FaxAccessRightsEnum = 512

public val FAR_SUBMIT_HIGH: FaxAccessRightsEnum = 4

public val FAR_SUBMIT_LOW: FaxAccessRightsEnum = 1

public val FAR_SUBMIT_NORMAL: FaxAccessRightsEnum = 2

public val FCPT_LOCAL: FaxCoverpageTypeEnum = 1

public val FCPT_NONE: FaxCoverpageTypeEnum = 0

public val FCPT_SERVER: FaxCoverpageTypeEnum = 2

public val FDRM_AUTO_ANSWER: FaxDeviceReceiveModeEnum = 1

public val FDRM_MANUAL_ANSWER: FaxDeviceReceiveModeEnum = 2

public val FDRM_NO_ANSWER: FaxDeviceReceiveModeEnum = 0

public val FGS_ALL_DEV_NOT_VALID: FaxGroupStatusEnum = 2

public val FGS_ALL_DEV_VALID: FaxGroupStatusEnum = 0

public val FGS_EMPTY: FaxGroupStatusEnum = 1

public val FGS_SOME_DEV_NOT_VALID: FaxGroupStatusEnum = 3

public val FJES_ANSWERED: FaxJobExtendedStatusEnum = 5

public val FJES_BAD_ADDRESS: FaxJobExtendedStatusEnum = 10

public val FJES_BUSY: FaxJobExtendedStatusEnum = 8

public val FJES_CALL_ABORTED: FaxJobExtendedStatusEnum = 19

public val FJES_CALL_BLACKLISTED: FaxJobExtendedStatusEnum = 14

public val FJES_CALL_COMPLETED: FaxJobExtendedStatusEnum = 18

public val FJES_CALL_DELAYED: FaxJobExtendedStatusEnum = 13

public val FJES_DIALING: FaxJobExtendedStatusEnum = 3

public val FJES_DISCONNECTED: FaxJobExtendedStatusEnum = 1

public val FJES_FATAL_ERROR: FaxJobExtendedStatusEnum = 12

public val FJES_HANDLED: FaxJobExtendedStatusEnum = 17

public val FJES_INITIALIZING: FaxJobExtendedStatusEnum = 2

public val FJES_LINE_UNAVAILABLE: FaxJobExtendedStatusEnum = 7

public val FJES_NONE: FaxJobExtendedStatusEnum = 0

public val FJES_NOT_FAX_CALL: FaxJobExtendedStatusEnum = 15

public val FJES_NO_ANSWER: FaxJobExtendedStatusEnum = 9

public val FJES_NO_DIAL_TONE: FaxJobExtendedStatusEnum = 11

public val FJES_PARTIALLY_RECEIVED: FaxJobExtendedStatusEnum = 16

public val FJES_PROPRIETARY: FaxJobExtendedStatusEnum = 16777216

public val FJES_RECEIVING: FaxJobExtendedStatusEnum = 6

public val FJES_TRANSMITTING: FaxJobExtendedStatusEnum = 4

public val FJO_DELETE: FaxJobOperationsEnum = 16

public val FJO_PAUSE: FaxJobOperationsEnum = 2

public val FJO_RECIPIENT_INFO: FaxJobOperationsEnum = 32

public val FJO_RESTART: FaxJobOperationsEnum = 8

public val FJO_RESUME: FaxJobOperationsEnum = 4

public val FJO_SENDER_INFO: FaxJobOperationsEnum = 64

public val FJO_VIEW: FaxJobOperationsEnum = 1

public val FJS_CANCELED: FaxJobStatusEnum = 512

public val FJS_CANCELING: FaxJobStatusEnum = 1024

public val FJS_COMPLETED: FaxJobStatusEnum = 256

public val FJS_FAILED: FaxJobStatusEnum = 8

public val FJS_INPROGRESS: FaxJobStatusEnum = 2

public val FJS_NOLINE: FaxJobStatusEnum = 32

public val FJS_PAUSED: FaxJobStatusEnum = 16

public val FJS_PENDING: FaxJobStatusEnum = 1

public val FJS_RETRIES_EXCEEDED: FaxJobStatusEnum = 128

public val FJS_RETRYING: FaxJobStatusEnum = 64

public val FJS_ROUTING: FaxJobStatusEnum = 2048

public val FJT_RECEIVE: FaxJobTypeEnum = 1

public val FJT_ROUTING: FaxJobTypeEnum = 2

public val FJT_SEND: FaxJobTypeEnum = 0

public val FLL_MAX: FaxLogLevelEnum = 3

public val FLL_MED: FaxLogLevelEnum = 2

public val FLL_MIN: FaxLogLevelEnum = 1

public val FLL_NONE: FaxLogLevelEnum = 0

public val FPS_BAD_GUID: FaxProviderStatusEnum = 2

public val FPS_BAD_VERSION: FaxProviderStatusEnum = 3

public val FPS_CANT_INIT: FaxProviderStatusEnum = 6

public val FPS_CANT_LINK: FaxProviderStatusEnum = 5

public val FPS_CANT_LOAD: FaxProviderStatusEnum = 4

public val FPS_SERVER_ERROR: FaxProviderStatusEnum = 1

public val FPS_SUCCESS: FaxProviderStatusEnum = 0

public val FPT_HIGH: FaxPriorityTypeEnum = 2

public val FPT_LOW: FaxPriorityTypeEnum = 0

public val FPT_NORMAL: FaxPriorityTypeEnum = 1

public val FRRC_ANY_CODE: FaxRoutingRuleCodeEnum = 0

public val FRS_ALL_GROUP_DEV_NOT_VALID: FaxRuleStatusEnum = 2

public val FRS_BAD_DEVICE: FaxRuleStatusEnum = 4

public val FRS_EMPTY_GROUP: FaxRuleStatusEnum = 1

public val FRS_SOME_GROUP_DEV_NOT_VALID: FaxRuleStatusEnum = 3

public val FRS_VALID: FaxRuleStatusEnum = 0

public val FRT_MAIL: FaxReceiptTypeEnum = 1

public val FRT_MSGBOX: FaxReceiptTypeEnum = 4

public val FRT_NONE: FaxReceiptTypeEnum = 0

public val FS_API_VERSION_0: FaxServerApiversionEnum = 0

public val FS_API_VERSION_1: FaxServerApiversionEnum = 65536

public val FS_API_VERSION_2: FaxServerApiversionEnum = 131072

public val FS_API_VERSION_3: FaxServerApiversionEnum = 196608

public val FSAT_ANONYMOUS: FaxSmtpAuthenticationTypeEnum = 0

public val FSAT_BASIC: FaxSmtpAuthenticationTypeEnum = 1

public val FSAT_NTLM: FaxSmtpAuthenticationTypeEnum = 2

public val FSET_ACTIVITY: FaxServerEventsTypeEnum = 8

public val FSET_CONFIG: FaxServerEventsTypeEnum = 4

public val FSET_DEVICE_STATUS: FaxServerEventsTypeEnum = 256

public val FSET_FXSSVC_ENDED: FaxServerEventsTypeEnum = 128

public val FSET_INCOMING_CALL: FaxServerEventsTypeEnum = 512

public val FSET_IN_ARCHIVE: FaxServerEventsTypeEnum = 32

public val FSET_IN_QUEUE: FaxServerEventsTypeEnum = 1

public val FSET_NONE: FaxServerEventsTypeEnum = 0

public val FSET_OUT_ARCHIVE: FaxServerEventsTypeEnum = 64

public val FSET_OUT_QUEUE: FaxServerEventsTypeEnum = 2

public val FSET_QUEUE_STATE: FaxServerEventsTypeEnum = 16

public val FST_DISCOUNT_PERIOD: FaxScheduleTypeEnum = 2

public val FST_NOW: FaxScheduleTypeEnum = 0

public val FST_SPECIFIC_TIME: FaxScheduleTypeEnum = 1

public val L_DEFAULT_PREFETCH_SIZE: Int = 100

public val PRV_DEFAULT_PREFETCH_SIZE: UInt = 100u

public val WCHAR_REASSIGN_RECIPIENTS_DELIMITER: UShort = 59u.toUShort()

public val CLSID_STI: Guid = Guid.fromU128(U128(0xb323f8e02e6811d0uL, 0x90ea00aa0060f86cuL))

public val DEVPKEY_WIA_DEVICE_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x6bdd1fc6810f11d0uL, 0xbec708002be2092fuL)), pid = 2u)

public val DEVPKEY_WIA_USD_CLASS_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x6bdd1fc6810f11d0uL, 0xbec708002be2092fuL)), pid = 3u)

public val FAXSRV_DEVICE_NODETYPE_GUID: Guid = Guid.fromU128(U128(0x3115a19a625146acuL, 0x942514782858b8c9uL))

public val FAXSRV_DEVICE_PROVIDER_NODETYPE_GUID: Guid = Guid.fromU128(U128(0xbd38e2acb9264161uL, 0x86400f6956ee2ba3uL))

public val FAXSRV_ROUTING_METHOD_NODETYPE_GUID: Guid = Guid.fromU128(U128(0x220d2cb085a94a43uL, 0xb6e89d66b44f1af5uL))

public val FAX_ACCOUNT: Guid = Guid.fromU128(U128(0xa7e0647f45244464uL, 0xa56db9fe666f715euL))

public val FAX_ACCOUNT_FOLDERS: Guid = Guid.fromU128(U128(0x85398f49c0344a3fuL, 0x821cdb7d685e8129uL))

public val FAX_ACCOUNT_INCOMING_ARCHIVE: Guid = Guid.fromU128(U128(0x14b33db54c404ecfuL, 0x9ef8a360cbe809eduL))

public val FAX_ACCOUNT_INCOMING_QUEUE: Guid = Guid.fromU128(U128(0x9bcf6094b4da45f4uL, 0xb8d6ddeb2186652cuL))

public val FAX_ACCOUNT_OUTGOING_ARCHIVE: Guid = Guid.fromU128(U128(0x851e7af5433a4739uL, 0xa2dfad245c2cb98euL))

public val FAX_ACCOUNT_OUTGOING_QUEUE: Guid = Guid.fromU128(U128(0xfeeceefbc14948bauL, 0xbab8b791e101f62fuL))

public val FAX_ACCOUNT_SET: Guid = Guid.fromU128(U128(0xfbc23c4b79e04291uL, 0xbc56c12e253bbf3auL))

public val FAX_ACCOUNTS: Guid = Guid.fromU128(U128(0xda1f94aaee2c47c0uL, 0x8f4f2a217075b76euL))

public val FAX_ACTIVITY: Guid = Guid.fromU128(U128(0xcfef5d0ee84d462euL, 0xaabb87d31eb04fefuL))

public val FAX_ACTIVITY_LOGGING: Guid = Guid.fromU128(U128(0xf0a0294e3bbd48b8uL, 0x8f138c591a55bdbcuL))

public val FAX_CONFIGURATION: Guid = Guid.fromU128(U128(0x5857326fe7b341a7uL, 0x9c19a91b463e2d56uL))

public val FAX_DEVICE: Guid = Guid.fromU128(U128(0x59e3a5b2d676484buL, 0xa6de720bfa89b5afuL))

public val FAX_DEVICE_IDS: Guid = Guid.fromU128(U128(0xcdc539ea7277460euL, 0x8de048a0a5760d1fuL))

public val FAX_DEVICE_PROVIDER: Guid = Guid.fromU128(U128(0x17cf1aa3f5eb484auL, 0x9c9a4440a5baabfcuL))

public val FAX_DEVICE_PROVIDERS: Guid = Guid.fromU128(U128(0xeb8fe768875a4f5fuL, 0x82c503f23aac1bd7uL))

public val FAX_DEVICES: Guid = Guid.fromU128(U128(0x5589e28e23cb4919uL, 0x8808e6101846e80duL))

public val FAX_DOCUMENT: Guid = Guid.fromU128(U128(0xf3f9f91c838415euL, 0xa4f33e828ca445e0uL))

public val FAX_EVENT_LOGGING: Guid = Guid.fromU128(U128(0xa6850930a0f64a6fuL, 0x95b7db2ebf3d02e3uL))

public val FAX_FOLDERS: Guid = Guid.fromU128(U128(0xc35211d7577648cbuL, 0xaf44c31be3b2cfe5uL))

public val FAX_INBOUND_ROUTING: Guid = Guid.fromU128(U128(0xe80248edad654218uL, 0x8108991924d4e7eduL))

public val FAX_INBOUND_ROUTING_EXTENSION: Guid = Guid.fromU128(U128(0x1d7dfb5172074436uL, 0xa0d924e32ee56988uL))

public val FAX_INBOUND_ROUTING_EXTENSIONS: Guid = Guid.fromU128(U128(0x189a48ed623c4c0duL, 0x80f2d66c7b9efec2uL))

public val FAX_INBOUND_ROUTING_METHOD: Guid = Guid.fromU128(U128(0x4b9fd75c01944b72uL, 0x9ce502a8205ac7d4uL))

public val FAX_INBOUND_ROUTING_METHODS: Guid = Guid.fromU128(U128(0x25fcb76ab7504b82uL, 0x9266fbbbae8922bauL))

public val FAX_INCOMING_ARCHIVE: Guid = Guid.fromU128(U128(0x8426c56a35a14c6fuL, 0xaf93fc952422e2c2uL))

public val FAX_INCOMING_JOB: Guid = Guid.fromU128(U128(0xc47311ecae3241b8uL, 0xae4b3eae0629d0c9uL))

public val FAX_INCOMING_JOBS: Guid = Guid.fromU128(U128(0xa1bb8a4388664fb7uL, 0xa15d6266c875a5ccuL))

public val FAX_INCOMING_MESSAGE: Guid = Guid.fromU128(U128(0x1932fcf79d434d5auL, 0x89ff03861b321736uL))

public val FAX_INCOMING_MESSAGE_ITERATOR: Guid = Guid.fromU128(U128(0x6088e1d83fc845c2uL, 0x87b1909a29607ea9uL))

public val FAX_INCOMING_QUEUE: Guid = Guid.fromU128(U128(0x69131717f3f140e3uL, 0x809da6cbf7bd85e5uL))

public val FAX_JOB_STATUS: Guid = Guid.fromU128(U128(0x7bf222f4be8d442fuL, 0x841d6132742423bbuL))

public val FAX_LOGGING_OPTIONS: Guid = Guid.fromU128(U128(0x1bf9eea6ece04785uL, 0xa18bde56e9eef96auL))

public val FAX_OUTBOUND_ROUTING: Guid = Guid.fromU128(U128(0xc81b385eb8694afduL, 0x86c0616498ed9be2uL))

public val FAX_OUTBOUND_ROUTING_GROUP: Guid = Guid.fromU128(U128(0x213f3e067914d77uL, 0xa27104d2357c50d6uL))

public val FAX_OUTBOUND_ROUTING_GROUPS: Guid = Guid.fromU128(U128(0xccbea1a5e2b44b57uL, 0x9421b04b6289464buL))

public val FAX_OUTBOUND_ROUTING_RULE: Guid = Guid.fromU128(U128(0x6549eebf08d1475auL, 0x828b3bf105952fa0uL))

public val FAX_OUTBOUND_ROUTING_RULES: Guid = Guid.fromU128(U128(0xd385becae6244473uL, 0xbfaa9f4000831f54uL))

public val FAX_OUTGOING_ARCHIVE: Guid = Guid.fromU128(U128(0x43c28403e04f474duL, 0x990cb94669148f59uL))

public val FAX_OUTGOING_JOB: Guid = Guid.fromU128(U128(0x71bb429c0ef94915uL, 0xbec5a5d897a3e924uL))

public val FAX_OUTGOING_JOBS: Guid = Guid.fromU128(U128(0x92bf2a6c37be43fauL, 0xa37dcb0e5f753b35uL))

public val FAX_OUTGOING_MESSAGE: Guid = Guid.fromU128(U128(0x91b4a3784ad84aefuL, 0xa4dc97d96e939a3auL))

public val FAX_OUTGOING_MESSAGE_ITERATOR: Guid = Guid.fromU128(U128(0x8a3224d0d30b49deuL, 0x9813cb385790fbbbuL))

public val FAX_OUTGOING_QUEUE: Guid = Guid.fromU128(U128(0x7421169e8c434b0duL, 0xbb16645c8fa40357uL))

public val FAX_RECEIPT_OPTIONS: Guid = Guid.fromU128(U128(0x6982487b227b4c96uL, 0xa61c248348b05ab6uL))

public val FAX_RECIPIENT: Guid = Guid.fromU128(U128(0x60bf33017df84bd8uL, 0x91487b5801f9efdfuL))

public val FAX_RECIPIENTS: Guid = Guid.fromU128(U128(0xea9bdf5310a94d4fuL, 0xa06763c8f84f01b0uL))

public val FAX_SECURITY: Guid = Guid.fromU128(U128(0x10c4dddeabf043dfuL, 0x964f7f3ac21a4c7buL))

public val FAX_SECURITY2: Guid = Guid.fromU128(U128(0x735c1248ec894c30uL, 0xa127656e92e3c4eauL))

public val FAX_SENDER: Guid = Guid.fromU128(U128(0x265d84d018504360uL, 0xb7c8758bbb5f0b96uL))

public val FAX_SERVER: Guid = Guid.fromU128(U128(0xcda8acb08cf54f6cuL, 0x9ba25931d40c8caeuL))

public val GUID_DEVICE_ARRIVED_LAUNCH: Guid = Guid.fromU128(U128(0x740d9ee670f111d1uL, 0xad1000a02438ad48uL))

public val GUID_STI_USER_DEFINED1: Guid = Guid.fromU128(U128(0xc00eb7958c6e11d2uL, 0x977a0000f87a926fuL))

public val GUID_STI_USER_DEFINED2: Guid = Guid.fromU128(U128(0xc77ae9c58c6e11d2uL, 0x977a0000f87a926fuL))

public val GUID_STI_USER_DEFINED3: Guid = Guid.fromU128(U128(0xc77ae9c68c6e11d2uL, 0x977a0000f87a926fuL))

public val GUID_SCAN_FAX_IMAGE: Guid = Guid.fromU128(U128(0xc00eb7938c6e11d2uL, 0x977a0000f87a926fuL))

public val GUID_SCAN_IMAGE: Guid = Guid.fromU128(U128(0xa6c5a7158c6e11d2uL, 0x977a0000f87a926fuL))

public val GUID_SCAN_PRINT_IMAGE: Guid = Guid.fromU128(U128(0xb441f4258c6e11d2uL, 0x977a0000f87a926fuL))
