@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DSCreateSecurityPage(pwszobjectpath: PCWSTR, pwszobjectclass: PCWSTR, dwflags: UInt, phpage: Long, pfnreadsd: PFNREADOBJECTSECURITY, pfnwritesd: PFNWRITEOBJECTSECURITY, lpcontext: LPARAM): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.directoryservices.cinterop.windowssys_windows_win32_security_directoryservices_DSCreateSecurityPage(pwszobjectpath.toCPointer<ByteVar>(), pwszobjectclass.toCPointer<ByteVar>(), dwflags, phpage.toCPointer<ByteVar>(), pfnreadsd.toLong().toCPointer<ByteVar>(), pfnwritesd.toLong().toCPointer<ByteVar>(), lpcontext)

public actual fun DSEditSecurity(hwndowner: HWND, pwszobjectpath: PCWSTR, pwszobjectclass: PCWSTR, dwflags: UInt, pwszcaption: PCWSTR, pfnreadsd: PFNREADOBJECTSECURITY, pfnwritesd: PFNWRITEOBJECTSECURITY, lpcontext: LPARAM): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.directoryservices.cinterop.windowssys_windows_win32_security_directoryservices_DSEditSecurity(hwndowner.toCPointer<ByteVar>(), pwszobjectpath.toCPointer<ByteVar>(), pwszobjectclass.toCPointer<ByteVar>(), dwflags, pwszcaption.toCPointer<ByteVar>(), pfnreadsd.toLong().toCPointer<ByteVar>(), pfnwritesd.toLong().toCPointer<ByteVar>(), lpcontext)
