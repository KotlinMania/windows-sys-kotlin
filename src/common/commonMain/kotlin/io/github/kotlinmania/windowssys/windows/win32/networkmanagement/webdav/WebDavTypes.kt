package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias Authnextstep = Int

public fun interface PfndavauthcallbackFn {
    public operator fun invoke(lpwzservername: Pcwstr, lpwzremotename: Pcwstr, dwauthscheme: UInt, dwflags: UInt, pcallbackcred: COpaquePointer?, nextstep: COpaquePointer?, pfreecred: COpaquePointer?): UInt
}

public typealias Pfndavauthcallback = PfndavauthcallbackFn?

public fun interface PfndavauthcallbackFreecredFn {
    public operator fun invoke(pbuffer: COpaquePointer?): UInt
}

public typealias PfndavauthcallbackFreecred = PfndavauthcallbackFreecredFn?
