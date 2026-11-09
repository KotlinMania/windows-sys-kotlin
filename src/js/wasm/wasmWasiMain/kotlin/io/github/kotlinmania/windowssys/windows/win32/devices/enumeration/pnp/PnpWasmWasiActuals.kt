@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun SwDeviceClose(hswdevice: HSWDEVICE) {
}

public actual fun SwDeviceCreate(pszenumeratorname: PCWSTR, pszparentdeviceinstance: PCWSTR, pcreateinfo: Long, cpropertycount: UInt, pproperties: Long, pcallback: SW_DEVICE_CREATE_CALLBACK, pcontext: Long, phswdevice: Long): HRESULT =
    0

public actual fun SwDeviceGetLifetime(hswdevice: HSWDEVICE, plifetime: Long): HRESULT =
    0

public actual fun SwDeviceInterfacePropertySet(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, cpropertycount: UInt, pproperties: Long): HRESULT =
    0

public actual fun SwDeviceInterfaceRegister(hswdevice: HSWDEVICE, pinterfaceclassguid: Long, pszreferencestring: PCWSTR, cpropertycount: UInt, pproperties: Long, fenabled: BOOL, ppszdeviceinterfaceid: Long): HRESULT =
    0

public actual fun SwDeviceInterfaceSetState(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, fenabled: BOOL): HRESULT =
    0

public actual fun SwDevicePropertySet(hswdevice: HSWDEVICE, cpropertycount: UInt, pproperties: Long): HRESULT =
    0

public actual fun SwDeviceSetLifetime(hswdevice: HSWDEVICE, lifetime: SW_DEVICE_LIFETIME): HRESULT =
    0

public actual fun SwMemFree(pmem: Long) {
}
