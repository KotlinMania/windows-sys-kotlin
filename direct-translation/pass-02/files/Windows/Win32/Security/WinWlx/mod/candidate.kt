// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: generic scalar type unsupported
// pub type PFNMSGECALLBACK = Option<unsafe extern "system" fn(bverbose: windows_sys::core::BOOL, lpmessage: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 2:1: generic scalar type unsupported
// pub type PWLX_ASSIGN_SHELL_PROTECTION = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, htoken: super::super::Foundation::HANDLE, hprocess: super::super::Foundation::HANDLE, hthread: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 3:1: generic scalar type unsupported
// pub type PWLX_CHANGE_PASSWORD_NOTIFY = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, pmprinfo: *mut WLX_MPR_NOTIFY_INFO, dwchangeinfo: u32) -> i32>;

// UNSUPPORTED Rust 4:1: generic scalar type unsupported
// pub type PWLX_CHANGE_PASSWORD_NOTIFY_EX = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, pmprinfo: *mut WLX_MPR_NOTIFY_INFO, dwchangeinfo: u32, providername: windows_sys::core::PCWSTR, reserved: *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 5:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// pub type PWLX_CLOSE_USER_DESKTOP = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, pdesktop: *mut WLX_DESKTOP, htoken: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 7:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// pub type PWLX_CREATE_USER_DESKTOP = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, htoken: super::super::Foundation::HANDLE, flags: u32, pszdesktopname: windows_sys::core::PCWSTR, ppdesktop: *mut *mut WLX_DESKTOP) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 9:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type PWLX_DIALOG_BOX = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, hinst: super::super::Foundation::HANDLE, lpsztemplate: windows_sys::core::PCWSTR, hwndowner: super::super::Foundation::HWND, dlgprc: super::super::UI::WindowsAndMessaging::DLGPROC) -> i32>;

// UNSUPPORTED Rust 11:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type PWLX_DIALOG_BOX_INDIRECT = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, hinst: super::super::Foundation::HANDLE, hdialogtemplate: *mut super::super::UI::WindowsAndMessaging::DLGTEMPLATE, hwndowner: super::super::Foundation::HWND, dlgprc: super::super::UI::WindowsAndMessaging::DLGPROC) -> i32>;

// UNSUPPORTED Rust 13:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type PWLX_DIALOG_BOX_INDIRECT_PARAM = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, hinst: super::super::Foundation::HANDLE, hdialogtemplate: *mut super::super::UI::WindowsAndMessaging::DLGTEMPLATE, hwndowner: super::super::Foundation::HWND, dlgprc: super::super::UI::WindowsAndMessaging::DLGPROC, dwinitparam: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 15:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type PWLX_DIALOG_BOX_PARAM = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, hinst: super::super::Foundation::HANDLE, lpsztemplate: windows_sys::core::PCWSTR, hwndowner: super::super::Foundation::HWND, dlgprc: super::super::UI::WindowsAndMessaging::DLGPROC, dwinitparam: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 17:1: generic scalar type unsupported
// pub type PWLX_DISCONNECT = Option<unsafe extern "system" fn() -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 18:1: generic scalar type unsupported
// pub type PWLX_GET_OPTION = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, option: u32, value: *mut usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 19:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// pub type PWLX_GET_SOURCE_DESKTOP = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, ppdesktop: *mut *mut WLX_DESKTOP) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 21:1: generic scalar type unsupported
// pub type PWLX_MESSAGE_BOX = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, hwndowner: super::super::Foundation::HWND, lpsztext: windows_sys::core::PCWSTR, lpsztitle: windows_sys::core::PCWSTR, fustyle: u32) -> i32>;

// UNSUPPORTED Rust 22:1: generic scalar type unsupported
// pub type PWLX_QUERY_CLIENT_CREDENTIALS = Option<unsafe extern "system" fn(pcred: *mut WLX_CLIENT_CREDENTIALS_INFO_V1_0) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 23:1: generic scalar type unsupported
// pub type PWLX_QUERY_CONSOLESWITCH_CREDENTIALS = Option<unsafe extern "system" fn(pcred: *mut WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0) -> u32>;

