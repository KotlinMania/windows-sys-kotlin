// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CertSelectionGetSerializedBlob(pcsi : *const CERT_SELECTUI_INPUT, ppoutbuffer : *mut *mut core::ffi::c_void, puloutbuffersize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CryptUIDlgCertMgr(pcryptuicertmgr : *const CRYPTUI_CERT_MGR_STRUCT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CryptUIDlgSelectCertificateFromStore(hcertstore : super:: HCERTSTORE, hwnd : super::super::super::Foundation:: HWND, pwsztitle : windows_sys::core::PCWSTR, pwszdisplaystring : windows_sys::core::PCWSTR, dwdontusecolumn : u32, dwflags : u32, pvreserved : *const core::ffi::c_void) -> *mut super:: CERT_CONTEXT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("cryptui.dll" "system" fn CryptUIDlgViewCertificateA(pcertviewinfo : *const CRYPTUI_VIEWCERTIFICATE_STRUCTA, pfpropertieschanged : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("cryptui.dll" "system" fn CryptUIDlgViewCertificateW(pcertviewinfo : *const CRYPTUI_VIEWCERTIFICATE_STRUCTW, pfpropertieschanged : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CryptUIDlgViewContext(dwcontexttype : u32, pvcontext : *const core::ffi::c_void, hwnd : super::super::super::Foundation:: HWND, pwsztitle : windows_sys::core::PCWSTR, dwflags : u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CryptUIWizDigitalSign(dwflags : u32, hwndparent : super::super::super::Foundation:: HWND, pwszwizardtitle : windows_sys::core::PCWSTR, pdigitalsigninfo : *const CRYPTUI_WIZ_DIGITAL_SIGN_INFO, ppsigncontext : *mut *mut CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CryptUIWizExport(dwflags : CRYPTUI_WIZ_FLAGS, hwndparent : super::super::super::Foundation:: HWND, pwszwizardtitle : windows_sys::core::PCWSTR, pexportinfo : *const CRYPTUI_WIZ_EXPORT_INFO, pvoid : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CryptUIWizFreeDigitalSignContext(psigncontext : *const CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("cryptui.dll" "system" fn CryptUIWizImport(dwflags : CRYPTUI_WIZ_FLAGS, hwndparent : super::super::super::Foundation:: HWND, pwszwizardtitle : windows_sys::core::PCWSTR, pimportsrc : *const CRYPTUI_WIZ_IMPORT_SRC_INFO, hdestcertstore : super:: HCERTSTORE) -> windows_sys::core::BOOL);

public const val `ACTION_REVOCATION_DEFAULT_CACHE`: UInt = 131072u;
public const val `ACTION_REVOCATION_DEFAULT_ONLINE`: UInt = 65536u;
public const val `CERTVIEW_CRYPTUI_LPARAM`: UInt = 8388608u;
// UNSUPPORTED Rust 16:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 27:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_FILTER_DATA {
//     pub dwSize: u32,
//     pub cExtensionChecks: u32,
//     pub arrayExtensionChecks: *mut CERT_FILTER_EXTENSION_MATCH,
//     pub dwCheckingFlags: u32,
// }

// UNSUPPORTED Rust 35:1: declaration Impl has no candidate rule
// impl Default for CERT_FILTER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 40:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_FILTER_EXTENSION_MATCH {
//     pub szExtensionOID: windows_sys::core::PCSTR,
//     pub dwTestOperation: u32,
//     pub pbTestData: *mut u8,
//     pub cbTestData: u32,
// }

// UNSUPPORTED Rust 48:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 62:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SELECTUI_INPUT {
//     pub hStore: super::HCERTSTORE,
//     pub prgpChain: *mut *mut super::CERT_CHAIN_CONTEXT,
//     pub cChain: u32,
// }

