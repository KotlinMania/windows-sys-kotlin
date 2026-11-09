@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE

public actual fun WscGetAntiMalwareUri(ppszuri: Long): HRESULT =
    0

public actual fun WscGetSecurityProviderHealth(providers: UInt, phealth: Long): HRESULT =
    0

public actual fun WscQueryAntiMalwareUri(): HRESULT =
    0

public actual fun WscRegisterForChanges(reserved: Long, phcallbackregistration: Long, lpcallbackaddress: LPTHREAD_START_ROUTINE, pcontext: Long): HRESULT =
    0

public actual fun WscRegisterForUserNotifications(): HRESULT =
    0

public actual fun WscUnRegisterChanges(hregistrationhandle: HANDLE): HRESULT =
    0
