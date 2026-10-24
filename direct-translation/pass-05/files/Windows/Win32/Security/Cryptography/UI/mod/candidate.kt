// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CertSelectionGetSerializedBlob; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CertSelectionGetSerializedBlob`(`pcsi` : /* Rust *const */ kotlinx.cinterop.CPointer<`CERT_SELECTUI_INPUT`>?, `ppoutbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `puloutbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIDlgCertMgr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptUIDlgCertMgr`(`pcryptuicertmgr` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTUI_CERT_MGR_STRUCT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIDlgSelectCertificateFromStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptUIDlgSelectCertificateFromStore`(`hcertstore` : `super`.`HCERTSTORE`, `hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `pwsztitle` : `windows_sys`.`core`.`PCWSTR`, `pwszdisplaystring` : `windows_sys`.`core`.`PCWSTR`, `dwdontusecolumn` : UInt, `dwflags` : UInt, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIDlgViewCertificateA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `CryptUIDlgViewCertificateA`(`pcertviewinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTUI_VIEWCERTIFICATE_STRUCTA`>?, `pfpropertieschanged` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIDlgViewCertificateW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `CryptUIDlgViewCertificateW`(`pcertviewinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTUI_VIEWCERTIFICATE_STRUCTW`>?, `pfpropertieschanged` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIDlgViewContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptUIDlgViewContext`(`dwcontexttype` : UInt, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `pwsztitle` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIWizDigitalSign; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptUIWizDigitalSign`(`dwflags` : UInt, `hwndparent` : `super`.`super`.`super`.`Foundation`.`HWND`, `pwszwizardtitle` : `windows_sys`.`core`.`PCWSTR`, `pdigitalsigninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTUI_WIZ_DIGITAL_SIGN_INFO`>?, `ppsigncontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIWizExport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptUIWizExport`(`dwflags` : `CRYPTUI_WIZ_FLAGS`, `hwndparent` : `super`.`super`.`super`.`Foundation`.`HWND`, `pwszwizardtitle` : `windows_sys`.`core`.`PCWSTR`, `pexportinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTUI_WIZ_EXPORT_INFO`>?, `pvoid` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIWizFreeDigitalSignContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptUIWizFreeDigitalSignContext`(`psigncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cryptui.dll, ABI=system, export=CryptUIWizImport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CryptUIWizImport`(`dwflags` : `CRYPTUI_WIZ_FLAGS`, `hwndparent` : `super`.`super`.`super`.`Foundation`.`HWND`, `pwszwizardtitle` : `windows_sys`.`core`.`PCWSTR`, `pimportsrc` : /* Rust *const */ kotlinx.cinterop.CPointer<`CRYPTUI_WIZ_IMPORT_SRC_INFO`>?, `hdestcertstore` : `super`.`HCERTSTORE`) : `windows_sys`.`core`.`BOOL`
public const val `ACTION_REVOCATION_DEFAULT_CACHE`: UInt = 131072u;
public const val `ACTION_REVOCATION_DEFAULT_ONLINE`: UInt = 65536u;
public const val `CERTVIEW_CRYPTUI_LPARAM`: UInt = 8388608u;
// UNSUPPORTED Rust 16:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CERT_CERTIFICATE_ACTION_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7801ebd0_cf4b_11d0_851f_0060979387ea);