// UNSUPPORTED Rust 69:1: declaration Impl has no candidate rule
// impl Default for CERT_SELECTUI_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SELECT_STRUCT_A {
//     pub dwSize: u32,
//     pub hwndParent: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub pTemplateName: windows_sys::core::PCSTR,
//     pub dwFlags: CERT_SELECT_STRUCT_FLAGS,
//     pub szTitle: windows_sys::core::PCSTR,
//     pub cCertStore: u32,
//     pub arrayCertStore: *mut super::HCERTSTORE,
//     pub szPurposeOid: windows_sys::core::PCSTR,
//     pub cCertContext: u32,
//     pub arrayCertContext: *mut *mut super::CERT_CONTEXT,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub pfnHook: PFNCMHOOKPROC,
//     pub pfnFilter: PFNCMFILTERPROC,
//     pub szHelpFileName: windows_sys::core::PCSTR,
//     pub dwHelpId: u32,
//     pub hprov: usize,
// }

// UNSUPPORTED Rust 95:1: declaration Impl has no candidate rule
// impl Default for CERT_SELECT_STRUCT_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_SELECT_STRUCT_FLAGS` = UInt;
// UNSUPPORTED Rust 101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SELECT_STRUCT_W {
//     pub dwSize: u32,
//     pub hwndParent: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub pTemplateName: windows_sys::core::PCWSTR,
//     pub dwFlags: CERT_SELECT_STRUCT_FLAGS,
//     pub szTitle: windows_sys::core::PCWSTR,
//     pub cCertStore: u32,
//     pub arrayCertStore: *mut super::HCERTSTORE,
//     pub szPurposeOid: windows_sys::core::PCSTR,
//     pub cCertContext: u32,
//     pub arrayCertContext: *mut *mut super::CERT_CONTEXT,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub pfnHook: PFNCMHOOKPROC,
//     pub pfnFilter: PFNCMFILTERPROC,
//     pub szHelpFileName: windows_sys::core::PCWSTR,
//     pub dwHelpId: u32,
//     pub hprov: usize,
// }

// UNSUPPORTED Rust 122:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_VERIFY_CERTIFICATE_TRUST {
//     pub cbSize: u32,
//     pub pccert: *const super::CERT_CONTEXT,
//     pub dwFlags: u32,
//     pub dwIgnoreErr: u32,
//     pub pdwErrors: *mut u32,
//     pub pszUsageOid: windows_sys::core::PSTR,
//     pub hprov: usize,
//     pub cRootStores: u32,
//     pub rghstoreRoots: *mut super::HCERTSTORE,
//     pub cStores: u32,
//     pub rghstoreCAs: *mut super::HCERTSTORE,
//     pub cTrustStores: u32,
//     pub rghstoreTrust: *mut super::HCERTSTORE,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub pfnTrustHelper: PFNTRUSTHELPER,
//     pub pcChain: *mut u32,
//     pub prgChain: *mut *mut *mut super::CERT_CONTEXT,
//     pub prgdwErrors: *mut *mut u32,
//     pub prgpbTrustInfo: *mut *mut super::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 174:1: declaration Impl has no candidate rule
// impl Default for CERT_VERIFY_CERTIFICATE_TRUST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct CERT_VIEWPROPERTIES_STRUCT_A {
//     pub dwSize: u32,
//     pub hwndParent: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub dwFlags: CERT_VIEWPROPERTIES_STRUCT_FLAGS,
//     pub szTitle: windows_sys::core::PCSTR,
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub arrayPurposes: *mut windows_sys::core::PSTR,
//     pub cArrayPurposes: u32,
//     pub cRootStores: u32,
//     pub rghstoreRoots: *mut super::HCERTSTORE,
//     pub cStores: u32,
//     pub rghstoreCAs: *mut super::HCERTSTORE,
//     pub cTrustStores: u32,
//     pub rghstoreTrust: *mut super::HCERTSTORE,
//     pub hprov: usize,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub dwPad: u32,
//     pub szHelpFileName: windows_sys::core::PCSTR,
//     pub dwHelpId: u32,
//     pub nStartPage: u32,
//     pub cArrayPropSheetPages: u32,
//     pub arrayPropSheetPages: *mut super::super::super::UI::Controls::PROPSHEETPAGEA,
// }

