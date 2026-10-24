// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredDeleteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredDeleteA`(`targetname` : `windows_sys`.`core`.`PCSTR`, `type` : `CRED_TYPE`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredDeleteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredDeleteW`(`targetname` : `windows_sys`.`core`.`PCWSTR`, `type` : `CRED_TYPE`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredEnumerateA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredEnumerateA`(`filter` : `windows_sys`.`core`.`PCSTR`, `flags` : `CRED_ENUMERATE_FLAGS`, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`CREDENTIALA`>>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredEnumerateW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredEnumerateW`(`filter` : `windows_sys`.`core`.`PCWSTR`, `flags` : `CRED_ENUMERATE_FLAGS`, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`CREDENTIALW`>>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredFindBestCredentialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredFindBestCredentialA`(`targetname` : `windows_sys`.`core`.`PCSTR`, `type` : UInt, `flags` : UInt, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CREDENTIALA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredFindBestCredentialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredFindBestCredentialW`(`targetname` : `windows_sys`.`core`.`PCWSTR`, `type` : UInt, `flags` : UInt, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CREDENTIALW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredFree`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredGetSessionTypes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredGetSessionTypes`(`maximumpersistcount` : UInt, `maximumpersist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredGetTargetInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredGetTargetInfoA`(`targetname` : `windows_sys`.`core`.`PCSTR`, `flags` : UInt, `targetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CREDENTIAL_TARGET_INFORMATIONA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredGetTargetInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredGetTargetInfoW`(`targetname` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `targetinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CREDENTIAL_TARGET_INFORMATIONW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredIsMarshaledCredentialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredIsMarshaledCredentialA`(`marshaledcredential` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredIsMarshaledCredentialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredIsMarshaledCredentialW`(`marshaledcredential` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredIsProtectedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredIsProtectedA`(`pszprotectedcredentials` : `windows_sys`.`core`.`PCSTR`, `pprotectiontype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRED_PROTECTION_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredIsProtectedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredIsProtectedW`(`pszprotectedcredentials` : `windows_sys`.`core`.`PCWSTR`, `pprotectiontype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRED_PROTECTION_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredMarshalCredentialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredMarshalCredentialA`(`credtype` : `CRED_MARSHAL_TYPE`, `credential` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `marshaledcredential` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredMarshalCredentialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredMarshalCredentialW`(`credtype` : `CRED_MARSHAL_TYPE`, `credential` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `marshaledcredential` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredPackAuthenticationBufferA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredPackAuthenticationBufferA`(`dwflags` : `CRED_PACK_FLAGS`, `pszusername` : `windows_sys`.`core`.`PCSTR`, `pszpassword` : `windows_sys`.`core`.`PCSTR`, `ppackedcredentials` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbpackedcredentials` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredPackAuthenticationBufferW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredPackAuthenticationBufferW`(`dwflags` : `CRED_PACK_FLAGS`, `pszusername` : `windows_sys`.`core`.`PCWSTR`, `pszpassword` : `windows_sys`.`core`.`PCWSTR`, `ppackedcredentials` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbpackedcredentials` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredProtectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredProtectA`(`fasself` : `windows_sys`.`core`.`BOOL`, `pszcredentials` : `windows_sys`.`core`.`PCSTR`, `cchcredentials` : UInt, `pszprotectedcredentials` : `windows_sys`.`core`.`PSTR`, `pcchmaxchars` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `protectiontype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRED_PROTECTION_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredProtectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredProtectW`(`fasself` : `windows_sys`.`core`.`BOOL`, `pszcredentials` : `windows_sys`.`core`.`PCWSTR`, `cchcredentials` : UInt, `pszprotectedcredentials` : `windows_sys`.`core`.`PWSTR`, `pcchmaxchars` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `protectiontype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRED_PROTECTION_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredReadA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredReadA`(`targetname` : `windows_sys`.`core`.`PCSTR`, `type` : `CRED_TYPE`, `flags` : UInt, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CREDENTIALA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredReadDomainCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredReadDomainCredentialsA`(`targetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIAL_TARGET_INFORMATIONA`>?, `flags` : UInt, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`CREDENTIALA`>>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredReadDomainCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredReadDomainCredentialsW`(`targetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIAL_TARGET_INFORMATIONW`>?, `flags` : UInt, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.CPointerVar<`CREDENTIALW`>>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredReadW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredReadW`(`targetname` : `windows_sys`.`core`.`PCWSTR`, `type` : `CRED_TYPE`, `flags` : UInt, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CREDENTIALW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredRenameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredRenameA`(`oldtargetname` : `windows_sys`.`core`.`PCSTR`, `newtargetname` : `windows_sys`.`core`.`PCSTR`, `type` : `CRED_TYPE`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredRenameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredRenameW`(`oldtargetname` : `windows_sys`.`core`.`PCWSTR`, `newtargetname` : `windows_sys`.`core`.`PCWSTR`, `type` : `CRED_TYPE`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUICmdLinePromptForCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUICmdLinePromptForCredentialsA`(`psztargetname` : `windows_sys`.`core`.`PCSTR`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecHandle`>?, `dwautherror` : UInt, `username` : `windows_sys`.`core`.`PSTR`, `uluserbuffersize` : UInt, `pszpassword` : `windows_sys`.`core`.`PSTR`, `ulpasswordbuffersize` : UInt, `pfsave` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwflags` : `CREDUI_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUICmdLinePromptForCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUICmdLinePromptForCredentialsW`(`psztargetname` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecHandle`>?, `dwautherror` : UInt, `username` : `windows_sys`.`core`.`PWSTR`, `uluserbuffersize` : UInt, `pszpassword` : `windows_sys`.`core`.`PWSTR`, `ulpasswordbuffersize` : UInt, `pfsave` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwflags` : `CREDUI_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIConfirmCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUIConfirmCredentialsA`(`psztargetname` : `windows_sys`.`core`.`PCSTR`, `bconfirm` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIConfirmCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUIConfirmCredentialsW`(`psztargetname` : `windows_sys`.`core`.`PCWSTR`, `bconfirm` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIParseUserNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUIParseUserNameA`(`username` : `windows_sys`.`core`.`PCSTR`, `user` : `windows_sys`.`core`.`PSTR`, `userbuffersize` : UInt, `domain` : `windows_sys`.`core`.`PSTR`, `domainbuffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIParseUserNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUIParseUserNameW`(`username` : `windows_sys`.`core`.`PCWSTR`, `user` : `windows_sys`.`core`.`PWSTR`, `userbuffersize` : UInt, `domain` : `windows_sys`.`core`.`PWSTR`, `domainbuffersize` : UInt) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIPromptForCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CredUIPromptForCredentialsA`(`puiinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDUI_INFOA`>?, `psztargetname` : `windows_sys`.`core`.`PCSTR`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecHandle`>?, `dwautherror` : UInt, `pszusername` : `windows_sys`.`core`.`PSTR`, `ulusernamebuffersize` : UInt, `pszpassword` : `windows_sys`.`core`.`PSTR`, `ulpasswordbuffersize` : UInt, `save` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwflags` : `CREDUI_FLAGS`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIPromptForCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CredUIPromptForCredentialsW`(`puiinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDUI_INFOW`>?, `psztargetname` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`SecHandle`>?, `dwautherror` : UInt, `pszusername` : `windows_sys`.`core`.`PWSTR`, `ulusernamebuffersize` : UInt, `pszpassword` : `windows_sys`.`core`.`PWSTR`, `ulpasswordbuffersize` : UInt, `save` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwflags` : `CREDUI_FLAGS`) : `super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIPromptForWindowsCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CredUIPromptForWindowsCredentialsA`(`puiinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDUI_INFOA`>?, `dwautherror` : UInt, `pulauthpackage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvinauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulinauthbuffersize` : UInt, `ppvoutauthbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `puloutauthbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfsave` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwflags` : `CREDUIWIN_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIPromptForWindowsCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `CredUIPromptForWindowsCredentialsW`(`puiinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDUI_INFOW`>?, `dwautherror` : UInt, `pulauthpackage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvinauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulinauthbuffersize` : UInt, `ppvoutauthbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `puloutauthbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pfsave` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwflags` : `CREDUIWIN_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIReadSSOCredW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUIReadSSOCredW`(`pszrealm` : `windows_sys`.`core`.`PCWSTR`, `ppszusername` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUIStoreSSOCredW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUIStoreSSOCredW`(`pszrealm` : `windows_sys`.`core`.`PCWSTR`, `pszusername` : `windows_sys`.`core`.`PCWSTR`, `pszpassword` : `windows_sys`.`core`.`PCWSTR`, `bpersist` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUnPackAuthenticationBufferA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUnPackAuthenticationBufferA`(`dwflags` : `CRED_PACK_FLAGS`, `pauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbauthbuffer` : UInt, `pszusername` : `windows_sys`.`core`.`PSTR`, `pcchlmaxusername` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszdomainname` : `windows_sys`.`core`.`PSTR`, `pcchmaxdomainname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszpassword` : `windows_sys`.`core`.`PSTR`, `pcchmaxpassword` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=credui.dll, ABI=system, export=CredUnPackAuthenticationBufferW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUnPackAuthenticationBufferW`(`dwflags` : `CRED_PACK_FLAGS`, `pauthbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbauthbuffer` : UInt, `pszusername` : `windows_sys`.`core`.`PWSTR`, `pcchmaxusername` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszdomainname` : `windows_sys`.`core`.`PWSTR`, `pcchmaxdomainname` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pszpassword` : `windows_sys`.`core`.`PWSTR`, `pcchmaxpassword` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredUnmarshalCredentialA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUnmarshalCredentialA`(`marshaledcredential` : `windows_sys`.`core`.`PCSTR`, `credtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRED_MARSHAL_TYPE`>?, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredUnmarshalCredentialW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUnmarshalCredentialW`(`marshaledcredential` : `windows_sys`.`core`.`PCWSTR`, `credtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CRED_MARSHAL_TYPE`>?, `credential` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredUnprotectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUnprotectA`(`fasself` : `windows_sys`.`core`.`BOOL`, `pszprotectedcredentials` : `windows_sys`.`core`.`PCSTR`, `cchprotectedcredentials` : UInt, `pszcredentials` : `windows_sys`.`core`.`PSTR`, `pcchmaxchars` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredUnprotectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredUnprotectW`(`fasself` : `windows_sys`.`core`.`BOOL`, `pszprotectedcredentials` : `windows_sys`.`core`.`PCWSTR`, `cchprotectedcredentials` : UInt, `pszcredentials` : `windows_sys`.`core`.`PWSTR`, `pcchmaxchars` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredWriteA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredWriteA`(`credential` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIALA`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredWriteDomainCredentialsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredWriteDomainCredentialsA`(`targetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIAL_TARGET_INFORMATIONA`>?, `credential` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIALA`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredWriteDomainCredentialsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredWriteDomainCredentialsW`(`targetinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIAL_TARGET_INFORMATIONW`>?, `credential` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIALW`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CredWriteW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CredWriteW`(`credential` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREDENTIALW`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=scarddlg.dll, ABI=system, export=GetOpenCardNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOpenCardNameA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENCARDNAMEA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=scarddlg.dll, ABI=system, export=GetOpenCardNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOpenCardNameW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENCARDNAMEW`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=keycredmgr.dll, ABI=system, export=KeyCredentialManagerFreeInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KeyCredentialManagerFreeInformation`(`keycredentialmanagerinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`KeyCredentialManagerInfo`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=keycredmgr.dll, ABI=system, export=KeyCredentialManagerGetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KeyCredentialManagerGetInformation`(`keycredentialmanagerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`KeyCredentialManagerInfo`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=keycredmgr.dll, ABI=system, export=KeyCredentialManagerGetOperationErrorStates; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KeyCredentialManagerGetOperationErrorStates`(`keycredentialmanageroperationtype` : `KeyCredentialManagerOperationType`, `isready` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `keycredentialmanageroperationerrorstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`KeyCredentialManagerOperationErrorStates`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=keycredmgr.dll, ABI=system, export=KeyCredentialManagerShowUIOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `KeyCredentialManagerShowUIOperation`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `keycredentialmanageroperationtype` : `KeyCredentialManagerOperationType`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardAccessStartedEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardAccessStartedEvent`() : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardAddReaderToGroupA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardAddReaderToGroupA`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCSTR`, `szgroupname` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardAddReaderToGroupW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardAddReaderToGroupW`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCWSTR`, `szgroupname` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardAudit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardAudit`(`hcontext` : ULong, `dwevent` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardBeginTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardBeginTransaction`(`hcard` : ULong) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardCancel`(`hcontext` : ULong) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardConnectA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardConnectA`(`hcontext` : ULong, `szreader` : `windows_sys`.`core`.`PCSTR`, `dwsharemode` : UInt, `dwpreferredprotocols` : UInt, `phcard` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pdwactiveprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardConnectW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardConnectW`(`hcontext` : ULong, `szreader` : `windows_sys`.`core`.`PCWSTR`, `dwsharemode` : UInt, `dwpreferredprotocols` : UInt, `phcard` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pdwactiveprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardControl`(`hcard` : ULong, `dwcontrolcode` : UInt, `lpinbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbinbuffersize` : UInt, `lpoutbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cboutbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardDisconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardDisconnect`(`hcard` : ULong, `dwdisposition` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=scarddlg.dll, ABI=system, export=SCardDlgExtendedError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardDlgExtendedError`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardEndTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardEndTransaction`(`hcard` : ULong, `dwdisposition` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardEstablishContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardEstablishContext`(`dwscope` : `SCARD_SCOPE`, `pvreserved1` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvreserved2` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardForgetCardTypeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardForgetCardTypeA`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardForgetCardTypeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardForgetCardTypeW`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardForgetReaderA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardForgetReaderA`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardForgetReaderGroupA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardForgetReaderGroupA`(`hcontext` : ULong, `szgroupname` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardForgetReaderGroupW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardForgetReaderGroupW`(`hcontext` : ULong, `szgroupname` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardForgetReaderW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardForgetReaderW`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardFreeMemory`(`hcontext` : ULong, `pvmem` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetAttrib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetAttrib`(`hcard` : ULong, `dwattrid` : UInt, `pbattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbattrlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetCardTypeProviderNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetCardTypeProviderNameA`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCSTR`, `dwproviderid` : UInt, `szprovider` : `windows_sys`.`core`.`PSTR`, `pcchprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetCardTypeProviderNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetCardTypeProviderNameW`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCWSTR`, `dwproviderid` : UInt, `szprovider` : `windows_sys`.`core`.`PWSTR`, `pcchprovider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetDeviceTypeIdA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetDeviceTypeIdA`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCSTR`, `pdwdevicetypeid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetDeviceTypeIdW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetDeviceTypeIdW`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCWSTR`, `pdwdevicetypeid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetProviderIdA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetProviderIdA`(`hcontext` : ULong, `szcard` : `windows_sys`.`core`.`PCSTR`, `pguidproviderid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetProviderIdW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetProviderIdW`(`hcontext` : ULong, `szcard` : `windows_sys`.`core`.`PCWSTR`, `pguidproviderid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetReaderDeviceInstanceIdA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetReaderDeviceInstanceIdA`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCSTR`, `szdeviceinstanceid` : `windows_sys`.`core`.`PSTR`, `pcchdeviceinstanceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetReaderDeviceInstanceIdW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetReaderDeviceInstanceIdW`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCWSTR`, `szdeviceinstanceid` : `windows_sys`.`core`.`PWSTR`, `pcchdeviceinstanceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetReaderIconA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetReaderIconA`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCSTR`, `pbicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetReaderIconW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetReaderIconW`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCWSTR`, `pbicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbicon` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetStatusChangeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetStatusChangeA`(`hcontext` : ULong, `dwtimeout` : UInt, `rgreaderstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCARD_READERSTATEA`>?, `creaders` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetStatusChangeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetStatusChangeW`(`hcontext` : ULong, `dwtimeout` : UInt, `rgreaderstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCARD_READERSTATEW`>?, `creaders` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardGetTransmitCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardGetTransmitCount`(`hcard` : ULong, `pctransmitcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardIntroduceCardTypeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardIntroduceCardTypeA`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCSTR`, `pguidprimaryprovider` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `rgguidinterfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwinterfacecount` : UInt, `pbatr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pbatrmask` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbatrlen` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardIntroduceCardTypeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardIntroduceCardTypeW`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCWSTR`, `pguidprimaryprovider` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `rgguidinterfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwinterfacecount` : UInt, `pbatr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pbatrmask` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbatrlen` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardIntroduceReaderA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardIntroduceReaderA`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCSTR`, `szdevicename` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardIntroduceReaderGroupA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardIntroduceReaderGroupA`(`hcontext` : ULong, `szgroupname` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardIntroduceReaderGroupW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardIntroduceReaderGroupW`(`hcontext` : ULong, `szgroupname` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardIntroduceReaderW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardIntroduceReaderW`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCWSTR`, `szdevicename` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardIsValidContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardIsValidContext`(`hcontext` : ULong) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListCardsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListCardsA`(`hcontext` : ULong, `pbatr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rgquidinterfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `cguidinterfacecount` : UInt, `mszcards` : `windows_sys`.`core`.`PSTR`, `pcchcards` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListCardsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListCardsW`(`hcontext` : ULong, `pbatr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rgquidinterfaces` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `cguidinterfacecount` : UInt, `mszcards` : `windows_sys`.`core`.`PWSTR`, `pcchcards` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListInterfacesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListInterfacesA`(`hcontext` : ULong, `szcard` : `windows_sys`.`core`.`PCSTR`, `pguidinterfaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pcguidinterfaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListInterfacesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListInterfacesW`(`hcontext` : ULong, `szcard` : `windows_sys`.`core`.`PCWSTR`, `pguidinterfaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pcguidinterfaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListReaderGroupsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListReaderGroupsA`(`hcontext` : ULong, `mszgroups` : `windows_sys`.`core`.`PSTR`, `pcchgroups` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListReaderGroupsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListReaderGroupsW`(`hcontext` : ULong, `mszgroups` : `windows_sys`.`core`.`PWSTR`, `pcchgroups` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListReadersA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListReadersA`(`hcontext` : ULong, `mszgroups` : `windows_sys`.`core`.`PCSTR`, `mszreaders` : `windows_sys`.`core`.`PSTR`, `pcchreaders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListReadersW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListReadersW`(`hcontext` : ULong, `mszgroups` : `windows_sys`.`core`.`PCWSTR`, `mszreaders` : `windows_sys`.`core`.`PWSTR`, `pcchreaders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListReadersWithDeviceInstanceIdA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListReadersWithDeviceInstanceIdA`(`hcontext` : ULong, `szdeviceinstanceid` : `windows_sys`.`core`.`PCSTR`, `mszreaders` : `windows_sys`.`core`.`PSTR`, `pcchreaders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardListReadersWithDeviceInstanceIdW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardListReadersWithDeviceInstanceIdW`(`hcontext` : ULong, `szdeviceinstanceid` : `windows_sys`.`core`.`PCWSTR`, `mszreaders` : `windows_sys`.`core`.`PWSTR`, `pcchreaders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardLocateCardsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardLocateCardsA`(`hcontext` : ULong, `mszcards` : `windows_sys`.`core`.`PCSTR`, `rgreaderstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCARD_READERSTATEA`>?, `creaders` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardLocateCardsByATRA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardLocateCardsByATRA`(`hcontext` : ULong, `rgatrmasks` : /* Rust *const */ kotlinx.cinterop.CPointer<`SCARD_ATRMASK`>?, `catrs` : UInt, `rgreaderstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCARD_READERSTATEA`>?, `creaders` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardLocateCardsByATRW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardLocateCardsByATRW`(`hcontext` : ULong, `rgatrmasks` : /* Rust *const */ kotlinx.cinterop.CPointer<`SCARD_ATRMASK`>?, `catrs` : UInt, `rgreaderstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCARD_READERSTATEW`>?, `creaders` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardLocateCardsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardLocateCardsW`(`hcontext` : ULong, `mszcards` : `windows_sys`.`core`.`PCWSTR`, `rgreaderstates` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCARD_READERSTATEW`>?, `creaders` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardReadCacheA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardReadCacheA`(`hcontext` : ULong, `cardidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `freshnesscounter` : UInt, `lookupname` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `datalen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardReadCacheW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardReadCacheW`(`hcontext` : ULong, `cardidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `freshnesscounter` : UInt, `lookupname` : `windows_sys`.`core`.`PCWSTR`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `datalen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardReconnect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardReconnect`(`hcard` : ULong, `dwsharemode` : UInt, `dwpreferredprotocols` : UInt, `dwinitialization` : UInt, `pdwactiveprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardReleaseContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardReleaseContext`(`hcontext` : ULong) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardReleaseStartedEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardReleaseStartedEvent`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardRemoveReaderFromGroupA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardRemoveReaderFromGroupA`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCSTR`, `szgroupname` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardRemoveReaderFromGroupW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardRemoveReaderFromGroupW`(`hcontext` : ULong, `szreadername` : `windows_sys`.`core`.`PCWSTR`, `szgroupname` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardSetAttrib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardSetAttrib`(`hcard` : ULong, `dwattrid` : UInt, `pbattr` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbattrlen` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardSetCardTypeProviderNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardSetCardTypeProviderNameA`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCSTR`, `dwproviderid` : UInt, `szprovider` : `windows_sys`.`core`.`PCSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardSetCardTypeProviderNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardSetCardTypeProviderNameW`(`hcontext` : ULong, `szcardname` : `windows_sys`.`core`.`PCWSTR`, `dwproviderid` : UInt, `szprovider` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardState`(`hcard` : ULong, `pdwstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbatr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbatrlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardStatusA`(`hcard` : ULong, `mszreadernames` : `windows_sys`.`core`.`PSTR`, `pcchreaderlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbatr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbatrlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardStatusW`(`hcard` : ULong, `mszreadernames` : `windows_sys`.`core`.`PWSTR`, `pcchreaderlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbatr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbatrlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardTransmit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardTransmit`(`hcard` : ULong, `piosendpci` : /* Rust *const */ kotlinx.cinterop.CPointer<`SCARD_IO_REQUEST`>?, `pbsendbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `cbsendlength` : UInt, `piorecvpci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SCARD_IO_REQUEST`>?, `pbrecvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbrecvlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=scarddlg.dll, ABI=system, export=SCardUIDlgSelectCardA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `SCardUIDlgSelectCardA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENCARDNAME_EXA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=scarddlg.dll, ABI=system, export=SCardUIDlgSelectCardW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `SCardUIDlgSelectCardW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENCARDNAME_EXW`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardWriteCacheA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardWriteCacheA`(`hcontext` : ULong, `cardidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `freshnesscounter` : UInt, `lookupname` : `windows_sys`.`core`.`PCSTR`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `datalen` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winscard.dll, ABI=system, export=SCardWriteCacheW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SCardWriteCacheW`(`hcontext` : ULong, `cardidentifier` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `freshnesscounter` : UInt, `lookupname` : `windows_sys`.`core`.`PCWSTR`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `datalen` : UInt) : Int
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BINARY_BLOB_CREDENTIAL_INFO` (
    public var `cbBlob`: UInt,
    public var `pbBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 140:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BINARY_BLOB_CREDENTIAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BinaryBlobCredential`: `CRED_MARSHAL_TYPE` = 3;
public const val `BinaryBlobForSystem`: `CRED_MARSHAL_TYPE` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CERT_CREDENTIAL_INFO` (
    public var `cbSize`: UInt,
    public var `rgbHashOfCert`: UByteArray,
)
// UNSUPPORTED Rust 153:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CERT_CREDENTIAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CERT_HASH_LENGTH`: UInt = 20u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREDENTIALA` (
    public var `Flags`: `CRED_FLAGS`,
    public var `Type`: `CRED_TYPE`,
    public var `TargetName`: `windows_sys`.`core`.`PSTR`,
    public var `Comment`: `windows_sys`.`core`.`PSTR`,
    public var `LastWritten`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `CredentialBlobSize`: UInt,
    public var `CredentialBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Persist`: `CRED_PERSIST`,
    public var `AttributeCount`: UInt,
    public var `Attributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CREDENTIAL_ATTRIBUTEA`>?,
    public var `TargetAlias`: `windows_sys`.`core`.`PSTR`,
    public var `UserName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 175:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREDENTIALA {
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
public class `CREDENTIALW` (
    public var `Flags`: `CRED_FLAGS`,
    public var `Type`: `CRED_TYPE`,
    public var `TargetName`: `windows_sys`.`core`.`PWSTR`,
    public var `Comment`: `windows_sys`.`core`.`PWSTR`,
    public var `LastWritten`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `CredentialBlobSize`: UInt,
    public var `CredentialBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Persist`: `CRED_PERSIST`,
    public var `AttributeCount`: UInt,
    public var `Attributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CREDENTIAL_ATTRIBUTEW`>?,
    public var `TargetAlias`: `windows_sys`.`core`.`PWSTR`,
    public var `UserName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 196:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREDENTIALW {
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
public class `CREDENTIAL_ATTRIBUTEA` (
    public var `Keyword`: `windows_sys`.`core`.`PSTR`,
    public var `Flags`: UInt,
    public var `ValueSize`: UInt,
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 209:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREDENTIAL_ATTRIBUTEA {
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
public class `CREDENTIAL_ATTRIBUTEW` (
    public var `Keyword`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: UInt,
    public var `ValueSize`: UInt,
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 222:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREDENTIAL_ATTRIBUTEW {
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
public class `CREDENTIAL_TARGET_INFORMATIONA` (
    public var `TargetName`: `windows_sys`.`core`.`PSTR`,
    public var `NetbiosServerName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsServerName`: `windows_sys`.`core`.`PSTR`,
    public var `NetbiosDomainName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsDomainName`: `windows_sys`.`core`.`PSTR`,
    public var `DnsTreeName`: `windows_sys`.`core`.`PSTR`,
    public var `PackageName`: `windows_sys`.`core`.`PSTR`,
    public var `Flags`: UInt,
    public var `CredTypeCount`: UInt,
    public var `CredTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 241:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREDENTIAL_TARGET_INFORMATIONA {
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
public class `CREDENTIAL_TARGET_INFORMATIONW` (
    public var `TargetName`: `windows_sys`.`core`.`PWSTR`,
    public var `NetbiosServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `NetbiosDomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsDomainName`: `windows_sys`.`core`.`PWSTR`,
    public var `DnsTreeName`: `windows_sys`.`core`.`PWSTR`,
    public var `PackageName`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: UInt,
    public var `CredTypeCount`: UInt,
    public var `CredTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 260:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREDENTIAL_TARGET_INFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CREDSPP_SUBMIT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREDSSP_CRED` (
    public var `Type`: `CREDSPP_SUBMIT_TYPE`,
    public var `pSchannelCred`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pSpnegoCred`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CREDSSP_CRED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CREDSSP_CRED_EX` (
    public var `Type`: `CREDSPP_SUBMIT_TYPE`,
    public var `Version`: UInt,
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
    public var `Cred`: `CREDSSP_CRED`,
)
public const val `CREDSSP_CRED_EX_VERSION`: UInt = 0u;
public const val `CREDSSP_FLAG_REDIRECT`: UInt = 1u;
// UNSUPPORTED Rust 289:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREDUI_INFOA` (
    public var `cbSize`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `pszMessageText`: `windows_sys`.`core`.`PCSTR`,
    public var `pszCaptionText`: `windows_sys`.`core`.`PCSTR`,
    public var `hbmBanner`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
)
// UNSUPPORTED Rust 333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for CREDUI_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREDUI_INFOW` (
    public var `cbSize`: UInt,
    public var `hwndParent`: `super`.`super`.`Foundation`.`HWND`,
    public var `pszMessageText`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszCaptionText`: `windows_sys`.`core`.`PCWSTR`,
    public var `hbmBanner`: `super`.`super`.`Graphics`.`Gdi`.`HBITMAP`,
)
// UNSUPPORTED Rust 349:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 400:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_SESSION_WILDCARD_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("*Session");

// UNSUPPORTED Rust 401:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_SESSION_WILDCARD_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("*Session");

// UNSUPPORTED Rust 402:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_SESSION_WILDCARD_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("*Session");

// UNSUPPORTED Rust 403:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_BATCH: windows_sys::core::PCWSTR = windows_sys::core::w!("batch");

// UNSUPPORTED Rust 404:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_BATCH_A: windows_sys::core::PCSTR = windows_sys::core::s!("batch");

// UNSUPPORTED Rust 405:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_BATCH_W: windows_sys::core::PCWSTR = windows_sys::core::w!("batch");

// UNSUPPORTED Rust 406:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("cachedinteractive");

// UNSUPPORTED Rust 407:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_A: windows_sys::core::PCSTR = windows_sys::core::s!("cachedinteractive");

// UNSUPPORTED Rust 408:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_CACHEDINTERACTIVE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("cachedinteractive");

// UNSUPPORTED Rust 409:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("interactive");

// UNSUPPORTED Rust 410:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_A: windows_sys::core::PCSTR = windows_sys::core::s!("interactive");

// UNSUPPORTED Rust 411:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_INTERACTIVE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("interactive");

// UNSUPPORTED Rust 412:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("name");

// UNSUPPORTED Rust 413:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("name");

// UNSUPPORTED Rust 414:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("name");

// UNSUPPORTED Rust 415:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("network");

// UNSUPPORTED Rust 416:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT: windows_sys::core::PCWSTR = windows_sys::core::w!("networkcleartext");

// UNSUPPORTED Rust 417:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_A: windows_sys::core::PCSTR = windows_sys::core::s!("networkcleartext");

// UNSUPPORTED Rust 418:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORKCLEARTEXT_W: windows_sys::core::PCWSTR = windows_sys::core::w!("networkcleartext");

// UNSUPPORTED Rust 419:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORK_A: windows_sys::core::PCSTR = windows_sys::core::s!("network");

// UNSUPPORTED Rust 420:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_NETWORK_W: windows_sys::core::PCWSTR = windows_sys::core::w!("network");

// UNSUPPORTED Rust 421:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("remoteinteractive");

// UNSUPPORTED Rust 422:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_A: windows_sys::core::PCSTR = windows_sys::core::s!("remoteinteractive");

// UNSUPPORTED Rust 423:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_REMOTEINTERACTIVE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("remoteinteractive");

// UNSUPPORTED Rust 424:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_SERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("service");

// UNSUPPORTED Rust 425:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_SERVICE_A: windows_sys::core::PCSTR = windows_sys::core::s!("service");

// UNSUPPORTED Rust 426:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_SERVICE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("service");

// UNSUPPORTED Rust 427:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_TARGET: windows_sys::core::PCWSTR = windows_sys::core::w!("target");

// UNSUPPORTED Rust 428:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_TARGET_A: windows_sys::core::PCSTR = windows_sys::core::s!("target");

// UNSUPPORTED Rust 429:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_ATTRIBUTE_TARGET_W: windows_sys::core::PCWSTR = windows_sys::core::w!("target");

// UNSUPPORTED Rust 430:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_DOMAIN_NAMESPACE: windows_sys::core::PCWSTR = windows_sys::core::w!("Domain");

// UNSUPPORTED Rust 431:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_DOMAIN_NAMESPACE_A: windows_sys::core::PCSTR = windows_sys::core::s!("Domain");

// UNSUPPORTED Rust 432:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_DOMAIN_NAMESPACE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Domain");

// UNSUPPORTED Rust 433:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CRED_TARGETNAME_LEGACYGENERIC_NAMESPACE_A: windows_sys::core::PCSTR = windows_sys::core::s!("LegacyGeneric");

// UNSUPPORTED Rust 434:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
// UNSUPPORTED Rust 466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_SMARTCARD_READER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50dd5230_ba8a_11d1_bf5d_0000f805f530);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KeyCredentialManagerInfo` (
    public var `containerId`: `windows_sys`.`core`.`GUID`,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPOCNCHKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPOCNCONNPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPOCNCONNPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPOCNDSCPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `MAXIMUM_ATTR_STRING_LENGTH`: UInt = 32u;
public const val `MAXIMUM_SMARTCARD_READERS`: UInt = 10u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENCARDNAMEA` (
    public var `dwStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `hSCardContext`: ULong,
    public var `lpstrGroupNames`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxGroupNames`: UInt,
    public var `lpstrCardNames`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCardNames`: UInt,
    public var `rgguidInterfaces`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cguidInterfaces`: UInt,
    public var `lpstrRdr`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxRdr`: UInt,
    public var `lpstrCard`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCard`: UInt,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `dwFlags`: UInt,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwShareMode`: UInt,
    public var `dwPreferredProtocols`: UInt,
    public var `dwActiveProtocol`: UInt,
    public var `lpfnConnect`: `LPOCNCONNPROCA`,
    public var `lpfnCheck`: `LPOCNCHKPROC`,
    public var `lpfnDisconnect`: `LPOCNDSCPROC`,
    public var `hCardHandle`: ULong,
)
// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OPENCARDNAMEA {
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
public class `OPENCARDNAMEW` (
    public var `dwStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `hSCardContext`: ULong,
    public var `lpstrGroupNames`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxGroupNames`: UInt,
    public var `lpstrCardNames`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCardNames`: UInt,
    public var `rgguidInterfaces`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cguidInterfaces`: UInt,
    public var `lpstrRdr`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxRdr`: UInt,
    public var `lpstrCard`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCard`: UInt,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwFlags`: UInt,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwShareMode`: UInt,
    public var `dwPreferredProtocols`: UInt,
    public var `dwActiveProtocol`: UInt,
    public var `lpfnConnect`: `LPOCNCONNPROCW`,
    public var `lpfnCheck`: `LPOCNCHKPROC`,
    public var `lpfnDisconnect`: `LPOCNDSCPROC`,
    public var `hCardHandle`: ULong,
)
// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OPENCARDNAMEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENCARDNAME_EXA` (
    public var `dwStructSize`: UInt,
    public var `hSCardContext`: ULong,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrSearchDesc`: `windows_sys`.`core`.`PCSTR`,
    public var `hIcon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
    public var `pOpenCardSearchCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENCARD_SEARCH_CRITERIAA`>?,
    public var `lpfnConnect`: `LPOCNCONNPROCA`,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwShareMode`: UInt,
    public var `dwPreferredProtocols`: UInt,
    public var `lpstrRdr`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxRdr`: UInt,
    public var `lpstrCard`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCard`: UInt,
    public var `dwActiveProtocol`: UInt,
    public var `hCardHandle`: ULong,
)
// UNSUPPORTED Rust 578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPENCARDNAME_EXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENCARDNAME_EXW` (
    public var `dwStructSize`: UInt,
    public var `hSCardContext`: ULong,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `dwFlags`: UInt,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrSearchDesc`: `windows_sys`.`core`.`PCWSTR`,
    public var `hIcon`: `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`,
    public var `pOpenCardSearchCriteria`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENCARD_SEARCH_CRITERIAW`>?,
    public var `lpfnConnect`: `LPOCNCONNPROCW`,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwShareMode`: UInt,
    public var `dwPreferredProtocols`: UInt,
    public var `lpstrRdr`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxRdr`: UInt,
    public var `lpstrCard`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCard`: UInt,
    public var `dwActiveProtocol`: UInt,
    public var `hCardHandle`: ULong,
)
// UNSUPPORTED Rust 607:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for OPENCARDNAME_EXW {
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
public class `OPENCARD_SEARCH_CRITERIAA` (
    public var `dwStructSize`: UInt,
    public var `lpstrGroupNames`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxGroupNames`: UInt,
    public var `rgguidInterfaces`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cguidInterfaces`: UInt,
    public var `lpstrCardNames`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCardNames`: UInt,
    public var `lpfnCheck`: `LPOCNCHKPROC`,
    public var `lpfnConnect`: `LPOCNCONNPROCA`,
    public var `lpfnDisconnect`: `LPOCNDSCPROC`,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwShareMode`: UInt,
    public var `dwPreferredProtocols`: UInt,
)
// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OPENCARD_SEARCH_CRITERIAA {
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
public class `OPENCARD_SEARCH_CRITERIAW` (
    public var `dwStructSize`: UInt,
    public var `lpstrGroupNames`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxGroupNames`: UInt,
    public var `rgguidInterfaces`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `cguidInterfaces`: UInt,
    public var `lpstrCardNames`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCardNames`: UInt,
    public var `lpfnCheck`: `LPOCNCHKPROC`,
    public var `lpfnConnect`: `LPOCNCONNPROCW`,
    public var `lpfnDisconnect`: `LPOCNDSCPROC`,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwShareMode`: UInt,
    public var `dwPreferredProtocols`: UInt,
)
// UNSUPPORTED Rust 652:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OPENCARD_SEARCH_CRITERIAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `READER_SEL_REQUEST` (
    public var `dwShareMode`: UInt,
    public var `dwPreferredProtocols`: UInt,
    public var `MatchType`: `READER_SEL_REQUEST_MATCH_TYPE`,
    public var `Anonymous`: `READER_SEL_REQUEST_0`,
)
// UNSUPPORTED Rust 665:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for READER_SEL_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 670:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union READER_SEL_REQUEST_0 {
//     pub ReaderAndContainerParameter: READER_SEL_REQUEST_0_0,
//     pub SerialNumberParameter: READER_SEL_REQUEST_0_1,
// }

// UNSUPPORTED Rust 676:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for READER_SEL_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `READER_SEL_REQUEST_0_0` (
    public var `cbReaderNameOffset`: UInt,
    public var `cchReaderNameLength`: UInt,
    public var `cbContainerNameOffset`: UInt,
    public var `cchContainerNameLength`: UInt,
    public var `dwDesiredCardModuleVersion`: UInt,
    public var `dwCspFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `READER_SEL_REQUEST_0_1` (
    public var `cbSerialNumberOffset`: UInt,
    public var `cbSerialNumberLength`: UInt,
    public var `dwDesiredCardModuleVersion`: UInt,
)
public typealias `READER_SEL_REQUEST_MATCH_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `READER_SEL_RESPONSE` (
    public var `cbReaderNameOffset`: UInt,
    public var `cchReaderNameLength`: UInt,
    public var `cbCardNameOffset`: UInt,
    public var `cchCardNameLength`: UInt,
)
public const val `RSR_MATCH_TYPE_ALL_CARDS`: `READER_SEL_REQUEST_MATCH_TYPE` = 3;
public const val `RSR_MATCH_TYPE_READER_AND_CONTAINER`: `READER_SEL_REQUEST_MATCH_TYPE` = 1;
public const val `RSR_MATCH_TYPE_SERIAL_NUMBER`: `READER_SEL_REQUEST_MATCH_TYPE` = 2;
public const val `SCARD_ABSENT`: UInt = 1u;
// UNSUPPORTED Rust 711:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SCARD_ALL_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCard$AllReaders\u{0}00");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCARD_ATRMASK` (
    public var `cbAtr`: UInt,
    public var `rgbAtr`: UByteArray,
    public var `rgbMask`: UByteArray,
)
// UNSUPPORTED Rust 719:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 739:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SCARD_DEFAULT_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCard$DefaultReaders\u{0}00");

public const val `SCARD_EJECT_CARD`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCARD_IO_REQUEST` (
    public var `dwProtocol`: UInt,
    public var `cbPciLength`: UInt,
)
public const val `SCARD_LEAVE_CARD`: UInt = 0u;
// UNSUPPORTED Rust 748:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCARD_READERSTATEA` (
    public var `szReader`: `windows_sys`.`core`.`PCSTR`,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwCurrentState`: `SCARD_STATE`,
    public var `dwEventState`: `SCARD_STATE`,
    public var `cbAtr`: UInt,
    public var `rgbAtr`: UByteArray,
)
// UNSUPPORTED Rust 772:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCARD_READERSTATEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 36 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCARD_READERSTATEW` (
    public var `szReader`: `windows_sys`.`core`.`PCWSTR`,
    public var `pvUserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwCurrentState`: `SCARD_STATE`,
    public var `dwEventState`: `SCARD_STATE`,
    public var `cbAtr`: UInt,
    public var `rgbAtr`: UByteArray,
)
// UNSUPPORTED Rust 787:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 832:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SCARD_SYSTEM_READERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SCard$SystemReaders\u{0}00");

public const val `SCARD_T0_CMD_LENGTH`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCARD_T0_COMMAND` (
    public var `bCla`: UByte,
    public var `bIns`: UByte,
    public var `bP1`: UByte,
    public var `bP2`: UByte,
    public var `bP3`: UByte,
)
public const val `SCARD_T0_HEADER_LENGTH`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SCARD_T0_REQUEST` (
    public var `ioRequest`: `SCARD_IO_REQUEST`,
    public var `bSw1`: UByte,
    public var `bSw2`: UByte,
    public var `Anonymous`: `SCARD_T0_REQUEST_0`,
)
// UNSUPPORTED Rust 852:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCARD_T0_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 857:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SCARD_T0_REQUEST_0 {
//     pub CmdBytes: SCARD_T0_COMMAND,
//     pub rgbHeader: [u8; 5],
// }

// UNSUPPORTED Rust 863:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SCARD_T0_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCARD_T1_EPILOGUE_LENGTH`: UInt = 2u;
public const val `SCARD_T1_EPILOGUE_LENGTH_LRC`: UInt = 1u;
public const val `SCARD_T1_MAX_IFS`: UInt = 254u;
public const val `SCARD_T1_PROLOGUE_LENGTH`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SCARD_T1_REQUEST` (
    public var `ioRequest`: `SCARD_IO_REQUEST`,
)
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
// UNSUPPORTED Rust 887:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_ACCOUNT_DISABLED: super::super::Foundation::NTSTATUS = 0xC0000072_u32 as _;

// UNSUPPORTED Rust 888:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_ACCOUNT_EXPIRED: super::super::Foundation::NTSTATUS = 0xC0000193_u32 as _;

// UNSUPPORTED Rust 889:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_ACCOUNT_LOCKED_OUT: super::super::Foundation::NTSTATUS = 0xC0000234_u32 as _;

// UNSUPPORTED Rust 890:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_ACCOUNT_RESTRICTION: super::super::Foundation::NTSTATUS = 0xC000006E_u32 as _;

// UNSUPPORTED Rust 891:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_AUTHENTICATION_FIREWALL_FAILED: super::super::Foundation::NTSTATUS = 0xC0000413_u32 as _;

// UNSUPPORTED Rust 892:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_DOWNGRADE_DETECTED: super::super::Foundation::NTSTATUS = 0xC0000388_u32 as _;

// UNSUPPORTED Rust 893:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_LOGON_FAILURE: super::super::Foundation::NTSTATUS = 0xC000006D_u32 as _;

// UNSUPPORTED Rust 894:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_LOGON_TYPE_NOT_GRANTED: super::super::Foundation::NTSTATUS = 0xC000015B_u32 as _;

// UNSUPPORTED Rust 895:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_NO_SUCH_LOGON_SESSION: super::super::Foundation::NTSTATUS = 0xC000005F_u32 as _;

// UNSUPPORTED Rust 896:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_NO_SUCH_USER: super::super::Foundation::NTSTATUS = 0xC0000064_u32 as _;

// UNSUPPORTED Rust 897:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_PASSWORD_EXPIRED: super::super::Foundation::NTSTATUS = 0xC0000071_u32 as _;

// UNSUPPORTED Rust 898:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_PASSWORD_MUST_CHANGE: super::super::Foundation::NTSTATUS = 0xC0000224_u32 as _;

// UNSUPPORTED Rust 899:1: qualified type requires source-backed binding: super::super::Foundation::NTSTATUS; syntax: no per-file syntax rule for Const
// pub const STATUS_WRONG_PASSWORD: super::super::Foundation::NTSTATUS = 0xC000006A_u32 as _;

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SecHandle` (
    public var `dwLower`: ULong,
    public var `dwUpper`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SecPkgContext_ClientCreds` (
    public var `AuthBufferLen`: UInt,
    public var `AuthBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SecPkgContext_ClientCreds {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 917:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TS_SSP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("TSSSP");

// UNSUPPORTED Rust 918:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TS_SSP_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("TSSSP");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `USERNAME_TARGET_CREDENTIAL_INFO` (
    public var `UserName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 924:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for USERNAME_TARGET_CREDENTIAL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UsernameForPackedCredentials`: `CRED_MARSHAL_TYPE` = 4;
public const val `UsernameTargetCredential`: `CRED_MARSHAL_TYPE` = 2;
// UNSUPPORTED Rust 931:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const szOID_TS_KP_TS_SERVER_AUTH: windows_sys::core::PCSTR = windows_sys::core::s!("1.3.6.1.4.1.311.54.1.2");

