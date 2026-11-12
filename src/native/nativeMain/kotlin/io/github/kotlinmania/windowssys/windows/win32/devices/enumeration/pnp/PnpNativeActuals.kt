@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssysWindowsWin32DevicesEnumerationPnpSwMemFree
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(hswdevice.rawAddress.toCPointer<ByteVar>())
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: ConstPtr, cpropertycount: UInt, pproperties: ConstPtr, pcallback: SwDeviceCreateCallback, pcontext: ConstPtr, phswdevice: MutPtr): Hresult =
    windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(pszenumeratorname.rawAddress.toCPointer<ByteVar>(), pszparentdeviceinstance.rawAddress.toCPointer<ByteVar>(), pcreateinfo.rawAddress.toCPointer<ByteVar>(), cpropertycount, pproperties.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>(), phswdevice.rawAddress.toCPointer<ByteVar>())

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: MutPtr): Hresult =
    windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(hswdevice.rawAddress.toCPointer<ByteVar>(), plifetime.rawAddress.toCPointer<ByteVar>())

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr): Hresult =
    windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(hswdevice.rawAddress.toCPointer<ByteVar>(), pszdeviceinterfaceid.rawAddress.toCPointer<ByteVar>(), cpropertycount, pproperties.rawAddress.toCPointer<ByteVar>())

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: ConstPtr, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr, fenabled: Bool, ppszdeviceinterfaceid: MutPtr): Hresult =
    windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(hswdevice.rawAddress.toCPointer<ByteVar>(), pinterfaceclassguid.rawAddress.toCPointer<ByteVar>(), pszreferencestring.rawAddress.toCPointer<ByteVar>(), cpropertycount, pproperties.rawAddress.toCPointer<ByteVar>(), fenabled, ppszdeviceinterfaceid.rawAddress.toCPointer<ByteVar>())

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(hswdevice.rawAddress.toCPointer<ByteVar>(), pszdeviceinterfaceid.rawAddress.toCPointer<ByteVar>(), fenabled)

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: ConstPtr): Hresult =
    windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(hswdevice.rawAddress.toCPointer<ByteVar>(), cpropertycount, pproperties.rawAddress.toCPointer<ByteVar>())

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(hswdevice.rawAddress.toCPointer<ByteVar>(), lifetime)

public actual fun swMemFree(pmem: ConstPtr) {
    windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(pmem.rawAddress.toCPointer<ByteVar>())
}
