package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public val ACCESS_ACTIVE_OVERLAY_SCHEME: PowerDataAccessor = 27

public val ACCESS_ACTIVE_SCHEME: PowerDataAccessor = 19

public val ACCESS_AC_POWER_SETTING_INDEX: PowerDataAccessor = 0

public val ACCESS_AC_POWER_SETTING_MAX: PowerDataAccessor = 21

public val ACCESS_AC_POWER_SETTING_MIN: PowerDataAccessor = 23

public val ACCESS_ATTRIBUTES: PowerDataAccessor = 15

public val ACCESS_CREATE_SCHEME: PowerDataAccessor = 20

public val ACCESS_DC_POWER_SETTING_INDEX: PowerDataAccessor = 1

public val ACCESS_DC_POWER_SETTING_MAX: PowerDataAccessor = 22

public val ACCESS_DC_POWER_SETTING_MIN: PowerDataAccessor = 24

public val ACCESS_DEFAULT_AC_POWER_SETTING: PowerDataAccessor = 7

public val ACCESS_DEFAULT_DC_POWER_SETTING: PowerDataAccessor = 8

public val ACCESS_DEFAULT_SECURITY_DESCRIPTOR: PowerDataAccessor = 14

public val ACCESS_DESCRIPTION: PowerDataAccessor = 3

public val ACCESS_FRIENDLY_NAME: PowerDataAccessor = 2

public val ACCESS_ICON_RESOURCE: PowerDataAccessor = 13

public val ACCESS_INDIVIDUAL_SETTING: PowerDataAccessor = 18

public val ACCESS_OVERLAY_SCHEME: PowerDataAccessor = 26

public val ACCESS_POSSIBLE_POWER_SETTING: PowerDataAccessor = 4

public val ACCESS_POSSIBLE_POWER_SETTING_DESCRIPTION: PowerDataAccessor = 6

public val ACCESS_POSSIBLE_POWER_SETTING_FRIENDLY_NAME: PowerDataAccessor = 5

public val ACCESS_POSSIBLE_VALUE_INCREMENT: PowerDataAccessor = 11

public val ACCESS_POSSIBLE_VALUE_MAX: PowerDataAccessor = 10

public val ACCESS_POSSIBLE_VALUE_MIN: PowerDataAccessor = 9

public val ACCESS_POSSIBLE_VALUE_UNITS: PowerDataAccessor = 12

public val ACCESS_PROFILE: PowerDataAccessor = 25

public val ACCESS_SCHEME: PowerDataAccessor = 16

public val ACCESS_SUBGROUP: PowerDataAccessor = 17

public val ACPI_TIME_ADJUST_DAYLIGHT: UInt = 1u

public val ACPI_TIME_IN_DAYLIGHT: UInt = 2u

public val ACPI_TIME_ZONE_UNKNOWN: UInt = 2047u

public val ACTIVE_COOLING: UInt = 0u

public val ALTITUDE_GROUP_POLICY: PowerSettingAltitude = 0

public val ALTITUDE_INTERNAL_OVERRIDE: PowerSettingAltitude = 5

public val ALTITUDE_OEM_CUSTOMIZATION: PowerSettingAltitude = 4

public val ALTITUDE_OS_DEFAULT: PowerSettingAltitude = 6

public val ALTITUDE_PROVISIONING: PowerSettingAltitude = 3

public val ALTITUDE_RUNTIME_OVERRIDE: PowerSettingAltitude = 2

public val ALTITUDE_USER: PowerSettingAltitude = 1

public val ACPI_TIME_RESOLUTION_MAX: AcpiTimeResolution = 2

public val ACPI_TIME_RESOLUTION_MILLISECONDS: AcpiTimeResolution = 0

public val ACPI_TIME_RESOLUTION_SECONDS: AcpiTimeResolution = 1

public val ADMINISTRATOR_POWER_POLICY: PowerInformationLevel = 9

public val BATTERY_CAPACITY_RELATIVE: UInt = 1073741824u

public val BATTERY_CHARGING: UInt = 4u

public val BATTERY_CLASS_MAJOR_VERSION: UInt = 1u

public val BATTERY_CLASS_MINOR_VERSION: UInt = 0u

public val BATTERY_CLASS_MINOR_VERSION_1: UInt = 1u

public val BATTERY_CRITICAL: UInt = 8u

public val BATTERY_DISCHARGING: UInt = 2u

public val BATTERY_IS_SHORT_TERM: UInt = 536870912u

public val BATTERY_MINIPORT_UPDATE_DATA_VER_1: UInt = 1u

public val BATTERY_MINIPORT_UPDATE_DATA_VER_2: UInt = 2u

public val BATTERY_POWER_ON_LINE: UInt = 1u

public val BATTERY_SEALED: UInt = 268435456u

public val BATTERY_SET_CHARGER_ID_SUPPORTED: UInt = 8u

public val BATTERY_SET_CHARGE_SUPPORTED: UInt = 1u

public val BATTERY_SET_CHARGINGSOURCE_SUPPORTED: UInt = 4u

public val BATTERY_SET_DISCHARGE_SUPPORTED: UInt = 2u

public val BATTERY_SYSTEM_BATTERY: UInt = 2147483648u

public val BATTERY_TAG_INVALID: UInt = 0u

public val BATTERY_UNKNOWN_CAPACITY: UInt = 4294967295u

public val BATTERY_UNKNOWN_CURRENT: UInt = 4294967295u

public val BATTERY_UNKNOWN_RATE: UInt = 2147483648u

public val BATTERY_UNKNOWN_TIME: UInt = 4294967295u

public val BATTERY_UNKNOWN_VOLTAGE: UInt = 4294967295u