public const val `CERT_CREDENTIAL_PROVIDER_ID`: Int = -509;
public const val `CERT_DISPWELL_DISTRUST_ADD_CA_CERT`: UInt = 8u;
public const val `CERT_DISPWELL_DISTRUST_ADD_LEAF_CERT`: UInt = 9u;
public const val `CERT_DISPWELL_DISTRUST_CA_CERT`: UInt = 6u;
public const val `CERT_DISPWELL_DISTRUST_LEAF_CERT`: UInt = 7u;
public const val `CERT_DISPWELL_SELECT`: UInt = 1u;
public const val `CERT_DISPWELL_TRUST_ADD_CA_CERT`: UInt = 4u;
public const val `CERT_DISPWELL_TRUST_ADD_LEAF_CERT`: UInt = 5u;
public const val `CERT_DISPWELL_TRUST_CA_CERT`: UInt = 2u;
public const val `CERT_DISPWELL_TRUST_LEAF_CERT`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERT_FILTER_DATA` (
    public var `dwSize`: UInt,
    public var `cExtensionChecks`: UInt,
    public var `arrayExtensionChecks`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CERT_FILTER_EXTENSION_MATCH`>?,
    public var `dwCheckingFlags`: UInt,
)
// UNSUPPORTED Rust 35:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CERT_FILTER_DATA {
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
public class `CERT_FILTER_EXTENSION_MATCH` (
    public var `szExtensionOID`: `windows_sys`.`core`.`PCSTR`,
    public var `dwTestOperation`: UInt,
    public var `pbTestData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbTestData`: UInt,
)
// UNSUPPORTED Rust 48:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CERT_FILTER_EXTENSION_MATCH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_FILTER_INCLUDE_V1_CERTS`: UInt = 1u;
public const val `CERT_FILTER_ISSUER_CERTS_ONLY`: UInt = 16u;
public const val `CERT_FILTER_KEY_EXISTS`: UInt = 32u;
public const val `CERT_FILTER_LEAF_CERTS_ONLY`: UInt = 8u;
public const val `CERT_FILTER_OP_EQUALITY`: UInt = 3u;
public const val `CERT_FILTER_OP_EXISTS`: UInt = 1u;
public const val `CERT_FILTER_OP_NOT_EXISTS`: UInt = 2u;
public const val `CERT_FILTER_VALID_SIGNATURE`: UInt = 4u;
public const val `CERT_FILTER_VALID_TIME_RANGE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERT_SELECTUI_INPUT` (
    public var `hStore`: `super`.`HCERTSTORE`,
    public var `prgpChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`CERT_CHAIN_CONTEXT`>>?,
    public var `cChain`: UInt,
)
// UNSUPPORTED Rust 69:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CERT_SELECTUI_INPUT {
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
public class `CERT_SELECT_STRUCT_A` (
    public var `dwSize`: UInt,
    public var `hwndParent`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `dwFlags`: `CERT_SELECT_STRUCT_FLAGS`,
    public var `szTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `cCertStore`: UInt,
    public var `arrayCertStore`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `szPurposeOid`: `windows_sys`.`core`.`PCSTR`,
    public var `cCertContext`: UInt,
    public var `arrayCertContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`CERT_CONTEXT`>>?,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnHook`: `PFNCMHOOKPROC`,
    public var `pfnFilter`: `PFNCMFILTERPROC`,
    public var `szHelpFileName`: `windows_sys`.`core`.`PCSTR`,
    public var `dwHelpId`: UInt,
    public var `hprov`: ULong,
)
// UNSUPPORTED Rust 95:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CERT_SELECT_STRUCT_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_SELECT_STRUCT_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERT_SELECT_STRUCT_W` (
    public var `dwSize`: UInt,
    public var `hwndParent`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `pTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwFlags`: `CERT_SELECT_STRUCT_FLAGS`,
    public var `szTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `cCertStore`: UInt,
    public var `arrayCertStore`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `szPurposeOid`: `windows_sys`.`core`.`PCSTR`,
    public var `cCertContext`: UInt,
    public var `arrayCertContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`CERT_CONTEXT`>>?,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnHook`: `PFNCMHOOKPROC`,
    public var `pfnFilter`: `PFNCMFILTERPROC`,
    public var `szHelpFileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwHelpId`: UInt,
    public var `hprov`: ULong,
)
// UNSUPPORTED Rust 122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CERT_SELECT_STRUCT_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_TRUST_DO_FULL_SEARCH`: UInt = 1u;
public const val `CERT_TRUST_DO_FULL_TRUST`: UInt = 5u;
public const val `CERT_TRUST_MASK`: UInt = 16777215u;
public const val `CERT_TRUST_PERMIT_MISSING_CRLS`: UInt = 2u;
public const val `CERT_VALIDITY_AFTER_END`: UInt = 2u;
public const val `CERT_VALIDITY_BEFORE_START`: UInt = 1u;
public const val `CERT_VALIDITY_CERTIFICATE_REVOKED`: UInt = 8u;
public const val `CERT_VALIDITY_CRL_OUT_OF_DATE`: UInt = 1073741824u;
public const val `CERT_VALIDITY_EXPLICITLY_DISTRUSTED`: UInt = 16777216u;
public const val `CERT_VALIDITY_EXTENDED_USAGE_FAILURE`: UInt = 32u;
public const val `CERT_VALIDITY_ISSUER_DISTRUST`: UInt = 33554432u;
public const val `CERT_VALIDITY_ISSUER_INVALID`: UInt = 256u;
public const val `CERT_VALIDITY_KEY_USAGE_EXT_FAILURE`: UInt = 16u;
public const val `CERT_VALIDITY_MASK_TRUST`: UInt = 4294901760u;
public const val `CERT_VALIDITY_MASK_VALIDITY`: UInt = 65535u;
public const val `CERT_VALIDITY_NAME_CONSTRAINTS_FAILURE`: UInt = 64u;
public const val `CERT_VALIDITY_NO_CRL_FOUND`: UInt = 536870912u;
public const val `CERT_VALIDITY_NO_ISSUER_CERT_FOUND`: UInt = 268435456u;
public const val `CERT_VALIDITY_NO_TRUST_DATA`: UInt = 2147483648u;
public const val `CERT_VALIDITY_OTHER_ERROR`: UInt = 2048u;
public const val `CERT_VALIDITY_OTHER_EXTENSION_FAILURE`: UInt = 512u;
public const val `CERT_VALIDITY_PERIOD_NESTING_FAILURE`: UInt = 1024u;
public const val `CERT_VALIDITY_SIGNATURE_FAILS`: UInt = 4u;
public const val `CERT_VALIDITY_UNKNOWN_CRITICAL_EXTENSION`: UInt = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERT_VERIFY_CERTIFICATE_TRUST` (
    public var `cbSize`: UInt,
    public var `pccert`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?,
    public var `dwFlags`: UInt,
    public var `dwIgnoreErr`: UInt,
    public var `pdwErrors`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `pszUsageOid`: `windows_sys`.`core`.`PSTR`,
    public var `hprov`: ULong,
    public var `cRootStores`: UInt,
    public var `rghstoreRoots`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cStores`: UInt,
    public var `rghstoreCAs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cTrustStores`: UInt,
    public var `rghstoreTrust`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `pfnTrustHelper`: `PFNTRUSTHELPER`,
    public var `pcChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `prgChain`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`super`.`CERT_CONTEXT`>>>?,
    public var `prgdwErrors`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UIntVar>>?,
    public var `prgpbTrustInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`CRYPT_INTEGER_BLOB`>>?,
)
// UNSUPPORTED Rust 174:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CERT_VERIFY_CERTIFICATE_TRUST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERT_VIEWPROPERTIES_STRUCT_A` (
    public var `dwSize`: UInt,
    public var `hwndParent`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `dwFlags`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS`,
    public var `szTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pCertContext`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?,
    public var `arrayPurposes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?,
    public var `cArrayPurposes`: UInt,
    public var `cRootStores`: UInt,
    public var `rghstoreRoots`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cStores`: UInt,
    public var `rghstoreCAs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cTrustStores`: UInt,
    public var `rghstoreTrust`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `hprov`: ULong,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `dwPad`: UInt,
    public var `szHelpFileName`: `windows_sys`.`core`.`PCSTR`,
    public var `dwHelpId`: UInt,
    public var `nStartPage`: UInt,
    public var `cArrayPropSheetPages`: UInt,
    public var `arrayPropSheetPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`Controls`.`PROPSHEETPAGEA`>?,
)
// UNSUPPORTED Rust 206:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CERT_VIEWPROPERTIES_STRUCT_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERT_VIEWPROPERTIES_STRUCT_W` (
    public var `dwSize`: UInt,
    public var `hwndParent`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `dwFlags`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS`,
    public var `szTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pCertContext`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?,
    public var `arrayPurposes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?,
    public var `cArrayPurposes`: UInt,
    public var `cRootStores`: UInt,
    public var `rghstoreRoots`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cStores`: UInt,
    public var `rghstoreCAs`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cTrustStores`: UInt,
    public var `rghstoreTrust`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `hprov`: ULong,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `dwPad`: UInt,
    public var `szHelpFileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwHelpId`: UInt,
    public var `nStartPage`: UInt,
    public var `cArrayPropSheetPages`: UInt,
    public var `arrayPropSheetPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`Controls`.`PROPSHEETPAGEA`>?,
)
// UNSUPPORTED Rust 240:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CERT_VIEWPROPERTIES_STRUCT_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CM_ADD_CERT_STORES`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 512u;
public const val `CM_ENABLEHOOK`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 1u;
public const val `CM_ENABLETEMPLATE`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 8u;
public const val `CM_HIDE_ADVANCEPAGE`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 16u;
public const val `CM_HIDE_DETAILPAGE`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 256u;
public const val `CM_HIDE_TRUSTPAGE`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 32u;
public const val `CM_NO_EDITTRUST`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 128u;
public const val `CM_NO_NAMECHANGE`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 64u;
public const val `CM_SHOW_HELP`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 2u;
public const val `CM_SHOW_HELPICON`: `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = 4u;
public const val `CM_VIEWFLAGS_MASK`: UInt = 16777215u;
public const val `CRYPTDLG_ACTION_MASK`: UInt = 4294901760u;
public const val `CRYPTDLG_CACHE_ONLY_URL_RETRIEVAL`: UInt = 268435456u;
public const val `CRYPTDLG_DISABLE_AIA`: UInt = 134217728u;
public const val `CRYPTDLG_POLICY_MASK`: UInt = 65535u;
public const val `CRYPTDLG_REVOCATION_CACHE`: UInt = 1073741824u;
public const val `CRYPTDLG_REVOCATION_DEFAULT`: UInt = 0u;
public const val `CRYPTDLG_REVOCATION_NONE`: UInt = 536870912u;
public const val `CRYPTDLG_REVOCATION_ONLINE`: UInt = 2147483648u;
public const val `CRYPTUI_ACCEPT_DECLINE_STYLE`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 64u;
public const val `CRYPTUI_CACHE_ONLY_URL_RETRIEVAL`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 262144u;
public const val `CRYPTUI_CERT_MGR_PUBLISHER_TAB`: UInt = 4u;
public const val `CRYPTUI_CERT_MGR_SINGLE_TAB_FLAG`: UInt = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_CERT_MGR_STRUCT` (
    public var `dwSize`: UInt,
    public var `hwndParent`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `pwszTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszInitUsageOID`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_CERT_MGR_STRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_CERT_MGR_TAB_MASK`: UInt = 15u;
public const val `CRYPTUI_DISABLE_ADDTOSTORE`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 16u;
public const val `CRYPTUI_DISABLE_EDITPROPERTIES`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 4u;
public const val `CRYPTUI_DISABLE_EXPORT`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 8192u;
public const val `CRYPTUI_DISABLE_HTMLLINK`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 65536u;
public const val `CRYPTUI_DISABLE_ISSUERSTATEMENT`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 131072u;
public const val `CRYPTUI_DONT_OPEN_STORES`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 256u;
public const val `CRYPTUI_ENABLE_ADDTOSTORE`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 32u;
public const val `CRYPTUI_ENABLE_EDITPROPERTIES`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 8u;
public const val `CRYPTUI_ENABLE_REVOCATION_CHECKING`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 2048u;
public const val `CRYPTUI_ENABLE_REVOCATION_CHECK_CHAIN`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 32768u;
public const val `CRYPTUI_ENABLE_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 2048u;
public const val `CRYPTUI_ENABLE_REVOCATION_CHECK_END_CERT`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 16384u;
public const val `CRYPTUI_HIDE_DETAILPAGE`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 2u;
public const val `CRYPTUI_HIDE_HIERARCHYPAGE`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 1u;
public const val `CRYPTUI_IGNORE_UNTRUSTED_ROOT`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 128u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_INITDIALOG_STRUCT` (
    public var `lParam`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `pCertContext`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?,
)
// UNSUPPORTED Rust 305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_INITDIALOG_STRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_ONLY_OPEN_ROOT_STORE`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 512u;
public const val `CRYPTUI_SELECT_EXPIRATION_COLUMN`: ULong = 32uL;
public const val `CRYPTUI_SELECT_FRIENDLYNAME_COLUMN`: ULong = 8uL;
public const val `CRYPTUI_SELECT_INTENDEDUSE_COLUMN`: ULong = 4uL;
public const val `CRYPTUI_SELECT_ISSUEDBY_COLUMN`: ULong = 2uL;
public const val `CRYPTUI_SELECT_ISSUEDTO_COLUMN`: ULong = 1uL;
public const val `CRYPTUI_SELECT_LOCATION_COLUMN`: ULong = 16uL;
public typealias `CRYPTUI_VIEWCERTIFICATE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_VIEWCERTIFICATE_STRUCTA` (
    public var `dwSize`: UInt,
    public var `hwndParent`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: `CRYPTUI_VIEWCERTIFICATE_FLAGS`,
    public var `szTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `pCertContext`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?,
    public var `rgszPurposes`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?,
    public var `cPurposes`: UInt,
    public var `Anonymous`: `CRYPTUI_VIEWCERTIFICATE_STRUCTA_0`,
    public var `fpCryptProviderDataTrustedUsage`: `windows_sys`.`core`.`BOOL`,
    public var `idxSigner`: UInt,
    public var `idxCert`: UInt,
    public var `fCounterSigner`: `windows_sys`.`core`.`BOOL`,
    public var `idxCounterSigner`: UInt,
    public var `cStores`: UInt,
    public var `rghStores`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cPropSheetPages`: UInt,
    public var `rgPropSheetPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`Controls`.`PROPSHEETPAGEA`>?,
    public var `nStartPage`: UInt,
)
// UNSUPPORTED Rust 341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CRYPTUI_VIEWCERTIFICATE_STRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 347:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_VIEWCERTIFICATE_STRUCTA_0 {
//     pub pCryptProviderData: *const super::super::WinTrust::CRYPT_PROVIDER_DATA,
//     pub hWVTStateData: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 354:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CRYPTUI_VIEWCERTIFICATE_STRUCTA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_VIEWCERTIFICATE_STRUCTW` (
    public var `dwSize`: UInt,
    public var `hwndParent`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: `CRYPTUI_VIEWCERTIFICATE_FLAGS`,
    public var `szTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `pCertContext`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?,
    public var `rgszPurposes`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?,
    public var `cPurposes`: UInt,
    public var `Anonymous`: `CRYPTUI_VIEWCERTIFICATE_STRUCTW_0`,
    public var `fpCryptProviderDataTrustedUsage`: `windows_sys`.`core`.`BOOL`,
    public var `idxSigner`: UInt,
    public var `idxCert`: UInt,
    public var `fCounterSigner`: `windows_sys`.`core`.`BOOL`,
    public var `idxCounterSigner`: UInt,
    public var `cStores`: UInt,
    public var `rghStores`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `cPropSheetPages`: UInt,
    public var `rgPropSheetPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`UI`.`Controls`.`PROPSHEETPAGEW`>?,
    public var `nStartPage`: UInt,
)
// UNSUPPORTED Rust 383:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CRYPTUI_VIEWCERTIFICATE_STRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 389:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_VIEWCERTIFICATE_STRUCTW_0 {
//     pub pCryptProviderData: *const super::super::WinTrust::CRYPT_PROVIDER_DATA,
//     pub hWVTStateData: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 396:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CRYPTUI_VIEWCERTIFICATE_STRUCTW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WARN_REMOTE_TRUST`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 4096u;
public const val `CRYPTUI_WARN_UNTRUSTED_ROOT`: `CRYPTUI_VIEWCERTIFICATE_FLAGS` = 1024u;
public typealias `CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE` = UInt;
public typealias `CRYPTUI_WIZ_DIGITAL_SIGN` = UInt;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_ADD_CHAIN`: `CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE` = 1u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_ADD_CHAIN_NO_ROOT`: `CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE` = 2u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_ADD_NONE`: `CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_DIGITAL_SIGN_BLOB_INFO` (
    public var `dwSize`: UInt,
    public var `pGuidSubject`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cbBlob`: UInt,
    public var `pbBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `pwszDisplayName`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 418:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_BLOB_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_CERT`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO` (
    public var `dwSize`: UInt,
    public var `pwszSigningCertFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPvkChoice`: `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION`,
    public var `Anonymous`: `CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0`,
)
// UNSUPPORTED Rust 432:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 437:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0 {
//     pub pPvkFileInfo: *mut CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE_INFO,
//     pub pPvkProvInfo: *mut super::CRYPT_KEY_PROV_INFO,
// }

// UNSUPPORTED Rust 443:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_COMMERCIAL`: `CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT` (
    public var `dwSize`: UInt,
    public var `cbBlob`: UInt,
    public var `pbBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 456:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_EXCLUDE_PAGE_HASHES`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_DIGITAL_SIGN_EXTENDED_INFO` (
    public var `dwSize`: UInt,
    public var `dwAttrFlags`: `CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE`,
    public var `pwszDescription`: `windows_sys`.`core`.`PCWSTR`,
    public var `pwszMoreInfoLocation`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszHashAlg`: `windows_sys`.`core`.`PCSTR`,
    public var `pwszSigningCertDisplayString`: `windows_sys`.`core`.`PCWSTR`,
    public var `hAdditionalCertStore`: `super`.`HCERTSTORE`,
    public var `psAuthenticated`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`CRYPT_ATTRIBUTES`>?,
    public var `psUnauthenticated`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`CRYPT_ATTRIBUTES`>?,
)
// UNSUPPORTED Rust 475:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_EXTENDED_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_INCLUDE_PAGE_HASHES`: UInt = 4u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_INDIVIDUAL`: `CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_DIGITAL_SIGN_INFO` (
    public var `dwSize`: UInt,
    public var `dwSubjectChoice`: `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT`,
    public var `Anonymous1`: `CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0`,
    public var `dwSigningCertChoice`: `CRYPTUI_WIZ_DIGITAL_SIGN`,
    public var `Anonymous2`: `CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1`,
    public var `pwszTimestampURL`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwAdditionalCertChoice`: `CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE`,
    public var `pSignExtInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CRYPTUI_WIZ_DIGITAL_SIGN_EXTENDED_INFO`>?,
)
// UNSUPPORTED Rust 494:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 499:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0 {
//     pub pwszFileName: windows_sys::core::PCWSTR,
//     pub pSignBlobInfo: *mut CRYPTUI_WIZ_DIGITAL_SIGN_BLOB_INFO,
// }

// UNSUPPORTED Rust 505:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 510:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1 {
//     pub pSigningCertContext: *const super::CERT_CONTEXT,
//     pub pSigningCertStore: *mut CRYPTUI_WIZ_DIGITAL_SIGN_STORE_INFO,
//     pub pSigningCertPvkInfo: *mut CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO,
// }

// UNSUPPORTED Rust 517:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_NONE`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 0u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_PVK`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 3u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE`: `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE_INFO` (
    public var `dwSize`: UInt,
    public var `pwszPvkFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszProvName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwProvType`: UInt,
)
// UNSUPPORTED Rust 533:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION` = UInt;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_PROV`: `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION` = 2u;
public typealias `CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE` = UInt;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_STORE`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_DIGITAL_SIGN_STORE_INFO` (
    public var `dwSize`: UInt,
    public var `cCertStore`: UInt,
    public var `rghCertStore`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
    public var `pFilterCallback`: `PFNCFILTERPROC`,
    public var `pvCallbackData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 551:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_STORE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = UInt;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_BLOB`: `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = 2u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_FILE`: `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = 1u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_NONE`: `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_EXPORT_CERTCONTEXT_INFO` (
    public var `dwSize`: UInt,
    public var `dwExportFormat`: `CRYPTUI_WIZ_EXPORT_FORMAT`,
    public var `fExportChain`: `windows_sys`.`core`.`BOOL`,
    public var `fExportPrivateKeys`: `windows_sys`.`core`.`BOOL`,
    public var `pwszPassword`: `windows_sys`.`core`.`PCWSTR`,
    public var `fStrongEncryption`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_EXPORT_CERTCONTEXT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_EXPORT_CERT_CONTEXT`: `CRYPTUI_WIZ_EXPORT_SUBJECT` = 1u;
public const val `CRYPTUI_WIZ_EXPORT_CERT_STORE`: `CRYPTUI_WIZ_EXPORT_SUBJECT` = 4u;
public const val `CRYPTUI_WIZ_EXPORT_CERT_STORE_CERTIFICATES_ONLY`: `CRYPTUI_WIZ_EXPORT_SUBJECT` = 5u;
public const val `CRYPTUI_WIZ_EXPORT_CRL_CONTEXT`: `CRYPTUI_WIZ_EXPORT_SUBJECT` = 3u;
public const val `CRYPTUI_WIZ_EXPORT_CTL_CONTEXT`: `CRYPTUI_WIZ_EXPORT_SUBJECT` = 2u;
public typealias `CRYPTUI_WIZ_EXPORT_FORMAT` = UInt;
public const val `CRYPTUI_WIZ_EXPORT_FORMAT_BASE64`: `CRYPTUI_WIZ_EXPORT_FORMAT` = 4u;
public const val `CRYPTUI_WIZ_EXPORT_FORMAT_CRL`: `CRYPTUI_WIZ_EXPORT_FORMAT` = 6u;
public const val `CRYPTUI_WIZ_EXPORT_FORMAT_CTL`: `CRYPTUI_WIZ_EXPORT_FORMAT` = 7u;
public const val `CRYPTUI_WIZ_EXPORT_FORMAT_DER`: `CRYPTUI_WIZ_EXPORT_FORMAT` = 1u;
public const val `CRYPTUI_WIZ_EXPORT_FORMAT_PFX`: `CRYPTUI_WIZ_EXPORT_FORMAT` = 2u;
public const val `CRYPTUI_WIZ_EXPORT_FORMAT_PKCS7`: `CRYPTUI_WIZ_EXPORT_FORMAT` = 3u;
public const val `CRYPTUI_WIZ_EXPORT_FORMAT_SERIALIZED_CERT_STORE`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_EXPORT_INFO` (
    public var `dwSize`: UInt,
    public var `pwszExportFileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwSubjectChoice`: `CRYPTUI_WIZ_EXPORT_SUBJECT`,
    public var `Anonymous`: `CRYPTUI_WIZ_EXPORT_INFO_0`,
    public var `cStores`: UInt,
    public var `rghStores`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HCERTSTORE`>?,
)
// UNSUPPORTED Rust 598:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_EXPORT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 603:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_EXPORT_INFO_0 {
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub pCTLContext: *mut super::CTL_CONTEXT,
//     pub pCRLContext: *mut super::CRL_CONTEXT,
//     pub hCertStore: super::HCERTSTORE,
// }

// UNSUPPORTED Rust 611:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_EXPORT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_EXPORT_NO_DELETE_PRIVATE_KEY`: `CRYPTUI_WIZ_FLAGS` = 512u;
public const val `CRYPTUI_WIZ_EXPORT_PRIVATE_KEY`: `CRYPTUI_WIZ_FLAGS` = 256u;
public typealias `CRYPTUI_WIZ_EXPORT_SUBJECT` = UInt;
public typealias `CRYPTUI_WIZ_FLAGS` = UInt;
public const val `CRYPTUI_WIZ_IGNORE_NO_UI_FLAG_FOR_CSPS`: `CRYPTUI_WIZ_FLAGS` = 2u;
public const val `CRYPTUI_WIZ_IMPORT_ALLOW_CERT`: `CRYPTUI_WIZ_FLAGS` = 131072u;
public const val `CRYPTUI_WIZ_IMPORT_ALLOW_CRL`: `CRYPTUI_WIZ_FLAGS` = 262144u;
public const val `CRYPTUI_WIZ_IMPORT_ALLOW_CTL`: `CRYPTUI_WIZ_FLAGS` = 524288u;
public const val `CRYPTUI_WIZ_IMPORT_NO_CHANGE_DEST_STORE`: `CRYPTUI_WIZ_FLAGS` = 65536u;
public const val `CRYPTUI_WIZ_IMPORT_REMOTE_DEST_STORE`: `CRYPTUI_WIZ_FLAGS` = 4194304u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CRYPTUI_WIZ_IMPORT_SRC_INFO` (
    public var `dwSize`: UInt,
    public var `dwSubjectChoice`: `CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION`,
    public var `Anonymous`: `CRYPTUI_WIZ_IMPORT_SRC_INFO_0`,
    public var `dwFlags`: `super`.`CRYPT_KEY_FLAGS`,
    public var `pwszPassword`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 635:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_IMPORT_SRC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 640:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_IMPORT_SRC_INFO_0 {
//     pub pwszFileName: windows_sys::core::PCWSTR,
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub pCTLContext: *mut super::CTL_CONTEXT,
//     pub pCRLContext: *mut super::CRL_CONTEXT,
//     pub hCertStore: super::HCERTSTORE,
// }

// UNSUPPORTED Rust 649:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CRYPTUI_WIZ_IMPORT_SRC_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_IMPORT_SUBJECT_CERT_CONTEXT`: `CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION` = 2u;
public const val `CRYPTUI_WIZ_IMPORT_SUBJECT_CERT_STORE`: `CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION` = 5u;
public const val `CRYPTUI_WIZ_IMPORT_SUBJECT_CRL_CONTEXT`: `CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION` = 4u;
public const val `CRYPTUI_WIZ_IMPORT_SUBJECT_CTL_CONTEXT`: `CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION` = 3u;
public const val `CRYPTUI_WIZ_IMPORT_SUBJECT_FILE`: `CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION` = 1u;
public typealias `CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION` = UInt;
public const val `CRYPTUI_WIZ_IMPORT_TO_CURRENTUSER`: `CRYPTUI_WIZ_FLAGS` = 2097152u;
public const val `CRYPTUI_WIZ_IMPORT_TO_LOCALMACHINE`: `CRYPTUI_WIZ_FLAGS` = 1048576u;
public const val `CRYPTUI_WIZ_NO_UI`: `CRYPTUI_WIZ_FLAGS` = 1u;
public const val `CRYPTUI_WIZ_NO_UI_EXCEPT_CSP`: `CRYPTUI_WIZ_FLAGS` = 3u;
public const val `CRYTPDLG_FLAGS_MASK`: UInt = 4278190080u;
public const val `CSS_ALLOWMULTISELECT`: `CERT_SELECT_STRUCT_FLAGS` = 4u;
public const val `CSS_ENABLEHOOK`: `CERT_SELECT_STRUCT_FLAGS` = 2u;
public const val `CSS_ENABLETEMPLATE`: `CERT_SELECT_STRUCT_FLAGS` = 32u;
public const val `CSS_ENABLETEMPLATEHANDLE`: `CERT_SELECT_STRUCT_FLAGS` = 64u;
public const val `CSS_HIDE_PROPERTIES`: `CERT_SELECT_STRUCT_FLAGS` = 1u;
public const val `CSS_SELECTCERT_MASK`: UInt = 16777215u;
public const val `CSS_SHOW_HELP`: `CERT_SELECT_STRUCT_FLAGS` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CTL_MODIFY_REQUEST` (
    public var `pccert`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?,
    public var `dwOperation`: `CTL_MODIFY_REQUEST_OPERATION`,
    public var `dwError`: UInt,
)
// UNSUPPORTED Rust 679:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CTL_MODIFY_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CTL_MODIFY_REQUEST_ADD_NOT_TRUSTED`: `CTL_MODIFY_REQUEST_OPERATION` = 1u;
public const val `CTL_MODIFY_REQUEST_ADD_TRUSTED`: `CTL_MODIFY_REQUEST_OPERATION` = 3u;
public typealias `CTL_MODIFY_REQUEST_OPERATION` = UInt;
public const val `CTL_MODIFY_REQUEST_REMOVE`: `CTL_MODIFY_REQUEST_OPERATION` = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCFILTERPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCMFILTERPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, `super`.`super`.`super`.`Foundation`.`LPARAM`, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCMHOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNTRUSTHELPER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`CERT_CONTEXT`>?, `super`.`super`.`super`.`Foundation`.`LPARAM`, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `POLICY_IGNORE_NON_CRITICAL_BC`: UInt = 1u;
public const val `SELCERT_ALGORITHM`: UInt = 105u;
public const val `SELCERT_CERTLIST`: UInt = 102u;
public const val `SELCERT_FINEPRINT`: UInt = 101u;
public const val `SELCERT_ISSUED_TO`: UInt = 103u;
public const val `SELCERT_PROPERTIES`: UInt = 100u;
public const val `SELCERT_SERIAL_NUM`: UInt = 106u;
public const val `SELCERT_THUMBPRINT`: UInt = 107u;
public const val `SELCERT_VALIDITY`: UInt = 104u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `szCERT_CERTIFICATE_ACTION_VERIFY`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("{7801ebd0-cf4b-11d0-851f-0060979387ea}");
