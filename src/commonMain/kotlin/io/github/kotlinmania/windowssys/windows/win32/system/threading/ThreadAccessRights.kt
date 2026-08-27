// port-lint: source windows-sys/src/Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

// Upstream thread access rights, thread creation flags, thread priority,
// and thread information class constants.

public const val THREAD_ALL_ACCESS: THREAD_ACCESS_RIGHTS = 2097151u
public const val THREAD_CREATE_RUN_IMMEDIATELY: THREAD_CREATION_FLAGS = 0u
public const val THREAD_CREATE_SUSPENDED: THREAD_CREATION_FLAGS = 4u
public const val THREAD_DELETE: THREAD_ACCESS_RIGHTS = 65536u
public const val THREAD_DIRECT_IMPERSONATION: THREAD_ACCESS_RIGHTS = 512u
public const val THREAD_GET_CONTEXT: THREAD_ACCESS_RIGHTS = 8u
public const val THREAD_IMPERSONATE: THREAD_ACCESS_RIGHTS = 256u
public const val THREAD_QUERY_INFORMATION: THREAD_ACCESS_RIGHTS = 64u
public const val THREAD_QUERY_LIMITED_INFORMATION: THREAD_ACCESS_RIGHTS = 2048u
public const val THREAD_READ_CONTROL: THREAD_ACCESS_RIGHTS = 131072u
public const val THREAD_RESUME: THREAD_ACCESS_RIGHTS = 4096u
public const val THREAD_SET_CONTEXT: THREAD_ACCESS_RIGHTS = 16u
public const val THREAD_SET_INFORMATION: THREAD_ACCESS_RIGHTS = 32u
public const val THREAD_SET_LIMITED_INFORMATION: THREAD_ACCESS_RIGHTS = 1024u
public const val THREAD_SET_THREAD_TOKEN: THREAD_ACCESS_RIGHTS = 128u
public const val THREAD_STANDARD_RIGHTS_REQUIRED: THREAD_ACCESS_RIGHTS = 983040u
public const val THREAD_SUSPEND_RESUME: THREAD_ACCESS_RIGHTS = 2u
public const val THREAD_SYNCHRONIZE: THREAD_ACCESS_RIGHTS = 1048576u
public const val THREAD_TERMINATE: THREAD_ACCESS_RIGHTS = 1u
public const val THREAD_WRITE_DAC: THREAD_ACCESS_RIGHTS = 262144u
public const val THREAD_WRITE_OWNER: THREAD_ACCESS_RIGHTS = 524288u

// THREAD_PRIORITY constants
public const val THREAD_PRIORITY_ABOVE_NORMAL: THREAD_PRIORITY = 1
public const val THREAD_PRIORITY_BELOW_NORMAL: THREAD_PRIORITY = -1
public const val THREAD_PRIORITY_HIGHEST: THREAD_PRIORITY = 2
public const val THREAD_PRIORITY_IDLE: THREAD_PRIORITY = -15
public const val THREAD_PRIORITY_LOWEST: THREAD_PRIORITY = -2
public const val THREAD_PRIORITY_MIN: THREAD_PRIORITY = -2
public const val THREAD_PRIORITY_NORMAL: THREAD_PRIORITY = 0
public const val THREAD_PRIORITY_TIME_CRITICAL: THREAD_PRIORITY = 15
public const val THREAD_MODE_BACKGROUND_BEGIN: THREAD_PRIORITY = 65536
public const val THREAD_MODE_BACKGROUND_END: THREAD_PRIORITY = 131072

// THREAD_INFORMATION_CLASS constants
public const val ThreadAbsoluteCpuPriority: THREAD_INFORMATION_CLASS = 1
public const val ThreadDynamicCodePolicy: THREAD_INFORMATION_CLASS = 2
public const val ThreadInformationClassMax: THREAD_INFORMATION_CLASS = 4
public const val ThreadMemoryPriority: THREAD_INFORMATION_CLASS = 0
public const val ThreadPowerThrottling: THREAD_INFORMATION_CLASS = 3

// THREAD_POWER_THROTTLING constants
public const val THREAD_POWER_THROTTLING_CURRENT_VERSION: UInt = 1u
public const val THREAD_POWER_THROTTLING_EXECUTION_SPEED: UInt = 1u
public const val THREAD_POWER_THROTTLING_VALID_FLAGS: UInt = 1u

// TP_CALLBACK_PRIORITY constants
public const val TP_CALLBACK_PRIORITY_COUNT: TP_CALLBACK_PRIORITY = 3
public const val TP_CALLBACK_PRIORITY_HIGH: TP_CALLBACK_PRIORITY = 0
public const val TP_CALLBACK_PRIORITY_INVALID: TP_CALLBACK_PRIORITY = 3
public const val TP_CALLBACK_PRIORITY_LOW: TP_CALLBACK_PRIORITY = 2
public const val TP_CALLBACK_PRIORITY_NORMAL: TP_CALLBACK_PRIORITY = 1

// UMS_THREAD_INFO_CLASS constants
public const val UmsThreadAffinity: UMS_THREAD_INFO_CLASS = 3
public const val UmsThreadInvalidInfoClass: UMS_THREAD_INFO_CLASS = 0
public const val UmsThreadIsSuspended: UMS_THREAD_INFO_CLASS = 5
public const val UmsThreadIsTerminated: UMS_THREAD_INFO_CLASS = 6
public const val UmsThreadMaxInfoClass: UMS_THREAD_INFO_CLASS = 7
public const val UmsThreadPriority: UMS_THREAD_INFO_CLASS = 2
public const val UmsThreadTeb: UMS_THREAD_INFO_CLASS = 4
public const val UmsThreadUserContext: UMS_THREAD_INFO_CLASS = 1

// MACHINE_ATTRIBUTES constants
public const val KernelEnabled: MACHINE_ATTRIBUTES = 2
public const val UserEnabled: MACHINE_ATTRIBUTES = 1
public const val Wow64Container: MACHINE_ATTRIBUTES = 4