public val BATTERY_USB_CHARGER_STATUS_FN_DEFAULT_USB: UInt = 1u

public val BATTERY_USB_CHARGER_STATUS_UCM_PD: UInt = 2u

public val BATTERY_CHARGE: BatterySetInformationLevel = 1

public val BATTERY_CHARGER_ID: BatterySetInformationLevel = 4

public val BATTERY_CHARGER_STATUS: BatterySetInformationLevel = 5

public val BATTERY_CHARGING_SOURCE: BatterySetInformationLevel = 3

public val BATTERY_CHARGING_SOURCE_TYPE_AC: BatteryChargingSourceType = 1

public val BATTERY_CHARGING_SOURCE_TYPE_MAX: BatteryChargingSourceType = 4

public val BATTERY_CHARGING_SOURCE_TYPE_USB: BatteryChargingSourceType = 2

public val BATTERY_CHARGING_SOURCE_TYPE_WIRELESS: BatteryChargingSourceType = 3

public val BATTERY_CRITICAL_BIAS: BatterySetInformationLevel = 0

public val BATTERY_DEVICE_NAME: BatteryQueryInformationLevel = 4

public val BATTERY_DEVICE_STATE: PowerInformationLevel = 86

public val BATTERY_DISCHARGE: BatterySetInformationLevel = 2

public val BATTERY_ESTIMATED_TIME: BatteryQueryInformationLevel = 3

public val BATTERY_GRANULARITY_INFORMATION: BatteryQueryInformationLevel = 1

public val BATTERY_INFORMATION: BatteryQueryInformationLevel = 0

public val BATTERY_MANUFACTURE_DATE: BatteryQueryInformationLevel = 5

public val BATTERY_MANUFACTURE_NAME: BatteryQueryInformationLevel = 6

public val BATTERY_SERIAL_NUMBER: BatteryQueryInformationLevel = 8

public val BATTERY_TEMPERATURE: BatteryQueryInformationLevel = 2

public val BATTERY_UNIQUE_ID: BatteryQueryInformationLevel = 7

public val BLACK_BOX_RECORDER_DIRECT_ACCESS_BUFFER: PowerInformationLevel = 97

public val CS_DEVICE_NOTIFICATION: PowerInformationLevel = 74

public val DEVICEPOWER_AND_OPERATION: UInt = 1073741824u

public val DEVICEPOWER_CLEAR_WAKEENABLED: UInt = 2u

public val DEVICEPOWER_FILTER_DEVICES_PRESENT: UInt = 536870912u

public val DEVICEPOWER_FILTER_HARDWARE: UInt = 268435456u

public val DEVICEPOWER_FILTER_ON_NAME: UInt = 33554432u

public val DEVICEPOWER_FILTER_WAKEENABLED: UInt = 134217728u

public val DEVICEPOWER_FILTER_WAKEPROGRAMMABLE: UInt = 67108864u

public val DEVICEPOWER_HARDWAREID: UInt = 2147483648u

public val DEVICEPOWER_SET_WAKEENABLED: UInt = 1u

public val DISPLAY_BURST: PowerInformationLevel = 77

public val EFFECTIVE_POWER_MODE_V1: UInt = 1u

public val EFFECTIVE_POWER_MODE_V2: UInt = 2u

public val EMI_NAME_MAX: UInt = 16u

public val EMI_VERSION_V1: UInt = 1u

public val EMI_VERSION_V2: UInt = 2u

public val ES_AWAYMODE_REQUIRED: ExecutionState = 64u

public val ES_CONTINUOUS: ExecutionState = 2147483648u

public val ES_DISPLAY_REQUIRED: ExecutionState = 2u

public val ES_SYSTEM_REQUIRED: ExecutionState = 1u

public val ES_USER_PRESENT: ExecutionState = 4u

public val EFFECTIVE_POWER_MODE_BALANCED: EffectivePowerMode = 2

public val EFFECTIVE_POWER_MODE_BATTERY_SAVER: EffectivePowerMode = 0

public val EFFECTIVE_POWER_MODE_BETTER_BATTERY: EffectivePowerMode = 1

public val EFFECTIVE_POWER_MODE_GAME_MODE: EffectivePowerMode = 5

public val EFFECTIVE_POWER_MODE_HIGH_PERFORMANCE: EffectivePowerMode = 3

public val EFFECTIVE_POWER_MODE_MAX_PERFORMANCE: EffectivePowerMode = 4

public val EFFECTIVE_POWER_MODE_MIXED_REALITY: EffectivePowerMode = 6

public val EMI_MEASUREMENT_UNIT_PICOWATT_HOURS: EmiMeasurementUnit = 0

public val ENABLE_MULTI_BATTERY_DISPLAY: UInt = 2u

public val ENABLE_PASSWORD_LOGON: UInt = 4u

public val ENABLE_SYS_TRAY_BATTERY_METER: UInt = 1u

public val ENABLE_VIDEO_DIM_DISPLAY: UInt = 16u

public val ENABLE_WAKE_ON_RING: UInt = 8u

public val ENERGY_TRACKER_CREATE: PowerInformationLevel = 92

public val ENERGY_TRACKER_QUERY: PowerInformationLevel = 93

public val EXIT_LATENCY_SAMPLING_PERCENTAGE: PowerInformationLevel = 78

public val FIRMWARE_TABLE_INFORMATION_REGISTERED: PowerInformationLevel = 69

public val GET_POWER_REQUEST_LIST: PowerInformationLevel = 45

public val GET_POWER_SETTING_VALUE: PowerInformationLevel = 59

public val GROUP_PARK: PowerInformationLevel = 48

public val IOCTL_ACPI_GET_REAL_TIME: UInt = 2703888u

