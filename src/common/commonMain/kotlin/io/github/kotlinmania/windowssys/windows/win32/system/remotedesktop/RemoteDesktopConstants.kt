package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public val AA_AUTH_ANY: AAAuthSchemes = 6

public val AA_AUTH_BASIC: AAAuthSchemes = 1

public val AA_AUTH_CONID: AAAuthSchemes = 10

public val AA_AUTH_COOKIE: AAAuthSchemes = 7

public val AA_AUTH_DIGEST: AAAuthSchemes = 8

public val AA_AUTH_LOGGEDONCREDENTIALS: AAAuthSchemes = 4

public val AA_AUTH_MAX: AAAuthSchemes = 12

public val AA_AUTH_MIN: AAAuthSchemes = 0

public val AA_AUTH_NEGOTIATE: AAAuthSchemes = 5

public val AA_AUTH_NTLM: AAAuthSchemes = 2

public val AA_AUTH_ORGID: AAAuthSchemes = 9

public val AA_AUTH_SC: AAAuthSchemes = 3

public val AA_AUTH_SSPI_NTLM: AAAuthSchemes = 11

public val AA_MAIN_SESSION_CLOSED: AAAccountingDataType = 3

public val AA_MAIN_SESSION_CREATION: AAAccountingDataType = 0

public val AA_SUB_SESSION_CLOSED: AAAccountingDataType = 2

public val AA_SUB_SESSION_CREATION: AAAccountingDataType = 1

public val AA_TRUSTEDUSER_TRUSTEDCLIENT: AATrustClassID = 2

public val AA_TRUSTEDUSER_UNTRUSTEDCLIENT: AATrustClassID = 1

public val AA_UNTRUSTED: AATrustClassID = 0

public val ACQUIRE_TARGET_LOCK_TIMEOUT: UInt = 300000u

public val ALLOW_ONLY_SDR_SERVERS: PolicyAttributeType = 7

public val CHANNEL_BUFFER_SIZE: UInt = 65535u

public val CHANNEL_CHUNK_LENGTH: UInt = 1600u

public val CHANNEL_EVENT_CONNECTED: UInt = 1u

public val CHANNEL_EVENT_DATA_RECEIVED: UInt = 10u

public val CHANNEL_EVENT_DISCONNECTED: UInt = 3u

public val CHANNEL_EVENT_INITIALIZED: UInt = 0u

public val CHANNEL_EVENT_TERMINATED: UInt = 4u

public val CHANNEL_EVENT_V1_CONNECTED: UInt = 2u

public val CHANNEL_EVENT_WRITE_CANCELLED: UInt = 12u

public val CHANNEL_EVENT_WRITE_COMPLETE: UInt = 11u

public val CHANNEL_FLAG_FAIL: UInt = 256u

public val CHANNEL_FLAG_FIRST: UInt = 1u

public val CHANNEL_FLAG_LAST: UInt = 2u

public val CHANNEL_FLAG_MIDDLE: UInt = 0u

public val CHANNEL_MAX_COUNT: UInt = 30u

public val CHANNEL_NAME_LEN: UInt = 7u

public val CHANNEL_OPTION_COMPRESS: UInt = 4194304u

public val CHANNEL_OPTION_COMPRESS_RDP: UInt = 8388608u

public val CHANNEL_OPTION_ENCRYPT_CS: UInt = 268435456u

public val CHANNEL_OPTION_ENCRYPT_RDP: UInt = 1073741824u

public val CHANNEL_OPTION_ENCRYPT_SC: UInt = 536870912u

public val CHANNEL_OPTION_INITIALIZED: UInt = 2147483648u

public val CHANNEL_OPTION_PRI_HIGH: UInt = 134217728u

public val CHANNEL_OPTION_PRI_LOW: UInt = 33554432u

public val CHANNEL_OPTION_PRI_MED: UInt = 67108864u

public val CHANNEL_OPTION_REMOTE_CONTROL_PERSISTENT: UInt = 1048576u

public val CHANNEL_OPTION_SHOW_PROTOCOL: UInt = 2097152u

public val CHANNEL_RC_ALREADY_CONNECTED: UInt = 3u

public val CHANNEL_RC_ALREADY_INITIALIZED: UInt = 1u

public val CHANNEL_RC_ALREADY_OPEN: UInt = 14u

public val CHANNEL_RC_BAD_CHANNEL: UInt = 6u

public val CHANNEL_RC_BAD_CHANNEL_HANDLE: UInt = 7u

public val CHANNEL_RC_BAD_INIT_HANDLE: UInt = 9u

public val CHANNEL_RC_BAD_PROC: UInt = 11u

public val CHANNEL_RC_INITIALIZATION_ERROR: UInt = 20u

public val CHANNEL_RC_INVALID_INSTANCE: UInt = 18u

public val CHANNEL_RC_NOT_CONNECTED: UInt = 4u

public val CHANNEL_RC_NOT_INITIALIZED: UInt = 2u

public val CHANNEL_RC_NOT_IN_VIRTUALCHANNELENTRY: UInt = 15u

public val CHANNEL_RC_NOT_OPEN: UInt = 10u

public val CHANNEL_RC_NO_BUFFER: UInt = 8u

public val CHANNEL_RC_NO_MEMORY: UInt = 12u

public val CHANNEL_RC_NULL_DATA: UInt = 16u

public val CHANNEL_RC_OK: UInt = 0u

public val CHANNEL_RC_TOO_MANY_CHANNELS: UInt = 5u

public val CHANNEL_RC_UNKNOWN_CHANNEL_NAME: UInt = 13u

public val CHANNEL_RC_UNSUPPORTED_VERSION: UInt = 19u

public val CHANNEL_RC_ZERO_LENGTH: UInt = 17u

public val CLIENTADDRESS_LENGTH: UInt = 30u

public val CLIENTNAME_LENGTH: UInt = 20u

public val CLIENT_MESSAGE_CONNECTION_ERROR: ClientMessageType = 2

public val CLIENT_MESSAGE_CONNECTION_INVALID: ClientMessageType = 0

public val CLIENT_MESSAGE_CONNECTION_STATUS: ClientMessageType = 1

public val CONNECTION_REQUEST_CANCELLED: ConnectionChangeNotification = 5

public val CONNECTION_REQUEST_FAILED: ConnectionChangeNotification = 2

public val CONNECTION_REQUEST_INVALID: ConnectionChangeNotification = 0

public val CONNECTION_REQUEST_LB_COMPLETED: ConnectionChangeNotification = 6

public val CONNECTION_REQUEST_ORCH_COMPLETED: ConnectionChangeNotification = 8

public val CONNECTION_REQUEST_PENDING: ConnectionChangeNotification = 1

public val CONNECTION_REQUEST_QUERY_PL_COMPLETED: ConnectionChangeNotification = 7

public val CONNECTION_REQUEST_SUCCEEDED: ConnectionChangeNotification = 4

public val CONNECTION_REQUEST_TIMEDOUT: ConnectionChangeNotification = 3

public val CLIPBOARD_REDIRECTION_DISABLED: PolicyAttributeType = 5

public val DISPID_AX_ADMINMESSAGERECEIVED: UInt = 760u

public val DISPID_AX_AUTORECONNECTED: UInt = 756u

public val DISPID_AX_AUTORECONNECTING: UInt = 755u

public val DISPID_AX_CONNECTED: UInt = 751u

public val DISPID_AX_CONNECTING: UInt = 750u

public val DISPID_AX_DIALOGDISMISSED: UInt = 758u

public val DISPID_AX_DIALOGDISPLAYING: UInt = 757u

public val DISPID_AX_DISCONNECTED: UInt = 753u

public val DISPID_AX_KEYCOMBINATIONPRESSED: UInt = 761u

public val DISPID_AX_LOGINCOMPLETED: UInt = 752u

public val DISPID_AX_NETWORKSTATUSCHANGED: UInt = 759u

public val DISPID_AX_REMOTEDESKTOPSIZECHANGED: UInt = 762u

public val DISPID_AX_STATUSCHANGED: UInt = 754u

public val DISPID_AX_TOUCHPOINTERCURSORMOVED: UInt = 800u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_APPLY_SETTINGS: UInt = 722u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_ATTACH_EVENT: UInt = 706u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_CONNECT: UInt = 701u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_DELETE_SAVED_CREDENTIALS: UInt = 704u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_DETACH_EVENT: UInt = 707u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_DISCONNECT: UInt = 702u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_EXECUTE_REMOTE_ACTION: UInt = 732u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_GET_RDPPROPERTY: UInt = 721u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_GET_SNAPSHOT: UInt = 733u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_RECONNECT: UInt = 703u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_RESUME_SCREEN_UPDATES: UInt = 731u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_RETRIEVE_SETTINGS: UInt = 723u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_SET_RDPPROPERTY: UInt = 720u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_SUSPEND_SCREEN_UPDATES: UInt = 730u

public val DISPID_METHOD_REMOTEDESKTOPCLIENT_UPDATE_SESSION_DISPLAYSETTINGS: UInt = 705u

public val DISPID_PROP_REMOTEDESKTOPCLIENT_ACTIONS: UInt = 711u

public val DISPID_PROP_REMOTEDESKTOPCLIENT_SETTINGS: UInt = 710u

public val DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCHPOINTER_ENABLED: UInt = 740u

public val DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCHPOINTER_EVENTSENABLED: UInt = 741u

public val DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCHPOINTER_POINTERSPEED: UInt = 742u

public val DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCH_POINTER: UInt = 712u

public val DOMAIN_LENGTH: UInt = 17u

public val DISABLE_ALL_REDIRECTIONS: PolicyAttributeType = 1

public val DRIVE_REDIRECTION_DISABLED: PolicyAttributeType = 2

public val ENABLE_ALL_REDIRECTIONS: PolicyAttributeType = 0

public val FARM: TargetType = 1

public val FORCE_REJOIN: UInt = 2u

public val FORCE_REJOIN_IN_CLUSTERMODE: UInt = 3u

public val KEEP_EXISTING_SESSIONS: UInt = 8u

public val KEY_COMBINATION_DOWN: KeyCombinationType = 4

public val KEY_COMBINATION_HOME: KeyCombinationType = 0

public val KEY_COMBINATION_LEFT: KeyCombinationType = 1

public val KEY_COMBINATION_RIGHT: KeyCombinationType = 3

public val KEY_COMBINATION_SCROLL: KeyCombinationType = 5

public val KEY_COMBINATION_UP: KeyCombinationType = 2

public val LOAD_BALANCING_PLUGIN: PluginType = 4

public val MAX_DATE_TIME_LENGTH: UInt = 56u

public val MAX_ELAPSED_TIME_LENGTH: UInt = 15u

public val MAX_POLICY_ATTRIBUTES: UInt = 20u

public val MAX_APP_NAME_LEN: UInt = 256u

public val MAX_DOMAIN_NAME_LEN: UInt = 256u

public val MAX_FQDN_LEN: UInt = 256u

public val MAX_FARM_LEN: UInt = 256u

public val MAX_NET_BIOS_NAME_LEN: UInt = 16u

public val MAX_NUM_OF_EXPOSED_I_PS: UInt = 12u

public val MAX_USER_NAME_LEN: UInt = 104u

public val NONFARM: TargetType = 2

public val NOTIFY_FOR_ALL_SESSIONS: UInt = 1u

public val NOTIFY_FOR_THIS_SESSION: UInt = 0u

