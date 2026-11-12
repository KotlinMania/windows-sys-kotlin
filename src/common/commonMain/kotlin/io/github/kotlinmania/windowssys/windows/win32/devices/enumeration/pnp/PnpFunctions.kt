package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty

public expect fun swDeviceClose(hswdevice: Hswdevice)

public expect fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: ConstPtr<SwDeviceCreateInfo>, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>, pcallback: SwDeviceCreateCallback, pcontext: ConstPtr<CVoid>, phswdevice: MutPtr<Hswdevice>): Hresult

public expect fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: MutPtr<SwDeviceLifetime>): Hresult

public expect fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>): Hresult

public expect fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: ConstPtr<Guid>, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>, fenabled: Bool, ppszdeviceinterfaceid: MutPtr<Pwstr>): Hresult

public expect fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult

public expect fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>): Hresult

public expect fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult

public expect fun swMemFree(pmem: ConstPtr<CVoid>)
