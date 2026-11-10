@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32DevicesEnumerationPnpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDeviceClose(hswdevice: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDeviceCreate(pszenumeratorname: Long, pszparentdeviceinstance: Long, pcreateinfo: Long, cpropertycount: Int, pproperties: Long, pcallback: Long, pcontext: Long, phswdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDeviceGetLifetime(hswdevice: Long, plifetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfacePropertySet(hswdevice: Long, pszdeviceinterfaceid: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceRegister(hswdevice: Long, pinterfaceclassguid: Long, pszreferencestring: Long, cpropertycount: Int, pproperties: Long, fenabled: Int, ppszdeviceinterfaceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceSetState(hswdevice: Long, pszdeviceinterfaceid: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDevicePropertySet(hswdevice: Long, cpropertycount: Int, pproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swDeviceSetLifetime(hswdevice: Long, lifetime: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_enumeration_pnp_swMemFree(pmem: Long)
}

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDeviceClose((hswdevice?.value ?: 0L))
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: COpaquePointer?, cpropertycount: UInt, pproperties: COpaquePointer?, pcallback: SwDeviceCreateCallback, pcontext: COpaquePointer?, phswdevice: COpaquePointer?): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDeviceCreate((pszenumeratorname?.value ?: 0L), (pszparentdeviceinstance?.value ?: 0L), (pcreateinfo?.value ?: 0L), cpropertycount.toInt(), (pproperties?.value ?: 0L), 0L, (pcontext?.value ?: 0L), (phswdevice?.value ?: 0L))

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: COpaquePointer?): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDeviceGetLifetime((hswdevice?.value ?: 0L), (plifetime?.value ?: 0L))

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfacePropertySet((hswdevice?.value ?: 0L), (pszdeviceinterfaceid?.value ?: 0L), cpropertycount.toInt(), (pproperties?.value ?: 0L))

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: COpaquePointer?, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?, fenabled: Bool, ppszdeviceinterfaceid: COpaquePointer?): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceRegister((hswdevice?.value ?: 0L), (pinterfaceclassguid?.value ?: 0L), (pszreferencestring?.value ?: 0L), cpropertycount.toInt(), (pproperties?.value ?: 0L), fenabled, (ppszdeviceinterfaceid?.value ?: 0L))

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceSetState((hswdevice?.value ?: 0L), (pszdeviceinterfaceid?.value ?: 0L), fenabled)

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDevicePropertySet((hswdevice?.value ?: 0L), cpropertycount.toInt(), (pproperties?.value ?: 0L))

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swDeviceSetLifetime((hswdevice?.value ?: 0L), lifetime)

public actual fun swMemFree(pmem: COpaquePointer?) {
    WindowsWin32DevicesEnumerationPnpJniBridge.windowssys_windows_win32_devices_enumeration_pnp_swMemFree((pmem?.value ?: 0L))
}