// UNSUPPORTED Rust 206:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CERT_VIEWPROPERTIES_STRUCT_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_VIEWPROPERTIES_STRUCT_FLAGS` = UInt;
// UNSUPPORTED Rust 213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct CERT_VIEWPROPERTIES_STRUCT_W {
//     pub dwSize: u32,
//     pub hwndParent: super::super::super::Foundation::HWND,
//     pub hInstance: super::super::super::Foundation::HINSTANCE,
//     pub dwFlags: CERT_VIEWPROPERTIES_STRUCT_FLAGS,
//     pub szTitle: windows_sys::core::PCWSTR,
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub arrayPurposes: *mut windows_sys::core::PSTR,
//     pub cArrayPurposes: u32,
//     pub cRootStores: u32,
//     pub rghstoreRoots: *mut super::HCERTSTORE,
//     pub cStores: u32,
//     pub rghstoreCAs: *mut super::HCERTSTORE,
//     pub cTrustStores: u32,
//     pub rghstoreTrust: *mut super::HCERTSTORE,
//     pub hprov: usize,
//     pub lCustData: super::super::super::Foundation::LPARAM,
//     pub dwPad: u32,
//     pub szHelpFileName: windows_sys::core::PCWSTR,
//     pub dwHelpId: u32,
//     pub nStartPage: u32,
//     pub cArrayPropSheetPages: u32,
//     pub arrayPropSheetPages: *mut super::super::super::UI::Controls::PROPSHEETPAGEA,
// }

// UNSUPPORTED Rust 240:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 269:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_CERT_MGR_STRUCT {
//     pub dwSize: u32,
//     pub hwndParent: super::super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub pwszTitle: windows_sys::core::PCWSTR,
//     pub pszInitUsageOID: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 278:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 299:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_INITDIALOG_STRUCT {
//     pub lParam: super::super::super::Foundation::LPARAM,
//     pub pCertContext: *const super::CERT_CONTEXT,
// }

// UNSUPPORTED Rust 305:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 318:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_VIEWCERTIFICATE_STRUCTA {
//     pub dwSize: u32,
//     pub hwndParent: super::super::super::Foundation::HWND,
//     pub dwFlags: CRYPTUI_VIEWCERTIFICATE_FLAGS,
//     pub szTitle: windows_sys::core::PCSTR,
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub rgszPurposes: *const windows_sys::core::PCSTR,
//     pub cPurposes: u32,
//     pub Anonymous: CRYPTUI_VIEWCERTIFICATE_STRUCTA_0,
//     pub fpCryptProviderDataTrustedUsage: windows_sys::core::BOOL,
//     pub idxSigner: u32,
//     pub idxCert: u32,
//     pub fCounterSigner: windows_sys::core::BOOL,
//     pub idxCounterSigner: u32,
//     pub cStores: u32,
//     pub rghStores: *mut super::HCERTSTORE,
//     pub cPropSheetPages: u32,
//     pub rgPropSheetPages: *mut super::super::super::UI::Controls::PROPSHEETPAGEA,
//     pub nStartPage: u32,
// }