public val IOCTL_ACPI_SET_REAL_TIME: UInt = 2720276u

public val IOCTL_BATTERY_CHARGING_SOURCE_CHANGE: UInt = 2703440u

public val IOCTL_BATTERY_QUERY_INFORMATION: UInt = 2703428u

public val IOCTL_BATTERY_QUERY_STATUS: UInt = 2703436u

public val IOCTL_BATTERY_QUERY_TAG: UInt = 2703424u

public val IOCTL_BATTERY_SET_INFORMATION: UInt = 2719816u

public val IOCTL_EMI_GET_MEASUREMENT: UInt = 2244620u

public val IOCTL_EMI_GET_METADATA: UInt = 2244616u

public val IOCTL_EMI_GET_METADATA_SIZE: UInt = 2244612u

public val IOCTL_EMI_GET_VERSION: UInt = 2244608u

public val IOCTL_GET_ACPI_TIME_AND_ALARM_CAPABILITIES: UInt = 2703900u

public val IOCTL_GET_PROCESSOR_OBJ_INFO: UInt = 2703744u

public val IOCTL_GET_SYS_BUTTON_CAPS: UInt = 2703680u

public val IOCTL_GET_SYS_BUTTON_EVENT: UInt = 2703684u

public val IOCTL_GET_WAKE_ALARM_POLICY: UInt = 2736652u

public val IOCTL_GET_WAKE_ALARM_SYSTEM_POWERSTATE: UInt = 2703896u

public val IOCTL_GET_WAKE_ALARM_VALUE: UInt = 2736648u

public val IOCTL_NOTIFY_SWITCH_EVENT: UInt = 2703616u

public val IOCTL_QUERY_LID: UInt = 2703552u

public val IOCTL_RUN_ACTIVE_COOLING_METHOD: UInt = 2719880u

public val IOCTL_SET_SYS_MESSAGE_INDICATOR: UInt = 2720192u

public val IOCTL_SET_WAKE_ALARM_POLICY: UInt = 2720260u

public val IOCTL_SET_WAKE_ALARM_VALUE: UInt = 2720256u

public val IOCTL_THERMAL_QUERY_INFORMATION: UInt = 2703488u

public val IOCTL_THERMAL_READ_POLICY: UInt = 2703508u

public val IOCTL_THERMAL_READ_TEMPERATURE: UInt = 2703504u

public val IOCTL_THERMAL_SET_COOLING_POLICY: UInt = 2719876u

public val IOCTL_THERMAL_SET_PASSIVE_LIMIT: UInt = 2719884u

public val IDLE_RESILIENCY: PowerInformationLevel = 60

public val LT_DONT_CARE: LatencyTime = 0

public val LT_LOWEST_LATENCY: LatencyTime = 1

public val LAST_RESUME_PERFORMANCE: PowerInformationLevel = 76

public val LAST_SLEEP_TIME: PowerInformationLevel = 15

public val LAST_WAKE_TIME: PowerInformationLevel = 14

public val LOGICAL_PROCESSOR_IDLING: PowerInformationLevel = 56

public val MAX_ACTIVE_COOLING_LEVELS: UInt = 10u

public val MAX_BATTERY_STRING_SIZE: UInt = 128u

public val MONITOR_CAPABILITIES: PowerInformationLevel = 40

public val MONITOR_INVOCATION: PowerInformationLevel = 68

public val MONITOR_REQUEST_REASON_AC_DC_DISPLAY_BURST: PowerMonitorRequestReason = 5

public val MONITOR_REQUEST_REASON_AC_DC_DISPLAY_BURST_SUPPRESSED: PowerMonitorRequestReason = 28

public val MONITOR_REQUEST_REASON_BATTERY_COUNT_CHANGE: PowerMonitorRequestReason = 16

public val MONITOR_REQUEST_REASON_BATTERY_COUNT_CHANGE_SUPPRESSED: PowerMonitorRequestReason = 49

public val MONITOR_REQUEST_REASON_BATTERY_PRE_CRITICAL: PowerMonitorRequestReason = 53

public val MONITOR_REQUEST_REASON_BUILTIN_PANEL: PowerMonitorRequestReason = 47

public val MONITOR_REQUEST_REASON_DP: PowerMonitorRequestReason = 19

public val MONITOR_REQUEST_REASON_DIM: PowerMonitorRequestReason = 46

public val MONITOR_REQUEST_REASON_DIRECTED_DRIPS: PowerMonitorRequestReason = 45

public val MONITOR_REQUEST_REASON_DISPLAY_REQUIRED_UN_DIM: PowerMonitorRequestReason = 48

public val MONITOR_REQUEST_REASON_FULL_WAKE: PowerMonitorRequestReason = 9

public val MONITOR_REQUEST_REASON_GRACE_PERIOD: PowerMonitorRequestReason = 17

public val MONITOR_REQUEST_REASON_IDLE_TIMEOUT: PowerMonitorRequestReason = 12

public val MONITOR_REQUEST_REASON_LID: PowerMonitorRequestReason = 15

public val MONITOR_REQUEST_REASON_MAX: PowerMonitorRequestReason = 55

public val MONITOR_REQUEST_REASON_NEAR_PROXIMITY: PowerMonitorRequestReason = 22

public val MONITOR_REQUEST_REASON_PDC_SIGNAL: PowerMonitorRequestReason = 27

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_FINGERPRINT: PowerMonitorRequestReason = 44

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_HEY_CORTANA: PowerMonitorRequestReason = 42

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_HOLOGRAPHIC_SHELL: PowerMonitorRequestReason = 43

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_SENSORS_HUMAN_PRESENCE: PowerMonitorRequestReason = 52

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_WINDOWS_MOBILE_PWR_NOTIF: PowerMonitorRequestReason = 40

