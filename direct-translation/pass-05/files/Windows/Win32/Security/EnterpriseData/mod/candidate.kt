// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=efswrt.dll, ABI=system, export=ProtectFileToEnterpriseIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProtectFileToEnterpriseIdentity`(`fileorfolderpath` : `windows_sys`.`core`.`PCWSTR`, `identity` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpCloseThreadNetworkContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpCloseThreadNetworkContext`(`threadnetworkcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTHREAD_NETWORK_CONTEXT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpCreateThreadNetworkContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpCreateThreadNetworkContext`(`enterpriseid` : `windows_sys`.`core`.`PCWSTR`, `threadnetworkcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTHREAD_NETWORK_CONTEXT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpDisablePermissiveModeFileEncryption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpDisablePermissiveModeFileEncryption`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpDoesPolicyAllowAppExecution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_Packaging_Appx")]
public external fun `SrpDoesPolicyAllowAppExecution`(`packageid` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Storage`.`Packaging`.`Appx`.`PACKAGE_ID`>?, `isallowed` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpEnablePermissiveModeFileEncryption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpEnablePermissiveModeFileEncryption`(`enterpriseid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpGetEnterpriseIds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpGetEnterpriseIds`(`tokenhandle` : `super`.`super`.`Foundation`.`HANDLE`, `numberofbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `enterpriseids` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `enterpriseidcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpGetEnterprisePolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpGetEnterprisePolicy`(`tokenhandle` : `super`.`super`.`Foundation`.`HANDLE`, `policyflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ENTERPRISE_DATA_POLICIES`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpHostingInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpHostingInitialize`(`version` : `SRPHOSTING_VERSION`, `type` : `SRPHOSTING_TYPE`, `pvdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpHostingTerminate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpHostingTerminate`(`type` : `SRPHOSTING_TYPE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpIsTokenService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpIsTokenService`(`tokenhandle` : `super`.`super`.`Foundation`.`HANDLE`, `istokenservice` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srpapi.dll, ABI=system, export=SrpSetTokenEnterpriseId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SrpSetTokenEnterpriseId`(`tokenhandle` : `super`.`super`.`Foundation`.`HANDLE`, `enterpriseid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=efswrt.dll, ABI=system, export=UnprotectFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnprotectFile`(`fileorfolderpath` : `windows_sys`.`core`.`PCWSTR`, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`FILE_UNPROTECT_OPTIONS`>?) : `windows_sys`.`core`.`HRESULT`
public typealias `ENTERPRISE_DATA_POLICIES` = Int;
public const val `ENTERPRISE_POLICY_ALLOWED`: `ENTERPRISE_DATA_POLICIES` = 1;
public const val `ENTERPRISE_POLICY_ENLIGHTENED`: `ENTERPRISE_DATA_POLICIES` = 2;
public const val `ENTERPRISE_POLICY_EXEMPT`: `ENTERPRISE_DATA_POLICIES` = 4;
public const val `ENTERPRISE_POLICY_NONE`: `ENTERPRISE_DATA_POLICIES` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_UNPROTECT_OPTIONS` (
    public var `audit`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTHREAD_NETWORK_CONTEXT` (
    public var `ThreadId`: UInt,
    public var `ThreadContext`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 31:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTHREAD_NETWORK_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SRPHOSTING_TYPE` = Int;
public const val `SRPHOSTING_TYPE_NONE`: `SRPHOSTING_TYPE` = 0;
public const val `SRPHOSTING_TYPE_WINHTTP`: `SRPHOSTING_TYPE` = 1;
public const val `SRPHOSTING_TYPE_WININET`: `SRPHOSTING_TYPE` = 2;
public typealias `SRPHOSTING_VERSION` = Int;
public const val `SRPHOSTING_VERSION1`: `SRPHOSTING_VERSION` = 1;