// UNSUPPORTED Rust 24:1: generic scalar type unsupported
// pub type PWLX_QUERY_IC_CREDENTIALS = Option<unsafe extern "system" fn(pcred: *mut WLX_CLIENT_CREDENTIALS_INFO_V1_0) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 25:1: generic scalar type unsupported
// pub type PWLX_QUERY_TERMINAL_SERVICES_DATA = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, ptsdata: *mut WLX_TERMINAL_SERVICES_DATA, username: windows_sys::core::PCWSTR, domain: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 26:1: generic scalar type unsupported
// pub type PWLX_QUERY_TS_LOGON_CREDENTIALS = Option<unsafe extern "system" fn(pcred: *mut WLX_CLIENT_CREDENTIALS_INFO_V2_0) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 27:1: generic scalar type unsupported
// pub type PWLX_SAS_NOTIFY = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, dwsastype: u32)>;

// UNSUPPORTED Rust 28:1: generic scalar type unsupported
// pub type PWLX_SET_CONTEXT_POINTER = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, pwlxcontext: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 29:1: generic scalar type unsupported
// pub type PWLX_SET_OPTION = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, option: u32, value: usize, oldvalue: *mut usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 30:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// pub type PWLX_SET_RETURN_DESKTOP = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, pdesktop: *mut WLX_DESKTOP) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 32:1: generic scalar type unsupported
// pub type PWLX_SET_TIMEOUT = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE, timeout: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 33:1: generic scalar type unsupported
// pub type PWLX_SWITCH_DESKTOP_TO_USER = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 34:1: generic scalar type unsupported
// pub type PWLX_SWITCH_DESKTOP_TO_WINLOGON = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE) -> i32>;

// UNSUPPORTED Rust 35:1: generic scalar type unsupported
// pub type PWLX_USE_CTRL_ALT_DEL = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE)>;

// UNSUPPORTED Rust 36:1: generic scalar type unsupported
// pub type PWLX_WIN31_MIGRATE = Option<unsafe extern "system" fn(hwlx: super::super::Foundation::HANDLE)>;

public const val `STATUSMSG_OPTION_NOANIMATION`: UInt = 1u;
public const val `STATUSMSG_OPTION_SETFOREGROUND`: UInt = 2u;
// UNSUPPORTED Rust 39:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_CLIENT_CREDENTIALS_INFO_V1_0 {
//     pub dwType: u32,
//     pub pszUserName: windows_sys::core::PWSTR,
//     pub pszDomain: windows_sys::core::PWSTR,
//     pub pszPassword: windows_sys::core::PWSTR,
//     pub fPromptForPassword: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 48:1: declaration Impl has no candidate rule
// impl Default for WLX_CLIENT_CREDENTIALS_INFO_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 53:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_CLIENT_CREDENTIALS_INFO_V2_0 {
//     pub dwType: u32,
//     pub pszUserName: windows_sys::core::PWSTR,
//     pub pszDomain: windows_sys::core::PWSTR,
//     pub pszPassword: windows_sys::core::PWSTR,
//     pub fPromptForPassword: windows_sys::core::BOOL,
//     pub fDisconnectOnLogonFailure: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 63:1: declaration Impl has no candidate rule
// impl Default for WLX_CLIENT_CREDENTIALS_INFO_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLX_CONSOLESWITCHCREDENTIAL_TYPE_V1_0`: UInt = 1u;
// UNSUPPORTED Rust 69:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0 {
//     pub dwType: u32,
//     pub UserToken: super::super::Foundation::HANDLE,
//     pub LogonId: super::super::Foundation::LUID,
//     pub Quotas: super::QUOTA_LIMITS,
//     pub UserName: windows_sys::core::PWSTR,
//     pub Domain: windows_sys::core::PWSTR,
//     pub LogonTime: i64,
//     pub SmartCardLogon: windows_sys::core::BOOL,
//     pub ProfileLength: u32,
//     pub MessageType: u32,
//     pub LogonCount: u16,
//     pub BadPasswordCount: u16,
//     pub ProfileLogonTime: i64,
//     pub LogoffTime: i64,
//     pub KickOffTime: i64,
//     pub PasswordLastSet: i64,
//     pub PasswordCanChange: i64,
//     pub PasswordMustChange: i64,
//     pub LogonScript: windows_sys::core::PWSTR,
//     pub HomeDirectory: windows_sys::core::PWSTR,
//     pub FullName: windows_sys::core::PWSTR,
//     pub ProfilePath: windows_sys::core::PWSTR,
//     pub HomeDirectoryDrive: windows_sys::core::PWSTR,
//     pub LogonServer: windows_sys::core::PWSTR,
//     pub UserFlags: u32,
//     pub PrivateDataLen: u32,
//     pub PrivateData: *mut u8,
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule
// impl Default for WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLX_CREATE_INSTANCE_ONLY`: UInt = 1u;
public const val `WLX_CREATE_USER`: UInt = 2u;
public const val `WLX_CREDENTIAL_TYPE_V1_0`: UInt = 1u;
public const val `WLX_CREDENTIAL_TYPE_V2_0`: UInt = 2u;
public const val `WLX_CURRENT_VERSION`: UInt = 65540u;
// UNSUPPORTED Rust 110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// #[derive(Clone, Copy)]
// pub struct WLX_DESKTOP {
//     pub Size: u32,
//     pub Flags: u32,
//     pub hDesktop: super::super::System::StationsAndDesktops::HDESK,
//     pub pszDesktopName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 119:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// impl Default for WLX_DESKTOP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLX_DESKTOP_HANDLE`: UInt = 2u;
public const val `WLX_DESKTOP_NAME`: UInt = 1u;
public const val `WLX_DIRECTORY_LENGTH`: UInt = 256u;
// UNSUPPORTED Rust 128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy, Default)]
// pub struct WLX_DISPATCH_VERSION_1_0 {
//     pub WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL,
//     pub WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER,
//     pub WlxSasNotify: PWLX_SAS_NOTIFY,
//     pub WlxSetTimeout: PWLX_SET_TIMEOUT,
//     pub WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION,
//     pub WlxMessageBox: PWLX_MESSAGE_BOX,
//     pub WlxDialogBox: PWLX_DIALOG_BOX,
//     pub WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM,
//     pub WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT,
//     pub WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM,
//     pub WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER,
//     pub WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON,
//     pub WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY,
// }

