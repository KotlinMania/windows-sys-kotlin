@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(systeminformationclass, systeminformation.rawAddress.toCPointer<ByteVar>(), systeminformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus =
    windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(systemtime.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(maximumtime.rawAddress.toCPointer<ByteVar>(), minimumtime.rawAddress.toCPointer<ByteVar>(), currenttime.rawAddress.toCPointer<ByteVar>())

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(systeminformationclass, systeminformation.rawAddress.toCPointer<ByteVar>(), systeminformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus =
    windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(systemtime.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(maximumtime.rawAddress.toCPointer<ByteVar>(), minimumtime.rawAddress.toCPointer<ByteVar>(), currenttime.rawAddress.toCPointer<ByteVar>())
