package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.Hdrvr

public typealias Htask = COpaquePointer?

public fun interface LpdrvcallbackFn {
    public operator fun invoke(hdrvr: Hdrvr, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias Lpdrvcallback = LpdrvcallbackFn?

public fun interface LptimecallbackFn {
    public operator fun invoke(utimerid: UInt, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias Lptimecallback = LptimecallbackFn?

public typealias TimecodeSampleFlags = UInt
