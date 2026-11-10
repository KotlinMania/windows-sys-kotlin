package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr

public val ADVFCACHE_FORCEBUILTIN: Advf = 16

public val ADVFCACHE_NOHANDLER: Advf = 8

public val ADVFCACHE_ONSAVE: Advf = 32

public val ADVF_DATAONSTOP: Advf = 64

public val ADVF_NODATA: Advf = 1

public val ADVF_ONLYONCE: Advf = 4

public val ADVF_PRIMEFIRST: Advf = 2

public val APPIDREGFLAGS_AAA_NO_IMPLICIT_ACTIVATE_AS_IU: UInt = 2048u

public val APPIDREGFLAGS_ACTIVATE_IUSERVER_INDESKTOP: UInt = 1u

public val APPIDREGFLAGS_ISSUE_ACTIVATION_RPC_AT_IDENTIFY: UInt = 4u

public val APPIDREGFLAGS_IUSERVER_ACTIVATE_IN_CLIENT_SESSION_ONLY: UInt = 32u

public val APPIDREGFLAGS_IUSERVER_SELF_SID_IN_LAUNCH_PERMISSION: UInt = 16u

public val APPIDREGFLAGS_IUSERVER_UNMODIFIED_LOGON_TOKEN: UInt = 8u

public val APPIDREGFLAGS_RESERVED1: UInt = 64u

public val APPIDREGFLAGS_RESERVED2: UInt = 128u

public val APPIDREGFLAGS_RESERVED3: UInt = 256u

public val APPIDREGFLAGS_RESERVED4: UInt = 512u

public val APPIDREGFLAGS_RESERVED5: UInt = 1024u

public val APPIDREGFLAGS_RESERVED7: UInt = 4096u

public val APPIDREGFLAGS_RESERVED8: UInt = 8192u

public val APPIDREGFLAGS_RESERVED9: UInt = 16384u

public val APPIDREGFLAGS_SECURE_SERVER_PROCESS_SD_AND_BIND: UInt = 2u

public val APTTYPEQUALIFIER_APPLICATION_STA: Apttypequalifier = 6

public val APTTYPEQUALIFIER_IMPLICIT_MTA: Apttypequalifier = 1

public val APTTYPEQUALIFIER_NA_ON_IMPLICIT_MTA: Apttypequalifier = 4

public val APTTYPEQUALIFIER_NA_ON_MAINSTA: Apttypequalifier = 5

public val APTTYPEQUALIFIER_NA_ON_MTA: Apttypequalifier = 2

public val APTTYPEQUALIFIER_NA_ON_STA: Apttypequalifier = 3

public val APTTYPEQUALIFIER_NONE: Apttypequalifier = 0

public val APTTYPEQUALIFIER_RESERVED_1: Apttypequalifier = 7

public val APTTYPE_CURRENT: Apttype = -1

public val APTTYPE_MAINSTA: Apttype = 3

public val APTTYPE_MTA: Apttype = 1

public val APTTYPE_NA: Apttype = 2

public val APTTYPE_STA: Apttype = 0

public val ASYNC_MODE_COMPATIBILITY: Int = 1

public val ASYNC_MODE_DEFAULT: Int = 0

public val BINDINFOF_URLENCODEDEXTRAINFO: Bindinfof = 2

public val BINDINFOF_URLENCODESTGMEDDATA: Bindinfof = 1

public val BIND_JUSTTESTEXISTENCE: BindFlags = 2

public val BIND_MAYBOTHERUSER: BindFlags = 1

public val CALLTYPE_ASYNC: Calltype = 3

public val CALLTYPE_ASYNC_CALLPENDING: Calltype = 5

public val CALLTYPE_NESTED: Calltype = 2

public val CALLTYPE_TOPLEVEL: Calltype = 1

public val CALLTYPE_TOPLEVEL_CALLPENDING: Calltype = 4

public val CC_CDECL: Callconv = 1

public val CC_FASTCALL: Callconv = 0

public val CC_FPFASTCALL: Callconv = 5

public val CC_MACPASCAL: Callconv = 3

public val CC_MAX: Callconv = 9

public val CC_MPWCDECL: Callconv = 7

public val CC_MPWPASCAL: Callconv = 8

public val CC_MSCPASCAL: Callconv = 2

public val CC_PASCAL: Callconv = 2

public val CC_STDCALL: Callconv = 4

public val CC_SYSCALL: Callconv = 6

