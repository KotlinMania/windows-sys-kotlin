package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public val ACCESS_ACTIVE_OVERLAY_SCHEME: POWER_DATA_ACCESSOR = 27

public val ACCESS_ACTIVE_SCHEME: POWER_DATA_ACCESSOR = 19

public val ACCESS_AC_POWER_SETTING_INDEX: POWER_DATA_ACCESSOR = 0

public val ACCESS_AC_POWER_SETTING_MAX: POWER_DATA_ACCESSOR = 21

public val ACCESS_AC_POWER_SETTING_MIN: POWER_DATA_ACCESSOR = 23

public val ACCESS_ATTRIBUTES: POWER_DATA_ACCESSOR = 15

public val ACCESS_CREATE_SCHEME: POWER_DATA_ACCESSOR = 20

public val ACCESS_DC_POWER_SETTING_INDEX: POWER_DATA_ACCESSOR = 1

public val ACCESS_DC_POWER_SETTING_MAX: POWER_DATA_ACCESSOR = 22

public val ACCESS_DC_POWER_SETTING_MIN: POWER_DATA_ACCESSOR = 24

public val ACCESS_DEFAULT_AC_POWER_SETTING: POWER_DATA_ACCESSOR = 7

public val ACCESS_DEFAULT_DC_POWER_SETTING: POWER_DATA_ACCESSOR = 8

public val ACCESS_DEFAULT_SECURITY_DESCRIPTOR: POWER_DATA_ACCESSOR = 14

public val ACCESS_DESCRIPTION: POWER_DATA_ACCESSOR = 3

public val ACCESS_FRIENDLY_NAME: POWER_DATA_ACCESSOR = 2

public val ACCESS_ICON_RESOURCE: POWER_DATA_ACCESSOR = 13

public val ACCESS_INDIVIDUAL_SETTING: POWER_DATA_ACCESSOR = 18

public val ACCESS_OVERLAY_SCHEME: POWER_DATA_ACCESSOR = 26

public val ACCESS_POSSIBLE_POWER_SETTING: POWER_DATA_ACCESSOR = 4

public val ACCESS_POSSIBLE_POWER_SETTING_DESCRIPTION: POWER_DATA_ACCESSOR = 6

public val ACCESS_POSSIBLE_POWER_SETTING_FRIENDLY_NAME: POWER_DATA_ACCESSOR = 5

public val ACCESS_POSSIBLE_VALUE_INCREMENT: POWER_DATA_ACCESSOR = 11

public val ACCESS_POSSIBLE_VALUE_MAX: POWER_DATA_ACCESSOR = 10

public val ACCESS_POSSIBLE_VALUE_MIN: POWER_DATA_ACCESSOR = 9

public val ACCESS_POSSIBLE_VALUE_UNITS: POWER_DATA_ACCESSOR = 12

public val ACCESS_PROFILE: POWER_DATA_ACCESSOR = 25

public val ACCESS_SCHEME: POWER_DATA_ACCESSOR = 16

public val ACCESS_SUBGROUP: POWER_DATA_ACCESSOR = 17

public val ACPI_TIME_ADJUST_DAYLIGHT: UInt = 1u

public val ACPI_TIME_IN_DAYLIGHT: UInt = 2u

public val ACPI_TIME_ZONE_UNKNOWN: UInt = 2047u

public val ACTIVE_COOLING: UInt = 0u

public val ALTITUDE_GROUP_POLICY: POWER_SETTING_ALTITUDE = 0

public val ALTITUDE_INTERNAL_OVERRIDE: POWER_SETTING_ALTITUDE = 5

public val ALTITUDE_OEM_CUSTOMIZATION: POWER_SETTING_ALTITUDE = 4

public val ALTITUDE_OS_DEFAULT: POWER_SETTING_ALTITUDE = 6

public val ALTITUDE_PROVISIONING: POWER_SETTING_ALTITUDE = 3

public val ALTITUDE_RUNTIME_OVERRIDE: POWER_SETTING_ALTITUDE = 2

public val ALTITUDE_USER: POWER_SETTING_ALTITUDE = 1

public val AcpiTimeResolutionMax: ACPI_TIME_RESOLUTION = 2

public val AcpiTimeResolutionMilliseconds: ACPI_TIME_RESOLUTION = 0

public val AcpiTimeResolutionSeconds: ACPI_TIME_RESOLUTION = 1

public val AdministratorPowerPolicy: POWER_INFORMATION_LEVEL = 9

public val BATTERY_CAPACITY_RELATIVE: UInt = 1073741824u

public val BATTERY_CHARGING: UInt = 4u

public val BATTERY_CLASS_MAJOR_VERSION: UInt = 1u

public val BATTERY_CLASS_MINOR_VERSION: UInt = 0u

public val BATTERY_CLASS_MINOR_VERSION_1: UInt = 1u

public val BATTERY_CRITICAL: UInt = 8u

public val BATTERY_CYCLE_COUNT_WMI_GUID: GUID = GUID.from_u128(0xef98db2400144c25uL, 0xa50bc724ae5cd371uL)

public val BATTERY_DISCHARGING: UInt = 2u

public val BATTERY_FULL_CHARGED_CAPACITY_WMI_GUID: GUID = GUID.from_u128(0x40b4056596f74435uL, 0x869497e0e4395905uL)

