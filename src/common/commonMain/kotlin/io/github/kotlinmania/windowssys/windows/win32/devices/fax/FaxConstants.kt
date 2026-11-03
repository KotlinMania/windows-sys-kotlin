package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public val CF_MSFAXSRV_DEVICE_ID: PCWSTR = w("FAXSRV_DeviceID")

public val CF_MSFAXSRV_FSP_GUID: PCWSTR = w("FAXSRV_FSPGuid")

public val CF_MSFAXSRV_ROUTEEXT_NAME: PCWSTR = w("FAXSRV_RoutingExtName")

public val CF_MSFAXSRV_ROUTING_METHOD_GUID: PCWSTR = w("FAXSRV_RoutingMethodGuid")

public val CF_MSFAXSRV_SERVER_NAME: PCWSTR = w("FAXSRV_ServerName")

public val CLSID_Sti: GUID = GUID.from_u128(0xb323f8e02e6811d0uL, 0x90ea00aa0060f86cuL)

public val DEVPKEY_WIA_DeviceType: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x6bdd1fc6810f11d0uL, 0xbec708002be2092fuL), pid = 2u)

public val DEVPKEY_WIA_USDClassId: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x6bdd1fc6810f11d0uL, 0xbec708002be2092fuL), pid = 3u)

public val DEV_ID_SRC_FAX: FAX_ENUM_DEVICE_ID_SOURCE = 0

public val DEV_ID_SRC_TAPI: FAX_ENUM_DEVICE_ID_SOURCE = 1

public val DRT_EMAIL: FAX_ENUM_DELIVERY_REPORT_TYPES = 1

public val DRT_INBOX: FAX_ENUM_DELIVERY_REPORT_TYPES = 2

public val DRT_NONE: FAX_ENUM_DELIVERY_REPORT_TYPES = 0

public val FAXDEVRECEIVE_SIZE: UInt = 4096u

public val FAXDEVREPORTSTATUS_SIZE: UInt = 4096u

public val FAXLOG_CATEGORY_INBOUND: FAX_ENUM_LOG_CATEGORIES = 3

public val FAXLOG_CATEGORY_INIT: FAX_ENUM_LOG_CATEGORIES = 1

public val FAXLOG_CATEGORY_OUTBOUND: FAX_ENUM_LOG_CATEGORIES = 2

public val FAXLOG_CATEGORY_UNKNOWN: FAX_ENUM_LOG_CATEGORIES = 4

public val FAXLOG_LEVEL_MAX: FAX_ENUM_LOG_LEVELS = 3

public val FAXLOG_LEVEL_MED: FAX_ENUM_LOG_LEVELS = 2

public val FAXLOG_LEVEL_MIN: FAX_ENUM_LOG_LEVELS = 1

public val FAXLOG_LEVEL_NONE: FAX_ENUM_LOG_LEVELS = 0

public val FAXSRV_DEVICE_NODETYPE_GUID: GUID = GUID.from_u128(0x3115a19a625146acuL, 0x942514782858b8c9uL)

public val FAXSRV_DEVICE_PROVIDER_NODETYPE_GUID: GUID = GUID.from_u128(0xbd38e2acb9264161uL, 0x86400f6956ee2ba3uL)

public val FAXSRV_ROUTING_METHOD_NODETYPE_GUID: GUID = GUID.from_u128(0x220d2cb085a94a43uL, 0xb6e89d66b44f1af5uL)

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

public val FAX_E_BAD_GROUP_CONFIGURATION: HRESULT = 0x80041B5Bu.toInt()

public val FAX_E_DEVICE_NUM_LIMIT_EXCEEDED: HRESULT = 0x80041B62u.toInt()

public val FAX_E_DIRECTORY_IN_USE: HRESULT = 0x80041B5Fu.toInt()

public val FAX_E_FILE_ACCESS_DENIED: HRESULT = 0x80041B60u.toInt()

public val FAX_E_GROUP_IN_USE: HRESULT = 0x80041B5Cu.toInt()

public val FAX_E_GROUP_NOT_FOUND: HRESULT = 0x80041B5Au.toInt()

public val FAX_E_MESSAGE_NOT_FOUND: HRESULT = 0x80041B61u.toInt()

public val FAX_E_NOT_NTFS: HRESULT = 0x80041B5Eu.toInt()