public val MONITOR_REQUEST_REASON_PDC_SIGNAL_WINDOWS_MOBILE_SHELL: PowerMonitorRequestReason = 41

public val MONITOR_REQUEST_REASON_PN_P: PowerMonitorRequestReason = 18

public val MONITOR_REQUEST_REASON_PO_SET_SYSTEM_STATE: PowerMonitorRequestReason = 7

public val MONITOR_REQUEST_REASON_POLICY_CHANGE: PowerMonitorRequestReason = 13

public val MONITOR_REQUEST_REASON_POWER_BUTTON: PowerMonitorRequestReason = 1

public val MONITOR_REQUEST_REASON_REMOTE_CONNECTION: PowerMonitorRequestReason = 2

public val MONITOR_REQUEST_REASON_RESUME_MODERN_STANDBY: PowerMonitorRequestReason = 50

public val MONITOR_REQUEST_REASON_RESUME_PDC: PowerMonitorRequestReason = 24

public val MONITOR_REQUEST_REASON_RESUME_S4: PowerMonitorRequestReason = 25

public val MONITOR_REQUEST_REASON_SC_MONITORPOWER: PowerMonitorRequestReason = 3

public val MONITOR_REQUEST_REASON_SCREEN_OFF_REQUEST: PowerMonitorRequestReason = 11

public val MONITOR_REQUEST_REASON_SESSION_UNLOCK: PowerMonitorRequestReason = 10

public val MONITOR_REQUEST_REASON_SET_THREAD_EXECUTION_STATE: PowerMonitorRequestReason = 8

public val MONITOR_REQUEST_REASON_SLEEP_BUTTON: PowerMonitorRequestReason = 14

public val MONITOR_REQUEST_REASON_SX_TRANSITION: PowerMonitorRequestReason = 20

public val MONITOR_REQUEST_REASON_SYSTEM_IDLE: PowerMonitorRequestReason = 21

public val MONITOR_REQUEST_REASON_SYSTEM_STATE_ENTERED: PowerMonitorRequestReason = 29

public val MONITOR_REQUEST_REASON_TERMINAL: PowerMonitorRequestReason = 26

public val MONITOR_REQUEST_REASON_TERMINAL_INIT: PowerMonitorRequestReason = 51

public val MONITOR_REQUEST_REASON_THERMAL_STANDBY: PowerMonitorRequestReason = 23

public val MONITOR_REQUEST_REASON_UNKNOWN: PowerMonitorRequestReason = 0

public val MONITOR_REQUEST_REASON_USER_DISPLAY_BURST: PowerMonitorRequestReason = 6

public val MONITOR_REQUEST_REASON_USER_INPUT: PowerMonitorRequestReason = 4

public val MONITOR_REQUEST_REASON_USER_INPUT_ACCELEROMETER: PowerMonitorRequestReason = 35

public val MONITOR_REQUEST_REASON_USER_INPUT_HID: PowerMonitorRequestReason = 36

public val MONITOR_REQUEST_REASON_USER_INPUT_INITIALIZATION: PowerMonitorRequestReason = 39

public val MONITOR_REQUEST_REASON_USER_INPUT_KEYBOARD: PowerMonitorRequestReason = 31

public val MONITOR_REQUEST_REASON_USER_INPUT_MOUSE: PowerMonitorRequestReason = 32

public val MONITOR_REQUEST_REASON_USER_INPUT_PEN: PowerMonitorRequestReason = 34

public val MONITOR_REQUEST_REASON_USER_INPUT_PO_USER_PRESENT: PowerMonitorRequestReason = 37

public val MONITOR_REQUEST_REASON_USER_INPUT_SESSION_SWITCH: PowerMonitorRequestReason = 38

public val MONITOR_REQUEST_REASON_USER_INPUT_TOUCH: PowerMonitorRequestReason = 54

public val MONITOR_REQUEST_REASON_USER_INPUT_TOUCHPAD: PowerMonitorRequestReason = 33

public val MONITOR_REQUEST_REASON_WINRT: PowerMonitorRequestReason = 30

public val MONITOR_REQUEST_TYPE_OFF: PowerMonitorRequestType = 0

public val MONITOR_REQUEST_TYPE_ON_AND_PRESENT: PowerMonitorRequestType = 1

public val MONITOR_REQUEST_TYPE_TOGGLE_ON: PowerMonitorRequestType = 2

public val NOTIFY_USER_MODE_LEGACY_POWER_EVENT: PowerInformationLevel = 47

public val NOTIFY_USER_POWER_SETTING: PowerInformationLevel = 26

public val PASSIVE_COOLING: UInt = 1u

public val PDCAP_D0_SUPPORTED: DevicePowerCapabilities = 1u

public val PDCAP_D1_SUPPORTED: DevicePowerCapabilities = 2u

public val PDCAP_D2_SUPPORTED: DevicePowerCapabilities = 4u

public val PDCAP_D3_SUPPORTED: DevicePowerCapabilities = 8u

public val PDCAP_S0_SUPPORTED: DevicePowerCapabilities = 65536u

public val PDCAP_S1_SUPPORTED: DevicePowerCapabilities = 131072u

public val PDCAP_S2_SUPPORTED: DevicePowerCapabilities = 262144u

public val PDCAP_S3_SUPPORTED: DevicePowerCapabilities = 524288u

public val PDCAP_S4_SUPPORTED: DevicePowerCapabilities = 16777216u

public val PDCAP_S5_SUPPORTED: DevicePowerCapabilities = 33554432u

public val PDCAP_WAKE_FROM_D0_SUPPORTED: DevicePowerCapabilities = 16u

