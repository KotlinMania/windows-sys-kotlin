package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun swDeviceClose(hswdevice: Hswdevice)

public expect fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: ConstPtr, cpropertycount: UInt, pproperties: ConstPtr, pcallback: SwDeviceCreateCallback, pcontext: ConstPtr, phswdevice: MutPtr): Hresult

public expect fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: MutPtr): Hresult

public expect fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr): Hresult

public expect fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: ConstPtr, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr, fenabled: Bool, ppszdeviceinterfaceid: MutPtr): Hresult

public expect fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult

public expect fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: ConstPtr): Hresult

public expect fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult

public expect fun swMemFree(pmem: ConstPtr)