public val BATTERY_IS_SHORT_TERM: UInt = 536870912u

public val BATTERY_MINIPORT_UPDATE_DATA_VER_1: UInt = 1u

public val BATTERY_MINIPORT_UPDATE_DATA_VER_2: UInt = 2u

public val BATTERY_POWER_ON_LINE: UInt = 1u

public val BATTERY_RUNTIME_WMI_GUID: GUID = GUID.from_u128(0x535a37671ac249bcuL, 0xa0773f7a02e40aecuL)

public val BATTERY_SEALED: UInt = 268435456u

public val BATTERY_SET_CHARGER_ID_SUPPORTED: UInt = 8u

public val BATTERY_SET_CHARGE_SUPPORTED: UInt = 1u

public val BATTERY_SET_CHARGINGSOURCE_SUPPORTED: UInt = 4u

public val BATTERY_SET_DISCHARGE_SUPPORTED: UInt = 2u

public val BATTERY_STATIC_DATA_WMI_GUID: GUID = GUID.from_u128(0x5e1e463e4e24ea9uL, 0x80cb9bd4b3ca0655uL)

public val BATTERY_STATUS_CHANGE_WMI_GUID: GUID = GUID.from_u128(0xcddfa0c37c5b4e43uL, 0xa034059fa5b84364uL)

public val BATTERY_STATUS_WMI_GUID: GUID = GUID.from_u128(0xfc4670d1ebbf416euL, 0x87ce374a4ebc111auL)

public val BATTERY_SYSTEM_BATTERY: UInt = 2147483648u

public val BATTERY_TAG_CHANGE_WMI_GUID: GUID = GUID.from_u128(0x5e1f6e1987864d23uL, 0x94fc9e746bd5d888uL)

public val BATTERY_TAG_INVALID: UInt = 0u

public val BATTERY_TEMPERATURE_WMI_GUID: GUID = GUID.from_u128(0x1a52a14dadce4a44uL, 0x9a3ec8d8f15ff2c2uL)

public val BATTERY_UNKNOWN_CAPACITY: UInt = 4294967295u

public val BATTERY_UNKNOWN_CURRENT: UInt = 4294967295u

public val BATTERY_UNKNOWN_RATE: UInt = 2147483648u

public val BATTERY_UNKNOWN_TIME: UInt = 4294967295u

public val BATTERY_UNKNOWN_VOLTAGE: UInt = 4294967295u

public val BATTERY_USB_CHARGER_STATUS_FN_DEFAULT_USB: UInt = 1u

public val BATTERY_USB_CHARGER_STATUS_UCM_PD: UInt = 2u

public val BatteryCharge: BATTERY_SET_INFORMATION_LEVEL = 1

public val BatteryChargerId: BATTERY_SET_INFORMATION_LEVEL = 4

public val BatteryChargerStatus: BATTERY_SET_INFORMATION_LEVEL = 5

public val BatteryChargingSource: BATTERY_SET_INFORMATION_LEVEL = 3

public val BatteryChargingSourceType_AC: BATTERY_CHARGING_SOURCE_TYPE = 1

public val BatteryChargingSourceType_Max: BATTERY_CHARGING_SOURCE_TYPE = 4

public val BatteryChargingSourceType_USB: BATTERY_CHARGING_SOURCE_TYPE = 2

public val BatteryChargingSourceType_Wireless: BATTERY_CHARGING_SOURCE_TYPE = 3

public val BatteryCriticalBias: BATTERY_SET_INFORMATION_LEVEL = 0

public val BatteryDeviceName: BATTERY_QUERY_INFORMATION_LEVEL = 4

public val BatteryDeviceState: POWER_INFORMATION_LEVEL = 86

public val BatteryDischarge: BATTERY_SET_INFORMATION_LEVEL = 2

public val BatteryEstimatedTime: BATTERY_QUERY_INFORMATION_LEVEL = 3

public val BatteryGranularityInformation: BATTERY_QUERY_INFORMATION_LEVEL = 1

public val BatteryInformation: BATTERY_QUERY_INFORMATION_LEVEL = 0

public val BatteryManufactureDate: BATTERY_QUERY_INFORMATION_LEVEL = 5

public val BatteryManufactureName: BATTERY_QUERY_INFORMATION_LEVEL = 6

public val BatterySerialNumber: BATTERY_QUERY_INFORMATION_LEVEL = 8

public val BatteryTemperature: BATTERY_QUERY_INFORMATION_LEVEL = 2

public val BatteryUniqueID: BATTERY_QUERY_INFORMATION_LEVEL = 7

public val BlackBoxRecorderDirectAccessBuffer: POWER_INFORMATION_LEVEL = 97

public val CsDeviceNotification: POWER_INFORMATION_LEVEL = 74

public val DEVICEPOWER_AND_OPERATION: UInt = 1073741824u

public val DEVICEPOWER_CLEAR_WAKEENABLED: UInt = 2u

public val DEVICEPOWER_FILTER_DEVICES_PRESENT: UInt = 536870912u

public val DEVICEPOWER_FILTER_HARDWARE: UInt = 268435456u

public val DEVICEPOWER_FILTER_ON_NAME: UInt = 33554432u