public val FAX_E_NOT_SUPPORTED_ON_THIS_SKU: HRESULT = 0x80041B63u.toInt()

public val FAX_E_RECIPIENTS_LIMIT: HRESULT = 0x80041B65u.toInt()

public val FAX_E_RULE_NOT_FOUND: HRESULT = 0x80041B5Du.toInt()

public val FAX_E_SRV_OUTOFMEMORY: HRESULT = 0x80041B59u.toInt()

public val FAX_E_VERSION_MISMATCH: HRESULT = 0x80041B64u.toInt()

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

public val FaxAccount: GUID = GUID.from_u128(0xa7e0647f45244464uL, 0xa56db9fe666f715euL)

public val FaxAccountFolders: GUID = GUID.from_u128(0x85398f49c0344a3fuL, 0x821cdb7d685e8129uL)

public val FaxAccountIncomingArchive: GUID = GUID.from_u128(0x14b33db54c404ecfuL, 0x9ef8a360cbe809eduL)

public val FaxAccountIncomingQueue: GUID = GUID.from_u128(0x9bcf6094b4da45f4uL, 0xb8d6ddeb2186652cuL)

public val FaxAccountOutgoingArchive: GUID = GUID.from_u128(0x851e7af5433a4739uL, 0xa2dfad245c2cb98euL)

public val FaxAccountOutgoingQueue: GUID = GUID.from_u128(0xfeeceefbc14948bauL, 0xbab8b791e101f62fuL)

public val FaxAccountSet: GUID = GUID.from_u128(0xfbc23c4b79e04291uL, 0xbc56c12e253bbf3auL)

public val FaxAccounts: GUID = GUID.from_u128(0xda1f94aaee2c47c0uL, 0x8f4f2a217075b76euL)

public val FaxActivity: GUID = GUID.from_u128(0xcfef5d0ee84d462euL, 0xaabb87d31eb04fefuL)

public val FaxActivityLogging: GUID = GUID.from_u128(0xf0a0294e3bbd48b8uL, 0x8f138c591a55bdbcuL)

public val FaxConfiguration: GUID = GUID.from_u128(0x5857326fe7b341a7uL, 0x9c19a91b463e2d56uL)

public val FaxDevice: GUID = GUID.from_u128(0x59e3a5b2d676484buL, 0xa6de720bfa89b5afuL)

public val FaxDeviceIds: GUID = GUID.from_u128(0xcdc539ea7277460euL, 0x8de048a0a5760d1fuL)

public val FaxDeviceProvider: GUID = GUID.from_u128(0x17cf1aa3f5eb484auL, 0x9c9a4440a5baabfcuL)

public val FaxDeviceProviders: GUID = GUID.from_u128(0xeb8fe768875a4f5fuL, 0x82c503f23aac1bd7uL)

public val FaxDevices: GUID = GUID.from_u128(0x5589e28e23cb4919uL, 0x8808e6101846e80duL)

public val FaxDocument: GUID = GUID.from_u128(0xf3f9f91c838415euL, 0xa4f33e828ca445e0uL)

public val FaxEventLogging: GUID = GUID.from_u128(0xa6850930a0f64a6fuL, 0x95b7db2ebf3d02e3uL)

public val FaxFolders: GUID = GUID.from_u128(0xc35211d7577648cbuL, 0xaf44c31be3b2cfe5uL)

public val FaxInboundRouting: GUID = GUID.from_u128(0xe80248edad654218uL, 0x8108991924d4e7eduL)

public val FaxInboundRoutingExtension: GUID = GUID.from_u128(0x1d7dfb5172074436uL, 0xa0d924e32ee56988uL)

public val FaxInboundRoutingExtensions: GUID = GUID.from_u128(0x189a48ed623c4c0duL, 0x80f2d66c7b9efec2uL)

public val FaxInboundRoutingMethod: GUID = GUID.from_u128(0x4b9fd75c01944b72uL, 0x9ce502a8205ac7d4uL)

public val FaxInboundRoutingMethods: GUID = GUID.from_u128(0x25fcb76ab7504b82uL, 0x9266fbbbae8922bauL)

public val FaxIncomingArchive: GUID = GUID.from_u128(0x8426c56a35a14c6fuL, 0xaf93fc952422e2c2uL)

