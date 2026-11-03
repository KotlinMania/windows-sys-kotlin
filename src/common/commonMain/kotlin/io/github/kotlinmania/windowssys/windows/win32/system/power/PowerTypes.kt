package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias ACPI_TIME_RESOLUTION = Int

public typealias BATTERY_CHARGING_SOURCE_TYPE = Int

public typealias BATTERY_QUERY_INFORMATION_LEVEL = Int

public typealias BATTERY_SET_INFORMATION_LEVEL = Int

public typealias DEVICE_POWER_CAPABILITIES = UInt

public typealias DEVICE_POWER_STATE = Int

public typealias EFFECTIVE_POWER_MODE = Int

public fun interface EFFECTIVE_POWER_MODE_CALLBACKFn {
    public operator fun invoke(mode: EFFECTIVE_POWER_MODE, context: Long)
}

public typealias EFFECTIVE_POWER_MODE_CALLBACK = EFFECTIVE_POWER_MODE_CALLBACKFn?

public typealias EMI_MEASUREMENT_UNIT = Int

public typealias EXECUTION_STATE = UInt

public typealias HPOWERNOTIFY = Long

public typealias LATENCY_TIME = Int

public fun interface PDEVICE_NOTIFY_CALLBACK_ROUTINEFn {
    public operator fun invoke(context: Long, type: UInt, setting: Long): UInt
}

public typealias PDEVICE_NOTIFY_CALLBACK_ROUTINE = PDEVICE_NOTIFY_CALLBACK_ROUTINEFn?

public typealias POWER_ACTION = Int

public typealias POWER_ACTION_POLICY_EVENT_CODE = UInt

public typealias POWER_COOLING_MODE = UShort

public typealias POWER_DATA_ACCESSOR = Int

public typealias POWER_INFORMATION_LEVEL = Int

public typealias POWER_MONITOR_REQUEST_REASON = Int

public typealias POWER_MONITOR_REQUEST_TYPE = Int

public typealias POWER_PLATFORM_ROLE = Int

public typealias POWER_PLATFORM_ROLE_VERSION = UInt

public typealias POWER_REQUEST_TYPE = Int

public typealias POWER_SETTING_ALTITUDE = Int

public typealias POWER_USER_PRESENCE_TYPE = Int

public fun interface PWRSCHEMESENUMPROCFn {
    public operator fun invoke(index: UInt, namesize: UInt, name: PCWSTR, descriptionsize: UInt, description: PCWSTR, policy: Long, context: Foundation.LPARAM): Boolean
}

public typealias PWRSCHEMESENUMPROC = PWRSCHEMESENUMPROCFn?

public fun interface PWRSCHEMESENUMPROC_V1Fn {
    public operator fun invoke(index: UInt, namesize: UInt, name: Long, descriptionsize: UInt, description: Long, policy: Long, context: Foundation.LPARAM): Boolean
}

public typealias PWRSCHEMESENUMPROC_V1 = PWRSCHEMESENUMPROC_V1Fn?

public typealias SYSTEM_POWER_CONDITION = Int

public typealias SYSTEM_POWER_STATE = Int

public typealias USB_CHARGER_PORT = Int

public typealias USER_ACTIVITY_PRESENCE = Int