public val DEVICEPOWER_FILTER_WAKEENABLED: UInt = 134217728u

public val DEVICEPOWER_FILTER_WAKEPROGRAMMABLE: UInt = 67108864u

public val DEVICEPOWER_HARDWAREID: UInt = 2147483648u

public val DEVICEPOWER_SET_WAKEENABLED: UInt = 1u

public val DisplayBurst: POWER_INFORMATION_LEVEL = 77

public val EFFECTIVE_POWER_MODE_V1: UInt = 1u

public val EFFECTIVE_POWER_MODE_V2: UInt = 2u

public val EMI_NAME_MAX: UInt = 16u

public val EMI_VERSION_V1: UInt = 1u

public val EMI_VERSION_V2: UInt = 2u

public val ES_AWAYMODE_REQUIRED: EXECUTION_STATE = 64u

public val ES_CONTINUOUS: EXECUTION_STATE = 2147483648u

public val ES_DISPLAY_REQUIRED: EXECUTION_STATE = 2u

public val ES_SYSTEM_REQUIRED: EXECUTION_STATE = 1u

public val ES_USER_PRESENT: EXECUTION_STATE = 4u

public val EffectivePowerModeBalanced: EFFECTIVE_POWER_MODE = 2

public val EffectivePowerModeBatterySaver: EFFECTIVE_POWER_MODE = 0

public val EffectivePowerModeBetterBattery: EFFECTIVE_POWER_MODE = 1

public val EffectivePowerModeGameMode: EFFECTIVE_POWER_MODE = 5

public val EffectivePowerModeHighPerformance: EFFECTIVE_POWER_MODE = 3

public val EffectivePowerModeMaxPerformance: EFFECTIVE_POWER_MODE = 4

public val EffectivePowerModeMixedReality: EFFECTIVE_POWER_MODE = 6

public val EmiMeasurementUnitPicowattHours: EMI_MEASUREMENT_UNIT = 0

public val EnableMultiBatteryDisplay: UInt = 2u

public val EnablePasswordLogon: UInt = 4u

public val EnableSysTrayBatteryMeter: UInt = 1u

public val EnableVideoDimDisplay: UInt = 16u

public val EnableWakeOnRing: UInt = 8u

public val EnergyTrackerCreate: POWER_INFORMATION_LEVEL = 92

public val EnergyTrackerQuery: POWER_INFORMATION_LEVEL = 93

public val ExitLatencySamplingPercentage: POWER_INFORMATION_LEVEL = 78

public val FirmwareTableInformationRegistered: POWER_INFORMATION_LEVEL = 69

public val GUID_CLASS_INPUT: GUID = GUID.from_u128(0x4d1e55b2f16f11cfuL, 0x88cb001111000030uL)

public val GUID_DEVICE_ACPI_TIME: GUID = GUID.from_u128(0x97f99bf644974f18uL, 0xbb224b9fb2fbef9cuL)

public val GUID_DEVICE_APPLICATIONLAUNCH_BUTTON: GUID = GUID.from_u128(0x629758ee986e4d9euL, 0x8e47de27f8ab054duL)

public val GUID_DEVICE_BATTERY: GUID = GUID.from_u128(0x72631e5478a411d0uL, 0xbcf700aa00b7b32auL)

public val GUID_DEVICE_ENERGY_METER: GUID = GUID.from_u128(0x45bd83447ed649cfuL, 0xa440c276c933b053uL)

public val GUID_DEVICE_FAN: GUID = GUID.from_u128(0x5ecd13d81da4a2auL, 0x8a4c524f23dd4dc9uL)

public val GUID_DEVICE_LID: GUID = GUID.from_u128(0x4afa3d5274a711d0uL, 0xbe5e00a0c9062857uL)

public val GUID_DEVICE_MEMORY: GUID = GUID.from_u128(0x3fd0f03d92e045fbuL, 0xb75c5ed8ffb01021uL)

public val GUID_DEVICE_MESSAGE_INDICATOR: GUID = GUID.from_u128(0xcd48a365fa944ce2uL, 0xa232a1b764e5d8b4uL)

public val GUID_DEVICE_PROCESSOR: GUID = GUID.from_u128(0x97fadb104e3340aeuL, 0x359c8bef029dbdd0uL)

public val GUID_DEVICE_SYS_BUTTON: GUID = GUID.from_u128(0x4afa3d5374a711d0uL, 0xbe5e00a0c9062857uL)

public val GUID_DEVICE_THERMAL_ZONE: GUID = GUID.from_u128(0x4afa3d5174a711d0uL, 0xbe5e00a0c9062857uL)

public val GUID_DEVINTERFACE_THERMAL_COOLING: GUID = GUID.from_u128(0xdbe4373d3c8140cbuL, 0xace4e0e5d05f0c9fuL)

public val GUID_DEVINTERFACE_THERMAL_MANAGER: GUID = GUID.from_u128(0x927ec09369a44bc0uL, 0xbd02711664714463uL)

public val GetPowerRequestList: POWER_INFORMATION_LEVEL = 45

public val GetPowerSettingValue: POWER_INFORMATION_LEVEL = 59

public val GroupPark: POWER_INFORMATION_LEVEL = 48

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

