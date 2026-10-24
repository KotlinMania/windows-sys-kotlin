// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wnvapi.dll" "system" fn WnvOpen() -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("wnvapi.dll" "system" fn WnvRequestNotification(wnvhandle : super::super::Foundation:: HANDLE, notificationparam : *mut WNV_NOTIFICATION_PARAM, overlapped : *mut super::super::System::IO:: OVERLAPPED, bytestransferred : *mut u32) -> u32);

public const val `WNV_API_MAJOR_VERSION_1`: UInt = 1u;
public const val `WNV_API_MINOR_VERSION_0`: UInt = 0u;
public typealias `WNV_CA_NOTIFICATION_TYPE` = Int;
// UNSUPPORTED Rust 7:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct WNV_CUSTOMER_ADDRESS_CHANGE_PARAM {
//     pub MACAddress: super::super::Networking::WinSock::DL_EUI48,
//     pub CAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub CA: WNV_IP_ADDRESS,
//     pub VirtualSubnetId: u32,
//     pub PAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub PA: WNV_IP_ADDRESS,
//     pub NotificationReason: WNV_CA_NOTIFICATION_TYPE,
// }

// UNSUPPORTED Rust 19:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_CUSTOMER_ADDRESS_CHANGE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 25:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct WNV_IP_ADDRESS {
//     pub IP: WNV_IP_ADDRESS_0,
// }

// UNSUPPORTED Rust 31:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_IP_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 37:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union WNV_IP_ADDRESS_0 {
//     pub v4: super::super::Networking::WinSock::IN_ADDR,
//     pub v6: super::super::Networking::WinSock::IN6_ADDR,
//     pub Addr: [u8; 16],
// }

// UNSUPPORTED Rust 45:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_IP_ADDRESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WNV_NOTIFICATION_PARAM {
//     pub Header: WNV_OBJECT_HEADER,
//     pub NotificationType: WNV_NOTIFICATION_TYPE,
//     pub PendingNotifications: u32,
//     pub Buffer: *mut u8,
// }

// UNSUPPORTED Rust 59:1: declaration Impl has no candidate rule
// impl Default for WNV_NOTIFICATION_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WNV_NOTIFICATION_TYPE` = Int;
// UNSUPPORTED Rust 65:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct WNV_OBJECT_CHANGE_PARAM {
//     pub ObjectType: WNV_OBJECT_TYPE,
//     pub ObjectParam: WNV_OBJECT_CHANGE_PARAM_0,
// }

// UNSUPPORTED Rust 72:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_OBJECT_CHANGE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 78:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union WNV_OBJECT_CHANGE_PARAM_0 {
//     pub ProviderAddressChange: WNV_PROVIDER_ADDRESS_CHANGE_PARAM,
//     pub CustomerAddressChange: WNV_CUSTOMER_ADDRESS_CHANGE_PARAM,
// }

// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_OBJECT_CHANGE_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 91:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WNV_OBJECT_HEADER {
//     pub MajorVersion: u8,
//     pub MinorVersion: u8,
//     pub Size: u32,
// }

public typealias `WNV_OBJECT_TYPE` = Int;
// UNSUPPORTED Rust 99:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct WNV_POLICY_MISMATCH_PARAM {
//     pub CAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub PAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub VirtualSubnetId: u32,
//     pub CA: WNV_IP_ADDRESS,
//     pub PA: WNV_IP_ADDRESS,
// }

// UNSUPPORTED Rust 109:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_POLICY_MISMATCH_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 115:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct WNV_PROVIDER_ADDRESS_CHANGE_PARAM {
//     pub PAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub PA: WNV_IP_ADDRESS,
//     pub AddressState: super::super::Networking::WinSock::NL_DAD_STATE,
// }

// UNSUPPORTED Rust 123:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_PROVIDER_ADDRESS_CHANGE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct WNV_REDIRECT_PARAM {
//     pub CAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub PAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub NewPAFamily: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub VirtualSubnetId: u32,
//     pub CA: WNV_IP_ADDRESS,
//     pub PA: WNV_IP_ADDRESS,
//     pub NewPA: WNV_IP_ADDRESS,
// }

// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_REDIRECT_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WnvCustomerAddressAdded`: `WNV_CA_NOTIFICATION_TYPE` = 0;
public const val `WnvCustomerAddressDeleted`: `WNV_CA_NOTIFICATION_TYPE` = 1;
public const val `WnvCustomerAddressMax`: `WNV_CA_NOTIFICATION_TYPE` = 3;
public const val `WnvCustomerAddressMoved`: `WNV_CA_NOTIFICATION_TYPE` = 2;
public const val `WnvCustomerAddressType`: `WNV_OBJECT_TYPE` = 1;
public const val `WnvNotificationTypeMax`: `WNV_NOTIFICATION_TYPE` = 3;
public const val `WnvObjectChangeType`: `WNV_NOTIFICATION_TYPE` = 2;
public const val `WnvObjectTypeMax`: `WNV_OBJECT_TYPE` = 2;
public const val `WnvPolicyMismatchType`: `WNV_NOTIFICATION_TYPE` = 0;
public const val `WnvProviderAddressType`: `WNV_OBJECT_TYPE` = 0;
public const val `WnvRedirectType`: `WNV_NOTIFICATION_TYPE` = 1;
