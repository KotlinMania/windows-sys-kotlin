package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ALLOC_LOG_CONF: CmLogConf = 2u

public val BASIC_LOG_CONF: CmLogConf = 0u

public val BOOT_LOG_CONF: CmLogConf = 3u

public val CM_ADD_ID_BITS: UInt = 1u

public val CM_ADD_ID_COMPATIBLE: UInt = 1u

public val CM_ADD_ID_HARDWARE: UInt = 0u

public val CM_ADD_RANGE_ADDIFCONFLICT: UInt = 0u

public val CM_ADD_RANGE_BITS: UInt = 1u

public val CM_ADD_RANGE_DONOTADDIFCONFLICT: UInt = 1u

public val CM_CDFLAGS_DRIVER: CmCdflags = 1u

public val CM_CDFLAGS_RESERVED: CmCdflags = 4u

public val CM_CDFLAGS_ROOT_OWNED: CmCdflags = 2u

public val CM_CDMASK_DESCRIPTION: CmCdmask = 8u

public val CM_CDMASK_DEVINST: CmCdmask = 1u

public val CM_CDMASK_FLAGS: CmCdmask = 4u

public val CM_CDMASK_RESDES: CmCdmask = 2u

public val CM_CDMASK_VALID: CmCdmask = 15u

public val CM_CLASS_PROPERTY_BITS: UInt = 1u

public val CM_CLASS_PROPERTY_INSTALLER: UInt = 0u

public val CM_CLASS_PROPERTY_INTERFACE: UInt = 1u

public val CM_CREATE_DEVINST_BITS: UInt = 15u

public val CM_CREATE_DEVINST_DO_NOT_INSTALL: UInt = 8u

public val CM_CREATE_DEVINST_GENERATE_ID: UInt = 4u

public val CM_CREATE_DEVINST_NORMAL: UInt = 0u

public val CM_CREATE_DEVINST_NO_WAIT_INSTALL: UInt = 1u

public val CM_CREATE_DEVINST_PHANTOM: UInt = 2u

public val CM_CREATE_DEVNODE_BITS: UInt = 15u

public val CM_CREATE_DEVNODE_DO_NOT_INSTALL: UInt = 8u

public val CM_CREATE_DEVNODE_GENERATE_ID: UInt = 4u

public val CM_CREATE_DEVNODE_NORMAL: UInt = 0u

public val CM_CREATE_DEVNODE_NO_WAIT_INSTALL: UInt = 1u

public val CM_CREATE_DEVNODE_PHANTOM: UInt = 2u

public val CM_CRP_CHARACTERISTICS: UInt = 28u

public val CM_CRP_DEVTYPE: UInt = 26u

public val CM_CRP_EXCLUSIVE: UInt = 27u

public val CM_CRP_LOWERFILTERS: UInt = 19u

public val CM_CRP_MAX: UInt = 37u

public val CM_CRP_MIN: UInt = 1u

public val CM_CRP_SECURITY: UInt = 24u

public val CM_CRP_SECURITY_SDS: UInt = 25u

public val CM_CRP_UPPERFILTERS: UInt = 18u

public val CM_CUSTOMDEVPROP_BITS: UInt = 1u

public val CM_CUSTOMDEVPROP_MERGE_MULTISZ: UInt = 1u

public val CM_DELETE_CLASS_BITS: UInt = 3u

public val CM_DELETE_CLASS_INTERFACE: UInt = 2u

public val CM_DELETE_CLASS_ONLY: UInt = 0u

public val CM_DELETE_CLASS_SUBKEYS: UInt = 1u

public val CM_DETECT_BITS: UInt = 2147483655u

public val CM_DETECT_CRASHED: UInt = 2u

public val CM_DETECT_HWPROF_FIRST_BOOT: UInt = 4u

public val CM_DETECT_NEW_PROFILE: UInt = 1u

public val CM_DETECT_RUN: UInt = 2147483648u

public val CM_DEVCAP_DOCKDEVICE: CmDevcap = 8u

public val CM_DEVCAP_EJECTSUPPORTED: CmDevcap = 2u

public val CM_DEVCAP_HARDWAREDISABLED: CmDevcap = 256u

public val CM_DEVCAP_LOCKSUPPORTED: CmDevcap = 1u

public val CM_DEVCAP_NONDYNAMIC: CmDevcap = 512u

public val CM_DEVCAP_RAWDEVICEOK: CmDevcap = 64u

public val CM_DEVCAP_REMOVABLE: CmDevcap = 4u

public val CM_DEVCAP_SECUREDEVICE: CmDevcap = 1024u

public val CM_DEVCAP_SILENTINSTALL: CmDevcap = 32u

public val CM_DEVCAP_SURPRISEREMOVALOK: CmDevcap = 128u

public val CM_DEVCAP_UNIQUEID: CmDevcap = 16u

public val CM_DEVICE_PANEL_EDGE_BOTTOM: UInt = 2u

public val CM_DEVICE_PANEL_EDGE_LEFT: UInt = 3u

public val CM_DEVICE_PANEL_EDGE_RIGHT: UInt = 4u

public val CM_DEVICE_PANEL_EDGE_TOP: UInt = 1u

public val CM_DEVICE_PANEL_EDGE_UNKNOWN: UInt = 0u

public val CM_DEVICE_PANEL_JOINT_TYPE_HINGE: UInt = 2u

public val CM_DEVICE_PANEL_JOINT_TYPE_PIVOT: UInt = 3u

public val CM_DEVICE_PANEL_JOINT_TYPE_PLANAR: UInt = 1u

public val CM_DEVICE_PANEL_JOINT_TYPE_SWIVEL: UInt = 4u

public val CM_DEVICE_PANEL_JOINT_TYPE_UNKNOWN: UInt = 0u

public val CM_DEVICE_PANEL_ORIENTATION_HORIZONTAL: UInt = 0u

public val CM_DEVICE_PANEL_ORIENTATION_VERTICAL: UInt = 1u

public val CM_DEVICE_PANEL_SHAPE_OVAL: UInt = 2u

public val CM_DEVICE_PANEL_SHAPE_RECTANGLE: UInt = 1u

public val CM_DEVICE_PANEL_SHAPE_UNKNOWN: UInt = 0u

public val CM_DEVICE_PANEL_SIDE_BACK: UInt = 6u

public val CM_DEVICE_PANEL_SIDE_BOTTOM: UInt = 2u

public val CM_DEVICE_PANEL_SIDE_FRONT: UInt = 5u

public val CM_DEVICE_PANEL_SIDE_LEFT: UInt = 3u

public val CM_DEVICE_PANEL_SIDE_RIGHT: UInt = 4u

public val CM_DEVICE_PANEL_SIDE_TOP: UInt = 1u

public val CM_DEVICE_PANEL_SIDE_UNKNOWN: UInt = 0u

public val CM_DISABLE_ABSOLUTE: UInt = 1u

public val CM_DISABLE_BITS: UInt = 15u

public val CM_DISABLE_HARDWARE: UInt = 2u

public val CM_DISABLE_PERSIST: UInt = 8u

public val CM_DISABLE_POLITE: UInt = 0u

public val CM_DISABLE_UI_NOT_OK: UInt = 4u

public val CM_DRP_ADDRESS: UInt = 29u

public val CM_DRP_BASE_CONTAINERID: UInt = 37u

public val CM_DRP_BUSNUMBER: UInt = 22u

public val CM_DRP_BUSTYPEGUID: UInt = 20u

public val CM_DRP_CAPABILITIES: UInt = 16u

public val CM_DRP_CHARACTERISTICS: UInt = 28u

public val CM_DRP_CLASS: UInt = 8u

public val CM_DRP_CLASSGUID: UInt = 9u

public val CM_DRP_COMPATIBLEIDS: UInt = 3u

public val CM_DRP_CONFIGFLAGS: UInt = 11u

public val CM_DRP_DEVICEDESC: UInt = 1u

public val CM_DRP_DEVICE_POWER_DATA: UInt = 31u

public val CM_DRP_DEVTYPE: UInt = 26u

public val CM_DRP_DRIVER: UInt = 10u

public val CM_DRP_ENUMERATOR_NAME: UInt = 23u

public val CM_DRP_EXCLUSIVE: UInt = 27u

public val CM_DRP_FRIENDLYNAME: UInt = 13u

public val CM_DRP_HARDWAREID: UInt = 2u

public val CM_DRP_INSTALL_STATE: UInt = 35u

public val CM_DRP_LEGACYBUSTYPE: UInt = 21u

public val CM_DRP_LOCATION_INFORMATION: UInt = 14u

public val CM_DRP_LOCATION_PATHS: UInt = 36u

public val CM_DRP_LOWERFILTERS: UInt = 19u

public val CM_DRP_MAX: UInt = 37u

public val CM_DRP_MFG: UInt = 12u

public val CM_DRP_MIN: UInt = 1u

public val CM_DRP_PHYSICAL_DEVICE_OBJECT_NAME: UInt = 15u

public val CM_DRP_REMOVAL_POLICY: UInt = 32u

public val CM_DRP_REMOVAL_POLICY_HW_DEFAULT: UInt = 33u

public val CM_DRP_REMOVAL_POLICY_OVERRIDE: UInt = 34u

public val CM_DRP_SECURITY: UInt = 24u

public val CM_DRP_SECURITY_SDS: UInt = 25u

public val CM_DRP_SERVICE: UInt = 5u

public val CM_DRP_UI_NUMBER: UInt = 17u

public val CM_DRP_UI_NUMBER_DESC_FORMAT: UInt = 30u

public val CM_DRP_UNUSED0: UInt = 4u

public val CM_DRP_UNUSED1: UInt = 6u

public val CM_DRP_UNUSED2: UInt = 7u

public val CM_DRP_UPPERFILTERS: UInt = 18u

public val CM_ENUMERATE_CLASSES_BITS: CmEnumerateFlags = 1u

public val CM_ENUMERATE_CLASSES_INSTALLER: CmEnumerateFlags = 0u

public val CM_ENUMERATE_CLASSES_INTERFACE: CmEnumerateFlags = 1u

public val CM_GETIDLIST_DONOTGENERATE: UInt = 268435520u

public val CM_GETIDLIST_FILTER_BITS: UInt = 268435583u

public val CM_GETIDLIST_FILTER_BUSRELATIONS: UInt = 32u

public val CM_GETIDLIST_FILTER_CLASS: UInt = 512u

public val CM_GETIDLIST_FILTER_EJECTRELATIONS: UInt = 4u

public val CM_GETIDLIST_FILTER_ENUMERATOR: UInt = 1u

public val CM_GETIDLIST_FILTER_NONE: UInt = 0u

public val CM_GETIDLIST_FILTER_POWERRELATIONS: UInt = 16u

public val CM_GETIDLIST_FILTER_PRESENT: UInt = 256u

public val CM_GETIDLIST_FILTER_REMOVALRELATIONS: UInt = 8u

public val CM_GETIDLIST_FILTER_SERVICE: UInt = 2u

public val CM_GETIDLIST_FILTER_TRANSPORTRELATIONS: UInt = 128u

public val CM_GET_DEVICE_INTERFACE_LIST_ALL_DEVICES: CmGetDeviceInterfaceListFlags = 1u

public val CM_GET_DEVICE_INTERFACE_LIST_BITS: CmGetDeviceInterfaceListFlags = 1u

public val CM_GET_DEVICE_INTERFACE_LIST_PRESENT: CmGetDeviceInterfaceListFlags = 0u

public val CM_GLOBAL_STATE_CAN_DO_UI: UInt = 1u

public val CM_GLOBAL_STATE_DETECTION_PENDING: UInt = 16u

public val CM_GLOBAL_STATE_ON_BIG_STACK: UInt = 2u

public val CM_GLOBAL_STATE_REBOOT_REQUIRED: UInt = 32u

public val CM_GLOBAL_STATE_SERVICES_AVAILABLE: UInt = 4u

public val CM_GLOBAL_STATE_SHUTTING_DOWN: UInt = 8u

public val CM_HWPI_DOCKED: UInt = 2u

public val CM_HWPI_NOT_DOCKABLE: UInt = 0u

public val CM_HWPI_UNDOCKED: UInt = 1u

public val CM_INSTALL_STATE_FAILED_INSTALL: CmInstallState = 2u

public val CM_INSTALL_STATE_FINISH_INSTALL: CmInstallState = 3u

public val CM_INSTALL_STATE_INSTALLED: CmInstallState = 0u

public val CM_INSTALL_STATE_NEEDS_REINSTALL: CmInstallState = 1u

public val CM_LOCATE_DEVNODE_BITS: CmLocateDevnodeFlags = 7u

public val CM_LOCATE_DEVNODE_CANCELREMOVE: CmLocateDevnodeFlags = 2u

public val CM_LOCATE_DEVNODE_NORMAL: CmLocateDevnodeFlags = 0u

public val CM_LOCATE_DEVNODE_NOVALIDATION: CmLocateDevnodeFlags = 4u

public val CM_LOCATE_DEVNODE_PHANTOM: CmLocateDevnodeFlags = 1u

public val CM_NAME_ATTRIBUTE_NAME_RETRIEVED_FROM_DEVICE: UInt = 1u

public val CM_NAME_ATTRIBUTE_USER_ASSIGNED_NAME: UInt = 2u

public val CM_NOTIFY_ACTION_DEVICECUSTOMEVENT: CmNotifyAction = 6

public val CM_NOTIFY_ACTION_DEVICEINSTANCEENUMERATED: CmNotifyAction = 7

public val CM_NOTIFY_ACTION_DEVICEINSTANCEREMOVED: CmNotifyAction = 9

public val CM_NOTIFY_ACTION_DEVICEINSTANCESTARTED: CmNotifyAction = 8

public val CM_NOTIFY_ACTION_DEVICEINTERFACEARRIVAL: CmNotifyAction = 0

public val CM_NOTIFY_ACTION_DEVICEINTERFACEREMOVAL: CmNotifyAction = 1

public val CM_NOTIFY_ACTION_DEVICEQUERYREMOVE: CmNotifyAction = 2

public val CM_NOTIFY_ACTION_DEVICEQUERYREMOVEFAILED: CmNotifyAction = 3

public val CM_NOTIFY_ACTION_DEVICEREMOVECOMPLETE: CmNotifyAction = 5

public val CM_NOTIFY_ACTION_DEVICEREMOVEPENDING: CmNotifyAction = 4

public val CM_NOTIFY_ACTION_MAX: CmNotifyAction = 10

public val CM_NOTIFY_FILTER_FLAG_ALL_DEVICE_INSTANCES: UInt = 2u

public val CM_NOTIFY_FILTER_FLAG_ALL_INTERFACE_CLASSES: UInt = 1u

public val CM_NOTIFY_FILTER_TYPE_DEVICEHANDLE: CmNotifyFilterType = 1

public val CM_NOTIFY_FILTER_TYPE_DEVICEINSTANCE: CmNotifyFilterType = 2

public val CM_NOTIFY_FILTER_TYPE_DEVICEINTERFACE: CmNotifyFilterType = 0

public val CM_NOTIFY_FILTER_TYPE_MAX: CmNotifyFilterType = 3

public val CM_OPEN_CLASS_KEY_BITS: UInt = 1u

public val CM_OPEN_CLASS_KEY_INSTALLER: UInt = 0u

