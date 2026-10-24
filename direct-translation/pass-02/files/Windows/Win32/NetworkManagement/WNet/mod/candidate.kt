// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn MultinetGetConnectionPerformanceA(lpnetresource : *const NETRESOURCEA, lpnetconnectinfostruct : *mut NETCONNECTINFOSTRUCT) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn MultinetGetConnectionPerformanceW(lpnetresource : *const NETRESOURCEW, lpnetconnectinfostruct : *mut NETCONNECTINFOSTRUCT) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPAddConnection(lpnetresource : *const NETRESOURCEW, lppassword : windows_sys::core::PCWSTR, lpusername : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPAddConnection3(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEW, lppassword : windows_sys::core::PCWSTR, lpusername : windows_sys::core::PCWSTR, dwflags : NET_CONNECT_FLAGS) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn NPAddConnection4(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEW, lpauthbuffer : *const core::ffi::c_void, cbauthbuffer : u32, dwflags : u32, lpuseoptions : *const u8, cbuseoptions : u32) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPCancelConnection(lpname : windows_sys::core::PCWSTR, fforce : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn NPCancelConnection2(lpname : windows_sys::core::PCWSTR, fforce : windows_sys::core::BOOL, dwflags : u32) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPCloseEnum(henum : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPEnumResource(henum : super::super::Foundation:: HANDLE, lpccount : *mut u32, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPFormatNetworkName(lpremotename : windows_sys::core::PCWSTR, lpformattedname : windows_sys::core::PWSTR, lpnlength : *mut u32, dwflags : NETWORK_NAME_FORMAT_FLAGS, dwavecharperline : u32) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPGetCaps(ndex : u32) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPGetConnection(lplocalname : windows_sys::core::PCWSTR, lpremotename : windows_sys::core::PWSTR, lpnbufferlen : *mut u32) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn NPGetConnection3(lplocalname : windows_sys::core::PCWSTR, dwlevel : u32, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn NPGetConnectionPerformance(lpremotename : windows_sys::core::PCWSTR, lpnetconnectinfo : *mut NETCONNECTINFOSTRUCT) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn NPGetPersistentUseOptionsForConnection(lpremotepath : windows_sys::core::PCWSTR, lpreaduseoptions : *const u8, cbreaduseoptions : u32, lpwriteuseoptions : *mut u8, lpsizewriteuseoptions : *mut u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPGetResourceInformation(lpnetresource : *const NETRESOURCEW, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32, lplpsystem : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPGetResourceParent(lpnetresource : *const NETRESOURCEW, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPGetUniversalName(lplocalpath : windows_sys::core::PCWSTR, dwinfolevel : UNC_INFO_LEVEL, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPGetUser(lpname : windows_sys::core::PCWSTR, lpusername : windows_sys::core::PWSTR, lpnbufferlen : *mut u32) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn NPOpenEnum(dwscope : u32, dwtype : u32, dwusage : u32, lpnetresource : *const NETRESOURCEW, lphenum : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnection2A(lpnetresource : *const NETRESOURCEA, lppassword : windows_sys::core::PCSTR, lpusername : windows_sys::core::PCSTR, dwflags : NET_CONNECT_FLAGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnection2W(lpnetresource : *const NETRESOURCEW, lppassword : windows_sys::core::PCWSTR, lpusername : windows_sys::core::PCWSTR, dwflags : NET_CONNECT_FLAGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnection3A(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEA, lppassword : windows_sys::core::PCSTR, lpusername : windows_sys::core::PCSTR, dwflags : NET_CONNECT_FLAGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnection3W(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEW, lppassword : windows_sys::core::PCWSTR, lpusername : windows_sys::core::PCWSTR, dwflags : NET_CONNECT_FLAGS) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnection4A(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEA, pauthbuffer : *const core::ffi::c_void, cbauthbuffer : u32, dwflags : NET_CONNECT_FLAGS, lpuseoptions : *const u8, cbuseoptions : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnection4W(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEW, pauthbuffer : *const core::ffi::c_void, cbauthbuffer : u32, dwflags : NET_CONNECT_FLAGS, lpuseoptions : *const u8, cbuseoptions : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnectionA(lpremotename : windows_sys::core::PCSTR, lppassword : windows_sys::core::PCSTR, lplocalname : windows_sys::core::PCSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetAddConnectionW(lpremotename : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR, lplocalname : windows_sys::core::PCWSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetCancelConnection2A(lpname : windows_sys::core::PCSTR, dwflags : NET_CONNECT_FLAGS, fforce : windows_sys::core::BOOL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetCancelConnection2W(lpname : windows_sys::core::PCWSTR, dwflags : NET_CONNECT_FLAGS, fforce : windows_sys::core::BOOL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetCancelConnectionA(lpname : windows_sys::core::PCSTR, fforce : windows_sys::core::BOOL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetCancelConnectionW(lpname : windows_sys::core::PCWSTR, fforce : windows_sys::core::BOOL) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetCloseEnum(henum : super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetConnectionDialog(hwnd : super::super::Foundation:: HWND, dwtype : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetConnectionDialog1A(lpconndlgstruct : *mut CONNECTDLGSTRUCTA) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetConnectionDialog1W(lpconndlgstruct : *mut CONNECTDLGSTRUCTW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetDisconnectDialog(hwnd : super::super::Foundation:: HWND, dwtype : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetDisconnectDialog1A(lpconndlgstruct : *const DISCDLGSTRUCTA) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetDisconnectDialog1W(lpconndlgstruct : *const DISCDLGSTRUCTW) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetEnumResourceA(henum : super::super::Foundation:: HANDLE, lpccount : *mut u32, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetEnumResourceW(henum : super::super::Foundation:: HANDLE, lpccount : *mut u32, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetConnectionA(lplocalname : windows_sys::core::PCSTR, lpremotename : windows_sys::core::PSTR, lpnlength : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetConnectionW(lplocalname : windows_sys::core::PCWSTR, lpremotename : windows_sys::core::PWSTR, lpnlength : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetLastErrorA(lperror : *mut u32, lperrorbuf : windows_sys::core::PSTR, nerrorbufsize : u32, lpnamebuf : windows_sys::core::PSTR, nnamebufsize : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetLastErrorW(lperror : *mut u32, lperrorbuf : windows_sys::core::PWSTR, nerrorbufsize : u32, lpnamebuf : windows_sys::core::PWSTR, nnamebufsize : u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetNetworkInformationA(lpprovider : windows_sys::core::PCSTR, lpnetinfostruct : *mut NETINFOSTRUCT) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetNetworkInformationW(lpprovider : windows_sys::core::PCWSTR, lpnetinfostruct : *mut NETINFOSTRUCT) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetProviderNameA(dwnettype : u32, lpprovidername : windows_sys::core::PSTR, lpbuffersize : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetProviderNameW(dwnettype : u32, lpprovidername : windows_sys::core::PWSTR, lpbuffersize : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetResourceInformationA(lpnetresource : *const NETRESOURCEA, lpbuffer : *mut core::ffi::c_void, lpcbbuffer : *mut u32, lplpsystem : *mut windows_sys::core::PSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetResourceInformationW(lpnetresource : *const NETRESOURCEW, lpbuffer : *mut core::ffi::c_void, lpcbbuffer : *mut u32, lplpsystem : *mut windows_sys::core::PWSTR) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetResourceParentA(lpnetresource : *const NETRESOURCEA, lpbuffer : *mut core::ffi::c_void, lpcbbuffer : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetResourceParentW(lpnetresource : *const NETRESOURCEW, lpbuffer : *mut core::ffi::c_void, lpcbbuffer : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetUniversalNameA(lplocalpath : windows_sys::core::PCSTR, dwinfolevel : UNC_INFO_LEVEL, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetUniversalNameW(lplocalpath : windows_sys::core::PCWSTR, dwinfolevel : UNC_INFO_LEVEL, lpbuffer : *mut core::ffi::c_void, lpbuffersize : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetUserA(lpname : windows_sys::core::PCSTR, lpusername : windows_sys::core::PSTR, lpnlength : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetGetUserW(lpname : windows_sys::core::PCWSTR, lpusername : windows_sys::core::PWSTR, lpnlength : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetOpenEnumA(dwscope : NET_RESOURCE_SCOPE, dwtype : NET_RESOURCE_TYPE, dwusage : WNET_OPEN_ENUM_USAGE, lpnetresource : *const NETRESOURCEA, lphenum : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetOpenEnumW(dwscope : NET_RESOURCE_SCOPE, dwtype : NET_RESOURCE_TYPE, dwusage : WNET_OPEN_ENUM_USAGE, lpnetresource : *const NETRESOURCEW, lphenum : *mut super::super::Foundation:: HANDLE) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetSetLastErrorA(err : u32, lperror : windows_sys::core::PCSTR, lpproviders : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetSetLastErrorW(err : u32, lperror : windows_sys::core::PCWSTR, lpproviders : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetUseConnection4A(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEA, pauthbuffer : *const core::ffi::c_void, cbauthbuffer : u32, dwflags : u32, lpuseoptions : *const u8, cbuseoptions : u32, lpaccessname : windows_sys::core::PSTR, lpbuffersize : *mut u32, lpresult : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetUseConnection4W(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEW, pauthbuffer : *const core::ffi::c_void, cbauthbuffer : u32, dwflags : u32, lpuseoptions : *const u8, cbuseoptions : u32, lpaccessname : windows_sys::core::PWSTR, lpbuffersize : *mut u32, lpresult : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetUseConnectionA(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEA, lppassword : windows_sys::core::PCSTR, lpuserid : windows_sys::core::PCSTR, dwflags : NET_CONNECT_FLAGS, lpaccessname : windows_sys::core::PSTR, lpbuffersize : *mut u32, lpresult : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("mpr.dll" "system" fn WNetUseConnectionW(hwndowner : super::super::Foundation:: HWND, lpnetresource : *const NETRESOURCEW, lppassword : windows_sys::core::PCWSTR, lpuserid : windows_sys::core::PCWSTR, dwflags : NET_CONNECT_FLAGS, lpaccessname : windows_sys::core::PWSTR, lpbuffersize : *mut u32, lpresult : *mut u32) -> super::super::Foundation:: WIN32_ERROR);

