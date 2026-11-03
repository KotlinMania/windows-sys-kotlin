package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias AUTHNEXTSTEP = Int

public fun interface PFNDAVAUTHCALLBACKFn {
    public operator fun invoke(lpwzservername: PCWSTR, lpwzremotename: PCWSTR, dwauthscheme: UInt, dwflags: UInt, pcallbackcred: Long, nextstep: Long, pfreecred: Long): UInt
}

public typealias PFNDAVAUTHCALLBACK = PFNDAVAUTHCALLBACKFn?

public fun interface PFNDAVAUTHCALLBACK_FREECREDFn {
    public operator fun invoke(pbuffer: Long): UInt
}

public typealias PFNDAVAUTHCALLBACK_FREECRED = PFNDAVAUTHCALLBACK_FREECREDFn?