public val CLSCTX_ACTIVATE_32_BIT_SERVER: Clsctx = 262144u

public val CLSCTX_ACTIVATE_64_BIT_SERVER: Clsctx = 524288u

public val CLSCTX_ACTIVATE_AAA_AS_IU: Clsctx = 8388608u

public val CLSCTX_ACTIVATE_ARM32_SERVER: Clsctx = 33554432u

public val CLSCTX_ACTIVATE_X86_SERVER: Clsctx = 262144u

public val CLSCTX_ALL: Clsctx = 23u

public val CLSCTX_ALLOW_LOWER_TRUST_REGISTRATION: Clsctx = 67108864u

public val CLSCTX_APPCONTAINER: Clsctx = 4194304u

public val CLSCTX_DISABLE_AAA: Clsctx = 32768u

public val CLSCTX_ENABLE_AAA: Clsctx = 65536u

public val CLSCTX_ENABLE_CLOAKING: Clsctx = 1048576u

public val CLSCTX_ENABLE_CODE_DOWNLOAD: Clsctx = 8192u

public val CLSCTX_FROM_DEFAULT_CONTEXT: Clsctx = 131072u

public val CLSCTX_INPROC_HANDLER: Clsctx = 2u

public val CLSCTX_INPROC_HANDLER16: Clsctx = 32u

public val CLSCTX_INPROC_SERVER: Clsctx = 1u

public val CLSCTX_INPROC_SERVER16: Clsctx = 8u

public val CLSCTX_LOCAL_SERVER: Clsctx = 4u

public val CLSCTX_NO_CODE_DOWNLOAD: Clsctx = 1024u

public val CLSCTX_NO_CUSTOM_MARSHAL: Clsctx = 4096u

public val CLSCTX_NO_FAILURE_LOG: Clsctx = 16384u

public val CLSCTX_PS_DLL: Clsctx = 2147483648u

public val CLSCTX_REMOTE_SERVER: Clsctx = 16u

public val CLSCTX_RESERVED1: Clsctx = 64u

public val CLSCTX_RESERVED2: Clsctx = 128u

public val CLSCTX_RESERVED3: Clsctx = 256u

public val CLSCTX_RESERVED4: Clsctx = 512u

public val CLSCTX_RESERVED5: Clsctx = 2048u

public val CLSCTX_RESERVED6: Clsctx = 16777216u

public val CLSCTX_SERVER: Clsctx = 21u

public val CLSID_GLOBAL_OPTIONS: Guid = Guid.fromU128(U128(0x34b00000000uL, 0xc000000000000046uL))

public val COINITBASE_MULTITHREADED: Coinitbase = 0

public val COINIT_APARTMENTTHREADED: Coinit = 2

public val COINIT_DISABLE_OLE1DDE: Coinit = 4

public val COINIT_MULTITHREADED: Coinit = 0

public val COINIT_SPEED_OVER_MEMORY: Coinit = 8

public val COLE_DEFAULT_AUTHINFO: Int = -1

public val COLE_DEFAULT_PRINCIPAL: Pcwstr = COpaquePointer((-1).toLong())

public val COMBND_RESERVED1: RpcoptProperties = 4

public val COMBND_RESERVED2: RpcoptProperties = 5

public val COMBND_RESERVED3: RpcoptProperties = 8

public val COMBND_RESERVED4: RpcoptProperties = 16

public val COMBND_RPCTIMEOUT: RpcoptProperties = 1

public val COMBND_SERVER_LOCALITY: RpcoptProperties = 2

public val COMGLB_APPID: GlobaloptProperties = 2

public val COMGLB_EXCEPTION_DONOT_HANDLE: GlobaloptEhValues = 1

public val COMGLB_EXCEPTION_DONOT_HANDLE_ANY: GlobaloptEhValues = 2

public val COMGLB_EXCEPTION_DONOT_HANDLE_FATAL: GlobaloptEhValues = 1

public val COMGLB_EXCEPTION_HANDLE: GlobaloptEhValues = 0

public val COMGLB_EXCEPTION_HANDLING: GlobaloptProperties = 1

public val COMGLB_FAST_RUNDOWN: GlobaloptRoFlags = 8

public val COMGLB_PROPERTIES_RESERVED1: GlobaloptProperties = 6

public val COMGLB_PROPERTIES_RESERVED2: GlobaloptProperties = 7

public val COMGLB_PROPERTIES_RESERVED3: GlobaloptProperties = 8

public val COMGLB_RESERVED1: GlobaloptRoFlags = 16

public val COMGLB_RESERVED2: GlobaloptRoFlags = 32

public val COMGLB_RESERVED3: GlobaloptRoFlags = 64

public val COMGLB_RESERVED4: GlobaloptRoFlags = 256

public val COMGLB_RESERVED5: GlobaloptRoFlags = 512

public val COMGLB_RESERVED6: GlobaloptRoFlags = 1024

public val COMGLB_RO_SETTINGS: GlobaloptProperties = 4

public val COMGLB_RPC_THREADPOOL_SETTING: GlobaloptProperties = 3

public val COMGLB_RPC_THREADPOOL_SETTING_DEFAULT_POOL: GlobaloptRpctpValues = 0

public val COMGLB_RPC_THREADPOOL_SETTING_PRIVATE_POOL: GlobaloptRpctpValues = 1

public val COMGLB_STA_MODALLOOP_REMOVE_TOUCH_MESSAGES: GlobaloptRoFlags = 1

public val COMGLB_STA_MODALLOOP_SHARED_QUEUE_DONOT_REMOVE_INPUT_MESSAGES: GlobaloptRoFlags = 4

public val COMGLB_STA_MODALLOOP_SHARED_QUEUE_REMOVE_INPUT_MESSAGES: GlobaloptRoFlags = 2

public val COMGLB_STA_MODALLOOP_SHARED_QUEUE_REORDER_POINTER_MESSAGES: GlobaloptRoFlags = 128

public val COMGLB_UNMARSHALING_POLICY: GlobaloptProperties = 5

public val COMGLB_UNMARSHALING_POLICY_HYBRID: GlobaloptUnmarshalingPolicyValues = 2

public val COMGLB_UNMARSHALING_POLICY_NORMAL: GlobaloptUnmarshalingPolicyValues = 0

public val COMGLB_UNMARSHALING_POLICY_STRONG: GlobaloptUnmarshalingPolicyValues = 1

public val COM_RIGHTS_ACTIVATE_LOCAL: UInt = 8u

public val COM_RIGHTS_ACTIVATE_REMOTE: UInt = 16u

public val COM_RIGHTS_EXECUTE: UInt = 1u

public val COM_RIGHTS_EXECUTE_LOCAL: UInt = 2u

public val COM_RIGHTS_EXECUTE_REMOTE: UInt = 4u

public val COM_RIGHTS_RESERVED1: UInt = 32u

public val COM_RIGHTS_RESERVED2: UInt = 64u

public val COWAIT_ALERTABLE: CowaitFlags = 2

public val COWAIT_DEFAULT: CowaitFlags = 0

public val COWAIT_DISPATCH_CALLS: CowaitFlags = 8

public val COWAIT_DISPATCH_WINDOW_MESSAGES: CowaitFlags = 16

public val COWAIT_INPUTAVAILABLE: CowaitFlags = 4

public val COWAIT_WAITALL: CowaitFlags = 1

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_1: CoMarshalingContextAttributes = -2147483648.toInt()

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_10: CoMarshalingContextAttributes = -2147483639

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_11: CoMarshalingContextAttributes = -2147483638

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_12: CoMarshalingContextAttributes = -2147483637

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_13: CoMarshalingContextAttributes = -2147483636

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_14: CoMarshalingContextAttributes = -2147483635

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_15: CoMarshalingContextAttributes = -2147483634

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_16: CoMarshalingContextAttributes = -2147483633

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_17: CoMarshalingContextAttributes = -2147483632

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_18: CoMarshalingContextAttributes = -2147483631

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_2: CoMarshalingContextAttributes = -2147483647

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_3: CoMarshalingContextAttributes = -2147483646

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_4: CoMarshalingContextAttributes = -2147483645

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_5: CoMarshalingContextAttributes = -2147483644

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_6: CoMarshalingContextAttributes = -2147483643

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_7: CoMarshalingContextAttributes = -2147483642

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_8: CoMarshalingContextAttributes = -2147483641

public val CO_MARSHALING_CONTEXT_ATTRIBUTE_RESERVED_9: CoMarshalingContextAttributes = -2147483640

public val CO_MARSHALING_SOURCE_IS_APP_CONTAINER: CoMarshalingContextAttributes = 0

public val CWMO_DEFAULT: CwmoFlags = 0

public val CWMO_DISPATCH_CALLS: CwmoFlags = 1

