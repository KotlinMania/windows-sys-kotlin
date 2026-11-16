@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.security.directoryservices.cinterop.windowssysWindowsWin32SecurityDirectoryservicesDSCreateSecurityPage
import io.github.kotlinmania.windowssys.windows.win32.security.directoryservices.cinterop.windowssysWindowsWin32SecurityDirectoryservicesDSEditSecurity
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dSCreateSecurityPage(pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, phpage: MutPtr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    windowssysWindowsWin32SecurityDirectoryservicesDSCreateSecurityPage(pwszobjectpath.rawAddress.toCPointer<ByteVar>(), pwszobjectclass.rawAddress.toCPointer<ByteVar>(), dwflags, phpage.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext)

public actual fun dSEditSecurity(hwndowner: Hwnd, pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, pwszcaption: Pcwstr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult =
    windowssysWindowsWin32SecurityDirectoryservicesDSEditSecurity(hwndowner.rawAddress.toCPointer<ByteVar>(), pwszobjectpath.rawAddress.toCPointer<ByteVar>(), pwszobjectclass.rawAddress.toCPointer<ByteVar>(), dwflags, pwszcaption.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext)
