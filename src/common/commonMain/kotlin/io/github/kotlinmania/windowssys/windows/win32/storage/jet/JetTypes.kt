package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

public fun interface JetCallbackFn {
    public operator fun invoke(sesid: JetSesid, dbid: UInt, tableid: JetTableid, cbtyp: UInt, pvarg1: COpaquePointer?, pvarg2: COpaquePointer?, pvcontext: COpaquePointer?, ulunused: JetApiPtr): Int
}

public typealias JetCallback = JetCallbackFn?

public typealias JetErrcat = Int

public typealias JetIndexchecking = Int

public typealias JetInstance = ULong

public typealias JetLs = ULong

public typealias JetOssnapid = ULong

public fun interface JetPfndurablecommitcallbackFn {
    public operator fun invoke(instance: JetInstance, pcommitidseen: COpaquePointer?, grbit: UInt): Int
}

public typealias JetPfndurablecommitcallback = JetPfndurablecommitcallbackFn?

public fun interface JetPfnreallocFn {
    public operator fun invoke(pvcontext: COpaquePointer?, pv: COpaquePointer?, cb: UInt): COpaquePointer?
}

public typealias JetPfnrealloc = JetPfnreallocFn?

public fun interface JetPfnstatusFn {
    public operator fun invoke(sesid: JetSesid, snp: UInt, snt: UInt, pv: COpaquePointer?): Int
}

public typealias JetPfnstatus = JetPfnstatusFn?

public typealias JetRelop = Int

public typealias JetSesid = ULong