public const val `CONNDLG_CONN_POINT`: `CONNECTDLGSTRUCT_FLAGS` = 2u;
public const val `CONNDLG_HIDE_BOX`: `CONNECTDLGSTRUCT_FLAGS` = 8u;
public const val `CONNDLG_NOT_PERSIST`: `CONNECTDLGSTRUCT_FLAGS` = 32u;
public const val `CONNDLG_PERSIST`: `CONNECTDLGSTRUCT_FLAGS` = 16u;
public const val `CONNDLG_RO_PATH`: `CONNECTDLGSTRUCT_FLAGS` = 1u;
public const val `CONNDLG_USE_MRU`: `CONNECTDLGSTRUCT_FLAGS` = 4u;
// UNSUPPORTED Rust 72:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONNECTDLGSTRUCTA {
//     pub cbStructure: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub lpConnRes: *mut NETRESOURCEA,
//     pub dwFlags: CONNECTDLGSTRUCT_FLAGS,
//     pub dwDevNum: u32,
// }

// UNSUPPORTED Rust 81:1: declaration Impl has no candidate rule
// impl Default for CONNECTDLGSTRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 86:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONNECTDLGSTRUCTW {
//     pub cbStructure: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub lpConnRes: *mut NETRESOURCEW,
//     pub dwFlags: CONNECTDLGSTRUCT_FLAGS,
//     pub dwDevNum: u32,
// }

