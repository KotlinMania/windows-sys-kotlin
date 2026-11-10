package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias ConvinfoConversationState = UInt

public typealias ConvinfoStatus = UInt

public typealias DdeClientTransactionType = UInt

public typealias DdeEnableCallbackCmd = UInt

public typealias DdeInitializeCommand = UInt

public typealias DdeNameServiceCmd = UInt

public typealias Hconv = COpaquePointer?

public typealias Hconvlist = COpaquePointer?

public typealias Hddedata = COpaquePointer?

public typealias Hsz = COpaquePointer?

public fun interface PfncallbackFn {
    public operator fun invoke(wtype: UInt, wfmt: UInt, hconv: Hconv, hsz1: Hsz, hsz2: Hsz, hdata: Hddedata, dwdata1: ULong, dwdata2: ULong): Hddedata
}

public typealias Pfncallback = PfncallbackFn?
