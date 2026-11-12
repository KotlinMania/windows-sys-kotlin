@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkDevicesHumaninterfacedeviceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(vhfconfig: Long, vhfhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(vhfhandle: Long, wait: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(vhfhandle: Long): Int
}

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr, completionstatus: Ntstatus): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(vhfoperationhandle.rawAddress, completionstatus)

public actual fun vhfCreate(vhfconfig: ConstPtr, vhfhandle: MutPtr): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(vhfconfig.rawAddress, vhfhandle.rawAddress)

public actual fun vhfDelete(vhfhandle: ConstPtr, wait: Boolean) {
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(vhfhandle.rawAddress, wait)
}

public actual fun vhfReadReportSubmit(vhfhandle: ConstPtr, hidtransferpacket: ConstPtr): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(vhfhandle.rawAddress, hidtransferpacket.rawAddress)

public actual fun vhfStart(vhfhandle: ConstPtr): Ntstatus =
    WindowsWdkDevicesHumaninterfacedeviceJniBridge.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(vhfhandle.rawAddress)
