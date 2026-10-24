// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography_Catalog")]
// pub mod Catalog;

// UNSUPPORTED Rust 3:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography_Certificates")]
// pub mod Certificates;

// UNSUPPORTED Rust 5:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography_Sip")]
// pub mod Sip;

// UNSUPPORTED Rust 7:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography_UI")]
// pub mod UI;

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptAddContextFunction(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pszfunction : windows_sys::core::PCWSTR, dwposition : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptAddContextFunctionProvider(dwtable : u32, pszcontext : windows_sys::core::PCWSTR, dwinterface : u32, pszfunction : windows_sys::core::PCWSTR, pszprovider : windows_sys::core::PCWSTR, dwposition : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptCloseAlgorithmProvider(halgorithm : BCRYPT_ALG_HANDLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptConfigureContext(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, pconfig : *const CRYPT_CONTEXT_CONFIG) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptConfigureContextFunction(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pszfunction : windows_sys::core::PCWSTR, pconfig : *const CRYPT_CONTEXT_FUNCTION_CONFIG) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptCreateContext(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, pconfig : *const CRYPT_CONTEXT_CONFIG) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptCreateHash(halgorithm : BCRYPT_ALG_HANDLE, phhash : *mut BCRYPT_HASH_HANDLE, pbhashobject : *mut u8, cbhashobject : u32, pbsecret : *const u8, cbsecret : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptCreateMultiHash(halgorithm : BCRYPT_ALG_HANDLE, phhash : *mut BCRYPT_HASH_HANDLE, nhashes : u32, pbhashobject : *mut u8, cbhashobject : u32, pbsecret : *const u8, cbsecret : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDecrypt(hkey : BCRYPT_KEY_HANDLE, pbinput : *const u8, cbinput : u32, ppaddinginfo : *const core::ffi::c_void, pbiv : *mut u8, cbiv : u32, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : BCRYPT_FLAGS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDeleteContext(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDeriveKey(hsharedsecret : BCRYPT_SECRET_HANDLE, pwszkdf : windows_sys::core::PCWSTR, pparameterlist : *const BCryptBufferDesc, pbderivedkey : *mut u8, cbderivedkey : u32, pcbresult : *mut u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDeriveKeyCapi(hhash : BCRYPT_HASH_HANDLE, htargetalg : BCRYPT_ALG_HANDLE, pbderivedkey : *mut u8, cbderivedkey : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDeriveKeyPBKDF2(hprf : BCRYPT_ALG_HANDLE, pbpassword : *const u8, cbpassword : u32, pbsalt : *const u8, cbsalt : u32, citerations : u64, pbderivedkey : *mut u8, cbderivedkey : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDestroyHash(hhash : BCRYPT_HASH_HANDLE) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDestroyKey(hkey : BCRYPT_KEY_HANDLE) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDestroySecret(hsecret : BCRYPT_SECRET_HANDLE) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDuplicateHash(hhash : BCRYPT_HASH_HANDLE, phnewhash : *mut BCRYPT_HASH_HANDLE, pbhashobject : *mut u8, cbhashobject : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptDuplicateKey(hkey : BCRYPT_KEY_HANDLE, phnewkey : *mut BCRYPT_KEY_HANDLE, pbkeyobject : *mut u8, cbkeyobject : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptEncrypt(hkey : BCRYPT_KEY_HANDLE, pbinput : *const u8, cbinput : u32, ppaddinginfo : *const core::ffi::c_void, pbiv : *mut u8, cbiv : u32, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : BCRYPT_FLAGS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptEnumAlgorithms(dwalgoperations : BCRYPT_OPERATION, palgcount : *mut u32, ppalglist : *mut *mut BCRYPT_ALGORITHM_IDENTIFIER, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptEnumContextFunctionProviders(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pszfunction : windows_sys::core::PCWSTR, pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_CONTEXT_FUNCTION_PROVIDERS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptEnumContextFunctions(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_CONTEXT_FUNCTIONS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptEnumContexts(dwtable : BCRYPT_TABLE, pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_CONTEXTS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptEnumProviders(pszalgid : windows_sys::core::PCWSTR, pimplcount : *mut u32, ppimpllist : *mut *mut BCRYPT_PROVIDER_NAME, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptEnumRegisteredProviders(pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_PROVIDERS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptExportKey(hkey : BCRYPT_KEY_HANDLE, hexportkey : BCRYPT_KEY_HANDLE, pszblobtype : windows_sys::core::PCWSTR, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptFinalizeKeyPair(hkey : BCRYPT_KEY_HANDLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptFinishHash(hhash : BCRYPT_HASH_HANDLE, pboutput : *mut u8, cboutput : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptFreeBuffer(pvbuffer : *const core::ffi::c_void));

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptGenRandom(halgorithm : BCRYPT_ALG_HANDLE, pbbuffer : *mut u8, cbbuffer : u32, dwflags : BCRYPTGENRANDOM_FLAGS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptGenerateKeyPair(halgorithm : BCRYPT_ALG_HANDLE, phkey : *mut BCRYPT_KEY_HANDLE, dwlength : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptGenerateSymmetricKey(halgorithm : BCRYPT_ALG_HANDLE, phkey : *mut BCRYPT_KEY_HANDLE, pbkeyobject : *mut u8, cbkeyobject : u32, pbsecret : *const u8, cbsecret : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptGetFipsAlgorithmMode(pfenabled : *mut u8) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptGetProperty(hobject : BCRYPT_HANDLE, pszproperty : windows_sys::core::PCWSTR, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptHash(halgorithm : BCRYPT_ALG_HANDLE, pbsecret : *const u8, cbsecret : u32, pbinput : *const u8, cbinput : u32, pboutput : *mut u8, cboutput : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptHashData(hhash : BCRYPT_HASH_HANDLE, pbinput : *const u8, cbinput : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptImportKey(halgorithm : BCRYPT_ALG_HANDLE, himportkey : BCRYPT_KEY_HANDLE, pszblobtype : windows_sys::core::PCWSTR, phkey : *mut BCRYPT_KEY_HANDLE, pbkeyobject : *mut u8, cbkeyobject : u32, pbinput : *const u8, cbinput : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptImportKeyPair(halgorithm : BCRYPT_ALG_HANDLE, himportkey : BCRYPT_KEY_HANDLE, pszblobtype : windows_sys::core::PCWSTR, phkey : *mut BCRYPT_KEY_HANDLE, pbinput : *const u8, cbinput : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptKeyDerivation(hkey : BCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, pbderivedkey : *mut u8, cbderivedkey : u32, pcbresult : *mut u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptOpenAlgorithmProvider(phalgorithm : *mut BCRYPT_ALG_HANDLE, pszalgid : windows_sys::core::PCWSTR, pszimplementation : windows_sys::core::PCWSTR, dwflags : BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptProcessMultiOperations(hobject : BCRYPT_HANDLE, operationtype : BCRYPT_MULTI_OPERATION_TYPE, poperations : *const core::ffi::c_void, cboperations : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptQueryContextConfiguration(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_CONTEXT_CONFIG) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptQueryContextFunctionConfiguration(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pszfunction : windows_sys::core::PCWSTR, pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_CONTEXT_FUNCTION_CONFIG) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptQueryContextFunctionProperty(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pszfunction : windows_sys::core::PCWSTR, pszproperty : windows_sys::core::PCWSTR, pcbvalue : *mut u32, ppbvalue : *mut *mut u8) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptQueryProviderRegistration(pszprovider : windows_sys::core::PCWSTR, dwmode : BCRYPT_QUERY_PROVIDER_MODE, dwinterface : BCRYPT_INTERFACE, pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_PROVIDER_REG) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptRegisterConfigChangeNotify(phevent : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptRegisterProvider(pszprovider : windows_sys::core::PCWSTR, dwflags : u32, preg : *const CRYPT_PROVIDER_REG) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptRemoveContextFunction(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pszfunction : windows_sys::core::PCWSTR) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptRemoveContextFunctionProvider(dwtable : u32, pszcontext : windows_sys::core::PCWSTR, dwinterface : u32, pszfunction : windows_sys::core::PCWSTR, pszprovider : windows_sys::core::PCWSTR) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptResolveProviders(pszcontext : windows_sys::core::PCWSTR, dwinterface : u32, pszfunction : windows_sys::core::PCWSTR, pszprovider : windows_sys::core::PCWSTR, dwmode : BCRYPT_QUERY_PROVIDER_MODE, dwflags : BCRYPT_RESOLVE_PROVIDERS_FLAGS, pcbbuffer : *mut u32, ppbuffer : *mut *mut CRYPT_PROVIDER_REFS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptSecretAgreement(hprivkey : BCRYPT_KEY_HANDLE, hpubkey : BCRYPT_KEY_HANDLE, phagreedsecret : *mut BCRYPT_SECRET_HANDLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptSetContextFunctionProperty(dwtable : BCRYPT_TABLE, pszcontext : windows_sys::core::PCWSTR, dwinterface : BCRYPT_INTERFACE, pszfunction : windows_sys::core::PCWSTR, pszproperty : windows_sys::core::PCWSTR, cbvalue : u32, pbvalue : *const u8) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptSetProperty(hobject : BCRYPT_HANDLE, pszproperty : windows_sys::core::PCWSTR, pbinput : *const u8, cbinput : u32, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptSignHash(hkey : BCRYPT_KEY_HANDLE, ppaddinginfo : *const core::ffi::c_void, pbinput : *const u8, cbinput : u32, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : BCRYPT_FLAGS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptUnregisterConfigChangeNotify(hevent : super::super::Foundation:: HANDLE) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptUnregisterProvider(pszprovider : windows_sys::core::PCWSTR) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("bcrypt.dll" "system" fn BCryptVerifySignature(hkey : BCRYPT_KEY_HANDLE, ppaddinginfo : *const core::ffi::c_void, pbhash : *const u8, cbhash : u32, pbsignature : *const u8, cbsignature : u32, dwflags : BCRYPT_FLAGS) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddCRLContextToStore(hcertstore : HCERTSTORE, pcrlcontext : *const CRL_CONTEXT, dwadddisposition : u32, ppstorecontext : *mut *mut CRL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddCRLLinkToStore(hcertstore : HCERTSTORE, pcrlcontext : *const CRL_CONTEXT, dwadddisposition : u32, ppstorecontext : *mut *mut CRL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddCTLContextToStore(hcertstore : HCERTSTORE, pctlcontext : *const CTL_CONTEXT, dwadddisposition : u32, ppstorecontext : *mut *mut CTL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddCTLLinkToStore(hcertstore : HCERTSTORE, pctlcontext : *const CTL_CONTEXT, dwadddisposition : u32, ppstorecontext : *mut *mut CTL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddCertificateContextToStore(hcertstore : HCERTSTORE, pcertcontext : *const CERT_CONTEXT, dwadddisposition : u32, ppstorecontext : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddCertificateLinkToStore(hcertstore : HCERTSTORE, pcertcontext : *const CERT_CONTEXT, dwadddisposition : u32, ppstorecontext : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddEncodedCRLToStore(hcertstore : HCERTSTORE, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbcrlencoded : *const u8, cbcrlencoded : u32, dwadddisposition : u32, ppcrlcontext : *mut *mut CRL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddEncodedCTLToStore(hcertstore : HCERTSTORE, dwmsgandcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbctlencoded : *const u8, cbctlencoded : u32, dwadddisposition : u32, ppctlcontext : *mut *mut CTL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddEncodedCertificateToStore(hcertstore : HCERTSTORE, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbcertencoded : *const u8, cbcertencoded : u32, dwadddisposition : u32, ppcertcontext : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddEncodedCertificateToSystemStoreA(szcertstorename : windows_sys::core::PCSTR, pbcertencoded : *const u8, cbcertencoded : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddEncodedCertificateToSystemStoreW(szcertstorename : windows_sys::core::PCWSTR, pbcertencoded : *const u8, cbcertencoded : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddEnhancedKeyUsageIdentifier(pcertcontext : *const CERT_CONTEXT, pszusageidentifier : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddRefServerOcspResponse(hserverocspresponse : *const core::ffi::c_void));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddRefServerOcspResponseContext(pserverocspresponsecontext : *const CERT_SERVER_OCSP_RESPONSE_CONTEXT));

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddSerializedElementToStore(hcertstore : HCERTSTORE, pbelement : *const u8, cbelement : u32, dwadddisposition : u32, dwflags : u32, dwcontexttypeflags : u32, pdwcontexttype : *mut u32, ppvcontext : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAddStoreToCollection(hcollectionstore : HCERTSTORE, hsiblingstore : HCERTSTORE, dwupdateflags : u32, dwpriority : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertAlgIdToOID(dwalgid : u32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCloseServerOcspResponse(hserverocspresponse : *const core::ffi::c_void, dwflags : u32));

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCloseStore(hcertstore : HCERTSTORE, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCompareCertificate(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pcertid1 : *const CERT_INFO, pcertid2 : *const CERT_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCompareCertificateName(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pcertname1 : *const CRYPT_INTEGER_BLOB, pcertname2 : *const CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCompareIntegerBlob(pint1 : *const CRYPT_INTEGER_BLOB, pint2 : *const CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertComparePublicKeyInfo(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, ppublickey1 : *const CERT_PUBLIC_KEY_INFO, ppublickey2 : *const CERT_PUBLIC_KEY_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertControlStore(hcertstore : HCERTSTORE, dwflags : CERT_CONTROL_STORE_FLAGS, dwctrltype : u32, pvctrlpara : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCreateCRLContext(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbcrlencoded : *const u8, cbcrlencoded : u32) -> *mut CRL_CONTEXT);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCreateCTLContext(dwmsgandcertencodingtype : u32, pbctlencoded : *const u8, cbctlencoded : u32) -> *mut CTL_CONTEXT);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCreateCTLEntryFromCertificateContextProperties(pcertcontext : *const CERT_CONTEXT, coptattr : u32, rgoptattr : *const CRYPT_ATTRIBUTE, dwflags : u32, pvreserved : *const core::ffi::c_void, pctlentry : *mut CTL_ENTRY, pcbctlentry : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCreateCertificateChainEngine(pconfig : *const CERT_CHAIN_ENGINE_CONFIG, phchainengine : *mut HCERTCHAINENGINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCreateCertificateContext(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbcertencoded : *const u8, cbcertencoded : u32) -> *mut CERT_CONTEXT);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCreateContext(dwcontexttype : u32, dwencodingtype : u32, pbencoded : *const u8, cbencoded : u32, dwflags : u32, pcreatepara : *const CERT_CREATE_CONTEXT_PARA) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertCreateSelfSignCertificate(hcryptprovorncryptkey : HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, psubjectissuerblob : *const CRYPT_INTEGER_BLOB, dwflags : CERT_CREATE_SELFSIGN_FLAGS, pkeyprovinfo : *const CRYPT_KEY_PROV_INFO, psignaturealgorithm : *const CRYPT_ALGORITHM_IDENTIFIER, pstarttime : *const super::super::Foundation:: SYSTEMTIME, pendtime : *const super::super::Foundation:: SYSTEMTIME, pextensions : *const CERT_EXTENSIONS) -> *mut CERT_CONTEXT);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDeleteCRLFromStore(pcrlcontext : *const CRL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDeleteCTLFromStore(pctlcontext : *const CTL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDeleteCertificateFromStore(pcertcontext : *const CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDuplicateCRLContext(pcrlcontext : *const CRL_CONTEXT) -> *mut CRL_CONTEXT);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDuplicateCTLContext(pctlcontext : *const CTL_CONTEXT) -> *mut CTL_CONTEXT);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDuplicateCertificateChain(pchaincontext : *const CERT_CHAIN_CONTEXT) -> *mut CERT_CHAIN_CONTEXT);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDuplicateCertificateContext(pcertcontext : *const CERT_CONTEXT) -> *mut CERT_CONTEXT);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertDuplicateStore(hcertstore : HCERTSTORE) -> HCERTSTORE);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumCRLContextProperties(pcrlcontext : *const CRL_CONTEXT, dwpropid : u32) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumCRLsInStore(hcertstore : HCERTSTORE, pprevcrlcontext : *const CRL_CONTEXT) -> *mut CRL_CONTEXT);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumCTLContextProperties(pctlcontext : *const CTL_CONTEXT, dwpropid : u32) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumCTLsInStore(hcertstore : HCERTSTORE, pprevctlcontext : *const CTL_CONTEXT) -> *mut CTL_CONTEXT);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumCertificateContextProperties(pcertcontext : *const CERT_CONTEXT, dwpropid : u32) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumCertificatesInStore(hcertstore : HCERTSTORE, pprevcertcontext : *const CERT_CONTEXT) -> *mut CERT_CONTEXT);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumPhysicalStore(pvsystemstore : *const core::ffi::c_void, dwflags : u32, pvarg : *mut core::ffi::c_void, pfnenum : PFN_CERT_ENUM_PHYSICAL_STORE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumSubjectInSortedCTL(pctlcontext : *const CTL_CONTEXT, ppvnextsubject : *mut *mut core::ffi::c_void, psubjectidentifier : *mut CRYPT_INTEGER_BLOB, pencodedattributes : *mut CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumSystemStore(dwflags : u32, pvsystemstorelocationpara : *const core::ffi::c_void, pvarg : *mut core::ffi::c_void, pfnenum : PFN_CERT_ENUM_SYSTEM_STORE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertEnumSystemStoreLocation(dwflags : u32, pvarg : *mut core::ffi::c_void, pfnenum : PFN_CERT_ENUM_SYSTEM_STORE_LOCATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindAttribute(pszobjid : windows_sys::core::PCSTR, cattr : u32, rgattr : *const CRYPT_ATTRIBUTE) -> *mut CRYPT_ATTRIBUTE);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindCRLInStore(hcertstore : HCERTSTORE, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, dwfindflags : u32, dwfindtype : u32, pvfindpara : *const core::ffi::c_void, pprevcrlcontext : *const CRL_CONTEXT) -> *mut CRL_CONTEXT);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindCTLInStore(hcertstore : HCERTSTORE, dwmsgandcertencodingtype : u32, dwfindflags : u32, dwfindtype : CERT_FIND_TYPE, pvfindpara : *const core::ffi::c_void, pprevctlcontext : *const CTL_CONTEXT) -> *mut CTL_CONTEXT);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindCertificateInCRL(pcert : *const CERT_CONTEXT, pcrlcontext : *const CRL_CONTEXT, dwflags : u32, pvreserved : *const core::ffi::c_void, ppcrlentry : *mut *mut CRL_ENTRY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindCertificateInStore(hcertstore : HCERTSTORE, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, dwfindflags : u32, dwfindtype : CERT_FIND_FLAGS, pvfindpara : *const core::ffi::c_void, pprevcertcontext : *const CERT_CONTEXT) -> *mut CERT_CONTEXT);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindChainInStore(hcertstore : HCERTSTORE, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, dwfindflags : CERT_FIND_CHAIN_IN_STORE_FLAGS, dwfindtype : u32, pvfindpara : *const core::ffi::c_void, pprevchaincontext : *const CERT_CHAIN_CONTEXT) -> *mut CERT_CHAIN_CONTEXT);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindExtension(pszobjid : windows_sys::core::PCSTR, cextensions : u32, rgextensions : *const CERT_EXTENSION) -> *mut CERT_EXTENSION);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindRDNAttr(pszobjid : windows_sys::core::PCSTR, pname : *const CERT_NAME_INFO) -> *mut CERT_RDN_ATTR);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindSubjectInCTL(dwencodingtype : u32, dwsubjecttype : u32, pvsubject : *const core::ffi::c_void, pctlcontext : *const CTL_CONTEXT, dwflags : u32) -> *mut CTL_ENTRY);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFindSubjectInSortedCTL(psubjectidentifier : *const CRYPT_INTEGER_BLOB, pctlcontext : *const CTL_CONTEXT, dwflags : u32, pvreserved : *const core::ffi::c_void, pencodedattributes : *mut CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFreeCRLContext(pcrlcontext : *const CRL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFreeCTLContext(pctlcontext : *const CTL_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFreeCertificateChain(pchaincontext : *const CERT_CHAIN_CONTEXT));

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFreeCertificateChainEngine(hchainengine : HCERTCHAINENGINE));

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFreeCertificateChainList(prgpselection : *const *const CERT_CHAIN_CONTEXT));

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFreeCertificateContext(pcertcontext : *const CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertFreeServerOcspResponseContext(pserverocspresponsecontext : *const CERT_SERVER_OCSP_RESPONSE_CONTEXT));

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetCRLContextProperty(pcrlcontext : *const CRL_CONTEXT, dwpropid : u32, pvdata : *mut core::ffi::c_void, pcbdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetCRLFromStore(hcertstore : HCERTSTORE, pissuercontext : *const CERT_CONTEXT, pprevcrlcontext : *const CRL_CONTEXT, pdwflags : *mut u32) -> *mut CRL_CONTEXT);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetCTLContextProperty(pctlcontext : *const CTL_CONTEXT, dwpropid : u32, pvdata : *mut core::ffi::c_void, pcbdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetCertificateChain(hchainengine : HCERTCHAINENGINE, pcertcontext : *const CERT_CONTEXT, ptime : *const super::super::Foundation:: FILETIME, hadditionalstore : HCERTSTORE, pchainpara : *const CERT_CHAIN_PARA, dwflags : u32, pvreserved : *const core::ffi::c_void, ppchaincontext : *mut *mut CERT_CHAIN_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetCertificateContextProperty(pcertcontext : *const CERT_CONTEXT, dwpropid : u32, pvdata : *mut core::ffi::c_void, pcbdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetEnhancedKeyUsage(pcertcontext : *const CERT_CONTEXT, dwflags : u32, pusage : *mut CTL_USAGE, pcbusage : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetIntendedKeyUsage(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pcertinfo : *const CERT_INFO, pbkeyusage : *mut u8, cbkeyusage : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetIssuerCertificateFromStore(hcertstore : HCERTSTORE, psubjectcontext : *const CERT_CONTEXT, pprevissuercontext : *const CERT_CONTEXT, pdwflags : *mut u32) -> *mut CERT_CONTEXT);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetNameStringA(pcertcontext : *const CERT_CONTEXT, dwtype : u32, dwflags : u32, pvtypepara : *const core::ffi::c_void, psznamestring : windows_sys::core::PSTR, cchnamestring : u32) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetNameStringW(pcertcontext : *const CERT_CONTEXT, dwtype : u32, dwflags : u32, pvtypepara : *const core::ffi::c_void, psznamestring : windows_sys::core::PWSTR, cchnamestring : u32) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetPublicKeyLength(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, ppublickey : *const CERT_PUBLIC_KEY_INFO) -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetServerOcspResponseContext(hserverocspresponse : *const core::ffi::c_void, dwflags : u32, pvreserved : *const core::ffi::c_void) -> *mut CERT_SERVER_OCSP_RESPONSE_CONTEXT);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetStoreProperty(hcertstore : HCERTSTORE, dwpropid : u32, pvdata : *mut core::ffi::c_void, pcbdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetSubjectCertificateFromStore(hcertstore : HCERTSTORE, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pcertid : *const CERT_INFO) -> *mut CERT_CONTEXT);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertGetValidUsages(ccerts : u32, rghcerts : *const *const CERT_CONTEXT, cnumoids : *mut i32, rghoids : *mut windows_sys::core::PSTR, pcboids : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertIsRDNAttrsInCertificateName(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, dwflags : u32, pcertname : *const CRYPT_INTEGER_BLOB, prdn : *const CERT_RDN) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertIsStrongHashToSign(pstrongsignpara : *const CERT_STRONG_SIGN_PARA, pwszcnghashalgid : windows_sys::core::PCWSTR, psigningcert : *const CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertIsValidCRLForCertificate(pcert : *const CERT_CONTEXT, pcrl : *const CRL_CONTEXT, dwflags : u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertIsWeakHash(dwhashusetype : u32, pwszcnghashalgid : windows_sys::core::PCWSTR, dwchainflags : u32, psignerchaincontext : *const CERT_CHAIN_CONTEXT, ptimestamp : *const super::super::Foundation:: FILETIME, pwszfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertNameToStrA(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pname : *const CRYPT_INTEGER_BLOB, dwstrtype : CERT_STRING_TYPE, psz : windows_sys::core::PSTR, csz : u32) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertNameToStrW(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pname : *const CRYPT_INTEGER_BLOB, dwstrtype : CERT_STRING_TYPE, psz : windows_sys::core::PWSTR, csz : u32) -> u32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertOIDToAlgId(pszobjid : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertOpenServerOcspResponse(pchaincontext : *const CERT_CHAIN_CONTEXT, dwflags : u32, popenpara : *const CERT_SERVER_OCSP_RESPONSE_OPEN_PARA) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertOpenStore(lpszstoreprovider : windows_sys::core::PCSTR, dwencodingtype : CERT_QUERY_ENCODING_TYPE, hcryptprov : HCRYPTPROV_LEGACY, dwflags : CERT_OPEN_STORE_FLAGS, pvpara : *const core::ffi::c_void) -> HCERTSTORE);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertOpenSystemStoreA(hprov : HCRYPTPROV_LEGACY, szsubsystemprotocol : windows_sys::core::PCSTR) -> HCERTSTORE);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertOpenSystemStoreW(hprov : HCRYPTPROV_LEGACY, szsubsystemprotocol : windows_sys::core::PCWSTR) -> HCERTSTORE);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertRDNValueToStrA(dwvaluetype : u32, pvalue : *const CRYPT_INTEGER_BLOB, psz : windows_sys::core::PSTR, csz : u32) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertRDNValueToStrW(dwvaluetype : u32, pvalue : *const CRYPT_INTEGER_BLOB, psz : windows_sys::core::PWSTR, csz : u32) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertRegisterPhysicalStore(pvsystemstore : *const core::ffi::c_void, dwflags : u32, pwszstorename : windows_sys::core::PCWSTR, pstoreinfo : *const CERT_PHYSICAL_STORE_INFO, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertRegisterSystemStore(pvsystemstore : *const core::ffi::c_void, dwflags : u32, pstoreinfo : *const CERT_SYSTEM_STORE_INFO, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertRemoveEnhancedKeyUsageIdentifier(pcertcontext : *const CERT_CONTEXT, pszusageidentifier : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertRemoveStoreFromCollection(hcollectionstore : HCERTSTORE, hsiblingstore : HCERTSTORE));

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertResyncCertificateChainEngine(hchainengine : HCERTCHAINENGINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertRetrieveLogoOrBiometricInfo(pcertcontext : *const CERT_CONTEXT, lpszlogoorbiometrictype : windows_sys::core::PCSTR, dwretrievalflags : u32, dwtimeout : u32, dwflags : u32, pvreserved : *const core::ffi::c_void, ppbdata : *mut *mut u8, pcbdata : *mut u32, ppwszmimetype : *mut windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSaveStore(hcertstore : HCERTSTORE, dwencodingtype : CERT_QUERY_ENCODING_TYPE, dwsaveas : CERT_STORE_SAVE_AS, dwsaveto : CERT_STORE_SAVE_TO, pvsavetopara : *mut core::ffi::c_void, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSelectCertificateChains(pselectioncontext : *const windows_sys::core::GUID, dwflags : u32, pchainparameters : *const CERT_SELECT_CHAIN_PARA, ccriteria : u32, rgpcriteria : *const CERT_SELECT_CRITERIA, hstore : HCERTSTORE, pcselection : *mut u32, pprgpselection : *mut *mut *mut CERT_CHAIN_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSerializeCRLStoreElement(pcrlcontext : *const CRL_CONTEXT, dwflags : u32, pbelement : *mut u8, pcbelement : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSerializeCTLStoreElement(pctlcontext : *const CTL_CONTEXT, dwflags : u32, pbelement : *mut u8, pcbelement : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSerializeCertificateStoreElement(pcertcontext : *const CERT_CONTEXT, dwflags : u32, pbelement : *mut u8, pcbelement : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSetCRLContextProperty(pcrlcontext : *const CRL_CONTEXT, dwpropid : u32, dwflags : u32, pvdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSetCTLContextProperty(pctlcontext : *const CTL_CONTEXT, dwpropid : u32, dwflags : u32, pvdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSetCertificateContextPropertiesFromCTLEntry(pcertcontext : *const CERT_CONTEXT, pctlentry : *const CTL_ENTRY, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSetCertificateContextProperty(pcertcontext : *const CERT_CONTEXT, dwpropid : u32, dwflags : u32, pvdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSetEnhancedKeyUsage(pcertcontext : *const CERT_CONTEXT, pusage : *const CTL_USAGE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertSetStoreProperty(hcertstore : HCERTSTORE, dwpropid : u32, dwflags : u32, pvdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertStrToNameA(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pszx500 : windows_sys::core::PCSTR, dwstrtype : CERT_STRING_TYPE, pvreserved : *const core::ffi::c_void, pbencoded : *mut u8, pcbencoded : *mut u32, ppszerror : *mut windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertStrToNameW(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pszx500 : windows_sys::core::PCWSTR, dwstrtype : CERT_STRING_TYPE, pvreserved : *const core::ffi::c_void, pbencoded : *mut u8, pcbencoded : *mut u32, ppszerror : *mut windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertUnregisterPhysicalStore(pvsystemstore : *const core::ffi::c_void, dwflags : u32, pwszstorename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertUnregisterSystemStore(pvsystemstore : *const core::ffi::c_void, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifyCRLRevocation(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pcertid : *const CERT_INFO, ccrlinfo : u32, rgpcrlinfo : *const *const CRL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifyCRLTimeValidity(ptimetoverify : *const super::super::Foundation:: FILETIME, pcrlinfo : *const CRL_INFO) -> i32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifyCTLUsage(dwencodingtype : u32, dwsubjecttype : u32, pvsubject : *const core::ffi::c_void, psubjectusage : *const CTL_USAGE, dwflags : u32, pverifyusagepara : *const CTL_VERIFY_USAGE_PARA, pverifyusagestatus : *mut CTL_VERIFY_USAGE_STATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifyCertificateChainPolicy(pszpolicyoid : windows_sys::core::PCSTR, pchaincontext : *const CERT_CHAIN_CONTEXT, ppolicypara : *const CERT_CHAIN_POLICY_PARA, ppolicystatus : *mut CERT_CHAIN_POLICY_STATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifyRevocation(dwencodingtype : u32, dwrevtype : u32, ccontext : u32, rgpvcontext : *const *const core::ffi::c_void, dwflags : u32, prevpara : *const CERT_REVOCATION_PARA, prevstatus : *mut CERT_REVOCATION_STATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifySubjectCertificateContext(psubject : *const CERT_CONTEXT, pissuer : *const CERT_CONTEXT, pdwflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifyTimeValidity(ptimetoverify : *const super::super::Foundation:: FILETIME, pcertinfo : *const CERT_INFO) -> i32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CertVerifyValidityNesting(psubjectinfo : *const CERT_INFO, pissuerinfo : *const CERT_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn CloseCryptoHandle(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptAcquireCertificatePrivateKey(pcert : *const CERT_CONTEXT, dwflags : CRYPT_ACQUIRE_FLAGS, pvparameters : *const core::ffi::c_void, phcryptprovorncryptkey : *mut HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, pdwkeyspec : *mut CERT_KEY_SPEC, pfcallerfreeprovorncryptkey : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptAcquireContextA(phprov : *mut usize, szcontainer : windows_sys::core::PCSTR, szprovider : windows_sys::core::PCSTR, dwprovtype : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptAcquireContextW(phprov : *mut usize, szcontainer : windows_sys::core::PCWSTR, szprovider : windows_sys::core::PCWSTR, dwprovtype : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptBinaryToStringA(pbbinary : *const u8, cbbinary : u32, dwflags : CRYPT_STRING, pszstring : windows_sys::core::PSTR, pcchstring : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptBinaryToStringW(pbbinary : *const u8, cbbinary : u32, dwflags : CRYPT_STRING, pszstring : windows_sys::core::PWSTR, pcchstring : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptCloseAsyncHandle(hasync : HCRYPTASYNC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptContextAddRef(hprov : usize, pdwreserved : *const u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptCreateAsyncHandle(dwflags : u32, phasync : *mut HCRYPTASYNC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptCreateHash(hprov : usize, algid : ALG_ID, hkey : usize, dwflags : u32, phhash : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptCreateKeyIdentifierFromCSP(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pszpubkeyoid : windows_sys::core::PCSTR, ppubkeystruc : *const PUBLICKEYSTRUC, cbpubkeystruc : u32, dwflags : u32, pvreserved : *const core::ffi::c_void, pbhash : *mut u8, pcbhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptDecodeMessage(dwmsgtypeflags : u32, pdecryptpara : *const CRYPT_DECRYPT_MESSAGE_PARA, pverifypara : *const CRYPT_VERIFY_MESSAGE_PARA, dwsignerindex : u32, pbencodedblob : *const u8, cbencodedblob : u32, dwprevinnercontenttype : u32, pdwmsgtype : *mut u32, pdwinnercontenttype : *mut u32, pbdecoded : *mut u8, pcbdecoded : *mut u32, ppxchgcert : *mut *mut CERT_CONTEXT, ppsignercert : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptDecodeObject(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, lpszstructtype : windows_sys::core::PCSTR, pbencoded : *const u8, cbencoded : u32, dwflags : u32, pvstructinfo : *mut core::ffi::c_void, pcbstructinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptDecodeObjectEx(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, lpszstructtype : windows_sys::core::PCSTR, pbencoded : *const u8, cbencoded : u32, dwflags : u32, pdecodepara : *const CRYPT_DECODE_PARA, pvstructinfo : *mut core::ffi::c_void, pcbstructinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptDecrypt(hkey : usize, hhash : usize, r#final : windows_sys::core::BOOL, dwflags : u32, pbdata : *mut u8, pdwdatalen : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptDecryptAndVerifyMessageSignature(pdecryptpara : *const CRYPT_DECRYPT_MESSAGE_PARA, pverifypara : *const CRYPT_VERIFY_MESSAGE_PARA, dwsignerindex : u32, pbencryptedblob : *const u8, cbencryptedblob : u32, pbdecrypted : *mut u8, pcbdecrypted : *mut u32, ppxchgcert : *mut *mut CERT_CONTEXT, ppsignercert : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptDecryptMessage(pdecryptpara : *const CRYPT_DECRYPT_MESSAGE_PARA, pbencryptedblob : *const u8, cbencryptedblob : u32, pbdecrypted : *mut u8, pcbdecrypted : *mut u32, ppxchgcert : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptDeriveKey(hprov : usize, algid : ALG_ID, hbasedata : usize, dwflags : u32, phkey : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptDestroyHash(hhash : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptDestroyKey(hkey : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptDuplicateHash(hhash : usize, pdwreserved : *const u32, dwflags : u32, phhash : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptDuplicateKey(hkey : usize, pdwreserved : *const u32, dwflags : u32, phkey : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptEncodeObject(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, lpszstructtype : windows_sys::core::PCSTR, pvstructinfo : *const core::ffi::c_void, pbencoded : *mut u8, pcbencoded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptEncodeObjectEx(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, lpszstructtype : windows_sys::core::PCSTR, pvstructinfo : *const core::ffi::c_void, dwflags : CRYPT_ENCODE_OBJECT_FLAGS, pencodepara : *const CRYPT_ENCODE_PARA, pvencoded : *mut core::ffi::c_void, pcbencoded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptEncrypt(hkey : usize, hhash : usize, r#final : windows_sys::core::BOOL, dwflags : u32, pbdata : *mut u8, pdwdatalen : *mut u32, dwbuflen : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptEncryptMessage(pencryptpara : *const CRYPT_ENCRYPT_MESSAGE_PARA, crecipientcert : u32, rgprecipientcert : *const *const CERT_CONTEXT, pbtobeencrypted : *const u8, cbtobeencrypted : u32, pbencryptedblob : *mut u8, pcbencryptedblob : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptEnumKeyIdentifierProperties(pkeyidentifier : *const CRYPT_INTEGER_BLOB, dwpropid : u32, dwflags : u32, pwszcomputername : windows_sys::core::PCWSTR, pvreserved : *const core::ffi::c_void, pvarg : *mut core::ffi::c_void, pfnenum : PFN_CRYPT_ENUM_KEYID_PROP) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptEnumOIDFunction(dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, pszoid : windows_sys::core::PCSTR, dwflags : u32, pvarg : *mut core::ffi::c_void, pfnenumoidfunc : PFN_CRYPT_ENUM_OID_FUNC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptEnumOIDInfo(dwgroupid : u32, dwflags : u32, pvarg : *mut core::ffi::c_void, pfnenumoidinfo : PFN_CRYPT_ENUM_OID_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptEnumProviderTypesA(dwindex : u32, pdwreserved : *const u32, dwflags : u32, pdwprovtype : *mut u32, sztypename : windows_sys::core::PSTR, pcbtypename : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptEnumProviderTypesW(dwindex : u32, pdwreserved : *const u32, dwflags : u32, pdwprovtype : *mut u32, sztypename : windows_sys::core::PWSTR, pcbtypename : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptEnumProvidersA(dwindex : u32, pdwreserved : *const u32, dwflags : u32, pdwprovtype : *mut u32, szprovname : windows_sys::core::PSTR, pcbprovname : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptEnumProvidersW(dwindex : u32, pdwreserved : *const u32, dwflags : u32, pdwprovtype : *mut u32, szprovname : windows_sys::core::PWSTR, pcbprovname : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptExportKey(hkey : usize, hexpkey : usize, dwblobtype : u32, dwflags : CRYPT_KEY_FLAGS, pbdata : *mut u8, pdwdatalen : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptExportPKCS8(hcryptprov : usize, dwkeyspec : u32, pszprivatekeyobjid : windows_sys::core::PCSTR, dwflags : u32, pvauxinfo : *const core::ffi::c_void, pbprivatekeyblob : *mut u8, pcbprivatekeyblob : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptExportPublicKeyInfo(hcryptprovorncryptkey : HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec : u32, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pinfo : *mut CERT_PUBLIC_KEY_INFO, pcbinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptExportPublicKeyInfoEx(hcryptprovorncryptkey : HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec : u32, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid : windows_sys::core::PCSTR, dwflags : u32, pvauxinfo : *const core::ffi::c_void, pinfo : *mut CERT_PUBLIC_KEY_INFO, pcbinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey : BCRYPT_KEY_HANDLE, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid : windows_sys::core::PCSTR, dwflags : u32, pvauxinfo : *const core::ffi::c_void, pinfo : *mut CERT_PUBLIC_KEY_INFO, pcbinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptFindCertificateKeyProvInfo(pcert : *const CERT_CONTEXT, dwflags : CRYPT_FIND_FLAGS, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptFindLocalizedName(pwszcryptname : windows_sys::core::PCWSTR) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptFindOIDInfo(dwkeytype : u32, pvkey : *const core::ffi::c_void, dwgroupid : u32) -> *mut CRYPT_OID_INFO);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptFormatObject(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, dwformattype : u32, dwformatstrtype : u32, pformatstruct : *const core::ffi::c_void, lpszstructtype : windows_sys::core::PCSTR, pbencoded : *const u8, cbencoded : u32, pbformat : *mut core::ffi::c_void, pcbformat : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptFreeOIDFunctionAddress(hfuncaddr : *const core::ffi::c_void, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGenKey(hprov : usize, algid : ALG_ID, dwflags : CRYPT_KEY_FLAGS, phkey : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGenRandom(hprov : usize, dwlen : u32, pbbuffer : *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetAsyncParam(hasync : HCRYPTASYNC, pszparamoid : windows_sys::core::PCSTR, ppvparam : *mut *mut core::ffi::c_void, ppfnfree : *mut PFN_CRYPT_ASYNC_PARAM_FREE_FUNC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetDefaultOIDDllList(hfuncset : *const core::ffi::c_void, dwencodingtype : u32, pwszdlllist : windows_sys::core::PWSTR, pcchdlllist : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetDefaultOIDFunctionAddress(hfuncset : *const core::ffi::c_void, dwencodingtype : u32, pwszdll : windows_sys::core::PCWSTR, dwflags : u32, ppvfuncaddr : *mut *mut core::ffi::c_void, phfuncaddr : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGetDefaultProviderA(dwprovtype : u32, pdwreserved : *const u32, dwflags : u32, pszprovname : windows_sys::core::PSTR, pcbprovname : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGetDefaultProviderW(dwprovtype : u32, pdwreserved : *const u32, dwflags : u32, pszprovname : windows_sys::core::PWSTR, pcbprovname : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGetHashParam(hhash : usize, dwparam : u32, pbdata : *mut u8, pdwdatalen : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetKeyIdentifierProperty(pkeyidentifier : *const CRYPT_INTEGER_BLOB, dwpropid : u32, dwflags : u32, pwszcomputername : windows_sys::core::PCWSTR, pvreserved : *const core::ffi::c_void, pvdata : *mut core::ffi::c_void, pcbdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGetKeyParam(hkey : usize, dwparam : CRYPT_KEY_PARAM_ID, pbdata : *mut u8, pdwdatalen : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetMessageCertificates(dwmsgandcertencodingtype : u32, hcryptprov : HCRYPTPROV_LEGACY, dwflags : u32, pbsignedblob : *const u8, cbsignedblob : u32) -> HCERTSTORE);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetMessageSignerCount(dwmsgencodingtype : u32, pbsignedblob : *const u8, cbsignedblob : u32) -> i32);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetOIDFunctionAddress(hfuncset : *const core::ffi::c_void, dwencodingtype : u32, pszoid : windows_sys::core::PCSTR, dwflags : u32, ppvfuncaddr : *mut *mut core::ffi::c_void, phfuncaddr : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptGetOIDFunctionValue(dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, pszoid : windows_sys::core::PCSTR, pwszvaluename : windows_sys::core::PCWSTR, pdwvaluetype : *mut u32, pbvaluedata : *mut u8, pcbvaluedata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("cryptnet.dll" "system" fn CryptGetObjectUrl(pszurloid : windows_sys::core::PCSTR, pvpara : *const core::ffi::c_void, dwflags : CRYPT_GET_URL_FLAGS, purlarray : *mut CRYPT_URL_ARRAY, pcburlarray : *mut u32, purlinfo : *mut CRYPT_URL_INFO, pcburlinfo : *mut u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGetProvParam(hprov : usize, dwparam : u32, pbdata : *mut u8, pdwdatalen : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptGetUserKey(hprov : usize, dwkeyspec : u32, phuserkey : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptHashCertificate(hcryptprov : HCRYPTPROV_LEGACY, algid : ALG_ID, dwflags : u32, pbencoded : *const u8, cbencoded : u32, pbcomputedhash : *mut u8, pcbcomputedhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptHashCertificate2(pwszcnghashalgid : windows_sys::core::PCWSTR, dwflags : u32, pvreserved : *const core::ffi::c_void, pbencoded : *const u8, cbencoded : u32, pbcomputedhash : *mut u8, pcbcomputedhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptHashData(hhash : usize, pbdata : *const u8, dwdatalen : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptHashMessage(phashpara : *const CRYPT_HASH_MESSAGE_PARA, fdetachedhash : windows_sys::core::BOOL, ctobehashed : u32, rgpbtobehashed : *const *const u8, rgcbtobehashed : *const u32, pbhashedblob : *mut u8, pcbhashedblob : *mut u32, pbcomputedhash : *mut u8, pcbcomputedhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptHashPublicKeyInfo(hcryptprov : HCRYPTPROV_LEGACY, algid : ALG_ID, dwflags : u32, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pinfo : *const CERT_PUBLIC_KEY_INFO, pbcomputedhash : *mut u8, pcbcomputedhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptHashSessionKey(hhash : usize, hkey : usize, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptHashToBeSigned(hcryptprov : HCRYPTPROV_LEGACY, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbencoded : *const u8, cbencoded : u32, pbcomputedhash : *mut u8, pcbcomputedhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptImportKey(hprov : usize, pbdata : *const u8, dwdatalen : u32, hpubkey : usize, dwflags : CRYPT_KEY_FLAGS, phkey : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptImportPKCS8(sprivatekeyandparams : CRYPT_PKCS8_IMPORT_PARAMS, dwflags : CRYPT_KEY_FLAGS, phcryptprov : *mut usize, pvauxinfo : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptImportPublicKeyInfo(hcryptprov : usize, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pinfo : *const CERT_PUBLIC_KEY_INFO, phkey : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptImportPublicKeyInfoEx(hcryptprov : usize, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pinfo : *const CERT_PUBLIC_KEY_INFO, aikeyalg : ALG_ID, dwflags : u32, pvauxinfo : *const core::ffi::c_void, phkey : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptImportPublicKeyInfoEx2(dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pinfo : *const CERT_PUBLIC_KEY_INFO, dwflags : CRYPT_IMPORT_PUBLIC_KEY_FLAGS, pvauxinfo : *const core::ffi::c_void, phkey : *mut BCRYPT_KEY_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptInitOIDFunctionSet(pszfuncname : windows_sys::core::PCSTR, dwflags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("cryptnet.dll" "system" fn CryptInstallCancelRetrieval(pfncancel : PFN_CRYPT_CANCEL_RETRIEVAL, pvarg : *const core::ffi::c_void, dwflags : u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptInstallDefaultContext(hcryptprov : usize, dwdefaulttype : CRYPT_DEFAULT_CONTEXT_TYPE, pvdefaultpara : *const core::ffi::c_void, dwflags : CRYPT_DEFAULT_CONTEXT_FLAGS, pvreserved : *const core::ffi::c_void, phdefaultcontext : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptInstallOIDFunctionAddress(hmodule : super::super::Foundation:: HMODULE, dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, cfuncentry : u32, rgfuncentry : *const CRYPT_OID_FUNC_ENTRY, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMemAlloc(cbsize : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMemFree(pv : *const core::ffi::c_void));

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMemRealloc(pv : *const core::ffi::c_void, cbsize : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgCalculateEncodedLength(dwmsgencodingtype : u32, dwflags : u32, dwmsgtype : u32, pvmsgencodeinfo : *const core::ffi::c_void, pszinnercontentobjid : windows_sys::core::PCSTR, cbdata : u32) -> u32);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgClose(hcryptmsg : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgControl(hcryptmsg : *const core::ffi::c_void, dwflags : u32, dwctrltype : u32, pvctrlpara : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgCountersign(hcryptmsg : *const core::ffi::c_void, dwindex : u32, ccountersigners : u32, rgcountersigners : *const CMSG_SIGNER_ENCODE_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgCountersignEncoded(dwencodingtype : u32, pbsignerinfo : *const u8, cbsignerinfo : u32, ccountersigners : u32, rgcountersigners : *const CMSG_SIGNER_ENCODE_INFO, pbcountersignature : *mut u8, pcbcountersignature : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgDuplicate(hcryptmsg : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgEncodeAndSignCTL(dwmsgencodingtype : u32, pctlinfo : *const CTL_INFO, psigninfo : *const CMSG_SIGNED_ENCODE_INFO, dwflags : u32, pbencoded : *mut u8, pcbencoded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgGetAndVerifySigner(hcryptmsg : *const core::ffi::c_void, csignerstore : u32, rghsignerstore : *const HCERTSTORE, dwflags : u32, ppsigner : *mut *mut CERT_CONTEXT, pdwsignerindex : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgGetParam(hcryptmsg : *const core::ffi::c_void, dwparamtype : u32, dwindex : u32, pvdata : *mut core::ffi::c_void, pcbdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgOpenToDecode(dwmsgencodingtype : u32, dwflags : u32, dwmsgtype : u32, hcryptprov : HCRYPTPROV_LEGACY, precipientinfo : *const CERT_INFO, pstreaminfo : *const CMSG_STREAM_INFO) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgOpenToEncode(dwmsgencodingtype : u32, dwflags : u32, dwmsgtype : CRYPT_MSG_TYPE, pvmsgencodeinfo : *const core::ffi::c_void, pszinnercontentobjid : windows_sys::core::PCSTR, pstreaminfo : *const CMSG_STREAM_INFO) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgSignCTL(dwmsgencodingtype : u32, pbctlcontent : *const u8, cbctlcontent : u32, psigninfo : *const CMSG_SIGNED_ENCODE_INFO, dwflags : u32, pbencoded : *mut u8, pcbencoded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgUpdate(hcryptmsg : *const core::ffi::c_void, pbdata : *const u8, cbdata : u32, ffinal : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgVerifyCountersignatureEncoded(hcryptprov : HCRYPTPROV_LEGACY, dwencodingtype : u32, pbsignerinfo : *const u8, cbsignerinfo : u32, pbsignerinfocountersignature : *const u8, cbsignerinfocountersignature : u32, pcicountersigner : *const CERT_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptMsgVerifyCountersignatureEncodedEx(hcryptprov : HCRYPTPROV_LEGACY, dwencodingtype : u32, pbsignerinfo : *const u8, cbsignerinfo : u32, pbsignerinfocountersignature : *const u8, cbsignerinfocountersignature : u32, dwsignertype : u32, pvsigner : *const core::ffi::c_void, dwflags : u32, pvextra : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptProtectData(pdatain : *const CRYPT_INTEGER_BLOB, szdatadescr : windows_sys::core::PCWSTR, poptionalentropy : *const CRYPT_INTEGER_BLOB, pvreserved : *const core::ffi::c_void, ppromptstruct : *const CRYPTPROTECT_PROMPTSTRUCT, dwflags : u32, pdataout : *mut CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptProtectMemory(pdatain : *mut core::ffi::c_void, cbdatain : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptQueryObject(dwobjecttype : CERT_QUERY_OBJECT_TYPE, pvobject : *const core::ffi::c_void, dwexpectedcontenttypeflags : CERT_QUERY_CONTENT_TYPE_FLAGS, dwexpectedformattypeflags : CERT_QUERY_FORMAT_TYPE_FLAGS, dwflags : u32, pdwmsgandcertencodingtype : *mut CERT_QUERY_ENCODING_TYPE, pdwcontenttype : *mut CERT_QUERY_CONTENT_TYPE, pdwformattype : *mut CERT_QUERY_FORMAT_TYPE, phcertstore : *mut HCERTSTORE, phmsg : *mut *mut core::ffi::c_void, ppvcontext : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptRegisterDefaultOIDFunction(dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, dwindex : u32, pwszdll : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptRegisterOIDFunction(dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, pszoid : windows_sys::core::PCSTR, pwszdll : windows_sys::core::PCWSTR, pszoverridefuncname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptRegisterOIDInfo(pinfo : *const CRYPT_OID_INFO, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptReleaseContext(hprov : usize, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("cryptnet.dll" "system" fn CryptRetrieveObjectByUrlA(pszurl : windows_sys::core::PCSTR, pszobjectoid : windows_sys::core::PCSTR, dwretrievalflags : u32, dwtimeout : u32, ppvobject : *mut *mut core::ffi::c_void, hasyncretrieve : HCRYPTASYNC, pcredentials : *const CRYPT_CREDENTIALS, pvverify : *const core::ffi::c_void, pauxinfo : *mut CRYPT_RETRIEVE_AUX_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("cryptnet.dll" "system" fn CryptRetrieveObjectByUrlW(pszurl : windows_sys::core::PCWSTR, pszobjectoid : windows_sys::core::PCSTR, dwretrievalflags : u32, dwtimeout : u32, ppvobject : *mut *mut core::ffi::c_void, hasyncretrieve : HCRYPTASYNC, pcredentials : *const CRYPT_CREDENTIALS, pvverify : *const core::ffi::c_void, pauxinfo : *mut CRYPT_RETRIEVE_AUX_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptRetrieveTimeStamp(wszurl : windows_sys::core::PCWSTR, dwretrievalflags : u32, dwtimeout : u32, pszhashid : windows_sys::core::PCSTR, ppara : *const CRYPT_TIMESTAMP_PARA, pbdata : *const u8, cbdata : u32, pptscontext : *mut *mut CRYPT_TIMESTAMP_CONTEXT, pptssigner : *mut *mut CERT_CONTEXT, phstore : *mut HCERTSTORE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptSetAsyncParam(hasync : HCRYPTASYNC, pszparamoid : windows_sys::core::PCSTR, pvparam : *const core::ffi::c_void, pfnfree : PFN_CRYPT_ASYNC_PARAM_FREE_FUNC) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSetHashParam(hhash : usize, dwparam : CRYPT_SET_HASH_PARAM, pbdata : *const u8, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptSetKeyIdentifierProperty(pkeyidentifier : *const CRYPT_INTEGER_BLOB, dwpropid : u32, dwflags : u32, pwszcomputername : windows_sys::core::PCWSTR, pvreserved : *const core::ffi::c_void, pvdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSetKeyParam(hkey : usize, dwparam : CRYPT_KEY_PARAM_ID, pbdata : *const u8, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("crypt32.dll" "system" fn CryptSetOIDFunctionValue(dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, pszoid : windows_sys::core::PCSTR, pwszvaluename : windows_sys::core::PCWSTR, dwvaluetype : super::super::System::Registry:: REG_VALUE_TYPE, pbvaluedata : *const u8, cbvaluedata : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSetProvParam(hprov : usize, dwparam : CRYPT_SET_PROV_PARAM_ID, pbdata : *const u8, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSetProviderA(pszprovname : windows_sys::core::PCSTR, dwprovtype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSetProviderExA(pszprovname : windows_sys::core::PCSTR, dwprovtype : u32, pdwreserved : *const u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSetProviderExW(pszprovname : windows_sys::core::PCWSTR, dwprovtype : u32, pdwreserved : *const u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSetProviderW(pszprovname : windows_sys::core::PCWSTR, dwprovtype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptSignAndEncodeCertificate(hcryptprovorncryptkey : HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec : CERT_KEY_SPEC, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, lpszstructtype : windows_sys::core::PCSTR, pvstructinfo : *const core::ffi::c_void, psignaturealgorithm : *const CRYPT_ALGORITHM_IDENTIFIER, pvhashauxinfo : *const core::ffi::c_void, pbencoded : *mut u8, pcbencoded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptSignAndEncryptMessage(psignpara : *const CRYPT_SIGN_MESSAGE_PARA, pencryptpara : *const CRYPT_ENCRYPT_MESSAGE_PARA, crecipientcert : u32, rgprecipientcert : *const *const CERT_CONTEXT, pbtobesignedandencrypted : *const u8, cbtobesignedandencrypted : u32, pbsignedandencryptedblob : *mut u8, pcbsignedandencryptedblob : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptSignCertificate(hcryptprovorncryptkey : HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec : u32, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbencodedtobesigned : *const u8, cbencodedtobesigned : u32, psignaturealgorithm : *const CRYPT_ALGORITHM_IDENTIFIER, pvhashauxinfo : *const core::ffi::c_void, pbsignature : *mut u8, pcbsignature : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSignHashA(hhash : usize, dwkeyspec : u32, szdescription : windows_sys::core::PCSTR, dwflags : u32, pbsignature : *mut u8, pdwsiglen : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptSignHashW(hhash : usize, dwkeyspec : u32, szdescription : windows_sys::core::PCWSTR, dwflags : u32, pbsignature : *mut u8, pdwsiglen : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptSignMessage(psignpara : *const CRYPT_SIGN_MESSAGE_PARA, fdetachedsignature : windows_sys::core::BOOL, ctobesigned : u32, rgpbtobesigned : *const *const u8, rgcbtobesigned : *const u32, pbsignedblob : *mut u8, pcbsignedblob : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptSignMessageWithKey(psignpara : *const CRYPT_KEY_SIGN_MESSAGE_PARA, pbtobesigned : *const u8, cbtobesigned : u32, pbsignedblob : *mut u8, pcbsignedblob : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptStringToBinaryA(pszstring : windows_sys::core::PCSTR, cchstring : u32, dwflags : CRYPT_STRING, pbbinary : *mut u8, pcbbinary : *mut u32, pdwskip : *mut u32, pdwflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptStringToBinaryW(pszstring : windows_sys::core::PCWSTR, cchstring : u32, dwflags : CRYPT_STRING, pbbinary : *mut u8, pcbbinary : *mut u32, pdwskip : *mut u32, pdwflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("cryptnet.dll" "system" fn CryptUninstallCancelRetrieval(dwflags : u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptUninstallDefaultContext(hdefaultcontext : *const core::ffi::c_void, dwflags : u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptUnprotectData(pdatain : *const CRYPT_INTEGER_BLOB, ppszdatadescr : *mut windows_sys::core::PWSTR, poptionalentropy : *const CRYPT_INTEGER_BLOB, pvreserved : *const core::ffi::c_void, ppromptstruct : *const CRYPTPROTECT_PROMPTSTRUCT, dwflags : u32, pdataout : *mut CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptUnprotectMemory(pdatain : *mut core::ffi::c_void, cbdatain : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptUnregisterDefaultOIDFunction(dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, pwszdll : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptUnregisterOIDFunction(dwencodingtype : u32, pszfuncname : windows_sys::core::PCSTR, pszoid : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptUnregisterOIDInfo(pinfo : *const CRYPT_OID_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptUpdateProtectedState(poldsid : super:: PSID, pwszoldpassword : windows_sys::core::PCWSTR, dwflags : u32, pdwsuccesscount : *mut u32, pdwfailurecount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyCertificateSignature(hcryptprov : HCRYPTPROV_LEGACY, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, pbencoded : *const u8, cbencoded : u32, ppublickey : *const CERT_PUBLIC_KEY_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyCertificateSignatureEx(hcryptprov : HCRYPTPROV_LEGACY, dwcertencodingtype : CERT_QUERY_ENCODING_TYPE, dwsubjecttype : u32, pvsubject : *const core::ffi::c_void, dwissuertype : u32, pvissuer : *const core::ffi::c_void, dwflags : CRYPT_VERIFY_CERT_FLAGS, pvextra : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyDetachedMessageHash(phashpara : *const CRYPT_HASH_MESSAGE_PARA, pbdetachedhashblob : *const u8, cbdetachedhashblob : u32, ctobehashed : u32, rgpbtobehashed : *const *const u8, rgcbtobehashed : *const u32, pbcomputedhash : *mut u8, pcbcomputedhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyDetachedMessageSignature(pverifypara : *const CRYPT_VERIFY_MESSAGE_PARA, dwsignerindex : u32, pbdetachedsignblob : *const u8, cbdetachedsignblob : u32, ctobesigned : u32, rgpbtobesigned : *const *const u8, rgcbtobesigned : *const u32, ppsignercert : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyMessageHash(phashpara : *const CRYPT_HASH_MESSAGE_PARA, pbhashedblob : *const u8, cbhashedblob : u32, pbtobehashed : *mut u8, pcbtobehashed : *mut u32, pbcomputedhash : *mut u8, pcbcomputedhash : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyMessageSignature(pverifypara : *const CRYPT_VERIFY_MESSAGE_PARA, dwsignerindex : u32, pbsignedblob : *const u8, cbsignedblob : u32, pbdecoded : *mut u8, pcbdecoded : *mut u32, ppsignercert : *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyMessageSignatureWithKey(pverifypara : *const CRYPT_KEY_VERIFY_MESSAGE_PARA, ppublickeyinfo : *const CERT_PUBLIC_KEY_INFO, pbsignedblob : *const u8, cbsignedblob : u32, pbdecoded : *mut u8, pcbdecoded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptVerifySignatureA(hhash : usize, pbsignature : *const u8, dwsiglen : u32, hpubkey : usize, szdescription : windows_sys::core::PCSTR, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CryptVerifySignatureW(hhash : usize, pbsignature : *const u8, dwsiglen : u32, hpubkey : usize, szdescription : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn CryptVerifyTimeStampSignature(pbtscontentinfo : *const u8, cbtscontentinfo : u32, pbdata : *const u8, cbdata : u32, hadditionalstore : HCERTSTORE, pptscontext : *mut *mut CRYPT_TIMESTAMP_CONTEXT, pptssigner : *mut *mut CERT_CONTEXT, phstore : *mut HCERTSTORE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlAddObject(hsignatureorobject : *const core::ffi::c_void, dwflags : u32, rgproperty : *const CRYPT_XML_PROPERTY, cproperty : u32, pencoded : *const CRYPT_XML_BLOB, ppobject : *mut *mut CRYPT_XML_OBJECT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlClose(hcryptxml : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlCreateReference(hcryptxml : *const core::ffi::c_void, dwflags : u32, wszid : windows_sys::core::PCWSTR, wszuri : windows_sys::core::PCWSTR, wsztype : windows_sys::core::PCWSTR, pdigestmethod : *const CRYPT_XML_ALGORITHM, ctransform : u32, rgtransform : *const CRYPT_XML_ALGORITHM, phreference : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlDigestReference(hreference : *const core::ffi::c_void, dwflags : u32, pdataproviderin : *const CRYPT_XML_DATA_PROVIDER) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlEncode(hcryptxml : *const core::ffi::c_void, dwcharset : CRYPT_XML_CHARSET, rgproperty : *const CRYPT_XML_PROPERTY, cproperty : u32, pvcallbackstate : *mut core::ffi::c_void, pfnwrite : PFN_CRYPT_XML_WRITE_CALLBACK) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlEnumAlgorithmInfo(dwgroupid : u32, dwflags : u32, pvarg : *mut core::ffi::c_void, pfnenumalginfo : PFN_CRYPT_XML_ENUM_ALG_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlFindAlgorithmInfo(dwfindbytype : u32, pvfindby : *const core::ffi::c_void, dwgroupid : u32, dwflags : u32) -> *mut CRYPT_XML_ALGORITHM_INFO);

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlGetAlgorithmInfo(pxmlalgorithm : *const CRYPT_XML_ALGORITHM, dwflags : CRYPT_XML_FLAGS, ppalginfo : *mut *mut CRYPT_XML_ALGORITHM_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlGetDocContext(hcryptxml : *const core::ffi::c_void, ppstruct : *mut *mut CRYPT_XML_DOC_CTXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlGetReference(hcryptxml : *const core::ffi::c_void, ppstruct : *mut *mut CRYPT_XML_REFERENCE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlGetSignature(hcryptxml : *const core::ffi::c_void, ppstruct : *mut *mut CRYPT_XML_SIGNATURE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlGetStatus(hcryptxml : *const core::ffi::c_void, pstatus : *mut CRYPT_XML_STATUS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlGetTransforms(ppconfig : *mut *mut CRYPT_XML_TRANSFORM_CHAIN_CONFIG) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlImportPublicKey(dwflags : CRYPT_XML_FLAGS, pkeyvalue : *const CRYPT_XML_KEY_VALUE, phkey : *mut BCRYPT_KEY_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlOpenToDecode(pconfig : *const CRYPT_XML_TRANSFORM_CHAIN_CONFIG, dwflags : CRYPT_XML_FLAGS, rgproperty : *const CRYPT_XML_PROPERTY, cproperty : u32, pencoded : *const CRYPT_XML_BLOB, phcryptxml : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlOpenToEncode(pconfig : *const CRYPT_XML_TRANSFORM_CHAIN_CONFIG, dwflags : CRYPT_XML_FLAGS, wszid : windows_sys::core::PCWSTR, rgproperty : *const CRYPT_XML_PROPERTY, cproperty : u32, pencoded : *const CRYPT_XML_BLOB, phsignature : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlSetHMACSecret(hsignature : *const core::ffi::c_void, pbsecret : *const u8, cbsecret : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlSign(hsignature : *const core::ffi::c_void, hkey : HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec : CERT_KEY_SPEC, dwflags : CRYPT_XML_FLAGS, dwkeyinfospec : CRYPT_XML_KEYINFO_SPEC, pvkeyinfospec : *const core::ffi::c_void, psignaturemethod : *const CRYPT_XML_ALGORITHM, pcanonicalization : *const CRYPT_XML_ALGORITHM) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// windows_link::link!("cryptxml.dll" "system" fn CryptXmlVerifySignature(hsignature : *const core::ffi::c_void, hkey : BCRYPT_KEY_HANDLE, dwflags : CRYPT_XML_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 350:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn Decrypt(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, foaep : windows_sys::core::BOOL, cbindata : u32, pindata : *const u8, pcboutdata : *mut u32, ppoutdata : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn Encrypt(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, foaep : windows_sys::core::BOOL, cbindata : u32, pindata : *const u8, pcboutdata : *mut u32, ppoutdata : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("wintrust.dll" "system" fn FindCertsByIssuer(pcertchains : *mut CERT_CHAIN, pcbcertchains : *mut u32, pccertchains : *mut u32, pbencodedissuername : *const u8, cbencodedissuername : u32, pwszpurpose : windows_sys::core::PCWSTR, dwkeyspec : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn FreeToken(pallocmemory : *const GENERIC_XML_TOKEN) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn GenerateDerivedKey(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, cblabel : u32, plabel : *const u8, cbnonce : u32, pnonce : *const u8, derivedkeylength : u32, offset : u32, algid : windows_sys::core::PCWSTR, pcbkey : *mut u32, ppkey : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn GetAsymmetricEncryptionInterface(pszprovidername : windows_sys::core::PCWSTR, pszalgid : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut BCRYPT_ASYMMETRIC_ENCRYPTION_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn GetBrowserToken(dwparamtype : u32, pparam : *const core::ffi::c_void, pcbtoken : *mut u32, pptoken : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn GetCipherInterface(pszprovidername : windows_sys::core::PCWSTR, pszalgid : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut BCRYPT_CIPHER_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn GetCryptoTransform(hsymmetriccrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, mode : u32, padding : PaddingMode, feedbacksize : u32, direction : Direction, cbiv : u32, piv : *const u8, pphtransform : *mut *mut INFORMATIONCARD_CRYPTO_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn GetHashInterface(pszprovidername : windows_sys::core::PCWSTR, pszalgid : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut BCRYPT_HASH_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn GetKeyDerivationInterface(pszprovidername : windows_sys::core::PCWSTR, pszalgid : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut BCRYPT_KEY_DERIVATION_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn GetKeyStorageInterface(pszprovidername : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut NCRYPT_KEY_STORAGE_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn GetKeyedHash(hsymmetriccrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, pphhash : *mut *mut INFORMATIONCARD_CRYPTO_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn GetRngInterface(pszprovidername : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut BCRYPT_RNG_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn GetSChannelInterface(pszprovidername : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut NCRYPT_SSL_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn GetSecretAgreementInterface(pszprovidername : windows_sys::core::PCWSTR, pszalgid : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut BCRYPT_SECRET_AGREEMENT_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn GetSignatureInterface(pszprovidername : windows_sys::core::PCWSTR, pszalgid : windows_sys::core::PCWSTR, ppfunctiontable : *mut *mut BCRYPT_SIGNATURE_FUNCTION_TABLE, dwflags : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn GetToken(cpolicychain : u32, ppolicychain : *const POLICY_ELEMENT, securitytoken : *mut *mut GENERIC_XML_TOKEN, phprooftokencrypto : *mut *mut INFORMATIONCARD_CRYPTO_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn HashCore(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, cbindata : u32, pindata : *const u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn HashFinal(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, cbindata : u32, pindata : *const u8, pcboutdata : *mut u32, ppoutdata : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn ImportInformationCard(filename : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn ManageCardSpace() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptCloseProtectionDescriptor(hdescriptor : super:: NCRYPT_DESCRIPTOR_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptCreateClaim(hsubjectkey : NCRYPT_KEY_HANDLE, hauthoritykey : NCRYPT_KEY_HANDLE, dwclaimtype : u32, pparameterlist : *const BCryptBufferDesc, pbclaimblob : *mut u8, cbclaimblob : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptCreatePersistedKey(hprovider : NCRYPT_PROV_HANDLE, phkey : *mut NCRYPT_KEY_HANDLE, pszalgid : windows_sys::core::PCWSTR, pszkeyname : windows_sys::core::PCWSTR, dwlegacykeyspec : CERT_KEY_SPEC, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptCreateProtectionDescriptor(pwszdescriptorstring : windows_sys::core::PCWSTR, dwflags : u32, phdescriptor : *mut super:: NCRYPT_DESCRIPTOR_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptDecrypt(hkey : NCRYPT_KEY_HANDLE, pbinput : *const u8, cbinput : u32, ppaddinginfo : *const core::ffi::c_void, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptDeleteKey(hkey : NCRYPT_KEY_HANDLE, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptDeriveKey(hsharedsecret : NCRYPT_SECRET_HANDLE, pwszkdf : windows_sys::core::PCWSTR, pparameterlist : *const BCryptBufferDesc, pbderivedkey : *mut u8, cbderivedkey : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptEncrypt(hkey : NCRYPT_KEY_HANDLE, pbinput : *const u8, cbinput : u32, ppaddinginfo : *const core::ffi::c_void, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptEnumAlgorithms(hprovider : NCRYPT_PROV_HANDLE, dwalgoperations : NCRYPT_OPERATION, pdwalgcount : *mut u32, ppalglist : *mut *mut NCryptAlgorithmName, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptEnumKeys(hprovider : NCRYPT_PROV_HANDLE, pszscope : windows_sys::core::PCWSTR, ppkeyname : *mut *mut NCryptKeyName, ppenumstate : *mut *mut core::ffi::c_void, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptEnumStorageProviders(pdwprovidercount : *mut u32, ppproviderlist : *mut *mut NCryptProviderName, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptExportKey(hkey : NCRYPT_KEY_HANDLE, hexportkey : NCRYPT_KEY_HANDLE, pszblobtype : windows_sys::core::PCWSTR, pparameterlist : *const BCryptBufferDesc, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptFinalizeKey(hkey : NCRYPT_KEY_HANDLE, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptFreeBuffer(pvinput : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptFreeObject(hobject : NCRYPT_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptGetProperty(hobject : NCRYPT_HANDLE, pszproperty : windows_sys::core::PCWSTR, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : super:: OBJECT_SECURITY_INFORMATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptGetProtectionDescriptorInfo(hdescriptor : super:: NCRYPT_DESCRIPTOR_HANDLE, pmempara : *const NCRYPT_ALLOC_PARA, dwinfotype : u32, ppvinfo : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptImportKey(hprovider : NCRYPT_PROV_HANDLE, himportkey : NCRYPT_KEY_HANDLE, pszblobtype : windows_sys::core::PCWSTR, pparameterlist : *const BCryptBufferDesc, phkey : *mut NCRYPT_KEY_HANDLE, pbdata : *const u8, cbdata : u32, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptIsAlgSupported(hprovider : NCRYPT_PROV_HANDLE, pszalgid : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptIsKeyHandle(hkey : NCRYPT_KEY_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptKeyDerivation(hkey : NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, pbderivedkey : *mut u8, cbderivedkey : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptNotifyChangeKey(hprovider : NCRYPT_PROV_HANDLE, phevent : *mut super::super::Foundation:: HANDLE, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptOpenKey(hprovider : NCRYPT_PROV_HANDLE, phkey : *mut NCRYPT_KEY_HANDLE, pszkeyname : windows_sys::core::PCWSTR, dwlegacykeyspec : CERT_KEY_SPEC, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptOpenStorageProvider(phprovider : *mut NCRYPT_PROV_HANDLE, pszprovidername : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptProtectSecret(hdescriptor : super:: NCRYPT_DESCRIPTOR_HANDLE, dwflags : u32, pbdata : *const u8, cbdata : u32, pmempara : *const NCRYPT_ALLOC_PARA, hwnd : super::super::Foundation:: HWND, ppbprotectedblob : *mut *mut u8, pcbprotectedblob : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptQueryProtectionDescriptorName(pwszname : windows_sys::core::PCWSTR, pwszdescriptorstring : windows_sys::core::PWSTR, pcdescriptorstring : *mut usize, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptRegisterProtectionDescriptorName(pwszname : windows_sys::core::PCWSTR, pwszdescriptorstring : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 399:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptSecretAgreement(hprivkey : NCRYPT_KEY_HANDLE, hpubkey : NCRYPT_KEY_HANDLE, phagreedsecret : *mut NCRYPT_SECRET_HANDLE, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptSetProperty(hobject : NCRYPT_HANDLE, pszproperty : windows_sys::core::PCWSTR, pbinput : *const u8, cbinput : u32, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptSignHash(hkey : NCRYPT_KEY_HANDLE, ppaddinginfo : *const core::ffi::c_void, pbhashvalue : *const u8, cbhashvalue : u32, pbsignature : *mut u8, cbsignature : u32, pcbresult : *mut u32, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 402:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptStreamClose(hstream : super:: NCRYPT_STREAM_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptStreamOpenToProtect(hdescriptor : super:: NCRYPT_DESCRIPTOR_HANDLE, dwflags : u32, hwnd : super::super::Foundation:: HWND, pstreaminfo : *const NCRYPT_PROTECT_STREAM_INFO, phstream : *mut super:: NCRYPT_STREAM_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptStreamOpenToUnprotect(pstreaminfo : *const NCRYPT_PROTECT_STREAM_INFO, dwflags : u32, hwnd : super::super::Foundation:: HWND, phstream : *mut super:: NCRYPT_STREAM_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 405:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptStreamOpenToUnprotectEx(pstreaminfo : *const NCRYPT_PROTECT_STREAM_INFO_EX, dwflags : u32, hwnd : super::super::Foundation:: HWND, phstream : *mut super:: NCRYPT_STREAM_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptStreamUpdate(hstream : super:: NCRYPT_STREAM_HANDLE, pbdata : *const u8, cbdata : usize, ffinal : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptTranslateHandle(phprovider : *mut NCRYPT_PROV_HANDLE, phkey : *mut NCRYPT_KEY_HANDLE, hlegacyprov : usize, hlegacykey : usize, dwlegacykeyspec : CERT_KEY_SPEC, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptUnprotectSecret(phdescriptor : *mut super:: NCRYPT_DESCRIPTOR_HANDLE, dwflags : NCRYPT_FLAGS, pbprotectedblob : *const u8, cbprotectedblob : u32, pmempara : *const NCRYPT_ALLOC_PARA, hwnd : super::super::Foundation:: HWND, ppbdata : *mut *mut u8, pcbdata : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptVerifyClaim(hsubjectkey : NCRYPT_KEY_HANDLE, hauthoritykey : NCRYPT_KEY_HANDLE, dwclaimtype : u32, pparameterlist : *const BCryptBufferDesc, pbclaimblob : *const u8, cbclaimblob : u32, poutput : *mut BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn NCryptVerifySignature(hkey : NCRYPT_KEY_HANDLE, ppaddinginfo : *const core::ffi::c_void, pbhashvalue : *const u8, cbhashvalue : u32, pbsignature : *const u8, cbsignature : u32, dwflags : NCRYPT_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 411:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn PFXExportCertStore(hstore : HCERTSTORE, ppfx : *mut CRYPT_INTEGER_BLOB, szpassword : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn PFXExportCertStoreEx(hstore : HCERTSTORE, ppfx : *mut CRYPT_INTEGER_BLOB, szpassword : windows_sys::core::PCWSTR, pvpara : *const core::ffi::c_void, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn PFXImportCertStore(ppfx : *const CRYPT_INTEGER_BLOB, szpassword : windows_sys::core::PCWSTR, dwflags : CRYPT_KEY_FLAGS) -> HCERTSTORE);

// UNSUPPORTED Rust 414:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn PFXIsPFXBlob(ppfx : *const CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// windows_link::link!("crypt32.dll" "system" fn PFXVerifyPassword(ppfx : *const CRYPT_INTEGER_BLOB, szpassword : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 416:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn ProcessPrng(pbdata : *mut u8, cbdata : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignError() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 418:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn SignHash(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, cbhash : u32, phash : *const u8, hashalgoid : windows_sys::core::PCWSTR, pcbsig : *mut u32, ppsig : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerFreeSignerContext(psignercontext : *const SIGNER_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 420:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerSign(psubjectinfo : *const SIGNER_SUBJECT_INFO, psignercert : *const SIGNER_CERT, psignatureinfo : *const SIGNER_SIGNATURE_INFO, pproviderinfo : *const SIGNER_PROVIDER_INFO, pwszhttptimestamp : windows_sys::core::PCWSTR, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerSignEx(dwflags : SIGNER_SIGN_FLAGS, psubjectinfo : *const SIGNER_SUBJECT_INFO, psignercert : *const SIGNER_CERT, psignatureinfo : *const SIGNER_SIGNATURE_INFO, pproviderinfo : *const SIGNER_PROVIDER_INFO, pwszhttptimestamp : windows_sys::core::PCWSTR, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void, ppsignercontext : *mut *mut SIGNER_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 422:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerSignEx2(dwflags : SIGNER_SIGN_FLAGS, psubjectinfo : *const SIGNER_SUBJECT_INFO, psignercert : *const SIGNER_CERT, psignatureinfo : *const SIGNER_SIGNATURE_INFO, pproviderinfo : *const SIGNER_PROVIDER_INFO, dwtimestampflags : SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid : windows_sys::core::PCSTR, pwszhttptimestamp : windows_sys::core::PCWSTR, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void, ppsignercontext : *mut *mut SIGNER_CONTEXT, pcryptopolicy : *const CERT_STRONG_SIGN_PARA, preserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerSignEx3(dwflags : SIGNER_SIGN_FLAGS, psubjectinfo : *const SIGNER_SUBJECT_INFO, psignercert : *const SIGNER_CERT, psignatureinfo : *const SIGNER_SIGNATURE_INFO, pproviderinfo : *const SIGNER_PROVIDER_INFO, dwtimestampflags : SIGNER_TIMESTAMP_FLAGS, psztimestampalgorithmoid : windows_sys::core::PCSTR, pwszhttptimestamp : windows_sys::core::PCWSTR, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void, ppsignercontext : *mut *mut SIGNER_CONTEXT, pcryptopolicy : *const CERT_STRONG_SIGN_PARA, pdigestsigninfo : *const SIGNER_DIGEST_SIGN_INFO, preserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerTimeStamp(psubjectinfo : *const SIGNER_SUBJECT_INFO, pwszhttptimestamp : windows_sys::core::PCWSTR, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerTimeStampEx(dwflags : u32, psubjectinfo : *const SIGNER_SUBJECT_INFO, pwszhttptimestamp : windows_sys::core::PCWSTR, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void, ppsignercontext : *mut *mut SIGNER_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerTimeStampEx2(dwflags : SIGNER_TIMESTAMP_FLAGS, psubjectinfo : *const SIGNER_SUBJECT_INFO, pwszhttptimestamp : windows_sys::core::PCWSTR, dwalgid : ALG_ID, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void, ppsignercontext : *mut *mut SIGNER_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 427:1: declaration Macro has no candidate rule
// windows_link::link!("mssign32.dll" "system" fn SignerTimeStampEx3(dwflags : SIGNER_TIMESTAMP_FLAGS, dwindex : u32, psubjectinfo : *const SIGNER_SUBJECT_INFO, pwszhttptimestamp : windows_sys::core::PCWSTR, pszalgorithmoid : windows_sys::core::PCWSTR, psrequest : *const CRYPT_ATTRIBUTES, psipdata : *const core::ffi::c_void, ppsignercontext : *mut *mut SIGNER_CONTEXT, pcryptopolicy : *const CERT_STRONG_SIGN_PARA, preserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslChangeNotify(hevent : super::super::Foundation:: HANDLE, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 429:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslComputeClientAuthHash(hsslprovider : NCRYPT_PROV_HANDLE, hmasterkey : NCRYPT_KEY_HANDLE, hhandshakehash : NCRYPT_HASH_HANDLE, pszalgid : windows_sys::core::PCWSTR, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslComputeEapKeyBlock(hsslprovider : NCRYPT_PROV_HANDLE, hmasterkey : NCRYPT_KEY_HANDLE, pbrandoms : *const u8, cbrandoms : u32, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 431:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslComputeFinishedHash(hsslprovider : NCRYPT_PROV_HANDLE, hmasterkey : NCRYPT_KEY_HANDLE, hhandshakehash : NCRYPT_HASH_HANDLE, pboutput : *mut u8, cboutput : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslComputeSessionHash(hsslprovider : NCRYPT_PROV_HANDLE, hhandshakehash : NCRYPT_HASH_HANDLE, dwprotocol : u32, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 433:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslCreateClientAuthHash(hsslprovider : NCRYPT_PROV_HANDLE, phhandshakehash : *mut NCRYPT_HASH_HANDLE, dwprotocol : u32, dwciphersuite : u32, pszhashalgid : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslCreateEphemeralKey(hsslprovider : NCRYPT_PROV_HANDLE, phephemeralkey : *mut NCRYPT_KEY_HANDLE, dwprotocol : u32, dwciphersuite : u32, dwkeytype : u32, dwkeybitlen : u32, pbparams : *const u8, cbparams : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 435:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslCreateHandshakeHash(hsslprovider : NCRYPT_PROV_HANDLE, phhandshakehash : *mut NCRYPT_HASH_HANDLE, dwprotocol : u32, dwciphersuite : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 436:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslDecrementProviderReferenceCount(hsslprovider : NCRYPT_PROV_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 437:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslDecryptPacket(hsslprovider : NCRYPT_PROV_HANDLE, hkey : NCRYPT_KEY_HANDLE, pbinput : *const u8, cbinput : u32, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, sequencenumber : u64, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 438:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslDuplicateTranscriptHash(hsslprovider : NCRYPT_PROV_HANDLE, htranscripthash : NCRYPT_HASH_HANDLE, phtranscripthash : *mut NCRYPT_HASH_HANDLE, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 439:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslEncryptPacket(hsslprovider : NCRYPT_PROV_HANDLE, hkey : NCRYPT_KEY_HANDLE, pbinput : *const u8, cbinput : u32, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, sequencenumber : u64, dwcontenttype : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslEnumCipherSuites(hsslprovider : NCRYPT_PROV_HANDLE, hprivatekey : NCRYPT_KEY_HANDLE, ppciphersuite : *mut *mut NCRYPT_SSL_CIPHER_SUITE, ppenumstate : *mut *mut core::ffi::c_void, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 441:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslEnumCipherSuitesEx(hsslprovider : NCRYPT_PROV_HANDLE, hprivatekey : NCRYPT_KEY_HANDLE, ppciphersuite : *mut *mut NCRYPT_SSL_CIPHER_SUITE_EX, ppenumstate : *mut *mut core::ffi::c_void, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslEnumEccCurves(hsslprovider : NCRYPT_PROV_HANDLE, pecccurvecount : *mut u32, ppecccurve : *mut *mut NCRYPT_SSL_ECC_CURVE, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 443:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslEnumProtocolProviders(pdwprovidercount : *mut u32, ppproviderlist : *mut *mut NCryptProviderName, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExpandBinderKey(hsslprovider : NCRYPT_PROV_HANDLE, hearlykey : NCRYPT_KEY_HANDLE, phbinderkey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExpandExporterMasterKey(hsslprovider : NCRYPT_PROV_HANDLE, hbasekey : NCRYPT_KEY_HANDLE, hhashvalue : NCRYPT_HASH_HANDLE, phexportermasterkey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 446:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExpandPreSharedKey(hsslprovider : NCRYPT_PROV_HANDLE, hresumptionmasterkey : NCRYPT_KEY_HANDLE, pbticketnonce : *const u8, cbticketnonce : u32, phpresharedkey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExpandResumptionMasterKey(hsslprovider : NCRYPT_PROV_HANDLE, hmasterkey : NCRYPT_KEY_HANDLE, hhashvalue : NCRYPT_HASH_HANDLE, phresumptionmasterkey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExpandTrafficKeys(hsslprovider : NCRYPT_PROV_HANDLE, hbasekey : NCRYPT_KEY_HANDLE, hhashvalue : NCRYPT_HASH_HANDLE, phclienttraffickey : *mut NCRYPT_KEY_HANDLE, phservertraffickey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExpandWriteKey(hsslprovider : NCRYPT_PROV_HANDLE, hbasetraffickey : NCRYPT_KEY_HANDLE, phwritekey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 450:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExportKey(hsslprovider : NCRYPT_PROV_HANDLE, hkey : NCRYPT_KEY_HANDLE, pszblobtype : windows_sys::core::PCWSTR, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 451:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExportKeyingMaterial(hsslprovider : NCRYPT_PROV_HANDLE, hmasterkey : NCRYPT_KEY_HANDLE, slabel : windows_sys::core::PCSTR, pbrandoms : *const u8, cbrandoms : u32, pbcontextvalue : *const u8, cbcontextvalue : u16, pboutput : *mut u8, cboutput : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExtractEarlyKey(hsslprovider : NCRYPT_PROV_HANDLE, hpresharedkey : NCRYPT_KEY_HANDLE, phearlykey : *mut NCRYPT_KEY_HANDLE, dwprotocol : u32, dwciphersuite : u32, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 453:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExtractHandshakeKey(hsslprovider : NCRYPT_PROV_HANDLE, hprivatekey : NCRYPT_KEY_HANDLE, hpublickey : NCRYPT_KEY_HANDLE, hearlykey : NCRYPT_KEY_HANDLE, phhandshakekey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslExtractMasterKey(hsslprovider : NCRYPT_PROV_HANDLE, hhandshakekey : NCRYPT_KEY_HANDLE, phmasterkey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 455:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslFreeBuffer(pvinput : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslFreeObject(hobject : NCRYPT_HANDLE, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 457:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslGenerateMasterKey(hsslprovider : NCRYPT_PROV_HANDLE, hprivatekey : NCRYPT_KEY_HANDLE, hpublickey : NCRYPT_KEY_HANDLE, phmasterkey : *mut NCRYPT_KEY_HANDLE, dwprotocol : u32, dwciphersuite : u32, pparameterlist : *const BCryptBufferDesc, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslGeneratePreMasterKey(hsslprovider : NCRYPT_PROV_HANDLE, hpublickey : NCRYPT_KEY_HANDLE, phpremasterkey : *mut NCRYPT_KEY_HANDLE, dwprotocol : u32, dwciphersuite : u32, pparameterlist : *const BCryptBufferDesc, pboutput : *mut u8, cboutput : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 459:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslGenerateSessionKeys(hsslprovider : NCRYPT_PROV_HANDLE, hmasterkey : NCRYPT_KEY_HANDLE, phreadkey : *mut NCRYPT_KEY_HANDLE, phwritekey : *mut NCRYPT_KEY_HANDLE, pparameterlist : *const BCryptBufferDesc, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslGetCipherSuitePRFHashAlgorithm(hsslprovider : NCRYPT_PROV_HANDLE, dwprotocol : u32, dwciphersuite : u32, dwkeytype : u32, szprfhash : windows_sys::core::PWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 461:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslGetKeyProperty(hkey : NCRYPT_KEY_HANDLE, pszproperty : windows_sys::core::PCWSTR, ppboutput : *mut *mut u8, pcboutput : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslGetProviderProperty(hsslprovider : NCRYPT_PROV_HANDLE, pszproperty : windows_sys::core::PCWSTR, ppboutput : *mut *mut u8, pcboutput : *mut u32, ppenumstate : *mut *mut core::ffi::c_void, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 463:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslHashHandshake(hsslprovider : NCRYPT_PROV_HANDLE, hhandshakehash : NCRYPT_HASH_HANDLE, pbinput : *const u8, cbinput : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 464:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslImportKey(hsslprovider : NCRYPT_PROV_HANDLE, phkey : *mut NCRYPT_KEY_HANDLE, pszblobtype : windows_sys::core::PCWSTR, pbkeyblob : *const u8, cbkeyblob : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 465:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslImportMasterKey(hsslprovider : NCRYPT_PROV_HANDLE, hprivatekey : NCRYPT_KEY_HANDLE, phmasterkey : *mut NCRYPT_KEY_HANDLE, dwprotocol : u32, dwciphersuite : u32, pparameterlist : *const BCryptBufferDesc, pbencryptedkey : *const u8, cbencryptedkey : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 466:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslIncrementProviderReferenceCount(hsslprovider : NCRYPT_PROV_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 467:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslLookupCipherLengths(hsslprovider : NCRYPT_PROV_HANDLE, dwprotocol : u32, dwciphersuite : u32, dwkeytype : u32, pcipherlengths : *mut NCRYPT_SSL_CIPHER_LENGTHS, cbcipherlengths : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 468:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslLookupCipherSuiteInfo(hsslprovider : NCRYPT_PROV_HANDLE, dwprotocol : u32, dwciphersuite : u32, dwkeytype : u32, pciphersuite : *mut NCRYPT_SSL_CIPHER_SUITE, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 469:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslOpenPrivateKey(hsslprovider : NCRYPT_PROV_HANDLE, phprivatekey : *mut NCRYPT_KEY_HANDLE, pcertcontext : *const CERT_CONTEXT, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 470:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslOpenProvider(phsslprovider : *mut NCRYPT_PROV_HANDLE, pszprovidername : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 471:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslSignHash(hsslprovider : NCRYPT_PROV_HANDLE, hprivatekey : NCRYPT_KEY_HANDLE, pbhashvalue : *const u8, cbhashvalue : u32, pbsignature : *mut u8, cbsignature : u32, pcbresult : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 472:1: declaration Macro has no candidate rule
// windows_link::link!("ncrypt.dll" "system" fn SslVerifySignature(hsslprovider : NCRYPT_PROV_HANDLE, hpublickey : NCRYPT_KEY_HANDLE, pbhashvalue : *const u8, cbhashvalue : u32, pbsignature : *const u8, cbsignature : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 473:1: declaration Macro has no candidate rule
// windows_link::link!("bcryptprimitives.dll" "system" fn SystemPrng(pbrandomdata : *mut u8, cbrandomdata : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 474:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn TransformBlock(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, cbindata : u32, pindata : *const u8, pcboutdata : *mut u32, ppoutdata : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 475:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn TransformFinalBlock(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, cbindata : u32, pindata : *const u8, pcboutdata : *mut u32, ppoutdata : *mut *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 476:1: declaration Macro has no candidate rule
// windows_link::link!("infocardapi.dll" "system" fn VerifyHash(hcrypto : *const INFORMATIONCARD_CRYPTO_HANDLE, cbhash : u32, phash : *const u8, hashalgoid : windows_sys::core::PCWSTR, cbsig : u32, psig : *const u8, pfverified : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

public const val `ALG_CLASS_ALL`: UInt = 57344u;
public const val `ALG_CLASS_ANY`: UInt = 0u;
public const val `ALG_CLASS_DATA_ENCRYPT`: UInt = 24576u;
public const val `ALG_CLASS_HASH`: UInt = 32768u;
public const val `ALG_CLASS_KEY_EXCHANGE`: UInt = 40960u;
public const val `ALG_CLASS_MSG_ENCRYPT`: UInt = 16384u;
public const val `ALG_CLASS_SIGNATURE`: UInt = 8192u;
public typealias `ALG_ID` = UInt;
public const val `ALG_SID_3DES`: UInt = 3u;
public const val `ALG_SID_3DES_112`: UInt = 9u;
public const val `ALG_SID_AES`: UInt = 17u;
public const val `ALG_SID_AES_128`: UInt = 14u;
public const val `ALG_SID_AES_192`: UInt = 15u;
public const val `ALG_SID_AES_256`: UInt = 16u;
public const val `ALG_SID_AGREED_KEY_ANY`: UInt = 3u;
public const val `ALG_SID_ANY`: UInt = 0u;
public const val `ALG_SID_CAST`: UInt = 6u;
public const val `ALG_SID_CYLINK_MEK`: UInt = 12u;
public const val `ALG_SID_DES`: UInt = 1u;
public const val `ALG_SID_DESX`: UInt = 4u;
public const val `ALG_SID_DH_EPHEM`: UInt = 2u;
public const val `ALG_SID_DH_SANDF`: UInt = 1u;
public const val `ALG_SID_DSS_ANY`: UInt = 0u;
public const val `ALG_SID_DSS_DMS`: UInt = 2u;
public const val `ALG_SID_DSS_PKCS`: UInt = 1u;
public const val `ALG_SID_ECDH`: UInt = 5u;
public const val `ALG_SID_ECDH_EPHEM`: UInt = 6u;
public const val `ALG_SID_ECDSA`: UInt = 3u;
public const val `ALG_SID_ECMQV`: UInt = 1u;
public const val `ALG_SID_EXAMPLE`: UInt = 80u;
public const val `ALG_SID_HASH_REPLACE_OWF`: UInt = 11u;
public const val `ALG_SID_HMAC`: UInt = 9u;
public const val `ALG_SID_IDEA`: UInt = 5u;
public const val `ALG_SID_KEA`: UInt = 4u;
public const val `ALG_SID_MAC`: UInt = 5u;
public const val `ALG_SID_MD2`: UInt = 1u;
public const val `ALG_SID_MD4`: UInt = 2u;
public const val `ALG_SID_MD5`: UInt = 3u;
public const val `ALG_SID_PCT1_MASTER`: UInt = 4u;
public const val `ALG_SID_RC2`: UInt = 2u;
public const val `ALG_SID_RC4`: UInt = 1u;
public const val `ALG_SID_RC5`: UInt = 13u;
public const val `ALG_SID_RIPEMD`: UInt = 6u;
public const val `ALG_SID_RIPEMD160`: UInt = 7u;
public const val `ALG_SID_RSA_ANY`: UInt = 0u;
public const val `ALG_SID_RSA_ENTRUST`: UInt = 3u;
public const val `ALG_SID_RSA_MSATWORK`: UInt = 2u;
public const val `ALG_SID_RSA_PGP`: UInt = 4u;
public const val `ALG_SID_RSA_PKCS`: UInt = 1u;
public const val `ALG_SID_SAFERSK128`: UInt = 8u;
public const val `ALG_SID_SAFERSK64`: UInt = 7u;
public const val `ALG_SID_SCHANNEL_ENC_KEY`: UInt = 7u;
public const val `ALG_SID_SCHANNEL_MAC_KEY`: UInt = 3u;
public const val `ALG_SID_SCHANNEL_MASTER_HASH`: UInt = 2u;
public const val `ALG_SID_SEAL`: UInt = 2u;
public const val `ALG_SID_SHA`: UInt = 4u;
public const val `ALG_SID_SHA1`: UInt = 4u;
public const val `ALG_SID_SHA_256`: UInt = 12u;
public const val `ALG_SID_SHA_384`: UInt = 13u;
public const val `ALG_SID_SHA_512`: UInt = 14u;
public const val `ALG_SID_SKIPJACK`: UInt = 10u;
public const val `ALG_SID_SSL2_MASTER`: UInt = 5u;
public const val `ALG_SID_SSL3SHAMD5`: UInt = 8u;
public const val `ALG_SID_SSL3_MASTER`: UInt = 1u;
public const val `ALG_SID_TEK`: UInt = 11u;
public const val `ALG_SID_THIRDPARTY_ANY`: UInt = 0u;
public const val `ALG_SID_TLS1PRF`: UInt = 10u;
public const val `ALG_SID_TLS1_MASTER`: UInt = 6u;
public const val `ALG_TYPE_ANY`: UInt = 0u;
public const val `ALG_TYPE_BLOCK`: UInt = 1536u;
public const val `ALG_TYPE_DH`: UInt = 2560u;
public const val `ALG_TYPE_DSS`: UInt = 512u;
public const val `ALG_TYPE_ECDH`: UInt = 3584u;
public const val `ALG_TYPE_RSA`: UInt = 1024u;
public const val `ALG_TYPE_SECURECHANNEL`: UInt = 3072u;
public const val `ALG_TYPE_STREAM`: UInt = 2048u;
public const val `ALG_TYPE_THIRDPARTY`: UInt = 4096u;
public const val `AT_ECDHE_P256`: UInt = 6u;
public const val `AT_ECDHE_P384`: UInt = 7u;
public const val `AT_ECDHE_P521`: UInt = 8u;
public const val `AT_ECDSA_P256`: UInt = 3u;
public const val `AT_ECDSA_P384`: UInt = 4u;
public const val `AT_ECDSA_P521`: UInt = 5u;
public const val `AT_KEYEXCHANGE`: `CERT_KEY_SPEC` = 1u;
public const val `AT_SIGNATURE`: `CERT_KEY_SPEC` = 2u;
public const val `AUDIT_CARD_DELETE`: Int = 1074070017;
public const val `AUDIT_CARD_IMPORT`: Int = 1074070018;
public const val `AUDIT_CARD_WRITTEN`: Int = 1074070016;
public const val `AUDIT_SERVICE_IDLE_STOP`: Int = 1074070022;
public const val `AUDIT_STORE_DELETE`: Int = 1074070021;
public const val `AUDIT_STORE_EXPORT`: Int = 1074070020;
public const val `AUDIT_STORE_IMPORT`: Int = 1074070019;
// UNSUPPORTED Rust 569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA {
//     pub cbSize: u32,
//     pub dwRegPolicySettings: u32,
//     pub pSignerInfo: *mut CMSG_SIGNER_INFO,
// }

// UNSUPPORTED Rust 576:1: declaration Impl has no candidate rule
// impl Default for AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 581:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS {
//     pub cbSize: u32,
//     pub fCommercial: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AUTHENTICODE_TS_EXTRA_CERT_CHAIN_POLICY_PARA {
//     pub cbSize: u32,
//     pub dwRegPolicySettings: u32,
//     pub fCommercial: windows_sys::core::BOOL,
// }

public const val `AUTHTYPE_CLIENT`: `HTTPSPOLICY_CALLBACK_DATA_AUTH_TYPE` = 1u;
public const val `AUTHTYPE_SERVER`: `HTTPSPOLICY_CALLBACK_DATA_AUTH_TYPE` = 2u;
public const val `AdminCreateDeleteDirAc`: `CARD_DIRECTORY_ACCESS_CONDITION` = 2;
public const val `AdminReadWriteAc`: `CARD_FILE_ACCESS_CONDITION` = 6;
public const val `AdministratorPin`: `SECRET_PURPOSE` = 4;
public const val `AlphaNumericPinType`: `SECRET_TYPE` = 0;
public const val `AuthenticationPin`: `SECRET_PURPOSE` = 0;
public const val `BASIC_CONSTRAINTS_CERT_CHAIN_POLICY_CA_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 2147483648u;
public const val `BASIC_CONSTRAINTS_CERT_CHAIN_POLICY_END_ENTITY_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 1073741824u;
public const val `BCRYPTBUFFER_VERSION`: UInt = 0u;
public typealias `BCRYPTGENRANDOM_FLAGS` = UInt;
// UNSUPPORTED Rust 605:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_112_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("3DES_112");

// UNSUPPORTED Rust 606:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_112_CBC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 369u32 as _;

// UNSUPPORTED Rust 607:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_112_CFB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 401u32 as _;

// UNSUPPORTED Rust 608:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_112_ECB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 385u32 as _;

// UNSUPPORTED Rust 609:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("3DES");

// UNSUPPORTED Rust 610:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_CBC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 321u32 as _;

// UNSUPPORTED Rust 611:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_CFB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 353u32 as _;

// UNSUPPORTED Rust 612:1: non-scalar type Ptr unsupported
// pub const BCRYPT_3DES_ECB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 337u32 as _;

// UNSUPPORTED Rust 613:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AES");

// UNSUPPORTED Rust 614:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_CBC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 417u32 as _;

// UNSUPPORTED Rust 615:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_CCM_ALG_HANDLE: BCRYPT_ALG_HANDLE = 465u32 as _;

// UNSUPPORTED Rust 616:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_CFB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 449u32 as _;

// UNSUPPORTED Rust 617:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_CMAC_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AES-CMAC");

// UNSUPPORTED Rust 618:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_CMAC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 257u32 as _;

// UNSUPPORTED Rust 619:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_ECB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 433u32 as _;

// UNSUPPORTED Rust 620:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_GCM_ALG_HANDLE: BCRYPT_ALG_HANDLE = 481u32 as _;

// UNSUPPORTED Rust 621:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_GMAC_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AES-GMAC");

// UNSUPPORTED Rust 622:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_GMAC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 273u32 as _;

// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AES_WRAP_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("Rfc3565KeyWrapBlob");

// UNSUPPORTED Rust 624:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_ALGORITHM_IDENTIFIER {
//     pub pszName: windows_sys::core::PWSTR,
//     pub dwClass: u32,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 631:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_ALGORITHM_IDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 636:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ALGORITHM_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AlgorithmName");

// UNSUPPORTED Rust 637:1: non-scalar type Ptr unsupported
// pub type BCRYPT_ALG_HANDLE = *mut core::ffi::c_void;

public const val `BCRYPT_ALG_HANDLE_HMAC_FLAG`: `BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS` = 8u;
// UNSUPPORTED Rust 639:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_ASYMMETRIC_ENCRYPTION_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn,
//     pub GetProperty: BCryptGetPropertyFn,
//     pub SetProperty: BCryptSetPropertyFn,
//     pub CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn,
//     pub GenerateKeyPair: BCryptGenerateKeyPairFn,
//     pub FinalizeKeyPair: BCryptFinalizeKeyPairFn,
//     pub Encrypt: BCryptEncryptFn,
//     pub Decrypt: BCryptDecryptFn,
//     pub ImportKeyPair: BCryptImportKeyPairFn,
//     pub ExportKey: BCryptExportKeyFn,
//     pub DestroyKey: BCryptDestroyKeyFn,
//     pub SignHash: BCryptSignHashFn,
//     pub VerifySignature: BCryptVerifySignatureFn,
// }

public const val `BCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE`: `BCRYPT_INTERFACE` = 3u;
public const val `BCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION`: `BCRYPT_OPERATION` = 4u;
// UNSUPPORTED Rust 659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {
//     pub cbSize: u32,
//     pub dwInfoVersion: u32,
//     pub pbNonce: *mut u8,
//     pub cbNonce: u32,
//     pub pbAuthData: *mut u8,
//     pub cbAuthData: u32,
//     pub pbTag: *mut u8,
//     pub cbTag: u32,
//     pub pbMacContext: *mut u8,
//     pub cbMacContext: u32,
//     pub cbAAD: u32,
//     pub cbData: u64,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 676:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO_VERSION`: UInt = 1u;
public const val `BCRYPT_AUTH_MODE_CHAIN_CALLS_FLAG`: UInt = 1u;
public const val `BCRYPT_AUTH_MODE_IN_PROGRESS_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 684:1: non-scalar type Ptr unsupported
// pub const BCRYPT_AUTH_TAG_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthTagLength");

// UNSUPPORTED Rust 685:1: non-scalar type Ptr unsupported
// pub const BCRYPT_BLOCK_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("BlockLength");

public const val `BCRYPT_BLOCK_PADDING`: `BCRYPT_FLAGS` = 1u;
// UNSUPPORTED Rust 687:1: non-scalar type Ptr unsupported
// pub const BCRYPT_BLOCK_SIZE_LIST: windows_sys::core::PCWSTR = windows_sys::core::w!("BlockSizeList");

public const val `BCRYPT_BUFFERS_LOCKED_FLAG`: UInt = 64u;
public const val `BCRYPT_CAPI_AES_FLAG`: UInt = 16u;
// UNSUPPORTED Rust 690:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CAPI_KDF_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPI_KDF");

// UNSUPPORTED Rust 691:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CAPI_KDF_ALG_HANDLE: BCRYPT_ALG_HANDLE = 801u32 as _;

// UNSUPPORTED Rust 692:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHACHA20_POLY1305_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CHACHA20_POLY1305");

// UNSUPPORTED Rust 693:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHACHA20_POLY1305_ALG_HANDLE: BCRYPT_ALG_HANDLE = 929u32 as _;

// UNSUPPORTED Rust 694:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHAINING_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingMode");

// UNSUPPORTED Rust 695:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHAIN_MODE_CBC: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingModeCBC");

// UNSUPPORTED Rust 696:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHAIN_MODE_CCM: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingModeCCM");

// UNSUPPORTED Rust 697:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHAIN_MODE_CFB: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingModeCFB");

// UNSUPPORTED Rust 698:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHAIN_MODE_ECB: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingModeECB");

// UNSUPPORTED Rust 699:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHAIN_MODE_GCM: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingModeGCM");

// UNSUPPORTED Rust 700:1: non-scalar type Ptr unsupported
// pub const BCRYPT_CHAIN_MODE_NA: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingModeN/A");

// UNSUPPORTED Rust 701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_CIPHER_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn,
//     pub GetProperty: BCryptGetPropertyFn,
//     pub SetProperty: BCryptSetPropertyFn,
//     pub CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn,
//     pub GenerateKey: BCryptGenerateSymmetricKeyFn,
//     pub Encrypt: BCryptEncryptFn,
//     pub Decrypt: BCryptDecryptFn,
//     pub ImportKey: BCryptImportKeyFn,
//     pub ExportKey: BCryptExportKeyFn,
//     pub DuplicateKey: BCryptDuplicateKeyFn,
//     pub DestroyKey: BCryptDestroyKeyFn,
// }

public const val `BCRYPT_CIPHER_INTERFACE`: `BCRYPT_INTERFACE` = 1u;
public const val `BCRYPT_CIPHER_OPERATION`: `BCRYPT_OPERATION` = 1u;
public const val `BCRYPT_COPY_AFTER_PADDING_CHECK_FAILURE_FLAG`: UInt = 256u;
// UNSUPPORTED Rust 720:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DESX_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DESX");

// UNSUPPORTED Rust 721:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DESX_CBC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 545u32 as _;

// UNSUPPORTED Rust 722:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DESX_CFB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 577u32 as _;

// UNSUPPORTED Rust 723:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DESX_ECB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 561u32 as _;

// UNSUPPORTED Rust 724:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DES");

// UNSUPPORTED Rust 725:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DES_CBC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 497u32 as _;

// UNSUPPORTED Rust 726:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DES_CFB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 529u32 as _;

// UNSUPPORTED Rust 727:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DES_ECB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 513u32 as _;

// UNSUPPORTED Rust 728:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DH_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DH");

// UNSUPPORTED Rust 729:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DH_ALG_HANDLE: BCRYPT_ALG_HANDLE = 641u32 as _;

// UNSUPPORTED Rust 730:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_DH_KEY_BLOB {
//     pub dwMagic: BCRYPT_DH_KEY_BLOB_MAGIC,
//     pub cbKey: u32,
// }

public typealias `BCRYPT_DH_KEY_BLOB_MAGIC` = UInt;
// UNSUPPORTED Rust 737:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DH_PARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("DHParameters");

public const val `BCRYPT_DH_PARAMETERS_MAGIC`: UInt = 1297107012u;
// UNSUPPORTED Rust 739:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_DH_PARAMETER_HEADER {
//     pub cbLength: u32,
//     pub dwMagic: u32,
//     pub cbKeyLength: u32,
// }

// UNSUPPORTED Rust 746:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DH_PRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("DHPRIVATEBLOB");

public const val `BCRYPT_DH_PRIVATE_MAGIC`: `BCRYPT_DH_KEY_BLOB_MAGIC` = 1448101956u;
// UNSUPPORTED Rust 748:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DH_PUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("DHPUBLICBLOB");

public const val `BCRYPT_DH_PUBLIC_MAGIC`: `BCRYPT_DH_KEY_BLOB_MAGIC` = 1112557636u;
// UNSUPPORTED Rust 750:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DSA");

// UNSUPPORTED Rust 751:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DSA_ALG_HANDLE: BCRYPT_ALG_HANDLE = 721u32 as _;

// UNSUPPORTED Rust 752:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_DSA_KEY_BLOB {
//     pub dwMagic: BCRYPT_DSA_MAGIC,
//     pub cbKey: u32,
//     pub Count: [u8; 4],
//     pub Seed: [u8; 20],
//     pub q: [u8; 20],
// }

// UNSUPPORTED Rust 761:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_DSA_KEY_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_DSA_KEY_BLOB_V2 {
//     pub dwMagic: BCRYPT_DSA_MAGIC,
//     pub cbKey: u32,
//     pub hashAlgorithm: HASHALGORITHM_ENUM,
//     pub standardVersion: DSAFIPSVERSION_ENUM,
//     pub cbSeedLength: u32,
//     pub cbGroupSize: u32,
//     pub Count: [u8; 4],
// }

// UNSUPPORTED Rust 777:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_DSA_KEY_BLOB_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BCRYPT_DSA_MAGIC` = UInt;
// UNSUPPORTED Rust 783:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DSA_PARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("DSAParameters");

public const val `BCRYPT_DSA_PARAMETERS_MAGIC`: UInt = 1297109828u;
public const val `BCRYPT_DSA_PARAMETERS_MAGIC_V2`: UInt = 843927620u;
// UNSUPPORTED Rust 786:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_DSA_PARAMETER_HEADER {
//     pub cbLength: u32,
//     pub dwMagic: u32,
//     pub cbKeyLength: u32,
//     pub Count: [u8; 4],
//     pub Seed: [u8; 20],
//     pub q: [u8; 20],
// }

// UNSUPPORTED Rust 796:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_DSA_PARAMETER_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 801:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_DSA_PARAMETER_HEADER_V2 {
//     pub cbLength: u32,
//     pub dwMagic: u32,
//     pub cbKeyLength: u32,
//     pub hashAlgorithm: HASHALGORITHM_ENUM,
//     pub standardVersion: DSAFIPSVERSION_ENUM,
//     pub cbSeedLength: u32,
//     pub cbGroupSize: u32,
//     pub Count: [u8; 4],
// }

// UNSUPPORTED Rust 813:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_DSA_PARAMETER_HEADER_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 818:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DSA_PRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("DSAPRIVATEBLOB");

public const val `BCRYPT_DSA_PRIVATE_MAGIC`: `BCRYPT_DSA_MAGIC` = 1448104772u;
public const val `BCRYPT_DSA_PRIVATE_MAGIC_V2`: UInt = 844517444u;
// UNSUPPORTED Rust 821:1: non-scalar type Ptr unsupported
// pub const BCRYPT_DSA_PUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("DSAPUBLICBLOB");

public const val `BCRYPT_DSA_PUBLIC_MAGIC`: `BCRYPT_DSA_MAGIC` = 1112560452u;
public const val `BCRYPT_DSA_PUBLIC_MAGIC_V2`: UInt = 843206724u;
// UNSUPPORTED Rust 824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_ECCFULLKEY_BLOB {
//     pub dwMagic: u32,
//     pub dwVersion: u32,
//     pub dwCurveType: ECC_CURVE_TYPE_ENUM,
//     pub dwCurveGenerationAlgId: ECC_CURVE_ALG_ID_ENUM,
//     pub cbFieldLength: u32,
//     pub cbSubgroupOrder: u32,
//     pub cbCofactor: u32,
//     pub cbSeed: u32,
// }

// UNSUPPORTED Rust 836:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECCFULLPRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCFULLPRIVATEBLOB");

// UNSUPPORTED Rust 837:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECCFULLPUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCFULLPUBLICBLOB");

// UNSUPPORTED Rust 838:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_ECCKEY_BLOB {
//     pub dwMagic: u32,
//     pub cbKey: u32,
// }

// UNSUPPORTED Rust 844:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECCPRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCPRIVATEBLOB");

// UNSUPPORTED Rust 845:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECCPUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCPUBLICBLOB");

// UNSUPPORTED Rust 846:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_25519: windows_sys::core::PCWSTR = windows_sys::core::w!("curve25519");

// UNSUPPORTED Rust 847:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP160R1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP160r1");

// UNSUPPORTED Rust 848:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP160T1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP160t1");

// UNSUPPORTED Rust 849:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP192R1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP192r1");

// UNSUPPORTED Rust 850:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP192T1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP192t1");

// UNSUPPORTED Rust 851:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP224R1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP224r1");

// UNSUPPORTED Rust 852:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP224T1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP224t1");

// UNSUPPORTED Rust 853:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP256R1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP256r1");

// UNSUPPORTED Rust 854:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP256T1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP256t1");

// UNSUPPORTED Rust 855:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP320R1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP320r1");

// UNSUPPORTED Rust 856:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP320T1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP320t1");

// UNSUPPORTED Rust 857:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP384R1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP384r1");

// UNSUPPORTED Rust 858:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP384T1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP384t1");

// UNSUPPORTED Rust 859:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP512R1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP512r1");

// UNSUPPORTED Rust 860:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_BRAINPOOLP512T1: windows_sys::core::PCWSTR = windows_sys::core::w!("brainpoolP512t1");

// UNSUPPORTED Rust 861:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_EC192WAPI: windows_sys::core::PCWSTR = windows_sys::core::w!("ec192wapi");

// UNSUPPORTED Rust 862:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCCurveName");

// UNSUPPORTED Rust 863:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_ECC_CURVE_NAMES {
//     pub dwEccCurveNames: u32,
//     pub pEccCurveNames: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 869:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_ECC_CURVE_NAMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 874:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NAME_LIST: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCCurveNameList");

// UNSUPPORTED Rust 875:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NISTP192: windows_sys::core::PCWSTR = windows_sys::core::w!("nistP192");

// UNSUPPORTED Rust 876:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NISTP224: windows_sys::core::PCWSTR = windows_sys::core::w!("nistP224");

// UNSUPPORTED Rust 877:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NISTP256: windows_sys::core::PCWSTR = windows_sys::core::w!("nistP256");

// UNSUPPORTED Rust 878:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NISTP384: windows_sys::core::PCWSTR = windows_sys::core::w!("nistP384");

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NISTP521: windows_sys::core::PCWSTR = windows_sys::core::w!("nistP521");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NUMSP256T1: windows_sys::core::PCWSTR = windows_sys::core::w!("numsP256t1");

// UNSUPPORTED Rust 881:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NUMSP384T1: windows_sys::core::PCWSTR = windows_sys::core::w!("numsP384t1");

// UNSUPPORTED Rust 882:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_NUMSP512T1: windows_sys::core::PCWSTR = windows_sys::core::w!("numsP512t1");

// UNSUPPORTED Rust 883:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP160K1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP160k1");

// UNSUPPORTED Rust 884:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP160R1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP160r1");

// UNSUPPORTED Rust 885:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP160R2: windows_sys::core::PCWSTR = windows_sys::core::w!("secP160r2");

// UNSUPPORTED Rust 886:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP192K1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP192k1");

// UNSUPPORTED Rust 887:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP192R1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP192r1");

// UNSUPPORTED Rust 888:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP224K1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP224k1");

// UNSUPPORTED Rust 889:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP224R1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP224r1");

// UNSUPPORTED Rust 890:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP256K1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP256k1");

// UNSUPPORTED Rust 891:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP256R1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP256r1");

// UNSUPPORTED Rust 892:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP384R1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP384r1");

// UNSUPPORTED Rust 893:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_SECP521R1: windows_sys::core::PCWSTR = windows_sys::core::w!("secP521r1");

// UNSUPPORTED Rust 894:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_WTLS12: windows_sys::core::PCWSTR = windows_sys::core::w!("wtls12");

// UNSUPPORTED Rust 895:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_WTLS7: windows_sys::core::PCWSTR = windows_sys::core::w!("wtls7");

// UNSUPPORTED Rust 896:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_WTLS9: windows_sys::core::PCWSTR = windows_sys::core::w!("wtls9");

// UNSUPPORTED Rust 897:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_X962P192V1: windows_sys::core::PCWSTR = windows_sys::core::w!("x962P192v1");

// UNSUPPORTED Rust 898:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_X962P192V2: windows_sys::core::PCWSTR = windows_sys::core::w!("x962P192v2");

// UNSUPPORTED Rust 899:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_X962P192V3: windows_sys::core::PCWSTR = windows_sys::core::w!("x962P192v3");

// UNSUPPORTED Rust 900:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_X962P239V1: windows_sys::core::PCWSTR = windows_sys::core::w!("x962P239v1");

// UNSUPPORTED Rust 901:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_X962P239V2: windows_sys::core::PCWSTR = windows_sys::core::w!("x962P239v2");

// UNSUPPORTED Rust 902:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_X962P239V3: windows_sys::core::PCWSTR = windows_sys::core::w!("x962P239v3");

// UNSUPPORTED Rust 903:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_CURVE_X962P256V1: windows_sys::core::PCWSTR = windows_sys::core::w!("x962P256v1");

public const val `BCRYPT_ECC_FULLKEY_BLOB_V1`: UInt = 1u;
// UNSUPPORTED Rust 905:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECC_PARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCParameters");

public const val `BCRYPT_ECC_PARAMETERS_MAGIC`: UInt = 1346585413u;
// UNSUPPORTED Rust 907:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_ECC_PARAMETER_HEADER {
//     pub dwVersion: u32,
//     pub dwCurveType: ECC_CURVE_TYPE_ENUM,
//     pub dwCurveGenerationAlgId: ECC_CURVE_ALG_ID_ENUM,
//     pub cbFieldLength: u32,
//     pub cbSubgroupOrder: u32,
//     pub cbCofactor: u32,
//     pub cbSeed: u32,
// }

public const val `BCRYPT_ECC_PARAMETER_HEADER_V1`: UInt = 1u;
public const val `BCRYPT_ECC_PRIME_MONTGOMERY_CURVE`: `ECC_CURVE_TYPE_ENUM` = 3;
public const val `BCRYPT_ECC_PRIME_SHORT_WEIERSTRASS_CURVE`: `ECC_CURVE_TYPE_ENUM` = 1;
public const val `BCRYPT_ECC_PRIME_TWISTED_EDWARDS_CURVE`: `ECC_CURVE_TYPE_ENUM` = 2;
// UNSUPPORTED Rust 922:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH");

// UNSUPPORTED Rust 923:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_ALG_HANDLE: BCRYPT_ALG_HANDLE = 657u32 as _;

// UNSUPPORTED Rust 924:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_P256_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH_P256");

// UNSUPPORTED Rust 925:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_P256_ALG_HANDLE: BCRYPT_ALG_HANDLE = 673u32 as _;

// UNSUPPORTED Rust 926:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_P384_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH_P384");

// UNSUPPORTED Rust 927:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_P384_ALG_HANDLE: BCRYPT_ALG_HANDLE = 689u32 as _;

// UNSUPPORTED Rust 928:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_P521_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH_P521");

// UNSUPPORTED Rust 929:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDH_P521_ALG_HANDLE: BCRYPT_ALG_HANDLE = 705u32 as _;

public const val `BCRYPT_ECDH_PRIVATE_GENERIC_MAGIC`: UInt = 1447772997u;
public const val `BCRYPT_ECDH_PRIVATE_P256_MAGIC`: UInt = 843793221u;
public const val `BCRYPT_ECDH_PRIVATE_P384_MAGIC`: UInt = 877347653u;
public const val `BCRYPT_ECDH_PRIVATE_P521_MAGIC`: UInt = 910902085u;
public const val `BCRYPT_ECDH_PUBLIC_GENERIC_MAGIC`: UInt = 1347109701u;
public const val `BCRYPT_ECDH_PUBLIC_P256_MAGIC`: UInt = 827016005u;
public const val `BCRYPT_ECDH_PUBLIC_P384_MAGIC`: UInt = 860570437u;
public const val `BCRYPT_ECDH_PUBLIC_P521_MAGIC`: UInt = 894124869u;
// UNSUPPORTED Rust 938:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA");

// UNSUPPORTED Rust 939:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_ALG_HANDLE: BCRYPT_ALG_HANDLE = 241u32 as _;

// UNSUPPORTED Rust 940:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_P256_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA_P256");

// UNSUPPORTED Rust 941:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_P256_ALG_HANDLE: BCRYPT_ALG_HANDLE = 737u32 as _;

// UNSUPPORTED Rust 942:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_P384_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA_P384");

// UNSUPPORTED Rust 943:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_P384_ALG_HANDLE: BCRYPT_ALG_HANDLE = 753u32 as _;

// UNSUPPORTED Rust 944:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_P521_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA_P521");

// UNSUPPORTED Rust 945:1: non-scalar type Ptr unsupported
// pub const BCRYPT_ECDSA_P521_ALG_HANDLE: BCRYPT_ALG_HANDLE = 769u32 as _;

public const val `BCRYPT_ECDSA_PRIVATE_GENERIC_MAGIC`: UInt = 1447314245u;
public const val `BCRYPT_ECDSA_PRIVATE_P256_MAGIC`: UInt = 844317509u;
public const val `BCRYPT_ECDSA_PRIVATE_P384_MAGIC`: UInt = 877871941u;
public const val `BCRYPT_ECDSA_PRIVATE_P521_MAGIC`: UInt = 911426373u;
public const val `BCRYPT_ECDSA_PUBLIC_GENERIC_MAGIC`: UInt = 1346650949u;
public const val `BCRYPT_ECDSA_PUBLIC_P256_MAGIC`: UInt = 827540293u;
public const val `BCRYPT_ECDSA_PUBLIC_P384_MAGIC`: UInt = 861094725u;
public const val `BCRYPT_ECDSA_PUBLIC_P521_MAGIC`: UInt = 894649157u;
// UNSUPPORTED Rust 954:1: non-scalar type Ptr unsupported
// pub const BCRYPT_EFFECTIVE_KEY_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("EffectiveKeyLength");

public const val `BCRYPT_ENABLE_INCOMPATIBLE_FIPS_CHECKS`: UInt = 256u;
public const val `BCRYPT_EXTENDED_KEYSIZE`: UInt = 128u;
public typealias `BCRYPT_FLAGS` = UInt;
public const val `BCRYPT_GENERATE_IV`: UInt = 32u;
// UNSUPPORTED Rust 959:1: non-scalar type Ptr unsupported
// pub const BCRYPT_GLOBAL_PARAMETERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SecretAgreementParam");

// UNSUPPORTED Rust 960:1: non-scalar type Ptr unsupported
// pub type BCRYPT_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 961:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HASH_BLOCK_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("HashBlockLength");

// UNSUPPORTED Rust 962:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_HASH_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn,
//     pub GetProperty: BCryptGetPropertyFn,
//     pub SetProperty: BCryptSetPropertyFn,
//     pub CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn,
//     pub CreateHash: BCryptCreateHashFn,
//     pub HashData: BCryptHashDataFn,
//     pub FinishHash: BCryptFinishHashFn,
//     pub DuplicateHash: BCryptDuplicateHashFn,
//     pub DestroyHash: BCryptDestroyHashFn,
//     pub CreateMultiHash: BCryptCreateMultiHashFn,
//     pub ProcessMultiOperations: BCryptProcessMultiOperationsFn,
// }

// UNSUPPORTED Rust 978:1: non-scalar type Ptr unsupported
// pub type BCRYPT_HASH_HANDLE = *mut core::ffi::c_void;

public const val `BCRYPT_HASH_INTERFACE`: `BCRYPT_INTERFACE` = 2u;
public const val `BCRYPT_HASH_INTERFACE_MAJORVERSION_2`: UInt = 2u;
// UNSUPPORTED Rust 981:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HASH_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("HashDigestLength");

// UNSUPPORTED Rust 982:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HASH_OID_LIST: windows_sys::core::PCWSTR = windows_sys::core::w!("HashOIDList");

public const val `BCRYPT_HASH_OPERATION`: `BCRYPT_OPERATION` = 2u;
public const val `BCRYPT_HASH_OPERATION_FINISH_HASH`: `BCRYPT_HASH_OPERATION_TYPE` = 2;
public const val `BCRYPT_HASH_OPERATION_HASH_DATA`: `BCRYPT_HASH_OPERATION_TYPE` = 1;
public typealias `BCRYPT_HASH_OPERATION_TYPE` = Int;
public const val `BCRYPT_HASH_REUSABLE_FLAG`: `BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS` = 32u;
// UNSUPPORTED Rust 988:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HKDF_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("HKDF");

// UNSUPPORTED Rust 989:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HKDF_ALG_HANDLE: BCRYPT_ALG_HANDLE = 913u32 as _;

// UNSUPPORTED Rust 990:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HKDF_HASH_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("HkdfHashAlgorithm");

// UNSUPPORTED Rust 991:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HKDF_PRK_AND_FINALIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("HkdfPrkAndFinalize");

// UNSUPPORTED Rust 992:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HKDF_SALT_AND_FINALIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("HkdfSaltAndFinalize");

// UNSUPPORTED Rust 993:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HMAC_MD2_ALG_HANDLE: BCRYPT_ALG_HANDLE = 289u32 as _;

// UNSUPPORTED Rust 994:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HMAC_MD4_ALG_HANDLE: BCRYPT_ALG_HANDLE = 305u32 as _;

// UNSUPPORTED Rust 995:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HMAC_MD5_ALG_HANDLE: BCRYPT_ALG_HANDLE = 145u32 as _;

// UNSUPPORTED Rust 996:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HMAC_SHA1_ALG_HANDLE: BCRYPT_ALG_HANDLE = 161u32 as _;

// UNSUPPORTED Rust 997:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HMAC_SHA256_ALG_HANDLE: BCRYPT_ALG_HANDLE = 177u32 as _;

// UNSUPPORTED Rust 998:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HMAC_SHA384_ALG_HANDLE: BCRYPT_ALG_HANDLE = 193u32 as _;

// UNSUPPORTED Rust 999:1: non-scalar type Ptr unsupported
// pub const BCRYPT_HMAC_SHA512_ALG_HANDLE: BCRYPT_ALG_HANDLE = 209u32 as _;

// UNSUPPORTED Rust 1000:1: non-scalar type Ptr unsupported
// pub const BCRYPT_INITIALIZATION_VECTOR: windows_sys::core::PCWSTR = windows_sys::core::w!("IV");

public typealias `BCRYPT_INTERFACE` = UInt;
// UNSUPPORTED Rust 1002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_INTERFACE_VERSION {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
// }

// UNSUPPORTED Rust 1008:1: non-scalar type Ptr unsupported
// pub const BCRYPT_IS_IFX_TPM_WEAK_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("IsIfxTpmWeakKey");

// UNSUPPORTED Rust 1009:1: non-scalar type Ptr unsupported
// pub const BCRYPT_IS_KEYED_HASH: windows_sys::core::PCWSTR = windows_sys::core::w!("IsKeyedHash");

// UNSUPPORTED Rust 1010:1: non-scalar type Ptr unsupported
// pub const BCRYPT_IS_REUSABLE_HASH: windows_sys::core::PCWSTR = windows_sys::core::w!("IsReusableHash");

// UNSUPPORTED Rust 1011:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KDF_HASH: windows_sys::core::PCWSTR = windows_sys::core::w!("HASH");

// UNSUPPORTED Rust 1012:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KDF_HKDF: windows_sys::core::PCWSTR = windows_sys::core::w!("HKDF");

// UNSUPPORTED Rust 1013:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KDF_HMAC: windows_sys::core::PCWSTR = windows_sys::core::w!("HMAC");

// UNSUPPORTED Rust 1014:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KDF_RAW_SECRET: windows_sys::core::PCWSTR = windows_sys::core::w!("TRUNCATE");

// UNSUPPORTED Rust 1015:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KDF_SP80056A_CONCAT: windows_sys::core::PCWSTR = windows_sys::core::w!("SP800_56A_CONCAT");

// UNSUPPORTED Rust 1016:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KDF_TLS_PRF: windows_sys::core::PCWSTR = windows_sys::core::w!("TLS_PRF");

// UNSUPPORTED Rust 1017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_KEY_BLOB {
//     pub Magic: u32,
// }

// UNSUPPORTED Rust 1022:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KEY_DATA_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyDataBlob");

// UNSUPPORTED Rust 1023:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_KEY_DATA_BLOB_HEADER {
//     pub dwMagic: u32,
//     pub dwVersion: u32,
//     pub cbKeyData: u32,
// }

public const val `BCRYPT_KEY_DATA_BLOB_MAGIC`: UInt = 1296188491u;
public const val `BCRYPT_KEY_DATA_BLOB_VERSION1`: UInt = 1u;
// UNSUPPORTED Rust 1032:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_KEY_DERIVATION_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn,
//     pub GetProperty: BCryptGetPropertyFn,
//     pub SetProperty: BCryptSetPropertyFn,
//     pub CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn,
//     pub GenerateKey: BCryptGenerateSymmetricKeyFn,
//     pub DestroyKey: BCryptDestroyKeyFn,
//     pub KeyDerivation: BCryptKeyDerivationFn,
//     pub ExportKey: BCryptExportKeyFn,
//     pub ImportKey: BCryptImportKeyFn,
//     pub DuplicateKey: BCryptDuplicateKeyFn,
// }

public const val `BCRYPT_KEY_DERIVATION_INTERFACE`: UInt = 7u;
public const val `BCRYPT_KEY_DERIVATION_OPERATION`: UInt = 64u;
// UNSUPPORTED Rust 1049:1: non-scalar type Ptr unsupported
// pub type BCRYPT_KEY_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1050:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KEY_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyLength");

// UNSUPPORTED Rust 1051:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KEY_LENGTHS: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyLengths");

// UNSUPPORTED Rust 1052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_KEY_LENGTHS_STRUCT {
//     pub dwMinLength: u32,
//     pub dwMaxLength: u32,
//     pub dwIncrement: u32,
// }

// UNSUPPORTED Rust 1059:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KEY_OBJECT_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyObjectLength");

// UNSUPPORTED Rust 1060:1: non-scalar type Ptr unsupported
// pub const BCRYPT_KEY_STRENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("KeyStrength");

public const val `BCRYPT_KEY_VALIDATION_RANGE`: UInt = 16u;
public const val `BCRYPT_KEY_VALIDATION_RANGE_AND_ORDER`: UInt = 24u;
public const val `BCRYPT_KEY_VALIDATION_REGENERATE`: UInt = 32u;
// UNSUPPORTED Rust 1064:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MD2_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("MD2");

// UNSUPPORTED Rust 1065:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MD2_ALG_HANDLE: BCRYPT_ALG_HANDLE = 1u32 as _;

// UNSUPPORTED Rust 1066:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MD4_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("MD4");

// UNSUPPORTED Rust 1067:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MD4_ALG_HANDLE: BCRYPT_ALG_HANDLE = 17u32 as _;

// UNSUPPORTED Rust 1068:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MD5_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("MD5");

// UNSUPPORTED Rust 1069:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MD5_ALG_HANDLE: BCRYPT_ALG_HANDLE = 33u32 as _;

// UNSUPPORTED Rust 1070:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MESSAGE_BLOCK_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("MessageBlockLength");

public const val `BCRYPT_MULTI_FLAG`: UInt = 64u;
// UNSUPPORTED Rust 1072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_MULTI_HASH_OPERATION {
//     pub iHash: u32,
//     pub hashOperation: BCRYPT_HASH_OPERATION_TYPE,
//     pub pbBuffer: *mut u8,
//     pub cbBuffer: u32,
// }

// UNSUPPORTED Rust 1080:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_MULTI_HASH_OPERATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1085:1: non-scalar type Ptr unsupported
// pub const BCRYPT_MULTI_OBJECT_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("MultiObjectLength");

// UNSUPPORTED Rust 1086:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_MULTI_OBJECT_LENGTH_STRUCT {
//     pub cbPerObject: u32,
//     pub cbPerElement: u32,
// }

public typealias `BCRYPT_MULTI_OPERATION_TYPE` = Int;
public const val `BCRYPT_NO_CURVE_GENERATION_ALG_ID`: `ECC_CURVE_ALG_ID_ENUM` = 0;
public const val `BCRYPT_NO_KEY_VALIDATION`: UInt = 8u;
// UNSUPPORTED Rust 1095:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_OAEP_PADDING_INFO {
//     pub pszAlgId: windows_sys::core::PCWSTR,
//     pub pbLabel: *mut u8,
//     pub cbLabel: u32,
// }

// UNSUPPORTED Rust 1102:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_OAEP_PADDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BCRYPT_OBJECT_ALIGNMENT`: UInt = 16u;
// UNSUPPORTED Rust 1108:1: non-scalar type Ptr unsupported
// pub const BCRYPT_OBJECT_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("ObjectLength");

// UNSUPPORTED Rust 1109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_OID {
//     pub cbOID: u32,
//     pub pbOID: *mut u8,
// }

// UNSUPPORTED Rust 1115:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_OID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_OID_LIST {
//     pub dwOIDCount: u32,
//     pub pOIDs: *mut BCRYPT_OID,
// }

// UNSUPPORTED Rust 1126:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_OID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1131:1: non-scalar type Ptr unsupported
// pub const BCRYPT_OPAQUE_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("OpaqueKeyBlob");

public typealias `BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS` = UInt;
public typealias `BCRYPT_OPERATION` = UInt;
public const val `BCRYPT_OPERATION_TYPE_HASH`: `BCRYPT_MULTI_OPERATION_TYPE` = 1;
// UNSUPPORTED Rust 1135:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PADDING_SCHEMES: windows_sys::core::PCWSTR = windows_sys::core::w!("PaddingSchemes");

public const val `BCRYPT_PAD_NONE`: `BCRYPT_FLAGS` = 1u;
public const val `BCRYPT_PAD_OAEP`: `BCRYPT_FLAGS` = 4u;
public const val `BCRYPT_PAD_PKCS1`: `BCRYPT_FLAGS` = 2u;
public const val `BCRYPT_PAD_PKCS1_OPTIONAL_HASH_OID`: UInt = 16u;
public const val `BCRYPT_PAD_PSS`: `BCRYPT_FLAGS` = 8u;
// UNSUPPORTED Rust 1141:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PBKDF2_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("PBKDF2");

// UNSUPPORTED Rust 1142:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PBKDF2_ALG_HANDLE: BCRYPT_ALG_HANDLE = 817u32 as _;

// UNSUPPORTED Rust 1143:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PCP_PLATFORM_TYPE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PLATFORM_TYPE");

// UNSUPPORTED Rust 1144:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PCP_PROVIDER_VERSION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PROVIDER_VERSION");

// UNSUPPORTED Rust 1145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_PKCS1_PADDING_INFO {
//     pub pszAlgId: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1150:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_PKCS1_PADDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1155:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PRIMITIVE_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("PrimitiveType");

// UNSUPPORTED Rust 1156:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PRIVATE_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("PrivKeyVal");

// UNSUPPORTED Rust 1157:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PRIVATE_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("PRIVATEBLOB");

public const val `BCRYPT_PRIVATE_KEY_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 1159:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PROVIDER_HANDLE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderHandle");

// UNSUPPORTED Rust 1160:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_PROVIDER_NAME {
//     pub pszProviderName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1165:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_PROVIDER_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BCRYPT_PROV_DISPATCH`: `BCRYPT_OPEN_ALGORITHM_PROVIDER_FLAGS` = 1u;
// UNSUPPORTED Rust 1171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCRYPT_PSS_PADDING_INFO {
//     pub pszAlgId: windows_sys::core::PCWSTR,
//     pub cbSalt: u32,
// }

// UNSUPPORTED Rust 1177:1: declaration Impl has no candidate rule
// impl Default for BCRYPT_PSS_PADDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1182:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PUBLIC_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("PUBLICBLOB");

public const val `BCRYPT_PUBLIC_KEY_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 1184:1: non-scalar type Ptr unsupported
// pub const BCRYPT_PUBLIC_KEY_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("PublicKeyLength");

public typealias `BCRYPT_QUERY_PROVIDER_MODE` = UInt;
// UNSUPPORTED Rust 1186:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RC2_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RC2");

// UNSUPPORTED Rust 1187:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RC2_CBC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 593u32 as _;

// UNSUPPORTED Rust 1188:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RC2_CFB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 625u32 as _;

// UNSUPPORTED Rust 1189:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RC2_ECB_ALG_HANDLE: BCRYPT_ALG_HANDLE = 609u32 as _;

// UNSUPPORTED Rust 1190:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RC4_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RC4");

// UNSUPPORTED Rust 1191:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RC4_ALG_HANDLE: BCRYPT_ALG_HANDLE = 113u32 as _;

public typealias `BCRYPT_RESOLVE_PROVIDERS_FLAGS` = UInt;
// UNSUPPORTED Rust 1193:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RNG_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RNG");

// UNSUPPORTED Rust 1194:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RNG_ALG_HANDLE: BCRYPT_ALG_HANDLE = 129u32 as _;

// UNSUPPORTED Rust 1195:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RNG_DUAL_EC_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DUALECRNG");

// UNSUPPORTED Rust 1196:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RNG_FIPS186_DSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("FIPS186DSARNG");

// UNSUPPORTED Rust 1197:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_RNG_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn,
//     pub GetProperty: BCryptGetPropertyFn,
//     pub SetProperty: BCryptSetPropertyFn,
//     pub CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn,
//     pub GenRandom: BCryptGenRandomFn,
// }

public const val `BCRYPT_RNG_INTERFACE`: `BCRYPT_INTERFACE` = 6u;
public const val `BCRYPT_RNG_OPERATION`: `BCRYPT_OPERATION` = 32u;
public const val `BCRYPT_RNG_USE_ENTROPY_IN_BUFFER`: `BCRYPTGENRANDOM_FLAGS` = 1u;
// UNSUPPORTED Rust 1210:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RSAFULLPRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("RSAFULLPRIVATEBLOB");

public const val `BCRYPT_RSAFULLPRIVATE_MAGIC`: `BCRYPT_RSAKEY_BLOB_MAGIC` = 859919186u;
// UNSUPPORTED Rust 1212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_RSAKEY_BLOB {
//     pub Magic: BCRYPT_RSAKEY_BLOB_MAGIC,
//     pub BitLength: u32,
//     pub cbPublicExp: u32,
//     pub cbModulus: u32,
//     pub cbPrime1: u32,
//     pub cbPrime2: u32,
// }

public typealias `BCRYPT_RSAKEY_BLOB_MAGIC` = UInt;
// UNSUPPORTED Rust 1223:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RSAPRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("RSAPRIVATEBLOB");

public const val `BCRYPT_RSAPRIVATE_MAGIC`: `BCRYPT_RSAKEY_BLOB_MAGIC` = 843141970u;
// UNSUPPORTED Rust 1225:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RSAPUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("RSAPUBLICBLOB");

public const val `BCRYPT_RSAPUBLIC_MAGIC`: `BCRYPT_RSAKEY_BLOB_MAGIC` = 826364754u;
// UNSUPPORTED Rust 1227:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RSA");

// UNSUPPORTED Rust 1228:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RSA_ALG_HANDLE: BCRYPT_ALG_HANDLE = 225u32 as _;

// UNSUPPORTED Rust 1229:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RSA_SIGN_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RSA_SIGN");

// UNSUPPORTED Rust 1230:1: non-scalar type Ptr unsupported
// pub const BCRYPT_RSA_SIGN_ALG_HANDLE: BCRYPT_ALG_HANDLE = 785u32 as _;

// UNSUPPORTED Rust 1231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_SECRET_AGREEMENT_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn,
//     pub GetProperty: BCryptGetPropertyFn,
//     pub SetProperty: BCryptSetPropertyFn,
//     pub CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn,
//     pub SecretAgreement: BCryptSecretAgreementFn,
//     pub DeriveKey: BCryptDeriveKeyFn,
//     pub DestroySecret: BCryptDestroySecretFn,
//     pub GenerateKeyPair: BCryptGenerateKeyPairFn,
//     pub FinalizeKeyPair: BCryptFinalizeKeyPairFn,
//     pub ImportKeyPair: BCryptImportKeyPairFn,
//     pub ExportKey: BCryptExportKeyFn,
//     pub DestroyKey: BCryptDestroyKeyFn,
// }

public const val `BCRYPT_SECRET_AGREEMENT_INTERFACE`: `BCRYPT_INTERFACE` = 4u;
public const val `BCRYPT_SECRET_AGREEMENT_OPERATION`: `BCRYPT_OPERATION` = 8u;
// UNSUPPORTED Rust 1250:1: non-scalar type Ptr unsupported
// pub type BCRYPT_SECRET_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1251:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA1_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA1");

// UNSUPPORTED Rust 1252:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA1_ALG_HANDLE: BCRYPT_ALG_HANDLE = 49u32 as _;

// UNSUPPORTED Rust 1253:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA256_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA256");

// UNSUPPORTED Rust 1254:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA256_ALG_HANDLE: BCRYPT_ALG_HANDLE = 65u32 as _;

// UNSUPPORTED Rust 1255:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA384_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA384");

// UNSUPPORTED Rust 1256:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA384_ALG_HANDLE: BCRYPT_ALG_HANDLE = 81u32 as _;

// UNSUPPORTED Rust 1257:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA512_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA512");

// UNSUPPORTED Rust 1258:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SHA512_ALG_HANDLE: BCRYPT_ALG_HANDLE = 97u32 as _;

// UNSUPPORTED Rust 1259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BCRYPT_SIGNATURE_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenAlgorithmProvider: BCryptOpenAlgorithmProviderFn,
//     pub GetProperty: BCryptGetPropertyFn,
//     pub SetProperty: BCryptSetPropertyFn,
//     pub CloseAlgorithmProvider: BCryptCloseAlgorithmProviderFn,
//     pub GenerateKeyPair: BCryptGenerateKeyPairFn,
//     pub FinalizeKeyPair: BCryptFinalizeKeyPairFn,
//     pub SignHash: BCryptSignHashFn,
//     pub VerifySignature: BCryptVerifySignatureFn,
//     pub ImportKeyPair: BCryptImportKeyPairFn,
//     pub ExportKey: BCryptExportKeyFn,
//     pub DestroyKey: BCryptDestroyKeyFn,
// }

public const val `BCRYPT_SIGNATURE_INTERFACE`: `BCRYPT_INTERFACE` = 5u;
// UNSUPPORTED Rust 1276:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SIGNATURE_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("SignatureLength");

public const val `BCRYPT_SIGNATURE_OPERATION`: `BCRYPT_OPERATION` = 16u;
// UNSUPPORTED Rust 1278:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SP800108_CTR_HMAC_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SP800_108_CTR_HMAC");

// UNSUPPORTED Rust 1279:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SP800108_CTR_HMAC_ALG_HANDLE: BCRYPT_ALG_HANDLE = 833u32 as _;

// UNSUPPORTED Rust 1280:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SP80056A_CONCAT_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SP800_56A_CONCAT");

// UNSUPPORTED Rust 1281:1: non-scalar type Ptr unsupported
// pub const BCRYPT_SP80056A_CONCAT_ALG_HANDLE: BCRYPT_ALG_HANDLE = 849u32 as _;

public const val `BCRYPT_SUPPORTED_PAD_OAEP`: UInt = 8u;
public const val `BCRYPT_SUPPORTED_PAD_PKCS1_ENC`: UInt = 2u;
public const val `BCRYPT_SUPPORTED_PAD_PKCS1_SIG`: UInt = 4u;
public const val `BCRYPT_SUPPORTED_PAD_PSS`: UInt = 16u;
public const val `BCRYPT_SUPPORTED_PAD_ROUTER`: UInt = 1u;
public typealias `BCRYPT_TABLE` = UInt;
// UNSUPPORTED Rust 1288:1: non-scalar type Ptr unsupported
// pub const BCRYPT_TLS1_1_KDF_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("TLS1_1_KDF");

// UNSUPPORTED Rust 1289:1: non-scalar type Ptr unsupported
// pub const BCRYPT_TLS1_1_KDF_ALG_HANDLE: BCRYPT_ALG_HANDLE = 865u32 as _;

// UNSUPPORTED Rust 1290:1: non-scalar type Ptr unsupported
// pub const BCRYPT_TLS1_2_KDF_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("TLS1_2_KDF");

// UNSUPPORTED Rust 1291:1: non-scalar type Ptr unsupported
// pub const BCRYPT_TLS1_2_KDF_ALG_HANDLE: BCRYPT_ALG_HANDLE = 881u32 as _;

public const val `BCRYPT_TLS_CBC_HMAC_VERIFY_FLAG`: UInt = 4u;
public const val `BCRYPT_USE_SYSTEM_PREFERRED_RNG`: `BCRYPTGENRANDOM_FLAGS` = 2u;
// UNSUPPORTED Rust 1294:1: non-scalar type Ptr unsupported
// pub const BCRYPT_XTS_AES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("XTS-AES");

// UNSUPPORTED Rust 1295:1: non-scalar type Ptr unsupported
// pub const BCRYPT_XTS_AES_ALG_HANDLE: BCRYPT_ALG_HANDLE = 897u32 as _;

// UNSUPPORTED Rust 1296:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCryptBuffer {
//     pub cbBuffer: u32,
//     pub BufferType: u32,
//     pub pvBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1303:1: declaration Impl has no candidate rule
// impl Default for BCryptBuffer {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BCryptBufferDesc {
//     pub ulVersion: u32,
//     pub cBuffers: u32,
//     pub pBuffers: *mut BCryptBuffer,
// }

// UNSUPPORTED Rust 1315:1: declaration Impl has no candidate rule
// impl Default for BCryptBufferDesc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1320:1: generic scalar type unsupported
// pub type BCryptCloseAlgorithmProviderFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1321:1: generic scalar type unsupported
// pub type BCryptCreateHashFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, phhash: *mut BCRYPT_HASH_HANDLE, pbhashobject: *mut u8, cbhashobject: u32, pbsecret: *const u8, cbsecret: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1322:1: generic scalar type unsupported
// pub type BCryptCreateMultiHashFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, phhash: *mut BCRYPT_HASH_HANDLE, nhashes: u32, pbhashobject: *mut u8, cbhashobject: u32, pbsecret: *const u8, cbsecret: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1323:1: generic scalar type unsupported
// pub type BCryptDecryptFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, ppaddinginfo: *const core::ffi::c_void, pbiv: *mut u8, cbiv: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1324:1: generic scalar type unsupported
// pub type BCryptDeriveKeyCapiFn = Option<unsafe extern "system" fn(hhash: BCRYPT_HASH_HANDLE, htargetalg: BCRYPT_ALG_HANDLE, pbderivedkey: *mut u8, cbderivedkey: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1325:1: generic scalar type unsupported
// pub type BCryptDeriveKeyFn = Option<unsafe extern "system" fn(hsharedsecret: BCRYPT_SECRET_HANDLE, pwszkdf: windows_sys::core::PCWSTR, pparameterlist: *const BCryptBufferDesc, pbderivedkey: *mut u8, cbderivedkey: u32, pcbresult: *mut u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1326:1: generic scalar type unsupported
// pub type BCryptDeriveKeyPBKDF2Fn = Option<unsafe extern "system" fn(hprf: BCRYPT_ALG_HANDLE, pbpassword: *const u8, cbpassword: u32, pbsalt: *const u8, cbsalt: u32, citerations: u64, pbderivedkey: *mut u8, cbderivedkey: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1327:1: generic scalar type unsupported
// pub type BCryptDestroyHashFn = Option<unsafe extern "system" fn(hhash: BCRYPT_HASH_HANDLE) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1328:1: generic scalar type unsupported
// pub type BCryptDestroyKeyFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1329:1: generic scalar type unsupported
// pub type BCryptDestroySecretFn = Option<unsafe extern "system" fn(hsecret: BCRYPT_SECRET_HANDLE) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1330:1: generic scalar type unsupported
// pub type BCryptDuplicateHashFn = Option<unsafe extern "system" fn(hhash: BCRYPT_HASH_HANDLE, phnewhash: *mut BCRYPT_HASH_HANDLE, pbhashobject: *mut u8, cbhashobject: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1331:1: generic scalar type unsupported
// pub type BCryptDuplicateKeyFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, phnewkey: *mut BCRYPT_KEY_HANDLE, pbkeyobject: *mut u8, cbkeyobject: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1332:1: generic scalar type unsupported
// pub type BCryptEncryptFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, ppaddinginfo: *const core::ffi::c_void, pbiv: *mut u8, cbiv: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1333:1: generic scalar type unsupported
// pub type BCryptExportKeyFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, hexportkey: BCRYPT_KEY_HANDLE, pszblobtype: windows_sys::core::PCWSTR, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1334:1: generic scalar type unsupported
// pub type BCryptFinalizeKeyPairFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1335:1: generic scalar type unsupported
// pub type BCryptFinishHashFn = Option<unsafe extern "system" fn(hhash: BCRYPT_HASH_HANDLE, pboutput: *mut u8, cboutput: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1336:1: generic scalar type unsupported
// pub type BCryptFreeBufferFn = Option<unsafe extern "system" fn(pvbuffer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1337:1: generic scalar type unsupported
// pub type BCryptGenRandomFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, pbbuffer: *mut u8, cbbuffer: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1338:1: generic scalar type unsupported
// pub type BCryptGenerateKeyPairFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, phkey: *mut BCRYPT_KEY_HANDLE, dwlength: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1339:1: generic scalar type unsupported
// pub type BCryptGenerateSymmetricKeyFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, phkey: *mut BCRYPT_KEY_HANDLE, pbkeyobject: *mut u8, cbkeyobject: u32, pbsecret: *const u8, cbsecret: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1340:1: generic scalar type unsupported
// pub type BCryptGetPropertyFn = Option<unsafe extern "system" fn(hobject: BCRYPT_HANDLE, pszproperty: windows_sys::core::PCWSTR, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1341:1: generic scalar type unsupported
// pub type BCryptHashDataFn = Option<unsafe extern "system" fn(hhash: BCRYPT_HASH_HANDLE, pbinput: *const u8, cbinput: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1342:1: generic scalar type unsupported
// pub type BCryptImportKeyFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: windows_sys::core::PCWSTR, phkey: *mut BCRYPT_KEY_HANDLE, pbkeyobject: *mut u8, cbkeyobject: u32, pbinput: *const u8, cbinput: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1343:1: generic scalar type unsupported
// pub type BCryptImportKeyPairFn = Option<unsafe extern "system" fn(halgorithm: BCRYPT_ALG_HANDLE, himportkey: BCRYPT_KEY_HANDLE, pszblobtype: windows_sys::core::PCWSTR, phkey: *mut BCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1344:1: generic scalar type unsupported
// pub type BCryptKeyDerivationFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, pbderivedkey: *mut u8, cbderivedkey: u32, pcbresult: *mut u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1345:1: generic scalar type unsupported
// pub type BCryptOpenAlgorithmProviderFn = Option<unsafe extern "system" fn(phalgorithm: *mut BCRYPT_ALG_HANDLE, pszalgid: windows_sys::core::PCWSTR, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1346:1: generic scalar type unsupported
// pub type BCryptProcessMultiOperationsFn = Option<unsafe extern "system" fn(hobject: BCRYPT_HANDLE, operationtype: BCRYPT_MULTI_OPERATION_TYPE, poperations: *const core::ffi::c_void, cboperations: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1347:1: generic scalar type unsupported
// pub type BCryptSecretAgreementFn = Option<unsafe extern "system" fn(hprivkey: BCRYPT_KEY_HANDLE, hpubkey: BCRYPT_KEY_HANDLE, phagreedsecret: *mut BCRYPT_SECRET_HANDLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1348:1: generic scalar type unsupported
// pub type BCryptSetPropertyFn = Option<unsafe extern "system" fn(hobject: BCRYPT_HANDLE, pszproperty: windows_sys::core::PCWSTR, pbinput: *const u8, cbinput: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1349:1: generic scalar type unsupported
// pub type BCryptSignHashFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: *const core::ffi::c_void, pbinput: *const u8, cbinput: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 1350:1: generic scalar type unsupported
// pub type BCryptVerifySignatureFn = Option<unsafe extern "system" fn(hkey: BCRYPT_KEY_HANDLE, ppaddinginfo: *const core::ffi::c_void, pbhash: *const u8, cbhash: u32, pbsignature: *const u8, cbsignature: u32, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

public const val `CALG_3DES`: `ALG_ID` = 26115u;
public const val `CALG_3DES_112`: `ALG_ID` = 26121u;
public const val `CALG_AES`: `ALG_ID` = 26129u;
public const val `CALG_AES_128`: `ALG_ID` = 26126u;
public const val `CALG_AES_192`: `ALG_ID` = 26127u;
public const val `CALG_AES_256`: `ALG_ID` = 26128u;
public const val `CALG_AGREEDKEY_ANY`: `ALG_ID` = 43523u;
public const val `CALG_CYLINK_MEK`: `ALG_ID` = 26124u;
public const val `CALG_DES`: `ALG_ID` = 26113u;
public const val `CALG_DESX`: `ALG_ID` = 26116u;
public const val `CALG_DH_EPHEM`: `ALG_ID` = 43522u;
public const val `CALG_DH_SF`: `ALG_ID` = 43521u;
public const val `CALG_DSS_SIGN`: `ALG_ID` = 8704u;
public const val `CALG_ECDH`: `ALG_ID` = 43525u;
public const val `CALG_ECDH_EPHEM`: `ALG_ID` = 44550u;
public const val `CALG_ECDSA`: `ALG_ID` = 8707u;
public const val `CALG_ECMQV`: `ALG_ID` = 40961u;
public const val `CALG_HASH_REPLACE_OWF`: `ALG_ID` = 32779u;
public const val `CALG_HMAC`: `ALG_ID` = 32777u;
public const val `CALG_HUGHES_MD5`: `ALG_ID` = 40963u;
public const val `CALG_KEA_KEYX`: `ALG_ID` = 43524u;
public const val `CALG_MAC`: `ALG_ID` = 32773u;
public const val `CALG_MD2`: `ALG_ID` = 32769u;
public const val `CALG_MD4`: `ALG_ID` = 32770u;
public const val `CALG_MD5`: `ALG_ID` = 32771u;
public const val `CALG_NO_SIGN`: `ALG_ID` = 8192u;
public const val `CALG_NULLCIPHER`: `ALG_ID` = 24576u;
public const val `CALG_OID_INFO_CNG_ONLY`: UInt = 4294967295u;
public const val `CALG_OID_INFO_PARAMETERS`: UInt = 4294967294u;
public const val `CALG_PCT1_MASTER`: `ALG_ID` = 19460u;
public const val `CALG_RC2`: `ALG_ID` = 26114u;
public const val `CALG_RC4`: `ALG_ID` = 26625u;
public const val `CALG_RC5`: `ALG_ID` = 26125u;
public const val `CALG_RSA_KEYX`: `ALG_ID` = 41984u;
public const val `CALG_RSA_SIGN`: `ALG_ID` = 9216u;
public const val `CALG_SCHANNEL_ENC_KEY`: `ALG_ID` = 19463u;
public const val `CALG_SCHANNEL_MAC_KEY`: `ALG_ID` = 19459u;
public const val `CALG_SCHANNEL_MASTER_HASH`: `ALG_ID` = 19458u;
public const val `CALG_SEAL`: `ALG_ID` = 26626u;
public const val `CALG_SHA`: `ALG_ID` = 32772u;
public const val `CALG_SHA1`: `ALG_ID` = 32772u;
public const val `CALG_SHA_256`: `ALG_ID` = 32780u;
public const val `CALG_SHA_384`: `ALG_ID` = 32781u;
public const val `CALG_SHA_512`: `ALG_ID` = 32782u;
public const val `CALG_SKIPJACK`: `ALG_ID` = 26122u;
public const val `CALG_SSL2_MASTER`: `ALG_ID` = 19461u;
public const val `CALG_SSL3_MASTER`: `ALG_ID` = 19457u;
public const val `CALG_SSL3_SHAMD5`: `ALG_ID` = 32776u;
public const val `CALG_TEK`: `ALG_ID` = 26123u;
public const val `CALG_THIRDPARTY_CIPHER`: `ALG_ID` = 28672u;
public const val `CALG_THIRDPARTY_HASH`: `ALG_ID` = 36864u;
public const val `CALG_THIRDPARTY_KEY_EXCHANGE`: `ALG_ID` = 45056u;
public const val `CALG_THIRDPARTY_SIGNATURE`: `ALG_ID` = 12288u;
public const val `CALG_TLS1PRF`: `ALG_ID` = 32778u;
public const val `CALG_TLS1_MASTER`: `ALG_ID` = 19462u;
// UNSUPPORTED Rust 1406:1: non-scalar type Ptr unsupported
// pub const CARD_3DES_112_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("3DES_112");

// UNSUPPORTED Rust 1407:1: non-scalar type Ptr unsupported
// pub const CARD_3DES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("3DES");

// UNSUPPORTED Rust 1408:1: non-scalar type Ptr unsupported
// pub const CARD_AES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AES");

public const val `CARD_ASYMMETRIC_OPERATION`: UInt = 2u;
// UNSUPPORTED Rust 1410:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_AUTHENTICATE {
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub PinId: u32,
//     pub cbPinData: u32,
//     pub pbPinData: [u8; 1],
// }

// UNSUPPORTED Rust 1419:1: declaration Impl has no candidate rule
// impl Default for CARD_AUTHENTICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_AUTHENTICATE_CURRENT_VERSION`: UInt = 7u;
public const val `CARD_AUTHENTICATE_GENERATE_SESSION_PIN`: UInt = 268435456u;
public const val `CARD_AUTHENTICATE_PIN_CHALLENGE_RESPONSE`: UInt = 1u;
public const val `CARD_AUTHENTICATE_PIN_PIN`: UInt = 2u;
// UNSUPPORTED Rust 1428:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_AUTHENTICATE_RESPONSE {
//     pub dwVersion: u32,
//     pub cbSessionPin: u32,
//     pub cAttemptsRemaining: u32,
//     pub pbSessionPin: [u8; 1],
// }

// UNSUPPORTED Rust 1436:1: declaration Impl has no candidate rule
// impl Default for CARD_AUTHENTICATE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_AUTHENTICATE_RESPONSE_CURRENT_VERSION`: UInt = 7u;
public const val `CARD_AUTHENTICATE_RESPONSE_VERSION_SEVEN`: UInt = 7u;
public const val `CARD_AUTHENTICATE_SESSION_PIN`: UInt = 536870912u;
public const val `CARD_AUTHENTICATE_VERSION_SEVEN`: UInt = 7u;
public const val `CARD_BUFFER_SIZE_ONLY`: UInt = 536870912u;
public const val `CARD_CACHE_FILE_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 1447:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CARD_CACHE_FILE_FORMAT {
//     pub bVersion: u8,
//     pub bPinsFreshness: u8,
//     pub wContainersFreshness: u16,
//     pub wFilesFreshness: u16,
// }

// UNSUPPORTED Rust 1455:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CARD_CAPABILITIES {
//     pub dwVersion: u32,
//     pub fCertificateCompression: windows_sys::core::BOOL,
//     pub fKeyGen: windows_sys::core::BOOL,
// }

public const val `CARD_CAPABILITIES_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 1463:1: non-scalar type Ptr unsupported
// pub const CARD_CHAIN_MODE_CBC: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingModeCBC");

// UNSUPPORTED Rust 1464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_CHANGE_AUTHENTICATOR {
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub dwAuthenticatingPinId: u32,
//     pub cbAuthenticatingPinData: u32,
//     pub dwTargetPinId: u32,
//     pub cbTargetData: u32,
//     pub cRetryCount: u32,
//     pub pbData: [u8; 1],
// }

// UNSUPPORTED Rust 1476:1: declaration Impl has no candidate rule
// impl Default for CARD_CHANGE_AUTHENTICATOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_CHANGE_AUTHENTICATOR_CURRENT_VERSION`: UInt = 7u;
// UNSUPPORTED Rust 1482:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CARD_CHANGE_AUTHENTICATOR_RESPONSE {
//     pub dwVersion: u32,
//     pub cAttemptsRemaining: u32,
// }

public const val `CARD_CHANGE_AUTHENTICATOR_RESPONSE_CURRENT_VERSION`: UInt = 7u;
public const val `CARD_CHANGE_AUTHENTICATOR_RESPONSE_VERSION_SEVEN`: UInt = 7u;
public const val `CARD_CHANGE_AUTHENTICATOR_VERSION_SEVEN`: UInt = 7u;
public const val `CARD_CIPHER_OPERATION`: UInt = 1u;
public const val `CARD_CREATE_CONTAINER_KEY_GEN`: UInt = 1u;
public const val `CARD_CREATE_CONTAINER_KEY_IMPORT`: UInt = 2u;
// UNSUPPORTED Rust 1494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_DATA {
//     pub dwVersion: u32,
//     pub pbAtr: *mut u8,
//     pub cbAtr: u32,
//     pub pwszCardName: windows_sys::core::PWSTR,
//     pub pfnCspAlloc: PFN_CSP_ALLOC,
//     pub pfnCspReAlloc: PFN_CSP_REALLOC,
//     pub pfnCspFree: PFN_CSP_FREE,
//     pub pfnCspCacheAddFile: PFN_CSP_CACHE_ADD_FILE,
//     pub pfnCspCacheLookupFile: PFN_CSP_CACHE_LOOKUP_FILE,
//     pub pfnCspCacheDeleteFile: PFN_CSP_CACHE_DELETE_FILE,
//     pub pvCacheContext: *mut core::ffi::c_void,
//     pub pfnCspPadData: PFN_CSP_PAD_DATA,
//     pub hSCardCtx: usize,
//     pub hScard: usize,
//     pub pvVendorSpecific: *mut core::ffi::c_void,
//     pub pfnCardDeleteContext: PFN_CARD_DELETE_CONTEXT,
//     pub pfnCardQueryCapabilities: PFN_CARD_QUERY_CAPABILITIES,
//     pub pfnCardDeleteContainer: PFN_CARD_DELETE_CONTAINER,
//     pub pfnCardCreateContainer: PFN_CARD_CREATE_CONTAINER,
//     pub pfnCardGetContainerInfo: PFN_CARD_GET_CONTAINER_INFO,
//     pub pfnCardAuthenticatePin: PFN_CARD_AUTHENTICATE_PIN,
//     pub pfnCardGetChallenge: PFN_CARD_GET_CHALLENGE,
//     pub pfnCardAuthenticateChallenge: PFN_CARD_AUTHENTICATE_CHALLENGE,
//     pub pfnCardUnblockPin: PFN_CARD_UNBLOCK_PIN,
//     pub pfnCardChangeAuthenticator: PFN_CARD_CHANGE_AUTHENTICATOR,
//     pub pfnCardDeauthenticate: PFN_CARD_DEAUTHENTICATE,
//     pub pfnCardCreateDirectory: PFN_CARD_CREATE_DIRECTORY,
//     pub pfnCardDeleteDirectory: PFN_CARD_DELETE_DIRECTORY,
//     pub pvUnused3: *mut core::ffi::c_void,
//     pub pvUnused4: *mut core::ffi::c_void,
//     pub pfnCardCreateFile: PFN_CARD_CREATE_FILE,
//     pub pfnCardReadFile: PFN_CARD_READ_FILE,
//     pub pfnCardWriteFile: PFN_CARD_WRITE_FILE,
//     pub pfnCardDeleteFile: PFN_CARD_DELETE_FILE,
//     pub pfnCardEnumFiles: PFN_CARD_ENUM_FILES,
//     pub pfnCardGetFileInfo: PFN_CARD_GET_FILE_INFO,
//     pub pfnCardQueryFreeSpace: PFN_CARD_QUERY_FREE_SPACE,
//     pub pfnCardQueryKeySizes: PFN_CARD_QUERY_KEY_SIZES,
//     pub pfnCardSignData: PFN_CARD_SIGN_DATA,
//     pub pfnCardRSADecrypt: PFN_CARD_RSA_DECRYPT,
//     pub pfnCardConstructDHAgreement: PFN_CARD_CONSTRUCT_DH_AGREEMENT,
//     pub pfnCardDeriveKey: PFN_CARD_DERIVE_KEY,
//     pub pfnCardDestroyDHAgreement: PFN_CARD_DESTROY_DH_AGREEMENT,
//     pub pfnCspGetDHAgreement: PFN_CSP_GET_DH_AGREEMENT,
//     pub pfnCardGetChallengeEx: PFN_CARD_GET_CHALLENGE_EX,
//     pub pfnCardAuthenticateEx: PFN_CARD_AUTHENTICATE_EX,
//     pub pfnCardChangeAuthenticatorEx: PFN_CARD_CHANGE_AUTHENTICATOR_EX,
//     pub pfnCardDeauthenticateEx: PFN_CARD_DEAUTHENTICATE_EX,
//     pub pfnCardGetContainerProperty: PFN_CARD_GET_CONTAINER_PROPERTY,
//     pub pfnCardSetContainerProperty: PFN_CARD_SET_CONTAINER_PROPERTY,
//     pub pfnCardGetProperty: PFN_CARD_GET_PROPERTY,
//     pub pfnCardSetProperty: PFN_CARD_SET_PROPERTY,
//     pub pfnCspUnpadData: PFN_CSP_UNPAD_DATA,
//     pub pfnMDImportSessionKey: PFN_MD_IMPORT_SESSION_KEY,
//     pub pfnMDEncryptData: PFN_MD_ENCRYPT_DATA,
//     pub pfnCardImportSessionKey: PFN_CARD_IMPORT_SESSION_KEY,
//     pub pfnCardGetSharedKeyHandle: PFN_CARD_GET_SHARED_KEY_HANDLE,
//     pub pfnCardGetAlgorithmProperty: PFN_CARD_GET_ALGORITHM_PROPERTY,
//     pub pfnCardGetKeyProperty: PFN_CARD_GET_KEY_PROPERTY,
//     pub pfnCardSetKeyProperty: PFN_CARD_SET_KEY_PROPERTY,
//     pub pfnCardDestroyKey: PFN_CARD_DESTROY_KEY,
//     pub pfnCardProcessEncryptedData: PFN_CARD_PROCESS_ENCRYPTED_DATA,
//     pub pfnCardCreateContainerEx: PFN_CARD_CREATE_CONTAINER_EX,
// }

// UNSUPPORTED Rust 1561:1: declaration Impl has no candidate rule
// impl Default for CARD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_DATA_CURRENT_VERSION`: UInt = 7u;
public const val `CARD_DATA_VALUE_UNKNOWN`: UInt = 4294967295u;
public const val `CARD_DATA_VERSION_FIVE`: UInt = 5u;
public const val `CARD_DATA_VERSION_FOUR`: UInt = 4u;
public const val `CARD_DATA_VERSION_SEVEN`: UInt = 7u;
public const val `CARD_DATA_VERSION_SIX`: UInt = 6u;
// UNSUPPORTED Rust 1572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_DERIVE_KEY {
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub pwszKDF: windows_sys::core::PWSTR,
//     pub bSecretAgreementIndex: u8,
//     pub pParameterList: *mut core::ffi::c_void,
//     pub pbDerivedKey: *mut u8,
//     pub cbDerivedKey: u32,
//     pub pwszAlgId: windows_sys::core::PWSTR,
//     pub dwKeyLen: u32,
//     pub hKey: usize,
// }

// UNSUPPORTED Rust 1586:1: declaration Impl has no candidate rule
// impl Default for CARD_DERIVE_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_DERIVE_KEY_CURRENT_VERSION`: UInt = 2u;
public const val `CARD_DERIVE_KEY_VERSION`: UInt = 1u;
public const val `CARD_DERIVE_KEY_VERSION_TWO`: UInt = 2u;
// UNSUPPORTED Rust 1594:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_DH_AGREEMENT_INFO {
//     pub dwVersion: u32,
//     pub bContainerIndex: u8,
//     pub dwFlags: u32,
//     pub dwPublicKey: u32,
//     pub pbPublicKey: *mut u8,
//     pub pbReserved: *mut u8,
//     pub cbReserved: u32,
//     pub bSecretAgreementIndex: u8,
// }

// UNSUPPORTED Rust 1606:1: declaration Impl has no candidate rule
// impl Default for CARD_DH_AGREEMENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_DH_AGREEMENT_INFO_VERSION`: UInt = 2u;
public typealias `CARD_DIRECTORY_ACCESS_CONDITION` = Int;
// UNSUPPORTED Rust 1613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_ENCRYPTED_DATA {
//     pub pbEncryptedData: *mut u8,
//     pub cbEncryptedData: u32,
// }

// UNSUPPORTED Rust 1619:1: declaration Impl has no candidate rule
// impl Default for CARD_ENCRYPTED_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CARD_FILE_ACCESS_CONDITION` = Int;
// UNSUPPORTED Rust 1625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CARD_FILE_INFO {
//     pub dwVersion: u32,
//     pub cbFileSize: u32,
//     pub AccessCondition: CARD_FILE_ACCESS_CONDITION,
// }

public const val `CARD_FILE_INFO_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 1633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CARD_FREE_SPACE_INFO {
//     pub dwVersion: u32,
//     pub dwBytesAvailable: u32,
//     pub dwKeyContainersAvailable: u32,
//     pub dwMaxKeyContainers: u32,
// }

public const val `CARD_FREE_SPACE_INFO_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 1642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_IMPORT_KEYPAIR {
//     pub dwVersion: u32,
//     pub bContainerIndex: u8,
//     pub PinId: u32,
//     pub dwKeySpec: u32,
//     pub dwKeySize: u32,
//     pub cbInput: u32,
//     pub pbInput: [u8; 1],
// }

// UNSUPPORTED Rust 1653:1: declaration Impl has no candidate rule
// impl Default for CARD_IMPORT_KEYPAIR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_IMPORT_KEYPAIR_CURRENT_VERSION`: UInt = 7u;
public const val `CARD_IMPORT_KEYPAIR_VERSION_SEVEN`: UInt = 7u;
public const val `CARD_KEY_IMPORT_ECC_KEYEST`: UInt = 4u;
public const val `CARD_KEY_IMPORT_PLAIN_TEXT`: UInt = 1u;
public const val `CARD_KEY_IMPORT_RSA_KEYEST`: UInt = 2u;
public const val `CARD_KEY_IMPORT_SHARED_SYMMETRIC`: UInt = 8u;
// UNSUPPORTED Rust 1664:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CARD_KEY_SIZES {
//     pub dwVersion: u32,
//     pub dwMinimumBitlen: u32,
//     pub dwDefaultBitlen: u32,
//     pub dwMaximumBitlen: u32,
//     pub dwIncrementalBitlen: u32,
// }

public const val `CARD_KEY_SIZES_CURRENT_VERSION`: UInt = 1u;
public const val `CARD_PADDING_INFO_PRESENT`: UInt = 1073741824u;
public const val `CARD_PADDING_NONE`: UInt = 1u;
public const val `CARD_PADDING_OAEP`: UInt = 8u;
public const val `CARD_PADDING_PKCS1`: UInt = 2u;
public const val `CARD_PADDING_PSS`: UInt = 4u;
public const val `CARD_PIN_SILENT_CONTEXT`: UInt = 64u;
public const val `CARD_PIN_STRENGTH_PLAINTEXT`: UInt = 1u;
public const val `CARD_PIN_STRENGTH_SESSION_PIN`: UInt = 2u;
public const val `CARD_RETURN_KEY_HANDLE`: UInt = 16777216u;
// UNSUPPORTED Rust 1683:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_RSA_DECRYPT_INFO {
//     pub dwVersion: u32,
//     pub bContainerIndex: u8,
//     pub dwKeySpec: u32,
//     pub pbData: *mut u8,
//     pub cbData: u32,
//     pub pPaddingInfo: *mut core::ffi::c_void,
//     pub dwPaddingType: u32,
// }

// UNSUPPORTED Rust 1694:1: declaration Impl has no candidate rule
// impl Default for CARD_RSA_DECRYPT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_RSA_KEY_DECRYPT_INFO_CURRENT_VERSION`: UInt = 2u;
public const val `CARD_RSA_KEY_DECRYPT_INFO_VERSION_ONE`: UInt = 1u;
public const val `CARD_RSA_KEY_DECRYPT_INFO_VERSION_TWO`: UInt = 2u;
public const val `CARD_SECURE_KEY_INJECTION_NO_CARD_MODE`: UInt = 1u;
// UNSUPPORTED Rust 1703:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CARD_SIGNING_INFO {
//     pub dwVersion: u32,
//     pub bContainerIndex: u8,
//     pub dwKeySpec: u32,
//     pub dwSigningFlags: u32,
//     pub aiHashAlg: ALG_ID,
//     pub pbData: *mut u8,
//     pub cbData: u32,
//     pub pbSignedData: *mut u8,
//     pub cbSignedData: u32,
//     pub pPaddingInfo: *mut core::ffi::c_void,
//     pub dwPaddingType: u32,
// }

// UNSUPPORTED Rust 1718:1: declaration Impl has no candidate rule
// impl Default for CARD_SIGNING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CARD_SIGNING_INFO_BASIC_VERSION`: UInt = 1u;
public const val `CARD_SIGNING_INFO_CURRENT_VERSION`: UInt = 2u;
public typealias `CASetupProperty` = Int;
// UNSUPPORTED Rust 1726:1: non-scalar type Ptr unsupported
// pub const CCP_ASSOCIATED_ECDH_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Associated ECDH Key");

// UNSUPPORTED Rust 1727:1: non-scalar type Ptr unsupported
// pub const CCP_CONTAINER_INFO: windows_sys::core::PCWSTR = windows_sys::core::w!("Container Info");

// UNSUPPORTED Rust 1728:1: non-scalar type Ptr unsupported
// pub const CCP_PIN_IDENTIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("PIN Identifier");

// UNSUPPORTED Rust 1729:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertSrvSetup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x961f180f_f55c_413d_a9b3_7d2af4d8e42f);

// UNSUPPORTED Rust 1730:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertSrvSetupKeyInformation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38373906_5433_4633_b0fb_29b7e78262e1);

// UNSUPPORTED Rust 1731:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertificateEnrollmentPolicyServerSetup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xafe2fa32_41b1_459d_a5de_49add8a72182);

// UNSUPPORTED Rust 1732:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CCertificateEnrollmentServerSetup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9902f3bc_88af_4cf8_ae62_7140531552b6);

public typealias `CEPSetupProperty` = Int;
// UNSUPPORTED Rust 1734:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERTIFICATE_CHAIN_BLOB {
//     pub certCount: u32,
//     pub rawCertificates: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 1740:1: declaration Impl has no candidate rule
// impl Default for CERTIFICATE_CHAIN_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1745:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_ACCESS_DESCRIPTION {
//     pub pszAccessMethod: windows_sys::core::PSTR,
//     pub AccessLocation: CERT_ALT_NAME_ENTRY,
// }

// UNSUPPORTED Rust 1751:1: declaration Impl has no candidate rule
// impl Default for CERT_ACCESS_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_ACCESS_STATE_GP_SYSTEM_STORE_FLAG`: UInt = 8u;
public const val `CERT_ACCESS_STATE_LM_SYSTEM_STORE_FLAG`: UInt = 4u;
public const val `CERT_ACCESS_STATE_PROP_ID`: UInt = 14u;
public const val `CERT_ACCESS_STATE_SHARED_USER_FLAG`: UInt = 16u;
public const val `CERT_ACCESS_STATE_SYSTEM_STORE_FLAG`: UInt = 2u;
public const val `CERT_ACCESS_STATE_WRITE_PERSIST_FLAG`: UInt = 1u;
public const val `CERT_AIA_URL_RETRIEVED_PROP_ID`: UInt = 67u;
public const val `CERT_ALT_NAME_EDI_PARTY_NAME`: UInt = 6u;
// UNSUPPORTED Rust 1764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_ALT_NAME_ENTRY {
//     pub dwAltNameChoice: u32,
//     pub Anonymous: CERT_ALT_NAME_ENTRY_0,
// }

// UNSUPPORTED Rust 1770:1: declaration Impl has no candidate rule
// impl Default for CERT_ALT_NAME_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1775:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CERT_ALT_NAME_ENTRY_0 {
//     pub pOtherName: *mut CERT_OTHER_NAME,
//     pub pwszRfc822Name: windows_sys::core::PWSTR,
//     pub pwszDNSName: windows_sys::core::PWSTR,
//     pub DirectoryName: CRYPT_INTEGER_BLOB,
//     pub pwszURL: windows_sys::core::PWSTR,
//     pub IPAddress: CRYPT_INTEGER_BLOB,
//     pub pszRegisteredID: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1786:1: declaration Impl has no candidate rule
// impl Default for CERT_ALT_NAME_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_ALT_NAME_ENTRY_ERR_INDEX_MASK`: UInt = 255u;
public const val `CERT_ALT_NAME_ENTRY_ERR_INDEX_SHIFT`: UInt = 16u;
// UNSUPPORTED Rust 1793:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_ALT_NAME_INFO {
//     pub cAltEntry: u32,
//     pub rgAltEntry: *mut CERT_ALT_NAME_ENTRY,
// }

// UNSUPPORTED Rust 1799:1: declaration Impl has no candidate rule
// impl Default for CERT_ALT_NAME_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_ALT_NAME_VALUE_ERR_INDEX_MASK`: UInt = 65535u;
public const val `CERT_ALT_NAME_VALUE_ERR_INDEX_SHIFT`: UInt = 0u;
public const val `CERT_ALT_NAME_X400_ADDRESS`: UInt = 4u;
public const val `CERT_ARCHIVED_KEY_HASH_PROP_ID`: UInt = 65u;
public const val `CERT_ARCHIVED_PROP_ID`: UInt = 19u;
// UNSUPPORTED Rust 1809:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_AUTHORITY_INFO_ACCESS {
//     pub cAccDescr: u32,
//     pub rgAccDescr: *mut CERT_ACCESS_DESCRIPTION,
// }

// UNSUPPORTED Rust 1815:1: declaration Impl has no candidate rule
// impl Default for CERT_AUTHORITY_INFO_ACCESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_AUTHORITY_INFO_ACCESS_PROP_ID`: UInt = 68u;
// UNSUPPORTED Rust 1821:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_AUTHORITY_KEY_ID2_INFO {
//     pub KeyId: CRYPT_INTEGER_BLOB,
//     pub AuthorityCertIssuer: CERT_ALT_NAME_INFO,
//     pub AuthorityCertSerialNumber: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 1828:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_AUTHORITY_KEY_ID_INFO {
//     pub KeyId: CRYPT_INTEGER_BLOB,
//     pub CertIssuer: CRYPT_INTEGER_BLOB,
//     pub CertSerialNumber: CRYPT_INTEGER_BLOB,
// }

public const val `CERT_AUTH_ROOT_AUTO_UPDATE_DISABLE_PARTIAL_CHAIN_LOGGING_FLAG`: UInt = 2u;
public const val `CERT_AUTH_ROOT_AUTO_UPDATE_DISABLE_UNTRUSTED_ROOT_LOGGING_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 1837:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_AUTO_UPDATE_ENCODED_CTL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EncodedCtl");

// UNSUPPORTED Rust 1838:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_AUTO_UPDATE_FLAGS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

// UNSUPPORTED Rust 1839:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_AUTO_UPDATE_LAST_SYNC_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("LastSyncTime");

// UNSUPPORTED Rust 1840:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_AUTO_UPDATE_ROOT_DIR_URL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RootDirUrl");

// UNSUPPORTED Rust 1841:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_AUTO_UPDATE_SYNC_DELTA_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SyncDeltaTime");

// UNSUPPORTED Rust 1842:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_CAB_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("authrootstl.cab");

// UNSUPPORTED Rust 1843:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_CERT_EXT: windows_sys::core::PCWSTR = windows_sys::core::w!(".crt");

// UNSUPPORTED Rust 1844:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_CTL_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("authroot.stl");

// UNSUPPORTED Rust 1845:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_CTL_FILENAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("authroot.stl");

// UNSUPPORTED Rust 1846:1: non-scalar type Ptr unsupported
// pub const CERT_AUTH_ROOT_SEQ_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("authrootseq.txt");

public const val `CERT_AUTH_ROOT_SHA256_HASH_PROP_ID`: UInt = 98u;
public const val `CERT_AUTO_ENROLL_PROP_ID`: UInt = 21u;
public const val `CERT_AUTO_ENROLL_RETRY_PROP_ID`: UInt = 66u;
public const val `CERT_AUTO_UPDATE_DISABLE_RANDOM_QUERY_STRING_FLAG`: UInt = 4u;
// UNSUPPORTED Rust 1851:1: non-scalar type Ptr unsupported
// pub const CERT_AUTO_UPDATE_ROOT_DIR_URL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RootDirUrl");

// UNSUPPORTED Rust 1852:1: non-scalar type Ptr unsupported
// pub const CERT_AUTO_UPDATE_SYNC_FROM_DIR_URL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SyncFromDirUrl");

public const val `CERT_BACKED_UP_PROP_ID`: UInt = 69u;
// UNSUPPORTED Rust 1854:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_BASIC_CONSTRAINTS2_INFO {
//     pub fCA: windows_sys::core::BOOL,
//     pub fPathLenConstraint: windows_sys::core::BOOL,
//     pub dwPathLenConstraint: u32,
// }

// UNSUPPORTED Rust 1861:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_BASIC_CONSTRAINTS_INFO {
//     pub SubjectType: CRYPT_BIT_BLOB,
//     pub fPathLenConstraint: windows_sys::core::BOOL,
//     pub dwPathLenConstraint: u32,
//     pub cSubtreesConstraint: u32,
//     pub rgSubtreesConstraint: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 1870:1: declaration Impl has no candidate rule
// impl Default for CERT_BASIC_CONSTRAINTS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_BIOMETRIC_DATA {
//     pub dwTypeOfBiometricDataChoice: CERT_BIOMETRIC_DATA_TYPE,
//     pub Anonymous: CERT_BIOMETRIC_DATA_0,
//     pub HashedUrl: CERT_HASHED_URL,
// }

// UNSUPPORTED Rust 1882:1: declaration Impl has no candidate rule
// impl Default for CERT_BIOMETRIC_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1887:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CERT_BIOMETRIC_DATA_0 {
//     pub dwPredefined: u32,
//     pub pszObjId: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1893:1: declaration Impl has no candidate rule
// impl Default for CERT_BIOMETRIC_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_BIOMETRIC_DATA_TYPE` = UInt;
// UNSUPPORTED Rust 1899:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_BIOMETRIC_EXT_INFO {
//     pub cBiometricData: u32,
//     pub rgBiometricData: *mut CERT_BIOMETRIC_DATA,
// }

// UNSUPPORTED Rust 1905:1: declaration Impl has no candidate rule
// impl Default for CERT_BIOMETRIC_EXT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_BIOMETRIC_OID_DATA_CHOICE`: `CERT_BIOMETRIC_DATA_TYPE` = 2u;
public const val `CERT_BIOMETRIC_PICTURE_TYPE`: UInt = 0u;
public const val `CERT_BIOMETRIC_PREDEFINED_DATA_CHOICE`: `CERT_BIOMETRIC_DATA_TYPE` = 1u;
public const val `CERT_BIOMETRIC_SIGNATURE_TYPE`: UInt = 1u;
public const val `CERT_BUNDLE_CERTIFICATE`: UInt = 0u;
public const val `CERT_BUNDLE_CRL`: UInt = 1u;
public const val `CERT_CASE_INSENSITIVE_IS_RDN_ATTRS_FLAG`: UInt = 2u;
public const val `CERT_CA_DISABLE_CRL_PROP_ID`: UInt = 82u;
public const val `CERT_CA_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID`: UInt = 81u;
public const val `CERT_CA_SUBJECT_FLAG`: UInt = 128u;
public const val `CERT_CEP_PROP_ID`: UInt = 87u;
// UNSUPPORTED Rust 1921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN {
//     pub cCerts: u32,
//     pub certs: *mut CRYPT_INTEGER_BLOB,
//     pub keyLocatorInfo: CRYPT_KEY_PROV_INFO,
// }

// UNSUPPORTED Rust 1928:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CHAIN_AUTO_CURRENT_USER`: UInt = 1u;
// UNSUPPORTED Rust 1934:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_AUTO_FLAGS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoFlags");

public const val `CERT_CHAIN_AUTO_FLUSH_DISABLE_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 1936:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_AUTO_FLUSH_FIRST_DELTA_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoFlushFirstDeltaSeconds");

// UNSUPPORTED Rust 1937:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_AUTO_FLUSH_NEXT_DELTA_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoFlushNextDeltaSeconds");

public const val `CERT_CHAIN_AUTO_HPKP_RULE_INFO`: UInt = 8u;
public const val `CERT_CHAIN_AUTO_IMPERSONATED`: UInt = 3u;
public const val `CERT_CHAIN_AUTO_LOCAL_MACHINE`: UInt = 2u;
public const val `CERT_CHAIN_AUTO_LOG_CREATE_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 1942:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_AUTO_LOG_FILE_NAME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoLogFileName");

public const val `CERT_CHAIN_AUTO_LOG_FLUSH_FLAG`: UInt = 8u;
public const val `CERT_CHAIN_AUTO_LOG_FREE_FLAG`: UInt = 4u;
public const val `CERT_CHAIN_AUTO_NETWORK_INFO`: UInt = 6u;
public const val `CERT_CHAIN_AUTO_PINRULE_INFO`: UInt = 5u;
public const val `CERT_CHAIN_AUTO_PROCESS_INFO`: UInt = 4u;
public const val `CERT_CHAIN_AUTO_SERIAL_LOCAL_MACHINE`: UInt = 7u;
public const val `CERT_CHAIN_CACHE_END_CERT`: UInt = 1u;
public const val `CERT_CHAIN_CACHE_ONLY_URL_RETRIEVAL`: UInt = 4u;
// UNSUPPORTED Rust 1951:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_CACHE_RESYNC_FILETIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainCacheResyncFiletime");

// UNSUPPORTED Rust 1952:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_CONFIG_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Cryptography\\OID\\EncodingType 0\\CertDllCreateCertificateChainEngine\\Config");

// UNSUPPORTED Rust 1953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN_CONTEXT {
//     pub cbSize: u32,
//     pub TrustStatus: CERT_TRUST_STATUS,
//     pub cChain: u32,
//     pub rgpChain: *mut *mut CERT_SIMPLE_CHAIN,
//     pub cLowerQualityChainContext: u32,
//     pub rgpLowerQualityChainContext: *mut *mut CERT_CHAIN_CONTEXT,
//     pub fHasRevocationFreshnessTime: windows_sys::core::BOOL,
//     pub dwRevocationFreshnessTime: u32,
//     pub dwCreateFlags: u32,
//     pub ChainId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1967:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CHAIN_CRL_VALIDITY_EXT_PERIOD_HOURS_DEFAULT`: UInt = 12u;
// UNSUPPORTED Rust 1973:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_CRL_VALIDITY_EXT_PERIOD_HOURS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CRLValidityExtensionPeriod");

// UNSUPPORTED Rust 1974:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_CROSS_CERT_DOWNLOAD_INTERVAL_HOURS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossCertDownloadIntervalHours");

// UNSUPPORTED Rust 1975:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DEFAULT_CONFIG_SUBDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("Default");

public const val `CERT_CHAIN_DISABLE_AIA`: UInt = 8192u;
// UNSUPPORTED Rust 1977:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DISABLE_AIA_URL_RETRIEVAL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableAIAUrlRetrieval");

public const val `CERT_CHAIN_DISABLE_ALL_EKU_WEAK_FLAG`: UInt = 65536u;
public const val `CERT_CHAIN_DISABLE_AUTH_ROOT_AUTO_UPDATE`: UInt = 256u;
// UNSUPPORTED Rust 1980:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DISABLE_AUTO_FLUSH_PROCESS_NAME_LIST_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableAutoFlushProcessNameList");

// UNSUPPORTED Rust 1981:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DISABLE_CA_NAME_CONSTRAINTS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableCANameConstraints");

public const val `CERT_CHAIN_DISABLE_CODE_SIGNING_WEAK_FLAG`: UInt = 4194304u;
public const val `CERT_CHAIN_DISABLE_ECC_PARA_FLAG`: UInt = 16u;
public const val `CERT_CHAIN_DISABLE_FILE_HASH_WEAK_FLAG`: UInt = 4096u;
// UNSUPPORTED Rust 1985:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DISABLE_MANDATORY_BASIC_CONSTRAINTS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableMandatoryBasicConstraints");

public const val `CERT_CHAIN_DISABLE_MD2_MD4`: UInt = 4096u;
public const val `CERT_CHAIN_DISABLE_MOTW_CODE_SIGNING_WEAK_FLAG`: UInt = 8388608u;
public const val `CERT_CHAIN_DISABLE_MOTW_FILE_HASH_WEAK_FLAG`: UInt = 8192u;
public const val `CERT_CHAIN_DISABLE_MOTW_TIMESTAMP_HASH_WEAK_FLAG`: UInt = 32768u;
public const val `CERT_CHAIN_DISABLE_MOTW_TIMESTAMP_WEAK_FLAG`: UInt = 134217728u;
public const val `CERT_CHAIN_DISABLE_MY_PEER_TRUST`: UInt = 2048u;
public const val `CERT_CHAIN_DISABLE_OPT_IN_SERVER_AUTH_WEAK_FLAG`: UInt = 262144u;
public const val `CERT_CHAIN_DISABLE_PASS1_QUALITY_FILTERING`: UInt = 64u;
// UNSUPPORTED Rust 1994:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DISABLE_SERIAL_CHAIN_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableSerialChain");

public const val `CERT_CHAIN_DISABLE_SERVER_AUTH_WEAK_FLAG`: UInt = 1048576u;
// UNSUPPORTED Rust 1996:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DISABLE_SYNC_WITH_SSL_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableSyncWithSslTime");

public const val `CERT_CHAIN_DISABLE_TIMESTAMP_HASH_WEAK_FLAG`: UInt = 16384u;
public const val `CERT_CHAIN_DISABLE_TIMESTAMP_WEAK_FLAG`: UInt = 67108864u;
// UNSUPPORTED Rust 1999:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_DISABLE_UNSUPPORTED_CRITICAL_EXTENSIONS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableUnsupportedCriticalExtensions");

// UNSUPPORTED Rust 2000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN_ELEMENT {
//     pub cbSize: u32,
//     pub pCertContext: *const CERT_CONTEXT,
//     pub TrustStatus: CERT_TRUST_STATUS,
//     pub pRevocationInfo: *mut CERT_REVOCATION_INFO,
//     pub pIssuanceUsage: *mut CTL_USAGE,
//     pub pApplicationUsage: *mut CTL_USAGE,
//     pub pwszExtendedErrorInfo: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 2011:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CHAIN_ENABLE_ALL_EKU_HYGIENE_FLAG`: UInt = 131072u;
public const val `CERT_CHAIN_ENABLE_CACHE_AUTO_UPDATE`: UInt = 16u;
public const val `CERT_CHAIN_ENABLE_CODE_SIGNING_HYGIENE_FLAG`: UInt = 16777216u;
public const val `CERT_CHAIN_ENABLE_DISALLOWED_CA`: UInt = 131072u;
public const val `CERT_CHAIN_ENABLE_MD2_MD4_FLAG`: UInt = 1u;
public const val `CERT_CHAIN_ENABLE_MOTW_CODE_SIGNING_HYGIENE_FLAG`: UInt = 33554432u;
public const val `CERT_CHAIN_ENABLE_MOTW_TIMESTAMP_HYGIENE_FLAG`: UInt = 536870912u;
public const val `CERT_CHAIN_ENABLE_ONLY_WEAK_LOGGING_FLAG`: UInt = 8u;
public const val `CERT_CHAIN_ENABLE_PEER_TRUST`: UInt = 1024u;
public const val `CERT_CHAIN_ENABLE_SERVER_AUTH_HYGIENE_FLAG`: UInt = 2097152u;
public const val `CERT_CHAIN_ENABLE_SHARE_STORE`: UInt = 32u;
public const val `CERT_CHAIN_ENABLE_TIMESTAMP_HYGIENE_FLAG`: UInt = 268435456u;
public const val `CERT_CHAIN_ENABLE_WEAK_LOGGING_FLAG`: UInt = 4u;
public const val `CERT_CHAIN_ENABLE_WEAK_RSA_ROOT_FLAG`: UInt = 2u;
public const val `CERT_CHAIN_ENABLE_WEAK_SETTINGS_FLAG`: UInt = 2147483648u;
// UNSUPPORTED Rust 2031:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_ENABLE_WEAK_SIGNATURE_FLAGS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableWeakSignatureFlags");

// UNSUPPORTED Rust 2032:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN_ENGINE_CONFIG {
//     pub cbSize: u32,
//     pub hRestrictedRoot: HCERTSTORE,
//     pub hRestrictedTrust: HCERTSTORE,
//     pub hRestrictedOther: HCERTSTORE,
//     pub cAdditionalStore: u32,
//     pub rghAdditionalStore: *mut HCERTSTORE,
//     pub dwFlags: u32,
//     pub dwUrlRetrievalTimeout: u32,
//     pub MaximumCachedCertificates: u32,
//     pub CycleDetectionModulus: u32,
//     pub hExclusiveRoot: HCERTSTORE,
//     pub hExclusiveTrustedPeople: HCERTSTORE,
//     pub dwExclusiveFlags: u32,
// }

// UNSUPPORTED Rust 2049:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN_ENGINE_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CHAIN_EXCLUSIVE_ENABLE_CA_FLAG`: UInt = 1u;
public const val `CERT_CHAIN_FIND_BY_ISSUER`: UInt = 1u;
public const val `CERT_CHAIN_FIND_BY_ISSUER_CACHE_ONLY_FLAG`: `CERT_FIND_CHAIN_IN_STORE_FLAGS` = 32768u;
public const val `CERT_CHAIN_FIND_BY_ISSUER_CACHE_ONLY_URL_FLAG`: `CERT_FIND_CHAIN_IN_STORE_FLAGS` = 4u;
public const val `CERT_CHAIN_FIND_BY_ISSUER_COMPARE_KEY_FLAG`: `CERT_FIND_CHAIN_IN_STORE_FLAGS` = 1u;
public const val `CERT_CHAIN_FIND_BY_ISSUER_COMPLEX_CHAIN_FLAG`: `CERT_FIND_CHAIN_IN_STORE_FLAGS` = 2u;
public const val `CERT_CHAIN_FIND_BY_ISSUER_LOCAL_MACHINE_FLAG`: `CERT_FIND_CHAIN_IN_STORE_FLAGS` = 8u;
public const val `CERT_CHAIN_FIND_BY_ISSUER_NO_KEY_FLAG`: `CERT_FIND_CHAIN_IN_STORE_FLAGS` = 16384u;
// UNSUPPORTED Rust 2062:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN_FIND_BY_ISSUER_PARA {
//     pub cbSize: u32,
//     pub pszUsageIdentifier: windows_sys::core::PCSTR,
//     pub dwKeySpec: u32,
//     pub dwAcquirePrivateKeyFlags: u32,
//     pub cIssuer: u32,
//     pub rgIssuer: *mut CRYPT_INTEGER_BLOB,
//     pub pfnFindCallback: PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK,
//     pub pvFindArg: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2074:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN_FIND_BY_ISSUER_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CHAIN_HAS_MOTW`: UInt = 16384u;
public const val `CERT_CHAIN_MAX_AIA_URL_COUNT_IN_CERT_DEFAULT`: UInt = 5u;
// UNSUPPORTED Rust 2081:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_MAX_AIA_URL_COUNT_IN_CERT_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxAIAUrlCountInCert");

public const val `CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_BYTE_COUNT_DEFAULT`: UInt = 100000u;
// UNSUPPORTED Rust 2083:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_BYTE_COUNT_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxAIAUrlRetrievalByteCount");

public const val `CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_CERT_COUNT_DEFAULT`: UInt = 10u;
// UNSUPPORTED Rust 2085:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_CERT_COUNT_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxAIAUrlRetrievalCertCount");

public const val `CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_COUNT_PER_CHAIN_DEFAULT`: UInt = 3u;
// UNSUPPORTED Rust 2087:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_COUNT_PER_CHAIN_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxAIAUrlRetrievalCountPerChain");

public const val `CERT_CHAIN_MAX_SSL_TIME_UPDATED_EVENT_COUNT_DEFAULT`: UInt = 5u;
public const val `CERT_CHAIN_MAX_SSL_TIME_UPDATED_EVENT_COUNT_DISABLE`: UInt = 4294967295u;
// UNSUPPORTED Rust 2090:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_MAX_SSL_TIME_UPDATED_EVENT_COUNT_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxSslTimeUpdatedEventCount");

// UNSUPPORTED Rust 2091:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_MAX_URL_RETRIEVAL_BYTE_COUNT_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxUrlRetrievalByteCount");

public const val `CERT_CHAIN_MIN_PUB_KEY_BIT_LENGTH_DISABLE`: UInt = 4294967295u;
public const val `CERT_CHAIN_MIN_RSA_PUB_KEY_BIT_LENGTH_DEFAULT`: UInt = 1023u;
public const val `CERT_CHAIN_MIN_RSA_PUB_KEY_BIT_LENGTH_DISABLE`: UInt = 4294967295u;
// UNSUPPORTED Rust 2095:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_MIN_RSA_PUB_KEY_BIT_LENGTH_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MinRsaPubKeyBitLength");

public const val `CERT_CHAIN_MOTW_IGNORE_AFTER_TIME_WEAK_FLAG`: UInt = 1073741824u;
// UNSUPPORTED Rust 2097:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_OCSP_VALIDITY_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("OcspValiditySeconds");

public const val `CERT_CHAIN_ONLY_ADDITIONAL_AND_AUTH_ROOT`: UInt = 32768u;
// UNSUPPORTED Rust 2099:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_OPTIONS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Options");

public const val `CERT_CHAIN_OPTION_DISABLE_AIA_URL_RETRIEVAL`: UInt = 2u;
public const val `CERT_CHAIN_OPTION_ENABLE_SIA_URL_RETRIEVAL`: UInt = 4u;
public const val `CERT_CHAIN_OPT_IN_WEAK_FLAGS`: UInt = 262144u;
public const val `CERT_CHAIN_OPT_IN_WEAK_SIGNATURE`: UInt = 65536u;
// UNSUPPORTED Rust 2104:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN_PARA {
//     pub cbSize: u32,
//     pub RequestedUsage: CERT_USAGE_MATCH,
//     pub RequestedIssuancePolicy: CERT_USAGE_MATCH,
//     pub dwUrlRetrievalTimeout: u32,
//     pub fCheckRevocationFreshnessTime: windows_sys::core::BOOL,
//     pub dwRevocationFreshnessTime: u32,
//     pub pftCacheResync: *mut super::super::Foundation::FILETIME,
//     pub pStrongSignPara: *mut CERT_STRONG_SIGN_PARA,
//     pub dwStrongSignFlags: u32,
// }

// UNSUPPORTED Rust 2117:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CHAIN_POLICY_ALLOW_TESTROOT_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 32768u;
public const val `CERT_CHAIN_POLICY_ALLOW_UNKNOWN_CA_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 16u;
// UNSUPPORTED Rust 2124:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_AUTHENTICODE: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 2125:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_AUTHENTICODE_TS: windows_sys::core::PCSTR = 3i32 as _;

// UNSUPPORTED Rust 2126:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_BASE: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 2127:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_BASIC_CONSTRAINTS: windows_sys::core::PCSTR = 5i32 as _;

// UNSUPPORTED Rust 2128:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_EV: windows_sys::core::PCSTR = 8i32 as _;

public typealias `CERT_CHAIN_POLICY_FLAGS` = UInt;
public const val `CERT_CHAIN_POLICY_IGNORE_ALL_NOT_TIME_VALID_FLAGS`: `CERT_CHAIN_POLICY_FLAGS` = 7u;
public const val `CERT_CHAIN_POLICY_IGNORE_ALL_REV_UNKNOWN_FLAGS`: `CERT_CHAIN_POLICY_FLAGS` = 3840u;
public const val `CERT_CHAIN_POLICY_IGNORE_CA_REV_UNKNOWN_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 1024u;
public const val `CERT_CHAIN_POLICY_IGNORE_CTL_NOT_TIME_VALID_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 2u;
public const val `CERT_CHAIN_POLICY_IGNORE_CTL_SIGNER_REV_UNKNOWN_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 512u;
public const val `CERT_CHAIN_POLICY_IGNORE_END_REV_UNKNOWN_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 256u;
public const val `CERT_CHAIN_POLICY_IGNORE_INVALID_BASIC_CONSTRAINTS_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 8u;
public const val `CERT_CHAIN_POLICY_IGNORE_INVALID_NAME_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 64u;
public const val `CERT_CHAIN_POLICY_IGNORE_INVALID_POLICY_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 128u;
public const val `CERT_CHAIN_POLICY_IGNORE_NOT_SUPPORTED_CRITICAL_EXT_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 8192u;
public const val `CERT_CHAIN_POLICY_IGNORE_NOT_TIME_NESTED_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 4u;
public const val `CERT_CHAIN_POLICY_IGNORE_NOT_TIME_VALID_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 1u;
public const val `CERT_CHAIN_POLICY_IGNORE_PEER_TRUST_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 4096u;
public const val `CERT_CHAIN_POLICY_IGNORE_ROOT_REV_UNKNOWN_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 2048u;
public const val `CERT_CHAIN_POLICY_IGNORE_WEAK_SIGNATURE_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 134217728u;
public const val `CERT_CHAIN_POLICY_IGNORE_WRONG_USAGE_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 32u;
// UNSUPPORTED Rust 2146:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_MICROSOFT_ROOT: windows_sys::core::PCSTR = 7i32 as _;

// UNSUPPORTED Rust 2147:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_NT_AUTH: windows_sys::core::PCSTR = 6i32 as _;

// UNSUPPORTED Rust 2148:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN_POLICY_PARA {
//     pub cbSize: u32,
//     pub dwFlags: CERT_CHAIN_POLICY_FLAGS,
//     pub pvExtraPolicyPara: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2155:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN_POLICY_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2160:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_SSL: windows_sys::core::PCSTR = 4i32 as _;

// UNSUPPORTED Rust 2161:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_SSL_F12: windows_sys::core::PCSTR = 9i32 as _;

public const val `CERT_CHAIN_POLICY_SSL_F12_ERROR_LEVEL`: UInt = 2u;
public const val `CERT_CHAIN_POLICY_SSL_F12_NONE_CATEGORY`: UInt = 0u;
public const val `CERT_CHAIN_POLICY_SSL_F12_ROOT_PROGRAM_CATEGORY`: UInt = 2u;
public const val `CERT_CHAIN_POLICY_SSL_F12_SUCCESS_LEVEL`: UInt = 0u;
public const val `CERT_CHAIN_POLICY_SSL_F12_WARNING_LEVEL`: UInt = 1u;
public const val `CERT_CHAIN_POLICY_SSL_F12_WEAK_CRYPTO_CATEGORY`: UInt = 1u;
// UNSUPPORTED Rust 2168:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_SSL_HPKP_HEADER: windows_sys::core::PCSTR = 10i32 as _;

// UNSUPPORTED Rust 2169:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_SSL_KEY_PIN: windows_sys::core::PCSTR = 12i32 as _;

public const val `CERT_CHAIN_POLICY_SSL_KEY_PIN_MISMATCH_ERROR`: Int = -2;
public const val `CERT_CHAIN_POLICY_SSL_KEY_PIN_MISMATCH_WARNING`: UInt = 2u;
public const val `CERT_CHAIN_POLICY_SSL_KEY_PIN_MITM_ERROR`: Int = -1;
public const val `CERT_CHAIN_POLICY_SSL_KEY_PIN_MITM_WARNING`: UInt = 1u;
public const val `CERT_CHAIN_POLICY_SSL_KEY_PIN_SUCCESS`: UInt = 0u;
// UNSUPPORTED Rust 2175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CHAIN_POLICY_STATUS {
//     pub cbSize: u32,
//     pub dwError: u32,
//     pub lChainIndex: i32,
//     pub lElementIndex: i32,
//     pub pvExtraPolicyStatus: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2184:1: declaration Impl has no candidate rule
// impl Default for CERT_CHAIN_POLICY_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2189:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_POLICY_THIRD_PARTY_ROOT: windows_sys::core::PCSTR = 11i32 as _;

public const val `CERT_CHAIN_POLICY_TRUST_TESTROOT_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 16384u;
public const val `CERT_CHAIN_RETURN_LOWER_QUALITY_CONTEXTS`: UInt = 128u;
public const val `CERT_CHAIN_REVOCATION_ACCUMULATIVE_TIMEOUT`: UInt = 134217728u;
public const val `CERT_CHAIN_REVOCATION_CHECK_CACHE_ONLY`: UInt = 2147483648u;
public const val `CERT_CHAIN_REVOCATION_CHECK_CHAIN`: UInt = 536870912u;
public const val `CERT_CHAIN_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT`: UInt = 1073741824u;
public const val `CERT_CHAIN_REVOCATION_CHECK_END_CERT`: UInt = 268435456u;
public const val `CERT_CHAIN_REVOCATION_CHECK_OCSP_CERT`: UInt = 67108864u;
// UNSUPPORTED Rust 2198:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_REV_ACCUMULATIVE_URL_RETRIEVAL_TIMEOUT_MILLISECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainRevAccumulativeUrlRetrievalTimeoutMilliseconds");

// UNSUPPORTED Rust 2199:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_SERIAL_CHAIN_LOG_FILE_NAME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SerialChainLogFileName");

// UNSUPPORTED Rust 2200:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_SSL_HANDSHAKE_LOG_FILE_NAME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SslHandshakeLogFileName");

public const val `CERT_CHAIN_STRONG_SIGN_DISABLE_END_CHECK_FLAG`: UInt = 1u;
public const val `CERT_CHAIN_THREAD_STORE_SYNC`: UInt = 2u;
public const val `CERT_CHAIN_TIMESTAMP_TIME`: UInt = 512u;
// UNSUPPORTED Rust 2204:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_URL_RETRIEVAL_TIMEOUT_MILLISECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainUrlRetrievalTimeoutMilliseconds");

public const val `CERT_CHAIN_USE_LOCAL_MACHINE_STORE`: UInt = 8u;
// UNSUPPORTED Rust 2206:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_AFTER_TIME_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AfterTime");

// UNSUPPORTED Rust 2207:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_ALL_CONFIG_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("All");

// UNSUPPORTED Rust 2208:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_FILE_HASH_AFTER_TIME_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FileHashAfterTime");

// UNSUPPORTED Rust 2209:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_FLAGS_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

// UNSUPPORTED Rust 2210:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_HYGIENE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Hygiene");

// UNSUPPORTED Rust 2211:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_MIN_BIT_LENGTH_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MinBitLength");

// UNSUPPORTED Rust 2212:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_PREFIX_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Weak");

// UNSUPPORTED Rust 2213:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_RSA_PUB_KEY_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WeakRsaPubKeyTime");

// UNSUPPORTED Rust 2214:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_SHA256_ALLOW_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Sha256Allow");

// UNSUPPORTED Rust 2215:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_SIGNATURE_LOG_DIR_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WeakSignatureLogDir");

// UNSUPPORTED Rust 2216:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_THIRD_PARTY_CONFIG_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ThirdParty");

// UNSUPPORTED Rust 2217:1: non-scalar type Ptr unsupported
// pub const CERT_CHAIN_WEAK_TIMESTAMP_HASH_AFTER_TIME_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("TimestampHashAfterTime");

public const val `CERT_CLOSE_STORE_CHECK_FLAG`: UInt = 2u;
public const val `CERT_CLOSE_STORE_FORCE_FLAG`: UInt = 1u;
public const val `CERT_CLR_DELETE_KEY_PROP_ID`: UInt = 125u;
public const val `CERT_COMPARE_ANY`: UInt = 0u;
public const val `CERT_COMPARE_ATTR`: UInt = 3u;
public const val `CERT_COMPARE_CERT_ID`: UInt = 16u;
public const val `CERT_COMPARE_CROSS_CERT_DIST_POINTS`: UInt = 17u;
public const val `CERT_COMPARE_CTL_USAGE`: UInt = 10u;
public const val `CERT_COMPARE_ENHKEY_USAGE`: UInt = 10u;
public const val `CERT_COMPARE_EXISTING`: UInt = 13u;
public const val `CERT_COMPARE_HASH`: UInt = 1u;
public const val `CERT_COMPARE_HASH_STR`: UInt = 20u;
public const val `CERT_COMPARE_HAS_PRIVATE_KEY`: UInt = 21u;
public const val `CERT_COMPARE_ISSUER_OF`: UInt = 12u;
public const val `CERT_COMPARE_KEY_IDENTIFIER`: UInt = 15u;
public const val `CERT_COMPARE_KEY_SPEC`: UInt = 9u;
public const val `CERT_COMPARE_MASK`: UInt = 65535u;
public const val `CERT_COMPARE_MD5_HASH`: UInt = 4u;
public const val `CERT_COMPARE_NAME`: UInt = 2u;
public const val `CERT_COMPARE_NAME_STR_A`: UInt = 7u;
public const val `CERT_COMPARE_NAME_STR_W`: UInt = 8u;
public const val `CERT_COMPARE_PROPERTY`: UInt = 5u;
public const val `CERT_COMPARE_PUBKEY_MD5_HASH`: UInt = 18u;
public const val `CERT_COMPARE_PUBLIC_KEY`: UInt = 6u;
public const val `CERT_COMPARE_SHA1_HASH`: UInt = 1u;
public const val `CERT_COMPARE_SHIFT`: Int = 16;
public const val `CERT_COMPARE_SIGNATURE_HASH`: UInt = 14u;
public const val `CERT_COMPARE_SUBJECT_CERT`: UInt = 11u;
public const val `CERT_COMPARE_SUBJECT_INFO_ACCESS`: UInt = 19u;
// UNSUPPORTED Rust 2247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CONTEXT {
//     pub dwCertEncodingType: CERT_QUERY_ENCODING_TYPE,
//     pub pbCertEncoded: *mut u8,
//     pub cbCertEncoded: u32,
//     pub pCertInfo: *mut CERT_INFO,
//     pub hCertStore: HCERTSTORE,
// }

// UNSUPPORTED Rust 2256:1: declaration Impl has no candidate rule
// impl Default for CERT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CONTEXT_REVOCATION_TYPE`: UInt = 1u;
public typealias `CERT_CONTROL_STORE_FLAGS` = UInt;
public const val `CERT_CREATE_CONTEXT_NOCOPY_FLAG`: UInt = 1u;
public const val `CERT_CREATE_CONTEXT_NO_ENTRY_FLAG`: UInt = 8u;
public const val `CERT_CREATE_CONTEXT_NO_HCRYPTMSG_FLAG`: UInt = 4u;
// UNSUPPORTED Rust 2266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CREATE_CONTEXT_PARA {
//     pub cbSize: u32,
//     pub pfnFree: PFN_CRYPT_FREE,
//     pub pvFree: *mut core::ffi::c_void,
//     pub pfnSort: PFN_CERT_CREATE_CONTEXT_SORT_FUNC,
//     pub pvSort: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2275:1: declaration Impl has no candidate rule
// impl Default for CERT_CREATE_CONTEXT_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CREATE_CONTEXT_SORTED_FLAG`: UInt = 2u;
public typealias `CERT_CREATE_SELFSIGN_FLAGS` = UInt;
public const val `CERT_CREATE_SELFSIGN_NO_KEY_INFO`: `CERT_CREATE_SELFSIGN_FLAGS` = 2u;
public const val `CERT_CREATE_SELFSIGN_NO_SIGN`: `CERT_CREATE_SELFSIGN_FLAGS` = 1u;
// UNSUPPORTED Rust 2284:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CRL_CONTEXT_PAIR {
//     pub pCertContext: *const CERT_CONTEXT,
//     pub pCrlContext: *mut CRL_CONTEXT,
// }

// UNSUPPORTED Rust 2290:1: declaration Impl has no candidate rule
// impl Default for CERT_CRL_CONTEXT_PAIR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_CRL_SIGN_KEY_USAGE`: UInt = 2u;
public const val `CERT_CROSS_CERT_DIST_POINTS_PROP_ID`: UInt = 23u;
public const val `CERT_CTL_USAGE_PROP_ID`: UInt = 9u;
public const val `CERT_DATA_ENCIPHERMENT_KEY_USAGE`: UInt = 16u;
public const val `CERT_DATE_STAMP_PROP_ID`: UInt = 27u;
public const val `CERT_DECIPHER_ONLY_KEY_USAGE`: UInt = 128u;
// UNSUPPORTED Rust 2301:1: non-scalar type Ptr unsupported
// pub const CERT_DEFAULT_OID_PUBLIC_KEY_SIGN: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113549.1.1.1");

// UNSUPPORTED Rust 2302:1: non-scalar type Ptr unsupported
// pub const CERT_DEFAULT_OID_PUBLIC_KEY_XCHG: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113549.1.1.1");

public const val `CERT_DESCRIPTION_PROP_ID`: UInt = 13u;
// UNSUPPORTED Rust 2304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_DH_PARAMETERS {
//     pub p: CRYPT_INTEGER_BLOB,
//     pub g: CRYPT_INTEGER_BLOB,
// }

public const val `CERT_DIGITAL_SIGNATURE_KEY_USAGE`: UInt = 128u;
// UNSUPPORTED Rust 2311:1: non-scalar type Ptr unsupported
// pub const CERT_DISABLE_PIN_RULES_AUTO_UPDATE_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisablePinRulesAutoUpdate");

// UNSUPPORTED Rust 2312:1: non-scalar type Ptr unsupported
// pub const CERT_DISABLE_ROOT_AUTO_UPDATE_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableRootAutoUpdate");

public const val `CERT_DISALLOWED_CA_FILETIME_PROP_ID`: UInt = 128u;
// UNSUPPORTED Rust 2314:1: non-scalar type Ptr unsupported
// pub const CERT_DISALLOWED_CERT_AUTO_UPDATE_ENCODED_CTL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisallowedCertEncodedCtl");

// UNSUPPORTED Rust 2315:1: non-scalar type Ptr unsupported
// pub const CERT_DISALLOWED_CERT_AUTO_UPDATE_LAST_SYNC_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisallowedCertLastSyncTime");

// UNSUPPORTED Rust 2316:1: non-scalar type Ptr unsupported
// pub const CERT_DISALLOWED_CERT_AUTO_UPDATE_LIST_IDENTIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("DisallowedCert_AutoUpdate_1");

// UNSUPPORTED Rust 2317:1: non-scalar type Ptr unsupported
// pub const CERT_DISALLOWED_CERT_AUTO_UPDATE_SYNC_DELTA_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisallowedCertSyncDeltaTime");

// UNSUPPORTED Rust 2318:1: non-scalar type Ptr unsupported
// pub const CERT_DISALLOWED_CERT_CAB_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("disallowedcertstl.cab");

// UNSUPPORTED Rust 2319:1: non-scalar type Ptr unsupported
// pub const CERT_DISALLOWED_CERT_CTL_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("disallowedcert.stl");

// UNSUPPORTED Rust 2320:1: non-scalar type Ptr unsupported
// pub const CERT_DISALLOWED_CERT_CTL_FILENAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("disallowedcert.stl");

public const val `CERT_DISALLOWED_ENHKEY_USAGE_PROP_ID`: UInt = 122u;
public const val `CERT_DISALLOWED_FILETIME_PROP_ID`: UInt = 104u;
// UNSUPPORTED Rust 2323:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_DSS_PARAMETERS {
//     pub p: CRYPT_INTEGER_BLOB,
//     pub q: CRYPT_INTEGER_BLOB,
//     pub g: CRYPT_INTEGER_BLOB,
// }

public const val `CERT_DSS_R_LEN`: UInt = 20u;
public const val `CERT_DSS_S_LEN`: UInt = 20u;
// UNSUPPORTED Rust 2332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_ECC_SIGNATURE {
//     pub r: CRYPT_INTEGER_BLOB,
//     pub s: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 2338:1: non-scalar type Ptr unsupported
// pub const CERT_EFSBLOB_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EFSBlob");

public const val `CERT_EFS_PROP_ID`: UInt = 17u;
// UNSUPPORTED Rust 2340:1: non-scalar type Ptr unsupported
// pub const CERT_ENABLE_DISALLOWED_CERT_AUTO_UPDATE_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableDisallowedCertAutoUpdate");

public const val `CERT_ENCIPHER_ONLY_KEY_USAGE`: UInt = 1u;
public const val `CERT_ENCODING_TYPE_MASK`: UInt = 65535u;
public const val `CERT_END_ENTITY_SUBJECT_FLAG`: UInt = 64u;
public const val `CERT_ENHKEY_USAGE_PROP_ID`: UInt = 9u;
public const val `CERT_ENROLLMENT_PROP_ID`: UInt = 26u;
public const val `CERT_EXCLUDED_SUBTREE_BIT`: Int = -2147483648;
public const val `CERT_EXTENDED_ERROR_INFO_PROP_ID`: UInt = 30u;
// UNSUPPORTED Rust 2348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_EXTENSION {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub fCritical: windows_sys::core::BOOL,
//     pub Value: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 2355:1: declaration Impl has no candidate rule
// impl Default for CERT_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_EXTENSIONS {
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 2366:1: declaration Impl has no candidate rule
// impl Default for CERT_EXTENSIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_FILE_HASH_USE_TYPE`: UInt = 1u;
public const val `CERT_FILE_STORE_COMMIT_ENABLE_FLAG`: UInt = 65536u;
public const val `CERT_FIND_ANY`: `CERT_FIND_FLAGS` = 0u;
public const val `CERT_FIND_CERT_ID`: `CERT_FIND_FLAGS` = 1048576u;
public typealias `CERT_FIND_CHAIN_IN_STORE_FLAGS` = UInt;
public const val `CERT_FIND_CROSS_CERT_DIST_POINTS`: `CERT_FIND_FLAGS` = 1114112u;
public const val `CERT_FIND_CTL_USAGE`: `CERT_FIND_FLAGS` = 655360u;
public const val `CERT_FIND_ENHKEY_USAGE`: `CERT_FIND_FLAGS` = 655360u;
public const val `CERT_FIND_EXISTING`: `CERT_FIND_FLAGS` = 851968u;
public const val `CERT_FIND_EXT_ONLY_CTL_USAGE_FLAG`: `CERT_FIND_FLAGS` = 2u;
public const val `CERT_FIND_EXT_ONLY_ENHKEY_USAGE_FLAG`: `CERT_FIND_FLAGS` = 2u;
public typealias `CERT_FIND_FLAGS` = UInt;
public const val `CERT_FIND_HASH`: `CERT_FIND_FLAGS` = 65536u;
public const val `CERT_FIND_HASH_STR`: `CERT_FIND_FLAGS` = 1310720u;
public const val `CERT_FIND_HAS_PRIVATE_KEY`: `CERT_FIND_FLAGS` = 1376256u;
public const val `CERT_FIND_ISSUER_ATTR`: `CERT_FIND_FLAGS` = 196612u;
public const val `CERT_FIND_ISSUER_NAME`: `CERT_FIND_FLAGS` = 131076u;
public const val `CERT_FIND_ISSUER_OF`: `CERT_FIND_FLAGS` = 786432u;
public const val `CERT_FIND_ISSUER_STR`: `CERT_FIND_FLAGS` = 524292u;
public const val `CERT_FIND_ISSUER_STR_A`: `CERT_FIND_FLAGS` = 458756u;
public const val `CERT_FIND_ISSUER_STR_W`: `CERT_FIND_FLAGS` = 524292u;
public const val `CERT_FIND_KEY_IDENTIFIER`: `CERT_FIND_FLAGS` = 983040u;
public const val `CERT_FIND_KEY_SPEC`: `CERT_FIND_FLAGS` = 589824u;
public const val `CERT_FIND_MD5_HASH`: `CERT_FIND_FLAGS` = 262144u;
public const val `CERT_FIND_NO_CTL_USAGE_FLAG`: `CERT_FIND_FLAGS` = 8u;
public const val `CERT_FIND_NO_ENHKEY_USAGE_FLAG`: `CERT_FIND_FLAGS` = 8u;
public const val `CERT_FIND_OPTIONAL_CTL_USAGE_FLAG`: `CERT_FIND_FLAGS` = 1u;
public const val `CERT_FIND_OPTIONAL_ENHKEY_USAGE_FLAG`: `CERT_FIND_FLAGS` = 1u;
public const val `CERT_FIND_OR_CTL_USAGE_FLAG`: `CERT_FIND_FLAGS` = 16u;
public const val `CERT_FIND_OR_ENHKEY_USAGE_FLAG`: `CERT_FIND_FLAGS` = 16u;
public const val `CERT_FIND_PROPERTY`: `CERT_FIND_FLAGS` = 327680u;
public const val `CERT_FIND_PROP_ONLY_CTL_USAGE_FLAG`: `CERT_FIND_FLAGS` = 4u;
public const val `CERT_FIND_PROP_ONLY_ENHKEY_USAGE_FLAG`: `CERT_FIND_FLAGS` = 4u;
public const val `CERT_FIND_PUBKEY_MD5_HASH`: `CERT_FIND_FLAGS` = 1179648u;
public const val `CERT_FIND_PUBLIC_KEY`: `CERT_FIND_FLAGS` = 393216u;
public const val `CERT_FIND_SHA1_HASH`: `CERT_FIND_FLAGS` = 65536u;
public const val `CERT_FIND_SIGNATURE_HASH`: `CERT_FIND_FLAGS` = 917504u;
public const val `CERT_FIND_SUBJECT_ATTR`: `CERT_FIND_FLAGS` = 196615u;
public const val `CERT_FIND_SUBJECT_CERT`: `CERT_FIND_FLAGS` = 720896u;
public const val `CERT_FIND_SUBJECT_INFO_ACCESS`: `CERT_FIND_FLAGS` = 1245184u;
public const val `CERT_FIND_SUBJECT_NAME`: `CERT_FIND_FLAGS` = 131079u;
public const val `CERT_FIND_SUBJECT_STR`: `CERT_FIND_FLAGS` = 524295u;
public const val `CERT_FIND_SUBJECT_STR_A`: `CERT_FIND_FLAGS` = 458759u;
public const val `CERT_FIND_SUBJECT_STR_W`: `CERT_FIND_FLAGS` = 524295u;
public typealias `CERT_FIND_TYPE` = UInt;
public const val `CERT_FIND_VALID_CTL_USAGE_FLAG`: `CERT_FIND_FLAGS` = 32u;
public const val `CERT_FIND_VALID_ENHKEY_USAGE_FLAG`: `CERT_FIND_FLAGS` = 32u;
public const val `CERT_FIRST_RESERVED_PROP_ID`: UInt = 129u;
public const val `CERT_FIRST_USER_PROP_ID`: UInt = 32768u;
// UNSUPPORTED Rust 2420:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_FORTEZZA_DATA_PROP {
//     pub SerialNumber: [u8; 8],
//     pub CertIndex: i32,
//     pub CertLabel: [u8; 36],
// }

// UNSUPPORTED Rust 2427:1: declaration Impl has no candidate rule
// impl Default for CERT_FORTEZZA_DATA_PROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_FORTEZZA_DATA_PROP_ID`: UInt = 18u;
public const val `CERT_FRIENDLY_NAME_PROP_ID`: UInt = 11u;
// UNSUPPORTED Rust 2434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_GENERAL_SUBTREE {
//     pub Base: CERT_ALT_NAME_ENTRY,
//     pub dwMinimum: u32,
//     pub fMaximum: windows_sys::core::BOOL,
//     pub dwMaximum: u32,
// }

// UNSUPPORTED Rust 2442:1: declaration Impl has no candidate rule
// impl Default for CERT_GENERAL_SUBTREE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2447:1: non-scalar type Ptr unsupported
// pub const CERT_GROUP_POLICY_SYSTEM_STORE_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Policies\\Microsoft\\SystemCertificates");

// UNSUPPORTED Rust 2448:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_HASHED_URL {
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub Hash: CRYPT_INTEGER_BLOB,
//     pub pwszUrl: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2455:1: declaration Impl has no candidate rule
// impl Default for CERT_HASHED_URL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_HASH_PROP_ID`: UInt = 3u;
public const val `CERT_HCRYPTPROV_OR_NCRYPT_KEY_HANDLE_PROP_ID`: UInt = 79u;
public const val `CERT_HCRYPTPROV_TRANSFER_PROP_ID`: UInt = 100u;
// UNSUPPORTED Rust 2463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_ID {
//     pub dwIdChoice: CERT_ID_OPTION,
//     pub Anonymous: CERT_ID_0,
// }

// UNSUPPORTED Rust 2469:1: declaration Impl has no candidate rule
// impl Default for CERT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2474:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CERT_ID_0 {
//     pub IssuerSerialNumber: CERT_ISSUER_SERIAL_NUMBER,
//     pub KeyId: CRYPT_INTEGER_BLOB,
//     pub HashId: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 2481:1: declaration Impl has no candidate rule
// impl Default for CERT_ID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_ID_ISSUER_SERIAL_NUMBER`: `CERT_ID_OPTION` = 1u;
public const val `CERT_ID_KEY_IDENTIFIER`: `CERT_ID_OPTION` = 2u;
public typealias `CERT_ID_OPTION` = UInt;
public const val `CERT_ID_SHA1_HASH`: `CERT_ID_OPTION` = 3u;
public const val `CERT_IE30_RESERVED_PROP_ID`: UInt = 7u;
// UNSUPPORTED Rust 2491:1: non-scalar type Ptr unsupported
// pub const CERT_IE_DIRTY_FLAGS_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Cryptography\\IEDirtyFlags");

// UNSUPPORTED Rust 2492:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_INFO {
//     pub dwVersion: u32,
//     pub SerialNumber: CRYPT_INTEGER_BLOB,
//     pub SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub Issuer: CRYPT_INTEGER_BLOB,
//     pub NotBefore: super::super::Foundation::FILETIME,
//     pub NotAfter: super::super::Foundation::FILETIME,
//     pub Subject: CRYPT_INTEGER_BLOB,
//     pub SubjectPublicKeyInfo: CERT_PUBLIC_KEY_INFO,
//     pub IssuerUniqueId: CRYPT_BIT_BLOB,
//     pub SubjectUniqueId: CRYPT_BIT_BLOB,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 2508:1: declaration Impl has no candidate rule
// impl Default for CERT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_INFO_EXTENSION_FLAG`: UInt = 11u;
public const val `CERT_INFO_ISSUER_FLAG`: UInt = 4u;
public const val `CERT_INFO_ISSUER_UNIQUE_ID_FLAG`: UInt = 9u;
public const val `CERT_INFO_NOT_AFTER_FLAG`: UInt = 6u;
public const val `CERT_INFO_NOT_BEFORE_FLAG`: UInt = 5u;
public const val `CERT_INFO_SERIAL_NUMBER_FLAG`: UInt = 2u;
public const val `CERT_INFO_SIGNATURE_ALGORITHM_FLAG`: UInt = 3u;
public const val `CERT_INFO_SUBJECT_FLAG`: UInt = 7u;
public const val `CERT_INFO_SUBJECT_PUBLIC_KEY_INFO_FLAG`: UInt = 8u;
public const val `CERT_INFO_SUBJECT_UNIQUE_ID_FLAG`: UInt = 10u;
public const val `CERT_INFO_VERSION_FLAG`: UInt = 1u;
public const val `CERT_ISOLATED_KEY_PROP_ID`: UInt = 118u;
public const val `CERT_ISSUER_CHAIN_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID`: UInt = 96u;
public const val `CERT_ISSUER_CHAIN_SIGN_HASH_CNG_ALG_PROP_ID`: UInt = 95u;
public const val `CERT_ISSUER_PUBLIC_KEY_MD5_HASH_PROP_ID`: UInt = 24u;
public const val `CERT_ISSUER_PUB_KEY_BIT_LENGTH_PROP_ID`: UInt = 94u;
// UNSUPPORTED Rust 2529:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_ISSUER_SERIAL_NUMBER {
//     pub Issuer: CRYPT_INTEGER_BLOB,
//     pub SerialNumber: CRYPT_INTEGER_BLOB,
// }

public const val `CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID`: UInt = 28u;
// UNSUPPORTED Rust 2536:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_KEYGEN_REQUEST_INFO {
//     pub dwVersion: u32,
//     pub SubjectPublicKeyInfo: CERT_PUBLIC_KEY_INFO,
//     pub pwszChallengeString: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2543:1: declaration Impl has no candidate rule
// impl Default for CERT_KEYGEN_REQUEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_KEYGEN_REQUEST_V1`: UInt = 0u;
public const val `CERT_KEY_AGREEMENT_KEY_USAGE`: UInt = 8u;
// UNSUPPORTED Rust 2550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_KEY_ATTRIBUTES_INFO {
//     pub KeyId: CRYPT_INTEGER_BLOB,
//     pub IntendedKeyUsage: CRYPT_BIT_BLOB,
//     pub pPrivateKeyUsagePeriod: *mut CERT_PRIVATE_KEY_VALIDITY,
// }

// UNSUPPORTED Rust 2557:1: declaration Impl has no candidate rule
// impl Default for CERT_KEY_ATTRIBUTES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_KEY_CERT_SIGN_KEY_USAGE`: UInt = 4u;
public const val `CERT_KEY_CLASSIFICATION_PROP_ID`: UInt = 120u;
// UNSUPPORTED Rust 2564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_KEY_CONTEXT {
//     pub cbSize: u32,
//     pub Anonymous: CERT_KEY_CONTEXT_0,
//     pub dwKeySpec: u32,
// }

// UNSUPPORTED Rust 2571:1: declaration Impl has no candidate rule
// impl Default for CERT_KEY_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2576:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CERT_KEY_CONTEXT_0 {
//     pub hCryptProv: usize,
//     pub hNCryptKey: NCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 2582:1: declaration Impl has no candidate rule
// impl Default for CERT_KEY_CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_KEY_CONTEXT_PROP_ID`: UInt = 5u;
public const val `CERT_KEY_ENCIPHERMENT_KEY_USAGE`: UInt = 32u;
public const val `CERT_KEY_IDENTIFIER_PROP_ID`: UInt = 20u;
public const val `CERT_KEY_PROV_HANDLE_PROP_ID`: UInt = 1u;
public const val `CERT_KEY_PROV_INFO_PROP_ID`: UInt = 2u;
public const val `CERT_KEY_REPAIR_ATTEMPTED_PROP_ID`: UInt = 103u;
public typealias `CERT_KEY_SPEC` = UInt;
public const val `CERT_KEY_SPEC_PROP_ID`: UInt = 6u;
// UNSUPPORTED Rust 2595:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_KEY_USAGE_RESTRICTION_INFO {
//     pub cCertPolicyId: u32,
//     pub rgCertPolicyId: *mut CERT_POLICY_ID,
//     pub RestrictedKeyUsage: CRYPT_BIT_BLOB,
// }

// UNSUPPORTED Rust 2602:1: declaration Impl has no candidate rule
// impl Default for CERT_KEY_USAGE_RESTRICTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_LAST_RESERVED_PROP_ID`: UInt = 32767u;
public const val `CERT_LAST_USER_PROP_ID`: UInt = 65535u;
public const val `CERT_LDAP_STORE_AREC_EXCLUSIVE_FLAG`: UInt = 131072u;
public const val `CERT_LDAP_STORE_OPENED_FLAG`: UInt = 262144u;
// UNSUPPORTED Rust 2611:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LDAP_STORE_OPENED_PARA {
//     pub pvLdapSessionHandle: *mut core::ffi::c_void,
//     pub pwszLdapUrl: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 2617:1: declaration Impl has no candidate rule
// impl Default for CERT_LDAP_STORE_OPENED_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_LDAP_STORE_SIGN_FLAG`: UInt = 65536u;
public const val `CERT_LDAP_STORE_UNBIND_FLAG`: UInt = 524288u;
// UNSUPPORTED Rust 2624:1: non-scalar type Ptr unsupported
// pub const CERT_LOCAL_MACHINE_SYSTEM_STORE_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\SystemCertificates");

// UNSUPPORTED Rust 2625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_AUDIO {
//     pub LogotypeDetails: CERT_LOGOTYPE_DETAILS,
//     pub pLogotypeAudioInfo: *mut CERT_LOGOTYPE_AUDIO_INFO,
// }

// UNSUPPORTED Rust 2631:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_AUDIO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2636:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_AUDIO_INFO {
//     pub dwFileSize: u32,
//     pub dwPlayTime: u32,
//     pub dwChannels: u32,
//     pub dwSampleRate: u32,
//     pub pwszLanguage: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2645:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_AUDIO_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_LOGOTYPE_BITS_IMAGE_RESOLUTION_CHOICE`: `CERT_LOGOTYPE_CHOICE` = 1u;
public typealias `CERT_LOGOTYPE_CHOICE` = UInt;
public const val `CERT_LOGOTYPE_COLOR_IMAGE_INFO_CHOICE`: `CERT_LOGOTYPE_IMAGE_INFO_TYPE` = 2u;
// UNSUPPORTED Rust 2653:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_DATA {
//     pub cLogotypeImage: u32,
//     pub rgLogotypeImage: *mut CERT_LOGOTYPE_IMAGE,
//     pub cLogotypeAudio: u32,
//     pub rgLogotypeAudio: *mut CERT_LOGOTYPE_AUDIO,
// }

// UNSUPPORTED Rust 2661:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_DETAILS {
//     pub pwszMimeType: windows_sys::core::PWSTR,
//     pub cHashedUrl: u32,
//     pub rgHashedUrl: *mut CERT_HASHED_URL,
// }

// UNSUPPORTED Rust 2673:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_DETAILS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_LOGOTYPE_DIRECT_INFO_CHOICE`: `CERT_LOGOTYPE_OPTION` = 1u;
// UNSUPPORTED Rust 2679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_EXT_INFO {
//     pub cCommunityLogo: u32,
//     pub rgCommunityLogo: *mut CERT_LOGOTYPE_INFO,
//     pub pIssuerLogo: *mut CERT_LOGOTYPE_INFO,
//     pub pSubjectLogo: *mut CERT_LOGOTYPE_INFO,
//     pub cOtherLogo: u32,
//     pub rgOtherLogo: *mut CERT_OTHER_LOGOTYPE_INFO,
// }

// UNSUPPORTED Rust 2689:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_EXT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_LOGOTYPE_GRAY_SCALE_IMAGE_INFO_CHOICE`: `CERT_LOGOTYPE_IMAGE_INFO_TYPE` = 1u;
// UNSUPPORTED Rust 2695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_IMAGE {
//     pub LogotypeDetails: CERT_LOGOTYPE_DETAILS,
//     pub pLogotypeImageInfo: *mut CERT_LOGOTYPE_IMAGE_INFO,
// }

// UNSUPPORTED Rust 2701:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_IMAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2706:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_IMAGE_INFO {
//     pub dwLogotypeImageInfoChoice: CERT_LOGOTYPE_IMAGE_INFO_TYPE,
//     pub dwFileSize: u32,
//     pub dwXSize: u32,
//     pub dwYSize: u32,
//     pub dwLogotypeImageResolutionChoice: CERT_LOGOTYPE_CHOICE,
//     pub Anonymous: CERT_LOGOTYPE_IMAGE_INFO_0,
//     pub pwszLanguage: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2717:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_IMAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2722:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CERT_LOGOTYPE_IMAGE_INFO_0 {
//     pub dwNumBits: u32,
//     pub dwTableSize: u32,
// }

// UNSUPPORTED Rust 2728:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_IMAGE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_LOGOTYPE_IMAGE_INFO_TYPE` = UInt;
public const val `CERT_LOGOTYPE_INDIRECT_INFO_CHOICE`: `CERT_LOGOTYPE_OPTION` = 2u;
// UNSUPPORTED Rust 2735:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_INFO {
//     pub dwLogotypeInfoChoice: CERT_LOGOTYPE_OPTION,
//     pub Anonymous: CERT_LOGOTYPE_INFO_0,
// }

// UNSUPPORTED Rust 2741:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2746:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CERT_LOGOTYPE_INFO_0 {
//     pub pLogotypeDirectInfo: *mut CERT_LOGOTYPE_DATA,
//     pub pLogotypeIndirectInfo: *mut CERT_LOGOTYPE_REFERENCE,
// }

// UNSUPPORTED Rust 2752:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_LOGOTYPE_NO_IMAGE_RESOLUTION_CHOICE`: `CERT_LOGOTYPE_CHOICE` = 0u;
public typealias `CERT_LOGOTYPE_OPTION` = UInt;
// UNSUPPORTED Rust 2759:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_LOGOTYPE_REFERENCE {
//     pub cHashedUrl: u32,
//     pub rgHashedUrl: *mut CERT_HASHED_URL,
// }

// UNSUPPORTED Rust 2765:1: declaration Impl has no candidate rule
// impl Default for CERT_LOGOTYPE_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_LOGOTYPE_TABLE_SIZE_IMAGE_RESOLUTION_CHOICE`: `CERT_LOGOTYPE_CHOICE` = 2u;
public const val `CERT_MD5_HASH_PROP_ID`: UInt = 4u;
public const val `CERT_NAME_ATTR_TYPE`: UInt = 3u;
// UNSUPPORTED Rust 2773:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_NAME_CONSTRAINTS_INFO {
//     pub cPermittedSubtree: u32,
//     pub rgPermittedSubtree: *mut CERT_GENERAL_SUBTREE,
//     pub cExcludedSubtree: u32,
//     pub rgExcludedSubtree: *mut CERT_GENERAL_SUBTREE,
// }

// UNSUPPORTED Rust 2781:1: declaration Impl has no candidate rule
// impl Default for CERT_NAME_CONSTRAINTS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_NAME_DISABLE_IE4_UTF8_FLAG`: UInt = 65536u;
public const val `CERT_NAME_DNS_TYPE`: UInt = 6u;
public const val `CERT_NAME_EMAIL_TYPE`: UInt = 1u;
public const val `CERT_NAME_FRIENDLY_DISPLAY_TYPE`: UInt = 5u;
// UNSUPPORTED Rust 2790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_NAME_INFO {
//     pub cRDN: u32,
//     pub rgRDN: *mut CERT_RDN,
// }

// UNSUPPORTED Rust 2796:1: declaration Impl has no candidate rule
// impl Default for CERT_NAME_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_NAME_ISSUER_FLAG`: UInt = 1u;
public const val `CERT_NAME_RDN_TYPE`: UInt = 2u;
public const val `CERT_NAME_SEARCH_ALL_NAMES_FLAG`: UInt = 2u;
public const val `CERT_NAME_SIMPLE_DISPLAY_TYPE`: UInt = 4u;
public const val `CERT_NAME_STR_COMMA_FLAG`: UInt = 67108864u;
public const val `CERT_NAME_STR_CRLF_FLAG`: UInt = 134217728u;
public const val `CERT_NAME_STR_DISABLE_IE4_UTF8_FLAG`: UInt = 65536u;
public const val `CERT_NAME_STR_DISABLE_UTF8_DIR_STR_FLAG`: UInt = 1048576u;
public const val `CERT_NAME_STR_ENABLE_PUNYCODE_FLAG`: UInt = 2097152u;
public const val `CERT_NAME_STR_ENABLE_T61_UNICODE_FLAG`: UInt = 131072u;
public const val `CERT_NAME_STR_ENABLE_UTF8_UNICODE_FLAG`: UInt = 262144u;
public const val `CERT_NAME_STR_FORCE_UTF8_DIR_STR_FLAG`: UInt = 524288u;
public const val `CERT_NAME_STR_FORWARD_FLAG`: UInt = 16777216u;
public const val `CERT_NAME_STR_NO_PLUS_FLAG`: UInt = 536870912u;
public const val `CERT_NAME_STR_NO_QUOTING_FLAG`: UInt = 268435456u;
public const val `CERT_NAME_STR_REVERSE_FLAG`: UInt = 33554432u;
public const val `CERT_NAME_STR_SEMICOLON_FLAG`: UInt = 1073741824u;
public const val `CERT_NAME_UPN_TYPE`: UInt = 8u;
public const val `CERT_NAME_URL_TYPE`: UInt = 7u;
// UNSUPPORTED Rust 2820:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_NAME_VALUE {
//     pub dwValueType: u32,
//     pub Value: CRYPT_INTEGER_BLOB,
// }

public const val `CERT_NCRYPT_KEY_HANDLE_PROP_ID`: UInt = 78u;
public const val `CERT_NCRYPT_KEY_HANDLE_TRANSFER_PROP_ID`: UInt = 99u;
public const val `CERT_NCRYPT_KEY_SPEC`: `CERT_KEY_SPEC` = 4294967295u;
public const val `CERT_NEW_KEY_PROP_ID`: UInt = 74u;
public const val `CERT_NEXT_UPDATE_LOCATION_PROP_ID`: UInt = 10u;
public const val `CERT_NONCOMPLIANT_ROOT_URL_PROP_ID`: UInt = 123u;
public const val `CERT_NON_REPUDIATION_KEY_USAGE`: UInt = 64u;
public const val `CERT_NOT_BEFORE_ENHKEY_USAGE_PROP_ID`: UInt = 127u;
public const val `CERT_NOT_BEFORE_FILETIME_PROP_ID`: UInt = 126u;
public const val `CERT_NO_AUTO_EXPIRE_CHECK_PROP_ID`: UInt = 77u;
public const val `CERT_NO_EXPIRE_NOTIFICATION_PROP_ID`: UInt = 97u;
// UNSUPPORTED Rust 2837:1: non-scalar type Ptr unsupported
// pub const CERT_OCM_SUBCOMPONENTS_LOCAL_MACHINE_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Setup\\OC Manager\\Subcomponents");

// UNSUPPORTED Rust 2838:1: non-scalar type Ptr unsupported
// pub const CERT_OCM_SUBCOMPONENTS_ROOT_AUTO_UPDATE_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RootAutoUpdate");

public const val `CERT_OCSP_CACHE_PREFIX_PROP_ID`: UInt = 75u;
public const val `CERT_OCSP_MUST_STAPLE_PROP_ID`: UInt = 121u;
public const val `CERT_OCSP_RESPONSE_PROP_ID`: UInt = 70u;
public const val `CERT_OFFLINE_CRL_SIGN_KEY_USAGE`: UInt = 2u;
public const val `CERT_OID_NAME_STR`: `CERT_STRING_TYPE` = 2u;
public typealias `CERT_OPEN_STORE_FLAGS` = UInt;
// UNSUPPORTED Rust 2845:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_OR_CRL_BLOB {
//     pub dwChoice: u32,
//     pub cbEncoded: u32,
//     pub pbEncoded: *mut u8,
// }

// UNSUPPORTED Rust 2852:1: declaration Impl has no candidate rule
// impl Default for CERT_OR_CRL_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2857:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_OR_CRL_BUNDLE {
//     pub cItem: u32,
//     pub rgItem: *mut CERT_OR_CRL_BLOB,
// }

// UNSUPPORTED Rust 2863:1: declaration Impl has no candidate rule
// impl Default for CERT_OR_CRL_BUNDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2868:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_OTHER_LOGOTYPE_INFO {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub LogotypeInfo: CERT_LOGOTYPE_INFO,
// }

// UNSUPPORTED Rust 2874:1: declaration Impl has no candidate rule
// impl Default for CERT_OTHER_LOGOTYPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_OTHER_NAME {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub Value: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 2885:1: declaration Impl has no candidate rule
// impl Default for CERT_OTHER_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2890:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_PAIR {
//     pub Forward: CRYPT_INTEGER_BLOB,
//     pub Reverse: CRYPT_INTEGER_BLOB,
// }

public const val `CERT_PHYSICAL_STORE_ADD_ENABLE_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 2897:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_AUTH_ROOT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".AuthRoot");

// UNSUPPORTED Rust 2898:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_DEFAULT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".Default");

// UNSUPPORTED Rust 2899:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_DS_USER_CERTIFICATE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".UserCertificate");

// UNSUPPORTED Rust 2900:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_ENTERPRISE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".Enterprise");

// UNSUPPORTED Rust 2901:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_GROUP_POLICY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".GroupPolicy");

// UNSUPPORTED Rust 2902:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_PHYSICAL_STORE_INFO {
//     pub cbSize: u32,
//     pub pszOpenStoreProvider: windows_sys::core::PSTR,
//     pub dwOpenEncodingType: u32,
//     pub dwOpenFlags: u32,
//     pub OpenParameters: CRYPT_INTEGER_BLOB,
//     pub dwFlags: u32,
//     pub dwPriority: u32,
// }

// UNSUPPORTED Rust 2913:1: declaration Impl has no candidate rule
// impl Default for CERT_PHYSICAL_STORE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_PHYSICAL_STORE_INSERT_COMPUTER_NAME_ENABLE_FLAG`: UInt = 8u;
// UNSUPPORTED Rust 2919:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_LOCAL_MACHINE_GROUP_POLICY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".LocalMachineGroupPolicy");

// UNSUPPORTED Rust 2920:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_LOCAL_MACHINE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".LocalMachine");

public const val `CERT_PHYSICAL_STORE_OPEN_DISABLE_FLAG`: UInt = 2u;
public const val `CERT_PHYSICAL_STORE_PREDEFINED_ENUM_FLAG`: UInt = 1u;
public const val `CERT_PHYSICAL_STORE_REMOTE_OPEN_DISABLE_FLAG`: UInt = 4u;
// UNSUPPORTED Rust 2924:1: non-scalar type Ptr unsupported
// pub const CERT_PHYSICAL_STORE_SMART_CARD_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!(".SmartCard");

// UNSUPPORTED Rust 2925:1: non-scalar type Ptr unsupported
// pub const CERT_PIN_RULES_AUTO_UPDATE_ENCODED_CTL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PinRulesEncodedCtl");

// UNSUPPORTED Rust 2926:1: non-scalar type Ptr unsupported
// pub const CERT_PIN_RULES_AUTO_UPDATE_LAST_SYNC_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PinRulesLastSyncTime");

// UNSUPPORTED Rust 2927:1: non-scalar type Ptr unsupported
// pub const CERT_PIN_RULES_AUTO_UPDATE_LIST_IDENTIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("PinRules_AutoUpdate_1");

// UNSUPPORTED Rust 2928:1: non-scalar type Ptr unsupported
// pub const CERT_PIN_RULES_AUTO_UPDATE_SYNC_DELTA_TIME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PinRulesSyncDeltaTime");

// UNSUPPORTED Rust 2929:1: non-scalar type Ptr unsupported
// pub const CERT_PIN_RULES_CAB_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("pinrulesstl.cab");

// UNSUPPORTED Rust 2930:1: non-scalar type Ptr unsupported
// pub const CERT_PIN_RULES_CTL_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("pinrules.stl");

// UNSUPPORTED Rust 2931:1: non-scalar type Ptr unsupported
// pub const CERT_PIN_RULES_CTL_FILENAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("pinrules.stl");

public const val `CERT_PIN_SHA256_HASH_PROP_ID`: UInt = 124u;
// UNSUPPORTED Rust 2933:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICIES_INFO {
//     pub cPolicyInfo: u32,
//     pub rgPolicyInfo: *mut CERT_POLICY_INFO,
// }

// UNSUPPORTED Rust 2939:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICIES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2944:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY95_QUALIFIER1 {
//     pub pszPracticesReference: windows_sys::core::PWSTR,
//     pub pszNoticeIdentifier: windows_sys::core::PSTR,
//     pub pszNSINoticeIdentifier: windows_sys::core::PSTR,
//     pub cCPSURLs: u32,
//     pub rgCPSURLs: *mut CPS_URLS,
// }

// UNSUPPORTED Rust 2953:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY95_QUALIFIER1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_POLICY_CONSTRAINTS_INFO {
//     pub fRequireExplicitPolicy: windows_sys::core::BOOL,
//     pub dwRequireExplicitPolicySkipCerts: u32,
//     pub fInhibitPolicyMapping: windows_sys::core::BOOL,
//     pub dwInhibitPolicyMappingSkipCerts: u32,
// }

// UNSUPPORTED Rust 2966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY_ID {
//     pub cCertPolicyElementId: u32,
//     pub rgpszCertPolicyElementId: *mut windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2972:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2977:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY_INFO {
//     pub pszPolicyIdentifier: windows_sys::core::PSTR,
//     pub cPolicyQualifier: u32,
//     pub rgPolicyQualifier: *mut CERT_POLICY_QUALIFIER_INFO,
// }

// UNSUPPORTED Rust 2984:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2989:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY_MAPPING {
//     pub pszIssuerDomainPolicy: windows_sys::core::PSTR,
//     pub pszSubjectDomainPolicy: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2995:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY_MAPPING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY_MAPPINGS_INFO {
//     pub cPolicyMapping: u32,
//     pub rgPolicyMapping: *mut CERT_POLICY_MAPPING,
// }

// UNSUPPORTED Rust 3006:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY_MAPPINGS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3011:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY_QUALIFIER_INFO {
//     pub pszPolicyQualifierId: windows_sys::core::PSTR,
//     pub Qualifier: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 3017:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY_QUALIFIER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3022:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY_QUALIFIER_NOTICE_REFERENCE {
//     pub pszOrganization: windows_sys::core::PSTR,
//     pub cNoticeNumbers: u32,
//     pub rgNoticeNumbers: *mut i32,
// }

// UNSUPPORTED Rust 3029:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY_QUALIFIER_NOTICE_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3034:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_POLICY_QUALIFIER_USER_NOTICE {
//     pub pNoticeReference: *mut CERT_POLICY_QUALIFIER_NOTICE_REFERENCE,
//     pub pszDisplayText: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3040:1: declaration Impl has no candidate rule
// impl Default for CERT_POLICY_QUALIFIER_USER_NOTICE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3045:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_PRIVATE_KEY_VALIDITY {
//     pub NotBefore: super::super::Foundation::FILETIME,
//     pub NotAfter: super::super::Foundation::FILETIME,
// }

public const val `CERT_PROT_ROOT_DISABLE_CURRENT_USER_FLAG`: UInt = 1u;
public const val `CERT_PROT_ROOT_DISABLE_LM_AUTH_FLAG`: UInt = 8u;
public const val `CERT_PROT_ROOT_DISABLE_NOT_DEFINED_NAME_CONSTRAINT_FLAG`: UInt = 32u;
public const val `CERT_PROT_ROOT_DISABLE_NT_AUTH_REQUIRED_FLAG`: UInt = 16u;
public const val `CERT_PROT_ROOT_DISABLE_PEER_TRUST`: UInt = 65536u;
// UNSUPPORTED Rust 3056:1: non-scalar type Ptr unsupported
// pub const CERT_PROT_ROOT_FLAGS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

public const val `CERT_PROT_ROOT_INHIBIT_ADD_AT_INIT_FLAG`: UInt = 2u;
public const val `CERT_PROT_ROOT_INHIBIT_PURGE_LM_FLAG`: UInt = 4u;
public const val `CERT_PROT_ROOT_ONLY_LM_GPT_FLAG`: UInt = 8u;
// UNSUPPORTED Rust 3060:1: non-scalar type Ptr unsupported
// pub const CERT_PROT_ROOT_PEER_USAGES_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerUsages");

// UNSUPPORTED Rust 3061:1: non-scalar type Ptr unsupported
// pub const CERT_PROT_ROOT_PEER_USAGES_VALUE_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("PeerUsages");

public const val `CERT_PUBKEY_ALG_PARA_PROP_ID`: UInt = 22u;
public const val `CERT_PUBKEY_HASH_RESERVED_PROP_ID`: UInt = 8u;
// UNSUPPORTED Rust 3064:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_PUBLIC_KEY_INFO {
//     pub Algorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub PublicKey: CRYPT_BIT_BLOB,
// }

public const val `CERT_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID`: UInt = 93u;
public const val `CERT_PVK_FILE_PROP_ID`: UInt = 12u;
// UNSUPPORTED Rust 3072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_QC_STATEMENT {
//     pub pszStatementId: windows_sys::core::PSTR,
//     pub StatementInfo: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 3078:1: declaration Impl has no candidate rule
// impl Default for CERT_QC_STATEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3083:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_QC_STATEMENTS_EXT_INFO {
//     pub cStatement: u32,
//     pub rgStatement: *mut CERT_QC_STATEMENT,
// }

// UNSUPPORTED Rust 3089:1: declaration Impl has no candidate rule
// impl Default for CERT_QC_STATEMENTS_EXT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_QUERY_CONTENT_CERT`: `CERT_QUERY_CONTENT_TYPE` = 1u;
public const val `CERT_QUERY_CONTENT_CERT_PAIR`: `CERT_QUERY_CONTENT_TYPE` = 13u;
public const val `CERT_QUERY_CONTENT_CRL`: `CERT_QUERY_CONTENT_TYPE` = 3u;
public const val `CERT_QUERY_CONTENT_CTL`: `CERT_QUERY_CONTENT_TYPE` = 2u;
public const val `CERT_QUERY_CONTENT_FLAG_ALL`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 16382u;
public const val `CERT_QUERY_CONTENT_FLAG_ALL_ISSUER_CERT`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 818u;
public const val `CERT_QUERY_CONTENT_FLAG_CERT`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 2u;
public const val `CERT_QUERY_CONTENT_FLAG_CERT_PAIR`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 8192u;
public const val `CERT_QUERY_CONTENT_FLAG_CRL`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 8u;
public const val `CERT_QUERY_CONTENT_FLAG_CTL`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 4u;
public const val `CERT_QUERY_CONTENT_FLAG_PFX`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 4096u;
public const val `CERT_QUERY_CONTENT_FLAG_PFX_AND_LOAD`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 16384u;
public const val `CERT_QUERY_CONTENT_FLAG_PKCS10`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 2048u;
public const val `CERT_QUERY_CONTENT_FLAG_PKCS7_SIGNED`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 256u;
public const val `CERT_QUERY_CONTENT_FLAG_PKCS7_SIGNED_EMBED`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 1024u;
public const val `CERT_QUERY_CONTENT_FLAG_PKCS7_UNSIGNED`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 512u;
public const val `CERT_QUERY_CONTENT_FLAG_SERIALIZED_CERT`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 32u;
public const val `CERT_QUERY_CONTENT_FLAG_SERIALIZED_CRL`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 128u;
public const val `CERT_QUERY_CONTENT_FLAG_SERIALIZED_CTL`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 64u;
public const val `CERT_QUERY_CONTENT_FLAG_SERIALIZED_STORE`: `CERT_QUERY_CONTENT_TYPE_FLAGS` = 16u;
public const val `CERT_QUERY_CONTENT_PFX`: `CERT_QUERY_CONTENT_TYPE` = 12u;
public const val `CERT_QUERY_CONTENT_PFX_AND_LOAD`: `CERT_QUERY_CONTENT_TYPE` = 14u;
public const val `CERT_QUERY_CONTENT_PKCS10`: `CERT_QUERY_CONTENT_TYPE` = 11u;
public const val `CERT_QUERY_CONTENT_PKCS7_SIGNED`: `CERT_QUERY_CONTENT_TYPE` = 8u;
public const val `CERT_QUERY_CONTENT_PKCS7_SIGNED_EMBED`: `CERT_QUERY_CONTENT_TYPE` = 10u;
public const val `CERT_QUERY_CONTENT_PKCS7_UNSIGNED`: `CERT_QUERY_CONTENT_TYPE` = 9u;
public const val `CERT_QUERY_CONTENT_SERIALIZED_CERT`: `CERT_QUERY_CONTENT_TYPE` = 5u;
public const val `CERT_QUERY_CONTENT_SERIALIZED_CRL`: `CERT_QUERY_CONTENT_TYPE` = 7u;
public const val `CERT_QUERY_CONTENT_SERIALIZED_CTL`: `CERT_QUERY_CONTENT_TYPE` = 6u;
public const val `CERT_QUERY_CONTENT_SERIALIZED_STORE`: `CERT_QUERY_CONTENT_TYPE` = 4u;
public typealias `CERT_QUERY_CONTENT_TYPE` = UInt;
public typealias `CERT_QUERY_CONTENT_TYPE_FLAGS` = UInt;
public typealias `CERT_QUERY_ENCODING_TYPE` = UInt;
public const val `CERT_QUERY_FORMAT_ASN_ASCII_HEX_ENCODED`: `CERT_QUERY_FORMAT_TYPE` = 3u;
public const val `CERT_QUERY_FORMAT_BASE64_ENCODED`: `CERT_QUERY_FORMAT_TYPE` = 2u;
public const val `CERT_QUERY_FORMAT_BINARY`: `CERT_QUERY_FORMAT_TYPE` = 1u;
public const val `CERT_QUERY_FORMAT_FLAG_ALL`: `CERT_QUERY_FORMAT_TYPE_FLAGS` = 14u;
public const val `CERT_QUERY_FORMAT_FLAG_ASN_ASCII_HEX_ENCODED`: `CERT_QUERY_FORMAT_TYPE_FLAGS` = 8u;
public const val `CERT_QUERY_FORMAT_FLAG_BASE64_ENCODED`: `CERT_QUERY_FORMAT_TYPE_FLAGS` = 4u;
public const val `CERT_QUERY_FORMAT_FLAG_BINARY`: `CERT_QUERY_FORMAT_TYPE_FLAGS` = 2u;
public typealias `CERT_QUERY_FORMAT_TYPE` = UInt;
public typealias `CERT_QUERY_FORMAT_TYPE_FLAGS` = UInt;
public const val `CERT_QUERY_OBJECT_BLOB`: `CERT_QUERY_OBJECT_TYPE` = 2u;
public const val `CERT_QUERY_OBJECT_FILE`: `CERT_QUERY_OBJECT_TYPE` = 1u;
public typealias `CERT_QUERY_OBJECT_TYPE` = UInt;
// UNSUPPORTED Rust 3139:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_RDN {
//     pub cRDNAttr: u32,
//     pub rgRDNAttr: *mut CERT_RDN_ATTR,
// }

// UNSUPPORTED Rust 3145:1: declaration Impl has no candidate rule
// impl Default for CERT_RDN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_RDN_ANY_TYPE`: `CERT_RDN_ATTR_VALUE_TYPE` = 0;
// UNSUPPORTED Rust 3151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_RDN_ATTR {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub dwValueType: u32,
//     pub Value: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 3158:1: declaration Impl has no candidate rule
// impl Default for CERT_RDN_ATTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_RDN_ATTR_VALUE_TYPE` = Int;
public const val `CERT_RDN_BMP_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 12;
public const val `CERT_RDN_DISABLE_CHECK_TYPE_FLAG`: UInt = 1073741824u;
public const val `CERT_RDN_DISABLE_IE4_UTF8_FLAG`: UInt = 16777216u;
public const val `CERT_RDN_ENABLE_PUNYCODE_FLAG`: UInt = 33554432u;
public const val `CERT_RDN_ENABLE_T61_UNICODE_FLAG`: UInt = 2147483648u;
public const val `CERT_RDN_ENABLE_UTF8_UNICODE_FLAG`: UInt = 536870912u;
public const val `CERT_RDN_ENCODED_BLOB`: `CERT_RDN_ATTR_VALUE_TYPE` = 1;
public const val `CERT_RDN_FLAGS_MASK`: UInt = 4278190080u;
public const val `CERT_RDN_FORCE_UTF8_UNICODE_FLAG`: UInt = 268435456u;
public const val `CERT_RDN_GENERAL_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 10;
public const val `CERT_RDN_GRAPHIC_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 8;
public const val `CERT_RDN_IA5_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 7;
public const val `CERT_RDN_INT4_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 11;
public const val `CERT_RDN_ISO646_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 9;
public const val `CERT_RDN_NUMERIC_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 3;
public const val `CERT_RDN_OCTET_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 2;
public const val `CERT_RDN_PRINTABLE_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 4;
public const val `CERT_RDN_T61_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 5;
public const val `CERT_RDN_TELETEX_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 5;
public const val `CERT_RDN_TYPE_MASK`: UInt = 255u;
public const val `CERT_RDN_UNICODE_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 12;
public const val `CERT_RDN_UNIVERSAL_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 11;
public const val `CERT_RDN_UTF8_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 13;
public const val `CERT_RDN_VIDEOTEX_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 6;
public const val `CERT_RDN_VISIBLE_STRING`: `CERT_RDN_ATTR_VALUE_TYPE` = 9;
public const val `CERT_REGISTRY_STORE_CLIENT_GPT_FLAG`: UInt = 2147483648u;
// UNSUPPORTED Rust 3190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub struct CERT_REGISTRY_STORE_CLIENT_GPT_PARA {
//     pub hKeyBase: super::super::System::Registry::HKEY,
//     pub pwszRegPath: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3197:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for CERT_REGISTRY_STORE_CLIENT_GPT_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_REGISTRY_STORE_EXTERNAL_FLAG`: UInt = 1048576u;
public const val `CERT_REGISTRY_STORE_LM_GPT_FLAG`: UInt = 16777216u;
public const val `CERT_REGISTRY_STORE_MY_IE_DIRTY_FLAG`: UInt = 524288u;
public const val `CERT_REGISTRY_STORE_REMOTE_FLAG`: UInt = 65536u;
public const val `CERT_REGISTRY_STORE_ROAMING_FLAG`: UInt = 262144u;
// UNSUPPORTED Rust 3208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub struct CERT_REGISTRY_STORE_ROAMING_PARA {
//     pub hKey: super::super::System::Registry::HKEY,
//     pub pwszStoreDirectory: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3215:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for CERT_REGISTRY_STORE_ROAMING_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_REGISTRY_STORE_SERIALIZED_FLAG`: UInt = 131072u;
public const val `CERT_RENEWAL_PROP_ID`: UInt = 64u;
// UNSUPPORTED Rust 3223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_REQUEST_INFO {
//     pub dwVersion: u32,
//     pub Subject: CRYPT_INTEGER_BLOB,
//     pub SubjectPublicKeyInfo: CERT_PUBLIC_KEY_INFO,
//     pub cAttribute: u32,
//     pub rgAttribute: *mut CRYPT_ATTRIBUTE,
// }

// UNSUPPORTED Rust 3232:1: declaration Impl has no candidate rule
// impl Default for CERT_REQUEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_REQUEST_ORIGINATOR_PROP_ID`: UInt = 71u;
public const val `CERT_REQUEST_V1`: UInt = 0u;
// UNSUPPORTED Rust 3239:1: non-scalar type Ptr unsupported
// pub const CERT_RETRIEVE_BIOMETRIC_PREDEFINED_BASE_TYPE: windows_sys::core::PCSTR = 1000i32 as _;

// UNSUPPORTED Rust 3240:1: non-scalar type Ptr unsupported
// pub const CERT_RETRIEVE_COMMUNITY_LOGO: windows_sys::core::PCSTR = 3i32 as _;

// UNSUPPORTED Rust 3241:1: non-scalar type Ptr unsupported
// pub const CERT_RETRIEVE_ISSUER_LOGO: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 3242:1: non-scalar type Ptr unsupported
// pub const CERT_RETRIEVE_SUBJECT_LOGO: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 3243:1: non-scalar type Ptr unsupported
// pub const CERT_RETR_BEHAVIOR_FILE_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AllowFileUrlScheme");

// UNSUPPORTED Rust 3244:1: non-scalar type Ptr unsupported
// pub const CERT_RETR_BEHAVIOR_INET_AUTH_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableInetUnknownAuth");

// UNSUPPORTED Rust 3245:1: non-scalar type Ptr unsupported
// pub const CERT_RETR_BEHAVIOR_INET_STATUS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableInetLocal");

// UNSUPPORTED Rust 3246:1: non-scalar type Ptr unsupported
// pub const CERT_RETR_BEHAVIOR_LDAP_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableLDAPSignAndEncrypt");

// UNSUPPORTED Rust 3247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_REVOCATION_CHAIN_PARA {
//     pub cbSize: u32,
//     pub hChainEngine: HCERTCHAINENGINE,
//     pub hAdditionalStore: HCERTSTORE,
//     pub dwChainFlags: u32,
//     pub dwUrlRetrievalTimeout: u32,
//     pub pftCurrentTime: *mut super::super::Foundation::FILETIME,
//     pub pftCacheResync: *mut super::super::Foundation::FILETIME,
//     pub cbMaxUrlRetrievalByteCount: u32,
// }

// UNSUPPORTED Rust 3259:1: declaration Impl has no candidate rule
// impl Default for CERT_REVOCATION_CHAIN_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_REVOCATION_CRL_INFO {
//     pub cbSize: u32,
//     pub pBaseCrlContext: *mut CRL_CONTEXT,
//     pub pDeltaCrlContext: *mut CRL_CONTEXT,
//     pub pCrlEntry: *mut CRL_ENTRY,
//     pub fDeltaCrlEntry: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3273:1: declaration Impl has no candidate rule
// impl Default for CERT_REVOCATION_CRL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_REVOCATION_INFO {
//     pub cbSize: u32,
//     pub dwRevocationResult: u32,
//     pub pszRevocationOid: windows_sys::core::PCSTR,
//     pub pvOidSpecificInfo: *mut core::ffi::c_void,
//     pub fHasFreshnessTime: windows_sys::core::BOOL,
//     pub dwFreshnessTime: u32,
//     pub pCrlInfo: *mut CERT_REVOCATION_CRL_INFO,
// }

// UNSUPPORTED Rust 3289:1: declaration Impl has no candidate rule
// impl Default for CERT_REVOCATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_REVOCATION_PARA {
//     pub cbSize: u32,
//     pub pIssuerCert: *const CERT_CONTEXT,
//     pub cCertStore: u32,
//     pub rgCertStore: *mut HCERTSTORE,
//     pub hCrlStore: HCERTSTORE,
//     pub pftTimeToUse: *mut super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 3304:1: declaration Impl has no candidate rule
// impl Default for CERT_REVOCATION_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3309:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_REVOCATION_STATUS {
//     pub cbSize: u32,
//     pub dwIndex: u32,
//     pub dwError: u32,
//     pub dwReason: CERT_REVOCATION_STATUS_REASON,
//     pub fHasFreshnessTime: windows_sys::core::BOOL,
//     pub dwFreshnessTime: u32,
// }

public typealias `CERT_REVOCATION_STATUS_REASON` = UInt;
public const val `CERT_ROOT_PROGRAM_CERT_POLICIES_PROP_ID`: UInt = 83u;
public const val `CERT_ROOT_PROGRAM_CHAIN_POLICIES_PROP_ID`: UInt = 105u;
public typealias `CERT_ROOT_PROGRAM_FLAGS` = UInt;
public const val `CERT_ROOT_PROGRAM_FLAG_ADDRESS`: UInt = 8u;
public const val `CERT_ROOT_PROGRAM_FLAG_LSC`: `CERT_ROOT_PROGRAM_FLAGS` = 64u;
public const val `CERT_ROOT_PROGRAM_FLAG_ORG`: `CERT_ROOT_PROGRAM_FLAGS` = 128u;
public const val `CERT_ROOT_PROGRAM_FLAG_OU`: UInt = 16u;
public const val `CERT_ROOT_PROGRAM_FLAG_SUBJECT_LOGO`: `CERT_ROOT_PROGRAM_FLAGS` = 32u;
public const val `CERT_ROOT_PROGRAM_NAME_CONSTRAINTS_PROP_ID`: UInt = 84u;
// UNSUPPORTED Rust 3329:1: non-scalar type Ptr unsupported
// pub const CERT_RSA_PUBLIC_KEY_OBJID: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.113549.1.1.1");

public const val `CERT_SCARD_PIN_ID_PROP_ID`: UInt = 90u;
public const val `CERT_SCARD_PIN_INFO_PROP_ID`: UInt = 91u;
public const val `CERT_SCEP_CA_CERT_PROP_ID`: UInt = 111u;
public const val `CERT_SCEP_ENCRYPT_HASH_CNG_ALG_PROP_ID`: UInt = 114u;
public const val `CERT_SCEP_FLAGS_PROP_ID`: UInt = 115u;
public const val `CERT_SCEP_GUID_PROP_ID`: UInt = 116u;
public const val `CERT_SCEP_NONCE_PROP_ID`: UInt = 113u;
public const val `CERT_SCEP_RA_ENCRYPTION_CERT_PROP_ID`: UInt = 110u;
public const val `CERT_SCEP_RA_SIGNATURE_CERT_PROP_ID`: UInt = 109u;
public const val `CERT_SCEP_SERVER_CERTS_PROP_ID`: UInt = 108u;
public const val `CERT_SCEP_SIGNER_CERT_PROP_ID`: UInt = 112u;
public const val `CERT_SELECT_ALLOW_DUPLICATES`: UInt = 128u;
public const val `CERT_SELECT_ALLOW_EXPIRED`: UInt = 1u;
public const val `CERT_SELECT_BY_ENHKEY_USAGE`: `CERT_SELECT_CRITERIA_TYPE` = 1u;
public const val `CERT_SELECT_BY_EXTENSION`: `CERT_SELECT_CRITERIA_TYPE` = 5u;
public const val `CERT_SELECT_BY_FRIENDLYNAME`: UInt = 13u;
public const val `CERT_SELECT_BY_ISSUER_ATTR`: `CERT_SELECT_CRITERIA_TYPE` = 7u;
public const val `CERT_SELECT_BY_ISSUER_DISPLAYNAME`: UInt = 12u;
public const val `CERT_SELECT_BY_ISSUER_NAME`: `CERT_SELECT_CRITERIA_TYPE` = 9u;
public const val `CERT_SELECT_BY_KEY_USAGE`: `CERT_SELECT_CRITERIA_TYPE` = 2u;
public const val `CERT_SELECT_BY_POLICY_OID`: `CERT_SELECT_CRITERIA_TYPE` = 3u;
public const val `CERT_SELECT_BY_PROV_NAME`: `CERT_SELECT_CRITERIA_TYPE` = 4u;
public const val `CERT_SELECT_BY_PUBLIC_KEY`: `CERT_SELECT_CRITERIA_TYPE` = 10u;
public const val `CERT_SELECT_BY_SUBJECT_ATTR`: `CERT_SELECT_CRITERIA_TYPE` = 8u;
public const val `CERT_SELECT_BY_SUBJECT_HOST_NAME`: `CERT_SELECT_CRITERIA_TYPE` = 6u;
public const val `CERT_SELECT_BY_THUMBPRINT`: UInt = 14u;
public const val `CERT_SELECT_BY_TLS_SIGNATURES`: `CERT_SELECT_CRITERIA_TYPE` = 11u;
// UNSUPPORTED Rust 3357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SELECT_CHAIN_PARA {
//     pub hChainEngine: HCERTCHAINENGINE,
//     pub pTime: *mut super::super::Foundation::FILETIME,
//     pub hAdditionalStore: HCERTSTORE,
//     pub pChainPara: *mut CERT_CHAIN_PARA,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 3366:1: declaration Impl has no candidate rule
// impl Default for CERT_SELECT_CHAIN_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3371:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SELECT_CRITERIA {
//     pub dwType: CERT_SELECT_CRITERIA_TYPE,
//     pub cPara: u32,
//     pub ppPara: *mut *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3378:1: declaration Impl has no candidate rule
// impl Default for CERT_SELECT_CRITERIA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_SELECT_CRITERIA_TYPE` = UInt;
public const val `CERT_SELECT_DISALLOW_SELFSIGNED`: UInt = 4u;
public const val `CERT_SELECT_HARDWARE_ONLY`: UInt = 64u;
public const val `CERT_SELECT_HAS_KEY_FOR_KEY_EXCHANGE`: UInt = 32u;
public const val `CERT_SELECT_HAS_KEY_FOR_SIGNATURE`: UInt = 16u;
public const val `CERT_SELECT_HAS_PRIVATE_KEY`: UInt = 8u;
public const val `CERT_SELECT_IGNORE_AUTOSELECT`: UInt = 256u;
public const val `CERT_SELECT_MAX_PARA`: UInt = 500u;
public const val `CERT_SELECT_TRUSTED_ROOT`: UInt = 2u;
public const val `CERT_SEND_AS_TRUSTED_ISSUER_PROP_ID`: UInt = 102u;
public const val `CERT_SERIALIZABLE_KEY_CONTEXT_PROP_ID`: UInt = 117u;
public const val `CERT_SERIAL_CHAIN_PROP_ID`: UInt = 119u;
public const val `CERT_SERVER_OCSP_RESPONSE_ASYNC_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 3396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SERVER_OCSP_RESPONSE_CONTEXT {
//     pub cbSize: u32,
//     pub pbEncodedOcspResponse: *mut u8,
//     pub cbEncodedOcspResponse: u32,
// }

// UNSUPPORTED Rust 3403:1: declaration Impl has no candidate rule
// impl Default for CERT_SERVER_OCSP_RESPONSE_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3408:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SERVER_OCSP_RESPONSE_OPEN_PARA {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub pcbUsedSize: *mut u32,
//     pub pwszOcspDirectory: windows_sys::core::PWSTR,
//     pub pfnUpdateCallback: PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK,
//     pub pvUpdateCallbackArg: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3418:1: declaration Impl has no candidate rule
// impl Default for CERT_SERVER_OCSP_RESPONSE_OPEN_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_SERVER_OCSP_RESPONSE_OPEN_PARA_READ_FLAG`: UInt = 1u;
public const val `CERT_SERVER_OCSP_RESPONSE_OPEN_PARA_WRITE_FLAG`: UInt = 2u;
public const val `CERT_SET_KEY_CONTEXT_PROP_ID`: `CRYPT_KEY_FLAGS` = 1u;
public const val `CERT_SET_KEY_PROV_HANDLE_PROP_ID`: `CRYPT_KEY_FLAGS` = 1u;
public const val `CERT_SET_PROPERTY_IGNORE_PERSIST_ERROR_FLAG`: UInt = 2147483648u;
public const val `CERT_SET_PROPERTY_INHIBIT_PERSIST_FLAG`: UInt = 1073741824u;
public const val `CERT_SHA1_HASH_PROP_ID`: UInt = 3u;
public const val `CERT_SHA256_HASH_PROP_ID`: UInt = 107u;
public const val `CERT_SIGNATURE_HASH_PROP_ID`: UInt = 15u;
// UNSUPPORTED Rust 3432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_SIGNED_CONTENT_INFO {
//     pub ToBeSigned: CRYPT_INTEGER_BLOB,
//     pub SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub Signature: CRYPT_BIT_BLOB,
// }

public const val `CERT_SIGN_HASH_CNG_ALG_PROP_ID`: UInt = 89u;
// UNSUPPORTED Rust 3440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_SIMPLE_CHAIN {
//     pub cbSize: u32,
//     pub TrustStatus: CERT_TRUST_STATUS,
//     pub cElement: u32,
//     pub rgpElement: *mut *mut CERT_CHAIN_ELEMENT,
//     pub pTrustListInfo: *mut CERT_TRUST_LIST_INFO,
//     pub fHasRevocationFreshnessTime: windows_sys::core::BOOL,
//     pub dwRevocationFreshnessTime: u32,
// }

// UNSUPPORTED Rust 3451:1: declaration Impl has no candidate rule
// impl Default for CERT_SIMPLE_CHAIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_SIMPLE_NAME_STR`: `CERT_STRING_TYPE` = 1u;
public const val `CERT_SMART_CARD_DATA_PROP_ID`: UInt = 16u;
public const val `CERT_SMART_CARD_READER_NON_REMOVABLE_PROP_ID`: UInt = 106u;
public const val `CERT_SMART_CARD_READER_PROP_ID`: UInt = 101u;
public const val `CERT_SMART_CARD_ROOT_INFO_PROP_ID`: UInt = 76u;
public const val `CERT_SOURCE_LOCATION_PROP_ID`: UInt = 72u;
public const val `CERT_SOURCE_URL_PROP_ID`: UInt = 73u;
// UNSUPPORTED Rust 3463:1: non-scalar type Ptr unsupported
// pub const CERT_SRV_OCSP_RESP_MAX_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SrvOcspRespMaxBeforeNextUpdateSeconds");

// UNSUPPORTED Rust 3464:1: non-scalar type Ptr unsupported
// pub const CERT_SRV_OCSP_RESP_MAX_SYNC_CERT_FILE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SrvOcspRespMaxSyncCertFileSeconds");

// UNSUPPORTED Rust 3465:1: non-scalar type Ptr unsupported
// pub const CERT_SRV_OCSP_RESP_MIN_AFTER_NEXT_UPDATE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SrvOcspRespMinAfterNextUpdateSeconds");

// UNSUPPORTED Rust 3466:1: non-scalar type Ptr unsupported
// pub const CERT_SRV_OCSP_RESP_MIN_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SrvOcspRespMinBeforeNextUpdateSeconds");

public const val `CERT_SRV_OCSP_RESP_MIN_SYNC_CERT_FILE_SECONDS_DEFAULT`: UInt = 5u;
// UNSUPPORTED Rust 3468:1: non-scalar type Ptr unsupported
// pub const CERT_SRV_OCSP_RESP_MIN_SYNC_CERT_FILE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SrvOcspRespMinSyncCertFileSeconds");

// UNSUPPORTED Rust 3469:1: non-scalar type Ptr unsupported
// pub const CERT_SRV_OCSP_RESP_MIN_VALIDITY_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SrvOcspRespMinValiditySeconds");

// UNSUPPORTED Rust 3470:1: non-scalar type Ptr unsupported
// pub const CERT_SRV_OCSP_RESP_URL_RETRIEVAL_TIMEOUT_MILLISECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SrvOcspRespUrlRetrievalTimeoutMilliseconds");

public const val `CERT_STORE_ADD_ALWAYS`: UInt = 4u;
public const val `CERT_STORE_ADD_NEW`: UInt = 1u;
public const val `CERT_STORE_ADD_NEWER`: UInt = 6u;
public const val `CERT_STORE_ADD_NEWER_INHERIT_PROPERTIES`: UInt = 7u;
public const val `CERT_STORE_ADD_REPLACE_EXISTING`: UInt = 3u;
public const val `CERT_STORE_ADD_REPLACE_EXISTING_INHERIT_PROPERTIES`: UInt = 5u;
public const val `CERT_STORE_ADD_USE_EXISTING`: UInt = 2u;
public const val `CERT_STORE_BACKUP_RESTORE_FLAG`: `CERT_OPEN_STORE_FLAGS` = 2048u;
public const val `CERT_STORE_BASE_CRL_FLAG`: UInt = 256u;
public const val `CERT_STORE_CERTIFICATE_CONTEXT`: UInt = 1u;
public const val `CERT_STORE_CREATE_NEW_FLAG`: `CERT_OPEN_STORE_FLAGS` = 8192u;
public const val `CERT_STORE_CRL_CONTEXT`: UInt = 2u;
public const val `CERT_STORE_CTL_CONTEXT`: UInt = 3u;
public const val `CERT_STORE_CTRL_AUTO_RESYNC`: UInt = 4u;
public const val `CERT_STORE_CTRL_CANCEL_NOTIFY`: UInt = 5u;
public const val `CERT_STORE_CTRL_COMMIT`: UInt = 3u;
public const val `CERT_STORE_CTRL_COMMIT_CLEAR_FLAG`: `CERT_CONTROL_STORE_FLAGS` = 2u;
public const val `CERT_STORE_CTRL_COMMIT_FORCE_FLAG`: `CERT_CONTROL_STORE_FLAGS` = 1u;
public const val `CERT_STORE_CTRL_INHIBIT_DUPLICATE_HANDLE_FLAG`: `CERT_CONTROL_STORE_FLAGS` = 1u;
public const val `CERT_STORE_CTRL_NOTIFY_CHANGE`: UInt = 2u;
public const val `CERT_STORE_CTRL_RESYNC`: UInt = 1u;
public const val `CERT_STORE_DEFER_CLOSE_UNTIL_LAST_FREE_FLAG`: `CERT_OPEN_STORE_FLAGS` = 4u;
public const val `CERT_STORE_DELETE_FLAG`: `CERT_OPEN_STORE_FLAGS` = 16u;
public const val `CERT_STORE_DELTA_CRL_FLAG`: UInt = 512u;
public const val `CERT_STORE_ENUM_ARCHIVED_FLAG`: `CERT_OPEN_STORE_FLAGS` = 512u;
public const val `CERT_STORE_LOCALIZED_NAME_PROP_ID`: UInt = 4096u;
public const val `CERT_STORE_MANIFOLD_FLAG`: UInt = 256u;
public const val `CERT_STORE_MAXIMUM_ALLOWED_FLAG`: `CERT_OPEN_STORE_FLAGS` = 4096u;
public const val `CERT_STORE_NO_CRL_FLAG`: UInt = 65536u;
public const val `CERT_STORE_NO_CRYPT_RELEASE_FLAG`: `CERT_OPEN_STORE_FLAGS` = 1u;
public const val `CERT_STORE_NO_ISSUER_FLAG`: UInt = 131072u;
public const val `CERT_STORE_OPEN_EXISTING_FLAG`: `CERT_OPEN_STORE_FLAGS` = 16384u;
public const val `CERT_STORE_PROV_CLOSE_FUNC`: UInt = 0u;
// UNSUPPORTED Rust 3504:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_COLLECTION: windows_sys::core::PCSTR = 11i32 as _;

public const val `CERT_STORE_PROV_CONTROL_FUNC`: UInt = 13u;
public const val `CERT_STORE_PROV_DELETED_FLAG`: `CERT_STORE_PROV_FLAGS` = 2u;
public const val `CERT_STORE_PROV_DELETE_CERT_FUNC`: UInt = 3u;
public const val `CERT_STORE_PROV_DELETE_CRL_FUNC`: UInt = 7u;
public const val `CERT_STORE_PROV_DELETE_CTL_FUNC`: UInt = 11u;
public const val `CERT_STORE_PROV_EXTERNAL_FLAG`: `CERT_STORE_PROV_FLAGS` = 1u;
// UNSUPPORTED Rust 3511:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_FILE: windows_sys::core::PCSTR = 3i32 as _;

public const val `CERT_STORE_PROV_FILENAME`: Int = 8;
// UNSUPPORTED Rust 3513:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_FILENAME_A: windows_sys::core::PCSTR = 7i32 as _;

// UNSUPPORTED Rust 3514:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_FILENAME_W: windows_sys::core::PCSTR = 8i32 as _;

public const val `CERT_STORE_PROV_FIND_CERT_FUNC`: UInt = 14u;
public const val `CERT_STORE_PROV_FIND_CRL_FUNC`: UInt = 17u;
public const val `CERT_STORE_PROV_FIND_CTL_FUNC`: UInt = 20u;
// UNSUPPORTED Rust 3518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_STORE_PROV_FIND_INFO {
//     pub cbSize: u32,
//     pub dwMsgAndCertEncodingType: u32,
//     pub dwFindFlags: u32,
//     pub dwFindType: u32,
//     pub pvFindPara: *const core::ffi::c_void,
// }

// UNSUPPORTED Rust 3527:1: declaration Impl has no candidate rule
// impl Default for CERT_STORE_PROV_FIND_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CERT_STORE_PROV_FLAGS` = UInt;
public const val `CERT_STORE_PROV_FREE_FIND_CERT_FUNC`: UInt = 15u;
public const val `CERT_STORE_PROV_FREE_FIND_CRL_FUNC`: UInt = 18u;
public const val `CERT_STORE_PROV_FREE_FIND_CTL_FUNC`: UInt = 21u;
public const val `CERT_STORE_PROV_GET_CERT_PROPERTY_FUNC`: UInt = 16u;
public const val `CERT_STORE_PROV_GET_CRL_PROPERTY_FUNC`: UInt = 19u;
public const val `CERT_STORE_PROV_GET_CTL_PROPERTY_FUNC`: UInt = 22u;
public const val `CERT_STORE_PROV_GP_SYSTEM_STORE_FLAG`: UInt = 32u;
// UNSUPPORTED Rust 3540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_STORE_PROV_INFO {
//     pub cbSize: u32,
//     pub cStoreProvFunc: u32,
//     pub rgpvStoreProvFunc: *mut *mut core::ffi::c_void,
//     pub hStoreProv: HCERTSTOREPROV,
//     pub dwStoreProvFlags: CERT_STORE_PROV_FLAGS,
//     pub hStoreProvFuncAddr2: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3550:1: declaration Impl has no candidate rule
// impl Default for CERT_STORE_PROV_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_STORE_PROV_LDAP`: Int = 16;
// UNSUPPORTED Rust 3556:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_LDAP_W: windows_sys::core::PCSTR = 16i32 as _;

public const val `CERT_STORE_PROV_LM_SYSTEM_STORE_FLAG`: `CERT_STORE_PROV_FLAGS` = 16u;
// UNSUPPORTED Rust 3558:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_MEMORY: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 3559:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_MSG: windows_sys::core::PCSTR = 1i32 as _;

public const val `CERT_STORE_PROV_NO_PERSIST_FLAG`: `CERT_STORE_PROV_FLAGS` = 4u;
public const val `CERT_STORE_PROV_PHYSICAL`: Int = 14;
// UNSUPPORTED Rust 3562:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_PHYSICAL_W: windows_sys::core::PCSTR = 14i32 as _;

// UNSUPPORTED Rust 3563:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_PKCS12: windows_sys::core::PCSTR = 17i32 as _;

// UNSUPPORTED Rust 3564:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_PKCS7: windows_sys::core::PCSTR = 5i32 as _;

public const val `CERT_STORE_PROV_READ_CERT_FUNC`: UInt = 1u;
public const val `CERT_STORE_PROV_READ_CRL_FUNC`: UInt = 5u;
public const val `CERT_STORE_PROV_READ_CTL_FUNC`: UInt = 9u;
// UNSUPPORTED Rust 3568:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_REG: windows_sys::core::PCSTR = 4i32 as _;

// UNSUPPORTED Rust 3569:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_SERIALIZED: windows_sys::core::PCSTR = 6i32 as _;

public const val `CERT_STORE_PROV_SET_CERT_PROPERTY_FUNC`: UInt = 4u;
public const val `CERT_STORE_PROV_SET_CRL_PROPERTY_FUNC`: UInt = 8u;
public const val `CERT_STORE_PROV_SET_CTL_PROPERTY_FUNC`: UInt = 12u;
public const val `CERT_STORE_PROV_SHARED_USER_FLAG`: UInt = 64u;
public const val `CERT_STORE_PROV_SMART_CARD`: Int = 15;
// UNSUPPORTED Rust 3575:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_SMART_CARD_W: windows_sys::core::PCSTR = 15i32 as _;

public const val `CERT_STORE_PROV_SYSTEM`: Int = 10;
// UNSUPPORTED Rust 3577:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_SYSTEM_A: windows_sys::core::PCSTR = 9i32 as _;

public const val `CERT_STORE_PROV_SYSTEM_REGISTRY`: Int = 13;
// UNSUPPORTED Rust 3579:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_SYSTEM_REGISTRY_A: windows_sys::core::PCSTR = 12i32 as _;

// UNSUPPORTED Rust 3580:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_SYSTEM_REGISTRY_W: windows_sys::core::PCSTR = 13i32 as _;

public const val `CERT_STORE_PROV_SYSTEM_STORE_FLAG`: `CERT_STORE_PROV_FLAGS` = 8u;
// UNSUPPORTED Rust 3582:1: non-scalar type Ptr unsupported
// pub const CERT_STORE_PROV_SYSTEM_W: windows_sys::core::PCSTR = 10i32 as _;

public const val `CERT_STORE_PROV_WRITE_ADD_FLAG`: UInt = 1u;
public const val `CERT_STORE_PROV_WRITE_CERT_FUNC`: UInt = 2u;
public const val `CERT_STORE_PROV_WRITE_CRL_FUNC`: UInt = 6u;
public const val `CERT_STORE_PROV_WRITE_CTL_FUNC`: UInt = 10u;
public const val `CERT_STORE_READONLY_FLAG`: `CERT_OPEN_STORE_FLAGS` = 32768u;
public const val `CERT_STORE_REVOCATION_FLAG`: UInt = 4u;
public typealias `CERT_STORE_SAVE_AS` = UInt;
public const val `CERT_STORE_SAVE_AS_PKCS12`: UInt = 3u;
public const val `CERT_STORE_SAVE_AS_PKCS7`: `CERT_STORE_SAVE_AS` = 2u;
public const val `CERT_STORE_SAVE_AS_STORE`: `CERT_STORE_SAVE_AS` = 1u;
public typealias `CERT_STORE_SAVE_TO` = UInt;
public const val `CERT_STORE_SAVE_TO_FILE`: `CERT_STORE_SAVE_TO` = 1u;
public const val `CERT_STORE_SAVE_TO_FILENAME`: `CERT_STORE_SAVE_TO` = 4u;
public const val `CERT_STORE_SAVE_TO_FILENAME_A`: `CERT_STORE_SAVE_TO` = 3u;
public const val `CERT_STORE_SAVE_TO_FILENAME_W`: `CERT_STORE_SAVE_TO` = 4u;
public const val `CERT_STORE_SAVE_TO_MEMORY`: `CERT_STORE_SAVE_TO` = 2u;
public const val `CERT_STORE_SET_LOCALIZED_NAME_FLAG`: `CERT_OPEN_STORE_FLAGS` = 2u;
public const val `CERT_STORE_SHARE_CONTEXT_FLAG`: `CERT_OPEN_STORE_FLAGS` = 128u;
public const val `CERT_STORE_SHARE_STORE_FLAG`: UInt = 64u;
public const val `CERT_STORE_SIGNATURE_FLAG`: UInt = 1u;
public const val `CERT_STORE_TIME_VALIDITY_FLAG`: UInt = 2u;
public const val `CERT_STORE_UNSAFE_PHYSICAL_FLAG`: UInt = 32u;
public const val `CERT_STORE_UPDATE_KEYID_FLAG`: `CERT_OPEN_STORE_FLAGS` = 1024u;
public typealias `CERT_STRING_TYPE` = UInt;
// UNSUPPORTED Rust 3607:1: non-scalar type Ptr unsupported
// pub const CERT_STRONG_SIGN_ECDSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA");

public const val `CERT_STRONG_SIGN_ENABLE_CRL_CHECK`: `CERT_STRONG_SIGN_FLAGS` = 1u;
public const val `CERT_STRONG_SIGN_ENABLE_OCSP_CHECK`: `CERT_STRONG_SIGN_FLAGS` = 2u;
public typealias `CERT_STRONG_SIGN_FLAGS` = UInt;
public const val `CERT_STRONG_SIGN_OID_INFO_CHOICE`: UInt = 2u;
// UNSUPPORTED Rust 3612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_STRONG_SIGN_PARA {
//     pub cbSize: u32,
//     pub dwInfoChoice: u32,
//     pub Anonymous: CERT_STRONG_SIGN_PARA_0,
// }

// UNSUPPORTED Rust 3619:1: declaration Impl has no candidate rule
// impl Default for CERT_STRONG_SIGN_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3624:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CERT_STRONG_SIGN_PARA_0 {
//     pub pvInfo: *mut core::ffi::c_void,
//     pub pSerializedInfo: *mut CERT_STRONG_SIGN_SERIALIZED_INFO,
//     pub pszOID: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3631:1: declaration Impl has no candidate rule
// impl Default for CERT_STRONG_SIGN_PARA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3636:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_STRONG_SIGN_SERIALIZED_INFO {
//     pub dwFlags: CERT_STRONG_SIGN_FLAGS,
//     pub pwszCNGSignHashAlgids: windows_sys::core::PWSTR,
//     pub pwszCNGPubKeyMinBitLengths: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3643:1: declaration Impl has no candidate rule
// impl Default for CERT_STRONG_SIGN_SERIALIZED_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_STRONG_SIGN_SERIALIZED_INFO_CHOICE`: UInt = 1u;
public const val `CERT_SUBJECT_DISABLE_CRL_PROP_ID`: UInt = 86u;
public const val `CERT_SUBJECT_INFO_ACCESS_PROP_ID`: UInt = 80u;
public const val `CERT_SUBJECT_NAME_MD5_HASH_PROP_ID`: UInt = 29u;
public const val `CERT_SUBJECT_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID`: UInt = 85u;
public const val `CERT_SUBJECT_PUBLIC_KEY_MD5_HASH_PROP_ID`: UInt = 25u;
public const val `CERT_SUBJECT_PUB_KEY_BIT_LENGTH_PROP_ID`: UInt = 92u;
// UNSUPPORTED Rust 3655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_SUPPORTED_ALGORITHM_INFO {
//     pub Algorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub IntendedKeyUsage: CRYPT_BIT_BLOB,
//     pub IntendedCertPolicies: CERT_POLICIES_INFO,
// }

public const val `CERT_SYSTEM_STORE_CURRENT_SERVICE_ID`: UInt = 4u;
public const val `CERT_SYSTEM_STORE_CURRENT_USER`: UInt = 65536u;
public const val `CERT_SYSTEM_STORE_CURRENT_USER_GROUP_POLICY_ID`: UInt = 7u;
public const val `CERT_SYSTEM_STORE_CURRENT_USER_ID`: UInt = 1u;
public const val `CERT_SYSTEM_STORE_DEFER_READ_FLAG`: UInt = 536870912u;
public typealias `CERT_SYSTEM_STORE_FLAGS` = UInt;
// UNSUPPORTED Rust 3668:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_SYSTEM_STORE_INFO {
//     pub cbSize: u32,
// }

public const val `CERT_SYSTEM_STORE_LOCAL_MACHINE`: UInt = 131072u;
public const val `CERT_SYSTEM_STORE_LOCAL_MACHINE_ENTERPRISE_ID`: UInt = 9u;
public const val `CERT_SYSTEM_STORE_LOCAL_MACHINE_GROUP_POLICY_ID`: UInt = 8u;
public const val `CERT_SYSTEM_STORE_LOCAL_MACHINE_ID`: UInt = 2u;
public const val `CERT_SYSTEM_STORE_LOCAL_MACHINE_WCOS_ID`: UInt = 10u;
public const val `CERT_SYSTEM_STORE_LOCATION_MASK`: `CERT_SYSTEM_STORE_FLAGS` = 16711680u;
public const val `CERT_SYSTEM_STORE_LOCATION_SHIFT`: UInt = 16u;
public const val `CERT_SYSTEM_STORE_MASK`: UInt = 4294901760u;
public const val `CERT_SYSTEM_STORE_RELOCATE_FLAG`: `CERT_SYSTEM_STORE_FLAGS` = 2147483648u;
// UNSUPPORTED Rust 3682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub struct CERT_SYSTEM_STORE_RELOCATE_PARA {
//     pub Anonymous1: CERT_SYSTEM_STORE_RELOCATE_PARA_0,
//     pub Anonymous2: CERT_SYSTEM_STORE_RELOCATE_PARA_1,
// }

// UNSUPPORTED Rust 3689:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for CERT_SYSTEM_STORE_RELOCATE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3695:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub union CERT_SYSTEM_STORE_RELOCATE_PARA_0 {
//     pub hKeyBase: super::super::System::Registry::HKEY,
//     pub pvBase: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3702:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for CERT_SYSTEM_STORE_RELOCATE_PARA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3708:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub union CERT_SYSTEM_STORE_RELOCATE_PARA_1 {
//     pub pvSystemStore: *mut core::ffi::c_void,
//     pub pszSystemStore: windows_sys::core::PCSTR,
//     pub pwszSystemStore: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 3716:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for CERT_SYSTEM_STORE_RELOCATE_PARA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_SYSTEM_STORE_SERVICES_ID`: UInt = 5u;
public const val `CERT_SYSTEM_STORE_UNPROTECTED_FLAG`: UInt = 1073741824u;
public const val `CERT_SYSTEM_STORE_USERS_ID`: UInt = 6u;
// UNSUPPORTED Rust 3725:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_TEMPLATE_EXT {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub dwMajorVersion: u32,
//     pub fMinorVersion: windows_sys::core::BOOL,
//     pub dwMinorVersion: u32,
// }

// UNSUPPORTED Rust 3733:1: declaration Impl has no candidate rule
// impl Default for CERT_TEMPLATE_EXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_TIMESTAMP_HASH_USE_TYPE`: UInt = 2u;
// UNSUPPORTED Rust 3739:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_TPM_SPECIFICATION_INFO {
//     pub pwszFamily: windows_sys::core::PWSTR,
//     pub dwLevel: u32,
//     pub dwRevision: u32,
// }

// UNSUPPORTED Rust 3746:1: declaration Impl has no candidate rule
// impl Default for CERT_TPM_SPECIFICATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_TRUST_AUTO_UPDATE_CA_REVOCATION`: UInt = 16u;
public const val `CERT_TRUST_AUTO_UPDATE_END_REVOCATION`: UInt = 32u;
public const val `CERT_TRUST_BEFORE_DISALLOWED_CA_FILETIME`: UInt = 2097152u;
public const val `CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID`: UInt = 262144u;
public const val `CERT_TRUST_CTL_IS_NOT_TIME_VALID`: UInt = 131072u;
public const val `CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE`: UInt = 524288u;
public const val `CERT_TRUST_HAS_ALLOW_WEAK_SIGNATURE`: UInt = 131072u;
public const val `CERT_TRUST_HAS_AUTO_UPDATE_WEAK_SIGNATURE`: UInt = 32768u;
public const val `CERT_TRUST_HAS_CRL_VALIDITY_EXTENDED`: UInt = 4096u;
public const val `CERT_TRUST_HAS_EXACT_MATCH_ISSUER`: UInt = 1u;
public const val `CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT`: UInt = 32768u;
public const val `CERT_TRUST_HAS_ISSUANCE_CHAIN_POLICY`: UInt = 512u;
public const val `CERT_TRUST_HAS_KEY_MATCH_ISSUER`: UInt = 2u;
public const val `CERT_TRUST_HAS_NAME_MATCH_ISSUER`: UInt = 4u;
public const val `CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT`: UInt = 8192u;
public const val `CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT`: UInt = 16384u;
public const val `CERT_TRUST_HAS_NOT_SUPPORTED_CRITICAL_EXT`: UInt = 134217728u;
public const val `CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT`: UInt = 4096u;
public const val `CERT_TRUST_HAS_PREFERRED_ISSUER`: UInt = 256u;
public const val `CERT_TRUST_HAS_VALID_NAME_CONSTRAINTS`: UInt = 1024u;
public const val `CERT_TRUST_HAS_WEAK_HYGIENE`: UInt = 2097152u;
public const val `CERT_TRUST_HAS_WEAK_SIGNATURE`: UInt = 1048576u;
public const val `CERT_TRUST_INVALID_BASIC_CONSTRAINTS`: UInt = 1024u;
public const val `CERT_TRUST_INVALID_EXTENSION`: UInt = 256u;
public const val `CERT_TRUST_INVALID_NAME_CONSTRAINTS`: UInt = 2048u;
public const val `CERT_TRUST_INVALID_POLICY_CONSTRAINTS`: UInt = 512u;
public const val `CERT_TRUST_IS_CA_TRUSTED`: UInt = 16384u;
public const val `CERT_TRUST_IS_COMPLEX_CHAIN`: UInt = 65536u;
public const val `CERT_TRUST_IS_CYCLIC`: UInt = 128u;
public const val `CERT_TRUST_IS_EXPLICIT_DISTRUST`: UInt = 67108864u;
public const val `CERT_TRUST_IS_FROM_EXCLUSIVE_TRUST_STORE`: UInt = 8192u;
public const val `CERT_TRUST_IS_KEY_ROLLOVER`: UInt = 128u;
public const val `CERT_TRUST_IS_NOT_SIGNATURE_VALID`: UInt = 8u;
public const val `CERT_TRUST_IS_NOT_TIME_NESTED`: UInt = 2u;
public const val `CERT_TRUST_IS_NOT_TIME_VALID`: UInt = 1u;
public const val `CERT_TRUST_IS_NOT_VALID_FOR_USAGE`: UInt = 16u;
public const val `CERT_TRUST_IS_OFFLINE_REVOCATION`: UInt = 16777216u;
public const val `CERT_TRUST_IS_PARTIAL_CHAIN`: UInt = 65536u;
public const val `CERT_TRUST_IS_PEER_TRUSTED`: UInt = 2048u;
public const val `CERT_TRUST_IS_REVOKED`: UInt = 4u;
public const val `CERT_TRUST_IS_SELF_SIGNED`: UInt = 8u;
public const val `CERT_TRUST_IS_UNTRUSTED_ROOT`: UInt = 32u;
// UNSUPPORTED Rust 3793:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_TRUST_LIST_INFO {
//     pub cbSize: u32,
//     pub pCtlEntry: *mut CTL_ENTRY,
//     pub pCtlContext: *mut CTL_CONTEXT,
// }

// UNSUPPORTED Rust 3800:1: declaration Impl has no candidate rule
// impl Default for CERT_TRUST_LIST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_TRUST_NO_ERROR`: UInt = 0u;
public const val `CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY`: UInt = 33554432u;
public const val `CERT_TRUST_NO_OCSP_FAILOVER_TO_CRL`: UInt = 64u;
public const val `CERT_TRUST_NO_TIME_CHECK`: UInt = 33554432u;
public const val `CERT_TRUST_PUB_ALLOW_END_USER_TRUST`: UInt = 0u;
public const val `CERT_TRUST_PUB_ALLOW_ENTERPRISE_ADMIN_TRUST`: UInt = 2u;
public const val `CERT_TRUST_PUB_ALLOW_MACHINE_ADMIN_TRUST`: UInt = 1u;
public const val `CERT_TRUST_PUB_ALLOW_TRUST_MASK`: UInt = 3u;
// UNSUPPORTED Rust 3813:1: non-scalar type Ptr unsupported
// pub const CERT_TRUST_PUB_AUTHENTICODE_FLAGS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthenticodeFlags");

public const val `CERT_TRUST_PUB_CHECK_PUBLISHER_REV_FLAG`: UInt = 256u;
public const val `CERT_TRUST_PUB_CHECK_TIMESTAMP_REV_FLAG`: UInt = 512u;
public const val `CERT_TRUST_REVOCATION_STATUS_UNKNOWN`: UInt = 64u;
public const val `CERT_TRUST_SSL_HANDSHAKE_OCSP`: UInt = 262144u;
public const val `CERT_TRUST_SSL_RECONNECT_OCSP`: UInt = 1048576u;
public const val `CERT_TRUST_SSL_TIME_VALID`: UInt = 16777216u;
public const val `CERT_TRUST_SSL_TIME_VALID_OCSP`: UInt = 524288u;
// UNSUPPORTED Rust 3821:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_TRUST_STATUS {
//     pub dwErrorStatus: u32,
//     pub dwInfoStatus: u32,
// }

public const val `CERT_UNICODE_ATTR_ERR_INDEX_MASK`: UInt = 63u;
public const val `CERT_UNICODE_ATTR_ERR_INDEX_SHIFT`: UInt = 16u;
public const val `CERT_UNICODE_IS_RDN_ATTRS_FLAG`: UInt = 1u;
public const val `CERT_UNICODE_RDN_ERR_INDEX_MASK`: UInt = 1023u;
public const val `CERT_UNICODE_RDN_ERR_INDEX_SHIFT`: UInt = 22u;
public const val `CERT_UNICODE_VALUE_ERR_INDEX_MASK`: UInt = 65535u;
public const val `CERT_UNICODE_VALUE_ERR_INDEX_SHIFT`: UInt = 0u;
// UNSUPPORTED Rust 3834:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_USAGE_MATCH {
//     pub dwType: u32,
//     pub Usage: CTL_USAGE,
// }

public const val `CERT_V1`: UInt = 0u;
public const val `CERT_V2`: UInt = 1u;
public const val `CERT_V3`: UInt = 2u;
public const val `CERT_VERIFY_ALLOW_MORE_USAGE_FLAG`: UInt = 8u;
public const val `CERT_VERIFY_CACHE_ONLY_BASED_REVOCATION`: UInt = 2u;
public const val `CERT_VERIFY_INHIBIT_CTL_UPDATE_FLAG`: UInt = 1u;
public const val `CERT_VERIFY_NO_TIME_CHECK_FLAG`: UInt = 4u;
public const val `CERT_VERIFY_REV_ACCUMULATIVE_TIMEOUT_FLAG`: UInt = 4u;
public const val `CERT_VERIFY_REV_CHAIN_FLAG`: UInt = 1u;
public const val `CERT_VERIFY_REV_NO_OCSP_FAILOVER_TO_CRL_FLAG`: UInt = 16u;
public const val `CERT_VERIFY_REV_SERVER_OCSP_FLAG`: UInt = 8u;
public const val `CERT_VERIFY_REV_SERVER_OCSP_WIRE_ONLY_FLAG`: UInt = 32u;
public const val `CERT_VERIFY_TRUSTED_SIGNERS_FLAG`: UInt = 2u;
public const val `CERT_VERIFY_UPDATED_CTL_FLAG`: UInt = 1u;
public const val `CERT_X500_NAME_STR`: `CERT_STRING_TYPE` = 3u;
// UNSUPPORTED Rust 3855:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_X942_DH_PARAMETERS {
//     pub p: CRYPT_INTEGER_BLOB,
//     pub g: CRYPT_INTEGER_BLOB,
//     pub q: CRYPT_INTEGER_BLOB,
//     pub j: CRYPT_INTEGER_BLOB,
//     pub pValidationParams: *mut CERT_X942_DH_VALIDATION_PARAMS,
// }

// UNSUPPORTED Rust 3864:1: declaration Impl has no candidate rule
// impl Default for CERT_X942_DH_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3869:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CERT_X942_DH_VALIDATION_PARAMS {
//     pub seed: CRYPT_BIT_BLOB,
//     pub pgenCounter: u32,
// }

public const val `CERT_XML_NAME_STR`: UInt = 4u;
public typealias `CESSetupProperty` = Int;
// UNSUPPORTED Rust 3877:1: non-scalar type Ptr unsupported
// pub const CKP_BLOCK_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("BlockLength");

// UNSUPPORTED Rust 3878:1: non-scalar type Ptr unsupported
// pub const CKP_CHAINING_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("ChainingMode");

// UNSUPPORTED Rust 3879:1: non-scalar type Ptr unsupported
// pub const CKP_INITIALIZATION_VECTOR: windows_sys::core::PCWSTR = windows_sys::core::w!("IV");

// UNSUPPORTED Rust 3880:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLAIMLIST {
//     pub count: u32,
//     pub claims: *const windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 3886:1: declaration Impl has no candidate rule
// impl Default for CLAIMLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLMD_FILE_TAG_CARD_AUTH_CERT`: UInt = 6275329u;
public const val `CLMD_FILE_TAG_CARD_CAPABILITY_CONTAINER`: UInt = 6275335u;
public const val `CLMD_FILE_TAG_CHUID`: UInt = 6275330u;
public const val `CLMD_FILE_TAG_FACIAL_IMAGE`: UInt = 6275336u;
public const val `CLMD_FILE_TAG_FINGERPRINT`: UInt = 6275331u;
public const val `CLMD_FILE_TAG_FIRST_RETIRED_KEY_MGMT_KEY`: UInt = 6275341u;
public const val `CLMD_FILE_TAG_KEY_HISTORY`: UInt = 6275340u;
public const val `CLMD_FILE_TAG_KEY_MGMT_CERT`: UInt = 6275339u;
public const val `CLMD_FILE_TAG_LAST_RETIRED_KEY_MGMT_KEY`: UInt = 6275360u;
public const val `CLMD_FILE_TAG_PIV_AUTH_CERT`: UInt = 6275333u;
public const val `CLMD_FILE_TAG_PRINTED_INFORMATION`: UInt = 6275337u;
public const val `CLMD_FILE_TAG_SECURITY_OBJECT`: UInt = 6275334u;
public const val `CLMD_FILE_TAG_SIG_CERT`: UInt = 6275338u;
public const val `CLMD_FILE_TAG_UNSIGNED_CHUID`: UInt = 6275332u;
// UNSUPPORTED Rust 3905:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLMD_PIV_CERT_DATA {
//     pub dwVersion: u32,
//     pub dwCertTag: u32,
//     pub pbCert: *mut u8,
//     pub cbCert: u32,
// }

// UNSUPPORTED Rust 3913:1: declaration Impl has no candidate rule
// impl Default for CLMD_PIV_CERT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLMD_PIV_CERT_DATA_CURRENT_VERSION`: UInt = 0u;
// UNSUPPORTED Rust 3919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLMD_PIV_GENERATE_ASYMMETRIC_KEY {
//     pub dwVersion: u32,
//     pub bAlgorithmId: u8,
//     pub bKeyId: u8,
//     pub pbKey: *mut u8,
//     pub cbKey: u32,
// }

// UNSUPPORTED Rust 3928:1: declaration Impl has no candidate rule
// impl Default for CLMD_PIV_GENERATE_ASYMMETRIC_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLMD_PIV_GENERATE_ASYMMETRIC_KEY_CURRENT_VERSION`: UInt = 0u;
// UNSUPPORTED Rust 3934:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLMD_PIV_PUBLIC_KEY_DATA {
//     pub dwVersion: u32,
//     pub bKeyId: u8,
//     pub pbPublicKey: *mut u8,
//     pub cbPublicKey: u32,
// }

// UNSUPPORTED Rust 3942:1: declaration Impl has no candidate rule
// impl Default for CLMD_PIV_PUBLIC_KEY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLMD_PIV_PUBLIC_KEY_DATA_CURRENT_VERSION`: UInt = 0u;
// UNSUPPORTED Rust 3948:1: non-scalar type Ptr unsupported
// pub const CMC_ADD_ATTRIBUTES: windows_sys::core::PCSTR = 63i32 as _;

// UNSUPPORTED Rust 3949:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMC_ADD_ATTRIBUTES_INFO {
//     pub dwCmcDataReference: u32,
//     pub cCertReference: u32,
//     pub rgdwCertReference: *mut u32,
//     pub cAttribute: u32,
//     pub rgAttribute: *mut CRYPT_ATTRIBUTE,
// }

// UNSUPPORTED Rust 3958:1: declaration Impl has no candidate rule
// impl Default for CMC_ADD_ATTRIBUTES_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3963:1: non-scalar type Ptr unsupported
// pub const CMC_ADD_EXTENSIONS: windows_sys::core::PCSTR = 62i32 as _;

// UNSUPPORTED Rust 3964:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMC_ADD_EXTENSIONS_INFO {
//     pub dwCmcDataReference: u32,
//     pub cCertReference: u32,
//     pub rgdwCertReference: *mut u32,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 3973:1: declaration Impl has no candidate rule
// impl Default for CMC_ADD_EXTENSIONS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3978:1: non-scalar type Ptr unsupported
// pub const CMC_DATA: windows_sys::core::PCSTR = 59i32 as _;

// UNSUPPORTED Rust 3979:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMC_DATA_INFO {
//     pub cTaggedAttribute: u32,
//     pub rgTaggedAttribute: *mut CMC_TAGGED_ATTRIBUTE,
//     pub cTaggedRequest: u32,
//     pub rgTaggedRequest: *mut CMC_TAGGED_REQUEST,
//     pub cTaggedContentInfo: u32,
//     pub rgTaggedContentInfo: *mut CMC_TAGGED_CONTENT_INFO,
//     pub cTaggedOtherMsg: u32,
//     pub rgTaggedOtherMsg: *mut CMC_TAGGED_OTHER_MSG,
// }

// UNSUPPORTED Rust 3991:1: declaration Impl has no candidate rule
// impl Default for CMC_DATA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMC_FAIL_BAD_ALG`: UInt = 0u;
public const val `CMC_FAIL_BAD_CERT_ID`: UInt = 4u;
public const val `CMC_FAIL_BAD_IDENTITY`: UInt = 7u;
public const val `CMC_FAIL_BAD_MESSAGE_CHECK`: UInt = 1u;
public const val `CMC_FAIL_BAD_REQUEST`: UInt = 2u;
public const val `CMC_FAIL_BAD_TIME`: UInt = 3u;
public const val `CMC_FAIL_INTERNAL_CA_ERROR`: UInt = 11u;
public const val `CMC_FAIL_MUST_ARCHIVE_KEYS`: UInt = 6u;
public const val `CMC_FAIL_NO_KEY_REUSE`: UInt = 10u;
public const val `CMC_FAIL_POP_FAILED`: UInt = 9u;
public const val `CMC_FAIL_POP_REQUIRED`: UInt = 8u;
public const val `CMC_FAIL_TRY_LATER`: UInt = 12u;
public const val `CMC_FAIL_UNSUPORTED_EXT`: UInt = 5u;
public const val `CMC_OTHER_INFO_FAIL_CHOICE`: UInt = 1u;
public const val `CMC_OTHER_INFO_NO_CHOICE`: UInt = 0u;
public const val `CMC_OTHER_INFO_PEND_CHOICE`: UInt = 2u;
// UNSUPPORTED Rust 4012:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMC_PEND_INFO {
//     pub PendToken: CRYPT_INTEGER_BLOB,
//     pub PendTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 4018:1: non-scalar type Ptr unsupported
// pub const CMC_RESPONSE: windows_sys::core::PCSTR = 60i32 as _;

// UNSUPPORTED Rust 4019:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMC_RESPONSE_INFO {
//     pub cTaggedAttribute: u32,
//     pub rgTaggedAttribute: *mut CMC_TAGGED_ATTRIBUTE,
//     pub cTaggedContentInfo: u32,
//     pub rgTaggedContentInfo: *mut CMC_TAGGED_CONTENT_INFO,
//     pub cTaggedOtherMsg: u32,
//     pub rgTaggedOtherMsg: *mut CMC_TAGGED_OTHER_MSG,
// }

// UNSUPPORTED Rust 4029:1: declaration Impl has no candidate rule
// impl Default for CMC_RESPONSE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4034:1: non-scalar type Ptr unsupported
// pub const CMC_STATUS: windows_sys::core::PCSTR = 61i32 as _;

public const val `CMC_STATUS_CONFIRM_REQUIRED`: UInt = 5u;
public const val `CMC_STATUS_FAILED`: UInt = 2u;
// UNSUPPORTED Rust 4037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMC_STATUS_INFO {
//     pub dwStatus: u32,
//     pub cBodyList: u32,
//     pub rgdwBodyList: *mut u32,
//     pub pwszStatusString: windows_sys::core::PWSTR,
//     pub dwOtherInfoChoice: u32,
//     pub Anonymous: CMC_STATUS_INFO_0,
// }

// UNSUPPORTED Rust 4047:1: declaration Impl has no candidate rule
// impl Default for CMC_STATUS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4052:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMC_STATUS_INFO_0 {
//     pub dwFailInfo: u32,
//     pub pPendInfo: *mut CMC_PEND_INFO,
// }

// UNSUPPORTED Rust 4058:1: declaration Impl has no candidate rule
// impl Default for CMC_STATUS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMC_STATUS_NO_SUPPORT`: UInt = 4u;
public const val `CMC_STATUS_PENDING`: UInt = 3u;
public const val `CMC_STATUS_SUCCESS`: UInt = 0u;
// UNSUPPORTED Rust 4066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMC_TAGGED_ATTRIBUTE {
//     pub dwBodyPartID: u32,
//     pub Attribute: CRYPT_ATTRIBUTE,
// }

// UNSUPPORTED Rust 4072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMC_TAGGED_CERT_REQUEST {
//     pub dwBodyPartID: u32,
//     pub SignedCertRequest: CRYPT_INTEGER_BLOB,
// }

public const val `CMC_TAGGED_CERT_REQUEST_CHOICE`: UInt = 1u;
// UNSUPPORTED Rust 4079:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMC_TAGGED_CONTENT_INFO {
//     pub dwBodyPartID: u32,
//     pub EncodedContentInfo: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 4085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMC_TAGGED_OTHER_MSG {
//     pub dwBodyPartID: u32,
//     pub pszObjId: windows_sys::core::PSTR,
//     pub Value: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 4092:1: declaration Impl has no candidate rule
// impl Default for CMC_TAGGED_OTHER_MSG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4097:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMC_TAGGED_REQUEST {
//     pub dwTaggedRequestChoice: u32,
//     pub Anonymous: CMC_TAGGED_REQUEST_0,
// }

// UNSUPPORTED Rust 4103:1: declaration Impl has no candidate rule
// impl Default for CMC_TAGGED_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4108:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMC_TAGGED_REQUEST_0 {
//     pub pTaggedCertRequest: *mut CMC_TAGGED_CERT_REQUEST,
// }

// UNSUPPORTED Rust 4113:1: declaration Impl has no candidate rule
// impl Default for CMC_TAGGED_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CMSCEPSetup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa4f5c02_8e7c_49c4_94fa_67a5cc5eadb4);

public const val `CMSG_ATTR_CERT_COUNT_PARAM`: UInt = 31u;
public const val `CMSG_ATTR_CERT_PARAM`: UInt = 32u;
public const val `CMSG_AUTHENTICATED_ATTRIBUTES_FLAG`: UInt = 8u;
public const val `CMSG_BARE_CONTENT_FLAG`: UInt = 1u;
public const val `CMSG_BARE_CONTENT_PARAM`: UInt = 3u;
public const val `CMSG_CERT_COUNT_PARAM`: UInt = 11u;
public const val `CMSG_CERT_PARAM`: UInt = 12u;
public const val `CMSG_CMS_ENCAPSULATED_CONTENT_FLAG`: UInt = 64u;
public const val `CMSG_CMS_ENCAPSULATED_CTL_FLAG`: UInt = 32768u;
public const val `CMSG_CMS_RECIPIENT_COUNT_PARAM`: UInt = 33u;
public const val `CMSG_CMS_RECIPIENT_ENCRYPTED_KEY_INDEX_PARAM`: UInt = 35u;
public const val `CMSG_CMS_RECIPIENT_INDEX_PARAM`: UInt = 34u;
// UNSUPPORTED Rust 4131:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CMS_RECIPIENT_INFO {
//     pub dwRecipientChoice: u32,
//     pub Anonymous: CMSG_CMS_RECIPIENT_INFO_0,
// }

// UNSUPPORTED Rust 4137:1: declaration Impl has no candidate rule
// impl Default for CMSG_CMS_RECIPIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4142:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_CMS_RECIPIENT_INFO_0 {
//     pub pKeyTrans: *mut CMSG_KEY_TRANS_RECIPIENT_INFO,
//     pub pKeyAgree: *mut CMSG_KEY_AGREE_RECIPIENT_INFO,
//     pub pMailList: *mut CMSG_MAIL_LIST_RECIPIENT_INFO,
// }

// UNSUPPORTED Rust 4149:1: declaration Impl has no candidate rule
// impl Default for CMSG_CMS_RECIPIENT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_CMS_RECIPIENT_INFO_PARAM`: UInt = 36u;
// UNSUPPORTED Rust 4155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CMS_SIGNER_INFO {
//     pub dwVersion: u32,
//     pub SignerId: CERT_ID,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub HashEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EncryptedHash: CRYPT_INTEGER_BLOB,
//     pub AuthAttrs: CRYPT_ATTRIBUTES,
//     pub UnauthAttrs: CRYPT_ATTRIBUTES,
// }

// UNSUPPORTED Rust 4166:1: declaration Impl has no candidate rule
// impl Default for CMSG_CMS_SIGNER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_CMS_SIGNER_INFO_PARAM`: UInt = 39u;
// UNSUPPORTED Rust 4172:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CNG_CONTENT_DECRYPT_INFO {
//     pub cbSize: u32,
//     pub ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pfnAlloc: PFN_CMSG_ALLOC,
//     pub pfnFree: PFN_CMSG_FREE,
//     pub hNCryptKey: NCRYPT_KEY_HANDLE,
//     pub pbContentEncryptKey: *mut u8,
//     pub cbContentEncryptKey: u32,
//     pub hCNGContentEncryptKey: BCRYPT_KEY_HANDLE,
//     pub pbCNGContentEncryptKeyObject: *mut u8,
// }

// UNSUPPORTED Rust 4185:1: declaration Impl has no candidate rule
// impl Default for CMSG_CNG_CONTENT_DECRYPT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_COMPUTED_HASH_PARAM`: UInt = 22u;
public const val `CMSG_CONTENTS_OCTETS_FLAG`: UInt = 16u;
public const val `CMSG_CONTENT_ENCRYPT_FREE_OBJID_FLAG`: UInt = 2u;
public const val `CMSG_CONTENT_ENCRYPT_FREE_PARA_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 4194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CONTENT_ENCRYPT_INFO {
//     pub cbSize: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvEncryptionAuxInfo: *mut core::ffi::c_void,
//     pub cRecipients: u32,
//     pub rgCmsRecipients: *mut CMSG_RECIPIENT_ENCODE_INFO,
//     pub pfnAlloc: PFN_CMSG_ALLOC,
//     pub pfnFree: PFN_CMSG_FREE,
//     pub dwEncryptFlags: u32,
//     pub Anonymous: CMSG_CONTENT_ENCRYPT_INFO_0,
//     pub dwFlags: u32,
//     pub fCNG: windows_sys::core::BOOL,
//     pub pbCNGContentEncryptKeyObject: *mut u8,
//     pub pbContentEncryptKey: *mut u8,
//     pub cbContentEncryptKey: u32,
// }

// UNSUPPORTED Rust 4213:1: declaration Impl has no candidate rule
// impl Default for CMSG_CONTENT_ENCRYPT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4218:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_CONTENT_ENCRYPT_INFO_0 {
//     pub hContentEncryptKey: usize,
//     pub hCNGContentEncryptKey: BCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 4224:1: declaration Impl has no candidate rule
// impl Default for CMSG_CONTENT_ENCRYPT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_CONTENT_ENCRYPT_PAD_ENCODED_LEN_FLAG`: UInt = 1u;
public const val `CMSG_CONTENT_ENCRYPT_RELEASE_CONTEXT_FLAG`: UInt = 32768u;
public const val `CMSG_CONTENT_PARAM`: UInt = 2u;
public const val `CMSG_CRL_COUNT_PARAM`: UInt = 13u;
public const val `CMSG_CRL_PARAM`: UInt = 14u;
public const val `CMSG_CRYPT_RELEASE_CONTEXT_FLAG`: UInt = 32768u;
public const val `CMSG_CTRL_ADD_ATTR_CERT`: UInt = 14u;
public const val `CMSG_CTRL_ADD_CERT`: UInt = 10u;
public const val `CMSG_CTRL_ADD_CMS_SIGNER_INFO`: UInt = 20u;
public const val `CMSG_CTRL_ADD_CRL`: UInt = 12u;
public const val `CMSG_CTRL_ADD_SIGNER`: UInt = 6u;
public const val `CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR`: UInt = 8u;
// UNSUPPORTED Rust 4241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA {
//     pub cbSize: u32,
//     pub dwSignerIndex: u32,
//     pub blob: CRYPT_INTEGER_BLOB,
// }

public const val `CMSG_CTRL_DECRYPT`: UInt = 2u;
// UNSUPPORTED Rust 4249:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CTRL_DECRYPT_PARA {
//     pub cbSize: u32,
//     pub Anonymous: CMSG_CTRL_DECRYPT_PARA_0,
//     pub dwKeySpec: u32,
//     pub dwRecipientIndex: u32,
// }

// UNSUPPORTED Rust 4257:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_DECRYPT_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4262:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_CTRL_DECRYPT_PARA_0 {
//     pub hCryptProv: usize,
//     pub hNCryptKey: NCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 4268:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_DECRYPT_PARA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_CTRL_DEL_ATTR_CERT`: UInt = 15u;
public const val `CMSG_CTRL_DEL_CERT`: UInt = 11u;
public const val `CMSG_CTRL_DEL_CRL`: UInt = 13u;
public const val `CMSG_CTRL_DEL_SIGNER`: UInt = 7u;
public const val `CMSG_CTRL_DEL_SIGNER_UNAUTH_ATTR`: UInt = 9u;
// UNSUPPORTED Rust 4278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_CTRL_DEL_SIGNER_UNAUTH_ATTR_PARA {
//     pub cbSize: u32,
//     pub dwSignerIndex: u32,
//     pub dwUnauthAttrIndex: u32,
// }

public const val `CMSG_CTRL_ENABLE_STRONG_SIGNATURE`: UInt = 21u;
public const val `CMSG_CTRL_KEY_AGREE_DECRYPT`: UInt = 17u;
// UNSUPPORTED Rust 4287:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CTRL_KEY_AGREE_DECRYPT_PARA {
//     pub cbSize: u32,
//     pub Anonymous: CMSG_CTRL_KEY_AGREE_DECRYPT_PARA_0,
//     pub dwKeySpec: u32,
//     pub pKeyAgree: *mut CMSG_KEY_AGREE_RECIPIENT_INFO,
//     pub dwRecipientIndex: u32,
//     pub dwRecipientEncryptedKeyIndex: u32,
//     pub OriginatorPublicKey: CRYPT_BIT_BLOB,
// }

// UNSUPPORTED Rust 4298:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_KEY_AGREE_DECRYPT_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4303:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_CTRL_KEY_AGREE_DECRYPT_PARA_0 {
//     pub hCryptProv: usize,
//     pub hNCryptKey: NCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 4309:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_KEY_AGREE_DECRYPT_PARA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_CTRL_KEY_TRANS_DECRYPT`: UInt = 16u;
// UNSUPPORTED Rust 4315:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CTRL_KEY_TRANS_DECRYPT_PARA {
//     pub cbSize: u32,
//     pub Anonymous: CMSG_CTRL_KEY_TRANS_DECRYPT_PARA_0,
//     pub dwKeySpec: u32,
//     pub pKeyTrans: *mut CMSG_KEY_TRANS_RECIPIENT_INFO,
//     pub dwRecipientIndex: u32,
// }

// UNSUPPORTED Rust 4324:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_KEY_TRANS_DECRYPT_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4329:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_CTRL_KEY_TRANS_DECRYPT_PARA_0 {
//     pub hCryptProv: usize,
//     pub hNCryptKey: NCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 4335:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_KEY_TRANS_DECRYPT_PARA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_CTRL_MAIL_LIST_DECRYPT`: UInt = 18u;
// UNSUPPORTED Rust 4341:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CTRL_MAIL_LIST_DECRYPT_PARA {
//     pub cbSize: u32,
//     pub hCryptProv: usize,
//     pub pMailList: *mut CMSG_MAIL_LIST_RECIPIENT_INFO,
//     pub dwRecipientIndex: u32,
//     pub dwKeyChoice: u32,
//     pub Anonymous: CMSG_CTRL_MAIL_LIST_DECRYPT_PARA_0,
// }

// UNSUPPORTED Rust 4351:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_MAIL_LIST_DECRYPT_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4356:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_CTRL_MAIL_LIST_DECRYPT_PARA_0 {
//     pub hKeyEncryptionKey: usize,
//     pub pvKeyEncryptionKey: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4362:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_MAIL_LIST_DECRYPT_PARA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_CTRL_VERIFY_HASH`: UInt = 5u;
public const val `CMSG_CTRL_VERIFY_SIGNATURE`: UInt = 1u;
public const val `CMSG_CTRL_VERIFY_SIGNATURE_EX`: UInt = 19u;
// UNSUPPORTED Rust 4370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA {
//     pub cbSize: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub dwSignerIndex: u32,
//     pub dwSignerType: u32,
//     pub pvSigner: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4379:1: declaration Impl has no candidate rule
// impl Default for CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_DATA`: `CRYPT_MSG_TYPE` = 1u;
// UNSUPPORTED Rust 4385:1: non-scalar type Ptr unsupported
// pub const CMSG_DEFAULT_INSTALLABLE_FUNC_OID: windows_sys::core::PCSTR = 1i32 as _;

public const val `CMSG_DETACHED_FLAG`: UInt = 4u;
public const val `CMSG_ENCODED_MESSAGE`: UInt = 29u;
public const val `CMSG_ENCODED_SIGNER`: UInt = 28u;
public const val `CMSG_ENCODE_HASHED_SUBJECT_IDENTIFIER_FLAG`: UInt = 2u;
public const val `CMSG_ENCODE_SORTED_CTL_FLAG`: UInt = 1u;
public const val `CMSG_ENCODING_TYPE_MASK`: UInt = 4294901760u;
public const val `CMSG_ENCRYPTED`: UInt = 6u;
public const val `CMSG_ENCRYPTED_DIGEST`: UInt = 27u;
// UNSUPPORTED Rust 4394:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_ENCRYPTED_ENCODE_INFO {
//     pub cbSize: u32,
//     pub ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvEncryptionAuxInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4401:1: declaration Impl has no candidate rule
// impl Default for CMSG_ENCRYPTED_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_ENCRYPT_PARAM`: UInt = 26u;
public const val `CMSG_ENVELOPED`: `CRYPT_MSG_TYPE` = 3u;
public const val `CMSG_ENVELOPED_DATA_CMS_VERSION`: UInt = 2u;
public const val `CMSG_ENVELOPED_DATA_PKCS_1_5_VERSION`: UInt = 0u;
public const val `CMSG_ENVELOPED_DATA_V0`: UInt = 0u;
public const val `CMSG_ENVELOPED_DATA_V2`: UInt = 2u;
// UNSUPPORTED Rust 4412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_ENVELOPED_ENCODE_INFO {
//     pub cbSize: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvEncryptionAuxInfo: *mut core::ffi::c_void,
//     pub cRecipients: u32,
//     pub rgpRecipients: *mut *mut CERT_INFO,
// }

// UNSUPPORTED Rust 4422:1: declaration Impl has no candidate rule
// impl Default for CMSG_ENVELOPED_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_ENVELOPED_RECIPIENT_V0`: UInt = 0u;
public const val `CMSG_ENVELOPED_RECIPIENT_V2`: UInt = 2u;
public const val `CMSG_ENVELOPED_RECIPIENT_V3`: UInt = 3u;
public const val `CMSG_ENVELOPED_RECIPIENT_V4`: UInt = 4u;
public const val `CMSG_ENVELOPE_ALGORITHM_PARAM`: UInt = 15u;
public const val `CMSG_HASHED`: `CRYPT_MSG_TYPE` = 5u;
public const val `CMSG_HASHED_DATA_CMS_VERSION`: UInt = 2u;
public const val `CMSG_HASHED_DATA_PKCS_1_5_VERSION`: UInt = 0u;
public const val `CMSG_HASHED_DATA_V0`: UInt = 0u;
public const val `CMSG_HASHED_DATA_V2`: UInt = 2u;
// UNSUPPORTED Rust 4437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_HASHED_ENCODE_INFO {
//     pub cbSize: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvHashAuxInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4445:1: declaration Impl has no candidate rule
// impl Default for CMSG_HASHED_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_HASH_ALGORITHM_PARAM`: UInt = 20u;
public const val `CMSG_HASH_DATA_PARAM`: UInt = 21u;
public const val `CMSG_INDEFINITE_LENGTH`: UInt = 4294967295u;
public const val `CMSG_INNER_CONTENT_TYPE_PARAM`: UInt = 4u;
public const val `CMSG_KEY_AGREE_ENCRYPT_FREE_MATERIAL_FLAG`: UInt = 2u;
public const val `CMSG_KEY_AGREE_ENCRYPT_FREE_OBJID_FLAG`: UInt = 32u;
public const val `CMSG_KEY_AGREE_ENCRYPT_FREE_PARA_FLAG`: UInt = 1u;
public const val `CMSG_KEY_AGREE_ENCRYPT_FREE_PUBKEY_ALG_FLAG`: UInt = 4u;
public const val `CMSG_KEY_AGREE_ENCRYPT_FREE_PUBKEY_BITS_FLAG`: UInt = 16u;
public const val `CMSG_KEY_AGREE_ENCRYPT_FREE_PUBKEY_PARA_FLAG`: UInt = 8u;
// UNSUPPORTED Rust 4460:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_KEY_AGREE_ENCRYPT_INFO {
//     pub cbSize: u32,
//     pub dwRecipientIndex: u32,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub UserKeyingMaterial: CRYPT_INTEGER_BLOB,
//     pub dwOriginatorChoice: CMSG_KEY_AGREE_ORIGINATOR,
//     pub Anonymous: CMSG_KEY_AGREE_ENCRYPT_INFO_0,
//     pub cKeyAgreeKeyEncryptInfo: u32,
//     pub rgpKeyAgreeKeyEncryptInfo: *mut *mut CMSG_KEY_AGREE_KEY_ENCRYPT_INFO,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 4473:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_AGREE_ENCRYPT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4478:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_KEY_AGREE_ENCRYPT_INFO_0 {
//     pub OriginatorCertId: CERT_ID,
//     pub OriginatorPublicKeyInfo: CERT_PUBLIC_KEY_INFO,
// }

// UNSUPPORTED Rust 4484:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_AGREE_ENCRYPT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_KEY_AGREE_EPHEMERAL_KEY_CHOICE`: `CMSG_KEY_AGREE_OPTION` = 1u;
// UNSUPPORTED Rust 4490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_KEY_AGREE_KEY_ENCRYPT_INFO {
//     pub cbSize: u32,
//     pub EncryptedKey: CRYPT_INTEGER_BLOB,
// }

public typealias `CMSG_KEY_AGREE_OPTION` = UInt;
public typealias `CMSG_KEY_AGREE_ORIGINATOR` = UInt;
public const val `CMSG_KEY_AGREE_ORIGINATOR_CERT`: `CMSG_KEY_AGREE_ORIGINATOR` = 1u;
public const val `CMSG_KEY_AGREE_ORIGINATOR_PUBLIC_KEY`: `CMSG_KEY_AGREE_ORIGINATOR` = 2u;
public const val `CMSG_KEY_AGREE_RECIPIENT`: UInt = 2u;
// UNSUPPORTED Rust 4501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO {
//     pub cbSize: u32,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvKeyEncryptionAuxInfo: *mut core::ffi::c_void,
//     pub KeyWrapAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvKeyWrapAuxInfo: *mut core::ffi::c_void,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub dwKeySpec: u32,
//     pub dwKeyChoice: CMSG_KEY_AGREE_OPTION,
//     pub Anonymous: CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO_0,
//     pub UserKeyingMaterial: CRYPT_INTEGER_BLOB,
//     pub cRecipientEncryptedKeys: u32,
//     pub rgpRecipientEncryptedKeys: *mut *mut CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO,
// }

// UNSUPPORTED Rust 4517:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4522:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO_0 {
//     pub pEphemeralAlgorithm: *mut CRYPT_ALGORITHM_IDENTIFIER,
//     pub pSenderId: *mut CERT_ID,
// }

// UNSUPPORTED Rust 4528:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_KEY_AGREE_RECIPIENT_INFO {
//     pub dwVersion: u32,
//     pub dwOriginatorChoice: CMSG_KEY_AGREE_ORIGINATOR,
//     pub Anonymous: CMSG_KEY_AGREE_RECIPIENT_INFO_0,
//     pub UserKeyingMaterial: CRYPT_INTEGER_BLOB,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub cRecipientEncryptedKeys: u32,
//     pub rgpRecipientEncryptedKeys: *mut *mut CMSG_RECIPIENT_ENCRYPTED_KEY_INFO,
// }

// UNSUPPORTED Rust 4544:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_AGREE_RECIPIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4549:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_KEY_AGREE_RECIPIENT_INFO_0 {
//     pub OriginatorCertId: CERT_ID,
//     pub OriginatorPublicKeyInfo: CERT_PUBLIC_KEY_INFO,
// }

// UNSUPPORTED Rust 4555:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_AGREE_RECIPIENT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_KEY_AGREE_STATIC_KEY_CHOICE`: `CMSG_KEY_AGREE_OPTION` = 2u;
public const val `CMSG_KEY_AGREE_VERSION`: UInt = 3u;
public const val `CMSG_KEY_TRANS_CMS_VERSION`: UInt = 2u;
public const val `CMSG_KEY_TRANS_ENCRYPT_FREE_OBJID_FLAG`: UInt = 2u;
public const val `CMSG_KEY_TRANS_ENCRYPT_FREE_PARA_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 4565:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_KEY_TRANS_ENCRYPT_INFO {
//     pub cbSize: u32,
//     pub dwRecipientIndex: u32,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EncryptedKey: CRYPT_INTEGER_BLOB,
//     pub dwFlags: u32,
// }

public const val `CMSG_KEY_TRANS_PKCS_1_5_VERSION`: UInt = 0u;
public const val `CMSG_KEY_TRANS_RECIPIENT`: UInt = 1u;
// UNSUPPORTED Rust 4576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO {
//     pub cbSize: u32,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvKeyEncryptionAuxInfo: *mut core::ffi::c_void,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub RecipientPublicKey: CRYPT_BIT_BLOB,
//     pub RecipientId: CERT_ID,
// }

// UNSUPPORTED Rust 4586:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4591:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_KEY_TRANS_RECIPIENT_INFO {
//     pub dwVersion: u32,
//     pub RecipientId: CERT_ID,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EncryptedKey: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 4599:1: declaration Impl has no candidate rule
// impl Default for CMSG_KEY_TRANS_RECIPIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_LENGTH_ONLY_FLAG`: UInt = 2u;
public const val `CMSG_MAIL_LIST_ENCRYPT_FREE_OBJID_FLAG`: UInt = 2u;
public const val `CMSG_MAIL_LIST_ENCRYPT_FREE_PARA_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 4607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_MAIL_LIST_ENCRYPT_INFO {
//     pub cbSize: u32,
//     pub dwRecipientIndex: u32,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EncryptedKey: CRYPT_INTEGER_BLOB,
//     pub dwFlags: u32,
// }

public const val `CMSG_MAIL_LIST_HANDLE_KEY_CHOICE`: UInt = 1u;
public const val `CMSG_MAIL_LIST_RECIPIENT`: UInt = 3u;
// UNSUPPORTED Rust 4618:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO {
//     pub cbSize: u32,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvKeyEncryptionAuxInfo: *mut core::ffi::c_void,
//     pub hCryptProv: usize,
//     pub dwKeyChoice: u32,
//     pub Anonymous: CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO_0,
//     pub KeyId: CRYPT_INTEGER_BLOB,
//     pub Date: super::super::Foundation::FILETIME,
//     pub pOtherAttr: *mut CRYPT_ATTRIBUTE_TYPE_VALUE,
// }

// UNSUPPORTED Rust 4631:1: declaration Impl has no candidate rule
// impl Default for CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4636:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO_0 {
//     pub hKeyEncryptionKey: usize,
//     pub pvKeyEncryptionKey: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4642:1: declaration Impl has no candidate rule
// impl Default for CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4647:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_MAIL_LIST_RECIPIENT_INFO {
//     pub dwVersion: u32,
//     pub KeyId: CRYPT_INTEGER_BLOB,
//     pub KeyEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EncryptedKey: CRYPT_INTEGER_BLOB,
//     pub Date: super::super::Foundation::FILETIME,
//     pub pOtherAttr: *mut CRYPT_ATTRIBUTE_TYPE_VALUE,
// }

// UNSUPPORTED Rust 4657:1: declaration Impl has no candidate rule
// impl Default for CMSG_MAIL_LIST_RECIPIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_MAIL_LIST_VERSION`: UInt = 4u;
public const val `CMSG_MAX_LENGTH_FLAG`: UInt = 32u;
// UNSUPPORTED Rust 4664:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CAPI1_EXPORT_KEY_AGREE_FUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptMsgDllExportKeyAgree");

// UNSUPPORTED Rust 4665:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CAPI1_EXPORT_KEY_TRANS_FUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptMsgDllExportKeyTrans");

// UNSUPPORTED Rust 4666:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CAPI1_EXPORT_MAIL_LIST_FUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptMsgDllExportMailList");

// UNSUPPORTED Rust 4667:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CAPI1_GEN_CONTENT_ENCRYPT_KEY_FUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptMsgDllGenContentEncryptKey");

// UNSUPPORTED Rust 4668:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CAPI1_IMPORT_KEY_AGREE_FUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptMsgDllImportKeyAgree");

// UNSUPPORTED Rust 4669:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CAPI1_IMPORT_KEY_TRANS_FUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptMsgDllImportKeyTrans");

// UNSUPPORTED Rust 4670:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CAPI1_IMPORT_MAIL_LIST_FUNC: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptMsgDllImportMailList");

// UNSUPPORTED Rust 4671:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CNG_EXPORT_KEY_AGREE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllCNGExportKeyAgree");

// UNSUPPORTED Rust 4672:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CNG_EXPORT_KEY_TRANS_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllCNGExportKeyTrans");

// UNSUPPORTED Rust 4673:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CNG_GEN_CONTENT_ENCRYPT_KEY_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllCNGGenContentEncryptKey");

// UNSUPPORTED Rust 4674:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CNG_IMPORT_CONTENT_ENCRYPT_KEY_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllCNGImportContentEncryptKey");

// UNSUPPORTED Rust 4675:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CNG_IMPORT_KEY_AGREE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllCNGImportKeyAgree");

// UNSUPPORTED Rust 4676:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_CNG_IMPORT_KEY_TRANS_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllCNGImportKeyTrans");

// UNSUPPORTED Rust 4677:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_EXPORT_ENCRYPT_KEY_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllExportEncryptKey");

// UNSUPPORTED Rust 4678:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_EXPORT_KEY_AGREE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllExportKeyAgree");

// UNSUPPORTED Rust 4679:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_EXPORT_KEY_TRANS_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllExportKeyTrans");

// UNSUPPORTED Rust 4680:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_EXPORT_MAIL_LIST_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllExportMailList");

// UNSUPPORTED Rust 4681:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_GEN_CONTENT_ENCRYPT_KEY_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllGenContentEncryptKey");

// UNSUPPORTED Rust 4682:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_GEN_ENCRYPT_KEY_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllGenEncryptKey");

// UNSUPPORTED Rust 4683:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_IMPORT_ENCRYPT_KEY_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllImportEncryptKey");

// UNSUPPORTED Rust 4684:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_IMPORT_KEY_AGREE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllImportKeyAgree");

// UNSUPPORTED Rust 4685:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_IMPORT_KEY_TRANS_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllImportKeyTrans");

// UNSUPPORTED Rust 4686:1: non-scalar type Ptr unsupported
// pub const CMSG_OID_IMPORT_MAIL_LIST_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptMsgDllImportMailList");

// UNSUPPORTED Rust 4687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_RC2_AUX_INFO {
//     pub cbSize: u32,
//     pub dwBitLen: u32,
// }

// UNSUPPORTED Rust 4693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_RC4_AUX_INFO {
//     pub cbSize: u32,
//     pub dwBitLen: u32,
// }

public const val `CMSG_RC4_NO_SALT_FLAG`: UInt = 1073741824u;
public const val `CMSG_RECIPIENT_COUNT_PARAM`: UInt = 17u;
// UNSUPPORTED Rust 4701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_RECIPIENT_ENCODE_INFO {
//     pub dwRecipientChoice: u32,
//     pub Anonymous: CMSG_RECIPIENT_ENCODE_INFO_0,
// }

// UNSUPPORTED Rust 4707:1: declaration Impl has no candidate rule
// impl Default for CMSG_RECIPIENT_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4712:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_RECIPIENT_ENCODE_INFO_0 {
//     pub pKeyTrans: *mut CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO,
//     pub pKeyAgree: *mut CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO,
//     pub pMailList: *mut CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO,
// }

// UNSUPPORTED Rust 4719:1: declaration Impl has no candidate rule
// impl Default for CMSG_RECIPIENT_ENCODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4724:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO {
//     pub cbSize: u32,
//     pub RecipientPublicKey: CRYPT_BIT_BLOB,
//     pub RecipientId: CERT_ID,
//     pub Date: super::super::Foundation::FILETIME,
//     pub pOtherAttr: *mut CRYPT_ATTRIBUTE_TYPE_VALUE,
// }

// UNSUPPORTED Rust 4733:1: declaration Impl has no candidate rule
// impl Default for CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_RECIPIENT_ENCRYPTED_KEY_INFO {
//     pub RecipientId: CERT_ID,
//     pub EncryptedKey: CRYPT_INTEGER_BLOB,
//     pub Date: super::super::Foundation::FILETIME,
//     pub pOtherAttr: *mut CRYPT_ATTRIBUTE_TYPE_VALUE,
// }

// UNSUPPORTED Rust 4746:1: declaration Impl has no candidate rule
// impl Default for CMSG_RECIPIENT_ENCRYPTED_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_RECIPIENT_INDEX_PARAM`: UInt = 18u;
public const val `CMSG_RECIPIENT_INFO_PARAM`: UInt = 19u;
public const val `CMSG_SIGNED`: `CRYPT_MSG_TYPE` = 2u;
public const val `CMSG_SIGNED_AND_ENVELOPED`: `CRYPT_MSG_TYPE` = 4u;
// UNSUPPORTED Rust 4755:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO {
//     pub cbSize: u32,
//     pub SignedInfo: CMSG_SIGNED_ENCODE_INFO,
//     pub EnvelopedInfo: CMSG_ENVELOPED_ENCODE_INFO,
// }

public const val `CMSG_SIGNED_DATA_CMS_VERSION`: UInt = 3u;
public const val `CMSG_SIGNED_DATA_NO_SIGN_FLAG`: UInt = 128u;
public const val `CMSG_SIGNED_DATA_PKCS_1_5_VERSION`: UInt = 1u;
public const val `CMSG_SIGNED_DATA_V1`: UInt = 1u;
public const val `CMSG_SIGNED_DATA_V3`: UInt = 3u;
// UNSUPPORTED Rust 4767:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_SIGNED_ENCODE_INFO {
//     pub cbSize: u32,
//     pub cSigners: u32,
//     pub rgSigners: *mut CMSG_SIGNER_ENCODE_INFO,
//     pub cCertEncoded: u32,
//     pub rgCertEncoded: *mut CRYPT_INTEGER_BLOB,
//     pub cCrlEncoded: u32,
//     pub rgCrlEncoded: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 4778:1: declaration Impl has no candidate rule
// impl Default for CMSG_SIGNED_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_SIGNER_AUTH_ATTR_PARAM`: UInt = 9u;
public const val `CMSG_SIGNER_CERT_ID_PARAM`: UInt = 38u;
public const val `CMSG_SIGNER_CERT_INFO_PARAM`: UInt = 7u;
public const val `CMSG_SIGNER_COUNT_PARAM`: UInt = 5u;
// UNSUPPORTED Rust 4787:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_SIGNER_ENCODE_INFO {
//     pub cbSize: u32,
//     pub pCertInfo: *mut CERT_INFO,
//     pub Anonymous: CMSG_SIGNER_ENCODE_INFO_0,
//     pub dwKeySpec: u32,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvHashAuxInfo: *mut core::ffi::c_void,
//     pub cAuthAttr: u32,
//     pub rgAuthAttr: *mut CRYPT_ATTRIBUTE,
//     pub cUnauthAttr: u32,
//     pub rgUnauthAttr: *mut CRYPT_ATTRIBUTE,
// }

// UNSUPPORTED Rust 4801:1: declaration Impl has no candidate rule
// impl Default for CMSG_SIGNER_ENCODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4806:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CMSG_SIGNER_ENCODE_INFO_0 {
//     pub hCryptProv: usize,
//     pub hNCryptKey: NCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 4812:1: declaration Impl has no candidate rule
// impl Default for CMSG_SIGNER_ENCODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_SIGNER_HASH_ALGORITHM_PARAM`: UInt = 8u;
// UNSUPPORTED Rust 4818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_SIGNER_INFO {
//     pub dwVersion: u32,
//     pub Issuer: CRYPT_INTEGER_BLOB,
//     pub SerialNumber: CRYPT_INTEGER_BLOB,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub HashEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EncryptedHash: CRYPT_INTEGER_BLOB,
//     pub AuthAttrs: CRYPT_ATTRIBUTES,
//     pub UnauthAttrs: CRYPT_ATTRIBUTES,
// }

public const val `CMSG_SIGNER_INFO_CMS_VERSION`: UInt = 3u;
public const val `CMSG_SIGNER_INFO_PARAM`: UInt = 6u;
public const val `CMSG_SIGNER_INFO_PKCS_1_5_VERSION`: UInt = 1u;
public const val `CMSG_SIGNER_INFO_V1`: UInt = 1u;
public const val `CMSG_SIGNER_INFO_V3`: UInt = 3u;
public const val `CMSG_SIGNER_ONLY_FLAG`: UInt = 2u;
public const val `CMSG_SIGNER_UNAUTH_ATTR_PARAM`: UInt = 10u;
// UNSUPPORTED Rust 4837:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CMSG_SP3_COMPATIBLE_AUX_INFO {
//     pub cbSize: u32,
//     pub dwFlags: u32,
// }

public const val `CMSG_SP3_COMPATIBLE_ENCRYPT_FLAG`: UInt = 2147483648u;
// UNSUPPORTED Rust 4844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMSG_STREAM_INFO {
//     pub cbContent: u32,
//     pub pfnStreamOutput: PFN_CMSG_STREAM_OUTPUT,
//     pub pvArg: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4851:1: declaration Impl has no candidate rule
// impl Default for CMSG_STREAM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMSG_TRUSTED_SIGNER_FLAG`: UInt = 1u;
public const val `CMSG_TYPE_PARAM`: UInt = 1u;
public const val `CMSG_UNPROTECTED_ATTR_PARAM`: UInt = 37u;
public const val `CMSG_USE_SIGNER_INDEX_FLAG`: UInt = 4u;
public const val `CMSG_VERIFY_COUNTER_SIGN_ENABLE_STRONG_FLAG`: UInt = 1u;
public const val `CMSG_VERIFY_SIGNER_CERT`: UInt = 2u;
public const val `CMSG_VERIFY_SIGNER_CHAIN`: UInt = 3u;
public const val `CMSG_VERIFY_SIGNER_NULL`: UInt = 4u;
public const val `CMSG_VERIFY_SIGNER_PUBKEY`: UInt = 1u;
public const val `CMSG_VERSION_PARAM`: UInt = 30u;
// UNSUPPORTED Rust 4866:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMS_DH_KEY_INFO {
//     pub dwVersion: u32,
//     pub Algid: ALG_ID,
//     pub pszContentEncObjId: windows_sys::core::PSTR,
//     pub PubInfo: CRYPT_INTEGER_BLOB,
//     pub pReserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4875:1: declaration Impl has no candidate rule
// impl Default for CMS_DH_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4880:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMS_KEY_INFO {
//     pub dwVersion: u32,
//     pub Algid: ALG_ID,
//     pub pbOID: *mut u8,
//     pub cbOID: u32,
// }

// UNSUPPORTED Rust 4888:1: declaration Impl has no candidate rule
// impl Default for CMS_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4893:1: non-scalar type Ptr unsupported
// pub const CMS_SIGNER_INFO: windows_sys::core::PCSTR = 501i32 as _;

// UNSUPPORTED Rust 4894:1: non-scalar type Ptr unsupported
// pub const CNG_RSA_PRIVATE_KEY_BLOB: windows_sys::core::PCSTR = 83i32 as _;

// UNSUPPORTED Rust 4895:1: non-scalar type Ptr unsupported
// pub const CNG_RSA_PUBLIC_KEY_BLOB: windows_sys::core::PCSTR = 72i32 as _;

// UNSUPPORTED Rust 4896:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONTAINER_INFO {
//     pub dwVersion: u32,
//     pub dwReserved: u32,
//     pub cbSigPublicKey: u32,
//     pub pbSigPublicKey: *mut u8,
//     pub cbKeyExPublicKey: u32,
//     pub pbKeyExPublicKey: *mut u8,
// }

// UNSUPPORTED Rust 4906:1: declaration Impl has no candidate rule
// impl Default for CONTAINER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONTAINER_INFO_CURRENT_VERSION`: UInt = 1u;
public const val `CONTAINER_MAP_DEFAULT_CONTAINER`: UInt = 2u;
// UNSUPPORTED Rust 4913:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONTAINER_MAP_RECORD {
//     pub wszGuid: [u16; 40],
//     pub bFlags: u8,
//     pub bReserved: u8,
//     pub wSigKeySizeBits: u16,
//     pub wKeyExchangeKeySizeBits: u16,
// }

// UNSUPPORTED Rust 4922:1: declaration Impl has no candidate rule
// impl Default for CONTAINER_MAP_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONTAINER_MAP_VALID_CONTAINER`: UInt = 1u;
// UNSUPPORTED Rust 4928:1: non-scalar type Ptr unsupported
// pub const CONTEXT_OID_CAPI2_ANY: windows_sys::core::PCSTR = 5i32 as _;

// UNSUPPORTED Rust 4929:1: non-scalar type Ptr unsupported
// pub const CONTEXT_OID_CERTIFICATE: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 4930:1: non-scalar type Ptr unsupported
// pub const CONTEXT_OID_CREATE_OBJECT_CONTEXT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("ContextDllCreateObjectContext");

// UNSUPPORTED Rust 4931:1: non-scalar type Ptr unsupported
// pub const CONTEXT_OID_CRL: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 4932:1: non-scalar type Ptr unsupported
// pub const CONTEXT_OID_CTL: windows_sys::core::PCSTR = 3i32 as _;

// UNSUPPORTED Rust 4933:1: non-scalar type Ptr unsupported
// pub const CONTEXT_OID_OCSP_RESP: windows_sys::core::PCSTR = 6i32 as _;

// UNSUPPORTED Rust 4934:1: non-scalar type Ptr unsupported
// pub const CONTEXT_OID_PKCS7: windows_sys::core::PCSTR = 4i32 as _;

// UNSUPPORTED Rust 4935:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPS_URLS {
//     pub pszURL: windows_sys::core::PWSTR,
//     pub pAlgorithm: *mut CRYPT_ALGORITHM_IDENTIFIER,
//     pub pDigest: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 4942:1: declaration Impl has no candidate rule
// impl Default for CPS_URLS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CP_CACHE_MODE_GLOBAL_CACHE`: UInt = 1u;
public const val `CP_CACHE_MODE_NO_CACHE`: UInt = 3u;
public const val `CP_CACHE_MODE_SESSION_ONLY`: UInt = 2u;
// UNSUPPORTED Rust 4950:1: non-scalar type Ptr unsupported
// pub const CP_CARD_AUTHENTICATED_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("Authenticated State");

// UNSUPPORTED Rust 4951:1: non-scalar type Ptr unsupported
// pub const CP_CARD_CACHE_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("Cache Mode");

// UNSUPPORTED Rust 4952:1: non-scalar type Ptr unsupported
// pub const CP_CARD_CAPABILITIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Capabilities");

// UNSUPPORTED Rust 4953:1: non-scalar type Ptr unsupported
// pub const CP_CARD_FREE_SPACE: windows_sys::core::PCWSTR = windows_sys::core::w!("Free Space");

// UNSUPPORTED Rust 4954:1: non-scalar type Ptr unsupported
// pub const CP_CARD_GUID: windows_sys::core::PCWSTR = windows_sys::core::w!("Card Identifier");

// UNSUPPORTED Rust 4955:1: non-scalar type Ptr unsupported
// pub const CP_CARD_KEYSIZES: windows_sys::core::PCWSTR = windows_sys::core::w!("Key Sizes");

// UNSUPPORTED Rust 4956:1: non-scalar type Ptr unsupported
// pub const CP_CARD_LIST_PINS: windows_sys::core::PCWSTR = windows_sys::core::w!("PIN List");

// UNSUPPORTED Rust 4957:1: non-scalar type Ptr unsupported
// pub const CP_CARD_PIN_INFO: windows_sys::core::PCWSTR = windows_sys::core::w!("PIN Information");

// UNSUPPORTED Rust 4958:1: non-scalar type Ptr unsupported
// pub const CP_CARD_PIN_STRENGTH_CHANGE: windows_sys::core::PCWSTR = windows_sys::core::w!("PIN Strength Change");

// UNSUPPORTED Rust 4959:1: non-scalar type Ptr unsupported
// pub const CP_CARD_PIN_STRENGTH_UNBLOCK: windows_sys::core::PCWSTR = windows_sys::core::w!("PIN Strength Unblock");

// UNSUPPORTED Rust 4960:1: non-scalar type Ptr unsupported
// pub const CP_CARD_PIN_STRENGTH_VERIFY: windows_sys::core::PCWSTR = windows_sys::core::w!("PIN Strength Verify");

// UNSUPPORTED Rust 4961:1: non-scalar type Ptr unsupported
// pub const CP_CARD_PIV: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Card");

// UNSUPPORTED Rust 4962:1: non-scalar type Ptr unsupported
// pub const CP_CARD_READ_ONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("Read Only Mode");

// UNSUPPORTED Rust 4963:1: non-scalar type Ptr unsupported
// pub const CP_CARD_SERIAL_NO: windows_sys::core::PCWSTR = windows_sys::core::w!("Card Serial Number");

// UNSUPPORTED Rust 4964:1: non-scalar type Ptr unsupported
// pub const CP_CHAINING_MODES: windows_sys::core::PCWSTR = windows_sys::core::w!("Chaining Modes");

// UNSUPPORTED Rust 4965:1: non-scalar type Ptr unsupported
// pub const CP_ENUM_ALGORITHMS: windows_sys::core::PCWSTR = windows_sys::core::w!("Algorithms");

// UNSUPPORTED Rust 4966:1: non-scalar type Ptr unsupported
// pub const CP_KEY_IMPORT_SUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("Key Import Support");

// UNSUPPORTED Rust 4967:1: non-scalar type Ptr unsupported
// pub const CP_PADDING_SCHEMES: windows_sys::core::PCWSTR = windows_sys::core::w!("Padding Schemes");

// UNSUPPORTED Rust 4968:1: non-scalar type Ptr unsupported
// pub const CP_PARENT_WINDOW: windows_sys::core::PCWSTR = windows_sys::core::w!("Parent Window");

// UNSUPPORTED Rust 4969:1: non-scalar type Ptr unsupported
// pub const CP_PIN_CONTEXT_STRING: windows_sys::core::PCWSTR = windows_sys::core::w!("PIN Context String");

// UNSUPPORTED Rust 4970:1: non-scalar type Ptr unsupported
// pub const CP_PIV_CARD_CAPABILITY_CONTAINER: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV CCC");

// UNSUPPORTED Rust 4971:1: non-scalar type Ptr unsupported
// pub const CP_PIV_CARD_HOLDER_UNIQUE_IDENTIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV CHUID");

// UNSUPPORTED Rust 4972:1: non-scalar type Ptr unsupported
// pub const CP_PIV_CARD_HOLDER_UNSIGNED_UNIQUE_IDENTIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV UCHUID");

// UNSUPPORTED Rust 4973:1: non-scalar type Ptr unsupported
// pub const CP_PIV_CERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Certificate");

// UNSUPPORTED Rust 4974:1: non-scalar type Ptr unsupported
// pub const CP_PIV_FACIAL_IMAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Facial Image");

// UNSUPPORTED Rust 4975:1: non-scalar type Ptr unsupported
// pub const CP_PIV_FINGERPRINT: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Fingerprint");

// UNSUPPORTED Rust 4976:1: non-scalar type Ptr unsupported
// pub const CP_PIV_GENERATE_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Generate Key");

// UNSUPPORTED Rust 4977:1: non-scalar type Ptr unsupported
// pub const CP_PIV_KEY_HISTORY_OBJECT: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Key History Object");

// UNSUPPORTED Rust 4978:1: non-scalar type Ptr unsupported
// pub const CP_PIV_PRINTED_INFORMATION: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Printed Information");

// UNSUPPORTED Rust 4979:1: non-scalar type Ptr unsupported
// pub const CP_PIV_PUBLIC_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Public Key");

// UNSUPPORTED Rust 4980:1: non-scalar type Ptr unsupported
// pub const CP_PIV_SECURITY_OBJECT: windows_sys::core::PCWSTR = windows_sys::core::w!("PIV Security Object");

// UNSUPPORTED Rust 4981:1: non-scalar type Ptr unsupported
// pub const CP_SUPPORTS_WIN_X509_ENROLLMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("Supports Windows x.509 Enrollment");

public const val `CREDENTIAL_OID_PASSWORD_CREDENTIALS`: Int = 2;
// UNSUPPORTED Rust 4983:1: non-scalar type Ptr unsupported
// pub const CREDENTIAL_OID_PASSWORD_CREDENTIALS_A: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 4984:1: non-scalar type Ptr unsupported
// pub const CREDENTIAL_OID_PASSWORD_CREDENTIALS_W: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 4985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_CONTEXT {
//     pub dwCertEncodingType: CERT_QUERY_ENCODING_TYPE,
//     pub pbCrlEncoded: *mut u8,
//     pub cbCrlEncoded: u32,
//     pub pCrlInfo: *mut CRL_INFO,
//     pub hCertStore: HCERTSTORE,
// }

// UNSUPPORTED Rust 4994:1: declaration Impl has no candidate rule
// impl Default for CRL_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4999:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_DIST_POINT {
//     pub DistPointName: CRL_DIST_POINT_NAME,
//     pub ReasonFlags: CRYPT_BIT_BLOB,
//     pub CRLIssuer: CERT_ALT_NAME_INFO,
// }

// UNSUPPORTED Rust 5006:1: declaration Impl has no candidate rule
// impl Default for CRL_DIST_POINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5011:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_DIST_POINTS_INFO {
//     pub cDistPoint: u32,
//     pub rgDistPoint: *mut CRL_DIST_POINT,
// }

// UNSUPPORTED Rust 5017:1: declaration Impl has no candidate rule
// impl Default for CRL_DIST_POINTS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRL_DIST_POINT_ERR_CRL_ISSUER_BIT`: Int = -2147483648;
public const val `CRL_DIST_POINT_ERR_INDEX_MASK`: UInt = 127u;
public const val `CRL_DIST_POINT_ERR_INDEX_SHIFT`: UInt = 24u;
public const val `CRL_DIST_POINT_FULL_NAME`: UInt = 1u;
public const val `CRL_DIST_POINT_ISSUER_RDN_NAME`: UInt = 2u;
// UNSUPPORTED Rust 5027:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_DIST_POINT_NAME {
//     pub dwDistPointNameChoice: u32,
//     pub Anonymous: CRL_DIST_POINT_NAME_0,
// }

// UNSUPPORTED Rust 5033:1: declaration Impl has no candidate rule
// impl Default for CRL_DIST_POINT_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5038:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRL_DIST_POINT_NAME_0 {
//     pub FullName: CERT_ALT_NAME_INFO,
// }

// UNSUPPORTED Rust 5043:1: declaration Impl has no candidate rule
// impl Default for CRL_DIST_POINT_NAME_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRL_DIST_POINT_NO_NAME`: UInt = 0u;
// UNSUPPORTED Rust 5049:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_ENTRY {
//     pub SerialNumber: CRYPT_INTEGER_BLOB,
//     pub RevocationDate: super::super::Foundation::FILETIME,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 5057:1: declaration Impl has no candidate rule
// impl Default for CRL_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRL_FIND_ANY`: UInt = 0u;
public const val `CRL_FIND_EXISTING`: UInt = 2u;
public const val `CRL_FIND_ISSUED_BY`: UInt = 1u;
public const val `CRL_FIND_ISSUED_BY_AKI_FLAG`: UInt = 1u;
public const val `CRL_FIND_ISSUED_BY_BASE_FLAG`: UInt = 8u;
public const val `CRL_FIND_ISSUED_BY_DELTA_FLAG`: UInt = 4u;
public const val `CRL_FIND_ISSUED_BY_SIGNATURE_FLAG`: UInt = 2u;
public const val `CRL_FIND_ISSUED_FOR`: UInt = 3u;
// UNSUPPORTED Rust 5070:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_FIND_ISSUED_FOR_PARA {
//     pub pSubjectCert: *const CERT_CONTEXT,
//     pub pIssuerCert: *const CERT_CONTEXT,
// }

// UNSUPPORTED Rust 5076:1: declaration Impl has no candidate rule
// impl Default for CRL_FIND_ISSUED_FOR_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRL_FIND_ISSUED_FOR_SET_STRONG_PROPERTIES_FLAG`: UInt = 16u;
// UNSUPPORTED Rust 5082:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_INFO {
//     pub dwVersion: u32,
//     pub SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub Issuer: CRYPT_INTEGER_BLOB,
//     pub ThisUpdate: super::super::Foundation::FILETIME,
//     pub NextUpdate: super::super::Foundation::FILETIME,
//     pub cCRLEntry: u32,
//     pub rgCRLEntry: *mut CRL_ENTRY,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 5095:1: declaration Impl has no candidate rule
// impl Default for CRL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_ISSUING_DIST_POINT {
//     pub DistPointName: CRL_DIST_POINT_NAME,
//     pub fOnlyContainsUserCerts: windows_sys::core::BOOL,
//     pub fOnlyContainsCACerts: windows_sys::core::BOOL,
//     pub OnlySomeReasonFlags: CRYPT_BIT_BLOB,
//     pub fIndirectCRL: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5109:1: declaration Impl has no candidate rule
// impl Default for CRL_ISSUING_DIST_POINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRL_REASON_AA_COMPROMISE`: UInt = 10u;
public const val `CRL_REASON_AA_COMPROMISE_FLAG`: UInt = 128u;
public const val `CRL_REASON_AFFILIATION_CHANGED`: `CERT_REVOCATION_STATUS_REASON` = 3u;
public const val `CRL_REASON_AFFILIATION_CHANGED_FLAG`: UInt = 16u;
public const val `CRL_REASON_CA_COMPROMISE`: `CERT_REVOCATION_STATUS_REASON` = 2u;
public const val `CRL_REASON_CA_COMPROMISE_FLAG`: UInt = 32u;
public const val `CRL_REASON_CERTIFICATE_HOLD`: `CERT_REVOCATION_STATUS_REASON` = 6u;
public const val `CRL_REASON_CERTIFICATE_HOLD_FLAG`: UInt = 2u;
public const val `CRL_REASON_CESSATION_OF_OPERATION`: `CERT_REVOCATION_STATUS_REASON` = 5u;
public const val `CRL_REASON_CESSATION_OF_OPERATION_FLAG`: UInt = 4u;
public const val `CRL_REASON_KEY_COMPROMISE`: `CERT_REVOCATION_STATUS_REASON` = 1u;
public const val `CRL_REASON_KEY_COMPROMISE_FLAG`: UInt = 64u;
public const val `CRL_REASON_PRIVILEGE_WITHDRAWN`: UInt = 9u;
public const val `CRL_REASON_PRIVILEGE_WITHDRAWN_FLAG`: UInt = 1u;
public const val `CRL_REASON_REMOVE_FROM_CRL`: `CERT_REVOCATION_STATUS_REASON` = 8u;
public const val `CRL_REASON_SUPERSEDED`: `CERT_REVOCATION_STATUS_REASON` = 4u;
public const val `CRL_REASON_SUPERSEDED_FLAG`: UInt = 8u;
public const val `CRL_REASON_UNSPECIFIED`: `CERT_REVOCATION_STATUS_REASON` = 0u;
public const val `CRL_REASON_UNUSED_FLAG`: UInt = 128u;
// UNSUPPORTED Rust 5133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRL_REVOCATION_INFO {
//     pub pCrlEntry: *mut CRL_ENTRY,
//     pub pCrlContext: *mut CRL_CONTEXT,
//     pub pCrlIssuerChain: *mut CERT_CHAIN_CONTEXT,
// }

// UNSUPPORTED Rust 5140:1: declaration Impl has no candidate rule
// impl Default for CRL_REVOCATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRL_V1`: UInt = 0u;
public const val `CRL_V2`: UInt = 1u;
// UNSUPPORTED Rust 5147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CROSS_CERT_DIST_POINTS_INFO {
//     pub dwSyncDeltaTime: u32,
//     pub cDistPoint: u32,
//     pub rgDistPoint: *mut CERT_ALT_NAME_INFO,
// }

// UNSUPPORTED Rust 5154:1: declaration Impl has no candidate rule
// impl Default for CROSS_CERT_DIST_POINTS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CROSS_CERT_DIST_POINT_ERR_INDEX_MASK`: UInt = 255u;
public const val `CROSS_CERT_DIST_POINT_ERR_INDEX_SHIFT`: UInt = 24u;
public const val `CRYPTNET_CACHED_OCSP_SWITCH_TO_CRL_COUNT_DEFAULT`: UInt = 50u;
// UNSUPPORTED Rust 5162:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CACHED_OCSP_SWITCH_TO_CRL_COUNT_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetCachedOcspSwitchToCrlCount");

public const val `CRYPTNET_CRL_BEFORE_OCSP_ENABLE`: UInt = 4294967295u;
// UNSUPPORTED Rust 5164:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_DISABLE_INFORMATION_EVENTS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableInformationEvents");

// UNSUPPORTED Rust 5165:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_LOG_FILE_NAME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("LogFileName");

// UNSUPPORTED Rust 5166:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_MAX_AGE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxAgeSeconds");

// UNSUPPORTED Rust 5167:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_MIN_AFTER_NEXT_UPDATE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MinAfterNextUpdateSeconds");

// UNSUPPORTED Rust 5168:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_MIN_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MinBeforeNextUpdateSeconds");

// UNSUPPORTED Rust 5169:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_PROCESS_NAME_LIST_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ProcessNameList");

// UNSUPPORTED Rust 5170:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_PUBLISH_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PublishBeforeNextUpdateSeconds");

// UNSUPPORTED Rust 5171:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_PUBLISH_RANDOM_INTERVAL_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PublishRandomIntervalSeconds");

// UNSUPPORTED Rust 5172:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_TIMEOUT_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("TimeoutSeconds");

// UNSUPPORTED Rust 5173:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_CRL_PRE_FETCH_URL_LIST_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PreFetchUrlList");

public const val `CRYPTNET_MAX_CACHED_OCSP_PER_CRL_COUNT_DEFAULT`: UInt = 500u;
// UNSUPPORTED Rust 5175:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_MAX_CACHED_OCSP_PER_CRL_COUNT_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetMaxCachedOcspPerCrlCount");

public const val `CRYPTNET_OCSP_AFTER_CRL_DISABLE`: UInt = 4294967295u;
// UNSUPPORTED Rust 5177:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_AFTER_CURRENT_TIME_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchAfterCurrentTimePreFetchPeriodSeconds");

public const val `CRYPTNET_PRE_FETCH_AFTER_PUBLISH_PRE_FETCH_DIVISOR_DEFAULT`: UInt = 10u;
// UNSUPPORTED Rust 5179:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_AFTER_PUBLISH_PRE_FETCH_DIVISOR_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchAfterPublishPreFetchDivisor");

public const val `CRYPTNET_PRE_FETCH_BEFORE_NEXT_UPDATE_PRE_FETCH_DIVISOR_DEFAULT`: UInt = 20u;
// UNSUPPORTED Rust 5181:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_BEFORE_NEXT_UPDATE_PRE_FETCH_DIVISOR_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchBeforeNextUpdatePreFetchDivisor");

// UNSUPPORTED Rust 5182:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_MAX_AFTER_NEXT_UPDATE_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchMaxAfterNextUpdatePreFetchPeriodSeconds");

// UNSUPPORTED Rust 5183:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_MAX_MAX_AGE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchMaxMaxAgeSeconds");

// UNSUPPORTED Rust 5184:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_MIN_AFTER_NEXT_UPDATE_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchMinAfterNextUpdatePreFetchPeriodSeconds");

// UNSUPPORTED Rust 5185:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_MIN_BEFORE_NEXT_UPDATE_PRE_FETCH_PERIOD_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchMinBeforeNextUpdatePreFetchSeconds");

// UNSUPPORTED Rust 5186:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_MIN_MAX_AGE_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchMinMaxAgeSeconds");

// UNSUPPORTED Rust 5187:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_MIN_OCSP_VALIDITY_PERIOD_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchMinOcspValidityPeriodSeconds");

// UNSUPPORTED Rust 5188:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_RETRIEVAL_TIMEOUT_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchRetrievalTimeoutSeconds");

public const val `CRYPTNET_PRE_FETCH_SCAN_AFTER_TRIGGER_DELAY_SECONDS_DEFAULT`: UInt = 60u;
// UNSUPPORTED Rust 5190:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_SCAN_AFTER_TRIGGER_DELAY_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchScanAfterTriggerDelaySeconds");

public const val `CRYPTNET_PRE_FETCH_TRIGGER_DISABLE`: UInt = 4294967295u;
// UNSUPPORTED Rust 5192:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_TRIGGER_PERIOD_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchTriggerPeriodSeconds");

public const val `CRYPTNET_PRE_FETCH_VALIDITY_PERIOD_AFTER_NEXT_UPDATE_PRE_FETCH_DIVISOR_DEFAULT`: UInt = 10u;
// UNSUPPORTED Rust 5194:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_PRE_FETCH_VALIDITY_PERIOD_AFTER_NEXT_UPDATE_PRE_FETCH_DIVISOR_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetPreFetchValidityPeriodAfterNextUpdatePreFetchDivisor");

public const val `CRYPTNET_URL_CACHE_DEFAULT_FLUSH`: UInt = 0u;
// UNSUPPORTED Rust 5196:1: non-scalar type Ptr unsupported
// pub const CRYPTNET_URL_CACHE_DEFAULT_FLUSH_EXEMPT_SECONDS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptnetDefaultFlushExemptSeconds");

public const val `CRYPTNET_URL_CACHE_DISABLE_FLUSH`: UInt = 4294967295u;
// UNSUPPORTED Rust 5198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPTNET_URL_CACHE_FLUSH_INFO {
//     pub cbSize: u32,
//     pub dwExemptSeconds: u32,
//     pub ExpireTime: super::super::Foundation::FILETIME,
// }

public const val `CRYPTNET_URL_CACHE_PRE_FETCH_AUTOROOT_CAB`: UInt = 5u;
public const val `CRYPTNET_URL_CACHE_PRE_FETCH_BLOB`: UInt = 1u;
public const val `CRYPTNET_URL_CACHE_PRE_FETCH_CRL`: UInt = 2u;
public const val `CRYPTNET_URL_CACHE_PRE_FETCH_DISALLOWED_CERT_CAB`: UInt = 6u;
// UNSUPPORTED Rust 5209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPTNET_URL_CACHE_PRE_FETCH_INFO {
//     pub cbSize: u32,
//     pub dwObjectType: u32,
//     pub dwError: u32,
//     pub dwReserved: u32,
//     pub ThisUpdateTime: super::super::Foundation::FILETIME,
//     pub NextUpdateTime: super::super::Foundation::FILETIME,
//     pub PublishTime: super::super::Foundation::FILETIME,
// }

public const val `CRYPTNET_URL_CACHE_PRE_FETCH_NONE`: UInt = 0u;
public const val `CRYPTNET_URL_CACHE_PRE_FETCH_OCSP`: UInt = 3u;
public const val `CRYPTNET_URL_CACHE_PRE_FETCH_PIN_RULES_CAB`: UInt = 7u;
public const val `CRYPTNET_URL_CACHE_RESPONSE_HTTP`: UInt = 1u;
// UNSUPPORTED Rust 5224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTNET_URL_CACHE_RESPONSE_INFO {
//     pub cbSize: u32,
//     pub wResponseType: u16,
//     pub wResponseFlags: u16,
//     pub LastModifiedTime: super::super::Foundation::FILETIME,
//     pub dwMaxAge: u32,
//     pub pwszETag: windows_sys::core::PCWSTR,
//     pub dwProxyId: u32,
// }

// UNSUPPORTED Rust 5235:1: declaration Impl has no candidate rule
// impl Default for CRYPTNET_URL_CACHE_RESPONSE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTNET_URL_CACHE_RESPONSE_NONE`: UInt = 0u;
public const val `CRYPTNET_URL_CACHE_RESPONSE_VALIDATED`: UInt = 32768u;
public const val `CRYPTPROTECTMEMORY_BLOCK_SIZE`: UInt = 16u;
public const val `CRYPTPROTECTMEMORY_CROSS_PROCESS`: UInt = 1u;
public const val `CRYPTPROTECTMEMORY_SAME_LOGON`: UInt = 2u;
public const val `CRYPTPROTECTMEMORY_SAME_PROCESS`: UInt = 0u;
public const val `CRYPTPROTECT_AUDIT`: UInt = 16u;
public const val `CRYPTPROTECT_CRED_REGENERATE`: UInt = 128u;
public const val `CRYPTPROTECT_CRED_SYNC`: UInt = 8u;
// UNSUPPORTED Rust 5249:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CRYPTPROTECT_DEFAULT_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf9d8cd0_1501_11d1_8c7a_00c04fc297eb);

public const val `CRYPTPROTECT_FIRST_RESERVED_FLAGVAL`: UInt = 268435455u;
public const val `CRYPTPROTECT_LAST_RESERVED_FLAGVAL`: UInt = 4294967295u;
public const val `CRYPTPROTECT_LOCAL_MACHINE`: UInt = 4u;
public const val `CRYPTPROTECT_NO_RECOVERY`: UInt = 32u;
// UNSUPPORTED Rust 5254:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPTPROTECT_PROMPTSTRUCT {
//     pub cbSize: u32,
//     pub dwPromptFlags: u32,
//     pub hwndApp: super::super::Foundation::HWND,
//     pub szPrompt: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 5262:1: declaration Impl has no candidate rule
// impl Default for CRYPTPROTECT_PROMPTSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPTPROTECT_PROMPT_ON_PROTECT`: UInt = 2u;
public const val `CRYPTPROTECT_PROMPT_ON_UNPROTECT`: UInt = 1u;
public const val `CRYPTPROTECT_PROMPT_REQUIRE_STRONG`: UInt = 16u;
public const val `CRYPTPROTECT_PROMPT_RESERVED`: UInt = 4u;
public const val `CRYPTPROTECT_PROMPT_STRONG`: UInt = 8u;
public const val `CRYPTPROTECT_UI_FORBIDDEN`: UInt = 1u;
public const val `CRYPTPROTECT_VERIFY_PROTECTION`: UInt = 64u;
// UNSUPPORTED Rust 5274:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_3DES_KEY_STATE {
//     pub Key: [u8; 24],
//     pub IV: [u8; 8],
//     pub Feedback: [u8; 8],
// }

// UNSUPPORTED Rust 5281:1: declaration Impl has no candidate rule
// impl Default for CRYPT_3DES_KEY_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_ACCUMULATIVE_TIMEOUT`: UInt = 2048u;
public const val `CRYPT_ACQUIRE_ALLOW_NCRYPT_KEY_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 65536u;
public const val `CRYPT_ACQUIRE_CACHE_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 1u;
public const val `CRYPT_ACQUIRE_COMPARE_KEY_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 4u;
public typealias `CRYPT_ACQUIRE_FLAGS` = UInt;
public const val `CRYPT_ACQUIRE_NCRYPT_KEY_FLAGS_MASK`: `CRYPT_ACQUIRE_FLAGS` = 458752u;
public const val `CRYPT_ACQUIRE_NO_HEALING`: `CRYPT_ACQUIRE_FLAGS` = 8u;
public const val `CRYPT_ACQUIRE_ONLY_NCRYPT_KEY_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 262144u;
public const val `CRYPT_ACQUIRE_PREFER_NCRYPT_KEY_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 131072u;
public const val `CRYPT_ACQUIRE_SILENT_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 64u;
public const val `CRYPT_ACQUIRE_USE_PROV_INFO_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 2u;
public const val `CRYPT_ACQUIRE_WINDOW_HANDLE_FLAG`: `CRYPT_ACQUIRE_FLAGS` = 128u;
// UNSUPPORTED Rust 5298:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_AES_128_KEY_STATE {
//     pub Key: [u8; 16],
//     pub IV: [u8; 16],
//     pub EncryptionState: [u8; 176],
//     pub DecryptionState: [u8; 176],
//     pub Feedback: [u8; 16],
// }

// UNSUPPORTED Rust 5307:1: declaration Impl has no candidate rule
// impl Default for CRYPT_AES_128_KEY_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_AES_256_KEY_STATE {
//     pub Key: [u8; 32],
//     pub IV: [u8; 16],
//     pub EncryptionState: [u8; 240],
//     pub DecryptionState: [u8; 240],
//     pub Feedback: [u8; 16],
// }

// UNSUPPORTED Rust 5321:1: declaration Impl has no candidate rule
// impl Default for CRYPT_AES_256_KEY_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_AIA_RETRIEVAL`: UInt = 524288u;
// UNSUPPORTED Rust 5327:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ALGORITHM_IDENTIFIER {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub Parameters: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5333:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ALGORITHM_IDENTIFIER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_ALL_FUNCTIONS`: `BCRYPT_RESOLVE_PROVIDERS_FLAGS` = 1u;
public const val `CRYPT_ALL_PROVIDERS`: `BCRYPT_RESOLVE_PROVIDERS_FLAGS` = 2u;
public const val `CRYPT_ANY`: `BCRYPT_QUERY_PROVIDER_MODE` = 4u;
public const val `CRYPT_ARCHIVABLE`: `CRYPT_KEY_FLAGS` = 16384u;
public const val `CRYPT_ARCHIVE`: UInt = 256u;
public const val `CRYPT_ASN_ENCODING`: UInt = 1u;
public const val `CRYPT_ASYNC_RETRIEVAL`: UInt = 16u;
// UNSUPPORTED Rust 5345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ASYNC_RETRIEVAL_COMPLETION {
//     pub pfnCompletion: PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC,
//     pub pvCompletion: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5351:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ASYNC_RETRIEVAL_COMPLETION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ATTRIBUTE {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub cValue: u32,
//     pub rgValue: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5363:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ATTRIBUTES {
//     pub cAttr: u32,
//     pub rgAttr: *mut CRYPT_ATTRIBUTE,
// }

// UNSUPPORTED Rust 5374:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ATTRIBUTE_TYPE_VALUE {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub Value: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5385:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ATTRIBUTE_TYPE_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5390:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_BIT_BLOB {
//     pub cbData: u32,
//     pub pbData: *mut u8,
//     pub cUnusedBits: u32,
// }

// UNSUPPORTED Rust 5397:1: declaration Impl has no candidate rule
// impl Default for CRYPT_BIT_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_BLOB_ARRAY {
//     pub cBlob: u32,
//     pub rgBlob: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5408:1: declaration Impl has no candidate rule
// impl Default for CRYPT_BLOB_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_BLOB_VER3`: `CRYPT_KEY_FLAGS` = 128u;
public const val `CRYPT_CACHE_ONLY_RETRIEVAL`: UInt = 2u;
public const val `CRYPT_CHECK_FRESHNESS_TIME_VALIDITY`: UInt = 1024u;
// UNSUPPORTED Rust 5416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_CONTENT_INFO {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub Content: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5422:1: declaration Impl has no candidate rule
// impl Default for CRYPT_CONTENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5427:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_CONTENT_INFO_SEQUENCE_OF_ANY {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub cValue: u32,
//     pub rgValue: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5434:1: declaration Impl has no candidate rule
// impl Default for CRYPT_CONTENT_INFO_SEQUENCE_OF_ANY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5439:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_CONTEXTS {
//     pub cContexts: u32,
//     pub rgpszContexts: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5445:1: declaration Impl has no candidate rule
// impl Default for CRYPT_CONTEXTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_CONTEXT_CONFIG {
//     pub dwFlags: CRYPT_CONTEXT_CONFIG_FLAGS,
//     pub dwReserved: u32,
// }

public typealias `CRYPT_CONTEXT_CONFIG_FLAGS` = UInt;
// UNSUPPORTED Rust 5457:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_CONTEXT_FUNCTIONS {
//     pub cFunctions: u32,
//     pub rgpszFunctions: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5463:1: declaration Impl has no candidate rule
// impl Default for CRYPT_CONTEXT_FUNCTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_CONTEXT_FUNCTION_CONFIG {
//     pub dwFlags: u32,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 5474:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_CONTEXT_FUNCTION_PROVIDERS {
//     pub cProviders: u32,
//     pub rgpszProviders: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5480:1: declaration Impl has no candidate rule
// impl Default for CRYPT_CONTEXT_FUNCTION_PROVIDERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_CREATE_IV`: `CRYPT_KEY_FLAGS` = 512u;
public const val `CRYPT_CREATE_NEW_FLUSH_ENTRY`: UInt = 268435456u;
public const val `CRYPT_CREATE_SALT`: `CRYPT_KEY_FLAGS` = 4u;
// UNSUPPORTED Rust 5488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_CREDENTIALS {
//     pub cbSize: u32,
//     pub pszCredentialsOid: windows_sys::core::PCSTR,
//     pub pvCredentials: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5495:1: declaration Impl has no candidate rule
// impl Default for CRYPT_CREDENTIALS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5500:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_CSP_PROVIDER {
//     pub dwKeySpec: u32,
//     pub pwszProviderName: windows_sys::core::PWSTR,
//     pub Signature: CRYPT_BIT_BLOB,
// }

// UNSUPPORTED Rust 5507:1: declaration Impl has no candidate rule
// impl Default for CRYPT_CSP_PROVIDER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_DATA_KEY`: `CRYPT_KEY_FLAGS` = 2048u;
public const val `CRYPT_DECODE_ALLOC_FLAG`: UInt = 32768u;
public const val `CRYPT_DECODE_ENABLE_PUNYCODE_FLAG`: UInt = 33554432u;
public const val `CRYPT_DECODE_ENABLE_UTF8PERCENT_FLAG`: UInt = 67108864u;
public const val `CRYPT_DECODE_NOCOPY_FLAG`: UInt = 1u;
public const val `CRYPT_DECODE_NO_SIGNATURE_BYTE_REVERSAL_FLAG`: UInt = 8u;
// UNSUPPORTED Rust 5518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_DECODE_PARA {
//     pub cbSize: u32,
//     pub pfnAlloc: PFN_CRYPT_ALLOC,
//     pub pfnFree: PFN_CRYPT_FREE,
// }

public const val `CRYPT_DECODE_SHARE_OID_STRING_FLAG`: UInt = 4u;
public const val `CRYPT_DECODE_TO_BE_SIGNED_FLAG`: UInt = 2u;
public const val `CRYPT_DECRYPT`: UInt = 2u;
// UNSUPPORTED Rust 5528:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_DECRYPT_MESSAGE_PARA {
//     pub cbSize: u32,
//     pub dwMsgAndCertEncodingType: u32,
//     pub cCertStore: u32,
//     pub rghCertStore: *mut HCERTSTORE,
// }

// UNSUPPORTED Rust 5536:1: declaration Impl has no candidate rule
// impl Default for CRYPT_DECRYPT_MESSAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_DECRYPT_RSA_NO_PADDING_CHECK`: UInt = 32u;
public const val `CRYPT_DEFAULT_CONTAINER_OPTIONAL`: UInt = 128u;
// UNSUPPORTED Rust 5543:1: non-scalar type Ptr unsupported
// pub const CRYPT_DEFAULT_CONTEXT: windows_sys::core::PCWSTR = windows_sys::core::w!("Default");

public const val `CRYPT_DEFAULT_CONTEXT_AUTO_RELEASE_FLAG`: `CRYPT_DEFAULT_CONTEXT_FLAGS` = 1u;
public const val `CRYPT_DEFAULT_CONTEXT_CERT_SIGN_OID`: `CRYPT_DEFAULT_CONTEXT_TYPE` = 1u;
public typealias `CRYPT_DEFAULT_CONTEXT_FLAGS` = UInt;
public const val `CRYPT_DEFAULT_CONTEXT_MULTI_CERT_SIGN_OID`: `CRYPT_DEFAULT_CONTEXT_TYPE` = 2u;
// UNSUPPORTED Rust 5548:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA {
//     pub cOID: u32,
//     pub rgpszOID: *mut windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 5554:1: declaration Impl has no candidate rule
// impl Default for CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_DEFAULT_CONTEXT_PROCESS_FLAG`: `CRYPT_DEFAULT_CONTEXT_FLAGS` = 2u;
public typealias `CRYPT_DEFAULT_CONTEXT_TYPE` = UInt;
// UNSUPPORTED Rust 5561:1: non-scalar type Ptr unsupported
// pub const CRYPT_DEFAULT_OID: windows_sys::core::PCSTR = windows_sys::core::s!("DEFAULT");

public const val `CRYPT_DELETEKEYSET`: UInt = 16u;
public const val `CRYPT_DELETE_DEFAULT`: UInt = 4u;
public const val `CRYPT_DELETE_KEYSET`: UInt = 16u;
public const val `CRYPT_DESTROYKEY`: `CRYPT_KEY_FLAGS` = 4u;
// UNSUPPORTED Rust 5566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_DES_KEY_STATE {
//     pub Key: [u8; 8],
//     pub IV: [u8; 8],
//     pub Feedback: [u8; 8],
// }

// UNSUPPORTED Rust 5573:1: declaration Impl has no candidate rule
// impl Default for CRYPT_DES_KEY_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_DOMAIN`: `BCRYPT_TABLE` = 2u;
public const val `CRYPT_DONT_CACHE_RESULT`: UInt = 8u;
public const val `CRYPT_DONT_CHECK_TIME_VALIDITY`: UInt = 512u;
public const val `CRYPT_DONT_VERIFY_SIGNATURE`: UInt = 256u;
// UNSUPPORTED Rust 5582:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ECC_CMS_SHARED_INFO {
//     pub Algorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EntityUInfo: CRYPT_INTEGER_BLOB,
//     pub rgbSuppPubInfo: [u8; 4],
// }

// UNSUPPORTED Rust 5589:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ECC_CMS_SHARED_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_ECC_CMS_SHARED_INFO_SUPPPUBINFO_BYTE_LENGTH`: UInt = 4u;
// UNSUPPORTED Rust 5595:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ECC_PRIVATE_KEY_INFO {
//     pub dwVersion: u32,
//     pub PrivateKey: CRYPT_INTEGER_BLOB,
//     pub szCurveOid: windows_sys::core::PSTR,
//     pub PublicKey: CRYPT_BIT_BLOB,
// }

// UNSUPPORTED Rust 5603:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ECC_PRIVATE_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_ECC_PRIVATE_KEY_INFO_v1`: UInt = 1u;
public const val `CRYPT_ENABLE_FILE_RETRIEVAL`: UInt = 134217728u;
public const val `CRYPT_ENABLE_SSL_REVOCATION_RETRIEVAL`: UInt = 8388608u;
public const val `CRYPT_ENCODE_ALLOC_FLAG`: `CRYPT_ENCODE_OBJECT_FLAGS` = 32768u;
public const val `CRYPT_ENCODE_DECODE_NONE`: UInt = 0u;
public const val `CRYPT_ENCODE_ENABLE_PUNYCODE_FLAG`: `CRYPT_ENCODE_OBJECT_FLAGS` = 131072u;
public const val `CRYPT_ENCODE_ENABLE_UTF8PERCENT_FLAG`: UInt = 262144u;
public const val `CRYPT_ENCODE_NO_SIGNATURE_BYTE_REVERSAL_FLAG`: UInt = 8u;
public typealias `CRYPT_ENCODE_OBJECT_FLAGS` = UInt;
// UNSUPPORTED Rust 5617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_ENCODE_PARA {
//     pub cbSize: u32,
//     pub pfnAlloc: PFN_CRYPT_ALLOC,
//     pub pfnFree: PFN_CRYPT_FREE,
// }

public const val `CRYPT_ENCRYPT`: UInt = 1u;
// UNSUPPORTED Rust 5625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_ENCRYPTED_PRIVATE_KEY_INFO {
//     pub EncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub EncryptedPrivateKey: CRYPT_INTEGER_BLOB,
// }

public const val `CRYPT_ENCRYPT_ALG_OID_GROUP_ID`: UInt = 2u;
// UNSUPPORTED Rust 5632:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ENCRYPT_MESSAGE_PARA {
//     pub cbSize: u32,
//     pub dwMsgEncodingType: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub ContentEncryptionAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvEncryptionAuxInfo: *mut core::ffi::c_void,
//     pub dwFlags: u32,
//     pub dwInnerContentType: u32,
// }

// UNSUPPORTED Rust 5643:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ENCRYPT_MESSAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_ENHKEY_USAGE_OID_GROUP_ID`: UInt = 7u;
// UNSUPPORTED Rust 5649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_ENROLLMENT_NAME_VALUE_PAIR {
//     pub pwszName: windows_sys::core::PWSTR,
//     pub pwszValue: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5655:1: declaration Impl has no candidate rule
// impl Default for CRYPT_ENROLLMENT_NAME_VALUE_PAIR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_EXCLUSIVE`: `CRYPT_CONTEXT_CONFIG_FLAGS` = 1u;
public const val `CRYPT_EXPORT`: UInt = 4u;
public const val `CRYPT_EXPORTABLE`: `CRYPT_KEY_FLAGS` = 1u;
public const val `CRYPT_EXPORT_KEY`: UInt = 64u;
public const val `CRYPT_EXTERNAL_SIGNATURE_LENGTH`: UInt = 136u;
public const val `CRYPT_EXT_OR_ATTR_OID_GROUP_ID`: UInt = 6u;
public const val `CRYPT_FAILED`: UInt = 0u;
public const val `CRYPT_FASTSGC`: UInt = 2u;
public typealias `CRYPT_FIND_FLAGS` = UInt;
public const val `CRYPT_FIND_MACHINE_KEYSET_FLAG`: `CRYPT_FIND_FLAGS` = 2u;
public const val `CRYPT_FIND_SILENT_KEYSET_FLAG`: `CRYPT_FIND_FLAGS` = 64u;
public const val `CRYPT_FIND_USER_KEYSET_FLAG`: `CRYPT_FIND_FLAGS` = 1u;
public const val `CRYPT_FIRST`: UInt = 1u;
public const val `CRYPT_FIRST_ALG_OID_GROUP_ID`: UInt = 1u;
public const val `CRYPT_FLAG_IPSEC`: UInt = 16u;
public const val `CRYPT_FLAG_PCT1`: UInt = 1u;
public const val `CRYPT_FLAG_SIGNING`: UInt = 32u;
public const val `CRYPT_FLAG_SSL2`: UInt = 2u;
public const val `CRYPT_FLAG_SSL3`: UInt = 4u;
public const val `CRYPT_FLAG_TLS1`: UInt = 8u;
public const val `CRYPT_FORCE_KEY_PROTECTION_HIGH`: `CRYPT_KEY_FLAGS` = 32768u;
public const val `CRYPT_FORMAT_COMMA`: UInt = 4096u;
public const val `CRYPT_FORMAT_CRLF`: UInt = 512u;
public const val `CRYPT_FORMAT_OID`: UInt = 4u;
public const val `CRYPT_FORMAT_RDN_CRLF`: UInt = 512u;
public const val `CRYPT_FORMAT_RDN_REVERSE`: UInt = 2048u;
public const val `CRYPT_FORMAT_RDN_SEMICOLON`: UInt = 256u;
public const val `CRYPT_FORMAT_RDN_UNQUOTE`: UInt = 1024u;
public const val `CRYPT_FORMAT_SEMICOLON`: UInt = 256u;
public const val `CRYPT_FORMAT_SIMPLE`: UInt = 1u;
public const val `CRYPT_FORMAT_STR_MULTI_LINE`: UInt = 1u;
public const val `CRYPT_FORMAT_STR_NO_HEX`: UInt = 16u;
public const val `CRYPT_FORMAT_X509`: UInt = 2u;
public const val `CRYPT_GET_INSTALLED_OID_FUNC_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 5694:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_GET_TIME_VALID_OBJECT_EXTRA_INFO {
//     pub cbSize: u32,
//     pub iDeltaCrlIndicator: i32,
//     pub pftCacheResync: *mut super::super::Foundation::FILETIME,
//     pub pLastSyncTime: *mut super::super::Foundation::FILETIME,
//     pub pMaxAgeTime: *mut super::super::Foundation::FILETIME,
//     pub pChainPara: *mut CERT_REVOCATION_CHAIN_PARA,
//     pub pDeltaCrlIndicator: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5705:1: declaration Impl has no candidate rule
// impl Default for CRYPT_GET_TIME_VALID_OBJECT_EXTRA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPT_GET_URL_FLAGS` = UInt;
public const val `CRYPT_GET_URL_FROM_AUTH_ATTRIBUTE`: `CRYPT_GET_URL_FLAGS` = 8u;
public const val `CRYPT_GET_URL_FROM_EXTENSION`: `CRYPT_GET_URL_FLAGS` = 2u;
public const val `CRYPT_GET_URL_FROM_PROPERTY`: `CRYPT_GET_URL_FLAGS` = 1u;
public const val `CRYPT_GET_URL_FROM_UNAUTH_ATTRIBUTE`: `CRYPT_GET_URL_FLAGS` = 4u;
public const val `CRYPT_HASH_ALG_OID_GROUP_ID`: UInt = 1u;
// UNSUPPORTED Rust 5716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_HASH_INFO {
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub Hash: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_HASH_MESSAGE_PARA {
//     pub cbSize: u32,
//     pub dwMsgEncodingType: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvHashAuxInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5731:1: declaration Impl has no candidate rule
// impl Default for CRYPT_HASH_MESSAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_HTTP_POST_RETRIEVAL`: UInt = 1048576u;
// UNSUPPORTED Rust 5737:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_IMAGE_REF {
//     pub pszImage: windows_sys::core::PWSTR,
//     pub dwFlags: CRYPT_IMAGE_REF_FLAGS,
// }

// UNSUPPORTED Rust 5743:1: declaration Impl has no candidate rule
// impl Default for CRYPT_IMAGE_REF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPT_IMAGE_REF_FLAGS` = UInt;
// UNSUPPORTED Rust 5749:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_IMAGE_REG {
//     pub pszImage: windows_sys::core::PWSTR,
//     pub cInterfaces: u32,
//     pub rgpInterfaces: *mut *mut CRYPT_INTERFACE_REG,
// }

// UNSUPPORTED Rust 5756:1: declaration Impl has no candidate rule
// impl Default for CRYPT_IMAGE_REG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_IMPL_HARDWARE`: UInt = 1u;
public const val `CRYPT_IMPL_MIXED`: UInt = 3u;
public const val `CRYPT_IMPL_REMOVABLE`: UInt = 8u;
public const val `CRYPT_IMPL_SOFTWARE`: UInt = 2u;
public const val `CRYPT_IMPL_UNKNOWN`: UInt = 4u;
public const val `CRYPT_IMPORT_KEY`: UInt = 128u;
public typealias `CRYPT_IMPORT_PUBLIC_KEY_FLAGS` = UInt;
public const val `CRYPT_INITIATOR`: `CRYPT_KEY_FLAGS` = 64u;
public const val `CRYPT_INSTALL_OID_FUNC_BEFORE_FLAG`: UInt = 1u;
public const val `CRYPT_INSTALL_OID_INFO_BEFORE_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 5771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_INTEGER_BLOB {
//     pub cbData: u32,
//     pub pbData: *mut u8,
// }

// UNSUPPORTED Rust 5777:1: declaration Impl has no candidate rule
// impl Default for CRYPT_INTEGER_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_INTERFACE_REG {
//     pub dwInterface: BCRYPT_INTERFACE,
//     pub dwFlags: BCRYPT_TABLE,
//     pub cFunctions: u32,
//     pub rgpszFunctions: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 5790:1: declaration Impl has no candidate rule
// impl Default for CRYPT_INTERFACE_REG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_IPSEC_HMAC_KEY`: `CRYPT_KEY_FLAGS` = 256u;
public const val `CRYPT_KDF_OID_GROUP_ID`: UInt = 10u;
public const val `CRYPT_KEEP_TIME_VALID`: UInt = 128u;
public const val `CRYPT_KEK`: `CRYPT_KEY_FLAGS` = 1024u;
public const val `CRYPT_KEYID_ALLOC_FLAG`: UInt = 32768u;
public const val `CRYPT_KEYID_DELETE_FLAG`: UInt = 16u;
public const val `CRYPT_KEYID_MACHINE_FLAG`: UInt = 32u;
public const val `CRYPT_KEYID_SET_NEW_FLAG`: UInt = 8192u;
public typealias `CRYPT_KEY_FLAGS` = UInt;
public typealias `CRYPT_KEY_PARAM_ID` = UInt;
// UNSUPPORTED Rust 5805:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_KEY_PROV_INFO {
//     pub pwszContainerName: windows_sys::core::PWSTR,
//     pub pwszProvName: windows_sys::core::PWSTR,
//     pub dwProvType: u32,
//     pub dwFlags: CRYPT_KEY_FLAGS,
//     pub cProvParam: u32,
//     pub rgProvParam: *mut CRYPT_KEY_PROV_PARAM,
//     pub dwKeySpec: u32,
// }

// UNSUPPORTED Rust 5816:1: declaration Impl has no candidate rule
// impl Default for CRYPT_KEY_PROV_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5821:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_KEY_PROV_PARAM {
//     pub dwParam: u32,
//     pub pbData: *mut u8,
//     pub cbData: u32,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 5829:1: declaration Impl has no candidate rule
// impl Default for CRYPT_KEY_PROV_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5834:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_KEY_SIGN_MESSAGE_PARA {
//     pub cbSize: u32,
//     pub dwMsgAndCertEncodingType: CERT_QUERY_ENCODING_TYPE,
//     pub Anonymous: CRYPT_KEY_SIGN_MESSAGE_PARA_0,
//     pub dwKeySpec: CERT_KEY_SPEC,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvHashAuxInfo: *mut core::ffi::c_void,
//     pub PubKeyAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
// }

// UNSUPPORTED Rust 5845:1: declaration Impl has no candidate rule
// impl Default for CRYPT_KEY_SIGN_MESSAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5850:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPT_KEY_SIGN_MESSAGE_PARA_0 {
//     pub hCryptProv: usize,
//     pub hNCryptKey: NCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 5856:1: declaration Impl has no candidate rule
// impl Default for CRYPT_KEY_SIGN_MESSAGE_PARA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5861:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_KEY_VERIFY_MESSAGE_PARA {
//     pub cbSize: u32,
//     pub dwMsgEncodingType: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
// }

public const val `CRYPT_KM`: `BCRYPT_QUERY_PROVIDER_MODE` = 2u;
public const val `CRYPT_LAST_ALG_OID_GROUP_ID`: UInt = 4u;
public const val `CRYPT_LAST_OID_GROUP_ID`: UInt = 10u;
public const val `CRYPT_LDAP_AREC_EXCLUSIVE_RETRIEVAL`: UInt = 262144u;
public const val `CRYPT_LDAP_INSERT_ENTRY_ATTRIBUTE`: UInt = 32768u;
public const val `CRYPT_LDAP_SCOPE_BASE_ONLY_RETRIEVAL`: UInt = 8192u;
public const val `CRYPT_LDAP_SIGN_RETRIEVAL`: UInt = 65536u;
public const val `CRYPT_LITTLE_ENDIAN`: UInt = 1u;
public const val `CRYPT_LOCAL`: `BCRYPT_TABLE` = 1u;
public const val `CRYPT_LOCALIZED_NAME_ENCODING_TYPE`: UInt = 0u;
// UNSUPPORTED Rust 5878:1: non-scalar type Ptr unsupported
// pub const CRYPT_LOCALIZED_NAME_OID: windows_sys::core::PCSTR = windows_sys::core::s!("LocalizedNames");

public const val `CRYPT_MAC`: UInt = 32u;
public const val `CRYPT_MACHINE_DEFAULT`: UInt = 1u;
public const val `CRYPT_MACHINE_KEYSET`: `CRYPT_KEY_FLAGS` = 32u;
// UNSUPPORTED Rust 5882:1: non-scalar type Ptr unsupported
// pub const CRYPT_MAC_RESOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("#667");

public const val `CRYPT_MAC_RESOURCE_NUMBER`: UInt = 667u;
// UNSUPPORTED Rust 5884:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_MASK_GEN_ALGORITHM {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
// }

// UNSUPPORTED Rust 5890:1: declaration Impl has no candidate rule
// impl Default for CRYPT_MASK_GEN_ALGORITHM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_MATCH_ANY_ENCODING_TYPE`: UInt = 4294967295u;
public const val `CRYPT_MAX_PROVIDER_ID`: UInt = 999u;
public const val `CRYPT_MESSAGE_BARE_CONTENT_OUT_FLAG`: UInt = 1u;
public const val `CRYPT_MESSAGE_ENCAPSULATED_CONTENT_OUT_FLAG`: UInt = 2u;
public const val `CRYPT_MESSAGE_KEYID_RECIPIENT_FLAG`: UInt = 4u;
public const val `CRYPT_MESSAGE_KEYID_SIGNER_FLAG`: UInt = 4u;
public const val `CRYPT_MESSAGE_SILENT_KEYSET_FLAG`: UInt = 64u;
public const val `CRYPT_MIN_DEPENDENCIES`: `CRYPT_IMAGE_REF_FLAGS` = 1u;
public const val `CRYPT_MM`: `BCRYPT_QUERY_PROVIDER_MODE` = 3u;
public const val `CRYPT_MODE_CBC`: UInt = 1u;
public const val `CRYPT_MODE_CBCI`: UInt = 6u;
public const val `CRYPT_MODE_CBCOFM`: UInt = 9u;
public const val `CRYPT_MODE_CBCOFMI`: UInt = 10u;
public const val `CRYPT_MODE_CFB`: UInt = 4u;
public const val `CRYPT_MODE_CFBP`: UInt = 7u;
public const val `CRYPT_MODE_CTS`: UInt = 5u;
public const val `CRYPT_MODE_ECB`: UInt = 2u;
public const val `CRYPT_MODE_OFB`: UInt = 3u;
public const val `CRYPT_MODE_OFBP`: UInt = 8u;
public typealias `CRYPT_MSG_TYPE` = UInt;
public const val `CRYPT_NDR_ENCODING`: UInt = 2u;
public const val `CRYPT_NEWKEYSET`: UInt = 8u;
public const val `CRYPT_NEXT`: UInt = 2u;
public const val `CRYPT_NOHASHOID`: UInt = 1u;
public const val `CRYPT_NOT_MODIFIED_RETRIEVAL`: UInt = 4194304u;
public const val `CRYPT_NO_AUTH_RETRIEVAL`: UInt = 131072u;
public const val `CRYPT_NO_OCSP_FAILOVER_TO_CRL_RETRIEVAL`: UInt = 33554432u;
public const val `CRYPT_NO_SALT`: `CRYPT_KEY_FLAGS` = 16u;
public const val `CRYPT_OAEP`: `CRYPT_KEY_FLAGS` = 64u;
public const val `CRYPT_OBJECT_LOCATOR_FIRST_RESERVED_USER_NAME_TYPE`: UInt = 33u;
public const val `CRYPT_OBJECT_LOCATOR_LAST_RESERVED_NAME_TYPE`: UInt = 32u;
public const val `CRYPT_OBJECT_LOCATOR_LAST_RESERVED_USER_NAME_TYPE`: UInt = 65535u;
// UNSUPPORTED Rust 5927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE {
//     pub cbSize: u32,
//     pub pfnGet: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET,
//     pub pfnRelease: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE,
//     pub pfnFreePassword: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD,
//     pub pfnFree: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE,
//     pub pfnFreeIdentifier: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER,
// }

public const val `CRYPT_OBJECT_LOCATOR_RELEASE_DLL_UNLOAD`: `CRYPT_OBJECT_LOCATOR_RELEASE_REASON` = 4u;
public const val `CRYPT_OBJECT_LOCATOR_RELEASE_PROCESS_EXIT`: `CRYPT_OBJECT_LOCATOR_RELEASE_REASON` = 3u;
public typealias `CRYPT_OBJECT_LOCATOR_RELEASE_REASON` = UInt;
public const val `CRYPT_OBJECT_LOCATOR_RELEASE_SERVICE_STOP`: `CRYPT_OBJECT_LOCATOR_RELEASE_REASON` = 2u;
public const val `CRYPT_OBJECT_LOCATOR_RELEASE_SYSTEM_SHUTDOWN`: `CRYPT_OBJECT_LOCATOR_RELEASE_REASON` = 1u;
public const val `CRYPT_OBJECT_LOCATOR_SPN_NAME_TYPE`: UInt = 1u;
// UNSUPPORTED Rust 5943:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_OBJID_TABLE {
//     pub dwAlgId: u32,
//     pub pszObjId: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 5949:1: declaration Impl has no candidate rule
// impl Default for CRYPT_OBJID_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_OCSP_ONLY_RETRIEVAL`: UInt = 16777216u;
public const val `CRYPT_OFFLINE_CHECK_RETRIEVAL`: UInt = 16384u;
// UNSUPPORTED Rust 5956:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_CREATE_COM_OBJECT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllCreateCOMObject");

// UNSUPPORTED Rust 5957:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_DECODE_OBJECT_EX_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllDecodeObjectEx");

// UNSUPPORTED Rust 5958:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_DECODE_OBJECT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllDecodeObject");

public const val `CRYPT_OID_DISABLE_SEARCH_DS_FLAG`: UInt = 2147483648u;
// UNSUPPORTED Rust 5960:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_ENCODE_OBJECT_EX_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllEncodeObjectEx");

// UNSUPPORTED Rust 5961:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_ENCODE_OBJECT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllEncodeObject");

// UNSUPPORTED Rust 5962:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_ENUM_PHYSICAL_STORE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllEnumPhysicalStore");

// UNSUPPORTED Rust 5963:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_ENUM_SYSTEM_STORE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllEnumSystemStore");

// UNSUPPORTED Rust 5964:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_EXPORT_PRIVATE_KEY_INFO_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllExportPrivateKeyInfoEx");

// UNSUPPORTED Rust 5965:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllExportPublicKeyInfoEx2");

// UNSUPPORTED Rust 5966:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllExportPublicKeyInfoFromBCryptKeyHandle");

// UNSUPPORTED Rust 5967:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_EXPORT_PUBLIC_KEY_INFO_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllExportPublicKeyInfoEx");

// UNSUPPORTED Rust 5968:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllExtractEncodedSignatureParameters");

// UNSUPPORTED Rust 5969:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_FIND_LOCALIZED_NAME_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllFindLocalizedName");

// UNSUPPORTED Rust 5970:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_FIND_OID_INFO_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllFindOIDInfo");

// UNSUPPORTED Rust 5971:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_FORMAT_OBJECT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllFormatObject");

// UNSUPPORTED Rust 5972:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_OID_FUNC_ENTRY {
//     pub pszOID: windows_sys::core::PCSTR,
//     pub pvFuncAddr: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5978:1: declaration Impl has no candidate rule
// impl Default for CRYPT_OID_FUNC_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5983:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_IMPORT_PRIVATE_KEY_INFO_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllImportPrivateKeyInfoEx");

// UNSUPPORTED Rust 5984:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllImportPublicKeyInfoEx2");

// UNSUPPORTED Rust 5985:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_IMPORT_PUBLIC_KEY_INFO_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllImportPublicKeyInfoEx");

// UNSUPPORTED Rust 5986:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_OID_INFO {
//     pub cbSize: u32,
//     pub pszOID: windows_sys::core::PCSTR,
//     pub pwszName: windows_sys::core::PCWSTR,
//     pub dwGroupId: u32,
//     pub Anonymous: CRYPT_OID_INFO_0,
//     pub ExtraInfo: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 5996:1: declaration Impl has no candidate rule
// impl Default for CRYPT_OID_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6001:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPT_OID_INFO_0 {
//     pub dwValue: u32,
//     pub Algid: ALG_ID,
//     pub dwLength: u32,
// }

// UNSUPPORTED Rust 6008:1: declaration Impl has no candidate rule
// impl Default for CRYPT_OID_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_OID_INFO_ALGID_KEY`: UInt = 3u;
public const val `CRYPT_OID_INFO_CNG_ALGID_KEY`: UInt = 5u;
public const val `CRYPT_OID_INFO_CNG_SIGN_KEY`: UInt = 6u;
// UNSUPPORTED Rust 6016:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_INFO_ECC_PARAMETERS_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptOIDInfoECCParameters");

// UNSUPPORTED Rust 6017:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_INFO_ECC_WRAP_PARAMETERS_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptOIDInfoECCWrapParameters");

// UNSUPPORTED Rust 6018:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_INFO_HASH_PARAMETERS_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptOIDInfoHashParameters");

// UNSUPPORTED Rust 6019:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_INFO_MGF1_PARAMETERS_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptOIDInfoMgf1Parameters");

public const val `CRYPT_OID_INFO_NAME_KEY`: UInt = 2u;
// UNSUPPORTED Rust 6021:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_INFO_NO_PARAMETERS_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptOIDInfoNoParameters");

// UNSUPPORTED Rust 6022:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_INFO_NO_SIGN_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptOIDInfoNoSign");

// UNSUPPORTED Rust 6023:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_INFO_OAEP_PARAMETERS_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptOIDInfoOAEPParameters");

public const val `CRYPT_OID_INFO_OID_GROUP_BIT_LEN_MASK`: UInt = 268369920u;
public const val `CRYPT_OID_INFO_OID_GROUP_BIT_LEN_SHIFT`: UInt = 16u;
public const val `CRYPT_OID_INFO_OID_KEY`: UInt = 1u;
public const val `CRYPT_OID_INFO_OID_KEY_FLAGS_MASK`: UInt = 4294901760u;
public const val `CRYPT_OID_INFO_PUBKEY_ENCRYPT_KEY_FLAG`: `CRYPT_IMPORT_PUBLIC_KEY_FLAGS` = 1073741824u;
public const val `CRYPT_OID_INFO_PUBKEY_SIGN_KEY_FLAG`: `CRYPT_IMPORT_PUBLIC_KEY_FLAGS` = 2147483648u;
public const val `CRYPT_OID_INFO_SIGN_KEY`: UInt = 4u;
public const val `CRYPT_OID_INHIBIT_SIGNATURE_FORMAT_FLAG`: UInt = 1u;
public const val `CRYPT_OID_NO_NULL_ALGORITHM_PARA_FLAG`: UInt = 4u;
// UNSUPPORTED Rust 6033:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_OPEN_STORE_PROV_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllOpenStoreProv");

// UNSUPPORTED Rust 6034:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_OPEN_SYSTEM_STORE_PROV_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllOpenSystemStoreProv");

public const val `CRYPT_OID_PREFER_CNG_ALGID_FLAG`: UInt = 1073741824u;
public const val `CRYPT_OID_PUBKEY_ENCRYPT_ONLY_FLAG`: UInt = 1073741824u;
public const val `CRYPT_OID_PUBKEY_SIGN_ONLY_FLAG`: UInt = 2147483648u;
// UNSUPPORTED Rust 6038:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REGISTER_PHYSICAL_STORE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllRegisterPhysicalStore");

// UNSUPPORTED Rust 6039:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REGISTER_SYSTEM_STORE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllRegisterSystemStore");

// UNSUPPORTED Rust 6040:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REGPATH: windows_sys::core::PCSTR = windows_sys::core::s!("Software\\Microsoft\\Cryptography\\OID");

// UNSUPPORTED Rust 6041:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REG_DLL_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Dll");

// UNSUPPORTED Rust 6042:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REG_ENCODING_TYPE_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("EncodingType ");

// UNSUPPORTED Rust 6043:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REG_FLAGS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptFlags");

// UNSUPPORTED Rust 6044:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REG_FUNC_NAME_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FuncName");

// UNSUPPORTED Rust 6045:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_REG_FUNC_NAME_VALUE_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("FuncName");

// UNSUPPORTED Rust 6046:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_SIGN_AND_ENCODE_HASH_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllSignAndEncodeHash");

// UNSUPPORTED Rust 6047:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_SYSTEM_STORE_LOCATION_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemStoreLocation");

// UNSUPPORTED Rust 6048:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_UNREGISTER_PHYSICAL_STORE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllUnregisterPhysicalStore");

// UNSUPPORTED Rust 6049:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_UNREGISTER_SYSTEM_STORE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllUnregisterSystemStore");

public const val `CRYPT_OID_USE_CURVE_NAME_FOR_ENCODE_FLAG`: UInt = 536870912u;
public const val `CRYPT_OID_USE_CURVE_PARAMETERS_FOR_ENCODE_FLAG`: UInt = 268435456u;
public const val `CRYPT_OID_USE_PUBKEY_PARA_FOR_PKCS7_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 6053:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_VERIFY_CERTIFICATE_CHAIN_POLICY_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllVerifyCertificateChainPolicy");

// UNSUPPORTED Rust 6054:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_VERIFY_CTL_USAGE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllVerifyCTLUsage");

// UNSUPPORTED Rust 6055:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_VERIFY_ENCODED_SIGNATURE_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CryptDllVerifyEncodedSignature");

// UNSUPPORTED Rust 6056:1: non-scalar type Ptr unsupported
// pub const CRYPT_OID_VERIFY_REVOCATION_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("CertDllVerifyRevocation");

public const val `CRYPT_ONLINE`: `CRYPT_KEY_FLAGS` = 128u;
public const val `CRYPT_OVERRIDE`: `CRYPT_CONTEXT_CONFIG_FLAGS` = 65536u;
public const val `CRYPT_OVERWRITE`: UInt = 1u;
public const val `CRYPT_OWF_REPL_LM_HASH`: UInt = 1u;
// UNSUPPORTED Rust 6061:1: non-scalar type Ptr unsupported
// pub const CRYPT_PARAM_ASYNC_RETRIEVAL_COMPLETION: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 6062:1: non-scalar type Ptr unsupported
// pub const CRYPT_PARAM_CANCEL_ASYNC_RETRIEVAL: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 6063:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PASSWORD_CREDENTIALSA {
//     pub cbSize: u32,
//     pub pszUsername: windows_sys::core::PSTR,
//     pub pszPassword: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 6070:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PASSWORD_CREDENTIALSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6075:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PASSWORD_CREDENTIALSW {
//     pub cbSize: u32,
//     pub pszUsername: windows_sys::core::PWSTR,
//     pub pszPassword: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 6082:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PASSWORD_CREDENTIALSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_PKCS12_PBE_PARAMS {
//     pub iIterations: i32,
//     pub cbSalt: u32,
// }

// UNSUPPORTED Rust 6093:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PKCS8_EXPORT_PARAMS {
//     pub hCryptProv: usize,
//     pub dwKeySpec: u32,
//     pub pszPrivateKeyObjId: windows_sys::core::PSTR,
//     pub pEncryptPrivateKeyFunc: PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC,
//     pub pVoidEncryptFunc: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 6102:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PKCS8_EXPORT_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PKCS8_IMPORT_PARAMS {
//     pub PrivateKey: CRYPT_INTEGER_BLOB,
//     pub pResolvehCryptProvFunc: PCRYPT_RESOLVE_HCRYPTPROV_FUNC,
//     pub pVoidResolveFunc: *mut core::ffi::c_void,
//     pub pDecryptPrivateKeyFunc: PCRYPT_DECRYPT_PRIVATE_KEY_FUNC,
//     pub pVoidDecryptFunc: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 6116:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PKCS8_IMPORT_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_POLICY_OID_GROUP_ID`: UInt = 8u;
public const val `CRYPT_PREGEN`: `CRYPT_KEY_FLAGS` = 64u;
public const val `CRYPT_PRIORITY_BOTTOM`: UInt = 4294967295u;
public const val `CRYPT_PRIORITY_TOP`: UInt = 0u;
// UNSUPPORTED Rust 6125:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PRIVATE_KEY_INFO {
//     pub Version: u32,
//     pub Algorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub PrivateKey: CRYPT_INTEGER_BLOB,
//     pub pAttributes: *mut CRYPT_ATTRIBUTES,
// }

// UNSUPPORTED Rust 6133:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PRIVATE_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_PROCESS_ISOLATE`: `CRYPT_IMAGE_REF_FLAGS` = 65536u;
// UNSUPPORTED Rust 6139:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROPERTY_REF {
//     pub pszProperty: windows_sys::core::PWSTR,
//     pub cbValue: u32,
//     pub pbValue: *mut u8,
// }

// UNSUPPORTED Rust 6146:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROPERTY_REF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDERS {
//     pub cProviders: u32,
//     pub rgpszProviders: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 6157:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVIDERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_PROVIDER_IOCTL__GET_SCHANNEL_INTERFACE`: UInt = 4145180u;
// UNSUPPORTED Rust 6163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_REF {
//     pub dwInterface: u32,
//     pub pszFunction: windows_sys::core::PWSTR,
//     pub pszProvider: windows_sys::core::PWSTR,
//     pub cProperties: u32,
//     pub rgpProperties: *mut *mut CRYPT_PROPERTY_REF,
//     pub pUM: *mut CRYPT_IMAGE_REF,
//     pub pKM: *mut CRYPT_IMAGE_REF,
// }

// UNSUPPORTED Rust 6174:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVIDER_REF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_REFS {
//     pub cProviders: u32,
//     pub rgpProviders: *mut *mut CRYPT_PROVIDER_REF,
// }

// UNSUPPORTED Rust 6185:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVIDER_REFS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PROVIDER_REG {
//     pub cAliases: u32,
//     pub rgpszAliases: *mut windows_sys::core::PWSTR,
//     pub pUM: *mut CRYPT_IMAGE_REG,
//     pub pKM: *mut CRYPT_IMAGE_REG,
// }

// UNSUPPORTED Rust 6198:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PROVIDER_REG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_PROVSTRUC_VERSION_V3`: UInt = 3u;
public const val `CRYPT_PROXY_CACHE_RETRIEVAL`: UInt = 2097152u;
// UNSUPPORTED Rust 6205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_PSOURCE_ALGORITHM {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub EncodingParameters: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 6211:1: declaration Impl has no candidate rule
// impl Default for CRYPT_PSOURCE_ALGORITHM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_PSTORE`: UInt = 2u;
public const val `CRYPT_PUBKEY_ALG_OID_GROUP_ID`: UInt = 3u;
public const val `CRYPT_RANDOM_QUERY_STRING_RETRIEVAL`: UInt = 67108864u;
public const val `CRYPT_RC2_128BIT_VERSION`: UInt = 58u;
public const val `CRYPT_RC2_40BIT_VERSION`: UInt = 160u;
public const val `CRYPT_RC2_56BIT_VERSION`: UInt = 52u;
public const val `CRYPT_RC2_64BIT_VERSION`: UInt = 120u;
// UNSUPPORTED Rust 6223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_RC2_CBC_PARAMETERS {
//     pub dwVersion: u32,
//     pub fIV: windows_sys::core::BOOL,
//     pub rgbIV: [u8; 8],
// }

// UNSUPPORTED Rust 6230:1: declaration Impl has no candidate rule
// impl Default for CRYPT_RC2_CBC_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6235:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_RC4_KEY_STATE {
//     pub Key: [u8; 16],
//     pub SBox: [u8; 256],
//     pub i: u8,
//     pub j: u8,
// }

// UNSUPPORTED Rust 6243:1: declaration Impl has no candidate rule
// impl Default for CRYPT_RC4_KEY_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_RDN_ATTR_OID_GROUP_ID`: UInt = 5u;
public const val `CRYPT_READ`: UInt = 8u;
public const val `CRYPT_RECIPIENT`: `CRYPT_KEY_FLAGS` = 16u;
public const val `CRYPT_REGISTER_FIRST_INDEX`: UInt = 0u;
public const val `CRYPT_REGISTER_LAST_INDEX`: UInt = 4294967295u;
// UNSUPPORTED Rust 6253:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_RETRIEVE_AUX_INFO {
//     pub cbSize: u32,
//     pub pLastSyncTime: *mut super::super::Foundation::FILETIME,
//     pub dwMaxUrlRetrievalByteCount: u32,
//     pub pPreFetchInfo: *mut CRYPTNET_URL_CACHE_PRE_FETCH_INFO,
//     pub pFlushInfo: *mut CRYPTNET_URL_CACHE_FLUSH_INFO,
//     pub ppResponseInfo: *mut *mut CRYPTNET_URL_CACHE_RESPONSE_INFO,
//     pub pwszCacheFileNamePrefix: windows_sys::core::PWSTR,
//     pub pftCacheResync: *mut super::super::Foundation::FILETIME,
//     pub fProxyCacheRetrieval: windows_sys::core::BOOL,
//     pub dwHttpStatusCode: u32,
//     pub ppwszErrorResponseHeaders: *mut windows_sys::core::PWSTR,
//     pub ppErrorContentBlob: *mut *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 6269:1: declaration Impl has no candidate rule
// impl Default for CRYPT_RETRIEVE_AUX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_RETRIEVE_MAX_ERROR_CONTENT_LENGTH`: UInt = 4096u;
public const val `CRYPT_RETRIEVE_MULTIPLE_OBJECTS`: UInt = 1u;
// UNSUPPORTED Rust 6276:1: generic scalar type unsupported
// pub type CRYPT_RETURN_HWND = Option<unsafe extern "system" fn(phwnd: *mut super::super::Foundation::HWND)>;

// UNSUPPORTED Rust 6277:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_RSAES_OAEP_PARAMETERS {
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub MaskGenAlgorithm: CRYPT_MASK_GEN_ALGORITHM,
//     pub PSourceAlgorithm: CRYPT_PSOURCE_ALGORITHM,
// }

// UNSUPPORTED Rust 6284:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_RSA_SSA_PSS_PARAMETERS {
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub MaskGenAlgorithm: CRYPT_MASK_GEN_ALGORITHM,
//     pub dwSaltLength: u32,
//     pub dwTrailerField: u32,
// }

public const val `CRYPT_SECRETDIGEST`: UInt = 1u;
public const val `CRYPT_SEC_DESCR`: UInt = 1u;
// UNSUPPORTED Rust 6294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_SEQUENCE_OF_ANY {
//     pub cValue: u32,
//     pub rgValue: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 6300:1: declaration Impl has no candidate rule
// impl Default for CRYPT_SEQUENCE_OF_ANY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_SERVER`: UInt = 1024u;
public typealias `CRYPT_SET_HASH_PARAM` = UInt;
public typealias `CRYPT_SET_PROV_PARAM_ID` = UInt;
public const val `CRYPT_SF`: `CRYPT_KEY_FLAGS` = 256u;
public const val `CRYPT_SGC`: UInt = 1u;
public const val `CRYPT_SGCKEY`: `CRYPT_KEY_FLAGS` = 8192u;
public const val `CRYPT_SGC_ENUM`: UInt = 4u;
public const val `CRYPT_SIGN_ALG_OID_GROUP_ID`: UInt = 4u;
// UNSUPPORTED Rust 6313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_SIGN_MESSAGE_PARA {
//     pub cbSize: u32,
//     pub dwMsgEncodingType: u32,
//     pub pSigningCert: *const CERT_CONTEXT,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub pvHashAuxInfo: *mut core::ffi::c_void,
//     pub cMsgCert: u32,
//     pub rgpMsgCert: *mut *mut CERT_CONTEXT,
//     pub cMsgCrl: u32,
//     pub rgpMsgCrl: *mut *mut CRL_CONTEXT,
//     pub cAuthAttr: u32,
//     pub rgAuthAttr: *mut CRYPT_ATTRIBUTE,
//     pub cUnauthAttr: u32,
//     pub rgUnauthAttr: *mut CRYPT_ATTRIBUTE,
//     pub dwFlags: u32,
//     pub dwInnerContentType: u32,
// }

// UNSUPPORTED Rust 6332:1: declaration Impl has no candidate rule
// impl Default for CRYPT_SIGN_MESSAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6337:1: non-scalar type Ptr unsupported
// pub const CRYPT_SIG_RESOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("#666");

public const val `CRYPT_SIG_RESOURCE_NUMBER`: UInt = 666u;
public const val `CRYPT_SIG_RESOURCE_VERSION`: UInt = 256u;
public const val `CRYPT_SILENT`: UInt = 64u;
// UNSUPPORTED Rust 6341:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_SMART_CARD_ROOT_INFO {
//     pub rgbCardID: [u8; 16],
//     pub luid: ROOT_INFO_LUID,
// }

// UNSUPPORTED Rust 6347:1: declaration Impl has no candidate rule
// impl Default for CRYPT_SMART_CARD_ROOT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6352:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_SMIME_CAPABILITIES {
//     pub cCapability: u32,
//     pub rgCapability: *mut CRYPT_SMIME_CAPABILITY,
// }

// UNSUPPORTED Rust 6358:1: declaration Impl has no candidate rule
// impl Default for CRYPT_SMIME_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6363:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_SMIME_CAPABILITY {
//     pub pszObjId: windows_sys::core::PSTR,
//     pub Parameters: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 6369:1: declaration Impl has no candidate rule
// impl Default for CRYPT_SMIME_CAPABILITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_SORTED_CTL_ENCODE_HASHED_SUBJECT_IDENTIFIER_FLAG`: UInt = 65536u;
public const val `CRYPT_SSL2_FALLBACK`: `CRYPT_KEY_FLAGS` = 2u;
public const val `CRYPT_STICKY_CACHE_RETRIEVAL`: UInt = 4096u;
public typealias `CRYPT_STRING` = UInt;
public const val `CRYPT_STRING_ANY`: `CRYPT_STRING` = 7u;
public const val `CRYPT_STRING_BASE64`: `CRYPT_STRING` = 1u;
public const val `CRYPT_STRING_BASE64HEADER`: `CRYPT_STRING` = 0u;
public const val `CRYPT_STRING_BASE64REQUESTHEADER`: `CRYPT_STRING` = 3u;
public const val `CRYPT_STRING_BASE64URI`: UInt = 13u;
public const val `CRYPT_STRING_BASE64X509CRLHEADER`: `CRYPT_STRING` = 9u;
public const val `CRYPT_STRING_BASE64_ANY`: `CRYPT_STRING` = 6u;
public const val `CRYPT_STRING_BINARY`: `CRYPT_STRING` = 2u;
public const val `CRYPT_STRING_ENCODEMASK`: UInt = 255u;
public const val `CRYPT_STRING_HASHDATA`: UInt = 268435456u;
public const val `CRYPT_STRING_HEX`: `CRYPT_STRING` = 4u;
public const val `CRYPT_STRING_HEXADDR`: `CRYPT_STRING` = 10u;
public const val `CRYPT_STRING_HEXASCII`: `CRYPT_STRING` = 5u;
public const val `CRYPT_STRING_HEXASCIIADDR`: `CRYPT_STRING` = 11u;
public const val `CRYPT_STRING_HEXRAW`: `CRYPT_STRING` = 12u;
public const val `CRYPT_STRING_HEX_ANY`: `CRYPT_STRING` = 8u;
public const val `CRYPT_STRING_NOCR`: UInt = 2147483648u;
public const val `CRYPT_STRING_NOCRLF`: UInt = 1073741824u;
public const val `CRYPT_STRING_PERCENTESCAPE`: UInt = 134217728u;
public const val `CRYPT_STRING_RESERVED100`: UInt = 256u;
public const val `CRYPT_STRING_RESERVED200`: UInt = 512u;
public const val `CRYPT_STRING_STRICT`: `CRYPT_STRING` = 536870912u;
public const val `CRYPT_SUCCEED`: UInt = 1u;
public const val `CRYPT_TEMPLATE_OID_GROUP_ID`: UInt = 9u;
// UNSUPPORTED Rust 6402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_TIMESTAMP_ACCURACY {
//     pub dwSeconds: u32,
//     pub dwMillis: u32,
//     pub dwMicros: u32,
// }

// UNSUPPORTED Rust 6409:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_TIMESTAMP_CONTEXT {
//     pub cbEncoded: u32,
//     pub pbEncoded: *mut u8,
//     pub pTimeStamp: *mut CRYPT_TIMESTAMP_INFO,
// }

// UNSUPPORTED Rust 6416:1: declaration Impl has no candidate rule
// impl Default for CRYPT_TIMESTAMP_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_TIMESTAMP_INFO {
//     pub dwVersion: u32,
//     pub pszTSAPolicyId: windows_sys::core::PSTR,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub HashedMessage: CRYPT_INTEGER_BLOB,
//     pub SerialNumber: CRYPT_INTEGER_BLOB,
//     pub ftTime: super::super::Foundation::FILETIME,
//     pub pvAccuracy: *mut CRYPT_TIMESTAMP_ACCURACY,
//     pub fOrdering: windows_sys::core::BOOL,
//     pub Nonce: CRYPT_INTEGER_BLOB,
//     pub Tsa: CRYPT_INTEGER_BLOB,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 6437:1: declaration Impl has no candidate rule
// impl Default for CRYPT_TIMESTAMP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6442:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_TIMESTAMP_PARA {
//     pub pszTSAPolicyId: windows_sys::core::PCSTR,
//     pub fRequestCerts: windows_sys::core::BOOL,
//     pub Nonce: CRYPT_INTEGER_BLOB,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 6451:1: declaration Impl has no candidate rule
// impl Default for CRYPT_TIMESTAMP_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6456:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_TIMESTAMP_REQUEST {
//     pub dwVersion: CRYPT_TIMESTAMP_VERSION,
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub HashedMessage: CRYPT_INTEGER_BLOB,
//     pub pszTSAPolicyId: windows_sys::core::PSTR,
//     pub Nonce: CRYPT_INTEGER_BLOB,
//     pub fCertReq: windows_sys::core::BOOL,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 6468:1: declaration Impl has no candidate rule
// impl Default for CRYPT_TIMESTAMP_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6473:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_TIMESTAMP_RESPONSE {
//     pub dwStatus: CRYPT_TIMESTAMP_RESPONSE_STATUS,
//     pub cFreeText: u32,
//     pub rgFreeText: *mut windows_sys::core::PWSTR,
//     pub FailureInfo: CRYPT_BIT_BLOB,
//     pub ContentInfo: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 6482:1: declaration Impl has no candidate rule
// impl Default for CRYPT_TIMESTAMP_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPT_TIMESTAMP_RESPONSE_STATUS` = UInt;
public typealias `CRYPT_TIMESTAMP_VERSION` = UInt;
// UNSUPPORTED Rust 6489:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_TIME_STAMP_REQUEST_INFO {
//     pub pszTimeStampAlgorithm: windows_sys::core::PSTR,
//     pub pszContentType: windows_sys::core::PSTR,
//     pub Content: CRYPT_INTEGER_BLOB,
//     pub cAttribute: u32,
//     pub rgAttribute: *mut CRYPT_ATTRIBUTE,
// }

// UNSUPPORTED Rust 6498:1: declaration Impl has no candidate rule
// impl Default for CRYPT_TIME_STAMP_REQUEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_TYPE2_FORMAT`: UInt = 2u;
public const val `CRYPT_UI_PROMPT`: UInt = 4u;
public const val `CRYPT_UM`: `BCRYPT_QUERY_PROVIDER_MODE` = 1u;
public const val `CRYPT_UNICODE_NAME_DECODE_DISABLE_IE4_UTF8_FLAG`: UInt = 16777216u;
public const val `CRYPT_UNICODE_NAME_ENCODE_DISABLE_CHECK_TYPE_FLAG`: `CRYPT_ENCODE_OBJECT_FLAGS` = 1073741824u;
public const val `CRYPT_UNICODE_NAME_ENCODE_ENABLE_T61_UNICODE_FLAG`: `CRYPT_ENCODE_OBJECT_FLAGS` = 2147483648u;
public const val `CRYPT_UNICODE_NAME_ENCODE_ENABLE_UTF8_UNICODE_FLAG`: `CRYPT_ENCODE_OBJECT_FLAGS` = 536870912u;
public const val `CRYPT_UNICODE_NAME_ENCODE_FORCE_UTF8_UNICODE_FLAG`: UInt = 268435456u;
public const val `CRYPT_UPDATE_KEY`: UInt = 8u;
// UNSUPPORTED Rust 6512:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_URL_ARRAY {
//     pub cUrl: u32,
//     pub rgwszUrl: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 6518:1: declaration Impl has no candidate rule
// impl Default for CRYPT_URL_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6523:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_URL_INFO {
//     pub cbSize: u32,
//     pub dwSyncDeltaTime: u32,
//     pub cGroup: u32,
//     pub rgcGroupEntry: *mut u32,
// }

// UNSUPPORTED Rust 6531:1: declaration Impl has no candidate rule
// impl Default for CRYPT_URL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_USERDATA`: UInt = 1u;
public const val `CRYPT_USER_DEFAULT`: UInt = 2u;
public const val `CRYPT_USER_KEYSET`: `CRYPT_KEY_FLAGS` = 4096u;
public const val `CRYPT_USER_PROTECTED`: `CRYPT_KEY_FLAGS` = 2u;
public const val `CRYPT_USER_PROTECTED_STRONG`: UInt = 1048576u;
public const val `CRYPT_VERIFYCONTEXT`: UInt = 4026531840u;
public typealias `CRYPT_VERIFY_CERT_FLAGS` = UInt;
public const val `CRYPT_VERIFY_CERT_SIGN_CHECK_WEAK_HASH_FLAG`: UInt = 8u;
public const val `CRYPT_VERIFY_CERT_SIGN_DISABLE_MD2_MD4_FLAG`: `CRYPT_VERIFY_CERT_FLAGS` = 1u;
public const val `CRYPT_VERIFY_CERT_SIGN_ISSUER_CERT`: UInt = 2u;
public const val `CRYPT_VERIFY_CERT_SIGN_ISSUER_CHAIN`: UInt = 3u;
public const val `CRYPT_VERIFY_CERT_SIGN_ISSUER_NULL`: UInt = 4u;
public const val `CRYPT_VERIFY_CERT_SIGN_ISSUER_PUBKEY`: UInt = 1u;
public const val `CRYPT_VERIFY_CERT_SIGN_RETURN_STRONG_PROPERTIES_FLAG`: `CRYPT_VERIFY_CERT_FLAGS` = 4u;
public const val `CRYPT_VERIFY_CERT_SIGN_SET_STRONG_PROPERTIES_FLAG`: `CRYPT_VERIFY_CERT_FLAGS` = 2u;
// UNSUPPORTED Rust 6551:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO {
//     pub CertSignHashCNGAlgPropData: CRYPT_INTEGER_BLOB,
//     pub CertIssuerPubKeyBitLengthPropData: CRYPT_INTEGER_BLOB,
// }

public const val `CRYPT_VERIFY_CERT_SIGN_SUBJECT_BLOB`: UInt = 1u;
public const val `CRYPT_VERIFY_CERT_SIGN_SUBJECT_CERT`: UInt = 2u;
public const val `CRYPT_VERIFY_CERT_SIGN_SUBJECT_CRL`: UInt = 3u;
public const val `CRYPT_VERIFY_CERT_SIGN_SUBJECT_OCSP_BASIC_SIGNED_RESPONSE`: UInt = 4u;
// UNSUPPORTED Rust 6561:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_VERIFY_CERT_SIGN_WEAK_HASH_INFO {
//     pub cCNGHashAlgid: u32,
//     pub rgpwszCNGHashAlgid: *const windows_sys::core::PCWSTR,
//     pub dwWeakIndex: u32,
// }

// UNSUPPORTED Rust 6568:1: declaration Impl has no candidate rule
// impl Default for CRYPT_VERIFY_CERT_SIGN_WEAK_HASH_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_VERIFY_CONTEXT_SIGNATURE`: UInt = 32u;
public const val `CRYPT_VERIFY_DATA_HASH`: UInt = 64u;
// UNSUPPORTED Rust 6575:1: generic scalar type unsupported
// pub type CRYPT_VERIFY_IMAGE_A = Option<unsafe extern "system" fn(szimage: windows_sys::core::PCSTR, pbsigdata: *const u8) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 6576:1: generic scalar type unsupported
// pub type CRYPT_VERIFY_IMAGE_W = Option<unsafe extern "system" fn(szimage: windows_sys::core::PCWSTR, pbsigdata: *const u8) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 6577:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_VERIFY_MESSAGE_PARA {
//     pub cbSize: u32,
//     pub dwMsgAndCertEncodingType: u32,
//     pub hCryptProv: HCRYPTPROV_LEGACY,
//     pub pfnGetSignerCertificate: PFN_CRYPT_GET_SIGNER_CERTIFICATE,
//     pub pvGetArg: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 6586:1: declaration Impl has no candidate rule
// impl Default for CRYPT_VERIFY_MESSAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_VOLATILE`: `CRYPT_KEY_FLAGS` = 4096u;
public const val `CRYPT_WIRE_ONLY_RETRIEVAL`: UInt = 4u;
public const val `CRYPT_WRITE`: UInt = 16u;
public const val `CRYPT_X931_FORMAT`: UInt = 4u;
public const val `CRYPT_X942_COUNTER_BYTE_LENGTH`: UInt = 4u;
public const val `CRYPT_X942_KEY_LENGTH_BYTE_LENGTH`: UInt = 4u;
// UNSUPPORTED Rust 6597:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_X942_OTHER_INFO {
//     pub pszContentEncryptionObjId: windows_sys::core::PSTR,
//     pub rgbCounter: [u8; 4],
//     pub rgbKeyLength: [u8; 4],
//     pub PubInfo: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 6605:1: declaration Impl has no candidate rule
// impl Default for CRYPT_X942_OTHER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_ALGORITHM {
//     pub cbSize: u32,
//     pub wszAlgorithm: windows_sys::core::PCWSTR,
//     pub Encoded: CRYPT_XML_BLOB,
// }

// UNSUPPORTED Rust 6617:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_ALGORITHM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6622:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_ALGORITHM_INFO {
//     pub cbSize: u32,
//     pub wszAlgorithmURI: windows_sys::core::PWSTR,
//     pub wszName: windows_sys::core::PWSTR,
//     pub dwGroupId: CRYPT_XML_GROUP_ID,
//     pub wszCNGAlgid: windows_sys::core::PWSTR,
//     pub wszCNGExtraAlgid: windows_sys::core::PWSTR,
//     pub dwSignFlags: u32,
//     pub dwVerifyFlags: u32,
//     pub pvPaddingInfo: *mut core::ffi::c_void,
//     pub pvExtraInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 6636:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_ALGORITHM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_ALGORITHM_INFO_FIND_BY_CNG_ALGID`: UInt = 3u;
public const val `CRYPT_XML_ALGORITHM_INFO_FIND_BY_CNG_SIGN_ALGID`: UInt = 4u;
public const val `CRYPT_XML_ALGORITHM_INFO_FIND_BY_NAME`: UInt = 2u;
public const val `CRYPT_XML_ALGORITHM_INFO_FIND_BY_URI`: UInt = 1u;
// UNSUPPORTED Rust 6645:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_BLOB {
//     pub dwCharset: CRYPT_XML_CHARSET,
//     pub cbData: u32,
//     pub pbData: *mut u8,
// }

// UNSUPPORTED Rust 6652:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_BLOB_MAX`: UInt = 2147483640u;
public typealias `CRYPT_XML_CHARSET` = Int;
public const val `CRYPT_XML_CHARSET_AUTO`: `CRYPT_XML_CHARSET` = 0;
public const val `CRYPT_XML_CHARSET_UTF16BE`: `CRYPT_XML_CHARSET` = 3;
public const val `CRYPT_XML_CHARSET_UTF16LE`: `CRYPT_XML_CHARSET` = 2;
public const val `CRYPT_XML_CHARSET_UTF8`: `CRYPT_XML_CHARSET` = 1;
// UNSUPPORTED Rust 6663:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_XML_CRYPTOGRAPHIC_INTERFACE {
//     pub cbSize: u32,
//     pub fpCryptXmlEncodeAlgorithm: CryptXmlDllEncodeAlgorithm,
//     pub fpCryptXmlCreateDigest: CryptXmlDllCreateDigest,
//     pub fpCryptXmlDigestData: CryptXmlDllDigestData,
//     pub fpCryptXmlFinalizeDigest: CryptXmlDllFinalizeDigest,
//     pub fpCryptXmlCloseDigest: CryptXmlDllCloseDigest,
//     pub fpCryptXmlSignData: CryptXmlDllSignData,
//     pub fpCryptXmlVerifySignature: CryptXmlDllVerifySignature,
//     pub fpCryptXmlGetAlgorithmInfo: CryptXmlDllGetAlgorithmInfo,
// }

// UNSUPPORTED Rust 6676:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_DATA_BLOB {
//     pub cbData: u32,
//     pub pbData: *mut u8,
// }

// UNSUPPORTED Rust 6682:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_DATA_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_DATA_PROVIDER {
//     pub pvCallbackState: *mut core::ffi::c_void,
//     pub cbBufferSize: u32,
//     pub pfnRead: PFN_CRYPT_XML_DATA_PROVIDER_READ,
//     pub pfnClose: PFN_CRYPT_XML_DATA_PROVIDER_CLOSE,
// }

// UNSUPPORTED Rust 6695:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_DATA_PROVIDER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_DIGEST_REFERENCE_DATA_TRANSFORMED`: UInt = 1u;
public const val `CRYPT_XML_DIGEST_VALUE_MAX`: UInt = 128u;
// UNSUPPORTED Rust 6702:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_DOC_CTXT {
//     pub cbSize: u32,
//     pub hDocCtxt: *mut core::ffi::c_void,
//     pub pTransformsConfig: *mut CRYPT_XML_TRANSFORM_CHAIN_CONFIG,
//     pub cSignature: u32,
//     pub rgpSignature: *mut *mut CRYPT_XML_SIGNATURE,
// }

// UNSUPPORTED Rust 6711:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_DOC_CTXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_E_ALGORITHM`: Int = -2146885372;
public const val `CRYPT_XML_E_BASE`: Int = -2146885376;
public const val `CRYPT_XML_E_ENCODING`: Int = -2146885373;
public const val `CRYPT_XML_E_HANDLE`: Int = -2146885370;
public const val `CRYPT_XML_E_HASH_FAILED`: Int = -2146885365;
public const val `CRYPT_XML_E_INVALID_DIGEST`: Int = -2146885367;
public const val `CRYPT_XML_E_INVALID_KEYVALUE`: Int = -2146885361;
public const val `CRYPT_XML_E_INVALID_SIGNATURE`: Int = -2146885366;
public const val `CRYPT_XML_E_LARGE`: Int = -2146885375;
public const val `CRYPT_XML_E_LAST`: Int = -2146885358;
public const val `CRYPT_XML_E_NON_UNIQUE_ID`: Int = -2146885358;
public const val `CRYPT_XML_E_OPERATION`: Int = -2146885369;
public const val `CRYPT_XML_E_SIGNER`: Int = -2146885359;
public const val `CRYPT_XML_E_SIGN_FAILED`: Int = -2146885364;
public const val `CRYPT_XML_E_TOO_MANY_SIGNATURES`: Int = -2146885362;
public const val `CRYPT_XML_E_TOO_MANY_TRANSFORMS`: Int = -2146885374;
public const val `CRYPT_XML_E_TRANSFORM`: Int = -2146885371;
public const val `CRYPT_XML_E_UNEXPECTED_XML`: Int = -2146885360;
public const val `CRYPT_XML_E_UNRESOLVED_REFERENCE`: Int = -2146885368;
public const val `CRYPT_XML_E_VERIFY_FAILED`: Int = -2146885363;
public typealias `CRYPT_XML_FLAGS` = UInt;
public const val `CRYPT_XML_FLAG_ADD_OBJECT_CREATE_COPY`: UInt = 1u;
public const val `CRYPT_XML_FLAG_ALWAYS_RETURN_ENCODED_OBJECT`: UInt = 1073741824u;
public const val `CRYPT_XML_FLAG_CREATE_REFERENCE_AS_OBJECT`: UInt = 1u;
public const val `CRYPT_XML_FLAG_DISABLE_EXTENSIONS`: `CRYPT_XML_FLAGS` = 268435456u;
public const val `CRYPT_XML_FLAG_ECDSA_DSIG11`: UInt = 67108864u;
public const val `CRYPT_XML_FLAG_ENFORCE_ID_NAME_FORMAT`: UInt = 134217728u;
public const val `CRYPT_XML_FLAG_ENFORCE_ID_NCNAME_FORMAT`: UInt = 536870912u;
public const val `CRYPT_XML_FLAG_NO_SERIALIZE`: `CRYPT_XML_FLAGS` = 2147483648u;
public typealias `CRYPT_XML_GROUP_ID` = UInt;
public const val `CRYPT_XML_GROUP_ID_HASH`: `CRYPT_XML_GROUP_ID` = 1u;
public const val `CRYPT_XML_GROUP_ID_SIGN`: `CRYPT_XML_GROUP_ID` = 2u;
public const val `CRYPT_XML_ID_MAX`: UInt = 256u;
// UNSUPPORTED Rust 6749:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_ISSUER_SERIAL {
//     pub wszIssuer: windows_sys::core::PCWSTR,
//     pub wszSerial: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 6755:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_ISSUER_SERIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6760:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_KEYINFO_PARAM {
//     pub wszId: windows_sys::core::PCWSTR,
//     pub wszKeyName: windows_sys::core::PCWSTR,
//     pub SKI: CRYPT_INTEGER_BLOB,
//     pub wszSubjectName: windows_sys::core::PCWSTR,
//     pub cCertificate: u32,
//     pub rgCertificate: *mut CRYPT_INTEGER_BLOB,
//     pub cCRL: u32,
//     pub rgCRL: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 6772:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_KEYINFO_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPT_XML_KEYINFO_SPEC` = Int;
public const val `CRYPT_XML_KEYINFO_SPEC_ENCODED`: `CRYPT_XML_KEYINFO_SPEC` = 1;
public const val `CRYPT_XML_KEYINFO_SPEC_NONE`: `CRYPT_XML_KEYINFO_SPEC` = 0;
public const val `CRYPT_XML_KEYINFO_SPEC_PARAM`: `CRYPT_XML_KEYINFO_SPEC` = 2;
public typealias `CRYPT_XML_KEYINFO_TYPE` = UInt;
public const val `CRYPT_XML_KEYINFO_TYPE_CUSTOM`: `CRYPT_XML_KEYINFO_TYPE` = 5u;
public const val `CRYPT_XML_KEYINFO_TYPE_KEYNAME`: `CRYPT_XML_KEYINFO_TYPE` = 1u;
public const val `CRYPT_XML_KEYINFO_TYPE_KEYVALUE`: `CRYPT_XML_KEYINFO_TYPE` = 2u;
public const val `CRYPT_XML_KEYINFO_TYPE_RETRIEVAL`: `CRYPT_XML_KEYINFO_TYPE` = 3u;
public const val `CRYPT_XML_KEYINFO_TYPE_X509DATA`: `CRYPT_XML_KEYINFO_TYPE` = 4u;
// UNSUPPORTED Rust 6787:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_XML_KEY_DSA_KEY_VALUE {
//     pub P: CRYPT_XML_DATA_BLOB,
//     pub Q: CRYPT_XML_DATA_BLOB,
//     pub G: CRYPT_XML_DATA_BLOB,
//     pub Y: CRYPT_XML_DATA_BLOB,
//     pub J: CRYPT_XML_DATA_BLOB,
//     pub Seed: CRYPT_XML_DATA_BLOB,
//     pub Counter: CRYPT_XML_DATA_BLOB,
// }

// UNSUPPORTED Rust 6798:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_KEY_ECDSA_KEY_VALUE {
//     pub wszNamedCurve: windows_sys::core::PCWSTR,
//     pub X: CRYPT_XML_DATA_BLOB,
//     pub Y: CRYPT_XML_DATA_BLOB,
//     pub ExplicitPara: CRYPT_XML_BLOB,
// }

// UNSUPPORTED Rust 6806:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_KEY_ECDSA_KEY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6811:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_KEY_INFO {
//     pub cbSize: u32,
//     pub wszId: windows_sys::core::PCWSTR,
//     pub cKeyInfo: u32,
//     pub rgKeyInfo: *mut CRYPT_XML_KEY_INFO_ITEM,
//     pub hVerifyKey: BCRYPT_KEY_HANDLE,
// }

// UNSUPPORTED Rust 6820:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6825:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_KEY_INFO_ITEM {
//     pub dwType: CRYPT_XML_KEYINFO_TYPE,
//     pub Anonymous: CRYPT_XML_KEY_INFO_ITEM_0,
// }

// UNSUPPORTED Rust 6831:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_KEY_INFO_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6836:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPT_XML_KEY_INFO_ITEM_0 {
//     pub wszKeyName: windows_sys::core::PCWSTR,
//     pub KeyValue: CRYPT_XML_KEY_VALUE,
//     pub RetrievalMethod: CRYPT_XML_BLOB,
//     pub X509Data: CRYPT_XML_X509DATA,
//     pub Custom: CRYPT_XML_BLOB,
// }

// UNSUPPORTED Rust 6845:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_KEY_INFO_ITEM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6850:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_XML_KEY_RSA_KEY_VALUE {
//     pub Modulus: CRYPT_XML_DATA_BLOB,
//     pub Exponent: CRYPT_XML_DATA_BLOB,
// }

// UNSUPPORTED Rust 6856:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_KEY_VALUE {
//     pub dwType: CRYPT_XML_KEY_VALUE_TYPE,
//     pub Anonymous: CRYPT_XML_KEY_VALUE_0,
// }

// UNSUPPORTED Rust 6862:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_KEY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6867:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPT_XML_KEY_VALUE_0 {
//     pub DSAKeyValue: CRYPT_XML_KEY_DSA_KEY_VALUE,
//     pub RSAKeyValue: CRYPT_XML_KEY_RSA_KEY_VALUE,
//     pub ECDSAKeyValue: CRYPT_XML_KEY_ECDSA_KEY_VALUE,
//     pub Custom: CRYPT_XML_BLOB,
// }

// UNSUPPORTED Rust 6875:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_KEY_VALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPT_XML_KEY_VALUE_TYPE` = UInt;
public const val `CRYPT_XML_KEY_VALUE_TYPE_CUSTOM`: `CRYPT_XML_KEY_VALUE_TYPE` = 4u;
public const val `CRYPT_XML_KEY_VALUE_TYPE_DSA`: `CRYPT_XML_KEY_VALUE_TYPE` = 1u;
public const val `CRYPT_XML_KEY_VALUE_TYPE_ECDSA`: `CRYPT_XML_KEY_VALUE_TYPE` = 3u;
public const val `CRYPT_XML_KEY_VALUE_TYPE_RSA`: `CRYPT_XML_KEY_VALUE_TYPE` = 2u;
// UNSUPPORTED Rust 6885:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_OBJECT {
//     pub cbSize: u32,
//     pub hObject: *mut core::ffi::c_void,
//     pub wszId: windows_sys::core::PCWSTR,
//     pub wszMimeType: windows_sys::core::PCWSTR,
//     pub wszEncoding: windows_sys::core::PCWSTR,
//     pub Manifest: CRYPT_XML_REFERENCES,
//     pub Encoded: CRYPT_XML_BLOB,
// }

// UNSUPPORTED Rust 6896:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_OBJECTS_MAX`: UInt = 256u;
// UNSUPPORTED Rust 6902:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_PROPERTY {
//     pub dwPropId: CRYPT_XML_PROPERTY_ID,
//     pub pvValue: *const core::ffi::c_void,
//     pub cbValue: u32,
// }

// UNSUPPORTED Rust 6909:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_PROPERTY_DOC_DECLARATION`: `CRYPT_XML_PROPERTY_ID` = 4;
public typealias `CRYPT_XML_PROPERTY_ID` = Int;
public const val `CRYPT_XML_PROPERTY_MAX_HEAP_SIZE`: `CRYPT_XML_PROPERTY_ID` = 1;
public const val `CRYPT_XML_PROPERTY_MAX_SIGNATURES`: `CRYPT_XML_PROPERTY_ID` = 3;
public const val `CRYPT_XML_PROPERTY_SIGNATURE_LOCATION`: `CRYPT_XML_PROPERTY_ID` = 2;
public const val `CRYPT_XML_PROPERTY_XML_OUTPUT_CHARSET`: `CRYPT_XML_PROPERTY_ID` = 5;
// UNSUPPORTED Rust 6920:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_REFERENCE {
//     pub cbSize: u32,
//     pub hReference: *mut core::ffi::c_void,
//     pub wszId: windows_sys::core::PCWSTR,
//     pub wszUri: windows_sys::core::PCWSTR,
//     pub wszType: windows_sys::core::PCWSTR,
//     pub DigestMethod: CRYPT_XML_ALGORITHM,
//     pub DigestValue: CRYPT_INTEGER_BLOB,
//     pub cTransform: u32,
//     pub rgTransform: *mut CRYPT_XML_ALGORITHM,
// }

// UNSUPPORTED Rust 6933:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6938:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_REFERENCES {
//     pub cReference: u32,
//     pub rgpReference: *mut *mut CRYPT_XML_REFERENCE,
// }

// UNSUPPORTED Rust 6944:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_REFERENCES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_REFERENCES_MAX`: UInt = 32760u;
// UNSUPPORTED Rust 6950:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_SIGNATURE {
//     pub cbSize: u32,
//     pub hSignature: *mut core::ffi::c_void,
//     pub wszId: windows_sys::core::PCWSTR,
//     pub SignedInfo: CRYPT_XML_SIGNED_INFO,
//     pub SignatureValue: CRYPT_INTEGER_BLOB,
//     pub pKeyInfo: *mut CRYPT_XML_KEY_INFO,
//     pub cObject: u32,
//     pub rgpObject: *mut *mut CRYPT_XML_OBJECT,
// }

// UNSUPPORTED Rust 6962:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_SIGNATURES_MAX`: UInt = 16u;
public const val `CRYPT_XML_SIGNATURE_VALUE_MAX`: UInt = 2048u;
// UNSUPPORTED Rust 6969:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_SIGNED_INFO {
//     pub cbSize: u32,
//     pub wszId: windows_sys::core::PCWSTR,
//     pub Canonicalization: CRYPT_XML_ALGORITHM,
//     pub SignatureMethod: CRYPT_XML_ALGORITHM,
//     pub cReference: u32,
//     pub rgpReference: *mut *mut CRYPT_XML_REFERENCE,
//     pub Encoded: CRYPT_XML_BLOB,
// }

// UNSUPPORTED Rust 6980:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_SIGNED_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_SIGN_ADD_KEYVALUE`: `CRYPT_XML_FLAGS` = 1u;
// UNSUPPORTED Rust 6986:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CRYPT_XML_STATUS {
//     pub cbSize: u32,
//     pub dwErrorStatus: CRYPT_XML_STATUS_ERROR_STATUS,
//     pub dwInfoStatus: CRYPT_XML_STATUS_INFO_STATUS,
// }

public const val `CRYPT_XML_STATUS_DIGESTING`: `CRYPT_XML_STATUS_INFO_STATUS` = 4u;
public const val `CRYPT_XML_STATUS_DIGEST_VALID`: `CRYPT_XML_STATUS_INFO_STATUS` = 8u;
public const val `CRYPT_XML_STATUS_ERROR_DIGEST_INVALID`: `CRYPT_XML_STATUS_ERROR_STATUS` = 2u;
public const val `CRYPT_XML_STATUS_ERROR_KEYINFO_NOT_PARSED`: `CRYPT_XML_STATUS_ERROR_STATUS` = 131072u;
public const val `CRYPT_XML_STATUS_ERROR_NOT_RESOLVED`: `CRYPT_XML_STATUS_ERROR_STATUS` = 1u;
public const val `CRYPT_XML_STATUS_ERROR_NOT_SUPPORTED_ALGORITHM`: `CRYPT_XML_STATUS_ERROR_STATUS` = 5u;
public const val `CRYPT_XML_STATUS_ERROR_NOT_SUPPORTED_TRANSFORM`: `CRYPT_XML_STATUS_ERROR_STATUS` = 8u;
public const val `CRYPT_XML_STATUS_ERROR_SIGNATURE_INVALID`: `CRYPT_XML_STATUS_ERROR_STATUS` = 65536u;
public typealias `CRYPT_XML_STATUS_ERROR_STATUS` = UInt;
public typealias `CRYPT_XML_STATUS_INFO_STATUS` = UInt;
public const val `CRYPT_XML_STATUS_INTERNAL_REFERENCE`: `CRYPT_XML_STATUS_INFO_STATUS` = 1u;
public const val `CRYPT_XML_STATUS_KEY_AVAILABLE`: `CRYPT_XML_STATUS_INFO_STATUS` = 2u;
public const val `CRYPT_XML_STATUS_NO_ERROR`: UInt = 0u;
public const val `CRYPT_XML_STATUS_OPENED_TO_ENCODE`: `CRYPT_XML_STATUS_INFO_STATUS` = 2147483648u;
public const val `CRYPT_XML_STATUS_SIGNATURE_VALID`: `CRYPT_XML_STATUS_INFO_STATUS` = 65536u;
// UNSUPPORTED Rust 7008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_TRANSFORM_CHAIN_CONFIG {
//     pub cbSize: u32,
//     pub cTransformInfo: u32,
//     pub rgpTransformInfo: *mut *mut CRYPT_XML_TRANSFORM_INFO,
// }

// UNSUPPORTED Rust 7015:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_TRANSFORM_CHAIN_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPT_XML_TRANSFORM_FLAGS` = UInt;
// UNSUPPORTED Rust 7021:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_TRANSFORM_INFO {
//     pub cbSize: u32,
//     pub wszAlgorithm: windows_sys::core::PCWSTR,
//     pub cbBufferSize: u32,
//     pub dwFlags: CRYPT_XML_TRANSFORM_FLAGS,
//     pub pfnCreateTransform: PFN_CRYPT_XML_CREATE_TRANSFORM,
// }

// UNSUPPORTED Rust 7030:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_TRANSFORM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRYPT_XML_TRANSFORM_MAX`: UInt = 16u;
public const val `CRYPT_XML_TRANSFORM_ON_NODESET`: `CRYPT_XML_TRANSFORM_FLAGS` = 2u;
public const val `CRYPT_XML_TRANSFORM_ON_STREAM`: `CRYPT_XML_TRANSFORM_FLAGS` = 1u;
public const val `CRYPT_XML_TRANSFORM_URI_QUERY_STRING`: `CRYPT_XML_TRANSFORM_FLAGS` = 3u;
// UNSUPPORTED Rust 7039:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_X509DATA {
//     pub cX509Data: u32,
//     pub rgX509Data: *mut CRYPT_XML_X509DATA_ITEM,
// }

// UNSUPPORTED Rust 7045:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_X509DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CRYPT_XML_X509DATA_ITEM {
//     pub dwType: CRYPT_XML_X509DATA_TYPE,
//     pub Anonymous: CRYPT_XML_X509DATA_ITEM_0,
// }

// UNSUPPORTED Rust 7056:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_X509DATA_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7061:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CRYPT_XML_X509DATA_ITEM_0 {
//     pub IssuerSerial: CRYPT_XML_ISSUER_SERIAL,
//     pub SKI: CRYPT_XML_DATA_BLOB,
//     pub wszSubjectName: windows_sys::core::PCWSTR,
//     pub Certificate: CRYPT_XML_DATA_BLOB,
//     pub CRL: CRYPT_XML_DATA_BLOB,
//     pub Custom: CRYPT_XML_BLOB,
// }

// UNSUPPORTED Rust 7071:1: declaration Impl has no candidate rule
// impl Default for CRYPT_XML_X509DATA_ITEM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CRYPT_XML_X509DATA_TYPE` = UInt;
public const val `CRYPT_XML_X509DATA_TYPE_CERTIFICATE`: `CRYPT_XML_X509DATA_TYPE` = 4u;
public const val `CRYPT_XML_X509DATA_TYPE_CRL`: `CRYPT_XML_X509DATA_TYPE` = 5u;
public const val `CRYPT_XML_X509DATA_TYPE_CUSTOM`: `CRYPT_XML_X509DATA_TYPE` = 6u;
public const val `CRYPT_XML_X509DATA_TYPE_ISSUER_SERIAL`: `CRYPT_XML_X509DATA_TYPE` = 1u;
public const val `CRYPT_XML_X509DATA_TYPE_SKI`: `CRYPT_XML_X509DATA_TYPE` = 2u;
public const val `CRYPT_XML_X509DATA_TYPE_SUBJECT_NAME`: `CRYPT_XML_X509DATA_TYPE` = 3u;
public const val `CRYPT_Y_ONLY`: `CRYPT_KEY_FLAGS` = 1u;
// UNSUPPORTED Rust 7084:1: non-scalar type Ptr unsupported
// pub const CSF_AUTHENTICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("Authenticate");

// UNSUPPORTED Rust 7085:1: non-scalar type Ptr unsupported
// pub const CSF_CHANGE_AUTHENTICATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Change Authenticator");

// UNSUPPORTED Rust 7086:1: non-scalar type Ptr unsupported
// pub const CSF_IMPORT_KEYPAIR: windows_sys::core::PCWSTR = windows_sys::core::w!("Import Key Pair");

// UNSUPPORTED Rust 7087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CTL_ANY_SUBJECT_INFO {
//     pub SubjectAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub SubjectIdentifier: CRYPT_INTEGER_BLOB,
// }

public const val `CTL_ANY_SUBJECT_TYPE`: UInt = 1u;
public const val `CTL_CERT_SUBJECT_TYPE`: UInt = 2u;
// UNSUPPORTED Rust 7095:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_CONTEXT {
//     pub dwMsgAndCertEncodingType: u32,
//     pub pbCtlEncoded: *mut u8,
//     pub cbCtlEncoded: u32,
//     pub pCtlInfo: *mut CTL_INFO,
//     pub hCertStore: HCERTSTORE,
//     pub hCryptMsg: *mut core::ffi::c_void,
//     pub pbCtlContent: *mut u8,
//     pub cbCtlContent: u32,
// }

// UNSUPPORTED Rust 7107:1: declaration Impl has no candidate rule
// impl Default for CTL_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7112:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_ENTRY {
//     pub SubjectIdentifier: CRYPT_INTEGER_BLOB,
//     pub cAttribute: u32,
//     pub rgAttribute: *mut CRYPT_ATTRIBUTE,
// }

// UNSUPPORTED Rust 7119:1: declaration Impl has no candidate rule
// impl Default for CTL_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CTL_ENTRY_FROM_PROP_CHAIN_FLAG`: UInt = 1u;
public const val `CTL_FIND_ANY`: `CERT_FIND_TYPE` = 0u;
public const val `CTL_FIND_EXISTING`: `CERT_FIND_TYPE` = 5u;
public const val `CTL_FIND_MD5_HASH`: `CERT_FIND_TYPE` = 2u;
public const val `CTL_FIND_NO_LIST_ID_CBDATA`: UInt = 4294967295u;
public const val `CTL_FIND_SAME_USAGE_FLAG`: `CERT_FIND_TYPE` = 1u;
public const val `CTL_FIND_SHA1_HASH`: `CERT_FIND_TYPE` = 1u;
public const val `CTL_FIND_SUBJECT`: `CERT_FIND_TYPE` = 4u;
// UNSUPPORTED Rust 7132:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_FIND_SUBJECT_PARA {
//     pub cbSize: u32,
//     pub pUsagePara: *mut CTL_FIND_USAGE_PARA,
//     pub dwSubjectType: u32,
//     pub pvSubject: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 7140:1: declaration Impl has no candidate rule
// impl Default for CTL_FIND_SUBJECT_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CTL_FIND_USAGE`: `CERT_FIND_TYPE` = 3u;
// UNSUPPORTED Rust 7146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_FIND_USAGE_PARA {
//     pub cbSize: u32,
//     pub SubjectUsage: CTL_USAGE,
//     pub ListIdentifier: CRYPT_INTEGER_BLOB,
//     pub pSigner: *mut CERT_INFO,
// }

// UNSUPPORTED Rust 7154:1: declaration Impl has no candidate rule
// impl Default for CTL_FIND_USAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_INFO {
//     pub dwVersion: u32,
//     pub SubjectUsage: CTL_USAGE,
//     pub ListIdentifier: CRYPT_INTEGER_BLOB,
//     pub SequenceNumber: CRYPT_INTEGER_BLOB,
//     pub ThisUpdate: super::super::Foundation::FILETIME,
//     pub NextUpdate: super::super::Foundation::FILETIME,
//     pub SubjectAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub cCTLEntry: u32,
//     pub rgCTLEntry: *mut CTL_ENTRY,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 7174:1: declaration Impl has no candidate rule
// impl Default for CTL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_USAGE {
//     pub cUsageIdentifier: u32,
//     pub rgpszUsageIdentifier: *mut windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 7185:1: declaration Impl has no candidate rule
// impl Default for CTL_USAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CTL_USAGE_MATCH {
//     pub dwType: u32,
//     pub Usage: CTL_USAGE,
// }

public const val `CTL_V1`: UInt = 0u;
// UNSUPPORTED Rust 7197:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_VERIFY_USAGE_PARA {
//     pub cbSize: u32,
//     pub ListIdentifier: CRYPT_INTEGER_BLOB,
//     pub cCtlStore: u32,
//     pub rghCtlStore: *mut HCERTSTORE,
//     pub cSignerStore: u32,
//     pub rghSignerStore: *mut HCERTSTORE,
// }

// UNSUPPORTED Rust 7207:1: declaration Impl has no candidate rule
// impl Default for CTL_VERIFY_USAGE_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CTL_VERIFY_USAGE_STATUS {
//     pub cbSize: u32,
//     pub dwError: u32,
//     pub dwFlags: u32,
//     pub ppCtl: *mut *mut CTL_CONTEXT,
//     pub dwCtlEntryIndex: u32,
//     pub ppSigner: *mut *mut CERT_CONTEXT,
//     pub dwSignerIndex: u32,
// }

// UNSUPPORTED Rust 7223:1: declaration Impl has no candidate rule
// impl Default for CTL_VERIFY_USAGE_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CUR_BLOB_VERSION`: UInt = 2u;
public const val `CUR_OFFLOAD_VERSION`: UInt = 1u;
public typealias `CertKeyType` = UInt;
public const val `ChallengeResponsePinType`: `SECRET_TYPE` = 2;
// UNSUPPORTED Rust 7232:1: generic scalar type unsupported
// pub type CryptXmlDllCloseDigest = Option<unsafe extern "system" fn(hdigest: *const core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7233:1: generic scalar type unsupported
// pub type CryptXmlDllCreateDigest = Option<unsafe extern "system" fn(pdigestmethod: *const CRYPT_XML_ALGORITHM, pcbsize: *mut u32, phdigest: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7234:1: generic scalar type unsupported
// pub type CryptXmlDllCreateKey = Option<unsafe extern "system" fn(pencoded: *const CRYPT_XML_BLOB, phkey: *mut BCRYPT_KEY_HANDLE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7235:1: generic scalar type unsupported
// pub type CryptXmlDllDigestData = Option<unsafe extern "system" fn(hdigest: *const core::ffi::c_void, pbdata: *const u8, cbdata: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7236:1: generic scalar type unsupported
// pub type CryptXmlDllEncodeAlgorithm = Option<unsafe extern "system" fn(palginfo: *const CRYPT_XML_ALGORITHM_INFO, dwcharset: CRYPT_XML_CHARSET, pvcallbackstate: *mut core::ffi::c_void, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7237:1: generic scalar type unsupported
// pub type CryptXmlDllEncodeKeyValue = Option<unsafe extern "system" fn(hkey: NCRYPT_KEY_HANDLE, dwcharset: CRYPT_XML_CHARSET, pvcallbackstate: *mut core::ffi::c_void, pfnwrite: PFN_CRYPT_XML_WRITE_CALLBACK) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7238:1: generic scalar type unsupported
// pub type CryptXmlDllFinalizeDigest = Option<unsafe extern "system" fn(hdigest: *const core::ffi::c_void, pbdigest: *mut u8, cbdigest: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7239:1: generic scalar type unsupported
// pub type CryptXmlDllGetAlgorithmInfo = Option<unsafe extern "system" fn(pxmlalgorithm: *const CRYPT_XML_ALGORITHM, ppalginfo: *mut *mut CRYPT_XML_ALGORITHM_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7240:1: generic scalar type unsupported
// pub type CryptXmlDllGetInterface = Option<unsafe extern "system" fn(dwflags: u32, pmethod: *const CRYPT_XML_ALGORITHM_INFO, pinterface: *mut CRYPT_XML_CRYPTOGRAPHIC_INTERFACE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7241:1: generic scalar type unsupported
// pub type CryptXmlDllSignData = Option<unsafe extern "system" fn(psignaturemethod: *const CRYPT_XML_ALGORITHM, hcryptprovorncryptkey: HCRYPTPROV_OR_NCRYPT_KEY_HANDLE, dwkeyspec: u32, pbinput: *const u8, cbinput: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 7242:1: generic scalar type unsupported
// pub type CryptXmlDllVerifySignature = Option<unsafe extern "system" fn(psignaturemethod: *const CRYPT_XML_ALGORITHM, hkey: BCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, pbsignature: *const u8, cbsignature: u32) -> windows_sys::core::HRESULT>;

public typealias `DSAFIPSVERSION_ENUM` = Int;
public const val `DSA_FIPS186_2`: `DSAFIPSVERSION_ENUM` = 0;
public const val `DSA_FIPS186_3`: `DSAFIPSVERSION_ENUM` = 1;
public const val `DSA_HASH_ALGORITHM_SHA1`: `HASHALGORITHM_ENUM` = 0;
public const val `DSA_HASH_ALGORITHM_SHA256`: `HASHALGORITHM_ENUM` = 1;
public const val `DSA_HASH_ALGORITHM_SHA512`: `HASHALGORITHM_ENUM` = 2;
// UNSUPPORTED Rust 7249:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSSSEED {
//     pub counter: u32,
//     pub seed: [u8; 20],
// }

// UNSUPPORTED Rust 7255:1: declaration Impl has no candidate rule
// impl Default for DSSSEED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DTLS1_0_PROTOCOL_VERSION`: UInt = 65279u;
public const val `DTLS1_2_PROTOCOL_VERSION`: UInt = 65277u;
public const val `DigitalSignaturePin`: `SECRET_PURPOSE` = 1;
public typealias `Direction` = Int;
public const val `DirectionDecrypt`: `Direction` = 2;
public const val `DirectionEncrypt`: `Direction` = 1;
// UNSUPPORTED Rust 7266:1: non-scalar type Ptr unsupported
// pub const ECC_CMS_SHARED_INFO: windows_sys::core::PCSTR = 77i32 as _;

public typealias `ECC_CURVE_ALG_ID_ENUM` = Int;
public typealias `ECC_CURVE_TYPE_ENUM` = Int;
// UNSUPPORTED Rust 7269:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENDPOINTADDRESS {
//     pub serviceUrl: windows_sys::core::PCWSTR,
//     pub policyUrl: windows_sys::core::PCWSTR,
//     pub rawCertificate: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 7276:1: declaration Impl has no candidate rule
// impl Default for ENDPOINTADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENDPOINTADDRESS2 {
//     pub serviceUrl: windows_sys::core::PCWSTR,
//     pub policyUrl: windows_sys::core::PCWSTR,
//     pub identityType: u32,
//     pub identityBytes: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 7289:1: declaration Impl has no candidate rule
// impl Default for ENDPOINTADDRESS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENUM_CEPSETUPPROP_AUTHENTICATION`: `CEPSetupProperty` = 0;
public const val `ENUM_CEPSETUPPROP_CAINFORMATION`: `MSCEPSetupProperty` = 11;
public const val `ENUM_CEPSETUPPROP_CHALLENGEURL`: `MSCEPSetupProperty` = 13;
public const val `ENUM_CEPSETUPPROP_EXCHANGEKEYINFORMATION`: `MSCEPSetupProperty` = 10;
public const val `ENUM_CEPSETUPPROP_KEYBASED_RENEWAL`: `CEPSetupProperty` = 3;
public const val `ENUM_CEPSETUPPROP_MSCEPURL`: `MSCEPSetupProperty` = 12;
public const val `ENUM_CEPSETUPPROP_RANAME_CITY`: `MSCEPSetupProperty` = 6;
public const val `ENUM_CEPSETUPPROP_RANAME_CN`: `MSCEPSetupProperty` = 2;
public const val `ENUM_CEPSETUPPROP_RANAME_COMPANY`: `MSCEPSetupProperty` = 4;
public const val `ENUM_CEPSETUPPROP_RANAME_COUNTRY`: `MSCEPSetupProperty` = 8;
public const val `ENUM_CEPSETUPPROP_RANAME_DEPT`: `MSCEPSetupProperty` = 5;
public const val `ENUM_CEPSETUPPROP_RANAME_EMAIL`: `MSCEPSetupProperty` = 3;
public const val `ENUM_CEPSETUPPROP_RANAME_STATE`: `MSCEPSetupProperty` = 7;
public const val `ENUM_CEPSETUPPROP_SIGNINGKEYINFORMATION`: `MSCEPSetupProperty` = 9;
public const val `ENUM_CEPSETUPPROP_SSLCERTHASH`: `CEPSetupProperty` = 1;
public const val `ENUM_CEPSETUPPROP_URL`: `CEPSetupProperty` = 2;
public const val `ENUM_CEPSETUPPROP_USECHALLENGE`: `MSCEPSetupProperty` = 1;
public const val `ENUM_CEPSETUPPROP_USELOCALSYSTEM`: `MSCEPSetupProperty` = 0;
public const val `ENUM_CESSETUPPROP_ALLOW_KEYBASED_RENEWAL`: `CESSetupProperty` = 6;
public const val `ENUM_CESSETUPPROP_AUTHENTICATION`: `CESSetupProperty` = 2;
public const val `ENUM_CESSETUPPROP_CACONFIG`: `CESSetupProperty` = 1;
public const val `ENUM_CESSETUPPROP_RENEWALONLY`: `CESSetupProperty` = 5;
public const val `ENUM_CESSETUPPROP_SSLCERTHASH`: `CESSetupProperty` = 3;
public const val `ENUM_CESSETUPPROP_URL`: `CESSetupProperty` = 4;
public const val `ENUM_CESSETUPPROP_USE_IISAPPPOOLIDENTITY`: `CESSetupProperty` = 0;
public const val `ENUM_SETUPPROP_CADSSUFFIX`: `CASetupProperty` = 4;
public const val `ENUM_SETUPPROP_CAKEYINFORMATION`: `CASetupProperty` = 1;
public const val `ENUM_SETUPPROP_CANAME`: `CASetupProperty` = 3;
public const val `ENUM_SETUPPROP_CATYPE`: `CASetupProperty` = 0;
public const val `ENUM_SETUPPROP_DATABASEDIRECTORY`: `CASetupProperty` = 9;
public const val `ENUM_SETUPPROP_EXPIRATIONDATE`: `CASetupProperty` = 7;
public const val `ENUM_SETUPPROP_INTERACTIVE`: `CASetupProperty` = 2;
public const val `ENUM_SETUPPROP_INVALID`: `CASetupProperty` = -1;
public const val `ENUM_SETUPPROP_LOGDIRECTORY`: `CASetupProperty` = 10;
public const val `ENUM_SETUPPROP_PARENTCAMACHINE`: `CASetupProperty` = 12;
public const val `ENUM_SETUPPROP_PARENTCANAME`: `CASetupProperty` = 13;
public const val `ENUM_SETUPPROP_PRESERVEDATABASE`: `CASetupProperty` = 8;
public const val `ENUM_SETUPPROP_REQUESTFILE`: `CASetupProperty` = 14;
public const val `ENUM_SETUPPROP_SHAREDFOLDER`: `CASetupProperty` = 11;
public const val `ENUM_SETUPPROP_VALIDITYPERIOD`: `CASetupProperty` = 5;
public const val `ENUM_SETUPPROP_VALIDITYPERIODUNIT`: `CASetupProperty` = 6;
public const val `ENUM_SETUPPROP_WEBCAMACHINE`: `CASetupProperty` = 15;
public const val `ENUM_SETUPPROP_WEBCANAME`: `CASetupProperty` = 16;
// UNSUPPORTED Rust 7337:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EV_EXTRA_CERT_CHAIN_POLICY_PARA {
//     pub cbSize: u32,
//     pub dwRootProgramQualifierFlags: CERT_ROOT_PROGRAM_FLAGS,
// }

// UNSUPPORTED Rust 7343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EV_EXTRA_CERT_CHAIN_POLICY_STATUS {
//     pub cbSize: u32,
//     pub dwQualifiers: u32,
//     pub dwIssuanceUsageIndex: u32,
// }

public const val `EXPORT_PRIVATE_KEYS`: UInt = 4u;
// UNSUPPORTED Rust 7351:1: non-scalar type Ptr unsupported
// pub const EXPO_OFFLOAD_FUNC_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("OffloadModExpo");

// UNSUPPORTED Rust 7352:1: non-scalar type Ptr unsupported
// pub const EXPO_OFFLOAD_REG_VALUE: windows_sys::core::PCSTR = windows_sys::core::s!("ExpoOffload");

public const val `E_ICARD_ARGUMENT`: Int = -1073413883;
public const val `E_ICARD_COMMUNICATION`: Int = -1073413888;
public const val `E_ICARD_DATA_ACCESS`: Int = -1073413887;
public const val `E_ICARD_EXPORT`: Int = -1073413886;
public const val `E_ICARD_FAIL`: Int = -1073413867;
public const val `E_ICARD_FAILED_REQUIRED_CLAIMS`: Int = -1073413756;
public const val `E_ICARD_IDENTITY`: Int = -1073413885;
public const val `E_ICARD_IMPORT`: Int = -1073413884;
public const val `E_ICARD_INFORMATIONCARD`: Int = -1073413881;
public const val `E_ICARD_INVALID_PROOF_KEY`: Int = -1073413758;
public const val `E_ICARD_LOGOVALIDATION`: Int = -1073413879;
public const val `E_ICARD_MISSING_APPLIESTO`: Int = -1073413759;
public const val `E_ICARD_PASSWORDVALIDATION`: Int = -1073413878;
public const val `E_ICARD_POLICY`: Int = -1073413877;
public const val `E_ICARD_PROCESSDIED`: Int = -1073413876;
public const val `E_ICARD_REFRESH_REQUIRED`: Int = -1073413760;
public const val `E_ICARD_REQUEST`: Int = -1073413882;
public const val `E_ICARD_SERVICE`: Int = -1073413874;
public const val `E_ICARD_SERVICEBUSY`: Int = -1073413875;
public const val `E_ICARD_SHUTTINGDOWN`: Int = -1073413873;
public const val `E_ICARD_STOREKEY`: Int = -1073413880;
public const val `E_ICARD_STORE_IMPORT`: Int = -1073413868;
public const val `E_ICARD_TOKENCREATION`: Int = -1073413872;
public const val `E_ICARD_TRUSTEXCHANGE`: Int = -1073413871;
public const val `E_ICARD_UI_INITIALIZATION`: Int = -1073413862;
public const val `E_ICARD_UNKNOWN_REFERENCE`: Int = -1073413757;
public const val `E_ICARD_UNTRUSTED`: Int = -1073413870;
public const val `E_ICARD_USERCANCELLED`: Int = -1073413869;
public const val `EmptyPinType`: `SECRET_TYPE` = 3;
public const val `EncryptionPin`: `SECRET_PURPOSE` = 2;
public const val `EveryoneReadAdminWriteAc`: `CARD_FILE_ACCESS_CONDITION` = 3;
public const val `EveryoneReadUserWriteAc`: `CARD_FILE_ACCESS_CONDITION` = 1;
public const val `ExternalPinType`: `SECRET_TYPE` = 1;
// UNSUPPORTED Rust 7386:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct GENERIC_XML_TOKEN {
//     pub createDate: super::super::Foundation::FILETIME,
//     pub expiryDate: super::super::Foundation::FILETIME,
//     pub xmlToken: windows_sys::core::PWSTR,
//     pub internalTokenReference: windows_sys::core::PWSTR,
//     pub externalTokenReference: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 7395:1: declaration Impl has no candidate rule
// impl Default for GENERIC_XML_TOKEN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7400:1: generic scalar type unsupported
// pub type GetAsymmetricEncryptionInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, pszalgid: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut BCRYPT_ASYMMETRIC_ENCRYPTION_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7401:1: generic scalar type unsupported
// pub type GetCipherInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, pszalgid: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut BCRYPT_CIPHER_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7402:1: generic scalar type unsupported
// pub type GetHashInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, pszalgid: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut BCRYPT_HASH_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7403:1: generic scalar type unsupported
// pub type GetKeyDerivationInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, pszalgid: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut BCRYPT_KEY_DERIVATION_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7404:1: generic scalar type unsupported
// pub type GetKeyStorageInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut NCRYPT_KEY_STORAGE_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7405:1: generic scalar type unsupported
// pub type GetRngInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut BCRYPT_RNG_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7406:1: generic scalar type unsupported
// pub type GetSChannelInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut NCRYPT_SSL_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7407:1: generic scalar type unsupported
// pub type GetSecretAgreementInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, pszalgid: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut BCRYPT_SECRET_AGREEMENT_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 7408:1: generic scalar type unsupported
// pub type GetSignatureInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, pszalgid: windows_sys::core::PCWSTR, ppfunctiontable: *mut *mut BCRYPT_SIGNATURE_FUNCTION_TABLE, dwflags: u32) -> super::super::Foundation::NTSTATUS>;

public typealias `HASHALGORITHM_ENUM` = Int;
// UNSUPPORTED Rust 7410:1: non-scalar type Ptr unsupported
// pub type HCERTCHAINENGINE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 7411:1: non-scalar type Ptr unsupported
// pub type HCERTSTORE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 7412:1: non-scalar type Ptr unsupported
// pub type HCERTSTOREPROV = *mut core::ffi::c_void;

public typealias `HCRYPTASYNC` = Long;
public typealias `HCRYPTPROV_LEGACY` = ULong;
public typealias `HCRYPTPROV_OR_NCRYPT_KEY_HANDLE` = ULong;
// UNSUPPORTED Rust 7416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HMAC_INFO {
//     pub HashAlgid: ALG_ID,
//     pub pbInnerString: *mut u8,
//     pub cbInnerString: u32,
//     pub pbOuterString: *mut u8,
//     pub cbOuterString: u32,
// }

// UNSUPPORTED Rust 7425:1: declaration Impl has no candidate rule
// impl Default for HMAC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HP_ALGID`: UInt = 1u;
public const val `HP_HASHSIZE`: UInt = 4u;
public const val `HP_HASHVAL`: `CRYPT_SET_HASH_PARAM` = 2u;
public const val `HP_HMAC_INFO`: `CRYPT_SET_HASH_PARAM` = 5u;
public const val `HP_TLS1PRF_LABEL`: UInt = 6u;
public const val `HP_TLS1PRF_SEED`: UInt = 7u;
public typealias `HTTPSPOLICY_CALLBACK_DATA_AUTH_TYPE` = UInt;
// UNSUPPORTED Rust 7437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTPSPolicyCallbackData {
//     pub Anonymous: HTTPSPolicyCallbackData_0,
//     pub dwAuthType: HTTPSPOLICY_CALLBACK_DATA_AUTH_TYPE,
//     pub fdwChecks: u32,
//     pub pwszServerName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 7445:1: declaration Impl has no candidate rule
// impl Default for HTTPSPolicyCallbackData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7450:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HTTPSPolicyCallbackData_0 {
//     pub cbStruct: u32,
//     pub cbSize: u32,
// }

// UNSUPPORTED Rust 7456:1: declaration Impl has no candidate rule
// impl Default for HTTPSPolicyCallbackData_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7461:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct HandleType(pub i32);

// UNSUPPORTED Rust 7464:1: declaration Impl has no candidate rule
// impl HandleType {
//     pub const Asymmetric: Self = Self(1i32);
//     pub const Symmetric: Self = Self(2i32);
//     pub const Transform: Self = Self(3i32);
//     pub const Hash: Self = Self(4i32);
// }

public const val `IFX_RSA_KEYGEN_VUL_AFFECTED_LEVEL_1`: UInt = 1u;
public const val `IFX_RSA_KEYGEN_VUL_AFFECTED_LEVEL_2`: UInt = 2u;
public const val `IFX_RSA_KEYGEN_VUL_NOT_AFFECTED`: UInt = 0u;
// UNSUPPORTED Rust 7473:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INFORMATIONCARD_ASYMMETRIC_CRYPTO_PARAMETERS {
//     pub keySize: i32,
//     pub keyExchangeAlgorithm: windows_sys::core::PWSTR,
//     pub signatureAlgorithm: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 7480:1: declaration Impl has no candidate rule
// impl Default for INFORMATIONCARD_ASYMMETRIC_CRYPTO_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7485:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INFORMATIONCARD_CRYPTO_HANDLE {
//     pub r#type: HandleType,
//     pub expiration: i64,
//     pub cryptoParameters: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 7492:1: declaration Impl has no candidate rule
// impl Default for INFORMATIONCARD_CRYPTO_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INFORMATIONCARD_HASH_CRYPTO_PARAMETERS {
//     pub hashSize: i32,
//     pub transform: INFORMATIONCARD_TRANSFORM_CRYPTO_PARAMETERS,
// }

// UNSUPPORTED Rust 7503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INFORMATIONCARD_SYMMETRIC_CRYPTO_PARAMETERS {
//     pub keySize: i32,
//     pub blockSize: i32,
//     pub feedbackSize: i32,
// }

// UNSUPPORTED Rust 7510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INFORMATIONCARD_TRANSFORM_CRYPTO_PARAMETERS {
//     pub inputBlockSize: i32,
//     pub outputBlockSize: i32,
//     pub canTransformMultipleBlocks: windows_sys::core::BOOL,
//     pub canReuseTransform: windows_sys::core::BOOL,
// }

public const val `INTERNATIONAL_USAGE`: UInt = 1u;
// UNSUPPORTED Rust 7519:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct InFileSignatureResource {
//     pub dwVersion: u32,
//     pub dwCrcOffset: u32,
//     pub rgbSignature: [u8; 88],
// }

// UNSUPPORTED Rust 7526:1: declaration Impl has no candidate rule
// impl Default for InFileSignatureResource {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `InvalidAc`: `CARD_FILE_ACCESS_CONDITION` = 0;
public const val `InvalidDirAc`: `CARD_DIRECTORY_ACCESS_CONDITION` = 0;
public const val `KDF_ALGORITHMID`: UInt = 8u;
public const val `KDF_CONTEXT`: UInt = 14u;
public const val `KDF_GENERIC_PARAMETER`: UInt = 17u;
public const val `KDF_HASH_ALGORITHM`: UInt = 0u;
public const val `KDF_HKDF_INFO`: UInt = 20u;
public const val `KDF_HKDF_SALT`: UInt = 19u;
public const val `KDF_HMAC_KEY`: UInt = 3u;
public const val `KDF_ITERATION_COUNT`: UInt = 16u;
public const val `KDF_KEYBITLENGTH`: UInt = 18u;
public const val `KDF_LABEL`: UInt = 13u;
public const val `KDF_PARTYUINFO`: UInt = 9u;
public const val `KDF_PARTYVINFO`: UInt = 10u;
public const val `KDF_SALT`: UInt = 15u;
public const val `KDF_SECRET_APPEND`: UInt = 2u;
public const val `KDF_SECRET_HANDLE`: UInt = 6u;
public const val `KDF_SECRET_PREPEND`: UInt = 1u;
public const val `KDF_SUPPPRIVINFO`: UInt = 12u;
public const val `KDF_SUPPPUBINFO`: UInt = 11u;
public const val `KDF_TLS_PRF_LABEL`: UInt = 4u;
public const val `KDF_TLS_PRF_PROTOCOL`: UInt = 7u;
public const val `KDF_TLS_PRF_SEED`: UInt = 5u;
public const val `KDF_USE_SECRET_AS_HMAC_KEY_FLAG`: UInt = 1u;
public const val `KEYSTATEBLOB`: UInt = 12u;
public const val `KEY_LENGTH_MASK`: UInt = 4294901760u;
// UNSUPPORTED Rust 7557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KEY_TYPE_SUBTYPE {
//     pub dwKeySpec: u32,
//     pub Type: windows_sys::core::GUID,
//     pub Subtype: windows_sys::core::GUID,
// }

public const val `KP_ADMIN_PIN`: UInt = 31u;
public const val `KP_ALGID`: `CRYPT_KEY_PARAM_ID` = 7u;
public const val `KP_BLOCKLEN`: `CRYPT_KEY_PARAM_ID` = 8u;
public const val `KP_CERTIFICATE`: `CRYPT_KEY_PARAM_ID` = 26u;
public const val `KP_CLEAR_KEY`: UInt = 27u;
public const val `KP_CLIENT_RANDOM`: UInt = 21u;
public const val `KP_CMS_DH_KEY_INFO`: UInt = 38u;
public const val `KP_CMS_KEY_INFO`: UInt = 37u;
public const val `KP_EFFECTIVE_KEYLEN`: UInt = 19u;
public const val `KP_G`: UInt = 12u;
public const val `KP_GET_USE_COUNT`: `CRYPT_KEY_PARAM_ID` = 42u;
public const val `KP_HIGHEST_VERSION`: UInt = 41u;
public const val `KP_INFO`: UInt = 18u;
public const val `KP_IV`: UInt = 1u;
public const val `KP_KEYEXCHANGE_PIN`: UInt = 32u;
public const val `KP_KEYLEN`: `CRYPT_KEY_PARAM_ID` = 9u;
public const val `KP_KEYVAL`: UInt = 30u;
public const val `KP_MODE`: UInt = 4u;
public const val `KP_MODE_BITS`: UInt = 5u;
public const val `KP_OAEP_PARAMS`: UInt = 36u;
public const val `KP_P`: UInt = 11u;
public const val `KP_PADDING`: UInt = 3u;
public const val `KP_PERMISSIONS`: `CRYPT_KEY_PARAM_ID` = 6u;
public const val `KP_PIN_ID`: UInt = 43u;
public const val `KP_PIN_INFO`: UInt = 44u;
public const val `KP_PRECOMP_MD5`: UInt = 24u;
public const val `KP_PRECOMP_SHA`: UInt = 25u;
public const val `KP_PREHASH`: UInt = 34u;
public const val `KP_PUB_EX_LEN`: UInt = 28u;
public const val `KP_PUB_EX_VAL`: UInt = 29u;
public const val `KP_PUB_PARAMS`: UInt = 39u;
public const val `KP_Q`: UInt = 13u;
public const val `KP_RA`: UInt = 16u;
public const val `KP_RB`: UInt = 17u;
public const val `KP_ROUNDS`: UInt = 35u;
public const val `KP_RP`: UInt = 23u;
public const val `KP_SALT`: `CRYPT_KEY_PARAM_ID` = 2u;
public const val `KP_SALT_EX`: `CRYPT_KEY_PARAM_ID` = 10u;
public const val `KP_SCHANNEL_ALG`: UInt = 20u;
public const val `KP_SERVER_RANDOM`: UInt = 22u;
public const val `KP_SIGNATURE_PIN`: UInt = 33u;
public const val `KP_VERIFY_PARAMS`: UInt = 40u;
public const val `KP_X`: UInt = 14u;
public const val `KP_Y`: UInt = 15u;
public const val `KeyTypeHardware`: `CertKeyType` = 6u;
public const val `KeyTypeOther`: `CertKeyType` = 0u;
public const val `KeyTypePassport`: `CertKeyType` = 3u;
public const val `KeyTypePassportRemote`: `CertKeyType` = 4u;
public const val `KeyTypePassportSmartCard`: `CertKeyType` = 5u;
public const val `KeyTypePhysicalSmartCard`: `CertKeyType` = 2u;
public const val `KeyTypeSelfSigned`: `CertKeyType` = 8u;
public const val `KeyTypeSoftware`: `CertKeyType` = 7u;
public const val `KeyTypeVirtualSmartCard`: `CertKeyType` = 1u;
// UNSUPPORTED Rust 7617:1: non-scalar type Ptr unsupported
// pub const LEGACY_DH_PRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPIDHPRIVATEBLOB");

// UNSUPPORTED Rust 7618:1: non-scalar type Ptr unsupported
// pub const LEGACY_DH_PUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPIDHPUBLICBLOB");

// UNSUPPORTED Rust 7619:1: non-scalar type Ptr unsupported
// pub const LEGACY_DSA_PRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPIDSAPRIVATEBLOB");

// UNSUPPORTED Rust 7620:1: non-scalar type Ptr unsupported
// pub const LEGACY_DSA_PUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPIDSAPUBLICBLOB");

// UNSUPPORTED Rust 7621:1: non-scalar type Ptr unsupported
// pub const LEGACY_DSA_V2_PRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("V2CAPIDSAPRIVATEBLOB");

// UNSUPPORTED Rust 7622:1: non-scalar type Ptr unsupported
// pub const LEGACY_DSA_V2_PUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("V2CAPIDSAPUBLICBLOB");

// UNSUPPORTED Rust 7623:1: non-scalar type Ptr unsupported
// pub const LEGACY_RSAPRIVATE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPIPRIVATEBLOB");

// UNSUPPORTED Rust 7624:1: non-scalar type Ptr unsupported
// pub const LEGACY_RSAPUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPIPUBLICBLOB");

public const val `MAXUIDLEN`: UInt = 64u;
public const val `MAX_CONTAINER_NAME_LEN`: UInt = 39u;
public const val `MAX_PINS`: UInt = 8u;
public const val `MICROSOFT_ROOT_CERT_CHAIN_POLICY_CHECK_APPLICATION_ROOT_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 131072u;
public const val `MICROSOFT_ROOT_CERT_CHAIN_POLICY_DISABLE_FLIGHT_ROOT_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 262144u;
public const val `MICROSOFT_ROOT_CERT_CHAIN_POLICY_ENABLE_TEST_ROOT_FLAG`: `CERT_CHAIN_POLICY_FLAGS` = 65536u;
public typealias `MSCEPSetupProperty` = Int;
public const val `MSCRYPT_ECC_MAX_CURVE_NAME_LENGTH`: UInt = 255u;
public const val `MSCRYPT_ECC_MAX_OID_LENGTH`: UInt = 255u;
// UNSUPPORTED Rust 7634:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DH_SCHANNEL_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft DH SChannel Cryptographic Provider");

// UNSUPPORTED Rust 7635:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DH_SCHANNEL_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft DH SChannel Cryptographic Provider");

// UNSUPPORTED Rust 7636:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DH_SCHANNEL_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft DH SChannel Cryptographic Provider");

// UNSUPPORTED Rust 7637:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DSS_DH_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base DSS and Diffie-Hellman Cryptographic Provider");

// UNSUPPORTED Rust 7638:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DSS_DH_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Base DSS and Diffie-Hellman Cryptographic Provider");

// UNSUPPORTED Rust 7639:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DSS_DH_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base DSS and Diffie-Hellman Cryptographic Provider");

// UNSUPPORTED Rust 7640:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DSS_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base DSS Cryptographic Provider");

// UNSUPPORTED Rust 7641:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DSS_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Base DSS Cryptographic Provider");

// UNSUPPORTED Rust 7642:1: non-scalar type Ptr unsupported
// pub const MS_DEF_DSS_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base DSS Cryptographic Provider");

// UNSUPPORTED Rust 7643:1: non-scalar type Ptr unsupported
// pub const MS_DEF_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base Cryptographic Provider v1.0");

// UNSUPPORTED Rust 7644:1: non-scalar type Ptr unsupported
// pub const MS_DEF_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Base Cryptographic Provider v1.0");

// UNSUPPORTED Rust 7645:1: non-scalar type Ptr unsupported
// pub const MS_DEF_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base Cryptographic Provider v1.0");

// UNSUPPORTED Rust 7646:1: non-scalar type Ptr unsupported
// pub const MS_DEF_RSA_SCHANNEL_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft RSA SChannel Cryptographic Provider");

// UNSUPPORTED Rust 7647:1: non-scalar type Ptr unsupported
// pub const MS_DEF_RSA_SCHANNEL_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft RSA SChannel Cryptographic Provider");

// UNSUPPORTED Rust 7648:1: non-scalar type Ptr unsupported
// pub const MS_DEF_RSA_SCHANNEL_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft RSA SChannel Cryptographic Provider");

// UNSUPPORTED Rust 7649:1: non-scalar type Ptr unsupported
// pub const MS_DEF_RSA_SIG_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft RSA Signature Cryptographic Provider");

// UNSUPPORTED Rust 7650:1: non-scalar type Ptr unsupported
// pub const MS_DEF_RSA_SIG_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft RSA Signature Cryptographic Provider");

// UNSUPPORTED Rust 7651:1: non-scalar type Ptr unsupported
// pub const MS_DEF_RSA_SIG_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft RSA Signature Cryptographic Provider");

// UNSUPPORTED Rust 7652:1: non-scalar type Ptr unsupported
// pub const MS_ENHANCED_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced Cryptographic Provider v1.0");

// UNSUPPORTED Rust 7653:1: non-scalar type Ptr unsupported
// pub const MS_ENHANCED_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Enhanced Cryptographic Provider v1.0");

// UNSUPPORTED Rust 7654:1: non-scalar type Ptr unsupported
// pub const MS_ENHANCED_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced Cryptographic Provider v1.0");

// UNSUPPORTED Rust 7655:1: non-scalar type Ptr unsupported
// pub const MS_ENH_DSS_DH_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced DSS and Diffie-Hellman Cryptographic Provider");

// UNSUPPORTED Rust 7656:1: non-scalar type Ptr unsupported
// pub const MS_ENH_DSS_DH_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Enhanced DSS and Diffie-Hellman Cryptographic Provider");

// UNSUPPORTED Rust 7657:1: non-scalar type Ptr unsupported
// pub const MS_ENH_DSS_DH_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced DSS and Diffie-Hellman Cryptographic Provider");

// UNSUPPORTED Rust 7658:1: non-scalar type Ptr unsupported
// pub const MS_ENH_RSA_AES_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced RSA and AES Cryptographic Provider");

// UNSUPPORTED Rust 7659:1: non-scalar type Ptr unsupported
// pub const MS_ENH_RSA_AES_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Enhanced RSA and AES Cryptographic Provider");

// UNSUPPORTED Rust 7660:1: non-scalar type Ptr unsupported
// pub const MS_ENH_RSA_AES_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced RSA and AES Cryptographic Provider");

// UNSUPPORTED Rust 7661:1: non-scalar type Ptr unsupported
// pub const MS_ENH_RSA_AES_PROV_XP: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)");

// UNSUPPORTED Rust 7662:1: non-scalar type Ptr unsupported
// pub const MS_ENH_RSA_AES_PROV_XP_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)");

// UNSUPPORTED Rust 7663:1: non-scalar type Ptr unsupported
// pub const MS_ENH_RSA_AES_PROV_XP_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Enhanced RSA and AES Cryptographic Provider (Prototype)");

// UNSUPPORTED Rust 7664:1: non-scalar type Ptr unsupported
// pub const MS_KEY_PROTECTION_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Key Protection Provider");

// UNSUPPORTED Rust 7665:1: non-scalar type Ptr unsupported
// pub const MS_KEY_STORAGE_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Software Key Storage Provider");

// UNSUPPORTED Rust 7666:1: non-scalar type Ptr unsupported
// pub const MS_NGC_KEY_STORAGE_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Passport Key Storage Provider");

// UNSUPPORTED Rust 7667:1: non-scalar type Ptr unsupported
// pub const MS_PLATFORM_CRYPTO_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Platform Crypto Provider");

// UNSUPPORTED Rust 7668:1: non-scalar type Ptr unsupported
// pub const MS_PLATFORM_KEY_STORAGE_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Platform Crypto Provider");

// UNSUPPORTED Rust 7669:1: non-scalar type Ptr unsupported
// pub const MS_PRIMITIVE_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Primitive Provider");

// UNSUPPORTED Rust 7670:1: non-scalar type Ptr unsupported
// pub const MS_SCARD_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base Smart Card Crypto Provider");

// UNSUPPORTED Rust 7671:1: non-scalar type Ptr unsupported
// pub const MS_SCARD_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Base Smart Card Crypto Provider");

// UNSUPPORTED Rust 7672:1: non-scalar type Ptr unsupported
// pub const MS_SCARD_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Base Smart Card Crypto Provider");

// UNSUPPORTED Rust 7673:1: non-scalar type Ptr unsupported
// pub const MS_SCHANNEL_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft SSL Protocol Provider");

// UNSUPPORTED Rust 7674:1: non-scalar type Ptr unsupported
// pub const MS_SMART_CARD_KEY_STORAGE_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Smart Card Key Storage Provider");

// UNSUPPORTED Rust 7675:1: non-scalar type Ptr unsupported
// pub const MS_STRONG_PROV: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Strong Cryptographic Provider");

// UNSUPPORTED Rust 7676:1: non-scalar type Ptr unsupported
// pub const MS_STRONG_PROV_A: windows_sys::core::PCSTR = windows_sys::core::s!("Microsoft Strong Cryptographic Provider");

// UNSUPPORTED Rust 7677:1: non-scalar type Ptr unsupported
// pub const MS_STRONG_PROV_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Strong Cryptographic Provider");

public const val `NCRYPTBUFFER_ATTESTATIONSTATEMENT_BLOB`: UInt = 51u;
public const val `NCRYPTBUFFER_ATTESTATION_CLAIM_CHALLENGE_REQUIRED`: UInt = 53u;
public const val `NCRYPTBUFFER_ATTESTATION_CLAIM_TYPE`: UInt = 52u;
public const val `NCRYPTBUFFER_CERT_BLOB`: UInt = 47u;
public const val `NCRYPTBUFFER_CLAIM_IDBINDING_NONCE`: UInt = 48u;
public const val `NCRYPTBUFFER_CLAIM_KEYATTESTATION_NONCE`: UInt = 49u;
public const val `NCRYPTBUFFER_DATA`: UInt = 1u;
public const val `NCRYPTBUFFER_ECC_CURVE_NAME`: UInt = 60u;
public const val `NCRYPTBUFFER_ECC_PARAMETERS`: UInt = 61u;
public const val `NCRYPTBUFFER_EMPTY`: UInt = 0u;
public const val `NCRYPTBUFFER_KEY_PROPERTY_FLAGS`: UInt = 50u;
public const val `NCRYPTBUFFER_PKCS_ALG_ID`: UInt = 43u;
public const val `NCRYPTBUFFER_PKCS_ALG_OID`: UInt = 41u;
public const val `NCRYPTBUFFER_PKCS_ALG_PARAM`: UInt = 42u;
public const val `NCRYPTBUFFER_PKCS_ATTRS`: UInt = 44u;
public const val `NCRYPTBUFFER_PKCS_KEY_NAME`: UInt = 45u;
public const val `NCRYPTBUFFER_PKCS_OID`: UInt = 40u;
public const val `NCRYPTBUFFER_PKCS_SECRET`: UInt = 46u;
public const val `NCRYPTBUFFER_PROTECTION_DESCRIPTOR_STRING`: UInt = 3u;
public const val `NCRYPTBUFFER_PROTECTION_FLAGS`: UInt = 4u;
public const val `NCRYPTBUFFER_SSL_CLEAR_KEY`: UInt = 23u;
public const val `NCRYPTBUFFER_SSL_CLIENT_RANDOM`: UInt = 20u;
public const val `NCRYPTBUFFER_SSL_HIGHEST_VERSION`: UInt = 22u;
public const val `NCRYPTBUFFER_SSL_KEY_ARG_DATA`: UInt = 24u;
public const val `NCRYPTBUFFER_SSL_SERVER_RANDOM`: UInt = 21u;
public const val `NCRYPTBUFFER_SSL_SESSION_HASH`: UInt = 25u;
public const val `NCRYPTBUFFER_TPM_PLATFORM_CLAIM_NONCE`: UInt = 81u;
public const val `NCRYPTBUFFER_TPM_PLATFORM_CLAIM_PCR_MASK`: UInt = 80u;
public const val `NCRYPTBUFFER_TPM_PLATFORM_CLAIM_STATIC_CREATE`: UInt = 82u;
public const val `NCRYPTBUFFER_TPM_SEAL_NO_DA_PROTECTION`: UInt = 73u;
public const val `NCRYPTBUFFER_TPM_SEAL_PASSWORD`: UInt = 70u;
public const val `NCRYPTBUFFER_TPM_SEAL_POLICYINFO`: UInt = 71u;
public const val `NCRYPTBUFFER_TPM_SEAL_TICKET`: UInt = 72u;
public const val `NCRYPTBUFFER_VERSION`: UInt = 0u;
public const val `NCRYPTBUFFER_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS`: UInt = 54u;
// UNSUPPORTED Rust 7713:1: non-scalar type Ptr unsupported
// pub const NCRYPT_3DES_112_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("3DES_112");

// UNSUPPORTED Rust 7714:1: non-scalar type Ptr unsupported
// pub const NCRYPT_3DES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("3DES");

// UNSUPPORTED Rust 7715:1: non-scalar type Ptr unsupported
// pub const NCRYPT_AES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("AES");

// UNSUPPORTED Rust 7716:1: non-scalar type Ptr unsupported
// pub const NCRYPT_AES_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("AES");

// UNSUPPORTED Rust 7717:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ALGORITHM_GROUP_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Algorithm Group");

public typealias `NCRYPT_ALGORITHM_NAME_CLASS` = UInt;
// UNSUPPORTED Rust 7719:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ALGORITHM_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Algorithm Name");

// UNSUPPORTED Rust 7720:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_ALLOC_PARA {
//     pub cbSize: u32,
//     pub pfnAlloc: PFN_NCRYPT_ALLOC,
//     pub pfnFree: PFN_NCRYPT_FREE,
// }

public const val `NCRYPT_ALLOW_ALL_USAGES`: UInt = 16777215u;
public const val `NCRYPT_ALLOW_ARCHIVING_FLAG`: UInt = 4u;
public const val `NCRYPT_ALLOW_DECRYPT_FLAG`: UInt = 1u;
public const val `NCRYPT_ALLOW_EXPORT_FLAG`: UInt = 1u;
public const val `NCRYPT_ALLOW_KEY_AGREEMENT_FLAG`: UInt = 4u;
public const val `NCRYPT_ALLOW_KEY_IMPORT_FLAG`: UInt = 8u;
public const val `NCRYPT_ALLOW_PLAINTEXT_ARCHIVING_FLAG`: UInt = 8u;
public const val `NCRYPT_ALLOW_PLAINTEXT_EXPORT_FLAG`: UInt = 2u;
public const val `NCRYPT_ALLOW_SIGNING_FLAG`: UInt = 2u;
public const val `NCRYPT_ALLOW_SILENT_KEY_ACCESS`: UInt = 1u;
// UNSUPPORTED Rust 7737:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ALTERNATE_KEY_STORAGE_LOCATION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_ALTERNATE_KEY_STORAGE_LOCATION");

// UNSUPPORTED Rust 7738:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ASSOCIATED_ECDH_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardAssociatedECDHKey");

public const val `NCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE`: `NCRYPT_ALGORITHM_NAME_CLASS` = 3u;
public const val `NCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION`: `NCRYPT_OPERATION` = 4u;
public const val `NCRYPT_ATTESTATION_FLAG`: UInt = 32u;
public const val `NCRYPT_AUTHORITY_KEY_FLAG`: UInt = 256u;
// UNSUPPORTED Rust 7743:1: non-scalar type Ptr unsupported
// pub const NCRYPT_AUTH_TAG_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthTagLength");

// UNSUPPORTED Rust 7744:1: non-scalar type Ptr unsupported
// pub const NCRYPT_BLOCK_LENGTH_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Block Length");

// UNSUPPORTED Rust 7745:1: non-scalar type Ptr unsupported
// pub const NCRYPT_CAPI_KDF_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("CAPI_KDF");

// UNSUPPORTED Rust 7746:1: non-scalar type Ptr unsupported
// pub const NCRYPT_CERTIFICATE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardKeyCertificate");

// UNSUPPORTED Rust 7747:1: non-scalar type Ptr unsupported
// pub const NCRYPT_CHAINING_MODE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Chaining Mode");

// UNSUPPORTED Rust 7748:1: non-scalar type Ptr unsupported
// pub const NCRYPT_CHANGEPASSWORD_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_CHANGEPASSWORD");

public const val `NCRYPT_CIPHER_BLOCK_PADDING_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 7750:1: non-scalar type Ptr unsupported
// pub const NCRYPT_CIPHER_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CipherKeyBlob");

public const val `NCRYPT_CIPHER_KEY_BLOB_MAGIC`: UInt = 1380470851u;
public const val `NCRYPT_CIPHER_NO_PADDING_FLAG`: UInt = 0u;
public const val `NCRYPT_CIPHER_OPERATION`: `NCRYPT_OPERATION` = 1u;
public const val `NCRYPT_CIPHER_OTHER_PADDING_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 7755:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_CIPHER_PADDING_INFO {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub pbIV: *mut u8,
//     pub cbIV: u32,
//     pub pbOtherInfo: *mut u8,
//     pub cbOtherInfo: u32,
// }

// UNSUPPORTED Rust 7765:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_CIPHER_PADDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NCRYPT_CLAIM_AUTHORITY_AND_SUBJECT`: UInt = 3u;
public const val `NCRYPT_CLAIM_AUTHORITY_ONLY`: UInt = 1u;
public const val `NCRYPT_CLAIM_PLATFORM`: UInt = 65536u;
public const val `NCRYPT_CLAIM_SUBJECT_ONLY`: UInt = 2u;
public const val `NCRYPT_CLAIM_UNKNOWN`: UInt = 4096u;
public const val `NCRYPT_CLAIM_VSM_KEY_ATTESTATION_STATEMENT`: UInt = 4u;
public const val `NCRYPT_CLAIM_WEB_AUTH_SUBJECT_ONLY`: UInt = 258u;
// UNSUPPORTED Rust 7777:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DESCR_DELIMITER_AND: windows_sys::core::PCWSTR = windows_sys::core::w!("AND");

// UNSUPPORTED Rust 7778:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DESCR_DELIMITER_OR: windows_sys::core::PCWSTR = windows_sys::core::w!("OR");

// UNSUPPORTED Rust 7779:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DESCR_EQUAL: windows_sys::core::PCWSTR = windows_sys::core::w!("=");

// UNSUPPORTED Rust 7780:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DESX_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DESX");

// UNSUPPORTED Rust 7781:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DES_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DES");

// UNSUPPORTED Rust 7782:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DES_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("DES");

// UNSUPPORTED Rust 7783:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DH_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DH");

// UNSUPPORTED Rust 7784:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DH_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("DH");

// UNSUPPORTED Rust 7785:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DH_PARAMETERS_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("DHParameters");

// UNSUPPORTED Rust 7786:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DISMISS_UI_TIMEOUT_SEC_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardDismissUITimeoutSeconds");

public const val `NCRYPT_DO_NOT_FINALIZE_FLAG`: UInt = 1024u;
// UNSUPPORTED Rust 7788:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("DSA");

// UNSUPPORTED Rust 7789:1: non-scalar type Ptr unsupported
// pub const NCRYPT_DSA_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("DSA");

// UNSUPPORTED Rust 7790:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECC_CURVE_NAME_LIST_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCCurveNameList");

// UNSUPPORTED Rust 7791:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECC_CURVE_NAME_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCCurveName");

// UNSUPPORTED Rust 7792:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECC_PARAMETERS_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("ECCParameters");

// UNSUPPORTED Rust 7793:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDH_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH");

// UNSUPPORTED Rust 7794:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDH_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH");

// UNSUPPORTED Rust 7795:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDH_P256_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH_P256");

// UNSUPPORTED Rust 7796:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDH_P384_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH_P384");

// UNSUPPORTED Rust 7797:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDH_P521_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDH_P521");

// UNSUPPORTED Rust 7798:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA");

// UNSUPPORTED Rust 7799:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDSA_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA");

// UNSUPPORTED Rust 7800:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDSA_P256_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA_P256");

// UNSUPPORTED Rust 7801:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDSA_P384_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA_P384");

// UNSUPPORTED Rust 7802:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ECDSA_P521_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA_P521");

// UNSUPPORTED Rust 7803:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_EXPORTED_ISOLATED_KEY_ENVELOPE {
//     pub Header: NCRYPT_EXPORTED_ISOLATED_KEY_HEADER,
// }

// UNSUPPORTED Rust 7808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_EXPORTED_ISOLATED_KEY_HEADER {
//     pub Version: u32,
//     pub KeyUsage: u32,
//     pub _bitfield: u32,
//     pub cbAlgName: u32,
//     pub cbNonce: u32,
//     pub cbAuthTag: u32,
//     pub cbWrappingKey: u32,
//     pub cbIsolatedKey: u32,
// }

public const val `NCRYPT_EXPORTED_ISOLATED_KEY_HEADER_CURRENT_VERSION`: UInt = 0u;
public const val `NCRYPT_EXPORTED_ISOLATED_KEY_HEADER_V0`: UInt = 0u;
public const val `NCRYPT_EXPORT_LEGACY_FLAG`: UInt = 2048u;
// UNSUPPORTED Rust 7823:1: non-scalar type Ptr unsupported
// pub const NCRYPT_EXPORT_POLICY_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Export Policy");

public const val `NCRYPT_EXTENDED_ERRORS_FLAG`: UInt = 268435456u;
public typealias `NCRYPT_FLAGS` = UInt;
public typealias `NCRYPT_HANDLE` = ULong;
public typealias `NCRYPT_HASH_HANDLE` = ULong;
public const val `NCRYPT_HASH_OPERATION`: `NCRYPT_OPERATION` = 2u;
// UNSUPPORTED Rust 7829:1: non-scalar type Ptr unsupported
// pub const NCRYPT_HMAC_SHA256_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("HMAC-SHA256");

public const val `NCRYPT_IGNORE_DEVICE_STATE_FLAG`: UInt = 4096u;
public const val `NCRYPT_IMPL_HARDWARE_FLAG`: UInt = 1u;
public const val `NCRYPT_IMPL_HARDWARE_RNG_FLAG`: UInt = 16u;
public const val `NCRYPT_IMPL_REMOVABLE_FLAG`: UInt = 8u;
public const val `NCRYPT_IMPL_SOFTWARE_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 7835:1: non-scalar type Ptr unsupported
// pub const NCRYPT_IMPL_TYPE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Impl Type");

public const val `NCRYPT_IMPL_VIRTUAL_ISOLATION_FLAG`: UInt = 32u;
// UNSUPPORTED Rust 7837:1: non-scalar type Ptr unsupported
// pub const NCRYPT_INITIALIZATION_VECTOR: windows_sys::core::PCWSTR = windows_sys::core::w!("IV");

// UNSUPPORTED Rust 7838:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES {
//     pub Version: u32,
//     pub Flags: u32,
//     pub cbPublicKeyBlob: u32,
// }

public const val `NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES_CURRENT_VERSION`: UInt = 0u;
public const val `NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES_V0`: UInt = 0u;
// UNSUPPORTED Rust 7847:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ISOLATED_KEY_ENVELOPE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("ISOLATED_KEY_ENVELOPE");

public const val `NCRYPT_ISOLATED_KEY_FLAG_CREATED_IN_ISOLATION`: UInt = 1u;
public const val `NCRYPT_ISOLATED_KEY_FLAG_IMPORT_ONLY`: UInt = 2u;
// UNSUPPORTED Rust 7850:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KDF_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("KDFKeyBlob");

public const val `NCRYPT_KDF_KEY_BLOB_MAGIC`: UInt = 826688587u;
// UNSUPPORTED Rust 7852:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KDF_SECRET_VALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("KDFKeySecret");

// UNSUPPORTED Rust 7853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_KEY_ACCESS_POLICY_BLOB {
//     pub dwVersion: u32,
//     pub dwPolicyFlags: u32,
//     pub cbUserSid: u32,
//     pub cbApplicationSid: u32,
// }

// UNSUPPORTED Rust 7861:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_ACCESS_POLICY_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Key Access Policy");

public const val `NCRYPT_KEY_ACCESS_POLICY_VERSION`: UInt = 1u;
public const val `NCRYPT_KEY_ATTEST_MAGIC`: UInt = 1146110283u;
// UNSUPPORTED Rust 7864:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_KEY_ATTEST_PADDING_INFO {
//     pub magic: u32,
//     pub pbKeyBlob: *mut u8,
//     pub cbKeyBlob: u32,
//     pub pbKeyAuth: *mut u8,
//     pub cbKeyAuth: u32,
// }

// UNSUPPORTED Rust 7873:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_KEY_ATTEST_PADDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7878:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_KEY_BLOB_HEADER {
//     pub cbSize: u32,
//     pub dwMagic: u32,
//     pub cbAlgName: u32,
//     pub cbKeyData: u32,
// }

// UNSUPPORTED Rust 7886:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_DERIVATION_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("KEY_DERIVATION");

public const val `NCRYPT_KEY_DERIVATION_INTERFACE`: UInt = 7u;
public const val `NCRYPT_KEY_DERIVATION_OPERATION`: UInt = 64u;
public typealias `NCRYPT_KEY_HANDLE` = ULong;
// UNSUPPORTED Rust 7890:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_ALGORITHM_CERTIFICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("CERTIFICATE");

// UNSUPPORTED Rust 7891:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_ALGORITHM_LOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("LOCAL");

// UNSUPPORTED Rust 7892:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_ALGORITHM_LOCKEDCREDENTIALS: windows_sys::core::PCWSTR = windows_sys::core::w!("LOCKEDCREDENTIALS");

// UNSUPPORTED Rust 7893:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_ALGORITHM_SDDL: windows_sys::core::PCWSTR = windows_sys::core::w!("SDDL");

// UNSUPPORTED Rust 7894:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_ALGORITHM_SID: windows_sys::core::PCWSTR = windows_sys::core::w!("SID");

// UNSUPPORTED Rust 7895:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_ALGORITHM_WEBCREDENTIALS: windows_sys::core::PCWSTR = windows_sys::core::w!("WEBCREDENTIALS");

// UNSUPPORTED Rust 7896:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_CERT_CERTBLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("CertBlob");

// UNSUPPORTED Rust 7897:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_CERT_HASHID: windows_sys::core::PCWSTR = windows_sys::core::w!("HashId");

public const val `NCRYPT_KEY_PROTECTION_INTERFACE`: UInt = 65540u;
// UNSUPPORTED Rust 7899:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_LOCAL_LOGON: windows_sys::core::PCWSTR = windows_sys::core::w!("logon");

// UNSUPPORTED Rust 7900:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_LOCAL_MACHINE: windows_sys::core::PCWSTR = windows_sys::core::w!("machine");

// UNSUPPORTED Rust 7901:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_PROTECTION_LOCAL_USER: windows_sys::core::PCWSTR = windows_sys::core::w!("user");

// UNSUPPORTED Rust 7902:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_STORAGE_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("KEY_STORAGE");

// UNSUPPORTED Rust 7903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_KEY_STORAGE_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub OpenProvider: NCryptOpenStorageProviderFn,
//     pub OpenKey: NCryptOpenKeyFn,
//     pub CreatePersistedKey: NCryptCreatePersistedKeyFn,
//     pub GetProviderProperty: NCryptGetProviderPropertyFn,
//     pub GetKeyProperty: NCryptGetKeyPropertyFn,
//     pub SetProviderProperty: NCryptSetProviderPropertyFn,
//     pub SetKeyProperty: NCryptSetKeyPropertyFn,
//     pub FinalizeKey: NCryptFinalizeKeyFn,
//     pub DeleteKey: NCryptDeleteKeyFn,
//     pub FreeProvider: NCryptFreeProviderFn,
//     pub FreeKey: NCryptFreeKeyFn,
//     pub FreeBuffer: NCryptFreeBufferFn,
//     pub Encrypt: NCryptEncryptFn,
//     pub Decrypt: NCryptDecryptFn,
//     pub IsAlgSupported: NCryptIsAlgSupportedFn,
//     pub EnumAlgorithms: NCryptEnumAlgorithmsFn,
//     pub EnumKeys: NCryptEnumKeysFn,
//     pub ImportKey: NCryptImportKeyFn,
//     pub ExportKey: NCryptExportKeyFn,
//     pub SignHash: NCryptSignHashFn,
//     pub VerifySignature: NCryptVerifySignatureFn,
//     pub PromptUser: NCryptPromptUserFn,
//     pub NotifyChangeKey: NCryptNotifyChangeKeyFn,
//     pub SecretAgreement: NCryptSecretAgreementFn,
//     pub DeriveKey: NCryptDeriveKeyFn,
//     pub FreeSecret: NCryptFreeSecretFn,
//     pub KeyDerivation: NCryptKeyDerivationFn,
//     pub CreateClaim: NCryptCreateClaimFn,
//     pub VerifyClaim: NCryptVerifyClaimFn,
// }

public const val `NCRYPT_KEY_STORAGE_INTERFACE`: `BCRYPT_INTERFACE` = 65537u;
// UNSUPPORTED Rust 7938:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_TYPE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Key Type");

// UNSUPPORTED Rust 7939:1: non-scalar type Ptr unsupported
// pub const NCRYPT_KEY_USAGE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Key Usage");

// UNSUPPORTED Rust 7940:1: non-scalar type Ptr unsupported
// pub const NCRYPT_LAST_MODIFIED_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Modified");

// UNSUPPORTED Rust 7941:1: non-scalar type Ptr unsupported
// pub const NCRYPT_LENGTHS_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Lengths");

// UNSUPPORTED Rust 7942:1: non-scalar type Ptr unsupported
// pub const NCRYPT_LENGTH_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Length");

public const val `NCRYPT_MACHINE_KEY_FLAG`: `NCRYPT_FLAGS` = 32u;
public const val `NCRYPT_MAX_ALG_ID_LENGTH`: UInt = 512u;
public const val `NCRYPT_MAX_KEY_NAME_LENGTH`: UInt = 512u;
// UNSUPPORTED Rust 7946:1: non-scalar type Ptr unsupported
// pub const NCRYPT_MAX_NAME_LENGTH_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Max Name Length");

public const val `NCRYPT_MAX_PROPERTY_DATA`: UInt = 1048576u;
public const val `NCRYPT_MAX_PROPERTY_NAME`: UInt = 64u;
// UNSUPPORTED Rust 7949:1: non-scalar type Ptr unsupported
// pub const NCRYPT_MD2_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("MD2");

// UNSUPPORTED Rust 7950:1: non-scalar type Ptr unsupported
// pub const NCRYPT_MD4_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("MD4");

// UNSUPPORTED Rust 7951:1: non-scalar type Ptr unsupported
// pub const NCRYPT_MD5_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("MD5");

public const val `NCRYPT_NAMED_DESCRIPTOR_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 7953:1: non-scalar type Ptr unsupported
// pub const NCRYPT_NAME_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

public const val `NCRYPT_NO_CACHED_PASSWORD`: UInt = 16384u;
public const val `NCRYPT_NO_KEY_VALIDATION`: `NCRYPT_FLAGS` = 8u;
public const val `NCRYPT_NO_PADDING_FLAG`: `NCRYPT_FLAGS` = 1u;
// UNSUPPORTED Rust 7957:1: non-scalar type Ptr unsupported
// pub const NCRYPT_OPAQUETRANSPORT_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("OpaqueTransport");

public typealias `NCRYPT_OPERATION` = UInt;
public const val `NCRYPT_OVERWRITE_KEY_FLAG`: `NCRYPT_FLAGS` = 128u;
public const val `NCRYPT_PAD_CIPHER_FLAG`: UInt = 16u;
public const val `NCRYPT_PAD_OAEP_FLAG`: `NCRYPT_FLAGS` = 4u;
public const val `NCRYPT_PAD_PKCS1_FLAG`: `NCRYPT_FLAGS` = 2u;
public const val `NCRYPT_PAD_PSS_FLAG`: `NCRYPT_FLAGS` = 8u;
// UNSUPPORTED Rust 7964:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PBKDF2_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("PBKDF2");

// UNSUPPORTED Rust 7965:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_ALTERNATE_KEY_STORAGE_LOCATION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_ALTERNATE_KEY_STORAGE_LOCATION");

// UNSUPPORTED Rust 7966:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_CHANGEPASSWORD_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_CHANGEPASSWORD");

// UNSUPPORTED Rust 7967:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_ECC_EKCERT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_ECC_EKCERT");

// UNSUPPORTED Rust 7968:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_ECC_EKNVCERT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_ECC_EKNVCERT");

// UNSUPPORTED Rust 7969:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_ECC_EKPUB_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_ECC_EKPUB");

// UNSUPPORTED Rust 7970:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_EKCERT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_EKCERT");

// UNSUPPORTED Rust 7971:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_EKNVCERT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_EKNVCERT");

// UNSUPPORTED Rust 7972:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_EKPUB_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_EKPUB");

public const val `NCRYPT_PCP_ENCRYPTION_KEY`: UInt = 2u;
// UNSUPPORTED Rust 7974:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_EXPORT_ALLOWED_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_EXPORT_ALLOWED");

public const val `NCRYPT_PCP_HMACVERIFICATION_KEY`: UInt = 16u;
// UNSUPPORTED Rust 7976:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_HMAC_AUTH_NONCE: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_HMAC_AUTH_NONCE");

// UNSUPPORTED Rust 7977:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_HMAC_AUTH_POLICYINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_HMAC_AUTH_POLICYINFO");

// UNSUPPORTED Rust 7978:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_HMAC_AUTH_POLICYREF: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_HMAC_AUTH_POLICYREF");

// UNSUPPORTED Rust 7979:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_HMAC_AUTH_SIGNATURE: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_HMAC_AUTH_SIGNATURE");

// UNSUPPORTED Rust 7980:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_PCP_HMAC_AUTH_SIGNATURE_INFO {
//     pub dwVersion: u32,
//     pub iExpiration: i32,
//     pub pabNonce: [u8; 32],
//     pub pabPolicyRef: [u8; 32],
//     pub pabHMAC: [u8; 32],
// }

// UNSUPPORTED Rust 7989:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_PCP_HMAC_AUTH_SIGNATURE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 7994:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_HMAC_AUTH_TICKET: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_HMAC_AUTH_TICKET");

public const val `NCRYPT_PCP_IDENTITY_KEY`: UInt = 8u;
// UNSUPPORTED Rust 7996:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_INTERMEDIATE_CA_EKCERT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_INTERMEDIATE_CA_EKCERT");

// UNSUPPORTED Rust 7997:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_KEYATTESTATION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM12_KEYATTESTATION");

// UNSUPPORTED Rust 7998:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_KEY_CREATIONHASH_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_KEY_CREATIONHASH");

// UNSUPPORTED Rust 7999:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_KEY_CREATIONTICKET_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_KEY_CREATIONTICKET");

// UNSUPPORTED Rust 8000:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_KEY_USAGE_POLICY_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_KEY_USAGE_POLICY");

// UNSUPPORTED Rust 8001:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_MIGRATIONPASSWORD_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_MIGRATIONPASSWORD");

// UNSUPPORTED Rust 8002:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_NO_DA_PROTECTION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_NO_DA_PROTECTION");

// UNSUPPORTED Rust 8003:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PASSWORD_REQUIRED_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PASSWORD_REQUIRED");

// UNSUPPORTED Rust 8004:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PCRTABLE_ALGORITHM_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PCRTABLE_ALGORITHM");

// UNSUPPORTED Rust 8005:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PCRTABLE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PCRTABLE");

// UNSUPPORTED Rust 8006:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PLATFORMHANDLE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PLATFORMHANDLE");

// UNSUPPORTED Rust 8007:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PLATFORM_BINDING_PCRALGID_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PLATFORM_BINDING_PCRALGID");

// UNSUPPORTED Rust 8008:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PLATFORM_BINDING_PCRDIGESTLIST_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PLATFORM_BINDING_PCRDIGESTLIST");

// UNSUPPORTED Rust 8009:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PLATFORM_BINDING_PCRDIGEST_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PLATFORM_BINDING_PCRDIGEST");

// UNSUPPORTED Rust 8010:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PLATFORM_BINDING_PCRMASK_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PLATFORM_BINDING_PCRMASK");

// UNSUPPORTED Rust 8011:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PLATFORM_TYPE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PLATFORM_TYPE");

// UNSUPPORTED Rust 8012:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PROVIDERHANDLE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PROVIDERMHANDLE");

// UNSUPPORTED Rust 8013:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PROVIDER_VERSION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_PROVIDER_VERSION");

// UNSUPPORTED Rust 8014:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_PSS_SALT_SIZE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PSS Salt Size");

// UNSUPPORTED Rust 8015:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_PCP_RAW_POLICYDIGEST_INFO {
//     pub dwVersion: u32,
//     pub cbDigest: u32,
// }

// UNSUPPORTED Rust 8021:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_RAW_POLICYDIGEST_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_RAW_POLICYDIGEST");

// UNSUPPORTED Rust 8022:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_RSA_EKCERT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_RSA_EKCERT");

// UNSUPPORTED Rust 8023:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_RSA_EKNVCERT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_RSA_EKNVCERT");

// UNSUPPORTED Rust 8024:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_RSA_EKPUB_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_RSA_EKPUB");

// UNSUPPORTED Rust 8025:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_RSA_SCHEME_HASH_ALG_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_RSA_SCHEME_HASH_ALG");

// UNSUPPORTED Rust 8026:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_RSA_SCHEME_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_RSA_SCHEME");

// UNSUPPORTED Rust 8027:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_SESSIONID_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_SESSIONID");

public const val `NCRYPT_PCP_SIGNATURE_KEY`: UInt = 1u;
// UNSUPPORTED Rust 8029:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_SRKPUB_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_SRKPUB");

// UNSUPPORTED Rust 8030:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_STORAGEPARENT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_STORAGEPARENT");

public const val `NCRYPT_PCP_STORAGE_KEY`: UInt = 4u;
// UNSUPPORTED Rust 8032:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_SYMMETRIC_KEYBITS_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_SYMMETRIC_KEYBITS");

// UNSUPPORTED Rust 8033:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM12_IDACTIVATION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM12_IDACTIVATION");

// UNSUPPORTED Rust 8034:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM12_IDBINDING_DYNAMIC_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM12_IDBINDING_DYNAMIC");

// UNSUPPORTED Rust 8035:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM12_IDBINDING_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM12_IDBINDING");

// UNSUPPORTED Rust 8036:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM2BNAME_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM2BNAME");

// UNSUPPORTED Rust 8037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_PCP_TPM_FW_VERSION_INFO {
//     pub major1: u16,
//     pub major2: u16,
//     pub minor1: u16,
//     pub minor2: u16,
// }

// UNSUPPORTED Rust 8045:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM_FW_VERSION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM_FW_VERSION");

// UNSUPPORTED Rust 8046:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM_IFX_RSA_KEYGEN_PROHIBITED_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM_IFX_RSA_KEYGEN_PROHIBITED");

// UNSUPPORTED Rust 8047:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM_IFX_RSA_KEYGEN_VULNERABILITY_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM_IFX_RSA_KEYGEN_VULNERABILITY");

// UNSUPPORTED Rust 8048:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM_MANUFACTURER_ID_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM_MANUFACTURER_ID");

// UNSUPPORTED Rust 8049:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_TPM_VERSION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_TPM_VERSION");

// UNSUPPORTED Rust 8050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_PCP_TPM_WEB_AUTHN_ATTESTATION_STATEMENT {
//     pub Magic: u32,
//     pub Version: u32,
//     pub HeaderSize: u32,
//     pub cbCertifyInfo: u32,
//     pub cbSignature: u32,
//     pub cbTpmPublic: u32,
// }

// UNSUPPORTED Rust 8060:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PCP_USAGEAUTH_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PCP_USAGEAUTH");

public const val `NCRYPT_PERSIST_FLAG`: `NCRYPT_FLAGS` = 2147483648u;
public const val `NCRYPT_PERSIST_ONLY_FLAG`: `NCRYPT_FLAGS` = 1073741824u;
// UNSUPPORTED Rust 8063:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_APPLICATION_IMAGE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCacheApplicationImage");

// UNSUPPORTED Rust 8064:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_APPLICATION_STATUS_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCacheApplicationStatus");

public const val `NCRYPT_PIN_CACHE_APPLICATION_TICKET_BYTE_LENGTH`: UInt = 90u;
// UNSUPPORTED Rust 8066:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_APPLICATION_TICKET_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCacheApplicationTicket");

public const val `NCRYPT_PIN_CACHE_CLEAR_FOR_CALLING_PROCESS_OPTION`: UInt = 1u;
// UNSUPPORTED Rust 8068:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_CLEAR_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCacheClear");

public const val `NCRYPT_PIN_CACHE_DISABLE_DPL_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 8070:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_FLAGS_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCacheFlags");

// UNSUPPORTED Rust 8071:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_FREE_APPLICATION_TICKET_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCacheFreeApplicationTicket");

// UNSUPPORTED Rust 8072:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_IS_GESTURE_REQUIRED_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCacheIsGestureRequired");

// UNSUPPORTED Rust 8073:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_CACHE_PIN_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PinCachePin");

public const val `NCRYPT_PIN_CACHE_REQUIRE_GESTURE_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 8075:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_PROMPT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardPinPrompt");

// UNSUPPORTED Rust 8076:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PIN_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardPin");

// UNSUPPORTED Rust 8077:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PKCS7_ENVELOPE_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("PKCS7_ENVELOPE");

// UNSUPPORTED Rust 8078:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PKCS8_PRIVATE_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("PKCS8_PRIVATEKEY");

public const val `NCRYPT_PLATFORM_ATTEST_MAGIC`: UInt = 1146110288u;
// UNSUPPORTED Rust 8080:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_PLATFORM_ATTEST_PADDING_INFO {
//     pub magic: u32,
//     pub pcrMask: u32,
// }

public const val `NCRYPT_PREFER_VIRTUAL_ISOLATION_FLAG`: UInt = 65536u;
// UNSUPPORTED Rust 8087:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PROTECTED_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("ProtectedKeyBlob");

public const val `NCRYPT_PROTECTED_KEY_BLOB_MAGIC`: UInt = 1263817296u;
public const val `NCRYPT_PROTECTION_INFO_TYPE_DESCRIPTOR_STRING`: UInt = 1u;
// UNSUPPORTED Rust 8090:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_PROTECT_STREAM_INFO {
//     pub pfnStreamOutput: PFNCryptStreamOutputCallback,
//     pub pvCallbackCtxt: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 8096:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_PROTECT_STREAM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_PROTECT_STREAM_INFO_EX {
//     pub pfnStreamOutput: PFNCryptStreamOutputCallbackEx,
//     pub pvCallbackCtxt: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 8107:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_PROTECT_STREAM_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NCRYPT_PROTECT_TO_LOCAL_SYSTEM`: UInt = 32768u;
// UNSUPPORTED Rust 8113:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PROVIDER_HANDLE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider Handle");

public typealias `NCRYPT_PROV_HANDLE` = ULong;
// UNSUPPORTED Rust 8115:1: non-scalar type Ptr unsupported
// pub const NCRYPT_PUBLIC_LENGTH_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("PublicKeyLength");

// UNSUPPORTED Rust 8116:1: non-scalar type Ptr unsupported
// pub const NCRYPT_RC2_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RC2");

// UNSUPPORTED Rust 8117:1: non-scalar type Ptr unsupported
// pub const NCRYPT_RC2_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("RC2");

// UNSUPPORTED Rust 8118:1: non-scalar type Ptr unsupported
// pub const NCRYPT_READER_ICON_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardReaderIcon");

// UNSUPPORTED Rust 8119:1: non-scalar type Ptr unsupported
// pub const NCRYPT_READER_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardReader");

public const val `NCRYPT_REGISTER_NOTIFY_FLAG`: `NCRYPT_FLAGS` = 1u;
public const val `NCRYPT_REQUIRE_KDS_LRPC_BIND_FLAG`: UInt = 536870912u;
// UNSUPPORTED Rust 8122:1: non-scalar type Ptr unsupported
// pub const NCRYPT_ROOT_CERTSTORE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartcardRootCertStore");

// UNSUPPORTED Rust 8123:1: non-scalar type Ptr unsupported
// pub const NCRYPT_RSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RSA");

// UNSUPPORTED Rust 8124:1: non-scalar type Ptr unsupported
// pub const NCRYPT_RSA_ALGORITHM_GROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("RSA");

// UNSUPPORTED Rust 8125:1: non-scalar type Ptr unsupported
// pub const NCRYPT_RSA_SIGN_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("RSA_SIGN");

// UNSUPPORTED Rust 8126:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SCARD_NGC_KEY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardNgcKeyName");

// UNSUPPORTED Rust 8127:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SCARD_PIN_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardPinId");

// UNSUPPORTED Rust 8128:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SCARD_PIN_INFO: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardPinInfo");

public const val `NCRYPT_SCHANNEL_INTERFACE`: `BCRYPT_INTERFACE` = 65538u;
public const val `NCRYPT_SCHANNEL_SIGNATURE_INTERFACE`: `BCRYPT_INTERFACE` = 65539u;
public const val `NCRYPT_SEALING_FLAG`: UInt = 256u;
public const val `NCRYPT_SECRET_AGREEMENT_INTERFACE`: `NCRYPT_ALGORITHM_NAME_CLASS` = 4u;
public const val `NCRYPT_SECRET_AGREEMENT_OPERATION`: `NCRYPT_OPERATION` = 8u;
public typealias `NCRYPT_SECRET_HANDLE` = ULong;
// UNSUPPORTED Rust 8135:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SECURE_PIN_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardSecurePin");

// UNSUPPORTED Rust 8136:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SECURITY_DESCR_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Security Descr");

// UNSUPPORTED Rust 8137:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SECURITY_DESCR_SUPPORT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Security Descr Support");

// UNSUPPORTED Rust 8138:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SHA1_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA1");

// UNSUPPORTED Rust 8139:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SHA256_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA256");

// UNSUPPORTED Rust 8140:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SHA384_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA384");

// UNSUPPORTED Rust 8141:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SHA512_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SHA512");

public const val `NCRYPT_SIGNATURE_INTERFACE`: `NCRYPT_ALGORITHM_NAME_CLASS` = 5u;
// UNSUPPORTED Rust 8143:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SIGNATURE_LENGTH_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SignatureLength");

public const val `NCRYPT_SIGNATURE_OPERATION`: `NCRYPT_OPERATION` = 16u;
public const val `NCRYPT_SILENT_FLAG`: `NCRYPT_FLAGS` = 64u;
// UNSUPPORTED Rust 8146:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SMARTCARD_GUID_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardGuid");

// UNSUPPORTED Rust 8147:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SP800108_CTR_HMAC_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SP800_108_CTR_HMAC");

// UNSUPPORTED Rust 8148:1: non-scalar type Ptr unsupported
// pub const NCRYPT_SP80056A_CONCAT_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("SP800_56A_CONCAT");

// UNSUPPORTED Rust 8149:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_SSL_CIPHER_LENGTHS {
//     pub cbLength: u32,
//     pub dwHeaderLen: u32,
//     pub dwFixedTrailerLen: u32,
//     pub dwMaxVariableTrailerLen: u32,
//     pub dwFlags: u32,
// }

public const val `NCRYPT_SSL_CIPHER_LENGTHS_BLOCK_PADDING`: UInt = 1u;
// UNSUPPORTED Rust 8159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_SSL_CIPHER_SUITE {
//     pub dwProtocol: u32,
//     pub dwCipherSuite: u32,
//     pub dwBaseCipherSuite: u32,
//     pub szCipherSuite: [u16; 64],
//     pub szCipher: [u16; 64],
//     pub dwCipherLen: u32,
//     pub dwCipherBlockLen: u32,
//     pub szHash: [u16; 64],
//     pub dwHashLen: u32,
//     pub szExchange: [u16; 64],
//     pub dwMinExchangeLen: u32,
//     pub dwMaxExchangeLen: u32,
//     pub szCertificate: [u16; 64],
//     pub dwKeyType: u32,
// }

// UNSUPPORTED Rust 8177:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_SSL_CIPHER_SUITE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8182:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_SSL_CIPHER_SUITE_EX {
//     pub dwVersion: u32,
//     pub dwProtocol: u32,
//     pub dwCipherSuite: u32,
//     pub dwBaseCipherSuite: u32,
//     pub szCipherSuite: [u16; 64],
//     pub szCipher: [u16; 64],
//     pub dwCipherLen: u32,
//     pub dwCipherBlockLen: u32,
//     pub szHash: [u16; 64],
//     pub dwHashLen: u32,
//     pub szExchange: [u16; 64],
//     pub dwMinExchangeLen: u32,
//     pub dwMaxExchangeLen: u32,
//     pub szCertificate: [u16; 64],
//     pub dwKeyType: u32,
//     pub szCipherMode: [u16; 64],
// }

// UNSUPPORTED Rust 8202:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_SSL_CIPHER_SUITE_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NCRYPT_SSL_CIPHER_SUITE_EX_VERSION`: UInt = 1u;
public const val `NCRYPT_SSL_CLIENT_FLAG`: UInt = 1u;
public const val `NCRYPT_SSL_EAP_FAST_ID`: UInt = 3u;
public const val `NCRYPT_SSL_EAP_ID`: UInt = 0u;
public const val `NCRYPT_SSL_EAP_PRF_FIELD`: UInt = 255u;
public const val `NCRYPT_SSL_EAP_TTLSV0_CHLNG_ID`: UInt = 2u;
public const val `NCRYPT_SSL_EAP_TTLSV0_ID`: UInt = 1u;
// UNSUPPORTED Rust 8214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_SSL_ECC_CURVE {
//     pub szCurveName: [u16; 255],
//     pub szOID: [i8; 255],
//     pub dwPublicKeyLength: u32,
//     pub dwCurveType: u32,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 8223:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_SSL_ECC_CURVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NCRYPT_SSL_EXTERNAL_PSK_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 8229:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_SSL_FUNCTION_TABLE {
//     pub Version: BCRYPT_INTERFACE_VERSION,
//     pub ComputeClientAuthHash: SslComputeClientAuthHashFn,
//     pub ComputeEapKeyBlock: SslComputeEapKeyBlockFn,
//     pub ComputeFinishedHash: SslComputeFinishedHashFn,
//     pub CreateEphemeralKey: SslCreateEphemeralKeyFn,
//     pub CreateHandshakeHash: SslCreateHandshakeHashFn,
//     pub DecryptPacket: SslDecryptPacketFn,
//     pub EncryptPacket: SslEncryptPacketFn,
//     pub EnumCipherSuites: SslEnumCipherSuitesFn,
//     pub ExportKey: SslExportKeyFn,
//     pub FreeBuffer: SslFreeBufferFn,
//     pub FreeObject: SslFreeObjectFn,
//     pub GenerateMasterKey: SslGenerateMasterKeyFn,
//     pub GenerateSessionKeys: SslGenerateSessionKeysFn,
//     pub GetKeyProperty: SslGetKeyPropertyFn,
//     pub GetProviderProperty: SslGetProviderPropertyFn,
//     pub HashHandshake: SslHashHandshakeFn,
//     pub ImportMasterKey: SslImportMasterKeyFn,
//     pub ImportKey: SslImportKeyFn,
//     pub LookupCipherSuiteInfo: SslLookupCipherSuiteInfoFn,
//     pub OpenPrivateKey: SslOpenPrivateKeyFn,
//     pub OpenProvider: SslOpenProviderFn,
//     pub SignHash: SslSignHashFn,
//     pub VerifySignature: SslVerifySignatureFn,
//     pub LookupCipherLengths: SslLookupCipherLengthsFn,
//     pub CreateClientAuthHash: SslCreateClientAuthHashFn,
//     pub GetCipherSuitePRFHashAlgorithm: SslGetCipherSuitePRFHashAlgorithmFn,
//     pub ComputeSessionHash: SslComputeSessionHashFn,
//     pub GeneratePreMasterKey: SslGeneratePreMasterKeyFn,
//     pub EnumEccCurves: SslEnumEccCurvesFn,
//     pub ExportKeyingMaterial: SslExportKeyingMaterialFn,
//     pub ExtractEarlyKey: SslExtractEarlyKeyFn,
//     pub ExtractHandshakeKey: SslExtractHandshakeKeyFn,
//     pub ExtractMasterKey: SslExtractMasterKeyFn,
//     pub ExpandTrafficKeys: SslExpandTrafficKeysFn,
//     pub ExpandWriteKey: SslExpandWriteKeyFn,
//     pub ExpandExporterMasterKey: SslExpandExporterMasterKeyFn,
//     pub EnumCipherSuitesEx: SslEnumCipherSuitesExFn,
//     pub ExpandResumptionMasterKey: SslExpandResumptionMasterKeyFn,
//     pub DuplicateTranscriptHash: SslDuplicateTranscriptHashFn,
//     pub ExpandBinderKey: SslExpandBinderKeyFn,
//     pub ExpandPreSharedKey: SslExpandPreSharedKeyFn,
// }

public const val `NCRYPT_SSL_MAX_NAME_SIZE`: UInt = 64u;
public const val `NCRYPT_SSL_RESUMPTION_PSK_FLAG`: UInt = 2u;
public const val `NCRYPT_SSL_SERVER_FLAG`: UInt = 2u;
public const val `NCRYPT_SSL_SIGN_INCLUDE_HASHOID`: UInt = 1u;
public const val `NCRYPT_SSL_SIGN_USE_PSS_PADDING`: UInt = 2u;
// UNSUPPORTED Rust 8280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_SUPPORTED_LENGTHS {
//     pub dwMinLength: u32,
//     pub dwMaxLength: u32,
//     pub dwIncrement: u32,
//     pub dwDefaultLength: u32,
// }

public const val `NCRYPT_TPM12_PROVIDER`: UInt = 65536u;
// UNSUPPORTED Rust 8289:1: non-scalar type Ptr unsupported
// pub const NCRYPT_TPM_LOADABLE_KEY_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("PcpTpmProtectedKeyBlob");

// UNSUPPORTED Rust 8290:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER {
//     pub magic: u32,
//     pub cbHeader: u32,
//     pub cbPublic: u32,
//     pub cbPrivate: u32,
//     pub cbName: u32,
// }

public const val `NCRYPT_TPM_LOADABLE_KEY_BLOB_MAGIC`: UInt = 1297371211u;
public const val `NCRYPT_TPM_PAD_PSS_IGNORE_SALT`: UInt = 32u;
// UNSUPPORTED Rust 8301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT {
//     pub Magic: u32,
//     pub Version: u32,
//     pub pcrAlg: u32,
//     pub cbSignature: u32,
//     pub cbQuote: u32,
//     pub cbPcrs: u32,
// }

public const val `NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT_CURRENT_VERSION`: UInt = 0u;
public const val `NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT_V0`: UInt = 0u;
public const val `NCRYPT_TPM_PSS_SALT_SIZE_HASHSIZE`: UInt = 2u;
public const val `NCRYPT_TPM_PSS_SALT_SIZE_MAXIMUM`: UInt = 1u;
public const val `NCRYPT_TPM_PSS_SALT_SIZE_UNKNOWN`: UInt = 0u;
public const val `NCRYPT_TREAT_NIST_AS_GENERIC_ECC_FLAG`: UInt = 8192u;
public const val `NCRYPT_UI_APPCONTAINER_ACCESS_MEDIUM_FLAG`: UInt = 8u;
public const val `NCRYPT_UI_FINGERPRINT_PROTECTION_FLAG`: UInt = 4u;
public const val `NCRYPT_UI_FORCE_HIGH_PROTECTION_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 8320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCRYPT_UI_POLICY {
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub pszCreationTitle: windows_sys::core::PCWSTR,
//     pub pszFriendlyName: windows_sys::core::PCWSTR,
//     pub pszDescription: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 8329:1: declaration Impl has no candidate rule
// impl Default for NCRYPT_UI_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8334:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_UI_POLICY_BLOB {
//     pub dwVersion: u32,
//     pub dwFlags: u32,
//     pub cbCreationTitle: u32,
//     pub cbFriendlyName: u32,
//     pub cbDescription: u32,
// }

// UNSUPPORTED Rust 8343:1: non-scalar type Ptr unsupported
// pub const NCRYPT_UI_POLICY_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("UI Policy");

public const val `NCRYPT_UI_PROTECT_KEY_FLAG`: UInt = 1u;
// UNSUPPORTED Rust 8345:1: non-scalar type Ptr unsupported
// pub const NCRYPT_UNIQUE_NAME_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Unique Name");

public const val `NCRYPT_UNPROTECT_NO_DECRYPT`: `NCRYPT_FLAGS` = 1u;
public const val `NCRYPT_UNREGISTER_NOTIFY_FLAG`: `NCRYPT_FLAGS` = 2u;
// UNSUPPORTED Rust 8348:1: non-scalar type Ptr unsupported
// pub const NCRYPT_USER_CERTSTORE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCardUserCertStore");

// UNSUPPORTED Rust 8349:1: non-scalar type Ptr unsupported
// pub const NCRYPT_USE_CONTEXT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Use Context");

// UNSUPPORTED Rust 8350:1: non-scalar type Ptr unsupported
// pub const NCRYPT_USE_COUNT_ENABLED_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Enabled Use Count");

// UNSUPPORTED Rust 8351:1: non-scalar type Ptr unsupported
// pub const NCRYPT_USE_COUNT_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Use Count");

public const val `NCRYPT_USE_PER_BOOT_KEY_FLAG`: UInt = 262144u;
// UNSUPPORTED Rust 8353:1: non-scalar type Ptr unsupported
// pub const NCRYPT_USE_PER_BOOT_KEY_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Per Boot Key");

public const val `NCRYPT_USE_VIRTUAL_ISOLATION_FLAG`: UInt = 131072u;
// UNSUPPORTED Rust 8355:1: non-scalar type Ptr unsupported
// pub const NCRYPT_USE_VIRTUAL_ISOLATION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Virtual Iso");

// UNSUPPORTED Rust 8356:1: non-scalar type Ptr unsupported
// pub const NCRYPT_VERSION_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// UNSUPPORTED Rust 8357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS {
//     pub Version: u32,
//     pub TrustletId: u64,
//     pub MinSvn: u32,
//     pub FlagsMask: u32,
//     pub FlagsExpected: u32,
//     pub _bitfield: u32,
// }

public const val `NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS_CURRENT_VERSION`: UInt = 0u;
public const val `NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS_V0`: UInt = 0u;
// UNSUPPORTED Rust 8369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NCRYPT_VSM_KEY_ATTESTATION_STATEMENT {
//     pub Magic: u32,
//     pub Version: u32,
//     pub cbSignature: u32,
//     pub cbReport: u32,
//     pub cbAttributes: u32,
// }

public const val `NCRYPT_VSM_KEY_ATTESTATION_STATEMENT_CURRENT_VERSION`: UInt = 0u;
public const val `NCRYPT_VSM_KEY_ATTESTATION_STATEMENT_V0`: UInt = 0u;
// UNSUPPORTED Rust 8380:1: non-scalar type Ptr unsupported
// pub const NCRYPT_WINDOW_HANDLE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("HWND Handle");

public const val `NCRYPT_WRITE_KEY_TO_LEGACY_STORE_FLAG`: `NCRYPT_FLAGS` = 512u;
// UNSUPPORTED Rust 8382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCryptAlgorithmName {
//     pub pszName: windows_sys::core::PWSTR,
//     pub dwClass: NCRYPT_ALGORITHM_NAME_CLASS,
//     pub dwAlgOperations: NCRYPT_OPERATION,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 8390:1: declaration Impl has no candidate rule
// impl Default for NCryptAlgorithmName {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8395:1: generic scalar type unsupported
// pub type NCryptCreateClaimFn = Option<unsafe extern "system" fn(hprov: NCRYPT_PROV_HANDLE, hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: u32, pparameterlist: *const BCryptBufferDesc, pbclaimblob: *mut u8, cbclaimblob: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8396:1: generic scalar type unsupported
// pub type NCryptCreatePersistedKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, phkey: *mut NCRYPT_KEY_HANDLE, pszalgid: windows_sys::core::PCWSTR, pszkeyname: windows_sys::core::PCWSTR, dwlegacykeyspec: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8397:1: generic scalar type unsupported
// pub type NCryptDecryptFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, ppaddinginfo: *const core::ffi::c_void, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8398:1: generic scalar type unsupported
// pub type NCryptDeleteKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8399:1: generic scalar type unsupported
// pub type NCryptDeriveKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hsharedsecret: NCRYPT_SECRET_HANDLE, pwszkdf: windows_sys::core::PCWSTR, pparameterlist: *const BCryptBufferDesc, pbderivedkey: *mut u8, cbderivedkey: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8400:1: generic scalar type unsupported
// pub type NCryptEncryptFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, ppaddinginfo: *const core::ffi::c_void, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8401:1: generic scalar type unsupported
// pub type NCryptEnumAlgorithmsFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, dwalgclass: u32, pdwalgcount: *mut u32, ppalglist: *mut *mut NCryptAlgorithmName, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8402:1: generic scalar type unsupported
// pub type NCryptEnumKeysFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, pszscope: windows_sys::core::PCWSTR, ppkeyname: *mut *mut NCryptKeyName, ppenumstate: *mut *mut core::ffi::c_void, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8403:1: generic scalar type unsupported
// pub type NCryptEnumStorageProvidersFn = Option<unsafe extern "system" fn(pdwprovidercount: *mut u32, ppproviderlist: *mut *mut NCryptProviderName, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8404:1: generic scalar type unsupported
// pub type NCryptExportKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, hexportkey: NCRYPT_KEY_HANDLE, pszblobtype: windows_sys::core::PCWSTR, pparameterlist: *const BCryptBufferDesc, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8405:1: generic scalar type unsupported
// pub type NCryptFinalizeKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8406:1: generic scalar type unsupported
// pub type NCryptFreeBufferFn = Option<unsafe extern "system" fn(pvinput: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8407:1: generic scalar type unsupported
// pub type NCryptFreeKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8408:1: generic scalar type unsupported
// pub type NCryptFreeProviderFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8409:1: generic scalar type unsupported
// pub type NCryptFreeSecretFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hsharedsecret: NCRYPT_SECRET_HANDLE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8410:1: generic scalar type unsupported
// pub type NCryptGetKeyPropertyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszproperty: windows_sys::core::PCWSTR, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8411:1: generic scalar type unsupported
// pub type NCryptGetProviderPropertyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, pszproperty: windows_sys::core::PCWSTR, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8412:1: generic scalar type unsupported
// pub type NCryptImportKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, himportkey: NCRYPT_KEY_HANDLE, pszblobtype: windows_sys::core::PCWSTR, pparameterlist: *const BCryptBufferDesc, phkey: *mut NCRYPT_KEY_HANDLE, pbdata: *const u8, cbdata: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8413:1: generic scalar type unsupported
// pub type NCryptIsAlgSupportedFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, pszalgid: windows_sys::core::PCWSTR, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8414:1: generic scalar type unsupported
// pub type NCryptKeyDerivationFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, pbderivedkey: *mut u8, cbderivedkey: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8415:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCryptKeyName {
//     pub pszName: windows_sys::core::PWSTR,
//     pub pszAlgid: windows_sys::core::PWSTR,
//     pub dwLegacyKeySpec: CERT_KEY_SPEC,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 8423:1: declaration Impl has no candidate rule
// impl Default for NCryptKeyName {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8428:1: generic scalar type unsupported
// pub type NCryptNotifyChangeKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, phevent: *mut super::super::Foundation::HANDLE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8429:1: generic scalar type unsupported
// pub type NCryptOpenKeyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, phkey: *mut NCRYPT_KEY_HANDLE, pszkeyname: windows_sys::core::PCWSTR, dwlegacykeyspec: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8430:1: generic scalar type unsupported
// pub type NCryptOpenStorageProviderFn = Option<unsafe extern "system" fn(phprovider: *mut NCRYPT_PROV_HANDLE, pszprovidername: windows_sys::core::PCWSTR, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8431:1: generic scalar type unsupported
// pub type NCryptPromptUserFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszoperation: windows_sys::core::PCWSTR, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NCryptProviderName {
//     pub pszName: windows_sys::core::PWSTR,
//     pub pszComment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 8438:1: declaration Impl has no candidate rule
// impl Default for NCryptProviderName {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8443:1: generic scalar type unsupported
// pub type NCryptSecretAgreementFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hprivkey: NCRYPT_KEY_HANDLE, hpubkey: NCRYPT_KEY_HANDLE, phagreedsecret: *mut NCRYPT_SECRET_HANDLE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8444:1: generic scalar type unsupported
// pub type NCryptSetKeyPropertyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszproperty: windows_sys::core::PCWSTR, pbinput: *const u8, cbinput: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8445:1: generic scalar type unsupported
// pub type NCryptSetProviderPropertyFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, pszproperty: windows_sys::core::PCWSTR, pbinput: *const u8, cbinput: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8446:1: generic scalar type unsupported
// pub type NCryptSignHashFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: *const core::ffi::c_void, pbhashvalue: *const u8, cbhashvalue: u32, pbsignature: *mut u8, cbsignature: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8447:1: generic scalar type unsupported
// pub type NCryptVerifyClaimFn = Option<unsafe extern "system" fn(hprov: NCRYPT_PROV_HANDLE, hsubjectkey: NCRYPT_KEY_HANDLE, hauthoritykey: NCRYPT_KEY_HANDLE, dwclaimtype: u32, pparameterlist: *const BCryptBufferDesc, pbclaimblob: *const u8, cbclaimblob: u32, poutput: *mut BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8448:1: generic scalar type unsupported
// pub type NCryptVerifySignatureFn = Option<unsafe extern "system" fn(hprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, ppaddinginfo: *const core::ffi::c_void, pbhashvalue: *const u8, cbhashvalue: u32, pbsignature: *const u8, cbsignature: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

public const val `NETSCAPE_SIGN_CA_CERT_TYPE`: UInt = 1u;
public const val `NETSCAPE_SIGN_CERT_TYPE`: UInt = 16u;
public const val `NETSCAPE_SMIME_CA_CERT_TYPE`: UInt = 2u;
public const val `NETSCAPE_SMIME_CERT_TYPE`: UInt = 32u;
public const val `NETSCAPE_SSL_CA_CERT_TYPE`: UInt = 4u;
public const val `NETSCAPE_SSL_CLIENT_AUTH_CERT_TYPE`: UInt = 128u;
public const val `NETSCAPE_SSL_SERVER_AUTH_CERT_TYPE`: UInt = 64u;
public const val `NonRepudiationPin`: `SECRET_PURPOSE` = 3;
public const val `OCSP_BASIC_BY_KEY_RESPONDER_ID`: UInt = 2u;
public const val `OCSP_BASIC_BY_NAME_RESPONDER_ID`: UInt = 1u;
public const val `OCSP_BASIC_GOOD_CERT_STATUS`: UInt = 0u;
// UNSUPPORTED Rust 8460:1: non-scalar type Ptr unsupported
// pub const OCSP_BASIC_RESPONSE: windows_sys::core::PCSTR = 69i32 as _;

// UNSUPPORTED Rust 8461:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCSP_BASIC_RESPONSE_ENTRY {
//     pub CertId: OCSP_CERT_ID,
//     pub dwCertStatus: u32,
//     pub Anonymous: OCSP_BASIC_RESPONSE_ENTRY_0,
//     pub ThisUpdate: super::super::Foundation::FILETIME,
//     pub NextUpdate: super::super::Foundation::FILETIME,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 8472:1: declaration Impl has no candidate rule
// impl Default for OCSP_BASIC_RESPONSE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8477:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OCSP_BASIC_RESPONSE_ENTRY_0 {
//     pub pRevokedInfo: *mut OCSP_BASIC_REVOKED_INFO,
// }

// UNSUPPORTED Rust 8482:1: declaration Impl has no candidate rule
// impl Default for OCSP_BASIC_RESPONSE_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8487:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCSP_BASIC_RESPONSE_INFO {
//     pub dwVersion: u32,
//     pub dwResponderIdChoice: u32,
//     pub Anonymous: OCSP_BASIC_RESPONSE_INFO_0,
//     pub ProducedAt: super::super::Foundation::FILETIME,
//     pub cResponseEntry: u32,
//     pub rgResponseEntry: *mut OCSP_BASIC_RESPONSE_ENTRY,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 8499:1: declaration Impl has no candidate rule
// impl Default for OCSP_BASIC_RESPONSE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8504:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OCSP_BASIC_RESPONSE_INFO_0 {
//     pub ByNameResponderId: CRYPT_INTEGER_BLOB,
//     pub ByKeyResponderId: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 8510:1: declaration Impl has no candidate rule
// impl Default for OCSP_BASIC_RESPONSE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OCSP_BASIC_RESPONSE_V1`: UInt = 0u;
public const val `OCSP_BASIC_REVOKED_CERT_STATUS`: UInt = 1u;
// UNSUPPORTED Rust 8517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OCSP_BASIC_REVOKED_INFO {
//     pub RevocationDate: super::super::Foundation::FILETIME,
//     pub dwCrlReasonCode: CERT_REVOCATION_STATUS_REASON,
// }

// UNSUPPORTED Rust 8523:1: non-scalar type Ptr unsupported
// pub const OCSP_BASIC_SIGNED_RESPONSE: windows_sys::core::PCSTR = 68i32 as _;

// UNSUPPORTED Rust 8524:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OCSP_BASIC_SIGNED_RESPONSE_INFO {
//     pub ToBeSigned: CRYPT_INTEGER_BLOB,
//     pub SignatureInfo: OCSP_SIGNATURE_INFO,
// }

public const val `OCSP_BASIC_UNKNOWN_CERT_STATUS`: UInt = 2u;
// UNSUPPORTED Rust 8531:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OCSP_CERT_ID {
//     pub HashAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub IssuerNameHash: CRYPT_INTEGER_BLOB,
//     pub IssuerKeyHash: CRYPT_INTEGER_BLOB,
//     pub SerialNumber: CRYPT_INTEGER_BLOB,
// }

public const val `OCSP_INTERNAL_ERROR_RESPONSE`: UInt = 2u;
public const val `OCSP_MALFORMED_REQUEST_RESPONSE`: UInt = 1u;
// UNSUPPORTED Rust 8541:1: non-scalar type Ptr unsupported
// pub const OCSP_REQUEST: windows_sys::core::PCSTR = 66i32 as _;

// UNSUPPORTED Rust 8542:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCSP_REQUEST_ENTRY {
//     pub CertId: OCSP_CERT_ID,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 8549:1: declaration Impl has no candidate rule
// impl Default for OCSP_REQUEST_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8554:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCSP_REQUEST_INFO {
//     pub dwVersion: u32,
//     pub pRequestorName: *mut CERT_ALT_NAME_ENTRY,
//     pub cRequestEntry: u32,
//     pub rgRequestEntry: *mut OCSP_REQUEST_ENTRY,
//     pub cExtension: u32,
//     pub rgExtension: *mut CERT_EXTENSION,
// }

// UNSUPPORTED Rust 8564:1: declaration Impl has no candidate rule
// impl Default for OCSP_REQUEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OCSP_REQUEST_V1`: UInt = 0u;
// UNSUPPORTED Rust 8570:1: non-scalar type Ptr unsupported
// pub const OCSP_RESPONSE: windows_sys::core::PCSTR = 67i32 as _;

// UNSUPPORTED Rust 8571:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCSP_RESPONSE_INFO {
//     pub dwStatus: u32,
//     pub pszObjId: windows_sys::core::PSTR,
//     pub Value: CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 8578:1: declaration Impl has no candidate rule
// impl Default for OCSP_RESPONSE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8583:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCSP_SIGNATURE_INFO {
//     pub SignatureAlgorithm: CRYPT_ALGORITHM_IDENTIFIER,
//     pub Signature: CRYPT_BIT_BLOB,
//     pub cCertEncoded: u32,
//     pub rgCertEncoded: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 8591:1: declaration Impl has no candidate rule
// impl Default for OCSP_SIGNATURE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8596:1: non-scalar type Ptr unsupported
// pub const OCSP_SIGNED_REQUEST: windows_sys::core::PCSTR = 65i32 as _;

// UNSUPPORTED Rust 8597:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OCSP_SIGNED_REQUEST_INFO {
//     pub ToBeSigned: CRYPT_INTEGER_BLOB,
//     pub pOptionalSignatureInfo: *mut OCSP_SIGNATURE_INFO,
// }

// UNSUPPORTED Rust 8603:1: declaration Impl has no candidate rule
// impl Default for OCSP_SIGNED_REQUEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OCSP_SIG_REQUIRED_RESPONSE`: UInt = 5u;
public const val `OCSP_SUCCESSFUL_RESPONSE`: UInt = 0u;
public const val `OCSP_TRY_LATER_RESPONSE`: UInt = 3u;
public const val `OCSP_UNAUTHORIZED_RESPONSE`: UInt = 6u;
// UNSUPPORTED Rust 8612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OFFLOAD_PRIVATE_KEY {
//     pub dwVersion: u32,
//     pub cbPrime1: u32,
//     pub cbPrime2: u32,
//     pub pbPrime1: *mut u8,
//     pub pbPrime2: *mut u8,
// }

// UNSUPPORTED Rust 8621:1: declaration Impl has no candidate rule
// impl Default for OFFLOAD_PRIVATE_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OPAQUEKEYBLOB`: UInt = 9u;
// UNSUPPORTED Rust 8627:1: generic scalar type unsupported
// pub type PCRYPT_DECRYPT_PRIVATE_KEY_FUNC = Option<unsafe extern "system" fn(algorithm: CRYPT_ALGORITHM_IDENTIFIER, encryptedprivatekey: CRYPT_INTEGER_BLOB, pbcleartextkey: *mut u8, pcbcleartextkey: *mut u32, pvoiddecryptfunc: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8628:1: generic scalar type unsupported
// pub type PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC = Option<unsafe extern "system" fn(palgorithm: *mut CRYPT_ALGORITHM_IDENTIFIER, pcleartextprivatekey: *const CRYPT_INTEGER_BLOB, pbencryptedkey: *mut u8, pcbencryptedkey: *mut u32, pvoidencryptfunc: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8629:1: generic scalar type unsupported
// pub type PCRYPT_RESOLVE_HCRYPTPROV_FUNC = Option<unsafe extern "system" fn(pprivatekeyinfo: *mut CRYPT_PRIVATE_KEY_INFO, phcryptprov: *mut usize, pvoidresolvefunc: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8630:1: generic scalar type unsupported
// pub type PFNCryptStreamOutputCallback = Option<unsafe extern "system" fn(pvcallbackctxt: *const core::ffi::c_void, pbdata: *const u8, cbdata: usize, ffinal: windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8631:1: generic scalar type unsupported
// pub type PFNCryptStreamOutputCallbackEx = Option<unsafe extern "system" fn(pvcallbackctxt: *const core::ffi::c_void, pbdata: *const u8, cbdata: usize, hdescriptor: super::NCRYPT_DESCRIPTOR_HANDLE, ffinal: windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8632:1: generic scalar type unsupported
// pub type PFN_AUTHENTICODE_DIGEST_SIGN = Option<unsafe extern "system" fn(psigningcert: *const CERT_CONTEXT, pmetadatablob: *const CRYPT_INTEGER_BLOB, digestalgid: ALG_ID, pbtobesigneddigest: *const u8, cbtobesigneddigest: u32, psigneddigest: *mut CRYPT_INTEGER_BLOB) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8633:1: generic scalar type unsupported
// pub type PFN_AUTHENTICODE_DIGEST_SIGN_EX = Option<unsafe extern "system" fn(pmetadatablob: *const CRYPT_INTEGER_BLOB, digestalgid: ALG_ID, pbtobesigneddigest: *const u8, cbtobesigneddigest: u32, psigneddigest: *mut CRYPT_INTEGER_BLOB, ppsignercert: *mut *mut CERT_CONTEXT, hcertchainstore: HCERTSTORE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8634:1: generic scalar type unsupported
// pub type PFN_AUTHENTICODE_DIGEST_SIGN_EX_WITHFILEHANDLE = Option<unsafe extern "system" fn(pmetadatablob: *const CRYPT_INTEGER_BLOB, digestalgid: ALG_ID, pbtobesigneddigest: *const u8, cbtobesigneddigest: u32, hfile: super::super::Foundation::HANDLE, psigneddigest: *mut CRYPT_INTEGER_BLOB, ppsignercert: *mut *mut CERT_CONTEXT, hcertchainstore: HCERTSTORE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8635:1: generic scalar type unsupported
// pub type PFN_AUTHENTICODE_DIGEST_SIGN_WITHFILEHANDLE = Option<unsafe extern "system" fn(psigningcert: *const CERT_CONTEXT, pmetadatablob: *const CRYPT_INTEGER_BLOB, digestalgid: ALG_ID, pbtobesigneddigest: *const u8, cbtobesigneddigest: u32, hfile: super::super::Foundation::HANDLE, psigneddigest: *mut CRYPT_INTEGER_BLOB) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8636:1: generic scalar type unsupported
// pub type PFN_CANCEL_ASYNC_RETRIEVAL_FUNC = Option<unsafe extern "system" fn(hasyncretrieve: HCRYPTASYNC) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8637:1: generic scalar type unsupported
// pub type PFN_CARD_ACQUIRE_CONTEXT = Option<unsafe extern "system" fn(pcarddata: *mut CARD_DATA, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8638:1: generic scalar type unsupported
// pub type PFN_CARD_AUTHENTICATE_CHALLENGE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pbresponsedata: *const u8, cbresponsedata: u32, pcattemptsremaining: *mut u32) -> u32>;

// UNSUPPORTED Rust 8639:1: generic scalar type unsupported
// pub type PFN_CARD_AUTHENTICATE_EX = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pinid: u32, dwflags: u32, pbpindata: *const u8, cbpindata: u32, ppbsessionpin: *mut *mut u8, pcbsessionpin: *mut u32, pcattemptsremaining: *mut u32) -> u32>;

// UNSUPPORTED Rust 8640:1: generic scalar type unsupported
// pub type PFN_CARD_AUTHENTICATE_PIN = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pwszuserid: windows_sys::core::PCWSTR, pbpin: *const u8, cbpin: u32, pcattemptsremaining: *mut u32) -> u32>;

// UNSUPPORTED Rust 8641:1: generic scalar type unsupported
// pub type PFN_CARD_CHANGE_AUTHENTICATOR = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pwszuserid: windows_sys::core::PCWSTR, pbcurrentauthenticator: *const u8, cbcurrentauthenticator: u32, pbnewauthenticator: *const u8, cbnewauthenticator: u32, cretrycount: u32, dwflags: u32, pcattemptsremaining: *mut u32) -> u32>;

// UNSUPPORTED Rust 8642:1: generic scalar type unsupported
// pub type PFN_CARD_CHANGE_AUTHENTICATOR_EX = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, dwflags: u32, dwauthenticatingpinid: u32, pbauthenticatingpindata: *const u8, cbauthenticatingpindata: u32, dwtargetpinid: u32, pbtargetdata: *const u8, cbtargetdata: u32, cretrycount: u32, pcattemptsremaining: *mut u32) -> u32>;

// UNSUPPORTED Rust 8643:1: generic scalar type unsupported
// pub type PFN_CARD_CONSTRUCT_DH_AGREEMENT = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pagreementinfo: *mut CARD_DH_AGREEMENT_INFO) -> u32>;

// UNSUPPORTED Rust 8644:1: generic scalar type unsupported
// pub type PFN_CARD_CREATE_CONTAINER = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bcontainerindex: u8, dwflags: u32, dwkeyspec: u32, dwkeysize: u32, pbkeydata: *const u8) -> u32>;

// UNSUPPORTED Rust 8645:1: generic scalar type unsupported
// pub type PFN_CARD_CREATE_CONTAINER_EX = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bcontainerindex: u8, dwflags: u32, dwkeyspec: u32, dwkeysize: u32, pbkeydata: *const u8, pinid: u32) -> u32>;

// UNSUPPORTED Rust 8646:1: generic scalar type unsupported
// pub type PFN_CARD_CREATE_DIRECTORY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR, accesscondition: CARD_DIRECTORY_ACCESS_CONDITION) -> u32>;

// UNSUPPORTED Rust 8647:1: generic scalar type unsupported
// pub type PFN_CARD_CREATE_FILE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR, pszfilename: windows_sys::core::PCSTR, cbinitialcreationsize: u32, accesscondition: CARD_FILE_ACCESS_CONDITION) -> u32>;

// UNSUPPORTED Rust 8648:1: generic scalar type unsupported
// pub type PFN_CARD_DEAUTHENTICATE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pwszuserid: windows_sys::core::PCWSTR, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8649:1: generic scalar type unsupported
// pub type PFN_CARD_DEAUTHENTICATE_EX = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pinid: u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8650:1: generic scalar type unsupported
// pub type PFN_CARD_DELETE_CONTAINER = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bcontainerindex: u8, dwreserved: u32) -> u32>;

// UNSUPPORTED Rust 8651:1: generic scalar type unsupported
// pub type PFN_CARD_DELETE_CONTEXT = Option<unsafe extern "system" fn(pcarddata: *mut CARD_DATA) -> u32>;

// UNSUPPORTED Rust 8652:1: generic scalar type unsupported
// pub type PFN_CARD_DELETE_DIRECTORY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR) -> u32>;

// UNSUPPORTED Rust 8653:1: generic scalar type unsupported
// pub type PFN_CARD_DELETE_FILE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR, pszfilename: windows_sys::core::PCSTR, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8654:1: generic scalar type unsupported
// pub type PFN_CARD_DERIVE_KEY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pagreementinfo: *mut CARD_DERIVE_KEY) -> u32>;

// UNSUPPORTED Rust 8655:1: generic scalar type unsupported
// pub type PFN_CARD_DESTROY_DH_AGREEMENT = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bsecretagreementindex: u8, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8656:1: generic scalar type unsupported
// pub type PFN_CARD_DESTROY_KEY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, hkey: usize) -> u32>;

// UNSUPPORTED Rust 8657:1: generic scalar type unsupported
// pub type PFN_CARD_ENUM_FILES = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR, pmszfilenames: *mut windows_sys::core::PSTR, pdwcbfilename: *mut u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8658:1: generic scalar type unsupported
// pub type PFN_CARD_GET_ALGORITHM_PROPERTY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pwszalgid: windows_sys::core::PCWSTR, pwszproperty: windows_sys::core::PCWSTR, pbdata: *mut u8, cbdata: u32, pdwdatalen: *mut u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8659:1: generic scalar type unsupported
// pub type PFN_CARD_GET_CHALLENGE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, ppbchallengedata: *mut *mut u8, pcbchallengedata: *mut u32) -> u32>;

// UNSUPPORTED Rust 8660:1: generic scalar type unsupported
// pub type PFN_CARD_GET_CHALLENGE_EX = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pinid: u32, ppbchallengedata: *mut *mut u8, pcbchallengedata: *mut u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8661:1: generic scalar type unsupported
// pub type PFN_CARD_GET_CONTAINER_INFO = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bcontainerindex: u8, dwflags: u32, pcontainerinfo: *mut CONTAINER_INFO) -> u32>;

// UNSUPPORTED Rust 8662:1: generic scalar type unsupported
// pub type PFN_CARD_GET_CONTAINER_PROPERTY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bcontainerindex: u8, wszproperty: windows_sys::core::PCWSTR, pbdata: *mut u8, cbdata: u32, pdwdatalen: *mut u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8663:1: generic scalar type unsupported
// pub type PFN_CARD_GET_FILE_INFO = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR, pszfilename: windows_sys::core::PCSTR, pcardfileinfo: *mut CARD_FILE_INFO) -> u32>;

// UNSUPPORTED Rust 8664:1: generic scalar type unsupported
// pub type PFN_CARD_GET_KEY_PROPERTY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, hkey: usize, pwszproperty: windows_sys::core::PCWSTR, pbdata: *mut u8, cbdata: u32, pdwdatalen: *mut u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8665:1: generic scalar type unsupported
// pub type PFN_CARD_GET_PROPERTY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, wszproperty: windows_sys::core::PCWSTR, pbdata: *mut u8, cbdata: u32, pdwdatalen: *mut u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8666:1: generic scalar type unsupported
// pub type PFN_CARD_GET_SHARED_KEY_HANDLE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pbinput: *const u8, cbinput: u32, ppboutput: *mut *mut u8, pcboutput: *mut u32, phkey: *mut usize) -> u32>;

// UNSUPPORTED Rust 8667:1: generic scalar type unsupported
// pub type PFN_CARD_IMPORT_SESSION_KEY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bcontainerindex: u8, ppaddinginfo: *const core::ffi::c_void, pwszblobtype: windows_sys::core::PCWSTR, pwszalgid: windows_sys::core::PCWSTR, phkey: *mut usize, pbinput: *const u8, cbinput: u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8668:1: generic scalar type unsupported
// pub type PFN_CARD_PROCESS_ENCRYPTED_DATA = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, hkey: usize, pwszsecurefunction: windows_sys::core::PCWSTR, pencrypteddata: *const CARD_ENCRYPTED_DATA, cencrypteddata: u32, pboutput: *mut u8, cboutput: u32, pdwoutputlen: *mut u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8669:1: generic scalar type unsupported
// pub type PFN_CARD_QUERY_CAPABILITIES = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pcardcapabilities: *mut CARD_CAPABILITIES) -> u32>;

// UNSUPPORTED Rust 8670:1: generic scalar type unsupported
// pub type PFN_CARD_QUERY_FREE_SPACE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, dwflags: u32, pcardfreespaceinfo: *mut CARD_FREE_SPACE_INFO) -> u32>;

// UNSUPPORTED Rust 8671:1: generic scalar type unsupported
// pub type PFN_CARD_QUERY_KEY_SIZES = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, dwkeyspec: u32, dwflags: u32, pkeysizes: *mut CARD_KEY_SIZES) -> u32>;

// UNSUPPORTED Rust 8672:1: generic scalar type unsupported
// pub type PFN_CARD_READ_FILE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR, pszfilename: windows_sys::core::PCSTR, dwflags: u32, ppbdata: *mut *mut u8, pcbdata: *mut u32) -> u32>;

// UNSUPPORTED Rust 8673:1: generic scalar type unsupported
// pub type PFN_CARD_RSA_DECRYPT = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pinfo: *mut CARD_RSA_DECRYPT_INFO) -> u32>;

// UNSUPPORTED Rust 8674:1: generic scalar type unsupported
// pub type PFN_CARD_SET_CONTAINER_PROPERTY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, bcontainerindex: u8, wszproperty: windows_sys::core::PCWSTR, pbdata: *const u8, cbdatalen: u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8675:1: generic scalar type unsupported
// pub type PFN_CARD_SET_KEY_PROPERTY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, hkey: usize, pwszproperty: windows_sys::core::PCWSTR, pbinput: *const u8, cbinput: u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8676:1: generic scalar type unsupported
// pub type PFN_CARD_SET_PROPERTY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, wszproperty: windows_sys::core::PCWSTR, pbdata: *const u8, cbdatalen: u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8677:1: generic scalar type unsupported
// pub type PFN_CARD_SIGN_DATA = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pinfo: *mut CARD_SIGNING_INFO) -> u32>;

// UNSUPPORTED Rust 8678:1: generic scalar type unsupported
// pub type PFN_CARD_UNBLOCK_PIN = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pwszuserid: windows_sys::core::PCWSTR, pbauthenticationdata: *const u8, cbauthenticationdata: u32, pbnewpindata: *const u8, cbnewpindata: u32, cretrycount: u32, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8679:1: generic scalar type unsupported
// pub type PFN_CARD_WRITE_FILE = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pszdirectoryname: windows_sys::core::PCSTR, pszfilename: windows_sys::core::PCSTR, dwflags: u32, pbdata: *const u8, cbdata: u32) -> u32>;

// UNSUPPORTED Rust 8680:1: generic scalar type unsupported
// pub type PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK = Option<unsafe extern "system" fn(pcert: *const CERT_CONTEXT, pvfindarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8681:1: generic scalar type unsupported
// pub type PFN_CERT_CREATE_CONTEXT_SORT_FUNC = Option<unsafe extern "system" fn(cbtotalencoded: u32, cbremainencoded: u32, centry: u32, pvsort: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8682:1: generic scalar type unsupported
// pub type PFN_CERT_DLL_OPEN_STORE_PROV_FUNC = Option<unsafe extern "system" fn(lpszstoreprovider: windows_sys::core::PCSTR, dwencodingtype: CERT_QUERY_ENCODING_TYPE, hcryptprov: HCRYPTPROV_LEGACY, dwflags: CERT_OPEN_STORE_FLAGS, pvpara: *const core::ffi::c_void, hcertstore: HCERTSTORE, pstoreprovinfo: *mut CERT_STORE_PROV_INFO) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8683:1: generic scalar type unsupported
// pub type PFN_CERT_ENUM_PHYSICAL_STORE = Option<unsafe extern "system" fn(pvsystemstore: *const core::ffi::c_void, dwflags: u32, pwszstorename: windows_sys::core::PCWSTR, pstoreinfo: *const CERT_PHYSICAL_STORE_INFO, pvreserved: *const core::ffi::c_void, pvarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8684:1: generic scalar type unsupported
// pub type PFN_CERT_ENUM_SYSTEM_STORE = Option<unsafe extern "system" fn(pvsystemstore: *const core::ffi::c_void, dwflags: CERT_SYSTEM_STORE_FLAGS, pstoreinfo: *const CERT_SYSTEM_STORE_INFO, pvreserved: *const core::ffi::c_void, pvarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8685:1: generic scalar type unsupported
// pub type PFN_CERT_ENUM_SYSTEM_STORE_LOCATION = Option<unsafe extern "system" fn(pwszstorelocation: windows_sys::core::PCWSTR, dwflags: u32, pvreserved: *const core::ffi::c_void, pvarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8686:1: generic scalar type unsupported
// pub type PFN_CERT_IS_WEAK_HASH = Option<unsafe extern "system" fn(dwhashusetype: u32, pwszcnghashalgid: windows_sys::core::PCWSTR, dwchainflags: u32, psignerchaincontext: *const CERT_CHAIN_CONTEXT, ptimestamp: *const super::super::Foundation::FILETIME, pwszfilename: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8687:1: generic scalar type unsupported
// pub type PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK = Option<unsafe extern "system" fn(pchaincontext: *const CERT_CHAIN_CONTEXT, pserverocspresponsecontext: *const CERT_SERVER_OCSP_RESPONSE_CONTEXT, pnewcrlcontext: *const CRL_CONTEXT, pprevcrlcontext: *const CRL_CONTEXT, pvarg: *mut core::ffi::c_void, dwwriteocspfileerror: u32)>;

// UNSUPPORTED Rust 8688:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_CLOSE = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, dwflags: u32)>;

// UNSUPPORTED Rust 8689:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_CONTROL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, dwflags: u32, dwctrltype: u32, pvctrlpara: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8690:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_DELETE_CERT = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcertcontext: *const CERT_CONTEXT, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8691:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_DELETE_CRL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcrlcontext: *const CRL_CONTEXT, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8692:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_DELETE_CTL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pctlcontext: *const CTL_CONTEXT, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8693:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_FIND_CERT = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pfindinfo: *const CERT_STORE_PROV_FIND_INFO, pprevcertcontext: *const CERT_CONTEXT, dwflags: u32, ppvstoreprovfindinfo: *mut *mut core::ffi::c_void, ppprovcertcontext: *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8694:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_FIND_CRL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pfindinfo: *const CERT_STORE_PROV_FIND_INFO, pprevcrlcontext: *const CRL_CONTEXT, dwflags: u32, ppvstoreprovfindinfo: *mut *mut core::ffi::c_void, ppprovcrlcontext: *mut *mut CRL_CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8695:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_FIND_CTL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pfindinfo: *const CERT_STORE_PROV_FIND_INFO, pprevctlcontext: *const CTL_CONTEXT, dwflags: u32, ppvstoreprovfindinfo: *mut *mut core::ffi::c_void, ppprovctlcontext: *mut *mut CTL_CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8696:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_FREE_FIND_CERT = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcertcontext: *const CERT_CONTEXT, pvstoreprovfindinfo: *const core::ffi::c_void, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8697:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_FREE_FIND_CRL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcrlcontext: *const CRL_CONTEXT, pvstoreprovfindinfo: *const core::ffi::c_void, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8698:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_FREE_FIND_CTL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pctlcontext: *const CTL_CONTEXT, pvstoreprovfindinfo: *const core::ffi::c_void, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8699:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_GET_CERT_PROPERTY = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcertcontext: *const CERT_CONTEXT, dwpropid: u32, dwflags: u32, pvdata: *mut core::ffi::c_void, pcbdata: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8700:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_GET_CRL_PROPERTY = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcrlcontext: *const CRL_CONTEXT, dwpropid: u32, dwflags: u32, pvdata: *mut core::ffi::c_void, pcbdata: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8701:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_GET_CTL_PROPERTY = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pctlcontext: *const CTL_CONTEXT, dwpropid: u32, dwflags: u32, pvdata: *mut core::ffi::c_void, pcbdata: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8702:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_READ_CERT = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pstorecertcontext: *const CERT_CONTEXT, dwflags: u32, ppprovcertcontext: *mut *mut CERT_CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8703:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_READ_CRL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pstorecrlcontext: *const CRL_CONTEXT, dwflags: u32, ppprovcrlcontext: *mut *mut CRL_CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8704:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_READ_CTL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pstorectlcontext: *const CTL_CONTEXT, dwflags: u32, ppprovctlcontext: *mut *mut CTL_CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8705:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_SET_CERT_PROPERTY = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcertcontext: *const CERT_CONTEXT, dwpropid: u32, dwflags: u32, pvdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8706:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_SET_CRL_PROPERTY = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcrlcontext: *const CRL_CONTEXT, dwpropid: u32, dwflags: u32, pvdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8707:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_SET_CTL_PROPERTY = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pctlcontext: *const CTL_CONTEXT, dwpropid: u32, dwflags: u32, pvdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8708:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_WRITE_CERT = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcertcontext: *const CERT_CONTEXT, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8709:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_WRITE_CRL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pcrlcontext: *const CRL_CONTEXT, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8710:1: generic scalar type unsupported
// pub type PFN_CERT_STORE_PROV_WRITE_CTL = Option<unsafe extern "system" fn(hstoreprov: HCERTSTOREPROV, pctlcontext: *const CTL_CONTEXT, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8711:1: generic scalar type unsupported
// pub type PFN_CMSG_ALLOC = Option<unsafe extern "system" fn(cb: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 8712:1: generic scalar type unsupported
// pub type PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY = Option<unsafe extern "system" fn(pcngcontentdecryptinfo: *mut CMSG_CNG_CONTENT_DECRYPT_INFO, dwflags: u32, pvreserved: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8713:1: generic scalar type unsupported
// pub type PFN_CMSG_CNG_IMPORT_KEY_AGREE = Option<unsafe extern "system" fn(pcngcontentdecryptinfo: *mut CMSG_CNG_CONTENT_DECRYPT_INFO, pkeyagreedecryptpara: *const CMSG_CTRL_KEY_AGREE_DECRYPT_PARA, dwflags: u32, pvreserved: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8714:1: generic scalar type unsupported
// pub type PFN_CMSG_CNG_IMPORT_KEY_TRANS = Option<unsafe extern "system" fn(pcngcontentdecryptinfo: *mut CMSG_CNG_CONTENT_DECRYPT_INFO, pkeytransdecryptpara: *const CMSG_CTRL_KEY_TRANS_DECRYPT_PARA, dwflags: u32, pvreserved: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8715:1: generic scalar type unsupported
// pub type PFN_CMSG_EXPORT_ENCRYPT_KEY = Option<unsafe extern "system" fn(hcryptprov: usize, hencryptkey: usize, ppublickeyinfo: *const CERT_PUBLIC_KEY_INFO, pbdata: *mut u8, pcbdata: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8716:1: generic scalar type unsupported
// pub type PFN_CMSG_EXPORT_KEY_AGREE = Option<unsafe extern "system" fn(pcontentencryptinfo: *const CMSG_CONTENT_ENCRYPT_INFO, pkeyagreeencodeinfo: *const CMSG_KEY_AGREE_RECIPIENT_ENCODE_INFO, pkeyagreeencryptinfo: *mut CMSG_KEY_AGREE_ENCRYPT_INFO, dwflags: u32, pvreserved: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8717:1: generic scalar type unsupported
// pub type PFN_CMSG_EXPORT_KEY_TRANS = Option<unsafe extern "system" fn(pcontentencryptinfo: *const CMSG_CONTENT_ENCRYPT_INFO, pkeytransencodeinfo: *const CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO, pkeytransencryptinfo: *mut CMSG_KEY_TRANS_ENCRYPT_INFO, dwflags: u32, pvreserved: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8718:1: generic scalar type unsupported
// pub type PFN_CMSG_EXPORT_MAIL_LIST = Option<unsafe extern "system" fn(pcontentencryptinfo: *const CMSG_CONTENT_ENCRYPT_INFO, pmaillistencodeinfo: *const CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO, pmaillistencryptinfo: *mut CMSG_MAIL_LIST_ENCRYPT_INFO, dwflags: u32, pvreserved: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8719:1: generic scalar type unsupported
// pub type PFN_CMSG_FREE = Option<unsafe extern "system" fn(pv: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 8720:1: generic scalar type unsupported
// pub type PFN_CMSG_GEN_CONTENT_ENCRYPT_KEY = Option<unsafe extern "system" fn(pcontentencryptinfo: *mut CMSG_CONTENT_ENCRYPT_INFO, dwflags: u32, pvreserved: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8721:1: generic scalar type unsupported
// pub type PFN_CMSG_GEN_ENCRYPT_KEY = Option<unsafe extern "system" fn(phcryptprov: *mut usize, paiencrypt: *const CRYPT_ALGORITHM_IDENTIFIER, pvencryptauxinfo: *const core::ffi::c_void, ppublickeyinfo: *const CERT_PUBLIC_KEY_INFO, pfnalloc: PFN_CMSG_ALLOC, phencryptkey: *mut usize, ppbencryptparameters: *mut *mut u8, pcbencryptparameters: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8722:1: generic scalar type unsupported
// pub type PFN_CMSG_IMPORT_ENCRYPT_KEY = Option<unsafe extern "system" fn(hcryptprov: usize, dwkeyspec: u32, paiencrypt: *const CRYPT_ALGORITHM_IDENTIFIER, paipubkey: *const CRYPT_ALGORITHM_IDENTIFIER, pbencodedkey: *const u8, cbencodedkey: u32, phencryptkey: *mut usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8723:1: generic scalar type unsupported
// pub type PFN_CMSG_IMPORT_KEY_AGREE = Option<unsafe extern "system" fn(pcontentencryptionalgorithm: *const CRYPT_ALGORITHM_IDENTIFIER, pkeyagreedecryptpara: *const CMSG_CTRL_KEY_AGREE_DECRYPT_PARA, dwflags: u32, pvreserved: *const core::ffi::c_void, phcontentencryptkey: *mut usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8724:1: generic scalar type unsupported
// pub type PFN_CMSG_IMPORT_KEY_TRANS = Option<unsafe extern "system" fn(pcontentencryptionalgorithm: *const CRYPT_ALGORITHM_IDENTIFIER, pkeytransdecryptpara: *const CMSG_CTRL_KEY_TRANS_DECRYPT_PARA, dwflags: u32, pvreserved: *const core::ffi::c_void, phcontentencryptkey: *mut usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8725:1: generic scalar type unsupported
// pub type PFN_CMSG_IMPORT_MAIL_LIST = Option<unsafe extern "system" fn(pcontentencryptionalgorithm: *const CRYPT_ALGORITHM_IDENTIFIER, pmaillistdecryptpara: *const CMSG_CTRL_MAIL_LIST_DECRYPT_PARA, dwflags: u32, pvreserved: *const core::ffi::c_void, phcontentencryptkey: *mut usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8726:1: generic scalar type unsupported
// pub type PFN_CMSG_STREAM_OUTPUT = Option<unsafe extern "system" fn(pvarg: *const core::ffi::c_void, pbdata: *const u8, cbdata: u32, ffinal: windows_sys::core::BOOL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8727:1: generic scalar type unsupported
// pub type PFN_CRYPT_ALLOC = Option<unsafe extern "system" fn(cbsize: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 8728:1: generic scalar type unsupported
// pub type PFN_CRYPT_ASYNC_PARAM_FREE_FUNC = Option<unsafe extern "system" fn(pszparamoid: windows_sys::core::PCSTR, pvparam: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 8729:1: generic scalar type unsupported
// pub type PFN_CRYPT_ASYNC_RETRIEVAL_COMPLETION_FUNC = Option<unsafe extern "system" fn(pvcompletion: *mut core::ffi::c_void, dwcompletioncode: u32, pszurl: windows_sys::core::PCSTR, pszobjectoid: windows_sys::core::PCSTR, pvobject: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 8730:1: generic scalar type unsupported
// pub type PFN_CRYPT_CANCEL_RETRIEVAL = Option<unsafe extern "system" fn(dwflags: u32, pvarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8731:1: generic scalar type unsupported
// pub type PFN_CRYPT_ENUM_KEYID_PROP = Option<unsafe extern "system" fn(pkeyidentifier: *const CRYPT_INTEGER_BLOB, dwflags: u32, pvreserved: *const core::ffi::c_void, pvarg: *mut core::ffi::c_void, cprop: u32, rgdwpropid: *const u32, rgpvdata: *const *const core::ffi::c_void, rgcbdata: *const u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8732:1: generic scalar type unsupported
// pub type PFN_CRYPT_ENUM_OID_FUNC = Option<unsafe extern "system" fn(dwencodingtype: u32, pszfuncname: windows_sys::core::PCSTR, pszoid: windows_sys::core::PCSTR, cvalue: u32, rgdwvaluetype: *const u32, rgpwszvaluename: *const windows_sys::core::PCWSTR, rgpbvaluedata: *const *const u8, rgcbvaluedata: *const u32, pvarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8733:1: generic scalar type unsupported
// pub type PFN_CRYPT_ENUM_OID_INFO = Option<unsafe extern "system" fn(pinfo: *const CRYPT_OID_INFO, pvarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8734:1: generic scalar type unsupported
// pub type PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_EX2_FUNC = Option<unsafe extern "system" fn(hncryptkey: NCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: windows_sys::core::PCSTR, dwflags: u32, pvauxinfo: *const core::ffi::c_void, pinfo: *mut CERT_PUBLIC_KEY_INFO, pcbinfo: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8735:1: generic scalar type unsupported
// pub type PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC = Option<unsafe extern "system" fn(hbcryptkey: BCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pszpublickeyobjid: windows_sys::core::PCSTR, dwflags: u32, pvauxinfo: *const core::ffi::c_void, pinfo: *mut CERT_PUBLIC_KEY_INFO, pcbinfo: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8736:1: generic scalar type unsupported
// pub type PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC = Option<unsafe extern "system" fn(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, psignaturealgorithm: *const CRYPT_ALGORITHM_IDENTIFIER, ppvdecodedsignpara: *mut *mut core::ffi::c_void, ppwszcnghashalgid: *mut windows_sys::core::PWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8737:1: generic scalar type unsupported
// pub type PFN_CRYPT_FREE = Option<unsafe extern "system" fn(pv: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 8738:1: generic scalar type unsupported
// pub type PFN_CRYPT_GET_SIGNER_CERTIFICATE = Option<unsafe extern "system" fn(pvgetarg: *mut core::ffi::c_void, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, psignerid: *const CERT_INFO, hmsgcertstore: HCERTSTORE) -> *mut CERT_CONTEXT>;

// UNSUPPORTED Rust 8739:1: generic scalar type unsupported
// pub type PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FLUSH = Option<unsafe extern "system" fn(pcontext: *const core::ffi::c_void, rgidentifierornamelist: *const *const CRYPT_INTEGER_BLOB, dwidentifierornamelistcount: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8740:1: generic scalar type unsupported
// pub type PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE = Option<unsafe extern "system" fn(pplugincontext: *const core::ffi::c_void, pbdata: *const u8)>;

// UNSUPPORTED Rust 8741:1: generic scalar type unsupported
// pub type PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER = Option<unsafe extern "system" fn(pplugincontext: *const core::ffi::c_void, pidentifier: *const CRYPT_INTEGER_BLOB)>;

// UNSUPPORTED Rust 8742:1: generic scalar type unsupported
// pub type PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD = Option<unsafe extern "system" fn(pplugincontext: *const core::ffi::c_void, pwszpassword: windows_sys::core::PCWSTR)>;

// UNSUPPORTED Rust 8743:1: generic scalar type unsupported
// pub type PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET = Option<unsafe extern "system" fn(pplugincontext: *const core::ffi::c_void, pidentifier: *const CRYPT_INTEGER_BLOB, dwnametype: u32, pnameblob: *const CRYPT_INTEGER_BLOB, ppbcontent: *mut *mut u8, pcbcontent: *mut u32, ppwszpassword: *mut windows_sys::core::PCWSTR, ppidentifier: *mut *mut CRYPT_INTEGER_BLOB) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8744:1: generic scalar type unsupported
// pub type PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZE = Option<unsafe extern "system" fn(pfnflush: PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FLUSH, pcontext: *const core::ffi::c_void, pdwexpectedobjectcount: *mut u32, ppfunctable: *mut *mut CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE, ppplugincontext: *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8745:1: generic scalar type unsupported
// pub type PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE = Option<unsafe extern "system" fn(dwreason: CRYPT_OBJECT_LOCATOR_RELEASE_REASON, pplugincontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 8746:1: generic scalar type unsupported
// pub type PFN_CRYPT_SIGN_AND_ENCODE_HASH_FUNC = Option<unsafe extern "system" fn(hkey: NCRYPT_KEY_HANDLE, dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, psignaturealgorithm: *const CRYPT_ALGORITHM_IDENTIFIER, pvdecodedsignpara: *const core::ffi::c_void, pwszcngpubkeyalgid: windows_sys::core::PCWSTR, pwszcnghashalgid: windows_sys::core::PCWSTR, pbcomputedhash: *const u8, cbcomputedhash: u32, pbsignature: *mut u8, pcbsignature: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8747:1: generic scalar type unsupported
// pub type PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC = Option<unsafe extern "system" fn(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, ppubkeyinfo: *const CERT_PUBLIC_KEY_INFO, psignaturealgorithm: *const CRYPT_ALGORITHM_IDENTIFIER, pvdecodedsignpara: *const core::ffi::c_void, pwszcngpubkeyalgid: windows_sys::core::PCWSTR, pwszcnghashalgid: windows_sys::core::PCWSTR, pbcomputedhash: *const u8, cbcomputedhash: u32, pbsignature: *const u8, cbsignature: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8748:1: generic scalar type unsupported
// pub type PFN_CRYPT_XML_CREATE_TRANSFORM = Option<unsafe extern "system" fn(ptransform: *const CRYPT_XML_ALGORITHM, pproviderin: *const CRYPT_XML_DATA_PROVIDER, pproviderout: *mut CRYPT_XML_DATA_PROVIDER) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8749:1: generic scalar type unsupported
// pub type PFN_CRYPT_XML_DATA_PROVIDER_CLOSE = Option<unsafe extern "system" fn(pvcallbackstate: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8750:1: generic scalar type unsupported
// pub type PFN_CRYPT_XML_DATA_PROVIDER_READ = Option<unsafe extern "system" fn(pvcallbackstate: *mut core::ffi::c_void, pbdata: *mut u8, cbdata: u32, pcbread: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8751:1: generic scalar type unsupported
// pub type PFN_CRYPT_XML_ENUM_ALG_INFO = Option<unsafe extern "system" fn(pinfo: *const CRYPT_XML_ALGORITHM_INFO, pvarg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8752:1: generic scalar type unsupported
// pub type PFN_CRYPT_XML_WRITE_CALLBACK = Option<unsafe extern "system" fn(pvcallbackstate: *mut core::ffi::c_void, pbdata: *const u8, cbdata: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 8753:1: generic scalar type unsupported
// pub type PFN_CSP_ALLOC = Option<unsafe extern "system" fn(size: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 8754:1: generic scalar type unsupported
// pub type PFN_CSP_CACHE_ADD_FILE = Option<unsafe extern "system" fn(pvcachecontext: *const core::ffi::c_void, wsztag: windows_sys::core::PCWSTR, dwflags: u32, pbdata: *const u8, cbdata: u32) -> u32>;

// UNSUPPORTED Rust 8755:1: generic scalar type unsupported
// pub type PFN_CSP_CACHE_DELETE_FILE = Option<unsafe extern "system" fn(pvcachecontext: *const core::ffi::c_void, wsztag: windows_sys::core::PCWSTR, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8756:1: generic scalar type unsupported
// pub type PFN_CSP_CACHE_LOOKUP_FILE = Option<unsafe extern "system" fn(pvcachecontext: *const core::ffi::c_void, wsztag: windows_sys::core::PCWSTR, dwflags: u32, ppbdata: *mut *mut u8, pcbdata: *mut u32) -> u32>;

// UNSUPPORTED Rust 8757:1: generic scalar type unsupported
// pub type PFN_CSP_FREE = Option<unsafe extern "system" fn(address: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 8758:1: generic scalar type unsupported
// pub type PFN_CSP_GET_DH_AGREEMENT = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, hsecretagreement: *const core::ffi::c_void, pbsecretagreementindex: *mut u8, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 8759:1: generic scalar type unsupported
// pub type PFN_CSP_PAD_DATA = Option<unsafe extern "system" fn(psigninginfo: *const CARD_SIGNING_INFO, cbmaxwidth: u32, pcbpaddedbuffer: *mut u32, ppbpaddedbuffer: *mut *mut u8) -> u32>;

// UNSUPPORTED Rust 8760:1: generic scalar type unsupported
// pub type PFN_CSP_REALLOC = Option<unsafe extern "system" fn(address: *const core::ffi::c_void, size: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 8761:1: generic scalar type unsupported
// pub type PFN_CSP_UNPAD_DATA = Option<unsafe extern "system" fn(prsadecryptinfo: *const CARD_RSA_DECRYPT_INFO, pcbunpaddeddata: *mut u32, ppbunpaddeddata: *mut *mut u8) -> u32>;

// UNSUPPORTED Rust 8762:1: generic scalar type unsupported
// pub type PFN_EXPORT_PRIV_KEY_FUNC = Option<unsafe extern "system" fn(hcryptprov: usize, dwkeyspec: u32, pszprivatekeyobjid: windows_sys::core::PCSTR, dwflags: u32, pvauxinfo: *const core::ffi::c_void, pprivatekeyinfo: *mut CRYPT_PRIVATE_KEY_INFO, pcbprivatekeyinfo: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8763:1: generic scalar type unsupported
// pub type PFN_FREE_ENCODED_OBJECT_FUNC = Option<unsafe extern "system" fn(pszobjectoid: windows_sys::core::PCSTR, pobject: *mut CRYPT_BLOB_ARRAY, pvfreecontext: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 8764:1: generic scalar type unsupported
// pub type PFN_IMPORT_PRIV_KEY_FUNC = Option<unsafe extern "system" fn(hcryptprov: usize, pprivatekeyinfo: *const CRYPT_PRIVATE_KEY_INFO, dwflags: u32, pvauxinfo: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8765:1: generic scalar type unsupported
// pub type PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC = Option<unsafe extern "system" fn(dwcertencodingtype: CERT_QUERY_ENCODING_TYPE, pinfo: *const CERT_PUBLIC_KEY_INFO, dwflags: u32, pvauxinfo: *const core::ffi::c_void, phkey: *mut BCRYPT_KEY_HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8766:1: generic scalar type unsupported
// pub type PFN_MD_ENCRYPT_DATA = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, hkey: usize, pwszsecurefunction: windows_sys::core::PCWSTR, pbinput: *const u8, cbinput: u32, dwflags: u32, ppencrypteddata: *mut *mut CARD_ENCRYPTED_DATA, pcencrypteddata: *mut u32) -> u32>;

// UNSUPPORTED Rust 8767:1: generic scalar type unsupported
// pub type PFN_MD_IMPORT_SESSION_KEY = Option<unsafe extern "system" fn(pcarddata: *const CARD_DATA, pwszblobtype: windows_sys::core::PCWSTR, pwszalgid: windows_sys::core::PCWSTR, phkey: *mut usize, pbinput: *const u8, cbinput: u32) -> u32>;

// UNSUPPORTED Rust 8768:1: generic scalar type unsupported
// pub type PFN_NCRYPT_ALLOC = Option<unsafe extern "system" fn(cbsize: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 8769:1: generic scalar type unsupported
// pub type PFN_NCRYPT_FREE = Option<unsafe extern "system" fn(pv: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 8770:1: generic scalar type unsupported
// pub type PFN_OFFLOAD_MOD_EXPO = Option<unsafe extern "system" fn(pbbase: *mut u8, pbexponent: *mut u8, cbexponent: u32, pbmodulus: *mut u8, cbmodulus: u32, pbresult: *mut u8, pvoffloadprivatekey: *mut core::ffi::c_void, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 8771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PIN_CACHE_POLICY {
//     pub dwVersion: u32,
//     pub PinCachePolicyType: PIN_CACHE_POLICY_TYPE,
//     pub dwPinCachePolicyInfo: u32,
// }

public const val `PIN_CACHE_POLICY_CURRENT_VERSION`: UInt = 6u;
public typealias `PIN_CACHE_POLICY_TYPE` = Int;
public const val `PIN_CHANGE_FLAG_CHANGEPIN`: UInt = 2u;
public const val `PIN_CHANGE_FLAG_UNBLOCK`: UInt = 1u;
// UNSUPPORTED Rust 8782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PIN_INFO {
//     pub dwVersion: u32,
//     pub PinType: SECRET_TYPE,
//     pub PinPurpose: SECRET_PURPOSE,
//     pub dwChangePermission: u32,
//     pub dwUnblockPermission: u32,
//     pub PinCachePolicy: PIN_CACHE_POLICY,
//     pub dwFlags: u32,
// }

public const val `PIN_INFO_CURRENT_VERSION`: UInt = 6u;
public const val `PIN_INFO_REQUIRE_SECURE_ENTRY`: UInt = 1u;
public const val `PIN_SET_ALL_ROLES`: UInt = 255u;
public const val `PIN_SET_NONE`: UInt = 0u;
public const val `PKCS12_ALLOW_OVERWRITE_KEY`: `CRYPT_KEY_FLAGS` = 16384u;
public const val `PKCS12_ALWAYS_CNG_KSP`: `CRYPT_KEY_FLAGS` = 512u;
// UNSUPPORTED Rust 8799:1: non-scalar type Ptr unsupported
// pub const PKCS12_CONFIG_REGPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\PFX");

public const val `PKCS12_DISABLE_ENCRYPT_CERTIFICATES`: UInt = 256u;
public const val `PKCS12_ENCRYPT_CERTIFICATES`: UInt = 512u;
// UNSUPPORTED Rust 8802:1: non-scalar type Ptr unsupported
// pub const PKCS12_ENCRYPT_CERTIFICATES_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EncryptCertificates");

public const val `PKCS12_EXPORT_ECC_CURVE_OID`: UInt = 8192u;
public const val `PKCS12_EXPORT_ECC_CURVE_PARAMETERS`: UInt = 4096u;
public const val `PKCS12_EXPORT_PBES2_PARAMS`: UInt = 128u;
public const val `PKCS12_EXPORT_RESERVED_MASK`: UInt = 4294901760u;
public const val `PKCS12_EXPORT_SILENT`: UInt = 64u;
public const val `PKCS12_IMPORT_RESERVED_MASK`: UInt = 4294901760u;
public const val `PKCS12_IMPORT_SILENT`: UInt = 64u;
public const val `PKCS12_INCLUDE_EXTENDED_PROPERTIES`: `CRYPT_KEY_FLAGS` = 16u;
public const val `PKCS12_NO_PERSIST_KEY`: `CRYPT_KEY_FLAGS` = 32768u;
public const val `PKCS12_ONLY_CERTIFICATES`: UInt = 1024u;
// UNSUPPORTED Rust 8813:1: non-scalar type Ptr unsupported
// pub const PKCS12_ONLY_CERTIFICATES_CONTAINER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PfxContainer");

// UNSUPPORTED Rust 8814:1: non-scalar type Ptr unsupported
// pub const PKCS12_ONLY_CERTIFICATES_PROVIDER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PfxProvider");

public const val `PKCS12_ONLY_CERTIFICATES_PROVIDER_TYPE`: UInt = 0u;
public const val `PKCS12_ONLY_NOT_ENCRYPTED_CERTIFICATES`: UInt = 2048u;
// UNSUPPORTED Rust 8817:1: non-scalar type Ptr unsupported
// pub const PKCS12_PBES2_ALG_AES256_SHA256: windows_sys::core::PCWSTR = windows_sys::core::w!("AES256-SHA256");

// UNSUPPORTED Rust 8818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PKCS12_PBES2_EXPORT_PARAMS {
//     pub dwSize: u32,
//     pub hNcryptDescriptor: *mut core::ffi::c_void,
//     pub pwszPbes2Alg: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 8825:1: declaration Impl has no candidate rule
// impl Default for PKCS12_PBES2_EXPORT_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8830:1: non-scalar type Ptr unsupported
// pub const PKCS12_PBKDF2_ID_HMAC_SHA1: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2.7");

// UNSUPPORTED Rust 8831:1: non-scalar type Ptr unsupported
// pub const PKCS12_PBKDF2_ID_HMAC_SHA256: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2.9");

// UNSUPPORTED Rust 8832:1: non-scalar type Ptr unsupported
// pub const PKCS12_PBKDF2_ID_HMAC_SHA384: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2.10");

// UNSUPPORTED Rust 8833:1: non-scalar type Ptr unsupported
// pub const PKCS12_PBKDF2_ID_HMAC_SHA512: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2.11");

public const val `PKCS12_PREFER_CNG_KSP`: `CRYPT_KEY_FLAGS` = 256u;
public const val `PKCS12_PROTECT_TO_DOMAIN_SIDS`: UInt = 32u;
public const val `PKCS12_VIRTUAL_ISOLATION_KEY`: UInt = 65536u;
public const val `PKCS5_PADDING`: UInt = 1u;
// UNSUPPORTED Rust 8838:1: non-scalar type Ptr unsupported
// pub const PKCS7_SIGNER_INFO: windows_sys::core::PCSTR = 500i32 as _;

public const val `PKCS_7_ASN_ENCODING`: `CERT_QUERY_ENCODING_TYPE` = 65536u;
public const val `PKCS_7_NDR_ENCODING`: UInt = 131072u;
// UNSUPPORTED Rust 8841:1: non-scalar type Ptr unsupported
// pub const PKCS_ATTRIBUTE: windows_sys::core::PCSTR = 22i32 as _;

// UNSUPPORTED Rust 8842:1: non-scalar type Ptr unsupported
// pub const PKCS_ATTRIBUTES: windows_sys::core::PCSTR = 48i32 as _;

// UNSUPPORTED Rust 8843:1: non-scalar type Ptr unsupported
// pub const PKCS_CONTENT_INFO: windows_sys::core::PCSTR = 33i32 as _;

// UNSUPPORTED Rust 8844:1: non-scalar type Ptr unsupported
// pub const PKCS_CONTENT_INFO_SEQUENCE_OF_ANY: windows_sys::core::PCSTR = 23i32 as _;

// UNSUPPORTED Rust 8845:1: non-scalar type Ptr unsupported
// pub const PKCS_CTL: windows_sys::core::PCSTR = 37i32 as _;

// UNSUPPORTED Rust 8846:1: non-scalar type Ptr unsupported
// pub const PKCS_ENCRYPTED_PRIVATE_KEY_INFO: windows_sys::core::PCSTR = 45i32 as _;

// UNSUPPORTED Rust 8847:1: non-scalar type Ptr unsupported
// pub const PKCS_PRIVATE_KEY_INFO: windows_sys::core::PCSTR = 44i32 as _;

// UNSUPPORTED Rust 8848:1: non-scalar type Ptr unsupported
// pub const PKCS_RC2_CBC_PARAMETERS: windows_sys::core::PCSTR = 41i32 as _;

// UNSUPPORTED Rust 8849:1: non-scalar type Ptr unsupported
// pub const PKCS_RSAES_OAEP_PARAMETERS: windows_sys::core::PCSTR = 76i32 as _;

// UNSUPPORTED Rust 8850:1: non-scalar type Ptr unsupported
// pub const PKCS_RSA_PRIVATE_KEY: windows_sys::core::PCSTR = 43i32 as _;

// UNSUPPORTED Rust 8851:1: non-scalar type Ptr unsupported
// pub const PKCS_RSA_SSA_PSS_PARAMETERS: windows_sys::core::PCSTR = 75i32 as _;

public const val `PKCS_RSA_SSA_PSS_TRAILER_FIELD_BC`: UInt = 1u;
// UNSUPPORTED Rust 8853:1: non-scalar type Ptr unsupported
// pub const PKCS_SMIME_CAPABILITIES: windows_sys::core::PCSTR = 42i32 as _;

// UNSUPPORTED Rust 8854:1: non-scalar type Ptr unsupported
// pub const PKCS_SORTED_CTL: windows_sys::core::PCSTR = 49i32 as _;

// UNSUPPORTED Rust 8855:1: non-scalar type Ptr unsupported
// pub const PKCS_TIME_REQUEST: windows_sys::core::PCSTR = 18i32 as _;

// UNSUPPORTED Rust 8856:1: non-scalar type Ptr unsupported
// pub const PKCS_UTC_TIME: windows_sys::core::PCSTR = 17i32 as _;

public const val `PLAINTEXTKEYBLOB`: UInt = 8u;
// UNSUPPORTED Rust 8858:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_ELEMENT {
//     pub targetEndpointAddress: windows_sys::core::PCWSTR,
//     pub issuerEndpointAddress: windows_sys::core::PCWSTR,
//     pub issuedTokenParameters: windows_sys::core::PCWSTR,
//     pub privacyNoticeLink: windows_sys::core::PCWSTR,
//     pub privacyNoticeVersion: u32,
//     pub useManagedPresentation: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 8868:1: declaration Impl has no candidate rule
// impl Default for POLICY_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PP_ADMIN_PIN`: UInt = 31u;
public const val `PP_APPLI_CERT`: UInt = 18u;
public const val `PP_CERTCHAIN`: UInt = 9u;
public const val `PP_CHANGE_PASSWORD`: UInt = 7u;
public const val `PP_CLIENT_HWND`: `CRYPT_SET_PROV_PARAM_ID` = 1u;
public const val `PP_CONTAINER`: UInt = 6u;
public const val `PP_CONTEXT_INFO`: UInt = 11u;
public const val `PP_CRYPT_COUNT_KEY_USE`: UInt = 41u;
public const val `PP_DELETEKEY`: `CRYPT_SET_PROV_PARAM_ID` = 24u;
public const val `PP_DISMISS_PIN_UI_SEC`: UInt = 49u;
public const val `PP_ENUMALGS`: UInt = 1u;
public const val `PP_ENUMALGS_EX`: UInt = 22u;
public const val `PP_ENUMCONTAINERS`: UInt = 2u;
public const val `PP_ENUMELECTROOTS`: UInt = 26u;
public const val `PP_ENUMEX_SIGNING_PROT`: UInt = 40u;
public const val `PP_ENUMMANDROOTS`: UInt = 25u;
public const val `PP_IMPTYPE`: UInt = 3u;
public const val `PP_IS_PFX_EPHEMERAL`: UInt = 50u;
public const val `PP_KEYEXCHANGE_ALG`: `CRYPT_SET_PROV_PARAM_ID` = 14u;
public const val `PP_KEYEXCHANGE_KEYSIZE`: `CRYPT_SET_PROV_PARAM_ID` = 12u;
public const val `PP_KEYEXCHANGE_PIN`: `CRYPT_SET_PROV_PARAM_ID` = 32u;
public const val `PP_KEYSET_SEC_DESCR`: `CRYPT_SET_PROV_PARAM_ID` = 8u;
public const val `PP_KEYSET_TYPE`: UInt = 27u;
public const val `PP_KEYSPEC`: UInt = 39u;
public const val `PP_KEYSTORAGE`: UInt = 17u;
public const val `PP_KEYX_KEYSIZE_INC`: UInt = 35u;
public const val `PP_KEY_TYPE_SUBTYPE`: UInt = 10u;
public const val `PP_NAME`: UInt = 4u;
public const val `PP_PIN_PROMPT_STRING`: `CRYPT_SET_PROV_PARAM_ID` = 44u;
public const val `PP_PROVTYPE`: UInt = 16u;
public const val `PP_ROOT_CERTSTORE`: `CRYPT_SET_PROV_PARAM_ID` = 46u;
public const val `PP_SECURE_KEYEXCHANGE_PIN`: `CRYPT_SET_PROV_PARAM_ID` = 47u;
public const val `PP_SECURE_SIGNATURE_PIN`: `CRYPT_SET_PROV_PARAM_ID` = 48u;
public const val `PP_SESSION_KEYSIZE`: UInt = 20u;
public const val `PP_SGC_INFO`: UInt = 37u;
public const val `PP_SIGNATURE_ALG`: `CRYPT_SET_PROV_PARAM_ID` = 15u;
public const val `PP_SIGNATURE_KEYSIZE`: `CRYPT_SET_PROV_PARAM_ID` = 13u;
public const val `PP_SIGNATURE_PIN`: `CRYPT_SET_PROV_PARAM_ID` = 33u;
public const val `PP_SIG_KEYSIZE_INC`: UInt = 34u;
public const val `PP_SMARTCARD_GUID`: UInt = 45u;
public const val `PP_SMARTCARD_READER`: `CRYPT_SET_PROV_PARAM_ID` = 43u;
public const val `PP_SMARTCARD_READER_ICON`: UInt = 47u;
public const val `PP_SYM_KEYSIZE`: UInt = 19u;
public const val `PP_UI_PROMPT`: `CRYPT_SET_PROV_PARAM_ID` = 21u;
public const val `PP_UNIQUE_CONTAINER`: UInt = 36u;
public const val `PP_USER_CERTSTORE`: `CRYPT_SET_PROV_PARAM_ID` = 42u;
public const val `PP_USE_HARDWARE_RNG`: `CRYPT_SET_PROV_PARAM_ID` = 38u;
public const val `PP_VERSION`: UInt = 5u;
public const val `PRIVATEKEYBLOB`: UInt = 7u;
// UNSUPPORTED Rust 8922:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PRIVKEYVER3 {
//     pub magic: u32,
//     pub bitlenP: u32,
//     pub bitlenQ: u32,
//     pub bitlenJ: u32,
//     pub bitlenX: u32,
//     pub DSSSeed: DSSSEED,
// }

public const val `PROV_DH_SCHANNEL`: UInt = 18u;
public const val `PROV_DSS`: UInt = 3u;
public const val `PROV_DSS_DH`: UInt = 13u;
public const val `PROV_EC_ECDSA_FULL`: UInt = 16u;
public const val `PROV_EC_ECDSA_SIG`: UInt = 14u;
public const val `PROV_EC_ECNRA_FULL`: UInt = 17u;
public const val `PROV_EC_ECNRA_SIG`: UInt = 15u;
// UNSUPPORTED Rust 8939:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROV_ENUMALGS {
//     pub aiAlgid: ALG_ID,
//     pub dwBitLen: u32,
//     pub dwNameLen: u32,
//     pub szName: [i8; 20],
// }

// UNSUPPORTED Rust 8947:1: declaration Impl has no candidate rule
// impl Default for PROV_ENUMALGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 8952:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROV_ENUMALGS_EX {
//     pub aiAlgid: ALG_ID,
//     pub dwDefaultLen: u32,
//     pub dwMinLen: u32,
//     pub dwMaxLen: u32,
//     pub dwProtocols: u32,
//     pub dwNameLen: u32,
//     pub szName: [i8; 20],
//     pub dwLongNameLen: u32,
//     pub szLongName: [i8; 40],
// }

// UNSUPPORTED Rust 8965:1: declaration Impl has no candidate rule
// impl Default for PROV_ENUMALGS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROV_FORTEZZA`: UInt = 4u;
public const val `PROV_INTEL_SEC`: UInt = 22u;
public const val `PROV_MS_EXCHANGE`: UInt = 5u;
public const val `PROV_REPLACE_OWF`: UInt = 23u;
public const val `PROV_RNG`: UInt = 21u;
public const val `PROV_RSA_AES`: UInt = 24u;
public const val `PROV_RSA_FULL`: UInt = 1u;
public const val `PROV_RSA_SCHANNEL`: UInt = 12u;
public const val `PROV_RSA_SIG`: UInt = 2u;
public const val `PROV_SPYRUS_LYNKS`: UInt = 20u;
public const val `PROV_SSL`: UInt = 6u;
public const val `PROV_STT_ACQ`: UInt = 8u;
public const val `PROV_STT_BRND`: UInt = 9u;
public const val `PROV_STT_ISS`: UInt = 11u;
public const val `PROV_STT_MER`: UInt = 7u;
public const val `PROV_STT_ROOT`: UInt = 10u;
// UNSUPPORTED Rust 8986:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PUBKEY {
//     pub magic: u32,
//     pub bitlen: u32,
// }

// UNSUPPORTED Rust 8992:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PUBKEYVER3 {
//     pub magic: u32,
//     pub bitlenP: u32,
//     pub bitlenQ: u32,
//     pub bitlenJ: u32,
//     pub DSSSeed: DSSSEED,
// }

public const val `PUBLICKEYBLOB`: UInt = 6u;
public const val `PUBLICKEYBLOBEX`: UInt = 10u;
// UNSUPPORTED Rust 9003:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PUBLICKEYSTRUC {
//     pub bType: u8,
//     pub bVersion: u8,
//     pub reserved: u16,
//     pub aiKeyAlg: ALG_ID,
// }

public const val `PVK_TYPE_FILE_NAME`: `SIGNER_PRIVATE_KEY_CHOICE` = 1u;
public const val `PVK_TYPE_KEYCONTAINER`: `SIGNER_PRIVATE_KEY_CHOICE` = 2u;
// UNSUPPORTED Rust 9013:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct PaddingMode(pub i32);

// UNSUPPORTED Rust 9016:1: declaration Impl has no candidate rule
// impl PaddingMode {
//     pub const None: Self = Self(1i32);
//     pub const PKCS7: Self = Self(2i32);
//     pub const Zeros: Self = Self(3i32);
//     pub const ANSIX923: Self = Self(4i32);
//     pub const ISO10126: Self = Self(5i32);
// }

public const val `PinCacheAlwaysPrompt`: `PIN_CACHE_POLICY_TYPE` = 3;
public const val `PinCacheNone`: `PIN_CACHE_POLICY_TYPE` = 2;
public const val `PinCacheNormal`: `PIN_CACHE_POLICY_TYPE` = 0;
public const val `PinCacheTimed`: `PIN_CACHE_POLICY_TYPE` = 1;
public const val `PrimaryCardPin`: `SECRET_PURPOSE` = 5;
public const val `RANDOM_PADDING`: UInt = 2u;
// UNSUPPORTED Rust 9029:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RECIPIENTPOLICY {
//     pub recipient: ENDPOINTADDRESS,
//     pub issuer: ENDPOINTADDRESS,
//     pub tokenType: windows_sys::core::PCWSTR,
//     pub requiredClaims: CLAIMLIST,
//     pub optionalClaims: CLAIMLIST,
//     pub privacyUrl: windows_sys::core::PCWSTR,
//     pub privacyVersion: u32,
// }

// UNSUPPORTED Rust 9040:1: declaration Impl has no candidate rule
// impl Default for RECIPIENTPOLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9045:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RECIPIENTPOLICY2 {
//     pub recipient: ENDPOINTADDRESS2,
//     pub issuer: ENDPOINTADDRESS2,
//     pub tokenType: windows_sys::core::PCWSTR,
//     pub requiredClaims: CLAIMLIST,
//     pub optionalClaims: CLAIMLIST,
//     pub privacyUrl: windows_sys::core::PCWSTR,
//     pub privacyVersion: u32,
// }

// UNSUPPORTED Rust 9056:1: declaration Impl has no candidate rule
// impl Default for RECIPIENTPOLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RECIPIENTPOLICYV1`: UInt = 1u;
public const val `RECIPIENTPOLICYV2`: UInt = 2u;
public const val `REPORT_NOT_ABLE_TO_EXPORT_PRIVATE_KEY`: UInt = 2u;
public const val `REPORT_NO_PRIVATE_KEY`: UInt = 1u;
// UNSUPPORTED Rust 9065:1: non-scalar type Ptr unsupported
// pub const REVOCATION_OID_CRL_REVOCATION: windows_sys::core::PCSTR = 1i32 as _;

public const val `ROLE_ADMIN`: UInt = 2u;
public const val `ROLE_EVERYONE`: UInt = 0u;
public const val `ROLE_PIN_ALWAYS`: UInt = 3u;
public const val `ROLE_PUK`: UInt = 4u;
public const val `ROLE_USER`: UInt = 1u;
// UNSUPPORTED Rust 9071:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ROOT_INFO_LUID {
//     pub LowPart: u32,
//     pub HighPart: i32,
// }

public const val `RSA1024BIT_KEY`: UInt = 67108864u;
// UNSUPPORTED Rust 9078:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RSAPUBKEY {
//     pub magic: u32,
//     pub bitlen: u32,
//     pub pubexp: u32,
// }

// UNSUPPORTED Rust 9085:1: non-scalar type Ptr unsupported
// pub const RSA_CSP_PUBLICKEYBLOB: windows_sys::core::PCSTR = 19i32 as _;

public const val `SCARD_PROVIDER_CARD_MODULE`: UInt = 2147483649u;
// UNSUPPORTED Rust 9087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCHANNEL_ALG {
//     pub dwUse: u32,
//     pub Algid: ALG_ID,
//     pub cBits: u32,
//     pub dwFlags: u32,
//     pub dwReserved: u32,
// }

public const val `SCHANNEL_ENC_KEY`: UInt = 1u;
public const val `SCHANNEL_MAC_KEY`: UInt = 0u;
// UNSUPPORTED Rust 9098:1: non-scalar type Ptr unsupported
// pub const SCHEME_OID_RETRIEVE_ENCODED_OBJECTW_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("SchemeDllRetrieveEncodedObjectW");

// UNSUPPORTED Rust 9099:1: non-scalar type Ptr unsupported
// pub const SCHEME_OID_RETRIEVE_ENCODED_OBJECT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("SchemeDllRetrieveEncodedObject");

public typealias `SECRET_PURPOSE` = Int;
public typealias `SECRET_TYPE` = Int;
public const val `SIGNATURE_RESOURCE_NUMBER`: UInt = 666u;
// UNSUPPORTED Rust 9103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_ATTR_AUTHCODE {
//     pub cbSize: u32,
//     pub fCommercial: windows_sys::core::BOOL,
//     pub fIndividual: windows_sys::core::BOOL,
//     pub pwszName: windows_sys::core::PCWSTR,
//     pub pwszInfo: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 9112:1: declaration Impl has no candidate rule
// impl Default for SIGNER_ATTR_AUTHCODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIGNER_AUTHCODE_ATTR`: `SIGNER_SIGNATURE_ATTRIBUTE_CHOICE` = 1u;
// UNSUPPORTED Rust 9118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_BLOB_INFO {
//     pub cbSize: u32,
//     pub pGuidSubject: *mut windows_sys::core::GUID,
//     pub cbBlob: u32,
//     pub pbBlob: *mut u8,
//     pub pwszDisplayName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 9127:1: declaration Impl has no candidate rule
// impl Default for SIGNER_BLOB_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9132:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_CERT {
//     pub cbSize: u32,
//     pub dwCertChoice: SIGNER_CERT_CHOICE,
//     pub Anonymous: SIGNER_CERT_0,
//     pub hwnd: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 9140:1: declaration Impl has no candidate rule
// impl Default for SIGNER_CERT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9145:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIGNER_CERT_0 {
//     pub pwszSpcFile: windows_sys::core::PCWSTR,
//     pub pCertStoreInfo: *mut SIGNER_CERT_STORE_INFO,
//     pub pSpcChainInfo: *mut SIGNER_SPC_CHAIN_INFO,
// }

// UNSUPPORTED Rust 9152:1: declaration Impl has no candidate rule
// impl Default for SIGNER_CERT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SIGNER_CERT_CHOICE` = UInt;
public typealias `SIGNER_CERT_POLICY` = UInt;
public const val `SIGNER_CERT_POLICY_CHAIN`: `SIGNER_CERT_POLICY` = 2u;
public const val `SIGNER_CERT_POLICY_CHAIN_NO_ROOT`: `SIGNER_CERT_POLICY` = 8u;
public const val `SIGNER_CERT_POLICY_SPC`: `SIGNER_CERT_POLICY` = 4u;
public const val `SIGNER_CERT_POLICY_STORE`: `SIGNER_CERT_POLICY` = 1u;
public const val `SIGNER_CERT_SPC_CHAIN`: `SIGNER_CERT_CHOICE` = 3u;
public const val `SIGNER_CERT_SPC_FILE`: `SIGNER_CERT_CHOICE` = 1u;
public const val `SIGNER_CERT_STORE`: `SIGNER_CERT_CHOICE` = 2u;
// UNSUPPORTED Rust 9166:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_CERT_STORE_INFO {
//     pub cbSize: u32,
//     pub pSigningCert: *const CERT_CONTEXT,
//     pub dwCertPolicy: SIGNER_CERT_POLICY,
//     pub hCertStore: HCERTSTORE,
// }

// UNSUPPORTED Rust 9174:1: declaration Impl has no candidate rule
// impl Default for SIGNER_CERT_STORE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_CONTEXT {
//     pub cbSize: u32,
//     pub cbBlob: u32,
//     pub pbBlob: *mut u8,
// }

// UNSUPPORTED Rust 9186:1: declaration Impl has no candidate rule
// impl Default for SIGNER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_DIGEST_SIGN_INFO {
//     pub cbSize: u32,
//     pub dwDigestSignChoice: u32,
//     pub Anonymous: SIGNER_DIGEST_SIGN_INFO_0,
//     pub pMetadataBlob: *mut CRYPT_INTEGER_BLOB,
//     pub dwReserved: u32,
//     pub dwReserved2: u32,
//     pub dwReserved3: u32,
// }

// UNSUPPORTED Rust 9202:1: declaration Impl has no candidate rule
// impl Default for SIGNER_DIGEST_SIGN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9207:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIGNER_DIGEST_SIGN_INFO_0 {
//     pub pfnAuthenticodeDigestSign: PFN_AUTHENTICODE_DIGEST_SIGN,
//     pub pfnAuthenticodeDigestSignWithFileHandle: PFN_AUTHENTICODE_DIGEST_SIGN_WITHFILEHANDLE,
//     pub pfnAuthenticodeDigestSignEx: PFN_AUTHENTICODE_DIGEST_SIGN_EX,
//     pub pfnAuthenticodeDigestSignExWithFileHandle: PFN_AUTHENTICODE_DIGEST_SIGN_EX_WITHFILEHANDLE,
// }

// UNSUPPORTED Rust 9215:1: declaration Impl has no candidate rule
// impl Default for SIGNER_DIGEST_SIGN_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9220:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_DIGEST_SIGN_INFO_V1 {
//     pub cbSize: u32,
//     pub pfnAuthenticodeDigestSign: PFN_AUTHENTICODE_DIGEST_SIGN,
//     pub pMetadataBlob: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 9227:1: declaration Impl has no candidate rule
// impl Default for SIGNER_DIGEST_SIGN_INFO_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_DIGEST_SIGN_INFO_V2 {
//     pub cbSize: u32,
//     pub pfnAuthenticodeDigestSign: PFN_AUTHENTICODE_DIGEST_SIGN,
//     pub pfnAuthenticodeDigestSignEx: PFN_AUTHENTICODE_DIGEST_SIGN_EX,
//     pub pMetadataBlob: *mut CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 9240:1: declaration Impl has no candidate rule
// impl Default for SIGNER_DIGEST_SIGN_INFO_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9245:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_FILE_INFO {
//     pub cbSize: u32,
//     pub pwszFileName: windows_sys::core::PCWSTR,
//     pub hFile: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 9252:1: declaration Impl has no candidate rule
// impl Default for SIGNER_FILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIGNER_NO_ATTR`: `SIGNER_SIGNATURE_ATTRIBUTE_CHOICE` = 0u;
public typealias `SIGNER_PRIVATE_KEY_CHOICE` = UInt;
// UNSUPPORTED Rust 9259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_PROVIDER_INFO {
//     pub cbSize: u32,
//     pub pwszProviderName: windows_sys::core::PCWSTR,
//     pub dwProviderType: u32,
//     pub dwKeySpec: u32,
//     pub dwPvkChoice: SIGNER_PRIVATE_KEY_CHOICE,
//     pub Anonymous: SIGNER_PROVIDER_INFO_0,
// }

// UNSUPPORTED Rust 9269:1: declaration Impl has no candidate rule
// impl Default for SIGNER_PROVIDER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9274:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIGNER_PROVIDER_INFO_0 {
//     pub pwszPvkFileName: windows_sys::core::PWSTR,
//     pub pwszKeyContainer: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 9280:1: declaration Impl has no candidate rule
// impl Default for SIGNER_PROVIDER_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SIGNER_SIGNATURE_ATTRIBUTE_CHOICE` = UInt;
// UNSUPPORTED Rust 9286:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_SIGNATURE_INFO {
//     pub cbSize: u32,
//     pub algidHash: ALG_ID,
//     pub dwAttrChoice: SIGNER_SIGNATURE_ATTRIBUTE_CHOICE,
//     pub Anonymous: SIGNER_SIGNATURE_INFO_0,
//     pub psAuthenticated: *mut CRYPT_ATTRIBUTES,
//     pub psUnauthenticated: *mut CRYPT_ATTRIBUTES,
// }

// UNSUPPORTED Rust 9296:1: declaration Impl has no candidate rule
// impl Default for SIGNER_SIGNATURE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9301:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIGNER_SIGNATURE_INFO_0 {
//     pub pAttrAuthcode: *mut SIGNER_ATTR_AUTHCODE,
// }

// UNSUPPORTED Rust 9306:1: declaration Impl has no candidate rule
// impl Default for SIGNER_SIGNATURE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SIGNER_SIGN_FLAGS` = UInt;
// UNSUPPORTED Rust 9312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_SPC_CHAIN_INFO {
//     pub cbSize: u32,
//     pub pwszSpcFile: windows_sys::core::PCWSTR,
//     pub dwCertPolicy: u32,
//     pub hCertStore: HCERTSTORE,
// }

// UNSUPPORTED Rust 9320:1: declaration Impl has no candidate rule
// impl Default for SIGNER_SPC_CHAIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIGNER_SUBJECT_BLOB`: `SIGNER_SUBJECT_CHOICE` = 2u;
public typealias `SIGNER_SUBJECT_CHOICE` = UInt;
public const val `SIGNER_SUBJECT_FILE`: `SIGNER_SUBJECT_CHOICE` = 1u;
// UNSUPPORTED Rust 9328:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SIGNER_SUBJECT_INFO {
//     pub cbSize: u32,
//     pub pdwIndex: *mut u32,
//     pub dwSubjectChoice: SIGNER_SUBJECT_CHOICE,
//     pub Anonymous: SIGNER_SUBJECT_INFO_0,
// }

// UNSUPPORTED Rust 9336:1: declaration Impl has no candidate rule
// impl Default for SIGNER_SUBJECT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9341:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIGNER_SUBJECT_INFO_0 {
//     pub pSignerFileInfo: *mut SIGNER_FILE_INFO,
//     pub pSignerBlobInfo: *mut SIGNER_BLOB_INFO,
// }

// UNSUPPORTED Rust 9347:1: declaration Impl has no candidate rule
// impl Default for SIGNER_SUBJECT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIGNER_TIMESTAMP_AUTHENTICODE`: `SIGNER_TIMESTAMP_FLAGS` = 1u;
public typealias `SIGNER_TIMESTAMP_FLAGS` = UInt;
public const val `SIGNER_TIMESTAMP_RFC3161`: `SIGNER_TIMESTAMP_FLAGS` = 2u;
public const val `SIG_APPEND`: `SIGNER_SIGN_FLAGS` = 4096u;
public const val `SIMPLEBLOB`: UInt = 1u;
public const val `SITE_PIN_RULES_ALL_SUBDOMAINS_FLAG`: UInt = 1u;
public const val `SORTED_CTL_EXT_HASHED_SUBJECT_IDENTIFIER_FLAG`: UInt = 1u;
public const val `SPC_DIGEST_GENERATE_FLAG`: `SIGNER_SIGN_FLAGS` = 512u;
public const val `SPC_DIGEST_SIGN_EX_FLAG`: `SIGNER_SIGN_FLAGS` = 16384u;
public const val `SPC_DIGEST_SIGN_FLAG`: `SIGNER_SIGN_FLAGS` = 1024u;
public const val `SPC_EXC_PE_PAGE_HASHES_FLAG`: `SIGNER_SIGN_FLAGS` = 16u;
public const val `SPC_INC_PE_DEBUG_INFO_FLAG`: `SIGNER_SIGN_FLAGS` = 64u;
public const val `SPC_INC_PE_IMPORT_ADDR_TABLE_FLAG`: `SIGNER_SIGN_FLAGS` = 32u;
public const val `SPC_INC_PE_PAGE_HASHES_FLAG`: `SIGNER_SIGN_FLAGS` = 256u;
public const val `SPC_INC_PE_RESOURCES_FLAG`: `SIGNER_SIGN_FLAGS` = 128u;
public const val `SSL2_PROTOCOL_VERSION`: UInt = 2u;
public const val `SSL3_PROTOCOL_VERSION`: UInt = 768u;
public const val `SSL_CK_DES_192_EDE3_CBC_WITH_MD5`: UInt = 458944u;
public const val `SSL_CK_DES_64_CBC_WITH_MD5`: UInt = 393280u;
public const val `SSL_CK_IDEA_128_CBC_WITH_MD5`: UInt = 327808u;
public const val `SSL_CK_RC2_128_CBC_EXPORT40_WITH_MD5`: UInt = 262272u;
public const val `SSL_CK_RC2_128_CBC_WITH_MD5`: UInt = 196736u;
public const val `SSL_CK_RC4_128_EXPORT40_WITH_MD5`: UInt = 131200u;
public const val `SSL_CK_RC4_128_WITH_MD5`: UInt = 65664u;
// UNSUPPORTED Rust 9376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SSL_ECCKEY_BLOB {
//     pub dwCurveType: u32,
//     pub cbKey: u32,
// }

// UNSUPPORTED Rust 9382:1: non-scalar type Ptr unsupported
// pub const SSL_ECCPUBLIC_BLOB: windows_sys::core::PCWSTR = windows_sys::core::w!("SSLECCPUBLICBLOB");

// UNSUPPORTED Rust 9383:1: non-scalar type Ptr unsupported
// pub const SSL_ECDSA_ALGORITHM: windows_sys::core::PCWSTR = windows_sys::core::w!("ECDSA");

public const val `SSL_F12_ERROR_TEXT_LENGTH`: UInt = 256u;
// UNSUPPORTED Rust 9385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS {
//     pub cbSize: u32,
//     pub dwErrorLevel: u32,
//     pub dwErrorCategory: u32,
//     pub dwReserved: u32,
//     pub wszErrorText: [u16; 256],
// }

// UNSUPPORTED Rust 9394:1: declaration Impl has no candidate rule
// impl Default for SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SSL_HPKP_HEADER_COUNT`: UInt = 2u;
// UNSUPPORTED Rust 9400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SSL_HPKP_HEADER_EXTRA_CERT_CHAIN_POLICY_PARA {
//     pub cbSize: u32,
//     pub dwReserved: u32,
//     pub pwszServerName: windows_sys::core::PWSTR,
//     pub rgpszHpkpValue: [windows_sys::core::PSTR; 2],
// }

// UNSUPPORTED Rust 9408:1: declaration Impl has no candidate rule
// impl Default for SSL_HPKP_HEADER_EXTRA_CERT_CHAIN_POLICY_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SSL_HPKP_PKP_HEADER_INDEX`: UInt = 0u;
public const val `SSL_HPKP_PKP_RO_HEADER_INDEX`: UInt = 1u;
public const val `SSL_KEY_PIN_ERROR_TEXT_LENGTH`: UInt = 512u;
// UNSUPPORTED Rust 9416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA {
//     pub cbSize: u32,
//     pub dwReserved: u32,
//     pub pwszServerName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 9423:1: declaration Impl has no candidate rule
// impl Default for SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9428:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_STATUS {
//     pub cbSize: u32,
//     pub lError: i32,
//     pub wszErrorText: [u16; 512],
// }

// UNSUPPORTED Rust 9435:1: declaration Impl has no candidate rule
// impl Default for SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9440:1: non-scalar type Ptr unsupported
// pub const SSL_KEY_TYPE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("KEYTYPE");

// UNSUPPORTED Rust 9441:1: non-scalar type Ptr unsupported
// pub const SSL_OBJECT_LOCATOR_CERT_VALIDATION_CONFIG_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("SslObjectLocatorInitializeCertValidationConfig");

// UNSUPPORTED Rust 9442:1: non-scalar type Ptr unsupported
// pub const SSL_OBJECT_LOCATOR_ISSUER_LIST_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("SslObjectLocatorInitializeIssuerList");

// UNSUPPORTED Rust 9443:1: non-scalar type Ptr unsupported
// pub const SSL_OBJECT_LOCATOR_PFX_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("SslObjectLocatorInitializePfx");

public const val `SYMMETRICWRAPKEYBLOB`: UInt = 11u;
// UNSUPPORTED Rust 9445:1: generic scalar type unsupported
// pub type SslComputeClientAuthHashFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pszalgid: windows_sys::core::PCWSTR, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9446:1: generic scalar type unsupported
// pub type SslComputeEapKeyBlockFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, pbrandoms: *const u8, cbrandoms: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9447:1: generic scalar type unsupported
// pub type SslComputeFinishedHashFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pboutput: *mut u8, cboutput: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9448:1: generic scalar type unsupported
// pub type SslComputeSessionHashFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, dwprotocol: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9449:1: generic scalar type unsupported
// pub type SslCreateClientAuthHashFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: *mut NCRYPT_HASH_HANDLE, dwprotocol: u32, dwciphersuite: u32, pszhashalgid: windows_sys::core::PCWSTR, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9450:1: generic scalar type unsupported
// pub type SslCreateEphemeralKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, phephemeralkey: *mut NCRYPT_KEY_HANDLE, dwprotocol: u32, dwciphersuite: u32, dwkeytype: u32, dwkeybitlen: u32, pbparams: *const u8, cbparams: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9451:1: generic scalar type unsupported
// pub type SslCreateHandshakeHashFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, phhandshakehash: *mut NCRYPT_HASH_HANDLE, dwprotocol: u32, dwciphersuite: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9452:1: generic scalar type unsupported
// pub type SslDecryptPacketFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, sequencenumber: u64, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9453:1: generic scalar type unsupported
// pub type SslDuplicateTranscriptHashFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, htranscripthash: NCRYPT_HASH_HANDLE, phduplicatetranscripthash: *mut NCRYPT_HASH_HANDLE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9454:1: generic scalar type unsupported
// pub type SslEncryptPacketFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pbinput: *const u8, cbinput: u32, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, sequencenumber: u64, dwcontenttype: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9455:1: generic scalar type unsupported
// pub type SslEnumCipherSuitesExFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: *mut *mut NCRYPT_SSL_CIPHER_SUITE_EX, ppenumstate: *mut *mut core::ffi::c_void, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9456:1: generic scalar type unsupported
// pub type SslEnumCipherSuitesFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, ppciphersuite: *mut *mut NCRYPT_SSL_CIPHER_SUITE, ppenumstate: *mut *mut core::ffi::c_void, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9457:1: generic scalar type unsupported
// pub type SslEnumEccCurvesFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, pecccurvecount: *mut u32, ppecccurve: *mut *mut NCRYPT_SSL_ECC_CURVE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9458:1: generic scalar type unsupported
// pub type SslExpandBinderKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phbinderkey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9459:1: generic scalar type unsupported
// pub type SslExpandExporterMasterKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phexportermasterkey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9460:1: generic scalar type unsupported
// pub type SslExpandPreSharedKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hresumptionmasterkey: NCRYPT_KEY_HANDLE, pbticketnonce: *const u8, cbticketnonce: u32, phpresharedkey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9461:1: generic scalar type unsupported
// pub type SslExpandResumptionMasterKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phresumptionmasterkey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9462:1: generic scalar type unsupported
// pub type SslExpandTrafficKeysFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hbasekey: NCRYPT_KEY_HANDLE, hhashvalue: NCRYPT_HASH_HANDLE, phclienttraffickey: *mut NCRYPT_KEY_HANDLE, phservertraffickey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9463:1: generic scalar type unsupported
// pub type SslExpandWriteKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hbasetraffickey: NCRYPT_KEY_HANDLE, phwritekey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9464:1: generic scalar type unsupported
// pub type SslExportKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hkey: NCRYPT_KEY_HANDLE, pszblobtype: windows_sys::core::PCWSTR, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9465:1: generic scalar type unsupported
// pub type SslExportKeyingMaterialFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, slabel: windows_sys::core::PCSTR, pbrandoms: *const u8, cbrandoms: u32, pbcontextvalue: *const u8, cbcontextvalue: u16, pboutput: *mut u8, cboutput: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9466:1: generic scalar type unsupported
// pub type SslExtractEarlyKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hpresharedkey: NCRYPT_KEY_HANDLE, phearlykey: *mut NCRYPT_KEY_HANDLE, dwprotocol: u32, dwciphersuite: u32, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9467:1: generic scalar type unsupported
// pub type SslExtractHandshakeKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, hearlykey: NCRYPT_KEY_HANDLE, phhandshakekey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9468:1: generic scalar type unsupported
// pub type SslExtractMasterKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakekey: NCRYPT_KEY_HANDLE, phmasterkey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9469:1: generic scalar type unsupported
// pub type SslFreeBufferFn = Option<unsafe extern "system" fn(pvinput: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9470:1: generic scalar type unsupported
// pub type SslFreeObjectFn = Option<unsafe extern "system" fn(hobject: NCRYPT_HANDLE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9471:1: generic scalar type unsupported
// pub type SslGenerateMasterKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phmasterkey: *mut NCRYPT_KEY_HANDLE, dwprotocol: u32, dwciphersuite: u32, pparameterlist: *const BCryptBufferDesc, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9472:1: generic scalar type unsupported
// pub type SslGeneratePreMasterKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, phpremasterkey: *mut NCRYPT_KEY_HANDLE, dwprotocol: u32, dwciphersuite: u32, pparameterlist: *const BCryptBufferDesc, pboutput: *mut u8, cboutput: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9473:1: generic scalar type unsupported
// pub type SslGenerateSessionKeysFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hmasterkey: NCRYPT_KEY_HANDLE, phreadkey: *mut NCRYPT_KEY_HANDLE, phwritekey: *mut NCRYPT_KEY_HANDLE, pparameterlist: *const BCryptBufferDesc, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9474:1: generic scalar type unsupported
// pub type SslGetCipherSuitePRFHashAlgorithmFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: u32, dwciphersuite: u32, dwkeytype: u32, szprfhash: windows_sys::core::PWSTR, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9475:1: generic scalar type unsupported
// pub type SslGetKeyPropertyFn = Option<unsafe extern "system" fn(hkey: NCRYPT_KEY_HANDLE, pszproperty: windows_sys::core::PCWSTR, ppboutput: *mut *mut u8, pcboutput: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9476:1: generic scalar type unsupported
// pub type SslGetProviderPropertyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, pszproperty: windows_sys::core::PCWSTR, ppboutput: *mut *mut u8, pcboutput: *mut u32, ppenumstate: *mut *mut core::ffi::c_void, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9477:1: generic scalar type unsupported
// pub type SslHashHandshakeFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hhandshakehash: NCRYPT_HASH_HANDLE, pbinput: *const u8, cbinput: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9478:1: generic scalar type unsupported
// pub type SslImportKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, phkey: *mut NCRYPT_KEY_HANDLE, pszblobtype: windows_sys::core::PCWSTR, pbkeyblob: *const u8, cbkeyblob: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9479:1: generic scalar type unsupported
// pub type SslImportMasterKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, phmasterkey: *mut NCRYPT_KEY_HANDLE, dwprotocol: u32, dwciphersuite: u32, pparameterlist: *const BCryptBufferDesc, pbencryptedkey: *const u8, cbencryptedkey: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9480:1: generic scalar type unsupported
// pub type SslInitializeInterfaceFn = Option<unsafe extern "system" fn(pszprovidername: windows_sys::core::PCWSTR, pfunctiontable: *mut NCRYPT_SSL_FUNCTION_TABLE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9481:1: generic scalar type unsupported
// pub type SslLookupCipherLengthsFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: u32, dwciphersuite: u32, dwkeytype: u32, pcipherlengths: *mut NCRYPT_SSL_CIPHER_LENGTHS, cbcipherlengths: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9482:1: generic scalar type unsupported
// pub type SslLookupCipherSuiteInfoFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, dwprotocol: u32, dwciphersuite: u32, dwkeytype: u32, pciphersuite: *mut NCRYPT_SSL_CIPHER_SUITE, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9483:1: generic scalar type unsupported
// pub type SslOpenPrivateKeyFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, phprivatekey: *mut NCRYPT_KEY_HANDLE, pcertcontext: *const CERT_CONTEXT, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9484:1: generic scalar type unsupported
// pub type SslOpenProviderFn = Option<unsafe extern "system" fn(phsslprovider: *mut NCRYPT_PROV_HANDLE, pszprovidername: windows_sys::core::PCWSTR, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9485:1: generic scalar type unsupported
// pub type SslSignHashFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hprivatekey: NCRYPT_KEY_HANDLE, pbhashvalue: *const u8, cbhashvalue: u32, pbsignature: *mut u8, cbsignature: u32, pcbresult: *mut u32, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 9486:1: generic scalar type unsupported
// pub type SslVerifySignatureFn = Option<unsafe extern "system" fn(hsslprovider: NCRYPT_PROV_HANDLE, hpublickey: NCRYPT_KEY_HANDLE, pbhashvalue: *const u8, cbhashvalue: u32, pbsignature: *const u8, cbsignature: u32, dwflags: u32) -> windows_sys::core::HRESULT>;

public const val `TIMESTAMP_DONT_HASH_DATA`: UInt = 1u;
public const val `TIMESTAMP_FAILURE_BAD_ALG`: UInt = 0u;
public const val `TIMESTAMP_FAILURE_BAD_FORMAT`: UInt = 5u;
public const val `TIMESTAMP_FAILURE_BAD_REQUEST`: UInt = 2u;
public const val `TIMESTAMP_FAILURE_EXTENSION_NOT_SUPPORTED`: UInt = 16u;
public const val `TIMESTAMP_FAILURE_INFO_NOT_AVAILABLE`: UInt = 17u;
public const val `TIMESTAMP_FAILURE_POLICY_NOT_SUPPORTED`: UInt = 15u;
public const val `TIMESTAMP_FAILURE_SYSTEM_FAILURE`: UInt = 25u;
public const val `TIMESTAMP_FAILURE_TIME_NOT_AVAILABLE`: UInt = 14u;
// UNSUPPORTED Rust 9496:1: non-scalar type Ptr unsupported
// pub const TIMESTAMP_INFO: windows_sys::core::PCSTR = 80i32 as _;

public const val `TIMESTAMP_NO_AUTH_RETRIEVAL`: UInt = 131072u;
// UNSUPPORTED Rust 9498:1: non-scalar type Ptr unsupported
// pub const TIMESTAMP_REQUEST: windows_sys::core::PCSTR = 78i32 as _;

// UNSUPPORTED Rust 9499:1: non-scalar type Ptr unsupported
// pub const TIMESTAMP_RESPONSE: windows_sys::core::PCSTR = 79i32 as _;

public const val `TIMESTAMP_STATUS_GRANTED`: `CRYPT_TIMESTAMP_RESPONSE_STATUS` = 0u;
public const val `TIMESTAMP_STATUS_GRANTED_WITH_MODS`: `CRYPT_TIMESTAMP_RESPONSE_STATUS` = 1u;
public const val `TIMESTAMP_STATUS_REJECTED`: `CRYPT_TIMESTAMP_RESPONSE_STATUS` = 2u;
public const val `TIMESTAMP_STATUS_REVOCATION_WARNING`: `CRYPT_TIMESTAMP_RESPONSE_STATUS` = 4u;
public const val `TIMESTAMP_STATUS_REVOKED`: `CRYPT_TIMESTAMP_RESPONSE_STATUS` = 5u;
public const val `TIMESTAMP_STATUS_WAITING`: `CRYPT_TIMESTAMP_RESPONSE_STATUS` = 3u;
public const val `TIMESTAMP_VERIFY_CONTEXT_SIGNATURE`: UInt = 32u;
public const val `TIMESTAMP_VERSION`: `CRYPT_TIMESTAMP_VERSION` = 1u;
// UNSUPPORTED Rust 9508:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_FLUSH_CRL: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 9509:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_FLUSH_CRL_FROM_CERT: windows_sys::core::PCSTR = 3i32 as _;

// UNSUPPORTED Rust 9510:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_FLUSH_CTL: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 9511:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_FLUSH_FRESHEST_CRL_FROM_CERT: windows_sys::core::PCSTR = 4i32 as _;

// UNSUPPORTED Rust 9512:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_FLUSH_FRESHEST_CRL_FROM_CRL: windows_sys::core::PCSTR = 5i32 as _;

// UNSUPPORTED Rust 9513:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_FLUSH_OBJECT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("TimeValidDllFlushObject");

// UNSUPPORTED Rust 9514:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_GET_CRL: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 9515:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_GET_CRL_FROM_CERT: windows_sys::core::PCSTR = 3i32 as _;

// UNSUPPORTED Rust 9516:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_GET_CTL: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 9517:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_GET_FRESHEST_CRL_FROM_CERT: windows_sys::core::PCSTR = 4i32 as _;

// UNSUPPORTED Rust 9518:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_GET_FRESHEST_CRL_FROM_CRL: windows_sys::core::PCSTR = 5i32 as _;

// UNSUPPORTED Rust 9519:1: non-scalar type Ptr unsupported
// pub const TIME_VALID_OID_GET_OBJECT_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("TimeValidDllGetObject");

public const val `TLS1_0_PROTOCOL_VERSION`: UInt = 769u;
public const val `TLS1_1_PROTOCOL_VERSION`: UInt = 770u;
public const val `TLS1_2_PROTOCOL_VERSION`: UInt = 771u;
public const val `TLS1_3_PROTOCOL_VERSION`: UInt = 772u;
public const val `TLS1_PROTOCOL_VERSION`: UInt = 769u;
public const val `TLS_AES_128_GCM_SHA256`: UInt = 4865u;
public const val `TLS_AES_256_GCM_SHA384`: UInt = 4866u;
public const val `TLS_DHE_DSS_EXPORT1024_WITH_DES_CBC_SHA`: UInt = 99u;
public const val `TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA`: UInt = 19u;
public const val `TLS_DHE_DSS_WITH_AES_128_CBC_SHA`: UInt = 50u;
public const val `TLS_DHE_DSS_WITH_AES_128_CBC_SHA256`: UInt = 64u;
public const val `TLS_DHE_DSS_WITH_AES_256_CBC_SHA`: UInt = 56u;
public const val `TLS_DHE_DSS_WITH_AES_256_CBC_SHA256`: UInt = 106u;
public const val `TLS_DHE_DSS_WITH_DES_CBC_SHA`: UInt = 18u;
public const val `TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA`: UInt = 22u;
public const val `TLS_DHE_RSA_WITH_AES_128_CBC_SHA`: UInt = 51u;
public const val `TLS_DHE_RSA_WITH_AES_128_GCM_SHA256`: UInt = 158u;
public const val `TLS_DHE_RSA_WITH_AES_256_CBC_SHA`: UInt = 57u;
public const val `TLS_DHE_RSA_WITH_AES_256_GCM_SHA384`: UInt = 159u;
public const val `TLS_ECC_P256_CURVE_KEY_TYPE`: UInt = 23u;
public const val `TLS_ECC_P384_CURVE_KEY_TYPE`: UInt = 24u;
public const val `TLS_ECC_P521_CURVE_KEY_TYPE`: UInt = 25u;
public const val `TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA`: UInt = 49161u;
public const val `TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256`: UInt = 49187u;
public const val `TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256`: UInt = 49195u;
public const val `TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA`: UInt = 49162u;
public const val `TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384`: UInt = 49188u;
public const val `TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384`: UInt = 49196u;
public const val `TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA`: UInt = 49171u;
public const val `TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256`: UInt = 49191u;
public const val `TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256`: UInt = 49199u;
public const val `TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA`: UInt = 49172u;
public const val `TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384`: UInt = 49192u;
public const val `TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384`: UInt = 49200u;
// UNSUPPORTED Rust 9554:1: non-scalar type Ptr unsupported
// pub const TLS_PSK_EXCHANGE: windows_sys::core::PCWSTR = windows_sys::core::w!("PSK");

public const val `TLS_PSK_WITH_AES_128_CBC_SHA256`: UInt = 174u;
public const val `TLS_PSK_WITH_AES_128_GCM_SHA256`: UInt = 168u;
public const val `TLS_PSK_WITH_AES_256_CBC_SHA384`: UInt = 175u;
public const val `TLS_PSK_WITH_AES_256_GCM_SHA384`: UInt = 169u;
public const val `TLS_PSK_WITH_NULL_SHA256`: UInt = 176u;
public const val `TLS_PSK_WITH_NULL_SHA384`: UInt = 177u;
public const val `TLS_RSA_EXPORT1024_WITH_DES_CBC_SHA`: UInt = 98u;
public const val `TLS_RSA_EXPORT1024_WITH_RC4_56_SHA`: UInt = 100u;
public const val `TLS_RSA_EXPORT_WITH_RC4_40_MD5`: UInt = 3u;
// UNSUPPORTED Rust 9564:1: non-scalar type Ptr unsupported
// pub const TLS_RSA_PSK_EXCHANGE: windows_sys::core::PCWSTR = windows_sys::core::w!("RSA_PSK");

public const val `TLS_RSA_WITH_3DES_EDE_CBC_SHA`: UInt = 10u;
public const val `TLS_RSA_WITH_AES_128_CBC_SHA`: UInt = 47u;
public const val `TLS_RSA_WITH_AES_128_CBC_SHA256`: UInt = 60u;
public const val `TLS_RSA_WITH_AES_128_GCM_SHA256`: UInt = 156u;
public const val `TLS_RSA_WITH_AES_256_CBC_SHA`: UInt = 53u;
public const val `TLS_RSA_WITH_AES_256_CBC_SHA256`: UInt = 61u;
public const val `TLS_RSA_WITH_AES_256_GCM_SHA384`: UInt = 157u;
public const val `TLS_RSA_WITH_DES_CBC_SHA`: UInt = 9u;
public const val `TLS_RSA_WITH_NULL_MD5`: UInt = 1u;
public const val `TLS_RSA_WITH_NULL_SHA`: UInt = 2u;
public const val `TLS_RSA_WITH_NULL_SHA256`: UInt = 59u;
public const val `TLS_RSA_WITH_RC4_128_MD5`: UInt = 4u;
public const val `TLS_RSA_WITH_RC4_128_SHA`: UInt = 5u;
// UNSUPPORTED Rust 9578:1: non-scalar type Ptr unsupported
// pub const TPM_RSA_SRK_SEAL_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("MICROSOFT_PCP_KSP_RSA_SEAL_KEY_3BD1C4BF-004E-4E2F-8A4D-0BF633DCB074");

// UNSUPPORTED Rust 9579:1: non-scalar type Ptr unsupported
// pub const URL_OID_CERTIFICATE_CRL_DIST_POINT: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 9580:1: non-scalar type Ptr unsupported
// pub const URL_OID_CERTIFICATE_CRL_DIST_POINT_AND_OCSP: windows_sys::core::PCSTR = 11i32 as _;

// UNSUPPORTED Rust 9581:1: non-scalar type Ptr unsupported
// pub const URL_OID_CERTIFICATE_FRESHEST_CRL: windows_sys::core::PCSTR = 6i32 as _;

// UNSUPPORTED Rust 9582:1: non-scalar type Ptr unsupported
// pub const URL_OID_CERTIFICATE_ISSUER: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 9583:1: non-scalar type Ptr unsupported
// pub const URL_OID_CERTIFICATE_OCSP: windows_sys::core::PCSTR = 9i32 as _;

// UNSUPPORTED Rust 9584:1: non-scalar type Ptr unsupported
// pub const URL_OID_CERTIFICATE_OCSP_AND_CRL_DIST_POINT: windows_sys::core::PCSTR = 10i32 as _;

// UNSUPPORTED Rust 9585:1: non-scalar type Ptr unsupported
// pub const URL_OID_CERTIFICATE_ONLY_OCSP: windows_sys::core::PCSTR = 13i32 as _;

// UNSUPPORTED Rust 9586:1: non-scalar type Ptr unsupported
// pub const URL_OID_CRL_FRESHEST_CRL: windows_sys::core::PCSTR = 7i32 as _;

// UNSUPPORTED Rust 9587:1: non-scalar type Ptr unsupported
// pub const URL_OID_CRL_ISSUER: windows_sys::core::PCSTR = 5i32 as _;

// UNSUPPORTED Rust 9588:1: non-scalar type Ptr unsupported
// pub const URL_OID_CROSS_CERT_DIST_POINT: windows_sys::core::PCSTR = 8i32 as _;

// UNSUPPORTED Rust 9589:1: non-scalar type Ptr unsupported
// pub const URL_OID_CROSS_CERT_SUBJECT_INFO_ACCESS: windows_sys::core::PCSTR = 12i32 as _;

// UNSUPPORTED Rust 9590:1: non-scalar type Ptr unsupported
// pub const URL_OID_CTL_ISSUER: windows_sys::core::PCSTR = 3i32 as _;

// UNSUPPORTED Rust 9591:1: non-scalar type Ptr unsupported
// pub const URL_OID_CTL_NEXT_UPDATE: windows_sys::core::PCSTR = 4i32 as _;

// UNSUPPORTED Rust 9592:1: non-scalar type Ptr unsupported
// pub const URL_OID_GET_OBJECT_URL_FUNC: windows_sys::core::PCSTR = windows_sys::core::s!("UrlDllGetObjectUrl");

public const val `USAGE_MATCH_TYPE_AND`: UInt = 0u;
public const val `USAGE_MATCH_TYPE_OR`: UInt = 1u;
public const val `UnblockOnlyPin`: `SECRET_PURPOSE` = 6;
public const val `UnknownAc`: `CARD_FILE_ACCESS_CONDITION` = 4;
public const val `UserCreateDeleteDirAc`: `CARD_DIRECTORY_ACCESS_CONDITION` = 1;
public const val `UserReadWriteAc`: `CARD_FILE_ACCESS_CONDITION` = 5;
public const val `UserWriteExecuteAc`: `CARD_FILE_ACCESS_CONDITION` = 2;
// UNSUPPORTED Rust 9600:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VTableProvStruc {
//     pub Version: u32,
//     pub FuncVerifyImage: CRYPT_VERIFY_IMAGE_A,
//     pub FuncReturnhWnd: CRYPT_RETURN_HWND,
//     pub dwProvType: u32,
//     pub pbContextInfo: *mut u8,
//     pub cbContextInfo: u32,
//     pub pszProvName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 9611:1: declaration Impl has no candidate rule
// impl Default for VTableProvStruc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9616:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VTableProvStrucW {
//     pub Version: u32,
//     pub FuncVerifyImage: CRYPT_VERIFY_IMAGE_W,
//     pub FuncReturnhWnd: CRYPT_RETURN_HWND,
//     pub dwProvType: u32,
//     pub pbContextInfo: *mut u8,
//     pub cbContextInfo: u32,
//     pub pszProvName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 9627:1: declaration Impl has no candidate rule
// impl Default for VTableProvStrucW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 9632:1: non-scalar type Ptr unsupported
// pub const X509_ALGORITHM_IDENTIFIER: windows_sys::core::PCSTR = 74i32 as _;

// UNSUPPORTED Rust 9633:1: non-scalar type Ptr unsupported
// pub const X509_ALTERNATE_NAME: windows_sys::core::PCSTR = 12i32 as _;

public const val `X509_ANY_STRING`: Int = 6;
public const val `X509_ASN_ENCODING`: `CERT_QUERY_ENCODING_TYPE` = 1u;
// UNSUPPORTED Rust 9636:1: non-scalar type Ptr unsupported
// pub const X509_AUTHORITY_INFO_ACCESS: windows_sys::core::PCSTR = 32i32 as _;

// UNSUPPORTED Rust 9637:1: non-scalar type Ptr unsupported
// pub const X509_AUTHORITY_KEY_ID: windows_sys::core::PCSTR = 9i32 as _;

// UNSUPPORTED Rust 9638:1: non-scalar type Ptr unsupported
// pub const X509_AUTHORITY_KEY_ID2: windows_sys::core::PCSTR = 31i32 as _;

// UNSUPPORTED Rust 9639:1: non-scalar type Ptr unsupported
// pub const X509_BASIC_CONSTRAINTS: windows_sys::core::PCSTR = 13i32 as _;

// UNSUPPORTED Rust 9640:1: non-scalar type Ptr unsupported
// pub const X509_BASIC_CONSTRAINTS2: windows_sys::core::PCSTR = 15i32 as _;

// UNSUPPORTED Rust 9641:1: non-scalar type Ptr unsupported
// pub const X509_BIOMETRIC_EXT: windows_sys::core::PCSTR = 71i32 as _;

// UNSUPPORTED Rust 9642:1: non-scalar type Ptr unsupported
// pub const X509_BITS: windows_sys::core::PCSTR = 26i32 as _;

// UNSUPPORTED Rust 9643:1: non-scalar type Ptr unsupported
// pub const X509_BITS_WITHOUT_TRAILING_ZEROES: windows_sys::core::PCSTR = 51i32 as _;

// UNSUPPORTED Rust 9644:1: non-scalar type Ptr unsupported
// pub const X509_CERT: windows_sys::core::PCSTR = 1i32 as _;

// UNSUPPORTED Rust 9645:1: non-scalar type Ptr unsupported
// pub const X509_CERTIFICATE_TEMPLATE: windows_sys::core::PCSTR = 64i32 as _;

// UNSUPPORTED Rust 9646:1: non-scalar type Ptr unsupported
// pub const X509_CERT_BUNDLE: windows_sys::core::PCSTR = 81i32 as _;

// UNSUPPORTED Rust 9647:1: non-scalar type Ptr unsupported
// pub const X509_CERT_CRL_TO_BE_SIGNED: windows_sys::core::PCSTR = 3i32 as _;

// UNSUPPORTED Rust 9648:1: non-scalar type Ptr unsupported
// pub const X509_CERT_PAIR: windows_sys::core::PCSTR = 53i32 as _;

// UNSUPPORTED Rust 9649:1: non-scalar type Ptr unsupported
// pub const X509_CERT_POLICIES: windows_sys::core::PCSTR = 16i32 as _;

// UNSUPPORTED Rust 9650:1: non-scalar type Ptr unsupported
// pub const X509_CERT_REQUEST_TO_BE_SIGNED: windows_sys::core::PCSTR = 4i32 as _;

// UNSUPPORTED Rust 9651:1: non-scalar type Ptr unsupported
// pub const X509_CERT_TO_BE_SIGNED: windows_sys::core::PCSTR = 2i32 as _;

// UNSUPPORTED Rust 9652:1: non-scalar type Ptr unsupported
// pub const X509_CHOICE_OF_TIME: windows_sys::core::PCSTR = 30i32 as _;

// UNSUPPORTED Rust 9653:1: non-scalar type Ptr unsupported
// pub const X509_CRL_DIST_POINTS: windows_sys::core::PCSTR = 35i32 as _;

public const val `X509_CRL_REASON_CODE`: Int = 29;
// UNSUPPORTED Rust 9655:1: non-scalar type Ptr unsupported
// pub const X509_CROSS_CERT_DIST_POINTS: windows_sys::core::PCSTR = 58i32 as _;

// UNSUPPORTED Rust 9656:1: non-scalar type Ptr unsupported
// pub const X509_DH_PARAMETERS: windows_sys::core::PCSTR = 47i32 as _;

public const val `X509_DH_PUBLICKEY`: Int = 38;
// UNSUPPORTED Rust 9658:1: non-scalar type Ptr unsupported
// pub const X509_DSS_PARAMETERS: windows_sys::core::PCSTR = 39i32 as _;

public const val `X509_DSS_PUBLICKEY`: Int = 38;
// UNSUPPORTED Rust 9660:1: non-scalar type Ptr unsupported
// pub const X509_DSS_SIGNATURE: windows_sys::core::PCSTR = 40i32 as _;

// UNSUPPORTED Rust 9661:1: non-scalar type Ptr unsupported
// pub const X509_ECC_PARAMETERS: windows_sys::core::PCSTR = 85i32 as _;

// UNSUPPORTED Rust 9662:1: non-scalar type Ptr unsupported
// pub const X509_ECC_PRIVATE_KEY: windows_sys::core::PCSTR = 82i32 as _;

// UNSUPPORTED Rust 9663:1: non-scalar type Ptr unsupported
// pub const X509_ECC_SIGNATURE: windows_sys::core::PCSTR = 47i32 as _;

// UNSUPPORTED Rust 9664:1: non-scalar type Ptr unsupported
// pub const X509_ENHANCED_KEY_USAGE: windows_sys::core::PCSTR = 36i32 as _;

// UNSUPPORTED Rust 9665:1: non-scalar type Ptr unsupported
// pub const X509_ENUMERATED: windows_sys::core::PCSTR = 29i32 as _;

// UNSUPPORTED Rust 9666:1: non-scalar type Ptr unsupported
// pub const X509_EXTENSIONS: windows_sys::core::PCSTR = 5i32 as _;

// UNSUPPORTED Rust 9667:1: non-scalar type Ptr unsupported
// pub const X509_INTEGER: windows_sys::core::PCSTR = 27i32 as _;

// UNSUPPORTED Rust 9668:1: non-scalar type Ptr unsupported
// pub const X509_ISSUING_DIST_POINT: windows_sys::core::PCSTR = 54i32 as _;

// UNSUPPORTED Rust 9669:1: non-scalar type Ptr unsupported
// pub const X509_KEYGEN_REQUEST_TO_BE_SIGNED: windows_sys::core::PCSTR = 21i32 as _;

// UNSUPPORTED Rust 9670:1: non-scalar type Ptr unsupported
// pub const X509_KEY_ATTRIBUTES: windows_sys::core::PCSTR = 10i32 as _;

// UNSUPPORTED Rust 9671:1: non-scalar type Ptr unsupported
// pub const X509_KEY_USAGE: windows_sys::core::PCSTR = 14i32 as _;

// UNSUPPORTED Rust 9672:1: non-scalar type Ptr unsupported
// pub const X509_KEY_USAGE_RESTRICTION: windows_sys::core::PCSTR = 11i32 as _;

// UNSUPPORTED Rust 9673:1: non-scalar type Ptr unsupported
// pub const X509_LOGOTYPE_EXT: windows_sys::core::PCSTR = 70i32 as _;

// UNSUPPORTED Rust 9674:1: non-scalar type Ptr unsupported
// pub const X509_MULTI_BYTE_INTEGER: windows_sys::core::PCSTR = 28i32 as _;

// UNSUPPORTED Rust 9675:1: non-scalar type Ptr unsupported
// pub const X509_MULTI_BYTE_UINT: windows_sys::core::PCSTR = 38i32 as _;

// UNSUPPORTED Rust 9676:1: non-scalar type Ptr unsupported
// pub const X509_NAME: windows_sys::core::PCSTR = 7i32 as _;

// UNSUPPORTED Rust 9677:1: non-scalar type Ptr unsupported
// pub const X509_NAME_CONSTRAINTS: windows_sys::core::PCSTR = 55i32 as _;

// UNSUPPORTED Rust 9678:1: non-scalar type Ptr unsupported
// pub const X509_NAME_VALUE: windows_sys::core::PCSTR = 6i32 as _;

public const val `X509_NDR_ENCODING`: UInt = 2u;
// UNSUPPORTED Rust 9680:1: non-scalar type Ptr unsupported
// pub const X509_OBJECT_IDENTIFIER: windows_sys::core::PCSTR = 73i32 as _;

// UNSUPPORTED Rust 9681:1: non-scalar type Ptr unsupported
// pub const X509_OCTET_STRING: windows_sys::core::PCSTR = 25i32 as _;

// UNSUPPORTED Rust 9682:1: non-scalar type Ptr unsupported
// pub const X509_PKIX_POLICY_QUALIFIER_USERNOTICE: windows_sys::core::PCSTR = 46i32 as _;

// UNSUPPORTED Rust 9683:1: non-scalar type Ptr unsupported
// pub const X509_POLICY_CONSTRAINTS: windows_sys::core::PCSTR = 57i32 as _;

// UNSUPPORTED Rust 9684:1: non-scalar type Ptr unsupported
// pub const X509_POLICY_MAPPINGS: windows_sys::core::PCSTR = 56i32 as _;

// UNSUPPORTED Rust 9685:1: non-scalar type Ptr unsupported
// pub const X509_PUBLIC_KEY_INFO: windows_sys::core::PCSTR = 8i32 as _;

// UNSUPPORTED Rust 9686:1: non-scalar type Ptr unsupported
// pub const X509_QC_STATEMENTS_EXT: windows_sys::core::PCSTR = 42i32 as _;

// UNSUPPORTED Rust 9687:1: non-scalar type Ptr unsupported
// pub const X509_SEQUENCE_OF_ANY: windows_sys::core::PCSTR = 34i32 as _;

// UNSUPPORTED Rust 9688:1: non-scalar type Ptr unsupported
// pub const X509_SUBJECT_DIR_ATTRS: windows_sys::core::PCSTR = 84i32 as _;

public const val `X509_SUBJECT_INFO_ACCESS`: Int = 32;
public const val `X509_UNICODE_ANY_STRING`: Int = 24;
// UNSUPPORTED Rust 9691:1: non-scalar type Ptr unsupported
// pub const X509_UNICODE_NAME: windows_sys::core::PCSTR = 20i32 as _;

// UNSUPPORTED Rust 9692:1: non-scalar type Ptr unsupported
// pub const X509_UNICODE_NAME_VALUE: windows_sys::core::PCSTR = 24i32 as _;

// UNSUPPORTED Rust 9693:1: non-scalar type Ptr unsupported
// pub const X942_DH_PARAMETERS: windows_sys::core::PCSTR = 50i32 as _;

// UNSUPPORTED Rust 9694:1: non-scalar type Ptr unsupported
// pub const X942_OTHER_INFO: windows_sys::core::PCSTR = 52i32 as _;

public const val `ZERO_PADDING`: UInt = 3u;
public const val `cPRIV_KEY_CACHE_MAX_ITEMS_DEFAULT`: UInt = 20u;
public const val `cPRIV_KEY_CACHE_PURGE_INTERVAL_SECONDS_DEFAULT`: UInt = 86400u;
public const val `dwFORCE_KEY_PROTECTION_DISABLED`: UInt = 0u;
public const val `dwFORCE_KEY_PROTECTION_HIGH`: UInt = 2u;
public const val `dwFORCE_KEY_PROTECTION_USER_SELECT`: UInt = 1u;
// UNSUPPORTED Rust 9701:1: non-scalar type Ptr unsupported
// pub const szBASE_CSP_DIR: windows_sys::core::PCSTR = windows_sys::core::s!("mscp");

// UNSUPPORTED Rust 9702:1: non-scalar type Ptr unsupported
// pub const szCACHE_FILE: windows_sys::core::PCSTR = windows_sys::core::s!("cardcf");

// UNSUPPORTED Rust 9703:1: non-scalar type Ptr unsupported
// pub const szCARD_IDENTIFIER_FILE: windows_sys::core::PCSTR = windows_sys::core::s!("cardid");

// UNSUPPORTED Rust 9704:1: non-scalar type Ptr unsupported
// pub const szCONTAINER_MAP_FILE: windows_sys::core::PCSTR = windows_sys::core::s!("cmapfile");

// UNSUPPORTED Rust 9705:1: non-scalar type Ptr unsupported
// pub const szFORCE_KEY_PROTECTION: windows_sys::core::PCSTR = windows_sys::core::s!("ForceKeyProtection");

// UNSUPPORTED Rust 9706:1: non-scalar type Ptr unsupported
// pub const szINTERMEDIATE_CERTS_DIR: windows_sys::core::PCSTR = windows_sys::core::s!("mscerts");

// UNSUPPORTED Rust 9707:1: non-scalar type Ptr unsupported
// pub const szKEY_CACHE_ENABLED: windows_sys::core::PCSTR = windows_sys::core::s!("CachePrivateKeys");

// UNSUPPORTED Rust 9708:1: non-scalar type Ptr unsupported
// pub const szKEY_CACHE_SECONDS: windows_sys::core::PCSTR = windows_sys::core::s!("PrivateKeyLifetimeSeconds");

// UNSUPPORTED Rust 9709:1: non-scalar type Ptr unsupported
// pub const szKEY_CRYPTOAPI_PRIVATE_KEY_OPTIONS: windows_sys::core::PCSTR = windows_sys::core::s!("Software\\Policies\\Microsoft\\Cryptography");

// UNSUPPORTED Rust 9710:1: non-scalar type Ptr unsupported
// pub const szOIDVerisign_FailInfo: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.9.4");

// UNSUPPORTED Rust 9711:1: non-scalar type Ptr unsupported
// pub const szOIDVerisign_MessageType: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.9.2");

// UNSUPPORTED Rust 9712:1: non-scalar type Ptr unsupported
// pub const szOIDVerisign_PkiStatus: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.9.3");

// UNSUPPORTED Rust 9713:1: non-scalar type Ptr unsupported
// pub const szOIDVerisign_RecipientNonce: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.9.6");

// UNSUPPORTED Rust 9714:1: non-scalar type Ptr unsupported
// pub const szOIDVerisign_SenderNonce: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.9.5");

// UNSUPPORTED Rust 9715:1: non-scalar type Ptr unsupported
// pub const szOIDVerisign_TransactionID: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.9.7");

// UNSUPPORTED Rust 9716:1: non-scalar type Ptr unsupported
// pub const szOID_ANSI_X942: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10046");

// UNSUPPORTED Rust 9717:1: non-scalar type Ptr unsupported
// pub const szOID_ANSI_X942_DH: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10046.2.1");

// UNSUPPORTED Rust 9718:1: non-scalar type Ptr unsupported
// pub const szOID_ANY_APPLICATION_POLICY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.12.1");

// UNSUPPORTED Rust 9719:1: non-scalar type Ptr unsupported
// pub const szOID_ANY_CERT_POLICY: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.32.0");

// UNSUPPORTED Rust 9720:1: non-scalar type Ptr unsupported
// pub const szOID_ANY_ENHANCED_KEY_USAGE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.37.0");

// UNSUPPORTED Rust 9721:1: non-scalar type Ptr unsupported
// pub const szOID_APPLICATION_CERT_POLICIES: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.10");

// UNSUPPORTED Rust 9722:1: non-scalar type Ptr unsupported
// pub const szOID_APPLICATION_POLICY_CONSTRAINTS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.12");

// UNSUPPORTED Rust 9723:1: non-scalar type Ptr unsupported
// pub const szOID_APPLICATION_POLICY_MAPPINGS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.11");

// UNSUPPORTED Rust 9724:1: non-scalar type Ptr unsupported
// pub const szOID_ARCHIVED_KEY_ATTR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.13");

// UNSUPPORTED Rust 9725:1: non-scalar type Ptr unsupported
// pub const szOID_ARCHIVED_KEY_CERT_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.16");

// UNSUPPORTED Rust 9726:1: non-scalar type Ptr unsupported
// pub const szOID_ATTEST_WHQL_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.5.1");

// UNSUPPORTED Rust 9727:1: non-scalar type Ptr unsupported
// pub const szOID_ATTR_PLATFORM_SPECIFICATION: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.17");

// UNSUPPORTED Rust 9728:1: non-scalar type Ptr unsupported
// pub const szOID_ATTR_SUPPORTED_ALGORITHMS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.52");

// UNSUPPORTED Rust 9729:1: non-scalar type Ptr unsupported
// pub const szOID_ATTR_TPM_SECURITY_ASSERTIONS: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.18");

// UNSUPPORTED Rust 9730:1: non-scalar type Ptr unsupported
// pub const szOID_ATTR_TPM_SPECIFICATION: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.16");

// UNSUPPORTED Rust 9731:1: non-scalar type Ptr unsupported
// pub const szOID_AUTHORITY_INFO_ACCESS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.1.1");

// UNSUPPORTED Rust 9732:1: non-scalar type Ptr unsupported
// pub const szOID_AUTHORITY_KEY_IDENTIFIER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.1");

// UNSUPPORTED Rust 9733:1: non-scalar type Ptr unsupported
// pub const szOID_AUTHORITY_KEY_IDENTIFIER2: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.35");

// UNSUPPORTED Rust 9734:1: non-scalar type Ptr unsupported
// pub const szOID_AUTHORITY_REVOCATION_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.38");

// UNSUPPORTED Rust 9735:1: non-scalar type Ptr unsupported
// pub const szOID_AUTO_ENROLL_CTL_USAGE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.20.1");

// UNSUPPORTED Rust 9736:1: non-scalar type Ptr unsupported
// pub const szOID_BACKGROUND_OTHER_LOGOTYPE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.20.2");

// UNSUPPORTED Rust 9737:1: non-scalar type Ptr unsupported
// pub const szOID_BASIC_CONSTRAINTS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.10");

// UNSUPPORTED Rust 9738:1: non-scalar type Ptr unsupported
// pub const szOID_BASIC_CONSTRAINTS2: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.19");

// UNSUPPORTED Rust 9739:1: non-scalar type Ptr unsupported
// pub const szOID_BIOMETRIC_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.1.2");

// UNSUPPORTED Rust 9740:1: non-scalar type Ptr unsupported
// pub const szOID_BIOMETRIC_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.41");

// UNSUPPORTED Rust 9741:1: non-scalar type Ptr unsupported
// pub const szOID_BUSINESS_CATEGORY: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.15");

// UNSUPPORTED Rust 9742:1: non-scalar type Ptr unsupported
// pub const szOID_CA_CERTIFICATE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.37");

// UNSUPPORTED Rust 9743:1: non-scalar type Ptr unsupported
// pub const szOID_CERTIFICATE_REVOCATION_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.39");

// UNSUPPORTED Rust 9744:1: non-scalar type Ptr unsupported
// pub const szOID_CERTIFICATE_TEMPLATE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.7");

// UNSUPPORTED Rust 9745:1: non-scalar type Ptr unsupported
// pub const szOID_CERTSRV_CA_VERSION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.1");

// UNSUPPORTED Rust 9746:1: non-scalar type Ptr unsupported
// pub const szOID_CERTSRV_CROSSCA_VERSION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.22");

// UNSUPPORTED Rust 9747:1: non-scalar type Ptr unsupported
// pub const szOID_CERTSRV_PREVIOUS_CERT_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.2");

// UNSUPPORTED Rust 9748:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_DISALLOWED_CA_FILETIME_PROP_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.128");

// UNSUPPORTED Rust 9749:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_DISALLOWED_FILETIME_PROP_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.104");

// UNSUPPORTED Rust 9750:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_EXTENSIONS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.2.1.14");

// UNSUPPORTED Rust 9751:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.28");

// UNSUPPORTED Rust 9752:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_KEY_IDENTIFIER_PROP_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.20");

// UNSUPPORTED Rust 9753:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_MANIFOLD: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.20.3");

// UNSUPPORTED Rust 9754:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_MD5_HASH_PROP_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.4");

// UNSUPPORTED Rust 9755:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_POLICIES: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.32");

// UNSUPPORTED Rust 9756:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_POLICIES_95: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.3");

// UNSUPPORTED Rust 9757:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_POLICIES_95_QUALIFIER1: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.7.1.1");

// UNSUPPORTED Rust 9758:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_PROP_ID_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.");

// UNSUPPORTED Rust 9759:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_SIGNATURE_HASH_PROP_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.15");

// UNSUPPORTED Rust 9760:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_STRONG_KEY_OS_1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.72.2.1");

// UNSUPPORTED Rust 9761:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_STRONG_KEY_OS_CURRENT: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.6.1.4.1.311.72.2.1");

// UNSUPPORTED Rust 9762:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_STRONG_KEY_OS_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.72.2.");

// UNSUPPORTED Rust 9763:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_STRONG_SIGN_OS_1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.72.1.1");

// UNSUPPORTED Rust 9764:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_STRONG_SIGN_OS_CURRENT: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.6.1.4.1.311.72.1.1");

// UNSUPPORTED Rust 9765:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_STRONG_SIGN_OS_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.72.1.");

// UNSUPPORTED Rust 9766:1: non-scalar type Ptr unsupported
// pub const szOID_CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.11.29");

// UNSUPPORTED Rust 9767:1: non-scalar type Ptr unsupported
// pub const szOID_CMC: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7");

// UNSUPPORTED Rust 9768:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_ADD_ATTRIBUTES: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.10.1");

// UNSUPPORTED Rust 9769:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_ADD_EXTENSIONS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.8");

// UNSUPPORTED Rust 9770:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_DATA_RETURN: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.4");

// UNSUPPORTED Rust 9771:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_DECRYPTED_POP: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.10");

// UNSUPPORTED Rust 9772:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_ENCRYPTED_POP: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.9");

// UNSUPPORTED Rust 9773:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_GET_CERT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.15");

// UNSUPPORTED Rust 9774:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_GET_CRL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.16");

// UNSUPPORTED Rust 9775:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_IDENTIFICATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.2");

// UNSUPPORTED Rust 9776:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_IDENTITY_PROOF: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.3");

// UNSUPPORTED Rust 9777:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_ID_CONFIRM_CERT_ACCEPTANCE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.24");

// UNSUPPORTED Rust 9778:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_ID_POP_LINK_RANDOM: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.22");

// UNSUPPORTED Rust 9779:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_ID_POP_LINK_WITNESS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.23");

// UNSUPPORTED Rust 9780:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_LRA_POP_WITNESS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.11");

// UNSUPPORTED Rust 9781:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_QUERY_PENDING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.21");

// UNSUPPORTED Rust 9782:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_RECIPIENT_NONCE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.7");

// UNSUPPORTED Rust 9783:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_REG_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.18");

// UNSUPPORTED Rust 9784:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_RESPONSE_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.19");

// UNSUPPORTED Rust 9785:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_REVOKE_REQUEST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.17");

// UNSUPPORTED Rust 9786:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_SENDER_NONCE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.6");

// UNSUPPORTED Rust 9787:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_STATUS_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.1");

// UNSUPPORTED Rust 9788:1: non-scalar type Ptr unsupported
// pub const szOID_CMC_TRANSACTION_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.7.5");

// UNSUPPORTED Rust 9789:1: non-scalar type Ptr unsupported
// pub const szOID_CN_ECDSA_SHA256: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.156.11235.1.1.1");

// UNSUPPORTED Rust 9790:1: non-scalar type Ptr unsupported
// pub const szOID_COMMON_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.3");

// UNSUPPORTED Rust 9791:1: non-scalar type Ptr unsupported
// pub const szOID_COUNTRY_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.6");

// UNSUPPORTED Rust 9792:1: non-scalar type Ptr unsupported
// pub const szOID_CRL_DIST_POINTS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.31");

// UNSUPPORTED Rust 9793:1: non-scalar type Ptr unsupported
// pub const szOID_CRL_NEXT_PUBLISH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.4");

// UNSUPPORTED Rust 9794:1: non-scalar type Ptr unsupported
// pub const szOID_CRL_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.20");

// UNSUPPORTED Rust 9795:1: non-scalar type Ptr unsupported
// pub const szOID_CRL_REASON_CODE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.21");

// UNSUPPORTED Rust 9796:1: non-scalar type Ptr unsupported
// pub const szOID_CRL_SELF_CDP: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.14");

// UNSUPPORTED Rust 9797:1: non-scalar type Ptr unsupported
// pub const szOID_CRL_VIRTUAL_BASE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.3");

// UNSUPPORTED Rust 9798:1: non-scalar type Ptr unsupported
// pub const szOID_CROSS_CERTIFICATE_PAIR: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.40");

// UNSUPPORTED Rust 9799:1: non-scalar type Ptr unsupported
// pub const szOID_CROSS_CERT_DIST_POINTS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.9.1");

// UNSUPPORTED Rust 9800:1: non-scalar type Ptr unsupported
// pub const szOID_CTL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.1");

// UNSUPPORTED Rust 9801:1: non-scalar type Ptr unsupported
// pub const szOID_CT_CERT_SCTLIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.11129.2.4.2");

// UNSUPPORTED Rust 9802:1: non-scalar type Ptr unsupported
// pub const szOID_CT_PKI_DATA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.12.2");

// UNSUPPORTED Rust 9803:1: non-scalar type Ptr unsupported
// pub const szOID_CT_PKI_RESPONSE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.12.3");

// UNSUPPORTED Rust 9804:1: non-scalar type Ptr unsupported
// pub const szOID_DELTA_CRL_INDICATOR: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.27");

// UNSUPPORTED Rust 9805:1: non-scalar type Ptr unsupported
// pub const szOID_DESCRIPTION: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.13");

// UNSUPPORTED Rust 9806:1: non-scalar type Ptr unsupported
// pub const szOID_DESTINATION_INDICATOR: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.27");

// UNSUPPORTED Rust 9807:1: non-scalar type Ptr unsupported
// pub const szOID_DEVICE_SERIAL_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.5");

// UNSUPPORTED Rust 9808:1: non-scalar type Ptr unsupported
// pub const szOID_DH_SINGLE_PASS_STDDH_SHA1_KDF: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.133.16.840.63.0.2");

// UNSUPPORTED Rust 9809:1: non-scalar type Ptr unsupported
// pub const szOID_DH_SINGLE_PASS_STDDH_SHA256_KDF: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.1.11.1");

// UNSUPPORTED Rust 9810:1: non-scalar type Ptr unsupported
// pub const szOID_DH_SINGLE_PASS_STDDH_SHA384_KDF: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.1.11.2");

// UNSUPPORTED Rust 9811:1: non-scalar type Ptr unsupported
// pub const szOID_DISALLOWED_HASH: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.6.1.4.1.311.10.11.15");

// UNSUPPORTED Rust 9812:1: non-scalar type Ptr unsupported
// pub const szOID_DISALLOWED_LIST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.30");

// UNSUPPORTED Rust 9813:1: non-scalar type Ptr unsupported
// pub const szOID_DN_QUALIFIER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.46");

// UNSUPPORTED Rust 9814:1: non-scalar type Ptr unsupported
// pub const szOID_DOMAIN_COMPONENT: windows_sys::core::PCSTR = windows_sys::core::s!("0.9.2342.19200300.100.1.25");

// UNSUPPORTED Rust 9815:1: non-scalar type Ptr unsupported
// pub const szOID_DRM: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.5.1");

// UNSUPPORTED Rust 9816:1: non-scalar type Ptr unsupported
// pub const szOID_DRM_INDIVIDUALIZATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.5.2");

// UNSUPPORTED Rust 9817:1: non-scalar type Ptr unsupported
// pub const szOID_DS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5");

// UNSUPPORTED Rust 9818:1: non-scalar type Ptr unsupported
// pub const szOID_DSALG: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.8");

// UNSUPPORTED Rust 9819:1: non-scalar type Ptr unsupported
// pub const szOID_DSALG_CRPT: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.8.1");

// UNSUPPORTED Rust 9820:1: non-scalar type Ptr unsupported
// pub const szOID_DSALG_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.8.2");

// UNSUPPORTED Rust 9821:1: non-scalar type Ptr unsupported
// pub const szOID_DSALG_RSA: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.8.1.1");

// UNSUPPORTED Rust 9822:1: non-scalar type Ptr unsupported
// pub const szOID_DSALG_SIGN: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.8.3");

// UNSUPPORTED Rust 9823:1: non-scalar type Ptr unsupported
// pub const szOID_DS_EMAIL_REPLICATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.19");

// UNSUPPORTED Rust 9824:1: non-scalar type Ptr unsupported
// pub const szOID_DYNAMIC_CODE_GEN_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.76.5.1");

// UNSUPPORTED Rust 9825:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP160R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.1");

// UNSUPPORTED Rust 9826:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP160T1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.2");

// UNSUPPORTED Rust 9827:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP192R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.3");

// UNSUPPORTED Rust 9828:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP192T1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.4");

// UNSUPPORTED Rust 9829:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP224R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.5");

// UNSUPPORTED Rust 9830:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP224T1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.6");

// UNSUPPORTED Rust 9831:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP256R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.7");

// UNSUPPORTED Rust 9832:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP256T1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.8");

// UNSUPPORTED Rust 9833:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP320R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.9");

// UNSUPPORTED Rust 9834:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP320T1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.10");

// UNSUPPORTED Rust 9835:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP384R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.11");

// UNSUPPORTED Rust 9836:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP384T1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.12");

// UNSUPPORTED Rust 9837:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP512R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.13");

// UNSUPPORTED Rust 9838:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_BRAINPOOLP512T1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.36.3.3.2.8.1.1.14");

// UNSUPPORTED Rust 9839:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_EC192WAPI: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.156.11235.1.1.2.1");

// UNSUPPORTED Rust 9840:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_NISTP192: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.1");

// UNSUPPORTED Rust 9841:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_NISTP224: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.33");

// UNSUPPORTED Rust 9842:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_NISTP256: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.10045.3.1.7");

// UNSUPPORTED Rust 9843:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_NISTP384: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.132.0.34");

// UNSUPPORTED Rust 9844:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_NISTP521: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.132.0.35");

// UNSUPPORTED Rust 9845:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_P256: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.7");

// UNSUPPORTED Rust 9846:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_P384: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.34");

// UNSUPPORTED Rust 9847:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_P521: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.35");

// UNSUPPORTED Rust 9848:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP160K1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.9");

// UNSUPPORTED Rust 9849:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP160R1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.8");

// UNSUPPORTED Rust 9850:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP160R2: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.30");

// UNSUPPORTED Rust 9851:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP192K1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.31");

// UNSUPPORTED Rust 9852:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP192R1: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.10045.3.1.1");

// UNSUPPORTED Rust 9853:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP224K1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.32");

// UNSUPPORTED Rust 9854:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP224R1: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.132.0.33");

// UNSUPPORTED Rust 9855:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP256K1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.132.0.10");

// UNSUPPORTED Rust 9856:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP256R1: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.10045.3.1.7");

// UNSUPPORTED Rust 9857:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP384R1: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.132.0.34");

// UNSUPPORTED Rust 9858:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_SECP521R1: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.132.0.35");

// UNSUPPORTED Rust 9859:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_WTLS12: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.132.0.33");

// UNSUPPORTED Rust 9860:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_WTLS7: windows_sys::core::PCWSTR = windows_sys::core::w!("1.3.132.0.30");

// UNSUPPORTED Rust 9861:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_WTLS9: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.43.1.4.9");

// UNSUPPORTED Rust 9862:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_X962P192V1: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.1");

// UNSUPPORTED Rust 9863:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_X962P192V2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.2");

// UNSUPPORTED Rust 9864:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_X962P192V3: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.3");

// UNSUPPORTED Rust 9865:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_X962P239V1: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.4");

// UNSUPPORTED Rust 9866:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_X962P239V2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.5");

// UNSUPPORTED Rust 9867:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_X962P239V3: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.3.1.6");

// UNSUPPORTED Rust 9868:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_CURVE_X962P256V1: windows_sys::core::PCWSTR = windows_sys::core::w!("1.2.840.10045.3.1.7");

// UNSUPPORTED Rust 9869:1: non-scalar type Ptr unsupported
// pub const szOID_ECC_PUBLIC_KEY: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.2.1");

// UNSUPPORTED Rust 9870:1: non-scalar type Ptr unsupported
// pub const szOID_ECDSA_SHA1: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.4.1");

// UNSUPPORTED Rust 9871:1: non-scalar type Ptr unsupported
// pub const szOID_ECDSA_SHA256: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.4.3.2");

// UNSUPPORTED Rust 9872:1: non-scalar type Ptr unsupported
// pub const szOID_ECDSA_SHA384: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.4.3.3");

// UNSUPPORTED Rust 9873:1: non-scalar type Ptr unsupported
// pub const szOID_ECDSA_SHA512: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.4.3.4");

// UNSUPPORTED Rust 9874:1: non-scalar type Ptr unsupported
// pub const szOID_ECDSA_SPECIFIED: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10045.4.3");

// UNSUPPORTED Rust 9875:1: non-scalar type Ptr unsupported
// pub const szOID_EFS_RECOVERY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.4.1");

// UNSUPPORTED Rust 9876:1: non-scalar type Ptr unsupported
// pub const szOID_EMBEDDED_NT_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.8");

// UNSUPPORTED Rust 9877:1: non-scalar type Ptr unsupported
// pub const szOID_ENCLAVE_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.42");

// UNSUPPORTED Rust 9878:1: non-scalar type Ptr unsupported
// pub const szOID_ENCRYPTED_KEY_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.21");

// UNSUPPORTED Rust 9879:1: non-scalar type Ptr unsupported
// pub const szOID_ENHANCED_KEY_USAGE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.37");

// UNSUPPORTED Rust 9880:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLLMENT_AGENT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.20.2.1");

// UNSUPPORTED Rust 9881:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLLMENT_CSP_PROVIDER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.13.2.2");

// UNSUPPORTED Rust 9882:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLLMENT_NAME_VALUE_PAIR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.13.2.1");

// UNSUPPORTED Rust 9883:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_AIK_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.39");

// UNSUPPORTED Rust 9884:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_ATTESTATION_CHALLENGE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.28");

// UNSUPPORTED Rust 9885:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_ATTESTATION_STATEMENT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.24");

// UNSUPPORTED Rust 9886:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_CAXCHGCERT_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.27");

// UNSUPPORTED Rust 9887:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_CERTTYPE_EXTENSION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.20.2");

// UNSUPPORTED Rust 9888:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_EKPUB_CHALLENGE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.26");

// UNSUPPORTED Rust 9889:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_EKVERIFYCERT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.31");

// UNSUPPORTED Rust 9890:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_EKVERIFYCREDS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.32");

// UNSUPPORTED Rust 9891:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_EKVERIFYKEY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.30");

// UNSUPPORTED Rust 9892:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_EK_CA_KEYID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.43");

// UNSUPPORTED Rust 9893:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_EK_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.23");

// UNSUPPORTED Rust 9894:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_ENCRYPTION_ALGORITHM: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.29");

// UNSUPPORTED Rust 9895:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_KEY_AFFINITY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.41");

// UNSUPPORTED Rust 9896:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_KSP_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.25");

// UNSUPPORTED Rust 9897:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_SCEP_CHALLENGE_ANSWER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.35");

// UNSUPPORTED Rust 9898:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_SCEP_CLIENT_REQUEST: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.37");

// UNSUPPORTED Rust 9899:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_SCEP_ERROR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.33");

// UNSUPPORTED Rust 9900:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_SCEP_SERVER_MESSAGE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.38");

// UNSUPPORTED Rust 9901:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_SCEP_SERVER_SECRET: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.40");

// UNSUPPORTED Rust 9902:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_SCEP_SERVER_STATE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.34");

// UNSUPPORTED Rust 9903:1: non-scalar type Ptr unsupported
// pub const szOID_ENROLL_SCEP_SIGNER_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.42");

// UNSUPPORTED Rust 9904:1: non-scalar type Ptr unsupported
// pub const szOID_ENTERPRISE_OID_ROOT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.8");

// UNSUPPORTED Rust 9905:1: non-scalar type Ptr unsupported
// pub const szOID_EV_RDN_COUNTRY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.60.2.1.3");

// UNSUPPORTED Rust 9906:1: non-scalar type Ptr unsupported
// pub const szOID_EV_RDN_LOCALE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.60.2.1.1");

// UNSUPPORTED Rust 9907:1: non-scalar type Ptr unsupported
// pub const szOID_EV_RDN_STATE_OR_PROVINCE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.60.2.1.2");

// UNSUPPORTED Rust 9908:1: non-scalar type Ptr unsupported
// pub const szOID_EV_WHQL_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.39");

// UNSUPPORTED Rust 9909:1: non-scalar type Ptr unsupported
// pub const szOID_FACSIMILE_TELEPHONE_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.23");

// UNSUPPORTED Rust 9910:1: non-scalar type Ptr unsupported
// pub const szOID_FRESHEST_CRL: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.46");

// UNSUPPORTED Rust 9911:1: non-scalar type Ptr unsupported
// pub const szOID_GIVEN_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.42");

// UNSUPPORTED Rust 9912:1: non-scalar type Ptr unsupported
// pub const szOID_HPKP_DOMAIN_NAME_CTL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.60");

// UNSUPPORTED Rust 9913:1: non-scalar type Ptr unsupported
// pub const szOID_HPKP_HEADER_VALUE_CTL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.61");

// UNSUPPORTED Rust 9914:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1");

// UNSUPPORTED Rust 9915:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_SuiteAConfidentiality: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.14");

// UNSUPPORTED Rust 9916:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_SuiteAIntegrity: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.15");

// UNSUPPORTED Rust 9917:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_SuiteAKMandSig: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.18");

// UNSUPPORTED Rust 9918:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_SuiteAKeyManagement: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.17");

// UNSUPPORTED Rust 9919:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_SuiteASignature: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.13");

// UNSUPPORTED Rust 9920:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_SuiteATokenProtection: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.16");

// UNSUPPORTED Rust 9921:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicConfidentiality: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.4");

// UNSUPPORTED Rust 9922:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicIntegrity: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.6");

// UNSUPPORTED Rust 9923:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicKMandSig: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.12");

// UNSUPPORTED Rust 9924:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicKMandUpdSig: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.20");

// UNSUPPORTED Rust 9925:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicKeyManagement: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.10");

// UNSUPPORTED Rust 9926:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicSignature: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.2");

// UNSUPPORTED Rust 9927:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicTokenProtection: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.8");

// UNSUPPORTED Rust 9928:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicUpdatedInteg: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.21");

// UNSUPPORTED Rust 9929:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_mosaicUpdatedSig: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.19");

// UNSUPPORTED Rust 9930:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_sdnsConfidentiality: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.3");

// UNSUPPORTED Rust 9931:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_sdnsIntegrity: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.5");

// UNSUPPORTED Rust 9932:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_sdnsKMandSig: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.11");

// UNSUPPORTED Rust 9933:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_sdnsKeyManagement: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.9");

// UNSUPPORTED Rust 9934:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_sdnsSignature: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.1");

// UNSUPPORTED Rust 9935:1: non-scalar type Ptr unsupported
// pub const szOID_INFOSEC_sdnsTokenProtection: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.2.1.1.7");

// UNSUPPORTED Rust 9936:1: non-scalar type Ptr unsupported
// pub const szOID_INHIBIT_ANY_POLICY: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.54");

// UNSUPPORTED Rust 9937:1: non-scalar type Ptr unsupported
// pub const szOID_INITIALS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.43");

// UNSUPPORTED Rust 9938:1: non-scalar type Ptr unsupported
// pub const szOID_INTERNATIONALIZED_EMAIL_ADDRESS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.20.2.4");

// UNSUPPORTED Rust 9939:1: non-scalar type Ptr unsupported
// pub const szOID_INTERNATIONAL_ISDN_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.25");

// UNSUPPORTED Rust 9940:1: non-scalar type Ptr unsupported
// pub const szOID_IPSEC_KP_IKE_INTERMEDIATE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.8.2.2");

// UNSUPPORTED Rust 9941:1: non-scalar type Ptr unsupported
// pub const szOID_ISSUED_CERT_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.17");

// UNSUPPORTED Rust 9942:1: non-scalar type Ptr unsupported
// pub const szOID_ISSUER_ALT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.8");

// UNSUPPORTED Rust 9943:1: non-scalar type Ptr unsupported
// pub const szOID_ISSUER_ALT_NAME2: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.18");

// UNSUPPORTED Rust 9944:1: non-scalar type Ptr unsupported
// pub const szOID_ISSUING_DIST_POINT: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.28");

// UNSUPPORTED Rust 9945:1: non-scalar type Ptr unsupported
// pub const szOID_IUM_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.37");

// UNSUPPORTED Rust 9946:1: non-scalar type Ptr unsupported
// pub const szOID_KEYID_RDN: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.7.1");

// UNSUPPORTED Rust 9947:1: non-scalar type Ptr unsupported
// pub const szOID_KEY_ATTRIBUTES: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.2");

// UNSUPPORTED Rust 9948:1: non-scalar type Ptr unsupported
// pub const szOID_KEY_USAGE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.15");

// UNSUPPORTED Rust 9949:1: non-scalar type Ptr unsupported
// pub const szOID_KEY_USAGE_RESTRICTION: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.4");

// UNSUPPORTED Rust 9950:1: non-scalar type Ptr unsupported
// pub const szOID_KP_CA_EXCHANGE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.5");

// UNSUPPORTED Rust 9951:1: non-scalar type Ptr unsupported
// pub const szOID_KP_CSP_SIGNATURE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.16");

// UNSUPPORTED Rust 9952:1: non-scalar type Ptr unsupported
// pub const szOID_KP_CTL_USAGE_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.1");

// UNSUPPORTED Rust 9953:1: non-scalar type Ptr unsupported
// pub const szOID_KP_DOCUMENT_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.12");

// UNSUPPORTED Rust 9954:1: non-scalar type Ptr unsupported
// pub const szOID_KP_EFS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.4");

// UNSUPPORTED Rust 9955:1: non-scalar type Ptr unsupported
// pub const szOID_KP_FLIGHT_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.27");

// UNSUPPORTED Rust 9956:1: non-scalar type Ptr unsupported
// pub const szOID_KP_KERNEL_MODE_CODE_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.61.1.1");

// UNSUPPORTED Rust 9957:1: non-scalar type Ptr unsupported
// pub const szOID_KP_KERNEL_MODE_HAL_EXTENSION_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.61.5.1");

// UNSUPPORTED Rust 9958:1: non-scalar type Ptr unsupported
// pub const szOID_KP_KERNEL_MODE_TRUSTED_BOOT_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.61.4.1");

// UNSUPPORTED Rust 9959:1: non-scalar type Ptr unsupported
// pub const szOID_KP_KEY_RECOVERY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.11");

// UNSUPPORTED Rust 9960:1: non-scalar type Ptr unsupported
// pub const szOID_KP_KEY_RECOVERY_AGENT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.6");

// UNSUPPORTED Rust 9961:1: non-scalar type Ptr unsupported
// pub const szOID_KP_LIFETIME_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.13");

// UNSUPPORTED Rust 9962:1: non-scalar type Ptr unsupported
// pub const szOID_KP_MOBILE_DEVICE_SOFTWARE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.14");

// UNSUPPORTED Rust 9963:1: non-scalar type Ptr unsupported
// pub const szOID_KP_PRIVACY_CA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.36");

// UNSUPPORTED Rust 9964:1: non-scalar type Ptr unsupported
// pub const szOID_KP_QUALIFIED_SUBORDINATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.10");

// UNSUPPORTED Rust 9965:1: non-scalar type Ptr unsupported
// pub const szOID_KP_SMARTCARD_LOGON: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.20.2.2");

// UNSUPPORTED Rust 9966:1: non-scalar type Ptr unsupported
// pub const szOID_KP_SMART_DISPLAY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.15");

// UNSUPPORTED Rust 9967:1: non-scalar type Ptr unsupported
// pub const szOID_KP_TIME_STAMP_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.2");

// UNSUPPORTED Rust 9968:1: non-scalar type Ptr unsupported
// pub const szOID_KP_TPM_AIK_CERTIFICATE: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.8.3");

// UNSUPPORTED Rust 9969:1: non-scalar type Ptr unsupported
// pub const szOID_KP_TPM_EK_CERTIFICATE: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.8.1");

// UNSUPPORTED Rust 9970:1: non-scalar type Ptr unsupported
// pub const szOID_KP_TPM_PLATFORM_CERTIFICATE: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.8.2");

// UNSUPPORTED Rust 9971:1: non-scalar type Ptr unsupported
// pub const szOID_LEGACY_POLICY_MAPPINGS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.5");

// UNSUPPORTED Rust 9972:1: non-scalar type Ptr unsupported
// pub const szOID_LICENSES: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.6.1");

// UNSUPPORTED Rust 9973:1: non-scalar type Ptr unsupported
// pub const szOID_LICENSE_SERVER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.6.2");

// UNSUPPORTED Rust 9974:1: non-scalar type Ptr unsupported
// pub const szOID_LOCALITY_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.7");

// UNSUPPORTED Rust 9975:1: non-scalar type Ptr unsupported
// pub const szOID_LOCAL_MACHINE_KEYSET: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.17.2");

// UNSUPPORTED Rust 9976:1: non-scalar type Ptr unsupported
// pub const szOID_LOGOTYPE_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.1.12");

// UNSUPPORTED Rust 9977:1: non-scalar type Ptr unsupported
// pub const szOID_LOYALTY_OTHER_LOGOTYPE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.20.1");

// UNSUPPORTED Rust 9978:1: non-scalar type Ptr unsupported
// pub const szOID_MEMBER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.31");

// UNSUPPORTED Rust 9979:1: non-scalar type Ptr unsupported
// pub const szOID_MICROSOFT_PUBLISHER_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.76.8.1");

// UNSUPPORTED Rust 9980:1: non-scalar type Ptr unsupported
// pub const szOID_NAME_CONSTRAINTS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.30");

// UNSUPPORTED Rust 9981:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730");

// UNSUPPORTED Rust 9982:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_BASE_URL: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.2");

// UNSUPPORTED Rust 9983:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_CA_POLICY_URL: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.8");

// UNSUPPORTED Rust 9984:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_CA_REVOCATION_URL: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.4");

// UNSUPPORTED Rust 9985:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_CERT_EXTENSION: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1");

// UNSUPPORTED Rust 9986:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_CERT_RENEWAL_URL: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.7");

// UNSUPPORTED Rust 9987:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_CERT_SEQUENCE: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.2.5");

// UNSUPPORTED Rust 9988:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_CERT_TYPE: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.1");

// UNSUPPORTED Rust 9989:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_COMMENT: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.13");

// UNSUPPORTED Rust 9990:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_DATA_TYPE: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.2");

// UNSUPPORTED Rust 9991:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_REVOCATION_URL: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.3");

// UNSUPPORTED Rust 9992:1: non-scalar type Ptr unsupported
// pub const szOID_NETSCAPE_SSL_SERVER_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.1.12");

// UNSUPPORTED Rust 9993:1: non-scalar type Ptr unsupported
// pub const szOID_NEXT_UPDATE_LOCATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.2");

// UNSUPPORTED Rust 9994:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_AES128_CBC: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.1.2");

// UNSUPPORTED Rust 9995:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_AES128_WRAP: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.1.5");

// UNSUPPORTED Rust 9996:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_AES192_CBC: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.1.22");

// UNSUPPORTED Rust 9997:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_AES192_WRAP: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.1.25");

// UNSUPPORTED Rust 9998:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_AES256_CBC: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.1.42");

// UNSUPPORTED Rust 9999:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_AES256_WRAP: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.1.45");

// UNSUPPORTED Rust 10000:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_sha256: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.2.1");

// UNSUPPORTED Rust 10001:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_sha384: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.2.2");

// UNSUPPORTED Rust 10002:1: non-scalar type Ptr unsupported
// pub const szOID_NIST_sha512: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.101.3.4.2.3");

// UNSUPPORTED Rust 10003:1: non-scalar type Ptr unsupported
// pub const szOID_NT5_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.6");

// UNSUPPORTED Rust 10004:1: non-scalar type Ptr unsupported
// pub const szOID_NTDS_CA_SECURITY_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.25.2");

// UNSUPPORTED Rust 10005:1: non-scalar type Ptr unsupported
// pub const szOID_NTDS_OBJECTSID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.25.2.1");

// UNSUPPORTED Rust 10006:1: non-scalar type Ptr unsupported
// pub const szOID_NTDS_REPLICATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.25.1");

// UNSUPPORTED Rust 10007:1: non-scalar type Ptr unsupported
// pub const szOID_NT_PRINCIPAL_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.20.2.3");

// UNSUPPORTED Rust 10008:1: non-scalar type Ptr unsupported
// pub const szOID_OEM_WHQL_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.7");

// UNSUPPORTED Rust 10009:1: non-scalar type Ptr unsupported
// pub const szOID_OIW: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14");

// UNSUPPORTED Rust 10010:1: non-scalar type Ptr unsupported
// pub const szOID_OIWDIR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.7.2");

// UNSUPPORTED Rust 10011:1: non-scalar type Ptr unsupported
// pub const szOID_OIWDIR_CRPT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.7.2.1");

// UNSUPPORTED Rust 10012:1: non-scalar type Ptr unsupported
// pub const szOID_OIWDIR_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.7.2.2");

// UNSUPPORTED Rust 10013:1: non-scalar type Ptr unsupported
// pub const szOID_OIWDIR_SIGN: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.7.2.3");

// UNSUPPORTED Rust 10014:1: non-scalar type Ptr unsupported
// pub const szOID_OIWDIR_md2: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.7.2.2.1");

// UNSUPPORTED Rust 10015:1: non-scalar type Ptr unsupported
// pub const szOID_OIWDIR_md2RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.7.2.3.1");

// UNSUPPORTED Rust 10016:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2");

// UNSUPPORTED Rust 10017:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_desCBC: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.7");

// UNSUPPORTED Rust 10018:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_desCFB: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.9");

// UNSUPPORTED Rust 10019:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_desECB: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.6");

// UNSUPPORTED Rust 10020:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_desEDE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.17");

// UNSUPPORTED Rust 10021:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_desMAC: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.10");

// UNSUPPORTED Rust 10022:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_desOFB: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.8");

// UNSUPPORTED Rust 10023:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_dhCommMod: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.16");

// UNSUPPORTED Rust 10024:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_dsa: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.12");

// UNSUPPORTED Rust 10025:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_dsaComm: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.20");

// UNSUPPORTED Rust 10026:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_dsaCommSHA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.21");

// UNSUPPORTED Rust 10027:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_dsaCommSHA1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.28");

// UNSUPPORTED Rust 10028:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_dsaSHA1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.27");

// UNSUPPORTED Rust 10029:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_keyHashSeal: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.23");

// UNSUPPORTED Rust 10030:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_md2RSASign: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.24");

// UNSUPPORTED Rust 10031:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_md4RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.2");

// UNSUPPORTED Rust 10032:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_md4RSA2: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.4");

// UNSUPPORTED Rust 10033:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_md5RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.3");

// UNSUPPORTED Rust 10034:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_md5RSASign: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.25");

// UNSUPPORTED Rust 10035:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_mdc2: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.19");

// UNSUPPORTED Rust 10036:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_mdc2RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.14");

// UNSUPPORTED Rust 10037:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_rsaSign: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.11");

// UNSUPPORTED Rust 10038:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_rsaXchg: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.22");

// UNSUPPORTED Rust 10039:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_sha: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.18");

// UNSUPPORTED Rust 10040:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_sha1: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.26");

// UNSUPPORTED Rust 10041:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_sha1RSASign: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.29");

// UNSUPPORTED Rust 10042:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_shaDSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.13");

// UNSUPPORTED Rust 10043:1: non-scalar type Ptr unsupported
// pub const szOID_OIWSEC_shaRSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.14.3.2.15");

// UNSUPPORTED Rust 10044:1: non-scalar type Ptr unsupported
// pub const szOID_ORGANIZATIONAL_UNIT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.11");

// UNSUPPORTED Rust 10045:1: non-scalar type Ptr unsupported
// pub const szOID_ORGANIZATION_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.10");

// UNSUPPORTED Rust 10046:1: non-scalar type Ptr unsupported
// pub const szOID_OS_VERSION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.13.2.3");

// UNSUPPORTED Rust 10047:1: non-scalar type Ptr unsupported
// pub const szOID_OWNER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.32");

// UNSUPPORTED Rust 10048:1: non-scalar type Ptr unsupported
// pub const szOID_PHYSICAL_DELIVERY_OFFICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.19");

// UNSUPPORTED Rust 10049:1: non-scalar type Ptr unsupported
// pub const szOID_PIN_RULES_CTL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.32");

// UNSUPPORTED Rust 10050:1: non-scalar type Ptr unsupported
// pub const szOID_PIN_RULES_DOMAIN_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.34");

// UNSUPPORTED Rust 10051:1: non-scalar type Ptr unsupported
// pub const szOID_PIN_RULES_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.33");

// UNSUPPORTED Rust 10052:1: non-scalar type Ptr unsupported
// pub const szOID_PIN_RULES_LOG_END_DATE_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.35");

// UNSUPPORTED Rust 10053:1: non-scalar type Ptr unsupported
// pub const szOID_PIN_RULES_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.31");

// UNSUPPORTED Rust 10054:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1");

// UNSUPPORTED Rust 10055:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_1: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1");

// UNSUPPORTED Rust 10056:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_10: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.10");

// UNSUPPORTED Rust 10057:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12");

// UNSUPPORTED Rust 10058:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_EXTENDED_ATTRIBUTES: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.17.3");

// UNSUPPORTED Rust 10059:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_FRIENDLY_NAME_ATTR: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.20");

// UNSUPPORTED Rust 10060:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_KEY_PROVIDER_NAME_ATTR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.17.1");

// UNSUPPORTED Rust 10061:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_LOCAL_KEY_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.21");

// UNSUPPORTED Rust 10062:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_PROTECTED_PASSWORD_SECRET_BAG_TYPE_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.17.4");

// UNSUPPORTED Rust 10063:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_PbeIds: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12.1");

// UNSUPPORTED Rust 10064:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_pbeWithSHA1And128BitRC2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12.1.5");

// UNSUPPORTED Rust 10065:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_pbeWithSHA1And128BitRC4: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12.1.1");

// UNSUPPORTED Rust 10066:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_pbeWithSHA1And2KeyTripleDES: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12.1.4");

// UNSUPPORTED Rust 10067:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_pbeWithSHA1And3KeyTripleDES: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12.1.3");

// UNSUPPORTED Rust 10068:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_pbeWithSHA1And40BitRC2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12.1.6");

// UNSUPPORTED Rust 10069:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_12_pbeWithSHA1And40BitRC4: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.12.1.2");

// UNSUPPORTED Rust 10070:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.2");

// UNSUPPORTED Rust 10071:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_3: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.3");

// UNSUPPORTED Rust 10072:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_4: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.4");

// UNSUPPORTED Rust 10073:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_5: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.5");

// UNSUPPORTED Rust 10074:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_5_PBES2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.5.13");

// UNSUPPORTED Rust 10075:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_5_PBKDF2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.5.12");

// UNSUPPORTED Rust 10076:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_6: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.6");

// UNSUPPORTED Rust 10077:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_7: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7");

// UNSUPPORTED Rust 10078:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_7_DATA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.1");

// UNSUPPORTED Rust 10079:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_7_DIGESTED: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.5");

// UNSUPPORTED Rust 10080:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_7_ENCRYPTED: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.6");

// UNSUPPORTED Rust 10081:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_7_ENVELOPED: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.3");

// UNSUPPORTED Rust 10082:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_7_SIGNED: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.2");

// UNSUPPORTED Rust 10083:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_7_SIGNEDANDENVELOPED: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.4");

// UNSUPPORTED Rust 10084:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_8: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.8");

// UNSUPPORTED Rust 10085:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_9: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9");

// UNSUPPORTED Rust 10086:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_9_CONTENT_TYPE: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.3");

// UNSUPPORTED Rust 10087:1: non-scalar type Ptr unsupported
// pub const szOID_PKCS_9_MESSAGE_DIGEST: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.4");

// UNSUPPORTED Rust 10088:1: non-scalar type Ptr unsupported
// pub const szOID_PKINIT_KP_KDC: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.2.3.5");

// UNSUPPORTED Rust 10089:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7");

// UNSUPPORTED Rust 10090:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_ACC_DESCR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48");

// UNSUPPORTED Rust 10091:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_CA_ISSUERS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48.2");

// UNSUPPORTED Rust 10092:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_CA_REPOSITORY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48.5");

// UNSUPPORTED Rust 10093:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3");

// UNSUPPORTED Rust 10094:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_CLIENT_AUTH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.2");

// UNSUPPORTED Rust 10095:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_CODE_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.3");

// UNSUPPORTED Rust 10096:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_EMAIL_PROTECTION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.4");

// UNSUPPORTED Rust 10097:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_IPSEC_END_SYSTEM: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.5");

// UNSUPPORTED Rust 10098:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_IPSEC_TUNNEL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.6");

// UNSUPPORTED Rust 10099:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_IPSEC_USER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.7");

// UNSUPPORTED Rust 10100:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_OCSP_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.9");

// UNSUPPORTED Rust 10101:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_SERVER_AUTH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.1");

// UNSUPPORTED Rust 10102:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_KP_TIMESTAMP_SIGNING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.3.8");

// UNSUPPORTED Rust 10103:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_NO_SIGNATURE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.6.2");

// UNSUPPORTED Rust 10104:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_OCSP: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48.1");

// UNSUPPORTED Rust 10105:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_OCSP_BASIC_SIGNED_RESPONSE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48.1.1");

// UNSUPPORTED Rust 10106:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_OCSP_NOCHECK: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48.1.5");

// UNSUPPORTED Rust 10107:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_OCSP_NONCE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48.1.2");

// UNSUPPORTED Rust 10108:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_PE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.1");

// UNSUPPORTED Rust 10109:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_POLICY_QUALIFIER_CPS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.2.1");

// UNSUPPORTED Rust 10110:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_POLICY_QUALIFIER_USERNOTICE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.2.2");

// UNSUPPORTED Rust 10111:1: non-scalar type Ptr unsupported
// pub const szOID_PKIX_TIME_STAMPING: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.48.3");

// UNSUPPORTED Rust 10112:1: non-scalar type Ptr unsupported
// pub const szOID_PLATFORM_MANIFEST_BINARY_ID: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.28");

// UNSUPPORTED Rust 10113:1: non-scalar type Ptr unsupported
// pub const szOID_POLICY_CONSTRAINTS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.36");

// UNSUPPORTED Rust 10114:1: non-scalar type Ptr unsupported
// pub const szOID_POLICY_MAPPINGS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.33");

// UNSUPPORTED Rust 10115:1: non-scalar type Ptr unsupported
// pub const szOID_POSTAL_ADDRESS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.16");

// UNSUPPORTED Rust 10116:1: non-scalar type Ptr unsupported
// pub const szOID_POSTAL_CODE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.17");

// UNSUPPORTED Rust 10117:1: non-scalar type Ptr unsupported
// pub const szOID_POST_OFFICE_BOX: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.18");

// UNSUPPORTED Rust 10118:1: non-scalar type Ptr unsupported
// pub const szOID_PREFERRED_DELIVERY_METHOD: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.28");

// UNSUPPORTED Rust 10119:1: non-scalar type Ptr unsupported
// pub const szOID_PRESENTATION_ADDRESS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.29");

// UNSUPPORTED Rust 10120:1: non-scalar type Ptr unsupported
// pub const szOID_PRIVATEKEY_USAGE_PERIOD: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.16");

// UNSUPPORTED Rust 10121:1: non-scalar type Ptr unsupported
// pub const szOID_PRODUCT_UPDATE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.31.1");

// UNSUPPORTED Rust 10122:1: non-scalar type Ptr unsupported
// pub const szOID_PROTECTED_PROCESS_LIGHT_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.22");

// UNSUPPORTED Rust 10123:1: non-scalar type Ptr unsupported
// pub const szOID_PROTECTED_PROCESS_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.24");

// UNSUPPORTED Rust 10124:1: non-scalar type Ptr unsupported
// pub const szOID_QC_EU_COMPLIANCE: windows_sys::core::PCSTR = windows_sys::core::s!("0.4.0.1862.1.1");

// UNSUPPORTED Rust 10125:1: non-scalar type Ptr unsupported
// pub const szOID_QC_SSCD: windows_sys::core::PCSTR = windows_sys::core::s!("0.4.0.1862.1.4");

// UNSUPPORTED Rust 10126:1: non-scalar type Ptr unsupported
// pub const szOID_QC_STATEMENTS_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.1.3");

// UNSUPPORTED Rust 10127:1: non-scalar type Ptr unsupported
// pub const szOID_RDN_DUMMY_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.9");

// UNSUPPORTED Rust 10128:1: non-scalar type Ptr unsupported
// pub const szOID_RDN_TCG_PLATFORM_MANUFACTURER: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.4");

// UNSUPPORTED Rust 10129:1: non-scalar type Ptr unsupported
// pub const szOID_RDN_TCG_PLATFORM_MODEL: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.5");

// UNSUPPORTED Rust 10130:1: non-scalar type Ptr unsupported
// pub const szOID_RDN_TCG_PLATFORM_VERSION: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.6");

// UNSUPPORTED Rust 10131:1: non-scalar type Ptr unsupported
// pub const szOID_RDN_TPM_MANUFACTURER: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.1");

// UNSUPPORTED Rust 10132:1: non-scalar type Ptr unsupported
// pub const szOID_RDN_TPM_MODEL: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.2");

// UNSUPPORTED Rust 10133:1: non-scalar type Ptr unsupported
// pub const szOID_RDN_TPM_VERSION: windows_sys::core::PCSTR = windows_sys::core::s!("2.23.133.2.3");

// UNSUPPORTED Rust 10134:1: non-scalar type Ptr unsupported
// pub const szOID_REASON_CODE_HOLD: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.23");

// UNSUPPORTED Rust 10135:1: non-scalar type Ptr unsupported
// pub const szOID_REGISTERED_ADDRESS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.26");

// UNSUPPORTED Rust 10136:1: non-scalar type Ptr unsupported
// pub const szOID_REMOVE_CERTIFICATE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.8.1");

// UNSUPPORTED Rust 10137:1: non-scalar type Ptr unsupported
// pub const szOID_RENEWAL_CERTIFICATE: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.13.1");

// UNSUPPORTED Rust 10138:1: non-scalar type Ptr unsupported
// pub const szOID_REQUEST_CLIENT_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.20");

// UNSUPPORTED Rust 10139:1: non-scalar type Ptr unsupported
// pub const szOID_REQUIRE_CERT_CHAIN_POLICY: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.21.15");

// UNSUPPORTED Rust 10140:1: non-scalar type Ptr unsupported
// pub const szOID_REVOKED_LIST_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.19");

// UNSUPPORTED Rust 10141:1: non-scalar type Ptr unsupported
// pub const szOID_RFC3161_counterSign: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.3.3.1");

// UNSUPPORTED Rust 10142:1: non-scalar type Ptr unsupported
// pub const szOID_RFC3161v21_counterSign: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.3.3.2");

// UNSUPPORTED Rust 10143:1: non-scalar type Ptr unsupported
// pub const szOID_RFC3161v21_thumbprints: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.3.3.3");

// UNSUPPORTED Rust 10144:1: non-scalar type Ptr unsupported
// pub const szOID_ROLE_OCCUPANT: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.33");

// UNSUPPORTED Rust 10145:1: non-scalar type Ptr unsupported
// pub const szOID_ROOT_LIST_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.9");

// UNSUPPORTED Rust 10146:1: non-scalar type Ptr unsupported
// pub const szOID_ROOT_PROGRAM_AUTO_UPDATE_CA_REVOCATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.60.3.1");

// UNSUPPORTED Rust 10147:1: non-scalar type Ptr unsupported
// pub const szOID_ROOT_PROGRAM_AUTO_UPDATE_END_REVOCATION: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.60.3.2");

// UNSUPPORTED Rust 10148:1: non-scalar type Ptr unsupported
// pub const szOID_ROOT_PROGRAM_FLAGS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.60.1.1");

// UNSUPPORTED Rust 10149:1: non-scalar type Ptr unsupported
// pub const szOID_ROOT_PROGRAM_NO_OCSP_FAILOVER_TO_CRL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.60.3.3");

// UNSUPPORTED Rust 10150:1: non-scalar type Ptr unsupported
// pub const szOID_RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549");

// UNSUPPORTED Rust 10151:1: non-scalar type Ptr unsupported
// pub const szOID_RSAES_OAEP: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.7");

// UNSUPPORTED Rust 10152:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_DES_EDE3_CBC: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.3.7");

// UNSUPPORTED Rust 10153:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_DH: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.3.1");

// UNSUPPORTED Rust 10154:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_ENCRYPT: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.3");

// UNSUPPORTED Rust 10155:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2");

// UNSUPPORTED Rust 10156:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_MD2: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2.2");

// UNSUPPORTED Rust 10157:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_MD2RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.2");

// UNSUPPORTED Rust 10158:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_MD4: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2.4");

// UNSUPPORTED Rust 10159:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_MD4RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.3");

// UNSUPPORTED Rust 10160:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_MD5: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.2.5");

// UNSUPPORTED Rust 10161:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_MD5RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.4");

// UNSUPPORTED Rust 10162:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_MGF1: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.8");

// UNSUPPORTED Rust 10163:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_PSPECIFIED: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.9");

// UNSUPPORTED Rust 10164:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_RC2CBC: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.3.2");

// UNSUPPORTED Rust 10165:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_RC4: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.3.4");

// UNSUPPORTED Rust 10166:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_RC5_CBCPad: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.3.9");

// UNSUPPORTED Rust 10167:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.1");

// UNSUPPORTED Rust 10168:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SETOAEP_RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.6");

// UNSUPPORTED Rust 10169:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SHA1RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.5");

// UNSUPPORTED Rust 10170:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SHA256RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.11");

// UNSUPPORTED Rust 10171:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SHA384RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.12");

// UNSUPPORTED Rust 10172:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SHA512RSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.13");

// UNSUPPORTED Rust 10173:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SMIMECapabilities: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.15");

// UNSUPPORTED Rust 10174:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SMIMEalg: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.16.3");

// UNSUPPORTED Rust 10175:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SMIMEalgCMS3DESwrap: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.16.3.6");

// UNSUPPORTED Rust 10176:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SMIMEalgCMSRC2wrap: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.16.3.7");

// UNSUPPORTED Rust 10177:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SMIMEalgESDH: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.16.3.5");

// UNSUPPORTED Rust 10178:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_SSA_PSS: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.1.10");

// UNSUPPORTED Rust 10179:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_certExtensions: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.14");

// UNSUPPORTED Rust 10180:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_challengePwd: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.7");

// UNSUPPORTED Rust 10181:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_contentType: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.3");

// UNSUPPORTED Rust 10182:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_counterSign: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.6");

// UNSUPPORTED Rust 10183:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_data: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.1");

// UNSUPPORTED Rust 10184:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_digestedData: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.5");

// UNSUPPORTED Rust 10185:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_emailAddr: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.1");

// UNSUPPORTED Rust 10186:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_encryptedData: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.6");

// UNSUPPORTED Rust 10187:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_envelopedData: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.3");

// UNSUPPORTED Rust 10188:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_extCertAttrs: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.9");

// UNSUPPORTED Rust 10189:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_hashedData: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.5");

// UNSUPPORTED Rust 10190:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_messageDigest: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.4");

// UNSUPPORTED Rust 10191:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_preferSignedData: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.15.1");

// UNSUPPORTED Rust 10192:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_signEnvData: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.4");

// UNSUPPORTED Rust 10193:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_signedData: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.7.2");

// UNSUPPORTED Rust 10194:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_signingTime: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.5");

// UNSUPPORTED Rust 10195:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_unstructAddr: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.8");

// UNSUPPORTED Rust 10196:1: non-scalar type Ptr unsupported
// pub const szOID_RSA_unstructName: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.2");

// UNSUPPORTED Rust 10197:1: non-scalar type Ptr unsupported
// pub const szOID_SEARCH_GUIDE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.14");

// UNSUPPORTED Rust 10198:1: non-scalar type Ptr unsupported
// pub const szOID_SEE_ALSO: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.34");

// UNSUPPORTED Rust 10199:1: non-scalar type Ptr unsupported
// pub const szOID_SERIALIZED: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.3.1");

// UNSUPPORTED Rust 10200:1: non-scalar type Ptr unsupported
// pub const szOID_SERVER_GATED_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.3");

// UNSUPPORTED Rust 10201:1: non-scalar type Ptr unsupported
// pub const szOID_SGC_NETSCAPE: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113730.4.1");

// UNSUPPORTED Rust 10202:1: non-scalar type Ptr unsupported
// pub const szOID_SITE_PIN_RULES_FLAGS_ATTR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.4.3");

// UNSUPPORTED Rust 10203:1: non-scalar type Ptr unsupported
// pub const szOID_SITE_PIN_RULES_INDEX_ATTR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.4.2");

// UNSUPPORTED Rust 10204:1: non-scalar type Ptr unsupported
// pub const szOID_SORTED_CTL: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.1.1");

// UNSUPPORTED Rust 10205:1: non-scalar type Ptr unsupported
// pub const szOID_STATE_OR_PROVINCE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.8");

// UNSUPPORTED Rust 10206:1: non-scalar type Ptr unsupported
// pub const szOID_STREET_ADDRESS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.9");

// UNSUPPORTED Rust 10207:1: non-scalar type Ptr unsupported
// pub const szOID_SUBJECT_ALT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.7");

// UNSUPPORTED Rust 10208:1: non-scalar type Ptr unsupported
// pub const szOID_SUBJECT_ALT_NAME2: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.17");

// UNSUPPORTED Rust 10209:1: non-scalar type Ptr unsupported
// pub const szOID_SUBJECT_DIR_ATTRS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.9");

// UNSUPPORTED Rust 10210:1: non-scalar type Ptr unsupported
// pub const szOID_SUBJECT_INFO_ACCESS: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.1.11");

// UNSUPPORTED Rust 10211:1: non-scalar type Ptr unsupported
// pub const szOID_SUBJECT_KEY_IDENTIFIER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.29.14");

// UNSUPPORTED Rust 10212:1: non-scalar type Ptr unsupported
// pub const szOID_SUPPORTED_APPLICATION_CONTEXT: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.30");

// UNSUPPORTED Rust 10213:1: non-scalar type Ptr unsupported
// pub const szOID_SUR_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.4");

// UNSUPPORTED Rust 10214:1: non-scalar type Ptr unsupported
// pub const szOID_SYNC_ROOT_CTL_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.50");

// UNSUPPORTED Rust 10215:1: non-scalar type Ptr unsupported
// pub const szOID_TELEPHONE_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.20");

// UNSUPPORTED Rust 10216:1: non-scalar type Ptr unsupported
// pub const szOID_TELETEXT_TERMINAL_IDENTIFIER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.22");

// UNSUPPORTED Rust 10217:1: non-scalar type Ptr unsupported
// pub const szOID_TELEX_NUMBER: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.21");

// UNSUPPORTED Rust 10218:1: non-scalar type Ptr unsupported
// pub const szOID_TIMESTAMP_TOKEN: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.113549.1.9.16.1.4");

// UNSUPPORTED Rust 10219:1: non-scalar type Ptr unsupported
// pub const szOID_TITLE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.12");

// UNSUPPORTED Rust 10220:1: non-scalar type Ptr unsupported
// pub const szOID_TLS_FEATURES_EXT: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.5.5.7.1.24");

// UNSUPPORTED Rust 10221:1: non-scalar type Ptr unsupported
// pub const szOID_USER_CERTIFICATE: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.36");

// UNSUPPORTED Rust 10222:1: non-scalar type Ptr unsupported
// pub const szOID_USER_PASSWORD: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.35");

// UNSUPPORTED Rust 10223:1: non-scalar type Ptr unsupported
// pub const szOID_VERISIGN_BITSTRING_6_13: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.6.13");

// UNSUPPORTED Rust 10224:1: non-scalar type Ptr unsupported
// pub const szOID_VERISIGN_ISS_STRONG_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.8.1");

// UNSUPPORTED Rust 10225:1: non-scalar type Ptr unsupported
// pub const szOID_VERISIGN_ONSITE_JURISDICTION_HASH: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.6.11");

// UNSUPPORTED Rust 10226:1: non-scalar type Ptr unsupported
// pub const szOID_VERISIGN_PRIVATE_6_9: windows_sys::core::PCSTR = windows_sys::core::s!("2.16.840.1.113733.1.6.9");

// UNSUPPORTED Rust 10227:1: non-scalar type Ptr unsupported
// pub const szOID_WHQL_CRYPTO: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.5");

// UNSUPPORTED Rust 10228:1: non-scalar type Ptr unsupported
// pub const szOID_WINDOWS_KITS_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.20");

// UNSUPPORTED Rust 10229:1: non-scalar type Ptr unsupported
// pub const szOID_WINDOWS_RT_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.21");

// UNSUPPORTED Rust 10230:1: non-scalar type Ptr unsupported
// pub const szOID_WINDOWS_SOFTWARE_EXTENSION_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.26");

// UNSUPPORTED Rust 10231:1: non-scalar type Ptr unsupported
// pub const szOID_WINDOWS_STORE_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.76.3.1");

// UNSUPPORTED Rust 10232:1: non-scalar type Ptr unsupported
// pub const szOID_WINDOWS_TCB_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.23");

// UNSUPPORTED Rust 10233:1: non-scalar type Ptr unsupported
// pub const szOID_WINDOWS_THIRD_PARTY_COMPONENT_SIGNER: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.3.25");

// UNSUPPORTED Rust 10234:1: non-scalar type Ptr unsupported
// pub const szOID_X21_ADDRESS: windows_sys::core::PCSTR = windows_sys::core::s!("2.5.4.24");

// UNSUPPORTED Rust 10235:1: non-scalar type Ptr unsupported
// pub const szOID_X957: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10040");

// UNSUPPORTED Rust 10236:1: non-scalar type Ptr unsupported
// pub const szOID_X957_DSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10040.4.1");

// UNSUPPORTED Rust 10237:1: non-scalar type Ptr unsupported
// pub const szOID_X957_SHA1DSA: windows_sys::core::PCSTR = windows_sys::core::s!("1.2.840.10040.4.3");

// UNSUPPORTED Rust 10238:1: non-scalar type Ptr unsupported
// pub const szOID_YESNO_TRUST_ATTR: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.10.4.1");

// UNSUPPORTED Rust 10239:1: non-scalar type Ptr unsupported
// pub const szPRIV_KEY_CACHE_MAX_ITEMS: windows_sys::core::PCSTR = windows_sys::core::s!("PrivKeyCacheMaxItems");

// UNSUPPORTED Rust 10240:1: non-scalar type Ptr unsupported
// pub const szPRIV_KEY_CACHE_PURGE_INTERVAL_SECONDS: windows_sys::core::PCSTR = windows_sys::core::s!("PrivKeyCachePurgeIntervalSeconds");

// UNSUPPORTED Rust 10241:1: non-scalar type Ptr unsupported
// pub const szROOT_STORE_FILE: windows_sys::core::PCSTR = windows_sys::core::s!("msroots");

// UNSUPPORTED Rust 10242:1: non-scalar type Ptr unsupported
// pub const szUSER_KEYEXCHANGE_CERT_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("kxc");

// UNSUPPORTED Rust 10243:1: non-scalar type Ptr unsupported
// pub const szUSER_KEYEXCHANGE_PRIVATE_KEY_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("kxs");

// UNSUPPORTED Rust 10244:1: non-scalar type Ptr unsupported
// pub const szUSER_KEYEXCHANGE_PUBLIC_KEY_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("kxp");

// UNSUPPORTED Rust 10245:1: non-scalar type Ptr unsupported
// pub const szUSER_SIGNATURE_CERT_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("ksc");

// UNSUPPORTED Rust 10246:1: non-scalar type Ptr unsupported
// pub const szUSER_SIGNATURE_PRIVATE_KEY_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("kss");

// UNSUPPORTED Rust 10247:1: non-scalar type Ptr unsupported
// pub const szUSER_SIGNATURE_PUBLIC_KEY_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("ksp");

// UNSUPPORTED Rust 10248:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_COLLECTION: windows_sys::core::PCSTR = windows_sys::core::s!("Collection");

// UNSUPPORTED Rust 10249:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_FILENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("File");

// UNSUPPORTED Rust 10250:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_FILENAME_W: windows_sys::core::PCSTR = windows_sys::core::s!("File");

// UNSUPPORTED Rust 10251:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_LDAP: windows_sys::core::PCWSTR = windows_sys::core::w!("Ldap");

// UNSUPPORTED Rust 10252:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_LDAP_W: windows_sys::core::PCSTR = windows_sys::core::s!("Ldap");

// UNSUPPORTED Rust 10253:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_MEMORY: windows_sys::core::PCSTR = windows_sys::core::s!("Memory");

// UNSUPPORTED Rust 10254:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_PHYSICAL: windows_sys::core::PCWSTR = windows_sys::core::w!("Physical");

// UNSUPPORTED Rust 10255:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_PHYSICAL_W: windows_sys::core::PCSTR = windows_sys::core::s!("Physical");

// UNSUPPORTED Rust 10256:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_PKCS12: windows_sys::core::PCSTR = windows_sys::core::s!("PKCS12");

// UNSUPPORTED Rust 10257:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_PKCS7: windows_sys::core::PCSTR = windows_sys::core::s!("PKCS7");

// UNSUPPORTED Rust 10258:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_SERIALIZED: windows_sys::core::PCSTR = windows_sys::core::s!("Serialized");

// UNSUPPORTED Rust 10259:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_SMART_CARD: windows_sys::core::PCWSTR = windows_sys::core::w!("SmartCard");

// UNSUPPORTED Rust 10260:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_SMART_CARD_W: windows_sys::core::PCSTR = windows_sys::core::s!("SmartCard");

// UNSUPPORTED Rust 10261:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_SYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("System");

// UNSUPPORTED Rust 10262:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_SYSTEM_REGISTRY: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemRegistry");

// UNSUPPORTED Rust 10263:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_SYSTEM_REGISTRY_W: windows_sys::core::PCSTR = windows_sys::core::s!("SystemRegistry");

// UNSUPPORTED Rust 10264:1: non-scalar type Ptr unsupported
// pub const sz_CERT_STORE_PROV_SYSTEM_W: windows_sys::core::PCSTR = windows_sys::core::s!("System");

// UNSUPPORTED Rust 10265:1: non-scalar type Ptr unsupported
// pub const wszCARD_USER_ADMIN: windows_sys::core::PCWSTR = windows_sys::core::w!("admin");

// UNSUPPORTED Rust 10266:1: non-scalar type Ptr unsupported
// pub const wszCARD_USER_EVERYONE: windows_sys::core::PCWSTR = windows_sys::core::w!("anonymous");

// UNSUPPORTED Rust 10267:1: non-scalar type Ptr unsupported
// pub const wszCARD_USER_USER: windows_sys::core::PCWSTR = windows_sys::core::w!("user");

// UNSUPPORTED Rust 10268:1: non-scalar type Ptr unsupported
// pub const wszURI_CANONICALIZATION_C14N: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");

// UNSUPPORTED Rust 10269:1: non-scalar type Ptr unsupported
// pub const wszURI_CANONICALIZATION_C14NC: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");

// UNSUPPORTED Rust 10270:1: non-scalar type Ptr unsupported
// pub const wszURI_CANONICALIZATION_EXSLUSIVE_C14N: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/10/xml-exc-c14n#");

// UNSUPPORTED Rust 10271:1: non-scalar type Ptr unsupported
// pub const wszURI_CANONICALIZATION_EXSLUSIVE_C14NC: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");

// UNSUPPORTED Rust 10272:1: non-scalar type Ptr unsupported
// pub const wszURI_NTDS_OBJECTSID_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("tag:microsoft.com,2022-09-14:sid:");

// UNSUPPORTED Rust 10273:1: non-scalar type Ptr unsupported
// pub const wszURI_TRANSFORM_XPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/TR/1999/REC-xpath-19991116");

// UNSUPPORTED Rust 10274:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_BASE64: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#base64");

// UNSUPPORTED Rust 10275:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_DSA_SHA1: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#dsa-sha1");

// UNSUPPORTED Rust 10276:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_ECDSA_SHA1: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1");

// UNSUPPORTED Rust 10277:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_ECDSA_SHA256: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256");

// UNSUPPORTED Rust 10278:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_ECDSA_SHA384: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384");

// UNSUPPORTED Rust 10279:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_ECDSA_SHA512: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512");

// UNSUPPORTED Rust 10280:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_HMAC_SHA1: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#hmac-sha1");

// UNSUPPORTED Rust 10281:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_HMAC_SHA256: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256");

// UNSUPPORTED Rust 10282:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_HMAC_SHA384: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");

// UNSUPPORTED Rust 10283:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_HMAC_SHA512: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");

// UNSUPPORTED Rust 10284:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_RSA_SHA1: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#rsa-sha1");

// UNSUPPORTED Rust 10285:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_RSA_SHA256: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");

// UNSUPPORTED Rust 10286:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_RSA_SHA384: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");

// UNSUPPORTED Rust 10287:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_RSA_SHA512: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");

// UNSUPPORTED Rust 10288:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_SHA1: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#sha1");

// UNSUPPORTED Rust 10289:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_SHA256: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmlenc#sha256");

// UNSUPPORTED Rust 10290:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_SHA384: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmldsig-more#sha384");

// UNSUPPORTED Rust 10291:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_DIGSIG_SHA512: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2001/04/xmlenc#sha512");

// UNSUPPORTED Rust 10292:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_TRANSFORM_BASE64: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#base64");

// UNSUPPORTED Rust 10293:1: non-scalar type Ptr unsupported
// pub const wszURI_XMLNS_TRANSFORM_ENVELOPED: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#enveloped-signature");

// UNSUPPORTED Rust 10294:1: non-scalar type Ptr unsupported
// pub const wszXMLNS_DIGSIG: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#");

// UNSUPPORTED Rust 10295:1: non-scalar type Ptr unsupported
// pub const wszXMLNS_DIGSIG_Id: windows_sys::core::PCWSTR = windows_sys::core::w!("Id");

// UNSUPPORTED Rust 10296:1: non-scalar type Ptr unsupported
// pub const wszXMLNS_DIGSIG_SignatureProperties: windows_sys::core::PCWSTR = windows_sys::core::w!("http://www.w3.org/2000/09/xmldsig#SignatureProperties");

