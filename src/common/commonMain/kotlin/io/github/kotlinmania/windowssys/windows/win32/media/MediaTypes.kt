package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.HDRVR

public typealias HTASK = Long

public fun interface LPDRVCALLBACKFn {
    public operator fun invoke(hdrvr: HDRVR, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias LPDRVCALLBACK = LPDRVCALLBACKFn?

public fun interface LPTIMECALLBACKFn {
    public operator fun invoke(utimerid: UInt, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias LPTIMECALLBACK = LPTIMECALLBACKFn?

public typealias TIMECODE_SAMPLE_FLAGS = UInt
