@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage

private object WindowsWin32SecurityDirectoryservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDirectoryservicesDSCreateSecurityPage(pwszobjectpath: Long, pwszobjectclass: Long, dwflags: Int, phpage: Long, pfnreadsd: Long, pfnwritesd: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDirectoryservicesDSEditSecurity(hwndowner: Long, pwszobjectpath: Long, pwszobjectclass: Long, dwflags: Int, pwszcaption: Long, pfnreadsd: Long, pfnwritesd: Long, lpcontext: Long): Int
}

public actual fun dSCreateSecurityPage(pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, phpage: MutPtr<Hpropsheetpage>, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    WindowsWin32SecurityDirectoryservicesJniBridge.windowssysWindowsWin32SecurityDirectoryservicesDSCreateSecurityPage(pwszobjectpath.rawAddress, pwszobjectclass.rawAddress, dwflags.toInt(), phpage.rawAddress, 0L, 0L, lpcontext)

public actual fun dSEditSecurity(hwndowner: Hwnd, pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, pwszcaption: Pcwstr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    WindowsWin32SecurityDirectoryservicesJniBridge.windowssysWindowsWin32SecurityDirectoryservicesDSEditSecurity(hwndowner.rawAddress, pwszobjectpath.rawAddress, pwszobjectclass.rawAddress, dwflags.toInt(), pwszcaption.rawAddress, 0L, 0L, lpcontext)