// UNSUPPORTED Rust 146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy, Default)]
// pub struct WLX_DISPATCH_VERSION_1_1 {
//     pub WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL,
//     pub WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER,
//     pub WlxSasNotify: PWLX_SAS_NOTIFY,
//     pub WlxSetTimeout: PWLX_SET_TIMEOUT,
//     pub WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION,
//     pub WlxMessageBox: PWLX_MESSAGE_BOX,
//     pub WlxDialogBox: PWLX_DIALOG_BOX,
//     pub WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM,
//     pub WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT,
//     pub WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM,
//     pub WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER,
//     pub WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON,
//     pub WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY,
//     pub WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP,
//     pub WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP,
//     pub WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP,
//     pub WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX,
// }

// UNSUPPORTED Rust 168:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy, Default)]
// pub struct WLX_DISPATCH_VERSION_1_2 {
//     pub WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL,
//     pub WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER,
//     pub WlxSasNotify: PWLX_SAS_NOTIFY,
//     pub WlxSetTimeout: PWLX_SET_TIMEOUT,
//     pub WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION,
//     pub WlxMessageBox: PWLX_MESSAGE_BOX,
//     pub WlxDialogBox: PWLX_DIALOG_BOX,
//     pub WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM,
//     pub WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT,
//     pub WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM,
//     pub WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER,
//     pub WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON,
//     pub WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY,
//     pub WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP,
//     pub WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP,
//     pub WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP,
//     pub WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX,
//     pub WlxCloseUserDesktop: PWLX_CLOSE_USER_DESKTOP,
// }

// UNSUPPORTED Rust 191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy, Default)]
// pub struct WLX_DISPATCH_VERSION_1_3 {
//     pub WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL,
//     pub WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER,
//     pub WlxSasNotify: PWLX_SAS_NOTIFY,
//     pub WlxSetTimeout: PWLX_SET_TIMEOUT,
//     pub WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION,
//     pub WlxMessageBox: PWLX_MESSAGE_BOX,
//     pub WlxDialogBox: PWLX_DIALOG_BOX,
//     pub WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM,
//     pub WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT,
//     pub WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM,
//     pub WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER,
//     pub WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON,
//     pub WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY,
//     pub WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP,
//     pub WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP,
//     pub WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP,
//     pub WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX,
//     pub WlxCloseUserDesktop: PWLX_CLOSE_USER_DESKTOP,
//     pub WlxSetOption: PWLX_SET_OPTION,
//     pub WlxGetOption: PWLX_GET_OPTION,
//     pub WlxWin31Migrate: PWLX_WIN31_MIGRATE,
//     pub WlxQueryClientCredentials: PWLX_QUERY_CLIENT_CREDENTIALS,
//     pub WlxQueryInetConnectorCredentials: PWLX_QUERY_IC_CREDENTIALS,
//     pub WlxDisconnect: PWLX_DISCONNECT,
//     pub WlxQueryTerminalServicesData: PWLX_QUERY_TERMINAL_SERVICES_DATA,
// }

