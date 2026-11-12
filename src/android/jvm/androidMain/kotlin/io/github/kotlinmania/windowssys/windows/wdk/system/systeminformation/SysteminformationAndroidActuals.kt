@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkSystemSysteminformationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int
}

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(systeminformationclass, systeminformation.rawAddress, systeminformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(systemtime.rawAddress)

public actual fun ntQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(maximumtime.rawAddress, minimumtime.rawAddress, currenttime.rawAddress)

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(systeminformationclass, systeminformation.rawAddress, systeminformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(systemtime.rawAddress)

public actual fun zwQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(maximumtime.rawAddress, minimumtime.rawAddress, currenttime.rawAddress)
