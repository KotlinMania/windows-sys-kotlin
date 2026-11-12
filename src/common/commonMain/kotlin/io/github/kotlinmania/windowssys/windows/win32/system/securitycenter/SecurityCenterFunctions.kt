package io.github.kotlinmania.windowssys.windows.win32.system.securitycenter

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public expect fun wscGetAntiMalwareUri(ppszuri: MutPtr<Pwstr>): Hresult

public expect fun wscGetSecurityProviderHealth(providers: UInt, phealth: MutPtr<WscSecurityProviderHealth>): Hresult

public expect fun wscQueryAntiMalwareUri(): Hresult

public expect fun wscRegisterForChanges(reserved: MutPtr<CVoid>, phcallbackregistration: MutPtr<Handle>, lpcallbackaddress: LpthreadStartRoutine, pcontext: MutPtr<CVoid>): Hresult

public expect fun wscRegisterForUserNotifications(): Hresult

public expect fun wscUnRegisterChanges(hregistrationhandle: Handle): Hresult