public val IdleResiliency: POWER_INFORMATION_LEVEL = 60

public val LT_DONT_CARE: LATENCY_TIME = 0

public val LT_LOWEST_LATENCY: LATENCY_TIME = 1

public val LastResumePerformance: POWER_INFORMATION_LEVEL = 76

public val LastSleepTime: POWER_INFORMATION_LEVEL = 15

public val LastWakeTime: POWER_INFORMATION_LEVEL = 14

public val LogicalProcessorIdling: POWER_INFORMATION_LEVEL = 56

public val MAX_ACTIVE_COOLING_LEVELS: UInt = 10u

public val MAX_BATTERY_STRING_SIZE: UInt = 128u

public val MonitorCapabilities: POWER_INFORMATION_LEVEL = 40

public val MonitorInvocation: POWER_INFORMATION_LEVEL = 68

public val MonitorRequestReasonAcDcDisplayBurst: POWER_MONITOR_REQUEST_REASON = 5

public val MonitorRequestReasonAcDcDisplayBurstSuppressed: POWER_MONITOR_REQUEST_REASON = 28

public val MonitorRequestReasonBatteryCountChange: POWER_MONITOR_REQUEST_REASON = 16

public val MonitorRequestReasonBatteryCountChangeSuppressed: POWER_MONITOR_REQUEST_REASON = 49

public val MonitorRequestReasonBatteryPreCritical: POWER_MONITOR_REQUEST_REASON = 53

public val MonitorRequestReasonBuiltinPanel: POWER_MONITOR_REQUEST_REASON = 47

public val MonitorRequestReasonDP: POWER_MONITOR_REQUEST_REASON = 19

public val MonitorRequestReasonDim: POWER_MONITOR_REQUEST_REASON = 46

public val MonitorRequestReasonDirectedDrips: POWER_MONITOR_REQUEST_REASON = 45

public val MonitorRequestReasonDisplayRequiredUnDim: POWER_MONITOR_REQUEST_REASON = 48

public val MonitorRequestReasonFullWake: POWER_MONITOR_REQUEST_REASON = 9

public val MonitorRequestReasonGracePeriod: POWER_MONITOR_REQUEST_REASON = 17

public val MonitorRequestReasonIdleTimeout: POWER_MONITOR_REQUEST_REASON = 12

public val MonitorRequestReasonLid: POWER_MONITOR_REQUEST_REASON = 15

public val MonitorRequestReasonMax: POWER_MONITOR_REQUEST_REASON = 55

public val MonitorRequestReasonNearProximity: POWER_MONITOR_REQUEST_REASON = 22

public val MonitorRequestReasonPdcSignal: POWER_MONITOR_REQUEST_REASON = 27

public val MonitorRequestReasonPdcSignalFingerprint: POWER_MONITOR_REQUEST_REASON = 44

public val MonitorRequestReasonPdcSignalHeyCortana: POWER_MONITOR_REQUEST_REASON = 42

public val MonitorRequestReasonPdcSignalHolographicShell: POWER_MONITOR_REQUEST_REASON = 43

public val MonitorRequestReasonPdcSignalSensorsHumanPresence: POWER_MONITOR_REQUEST_REASON = 52

public val MonitorRequestReasonPdcSignalWindowsMobilePwrNotif: POWER_MONITOR_REQUEST_REASON = 40

public val MonitorRequestReasonPdcSignalWindowsMobileShell: POWER_MONITOR_REQUEST_REASON = 41

public val MonitorRequestReasonPnP: POWER_MONITOR_REQUEST_REASON = 18

public val MonitorRequestReasonPoSetSystemState: POWER_MONITOR_REQUEST_REASON = 7

public val MonitorRequestReasonPolicyChange: POWER_MONITOR_REQUEST_REASON = 13

public val MonitorRequestReasonPowerButton: POWER_MONITOR_REQUEST_REASON = 1

public val MonitorRequestReasonRemoteConnection: POWER_MONITOR_REQUEST_REASON = 2

public val MonitorRequestReasonResumeModernStandby: POWER_MONITOR_REQUEST_REASON = 50

public val MonitorRequestReasonResumePdc: POWER_MONITOR_REQUEST_REASON = 24

public val MonitorRequestReasonResumeS4: POWER_MONITOR_REQUEST_REASON = 25

public val MonitorRequestReasonScMonitorpower: POWER_MONITOR_REQUEST_REASON = 3

public val MonitorRequestReasonScreenOffRequest: POWER_MONITOR_REQUEST_REASON = 11

public val MonitorRequestReasonSessionUnlock: POWER_MONITOR_REQUEST_REASON = 10

public val MonitorRequestReasonSetThreadExecutionState: POWER_MONITOR_REQUEST_REASON = 8

public val MonitorRequestReasonSleepButton: POWER_MONITOR_REQUEST_REASON = 14

public val MonitorRequestReasonSxTransition: POWER_MONITOR_REQUEST_REASON = 20

public val MonitorRequestReasonSystemIdle: POWER_MONITOR_REQUEST_REASON = 21

public val MonitorRequestReasonSystemStateEntered: POWER_MONITOR_REQUEST_REASON = 29

public val MonitorRequestReasonTerminal: POWER_MONITOR_REQUEST_REASON = 26

