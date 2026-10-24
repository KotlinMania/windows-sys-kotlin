// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupClose(hbc : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupEnd(hbc : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupFree(pv : *mut core::ffi::c_void));

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupGetBackupLogsW(hbc : *const core::ffi::c_void, ppwszzbackuplogfiles : *mut windows_sys::core::PWSTR, pcbsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupGetDatabaseNamesW(hbc : *const core::ffi::c_void, ppwszzattachmentinformation : *mut windows_sys::core::PWSTR, pcbsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupGetDynamicFileListW(hbc : *const core::ffi::c_void, ppwszzfilelist : *mut windows_sys::core::PWSTR, pcbsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupOpenFileW(hbc : *mut core::ffi::c_void, pwszattachmentname : windows_sys::core::PCWSTR, cbreadhintsize : u32, plifilesize : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupPrepareW(pwszservername : windows_sys::core::PCWSTR, grbitjet : u32, dwbackupflags : CSBACKUP_TYPE, phbc : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupRead(hbc : *mut core::ffi::c_void, pvbuffer : *mut core::ffi::c_void, cbbuffer : u32, pcbread : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvBackupTruncateLogs(hbc : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvIsServerOnlineW(pwszservername : windows_sys::core::PCWSTR, pfserveronline : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvRestoreEnd(hbc : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvRestoreGetDatabaseLocationsW(hbc : *const core::ffi::c_void, ppwszzdatabaselocationlist : *mut windows_sys::core::PWSTR, pcbsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvRestorePrepareW(pwszservername : windows_sys::core::PCWSTR, dwrestoreflags : u32, phbc : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvRestoreRegisterComplete(hbc : *mut core::ffi::c_void, hrrestorestate : windows_sys::core::HRESULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvRestoreRegisterThroughFile(hbc : *mut core::ffi::c_void, pwszcheckpointfilepath : windows_sys::core::PCWSTR, pwszlogpath : windows_sys::core::PCWSTR, rgrstmap : *mut CSEDB_RSTMAPW, crstmap : i32, pwszbackuplogpath : windows_sys::core::PCWSTR, genlow : u32, genhigh : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvRestoreRegisterW(hbc : *mut core::ffi::c_void, pwszcheckpointfilepath : windows_sys::core::PCWSTR, pwszlogpath : windows_sys::core::PCWSTR, rgrstmap : *mut CSEDB_RSTMAPW, crstmap : i32, pwszbackuplogpath : windows_sys::core::PCWSTR, genlow : u32, genhigh : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("certadm.dll" "system" fn CertSrvServerControlW(pwszservername : windows_sys::core::PCWSTR, dwcontrolflags : u32, pcbout : *mut u32, ppbout : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("certpoleng.dll" "system" fn PstAcquirePrivateKey(pcert : *const super:: CERT_CONTEXT) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("certpoleng.dll" "system" fn PstGetCertificateChain(pcert : *const super:: CERT_CONTEXT, ptrustedissuers : *const super::super::Authentication::Identity:: SecPkgContext_IssuerListInfoEx, ppcertchaincontext : *mut *mut super:: CERT_CHAIN_CONTEXT) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("certpoleng.dll" "system" fn PstGetCertificates(ptargetname : *const super::super::super::Foundation:: UNICODE_STRING, ccriteria : u32, rgpcriteria : *const super:: CERT_SELECT_CRITERIA, bisclient : windows_sys::core::BOOL, pdwcertchaincontextcount : *mut u32, ppcertchaincontexts : *mut *mut *mut super:: CERT_CHAIN_CONTEXT) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("certpoleng.dll" "system" fn PstGetTrustAnchors(ptargetname : *const super::super::super::Foundation:: UNICODE_STRING, ccriteria : u32, rgpcriteria : *const super:: CERT_SELECT_CRITERIA, pptrustedissuers : *mut *mut super::super::Authentication::Identity:: SecPkgContext_IssuerListInfoEx) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("certpoleng.dll" "system" fn PstGetTrustAnchorsEx(ptargetname : *const super::super::super::Foundation:: UNICODE_STRING, ccriteria : u32, rgpcriteria : *const super:: CERT_SELECT_CRITERIA, pcertcontext : *const super:: CERT_CONTEXT, pptrustedissuers : *mut *mut super::super::Authentication::Identity:: SecPkgContext_IssuerListInfoEx) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("certpoleng.dll" "system" fn PstGetUserNameForCertificate(pcertcontext : *const super:: CERT_CONTEXT, username : *mut super::super::super::Foundation:: UNICODE_STRING) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("certpoleng.dll" "system" fn PstMapCertificate(pcert : *const super:: CERT_CONTEXT, ptokeninformationtype : *mut super::super::Authentication::Identity:: LSA_TOKEN_INFORMATION_TYPE, pptokeninformation : *mut *mut core::ffi::c_void) -> super::super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("certpoleng.dll" "system" fn PstValidate(ptargetname : *const super::super::super::Foundation:: UNICODE_STRING, bisclient : windows_sys::core::BOOL, prequestedissuancepolicy : *const super:: CERT_USAGE_MATCH, phadditionalcertstore : *const super:: HCERTSTORE, pcert : *const super:: CERT_CONTEXT, pprovguid : *mut windows_sys::core::GUID) -> super::super::super::Foundation:: NTSTATUS);

public typealias `ADDED_CERT_TYPE` = Int;
public typealias `AlgorithmFlags` = Int;
public const val `AlgorithmFlagsNone`: `AlgorithmFlags` = 0;
public const val `AlgorithmFlagsWrap`: `AlgorithmFlags` = 1;
public typealias `AlgorithmOperationFlags` = Int;
public typealias `AlgorithmType` = Int;
public const val `AllowNoOutstandingRequest`: `InstallResponseRestrictionFlags` = 1;
public const val `AllowNone`: `InstallResponseRestrictionFlags` = 0;
public const val `AllowUntrustedCertificate`: `InstallResponseRestrictionFlags` = 2;
public const val `AllowUntrustedRoot`: `InstallResponseRestrictionFlags` = 4;
public const val `AllowedKeySignature`: `Pkcs10AllowedSignatureTypes` = 1;
public const val `AllowedNullSignature`: `Pkcs10AllowedSignatureTypes` = 2;
public typealias `AlternativeNameType` = Int;
public const val `CAIF_DSENTRY`: UInt = 1u;
public const val `CAIF_LOCAL`: UInt = 8u;
public const val `CAIF_REGISTRY`: UInt = 4u;
public const val `CAIF_REGISTRYPARENT`: UInt = 16u;
public const val `CAIF_SHAREDFOLDERENTRY`: UInt = 2u;
// UNSUPPORTED Rust 49:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CAINFO {
//     pub cbSize: u32,
//     pub CAType: ENUM_CATYPES,
//     pub cCASignatureCerts: u32,
//     pub cCAExchangeCerts: u32,
//     pub cExitModules: u32,
//     pub lPropIdMax: i32,
//     pub lRoleSeparationEnabled: i32,
//     pub cKRACertUsedCount: u32,
//     pub cKRACertCount: u32,
//     pub fAdvancedServer: u32,
// }

public const val `CAPATHLENGTH_INFINITE`: UInt = 4294967295u;
public const val `CAPropCertificate`: `EnrollmentCAProperty` = 7;
public const val `CAPropCertificateTypes`: `EnrollmentCAProperty` = 6;
public const val `CAPropCommonName`: `EnrollmentCAProperty` = 1;
public const val `CAPropDNSName`: `EnrollmentCAProperty` = 5;
public const val `CAPropDescription`: `EnrollmentCAProperty` = 8;
public const val `CAPropDistinguishedName`: `EnrollmentCAProperty` = 2;
public const val `CAPropRenewalOnly`: `EnrollmentCAProperty` = 12;
public const val `CAPropSanitizedName`: `EnrollmentCAProperty` = 3;
public const val `CAPropSanitizedShortName`: `EnrollmentCAProperty` = 4;
public const val `CAPropSecurity`: `EnrollmentCAProperty` = 11;
public const val `CAPropSiteName`: `EnrollmentCAProperty` = 10;
public const val `CAPropWebServers`: `EnrollmentCAProperty` = 9;
public const val `CA_ACCESS_ADMIN`: `CERTADMIN_GET_ROLES_FLAGS` = 1u;
public const val `CA_ACCESS_AUDITOR`: `CERTADMIN_GET_ROLES_FLAGS` = 4u;
public const val `CA_ACCESS_ENROLL`: `CERTADMIN_GET_ROLES_FLAGS` = 512u;
public const val `CA_ACCESS_MASKROLES`: UInt = 255u;
public const val `CA_ACCESS_OFFICER`: `CERTADMIN_GET_ROLES_FLAGS` = 2u;
public const val `CA_ACCESS_OPERATOR`: `CERTADMIN_GET_ROLES_FLAGS` = 8u;
public const val `CA_ACCESS_READ`: `CERTADMIN_GET_ROLES_FLAGS` = 256u;
public const val `CA_CRL_BASE`: UInt = 1u;
public const val `CA_CRL_DELTA`: UInt = 2u;
public const val `CA_CRL_REPUBLISH`: UInt = 16u;
public const val `CA_DISP_ERROR`: UInt = 1u;
public const val `CA_DISP_INCOMPLETE`: UInt = 0u;
public const val `CA_DISP_INVALID`: UInt = 4u;
public const val `CA_DISP_REVOKED`: UInt = 2u;
public const val `CA_DISP_UNDER_SUBMISSION`: UInt = 5u;
public const val `CA_DISP_VALID`: UInt = 3u;
// UNSUPPORTED Rust 92:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CAlternativeName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2013_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CAlternativeNames: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2014_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 94:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CBinaryConverter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2002_217d_11da_b2a4_000e7bbb2b09);

public const val `CCLOCKSKEWMINUTESDEFAULT`: UInt = 10u;
public const val `CC_DEFAULTCONFIG`: `CERT_GET_CONFIG_FLAGS` = 0;
public const val `CC_FIRSTCONFIG`: `CERT_GET_CONFIG_FLAGS` = 2;
public const val `CC_LOCALACTIVECONFIG`: `CERT_GET_CONFIG_FLAGS` = 4;
public const val `CC_LOCALCONFIG`: `CERT_GET_CONFIG_FLAGS` = 3;
public const val `CC_UIPICKCONFIG`: `CERT_GET_CONFIG_FLAGS` = 1;
public const val `CC_UIPICKCONFIGSKIPLOCALCA`: `CERT_GET_CONFIG_FLAGS` = 5;
// UNSUPPORTED Rust 102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertAdmin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37eabaf0_7fb6_11d0_8817_00a0c903b83c);

// UNSUPPORTED Rust 103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x372fce38_4324_11d0_8810_00a0c903b83c);

// UNSUPPORTED Rust 104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertEncodeAltName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1cfc4cda_1271_11d1_9bd4_00c04fb683fa);

// UNSUPPORTED Rust 105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertEncodeBitString: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d6b3cd8_1278_11d1_9bd4_00c04fb683fa);

// UNSUPPORTED Rust 106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertEncodeCRLDistInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01fa60a0_bbff_11d0_8825_00a0c903b83c);

// UNSUPPORTED Rust 107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertEncodeDateArray: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x301f77b0_a470_11d0_8821_00a0c903b83c);

// UNSUPPORTED Rust 108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertEncodeLongArray: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4e0680a0_a0a2_11d0_8821_00a0c903b83c);

// UNSUPPORTED Rust 109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertEncodeStringArray: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x19a76fe0_7494_11d0_8816_00a0c903b83c);

// UNSUPPORTED Rust 110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertGetConfig: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6cc49b0_ce17_11d0_8833_00a0c903b83c);

// UNSUPPORTED Rust 111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertProperties: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertProperty: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyArchived: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2037_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyArchivedKeyHash: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyAutoEnroll: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2032_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyBackedUp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2038_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyDescription: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2031_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyEnrollment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2039_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 119:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyEnrollmentPolicyServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e204c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 120:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyFriendlyName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2030_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 121:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyKeyProvInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2036_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 122:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyRenewal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203a_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 123:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertyRequestOriginator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2033_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertPropertySHA1Hash: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2034_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertRequest: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98aff3f0_5524_11d0_8812_00a0c903b83c);

// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertServerExit: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4c4a5e40_732c_11d0_8816_00a0c903b83c);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertServerPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa000926_ffbe_11cf_8800_00a0c903b83c);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertView: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa12d0f7a_1e84_11d1_9bd6_00c04fb683fa);

// UNSUPPORTED Rust 129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertificateAttestationChallenge: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1362ada1_eb60_456a_b6e1_118050db741b);

// UNSUPPORTED Rust 130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertificatePolicies: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertificatePolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCryptAttribute: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 133:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCryptAttributes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202d_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 134:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCspInformation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2007_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCspInformations: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2008_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCspStatus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2009_217d_11da_b2a4_000e7bbb2b09);

public const val `CDR_EXPIRED`: `CERT_DELETE_ROW_FLAGS` = 1;
public const val `CDR_REQUEST_LAST_CHANGED`: `CERT_DELETE_ROW_FLAGS` = 2;
public typealias `CERTADMIN_GET_ROLES_FLAGS` = UInt;
public const val `CERTENROLL_INDEX_BASE`: UInt = 0u;
public typealias `CERTENROLL_OBJECTID` = Int;
public typealias `CERTENROLL_PROPERTYID` = Int;
// UNSUPPORTED Rust 143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERTTRANSBLOB {
//     pub cb: u32,
//     pub pb: *mut u8,
// }

// UNSUPPORTED Rust 149:1: declaration Impl has no candidate rule
// impl Default for CERTTRANSBLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERTVIEWRESTRICTION {
//     pub ColumnIndex: u32,
//     pub SeekOperator: i32,
//     pub SortOrder: i32,
//     pub pbValue: *mut u8,
//     pub cbValue: u32,
// }

// UNSUPPORTED Rust 163:1: declaration Impl has no candidate rule
// impl Default for CERTVIEWRESTRICTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_ALT_NAME` = Int;
public const val `CERT_ALT_NAME_DIRECTORY_NAME`: `CERT_ALT_NAME` = 5;
public const val `CERT_ALT_NAME_DNS_NAME`: `CERT_ALT_NAME` = 3;
public const val `CERT_ALT_NAME_IP_ADDRESS`: `CERT_ALT_NAME` = 8;
public const val `CERT_ALT_NAME_OTHER_NAME`: `CERT_ALT_NAME` = 1;
public const val `CERT_ALT_NAME_REGISTERED_ID`: `CERT_ALT_NAME` = 9;
public const val `CERT_ALT_NAME_RFC822_NAME`: `CERT_ALT_NAME` = 2;
public const val `CERT_ALT_NAME_URL`: `CERT_ALT_NAME` = 7;
public typealias `CERT_CREATE_REQUEST_FLAGS` = Int;
public typealias `CERT_DELETE_ROW_FLAGS` = Int;
public typealias `CERT_EXIT_EVENT_MASK` = UInt;
public typealias `CERT_GET_CONFIG_FLAGS` = Int;
public typealias `CERT_IMPORT_FLAGS` = Int;
public typealias `CERT_PROPERTY_TYPE` = Int;
public typealias `CERT_REQUEST_OUT_TYPE` = Int;
public typealias `CERT_VIEW_COLUMN_INDEX` = Int;
public typealias `CERT_VIEW_SEEK_OPERATOR_FLAGS` = Int;
// UNSUPPORTED Rust 185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CEnroll: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43f8f289_7a20_11d0_8f06_00c04fc295e1);

// UNSUPPORTED Rust 186:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CEnroll2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x127698e4_e730_4e5c_a2b1_21490a70c8a1);

public const val `CMM_READONLY`: UInt = 2u;
public const val `CMM_REFRESHONLY`: UInt = 1u;
// UNSUPPORTED Rust 189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CObjectId: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2000_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 190:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CObjectIds: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2001_217d_11da_b2a4_000e7bbb2b09);

public const val `CPF_BADURL_ERROR`: UInt = 32u;
public const val `CPF_BASE`: UInt = 1u;
public const val `CPF_CASTORE_ERROR`: UInt = 16u;
public const val `CPF_COMPLETE`: UInt = 4u;
public const val `CPF_DELTA`: UInt = 2u;
public const val `CPF_FILE_ERROR`: UInt = 512u;
public const val `CPF_FTP_ERROR`: UInt = 1024u;
public const val `CPF_HTTP_ERROR`: UInt = 2048u;
public const val `CPF_LDAP_ERROR`: UInt = 256u;
public const val `CPF_MANUAL`: UInt = 64u;
public const val `CPF_POSTPONED_BASE_FILE_ERROR`: UInt = 8192u;
public const val `CPF_POSTPONED_BASE_LDAP_ERROR`: UInt = 4096u;
public const val `CPF_SHADOW`: UInt = 8u;
public const val `CPF_SIGNATURE_ERROR`: UInt = 128u;
// UNSUPPORTED Rust 205:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CPolicyQualifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CPolicyQualifiers: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201d_217d_11da_b2a4_000e7bbb2b09);

public const val `CRLF_ALLOW_REQUEST_ATTRIBUTE_SUBJECT`: UInt = 65536u;
public const val `CRLF_BUILD_ROOTCA_CRLENTRIES_BASEDONKEY`: UInt = 2097152u;
public const val `CRLF_CRLNUMBER_CRITICAL`: UInt = 4u;
public const val `CRLF_DELETE_EXPIRED_CRLS`: UInt = 2u;
public const val `CRLF_DELTA_USE_OLDEST_UNEXPIRED_BASE`: UInt = 1u;
public const val `CRLF_DISABLE_CHAIN_VERIFICATION`: UInt = 1048576u;
public const val `CRLF_DISABLE_RDN_REORDER`: UInt = 2048u;
public const val `CRLF_DISABLE_ROOT_CROSS_CERTS`: UInt = 4096u;
public const val `CRLF_ENFORCE_ENROLLMENT_AGENT`: UInt = 1024u;
public const val `CRLF_IGNORE_CROSS_CERT_TRUST_ERROR`: UInt = 256u;
public const val `CRLF_IGNORE_INVALID_POLICIES`: UInt = 16u;
public const val `CRLF_IGNORE_UNKNOWN_CMC_ATTRIBUTES`: UInt = 128u;
public const val `CRLF_LOG_FULL_RESPONSE`: UInt = 8192u;
public const val `CRLF_PRESERVE_EXPIRED_CA_CERTS`: UInt = 262144u;
public const val `CRLF_PRESERVE_REVOKED_CA_CERTS`: UInt = 524288u;
public const val `CRLF_PUBLISH_EXPIRED_CERT_CRLS`: UInt = 512u;
public const val `CRLF_REBUILD_MODIFIED_SUBJECT_ONLY`: UInt = 32u;
public const val `CRLF_REVCHECK_IGNORE_NOREVCHECK`: UInt = 131072u;
public const val `CRLF_REVCHECK_IGNORE_OFFLINE`: UInt = 8u;
public const val `CRLF_SAVE_FAILED_CERTS`: UInt = 64u;
public const val `CRLF_USE_CROSS_CERT_TEMPLATE`: UInt = 32768u;
public const val `CRLF_USE_XCHG_CERT_TEMPLATE`: UInt = 16384u;
public typealias `CRLRevocationReason` = Int;
public const val `CRYPT_ENUM_ALL_PROVIDERS`: UInt = 1u;
public typealias `CR_DISP` = UInt;
public const val `CR_DISP_DENIED`: `CR_DISP` = 2u;
public const val `CR_DISP_ERROR`: `CR_DISP` = 1u;
public const val `CR_DISP_INCOMPLETE`: `CR_DISP` = 0u;
public const val `CR_DISP_ISSUED`: `CR_DISP` = 3u;
public const val `CR_DISP_ISSUED_OUT_OF_BAND`: `CR_DISP` = 4u;
public const val `CR_DISP_REVOKED`: UInt = 6u;
public const val `CR_DISP_UNDER_SUBMISSION`: `CR_DISP` = 5u;
public const val `CR_FLG_CACROSSCERT`: UInt = 128u;
public const val `CR_FLG_CAXCHGCERT`: UInt = 8u;
public const val `CR_FLG_CHALLENGEPENDING`: UInt = 1024u;
public const val `CR_FLG_CHALLENGESATISFIED`: UInt = 2048u;
public const val `CR_FLG_DEFINEDCACERT`: UInt = 512u;
public const val `CR_FLG_ENFORCEUTF8`: UInt = 256u;
public const val `CR_FLG_ENROLLONBEHALFOF`: UInt = 16u;
public const val `CR_FLG_FORCETELETEX`: UInt = 1u;
public const val `CR_FLG_FORCEUTF8`: UInt = 4u;
public const val `CR_FLG_PUBLISHERROR`: UInt = 2147483648u;
public const val `CR_FLG_RENEWAL`: UInt = 2u;
public const val `CR_FLG_SUBJECTUNMODIFIED`: UInt = 32u;
public const val `CR_FLG_TRUSTEKCERT`: UInt = 8192u;
public const val `CR_FLG_TRUSTEKKEY`: UInt = 16384u;
public const val `CR_FLG_TRUSTONUSE`: UInt = 4096u;
public const val `CR_FLG_VALIDENCRYPTEDKEYHASH`: UInt = 64u;
public const val `CR_GEMT_DEFAULT`: UInt = 0u;
public const val `CR_GEMT_HRESULT_STRING`: UInt = 1u;
public const val `CR_GEMT_HTTP_ERROR`: UInt = 2u;
public const val `CR_IN_BASE64`: `CERT_IMPORT_FLAGS` = 1;
public const val `CR_IN_BASE64HEADER`: `CERT_IMPORT_FLAGS` = 0;
public const val `CR_IN_BINARY`: `CERT_IMPORT_FLAGS` = 2;
public const val `CR_IN_CERTIFICATETRANSPARENCY`: UInt = 67108864u;
public const val `CR_IN_CHALLENGERESPONSE`: UInt = 1280u;
public const val `CR_IN_CLIENTIDNONE`: UInt = 4194304u;
public const val `CR_IN_CMC`: UInt = 1024u;
public const val `CR_IN_CONNECTONLY`: UInt = 8388608u;
public const val `CR_IN_CRLS`: UInt = 524288u;
public const val `CR_IN_ENCODEANY`: UInt = 255u;
public const val `CR_IN_ENCODEMASK`: UInt = 255u;
public const val `CR_IN_FORMATANY`: UInt = 0u;
public const val `CR_IN_FORMATMASK`: UInt = 65280u;
public const val `CR_IN_FULLRESPONSE`: UInt = 262144u;
public const val `CR_IN_HTTP`: UInt = 196608u;
public const val `CR_IN_KEYGEN`: UInt = 512u;
public const val `CR_IN_MACHINE`: UInt = 1048576u;
public const val `CR_IN_PKCS10`: UInt = 256u;
public const val `CR_IN_PKCS7`: UInt = 768u;
public const val `CR_IN_RETURNCHALLENGE`: UInt = 16777216u;
public const val `CR_IN_ROBO`: UInt = 2097152u;
public const val `CR_IN_RPC`: UInt = 131072u;
public const val `CR_IN_SCEP`: UInt = 65536u;
public const val `CR_IN_SCEPPOST`: UInt = 33554432u;
public const val `CR_IN_SIGNEDCERTIFICATETIMESTAMPLIST`: UInt = 1536u;
public const val `CR_OUT_BASE64`: `CERT_REQUEST_OUT_TYPE` = 1;
public const val `CR_OUT_BASE64HEADER`: `CERT_REQUEST_OUT_TYPE` = 0;
public const val `CR_OUT_BASE64REQUESTHEADER`: UInt = 3u;
public const val `CR_OUT_BASE64X509CRLHEADER`: UInt = 9u;
public const val `CR_OUT_BINARY`: `CERT_REQUEST_OUT_TYPE` = 2;
public const val `CR_OUT_CHAIN`: UInt = 256u;
public const val `CR_OUT_CRLS`: UInt = 512u;
public const val `CR_OUT_ENCODEMASK`: UInt = 255u;
public const val `CR_OUT_HEX`: UInt = 4u;
public const val `CR_OUT_HEXADDR`: UInt = 10u;
public const val `CR_OUT_HEXASCII`: UInt = 5u;
public const val `CR_OUT_HEXASCIIADDR`: UInt = 11u;
public const val `CR_OUT_HEXRAW`: UInt = 12u;
public const val `CR_OUT_NOCR`: UInt = 2147483648u;
public const val `CR_OUT_NOCRLF`: UInt = 1073741824u;
public const val `CR_PROP_ADVANCEDSERVER`: UInt = 28u;
public const val `CR_PROP_BASECRL`: UInt = 17u;
public const val `CR_PROP_BASECRLPUBLISHSTATUS`: UInt = 30u;
public const val `CR_PROP_CABACKWARDCROSSCERT`: UInt = 36u;
public const val `CR_PROP_CABACKWARDCROSSCERTSTATE`: UInt = 38u;
public const val `CR_PROP_CACERTSTATE`: UInt = 19u;
public const val `CR_PROP_CACERTSTATUSCODE`: UInt = 34u;
public const val `CR_PROP_CACERTVERSION`: UInt = 39u;
public const val `CR_PROP_CAFORWARDCROSSCERT`: UInt = 35u;
public const val `CR_PROP_CAFORWARDCROSSCERTSTATE`: UInt = 37u;
public const val `CR_PROP_CANAME`: UInt = 6u;
public const val `CR_PROP_CAPROPIDMAX`: UInt = 21u;
public const val `CR_PROP_CASIGCERT`: UInt = 12u;
public const val `CR_PROP_CASIGCERTCHAIN`: UInt = 13u;
public const val `CR_PROP_CASIGCERTCOUNT`: UInt = 11u;
public const val `CR_PROP_CASIGCERTCRLCHAIN`: UInt = 32u;
public const val `CR_PROP_CATYPE`: UInt = 10u;
public const val `CR_PROP_CAXCHGCERT`: UInt = 15u;
public const val `CR_PROP_CAXCHGCERTCHAIN`: UInt = 16u;
public const val `CR_PROP_CAXCHGCERTCOUNT`: UInt = 14u;
public const val `CR_PROP_CAXCHGCERTCRLCHAIN`: UInt = 33u;
public const val `CR_PROP_CERTAIAOCSPURLS`: UInt = 43u;
public const val `CR_PROP_CERTAIAURLS`: UInt = 42u;
public const val `CR_PROP_CERTCDPURLS`: UInt = 41u;
public const val `CR_PROP_CRLSTATE`: UInt = 20u;
public const val `CR_PROP_DELTACRL`: UInt = 18u;
public const val `CR_PROP_DELTACRLPUBLISHSTATUS`: UInt = 31u;
public const val `CR_PROP_DNSNAME`: UInt = 22u;
public const val `CR_PROP_EXITCOUNT`: UInt = 3u;
public const val `CR_PROP_EXITDESCRIPTION`: UInt = 4u;
public const val `CR_PROP_FILEVERSION`: UInt = 1u;
public const val `CR_PROP_KRACERT`: UInt = 26u;
public const val `CR_PROP_KRACERTCOUNT`: UInt = 25u;
public const val `CR_PROP_KRACERTSTATE`: UInt = 27u;
public const val `CR_PROP_KRACERTUSEDCOUNT`: UInt = 24u;
public const val `CR_PROP_LOCALENAME`: UInt = 44u;
public const val `CR_PROP_NONE`: UInt = 0u;
public const val `CR_PROP_PARENTCA`: UInt = 9u;
public const val `CR_PROP_POLICYDESCRIPTION`: UInt = 5u;
public const val `CR_PROP_PRODUCTVERSION`: UInt = 2u;
public const val `CR_PROP_ROLESEPARATIONENABLED`: UInt = 23u;
public const val `CR_PROP_SANITIZEDCANAME`: UInt = 7u;
public const val `CR_PROP_SANITIZEDCASHORTNAME`: UInt = 40u;
public const val `CR_PROP_SCEPMAX`: UInt = 1002u;
public const val `CR_PROP_SCEPMIN`: UInt = 1000u;
public const val `CR_PROP_SCEPSERVERCAPABILITIES`: UInt = 1001u;
public const val `CR_PROP_SCEPSERVERCERTS`: UInt = 1000u;
public const val `CR_PROP_SCEPSERVERCERTSCHAIN`: UInt = 1002u;
public const val `CR_PROP_SHAREDFOLDER`: UInt = 8u;
public const val `CR_PROP_SUBJECTTEMPLATE_OIDS`: UInt = 45u;
public const val `CR_PROP_TEMPLATES`: UInt = 29u;
public const val `CSBACKUP_DISABLE_INCREMENTAL`: UInt = 4294967295u;
public typealias `CSBACKUP_TYPE` = UInt;
public const val `CSBACKUP_TYPE_FULL`: `CSBACKUP_TYPE` = 1u;
public const val `CSBACKUP_TYPE_LOGS_ONLY`: `CSBACKUP_TYPE` = 2u;
public const val `CSBACKUP_TYPE_MASK`: UInt = 3u;
public const val `CSBFT_DATABASE_DIRECTORY`: UInt = 64u;
public const val `CSBFT_DIRECTORY`: UInt = 128u;
public const val `CSBFT_LOG_DIRECTORY`: UInt = 32u;
public const val `CSCONTROL_RESTART`: ULong = 3uL;
public const val `CSCONTROL_SHUTDOWN`: ULong = 1uL;
public const val `CSCONTROL_SUSPEND`: ULong = 2uL;
// UNSUPPORTED Rust 360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CSEDB_RSTMAPW {
//     pub pwszDatabaseName: windows_sys::core::PWSTR,
//     pub pwszNewDatabaseName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 366:1: declaration Impl has no candidate rule
// impl Default for CSEDB_RSTMAPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CSRESTORE_TYPE_CATCHUP`: UInt = 4u;
public const val `CSRESTORE_TYPE_FULL`: UInt = 1u;
public const val `CSRESTORE_TYPE_MASK`: UInt = 5u;
public const val `CSRESTORE_TYPE_ONLINE`: UInt = 2u;
public const val `CSURL_ADDTOCERTCDP`: UInt = 2u;
public const val `CSURL_ADDTOCERTOCSP`: UInt = 32u;
public const val `CSURL_ADDTOCRLCDP`: UInt = 8u;
public const val `CSURL_ADDTOFRESHESTCRL`: UInt = 4u;
public const val `CSURL_ADDTOIDP`: UInt = 128u;
public const val `CSURL_PUBLISHRETRY`: UInt = 16u;
public const val `CSURL_SERVERPUBLISH`: UInt = 1u;
public const val `CSURL_SERVERPUBLISHDELTA`: UInt = 64u;
public const val `CSVER_MAJOR`: UInt = 7u;
public const val `CSVER_MAJOR_LONGHORN`: UInt = 3u;
public const val `CSVER_MAJOR_THRESHOLD`: UInt = 7u;
public const val `CSVER_MAJOR_WHISTLER`: UInt = 2u;
public const val `CSVER_MAJOR_WIN2K`: UInt = 1u;
public const val `CSVER_MAJOR_WIN7`: UInt = 4u;
public const val `CSVER_MAJOR_WIN8`: UInt = 5u;
public const val `CSVER_MAJOR_WINBLUE`: UInt = 6u;
public const val `CSVER_MINOR`: UInt = 1u;
public const val `CSVER_MINOR_LONGHORN_BETA1`: UInt = 1u;
public const val `CSVER_MINOR_THRESHOLD`: UInt = 1u;
public const val `CSVER_MINOR_WHISTLER_BETA2`: UInt = 1u;
public const val `CSVER_MINOR_WHISTLER_BETA3`: UInt = 2u;
public const val `CSVER_MINOR_WIN2K`: UInt = 1u;
public const val `CSVER_MINOR_WIN7`: UInt = 1u;
public const val `CSVER_MINOR_WIN8`: UInt = 1u;
public const val `CSVER_MINOR_WINBLUE`: UInt = 1u;
// UNSUPPORTED Rust 400:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CSignerCertificate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203d_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 401:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CSmimeCapabilities: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201a_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 402:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CSmimeCapability: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2019_217d_11da_b2a4_000e7bbb2b09);

public const val `CVIEWAGEMINUTESDEFAULT`: UInt = 16u;
public typealias `CVRC_COLUMN` = Int;
public const val `CVRC_COLUMN_MASK`: `CVRC_COLUMN` = 4095;
public const val `CVRC_COLUMN_RESULT`: `CVRC_COLUMN` = 1;
public const val `CVRC_COLUMN_SCHEMA`: `CVRC_COLUMN` = 0;
public const val `CVRC_COLUMN_VALUE`: `CVRC_COLUMN` = 2;
public typealias `CVRC_TABLE` = Int;
public const val `CVRC_TABLE_ATTRIBUTES`: `CVRC_TABLE` = 16384;
public const val `CVRC_TABLE_CRL`: `CVRC_TABLE` = 20480;
public const val `CVRC_TABLE_EXTENSIONS`: `CVRC_TABLE` = 12288;
public const val `CVRC_TABLE_MASK`: UInt = 61440u;
public const val `CVRC_TABLE_REQCERT`: `CVRC_TABLE` = 0;
public const val `CVRC_TABLE_SHIFT`: UInt = 12u;
public const val `CVR_SEEK_EQ`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 1;
public const val `CVR_SEEK_GE`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 8;
public const val `CVR_SEEK_GT`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 16;
public const val `CVR_SEEK_LE`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 4;
public const val `CVR_SEEK_LT`: `CERT_VIEW_SEEK_OPERATOR_FLAGS` = 2;
public const val `CVR_SEEK_MASK`: UInt = 255u;
public const val `CVR_SEEK_NODELTA`: UInt = 4096u;
public const val `CVR_SEEK_NONE`: UInt = 0u;
public const val `CVR_SORT_ASCEND`: UInt = 1u;
public const val `CVR_SORT_DESCEND`: UInt = 2u;
public const val `CVR_SORT_NONE`: UInt = 0u;
public const val `CV_COLUMN_ATTRIBUTE_DEFAULT`: Int = -5;
public const val `CV_COLUMN_CRL_DEFAULT`: Int = -6;
public const val `CV_COLUMN_EXTENSION_DEFAULT`: Int = -4;
public const val `CV_COLUMN_LOG_DEFAULT`: `CERT_VIEW_COLUMN_INDEX` = -2;
public const val `CV_COLUMN_LOG_FAILED_DEFAULT`: `CERT_VIEW_COLUMN_INDEX` = -3;
public const val `CV_COLUMN_LOG_REVOKED_DEFAULT`: Int = -7;
public const val `CV_COLUMN_QUEUE_DEFAULT`: `CERT_VIEW_COLUMN_INDEX` = -1;
public const val `CV_OUT_BASE64`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 1;
public const val `CV_OUT_BASE64HEADER`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 0;
public const val `CV_OUT_BASE64REQUESTHEADER`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 3;
public const val `CV_OUT_BASE64X509CRLHEADER`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 9;
public const val `CV_OUT_BINARY`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 2;
public const val `CV_OUT_ENCODEMASK`: UInt = 255u;
public const val `CV_OUT_HEX`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 4;
public const val `CV_OUT_HEXADDR`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 10;
public const val `CV_OUT_HEXASCII`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 5;
public const val `CV_OUT_HEXASCIIADDR`: `ENUM_CERT_COLUMN_VALUE_FLAGS` = 11;
public const val `CV_OUT_HEXRAW`: UInt = 12u;
public const val `CV_OUT_NOCR`: UInt = 2147483648u;
public const val `CV_OUT_NOCRLF`: UInt = 1073741824u;
// UNSUPPORTED Rust 447:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX500DistinguishedName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2003_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 448:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509Attribute: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2022_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 449:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509AttributeArchiveKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2027_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 450:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509AttributeArchiveKeyHash: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2028_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 451:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509AttributeClientId: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2025_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 452:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509AttributeCspProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 453:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509AttributeExtensions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2024_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 454:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509AttributeOSVersion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e202a_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 455:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509AttributeRenewalCertificate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2026_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 456:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509Attributes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2023_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 457:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateRequestCertificate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2043_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 458:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateRequestCmc: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2045_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 459:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateRequestPkcs10: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2042_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 460:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateRequestPkcs7: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2044_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 461:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateRevocationList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2060_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 462:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateRevocationListEntries: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e205f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 463:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateRevocationListEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e205e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 464:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509CertificateTemplateADWritable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8336e323_2e6a_4a04_937c_548f681839b3);

// UNSUPPORTED Rust 465:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509EndorsementKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11a25a1d_b9a3_4edd_af83_3b59adbed361);

// UNSUPPORTED Rust 466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509Enrollment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2046_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 467:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509EnrollmentHelper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2050_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 468:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509EnrollmentPolicyActiveDirectory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f39027_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 469:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509EnrollmentPolicyWebService: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f39028_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 470:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509EnrollmentWebClassFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2049_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 471:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509Extension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200d_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 472:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionAlternativeNames: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2015_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 473:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionAuthorityKeyIdentifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2018_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 474:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionBasicConstraints: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2016_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 475:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionCertificatePolicies: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2020_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 476:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionEnhancedKeyUsage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2010_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 477:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionKeyUsage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 478:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionMSApplicationPolicies: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2021_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 479:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionSmimeCapabilities: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e201b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 480:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionSubjectKeyIdentifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2017_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionTemplate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2012_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509ExtensionTemplateName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2011_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 483:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509Extensions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200e_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 484:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509MachineEnrollmentFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2051_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 485:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509NameValuePair: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e203f_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 486:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509PolicyServerListManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f39029_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509PolicyServerUrl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91f3902a_217f_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509PrivateKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200c_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509PublicKey: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e200b_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509SCEPEnrollment: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2061_217d_11da_b2a4_000e7bbb2b09);

// UNSUPPORTED Rust 491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CX509SCEPEnrollmentHelper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x884e2062_217d_11da_b2a4_000e7bbb2b09);

public const val `ClientIdAutoEnroll`: `RequestClientInfoClientId` = 6;
public const val `ClientIdAutoEnroll2003`: `RequestClientInfoClientId` = 2;
public const val `ClientIdCertReq`: `RequestClientInfoClientId` = 9;
public const val `ClientIdCertReq2003`: `RequestClientInfoClientId` = 4;
public const val `ClientIdDefaultRequest`: `RequestClientInfoClientId` = 5;
public const val `ClientIdEOBO`: `RequestClientInfoClientId` = 8;
public const val `ClientIdNone`: `RequestClientInfoClientId` = 0;
public const val `ClientIdRequestWizard`: `RequestClientInfoClientId` = 7;
public const val `ClientIdTest`: `RequestClientInfoClientId` = 10;
public const val `ClientIdUserStart`: `RequestClientInfoClientId` = 1000;
public const val `ClientIdWinRT`: `RequestClientInfoClientId` = 11;
public const val `ClientIdWizard2003`: `RequestClientInfoClientId` = 3;
public const val `ClientIdXEnroll2003`: `RequestClientInfoClientId` = 1;
public const val `CommitFlagDeleteTemplate`: `CommitTemplateFlags` = 4;
public const val `CommitFlagSaveTemplateGenerateOID`: `CommitTemplateFlags` = 1;
public const val `CommitFlagSaveTemplateOverwrite`: `CommitTemplateFlags` = 3;
public const val `CommitFlagSaveTemplateUseCurrentOID`: `CommitTemplateFlags` = 2;
public typealias `CommitTemplateFlags` = Int;
public const val `ContextAdministratorForceMachine`: `X509CertificateEnrollmentContext` = 3;
public const val `ContextMachine`: `X509CertificateEnrollmentContext` = 2;
public const val `ContextNone`: `X509CertificateEnrollmentContext` = 0;
public const val `ContextUser`: `X509CertificateEnrollmentContext` = 1;
public const val `DBFLAGS_CHECKPOINTDEPTH60MB`: UInt = 32u;
public const val `DBFLAGS_CIRCULARLOGGING`: UInt = 4u;
public const val `DBFLAGS_CREATEIFNEEDED`: UInt = 2u;
public const val `DBFLAGS_DISABLESNAPSHOTBACKUP`: UInt = 1024u;
public const val `DBFLAGS_ENABLEVOLATILEREQUESTS`: UInt = 2048u;
public const val `DBFLAGS_LAZYFLUSH`: UInt = 8u;
public const val `DBFLAGS_LOGBUFFERSHUGE`: UInt = 128u;
public const val `DBFLAGS_LOGBUFFERSLARGE`: UInt = 64u;
public const val `DBFLAGS_LOGFILESIZE16MB`: UInt = 256u;
public const val `DBFLAGS_MAXCACHESIZEX100`: UInt = 16u;
public const val `DBFLAGS_MULTITHREADTRANSACTIONS`: UInt = 512u;
public const val `DBFLAGS_READONLY`: UInt = 1u;
public const val `DBG_CERTSRV`: UInt = 1u;
public const val `DBSESSIONCOUNTDEFAULT`: UInt = 100u;
public const val `DB_DISP_ACTIVE`: UInt = 8u;
public const val `DB_DISP_CA_CERT`: UInt = 15u;
public const val `DB_DISP_CA_CERT_CHAIN`: UInt = 16u;
public const val `DB_DISP_DENIED`: UInt = 31u;
public const val `DB_DISP_ERROR`: UInt = 30u;
public const val `DB_DISP_FOREIGN`: UInt = 12u;
public const val `DB_DISP_ISSUED`: UInt = 20u;
public const val `DB_DISP_KRA_CERT`: UInt = 17u;
public const val `DB_DISP_LOG_FAILED_MIN`: UInt = 30u;
public const val `DB_DISP_LOG_MIN`: UInt = 20u;
public const val `DB_DISP_PENDING`: UInt = 9u;
public const val `DB_DISP_QUEUE_MAX`: UInt = 9u;
public const val `DB_DISP_REVOKED`: UInt = 21u;
public const val `DefaultNone`: `EnrollmentPolicyServerPropertyFlags` = 0;
public const val `DefaultPolicyServer`: `EnrollmentPolicyServerPropertyFlags` = 1;
public typealias `DelayRetryAction` = Int;
public const val `DelayRetryLong`: `DelayRetryAction` = 3;
public const val `DelayRetryNone`: `DelayRetryAction` = 1;
public const val `DelayRetryPastSuccess`: `DelayRetryAction` = 5;
public const val `DelayRetryShort`: `DelayRetryAction` = 2;
public const val `DelayRetrySuccess`: `DelayRetryAction` = 4;
public const val `DelayRetryUnknown`: `DelayRetryAction` = 0;
public const val `DisableGroupPolicyList`: `EnrollmentPolicyFlags` = 2;
public const val `DisableUserServerList`: `EnrollmentPolicyFlags` = 4;
public const val `DisplayNo`: `EnrollmentDisplayStatus` = 0;
public const val `DisplayYes`: `EnrollmentDisplayStatus` = 1;
public const val `EANR_SUPPRESS_IA5CONVERSION`: UInt = 2147483648u;
public const val `EAN_NAMEOBJECTID`: UInt = 2147483648u;
public const val `EDITF_ADDOLDCERTTYPE`: UInt = 16u;
public const val `EDITF_ADDOLDKEYUSAGE`: UInt = 8u;
public const val `EDITF_ATTRIBUTECA`: UInt = 512u;
public const val `EDITF_ATTRIBUTEEKU`: UInt = 32768u;
public const val `EDITF_ATTRIBUTEENDDATE`: UInt = 32u;
public const val `EDITF_ATTRIBUTESUBJECTALTNAME2`: UInt = 262144u;
public const val `EDITF_AUDITCERTTEMPLATELOAD`: UInt = 2097152u;
public const val `EDITF_BASICCONSTRAINTSCA`: UInt = 128u;
public const val `EDITF_BASICCONSTRAINTSCRITICAL`: UInt = 64u;
public const val `EDITF_DISABLEEXTENSIONLIST`: UInt = 4u;
public const val `EDITF_DISABLELDAPPACKAGELIST`: UInt = 8388608u;
public const val `EDITF_DISABLEOLDOSCNUPN`: UInt = 4194304u;
public const val `EDITF_EMAILOPTIONAL`: UInt = 131072u;
public const val `EDITF_ENABLEAKICRITICAL`: UInt = 8192u;
public const val `EDITF_ENABLEAKIISSUERNAME`: UInt = 2048u;
public const val `EDITF_ENABLEAKIISSUERSERIAL`: UInt = 4096u;
public const val `EDITF_ENABLEAKIKEYID`: UInt = 256u;
public const val `EDITF_ENABLECHASECLIENTDC`: UInt = 1048576u;
public const val `EDITF_ENABLEDEFAULTSMIME`: UInt = 65536u;
public const val `EDITF_ENABLEKEYENCIPHERMENTCACERT`: UInt = 134217728u;
public const val `EDITF_ENABLELDAPREFERRALS`: UInt = 524288u;
public const val `EDITF_ENABLEOCSPREVNOCHECK`: UInt = 33554432u;
public const val `EDITF_ENABLERENEWONBEHALFOF`: UInt = 67108864u;
public const val `EDITF_ENABLEREQUESTEXTENSIONS`: UInt = 1u;
public const val `EDITF_ENABLEUPNMAP`: UInt = 16777216u;
public const val `EDITF_IGNOREREQUESTERGROUP`: UInt = 1024u;
public const val `EDITF_REQUESTEXTENSIONLIST`: UInt = 2u;
public const val `EDITF_SERVERUPGRADED`: UInt = 16384u;
public const val `ENUMEXT_OBJECTID`: UInt = 1u;
public typealias `ENUM_CATYPES` = Int;
public typealias `ENUM_CERT_COLUMN_VALUE_FLAGS` = Int;
public const val `ENUM_ENTERPRISE_ROOTCA`: `ENUM_CATYPES` = 0;
public const val `ENUM_ENTERPRISE_SUBCA`: `ENUM_CATYPES` = 1;
public const val `ENUM_STANDALONE_ROOTCA`: `ENUM_CATYPES` = 3;
public const val `ENUM_STANDALONE_SUBCA`: `ENUM_CATYPES` = 4;
public const val `ENUM_UNKNOWN_CA`: `ENUM_CATYPES` = 5;
public const val `EXITEVENT_CERTDENIED`: `CERT_EXIT_EVENT_MASK` = 4u;
public const val `EXITEVENT_CERTIMPORTED`: UInt = 512u;
public const val `EXITEVENT_CERTISSUED`: `CERT_EXIT_EVENT_MASK` = 1u;
public const val `EXITEVENT_CERTPENDING`: `CERT_EXIT_EVENT_MASK` = 2u;
public const val `EXITEVENT_CERTRETRIEVEPENDING`: `CERT_EXIT_EVENT_MASK` = 16u;
public const val `EXITEVENT_CERTREVOKED`: `CERT_EXIT_EVENT_MASK` = 8u;
public const val `EXITEVENT_CRLISSUED`: `CERT_EXIT_EVENT_MASK` = 32u;
public const val `EXITEVENT_INVALID`: UInt = 0u;
public const val `EXITEVENT_SHUTDOWN`: `CERT_EXIT_EVENT_MASK` = 64u;
public const val `EXITEVENT_STARTUP`: UInt = 128u;
public const val `EXITPUB_ACTIVEDIRECTORY`: UInt = 2u;
public const val `EXITPUB_DEFAULT_ENTERPRISE`: UInt = 2u;
public const val `EXITPUB_DEFAULT_STANDALONE`: UInt = 1u;
public const val `EXITPUB_FILE`: UInt = 1u;
public const val `EXITPUB_REMOVEOLDCERTS`: UInt = 16u;
public const val `EXTENSION_CRITICAL_FLAG`: UInt = 1u;
public const val `EXTENSION_DELETE_FLAG`: UInt = 4u;
public const val `EXTENSION_DISABLE_FLAG`: UInt = 2u;
public const val `EXTENSION_ORIGIN_ADMIN`: UInt = 196608u;
public const val `EXTENSION_ORIGIN_CACERT`: UInt = 589824u;
public const val `EXTENSION_ORIGIN_CMC`: UInt = 524288u;
public const val `EXTENSION_ORIGIN_IMPORTEDCERT`: UInt = 393216u;
public const val `EXTENSION_ORIGIN_MASK`: UInt = 983040u;
public const val `EXTENSION_ORIGIN_PKCS7`: UInt = 458752u;
public const val `EXTENSION_ORIGIN_POLICY`: UInt = 131072u;
public const val `EXTENSION_ORIGIN_RENEWALCERT`: UInt = 327680u;
public const val `EXTENSION_ORIGIN_REQUEST`: UInt = 65536u;
public const val `EXTENSION_ORIGIN_SERVER`: UInt = 262144u;
public const val `EXTENSION_POLICY_MASK`: UInt = 65535u;
public typealias `EncodingType` = Int;
public const val `EnrollDenied`: `EnrollmentEnrollStatus` = 256;
public const val `EnrollError`: `EnrollmentEnrollStatus` = 16;
public const val `EnrollPended`: `EnrollmentEnrollStatus` = 2;
public const val `EnrollPrompt`: `WebEnrollmentFlags` = 1;
public const val `EnrollSkipped`: `EnrollmentEnrollStatus` = 64;
public const val `EnrollUIDeferredEnrollmentRequired`: `EnrollmentEnrollStatus` = 4;
public const val `EnrollUnknown`: `EnrollmentEnrollStatus` = 32;
public const val `Enrolled`: `EnrollmentEnrollStatus` = 1;
public const val `EnrollmentAddOCSPNoCheck`: `X509CertificateTemplateEnrollmentFlag` = 4096;
public const val `EnrollmentAddTemplateName`: `X509CertificateTemplateEnrollmentFlag` = 512;
public const val `EnrollmentAllowEnrollOnBehalfOf`: `X509CertificateTemplateEnrollmentFlag` = 2048;
public const val `EnrollmentAutoEnrollment`: `X509CertificateTemplateEnrollmentFlag` = 32;
public const val `EnrollmentAutoEnrollmentCheckUserDSCertificate`: `X509CertificateTemplateEnrollmentFlag` = 16;
public typealias `EnrollmentCAProperty` = Int;
public const val `EnrollmentCertificateIssuancePoliciesFromRequest`: `X509CertificateTemplateEnrollmentFlag` = 131072;
public typealias `EnrollmentDisplayStatus` = Int;
public const val `EnrollmentDomainAuthenticationNotRequired`: `X509CertificateTemplateEnrollmentFlag` = 128;
public typealias `EnrollmentEnrollStatus` = Int;
public const val `EnrollmentIncludeBasicConstraintsForEECerts`: `X509CertificateTemplateEnrollmentFlag` = 32768;
public const val `EnrollmentIncludeSymmetricAlgorithms`: `X509CertificateTemplateEnrollmentFlag` = 1;
public const val `EnrollmentNoRevocationInfoInCerts`: `X509CertificateTemplateEnrollmentFlag` = 16384;
public const val `EnrollmentPendAllRequests`: `X509CertificateTemplateEnrollmentFlag` = 2;
public typealias `EnrollmentPolicyFlags` = Int;
public typealias `EnrollmentPolicyServerPropertyFlags` = Int;
public const val `EnrollmentPreviousApprovalKeyBasedValidateReenrollment`: `X509CertificateTemplateEnrollmentFlag` = 65536;
public const val `EnrollmentPreviousApprovalValidateReenrollment`: `X509CertificateTemplateEnrollmentFlag` = 64;
public const val `EnrollmentPublishToDS`: `X509CertificateTemplateEnrollmentFlag` = 8;
public const val `EnrollmentPublishToKRAContainer`: `X509CertificateTemplateEnrollmentFlag` = 4;
public const val `EnrollmentRemoveInvalidCertificateFromPersonalStore`: `X509CertificateTemplateEnrollmentFlag` = 1024;
public const val `EnrollmentReuseKeyOnFullSmartCard`: `X509CertificateTemplateEnrollmentFlag` = 8192;
public typealias `EnrollmentSelectionStatus` = Int;
public const val `EnrollmentSkipAutoRenewal`: `X509CertificateTemplateEnrollmentFlag` = 262144;
public typealias `EnrollmentTemplateProperty` = Int;
public const val `EnrollmentUserInteractionRequired`: `X509CertificateTemplateEnrollmentFlag` = 256;
public const val `ExportCAs`: `X509EnrollmentPolicyExportFlags` = 4;
public const val `ExportOIDs`: `X509EnrollmentPolicyExportFlags` = 2;
public const val `ExportTemplates`: `X509EnrollmentPolicyExportFlags` = 1;
// UNSUPPORTED Rust 659:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPCLOSE = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 660:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPEND = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 661:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPFREE = Option<unsafe extern "system" fn(pv: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 662:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPGETBACKUPLOGSW = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void, ppwszzbackuplogfiles: *mut *mut u16, pcbsize: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 663:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPGETDATABASENAMESW = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void, ppwszzattachmentinformation: *mut *mut u16, pcbsize: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 664:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPGETDYNAMICFILELISTW = Option<unsafe extern "system" fn(hbc: *const core::ffi::c_void, ppwszzfilelist: *mut *mut u16, pcbsize: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 665:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPOPENFILEW = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void, pwszattachmentname: windows_sys::core::PCWSTR, cbreadhintsize: u32, plifilesize: *mut i64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 666:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPPREPAREW = Option<unsafe extern "system" fn(pwszservername: windows_sys::core::PCWSTR, grbitjet: u32, dwbackupflags: u32, phbc: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 667:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPREAD = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void, pvbuffer: *mut core::ffi::c_void, cbbuffer: u32, pcbread: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 668:1: generic scalar type unsupported
// pub type FNCERTSRVBACKUPTRUNCATELOGS = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 669:1: generic scalar type unsupported
// pub type FNCERTSRVISSERVERONLINEW = Option<unsafe extern "system" fn(pwszservername: windows_sys::core::PCWSTR, pfserveronline: *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 670:1: generic scalar type unsupported
// pub type FNCERTSRVRESTOREEND = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 671:1: generic scalar type unsupported
// pub type FNCERTSRVRESTOREGETDATABASELOCATIONSW = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void, ppwszzdatabaselocationlist: *mut *mut u16, pcbsize: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 672:1: generic scalar type unsupported
// pub type FNCERTSRVRESTOREPREPAREW = Option<unsafe extern "system" fn(pwszservername: windows_sys::core::PCWSTR, dwrestoreflags: u32, phbc: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 673:1: generic scalar type unsupported
// pub type FNCERTSRVRESTOREREGISTERCOMPLETE = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void, hrrestorestate: windows_sys::core::HRESULT) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 674:1: generic scalar type unsupported
// pub type FNCERTSRVRESTOREREGISTERW = Option<unsafe extern "system" fn(hbc: *mut core::ffi::c_void, pwszcheckpointfilepath: windows_sys::core::PCWSTR, pwszlogpath: windows_sys::core::PCWSTR, rgrstmap: *mut CSEDB_RSTMAPW, crstmap: i32, pwszbackuplogpath: windows_sys::core::PCWSTR, genlow: u32, genhigh: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 675:1: generic scalar type unsupported
// pub type FNCERTSRVSERVERCONTROLW = Option<unsafe extern "system" fn(pwszservername: windows_sys::core::PCWSTR, dwcontrolflags: u32, pcbout: *mut u32, ppbout: *mut *mut u8) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 676:1: generic scalar type unsupported
// pub type FNIMPORTPFXTOPROVIDER = Option<unsafe extern "system" fn(hwndparent: super::super::super::Foundation::HWND, pbpfx: *const u8, cbpfx: u32, importflags: ImportPFXFlags, pwszpassword: windows_sys::core::PCWSTR, pwszprovidername: windows_sys::core::PCWSTR, pwszreadername: windows_sys::core::PCWSTR, pwszcontainernameprefix: windows_sys::core::PCWSTR, pwszpin: windows_sys::core::PCWSTR, pwszfriendlyname: windows_sys::core::PCWSTR, pccertout: *mut u32, prgpcertout: *mut *mut *mut super::CERT_CONTEXT) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 677:1: generic scalar type unsupported
// pub type FNIMPORTPFXTOPROVIDERFREEDATA = Option<unsafe extern "system" fn(ccert: u32, rgpcert: *const *const super::CERT_CONTEXT)>;

public const val `FR_PROP_ATTESTATIONCHALLENGE`: `FULL_RESPONSE_PROPERTY_ID` = 20;
public const val `FR_PROP_ATTESTATIONPROVIDERNAME`: `FULL_RESPONSE_PROPERTY_ID` = 21;
public const val `FR_PROP_BODYPARTSTRING`: `FULL_RESPONSE_PROPERTY_ID` = 3;
public const val `FR_PROP_CAEXCHANGECERTIFICATE`: `FULL_RESPONSE_PROPERTY_ID` = 17;
public const val `FR_PROP_CAEXCHANGECERTIFICATECHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 18;
public const val `FR_PROP_CAEXCHANGECERTIFICATECRLCHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 19;
public const val `FR_PROP_CAEXCHANGECERTIFICATEHASH`: `FULL_RESPONSE_PROPERTY_ID` = 16;
public const val `FR_PROP_CLAIMCHALLENGE`: UInt = 22u;
public const val `FR_PROP_ENCRYPTEDKEYHASH`: `FULL_RESPONSE_PROPERTY_ID` = 14;
public const val `FR_PROP_FAILINFO`: `FULL_RESPONSE_PROPERTY_ID` = 7;
public const val `FR_PROP_FULLRESPONSE`: `FULL_RESPONSE_PROPERTY_ID` = 1;
public const val `FR_PROP_FULLRESPONSENOPKCS7`: `FULL_RESPONSE_PROPERTY_ID` = 15;
public const val `FR_PROP_ISSUEDCERTIFICATE`: `FULL_RESPONSE_PROPERTY_ID` = 11;
public const val `FR_PROP_ISSUEDCERTIFICATECHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 12;
public const val `FR_PROP_ISSUEDCERTIFICATECRLCHAIN`: `FULL_RESPONSE_PROPERTY_ID` = 13;
public const val `FR_PROP_ISSUEDCERTIFICATEHASH`: `FULL_RESPONSE_PROPERTY_ID` = 10;
public const val `FR_PROP_NONE`: `FULL_RESPONSE_PROPERTY_ID` = 0;
public const val `FR_PROP_OTHERINFOCHOICE`: `FULL_RESPONSE_PROPERTY_ID` = 6;
public const val `FR_PROP_PENDINFOTIME`: `FULL_RESPONSE_PROPERTY_ID` = 9;
public const val `FR_PROP_PENDINFOTOKEN`: `FULL_RESPONSE_PROPERTY_ID` = 8;
public const val `FR_PROP_STATUS`: `FULL_RESPONSE_PROPERTY_ID` = 4;
public const val `FR_PROP_STATUSINFOCOUNT`: `FULL_RESPONSE_PROPERTY_ID` = 2;
public const val `FR_PROP_STATUSSTRING`: `FULL_RESPONSE_PROPERTY_ID` = 5;
public typealias `FULL_RESPONSE_PROPERTY_ID` = Int;
public const val `GeneralCA`: `X509CertificateTemplateGeneralFlag` = 128;
public const val `GeneralCrossCA`: `X509CertificateTemplateGeneralFlag` = 2048;
public const val `GeneralDefault`: `X509CertificateTemplateGeneralFlag` = 65536;
public const val `GeneralDonotPersist`: `X509CertificateTemplateGeneralFlag` = 4096;
public const val `GeneralMachineType`: `X509CertificateTemplateGeneralFlag` = 64;
public const val `GeneralModified`: `X509CertificateTemplateGeneralFlag` = 131072;
public const val `ICF_ALLOWFOREIGN`: UInt = 65536u;
public const val `ICF_EXISTINGROW`: UInt = 131072u;
public const val `IF_ENABLEADMINASAUDITOR`: UInt = 4096u;
public const val `IF_ENABLEEXITKEYRETRIEVAL`: UInt = 2048u;
public const val `IF_ENFORCEENCRYPTICERTADMIN`: UInt = 1024u;
public const val `IF_ENFORCEENCRYPTICERTREQUEST`: UInt = 512u;
public const val `IF_LOCKICERTREQUEST`: UInt = 1u;
public const val `IF_NOLOCALICERTADMIN`: UInt = 32u;
public const val `IF_NOLOCALICERTADMINBACKUP`: UInt = 128u;
public const val `IF_NOLOCALICERTREQUEST`: UInt = 4u;
public const val `IF_NOREMOTEICERTADMIN`: UInt = 16u;
public const val `IF_NOREMOTEICERTADMINBACKUP`: UInt = 64u;
public const val `IF_NOREMOTEICERTREQUEST`: UInt = 2u;
public const val `IF_NORPCICERTREQUEST`: UInt = 8u;
public const val `IF_NOSNAPSHOTBACKUP`: UInt = 256u;
public const val `IKF_OVERWRITE`: UInt = 65536u;
public const val `ISSCERT_DEFAULT_DS`: UInt = 256u;
public const val `ISSCERT_DEFAULT_NODS`: UInt = 256u;
public const val `ISSCERT_ENABLE`: UInt = 256u;
public const val `ISSCERT_FILEURL_OLD`: UInt = 8u;
public const val `ISSCERT_FTPURL_OLD`: UInt = 4u;
public const val `ISSCERT_HTTPURL_OLD`: UInt = 2u;
public const val `ISSCERT_LDAPURL_OLD`: UInt = 1u;
public const val `ISSCERT_URLMASK_OLD`: UInt = 255u;
public const val `ImportExportable`: `ImportPFXFlags` = 16;
public const val `ImportExportableEncrypted`: `ImportPFXFlags` = 32;
public const val `ImportForceOverwrite`: `ImportPFXFlags` = 2;
public const val `ImportInstallCertificate`: `ImportPFXFlags` = 512;
public const val `ImportInstallChain`: `ImportPFXFlags` = 1024;
public const val `ImportInstallChainAndRoot`: `ImportPFXFlags` = 2048;
public const val `ImportMachineContext`: `ImportPFXFlags` = 1;
public const val `ImportNoUserProtected`: `ImportPFXFlags` = 64;
public const val `ImportNone`: `ImportPFXFlags` = 0;
public typealias `ImportPFXFlags` = Int;
public const val `ImportSaveProperties`: `ImportPFXFlags` = 8;
public const val `ImportSilent`: `ImportPFXFlags` = 4;
public const val `ImportUserProtected`: `ImportPFXFlags` = 128;
public const val `ImportUserProtectedHigh`: `ImportPFXFlags` = 256;
public const val `InheritDefault`: `X509RequestInheritOptions` = 0;
public const val `InheritExtensionsFlag`: `X509RequestInheritOptions` = 256;
public const val `InheritKeyMask`: `X509RequestInheritOptions` = 15;
public const val `InheritNewDefaultKey`: `X509RequestInheritOptions` = 1;
public const val `InheritNewSimilarKey`: `X509RequestInheritOptions` = 2;
public const val `InheritNone`: `X509RequestInheritOptions` = 16;
public const val `InheritPrivateKey`: `X509RequestInheritOptions` = 3;
public const val `InheritPublicKey`: `X509RequestInheritOptions` = 4;
public const val `InheritRenewalCertificateFlag`: `X509RequestInheritOptions` = 32;
public const val `InheritReserved80000000`: `X509RequestInheritOptions` = -2147483648;
public const val `InheritSubjectAltNameFlag`: `X509RequestInheritOptions` = 512;
public const val `InheritSubjectFlag`: `X509RequestInheritOptions` = 128;
public const val `InheritTemplateFlag`: `X509RequestInheritOptions` = 64;
public const val `InheritValidityPeriodFlag`: `X509RequestInheritOptions` = 1024;
public typealias `InnerRequestLevel` = Int;
public typealias `InstallResponseRestrictionFlags` = Int;
public const val `KRAF_DISABLEUSEDEFAULTPROVIDER`: UInt = 8u;
public const val `KRAF_ENABLEARCHIVEALL`: UInt = 4u;
public const val `KRAF_ENABLEFOREIGN`: UInt = 1u;
public const val `KRAF_SAVEBADREQUESTKEY`: UInt = 2u;
public const val `KRA_DISP_EXPIRED`: UInt = 0u;
public const val `KRA_DISP_INVALID`: UInt = 4u;
public const val `KRA_DISP_NOTFOUND`: UInt = 1u;
public const val `KRA_DISP_NOTLOADED`: UInt = 6u;
public const val `KRA_DISP_REVOKED`: UInt = 2u;
public const val `KRA_DISP_UNTRUSTED`: UInt = 5u;
public const val `KRA_DISP_VALID`: UInt = 3u;
public const val `KR_ENABLE_MACHINE`: UInt = 1u;
public const val `KR_ENABLE_USER`: UInt = 2u;
public typealias `KeyAttestationClaimType` = Int;
public typealias `KeyIdentifierHashAlgorithm` = Int;
public const val `LDAPF_SIGNDISABLE`: UInt = 2u;
public const val `LDAPF_SSLENABLE`: UInt = 1u;
public const val `LevelInnermost`: `InnerRequestLevel` = 0;
public const val `LevelNext`: `InnerRequestLevel` = 1;
public const val `LevelSafe`: `WebSecurityLevel` = 1;
public const val `LevelUnsafe`: `WebSecurityLevel` = 0;
public const val `LoadOptionCacheOnly`: `X509EnrollmentPolicyLoadOption` = 1;
public const val `LoadOptionDefault`: `X509EnrollmentPolicyLoadOption` = 0;
public const val `LoadOptionRegisterForADChanges`: `X509EnrollmentPolicyLoadOption` = 4;
public const val `LoadOptionReload`: `X509EnrollmentPolicyLoadOption` = 2;
// UNSUPPORTED Rust 787:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const OCSPAdmin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3f73511_92c9_47cb_8ff2_8d891a7c4de4);

// UNSUPPORTED Rust 788:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const OCSPPropertyCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf935a528_ba8a_4dd9_ba79_f283275cb2de);

public typealias `OCSPRequestFlag` = Int;
public typealias `OCSPSigningFlag` = Int;
public const val `OCSP_RF_REJECT_SIGNED_REQUESTS`: `OCSPRequestFlag` = 1;
public const val `OCSP_SF_ALLOW_NONCE_EXTENSION`: `OCSPSigningFlag` = 256;
public const val `OCSP_SF_ALLOW_SIGNINGCERT_AUTOENROLLMENT`: `OCSPSigningFlag` = 512;
public const val `OCSP_SF_ALLOW_SIGNINGCERT_AUTORENEWAL`: `OCSPSigningFlag` = 4;
public const val `OCSP_SF_AUTODISCOVER_SIGNINGCERT`: `OCSPSigningFlag` = 16;
public const val `OCSP_SF_FORCE_SIGNINGCERT_ISSUER_ISCA`: `OCSPSigningFlag` = 8;
public const val `OCSP_SF_MANUAL_ASSIGN_SIGNINGCERT`: `OCSPSigningFlag` = 32;
public const val `OCSP_SF_RESPONDER_ID_KEYHASH`: `OCSPSigningFlag` = 64;
public const val `OCSP_SF_RESPONDER_ID_NAME`: `OCSPSigningFlag` = 128;
public const val `OCSP_SF_SILENT`: `OCSPSigningFlag` = 1;
public const val `OCSP_SF_USE_CACERT`: `OCSPSigningFlag` = 2;
public typealias `ObjectIdGroupId` = Int;
public typealias `ObjectIdPublicKeyFlags` = Int;
public typealias `PENDING_REQUEST_DESIRED_PROPERTY` = Int;
public const val `PFXExportChainNoRoot`: `PFXExportOptions` = 1;
public const val `PFXExportChainWithRoot`: `PFXExportOptions` = 2;
public const val `PFXExportEEOnly`: `PFXExportOptions` = 0;
public typealias `PFXExportOptions` = Int;
public const val `PROCFLG_ENFORCEGOODKEYS`: UInt = 1u;
public const val `PROCFLG_NONE`: UInt = 0u;
public const val `PROPCALLER_ADMIN`: UInt = 1024u;
public const val `PROPCALLER_EXIT`: UInt = 768u;
public const val `PROPCALLER_MASK`: UInt = 3840u;
public const val `PROPCALLER_POLICY`: UInt = 512u;
public const val `PROPCALLER_REQUEST`: UInt = 1280u;
public const val `PROPCALLER_SERVER`: UInt = 256u;
public const val `PROPFLAGS_INDEXED`: UInt = 65536u;
public const val `PROPTYPE_BINARY`: `CERT_PROPERTY_TYPE` = 3;
public const val `PROPTYPE_DATE`: `CERT_PROPERTY_TYPE` = 2;
public const val `PROPTYPE_LONG`: `CERT_PROPERTY_TYPE` = 1;
public const val `PROPTYPE_MASK`: UInt = 255u;
public const val `PROPTYPE_STRING`: `CERT_PROPERTY_TYPE` = 4;
public typealias `Pkcs10AllowedSignatureTypes` = Int;
public typealias `PolicyQualifierType` = Int;
public const val `PolicyQualifierTypeFlags`: `PolicyQualifierType` = 3;
public const val `PolicyQualifierTypeUnknown`: `PolicyQualifierType` = 0;
public const val `PolicyQualifierTypeUrl`: `PolicyQualifierType` = 1;
public const val `PolicyQualifierTypeUserNotice`: `PolicyQualifierType` = 2;
public typealias `PolicyServerUrlFlags` = Int;
public typealias `PolicyServerUrlPropertyID` = Int;
public const val `PrivateKeyAttestMask`: `X509CertificateTemplatePrivateKeyFlag` = 12288;
public const val `PrivateKeyAttestNone`: `X509CertificateTemplatePrivateKeyFlag` = 0;
public const val `PrivateKeyAttestPreferred`: `X509CertificateTemplatePrivateKeyFlag` = 4096;
public const val `PrivateKeyAttestRequired`: `X509CertificateTemplatePrivateKeyFlag` = 8192;
public const val `PrivateKeyAttestWithoutPolicy`: `X509CertificateTemplatePrivateKeyFlag` = 16384;
public const val `PrivateKeyClientVersionMask`: `X509CertificateTemplatePrivateKeyFlag` = 251658240;
public const val `PrivateKeyClientVersionShift`: `X509CertificateTemplatePrivateKeyFlag` = 24;
public const val `PrivateKeyEKTrustOnUse`: `X509CertificateTemplatePrivateKeyFlag` = 512;
public const val `PrivateKeyEKValidateCert`: `X509CertificateTemplatePrivateKeyFlag` = 1024;
public const val `PrivateKeyEKValidateKey`: `X509CertificateTemplatePrivateKeyFlag` = 2048;
public const val `PrivateKeyExportable`: `X509CertificateTemplatePrivateKeyFlag` = 16;
public const val `PrivateKeyHelloKspKey`: `X509CertificateTemplatePrivateKeyFlag` = 1048576;
public const val `PrivateKeyHelloLogonKey`: `X509CertificateTemplatePrivateKeyFlag` = 2097152;
public const val `PrivateKeyRequireAlternateSignatureAlgorithm`: `X509CertificateTemplatePrivateKeyFlag` = 64;
public const val `PrivateKeyRequireArchival`: `X509CertificateTemplatePrivateKeyFlag` = 1;
public const val `PrivateKeyRequireSameKeyRenewal`: `X509CertificateTemplatePrivateKeyFlag` = 128;
public const val `PrivateKeyRequireStrongKeyProtection`: `X509CertificateTemplatePrivateKeyFlag` = 32;
public const val `PrivateKeyServerVersionMask`: `X509CertificateTemplatePrivateKeyFlag` = 983040;
public const val `PrivateKeyServerVersionShift`: `X509CertificateTemplatePrivateKeyFlag` = 16;
public const val `PrivateKeyUseLegacyProvider`: `X509CertificateTemplatePrivateKeyFlag` = 256;
public const val `PsFriendlyName`: `PolicyServerUrlPropertyID` = 1;
public const val `PsPolicyID`: `PolicyServerUrlPropertyID` = 0;
public const val `PsfAllowUnTrustedCA`: `PolicyServerUrlFlags` = 32;
public const val `PsfAutoEnrollmentEnabled`: `PolicyServerUrlFlags` = 16;
public const val `PsfLocationGroupPolicy`: `PolicyServerUrlFlags` = 1;
public const val `PsfLocationRegistry`: `PolicyServerUrlFlags` = 2;
public const val `PsfNone`: `PolicyServerUrlFlags` = 0;
public const val `PsfUseClientId`: `PolicyServerUrlFlags` = 4;
public const val `REQDISP_DEFAULT_ENTERPRISE`: UInt = 1u;
public const val `REQDISP_DENY`: UInt = 2u;
public const val `REQDISP_ISSUE`: UInt = 1u;
public const val `REQDISP_MASK`: UInt = 255u;
public const val `REQDISP_PENDING`: UInt = 0u;
public const val `REQDISP_PENDINGFIRST`: UInt = 256u;
public const val `REQDISP_USEREQUESTATTRIBUTE`: UInt = 3u;
public const val `REVEXT_ASPENABLE`: UInt = 512u;
public const val `REVEXT_CDPENABLE`: UInt = 256u;
public const val `REVEXT_CDPFILEURL_OLD`: UInt = 8u;
public const val `REVEXT_CDPFTPURL_OLD`: UInt = 4u;
public const val `REVEXT_CDPHTTPURL_OLD`: UInt = 2u;
public const val `REVEXT_CDPLDAPURL_OLD`: UInt = 1u;
public const val `REVEXT_CDPURLMASK_OLD`: UInt = 255u;
public const val `REVEXT_DEFAULT_DS`: UInt = 256u;
public const val `REVEXT_DEFAULT_NODS`: UInt = 256u;
public typealias `RequestClientInfoClientId` = Int;
public const val `SCEPDispositionFailure`: `X509SCEPDisposition` = 2;
public const val `SCEPDispositionPending`: `X509SCEPDisposition` = 3;
public const val `SCEPDispositionPendingChallenge`: `X509SCEPDisposition` = 11;
public const val `SCEPDispositionSuccess`: `X509SCEPDisposition` = 0;
public const val `SCEPDispositionUnknown`: `X509SCEPDisposition` = -1;
public const val `SCEPFailBadAlgorithm`: `X509SCEPFailInfo` = 0;
public const val `SCEPFailBadCertId`: `X509SCEPFailInfo` = 4;
public const val `SCEPFailBadMessageCheck`: `X509SCEPFailInfo` = 1;
public const val `SCEPFailBadRequest`: `X509SCEPFailInfo` = 2;
public const val `SCEPFailBadTime`: `X509SCEPFailInfo` = 3;
public const val `SCEPFailUnknown`: `X509SCEPFailInfo` = -1;
public const val `SCEPMessageCertResponse`: `X509SCEPMessageType` = 3;
public const val `SCEPMessageClaimChallengeAnswer`: `X509SCEPMessageType` = 41;
public const val `SCEPMessageGetCRL`: `X509SCEPMessageType` = 22;
public const val `SCEPMessageGetCert`: `X509SCEPMessageType` = 21;
public const val `SCEPMessageGetCertInitial`: `X509SCEPMessageType` = 20;
public const val `SCEPMessagePKCSRequest`: `X509SCEPMessageType` = 19;
public const val `SCEPMessageUnknown`: `X509SCEPMessageType` = -1;
public const val `SCEPProcessDefault`: `X509SCEPProcessMessageFlags` = 0;
public const val `SCEPProcessSkipCertInstall`: `X509SCEPProcessMessageFlags` = 1;
public const val `SETUP_ATTEMPT_VROOT_CREATE`: UInt = 128u;
public const val `SETUP_CLIENT_FLAG`: UInt = 2u;
public const val `SETUP_CREATEDB_FLAG`: UInt = 64u;
public const val `SETUP_DCOM_SECURITY_UPDATED_FLAG`: UInt = 8192u;
public const val `SETUP_DENIED_FLAG`: UInt = 32u;
public const val `SETUP_FORCECRL_FLAG`: UInt = 256u;
public const val `SETUP_ONLINE_FLAG`: UInt = 16u;
public const val `SETUP_REQUEST_FLAG`: UInt = 8u;
public const val `SETUP_SECURITY_CHANGED`: UInt = 4096u;
public const val `SETUP_SERVER_FLAG`: UInt = 1u;
public const val `SETUP_SERVER_IS_UP_TO_DATE_FLAG`: UInt = 16384u;
public const val `SETUP_SERVER_UPGRADED_FLAG`: UInt = 1024u;
public const val `SETUP_SUSPEND_FLAG`: UInt = 4u;
public const val `SETUP_UPDATE_CAOBJECT_SVRTYPE`: UInt = 512u;
public const val `SETUP_W2K_SECURITY_NOT_UPGRADED_FLAG`: UInt = 2048u;
public const val `SKIHashCapiSha1`: `KeyIdentifierHashAlgorithm` = 2;
public const val `SKIHashDefault`: `KeyIdentifierHashAlgorithm` = 0;
public const val `SKIHashHPKP`: `KeyIdentifierHashAlgorithm` = 5;
public const val `SKIHashSha1`: `KeyIdentifierHashAlgorithm` = 1;
public const val `SKIHashSha256`: `KeyIdentifierHashAlgorithm` = 3;
public const val `SelectedNo`: `EnrollmentSelectionStatus` = 0;
public const val `SelectedYes`: `EnrollmentSelectionStatus` = 1;
public const val `SubjectAlternativeNameEnrolleeSupplies`: `X509CertificateTemplateSubjectNameFlag` = 65536;
public const val `SubjectAlternativeNameRequireDNS`: `X509CertificateTemplateSubjectNameFlag` = 134217728;
public const val `SubjectAlternativeNameRequireDirectoryGUID`: `X509CertificateTemplateSubjectNameFlag` = 16777216;
public const val `SubjectAlternativeNameRequireDomainDNS`: `X509CertificateTemplateSubjectNameFlag` = 4194304;
public const val `SubjectAlternativeNameRequireEmail`: `X509CertificateTemplateSubjectNameFlag` = 67108864;
public const val `SubjectAlternativeNameRequireSPN`: `X509CertificateTemplateSubjectNameFlag` = 8388608;
public const val `SubjectAlternativeNameRequireUPN`: `X509CertificateTemplateSubjectNameFlag` = 33554432;
public const val `SubjectNameAndAlternativeNameOldCertSupplies`: `X509CertificateTemplateSubjectNameFlag` = 8;
public const val `SubjectNameEnrolleeSupplies`: `X509CertificateTemplateSubjectNameFlag` = 1;
public const val `SubjectNameRequireCommonName`: `X509CertificateTemplateSubjectNameFlag` = 1073741824;
public const val `SubjectNameRequireDNS`: `X509CertificateTemplateSubjectNameFlag` = 268435456;
public const val `SubjectNameRequireDirectoryPath`: `X509CertificateTemplateSubjectNameFlag` = -2147483648;
public const val `SubjectNameRequireEmail`: `X509CertificateTemplateSubjectNameFlag` = 536870912;
public const val `TP_MACHINEPOLICY`: UInt = 1u;
public const val `TemplatePropAsymmetricAlgorithm`: `EnrollmentTemplateProperty` = 18;
public const val `TemplatePropCertificatePolicies`: `EnrollmentTemplateProperty` = 16;
public const val `TemplatePropCommonName`: `EnrollmentTemplateProperty` = 1;
public const val `TemplatePropCryptoProviders`: `EnrollmentTemplateProperty` = 4;
public const val `TemplatePropDescription`: `EnrollmentTemplateProperty` = 6;
public const val `TemplatePropEKUs`: `EnrollmentTemplateProperty` = 3;
public const val `TemplatePropEnrollmentFlags`: `EnrollmentTemplateProperty` = 24;
public const val `TemplatePropExtensions`: `EnrollmentTemplateProperty` = 29;
public const val `TemplatePropFriendlyName`: `EnrollmentTemplateProperty` = 2;
public const val `TemplatePropGeneralFlags`: `EnrollmentTemplateProperty` = 27;
public const val `TemplatePropHashAlgorithm`: `EnrollmentTemplateProperty` = 22;
public const val `TemplatePropKeySecurityDescriptor`: `EnrollmentTemplateProperty` = 19;
public const val `TemplatePropKeySpec`: `EnrollmentTemplateProperty` = 7;
public const val `TemplatePropKeyUsage`: `EnrollmentTemplateProperty` = 23;
public const val `TemplatePropMajorRevision`: `EnrollmentTemplateProperty` = 5;
public const val `TemplatePropMinimumKeySize`: `EnrollmentTemplateProperty` = 11;
public const val `TemplatePropMinorRevision`: `EnrollmentTemplateProperty` = 9;
public const val `TemplatePropOID`: `EnrollmentTemplateProperty` = 12;
public const val `TemplatePropPrivateKeyFlags`: `EnrollmentTemplateProperty` = 26;
public const val `TemplatePropRACertificatePolicies`: `EnrollmentTemplateProperty` = 14;
public const val `TemplatePropRAEKUs`: `EnrollmentTemplateProperty` = 15;
public const val `TemplatePropRASignatureCount`: `EnrollmentTemplateProperty` = 10;
public const val `TemplatePropRenewalPeriod`: `EnrollmentTemplateProperty` = 31;
public const val `TemplatePropSchemaVersion`: `EnrollmentTemplateProperty` = 8;
public const val `TemplatePropSecurityDescriptor`: `EnrollmentTemplateProperty` = 28;
public const val `TemplatePropSubjectNameFlags`: `EnrollmentTemplateProperty` = 25;
public const val `TemplatePropSupersede`: `EnrollmentTemplateProperty` = 13;
public const val `TemplatePropSymmetricAlgorithm`: `EnrollmentTemplateProperty` = 20;
public const val `TemplatePropSymmetricKeyLength`: `EnrollmentTemplateProperty` = 21;
public const val `TemplatePropV1ApplicationPolicy`: `EnrollmentTemplateProperty` = 17;
public const val `TemplatePropValidityPeriod`: `EnrollmentTemplateProperty` = 30;
public const val `TypeAny`: `X509RequestType` = 0;
public const val `TypeCertificate`: `X509RequestType` = 4;
public const val `TypeCmc`: `X509RequestType` = 3;
public const val `TypePkcs10`: `X509RequestType` = 1;
public const val `TypePkcs7`: `X509RequestType` = 2;
public const val `VR_INSTANT_BAD`: UInt = 2u;
public const val `VR_INSTANT_OK`: UInt = 1u;
public const val `VR_PENDING`: UInt = 0u;
public const val `VerifyAllowUI`: `X509PrivateKeyVerify` = 4;
public const val `VerifyNone`: `X509PrivateKeyVerify` = 0;
public const val `VerifySilent`: `X509PrivateKeyVerify` = 1;
public const val `VerifySmartCardNone`: `X509PrivateKeyVerify` = 2;
public const val `VerifySmartCardSilent`: `X509PrivateKeyVerify` = 3;
public typealias `WebEnrollmentFlags` = Int;
public typealias `WebSecurityLevel` = Int;
public typealias `X500NameFlags` = Int;
public const val `X509AuthAnonymous`: `X509EnrollmentAuthFlags` = 1;
public const val `X509AuthCertificate`: `X509EnrollmentAuthFlags` = 8;
public const val `X509AuthKerberos`: `X509EnrollmentAuthFlags` = 2;
public const val `X509AuthNone`: `X509EnrollmentAuthFlags` = 0;
public const val `X509AuthUsername`: `X509EnrollmentAuthFlags` = 4;
public typealias `X509CertificateEnrollmentContext` = Int;
public typealias `X509CertificateTemplateEnrollmentFlag` = Int;
public typealias `X509CertificateTemplateGeneralFlag` = Int;
public typealias `X509CertificateTemplatePrivateKeyFlag` = Int;
public typealias `X509CertificateTemplateSubjectNameFlag` = Int;
public typealias `X509EnrollmentAuthFlags` = Int;
public typealias `X509EnrollmentPolicyExportFlags` = Int;
public typealias `X509EnrollmentPolicyLoadOption` = Int;
public typealias `X509HardwareKeyUsageFlags` = Int;
public typealias `X509KeyParametersExportType` = Int;
public typealias `X509KeySpec` = Int;
public typealias `X509KeyUsageFlags` = Int;
public typealias `X509PrivateKeyExportFlags` = Int;
public typealias `X509PrivateKeyProtection` = Int;
public typealias `X509PrivateKeyUsageFlags` = Int;
public typealias `X509PrivateKeyVerify` = Int;
public typealias `X509ProviderType` = Int;
public typealias `X509RequestInheritOptions` = Int;
public typealias `X509RequestType` = Int;
public typealias `X509SCEPDisposition` = Int;
public typealias `X509SCEPFailInfo` = Int;
public typealias `X509SCEPMessageType` = Int;
public typealias `X509SCEPProcessMessageFlags` = Int;
public const val `XCN_AT_KEYEXCHANGE`: `X509KeySpec` = 1;
public const val `XCN_AT_NONE`: `X509KeySpec` = 0;
public const val `XCN_AT_SIGNATURE`: `X509KeySpec` = 2;
public const val `XCN_BCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE`: `AlgorithmType` = 3;
public const val `XCN_BCRYPT_CIPHER_INTERFACE`: `AlgorithmType` = 1;
public const val `XCN_BCRYPT_HASH_INTERFACE`: `AlgorithmType` = 2;
public const val `XCN_BCRYPT_KEY_DERIVATION_INTERFACE`: `AlgorithmType` = 7;
public const val `XCN_BCRYPT_RNG_INTERFACE`: `AlgorithmType` = 6;
public const val `XCN_BCRYPT_SECRET_AGREEMENT_INTERFACE`: `AlgorithmType` = 4;
public const val `XCN_BCRYPT_SIGNATURE_INTERFACE`: `AlgorithmType` = 5;
public const val `XCN_BCRYPT_UNKNOWN_INTERFACE`: `AlgorithmType` = 0;
public const val `XCN_CERT_ACCESS_STATE_PROP_ID`: `CERTENROLL_PROPERTYID` = 14;
public const val `XCN_CERT_AIA_URL_RETRIEVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 67;
public const val `XCN_CERT_ALT_NAME_DIRECTORY_NAME`: `AlternativeNameType` = 5;
public const val `XCN_CERT_ALT_NAME_DNS_NAME`: `AlternativeNameType` = 3;
public const val `XCN_CERT_ALT_NAME_EDI_PARTY_NAME`: `AlternativeNameType` = 6;
public const val `XCN_CERT_ALT_NAME_GUID`: `AlternativeNameType` = 10;
public const val `XCN_CERT_ALT_NAME_IP_ADDRESS`: `AlternativeNameType` = 8;
public const val `XCN_CERT_ALT_NAME_OTHER_NAME`: `AlternativeNameType` = 1;
public const val `XCN_CERT_ALT_NAME_REGISTERED_ID`: `AlternativeNameType` = 9;
public const val `XCN_CERT_ALT_NAME_RFC822_NAME`: `AlternativeNameType` = 2;
public const val `XCN_CERT_ALT_NAME_UNKNOWN`: `AlternativeNameType` = 0;
public const val `XCN_CERT_ALT_NAME_URL`: `AlternativeNameType` = 7;
public const val `XCN_CERT_ALT_NAME_USER_PRINCIPLE_NAME`: `AlternativeNameType` = 11;
public const val `XCN_CERT_ALT_NAME_X400_ADDRESS`: `AlternativeNameType` = 4;
public const val `XCN_CERT_ARCHIVED_KEY_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 65;
public const val `XCN_CERT_ARCHIVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 19;
public const val `XCN_CERT_AUTHORITY_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 68;
public const val `XCN_CERT_AUTH_ROOT_SHA256_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 98;
public const val `XCN_CERT_AUTO_ENROLL_PROP_ID`: `CERTENROLL_PROPERTYID` = 21;
public const val `XCN_CERT_AUTO_ENROLL_RETRY_PROP_ID`: `CERTENROLL_PROPERTYID` = 66;
public const val `XCN_CERT_BACKED_UP_PROP_ID`: `CERTENROLL_PROPERTYID` = 69;
public const val `XCN_CERT_CA_DISABLE_CRL_PROP_ID`: `CERTENROLL_PROPERTYID` = 82;
public const val `XCN_CERT_CA_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 81;
public const val `XCN_CERT_CEP_PROP_ID`: `CERTENROLL_PROPERTYID` = 87;
public const val `XCN_CERT_CERT_NOT_BEFORE_ENHKEY_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 127;
public const val `XCN_CERT_CLR_DELETE_KEY_PROP_ID`: `CERTENROLL_PROPERTYID` = 125;
public const val `XCN_CERT_CRL_SIGN_KEY_USAGE`: `X509KeyUsageFlags` = 2;
public const val `XCN_CERT_CROSS_CERT_DIST_POINTS_PROP_ID`: `CERTENROLL_PROPERTYID` = 23;
public const val `XCN_CERT_CTL_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 9;
public const val `XCN_CERT_DATA_ENCIPHERMENT_KEY_USAGE`: `X509KeyUsageFlags` = 16;
public const val `XCN_CERT_DATE_STAMP_PROP_ID`: `CERTENROLL_PROPERTYID` = 27;
public const val `XCN_CERT_DECIPHER_ONLY_KEY_USAGE`: `X509KeyUsageFlags` = 32768;
public const val `XCN_CERT_DESCRIPTION_PROP_ID`: `CERTENROLL_PROPERTYID` = 13;
public const val `XCN_CERT_DIGITAL_SIGNATURE_KEY_USAGE`: `X509KeyUsageFlags` = 128;
public const val `XCN_CERT_DISALLOWED_ENHKEY_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 122;
public const val `XCN_CERT_DISALLOWED_FILETIME_PROP_ID`: `CERTENROLL_PROPERTYID` = 104;
public const val `XCN_CERT_EFS_PROP_ID`: `CERTENROLL_PROPERTYID` = 17;
public const val `XCN_CERT_ENCIPHER_ONLY_KEY_USAGE`: `X509KeyUsageFlags` = 1;
public const val `XCN_CERT_ENHKEY_USAGE_PROP_ID`: `CERTENROLL_PROPERTYID` = 9;
public const val `XCN_CERT_ENROLLMENT_PROP_ID`: `CERTENROLL_PROPERTYID` = 26;
public const val `XCN_CERT_EXTENDED_ERROR_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 30;
public const val `XCN_CERT_FIRST_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 129;
public const val `XCN_CERT_FIRST_USER_PROP_ID`: `CERTENROLL_PROPERTYID` = 32768;
public const val `XCN_CERT_FORTEZZA_DATA_PROP_ID`: `CERTENROLL_PROPERTYID` = 18;
public const val `XCN_CERT_FRIENDLY_NAME_PROP_ID`: `CERTENROLL_PROPERTYID` = 11;
public const val `XCN_CERT_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 3;
public const val `XCN_CERT_HCRYPTPROV_OR_NCRYPT_KEY_HANDLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 79;
public const val `XCN_CERT_HCRYPTPROV_TRANSFER_PROP_ID`: `CERTENROLL_PROPERTYID` = 100;
public const val `XCN_CERT_IE30_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 7;
public const val `XCN_CERT_ISOLATED_KEY_PROP_ID`: `CERTENROLL_PROPERTYID` = 118;
public const val `XCN_CERT_ISSUER_CHAIN_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 96;
public const val `XCN_CERT_ISSUER_CHAIN_SIGN_HASH_CNG_ALG_PROP_ID`: `CERTENROLL_PROPERTYID` = 95;
public const val `XCN_CERT_ISSUER_PUBLIC_KEY_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 24;
public const val `XCN_CERT_ISSUER_PUB_KEY_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 94;
public const val `XCN_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 28;
public const val `XCN_CERT_KEY_AGREEMENT_KEY_USAGE`: `X509KeyUsageFlags` = 8;
public const val `XCN_CERT_KEY_CERT_SIGN_KEY_USAGE`: `X509KeyUsageFlags` = 4;
public const val `XCN_CERT_KEY_CLASSIFICATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 120;
public const val `XCN_CERT_KEY_CONTEXT_PROP_ID`: `CERTENROLL_PROPERTYID` = 5;
public const val `XCN_CERT_KEY_ENCIPHERMENT_KEY_USAGE`: `X509KeyUsageFlags` = 32;
public const val `XCN_CERT_KEY_IDENTIFIER_PROP_ID`: `CERTENROLL_PROPERTYID` = 20;
public const val `XCN_CERT_KEY_PROV_HANDLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 1;
public const val `XCN_CERT_KEY_PROV_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 2;
public const val `XCN_CERT_KEY_REPAIR_ATTEMPTED_PROP_ID`: `CERTENROLL_PROPERTYID` = 103;
public const val `XCN_CERT_KEY_SPEC_PROP_ID`: `CERTENROLL_PROPERTYID` = 6;
public const val `XCN_CERT_LAST_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 32767;
public const val `XCN_CERT_LAST_USER_PROP_ID`: `CERTENROLL_PROPERTYID` = 65535;
public const val `XCN_CERT_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 4;
public const val `XCN_CERT_NAME_STR_AMBIGUOUS_SEPARATOR_FLAGS`: `X500NameFlags` = 1275068416;
public const val `XCN_CERT_NAME_STR_COMMA_FLAG`: `X500NameFlags` = 67108864;
public const val `XCN_CERT_NAME_STR_CRLF_FLAG`: `X500NameFlags` = 134217728;
public const val `XCN_CERT_NAME_STR_DISABLE_IE4_UTF8_FLAG`: `X500NameFlags` = 65536;
public const val `XCN_CERT_NAME_STR_DISABLE_UTF8_DIR_STR_FLAG`: `X500NameFlags` = 1048576;
public const val `XCN_CERT_NAME_STR_DS_ESCAPED`: `X500NameFlags` = 8388608;
public const val `XCN_CERT_NAME_STR_ENABLE_PUNYCODE_FLAG`: `X500NameFlags` = 2097152;
public const val `XCN_CERT_NAME_STR_ENABLE_T61_UNICODE_FLAG`: `X500NameFlags` = 131072;
public const val `XCN_CERT_NAME_STR_ENABLE_UTF8_UNICODE_FLAG`: `X500NameFlags` = 262144;
public const val `XCN_CERT_NAME_STR_FORCE_UTF8_DIR_STR_FLAG`: `X500NameFlags` = 524288;
public const val `XCN_CERT_NAME_STR_FORWARD_FLAG`: `X500NameFlags` = 16777216;
public const val `XCN_CERT_NAME_STR_NONE`: `X500NameFlags` = 0;
public const val `XCN_CERT_NAME_STR_NO_PLUS_FLAG`: `X500NameFlags` = 536870912;
public const val `XCN_CERT_NAME_STR_NO_QUOTING_FLAG`: `X500NameFlags` = 268435456;
public const val `XCN_CERT_NAME_STR_REVERSE_FLAG`: `X500NameFlags` = 33554432;
public const val `XCN_CERT_NAME_STR_SEMICOLON_FLAG`: `X500NameFlags` = 1073741824;
public const val `XCN_CERT_NCRYPT_KEY_HANDLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 78;
public const val `XCN_CERT_NCRYPT_KEY_HANDLE_TRANSFER_PROP_ID`: `CERTENROLL_PROPERTYID` = 99;
public const val `XCN_CERT_NEW_KEY_PROP_ID`: `CERTENROLL_PROPERTYID` = 74;
public const val `XCN_CERT_NEXT_UPDATE_LOCATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 10;
public const val `XCN_CERT_NONCOMPLIANT_ROOT_URL_PROP_ID`: `CERTENROLL_PROPERTYID` = 123;
public const val `XCN_CERT_NON_REPUDIATION_KEY_USAGE`: `X509KeyUsageFlags` = 64;
public const val `XCN_CERT_NOT_BEFORE_FILETIME_PROP_ID`: `CERTENROLL_PROPERTYID` = 126;
public const val `XCN_CERT_NO_AUTO_EXPIRE_CHECK_PROP_ID`: `CERTENROLL_PROPERTYID` = 77;
public const val `XCN_CERT_NO_EXPIRE_NOTIFICATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 97;
public const val `XCN_CERT_NO_KEY_USAGE`: `X509KeyUsageFlags` = 0;
public const val `XCN_CERT_OCSP_CACHE_PREFIX_PROP_ID`: `CERTENROLL_PROPERTYID` = 75;
public const val `XCN_CERT_OCSP_RESPONSE_PROP_ID`: `CERTENROLL_PROPERTYID` = 70;
public const val `XCN_CERT_OFFLINE_CRL_SIGN_KEY_USAGE`: `X509KeyUsageFlags` = 2;
public const val `XCN_CERT_OID_NAME_STR`: `X500NameFlags` = 2;
public const val `XCN_CERT_PIN_SHA256_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 124;
public const val `XCN_CERT_PUBKEY_ALG_PARA_PROP_ID`: `CERTENROLL_PROPERTYID` = 22;
public const val `XCN_CERT_PUBKEY_HASH_RESERVED_PROP_ID`: `CERTENROLL_PROPERTYID` = 8;
public const val `XCN_CERT_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 93;
public const val `XCN_CERT_PVK_FILE_PROP_ID`: `CERTENROLL_PROPERTYID` = 12;
public const val `XCN_CERT_RENEWAL_PROP_ID`: `CERTENROLL_PROPERTYID` = 64;
public const val `XCN_CERT_REQUEST_ORIGINATOR_PROP_ID`: `CERTENROLL_PROPERTYID` = 71;
public const val `XCN_CERT_ROOT_PROGRAM_CERT_POLICIES_PROP_ID`: `CERTENROLL_PROPERTYID` = 83;
public const val `XCN_CERT_ROOT_PROGRAM_CHAIN_POLICIES_PROP_ID`: `CERTENROLL_PROPERTYID` = 105;
public const val `XCN_CERT_ROOT_PROGRAM_NAME_CONSTRAINTS_PROP_ID`: `CERTENROLL_PROPERTYID` = 84;
public const val `XCN_CERT_SCARD_PIN_ID_PROP_ID`: `CERTENROLL_PROPERTYID` = 90;
public const val `XCN_CERT_SCARD_PIN_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 91;
public const val `XCN_CERT_SCEP_CA_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 111;
public const val `XCN_CERT_SCEP_ENCRYPT_HASH_CNG_ALG_PROP_ID`: `CERTENROLL_PROPERTYID` = 114;
public const val `XCN_CERT_SCEP_FLAGS_PROP_ID`: `CERTENROLL_PROPERTYID` = 115;
public const val `XCN_CERT_SCEP_GUID_PROP_ID`: `CERTENROLL_PROPERTYID` = 116;
public const val `XCN_CERT_SCEP_NONCE_PROP_ID`: `CERTENROLL_PROPERTYID` = 113;
public const val `XCN_CERT_SCEP_RA_ENCRYPTION_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 110;
public const val `XCN_CERT_SCEP_RA_SIGNATURE_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 109;
public const val `XCN_CERT_SCEP_SERVER_CERTS_PROP_ID`: `CERTENROLL_PROPERTYID` = 108;
public const val `XCN_CERT_SCEP_SIGNER_CERT_PROP_ID`: `CERTENROLL_PROPERTYID` = 112;
public const val `XCN_CERT_SEND_AS_TRUSTED_ISSUER_PROP_ID`: `CERTENROLL_PROPERTYID` = 102;
public const val `XCN_CERT_SERIALIZABLE_KEY_CONTEXT_PROP_ID`: `CERTENROLL_PROPERTYID` = 117;
public const val `XCN_CERT_SERIAL_CHAIN_PROP_ID`: `CERTENROLL_PROPERTYID` = 119;
public const val `XCN_CERT_SHA1_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 3;
public const val `XCN_CERT_SHA256_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 107;
public const val `XCN_CERT_SIGNATURE_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 15;
public const val `XCN_CERT_SIGN_HASH_CNG_ALG_PROP_ID`: `CERTENROLL_PROPERTYID` = 89;
public const val `XCN_CERT_SIMPLE_NAME_STR`: `X500NameFlags` = 1;
public const val `XCN_CERT_SMART_CARD_DATA_PROP_ID`: `CERTENROLL_PROPERTYID` = 16;
public const val `XCN_CERT_SMART_CARD_READER_NON_REMOVABLE_PROP_ID`: `CERTENROLL_PROPERTYID` = 106;
public const val `XCN_CERT_SMART_CARD_READER_PROP_ID`: `CERTENROLL_PROPERTYID` = 101;
public const val `XCN_CERT_SMART_CARD_ROOT_INFO_PROP_ID`: `CERTENROLL_PROPERTYID` = 76;
public const val `XCN_CERT_SOURCE_LOCATION_PROP_ID`: `CERTENROLL_PROPERTYID` = 72;
public const val `XCN_CERT_SOURCE_URL_PROP_ID`: `CERTENROLL_PROPERTYID` = 73;
public const val `XCN_CERT_STORE_LOCALIZED_NAME_PROP_ID`: `CERTENROLL_PROPERTYID` = 4096;
public const val `XCN_CERT_SUBJECT_DISABLE_CRL_PROP_ID`: `CERTENROLL_PROPERTYID` = 86;
public const val `XCN_CERT_SUBJECT_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 80;
public const val `XCN_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 29;
public const val `XCN_CERT_SUBJECT_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID`: `CERTENROLL_PROPERTYID` = 85;
public const val `XCN_CERT_SUBJECT_PUBLIC_KEY_MD5_HASH_PROP_ID`: `CERTENROLL_PROPERTYID` = 25;
public const val `XCN_CERT_SUBJECT_PUB_KEY_BIT_LENGTH_PROP_ID`: `CERTENROLL_PROPERTYID` = 92;
public const val `XCN_CERT_X500_NAME_STR`: `X500NameFlags` = 3;
public const val `XCN_CERT_XML_NAME_STR`: `X500NameFlags` = 4;
public const val `XCN_CRL_REASON_AA_COMPROMISE`: `CRLRevocationReason` = 10;
public const val `XCN_CRL_REASON_AFFILIATION_CHANGED`: `CRLRevocationReason` = 3;
public const val `XCN_CRL_REASON_CA_COMPROMISE`: `CRLRevocationReason` = 2;
public const val `XCN_CRL_REASON_CERTIFICATE_HOLD`: `CRLRevocationReason` = 6;
public const val `XCN_CRL_REASON_CESSATION_OF_OPERATION`: `CRLRevocationReason` = 5;
public const val `XCN_CRL_REASON_KEY_COMPROMISE`: `CRLRevocationReason` = 1;
public const val `XCN_CRL_REASON_PRIVILEGE_WITHDRAWN`: `CRLRevocationReason` = 9;
public const val `XCN_CRL_REASON_REMOVE_FROM_CRL`: `CRLRevocationReason` = 8;
public const val `XCN_CRL_REASON_SUPERSEDED`: `CRLRevocationReason` = 4;
public const val `XCN_CRL_REASON_UNSPECIFIED`: `CRLRevocationReason` = 0;
public const val `XCN_CRYPT_ANY_GROUP_ID`: `ObjectIdGroupId` = 0;
public const val `XCN_CRYPT_ENCRYPT_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 2;
public const val `XCN_CRYPT_ENHKEY_USAGE_OID_GROUP_ID`: `ObjectIdGroupId` = 7;
public const val `XCN_CRYPT_EXT_OR_ATTR_OID_GROUP_ID`: `ObjectIdGroupId` = 6;
public const val `XCN_CRYPT_FIRST_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 1;
public const val `XCN_CRYPT_GROUP_ID_MASK`: `ObjectIdGroupId` = 65535;
public const val `XCN_CRYPT_HASH_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 1;
public const val `XCN_CRYPT_KDF_OID_GROUP_ID`: `ObjectIdGroupId` = 10;
public const val `XCN_CRYPT_KEY_LENGTH_MASK`: `ObjectIdGroupId` = 268369920;
public const val `XCN_CRYPT_LAST_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 4;
public const val `XCN_CRYPT_LAST_OID_GROUP_ID`: `ObjectIdGroupId` = 10;
public const val `XCN_CRYPT_OID_DISABLE_SEARCH_DS_FLAG`: `ObjectIdGroupId` = -2147483648;
public const val `XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_MASK`: `ObjectIdGroupId` = 268369920;
public const val `XCN_CRYPT_OID_INFO_OID_GROUP_BIT_LEN_SHIFT`: `ObjectIdGroupId` = 16;
public const val `XCN_CRYPT_OID_INFO_PUBKEY_ANY`: `ObjectIdPublicKeyFlags` = 0;
public const val `XCN_CRYPT_OID_INFO_PUBKEY_ENCRYPT_KEY_FLAG`: `ObjectIdPublicKeyFlags` = 1073741824;
public const val `XCN_CRYPT_OID_INFO_PUBKEY_SIGN_KEY_FLAG`: `ObjectIdPublicKeyFlags` = -2147483648;
public const val `XCN_CRYPT_OID_PREFER_CNG_ALGID_FLAG`: `ObjectIdGroupId` = 1073741824;
public const val `XCN_CRYPT_OID_USE_CURVE_NAME_FOR_ENCODE_FLAG`: `X509KeyParametersExportType` = 536870912;
public const val `XCN_CRYPT_OID_USE_CURVE_NONE`: `X509KeyParametersExportType` = 0;
public const val `XCN_CRYPT_OID_USE_CURVE_PARAMETERS_FOR_ENCODE_FLAG`: `X509KeyParametersExportType` = 268435456;
public const val `XCN_CRYPT_POLICY_OID_GROUP_ID`: `ObjectIdGroupId` = 8;
public const val `XCN_CRYPT_PUBKEY_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 3;
public const val `XCN_CRYPT_RDN_ATTR_OID_GROUP_ID`: `ObjectIdGroupId` = 5;
public const val `XCN_CRYPT_SIGN_ALG_OID_GROUP_ID`: `ObjectIdGroupId` = 4;
public const val `XCN_CRYPT_STRING_ANY`: `EncodingType` = 7;
public const val `XCN_CRYPT_STRING_BASE64`: `EncodingType` = 1;
public const val `XCN_CRYPT_STRING_BASE64HEADER`: `EncodingType` = 0;
public const val `XCN_CRYPT_STRING_BASE64REQUESTHEADER`: `EncodingType` = 3;
public const val `XCN_CRYPT_STRING_BASE64URI`: `EncodingType` = 13;
public const val `XCN_CRYPT_STRING_BASE64X509CRLHEADER`: `EncodingType` = 9;
public const val `XCN_CRYPT_STRING_BASE64_ANY`: `EncodingType` = 6;
public const val `XCN_CRYPT_STRING_BINARY`: `EncodingType` = 2;
public const val `XCN_CRYPT_STRING_CHAIN`: `EncodingType` = 256;
public const val `XCN_CRYPT_STRING_ENCODEMASK`: `EncodingType` = 255;
public const val `XCN_CRYPT_STRING_HASHDATA`: `EncodingType` = 268435456;
public const val `XCN_CRYPT_STRING_HEX`: `EncodingType` = 4;
public const val `XCN_CRYPT_STRING_HEXADDR`: `EncodingType` = 10;
public const val `XCN_CRYPT_STRING_HEXASCII`: `EncodingType` = 5;
public const val `XCN_CRYPT_STRING_HEXASCIIADDR`: `EncodingType` = 11;
public const val `XCN_CRYPT_STRING_HEXRAW`: `EncodingType` = 12;
public const val `XCN_CRYPT_STRING_HEX_ANY`: `EncodingType` = 8;
public const val `XCN_CRYPT_STRING_NOCR`: `EncodingType` = -2147483648;
public const val `XCN_CRYPT_STRING_NOCRLF`: `EncodingType` = 1073741824;
public const val `XCN_CRYPT_STRING_PERCENTESCAPE`: `EncodingType` = 134217728;
public const val `XCN_CRYPT_STRING_STRICT`: `EncodingType` = 536870912;
public const val `XCN_CRYPT_STRING_TEXT`: `EncodingType` = 512;
public const val `XCN_CRYPT_TEMPLATE_OID_GROUP_ID`: `ObjectIdGroupId` = 9;
public const val `XCN_NCRYPT_ALLOW_ALL_USAGES`: `X509PrivateKeyUsageFlags` = 16777215;
public const val `XCN_NCRYPT_ALLOW_ARCHIVING_FLAG`: `X509PrivateKeyExportFlags` = 4;
public const val `XCN_NCRYPT_ALLOW_DECRYPT_FLAG`: `X509PrivateKeyUsageFlags` = 1;
public const val `XCN_NCRYPT_ALLOW_EXPORT_FLAG`: `X509PrivateKeyExportFlags` = 1;
public const val `XCN_NCRYPT_ALLOW_EXPORT_NONE`: `X509PrivateKeyExportFlags` = 0;
public const val `XCN_NCRYPT_ALLOW_KEY_AGREEMENT_FLAG`: `X509PrivateKeyUsageFlags` = 4;
public const val `XCN_NCRYPT_ALLOW_KEY_IMPORT_FLAG`: `X509PrivateKeyUsageFlags` = 8;
public const val `XCN_NCRYPT_ALLOW_PLAINTEXT_ARCHIVING_FLAG`: `X509PrivateKeyExportFlags` = 8;
public const val `XCN_NCRYPT_ALLOW_PLAINTEXT_EXPORT_FLAG`: `X509PrivateKeyExportFlags` = 2;
public const val `XCN_NCRYPT_ALLOW_SIGNING_FLAG`: `X509PrivateKeyUsageFlags` = 2;
public const val `XCN_NCRYPT_ALLOW_USAGES_NONE`: `X509PrivateKeyUsageFlags` = 0;
public const val `XCN_NCRYPT_ANY_ASYMMETRIC_OPERATION`: `AlgorithmOperationFlags` = 28;
public const val `XCN_NCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION`: `AlgorithmOperationFlags` = 4;
public const val `XCN_NCRYPT_CIPHER_OPERATION`: `AlgorithmOperationFlags` = 1;
public const val `XCN_NCRYPT_CLAIM_AUTHORITY_AND_SUBJECT`: `KeyAttestationClaimType` = 3;
public const val `XCN_NCRYPT_CLAIM_AUTHORITY_ONLY`: `KeyAttestationClaimType` = 1;
public const val `XCN_NCRYPT_CLAIM_NONE`: `KeyAttestationClaimType` = 0;
public const val `XCN_NCRYPT_CLAIM_SUBJECT_ONLY`: `KeyAttestationClaimType` = 2;
public const val `XCN_NCRYPT_CLAIM_UNKNOWN`: `KeyAttestationClaimType` = 4096;
public const val `XCN_NCRYPT_EXACT_MATCH_OPERATION`: `AlgorithmOperationFlags` = 8388608;
public const val `XCN_NCRYPT_HASH_OPERATION`: `AlgorithmOperationFlags` = 2;
public const val `XCN_NCRYPT_KEY_DERIVATION_OPERATION`: `AlgorithmOperationFlags` = 64;
public const val `XCN_NCRYPT_NO_OPERATION`: `AlgorithmOperationFlags` = 0;
public const val `XCN_NCRYPT_PCP_ENCRYPTION_KEY`: `X509HardwareKeyUsageFlags` = 2;
public const val `XCN_NCRYPT_PCP_GENERIC_KEY`: `X509HardwareKeyUsageFlags` = 3;
public const val `XCN_NCRYPT_PCP_IDENTITY_KEY`: `X509HardwareKeyUsageFlags` = 8;
public const val `XCN_NCRYPT_PCP_NONE`: `X509HardwareKeyUsageFlags` = 0;
public const val `XCN_NCRYPT_PCP_SIGNATURE_KEY`: `X509HardwareKeyUsageFlags` = 1;
public const val `XCN_NCRYPT_PCP_STORAGE_KEY`: `X509HardwareKeyUsageFlags` = 4;
public const val `XCN_NCRYPT_PREFERENCE_MASK_OPERATION`: `AlgorithmOperationFlags` = 14680064;
public const val `XCN_NCRYPT_PREFER_NON_SIGNATURE_OPERATION`: `AlgorithmOperationFlags` = 4194304;
public const val `XCN_NCRYPT_PREFER_SIGNATURE_ONLY_OPERATION`: `AlgorithmOperationFlags` = 2097152;
public const val `XCN_NCRYPT_RNG_OPERATION`: `AlgorithmOperationFlags` = 32;
public const val `XCN_NCRYPT_SECRET_AGREEMENT_OPERATION`: `AlgorithmOperationFlags` = 8;
public const val `XCN_NCRYPT_SIGNATURE_OPERATION`: `AlgorithmOperationFlags` = 16;
public const val `XCN_NCRYPT_TPM12_PROVIDER`: `X509HardwareKeyUsageFlags` = 65536;
public const val `XCN_NCRYPT_UI_APPCONTAINER_ACCESS_MEDIUM_FLAG`: `X509PrivateKeyProtection` = 8;
public const val `XCN_NCRYPT_UI_FINGERPRINT_PROTECTION_FLAG`: `X509PrivateKeyProtection` = 4;
public const val `XCN_NCRYPT_UI_FORCE_HIGH_PROTECTION_FLAG`: `X509PrivateKeyProtection` = 2;
public const val `XCN_NCRYPT_UI_NO_PROTECTION_FLAG`: `X509PrivateKeyProtection` = 0;
public const val `XCN_NCRYPT_UI_PROTECT_KEY_FLAG`: `X509PrivateKeyProtection` = 1;
public const val `XCN_OIDVerisign_FailInfo`: `CERTENROLL_OBJECTID` = 431;
public const val `XCN_OIDVerisign_MessageType`: `CERTENROLL_OBJECTID` = 429;
public const val `XCN_OIDVerisign_PkiStatus`: `CERTENROLL_OBJECTID` = 430;
public const val `XCN_OIDVerisign_RecipientNonce`: `CERTENROLL_OBJECTID` = 433;
public const val `XCN_OIDVerisign_SenderNonce`: `CERTENROLL_OBJECTID` = 432;
public const val `XCN_OIDVerisign_TransactionID`: `CERTENROLL_OBJECTID` = 434;
public const val `XCN_OID_ANSI_X942`: `CERTENROLL_OBJECTID` = 53;
public const val `XCN_OID_ANSI_X942_DH`: `CERTENROLL_OBJECTID` = 54;
public const val `XCN_OID_ANY_APPLICATION_POLICY`: `CERTENROLL_OBJECTID` = 216;
public const val `XCN_OID_ANY_CERT_POLICY`: `CERTENROLL_OBJECTID` = 180;
public const val `XCN_OID_ANY_ENHANCED_KEY_USAGE`: `CERTENROLL_OBJECTID` = 352;
public const val `XCN_OID_APPLICATION_CERT_POLICIES`: `CERTENROLL_OBJECTID` = 229;
public const val `XCN_OID_APPLICATION_POLICY_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 231;
public const val `XCN_OID_APPLICATION_POLICY_MAPPINGS`: `CERTENROLL_OBJECTID` = 230;
public const val `XCN_OID_ARCHIVED_KEY_ATTR`: `CERTENROLL_OBJECTID` = 232;
public const val `XCN_OID_ARCHIVED_KEY_CERT_HASH`: `CERTENROLL_OBJECTID` = 235;
public const val `XCN_OID_ATTR_SUPPORTED_ALGORITHMS`: `CERTENROLL_OBJECTID` = 355;
public const val `XCN_OID_ATTR_TPM_SECURITY_ASSERTIONS`: `CERTENROLL_OBJECTID` = 356;
public const val `XCN_OID_ATTR_TPM_SPECIFICATION`: `CERTENROLL_OBJECTID` = 357;
public const val `XCN_OID_AUTHORITY_INFO_ACCESS`: `CERTENROLL_OBJECTID` = 204;
public const val `XCN_OID_AUTHORITY_KEY_IDENTIFIER`: `CERTENROLL_OBJECTID` = 169;
public const val `XCN_OID_AUTHORITY_KEY_IDENTIFIER2`: `CERTENROLL_OBJECTID` = 181;
public const val `XCN_OID_AUTHORITY_REVOCATION_LIST`: `CERTENROLL_OBJECTID` = 156;
public const val `XCN_OID_AUTO_ENROLL_CTL_USAGE`: `CERTENROLL_OBJECTID` = 217;
public const val `XCN_OID_BACKGROUND_OTHER_LOGOTYPE`: `CERTENROLL_OBJECTID` = 327;
public const val `XCN_OID_BASIC_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 175;
public const val `XCN_OID_BASIC_CONSTRAINTS2`: `CERTENROLL_OBJECTID` = 178;
public const val `XCN_OID_BIOMETRIC_EXT`: `CERTENROLL_OBJECTID` = 205;
public const val `XCN_OID_BUSINESS_CATEGORY`: `CERTENROLL_OBJECTID` = 133;
public const val `XCN_OID_CA_CERTIFICATE`: `CERTENROLL_OBJECTID` = 155;
public const val `XCN_OID_CERTIFICATE_REVOCATION_LIST`: `CERTENROLL_OBJECTID` = 157;
public const val `XCN_OID_CERTIFICATE_TEMPLATE`: `CERTENROLL_OBJECTID` = 226;
public const val `XCN_OID_CERTSRV_CA_VERSION`: `CERTENROLL_OBJECTID` = 220;
public const val `XCN_OID_CERTSRV_CROSSCA_VERSION`: `CERTENROLL_OBJECTID` = 240;
public const val `XCN_OID_CERTSRV_PREVIOUS_CERT_HASH`: `CERTENROLL_OBJECTID` = 221;
public const val `XCN_OID_CERT_DISALLOWED_FILETIME_PROP_ID`: `CERTENROLL_OBJECTID` = 358;
public const val `XCN_OID_CERT_EXTENSIONS`: `CERTENROLL_OBJECTID` = 207;
public const val `XCN_OID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 339;
public const val `XCN_OID_CERT_KEY_IDENTIFIER_PROP_ID`: `CERTENROLL_OBJECTID` = 338;
public const val `XCN_OID_CERT_MANIFOLD`: `CERTENROLL_OBJECTID` = 219;
public const val `XCN_OID_CERT_MD5_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 341;
public const val `XCN_OID_CERT_POLICIES`: `CERTENROLL_OBJECTID` = 179;
public const val `XCN_OID_CERT_POLICIES_95`: `CERTENROLL_OBJECTID` = 171;
public const val `XCN_OID_CERT_POLICIES_95_QUALIFIER1`: `CERTENROLL_OBJECTID` = 281;
public const val `XCN_OID_CERT_PROP_ID_PREFIX`: `CERTENROLL_OBJECTID` = 337;
public const val `XCN_OID_CERT_SIGNATURE_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 359;
public const val `XCN_OID_CERT_STRONG_KEY_OS_1`: `CERTENROLL_OBJECTID` = 360;
public const val `XCN_OID_CERT_STRONG_KEY_OS_CURRENT`: `CERTENROLL_OBJECTID` = 361;
public const val `XCN_OID_CERT_STRONG_KEY_OS_PREFIX`: `CERTENROLL_OBJECTID` = 362;
public const val `XCN_OID_CERT_STRONG_SIGN_OS_1`: `CERTENROLL_OBJECTID` = 363;
public const val `XCN_OID_CERT_STRONG_SIGN_OS_CURRENT`: `CERTENROLL_OBJECTID` = 364;
public const val `XCN_OID_CERT_STRONG_SIGN_OS_PREFIX`: `CERTENROLL_OBJECTID` = 365;
public const val `XCN_OID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID`: `CERTENROLL_OBJECTID` = 340;
public const val `XCN_OID_CMC`: `CERTENROLL_OBJECTID` = 304;
public const val `XCN_OID_CMC_ADD_ATTRIBUTES`: `CERTENROLL_OBJECTID` = 325;
public const val `XCN_OID_CMC_ADD_EXTENSIONS`: `CERTENROLL_OBJECTID` = 312;
public const val `XCN_OID_CMC_DATA_RETURN`: `CERTENROLL_OBJECTID` = 308;
public const val `XCN_OID_CMC_DECRYPTED_POP`: `CERTENROLL_OBJECTID` = 314;
public const val `XCN_OID_CMC_ENCRYPTED_POP`: `CERTENROLL_OBJECTID` = 313;
public const val `XCN_OID_CMC_GET_CERT`: `CERTENROLL_OBJECTID` = 316;
public const val `XCN_OID_CMC_GET_CRL`: `CERTENROLL_OBJECTID` = 317;
public const val `XCN_OID_CMC_IDENTIFICATION`: `CERTENROLL_OBJECTID` = 306;
public const val `XCN_OID_CMC_IDENTITY_PROOF`: `CERTENROLL_OBJECTID` = 307;
public const val `XCN_OID_CMC_ID_CONFIRM_CERT_ACCEPTANCE`: `CERTENROLL_OBJECTID` = 324;
public const val `XCN_OID_CMC_ID_POP_LINK_RANDOM`: `CERTENROLL_OBJECTID` = 322;
public const val `XCN_OID_CMC_ID_POP_LINK_WITNESS`: `CERTENROLL_OBJECTID` = 323;
public const val `XCN_OID_CMC_LRA_POP_WITNESS`: `CERTENROLL_OBJECTID` = 315;
public const val `XCN_OID_CMC_QUERY_PENDING`: `CERTENROLL_OBJECTID` = 321;
public const val `XCN_OID_CMC_RECIPIENT_NONCE`: `CERTENROLL_OBJECTID` = 311;
public const val `XCN_OID_CMC_REG_INFO`: `CERTENROLL_OBJECTID` = 319;
public const val `XCN_OID_CMC_RESPONSE_INFO`: `CERTENROLL_OBJECTID` = 320;
public const val `XCN_OID_CMC_REVOKE_REQUEST`: `CERTENROLL_OBJECTID` = 318;
public const val `XCN_OID_CMC_SENDER_NONCE`: `CERTENROLL_OBJECTID` = 310;
public const val `XCN_OID_CMC_STATUS_INFO`: `CERTENROLL_OBJECTID` = 305;
public const val `XCN_OID_CMC_TRANSACTION_ID`: `CERTENROLL_OBJECTID` = 309;
public const val `XCN_OID_COMMON_NAME`: `CERTENROLL_OBJECTID` = 121;
public const val `XCN_OID_COUNTRY_NAME`: `CERTENROLL_OBJECTID` = 124;
public const val `XCN_OID_CRL_DIST_POINTS`: `CERTENROLL_OBJECTID` = 187;
public const val `XCN_OID_CRL_NEXT_PUBLISH`: `CERTENROLL_OBJECTID` = 223;
public const val `XCN_OID_CRL_NUMBER`: `CERTENROLL_OBJECTID` = 189;
public const val `XCN_OID_CRL_REASON_CODE`: `CERTENROLL_OBJECTID` = 185;
public const val `XCN_OID_CRL_SELF_CDP`: `CERTENROLL_OBJECTID` = 233;
public const val `XCN_OID_CRL_VIRTUAL_BASE`: `CERTENROLL_OBJECTID` = 222;
public const val `XCN_OID_CROSS_CERTIFICATE_PAIR`: `CERTENROLL_OBJECTID` = 158;
public const val `XCN_OID_CROSS_CERT_DIST_POINTS`: `CERTENROLL_OBJECTID` = 210;
public const val `XCN_OID_CTL`: `CERTENROLL_OBJECTID` = 211;
public const val `XCN_OID_CT_PKI_DATA`: `CERTENROLL_OBJECTID` = 301;
public const val `XCN_OID_CT_PKI_RESPONSE`: `CERTENROLL_OBJECTID` = 302;
public const val `XCN_OID_DELTA_CRL_INDICATOR`: `CERTENROLL_OBJECTID` = 190;
public const val `XCN_OID_DESCRIPTION`: `CERTENROLL_OBJECTID` = 131;
public const val `XCN_OID_DESTINATION_INDICATOR`: `CERTENROLL_OBJECTID` = 145;
public const val `XCN_OID_DEVICE_SERIAL_NUMBER`: `CERTENROLL_OBJECTID` = 123;
public const val `XCN_OID_DH_SINGLE_PASS_STDDH_SHA1_KDF`: `CERTENROLL_OBJECTID` = 366;
public const val `XCN_OID_DH_SINGLE_PASS_STDDH_SHA256_KDF`: `CERTENROLL_OBJECTID` = 367;
public const val `XCN_OID_DH_SINGLE_PASS_STDDH_SHA384_KDF`: `CERTENROLL_OBJECTID` = 368;
public const val `XCN_OID_DISALLOWED_HASH`: `CERTENROLL_OBJECTID` = 369;
public const val `XCN_OID_DISALLOWED_LIST`: `CERTENROLL_OBJECTID` = 370;
public const val `XCN_OID_DN_QUALIFIER`: `CERTENROLL_OBJECTID` = 161;
public const val `XCN_OID_DOMAIN_COMPONENT`: `CERTENROLL_OBJECTID` = 162;
public const val `XCN_OID_DRM`: `CERTENROLL_OBJECTID` = 273;
public const val `XCN_OID_DRM_INDIVIDUALIZATION`: `CERTENROLL_OBJECTID` = 274;
public const val `XCN_OID_DS`: `CERTENROLL_OBJECTID` = 58;
public const val `XCN_OID_DSALG`: `CERTENROLL_OBJECTID` = 59;
public const val `XCN_OID_DSALG_CRPT`: `CERTENROLL_OBJECTID` = 60;
public const val `XCN_OID_DSALG_HASH`: `CERTENROLL_OBJECTID` = 61;
public const val `XCN_OID_DSALG_RSA`: `CERTENROLL_OBJECTID` = 63;
public const val `XCN_OID_DSALG_SIGN`: `CERTENROLL_OBJECTID` = 62;
public const val `XCN_OID_DS_EMAIL_REPLICATION`: `CERTENROLL_OBJECTID` = 237;
public const val `XCN_OID_ECC_CURVE_P256`: `CERTENROLL_OBJECTID` = 371;
public const val `XCN_OID_ECC_CURVE_P384`: `CERTENROLL_OBJECTID` = 372;
public const val `XCN_OID_ECC_CURVE_P521`: `CERTENROLL_OBJECTID` = 373;
public const val `XCN_OID_ECC_PUBLIC_KEY`: `CERTENROLL_OBJECTID` = 349;
public const val `XCN_OID_ECDSA_SHA1`: `CERTENROLL_OBJECTID` = 350;
public const val `XCN_OID_ECDSA_SHA256`: `CERTENROLL_OBJECTID` = 374;
public const val `XCN_OID_ECDSA_SHA384`: `CERTENROLL_OBJECTID` = 375;
public const val `XCN_OID_ECDSA_SHA512`: `CERTENROLL_OBJECTID` = 376;
public const val `XCN_OID_ECDSA_SPECIFIED`: `CERTENROLL_OBJECTID` = 351;
public const val `XCN_OID_EFS_RECOVERY`: `CERTENROLL_OBJECTID` = 260;
public const val `XCN_OID_EMBEDDED_NT_CRYPTO`: `CERTENROLL_OBJECTID` = 264;
public const val `XCN_OID_ENCRYPTED_KEY_HASH`: `CERTENROLL_OBJECTID` = 239;
public const val `XCN_OID_ENHANCED_KEY_USAGE`: `CERTENROLL_OBJECTID` = 188;
public const val `XCN_OID_ENROLLMENT_AGENT`: `CERTENROLL_OBJECTID` = 201;
public const val `XCN_OID_ENROLLMENT_CSP_PROVIDER`: `CERTENROLL_OBJECTID` = 199;
public const val `XCN_OID_ENROLLMENT_NAME_VALUE_PAIR`: `CERTENROLL_OBJECTID` = 198;
public const val `XCN_OID_ENROLL_ATTESTATION_CHALLENGE`: `CERTENROLL_OBJECTID` = 435;
public const val `XCN_OID_ENROLL_ATTESTATION_STATEMENT`: `CERTENROLL_OBJECTID` = 436;
public const val `XCN_OID_ENROLL_CAXCHGCERT_HASH`: `CERTENROLL_OBJECTID` = 377;
public const val `XCN_OID_ENROLL_CERTTYPE_EXTENSION`: `CERTENROLL_OBJECTID` = 218;
public const val `XCN_OID_ENROLL_EKPUB_CHALLENGE`: `CERTENROLL_OBJECTID` = 379;
public const val `XCN_OID_ENROLL_EKVERIFYCERT`: `CERTENROLL_OBJECTID` = 380;
public const val `XCN_OID_ENROLL_EKVERIFYCREDS`: `CERTENROLL_OBJECTID` = 381;
public const val `XCN_OID_ENROLL_EKVERIFYKEY`: `CERTENROLL_OBJECTID` = 382;
public const val `XCN_OID_ENROLL_EK_INFO`: `CERTENROLL_OBJECTID` = 378;
public const val `XCN_OID_ENROLL_ENCRYPTION_ALGORITHM`: `CERTENROLL_OBJECTID` = 437;
public const val `XCN_OID_ENROLL_KSP_NAME`: `CERTENROLL_OBJECTID` = 438;
public const val `XCN_OID_ENROLL_SCEP_ERROR`: `CERTENROLL_OBJECTID` = 428;
public const val `XCN_OID_ENTERPRISE_OID_ROOT`: `CERTENROLL_OBJECTID` = 227;
public const val `XCN_OID_EV_RDN_COUNTRY`: `CERTENROLL_OBJECTID` = 383;
public const val `XCN_OID_EV_RDN_LOCALE`: `CERTENROLL_OBJECTID` = 384;
public const val `XCN_OID_EV_RDN_STATE_OR_PROVINCE`: `CERTENROLL_OBJECTID` = 385;
public const val `XCN_OID_FACSIMILE_TELEPHONE_NUMBER`: `CERTENROLL_OBJECTID` = 141;
public const val `XCN_OID_FRESHEST_CRL`: `CERTENROLL_OBJECTID` = 192;
public const val `XCN_OID_GIVEN_NAME`: `CERTENROLL_OBJECTID` = 159;
public const val `XCN_OID_INFOSEC`: `CERTENROLL_OBJECTID` = 99;
public const val `XCN_OID_INFOSEC_SuiteAConfidentiality`: `CERTENROLL_OBJECTID` = 113;
public const val `XCN_OID_INFOSEC_SuiteAIntegrity`: `CERTENROLL_OBJECTID` = 114;
public const val `XCN_OID_INFOSEC_SuiteAKMandSig`: `CERTENROLL_OBJECTID` = 117;
public const val `XCN_OID_INFOSEC_SuiteAKeyManagement`: `CERTENROLL_OBJECTID` = 116;
public const val `XCN_OID_INFOSEC_SuiteASignature`: `CERTENROLL_OBJECTID` = 112;
public const val `XCN_OID_INFOSEC_SuiteATokenProtection`: `CERTENROLL_OBJECTID` = 115;
public const val `XCN_OID_INFOSEC_mosaicConfidentiality`: `CERTENROLL_OBJECTID` = 103;
public const val `XCN_OID_INFOSEC_mosaicIntegrity`: `CERTENROLL_OBJECTID` = 105;
public const val `XCN_OID_INFOSEC_mosaicKMandSig`: `CERTENROLL_OBJECTID` = 111;
public const val `XCN_OID_INFOSEC_mosaicKMandUpdSig`: `CERTENROLL_OBJECTID` = 119;
public const val `XCN_OID_INFOSEC_mosaicKeyManagement`: `CERTENROLL_OBJECTID` = 109;
public const val `XCN_OID_INFOSEC_mosaicSignature`: `CERTENROLL_OBJECTID` = 101;
public const val `XCN_OID_INFOSEC_mosaicTokenProtection`: `CERTENROLL_OBJECTID` = 107;
public const val `XCN_OID_INFOSEC_mosaicUpdatedInteg`: `CERTENROLL_OBJECTID` = 120;
public const val `XCN_OID_INFOSEC_mosaicUpdatedSig`: `CERTENROLL_OBJECTID` = 118;
public const val `XCN_OID_INFOSEC_sdnsConfidentiality`: `CERTENROLL_OBJECTID` = 102;
public const val `XCN_OID_INFOSEC_sdnsIntegrity`: `CERTENROLL_OBJECTID` = 104;
public const val `XCN_OID_INFOSEC_sdnsKMandSig`: `CERTENROLL_OBJECTID` = 110;
public const val `XCN_OID_INFOSEC_sdnsKeyManagement`: `CERTENROLL_OBJECTID` = 108;
public const val `XCN_OID_INFOSEC_sdnsSignature`: `CERTENROLL_OBJECTID` = 100;
public const val `XCN_OID_INFOSEC_sdnsTokenProtection`: `CERTENROLL_OBJECTID` = 106;
public const val `XCN_OID_INHIBIT_ANY_POLICY`: `CERTENROLL_OBJECTID` = 386;
public const val `XCN_OID_INITIALS`: `CERTENROLL_OBJECTID` = 160;
public const val `XCN_OID_INTERNATIONALIZED_EMAIL_ADDRESS`: `CERTENROLL_OBJECTID` = 387;
public const val `XCN_OID_INTERNATIONAL_ISDN_NUMBER`: `CERTENROLL_OBJECTID` = 143;
public const val `XCN_OID_IPSEC_KP_IKE_INTERMEDIATE`: `CERTENROLL_OBJECTID` = 254;
public const val `XCN_OID_ISSUED_CERT_HASH`: `CERTENROLL_OBJECTID` = 236;
public const val `XCN_OID_ISSUER_ALT_NAME`: `CERTENROLL_OBJECTID` = 174;
public const val `XCN_OID_ISSUER_ALT_NAME2`: `CERTENROLL_OBJECTID` = 184;
public const val `XCN_OID_ISSUING_DIST_POINT`: `CERTENROLL_OBJECTID` = 191;
public const val `XCN_OID_KEYID_RDN`: `CERTENROLL_OBJECTID` = 168;
public const val `XCN_OID_KEY_ATTRIBUTES`: `CERTENROLL_OBJECTID` = 170;
public const val `XCN_OID_KEY_USAGE`: `CERTENROLL_OBJECTID` = 176;
public const val `XCN_OID_KEY_USAGE_RESTRICTION`: `CERTENROLL_OBJECTID` = 172;
public const val `XCN_OID_KP_CA_EXCHANGE`: `CERTENROLL_OBJECTID` = 224;
public const val `XCN_OID_KP_CSP_SIGNATURE`: `CERTENROLL_OBJECTID` = 272;
public const val `XCN_OID_KP_CTL_USAGE_SIGNING`: `CERTENROLL_OBJECTID` = 255;
public const val `XCN_OID_KP_DOCUMENT_SIGNING`: `CERTENROLL_OBJECTID` = 268;
public const val `XCN_OID_KP_EFS`: `CERTENROLL_OBJECTID` = 259;
public const val `XCN_OID_KP_KERNEL_MODE_CODE_SIGNING`: `CERTENROLL_OBJECTID` = 388;
public const val `XCN_OID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING`: `CERTENROLL_OBJECTID` = 389;
public const val `XCN_OID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING`: `CERTENROLL_OBJECTID` = 390;
public const val `XCN_OID_KP_KEY_RECOVERY`: `CERTENROLL_OBJECTID` = 267;
public const val `XCN_OID_KP_KEY_RECOVERY_AGENT`: `CERTENROLL_OBJECTID` = 225;
public const val `XCN_OID_KP_LIFETIME_SIGNING`: `CERTENROLL_OBJECTID` = 269;
public const val `XCN_OID_KP_MOBILE_DEVICE_SOFTWARE`: `CERTENROLL_OBJECTID` = 270;
public const val `XCN_OID_KP_QUALIFIED_SUBORDINATION`: `CERTENROLL_OBJECTID` = 266;
public const val `XCN_OID_KP_SMARTCARD_LOGON`: `CERTENROLL_OBJECTID` = 277;
public const val `XCN_OID_KP_SMART_DISPLAY`: `CERTENROLL_OBJECTID` = 271;
public const val `XCN_OID_KP_TIME_STAMP_SIGNING`: `CERTENROLL_OBJECTID` = 256;
public const val `XCN_OID_KP_TPM_AIK_CERTIFICATE`: `CERTENROLL_OBJECTID` = 391;
public const val `XCN_OID_KP_TPM_EK_CERTIFICATE`: `CERTENROLL_OBJECTID` = 392;
public const val `XCN_OID_KP_TPM_PLATFORM_CERTIFICATE`: `CERTENROLL_OBJECTID` = 393;
public const val `XCN_OID_LEGACY_POLICY_MAPPINGS`: `CERTENROLL_OBJECTID` = 195;
public const val `XCN_OID_LICENSES`: `CERTENROLL_OBJECTID` = 275;
public const val `XCN_OID_LICENSE_SERVER`: `CERTENROLL_OBJECTID` = 276;
public const val `XCN_OID_LOCALITY_NAME`: `CERTENROLL_OBJECTID` = 125;
public const val `XCN_OID_LOCAL_MACHINE_KEYSET`: `CERTENROLL_OBJECTID` = 166;
public const val `XCN_OID_LOGOTYPE_EXT`: `CERTENROLL_OBJECTID` = 206;
public const val `XCN_OID_LOYALTY_OTHER_LOGOTYPE`: `CERTENROLL_OBJECTID` = 326;
public const val `XCN_OID_MEMBER`: `CERTENROLL_OBJECTID` = 149;
public const val `XCN_OID_NAME_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 193;
public const val `XCN_OID_NETSCAPE`: `CERTENROLL_OBJECTID` = 289;
public const val `XCN_OID_NETSCAPE_BASE_URL`: `CERTENROLL_OBJECTID` = 292;
public const val `XCN_OID_NETSCAPE_CA_POLICY_URL`: `CERTENROLL_OBJECTID` = 296;
public const val `XCN_OID_NETSCAPE_CA_REVOCATION_URL`: `CERTENROLL_OBJECTID` = 294;
public const val `XCN_OID_NETSCAPE_CERT_EXTENSION`: `CERTENROLL_OBJECTID` = 290;
public const val `XCN_OID_NETSCAPE_CERT_RENEWAL_URL`: `CERTENROLL_OBJECTID` = 295;
public const val `XCN_OID_NETSCAPE_CERT_SEQUENCE`: `CERTENROLL_OBJECTID` = 300;
public const val `XCN_OID_NETSCAPE_CERT_TYPE`: `CERTENROLL_OBJECTID` = 291;
public const val `XCN_OID_NETSCAPE_COMMENT`: `CERTENROLL_OBJECTID` = 298;
public const val `XCN_OID_NETSCAPE_DATA_TYPE`: `CERTENROLL_OBJECTID` = 299;
public const val `XCN_OID_NETSCAPE_REVOCATION_URL`: `CERTENROLL_OBJECTID` = 293;
public const val `XCN_OID_NETSCAPE_SSL_SERVER_NAME`: `CERTENROLL_OBJECTID` = 297;
public const val `XCN_OID_NEXT_UPDATE_LOCATION`: `CERTENROLL_OBJECTID` = 208;
public const val `XCN_OID_NIST_AES128_CBC`: `CERTENROLL_OBJECTID` = 394;
public const val `XCN_OID_NIST_AES128_WRAP`: `CERTENROLL_OBJECTID` = 395;
public const val `XCN_OID_NIST_AES192_CBC`: `CERTENROLL_OBJECTID` = 396;
public const val `XCN_OID_NIST_AES192_WRAP`: `CERTENROLL_OBJECTID` = 397;
public const val `XCN_OID_NIST_AES256_CBC`: `CERTENROLL_OBJECTID` = 398;
public const val `XCN_OID_NIST_AES256_WRAP`: `CERTENROLL_OBJECTID` = 399;
public const val `XCN_OID_NIST_sha256`: `CERTENROLL_OBJECTID` = 345;
public const val `XCN_OID_NIST_sha384`: `CERTENROLL_OBJECTID` = 346;
public const val `XCN_OID_NIST_sha512`: `CERTENROLL_OBJECTID` = 347;
public const val `XCN_OID_NONE`: `CERTENROLL_OBJECTID` = 0;
public const val `XCN_OID_NT5_CRYPTO`: `CERTENROLL_OBJECTID` = 262;
public const val `XCN_OID_NTDS_REPLICATION`: `CERTENROLL_OBJECTID` = 241;
public const val `XCN_OID_NT_PRINCIPAL_NAME`: `CERTENROLL_OBJECTID` = 214;
public const val `XCN_OID_OEM_WHQL_CRYPTO`: `CERTENROLL_OBJECTID` = 263;
public const val `XCN_OID_OIW`: `CERTENROLL_OBJECTID` = 64;
public const val `XCN_OID_OIWDIR`: `CERTENROLL_OBJECTID` = 93;
public const val `XCN_OID_OIWDIR_CRPT`: `CERTENROLL_OBJECTID` = 94;
public const val `XCN_OID_OIWDIR_HASH`: `CERTENROLL_OBJECTID` = 95;
public const val `XCN_OID_OIWDIR_SIGN`: `CERTENROLL_OBJECTID` = 96;
public const val `XCN_OID_OIWDIR_md2`: `CERTENROLL_OBJECTID` = 97;
public const val `XCN_OID_OIWDIR_md2RSA`: `CERTENROLL_OBJECTID` = 98;
public const val `XCN_OID_OIWSEC`: `CERTENROLL_OBJECTID` = 65;
public const val `XCN_OID_OIWSEC_desCBC`: `CERTENROLL_OBJECTID` = 70;
public const val `XCN_OID_OIWSEC_desCFB`: `CERTENROLL_OBJECTID` = 72;
public const val `XCN_OID_OIWSEC_desECB`: `CERTENROLL_OBJECTID` = 69;
public const val `XCN_OID_OIWSEC_desEDE`: `CERTENROLL_OBJECTID` = 80;
public const val `XCN_OID_OIWSEC_desMAC`: `CERTENROLL_OBJECTID` = 73;
public const val `XCN_OID_OIWSEC_desOFB`: `CERTENROLL_OBJECTID` = 71;
public const val `XCN_OID_OIWSEC_dhCommMod`: `CERTENROLL_OBJECTID` = 79;
public const val `XCN_OID_OIWSEC_dsa`: `CERTENROLL_OBJECTID` = 75;
public const val `XCN_OID_OIWSEC_dsaComm`: `CERTENROLL_OBJECTID` = 83;
public const val `XCN_OID_OIWSEC_dsaCommSHA`: `CERTENROLL_OBJECTID` = 84;
public const val `XCN_OID_OIWSEC_dsaCommSHA1`: `CERTENROLL_OBJECTID` = 91;
public const val `XCN_OID_OIWSEC_dsaSHA1`: `CERTENROLL_OBJECTID` = 90;
public const val `XCN_OID_OIWSEC_keyHashSeal`: `CERTENROLL_OBJECTID` = 86;
public const val `XCN_OID_OIWSEC_md2RSASign`: `CERTENROLL_OBJECTID` = 87;
public const val `XCN_OID_OIWSEC_md4RSA`: `CERTENROLL_OBJECTID` = 66;
public const val `XCN_OID_OIWSEC_md4RSA2`: `CERTENROLL_OBJECTID` = 68;
public const val `XCN_OID_OIWSEC_md5RSA`: `CERTENROLL_OBJECTID` = 67;
public const val `XCN_OID_OIWSEC_md5RSASign`: `CERTENROLL_OBJECTID` = 88;
public const val `XCN_OID_OIWSEC_mdc2`: `CERTENROLL_OBJECTID` = 82;
public const val `XCN_OID_OIWSEC_mdc2RSA`: `CERTENROLL_OBJECTID` = 77;
public const val `XCN_OID_OIWSEC_rsaSign`: `CERTENROLL_OBJECTID` = 74;
public const val `XCN_OID_OIWSEC_rsaXchg`: `CERTENROLL_OBJECTID` = 85;
public const val `XCN_OID_OIWSEC_sha`: `CERTENROLL_OBJECTID` = 81;
public const val `XCN_OID_OIWSEC_sha1`: `CERTENROLL_OBJECTID` = 89;
public const val `XCN_OID_OIWSEC_sha1RSASign`: `CERTENROLL_OBJECTID` = 92;
public const val `XCN_OID_OIWSEC_shaDSA`: `CERTENROLL_OBJECTID` = 76;
public const val `XCN_OID_OIWSEC_shaRSA`: `CERTENROLL_OBJECTID` = 78;
public const val `XCN_OID_ORGANIZATIONAL_UNIT_NAME`: `CERTENROLL_OBJECTID` = 129;
public const val `XCN_OID_ORGANIZATION_NAME`: `CERTENROLL_OBJECTID` = 128;
public const val `XCN_OID_OS_VERSION`: `CERTENROLL_OBJECTID` = 200;
public const val `XCN_OID_OWNER`: `CERTENROLL_OBJECTID` = 150;
public const val `XCN_OID_PHYSICAL_DELIVERY_OFFICE_NAME`: `CERTENROLL_OBJECTID` = 137;
public const val `XCN_OID_PKCS`: `CERTENROLL_OBJECTID` = 2;
public const val `XCN_OID_PKCS_1`: `CERTENROLL_OBJECTID` = 5;
public const val `XCN_OID_PKCS_10`: `CERTENROLL_OBJECTID` = 14;
public const val `XCN_OID_PKCS_12`: `CERTENROLL_OBJECTID` = 15;
public const val `XCN_OID_PKCS_12_EXTENDED_ATTRIBUTES`: `CERTENROLL_OBJECTID` = 167;
public const val `XCN_OID_PKCS_12_FRIENDLY_NAME_ATTR`: `CERTENROLL_OBJECTID` = 163;
public const val `XCN_OID_PKCS_12_KEY_PROVIDER_NAME_ATTR`: `CERTENROLL_OBJECTID` = 165;
public const val `XCN_OID_PKCS_12_LOCAL_KEY_ID`: `CERTENROLL_OBJECTID` = 164;
public const val `XCN_OID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID`: `CERTENROLL_OBJECTID` = 407;
public const val `XCN_OID_PKCS_12_PbeIds`: `CERTENROLL_OBJECTID` = 400;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And128BitRC2`: `CERTENROLL_OBJECTID` = 401;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And128BitRC4`: `CERTENROLL_OBJECTID` = 402;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And2KeyTripleDES`: `CERTENROLL_OBJECTID` = 403;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And3KeyTripleDES`: `CERTENROLL_OBJECTID` = 404;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And40BitRC2`: `CERTENROLL_OBJECTID` = 405;
public const val `XCN_OID_PKCS_12_pbeWithSHA1And40BitRC4`: `CERTENROLL_OBJECTID` = 406;
public const val `XCN_OID_PKCS_2`: `CERTENROLL_OBJECTID` = 6;
public const val `XCN_OID_PKCS_3`: `CERTENROLL_OBJECTID` = 7;
public const val `XCN_OID_PKCS_4`: `CERTENROLL_OBJECTID` = 8;
public const val `XCN_OID_PKCS_5`: `CERTENROLL_OBJECTID` = 9;
public const val `XCN_OID_PKCS_6`: `CERTENROLL_OBJECTID` = 10;
public const val `XCN_OID_PKCS_7`: `CERTENROLL_OBJECTID` = 11;
public const val `XCN_OID_PKCS_7_DATA`: `CERTENROLL_OBJECTID` = 329;
public const val `XCN_OID_PKCS_7_DIGESTED`: `CERTENROLL_OBJECTID` = 333;
public const val `XCN_OID_PKCS_7_ENCRYPTED`: `CERTENROLL_OBJECTID` = 334;
public const val `XCN_OID_PKCS_7_ENVELOPED`: `CERTENROLL_OBJECTID` = 331;
public const val `XCN_OID_PKCS_7_SIGNED`: `CERTENROLL_OBJECTID` = 330;
public const val `XCN_OID_PKCS_7_SIGNEDANDENVELOPED`: `CERTENROLL_OBJECTID` = 332;
public const val `XCN_OID_PKCS_8`: `CERTENROLL_OBJECTID` = 12;
public const val `XCN_OID_PKCS_9`: `CERTENROLL_OBJECTID` = 13;
public const val `XCN_OID_PKCS_9_CONTENT_TYPE`: `CERTENROLL_OBJECTID` = 335;
public const val `XCN_OID_PKCS_9_MESSAGE_DIGEST`: `CERTENROLL_OBJECTID` = 336;
public const val `XCN_OID_PKINIT_KP_KDC`: `CERTENROLL_OBJECTID` = 408;
public const val `XCN_OID_PKIX`: `CERTENROLL_OBJECTID` = 202;
public const val `XCN_OID_PKIX_ACC_DESCR`: `CERTENROLL_OBJECTID` = 282;
public const val `XCN_OID_PKIX_CA_ISSUERS`: `CERTENROLL_OBJECTID` = 284;
public const val `XCN_OID_PKIX_CA_REPOSITORY`: `CERTENROLL_OBJECTID` = 409;
public const val `XCN_OID_PKIX_KP`: `CERTENROLL_OBJECTID` = 243;
public const val `XCN_OID_PKIX_KP_CLIENT_AUTH`: `CERTENROLL_OBJECTID` = 245;
public const val `XCN_OID_PKIX_KP_CODE_SIGNING`: `CERTENROLL_OBJECTID` = 246;
public const val `XCN_OID_PKIX_KP_EMAIL_PROTECTION`: `CERTENROLL_OBJECTID` = 247;
public const val `XCN_OID_PKIX_KP_IPSEC_END_SYSTEM`: `CERTENROLL_OBJECTID` = 248;
public const val `XCN_OID_PKIX_KP_IPSEC_TUNNEL`: `CERTENROLL_OBJECTID` = 249;
public const val `XCN_OID_PKIX_KP_IPSEC_USER`: `CERTENROLL_OBJECTID` = 250;
public const val `XCN_OID_PKIX_KP_OCSP_SIGNING`: `CERTENROLL_OBJECTID` = 252;
public const val `XCN_OID_PKIX_KP_SERVER_AUTH`: `CERTENROLL_OBJECTID` = 244;
public const val `XCN_OID_PKIX_KP_TIMESTAMP_SIGNING`: `CERTENROLL_OBJECTID` = 251;
public const val `XCN_OID_PKIX_NO_SIGNATURE`: `CERTENROLL_OBJECTID` = 303;
public const val `XCN_OID_PKIX_OCSP`: `CERTENROLL_OBJECTID` = 283;
public const val `XCN_OID_PKIX_OCSP_BASIC_SIGNED_RESPONSE`: `CERTENROLL_OBJECTID` = 328;
public const val `XCN_OID_PKIX_OCSP_NOCHECK`: `CERTENROLL_OBJECTID` = 253;
public const val `XCN_OID_PKIX_OCSP_NONCE`: `CERTENROLL_OBJECTID` = 410;
public const val `XCN_OID_PKIX_PE`: `CERTENROLL_OBJECTID` = 203;
public const val `XCN_OID_PKIX_POLICY_QUALIFIER_CPS`: `CERTENROLL_OBJECTID` = 279;
public const val `XCN_OID_PKIX_POLICY_QUALIFIER_USERNOTICE`: `CERTENROLL_OBJECTID` = 280;
public const val `XCN_OID_PKIX_TIME_STAMPING`: `CERTENROLL_OBJECTID` = 411;
public const val `XCN_OID_POLICY_CONSTRAINTS`: `CERTENROLL_OBJECTID` = 196;
public const val `XCN_OID_POLICY_MAPPINGS`: `CERTENROLL_OBJECTID` = 194;
public const val `XCN_OID_POSTAL_ADDRESS`: `CERTENROLL_OBJECTID` = 134;
public const val `XCN_OID_POSTAL_CODE`: `CERTENROLL_OBJECTID` = 135;
public const val `XCN_OID_POST_OFFICE_BOX`: `CERTENROLL_OBJECTID` = 136;
public const val `XCN_OID_PREFERRED_DELIVERY_METHOD`: `CERTENROLL_OBJECTID` = 146;
public const val `XCN_OID_PRESENTATION_ADDRESS`: `CERTENROLL_OBJECTID` = 147;
public const val `XCN_OID_PRIVATEKEY_USAGE_PERIOD`: `CERTENROLL_OBJECTID` = 177;
public const val `XCN_OID_PRODUCT_UPDATE`: `CERTENROLL_OBJECTID` = 215;
public const val `XCN_OID_QC_EU_COMPLIANCE`: `CERTENROLL_OBJECTID` = 412;
public const val `XCN_OID_QC_SSCD`: `CERTENROLL_OBJECTID` = 413;
public const val `XCN_OID_QC_STATEMENTS_EXT`: `CERTENROLL_OBJECTID` = 414;
public const val `XCN_OID_RDN_DUMMY_SIGNER`: `CERTENROLL_OBJECTID` = 228;
public const val `XCN_OID_RDN_TPM_MANUFACTURER`: `CERTENROLL_OBJECTID` = 415;
public const val `XCN_OID_RDN_TPM_MODEL`: `CERTENROLL_OBJECTID` = 416;
public const val `XCN_OID_RDN_TPM_VERSION`: `CERTENROLL_OBJECTID` = 417;
public const val `XCN_OID_REASON_CODE_HOLD`: `CERTENROLL_OBJECTID` = 186;
public const val `XCN_OID_REGISTERED_ADDRESS`: `CERTENROLL_OBJECTID` = 144;
public const val `XCN_OID_REMOVE_CERTIFICATE`: `CERTENROLL_OBJECTID` = 209;
public const val `XCN_OID_RENEWAL_CERTIFICATE`: `CERTENROLL_OBJECTID` = 197;
public const val `XCN_OID_REQUEST_CLIENT_INFO`: `CERTENROLL_OBJECTID` = 238;
public const val `XCN_OID_REQUIRE_CERT_CHAIN_POLICY`: `CERTENROLL_OBJECTID` = 234;
public const val `XCN_OID_REVOKED_LIST_SIGNER`: `CERTENROLL_OBJECTID` = 418;
public const val `XCN_OID_RFC3161_counterSign`: `CERTENROLL_OBJECTID` = 419;
public const val `XCN_OID_ROLE_OCCUPANT`: `CERTENROLL_OBJECTID` = 151;
public const val `XCN_OID_ROOT_LIST_SIGNER`: `CERTENROLL_OBJECTID` = 265;
public const val `XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION`: `CERTENROLL_OBJECTID` = 420;
public const val `XCN_OID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION`: `CERTENROLL_OBJECTID` = 421;
public const val `XCN_OID_ROOT_PROGRAM_FLAGS`: `CERTENROLL_OBJECTID` = 422;
public const val `XCN_OID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL`: `CERTENROLL_OBJECTID` = 423;
public const val `XCN_OID_RSA`: `CERTENROLL_OBJECTID` = 1;
public const val `XCN_OID_RSAES_OAEP`: `CERTENROLL_OBJECTID` = 425;
public const val `XCN_OID_RSA_DES_EDE3_CBC`: `CERTENROLL_OBJECTID` = 51;
public const val `XCN_OID_RSA_DH`: `CERTENROLL_OBJECTID` = 22;
public const val `XCN_OID_RSA_ENCRYPT`: `CERTENROLL_OBJECTID` = 4;
public const val `XCN_OID_RSA_HASH`: `CERTENROLL_OBJECTID` = 3;
public const val `XCN_OID_RSA_MD2`: `CERTENROLL_OBJECTID` = 46;
public const val `XCN_OID_RSA_MD2RSA`: `CERTENROLL_OBJECTID` = 17;
public const val `XCN_OID_RSA_MD4`: `CERTENROLL_OBJECTID` = 47;
public const val `XCN_OID_RSA_MD4RSA`: `CERTENROLL_OBJECTID` = 18;
public const val `XCN_OID_RSA_MD5`: `CERTENROLL_OBJECTID` = 48;
public const val `XCN_OID_RSA_MD5RSA`: `CERTENROLL_OBJECTID` = 19;
public const val `XCN_OID_RSA_MGF1`: `CERTENROLL_OBJECTID` = 348;
public const val `XCN_OID_RSA_PSPECIFIED`: `CERTENROLL_OBJECTID` = 424;
public const val `XCN_OID_RSA_RC2CBC`: `CERTENROLL_OBJECTID` = 49;
public const val `XCN_OID_RSA_RC4`: `CERTENROLL_OBJECTID` = 50;
public const val `XCN_OID_RSA_RC5_CBCPad`: `CERTENROLL_OBJECTID` = 52;
public const val `XCN_OID_RSA_RSA`: `CERTENROLL_OBJECTID` = 16;
public const val `XCN_OID_RSA_SETOAEP_RSA`: `CERTENROLL_OBJECTID` = 21;
public const val `XCN_OID_RSA_SHA1RSA`: `CERTENROLL_OBJECTID` = 20;
public const val `XCN_OID_RSA_SHA256RSA`: `CERTENROLL_OBJECTID` = 342;
public const val `XCN_OID_RSA_SHA384RSA`: `CERTENROLL_OBJECTID` = 343;
public const val `XCN_OID_RSA_SHA512RSA`: `CERTENROLL_OBJECTID` = 344;
public const val `XCN_OID_RSA_SMIMECapabilities`: `CERTENROLL_OBJECTID` = 40;
public const val `XCN_OID_RSA_SMIMEalg`: `CERTENROLL_OBJECTID` = 42;
public const val `XCN_OID_RSA_SMIMEalgCMS3DESwrap`: `CERTENROLL_OBJECTID` = 44;
public const val `XCN_OID_RSA_SMIMEalgCMSRC2wrap`: `CERTENROLL_OBJECTID` = 45;
public const val `XCN_OID_RSA_SMIMEalgESDH`: `CERTENROLL_OBJECTID` = 43;
public const val `XCN_OID_RSA_SSA_PSS`: `CERTENROLL_OBJECTID` = 353;
public const val `XCN_OID_RSA_certExtensions`: `CERTENROLL_OBJECTID` = 39;
public const val `XCN_OID_RSA_challengePwd`: `CERTENROLL_OBJECTID` = 36;
public const val `XCN_OID_RSA_contentType`: `CERTENROLL_OBJECTID` = 32;
public const val `XCN_OID_RSA_counterSign`: `CERTENROLL_OBJECTID` = 35;
public const val `XCN_OID_RSA_data`: `CERTENROLL_OBJECTID` = 23;
public const val `XCN_OID_RSA_digestedData`: `CERTENROLL_OBJECTID` = 27;
public const val `XCN_OID_RSA_emailAddr`: `CERTENROLL_OBJECTID` = 30;
public const val `XCN_OID_RSA_encryptedData`: `CERTENROLL_OBJECTID` = 29;
public const val `XCN_OID_RSA_envelopedData`: `CERTENROLL_OBJECTID` = 25;
public const val `XCN_OID_RSA_extCertAttrs`: `CERTENROLL_OBJECTID` = 38;
public const val `XCN_OID_RSA_hashedData`: `CERTENROLL_OBJECTID` = 28;
public const val `XCN_OID_RSA_messageDigest`: `CERTENROLL_OBJECTID` = 33;
public const val `XCN_OID_RSA_preferSignedData`: `CERTENROLL_OBJECTID` = 41;
public const val `XCN_OID_RSA_signEnvData`: `CERTENROLL_OBJECTID` = 26;
public const val `XCN_OID_RSA_signedData`: `CERTENROLL_OBJECTID` = 24;
public const val `XCN_OID_RSA_signingTime`: `CERTENROLL_OBJECTID` = 34;
public const val `XCN_OID_RSA_unstructAddr`: `CERTENROLL_OBJECTID` = 37;
public const val `XCN_OID_RSA_unstructName`: `CERTENROLL_OBJECTID` = 31;
public const val `XCN_OID_SEARCH_GUIDE`: `CERTENROLL_OBJECTID` = 132;
public const val `XCN_OID_SEE_ALSO`: `CERTENROLL_OBJECTID` = 152;
public const val `XCN_OID_SERIALIZED`: `CERTENROLL_OBJECTID` = 213;
public const val `XCN_OID_SERVER_GATED_CRYPTO`: `CERTENROLL_OBJECTID` = 257;
public const val `XCN_OID_SGC_NETSCAPE`: `CERTENROLL_OBJECTID` = 258;
public const val `XCN_OID_SORTED_CTL`: `CERTENROLL_OBJECTID` = 212;
public const val `XCN_OID_STATE_OR_PROVINCE_NAME`: `CERTENROLL_OBJECTID` = 126;
public const val `XCN_OID_STREET_ADDRESS`: `CERTENROLL_OBJECTID` = 127;
public const val `XCN_OID_SUBJECT_ALT_NAME`: `CERTENROLL_OBJECTID` = 173;
public const val `XCN_OID_SUBJECT_ALT_NAME2`: `CERTENROLL_OBJECTID` = 183;
public const val `XCN_OID_SUBJECT_DIR_ATTRS`: `CERTENROLL_OBJECTID` = 242;
public const val `XCN_OID_SUBJECT_INFO_ACCESS`: `CERTENROLL_OBJECTID` = 426;
public const val `XCN_OID_SUBJECT_KEY_IDENTIFIER`: `CERTENROLL_OBJECTID` = 182;
public const val `XCN_OID_SUPPORTED_APPLICATION_CONTEXT`: `CERTENROLL_OBJECTID` = 148;
public const val `XCN_OID_SUR_NAME`: `CERTENROLL_OBJECTID` = 122;
public const val `XCN_OID_TELEPHONE_NUMBER`: `CERTENROLL_OBJECTID` = 138;
public const val `XCN_OID_TELETEXT_TERMINAL_IDENTIFIER`: `CERTENROLL_OBJECTID` = 140;
public const val `XCN_OID_TELEX_NUMBER`: `CERTENROLL_OBJECTID` = 139;
public const val `XCN_OID_TIMESTAMP_TOKEN`: `CERTENROLL_OBJECTID` = 427;
public const val `XCN_OID_TITLE`: `CERTENROLL_OBJECTID` = 130;
public const val `XCN_OID_USER_CERTIFICATE`: `CERTENROLL_OBJECTID` = 154;
public const val `XCN_OID_USER_PASSWORD`: `CERTENROLL_OBJECTID` = 153;
public const val `XCN_OID_VERISIGN_BITSTRING_6_13`: `CERTENROLL_OBJECTID` = 287;
public const val `XCN_OID_VERISIGN_ISS_STRONG_CRYPTO`: `CERTENROLL_OBJECTID` = 288;
public const val `XCN_OID_VERISIGN_ONSITE_JURISDICTION_HASH`: `CERTENROLL_OBJECTID` = 286;
public const val `XCN_OID_VERISIGN_PRIVATE_6_9`: `CERTENROLL_OBJECTID` = 285;
public const val `XCN_OID_WHQL_CRYPTO`: `CERTENROLL_OBJECTID` = 261;
public const val `XCN_OID_X21_ADDRESS`: `CERTENROLL_OBJECTID` = 142;
public const val `XCN_OID_X957`: `CERTENROLL_OBJECTID` = 55;
public const val `XCN_OID_X957_DSA`: `CERTENROLL_OBJECTID` = 56;
public const val `XCN_OID_X957_SHA1DSA`: `CERTENROLL_OBJECTID` = 57;
public const val `XCN_OID_YESNO_TRUST_ATTR`: `CERTENROLL_OBJECTID` = 278;
public const val `XCN_PROPERTYID_NONE`: `CERTENROLL_PROPERTYID` = 0;
public const val `XCN_PROV_DH_SCHANNEL`: `X509ProviderType` = 18;
public const val `XCN_PROV_DSS`: `X509ProviderType` = 3;
public const val `XCN_PROV_DSS_DH`: `X509ProviderType` = 13;
public const val `XCN_PROV_EC_ECDSA_FULL`: `X509ProviderType` = 16;
public const val `XCN_PROV_EC_ECDSA_SIG`: `X509ProviderType` = 14;
public const val `XCN_PROV_EC_ECNRA_FULL`: `X509ProviderType` = 17;
public const val `XCN_PROV_EC_ECNRA_SIG`: `X509ProviderType` = 15;
public const val `XCN_PROV_FORTEZZA`: `X509ProviderType` = 4;
public const val `XCN_PROV_INTEL_SEC`: `X509ProviderType` = 22;
public const val `XCN_PROV_MS_EXCHANGE`: `X509ProviderType` = 5;
public const val `XCN_PROV_NONE`: `X509ProviderType` = 0;
public const val `XCN_PROV_REPLACE_OWF`: `X509ProviderType` = 23;
public const val `XCN_PROV_RNG`: `X509ProviderType` = 21;
public const val `XCN_PROV_RSA_AES`: `X509ProviderType` = 24;
public const val `XCN_PROV_RSA_FULL`: `X509ProviderType` = 1;
public const val `XCN_PROV_RSA_SCHANNEL`: `X509ProviderType` = 12;
public const val `XCN_PROV_RSA_SIG`: `X509ProviderType` = 2;
public const val `XCN_PROV_SPYRUS_LYNKS`: `X509ProviderType` = 20;
public const val `XCN_PROV_SSL`: `X509ProviderType` = 6;
public const val `XECI_AUTOENROLL`: UInt = 2u;
public const val `XECI_CERTREQ`: UInt = 4u;
public const val `XECI_DISABLE`: UInt = 0u;
public const val `XECI_REQWIZARD`: UInt = 3u;
public const val `XECI_XENROLL`: UInt = 1u;
public const val `XECP_STRING_PROPERTY`: UInt = 1u;
public const val `XECR_CMC`: `CERT_CREATE_REQUEST_FLAGS` = 3;
public const val `XECR_PKCS10_V1_5`: `CERT_CREATE_REQUEST_FLAGS` = 4;
public const val `XECR_PKCS10_V2_0`: `CERT_CREATE_REQUEST_FLAGS` = 1;
public const val `XECR_PKCS7`: `CERT_CREATE_REQUEST_FLAGS` = 2;
public const val `XECT_EXTENSION_V1`: `ADDED_CERT_TYPE` = 1;
public const val `XECT_EXTENSION_V2`: `ADDED_CERT_TYPE` = 2;
public typealias `XEKL_KEYSIZE` = Int;
public const val `XEKL_KEYSIZE_DEFAULT`: UInt = 4u;
public const val `XEKL_KEYSIZE_INC`: `XEKL_KEYSIZE` = 3;
public const val `XEKL_KEYSIZE_MAX`: `XEKL_KEYSIZE` = 2;
public const val `XEKL_KEYSIZE_MIN`: `XEKL_KEYSIZE` = 1;
public typealias `XEKL_KEYSPEC` = Int;
public const val `XEKL_KEYSPEC_KEYX`: `XEKL_KEYSPEC` = 1;
public const val `XEKL_KEYSPEC_SIG`: `XEKL_KEYSPEC` = 2;
public const val `XEPR_CADNS`: `PENDING_REQUEST_DESIRED_PROPERTY` = 1;
public const val `XEPR_CAFRIENDLYNAME`: `PENDING_REQUEST_DESIRED_PROPERTY` = 3;
public const val `XEPR_CANAME`: `PENDING_REQUEST_DESIRED_PROPERTY` = 2;
public const val `XEPR_DATE`: UInt = 5u;
public const val `XEPR_ENUM_FIRST`: Int = -1;
public const val `XEPR_HASH`: `PENDING_REQUEST_DESIRED_PROPERTY` = 8;
public const val `XEPR_REQUESTID`: `PENDING_REQUEST_DESIRED_PROPERTY` = 4;
public const val `XEPR_TEMPLATENAME`: UInt = 6u;
public const val `XEPR_V1TEMPLATENAME`: UInt = 9u;
public const val `XEPR_V2TEMPLATEOID`: UInt = 16u;
public const val `XEPR_VERSION`: UInt = 7u;
public const val `dwCAXCHGOVERLAPPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwCAXCHGVALIDITYPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwCRLDELTAOVERLAPPERIODCOUNTDEFAULT`: UInt = 0u;
public const val `dwCRLDELTAPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwCRLOVERLAPPERIODCOUNTDEFAULT`: UInt = 0u;
public const val `dwCRLPERIODCOUNTDEFAULT`: UInt = 1u;
public const val `dwVALIDITYPERIODCOUNTDEFAULT_ENTERPRISE`: UInt = 2u;
public const val `dwVALIDITYPERIODCOUNTDEFAULT_ROOT`: UInt = 5u;
public const val `dwVALIDITYPERIODCOUNTDEFAULT_STANDALONE`: UInt = 1u;
// UNSUPPORTED Rust 1757:1: non-scalar type Ptr unsupported
// pub const szBACKUPANNOTATION: windows_sys::core::PCSTR = windows_sys::core::s!("Cert Server Backup Interface");

// UNSUPPORTED Rust 1758:1: non-scalar type Ptr unsupported
// pub const szDBBASENAMEPARM: windows_sys::core::PCSTR = windows_sys::core::s!("edb");

// UNSUPPORTED Rust 1759:1: non-scalar type Ptr unsupported
// pub const szNAMESEPARATORDEFAULT: windows_sys::core::PCSTR = windows_sys::core::s!("\n");

// UNSUPPORTED Rust 1760:1: non-scalar type Ptr unsupported
// pub const szPROPASNTAG: windows_sys::core::PCSTR = windows_sys::core::s!("{asn}");

// UNSUPPORTED Rust 1761:1: non-scalar type Ptr unsupported
// pub const szRESTOREANNOTATION: windows_sys::core::PCSTR = windows_sys::core::s!("Cert Server Restore Interface");

// UNSUPPORTED Rust 1762:1: non-scalar type Ptr unsupported
// pub const wszAT_EKCERTINF: windows_sys::core::PCWSTR = windows_sys::core::w!("@EKCert");

// UNSUPPORTED Rust 1763:1: non-scalar type Ptr unsupported
// pub const wszAT_TESTROOT: windows_sys::core::PCWSTR = windows_sys::core::w!("@TestRoot");

// UNSUPPORTED Rust 1764:1: non-scalar type Ptr unsupported
// pub const wszCAPOLICYFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPolicy.inf");

// UNSUPPORTED Rust 1765:1: non-scalar type Ptr unsupported
// pub const wszCERTEXITMODULE_POSTFIX: windows_sys::core::PCWSTR = windows_sys::core::w!(".Exit");

// UNSUPPORTED Rust 1766:1: non-scalar type Ptr unsupported
// pub const wszCERTIFICATETRANSPARENCYFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateTransparencyFlags");

// UNSUPPORTED Rust 1767:1: non-scalar type Ptr unsupported
// pub const wszCERTMANAGE_SUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("Manage");

// UNSUPPORTED Rust 1768:1: non-scalar type Ptr unsupported
// pub const wszCERTPOLICYMODULE_POSTFIX: windows_sys::core::PCWSTR = windows_sys::core::w!(".Policy");

// UNSUPPORTED Rust 1769:1: non-scalar type Ptr unsupported
// pub const wszCERT_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestType");

// UNSUPPORTED Rust 1770:1: non-scalar type Ptr unsupported
// pub const wszCERT_TYPE_CLIENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Client");

// UNSUPPORTED Rust 1771:1: non-scalar type Ptr unsupported
// pub const wszCERT_TYPE_CODESIGN: windows_sys::core::PCWSTR = windows_sys::core::w!("CodeSign");

// UNSUPPORTED Rust 1772:1: non-scalar type Ptr unsupported
// pub const wszCERT_TYPE_CUSTOMER: windows_sys::core::PCWSTR = windows_sys::core::w!("SetCustomer");

// UNSUPPORTED Rust 1773:1: non-scalar type Ptr unsupported
// pub const wszCERT_TYPE_MERCHANT: windows_sys::core::PCWSTR = windows_sys::core::w!("SetMerchant");

// UNSUPPORTED Rust 1774:1: non-scalar type Ptr unsupported
// pub const wszCERT_TYPE_PAYMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("SetPayment");

// UNSUPPORTED Rust 1775:1: non-scalar type Ptr unsupported
// pub const wszCERT_TYPE_SERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("Server");

// UNSUPPORTED Rust 1776:1: non-scalar type Ptr unsupported
// pub const wszCERT_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// UNSUPPORTED Rust 1777:1: non-scalar type Ptr unsupported
// pub const wszCERT_VERSION_1: windows_sys::core::PCWSTR = windows_sys::core::w!("1");

// UNSUPPORTED Rust 1778:1: non-scalar type Ptr unsupported
// pub const wszCERT_VERSION_2: windows_sys::core::PCWSTR = windows_sys::core::w!("2");

// UNSUPPORTED Rust 1779:1: non-scalar type Ptr unsupported
// pub const wszCERT_VERSION_3: windows_sys::core::PCWSTR = windows_sys::core::w!("3");

// UNSUPPORTED Rust 1780:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTADMIN: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.Admin");

// UNSUPPORTED Rust 1781:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.Config");

// UNSUPPORTED Rust 1782:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTDBMEM: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.DBMem");

// UNSUPPORTED Rust 1783:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTENCODE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.Encode");

// UNSUPPORTED Rust 1784:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTGETCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.GetConfig");

// UNSUPPORTED Rust 1785:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTREQUEST: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.Request");

// UNSUPPORTED Rust 1786:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTSERVEREXIT: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.ServerExit");

// UNSUPPORTED Rust 1787:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTSERVERPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.ServerPolicy");

// UNSUPPORTED Rust 1788:1: non-scalar type Ptr unsupported
// pub const wszCLASS_CERTVIEW: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority.View");

// UNSUPPORTED Rust 1789:1: non-scalar type Ptr unsupported
// pub const wszCMM_PROP_COPYRIGHT: windows_sys::core::PCWSTR = windows_sys::core::w!("Copyright");

// UNSUPPORTED Rust 1790:1: non-scalar type Ptr unsupported
// pub const wszCMM_PROP_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1791:1: non-scalar type Ptr unsupported
// pub const wszCMM_PROP_DISPLAY_HWND: windows_sys::core::PCWSTR = windows_sys::core::w!("HWND");

// UNSUPPORTED Rust 1792:1: non-scalar type Ptr unsupported
// pub const wszCMM_PROP_FILEVER: windows_sys::core::PCWSTR = windows_sys::core::w!("File Version");

// UNSUPPORTED Rust 1793:1: non-scalar type Ptr unsupported
// pub const wszCMM_PROP_ISMULTITHREADED: windows_sys::core::PCWSTR = windows_sys::core::w!("IsMultiThreaded");

// UNSUPPORTED Rust 1794:1: non-scalar type Ptr unsupported
// pub const wszCMM_PROP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1795:1: non-scalar type Ptr unsupported
// pub const wszCMM_PROP_PRODUCTVER: windows_sys::core::PCWSTR = windows_sys::core::w!("Product Version");

// UNSUPPORTED Rust 1796:1: non-scalar type Ptr unsupported
// pub const wszCNGENCRYPTIONALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CNGEncryptionAlgorithm");

// UNSUPPORTED Rust 1797:1: non-scalar type Ptr unsupported
// pub const wszCNGHASHALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CNGHashAlgorithm");

// UNSUPPORTED Rust 1798:1: non-scalar type Ptr unsupported
// pub const wszCNGPUBLICKEYALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CNGPublicKeyAlgorithm");

// UNSUPPORTED Rust 1799:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_AUTHORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Authority");

// UNSUPPORTED Rust 1800:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_COMMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Comment");

// UNSUPPORTED Rust 1801:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_COMMONNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CommonName");

// UNSUPPORTED Rust 1802:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_CONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("Config");

// UNSUPPORTED Rust 1803:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_COUNTRY: windows_sys::core::PCWSTR = windows_sys::core::w!("Country");

// UNSUPPORTED Rust 1804:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1805:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_EXCHANGECERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("ExchangeCertificate");

// UNSUPPORTED Rust 1806:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

// UNSUPPORTED Rust 1807:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_LOCALITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Locality");

// UNSUPPORTED Rust 1808:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_ORGANIZATION: windows_sys::core::PCWSTR = windows_sys::core::w!("Organization");

// UNSUPPORTED Rust 1809:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_ORGUNIT: windows_sys::core::PCWSTR = windows_sys::core::w!("OrgUnit");

// UNSUPPORTED Rust 1810:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_SANITIZEDNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SanitizedName");

// UNSUPPORTED Rust 1811:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_SANITIZEDSHORTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SanitizedShortName");

// UNSUPPORTED Rust 1812:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_SERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("Server");

// UNSUPPORTED Rust 1813:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_SHORTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ShortName");

// UNSUPPORTED Rust 1814:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_SIGNATURECERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("SignatureCertificate");

// UNSUPPORTED Rust 1815:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("State");

// UNSUPPORTED Rust 1816:1: non-scalar type Ptr unsupported
// pub const wszCONFIG_WEBENROLLMENTSERVERS: windows_sys::core::PCWSTR = windows_sys::core::w!("WebEnrollmentServers");

// UNSUPPORTED Rust 1817:1: non-scalar type Ptr unsupported
// pub const wszCRLPUBLISHRETRYCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPublishRetryCount");

// UNSUPPORTED Rust 1818:1: non-scalar type Ptr unsupported
// pub const wszCRTFILENAMEEXT: windows_sys::core::PCWSTR = windows_sys::core::w!(".crt");

// UNSUPPORTED Rust 1819:1: non-scalar type Ptr unsupported
// pub const wszDATFILENAMEEXT: windows_sys::core::PCWSTR = windows_sys::core::w!(".dat");

// UNSUPPORTED Rust 1820:1: non-scalar type Ptr unsupported
// pub const wszDBBACKUPCERTBACKDAT: windows_sys::core::PCWSTR = windows_sys::core::w!("certbkxp.dat");

// UNSUPPORTED Rust 1821:1: non-scalar type Ptr unsupported
// pub const wszDBBACKUPSUBDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("DataBase");

// UNSUPPORTED Rust 1822:1: non-scalar type Ptr unsupported
// pub const wszDBFILENAMEEXT: windows_sys::core::PCWSTR = windows_sys::core::w!(".edb");

// UNSUPPORTED Rust 1823:1: non-scalar type Ptr unsupported
// pub const wszENCRYPTIONALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("EncryptionAlgorithm");

// UNSUPPORTED Rust 1824:1: non-scalar type Ptr unsupported
// pub const wszENROLLMENTAGENTRIGHTS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnrollmentAgentRights");

// UNSUPPORTED Rust 1825:1: non-scalar type Ptr unsupported
// pub const wszHASHALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("HashAlgorithm");

// UNSUPPORTED Rust 1826:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ALTERNATESIGNATUREALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AlternateSignatureAlgorithm");

// UNSUPPORTED Rust 1827:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ATTESTPRIVATEKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("AttestPrivateKey");

// UNSUPPORTED Rust 1828:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CACAPABILITIES: windows_sys::core::PCWSTR = windows_sys::core::w!("CACapabilities");

// UNSUPPORTED Rust 1829:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CACERTS: windows_sys::core::PCWSTR = windows_sys::core::w!("CACerts");

// UNSUPPORTED Rust 1830:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CATHUMBPRINT: windows_sys::core::PCWSTR = windows_sys::core::w!("CAThumbprint");

// UNSUPPORTED Rust 1831:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CCDPSYNCDELTATIME: windows_sys::core::PCWSTR = windows_sys::core::w!("SyncDeltaTime");

// UNSUPPORTED Rust 1832:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CHALLENGEPASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("ChallengePassword");

// UNSUPPORTED Rust 1833:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CONTINUE: windows_sys::core::PCWSTR = windows_sys::core::w!("_continue_");

// UNSUPPORTED Rust 1834:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CRITICAL: windows_sys::core::PCWSTR = windows_sys::core::w!("Critical");

// UNSUPPORTED Rust 1835:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CRLDELTAPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDeltaPeriodUnits");

// UNSUPPORTED Rust 1836:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CRLDELTAPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDeltaPeriod");

// UNSUPPORTED Rust 1837:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CRLPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPeriodUnits");

// UNSUPPORTED Rust 1838:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_CRLPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPeriod");

// UNSUPPORTED Rust 1839:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_DIRECTORYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DirectoryName");

// UNSUPPORTED Rust 1840:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_DNS: windows_sys::core::PCWSTR = windows_sys::core::w!("DNS");

// UNSUPPORTED Rust 1841:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters");

// UNSUPPORTED Rust 1842:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERSTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParametersType");

// UNSUPPORTED Rust 1843:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS_A: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters_A");

// UNSUPPORTED Rust 1844:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS_B: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters_B");

// UNSUPPORTED Rust 1845:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS_BASE: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters_Base");

// UNSUPPORTED Rust 1846:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS_COFACTOR: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters_Cofactor");

// UNSUPPORTED Rust 1847:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS_ORDER: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters_Order");

// UNSUPPORTED Rust 1848:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS_P: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters_P");

// UNSUPPORTED Rust 1849:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ECCKEYPARAMETERS_SEED: windows_sys::core::PCWSTR = windows_sys::core::w!("EccKeyParameters_Seed");

// UNSUPPORTED Rust 1850:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_EMAIL: windows_sys::core::PCWSTR = windows_sys::core::w!("EMail");

// UNSUPPORTED Rust 1851:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_EMPTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Empty");

// UNSUPPORTED Rust 1852:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ENABLEKEYCOUNTING: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableKeyCounting");

// UNSUPPORTED Rust 1853:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ENCRYPTIONALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("EncryptionAlgorithm");

// UNSUPPORTED Rust 1854:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_ENCRYPTIONLENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("EncryptionLength");

// UNSUPPORTED Rust 1855:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_EXCLUDE: windows_sys::core::PCWSTR = windows_sys::core::w!("Exclude");

// UNSUPPORTED Rust 1856:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_EXPORTABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Exportable");

// UNSUPPORTED Rust 1857:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_EXPORTABLEENCRYPTED: windows_sys::core::PCWSTR = windows_sys::core::w!("ExportableEncrypted");

// UNSUPPORTED Rust 1858:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

// UNSUPPORTED Rust 1859:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_FORCEUTF8: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceUTF8");

// UNSUPPORTED Rust 1860:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_FRIENDLYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FriendlyName");

// UNSUPPORTED Rust 1861:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_HASHALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("HashAlgorithm");

// UNSUPPORTED Rust 1862:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_INCLUDE: windows_sys::core::PCWSTR = windows_sys::core::w!("Include");

// UNSUPPORTED Rust 1863:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_INHIBITPOLICYMAPPING: windows_sys::core::PCWSTR = windows_sys::core::w!("InhibitPolicyMapping");

// UNSUPPORTED Rust 1864:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_IPADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("IPAddress");

// UNSUPPORTED Rust 1865:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_KEYALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyAlgorithm");

// UNSUPPORTED Rust 1866:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_KEYALGORITHMPARMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyAlgorithmParameters");

// UNSUPPORTED Rust 1867:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_KEYCONTAINER: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyContainer");

// UNSUPPORTED Rust 1868:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_KEYLENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyLength");

// UNSUPPORTED Rust 1869:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_KEYPROTECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyProtection");

// UNSUPPORTED Rust 1870:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_KEYUSAGEEXTENSION: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyUsage");

// UNSUPPORTED Rust 1871:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_KEYUSAGEPROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyUsageProperty");

// UNSUPPORTED Rust 1872:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_LEGACYKEYSPEC: windows_sys::core::PCWSTR = windows_sys::core::w!("KeySpec");

// UNSUPPORTED Rust 1873:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_LOADDEFAULTTEMPLATES: windows_sys::core::PCWSTR = windows_sys::core::w!("LoadDefaultTemplates");

// UNSUPPORTED Rust 1874:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_MACHINEKEYSET: windows_sys::core::PCWSTR = windows_sys::core::w!("MachineKeySet");

// UNSUPPORTED Rust 1875:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_NOTAFTER: windows_sys::core::PCWSTR = windows_sys::core::w!("NotAfter");

// UNSUPPORTED Rust 1876:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_NOTBEFORE: windows_sys::core::PCWSTR = windows_sys::core::w!("NotBefore");

// UNSUPPORTED Rust 1877:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_NOTICE: windows_sys::core::PCWSTR = windows_sys::core::w!("Notice");

// UNSUPPORTED Rust 1878:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_OID: windows_sys::core::PCWSTR = windows_sys::core::w!("OID");

// UNSUPPORTED Rust 1879:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_OTHERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("OtherName");

// UNSUPPORTED Rust 1880:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_PATHLENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("PathLength");

// UNSUPPORTED Rust 1881:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_POLICIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Policies");

// UNSUPPORTED Rust 1882:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_PRIVATEKEYARCHIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("PrivateKeyArchive");

// UNSUPPORTED Rust 1883:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_PROVIDERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderName");

// UNSUPPORTED Rust 1884:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_PROVIDERTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderType");

// UNSUPPORTED Rust 1885:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_PUBLICKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("PublicKey");

// UNSUPPORTED Rust 1886:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_PUBLICKEYPARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("PublicKeyParameters");

// UNSUPPORTED Rust 1887:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_READERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ReaderName");

// UNSUPPORTED Rust 1888:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_REGISTEREDID: windows_sys::core::PCWSTR = windows_sys::core::w!("RegisteredId");

// UNSUPPORTED Rust 1889:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_RENEWALCERT: windows_sys::core::PCWSTR = windows_sys::core::w!("RenewalCert");

// UNSUPPORTED Rust 1890:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_RENEWALKEYLENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("RenewalKeyLength");

// UNSUPPORTED Rust 1891:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_RENEWALVALIDITYPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("RenewalValidityPeriodUnits");

// UNSUPPORTED Rust 1892:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_RENEWALVALIDITYPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("RenewalValidityPeriod");

// UNSUPPORTED Rust 1893:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_REQUESTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestType");

// UNSUPPORTED Rust 1894:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_REQUIREEXPLICITPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("RequireExplicitPolicy");

// UNSUPPORTED Rust 1895:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SECURITYDESCRIPTOR: windows_sys::core::PCWSTR = windows_sys::core::w!("SecurityDescriptor");

// UNSUPPORTED Rust 1896:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SERIALNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("SerialNumber");

// UNSUPPORTED Rust 1897:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SHOWALLCSPS: windows_sys::core::PCWSTR = windows_sys::core::w!("ShowAllCSPs");

// UNSUPPORTED Rust 1898:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SILENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Silent");

// UNSUPPORTED Rust 1899:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SMIME: windows_sys::core::PCWSTR = windows_sys::core::w!("SMIME");

// UNSUPPORTED Rust 1900:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SUBJECT: windows_sys::core::PCWSTR = windows_sys::core::w!("Subject");

// UNSUPPORTED Rust 1901:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SUBJECTNAMEFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("SubjectNameFlags");

// UNSUPPORTED Rust 1902:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SUBTREE: windows_sys::core::PCWSTR = windows_sys::core::w!("SubTree");

// UNSUPPORTED Rust 1903:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_SUPPRESSDEFAULTS: windows_sys::core::PCWSTR = windows_sys::core::w!("SuppressDefaults");

// UNSUPPORTED Rust 1904:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_UICONTEXTMESSAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("UIContextMessage");

// UNSUPPORTED Rust 1905:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_UPN: windows_sys::core::PCWSTR = windows_sys::core::w!("UPN");

// UNSUPPORTED Rust 1906:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_URL: windows_sys::core::PCWSTR = windows_sys::core::w!("URL");

// UNSUPPORTED Rust 1907:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_USEEXISTINGKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("UseExistingKeySet");

// UNSUPPORTED Rust 1908:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_USERPROTECTED: windows_sys::core::PCWSTR = windows_sys::core::w!("UserProtected");

// UNSUPPORTED Rust 1909:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_UTF8: windows_sys::core::PCWSTR = windows_sys::core::w!("UTF8");

// UNSUPPORTED Rust 1910:1: non-scalar type Ptr unsupported
// pub const wszINFKEY_X500NAMEFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("X500NameFlags");

// UNSUPPORTED Rust 1911:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_AIA: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthorityInformationAccess");

// UNSUPPORTED Rust 1912:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_APPLICATIONPOLICYCONSTRAINTS: windows_sys::core::PCWSTR = windows_sys::core::w!("ApplicationPolicyConstraintsExtension");

// UNSUPPORTED Rust 1913:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_APPLICATIONPOLICYMAPPINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ApplicationPolicyMappingsExtension");

// UNSUPPORTED Rust 1914:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_APPLICATIONPOLICYSTATEMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("ApplicationPolicyStatementExtension");

// UNSUPPORTED Rust 1915:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_BASICCONSTRAINTS: windows_sys::core::PCWSTR = windows_sys::core::w!("BasicConstraintsExtension");

// UNSUPPORTED Rust 1916:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_CAPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPolicy");

// UNSUPPORTED Rust 1917:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_CCDP: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossCertificateDistributionPointsExtension");

// UNSUPPORTED Rust 1918:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_CDP: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDistributionPoint");

// UNSUPPORTED Rust 1919:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_CERTSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("certsrv_server");

// UNSUPPORTED Rust 1920:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_EKU: windows_sys::core::PCWSTR = windows_sys::core::w!("EnhancedKeyUsageExtension");

// UNSUPPORTED Rust 1921:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_EXTENSIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("Extensions");

// UNSUPPORTED Rust 1922:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_NAMECONSTRAINTS: windows_sys::core::PCWSTR = windows_sys::core::w!("NameConstraintsExtension");

// UNSUPPORTED Rust 1923:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_NEWREQUEST: windows_sys::core::PCWSTR = windows_sys::core::w!("NewRequest");

// UNSUPPORTED Rust 1924:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_POLICYCONSTRAINTS: windows_sys::core::PCWSTR = windows_sys::core::w!("PolicyConstraintsExtension");

// UNSUPPORTED Rust 1925:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_POLICYMAPPINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("PolicyMappingsExtension");

// UNSUPPORTED Rust 1926:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_POLICYSTATEMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("PolicyStatementExtension");

// UNSUPPORTED Rust 1927:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Properties");

// UNSUPPORTED Rust 1928:1: non-scalar type Ptr unsupported
// pub const wszINFSECTION_REQUESTATTRIBUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestAttributes");

// UNSUPPORTED Rust 1929:1: non-scalar type Ptr unsupported
// pub const wszINFVALUE_ENDORSEMENTKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("EndorsementKey");

// UNSUPPORTED Rust 1930:1: non-scalar type Ptr unsupported
// pub const wszINFVALUE_REQUESTTYPE_CERT: windows_sys::core::PCWSTR = windows_sys::core::w!("Cert");

// UNSUPPORTED Rust 1931:1: non-scalar type Ptr unsupported
// pub const wszINFVALUE_REQUESTTYPE_CMC: windows_sys::core::PCWSTR = windows_sys::core::w!("CMC");

// UNSUPPORTED Rust 1932:1: non-scalar type Ptr unsupported
// pub const wszINFVALUE_REQUESTTYPE_PKCS10: windows_sys::core::PCWSTR = windows_sys::core::w!("PKCS10");

// UNSUPPORTED Rust 1933:1: non-scalar type Ptr unsupported
// pub const wszINFVALUE_REQUESTTYPE_PKCS7: windows_sys::core::PCWSTR = windows_sys::core::w!("PKCS7");

// UNSUPPORTED Rust 1934:1: non-scalar type Ptr unsupported
// pub const wszINFVALUE_REQUESTTYPE_SCEP: windows_sys::core::PCWSTR = windows_sys::core::w!("SCEP");

// UNSUPPORTED Rust 1935:1: non-scalar type Ptr unsupported
// pub const wszLDAPSESSIONOPTIONVALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("LDAPSessionOptionValue");

// UNSUPPORTED Rust 1936:1: non-scalar type Ptr unsupported
// pub const wszLOCALIZEDTIMEPERIODUNITS: windows_sys::core::PCWSTR = windows_sys::core::w!("LocalizedTimePeriodUnits");

// UNSUPPORTED Rust 1937:1: non-scalar type Ptr unsupported
// pub const wszLOGFILENAMEEXT: windows_sys::core::PCWSTR = windows_sys::core::w!(".log");

// UNSUPPORTED Rust 1938:1: non-scalar type Ptr unsupported
// pub const wszLOGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("CertLog");

// UNSUPPORTED Rust 1939:1: non-scalar type Ptr unsupported
// pub const wszMACHINEKEYSET: windows_sys::core::PCWSTR = windows_sys::core::w!("MachineKeyset");

// UNSUPPORTED Rust 1940:1: non-scalar type Ptr unsupported
// pub const wszMICROSOFTCERTMODULE_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateAuthority_MicrosoftDefault");

// UNSUPPORTED Rust 1941:1: non-scalar type Ptr unsupported
// pub const wszNETSCAPEREVOCATIONTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("Netscape");

// UNSUPPORTED Rust 1942:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_CACERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CACertificate");

// UNSUPPORTED Rust 1943:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_CACONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("CAConfig");

// UNSUPPORTED Rust 1944:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_CSPNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CSPName");

// UNSUPPORTED Rust 1945:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_ERRORCODE: windows_sys::core::PCWSTR = windows_sys::core::w!("ErrorCode");

// UNSUPPORTED Rust 1946:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_HASHALGORITHMID: windows_sys::core::PCWSTR = windows_sys::core::w!("HashAlgorithmId");

// UNSUPPORTED Rust 1947:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_KEYSPEC: windows_sys::core::PCWSTR = windows_sys::core::w!("KeySpec");

// UNSUPPORTED Rust 1948:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_LOCALREVOCATIONINFORMATION: windows_sys::core::PCWSTR = windows_sys::core::w!("LocalRevocationInformation");

// UNSUPPORTED Rust 1949:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_PROVIDERCLSID: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderCLSID");

// UNSUPPORTED Rust 1950:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_PROVIDERPROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider");

// UNSUPPORTED Rust 1951:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_REMINDERDURATION: windows_sys::core::PCWSTR = windows_sys::core::w!("ReminderDuration");

// UNSUPPORTED Rust 1952:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_SIGNINGCERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("SigningCertificate");

// UNSUPPORTED Rust 1953:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_SIGNINGCERTIFICATETEMPLATE: windows_sys::core::PCWSTR = windows_sys::core::w!("SigningCertificateTemplate");

// UNSUPPORTED Rust 1954:1: non-scalar type Ptr unsupported
// pub const wszOCSPCAPROP_SIGNINGFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("SigningFlags");

// UNSUPPORTED Rust 1955:1: non-scalar type Ptr unsupported
// pub const wszOCSPCOMMONPROP_MAXINCOMINGMESSAGESIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxIncomingMessageSize");

// UNSUPPORTED Rust 1956:1: non-scalar type Ptr unsupported
// pub const wszOCSPCOMMONPROP_MAXNUMOFREQUESTENTRIES: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxNumOfRequestEntries");

// UNSUPPORTED Rust 1957:1: non-scalar type Ptr unsupported
// pub const wszOCSPCOMMONPROP_REQFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestFlags");

// UNSUPPORTED Rust 1958:1: non-scalar type Ptr unsupported
// pub const wszOCSPISAPIPROP_DEBUG: windows_sys::core::PCWSTR = windows_sys::core::w!("ISAPIDebug");

// UNSUPPORTED Rust 1959:1: non-scalar type Ptr unsupported
// pub const wszOCSPISAPIPROP_MAXAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxAge");

// UNSUPPORTED Rust 1960:1: non-scalar type Ptr unsupported
// pub const wszOCSPISAPIPROP_MAXNUMOFCACHEENTRIES: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxNumOfCacheEntries");

// UNSUPPORTED Rust 1961:1: non-scalar type Ptr unsupported
// pub const wszOCSPISAPIPROP_NUMOFBACKENDCONNECTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("NumOfBackendConnections");

// UNSUPPORTED Rust 1962:1: non-scalar type Ptr unsupported
// pub const wszOCSPISAPIPROP_NUMOFTHREADS: windows_sys::core::PCWSTR = windows_sys::core::w!("NumOfThreads");

// UNSUPPORTED Rust 1963:1: non-scalar type Ptr unsupported
// pub const wszOCSPISAPIPROP_REFRESHRATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RefreshRate");

// UNSUPPORTED Rust 1964:1: non-scalar type Ptr unsupported
// pub const wszOCSPISAPIPROP_VIRTUALROOTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualRootName");

// UNSUPPORTED Rust 1965:1: non-scalar type Ptr unsupported
// pub const wszOCSPPROP_ARRAYCONTROLLER: windows_sys::core::PCWSTR = windows_sys::core::w!("ArrayController");

// UNSUPPORTED Rust 1966:1: non-scalar type Ptr unsupported
// pub const wszOCSPPROP_ARRAYMEMBERS: windows_sys::core::PCWSTR = windows_sys::core::w!("ArrayMembers");

// UNSUPPORTED Rust 1967:1: non-scalar type Ptr unsupported
// pub const wszOCSPPROP_AUDITFILTER: windows_sys::core::PCWSTR = windows_sys::core::w!("AuditFilter");

// UNSUPPORTED Rust 1968:1: non-scalar type Ptr unsupported
// pub const wszOCSPPROP_DEBUG: windows_sys::core::PCWSTR = windows_sys::core::w!("Debug");

// UNSUPPORTED Rust 1969:1: non-scalar type Ptr unsupported
// pub const wszOCSPPROP_ENROLLPOLLINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("EnrollPollInterval");

// UNSUPPORTED Rust 1970:1: non-scalar type Ptr unsupported
// pub const wszOCSPPROP_LOGLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("LogLevel");

// UNSUPPORTED Rust 1971:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_BASECRL: windows_sys::core::PCWSTR = windows_sys::core::w!("BaseCrl");

// UNSUPPORTED Rust 1972:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_BASECRLURLS: windows_sys::core::PCWSTR = windows_sys::core::w!("BaseCrlUrls");

// UNSUPPORTED Rust 1973:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_CRLURLTIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("CrlUrlTimeOut");

// UNSUPPORTED Rust 1974:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_DELTACRL: windows_sys::core::PCWSTR = windows_sys::core::w!("DeltaCrl");

// UNSUPPORTED Rust 1975:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_DELTACRLURLS: windows_sys::core::PCWSTR = windows_sys::core::w!("DeltaCrlUrls");

// UNSUPPORTED Rust 1976:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_ERRORCODE: windows_sys::core::PCWSTR = windows_sys::core::w!("RevocationErrorCode");

// UNSUPPORTED Rust 1977:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_REFRESHTIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("RefreshTimeOut");

// UNSUPPORTED Rust 1978:1: non-scalar type Ptr unsupported
// pub const wszOCSPREVPROP_SERIALNUMBERSDIRS: windows_sys::core::PCWSTR = windows_sys::core::w!("IssuedSerialNumbersDirectories");

// UNSUPPORTED Rust 1979:1: non-scalar type Ptr unsupported
// pub const wszPERIODDAYS: windows_sys::core::PCWSTR = windows_sys::core::w!("Days");

// UNSUPPORTED Rust 1980:1: non-scalar type Ptr unsupported
// pub const wszPERIODHOURS: windows_sys::core::PCWSTR = windows_sys::core::w!("Hours");

// UNSUPPORTED Rust 1981:1: non-scalar type Ptr unsupported
// pub const wszPERIODMINUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("Minutes");

// UNSUPPORTED Rust 1982:1: non-scalar type Ptr unsupported
// pub const wszPERIODMONTHS: windows_sys::core::PCWSTR = windows_sys::core::w!("Months");

// UNSUPPORTED Rust 1983:1: non-scalar type Ptr unsupported
// pub const wszPERIODSECONDS: windows_sys::core::PCWSTR = windows_sys::core::w!("Seconds");

// UNSUPPORTED Rust 1984:1: non-scalar type Ptr unsupported
// pub const wszPERIODWEEKS: windows_sys::core::PCWSTR = windows_sys::core::w!("Weeks");

// UNSUPPORTED Rust 1985:1: non-scalar type Ptr unsupported
// pub const wszPERIODYEARS: windows_sys::core::PCWSTR = windows_sys::core::w!("Years");

// UNSUPPORTED Rust 1986:1: non-scalar type Ptr unsupported
// pub const wszPFXFILENAMEEXT: windows_sys::core::PCWSTR = windows_sys::core::w!(".p12");

// UNSUPPORTED Rust 1987:1: non-scalar type Ptr unsupported
// pub const wszPROPATTESTATIONCHALLENGE: windows_sys::core::PCWSTR = windows_sys::core::w!("AttestationChallenge");

// UNSUPPORTED Rust 1988:1: non-scalar type Ptr unsupported
// pub const wszPROPATTRIBNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AttributeName");

// UNSUPPORTED Rust 1989:1: non-scalar type Ptr unsupported
// pub const wszPROPATTRIBREQUESTID: windows_sys::core::PCWSTR = windows_sys::core::w!("AttributeRequestId");

// UNSUPPORTED Rust 1990:1: non-scalar type Ptr unsupported
// pub const wszPROPATTRIBVALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("AttributeValue");

// UNSUPPORTED Rust 1991:1: non-scalar type Ptr unsupported
// pub const wszPROPCALLERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CallerName");

// UNSUPPORTED Rust 1992:1: non-scalar type Ptr unsupported
// pub const wszPROPCATYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("CAType");

// UNSUPPORTED Rust 1993:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTCLIENTMACHINE: windows_sys::core::PCWSTR = windows_sys::core::w!("ccm");

// UNSUPPORTED Rust 1994:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CertCount");

// UNSUPPORTED Rust 1995:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEENROLLMENTFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnrollmentFlags");

// UNSUPPORTED Rust 1996:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEGENERALFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("GeneralFlags");

// UNSUPPORTED Rust 1997:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEHASH: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateHash");

// UNSUPPORTED Rust 1998:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATENOTAFTERDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("NotAfter");

// UNSUPPORTED Rust 1999:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATENOTBEFOREDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("NotBefore");

// UNSUPPORTED Rust 2000:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEPRIVATEKEYFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("PrivatekeyFlags");

// UNSUPPORTED Rust 2001:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEPUBLICKEYALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("PublicKeyAlgorithm");

// UNSUPPORTED Rust 2002:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEPUBLICKEYLENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("PublicKeyLength");

// UNSUPPORTED Rust 2003:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATERAWPUBLICKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("RawPublicKey");

// UNSUPPORTED Rust 2004:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATERAWPUBLICKEYALGORITHMPARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("RawPublicKeyAlgorithmParameters");

// UNSUPPORTED Rust 2005:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATERAWSMIMECAPABILITIES: windows_sys::core::PCWSTR = windows_sys::core::w!("RawSMIMECapabilities");

// UNSUPPORTED Rust 2006:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEREQUESTID: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestID");

// UNSUPPORTED Rust 2007:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATESERIALNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("SerialNumber");

// UNSUPPORTED Rust 2008:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATESUBJECTKEYIDENTIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("SubjectKeyIdentifier");

// UNSUPPORTED Rust 2009:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATETEMPLATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateTemplate");

// UNSUPPORTED Rust 2010:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATETYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateType");

// UNSUPPORTED Rust 2011:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTIFICATEUPN: windows_sys::core::PCWSTR = windows_sys::core::w!("UPN");

// UNSUPPORTED Rust 2012:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertState");

// UNSUPPORTED Rust 2013:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTSUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("CertSuffix");

// UNSUPPORTED Rust 2014:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTTEMPLATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateTemplate");

// UNSUPPORTED Rust 2015:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertType");

// UNSUPPORTED Rust 2016:1: non-scalar type Ptr unsupported
// pub const wszPROPCERTUSAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertificateUsage");

// UNSUPPORTED Rust 2017:1: non-scalar type Ptr unsupported
// pub const wszPROPCHALLENGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Challenge");

// UNSUPPORTED Rust 2018:1: non-scalar type Ptr unsupported
// pub const wszPROPCLIENTBROWSERMACHINE: windows_sys::core::PCWSTR = windows_sys::core::w!("cbm");

// UNSUPPORTED Rust 2019:1: non-scalar type Ptr unsupported
// pub const wszPROPCLIENTDCDNS: windows_sys::core::PCWSTR = windows_sys::core::w!("cdc");

// UNSUPPORTED Rust 2020:1: non-scalar type Ptr unsupported
// pub const wszPROPCOMMONNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CommonName");

// UNSUPPORTED Rust 2021:1: non-scalar type Ptr unsupported
// pub const wszPROPCONFIGDN: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigDN");

// UNSUPPORTED Rust 2022:1: non-scalar type Ptr unsupported
// pub const wszPROPCOUNTRY: windows_sys::core::PCWSTR = windows_sys::core::w!("Country");

// UNSUPPORTED Rust 2023:1: non-scalar type Ptr unsupported
// pub const wszPROPCRITICALTAG: windows_sys::core::PCWSTR = windows_sys::core::w!("{critical}");

// UNSUPPORTED Rust 2024:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLCount");

// UNSUPPORTED Rust 2025:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLEFFECTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLEffective");

// UNSUPPORTED Rust 2026:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLINDEX: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLIndex");

// UNSUPPORTED Rust 2027:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLLASTPUBLISHED: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLLastPublished");

// UNSUPPORTED Rust 2028:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLMINBASE: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLMinBase");

// UNSUPPORTED Rust 2029:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLNAMEID: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLNameId");

// UNSUPPORTED Rust 2030:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLNEXTPUBLISH: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLNextPublish");

// UNSUPPORTED Rust 2031:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLNEXTUPDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLNextUpdate");

// UNSUPPORTED Rust 2032:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLNumber");

// UNSUPPORTED Rust 2033:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLPROPAGATIONCOMPLETE: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPropagationComplete");

// UNSUPPORTED Rust 2034:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLPUBLISHATTEMPTS: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPublishAttempts");

// UNSUPPORTED Rust 2035:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLPUBLISHERROR: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPublishError");

// UNSUPPORTED Rust 2036:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLPUBLISHFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPublishFlags");

// UNSUPPORTED Rust 2037:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLPUBLISHSTATUSCODE: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPublishStatusCode");

// UNSUPPORTED Rust 2038:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLRAWCRL: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLRawCRL");

// UNSUPPORTED Rust 2039:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLROWID: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLRowId");

// UNSUPPORTED Rust 2040:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLState");

// UNSUPPORTED Rust 2041:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLSUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLSuffix");

// UNSUPPORTED Rust 2042:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLTHISPUBLISH: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLThisPublish");

// UNSUPPORTED Rust 2043:1: non-scalar type Ptr unsupported
// pub const wszPROPCRLTHISUPDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLThisUpdate");

// UNSUPPORTED Rust 2044:1: non-scalar type Ptr unsupported
// pub const wszPROPCROSSFOREST: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossForest");

// UNSUPPORTED Rust 2045:1: non-scalar type Ptr unsupported
// pub const wszPROPDCNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DCName");

// UNSUPPORTED Rust 2046:1: non-scalar type Ptr unsupported
// pub const wszPROPDECIMALTAG: windows_sys::core::PCWSTR = windows_sys::core::w!("{decimal}");

// UNSUPPORTED Rust 2047:1: non-scalar type Ptr unsupported
// pub const wszPROPDELTACRLSDISABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("fDeltaCRLsDisabled");

// UNSUPPORTED Rust 2048:1: non-scalar type Ptr unsupported
// pub const wszPROPDEVICESERIALNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceSerialNumber");

// UNSUPPORTED Rust 2049:1: non-scalar type Ptr unsupported
// pub const wszPROPDISPOSITION: windows_sys::core::PCWSTR = windows_sys::core::w!("Disposition");

// UNSUPPORTED Rust 2050:1: non-scalar type Ptr unsupported
// pub const wszPROPDISPOSITIONDENY: windows_sys::core::PCWSTR = windows_sys::core::w!("Deny");

// UNSUPPORTED Rust 2051:1: non-scalar type Ptr unsupported
// pub const wszPROPDISPOSITIONPENDING: windows_sys::core::PCWSTR = windows_sys::core::w!("Pending");

// UNSUPPORTED Rust 2052:1: non-scalar type Ptr unsupported
// pub const wszPROPDISTINGUISHEDNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DistinguishedName");

// UNSUPPORTED Rust 2053:1: non-scalar type Ptr unsupported
// pub const wszPROPDN: windows_sys::core::PCWSTR = windows_sys::core::w!("dn");

// UNSUPPORTED Rust 2054:1: non-scalar type Ptr unsupported
// pub const wszPROPDNS: windows_sys::core::PCWSTR = windows_sys::core::w!("dns");

// UNSUPPORTED Rust 2055:1: non-scalar type Ptr unsupported
// pub const wszPROPDOMAINCOMPONENT: windows_sys::core::PCWSTR = windows_sys::core::w!("DomainComponent");

// UNSUPPORTED Rust 2056:1: non-scalar type Ptr unsupported
// pub const wszPROPDOMAINDN: windows_sys::core::PCWSTR = windows_sys::core::w!("DomainDN");

// UNSUPPORTED Rust 2057:1: non-scalar type Ptr unsupported
// pub const wszPROPEMAIL: windows_sys::core::PCWSTR = windows_sys::core::w!("EMail");

// UNSUPPORTED Rust 2058:1: non-scalar type Ptr unsupported
// pub const wszPROPENDORSEMENTCERTIFICATEHASH: windows_sys::core::PCWSTR = windows_sys::core::w!("EndorsementCertificateHash");

// UNSUPPORTED Rust 2059:1: non-scalar type Ptr unsupported
// pub const wszPROPENDORSEMENTKEYHASH: windows_sys::core::PCWSTR = windows_sys::core::w!("EndorsementKeyHash");

// UNSUPPORTED Rust 2060:1: non-scalar type Ptr unsupported
// pub const wszPROPEVENTLOGERROR: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLogError");

// UNSUPPORTED Rust 2061:1: non-scalar type Ptr unsupported
// pub const wszPROPEVENTLOGEXHAUSTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLogExhaustive");

// UNSUPPORTED Rust 2062:1: non-scalar type Ptr unsupported
// pub const wszPROPEVENTLOGTERSE: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLogTerse");

// UNSUPPORTED Rust 2063:1: non-scalar type Ptr unsupported
// pub const wszPROPEVENTLOGVERBOSE: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLogVerbose");

// UNSUPPORTED Rust 2064:1: non-scalar type Ptr unsupported
// pub const wszPROPEVENTLOGWARNING: windows_sys::core::PCWSTR = windows_sys::core::w!("EventLogWarning");

// UNSUPPORTED Rust 2065:1: non-scalar type Ptr unsupported
// pub const wszPROPEXITCERTFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertFile");

// UNSUPPORTED Rust 2066:1: non-scalar type Ptr unsupported
// pub const wszPROPEXPECTEDCHALLENGE: windows_sys::core::PCWSTR = windows_sys::core::w!("ExpectedChallenge");

// UNSUPPORTED Rust 2067:1: non-scalar type Ptr unsupported
// pub const wszPROPEXPIRATIONDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("ExpirationDate");

// UNSUPPORTED Rust 2068:1: non-scalar type Ptr unsupported
// pub const wszPROPEXTFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtensionFlags");

// UNSUPPORTED Rust 2069:1: non-scalar type Ptr unsupported
// pub const wszPROPEXTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtensionName");

// UNSUPPORTED Rust 2070:1: non-scalar type Ptr unsupported
// pub const wszPROPEXTRAWVALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtensionRawValue");

// UNSUPPORTED Rust 2071:1: non-scalar type Ptr unsupported
// pub const wszPROPEXTREQUESTID: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtensionRequestId");

// UNSUPPORTED Rust 2072:1: non-scalar type Ptr unsupported
// pub const wszPROPFILETAG: windows_sys::core::PCWSTR = windows_sys::core::w!("{file}");

// UNSUPPORTED Rust 2073:1: non-scalar type Ptr unsupported
// pub const wszPROPGIVENNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("GivenName");

// UNSUPPORTED Rust 2074:1: non-scalar type Ptr unsupported
// pub const wszPROPGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("guid");

// UNSUPPORTED Rust 2075:1: non-scalar type Ptr unsupported
// pub const wszPROPHEXTAG: windows_sys::core::PCWSTR = windows_sys::core::w!("{hex}");

// UNSUPPORTED Rust 2076:1: non-scalar type Ptr unsupported
// pub const wszPROPINITIALS: windows_sys::core::PCWSTR = windows_sys::core::w!("Initials");

// UNSUPPORTED Rust 2077:1: non-scalar type Ptr unsupported
// pub const wszPROPIPADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("ipaddress");

// UNSUPPORTED Rust 2078:1: non-scalar type Ptr unsupported
// pub const wszPROPKEYARCHIVED: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyArchived");

// UNSUPPORTED Rust 2079:1: non-scalar type Ptr unsupported
// pub const wszPROPLOCALITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Locality");

// UNSUPPORTED Rust 2080:1: non-scalar type Ptr unsupported
// pub const wszPROPLOGLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("LogLevel");

// UNSUPPORTED Rust 2081:1: non-scalar type Ptr unsupported
// pub const wszPROPMACHINEDNSNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MachineDNSName");

// UNSUPPORTED Rust 2082:1: non-scalar type Ptr unsupported
// pub const wszPROPMODULEREGLOC: windows_sys::core::PCWSTR = windows_sys::core::w!("ModuleRegistryLocation");

// UNSUPPORTED Rust 2083:1: non-scalar type Ptr unsupported
// pub const wszPROPNAMETYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("NameType");

// UNSUPPORTED Rust 2084:1: non-scalar type Ptr unsupported
// pub const wszPROPOCTETTAG: windows_sys::core::PCWSTR = windows_sys::core::w!("{octet}");

// UNSUPPORTED Rust 2085:1: non-scalar type Ptr unsupported
// pub const wszPROPOFFICER: windows_sys::core::PCWSTR = windows_sys::core::w!("Officer");

// UNSUPPORTED Rust 2086:1: non-scalar type Ptr unsupported
// pub const wszPROPOID: windows_sys::core::PCWSTR = windows_sys::core::w!("oid");

// UNSUPPORTED Rust 2087:1: non-scalar type Ptr unsupported
// pub const wszPROPORGANIZATION: windows_sys::core::PCWSTR = windows_sys::core::w!("Organization");

// UNSUPPORTED Rust 2088:1: non-scalar type Ptr unsupported
// pub const wszPROPORGUNIT: windows_sys::core::PCWSTR = windows_sys::core::w!("OrgUnit");

// UNSUPPORTED Rust 2089:1: non-scalar type Ptr unsupported
// pub const wszPROPPUBLISHEXPIREDCERTINCRL: windows_sys::core::PCWSTR = windows_sys::core::w!("PublishExpiredCertInCRL");

// UNSUPPORTED Rust 2090:1: non-scalar type Ptr unsupported
// pub const wszPROPRAWCACERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RawCACertificate");

// UNSUPPORTED Rust 2091:1: non-scalar type Ptr unsupported
// pub const wszPROPRAWCERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RawCertificate");

// UNSUPPORTED Rust 2092:1: non-scalar type Ptr unsupported
// pub const wszPROPRAWCRL: windows_sys::core::PCWSTR = windows_sys::core::w!("RawCRL");

// UNSUPPORTED Rust 2093:1: non-scalar type Ptr unsupported
// pub const wszPROPRAWDELTACRL: windows_sys::core::PCWSTR = windows_sys::core::w!("RawDeltaCRL");

// UNSUPPORTED Rust 2094:1: non-scalar type Ptr unsupported
// pub const wszPROPRAWNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RawName");

// UNSUPPORTED Rust 2095:1: non-scalar type Ptr unsupported
// pub const wszPROPRAWPRECERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RawPrecertificate");

// UNSUPPORTED Rust 2096:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTARCHIVEDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("ArchivedKey");

// UNSUPPORTED Rust 2097:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTATTRIBUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestAttributes");

// UNSUPPORTED Rust 2098:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTCSPPROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestCSPProvider");

// UNSUPPORTED Rust 2099:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTDISPOSITION: windows_sys::core::PCWSTR = windows_sys::core::w!("Disposition");

// UNSUPPORTED Rust 2100:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTDISPOSITIONMESSAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("DispositionMessage");

// UNSUPPORTED Rust 2101:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTDOT: windows_sys::core::PCWSTR = windows_sys::core::w!("Request.");

// UNSUPPORTED Rust 2102:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTERCAACCESS: windows_sys::core::PCWSTR = windows_sys::core::w!("RequesterCAAccess");

// UNSUPPORTED Rust 2103:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTERDN: windows_sys::core::PCWSTR = windows_sys::core::w!("RequesterDN");

// UNSUPPORTED Rust 2104:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RequesterName");

// UNSUPPORTED Rust 2105:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTERNAMEFROMOLDCERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RequesterNameFromOldCertificate");

// UNSUPPORTED Rust 2106:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTERSAMNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RequesterSAMName");

// UNSUPPORTED Rust 2107:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTERUPN: windows_sys::core::PCWSTR = windows_sys::core::w!("RequesterUPN");

// UNSUPPORTED Rust 2108:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestFlags");

// UNSUPPORTED Rust 2109:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTKEYRECOVERYHASHES: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyRecoveryHashes");

// UNSUPPORTED Rust 2110:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTMACHINEDNS: windows_sys::core::PCWSTR = windows_sys::core::w!("rmd");

// UNSUPPORTED Rust 2111:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTOSVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestOSVersion");

// UNSUPPORTED Rust 2112:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTRAWARCHIVEDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("RawArchivedKey");

// UNSUPPORTED Rust 2113:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTRAWOLDCERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RawOldCertificate");

// UNSUPPORTED Rust 2114:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTRAWREQUEST: windows_sys::core::PCWSTR = windows_sys::core::w!("RawRequest");

// UNSUPPORTED Rust 2115:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTREQUESTID: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestID");

// UNSUPPORTED Rust 2116:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTRESOLVEDWHEN: windows_sys::core::PCWSTR = windows_sys::core::w!("ResolvedWhen");

// UNSUPPORTED Rust 2117:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTREVOKEDEFFECTIVEWHEN: windows_sys::core::PCWSTR = windows_sys::core::w!("RevokedEffectiveWhen");

// UNSUPPORTED Rust 2118:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTREVOKEDREASON: windows_sys::core::PCWSTR = windows_sys::core::w!("RevokedReason");

// UNSUPPORTED Rust 2119:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTREVOKEDWHEN: windows_sys::core::PCWSTR = windows_sys::core::w!("RevokedWhen");

// UNSUPPORTED Rust 2120:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTSTATUSCODE: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusCode");

// UNSUPPORTED Rust 2121:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTSUBMITTEDWHEN: windows_sys::core::PCWSTR = windows_sys::core::w!("SubmittedWhen");

// UNSUPPORTED Rust 2122:1: non-scalar type Ptr unsupported
// pub const wszPROPREQUESTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestType");

// UNSUPPORTED Rust 2123:1: non-scalar type Ptr unsupported
// pub const wszPROPSANITIZEDCANAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SanitizedCAName");

// UNSUPPORTED Rust 2124:1: non-scalar type Ptr unsupported
// pub const wszPROPSANITIZEDSHORTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SanitizedShortName");

// UNSUPPORTED Rust 2125:1: non-scalar type Ptr unsupported
// pub const wszPROPSEAUDITFILTER: windows_sys::core::PCWSTR = windows_sys::core::w!("SEAuditFilter");

// UNSUPPORTED Rust 2126:1: non-scalar type Ptr unsupported
// pub const wszPROPSEAUDITID: windows_sys::core::PCWSTR = windows_sys::core::w!("SEAuditId");

// UNSUPPORTED Rust 2127:1: non-scalar type Ptr unsupported
// pub const wszPROPSERVERUPGRADED: windows_sys::core::PCWSTR = windows_sys::core::w!("fServerUpgraded");

// UNSUPPORTED Rust 2128:1: non-scalar type Ptr unsupported
// pub const wszPROPSESSIONCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("SessionCount");

// UNSUPPORTED Rust 2129:1: non-scalar type Ptr unsupported
// pub const wszPROPSIGNERAPPLICATIONPOLICIES: windows_sys::core::PCWSTR = windows_sys::core::w!("SignerApplicationPolicies");

// UNSUPPORTED Rust 2130:1: non-scalar type Ptr unsupported
// pub const wszPROPSIGNERPOLICIES: windows_sys::core::PCWSTR = windows_sys::core::w!("SignerPolicies");

// UNSUPPORTED Rust 2131:1: non-scalar type Ptr unsupported
// pub const wszPROPSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("State");

// UNSUPPORTED Rust 2132:1: non-scalar type Ptr unsupported
// pub const wszPROPSTREETADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("StreetAddress");

// UNSUPPORTED Rust 2133:1: non-scalar type Ptr unsupported
// pub const wszPROPSUBJECTALTNAME2: windows_sys::core::PCWSTR = windows_sys::core::w!("san");

// UNSUPPORTED Rust 2134:1: non-scalar type Ptr unsupported
// pub const wszPROPSUBJECTDOT: windows_sys::core::PCWSTR = windows_sys::core::w!("Subject.");

// UNSUPPORTED Rust 2135:1: non-scalar type Ptr unsupported
// pub const wszPROPSURNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SurName");

// UNSUPPORTED Rust 2136:1: non-scalar type Ptr unsupported
// pub const wszPROPTEMPLATECHANGESEQUENCENUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("TemplateChangeSequenceNumber");

// UNSUPPORTED Rust 2137:1: non-scalar type Ptr unsupported
// pub const wszPROPTEXTTAG: windows_sys::core::PCWSTR = windows_sys::core::w!("{text}");

// UNSUPPORTED Rust 2138:1: non-scalar type Ptr unsupported
// pub const wszPROPTITLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Title");

// UNSUPPORTED Rust 2139:1: non-scalar type Ptr unsupported
// pub const wszPROPUNSTRUCTUREDADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("UnstructuredAddress");

// UNSUPPORTED Rust 2140:1: non-scalar type Ptr unsupported
// pub const wszPROPUNSTRUCTUREDNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("UnstructuredName");

// UNSUPPORTED Rust 2141:1: non-scalar type Ptr unsupported
// pub const wszPROPUPN: windows_sys::core::PCWSTR = windows_sys::core::w!("upn");

// UNSUPPORTED Rust 2142:1: non-scalar type Ptr unsupported
// pub const wszPROPURL: windows_sys::core::PCWSTR = windows_sys::core::w!("url");

// UNSUPPORTED Rust 2143:1: non-scalar type Ptr unsupported
// pub const wszPROPUSEDS: windows_sys::core::PCWSTR = windows_sys::core::w!("fUseDS");

// UNSUPPORTED Rust 2144:1: non-scalar type Ptr unsupported
// pub const wszPROPUSERDN: windows_sys::core::PCWSTR = windows_sys::core::w!("UserDN");

// UNSUPPORTED Rust 2145:1: non-scalar type Ptr unsupported
// pub const wszPROPUTF8TAG: windows_sys::core::PCWSTR = windows_sys::core::w!("{utf8}");

// UNSUPPORTED Rust 2146:1: non-scalar type Ptr unsupported
// pub const wszPROPVALIDITYPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("ValidityPeriodUnits");

// UNSUPPORTED Rust 2147:1: non-scalar type Ptr unsupported
// pub const wszPROPVALIDITYPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("ValidityPeriod");

// UNSUPPORTED Rust 2148:1: non-scalar type Ptr unsupported
// pub const wszPROPVOLATILEMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("VolatileMode");

// UNSUPPORTED Rust 2149:1: non-scalar type Ptr unsupported
// pub const wszREGACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("Active");

// UNSUPPORTED Rust 2150:1: non-scalar type Ptr unsupported
// pub const wszREGAELOGLEVEL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("AEEventLogLevel");

// UNSUPPORTED Rust 2151:1: non-scalar type Ptr unsupported
// pub const wszREGAIKCLOUDCAURL: windows_sys::core::PCWSTR = windows_sys::core::w!("AIKCloudCAURL");

// UNSUPPORTED Rust 2152:1: non-scalar type Ptr unsupported
// pub const wszREGAIKKEYALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AIKKeyAlgorithm");

// UNSUPPORTED Rust 2153:1: non-scalar type Ptr unsupported
// pub const wszREGAIKKEYLENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("AIKKeyLength");

// UNSUPPORTED Rust 2154:1: non-scalar type Ptr unsupported
// pub const wszREGALLPROVIDERS: windows_sys::core::PCWSTR = windows_sys::core::w!("All");

// UNSUPPORTED Rust 2155:1: non-scalar type Ptr unsupported
// pub const wszREGALTERNATEPUBLISHDOMAINS: windows_sys::core::PCWSTR = windows_sys::core::w!("AlternatePublishDomains");

// UNSUPPORTED Rust 2156:1: non-scalar type Ptr unsupported
// pub const wszREGALTERNATESIGNATUREALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AlternateSignatureAlgorithm");

// UNSUPPORTED Rust 2157:1: non-scalar type Ptr unsupported
// pub const wszREGAUDITFILTER: windows_sys::core::PCWSTR = windows_sys::core::w!("AuditFilter");

// UNSUPPORTED Rust 2158:1: non-scalar type Ptr unsupported
// pub const wszREGB2ICERTMANAGEMODULE: windows_sys::core::PCWSTR = windows_sys::core::w!("ICertManageModule");

// UNSUPPORTED Rust 2159:1: non-scalar type Ptr unsupported
// pub const wszREGBACKUPLOGDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("BackupLogDirectory");

// UNSUPPORTED Rust 2160:1: non-scalar type Ptr unsupported
// pub const wszREGCACERTFILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CACertFileName");

// UNSUPPORTED Rust 2161:1: non-scalar type Ptr unsupported
// pub const wszREGCACERTHASH: windows_sys::core::PCWSTR = windows_sys::core::w!("CACertHash");

// UNSUPPORTED Rust 2162:1: non-scalar type Ptr unsupported
// pub const wszREGCACERTPUBLICATIONURLS: windows_sys::core::PCWSTR = windows_sys::core::w!("CACertPublicationURLs");

// UNSUPPORTED Rust 2163:1: non-scalar type Ptr unsupported
// pub const wszREGCADESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("CADescription");

// UNSUPPORTED Rust 2164:1: non-scalar type Ptr unsupported
// pub const wszREGCAPATHLENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPathLength");

// UNSUPPORTED Rust 2165:1: non-scalar type Ptr unsupported
// pub const wszREGCASECURITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Security");

// UNSUPPORTED Rust 2166:1: non-scalar type Ptr unsupported
// pub const wszREGCASERIALNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("CACertSerialNumber");

// UNSUPPORTED Rust 2167:1: non-scalar type Ptr unsupported
// pub const wszREGCASERVERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CAServerName");

// UNSUPPORTED Rust 2168:1: non-scalar type Ptr unsupported
// pub const wszREGCATYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("CAType");

// UNSUPPORTED Rust 2169:1: non-scalar type Ptr unsupported
// pub const wszREGCAUSEDS: windows_sys::core::PCWSTR = windows_sys::core::w!("UseDS");

// UNSUPPORTED Rust 2170:1: non-scalar type Ptr unsupported
// pub const wszREGCAXCHGCERTHASH: windows_sys::core::PCWSTR = windows_sys::core::w!("CAXchgCertHash");

// UNSUPPORTED Rust 2171:1: non-scalar type Ptr unsupported
// pub const wszREGCAXCHGOVERLAPPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CAXchgOverlapPeriodUnits");

// UNSUPPORTED Rust 2172:1: non-scalar type Ptr unsupported
// pub const wszREGCAXCHGOVERLAPPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CAXchgOverlapPeriod");

// UNSUPPORTED Rust 2173:1: non-scalar type Ptr unsupported
// pub const wszREGCAXCHGVALIDITYPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CAXchgValidityPeriodUnits");

// UNSUPPORTED Rust 2174:1: non-scalar type Ptr unsupported
// pub const wszREGCAXCHGVALIDITYPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CAXchgValidityPeriod");

// UNSUPPORTED Rust 2175:1: non-scalar type Ptr unsupported
// pub const wszREGCERTENROLLCOMPATIBLE: windows_sys::core::PCWSTR = windows_sys::core::w!("CertEnrollCompatible");

// UNSUPPORTED Rust 2176:1: non-scalar type Ptr unsupported
// pub const wszREGCERTIFICATETRANSPARENCYINFOOID: windows_sys::core::PCWSTR = windows_sys::core::w!("CTInformationExtensionOid");

// UNSUPPORTED Rust 2177:1: non-scalar type Ptr unsupported
// pub const wszREGCERTPUBLISHFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("PublishCertFlags");

// UNSUPPORTED Rust 2178:1: non-scalar type Ptr unsupported
// pub const wszREGCERTSRVDEBUG: windows_sys::core::PCWSTR = windows_sys::core::w!("Debug");

// UNSUPPORTED Rust 2179:1: non-scalar type Ptr unsupported
// pub const wszREGCHECKPOINTFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("CheckPointFile");

// UNSUPPORTED Rust 2180:1: non-scalar type Ptr unsupported
// pub const wszREGCLOCKSKEWMINUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("ClockSkewMinutes");

// UNSUPPORTED Rust 2181:1: non-scalar type Ptr unsupported
// pub const wszREGCOMMONNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CommonName");

// UNSUPPORTED Rust 2182:1: non-scalar type Ptr unsupported
// pub const wszREGCRLATTEMPTREPUBLISH: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLAttemptRepublish");

// UNSUPPORTED Rust 2183:1: non-scalar type Ptr unsupported
// pub const wszREGCRLDELTANEXTPUBLISH: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDeltaNextPublish");

// UNSUPPORTED Rust 2184:1: non-scalar type Ptr unsupported
// pub const wszREGCRLDELTAOVERLAPPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDeltaOverlapUnits");

// UNSUPPORTED Rust 2185:1: non-scalar type Ptr unsupported
// pub const wszREGCRLDELTAOVERLAPPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDeltaOverlapPeriod");

// UNSUPPORTED Rust 2186:1: non-scalar type Ptr unsupported
// pub const wszREGCRLDELTAPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDeltaPeriodUnits");

// UNSUPPORTED Rust 2187:1: non-scalar type Ptr unsupported
// pub const wszREGCRLDELTAPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLDeltaPeriod");

// UNSUPPORTED Rust 2188:1: non-scalar type Ptr unsupported
// pub const wszREGCRLEDITFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLEditFlags");

// UNSUPPORTED Rust 2189:1: non-scalar type Ptr unsupported
// pub const wszREGCRLFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLFlags");

// UNSUPPORTED Rust 2190:1: non-scalar type Ptr unsupported
// pub const wszREGCRLNEXTPUBLISH: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLNextPublish");

// UNSUPPORTED Rust 2191:1: non-scalar type Ptr unsupported
// pub const wszREGCRLOVERLAPPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLOverlapUnits");

// UNSUPPORTED Rust 2192:1: non-scalar type Ptr unsupported
// pub const wszREGCRLOVERLAPPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLOverlapPeriod");

// UNSUPPORTED Rust 2193:1: non-scalar type Ptr unsupported
// pub const wszREGCRLPATH_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPath");

// UNSUPPORTED Rust 2194:1: non-scalar type Ptr unsupported
// pub const wszREGCRLPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPeriodUnits");

// UNSUPPORTED Rust 2195:1: non-scalar type Ptr unsupported
// pub const wszREGCRLPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPeriod");

// UNSUPPORTED Rust 2196:1: non-scalar type Ptr unsupported
// pub const wszREGCRLPUBLICATIONURLS: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLPublicationURLs");

// UNSUPPORTED Rust 2197:1: non-scalar type Ptr unsupported
// pub const wszREGDATABASERECOVERED: windows_sys::core::PCWSTR = windows_sys::core::w!("DatabaseRecovered");

// UNSUPPORTED Rust 2198:1: non-scalar type Ptr unsupported
// pub const wszREGDBDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("DBDirectory");

// UNSUPPORTED Rust 2199:1: non-scalar type Ptr unsupported
// pub const wszREGDBFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("DBFlags");

// UNSUPPORTED Rust 2200:1: non-scalar type Ptr unsupported
// pub const wszREGDBLASTFULLBACKUP: windows_sys::core::PCWSTR = windows_sys::core::w!("DBLastFullBackup");

// UNSUPPORTED Rust 2201:1: non-scalar type Ptr unsupported
// pub const wszREGDBLASTINCREMENTALBACKUP: windows_sys::core::PCWSTR = windows_sys::core::w!("DBLastIncrementalBackup");

// UNSUPPORTED Rust 2202:1: non-scalar type Ptr unsupported
// pub const wszREGDBLASTRECOVERY: windows_sys::core::PCWSTR = windows_sys::core::w!("DBLastRecovery");

// UNSUPPORTED Rust 2203:1: non-scalar type Ptr unsupported
// pub const wszREGDBLOGDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("DBLogDirectory");

// UNSUPPORTED Rust 2204:1: non-scalar type Ptr unsupported
// pub const wszREGDBMAXREADSESSIONCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("DBMaxReadSessionCount");

// UNSUPPORTED Rust 2205:1: non-scalar type Ptr unsupported
// pub const wszREGDBSESSIONCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("DBSessionCount");

// UNSUPPORTED Rust 2206:1: non-scalar type Ptr unsupported
// pub const wszREGDBSYSDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("DBSystemDirectory");

// UNSUPPORTED Rust 2207:1: non-scalar type Ptr unsupported
// pub const wszREGDBTEMPDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("DBTempDirectory");

// UNSUPPORTED Rust 2208:1: non-scalar type Ptr unsupported
// pub const wszREGDEFAULTSMIME: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultSMIME");

// UNSUPPORTED Rust 2209:1: non-scalar type Ptr unsupported
// pub const wszREGDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigurationDirectory");

// UNSUPPORTED Rust 2210:1: non-scalar type Ptr unsupported
// pub const wszREGDISABLEEXTENSIONLIST: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableExtensionList");

// UNSUPPORTED Rust 2211:1: non-scalar type Ptr unsupported
// pub const wszREGDSCONFIGDN: windows_sys::core::PCWSTR = windows_sys::core::w!("DSConfigDN");

// UNSUPPORTED Rust 2212:1: non-scalar type Ptr unsupported
// pub const wszREGDSDOMAINDN: windows_sys::core::PCWSTR = windows_sys::core::w!("DSDomainDN");

// UNSUPPORTED Rust 2213:1: non-scalar type Ptr unsupported
// pub const wszREGEDITFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("EditFlags");

// UNSUPPORTED Rust 2214:1: non-scalar type Ptr unsupported
// pub const wszREGEKPUBLISTDIRECTORIES: windows_sys::core::PCWSTR = windows_sys::core::w!("EndorsementKeyListDirectories");

// UNSUPPORTED Rust 2215:1: non-scalar type Ptr unsupported
// pub const wszREGEKUOIDSFORPUBLISHEXPIREDCERTINCRL: windows_sys::core::PCWSTR = windows_sys::core::w!("EKUOIDsForPublishExpiredCertInCRL");

// UNSUPPORTED Rust 2216:1: non-scalar type Ptr unsupported
// pub const wszREGEKUOIDSFORVOLATILEREQUESTS: windows_sys::core::PCWSTR = windows_sys::core::w!("EKUOIDsforVolatileRequests");

// UNSUPPORTED Rust 2217:1: non-scalar type Ptr unsupported
// pub const wszREGENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Enabled");

// UNSUPPORTED Rust 2218:1: non-scalar type Ptr unsupported
// pub const wszREGENABLEDEKUFORDEFINEDCACERT: windows_sys::core::PCWSTR = windows_sys::core::w!("EnabledEKUForDefinedCACert");

// UNSUPPORTED Rust 2219:1: non-scalar type Ptr unsupported
// pub const wszREGENABLEENROLLEEREQUESTEXTENSIONLIST: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableEnrolleeRequestExtensionList");

// UNSUPPORTED Rust 2220:1: non-scalar type Ptr unsupported
// pub const wszREGENABLEREQUESTEXTENSIONLIST: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableRequestExtensionList");

// UNSUPPORTED Rust 2221:1: non-scalar type Ptr unsupported
// pub const wszREGENFORCEX500NAMELENGTHS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnforceX500NameLengths");

// UNSUPPORTED Rust 2222:1: non-scalar type Ptr unsupported
// pub const wszREGENROLLFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnrollFlags");

// UNSUPPORTED Rust 2223:1: non-scalar type Ptr unsupported
// pub const wszREGEXITBODYARG: windows_sys::core::PCWSTR = windows_sys::core::w!("BodyArg");

// UNSUPPORTED Rust 2224:1: non-scalar type Ptr unsupported
// pub const wszREGEXITBODYFORMAT: windows_sys::core::PCWSTR = windows_sys::core::w!("BodyFormat");

// UNSUPPORTED Rust 2225:1: non-scalar type Ptr unsupported
// pub const wszREGEXITCRLISSUEDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLIssued");

// UNSUPPORTED Rust 2226:1: non-scalar type Ptr unsupported
// pub const wszREGEXITDENIEDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Denied");

// UNSUPPORTED Rust 2227:1: non-scalar type Ptr unsupported
// pub const wszREGEXITIMPORTEDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Imported");

// UNSUPPORTED Rust 2228:1: non-scalar type Ptr unsupported
// pub const wszREGEXITISSUEDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Issued");

// UNSUPPORTED Rust 2229:1: non-scalar type Ptr unsupported
// pub const wszREGEXITPENDINGKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Pending");

// UNSUPPORTED Rust 2230:1: non-scalar type Ptr unsupported
// pub const wszREGEXITPROPNOTFOUND: windows_sys::core::PCWSTR = windows_sys::core::w!("???");

// UNSUPPORTED Rust 2231:1: non-scalar type Ptr unsupported
// pub const wszREGEXITREVOKEDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Revoked");

// UNSUPPORTED Rust 2232:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSHUTDOWNKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Shutdown");

// UNSUPPORTED Rust 2233:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPAUTHENTICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("SMTPAuthenticate");

// UNSUPPORTED Rust 2234:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPCC: windows_sys::core::PCWSTR = windows_sys::core::w!("Cc");

// UNSUPPORTED Rust 2235:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPEVENTFILTER: windows_sys::core::PCWSTR = windows_sys::core::w!("EventFilter");

// UNSUPPORTED Rust 2236:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPFROM: windows_sys::core::PCWSTR = windows_sys::core::w!("From");

// UNSUPPORTED Rust 2237:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("SMTP");

// UNSUPPORTED Rust 2238:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("SMTPServer");

// UNSUPPORTED Rust 2239:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPTEMPLATES: windows_sys::core::PCWSTR = windows_sys::core::w!("Templates");

// UNSUPPORTED Rust 2240:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSMTPTO: windows_sys::core::PCWSTR = windows_sys::core::w!("To");

// UNSUPPORTED Rust 2241:1: non-scalar type Ptr unsupported
// pub const wszREGEXITSTARTUPKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Startup");

// UNSUPPORTED Rust 2242:1: non-scalar type Ptr unsupported
// pub const wszREGEXITTITLEARG: windows_sys::core::PCWSTR = windows_sys::core::w!("TitleArg");

// UNSUPPORTED Rust 2243:1: non-scalar type Ptr unsupported
// pub const wszREGEXITTITLEFORMAT: windows_sys::core::PCWSTR = windows_sys::core::w!("TitleFormat");

// UNSUPPORTED Rust 2244:1: non-scalar type Ptr unsupported
// pub const wszREGFILEISSUERCERTURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("FileIssuerCertURL");

// UNSUPPORTED Rust 2245:1: non-scalar type Ptr unsupported
// pub const wszREGFILEREVOCATIONCRLURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("FileRevocationCRLURL");

// UNSUPPORTED Rust 2246:1: non-scalar type Ptr unsupported
// pub const wszREGFORCETELETEX: windows_sys::core::PCWSTR = windows_sys::core::w!("ForceTeletex");

// UNSUPPORTED Rust 2247:1: non-scalar type Ptr unsupported
// pub const wszREGFTPISSUERCERTURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("FTPIssuerCertURL");

// UNSUPPORTED Rust 2248:1: non-scalar type Ptr unsupported
// pub const wszREGFTPREVOCATIONCRLURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("FTPRevocationCRLURL");

// UNSUPPORTED Rust 2249:1: non-scalar type Ptr unsupported
// pub const wszREGHIGHLOGNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("HighLogNumber");

// UNSUPPORTED Rust 2250:1: non-scalar type Ptr unsupported
// pub const wszREGHIGHSERIAL: windows_sys::core::PCWSTR = windows_sys::core::w!("HighSerial");

// UNSUPPORTED Rust 2251:1: non-scalar type Ptr unsupported
// pub const wszREGINTERFACEFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("InterfaceFlags");

// UNSUPPORTED Rust 2252:1: non-scalar type Ptr unsupported
// pub const wszREGISSUERCERTURLFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("IssuerCertURLFlags");

// UNSUPPORTED Rust 2253:1: non-scalar type Ptr unsupported
// pub const wszREGISSUERCERTURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("IssuerCertURL");

// UNSUPPORTED Rust 2254:1: non-scalar type Ptr unsupported
// pub const wszREGKEYBASE: windows_sys::core::PCWSTR = windows_sys::core::w!("SYSTEM\\CurrentControlSet\\Services\\CertSvc");

// UNSUPPORTED Rust 2255:1: non-scalar type Ptr unsupported
// pub const wszREGKEYCERTSVCPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("SYSTEM\\CurrentControlSet\\Services\\CertSvc");

// UNSUPPORTED Rust 2256:1: non-scalar type Ptr unsupported
// pub const wszREGKEYCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("Configuration");

// UNSUPPORTED Rust 2257:1: non-scalar type Ptr unsupported
// pub const wszREGKEYCSP: windows_sys::core::PCWSTR = windows_sys::core::w!("CSP");

// UNSUPPORTED Rust 2258:1: non-scalar type Ptr unsupported
// pub const wszREGKEYDBPARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("DBParameters");

// UNSUPPORTED Rust 2259:1: non-scalar type Ptr unsupported
// pub const wszREGKEYENCRYPTIONCSP: windows_sys::core::PCWSTR = windows_sys::core::w!("EncryptionCSP");

// UNSUPPORTED Rust 2260:1: non-scalar type Ptr unsupported
// pub const wszREGKEYENROLLMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Cryptography\\AutoEnrollment");

// UNSUPPORTED Rust 2261:1: non-scalar type Ptr unsupported
// pub const wszREGKEYEXITMODULES: windows_sys::core::PCWSTR = windows_sys::core::w!("ExitModules");

// UNSUPPORTED Rust 2262:1: non-scalar type Ptr unsupported
// pub const wszREGKEYGROUPPOLICYENROLLMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Policies\\Microsoft\\Cryptography\\AutoEnrollment");

// UNSUPPORTED Rust 2263:1: non-scalar type Ptr unsupported
// pub const wszREGKEYNOSYSTEMCERTSVCPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentControlSet\\Services\\CertSvc");

// UNSUPPORTED Rust 2264:1: non-scalar type Ptr unsupported
// pub const wszREGKEYPOLICYMODULES: windows_sys::core::PCWSTR = windows_sys::core::w!("PolicyModules");

// UNSUPPORTED Rust 2265:1: non-scalar type Ptr unsupported
// pub const wszREGKEYREPAIR: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyRepair");

// UNSUPPORTED Rust 2266:1: non-scalar type Ptr unsupported
// pub const wszREGKEYRESTOREINPROGRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("RestoreInProgress");

// UNSUPPORTED Rust 2267:1: non-scalar type Ptr unsupported
// pub const wszREGKEYSIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("KeySize");

// UNSUPPORTED Rust 2268:1: non-scalar type Ptr unsupported
// pub const wszREGKRACERTCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("KRACertCount");

// UNSUPPORTED Rust 2269:1: non-scalar type Ptr unsupported
// pub const wszREGKRACERTHASH: windows_sys::core::PCWSTR = windows_sys::core::w!("KRACertHash");

// UNSUPPORTED Rust 2270:1: non-scalar type Ptr unsupported
// pub const wszREGKRAFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("KRAFlags");

// UNSUPPORTED Rust 2271:1: non-scalar type Ptr unsupported
// pub const wszREGLDAPFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("LDAPFlags");

// UNSUPPORTED Rust 2272:1: non-scalar type Ptr unsupported
// pub const wszREGLDAPISSUERCERTURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("LDAPIssuerCertURL");

// UNSUPPORTED Rust 2273:1: non-scalar type Ptr unsupported
// pub const wszREGLDAPREVOCATIONCRLURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("LDAPRevocationCRLURL");

// UNSUPPORTED Rust 2274:1: non-scalar type Ptr unsupported
// pub const wszREGLDAPREVOCATIONDNTEMPLATE_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("LDAPRevocationDNTemplate");

// UNSUPPORTED Rust 2275:1: non-scalar type Ptr unsupported
// pub const wszREGLDAPREVOCATIONDN_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("LDAPRevocationDN");

// UNSUPPORTED Rust 2276:1: non-scalar type Ptr unsupported
// pub const wszREGLDAPSESSIONOPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("LDAPSessionOptions");

// UNSUPPORTED Rust 2277:1: non-scalar type Ptr unsupported
// pub const wszREGLOGLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("LogLevel");

// UNSUPPORTED Rust 2278:1: non-scalar type Ptr unsupported
// pub const wszREGLOGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("LogPath");

// UNSUPPORTED Rust 2279:1: non-scalar type Ptr unsupported
// pub const wszREGLOWLOGNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("LowLogNumber");

// UNSUPPORTED Rust 2280:1: non-scalar type Ptr unsupported
// pub const wszREGMAXINCOMINGALLOCSIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxIncomingAllocSize");

// UNSUPPORTED Rust 2281:1: non-scalar type Ptr unsupported
// pub const wszREGMAXINCOMINGMESSAGESIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxIncomingMessageSize");

// UNSUPPORTED Rust 2282:1: non-scalar type Ptr unsupported
// pub const wszREGMAXPENDINGREQUESTDAYS: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxPendingRequestDays");

// UNSUPPORTED Rust 2283:1: non-scalar type Ptr unsupported
// pub const wszREGMAXSCTLISTSIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxSCTListSize");

// UNSUPPORTED Rust 2284:1: non-scalar type Ptr unsupported
// pub const wszREGNAMESEPARATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("SubjectNameSeparator");

// UNSUPPORTED Rust 2285:1: non-scalar type Ptr unsupported
// pub const wszREGNETSCAPECERTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("NetscapeCertType");

// UNSUPPORTED Rust 2286:1: non-scalar type Ptr unsupported
// pub const wszREGOFFICERRIGHTS: windows_sys::core::PCWSTR = windows_sys::core::w!("OfficerRights");

// UNSUPPORTED Rust 2287:1: non-scalar type Ptr unsupported
// pub const wszREGPARENTCAMACHINE: windows_sys::core::PCWSTR = windows_sys::core::w!("ParentCAMachine");

// UNSUPPORTED Rust 2288:1: non-scalar type Ptr unsupported
// pub const wszREGPARENTCANAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ParentCAName");

// UNSUPPORTED Rust 2289:1: non-scalar type Ptr unsupported
// pub const wszREGPOLICYFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("PolicyFlags");

// UNSUPPORTED Rust 2290:1: non-scalar type Ptr unsupported
// pub const wszREGPRESERVESCEPDUMMYCERTS: windows_sys::core::PCWSTR = windows_sys::core::w!("PreserveSCEPDummyCerts");

// UNSUPPORTED Rust 2291:1: non-scalar type Ptr unsupported
// pub const wszREGPROCESSINGFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ProcessingFlags");

// UNSUPPORTED Rust 2292:1: non-scalar type Ptr unsupported
// pub const wszREGPROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider");

// UNSUPPORTED Rust 2293:1: non-scalar type Ptr unsupported
// pub const wszREGPROVIDERTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderType");

// UNSUPPORTED Rust 2294:1: non-scalar type Ptr unsupported
// pub const wszREGREQUESTDISPOSITION: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestDisposition");

// UNSUPPORTED Rust 2295:1: non-scalar type Ptr unsupported
// pub const wszREGREQUESTFILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestFileName");

// UNSUPPORTED Rust 2296:1: non-scalar type Ptr unsupported
// pub const wszREGREQUESTID: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestId");

// UNSUPPORTED Rust 2297:1: non-scalar type Ptr unsupported
// pub const wszREGREQUESTKEYCONTAINER: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestKeyContainer");

// UNSUPPORTED Rust 2298:1: non-scalar type Ptr unsupported
// pub const wszREGREQUESTKEYINDEX: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestKeyIndex");

// UNSUPPORTED Rust 2299:1: non-scalar type Ptr unsupported
// pub const wszREGRESTOREMAP: windows_sys::core::PCWSTR = windows_sys::core::w!("RestoreMap");

// UNSUPPORTED Rust 2300:1: non-scalar type Ptr unsupported
// pub const wszREGRESTOREMAPCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("RestoreMapCount");

// UNSUPPORTED Rust 2301:1: non-scalar type Ptr unsupported
// pub const wszREGRESTORESTATUS: windows_sys::core::PCWSTR = windows_sys::core::w!("RestoreStatus");

// UNSUPPORTED Rust 2302:1: non-scalar type Ptr unsupported
// pub const wszREGREVOCATIONCRLURL_OLD: windows_sys::core::PCWSTR = windows_sys::core::w!("RevocationCRLURL");

// UNSUPPORTED Rust 2303:1: non-scalar type Ptr unsupported
// pub const wszREGREVOCATIONTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("RevocationType");

// UNSUPPORTED Rust 2304:1: non-scalar type Ptr unsupported
// pub const wszREGREVOCATIONURL: windows_sys::core::PCWSTR = windows_sys::core::w!("RevocationURL");

// UNSUPPORTED Rust 2305:1: non-scalar type Ptr unsupported
// pub const wszREGROLESEPARATIONENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("RoleSeparationEnabled");

// UNSUPPORTED Rust 2306:1: non-scalar type Ptr unsupported
// pub const wszREGSETUPSTATUS: windows_sys::core::PCWSTR = windows_sys::core::w!("SetupStatus");

// UNSUPPORTED Rust 2307:1: non-scalar type Ptr unsupported
// pub const wszREGSP4DEFAULTCONFIGURATION: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultConfiguration");

// UNSUPPORTED Rust 2308:1: non-scalar type Ptr unsupported
// pub const wszREGSP4KEYSETNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("KeySetName");

// UNSUPPORTED Rust 2309:1: non-scalar type Ptr unsupported
// pub const wszREGSP4NAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("Names");

// UNSUPPORTED Rust 2310:1: non-scalar type Ptr unsupported
// pub const wszREGSP4QUERIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Queries");

// UNSUPPORTED Rust 2311:1: non-scalar type Ptr unsupported
// pub const wszREGSP4SUBJECTNAMESEPARATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("SubjectNameSeparator");

// UNSUPPORTED Rust 2312:1: non-scalar type Ptr unsupported
// pub const wszREGSUBJECTALTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SubjectAltName");

// UNSUPPORTED Rust 2313:1: non-scalar type Ptr unsupported
// pub const wszREGSUBJECTALTNAME2: windows_sys::core::PCWSTR = windows_sys::core::w!("SubjectAltName2");

// UNSUPPORTED Rust 2314:1: non-scalar type Ptr unsupported
// pub const wszREGSUBJECTTEMPLATE: windows_sys::core::PCWSTR = windows_sys::core::w!("SubjectTemplate");

// UNSUPPORTED Rust 2315:1: non-scalar type Ptr unsupported
// pub const wszREGSYMMETRICKEYSIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("SymmetricKeySize");

// UNSUPPORTED Rust 2316:1: non-scalar type Ptr unsupported
// pub const wszREGUNICODE: windows_sys::core::PCWSTR = windows_sys::core::w!("Unicode");

// UNSUPPORTED Rust 2317:1: non-scalar type Ptr unsupported
// pub const wszREGUPNMAP: windows_sys::core::PCWSTR = windows_sys::core::w!("UPNMap");

// UNSUPPORTED Rust 2318:1: non-scalar type Ptr unsupported
// pub const wszREGUSEDEFINEDCACERTINREQ: windows_sys::core::PCWSTR = windows_sys::core::w!("UseDefinedCACertInRequest");

// UNSUPPORTED Rust 2319:1: non-scalar type Ptr unsupported
// pub const wszREGVALIDITYPERIODCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("ValidityPeriodUnits");

// UNSUPPORTED Rust 2320:1: non-scalar type Ptr unsupported
// pub const wszREGVALIDITYPERIODSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("ValidityPeriod");

// UNSUPPORTED Rust 2321:1: non-scalar type Ptr unsupported
// pub const wszREGVERIFYFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("VerifyFlags");

// UNSUPPORTED Rust 2322:1: non-scalar type Ptr unsupported
// pub const wszREGVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// UNSUPPORTED Rust 2323:1: non-scalar type Ptr unsupported
// pub const wszREGVIEWAGEMINUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("ViewAgeMinutes");

// UNSUPPORTED Rust 2324:1: non-scalar type Ptr unsupported
// pub const wszREGVIEWIDLEMINUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("ViewIdleMinutes");

// UNSUPPORTED Rust 2325:1: non-scalar type Ptr unsupported
// pub const wszREGWEBCLIENTCAMACHINE: windows_sys::core::PCWSTR = windows_sys::core::w!("WebClientCAMachine");

// UNSUPPORTED Rust 2326:1: non-scalar type Ptr unsupported
// pub const wszREGWEBCLIENTCANAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WebClientCAName");

// UNSUPPORTED Rust 2327:1: non-scalar type Ptr unsupported
// pub const wszREGWEBCLIENTCATYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("WebClientCAType");

// UNSUPPORTED Rust 2328:1: non-scalar type Ptr unsupported
// pub const wszSECUREDATTRIBUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("SignedAttributes");

// UNSUPPORTED Rust 2329:1: non-scalar type Ptr unsupported
// pub const wszSERVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CertSvc");

// UNSUPPORTED Rust 2330:1: non-scalar type Ptr unsupported
// pub const wszzDEFAULTSIGNEDATTRIBUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("RequesterName\u{0}");

