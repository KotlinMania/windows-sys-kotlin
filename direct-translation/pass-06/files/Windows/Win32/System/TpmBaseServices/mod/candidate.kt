// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=GetDeviceID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDeviceID`(`pbwindowsaik` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbwindowsaik` : UInt, `pcbresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfprotectedbytpm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=GetDeviceIDString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDeviceIDString`(`pszwindowsaik` : `windows_sys`.`core`.`PWSTR`, `cchwindowsaik` : UInt, `pcchresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfprotectedbytpm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Context_Create; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Context_Create`(`pcontextparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`TBS_CONTEXT_PARAMS`>?, `phcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Create_Windows_Key; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Create_Windows_Key`(`keyhandle` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_GetDeviceInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_GetDeviceInfo`(`size` : UInt, `info` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Get_OwnerAuth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Get_OwnerAuth`(`hcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ownerauthtype` : UInt, `poutputbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `poutputbuflen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Get_TCG_Log; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Get_TCG_Log`(`hcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `poutputbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `poutputbuflen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Get_TCG_Log_Ex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Get_TCG_Log_Ex`(`logtype` : UInt, `pboutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcboutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Is_Tpm_Present; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Is_Tpm_Present`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Physical_Presence_Command; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Physical_Presence_Command`(`hcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pabinput` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbinput` : UInt, `paboutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcboutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsi_Revoke_Attestation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsi_Revoke_Attestation`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsip_Cancel_Commands; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsip_Cancel_Commands`(`hcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsip_Context_Close; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsip_Context_Close`(`hcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tbs.dll, ABI=system, export=Tbsip_Submit_Command; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Tbsip_Submit_Command`(`hcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `locality` : `TBS_COMMAND_LOCALITY`, `priority` : `TBS_COMMAND_PRIORITY`, `pabcommand` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbcommand` : UInt, `pabresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
public typealias `TBS_COMMAND_LOCALITY` = UInt;
public const val `TBS_COMMAND_LOCALITY_FOUR`: `TBS_COMMAND_LOCALITY` = 4u;
public const val `TBS_COMMAND_LOCALITY_ONE`: `TBS_COMMAND_LOCALITY` = 1u;
public const val `TBS_COMMAND_LOCALITY_THREE`: `TBS_COMMAND_LOCALITY` = 3u;
public const val `TBS_COMMAND_LOCALITY_TWO`: `TBS_COMMAND_LOCALITY` = 2u;
public const val `TBS_COMMAND_LOCALITY_ZERO`: `TBS_COMMAND_LOCALITY` = 0u;
public typealias `TBS_COMMAND_PRIORITY` = UInt;
public const val `TBS_COMMAND_PRIORITY_HIGH`: `TBS_COMMAND_PRIORITY` = 300u;
public const val `TBS_COMMAND_PRIORITY_LOW`: `TBS_COMMAND_PRIORITY` = 100u;
public const val `TBS_COMMAND_PRIORITY_MAX`: `TBS_COMMAND_PRIORITY` = 2147483648u;
public const val `TBS_COMMAND_PRIORITY_NORMAL`: `TBS_COMMAND_PRIORITY` = 200u;
public const val `TBS_COMMAND_PRIORITY_SYSTEM`: `TBS_COMMAND_PRIORITY` = 400u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TBS_CONTEXT_PARAMS` (
    public var `version`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TBS_CONTEXT_PARAMS2` (
    public var `version`: UInt,
    public var `Anonymous`: `TBS_CONTEXT_PARAMS2_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TBS_CONTEXT_PARAMS2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TBS_CONTEXT_PARAMS2`.Companion.`default`() : `TBS_CONTEXT_PARAMS2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 43:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TBS_CONTEXT_PARAMS2_0 {
//     pub Anonymous: TBS_CONTEXT_PARAMS2_0_0,
//     pub asUINT32: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TBS_CONTEXT_PARAMS2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TBS_CONTEXT_PARAMS2_0`.Companion.`default`() : `TBS_CONTEXT_PARAMS2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TBS_CONTEXT_PARAMS2_0_0` (
    public var `_bitfield`: UInt,
)
public const val `TBS_CONTEXT_VERSION_ONE`: UInt = 1u;
public const val `TBS_CONTEXT_VERSION_TWO`: UInt = 2u;
public const val `TBS_OWNERAUTH_TYPE_ADMIN`: UInt = 2u;
public const val `TBS_OWNERAUTH_TYPE_ENDORSEMENT`: UInt = 4u;
public const val `TBS_OWNERAUTH_TYPE_ENDORSEMENT_20`: UInt = 12u;
public const val `TBS_OWNERAUTH_TYPE_FULL`: UInt = 1u;
public const val `TBS_OWNERAUTH_TYPE_STORAGE_20`: UInt = 13u;
public const val `TBS_OWNERAUTH_TYPE_USER`: UInt = 3u;
public const val `TBS_SUCCESS`: UInt = 0u;
public const val `TBS_TCGLOG_DRTM_BOOT`: UInt = 4u;
public const val `TBS_TCGLOG_DRTM_CURRENT`: UInt = 1u;
public const val `TBS_TCGLOG_DRTM_RESUME`: UInt = 5u;
public const val `TBS_TCGLOG_SRTM_BOOT`: UInt = 2u;
public const val `TBS_TCGLOG_SRTM_CURRENT`: UInt = 0u;
public const val `TBS_TCGLOG_SRTM_RESUME`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TPM_DEVICE_INFO` (
    public var `structVersion`: UInt,
    public var `tpmVersion`: UInt,
    public var `tpmInterfaceType`: UInt,
    public var `tpmImpRevision`: UInt,
)
public const val `TPM_IFTYPE_1`: UInt = 1u;
public const val `TPM_IFTYPE_EMULATOR`: UInt = 4u;
public const val `TPM_IFTYPE_HW`: UInt = 3u;
public const val `TPM_IFTYPE_SPB`: UInt = 5u;
public const val `TPM_IFTYPE_TRUSTZONE`: UInt = 2u;
public const val `TPM_IFTYPE_UNKNOWN`: UInt = 0u;
public const val `TPM_VERSION_12`: UInt = 1u;
public const val `TPM_VERSION_20`: UInt = 2u;
public const val `TPM_VERSION_UNKNOWN`: UInt = 0u;
public const val `TPM_WNF_INFO_CLEAR_SUCCESSFUL`: UInt = 1u;
public const val `TPM_WNF_INFO_NO_REBOOT_REQUIRED`: UInt = 1u;
public const val `TPM_WNF_INFO_OWNERSHIP_SUCCESSFUL`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 28 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TPM_WNF_PROVISIONING` (
    public var `status`: UInt,
    public var `message`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `TPM_WNF_PROVISIONING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `TPM_WNF_PROVISIONING`.Companion.`default`() : `TPM_WNF_PROVISIONING` {
        return run { `core`.`mem`.`zeroed`() }
    }

