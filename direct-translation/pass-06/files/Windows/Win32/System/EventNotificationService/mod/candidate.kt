// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensapi.dll, ABI=system, export=IsDestinationReachableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDestinationReachableA`(`lpszdestination` : `windows_sys`.`core`.`PCSTR`, `lpqocinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`QOCINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensapi.dll, ABI=system, export=IsDestinationReachableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDestinationReachableW`(`lpszdestination` : `windows_sys`.`core`.`PCWSTR`, `lpqocinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`QOCINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sensapi.dll, ABI=system, export=IsNetworkAlive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsNetworkAlive`(`lpdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
public const val `CONNECTION_AOL`: UInt = 4u;
public const val `CONNECTION_LAN`: `SENS_CONNECTION_TYPE` = 0u;
public const val `CONNECTION_WAN`: `SENS_CONNECTION_TYPE` = 1u;
public const val `NETWORK_ALIVE_AOL`: UInt = 4u;
public const val `NETWORK_ALIVE_INTERNET`: UInt = 8u;
public const val `NETWORK_ALIVE_LAN`: UInt = 1u;
public const val `NETWORK_ALIVE_WAN`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `QOCINFO` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwInSpeed`: UInt,
    public var `dwOutSpeed`: UInt,
)
// UNSUPPORTED Rust 19:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd597cafe_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 20:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENSGUID_EVENTCLASS_LOGON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978630_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 21:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENSGUID_EVENTCLASS_LOGON2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978650_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 22:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENSGUID_EVENTCLASS_NETWORK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978620_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 23:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENSGUID_EVENTCLASS_ONNOW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd5978640_5b9f_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 24:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENSGUID_PUBLISHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fee1bd6_5b9b_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 25:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENSGUID_SUBSCRIBER_LCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3938ab0_5b9d_11d1_8dd2_00aa004abd5e);

// UNSUPPORTED Rust 26:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SENSGUID_SUBSCRIBER_WININET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3938ab5_5b9d_11d1_8dd2_00aa004abd5e);

public typealias `SENS_CONNECTION_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SENS_QOCINFO` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwOutSpeed`: UInt,
    public var `dwInSpeed`: UInt,
)
