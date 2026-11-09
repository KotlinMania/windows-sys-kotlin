@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NtQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_NtQuerySystemInformation(systeminformationclass, systeminformation.toCPointer<ByteVar>(), systeminformationlength, returnlength.toCPointer<ByteVar>())

public actual fun NtQuerySystemTime(systemtime: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_NtQuerySystemTime(systemtime.toCPointer<ByteVar>())

public actual fun NtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_NtQueryTimerResolution(maximumtime.toCPointer<ByteVar>(), minimumtime.toCPointer<ByteVar>(), currenttime.toCPointer<ByteVar>())

public actual fun ZwQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_ZwQuerySystemInformation(systeminformationclass, systeminformation.toCPointer<ByteVar>(), systeminformationlength, returnlength.toCPointer<ByteVar>())

public actual fun ZwQuerySystemTime(systemtime: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_ZwQuerySystemTime(systemtime.toCPointer<ByteVar>())

public actual fun ZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_ZwQueryTimerResolution(maximumtime.toCPointer<ByteVar>(), minimumtime.toCPointer<ByteVar>(), currenttime.toCPointer<ByteVar>())