public val FaxIncomingJob: GUID = GUID.from_u128(0xc47311ecae3241b8uL, 0xae4b3eae0629d0c9uL)

public val FaxIncomingJobs: GUID = GUID.from_u128(0xa1bb8a4388664fb7uL, 0xa15d6266c875a5ccuL)

public val FaxIncomingMessage: GUID = GUID.from_u128(0x1932fcf79d434d5auL, 0x89ff03861b321736uL)

public val FaxIncomingMessageIterator: GUID = GUID.from_u128(0x6088e1d83fc845c2uL, 0x87b1909a29607ea9uL)

public val FaxIncomingQueue: GUID = GUID.from_u128(0x69131717f3f140e3uL, 0x809da6cbf7bd85e5uL)

public val FaxJobStatus: GUID = GUID.from_u128(0x7bf222f4be8d442fuL, 0x841d6132742423bbuL)

public val FaxLoggingOptions: GUID = GUID.from_u128(0x1bf9eea6ece04785uL, 0xa18bde56e9eef96auL)

public val FaxOutboundRouting: GUID = GUID.from_u128(0xc81b385eb8694afduL, 0x86c0616498ed9be2uL)

public val FaxOutboundRoutingGroup: GUID = GUID.from_u128(0x213f3e067914d77uL, 0xa27104d2357c50d6uL)

public val FaxOutboundRoutingGroups: GUID = GUID.from_u128(0xccbea1a5e2b44b57uL, 0x9421b04b6289464buL)

public val FaxOutboundRoutingRule: GUID = GUID.from_u128(0x6549eebf08d1475auL, 0x828b3bf105952fa0uL)

public val FaxOutboundRoutingRules: GUID = GUID.from_u128(0xd385becae6244473uL, 0xbfaa9f4000831f54uL)

public val FaxOutgoingArchive: GUID = GUID.from_u128(0x43c28403e04f474duL, 0x990cb94669148f59uL)

public val FaxOutgoingJob: GUID = GUID.from_u128(0x71bb429c0ef94915uL, 0xbec5a5d897a3e924uL)

public val FaxOutgoingJobs: GUID = GUID.from_u128(0x92bf2a6c37be43fauL, 0xa37dcb0e5f753b35uL)

public val FaxOutgoingMessage: GUID = GUID.from_u128(0x91b4a3784ad84aefuL, 0xa4dc97d96e939a3auL)

public val FaxOutgoingMessageIterator: GUID = GUID.from_u128(0x8a3224d0d30b49deuL, 0x9813cb385790fbbbuL)

public val FaxOutgoingQueue: GUID = GUID.from_u128(0x7421169e8c434b0duL, 0xbb16645c8fa40357uL)

public val FaxReceiptOptions: GUID = GUID.from_u128(0x6982487b227b4c96uL, 0xa61c248348b05ab6uL)

public val FaxRecipient: GUID = GUID.from_u128(0x60bf33017df84bd8uL, 0x91487b5801f9efdfuL)

public val FaxRecipients: GUID = GUID.from_u128(0xea9bdf5310a94d4fuL, 0xa06763c8f84f01b0uL)

public val FaxSecurity: GUID = GUID.from_u128(0x10c4dddeabf043dfuL, 0x964f7f3ac21a4c7buL)

public val FaxSecurity2: GUID = GUID.from_u128(0x735c1248ec894c30uL, 0xa127656e92e3c4eauL)

public val FaxSender: GUID = GUID.from_u128(0x265d84d018504360uL, 0xb7c8758bbb5f0b96uL)

public val FaxServer: GUID = GUID.from_u128(0xcda8acb08cf54f6cuL, 0x9ba25931d40c8caeuL)

public val GUID_DeviceArrivedLaunch: GUID = GUID.from_u128(0x740d9ee670f111d1uL, 0xad1000a02438ad48uL)

public val GUID_STIUserDefined1: GUID = GUID.from_u128(0xc00eb7958c6e11d2uL, 0x977a0000f87a926fuL)

public val GUID_STIUserDefined2: GUID = GUID.from_u128(0xc77ae9c58c6e11d2uL, 0x977a0000f87a926fuL)

public val GUID_STIUserDefined3: GUID = GUID.from_u128(0xc77ae9c68c6e11d2uL, 0x977a0000f87a926fuL)

