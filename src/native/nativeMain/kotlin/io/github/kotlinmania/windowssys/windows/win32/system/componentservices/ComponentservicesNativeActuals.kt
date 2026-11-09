@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.com.APTTYPE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_CoCreateActivity(piunknown.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppobj.toCPointer<ByteVar>())

public actual fun CoEnterServiceDomain(pconfigobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_CoEnterServiceDomain(pconfigobject.toCPointer<ByteVar>())

public actual fun CoGetDefaultContext(apttype: APTTYPE, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_CoGetDefaultContext(apttype, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CoLeaveServiceDomain(punkstatus: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_CoLeaveServiceDomain(punkstatus.toCPointer<ByteVar>())
}

public actual fun GetDispenserManager(param0: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_GetDispenserManager(param0.toCPointer<ByteVar>())

public actual fun GetManagedExtensions(dwexts: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_GetManagedExtensions(dwexts.toCPointer<ByteVar>())

public actual fun MTSCreateActivity(riid: Long, ppobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_MTSCreateActivity(riid.toCPointer<ByteVar>(), ppobj.toCPointer<ByteVar>())

public actual fun RecycleSurrogate(lreasoncode: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_RecycleSurrogate(lreasoncode)

public actual fun SafeRef(rid: Long, punk: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_SafeRef(rid.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>())?.toLong() ?: 0L