public val CWMO_DISPATCH_WINDOW_MESSAGES: CwmoFlags = 2

public val CWMO_MAX_HANDLES: UInt = 56u

public val DATADIR_GET: Datadir = 1

public val DATADIR_SET: Datadir = 2

public val DCOMSCM_ACTIVATION_DISALLOW_UNSECURE_CALL: UInt = 2u

public val DCOMSCM_ACTIVATION_USE_ALL_AUTHNSERVICES: UInt = 1u

public val DCOMSCM_PING_DISALLOW_UNSECURE_CALL: UInt = 32u

public val DCOMSCM_PING_USE_MID_AUTHNSERVICE: UInt = 16u

public val DCOMSCM_RESOLVE_DISALLOW_UNSECURE_CALL: UInt = 8u

public val DCOMSCM_RESOLVE_USE_ALL_AUTHNSERVICES: UInt = 4u

public val DCOM_CALL_CANCELED: DcomCallState = 2

public val DCOM_CALL_COMPLETE: DcomCallState = 1

public val DCOM_NONE: DcomCallState = 0

public val DESCKIND_FUNCDESC: Desckind = 1

public val DESCKIND_IMPLICITAPPOBJ: Desckind = 4

public val DESCKIND_MAX: Desckind = 5

public val DESCKIND_NONE: Desckind = 0

public val DESCKIND_TYPECOMP: Desckind = 3

public val DESCKIND_VARDESC: Desckind = 2

public val DISPATCH_METHOD: DispatchFlags = 1u.toUShort()

public val DISPATCH_PROPERTYGET: DispatchFlags = 2u.toUShort()

public val DISPATCH_PROPERTYPUT: DispatchFlags = 4u.toUShort()

public val DISPATCH_PROPERTYPUTREF: DispatchFlags = 8u.toUShort()

public val DMUS_ERRBASE: UInt = 4096u

public val DVASPECT_CONTENT: Dvaspect = 1u

public val DVASPECT_DOCPRINT: Dvaspect = 8u

public val DVASPECT_ICON: Dvaspect = 4u

public val DVASPECT_OPAQUE: Dvaspect = 16u

public val DVASPECT_THUMBNAIL: Dvaspect = 2u

public val DVASPECT_TRANSPARENT: Dvaspect = 32u

public val EOAC_ACCESS_CONTROL: EoleAuthenticationCapabilities = 4

public val EOAC_ANY_AUTHORITY: EoleAuthenticationCapabilities = 128

public val EOAC_APPID: EoleAuthenticationCapabilities = 8

public val EOAC_AUTO_IMPERSONATE: EoleAuthenticationCapabilities = 1024

public val EOAC_DEFAULT: EoleAuthenticationCapabilities = 2048

public val EOAC_DISABLE_AAA: EoleAuthenticationCapabilities = 4096

public val EOAC_DYNAMIC: EoleAuthenticationCapabilities = 16

public val EOAC_DYNAMIC_CLOAKING: EoleAuthenticationCapabilities = 64

public val EOAC_MAKE_FULLSIC: EoleAuthenticationCapabilities = 256

public val EOAC_MUTUAL_AUTH: EoleAuthenticationCapabilities = 1

public val EOAC_NONE: EoleAuthenticationCapabilities = 0

public val EOAC_NO_CUSTOM_MARSHAL: EoleAuthenticationCapabilities = 8192

public val EOAC_REQUIRE_FULLSIC: EoleAuthenticationCapabilities = 512

public val EOAC_RESERVED1: EoleAuthenticationCapabilities = 16384

public val EOAC_SECURE_REFS: EoleAuthenticationCapabilities = 2

public val EOAC_STATIC_CLOAKING: EoleAuthenticationCapabilities = 32

public val EXTCONN_CALLABLE: Extconn = 4

public val EXTCONN_STRONG: Extconn = 1

public val EXTCONN_WEAK: Extconn = 2

public val FADF_AUTO: AdvancedFeatureFlags = 1u.toUShort()

public val FADF_BSTR: AdvancedFeatureFlags = 256u.toUShort()

public val FADF_DISPATCH: AdvancedFeatureFlags = 1024u.toUShort()

public val FADF_EMBEDDED: AdvancedFeatureFlags = 4u.toUShort()

public val FADF_FIXEDSIZE: AdvancedFeatureFlags = 16u.toUShort()

public val FADF_HAVEIID: AdvancedFeatureFlags = 64u.toUShort()

