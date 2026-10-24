// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "system" fn MatchEnumTag(hmodule : super::super::Foundation:: HANDLE, pwcarg : windows_sys::core::PCWSTR, dwnumarg : u32, penumtable : *const TOKEN_VALUE, pdwvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "system" fn MatchToken(pwszusertoken : windows_sys::core::PCWSTR, pwszcmdtoken : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "system" fn PreprocessCommand(hmodule : super::super::Foundation:: HANDLE, ppwcarguments : *mut windows_sys::core::PWSTR, dwcurrentindex : u32, dwargcount : u32, ptttags : *mut TAG_TYPE, dwtagcount : u32, dwminargs : u32, dwmaxargs : u32, pdwtagtype : *mut u32) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "C" fn PrintError(hmodule : super::super::Foundation:: HANDLE, dwerrid : u32, ...) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "C" fn PrintMessage(pwszformat : windows_sys::core::PCWSTR, ...) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "C" fn PrintMessageFromModule(hmodule : super::super::Foundation:: HANDLE, dwmsgid : u32, ...) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "system" fn RegisterContext(pchildcontext : *const NS_CONTEXT_ATTRIBUTES) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("netsh.dll" "system" fn RegisterHelper(pguidparentcontext : *const windows_sys::core::GUID, pfnregistersubcontext : *const NS_HELPER_ATTRIBUTES) -> u32);

// UNSUPPORTED Rust 9:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMD_ENTRY {
//     pub pwszCmdToken: windows_sys::core::PCWSTR,
//     pub pfnCmdHandler: PFN_HANDLE_CMD,
//     pub dwShortCmdHelpToken: u32,
//     pub dwCmdHlpToken: u32,
//     pub dwFlags: u32,
//     pub pOsVersionCheck: PNS_OSVERSIONCHECK,
//     pub pfnCustomHelpFn: PFN_CUSTOM_HELP,
// }

// UNSUPPORTED Rust 20:1: declaration Impl has no candidate rule
// impl Default for CMD_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMD_FLAG_HIDDEN`: `NS_CMD_FLAGS` = 32;
public const val `CMD_FLAG_INTERACTIVE`: `NS_CMD_FLAGS` = 2;
public const val `CMD_FLAG_LIMIT_MASK`: `NS_CMD_FLAGS` = 65535;
public const val `CMD_FLAG_LOCAL`: `NS_CMD_FLAGS` = 8;
public const val `CMD_FLAG_ONLINE`: `NS_CMD_FLAGS` = 16;
public const val `CMD_FLAG_PRIORITY`: `NS_CMD_FLAGS` = -2147483648;
public const val `CMD_FLAG_PRIVATE`: `NS_CMD_FLAGS` = 1;
// UNSUPPORTED Rust 32:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CMD_GROUP_ENTRY {
//     pub pwszCmdGroupToken: windows_sys::core::PCWSTR,
//     pub dwShortCmdHelpToken: u32,
//     pub ulCmdGroupSize: u32,
//     pub dwFlags: u32,
//     pub pCmdGroup: *mut CMD_ENTRY,
//     pub pOsVersionCheck: PNS_OSVERSIONCHECK,
// }

// UNSUPPORTED Rust 42:1: declaration Impl has no candidate rule
// impl Default for CMD_GROUP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEFAULT_CONTEXT_PRIORITY`: UInt = 100u;
public const val `ERROR_CMD_NOT_FOUND`: UInt = 15004u;
public const val `ERROR_CONTEXT_ALREADY_REGISTERED`: UInt = 15019u;
public const val `ERROR_CONTINUE_IN_PARENT_CONTEXT`: UInt = 15016u;
public const val `ERROR_DLL_LOAD_FAILED`: UInt = 15006u;
public const val `ERROR_ENTRY_PT_NOT_FOUND`: UInt = 15005u;
public const val `ERROR_HELPER_ALREADY_REGISTERED`: UInt = 15018u;
public const val `ERROR_INIT_DISPLAY`: UInt = 15007u;
public const val `ERROR_INVALID_OPTION_TAG`: UInt = 15009u;
public const val `ERROR_INVALID_OPTION_VALUE`: UInt = 15014u;
public const val `ERROR_INVALID_SYNTAX`: UInt = 15001u;
public const val `ERROR_MISSING_OPTION`: UInt = 15011u;
public const val `ERROR_NO_CHANGE`: UInt = 15003u;
public const val `ERROR_NO_ENTRIES`: UInt = 15000u;
public const val `ERROR_NO_TAG`: UInt = 15010u;
public const val `ERROR_OKAY`: UInt = 15015u;
public const val `ERROR_PARSING_FAILURE`: UInt = 15020u;
public const val `ERROR_PROTOCOL_NOT_IN_TRANSPORT`: UInt = 15002u;
public const val `ERROR_SHOW_USAGE`: UInt = 15013u;
public const val `ERROR_SUPPRESS_OUTPUT`: UInt = 15017u;
public const val `ERROR_TAG_ALREADY_PRESENT`: UInt = 15008u;
public const val `ERROR_TRANSPORT_NOT_PRESENT`: UInt = 15012u;
// UNSUPPORTED Rust 69:1: non-scalar type Ptr unsupported
// pub const GET_RESOURCE_STRING_FN_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("GetResourceString");

