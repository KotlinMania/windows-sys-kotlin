// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn McastApiCleanup());

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn McastApiStartup(version : *mut u32) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn McastEnumerateScopes(addrfamily : u16, requery : windows_sys::core::BOOL, pscopelist : *mut MCAST_SCOPE_ENTRY, pscopelen : *mut u32, pscopecount : *mut u32) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn McastGenUID(prequestid : *mut MCAST_CLIENT_UID) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn McastReleaseAddress(addrfamily : u16, prequestid : *mut MCAST_CLIENT_UID, preleaserequest : *mut MCAST_LEASE_REQUEST) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn McastRenewAddress(addrfamily : u16, prequestid : *mut MCAST_CLIENT_UID, prenewrequest : *mut MCAST_LEASE_REQUEST, prenewresponse : *mut MCAST_LEASE_RESPONSE) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn McastRequestAddress(addrfamily : u16, prequestid : *mut MCAST_CLIENT_UID, pscopectx : *mut MCAST_SCOPE_CTX, paddrrequest : *mut MCAST_LEASE_REQUEST, paddrresponse : *mut MCAST_LEASE_RESPONSE) -> u32);

// UNSUPPORTED Rust 8:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPNG_ADDRESS {
//     pub IpAddrV4: u32,
//     pub IpAddrV6: [u8; 16],
// }

// UNSUPPORTED Rust 14:1: declaration Impl has no candidate rule
// impl Default for IPNG_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCAST_API_CURRENT_VERSION`: Int = 1;
public const val `MCAST_API_VERSION_0`: Int = 0;
public const val `MCAST_API_VERSION_1`: Int = 1;
public const val `MCAST_CLIENT_ID_LEN`: UInt = 17u;
// UNSUPPORTED Rust 23:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MCAST_CLIENT_UID {
//     pub ClientUID: *mut u8,
//     pub ClientUIDLength: u32,
// }

// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule
// impl Default for MCAST_CLIENT_UID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 34:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MCAST_LEASE_REQUEST {
//     pub LeaseStartTime: i32,
//     pub MaxLeaseStartTime: i32,
//     pub LeaseDuration: u32,
//     pub MinLeaseDuration: u32,
//     pub ServerAddress: IPNG_ADDRESS,
//     pub MinAddrCount: u16,
//     pub AddrCount: u16,
//     pub pAddrBuf: *mut u8,
// }

// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule
// impl Default for MCAST_LEASE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MCAST_LEASE_RESPONSE {
//     pub LeaseStartTime: i32,
//     pub LeaseEndTime: i32,
//     pub ServerAddress: IPNG_ADDRESS,
//     pub AddrCount: u16,
//     pub pAddrBuf: *mut u8,
// }

// UNSUPPORTED Rust 60:1: declaration Impl has no candidate rule
// impl Default for MCAST_LEASE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 65:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MCAST_SCOPE_CTX {
//     pub ScopeID: IPNG_ADDRESS,
//     pub Interface: IPNG_ADDRESS,
//     pub ServerID: IPNG_ADDRESS,
// }

// UNSUPPORTED Rust 72:1: declaration Impl has no candidate rule
// impl Default for MCAST_SCOPE_CTX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 77:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MCAST_SCOPE_ENTRY {
//     pub ScopeCtx: MCAST_SCOPE_CTX,
//     pub LastAddr: IPNG_ADDRESS,
//     pub TTL: u32,
//     pub ScopeDesc: super::super::Foundation::UNICODE_STRING,
// }

// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule
// impl Default for MCAST_SCOPE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

