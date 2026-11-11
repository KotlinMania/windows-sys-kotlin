@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_coCreateActivity
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_coEnterServiceDomain
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_coGetDefaultContext
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_coLeaveServiceDomain
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_getDispenserManager
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_getManagedExtensions
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_mTSCreateActivity
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_recycleSurrogate
import io.github.kotlinmania.windowssys.windows.win32.system.componentservices.cinterop.windowssys_windows_win32_system_componentservices_safeRef
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun coCreateActivity(piunknown: COpaquePointer?, riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_componentservices_coCreateActivity(piunknown?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppobj?.value?.toCPointer<ByteVar>())

public actual fun coEnterServiceDomain(pconfigobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_componentservices_coEnterServiceDomain(pconfigobject?.value?.toCPointer<ByteVar>())

public actual fun coGetDefaultContext(apttype: Apttype, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_componentservices_coGetDefaultContext(apttype, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun coLeaveServiceDomain(punkstatus: COpaquePointer?) {
    windowssys_windows_win32_system_componentservices_coLeaveServiceDomain(punkstatus?.value?.toCPointer<ByteVar>())
}

public actual fun getDispenserManager(param0: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_componentservices_getDispenserManager(param0?.value?.toCPointer<ByteVar>())

public actual fun getManagedExtensions(dwexts: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_componentservices_getManagedExtensions(dwexts?.value?.toCPointer<ByteVar>())

public actual fun mTSCreateActivity(riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_componentservices_mTSCreateActivity(riid?.value?.toCPointer<ByteVar>(), ppobj?.value?.toCPointer<ByteVar>())

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    windowssys_windows_win32_system_componentservices_recycleSurrogate(lreasoncode)

public actual fun safeRef(rid: COpaquePointer?, punk: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_componentservices_safeRef(rid?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }
