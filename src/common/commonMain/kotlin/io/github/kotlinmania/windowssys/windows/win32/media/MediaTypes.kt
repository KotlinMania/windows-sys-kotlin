package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.media.multimedia.Hdrvr

public typealias Htask = MutPtr<CVoid>

public fun interface LpdrvcallbackFn {
    public operator fun invoke(hdrvr: Hdrvr, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias Lpdrvcallback = LpdrvcallbackFn?

public fun interface LptimecallbackFn {
    public operator fun invoke(utimerid: UInt, umsg: UInt, dwuser: ULong, dw1: ULong, dw2: ULong)
}

public typealias Lptimecallback = LptimecallbackFn?

public typealias TimecodeSampleFlags = UInt
