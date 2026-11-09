@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun SwDeviceClose(hswdevice: HSWDEVICE) {
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceClose(hswdevice.toCPointer<ByteVar>())
}

public actual fun SwDeviceCreate(pszenumeratorname: PCWSTR, pszparentdeviceinstance: PCWSTR, pcreateinfo: Long, cpropertycount: UInt, pproperties: Long, pcallback: SW_DEVICE_CREATE_CALLBACK, pcontext: Long, phswdevice: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceCreate(pszenumeratorname.toCPointer<ByteVar>(), pszparentdeviceinstance.toCPointer<ByteVar>(), pcreateinfo.toCPointer<ByteVar>(), cpropertycount, pproperties.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), phswdevice.toCPointer<ByteVar>())

public actual fun SwDeviceGetLifetime(hswdevice: HSWDEVICE, plifetime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceGetLifetime(hswdevice.toCPointer<ByteVar>(), plifetime.toCPointer<ByteVar>())

public actual fun SwDeviceInterfacePropertySet(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, cpropertycount: UInt, pproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfacePropertySet(hswdevice.toCPointer<ByteVar>(), pszdeviceinterfaceid.toCPointer<ByteVar>(), cpropertycount, pproperties.toCPointer<ByteVar>())

public actual fun SwDeviceInterfaceRegister(hswdevice: HSWDEVICE, pinterfaceclassguid: Long, pszreferencestring: PCWSTR, cpropertycount: UInt, pproperties: Long, fenabled: BOOL, ppszdeviceinterfaceid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceRegister(hswdevice.toCPointer<ByteVar>(), pinterfaceclassguid.toCPointer<ByteVar>(), pszreferencestring.toCPointer<ByteVar>(), cpropertycount, pproperties.toCPointer<ByteVar>(), fenabled, ppszdeviceinterfaceid.toCPointer<ByteVar>())

public actual fun SwDeviceInterfaceSetState(hswdevice: HSWDEVICE, pszdeviceinterfaceid: PCWSTR, fenabled: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceSetState(hswdevice.toCPointer<ByteVar>(), pszdeviceinterfaceid.toCPointer<ByteVar>(), fenabled)

public actual fun SwDevicePropertySet(hswdevice: HSWDEVICE, cpropertycount: UInt, pproperties: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDevicePropertySet(hswdevice.toCPointer<ByteVar>(), cpropertycount, pproperties.toCPointer<ByteVar>())

public actual fun SwDeviceSetLifetime(hswdevice: HSWDEVICE, lifetime: SW_DEVICE_LIFETIME): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwDeviceSetLifetime(hswdevice.toCPointer<ByteVar>(), lifetime)

public actual fun SwMemFree(pmem: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp.cinterop.windowssys_windows_win32_devices_enumeration_pnp_SwMemFree(pmem.toCPointer<ByteVar>())
}
