// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=OpenPersonalTrustDBDialog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenPersonalTrustDBDialog`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=OpenPersonalTrustDBDialogEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenPersonalTrustDBDialogEx`(`hwndparent` : `super`.`super`.`Foundation`.`HWND`, `dwflags` : UInt, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WTHelperCertCheckValidSignature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public external fun `WTHelperCertCheckValidSignature`(`pprovdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WTHelperCertIsSelfSigned; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `WTHelperCertIsSelfSigned`(`dwencoding` : UInt, `pcert` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WTHelperGetProvCertFromChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `WTHelperGetProvCertFromChain`(`psgnr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_SGNR`>?, `idxcert` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_CERT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WTHelperGetProvPrivateDataFromChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public external fun `WTHelperGetProvPrivateDataFromChain`(`pprovdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, `pgproviderid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_PRIVDATA`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WTHelperGetProvSignerFromChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public external fun `WTHelperGetProvSignerFromChain`(`pprovdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, `idxsigner` : UInt, `fcountersigner` : `windows_sys`.`core`.`BOOL`, `idxcountersigner` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_SGNR`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WTHelperProvDataFromStateData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public external fun `WTHelperProvDataFromStateData`(`hstatedata` : `super`.`super`.`Foundation`.`HANDLE`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WinVerifyTrust; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinVerifyTrust`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pgactionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwvtdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WinVerifyTrustEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `WinVerifyTrustEx`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pgactionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pwintrustdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINTRUST_DATA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustAddActionID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WintrustAddActionID`(`pgactionid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `fdwflags` : UInt, `psprovinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_REGISTER_ACTIONID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustAddDefaultForUsage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WintrustAddDefaultForUsage`(`pszusageoid` : `windows_sys`.`core`.`PCSTR`, `psdefusage` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_REGDEFUSAGE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustGetDefaultForUsage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WintrustGetDefaultForUsage`(`dwaction` : `WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION`, `pszusageoid` : `windows_sys`.`core`.`PCSTR`, `psusage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DEFUSAGE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustGetRegPolicyFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WintrustGetRegPolicyFlags`(`pdwpolicyflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINTRUST_POLICY_FLAGS`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustLoadFunctionPointers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public external fun `WintrustLoadFunctionPointers`(`pgactionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppfns` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_FUNCTIONS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustRemoveActionID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WintrustRemoveActionID`(`pgactionid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustSetDefaultIncludePEPageHashes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WintrustSetDefaultIncludePEPageHashes`(`fincludepepagehashes` : `windows_sys`.`core`.`BOOL`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wintrust.dll, ABI=system, export=WintrustSetRegPolicyFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WintrustSetRegPolicyFlags`(`dwpolicyflags` : `WINTRUST_POLICY_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAT_MEMBERINFO` (
    public var `pwszSubjGuid`: `windows_sys`.`core`.`PWSTR`,
    public var `dwCertVersion`: UInt,
)
// UNSUPPORTED Rust 33:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CAT_MEMBERINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CAT_MEMBERINFO2` (
    public var `SubjectGuid`: `windows_sys`.`core`.`GUID`,
    public var `dwCertVersion`: UInt,
)
// UNSUPPORTED Rust 44:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CAT_MEMBERINFO2_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.2.3");

// UNSUPPORTED Rust 45:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CAT_MEMBERINFO2_STRUCT: windows_sys::core::PCSTR = 2223i32 as _;

// UNSUPPORTED Rust 46:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CAT_MEMBERINFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.2.2");

// UNSUPPORTED Rust 47:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CAT_MEMBERINFO_STRUCT: windows_sys::core::PCSTR = 2222i32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CAT_NAMEVALUE` (
    public var `pwszTag`: `windows_sys`.`core`.`PWSTR`,
    public var `fdwFlags`: UInt,
    public var `Value`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 56:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CAT_NAMEVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 62:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CAT_NAMEVALUE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.2.1");

// UNSUPPORTED Rust 63:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CAT_NAMEVALUE_STRUCT: windows_sys::core::PCSTR = 2221i32 as _;

public const val `CCPI_RESULT_ALLOW`: UInt = 1u;
public const val `CCPI_RESULT_AUDIT`: UInt = 3u;
public const val `CCPI_RESULT_DENY`: UInt = 2u;
public const val `CERT_CONFIDENCE_AUTHIDEXT`: UInt = 65536u;
public const val `CERT_CONFIDENCE_HIGHEST`: UInt = 286330880u;
public const val `CERT_CONFIDENCE_HYGIENE`: UInt = 4096u;
public const val `CERT_CONFIDENCE_SIG`: UInt = 268435456u;
public const val `CERT_CONFIDENCE_TIME`: UInt = 16777216u;
public const val `CERT_CONFIDENCE_TIMENEST`: UInt = 1048576u;
// UNSUPPORTED Rust 73:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CONFIG_CI_ACTION_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6078065b_8f22_4b13_bd9b_5b762776f386);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONFIG_CI_PROV_INFO` (
    public var `cbSize`: UInt,
    public var `dwPolicies`: UInt,
    public var `pPolicies`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CRYPT_INTEGER_BLOB`>?,
    public var `result`: `CONFIG_CI_PROV_INFO_RESULT`,
    public var `dwScenario`: UInt,
    public var `result2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CONFIG_CI_PROV_INFO_RESULT2`>?,
)
// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CONFIG_CI_PROV_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CONFIG_CI_PROV_INFO_RESULT` (
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `dwResult`: UInt,
    public var `dwPolicyIndex`: UInt,
    public var `fIsExplicitDeny`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONFIG_CI_PROV_INFO_RESULT2` (
    public var `cbSize`: UInt,
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `dwResult`: UInt,
    public var `dwPolicyIndex`: UInt,
    public var `fIsExplicitDeny`: Boolean,
    public var `cbCalculatedFileHash`: UInt,
    public var `pbCalculatedFileHash`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 110:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONFIG_CI_PROV_INFO_RESULT2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CPD_CHOICE_SIP`: UInt = 1u;
public const val `CPD_RETURN_LOWER_QUALITY_CHAINS`: UInt = 1048576u;
public const val `CPD_REVOCATION_CHECK_CHAIN`: UInt = 262144u;
public const val `CPD_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT`: UInt = 524288u;
public const val `CPD_REVOCATION_CHECK_END_CERT`: UInt = 131072u;
public const val `CPD_REVOCATION_CHECK_NONE`: UInt = 65536u;
public const val `CPD_RFC3161v21`: UInt = 2097152u;
public const val `CPD_UISTATE_MODE_ALLOW`: UInt = 2u;
public const val `CPD_UISTATE_MODE_BLOCK`: UInt = 1u;
public const val `CPD_UISTATE_MODE_MASK`: UInt = 3u;
public const val `CPD_UISTATE_MODE_PROMPT`: UInt = 0u;
public const val `CPD_USE_NT5_CHAIN_FLAG`: UInt = 2147483648u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_CERT` (
    public var `cbStruct`: UInt,
    public var `pCert`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_CONTEXT`>?,
    public var `fCommercial`: `windows_sys`.`core`.`BOOL`,
    public var `fTrustedRoot`: `windows_sys`.`core`.`BOOL`,
    public var `fSelfSigned`: `windows_sys`.`core`.`BOOL`,
    public var `fTestCert`: `windows_sys`.`core`.`BOOL`,
    public var `dwRevokedReason`: UInt,
    public var `dwConfidence`: UInt,
    public var `dwError`: UInt,
    public var `pTrustListContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CTL_CONTEXT`>?,
    public var `fTrustListSignerCert`: `windows_sys`.`core`.`BOOL`,
    public var `pCtlContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CTL_CONTEXT`>?,
    public var `dwCtlError`: UInt,
    public var `fIsCyclic`: `windows_sys`.`core`.`BOOL`,
    public var `pChainElement`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_CHAIN_ELEMENT`>?,
)
// UNSUPPORTED Rust 147:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CRYPT_PROVIDER_CERT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_DATA` (
    public var `cbStruct`: UInt,
    public var `pWintrustData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINTRUST_DATA`>?,
    public var `fOpenedFile`: `windows_sys`.`core`.`BOOL`,
    public var `hWndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `pgActionID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `hProv`: ULong,
    public var `dwError`: UInt,
    public var `dwRegSecuritySettings`: UInt,
    public var `dwRegPolicySettings`: UInt,
    public var `psPfns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_FUNCTIONS`>?,
    public var `cdwTrustStepErrors`: UInt,
    public var `padwTrustStepErrors`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `chStores`: UInt,
    public var `pahStores`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`HCERTSTORE`>?,
    public var `dwEncoding`: UInt,
    public var `hMsg`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `csSigners`: UInt,
    public var `pasSigners`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_SGNR`>?,
    public var `csProvPrivData`: UInt,
    public var `pasProvPrivData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_PRIVDATA`>?,
    public var `dwSubjectChoice`: UInt,
    public var `Anonymous`: `CRYPT_PROVIDER_DATA_0`,
    public var `pszUsageOID`: `windows_sys`.`core`.`PSTR`,
    public var `fRecallWithState`: `windows_sys`.`core`.`BOOL`,
    public var `sftSystemTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `pszCTLSignerUsageOID`: `windows_sys`.`core`.`PSTR`,
    public var `dwProvFlags`: UInt,
    public var `dwFinalError`: UInt,
    public var `pRequestUsage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_USAGE_MATCH`>?,
    public var `dwTrustPubSettings`: UInt,
    public var `dwUIStateFlags`: UInt,
    public var `pSigState`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_SIGSTATE`>?,
    public var `pSigSettings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINTRUST_SIGNATURE_SETTINGS`>?,
)
// UNSUPPORTED Rust 191:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVIDER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 197:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub union CRYPT_PROVIDER_DATA_0 {
//     pub pPDSip: *mut PROVDATA_SIP,
// }

// UNSUPPORTED Rust 203:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVIDER_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_DEFUSAGE` (
    public var `cbStruct`: UInt,
    public var `gActionID`: `windows_sys`.`core`.`GUID`,
    public var `pDefPolicyCallbackData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pDefSIPClientData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 217:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPT_PROVIDER_DEFUSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_FUNCTIONS` (
    public var `cbStruct`: UInt,
    public var `pfnAlloc`: `PFN_CPD_MEM_ALLOC`,
    public var `pfnFree`: `PFN_CPD_MEM_FREE`,
    public var `pfnAddStore2Chain`: `PFN_CPD_ADD_STORE`,
    public var `pfnAddSgnr2Chain`: `PFN_CPD_ADD_SGNR`,
    public var `pfnAddCert2Chain`: `PFN_CPD_ADD_CERT`,
    public var `pfnAddPrivData2Chain`: `PFN_CPD_ADD_PRIVDATA`,
    public var `pfnInitialize`: `PFN_PROVIDER_INIT_CALL`,
    public var `pfnObjectTrust`: `PFN_PROVIDER_OBJTRUST_CALL`,
    public var `pfnSignatureTrust`: `PFN_PROVIDER_SIGTRUST_CALL`,
    public var `pfnCertificateTrust`: `PFN_PROVIDER_CERTTRUST_CALL`,
    public var `pfnFinalPolicy`: `PFN_PROVIDER_FINALPOLICY_CALL`,
    public var `pfnCertCheckPolicy`: `PFN_PROVIDER_CERTCHKPOLICY_CALL`,
    public var `pfnTestFinalPolicy`: `PFN_PROVIDER_TESTFINALPOLICY_CALL`,
    public var `psUIpfns`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVUI_FUNCS`>?,
    public var `pfnCleanupPolicy`: `PFN_PROVIDER_CLEANUP_CALL`,
)
// UNSUPPORTED Rust 243:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVIDER_FUNCTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_PRIVDATA` (
    public var `cbStruct`: UInt,
    public var `gProviderID`: `windows_sys`.`core`.`GUID`,
    public var `cbProvData`: UInt,
    public var `pvProvData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 257:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPT_PROVIDER_PRIVDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_REGDEFUSAGE` (
    public var `cbStruct`: UInt,
    public var `pgActionID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pwszDllName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszLoadCallbackDataFunctionName`: `windows_sys`.`core`.`PSTR`,
    public var `pwszFreeCallbackDataFunctionName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 271:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPT_PROVIDER_REGDEFUSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_SGNR` (
    public var `cbStruct`: UInt,
    public var `sftVerifyAsOf`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `csCertChain`: UInt,
    public var `pasCertChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_CERT`>?,
    public var `dwSignerType`: UInt,
    public var `psSigner`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CMSG_SIGNER_INFO`>?,
    public var `dwError`: UInt,
    public var `csCounterSigners`: UInt,
    public var `pasCounterSigners`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_SGNR`>?,
    public var `pChainContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_CHAIN_CONTEXT`>?,
)
// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CRYPT_PROVIDER_SGNR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVIDER_SIGSTATE` (
    public var `cbStruct`: UInt,
    public var `rhSecondarySigs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `hPrimarySig`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `fFirstAttemptMade`: `windows_sys`.`core`.`BOOL`,
    public var `fNoMoreSigs`: `windows_sys`.`core`.`BOOL`,
    public var `cSecondarySigs`: UInt,
    public var `dwCurrentIndex`: UInt,
    public var `fSupportMultiSig`: `windows_sys`.`core`.`BOOL`,
    public var `dwCryptoPolicySupport`: UInt,
    public var `iAttemptCount`: UInt,
    public var `fCheckedSealing`: `windows_sys`.`core`.`BOOL`,
    public var `pSealingSignature`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SEALING_SIGNATURE_ATTRIBUTE`>?,
)
// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CRYPT_PROVIDER_SIGSTATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVUI_DATA` (
    public var `cbStruct`: UInt,
    public var `dwFinalError`: UInt,
    public var `pYesButtonText`: `windows_sys`.`core`.`PWSTR`,
    public var `pNoButtonText`: `windows_sys`.`core`.`PWSTR`,
    public var `pMoreInfoButtonText`: `windows_sys`.`core`.`PWSTR`,
    public var `pAdvancedLinkText`: `windows_sys`.`core`.`PWSTR`,
    public var `pCopyActionText`: `windows_sys`.`core`.`PWSTR`,
    public var `pCopyActionTextNoTS`: `windows_sys`.`core`.`PWSTR`,
    public var `pCopyActionTextNotSigned`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPT_PROVUI_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_PROVUI_FUNCS` (
    public var `cbStruct`: UInt,
    public var `psUIData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVUI_DATA`>?,
    public var `pfnOnMoreInfoClick`: `PFN_PROVUI_CALL`,
    public var `pfnOnMoreInfoClickDefault`: `PFN_PROVUI_CALL`,
    public var `pfnOnAdvancedClick`: `PFN_PROVUI_CALL`,
    public var `pfnOnAdvancedClickDefault`: `PFN_PROVUI_CALL`,
)
// UNSUPPORTED Rust 349:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVUI_FUNCS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CRYPT_REGISTER_ACTIONID` (
    public var `cbStruct`: UInt,
    public var `sInitProvider`: `CRYPT_TRUST_REG_ENTRY`,
    public var `sObjectProvider`: `CRYPT_TRUST_REG_ENTRY`,
    public var `sSignatureProvider`: `CRYPT_TRUST_REG_ENTRY`,
    public var `sCertificateProvider`: `CRYPT_TRUST_REG_ENTRY`,
    public var `sCertificatePolicyProvider`: `CRYPT_TRUST_REG_ENTRY`,
    public var `sFinalPolicyProvider`: `CRYPT_TRUST_REG_ENTRY`,
    public var `sTestPolicyProvider`: `CRYPT_TRUST_REG_ENTRY`,
    public var `sCleanupProvider`: `CRYPT_TRUST_REG_ENTRY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPT_TRUST_REG_ENTRY` (
    public var `cbStruct`: UInt,
    public var `pwszDLLName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszFunctionName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPT_TRUST_REG_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 380:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DRIVER_ACTION_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf750e6c3_38ee_11d1_85e5_00c04fc295ee);

// UNSUPPORTED Rust 381:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DRIVER_CLEANUPPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverCleanupPolicy");

// UNSUPPORTED Rust 382:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DRIVER_FINALPOLPROV_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverFinalPolicy");

// UNSUPPORTED Rust 383:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DRIVER_INITPROV_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverInitializePolicy");

// UNSUPPORTED Rust 384:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct DRIVER_VER_INFO {
//     pub cbStruct: u32,
//     pub dwReserved1: usize,
//     pub dwReserved2: usize,
//     pub dwPlatform: u32,
//     pub dwVersion: u32,
//     pub wszVersion: [u16; 260],
//     pub wszSignedBy: [u16; 260],
//     pub pcSignerCertContext: *const super::Cryptography::CERT_CONTEXT,
//     pub sOSVersionLow: DRIVER_VER_MAJORMINOR,
//     pub sOSVersionHigh: DRIVER_VER_MAJORMINOR,
//     pub dwBuildNumberLow: u32,
//     pub dwBuildNumberHigh: u32,
// }

// UNSUPPORTED Rust 401:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for DRIVER_VER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DRIVER_VER_MAJORMINOR` (
    public var `dwMajor`: UInt,
    public var `dwMinor`: UInt,
)
public const val `DWACTION_ALLOCANDFILL`: `WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION` = 1u;
public const val `DWACTION_FREE`: `WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION` = 2u;
// UNSUPPORTED Rust 415:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GENERIC_CHAIN_CERTTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("GenericChainCertificateTrust");

// UNSUPPORTED Rust 416:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GENERIC_CHAIN_FINALPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("GenericChainFinalProv");

// UNSUPPORTED Rust 417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const HTTPSPROV_ACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x573e31f8_aaba_11d0_8ccb_00c04fc295ee);

// UNSUPPORTED Rust 418:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HTTPS_CERTTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTPSCertificateTrust");

// UNSUPPORTED Rust 419:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HTTPS_CHKCERT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTPSCheckCertProv");

// UNSUPPORTED Rust 420:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const HTTPS_FINALPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTPSFinalProv");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTENT_TO_SEAL_ATTRIBUTE` (
    public var `version`: UInt,
    public var `seal`: Boolean,
)
// UNSUPPORTED Rust 427:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const INTENT_TO_SEAL_ATTRIBUTE_STRUCT: windows_sys::core::PCSTR = 2010i32 as _;

// UNSUPPORTED Rust 428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const OFFICESIGN_ACTION_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5555c2cd_17fb_11d1_85c4_00c04fc295ee);

// UNSUPPORTED Rust 429:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OFFICE_CLEANUPPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("OfficeCleanupPolicy");

// UNSUPPORTED Rust 430:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OFFICE_INITPROV_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("OfficeInitializePolicy");

// UNSUPPORTED Rust 431:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const OFFICE_POLICY_PROVIDER_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WINTRUST.DLL");

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_ALLOCANDFILLDEFUSAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DEFUSAGE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_CPD_ADD_CERT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, UInt, `windows_sys`.`core`.`BOOL`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_CONTEXT`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_CPD_ADD_PRIVDATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_PRIVDATA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_CPD_ADD_SGNR` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, `windows_sys`.`core`.`BOOL`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_SGNR`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_CPD_ADD_STORE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, `super`.`Cryptography`.`HCERTSTORE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_CPD_MEM_ALLOC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_CPD_MEM_FREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_FREEDEFUSAGE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DEFUSAGE`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_CERTCHKPOLICY_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, UInt, `windows_sys`.`core`.`BOOL`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_CERTTRUST_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_CLEANUP_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_FINALPOLICY_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_INIT_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_OBJTRUST_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_SIGTRUST_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVIDER_TESTFINALPOLICY_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_PROVUI_CALL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
public typealias `PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPT_PROVIDER_DATA`>?, UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROVDATA_SIP` (
    public var `cbStruct`: UInt,
    public var `gSubject`: `windows_sys`.`core`.`GUID`,
    public var `pSip`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`Sip`.`SIP_DISPATCH_INFO`>?,
    public var `pCATSip`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`Sip`.`SIP_DISPATCH_INFO`>?,
    public var `psSipSubjectInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`Sip`.`SIP_SUBJECTINFO`>?,
    public var `psSipCATSubjectInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`Sip`.`SIP_SUBJECTINFO`>?,
    public var `psIndirectData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`Sip`.`SIP_INDIRECT_DATA`>?,
)
// UNSUPPORTED Rust 476:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for PROVDATA_SIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEALING_SIGNATURE_ATTRIBUTE` (
    public var `version`: UInt,
    public var `signerIndex`: UInt,
    public var `signatureAlgorithm`: `super`.`Cryptography`.`CRYPT_ALGORITHM_IDENTIFIER`,
    public var `encryptedDigest`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 491:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SEALING_SIGNATURE_ATTRIBUTE_STRUCT: windows_sys::core::PCSTR = 2011i32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SEALING_TIMESTAMP_ATTRIBUTE` (
    public var `version`: UInt,
    public var `signerIndex`: UInt,
    public var `sealTimeStampToken`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 500:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SEALING_TIMESTAMP_ATTRIBUTE_STRUCT: windows_sys::core::PCSTR = 2012i32 as _;

public const val `SGNR_TYPE_TIMESTAMP`: UInt = 16u;
// UNSUPPORTED Rust 502:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_CAB_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.25");

// UNSUPPORTED Rust 503:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_CAB_DATA_STRUCT: windows_sys::core::PCSTR = 2008i32 as _;

// UNSUPPORTED Rust 504:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_CERT_EXTENSIONS_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.14");

// UNSUPPORTED Rust 505:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_COMMERCIAL_SP_KEY_PURPOSE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.22");

// UNSUPPORTED Rust 506:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_COMMON_NAME_OBJID: windows_sys::core::PCWSTR = windows_sys::core::w!("2.5.4.3");

// UNSUPPORTED Rust 507:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_ENCRYPTED_DIGEST_RETRY_COUNT_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.6.2");

public const val `SPC_FILE_LINK_CHOICE`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SPC_FINANCIAL_CRITERIA` (
    public var `fFinancialInfoAvailable`: `windows_sys`.`core`.`BOOL`,
    public var `fMeetsCriteria`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 515:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_FINANCIAL_CRITERIA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.27");

// UNSUPPORTED Rust 516:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_FINANCIAL_CRITERIA_STRUCT: windows_sys::core::PCSTR = 2002i32 as _;

// UNSUPPORTED Rust 517:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_GLUE_RDN_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.25");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPC_IMAGE` (
    public var `pImageLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPC_LINK`>?,
    public var `Bitmap`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `Metafile`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `EnhancedMetafile`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
    public var `GifFile`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_IMAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SPC_INDIRECT_DATA_CONTENT` (
    public var `Data`: `super`.`Cryptography`.`CRYPT_ATTRIBUTE_TYPE_VALUE`,
    public var `DigestAlgorithm`: `super`.`Cryptography`.`CRYPT_ALGORITHM_IDENTIFIER`,
    public var `Digest`: `super`.`Cryptography`.`CRYPT_INTEGER_BLOB`,
)
// UNSUPPORTED Rust 542:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_INDIRECT_DATA_CONTENT_STRUCT: windows_sys::core::PCSTR = 2003i32 as _;

// UNSUPPORTED Rust 543:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_INDIRECT_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.4");

// UNSUPPORTED Rust 544:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_INDIVIDUAL_SP_KEY_PURPOSE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.21");

// UNSUPPORTED Rust 545:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_JAVA_CLASS_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.20");

// UNSUPPORTED Rust 546:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_JAVA_CLASS_DATA_STRUCT: windows_sys::core::PCSTR = 2009i32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPC_LINK` (
    public var `dwLinkChoice`: UInt,
    public var `Anonymous`: `SPC_LINK_0`,
)
// UNSUPPORTED Rust 554:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_LINK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 560:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub union SPC_LINK_0 {
//     pub pwszUrl: windows_sys::core::PWSTR,
//     pub Moniker: SPC_SERIALIZED_OBJECT,
//     pub pwszFile: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 568:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_LINK_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 574:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_LINK_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.28");

// UNSUPPORTED Rust 575:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_LINK_STRUCT: windows_sys::core::PCSTR = 2005i32 as _;

// UNSUPPORTED Rust 576:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_MINIMAL_CRITERIA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.26");

// UNSUPPORTED Rust 577:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_MINIMAL_CRITERIA_STRUCT: windows_sys::core::PCSTR = 2001i32 as _;

public const val `SPC_MONIKER_LINK_CHOICE`: UInt = 2u;
// UNSUPPORTED Rust 579:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_NATURAL_AUTH_PLUGIN_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.96.1.1");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPC_PE_IMAGE_DATA` (
    public var `Flags`: `super`.`Cryptography`.`CRYPT_BIT_BLOB`,
    public var `pFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPC_LINK`>?,
)
// UNSUPPORTED Rust 587:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_PE_IMAGE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 593:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_PE_IMAGE_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.15");

// UNSUPPORTED Rust 594:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_PE_IMAGE_DATA_STRUCT: windows_sys::core::PCSTR = 2004i32 as _;

// UNSUPPORTED Rust 595:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_PE_IMAGE_PAGE_HASHES_V1_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.3.1");

// UNSUPPORTED Rust 596:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_PE_IMAGE_PAGE_HASHES_V2_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.3.2");

// UNSUPPORTED Rust 597:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_RAW_FILE_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.18");

// UNSUPPORTED Rust 598:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_RELAXED_PE_MARKER_CHECK_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.6.1");

// UNSUPPORTED Rust 599:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SPC_SERIALIZED_OBJECT {
//     pub ClassId: [u8; 16],
//     pub SerializedData: super::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 606:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_SERIALIZED_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SPC_SIGINFO` (
    public var `dwSipVersion`: UInt,
    public var `gSIPGuid`: `windows_sys`.`core`.`GUID`,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `dwReserved3`: UInt,
    public var `dwReserved4`: UInt,
    public var `dwReserved5`: UInt,
)
// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_SIGINFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.30");

// UNSUPPORTED Rust 624:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_SIGINFO_STRUCT: windows_sys::core::PCSTR = 2130i32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPC_SP_AGENCY_INFO` (
    public var `pPolicyInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPC_LINK`>?,
    public var `pwszPolicyDisplayText`: `windows_sys`.`core`.`PWSTR`,
    public var `pLogoImage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPC_IMAGE`>?,
    public var `pLogoLink`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPC_LINK`>?,
)
// UNSUPPORTED Rust 634:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_SP_AGENCY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 640:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_SP_AGENCY_INFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.10");

// UNSUPPORTED Rust 641:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_SP_AGENCY_INFO_STRUCT: windows_sys::core::PCSTR = 2000i32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPC_SP_OPUS_INFO` (
    public var `pwszProgramName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pMoreInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPC_LINK`>?,
    public var `pPublisherInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SPC_LINK`>?,
)
// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_SP_OPUS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 656:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_SP_OPUS_INFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.12");

// UNSUPPORTED Rust 657:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_SP_OPUS_INFO_STRUCT: windows_sys::core::PCSTR = 2007i32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SPC_STATEMENT_TYPE` (
    public var `cKeyPurposeId`: UInt,
    public var `rgpszKeyPurposeId`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?,
)
// UNSUPPORTED Rust 664:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SPC_STATEMENT_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 669:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_STATEMENT_TYPE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.11");

// UNSUPPORTED Rust 670:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_STATEMENT_TYPE_STRUCT: windows_sys::core::PCSTR = 2006i32 as _;

// UNSUPPORTED Rust 671:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_STRUCTURED_STORAGE_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.19");

// UNSUPPORTED Rust 672:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_TIME_STAMP_REQUEST_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.3.2.1");

public const val `SPC_URL_LINK_CHOICE`: UInt = 1u;
public const val `SPC_UUID_LENGTH`: UInt = 16u;
// UNSUPPORTED Rust 675:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SPC_WINDOWS_HELLO_COMPATIBILITY_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.41.1");

// UNSUPPORTED Rust 676:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_CHKCERT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubCheckCert");

// UNSUPPORTED Rust 677:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_CLEANUPPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubCleanup");

// UNSUPPORTED Rust 678:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_FINALPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubAuthenticode");

// UNSUPPORTED Rust 679:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_GENERIC_CERT_INIT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubDefCertInit");

// UNSUPPORTED Rust 680:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_INIT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubInitialize");

// UNSUPPORTED Rust 681:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_OBJTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubLoadMessage");

// UNSUPPORTED Rust 682:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_POLICY_PROVIDER_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WINTRUST.DLL");

// UNSUPPORTED Rust 683:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_SIGTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubLoadSignature");

// UNSUPPORTED Rust 684:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SP_TESTDUMPPOLICY_FUNCTION_TEST: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubDumpStructure");

public const val `TRUSTERROR_MAX_STEPS`: UInt = 38u;
public const val `TRUSTERROR_STEP_CATALOGFILE`: UInt = 6u;
public const val `TRUSTERROR_STEP_CERTSTORE`: UInt = 7u;
public const val `TRUSTERROR_STEP_FILEIO`: UInt = 2u;
public const val `TRUSTERROR_STEP_FINAL_CERTCHKPROV`: UInt = 35u;
public const val `TRUSTERROR_STEP_FINAL_CERTPROV`: UInt = 34u;
public const val `TRUSTERROR_STEP_FINAL_INITPROV`: UInt = 31u;
public const val `TRUSTERROR_STEP_FINAL_OBJPROV`: UInt = 32u;
public const val `TRUSTERROR_STEP_FINAL_POLICYPROV`: UInt = 36u;
public const val `TRUSTERROR_STEP_FINAL_SIGPROV`: UInt = 33u;
public const val `TRUSTERROR_STEP_FINAL_UIPROV`: UInt = 37u;
public const val `TRUSTERROR_STEP_FINAL_WVTINIT`: UInt = 30u;
public const val `TRUSTERROR_STEP_MESSAGE`: UInt = 8u;
public const val `TRUSTERROR_STEP_MSG_CERTCHAIN`: UInt = 15u;
public const val `TRUSTERROR_STEP_MSG_COUNTERSIGCERT`: UInt = 17u;
public const val `TRUSTERROR_STEP_MSG_COUNTERSIGINFO`: UInt = 16u;
public const val `TRUSTERROR_STEP_MSG_INNERCNT`: UInt = 11u;
public const val `TRUSTERROR_STEP_MSG_INNERCNTTYPE`: UInt = 10u;
public const val `TRUSTERROR_STEP_MSG_SIGNERCERT`: UInt = 14u;
public const val `TRUSTERROR_STEP_MSG_SIGNERCOUNT`: UInt = 9u;
public const val `TRUSTERROR_STEP_MSG_SIGNERINFO`: UInt = 13u;
public const val `TRUSTERROR_STEP_MSG_STORE`: UInt = 12u;
public const val `TRUSTERROR_STEP_SIP`: UInt = 3u;
public const val `TRUSTERROR_STEP_SIPSUBJINFO`: UInt = 5u;
public const val `TRUSTERROR_STEP_VERIFY_MSGHASH`: UInt = 18u;
public const val `TRUSTERROR_STEP_VERIFY_MSGINDIRECTDATA`: UInt = 19u;
public const val `TRUSTERROR_STEP_WVTPARAMS`: UInt = 0u;
// UNSUPPORTED Rust 712:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WINTRUST_ACTION_GENERIC_CERT_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x189a3842_3041_11d1_85e1_00c04fc295ee);

// UNSUPPORTED Rust 713:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WINTRUST_ACTION_GENERIC_CHAIN_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc451c16_ac75_11d1_b4b8_00c04fb66ea0);

// UNSUPPORTED Rust 714:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WINTRUST_ACTION_GENERIC_VERIFY_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00aac56b_cd44_11d0_8cc2_00c04fc295ee);

// UNSUPPORTED Rust 715:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WINTRUST_ACTION_TRUSTPROVIDER_TEST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x573e31f8_ddba_11d0_8ccb_00c04fc295ee);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINTRUST_BLOB_INFO` (
    public var `cbStruct`: UInt,
    public var `gSubject`: `windows_sys`.`core`.`GUID`,
    public var `pcwszDisplayName`: `windows_sys`.`core`.`PCWSTR`,
    public var `cbMemObject`: UInt,
    public var `pbMemObject`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbMemSignedMsg`: UInt,
    public var `pbMemSignedMsg`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINTRUST_BLOB_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINTRUST_CATALOG_INFO` (
    public var `cbStruct`: UInt,
    public var `dwCatalogVersion`: UInt,
    public var `pcwszCatalogFilePath`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszMemberTag`: `windows_sys`.`core`.`PCWSTR`,
    public var `pcwszMemberFilePath`: `windows_sys`.`core`.`PCWSTR`,
    public var `hMemberFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pbCalculatedFileHash`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbCalculatedFileHash`: UInt,
    public var `pcCatalogContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CTL_CONTEXT`>?,
    public var `hCatAdmin`: Long,
)
// UNSUPPORTED Rust 747:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_CATALOG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINTRUST_CERT_INFO` (
    public var `cbStruct`: UInt,
    public var `pcwszDisplayName`: `windows_sys`.`core`.`PCWSTR`,
    public var `psCertContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_CONTEXT`>?,
    public var `chStores`: UInt,
    public var `pahStores`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`HCERTSTORE`>?,
    public var `dwFlags`: UInt,
    public var `psftVerifyAsOf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?,
)
// UNSUPPORTED Rust 765:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_CERT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 771:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WINTRUST_CONFIG_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Cryptography\\Wintrust\\Config");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINTRUST_DATA` (
    public var `cbStruct`: UInt,
    public var `pPolicyCallbackData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pSIPClientData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwUIChoice`: `WINTRUST_DATA_UICHOICE`,
    public var `fdwRevocationChecks`: `WINTRUST_DATA_REVOCATION_CHECKS`,
    public var `dwUnionChoice`: `WINTRUST_DATA_UNION_CHOICE`,
    public var `Anonymous`: `WINTRUST_DATA_0`,
    public var `dwStateAction`: `WINTRUST_DATA_STATE_ACTION`,
    public var `hWVTStateData`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pwszURLReference`: `windows_sys`.`core`.`PWSTR`,
    public var `dwProvFlags`: `WINTRUST_DATA_PROVIDER_FLAGS`,
    public var `dwUIContext`: `WINTRUST_DATA_UICONTEXT`,
    public var `pSignatureSettings`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINTRUST_SIGNATURE_SETTINGS`>?,
)
// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 796:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub union WINTRUST_DATA_0 {
//     pub pFile: *mut WINTRUST_FILE_INFO,
//     pub pCatalog: *mut WINTRUST_CATALOG_INFO,
//     pub pBlob: *mut WINTRUST_BLOB_INFO,
//     pub pSgnr: *mut WINTRUST_SGNR_INFO,
//     pub pCert: *mut WINTRUST_CERT_INFO,
// }

// UNSUPPORTED Rust 806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINTRUST_DATA_PROVIDER_FLAGS` = UInt;
public typealias `WINTRUST_DATA_REVOCATION_CHECKS` = UInt;
public typealias `WINTRUST_DATA_STATE_ACTION` = UInt;
public typealias `WINTRUST_DATA_UICHOICE` = UInt;
public typealias `WINTRUST_DATA_UICONTEXT` = UInt;
public typealias `WINTRUST_DATA_UNION_CHOICE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINTRUST_FILE_INFO` (
    public var `cbStruct`: UInt,
    public var `pcwszFilePath`: `windows_sys`.`core`.`PCWSTR`,
    public var `hFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pgKnownSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
)
// UNSUPPORTED Rust 826:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINTRUST_FILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION` = UInt;
public const val `WINTRUST_MAX_HASH_BYTES_TO_MAP_DEFAULT`: UInt = 1048576u;
// UNSUPPORTED Rust 833:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WINTRUST_MAX_HASH_BYTES_TO_MAP_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxHashBytesToMap");

public const val `WINTRUST_MAX_HEADER_BYTES_TO_MAP_DEFAULT`: UInt = 10485760u;
// UNSUPPORTED Rust 835:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WINTRUST_MAX_HEADER_BYTES_TO_MAP_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxHeaderBytesToMap");

public typealias `WINTRUST_POLICY_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINTRUST_SGNR_INFO` (
    public var `cbStruct`: UInt,
    public var `pcwszDisplayName`: `windows_sys`.`core`.`PCWSTR`,
    public var `psSignerInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CMSG_SIGNER_INFO`>?,
    public var `chStores`: UInt,
    public var `pahStores`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`HCERTSTORE`>?,
)
// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_SGNR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINTRUST_SIGNATURE_SETTINGS` (
    public var `cbStruct`: UInt,
    public var `dwIndex`: UInt,
    public var `dwFlags`: `WINTRUST_SIGNATURE_SETTINGS_FLAGS`,
    public var `cSecondarySigs`: UInt,
    public var `dwVerifiedSigIndex`: UInt,
    public var `pCryptoPolicy`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_STRONG_SIGN_PARA`>?,
)
// UNSUPPORTED Rust 864:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_SIGNATURE_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINTRUST_SIGNATURE_SETTINGS_FLAGS` = UInt;
// UNSUPPORTED Rust 871:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN_CERTIFICATE {
//     pub dwLength: u32,
//     pub wRevision: u16,
//     pub wCertificateType: u16,
//     pub bCertificate: [u8; 1],
// }

// UNSUPPORTED Rust 879:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN_CERTIFICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WIN_CERT_REVISION_1_0`: UInt = 256u;
public const val `WIN_CERT_REVISION_2_0`: UInt = 512u;
public const val `WIN_CERT_TYPE_PKCS_SIGNED_DATA`: UInt = 2u;
public const val `WIN_CERT_TYPE_RESERVED_1`: UInt = 3u;
public const val `WIN_CERT_TYPE_TS_STACK_SIGNED`: UInt = 4u;
public const val `WIN_CERT_TYPE_X509`: UInt = 1u;
// UNSUPPORTED Rust 890:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_SPUB_ACTION_NT_ACTIVATE_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8bc96b00_8da1_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 891:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_SPUB_ACTION_PUBLISHED_SOFTWARE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64b9d180_8da2_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 892:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_SPUB_ACTION_TRUSTED_PUBLISHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66426730_8da1_11cf_8736_00aa00a485eb);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIN_SPUB_TRUSTED_PUBLISHER_DATA` (
    public var `hClientToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `lpCertificate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WIN_CERTIFICATE`>?,
)
// UNSUPPORTED Rust 899:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN_SPUB_TRUSTED_PUBLISHER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIN_TRUST_ACTDATA_CONTEXT_WITH_SUBJECT` (
    public var `hClientToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `SubjectType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `Subject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 911:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN_TRUST_ACTDATA_CONTEXT_WITH_SUBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIN_TRUST_ACTDATA_SUBJECT_ONLY` (
    public var `SubjectType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `Subject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 922:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN_TRUST_ACTDATA_SUBJECT_ONLY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIN_TRUST_SUBJECT_FILE` (
    public var `hFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `lpPath`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 933:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN_TRUST_SUBJECT_FILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIN_TRUST_SUBJECT_FILE_AND_DISPLAY` (
    public var `hFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `lpPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 945:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN_TRUST_SUBJECT_FILE_AND_DISPLAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 950:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_CABINET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd17c5374_a392_11cf_9df5_00aa00c184e0);

// UNSUPPORTED Rust 951:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_CABINETEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f458114_c2f1_11cf_8a69_00aa006c3706);

// UNSUPPORTED Rust 952:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_JAVA_CLASS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08ad3990_8da1_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 953:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_JAVA_CLASSEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f458113_c2f1_11cf_8a69_00aa006c3706);

// UNSUPPORTED Rust 954:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_OLE_STORAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc257e740_8da0_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 955:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_PE_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43c9a1e0_8da0_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 956:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_PE_IMAGEEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f458111_c2f1_11cf_8a69_00aa006c3706);

// UNSUPPORTED Rust 957:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_RAW_FILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x959dc450_8d9e_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 958:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WIN_TRUST_SUBJTYPE_RAW_FILEEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f458110_c2f1_11cf_8a69_00aa006c3706);

public const val `WSS_CERTTRUST_SUPPORT`: UInt = 4u;
public const val `WSS_GET_SECONDARY_SIG_COUNT`: `WINTRUST_SIGNATURE_SETTINGS_FLAGS` = 2u;
public const val `WSS_INPUT_FLAG_MASK`: UInt = 7u;
public const val `WSS_OBJTRUST_SUPPORT`: UInt = 1u;
public const val `WSS_OUTPUT_FLAG_MASK`: UInt = 3758096384u;
public const val `WSS_OUT_FILE_SUPPORTS_SEAL`: UInt = 536870912u;
public const val `WSS_OUT_HAS_SEALING_INTENT`: UInt = 1073741824u;
public const val `WSS_OUT_SEALING_STATUS_VERIFIED`: UInt = 2147483648u;
public const val `WSS_SIGTRUST_SUPPORT`: UInt = 2u;
public const val `WSS_VERIFY_SEALING`: UInt = 4u;
public const val `WSS_VERIFY_SPECIFIC`: `WINTRUST_SIGNATURE_SETTINGS_FLAGS` = 1u;
public const val `WTCI_DONT_OPEN_STORES`: UInt = 1u;
public const val `WTCI_OPEN_ONLY_ROOT`: UInt = 2u;
public const val `WTCI_USE_LOCAL_MACHINE`: UInt = 4u;
public const val `WTD_CACHE_ONLY_URL_RETRIEVAL`: `WINTRUST_DATA_PROVIDER_FLAGS` = 4096u;
public const val `WTD_CHOICE_BLOB`: `WINTRUST_DATA_UNION_CHOICE` = 3u;
public const val `WTD_CHOICE_CATALOG`: `WINTRUST_DATA_UNION_CHOICE` = 2u;
public const val `WTD_CHOICE_CERT`: `WINTRUST_DATA_UNION_CHOICE` = 5u;
public const val `WTD_CHOICE_FILE`: `WINTRUST_DATA_UNION_CHOICE` = 1u;
public const val `WTD_CHOICE_SIGNER`: `WINTRUST_DATA_UNION_CHOICE` = 4u;
public const val `WTD_CODE_INTEGRITY_DRIVER_MODE`: UInt = 32768u;
public const val `WTD_DISABLE_MD2_MD4`: `WINTRUST_DATA_PROVIDER_FLAGS` = 8192u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WTD_GENERIC_CHAIN_POLICY_CREATE_INFO` (
    public var `Anonymous`: `WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0`,
    public var `hChainEngine`: `super`.`Cryptography`.`HCERTCHAINENGINE`,
    public var `pChainPara`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_CHAIN_PARA`>?,
    public var `dwFlags`: UInt,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 991:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WTD_GENERIC_CHAIN_POLICY_CREATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 997:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub union WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0 {
//     pub cbStruct: u32,
//     pub cbSize: u32,
// }

// UNSUPPORTED Rust 1004:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WTD_GENERIC_CHAIN_POLICY_DATA` (
    public var `Anonymous`: `WTD_GENERIC_CHAIN_POLICY_DATA_0`,
    public var `pSignerChainInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WTD_GENERIC_CHAIN_POLICY_CREATE_INFO`>?,
    public var `pCounterSignerChainInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WTD_GENERIC_CHAIN_POLICY_CREATE_INFO`>?,
    public var `pfnPolicyCallback`: `PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACK`,
    public var `pvPolicyArg`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1020:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for WTD_GENERIC_CHAIN_POLICY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1026:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub union WTD_GENERIC_CHAIN_POLICY_DATA_0 {
//     pub cbStruct: u32,
//     pub cbSize: u32,
// }

// UNSUPPORTED Rust 1033:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for WTD_GENERIC_CHAIN_POLICY_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO` (
    public var `Anonymous`: `WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0`,
    public var `pChainContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CERT_CHAIN_CONTEXT`>?,
    public var `dwSignerType`: UInt,
    public var `pMsgSignerInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Cryptography`.`CMSG_SIGNER_INFO`>?,
    public var `dwError`: UInt,
    public var `cCounterSigner`: UInt,
    public var `rgpCounterSigner`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO`>>?,
)
// UNSUPPORTED Rust 1051:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1057:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub union WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0 {
//     pub cbStruct: u32,
//     pub cbSize: u32,
// }

// UNSUPPORTED Rust 1064:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTD_HASH_ONLY_FLAG`: `WINTRUST_DATA_PROVIDER_FLAGS` = 512u;
public const val `WTD_LIFETIME_SIGNING_FLAG`: `WINTRUST_DATA_PROVIDER_FLAGS` = 2048u;
public const val `WTD_MOTW`: `WINTRUST_DATA_PROVIDER_FLAGS` = 16384u;
public const val `WTD_NO_IE4_CHAIN_FLAG`: `WINTRUST_DATA_PROVIDER_FLAGS` = 2u;
public const val `WTD_NO_POLICY_USAGE_FLAG`: `WINTRUST_DATA_PROVIDER_FLAGS` = 4u;
public const val `WTD_PROV_FLAGS_MASK`: UInt = 65535u;
public const val `WTD_REVOCATION_CHECK_CHAIN`: `WINTRUST_DATA_PROVIDER_FLAGS` = 64u;
public const val `WTD_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT`: `WINTRUST_DATA_PROVIDER_FLAGS` = 128u;
public const val `WTD_REVOCATION_CHECK_END_CERT`: `WINTRUST_DATA_PROVIDER_FLAGS` = 32u;
public const val `WTD_REVOCATION_CHECK_NONE`: `WINTRUST_DATA_PROVIDER_FLAGS` = 16u;
public const val `WTD_REVOKE_NONE`: `WINTRUST_DATA_REVOCATION_CHECKS` = 0u;
public const val `WTD_REVOKE_WHOLECHAIN`: `WINTRUST_DATA_REVOCATION_CHECKS` = 1u;
public const val `WTD_SAFER_FLAG`: `WINTRUST_DATA_PROVIDER_FLAGS` = 256u;
public const val `WTD_STATEACTION_AUTO_CACHE`: `WINTRUST_DATA_STATE_ACTION` = 3u;
public const val `WTD_STATEACTION_AUTO_CACHE_FLUSH`: `WINTRUST_DATA_STATE_ACTION` = 4u;
public const val `WTD_STATEACTION_CLOSE`: `WINTRUST_DATA_STATE_ACTION` = 2u;
public const val `WTD_STATEACTION_IGNORE`: `WINTRUST_DATA_STATE_ACTION` = 0u;
public const val `WTD_STATEACTION_VERIFY`: `WINTRUST_DATA_STATE_ACTION` = 1u;
public const val `WTD_UICONTEXT_EXECUTE`: `WINTRUST_DATA_UICONTEXT` = 0u;
public const val `WTD_UICONTEXT_INSTALL`: `WINTRUST_DATA_UICONTEXT` = 1u;
public const val `WTD_UI_ALL`: `WINTRUST_DATA_UICHOICE` = 1u;
public const val `WTD_UI_NOBAD`: `WINTRUST_DATA_UICHOICE` = 3u;
public const val `WTD_UI_NOGOOD`: `WINTRUST_DATA_UICHOICE` = 4u;
public const val `WTD_UI_NONE`: `WINTRUST_DATA_UICHOICE` = 2u;
public const val `WTD_USE_DEFAULT_OSVER_CHECK`: `WINTRUST_DATA_PROVIDER_FLAGS` = 1024u;
public const val `WTD_USE_IE4_TRUST_FLAG`: `WINTRUST_DATA_PROVIDER_FLAGS` = 1u;
public const val `WTPF_ALLOWONLYPERTRUST`: `WINTRUST_POLICY_FLAGS` = 262144u;
public const val `WTPF_IGNOREEXPIRATION`: `WINTRUST_POLICY_FLAGS` = 256u;
public const val `WTPF_IGNOREREVOCATIONONTS`: `WINTRUST_POLICY_FLAGS` = 131072u;
public const val `WTPF_IGNOREREVOKATION`: `WINTRUST_POLICY_FLAGS` = 512u;
public const val `WTPF_OFFLINEOKNBU_COM`: `WINTRUST_POLICY_FLAGS` = 8192u;
public const val `WTPF_OFFLINEOKNBU_IND`: `WINTRUST_POLICY_FLAGS` = 4096u;
public const val `WTPF_OFFLINEOK_COM`: `WINTRUST_POLICY_FLAGS` = 2048u;
public const val `WTPF_OFFLINEOK_IND`: `WINTRUST_POLICY_FLAGS` = 1024u;
public const val `WTPF_TESTCANBEVALID`: `WINTRUST_POLICY_FLAGS` = 128u;
public const val `WTPF_TRUSTTEST`: `WINTRUST_POLICY_FLAGS` = 32u;
public const val `WTPF_VERIFY_V1_OFF`: `WINTRUST_POLICY_FLAGS` = 65536u;
public const val `WT_ADD_ACTION_ID_RET_RESULT_FLAG`: UInt = 1u;
public const val `WT_CURRENT_VERSION`: UInt = 512u;
// UNSUPPORTED Rust 1109:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WT_PROVIDER_CERTTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("WintrustCertificateTrust");

// UNSUPPORTED Rust 1110:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WT_PROVIDER_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WINTRUST.DLL");

public const val `WT_TRUSTDBDIALOG_NO_UI_FLAG`: UInt = 1u;
public const val `WT_TRUSTDBDIALOG_ONLY_PUB_TAB_FLAG`: UInt = 2u;
public const val `WT_TRUSTDBDIALOG_WRITE_IEAK_STORE_FLAG`: UInt = 512u;
public const val `WT_TRUSTDBDIALOG_WRITE_LEGACY_REG_FLAG`: UInt = 256u;
// UNSUPPORTED Rust 1115:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_ENHANCED_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.5.1");

// UNSUPPORTED Rust 1116:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_INTENT_TO_SEAL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.2");

// UNSUPPORTED Rust 1117:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_NESTED_SIGNATURE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.1");

// UNSUPPORTED Rust 1118:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_PKCS_9_SEQUENCE_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.25.4");

// UNSUPPORTED Rust 1119:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_SEALING_SIGNATURE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.3");

// UNSUPPORTED Rust 1120:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_SEALING_TIMESTAMP: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.4");

// UNSUPPORTED Rust 1121:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_TRUSTED_CLIENT_AUTH_CA_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.2.2");

// UNSUPPORTED Rust 1122:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_TRUSTED_CODESIGNING_CA_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.2.1");

// UNSUPPORTED Rust 1123:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_TRUSTED_SERVER_AUTH_CA_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.2.3");