// UNSUPPORTED Rust 221:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// #[derive(Clone, Copy, Default)]
// pub struct WLX_DISPATCH_VERSION_1_4 {
//     pub WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL,
//     pub WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER,
//     pub WlxSasNotify: PWLX_SAS_NOTIFY,
//     pub WlxSetTimeout: PWLX_SET_TIMEOUT,
//     pub WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION,
//     pub WlxMessageBox: PWLX_MESSAGE_BOX,
//     pub WlxDialogBox: PWLX_DIALOG_BOX,
//     pub WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM,
//     pub WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT,
//     pub WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM,
//     pub WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER,
//     pub WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON,
//     pub WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY,
//     pub WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP,
//     pub WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP,
//     pub WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP,
//     pub WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX,
//     pub WlxCloseUserDesktop: PWLX_CLOSE_USER_DESKTOP,
//     pub WlxSetOption: PWLX_SET_OPTION,
//     pub WlxGetOption: PWLX_GET_OPTION,
//     pub WlxWin31Migrate: PWLX_WIN31_MIGRATE,
//     pub WlxQueryClientCredentials: PWLX_QUERY_CLIENT_CREDENTIALS,
//     pub WlxQueryInetConnectorCredentials: PWLX_QUERY_IC_CREDENTIALS,
//     pub WlxDisconnect: PWLX_DISCONNECT,
//     pub WlxQueryTerminalServicesData: PWLX_QUERY_TERMINAL_SERVICES_DATA,
//     pub WlxQueryConsoleSwitchCredentials: PWLX_QUERY_CONSOLESWITCH_CREDENTIALS,
//     pub WlxQueryTsLogonCredentials: PWLX_QUERY_TS_LOGON_CREDENTIALS,
// }

public const val `WLX_DLG_INPUT_TIMEOUT`: UInt = 102u;
public const val `WLX_DLG_SAS`: UInt = 101u;
public const val `WLX_DLG_SCREEN_SAVER_TIMEOUT`: UInt = 103u;
public const val `WLX_DLG_USER_LOGOFF`: UInt = 104u;
public const val `WLX_LOGON_OPT_NO_PROFILE`: UInt = 1u;
// UNSUPPORTED Rust 258:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_MPR_NOTIFY_INFO {
//     pub pszUserName: windows_sys::core::PWSTR,
//     pub pszDomain: windows_sys::core::PWSTR,
//     pub pszPassword: windows_sys::core::PWSTR,
//     pub pszOldPassword: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 266:1: declaration Impl has no candidate rule
// impl Default for WLX_MPR_NOTIFY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// #[derive(Clone, Copy)]
// pub struct WLX_NOTIFICATION_INFO {
//     pub Size: u32,
//     pub Flags: u32,
//     pub UserName: windows_sys::core::PWSTR,
//     pub Domain: windows_sys::core::PWSTR,
//     pub WindowStation: windows_sys::core::PWSTR,
//     pub hToken: super::super::Foundation::HANDLE,
//     pub hDesktop: super::super::System::StationsAndDesktops::HDESK,
//     pub pStatusCallback: PFNMSGECALLBACK,
// }