public val ORCHESTRATION_PLUGIN: PluginType = 16

public val OWNER_MS_TS_PLUGIN: TargetOwner = 1

public val OWNER_MS_VM_PLUGIN: TargetOwner = 2

public val OWNER_UNKNOWN: TargetOwner = 0

public val PLACEMENT_PLUGIN: PluginType = 8

public val PLUGIN_CAPABILITY_EXTERNAL_REDIRECTION: UInt = 1u

public val POLICY_PLUGIN: PluginType = 1

public val POSITION_CONTINUOUS: AePositionFlags = 2

public val POSITION_DISCONTINUOUS: AePositionFlags = 1

public val POSITION_INVALID: AePositionFlags = 0

public val POSITION_QPC_ERROR: AePositionFlags = 4

public val PRODUCTINFO_COMPANYNAME_LENGTH: UInt = 256u

public val PRODUCTINFO_PRODUCTID_LENGTH: UInt = 4u

public val PROVISIONING_PLUGIN: PluginType = 32

public val PASSWORD_ENCODING_UTF16BE: PasswordEncodingType = 2

public val PASSWORD_ENCODING_UTF16LE: PasswordEncodingType = 1

public val PASSWORD_ENCODING_UTF8: PasswordEncodingType = 0

public val PNP_REDIRECTION_DISABLED: PolicyAttributeType = 6

public val PORT_REDIRECTION_DISABLED: PolicyAttributeType = 4

public val PRINTER_REDIRECTION_DISABLED: PolicyAttributeType = 3

public val RDV_TASK_STATUS_APPLYING: RdvTaskStatus = 3

public val RDV_TASK_STATUS_DOWNLOADING: RdvTaskStatus = 2

public val RDV_TASK_STATUS_FAILED: RdvTaskStatus = 7

public val RDV_TASK_STATUS_REBOOTED: RdvTaskStatus = 5

public val RDV_TASK_STATUS_REBOOTING: RdvTaskStatus = 4

public val RDV_TASK_STATUS_SEARCHING: RdvTaskStatus = 1

public val RDV_TASK_STATUS_SUCCESS: RdvTaskStatus = 6

public val RDV_TASK_STATUS_TIMEOUT: RdvTaskStatus = 8

public val RDV_TASK_STATUS_UNKNOWN: RdvTaskStatus = 0

public val RD_FARM_AUTO_PERSONAL_RDSH: RdFarmType = 5

public val RD_FARM_AUTO_PERSONAL_VM: RdFarmType = 3

public val RD_FARM_MANUAL_PERSONAL_RDSH: RdFarmType = 4

public val RD_FARM_MANUAL_PERSONAL_VM: RdFarmType = 2

public val RD_FARM_RDSH: RdFarmType = 0

public val RD_FARM_TEMP_VM: RdFarmType = 1

public val RD_FARM_TYPE_UNKNOWN: RdFarmType = -1

public val REMOTECONTROL_KBDALT_HOTKEY: UInt = 4u

public val REMOTECONTROL_KBDCTRL_HOTKEY: UInt = 2u

public val REMOTECONTROL_KBDSHIFT_HOTKEY: UInt = 1u

public val RENDER_HINT_CLEAR: UInt = 0u

public val RENDER_HINT_MAPPEDWINDOW: UInt = 2u

public val RENDER_HINT_VIDEO: UInt = 1u

public val RESERVED_FOR_LEGACY: UInt = 4u

public val RESOURCE_PLUGIN: PluginType = 2

public val RFX_CLIENT_ID_LENGTH: UInt = 32u

public val RFX_GFX_MAX_SUPPORTED_MONITORS: UInt = 16u

public val RFX_GFX_MSG_PREFIX: UInt = 48u

public val RFX_GFX_MSG_PREFIX_MASK: UInt = 48u

public val RFX_RDP_MSG_PREFIX: UInt = 0u

public val REMOTE_ACTION_APP_SWITCH: RemoteActionType = 4

public val REMOTE_ACTION_APPBAR: RemoteActionType = 1

public val REMOTE_ACTION_CHARMS: RemoteActionType = 0

public val REMOTE_ACTION_SNAP: RemoteActionType = 2

public val REMOTE_ACTION_START_SCREEN: RemoteActionType = 3

public val SB_SYNCH_CONFLICT_MAX_WRITE_ATTEMPTS: UInt = 100u

public val SESSION_TIMEOUT_ACTION_DISCONNECT: SessionTimeoutActionType = 0

public val SESSION_TIMEOUT_ACTION_SILENT_REAUTH: SessionTimeoutActionType = 1

public val SINGLE_SESSION: UInt = 1u

public val STATE_ACTIVE: TssessionState = 0

public val STATE_CONNECTED: TssessionState = 1

public val STATE_CONNECTQUERY: TssessionState = 2

public val STATE_DISCONNECTED: TssessionState = 4

public val STATE_DOWN: TssessionState = 8

public val STATE_IDLE: TssessionState = 5

public val STATE_INIT: TssessionState = 9

public val STATE_INVALID: TssessionState = -1

public val STATE_LISTEN: TssessionState = 6

public val STATE_MAX: TssessionState = 10

public val STATE_RESET: TssessionState = 7

public val STATE_SHADOW: TssessionState = 3

public val SNAPSHOT_ENCODING_DATA_URI: SnapshotEncodingType = 0

public val SNAPSHOT_FORMAT_BMP: SnapshotFormatType = 2

public val SNAPSHOT_FORMAT_JPEG: SnapshotFormatType = 1

public val SNAPSHOT_FORMAT_PNG: SnapshotFormatType = 0

public val TARGET_CHANGE_UNSPEC: TargetChangeType = 1

public val TARGET_CHECKED_OUT: TargetState = 6

