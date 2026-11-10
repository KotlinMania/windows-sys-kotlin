@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

private object WindowsWin32SystemComponentservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_coCreateActivity(piunknown: Long, riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_coEnterServiceDomain(pconfigobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_coGetDefaultContext(apttype: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_coLeaveServiceDomain(punkstatus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_getDispenserManager(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_getManagedExtensions(dwexts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_mTSCreateActivity(riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_recycleSurrogate(lreasoncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_safeRef(rid: Long, punk: Long): Long
}

public actual fun coCreateActivity(piunknown: COpaquePointer?, riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_coCreateActivity((piunknown?.value ?: 0L), (riid?.value ?: 0L), (ppobj?.value ?: 0L))

public actual fun coEnterServiceDomain(pconfigobject: COpaquePointer?): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_coEnterServiceDomain((pconfigobject?.value ?: 0L))

public actual fun coGetDefaultContext(apttype: Apttype, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_coGetDefaultContext(apttype, (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun coLeaveServiceDomain(punkstatus: COpaquePointer?) {
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_coLeaveServiceDomain((punkstatus?.value ?: 0L))
}

public actual fun getDispenserManager(param0: COpaquePointer?): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_getDispenserManager((param0?.value ?: 0L))

public actual fun getManagedExtensions(dwexts: COpaquePointer?): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_getManagedExtensions((dwexts?.value ?: 0L))

public actual fun mTSCreateActivity(riid: COpaquePointer?, ppobj: COpaquePointer?): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_mTSCreateActivity((riid?.value ?: 0L), (ppobj?.value ?: 0L))

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_recycleSurrogate(lreasoncode)

public actual fun safeRef(rid: COpaquePointer?, punk: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_safeRef((rid?.value ?: 0L), (punk?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }
