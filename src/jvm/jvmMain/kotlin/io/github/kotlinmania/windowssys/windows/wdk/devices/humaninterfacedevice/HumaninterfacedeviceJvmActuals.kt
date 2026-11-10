@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkDevicesHumaninterfacedeviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate(vhfconfig: Long, vhfhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete(vhfhandle: Long, wait: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart(vhfhandle: Long): Int
}

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: COpaquePointer?, completionstatus: Ntstatus): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete((vhfoperationhandle?.value ?: 0L), completionstatus)

public actual fun vhfCreate(vhfconfig: COpaquePointer?, vhfhandle: COpaquePointer?): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate((vhfconfig?.value ?: 0L), (vhfhandle?.value ?: 0L))

public actual fun vhfDelete(vhfhandle: COpaquePointer?, wait: Boolean) {
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete((vhfhandle?.value ?: 0L), wait)
}

public actual fun vhfReadReportSubmit(vhfhandle: COpaquePointer?, hidtransferpacket: COpaquePointer?): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit((vhfhandle?.value ?: 0L), (hidtransferpacket?.value ?: 0L))

public actual fun vhfStart(vhfhandle: COpaquePointer?): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart((vhfhandle?.value ?: 0L))