public val FADF_HAVEVARTYPE: AdvancedFeatureFlags = 128u.toUShort()

public val FADF_RECORD: AdvancedFeatureFlags = 32u.toUShort()

public val FADF_RESERVED: AdvancedFeatureFlags = 61448u.toUShort()

public val FADF_STATIC: AdvancedFeatureFlags = 2u.toUShort()

public val FADF_UNKNOWN: AdvancedFeatureFlags = 512u.toUShort()

public val FADF_VARIANT: AdvancedFeatureFlags = 2048u.toUShort()

public val FUNCFLAG_FBINDABLE: Funcflags = 4u.toUShort()

public val FUNCFLAG_FDEFAULTBIND: Funcflags = 32u.toUShort()

public val FUNCFLAG_FDEFAULTCOLLELEM: Funcflags = 256u.toUShort()

public val FUNCFLAG_FDISPLAYBIND: Funcflags = 16u.toUShort()

public val FUNCFLAG_FHIDDEN: Funcflags = 64u.toUShort()

public val FUNCFLAG_FIMMEDIATEBIND: Funcflags = 4096u.toUShort()

public val FUNCFLAG_FNONBROWSABLE: Funcflags = 1024u.toUShort()

public val FUNCFLAG_FREPLACEABLE: Funcflags = 2048u.toUShort()

public val FUNCFLAG_FREQUESTEDIT: Funcflags = 8u.toUShort()

public val FUNCFLAG_FRESTRICTED: Funcflags = 1u.toUShort()

public val FUNCFLAG_FSOURCE: Funcflags = 2u.toUShort()

public val FUNCFLAG_FUIDEFAULT: Funcflags = 512u.toUShort()

public val FUNCFLAG_FUSESGETLASTERROR: Funcflags = 128u.toUShort()

public val FUNC_DISPATCH: Funckind = 4

public val FUNC_NONVIRTUAL: Funckind = 2

public val FUNC_PUREVIRTUAL: Funckind = 1

public val FUNC_STATIC: Funckind = 3

public val FUNC_VIRTUAL: Funckind = 0

public val FORCED_SHUTDOWN: ShutdownType = 1

public val IDLFLAG_FIN: Idlflags = 1u.toUShort()

public val IDLFLAG_FLCID: Idlflags = 4u.toUShort()

public val IDLFLAG_FOUT: Idlflags = 2u.toUShort()

public val IDLFLAG_FRETVAL: Idlflags = 8u.toUShort()

public val IDLFLAG_NONE: Idlflags = 0u.toUShort()

public val IMPLTYPEFLAG_FDEFAULT: Impltypeflags = 1

public val IMPLTYPEFLAG_FDEFAULTVTABLE: Impltypeflags = 8

public val IMPLTYPEFLAG_FRESTRICTED: Impltypeflags = 4

public val IMPLTYPEFLAG_FSOURCE: Impltypeflags = 2

public val INVOKE_FUNC: Invokekind = 1

public val INVOKE_PROPERTYGET: Invokekind = 2

public val INVOKE_PROPERTYPUT: Invokekind = 4

public val INVOKE_PROPERTYPUTREF: Invokekind = 8

public val IDLE_SHUTDOWN: ShutdownType = 0

public val LOCK_EXCLUSIVE: Locktype = 2

public val LOCK_ONLYONCE: Locktype = 4

public val LOCK_WRITE: Locktype = 1

public val LIBRARY_APPLICATION: ApplicationType = 1

public val MARSHALINTERFACE_MIN: UInt = 500u

public val MAXLSN: ULong = 9223372036854775807uL

public val MEMCTX_MACSYSTEM: Memctx = 3

public val MEMCTX_SAME: Memctx = -2

public val MEMCTX_SHARED: Memctx = 2

public val MEMCTX_TASK: Memctx = 1

public val MEMCTX_UNKNOWN: Memctx = -1

public val MKRREDUCE_ALL: Mkrreduce = 0

public val MKRREDUCE_ONE: Mkrreduce = 196608

public val MKRREDUCE_THROUGHUSER: Mkrreduce = 65536

public val MKRREDUCE_TOUSER: Mkrreduce = 131072

public val MKSYS_ANTIMONIKER: Mksys = 3

public val MKSYS_CLASSMONIKER: Mksys = 7

public val MKSYS_FILEMONIKER: Mksys = 2

public val MKSYS_GENERICCOMPOSITE: Mksys = 1

