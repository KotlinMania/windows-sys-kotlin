@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit
import io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice.cinterop.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr<CVoid>, completionstatus: Ntstatus): Ntstatus =
    windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(vhfoperationhandle.rawAddress.toCPointer<ByteVar>(), completionstatus)

public actual fun vhfCreate(vhfconfig: ConstPtr<VhfConfig>, vhfhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(vhfconfig.rawAddress.toCPointer<ByteVar>(), vhfhandle.rawAddress.toCPointer<ByteVar>())

public actual fun vhfDelete(vhfhandle: ConstPtr<CVoid>, wait: Boolean) {
    windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(vhfhandle.rawAddress.toCPointer<ByteVar>(), wait)
}

public actual fun vhfReadReportSubmit(vhfhandle: ConstPtr<CVoid>, hidtransferpacket: ConstPtr<HidXferPacket>): Ntstatus =
    windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(vhfhandle.rawAddress.toCPointer<ByteVar>(), hidtransferpacket.rawAddress.toCPointer<ByteVar>())

public actual fun vhfStart(vhfhandle: ConstPtr<CVoid>): Ntstatus =
    windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(vhfhandle.rawAddress.toCPointer<ByteVar>())