public val TARGET_DOWN: TargetState = 4

public val TARGET_EXTERNALIP_CHANGED: TargetChangeType = 2

public val TARGET_FARM_MEMBERSHIP_CHANGED: TargetChangeType = 1024

public val TARGET_HIBERNATED: TargetState = 5

public val TARGET_IDLE: TargetChangeType = 64

public val TARGET_INITIALIZING: TargetState = 2

public val TARGET_INTERNALIP_CHANGED: TargetChangeType = 4

public val TARGET_INUSE: TargetChangeType = 256

public val TARGET_INVALID: TargetState = 8

public val TARGET_JOINED: TargetChangeType = 8

public val TARGET_MAXSTATE: TargetState = 11

public val TARGET_PATCH_COMPLETED: TargetPatchState = 3

public val TARGET_PATCH_FAILED: TargetPatchState = 4

public val TARGET_PATCH_IN_PROGRESS: TargetPatchState = 2

public val TARGET_PATCH_NOT_STARTED: TargetPatchState = 1

public val TARGET_PATCH_STATE_CHANGED: TargetChangeType = 512

public val TARGET_PATCH_UNKNOWN: TargetPatchState = 0

public val TARGET_PENDING: TargetChangeType = 128

public val TARGET_REMOVED: TargetChangeType = 16

public val TARGET_RUNNING: TargetState = 3

public val TARGET_STARTING: TargetState = 9

public val TARGET_STATE_CHANGED: TargetChangeType = 32

public val TARGET_STOPPED: TargetState = 7

public val TARGET_STOPPING: TargetState = 10

public val TARGET_UNKNOWN: TargetState = 1

public val TASK_PLUGIN: PluginType = 64

public val TSPUB_PLUGIN_PD_ASSIGNMENT_EXISTING: TspubPluginPdAssignmentType = 1

public val TSPUB_PLUGIN_PD_ASSIGNMENT_NEW: TspubPluginPdAssignmentType = 0

public val TSPUB_PLUGIN_PD_QUERY_EXISTING: TspubPluginPdResolutionType = 1

public val TSPUB_PLUGIN_PD_QUERY_OR_CREATE: TspubPluginPdResolutionType = 0

public val TSSB_NOTIFY_CONNECTION_REQUEST_CHANGE: TssbNotificationType = 4

public val TSSB_NOTIFY_INVALID: TssbNotificationType = 0

public val TSSB_NOTIFY_SESSION_CHANGE: TssbNotificationType = 2

public val TSSB_NOTIFY_TARGET_CHANGE: TssbNotificationType = 1

public val TSSD_ADDR_I_PV4: TssdAddrV46Type = 4

public val TSSD_ADDR_I_PV6: TssdAddrV46Type = 6

public val TSSD_ADDR_UNDEFINED: TssdAddrV46Type = 0

public val TS_SB_SORT_BY_NAME: TsSbSortBy = 1

public val TS_SB_SORT_BY_NONE: TsSbSortBy = 0

public val TS_SB_SORT_BY_PROP: TsSbSortBy = 2

public val TS_VC_LISTENER_STATIC_CHANNEL: UInt = 1u

public val UNKNOWN: TargetType = 0

public val UNKNOWN_PLUGIN: PluginType = 0

public val USERNAME_LENGTH: UInt = 20u

public val VALIDATIONINFORMATION_HARDWAREID_LENGTH: UInt = 20u

public val VALIDATIONINFORMATION_LICENSE_LENGTH: UInt = 16384u

public val VIRTUAL_CHANNEL_VERSION_WIN2000: UInt = 1u

public val VM_HOST_STATUS_INIT_COMPLETE: VmHostNotifyStatus = 2

public val VM_HOST_STATUS_INIT_FAILED: VmHostNotifyStatus = 3

public val VM_HOST_STATUS_INIT_IN_PROGRESS: VmHostNotifyStatus = 1

public val VM_HOST_STATUS_INIT_PENDING: VmHostNotifyStatus = 0

public val VM_NOTIFY_STATUS_CANCELED: VmNotifyStatus = 4

public val VM_NOTIFY_STATUS_COMPLETE: VmNotifyStatus = 2

public val VM_NOTIFY_STATUS_FAILED: VmNotifyStatus = 3

public val VM_NOTIFY_STATUS_IN_PROGRESS: VmNotifyStatus = 1

public val VM_NOTIFY_STATUS_PENDING: VmNotifyStatus = 0

public val WINSTATIONNAME_LENGTH: UInt = 32u

public val WKS_FLAG_CLEAR_CREDS_ON_LAST_RESOURCE: UInt = 1u

public val WKS_FLAG_CREDS_AUTHENTICATED: UInt = 4u

public val WKS_FLAG_PASSWORD_ENCRYPTED: UInt = 2u

public val WRDS_CLIENTADDRESS_LENGTH: UInt = 30u

public val WRDS_CLIENTNAME_LENGTH: UInt = 20u

public val WRDS_CLIENT_PRODUCT_ID_LENGTH: UInt = 32u

public val WRDS_CONNECTION_SETTING_LEVEL_1: WrdsConnectionSettingLevel = 1

public val WRDS_CONNECTION_SETTING_LEVEL_INVALID: WrdsConnectionSettingLevel = 0

public val WRDS_DEVICE_NAME_LENGTH: UInt = 19u

public val WRDS_DIRECTORY_LENGTH: UInt = 256u

public val WRDS_DOMAIN_LENGTH: UInt = 255u

public val WRDS_DRIVER_NAME_LENGTH: UInt = 8u

public val WRDS_IMEFILENAME_LENGTH: UInt = 32u

public val WRDS_INITIALPROGRAM_LENGTH: UInt = 256u

public val WRDS_KEY_EXCHANGE_ALG_DH: UInt = 2u