public val MKSYS_ITEMMONIKER: Mksys = 4

public val MKSYS_LUAMONIKER: Mksys = 10

public val MKSYS_NONE: Mksys = 0

public val MKSYS_OBJREFMONIKER: Mksys = 8

public val MKSYS_POINTERMONIKER: Mksys = 5

public val MKSYS_SESSIONMONIKER: Mksys = 9

public val MSHCTX_CONTAINER: Mshctx = 5

public val MSHCTX_CROSSCTX: Mshctx = 4

public val MSHCTX_DIFFERENTMACHINE: Mshctx = 2

public val MSHCTX_INPROC: Mshctx = 3

public val MSHCTX_LOCAL: Mshctx = 0

public val MSHCTX_NOSHAREDMEM: Mshctx = 1

public val MSHLFLAGS_NOPING: Mshlflags = 4

public val MSHLFLAGS_NORMAL: Mshlflags = 0

public val MSHLFLAGS_RESERVED1: Mshlflags = 8

public val MSHLFLAGS_RESERVED2: Mshlflags = 16

public val MSHLFLAGS_RESERVED3: Mshlflags = 32

public val MSHLFLAGS_RESERVED4: Mshlflags = 64

public val MSHLFLAGS_TABLESTRONG: Mshlflags = 1

public val MSHLFLAGS_TABLEWEAK: Mshlflags = 2

public val PENDINGMSG_CANCELCALL: Pendingmsg = 0

public val PENDINGMSG_WAITDEFPROCESS: Pendingmsg = 2

public val PENDINGMSG_WAITNOPROCESS: Pendingmsg = 1

public val PENDINGTYPE_NESTED: Pendingtype = 2

public val PENDINGTYPE_TOPLEVEL: Pendingtype = 1

public val REGCLS_AGILE: Regcls = 16

public val REGCLS_MULTIPLEUSE: Regcls = 1

public val REGCLS_MULTI_SEPARATE: Regcls = 2

public val REGCLS_SINGLEUSE: Regcls = 0

public val REGCLS_SURROGATE: Regcls = 8

public val REGCLS_SUSPENDED: Regcls = 4

public val ROTFLAGS_ALLOWANYCLIENT: RotFlags = 2u

public val ROTFLAGS_REGISTRATIONKEEPSALIVE: RotFlags = 1u

public val ROTREGFLAGS_ALLOWANYCLIENT: UInt = 1u

public val RPC_C_AUTHN_LEVEL_CALL: RpcCAuthnLevel = 3u

public val RPC_C_AUTHN_LEVEL_CONNECT: RpcCAuthnLevel = 2u

public val RPC_C_AUTHN_LEVEL_DEFAULT: RpcCAuthnLevel = 0u

public val RPC_C_AUTHN_LEVEL_NONE: RpcCAuthnLevel = 1u

public val RPC_C_AUTHN_LEVEL_PKT: RpcCAuthnLevel = 4u

public val RPC_C_AUTHN_LEVEL_PKT_INTEGRITY: RpcCAuthnLevel = 5u

public val RPC_C_AUTHN_LEVEL_PKT_PRIVACY: RpcCAuthnLevel = 6u

public val RPC_C_IMP_LEVEL_ANONYMOUS: RpcCImpLevel = 1u

public val RPC_C_IMP_LEVEL_DEFAULT: RpcCImpLevel = 0u

public val RPC_C_IMP_LEVEL_DELEGATE: RpcCImpLevel = 4u

public val RPC_C_IMP_LEVEL_IDENTIFY: RpcCImpLevel = 2u

public val RPC_C_IMP_LEVEL_IMPERSONATE: RpcCImpLevel = 3u

public val SD_ACCESSPERMISSIONS: Comsd = 1

public val SD_ACCESSRESTRICTIONS: Comsd = 3

public val SD_LAUNCHPERMISSIONS: Comsd = 0

public val SD_LAUNCHRESTRICTIONS: Comsd = 2

public val SERVERCALL_ISHANDLED: Servercall = 0

public val SERVERCALL_REJECTED: Servercall = 1

public val SERVERCALL_RETRYLATER: Servercall = 2

public val SERVER_LOCALITY_MACHINE_LOCAL: RpcoptServerLocalityValues = 1

public val SERVER_LOCALITY_PROCESS_LOCAL: RpcoptServerLocalityValues = 0

public val SERVER_LOCALITY_REMOTE: RpcoptServerLocalityValues = 2

