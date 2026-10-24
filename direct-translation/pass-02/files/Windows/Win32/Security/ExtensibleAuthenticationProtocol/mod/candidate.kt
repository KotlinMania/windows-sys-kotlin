// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerBeginSession(dwflags : u32, eaptype : EAP_METHOD_TYPE, pattributearray : *const EAP_ATTRIBUTES, htokenimpersonateuser : super::super::Foundation:: HANDLE, dwsizeofconnectiondata : u32, pconnectiondata : *const u8, dwsizeofuserdata : u32, puserdata : *const u8, dwmaxsendpacketsize : u32, pconnectionid : *const windows_sys::core::GUID, func : NotificationHandler, pcontextdata : *mut core::ffi::c_void, psessionid : *mut u32, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerClearConnection(pconnectionid : *mut windows_sys::core::GUID, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerEndSession(sessionhandle : u32, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerFreeEapError(peaperror : *mut EAP_ERROR));

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerFreeErrorMemory(peaperror : *mut EAP_ERROR));

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerFreeMemory(pdata : *mut u8));

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerFreeRuntimeMemory(pdata : *mut u8));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetAuthStatus(sessionhandle : u32, authparam : EapHostPeerAuthParams, pcbauthdata : *mut u32, ppauthdata : *mut *mut u8, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds : *mut windows_sys::core::GUID, phcredentialimpersonationtoken : *mut isize, sessionhandle : u32, ppeaperror : *mut *mut EAP_ERROR, fsavetocredman : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetEncryptedPassword(dwsizeofpassword : u32, szpassword : windows_sys::core::PCWSTR, ppszencpassword : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetIdentity(dwversion : u32, dwflags : u32, eapmethodtype : EAP_METHOD_TYPE, dwsizeofconnectiondata : u32, pconnectiondata : *const u8, dwsizeofuserdata : u32, puserdata : *const u8, htokenimpersonateuser : super::super::Foundation:: HANDLE, pfinvokeui : *mut windows_sys::core::BOOL, pdwsizeofuserdataout : *mut u32, ppuserdataout : *mut *mut u8, ppwszidentity : *mut windows_sys::core::PWSTR, ppeaperror : *mut *mut EAP_ERROR, ppvreserved : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerGetMethodProperties(dwversion : u32, dwflags : u32, eapmethodtype : EAP_METHOD_TYPE, huserimpersonationtoken : super::super::Foundation:: HANDLE, dweapconndatasize : u32, pbeapconndata : *const u8, dwuserdatasize : u32, pbuserdata : *const u8, pmethodpropertyarray : *mut EAP_METHOD_PROPERTY_ARRAY, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerGetMethods(peapmethodinfoarray : *mut EAP_METHOD_INFO_ARRAY, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetResponseAttributes(sessionhandle : u32, pattribs : *mut EAP_ATTRIBUTES, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetResult(sessionhandle : u32, reason : EapHostPeerMethodResultReason, ppresult : *mut EapHostPeerMethodResult, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetSendPacket(sessionhandle : u32, pcbsendpacket : *mut u32, ppsendpacket : *mut *mut u8, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerGetUIContext(sessionhandle : u32, pdwsizeofuicontextdata : *mut u32, ppuicontextdata : *mut *mut u8, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerInitialize() -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerInvokeConfigUI(hwndparent : super::super::Foundation:: HWND, dwflags : u32, eapmethodtype : EAP_METHOD_TYPE, dwsizeofconfigin : u32, pconfigin : *const u8, pdwsizeofconfigout : *mut u32, ppconfigout : *mut *mut u8, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerInvokeIdentityUI(dwversion : u32, eapmethodtype : EAP_METHOD_TYPE, dwflags : u32, hwndparent : super::super::Foundation:: HWND, dwsizeofconnectiondata : u32, pconnectiondata : *const u8, dwsizeofuserdata : u32, puserdata : *const u8, pdwsizeofuserdataout : *mut u32, ppuserdataout : *mut *mut u8, ppwszidentity : *mut windows_sys::core::PWSTR, ppeaperror : *mut *mut EAP_ERROR, ppvreserved : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerInvokeInteractiveUI(hwndparent : super::super::Foundation:: HWND, dwsizeofuicontextdata : u32, puicontextdata : *const u8, pdwsizeofdatafrominteractiveui : *mut u32, ppdatafrominteractiveui : *mut *mut u8, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerProcessReceivedPacket(sessionhandle : u32, cbreceivepacket : u32, preceivepacket : *const u8, peapoutput : *mut EapHostPeerResponseAction, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerQueryCredentialInputFields(huserimpersonationtoken : super::super::Foundation:: HANDLE, eapmethodtype : EAP_METHOD_TYPE, dwflags : u32, dweapconndatasize : u32, pbeapconndata : *const u8, peapconfiginputfieldarray : *mut EAP_CONFIG_INPUT_FIELD_ARRAY, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerQueryInteractiveUIInputFields(dwversion : u32, dwflags : u32, dwsizeofuicontextdata : u32, puicontextdata : *const u8, peapinteractiveuidata : *mut EAP_INTERACTIVE_UI_DATA, ppeaperror : *mut *mut EAP_ERROR, ppvreserved : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion : u32, dwflags : u32, dwsizeofuicontextdata : u32, puicontextdata : *const u8, peapinteractiveuidata : *const EAP_INTERACTIVE_UI_DATA, pdwsizeofdatafrominteractiveui : *mut u32, ppdatafrominteractiveui : *mut *mut u8, ppeaperror : *mut *mut EAP_ERROR, ppvreserved : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("eappcfg.dll" "system" fn EapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken : super::super::Foundation:: HANDLE, eapmethodtype : EAP_METHOD_TYPE, dwflags : u32, dweapconndatasize : u32, pbeapconndata : *const u8, peapconfiginputfieldarray : *const EAP_CONFIG_INPUT_FIELD_ARRAY, pdwuserblobsize : *mut u32, ppbuserblob : *mut *mut u8, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerSetResponseAttributes(sessionhandle : u32, pattribs : *const EAP_ATTRIBUTES, peapoutput : *mut EapHostPeerResponseAction, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerSetUIContext(sessionhandle : u32, dwsizeofuicontextdata : u32, puicontextdata : *const u8, peapoutput : *mut EapHostPeerResponseAction, ppeaperror : *mut *mut EAP_ERROR) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("eappprxy.dll" "system" fn EapHostPeerUninitialize());

public const val `CERTIFICATE_HASH_LENGTH`: UInt = 20u;
public const val `EAPACTION_Authenticate`: `PPP_EAP_ACTION` = 1;
public const val `EAPACTION_Done`: `PPP_EAP_ACTION` = 2;
public const val `EAPACTION_IndicateIdentity`: `PPP_EAP_ACTION` = 8;
public const val `EAPACTION_IndicateTLV`: `PPP_EAP_ACTION` = 7;
public const val `EAPACTION_NoAction`: `PPP_EAP_ACTION` = 0;
public const val `EAPACTION_Send`: `PPP_EAP_ACTION` = 4;
public const val `EAPACTION_SendAndDone`: `PPP_EAP_ACTION` = 3;
public const val `EAPACTION_SendWithTimeout`: `PPP_EAP_ACTION` = 5;
public const val `EAPACTION_SendWithTimeoutInteractive`: `PPP_EAP_ACTION` = 6;
public const val `EAPCODE_Failure`: UInt = 4u;
public const val `EAPCODE_Request`: UInt = 1u;
public const val `EAPCODE_Response`: UInt = 2u;
public const val `EAPCODE_Success`: UInt = 3u;
// UNSUPPORTED Rust 44:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EAPHOST_AUTH_INFO {
//     pub status: EAPHOST_AUTH_STATUS,
//     pub dwErrorCode: u32,
//     pub dwReasonCode: u32,
// }

public typealias `EAPHOST_AUTH_STATUS` = Int;
// UNSUPPORTED Rust 52:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAPHOST_IDENTITY_UI_PARAMS {
//     pub eapMethodType: EAP_METHOD_TYPE,
//     pub dwFlags: u32,
//     pub dwSizeofConnectionData: u32,
//     pub pConnectionData: *mut u8,
//     pub dwSizeofUserData: u32,
//     pub pUserData: *mut u8,
//     pub dwSizeofUserDataOut: u32,
//     pub pUserDataOut: *mut u8,
//     pub pwszIdentity: windows_sys::core::PWSTR,
//     pub dwError: u32,
//     pub pEapError: *mut EAP_ERROR,
// }

// UNSUPPORTED Rust 67:1: declaration Impl has no candidate rule
// impl Default for EAPHOST_IDENTITY_UI_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 72:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAPHOST_INTERACTIVE_UI_PARAMS {
//     pub dwSizeofContextData: u32,
//     pub pContextData: *mut u8,
//     pub dwSizeofInteractiveUIData: u32,
//     pub pInteractiveUIData: *mut u8,
//     pub dwError: u32,
//     pub pEapError: *mut EAP_ERROR,
// }

// UNSUPPORTED Rust 82:1: declaration Impl has no candidate rule
// impl Default for EAPHOST_INTERACTIVE_UI_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EAPHOST_METHOD_API_VERSION`: UInt = 1u;
public const val `EAPHOST_PEER_API_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 89:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_ATTRIBUTE {
//     pub eaType: EAP_ATTRIBUTE_TYPE,
//     pub dwLength: u32,
//     pub pValue: *mut u8,
// }

// UNSUPPORTED Rust 96:1: declaration Impl has no candidate rule
// impl Default for EAP_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_ATTRIBUTES {
//     pub dwNumberOfAttributes: u32,
//     pub pAttribs: *mut EAP_ATTRIBUTE,
// }

// UNSUPPORTED Rust 107:1: declaration Impl has no candidate rule
// impl Default for EAP_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EAP_ATTRIBUTE_TYPE` = Int;
// UNSUPPORTED Rust 113:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_AUTHENTICATOR_METHOD_ROUTINES {
//     pub dwSizeInBytes: u32,
//     pub pEapType: *mut EAP_METHOD_TYPE,
//     pub EapMethodAuthenticatorInitialize: isize,
//     pub EapMethodAuthenticatorBeginSession: isize,
//     pub EapMethodAuthenticatorUpdateInnerMethodParams: isize,
//     pub EapMethodAuthenticatorReceivePacket: isize,
//     pub EapMethodAuthenticatorSendPacket: isize,
//     pub EapMethodAuthenticatorGetAttributes: isize,
//     pub EapMethodAuthenticatorSetAttributes: isize,
//     pub EapMethodAuthenticatorGetResult: isize,
//     pub EapMethodAuthenticatorEndSession: isize,
//     pub EapMethodAuthenticatorShutdown: isize,
// }

// UNSUPPORTED Rust 129:1: declaration Impl has no candidate rule
// impl Default for EAP_AUTHENTICATOR_METHOD_ROUTINES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EAP_AUTHENTICATOR_SEND_TIMEOUT` = Int;
public const val `EAP_AUTHENTICATOR_SEND_TIMEOUT_BASIC`: `EAP_AUTHENTICATOR_SEND_TIMEOUT` = 1;
public const val `EAP_AUTHENTICATOR_SEND_TIMEOUT_INTERACTIVE`: `EAP_AUTHENTICATOR_SEND_TIMEOUT` = 2;
public const val `EAP_AUTHENTICATOR_SEND_TIMEOUT_NONE`: `EAP_AUTHENTICATOR_SEND_TIMEOUT` = 0;
// UNSUPPORTED Rust 138:1: non-scalar type Ptr unsupported
// pub const EAP_AUTHENTICATOR_VALUENAME_CONFIGUI: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthenticatorConfigUIPath");

// UNSUPPORTED Rust 139:1: non-scalar type Ptr unsupported
// pub const EAP_AUTHENTICATOR_VALUENAME_DLL_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthenticatorDllPath");

// UNSUPPORTED Rust 140:1: non-scalar type Ptr unsupported
// pub const EAP_AUTHENTICATOR_VALUENAME_FRIENDLY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthenticatorFriendlyName");

// UNSUPPORTED Rust 141:1: non-scalar type Ptr unsupported
// pub const EAP_AUTHENTICATOR_VALUENAME_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Properties");

public const val `EAP_CERTIFICATE_CREDENTIAL`: `EapCredentialType` = 3;
// UNSUPPORTED Rust 143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_CONFIG_INPUT_FIELD_ARRAY {
//     pub dwVersion: u32,
//     pub dwNumberOfFields: u32,
//     pub pFields: *mut EAP_CONFIG_INPUT_FIELD_DATA,
// }

// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule
// impl Default for EAP_CONFIG_INPUT_FIELD_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_CONFIG_INPUT_FIELD_DATA {
//     pub dwSize: u32,
//     pub Type: EAP_CONFIG_INPUT_FIELD_TYPE,
//     pub dwFlagProps: u32,
//     pub pwszLabel: windows_sys::core::PWSTR,
//     pub pwszData: windows_sys::core::PWSTR,
//     pub dwMinDataLength: u32,
//     pub dwMaxDataLength: u32,
// }

// UNSUPPORTED Rust 166:1: declaration Impl has no candidate rule
// impl Default for EAP_CONFIG_INPUT_FIELD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EAP_CONFIG_INPUT_FIELD_PROPS_DEFAULT`: UInt = 0u;
public const val `EAP_CONFIG_INPUT_FIELD_PROPS_NON_DISPLAYABLE`: UInt = 1u;
public const val `EAP_CONFIG_INPUT_FIELD_PROPS_NON_PERSIST`: UInt = 2u;
public typealias `EAP_CONFIG_INPUT_FIELD_TYPE` = Int;
public const val `EAP_CREDENTIAL_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EAP_CRED_EXPIRY_REQ {
//     pub curCreds: EAP_CONFIG_INPUT_FIELD_ARRAY,
//     pub newCreds: EAP_CONFIG_INPUT_FIELD_ARRAY,
// }

public const val `EAP_EMPTY_CREDENTIAL`: `EapCredentialType` = 0;
// UNSUPPORTED Rust 183:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_ERROR {
//     pub dwWinError: u32,
//     pub r#type: EAP_METHOD_TYPE,
//     pub dwReasonCode: u32,
//     pub rootCauseGuid: windows_sys::core::GUID,
//     pub repairGuid: windows_sys::core::GUID,
//     pub helpLinkGuid: windows_sys::core::GUID,
//     pub pRootCauseString: windows_sys::core::PWSTR,
//     pub pRepairString: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule
// impl Default for EAP_ERROR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EAP_E_AUTHENTICATION_FAILED`: UInt = 2151809045u;
public const val `EAP_E_CERT_STORE_INACCESSIBLE`: UInt = 2151809040u;
public const val `EAP_E_EAPHOST_EAPQEC_INACCESSIBLE`: UInt = 2151809043u;
public const val `EAP_E_EAPHOST_FIRST`: Int = -2143158272;
public const val `EAP_E_EAPHOST_IDENTITY_UNKNOWN`: UInt = 2151809044u;
public const val `EAP_E_EAPHOST_LAST`: Int = -2143158017;
public const val `EAP_E_EAPHOST_METHOD_INVALID_PACKET`: UInt = 2151809047u;
public const val `EAP_E_EAPHOST_METHOD_NOT_INSTALLED`: UInt = 2151809041u;
public const val `EAP_E_EAPHOST_METHOD_OPERATION_NOT_SUPPORTED`: UInt = 2151809056u;
public const val `EAP_E_EAPHOST_REMOTE_INVALID_PACKET`: UInt = 2151809048u;
public const val `EAP_E_EAPHOST_THIRDPARTY_METHOD_HOST_RESET`: UInt = 2151809042u;
public const val `EAP_E_EAPHOST_XML_MALFORMED`: UInt = 2151809049u;
public const val `EAP_E_METHOD_CONFIG_DOES_NOT_SUPPORT_SSO`: UInt = 2151809050u;
public const val `EAP_E_NO_SMART_CARD_READER`: UInt = 2151809299u;
public const val `EAP_E_SERVER_CERT_EXPIRED`: UInt = 2151809538u;
public const val `EAP_E_SERVER_CERT_INVALID`: UInt = 2151809537u;
public const val `EAP_E_SERVER_CERT_NOT_FOUND`: UInt = 2151809536u;
public const val `EAP_E_SERVER_CERT_OTHER_ERROR`: UInt = 2151809540u;
public const val `EAP_E_SERVER_CERT_REVOKED`: UInt = 2151809539u;
public const val `EAP_E_SERVER_FIRST`: Int = -2143157760;
public const val `EAP_E_SERVER_LAST`: Int = -2143157505;
public const val `EAP_E_SERVER_ROOT_CERT_FIRST`: Int = -2143157248;
public const val `EAP_E_SERVER_ROOT_CERT_INVALID`: UInt = 2151810049u;
public const val `EAP_E_SERVER_ROOT_CERT_LAST`: Int = -2143156993;
public const val `EAP_E_SERVER_ROOT_CERT_NAME_REQUIRED`: UInt = 2151810054u;
public const val `EAP_E_SERVER_ROOT_CERT_NOT_FOUND`: UInt = 2151810048u;
public const val `EAP_E_SIM_NOT_VALID`: UInt = 2151810304u;
public const val `EAP_E_USER_CERT_EXPIRED`: UInt = 2151809282u;
public const val `EAP_E_USER_CERT_INVALID`: UInt = 2151809281u;
public const val `EAP_E_USER_CERT_NOT_FOUND`: UInt = 2151809280u;
public const val `EAP_E_USER_CERT_OTHER_ERROR`: UInt = 2151809284u;
public const val `EAP_E_USER_CERT_REJECTED`: UInt = 2151809285u;
public const val `EAP_E_USER_CERT_REVOKED`: UInt = 2151809283u;
public const val `EAP_E_USER_CREDENTIALS_REJECTED`: UInt = 2151809297u;
public const val `EAP_E_USER_FIRST`: Int = -2143158016;
public const val `EAP_E_USER_LAST`: Int = -2143157761;
public const val `EAP_E_USER_NAME_PASSWORD_REJECTED`: UInt = 2151809298u;
public const val `EAP_E_USER_ROOT_CERT_EXPIRED`: UInt = 2151809794u;
public const val `EAP_E_USER_ROOT_CERT_FIRST`: Int = -2143157504;
public const val `EAP_E_USER_ROOT_CERT_INVALID`: UInt = 2151809793u;
public const val `EAP_E_USER_ROOT_CERT_LAST`: Int = -2143157249;
public const val `EAP_E_USER_ROOT_CERT_NOT_FOUND`: UInt = 2151809792u;
public const val `EAP_FLAG_CONFG_READONLY`: UInt = 524288u;
public const val `EAP_FLAG_FULL_AUTH`: UInt = 4096u;
public const val `EAP_FLAG_GUEST_ACCESS`: UInt = 64u;
public const val `EAP_FLAG_LOGON`: UInt = 4u;
public const val `EAP_FLAG_MACHINE_AUTH`: UInt = 32u;
public const val `EAP_FLAG_NON_INTERACTIVE`: UInt = 2u;
public const val `EAP_FLAG_ONLY_EAP_TLS`: UInt = 16777216u;
public const val `EAP_FLAG_PREFER_ALT_CREDENTIALS`: UInt = 8192u;
public const val `EAP_FLAG_PREVIEW`: UInt = 8u;
public const val `EAP_FLAG_PRE_LOGON`: UInt = 131072u;
public const val `EAP_FLAG_RESUME_FROM_HIBERNATE`: UInt = 512u;
public const val `EAP_FLAG_Reserved1`: UInt = 1u;
public const val `EAP_FLAG_Reserved2`: UInt = 16u;
public const val `EAP_FLAG_Reserved3`: UInt = 128u;
public const val `EAP_FLAG_Reserved4`: UInt = 256u;
public const val `EAP_FLAG_Reserved5`: UInt = 1024u;
public const val `EAP_FLAG_Reserved6`: UInt = 2048u;
public const val `EAP_FLAG_Reserved7`: UInt = 16384u;
public const val `EAP_FLAG_Reserved8`: UInt = 1048576u;
public const val `EAP_FLAG_Reserved9`: UInt = 4194304u;
public const val `EAP_FLAG_SERVER_VALIDATION_REQUIRED`: UInt = 33554432u;
public const val `EAP_FLAG_SUPRESS_UI`: UInt = 65536u;
public const val `EAP_FLAG_USER_AUTH`: UInt = 262144u;
public const val `EAP_FLAG_VPN`: UInt = 8388608u;
public const val `EAP_GROUP_MASK`: Int = 65280;
// UNSUPPORTED Rust 267:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_INTERACTIVE_UI_DATA {
//     pub dwVersion: u32,
//     pub dwSize: u32,
//     pub dwDataType: EAP_INTERACTIVE_UI_DATA_TYPE,
//     pub cbUiData: u32,
//     pub pbUiData: EAP_UI_DATA_FORMAT,
// }

// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule
// impl Default for EAP_INTERACTIVE_UI_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EAP_INTERACTIVE_UI_DATA_TYPE` = Int;
public const val `EAP_INTERACTIVE_UI_DATA_VERSION`: UInt = 1u;
public const val `EAP_INVALID_PACKET`: UInt = 2151809048u;
public const val `EAP_I_EAPHOST_EAP_NEGOTIATION_FAILED`: UInt = 1078067222u;
public const val `EAP_I_EAPHOST_FIRST`: Int = -2143158272;
public const val `EAP_I_EAPHOST_LAST`: Int = -2143158017;
public const val `EAP_I_USER_ACCOUNT_OTHER_ERROR`: UInt = 1078067472u;
public const val `EAP_I_USER_FIRST`: Int = 1078067456;
public const val `EAP_I_USER_LAST`: Int = 1078067711;
public const val `EAP_METHOD_AUTHENTICATOR_CONFIG_IS_IDENTITY_PRIVACY`: UInt = 1u;
public typealias `EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION` = Int;
public const val `EAP_METHOD_AUTHENTICATOR_RESPONSE_AUTHENTICATE`: `EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION` = 4;
public const val `EAP_METHOD_AUTHENTICATOR_RESPONSE_DISCARD`: `EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION` = 0;
public const val `EAP_METHOD_AUTHENTICATOR_RESPONSE_HANDLE_IDENTITY`: `EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION` = 5;
public const val `EAP_METHOD_AUTHENTICATOR_RESPONSE_RESPOND`: `EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION` = 3;
public const val `EAP_METHOD_AUTHENTICATOR_RESPONSE_RESULT`: `EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION` = 2;
public const val `EAP_METHOD_AUTHENTICATOR_RESPONSE_SEND`: `EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION` = 1;
// UNSUPPORTED Rust 298:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_AUTHENTICATOR_RESULT {
//     pub fIsSuccess: windows_sys::core::BOOL,
//     pub dwFailureReason: u32,
//     pub pAuthAttribs: *mut EAP_ATTRIBUTES,
// }

// UNSUPPORTED Rust 305:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_AUTHENTICATOR_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_INFO {
//     pub eaptype: EAP_METHOD_TYPE,
//     pub pwszAuthorName: windows_sys::core::PWSTR,
//     pub pwszFriendlyName: windows_sys::core::PWSTR,
//     pub eapProperties: u32,
//     pub pInnerMethodInfo: *mut EAP_METHOD_INFO,
// }

// UNSUPPORTED Rust 319:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 324:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_INFO_ARRAY {
//     pub dwNumberOfMethods: u32,
//     pub pEapMethods: *mut EAP_METHOD_INFO,
// }

// UNSUPPORTED Rust 330:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_INFO_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 335:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_INFO_ARRAY_EX {
//     pub dwNumberOfMethods: u32,
//     pub pEapMethods: *mut EAP_METHOD_INFO_EX,
// }

// UNSUPPORTED Rust 341:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_INFO_ARRAY_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_INFO_EX {
//     pub eaptype: EAP_METHOD_TYPE,
//     pub pwszAuthorName: windows_sys::core::PWSTR,
//     pub pwszFriendlyName: windows_sys::core::PWSTR,
//     pub eapProperties: u32,
//     pub pInnerMethodInfoArray: *mut EAP_METHOD_INFO_ARRAY_EX,
// }

// UNSUPPORTED Rust 355:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EAP_METHOD_INVALID_PACKET`: UInt = 2151809047u;
// UNSUPPORTED Rust 361:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_PROPERTY {
//     pub eapMethodPropertyType: EAP_METHOD_PROPERTY_TYPE,
//     pub eapMethodPropertyValueType: EAP_METHOD_PROPERTY_VALUE_TYPE,
//     pub eapMethodPropertyValue: EAP_METHOD_PROPERTY_VALUE,
// }

// UNSUPPORTED Rust 368:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_PROPERTY_ARRAY {
//     pub dwNumberOfProperties: u32,
//     pub pMethodProperty: *mut EAP_METHOD_PROPERTY,
// }

// UNSUPPORTED Rust 379:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_PROPERTY_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EAP_METHOD_PROPERTY_TYPE` = Int;
// UNSUPPORTED Rust 385:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EAP_METHOD_PROPERTY_VALUE {
//     pub empvBool: EAP_METHOD_PROPERTY_VALUE_BOOL,
//     pub empvDword: EAP_METHOD_PROPERTY_VALUE_DWORD,
//     pub empvString: EAP_METHOD_PROPERTY_VALUE_STRING,
// }

// UNSUPPORTED Rust 392:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_PROPERTY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 397:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EAP_METHOD_PROPERTY_VALUE_BOOL {
//     pub length: u32,
//     pub value: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EAP_METHOD_PROPERTY_VALUE_DWORD {
//     pub length: u32,
//     pub value: u32,
// }

// UNSUPPORTED Rust 409:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_METHOD_PROPERTY_VALUE_STRING {
//     pub length: u32,
//     pub value: *mut u8,
// }

// UNSUPPORTED Rust 415:1: declaration Impl has no candidate rule
// impl Default for EAP_METHOD_PROPERTY_VALUE_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EAP_METHOD_PROPERTY_VALUE_TYPE` = Int;
// UNSUPPORTED Rust 421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EAP_METHOD_TYPE {
//     pub eapType: EAP_TYPE,
//     pub dwAuthorId: u32,
// }

public const val `EAP_PEER_FLAG_GUEST_ACCESS`: UInt = 64u;
public const val `EAP_PEER_FLAG_HEALTH_STATE_CHANGE`: UInt = 32768u;
// UNSUPPORTED Rust 429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EAP_PEER_METHOD_ROUTINES {
//     pub dwVersion: u32,
//     pub pEapType: *mut EAP_TYPE,
//     pub EapPeerInitialize: isize,
//     pub EapPeerGetIdentity: isize,
//     pub EapPeerBeginSession: isize,
//     pub EapPeerSetCredentials: isize,
//     pub EapPeerProcessRequestPacket: isize,
//     pub EapPeerGetResponsePacket: isize,
//     pub EapPeerGetResult: isize,
//     pub EapPeerGetUIContext: isize,
//     pub EapPeerSetUIContext: isize,
//     pub EapPeerGetResponseAttributes: isize,
//     pub EapPeerSetResponseAttributes: isize,
//     pub EapPeerEndSession: isize,
//     pub EapPeerShutdown: isize,
// }

// UNSUPPORTED Rust 448:1: declaration Impl has no candidate rule
// impl Default for EAP_PEER_METHOD_ROUTINES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 453:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_CONFIGUI: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerConfigUIPath");

// UNSUPPORTED Rust 454:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_DLL_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerDllPath");

// UNSUPPORTED Rust 455:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_FRIENDLY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerFriendlyName");

// UNSUPPORTED Rust 456:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_IDENTITY: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerIdentityPath");

// UNSUPPORTED Rust 457:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_INTERACTIVEUI: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerInteractiveUIPath");

// UNSUPPORTED Rust 458:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_INVOKE_NAMEDLG: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerInvokeUsernameDialog");

// UNSUPPORTED Rust 459:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_INVOKE_PWDDLG: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerInvokePasswordDialog");

// UNSUPPORTED Rust 460:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Properties");

// UNSUPPORTED Rust 461:1: non-scalar type Ptr unsupported
// pub const EAP_PEER_VALUENAME_REQUIRE_CONFIGUI: windows_sys::core::PCWSTR = windows_sys::core::w!("PeerRequireConfigUI");

// UNSUPPORTED Rust 462:1: non-scalar type Ptr unsupported
// pub const EAP_REGISTRY_LOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\EapHost\\Methods");

public const val `EAP_SIM_CREDENTIAL`: `EapCredentialType` = 4;
// UNSUPPORTED Rust 464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EAP_TYPE {
//     pub r#type: u8,
//     pub dwVendorId: u32,
//     pub dwVendorType: u32,
// }

// UNSUPPORTED Rust 471:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EAP_UI_DATA_FORMAT {
//     pub credData: *mut EAP_CONFIG_INPUT_FIELD_ARRAY,
//     pub credExpiryData: *mut EAP_CRED_EXPIRY_REQ,
//     pub credLogonData: *mut EAP_CONFIG_INPUT_FIELD_ARRAY,
// }

// UNSUPPORTED Rust 478:1: declaration Impl has no candidate rule
// impl Default for EAP_UI_DATA_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EAP_UI_INPUT_FIELD_PROPS_DEFAULT`: UInt = 0u;
public const val `EAP_UI_INPUT_FIELD_PROPS_NON_DISPLAYABLE`: UInt = 1u;
public const val `EAP_UI_INPUT_FIELD_PROPS_NON_PERSIST`: UInt = 2u;
public const val `EAP_UI_INPUT_FIELD_PROPS_READ_ONLY`: UInt = 4u;
public const val `EAP_USERNAME_PASSWORD_CREDENTIAL`: `EapCredentialType` = 1;
// UNSUPPORTED Rust 488:1: non-scalar type Ptr unsupported
// pub const EAP_VALUENAME_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Properties");

public const val `EAP_WINLOGON_CREDENTIAL`: `EapCredentialType` = 2;
// UNSUPPORTED Rust 490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EapCertificateCredential {
//     pub certHash: [u8; 20],
//     pub password: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 496:1: declaration Impl has no candidate rule
// impl Default for EapCertificateCredential {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EapCode` = Int;
public const val `EapCodeFailure`: `EapCode` = 4;
public const val `EapCodeMaximum`: `EapCode` = 4;
public const val `EapCodeMinimum`: `EapCode` = 1;
public const val `EapCodeRequest`: `EapCode` = 1;
public const val `EapCodeResponse`: `EapCode` = 2;
public const val `EapCodeSuccess`: `EapCode` = 3;
public const val `EapConfigInputEdit`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 6;
public const val `EapConfigInputNetworkPassword`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 3;
public const val `EapConfigInputNetworkUsername`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 2;
public const val `EapConfigInputPSK`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 5;
public const val `EapConfigInputPassword`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 1;
public const val `EapConfigInputPin`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 4;
public const val `EapConfigInputUsername`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 0;
public const val `EapConfigSmartCardError`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 8;
public const val `EapConfigSmartCardUsername`: `EAP_CONFIG_INPUT_FIELD_TYPE` = 7;
public const val `EapCredExpiryReq`: `EAP_INTERACTIVE_UI_DATA_TYPE` = 2;
public const val `EapCredExpiryResp`: `EAP_INTERACTIVE_UI_DATA_TYPE` = 3;
public const val `EapCredLogonReq`: `EAP_INTERACTIVE_UI_DATA_TYPE` = 4;
public const val `EapCredLogonResp`: `EAP_INTERACTIVE_UI_DATA_TYPE` = 5;
public const val `EapCredReq`: `EAP_INTERACTIVE_UI_DATA_TYPE` = 0;
public const val `EapCredResp`: `EAP_INTERACTIVE_UI_DATA_TYPE` = 1;
// UNSUPPORTED Rust 523:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EapCredential {
//     pub credType: EapCredentialType,
//     pub credData: EapCredentialTypeData,
// }

// UNSUPPORTED Rust 529:1: declaration Impl has no candidate rule
// impl Default for EapCredential {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EapCredentialType` = Int;
// UNSUPPORTED Rust 535:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EapCredentialTypeData {
//     pub username_password: EapUsernamePasswordCredential,
//     pub certificate: EapCertificateCredential,
//     pub sim: EapSimCredential,
// }

// UNSUPPORTED Rust 542:1: declaration Impl has no candidate rule
// impl Default for EapCredentialTypeData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EapHostAuthFailed`: `EAPHOST_AUTH_STATUS` = 6;
public const val `EapHostAuthIdentityExchange`: `EAPHOST_AUTH_STATUS` = 2;
public const val `EapHostAuthInProgress`: `EAPHOST_AUTH_STATUS` = 4;
public const val `EapHostAuthNegotiatingType`: `EAPHOST_AUTH_STATUS` = 3;
public const val `EapHostAuthNotStarted`: `EAPHOST_AUTH_STATUS` = 1;
public const val `EapHostAuthSucceeded`: `EAPHOST_AUTH_STATUS` = 5;
public const val `EapHostInvalidSession`: `EAPHOST_AUTH_STATUS` = 0;
public const val `EapHostNapInfo`: `EapHostPeerAuthParams` = 4;
public typealias `EapHostPeerAuthParams` = Int;
public const val `EapHostPeerAuthStatus`: `EapHostPeerAuthParams` = 1;
public const val `EapHostPeerIdentity`: `EapHostPeerAuthParams` = 2;
public const val `EapHostPeerIdentityExtendedInfo`: `EapHostPeerAuthParams` = 3;
// UNSUPPORTED Rust 559:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EapHostPeerMethodResult {
//     pub fIsSuccess: windows_sys::core::BOOL,
//     pub dwFailureReasonCode: u32,
//     pub fSaveConnectionData: windows_sys::core::BOOL,
//     pub dwSizeofConnectionData: u32,
//     pub pConnectionData: *mut u8,
//     pub fSaveUserData: windows_sys::core::BOOL,
//     pub dwSizeofUserData: u32,
//     pub pUserData: *mut u8,
//     pub pAttribArray: *mut EAP_ATTRIBUTES,
//     pub isolationState: ISOLATION_STATE,
//     pub pEapMethodInfo: *mut EAP_METHOD_INFO,
//     pub pEapError: *mut EAP_ERROR,
// }

// UNSUPPORTED Rust 575:1: declaration Impl has no candidate rule
// impl Default for EapHostPeerMethodResult {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EapHostPeerMethodResultAltSuccessReceived`: `EapHostPeerMethodResultReason` = 1;
public const val `EapHostPeerMethodResultFromMethod`: `EapHostPeerMethodResultReason` = 3;
public typealias `EapHostPeerMethodResultReason` = Int;
public const val `EapHostPeerMethodResultTimeout`: `EapHostPeerMethodResultReason` = 2;
public typealias `EapHostPeerResponseAction` = Int;
public const val `EapHostPeerResponseDiscard`: `EapHostPeerResponseAction` = 0;
public const val `EapHostPeerResponseInvokeUi`: `EapHostPeerResponseAction` = 3;
public const val `EapHostPeerResponseNone`: `EapHostPeerResponseAction` = 6;
public const val `EapHostPeerResponseRespond`: `EapHostPeerResponseAction` = 4;
public const val `EapHostPeerResponseResult`: `EapHostPeerResponseAction` = 2;
public const val `EapHostPeerResponseSend`: `EapHostPeerResponseAction` = 1;
public const val `EapHostPeerResponseStartAuthentication`: `EapHostPeerResponseAction` = 5;
// UNSUPPORTED Rust 592:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EapPacket {
//     pub Code: u8,
//     pub Id: u8,
//     pub Length: [u8; 2],
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 600:1: declaration Impl has no candidate rule
// impl Default for EapPacket {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 605:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EapPeerMethodOutput {
//     pub action: EapPeerMethodResponseAction,
//     pub fAllowNotifications: windows_sys::core::BOOL,
// }

public typealias `EapPeerMethodResponseAction` = Int;
public const val `EapPeerMethodResponseActionDiscard`: `EapPeerMethodResponseAction` = 0;
public const val `EapPeerMethodResponseActionInvokeUI`: `EapPeerMethodResponseAction` = 3;
public const val `EapPeerMethodResponseActionNone`: `EapPeerMethodResponseAction` = 5;
public const val `EapPeerMethodResponseActionRespond`: `EapPeerMethodResponseAction` = 4;
public const val `EapPeerMethodResponseActionResult`: `EapPeerMethodResponseAction` = 2;
public const val `EapPeerMethodResponseActionSend`: `EapPeerMethodResponseAction` = 1;
// UNSUPPORTED Rust 618:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct EapPeerMethodResult {
//     pub fIsSuccess: windows_sys::core::BOOL,
//     pub dwFailureReasonCode: u32,
//     pub fSaveConnectionData: windows_sys::core::BOOL,
//     pub dwSizeofConnectionData: u32,
//     pub pConnectionData: *mut u8,
//     pub fSaveUserData: windows_sys::core::BOOL,
//     pub dwSizeofUserData: u32,
//     pub pUserData: *mut u8,
//     pub pAttribArray: *mut EAP_ATTRIBUTES,
//     pub pEapError: *mut EAP_ERROR,
//     pub pNgcKerbTicket: *mut NgcTicketContext,
//     pub fSaveToCredMan: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 635:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for EapPeerMethodResult {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EapPeerMethodResultFailure`: `EapPeerMethodResultReason` = 3;
public typealias `EapPeerMethodResultReason` = Int;
public const val `EapPeerMethodResultSuccess`: `EapPeerMethodResultReason` = 2;
public const val `EapPeerMethodResultUnknown`: `EapPeerMethodResultReason` = 1;
// UNSUPPORTED Rust 645:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EapSimCredential {
//     pub iccID: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule
// impl Default for EapSimCredential {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EapUsernamePasswordCredential {
//     pub username: windows_sys::core::PWSTR,
//     pub password: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 661:1: declaration Impl has no candidate rule
// impl Default for EapUsernamePasswordCredential {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FACILITY_EAP_MESSAGE`: UInt = 2114u;
// UNSUPPORTED Rust 667:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_CertStoreInaccessible: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000004);

// UNSUPPORTED Rust 668:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_EapNegotiationFailed: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000001c);

// UNSUPPORTED Rust 669:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_EapQecInaccessible: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000312);

// UNSUPPORTED Rust 670:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Generic_AuthFailure: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000104);

// UNSUPPORTED Rust 671:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_IdentityUnknown: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000204);

// UNSUPPORTED Rust 672:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_MethodDLLNotFound: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000001);

// UNSUPPORTED Rust 673:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_MethodDoesNotSupportOperation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000001e);

// UNSUPPORTED Rust 674:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Method_Config_Does_Not_Support_Sso: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda18bd32_004f_41fa_ae08_0bc85e5845ac);

// UNSUPPORTED Rust 675:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_No_SmartCardReader_Found: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000002b);

// UNSUPPORTED Rust 676:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Server_CertExpired: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000005);

// UNSUPPORTED Rust 677:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Server_CertInvalid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000006);

// UNSUPPORTED Rust 678:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Server_CertNotFound: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000007);

// UNSUPPORTED Rust 679:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Server_CertOtherError: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000108);

// UNSUPPORTED Rust 680:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Server_CertRevoked: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000008);

// UNSUPPORTED Rust 681:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Server_Root_CertNameRequired: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000012);

// UNSUPPORTED Rust 682:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_Server_Root_CertNotFound: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000112);

// UNSUPPORTED Rust 683:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_SimNotValid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000304);

// UNSUPPORTED Rust 684:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_ThirdPartyMethod_Host_Reset: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000212);

// UNSUPPORTED Rust 685:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_Account_OtherProblem: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000010e);

// UNSUPPORTED Rust 686:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_CertExpired: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000009);

// UNSUPPORTED Rust 687:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_CertInvalid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000000a);

// UNSUPPORTED Rust 688:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_CertNotFound: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000000b);

// UNSUPPORTED Rust 689:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_CertOtherError: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000000c);

// UNSUPPORTED Rust 690:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_CertRejected: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000000d);

// UNSUPPORTED Rust 691:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_CertRevoked: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000000e);

// UNSUPPORTED Rust 692:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_CredsRejected: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000020e);

// UNSUPPORTED Rust 693:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_Root_CertExpired: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000000f);

// UNSUPPORTED Rust 694:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_Root_CertInvalid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000010);

// UNSUPPORTED Rust 695:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_User_Root_CertNotFound: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000011);

// UNSUPPORTED Rust 696:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Cause_XmlMalformed: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000001d);

// UNSUPPORTED Rust 697:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Default: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

// UNSUPPORTED Rust 698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Help_ObtainingCerts: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf535eea3_1bdd_46ca_a2fc_a6655939b7e8);

// UNSUPPORTED Rust 699:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Help_Troubleshooting: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33307acf_0698_41ba_b014_ea0a2eb8d0a8);

// UNSUPPORTED Rust 700:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_AuthFailure: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000001f);

// UNSUPPORTED Rust 701:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_CertNameAbsent: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000029);

// UNSUPPORTED Rust 702:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_CertStoreInaccessible: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000024);

// UNSUPPORTED Rust 703:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_IdentityUnknown: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000020);

// UNSUPPORTED Rust 704:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_InvalidUserAccount: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000025);

// UNSUPPORTED Rust 705:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_InvalidUserCert: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000002c);

// UNSUPPORTED Rust 706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_MethodNotFound: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000022);

// UNSUPPORTED Rust 707:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_NegotiationFailed: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000021);

// UNSUPPORTED Rust 708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_NoSmartCardReader: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000002a);

// UNSUPPORTED Rust 709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_RootCertInvalid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000026);

// UNSUPPORTED Rust 710:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_RootCertNotFound: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000027);

// UNSUPPORTED Rust 711:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactAdmin_RootExpired: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000028);

// UNSUPPORTED Rust 712:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_ContactSysadmin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000002);

// UNSUPPORTED Rust 713:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_Method_Not_Support_Sso: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000002d);

// UNSUPPORTED Rust 714:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_No_ValidSim_Found: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000002e);

// UNSUPPORTED Rust 715:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_RestartNap: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000023);

// UNSUPPORTED Rust 716:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_Retry_Authentication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000011b);

// UNSUPPORTED Rust 717:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_Server_ClientSelectServerCert: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000018);

// UNSUPPORTED Rust 718:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_User_AuthFailure: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d800000019);

// UNSUPPORTED Rust 719:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_User_GetNewCert: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000001a);

// UNSUPPORTED Rust 720:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_EapHost_Repair_User_SelectValidCert: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9612fc67_6150_4209_a85e_a8d80000001b);

public typealias `ISOLATION_STATE` = Int;
public const val `ISOLATION_STATE_IN_PROBATION`: `ISOLATION_STATE` = 2;
public const val `ISOLATION_STATE_NOT_RESTRICTED`: `ISOLATION_STATE` = 1;
public const val `ISOLATION_STATE_RESTRICTED_ACCESS`: `ISOLATION_STATE` = 3;
public const val `ISOLATION_STATE_UNKNOWN`: `ISOLATION_STATE` = 0;
// UNSUPPORTED Rust 726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LEGACY_IDENTITY_UI_PARAMS {
//     pub eapType: u32,
//     pub dwFlags: u32,
//     pub dwSizeofConnectionData: u32,
//     pub pConnectionData: *mut u8,
//     pub dwSizeofUserData: u32,
//     pub pUserData: *mut u8,
//     pub dwSizeofUserDataOut: u32,
//     pub pUserDataOut: *mut u8,
//     pub pwszIdentity: windows_sys::core::PWSTR,
//     pub dwError: u32,
// }

// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule
// impl Default for LEGACY_IDENTITY_UI_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 745:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LEGACY_INTERACTIVE_UI_PARAMS {
//     pub eapType: u32,
//     pub dwSizeofContextData: u32,
//     pub pContextData: *mut u8,
//     pub dwSizeofInteractiveUIData: u32,
//     pub pInteractiveUIData: *mut u8,
//     pub dwError: u32,
// }

// UNSUPPORTED Rust 755:1: declaration Impl has no candidate rule
// impl Default for LEGACY_INTERACTIVE_UI_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAXEAPCODE`: UInt = 4u;
public const val `MAX_EAP_CONFIG_INPUT_FIELD_LENGTH`: UInt = 256u;
public const val `MAX_EAP_CONFIG_INPUT_FIELD_VALUE_LENGTH`: UInt = 1024u;
public const val `NCRYPT_PIN_CACHE_PIN_BYTE_LENGTH`: UInt = 90u;
// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct NgcTicketContext {
//     pub wszTicket: [u16; 45],
//     pub hKey: super::Cryptography::NCRYPT_KEY_HANDLE,
//     pub hImpersonateToken: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 772:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for NgcTicketContext {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 778:1: generic scalar type unsupported
// pub type NotificationHandler = Option<unsafe extern "system" fn(connectionid: windows_sys::core::GUID, pcontextdata: *mut core::ffi::c_void)>;

public typealias `PPP_EAP_ACTION` = Int;
// UNSUPPORTED Rust 780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PPP_EAP_INFO {
//     pub dwSizeInBytes: u32,
//     pub dwEapTypeId: u32,
//     pub RasEapInitialize: isize,
//     pub RasEapBegin: isize,
//     pub RasEapEnd: isize,
//     pub RasEapMakeMessage: isize,
// }

// UNSUPPORTED Rust 790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_EAP_INPUT {
//     pub dwSizeInBytes: u32,
//     pub fFlags: u32,
//     pub fAuthenticator: windows_sys::core::BOOL,
//     pub pwszIdentity: windows_sys::core::PWSTR,
//     pub pwszPassword: windows_sys::core::PWSTR,
//     pub bInitialId: u8,
//     pub pUserAttributes: *mut RAS_AUTH_ATTRIBUTE,
//     pub fAuthenticationComplete: windows_sys::core::BOOL,
//     pub dwAuthResultCode: u32,
//     pub hTokenImpersonateUser: super::super::Foundation::HANDLE,
//     pub fSuccessPacketReceived: windows_sys::core::BOOL,
//     pub fDataReceivedFromInteractiveUI: windows_sys::core::BOOL,
//     pub pDataFromInteractiveUI: *mut u8,
//     pub dwSizeOfDataFromInteractiveUI: u32,
//     pub pConnectionData: *mut u8,
//     pub dwSizeOfConnectionData: u32,
//     pub pUserData: *mut u8,
//     pub dwSizeOfUserData: u32,
//     pub hReserved: super::super::Foundation::HANDLE,
//     pub guidConnectionId: windows_sys::core::GUID,
//     pub isVpn: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 815:1: declaration Impl has no candidate rule
// impl Default for PPP_EAP_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 820:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct PPP_EAP_OUTPUT {
//     pub dwSizeInBytes: u32,
//     pub Action: PPP_EAP_ACTION,
//     pub dwAuthResultCode: u32,
//     pub pUserAttributes: *mut RAS_AUTH_ATTRIBUTE,
//     pub fInvokeInteractiveUI: windows_sys::core::BOOL,
//     pub pUIContextData: *mut u8,
//     pub dwSizeOfUIContextData: u32,
//     pub fSaveConnectionData: windows_sys::core::BOOL,
//     pub pConnectionData: *mut u8,
//     pub dwSizeOfConnectionData: u32,
//     pub fSaveUserData: windows_sys::core::BOOL,
//     pub pUserData: *mut u8,
//     pub dwSizeOfUserData: u32,
//     pub pNgcKerbTicket: *mut NgcTicketContext,
//     pub fSaveToCredMan: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 840:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for PPP_EAP_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 846:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_EAP_PACKET {
//     pub Code: u8,
//     pub Id: u8,
//     pub Length: [u8; 2],
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 854:1: declaration Impl has no candidate rule
// impl Default for PPP_EAP_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 859:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_AUTH_ATTRIBUTE {
//     pub raaType: RAS_AUTH_ATTRIBUTE_TYPE,
//     pub dwLength: u32,
//     pub Value: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 866:1: declaration Impl has no candidate rule
// impl Default for RAS_AUTH_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RAS_AUTH_ATTRIBUTE_TYPE` = Int;
public const val `RAS_EAP_FLAG_8021X_AUTH`: UInt = 128u;
public const val `RAS_EAP_FLAG_ALTERNATIVE_USER_DB`: UInt = 2048u;
public const val `RAS_EAP_FLAG_CONFG_READONLY`: UInt = 524288u;
public const val `RAS_EAP_FLAG_FIRST_LINK`: UInt = 16u;
public const val `RAS_EAP_FLAG_GUEST_ACCESS`: UInt = 64u;
public const val `RAS_EAP_FLAG_HOSTED_IN_PEAP`: UInt = 256u;
public const val `RAS_EAP_FLAG_LOGON`: UInt = 4u;
public const val `RAS_EAP_FLAG_MACHINE_AUTH`: UInt = 32u;
public const val `RAS_EAP_FLAG_NON_INTERACTIVE`: UInt = 2u;
public const val `RAS_EAP_FLAG_PEAP_FORCE_FULL_AUTH`: UInt = 4096u;
public const val `RAS_EAP_FLAG_PEAP_UPFRONT`: UInt = 1024u;
public const val `RAS_EAP_FLAG_PREVIEW`: UInt = 8u;
public const val `RAS_EAP_FLAG_PRE_LOGON`: UInt = 131072u;
public const val `RAS_EAP_FLAG_RESERVED`: UInt = 1048576u;
public const val `RAS_EAP_FLAG_RESUME_FROM_HIBERNATE`: UInt = 512u;
public const val `RAS_EAP_FLAG_ROUTER`: UInt = 1u;
public const val `RAS_EAP_FLAG_SAVE_CREDMAN`: UInt = 2097152u;
public const val `RAS_EAP_FLAG_SERVER_VALIDATION_REQUIRED`: UInt = 33554432u;
// UNSUPPORTED Rust 890:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_REGISTRY_LOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\Rasman\\PPP\\EAP");

public const val `RAS_EAP_ROLE_AUTHENTICATEE`: UInt = 2u;
public const val `RAS_EAP_ROLE_AUTHENTICATOR`: UInt = 1u;
public const val `RAS_EAP_ROLE_EXCLUDE_IN_EAP`: UInt = 4u;
public const val `RAS_EAP_ROLE_EXCLUDE_IN_PEAP`: UInt = 8u;
public const val `RAS_EAP_ROLE_EXCLUDE_IN_VPN`: UInt = 16u;
// UNSUPPORTED Rust 896:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_CONFIGUI: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigUIPath");

// UNSUPPORTED Rust 897:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_CONFIG_CLSID: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigCLSID");

// UNSUPPORTED Rust 898:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_DEFAULT_DATA: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigData");

// UNSUPPORTED Rust 899:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_ENCRYPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("MPPEEncryptionSupported");

// UNSUPPORTED Rust 900:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_FILTER_INNERMETHODS: windows_sys::core::PCWSTR = windows_sys::core::w!("FilterInnerMethods");

// UNSUPPORTED Rust 901:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_FRIENDLY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FriendlyName");

// UNSUPPORTED Rust 902:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_IDENTITY: windows_sys::core::PCWSTR = windows_sys::core::w!("IdentityPath");

// UNSUPPORTED Rust 903:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_INTERACTIVEUI: windows_sys::core::PCWSTR = windows_sys::core::w!("InteractiveUIPath");

// UNSUPPORTED Rust 904:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_INVOKE_NAMEDLG: windows_sys::core::PCWSTR = windows_sys::core::w!("InvokeUsernameDialog");

// UNSUPPORTED Rust 905:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_INVOKE_PWDDLG: windows_sys::core::PCWSTR = windows_sys::core::w!("InvokePasswordDialog");

// UNSUPPORTED Rust 906:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_ISTUNNEL_METHOD: windows_sys::core::PCWSTR = windows_sys::core::w!("IsTunnelMethod");

// UNSUPPORTED Rust 907:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Path");

// UNSUPPORTED Rust 908:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_PER_POLICY_CONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("PerPolicyConfig");

// UNSUPPORTED Rust 909:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_REQUIRE_CONFIGUI: windows_sys::core::PCWSTR = windows_sys::core::w!("RequireConfigUI");

// UNSUPPORTED Rust 910:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_ROLES_SUPPORTED: windows_sys::core::PCWSTR = windows_sys::core::w!("RolesSupported");

// UNSUPPORTED Rust 911:1: non-scalar type Ptr unsupported
// pub const RAS_EAP_VALUENAME_STANDALONE_SUPPORTED: windows_sys::core::PCWSTR = windows_sys::core::w!("StandaloneSupported");

public const val `eapPropCertifiedMethod`: UInt = 4194304u;
public const val `eapPropChannelBinding`: UInt = 65536u;
public const val `eapPropCipherSuiteNegotiation`: UInt = 1u;
public const val `eapPropConfidentiality`: UInt = 16u;
public const val `eapPropCryptoBinding`: UInt = 8192u;
public const val `eapPropDictionaryAttackResistance`: UInt = 2048u;
public const val `eapPropFastReconnect`: UInt = 4096u;
public const val `eapPropFragmentation`: UInt = 32768u;
public const val `eapPropHiddenMethod`: UInt = 8388608u;
public const val `eapPropIdentityPrivacy`: UInt = 67108864u;
public const val `eapPropIntegrity`: UInt = 4u;
public const val `eapPropKeyDerivation`: UInt = 32u;
public const val `eapPropKeyStrength1024`: UInt = 1024u;
public const val `eapPropKeyStrength128`: UInt = 128u;
public const val `eapPropKeyStrength256`: UInt = 256u;
public const val `eapPropKeyStrength512`: UInt = 512u;
public const val `eapPropKeyStrength64`: UInt = 64u;
public const val `eapPropMachineAuth`: UInt = 16777216u;
public const val `eapPropMethodChaining`: UInt = 134217728u;
public const val `eapPropMppeEncryption`: UInt = 524288u;
public const val `eapPropMutualAuth`: UInt = 2u;
public const val `eapPropNap`: UInt = 131072u;
public const val `eapPropReplayProtection`: UInt = 8u;
public const val `eapPropReserved`: UInt = 2147483648u;
public const val `eapPropSessionIndependence`: UInt = 16384u;
public const val `eapPropSharedStateEquivalence`: UInt = 268435456u;
public const val `eapPropStandalone`: UInt = 262144u;
public const val `eapPropSupportsConfig`: UInt = 2097152u;
public const val `eapPropTunnelMethod`: UInt = 1048576u;
public const val `eapPropUserAuth`: UInt = 33554432u;
public const val `eatARAPChallengeResponse`: `EAP_ATTRIBUTE_TYPE` = 84;
public const val `eatARAPFeatures`: `EAP_ATTRIBUTE_TYPE` = 71;
public const val `eatARAPGuestLogon`: `EAP_ATTRIBUTE_TYPE` = 8096;
public const val `eatARAPPassword`: `EAP_ATTRIBUTE_TYPE` = 70;
public const val `eatARAPSecurity`: `EAP_ATTRIBUTE_TYPE` = 73;
public const val `eatARAPSecurityData`: `EAP_ATTRIBUTE_TYPE` = 74;
public const val `eatARAPZoneAccess`: `EAP_ATTRIBUTE_TYPE` = 72;
public const val `eatAcctAuthentic`: `EAP_ATTRIBUTE_TYPE` = 45;
public const val `eatAcctDelayTime`: `EAP_ATTRIBUTE_TYPE` = 41;
public const val `eatAcctEventTimeStamp`: `EAP_ATTRIBUTE_TYPE` = 55;
public const val `eatAcctInputOctets`: `EAP_ATTRIBUTE_TYPE` = 42;
public const val `eatAcctInputPackets`: `EAP_ATTRIBUTE_TYPE` = 47;
public const val `eatAcctInterimInterval`: `EAP_ATTRIBUTE_TYPE` = 85;
public const val `eatAcctLinkCount`: `EAP_ATTRIBUTE_TYPE` = 51;
public const val `eatAcctMultiSessionId`: `EAP_ATTRIBUTE_TYPE` = 50;
public const val `eatAcctOutputOctets`: `EAP_ATTRIBUTE_TYPE` = 43;
public const val `eatAcctOutputPackets`: `EAP_ATTRIBUTE_TYPE` = 48;
public const val `eatAcctSessionId`: `EAP_ATTRIBUTE_TYPE` = 44;
public const val `eatAcctSessionTime`: `EAP_ATTRIBUTE_TYPE` = 46;
public const val `eatAcctStatusType`: `EAP_ATTRIBUTE_TYPE` = 40;
public const val `eatAcctTerminateCause`: `EAP_ATTRIBUTE_TYPE` = 49;
public const val `eatCallbackId`: `EAP_ATTRIBUTE_TYPE` = 20;
public const val `eatCallbackNumber`: `EAP_ATTRIBUTE_TYPE` = 19;
public const val `eatCalledStationId`: `EAP_ATTRIBUTE_TYPE` = 30;
public const val `eatCallingStationId`: `EAP_ATTRIBUTE_TYPE` = 31;
public const val `eatCertificateOID`: `EAP_ATTRIBUTE_TYPE` = 8097;
public const val `eatCertificateThumbprint`: `EAP_ATTRIBUTE_TYPE` = 8250;
public const val `eatClass`: `EAP_ATTRIBUTE_TYPE` = 25;
public const val `eatClearTextPassword`: `EAP_ATTRIBUTE_TYPE` = 8107;
public const val `eatConfigurationToken`: `EAP_ATTRIBUTE_TYPE` = 78;
public const val `eatConnectInfo`: `EAP_ATTRIBUTE_TYPE` = 77;
public const val `eatCredentialsChanged`: `EAP_ATTRIBUTE_TYPE` = 8103;
public const val `eatEAPConfiguration`: `EAP_ATTRIBUTE_TYPE` = 8098;
public const val `eatEAPMessage`: `EAP_ATTRIBUTE_TYPE` = 79;
public const val `eatEAPTLV`: `EAP_ATTRIBUTE_TYPE` = 8102;
public const val `eatEMSK`: `EAP_ATTRIBUTE_TYPE` = 9003;
public const val `eatFastRoamedSession`: `EAP_ATTRIBUTE_TYPE` = 8100;
public const val `eatFilterId`: `EAP_ATTRIBUTE_TYPE` = 11;
public const val `eatFramedAppleTalkLink`: `EAP_ATTRIBUTE_TYPE` = 37;
public const val `eatFramedAppleTalkNetwork`: `EAP_ATTRIBUTE_TYPE` = 38;
public const val `eatFramedAppleTalkZone`: `EAP_ATTRIBUTE_TYPE` = 39;
public const val `eatFramedCompression`: `EAP_ATTRIBUTE_TYPE` = 13;
public const val `eatFramedIPAddress`: `EAP_ATTRIBUTE_TYPE` = 8;
public const val `eatFramedIPNetmask`: `EAP_ATTRIBUTE_TYPE` = 9;
public const val `eatFramedIPXNetwork`: `EAP_ATTRIBUTE_TYPE` = 23;
public const val `eatFramedIPv6Pool`: `EAP_ATTRIBUTE_TYPE` = 100;
public const val `eatFramedIPv6Prefix`: `EAP_ATTRIBUTE_TYPE` = 97;
public const val `eatFramedIPv6Route`: `EAP_ATTRIBUTE_TYPE` = 99;
public const val `eatFramedInterfaceId`: `EAP_ATTRIBUTE_TYPE` = 96;
public const val `eatFramedMTU`: `EAP_ATTRIBUTE_TYPE` = 12;
public const val `eatFramedProtocol`: `EAP_ATTRIBUTE_TYPE` = 7;
public const val `eatFramedRoute`: `EAP_ATTRIBUTE_TYPE` = 22;
public const val `eatFramedRouting`: `EAP_ATTRIBUTE_TYPE` = 10;
public const val `eatIdleTimeout`: `EAP_ATTRIBUTE_TYPE` = 28;
public const val `eatInnerEapMethodType`: `EAP_ATTRIBUTE_TYPE` = 8104;
public const val `eatLoginIPHost`: `EAP_ATTRIBUTE_TYPE` = 14;
public const val `eatLoginIPv6Host`: `EAP_ATTRIBUTE_TYPE` = 98;
public const val `eatLoginLATGroup`: `EAP_ATTRIBUTE_TYPE` = 36;
public const val `eatLoginLATNode`: `EAP_ATTRIBUTE_TYPE` = 35;
public const val `eatLoginLATPort`: `EAP_ATTRIBUTE_TYPE` = 63;
public const val `eatLoginLATService`: `EAP_ATTRIBUTE_TYPE` = 34;
public const val `eatLoginService`: `EAP_ATTRIBUTE_TYPE` = 15;
public const val `eatLoginTCPPort`: `EAP_ATTRIBUTE_TYPE` = 16;
public const val `eatMD5CHAPChallenge`: `EAP_ATTRIBUTE_TYPE` = 60;
public const val `eatMD5CHAPPassword`: `EAP_ATTRIBUTE_TYPE` = 3;
public const val `eatMethodId`: `EAP_ATTRIBUTE_TYPE` = 9002;
public const val `eatMinimum`: `EAP_ATTRIBUTE_TYPE` = 0;
public const val `eatNASIPAddress`: `EAP_ATTRIBUTE_TYPE` = 4;
public const val `eatNASIPv6Address`: `EAP_ATTRIBUTE_TYPE` = 95;
public const val `eatNASIdentifier`: `EAP_ATTRIBUTE_TYPE` = 32;
public const val `eatNASPort`: `EAP_ATTRIBUTE_TYPE` = 5;
public const val `eatNASPortType`: `EAP_ATTRIBUTE_TYPE` = 61;
public const val `eatPEAPEmbeddedEAPTypeId`: `EAP_ATTRIBUTE_TYPE` = 8099;
public const val `eatPEAPFastRoamedSession`: `EAP_ATTRIBUTE_TYPE` = 8100;
public const val `eatPasswordRetry`: `EAP_ATTRIBUTE_TYPE` = 75;
public const val `eatPeerId`: `EAP_ATTRIBUTE_TYPE` = 9000;
public const val `eatPortLimit`: `EAP_ATTRIBUTE_TYPE` = 62;
public const val `eatPrompt`: `EAP_ATTRIBUTE_TYPE` = 76;
public const val `eatProxyState`: `EAP_ATTRIBUTE_TYPE` = 33;
public const val `eatQuarantineSoH`: `EAP_ATTRIBUTE_TYPE` = 8150;
public const val `eatReplyMessage`: `EAP_ATTRIBUTE_TYPE` = 18;
public const val `eatReserved`: `EAP_ATTRIBUTE_TYPE` = -1;
public const val `eatServerId`: `EAP_ATTRIBUTE_TYPE` = 9001;
public const val `eatServiceType`: `EAP_ATTRIBUTE_TYPE` = 6;
public const val `eatSessionId`: `EAP_ATTRIBUTE_TYPE` = 9004;
public const val `eatSessionTimeout`: `EAP_ATTRIBUTE_TYPE` = 27;
public const val `eatSignature`: `EAP_ATTRIBUTE_TYPE` = 80;
public const val `eatState`: `EAP_ATTRIBUTE_TYPE` = 24;
public const val `eatTerminationAction`: `EAP_ATTRIBUTE_TYPE` = 29;
public const val `eatTunnelClientEndpoint`: `EAP_ATTRIBUTE_TYPE` = 66;
public const val `eatTunnelMediumType`: `EAP_ATTRIBUTE_TYPE` = 65;
public const val `eatTunnelServerEndpoint`: `EAP_ATTRIBUTE_TYPE` = 67;
public const val `eatTunnelType`: `EAP_ATTRIBUTE_TYPE` = 64;
public const val `eatUnassigned17`: `EAP_ATTRIBUTE_TYPE` = 17;
public const val `eatUnassigned21`: `EAP_ATTRIBUTE_TYPE` = 21;
public const val `eatUserName`: `EAP_ATTRIBUTE_TYPE` = 1;
public const val `eatUserPassword`: `EAP_ATTRIBUTE_TYPE` = 2;
public const val `eatVendorSpecific`: `EAP_ATTRIBUTE_TYPE` = 26;
public const val `emptLegacyMethodPropertyFlag`: `EAP_METHOD_PROPERTY_TYPE` = 31;
public const val `emptPropCertifiedMethod`: `EAP_METHOD_PROPERTY_TYPE` = 22;
public const val `emptPropChannelBinding`: `EAP_METHOD_PROPERTY_TYPE` = 16;
public const val `emptPropCipherSuiteNegotiation`: `EAP_METHOD_PROPERTY_TYPE` = 0;
public const val `emptPropConfidentiality`: `EAP_METHOD_PROPERTY_TYPE` = 4;
public const val `emptPropCryptoBinding`: `EAP_METHOD_PROPERTY_TYPE` = 13;
public const val `emptPropDictionaryAttackResistance`: `EAP_METHOD_PROPERTY_TYPE` = 11;
public const val `emptPropFastReconnect`: `EAP_METHOD_PROPERTY_TYPE` = 12;
public const val `emptPropFragmentation`: `EAP_METHOD_PROPERTY_TYPE` = 15;
public const val `emptPropHiddenMethod`: `EAP_METHOD_PROPERTY_TYPE` = 23;
public const val `emptPropIdentityPrivacy`: `EAP_METHOD_PROPERTY_TYPE` = 26;
public const val `emptPropIntegrity`: `EAP_METHOD_PROPERTY_TYPE` = 2;
public const val `emptPropKeyDerivation`: `EAP_METHOD_PROPERTY_TYPE` = 5;
public const val `emptPropKeyStrength1024`: `EAP_METHOD_PROPERTY_TYPE` = 10;
public const val `emptPropKeyStrength128`: `EAP_METHOD_PROPERTY_TYPE` = 7;
public const val `emptPropKeyStrength256`: `EAP_METHOD_PROPERTY_TYPE` = 8;
public const val `emptPropKeyStrength512`: `EAP_METHOD_PROPERTY_TYPE` = 9;
public const val `emptPropKeyStrength64`: `EAP_METHOD_PROPERTY_TYPE` = 6;
public const val `emptPropMachineAuth`: `EAP_METHOD_PROPERTY_TYPE` = 24;
public const val `emptPropMethodChaining`: `EAP_METHOD_PROPERTY_TYPE` = 27;
public const val `emptPropMppeEncryption`: `EAP_METHOD_PROPERTY_TYPE` = 19;
public const val `emptPropMutualAuth`: `EAP_METHOD_PROPERTY_TYPE` = 1;
public const val `emptPropNap`: `EAP_METHOD_PROPERTY_TYPE` = 17;
public const val `emptPropReplayProtection`: `EAP_METHOD_PROPERTY_TYPE` = 3;
public const val `emptPropSessionIndependence`: `EAP_METHOD_PROPERTY_TYPE` = 14;
public const val `emptPropSharedStateEquivalence`: `EAP_METHOD_PROPERTY_TYPE` = 28;
public const val `emptPropStandalone`: `EAP_METHOD_PROPERTY_TYPE` = 18;
public const val `emptPropSupportsConfig`: `EAP_METHOD_PROPERTY_TYPE` = 21;
public const val `emptPropTunnelMethod`: `EAP_METHOD_PROPERTY_TYPE` = 20;
public const val `emptPropUserAuth`: `EAP_METHOD_PROPERTY_TYPE` = 25;
public const val `emptPropVendorSpecific`: `EAP_METHOD_PROPERTY_TYPE` = 255;
public const val `empvtBool`: `EAP_METHOD_PROPERTY_VALUE_TYPE` = 0;
public const val `empvtDword`: `EAP_METHOD_PROPERTY_VALUE_TYPE` = 1;
public const val `empvtString`: `EAP_METHOD_PROPERTY_VALUE_TYPE` = 2;
public const val `raatARAPChallenge`: UInt = 33u;
public const val `raatARAPChallengeResponse`: `RAS_AUTH_ATTRIBUTE_TYPE` = 84;
public const val `raatARAPFeatures`: `RAS_AUTH_ATTRIBUTE_TYPE` = 71;
public const val `raatARAPGuestLogon`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8096;
public const val `raatARAPNewPassword`: UInt = 20u;
public const val `raatARAPOldPassword`: UInt = 19u;
public const val `raatARAPPassword`: `RAS_AUTH_ATTRIBUTE_TYPE` = 70;
public const val `raatARAPPasswordChangeReason`: UInt = 21u;
public const val `raatARAPSecurity`: `RAS_AUTH_ATTRIBUTE_TYPE` = 73;
public const val `raatARAPSecurityData`: `RAS_AUTH_ATTRIBUTE_TYPE` = 74;
public const val `raatARAPZoneAccess`: `RAS_AUTH_ATTRIBUTE_TYPE` = 72;
public const val `raatAcctAuthentic`: `RAS_AUTH_ATTRIBUTE_TYPE` = 45;
public const val `raatAcctDelayTime`: `RAS_AUTH_ATTRIBUTE_TYPE` = 41;
public const val `raatAcctEventTimeStamp`: `RAS_AUTH_ATTRIBUTE_TYPE` = 55;
public const val `raatAcctInputOctets`: `RAS_AUTH_ATTRIBUTE_TYPE` = 42;
public const val `raatAcctInputPackets`: `RAS_AUTH_ATTRIBUTE_TYPE` = 47;
public const val `raatAcctInterimInterval`: `RAS_AUTH_ATTRIBUTE_TYPE` = 85;
public const val `raatAcctLinkCount`: `RAS_AUTH_ATTRIBUTE_TYPE` = 51;
public const val `raatAcctMultiSessionId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 50;
public const val `raatAcctOutputOctets`: `RAS_AUTH_ATTRIBUTE_TYPE` = 43;
public const val `raatAcctOutputPackets`: `RAS_AUTH_ATTRIBUTE_TYPE` = 48;
public const val `raatAcctSessionId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 44;
public const val `raatAcctSessionTime`: `RAS_AUTH_ATTRIBUTE_TYPE` = 46;
public const val `raatAcctStatusType`: `RAS_AUTH_ATTRIBUTE_TYPE` = 40;
public const val `raatAcctTerminateCause`: `RAS_AUTH_ATTRIBUTE_TYPE` = 49;
public const val `raatCallbackId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 20;
public const val `raatCallbackNumber`: `RAS_AUTH_ATTRIBUTE_TYPE` = 19;
public const val `raatCalledStationId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 30;
public const val `raatCallingStationId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 31;
public const val `raatCertificateOID`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8097;
public const val `raatCertificateThumbprint`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8250;
public const val `raatClass`: `RAS_AUTH_ATTRIBUTE_TYPE` = 25;
public const val `raatConfigurationToken`: `RAS_AUTH_ATTRIBUTE_TYPE` = 78;
public const val `raatConnectInfo`: `RAS_AUTH_ATTRIBUTE_TYPE` = 77;
public const val `raatCredentialsChanged`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8103;
public const val `raatEAPConfiguration`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8098;
public const val `raatEAPMessage`: `RAS_AUTH_ATTRIBUTE_TYPE` = 79;
public const val `raatEAPTLV`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8102;
public const val `raatEMSK`: `RAS_AUTH_ATTRIBUTE_TYPE` = 9003;
public const val `raatFastRoamedSession`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8100;
public const val `raatFilterId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 11;
public const val `raatFramedAppleTalkLink`: `RAS_AUTH_ATTRIBUTE_TYPE` = 37;
public const val `raatFramedAppleTalkNetwork`: `RAS_AUTH_ATTRIBUTE_TYPE` = 38;
public const val `raatFramedAppleTalkZone`: `RAS_AUTH_ATTRIBUTE_TYPE` = 39;
public const val `raatFramedCompression`: `RAS_AUTH_ATTRIBUTE_TYPE` = 13;
public const val `raatFramedIPAddress`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8;
public const val `raatFramedIPNetmask`: `RAS_AUTH_ATTRIBUTE_TYPE` = 9;
public const val `raatFramedIPXNetwork`: `RAS_AUTH_ATTRIBUTE_TYPE` = 23;
public const val `raatFramedIPv6Pool`: `RAS_AUTH_ATTRIBUTE_TYPE` = 100;
public const val `raatFramedIPv6Prefix`: `RAS_AUTH_ATTRIBUTE_TYPE` = 97;
public const val `raatFramedIPv6Route`: `RAS_AUTH_ATTRIBUTE_TYPE` = 99;
public const val `raatFramedInterfaceId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 96;
public const val `raatFramedMTU`: `RAS_AUTH_ATTRIBUTE_TYPE` = 12;
public const val `raatFramedProtocol`: `RAS_AUTH_ATTRIBUTE_TYPE` = 7;
public const val `raatFramedRoute`: `RAS_AUTH_ATTRIBUTE_TYPE` = 22;
public const val `raatFramedRouting`: `RAS_AUTH_ATTRIBUTE_TYPE` = 10;
public const val `raatIdleTimeout`: `RAS_AUTH_ATTRIBUTE_TYPE` = 28;
public const val `raatInnerEAPTypeId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8099;
public const val `raatLoginIPHost`: `RAS_AUTH_ATTRIBUTE_TYPE` = 14;
public const val `raatLoginIPv6Host`: `RAS_AUTH_ATTRIBUTE_TYPE` = 98;
public const val `raatLoginLATGroup`: `RAS_AUTH_ATTRIBUTE_TYPE` = 36;
public const val `raatLoginLATNode`: `RAS_AUTH_ATTRIBUTE_TYPE` = 35;
public const val `raatLoginLATPort`: `RAS_AUTH_ATTRIBUTE_TYPE` = 63;
public const val `raatLoginLATService`: `RAS_AUTH_ATTRIBUTE_TYPE` = 34;
public const val `raatLoginService`: `RAS_AUTH_ATTRIBUTE_TYPE` = 15;
public const val `raatLoginTCPPort`: `RAS_AUTH_ATTRIBUTE_TYPE` = 16;
public const val `raatMD5CHAPChallenge`: `RAS_AUTH_ATTRIBUTE_TYPE` = 60;
public const val `raatMD5CHAPPassword`: `RAS_AUTH_ATTRIBUTE_TYPE` = 3;
public const val `raatMethodId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 9002;
public const val `raatMinimum`: `RAS_AUTH_ATTRIBUTE_TYPE` = 0;
public const val `raatNASIPAddress`: `RAS_AUTH_ATTRIBUTE_TYPE` = 4;
public const val `raatNASIPv6Address`: `RAS_AUTH_ATTRIBUTE_TYPE` = 95;
public const val `raatNASIdentifier`: `RAS_AUTH_ATTRIBUTE_TYPE` = 32;
public const val `raatNASPort`: `RAS_AUTH_ATTRIBUTE_TYPE` = 5;
public const val `raatNASPortType`: `RAS_AUTH_ATTRIBUTE_TYPE` = 61;
public const val `raatPEAPEmbeddedEAPTypeId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8099;
public const val `raatPEAPFastRoamedSession`: `RAS_AUTH_ATTRIBUTE_TYPE` = 8100;
public const val `raatPasswordRetry`: `RAS_AUTH_ATTRIBUTE_TYPE` = 75;
public const val `raatPeerId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 9000;
public const val `raatPortLimit`: `RAS_AUTH_ATTRIBUTE_TYPE` = 62;
public const val `raatPrompt`: `RAS_AUTH_ATTRIBUTE_TYPE` = 76;
public const val `raatProxyState`: `RAS_AUTH_ATTRIBUTE_TYPE` = 33;
public const val `raatReplyMessage`: `RAS_AUTH_ATTRIBUTE_TYPE` = 18;
public const val `raatReserved`: `RAS_AUTH_ATTRIBUTE_TYPE` = -1;
public const val `raatServerId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 9001;
public const val `raatServiceType`: `RAS_AUTH_ATTRIBUTE_TYPE` = 6;
public const val `raatSessionId`: `RAS_AUTH_ATTRIBUTE_TYPE` = 9004;
public const val `raatSessionTimeout`: `RAS_AUTH_ATTRIBUTE_TYPE` = 27;
public const val `raatSignature`: `RAS_AUTH_ATTRIBUTE_TYPE` = 80;
public const val `raatState`: `RAS_AUTH_ATTRIBUTE_TYPE` = 24;
public const val `raatTerminationAction`: `RAS_AUTH_ATTRIBUTE_TYPE` = 29;
public const val `raatTunnelClientEndpoint`: `RAS_AUTH_ATTRIBUTE_TYPE` = 66;
public const val `raatTunnelMediumType`: `RAS_AUTH_ATTRIBUTE_TYPE` = 65;
public const val `raatTunnelServerEndpoint`: `RAS_AUTH_ATTRIBUTE_TYPE` = 67;
public const val `raatTunnelType`: `RAS_AUTH_ATTRIBUTE_TYPE` = 64;
public const val `raatUnassigned17`: `RAS_AUTH_ATTRIBUTE_TYPE` = 17;
public const val `raatUnassigned21`: `RAS_AUTH_ATTRIBUTE_TYPE` = 21;
public const val `raatUserName`: `RAS_AUTH_ATTRIBUTE_TYPE` = 1;
public const val `raatUserPassword`: `RAS_AUTH_ATTRIBUTE_TYPE` = 2;
public const val `raatVendorSpecific`: `RAS_AUTH_ATTRIBUTE_TYPE` = 26;