// UNSUPPORTED Rust 341:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CRYPTUI_VIEWCERTIFICATE_STRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 347:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_VIEWCERTIFICATE_STRUCTA_0 {
//     pub pCryptProviderData: *const super::super::WinTrust::CRYPT_PROVIDER_DATA,
//     pub hWVTStateData: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 354:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CRYPTUI_VIEWCERTIFICATE_STRUCTA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_VIEWCERTIFICATE_STRUCTW {
//     pub dwSize: u32,
//     pub hwndParent: super::super::super::Foundation::HWND,
//     pub dwFlags: CRYPTUI_VIEWCERTIFICATE_FLAGS,
//     pub szTitle: windows_sys::core::PCWSTR,
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub rgszPurposes: *const windows_sys::core::PCSTR,
//     pub cPurposes: u32,
//     pub Anonymous: CRYPTUI_VIEWCERTIFICATE_STRUCTW_0,
//     pub fpCryptProviderDataTrustedUsage: windows_sys::core::BOOL,
//     pub idxSigner: u32,
//     pub idxCert: u32,
//     pub fCounterSigner: windows_sys::core::BOOL,
//     pub idxCounterSigner: u32,
//     pub cStores: u32,
//     pub rghStores: *mut super::HCERTSTORE,
//     pub cPropSheetPages: u32,
//     pub rgPropSheetPages: *mut super::super::super::UI::Controls::PROPSHEETPAGEW,
//     pub nStartPage: u32,
// }

// UNSUPPORTED Rust 383:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// impl Default for CRYPTUI_VIEWCERTIFICATE_STRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 389:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip", feature = "Win32_Security_WinTrust", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_VIEWCERTIFICATE_STRUCTW_0 {
//     pub pCryptProviderData: *const super::super::WinTrust::CRYPT_PROVIDER_DATA,
//     pub hWVTStateData: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 396:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 409:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_DIGITAL_SIGN_BLOB_INFO {
//     pub dwSize: u32,
//     pub pGuidSubject: *mut windows_sys::core::GUID,
//     pub cbBlob: u32,
//     pub pbBlob: *mut u8,
//     pub pwszDisplayName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 418:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_BLOB_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_CERT`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 1u;
// UNSUPPORTED Rust 424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO {
//     pub dwSize: u32,
//     pub pwszSigningCertFileName: windows_sys::core::PWSTR,
//     pub dwPvkChoice: CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION,
//     pub Anonymous: CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0,
// }

// UNSUPPORTED Rust 432:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 437:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0 {
//     pub pPvkFileInfo: *mut CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE_INFO,
//     pub pPvkProvInfo: *mut super::CRYPT_KEY_PROV_INFO,
// }

// UNSUPPORTED Rust 443:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_COMMERCIAL`: `CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE` = 1u;
// UNSUPPORTED Rust 449:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT {
//     pub dwSize: u32,
//     pub cbBlob: u32,
//     pub pbBlob: *mut u8,
// }

// UNSUPPORTED Rust 456:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_EXCLUDE_PAGE_HASHES`: UInt = 2u;
// UNSUPPORTED Rust 462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_DIGITAL_SIGN_EXTENDED_INFO {
//     pub dwSize: u32,
//     pub dwAttrFlags: CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE,
//     pub pwszDescription: windows_sys::core::PCWSTR,
//     pub pwszMoreInfoLocation: windows_sys::core::PCWSTR,
//     pub pszHashAlg: windows_sys::core::PCSTR,
//     pub pwszSigningCertDisplayString: windows_sys::core::PCWSTR,
//     pub hAdditionalCertStore: super::HCERTSTORE,
//     pub psAuthenticated: *mut super::CRYPT_ATTRIBUTES,
//     pub psUnauthenticated: *mut super::CRYPT_ATTRIBUTES,
// }

// UNSUPPORTED Rust 475:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_EXTENDED_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_INCLUDE_PAGE_HASHES`: UInt = 4u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_INDIVIDUAL`: `CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE` = 2u;
// UNSUPPORTED Rust 482:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_DIGITAL_SIGN_INFO {
//     pub dwSize: u32,
//     pub dwSubjectChoice: CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT,
//     pub Anonymous1: CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0,
//     pub dwSigningCertChoice: CRYPTUI_WIZ_DIGITAL_SIGN,
//     pub Anonymous2: CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1,
//     pub pwszTimestampURL: windows_sys::core::PCWSTR,
//     pub dwAdditionalCertChoice: CRYPTUI_WIZ_DIGITAL_ADDITIONAL_CERT_CHOICE,
//     pub pSignExtInfo: *mut CRYPTUI_WIZ_DIGITAL_SIGN_EXTENDED_INFO,
// }

