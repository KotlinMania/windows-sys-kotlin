package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public expect fun VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: NTSTATUS): NTSTATUS

public expect fun VhfCreate(vhfconfig: Long, vhfhandle: Long): NTSTATUS

public expect fun VhfDelete(vhfhandle: Long, wait: Boolean)

public expect fun VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): NTSTATUS

public expect fun VhfStart(vhfhandle: Long): NTSTATUS
