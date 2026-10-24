// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn OpenPersonalTrustDBDialog(hwndparent : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn OpenPersonalTrustDBDialogEx(hwndparent : super::super::Foundation:: HWND, dwflags : u32, pvreserved : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// windows_link::link!("wintrust.dll" "system" fn WTHelperCertCheckValidSignature(pprovdata : *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wintrust.dll" "system" fn WTHelperCertIsSelfSigned(dwencoding : u32, pcert : *mut super::Cryptography:: CERT_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wintrust.dll" "system" fn WTHelperGetProvCertFromChain(psgnr : *mut CRYPT_PROVIDER_SGNR, idxcert : u32) -> *mut CRYPT_PROVIDER_CERT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// windows_link::link!("wintrust.dll" "system" fn WTHelperGetProvPrivateDataFromChain(pprovdata : *mut CRYPT_PROVIDER_DATA, pgproviderid : *mut windows_sys::core::GUID) -> *mut CRYPT_PROVIDER_PRIVDATA);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// windows_link::link!("wintrust.dll" "system" fn WTHelperGetProvSignerFromChain(pprovdata : *mut CRYPT_PROVIDER_DATA, idxsigner : u32, fcountersigner : windows_sys::core::BOOL, idxcountersigner : u32) -> *mut CRYPT_PROVIDER_SGNR);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// windows_link::link!("wintrust.dll" "system" fn WTHelperProvDataFromStateData(hstatedata : super::super::Foundation:: HANDLE) -> *mut CRYPT_PROVIDER_DATA);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WinVerifyTrust(hwnd : super::super::Foundation:: HWND, pgactionid : *mut windows_sys::core::GUID, pwvtdata : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wintrust.dll" "system" fn WinVerifyTrustEx(hwnd : super::super::Foundation:: HWND, pgactionid : *mut windows_sys::core::GUID, pwintrustdata : *mut WINTRUST_DATA) -> i32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WintrustAddActionID(pgactionid : *const windows_sys::core::GUID, fdwflags : u32, psprovinfo : *const CRYPT_REGISTER_ACTIONID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WintrustAddDefaultForUsage(pszusageoid : windows_sys::core::PCSTR, psdefusage : *const CRYPT_PROVIDER_REGDEFUSAGE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WintrustGetDefaultForUsage(dwaction : WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION, pszusageoid : windows_sys::core::PCSTR, psusage : *mut CRYPT_PROVIDER_DEFUSAGE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WintrustGetRegPolicyFlags(pdwpolicyflags : *mut WINTRUST_POLICY_FLAGS));

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// windows_link::link!("wintrust.dll" "system" fn WintrustLoadFunctionPointers(pgactionid : *mut windows_sys::core::GUID, ppfns : *mut CRYPT_PROVIDER_FUNCTIONS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WintrustRemoveActionID(pgactionid : *const windows_sys::core::GUID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WintrustSetDefaultIncludePEPageHashes(fincludepepagehashes : windows_sys::core::BOOL));

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn WintrustSetRegPolicyFlags(dwpolicyflags : WINTRUST_POLICY_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CAT_MEMBERINFO {
//     pub pwszSubjGuid: windows_sys::core::PWSTR,
//     pub dwCertVersion: u32,
// }

// UNSUPPORTED Rust 33:1: declaration Impl has no candidate rule
// impl Default for CAT_MEMBERINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 38:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CAT_MEMBERINFO2 {
//     pub SubjectGuid: windows_sys::core::GUID,
//     pub dwCertVersion: u32,
// }

// UNSUPPORTED Rust 44:1: non-scalar type Ptr unsupported
// pub const CAT_MEMBERINFO2_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.2.3");

// UNSUPPORTED Rust 45:1: non-scalar type Ptr unsupported
// pub const CAT_MEMBERINFO2_STRUCT: windows_sys::core::PCSTR = 2223i32 as _;

// UNSUPPORTED Rust 46:1: non-scalar type Ptr unsupported
// pub const CAT_MEMBERINFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.2.2");

// UNSUPPORTED Rust 47:1: non-scalar type Ptr unsupported
// pub const CAT_MEMBERINFO_STRUCT: windows_sys::core::PCSTR = 2222i32 as _;

// UNSUPPORTED Rust 48:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct CAT_NAMEVALUE {
//     pub pwszTag: windows_sys::core::PWSTR,
//     pub fdwFlags: u32,
//     pub Value: super::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 56:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CAT_NAMEVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 62:1: non-scalar type Ptr unsupported
// pub const CAT_NAMEVALUE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.12.2.1");

// UNSUPPORTED Rust 63:1: non-scalar type Ptr unsupported
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
// UNSUPPORTED Rust 73:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CONFIG_CI_ACTION_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6078065b_8f22_4b13_bd9b_5b762776f386);

// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct CONFIG_CI_PROV_INFO {
//     pub cbSize: u32,
//     pub dwPolicies: u32,
//     pub pPolicies: *mut super::Cryptography::CRYPT_INTEGER_BLOB,
//     pub result: CONFIG_CI_PROV_INFO_RESULT,
//     pub dwScenario: u32,
//     pub result2: *mut CONFIG_CI_PROV_INFO_RESULT2,
// }

// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CONFIG_CI_PROV_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 91:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CONFIG_CI_PROV_INFO_RESULT {
//     pub hr: windows_sys::core::HRESULT,
//     pub dwResult: u32,
//     pub dwPolicyIndex: u32,
//     pub fIsExplicitDeny: bool,
// }

// UNSUPPORTED Rust 99:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONFIG_CI_PROV_INFO_RESULT2 {
//     pub cbSize: u32,
//     pub hr: windows_sys::core::HRESULT,
//     pub dwResult: u32,
//     pub dwPolicyIndex: u32,
//     pub fIsExplicitDeny: bool,
//     pub cbCalculatedFileHash: u32,
//     pub pbCalculatedFileHash: *mut u8,
// }

// UNSUPPORTED Rust 110:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 127:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_CERT {
//     pub cbStruct: u32,
//     pub pCert: *const super::Cryptography::CERT_CONTEXT,
//     pub fCommercial: windows_sys::core::BOOL,
//     pub fTrustedRoot: windows_sys::core::BOOL,
//     pub fSelfSigned: windows_sys::core::BOOL,
//     pub fTestCert: windows_sys::core::BOOL,
//     pub dwRevokedReason: u32,
//     pub dwConfidence: u32,
//     pub dwError: u32,
//     pub pTrustListContext: *mut super::Cryptography::CTL_CONTEXT,
//     pub fTrustListSignerCert: windows_sys::core::BOOL,
//     pub pCtlContext: *mut super::Cryptography::CTL_CONTEXT,
//     pub dwCtlError: u32,
//     pub fIsCyclic: windows_sys::core::BOOL,
//     pub pChainElement: *mut super::Cryptography::CERT_CHAIN_ELEMENT,
// }

// UNSUPPORTED Rust 147:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CRYPT_PROVIDER_CERT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 153:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_DATA {
//     pub cbStruct: u32,
//     pub pWintrustData: *mut WINTRUST_DATA,
//     pub fOpenedFile: windows_sys::core::BOOL,
//     pub hWndParent: super::super::Foundation::HWND,
//     pub pgActionID: *mut windows_sys::core::GUID,
//     pub hProv: usize,
//     pub dwError: u32,
//     pub dwRegSecuritySettings: u32,
//     pub dwRegPolicySettings: u32,
//     pub psPfns: *mut CRYPT_PROVIDER_FUNCTIONS,
//     pub cdwTrustStepErrors: u32,
//     pub padwTrustStepErrors: *mut u32,
//     pub chStores: u32,
//     pub pahStores: *mut super::Cryptography::HCERTSTORE,
//     pub dwEncoding: u32,
//     pub hMsg: *mut core::ffi::c_void,
//     pub csSigners: u32,
//     pub pasSigners: *mut CRYPT_PROVIDER_SGNR,
//     pub csProvPrivData: u32,
//     pub pasProvPrivData: *mut CRYPT_PROVIDER_PRIVDATA,
//     pub dwSubjectChoice: u32,
//     pub Anonymous: CRYPT_PROVIDER_DATA_0,
//     pub pszUsageOID: windows_sys::core::PSTR,
//     pub fRecallWithState: windows_sys::core::BOOL,
//     pub sftSystemTime: super::super::Foundation::FILETIME,
//     pub pszCTLSignerUsageOID: windows_sys::core::PSTR,
//     pub dwProvFlags: u32,
//     pub dwFinalError: u32,
//     pub pRequestUsage: *mut super::Cryptography::CERT_USAGE_MATCH,
//     pub dwTrustPubSettings: u32,
//     pub dwUIStateFlags: u32,
//     pub pSigState: *mut CRYPT_PROVIDER_SIGSTATE,
//     pub pSigSettings: *mut WINTRUST_SIGNATURE_SETTINGS,
// }

// UNSUPPORTED Rust 191:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVIDER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 197:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub union CRYPT_PROVIDER_DATA_0 {
//     pub pPDSip: *mut PROVDATA_SIP,
// }

// UNSUPPORTED Rust 203:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVIDER_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_DEFUSAGE {
//     pub cbStruct: u32,
//     pub gActionID: windows_sys::core::GUID,
//     pub pDefPolicyCallbackData: *mut core::ffi::c_void,
//     pub pDefSIPClientData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 217:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVIDER_DEFUSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_FUNCTIONS {
//     pub cbStruct: u32,
//     pub pfnAlloc: PFN_CPD_MEM_ALLOC,
//     pub pfnFree: PFN_CPD_MEM_FREE,
//     pub pfnAddStore2Chain: PFN_CPD_ADD_STORE,
//     pub pfnAddSgnr2Chain: PFN_CPD_ADD_SGNR,
//     pub pfnAddCert2Chain: PFN_CPD_ADD_CERT,
//     pub pfnAddPrivData2Chain: PFN_CPD_ADD_PRIVDATA,
//     pub pfnInitialize: PFN_PROVIDER_INIT_CALL,
//     pub pfnObjectTrust: PFN_PROVIDER_OBJTRUST_CALL,
//     pub pfnSignatureTrust: PFN_PROVIDER_SIGTRUST_CALL,
//     pub pfnCertificateTrust: PFN_PROVIDER_CERTTRUST_CALL,
//     pub pfnFinalPolicy: PFN_PROVIDER_FINALPOLICY_CALL,
//     pub pfnCertCheckPolicy: PFN_PROVIDER_CERTCHKPOLICY_CALL,
//     pub pfnTestFinalPolicy: PFN_PROVIDER_TESTFINALPOLICY_CALL,
//     pub psUIpfns: *mut CRYPT_PROVUI_FUNCS,
//     pub pfnCleanupPolicy: PFN_PROVIDER_CLEANUP_CALL,
// }

// UNSUPPORTED Rust 243:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVIDER_FUNCTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 249:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_PRIVDATA {
//     pub cbStruct: u32,
//     pub gProviderID: windows_sys::core::GUID,
//     pub cbProvData: u32,
//     pub pvProvData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 257:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVIDER_PRIVDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 262:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_REGDEFUSAGE {
//     pub cbStruct: u32,
//     pub pgActionID: *mut windows_sys::core::GUID,
//     pub pwszDllName: windows_sys::core::PWSTR,
//     pub pwszLoadCallbackDataFunctionName: windows_sys::core::PSTR,
//     pub pwszFreeCallbackDataFunctionName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 271:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVIDER_REGDEFUSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 276:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_SGNR {
//     pub cbStruct: u32,
//     pub sftVerifyAsOf: super::super::Foundation::FILETIME,
//     pub csCertChain: u32,
//     pub pasCertChain: *mut CRYPT_PROVIDER_CERT,
//     pub dwSignerType: u32,
//     pub psSigner: *mut super::Cryptography::CMSG_SIGNER_INFO,
//     pub dwError: u32,
//     pub csCounterSigners: u32,
//     pub pasCounterSigners: *mut CRYPT_PROVIDER_SGNR,
//     pub pChainContext: *mut super::Cryptography::CERT_CHAIN_CONTEXT,
// }

// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CRYPT_PROVIDER_SGNR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_SIGSTATE {
//     pub cbStruct: u32,
//     pub rhSecondarySigs: *mut *mut core::ffi::c_void,
//     pub hPrimarySig: *mut core::ffi::c_void,
//     pub fFirstAttemptMade: windows_sys::core::BOOL,
//     pub fNoMoreSigs: windows_sys::core::BOOL,
//     pub cSecondarySigs: u32,
//     pub dwCurrentIndex: u32,
//     pub fSupportMultiSig: windows_sys::core::BOOL,
//     pub dwCryptoPolicySupport: u32,
//     pub iAttemptCount: u32,
//     pub fCheckedSealing: windows_sys::core::BOOL,
//     pub pSealingSignature: *mut SEALING_SIGNATURE_ATTRIBUTE,
// }

// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for CRYPT_PROVIDER_SIGSTATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVUI_DATA {
//     pub cbStruct: u32,
//     pub dwFinalError: u32,
//     pub pYesButtonText: windows_sys::core::PWSTR,
//     pub pNoButtonText: windows_sys::core::PWSTR,
//     pub pMoreInfoButtonText: windows_sys::core::PWSTR,
//     pub pAdvancedLinkText: windows_sys::core::PWSTR,
//     pub pCopyActionText: windows_sys::core::PWSTR,
//     pub pCopyActionTextNoTS: windows_sys::core::PWSTR,
//     pub pCopyActionTextNotSigned: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 333:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVUI_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 338:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVUI_FUNCS {
//     pub cbStruct: u32,
//     pub psUIData: *mut CRYPT_PROVUI_DATA,
//     pub pfnOnMoreInfoClick: PFN_PROVUI_CALL,
//     pub pfnOnMoreInfoClickDefault: PFN_PROVUI_CALL,
//     pub pfnOnAdvancedClick: PFN_PROVUI_CALL,
//     pub pfnOnAdvancedClickDefault: PFN_PROVUI_CALL,
// }

// UNSUPPORTED Rust 349:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for CRYPT_PROVUI_FUNCS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_REGISTER_ACTIONID {
//     pub cbStruct: u32,
//     pub sInitProvider: CRYPT_TRUST_REG_ENTRY,
//     pub sObjectProvider: CRYPT_TRUST_REG_ENTRY,
//     pub sSignatureProvider: CRYPT_TRUST_REG_ENTRY,
//     pub sCertificateProvider: CRYPT_TRUST_REG_ENTRY,
//     pub sCertificatePolicyProvider: CRYPT_TRUST_REG_ENTRY,
//     pub sFinalPolicyProvider: CRYPT_TRUST_REG_ENTRY,
//     pub sTestPolicyProvider: CRYPT_TRUST_REG_ENTRY,
//     pub sCleanupProvider: CRYPT_TRUST_REG_ENTRY,
// }

// UNSUPPORTED Rust 368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_TRUST_REG_ENTRY {
//     pub cbStruct: u32,
//     pub pwszDLLName: windows_sys::core::PWSTR,
//     pub pwszFunctionName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule
// impl Default for CRYPT_TRUST_REG_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 380:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DRIVER_ACTION_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf750e6c3_38ee_11d1_85e5_00c04fc295ee);

// UNSUPPORTED Rust 381:1: non-scalar type Ptr unsupported
// pub const DRIVER_CLEANUPPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverCleanupPolicy");

// UNSUPPORTED Rust 382:1: non-scalar type Ptr unsupported
// pub const DRIVER_FINALPOLPROV_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverFinalPolicy");

// UNSUPPORTED Rust 383:1: non-scalar type Ptr unsupported
// pub const DRIVER_INITPROV_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverInitializePolicy");

// UNSUPPORTED Rust 384:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 401:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for DRIVER_VER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DRIVER_VER_MAJORMINOR {
//     pub dwMajor: u32,
//     pub dwMinor: u32,
// }

public const val `DWACTION_ALLOCANDFILL`: `WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION` = 1u;
public const val `DWACTION_FREE`: `WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION` = 2u;
// UNSUPPORTED Rust 415:1: non-scalar type Ptr unsupported
// pub const GENERIC_CHAIN_CERTTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("GenericChainCertificateTrust");

// UNSUPPORTED Rust 416:1: non-scalar type Ptr unsupported
// pub const GENERIC_CHAIN_FINALPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("GenericChainFinalProv");

// UNSUPPORTED Rust 417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HTTPSPROV_ACTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x573e31f8_aaba_11d0_8ccb_00c04fc295ee);

// UNSUPPORTED Rust 418:1: non-scalar type Ptr unsupported
// pub const HTTPS_CERTTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTPSCertificateTrust");

// UNSUPPORTED Rust 419:1: non-scalar type Ptr unsupported
// pub const HTTPS_CHKCERT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTPSCheckCertProv");

// UNSUPPORTED Rust 420:1: non-scalar type Ptr unsupported
// pub const HTTPS_FINALPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTPSFinalProv");

// UNSUPPORTED Rust 421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTENT_TO_SEAL_ATTRIBUTE {
//     pub version: u32,
//     pub seal: bool,
// }

// UNSUPPORTED Rust 427:1: non-scalar type Ptr unsupported
// pub const INTENT_TO_SEAL_ATTRIBUTE_STRUCT: windows_sys::core::PCSTR = 2010i32 as _;

// UNSUPPORTED Rust 428:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const OFFICESIGN_ACTION_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5555c2cd_17fb_11d1_85c4_00c04fc295ee);

// UNSUPPORTED Rust 429:1: non-scalar type Ptr unsupported
// pub const OFFICE_CLEANUPPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("OfficeCleanupPolicy");

// UNSUPPORTED Rust 430:1: non-scalar type Ptr unsupported
// pub const OFFICE_INITPROV_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("OfficeInitializePolicy");

// UNSUPPORTED Rust 431:1: non-scalar type Ptr unsupported
// pub const OFFICE_POLICY_PROVIDER_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WINTRUST.DLL");

// UNSUPPORTED Rust 432:1: generic scalar type unsupported
// pub type PFN_ALLOCANDFILLDEFUSAGE = Option<unsafe extern "system" fn(pszusageoid: windows_sys::core::PCSTR, psdefusage: *const CRYPT_PROVIDER_DEFUSAGE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 433:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_CPD_ADD_CERT = Option<unsafe extern "system" fn(pprovdata: *const CRYPT_PROVIDER_DATA, idxsigner: u32, fcountersigner: windows_sys::core::BOOL, idxcountersigner: u32, pcert2add: *const super::Cryptography::CERT_CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 435:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_CPD_ADD_PRIVDATA = Option<unsafe extern "system" fn(pprovdata: *const CRYPT_PROVIDER_DATA, pprivdata2add: *const CRYPT_PROVIDER_PRIVDATA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 437:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_CPD_ADD_SGNR = Option<unsafe extern "system" fn(pprovdata: *const CRYPT_PROVIDER_DATA, fcountersigner: windows_sys::core::BOOL, idxsigner: u32, psgnr2add: *const CRYPT_PROVIDER_SGNR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 439:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_CPD_ADD_STORE = Option<unsafe extern "system" fn(pprovdata: *const CRYPT_PROVIDER_DATA, hstore2add: super::Cryptography::HCERTSTORE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 441:1: generic scalar type unsupported
// pub type PFN_CPD_MEM_ALLOC = Option<unsafe extern "system" fn(cbsize: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 442:1: generic scalar type unsupported
// pub type PFN_CPD_MEM_FREE = Option<unsafe extern "system" fn(pvmem2free: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 443:1: generic scalar type unsupported
// pub type PFN_FREEDEFUSAGE = Option<unsafe extern "system" fn(pszusageoid: windows_sys::core::PCSTR, psdefusage: *const CRYPT_PROVIDER_DEFUSAGE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 444:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_CERTCHKPOLICY_CALL = Option<unsafe extern "system" fn(pprovdata: *const CRYPT_PROVIDER_DATA, idxsigner: u32, fcountersignerchain: windows_sys::core::BOOL, idxcountersigner: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 446:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_CERTTRUST_CALL = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 448:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_CLEANUP_CALL = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 450:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_FINALPOLICY_CALL = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 452:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_INIT_CALL = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 454:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_OBJTRUST_CALL = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 456:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_SIGTRUST_CALL = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 458:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVIDER_TESTFINALPOLICY_CALL = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 460:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_PROVUI_CALL = Option<unsafe extern "system" fn(hwndsecuritydialog: super::super::Foundation::HWND, pprovdata: *const CRYPT_PROVIDER_DATA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 462:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// pub type PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACK = Option<unsafe extern "system" fn(pprovdata: *mut CRYPT_PROVIDER_DATA, dwsteperror: u32, dwregpolicysettings: u32, csigner: u32, rgpsigner: *mut *mut WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO, pvpolicyarg: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub struct PROVDATA_SIP {
//     pub cbStruct: u32,
//     pub gSubject: windows_sys::core::GUID,
//     pub pSip: *mut super::Cryptography::Sip::SIP_DISPATCH_INFO,
//     pub pCATSip: *mut super::Cryptography::Sip::SIP_DISPATCH_INFO,
//     pub psSipSubjectInfo: *mut super::Cryptography::Sip::SIP_SUBJECTINFO,
//     pub psSipCATSubjectInfo: *mut super::Cryptography::Sip::SIP_SUBJECTINFO,
//     pub psIndirectData: *mut super::Cryptography::Sip::SIP_INDIRECT_DATA,
// }

// UNSUPPORTED Rust 476:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for PROVDATA_SIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 482:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct SEALING_SIGNATURE_ATTRIBUTE {
//     pub version: u32,
//     pub signerIndex: u32,
//     pub signatureAlgorithm: super::Cryptography::CRYPT_ALGORITHM_IDENTIFIER,
//     pub encryptedDigest: super::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 491:1: non-scalar type Ptr unsupported
// pub const SEALING_SIGNATURE_ATTRIBUTE_STRUCT: windows_sys::core::PCSTR = 2011i32 as _;

// UNSUPPORTED Rust 492:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct SEALING_TIMESTAMP_ATTRIBUTE {
//     pub version: u32,
//     pub signerIndex: u32,
//     pub sealTimeStampToken: super::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 500:1: non-scalar type Ptr unsupported
// pub const SEALING_TIMESTAMP_ATTRIBUTE_STRUCT: windows_sys::core::PCSTR = 2012i32 as _;

public const val `SGNR_TYPE_TIMESTAMP`: UInt = 16u;
// UNSUPPORTED Rust 502:1: non-scalar type Ptr unsupported
// pub const SPC_CAB_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.25");

// UNSUPPORTED Rust 503:1: non-scalar type Ptr unsupported
// pub const SPC_CAB_DATA_STRUCT: windows_sys::core::PCSTR = 2008i32 as _;

// UNSUPPORTED Rust 504:1: non-scalar type Ptr unsupported
// pub const SPC_CERT_EXTENSIONS_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.14");

// UNSUPPORTED Rust 505:1: non-scalar type Ptr unsupported
// pub const SPC_COMMERCIAL_SP_KEY_PURPOSE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.22");

// UNSUPPORTED Rust 506:1: non-scalar type Ptr unsupported
// pub const SPC_COMMON_NAME_OBJID: windows_sys::core::PCWSTR = windows_sys::core::w!("2.5.4.3");

// UNSUPPORTED Rust 507:1: non-scalar type Ptr unsupported
// pub const SPC_ENCRYPTED_DIGEST_RETRY_COUNT_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.6.2");

public const val `SPC_FILE_LINK_CHOICE`: UInt = 3u;
// UNSUPPORTED Rust 509:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SPC_FINANCIAL_CRITERIA {
//     pub fFinancialInfoAvailable: windows_sys::core::BOOL,
//     pub fMeetsCriteria: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 515:1: non-scalar type Ptr unsupported
// pub const SPC_FINANCIAL_CRITERIA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.27");

// UNSUPPORTED Rust 516:1: non-scalar type Ptr unsupported
// pub const SPC_FINANCIAL_CRITERIA_STRUCT: windows_sys::core::PCSTR = 2002i32 as _;

// UNSUPPORTED Rust 517:1: non-scalar type Ptr unsupported
// pub const SPC_GLUE_RDN_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.25");

// UNSUPPORTED Rust 518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SPC_IMAGE {
//     pub pImageLink: *mut SPC_LINK,
//     pub Bitmap: super::Cryptography::CRYPT_INTEGER_BLOB,
//     pub Metafile: super::Cryptography::CRYPT_INTEGER_BLOB,
//     pub EnhancedMetafile: super::Cryptography::CRYPT_INTEGER_BLOB,
//     pub GifFile: super::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_IMAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct SPC_INDIRECT_DATA_CONTENT {
//     pub Data: super::Cryptography::CRYPT_ATTRIBUTE_TYPE_VALUE,
//     pub DigestAlgorithm: super::Cryptography::CRYPT_ALGORITHM_IDENTIFIER,
//     pub Digest: super::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 542:1: non-scalar type Ptr unsupported
// pub const SPC_INDIRECT_DATA_CONTENT_STRUCT: windows_sys::core::PCSTR = 2003i32 as _;

// UNSUPPORTED Rust 543:1: non-scalar type Ptr unsupported
// pub const SPC_INDIRECT_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.4");

// UNSUPPORTED Rust 544:1: non-scalar type Ptr unsupported
// pub const SPC_INDIVIDUAL_SP_KEY_PURPOSE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.21");

// UNSUPPORTED Rust 545:1: non-scalar type Ptr unsupported
// pub const SPC_JAVA_CLASS_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.20");

// UNSUPPORTED Rust 546:1: non-scalar type Ptr unsupported
// pub const SPC_JAVA_CLASS_DATA_STRUCT: windows_sys::core::PCSTR = 2009i32 as _;

// UNSUPPORTED Rust 547:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SPC_LINK {
//     pub dwLinkChoice: u32,
//     pub Anonymous: SPC_LINK_0,
// }

// UNSUPPORTED Rust 554:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_LINK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 560:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub union SPC_LINK_0 {
//     pub pwszUrl: windows_sys::core::PWSTR,
//     pub Moniker: SPC_SERIALIZED_OBJECT,
//     pub pwszFile: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 568:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_LINK_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 574:1: non-scalar type Ptr unsupported
// pub const SPC_LINK_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.28");

// UNSUPPORTED Rust 575:1: non-scalar type Ptr unsupported
// pub const SPC_LINK_STRUCT: windows_sys::core::PCSTR = 2005i32 as _;

// UNSUPPORTED Rust 576:1: non-scalar type Ptr unsupported
// pub const SPC_MINIMAL_CRITERIA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.26");

// UNSUPPORTED Rust 577:1: non-scalar type Ptr unsupported
// pub const SPC_MINIMAL_CRITERIA_STRUCT: windows_sys::core::PCSTR = 2001i32 as _;

public const val `SPC_MONIKER_LINK_CHOICE`: UInt = 2u;
// UNSUPPORTED Rust 579:1: non-scalar type Ptr unsupported
// pub const SPC_NATURAL_AUTH_PLUGIN_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.96.1.1");

// UNSUPPORTED Rust 580:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SPC_PE_IMAGE_DATA {
//     pub Flags: super::Cryptography::CRYPT_BIT_BLOB,
//     pub pFile: *mut SPC_LINK,
// }

// UNSUPPORTED Rust 587:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_PE_IMAGE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 593:1: non-scalar type Ptr unsupported
// pub const SPC_PE_IMAGE_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.15");

// UNSUPPORTED Rust 594:1: non-scalar type Ptr unsupported
// pub const SPC_PE_IMAGE_DATA_STRUCT: windows_sys::core::PCSTR = 2004i32 as _;

// UNSUPPORTED Rust 595:1: non-scalar type Ptr unsupported
// pub const SPC_PE_IMAGE_PAGE_HASHES_V1_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.3.1");

// UNSUPPORTED Rust 596:1: non-scalar type Ptr unsupported
// pub const SPC_PE_IMAGE_PAGE_HASHES_V2_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.3.2");

// UNSUPPORTED Rust 597:1: non-scalar type Ptr unsupported
// pub const SPC_RAW_FILE_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.18");

// UNSUPPORTED Rust 598:1: non-scalar type Ptr unsupported
// pub const SPC_RELAXED_PE_MARKER_CHECK_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.6.1");

// UNSUPPORTED Rust 599:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SPC_SERIALIZED_OBJECT {
//     pub ClassId: [u8; 16],
//     pub SerializedData: super::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 606:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_SERIALIZED_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SPC_SIGINFO {
//     pub dwSipVersion: u32,
//     pub gSIPGuid: windows_sys::core::GUID,
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
//     pub dwReserved3: u32,
//     pub dwReserved4: u32,
//     pub dwReserved5: u32,
// }

// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported
// pub const SPC_SIGINFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.30");

// UNSUPPORTED Rust 624:1: non-scalar type Ptr unsupported
// pub const SPC_SIGINFO_STRUCT: windows_sys::core::PCSTR = 2130i32 as _;

// UNSUPPORTED Rust 625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SPC_SP_AGENCY_INFO {
//     pub pPolicyInformation: *mut SPC_LINK,
//     pub pwszPolicyDisplayText: windows_sys::core::PWSTR,
//     pub pLogoImage: *mut SPC_IMAGE,
//     pub pLogoLink: *mut SPC_LINK,
// }

// UNSUPPORTED Rust 634:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_SP_AGENCY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 640:1: non-scalar type Ptr unsupported
// pub const SPC_SP_AGENCY_INFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.10");

// UNSUPPORTED Rust 641:1: non-scalar type Ptr unsupported
// pub const SPC_SP_AGENCY_INFO_STRUCT: windows_sys::core::PCSTR = 2000i32 as _;

// UNSUPPORTED Rust 642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SPC_SP_OPUS_INFO {
//     pub pwszProgramName: windows_sys::core::PCWSTR,
//     pub pMoreInfo: *mut SPC_LINK,
//     pub pPublisherInfo: *mut SPC_LINK,
// }

// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SPC_SP_OPUS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 656:1: non-scalar type Ptr unsupported
// pub const SPC_SP_OPUS_INFO_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.12");

// UNSUPPORTED Rust 657:1: non-scalar type Ptr unsupported
// pub const SPC_SP_OPUS_INFO_STRUCT: windows_sys::core::PCSTR = 2007i32 as _;

// UNSUPPORTED Rust 658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPC_STATEMENT_TYPE {
//     pub cKeyPurposeId: u32,
//     pub rgpszKeyPurposeId: *mut windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 664:1: declaration Impl has no candidate rule
// impl Default for SPC_STATEMENT_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 669:1: non-scalar type Ptr unsupported
// pub const SPC_STATEMENT_TYPE_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.11");

// UNSUPPORTED Rust 670:1: non-scalar type Ptr unsupported
// pub const SPC_STATEMENT_TYPE_STRUCT: windows_sys::core::PCSTR = 2006i32 as _;

// UNSUPPORTED Rust 671:1: non-scalar type Ptr unsupported
// pub const SPC_STRUCTURED_STORAGE_DATA_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.19");

// UNSUPPORTED Rust 672:1: non-scalar type Ptr unsupported
// pub const SPC_TIME_STAMP_REQUEST_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.3.2.1");

public const val `SPC_URL_LINK_CHOICE`: UInt = 1u;
public const val `SPC_UUID_LENGTH`: UInt = 16u;
// UNSUPPORTED Rust 675:1: non-scalar type Ptr unsupported
// pub const SPC_WINDOWS_HELLO_COMPATIBILITY_OBJID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.41.1");

// UNSUPPORTED Rust 676:1: non-scalar type Ptr unsupported
// pub const SP_CHKCERT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubCheckCert");

// UNSUPPORTED Rust 677:1: non-scalar type Ptr unsupported
// pub const SP_CLEANUPPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubCleanup");

// UNSUPPORTED Rust 678:1: non-scalar type Ptr unsupported
// pub const SP_FINALPOLICY_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubAuthenticode");

// UNSUPPORTED Rust 679:1: non-scalar type Ptr unsupported
// pub const SP_GENERIC_CERT_INIT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubDefCertInit");

// UNSUPPORTED Rust 680:1: non-scalar type Ptr unsupported
// pub const SP_INIT_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubInitialize");

// UNSUPPORTED Rust 681:1: non-scalar type Ptr unsupported
// pub const SP_OBJTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubLoadMessage");

// UNSUPPORTED Rust 682:1: non-scalar type Ptr unsupported
// pub const SP_POLICY_PROVIDER_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WINTRUST.DLL");

// UNSUPPORTED Rust 683:1: non-scalar type Ptr unsupported
// pub const SP_SIGTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftpubLoadSignature");

// UNSUPPORTED Rust 684:1: non-scalar type Ptr unsupported
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
// UNSUPPORTED Rust 712:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WINTRUST_ACTION_GENERIC_CERT_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x189a3842_3041_11d1_85e1_00c04fc295ee);

// UNSUPPORTED Rust 713:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WINTRUST_ACTION_GENERIC_CHAIN_VERIFY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc451c16_ac75_11d1_b4b8_00c04fb66ea0);

// UNSUPPORTED Rust 714:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WINTRUST_ACTION_GENERIC_VERIFY_V2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00aac56b_cd44_11d0_8cc2_00c04fc295ee);

// UNSUPPORTED Rust 715:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WINTRUST_ACTION_TRUSTPROVIDER_TEST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x573e31f8_ddba_11d0_8ccb_00c04fc295ee);

// UNSUPPORTED Rust 716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINTRUST_BLOB_INFO {
//     pub cbStruct: u32,
//     pub gSubject: windows_sys::core::GUID,
//     pub pcwszDisplayName: windows_sys::core::PCWSTR,
//     pub cbMemObject: u32,
//     pub pbMemObject: *mut u8,
//     pub cbMemSignedMsg: u32,
//     pub pbMemSignedMsg: *mut u8,
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule
// impl Default for WINTRUST_BLOB_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WINTRUST_CATALOG_INFO {
//     pub cbStruct: u32,
//     pub dwCatalogVersion: u32,
//     pub pcwszCatalogFilePath: windows_sys::core::PCWSTR,
//     pub pcwszMemberTag: windows_sys::core::PCWSTR,
//     pub pcwszMemberFilePath: windows_sys::core::PCWSTR,
//     pub hMemberFile: super::super::Foundation::HANDLE,
//     pub pbCalculatedFileHash: *mut u8,
//     pub cbCalculatedFileHash: u32,
//     pub pcCatalogContext: *mut super::Cryptography::CTL_CONTEXT,
//     pub hCatAdmin: isize,
// }

// UNSUPPORTED Rust 747:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_CATALOG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 753:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WINTRUST_CERT_INFO {
//     pub cbStruct: u32,
//     pub pcwszDisplayName: windows_sys::core::PCWSTR,
//     pub psCertContext: *mut super::Cryptography::CERT_CONTEXT,
//     pub chStores: u32,
//     pub pahStores: *mut super::Cryptography::HCERTSTORE,
//     pub dwFlags: u32,
//     pub psftVerifyAsOf: *mut super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 765:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_CERT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 771:1: non-scalar type Ptr unsupported
// pub const WINTRUST_CONFIG_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Cryptography\\Wintrust\\Config");

// UNSUPPORTED Rust 772:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WINTRUST_DATA {
//     pub cbStruct: u32,
//     pub pPolicyCallbackData: *mut core::ffi::c_void,
//     pub pSIPClientData: *mut core::ffi::c_void,
//     pub dwUIChoice: WINTRUST_DATA_UICHOICE,
//     pub fdwRevocationChecks: WINTRUST_DATA_REVOCATION_CHECKS,
//     pub dwUnionChoice: WINTRUST_DATA_UNION_CHOICE,
//     pub Anonymous: WINTRUST_DATA_0,
//     pub dwStateAction: WINTRUST_DATA_STATE_ACTION,
//     pub hWVTStateData: super::super::Foundation::HANDLE,
//     pub pwszURLReference: windows_sys::core::PWSTR,
//     pub dwProvFlags: WINTRUST_DATA_PROVIDER_FLAGS,
//     pub dwUIContext: WINTRUST_DATA_UICONTEXT,
//     pub pSignatureSettings: *mut WINTRUST_SIGNATURE_SETTINGS,
// }

// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 796:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 806:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINTRUST_FILE_INFO {
//     pub cbStruct: u32,
//     pub pcwszFilePath: windows_sys::core::PCWSTR,
//     pub hFile: super::super::Foundation::HANDLE,
//     pub pgKnownSubject: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 826:1: declaration Impl has no candidate rule
// impl Default for WINTRUST_FILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINTRUST_GET_DEFAULT_FOR_USAGE_ACTION` = UInt;
public const val `WINTRUST_MAX_HASH_BYTES_TO_MAP_DEFAULT`: UInt = 1048576u;
// UNSUPPORTED Rust 833:1: non-scalar type Ptr unsupported
// pub const WINTRUST_MAX_HASH_BYTES_TO_MAP_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxHashBytesToMap");

public const val `WINTRUST_MAX_HEADER_BYTES_TO_MAP_DEFAULT`: UInt = 10485760u;
// UNSUPPORTED Rust 835:1: non-scalar type Ptr unsupported
// pub const WINTRUST_MAX_HEADER_BYTES_TO_MAP_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxHeaderBytesToMap");

public typealias `WINTRUST_POLICY_FLAGS` = UInt;
// UNSUPPORTED Rust 837:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WINTRUST_SGNR_INFO {
//     pub cbStruct: u32,
//     pub pcwszDisplayName: windows_sys::core::PCWSTR,
//     pub psSignerInfo: *mut super::Cryptography::CMSG_SIGNER_INFO,
//     pub chStores: u32,
//     pub pahStores: *mut super::Cryptography::HCERTSTORE,
// }

// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_SGNR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WINTRUST_SIGNATURE_SETTINGS {
//     pub cbStruct: u32,
//     pub dwIndex: u32,
//     pub dwFlags: WINTRUST_SIGNATURE_SETTINGS_FLAGS,
//     pub cSecondarySigs: u32,
//     pub dwVerifiedSigIndex: u32,
//     pub pCryptoPolicy: *mut super::Cryptography::CERT_STRONG_SIGN_PARA,
// }

// UNSUPPORTED Rust 864:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WINTRUST_SIGNATURE_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WINTRUST_SIGNATURE_SETTINGS_FLAGS` = UInt;
// UNSUPPORTED Rust 871:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN_CERTIFICATE {
//     pub dwLength: u32,
//     pub wRevision: u16,
//     pub wCertificateType: u16,
//     pub bCertificate: [u8; 1],
// }

// UNSUPPORTED Rust 879:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 890:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_SPUB_ACTION_NT_ACTIVATE_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8bc96b00_8da1_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 891:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_SPUB_ACTION_PUBLISHED_SOFTWARE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64b9d180_8da2_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 892:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_SPUB_ACTION_TRUSTED_PUBLISHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66426730_8da1_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 893:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN_SPUB_TRUSTED_PUBLISHER_DATA {
//     pub hClientToken: super::super::Foundation::HANDLE,
//     pub lpCertificate: *mut WIN_CERTIFICATE,
// }

// UNSUPPORTED Rust 899:1: declaration Impl has no candidate rule
// impl Default for WIN_SPUB_TRUSTED_PUBLISHER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 904:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN_TRUST_ACTDATA_CONTEXT_WITH_SUBJECT {
//     pub hClientToken: super::super::Foundation::HANDLE,
//     pub SubjectType: *mut windows_sys::core::GUID,
//     pub Subject: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 911:1: declaration Impl has no candidate rule
// impl Default for WIN_TRUST_ACTDATA_CONTEXT_WITH_SUBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 916:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN_TRUST_ACTDATA_SUBJECT_ONLY {
//     pub SubjectType: *mut windows_sys::core::GUID,
//     pub Subject: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 922:1: declaration Impl has no candidate rule
// impl Default for WIN_TRUST_ACTDATA_SUBJECT_ONLY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN_TRUST_SUBJECT_FILE {
//     pub hFile: super::super::Foundation::HANDLE,
//     pub lpPath: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 933:1: declaration Impl has no candidate rule
// impl Default for WIN_TRUST_SUBJECT_FILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN_TRUST_SUBJECT_FILE_AND_DISPLAY {
//     pub hFile: super::super::Foundation::HANDLE,
//     pub lpPath: windows_sys::core::PCWSTR,
//     pub lpDisplayName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 945:1: declaration Impl has no candidate rule
// impl Default for WIN_TRUST_SUBJECT_FILE_AND_DISPLAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 950:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_CABINET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd17c5374_a392_11cf_9df5_00aa00c184e0);

// UNSUPPORTED Rust 951:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_CABINETEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f458114_c2f1_11cf_8a69_00aa006c3706);

// UNSUPPORTED Rust 952:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_JAVA_CLASS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08ad3990_8da1_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 953:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_JAVA_CLASSEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f458113_c2f1_11cf_8a69_00aa006c3706);

// UNSUPPORTED Rust 954:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_OLE_STORAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc257e740_8da0_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 955:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_PE_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43c9a1e0_8da0_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 956:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_PE_IMAGEEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6f458111_c2f1_11cf_8a69_00aa006c3706);

// UNSUPPORTED Rust 957:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WIN_TRUST_SUBJTYPE_RAW_FILE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x959dc450_8d9e_11cf_8736_00aa00a485eb);

// UNSUPPORTED Rust 958:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 981:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WTD_GENERIC_CHAIN_POLICY_CREATE_INFO {
//     pub Anonymous: WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0,
//     pub hChainEngine: super::Cryptography::HCERTCHAINENGINE,
//     pub pChainPara: *mut super::Cryptography::CERT_CHAIN_PARA,
//     pub dwFlags: u32,
//     pub pvReserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 991:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WTD_GENERIC_CHAIN_POLICY_CREATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 997:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub union WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0 {
//     pub cbStruct: u32,
//     pub cbSize: u32,
// }

// UNSUPPORTED Rust 1004:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WTD_GENERIC_CHAIN_POLICY_CREATE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1010:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub struct WTD_GENERIC_CHAIN_POLICY_DATA {
//     pub Anonymous: WTD_GENERIC_CHAIN_POLICY_DATA_0,
//     pub pSignerChainInfo: *mut WTD_GENERIC_CHAIN_POLICY_CREATE_INFO,
//     pub pCounterSignerChainInfo: *mut WTD_GENERIC_CHAIN_POLICY_CREATE_INFO,
//     pub pfnPolicyCallback: PFN_WTD_GENERIC_CHAIN_POLICY_CALLBACK,
//     pub pvPolicyArg: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1020:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for WTD_GENERIC_CHAIN_POLICY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1026:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// #[derive(Clone, Copy)]
// pub union WTD_GENERIC_CHAIN_POLICY_DATA_0 {
//     pub cbStruct: u32,
//     pub cbSize: u32,
// }

// UNSUPPORTED Rust 1033:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Cryptography_Catalog", feature = "Win32_Security_Cryptography_Sip"))]
// impl Default for WTD_GENERIC_CHAIN_POLICY_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1039:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO {
//     pub Anonymous: WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0,
//     pub pChainContext: *mut super::Cryptography::CERT_CHAIN_CONTEXT,
//     pub dwSignerType: u32,
//     pub pMsgSignerInfo: *mut super::Cryptography::CMSG_SIGNER_INFO,
//     pub dwError: u32,
//     pub cCounterSigner: u32,
//     pub rgpCounterSigner: *mut *mut WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO,
// }

// UNSUPPORTED Rust 1051:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1057:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub union WTD_GENERIC_CHAIN_POLICY_SIGNER_INFO_0 {
//     pub cbStruct: u32,
//     pub cbSize: u32,
// }

// UNSUPPORTED Rust 1064:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 1109:1: non-scalar type Ptr unsupported
// pub const WT_PROVIDER_CERTTRUST_FUNCTION: windows_sys::core::PCWSTR = windows_sys::core::w!("WintrustCertificateTrust");

// UNSUPPORTED Rust 1110:1: non-scalar type Ptr unsupported
// pub const WT_PROVIDER_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WINTRUST.DLL");

public const val `WT_TRUSTDBDIALOG_NO_UI_FLAG`: UInt = 1u;
public const val `WT_TRUSTDBDIALOG_ONLY_PUB_TAB_FLAG`: UInt = 2u;
public const val `WT_TRUSTDBDIALOG_WRITE_IEAK_STORE_FLAG`: UInt = 512u;
public const val `WT_TRUSTDBDIALOG_WRITE_LEGACY_REG_FLAG`: UInt = 256u;
// UNSUPPORTED Rust 1115:1: non-scalar type Ptr unsupported
// pub const szOID_ENHANCED_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.5.1");

// UNSUPPORTED Rust 1116:1: non-scalar type Ptr unsupported
// pub const szOID_INTENT_TO_SEAL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.2");

// UNSUPPORTED Rust 1117:1: non-scalar type Ptr unsupported
// pub const szOID_NESTED_SIGNATURE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.1");

// UNSUPPORTED Rust 1118:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_9_SEQUENCE_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.25.4");

// UNSUPPORTED Rust 1119:1: non-scalar type Ptr unsupported
// pub const szOID_SEALING_SIGNATURE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.3");

// UNSUPPORTED Rust 1120:1: non-scalar type Ptr unsupported
// pub const szOID_SEALING_TIMESTAMP: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.4.4");

// UNSUPPORTED Rust 1121:1: non-scalar type Ptr unsupported
// pub const szOID_TRUSTED_CLIENT_AUTH_CA_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.2.2");

// UNSUPPORTED Rust 1122:1: non-scalar type Ptr unsupported
// pub const szOID_TRUSTED_CODESIGNING_CA_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.2.1");

// UNSUPPORTED Rust 1123:1: non-scalar type Ptr unsupported
// pub const szOID_TRUSTED_SERVER_AUTH_CA_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.2.3");