public val MonitorRequestReasonTerminalInit: POWER_MONITOR_REQUEST_REASON = 51

public val MonitorRequestReasonThermalStandby: POWER_MONITOR_REQUEST_REASON = 23

public val MonitorRequestReasonUnknown: POWER_MONITOR_REQUEST_REASON = 0

public val MonitorRequestReasonUserDisplayBurst: POWER_MONITOR_REQUEST_REASON = 6

public val MonitorRequestReasonUserInput: POWER_MONITOR_REQUEST_REASON = 4

public val MonitorRequestReasonUserInputAccelerometer: POWER_MONITOR_REQUEST_REASON = 35

public val MonitorRequestReasonUserInputHid: POWER_MONITOR_REQUEST_REASON = 36

public val MonitorRequestReasonUserInputInitialization: POWER_MONITOR_REQUEST_REASON = 39

public val MonitorRequestReasonUserInputKeyboard: POWER_MONITOR_REQUEST_REASON = 31

public val MonitorRequestReasonUserInputMouse: POWER_MONITOR_REQUEST_REASON = 32

public val MonitorRequestReasonUserInputPen: POWER_MONITOR_REQUEST_REASON = 34

public val MonitorRequestReasonUserInputPoUserPresent: POWER_MONITOR_REQUEST_REASON = 37

public val MonitorRequestReasonUserInputSessionSwitch: POWER_MONITOR_REQUEST_REASON = 38

public val MonitorRequestReasonUserInputTouch: POWER_MONITOR_REQUEST_REASON = 54

public val MonitorRequestReasonUserInputTouchpad: POWER_MONITOR_REQUEST_REASON = 33

public val MonitorRequestReasonWinrt: POWER_MONITOR_REQUEST_REASON = 30

public val MonitorRequestTypeOff: POWER_MONITOR_REQUEST_TYPE = 0

public val MonitorRequestTypeOnAndPresent: POWER_MONITOR_REQUEST_TYPE = 1

public val MonitorRequestTypeToggleOn: POWER_MONITOR_REQUEST_TYPE = 2

public val NotifyUserModeLegacyPowerEvent: POWER_INFORMATION_LEVEL = 47

public val NotifyUserPowerSetting: POWER_INFORMATION_LEVEL = 26

public val PASSIVE_COOLING: UInt = 1u

public val PDCAP_D0_SUPPORTED: DEVICE_POWER_CAPABILITIES = 1u

public val PDCAP_D1_SUPPORTED: DEVICE_POWER_CAPABILITIES = 2u

public val PDCAP_D2_SUPPORTED: DEVICE_POWER_CAPABILITIES = 4u

public val PDCAP_D3_SUPPORTED: DEVICE_POWER_CAPABILITIES = 8u

public val PDCAP_S0_SUPPORTED: DEVICE_POWER_CAPABILITIES = 65536u

public val PDCAP_S1_SUPPORTED: DEVICE_POWER_CAPABILITIES = 131072u

public val PDCAP_S2_SUPPORTED: DEVICE_POWER_CAPABILITIES = 262144u

public val PDCAP_S3_SUPPORTED: DEVICE_POWER_CAPABILITIES = 524288u

public val PDCAP_S4_SUPPORTED: DEVICE_POWER_CAPABILITIES = 16777216u

public val PDCAP_S5_SUPPORTED: DEVICE_POWER_CAPABILITIES = 33554432u

public val PDCAP_WAKE_FROM_D0_SUPPORTED: DEVICE_POWER_CAPABILITIES = 16u

public val PDCAP_WAKE_FROM_D1_SUPPORTED: DEVICE_POWER_CAPABILITIES = 32u

public val PDCAP_WAKE_FROM_D2_SUPPORTED: DEVICE_POWER_CAPABILITIES = 64u

public val PDCAP_WAKE_FROM_D3_SUPPORTED: DEVICE_POWER_CAPABILITIES = 128u

public val PDCAP_WAKE_FROM_S0_SUPPORTED: DEVICE_POWER_CAPABILITIES = 1048576u

public val PDCAP_WAKE_FROM_S1_SUPPORTED: DEVICE_POWER_CAPABILITIES = 2097152u

public val PDCAP_WAKE_FROM_S2_SUPPORTED: DEVICE_POWER_CAPABILITIES = 4194304u

public val PDCAP_WAKE_FROM_S3_SUPPORTED: DEVICE_POWER_CAPABILITIES = 8388608u

public val PDCAP_WARM_EJECT_SUPPORTED: DEVICE_POWER_CAPABILITIES = 256u

public val POWER_ATTRIBUTE_HIDE: UInt = 1u

public val POWER_ATTRIBUTE_SHOW_AOAC: UInt = 2u

public val POWER_FORCE_TRIGGER_RESET: POWER_ACTION_POLICY_EVENT_CODE = 2147483648u

public val POWER_LEVEL_USER_NOTIFY_EXEC: POWER_ACTION_POLICY_EVENT_CODE = 4u

public val POWER_LEVEL_USER_NOTIFY_SOUND: POWER_ACTION_POLICY_EVENT_CODE = 2u

public val POWER_LEVEL_USER_NOTIFY_TEXT: POWER_ACTION_POLICY_EVENT_CODE = 1u

