@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkSystemSysteminformationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int
}

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(systeminformationclass, (systeminformation?.value ?: 0L), systeminformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime((systemtime?.value ?: 0L))

public actual fun ntQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution((maximumtime?.value ?: 0L), (minimumtime?.value ?: 0L), (currenttime?.value ?: 0L))

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(systeminformationclass, (systeminformation?.value ?: 0L), systeminformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime((systemtime?.value ?: 0L))

public actual fun zwQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution((maximumtime?.value ?: 0L), (minimumtime?.value ?: 0L), (currenttime?.value ?: 0L))