public val CM_OPEN_CLASS_KEY_INTERFACE: UInt = 1u

public val CM_PROB_BIOS_TABLE: CmProb = 35u

public val CM_PROB_BOOT_CONFIG_CONFLICT: CmProb = 6u

public val CM_PROB_CANT_SHARE_IRQ: CmProb = 30u

public val CM_PROB_CONSOLE_LOCKED: CmProb = 55u

public val CM_PROB_DEVICE_NOT_THERE: CmProb = 24u

public val CM_PROB_DEVICE_RESET: CmProb = 54u

public val CM_PROB_DEVLOADER_FAILED: CmProb = 2u

public val CM_PROB_DEVLOADER_NOT_FOUND: CmProb = 8u

public val CM_PROB_DEVLOADER_NOT_READY: CmProb = 23u

public val CM_PROB_DISABLED: CmProb = 22u

public val CM_PROB_DISABLED_SERVICE: CmProb = 32u

public val CM_PROB_DRIVER_BLOCKED: CmProb = 48u

public val CM_PROB_DRIVER_FAILED_LOAD: CmProb = 39u

public val CM_PROB_DRIVER_FAILED_PRIOR_UNLOAD: CmProb = 38u

public val CM_PROB_DRIVER_SERVICE_KEY_INVALID: CmProb = 40u

public val CM_PROB_DUPLICATE_DEVICE: CmProb = 42u

public val CM_PROB_ENTRY_IS_WRONG_TYPE: CmProb = 4u

public val CM_PROB_FAILED_ADD: CmProb = 31u

public val CM_PROB_FAILED_DRIVER_ENTRY: CmProb = 37u

public val CM_PROB_FAILED_FILTER: CmProb = 7u

public val CM_PROB_FAILED_INSTALL: CmProb = 28u

public val CM_PROB_FAILED_POST_START: CmProb = 43u

public val CM_PROB_FAILED_START: CmProb = 10u

public val CM_PROB_GUEST_ASSIGNMENT_FAILED: CmProb = 57u

public val CM_PROB_HALTED: CmProb = 44u

public val CM_PROB_HARDWARE_DISABLED: CmProb = 29u

public val CM_PROB_HELD_FOR_EJECT: CmProb = 47u

public val CM_PROB_INVALID_DATA: CmProb = 9u

public val CM_PROB_IRQ_TRANSLATION_FAILED: CmProb = 36u

public val CM_PROB_LACKED_ARBITRATOR: CmProb = 5u

public val CM_PROB_LEGACY_SERVICE_NO_DEVICES: CmProb = 41u

public val CM_PROB_LIAR: CmProb = 11u

public val CM_PROB_MOVED: CmProb = 25u

public val CM_PROB_NEED_CLASS_CONFIG: CmProb = 56u

public val CM_PROB_NEED_RESTART: CmProb = 14u

public val CM_PROB_NORMAL_CONFLICT: CmProb = 12u

public val CM_PROB_NOT_CONFIGURED: CmProb = 1u

public val CM_PROB_NOT_VERIFIED: CmProb = 13u

public val CM_PROB_NO_SOFTCONFIG: CmProb = 34u

public val CM_PROB_NO_VALID_LOG_CONF: CmProb = 27u

public val CM_PROB_OUT_OF_MEMORY: CmProb = 3u

public val CM_PROB_PARTIAL_LOG_CONF: CmProb = 16u

public val CM_PROB_PHANTOM: CmProb = 45u

public val CM_PROB_REENUMERATION: CmProb = 15u

public val CM_PROB_REGISTRY: CmProb = 19u

public val CM_PROB_REGISTRY_TOO_LARGE: CmProb = 49u

public val CM_PROB_REINSTALL: CmProb = 18u

public val CM_PROB_SETPROPERTIES_FAILED: CmProb = 50u

public val CM_PROB_SYSTEM_SHUTDOWN: CmProb = 46u

public val CM_PROB_TOO_EARLY: CmProb = 26u

public val CM_PROB_TRANSLATION_FAILED: CmProb = 33u

public val CM_PROB_UNKNOWN_RESOURCE: CmProb = 17u

public val CM_PROB_UNSIGNED_DRIVER: CmProb = 52u

public val CM_PROB_USED_BY_DEBUGGER: CmProb = 53u

public val CM_PROB_VXDLDR: CmProb = 20u

public val CM_PROB_WAITING_ON_DEPENDENCY: CmProb = 51u

public val CM_PROB_WILL_BE_REMOVED: CmProb = 21u

public val CM_QUERY_ARBITRATOR_BITS: UInt = 1u

public val CM_QUERY_ARBITRATOR_RAW: UInt = 0u

public val CM_QUERY_ARBITRATOR_TRANSLATED: UInt = 1u

public val CM_QUERY_REMOVE_UI_NOT_OK: UInt = 1u

public val CM_QUERY_REMOVE_UI_OK: UInt = 0u

public val CM_REENUMERATE_ASYNCHRONOUS: CmReenumerateFlags = 4u

public val CM_REENUMERATE_BITS: CmReenumerateFlags = 7u

public val CM_REENUMERATE_NORMAL: CmReenumerateFlags = 0u

public val CM_REENUMERATE_RETRY_INSTALLATION: CmReenumerateFlags = 2u

public val CM_REENUMERATE_SYNCHRONOUS: CmReenumerateFlags = 1u

public val CM_REGISTER_DEVICE_DRIVER_BITS: UInt = 3u

public val CM_REGISTER_DEVICE_DRIVER_DISABLEABLE: UInt = 1u

public val CM_REGISTER_DEVICE_DRIVER_REMOVABLE: UInt = 2u

public val CM_REGISTER_DEVICE_DRIVER_STATIC: UInt = 0u

public val CM_REGISTRY_BITS: UInt = 769u

public val CM_REGISTRY_CONFIG: UInt = 512u

public val CM_REGISTRY_HARDWARE: UInt = 0u

public val CM_REGISTRY_SOFTWARE: UInt = 1u

public val CM_REGISTRY_USER: UInt = 256u

public val CM_REMOVAL_POLICY_EXPECT_NO_REMOVAL: CmRemovalPolicy = 1u

public val CM_REMOVAL_POLICY_EXPECT_ORDERLY_REMOVAL: CmRemovalPolicy = 2u

public val CM_REMOVAL_POLICY_EXPECT_SURPRISE_REMOVAL: CmRemovalPolicy = 3u

public val CM_REMOVE_BITS: UInt = 7u

public val CM_REMOVE_DISABLE: UInt = 4u

public val CM_REMOVE_NO_RESTART: UInt = 2u

public val CM_REMOVE_UI_NOT_OK: UInt = 1u

public val CM_REMOVE_UI_OK: UInt = 0u

public val CM_RESDES_WIDTH_32: UInt = 1u

public val CM_RESDES_WIDTH_64: UInt = 2u

public val CM_RESDES_WIDTH_BITS: UInt = 3u

public val CM_RESDES_WIDTH_DEFAULT: UInt = 0u

public val CM_SETUP_BITS: UInt = 15u

public val CM_SETUP_DEVINST_CONFIG: UInt = 5u

public val CM_SETUP_DEVINST_CONFIG_CLASS: UInt = 6u

public val CM_SETUP_DEVINST_CONFIG_EXTENSIONS: UInt = 7u

public val CM_SETUP_DEVINST_CONFIG_RESET: UInt = 8u

public val CM_SETUP_DEVINST_READY: UInt = 0u

public val CM_SETUP_DEVINST_RESET: UInt = 4u

public val CM_SETUP_DEVNODE_CONFIG: UInt = 5u

public val CM_SETUP_DEVNODE_CONFIG_CLASS: UInt = 6u

public val CM_SETUP_DEVNODE_CONFIG_EXTENSIONS: UInt = 7u

public val CM_SETUP_DEVNODE_CONFIG_RESET: UInt = 8u

public val CM_SETUP_DEVNODE_READY: UInt = 0u

public val CM_SETUP_DEVNODE_RESET: UInt = 4u

public val CM_SETUP_DOWNLOAD: UInt = 1u

public val CM_SETUP_PROP_CHANGE: UInt = 3u

public val CM_SETUP_WRITE_LOG_CONFS: UInt = 2u

public val CM_SET_DEVINST_PROBLEM_BITS: UInt = 1u

public val CM_SET_DEVINST_PROBLEM_NORMAL: UInt = 0u

public val CM_SET_DEVINST_PROBLEM_OVERRIDE: UInt = 1u

public val CM_SET_DEVNODE_PROBLEM_BITS: UInt = 1u

public val CM_SET_DEVNODE_PROBLEM_NORMAL: UInt = 0u

public val CM_SET_DEVNODE_PROBLEM_OVERRIDE: UInt = 1u

public val CM_SET_HW_PROF_FLAGS_BITS: UInt = 1u

public val CM_SET_HW_PROF_FLAGS_UI_NOT_OK: UInt = 1u

public val CONFIGFLAG_BOOT_DEVICE: SetupDiDeviceConfigurationFlags = 262144u

public val CONFIGFLAG_CANTSTOPACHILD: SetupDiDeviceConfigurationFlags = 128u

public val CONFIGFLAG_DISABLED: SetupDiDeviceConfigurationFlags = 1u

public val CONFIGFLAG_FAILEDINSTALL: SetupDiDeviceConfigurationFlags = 64u

public val CONFIGFLAG_FINISHINSTALL_ACTION: SetupDiDeviceConfigurationFlags = 131072u

public val CONFIGFLAG_FINISHINSTALL_UI: SetupDiDeviceConfigurationFlags = 65536u

public val CONFIGFLAG_FINISH_INSTALL: SetupDiDeviceConfigurationFlags = 1024u

public val CONFIGFLAG_IGNORE_BOOT_LC: SetupDiDeviceConfigurationFlags = 8u

public val CONFIGFLAG_MANUAL_INSTALL: SetupDiDeviceConfigurationFlags = 4u

public val CONFIGFLAG_NEEDS_CLASS_CONFIG: SetupDiDeviceConfigurationFlags = 524288u

public val CONFIGFLAG_NEEDS_FORCED_CONFIG: SetupDiDeviceConfigurationFlags = 2048u

public val CONFIGFLAG_NETBOOT_CARD: SetupDiDeviceConfigurationFlags = 4096u

public val CONFIGFLAG_NET_BOOT: SetupDiDeviceConfigurationFlags = 16u

public val CONFIGFLAG_NOREMOVEEXIT: SetupDiDeviceConfigurationFlags = 512u

public val CONFIGFLAG_OKREMOVEROM: SetupDiDeviceConfigurationFlags = 256u

public val CONFIGFLAG_PARTIAL_LOG_CONF: SetupDiDeviceConfigurationFlags = 8192u

public val CONFIGFLAG_REINSTALL: SetupDiDeviceConfigurationFlags = 32u

public val CONFIGFLAG_REMOVED: SetupDiDeviceConfigurationFlags = 2u

public val CONFIGFLAG_SUPPRESS_SURPRISE: SetupDiDeviceConfigurationFlags = 16384u

public val CONFIGFLAG_VERIFY_HARDWARE: SetupDiDeviceConfigurationFlags = 32768u

public val CONFIGMG_VERSION: UInt = 1024u

public val COPYFLG_FORCE_FILE_IN_USE: UInt = 8u

public val COPYFLG_IN_USE_TRY_RENAME: UInt = 16384u

public val COPYFLG_NODECOMP: UInt = 2048u

public val COPYFLG_NOPRUNE: UInt = 8192u

public val COPYFLG_NOSKIP: UInt = 2u

public val COPYFLG_NOVERSIONCHECK: UInt = 4u

public val COPYFLG_NO_OVERWRITE: UInt = 16u

public val COPYFLG_NO_VERSION_DIALOG: UInt = 32u

public val COPYFLG_OVERWRITE_OLDER_ONLY: UInt = 64u

public val COPYFLG_PROTECTED_WINDOWS_DRIVER_FILE: UInt = 256u

public val COPYFLG_REPLACEONLY: UInt = 1024u

public val COPYFLG_REPLACE_BOOT_FILE: UInt = 4096u

public val COPYFLG_WARN_IF_SKIP: UInt = 1u

public val CR_ACCESS_DENIED: Configret = 51u

public val CR_ALREADY_SUCH_DEVINST: Configret = 16u

public val CR_ALREADY_SUCH_DEVNODE: Configret = 16u

public val CR_APM_VETOED: Configret = 24u

public val CR_BUFFER_SMALL: Configret = 26u

public val CR_CALL_NOT_IMPLEMENTED: Configret = 52u

public val CR_CANT_SHARE_IRQ: Configret = 43u

public val CR_CREATE_BLOCKED: Configret = 21u

public val CR_DEFAULT: Configret = 1u

public val CR_DEVICE_INTERFACE_ACTIVE: Configret = 54u

public val CR_DEVICE_NOT_THERE: Configret = 36u

public val CR_DEVINST_HAS_REQS: Configret = 10u

public val CR_DEVLOADER_NOT_READY: Configret = 33u

public val CR_DEVNODE_HAS_REQS: Configret = 10u

public val CR_DLVXD_NOT_FOUND: Configret = 12u

public val CR_FAILURE: Configret = 19u

public val CR_FREE_RESOURCES: Configret = 41u

public val CR_INVALID_API: Configret = 32u

public val CR_INVALID_ARBITRATOR: Configret = 8u

public val CR_INVALID_CONFLICT_LIST: Configret = 57u

public val CR_INVALID_DATA: Configret = 31u

public val CR_INVALID_DEVICE_ID: Configret = 30u

public val CR_INVALID_DEVINST: Configret = 5u

public val CR_INVALID_DEVNODE: Configret = 5u

public val CR_INVALID_FLAG: Configret = 4u

public val CR_INVALID_INDEX: Configret = 58u

public val CR_INVALID_LOAD_TYPE: Configret = 25u

public val CR_INVALID_LOG_CONF: Configret = 7u

public val CR_INVALID_MACHINENAME: Configret = 47u

public val CR_INVALID_NODELIST: Configret = 9u

public val CR_INVALID_POINTER: Configret = 3u

public val CR_INVALID_PRIORITY: Configret = 39u

public val CR_INVALID_PROPERTY: Configret = 53u

public val CR_INVALID_RANGE: Configret = 18u

public val CR_INVALID_RANGE_LIST: Configret = 17u

public val CR_INVALID_REFERENCE_STRING: Configret = 56u

public val CR_INVALID_RESOURCEID: Configret = 11u

public val CR_INVALID_RES_DES: Configret = 6u

public val CR_INVALID_STRUCTURE_SIZE: Configret = 59u

public val CR_MACHINE_UNAVAILABLE: Configret = 49u

public val CR_NEED_RESTART: Configret = 34u

public val CR_NOT_DISABLEABLE: Configret = 40u

public val CR_NOT_SYSTEM_VM: Configret = 22u

public val CR_NO_ARBITRATOR: Configret = 27u

public val CR_NO_CM_SERVICES: Configret = 50u

public val CR_NO_DEPENDENT: Configret = 44u

public val CR_NO_MORE_HW_PROFILES: Configret = 35u

public val CR_NO_MORE_LOG_CONF: Configret = 14u

public val CR_NO_MORE_RES_DES: Configret = 15u

