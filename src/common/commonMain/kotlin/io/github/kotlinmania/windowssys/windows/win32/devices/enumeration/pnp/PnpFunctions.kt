package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun SwDeviceClose(hswdevice: HSWDEVICE)

public expect fun SwDeviceCreate(pszenumeratorname: PCWSTR, pszparentdeviceinstance: PCWSTR, pcreateinfo: Long, cpropertycount: UInt, pproperties: Long, pcallback: SW_DEVICE_CREATE_CALLBACK, pcontext: Long, phswdevice: Long): HRESULT

public expect fun SwDeviceGetLifetime(hswdevice: HSWDEVICE, plifetime: Long): HRESULT

public expect fun SwDeviceInterfacePropertySet(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, cpropertycount: UInt, pproperties: Long): HRESULT

public expect fun SwDeviceInterfaceRegister(hswdevice: HSWDEVICE, pinterfaceclassguid: Long, pszreferencestring: PCWSTR, cpropertycount: UInt, pproperties: Long, fenabled: BOOL, ppszdeviceinterfaceid: Long): HRESULT

public expect fun SwDeviceInterfaceSetState(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, fenabled: BOOL): HRESULT

public expect fun SwDevicePropertySet(hswdevice: HSWDEVICE, cpropertycount: UInt, pproperties: Long): HRESULT

public expect fun SwDeviceSetLifetime(hswdevice: HSWDEVICE, lifetime: SW_DEVICE_LIFETIME): HRESULT

public expect fun SwMemFree(pmem: Long)
