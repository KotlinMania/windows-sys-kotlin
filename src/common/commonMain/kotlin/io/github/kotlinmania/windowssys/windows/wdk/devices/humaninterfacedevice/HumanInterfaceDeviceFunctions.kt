package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun VhfAsyncOperationComplete(vhfoperationhandle: Long, completionstatus: Win32.Foundation.NTSTATUS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("vhfum.dll", "VhfAsyncOperationComplete", longArrayOf(vhfoperationhandle, Win32DynamicFfi.objectSlot(completionstatus)))
    return Win32.Foundation.NTSTATUS()
}

public fun VhfCreate(vhfconfig: Long, vhfhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("vhfum.dll", "VhfCreate", longArrayOf(vhfconfig, vhfhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun VhfDelete(vhfhandle: Long, wait: Boolean) {
    Win32DynamicFfi.invoke("vhfum.dll", "VhfDelete", longArrayOf(vhfhandle, if (wait) 1L else 0L))
}

public fun VhfReadReportSubmit(vhfhandle: Long, hidtransferpacket: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("vhfum.dll", "VhfReadReportSubmit", longArrayOf(vhfhandle, hidtransferpacket))
    return Win32.Foundation.NTSTATUS()
}

public fun VhfStart(vhfhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("vhfum.dll", "VhfStart", longArrayOf(vhfhandle))
    return Win32.Foundation.NTSTATUS()
}