public val POWER_PLATFORM_ROLE_V1: POWER_PLATFORM_ROLE_VERSION = 1u

public val POWER_PLATFORM_ROLE_V2: POWER_PLATFORM_ROLE_VERSION = 2u

public val POWER_USER_NOTIFY_BUTTON: POWER_ACTION_POLICY_EVENT_CODE = 8u

public val POWER_USER_NOTIFY_SHUTDOWN: POWER_ACTION_POLICY_EVENT_CODE = 16u

public val PO_TZ_ACTIVE: POWER_COOLING_MODE = 0u

public val PO_TZ_INVALID_MODE: POWER_COOLING_MODE = 2u

public val PO_TZ_PASSIVE: POWER_COOLING_MODE = 1u

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

public val PPM_IDLESTATES_DATA_GUID: GUID = GUID.from_u128(0xba138e10e2504ad7uL, 0x8616cf1a7ad410e7uL)

public val PPM_IDLESTATE_CHANGE_GUID: GUID = GUID.from_u128(0x4838fe4ff71c4e51uL, 0x9ecc8430a7ac4c6cuL)

public val PPM_IDLE_ACCOUNTING_EX_GUID: GUID = GUID.from_u128(0xd67abd3981f84a5euL, 0x815272e31ec912eeuL)

public val PPM_IDLE_ACCOUNTING_GUID: GUID = GUID.from_u128(0xe2a26f78ae074ee0uL, 0xa30fce54f55a94cduL)

public val PPM_IDLE_IMPLEMENTATION_CSTATES: UInt = 1u

public val PPM_IDLE_IMPLEMENTATION_LPISTATES: UInt = 4u

public val PPM_IDLE_IMPLEMENTATION_MICROPEP: UInt = 3u

public val PPM_IDLE_IMPLEMENTATION_NONE: UInt = 0u

public val PPM_IDLE_IMPLEMENTATION_PEP: UInt = 2u

public val PPM_PERFMON_PERFSTATE_GUID: GUID = GUID.from_u128(0x7fd186520cfe40d2uL, 0xb0a10b066a87759euL)

public val PPM_PERFORMANCE_IMPLEMENTATION_CPPC: UInt = 3u

public val PPM_PERFORMANCE_IMPLEMENTATION_NONE: UInt = 0u

public val PPM_PERFORMANCE_IMPLEMENTATION_PCCV1: UInt = 2u

public val PPM_PERFORMANCE_IMPLEMENTATION_PEP: UInt = 4u

public val PPM_PERFORMANCE_IMPLEMENTATION_PSTATES: UInt = 1u

public val PPM_PERFSTATES_DATA_GUID: GUID = GUID.from_u128(0x5708cc207d404bf4uL, 0xb4aa2b01338d0126uL)

public val PPM_PERFSTATE_CHANGE_GUID: GUID = GUID.from_u128(0xa5b32ddd7f394abcuL, 0xb892900e43b59ebbuL)

public val PPM_PERFSTATE_DOMAIN_CHANGE_GUID: GUID = GUID.from_u128(0x995e6b7fd653497auL, 0xb97836a30c29bf01uL)

public val PPM_THERMALCONSTRAINT_GUID: GUID = GUID.from_u128(0xa852c2c81a4c423buL, 0x8c2cf30d82931a88uL)

public val PPM_THERMAL_POLICY_CHANGE_GUID: GUID = GUID.from_u128(0x48f377b868804c7buL, 0x8bdc380176c6654duL)

public val PROCESSOR_NUMBER_PKEY: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x5724c81dd5af4c1fuL, 0xa103a06e28f204c6uL), pid = 1u)

public val PdcInvocation: POWER_INFORMATION_LEVEL = 67

public val PhysicalPowerButtonPress: POWER_INFORMATION_LEVEL = 90

public val PlatformIdleStates: POWER_INFORMATION_LEVEL = 80

public val PlatformIdleVeto: POWER_INFORMATION_LEVEL = 82

public val PlatformInformation: POWER_INFORMATION_LEVEL = 66

public val PlatformRole: POWER_INFORMATION_LEVEL = 75

public val PlatformRoleAppliancePC: POWER_PLATFORM_ROLE = 6

public val PlatformRoleDesktop: POWER_PLATFORM_ROLE = 1

public val PlatformRoleEnterpriseServer: POWER_PLATFORM_ROLE = 4

public val PlatformRoleMaximum: POWER_PLATFORM_ROLE = 9

public val PlatformRoleMobile: POWER_PLATFORM_ROLE = 2

public val PlatformRolePerformanceServer: POWER_PLATFORM_ROLE = 7

public val PlatformRoleSOHOServer: POWER_PLATFORM_ROLE = 5

public val PlatformRoleSlate: POWER_PLATFORM_ROLE = 8

public val PlatformRoleUnspecified: POWER_PLATFORM_ROLE = 0

public val PlatformRoleWorkstation: POWER_PLATFORM_ROLE = 3

public val PlmPowerRequestCreate: POWER_INFORMATION_LEVEL = 72

public val PoAc: SYSTEM_POWER_CONDITION = 0

public val PoConditionMaximum: SYSTEM_POWER_CONDITION = 3