public val CR_NO_REGISTRY_HANDLE: Configret = 28u

public val CR_NO_SUCH_DEVICE_INTERFACE: Configret = 55u

public val CR_NO_SUCH_DEVINST: Configret = 13u

public val CR_NO_SUCH_DEVNODE: Configret = 13u

public val CR_NO_SUCH_LOGICAL_DEV: Configret = 20u

public val CR_NO_SUCH_REGISTRY_KEY: Configret = 46u

public val CR_NO_SUCH_VALUE: Configret = 37u

public val CR_OUT_OF_MEMORY: Configret = 2u

public val CR_QUERY_VETOED: Configret = 42u

public val CR_REGISTRY_ERROR: Configret = 29u

public val CR_REMOTE_COMM_FAILURE: Configret = 48u

public val CR_REMOVE_VETOED: Configret = 23u

public val CR_SAME_RESOURCES: Configret = 45u

public val CR_SUCCESS: Configret = 0u

public val CR_WRONG_TYPE: Configret = 38u

public val DELFLG_IN_USE: UInt = 1u

public val DELFLG_IN_USE1: UInt = 65536u

public val DIBCI_NODISPLAYCLASS: UInt = 2u

public val DIBCI_NOINSTALLCLASS: UInt = 1u

public val DICD_GENERATE_ID: SetupDiDeviceCreationFlags = 1u

public val DICD_INHERIT_CLASSDRVS: SetupDiDeviceCreationFlags = 2u

public val DICLASSPROP_INSTALLER: UInt = 1u

public val DICLASSPROP_INTERFACE: UInt = 2u

public val DICS_DISABLE: SetupDiStateChange = 2u

public val DICS_ENABLE: SetupDiStateChange = 1u

public val DICS_FLAG_CONFIGGENERAL: SetupDiPropertyChangeScope = 4u

public val DICS_FLAG_CONFIGSPECIFIC: SetupDiPropertyChangeScope = 2u

public val DICS_FLAG_GLOBAL: SetupDiPropertyChangeScope = 1u

public val DICS_PROPCHANGE: SetupDiStateChange = 3u

public val DICS_START: SetupDiStateChange = 4u

public val DICS_STOP: SetupDiStateChange = 5u

public val DICUSTOMDEVPROP_MERGE_MULTISZ: UInt = 1u

public val DIF_ADDPROPERTYPAGE_ADVANCED: DiFunction = 35u

public val DIF_ADDPROPERTYPAGE_BASIC: DiFunction = 36u

public val DIF_ADDREMOTEPROPERTYPAGE_ADVANCED: DiFunction = 40u

public val DIF_ALLOW_INSTALL: DiFunction = 24u

public val DIF_ASSIGNRESOURCES: DiFunction = 3u

public val DIF_CALCDISKSPACE: DiFunction = 11u

public val DIF_DESTROYPRIVATEDATA: DiFunction = 12u

public val DIF_DESTROYWIZARDDATA: DiFunction = 17u

public val DIF_DETECT: DiFunction = 15u

public val DIF_DETECTCANCEL: DiFunction = 33u

public val DIF_DETECTVERIFY: DiFunction = 20u

public val DIF_ENABLECLASS: DiFunction = 19u

public val DIF_FINISHINSTALL_ACTION: DiFunction = 42u

public val DIF_FIRSTTIMESETUP: DiFunction = 6u

public val DIF_FOUNDDEVICE: DiFunction = 7u

public val DIF_INSTALLCLASSDRIVERS: DiFunction = 10u

public val DIF_INSTALLDEVICE: DiFunction = 2u

public val DIF_INSTALLDEVICEFILES: DiFunction = 21u

public val DIF_INSTALLINTERFACES: DiFunction = 32u

public val DIF_INSTALLWIZARD: DiFunction = 16u

public val DIF_MOVEDEVICE: DiFunction = 14u

public val DIF_NEWDEVICEWIZARD_FINISHINSTALL: DiFunction = 30u

public val DIF_NEWDEVICEWIZARD_POSTANALYZE: DiFunction = 29u

public val DIF_NEWDEVICEWIZARD_PREANALYZE: DiFunction = 28u

public val DIF_NEWDEVICEWIZARD_PRESELECT: DiFunction = 26u

public val DIF_NEWDEVICEWIZARD_SELECT: DiFunction = 27u

public val DIF_POWERMESSAGEWAKE: DiFunction = 39u

public val DIF_PROPERTIES: DiFunction = 4u

public val DIF_PROPERTYCHANGE: DiFunction = 18u

public val DIF_REGISTERDEVICE: DiFunction = 25u

public val DIF_REGISTER_COINSTALLERS: DiFunction = 34u

public val DIF_REMOVE: DiFunction = 5u

public val DIF_RESERVED1: DiFunction = 37u

public val DIF_RESERVED2: DiFunction = 48u

public val DIF_SELECTBESTCOMPATDRV: DiFunction = 23u

public val DIF_SELECTCLASSDRIVERS: DiFunction = 8u

public val DIF_SELECTDEVICE: DiFunction = 1u

public val DIF_TROUBLESHOOTER: DiFunction = 38u

public val DIF_UNREMOVE: DiFunction = 22u

public val DIF_UNUSED1: DiFunction = 31u

public val DIF_UPDATEDRIVER_UI: DiFunction = 41u

public val DIF_VALIDATECLASSDRIVERS: DiFunction = 9u

public val DIF_VALIDATEDRIVER: DiFunction = 13u

public val DIGCDP_FLAG_ADVANCED: UInt = 2u

public val DIGCDP_FLAG_BASIC: UInt = 1u

public val DIGCDP_FLAG_REMOTE_ADVANCED: UInt = 4u

public val DIGCDP_FLAG_REMOTE_BASIC: UInt = 3u

public val DIGCF_ALLCLASSES: SetupDiGetClassDevsFlags = 4u

public val DIGCF_DEFAULT: SetupDiGetClassDevsFlags = 1u

public val DIGCF_DEVICEINTERFACE: SetupDiGetClassDevsFlags = 16u

public val DIGCF_INTERFACEDEVICE: SetupDiGetClassDevsFlags = 16u

public val DIGCF_PRESENT: SetupDiGetClassDevsFlags = 2u

public val DIGCF_PROFILE: SetupDiGetClassDevsFlags = 8u

public val DIIDFLAG_BITS: DiinstalldeviceFlags = 15u

public val DIIDFLAG_INSTALLCOPYINFDRIVERS: DiinstalldeviceFlags = 8u

public val DIIDFLAG_INSTALLNULLDRIVER: DiinstalldeviceFlags = 4u

public val DIIDFLAG_NOFINISHINSTALLUI: DiinstalldeviceFlags = 2u

public val DIIDFLAG_SHOWSEARCHUI: DiinstalldeviceFlags = 1u

public val DIIRFLAG_BITS: DiinstalldriverFlags = 106u

public val DIIRFLAG_FORCE_INF: DiinstalldriverFlags = 2u

public val DIIRFLAG_HOTPATCH: DiinstalldriverFlags = 8u

public val DIIRFLAG_HW_USING_THE_INF: DiinstalldriverFlags = 4u

public val DIIRFLAG_INF_ALREADY_COPIED: DiinstalldriverFlags = 1u

public val DIIRFLAG_INSTALL_AS_SET: DiinstalldriverFlags = 64u

public val DIIRFLAG_NOBACKUP: DiinstalldriverFlags = 16u

public val DIIRFLAG_PRE_CONFIGURE_INF: DiinstalldriverFlags = 32u

public val DIIRFLAG_SYSTEM_BITS: DiinstalldriverFlags = 127u

public val DIOCR_INSTALLER: UInt = 1u

public val DIOCR_INTERFACE: UInt = 2u

public val DIODI_NO_ADD: UInt = 1u

public val DIOD_CANCEL_REMOVE: UInt = 4u

public val DIOD_INHERIT_CLASSDRVS: UInt = 2u

public val DIREG_BOTH: UInt = 4u

public val DIREG_DEV: UInt = 1u

public val DIREG_DRV: UInt = 2u

public val DIRID_ABSOLUTE: Int = -1

public val DIRID_ABSOLUTE_16BIT: UInt = 65535u

public val DIRID_APPS: UInt = 24u

public val DIRID_BOOT: UInt = 30u

public val DIRID_COLOR: UInt = 23u

public val DIRID_COMMON_APPDATA: UInt = 16419u

public val DIRID_COMMON_DESKTOPDIRECTORY: UInt = 16409u

public val DIRID_COMMON_DOCUMENTS: UInt = 16430u

public val DIRID_COMMON_FAVORITES: UInt = 16415u

public val DIRID_COMMON_PROGRAMS: UInt = 16407u

public val DIRID_COMMON_STARTMENU: UInt = 16406u

public val DIRID_COMMON_STARTUP: UInt = 16408u

public val DIRID_COMMON_TEMPLATES: UInt = 16429u

public val DIRID_DEFAULT: UInt = 11u

public val DIRID_DRIVERS: UInt = 12u

public val DIRID_DRIVER_STORE: UInt = 13u

public val DIRID_FONTS: UInt = 20u

public val DIRID_HELP: UInt = 18u

public val DIRID_INF: UInt = 17u

public val DIRID_IOSUBSYS: UInt = 12u

public val DIRID_LOADER: UInt = 54u

public val DIRID_NULL: UInt = 0u

public val DIRID_PRINTPROCESSOR: UInt = 55u

public val DIRID_PROGRAM_FILES: UInt = 16422u

public val DIRID_PROGRAM_FILES_COMMON: UInt = 16427u

public val DIRID_PROGRAM_FILES_COMMONX86: UInt = 16428u

public val DIRID_PROGRAM_FILES_X86: UInt = 16426u

public val DIRID_SHARED: UInt = 25u

public val DIRID_SPOOL: UInt = 51u

public val DIRID_SPOOLDRIVERS: UInt = 52u

public val DIRID_SRCPATH: UInt = 1u

public val DIRID_SYSTEM: UInt = 11u

public val DIRID_SYSTEM16: UInt = 50u

public val DIRID_SYSTEM_X86: UInt = 16425u

public val DIRID_USER: UInt = 32768u

public val DIRID_USERPROFILE: UInt = 53u

public val DIRID_VIEWERS: UInt = 21u

public val DIRID_WINDOWS: UInt = 10u

public val DIURFLAG_NO_REMOVE_INF: DiuninstalldriverFlags = 1u

public val DIURFLAG_RESERVED: DiuninstalldriverFlags = 2u

public val DIURFLAG_VALID: DiuninstalldriverFlags = 3u

public val DI_AUTOASSIGNRES: SetupDiDeviceInstallFlags = 64u

public val DI_CLASSINSTALLPARAMS: SetupDiDeviceInstallFlags = 1048576u

public val DI_COMPAT_FROM_CLASS: SetupDiDeviceInstallFlags = 524288u

public val DI_DIDCLASS: SetupDiDeviceInstallFlags = 32u

public val DI_DIDCOMPAT: SetupDiDeviceInstallFlags = 16u

public val DI_DISABLED: SetupDiDeviceInstallFlags = 2048u

public val DI_DONOTCALLCONFIGMG: SetupDiDeviceInstallFlags = 131072u

public val DI_DRIVERPAGE_ADDED: SetupDiDeviceInstallFlags = 67108864u

public val DI_ENUMSINGLEINF: SetupDiDeviceInstallFlags = 65536u

public val DI_FLAGSEX_ALLOWEXCLUDEDDRVS: SetupDiDeviceInstallFlagsEx = 2048u

public val DI_FLAGSEX_ALTPLATFORM_DRVSEARCH: SetupDiDeviceInstallFlagsEx = 268435456u

public val DI_FLAGSEX_ALWAYSWRITEIDS: SetupDiDeviceInstallFlagsEx = 512u

public val DI_FLAGSEX_APPENDDRIVERLIST: SetupDiDeviceInstallFlagsEx = 262144u

public val DI_FLAGSEX_BACKUPONREPLACE: SetupDiDeviceInstallFlagsEx = 1048576u

public val DI_FLAGSEX_CI_FAILED: SetupDiDeviceInstallFlagsEx = 4u

public val DI_FLAGSEX_DEVICECHANGE: SetupDiDeviceInstallFlagsEx = 256u

public val DI_FLAGSEX_DIDCOMPATINFO: SetupDiDeviceInstallFlagsEx = 32u

public val DI_FLAGSEX_DIDINFOLIST: SetupDiDeviceInstallFlagsEx = 16u

public val DI_FLAGSEX_DRIVERLIST_FROM_URL: SetupDiDeviceInstallFlagsEx = 2097152u

public val DI_FLAGSEX_EXCLUDE_OLD_INET_DRIVERS: SetupDiDeviceInstallFlagsEx = 8388608u

public val DI_FLAGSEX_FILTERCLASSES: SetupDiDeviceInstallFlagsEx = 64u

public val DI_FLAGSEX_FILTERSIMILARDRIVERS: SetupDiDeviceInstallFlagsEx = 33554432u

public val DI_FLAGSEX_FINISHINSTALL_ACTION: SetupDiDeviceInstallFlagsEx = 8u

public val DI_FLAGSEX_INET_DRIVER: SetupDiDeviceInstallFlagsEx = 131072u

public val DI_FLAGSEX_INSTALLEDDRIVER: SetupDiDeviceInstallFlagsEx = 67108864u

public val DI_FLAGSEX_IN_SYSTEM_SETUP: SetupDiDeviceInstallFlagsEx = 65536u

public val DI_FLAGSEX_NOUIONQUERYREMOVE: SetupDiDeviceInstallFlagsEx = 4096u

public val DI_FLAGSEX_NO_CLASSLIST_NODE_MERGE: SetupDiDeviceInstallFlagsEx = 134217728u

public val DI_FLAGSEX_NO_DRVREG_MODIFY: SetupDiDeviceInstallFlagsEx = 32768u

public val DI_FLAGSEX_POWERPAGE_ADDED: SetupDiDeviceInstallFlagsEx = 16777216u

public val DI_FLAGSEX_PREINSTALLBACKUP: SetupDiDeviceInstallFlagsEx = 524288u

public val DI_FLAGSEX_PROPCHANGE_PENDING: SetupDiDeviceInstallFlagsEx = 1024u

public val DI_FLAGSEX_RECURSIVESEARCH: SetupDiDeviceInstallFlagsEx = 1073741824u

public val DI_FLAGSEX_RESERVED1: SetupDiDeviceInstallFlagsEx = 4194304u

public val DI_FLAGSEX_RESERVED2: SetupDiDeviceInstallFlagsEx = 1u

public val DI_FLAGSEX_RESERVED3: SetupDiDeviceInstallFlagsEx = 2u

public val DI_FLAGSEX_RESERVED4: SetupDiDeviceInstallFlagsEx = 16384u

public val DI_FLAGSEX_RESTART_DEVICE_ONLY: SetupDiDeviceInstallFlagsEx = 536870912u

public val DI_FLAGSEX_SEARCH_PUBLISHED_INFS: SetupDiDeviceInstallFlagsEx = 2147483648u

public val DI_FLAGSEX_SETFAILEDINSTALL: SetupDiDeviceInstallFlagsEx = 128u

public val DI_FLAGSEX_USECLASSFORCOMPAT: SetupDiDeviceInstallFlagsEx = 8192u

