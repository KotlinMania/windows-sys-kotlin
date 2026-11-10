package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

public expect fun dSCreateSecurityPage(pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, phpage: COpaquePointer?, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult

public expect fun dSEditSecurity(hwndowner: Hwnd, pwszobjectpath: Pcwstr, pwszobjectclass: Pcwstr, dwflags: UInt, pwszcaption: Pcwstr, pfnreadsd: Pfnreadobjectsecurity, pfnwritesd: Pfnwriteobjectsecurity, lpcontext: Lparam): Hresult
