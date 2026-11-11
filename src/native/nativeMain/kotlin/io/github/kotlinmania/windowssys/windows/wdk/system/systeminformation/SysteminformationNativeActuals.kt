@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime
import io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation.cinterop.windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(systeminformationclass, systeminformation?.value?.toCPointer<ByteVar>(), systeminformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun ntQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime(systemtime?.value?.toCPointer<ByteVar>())

public actual fun ntQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution(maximumtime?.value?.toCPointer<ByteVar>(), minimumtime?.value?.toCPointer<ByteVar>(), currenttime?.value?.toCPointer<ByteVar>())

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(systeminformationclass, systeminformation?.value?.toCPointer<ByteVar>(), systeminformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun zwQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime(systemtime?.value?.toCPointer<ByteVar>())

public actual fun zwQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution(maximumtime?.value?.toCPointer<ByteVar>(), minimumtime?.value?.toCPointer<ByteVar>(), currenttime?.value?.toCPointer<ByteVar>())