public val DI_FORCECOPY: SetupDiDeviceInstallFlags = 33554432u

public val DI_GENERALPAGE_ADDED: SetupDiDeviceInstallFlags = 4096u

public val DI_INF_IS_SORTED: SetupDiDeviceInstallFlags = 32768u

public val DI_INSTALLDISABLED: SetupDiDeviceInstallFlags = 262144u

public val DI_MULTMFGS: SetupDiDeviceInstallFlags = 1024u

public val DI_NEEDREBOOT: SetupDiDeviceInstallFlags = 256u

public val DI_NEEDRESTART: SetupDiDeviceInstallFlags = 128u

public val DI_NOBROWSE: SetupDiDeviceInstallFlags = 512u

public val DI_NODI_DEFAULTACTION: SetupDiDeviceInstallFlags = 2097152u

public val DI_NOFILECOPY: SetupDiDeviceInstallFlags = 16777216u

public val DI_NOSELECTICONS: SetupDiDeviceInstallFlags = 1073741824u

public val DI_NOVCP: SetupDiDeviceInstallFlags = 8u

public val DI_NOWRITE_IDS: SetupDiDeviceInstallFlags = 2147483648u

public val DI_OVERRIDE_INFFLAGS: SetupDiDeviceInstallFlags = 268435456u

public val DI_PROPERTIES_CHANGE: SetupDiDeviceInstallFlags = 16384u

public val DI_PROPS_NOCHANGEUSAGE: SetupDiDeviceInstallFlags = 536870912u

public val DI_QUIETINSTALL: SetupDiDeviceInstallFlags = 8388608u

public val DI_REMOVEDEVICE_CONFIGSPECIFIC: SetupDiRemoveDeviceScope = 2u

public val DI_REMOVEDEVICE_GLOBAL: SetupDiRemoveDeviceScope = 1u

public val DI_RESOURCEPAGE_ADDED: SetupDiDeviceInstallFlags = 8192u

public val DI_SHOWALL: SetupDiDeviceInstallFlags = 7u

public val DI_SHOWCLASS: SetupDiDeviceInstallFlags = 4u

public val DI_SHOWCOMPAT: SetupDiDeviceInstallFlags = 2u

public val DI_SHOWOEM: SetupDiDeviceInstallFlags = 1u

public val DI_UNREMOVEDEVICE_CONFIGSPECIFIC: SetupDiDeviceInstallFlags = 2u

public val DI_USECI_SELECTSTRINGS: SetupDiDeviceInstallFlags = 134217728u

public val DMI_BKCOLOR: UInt = 2u

public val DMI_MASK: UInt = 1u

public val DMI_USERECT: UInt = 4u

public val DNF_ALWAYSEXCLUDEFROMLIST: SetupDiDriverInstallFlags = 524288u

public val DNF_AUTHENTICODE_SIGNED: SetupDiDriverInstallFlags = 131072u

public val DNF_BAD_DRIVER: SetupDiDriverInstallFlags = 2048u

public val DNF_BASIC_DRIVER: SetupDiDriverInstallFlags = 65536u

public val DNF_CLASS_DRIVER: SetupDiDriverInstallFlags = 32u

public val DNF_COMPATIBLE_DRIVER: SetupDiDriverInstallFlags = 64u

public val DNF_DUPDESC: SetupDiDriverInstallFlags = 1u

public val DNF_DUPDRIVERVER: SetupDiDriverInstallFlags = 32768u

public val DNF_DUPPROVIDER: SetupDiDriverInstallFlags = 4096u

public val DNF_EXCLUDEFROMLIST: SetupDiDriverInstallFlags = 4u

public val DNF_INBOX_DRIVER: SetupDiDriverInstallFlags = 1048576u

public val DNF_INET_DRIVER: SetupDiDriverInstallFlags = 128u

public val DNF_INF_IS_SIGNED: SetupDiDriverInstallFlags = 8192u

public val DNF_INSTALLEDDRIVER: SetupDiDriverInstallFlags = 262144u

public val DNF_LEGACYINF: SetupDiDriverInstallFlags = 16u

public val DNF_NODRIVER: SetupDiDriverInstallFlags = 8u

public val DNF_OEM_F6_INF: SetupDiDriverInstallFlags = 16384u

public val DNF_OLDDRIVER: SetupDiDriverInstallFlags = 2u

public val DNF_OLD_INET_DRIVER: SetupDiDriverInstallFlags = 1024u

public val DNF_REQUESTADDITIONALSOFTWARE: SetupDiDriverInstallFlags = 2097152u

public val DNF_UNUSED1: SetupDiDriverInstallFlags = 256u

public val DNF_UNUSED2: SetupDiDriverInstallFlags = 512u

public val DNF_UNUSED_22: SetupDiDriverInstallFlags = 4194304u

public val DNF_UNUSED_23: SetupDiDriverInstallFlags = 8388608u

public val DNF_UNUSED_24: SetupDiDriverInstallFlags = 16777216u

public val DNF_UNUSED_25: SetupDiDriverInstallFlags = 33554432u

public val DNF_UNUSED_26: SetupDiDriverInstallFlags = 67108864u

public val DNF_UNUSED_27: SetupDiDriverInstallFlags = 134217728u

public val DNF_UNUSED_28: SetupDiDriverInstallFlags = 268435456u

public val DNF_UNUSED_29: SetupDiDriverInstallFlags = 536870912u

public val DNF_UNUSED_30: SetupDiDriverInstallFlags = 1073741824u

public val DNF_UNUSED_31: SetupDiDriverInstallFlags = 2147483648u

public val DN_APM_DRIVER: CmDevnodeStatusFlags = 268435456u

public val DN_APM_ENUMERATOR: CmDevnodeStatusFlags = 134217728u

public val DN_ARM_WAKEUP: CmDevnodeStatusFlags = 67108864u

public val DN_BAD_PARTIAL: CmDevnodeStatusFlags = 4194304u

public val DN_BOOT_LOG_PROB: CmDevnodeStatusFlags = 2147483648u

public val DN_CHANGEABLE_FLAGS: CmDevnodeStatusFlags = 1639670464u

public val DN_CHILD_WITH_INVALID_ID: CmDevnodeStatusFlags = 512u

public val DN_DEVICE_DISCONNECTED: CmDevnodeStatusFlags = 33554432u

public val DN_DISABLEABLE: CmDevnodeStatusFlags = 8192u

public val DN_DRIVER_BLOCKED: CmDevnodeStatusFlags = 64u

public val DN_DRIVER_LOADED: CmDevnodeStatusFlags = 2u

public val DN_ENUM_LOADED: CmDevnodeStatusFlags = 4u

public val DN_FILTERED: CmDevnodeStatusFlags = 2048u

public val DN_HARDWARE_ENUM: CmDevnodeStatusFlags = 128u

public val DN_HAS_MARK: CmDevnodeStatusFlags = 512u

public val DN_HAS_PROBLEM: CmDevnodeStatusFlags = 1024u

public val DN_LEGACY_DRIVER: CmDevnodeStatusFlags = 4096u

public val DN_LIAR: CmDevnodeStatusFlags = 256u

public val DN_MANUAL: CmDevnodeStatusFlags = 16u

public val DN_MF_CHILD: CmDevnodeStatusFlags = 131072u

public val DN_MF_PARENT: CmDevnodeStatusFlags = 65536u

public val DN_MOVED: CmDevnodeStatusFlags = 4096u

public val DN_NEEDS_LOCKING: CmDevnodeStatusFlags = 33554432u

public val DN_NEED_RESTART: CmDevnodeStatusFlags = 256u

public val DN_NEED_TO_ENUM: CmDevnodeStatusFlags = 32u

public val DN_NOT_FIRST_TIME: CmDevnodeStatusFlags = 64u

public val DN_NOT_FIRST_TIMEE: CmDevnodeStatusFlags = 524288u

public val DN_NO_SHOW_IN_DM: CmDevnodeStatusFlags = 1073741824u

public val DN_NT_DRIVER: CmDevnodeStatusFlags = 16777216u

public val DN_NT_ENUMERATOR: CmDevnodeStatusFlags = 8388608u

public val DN_PRIVATE_PROBLEM: CmDevnodeStatusFlags = 32768u

public val DN_QUERY_REMOVE_ACTIVE: CmDevnodeStatusFlags = 131072u

public val DN_QUERY_REMOVE_PENDING: CmDevnodeStatusFlags = 65536u

public val DN_REBAL_CANDIDATE: CmDevnodeStatusFlags = 2097152u

public val DN_REMOVABLE: CmDevnodeStatusFlags = 16384u

public val DN_ROOT_ENUMERATED: CmDevnodeStatusFlags = 1u

public val DN_SILENT_INSTALL: CmDevnodeStatusFlags = 536870912u

public val DN_STARTED: CmDevnodeStatusFlags = 8u

public val DN_STOP_FREE_RES: CmDevnodeStatusFlags = 1048576u

public val DN_WILL_BE_REMOVED: CmDevnodeStatusFlags = 262144u

public val DPROMPT_BUFFERTOOSMALL: UInt = 3u

public val DPROMPT_CANCEL: UInt = 1u

public val DPROMPT_OUTOFMEMORY: UInt = 4u

public val DPROMPT_SKIPFILE: UInt = 2u

public val DPROMPT_SUCCESS: UInt = 0u

public val DRIVER_COMPATID_RANK: UInt = 16383u

public val DRIVER_HARDWAREID_MASK: UInt = 2147487743u

public val DRIVER_HARDWAREID_RANK: UInt = 4095u

public val DRIVER_UNTRUSTED_COMPATID_RANK: UInt = 49151u

public val DRIVER_UNTRUSTED_HARDWAREID_RANK: UInt = 36863u

public val DRIVER_UNTRUSTED_RANK: UInt = 2147483648u

public val DRIVER_W9X_SUSPECT_COMPATID_RANK: UInt = 65535u

public val DRIVER_W9X_SUSPECT_HARDWAREID_RANK: UInt = 53247u

public val DRIVER_W9X_SUSPECT_RANK: UInt = 3221225472u

public val DWORD_MAX: UInt = 4294967295u

public val DYNAWIZ_FLAG_ANALYZE_HANDLECONFLICT: UInt = 8u

public val DYNAWIZ_FLAG_INSTALLDET_NEXT: UInt = 2u

public val DYNAWIZ_FLAG_INSTALLDET_PREV: UInt = 4u

public val DYNAWIZ_FLAG_PAGESADDED: UInt = 1u

public val ENABLECLASS_FAILURE: UInt = 2u

public val ENABLECLASS_QUERY: UInt = 0u

public val ENABLECLASS_SUCCESS: UInt = 1u

public val FILEOP_ABORT: UInt = 0u

public val FILEOP_BACKUP: UInt = 3u

public val FILEOP_COPY: SetupFileOperation = 0u

public val FILEOP_DELETE: SetupFileOperation = 2u

public val FILEOP_DOIT: UInt = 1u

public val FILEOP_NEWPATH: UInt = 4u

public val FILEOP_RENAME: UInt = 1u

public val FILEOP_RETRY: UInt = 1u

public val FILEOP_SKIP: UInt = 2u

public val FILE_COMPRESSION_MSZIP: FileCompressionType = 2u

public val FILE_COMPRESSION_NONE: FileCompressionType = 0u

public val FILE_COMPRESSION_NTCAB: FileCompressionType = 3u

public val FILE_COMPRESSION_WINLZA: FileCompressionType = 1u

public val FILTERED_LOG_CONF: CmLogConf = 1u

public val FLG_ADDPROPERTY_AND: UInt = 16u

public val FLG_ADDPROPERTY_APPEND: UInt = 4u

public val FLG_ADDPROPERTY_NOCLOBBER: UInt = 1u

public val FLG_ADDPROPERTY_OR: UInt = 8u

public val FLG_ADDPROPERTY_OVERWRITEONLY: UInt = 2u

public val FLG_ADDREG_32BITKEY: UInt = 16384u

public val FLG_ADDREG_64BITKEY: UInt = 4096u

public val FLG_ADDREG_APPEND: UInt = 8u

public val FLG_ADDREG_BINVALUETYPE: UInt = 1u

public val FLG_ADDREG_DELREG_BIT: UInt = 32768u

public val FLG_ADDREG_DELVAL: UInt = 4u

public val FLG_ADDREG_KEYONLY: UInt = 16u

public val FLG_ADDREG_KEYONLY_COMMON: UInt = 8192u

public val FLG_ADDREG_NOCLOBBER: UInt = 2u

public val FLG_ADDREG_OVERWRITEONLY: UInt = 32u

public val FLG_ADDREG_TYPE_EXPAND_SZ: UInt = 131072u

public val FLG_ADDREG_TYPE_MULTI_SZ: UInt = 65536u

public val FLG_ADDREG_TYPE_SZ: UInt = 0u

public val FLG_BITREG_32BITKEY: UInt = 16384u

public val FLG_BITREG_64BITKEY: UInt = 4096u

public val FLG_BITREG_CLEARBITS: UInt = 0u

public val FLG_BITREG_SETBITS: UInt = 1u

public val FLG_DELPROPERTY_MULTI_SZ_DELSTRING: UInt = 1u

public val FLG_DELREG_32BITKEY: UInt = 16384u

public val FLG_DELREG_64BITKEY: UInt = 4096u

public val FLG_DELREG_KEYONLY_COMMON: UInt = 8192u

public val FLG_DELREG_OPERATION_MASK: UInt = 254u

public val FLG_DELREG_TYPE_EXPAND_SZ: UInt = 131072u

public val FLG_DELREG_TYPE_MULTI_SZ: UInt = 65536u

public val FLG_DELREG_TYPE_SZ: UInt = 0u

public val FLG_DELREG_VALUE: UInt = 0u

public val FLG_INI2REG_32BITKEY: UInt = 16384u

public val FLG_INI2REG_64BITKEY: UInt = 4096u

public val FLG_PROFITEM_CSIDL: UInt = 8u

public val FLG_PROFITEM_CURRENTUSER: UInt = 1u

public val FLG_PROFITEM_DELETE: UInt = 2u

public val FLG_PROFITEM_GROUP: UInt = 4u

public val FLG_REGSVR_DLLINSTALL: UInt = 2u

public val FLG_REGSVR_DLLREGISTER: UInt = 1u

public val FORCED_LOG_CONF: CmLogConf = 4u

public val IDD_DYNAWIZ_ANALYZEDEV_PAGE: UInt = 10010u

public val IDD_DYNAWIZ_ANALYZE_NEXTPAGE: UInt = 10004u

public val IDD_DYNAWIZ_ANALYZE_PREVPAGE: UInt = 10003u

public val IDD_DYNAWIZ_FIRSTPAGE: UInt = 10000u

public val IDD_DYNAWIZ_INSTALLDETECTEDDEVS_PAGE: UInt = 10011u

public val IDD_DYNAWIZ_INSTALLDETECTED_NEXTPAGE: UInt = 10007u

public val IDD_DYNAWIZ_INSTALLDETECTED_NODEVS: UInt = 10008u

public val IDD_DYNAWIZ_INSTALLDETECTED_PREVPAGE: UInt = 10006u

public val IDD_DYNAWIZ_SELECTCLASS_PAGE: UInt = 10012u

public val IDD_DYNAWIZ_SELECTDEV_PAGE: UInt = 10009u

