// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCancelIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCancelIncident`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCloseIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCloseIncident`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateConnectivityIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreateConnectivityIncident`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateDNSIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreateDNSIncident`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `querytype` : UShort, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateGroupingIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `NdfCreateGroupingIncident`(`cloudname` : `windows_sys`.`core`.`PCWSTR`, `groupname` : `windows_sys`.`core`.`PCWSTR`, `identity` : `windows_sys`.`core`.`PCWSTR`, `invitation` : `windows_sys`.`core`.`PCWSTR`, `addresses` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Networking`.`WinSock`.`SOCKET_ADDRESS_LIST`>?, `appid` : `windows_sys`.`core`.`PCWSTR`, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreateIncident`(`helperclassname` : `windows_sys`.`core`.`PCWSTR`, `celt` : UInt, `attributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`HELPER_ATTRIBUTE`>?, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateNetConnectionIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreateNetConnectionIncident`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `id` : `windows_sys`.`core`.`GUID`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreatePnrpIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreatePnrpIncident`(`cloudname` : `windows_sys`.`core`.`PCWSTR`, `peername` : `windows_sys`.`core`.`PCWSTR`, `diagnosepublish` : `windows_sys`.`core`.`BOOL`, `appid` : `windows_sys`.`core`.`PCWSTR`, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateSharingIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreateSharingIncident`(`uncpath` : `windows_sys`.`core`.`PCWSTR`, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateWebIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreateWebIncident`(`url` : `windows_sys`.`core`.`PCWSTR`, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateWebIncidentEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfCreateWebIncidentEx`(`url` : `windows_sys`.`core`.`PCWSTR`, `usewinhttp` : `windows_sys`.`core`.`BOOL`, `modulename` : `windows_sys`.`core`.`PCWSTR`, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfCreateWinSockIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security"))]
public external fun `NdfCreateWinSockIncident`(`sock` : `super`.`super`.`Networking`.`WinSock`.`SOCKET`, `host` : `windows_sys`.`core`.`PCWSTR`, `port` : UShort, `appid` : `windows_sys`.`core`.`PCWSTR`, `userid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?, `handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfDiagnoseIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfDiagnoseIncident`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rootcausecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `rootcauses` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RootCauseInfo`>>?, `dwwait` : UInt, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfExecuteDiagnosis; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfExecuteDiagnosis`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfGetTraceFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfGetTraceFile`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tracefilelocation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ndfapi.dll, ABI=system, export=NdfRepairIncident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NdfRepairIncident`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `repairex` : /* Rust *const */ kotlinx.cinterop.CPointer<`RepairInfoEx`>?, `dwwait` : UInt) : `windows_sys`.`core`.`HRESULT`
public typealias `ATTRIBUTE_TYPE` = Int;
public const val `AT_BOOLEAN`: `ATTRIBUTE_TYPE` = 1;
public const val `AT_GUID`: `ATTRIBUTE_TYPE` = 11;
public const val `AT_INT16`: `ATTRIBUTE_TYPE` = 4;
public const val `AT_INT32`: `ATTRIBUTE_TYPE` = 6;
public const val `AT_INT64`: `ATTRIBUTE_TYPE` = 8;
public const val `AT_INT8`: `ATTRIBUTE_TYPE` = 2;
public const val `AT_INVALID`: `ATTRIBUTE_TYPE` = 0;
public const val `AT_LIFE_TIME`: `ATTRIBUTE_TYPE` = 12;
public const val `AT_OCTET_STRING`: `ATTRIBUTE_TYPE` = 14;
public const val `AT_SOCKADDR`: `ATTRIBUTE_TYPE` = 13;
public const val `AT_STRING`: `ATTRIBUTE_TYPE` = 10;
public const val `AT_UINT16`: `ATTRIBUTE_TYPE` = 5;
public const val `AT_UINT32`: `ATTRIBUTE_TYPE` = 7;
public const val `AT_UINT64`: `ATTRIBUTE_TYPE` = 9;
public const val `AT_UINT8`: `ATTRIBUTE_TYPE` = 3;
public const val `DF_IMPERSONATION`: UInt = 2147483648u;
public const val `DF_TRACELESS`: UInt = 1073741824u;
public typealias `DIAGNOSIS_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 126 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAG_SOCKADDR` (
    public var `family`: UShort,
    public var `data`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DIAG_SOCKADDR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DIAG_SOCKADDR`.Companion.`default`() : `DIAG_SOCKADDR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DS_CONFIRMED`: `DIAGNOSIS_STATUS` = 1;
public const val `DS_DEFERRED`: `DIAGNOSIS_STATUS` = 4;
public const val `DS_INDETERMINATE`: `DIAGNOSIS_STATUS` = 3;
public const val `DS_NOT_IMPLEMENTED`: `DIAGNOSIS_STATUS` = 0;
public const val `DS_PASSTHROUGH`: `DIAGNOSIS_STATUS` = 5;
public const val `DS_REJECTED`: `DIAGNOSIS_STATUS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DiagnosticsInfo` (
    public var `cost`: Int,
    public var `flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HELPER_ATTRIBUTE` (
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `type`: `ATTRIBUTE_TYPE`,
    public var `Anonymous`: `HELPER_ATTRIBUTE_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HELPER_ATTRIBUTE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HELPER_ATTRIBUTE`.Companion.`default`() : `HELPER_ATTRIBUTE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 73:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HELPER_ATTRIBUTE_0 {
//     pub Boolean: windows_sys::core::BOOL,
//     pub Char: u8,
//     pub Byte: u8,
//     pub Short: i16,
//     pub Word: u16,
//     pub Int: i32,
//     pub DWord: u32,
//     pub Int64: i64,
//     pub UInt64: u64,
//     pub PWStr: windows_sys::core::PWSTR,
//     pub Guid: windows_sys::core::GUID,
//     pub LifeTime: LIFE_TIME,
//     pub Address: DIAG_SOCKADDR,
//     pub OctetString: OCTET_STRING,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HELPER_ATTRIBUTE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HELPER_ATTRIBUTE_0`.Companion.`default`() : `HELPER_ATTRIBUTE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HYPOTHESIS` (
    public var `pwszClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `celt`: UInt,
    public var `rgAttributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HELPER_ATTRIBUTE`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HYPOTHESIS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HYPOTHESIS`.Companion.`default`() : `HYPOTHESIS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HelperAttributeInfo` (
    public var `pwszName`: `windows_sys`.`core`.`PWSTR`,
    public var `type`: `ATTRIBUTE_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HelperAttributeInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HelperAttributeInfo`.Companion.`default`() : `HelperAttributeInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HypothesisResult` (
    public var `hypothesis`: `HYPOTHESIS`,
    public var `pathStatus`: `DIAGNOSIS_STATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LIFE_TIME` (
    public var `startTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `endTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
public const val `NDF_ADD_CAPTURE_TRACE`: UInt = 1u;
public const val `NDF_APPLY_INCLUSION_LIST_FILTER`: UInt = 2u;
public const val `NDF_ERROR_START`: UInt = 63744u;
public const val `NDF_E_BAD_PARAM`: Int = -2146895611;
public const val `NDF_E_CANCELLED`: Int = -2146895614;
public const val `NDF_E_DISABLED`: Int = -2146895612;
public const val `NDF_E_LENGTH_EXCEEDED`: Int = -2146895616;
public const val `NDF_E_NOHELPERCLASS`: Int = -2146895615;
public const val `NDF_E_PROBLEM_PRESENT`: Int = -2146895608;
public const val `NDF_E_UNKNOWN`: Int = -2146895609;
public const val `NDF_E_VALIDATION`: Int = -2146895610;
public const val `NDF_INBOUND_FLAG_EDGETRAVERSAL`: UInt = 1u;
public const val `NDF_INBOUND_FLAG_HEALTHCHECK`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OCTET_STRING` (
    public var `dwLength`: UInt,
    public var `lpValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OCTET_STRING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OCTET_STRING`.Companion.`default`() : `OCTET_STRING` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PROBLEM_TYPE` = Int;
public const val `PT_DOWN_STREAM_HEALTH`: `PROBLEM_TYPE` = 4;
public const val `PT_HIGHER_UTILIZATION`: `PROBLEM_TYPE` = 16;
public const val `PT_HIGH_UTILIZATION`: `PROBLEM_TYPE` = 8;
public const val `PT_INVALID`: `PROBLEM_TYPE` = 0;
public const val `PT_LOWER_HEALTH`: `PROBLEM_TYPE` = 2;
public const val `PT_LOW_HEALTH`: `PROBLEM_TYPE` = 1;
public const val `PT_UP_STREAM_UTILIZATION`: `PROBLEM_TYPE` = 32;
public const val `RCF_ISCONFIRMED`: UInt = 2u;
public const val `RCF_ISLEAF`: UInt = 1u;
public const val `RCF_ISTHIRDPARTY`: UInt = 4u;
public typealias `REPAIR_RISK` = Int;
public typealias `REPAIR_SCOPE` = Int;
public typealias `REPAIR_STATUS` = Int;
public const val `RF_CONTACT_ADMIN`: UInt = 131072u;
public const val `RF_INFORMATION_ONLY`: UInt = 33554432u;
public const val `RF_REPRO`: UInt = 2097152u;
public const val `RF_RESERVED`: UInt = 1073741824u;
public const val `RF_RESERVED_CA`: UInt = 2147483648u;
public const val `RF_RESERVED_LNI`: UInt = 65536u;
public const val `RF_SHOW_EVENTS`: UInt = 8388608u;
public const val `RF_UI_ONLY`: UInt = 16777216u;
public const val `RF_USER_ACTION`: UInt = 268435456u;
public const val `RF_USER_CONFIRMATION`: UInt = 134217728u;
public const val `RF_VALIDATE_HELPTOPIC`: UInt = 4194304u;
public const val `RF_WORKAROUND`: UInt = 536870912u;
public const val `RR_NORISK`: `REPAIR_RISK` = 2;
public const val `RR_NOROLLBACK`: `REPAIR_RISK` = 0;
public const val `RR_ROLLBACK`: `REPAIR_RISK` = 1;
public const val `RS_APPLICATION`: `REPAIR_SCOPE` = 2;
public const val `RS_DEFERRED`: `REPAIR_STATUS` = 3;
public const val `RS_NOT_IMPLEMENTED`: `REPAIR_STATUS` = 0;
public const val `RS_PROCESS`: `REPAIR_SCOPE` = 3;
public const val `RS_REPAIRED`: `REPAIR_STATUS` = 1;
public const val `RS_SYSTEM`: `REPAIR_SCOPE` = 0;
public const val `RS_UNREPAIRED`: `REPAIR_STATUS` = 2;
public const val `RS_USER`: `REPAIR_SCOPE` = 1;
public const val `RS_USER_ACTION`: `REPAIR_STATUS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RepairInfo` (
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `pwszClassName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `sidType`: UInt,
    public var `cost`: Int,
    public var `flags`: UInt,
    public var `scope`: `REPAIR_SCOPE`,
    public var `risk`: `REPAIR_RISK`,
    public var `UiInfo`: `UiInfo`,
    public var `rootCauseIndex`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RepairInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RepairInfo`.Companion.`default`() : `RepairInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RepairInfoEx` (
    public var `repair`: `RepairInfo`,
    public var `repairRank`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RepairInfoEx`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RepairInfoEx`.Companion.`default`() : `RepairInfoEx` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RootCauseInfo` (
    public var `pwszDescription`: `windows_sys`.`core`.`PWSTR`,
    public var `rootCauseID`: `windows_sys`.`core`.`GUID`,
    public var `rootCauseFlags`: UInt,
    public var `networkInterfaceID`: `windows_sys`.`core`.`GUID`,
    public var `pRepairs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`RepairInfoEx`>?,
    public var `repairCount`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RootCauseInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RootCauseInfo`.Companion.`default`() : `RootCauseInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ShellCommandInfo` (
    public var `pwszOperation`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszFile`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszParameters`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszDirectory`: `windows_sys`.`core`.`PWSTR`,
    public var `nShowCmd`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ShellCommandInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ShellCommandInfo`.Companion.`default`() : `ShellCommandInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `UIT_DUI`: `UI_INFO_TYPE` = 4;
public const val `UIT_HELP_PANE`: `UI_INFO_TYPE` = 3;
public const val `UIT_INVALID`: `UI_INFO_TYPE` = 0;
public const val `UIT_NONE`: `UI_INFO_TYPE` = 1;
public const val `UIT_SHELL_COMMAND`: `UI_INFO_TYPE` = 2;
public typealias `UI_INFO_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UiInfo` (
    public var `type`: `UI_INFO_TYPE`,
    public var `Anonymous`: `UiInfo_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `UiInfo`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `UiInfo`.Companion.`default`() : `UiInfo` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 270:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union UiInfo_0 {
//     pub pwzNull: windows_sys::core::PWSTR,
//     pub ShellInfo: ShellCommandInfo,
//     pub pwzHelpUrl: windows_sys::core::PWSTR,
//     pub pwzDui: windows_sys::core::PWSTR,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `UiInfo_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `UiInfo_0`.Companion.`default`() : `UiInfo_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

