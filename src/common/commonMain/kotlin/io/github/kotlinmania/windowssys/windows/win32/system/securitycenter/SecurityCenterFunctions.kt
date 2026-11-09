package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE

public expect fun WscGetAntiMalwareUri(ppszuri: Long): HRESULT

public expect fun WscGetSecurityProviderHealth(providers: UInt, phealth: Long): HRESULT

public expect fun WscQueryAntiMalwareUri(): HRESULT

public expect fun WscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: LPTHREAD_START_ROUTINE, pcontext: Long): HRESULT

public expect fun WscRegisterForUserNotifications(): HRESULT

public expect fun WscUnRegisterChanges(hregistrationhandle: HANDLE): HRESULT