public val IDD_DYNAWIZ_SELECT_NEXTPAGE: UInt = 10002u

public val IDD_DYNAWIZ_SELECT_PREVPAGE: UInt = 10001u

public val IDF_CHECKFIRST: UInt = 256u

public val IDF_NOBEEP: UInt = 512u

public val IDF_NOBROWSE: UInt = 1u

public val IDF_NOCOMPRESSED: UInt = 8u

public val IDF_NODETAILS: UInt = 4u

public val IDF_NOFOREGROUND: UInt = 1024u

public val IDF_NOREMOVABLEMEDIAPROMPT: UInt = 4096u

public val IDF_NOSKIP: UInt = 2u

public val IDF_OEMDISK: UInt = 2147483648u

public val IDF_USEDISKNAMEASPROMPT: UInt = 8192u

public val IDF_WARNIFSKIP: UInt = 2048u

public val IDI_CLASSICON_OVERLAYFIRST: UInt = 500u

public val IDI_CLASSICON_OVERLAYLAST: UInt = 502u

public val IDI_CONFLICT: UInt = 161u

public val IDI_DISABLED_OVL: UInt = 501u

public val IDI_FORCED_OVL: UInt = 502u

public val IDI_PROBLEM_OVL: UInt = 500u

public val IDI_RESOURCE: UInt = 159u

public val IDI_RESOURCEFIRST: UInt = 159u

public val IDI_RESOURCELAST: UInt = 161u

public val IDI_RESOURCEOVERLAYFIRST: UInt = 161u

public val IDI_RESOURCEOVERLAYLAST: UInt = 161u

public val INFINFO_DEFAULT_SEARCH: UInt = 3u

public val INFINFO_INF_NAME_IS_ABSOLUTE: UInt = 2u

public val INFINFO_INF_PATH_LIST_SEARCH: UInt = 5u

public val INFINFO_INF_SPEC_IS_HINF: UInt = 1u

public val INFINFO_REVERSE_DEFAULT_SEARCH: UInt = 4u

public val INFSTR_BUS_ALL: Pcwstr = w("BUS_ALL")

public val INFSTR_BUS_EISA: Pcwstr = w("BUS_EISA")

public val INFSTR_BUS_ISA: Pcwstr = w("BUS_ISA")

public val INFSTR_BUS_MCA: Pcwstr = w("BUS_MCA")

public val INFSTR_CFGPRI_DESIRED: Pcwstr = w("DESIRED")

public val INFSTR_CFGPRI_DISABLED: Pcwstr = w("DISABLED")

public val INFSTR_CFGPRI_FORCECONFIG: Pcwstr = w("FORCECONFIG")

public val INFSTR_CFGPRI_HARDRECONFIG: Pcwstr = w("HARDRECONFIG")

public val INFSTR_CFGPRI_HARDWIRED: Pcwstr = w("HARDWIRED")

public val INFSTR_CFGPRI_NORMAL: Pcwstr = w("NORMAL")

public val INFSTR_CFGPRI_POWEROFF: Pcwstr = w("POWEROFF")

public val INFSTR_CFGPRI_REBOOT: Pcwstr = w("REBOOT")

public val INFSTR_CFGPRI_RESTART: Pcwstr = w("RESTART")

public val INFSTR_CFGPRI_SUBOPTIMAL: Pcwstr = w("SUBOPTIMAL")

public val INFSTR_CFGTYPE_BASIC: Pcwstr = w("BASIC")

public val INFSTR_CFGTYPE_FORCED: Pcwstr = w("FORCED")

public val INFSTR_CFGTYPE_OVERRIDE: Pcwstr = w("OVERRIDE")

public val INFSTR_CLASS_SAFEEXCL: Pcwstr = w("SAFE_EXCL")

public val INFSTR_CONTROLFLAGS_SECTION: Pcwstr = w("ControlFlags")

public val INFSTR_DRIVERSELECT_FUNCTIONS: Pcwstr = w("DriverSelectFunctions")

public val INFSTR_DRIVERSELECT_SECTION: Pcwstr = w("DriverSelect")

public val INFSTR_DRIVERVERSION_SECTION: Pcwstr = w("DriverVer")

public val INFSTR_KEY_ACTION: Pcwstr = w("Action")

public val INFSTR_KEY_ALWAYSEXCLUDEFROMSELECT: Pcwstr = w("AlwaysExcludeFromSelect")

public val INFSTR_KEY_BUFFER_SIZE: Pcwstr = w("BufferSize")

public val INFSTR_KEY_CATALOGFILE: Pcwstr = w("CatalogFile")

public val INFSTR_KEY_CHANNEL_ACCESS: Pcwstr = w("Access")

public val INFSTR_KEY_CHANNEL_ENABLED: Pcwstr = w("Enabled")

public val INFSTR_KEY_CHANNEL_ISOLATION: Pcwstr = w("Isolation")

public val INFSTR_KEY_CHANNEL_VALUE: Pcwstr = w("Value")

public val INFSTR_KEY_CLASS: Pcwstr = w("Class")

public val INFSTR_KEY_CLASSGUID: Pcwstr = w("ClassGUID")

public val INFSTR_KEY_CLOCK_TYPE: Pcwstr = w("ClockType")

public val INFSTR_KEY_CONFIGPRIORITY: Pcwstr = w("ConfigPriority")

public val INFSTR_KEY_COPYFILESONLY: Pcwstr = w("CopyFilesOnly")

public val INFSTR_KEY_DATA_ITEM: Pcwstr = w("DataItem")

public val INFSTR_KEY_DELAYEDAUTOSTART: Pcwstr = w("DelayedAutoStart")

public val INFSTR_KEY_DEPENDENCIES: Pcwstr = w("Dependencies")

public val INFSTR_KEY_DESCRIPTION: Pcwstr = w("Description")

public val INFSTR_KEY_DETECTLIST: Pcwstr = w("DetectList")

public val INFSTR_KEY_DETPARAMS: Pcwstr = w("Params")

public val INFSTR_KEY_DISABLE_REALTIME_PERSISTENCE: Pcwstr = w("DisableRealtimePersistence")

public val INFSTR_KEY_DISPLAYNAME: Pcwstr = w("DisplayName")

public val INFSTR_KEY_DMA: Pcwstr = w("DMA")

public val INFSTR_KEY_DMACONFIG: Pcwstr = w("DMAConfig")

public val INFSTR_KEY_DRIVERSET: Pcwstr = w("DriverSet")

public val INFSTR_KEY_ENABLED: Pcwstr = w("Enabled")

public val INFSTR_KEY_ENABLE_FLAGS: Pcwstr = w("EnableFlags")

public val INFSTR_KEY_ENABLE_LEVEL: Pcwstr = w("EnableLevel")

public val INFSTR_KEY_ENABLE_PROPERTY: Pcwstr = w("EnableProperty")

public val INFSTR_KEY_ERRORCONTROL: Pcwstr = w("ErrorControl")

public val INFSTR_KEY_EXCLUDEFROMSELECT: Pcwstr = w("ExcludeFromSelect")

public val INFSTR_KEY_EXCLUDERES: Pcwstr = w("ExcludeRes")

public val INFSTR_KEY_EXTENSIONID: Pcwstr = w("ExtensionId")

public val INFSTR_KEY_FAILURE_ACTION: Pcwstr = w("Action")

public val INFSTR_KEY_FILE_MAX: Pcwstr = w("FileMax")

public val INFSTR_KEY_FILE_NAME: Pcwstr = w("FileName")

public val INFSTR_KEY_FLUSH_TIMER: Pcwstr = w("FlushTimer")

public val INFSTR_KEY_FROMINET: Pcwstr = w("FromINet")

public val INFSTR_KEY_HARDWARE_CLASS: Pcwstr = w("Class")

public val INFSTR_KEY_HARDWARE_CLASSGUID: Pcwstr = w("ClassGUID")

public val INFSTR_KEY_INTERACTIVEINSTALL: Pcwstr = w("InteractiveInstall")

public val INFSTR_KEY_IO: Pcwstr = w("IO")

public val INFSTR_KEY_IOCONFIG: Pcwstr = w("IOConfig")

public val INFSTR_KEY_IRQ: Pcwstr = w("IRQ")

public val INFSTR_KEY_IRQCONFIG: Pcwstr = w("IRQConfig")

public val INFSTR_KEY_LOADORDERGROUP: Pcwstr = w("LoadOrderGroup")

public val INFSTR_KEY_LOGGING_AUTOBACKUP: Pcwstr = w("LoggingAutoBackup")

public val INFSTR_KEY_LOGGING_MAXSIZE: Pcwstr = w("LoggingMaxSize")

public val INFSTR_KEY_LOGGING_RETENTION: Pcwstr = w("LoggingRetention")

public val INFSTR_KEY_LOG_FILE_MODE: Pcwstr = w("LogFileMode")

public val INFSTR_KEY_MATCH_ALL_KEYWORD: Pcwstr = w("MatchAllKeyword")

public val INFSTR_KEY_MATCH_ANY_KEYWORD: Pcwstr = w("MatchAnyKeyword")

public val INFSTR_KEY_MAXIMUM_BUFFERS: Pcwstr = w("MaximumBuffers")

public val INFSTR_KEY_MAX_FILE_SIZE: Pcwstr = w("MaxFileSize")

public val INFSTR_KEY_MEM: Pcwstr = w("Mem")

public val INFSTR_KEY_MEMCONFIG: Pcwstr = w("MemConfig")

public val INFSTR_KEY_MEMLARGECONFIG: Pcwstr = w("MemLargeConfig")

public val INFSTR_KEY_MESSAGE_FILE: Pcwstr = w("MessageFile")

public val INFSTR_KEY_MFCARDCONFIG: Pcwstr = w("MfCardConfig")

public val INFSTR_KEY_MINIMUM_BUFFERS: Pcwstr = w("MinimumBuffers")

public val INFSTR_KEY_NAME: Pcwstr = w("Name")

public val INFSTR_KEY_NON_CRASH_FAILURES: Pcwstr = w("NonCrashFailures")

public val INFSTR_KEY_NOSETUPINF: Pcwstr = w("NoSetupInf")

public val INFSTR_KEY_PARAMETER_FILE: Pcwstr = w("ParameterFile")

public val INFSTR_KEY_PATH: Pcwstr = w("Path")

public val INFSTR_KEY_PCCARDCONFIG: Pcwstr = w("PcCardConfig")

public val INFSTR_KEY_PNPLOCKDOWN: Pcwstr = w("PnpLockDown")

public val INFSTR_KEY_PROVIDER: Pcwstr = w("Provider")

public val INFSTR_KEY_PROVIDER_NAME: Pcwstr = w("ProviderName")

public val INFSTR_KEY_REQUESTADDITIONALSOFTWARE: Pcwstr = w("RequestAdditionalSoftware")

public val INFSTR_KEY_REQUIREDPRIVILEGES: Pcwstr = w("RequiredPrivileges")

public val INFSTR_KEY_RESET_PERIOD: Pcwstr = w("ResetPeriod")

public val INFSTR_KEY_RESOURCE_FILE: Pcwstr = w("ResourceFile")

public val INFSTR_KEY_SECURITY: Pcwstr = w("Security")

public val INFSTR_KEY_SERVICEBINARY: Pcwstr = w("ServiceBinary")

public val INFSTR_KEY_SERVICESIDTYPE: Pcwstr = w("ServiceSidType")

public val INFSTR_KEY_SERVICETYPE: Pcwstr = w("ServiceType")

public val INFSTR_KEY_SIGNATURE: Pcwstr = w("Signature")

public val INFSTR_KEY_SKIPLIST: Pcwstr = w("SkipList")

public val INFSTR_KEY_START: Pcwstr = w("Start")

public val INFSTR_KEY_STARTNAME: Pcwstr = w("StartName")

public val INFSTR_KEY_STARTTYPE: Pcwstr = w("StartType")

public val INFSTR_KEY_SUB_TYPE: Pcwstr = w("SubType")

public val INFSTR_KEY_TRIGGER_TYPE: Pcwstr = w("TriggerType")

public val INFSTR_PLATFORM_NT: Pcwstr = w("NT")

public val INFSTR_PLATFORM_NTALPHA: Pcwstr = w("NTAlpha")

public val INFSTR_PLATFORM_NTAMD64: Pcwstr = w("NTAMD64")

public val INFSTR_PLATFORM_NTARM: Pcwstr = w("NTARM")

public val INFSTR_PLATFORM_NTARM64: Pcwstr = w("NTARM64")

public val INFSTR_PLATFORM_NTAXP64: Pcwstr = w("NTAXP64")

public val INFSTR_PLATFORM_NTIA64: Pcwstr = w("NTIA64")

public val INFSTR_PLATFORM_NTMIPS: Pcwstr = w("NTMIPS")

public val INFSTR_PLATFORM_NTPPC: Pcwstr = w("NTPPC")

public val INFSTR_PLATFORM_NTX86: Pcwstr = w("NTx86")

public val INFSTR_PLATFORM_WIN: Pcwstr = w("Win")

public val INFSTR_REBOOT: Pcwstr = w("Reboot")

public val INFSTR_RESTART: Pcwstr = w("Restart")

public val INFSTR_RISK_BIOSROMRD: Pcwstr = w("RISK_BIOSROMRD")

public val INFSTR_RISK_DELICATE: Pcwstr = w("RISK_DELICATE")

public val INFSTR_RISK_IORD: Pcwstr = w("RISK_IORD")

public val INFSTR_RISK_IOWR: Pcwstr = w("RISK_IOWR")

public val INFSTR_RISK_LOW: Pcwstr = w("RISK_LOW")

public val INFSTR_RISK_MEMRD: Pcwstr = w("RISK_MEMRD")

public val INFSTR_RISK_MEMWR: Pcwstr = w("RISK_MEMWR")

public val INFSTR_RISK_NONE: Pcwstr = w("RISK_NONE")

public val INFSTR_RISK_QUERYDRV: Pcwstr = w("RISK_QUERYDRV")

public val INFSTR_RISK_SWINT: Pcwstr = w("RISK_SWINT")

public val INFSTR_RISK_UNRELIABLE: Pcwstr = w("RISK_UNRELIABLE")

public val INFSTR_RISK_VERYHIGH: Pcwstr = w("RISK_VERYHIGH")

public val INFSTR_RISK_VERYLOW: Pcwstr = w("RISK_VERYLOW")

public val INFSTR_SECT_AUTOEXECBAT: Pcwstr = w("AutoexecBatDrivers")

public val INFSTR_SECT_AVOIDCFGSYSDEV: Pcwstr = w("Det.AvoidCfgSysDev")

public val INFSTR_SECT_AVOIDENVDEV: Pcwstr = w("Det.AvoidEnvDev")

public val INFSTR_SECT_AVOIDINIDEV: Pcwstr = w("Det.AvoidIniDev")

public val INFSTR_SECT_BADACPIBIOS: Pcwstr = w("BadACPIBios")

public val INFSTR_SECT_BADDISKBIOS: Pcwstr = w("BadDiskBios")

public val INFSTR_SECT_BADDSBIOS: Pcwstr = w("BadDSBios")

public val INFSTR_SECT_BADPMCALLBIOS: Pcwstr = w("BadProtectedModeCallBios")