public val GUID_ScanFaxImage: GUID = GUID.from_u128(0xc00eb7938c6e11d2uL, 0x977a0000f87a926fuL)

public val GUID_ScanImage: GUID = GUID.from_u128(0xa6c5a7158c6e11d2uL, 0x977a0000f87a926fuL)

public val GUID_ScanPrintImage: GUID = GUID.from_u128(0xb441f4258c6e11d2uL, 0x977a0000f87a926fuL)

public val IS_DIGITAL_CAMERA_STR: PCWSTR = w("IsDigitalCamera")

public val IS_DIGITAL_CAMERA_VAL: UInt = 1u

public val JC_DELETE: FAX_ENUM_JOB_COMMANDS = 1

public val JC_PAUSE: FAX_ENUM_JOB_COMMANDS = 2

public val JC_RESUME: FAX_ENUM_JOB_COMMANDS = 3

public val JC_UNKNOWN: FAX_ENUM_JOB_COMMANDS = 0

public val JSA_DISCOUNT_PERIOD: FAX_ENUM_JOB_SEND_ATTRIBUTES = 2

public val JSA_NOW: FAX_ENUM_JOB_SEND_ATTRIBUTES = 0

public val JSA_SPECIFIC_TIME: FAX_ENUM_JOB_SEND_ATTRIBUTES = 1

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

public val MS_FAXROUTE_EMAIL_GUID: PCWSTR = w("{6bbf7bfe-9af2-11d0-abf7-00c04fd91a4e}")

public val MS_FAXROUTE_FOLDER_GUID: PCWSTR = w("{92041a90-9af2-11d0-abf7-00c04fd91a4e}")

public val MS_FAXROUTE_PRINTING_GUID: PCWSTR = w("{aec1b37c-9af2-11d0-abf7-00c04fd91a4e}")

public val PORT_OPEN_MODIFY: FAX_ENUM_PORT_OPEN_TYPE = 2

public val PORT_OPEN_QUERY: FAX_ENUM_PORT_OPEN_TYPE = 1

public val QUERY_STATUS: FAXROUTE_ENABLE = -1

public val REGSTR_VAL_BAUDRATE: PCWSTR = w("BaudRate")

public val REGSTR_VAL_BAUDRATE_A: PCSTR = s("BaudRate")

public val REGSTR_VAL_DATA_W: PCWSTR = w("DeviceData")

public val REGSTR_VAL_DEVICESUBTYPE_W: PCWSTR = w("DeviceSubType")

public val REGSTR_VAL_DEVICETYPE_W: PCWSTR = w("DeviceType")

public val REGSTR_VAL_DEVICE_NAME_W: PCWSTR = w("DriverDesc")

public val REGSTR_VAL_DEV_NAME_W: PCWSTR = w("DeviceName")

public val REGSTR_VAL_DRIVER_DESC_W: PCWSTR = w("DriverDesc")

public val REGSTR_VAL_FRIENDLY_NAME_W: PCWSTR = w("FriendlyName")

public val REGSTR_VAL_GENERIC_CAPS_W: PCWSTR = w("Capabilities")

public val REGSTR_VAL_GUID: PCWSTR = w("GUID")

public val REGSTR_VAL_GUID_W: PCWSTR = w("GUID")

public val REGSTR_VAL_HARDWARE: PCWSTR = w("HardwareConfig")

public val REGSTR_VAL_HARDWARE_W: PCWSTR = w("HardwareConfig")

public val REGSTR_VAL_LAUNCHABLE: PCWSTR = w("Launchable")

public val REGSTR_VAL_LAUNCHABLE_W: PCWSTR = w("Launchable")

public val REGSTR_VAL_LAUNCH_APPS: PCWSTR = w("LaunchApplications")

public val REGSTR_VAL_LAUNCH_APPS_W: PCWSTR = w("LaunchApplications")

public val REGSTR_VAL_SHUTDOWNDELAY: PCWSTR = w("ShutdownIfUnusedDelay")

public val REGSTR_VAL_SHUTDOWNDELAY_W: PCWSTR = w("ShutdownIfUnusedDelay")

public val REGSTR_VAL_TYPE_W: PCWSTR = w("Type")

public val REGSTR_VAL_VENDOR_NAME_W: PCWSTR = w("Vendor")

public val SEND_TO_FAX_RECIPIENT_ATTACHMENT: SendToMode = 0

