package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

public fun interface CBADMITRESULTFn {
    public operator fun invoke(lpmhandle: LPM_HANDLE, requesthandle: RHANDLE, ulpcmactionflags: UInt, lpmerror: Int, policydecisionscount: Int, ppolicydecisions: Long): Long
}

public typealias CBADMITRESULT = CBADMITRESULTFn?

public fun interface CBGETRSVPOBJECTSFn {
    public operator fun invoke(lpmhandle: LPM_HANDLE, requesthandle: RHANDLE, lpmerror: Int, rsvpobjectscount: Int, pprsvpobjects: Long): Long
}

public typealias CBGETRSVPOBJECTS = CBGETRSVPOBJECTSFn?

public typealias FilterType = Int

public typealias LPM_HANDLE = Long

public fun interface PALLOCMEMFn {
    public operator fun invoke(size: UInt): Long
}

public typealias PALLOCMEM = PALLOCMEMFn?

public fun interface PFREEMEMFn {
    public operator fun invoke(pv: Long)
}

public typealias PFREEMEM = PFREEMEMFn?

public typealias QOS_FLOWRATE_REASON = Int

public typealias QOS_NOTIFY_FLOW = Int

public typealias QOS_QUERY_FLOW = Int

public typealias QOS_SET_FLOW = Int

public typealias QOS_SHAPING = Int

public typealias QOS_TRAFFIC_TYPE = Int

public typealias RHANDLE = Long

public fun interface TCI_ADD_FLOW_COMPLETE_HANDLERFn {
    public operator fun invoke(clflowctx: Foundation.HANDLE, status: UInt)
}

public typealias TCI_ADD_FLOW_COMPLETE_HANDLER = TCI_ADD_FLOW_COMPLETE_HANDLERFn?

public fun interface TCI_DEL_FLOW_COMPLETE_HANDLERFn {
    public operator fun invoke(clflowctx: Foundation.HANDLE, status: UInt)
}

public typealias TCI_DEL_FLOW_COMPLETE_HANDLER = TCI_DEL_FLOW_COMPLETE_HANDLERFn?

public fun interface TCI_MOD_FLOW_COMPLETE_HANDLERFn {
    public operator fun invoke(clflowctx: Foundation.HANDLE, status: UInt)
}

public typealias TCI_MOD_FLOW_COMPLETE_HANDLER = TCI_MOD_FLOW_COMPLETE_HANDLERFn?

public fun interface TCI_NOTIFY_HANDLERFn {
    public operator fun invoke(clregctx: Foundation.HANDLE, clifcctx: Foundation.HANDLE, event: UInt, subcode: Foundation.HANDLE, bufsize: UInt, buffer: Long)
}

public typealias TCI_NOTIFY_HANDLER = TCI_NOTIFY_HANDLERFn?

public typealias int_serv_wkp = Int