public val INFSTR_SECT_BADPNPBIOS: Pcwstr = w("BadPnpBios")

public val INFSTR_SECT_BADRMCALLBIOS: Pcwstr = w("BadRealModeCallBios")

public val INFSTR_SECT_BADROUTINGTABLEBIOS: Pcwstr = w("BadPCIIRQRoutingTableBios")

public val INFSTR_SECT_CFGSYS: Pcwstr = w("ConfigSysDrivers")

public val INFSTR_SECT_CLASS_INSTALL: Pcwstr = w("ClassInstall")

public val INFSTR_SECT_CLASS_INSTALL_32: Pcwstr = w("ClassInstall32")

public val INFSTR_SECT_DEFAULT_INSTALL: Pcwstr = w("DefaultInstall")

public val INFSTR_SECT_DEFAULT_UNINSTALL: Pcwstr = w("DefaultUninstall")

public val INFSTR_SECT_DETCLASSINFO: Pcwstr = w("Det.ClassInfo")

public val INFSTR_SECT_DETMODULES: Pcwstr = w("Det.Modules")

public val INFSTR_SECT_DETOPTIONS: Pcwstr = w("Det.Options")

public val INFSTR_SECT_DEVINFS: Pcwstr = w("Det.DevINFs")

public val INFSTR_SECT_DISPLAY_CLEANUP: Pcwstr = w("DisplayCleanup")

public val INFSTR_SECT_EXTENSIONCONTRACTS: Pcwstr = w("ExtensionContracts")

public val INFSTR_SECT_FORCEHWVERIFY: Pcwstr = w("Det.ForceHWVerify")

public val INFSTR_SECT_GOODACPIBIOS: Pcwstr = w("GoodACPIBios")

public val INFSTR_SECT_HPOMNIBOOK: Pcwstr = w("Det.HPOmnibook")

public val INFSTR_SECT_INTERFACE_INSTALL_32: Pcwstr = w("InterfaceInstall32")

public val INFSTR_SECT_MACHINEIDBIOS: Pcwstr = w("MachineIDBios")

public val INFSTR_SECT_MANUALDEV: Pcwstr = w("Det.ManualDev")

public val INFSTR_SECT_MFG: Pcwstr = w("Manufacturer")

public val INFSTR_SECT_REGCFGSYSDEV: Pcwstr = w("Det.RegCfgSysDev")

public val INFSTR_SECT_REGENVDEV: Pcwstr = w("Det.RegEnvDev")

public val INFSTR_SECT_REGINIDEV: Pcwstr = w("Det.RegIniDev")

public val INFSTR_SECT_SYSINI: Pcwstr = w("SystemIniDrivers")

public val INFSTR_SECT_SYSINIDRV: Pcwstr = w("SystemIniDriversLine")

public val INFSTR_SECT_TARGETCOMPUTERS: Pcwstr = w("TargetComputers")

public val INFSTR_SECT_VERSION: Pcwstr = w("Version")

public val INFSTR_SECT_WININIRUN: Pcwstr = w("WinIniRunLine")

public val INFSTR_SOFTWAREVERSION_SECTION: Pcwstr = w("SoftwareVersion")

public val INFSTR_STRKEY_DRVDESC: Pcwstr = w("DriverDesc")

public val INFSTR_SUBKEY_COINSTALLERS: Pcwstr = w("CoInstallers")

public val INFSTR_SUBKEY_CTL: Pcwstr = w("CTL")

public val INFSTR_SUBKEY_DET: Pcwstr = w("Det")

public val INFSTR_SUBKEY_EVENTS: Pcwstr = w("Events")

public val INFSTR_SUBKEY_FACTDEF: Pcwstr = w("FactDef")

public val INFSTR_SUBKEY_FILTERS: Pcwstr = w("Filters")

public val INFSTR_SUBKEY_HW: Pcwstr = w("Hw")

public val INFSTR_SUBKEY_INTERFACES: Pcwstr = w("Interfaces")

public val INFSTR_SUBKEY_LOGCONFIG: Pcwstr = w("LogConfig")

public val INFSTR_SUBKEY_LOGCONFIGOVERRIDE: Pcwstr = w("LogConfigOverride")

public val INFSTR_SUBKEY_NORESOURCEDUPS: Pcwstr = w("NoResDup")

public val INFSTR_SUBKEY_POSSIBLEDUPS: Pcwstr = w("PosDup")

public val INFSTR_SUBKEY_SERVICES: Pcwstr = w("Services")

public val INFSTR_SUBKEY_SOFTWARE: Pcwstr = w("Software")

public val INFSTR_SUBKEY_WMI: Pcwstr = w("WMI")

public val INF_STYLE_CACHE_DISABLE: InfStyle = 32u

public val INF_STYLE_CACHE_ENABLE: InfStyle = 16u

public val INF_STYLE_CACHE_IGNORE: InfStyle = 64u

public val INF_STYLE_NONE: InfStyle = 0u

public val INF_STYLE_OLDNT: InfStyle = 1u

public val INF_STYLE_WIN4: InfStyle = 2u

public val INSTALLFLAG_BITS: UpdatedriverforplugandplaydevicesFlags = 7u

public val INSTALLFLAG_FORCE: UpdatedriverforplugandplaydevicesFlags = 1u

public val INSTALLFLAG_NONINTERACTIVE: UpdatedriverforplugandplaydevicesFlags = 4u

public val INSTALLFLAG_READONLY: UpdatedriverforplugandplaydevicesFlags = 2u

public val IOA_LOCAL: UInt = 255u

public val IO_ALIAS_10_BIT_DECODE: UInt = 4u

public val IO_ALIAS_12_BIT_DECODE: UInt = 16u

public val IO_ALIAS_16_BIT_DECODE: UInt = 0u

public val IO_ALIAS_POSITIVE_DECODE: UInt = 255u

public val LCPRI_BOOTCONFIG: UInt = 1u

public val LCPRI_DESIRED: UInt = 8192u

public val LCPRI_DISABLED: UInt = 65535u

public val LCPRI_FORCECONFIG: UInt = 0u

public val LCPRI_HARDRECONFIG: UInt = 49152u

public val LCPRI_HARDWIRED: UInt = 57344u

public val LCPRI_IMPOSSIBLE: UInt = 61440u

public val LCPRI_LASTBESTCONFIG: UInt = 16383u

public val LCPRI_LASTSOFTCONFIG: UInt = 32767u

public val LCPRI_NORMAL: UInt = 12288u

public val LCPRI_POWEROFF: UInt = 40960u

public val LCPRI_REBOOT: UInt = 36864u

public val LCPRI_RESTART: UInt = 32768u

public val LCPRI_SUBOPTIMAL: UInt = 20480u

public val LINE_LEN: UInt = 256u

public val LOG_CONF_BITS: UInt = 7u

public val LOG_SEV_ERROR: UInt = 2u

public val LOG_SEV_FATAL_ERROR: UInt = 3u

public val LOG_SEV_INFORMATION: UInt = 0u

public val LOG_SEV_MAXIMUM: UInt = 4u

public val LOG_SEV_WARNING: UInt = 1u

public val MAX_CLASS_NAME_LEN: UInt = 32u

public val MAX_CONFIG_VALUE: UInt = 9999u

public val MAX_DEVICE_ID_LEN: UInt = 200u

public val MAX_DEVNODE_ID_LEN: UInt = 200u

public val MAX_DMA_CHANNELS: UInt = 7u

public val MAX_GUID_STRING_LEN: UInt = 39u

public val MAX_IDD_DYNAWIZ_RESOURCE_ID: UInt = 11000u

public val MAX_INFSTR_STRKEY_LEN: UInt = 32u

public val MAX_INF_FLAG: UInt = 20u

public val MAX_INF_SECTION_NAME_LENGTH: UInt = 255u

public val MAX_INF_STRING_LENGTH: UInt = 4096u

public val MAX_INSTALLWIZARD_DYNAPAGES: UInt = 20u

public val MAX_INSTANCE_VALUE: UInt = 9999u

public val MAX_INSTRUCTION_LEN: UInt = 256u

public val MAX_IO_PORTS: UInt = 20u

public val MAX_IRQS: UInt = 7u

public val MAX_KEY_LEN: UInt = 100u

public val MAX_LABEL_LEN: UInt = 30u

public val MAX_LCPRI: UInt = 65535u

public val MAX_MEM_REGISTERS: UInt = 9u

public val MAX_PRIORITYSTR_LEN: UInt = 16u

public val MAX_PROFILE_LEN: UInt = 80u

public val MAX_SERVICE_NAME_LEN: UInt = 256u

public val MAX_SUBTITLE_LEN: UInt = 256u

public val MAX_TITLE_LEN: UInt = 60u

public val MIN_IDD_DYNAWIZ_RESOURCE_ID: UInt = 10000u

public val NDW_INSTALLFLAG_CI_PICKED_OEM: UInt = 32768u

public val NDW_INSTALLFLAG_DIDFACTDEFS: UInt = 1u

public val NDW_INSTALLFLAG_EXPRESSINTRO: UInt = 1024u

public val NDW_INSTALLFLAG_HARDWAREALLREADYIN: UInt = 2u

public val NDW_INSTALLFLAG_INSTALLSPECIFIC: UInt = 8192u

public val NDW_INSTALLFLAG_KNOWNCLASS: UInt = 524288u

public val NDW_INSTALLFLAG_NEEDSHUTDOWN: UInt = 512u

public val NDW_INSTALLFLAG_NODETECTEDDEVS: UInt = 4096u

public val NDW_INSTALLFLAG_PCMCIADEVICE: UInt = 131072u

public val NDW_INSTALLFLAG_PCMCIAMODE: UInt = 65536u

public val NDW_INSTALLFLAG_SKIPCLASSLIST: UInt = 16384u

public val NDW_INSTALLFLAG_SKIPISDEVINSTALLED: UInt = 2048u

public val NDW_INSTALLFLAG_USERCANCEL: UInt = 262144u

public val NUM_CM_PROB: UInt = 58u

public val NUM_CM_PROB_V1: UInt = 37u

public val NUM_CM_PROB_V2: UInt = 50u

public val NUM_CM_PROB_V3: UInt = 51u

public val NUM_CM_PROB_V4: UInt = 52u

public val NUM_CM_PROB_V5: UInt = 53u

public val NUM_CM_PROB_V6: UInt = 54u

public val NUM_CM_PROB_V7: UInt = 55u

public val NUM_CM_PROB_V8: UInt = 57u

public val NUM_CM_PROB_V9: UInt = 58u

public val NUM_CR_RESULTS: Configret = 60u

public val NUM_LOG_CONF: CmLogConf = 6u

public val OVERRIDE_LOG_CONF: CmLogConf = 5u

public val PCD_MAX_IO: UInt = 2u

public val PCD_MAX_MEMORY: UInt = 2u

public val PNP_VETO_ALREADY_REMOVED: PnpVetoType = 13

public val PNP_VETO_DEVICE: PnpVetoType = 6

public val PNP_VETO_DRIVER: PnpVetoType = 7

public val PNP_VETO_ILLEGAL_DEVICE_REQUEST: PnpVetoType = 8

public val PNP_VETO_INSUFFICIENT_POWER: PnpVetoType = 9

public val PNP_VETO_INSUFFICIENT_RIGHTS: PnpVetoType = 12

public val PNP_VETO_LEGACY_DEVICE: PnpVetoType = 1

public val PNP_VETO_LEGACY_DRIVER: PnpVetoType = 11

public val PNP_VETO_NON_DISABLEABLE: PnpVetoType = 10

public val PNP_VETO_OUTSTANDING_OPEN: PnpVetoType = 5

public val PNP_VETO_PENDING_CLOSE: PnpVetoType = 2

public val PNP_VETO_TYPE_UNKNOWN: PnpVetoType = 0

public val PNP_VETO_WINDOWS_APP: PnpVetoType = 3

public val PNP_VETO_WINDOWS_SERVICE: PnpVetoType = 4

public val PRIORITY_BIT: UInt = 8u

public val PRIORITY_EQUAL_FIRST: UInt = 8u

public val PRIORITY_EQUAL_LAST: UInt = 0u

public val ROLLBACK_BITS: DirollbackdriverFlags = 1u

public val ROLLBACK_FLAG_NO_UI: DirollbackdriverFlags = 1u

public val REG_DISPOSITION_BITS: UInt = 1u

public val REG_DISPOSITION_OPEN_ALWAYS: UInt = 0u

public val REG_DISPOSITION_OPEN_EXISTING: UInt = 1u

public val RES_TYPE_ALL: CmRestype = 0u

public val RES_TYPE_BUS_NUMBER: CmRestype = 6u

public val RES_TYPE_CLASS_SPECIFIC: CmRestype = 65535u

public val RES_TYPE_CONNECTION: CmRestype = 32772u

public val RES_TYPE_DMA: CmRestype = 3u

public val RES_TYPE_DEVICE_PRIVATE: CmRestype = 32769u

public val RES_TYPE_DO_NOT_USE: CmRestype = 5u

public val RES_TYPE_IO: CmRestype = 2u

public val RES_TYPE_IRQ: CmRestype = 4u

public val RES_TYPE_IGNORED_BIT: CmRestype = 32768u

public val RES_TYPE_MAX: CmRestype = 7u

public val RES_TYPE_MEM: CmRestype = 1u

public val RES_TYPE_MEM_LARGE: CmRestype = 7u

public val RES_TYPE_MF_CARD_CONFIG: CmRestype = 32771u

public val RES_TYPE_NONE: CmRestype = 0u

public val RES_TYPE_PC_CARD_CONFIG: CmRestype = 32770u

public val RES_TYPE_RESERVED: CmRestype = 32768u

public val SCWMI_CLOBBER_SECURITY: UInt = 1u

public val SETDIRID_NOT_FULL_PATH: UInt = 1u

public val SIGNERSCORE_AUTHENTICODE: UInt = 251658240u

public val SIGNERSCORE_INBOX: UInt = 218103811u

public val SIGNERSCORE_LOGO_PREMIUM: UInt = 218103809u

public val SIGNERSCORE_LOGO_STANDARD: UInt = 218103810u

public val SIGNERSCORE_MASK: UInt = 4278190080u

public val SIGNERSCORE_SIGNED_MASK: UInt = 4026531840u

public val SIGNERSCORE_UNCLASSIFIED: UInt = 218103812u

public val SIGNERSCORE_UNKNOWN: UInt = 4278190080u

public val SIGNERSCORE_UNSIGNED: UInt = 2147483648u

public val SIGNERSCORE_W9X_SUSPECT: UInt = 3221225472u

public val SIGNERSCORE_WHQL: UInt = 218103813u

public val SPCRP_CHARACTERISTICS: UInt = 27u

public val SPCRP_DEVTYPE: UInt = 25u

public val SPCRP_EXCLUSIVE: UInt = 26u

public val SPCRP_LOWERFILTERS: UInt = 18u

public val SPCRP_MAXIMUM_PROPERTY: UInt = 28u

public val SPCRP_SECURITY: UInt = 23u

public val SPCRP_SECURITY_SDS: UInt = 24u

public val SPCRP_UPPERFILTERS: UInt = 17u

public val SPDIT_CLASSDRIVER: SetupDiDriverType = 1u

public val SPDIT_COMPATDRIVER: SetupDiDriverType = 2u

