package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_API_PTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_TABLEID

public fun interface JET_CALLBACKFn {
    public operator fun invoke(sesid: JET_SESID, dbid: UInt, tableid: JET_TABLEID, cbtyp: UInt, pvarg1: Long, pvarg2: Long, pvcontext: Long, ulunused: JET_API_PTR): Int
}

public typealias JET_CALLBACK = JET_CALLBACKFn?

public typealias JET_ERRCAT = Int

public typealias JET_INDEXCHECKING = Int

public typealias JET_INSTANCE = ULong

public typealias JET_LS = ULong

public typealias JET_OSSNAPID = ULong

public fun interface JET_PFNDURABLECOMMITCALLBACKFn {
    public operator fun invoke(instance: JET_INSTANCE, pcommitidseen: Long, grbit: UInt): Int
}

public typealias JET_PFNDURABLECOMMITCALLBACK = JET_PFNDURABLECOMMITCALLBACKFn?

public fun interface JET_PFNREALLOCFn {
    public operator fun invoke(pvcontext: Long, pv: Long, cb: UInt): Long
}

public typealias JET_PFNREALLOC = JET_PFNREALLOCFn?

public fun interface JET_PFNSTATUSFn {
    public operator fun invoke(sesid: JET_SESID, snp: UInt, snt: UInt, pv: Long): Int
}

public typealias JET_PFNSTATUS = JET_PFNSTATUSFn?

public typealias JET_RELOP = Int

public typealias JET_SESID = ULong
