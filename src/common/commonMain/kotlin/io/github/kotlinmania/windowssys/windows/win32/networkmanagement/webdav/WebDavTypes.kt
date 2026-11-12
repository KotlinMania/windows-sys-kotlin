package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias Authnextstep = Int

public fun interface PfndavauthcallbackFn {
    public operator fun invoke(lpwzservername: Pcwstr, lpwzremotename: Pcwstr, dwauthscheme: UInt, dwflags: UInt, pcallbackcred: MutPtr, nextstep: MutPtr, pfreecred: MutPtr): UInt
}

public typealias Pfndavauthcallback = PfndavauthcallbackFn?

public fun interface PfndavauthcallbackFreecredFn {
    public operator fun invoke(pbuffer: ConstPtr): UInt
}

public typealias PfndavauthcallbackFreecred = PfndavauthcallbackFreecredFn?
