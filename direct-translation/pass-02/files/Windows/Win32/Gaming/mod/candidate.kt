// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-1.dll" "system" fn CheckGamingPrivilegeSilently(privilegeid : u32, scope : windows_sys::core::HSTRING, policy : windows_sys::core::HSTRING, hasprivilege : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-2.dll" "system" fn CheckGamingPrivilegeSilentlyForUser(user : * mut core::ffi::c_void, privilegeid : u32, scope : windows_sys::core::HSTRING, policy : windows_sys::core::HSTRING, hasprivilege : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-1.dll" "system" fn CheckGamingPrivilegeWithUI(privilegeid : u32, scope : windows_sys::core::HSTRING, policy : windows_sys::core::HSTRING, friendlymessage : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-2.dll" "system" fn CheckGamingPrivilegeWithUIForUser(user : * mut core::ffi::c_void, privilegeid : u32, scope : windows_sys::core::HSTRING, policy : windows_sys::core::HSTRING, friendlymessage : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-expandedresources-l1-1-0.dll" "system" fn GetExpandedResourceExclusiveCpuCount(exclusivecpucount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-deviceinformation-l1-1-0.dll" "system" fn GetGamingDeviceModelInformation(information : *mut GAMING_DEVICE_MODEL_INFORMATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-expandedresources-l1-1-0.dll" "system" fn HasExpandedResources(hasexpandedresources : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-0.dll" "system" fn ProcessPendingGameUI(waitforcompletion : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-expandedresources-l1-1-0.dll" "system" fn ReleaseExclusiveCpuSets() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-0.dll" "system" fn ShowChangeFriendRelationshipUI(targetuserxuid : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-2.dll" "system" fn ShowChangeFriendRelationshipUIForUser(user : * mut core::ffi::c_void, targetuserxuid : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowCustomizeUserProfileUI(completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowCustomizeUserProfileUIForUser(user : * mut core::ffi::c_void, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowFindFriendsUI(completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowFindFriendsUIForUser(user : * mut core::ffi::c_void, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowGameInfoUI(titleid : u32, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowGameInfoUIForUser(user : * mut core::ffi::c_void, titleid : u32, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-0.dll" "system" fn ShowGameInviteUI(serviceconfigurationid : windows_sys::core::HSTRING, sessiontemplatename : windows_sys::core::HSTRING, sessionid : windows_sys::core::HSTRING, invitationdisplaytext : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-2.dll" "system" fn ShowGameInviteUIForUser(user : * mut core::ffi::c_void, serviceconfigurationid : windows_sys::core::HSTRING, sessiontemplatename : windows_sys::core::HSTRING, sessionid : windows_sys::core::HSTRING, invitationdisplaytext : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-3.dll" "system" fn ShowGameInviteUIWithContext(serviceconfigurationid : windows_sys::core::HSTRING, sessiontemplatename : windows_sys::core::HSTRING, sessionid : windows_sys::core::HSTRING, invitationdisplaytext : windows_sys::core::HSTRING, customactivationcontext : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-3.dll" "system" fn ShowGameInviteUIWithContextForUser(user : * mut core::ffi::c_void, serviceconfigurationid : windows_sys::core::HSTRING, sessiontemplatename : windows_sys::core::HSTRING, sessionid : windows_sys::core::HSTRING, invitationdisplaytext : windows_sys::core::HSTRING, customactivationcontext : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-0.dll" "system" fn ShowPlayerPickerUI(promptdisplaytext : windows_sys::core::HSTRING, xuids : *const windows_sys::core::HSTRING, xuidscount : usize, preselectedxuids : *const windows_sys::core::HSTRING, preselectedxuidscount : usize, minselectioncount : usize, maxselectioncount : usize, completionroutine : PlayerPickerUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-2.dll" "system" fn ShowPlayerPickerUIForUser(user : * mut core::ffi::c_void, promptdisplaytext : windows_sys::core::HSTRING, xuids : *const windows_sys::core::HSTRING, xuidscount : usize, preselectedxuids : *const windows_sys::core::HSTRING, preselectedxuidscount : usize, minselectioncount : usize, maxselectioncount : usize, completionroutine : PlayerPickerUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-0.dll" "system" fn ShowProfileCardUI(targetuserxuid : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-2.dll" "system" fn ShowProfileCardUIForUser(user : * mut core::ffi::c_void, targetuserxuid : windows_sys::core::HSTRING, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-0.dll" "system" fn ShowTitleAchievementsUI(titleid : u32, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-2.dll" "system" fn ShowTitleAchievementsUIForUser(user : * mut core::ffi::c_void, titleid : u32, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowUserSettingsUI(completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-4.dll" "system" fn ShowUserSettingsUIForUser(user : * mut core::ffi::c_void, completionroutine : GameUICompletionRoutine, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-gaming-tcui-l1-1-0.dll" "system" fn TryCancelPendingGameUI() -> windows_sys::core::BOOL);

