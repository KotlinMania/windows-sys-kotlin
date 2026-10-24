// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wscapi.dll, ABI=system, export=WscGetAntiMalwareUri; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WscGetAntiMalwareUri`(`ppszuri` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wscapi.dll, ABI=system, export=WscGetSecurityProviderHealth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WscGetSecurityProviderHealth`(`providers` : UInt, `phealth` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WSC_SECURITY_PROVIDER_HEALTH`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wscapi.dll, ABI=system, export=WscQueryAntiMalwareUri; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WscQueryAntiMalwareUri`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wscapi.dll, ABI=system, export=WscRegisterForChanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public external fun `WscRegisterForChanges`(`reserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `phcallbackregistration` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `lpcallbackaddress` : `super`.`Threading`.`LPTHREAD_START_ROUTINE`, `pcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wscapi.dll, ABI=system, export=WscRegisterForUserNotifications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WscRegisterForUserNotifications`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wscapi.dll, ABI=system, export=WscUnRegisterChanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WscUnRegisterChanges`(`hregistrationhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
public typealias `SECURITY_PRODUCT_TYPE` = Int;
public const val `SECURITY_PRODUCT_TYPE_ANTISPYWARE`: `SECURITY_PRODUCT_TYPE` = 2;
public const val `SECURITY_PRODUCT_TYPE_ANTIVIRUS`: `SECURITY_PRODUCT_TYPE` = 0;
public const val `SECURITY_PRODUCT_TYPE_FIREWALL`: `SECURITY_PRODUCT_TYPE` = 1;
// UNSUPPORTED Rust 12:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WSCDefaultProduct: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2981a36e_f22d_11e5_9ce9_5e5517507c66);

// UNSUPPORTED Rust 13:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WSCProductList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17072f7b_9abe_4a74_a261_1eb76b55107a);

public const val `WSC_SECURITY_PRODUCT_OUT_OF_DATE`: `WSC_SECURITY_SIGNATURE_STATUS` = 0;
public typealias `WSC_SECURITY_PRODUCT_STATE` = Int;
public const val `WSC_SECURITY_PRODUCT_STATE_EXPIRED`: `WSC_SECURITY_PRODUCT_STATE` = 3;
public const val `WSC_SECURITY_PRODUCT_STATE_OFF`: `WSC_SECURITY_PRODUCT_STATE` = 1;
public const val `WSC_SECURITY_PRODUCT_STATE_ON`: `WSC_SECURITY_PRODUCT_STATE` = 0;
public const val `WSC_SECURITY_PRODUCT_STATE_SNOOZED`: `WSC_SECURITY_PRODUCT_STATE` = 2;
public typealias `WSC_SECURITY_PRODUCT_SUBSTATUS` = Int;
public const val `WSC_SECURITY_PRODUCT_SUBSTATUS_ACTION_NEEDED`: `WSC_SECURITY_PRODUCT_SUBSTATUS` = 3;
public const val `WSC_SECURITY_PRODUCT_SUBSTATUS_ACTION_RECOMMENDED`: `WSC_SECURITY_PRODUCT_SUBSTATUS` = 2;
public const val `WSC_SECURITY_PRODUCT_SUBSTATUS_NOT_SET`: `WSC_SECURITY_PRODUCT_SUBSTATUS` = 0;
public const val `WSC_SECURITY_PRODUCT_SUBSTATUS_NO_ACTION`: `WSC_SECURITY_PRODUCT_SUBSTATUS` = 1;
public const val `WSC_SECURITY_PRODUCT_UP_TO_DATE`: `WSC_SECURITY_SIGNATURE_STATUS` = 1;
public typealias `WSC_SECURITY_PROVIDER` = Int;
public const val `WSC_SECURITY_PROVIDER_ALL`: `WSC_SECURITY_PROVIDER` = 127;
public const val `WSC_SECURITY_PROVIDER_ANTISPYWARE`: `WSC_SECURITY_PROVIDER` = 8;
public const val `WSC_SECURITY_PROVIDER_ANTIVIRUS`: `WSC_SECURITY_PROVIDER` = 4;
public const val `WSC_SECURITY_PROVIDER_AUTOUPDATE_SETTINGS`: `WSC_SECURITY_PROVIDER` = 2;
public const val `WSC_SECURITY_PROVIDER_FIREWALL`: `WSC_SECURITY_PROVIDER` = 1;
public typealias `WSC_SECURITY_PROVIDER_HEALTH` = Int;
public const val `WSC_SECURITY_PROVIDER_HEALTH_GOOD`: `WSC_SECURITY_PROVIDER_HEALTH` = 0;
public const val `WSC_SECURITY_PROVIDER_HEALTH_NOTMONITORED`: `WSC_SECURITY_PROVIDER_HEALTH` = 1;
public const val `WSC_SECURITY_PROVIDER_HEALTH_POOR`: `WSC_SECURITY_PROVIDER_HEALTH` = 2;
public const val `WSC_SECURITY_PROVIDER_HEALTH_SNOOZE`: `WSC_SECURITY_PROVIDER_HEALTH` = 3;
public const val `WSC_SECURITY_PROVIDER_INTERNET_SETTINGS`: `WSC_SECURITY_PROVIDER` = 16;
public const val `WSC_SECURITY_PROVIDER_NONE`: `WSC_SECURITY_PROVIDER` = 0;
public const val `WSC_SECURITY_PROVIDER_SERVICE`: `WSC_SECURITY_PROVIDER` = 64;
public const val `WSC_SECURITY_PROVIDER_USER_ACCOUNT_CONTROL`: `WSC_SECURITY_PROVIDER` = 32;
public typealias `WSC_SECURITY_SIGNATURE_STATUS` = Int;
