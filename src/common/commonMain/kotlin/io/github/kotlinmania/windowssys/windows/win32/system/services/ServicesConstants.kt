package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val CUSTOM_SYSTEM_STATE_CHANGE_EVENT_GUID: Guid = Guid.fromU128(U128(0x2d7a28160c5e45fcuL, 0x9ce7570e5ecde9c9uL))

public val DOMAIN_JOIN_GUID: Guid = Guid.fromU128(U128(0x1ce20aba98514421uL, 0x94301ddeb766e809uL))

public val DOMAIN_LEAVE_GUID: Guid = Guid.fromU128(U128(0xddaf516e58c24866uL, 0x9574c3b615d42ea1uL))

public val FIREWALL_PORT_CLOSE_GUID: Guid = Guid.fromU128(U128(0xa144ed388e124de4uL, 0x9d96e64740b1a524uL))

public val FIREWALL_PORT_OPEN_GUID: Guid = Guid.fromU128(U128(0xb7569e0784214ee0uL, 0xad1086915afdad09uL))

public val MACHINE_POLICY_PRESENT_GUID: Guid = Guid.fromU128(U128(0x659fcae65bdb4da9uL, 0xb1ffca2a178d46e0uL))

public val MAX_SERVICE_REGISTRY_STATE_TYPE: ServiceRegistryStateType = 2

public val NAMED_PIPE_EVENT_GUID: Guid = Guid.fromU128(U128(0x1f81d1313fac4537uL, 0x9e0c7e7b0c2f4b55uL))

public val NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID: Guid = Guid.fromU128(U128(0x4f27f2de14e2430buL, 0xa5497cd48cbc8245uL))

public val NETWORK_MANAGER_LAST_IP_ADDRESS_REMOVAL_GUID: Guid = Guid.fromU128(U128(0xcc4ba62a162e4648uL, 0x847ab6bdf993e335uL))

public val RPC_INTERFACE_EVENT_GUID: Guid = Guid.fromU128(U128(0xbc90d16794704139uL, 0xa9babe0bbbf5b74duL))

public val SC_ACTION_NONE: ScActionType = 0

public val SC_ACTION_OWN_RESTART: ScActionType = 4

public val SC_ACTION_REBOOT: ScActionType = 2

public val SC_ACTION_RESTART: ScActionType = 1

public val SC_ACTION_RUN_COMMAND: ScActionType = 3

public val SC_AGGREGATE_STORAGE_KEY: Pcwstr = w("System\\CurrentControlSet\\Control\\ServiceAggregatedEvents")

public val SC_ENUM_PROCESS_INFO: ScEnumType = 0

public val SC_EVENT_DATABASE_CHANGE: ScEventType = 0

public val SC_EVENT_PROPERTY_CHANGE: ScEventType = 1

public val SC_EVENT_STATUS_CHANGE: ScEventType = 2

public val SC_MANAGER_ALL_ACCESS: UInt = 983103u

public val SC_MANAGER_CONNECT: UInt = 1u

public val SC_MANAGER_CREATE_SERVICE: UInt = 2u

public val SC_MANAGER_ENUMERATE_SERVICE: UInt = 4u

public val SC_MANAGER_LOCK: UInt = 8u

public val SC_MANAGER_MODIFY_BOOT_CONFIG: UInt = 32u

public val SC_MANAGER_QUERY_LOCK_STATUS: UInt = 16u

public val SC_STATUS_PROCESS_INFO: ScStatusType = 0

public val SERVICES_ACTIVE_DATABASE: Pcwstr = w("ServicesActive")

public val SERVICES_ACTIVE_DATABASEA: Pcstr = s("ServicesActive")

public val SERVICES_ACTIVE_DATABASEW: Pcwstr = w("ServicesActive")

public val SERVICES_FAILED_DATABASE: Pcwstr = w("ServicesFailed")

public val SERVICES_FAILED_DATABASEA: Pcstr = s("ServicesFailed")

public val SERVICES_FAILED_DATABASEW: Pcwstr = w("ServicesFailed")

