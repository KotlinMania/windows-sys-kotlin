package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public fun interface PfndscreatesecpageFn {
    public operator fun invoke(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: MutPtr, param4: Pfnreadobjectsecurity, param5: Pfnwriteobjectsecurity, param6: Lparam): Hresult
}

public typealias Pfndscreatesecpage = PfndscreatesecpageFn?

public fun interface PfndseditsecurityFn {
    public operator fun invoke(param0: Hwnd, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: Pcwstr, param5: Pfnreadobjectsecurity, param6: Pfnwriteobjectsecurity, param7: Lparam): Hresult
}

public typealias Pfndseditsecurity = PfndseditsecurityFn?

public fun interface PfnreadobjectsecurityFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: MutPtr, param3: Lparam): Hresult
}

public typealias Pfnreadobjectsecurity = PfnreadobjectsecurityFn?

public fun interface PfnwriteobjectsecurityFn {
    public operator fun invoke(param0: Pcwstr, param1: UInt, param2: PsecurityDescriptor, param3: Lparam): Hresult
}

public typealias Pfnwriteobjectsecurity = PfnwriteobjectsecurityFn?
