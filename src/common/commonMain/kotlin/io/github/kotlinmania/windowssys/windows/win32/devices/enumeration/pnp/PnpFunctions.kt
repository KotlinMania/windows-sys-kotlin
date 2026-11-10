package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun swDeviceClose(hswdevice: Hswdevice)

public expect fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: COpaquePointer?, cpropertycount: UInt, pproperties: COpaquePointer?, pcallback: SwDeviceCreateCallback, pcontext: COpaquePointer?, phswdevice: COpaquePointer?): Hresult

public expect fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: COpaquePointer?): Hresult

public expect fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult

public expect fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: COpaquePointer?, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?, fenabled: Bool, ppszdeviceinterfaceid: COpaquePointer?): Hresult

public expect fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult

public expect fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult

public expect fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult

public expect fun swMemFree(pmem: COpaquePointer?)
