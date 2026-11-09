@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: NTSTATUS): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_VhfAsyncOperationComplete(vhfoperationhandle.toCPointer<ByteVar>(), completionstatus)

public actual fun VhfCreate(vhfconfig: Long, vhfhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_VhfCreate(vhfconfig.toCPointer<ByteVar>(), vhfhandle.toCPointer<ByteVar>())

public actual fun VhfDelete(vhfhandle: Long, wait: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_VhfDelete(vhfhandle.toCPointer<ByteVar>(), wait)
}

public actual fun VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_VhfReadReportSubmit(vhfhandle.toCPointer<ByteVar>(), hidtransferpacket.toCPointer<ByteVar>())

public actual fun VhfStart(vhfhandle: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_VhfStart(vhfhandle.toCPointer<ByteVar>())