public val STATUS_DISABLE: FAXROUTE_ENABLE = 0

public val STATUS_ENABLE: FAXROUTE_ENABLE = 1

public val STIEDFL_ALLDEVICES: UInt = 0u

public val STIEDFL_ATTACHEDONLY: UInt = 1u

public val STIERR_ALREADY_INITIALIZED: HRESULT = 0x800704DFu.toInt()

public val STIERR_BADDRIVER: HRESULT = 0x80070077u.toInt()

public val STIERR_BETA_VERSION: HRESULT = 0x80070481u.toInt()

public val STIERR_DEVICENOTREG: Int = -2147221164

public val STIERR_DEVICE_LOCKED: HRESULT = 0x80070021u.toInt()

public val STIERR_DEVICE_NOTREADY: HRESULT = 0x80070015u.toInt()

public val STIERR_GENERIC: Int = -2147467259

public val STIERR_HANDLEEXISTS: HRESULT = 0x800700B7u.toInt()

public val STIERR_INVALID_DEVICE_NAME: HRESULT = 0x8007007Bu.toInt()

public val STIERR_INVALID_HW_TYPE: HRESULT = 0x8007000Du.toInt()

public val STIERR_INVALID_PARAM: Int = -2147024809

public val STIERR_NEEDS_LOCK: HRESULT = 0x8007009Eu.toInt()

public val STIERR_NOEVENTS: HRESULT = 0x80070103u.toInt()

public val STIERR_NOINTERFACE: Int = -2147467262

public val STIERR_NOTINITIALIZED: Int = -2147024891

public val STIERR_NOT_INITIALIZED: HRESULT = 0x80070015u.toInt()

public val STIERR_OBJECTNOTFOUND: HRESULT = 0x80070002u.toInt()

public val STIERR_OLD_VERSION: HRESULT = 0x8007047Eu.toInt()

public val STIERR_OUTOFMEMORY: Int = -2147024882

public val STIERR_READONLY: Int = -2147024891

public val STIERR_SHARING_VIOLATION: HRESULT = 0x80070020u.toInt()

public val STIERR_UNSUPPORTED: Int = -2147467263

public val STI_ADD_DEVICE_BROADCAST_ACTION: PCSTR = s("Arrival")

public val STI_ADD_DEVICE_BROADCAST_STRING: PCSTR = s("STI\\")

public val STI_CHANGENOEFFECT: Int = 1

public val STI_DEVICE_CREATE_BOTH: UInt = 3u

public val STI_DEVICE_CREATE_DATA: UInt = 2u

public val STI_DEVICE_CREATE_FOR_MONITOR: UInt = 16777216u

public val STI_DEVICE_CREATE_MASK: UInt = 65535u

public val STI_DEVICE_CREATE_STATUS: UInt = 1u

public val STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP: PCWSTR = w("DefaultLaunchApp")

public val STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP_A: PCSTR = s("DefaultLaunchApp")

public val STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS: PCWSTR = w("DisableNotifications")

public val STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS_A: PCSTR = s("DisableNotifications")

public val STI_DEVICE_VALUE_ICM_PROFILE: PCWSTR = w("ICMProfile")

public val STI_DEVICE_VALUE_ICM_PROFILE_A: PCSTR = s("ICMProfile")

public val STI_DEVICE_VALUE_ISIS_NAME: PCWSTR = w("ISISDriverName")

public val STI_DEVICE_VALUE_ISIS_NAME_A: PCSTR = s("ISISDriverName")

public val STI_DEVICE_VALUE_TIMEOUT: PCWSTR = w("PollTimeout")

public val STI_DEVICE_VALUE_TIMEOUT_A: PCSTR = s("PollTimeout")

public val STI_DEVICE_VALUE_TWAIN_NAME: PCWSTR = w("TwainDS")

public val STI_DEVICE_VALUE_TWAIN_NAME_A: PCSTR = s("TwainDS")

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

public val STI_REMOVE_DEVICE_BROADCAST_ACTION: PCSTR = s("Removal")

public val STI_REMOVE_DEVICE_BROADCAST_STRING: PCSTR = s("STI\\")

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

public val SUPPORTS_MSCPLUS_STR: PCWSTR = w("SupportsMSCPlus")

public val SUPPORTS_MSCPLUS_VAL: UInt = 1u