public val PDCAP_WAKE_FROM_D1_SUPPORTED: DevicePowerCapabilities = 32u

public val PDCAP_WAKE_FROM_D2_SUPPORTED: DevicePowerCapabilities = 64u

public val PDCAP_WAKE_FROM_D3_SUPPORTED: DevicePowerCapabilities = 128u

public val PDCAP_WAKE_FROM_S0_SUPPORTED: DevicePowerCapabilities = 1048576u

public val PDCAP_WAKE_FROM_S1_SUPPORTED: DevicePowerCapabilities = 2097152u

public val PDCAP_WAKE_FROM_S2_SUPPORTED: DevicePowerCapabilities = 4194304u

public val PDCAP_WAKE_FROM_S3_SUPPORTED: DevicePowerCapabilities = 8388608u

public val PDCAP_WARM_EJECT_SUPPORTED: DevicePowerCapabilities = 256u

public val POWER_ATTRIBUTE_HIDE: UInt = 1u

public val POWER_ATTRIBUTE_SHOW_AOAC: UInt = 2u

public val POWER_FORCE_TRIGGER_RESET: PowerActionPolicyEventCode = 2147483648u

public val POWER_LEVEL_USER_NOTIFY_EXEC: PowerActionPolicyEventCode = 4u

public val POWER_LEVEL_USER_NOTIFY_SOUND: PowerActionPolicyEventCode = 2u

public val POWER_LEVEL_USER_NOTIFY_TEXT: PowerActionPolicyEventCode = 1u

public val POWER_PLATFORM_ROLE_V1: PowerPlatformRoleVersion = 1u

public val POWER_PLATFORM_ROLE_V2: PowerPlatformRoleVersion = 2u

public val POWER_USER_NOTIFY_BUTTON: PowerActionPolicyEventCode = 8u

public val POWER_USER_NOTIFY_SHUTDOWN: PowerActionPolicyEventCode = 16u

public val PO_TZ_ACTIVE: PowerCoolingMode = 0u.toUShort()

public val PO_TZ_INVALID_MODE: PowerCoolingMode = 2u.toUShort()

public val PO_TZ_PASSIVE: PowerCoolingMode = 1u.toUShort()

public val PPM_FIRMWARE_ACPI1C2: UInt = 1u

public val PPM_FIRMWARE_ACPI1C3: UInt = 2u

public val PPM_FIRMWARE_ACPI1TSTATES: UInt = 4u

public val PPM_FIRMWARE_CPC: UInt = 262144u

public val PPM_FIRMWARE_CSD: UInt = 16u

public val PPM_FIRMWARE_CST: UInt = 8u

public val PPM_FIRMWARE_LPI: UInt = 524288u

public val PPM_FIRMWARE_OSC: UInt = 65536u

public val PPM_FIRMWARE_PCCH: UInt = 16384u

public val PPM_FIRMWARE_PCCP: UInt = 32768u

public val PPM_FIRMWARE_PCT: UInt = 32u

public val PPM_FIRMWARE_PDC: UInt = 131072u

public val PPM_FIRMWARE_PPC: UInt = 256u

public val PPM_FIRMWARE_PSD: UInt = 512u

public val PPM_FIRMWARE_PSS: UInt = 64u

public val PPM_FIRMWARE_PTC: UInt = 1024u

public val PPM_FIRMWARE_TPC: UInt = 4096u

public val PPM_FIRMWARE_TSD: UInt = 8192u

public val PPM_FIRMWARE_TSS: UInt = 2048u

public val PPM_FIRMWARE_XPSS: UInt = 128u

public val PPM_IDLE_IMPLEMENTATION_CSTATES: UInt = 1u

public val PPM_IDLE_IMPLEMENTATION_LPISTATES: UInt = 4u

public val PPM_IDLE_IMPLEMENTATION_MICROPEP: UInt = 3u

public val PPM_IDLE_IMPLEMENTATION_NONE: UInt = 0u

public val PPM_IDLE_IMPLEMENTATION_PEP: UInt = 2u

public val PPM_PERFORMANCE_IMPLEMENTATION_CPPC: UInt = 3u

public val PPM_PERFORMANCE_IMPLEMENTATION_NONE: UInt = 0u

public val PPM_PERFORMANCE_IMPLEMENTATION_PCCV1: UInt = 2u

public val PPM_PERFORMANCE_IMPLEMENTATION_PEP: UInt = 4u

public val PPM_PERFORMANCE_IMPLEMENTATION_PSTATES: UInt = 1u

public val PDC_INVOCATION: PowerInformationLevel = 67

public val PHYSICAL_POWER_BUTTON_PRESS: PowerInformationLevel = 90

public val PLATFORM_IDLE_STATES: PowerInformationLevel = 80

public val PLATFORM_IDLE_VETO: PowerInformationLevel = 82

public val PLATFORM_INFORMATION: PowerInformationLevel = 66

public val PLATFORM_ROLE: PowerInformationLevel = 75

public val PLATFORM_ROLE_APPLIANCE_PC: PowerPlatformRole = 6

public val PLATFORM_ROLE_DESKTOP: PowerPlatformRole = 1

public val PLATFORM_ROLE_ENTERPRISE_SERVER: PowerPlatformRole = 4

public val PLATFORM_ROLE_MAXIMUM: PowerPlatformRole = 9

public val PLATFORM_ROLE_MOBILE: PowerPlatformRole = 2

public val PLATFORM_ROLE_PERFORMANCE_SERVER: PowerPlatformRole = 7

public val PLATFORM_ROLE_SOHO_SERVER: PowerPlatformRole = 5