public val WRDS_KEY_EXCHANGE_ALG_RSA: UInt = 1u

public val WRDS_LICENSE_PREAMBLE_VERSION: UInt = 3u

public val WRDS_LICENSE_PROTOCOL_VERSION: UInt = 65536u

public val WRDS_LISTENER_SETTING_LEVEL_1: WrdsListenerSettingLevel = 1

public val WRDS_LISTENER_SETTING_LEVEL_INVALID: WrdsListenerSettingLevel = 0

public val WRDS_MAX_CACHE_RESERVED: UInt = 20u

public val WRDS_MAX_COUNTERS: UInt = 100u

public val WRDS_MAX_DISPLAY_IOCTL_DATA: UInt = 256u

public val WRDS_MAX_PROTOCOL_CACHE: UInt = 4u

public val WRDS_MAX_RESERVED: UInt = 100u

public val WRDS_PASSWORD_LENGTH: UInt = 255u

public val WRDS_PERF_DISABLE_CURSORSETTINGS: UInt = 64u

public val WRDS_PERF_DISABLE_CURSOR_SHADOW: UInt = 32u

public val WRDS_PERF_DISABLE_FULLWINDOWDRAG: UInt = 2u

public val WRDS_PERF_DISABLE_MENUANIMATIONS: UInt = 4u

public val WRDS_PERF_DISABLE_NOTHING: UInt = 0u

public val WRDS_PERF_DISABLE_THEMING: UInt = 8u

public val WRDS_PERF_DISABLE_WALLPAPER: UInt = 1u

public val WRDS_PERF_ENABLE_DESKTOP_COMPOSITION: UInt = 256u

public val WRDS_PERF_ENABLE_ENHANCED_GRAPHICS: UInt = 16u

public val WRDS_PERF_ENABLE_FONT_SMOOTHING: UInt = 128u

public val WRDS_PROTOCOL_NAME_LENGTH: UInt = 8u

public val WRDS_SETTING_LEVEL_1: WrdsSettingLevel = 1

public val WRDS_SETTING_LEVEL_INVALID: WrdsSettingLevel = 0

public val WRDS_SETTING_STATUS_DISABLED: WrdsSettingStatus = 0

public val WRDS_SETTING_STATUS_ENABLED: WrdsSettingStatus = 1

public val WRDS_SETTING_STATUS_NOTAPPLICABLE: WrdsSettingStatus = -1

public val WRDS_SETTING_STATUS_NOTCONFIGURED: WrdsSettingStatus = 2

public val WRDS_SETTING_TYPE_INVALID: WrdsSettingType = 0

public val WRDS_SETTING_TYPE_MACHINE: WrdsSettingType = 1

public val WRDS_SETTING_TYPE_SAM: WrdsSettingType = 3

public val WRDS_SETTING_TYPE_USER: WrdsSettingType = 2

public val WRDS_USERNAME_LENGTH: UInt = 255u

public val WRDS_VALUE_TYPE_BINARY: UInt = 3u

public val WRDS_VALUE_TYPE_GUID: UInt = 4u

public val WRDS_VALUE_TYPE_STRING: UInt = 2u

public val WRDS_VALUE_TYPE_ULONG: UInt = 1u

public val W_RDS_GRAPHICS_CHANNEL_TYPE_BEST_EFFORT_DELIVERY: WRdsGraphicsChannelType = 1

public val W_RDS_GRAPHICS_CHANNEL_TYPE_GUARANTEED_DELIVERY: WRdsGraphicsChannelType = 0

public val W_RDS_GRAPHICS_CHANNELS_LOSSY_CHANNEL_MAX_MESSAGE_SIZE: UInt = 988u

public val WTS_ACTIVE: WtsConnectstateClass = 0

public val WTS_APPLICATION_NAME: WtsInfoClass = 1

public val WTS_CLIENT_ADDRESS: WtsInfoClass = 14

public val WTS_CLIENT_BUILD_NUMBER: WtsInfoClass = 9

public val WTS_CLIENT_DIRECTORY: WtsInfoClass = 11

public val WTS_CLIENT_DISPLAY: WtsInfoClass = 15

public val WTS_CLIENT_HARDWARE_ID: WtsInfoClass = 13

public val WTS_CLIENT_INFO: WtsInfoClass = 23

public val WTS_CLIENT_NAME: WtsInfoClass = 10

public val WTS_CLIENT_PRODUCT_ID: WtsInfoClass = 12

public val WTS_CLIENT_PROTOCOL_TYPE: WtsInfoClass = 16

public val WTS_CONFIG_INFO: WtsInfoClass = 26

public val WTS_CONNECT_QUERY: WtsConnectstateClass = 2

public val WTS_CONNECT_STATE: WtsInfoClass = 8

public val WTS_CONNECTED: WtsConnectstateClass = 1

public val WTS_DISCONNECTED: WtsConnectstateClass = 4

public val WTS_DOMAIN_NAME: WtsInfoClass = 7

public val WTS_DOWN: WtsConnectstateClass = 8

public val WTS_IDLE: WtsConnectstateClass = 5

public val WTS_IDLE_TIME: WtsInfoClass = 17

public val WTS_INCOMING_BYTES: WtsInfoClass = 19

public val WTS_INCOMING_FRAMES: WtsInfoClass = 21

public val WTS_INIT: WtsConnectstateClass = 9

public val WTS_INITIAL_PROGRAM: WtsInfoClass = 0

public val WTS_IS_REMOTE_SESSION: WtsInfoClass = 29

public val WTS_LISTEN: WtsConnectstateClass = 6

public val WTS_LOGON_TIME: WtsInfoClass = 18

public val WTSOEM_ID: WtsInfoClass = 3

public val WTS_OUTGOING_BYTES: WtsInfoClass = 20