public val SERVICE_ACCEPT_HARDWAREPROFILECHANGE: UInt = 32u

public val SERVICE_ACCEPT_LOWRESOURCES: UInt = 8192u

public val SERVICE_ACCEPT_NETBINDCHANGE: UInt = 16u

public val SERVICE_ACCEPT_PARAMCHANGE: UInt = 8u

public val SERVICE_ACCEPT_PAUSE_CONTINUE: UInt = 2u

public val SERVICE_ACCEPT_POWEREVENT: UInt = 64u

public val SERVICE_ACCEPT_PRESHUTDOWN: UInt = 256u

public val SERVICE_ACCEPT_SESSIONCHANGE: UInt = 128u

public val SERVICE_ACCEPT_SHUTDOWN: UInt = 4u

public val SERVICE_ACCEPT_STOP: UInt = 1u

public val SERVICE_ACCEPT_SYSTEMLOWRESOURCES: UInt = 16384u

public val SERVICE_ACCEPT_TIMECHANGE: UInt = 512u

public val SERVICE_ACCEPT_TRIGGEREVENT: UInt = 1024u

public val SERVICE_ACCEPT_USER_LOGOFF: UInt = 2048u

public val SERVICE_ACTIVE: EnumServiceState = 1u

public val SERVICE_ADAPTER: EnumServiceType = 4u

public val SERVICE_ALL_ACCESS: UInt = 983551u

public val SERVICE_AUTO_START: ServiceStartType = 2u

public val SERVICE_BOOT_START: ServiceStartType = 0u

public val SERVICE_CHANGE_CONFIG: UInt = 2u

public val SERVICE_CONFIG_DELAYED_AUTO_START_INFO: ServiceConfig = 3u

public val SERVICE_CONFIG_DESCRIPTION: ServiceConfig = 1u

public val SERVICE_CONFIG_FAILURE_ACTIONS: ServiceConfig = 2u

public val SERVICE_CONFIG_FAILURE_ACTIONS_FLAG: ServiceConfig = 4u

public val SERVICE_CONFIG_LAUNCH_PROTECTED: ServiceConfig = 12u

public val SERVICE_CONFIG_PREFERRED_NODE: ServiceConfig = 9u

public val SERVICE_CONFIG_PRESHUTDOWN_INFO: ServiceConfig = 7u

public val SERVICE_CONFIG_REQUIRED_PRIVILEGES_INFO: ServiceConfig = 6u

public val SERVICE_CONFIG_SERVICE_SID_INFO: ServiceConfig = 5u

public val SERVICE_CONFIG_TRIGGER_INFO: ServiceConfig = 8u

public val SERVICE_CONTINUE_PENDING: ServiceStatusCurrentState = 5u

public val SERVICE_CONTROL_CONTINUE: UInt = 3u

public val SERVICE_CONTROL_DEVICEEVENT: UInt = 11u

public val SERVICE_CONTROL_HARDWAREPROFILECHANGE: UInt = 12u

public val SERVICE_CONTROL_INTERROGATE: UInt = 4u

public val SERVICE_CONTROL_LOWRESOURCES: UInt = 96u

public val SERVICE_CONTROL_NETBINDADD: UInt = 7u

public val SERVICE_CONTROL_NETBINDDISABLE: UInt = 10u

public val SERVICE_CONTROL_NETBINDENABLE: UInt = 9u

public val SERVICE_CONTROL_NETBINDREMOVE: UInt = 8u

public val SERVICE_CONTROL_PARAMCHANGE: UInt = 6u

public val SERVICE_CONTROL_PAUSE: UInt = 2u

public val SERVICE_CONTROL_POWEREVENT: UInt = 13u

public val SERVICE_CONTROL_PRESHUTDOWN: UInt = 15u

public val SERVICE_CONTROL_SESSIONCHANGE: UInt = 14u

public val SERVICE_CONTROL_SHUTDOWN: UInt = 5u

public val SERVICE_CONTROL_STATUS_REASON_INFO: UInt = 1u

public val SERVICE_CONTROL_STOP: UInt = 1u