// UNSUPPORTED Rust 95:1: declaration Impl has no candidate rule
// impl Default for CONNECTDLGSTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CONNECTDLGSTRUCT_FLAGS` = UInt;
public const val `CONNECT_CMD_SAVECRED`: `NET_CONNECT_FLAGS` = 4096u;
public const val `CONNECT_COMMANDLINE`: `NET_CONNECT_FLAGS` = 2048u;
public const val `CONNECT_CRED_RESET`: `NET_CONNECT_FLAGS` = 8192u;
public const val `CONNECT_CURRENT_MEDIA`: `NET_CONNECT_FLAGS` = 512u;
public const val `CONNECT_DEFERRED`: `NET_CONNECT_FLAGS` = 1024u;
public const val `CONNECT_GLOBAL_MAPPING`: `NET_CONNECT_FLAGS` = 262144u;
public const val `CONNECT_INTERACTIVE`: `NET_CONNECT_FLAGS` = 8u;
public const val `CONNECT_LOCALDRIVE`: `NET_CONNECT_FLAGS` = 256u;
public const val `CONNECT_NEED_DRIVE`: `NET_CONNECT_FLAGS` = 32u;
public const val `CONNECT_PROMPT`: `NET_CONNECT_FLAGS` = 16u;
public const val `CONNECT_REDIRECT`: `NET_CONNECT_FLAGS` = 128u;
public const val `CONNECT_REFCOUNT`: `NET_CONNECT_FLAGS` = 64u;
public const val `CONNECT_REQUIRE_INTEGRITY`: `NET_CONNECT_FLAGS` = 16384u;
public const val `CONNECT_REQUIRE_PRIVACY`: `NET_CONNECT_FLAGS` = 32768u;
public const val `CONNECT_RESERVED`: `NET_CONNECT_FLAGS` = 4278190080u;
public const val `CONNECT_TEMPORARY`: `NET_CONNECT_FLAGS` = 4u;
public const val `CONNECT_UPDATE_PROFILE`: `NET_CONNECT_FLAGS` = 1u;
public const val `CONNECT_UPDATE_RECENT`: `NET_CONNECT_FLAGS` = 2u;
public const val `CONNECT_WRITE_THROUGH_SEMANTICS`: `NET_CONNECT_FLAGS` = 65536u;
// UNSUPPORTED Rust 120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISCDLGSTRUCTA {
//     pub cbStructure: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub lpLocalName: windows_sys::core::PSTR,
//     pub lpRemoteName: windows_sys::core::PSTR,
//     pub dwFlags: DISCDLGSTRUCT_FLAGS,
// }