public val WTS_OUTGOING_FRAMES: WtsInfoClass = 22

public val WTS_RESET: WtsConnectstateClass = 7

public val WTSSBX_ADDRESS_FAMILY_AF_INET: WtssbxAddressFamily = 1

public val WTSSBX_ADDRESS_FAMILY_AF_INET6: WtssbxAddressFamily = 2

public val WTSSBX_ADDRESS_FAMILY_AF_IPX: WtssbxAddressFamily = 3

public val WTSSBX_ADDRESS_FAMILY_AF_NETBIOS: WtssbxAddressFamily = 4

public val WTSSBX_ADDRESS_FAMILY_AF_UNSPEC: WtssbxAddressFamily = 0

public val WTSSBX_MACHINE_DRAIN_OFF: WtssbxMachineDrain = 1

public val WTSSBX_MACHINE_DRAIN_ON: WtssbxMachineDrain = 2

public val WTSSBX_MACHINE_DRAIN_UNSPEC: WtssbxMachineDrain = 0

public val WTSSBX_MACHINE_SESSION_MODE_MULTIPLE: WtssbxMachineSessionMode = 2

public val WTSSBX_MACHINE_SESSION_MODE_SINGLE: WtssbxMachineSessionMode = 1

public val WTSSBX_MACHINE_SESSION_MODE_UNSPEC: WtssbxMachineSessionMode = 0

public val WTSSBX_MACHINE_STATE_READY: WtssbxMachineState = 1

public val WTSSBX_MACHINE_STATE_SYNCHRONIZING: WtssbxMachineState = 2

public val WTSSBX_MACHINE_STATE_UNSPEC: WtssbxMachineState = 0

public val WTSSBX_NOTIFICATION_ADDED: WtssbxNotificationType = 4

public val WTSSBX_NOTIFICATION_CHANGED: WtssbxNotificationType = 2

public val WTSSBX_NOTIFICATION_REMOVED: WtssbxNotificationType = 1

public val WTSSBX_NOTIFICATION_RESYNC: WtssbxNotificationType = 8

public val WTSSBX_SESSION_STATE_ACTIVE: WtssbxSessionState = 1

public val WTSSBX_SESSION_STATE_DISCONNECTED: WtssbxSessionState = 2

public val WTSSBX_SESSION_STATE_UNSPEC: WtssbxSessionState = 0

public val WTS_SESSION_ADDRESS_V4: WtsInfoClass = 28

public val WTS_SESSION_ID: WtsInfoClass = 4

public val WTS_SESSION_INFO: WtsInfoClass = 24

public val WTS_SESSION_INFO_EX: WtsInfoClass = 25

public val WTS_SHADOW: WtsConnectstateClass = 3

public val WTS_TYPE_PROCESS_INFO_LEVEL0: WtsTypeClass = 0

public val WTS_TYPE_PROCESS_INFO_LEVEL1: WtsTypeClass = 1

public val WTS_TYPE_SESSION_INFO_LEVEL1: WtsTypeClass = 2

public val WTS_USER_CONFIG_BROKEN_TIMEOUT_SETTINGS: WtsConfigClass = 10

public val WTS_USER_CONFIG_INITIAL_PROGRAM: WtsConfigClass = 0

public val WTS_USER_CONFIG_MODEM_CALLBACK_PHONE_NUMBER: WtsConfigClass = 13

public val WTS_USER_CONFIG_MODEM_CALLBACK_SETTINGS: WtsConfigClass = 12

public val WTS_USER_CONFIG_RECONNECT_SETTINGS: WtsConfigClass = 11

public val WTS_USER_CONFIG_SHADOWING_SETTINGS: WtsConfigClass = 14

public val WTS_USER_CONFIG_SOURCE_SAM: WtsConfigSource = 0

public val WTS_USER_CONFIG_TERMINAL_SERVER_HOME_DIR: WtsConfigClass = 16

public val WTS_USER_CONFIG_TERMINAL_SERVER_HOME_DIR_DRIVE: WtsConfigClass = 17

public val WTS_USER_CONFIG_TERMINAL_SERVER_PROFILE_PATH: WtsConfigClass = 15

public val WTS_USER_CONFIG_TIMEOUT_SETTINGS_CONNECTIONS: WtsConfigClass = 4

public val WTS_USER_CONFIG_TIMEOUT_SETTINGS_DISCONNECTIONS: WtsConfigClass = 5

public val WTS_USER_CONFIG_TIMEOUT_SETTINGS_IDLE: WtsConfigClass = 6

public val WTS_USER_CONFIG_USER: WtsConfigClass = 19

public val WTS_USER_CONFIG_WORKING_DIRECTORY: WtsConfigClass = 1

public val WTS_USER_CONFIGF_ALLOW_LOGON_TERMINAL_SERVER: WtsConfigClass = 3

public val WTS_USER_CONFIGF_DEVICE_CLIENT_DEFAULT_PRINTER: WtsConfigClass = 9

public val WTS_USER_CONFIGF_DEVICE_CLIENT_DRIVES: WtsConfigClass = 7

public val WTS_USER_CONFIGF_DEVICE_CLIENT_PRINTERS: WtsConfigClass = 8

public val WTS_USER_CONFIGF_INHERIT_INITIAL_PROGRAM: WtsConfigClass = 2

public val WTS_USER_CONFIGF_TERMINAL_SERVER_REMOTE_HOME_DIR: WtsConfigClass = 18

public val WTS_USER_NAME: WtsInfoClass = 5

public val WTS_VALIDATION_INFO: WtsInfoClass = 27

public val WTS_VIRTUAL_CLIENT_DATA: WtsVirtualClass = 0

public val WTS_VIRTUAL_FILE_HANDLE: WtsVirtualClass = 1