public val SERVICE_CONTROL_SYSTEMLOWRESOURCES: UInt = 97u

public val SERVICE_CONTROL_TIMECHANGE: UInt = 16u

public val SERVICE_CONTROL_TRIGGEREVENT: UInt = 32u

public val SERVICE_DEMAND_START: ServiceStartType = 3u

public val SERVICE_DISABLED: ServiceStartType = 4u

public val SERVICE_DRIVER: EnumServiceType = 11u

public val SERVICE_DYNAMIC_INFORMATION_LEVEL_START_REASON: UInt = 1u

public val SERVICE_ENUMERATE_DEPENDENTS: UInt = 8u

public val SERVICE_ERROR_CRITICAL: ServiceError = 3u

public val SERVICE_ERROR_IGNORE: ServiceError = 0u

public val SERVICE_ERROR_NORMAL: ServiceError = 1u

public val SERVICE_ERROR_SEVERE: ServiceError = 2u

public val SERVICE_FILE_SYSTEM_DRIVER: EnumServiceType = 2u

public val SERVICE_INACTIVE: EnumServiceState = 2u

public val SERVICE_INTERROGATE: UInt = 128u

public val SERVICE_KERNEL_DRIVER: EnumServiceType = 1u

public val SERVICE_LAUNCH_PROTECTED_ANTIMALWARE_LIGHT: UInt = 3u

public val SERVICE_LAUNCH_PROTECTED_NONE: UInt = 0u

public val SERVICE_LAUNCH_PROTECTED_WINDOWS: UInt = 1u

public val SERVICE_LAUNCH_PROTECTED_WINDOWS_LIGHT: UInt = 2u

public val SERVICE_NOTIFY_CONTINUE_PENDING: ServiceNotify = 16u

public val SERVICE_NOTIFY_CREATED: ServiceNotify = 128u

public val SERVICE_NOTIFY_DELETED: ServiceNotify = 256u

public val SERVICE_NOTIFY_DELETE_PENDING: ServiceNotify = 512u

public val SERVICE_NOTIFY_PAUSED: ServiceNotify = 64u

public val SERVICE_NOTIFY_PAUSE_PENDING: ServiceNotify = 32u

public val SERVICE_NOTIFY_RUNNING: ServiceNotify = 8u

public val SERVICE_NOTIFY_START_PENDING: ServiceNotify = 2u

public val SERVICE_NOTIFY_STATUS_CHANGE: UInt = 2u

public val SERVICE_NOTIFY_STATUS_CHANGE_1: UInt = 1u

public val SERVICE_NOTIFY_STATUS_CHANGE_2: UInt = 2u

public val SERVICE_NOTIFY_STOPPED: ServiceNotify = 1u

public val SERVICE_NOTIFY_STOP_PENDING: ServiceNotify = 4u

public val SERVICE_NO_CHANGE: UInt = 4294967295u

public val SERVICE_PAUSED: ServiceStatusCurrentState = 7u

public val SERVICE_PAUSE_CONTINUE: UInt = 64u

public val SERVICE_PAUSE_PENDING: ServiceStatusCurrentState = 6u

public val SERVICE_QUERY_CONFIG: UInt = 1u

public val SERVICE_QUERY_STATUS: UInt = 4u

public val SERVICE_RECOGNIZER_DRIVER: EnumServiceType = 8u

public val SERVICE_RUNNING: ServiceStatusCurrentState = 4u

public val SERVICE_RUNS_IN_NON_SYSTEM_OR_NOT_RUNNING: ServiceRunsInProcess = 0u

public val SERVICE_RUNS_IN_SYSTEM_PROCESS: ServiceRunsInProcess = 1u

public val SERVICE_SID_TYPE_NONE: UInt = 0u

public val SERVICE_SID_TYPE_UNRESTRICTED: UInt = 1u

public val SERVICE_START: UInt = 16u

public val SERVICE_START_PENDING: ServiceStatusCurrentState = 2u

public val SERVICE_START_REASON_AUTO: UInt = 2u

public val SERVICE_START_REASON_DELAYEDAUTO: UInt = 16u

