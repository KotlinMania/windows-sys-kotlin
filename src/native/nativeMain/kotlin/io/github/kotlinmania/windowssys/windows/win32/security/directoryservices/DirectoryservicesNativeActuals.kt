@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.security.directoryservices.cinterop.windowssys_windows_win32_security_directoryservices_dSCreateSecurityPage
import io.github.kotlinmania.windowssys.windows.win32.security.directoryservices.cinterop.windowssys_windows_win32_security_directoryservices_dSEditSecurity
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dSCreateSecurityPage(pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, phpage: COpaquePointer?, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    windowssys_windows_win32_security_directoryservices_dSCreateSecurityPage(pwszobjectpath?.value?.toCPointer<ByteVar>(), pwszobjectclass?.value?.toCPointer<ByteVar>(), dwflags, phpage?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext)

public actual fun dSEditSecurity(hwndowner: Hwnd, pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, pwszcaption: Pcwstr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    windowssys_windows_win32_security_directoryservices_dSEditSecurity(hwndowner?.value?.toCPointer<ByteVar>(), pwszobjectpath?.value?.toCPointer<ByteVar>(), pwszobjectclass?.value?.toCPointer<ByteVar>(), dwflags, pwszcaption?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext)
