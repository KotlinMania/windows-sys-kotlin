// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("sensapi.dll" "system" fn IsDestinationReachableA(lpszdestination : windows_sys::core::PCSTR, lpqocinfo : *mut QOCINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("sensapi.dll" "system" fn IsDestinationReachableW(lpszdestination : windows_sys::core::PCWSTR, lpqocinfo : *mut QOCINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("sensapi.dll" "system" fn IsNetworkAlive(lpdwflags : *mut u32) -> windows_sys::core::BOOL);

public const val `CONNECTION_AOL`: UInt = 4u;
public const val `CONNECTION_LAN`: `SENS_CONNECTION_TYPE` = 0u;
public const val `CONNECTION_WAN`: `SENS_CONNECTION_TYPE` = 1u;
public const val `NETWORK_ALIVE_AOL`: UInt = 4u;
public const val `NETWORK_ALIVE_INTERNET`: UInt = 8u;
public const val `NETWORK_ALIVE_LAN`: UInt = 1u;
public const val `NETWORK_ALIVE_WAN`: UInt = 2u;
// UNSUPPORTED Rust 11:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOCINFO {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwInSpeed: u32,
//     pub dwOutSpeed: u32,
// }

// UNSUPPORTED Rust 19:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd597cafe_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 20:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENSGUID_EVENTCLASS_LOGON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978630_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 21:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENSGUID_EVENTCLASS_LOGON2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978650_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 22:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENSGUID_EVENTCLASS_NETWORK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978620_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 23:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENSGUID_EVENTCLASS_ONNOW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978640_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 24:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENSGUID_PUBLISHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fee1bd6_5b9b_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 25:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENSGUID_SUBSCRIBER_LCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3938ab0_5b9d_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 26:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SENSGUID_SUBSCRIBER_WININET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3938ab5_5b9d_11d1_8dd2_00aa004abd5e);

public typealias `SENS_CONNECTION_TYPE` = UInt;
// UNSUPPORTED Rust 28:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SENS_QOCINFO {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwOutSpeed: u32,
//     pub dwInSpeed: u32,
// }