// UNSUPPORTED Rust 284:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_StationsAndDesktops")]
// impl Default for WLX_NOTIFICATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLX_OPTION_CONTEXT_POINTER`: UInt = 2u;
public const val `WLX_OPTION_DISPATCH_TABLE_SIZE`: UInt = 65539u;
public const val `WLX_OPTION_FORCE_LOGOFF_TIME`: UInt = 4u;
public const val `WLX_OPTION_IGNORE_AUTO_LOGON`: UInt = 8u;
public const val `WLX_OPTION_NO_SWITCH_ON_SAS`: UInt = 9u;
public const val `WLX_OPTION_SMART_CARD_INFO`: UInt = 65538u;
public const val `WLX_OPTION_SMART_CARD_PRESENT`: UInt = 65537u;
public const val `WLX_OPTION_USE_CTRL_ALT_DEL`: UInt = 1u;
public const val `WLX_OPTION_USE_SMART_CARD`: UInt = 3u;
public const val `WLX_PROFILE_TYPE_V1_0`: UInt = 1u;
public const val `WLX_PROFILE_TYPE_V2_0`: UInt = 2u;
// UNSUPPORTED Rust 301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_PROFILE_V1_0 {
//     pub dwType: u32,
//     pub pszProfile: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 307:1: declaration Impl has no candidate rule
// impl Default for WLX_PROFILE_V1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_PROFILE_V2_0 {
//     pub dwType: u32,
//     pub pszProfile: windows_sys::core::PWSTR,
//     pub pszPolicy: windows_sys::core::PWSTR,
//     pub pszNetworkDefaultUserProfile: windows_sys::core::PWSTR,
//     pub pszServerName: windows_sys::core::PWSTR,
//     pub pszEnvironment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 322:1: declaration Impl has no candidate rule
// impl Default for WLX_PROFILE_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLX_SAS_ACTION_DELAYED_FORCE_LOGOFF`: UInt = 16u;
public const val `WLX_SAS_ACTION_FORCE_LOGOFF`: UInt = 9u;
public const val `WLX_SAS_ACTION_LOCK_WKSTA`: UInt = 3u;
public const val `WLX_SAS_ACTION_LOGOFF`: UInt = 4u;
public const val `WLX_SAS_ACTION_LOGON`: UInt = 1u;
public const val `WLX_SAS_ACTION_NONE`: UInt = 2u;
public const val `WLX_SAS_ACTION_PWD_CHANGED`: UInt = 6u;
public const val `WLX_SAS_ACTION_RECONNECTED`: UInt = 15u;
public const val `WLX_SAS_ACTION_SHUTDOWN`: `WLX_SHUTDOWN_TYPE` = 5u;
public const val `WLX_SAS_ACTION_SHUTDOWN_HIBERNATE`: UInt = 14u;
public const val `WLX_SAS_ACTION_SHUTDOWN_POWER_OFF`: `WLX_SHUTDOWN_TYPE` = 10u;
public const val `WLX_SAS_ACTION_SHUTDOWN_REBOOT`: `WLX_SHUTDOWN_TYPE` = 11u;
public const val `WLX_SAS_ACTION_SHUTDOWN_SLEEP`: UInt = 12u;
public const val `WLX_SAS_ACTION_SHUTDOWN_SLEEP2`: UInt = 13u;
public const val `WLX_SAS_ACTION_SWITCH_CONSOLE`: UInt = 17u;
public const val `WLX_SAS_ACTION_TASKLIST`: UInt = 7u;
public const val `WLX_SAS_ACTION_UNLOCK_WKSTA`: UInt = 8u;
public const val `WLX_SAS_TYPE_AUTHENTICATED`: UInt = 7u;
public const val `WLX_SAS_TYPE_CTRL_ALT_DEL`: UInt = 1u;
public const val `WLX_SAS_TYPE_MAX_MSFT_VALUE`: UInt = 127u;
public const val `WLX_SAS_TYPE_SCRNSVR_ACTIVITY`: UInt = 3u;
public const val `WLX_SAS_TYPE_SCRNSVR_TIMEOUT`: UInt = 2u;
public const val `WLX_SAS_TYPE_SC_FIRST_READER_ARRIVED`: UInt = 8u;
public const val `WLX_SAS_TYPE_SC_INSERT`: UInt = 5u;
public const val `WLX_SAS_TYPE_SC_LAST_READER_REMOVED`: UInt = 9u;
public const val `WLX_SAS_TYPE_SC_REMOVE`: UInt = 6u;
public const val `WLX_SAS_TYPE_SWITCHUSER`: UInt = 10u;
public const val `WLX_SAS_TYPE_TIMEOUT`: UInt = 0u;
public const val `WLX_SAS_TYPE_USER_LOGOFF`: UInt = 4u;
// UNSUPPORTED Rust 356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_SC_NOTIFICATION_INFO {
//     pub pszCard: windows_sys::core::PWSTR,
//     pub pszReader: windows_sys::core::PWSTR,
//     pub pszContainer: windows_sys::core::PWSTR,
//     pub pszCryptoProvider: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 364:1: declaration Impl has no candidate rule
// impl Default for WLX_SC_NOTIFICATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLX_SHUTDOWN_TYPE` = UInt;
// UNSUPPORTED Rust 370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLX_TERMINAL_SERVICES_DATA {
//     pub ProfilePath: [u16; 257],
//     pub HomeDir: [u16; 257],
//     pub HomeDirDrive: [u16; 4],
// }

// UNSUPPORTED Rust 377:1: declaration Impl has no candidate rule
// impl Default for WLX_TERMINAL_SERVICES_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLX_VERSION_1_0`: UInt = 65536u;
public const val `WLX_VERSION_1_1`: UInt = 65537u;
public const val `WLX_VERSION_1_2`: UInt = 65538u;
public const val `WLX_VERSION_1_3`: UInt = 65539u;
public const val `WLX_VERSION_1_4`: UInt = 65540u;
public const val `WLX_WM_SAS`: UInt = 1625u;