public val STATFLAG_DEFAULT: Statflag = 0

public val STATFLAG_NONAME: Statflag = 1

public val STATFLAG_NOOPEN: Statflag = 2

public val STGC_CONSOLIDATE: Stgc = 8

public val STGC_DANGEROUSLYCOMMITMERELYTODISKCACHE: Stgc = 4

public val STGC_DEFAULT: Stgc = 0

public val STGC_ONLYIFCURRENT: Stgc = 2

public val STGC_OVERWRITE: Stgc = 1

public val STGM_CONVERT: Stgm = 131072u

public val STGM_CREATE: Stgm = 4096u

public val STGM_DELETEONRELEASE: Stgm = 67108864u

public val STGM_DIRECT: Stgm = 0u

public val STGM_DIRECT_SWMR: Stgm = 4194304u

public val STGM_FAILIFTHERE: Stgm = 0u

public val STGM_NOSCRATCH: Stgm = 1048576u

public val STGM_NOSNAPSHOT: Stgm = 2097152u

public val STGM_PRIORITY: Stgm = 262144u

public val STGM_READ: Stgm = 0u

public val STGM_READWRITE: Stgm = 2u

public val STGM_SHARE_DENY_NONE: Stgm = 64u

public val STGM_SHARE_DENY_READ: Stgm = 48u

public val STGM_SHARE_DENY_WRITE: Stgm = 32u

public val STGM_SHARE_EXCLUSIVE: Stgm = 16u

public val STGM_SIMPLE: Stgm = 134217728u

public val STGM_TRANSACTED: Stgm = 65536u

public val STGM_WRITE: Stgm = 1u

public val STGTY_LOCKBYTES: Stgty = 3

public val STGTY_PROPERTY: Stgty = 4

public val STGTY_REPEAT: Int = 256

public val STGTY_STORAGE: Stgty = 1

public val STGTY_STREAM: Stgty = 2

public val STG_LAYOUT_INTERLEAVED: Int = 1

public val STG_LAYOUT_SEQUENTIAL: Int = 0

public val STG_TOEND: Int = -1

public val STREAM_SEEK_CUR: StreamSeek = 1u

public val STREAM_SEEK_END: StreamSeek = 2u

public val STREAM_SEEK_SET: StreamSeek = 0u

public val SYS_MAC: Syskind = 2

public val SYS_WIN16: Syskind = 0

public val SYS_WIN32: Syskind = 1

public val SYS_WIN64: Syskind = 3

public val SERVER_APPLICATION: ApplicationType = 0

public val THDTYPE_BLOCKMESSAGES: Thdtype = 0

public val THDTYPE_PROCESSMESSAGES: Thdtype = 1

public val TKIND_ALIAS: Typekind = 6

public val TKIND_COCLASS: Typekind = 5

public val TKIND_DISPATCH: Typekind = 4

public val TKIND_ENUM: Typekind = 0

public val TKIND_INTERFACE: Typekind = 3

public val TKIND_MAX: Typekind = 8

public val TKIND_MODULE: Typekind = 2

public val TKIND_RECORD: Typekind = 1

public val TKIND_UNION: Typekind = 7

public val TYMED_ENHMF: Tymed = 64

public val TYMED_FILE: Tymed = 2

public val TYMED_GDI: Tymed = 16

public val TYMED_HGLOBAL: Tymed = 1

public val TYMED_ISTORAGE: Tymed = 8

public val TYMED_ISTREAM: Tymed = 4

public val TYMED_MFPICT: Tymed = 32

public val TYMED_NULL: Tymed = 0

public val TYSPEC_CLSID: Tyspec = 0

public val TYSPEC_FILEEXT: Tyspec = 1

public val TYSPEC_FILENAME: Tyspec = 3

public val TYSPEC_MIMETYPE: Tyspec = 2

public val TYSPEC_OBJECTID: Tyspec = 6

public val TYSPEC_PACKAGENAME: Tyspec = 5

public val TYSPEC_PROGID: Tyspec = 4

public val URI_CREATE_ALLOW_IMPLICIT_FILE_SCHEME: UriCreateFlags = 4u

public val URI_CREATE_ALLOW_IMPLICIT_WILDCARD_SCHEME: UriCreateFlags = 2u

public val URI_CREATE_ALLOW_RELATIVE: UriCreateFlags = 1u

public val URI_CREATE_CANONICALIZE: UriCreateFlags = 256u

