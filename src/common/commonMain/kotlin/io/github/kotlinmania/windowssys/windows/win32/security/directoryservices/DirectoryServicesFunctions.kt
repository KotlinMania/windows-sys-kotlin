package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun interface FnCallback {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Long, param3: Foundation.LPARAM): HRESULT
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: PSECURITY_DESCRIPTOR, param3: Foundation.LPARAM): HRESULT
}

public fun DSCreateSecurityPage(pwszobjectpath: PCWSTR, pwszobjectclass: PCWSTR, dwflags: UInt, phpage: Long, pfnreadsd: PFNREADOBJECTSECURITY, pfnwritesd: PFNWRITEOBJECTSECURITY, lpcontext: Foundation.LPARAM): HRESULT {
    return Win32DynamicFfi.invoke("dssec.dll", "DSCreateSecurityPage", longArrayOf(pwszobjectpath, pwszobjectclass, dwflags.toLong(), phpage, Win32DynamicFfi.objectSlot(pfnreadsd), Win32DynamicFfi.objectSlot(pfnwritesd), Win32DynamicFfi.objectSlot(lpcontext))).toInt()
}

public fun DSEditSecurity(hwndowner: Foundation.HWND, pwszobjectpath: PCWSTR, pwszobjectclass: PCWSTR, dwflags: UInt, pwszcaption: PCWSTR, pfnreadsd: PFNREADOBJECTSECURITY, pfnwritesd: PFNWRITEOBJECTSECURITY, lpcontext: Foundation.LPARAM): HRESULT {
    return Win32DynamicFfi.invoke("dssec.dll", "DSEditSecurity", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), pwszobjectpath, pwszobjectclass, dwflags.toLong(), pwszcaption, Win32DynamicFfi.objectSlot(pfnreadsd), Win32DynamicFfi.objectSlot(pfnwritesd), Win32DynamicFfi.objectSlot(lpcontext))).toInt()
}
