@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: COpaquePointer?, completionstatus: Ntstatus): Ntstatus =
    windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete(vhfoperationhandle?.value?.toCPointer<ByteVar>(), completionstatus)

public actual fun vhfCreate(vhfconfig: COpaquePointer?, vhfhandle: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate(vhfconfig?.value?.toCPointer<ByteVar>(), vhfhandle?.value?.toCPointer<ByteVar>())

public actual fun vhfDelete(vhfhandle: COpaquePointer?, wait: Boolean) {
    windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete(vhfhandle?.value?.toCPointer<ByteVar>(), wait)
}

public actual fun vhfReadReportSubmit(vhfhandle: COpaquePointer?, hidtransferpacket: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit(vhfhandle?.value?.toCPointer<ByteVar>(), hidtransferpacket?.value?.toCPointer<ByteVar>())

public actual fun vhfStart(vhfhandle: COpaquePointer?): Ntstatus =
    windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart(vhfhandle?.value?.toCPointer<ByteVar>())
