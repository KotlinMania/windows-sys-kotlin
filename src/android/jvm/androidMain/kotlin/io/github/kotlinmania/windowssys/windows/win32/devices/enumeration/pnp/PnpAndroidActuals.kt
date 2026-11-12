@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32DevicesEnumerationPnpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(hswdevice: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(pszenumeratorname: Long, pszparentdeviceinstance: Long, pcreateinfo: Long, cpropertycount: Int, pproperties: Long, pcallback: Long, pcontext: Long, phswdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(hswdevice: Long, plifetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(hswdevice: Long, pszdeviceinterfaceid: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(hswdevice: Long, pinterfaceclassguid: Long, pszreferencestring: Long, cpropertycount: Int, pproperties: Long, fenabled: Int, ppszdeviceinterfaceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(hswdevice: Long, pszdeviceinterfaceid: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(hswdevice: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(hswdevice: Long, lifetime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(pmem: Long)
}

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(hswdevice.rawAddress)
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: ConstPtr, cpropertycount: UInt, pproperties: ConstPtr, pcallback: SwDeviceCreateCallback, pcontext: ConstPtr, phswdevice: MutPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(pszenumeratorname.rawAddress, pszparentdeviceinstance.rawAddress, pcreateinfo.rawAddress, cpropertycount.toInt(), pproperties.rawAddress, 0L, pcontext.rawAddress, phswdevice.rawAddress)

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: MutPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(hswdevice.rawAddress, plifetime.rawAddress)

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(hswdevice.rawAddress, pszdeviceinterfaceid.rawAddress, cpropertycount.toInt(), pproperties.rawAddress)

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: ConstPtr, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr, fenabled: Bool, ppszdeviceinterfaceid: MutPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(hswdevice.rawAddress, pinterfaceclassguid.rawAddress, pszreferencestring.rawAddress, cpropertycount.toInt(), pproperties.rawAddress, fenabled, ppszdeviceinterfaceid.rawAddress)

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(hswdevice.rawAddress, pszdeviceinterfaceid.rawAddress, fenabled)

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: ConstPtr): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(hswdevice.rawAddress, cpropertycount.toInt(), pproperties.rawAddress)

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(hswdevice.rawAddress, lifetime)

public actual fun swMemFree(pmem: ConstPtr) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(pmem.rawAddress)
}