// UNSUPPORTED Rust 129:1: declaration Impl has no candidate rule
// impl Default for DISCDLGSTRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 134:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DISCDLGSTRUCTW {
//     pub cbStructure: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub lpLocalName: windows_sys::core::PWSTR,
//     pub lpRemoteName: windows_sys::core::PWSTR,
//     pub dwFlags: DISCDLGSTRUCT_FLAGS,
// }

// UNSUPPORTED Rust 143:1: declaration Impl has no candidate rule
// impl Default for DISCDLGSTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DISCDLGSTRUCT_FLAGS` = UInt;
public const val `DISC_NO_FORCE`: `DISCDLGSTRUCT_FLAGS` = 64u;
public const val `DISC_UPDATE_PROFILE`: `DISCDLGSTRUCT_FLAGS` = 1u;
// UNSUPPORTED Rust 151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETCONNECTINFOSTRUCT {
//     pub cbStructure: u32,
//     pub dwFlags: u32,
//     pub dwSpeed: u32,
//     pub dwDelay: u32,
//     pub dwOptDataSize: u32,
// }

// UNSUPPORTED Rust 160:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NETINFOSTRUCT {
//     pub cbStructure: u32,
//     pub dwProviderVersion: u32,
//     pub dwStatus: super::super::Foundation::WIN32_ERROR,
//     pub dwCharacteristics: NETINFOSTRUCT_CHARACTERISTICS,
//     pub dwHandle: usize,
//     pub wNetType: u16,
//     pub dwPrinters: u32,
//     pub dwDrives: u32,
// }

public typealias `NETINFOSTRUCT_CHARACTERISTICS` = UInt;
public const val `NETINFO_DISKRED`: `NETINFOSTRUCT_CHARACTERISTICS` = 4u;
public const val `NETINFO_DLL16`: `NETINFOSTRUCT_CHARACTERISTICS` = 1u;
public const val `NETINFO_PRINTERRED`: `NETINFOSTRUCT_CHARACTERISTICS` = 8u;
public const val `NETPROPERTY_PERSISTENT`: UInt = 1u;
// UNSUPPORTED Rust 177:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETRESOURCEA {
//     pub dwScope: NET_RESOURCE_SCOPE,
//     pub dwType: NET_RESOURCE_TYPE,
//     pub dwDisplayType: u32,
//     pub dwUsage: u32,
//     pub lpLocalName: windows_sys::core::PSTR,
//     pub lpRemoteName: windows_sys::core::PSTR,
//     pub lpComment: windows_sys::core::PSTR,
//     pub lpProvider: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 189:1: declaration Impl has no candidate rule
// impl Default for NETRESOURCEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETRESOURCEW {
//     pub dwScope: NET_RESOURCE_SCOPE,
//     pub dwType: NET_RESOURCE_TYPE,
//     pub dwDisplayType: u32,
//     pub dwUsage: u32,
//     pub lpLocalName: windows_sys::core::PWSTR,
//     pub lpRemoteName: windows_sys::core::PWSTR,
//     pub lpComment: windows_sys::core::PWSTR,
//     pub lpProvider: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 206:1: declaration Impl has no candidate rule
// impl Default for NETRESOURCEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NETWORK_NAME_FORMAT_FLAGS` = UInt;
public typealias `NET_CONNECT_FLAGS` = UInt;
public typealias `NET_RESOURCE_SCOPE` = UInt;
public typealias `NET_RESOURCE_TYPE` = UInt;
// UNSUPPORTED Rust 215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NOTIFYADD {
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub NetResource: NETRESOURCEA,
//     pub dwAddFlags: NET_CONNECT_FLAGS,
// }

// UNSUPPORTED Rust 222:1: declaration Impl has no candidate rule
// impl Default for NOTIFYADD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 227:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NOTIFYCANCEL {
//     pub lpName: windows_sys::core::PWSTR,
//     pub lpProvider: windows_sys::core::PWSTR,
//     pub dwFlags: u32,
//     pub fForce: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 235:1: declaration Impl has no candidate rule
// impl Default for NOTIFYCANCEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NOTIFYINFO {
//     pub dwNotifyStatus: u32,
//     pub dwOperationStatus: u32,
//     pub lpContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 247:1: declaration Impl has no candidate rule
// impl Default for NOTIFYINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NOTIFY_POST`: UInt = 2u;
public const val `NOTIFY_PRE`: UInt = 1u;
public typealias `NPDIRECTORY_NOTIFY_OPERATION` = UInt;
public typealias `NP_PROPERTY_DIALOG_SELECTION` = UInt;
// UNSUPPORTED Rust 256:1: generic scalar type unsupported
// pub type PF_AddConnectNotify = Option<unsafe extern "system" fn(lpnotifyinfo: *mut NOTIFYINFO, lpaddinfo: *const NOTIFYADD) -> u32>;