public val PLATFORM_ROLE_SLATE: PowerPlatformRole = 8

public val PLATFORM_ROLE_UNSPECIFIED: PowerPlatformRole = 0

public val PLATFORM_ROLE_WORKSTATION: PowerPlatformRole = 3

public val PLM_POWER_REQUEST_CREATE: PowerInformationLevel = 72

public val PO_AC: SystemPowerCondition = 0

public val PO_CONDITION_MAXIMUM: SystemPowerCondition = 3

public val PO_DC: SystemPowerCondition = 1

public val PO_HOT: SystemPowerCondition = 2

public val POWER_ACTION_DISPLAY_OFF: PowerAction = 8

public val POWER_ACTION_HIBERNATE: PowerAction = 3

public val POWER_ACTION_NONE: PowerAction = 0

public val POWER_ACTION_RESERVED: PowerAction = 1

public val POWER_ACTION_SHUTDOWN: PowerAction = 4

public val POWER_ACTION_SHUTDOWN_OFF: PowerAction = 6

public val POWER_ACTION_SHUTDOWN_RESET: PowerAction = 5

public val POWER_ACTION_SLEEP: PowerAction = 2

public val POWER_ACTION_WARM_EJECT: PowerAction = 7

public val POWER_DEVICE_D0: DevicePowerState = 1

public val POWER_DEVICE_D1: DevicePowerState = 2

public val POWER_DEVICE_D2: DevicePowerState = 3

public val POWER_DEVICE_D3: DevicePowerState = 4

public val POWER_DEVICE_MAXIMUM: DevicePowerState = 5

public val POWER_DEVICE_UNSPECIFIED: DevicePowerState = 0

public val POWER_INFORMATION_INTERNAL: PowerInformationLevel = 87

public val POWER_INFORMATION_LEVEL_MAXIMUM: PowerInformationLevel = 98

public val POWER_INFORMATION_LEVEL_UNUSED0: PowerInformationLevel = 27

public val POWER_REQUEST_ACTION: PowerInformationLevel = 44

public val POWER_REQUEST_ACTION_INTERNAL: PowerInformationLevel = 85

public val POWER_REQUEST_AWAY_MODE_REQUIRED: PowerRequestType = 2

public val POWER_REQUEST_CREATE: PowerInformationLevel = 43

public val POWER_REQUEST_DISPLAY_REQUIRED: PowerRequestType = 0

public val POWER_REQUEST_EXECUTION_REQUIRED: PowerRequestType = 3

public val POWER_REQUEST_SYSTEM_REQUIRED: PowerRequestType = 1

public val POWER_SETTING_NOTIFICATION_NAME: PowerInformationLevel = 58

public val POWER_SHUTDOWN_NOTIFICATION: PowerInformationLevel = 39

public val POWER_SYSTEM_HIBERNATE: SystemPowerState = 5

public val POWER_SYSTEM_MAXIMUM: SystemPowerState = 7

public val POWER_SYSTEM_SHUTDOWN: SystemPowerState = 6

public val POWER_SYSTEM_SLEEPING1: SystemPowerState = 2

public val POWER_SYSTEM_SLEEPING2: SystemPowerState = 3

public val POWER_SYSTEM_SLEEPING3: SystemPowerState = 4

public val POWER_SYSTEM_UNSPECIFIED: SystemPowerState = 0

public val POWER_SYSTEM_WORKING: SystemPowerState = 1

public val POWER_USER_INACTIVE: UserActivityPresence = 2

public val POWER_USER_INVALID: UserActivityPresence = 3

public val POWER_USER_MAXIMUM: UserActivityPresence = 3

public val POWER_USER_NOT_PRESENT: UserActivityPresence = 1

public val POWER_USER_PRESENT: UserActivityPresence = 0

public val PROCESSOR_CAP: PowerInformationLevel = 34

public val PROCESSOR_IDLE_DOMAINS: PowerInformationLevel = 49

public val PROCESSOR_IDLE_STATES: PowerInformationLevel = 33

public val PROCESSOR_IDLE_STATES_HV: PowerInformationLevel = 52

public val PROCESSOR_IDLE_VETO: PowerInformationLevel = 81

public val PROCESSOR_INFORMATION: PowerInformationLevel = 11

public val PROCESSOR_INFORMATION_EX: PowerInformationLevel = 46

public val PROCESSOR_LOAD: PowerInformationLevel = 38

public val PROCESSOR_PERF_CAP_HV: PowerInformationLevel = 54

public val PROCESSOR_PERF_STATES: PowerInformationLevel = 32

public val PROCESSOR_PERF_STATES_HV: PowerInformationLevel = 53

public val PROCESSOR_POWER_POLICY_AC: PowerInformationLevel = 18

public val PROCESSOR_POWER_POLICY_CURRENT: PowerInformationLevel = 22

public val PROCESSOR_POWER_POLICY_DC: PowerInformationLevel = 19

public val PROCESSOR_SET_IDLE: PowerInformationLevel = 55

public val PROCESSOR_STATE_HANDLER: PowerInformationLevel = 7

public val PROCESSOR_STATE_HANDLER2: PowerInformationLevel = 13

public val QUERY_POTENTIAL_DRIPS_CONSTRAINT: PowerInformationLevel = 91

public val REGISTER_SPM_POWER_SETTINGS: PowerInformationLevel = 79

public val SYS_BUTTON_LID: UInt = 4u

public val SYS_BUTTON_LID_CHANGED: UInt = 524288u

public val SYS_BUTTON_LID_CLOSED: UInt = 131072u

public val SYS_BUTTON_LID_INITIAL: UInt = 262144u

public val SYS_BUTTON_LID_OPEN: UInt = 65536u

