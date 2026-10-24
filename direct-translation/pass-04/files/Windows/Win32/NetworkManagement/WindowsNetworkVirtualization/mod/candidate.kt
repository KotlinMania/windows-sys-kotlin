// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wnvapi.dll, ABI=system, export=WnvOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WnvOpen`() : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wnvapi.dll, ABI=system, export=WnvRequestNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WnvRequestNotification`(`wnvhandle` : `super`.`super`.`Foundation`.`HANDLE`, `notificationparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WNV_NOTIFICATION_PARAM`>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `bytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
public const val `WNV_API_MAJOR_VERSION_1`: UInt = 1u;
public const val `WNV_API_MINOR_VERSION_0`: UInt = 0u;
public typealias `WNV_CA_NOTIFICATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNV_CUSTOMER_ADDRESS_CHANGE_PARAM` (
    public var `MACAddress`: `super`.`super`.`Networking`.`WinSock`.`DL_EUI48`,
    public var `CAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `CA`: `WNV_IP_ADDRESS`,
    public var `VirtualSubnetId`: UInt,
    public var `PAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `PA`: `WNV_IP_ADDRESS`,
    public var `NotificationReason`: `WNV_CA_NOTIFICATION_TYPE`,
)
// UNSUPPORTED Rust 19:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_CUSTOMER_ADDRESS_CHANGE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNV_IP_ADDRESS` (
    public var `IP`: `WNV_IP_ADDRESS_0`,
)
// UNSUPPORTED Rust 31:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_IP_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 37:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union WNV_IP_ADDRESS_0 {
//     pub v4: super::super::Networking::WinSock::IN_ADDR,
//     pub v6: super::super::Networking::WinSock::IN6_ADDR,
//     pub Addr: [u8; 16],
// }

// UNSUPPORTED Rust 45:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_IP_ADDRESS_0 {
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
public class `WNV_NOTIFICATION_PARAM` (
    public var `Header`: `WNV_OBJECT_HEADER`,
    public var `NotificationType`: `WNV_NOTIFICATION_TYPE`,
    public var `PendingNotifications`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 59:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNV_NOTIFICATION_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WNV_NOTIFICATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNV_OBJECT_CHANGE_PARAM` (
    public var `ObjectType`: `WNV_OBJECT_TYPE`,
    public var `ObjectParam`: `WNV_OBJECT_CHANGE_PARAM_0`,
)
// UNSUPPORTED Rust 72:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_OBJECT_CHANGE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 78:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union WNV_OBJECT_CHANGE_PARAM_0 {
//     pub ProviderAddressChange: WNV_PROVIDER_ADDRESS_CHANGE_PARAM,
//     pub CustomerAddressChange: WNV_CUSTOMER_ADDRESS_CHANGE_PARAM,
// }

// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_OBJECT_CHANGE_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WNV_OBJECT_HEADER` (
    public var `MajorVersion`: UByte,
    public var `MinorVersion`: UByte,
    public var `Size`: UInt,
)
public typealias `WNV_OBJECT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNV_POLICY_MISMATCH_PARAM` (
    public var `CAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `PAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `VirtualSubnetId`: UInt,
    public var `CA`: `WNV_IP_ADDRESS`,
    public var `PA`: `WNV_IP_ADDRESS`,
)
// UNSUPPORTED Rust 109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_POLICY_MISMATCH_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNV_PROVIDER_ADDRESS_CHANGE_PARAM` (
    public var `PAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `PA`: `WNV_IP_ADDRESS`,
    public var `AddressState`: `super`.`super`.`Networking`.`WinSock`.`NL_DAD_STATE`,
)
// UNSUPPORTED Rust 123:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for WNV_PROVIDER_ADDRESS_CHANGE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNV_REDIRECT_PARAM` (
    public var `CAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `PAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `NewPAFamily`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `VirtualSubnetId`: UInt,
    public var `CA`: `WNV_IP_ADDRESS`,
    public var `PA`: `WNV_IP_ADDRESS`,
    public var `NewPA`: `WNV_IP_ADDRESS`,
)
// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