// UNSUPPORTED Rust 257:1: generic scalar type unsupported
// pub type PF_CancelConnectNotify = Option<unsafe extern "system" fn(lpnotifyinfo: *mut NOTIFYINFO, lpcancelinfo: *const NOTIFYCANCEL) -> u32>;

// UNSUPPORTED Rust 258:1: generic scalar type unsupported
// pub type PF_NPAddConnection = Option<unsafe extern "system" fn(lpnetresource: *const NETRESOURCEW, lppassword: windows_sys::core::PCWSTR, lpusername: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 259:1: generic scalar type unsupported
// pub type PF_NPAddConnection3 = Option<unsafe extern "system" fn(hwndowner: super::super::Foundation::HWND, lpnetresource: *const NETRESOURCEW, lppassword: windows_sys::core::PCWSTR, lpusername: windows_sys::core::PCWSTR, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 260:1: generic scalar type unsupported
// pub type PF_NPAddConnection4 = Option<unsafe extern "system" fn(hwndowner: super::super::Foundation::HWND, lpnetresource: *const NETRESOURCEW, lpauthbuffer: *const core::ffi::c_void, cbauthbuffer: u32, dwflags: u32, lpuseoptions: *const u8, cbuseoptions: u32) -> u32>;

// UNSUPPORTED Rust 261:1: generic scalar type unsupported
// pub type PF_NPCancelConnection = Option<unsafe extern "system" fn(lpname: windows_sys::core::PCWSTR, fforce: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 262:1: generic scalar type unsupported
// pub type PF_NPCancelConnection2 = Option<unsafe extern "system" fn(lpname: windows_sys::core::PCWSTR, fforce: windows_sys::core::BOOL, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 263:1: generic scalar type unsupported
// pub type PF_NPCloseEnum = Option<unsafe extern "system" fn(henum: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 264:1: generic scalar type unsupported
// pub type PF_NPDeviceMode = Option<unsafe extern "system" fn(hparent: super::super::Foundation::HWND) -> u32>;

// UNSUPPORTED Rust 265:1: generic scalar type unsupported
// pub type PF_NPDirectoryNotify = Option<unsafe extern "system" fn(hwnd: super::super::Foundation::HWND, lpdir: windows_sys::core::PCWSTR, dwoper: u32) -> u32>;

// UNSUPPORTED Rust 266:1: generic scalar type unsupported
// pub type PF_NPEnumResource = Option<unsafe extern "system" fn(henum: super::super::Foundation::HANDLE, lpccount: *mut u32, lpbuffer: *mut core::ffi::c_void, lpbuffersize: *mut u32) -> u32>;

// UNSUPPORTED Rust 267:1: generic scalar type unsupported
// pub type PF_NPFMXEditPerm = Option<unsafe extern "system" fn(lpdrivename: windows_sys::core::PCWSTR, hwndfmx: super::super::Foundation::HWND, ndialogtype: u32) -> u32>;

// UNSUPPORTED Rust 268:1: generic scalar type unsupported
// pub type PF_NPFMXGetPermCaps = Option<unsafe extern "system" fn(lpdrivename: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 269:1: generic scalar type unsupported
// pub type PF_NPFMXGetPermHelp = Option<unsafe extern "system" fn(lpdrivename: windows_sys::core::PCWSTR, ndialogtype: u32, fdirectory: windows_sys::core::BOOL, lpfilenamebuffer: *mut core::ffi::c_void, lpbuffersize: *mut u32, lpnhelpcontext: *mut u32) -> u32>;

// UNSUPPORTED Rust 270:1: generic scalar type unsupported
// pub type PF_NPFormatNetworkName = Option<unsafe extern "system" fn(lpremotename: windows_sys::core::PCWSTR, lpformattedname: windows_sys::core::PWSTR, lpnlength: *mut u32, dwflags: u32, dwavecharperline: u32) -> u32>;

// UNSUPPORTED Rust 271:1: generic scalar type unsupported
// pub type PF_NPGetCaps = Option<unsafe extern "system" fn(ndex: u32) -> u32>;

// UNSUPPORTED Rust 272:1: generic scalar type unsupported
// pub type PF_NPGetConnection = Option<unsafe extern "system" fn(lplocalname: windows_sys::core::PCWSTR, lpremotename: windows_sys::core::PWSTR, lpnbufferlen: *mut u32) -> u32>;

