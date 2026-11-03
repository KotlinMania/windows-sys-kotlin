package io.github.kotlinmania.windowssys.windows.win32.security.directoryservices

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun interface PFNDSCREATESECPAGEFn {
    public operator fun invoke(param0: PCWSTR, param1: PCWSTR, param2: UInt, param3: Long, param4: PFNREADOBJECTSECURITY, param5: PFNWRITEOBJECTSECURITY, param6: Foundation.LPARAM): HRESULT
}

public typealias PFNDSCREATESECPAGE = PFNDSCREATESECPAGEFn?

public fun interface PFNDSEDITSECURITYFn {
    public operator fun invoke(param0: Foundation.HWND, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: PCWSTR, param5: PFNREADOBJECTSECURITY, param6: PFNWRITEOBJECTSECURITY, param7: Foundation.LPARAM): HRESULT
}

public typealias PFNDSEDITSECURITY = PFNDSEDITSECURITYFn?

public fun interface PFNREADOBJECTSECURITYFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: Long, param3: Foundation.LPARAM): HRESULT
}

public typealias PFNREADOBJECTSECURITY = PFNREADOBJECTSECURITYFn?

public fun interface PFNWRITEOBJECTSECURITYFn {
    public operator fun invoke(param0: PCWSTR, param1: UInt, param2: PSECURITY_DESCRIPTOR, param3: Foundation.LPARAM): HRESULT
}

public typealias PFNWRITEOBJECTSECURITY = PFNWRITEOBJECTSECURITYFn?