public val SERVICE_START_REASON_DEMAND: UInt = 1u

public val SERVICE_START_REASON_RESTART_ON_FAILURE: UInt = 8u

public val SERVICE_START_REASON_TRIGGER: UInt = 4u

public val SERVICE_STATE_ALL: EnumServiceState = 3u

public val SERVICE_STOP: UInt = 32u

public val SERVICE_STOPPED: ServiceStatusCurrentState = 1u

public val SERVICE_STOP_PENDING: ServiceStatusCurrentState = 3u

public val SERVICE_STOP_REASON_FLAG_CUSTOM: UInt = 536870912u

public val SERVICE_STOP_REASON_FLAG_MAX: UInt = 2147483648u

public val SERVICE_STOP_REASON_FLAG_MIN: UInt = 0u

public val SERVICE_STOP_REASON_FLAG_PLANNED: UInt = 1073741824u

public val SERVICE_STOP_REASON_FLAG_UNPLANNED: UInt = 268435456u

public val SERVICE_STOP_REASON_MAJOR_APPLICATION: UInt = 327680u

public val SERVICE_STOP_REASON_MAJOR_HARDWARE: UInt = 131072u

public val SERVICE_STOP_REASON_MAJOR_MAX: UInt = 458752u

public val SERVICE_STOP_REASON_MAJOR_MAX_CUSTOM: UInt = 16711680u

public val SERVICE_STOP_REASON_MAJOR_MIN: UInt = 0u

public val SERVICE_STOP_REASON_MAJOR_MIN_CUSTOM: UInt = 4194304u

public val SERVICE_STOP_REASON_MAJOR_NONE: UInt = 393216u

public val SERVICE_STOP_REASON_MAJOR_OPERATINGSYSTEM: UInt = 196608u

public val SERVICE_STOP_REASON_MAJOR_OTHER: UInt = 65536u

public val SERVICE_STOP_REASON_MAJOR_SOFTWARE: UInt = 262144u

public val SERVICE_STOP_REASON_MINOR_DISK: UInt = 8u

public val SERVICE_STOP_REASON_MINOR_ENVIRONMENT: UInt = 10u

public val SERVICE_STOP_REASON_MINOR_HARDWARE_DRIVER: UInt = 11u

public val SERVICE_STOP_REASON_MINOR_HUNG: UInt = 6u

public val SERVICE_STOP_REASON_MINOR_INSTALLATION: UInt = 3u

public val SERVICE_STOP_REASON_MINOR_MAINTENANCE: UInt = 2u

public val SERVICE_STOP_REASON_MINOR_MAX: UInt = 25u

public val SERVICE_STOP_REASON_MINOR_MAX_CUSTOM: UInt = 65535u

public val SERVICE_STOP_REASON_MINOR_MEMOTYLIMIT: UInt = 24u

public val SERVICE_STOP_REASON_MINOR_MIN: UInt = 0u

public val SERVICE_STOP_REASON_MINOR_MIN_CUSTOM: UInt = 256u

public val SERVICE_STOP_REASON_MINOR_MMC: UInt = 22u

public val SERVICE_STOP_REASON_MINOR_NETWORKCARD: UInt = 9u

public val SERVICE_STOP_REASON_MINOR_NETWORK_CONNECTIVITY: UInt = 17u

public val SERVICE_STOP_REASON_MINOR_NONE: UInt = 23u

public val SERVICE_STOP_REASON_MINOR_OTHER: UInt = 1u

public val SERVICE_STOP_REASON_MINOR_OTHERDRIVER: UInt = 12u

public val SERVICE_STOP_REASON_MINOR_RECONFIG: UInt = 5u

public val SERVICE_STOP_REASON_MINOR_SECURITY: UInt = 16u

public val SERVICE_STOP_REASON_MINOR_SECURITYFIX: UInt = 15u

public val SERVICE_STOP_REASON_MINOR_SECURITYFIX_UNINSTALL: UInt = 21u

public val SERVICE_STOP_REASON_MINOR_SERVICEPACK: UInt = 13u

public val SERVICE_STOP_REASON_MINOR_SERVICEPACK_UNINSTALL: UInt = 19u