public val StiDeviceTypeDefault: STI_DEVICE_MJ_TYPE = 0

public val StiDeviceTypeDigitalCamera: STI_DEVICE_MJ_TYPE = 2

public val StiDeviceTypeScanner: STI_DEVICE_MJ_TYPE = 1

public val StiDeviceTypeStreamingVideo: STI_DEVICE_MJ_TYPE = 3

public val WIA_INCOMPAT_XP: UInt = 1u

public val faetFXSSVC_ENDED: FAX_ACCOUNT_EVENTS_TYPE_ENUM = 16

public val faetIN_ARCHIVE: FAX_ACCOUNT_EVENTS_TYPE_ENUM = 4

public val faetIN_QUEUE: FAX_ACCOUNT_EVENTS_TYPE_ENUM = 1

public val faetNONE: FAX_ACCOUNT_EVENTS_TYPE_ENUM = 0

public val faetOUT_ARCHIVE: FAX_ACCOUNT_EVENTS_TYPE_ENUM = 8

public val faetOUT_QUEUE: FAX_ACCOUNT_EVENTS_TYPE_ENUM = 2

public val far2MANAGE_ARCHIVES: FAX_ACCESS_RIGHTS_ENUM_2 = 256

public val far2MANAGE_CONFIG: FAX_ACCESS_RIGHTS_ENUM_2 = 64

public val far2MANAGE_OUT_JOBS: FAX_ACCESS_RIGHTS_ENUM_2 = 16

public val far2MANAGE_RECEIVE_FOLDER: FAX_ACCESS_RIGHTS_ENUM_2 = 512

public val far2QUERY_ARCHIVES: FAX_ACCESS_RIGHTS_ENUM_2 = 128

public val far2QUERY_CONFIG: FAX_ACCESS_RIGHTS_ENUM_2 = 32

public val far2QUERY_OUT_JOBS: FAX_ACCESS_RIGHTS_ENUM_2 = 8

public val far2SUBMIT_HIGH: FAX_ACCESS_RIGHTS_ENUM_2 = 4

public val far2SUBMIT_LOW: FAX_ACCESS_RIGHTS_ENUM_2 = 1

public val far2SUBMIT_NORMAL: FAX_ACCESS_RIGHTS_ENUM_2 = 2

public val farMANAGE_CONFIG: FAX_ACCESS_RIGHTS_ENUM = 64

public val farMANAGE_IN_ARCHIVE: FAX_ACCESS_RIGHTS_ENUM = 256

public val farMANAGE_JOBS: FAX_ACCESS_RIGHTS_ENUM = 16

public val farMANAGE_OUT_ARCHIVE: FAX_ACCESS_RIGHTS_ENUM = 1024

public val farQUERY_CONFIG: FAX_ACCESS_RIGHTS_ENUM = 32

public val farQUERY_IN_ARCHIVE: FAX_ACCESS_RIGHTS_ENUM = 128

public val farQUERY_JOBS: FAX_ACCESS_RIGHTS_ENUM = 8

public val farQUERY_OUT_ARCHIVE: FAX_ACCESS_RIGHTS_ENUM = 512

public val farSUBMIT_HIGH: FAX_ACCESS_RIGHTS_ENUM = 4

public val farSUBMIT_LOW: FAX_ACCESS_RIGHTS_ENUM = 1

public val farSUBMIT_NORMAL: FAX_ACCESS_RIGHTS_ENUM = 2

public val fcptLOCAL: FAX_COVERPAGE_TYPE_ENUM = 1

public val fcptNONE: FAX_COVERPAGE_TYPE_ENUM = 0

public val fcptSERVER: FAX_COVERPAGE_TYPE_ENUM = 2

public val fdrmAUTO_ANSWER: FAX_DEVICE_RECEIVE_MODE_ENUM = 1

public val fdrmMANUAL_ANSWER: FAX_DEVICE_RECEIVE_MODE_ENUM = 2

public val fdrmNO_ANSWER: FAX_DEVICE_RECEIVE_MODE_ENUM = 0

public val fgsALL_DEV_NOT_VALID: FAX_GROUP_STATUS_ENUM = 2

public val fgsALL_DEV_VALID: FAX_GROUP_STATUS_ENUM = 0

public val fgsEMPTY: FAX_GROUP_STATUS_ENUM = 1

