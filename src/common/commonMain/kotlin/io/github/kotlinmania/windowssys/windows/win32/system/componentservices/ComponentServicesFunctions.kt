package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT

public fun CoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("comsvcs.dll", "CoCreateActivity", longArrayOf(piunknown, riid, ppobj)).toInt()
}

public fun CoEnterServiceDomain(pconfigobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("comsvcs.dll", "CoEnterServiceDomain", longArrayOf(pconfigobject)).toInt()
}

public fun CoGetDefaultContext(apttype: Com.APTTYPE, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetDefaultContext", longArrayOf(Win32DynamicFfi.objectSlot(apttype), riid, ppv)).toInt()
}

public fun CoLeaveServiceDomain(punkstatus: Long) {
    Win32DynamicFfi.invoke("comsvcs.dll", "CoLeaveServiceDomain", longArrayOf(punkstatus))
}

public fun GetDispenserManager(param0: Long): HRESULT {
    return Win32DynamicFfi.invoke("mtxdm.dll", "GetDispenserManager", longArrayOf(param0)).toInt()
}

public fun GetManagedExtensions(dwexts: Long): HRESULT {
    return Win32DynamicFfi.invoke("comsvcs.dll", "GetManagedExtensions", longArrayOf(dwexts)).toInt()
}

public fun MTSCreateActivity(riid: Long, ppobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("comsvcs.dll", "MTSCreateActivity", longArrayOf(riid, ppobj)).toInt()
}

public fun RecycleSurrogate(lreasoncode: Int): HRESULT {
    return Win32DynamicFfi.invoke("comsvcs.dll", "RecycleSurrogate", longArrayOf(lreasoncode.toLong())).toInt()
}

public fun SafeRef(rid: Long, punk: Long): Long {
    return Win32DynamicFfi.invoke("comsvcs.dll", "SafeRef", longArrayOf(rid, punk))
}
