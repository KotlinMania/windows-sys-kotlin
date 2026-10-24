// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xolehlp.dll, ABI=C, export=DtcGetTransactionManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DtcGetTransactionManager`(`i_pszhost` : `windows_sys`.`core`.`PCSTR`, `i_psztmname` : `windows_sys`.`core`.`PCSTR`, `i_riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `i_dwreserved1` : UInt, `i_wcbreserved2` : UShort, `i_pvreserved2` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `o_ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xolehlp.dll, ABI=C, export=DtcGetTransactionManagerC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DtcGetTransactionManagerC`(`i_pszhost` : `windows_sys`.`core`.`PCSTR`, `i_psztmname` : `windows_sys`.`core`.`PCSTR`, `i_riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `i_dwreserved1` : UInt, `i_wcbreserved2` : UShort, `i_pvreserved2` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `o_ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xolehlp.dll, ABI=C, export=DtcGetTransactionManagerExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DtcGetTransactionManagerExA`(`i_pszhost` : `windows_sys`.`core`.`PCSTR`, `i_psztmname` : `windows_sys`.`core`.`PCSTR`, `i_riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `i_grfoptions` : UInt, `i_pvconfigparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `o_ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xolehlp.dll, ABI=C, export=DtcGetTransactionManagerExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DtcGetTransactionManagerExW`(`i_pwszhost` : `windows_sys`.`core`.`PCWSTR`, `i_pwsztmname` : `windows_sys`.`core`.`PCWSTR`, `i_riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `i_grfoptions` : UInt, `i_pvconfigparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `o_ppvobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
public typealias `APPLICATIONTYPE` = Int;
public typealias `AUTHENTICATION_LEVEL` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BOID` (
    public var `rgb`: UByteArray,
)
// UNSUPPORTED Rust 12:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BOID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 17:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_MSDtcTransaction: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x39f8d76b_0928_11d1_97df_00c04fb9618a);

// UNSUPPORTED Rust 18:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_MSDtcTransactionManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5b18ab61_091d_11d1_97df_00c04fb9618a);

public const val `CLUSTERRESOURCE_APPLICATIONTYPE`: `APPLICATIONTYPE` = 1;
public typealias `DTCINITIATEDRECOVERYWORK` = Int;
public const val `DTCINITIATEDRECOVERYWORK_CHECKLUSTATUS`: `DTCINITIATEDRECOVERYWORK` = 1;
public const val `DTCINITIATEDRECOVERYWORK_TMDOWN`: `DTCINITIATEDRECOVERYWORK` = 3;
public const val `DTCINITIATEDRECOVERYWORK_TRANS`: `DTCINITIATEDRECOVERYWORK` = 2;
public const val `DTCINSTALL_E_CLIENT_ALREADY_INSTALLED`: Int = 384;
public const val `DTCINSTALL_E_SERVER_ALREADY_INSTALLED`: Int = 385;
public typealias `DTCLUCOMPARESTATE` = Int;
public typealias `DTCLUCOMPARESTATESCONFIRMATION` = Int;
public const val `DTCLUCOMPARESTATESCONFIRMATION_CONFIRM`: `DTCLUCOMPARESTATESCONFIRMATION` = 1;
public const val `DTCLUCOMPARESTATESCONFIRMATION_PROTOCOL`: `DTCLUCOMPARESTATESCONFIRMATION` = 2;
public typealias `DTCLUCOMPARESTATESERROR` = Int;
public const val `DTCLUCOMPARESTATESERROR_PROTOCOL`: `DTCLUCOMPARESTATESERROR` = 1;
public typealias `DTCLUCOMPARESTATESRESPONSE` = Int;
public const val `DTCLUCOMPARESTATESRESPONSE_OK`: `DTCLUCOMPARESTATESRESPONSE` = 1;
public const val `DTCLUCOMPARESTATESRESPONSE_PROTOCOL`: `DTCLUCOMPARESTATESRESPONSE` = 2;
public const val `DTCLUCOMPARESTATE_COMMITTED`: `DTCLUCOMPARESTATE` = 1;
public const val `DTCLUCOMPARESTATE_HEURISTICCOMMITTED`: `DTCLUCOMPARESTATE` = 2;
public const val `DTCLUCOMPARESTATE_HEURISTICMIXED`: `DTCLUCOMPARESTATE` = 3;
public const val `DTCLUCOMPARESTATE_HEURISTICRESET`: `DTCLUCOMPARESTATE` = 4;
public const val `DTCLUCOMPARESTATE_INDOUBT`: `DTCLUCOMPARESTATE` = 5;
public const val `DTCLUCOMPARESTATE_RESET`: `DTCLUCOMPARESTATE` = 6;
public typealias `DTCLUXLN` = Int;
public typealias `DTCLUXLNCONFIRMATION` = Int;
public const val `DTCLUXLNCONFIRMATION_COLDWARMMISMATCH`: `DTCLUXLNCONFIRMATION` = 3;
public const val `DTCLUXLNCONFIRMATION_CONFIRM`: `DTCLUXLNCONFIRMATION` = 1;
public const val `DTCLUXLNCONFIRMATION_LOGNAMEMISMATCH`: `DTCLUXLNCONFIRMATION` = 2;
public const val `DTCLUXLNCONFIRMATION_OBSOLETE`: `DTCLUXLNCONFIRMATION` = 4;
public typealias `DTCLUXLNERROR` = Int;
public const val `DTCLUXLNERROR_COLDWARMMISMATCH`: `DTCLUXLNERROR` = 3;
public const val `DTCLUXLNERROR_LOGNAMEMISMATCH`: `DTCLUXLNERROR` = 2;
public const val `DTCLUXLNERROR_PROTOCOL`: `DTCLUXLNERROR` = 1;
public typealias `DTCLUXLNRESPONSE` = Int;
public const val `DTCLUXLNRESPONSE_COLDWARMMISMATCH`: `DTCLUXLNRESPONSE` = 4;
public const val `DTCLUXLNRESPONSE_LOGNAMEMISMATCH`: `DTCLUXLNRESPONSE` = 3;
public const val `DTCLUXLNRESPONSE_OK_SENDCONFIRMATION`: `DTCLUXLNRESPONSE` = 2;
public const val `DTCLUXLNRESPONSE_OK_SENDOURXLNBACK`: `DTCLUXLNRESPONSE` = 1;
public const val `DTCLUXLN_COLD`: `DTCLUXLN` = 1;
public const val `DTCLUXLN_WARM`: `DTCLUXLN` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DTC_GET_TRANSACTION_MANAGER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, UInt, UShort, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DTC_GET_TRANSACTION_MANAGER_EX_A` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DTC_GET_TRANSACTION_MANAGER_EX_W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DTC_INSTALL_CLIENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, UInt, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `DTC_INSTALL_OVERWRITE_CLIENT`: UInt = 1u;
public const val `DTC_INSTALL_OVERWRITE_SERVER`: UInt = 2u;
public typealias `DTC_STATUS_` = Int;
public const val `DTC_STATUS_CONTINUING`: `DTC_STATUS_` = 5;
public const val `DTC_STATUS_E_CANTCONTROL`: `DTC_STATUS_` = 8;
public const val `DTC_STATUS_FAILED`: `DTC_STATUS_` = 9;
public const val `DTC_STATUS_PAUSED`: `DTC_STATUS_` = 4;
public const val `DTC_STATUS_PAUSING`: `DTC_STATUS_` = 3;
public const val `DTC_STATUS_STARTED`: `DTC_STATUS_` = 2;
public const val `DTC_STATUS_STARTING`: `DTC_STATUS_` = 1;
public const val `DTC_STATUS_STOPPED`: `DTC_STATUS_` = 7;
public const val `DTC_STATUS_STOPPING`: `DTC_STATUS_` = 6;
public const val `DTC_STATUS_UNKNOWN`: `DTC_STATUS_` = 0;
public const val `INCOMING_AUTHENTICATION_REQUIRED`: `AUTHENTICATION_LEVEL` = 1;
public typealias `ISOFLAG` = Int;
public const val `ISOFLAG_OPTIMISTIC`: `ISOFLAG` = 16;
public const val `ISOFLAG_READONLY`: `ISOFLAG` = 32;
public const val `ISOFLAG_RETAIN_ABORT`: `ISOFLAG` = 8;
public const val `ISOFLAG_RETAIN_ABORT_DC`: `ISOFLAG` = 4;
public const val `ISOFLAG_RETAIN_ABORT_NO`: `ISOFLAG` = 12;
public const val `ISOFLAG_RETAIN_BOTH`: `ISOFLAG` = 10;
public const val `ISOFLAG_RETAIN_COMMIT`: `ISOFLAG` = 2;
public const val `ISOFLAG_RETAIN_COMMIT_DC`: `ISOFLAG` = 1;
public const val `ISOFLAG_RETAIN_COMMIT_NO`: `ISOFLAG` = 3;
public const val `ISOFLAG_RETAIN_DONTCARE`: `ISOFLAG` = 5;
public const val `ISOFLAG_RETAIN_NONE`: `ISOFLAG` = 15;
public typealias `ISOLATIONLEVEL` = Int;
public const val `ISOLATIONLEVEL_BROWSE`: `ISOLATIONLEVEL` = 256;
public const val `ISOLATIONLEVEL_CHAOS`: `ISOLATIONLEVEL` = 16;
public const val `ISOLATIONLEVEL_CURSORSTABILITY`: `ISOLATIONLEVEL` = 4096;
public const val `ISOLATIONLEVEL_ISOLATED`: `ISOLATIONLEVEL` = 1048576;
public const val `ISOLATIONLEVEL_READCOMMITTED`: `ISOLATIONLEVEL` = 4096;
public const val `ISOLATIONLEVEL_READUNCOMMITTED`: `ISOLATIONLEVEL` = 256;
public const val `ISOLATIONLEVEL_REPEATABLEREAD`: `ISOLATIONLEVEL` = 65536;
public const val `ISOLATIONLEVEL_SERIALIZABLE`: `ISOLATIONLEVEL` = 1048576;
public const val `ISOLATIONLEVEL_UNSPECIFIED`: `ISOLATIONLEVEL` = -1;
public const val `LOCAL_APPLICATIONTYPE`: `APPLICATIONTYPE` = 0;
public const val `MAXBQUALSIZE`: UInt = 64u;
public const val `MAXGTRIDSIZE`: UInt = 64u;
public const val `MAXINFOSIZE`: UInt = 256u;
public const val `MAX_TRAN_DESC`: `TX_MISC_CONSTANTS` = 40;
public const val `MUTUAL_AUTHENTICATION_REQUIRED`: `AUTHENTICATION_LEVEL` = 2;
public const val `NO_AUTHENTICATION_REQUIRED`: `AUTHENTICATION_LEVEL` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OLE_TM_CONFIG_PARAMS_V1` (
    public var `dwVersion`: UInt,
    public var `dwcConcurrencyHint`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OLE_TM_CONFIG_PARAMS_V2` (
    public var `dwVersion`: UInt,
    public var `dwcConcurrencyHint`: UInt,
    public var `applicationType`: `APPLICATIONTYPE`,
    public var `clusterResourceId`: `windows_sys`.`core`.`GUID`,
)
public const val `OLE_TM_CONFIG_VERSION_1`: UInt = 1u;
public const val `OLE_TM_CONFIG_VERSION_2`: UInt = 2u;
public const val `OLE_TM_FLAG_INTERNAL_TO_TM`: UInt = 1073741824u;
public const val `OLE_TM_FLAG_NOAGILERECOVERY`: UInt = 2u;
public const val `OLE_TM_FLAG_NODEMANDSTART`: UInt = 1u;
public const val `OLE_TM_FLAG_NONE`: UInt = 0u;
public const val `OLE_TM_FLAG_QUERY_SERVICE_LOCKSTATUS`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROXY_CONFIG_PARAMS` (
    public var `wcThreadsMax`: UShort,
)
public const val `RMNAMESZ`: UInt = 32u;
public const val `TMASYNC`: Int = -2147483648;
public const val `TMENDRSCAN`: Int = 8388608;
public const val `TMER_INVAL`: Int = -2;
public const val `TMER_PROTO`: Int = -3;
public const val `TMER_TMERR`: Int = -1;
public const val `TMFAIL`: Int = 536870912;
public const val `TMJOIN`: Int = 2097152;
public const val `TMMIGRATE`: Int = 1048576;
public const val `TMMULTIPLE`: Int = 4194304;
public const val `TMNOFLAGS`: Int = 0;
public const val `TMNOMIGRATE`: Int = 2;
public const val `TMNOWAIT`: Int = 268435456;
public const val `TMONEPHASE`: Int = 1073741824;
public const val `TMREGISTER`: Int = 1;
public const val `TMRESUME`: Int = 134217728;
public const val `TMSTARTRSCAN`: Int = 16777216;
public const val `TMSUCCESS`: Int = 67108864;
public const val `TMSUSPEND`: Int = 33554432;
public const val `TMUSEASYNC`: Int = 4;
public const val `TM_JOIN`: UInt = 2u;
public const val `TM_OK`: UInt = 0u;
public const val `TM_RESUME`: UInt = 1u;
public typealias `TX_MISC_CONSTANTS` = Int;
public typealias `XACTCONST` = Int;
public const val `XACTCONST_TIMEOUTINFINITE`: `XACTCONST` = 0;
public typealias `XACTHEURISTIC` = Int;
public const val `XACTHEURISTIC_ABORT`: `XACTHEURISTIC` = 1;
public const val `XACTHEURISTIC_COMMIT`: `XACTHEURISTIC` = 2;
public const val `XACTHEURISTIC_DAMAGE`: `XACTHEURISTIC` = 3;
public const val `XACTHEURISTIC_DANGER`: `XACTHEURISTIC` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XACTOPT` (
    public var `ulTimeout`: UInt,
    public var `szDescription`: UByteArray,
)
// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XACTOPT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `XACTRM` = Int;
public const val `XACTRM_NOREADONLYPREPARES`: `XACTRM` = 2;
public const val `XACTRM_OPTIMISTICLASTWINS`: `XACTRM` = 1;
public typealias `XACTSTAT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XACTSTATS` (
    public var `cOpen`: UInt,
    public var `cCommitting`: UInt,
    public var `cCommitted`: UInt,
    public var `cAborting`: UInt,
    public var `cAborted`: UInt,
    public var `cInDoubt`: UInt,
    public var `cHeuristicDecision`: UInt,
    public var `timeTransactionsUp`: `super`.`super`.`Foundation`.`FILETIME`,
)
public const val `XACTSTAT_ABORTED`: `XACTSTAT` = 512;
public const val `XACTSTAT_ABORTING`: `XACTSTAT` = 256;
public const val `XACTSTAT_ALL`: `XACTSTAT` = 524287;
public const val `XACTSTAT_CLOSED`: `XACTSTAT` = 262144;
public const val `XACTSTAT_COMMITRETAINING`: `XACTSTAT` = 128;
public const val `XACTSTAT_COMMITTED`: `XACTSTAT` = 1024;
public const val `XACTSTAT_COMMITTING`: `XACTSTAT` = 64;
public const val `XACTSTAT_FORCED_ABORT`: `XACTSTAT` = 32768;
public const val `XACTSTAT_FORCED_COMMIT`: `XACTSTAT` = 65536;
public const val `XACTSTAT_HEURISTIC_ABORT`: `XACTSTAT` = 2048;
public const val `XACTSTAT_HEURISTIC_COMMIT`: `XACTSTAT` = 4096;
public const val `XACTSTAT_HEURISTIC_DAMAGE`: `XACTSTAT` = 8192;
public const val `XACTSTAT_HEURISTIC_DANGER`: `XACTSTAT` = 16384;
public const val `XACTSTAT_INDOUBT`: `XACTSTAT` = 131072;
public const val `XACTSTAT_NONE`: `XACTSTAT` = 0;
public const val `XACTSTAT_NOTPREPARED`: `XACTSTAT` = 524227;
public const val `XACTSTAT_OPEN`: `XACTSTAT` = 3;
public const val `XACTSTAT_OPENNORMAL`: `XACTSTAT` = 1;
public const val `XACTSTAT_OPENREFUSED`: `XACTSTAT` = 2;
public const val `XACTSTAT_PREPARED`: `XACTSTAT` = 8;
public const val `XACTSTAT_PREPARERETAINED`: `XACTSTAT` = 32;
public const val `XACTSTAT_PREPARERETAINING`: `XACTSTAT` = 16;
public const val `XACTSTAT_PREPARING`: `XACTSTAT` = 4;
public typealias `XACTTC` = Int;
public const val `XACTTC_ASYNC`: `XACTTC` = 4;
public const val `XACTTC_ASYNC_PHASEONE`: `XACTTC` = 4;
public const val `XACTTC_NONE`: `XACTTC` = 0;
public const val `XACTTC_SYNC`: `XACTTC` = 2;
public const val `XACTTC_SYNC_PHASEONE`: `XACTTC` = 1;
public const val `XACTTC_SYNC_PHASETWO`: `XACTTC` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XACTTRANSINFO` (
    public var `uow`: `BOID`,
    public var `isoLevel`: Int,
    public var `isoFlags`: UInt,
    public var `grfTCSupported`: UInt,
    public var `grfRMSupported`: UInt,
    public var `grfTCSupportedRetaining`: UInt,
    public var `grfRMSupportedRetaining`: UInt,
)
public typealias `XACT_DTC_CONSTANTS` = Int;
public const val `XACT_E_CONNECTION_REQUEST_DENIED`: `XACT_DTC_CONSTANTS` = -2147168000;
public const val `XACT_E_DUPLICATE_GUID`: `XACT_DTC_CONSTANTS` = -2147167998;
public const val `XACT_E_DUPLICATE_LU`: `XACT_DTC_CONSTANTS` = -2147167991;
public const val `XACT_E_DUPLICATE_TRANSID`: `XACT_DTC_CONSTANTS` = -2147167989;
public const val `XACT_E_LRMRECOVERYALREADYDONE`: `XACT_DTC_CONSTANTS` = -2147167982;
public const val `XACT_E_LU_BUSY`: `XACT_DTC_CONSTANTS` = -2147167988;
public const val `XACT_E_LU_DOWN`: `XACT_DTC_CONSTANTS` = -2147167986;
public const val `XACT_E_LU_NOT_CONNECTED`: `XACT_DTC_CONSTANTS` = -2147167990;
public const val `XACT_E_LU_NOT_FOUND`: `XACT_DTC_CONSTANTS` = -2147167992;
public const val `XACT_E_LU_NO_RECOVERY_PROCESS`: `XACT_DTC_CONSTANTS` = -2147167987;
public const val `XACT_E_LU_RECOVERING`: `XACT_DTC_CONSTANTS` = -2147167985;
public const val `XACT_E_LU_RECOVERY_MISMATCH`: `XACT_DTC_CONSTANTS` = -2147167984;
public const val `XACT_E_NOLASTRESOURCEINTERFACE`: `XACT_DTC_CONSTANTS` = -2147167981;
public const val `XACT_E_NOTSINGLEPHASE`: `XACT_DTC_CONSTANTS` = -2147167997;
public const val `XACT_E_PROTOCOL`: `XACT_DTC_CONSTANTS` = -2147167995;
public const val `XACT_E_RECOVERYALREADYDONE`: `XACT_DTC_CONSTANTS` = -2147167996;
public const val `XACT_E_RECOVERY_FAILED`: `XACT_DTC_CONSTANTS` = -2147167993;
public const val `XACT_E_RM_FAILURE`: `XACT_DTC_CONSTANTS` = -2147167994;
public const val `XACT_E_RM_UNAVAILABLE`: `XACT_DTC_CONSTANTS` = -2147167983;
public const val `XACT_E_TOOMANY_ENLISTMENTS`: `XACT_DTC_CONSTANTS` = -2147167999;
public const val `XACT_OK_NONOTIFY`: `XACT_DTC_CONSTANTS` = 315649;
public const val `XACT_S_NONOTIFY`: `XACT_DTC_CONSTANTS` = 315648;
public const val `XAER_ASYNC`: Int = -2;
public const val `XAER_DUPID`: Int = -8;
public const val `XAER_INVAL`: Int = -5;
public const val `XAER_NOTA`: Int = -4;
public const val `XAER_OUTSIDE`: Int = -9;
public const val `XAER_PROTO`: Int = -6;
public const val `XAER_RMERR`: Int = -3;
public const val `XAER_RMFAIL`: Int = -7;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_CLOSE_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, Int, Int) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_COMMIT_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`XID`>?, Int, Int) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_COMPLETE_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, Int, Int) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_END_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`XID`>?, Int, Int) -> Int>>>;
public const val `XA_FMTID_DTC`: UInt = 4478019u;
public const val `XA_FMTID_DTC_VER1`: UInt = 21255235u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_FORGET_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`XID`>?, Int, Int) -> Int>>>;
public const val `XA_HEURCOM`: UInt = 7u;
public const val `XA_HEURHAZ`: UInt = 8u;
public const val `XA_HEURMIX`: UInt = 5u;
public const val `XA_HEURRB`: UInt = 6u;
public const val `XA_NOMIGRATE`: UInt = 9u;
public const val `XA_OK`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_OPEN_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, Int, Int) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_PREPARE_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`XID`>?, Int, Int) -> Int>>>;
public const val `XA_RBBASE`: UInt = 100u;
public const val `XA_RBCOMMFAIL`: UInt = 101u;
public const val `XA_RBDEADLOCK`: UInt = 102u;
public const val `XA_RBEND`: UInt = 107u;
public const val `XA_RBINTEGRITY`: UInt = 103u;
public const val `XA_RBOTHER`: UInt = 104u;
public const val `XA_RBPROTO`: UInt = 105u;
public const val `XA_RBROLLBACK`: UInt = 100u;
public const val `XA_RBTIMEOUT`: UInt = 106u;
public const val `XA_RBTRANSIENT`: UInt = 107u;
public const val `XA_RDONLY`: UInt = 3u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_RECOVER_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`XID`>?, Int, Int, Int) -> Int>>>;
public const val `XA_RETRY`: UInt = 4u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_ROLLBACK_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`XID`>?, Int, Int) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `XA_START_EPT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`XID`>?, Int, Int) -> Int>>>;
public const val `XA_SWITCH_F_DTC`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XID` (
    public var `formatID`: Int,
    public var `gtrid_length`: Int,
    public var `bqual_length`: Int,
    public var `data`: ByteArray,
)
// UNSUPPORTED Rust 300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `XIDDATASIZE`: UInt = 128u;
public const val `dwUSER_MS_SQLSERVER`: `XACT_DTC_CONSTANTS` = 65535;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `xa_switch_t` (
    public var `name`: ByteArray,
    public var `flags`: Int,
    public var `version`: Int,
    public var `xa_open_entry`: Long,
    public var `xa_close_entry`: Long,
    public var `xa_start_entry`: Long,
    public var `xa_end_entry`: Long,
    public var `xa_rollback_entry`: Long,
    public var `xa_prepare_entry`: Long,
    public var `xa_commit_entry`: Long,
    public var `xa_recover_entry`: Long,
    public var `xa_forget_entry`: Long,
    public var `xa_complete_entry`: Long,
)
// UNSUPPORTED Rust 324:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for xa_switch_t {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