public val PoDc: SYSTEM_POWER_CONDITION = 1

public val PoHot: SYSTEM_POWER_CONDITION = 2

public val PowerActionDisplayOff: POWER_ACTION = 8

public val PowerActionHibernate: POWER_ACTION = 3

public val PowerActionNone: POWER_ACTION = 0

public val PowerActionReserved: POWER_ACTION = 1

public val PowerActionShutdown: POWER_ACTION = 4

public val PowerActionShutdownOff: POWER_ACTION = 6

public val PowerActionShutdownReset: POWER_ACTION = 5

public val PowerActionSleep: POWER_ACTION = 2

public val PowerActionWarmEject: POWER_ACTION = 7

public val PowerDeviceD0: DEVICE_POWER_STATE = 1

public val PowerDeviceD1: DEVICE_POWER_STATE = 2

public val PowerDeviceD2: DEVICE_POWER_STATE = 3

public val PowerDeviceD3: DEVICE_POWER_STATE = 4

public val PowerDeviceMaximum: DEVICE_POWER_STATE = 5

public val PowerDeviceUnspecified: DEVICE_POWER_STATE = 0

public val PowerInformationInternal: POWER_INFORMATION_LEVEL = 87

public val PowerInformationLevelMaximum: POWER_INFORMATION_LEVEL = 98

public val PowerInformationLevelUnused0: POWER_INFORMATION_LEVEL = 27

public val PowerRequestAction: POWER_INFORMATION_LEVEL = 44

public val PowerRequestActionInternal: POWER_INFORMATION_LEVEL = 85

public val PowerRequestAwayModeRequired: POWER_REQUEST_TYPE = 2

public val PowerRequestCreate: POWER_INFORMATION_LEVEL = 43

public val PowerRequestDisplayRequired: POWER_REQUEST_TYPE = 0

public val PowerRequestExecutionRequired: POWER_REQUEST_TYPE = 3

public val PowerRequestSystemRequired: POWER_REQUEST_TYPE = 1

public val PowerSettingNotificationName: POWER_INFORMATION_LEVEL = 58

public val PowerShutdownNotification: POWER_INFORMATION_LEVEL = 39

public val PowerSystemHibernate: SYSTEM_POWER_STATE = 5

public val PowerSystemMaximum: SYSTEM_POWER_STATE = 7

public val PowerSystemShutdown: SYSTEM_POWER_STATE = 6

public val PowerSystemSleeping1: SYSTEM_POWER_STATE = 2

public val PowerSystemSleeping2: SYSTEM_POWER_STATE = 3

public val PowerSystemSleeping3: SYSTEM_POWER_STATE = 4

public val PowerSystemUnspecified: SYSTEM_POWER_STATE = 0

public val PowerSystemWorking: SYSTEM_POWER_STATE = 1

public val PowerUserInactive: USER_ACTIVITY_PRESENCE = 2

public val PowerUserInvalid: USER_ACTIVITY_PRESENCE = 3

public val PowerUserMaximum: USER_ACTIVITY_PRESENCE = 3

public val PowerUserNotPresent: USER_ACTIVITY_PRESENCE = 1

public val PowerUserPresent: USER_ACTIVITY_PRESENCE = 0

public val ProcessorCap: POWER_INFORMATION_LEVEL = 34

public val ProcessorIdleDomains: POWER_INFORMATION_LEVEL = 49

public val ProcessorIdleStates: POWER_INFORMATION_LEVEL = 33

public val ProcessorIdleStatesHv: POWER_INFORMATION_LEVEL = 52

public val ProcessorIdleVeto: POWER_INFORMATION_LEVEL = 81

public val ProcessorInformation: POWER_INFORMATION_LEVEL = 11

public val ProcessorInformationEx: POWER_INFORMATION_LEVEL = 46

public val ProcessorLoad: POWER_INFORMATION_LEVEL = 38

public val ProcessorPerfCapHv: POWER_INFORMATION_LEVEL = 54

public val ProcessorPerfStates: POWER_INFORMATION_LEVEL = 32

public val ProcessorPerfStatesHv: POWER_INFORMATION_LEVEL = 53

public val ProcessorPowerPolicyAc: POWER_INFORMATION_LEVEL = 18

public val ProcessorPowerPolicyCurrent: POWER_INFORMATION_LEVEL = 22

public val ProcessorPowerPolicyDc: POWER_INFORMATION_LEVEL = 19

public val ProcessorSetIdle: POWER_INFORMATION_LEVEL = 55

public val ProcessorStateHandler: POWER_INFORMATION_LEVEL = 7

public val ProcessorStateHandler2: POWER_INFORMATION_LEVEL = 13

public val QueryPotentialDripsConstraint: POWER_INFORMATION_LEVEL = 91

public val RegisterSpmPowerSettings: POWER_INFORMATION_LEVEL = 79

public val SYS_BUTTON_LID: UInt = 4u

public val SYS_BUTTON_LID_CHANGED: UInt = 524288u

public val SYS_BUTTON_LID_CLOSED: UInt = 131072u

public val SYS_BUTTON_LID_INITIAL: UInt = 262144u

public val SYS_BUTTON_LID_OPEN: UInt = 65536u

public val SYS_BUTTON_LID_STATE_MASK: UInt = 196608u