public val SYS_BUTTON_LID_STATE_MASK: UInt = 196608u

public val SYS_BUTTON_POWER: UInt = 1u

public val SYS_BUTTON_SLEEP: UInt = 2u

public val SYS_BUTTON_WAKE: UInt = 2147483648u

public val SCREEN_OFF: PowerInformationLevel = 73

public val SEND_SUSPEND_RESUME_NOTIFICATION: PowerInformationLevel = 96

public val SESSION_ALLOW_EXTERNAL_DMA_DEVICES: PowerInformationLevel = 95

public val SESSION_CONNECT_NOTIFICATION: PowerInformationLevel = 62

public val SESSION_DISPLAY_STATE: PowerInformationLevel = 42

public val SESSION_LOCK_STATE: PowerInformationLevel = 64

public val SESSION_POWER_CLEANUP: PowerInformationLevel = 63

public val SESSION_POWER_INIT: PowerInformationLevel = 41

public val SESSION_RIT_STATE: PowerInformationLevel = 61

public val SET_POWER_SETTING_VALUE: PowerInformationLevel = 25

public val SET_SHUTDOWN_SELECTED_TIME: PowerInformationLevel = 70

public val SUSPEND_RESUME_INVOCATION: PowerInformationLevel = 71

public val SYSTEM_BATTERY_STATE: PowerInformationLevel = 5

public val SYSTEM_BATTERY_STATE_PRECISE: PowerInformationLevel = 83

public val SYSTEM_EXECUTION_STATE: PowerInformationLevel = 16

public val SYSTEM_HIBER_FILE_INFORMATION: PowerInformationLevel = 36

public val SYSTEM_HIBER_FILE_SIZE: PowerInformationLevel = 51

public val SYSTEM_HIBER_FILE_TYPE: PowerInformationLevel = 89

public val SYSTEM_HIBERBOOT_STATE: PowerInformationLevel = 65

public val SYSTEM_MONITOR_HIBER_BOOT_POWER_OFF: PowerInformationLevel = 28

public val SYSTEM_POWER_CAPABILITIES: PowerInformationLevel = 4

public val SYSTEM_POWER_INFORMATION: PowerInformationLevel = 12

public val SYSTEM_POWER_LOGGING_ENTRY: PowerInformationLevel = 24

public val SYSTEM_POWER_POLICY_AC: PowerInformationLevel = 0

public val SYSTEM_POWER_POLICY_CURRENT: PowerInformationLevel = 8

public val SYSTEM_POWER_POLICY_DC: PowerInformationLevel = 1

public val SYSTEM_POWER_STATE_HANDLER: PowerInformationLevel = 6

public val SYSTEM_POWER_STATE_LOGGING: PowerInformationLevel = 23

public val SYSTEM_POWER_STATE_NOTIFY_HANDLER: PowerInformationLevel = 17

public val SYSTEM_RESERVE_HIBER_FILE: PowerInformationLevel = 10

public val SYSTEM_VIDEO_STATE: PowerInformationLevel = 29

public val SYSTEM_WAKE_SOURCE: PowerInformationLevel = 35

public val THERMAL_COOLING_INTERFACE_VERSION: UInt = 1u

public val THERMAL_DEVICE_INTERFACE_VERSION: UInt = 1u

public val THERMAL_EVENT_VERSION: UInt = 1u

public val THERMAL_POLICY_VERSION_1: UInt = 1u

public val THERMAL_POLICY_VERSION_2: UInt = 2u

public val TZ_ACTIVATION_REASON_CURRENT: UInt = 2u

public val TZ_ACTIVATION_REASON_THERMAL: UInt = 1u

public val THERMAL_EVENT: PowerInformationLevel = 84

public val THERMAL_STANDBY: PowerInformationLevel = 88

public val TRACE_APPLICATION_POWER_MESSAGE: PowerInformationLevel = 30

public val TRACE_APPLICATION_POWER_MESSAGE_END: PowerInformationLevel = 31

public val TRACE_SERVICE_POWER_MESSAGE: PowerInformationLevel = 37

public val UNKNOWN_CAPACITY: UInt = 4294967295u

public val UNKNOWN_CURRENT: UInt = 4294967295u

public val UNKNOWN_RATE: UInt = 2147483648u

public val UNKNOWN_VOLTAGE: UInt = 4294967295u

public val UPDATE_BLACK_BOX_RECORDER: PowerInformationLevel = 94

public val USB_CHARGER_PORT_LEGACY: UsbChargerPort = 0

public val USB_CHARGER_PORT_MAX: UsbChargerPort = 2

public val USB_CHARGER_PORT_TYPE_C: UsbChargerPort = 1

public val USER_NOT_PRESENT: PowerUserPresenceType = 0

public val USER_PRESENCE: PowerInformationLevel = 57

public val USER_PRESENT: PowerUserPresenceType = 1

public val USER_UNKNOWN: PowerUserPresenceType = 255

public val VERIFY_PROCESSOR_POWER_POLICY_AC: PowerInformationLevel = 20

public val VERIFY_PROCESSOR_POWER_POLICY_DC: PowerInformationLevel = 21

public val VERIFY_SYSTEM_POLICY_AC: PowerInformationLevel = 2

public val VERIFY_SYSTEM_POLICY_DC: PowerInformationLevel = 3

public val WAKE_TIMER_LIST: PowerInformationLevel = 50

public val BATTERY_CYCLE_COUNT_WMI_GUID: Guid = Guid.fromU128(U128(0xef98db2400144c25uL, 0xa50bc724ae5cd371uL))

public val BATTERY_FULL_CHARGED_CAPACITY_WMI_GUID: Guid = Guid.fromU128(U128(0x40b4056596f74435uL, 0x869497e0e4395905uL))

