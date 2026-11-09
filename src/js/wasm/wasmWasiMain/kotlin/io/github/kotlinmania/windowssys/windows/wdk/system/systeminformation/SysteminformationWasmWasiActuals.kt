@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public actual fun NtQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun NtQuerySystemTime(systemtime: Long): NTSTATUS =
    0

public actual fun NtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    0

public actual fun ZwQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    0

public actual fun ZwQuerySystemTime(systemtime: Long): NTSTATUS =
    0

public actual fun ZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    0