public val SYS_BUTTON_POWER: UInt = 1u

public val SYS_BUTTON_SLEEP: UInt = 2u

public val SYS_BUTTON_WAKE: UInt = 2147483648u

public val ScreenOff: POWER_INFORMATION_LEVEL = 73

public val SendSuspendResumeNotification: POWER_INFORMATION_LEVEL = 96

public val SessionAllowExternalDmaDevices: POWER_INFORMATION_LEVEL = 95

public val SessionConnectNotification: POWER_INFORMATION_LEVEL = 62

public val SessionDisplayState: POWER_INFORMATION_LEVEL = 42

public val SessionLockState: POWER_INFORMATION_LEVEL = 64

public val SessionPowerCleanup: POWER_INFORMATION_LEVEL = 63

public val SessionPowerInit: POWER_INFORMATION_LEVEL = 41

public val SessionRITState: POWER_INFORMATION_LEVEL = 61

public val SetPowerSettingValue: POWER_INFORMATION_LEVEL = 25

public val SetShutdownSelectedTime: POWER_INFORMATION_LEVEL = 70

public val SuspendResumeInvocation: POWER_INFORMATION_LEVEL = 71

public val SystemBatteryState: POWER_INFORMATION_LEVEL = 5

public val SystemBatteryStatePrecise: POWER_INFORMATION_LEVEL = 83

public val SystemExecutionState: POWER_INFORMATION_LEVEL = 16

public val SystemHiberFileInformation: POWER_INFORMATION_LEVEL = 36

public val SystemHiberFileSize: POWER_INFORMATION_LEVEL = 51

public val SystemHiberFileType: POWER_INFORMATION_LEVEL = 89

public val SystemHiberbootState: POWER_INFORMATION_LEVEL = 65

public val SystemMonitorHiberBootPowerOff: POWER_INFORMATION_LEVEL = 28

public val SystemPowerCapabilities: POWER_INFORMATION_LEVEL = 4

public val SystemPowerInformation: POWER_INFORMATION_LEVEL = 12

public val SystemPowerLoggingEntry: POWER_INFORMATION_LEVEL = 24

public val SystemPowerPolicyAc: POWER_INFORMATION_LEVEL = 0

public val SystemPowerPolicyCurrent: POWER_INFORMATION_LEVEL = 8

public val SystemPowerPolicyDc: POWER_INFORMATION_LEVEL = 1

public val SystemPowerStateHandler: POWER_INFORMATION_LEVEL = 6

public val SystemPowerStateLogging: POWER_INFORMATION_LEVEL = 23

public val SystemPowerStateNotifyHandler: POWER_INFORMATION_LEVEL = 17

public val SystemReserveHiberFile: POWER_INFORMATION_LEVEL = 10

public val SystemVideoState: POWER_INFORMATION_LEVEL = 29

public val SystemWakeSource: POWER_INFORMATION_LEVEL = 35

public val THERMAL_COOLING_INTERFACE_VERSION: UInt = 1u

public val THERMAL_DEVICE_INTERFACE_VERSION: UInt = 1u

public val THERMAL_EVENT_VERSION: UInt = 1u

public val THERMAL_POLICY_VERSION_1: UInt = 1u

public val THERMAL_POLICY_VERSION_2: UInt = 2u

public val TZ_ACTIVATION_REASON_CURRENT: UInt = 2u

public val TZ_ACTIVATION_REASON_THERMAL: UInt = 1u

public val ThermalEvent: POWER_INFORMATION_LEVEL = 84

public val ThermalStandby: POWER_INFORMATION_LEVEL = 88

public val TraceApplicationPowerMessage: POWER_INFORMATION_LEVEL = 30

public val TraceApplicationPowerMessageEnd: POWER_INFORMATION_LEVEL = 31

public val TraceServicePowerMessage: POWER_INFORMATION_LEVEL = 37

public val UNKNOWN_CAPACITY: UInt = 4294967295u

public val UNKNOWN_CURRENT: UInt = 4294967295u

public val UNKNOWN_RATE: UInt = 2147483648u

public val UNKNOWN_VOLTAGE: UInt = 4294967295u

public val UpdateBlackBoxRecorder: POWER_INFORMATION_LEVEL = 94

public val UsbChargerPort_Legacy: USB_CHARGER_PORT = 0

public val UsbChargerPort_Max: USB_CHARGER_PORT = 2

public val UsbChargerPort_TypeC: USB_CHARGER_PORT = 1

public val UserNotPresent: POWER_USER_PRESENCE_TYPE = 0

public val UserPresence: POWER_INFORMATION_LEVEL = 57

public val UserPresent: POWER_USER_PRESENCE_TYPE = 1

public val UserUnknown: POWER_USER_PRESENCE_TYPE = 255

public val VerifyProcessorPowerPolicyAc: POWER_INFORMATION_LEVEL = 20

public val VerifyProcessorPowerPolicyDc: POWER_INFORMATION_LEVEL = 21

public val VerifySystemPolicyAc: POWER_INFORMATION_LEVEL = 2

public val VerifySystemPolicyDc: POWER_INFORMATION_LEVEL = 3

public val WakeTimerList: POWER_INFORMATION_LEVEL = 50
