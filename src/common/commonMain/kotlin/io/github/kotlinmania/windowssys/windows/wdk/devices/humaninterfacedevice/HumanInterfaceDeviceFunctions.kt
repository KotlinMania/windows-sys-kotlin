package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun vhfAsyncOperationComplete(vhfoperationhandle: COpaquePointer?, completionstatus: Ntstatus): Ntstatus

public expect fun vhfCreate(vhfconfig: COpaquePointer?, vhfhandle: COpaquePointer?): Ntstatus

public expect fun vhfDelete(vhfhandle: COpaquePointer?, wait: Boolean)

public expect fun vhfReadReportSubmit(vhfhandle: COpaquePointer?, hidtransferpacket: COpaquePointer?): Ntstatus

public expect fun vhfStart(vhfhandle: COpaquePointer?): Ntstatus