// UNSUPPORTED Rust 273:1: generic scalar type unsupported
// pub type PF_NPGetConnection3 = Option<unsafe extern "system" fn(lplocalname: windows_sys::core::PCWSTR, dwlevel: u32, lpbuffer: *mut core::ffi::c_void, lpbuffersize: *mut u32) -> u32>;

// UNSUPPORTED Rust 274:1: generic scalar type unsupported
// pub type PF_NPGetConnectionPerformance = Option<unsafe extern "system" fn(lpremotename: windows_sys::core::PCWSTR, lpnetconnectinfo: *mut NETCONNECTINFOSTRUCT) -> u32>;

// UNSUPPORTED Rust 275:1: generic scalar type unsupported
// pub type PF_NPGetDirectoryType = Option<unsafe extern "system" fn(lpname: windows_sys::core::PCWSTR, lptype: *const i32, bflushcache: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 276:1: generic scalar type unsupported
// pub type PF_NPGetPersistentUseOptionsForConnection = Option<unsafe extern "system" fn(lpremotepath: windows_sys::core::PCWSTR, lpreaduseoptions: *const u8, cbreaduseoptions: u32, lpwriteuseoptions: *mut u8, lpsizewriteuseoptions: *mut u32) -> u32>;

// UNSUPPORTED Rust 277:1: generic scalar type unsupported
// pub type PF_NPGetPropertyText = Option<unsafe extern "system" fn(ibutton: u32, npropsel: u32, lpname: windows_sys::core::PCWSTR, lpbuttonname: windows_sys::core::PWSTR, nbuttonnamelen: u32, ntype: u32) -> u32>;

// UNSUPPORTED Rust 278:1: generic scalar type unsupported
// pub type PF_NPGetResourceInformation = Option<unsafe extern "system" fn(lpnetresource: *const NETRESOURCEW, lpbuffer: *mut core::ffi::c_void, lpbuffersize: *mut u32, lplpsystem: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 279:1: generic scalar type unsupported
// pub type PF_NPGetResourceParent = Option<unsafe extern "system" fn(lpnetresource: *const NETRESOURCEW, lpbuffer: *mut core::ffi::c_void, lpbuffersize: *mut u32) -> u32>;

// UNSUPPORTED Rust 280:1: generic scalar type unsupported
// pub type PF_NPGetUniversalName = Option<unsafe extern "system" fn(lplocalpath: windows_sys::core::PCWSTR, dwinfolevel: u32, lpbuffer: *mut core::ffi::c_void, lpnbuffersize: *mut u32) -> u32>;

// UNSUPPORTED Rust 281:1: generic scalar type unsupported
// pub type PF_NPGetUser = Option<unsafe extern "system" fn(lpname: windows_sys::core::PCWSTR, lpusername: windows_sys::core::PWSTR, lpnbufferlen: *mut u32) -> u32>;

// UNSUPPORTED Rust 282:1: generic scalar type unsupported
// pub type PF_NPLogonNotify = Option<unsafe extern "system" fn(lplogonid: *const super::super::Foundation::LUID, lpauthentinfotype: windows_sys::core::PCWSTR, lpauthentinfo: *const core::ffi::c_void, lppreviousauthentinfotype: windows_sys::core::PCWSTR, lppreviousauthentinfo: *const core::ffi::c_void, lpstationname: windows_sys::core::PCWSTR, stationhandle: *const core::ffi::c_void, lplogonscript: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 283:1: generic scalar type unsupported
// pub type PF_NPOpenEnum = Option<unsafe extern "system" fn(dwscope: u32, dwtype: u32, dwusage: u32, lpnetresource: *const NETRESOURCEW, lphenum: *mut super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 284:1: generic scalar type unsupported
// pub type PF_NPPasswordChangeNotify = Option<unsafe extern "system" fn(lpauthentinfotype: windows_sys::core::PCWSTR, lpauthentinfo: *const core::ffi::c_void, lppreviousauthentinfotype: windows_sys::core::PCWSTR, lppreviousauthentinfo: *const core::ffi::c_void, lpstationname: windows_sys::core::PCWSTR, stationhandle: *const core::ffi::c_void, dwchangeinfo: u32) -> u32>;

// UNSUPPORTED Rust 285:1: generic scalar type unsupported
// pub type PF_NPPropertyDialog = Option<unsafe extern "system" fn(hwndparent: super::super::Foundation::HWND, ibuttondlg: u32, npropsel: u32, lpfilename: windows_sys::core::PCWSTR, ntype: u32) -> u32>;

// UNSUPPORTED Rust 286:1: generic scalar type unsupported
// pub type PF_NPSearchDialog = Option<unsafe extern "system" fn(hwndparent: super::super::Foundation::HWND, lpnetresource: *const NETRESOURCEW, lpbuffer: *mut core::ffi::c_void, cbbuffer: u32, lpnflags: *mut u32) -> u32>;

