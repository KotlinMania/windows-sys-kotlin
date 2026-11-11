@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDeviceClose
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDeviceCreate
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDeviceGetLifetime
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfacePropertySet
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceRegister
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceSetState
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDevicePropertySet
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swDeviceSetLifetime
import io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_swMemFree
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    windowssys_windows_win32_devices_enumeration_pnp_swDeviceClose(hswdevice?.value?.toCPointer<ByteVar>())
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: COpaquePointer?, cpropertycount: UInt, pproperties: COpaquePointer?, pcallback: SwDeviceCreateCallback, pcontext: COpaquePointer?, phswdevice: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_enumeration_pnp_swDeviceCreate(pszenumeratorname?.value?.toCPointer<ByteVar>(), pszparentdeviceinstance?.value?.toCPointer<ByteVar>(), pcreateinfo?.value?.toCPointer<ByteVar>(), cpropertycount, pproperties?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>(), phswdevice?.value?.toCPointer<ByteVar>())

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_enumeration_pnp_swDeviceGetLifetime(hswdevice?.value?.toCPointer<ByteVar>(), plifetime?.value?.toCPointer<ByteVar>())

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfacePropertySet(hswdevice?.value?.toCPointer<ByteVar>(), pszdeviceinterfaceid?.value?.toCPointer<ByteVar>(), cpropertycount, pproperties?.value?.toCPointer<ByteVar>())

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: COpaquePointer?, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: COpaquePointer?, fenabled: Bool, ppszdeviceinterfaceid: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceRegister(hswdevice?.value?.toCPointer<ByteVar>(), pinterfaceclassguid?.value?.toCPointer<ByteVar>(), pszreferencestring?.value?.toCPointer<ByteVar>(), cpropertycount, pproperties?.value?.toCPointer<ByteVar>(), fenabled, ppszdeviceinterfaceid?.value?.toCPointer<ByteVar>())

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    windowssys_windows_win32_devices_enumeration_pnp_swDeviceInterfaceSetState(hswdevice?.value?.toCPointer<ByteVar>(), pszdeviceinterfaceid?.value?.toCPointer<ByteVar>(), fenabled)

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_enumeration_pnp_swDevicePropertySet(hswdevice?.value?.toCPointer<ByteVar>(), cpropertycount, pproperties?.value?.toCPointer<ByteVar>())

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    windowssys_windows_win32_devices_enumeration_pnp_swDeviceSetLifetime(hswdevice?.value?.toCPointer<ByteVar>(), lifetime)

public actual fun swMemFree(pmem: COpaquePointer?) {
    windowssys_windows_win32_devices_enumeration_pnp_swMemFree(pmem?.value?.toCPointer<ByteVar>())
}
