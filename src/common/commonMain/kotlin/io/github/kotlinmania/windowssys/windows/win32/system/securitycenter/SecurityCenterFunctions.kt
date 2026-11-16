package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public expect fun wscGetAntiMalwareUri(ppszuri: MutPtr): Hresult

public expect fun wscGetSecurityProviderHealth(providers: UInt, phealth: MutPtr): Hresult

public expect fun wscQueryAntiMalwareUri(): Hresult

public expect fun wscRegisterForChanges(reserved: MutPtr, phcallbackregistration: MutPtr, lpcallbackaddress: LpthreadStartRoutine, pcontext: MutPtr): Hresult

public expect fun wscRegisterForUserNotifications(): Hresult

public expect fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult
