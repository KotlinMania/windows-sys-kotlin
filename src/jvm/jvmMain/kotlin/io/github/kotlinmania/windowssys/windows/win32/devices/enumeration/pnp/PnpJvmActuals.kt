@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32DevicesEnumerationPnpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDeviceClose(hswdevice: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDeviceCreate(pszenumeratorname: Long, pszparentdeviceinstance: Long, pcreateinfo: Long, cpropertycount: Int, pproperties: Long, pcallback: Long, pcontext: Long, phswdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDeviceGetLifetime(hswdevice: Long, plifetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfacePropertySet(hswdevice: Long, pszdeviceinterfaceid: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceRegister(hswdevice: Long, pinterfaceclassguid: Long, pszreferencestring: Long, cpropertycount: Int, pproperties: Long, fenabled: Int, ppszdeviceinterfaceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceSetState(hswdevice: Long, pszdeviceinterfaceid: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDevicePropertySet(hswdevice: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwDeviceSetLifetime(hswdevice: Long, lifetime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_SwMemFree(pmem: Long)
}

public actual fun SwDeviceClose(hswdevice: HSWDEVICE) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceClose(hswdevice)
}

public actual fun SwDeviceCreate(pszenumeratorname: PCWSTR, pszparentdeviceinstance: PCWSTR, pcreateinfo: Long, cpropertycount: UInt, pproperties: Long, pcallback: SW_DEVICE_CREATE_CALLBACK, pcontext: Long, phswdevice: Long): HRESULT =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceCreate(pszenumeratorname, pszparentdeviceinstance, pcreateinfo, cpropertycount.toInt(), pproperties, pcallback.toLong(), pcontext, phswdevice)

public actual fun SwDeviceGetLifetime(hswdevice: HSWDEVICE, plifetime: Long): HRESULT =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceGetLifetime(hswdevice, plifetime)

public actual fun SwDeviceInterfacePropertySet(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, cpropertycount: UInt, pproperties: Long): HRESULT =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfacePropertySet(hswdevice, pszdeviceinterfaceid, cpropertycount.toInt(), pproperties)

public actual fun SwDeviceInterfaceRegister(hswdevice: HSWDEVICE, pinterfaceclassguid: Long, pszreferencestring: PCWSTR, cpropertycount: UInt, pproperties: Long, fenabled: BOOL, ppszdeviceinterfaceid: Long): HRESULT =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceRegister(hswdevice, pinterfaceclassguid, pszreferencestring, cpropertycount.toInt(), pproperties, fenabled, ppszdeviceinterfaceid)

public actual fun SwDeviceInterfaceSetState(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, fenabled: BOOL): HRESULT =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceSetState(hswdevice, pszdeviceinterfaceid, fenabled)

public actual fun SwDevicePropertySet(hswdevice: HSWDEVICE, cpropertycount: UInt, pproperties: Long): HRESULT =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDevicePropertySet(hswdevice, cpropertycount.toInt(), pproperties)

public actual fun SwDeviceSetLifetime(hswdevice: HSWDEVICE, lifetime: SW_DEVICE_LIFETIME): HRESULT =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceSetLifetime(hswdevice, lifetime)

public actual fun SwMemFree(pmem: Long) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_SwMemFree(pmem)
}