public val fgsSOME_DEV_NOT_VALID: FAX_GROUP_STATUS_ENUM = 3

public val fjesANSWERED: FAX_JOB_EXTENDED_STATUS_ENUM = 5

public val fjesBAD_ADDRESS: FAX_JOB_EXTENDED_STATUS_ENUM = 10

public val fjesBUSY: FAX_JOB_EXTENDED_STATUS_ENUM = 8

public val fjesCALL_ABORTED: FAX_JOB_EXTENDED_STATUS_ENUM = 19

public val fjesCALL_BLACKLISTED: FAX_JOB_EXTENDED_STATUS_ENUM = 14

public val fjesCALL_COMPLETED: FAX_JOB_EXTENDED_STATUS_ENUM = 18

public val fjesCALL_DELAYED: FAX_JOB_EXTENDED_STATUS_ENUM = 13

public val fjesDIALING: FAX_JOB_EXTENDED_STATUS_ENUM = 3

public val fjesDISCONNECTED: FAX_JOB_EXTENDED_STATUS_ENUM = 1

public val fjesFATAL_ERROR: FAX_JOB_EXTENDED_STATUS_ENUM = 12

public val fjesHANDLED: FAX_JOB_EXTENDED_STATUS_ENUM = 17

public val fjesINITIALIZING: FAX_JOB_EXTENDED_STATUS_ENUM = 2

public val fjesLINE_UNAVAILABLE: FAX_JOB_EXTENDED_STATUS_ENUM = 7

public val fjesNONE: FAX_JOB_EXTENDED_STATUS_ENUM = 0

public val fjesNOT_FAX_CALL: FAX_JOB_EXTENDED_STATUS_ENUM = 15

public val fjesNO_ANSWER: FAX_JOB_EXTENDED_STATUS_ENUM = 9

public val fjesNO_DIAL_TONE: FAX_JOB_EXTENDED_STATUS_ENUM = 11

public val fjesPARTIALLY_RECEIVED: FAX_JOB_EXTENDED_STATUS_ENUM = 16

public val fjesPROPRIETARY: FAX_JOB_EXTENDED_STATUS_ENUM = 16777216

public val fjesRECEIVING: FAX_JOB_EXTENDED_STATUS_ENUM = 6

public val fjesTRANSMITTING: FAX_JOB_EXTENDED_STATUS_ENUM = 4

public val fjoDELETE: FAX_JOB_OPERATIONS_ENUM = 16

public val fjoPAUSE: FAX_JOB_OPERATIONS_ENUM = 2

public val fjoRECIPIENT_INFO: FAX_JOB_OPERATIONS_ENUM = 32

public val fjoRESTART: FAX_JOB_OPERATIONS_ENUM = 8

public val fjoRESUME: FAX_JOB_OPERATIONS_ENUM = 4

public val fjoSENDER_INFO: FAX_JOB_OPERATIONS_ENUM = 64

public val fjoVIEW: FAX_JOB_OPERATIONS_ENUM = 1

public val fjsCANCELED: FAX_JOB_STATUS_ENUM = 512

public val fjsCANCELING: FAX_JOB_STATUS_ENUM = 1024

public val fjsCOMPLETED: FAX_JOB_STATUS_ENUM = 256

public val fjsFAILED: FAX_JOB_STATUS_ENUM = 8

public val fjsINPROGRESS: FAX_JOB_STATUS_ENUM = 2

public val fjsNOLINE: FAX_JOB_STATUS_ENUM = 32

public val fjsPAUSED: FAX_JOB_STATUS_ENUM = 16

public val fjsPENDING: FAX_JOB_STATUS_ENUM = 1

public val fjsRETRIES_EXCEEDED: FAX_JOB_STATUS_ENUM = 128

public val fjsRETRYING: FAX_JOB_STATUS_ENUM = 64

public val fjsROUTING: FAX_JOB_STATUS_ENUM = 2048

public val fjtRECEIVE: FAX_JOB_TYPE_ENUM = 1

public val fjtROUTING: FAX_JOB_TYPE_ENUM = 2

public val fjtSEND: FAX_JOB_TYPE_ENUM = 0

public val fllMAX: FAX_LOG_LEVEL_ENUM = 3

public val fllMED: FAX_LOG_LEVEL_ENUM = 2