public val SPDIT_NODRIVER: UInt = 0u

public val SPDRP_ADDRESS: SetupDiRegistryProperty = 28u

public val SPDRP_BASE_CONTAINERID: SetupDiRegistryProperty = 36u

public val SPDRP_BUSNUMBER: SetupDiRegistryProperty = 21u

public val SPDRP_BUSTYPEGUID: SetupDiRegistryProperty = 19u

public val SPDRP_CAPABILITIES: SetupDiRegistryProperty = 15u

public val SPDRP_CHARACTERISTICS: SetupDiRegistryProperty = 27u

public val SPDRP_CLASS: SetupDiRegistryProperty = 7u

public val SPDRP_CLASSGUID: SetupDiRegistryProperty = 8u

public val SPDRP_COMPATIBLEIDS: SetupDiRegistryProperty = 2u

public val SPDRP_CONFIGFLAGS: SetupDiRegistryProperty = 10u

public val SPDRP_DEVICEDESC: SetupDiRegistryProperty = 0u

public val SPDRP_DEVICE_POWER_DATA: SetupDiRegistryProperty = 30u

public val SPDRP_DEVTYPE: SetupDiRegistryProperty = 25u

public val SPDRP_DRIVER: SetupDiRegistryProperty = 9u

public val SPDRP_ENUMERATOR_NAME: SetupDiRegistryProperty = 22u

public val SPDRP_EXCLUSIVE: SetupDiRegistryProperty = 26u

public val SPDRP_FRIENDLYNAME: SetupDiRegistryProperty = 12u

public val SPDRP_HARDWAREID: SetupDiRegistryProperty = 1u

public val SPDRP_INSTALL_STATE: SetupDiRegistryProperty = 34u

public val SPDRP_LEGACYBUSTYPE: SetupDiRegistryProperty = 20u

public val SPDRP_LOCATION_INFORMATION: SetupDiRegistryProperty = 13u

public val SPDRP_LOCATION_PATHS: SetupDiRegistryProperty = 35u

public val SPDRP_LOWERFILTERS: SetupDiRegistryProperty = 18u

public val SPDRP_MAXIMUM_PROPERTY: SetupDiRegistryProperty = 37u

public val SPDRP_MFG: SetupDiRegistryProperty = 11u

public val SPDRP_PHYSICAL_DEVICE_OBJECT_NAME: SetupDiRegistryProperty = 14u

public val SPDRP_REMOVAL_POLICY: SetupDiRegistryProperty = 31u

public val SPDRP_REMOVAL_POLICY_HW_DEFAULT: SetupDiRegistryProperty = 32u

public val SPDRP_REMOVAL_POLICY_OVERRIDE: SetupDiRegistryProperty = 33u

public val SPDRP_SECURITY: SetupDiRegistryProperty = 23u

public val SPDRP_SECURITY_SDS: SetupDiRegistryProperty = 24u

public val SPDRP_SERVICE: SetupDiRegistryProperty = 4u

public val SPDRP_UI_NUMBER: SetupDiRegistryProperty = 16u

public val SPDRP_UI_NUMBER_DESC_FORMAT: SetupDiRegistryProperty = 29u

public val SPDRP_UNUSED0: SetupDiRegistryProperty = 3u

public val SPDRP_UNUSED1: SetupDiRegistryProperty = 5u

public val SPDRP_UNUSED2: SetupDiRegistryProperty = 6u

public val SPDRP_UPPERFILTERS: SetupDiRegistryProperty = 17u

public val SPDSL_DISALLOW_NEGATIVE_ADJUST: UInt = 2u

public val SPDSL_IGNORE_DISK: UInt = 1u

public val SPFILELOG_FORCENEW: UInt = 2u

public val SPFILELOG_OEMFILE: UInt = 1u

public val SPFILELOG_QUERYONLY: UInt = 4u

public val SPFILELOG_SYSTEMLOG: UInt = 1u

public val SPFILENOTIFY_BACKUPERROR: UInt = 22u

public val SPFILENOTIFY_CABINETINFO: UInt = 16u

public val SPFILENOTIFY_COPYERROR: UInt = 13u

public val SPFILENOTIFY_DELETEERROR: UInt = 7u

public val SPFILENOTIFY_ENDBACKUP: UInt = 23u

public val SPFILENOTIFY_ENDCOPY: UInt = 12u

public val SPFILENOTIFY_ENDDELETE: UInt = 6u

public val SPFILENOTIFY_ENDQUEUE: UInt = 2u

public val SPFILENOTIFY_ENDREGISTRATION: UInt = 32u

public val SPFILENOTIFY_ENDRENAME: UInt = 9u

public val SPFILENOTIFY_ENDSUBQUEUE: UInt = 4u

public val SPFILENOTIFY_FILEEXTRACTED: UInt = 19u

public val SPFILENOTIFY_FILEINCABINET: UInt = 17u

public val SPFILENOTIFY_FILEOPDELAYED: UInt = 20u

public val SPFILENOTIFY_LANGMISMATCH: UInt = 65536u

public val SPFILENOTIFY_NEEDMEDIA: UInt = 14u

public val SPFILENOTIFY_NEEDNEWCABINET: UInt = 18u

public val SPFILENOTIFY_QUEUESCAN: UInt = 15u

public val SPFILENOTIFY_QUEUESCAN_EX: UInt = 24u

public val SPFILENOTIFY_QUEUESCAN_SIGNERINFO: UInt = 64u

public val SPFILENOTIFY_RENAMEERROR: UInt = 10u

public val SPFILENOTIFY_STARTBACKUP: UInt = 21u

public val SPFILENOTIFY_STARTCOPY: UInt = 11u

public val SPFILENOTIFY_STARTDELETE: UInt = 5u

public val SPFILENOTIFY_STARTQUEUE: UInt = 1u

public val SPFILENOTIFY_STARTREGISTRATION: UInt = 25u

public val SPFILENOTIFY_STARTRENAME: UInt = 8u

public val SPFILENOTIFY_STARTSUBQUEUE: UInt = 3u

public val SPFILENOTIFY_TARGETEXISTS: UInt = 131072u

public val SPFILENOTIFY_TARGETNEWER: UInt = 262144u

public val SPFILEQ_FILE_IN_USE: UInt = 1u

public val SPFILEQ_REBOOT_IN_PROGRESS: UInt = 4u

public val SPFILEQ_REBOOT_RECOMMENDED: UInt = 2u

public val SPID_ACTIVE: UInt = 1u

public val SPID_DEFAULT: UInt = 2u

public val SPID_REMOVED: UInt = 4u

public val SPINST_ALL: UInt = 2047u

public val SPINST_BITREG: UInt = 32u

public val SPINST_COPYINF: UInt = 512u

public val SPINST_DEVICEINSTALL: UInt = 1048576u

public val SPINST_FILES: UInt = 16u

public val SPINST_INI2REG: UInt = 8u

public val SPINST_INIFILES: UInt = 2u

public val SPINST_LOGCONFIG: UInt = 1u

public val SPINST_LOGCONFIGS_ARE_OVERRIDES: UInt = 262144u

public val SPINST_LOGCONFIG_IS_FORCED: UInt = 131072u

public val SPINST_PROFILEITEMS: UInt = 256u

public val SPINST_PROPERTIES: UInt = 1024u

public val SPINST_REGISTERCALLBACKAWARE: UInt = 524288u

public val SPINST_REGISTRY: UInt = 4u

public val SPINST_REGSVR: UInt = 64u

public val SPINST_SINGLESECTION: UInt = 65536u

public val SPINST_UNREGSVR: UInt = 128u

public val SPINT_ACTIVE: UInt = 1u

public val SPINT_DEFAULT: UInt = 2u

public val SPINT_REMOVED: UInt = 4u

public val SPOST_MAX: UInt = 3u

public val SPOST_NONE: OemSourceMediaType = 0u

public val SPOST_PATH: OemSourceMediaType = 1u

public val SPOST_URL: OemSourceMediaType = 2u

public val SPPSR_ENUM_ADV_DEVICE_PROPERTIES: UInt = 3u

public val SPPSR_ENUM_BASIC_DEVICE_PROPERTIES: UInt = 2u

public val SPPSR_SELECT_DEVICE_RESOURCES: UInt = 1u

public val SPQ_DELAYED_COPY: UInt = 1u

public val SPQ_FLAG_ABORT_IF_UNSIGNED: UInt = 2u

public val SPQ_FLAG_BACKUP_AWARE: UInt = 1u

public val SPQ_FLAG_DO_SHUFFLEMOVE: UInt = 8u

public val SPQ_FLAG_FILES_MODIFIED: UInt = 4u

public val SPQ_FLAG_VALID: UInt = 15u

public val SPQ_SCAN_ACTIVATE_DRP: SetupscanfilequeueFlags = 1024u

public val SPQ_SCAN_FILE_COMPARISON: SetupscanfilequeueFlags = 512u

public val SPQ_SCAN_FILE_PRESENCE: SetupscanfilequeueFlags = 1u

public val SPQ_SCAN_FILE_PRESENCE_WITHOUT_SOURCE: SetupscanfilequeueFlags = 256u

public val SPQ_SCAN_FILE_VALIDITY: SetupscanfilequeueFlags = 2u

public val SPQ_SCAN_INFORM_USER: SetupscanfilequeueFlags = 16u

public val SPQ_SCAN_PRUNE_COPY_QUEUE: SetupscanfilequeueFlags = 32u

public val SPQ_SCAN_PRUNE_DELREN: SetupscanfilequeueFlags = 128u

public val SPQ_SCAN_USE_CALLBACK: SetupscanfilequeueFlags = 4u

public val SPQ_SCAN_USE_CALLBACKEX: SetupscanfilequeueFlags = 8u

public val SPQ_SCAN_USE_CALLBACK_SIGNERINFO: SetupscanfilequeueFlags = 64u

public val SPRDI_FIND_DUPS: UInt = 1u

public val SPREG_DLLINSTALL: UInt = 4u

public val SPREG_GETPROCADDR: UInt = 2u

public val SPREG_LOADLIBRARY: UInt = 1u

public val SPREG_REGSVR: UInt = 3u

public val SPREG_SUCCESS: UInt = 0u

public val SPREG_TIMEOUT: UInt = 5u

public val SPREG_UNKNOWN: UInt = 4294967295u

public val SPSVCINST_ASSOCSERVICE: SpsvcinstFlags = 2u

public val SPSVCINST_CLOBBER_SECURITY: SpsvcinstFlags = 1024u

public val SPSVCINST_DELETEEVENTLOGENTRY: SpsvcinstFlags = 4u

public val SPSVCINST_NOCLOBBER_DELAYEDAUTOSTART: SpsvcinstFlags = 32768u

public val SPSVCINST_NOCLOBBER_DEPENDENCIES: SpsvcinstFlags = 128u

public val SPSVCINST_NOCLOBBER_DESCRIPTION: SpsvcinstFlags = 256u

public val SPSVCINST_NOCLOBBER_DISPLAYNAME: SpsvcinstFlags = 8u

public val SPSVCINST_NOCLOBBER_ERRORCONTROL: SpsvcinstFlags = 32u

public val SPSVCINST_NOCLOBBER_FAILUREACTIONS: SpsvcinstFlags = 131072u

public val SPSVCINST_NOCLOBBER_LOADORDERGROUP: SpsvcinstFlags = 64u

public val SPSVCINST_NOCLOBBER_REQUIREDPRIVILEGES: SpsvcinstFlags = 4096u

public val SPSVCINST_NOCLOBBER_SERVICESIDTYPE: SpsvcinstFlags = 16384u

public val SPSVCINST_NOCLOBBER_STARTTYPE: SpsvcinstFlags = 16u

public val SPSVCINST_NOCLOBBER_TRIGGERS: SpsvcinstFlags = 8192u

public val SPSVCINST_STARTSERVICE: SpsvcinstFlags = 2048u

public val SPSVCINST_STOPSERVICE: SpsvcinstFlags = 512u

public val SPSVCINST_TAGTOFRONT: SpsvcinstFlags = 1u

public val SPSVCINST_UNIQUE_NAME: SpsvcinstFlags = 65536u

public val SPWPT_SELECTDEVICE: UInt = 1u

public val SPWP_USE_DEVINFO_DATA: UInt = 1u

public val SP_ALTPLATFORM_FLAGS_SUITE_MASK: UInt = 2u

public val SP_ALTPLATFORM_FLAGS_VERSION_RANGE: UInt = 1u

public val SP_BACKUP_BACKUPPASS: UInt = 1u

public val SP_BACKUP_BOOTFILE: UInt = 8u

public val SP_BACKUP_DEMANDPASS: UInt = 2u

public val SP_BACKUP_SPECIAL: UInt = 4u

public val SP_COPY_ALREADYDECOMP: SpCopyStyle = 4194304u

public val SP_COPY_DELETESOURCE: SpCopyStyle = 1u

public val SP_COPY_FORCE_IN_USE: SpCopyStyle = 512u

public val SP_COPY_FORCE_NEWER: SpCopyStyle = 8192u

public val SP_COPY_FORCE_NOOVERWRITE: SpCopyStyle = 4096u

public val SP_COPY_HARDLINK: SpCopyStyle = 268435456u

public val SP_COPY_INBOX_INF: SpCopyStyle = 134217728u

public val SP_COPY_IN_USE_NEEDS_REBOOT: SpCopyStyle = 256u

public val SP_COPY_IN_USE_TRY_RENAME: SpCopyStyle = 67108864u

public val SP_COPY_LANGUAGEAWARE: SpCopyStyle = 32u

public val SP_COPY_NEWER: SpCopyStyle = 4u

public val SP_COPY_NEWER_ONLY: SpCopyStyle = 65536u

public val SP_COPY_NEWER_OR_SAME: SpCopyStyle = 4u

public val SP_COPY_NOBROWSE: SpCopyStyle = 32768u

public val SP_COPY_NODECOMP: SpCopyStyle = 16u

public val SP_COPY_NOOVERWRITE: SpCopyStyle = 8u

public val SP_COPY_NOPRUNE: SpCopyStyle = 1048576u

public val SP_COPY_NOSKIP: SpCopyStyle = 1024u

public val SP_COPY_OEMINF_CATALOG_ONLY: SpCopyStyle = 262144u

public val SP_COPY_OEM_F6_INF: SpCopyStyle = 2097152u

public val SP_COPY_PNPLOCKED: SpCopyStyle = 33554432u

public val SP_COPY_REPLACEONLY: SpCopyStyle = 2u

public val SP_COPY_REPLACE_BOOT_FILE: SpCopyStyle = 524288u

public val SP_COPY_RESERVED: SpCopyStyle = 131072u

public val SP_COPY_SOURCEPATH_ABSOLUTE: SpCopyStyle = 128u

public val SP_COPY_SOURCE_ABSOLUTE: SpCopyStyle = 64u

public val SP_COPY_WARNIFSKIP: SpCopyStyle = 16384u

public val SP_COPY_WINDOWS_SIGNED: SpCopyStyle = 16777216u

public val SP_FLAG_CABINETCONTINUATION: UInt = 2048u

public val SP_MAX_MACHINENAME_LENGTH: UInt = 263u

public val SRCINFO_DESCRIPTION: UInt = 3u