public const val `MAX_NAME_LEN`: UInt = 48u;
// UNSUPPORTED Rust 71:1: non-scalar type Ptr unsupported
// pub const NETSH_ARG_DELIMITER: windows_sys::core::PCWSTR = windows_sys::core::w!("=");

// UNSUPPORTED Rust 72:1: non-scalar type Ptr unsupported
// pub const NETSH_CMD_DELIMITER: windows_sys::core::PCWSTR = windows_sys::core::w!(" ");

public const val `NETSH_COMMIT`: `NS_MODE_CHANGE` = 0;
public const val `NETSH_COMMIT_STATE`: `NS_MODE_CHANGE` = 3;
public const val `NETSH_ERROR_BASE`: UInt = 15000u;
public const val `NETSH_ERROR_END`: UInt = 15019u;
public const val `NETSH_FLUSH`: `NS_MODE_CHANGE` = 2;
public const val `NETSH_MAX_CMD_TOKEN_LENGTH`: UInt = 128u;
public const val `NETSH_MAX_TOKEN_LENGTH`: UInt = 64u;
public const val `NETSH_SAVE`: `NS_MODE_CHANGE` = 4;
public const val `NETSH_UNCOMMIT`: `NS_MODE_CHANGE` = 1;
public const val `NETSH_VERSION_50`: UInt = 20480u;
public typealias `NS_CMD_FLAGS` = Int;
// UNSUPPORTED Rust 84:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NS_CONTEXT_ATTRIBUTES {
//     pub Anonymous: NS_CONTEXT_ATTRIBUTES_0,
//     pub pwszContext: windows_sys::core::PWSTR,
//     pub guidHelper: windows_sys::core::GUID,
//     pub dwFlags: u32,
//     pub ulPriority: u32,
//     pub ulNumTopCmds: u32,
//     pub pTopCmds: *mut CMD_ENTRY,
//     pub ulNumGroups: u32,
//     pub pCmdGroups: *mut CMD_GROUP_ENTRY,
//     pub pfnCommitFn: PNS_CONTEXT_COMMIT_FN,
//     pub pfnDumpFn: PNS_CONTEXT_DUMP_FN,
//     pub pfnConnectFn: PNS_CONTEXT_CONNECT_FN,
//     pub pReserved: *mut core::ffi::c_void,
//     pub pfnOsVersionCheck: PNS_OSVERSIONCHECK,
// }

// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule
// impl Default for NS_CONTEXT_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 107:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NS_CONTEXT_ATTRIBUTES_0 {
//     pub Anonymous: NS_CONTEXT_ATTRIBUTES_0_0,
//     pub _ullAlign: u64,
// }

// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule
// impl Default for NS_CONTEXT_ATTRIBUTES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NS_CONTEXT_ATTRIBUTES_0_0 {
//     pub dwVersion: u32,
//     pub dwReserved: u32,
// }

public typealias `NS_EVENTS` = Int;
public const val `NS_EVENT_FROM_N`: `NS_EVENTS` = 4;
public const val `NS_EVENT_FROM_START`: `NS_EVENTS` = 8;
public const val `NS_EVENT_LAST_N`: `NS_EVENTS` = 1;
public const val `NS_EVENT_LAST_SECS`: `NS_EVENTS` = 2;
public const val `NS_EVENT_LOOP`: `NS_EVENTS` = 65536;
// UNSUPPORTED Rust 130:1: non-scalar type Ptr unsupported
// pub const NS_GET_EVENT_IDS_FN_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("GetEventIds");

// UNSUPPORTED Rust 131:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NS_HELPER_ATTRIBUTES {
//     pub Anonymous: NS_HELPER_ATTRIBUTES_0,
//     pub guidHelper: windows_sys::core::GUID,
//     pub pfnStart: PNS_HELPER_START_FN,
//     pub pfnStop: PNS_HELPER_STOP_FN,
// }