// UNSUPPORTED Rust 494:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 499:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0 {
//     pub pwszFileName: windows_sys::core::PCWSTR,
//     pub pSignBlobInfo: *mut CRYPTUI_WIZ_DIGITAL_SIGN_BLOB_INFO,
// }

// UNSUPPORTED Rust 505:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 510:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1 {
//     pub pSigningCertContext: *const super::CERT_CONTEXT,
//     pub pSigningCertStore: *mut CRYPTUI_WIZ_DIGITAL_SIGN_STORE_INFO,
//     pub pSigningCertPvkInfo: *mut CRYPTUI_WIZ_DIGITAL_SIGN_CERT_PVK_INFO,
// }

// UNSUPPORTED Rust 517:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTUI_WIZ_DIGITAL_SIGN_NONE`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 0u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_PVK`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 3u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE`: `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION` = 1u;
// UNSUPPORTED Rust 525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE_INFO {
//     pub dwSize: u32,
//     pub pwszPvkFileName: windows_sys::core::PWSTR,
//     pub pwszProvName: windows_sys::core::PWSTR,
//     pub dwProvType: u32,
// }

// UNSUPPORTED Rust 533:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_PVK_FILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION` = UInt;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_PROV`: `CRYPTUI_WIZ_DIGITAL_SIGN_PVK_OPTION` = 2u;
public typealias `CRYPTUI_WIZ_DIGITAL_SIGN_SIG_TYPE` = UInt;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_STORE`: `CRYPTUI_WIZ_DIGITAL_SIGN` = 2u;
// UNSUPPORTED Rust 542:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_DIGITAL_SIGN_STORE_INFO {
//     pub dwSize: u32,
//     pub cCertStore: u32,
//     pub rghCertStore: *mut super::HCERTSTORE,
//     pub pFilterCallback: PFNCFILTERPROC,
//     pub pvCallbackData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 551:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_DIGITAL_SIGN_STORE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = UInt;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_BLOB`: `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = 2u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_FILE`: `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = 1u;
public const val `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT_NONE`: `CRYPTUI_WIZ_DIGITAL_SIGN_SUBJECT` = 0u;
// UNSUPPORTED Rust 560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_EXPORT_CERTCONTEXT_INFO {
//     pub dwSize: u32,
//     pub dwExportFormat: CRYPTUI_WIZ_EXPORT_FORMAT,
//     pub fExportChain: windows_sys::core::BOOL,
//     pub fExportPrivateKeys: windows_sys::core::BOOL,
//     pub pwszPassword: windows_sys::core::PCWSTR,
//     pub fStrongEncryption: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 570:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_EXPORT_INFO {
//     pub dwSize: u32,
//     pub pwszExportFileName: windows_sys::core::PCWSTR,
//     pub dwSubjectChoice: CRYPTUI_WIZ_EXPORT_SUBJECT,
//     pub Anonymous: CRYPTUI_WIZ_EXPORT_INFO_0,
//     pub cStores: u32,
//     pub rghStores: *mut super::HCERTSTORE,
// }

// UNSUPPORTED Rust 598:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_EXPORT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 603:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_EXPORT_INFO_0 {
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub pCTLContext: *mut super::CTL_CONTEXT,
//     pub pCRLContext: *mut super::CRL_CONTEXT,
//     pub hCertStore: super::HCERTSTORE,
// }

// UNSUPPORTED Rust 611:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 626:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTUI_WIZ_IMPORT_SRC_INFO {
//     pub dwSize: u32,
//     pub dwSubjectChoice: CRYPTUI_WIZ_IMPORT_SUBJECT_OPTION,
//     pub Anonymous: CRYPTUI_WIZ_IMPORT_SRC_INFO_0,
//     pub dwFlags: super::CRYPT_KEY_FLAGS,
//     pub pwszPassword: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 635:1: declaration Impl has no candidate rule
// impl Default for CRYPTUI_WIZ_IMPORT_SRC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 640:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPTUI_WIZ_IMPORT_SRC_INFO_0 {
//     pub pwszFileName: windows_sys::core::PCWSTR,
//     pub pCertContext: *const super::CERT_CONTEXT,
//     pub pCTLContext: *mut super::CTL_CONTEXT,
//     pub pCRLContext: *mut super::CRL_CONTEXT,
//     pub hCertStore: super::HCERTSTORE,
// }

// UNSUPPORTED Rust 649:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 672:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_MODIFY_REQUEST {
//     pub pccert: *const super::CERT_CONTEXT,
//     pub dwOperation: CTL_MODIFY_REQUEST_OPERATION,
//     pub dwError: u32,
// }

// UNSUPPORTED Rust 679:1: declaration Impl has no candidate rule
// impl Default for CTL_MODIFY_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CTL_MODIFY_REQUEST_ADD_NOT_TRUSTED`: `CTL_MODIFY_REQUEST_OPERATION` = 1u;
public const val `CTL_MODIFY_REQUEST_ADD_TRUSTED`: `CTL_MODIFY_REQUEST_OPERATION` = 3u;
public typealias `CTL_MODIFY_REQUEST_OPERATION` = UInt;
public const val `CTL_MODIFY_REQUEST_REMOVE`: `CTL_MODIFY_REQUEST_OPERATION` = 2u;
// UNSUPPORTED Rust 688:1: generic scalar type unsupported
// pub type PFNCFILTERPROC = Option<unsafe extern "system" fn(pcertcontext: *const super::CERT_CONTEXT, pfinitialselectedcert: *mut windows_sys::core::BOOL, pvcallbackdata: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 689:1: generic scalar type unsupported
// pub type PFNCMFILTERPROC = Option<unsafe extern "system" fn(pcertcontext: *const super::CERT_CONTEXT, param1: super::super::super::Foundation::LPARAM, param2: u32, param3: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 690:1: generic scalar type unsupported
// pub type PFNCMHOOKPROC = Option<unsafe extern "system" fn(hwnddialog: super::super::super::Foundation::HWND, message: u32, wparam: super::super::super::Foundation::WPARAM, lparam: super::super::super::Foundation::LPARAM) -> u32>;

