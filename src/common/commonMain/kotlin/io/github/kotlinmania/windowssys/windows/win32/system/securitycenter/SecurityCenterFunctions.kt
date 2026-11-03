package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT

public fun WscGetAntiMalwareUri(ppszuri: Long): HRESULT {
    return Win32DynamicFfi.invoke("wscapi.dll", "WscGetAntiMalwareUri", longArrayOf(ppszuri)).toInt()
}

public fun WscGetSecurityProviderHealth(providers: UInt, phealth: Long): HRESULT {
    return Win32DynamicFfi.invoke("wscapi.dll", "WscGetSecurityProviderHealth", longArrayOf(providers.toLong(), phealth)).toInt()
}

public fun WscQueryAntiMalwareUri(): HRESULT {
    return Win32DynamicFfi.invoke("wscapi.dll", "WscQueryAntiMalwareUri", longArrayOf()).toInt()
}

public fun WscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: Threading.LPTHREAD_START_ROUTINE, pcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("wscapi.dll", "WscRegisterForChanges", longArrayOf(reserved, phcallbackregistration, Win32DynamicFfi.objectSlot(lpcallbackaddress), pcontext)).toInt()
}

public fun WscRegisterForUserNotifications(): HRESULT {
    return Win32DynamicFfi.invoke("wscapi.dll", "WscRegisterForUserNotifications", longArrayOf()).toInt()
}

public fun WscUnRegisterChanges(hregistrationhandle: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("wscapi.dll", "WscUnRegisterChanges", longArrayOf(Win32DynamicFfi.objectSlot(hregistrationhandle))).toInt()
}
