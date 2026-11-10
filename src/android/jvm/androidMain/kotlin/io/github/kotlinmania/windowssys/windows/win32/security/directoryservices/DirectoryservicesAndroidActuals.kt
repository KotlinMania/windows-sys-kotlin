@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

private object WindowsWin32SecurityDirectoryservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_directoryservices_dSCreateSecurityPage(pwszobjectpath: Long, pwszobjectclass: Long, dwflags: Int, phpage: Long, pfnreadsd: Long, pfnwritesd: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_directoryservices_dSEditSecurity(hwndowner: Long, pwszobjectpath: Long, pwszobjectclass: Long, dwflags: Int, pwszcaption: Long, pfnreadsd: Long, pfnwritesd: Long, lpcontext: Long): Int
}

public actual fun dSCreateSecurityPage(pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, phpage: COpaquePointer?, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    WindowsWin32SecurityDirectoryservicesJniBridge.windowssys_windows_win32_security_directoryservices_dSCreateSecurityPage((pwszobjectpath?.value ?: 0L), (pwszobjectclass?.value ?: 0L), dwflags.toInt(), (phpage?.value ?: 0L), 0L, 0L, lpcontext)

public actual fun dSEditSecurity(hwndowner: Hwnd, pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, pwszcaption: Pcwstr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    WindowsWin32SecurityDirectoryservicesJniBridge.windowssys_windows_win32_security_directoryservices_dSEditSecurity((hwndowner?.value ?: 0L), (pwszobjectpath?.value ?: 0L), (pwszobjectclass?.value ?: 0L), dwflags.toInt(), (pwszcaption?.value ?: 0L), 0L, 0L, lpcontext)