// UNSUPPORTED Rust 691:1: generic scalar type unsupported
// pub type PFNTRUSTHELPER = Option<unsafe extern "system" fn(pcertcontext: *const super::CERT_CONTEXT, lcustdata: super::super::super::Foundation::LPARAM, fleafcertificate: windows_sys::core::BOOL, pbtrustblob: *mut u8) -> windows_sys::core::HRESULT>;

public const val `POLICY_IGNORE_NON_CRITICAL_BC`: UInt = 1u;
public const val `SELCERT_ALGORITHM`: UInt = 105u;
public const val `SELCERT_CERTLIST`: UInt = 102u;
public const val `SELCERT_FINEPRINT`: UInt = 101u;
public const val `SELCERT_ISSUED_TO`: UInt = 103u;
public const val `SELCERT_PROPERTIES`: UInt = 100u;
public const val `SELCERT_SERIAL_NUM`: UInt = 106u;
public const val `SELCERT_THUMBPRINT`: UInt = 107u;
public const val `SELCERT_VALIDITY`: UInt = 104u;
// UNSUPPORTED Rust 701:1: non-scalar type Ptr unsupported
// pub const szCERT_CERTIFICATE_ACTION_VERIFY: windows_sys::core::PCSTR = windows_sys::core::s!("{7801ebd0-cf4b-11d0-851f-0060979387ea}");

