package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public expect fun wscGetAntiMalwareUri(ppszuri: COpaquePointer?): Hresult

public expect fun wscGetSecurityProviderHealth(providers: UInt, phealth: COpaquePointer?): Hresult

public expect fun wscQueryAntiMalwareUri(): Hresult

public expect fun wscRegisterForChanges(reserved: COpaquePointer?, phcallbackregistration: COpaquePointer?, lpcallbackaddress: LpthreadStartRoutine, pcontext: COpaquePointer?): Hresult

public expect fun wscRegisterForUserNotifications(): Hresult

public expect fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult
