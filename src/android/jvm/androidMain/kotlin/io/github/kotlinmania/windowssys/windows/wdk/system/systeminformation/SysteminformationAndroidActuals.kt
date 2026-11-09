@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWdkSystemSysteminformationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_NtQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_NtQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_NtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_ZwQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_ZwQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_ZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int
}

public actual fun NtQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_NtQuerySystemInformation(systeminformationclass, systeminformation, systeminformationlength.toInt(), returnlength)

public actual fun NtQuerySystemTime(systemtime: Long): NTSTATUS =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_NtQuerySystemTime(systemtime)

public actual fun NtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_NtQueryTimerResolution(maximumtime, minimumtime, currenttime)

public actual fun ZwQuerySystemInformation(systeminformationclass: SYSTEM_INFORMATION_CLASS, systeminformation: Long, systeminformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_ZwQuerySystemInformation(systeminformationclass, systeminformation, systeminformationlength.toInt(), returnlength)

public actual fun ZwQuerySystemTime(systemtime: Long): NTSTATUS =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_ZwQuerySystemTime(systemtime)

public actual fun ZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): NTSTATUS =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_ZwQueryTimerResolution(maximumtime, minimumtime, currenttime)
