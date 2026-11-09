@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.system.com.APTTYPE

private object WindowsWin32SystemComponentservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_CoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_CoEnterServiceDomain(pconfigobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_CoGetDefaultContext(apttype: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_CoLeaveServiceDomain(punkstatus: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_GetDispenserManager(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_GetManagedExtensions(dwexts: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_MTSCreateActivity(riid: Long, ppobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_RecycleSurrogate(lreasoncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_componentservices_SafeRef(rid: Long, punk: Long): Long
}

public actual fun CoCreateActivity(piunknown: Long, riid: Long, ppobj: Long): HRESULT =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_CoCreateActivity(piunknown, riid, ppobj)

public actual fun CoEnterServiceDomain(pconfigobject: Long): HRESULT =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_CoEnterServiceDomain(pconfigobject)

public actual fun CoGetDefaultContext(apttype: APTTYPE, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_CoGetDefaultContext(apttype, riid, ppv)

public actual fun CoLeaveServiceDomain(punkstatus: Long) {
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_CoLeaveServiceDomain(punkstatus)
}

public actual fun GetDispenserManager(param0: Long): HRESULT =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_GetDispenserManager(param0)

public actual fun GetManagedExtensions(dwexts: Long): HRESULT =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_GetManagedExtensions(dwexts)

public actual fun MTSCreateActivity(riid: Long, ppobj: Long): HRESULT =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_MTSCreateActivity(riid, ppobj)

public actual fun RecycleSurrogate(lreasoncode: Int): HRESULT =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_RecycleSurrogate(lreasoncode)

public actual fun SafeRef(rid: Long, punk: Long): Long =
    WindowsWin32SystemComponentservicesJniBridge.windowssys_windows_win32_system_componentservices_SafeRef(rid, punk)
