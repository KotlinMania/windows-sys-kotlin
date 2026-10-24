// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredDeleteA(targetname : windows_sys::core::PCSTR, r#type : CRED_TYPE, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredDeleteW(targetname : windows_sys::core::PCWSTR, r#type : CRED_TYPE, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredEnumerateA(filter : windows_sys::core::PCSTR, flags : CRED_ENUMERATE_FLAGS, count : *mut u32, credential : *mut *mut *mut CREDENTIALA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredEnumerateW(filter : windows_sys::core::PCWSTR, flags : CRED_ENUMERATE_FLAGS, count : *mut u32, credential : *mut *mut *mut CREDENTIALW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredFindBestCredentialA(targetname : windows_sys::core::PCSTR, r#type : u32, flags : u32, credential : *mut *mut CREDENTIALA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredFindBestCredentialW(targetname : windows_sys::core::PCWSTR, r#type : u32, flags : u32, credential : *mut *mut CREDENTIALW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredFree(buffer : *const core::ffi::c_void));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredGetSessionTypes(maximumpersistcount : u32, maximumpersist : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredGetTargetInfoA(targetname : windows_sys::core::PCSTR, flags : u32, targetinfo : *mut *mut CREDENTIAL_TARGET_INFORMATIONA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredGetTargetInfoW(targetname : windows_sys::core::PCWSTR, flags : u32, targetinfo : *mut *mut CREDENTIAL_TARGET_INFORMATIONW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredIsMarshaledCredentialA(marshaledcredential : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredIsMarshaledCredentialW(marshaledcredential : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredIsProtectedA(pszprotectedcredentials : windows_sys::core::PCSTR, pprotectiontype : *mut CRED_PROTECTION_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredIsProtectedW(pszprotectedcredentials : windows_sys::core::PCWSTR, pprotectiontype : *mut CRED_PROTECTION_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredMarshalCredentialA(credtype : CRED_MARSHAL_TYPE, credential : *const core::ffi::c_void, marshaledcredential : *mut windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredMarshalCredentialW(credtype : CRED_MARSHAL_TYPE, credential : *const core::ffi::c_void, marshaledcredential : *mut windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredPackAuthenticationBufferA(dwflags : CRED_PACK_FLAGS, pszusername : windows_sys::core::PCSTR, pszpassword : windows_sys::core::PCSTR, ppackedcredentials : *mut u8, pcbpackedcredentials : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredPackAuthenticationBufferW(dwflags : CRED_PACK_FLAGS, pszusername : windows_sys::core::PCWSTR, pszpassword : windows_sys::core::PCWSTR, ppackedcredentials : *mut u8, pcbpackedcredentials : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredProtectA(fasself : windows_sys::core::BOOL, pszcredentials : windows_sys::core::PCSTR, cchcredentials : u32, pszprotectedcredentials : windows_sys::core::PSTR, pcchmaxchars : *mut u32, protectiontype : *mut CRED_PROTECTION_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredProtectW(fasself : windows_sys::core::BOOL, pszcredentials : windows_sys::core::PCWSTR, cchcredentials : u32, pszprotectedcredentials : windows_sys::core::PWSTR, pcchmaxchars : *mut u32, protectiontype : *mut CRED_PROTECTION_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredReadA(targetname : windows_sys::core::PCSTR, r#type : CRED_TYPE, flags : u32, credential : *mut *mut CREDENTIALA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredReadDomainCredentialsA(targetinfo : *const CREDENTIAL_TARGET_INFORMATIONA, flags : u32, count : *mut u32, credential : *mut *mut *mut CREDENTIALA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredReadDomainCredentialsW(targetinfo : *const CREDENTIAL_TARGET_INFORMATIONW, flags : u32, count : *mut u32, credential : *mut *mut *mut CREDENTIALW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredReadW(targetname : windows_sys::core::PCWSTR, r#type : CRED_TYPE, flags : u32, credential : *mut *mut CREDENTIALW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredRenameA(oldtargetname : windows_sys::core::PCSTR, newtargetname : windows_sys::core::PCSTR, r#type : CRED_TYPE, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredRenameW(oldtargetname : windows_sys::core::PCWSTR, newtargetname : windows_sys::core::PCWSTR, r#type : CRED_TYPE, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUICmdLinePromptForCredentialsA(psztargetname : windows_sys::core::PCSTR, pcontext : *const SecHandle, dwautherror : u32, username : windows_sys::core::PSTR, uluserbuffersize : u32, pszpassword : windows_sys::core::PSTR, ulpasswordbuffersize : u32, pfsave : *mut windows_sys::core::BOOL, dwflags : CREDUI_FLAGS) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUICmdLinePromptForCredentialsW(psztargetname : windows_sys::core::PCWSTR, pcontext : *const SecHandle, dwautherror : u32, username : windows_sys::core::PWSTR, uluserbuffersize : u32, pszpassword : windows_sys::core::PWSTR, ulpasswordbuffersize : u32, pfsave : *mut windows_sys::core::BOOL, dwflags : CREDUI_FLAGS) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUIConfirmCredentialsA(psztargetname : windows_sys::core::PCSTR, bconfirm : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUIConfirmCredentialsW(psztargetname : windows_sys::core::PCWSTR, bconfirm : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUIParseUserNameA(username : windows_sys::core::PCSTR, user : windows_sys::core::PSTR, userbuffersize : u32, domain : windows_sys::core::PSTR, domainbuffersize : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUIParseUserNameW(username : windows_sys::core::PCWSTR, user : windows_sys::core::PWSTR, userbuffersize : u32, domain : windows_sys::core::PWSTR, domainbuffersize : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("credui.dll" "system" fn CredUIPromptForCredentialsA(puiinfo : *const CREDUI_INFOA, psztargetname : windows_sys::core::PCSTR, pcontext : *const SecHandle, dwautherror : u32, pszusername : windows_sys::core::PSTR, ulusernamebuffersize : u32, pszpassword : windows_sys::core::PSTR, ulpasswordbuffersize : u32, save : *mut windows_sys::core::BOOL, dwflags : CREDUI_FLAGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("credui.dll" "system" fn CredUIPromptForCredentialsW(puiinfo : *const CREDUI_INFOW, psztargetname : windows_sys::core::PCWSTR, pcontext : *const SecHandle, dwautherror : u32, pszusername : windows_sys::core::PWSTR, ulusernamebuffersize : u32, pszpassword : windows_sys::core::PWSTR, ulpasswordbuffersize : u32, save : *mut windows_sys::core::BOOL, dwflags : CREDUI_FLAGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("credui.dll" "system" fn CredUIPromptForWindowsCredentialsA(puiinfo : *const CREDUI_INFOA, dwautherror : u32, pulauthpackage : *mut u32, pvinauthbuffer : *const core::ffi::c_void, ulinauthbuffersize : u32, ppvoutauthbuffer : *mut *mut core::ffi::c_void, puloutauthbuffersize : *mut u32, pfsave : *mut windows_sys::core::BOOL, dwflags : CREDUIWIN_FLAGS) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("credui.dll" "system" fn CredUIPromptForWindowsCredentialsW(puiinfo : *const CREDUI_INFOW, dwautherror : u32, pulauthpackage : *mut u32, pvinauthbuffer : *const core::ffi::c_void, ulinauthbuffersize : u32, ppvoutauthbuffer : *mut *mut core::ffi::c_void, puloutauthbuffersize : *mut u32, pfsave : *mut windows_sys::core::BOOL, dwflags : CREDUIWIN_FLAGS) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUIReadSSOCredW(pszrealm : windows_sys::core::PCWSTR, ppszusername : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUIStoreSSOCredW(pszrealm : windows_sys::core::PCWSTR, pszusername : windows_sys::core::PCWSTR, pszpassword : windows_sys::core::PCWSTR, bpersist : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUnPackAuthenticationBufferA(dwflags : CRED_PACK_FLAGS, pauthbuffer : *const core::ffi::c_void, cbauthbuffer : u32, pszusername : windows_sys::core::PSTR, pcchlmaxusername : *mut u32, pszdomainname : windows_sys::core::PSTR, pcchmaxdomainname : *mut u32, pszpassword : windows_sys::core::PSTR, pcchmaxpassword : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("credui.dll" "system" fn CredUnPackAuthenticationBufferW(dwflags : CRED_PACK_FLAGS, pauthbuffer : *const core::ffi::c_void, cbauthbuffer : u32, pszusername : windows_sys::core::PWSTR, pcchmaxusername : *mut u32, pszdomainname : windows_sys::core::PWSTR, pcchmaxdomainname : *mut u32, pszpassword : windows_sys::core::PWSTR, pcchmaxpassword : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredUnmarshalCredentialA(marshaledcredential : windows_sys::core::PCSTR, credtype : *mut CRED_MARSHAL_TYPE, credential : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredUnmarshalCredentialW(marshaledcredential : windows_sys::core::PCWSTR, credtype : *mut CRED_MARSHAL_TYPE, credential : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredUnprotectA(fasself : windows_sys::core::BOOL, pszprotectedcredentials : windows_sys::core::PCSTR, cchprotectedcredentials : u32, pszcredentials : windows_sys::core::PSTR, pcchmaxchars : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredUnprotectW(fasself : windows_sys::core::BOOL, pszprotectedcredentials : windows_sys::core::PCWSTR, cchprotectedcredentials : u32, pszcredentials : windows_sys::core::PWSTR, pcchmaxchars : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredWriteA(credential : *const CREDENTIALA, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredWriteDomainCredentialsA(targetinfo : *const CREDENTIAL_TARGET_INFORMATIONA, credential : *const CREDENTIALA, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredWriteDomainCredentialsW(targetinfo : *const CREDENTIAL_TARGET_INFORMATIONW, credential : *const CREDENTIALW, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CredWriteW(credential : *const CREDENTIALW, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("scarddlg.dll" "system" fn GetOpenCardNameA(param0 : *mut OPENCARDNAMEA) -> i32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("scarddlg.dll" "system" fn GetOpenCardNameW(param0 : *mut OPENCARDNAMEW) -> i32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("keycredmgr.dll" "system" fn KeyCredentialManagerFreeInformation(keycredentialmanagerinfo : *const KeyCredentialManagerInfo));

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("keycredmgr.dll" "system" fn KeyCredentialManagerGetInformation(keycredentialmanagerinfo : *mut *mut KeyCredentialManagerInfo) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("keycredmgr.dll" "system" fn KeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype : KeyCredentialManagerOperationType, isready : *mut windows_sys::core::BOOL, keycredentialmanageroperationerrorstates : *mut KeyCredentialManagerOperationErrorStates) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("keycredmgr.dll" "system" fn KeyCredentialManagerShowUIOperation(hwndowner : super::super::Foundation:: HWND, keycredentialmanageroperationtype : KeyCredentialManagerOperationType) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardAccessStartedEvent() -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardAddReaderToGroupA(hcontext : usize, szreadername : windows_sys::core::PCSTR, szgroupname : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardAddReaderToGroupW(hcontext : usize, szreadername : windows_sys::core::PCWSTR, szgroupname : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardAudit(hcontext : usize, dwevent : u32) -> i32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardBeginTransaction(hcard : usize) -> i32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardCancel(hcontext : usize) -> i32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardConnectA(hcontext : usize, szreader : windows_sys::core::PCSTR, dwsharemode : u32, dwpreferredprotocols : u32, phcard : *mut usize, pdwactiveprotocol : *mut u32) -> i32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardConnectW(hcontext : usize, szreader : windows_sys::core::PCWSTR, dwsharemode : u32, dwpreferredprotocols : u32, phcard : *mut usize, pdwactiveprotocol : *mut u32) -> i32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardControl(hcard : usize, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32) -> i32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardDisconnect(hcard : usize, dwdisposition : u32) -> i32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("scarddlg.dll" "system" fn SCardDlgExtendedError() -> i32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardEndTransaction(hcard : usize, dwdisposition : u32) -> i32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardEstablishContext(dwscope : SCARD_SCOPE, pvreserved1 : *const core::ffi::c_void, pvreserved2 : *const core::ffi::c_void, phcontext : *mut usize) -> i32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardForgetCardTypeA(hcontext : usize, szcardname : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardForgetCardTypeW(hcontext : usize, szcardname : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardForgetReaderA(hcontext : usize, szreadername : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardForgetReaderGroupA(hcontext : usize, szgroupname : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardForgetReaderGroupW(hcontext : usize, szgroupname : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardForgetReaderW(hcontext : usize, szreadername : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardFreeMemory(hcontext : usize, pvmem : *const core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetAttrib(hcard : usize, dwattrid : u32, pbattr : *mut u8, pcbattrlen : *mut u32) -> i32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetCardTypeProviderNameA(hcontext : usize, szcardname : windows_sys::core::PCSTR, dwproviderid : u32, szprovider : windows_sys::core::PSTR, pcchprovider : *mut u32) -> i32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetCardTypeProviderNameW(hcontext : usize, szcardname : windows_sys::core::PCWSTR, dwproviderid : u32, szprovider : windows_sys::core::PWSTR, pcchprovider : *mut u32) -> i32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetDeviceTypeIdA(hcontext : usize, szreadername : windows_sys::core::PCSTR, pdwdevicetypeid : *mut u32) -> i32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetDeviceTypeIdW(hcontext : usize, szreadername : windows_sys::core::PCWSTR, pdwdevicetypeid : *mut u32) -> i32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetProviderIdA(hcontext : usize, szcard : windows_sys::core::PCSTR, pguidproviderid : *mut windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetProviderIdW(hcontext : usize, szcard : windows_sys::core::PCWSTR, pguidproviderid : *mut windows_sys::core::GUID) -> i32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetReaderDeviceInstanceIdA(hcontext : usize, szreadername : windows_sys::core::PCSTR, szdeviceinstanceid : windows_sys::core::PSTR, pcchdeviceinstanceid : *mut u32) -> i32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetReaderDeviceInstanceIdW(hcontext : usize, szreadername : windows_sys::core::PCWSTR, szdeviceinstanceid : windows_sys::core::PWSTR, pcchdeviceinstanceid : *mut u32) -> i32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetReaderIconA(hcontext : usize, szreadername : windows_sys::core::PCSTR, pbicon : *mut u8, pcbicon : *mut u32) -> i32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetReaderIconW(hcontext : usize, szreadername : windows_sys::core::PCWSTR, pbicon : *mut u8, pcbicon : *mut u32) -> i32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetStatusChangeA(hcontext : usize, dwtimeout : u32, rgreaderstates : *mut SCARD_READERSTATEA, creaders : u32) -> i32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetStatusChangeW(hcontext : usize, dwtimeout : u32, rgreaderstates : *mut SCARD_READERSTATEW, creaders : u32) -> i32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardGetTransmitCount(hcard : usize, pctransmitcount : *mut u32) -> i32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardIntroduceCardTypeA(hcontext : usize, szcardname : windows_sys::core::PCSTR, pguidprimaryprovider : *const windows_sys::core::GUID, rgguidinterfaces : *const windows_sys::core::GUID, dwinterfacecount : u32, pbatr : *const u8, pbatrmask : *const u8, cbatrlen : u32) -> i32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardIntroduceCardTypeW(hcontext : usize, szcardname : windows_sys::core::PCWSTR, pguidprimaryprovider : *const windows_sys::core::GUID, rgguidinterfaces : *const windows_sys::core::GUID, dwinterfacecount : u32, pbatr : *const u8, pbatrmask : *const u8, cbatrlen : u32) -> i32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardIntroduceReaderA(hcontext : usize, szreadername : windows_sys::core::PCSTR, szdevicename : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardIntroduceReaderGroupA(hcontext : usize, szgroupname : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardIntroduceReaderGroupW(hcontext : usize, szgroupname : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardIntroduceReaderW(hcontext : usize, szreadername : windows_sys::core::PCWSTR, szdevicename : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardIsValidContext(hcontext : usize) -> i32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListCardsA(hcontext : usize, pbatr : *const u8, rgquidinterfaces : *const windows_sys::core::GUID, cguidinterfacecount : u32, mszcards : windows_sys::core::PSTR, pcchcards : *mut u32) -> i32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListCardsW(hcontext : usize, pbatr : *const u8, rgquidinterfaces : *const windows_sys::core::GUID, cguidinterfacecount : u32, mszcards : windows_sys::core::PWSTR, pcchcards : *mut u32) -> i32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListInterfacesA(hcontext : usize, szcard : windows_sys::core::PCSTR, pguidinterfaces : *mut windows_sys::core::GUID, pcguidinterfaces : *mut u32) -> i32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListInterfacesW(hcontext : usize, szcard : windows_sys::core::PCWSTR, pguidinterfaces : *mut windows_sys::core::GUID, pcguidinterfaces : *mut u32) -> i32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListReaderGroupsA(hcontext : usize, mszgroups : windows_sys::core::PSTR, pcchgroups : *mut u32) -> i32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListReaderGroupsW(hcontext : usize, mszgroups : windows_sys::core::PWSTR, pcchgroups : *mut u32) -> i32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListReadersA(hcontext : usize, mszgroups : windows_sys::core::PCSTR, mszreaders : windows_sys::core::PSTR, pcchreaders : *mut u32) -> i32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListReadersW(hcontext : usize, mszgroups : windows_sys::core::PCWSTR, mszreaders : windows_sys::core::PWSTR, pcchreaders : *mut u32) -> i32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListReadersWithDeviceInstanceIdA(hcontext : usize, szdeviceinstanceid : windows_sys::core::PCSTR, mszreaders : windows_sys::core::PSTR, pcchreaders : *mut u32) -> i32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardListReadersWithDeviceInstanceIdW(hcontext : usize, szdeviceinstanceid : windows_sys::core::PCWSTR, mszreaders : windows_sys::core::PWSTR, pcchreaders : *mut u32) -> i32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardLocateCardsA(hcontext : usize, mszcards : windows_sys::core::PCSTR, rgreaderstates : *mut SCARD_READERSTATEA, creaders : u32) -> i32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardLocateCardsByATRA(hcontext : usize, rgatrmasks : *const SCARD_ATRMASK, catrs : u32, rgreaderstates : *mut SCARD_READERSTATEA, creaders : u32) -> i32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardLocateCardsByATRW(hcontext : usize, rgatrmasks : *const SCARD_ATRMASK, catrs : u32, rgreaderstates : *mut SCARD_READERSTATEW, creaders : u32) -> i32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardLocateCardsW(hcontext : usize, mszcards : windows_sys::core::PCWSTR, rgreaderstates : *mut SCARD_READERSTATEW, creaders : u32) -> i32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardReadCacheA(hcontext : usize, cardidentifier : *const windows_sys::core::GUID, freshnesscounter : u32, lookupname : windows_sys::core::PCSTR, data : *mut u8, datalen : *mut u32) -> i32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardReadCacheW(hcontext : usize, cardidentifier : *const windows_sys::core::GUID, freshnesscounter : u32, lookupname : windows_sys::core::PCWSTR, data : *mut u8, datalen : *mut u32) -> i32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardReconnect(hcard : usize, dwsharemode : u32, dwpreferredprotocols : u32, dwinitialization : u32, pdwactiveprotocol : *mut u32) -> i32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardReleaseContext(hcontext : usize) -> i32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardReleaseStartedEvent());

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardRemoveReaderFromGroupA(hcontext : usize, szreadername : windows_sys::core::PCSTR, szgroupname : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardRemoveReaderFromGroupW(hcontext : usize, szreadername : windows_sys::core::PCWSTR, szgroupname : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardSetAttrib(hcard : usize, dwattrid : u32, pbattr : *const u8, cbattrlen : u32) -> i32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardSetCardTypeProviderNameA(hcontext : usize, szcardname : windows_sys::core::PCSTR, dwproviderid : u32, szprovider : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardSetCardTypeProviderNameW(hcontext : usize, szcardname : windows_sys::core::PCWSTR, dwproviderid : u32, szprovider : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardState(hcard : usize, pdwstate : *mut u32, pdwprotocol : *mut u32, pbatr : *mut u8, pcbatrlen : *mut u32) -> i32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardStatusA(hcard : usize, mszreadernames : windows_sys::core::PSTR, pcchreaderlen : *mut u32, pdwstate : *mut u32, pdwprotocol : *mut u32, pbatr : *mut u8, pcbatrlen : *mut u32) -> i32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardStatusW(hcard : usize, mszreadernames : windows_sys::core::PWSTR, pcchreaderlen : *mut u32, pdwstate : *mut u32, pdwprotocol : *mut u32, pbatr : *mut u8, pcbatrlen : *mut u32) -> i32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardTransmit(hcard : usize, piosendpci : *const SCARD_IO_REQUEST, pbsendbuffer : *const u8, cbsendlength : u32, piorecvpci : *mut SCARD_IO_REQUEST, pbrecvbuffer : *mut u8, pcbrecvlength : *mut u32) -> i32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("scarddlg.dll" "system" fn SCardUIDlgSelectCardA(param0 : *mut OPENCARDNAME_EXA) -> i32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("scarddlg.dll" "system" fn SCardUIDlgSelectCardW(param0 : *mut OPENCARDNAME_EXW) -> i32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardWriteCacheA(hcontext : usize, cardidentifier : *const windows_sys::core::GUID, freshnesscounter : u32, lookupname : windows_sys::core::PCSTR, data : *const u8, datalen : u32) -> i32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("winscard.dll" "system" fn SCardWriteCacheW(hcontext : usize, cardidentifier : *const windows_sys::core::GUID, freshnesscounter : u32, lookupname : windows_sys::core::PCWSTR, data : *const u8, datalen : u32) -> i32);

// UNSUPPORTED Rust 134:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BINARY_BLOB_CREDENTIAL_INFO {
//     pub cbBlob: u32,
//     pub pbBlob: *mut u8,
// }

// UNSUPPORTED Rust 140:1: declaration Impl has no candidate rule
// impl Default for BINARY_BLOB_CREDENTIAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BinaryBlobCredential`: `CRED_MARSHAL_TYPE` = 3;
public const val `BinaryBlobForSystem`: `CRED_MARSHAL_TYPE` = 5;
// UNSUPPORTED Rust 147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CERT_CREDENTIAL_INFO {
//     pub cbSize: u32,
//     pub rgbHashOfCert: [u8; 20],
// }

// UNSUPPORTED Rust 153:1: declaration Impl has no candidate rule
// impl Default for CERT_CREDENTIAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_HASH_LENGTH`: UInt = 20u;
// UNSUPPORTED Rust 159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREDENTIALA {
//     pub Flags: CRED_FLAGS,
//     pub Type: CRED_TYPE,
//     pub TargetName: windows_sys::core::PSTR,
//     pub Comment: windows_sys::core::PSTR,
//     pub LastWritten: super::super::Foundation::FILETIME,
//     pub CredentialBlobSize: u32,
//     pub CredentialBlob: *mut u8,
//     pub Persist: CRED_PERSIST,
//     pub AttributeCount: u32,
//     pub Attributes: *mut CREDENTIAL_ATTRIBUTEA,
//     pub TargetAlias: windows_sys::core::PSTR,
//     pub UserName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 175:1: declaration Impl has no candidate rule
// impl Default for CREDENTIALA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREDENTIALW {
//     pub Flags: CRED_FLAGS,
//     pub Type: CRED_TYPE,
//     pub TargetName: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub LastWritten: super::super::Foundation::FILETIME,
//     pub CredentialBlobSize: u32,
//     pub CredentialBlob: *mut u8,
//     pub Persist: CRED_PERSIST,
//     pub AttributeCount: u32,
//     pub Attributes: *mut CREDENTIAL_ATTRIBUTEW,
//     pub TargetAlias: windows_sys::core::PWSTR,
//     pub UserName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 196:1: declaration Impl has no candidate rule
// impl Default for CREDENTIALW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 201:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREDENTIAL_ATTRIBUTEA {
//     pub Keyword: windows_sys::core::PSTR,
//     pub Flags: u32,
//     pub ValueSize: u32,
//     pub Value: *mut u8,
// }

// UNSUPPORTED Rust 209:1: declaration Impl has no candidate rule
// impl Default for CREDENTIAL_ATTRIBUTEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREDENTIAL_ATTRIBUTEW {
//     pub Keyword: windows_sys::core::PWSTR,
//     pub Flags: u32,
//     pub ValueSize: u32,
//     pub Value: *mut u8,
// }

// UNSUPPORTED Rust 222:1: declaration Impl has no candidate rule
// impl Default for CREDENTIAL_ATTRIBUTEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 227:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREDENTIAL_TARGET_INFORMATIONA {
//     pub TargetName: windows_sys::core::PSTR,
//     pub NetbiosServerName: windows_sys::core::PSTR,
//     pub DnsServerName: windows_sys::core::PSTR,
//     pub NetbiosDomainName: windows_sys::core::PSTR,
//     pub DnsDomainName: windows_sys::core::PSTR,
//     pub DnsTreeName: windows_sys::core::PSTR,
//     pub PackageName: windows_sys::core::PSTR,
//     pub Flags: u32,
//     pub CredTypeCount: u32,
//     pub CredTypes: *mut u32,
// }

// UNSUPPORTED Rust 241:1: declaration Impl has no candidate rule
// impl Default for CREDENTIAL_TARGET_INFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 246:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREDENTIAL_TARGET_INFORMATIONW {
//     pub TargetName: windows_sys::core::PWSTR,
//     pub NetbiosServerName: windows_sys::core::PWSTR,
//     pub DnsServerName: windows_sys::core::PWSTR,
//     pub NetbiosDomainName: windows_sys::core::PWSTR,
//     pub DnsDomainName: windows_sys::core::PWSTR,
//     pub DnsTreeName: windows_sys::core::PWSTR,
//     pub PackageName: windows_sys::core::PWSTR,
//     pub Flags: u32,
//     pub CredTypeCount: u32,
//     pub CredTypes: *mut u32,
// }

// UNSUPPORTED Rust 260:1: declaration Impl has no candidate rule
// impl Default for CREDENTIAL_TARGET_INFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CREDSPP_SUBMIT_TYPE` = Int;
// UNSUPPORTED Rust 266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREDSSP_CRED {
//     pub Type: CREDSPP_SUBMIT_TYPE,
//     pub pSchannelCred: *mut core::ffi::c_void,
//     pub pSpnegoCred: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule
// impl Default for CREDSSP_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CREDSSP_CRED_EX {
//     pub Type: CREDSPP_SUBMIT_TYPE,
//     pub Version: u32,
//     pub Flags: u32,
//     pub Reserved: u32,
//     pub Cred: CREDSSP_CRED,
// }

public const val `CREDSSP_CRED_EX_VERSION`: UInt = 0u;
public const val `CREDSSP_FLAG_REDIRECT`: UInt = 1u;
// UNSUPPORTED Rust 289:1: non-scalar type Ptr unsupported
// pub const CREDSSP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("CREDSSP");

public const val `CREDSSP_SERVER_AUTH_CERTIFICATE`: UInt = 2u;
public const val `CREDSSP_SERVER_AUTH_LOOPBACK`: UInt = 4u;
public const val `CREDSSP_SERVER_AUTH_NEGOTIATE`: UInt = 1u;
public const val `CREDUIWIN_AUTHPACKAGE_ONLY`: `CREDUIWIN_FLAGS` = 16u;
public const val `CREDUIWIN_CHECKBOX`: `CREDUIWIN_FLAGS` = 2u;
public const val `CREDUIWIN_DOWNLEVEL_HELLO_AS_SMART_CARD`: UInt = 2147483648u;
public const val `CREDUIWIN_ENUMERATE_ADMINS`: `CREDUIWIN_FLAGS` = 256u;
public const val `CREDUIWIN_ENUMERATE_CURRENT_USER`: `CREDUIWIN_FLAGS` = 512u;
public typealias `CREDUIWIN_FLAGS` = UInt;
public const val `CREDUIWIN_GENERIC`: `CREDUIWIN_FLAGS` = 1u;
public const val `CREDUIWIN_IGNORE_CLOUDAUTHORITY_NAME`: UInt = 262144u;
public const val `CREDUIWIN_IN_CRED_ONLY`: `CREDUIWIN_FLAGS` = 32u;
public const val `CREDUIWIN_PACK_32_WOW`: `CREDUIWIN_FLAGS` = 268435456u;
public const val `CREDUIWIN_PREPROMPTING`: `CREDUIWIN_FLAGS` = 8192u;
public const val `CREDUIWIN_SECURE_PROMPT`: `CREDUIWIN_FLAGS` = 4096u;
public typealias `CREDUI_FLAGS` = UInt;
public const val `CREDUI_FLAGS_ALWAYS_SHOW_UI`: `CREDUI_FLAGS` = 128u;
public const val `CREDUI_FLAGS_COMPLETE_USERNAME`: `CREDUI_FLAGS` = 2048u;
public const val `CREDUI_FLAGS_DO_NOT_PERSIST`: `CREDUI_FLAGS` = 2u;
public const val `CREDUI_FLAGS_EXCLUDE_CERTIFICATES`: `CREDUI_FLAGS` = 8u;
public const val `CREDUI_FLAGS_EXPECT_CONFIRMATION`: `CREDUI_FLAGS` = 131072u;
public const val `CREDUI_FLAGS_GENERIC_CREDENTIALS`: `CREDUI_FLAGS` = 262144u;
public const val `CREDUI_FLAGS_INCORRECT_PASSWORD`: `CREDUI_FLAGS` = 1u;
public const val `CREDUI_FLAGS_KEEP_USERNAME`: `CREDUI_FLAGS` = 1048576u;
public const val `CREDUI_FLAGS_PASSWORD_ONLY_OK`: `CREDUI_FLAGS` = 512u;
public const val `CREDUI_FLAGS_PERSIST`: `CREDUI_FLAGS` = 4096u;
public const val `CREDUI_FLAGS_REQUEST_ADMINISTRATOR`: `CREDUI_FLAGS` = 4u;
public const val `CREDUI_FLAGS_REQUIRE_CERTIFICATE`: `CREDUI_FLAGS` = 16u;
public const val `CREDUI_FLAGS_REQUIRE_SMARTCARD`: `CREDUI_FLAGS` = 256u;
public const val `CREDUI_FLAGS_SERVER_CREDENTIAL`: `CREDUI_FLAGS` = 16384u;
public const val `CREDUI_FLAGS_SHOW_SAVE_CHECK_BOX`: `CREDUI_FLAGS` = 64u;
public const val `CREDUI_FLAGS_USERNAME_TARGET_CREDENTIALS`: `CREDUI_FLAGS` = 524288u;
public const val `CREDUI_FLAGS_VALIDATE_USERNAME`: `CREDUI_FLAGS` = 1024u;
// UNSUPPORTED Rust 323:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct CREDUI_INFOA {
//     pub cbSize: u32,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub pszMessageText: windows_sys::core::PCSTR,
//     pub pszCaptionText: windows_sys::core::PCSTR,
//     pub hbmBanner: super::super::Graphics::Gdi::HBITMAP,
// }

// UNSUPPORTED Rust 333:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CREDUI_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 339:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct CREDUI_INFOW {
//     pub cbSize: u32,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub pszMessageText: windows_sys::core::PCWSTR,
//     pub pszCaptionText: windows_sys::core::PCWSTR,
//     pub hbmBanner: super::super::Graphics::Gdi::HBITMAP,
// }

// UNSUPPORTED Rust 349:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CREDUI_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREDUI_MAX_CAPTION_LENGTH`: UInt = 128u;
public const val `CREDUI_MAX_DOMAIN_TARGET_LENGTH`: UInt = 337u;
public const val `CREDUI_MAX_GENERIC_TARGET_LENGTH`: UInt = 32767u;
public const val `CREDUI_MAX_MESSAGE_LENGTH`: UInt = 1024u;
public const val `CREDUI_MAX_USERNAME_LENGTH`: UInt = 513u;
public const val `CRED_ALLOW_NAME_RESOLUTION`: UInt = 1u;
public const val `CRED_CACHE_TARGET_INFORMATION`: UInt = 1u;
public const val `CRED_ENUMERATE_ALL_CREDENTIALS`: `CRED_ENUMERATE_FLAGS` = 1u;
public typealias `CRED_ENUMERATE_FLAGS` = UInt;
public typealias `CRED_FLAGS` = UInt;
public const val `CRED_FLAGS_NGC_CERT`: `CRED_FLAGS` = 128u;
public const val `CRED_FLAGS_OWF_CRED_BLOB`: `CRED_FLAGS` = 8u;
public const val `CRED_FLAGS_PASSWORD_FOR_CERT`: `CRED_FLAGS` = 1u;
public const val `CRED_FLAGS_PROMPT_NOW`: `CRED_FLAGS` = 2u;
public const val `CRED_FLAGS_REQUIRE_CONFIRMATION`: `CRED_FLAGS` = 16u;
public const val `CRED_FLAGS_USERNAME_TARGET`: `CRED_FLAGS` = 4u;
public const val `CRED_FLAGS_VALID_FLAGS`: `CRED_FLAGS` = 61695u;
public const val `CRED_FLAGS_VALID_INPUT_FLAGS`: `CRED_FLAGS` = 61599u;
public const val `CRED_FLAGS_VSM_PROTECTED`: `CRED_FLAGS` = 64u;
public const val `CRED_FLAGS_WILDCARD_MATCH`: `CRED_FLAGS` = 32u;
public const val `CRED_LOGON_TYPES_MASK`: UInt = 61440u;
public typealias `CRED_MARSHAL_TYPE` = Int;
public const val `CRED_MAX_ATTRIBUTES`: UInt = 64u;
public const val `CRED_MAX_CREDENTIAL_BLOB_SIZE`: UInt = 2560u;
public const val `CRED_MAX_DOMAIN_TARGET_NAME_LENGTH`: UInt = 337u;
public const val `CRED_MAX_GENERIC_TARGET_NAME_LENGTH`: UInt = 32767u;
public const val `CRED_MAX_STRING_LENGTH`: UInt = 256u;
public const val `CRED_MAX_TARGETNAME_ATTRIBUTE_LENGTH`: UInt = 256u;
public const val `CRED_MAX_TARGETNAME_NAMESPACE_LENGTH`: UInt = 256u;
public const val `CRED_MAX_USERNAME_LENGTH`: UInt = 513u;
public const val `CRED_MAX_VALUE_SIZE`: UInt = 256u;
public typealias `CRED_PACK_FLAGS` = UInt;
public const val `CRED_PACK_GENERIC_CREDENTIALS`: `CRED_PACK_FLAGS` = 4u;
public const val `CRED_PACK_ID_PROVIDER_CREDENTIALS`: `CRED_PACK_FLAGS` = 8u;
public const val `CRED_PACK_PROTECTED_CREDENTIALS`: `CRED_PACK_FLAGS` = 1u;
public const val `CRED_PACK_WOW_BUFFER`: `CRED_PACK_FLAGS` = 2u;
public typealias `CRED_PERSIST` = UInt;
public const val `CRED_PERSIST_ENTERPRISE`: `CRED_PERSIST` = 3u;
public const val `CRED_PERSIST_LOCAL_MACHINE`: `CRED_PERSIST` = 2u;
public const val `CRED_PERSIST_NONE`: `CRED_PERSIST` = 0u;
public const val `CRED_PERSIST_SESSION`: `CRED_PERSIST` = 1u;
public const val `CRED_PRESERVE_CREDENTIAL_BLOB`: UInt = 1u;
public typealias `CRED_PROTECTION_TYPE` = Int;
public const val `CRED_PROTECT_AS_SELF`: UInt = 1u;
public const val `CRED_PROTECT_TO_SYSTEM`: UInt = 2u;
// UNSUPPORTED Rust 400:1: non-scalar type Ptr unsupported
// pub const CRED_SESSION_WILDCARD_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("*Session");

// UNSUPPORTED Rust 401:1: non-scalar type Ptr unsupported
// pub const CRED_SESSION_WILDCARD_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("*Session");

// UNSUPPORTED Rust 402:1: non-scalar type Ptr unsupported
// pub const CRED_SESSION_WILDCARD_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("*Session");

// UNSUPPORTED Rust 403:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_BATCH: windows_sys::core::PCWSTR = windows_sys::core::w!("batch");

// UNSUPPORTED Rust 404:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_BATCH_A: windows_sys::core::PCSTR = windows_sys::core::s!("batch");

// UNSUPPORTED Rust 405:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_BATCH_W: windows_sys::core::PCWSTR = windows_sys::core::w!("batch");

// UNSUPPORTED Rust 406:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("cachedinteractive");

// UNSUPPORTED Rust 407:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_A: windows_sys::core::PCSTR = windows_sys::core::s!("cachedinteractive");

// UNSUPPORTED Rust 408:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("cachedinteractive");

// UNSUPPORTED Rust 409:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("interactive");

// UNSUPPORTED Rust 410:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_A: windows_sys::core::PCSTR = windows_sys::core::s!("interactive");

// UNSUPPORTED Rust 411:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("interactive");

// UNSUPPORTED Rust 412:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("name");

// UNSUPPORTED Rust 413:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("name");

// UNSUPPORTED Rust 414:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("name");

// UNSUPPORTED Rust 415:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("network");

// UNSUPPORTED Rust 416:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT: windows_sys::core::PCWSTR = windows_sys::core::w!("networkcleartext");

// UNSUPPORTED Rust 417:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_A: windows_sys::core::PCSTR = windows_sys::core::s!("networkcleartext");

// UNSUPPORTED Rust 418:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_W: windows_sys::core::PCWSTR = windows_sys::core::w!("networkcleartext");

// UNSUPPORTED Rust 419:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORK_A: windows_sys::core::PCSTR = windows_sys::core::s!("network");

// UNSUPPORTED Rust 420:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORK_W: windows_sys::core::PCWSTR = windows_sys::core::w!("network");

// UNSUPPORTED Rust 421:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("remoteinteractive");

// UNSUPPORTED Rust 422:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_A: windows_sys::core::PCSTR = windows_sys::core::s!("remoteinteractive");

// UNSUPPORTED Rust 423:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("remoteinteractive");

// UNSUPPORTED Rust 424:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_SERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("service");

// UNSUPPORTED Rust 425:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_SERVICE_A: windows_sys::core::PCSTR = windows_sys::core::s!("service");

// UNSUPPORTED Rust 426:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_SERVICE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("service");

// UNSUPPORTED Rust 427:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_TARGET: windows_sys::core::PCWSTR = windows_sys::core::w!("target");

// UNSUPPORTED Rust 428:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_TARGET_A: windows_sys::core::PCSTR = windows_sys::core::s!("target");

// UNSUPPORTED Rust 429:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_ATTRIBUTE_TARGET_W: windows_sys::core::PCWSTR = windows_sys::core::w!("target");

// UNSUPPORTED Rust 430:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_DOMAIN_NAMESPACE: windows_sys::core::PCWSTR = windows_sys::core::w!("Domain");

// UNSUPPORTED Rust 431:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_DOMAIN_NAMESPACE_A: windows_sys::core::PCSTR = windows_sys::core::s!("Domain");

// UNSUPPORTED Rust 432:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_DOMAIN_NAMESPACE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Domain");

// UNSUPPORTED Rust 433:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_LEGACYGENERIC_NAMESPACE_A: windows_sys::core::PCSTR = windows_sys::core::s!("LegacyGeneric");

// UNSUPPORTED Rust 434:1: non-scalar type Ptr unsupported
// pub const CRED_TARGETNAME_LEGACYGENERIC_NAMESPACE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("LegacyGeneric");

public const val `CRED_TI_CREATE_EXPLICIT_CRED`: UInt = 16u;
public const val `CRED_TI_DNSTREE_IS_DFS_SERVER`: UInt = 64u;
public const val `CRED_TI_DOMAIN_FORMAT_UNKNOWN`: UInt = 2u;
public const val `CRED_TI_ONLY_PASSWORD_REQUIRED`: UInt = 4u;
public const val `CRED_TI_SERVER_FORMAT_UNKNOWN`: UInt = 1u;
public const val `CRED_TI_USERNAME_TARGET`: UInt = 8u;
public const val `CRED_TI_VALID_FLAGS`: UInt = 61567u;
public const val `CRED_TI_WORKGROUP_MEMBER`: UInt = 32u;
public typealias `CRED_TYPE` = UInt;
public const val `CRED_TYPE_DOMAIN_CERTIFICATE`: `CRED_TYPE` = 3u;
public const val `CRED_TYPE_DOMAIN_EXTENDED`: `CRED_TYPE` = 6u;
public const val `CRED_TYPE_DOMAIN_PASSWORD`: `CRED_TYPE` = 2u;
public const val `CRED_TYPE_DOMAIN_VISIBLE_PASSWORD`: `CRED_TYPE` = 4u;
public const val `CRED_TYPE_GENERIC`: `CRED_TYPE` = 1u;
public const val `CRED_TYPE_GENERIC_CERTIFICATE`: `CRED_TYPE` = 5u;
public const val `CRED_TYPE_MAXIMUM`: `CRED_TYPE` = 7u;
public const val `CRED_TYPE_MAXIMUM_EX`: `CRED_TYPE` = 1007u;
public const val `CRED_UNPROTECT_ALLOW_TO_SYSTEM`: UInt = 2u;
public const val `CRED_UNPROTECT_AS_SELF`: UInt = 1u;
public const val `CertCredential`: `CRED_MARSHAL_TYPE` = 1;
public const val `CredForSystemProtection`: `CRED_PROTECTION_TYPE` = 3;
public const val `CredTrustedProtection`: `CRED_PROTECTION_TYPE` = 2;
public const val `CredUnprotected`: `CRED_PROTECTION_TYPE` = 0;
public const val `CredUserProtection`: `CRED_PROTECTION_TYPE` = 1;
public const val `CredsspCertificateCreds`: `CREDSPP_SUBMIT_TYPE` = 13;
public const val `CredsspCredEx`: `CREDSPP_SUBMIT_TYPE` = 100;
public const val `CredsspPasswordCreds`: `CREDSPP_SUBMIT_TYPE` = 2;
public const val `CredsspSchannelCreds`: `CREDSPP_SUBMIT_TYPE` = 4;
public const val `CredsspSubmitBufferBoth`: `CREDSPP_SUBMIT_TYPE` = 50;
public const val `CredsspSubmitBufferBothOld`: `CREDSPP_SUBMIT_TYPE` = 51;
public const val `FILE_DEVICE_SMARTCARD`: UInt = 49u;
// UNSUPPORTED Rust 466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_SMARTCARD_READER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50dd5230_ba8a_11d1_bf5d_0000f805f530);

// UNSUPPORTED Rust 467:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KeyCredentialManagerInfo {
//     pub containerId: windows_sys::core::GUID,
// }

public const val `KeyCredentialManagerOperationErrorStateCertificateFailure`: `KeyCredentialManagerOperationErrorStates` = 4;
public const val `KeyCredentialManagerOperationErrorStateDeviceJoinFailure`: `KeyCredentialManagerOperationErrorStates` = 1;
public const val `KeyCredentialManagerOperationErrorStateHardwareFailure`: `KeyCredentialManagerOperationErrorStates` = 32;
public const val `KeyCredentialManagerOperationErrorStateNone`: `KeyCredentialManagerOperationErrorStates` = 0;
public const val `KeyCredentialManagerOperationErrorStatePinExistsFailure`: `KeyCredentialManagerOperationErrorStates` = 64;
public const val `KeyCredentialManagerOperationErrorStatePolicyFailure`: `KeyCredentialManagerOperationErrorStates` = 16;
public const val `KeyCredentialManagerOperationErrorStateRemoteSessionFailure`: `KeyCredentialManagerOperationErrorStates` = 8;
public const val `KeyCredentialManagerOperationErrorStateTokenFailure`: `KeyCredentialManagerOperationErrorStates` = 2;
public typealias `KeyCredentialManagerOperationErrorStates` = Int;
public typealias `KeyCredentialManagerOperationType` = Int;
public const val `KeyCredentialManagerPinChange`: `KeyCredentialManagerOperationType` = 1;
public const val `KeyCredentialManagerPinReset`: `KeyCredentialManagerOperationType` = 2;
public const val `KeyCredentialManagerProvisioning`: `KeyCredentialManagerOperationType` = 0;
// UNSUPPORTED Rust 485:1: generic scalar type unsupported
// pub type LPOCNCHKPROC = Option<unsafe extern "system" fn(param0: usize, param1: usize, param2: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 486:1: generic scalar type unsupported
// pub type LPOCNCONNPROCA = Option<unsafe extern "system" fn(param0: usize, param1: windows_sys::core::PCSTR, param2: windows_sys::core::PCSTR, param3: *const core::ffi::c_void) -> usize>;

// UNSUPPORTED Rust 487:1: generic scalar type unsupported
// pub type LPOCNCONNPROCW = Option<unsafe extern "system" fn(param0: usize, param1: windows_sys::core::PCWSTR, param2: windows_sys::core::PCWSTR, param3: *const core::ffi::c_void) -> usize>;

// UNSUPPORTED Rust 488:1: generic scalar type unsupported
// pub type LPOCNDSCPROC = Option<unsafe extern "system" fn(param0: usize, param1: usize, param2: *const core::ffi::c_void)>;

public const val `MAXIMUM_ATTR_STRING_LENGTH`: UInt = 32u;
public const val `MAXIMUM_SMARTCARD_READERS`: UInt = 10u;
// UNSUPPORTED Rust 491:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OPENCARDNAMEA {
//     pub dwStructSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub hSCardContext: usize,
//     pub lpstrGroupNames: windows_sys::core::PSTR,
//     pub nMaxGroupNames: u32,
//     pub lpstrCardNames: windows_sys::core::PSTR,
//     pub nMaxCardNames: u32,
//     pub rgguidInterfaces: *const windows_sys::core::GUID,
//     pub cguidInterfaces: u32,
//     pub lpstrRdr: windows_sys::core::PSTR,
//     pub nMaxRdr: u32,
//     pub lpstrCard: windows_sys::core::PSTR,
//     pub nMaxCard: u32,
//     pub lpstrTitle: windows_sys::core::PCSTR,
//     pub dwFlags: u32,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwShareMode: u32,
//     pub dwPreferredProtocols: u32,
//     pub dwActiveProtocol: u32,
//     pub lpfnConnect: LPOCNCONNPROCA,
//     pub lpfnCheck: LPOCNCHKPROC,
//     pub lpfnDisconnect: LPOCNDSCPROC,
//     pub hCardHandle: usize,
// }

// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule
// impl Default for OPENCARDNAMEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 523:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OPENCARDNAMEW {
//     pub dwStructSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub hSCardContext: usize,
//     pub lpstrGroupNames: windows_sys::core::PWSTR,
//     pub nMaxGroupNames: u32,
//     pub lpstrCardNames: windows_sys::core::PWSTR,
//     pub nMaxCardNames: u32,
//     pub rgguidInterfaces: *const windows_sys::core::GUID,
//     pub cguidInterfaces: u32,
//     pub lpstrRdr: windows_sys::core::PWSTR,
//     pub nMaxRdr: u32,
//     pub lpstrCard: windows_sys::core::PWSTR,
//     pub nMaxCard: u32,
//     pub lpstrTitle: windows_sys::core::PCWSTR,
//     pub dwFlags: u32,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwShareMode: u32,
//     pub dwPreferredProtocols: u32,
//     pub dwActiveProtocol: u32,
//     pub lpfnConnect: LPOCNCONNPROCW,
//     pub lpfnCheck: LPOCNCHKPROC,
//     pub lpfnDisconnect: LPOCNDSCPROC,
//     pub hCardHandle: usize,
// }

// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule
// impl Default for OPENCARDNAMEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 555:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct OPENCARDNAME_EXA {
//     pub dwStructSize: u32,
//     pub hSCardContext: usize,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub lpstrTitle: windows_sys::core::PCSTR,
//     pub lpstrSearchDesc: windows_sys::core::PCSTR,
//     pub hIcon: super::super::UI::WindowsAndMessaging::HICON,
//     pub pOpenCardSearchCriteria: *mut OPENCARD_SEARCH_CRITERIAA,
//     pub lpfnConnect: LPOCNCONNPROCA,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwShareMode: u32,
//     pub dwPreferredProtocols: u32,
//     pub lpstrRdr: windows_sys::core::PSTR,
//     pub nMaxRdr: u32,
//     pub lpstrCard: windows_sys::core::PSTR,
//     pub nMaxCard: u32,
//     pub dwActiveProtocol: u32,
//     pub hCardHandle: usize,
// }

// UNSUPPORTED Rust 578:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPENCARDNAME_EXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 584:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct OPENCARDNAME_EXW {
//     pub dwStructSize: u32,
//     pub hSCardContext: usize,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub lpstrTitle: windows_sys::core::PCWSTR,
//     pub lpstrSearchDesc: windows_sys::core::PCWSTR,
//     pub hIcon: super::super::UI::WindowsAndMessaging::HICON,
//     pub pOpenCardSearchCriteria: *mut OPENCARD_SEARCH_CRITERIAW,
//     pub lpfnConnect: LPOCNCONNPROCW,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwShareMode: u32,
//     pub dwPreferredProtocols: u32,
//     pub lpstrRdr: windows_sys::core::PWSTR,
//     pub nMaxRdr: u32,
//     pub lpstrCard: windows_sys::core::PWSTR,
//     pub nMaxCard: u32,
//     pub dwActiveProtocol: u32,
//     pub hCardHandle: usize,
// }

// UNSUPPORTED Rust 607:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPENCARDNAME_EXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OPENCARD_SEARCH_CRITERIAA {
//     pub dwStructSize: u32,
//     pub lpstrGroupNames: windows_sys::core::PSTR,
//     pub nMaxGroupNames: u32,
//     pub rgguidInterfaces: *const windows_sys::core::GUID,
//     pub cguidInterfaces: u32,
//     pub lpstrCardNames: windows_sys::core::PSTR,
//     pub nMaxCardNames: u32,
//     pub lpfnCheck: LPOCNCHKPROC,
//     pub lpfnConnect: LPOCNCONNPROCA,
//     pub lpfnDisconnect: LPOCNDSCPROC,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwShareMode: u32,
//     pub dwPreferredProtocols: u32,
// }

// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule
// impl Default for OPENCARD_SEARCH_CRITERIAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OPENCARD_SEARCH_CRITERIAW {
//     pub dwStructSize: u32,
//     pub lpstrGroupNames: windows_sys::core::PWSTR,
//     pub nMaxGroupNames: u32,
//     pub rgguidInterfaces: *const windows_sys::core::GUID,
//     pub cguidInterfaces: u32,
//     pub lpstrCardNames: windows_sys::core::PWSTR,
//     pub nMaxCardNames: u32,
//     pub lpfnCheck: LPOCNCHKPROC,
//     pub lpfnConnect: LPOCNCONNPROCW,
//     pub lpfnDisconnect: LPOCNDSCPROC,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwShareMode: u32,
//     pub dwPreferredProtocols: u32,
// }

// UNSUPPORTED Rust 652:1: declaration Impl has no candidate rule
// impl Default for OPENCARD_SEARCH_CRITERIAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct READER_SEL_REQUEST {
//     pub dwShareMode: u32,
//     pub dwPreferredProtocols: u32,
//     pub MatchType: READER_SEL_REQUEST_MATCH_TYPE,
//     pub Anonymous: READER_SEL_REQUEST_0,
// }

// UNSUPPORTED Rust 665:1: declaration Impl has no candidate rule
// impl Default for READER_SEL_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 670:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union READER_SEL_REQUEST_0 {
//     pub ReaderAndContainerParameter: READER_SEL_REQUEST_0_0,
//     pub SerialNumberParameter: READER_SEL_REQUEST_0_1,
// }

// UNSUPPORTED Rust 676:1: declaration Impl has no candidate rule
// impl Default for READER_SEL_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct READER_SEL_REQUEST_0_0 {
//     pub cbReaderNameOffset: u32,
//     pub cchReaderNameLength: u32,
//     pub cbContainerNameOffset: u32,
//     pub cchContainerNameLength: u32,
//     pub dwDesiredCardModuleVersion: u32,
//     pub dwCspFlags: u32,
// }

// UNSUPPORTED Rust 691:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct READER_SEL_REQUEST_0_1 {
//     pub cbSerialNumberOffset: u32,
//     pub cbSerialNumberLength: u32,
//     pub dwDesiredCardModuleVersion: u32,
// }

public typealias `READER_SEL_REQUEST_MATCH_TYPE` = Int;
// UNSUPPORTED Rust 699:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct READER_SEL_RESPONSE {
//     pub cbReaderNameOffset: u32,
//     pub cchReaderNameLength: u32,
//     pub cbCardNameOffset: u32,
//     pub cchCardNameLength: u32,
// }

public const val `RSR_MATCH_TYPE_ALL_CARDS`: `READER_SEL_REQUEST_MATCH_TYPE` = 3;
public const val `RSR_MATCH_TYPE_READER_AND_CONTAINER`: `READER_SEL_REQUEST_MATCH_TYPE` = 1;
public const val `RSR_MATCH_TYPE_SERIAL_NUMBER`: `READER_SEL_REQUEST_MATCH_TYPE` = 2;
public const val `SCARD_ABSENT`: UInt = 1u;
// UNSUPPORTED Rust 711:1: non-scalar type Ptr unsupported
// pub const SCARD_ALL_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCard$AllReaders\u{0}00");

// UNSUPPORTED Rust 712:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCARD_ATRMASK {
//     pub cbAtr: u32,
//     pub rgbAtr: [u8; 36],
//     pub rgbMask: [u8; 36],
// }

// UNSUPPORTED Rust 719:1: declaration Impl has no candidate rule
// impl Default for SCARD_ATRMASK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCARD_ATR_LENGTH`: UInt = 33u;
public const val `SCARD_AUDIT_CHV_FAILURE`: UInt = 0u;
public const val `SCARD_AUDIT_CHV_SUCCESS`: UInt = 1u;
public const val `SCARD_CLASS_COMMUNICATIONS`: UInt = 2u;
public const val `SCARD_CLASS_ICC_STATE`: UInt = 9u;
public const val `SCARD_CLASS_IFD_PROTOCOL`: UInt = 8u;
public const val `SCARD_CLASS_MECHANICAL`: UInt = 6u;
public const val `SCARD_CLASS_PERF`: UInt = 32766u;
public const val `SCARD_CLASS_POWER_MGMT`: UInt = 4u;
public const val `SCARD_CLASS_PROTOCOL`: UInt = 3u;
public const val `SCARD_CLASS_SECURITY`: UInt = 5u;
public const val `SCARD_CLASS_SYSTEM`: UInt = 32767u;
public const val `SCARD_CLASS_VENDOR_DEFINED`: UInt = 7u;
public const val `SCARD_CLASS_VENDOR_INFO`: UInt = 1u;
public const val `SCARD_COLD_RESET`: UInt = 1u;
// UNSUPPORTED Rust 739:1: non-scalar type Ptr unsupported
// pub const SCARD_DEFAULT_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCard$DefaultReaders\u{0}00");

public const val `SCARD_EJECT_CARD`: UInt = 3u;
// UNSUPPORTED Rust 741:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCARD_IO_REQUEST {
//     pub dwProtocol: u32,
//     pub cbPciLength: u32,
// }

public const val `SCARD_LEAVE_CARD`: UInt = 0u;
// UNSUPPORTED Rust 748:1: non-scalar type Ptr unsupported
// pub const SCARD_LOCAL_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCard$LocalReaders\u{0}00");

public const val `SCARD_NEGOTIABLE`: UInt = 5u;
public const val `SCARD_POWERED`: UInt = 4u;
public const val `SCARD_POWER_DOWN`: UInt = 0u;
public const val `SCARD_PRESENT`: UInt = 2u;
public const val `SCARD_PROTOCOL_DEFAULT`: UInt = 2147483648u;
public const val `SCARD_PROTOCOL_OPTIMAL`: UInt = 0u;
public const val `SCARD_PROTOCOL_RAW`: UInt = 65536u;
public const val `SCARD_PROTOCOL_T0`: UInt = 1u;
public const val `SCARD_PROTOCOL_T1`: UInt = 2u;
public const val `SCARD_PROTOCOL_UNDEFINED`: UInt = 0u;
public const val `SCARD_PROVIDER_CSP`: UInt = 2u;
public const val `SCARD_PROVIDER_KSP`: UInt = 3u;
public const val `SCARD_PROVIDER_PRIMARY`: UInt = 1u;
// UNSUPPORTED Rust 762:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCARD_READERSTATEA {
//     pub szReader: windows_sys::core::PCSTR,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwCurrentState: SCARD_STATE,
//     pub dwEventState: SCARD_STATE,
//     pub cbAtr: u32,
//     pub rgbAtr: [u8; 36],
// }

// UNSUPPORTED Rust 772:1: declaration Impl has no candidate rule
// impl Default for SCARD_READERSTATEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 777:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCARD_READERSTATEW {
//     pub szReader: windows_sys::core::PCWSTR,
//     pub pvUserData: *mut core::ffi::c_void,
//     pub dwCurrentState: SCARD_STATE,
//     pub dwEventState: SCARD_STATE,
//     pub cbAtr: u32,
//     pub rgbAtr: [u8; 36],
// }

// UNSUPPORTED Rust 787:1: declaration Impl has no candidate rule
// impl Default for SCARD_READERSTATEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCARD_READER_CONFISCATES`: UInt = 4u;
public const val `SCARD_READER_CONTACTLESS`: UInt = 8u;
public const val `SCARD_READER_EJECTS`: UInt = 2u;
public const val `SCARD_READER_SWALLOWS`: UInt = 1u;
public const val `SCARD_READER_TYPE_EMBEDDEDSE`: UInt = 2048u;
public const val `SCARD_READER_TYPE_IDE`: UInt = 16u;
public const val `SCARD_READER_TYPE_KEYBOARD`: UInt = 4u;
public const val `SCARD_READER_TYPE_NFC`: UInt = 256u;
public const val `SCARD_READER_TYPE_NGC`: UInt = 1024u;
public const val `SCARD_READER_TYPE_PARALELL`: UInt = 2u;
public const val `SCARD_READER_TYPE_PCMCIA`: UInt = 64u;
public const val `SCARD_READER_TYPE_SCSI`: UInt = 8u;
public const val `SCARD_READER_TYPE_SERIAL`: UInt = 1u;
public const val `SCARD_READER_TYPE_TPM`: UInt = 128u;
public const val `SCARD_READER_TYPE_UICC`: UInt = 512u;
public const val `SCARD_READER_TYPE_USB`: UInt = 32u;
public const val `SCARD_READER_TYPE_VENDOR`: UInt = 240u;
public const val `SCARD_RESET_CARD`: UInt = 1u;
public typealias `SCARD_SCOPE` = UInt;
public const val `SCARD_SCOPE_SYSTEM`: `SCARD_SCOPE` = 2u;
public const val `SCARD_SCOPE_TERMINAL`: UInt = 1u;
public const val `SCARD_SCOPE_USER`: `SCARD_SCOPE` = 0u;
public const val `SCARD_SHARE_DIRECT`: UInt = 3u;
public const val `SCARD_SHARE_EXCLUSIVE`: UInt = 1u;
public const val `SCARD_SHARE_SHARED`: UInt = 2u;
public const val `SCARD_SPECIFIC`: UInt = 6u;
public typealias `SCARD_STATE` = UInt;
public const val `SCARD_STATE_ATRMATCH`: `SCARD_STATE` = 64u;
public const val `SCARD_STATE_CHANGED`: `SCARD_STATE` = 2u;
public const val `SCARD_STATE_EMPTY`: `SCARD_STATE` = 16u;
public const val `SCARD_STATE_EXCLUSIVE`: `SCARD_STATE` = 128u;
public const val `SCARD_STATE_IGNORE`: `SCARD_STATE` = 1u;
public const val `SCARD_STATE_INUSE`: `SCARD_STATE` = 256u;
public const val `SCARD_STATE_MUTE`: `SCARD_STATE` = 512u;
public const val `SCARD_STATE_PRESENT`: `SCARD_STATE` = 32u;
public const val `SCARD_STATE_UNAVAILABLE`: `SCARD_STATE` = 8u;
public const val `SCARD_STATE_UNAWARE`: `SCARD_STATE` = 0u;
public const val `SCARD_STATE_UNKNOWN`: `SCARD_STATE` = 4u;
public const val `SCARD_STATE_UNPOWERED`: UInt = 1024u;
public const val `SCARD_SWALLOWED`: UInt = 3u;
// UNSUPPORTED Rust 832:1: non-scalar type Ptr unsupported
// pub const SCARD_SYSTEM_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCard$SystemReaders\u{0}00");

public const val `SCARD_T0_CMD_LENGTH`: UInt = 5u;
// UNSUPPORTED Rust 834:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCARD_T0_COMMAND {
//     pub bCla: u8,
//     pub bIns: u8,
//     pub bP1: u8,
//     pub bP2: u8,
//     pub bP3: u8,
// }

public const val `SCARD_T0_HEADER_LENGTH`: UInt = 7u;
// UNSUPPORTED Rust 844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCARD_T0_REQUEST {
//     pub ioRequest: SCARD_IO_REQUEST,
//     pub bSw1: u8,
//     pub bSw2: u8,
//     pub Anonymous: SCARD_T0_REQUEST_0,
// }

// UNSUPPORTED Rust 852:1: declaration Impl has no candidate rule
// impl Default for SCARD_T0_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 857:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SCARD_T0_REQUEST_0 {
//     pub CmdBytes: SCARD_T0_COMMAND,
//     pub rgbHeader: [u8; 5],
// }

// UNSUPPORTED Rust 863:1: declaration Impl has no candidate rule
// impl Default for SCARD_T0_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCARD_T1_EPILOGUE_LENGTH`: UInt = 2u;
public const val `SCARD_T1_EPILOGUE_LENGTH_LRC`: UInt = 1u;
public const val `SCARD_T1_MAX_IFS`: UInt = 254u;
public const val `SCARD_T1_PROLOGUE_LENGTH`: UInt = 3u;
// UNSUPPORTED Rust 872:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCARD_T1_REQUEST {
//     pub ioRequest: SCARD_IO_REQUEST,
// }

public const val `SCARD_UNKNOWN`: UInt = 0u;
public const val `SCARD_UNPOWER_CARD`: UInt = 2u;
public const val `SCARD_WARM_RESET`: UInt = 2u;
public const val `SCERR_NOCARDNAME`: UInt = 16384u;
public const val `SCERR_NOGUIDS`: UInt = 32768u;
public const val `SC_DLG_FORCE_UI`: UInt = 4u;
public const val `SC_DLG_MINIMAL_UI`: UInt = 1u;
public const val `SC_DLG_NO_UI`: UInt = 2u;
public const val `SECPKG_ALT_ATTR`: UInt = 2147483648u;
public const val `SECPKG_ATTR_C_FULL_IDENT_TOKEN`: UInt = 2147483781u;
// UNSUPPORTED Rust 887:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_ACCOUNT_DISABLED: super::super::Foundation::NTSTATUS = 0xC0000072_u32 as _;

// UNSUPPORTED Rust 888:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_ACCOUNT_EXPIRED: super::super::Foundation::NTSTATUS = 0xC0000193_u32 as _;

// UNSUPPORTED Rust 889:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_ACCOUNT_LOCKED_OUT: super::super::Foundation::NTSTATUS = 0xC0000234_u32 as _;

// UNSUPPORTED Rust 890:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_ACCOUNT_RESTRICTION: super::super::Foundation::NTSTATUS = 0xC000006E_u32 as _;

// UNSUPPORTED Rust 891:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_AUTHENTICATION_FIREWALL_FAILED: super::super::Foundation::NTSTATUS = 0xC0000413_u32 as _;

// UNSUPPORTED Rust 892:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_DOWNGRADE_DETECTED: super::super::Foundation::NTSTATUS = 0xC0000388_u32 as _;

// UNSUPPORTED Rust 893:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_LOGON_FAILURE: super::super::Foundation::NTSTATUS = 0xC000006D_u32 as _;

// UNSUPPORTED Rust 894:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_LOGON_TYPE_NOT_GRANTED: super::super::Foundation::NTSTATUS = 0xC000015B_u32 as _;

// UNSUPPORTED Rust 895:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_NO_SUCH_LOGON_SESSION: super::super::Foundation::NTSTATUS = 0xC000005F_u32 as _;

// UNSUPPORTED Rust 896:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_NO_SUCH_USER: super::super::Foundation::NTSTATUS = 0xC0000064_u32 as _;

// UNSUPPORTED Rust 897:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_PASSWORD_EXPIRED: super::super::Foundation::NTSTATUS = 0xC0000071_u32 as _;

// UNSUPPORTED Rust 898:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_PASSWORD_MUST_CHANGE: super::super::Foundation::NTSTATUS = 0xC0000224_u32 as _;

// UNSUPPORTED Rust 899:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS
// pub const STATUS_WRONG_PASSWORD: super::super::Foundation::NTSTATUS = 0xC000006A_u32 as _;

// UNSUPPORTED Rust 900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SecHandle {
//     pub dwLower: usize,
//     pub dwUpper: usize,
// }

// UNSUPPORTED Rust 906:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SecPkgContext_ClientCreds {
//     pub AuthBufferLen: u32,
//     pub AuthBuffer: *mut u8,
// }

// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule
// impl Default for SecPkgContext_ClientCreds {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 917:1: non-scalar type Ptr unsupported
// pub const TS_SSP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("TSSSP");

// UNSUPPORTED Rust 918:1: non-scalar type Ptr unsupported
// pub const TS_SSP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("TSSSP");

// UNSUPPORTED Rust 919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct USERNAME_TARGET_CREDENTIAL_INFO {
//     pub UserName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 924:1: declaration Impl has no candidate rule
// impl Default for USERNAME_TARGET_CREDENTIAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UsernameForPackedCredentials`: `CRED_MARSHAL_TYPE` = 4;
public const val `UsernameTargetCredential`: `CRED_MARSHAL_TYPE` = 2;
// UNSUPPORTED Rust 931:1: non-scalar type Ptr unsupported
// pub const szOID_TS_KP_TS_SERVER_AUTH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.54.1.2");