public const val `GAMESTATS_OPEN_CREATED`: `GAMESTATS_OPEN_RESULT` = 0;
public const val `GAMESTATS_OPEN_OPENED`: `GAMESTATS_OPEN_RESULT` = 1;
public const val `GAMESTATS_OPEN_OPENONLY`: `GAMESTATS_OPEN_TYPE` = 1;
public const val `GAMESTATS_OPEN_OPENORCREATE`: `GAMESTATS_OPEN_TYPE` = 0;
public typealias `GAMESTATS_OPEN_RESULT` = Int;
public typealias `GAMESTATS_OPEN_TYPE` = Int;
public typealias `GAME_INSTALL_SCOPE` = Int;
public typealias `GAMING_DEVICE_DEVICE_ID` = Int;
public const val `GAMING_DEVICE_DEVICE_ID_NONE`: `GAMING_DEVICE_DEVICE_ID` = 0;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE`: `GAMING_DEVICE_DEVICE_ID` = 1988865574;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE_S`: `GAMING_DEVICE_DEVICE_ID` = 712204761;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE_X`: `GAMING_DEVICE_DEVICE_ID` = 1523980231;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE_X_DEVKIT`: `GAMING_DEVICE_DEVICE_ID` = 284675555;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_S`: `GAMING_DEVICE_DEVICE_ID` = 489159355;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_X`: `GAMING_DEVICE_DEVICE_ID` = 796540415;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_X_DEVKIT`: `GAMING_DEVICE_DEVICE_ID` = -561359263;
// UNSUPPORTED Rust 47:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GAMING_DEVICE_MODEL_INFORMATION {
//     pub vendorId: GAMING_DEVICE_VENDOR_ID,
//     pub deviceId: GAMING_DEVICE_DEVICE_ID,
// }

public typealias `GAMING_DEVICE_VENDOR_ID` = Int;
public const val `GAMING_DEVICE_VENDOR_ID_MICROSOFT`: `GAMING_DEVICE_VENDOR_ID` = -1024700366;
public const val `GAMING_DEVICE_VENDOR_ID_NONE`: `GAMING_DEVICE_VENDOR_ID` = 0;
public const val `GIS_ALL_USERS`: `GAME_INSTALL_SCOPE` = 3;
public const val `GIS_CURRENT_USER`: `GAME_INSTALL_SCOPE` = 2;
public const val `GIS_NOT_INSTALLED`: `GAME_INSTALL_SCOPE` = 1;
// UNSUPPORTED Rust 59:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GameExplorer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a5ea990_3034_4d6f_9128_01f3c61022bc);

// UNSUPPORTED Rust 60:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GameStatistics: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdbc85a2c_c0dc_4961_b6e2_d28b62c11ad4);

// UNSUPPORTED Rust 61:1: generic scalar type unsupported
// pub type GameUICompletionRoutine = Option<unsafe extern "system" fn(returncode: windows_sys::core::HRESULT, context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 62:1: non-scalar type Ptr unsupported
// pub const ID_GDF_THUMBNAIL_STR: windows_sys::core::PCWSTR = windows_sys::core::w!("__GDF_THUMBNAIL");

// UNSUPPORTED Rust 63:1: non-scalar type Ptr unsupported
// pub const ID_GDF_XML_STR: windows_sys::core::PCWSTR = windows_sys::core::w!("__GDF_XML");

public typealias `KnownGamingPrivileges` = Int;
// UNSUPPORTED Rust 65:1: generic scalar type unsupported
// pub type PlayerPickerUICompletionRoutine = Option<unsafe extern "system" fn(returncode: windows_sys::core::HRESULT, context: *const core::ffi::c_void, selectedxuids: *const windows_sys::core::HSTRING, selectedxuidscount: usize)>;

public typealias `XBL_IDP_AUTH_TOKEN_STATUS` = Int;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_LOAD_MSA_ACCOUNT_FAILED`: `XBL_IDP_AUTH_TOKEN_STATUS` = 3;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_MSA_INTERRUPT`: `XBL_IDP_AUTH_TOKEN_STATUS` = 5;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_NO_ACCOUNT_SET`: `XBL_IDP_AUTH_TOKEN_STATUS` = 2;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_OFFLINE_NO_CONSENT`: `XBL_IDP_AUTH_TOKEN_STATUS` = 6;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_OFFLINE_SUCCESS`: `XBL_IDP_AUTH_TOKEN_STATUS` = 1;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_SUCCESS`: `XBL_IDP_AUTH_TOKEN_STATUS` = 0;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_UNKNOWN`: `XBL_IDP_AUTH_TOKEN_STATUS` = -1;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_VIEW_NOT_SET`: `XBL_IDP_AUTH_TOKEN_STATUS` = 7;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_XBOX_VETO`: `XBL_IDP_AUTH_TOKEN_STATUS` = 4;
public const val `XPRIVILEGE_ADD_FRIEND`: `KnownGamingPrivileges` = 255;
public const val `XPRIVILEGE_BROADCAST`: `KnownGamingPrivileges` = 190;
public const val `XPRIVILEGE_CLOUD_GAMING_JOIN_SESSION`: `KnownGamingPrivileges` = 208;
public const val `XPRIVILEGE_CLOUD_GAMING_MANAGE_SESSION`: `KnownGamingPrivileges` = 207;
public const val `XPRIVILEGE_CLOUD_SAVED_GAMES`: `KnownGamingPrivileges` = 209;
public const val `XPRIVILEGE_COMMUNICATIONS`: `KnownGamingPrivileges` = 252;
public const val `XPRIVILEGE_COMMUNICATION_VOICE_INGAME`: `KnownGamingPrivileges` = 205;
public const val `XPRIVILEGE_COMMUNICATION_VOICE_SKYPE`: `KnownGamingPrivileges` = 206;
public const val `XPRIVILEGE_GAME_DVR`: `KnownGamingPrivileges` = 198;
public const val `XPRIVILEGE_MULTIPLAYER_PARTIES`: `KnownGamingPrivileges` = 203;
public const val `XPRIVILEGE_MULTIPLAYER_SESSIONS`: `KnownGamingPrivileges` = 254;
public const val `XPRIVILEGE_PREMIUM_CONTENT`: `KnownGamingPrivileges` = 214;
public const val `XPRIVILEGE_PREMIUM_VIDEO`: `KnownGamingPrivileges` = 224;
public const val `XPRIVILEGE_PROFILE_VIEWING`: `KnownGamingPrivileges` = 249;
public const val `XPRIVILEGE_PURCHASE_CONTENT`: `KnownGamingPrivileges` = 245;
public const val `XPRIVILEGE_SHARE_CONTENT`: `KnownGamingPrivileges` = 211;
public const val `XPRIVILEGE_SHARE_KINECT_CONTENT`: `KnownGamingPrivileges` = 199;
public const val `XPRIVILEGE_SOCIAL_NETWORK_SHARING`: `KnownGamingPrivileges` = 220;
public const val `XPRIVILEGE_SUBSCRIPTION_CONTENT`: `KnownGamingPrivileges` = 219;
public const val `XPRIVILEGE_USER_CREATED_CONTENT`: `KnownGamingPrivileges` = 247;
public const val `XPRIVILEGE_VIDEO_COMMUNICATIONS`: `KnownGamingPrivileges` = 235;
public const val `XPRIVILEGE_VIEW_FRIENDS_LIST`: `KnownGamingPrivileges` = 197;
// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const XblIdpAuthManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce23534b_56d8_4978_86a2_7ee570640468);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const XblIdpAuthTokenResult: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9f493441_744a_410c_ae2b_9a22f7c7731f);

