// port-lint: source windows-sys/src/Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

// Upstream process information class constants.

public const val ProcessAppMemoryInfo: PROCESS_INFORMATION_CLASS = 2
public const val ProcessInPrivateInfo: PROCESS_INFORMATION_CLASS = 3
public const val ProcessInformationClassMax: PROCESS_INFORMATION_CLASS = 12
public const val ProcessLeapSecondInfo: PROCESS_INFORMATION_CLASS = 8
public const val ProcessMachineTypeInfo: PROCESS_INFORMATION_CLASS = 9
public const val ProcessMaxOverridePrefetchParameter: PROCESS_INFORMATION_CLASS = 11
public const val ProcessMemoryExhaustionInfo: PROCESS_INFORMATION_CLASS = 1
public const val ProcessMemoryPriority: PROCESS_INFORMATION_CLASS = 0
public const val ProcessOverrideSubsequentPrefetchParameter: PROCESS_INFORMATION_CLASS = 10
public const val ProcessPowerThrottling: PROCESS_INFORMATION_CLASS = 4
public const val ProcessProtectionLevelInfo: PROCESS_INFORMATION_CLASS = 7
public const val ProcessReservedValue1: PROCESS_INFORMATION_CLASS = 5
public const val ProcessTelemetryCoverageInfo: PROCESS_INFORMATION_CLASS = 6

// PROCESS_MEMORY_EXHAUSTION_TYPE constants
public const val PMETypeFailFastOnCommitFailure: PROCESS_MEMORY_EXHAUSTION_TYPE = 0
public const val PMETypeMax: PROCESS_MEMORY_EXHAUSTION_TYPE = 1
public const val PME_CURRENT_VERSION: UInt = 1u
public const val PME_FAILFAST_ON_COMMIT_FAIL_DISABLE: UInt = 0u
public const val PME_FAILFAST_ON_COMMIT_FAIL_ENABLE: UInt = 1u

// PROCESS_LEAP_SECOND_INFO constants
public const val PROCESS_LEAP_SECOND_INFO_FLAG_ENABLE_SIXTY_SECOND: UInt = 1u
public const val PROCESS_LEAP_SECOND_INFO_VALID_FLAGS: UInt = 1u

// PROCESS_POWER_THROTTLING constants
public const val PROCESS_POWER_THROTTLING_CURRENT_VERSION: UInt = 1u
public const val PROCESS_POWER_THROTTLING_EXECUTION_SPEED: UInt = 1u
public const val PROCESS_POWER_THROTTLING_IGNORE_TIMER_RESOLUTION: UInt = 4u