public val WTS_WIN_STATION_NAME: WtsInfoClass = 6

public val WTS_WORKING_DIRECTORY: WtsInfoClass = 2

public val WTS_CERT_TYPE_INVALID: WtsCertType = 0

public val WTS_CERT_TYPE_PROPRIETORY: WtsCertType = 1

public val WTS_CERT_TYPE_X509: WtsCertType = 2

public val WTS_CHANNEL_OPTION_DYNAMIC: UInt = 1u

public val WTS_CHANNEL_OPTION_DYNAMIC_NO_COMPRESS: UInt = 8u

public val WTS_CHANNEL_OPTION_DYNAMIC_PRI_HIGH: UInt = 4u

public val WTS_CHANNEL_OPTION_DYNAMIC_PRI_LOW: UInt = 0u

public val WTS_CHANNEL_OPTION_DYNAMIC_PRI_MED: UInt = 2u

public val WTS_CHANNEL_OPTION_DYNAMIC_PRI_REAL: UInt = 6u

public val WTS_CLIENTADDRESS_LENGTH: UInt = 30u

public val WTS_CLIENTNAME_LENGTH: UInt = 20u

public val WTS_CLIENT_PRODUCT_ID_LENGTH: UInt = 32u

public val WTS_COMMENT_LENGTH: UInt = 60u

public val WTS_CURRENT_SERVER: Handle = null

public val WTS_CURRENT_SERVER_HANDLE: Handle = null

public val WTS_CURRENT_SERVER_NAME: Pcwstr = w("")

public val WTS_CURRENT_SESSION: UInt = 4294967295u

public val WTS_DEVICE_NAME_LENGTH: UInt = 19u

public val WTS_DIRECTORY_LENGTH: UInt = 256u

public val WTS_DOMAIN_LENGTH: UInt = 255u

public val WTS_DRAIN_IN_DRAIN: WtsRcmDrainState = 1

public val WTS_DRAIN_NOT_IN_DRAIN: WtsRcmDrainState = 2

public val WTS_DRAIN_STATE_NONE: WtsRcmDrainState = 0

public val WTS_DRIVER_NAME_LENGTH: UInt = 8u

public val WTS_DRIVE_LENGTH: UInt = 3u

public val WTS_EVENT_ALL: UInt = 2147483647u

public val WTS_EVENT_CONNECT: UInt = 8u

public val WTS_EVENT_CREATE: UInt = 1u

public val WTS_EVENT_DELETE: UInt = 2u

public val WTS_EVENT_DISCONNECT: UInt = 16u

public val WTS_EVENT_FLUSH: UInt = 2147483648u

public val WTS_EVENT_LICENSE: UInt = 256u

public val WTS_EVENT_LOGOFF: UInt = 64u

public val WTS_EVENT_LOGON: UInt = 32u

public val WTS_EVENT_NONE: UInt = 0u

public val WTS_EVENT_RENAME: UInt = 4u

public val WTS_EVENT_STATECHANGE: UInt = 128u

public val WTS_IMEFILENAME_LENGTH: UInt = 32u

public val WTS_INITIALPROGRAM_LENGTH: UInt = 256u

public val WTS_KEY_EXCHANGE_ALG_DH: UInt = 2u

public val WTS_KEY_EXCHANGE_ALG_RSA: UInt = 1u

public val WTS_LICENSE_PREAMBLE_VERSION: UInt = 3u

public val WTS_LICENSE_PROTOCOL_VERSION: UInt = 65536u

public val WTS_LISTENER_CREATE: UInt = 1u

public val WTS_LISTENER_NAME_LENGTH: UInt = 32u

public val WTS_LISTENER_UPDATE: UInt = 16u

public val WTS_LOGON_ERR_HANDLED_DONT_SHOW: WtsLogonErrorRedirectorResponse = 3

public val WTS_LOGON_ERR_HANDLED_DONT_SHOW_START_OVER: WtsLogonErrorRedirectorResponse = 4

public val WTS_LOGON_ERR_HANDLED_SHOW: WtsLogonErrorRedirectorResponse = 2

public val WTS_LOGON_ERR_INVALID: WtsLogonErrorRedirectorResponse = 0

public val WTS_LOGON_ERR_NOT_HANDLED: WtsLogonErrorRedirectorResponse = 1

public val WTS_MAX_CACHE_RESERVED: UInt = 20u

public val WTS_MAX_COUNTERS: UInt = 100u

public val WTS_MAX_DISPLAY_IOCTL_DATA: UInt = 256u

public val WTS_MAX_PROTOCOL_CACHE: UInt = 4u

public val WTS_MAX_RESERVED: UInt = 100u

public val WTS_PASSWORD_LENGTH: UInt = 255u

public val WTS_PERF_DISABLE_CURSORSETTINGS: UInt = 64u

public val WTS_PERF_DISABLE_CURSOR_SHADOW: UInt = 32u

public val WTS_PERF_DISABLE_FULLWINDOWDRAG: UInt = 2u

public val WTS_PERF_DISABLE_MENUANIMATIONS: UInt = 4u

public val WTS_PERF_DISABLE_NOTHING: UInt = 0u

public val WTS_PERF_DISABLE_THEMING: UInt = 8u

public val WTS_PERF_DISABLE_WALLPAPER: UInt = 1u

public val WTS_PERF_ENABLE_DESKTOP_COMPOSITION: UInt = 256u

public val WTS_PERF_ENABLE_ENHANCED_GRAPHICS: UInt = 16u

public val WTS_PERF_ENABLE_FONT_SMOOTHING: UInt = 128u

public val WTS_PROCESS_INFO_LEVEL_0: UInt = 0u

public val WTS_PROCESS_INFO_LEVEL_1: UInt = 1u

public val WTS_PROPERTY_DEFAULT_CONFIG: Pcwstr = w("DefaultConfig")

