package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(hswdevice: HSWDEVICE, createresult: HRESULT, pcontext: Long, pszdeviceinstanceid: PCWSTR)
}

public fun SwDeviceClose(hswdevice: HSWDEVICE) {
    Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDeviceClose", longArrayOf(hswdevice))
}

public fun SwDeviceCreate(pszenumeratorname: PCWSTR, pszparentdeviceinstance: PCWSTR, pcreateinfo: Long, cpropertycount: UInt, pproperties: Long, pcallback: SW_DEVICE_CREATE_CALLBACK, pcontext: Long, phswdevice: Long): HRESULT {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDeviceCreate", longArrayOf(pszenumeratorname, pszparentdeviceinstance, pcreateinfo, cpropertycount.toLong(), pproperties, Win32DynamicFfi.objectSlot(pcallback), pcontext, phswdevice)).toInt()
}

public fun SwDeviceGetLifetime(hswdevice: HSWDEVICE, plifetime: Long): HRESULT {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDeviceGetLifetime", longArrayOf(hswdevice, plifetime)).toInt()
}

public fun SwDeviceInterfacePropertySet(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, cpropertycount: UInt, pproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDeviceInterfacePropertySet", longArrayOf(hswdevice, pszdeviceinterfaceid, cpropertycount.toLong(), pproperties)).toInt()
}

public fun SwDeviceInterfaceRegister(hswdevice: HSWDEVICE, pinterfaceclassguid: Long, pszreferencestring: PCWSTR, cpropertycount: UInt, pproperties: Long, fenabled: BOOL, ppszdeviceinterfaceid: Long): HRESULT {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDeviceInterfaceRegister", longArrayOf(hswdevice, pinterfaceclassguid, pszreferencestring, cpropertycount.toLong(), pproperties, fenabled.toLong(), ppszdeviceinterfaceid)).toInt()
}

public fun SwDeviceInterfaceSetState(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, fenabled: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDeviceInterfaceSetState", longArrayOf(hswdevice, pszdeviceinterfaceid, fenabled.toLong())).toInt()
}

public fun SwDevicePropertySet(hswdevice: HSWDEVICE, cpropertycount: UInt, pproperties: Long): HRESULT {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDevicePropertySet", longArrayOf(hswdevice, cpropertycount.toLong(), pproperties)).toInt()
}

public fun SwDeviceSetLifetime(hswdevice: HSWDEVICE, lifetime: SW_DEVICE_LIFETIME): HRESULT {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "SwDeviceSetLifetime", longArrayOf(hswdevice, lifetime.toLong())).toInt()
}

public fun SwMemFree(pmem: Long) {
    Win32DynamicFfi.invoke("cfgmgr32.dll", "SwMemFree", longArrayOf(pmem))
}
