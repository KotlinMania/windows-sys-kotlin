package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias ADVANCED_FEATURE_FLAGS = UShort

public typealias ADVF = Int

public typealias APTTYPE = Int

public typealias APTTYPEQUALIFIER = Int

public typealias ApplicationType = Int

public typealias BINDINFOF = Int

public typealias BIND_FLAGS = Int

public typealias CALLCONV = Int

public typealias CALLTYPE = Int

public typealias CLSCTX = UInt

public typealias COINIT = Int

public typealias COINITBASE = Int

public typealias COMSD = Int

public typealias COWAIT_FLAGS = Int

public typealias CO_DEVICE_CATALOG_COOKIE = Long

public typealias CO_MARSHALING_CONTEXT_ATTRIBUTES = Int

public typealias CO_MTA_USAGE_COOKIE = Long

public typealias CWMO_FLAGS = Int

public typealias DATADIR = Int

public typealias DCOM_CALL_STATE = Int

public typealias DESCKIND = Int

public typealias DISPATCH_FLAGS = UShort

public typealias DVASPECT = UInt

public typealias EOLE_AUTHENTICATION_CAPABILITIES = Int

public typealias EXTCONN = Int

public typealias FUNCFLAGS = UShort

public typealias FUNCKIND = Int

public typealias GLOBALOPT_EH_VALUES = Int

public typealias GLOBALOPT_PROPERTIES = Int

public typealias GLOBALOPT_RO_FLAGS = Int

public typealias GLOBALOPT_RPCTP_VALUES = Int

public typealias GLOBALOPT_UNMARSHALING_POLICY_VALUES = Int

public typealias IDLFLAGS = UShort

public typealias IMPLTYPEFLAGS = Int

public typealias INVOKEKIND = Int

public typealias LOCKTYPE = Int

public fun interface LPEXCEPFINO_DEFERRED_FILLINFn {
    public operator fun invoke(pexcepinfo: Long): HRESULT
}

public typealias LPEXCEPFINO_DEFERRED_FILLIN = LPEXCEPFINO_DEFERRED_FILLINFn?

public fun interface LPFNCANUNLOADNOWFn {
    public operator fun invoke(): HRESULT
}

public typealias LPFNCANUNLOADNOW = LPFNCANUNLOADNOWFn?

public fun interface LPFNGETCLASSOBJECTFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long): HRESULT
}

public typealias LPFNGETCLASSOBJECT = LPFNGETCLASSOBJECTFn?

public typealias MEMCTX = Int

public typealias MKRREDUCE = Int

public typealias MKSYS = Int

public typealias MSHCTX = Int

public typealias MSHLFLAGS = Int

public typealias MachineGlobalObjectTableRegistrationToken = Long

public typealias PENDINGMSG = Int

public typealias PENDINGTYPE = Int

public fun interface PFNCONTEXTCALLFn {
    public operator fun invoke(pparam: Long): HRESULT
}

public typealias PFNCONTEXTCALL = PFNCONTEXTCALLFn?

public typealias REGCLS = Int

public typealias ROT_FLAGS = UInt

public typealias RPCOPT_PROPERTIES = Int

public typealias RPCOPT_SERVER_LOCALITY_VALUES = Int

public typealias RPC_C_AUTHN_LEVEL = UInt

public typealias RPC_C_IMP_LEVEL = UInt

public typealias SERVERCALL = Int

public typealias STATFLAG = Int

public typealias STGC = Int

public typealias STGM = UInt

public typealias STGTY = Int

public typealias STREAM_SEEK = UInt

public typealias SYSKIND = Int

public typealias ShutdownType = Int

public typealias THDTYPE = Int

public typealias TYMED = Int

public typealias TYPEKIND = Int

public typealias TYSPEC = Int

public typealias URI_CREATE_FLAGS = UInt

public typealias Uri_PROPERTY = Int

public typealias VARFLAGS = UShort

public typealias VARKIND = Int