public val BATTERY_RUNTIME_WMI_GUID: Guid = Guid.fromU128(U128(0x535a37671ac249bcuL, 0xa0773f7a02e40aecuL))

public val BATTERY_STATIC_DATA_WMI_GUID: Guid = Guid.fromU128(U128(0x5e1e463e4e24ea9uL, 0x80cb9bd4b3ca0655uL))

public val BATTERY_STATUS_CHANGE_WMI_GUID: Guid = Guid.fromU128(U128(0xcddfa0c37c5b4e43uL, 0xa034059fa5b84364uL))

public val BATTERY_STATUS_WMI_GUID: Guid = Guid.fromU128(U128(0xfc4670d1ebbf416euL, 0x87ce374a4ebc111auL))

public val BATTERY_TAG_CHANGE_WMI_GUID: Guid = Guid.fromU128(U128(0x5e1f6e1987864d23uL, 0x94fc9e746bd5d888uL))

public val BATTERY_TEMPERATURE_WMI_GUID: Guid = Guid.fromU128(U128(0x1a52a14dadce4a44uL, 0x9a3ec8d8f15ff2c2uL))

public val GUID_CLASS_INPUT: Guid = Guid.fromU128(U128(0x4d1e55b2f16f11cfuL, 0x88cb001111000030uL))

public val GUID_DEVICE_ACPI_TIME: Guid = Guid.fromU128(U128(0x97f99bf644974f18uL, 0xbb224b9fb2fbef9cuL))

public val GUID_DEVICE_APPLICATIONLAUNCH_BUTTON: Guid = Guid.fromU128(U128(0x629758ee986e4d9euL, 0x8e47de27f8ab054duL))

public val GUID_DEVICE_BATTERY: Guid = Guid.fromU128(U128(0x72631e5478a411d0uL, 0xbcf700aa00b7b32auL))

public val GUID_DEVICE_ENERGY_METER: Guid = Guid.fromU128(U128(0x45bd83447ed649cfuL, 0xa440c276c933b053uL))

public val GUID_DEVICE_FAN: Guid = Guid.fromU128(U128(0x5ecd13d81da4a2auL, 0x8a4c524f23dd4dc9uL))

public val GUID_DEVICE_LID: Guid = Guid.fromU128(U128(0x4afa3d5274a711d0uL, 0xbe5e00a0c9062857uL))

public val GUID_DEVICE_MEMORY: Guid = Guid.fromU128(U128(0x3fd0f03d92e045fbuL, 0xb75c5ed8ffb01021uL))

public val GUID_DEVICE_MESSAGE_INDICATOR: Guid = Guid.fromU128(U128(0xcd48a365fa944ce2uL, 0xa232a1b764e5d8b4uL))

public val GUID_DEVICE_PROCESSOR: Guid = Guid.fromU128(U128(0x97fadb104e3340aeuL, 0x359c8bef029dbdd0uL))

public val GUID_DEVICE_SYS_BUTTON: Guid = Guid.fromU128(U128(0x4afa3d5374a711d0uL, 0xbe5e00a0c9062857uL))

public val GUID_DEVICE_THERMAL_ZONE: Guid = Guid.fromU128(U128(0x4afa3d5174a711d0uL, 0xbe5e00a0c9062857uL))

public val GUID_DEVINTERFACE_THERMAL_COOLING: Guid = Guid.fromU128(U128(0xdbe4373d3c8140cbuL, 0xace4e0e5d05f0c9fuL))

public val GUID_DEVINTERFACE_THERMAL_MANAGER: Guid = Guid.fromU128(U128(0x927ec09369a44bc0uL, 0xbd02711664714463uL))

public val PPM_IDLESTATES_DATA_GUID: Guid = Guid.fromU128(U128(0xba138e10e2504ad7uL, 0x8616cf1a7ad410e7uL))

public val PPM_IDLESTATE_CHANGE_GUID: Guid = Guid.fromU128(U128(0x4838fe4ff71c4e51uL, 0x9ecc8430a7ac4c6cuL))

public val PPM_IDLE_ACCOUNTING_EX_GUID: Guid = Guid.fromU128(U128(0xd67abd3981f84a5euL, 0x815272e31ec912eeuL))

public val PPM_IDLE_ACCOUNTING_GUID: Guid = Guid.fromU128(U128(0xe2a26f78ae074ee0uL, 0xa30fce54f55a94cduL))

public val PPM_PERFMON_PERFSTATE_GUID: Guid = Guid.fromU128(U128(0x7fd186520cfe40d2uL, 0xb0a10b066a87759euL))

public val PPM_PERFSTATES_DATA_GUID: Guid = Guid.fromU128(U128(0x5708cc207d404bf4uL, 0xb4aa2b01338d0126uL))

public val PPM_PERFSTATE_CHANGE_GUID: Guid = Guid.fromU128(U128(0xa5b32ddd7f394abcuL, 0xb892900e43b59ebbuL))

public val PPM_PERFSTATE_DOMAIN_CHANGE_GUID: Guid = Guid.fromU128(U128(0x995e6b7fd653497auL, 0xb97836a30c29bf01uL))

public val PPM_THERMALCONSTRAINT_GUID: Guid = Guid.fromU128(U128(0xa852c2c81a4c423buL, 0x8c2cf30d82931a88uL))

public val PPM_THERMAL_POLICY_CHANGE_GUID: Guid = Guid.fromU128(U128(0x48f377b868804c7buL, 0x8bdc380176c6654duL))

public val PROCESSOR_NUMBER_PKEY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x5724c81dd5af4c1fuL, 0xa103a06e28f204c6uL)), pid = 1u)
