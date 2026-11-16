package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr, completionstatus: Ntstatus): Ntstatus

public expect fun vhfCreate(vhfconfig: ConstPtr, vhfhandle: MutPtr): Ntstatus

public expect fun vhfDelete(vhfhandle: ConstPtr, wait: Boolean)

public expect fun vhfReadReportSubmit(vhfhandle: ConstPtr, hidtransferpacket: ConstPtr): Ntstatus

public expect fun vhfStart(vhfhandle: ConstPtr): Ntstatus