// UNSUPPORTED Rust 139:1: declaration Impl has no candidate rule
// impl Default for NS_HELPER_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 144:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NS_HELPER_ATTRIBUTES_0 {
//     pub Anonymous: NS_HELPER_ATTRIBUTES_0_0,
//     pub _ullAlign: u64,
// }

// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule
// impl Default for NS_HELPER_ATTRIBUTES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NS_HELPER_ATTRIBUTES_0_0 {
//     pub dwVersion: u32,
//     pub dwReserved: u32,
// }

public typealias `NS_MODE_CHANGE` = Int;
public typealias `NS_REQS` = Int;
public const val `NS_REQ_ALLOW_MULTIPLE`: `NS_REQS` = 2;
public const val `NS_REQ_ONE_OR_MORE`: `NS_REQS` = 3;
public const val `NS_REQ_PRESENT`: `NS_REQS` = 1;
public const val `NS_REQ_ZERO`: `NS_REQS` = 0;
// UNSUPPORTED Rust 167:1: generic scalar type unsupported
// pub type PFN_CUSTOM_HELP = Option<unsafe extern "system" fn(hmodule: super::super::Foundation::HANDLE, pwszcmdtoken: windows_sys::core::PCWSTR)>;

// UNSUPPORTED Rust 168:1: generic scalar type unsupported
// pub type PFN_HANDLE_CMD = Option<unsafe extern "system" fn(pwszmachine: windows_sys::core::PCWSTR, ppwcarguments: *mut windows_sys::core::PWSTR, dwcurrentindex: u32, dwargcount: u32, dwflags: u32, pvdata: *const core::ffi::c_void, pbdone: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 169:1: generic scalar type unsupported
// pub type PGET_RESOURCE_STRING_FN = Option<unsafe extern "system" fn(dwmsgid: u32, lpbuffer: windows_sys::core::PCWSTR, nbuffermax: u32) -> u32>;

// UNSUPPORTED Rust 170:1: generic scalar type unsupported
// pub type PNS_CONTEXT_COMMIT_FN = Option<unsafe extern "system" fn(dwaction: u32) -> u32>;

// UNSUPPORTED Rust 171:1: generic scalar type unsupported
// pub type PNS_CONTEXT_CONNECT_FN = Option<unsafe extern "system" fn(pwszmachine: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 172:1: generic scalar type unsupported
// pub type PNS_CONTEXT_DUMP_FN = Option<unsafe extern "system" fn(pwszrouter: windows_sys::core::PCWSTR, ppwcarguments: *const windows_sys::core::PCWSTR, dwargcount: u32, pvdata: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 173:1: generic scalar type unsupported
// pub type PNS_DLL_INIT_FN = Option<unsafe extern "system" fn(dwnetshversion: u32, preserved: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 174:1: generic scalar type unsupported
// pub type PNS_DLL_STOP_FN = Option<unsafe extern "system" fn(dwreserved: u32) -> u32>;

// UNSUPPORTED Rust 175:1: generic scalar type unsupported
// pub type PNS_HELPER_START_FN = Option<unsafe extern "system" fn(pguidparent: *const windows_sys::core::GUID, dwversion: u32) -> u32>;

// UNSUPPORTED Rust 176:1: generic scalar type unsupported
// pub type PNS_HELPER_STOP_FN = Option<unsafe extern "system" fn(dwreserved: u32) -> u32>;

// UNSUPPORTED Rust 177:1: generic scalar type unsupported
// pub type PNS_OSVERSIONCHECK = Option<unsafe extern "system" fn(cimostype: u32, cimosproductsuite: u32, cimosversion: windows_sys::core::PCWSTR, cimosbuildnumber: windows_sys::core::PCWSTR, cimservicepackmajorversion: windows_sys::core::PCWSTR, cimservicepackminorversion: windows_sys::core::PCWSTR, uireserved: u32, dwreserved: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 178:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TAG_TYPE {
//     pub pwszTag: windows_sys::core::PCWSTR,
//     pub dwRequired: u32,
//     pub bPresent: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 185:1: declaration Impl has no candidate rule
// impl Default for TAG_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOKEN_VALUE {
//     pub pwszToken: windows_sys::core::PCWSTR,
//     pub dwValue: u32,
// }

// UNSUPPORTED Rust 196:1: declaration Impl has no candidate rule
// impl Default for TOKEN_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

