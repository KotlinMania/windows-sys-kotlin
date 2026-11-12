package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

public fun interface JetCallbackFn {
    public operator fun invoke(sesid: JetSesid, dbid: UInt, tableid: JetTableid, cbtyp: UInt, pvarg1: MutPtr, pvarg2: MutPtr, pvcontext: ConstPtr, ulunused: JetApiPtr): Int
}

public typealias JetCallback = JetCallbackFn?

public typealias JetErrcat = Int

public typealias JetIndexchecking = Int

public typealias JetInstance = ULong

public typealias JetLs = ULong

public typealias JetOssnapid = ULong

public fun interface JetPfndurablecommitcallbackFn {
    public operator fun invoke(instance: JetInstance, pcommitidseen: ConstPtr, grbit: UInt): Int
}

public typealias JetPfndurablecommitcallback = JetPfndurablecommitcallbackFn?

public fun interface JetPfnreallocFn {
    public operator fun invoke(pvcontext: ConstPtr, pv: ConstPtr, cb: UInt): MutPtr
}

public typealias JetPfnrealloc = JetPfnreallocFn?

public fun interface JetPfnstatusFn {
    public operator fun invoke(sesid: JetSesid, snp: UInt, snt: UInt, pv: ConstPtr): Int
}

public typealias JetPfnstatus = JetPfnstatusFn?

public typealias JetRelop = Int

public typealias JetSesid = ULong
