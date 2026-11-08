package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

public fun VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("vhfum.dll", "VhfAsyncOperationComplete", longArrayOf(vhfoperationhandle, completionstatus.toLong())).toInt()
}

public fun VhfCreate(vhfconfig: Long, vhfhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("vhfum.dll", "VhfCreate", longArrayOf(vhfconfig, vhfhandle)).toInt()
}

public fun VhfDelete(vhfhandle: Long, wait: Boolean) {
    Win32DynamicFfi.invoke("vhfum.dll", "VhfDelete", longArrayOf(vhfhandle, if (wait) 1L else 0L))
}

public fun VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("vhfum.dll", "VhfReadReportSubmit", longArrayOf(vhfhandle, hidtransferpacket)).toInt()
}

public fun VhfStart(vhfhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("vhfum.dll", "VhfStart", longArrayOf(vhfhandle)).toInt()
}
