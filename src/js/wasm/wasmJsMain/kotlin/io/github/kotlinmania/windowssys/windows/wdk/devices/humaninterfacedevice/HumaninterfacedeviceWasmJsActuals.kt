@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public actual fun VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: NTSTATUS): NTSTATUS =
    0

public actual fun VhfCreate(vhfconfig: Long, vhfhandle: Long): NTSTATUS =
    0

public actual fun VhfDelete(vhfhandle: Long, wait: Boolean) {
}

public actual fun VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): NTSTATUS =
    0

public actual fun VhfStart(vhfhandle: Long): NTSTATUS =
    0