public val SRCINFO_FLAGS: UInt = 4u

public val SRCINFO_PATH: UInt = 1u

public val SRCINFO_TAGFILE: UInt = 2u

public val SRCINFO_TAGFILE2: UInt = 5u

public val SRCLIST_APPEND: UInt = 512u

public val SRCLIST_NOBROWSE: UInt = 2u

public val SRCLIST_NOSTRIPPLATFORM: UInt = 1024u

public val SRCLIST_SUBDIRS: UInt = 256u

public val SRCLIST_SYSIFADMIN: UInt = 64u

public val SRCLIST_SYSTEM: UInt = 16u

public val SRCLIST_TEMPORARY: UInt = 1u

public val SRCLIST_USER: UInt = 32u

public val SRC_FLAGS_CABFILE: UInt = 16u

public val SUOI_FORCEDELETE: UInt = 1u

public val SUOI_INTERNAL1: UInt = 2u

public val SZ_KEY_ADDAUTOLOGGER: Pcwstr = w("AddAutoLogger")

public val SZ_KEY_ADDAUTOLOGGERPROVIDER: Pcwstr = w("AddAutoLoggerProvider")

public val SZ_KEY_ADDCHANNEL: Pcwstr = w("AddChannel")

public val SZ_KEY_ADDEVENTPROVIDER: Pcwstr = w("AddEventProvider")

public val SZ_KEY_ADDFILTER: Pcwstr = w("AddFilter")

public val SZ_KEY_ADDIME: Pcwstr = w("AddIme")

public val SZ_KEY_ADDINTERFACE: Pcwstr = w("AddInterface")

public val SZ_KEY_ADDPOWERSETTING: Pcwstr = w("AddPowerSetting")

public val SZ_KEY_ADDPROP: Pcwstr = w("AddProperty")

public val SZ_KEY_ADDREG: Pcwstr = w("AddReg")

public val SZ_KEY_ADDREGNOCLOBBER: Pcwstr = w("AddRegNoClobber")

public val SZ_KEY_ADDSERVICE: Pcwstr = w("AddService")

public val SZ_KEY_ADDTRIGGER: Pcwstr = w("AddTrigger")

public val SZ_KEY_BITREG: Pcwstr = w("BitReg")

public val SZ_KEY_CLEANONLY: Pcwstr = w("CleanOnly")

public val SZ_KEY_COPYFILES: Pcwstr = w("CopyFiles")

public val SZ_KEY_COPYINF: Pcwstr = w("CopyINF")

public val SZ_KEY_DEFAULTOPTION: Pcwstr = w("DefaultOption")

public val SZ_KEY_DEFDESTDIR: Pcwstr = w("DefaultDestDir")

public val SZ_KEY_DELFILES: Pcwstr = w("DelFiles")

public val SZ_KEY_DELIME: Pcwstr = w("DelIme")

public val SZ_KEY_DELPROP: Pcwstr = w("DelProperty")

public val SZ_KEY_DELREG: Pcwstr = w("DelReg")

public val SZ_KEY_DELSERVICE: Pcwstr = w("DelService")

public val SZ_KEY_DESTDIRS: Pcwstr = w("DestinationDirs")

public val SZ_KEY_EXCLUDEID: Pcwstr = w("ExcludeId")

public val SZ_KEY_FAILUREACTIONS: Pcwstr = w("FailureActions")

public val SZ_KEY_FEATURESCORE: Pcwstr = w("FeatureScore")

public val SZ_KEY_FILTERLEVEL: Pcwstr = w("FilterLevel")

public val SZ_KEY_FILTERPOSITION: Pcwstr = w("FilterPosition")

public val SZ_KEY_HARDWARE: Pcwstr = w("Hardware")

public val SZ_KEY_IMPORTCHANNEL: Pcwstr = w("ImportChannel")

public val SZ_KEY_INI2REG: Pcwstr = w("Ini2Reg")

public val SZ_KEY_LAYOUT_FILE: Pcwstr = w("LayoutFile")

public val SZ_KEY_LDIDOEM: Pcwstr = w("LdidOEM")

public val SZ_KEY_LFN_SECTION: Pcwstr = w("VarLDID.LFN")

public val SZ_KEY_LISTOPTIONS: Pcwstr = w("ListOptions")

public val SZ_KEY_LOGCONFIG: Pcwstr = w("LogConfig")

public val SZ_KEY_MODULES: Pcwstr = w("Modules")

public val SZ_KEY_OPTIONDESC: Pcwstr = w("OptionDesc")

public val SZ_KEY_PHASE1: Pcwstr = w("Phase1")

public val SZ_KEY_PROFILEITEMS: Pcwstr = w("ProfileItems")

public val SZ_KEY_REGSVR: Pcwstr = w("RegisterDlls")

public val SZ_KEY_RENFILES: Pcwstr = w("RenFiles")

public val SZ_KEY_SFN_SECTION: Pcwstr = w("VarLDID.SFN")

public val SZ_KEY_SRCDISKFILES: Pcwstr = w("SourceDisksFiles")

public val SZ_KEY_SRCDISKNAMES: Pcwstr = w("SourceDisksNames")

public val SZ_KEY_STRINGS: Pcwstr = w("Strings")

public val SZ_KEY_UNREGSVR: Pcwstr = w("UnregisterDlls")

public val SZ_KEY_UPDATEAUTOLOGGER: Pcwstr = w("UpdateAutoLogger")

public val SZ_KEY_UPDATEINIFIELDS: Pcwstr = w("UpdateIniFields")

public val SZ_KEY_UPDATEINIS: Pcwstr = w("UpdateInis")

public val SZ_KEY_UPGRADEONLY: Pcwstr = w("UpgradeOnly")

public val SETUP_FILE_LOG_CHECKSUM: SetupFileLogInfo = 1

public val SETUP_FILE_LOG_DISK_DESCRIPTION: SetupFileLogInfo = 3

public val SETUP_FILE_LOG_DISK_TAGFILE: SetupFileLogInfo = 2

public val SETUP_FILE_LOG_MAX: SetupFileLogInfo = 5

public val SETUP_FILE_LOG_OTHER_INFO: SetupFileLogInfo = 4

public val SETUP_FILE_LOG_SOURCE_FILENAME: SetupFileLogInfo = 0

public val F_DD_BYTE: DdFlags = 0u

public val F_DD_BYTE_AND_WORD: DdFlags = 3u

public val F_DD_BUS_MASTER: DdFlags = 4u

public val F_DD_DWORD: DdFlags = 2u

public val F_DD_NO_BUS_MASTER: DdFlags = 0u

public val F_DD_TYPE_A: DdFlags = 8u

public val F_DD_TYPE_B: DdFlags = 16u

public val F_DD_TYPE_F: DdFlags = 24u

public val F_DD_TYPE_STANDARD: DdFlags = 0u

public val F_DD_WORD: DdFlags = 1u

public val F_IOD_10_BIT_DECODE: IodDesflags = 4u

public val F_IOD_12_BIT_DECODE: IodDesflags = 8u

public val F_IOD_16_BIT_DECODE: IodDesflags = 16u

public val F_IOD_DECODE: IodDesflags = 252u

public val F_IOD_IO: IodDesflags = 1u

public val F_IOD_MEMORY: IodDesflags = 0u

public val F_IOD_PASSIVE_DECODE: IodDesflags = 64u

public val F_IOD_PORT_BAR: IodDesflags = 256u

public val F_IOD_POSITIVE_DECODE: IodDesflags = 32u

public val F_IOD_PORT_TYPE: IodDesflags = 1u

public val F_IOD_WINDOW_DECODE: IodDesflags = 128u

public val F_IRQD_EDGE: IrqdFlags = 2u

public val F_IRQD_EXCLUSIVE: IrqdFlags = 0u

public val F_IRQD_LEVEL: IrqdFlags = 0u

public val F_IRQD_LEVEL_BIT: IrqdFlags = 1u

public val F_IRQD_SHARE: IrqdFlags = 1u

public val F_IRQD_SHARE_BIT: IrqdFlags = 0u

public val F_MD_24: MdFlags = 0u

public val F_MD_32: MdFlags = 2u

public val F_MD_32_24: MdFlags = 2u

public val F_MD_CACHEABLE: MdFlags = 32u

public val F_MD_COMBINED_WRITE: MdFlags = 16u

public val F_MD_COMBINED_WRITE_ALLOWED: MdFlags = 16u

public val F_MD_COMBINED_WRITE_DISALLOWED: MdFlags = 0u

public val F_MD_MEMORY_BAR: MdFlags = 128u

public val F_MD_MEMORY_TYPE: MdFlags = 1u

public val F_MD_NON_CACHEABLE: MdFlags = 0u

public val F_MD_PREF: MdFlags = 4u

public val F_MD_PREFETCH_ALLOWED: MdFlags = 4u

public val F_MD_PREFETCH_DISALLOWED: MdFlags = 0u

public val F_MD_PREFETCHABLE: MdFlags = 4u

public val F_MD_RAM: MdFlags = 1u

public val F_MD_ROM: MdFlags = 0u

public val F_MD_READ_ALLOWED: MdFlags = 0u

public val F_MD_READ_DISALLOWED: MdFlags = 8u

public val F_MD_READABLE: MdFlags = 8u

public val F_MD_WINDOW_DECODE: MdFlags = 64u

public val F_PCD_ATTRIBUTES_PER_WINDOW: PcdFlags = 32768u

public val F_PCD_IO1_16: PcdFlags = 65536u

public val F_PCD_IO1_SRC_16: PcdFlags = 262144u

public val F_PCD_IO1_WS_16: PcdFlags = 524288u

public val F_PCD_IO1_ZW_8: PcdFlags = 131072u

public val F_PCD_IO2_16: PcdFlags = 1048576u

public val F_PCD_IO2_SRC_16: PcdFlags = 4194304u

public val F_PCD_IO2_WS_16: PcdFlags = 8388608u

public val F_PCD_IO2_ZW_8: PcdFlags = 2097152u

public val F_PCD_IO_16: PcdFlags = 1u

public val F_PCD_IO_8: PcdFlags = 0u

public val F_PCD_IO_SRC_16: PcdFlags = 32u

public val F_PCD_IO_WS_16: PcdFlags = 64u

public val F_PCD_IO_ZW_8: PcdFlags = 16u

public val F_PCD_MEM1_16: PcdFlags = 67108864u

public val F_PCD_MEM1_A: PcdFlags = 4u

public val F_PCD_MEM1_WS_ONE: PcdFlags = 16777216u

public val F_PCD_MEM1_WS_THREE: PcdFlags = 50331648u

public val F_PCD_MEM1_WS_TWO: PcdFlags = 33554432u

public val F_PCD_MEM2_16: PcdFlags = 1073741824u

public val F_PCD_MEM2_A: PcdFlags = 8u

public val F_PCD_MEM2_WS_ONE: PcdFlags = 268435456u

public val F_PCD_MEM2_WS_THREE: PcdFlags = 805306368u

public val F_PCD_MEM2_WS_TWO: PcdFlags = 536870912u

public val F_PCD_MEM_16: PcdFlags = 2u

public val F_PCD_MEM_8: PcdFlags = 0u

public val F_PCD_MEM_A: PcdFlags = 4u

public val F_PCD_MEM_WS_ONE: PcdFlags = 256u

public val F_PCD_MEM_WS_THREE: PcdFlags = 768u

public val F_PCD_MEM_WS_TWO: PcdFlags = 512u

public val F_PMF_AUDIO_ENABLE: PmfFlags = 8u

public val M_DD_BUS_MASTER: DdFlags = 4u

public val M_DD_TYPE: DdFlags = 24u

public val M_DD_WIDTH: DdFlags = 3u

public val M_IRQD_EDGE_LEVEL: IrqdFlags = 2u

public val M_IRQD_SHARE: IrqdFlags = 1u

public val M_MD_32_24: MdFlags = 2u

public val M_MD_CACHEABLE: MdFlags = 32u

public val M_MD_COMBINED_WRITE: MdFlags = 16u

public val M_MD_MEMORY_TYPE: MdFlags = 1u

public val M_MD_PREFETCHABLE: MdFlags = 4u

public val M_MD_READABLE: MdFlags = 8u

public val M_PCD_IO_8_16: PcdFlags = 1u

public val M_PCD_MEM1_WS: PcdFlags = 50331648u

public val M_PCD_MEM2_WS: PcdFlags = 805306368u

public val M_PCD_MEM_8_16: PcdFlags = 2u

public val M_PCD_MEM_A_C: PcdFlags = 12u

public val M_PCD_MEM_WS: PcdFlags = 768u

public val M_PMF_AUDIO_ENABLE: UInt = 8u

public val GUID_ACPI_CMOS_INTERFACE_STANDARD: Guid = Guid.fromU128(U128(0x3a8d0384650540cauL, 0xbc3956c15f8c5feduL))

public val GUID_ACPI_INTERFACE_STANDARD: Guid = Guid.fromU128(U128(0xb091a08aba9711d0uL, 0xbd1400aa00b7b32auL))

public val GUID_ACPI_INTERFACE_STANDARD2: Guid = Guid.fromU128(U128(0xe8695f6318314870uL, 0xa8cf9c2f03f9dcb5uL))

public val GUID_ACPI_PORT_RANGES_INTERFACE_STANDARD: Guid = Guid.fromU128(U128(0xf14f609bcbbd4957uL, 0xa674bc00213f1c97uL))

public val GUID_ACPI_REGS_INTERFACE_STANDARD: Guid = Guid.fromU128(U128(0x614196672456369uL, 0x462e4e656c736f6euL))

public val GUID_AGP_TARGET_BUS_INTERFACE_STANDARD: Guid = Guid.fromU128(U128(0xb15cfce806d14d37uL, 0x9d4cbedde0c2a6ffuL))

public val GUID_ARBITER_INTERFACE_STANDARD: Guid = Guid.fromU128(U128(0xe644f1858c0e11d0uL, 0xbecf08002be2092fuL))

public val GUID_BUS_INTERFACE_STANDARD: Guid = Guid.fromU128(U128(0x496b82806f2511d0uL, 0xbeaf08002be2092fuL))

public val GUID_BUS_RESOURCE_UPDATE_INTERFACE: Guid = Guid.fromU128(U128(0x27d0102dbfb24164uL, 0x81dddbb82f968b48uL))

public val GUID_BUS_TYPE_1394: Guid = Guid.fromU128(U128(0xf74e73eb9ac545ebuL, 0xbe4d772cc71ddfb3uL))

public val GUID_BUS_TYPE_ACPI: Guid = Guid.fromU128(U128(0xd7b46895001a4942uL, 0x891fa7d46610a843uL))

public val GUID_BUS_TYPE_AVC: Guid = Guid.fromU128(U128(0xc06ff265ae0948f0uL, 0x812c16753d7cba83uL))

public val GUID_BUS_TYPE_DOT4PRT: Guid = Guid.fromU128(U128(0x441ee001434211d5uL, 0xa18400c04f60524duL))

public val GUID_BUS_TYPE_EISA: Guid = Guid.fromU128(U128(0xddc35509f3fc11d0uL, 0xa5370000f8753ed1uL))

public val GUID_BUS_TYPE_HID: Guid = Guid.fromU128(U128(0xeeaf37d0196347c4uL, 0xaa4872476db7cf49uL))