public val URI_CREATE_CANONICALIZE_ABSOLUTE: UriCreateFlags = 131072u

public val URI_CREATE_CRACK_UNKNOWN_SCHEMES: UriCreateFlags = 512u

public val URI_CREATE_DECODE_EXTRA_INFO: UriCreateFlags = 64u

public val URI_CREATE_FILE_USE_DOS_PATH: UriCreateFlags = 32u

public val URI_CREATE_IE_SETTINGS: UriCreateFlags = 8192u

public val URI_CREATE_NOFRAG: UriCreateFlags = 8u

public val URI_CREATE_NORMALIZE_INTL_CHARACTERS: UriCreateFlags = 65536u

public val URI_CREATE_NO_CANONICALIZE: UriCreateFlags = 16u

public val URI_CREATE_NO_CRACK_UNKNOWN_SCHEMES: UriCreateFlags = 1024u

public val URI_CREATE_NO_DECODE_EXTRA_INFO: UriCreateFlags = 128u

public val URI_CREATE_NO_ENCODE_FORBIDDEN_CHARACTERS: UriCreateFlags = 32768u

public val URI_CREATE_NO_IE_SETTINGS: UriCreateFlags = 16384u

public val URI_CREATE_NO_PRE_PROCESS_HTML_URI: UriCreateFlags = 4096u

public val URI_CREATE_PRE_PROCESS_HTML_URI: UriCreateFlags = 2048u

public val URI_PROPERTY_ABSOLUTE_URI: UriProperty = 0

public val URI_PROPERTY_AUTHORITY: UriProperty = 1

public val URI_PROPERTY_DISPLAY_URI: UriProperty = 2

public val URI_PROPERTY_DOMAIN: UriProperty = 3

public val URI_PROPERTY_DWORD_LAST: UriProperty = 18

public val URI_PROPERTY_DWORD_START: UriProperty = 15

public val URI_PROPERTY_EXTENSION: UriProperty = 4

public val URI_PROPERTY_FRAGMENT: UriProperty = 5

public val URI_PROPERTY_HOST: UriProperty = 6

public val URI_PROPERTY_HOST_TYPE: UriProperty = 15

public val URI_PROPERTY_PASSWORD: UriProperty = 7

public val URI_PROPERTY_PATH: UriProperty = 8

public val URI_PROPERTY_PATH_AND_QUERY: UriProperty = 9

public val URI_PROPERTY_PORT: UriProperty = 16

public val URI_PROPERTY_QUERY: UriProperty = 10

public val URI_PROPERTY_RAW_URI: UriProperty = 11

public val URI_PROPERTY_SCHEME: UriProperty = 17

public val URI_PROPERTY_SCHEME_NAME: UriProperty = 12

public val URI_PROPERTY_STRING_LAST: UriProperty = 14

public val URI_PROPERTY_STRING_START: UriProperty = 0

public val URI_PROPERTY_USER_INFO: UriProperty = 13

public val URI_PROPERTY_USER_NAME: UriProperty = 14

public val URI_PROPERTY_ZONE: UriProperty = 18

public val VARFLAG_FBINDABLE: Varflags = 4u.toUShort()

public val VARFLAG_FDEFAULTBIND: Varflags = 32u.toUShort()

public val VARFLAG_FDEFAULTCOLLELEM: Varflags = 256u.toUShort()

public val VARFLAG_FDISPLAYBIND: Varflags = 16u.toUShort()

public val VARFLAG_FHIDDEN: Varflags = 64u.toUShort()

public val VARFLAG_FIMMEDIATEBIND: Varflags = 4096u.toUShort()

public val VARFLAG_FNONBROWSABLE: Varflags = 1024u.toUShort()

public val VARFLAG_FREADONLY: Varflags = 1u.toUShort()

public val VARFLAG_FREPLACEABLE: Varflags = 2048u.toUShort()

public val VARFLAG_FREQUESTEDIT: Varflags = 8u.toUShort()

public val VARFLAG_FRESTRICTED: Varflags = 128u.toUShort()

public val VARFLAG_FSOURCE: Varflags = 2u.toUShort()

public val VARFLAG_FUIDEFAULT: Varflags = 512u.toUShort()

public val VAR_CONST: Varkind = 2

public val VAR_DISPATCH: Varkind = 3

public val VAR_PERINSTANCE: Varkind = 0

public val VAR_STATIC: Varkind = 1
