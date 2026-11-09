@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWdkDevicesHumaninterfacedeviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_VhfCreate(vhfconfig: Long, vhfhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_VhfDelete(vhfhandle: Long, wait: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_devices_humaninterfacedevice_VhfStart(vhfhandle: Long): Int
}

public actual fun VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: NTSTATUS): NTSTATUS =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_VhfAsyncOperationComplete(vhfoperationhandle, completionstatus)

public actual fun VhfCreate(vhfconfig: Long, vhfhandle: Long): NTSTATUS =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_VhfCreate(vhfconfig, vhfhandle)

public actual fun VhfDelete(vhfhandle: Long, wait: Boolean) {
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_VhfDelete(vhfhandle, wait)
}

public actual fun VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): NTSTATUS =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_VhfReadReportSubmit(vhfhandle, hidtransferpacket)

public actual fun VhfStart(vhfhandle: Long): NTSTATUS =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssys_windows_wdk_devices_humaninterfacedevice_VhfStart(vhfhandle)
