@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM

private object WindowsWin32SecurityDirectoryservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_directoryservices_DSCreateSecurityPage(pwszobjectpath: Long, pwszobjectclass: Long, dwflags: Int, phpage: Long, pfnreadsd: Long, pfnwritesd: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_directoryservices_DSEditSecurity(hwndowner: Long, pwszobjectpath: Long, pwszobjectclass: Long, dwflags: Int, pwszcaption: Long, pfnreadsd: Long, pfnwritesd: Long, lpcontext: Long): Int
}

public actual fun DSCreateSecurityPage(pwszobjectpath: PCWSTR, pwszobjectclass: PCWSTR, dwflags: UInt, phpage: Long, pfnreadsd: PFNREADOBJECTSECURITY, pfnwritesd: PFNWRITEOBJECTSECURITY, lpcontext: LPARAM): HRESULT =
    WindowsWin32SecurityDirectoryservicesJniBridge.windowssys_windows_win32_security_directoryservices_DSCreateSecurityPage(pwszobjectpath, pwszobjectclass, dwflags.toInt(), phpage, pfnreadsd.toLong(), pfnwritesd.toLong(), lpcontext)

public actual fun DSEditSecurity(hwndowner: HWND, pwszobjectpath: PCWSTR, pwszobjectclass: PCWSTR, dwflags: UInt, pwszcaption: PCWSTR, pfnreadsd: PFNREADOBJECTSECURITY, pfnwritesd: PFNWRITEOBJECTSECURITY, lpcontext: LPARAM): HRESULT =
    WindowsWin32SecurityDirectoryservicesJniBridge.windowssys_windows_win32_security_directoryservices_DSEditSecurity(hwndowner, pwszobjectpath, pwszobjectclass, dwflags.toInt(), pwszcaption, pfnreadsd.toLong(), pfnwritesd.toLong(), lpcontext)