public val fllMIN: FAX_LOG_LEVEL_ENUM = 1

public val fllNONE: FAX_LOG_LEVEL_ENUM = 0

public val fpsBAD_GUID: FAX_PROVIDER_STATUS_ENUM = 2

public val fpsBAD_VERSION: FAX_PROVIDER_STATUS_ENUM = 3

public val fpsCANT_INIT: FAX_PROVIDER_STATUS_ENUM = 6

public val fpsCANT_LINK: FAX_PROVIDER_STATUS_ENUM = 5

public val fpsCANT_LOAD: FAX_PROVIDER_STATUS_ENUM = 4

public val fpsSERVER_ERROR: FAX_PROVIDER_STATUS_ENUM = 1

public val fpsSUCCESS: FAX_PROVIDER_STATUS_ENUM = 0

public val fptHIGH: FAX_PRIORITY_TYPE_ENUM = 2

public val fptLOW: FAX_PRIORITY_TYPE_ENUM = 0

public val fptNORMAL: FAX_PRIORITY_TYPE_ENUM = 1

public val frrcANY_CODE: FAX_ROUTING_RULE_CODE_ENUM = 0

public val frsALL_GROUP_DEV_NOT_VALID: FAX_RULE_STATUS_ENUM = 2

public val frsBAD_DEVICE: FAX_RULE_STATUS_ENUM = 4

public val frsEMPTY_GROUP: FAX_RULE_STATUS_ENUM = 1

public val frsSOME_GROUP_DEV_NOT_VALID: FAX_RULE_STATUS_ENUM = 3

public val frsVALID: FAX_RULE_STATUS_ENUM = 0

public val frtMAIL: FAX_RECEIPT_TYPE_ENUM = 1

public val frtMSGBOX: FAX_RECEIPT_TYPE_ENUM = 4

public val frtNONE: FAX_RECEIPT_TYPE_ENUM = 0

public val fsAPI_VERSION_0: FAX_SERVER_APIVERSION_ENUM = 0

public val fsAPI_VERSION_1: FAX_SERVER_APIVERSION_ENUM = 65536

public val fsAPI_VERSION_2: FAX_SERVER_APIVERSION_ENUM = 131072

public val fsAPI_VERSION_3: FAX_SERVER_APIVERSION_ENUM = 196608

public val fsatANONYMOUS: FAX_SMTP_AUTHENTICATION_TYPE_ENUM = 0

public val fsatBASIC: FAX_SMTP_AUTHENTICATION_TYPE_ENUM = 1

public val fsatNTLM: FAX_SMTP_AUTHENTICATION_TYPE_ENUM = 2

public val fsetACTIVITY: FAX_SERVER_EVENTS_TYPE_ENUM = 8

public val fsetCONFIG: FAX_SERVER_EVENTS_TYPE_ENUM = 4

public val fsetDEVICE_STATUS: FAX_SERVER_EVENTS_TYPE_ENUM = 256

public val fsetFXSSVC_ENDED: FAX_SERVER_EVENTS_TYPE_ENUM = 128

public val fsetINCOMING_CALL: FAX_SERVER_EVENTS_TYPE_ENUM = 512

public val fsetIN_ARCHIVE: FAX_SERVER_EVENTS_TYPE_ENUM = 32

public val fsetIN_QUEUE: FAX_SERVER_EVENTS_TYPE_ENUM = 1

public val fsetNONE: FAX_SERVER_EVENTS_TYPE_ENUM = 0

public val fsetOUT_ARCHIVE: FAX_SERVER_EVENTS_TYPE_ENUM = 64

public val fsetOUT_QUEUE: FAX_SERVER_EVENTS_TYPE_ENUM = 2

public val fsetQUEUE_STATE: FAX_SERVER_EVENTS_TYPE_ENUM = 16

public val fstDISCOUNT_PERIOD: FAX_SCHEDULE_TYPE_ENUM = 2

public val fstNOW: FAX_SCHEDULE_TYPE_ENUM = 0

public val fstSPECIFIC_TIME: FAX_SCHEDULE_TYPE_ENUM = 1

public val lDEFAULT_PREFETCH_SIZE: Int = 100

public val prv_DEFAULT_PREFETCH_SIZE: UInt = 100u

public val wcharREASSIGN_RECIPIENTS_DELIMITER: UShort = 59u