// UNSUPPORTED Rust 287:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REMOTE_NAME_INFOA {
//     pub lpUniversalName: windows_sys::core::PSTR,
//     pub lpConnectionName: windows_sys::core::PSTR,
//     pub lpRemainingPath: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 294:1: declaration Impl has no candidate rule
// impl Default for REMOTE_NAME_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 299:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REMOTE_NAME_INFOW {
//     pub lpUniversalName: windows_sys::core::PWSTR,
//     pub lpConnectionName: windows_sys::core::PWSTR,
//     pub lpRemainingPath: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 306:1: declaration Impl has no candidate rule
// impl Default for REMOTE_NAME_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REMOTE_NAME_INFO_LEVEL`: `UNC_INFO_LEVEL` = 2u;
public const val `RESOURCEDISPLAYTYPE_DIRECTORY`: UInt = 9u;
public const val `RESOURCEDISPLAYTYPE_NDSCONTAINER`: UInt = 11u;
public const val `RESOURCEDISPLAYTYPE_NETWORK`: UInt = 6u;
public const val `RESOURCEDISPLAYTYPE_ROOT`: UInt = 7u;
public const val `RESOURCEDISPLAYTYPE_SHAREADMIN`: UInt = 8u;
public const val `RESOURCETYPE_ANY`: `NET_RESOURCE_TYPE` = 0u;
public const val `RESOURCETYPE_DISK`: `NET_RESOURCE_TYPE` = 1u;
public const val `RESOURCETYPE_PRINT`: `NET_RESOURCE_TYPE` = 2u;
public const val `RESOURCETYPE_RESERVED`: UInt = 8u;
public const val `RESOURCETYPE_UNKNOWN`: UInt = 4294967295u;
public const val `RESOURCEUSAGE_ALL`: `WNET_OPEN_ENUM_USAGE` = 19u;
public const val `RESOURCEUSAGE_ATTACHED`: `WNET_OPEN_ENUM_USAGE` = 16u;
public const val `RESOURCEUSAGE_CONNECTABLE`: `WNET_OPEN_ENUM_USAGE` = 1u;
public const val `RESOURCEUSAGE_CONTAINER`: `WNET_OPEN_ENUM_USAGE` = 2u;
public const val `RESOURCEUSAGE_NOLOCALDEVICE`: UInt = 4u;
public const val `RESOURCEUSAGE_NONE`: `WNET_OPEN_ENUM_USAGE` = 0u;
public const val `RESOURCEUSAGE_RESERVED`: UInt = 2147483648u;
public const val `RESOURCEUSAGE_SIBLING`: UInt = 8u;
public const val `RESOURCE_CONNECTED`: `NET_RESOURCE_SCOPE` = 1u;
public const val `RESOURCE_CONTEXT`: `NET_RESOURCE_SCOPE` = 5u;
public const val `RESOURCE_GLOBALNET`: `NET_RESOURCE_SCOPE` = 2u;
public const val `RESOURCE_RECENT`: UInt = 4u;
public const val `RESOURCE_REMEMBERED`: `NET_RESOURCE_SCOPE` = 3u;
public typealias `UNC_INFO_LEVEL` = UInt;
// UNSUPPORTED Rust 336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UNIVERSAL_NAME_INFOA {
//     pub lpUniversalName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 341:1: declaration Impl has no candidate rule
// impl Default for UNIVERSAL_NAME_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UNIVERSAL_NAME_INFOW {
//     pub lpUniversalName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 351:1: declaration Impl has no candidate rule
// impl Default for UNIVERSAL_NAME_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNIVERSAL_NAME_INFO_LEVEL`: `UNC_INFO_LEVEL` = 1u;
public const val `WNCON_DYNAMIC`: UInt = 8u;
public const val `WNCON_FORNETCARD`: UInt = 1u;
public const val `WNCON_NOTROUTED`: UInt = 2u;
public const val `WNCON_SLOWLINK`: UInt = 4u;
public const val `WNDN_MKDIR`: `NPDIRECTORY_NOTIFY_OPERATION` = 1u;
public const val `WNDN_MVDIR`: `NPDIRECTORY_NOTIFY_OPERATION` = 3u;
public const val `WNDN_RMDIR`: `NPDIRECTORY_NOTIFY_OPERATION` = 2u;
public const val `WNDT_NETWORK`: UInt = 1u;
public const val `WNDT_NORMAL`: UInt = 0u;
public typealias `WNET_OPEN_ENUM_USAGE` = UInt;
public const val `WNFMT_ABBREVIATED`: `NETWORK_NAME_FORMAT_FLAGS` = 2u;
public const val `WNFMT_CONNECTION`: UInt = 32u;
public const val `WNFMT_INENUM`: UInt = 16u;
public const val `WNFMT_MULTILINE`: `NETWORK_NAME_FORMAT_FLAGS` = 1u;
public const val `WNGETCON_CONNECTED`: UInt = 0u;
public const val `WNGETCON_DISCONNECTED`: UInt = 1u;
public const val `WNNC_ADMIN`: UInt = 9u;
public const val `WNNC_ADM_DIRECTORYNOTIFY`: UInt = 2u;
public const val `WNNC_ADM_GETDIRECTORYTYPE`: UInt = 1u;
public const val `WNNC_CONNECTION`: UInt = 6u;
public const val `WNNC_CONNECTION_FLAGS`: UInt = 13u;
public const val `WNNC_CON_ADDCONNECTION`: UInt = 1u;
public const val `WNNC_CON_ADDCONNECTION3`: UInt = 8u;
public const val `WNNC_CON_ADDCONNECTION4`: UInt = 16u;
public const val `WNNC_CON_CANCELCONNECTION`: UInt = 2u;
public const val `WNNC_CON_CANCELCONNECTION2`: UInt = 32u;
public const val `WNNC_CON_DEFER`: UInt = 128u;
public const val `WNNC_CON_GETCONNECTIONS`: UInt = 4u;
public const val `WNNC_CON_GETPERFORMANCE`: UInt = 64u;
public const val `WNNC_DIALOG`: UInt = 8u;
public const val `WNNC_DLG_DEVICEMODE`: UInt = 1u;
public const val `WNNC_DLG_FORMATNETWORKNAME`: UInt = 128u;
public const val `WNNC_DLG_GETRESOURCEINFORMATION`: UInt = 2048u;
public const val `WNNC_DLG_GETRESOURCEPARENT`: UInt = 512u;
public const val `WNNC_DLG_PERMISSIONEDITOR`: UInt = 256u;
public const val `WNNC_DLG_PROPERTYDIALOG`: UInt = 32u;
public const val `WNNC_DLG_SEARCHDIALOG`: UInt = 64u;
public const val `WNNC_DRIVER_VERSION`: UInt = 3u;
public const val `WNNC_ENUMERATION`: UInt = 11u;
public const val `WNNC_ENUM_CONTEXT`: UInt = 4u;
public const val `WNNC_ENUM_GLOBAL`: UInt = 1u;
public const val `WNNC_ENUM_LOCAL`: UInt = 2u;
public const val `WNNC_ENUM_SHAREABLE`: UInt = 8u;
public const val `WNNC_NET_NONE`: UInt = 0u;
public const val `WNNC_NET_TYPE`: UInt = 2u;
public const val `WNNC_SPEC_VERSION`: UInt = 1u;
public const val `WNNC_SPEC_VERSION51`: UInt = 327681u;
public const val `WNNC_START`: UInt = 12u;
public const val `WNNC_USER`: UInt = 4u;
public const val `WNNC_USR_GETUSER`: UInt = 1u;
public const val `WNNC_WAIT_FOR_START`: UInt = 1u;
public const val `WNPERMC_AUDIT`: UInt = 2u;
public const val `WNPERMC_OWNER`: UInt = 4u;
public const val `WNPERMC_PERM`: UInt = 1u;
public typealias `WNPERM_DLG` = UInt;
public const val `WNPERM_DLG_AUDIT`: `WNPERM_DLG` = 1u;
public const val `WNPERM_DLG_OWNER`: `WNPERM_DLG` = 2u;
public const val `WNPERM_DLG_PERM`: `WNPERM_DLG` = 0u;
public const val `WNPS_DIR`: `NP_PROPERTY_DIALOG_SELECTION` = 1u;
public const val `WNPS_FILE`: `NP_PROPERTY_DIALOG_SELECTION` = 0u;
public const val `WNPS_MULT`: `NP_PROPERTY_DIALOG_SELECTION` = 2u;
public const val `WNSRCH_REFRESH_FIRST_LEVEL`: UInt = 1u;
public const val `WNTYPE_COMM`: UInt = 4u;
public const val `WNTYPE_DRIVE`: UInt = 1u;
public const val `WNTYPE_FILE`: UInt = 2u;
public const val `WNTYPE_PRINTER`: UInt = 3u;
public const val `WN_CREDENTIAL_CLASS`: UInt = 2u;
public const val `WN_NETWORK_CLASS`: UInt = 1u;
public const val `WN_NT_PASSWORD_CHANGED`: UInt = 2u;
public const val `WN_PRIMARY_AUTHENT_CLASS`: UInt = 4u;
public const val `WN_SERVICE_CLASS`: UInt = 8u;
public const val `WN_VALID_LOGON_ACCOUNT`: UInt = 1u;
