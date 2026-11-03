package io.github.kotlinmania.windowssys.windows.win32.storage.jet

public fun interface JET_CALLBACKFn {
    public operator fun invoke(sesid: JET_SESID, dbid: UInt, tableid: StructuredStorage.JET_TABLEID, cbtyp: UInt, pvarg1: Long, pvarg2: Long, pvcontext: Long, ulunused: StructuredStorage.JET_API_PTR): Int
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