public val SERVICE_STOP_REASON_MINOR_SOFTWARE_UPDATE: UInt = 14u

public val SERVICE_STOP_REASON_MINOR_SOFTWARE_UPDATE_UNINSTALL: UInt = 20u

public val SERVICE_STOP_REASON_MINOR_UNSTABLE: UInt = 7u

public val SERVICE_STOP_REASON_MINOR_UPGRADE: UInt = 4u

public val SERVICE_STOP_REASON_MINOR_WMI: UInt = 18u

public val SERVICE_SYSTEM_START: ServiceStartType = 1u

public val SERVICE_TRIGGER_ACTION_SERVICE_START: ServiceTriggerAction = 1u

public val SERVICE_TRIGGER_ACTION_SERVICE_STOP: ServiceTriggerAction = 2u

public val SERVICE_TRIGGER_DATA_TYPE_BINARY: ServiceTriggerSpecificDataItemDataType = 1u

public val SERVICE_TRIGGER_DATA_TYPE_KEYWORD_ALL: ServiceTriggerSpecificDataItemDataType = 5u

public val SERVICE_TRIGGER_DATA_TYPE_KEYWORD_ANY: ServiceTriggerSpecificDataItemDataType = 4u

public val SERVICE_TRIGGER_DATA_TYPE_LEVEL: ServiceTriggerSpecificDataItemDataType = 3u

public val SERVICE_TRIGGER_DATA_TYPE_STRING: ServiceTriggerSpecificDataItemDataType = 2u

public val SERVICE_TRIGGER_STARTED_ARGUMENT: Pcwstr = w("TriggerStarted")

public val SERVICE_TRIGGER_TYPE_AGGREGATE: UInt = 30u

public val SERVICE_TRIGGER_TYPE_CUSTOM: ServiceTriggerType = 20u

public val SERVICE_TRIGGER_TYPE_CUSTOM_SYSTEM_STATE_CHANGE: UInt = 7u

public val SERVICE_TRIGGER_TYPE_DEVICE_INTERFACE_ARRIVAL: ServiceTriggerType = 1u

public val SERVICE_TRIGGER_TYPE_DOMAIN_JOIN: ServiceTriggerType = 3u

public val SERVICE_TRIGGER_TYPE_FIREWALL_PORT_EVENT: ServiceTriggerType = 4u

public val SERVICE_TRIGGER_TYPE_GROUP_POLICY: ServiceTriggerType = 5u

public val SERVICE_TRIGGER_TYPE_IP_ADDRESS_AVAILABILITY: ServiceTriggerType = 2u

public val SERVICE_TRIGGER_TYPE_NETWORK_ENDPOINT: ServiceTriggerType = 6u

public val SERVICE_USER_DEFINED_CONTROL: UInt = 256u

public val SERVICE_USER_OWN_PROCESS: EnumServiceType = 80u

public val SERVICE_USER_SHARE_PROCESS: EnumServiceType = 96u

public val SERVICE_WIN32: EnumServiceType = 48u

public val SERVICE_WIN32_OWN_PROCESS: EnumServiceType = 16u

public val SERVICE_WIN32_SHARE_PROCESS: EnumServiceType = 32u

public val SERVICE_DIRECTORY_PERSISTENT_STATE: ServiceDirectoryType = 0

public val SERVICE_DIRECTORY_TYPE_MAX: ServiceDirectoryType = 1

public val SERVICE_REGISTRY_STATE_PARAMETERS: ServiceRegistryStateType = 0

public val SERVICE_REGISTRY_STATE_PERSISTENT: ServiceRegistryStateType = 1

public val SERVICE_SHARED_DIRECTORY_PERSISTENT_STATE: ServiceSharedDirectoryType = 0

public val SERVICE_SHARED_REGISTRY_PERSISTENT_STATE: ServiceSharedRegistryStateType = 0

public val USER_POLICY_PRESENT_GUID: Guid = Guid.fromU128(U128(0x54fb46c8f089464cuL, 0xb1fd59d1b62c3b50uL))
