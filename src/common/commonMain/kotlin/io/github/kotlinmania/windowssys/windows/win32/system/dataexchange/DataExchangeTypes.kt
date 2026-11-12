package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias ConvinfoConversationState = UInt

public typealias ConvinfoStatus = UInt

public typealias DdeClientTransactionType = UInt

public typealias DdeEnableCallbackCmd = UInt

public typealias DdeInitializeCommand = UInt

public typealias DdeNameServiceCmd = UInt

public typealias Hconv = MutPtr<CVoid>

public typealias Hconvlist = MutPtr<CVoid>

public typealias Hddedata = MutPtr<CVoid>

public typealias Hsz = MutPtr<CVoid>

public fun interface PfncallbackFn {
    public operator fun invoke(wtype: UInt, wfmt: UInt, hconv: Hconv, hsz1: Hsz, hsz2: Hsz, hdata: Hddedata, dwdata1: ULong, dwdata2: ULong): Hddedata
}

public typealias Pfncallback = PfncallbackFn?