public val WTS_PROTOCOL_NAME_LENGTH: UInt = 8u

public val WTS_PROTOCOL_TYPE_CONSOLE: UInt = 0u

public val WTS_PROTOCOL_TYPE_ICA: UInt = 1u

public val WTS_PROTOCOL_TYPE_RDP: UInt = 2u

public val WTS_SECURITY_ALL_ACCESS: WtsSecurityFlags = 983999u

public val WTS_SECURITY_CONNECT: WtsSecurityFlags = 256u

public val WTS_SECURITY_CURRENT_GUEST_ACCESS: WtsSecurityFlags = 72u

public val WTS_SECURITY_CURRENT_USER_ACCESS: WtsSecurityFlags = 590u

public val WTS_SECURITY_DISCONNECT: WtsSecurityFlags = 512u

public val WTS_SECURITY_GUEST_ACCESS: WtsSecurityFlags = 32u

public val WTS_SECURITY_LOGOFF: WtsSecurityFlags = 64u

public val WTS_SECURITY_LOGON: WtsSecurityFlags = 32u

public val WTS_SECURITY_MESSAGE: WtsSecurityFlags = 128u

public val WTS_SECURITY_QUERY_INFORMATION: WtsSecurityFlags = 1u

public val WTS_SECURITY_REMOTE_CONTROL: WtsSecurityFlags = 16u

public val WTS_SECURITY_RESET: WtsSecurityFlags = 4u

public val WTS_SECURITY_SET_INFORMATION: WtsSecurityFlags = 2u

public val WTS_SECURITY_USER_ACCESS: WtsSecurityFlags = 329u

public val WTS_SECURITY_VIRTUAL_CHANNELS: WtsSecurityFlags = 8u

public val WTS_SERVICE_NONE: WtsRcmServiceState = 0

public val WTS_SERVICE_START: WtsRcmServiceState = 1

public val WTS_SERVICE_STOP: WtsRcmServiceState = 2

public val WTS_SESSIONSTATE_LOCK: UInt = 0u

public val WTS_SESSIONSTATE_UNKNOWN: UInt = 4294967295u

public val WTS_SESSIONSTATE_UNLOCK: UInt = 1u

public val WTS_USERNAME_LENGTH: UInt = 255u

public val WTS_VALUE_TYPE_BINARY: UInt = 3u

public val WTS_VALUE_TYPE_GUID: UInt = 4u

public val WTS_VALUE_TYPE_STRING: UInt = 2u

public val WTS_VALUE_TYPE_ULONG: UInt = 1u

public val WTS_WSD_FASTREBOOT: UInt = 16u

public val WTS_WSD_LOGOFF: UInt = 1u

public val WTS_WSD_POWEROFF: UInt = 8u

public val WTS_WSD_REBOOT: UInt = 4u

public val WTS_WSD_SHUTDOWN: UInt = 2u

public val A_DS_TS_USER_EX: Guid = Guid.fromU128(U128(0xe2e9cae61e7b4b8euL, 0xbabde9bf6292ac29uL))

public val CONNECTION_PROPERTY_CURSOR_BLINK_DISABLED: Guid = Guid.fromU128(U128(0x4b150580fea44d3cuL, 0x9de47433a66618f7uL))

public val CONNECTION_PROPERTY_IDLE_TIME_WARNING: Guid = Guid.fromU128(U128(0x693f7ff50c4e4d17uL, 0xb8e01f70325e5d58uL))

public val PROPERTY_DYNAMIC_TIME_ZONE_INFORMATION: Guid = Guid.fromU128(U128(0xcdfd28ed0b94c1fuL, 0xa5eb6d1f6c6535b9uL))

public val PROPERTY_TYPE_ENABLE_UNIVERSAL_APPS_FOR_CUSTOM_SHELL: Guid = Guid.fromU128(U128(0xed2c3fda338d4d3fuL, 0x81a3e767310d908euL))

public val PROPERTY_TYPE_GET_FAST_RECONNECT: Guid = Guid.fromU128(U128(0x6212d75700434862uL, 0x99c39f3059ac2a3buL))

public val PROPERTY_TYPE_GET_FAST_RECONNECT_USER_SID: Guid = Guid.fromU128(U128(0x197c427a01354b6duL, 0x9c5ee6579a0ab625uL))

public val RDCLIENT_BITMAP_RENDER_SERVICE: Guid = Guid.fromU128(U128(0xe4cc08cb942e4b19uL, 0x8504bd5a89a747f5uL))

public val TS_USER_EX_INTERFACES: Guid = Guid.fromU128(U128(0x910dd01df8c11d1uL, 0xae2700c04fa35813uL))

public val WRDS_SERVICE_ID_GRAPHICS_GUID: Guid = Guid.fromU128(U128(0xd2993f4d02cf4280uL, 0x8c481624b44f8706uL))

public val WTS_QUERY_ALLOWED_INITIAL_APP: Guid = Guid.fromU128(U128(0xc77d1b305be14c6buL, 0xa0e1bd6d2e5c9fccuL))

public val WTS_QUERY_AUDIOENUM_DLL: Guid = Guid.fromU128(U128(0x9bf4fa97c8834c2auL, 0x80ab5a39c9af00dbuL))

public val WTS_QUERY_LOGON_SCREEN_SIZE: Guid = Guid.fromU128(U128(0x8b8e0fe708044a0euL, 0xb2798660b1df0049uL))

public val WTS_QUERY_MF_FORMAT_SUPPORT: Guid = Guid.fromU128(U128(0x41869ad063324dc8uL, 0x95d5db749e2f1d94uL))

public val WORKSPACE: Guid = Guid.fromU128(U128(0x4f1dfca63aad48e1uL, 0x84064bc21a501d7cuL))
