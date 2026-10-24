// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `AUTHENTICATE`: `OFFLOAD_OPERATION_E` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BSSID_INFO` (
    public var `BSSID`: UByteArray,
    public var `PMKID`: UByteArray,
)
// UNSUPPORTED Rust 8:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BSSID_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLOCK_NETWORK_DERIVED`: UInt = 2u;
public const val `CLOCK_PRECISION`: UInt = 4u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DD_NDIS_DEVICE_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("\\Device\\NDIS");
public const val `DOT11_RSN_KCK_LENGTH`: UInt = 16u;
public const val `DOT11_RSN_KEK_LENGTH`: UInt = 16u;
public const val `DOT11_RSN_MAX_CIPHER_KEY_LENGTH`: UInt = 32u;
public const val `EAPOL_REQUEST_ID_WOL_FLAG_MUST_ENCRYPT`: UInt = 1u;
public const val `ENCRYPT`: `OFFLOAD_OPERATION_E` = 2;
public const val `ETHERNET_LENGTH_OF_ADDRESS`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GEN_GET_NETCARD_TIME` (
    public var `ReadTime`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GEN_GET_TIME_CAPS` (
    public var `Flags`: UInt,
    public var `ClockPrecision`: UInt,
)
// UNSUPPORTED Rust 33:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_NET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcac88484_7515_4c03_82e6_71a87abac361);

// UNSUPPORTED Rust 34:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_NETUIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08336f60_0679_4c6c_85d2_ae7ced65fff7);

// UNSUPPORTED Rust 35:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_ADD_KEY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xab8b5a62_1d51_49d8_ba5c_fa980be03a1d);

// UNSUPPORTED Rust 36:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_ADD_WEP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4307bff0_2129_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 37:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_ASSOCIATION_INFORMATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa08d4dd0_960e_40bd_8cf6_c538af98f2e3);

// UNSUPPORTED Rust 38:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_AUTHENTICATION_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43920a24_2129_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 39:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_BSSID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2504b6c2_1fa5_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 40:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_BSSID_LIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69526f9a_2062_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 41:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_BSSID_LIST_SCAN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d9e01e1_ba70_11d4_b675_002048570337);

// UNSUPPORTED Rust 42:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_CONFIGURATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4a4df982_2068_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 43:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_DESIRED_RATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x452ee08e_2536_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 44:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_DISASSOCIATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43671f40_2129_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 45:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_FRAGMENTATION_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69aaa7c4_2062_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 46:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_INFRASTRUCTURE_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x697d5a7e_2062_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 47:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_MEDIA_STREAM_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a56af66_d84b_49eb_a28d_5282cbb6d0cd);

// UNSUPPORTED Rust 48:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_NETWORK_TYPES_SUPPORTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8531d6e6_2041_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 49:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_NETWORK_TYPE_IN_USE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x857e2326_2041_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 50:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_NUMBER_OF_ANTENNAS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01779336_2064_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 51:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_POWER_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x85be837c_2041_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 52:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_PRIVACY_FILTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6733c4e9_4792_11d4_97f1_00c04f79c403);

// UNSUPPORTED Rust 53:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_RELOAD_DEFAULTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x748b14e8_32ee_4425_b91b_c9848c58b55a);

// UNSUPPORTED Rust 54:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_REMOVE_KEY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x73cb28e9_3188_42d5_b553_b21237e6088c);

// UNSUPPORTED Rust 55:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_REMOVE_WEP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x433c345c_2129_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 56:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_RSSI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1507db16_2053_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 57:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_RSSI_TRIGGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x155689b8_2053_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 58:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_RTS_THRESHOLD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0134d07e_2064_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 59:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_RX_ANTENNA_SELECTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01ac07a2_2064_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 60:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_SSID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d2a90ea_2041_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 61:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_STATISTICS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x42bb73b0_2129_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 62:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_SUPPORTED_RATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49db8722_2068_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 63:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_TEST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b9ca16a_6a60_4e9d_920c_6335953fa0b5);

// UNSUPPORTED Rust 64:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_TX_ANTENNA_SELECTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01dbb74a_2064_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 65:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_TX_POWER_LEVEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11e6ba76_2053_11d4_97eb_00c04f79c403);

// UNSUPPORTED Rust 66:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_11_WEP_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb027a21f_3cfa_4125_800b_3f7a18fddcdc);

// UNSUPPORTED Rust 67:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_CURRENT_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795700_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 68:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_MAC_OPTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795703_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_MAXIMUM_LIST_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795702_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 70:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_MULTICAST_LIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795701_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 71:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_PERMANENT_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447956ff_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 72:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_RCV_ERROR_ALIGNMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795704_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 73:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_XMIT_MORE_COLLISIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795706_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 74:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_3_XMIT_ONE_COLLISION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795705_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 75:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_CURRENT_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795708_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 76:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_CURRENT_FUNCTIONAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795709_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 77:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_CURRENT_GROUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4479570a_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 78:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_CURRENT_RING_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xacf14032_a61c_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 79:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_CURRENT_RING_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x890a36ec_a61c_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_LAST_OPEN_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4479570b_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 81:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_LINE_ERRORS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xacf14033_a61c_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_LOST_FRAMES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xacf14034_a61c_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 83:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_802_5_PERMANENT_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x44795707_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_ENUMERATE_ADAPTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d7f_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_ENUMERATE_ADAPTERS_EX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16716917_4306_4be4_9b5a_3809ae44b125);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_ENUMERATE_VC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d82_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_DRIVER_VERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad198_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_HARDWARE_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad192_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_LINK_SPEED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad195_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_MAC_OPTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad19a_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 91:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_MEDIA_CONNECT_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad19b_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 92:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_MEDIA_IN_USE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad194_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_MEDIA_SUPPORTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad193_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 94:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_MINIMUM_LINK_SPEED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad19d_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 95:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_RCV_PDUS_ERROR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a214808_e35f_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 96:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_RCV_PDUS_NO_BUFFER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a214809_e35f_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 97:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_RCV_PDUS_OK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a214806_e35f_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_VENDOR_DESCRIPTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad197_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_VENDOR_DRIVER_VERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad19c_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_VENDOR_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x791ad196_e35c_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_XMIT_PDUS_ERROR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a214807_e35f_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CO_XMIT_PDUS_OK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a214805_e35f_11d0_9692_00c04fc3358c);

// UNSUPPORTED Rust 103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CURRENT_LOOKAHEAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10361_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_CURRENT_PACKET_FILTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10360_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_DRIVER_VERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10362_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_ENUMERATE_PORTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1d6abe8_15e4_4407_81b7_6b830c777cd9);

// UNSUPPORTED Rust 107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_HARDWARE_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10354_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_INTERRUPT_MODERATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd9c8eea5_f16e_467c_84d5_6345a22ce213);

// UNSUPPORTED Rust 109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_INTERRUPT_MODERATION_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd789adfa_9c56_433b_ad01_7574f3cedbe9);

// UNSUPPORTED Rust 110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_LINK_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c7d3579_252b_4614_82c5_a650daa15049);

// UNSUPPORTED Rust 111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_LINK_SPEED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10359_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_LINK_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba1f4c14_a945_4762_b916_0b5515b6f43a);

// UNSUPPORTED Rust 113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MAC_OPTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10365_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MAXIMUM_FRAME_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10358_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MAXIMUM_LOOKAHEAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10357_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MAXIMUM_SEND_PACKETS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10367_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MAXIMUM_TOTAL_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10363_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MEDIA_CONNECT_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10366_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 119:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MEDIA_IN_USE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10356_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 120:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_MEDIA_SUPPORTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec10355_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 121:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_PCI_DEVICE_CUSTOM_PROPERTIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa39f5ab_e260_4d01_82b0_b737c880ea05);

// UNSUPPORTED Rust 122:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_PHYSICAL_MEDIUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x418ca16d_3937_4208_940a_ec6196278085);

// UNSUPPORTED Rust 123:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_PHYSICAL_MEDIUM_EX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x899e7782_035b_43f9_8bb6_2b58971612e5);

// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_PORT_AUTHENTICATION_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaab6ac31_86fb_48fb_8b48_63db235ace16);

// UNSUPPORTED Rust 125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_PORT_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6fbf2a5f_8b8f_4920_8143_e6c460f52524);

// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_RCV_ERROR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447956fd_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_RCV_NO_BUFFER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447956fe_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_RCV_OK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447956fb_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_RECEIVE_BLOCK_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec1035d_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_RECEIVE_BUFFER_SPACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec1035b_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_STATISTICS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x368c45b5_c129_43c1_939e_7edc2d7fe621);

// UNSUPPORTED Rust 132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_TRANSMIT_BLOCK_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec1035c_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 133:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_TRANSMIT_BUFFER_SPACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec1035a_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 134:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_VENDOR_DESCRIPTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec1035f_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_VENDOR_DRIVER_VERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447956f9_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_VENDOR_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ec1035e_a61a_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 137:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_VLAN_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x765dc702_c5e8_4b67_843b_3f5a4ff2648b);

// UNSUPPORTED Rust 138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_XMIT_ERROR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447956fc_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 139:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_GEN_XMIT_OK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x447956fa_a61b_11d0_8dd4_00c04fc3358c);

// UNSUPPORTED Rust 140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_HD_SPLIT_CURRENT_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81d1303c_ab00_4e49_80b1_5e6e0bf9be53);

// UNSUPPORTED Rust 141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_HD_SPLIT_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c048bea_2913_4458_b68e_17f6c1e5c60e);

// UNSUPPORTED Rust 142:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_LAN_CLASS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xad498944_762f_11d0_8dcb_00c04fc3358c);

// UNSUPPORTED Rust 143:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NDK_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7969ba4d_dd80_4bc7_b3e6_68043997e519);

// UNSUPPORTED Rust 144:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NDK_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x530c69c9_2f51_49de_a1af_088d54ffa474);

// UNSUPPORTED Rust 145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_ADAPTER_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d81_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_ADAPTER_REMOVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d80_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 147:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_BIND: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5413531c_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_DEVICE_POWER_OFF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81bc8189_b026_46ab_b964_f182e342934e);

// UNSUPPORTED Rust 149:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_DEVICE_POWER_OFF_EX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4159353c_5cd7_42ce_8fe4_a45a2380cc4f);

// UNSUPPORTED Rust 150:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_DEVICE_POWER_ON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5f81cfd0_f046_4342_af61_895acedaefd9);

// UNSUPPORTED Rust 151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_DEVICE_POWER_ON_EX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2b440188_92ac_4f60_9b2d_20a30cbb6bbe);

// UNSUPPORTED Rust 152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_FILTER_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b6d3c89_5917_43ca_b578_d01a7967c41c);

// UNSUPPORTED Rust 153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_FILTER_REMOVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1f177cd9_5955_4721_9f6a_78ebdfaef889);

// UNSUPPORTED Rust 154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_UNBIND: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e3ce1ec_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_VC_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x182f9e0c_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_NOTIFY_VC_REMOVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d79_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_PM_ACTIVE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2cf76e3_b3ae_4394_a01f_338c9870e939);

// UNSUPPORTED Rust 158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_PM_ADMIN_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1528d111_708a_4ca4_9215_c05771161cda);

// UNSUPPORTED Rust 159:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RECEIVE_FILTER_ENUM_FILTERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f2c141d_83bc_11dd_94b8_001d09162bc3);

// UNSUPPORTED Rust 160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RECEIVE_FILTER_ENUM_QUEUES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f2c141b_83bc_11dd_94b8_001d09162bc3);

// UNSUPPORTED Rust 161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RECEIVE_FILTER_GLOBAL_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f2c141a_83bc_11dd_94b8_001d09162bc3);

// UNSUPPORTED Rust 162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RECEIVE_FILTER_HARDWARE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f2c1419_83bc_11dd_94b8_001d09162bc3);

// UNSUPPORTED Rust 163:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RECEIVE_FILTER_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f2c141e_83bc_11dd_94b8_001d09162bc3);

// UNSUPPORTED Rust 164:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RECEIVE_FILTER_QUEUE_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f2c141c_83bc_11dd_94b8_001d09162bc3);

// UNSUPPORTED Rust 165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RECEIVE_SCALE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x26c28774_4252_48fe_a610_a58a398c0eb1);

// UNSUPPORTED Rust 166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_RSS_ENABLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9565cd55_3402_4e32_a5b6_2f143f2f2c30);

// UNSUPPORTED Rust 167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_ASSOCIATION_COMPLETION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x458bbea7_45a4_4ae2_b176_e51f96fc0568);

// UNSUPPORTED Rust 168:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_ASSOCIATION_START: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3927843b_6980_4b48_b15b_4de50977ac40);

// UNSUPPORTED Rust 169:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_CONNECTION_COMPLETION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x96efd9c9_7f1b_4a89_bc04_3e9e271765f1);

// UNSUPPORTED Rust 170:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_CONNECTION_START: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b74299d_998f_4454_ad08_c5af28576d1b);

// UNSUPPORTED Rust 171:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_DISASSOCIATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3fbeb6fc_0fe2_43fd_b2ad_bd99b5f93e13);

// UNSUPPORTED Rust 172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_LINK_QUALITY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3285184_ea99_48ed_825e_a426b11c2754);

// UNSUPPORTED Rust 173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_MPDU_MAX_LENGTH_CHANGED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d6560ec_8e48_4a3e_9fd5_a01b698db6c5);

// UNSUPPORTED Rust 174:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_PHY_STATE_CHANGED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdeb45316_71b5_4736_bdef_0a9e9f4e62dc);

// UNSUPPORTED Rust 175:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_PMKID_CANDIDATE_LIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x26d8b8f6_db82_49eb_8bf3_4c130ef06950);

// UNSUPPORTED Rust 176:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_ROAMING_COMPLETION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd9d47d1_282b_41e4_b924_66368817fcd3);

// UNSUPPORTED Rust 177:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_ROAMING_START: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2412d0d_26c8_4f4e_93df_f7b705a0b433);

// UNSUPPORTED Rust 178:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_SCAN_CONFIRM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8500591e_a0c7_4efb_9342_b674b002cbe6);

// UNSUPPORTED Rust 179:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_DOT11_TKIPMIC_FAILURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x442c2ae4_9bc5_4b90_a889_455ef220f4ee);

// UNSUPPORTED Rust 180:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_EXTERNAL_CONNECTIVITY_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfd306974_c420_4433_b0fe_4cf6a613f59f);

// UNSUPPORTED Rust 181:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_HD_SPLIT_CURRENT_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c744b0e_ee9c_4205_90a2_015f6d65f403);

// UNSUPPORTED Rust 182:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_LINK_SPEED_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d85_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 183:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_LINK_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64c6f797_878c_4311_9246_65dba89c3a61);

// UNSUPPORTED Rust 184:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_MEDIA_CONNECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d7d_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 185:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_MEDIA_DISCONNECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d7e_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 186:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_MEDIA_SPECIFIC_INDICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d84_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 187:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_NETWORK_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca8a56f9_ce81_40e6_a70f_a067a476e9e9);

// UNSUPPORTED Rust 188:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_OPER_STATUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf917b663_845e_4d3d_b6d4_15eb27af81c5);

// UNSUPPORTED Rust 189:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_PACKET_FILTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd47c5407_2e75_46dd_8146_1d7ed2d6ab1d);

// UNSUPPORTED Rust 190:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_PM_OFFLOAD_REJECTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xadd1d481_711e_4d1a_92ca_a62db9329712);

// UNSUPPORTED Rust 191:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_PM_WAKE_REASON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0933fd58_ca62_438f_83da_dfc1cccb8145);

// UNSUPPORTED Rust 192:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_PM_WOL_PATTERN_REJECTED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf72cf68e_18d4_4d63_9a19_e69b13916b1a);

// UNSUPPORTED Rust 193:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_PORT_STATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1dac0dfe_43e5_44b7_b759_7bf46de32e81);

// UNSUPPORTED Rust 194:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_RESET_END: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d77_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 195:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_RESET_START: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x981f2d76_b1f3_11d0_8dd7_00c04fc3358c);

// UNSUPPORTED Rust 196:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_TASK_OFFLOAD_CURRENT_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45049fc6_54d8_40c8_9c3d_b011c4e715bc);

// UNSUPPORTED Rust 197:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_TASK_OFFLOAD_HARDWARE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb6b8158b_217c_4b2a_be86_6a04beea65b8);

// UNSUPPORTED Rust 198:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_TCP_CONNECTION_OFFLOAD_CURRENT_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf8edaeff_24e4_4ae6_a413_0b27f76b243d);

// UNSUPPORTED Rust 199:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_STATUS_TCP_CONNECTION_OFFLOAD_HARDWARE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x391969b6_402c_43bf_8922_39eae0da1bb5);

// UNSUPPORTED Rust 200:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_SWITCH_MICROSOFT_VENDOR_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x202547fe_1c9c_40b9_bba1_08ada1f98b3c);

// UNSUPPORTED Rust 201:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_SWITCH_PORT_PROPERTY_PROFILE_ID_DEFAULT_EXTERNAL_NIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b347846_0a0c_470a_9b7a_0d965850698f);

// UNSUPPORTED Rust 202:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_TCP_CONNECTION_OFFLOAD_CURRENT_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ee6aef1_0851_458b_bf0d_792343d1cde1);

// UNSUPPORTED Rust 203:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_TCP_CONNECTION_OFFLOAD_HARDWARE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8ce71f2c_d63a_4390_a487_18fa47262ceb);

// UNSUPPORTED Rust 204:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_TCP_OFFLOAD_CURRENT_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68542fed_5c74_461e_8934_91c6f9c60960);

// UNSUPPORTED Rust 205:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_TCP_OFFLOAD_HARDWARE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcd5f1102_590f_4ada_ab65_5b31b1dc0172);

// UNSUPPORTED Rust 206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_TCP_OFFLOAD_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8ead9a22_7f69_4bc6_949a_c8187b074e61);

// UNSUPPORTED Rust 207:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_TCP_RSC_STATISTICS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83104445_9b5d_4ee6_a2a5_2bd3fb3c36af);

// UNSUPPORTED Rust 208:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NDIS_WAKE_ON_MAGIC_PACKET_ONLY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa14f1c97_8839_4f8a_9996_a28996ebbf1d);

// UNSUPPORTED Rust 209:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NIC_SWITCH_CURRENT_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe76fdaf3_0be7_4d95_87e9_5aead4b590e9);

// UNSUPPORTED Rust 210:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_NIC_SWITCH_HARDWARE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37cab40c_d1e8_4301_8c1d_58465e0c4c0f);

// UNSUPPORTED Rust 211:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_ADD_PROTOCOL_OFFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c06c112_0d93_439b_9e6d_26be130c9784);

// UNSUPPORTED Rust 212:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_ADD_WOL_PATTERN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6fc83ba7_52bc_4faa_ac51_7d2ffe63ba90);

// UNSUPPORTED Rust 213:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_CURRENT_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3abdbd14_d44a_4a3f_9a63_a0a42a51b131);

// UNSUPPORTED Rust 214:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_GET_PROTOCOL_OFFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6435cd9_149f_498e_951b_2d94bea3e3a3);

// UNSUPPORTED Rust 215:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_HARDWARE_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xece5360d_3291_4a6e_8044_00511fed27ee);

// UNSUPPORTED Rust 216:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_PARAMETERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x560245d2_e251_409c_a280_311935be3b28);

// UNSUPPORTED Rust 217:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_PROTOCOL_OFFLOAD_LIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x736ec5ab_ca8f_4043_bb58_da402a48d9cc);

// UNSUPPORTED Rust 218:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_REMOVE_PROTOCOL_OFFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdecd7be2_a6b0_43ca_ae45_d000d20e5265);

// UNSUPPORTED Rust 219:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_REMOVE_WOL_PATTERN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa037a915_c6ca_4322_b3e3_ef754ec498dc);

// UNSUPPORTED Rust 220:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_PM_WOL_PATTERN_LIST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4022be37_7ee2_47be_a5a5_050fc79afc75);

// UNSUPPORTED Rust 221:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_RECEIVE_FILTER_CURRENT_CAPABILITIES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4054e80f_2bc1_4ccc_b033_4abc0c4a1e8c);

// UNSUPPORTED Rust 222:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_STATUS_MEDIA_SPECIFIC_INDICATION_EX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaaacfca7_954a_4632_a16e_a8a63793a9e5);

public const val `IF_ADMINISTRATIVE_DEMANDDIAL`: `IF_ADMINISTRATIVE_STATE` = 2;
public const val `IF_ADMINISTRATIVE_DISABLED`: `IF_ADMINISTRATIVE_STATE` = 0;
public const val `IF_ADMINISTRATIVE_ENABLED`: `IF_ADMINISTRATIVE_STATE` = 1;
public typealias `IF_ADMINISTRATIVE_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IF_COUNTED_STRING_LH` (
    public var `Length`: UShort,
    public var `String`: UShortArray,
)
// UNSUPPORTED Rust 233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IF_COUNTED_STRING_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IF_MAX_PHYS_ADDRESS_LENGTH`: UInt = 32u;
public const val `IF_MAX_STRING_SIZE`: UInt = 256u;
public typealias `IF_OPER_STATUS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IF_PHYSICAL_ADDRESS_LH` (
    public var `Length`: UShort,
    public var `Address`: UByteArray,
)
// UNSUPPORTED Rust 247:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IF_PHYSICAL_ADDRESS_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IOCTL_NDIS_RESERVED5`: UInt = 1507380u;
public const val `IOCTL_NDIS_RESERVED6`: UInt = 1540152u;
public const val `IPSEC_OFFLOAD_V2_AND_TCP_CHECKSUM_COEXISTENCE`: UInt = 2u;
public const val `IPSEC_OFFLOAD_V2_AND_UDP_CHECKSUM_COEXISTENCE`: UInt = 4u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_AES_GCM_128`: UInt = 8u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_AES_GCM_192`: UInt = 16u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_AES_GCM_256`: UInt = 32u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_MD5`: UInt = 1u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_SHA_1`: UInt = 2u;
public const val `IPSEC_OFFLOAD_V2_AUTHENTICATION_SHA_256`: UInt = 4u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_3_DES_CBC`: UInt = 4u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_CBC_128`: UInt = 64u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_CBC_192`: UInt = 128u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_CBC_256`: UInt = 256u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_GCM_128`: UInt = 8u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_GCM_192`: UInt = 16u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_AES_GCM_256`: UInt = 32u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_DES_CBC`: UInt = 2u;
public const val `IPSEC_OFFLOAD_V2_ENCRYPTION_NONE`: UInt = 1u;
public const val `IfOperStatusDormant`: `IF_OPER_STATUS` = 5;
public const val `IfOperStatusDown`: `IF_OPER_STATUS` = 2;
public const val `IfOperStatusLowerLayerDown`: `IF_OPER_STATUS` = 7;
public const val `IfOperStatusNotPresent`: `IF_OPER_STATUS` = 6;
public const val `IfOperStatusTesting`: `IF_OPER_STATUS` = 3;
public const val `IfOperStatusUnknown`: `IF_OPER_STATUS` = 4;
public const val `IfOperStatusUp`: `IF_OPER_STATUS` = 1;
public const val `MAXIMUM_IP_OPER_STATUS_ADDRESS_FAMILIES_SUPPORTED`: UInt = 32u;
public const val `MediaConnectStateConnected`: `NET_IF_MEDIA_CONNECT_STATE` = 1;
public const val `MediaConnectStateDisconnected`: `NET_IF_MEDIA_CONNECT_STATE` = 2;
public const val `MediaConnectStateUnknown`: `NET_IF_MEDIA_CONNECT_STATE` = 0;
public const val `MediaDuplexStateFull`: `NET_IF_MEDIA_DUPLEX_STATE` = 2;
public const val `MediaDuplexStateHalf`: `NET_IF_MEDIA_DUPLEX_STATE` = 1;
public const val `MediaDuplexStateUnknown`: `NET_IF_MEDIA_DUPLEX_STATE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_AI_REQFI` (
    public var `Capabilities`: UShort,
    public var `ListenInterval`: UShort,
    public var `CurrentAPAddress`: UByteArray,
)
// UNSUPPORTED Rust 292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_AI_REQFI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_AI_REQFI_CAPABILITIES`: UInt = 1u;
public const val `NDIS_802_11_AI_REQFI_CURRENTAPADDRESS`: UInt = 4u;
public const val `NDIS_802_11_AI_REQFI_LISTENINTERVAL`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_AI_RESFI` (
    public var `Capabilities`: UShort,
    public var `StatusCode`: UShort,
    public var `AssociationId`: UShort,
)
public const val `NDIS_802_11_AI_RESFI_ASSOCIATIONID`: UInt = 4u;
public const val `NDIS_802_11_AI_RESFI_CAPABILITIES`: UInt = 1u;
public const val `NDIS_802_11_AI_RESFI_STATUSCODE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_ASSOCIATION_INFORMATION` (
    public var `Length`: UInt,
    public var `AvailableRequestFixedIEs`: UShort,
    public var `RequestFixedIEs`: `NDIS_802_11_AI_REQFI`,
    public var `RequestIELength`: UInt,
    public var `OffsetRequestIEs`: UInt,
    public var `AvailableResponseFixedIEs`: UShort,
    public var `ResponseFixedIEs`: `NDIS_802_11_AI_RESFI`,
    public var `ResponseIELength`: UInt,
    public var `OffsetResponseIEs`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_AUTHENTICATION_ENCRYPTION` (
    public var `AuthModeSupported`: `NDIS_802_11_AUTHENTICATION_MODE`,
    public var `EncryptStatusSupported`: `NDIS_802_11_WEP_STATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_AUTHENTICATION_EVENT` (
    public var `Status`: `NDIS_802_11_STATUS_INDICATION`,
    public var `Request`: Array<`NDIS_802_11_AUTHENTICATION_REQUEST`>,
)
// UNSUPPORTED Rust 335:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_AUTHENTICATION_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_802_11_AUTHENTICATION_MODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_AUTHENTICATION_REQUEST` (
    public var `Length`: UInt,
    public var `Bssid`: UByteArray,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_AUTHENTICATION_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_AUTH_REQUEST_AUTH_FIELDS`: UInt = 15u;
public const val `NDIS_802_11_AUTH_REQUEST_GROUP_ERROR`: UInt = 14u;
public const val `NDIS_802_11_AUTH_REQUEST_KEYUPDATE`: UInt = 2u;
public const val `NDIS_802_11_AUTH_REQUEST_PAIRWISE_ERROR`: UInt = 6u;
public const val `NDIS_802_11_AUTH_REQUEST_REAUTH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_BSSID_LIST` (
    public var `NumberOfItems`: UInt,
    public var `Bssid`: Array<`NDIS_WLAN_BSSID`>,
)
// UNSUPPORTED Rust 364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_BSSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_BSSID_LIST_EX` (
    public var `NumberOfItems`: UInt,
    public var `Bssid`: Array<`NDIS_WLAN_BSSID_EX`>,
)
// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_BSSID_LIST_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_CAPABILITY` (
    public var `Length`: UInt,
    public var `Version`: UInt,
    public var `NoOfPMKIDs`: UInt,
    public var `NoOfAuthEncryptPairsSupported`: UInt,
    public var `AuthenticationEncryptionSupported`: Array<`NDIS_802_11_AUTHENTICATION_ENCRYPTION`>,
)
// UNSUPPORTED Rust 389:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_CAPABILITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_CONFIGURATION` (
    public var `Length`: UInt,
    public var `BeaconPeriod`: UInt,
    public var `ATIMWindow`: UInt,
    public var `DSConfig`: UInt,
    public var `FHConfig`: `NDIS_802_11_CONFIGURATION_FH`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_CONFIGURATION_FH` (
    public var `Length`: UInt,
    public var `HopPattern`: UInt,
    public var `HopSet`: UInt,
    public var `DwellTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_FIXED_IEs` (
    public var `Timestamp`: UByteArray,
    public var `BeaconInterval`: UShort,
    public var `Capabilities`: UShort,
)
// UNSUPPORTED Rust 418:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_FIXED_IEs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_KEY` (
    public var `Length`: UInt,
    public var `KeyIndex`: UInt,
    public var `KeyLength`: UInt,
    public var `BSSID`: UByteArray,
    public var `KeyRSC`: ULong,
    public var `KeyMaterial`: UByteArray,
)
// UNSUPPORTED Rust 433:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_LENGTH_RATES`: UInt = 8u;
public const val `NDIS_802_11_LENGTH_RATES_EX`: UInt = 16u;
public const val `NDIS_802_11_LENGTH_SSID`: UInt = 32u;
public typealias `NDIS_802_11_MEDIA_STREAM_MODE` = Int;
public typealias `NDIS_802_11_NETWORK_INFRASTRUCTURE` = Int;
public typealias `NDIS_802_11_NETWORK_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_NETWORK_TYPE_LIST` (
    public var `NumberOfItems`: UInt,
    public var `NetworkType`: Array<`NDIS_802_11_NETWORK_TYPE`>,
)
// UNSUPPORTED Rust 450:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_NETWORK_TYPE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_NON_BCAST_SSID_LIST` (
    public var `NumberOfItems`: UInt,
    public var `Non_Bcast_Ssid`: Array<`NDIS_802_11_SSID`>,
)
// UNSUPPORTED Rust 461:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_NON_BCAST_SSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_PMKID` (
    public var `Length`: UInt,
    public var `BSSIDInfoCount`: UInt,
    public var `BSSIDInfo`: Array<`BSSID_INFO`>,
)
// UNSUPPORTED Rust 473:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_PMKID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_PMKID_CANDIDATE_LIST` (
    public var `Version`: UInt,
    public var `NumCandidates`: UInt,
    public var `CandidateList`: Array<`PMKID_CANDIDATE`>,
)
// UNSUPPORTED Rust 485:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_PMKID_CANDIDATE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_802_11_PMKID_CANDIDATE_PREAUTH_ENABLED`: UInt = 1u;
public typealias `NDIS_802_11_POWER_MODE` = Int;
public typealias `NDIS_802_11_PRIVACY_FILTER` = Int;
public typealias `NDIS_802_11_RADIO_STATUS` = Int;
public typealias `NDIS_802_11_RELOAD_DEFAULTS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_REMOVE_KEY` (
    public var `Length`: UInt,
    public var `KeyIndex`: UInt,
    public var `BSSID`: UByteArray,
)
// UNSUPPORTED Rust 502:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_REMOVE_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_SSID` (
    public var `SsidLength`: UInt,
    public var `Ssid`: UByteArray,
)
// UNSUPPORTED Rust 513:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_SSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_STATISTICS` (
    public var `Length`: UInt,
    public var `TransmittedFragmentCount`: Long,
    public var `MulticastTransmittedFrameCount`: Long,
    public var `FailedCount`: Long,
    public var `RetryCount`: Long,
    public var `MultipleRetryCount`: Long,
    public var `RTSSuccessCount`: Long,
    public var `RTSFailureCount`: Long,
    public var `ACKFailureCount`: Long,
    public var `FrameDuplicateCount`: Long,
    public var `ReceivedFragmentCount`: Long,
    public var `MulticastReceivedFrameCount`: Long,
    public var `FCSErrorCount`: Long,
    public var `TKIPLocalMICFailures`: Long,
    public var `TKIPICVErrorCount`: Long,
    public var `TKIPCounterMeasuresInvoked`: Long,
    public var `TKIPReplays`: Long,
    public var `CCMPFormatErrors`: Long,
    public var `CCMPReplays`: Long,
    public var `CCMPDecryptErrors`: Long,
    public var `FourWayHandshakeFailures`: Long,
    public var `WEPUndecryptableCount`: Long,
    public var `WEPICVErrorCount`: Long,
    public var `DecryptSuccessCount`: Long,
    public var `DecryptFailureCount`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_802_11_STATUS_INDICATION` (
    public var `StatusType`: `NDIS_802_11_STATUS_TYPE`,
)
public typealias `NDIS_802_11_STATUS_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_TEST` (
    public var `Length`: UInt,
    public var `Type`: UInt,
    public var `Anonymous`: `NDIS_802_11_TEST_0`,
)
// UNSUPPORTED Rust 560:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_TEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 565:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_802_11_TEST_0 {
//     pub AuthenticationEvent: NDIS_802_11_AUTHENTICATION_EVENT,
//     pub RssiTrigger: i32,
// }

// UNSUPPORTED Rust 571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_TEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_VARIABLE_IEs` (
    public var `ElementID`: UByte,
    public var `Length`: UByte,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 583:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_VARIABLE_IEs {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_802_11_WEP` (
    public var `Length`: UInt,
    public var `KeyIndex`: UInt,
    public var `KeyLength`: UInt,
    public var `KeyMaterial`: UByteArray,
)
// UNSUPPORTED Rust 596:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_802_11_WEP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_802_11_WEP_STATUS` = Int;
public const val `NDIS_802_3_MAC_OPTION_PRIORITY`: UInt = 1u;
public typealias `NDIS_802_5_RING_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_CO_DEVICE_PROFILE` (
    public var `DeviceDescription`: `NDIS_VAR_DATA_DESC`,
    public var `DevSpecificInfo`: `NDIS_VAR_DATA_DESC`,
    public var `ulTAPISupplementaryPassThru`: UInt,
    public var `ulAddressModes`: UInt,
    public var `ulNumAddresses`: UInt,
    public var `ulBearerModes`: UInt,
    public var `ulMaxTxRate`: UInt,
    public var `ulMinTxRate`: UInt,
    public var `ulMaxRxRate`: UInt,
    public var `ulMinRxRate`: UInt,
    public var `ulMediaModes`: UInt,
    public var `ulGenerateToneModes`: UInt,
    public var `ulGenerateToneMaxNumFreq`: UInt,
    public var `ulGenerateDigitModes`: UInt,
    public var `ulMonitorToneMaxNumFreq`: UInt,
    public var `ulMonitorToneMaxNumEntries`: UInt,
    public var `ulMonitorDigitModes`: UInt,
    public var `ulGatherDigitsMinTimeout`: UInt,
    public var `ulGatherDigitsMaxTimeout`: UInt,
    public var `ulDevCapFlags`: UInt,
    public var `ulMaxNumActiveCalls`: UInt,
    public var `ulAnswerMode`: UInt,
    public var `ulUUIAcceptSize`: UInt,
    public var `ulUUIAnswerSize`: UInt,
    public var `ulUUIMakeCallSize`: UInt,
    public var `ulUUIDropSize`: UInt,
    public var `ulUUISendUserUserInfoSize`: UInt,
    public var `ulUUICallInfoSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_CO_LINK_SPEED` (
    public var `Outbound`: UInt,
    public var `Inbound`: UInt,
)
public const val `NDIS_CO_MAC_OPTION_DYNAMIC_LINK_SPEED`: UInt = 1u;
public const val `NDIS_DEFAULT_RECEIVE_FILTER_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_RECEIVE_QUEUE_GROUP_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_RECEIVE_QUEUE_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_SWITCH_ID`: UInt = 0u;
public const val `NDIS_DEFAULT_VPORT_ID`: UInt = 0u;
public typealias `NDIS_DEVICE_POWER_STATE` = Int;
public const val `NDIS_DEVICE_TYPE_ENDPOINT`: UInt = 1u;
public const val `NDIS_DEVICE_WAKE_ON_MAGIC_PACKET_ENABLE`: UInt = 4u;
public const val `NDIS_DEVICE_WAKE_ON_PATTERN_MATCH_ENABLE`: UInt = 2u;
public const val `NDIS_DEVICE_WAKE_UP_ENABLE`: UInt = 1u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_INNER_IPV4`: UInt = 1u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_INNER_IPV6`: UInt = 4u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_NOT_SUPPORTED`: UInt = 0u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_OUTER_IPV4`: UInt = 2u;
public const val `NDIS_ENCAPSULATED_PACKET_TASK_OFFLOAD_OUTER_IPV6`: UInt = 8u;
public const val `NDIS_ENCAPSULATION_IEEE_802_3`: UInt = 2u;
public const val `NDIS_ENCAPSULATION_IEEE_802_3_P_AND_Q`: UInt = 4u;
public const val `NDIS_ENCAPSULATION_IEEE_802_3_P_AND_Q_IN_OOB`: UInt = 8u;
public const val `NDIS_ENCAPSULATION_IEEE_LLC_SNAP_ROUTED`: UInt = 16u;
public const val `NDIS_ENCAPSULATION_NOT_SUPPORTED`: UInt = 0u;
public const val `NDIS_ENCAPSULATION_NULL`: UInt = 1u;
public const val `NDIS_ENCAPSULATION_TYPE_GRE_MAC`: UInt = 1u;
public const val `NDIS_ENCAPSULATION_TYPE_VXLAN`: UInt = 2u;
public const val `NDIS_ETH_TYPE_802_1Q`: UInt = 33024u;
public const val `NDIS_ETH_TYPE_802_1X`: UInt = 34958u;
public const val `NDIS_ETH_TYPE_ARP`: UInt = 2054u;
public const val `NDIS_ETH_TYPE_IPV4`: UInt = 2048u;
public const val `NDIS_ETH_TYPE_IPV6`: UInt = 34525u;
public const val `NDIS_ETH_TYPE_SLOW_PROTOCOL`: UInt = 34825u;
public typealias `NDIS_FDDI_ATTACHMENT_TYPE` = Int;
public typealias `NDIS_FDDI_LCONNECTION_STATE` = Int;
public typealias `NDIS_FDDI_RING_MGT_STATE` = Int;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_IP_IN_GRE`: UInt = 4u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_IP_IN_IP`: UInt = 2u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_NOT_ENCAPSULATED`: UInt = 1u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_NVGRE`: UInt = 8u;
public const val `NDIS_GFP_ENCAPSULATION_TYPE_VXLAN`: UInt = 16u;
public const val `NDIS_GFP_EXACT_MATCH_PROFILE_RDMA_FLOW`: UInt = 1u;
public const val `NDIS_GFP_EXACT_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_PROFILE_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_EXACT_MATCH_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_PROFILE_IS_TTL_ONE`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_GROUP_WILDCARD_MATCH_REVISION_1`: UInt = 1u;
public const val `NDIS_GFP_HEADER_PRESENT_ESP`: UInt = 2048u;
public const val `NDIS_GFP_HEADER_PRESENT_ETHERNET`: UInt = 1u;
public const val `NDIS_GFP_HEADER_PRESENT_ICMP`: UInt = 32u;
public const val `NDIS_GFP_HEADER_PRESENT_IPV4`: UInt = 2u;
public const val `NDIS_GFP_HEADER_PRESENT_IPV6`: UInt = 4u;
public const val `NDIS_GFP_HEADER_PRESENT_IP_IN_GRE_ENCAP`: UInt = 256u;
public const val `NDIS_GFP_HEADER_PRESENT_IP_IN_IP_ENCAP`: UInt = 128u;
public const val `NDIS_GFP_HEADER_PRESENT_NO_ENCAP`: UInt = 64u;
public const val `NDIS_GFP_HEADER_PRESENT_NVGRE_ENCAP`: UInt = 512u;
public const val `NDIS_GFP_HEADER_PRESENT_TCP`: UInt = 8u;
public const val `NDIS_GFP_HEADER_PRESENT_UDP`: UInt = 16u;
public const val `NDIS_GFP_HEADER_PRESENT_VXLAN_ENCAP`: UInt = 1024u;
public const val `NDIS_GFP_UNDEFINED_PROFILE_ID`: UInt = 0u;
public const val `NDIS_GFP_WILDCARD_MATCH_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_PARAMETERS_CLIENT_SPECIFIED_ADDRESS`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_VALUE_ARRAY_GET_VALUES`: UInt = 2u;
public const val `NDIS_GFT_COUNTER_VALUE_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_COUNTER_VALUE_ARRAY_UPDATE_MEMORY_MAPPED_COUNTERS`: UInt = 1u;
public const val `NDIS_GFT_CUSTOM_ACTION_LAST_ACTION`: UInt = 1u;
public const val `NDIS_GFT_CUSTOM_ACTION_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_CUSTOM_ACTION_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_DELETE_PROFILE_ALL_PROFILES`: UInt = 1u;
public const val `NDIS_GFT_DELETE_PROFILE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_DELETE_TABLE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_EMFE_ADD_IN_ACTIVATED_STATE`: UInt = 1u;
public const val `NDIS_GFT_EMFE_ALL_VPORT_FLOW_ENTRIES`: UInt = 33554432u;
public const val `NDIS_GFT_EMFE_COPY_AFTER_TCP_FIN_FLAG_SET`: UInt = 2097152u;
public const val `NDIS_GFT_EMFE_COPY_AFTER_TCP_RST_FLAG_SET`: UInt = 4194304u;
public const val `NDIS_GFT_EMFE_COPY_ALL_PACKETS`: UInt = 65536u;
public const val `NDIS_GFT_EMFE_COPY_CONDITION_CHANGED`: UInt = 16777216u;
public const val `NDIS_GFT_EMFE_COPY_FIRST_PACKET`: UInt = 131072u;
public const val `NDIS_GFT_EMFE_COPY_WHEN_TCP_FLAG_SET`: UInt = 262144u;
public const val `NDIS_GFT_EMFE_COUNTER_ALLOCATE`: UInt = 1u;
public const val `NDIS_GFT_EMFE_COUNTER_CLIENT_SPECIFIED_ADDRESS`: UInt = 4u;
public const val `NDIS_GFT_EMFE_COUNTER_MEMORY_MAPPED`: UInt = 2u;
public const val `NDIS_GFT_EMFE_COUNTER_TRACK_TCP_FLOW`: UInt = 8u;
public const val `NDIS_GFT_EMFE_CUSTOM_ACTION_PRESENT`: UInt = 524288u;
public const val `NDIS_GFT_EMFE_MATCH_AND_ACTION_MUST_BE_SUPPORTED`: UInt = 2u;
public const val `NDIS_GFT_EMFE_META_ACTION_BEFORE_HEADER_TRANSPOSITION`: UInt = 1048576u;
public const val `NDIS_GFT_EMFE_RDMA_FLOW`: UInt = 4u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 8192u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 32768u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 4096u;
public const val `NDIS_GFT_EMFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 16384u;
public const val `NDIS_GFT_EXACT_MATCH_FLOW_ENTRY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ALL_NIC_SWITCH_FLOW_ENTRIES`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ALL_TABLE_FLOW_ENTRIES`: UInt = 2u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ALL_VPORT_FLOW_ENTRIES`: UInt = 4u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ARRAY_COUNTER_VALUES`: UInt = 65536u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ARRAY_DEFINED`: UInt = 16u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_ID_RANGE_DEFINED`: UInt = 8u;
public const val `NDIS_GFT_FLOW_ENTRY_INFO_ALL_FLOW_ENTRIES`: UInt = 1u;
public const val `NDIS_GFT_FLOW_ENTRY_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_FREE_COUNTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_DECREMENT_TTL_IF_NOT_ONE`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_PROFILE_DECREMENT_TTL_IF_NOT_ONE`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HEADER_GROUP_TRANSPOSITION_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HEADER_TRANSPOSITION_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_HTP_COPY_ALL_PACKETS`: UInt = 16u;
public const val `NDIS_GFT_HTP_COPY_FIRST_PACKET`: UInt = 32u;
public const val `NDIS_GFT_HTP_COPY_WHEN_TCP_FLAG_SET`: UInt = 64u;
public const val `NDIS_GFT_HTP_CUSTOM_ACTION_PRESENT`: UInt = 128u;
public const val `NDIS_GFT_HTP_META_ACTION_BEFORE_HEADER_TRANSPOSITION`: UInt = 256u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 2u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 8u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 1u;
public const val `NDIS_GFT_HTP_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 4u;
public const val `NDIS_GFT_MAX_COUNTER_OBJECTS_PER_FLOW_ENTRY`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_8021P_PRIORITY_MASK`: UInt = 131072u;
public const val `NDIS_GFT_OFFLOAD_CAPS_ADD_FLOW_ENTRY_DEACTIVATED_PREFERRED`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_ALLOW`: UInt = 262144u;
public const val `NDIS_GFT_OFFLOAD_CAPS_CLIENT_SPECIFIED_MEMORY_MAPPED_COUNTERS`: UInt = 16u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COMBINED_COUNTER_AND_STATE`: UInt = 256u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COPY_ALL`: UInt = 256u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COPY_FIRST`: UInt = 512u;
public const val `NDIS_GFT_OFFLOAD_CAPS_COPY_WHEN_TCP_FLAG_SET`: UInt = 1024u;
public const val `NDIS_GFT_OFFLOAD_CAPS_DESIGNATED_EXCEPTION_VPORT`: UInt = 32768u;
public const val `NDIS_GFT_OFFLOAD_CAPS_DROP`: UInt = 524288u;
public const val `NDIS_GFT_OFFLOAD_CAPS_DSCP_MASK`: UInt = 65536u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EGRESS_AGGREGATE_COUNTERS`: UInt = 64u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EGRESS_EXACT_MATCH`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EGRESS_WILDCARD_MATCH`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_EGRESS_EXACT_MATCH`: UInt = 128u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_EGRESS_WILDCARD_MATCH`: UInt = 32u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_INGRESS_EXACT_MATCH`: UInt = 64u;
public const val `NDIS_GFT_OFFLOAD_CAPS_EXT_VPORT_INGRESS_WILDCARD_MATCH`: UInt = 16u;
public const val `NDIS_GFT_OFFLOAD_CAPS_IGNORE_ACTION_SUPPORTED`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPS_INGRESS_AGGREGATE_COUNTERS`: UInt = 32u;
public const val `NDIS_GFT_OFFLOAD_CAPS_INGRESS_EXACT_MATCH`: UInt = 4u;
public const val `NDIS_GFT_OFFLOAD_CAPS_INGRESS_WILDCARD_MATCH`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_MEMORY_MAPPED_COUNTERS`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_MEMORY_MAPPED_PAKCET_AND_BYTE_COUNTERS`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_META_ACTION_AFTER_HEADER_TRANSPOSITION`: UInt = 8192u;
public const val `NDIS_GFT_OFFLOAD_CAPS_META_ACTION_BEFORE_HEADER_TRANSPOSITION`: UInt = 4096u;
public const val `NDIS_GFT_OFFLOAD_CAPS_MODIFY`: UInt = 4u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PER_FLOW_ENTRY_COUNTERS`: UInt = 4u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PER_PACKET_COUNTER_UPDATE`: UInt = 8u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PER_VPORT_EXCEPTION_VPORT`: UInt = 16384u;
public const val `NDIS_GFT_OFFLOAD_CAPS_POP`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_CAPS_PUSH`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_RATE_LIMITING_QUEUE_SUPPORTED`: UInt = 2u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 32u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 128u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 16u;
public const val `NDIS_GFT_OFFLOAD_CAPS_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 64u;
public const val `NDIS_GFT_OFFLOAD_CAPS_SAMPLE`: UInt = 2048u;
public const val `NDIS_GFT_OFFLOAD_CAPS_TRACK_TCP_FLOW_STATE`: UInt = 128u;
public const val `NDIS_GFT_OFFLOAD_PARAMETERS_CUSTOM_PROVIDER_RESERVED`: UInt = 4278190080u;
public const val `NDIS_GFT_OFFLOAD_PARAMETERS_ENABLE_OFFLOAD`: UInt = 1u;
public const val `NDIS_GFT_OFFLOAD_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_PROFILE_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_PROFILE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_RESERVED_CUSTOM_ACTIONS`: UInt = 256u;
public const val `NDIS_GFT_STATISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_TABLE_INCLUDE_EXTERNAL_VPPORT`: UInt = 1u;
public const val `NDIS_GFT_TABLE_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_TABLE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_TABLE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_UNDEFINED_COUNTER_ID`: UInt = 0u;
public const val `NDIS_GFT_UNDEFINED_CUSTOM_ACTION`: UInt = 0u;
public const val `NDIS_GFT_UNDEFINED_FLOW_ENTRY_ID`: UInt = 0u;
public const val `NDIS_GFT_UNDEFINED_TABLE_ID`: UInt = 0u;
public const val `NDIS_GFT_VPORT_DSCP_FLAGS_CHANGED`: UInt = 67108864u;
public const val `NDIS_GFT_VPORT_DSCP_GUARD_ENABLE_RX`: UInt = 1u;
public const val `NDIS_GFT_VPORT_DSCP_GUARD_ENABLE_TX`: UInt = 2u;
public const val `NDIS_GFT_VPORT_DSCP_MASK_CHANGED`: UInt = 8388608u;
public const val `NDIS_GFT_VPORT_DSCP_MASK_ENABLE_RX`: UInt = 4u;
public const val `NDIS_GFT_VPORT_DSCP_MASK_ENABLE_TX`: UInt = 8u;
public const val `NDIS_GFT_VPORT_ENABLE`: UInt = 1u;
public const val `NDIS_GFT_VPORT_ENABLE_STATE_CHANGED`: UInt = 1048576u;
public const val `NDIS_GFT_VPORT_EXCEPTION_VPORT_CHANGED`: UInt = 2097152u;
public const val `NDIS_GFT_VPORT_MAX_DSCP_MASK_COUNTER_OBJECTS`: UInt = 64u;
public const val `NDIS_GFT_VPORT_MAX_PRIORITY_MASK_COUNTER_OBJECTS`: UInt = 8u;
public const val `NDIS_GFT_VPORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_GFT_VPORT_PARAMS_CHANGE_MASK`: UInt = 4293918720u;
public const val `NDIS_GFT_VPORT_PARAMS_CUSTOM_PROVIDER_RESERVED`: UInt = 1044480u;
public const val `NDIS_GFT_VPORT_PARSE_VXLAN`: UInt = 2u;
public const val `NDIS_GFT_VPORT_PARSE_VXLAN_NOT_IN_SRC_PORT_RANGE`: UInt = 4u;
public const val `NDIS_GFT_VPORT_PRIORITY_MASK_CHANGED`: UInt = 16777216u;
public const val `NDIS_GFT_VPORT_SAMPLING_RATE_CHANGED`: UInt = 4194304u;
public const val `NDIS_GFT_VPORT_VXLAN_SETTINGS_CHANGED`: UInt = 33554432u;
public const val `NDIS_GFT_WCFE_ADD_IN_ACTIVATED_STATE`: UInt = 1u;
public const val `NDIS_GFT_WCFE_COPY_ALL_PACKETS`: UInt = 32u;
public const val `NDIS_GFT_WCFE_COUNTER_ALLOCATE`: UInt = 1u;
public const val `NDIS_GFT_WCFE_COUNTER_CLIENT_SPECIFIED_ADDRESS`: UInt = 4u;
public const val `NDIS_GFT_WCFE_COUNTER_MEMORY_MAPPED`: UInt = 2u;
public const val `NDIS_GFT_WCFE_CUSTOM_ACTION_PRESENT`: UInt = 64u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT`: UInt = 4u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_EGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 16u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT`: UInt = 2u;
public const val `NDIS_GFT_WCFE_REDIRECT_TO_INGRESS_QUEUE_OF_VPORT_IF_TTL_IS_ONE`: UInt = 8u;
public const val `NDIS_GFT_WILDCARD_MATCH_FLOW_ENTRY_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_GUID` (
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `Anonymous`: `NDIS_GUID_0`,
    public var `Size`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 857:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_GUID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 862:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NDIS_GUID_0 {
//     pub Oid: u32,
//     pub Status: i32,
// }

// UNSUPPORTED Rust 868:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_GUID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_HARDWARE_CROSSTIMESTAMP` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `SystemTimestamp1`: ULong,
    public var `HardwareClockTimestamp`: ULong,
    public var `SystemTimestamp2`: ULong,
)
public const val `NDIS_HARDWARE_CROSSTIMESTAMP_REVISION_1`: UInt = 1u;
public typealias `NDIS_HARDWARE_STATUS` = Int;
public const val `NDIS_HASH_FUNCTION_MASK`: UInt = 255u;
public const val `NDIS_HASH_IPV4`: UInt = 256u;
public const val `NDIS_HASH_IPV6`: UInt = 1024u;
public const val `NDIS_HASH_IPV6_EX`: UInt = 2048u;
public const val `NDIS_HASH_TCP_IPV4`: UInt = 512u;
public const val `NDIS_HASH_TCP_IPV6`: UInt = 4096u;
public const val `NDIS_HASH_TCP_IPV6_EX`: UInt = 8192u;
public const val `NDIS_HASH_TYPE_MASK`: UInt = 16776960u;
public const val `NDIS_HASH_UDP_IPV4`: UInt = 16384u;
public const val `NDIS_HASH_UDP_IPV6`: UInt = 32768u;
public const val `NDIS_HASH_UDP_IPV6_EX`: UInt = 65536u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_HEADER_DATA_SPLIT`: UInt = 1u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_IPV4_OPTIONS`: UInt = 2u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_IPV6_EXTENSION_HEADERS`: UInt = 4u;
public const val `NDIS_HD_SPLIT_CAPS_SUPPORTS_TCP_OPTIONS`: UInt = 8u;
public const val `NDIS_HD_SPLIT_COMBINE_ALL_HEADERS`: UInt = 1u;
public const val `NDIS_HD_SPLIT_CURRENT_CONFIG_REVISION_1`: UInt = 1u;
public const val `NDIS_HD_SPLIT_ENABLE_HEADER_DATA_SPLIT`: UInt = 1u;
public const val `NDIS_HD_SPLIT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_HYPERVISOR_INFO_FLAG_HYPERVISOR_PRESENT`: UInt = 1u;
public const val `NDIS_HYPERVISOR_INFO_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_INTERFACE_INFORMATION` (
    public var `ifOperStatus`: `NET_IF_OPER_STATUS`,
    public var `ifOperStatusFlags`: UInt,
    public var `MediaConnectState`: `NET_IF_MEDIA_CONNECT_STATE`,
    public var `MediaDuplexState`: `NET_IF_MEDIA_DUPLEX_STATE`,
    public var `ifMtu`: UInt,
    public var `ifPromiscuousMode`: Boolean,
    public var `ifDeviceWakeUpEnable`: Boolean,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `ifLastChange`: ULong,
    public var `ifCounterDiscontinuityTime`: ULong,
    public var `ifInUnknownProtos`: ULong,
    public var `ifInDiscards`: ULong,
    public var `ifInErrors`: ULong,
    public var `ifHCInOctets`: ULong,
    public var `ifHCInUcastPkts`: ULong,
    public var `ifHCInMulticastPkts`: ULong,
    public var `ifHCInBroadcastPkts`: ULong,
    public var `ifHCOutOctets`: ULong,
    public var `ifHCOutUcastPkts`: ULong,
    public var `ifHCOutMulticastPkts`: ULong,
    public var `ifHCOutBroadcastPkts`: ULong,
    public var `ifOutErrors`: ULong,
    public var `ifOutDiscards`: ULong,
    public var `ifHCInUcastOctets`: ULong,
    public var `ifHCInMulticastOctets`: ULong,
    public var `ifHCInBroadcastOctets`: ULong,
    public var `ifHCOutUcastOctets`: ULong,
    public var `ifHCOutMulticastOctets`: ULong,
    public var `ifHCOutBroadcastOctets`: ULong,
    public var `CompartmentId`: `NET_IF_COMPARTMENT_ID`,
    public var `SupportedStatistics`: UInt,
)
public typealias `NDIS_INTERRUPT_MODERATION` = Int;
public const val `NDIS_INTERRUPT_MODERATION_CHANGE_NEEDS_REINITIALIZE`: UInt = 2u;
public const val `NDIS_INTERRUPT_MODERATION_CHANGE_NEEDS_RESET`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_INTERRUPT_MODERATION_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `InterruptModeration`: `NDIS_INTERRUPT_MODERATION`,
)
public const val `NDIS_INTERRUPT_MODERATION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1` (
    public var `Supported`: `NDIS_IPSEC_OFFLOAD_V1_0`,
    public var `IPv4AH`: `NDIS_IPSEC_OFFLOAD_V1_1`,
    public var `IPv4ESP`: `NDIS_IPSEC_OFFLOAD_V1_2`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1_1` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1_2` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IPSEC_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `AhEspCombined`: UInt,
    public var `TransportTunnelCombined`: UInt,
    public var `IPv4Options`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IP_OPER_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `IpOperationalStatus`: `NDIS_IP_OPER_STATUS`,
)
public const val `NDIS_IP_OPER_STATE_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IP_OPER_STATUS` (
    public var `AddressFamily`: UInt,
    public var `OperationalStatus`: `NET_IF_OPER_STATUS`,
    public var `OperationalStatusFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_IP_OPER_STATUS_INFO` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `NumberofAddressFamiliesReturned`: UInt,
    public var `IpOperationalStatus`: Array<`NDIS_IP_OPER_STATUS`>,
)
// UNSUPPORTED Rust 1001:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_IP_OPER_STATUS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_IP_OPER_STATUS_INFO_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_IRDA_PACKET_INFO` (
    public var `ExtraBOFs`: UInt,
    public var `MinTurnAroundTime`: UInt,
)
public const val `NDIS_ISOLATION_NAME_MAX_STRING_SIZE`: UInt = 127u;
public const val `NDIS_ISOLATION_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_LINK_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `MediaDuplexState`: `NET_IF_MEDIA_DUPLEX_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `PauseFunctions`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS`,
    public var `AutoNegotiationFlags`: UInt,
)
public const val `NDIS_LINK_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_LINK_SPEED` (
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_LINK_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `MediaConnectState`: `NET_IF_MEDIA_CONNECT_STATE`,
    public var `MediaDuplexState`: `NET_IF_MEDIA_DUPLEX_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `PauseFunctions`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS`,
    public var `AutoNegotiationFlags`: UInt,
)
public const val `NDIS_LINK_STATE_DUPLEX_AUTO_NEGOTIATED`: UInt = 4u;
public const val `NDIS_LINK_STATE_PAUSE_FUNCTIONS_AUTO_NEGOTIATED`: UInt = 8u;
public const val `NDIS_LINK_STATE_RCV_LINK_SPEED_AUTO_NEGOTIATED`: UInt = 2u;
public const val `NDIS_LINK_STATE_REVISION_1`: UInt = 1u;
public const val `NDIS_LINK_STATE_XMIT_LINK_SPEED_AUTO_NEGOTIATED`: UInt = 1u;
public const val `NDIS_MAC_OPTION_8021P_PRIORITY`: UInt = 64u;
public const val `NDIS_MAC_OPTION_8021Q_VLAN`: UInt = 512u;
public const val `NDIS_MAC_OPTION_COPY_LOOKAHEAD_DATA`: UInt = 1u;
public const val `NDIS_MAC_OPTION_EOTX_INDICATION`: UInt = 32u;
public const val `NDIS_MAC_OPTION_FULL_DUPLEX`: UInt = 16u;
public const val `NDIS_MAC_OPTION_NO_LOOPBACK`: UInt = 8u;
public const val `NDIS_MAC_OPTION_RECEIVE_AT_DPC`: UInt = 256u;
public const val `NDIS_MAC_OPTION_RECEIVE_SERIALIZED`: UInt = 2u;
public const val `NDIS_MAC_OPTION_RESERVED`: UInt = 2147483648u;
public const val `NDIS_MAC_OPTION_SUPPORTS_MAC_ADDRESS_OVERWRITE`: UInt = 128u;
public const val `NDIS_MAC_OPTION_TRANSFERS_NOT_PEND`: UInt = 4u;
public const val `NDIS_MAXIMUM_PORTS`: UInt = 16777216u;
public const val `NDIS_MEDIA_CAP_RECEIVE`: UInt = 2u;
public const val `NDIS_MEDIA_CAP_TRANSMIT`: UInt = 1u;
public typealias `NDIS_MEDIA_STATE` = Int;
public typealias `NDIS_MEDIUM` = Int;
public const val `NDIS_NDK_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_NDK_CONNECTIONS_REVISION_1`: UInt = 1u;
public const val `NDIS_NDK_LOCAL_ENDPOINTS_REVISION_1`: UInt = 1u;
public const val `NDIS_NDK_STATISTICS_INFO_REVISION_1`: UInt = 1u;
public typealias `NDIS_NETWORK_CHANGE_TYPE` = Int;
public const val `NDIS_NIC_SWITCH_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_CAPABILITIES_REVISION_3`: UInt = 3u;
public const val `NDIS_NIC_SWITCH_CAPS_ASYMMETRIC_QUEUE_PAIRS_FOR_NONDEFAULT_VPORT_SUPPORTED`: UInt = 4u;
public const val `NDIS_NIC_SWITCH_CAPS_NIC_SWITCH_WITHOUT_IOV_SUPPORTED`: UInt = 64u;
public const val `NDIS_NIC_SWITCH_CAPS_PER_VPORT_INTERRUPT_MODERATION_SUPPORTED`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_ON_PF_VPORTS_SUPPORTED`: UInt = 128u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PARAMETERS_PER_PF_VPORT_SUPPORTED`: UInt = 32u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_HASH_FUNCTION_SUPPORTED`: UInt = 512u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_HASH_KEY_SUPPORTED`: UInt = 2048u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_HASH_TYPE_SUPPORTED`: UInt = 1024u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_INDIRECTION_TABLE_SIZE_RESTRICTED`: UInt = 4096u;
public const val `NDIS_NIC_SWITCH_CAPS_RSS_PER_PF_VPORT_INDIRECTION_TABLE_SUPPORTED`: UInt = 256u;
public const val `NDIS_NIC_SWITCH_CAPS_SINGLE_VPORT_POOL`: UInt = 16u;
public const val `NDIS_NIC_SWITCH_CAPS_VF_RSS_SUPPORTED`: UInt = 8u;
public const val `NDIS_NIC_SWITCH_CAPS_VLAN_SUPPORTED`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_DELETE_SWITCH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_DELETE_VPORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_FREE_VF_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_CHANGE_MASK`: UInt = 4294901760u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_DEFAULT_NUMBER_OF_QUEUE_PAIRS_FOR_DEFAULT_VPORT`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_PARAMETERS_SWITCH_NAME_CHANGED`: UInt = 65536u;
public const val `NDIS_NIC_SWITCH_VF_INFO_ARRAY_ENUM_ON_SPECIFIC_SWITCH`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VF_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VF_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VF_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_ARRAY_ENUM_ON_SPECIFIC_FUNCTION`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_ARRAY_ENUM_ON_SPECIFIC_SWITCH`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_GFT_ENABLED`: UInt = 4u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_LOOKAHEAD_SPLIT_ENABLED`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_PACKET_DIRECT_RX_ONLY`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_CHANGE_MASK`: UInt = 4294901760u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_ENFORCE_MAX_SG_LIST`: UInt = 32768u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_FLAGS_CHANGED`: UInt = 65536u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_INT_MOD_CHANGED`: UInt = 262144u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_LOOKAHEAD_SPLIT_ENABLED`: UInt = 1u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_NAME_CHANGED`: UInt = 131072u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_NDK_PARAMS_CHANGED`: UInt = 2097152u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_NUM_QUEUE_PAIRS_CHANGED`: UInt = 8388608u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_PACKET_DIRECT_RX_ONLY`: UInt = 2u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_PROCESSOR_AFFINITY_CHANGED`: UInt = 1048576u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_QOS_SQ_ID_CHANGED`: UInt = 4194304u;
public const val `NDIS_NIC_SWITCH_VPORT_PARAMS_STATE_CHANGED`: UInt = 524288u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OBJECT_HEADER` (
    public var `Type`: UByte,
    public var `Revision`: UByte,
    public var `Size`: UShort,
)
public const val `NDIS_OBJECT_REVISION_1`: UInt = 1u;
public const val `NDIS_OBJECT_TYPE_BIND_PARAMETERS`: UInt = 134u;
public const val `NDIS_OBJECT_TYPE_CLIENT_CHIMNEY_OFFLOAD_CHARACTERISTICS`: UInt = 147u;
public const val `NDIS_OBJECT_TYPE_CLIENT_CHIMNEY_OFFLOAD_GENERIC_CHARACTERISTICS`: UInt = 142u;
public const val `NDIS_OBJECT_TYPE_CONFIGURATION_OBJECT`: UInt = 169u;
public const val `NDIS_OBJECT_TYPE_CO_CALL_MANAGER_OPTIONAL_HANDLERS`: UInt = 165u;
public const val `NDIS_OBJECT_TYPE_CO_CLIENT_OPTIONAL_HANDLERS`: UInt = 166u;
public const val `NDIS_OBJECT_TYPE_CO_MINIPORT_CHARACTERISTICS`: UInt = 145u;
public const val `NDIS_OBJECT_TYPE_CO_PROTOCOL_CHARACTERISTICS`: UInt = 144u;
public const val `NDIS_OBJECT_TYPE_DEFAULT`: UInt = 128u;
public const val `NDIS_OBJECT_TYPE_DEVICE_OBJECT_ATTRIBUTES`: UInt = 133u;
public const val `NDIS_OBJECT_TYPE_DRIVER_WRAPPER_OBJECT`: UInt = 170u;
public const val `NDIS_OBJECT_TYPE_FILTER_ATTACH_PARAMETERS`: UInt = 153u;
public const val `NDIS_OBJECT_TYPE_FILTER_ATTRIBUTES`: UInt = 141u;
public const val `NDIS_OBJECT_TYPE_FILTER_DRIVER_CHARACTERISTICS`: UInt = 139u;
public const val `NDIS_OBJECT_TYPE_FILTER_PARTIAL_CHARACTERISTICS`: UInt = 140u;
public const val `NDIS_OBJECT_TYPE_FILTER_PAUSE_PARAMETERS`: UInt = 154u;
public const val `NDIS_OBJECT_TYPE_FILTER_RESTART_PARAMETERS`: UInt = 155u;
public const val `NDIS_OBJECT_TYPE_HD_SPLIT_ATTRIBUTES`: UInt = 171u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_GENERAL_ATTRIBUTES`: UInt = 159u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_HARDWARE_ASSIST_ATTRIBUTES`: UInt = 175u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_NATIVE_802_11_ATTRIBUTES`: UInt = 161u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_NDK_ATTRIBUTES`: UInt = 179u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_OFFLOAD_ATTRIBUTES`: UInt = 160u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_PACKET_DIRECT_ATTRIBUTES`: UInt = 197u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADAPTER_REGISTRATION_ATTRIBUTES`: UInt = 158u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_ADD_DEVICE_REGISTRATION_ATTRIBUTES`: UInt = 164u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_DEVICE_POWER_NOTIFICATION`: UInt = 198u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_DRIVER_CHARACTERISTICS`: UInt = 138u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_INIT_PARAMETERS`: UInt = 129u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_INTERRUPT`: UInt = 132u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_PNP_CHARACTERISTICS`: UInt = 146u;
public const val `NDIS_OBJECT_TYPE_MINIPORT_SS_CHARACTERISTICS`: UInt = 180u;
public const val `NDIS_OBJECT_TYPE_NDK_PROVIDER_CHARACTERISTICS`: UInt = 178u;
public const val `NDIS_OBJECT_TYPE_NSI_COMPARTMENT_RW_STRUCT`: UInt = 173u;
public const val `NDIS_OBJECT_TYPE_NSI_INTERFACE_PERSIST_RW_STRUCT`: UInt = 174u;
public const val `NDIS_OBJECT_TYPE_NSI_NETWORK_RW_STRUCT`: UInt = 172u;
public const val `NDIS_OBJECT_TYPE_OFFLOAD`: UInt = 167u;
public const val `NDIS_OBJECT_TYPE_OFFLOAD_ENCAPSULATION`: UInt = 168u;
public const val `NDIS_OBJECT_TYPE_OID_REQUEST`: UInt = 150u;
public const val `NDIS_OBJECT_TYPE_OPEN_PARAMETERS`: UInt = 135u;
public const val `NDIS_OBJECT_TYPE_PCI_DEVICE_CUSTOM_PROPERTIES_REVISION_1`: UInt = 1u;
public const val `NDIS_OBJECT_TYPE_PCI_DEVICE_CUSTOM_PROPERTIES_REVISION_2`: UInt = 2u;
public const val `NDIS_OBJECT_TYPE_PD_RECEIVE_QUEUE`: UInt = 191u;
public const val `NDIS_OBJECT_TYPE_PD_TRANSMIT_QUEUE`: UInt = 190u;
public const val `NDIS_OBJECT_TYPE_PORT_CHARACTERISTICS`: UInt = 156u;
public const val `NDIS_OBJECT_TYPE_PORT_STATE`: UInt = 157u;
public const val `NDIS_OBJECT_TYPE_PROTOCOL_DRIVER_CHARACTERISTICS`: UInt = 149u;
public const val `NDIS_OBJECT_TYPE_PROTOCOL_RESTART_PARAMETERS`: UInt = 163u;
public const val `NDIS_OBJECT_TYPE_PROVIDER_CHIMNEY_OFFLOAD_CHARACTERISTICS`: UInt = 148u;
public const val `NDIS_OBJECT_TYPE_PROVIDER_CHIMNEY_OFFLOAD_GENERIC_CHARACTERISTICS`: UInt = 143u;
public const val `NDIS_OBJECT_TYPE_QOS_CAPABILITIES`: UInt = 181u;
public const val `NDIS_OBJECT_TYPE_QOS_CLASSIFICATION_ELEMENT`: UInt = 183u;
public const val `NDIS_OBJECT_TYPE_QOS_PARAMETERS`: UInt = 182u;
public const val `NDIS_OBJECT_TYPE_REQUEST_EX`: UInt = 150u;
public const val `NDIS_OBJECT_TYPE_RESTART_GENERAL_ATTRIBUTES`: UInt = 162u;
public const val `NDIS_OBJECT_TYPE_RSS_CAPABILITIES`: UInt = 136u;
public const val `NDIS_OBJECT_TYPE_RSS_PARAMETERS`: UInt = 137u;
public const val `NDIS_OBJECT_TYPE_RSS_PARAMETERS_V2`: UInt = 200u;
public const val `NDIS_OBJECT_TYPE_RSS_PROCESSOR_INFO`: UInt = 177u;
public const val `NDIS_OBJECT_TYPE_RSS_SET_INDIRECTION_ENTRIES`: UInt = 201u;
public const val `NDIS_OBJECT_TYPE_SG_DMA_DESCRIPTION`: UInt = 131u;
public const val `NDIS_OBJECT_TYPE_SHARED_MEMORY_PROVIDER_CHARACTERISTICS`: UInt = 176u;
public const val `NDIS_OBJECT_TYPE_STATUS_INDICATION`: UInt = 152u;
public const val `NDIS_OBJECT_TYPE_SWITCH_OPTIONAL_HANDLERS`: UInt = 184u;
public const val `NDIS_OBJECT_TYPE_TIMER_CHARACTERISTICS`: UInt = 151u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Checksum`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD`,
    public var `LsoV1`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V1`,
    public var `IPsecV1`: `NDIS_IPSEC_OFFLOAD_V1`,
    public var `LsoV2`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V2`,
    public var `Flags`: UInt,
)
public const val `NDIS_OFFLOAD_FLAGS_GROUP_CHECKSUM_CAPABILITIES`: UInt = 1u;
public const val `NDIS_OFFLOAD_NOT_SUPPORTED`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OFFLOAD_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `IPv4Checksum`: UByte,
    public var `TCPIPv4Checksum`: UByte,
    public var `UDPIPv4Checksum`: UByte,
    public var `TCPIPv6Checksum`: UByte,
    public var `UDPIPv6Checksum`: UByte,
    public var `LsoV1`: UByte,
    public var `IPsecV1`: UByte,
    public var `LsoV2IPv4`: UByte,
    public var `LsoV2IPv6`: UByte,
    public var `TcpConnectionIPv4`: UByte,
    public var `TcpConnectionIPv6`: UByte,
    public var `Flags`: UInt,
)
public const val `NDIS_OFFLOAD_PARAMETERS_CONNECTION_OFFLOAD_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_CONNECTION_OFFLOAD_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_AH_AND_ESP_ENABLED`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_AH_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV1_ESP_ENABLED`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_AH_AND_ESP_ENABLED`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_AH_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_IPSECV2_ESP_ENABLED`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV1_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV1_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV2_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_LSOV2_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_NO_CHANGE`: UInt = 0u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_4`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_REVISION_5`: UInt = 5u;
public const val `NDIS_OFFLOAD_PARAMETERS_RSC_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_RSC_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_RX_ENABLED_TX_DISABLED`: UInt = 3u;
public const val `NDIS_OFFLOAD_PARAMETERS_SKIP_REGISTRY_UPDATE`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_TX_ENABLED_RX_DISABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_PARAMETERS_TX_RX_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_TX_RX_ENABLED`: UInt = 4u;
public const val `NDIS_OFFLOAD_PARAMETERS_USO_DISABLED`: UInt = 1u;
public const val `NDIS_OFFLOAD_PARAMETERS_USO_ENABLED`: UInt = 2u;
public const val `NDIS_OFFLOAD_REVISION_1`: UInt = 1u;
public const val `NDIS_OFFLOAD_REVISION_2`: UInt = 2u;
public const val `NDIS_OFFLOAD_REVISION_3`: UInt = 3u;
public const val `NDIS_OFFLOAD_REVISION_4`: UInt = 4u;
public const val `NDIS_OFFLOAD_REVISION_5`: UInt = 5u;
public const val `NDIS_OFFLOAD_REVISION_6`: UInt = 6u;
public const val `NDIS_OFFLOAD_REVISION_7`: UInt = 7u;
public const val `NDIS_OFFLOAD_SET_NO_CHANGE`: UInt = 0u;
public const val `NDIS_OFFLOAD_SET_OFF`: UInt = 2u;
public const val `NDIS_OFFLOAD_SET_ON`: UInt = 1u;
public const val `NDIS_OFFLOAD_SUPPORTED`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_OPER_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `OperationalStatus`: `NET_IF_OPER_STATUS`,
    public var `OperationalStatusFlags`: UInt,
)
public const val `NDIS_OPER_STATE_REVISION_1`: UInt = 1u;
public const val `NDIS_PACKET_TYPE_ALL_FUNCTIONAL`: UInt = 8192u;
public const val `NDIS_PACKET_TYPE_ALL_LOCAL`: UInt = 128u;
public const val `NDIS_PACKET_TYPE_ALL_MULTICAST`: UInt = 4u;
public const val `NDIS_PACKET_TYPE_BROADCAST`: UInt = 8u;
public const val `NDIS_PACKET_TYPE_DIRECTED`: UInt = 1u;
public const val `NDIS_PACKET_TYPE_FUNCTIONAL`: UInt = 16384u;
public const val `NDIS_PACKET_TYPE_GROUP`: UInt = 4096u;
public const val `NDIS_PACKET_TYPE_MAC_FRAME`: UInt = 32768u;
public const val `NDIS_PACKET_TYPE_MULTICAST`: UInt = 2u;
public const val `NDIS_PACKET_TYPE_NO_LOCAL`: UInt = 65536u;
public const val `NDIS_PACKET_TYPE_PROMISCUOUS`: UInt = 32u;
public const val `NDIS_PACKET_TYPE_SMT`: UInt = 64u;
public const val `NDIS_PACKET_TYPE_SOURCE_ROUTING`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PCI_DEVICE_CUSTOM_PROPERTIES` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `DeviceType`: UInt,
    public var `CurrentSpeedAndMode`: UInt,
    public var `CurrentPayloadSize`: UInt,
    public var `MaxPayloadSize`: UInt,
    public var `MaxReadRequestSize`: UInt,
    public var `CurrentLinkSpeed`: UInt,
    public var `CurrentLinkWidth`: UInt,
    public var `MaxLinkSpeed`: UInt,
    public var `MaxLinkWidth`: UInt,
    public var `PciExpressVersion`: UInt,
    public var `InterruptType`: UInt,
    public var `MaxInterruptMessages`: UInt,
)
public const val `NDIS_PD_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_PD_CAPS_DRAIN_NOTIFICATIONS_SUPPORTED`: UInt = 2u;
public const val `NDIS_PD_CAPS_NOTIFICATION_MODERATION_COUNT_SUPPORTED`: UInt = 8u;
public const val `NDIS_PD_CAPS_NOTIFICATION_MODERATION_INTERVAL_SUPPORTED`: UInt = 4u;
public const val `NDIS_PD_CAPS_RECEIVE_FILTER_COUNTERS_SUPPORTED`: UInt = 1u;
public const val `NDIS_PD_CONFIG_REVISION_1`: UInt = 1u;
public typealias `NDIS_PHYSICAL_MEDIUM` = Int;
public const val `NDIS_PM_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_MAX_PATTERN_ID`: UInt = 65535u;
public const val `NDIS_PM_MAX_STRING_SIZE`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PM_PACKET_PATTERN` (
    public var `Priority`: UInt,
    public var `Reserved`: UInt,
    public var `MaskSize`: UInt,
    public var `PatternOffset`: UInt,
    public var `PatternSize`: UInt,
    public var `PatternFlags`: UInt,
)
public const val `NDIS_PM_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_PRIVATE_PATTERN_ID`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_80211_RSN_REKEY_ENABLED`: UInt = 128u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_80211_RSN_REKEY_SUPPORTED`: UInt = 128u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_ARP_ENABLED`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_ARP_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_NS_ENABLED`: UInt = 2u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_NS_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_PRIORITY_HIGHEST`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_PRIORITY_LOWEST`: UInt = 4294967295u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_PRIORITY_NORMAL`: UInt = 268435456u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_PROTOCOL_OFFLOAD_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_SELECTIVE_SUSPEND_ENABLED`: UInt = 16u;
public const val `NDIS_PM_SELECTIVE_SUSPEND_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_WAKE_ON_LINK_CHANGE_ENABLED`: UInt = 1u;
public const val `NDIS_PM_WAKE_ON_MEDIA_CONNECT_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_WAKE_ON_MEDIA_DISCONNECT_ENABLED`: UInt = 2u;
public const val `NDIS_PM_WAKE_ON_MEDIA_DISCONNECT_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_WAKE_PACKET_INDICATION_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_WAKE_PACKET_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_WAKE_REASON_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PM_WAKE_UP_CAPABILITIES` (
    public var `MinMagicPacketWakeUp`: `NDIS_DEVICE_POWER_STATE`,
    public var `MinPatternWakeUp`: `NDIS_DEVICE_POWER_STATE`,
    public var `MinLinkChangeWakeUp`: `NDIS_DEVICE_POWER_STATE`,
)
public const val `NDIS_PM_WOL_BITMAP_PATTERN_ENABLED`: UInt = 1u;
public const val `NDIS_PM_WOL_BITMAP_PATTERN_SUPPORTED`: UInt = 1u;
public const val `NDIS_PM_WOL_EAPOL_REQUEST_ID_MESSAGE_ENABLED`: UInt = 65536u;
public const val `NDIS_PM_WOL_EAPOL_REQUEST_ID_MESSAGE_SUPPORTED`: UInt = 65536u;
public const val `NDIS_PM_WOL_IPV4_DEST_ADDR_WILDCARD_ENABLED`: UInt = 512u;
public const val `NDIS_PM_WOL_IPV4_DEST_ADDR_WILDCARD_SUPPORTED`: UInt = 512u;
public const val `NDIS_PM_WOL_IPV4_TCP_SYN_ENABLED`: UInt = 4u;
public const val `NDIS_PM_WOL_IPV4_TCP_SYN_SUPPORTED`: UInt = 4u;
public const val `NDIS_PM_WOL_IPV6_DEST_ADDR_WILDCARD_ENABLED`: UInt = 2048u;
public const val `NDIS_PM_WOL_IPV6_DEST_ADDR_WILDCARD_SUPPORTED`: UInt = 2048u;
public const val `NDIS_PM_WOL_IPV6_TCP_SYN_ENABLED`: UInt = 8u;
public const val `NDIS_PM_WOL_IPV6_TCP_SYN_SUPPORTED`: UInt = 8u;
public const val `NDIS_PM_WOL_MAGIC_PACKET_ENABLED`: UInt = 2u;
public const val `NDIS_PM_WOL_MAGIC_PACKET_SUPPORTED`: UInt = 2u;
public const val `NDIS_PM_WOL_PATTERN_REVISION_1`: UInt = 1u;
public const val `NDIS_PM_WOL_PATTERN_REVISION_2`: UInt = 2u;
public const val `NDIS_PM_WOL_PRIORITY_HIGHEST`: UInt = 1u;
public const val `NDIS_PM_WOL_PRIORITY_LOWEST`: UInt = 4294967295u;
public const val `NDIS_PM_WOL_PRIORITY_NORMAL`: UInt = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PNP_CAPABILITIES` (
    public var `Flags`: UInt,
    public var `WakeUpCapabilities`: `NDIS_PM_WAKE_UP_CAPABILITIES`,
)
public const val `NDIS_PNP_WAKE_UP_LINK_CHANGE`: UInt = 4u;
public const val `NDIS_PNP_WAKE_UP_MAGIC_PACKET`: UInt = 1u;
public const val `NDIS_PNP_WAKE_UP_PATTERN_MATCH`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_PORT` (
    public var `Next`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NDIS_PORT`>?,
    public var `NdisReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MiniportReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ProtocolReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PortCharacteristics`: `NDIS_PORT_CHARACTERISTICS`,
)
// UNSUPPORTED Rust 1388:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_PORT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_PORT_ARRAY` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `NumberOfPorts`: UInt,
    public var `OffsetFirstPort`: UInt,
    public var `ElementSize`: UInt,
    public var `Ports`: Array<`NDIS_PORT_CHARACTERISTICS`>,
)
// UNSUPPORTED Rust 1402:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_PORT_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_PORT_ARRAY_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PORT_AUTHENTICATION_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `SendControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `RcvControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `SendAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `RcvAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
)
public const val `NDIS_PORT_AUTHENTICATION_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `NDIS_PORT_AUTHORIZATION_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PORT_CHARACTERISTICS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `PortNumber`: UInt,
    public var `Flags`: UInt,
    public var `Type`: `NDIS_PORT_TYPE`,
    public var `MediaConnectState`: `NET_IF_MEDIA_CONNECT_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `Direction`: `NET_IF_DIRECTION_TYPE`,
    public var `SendControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `RcvControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `SendAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `RcvAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
)
public const val `NDIS_PORT_CHARACTERISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_PORT_CHAR_USE_DEFAULT_AUTH_SETTINGS`: UInt = 1u;
public typealias `NDIS_PORT_CONTROL_STATE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_PORT_STATE` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `MediaConnectState`: `NET_IF_MEDIA_CONNECT_STATE`,
    public var `XmitLinkSpeed`: ULong,
    public var `RcvLinkSpeed`: ULong,
    public var `Direction`: `NET_IF_DIRECTION_TYPE`,
    public var `SendControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `RcvControlState`: `NDIS_PORT_CONTROL_STATE`,
    public var `SendAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `RcvAuthorizationState`: `NDIS_PORT_AUTHORIZATION_STATE`,
    public var `Flags`: UInt,
)
public const val `NDIS_PORT_STATE_REVISION_1`: UInt = 1u;
public typealias `NDIS_PORT_TYPE` = Int;
public typealias `NDIS_PROCESSOR_VENDOR` = Int;
public const val `NDIS_PROTOCOL_ID_DEFAULT`: UInt = 0u;
public const val `NDIS_PROTOCOL_ID_IP6`: UInt = 3u;
public const val `NDIS_PROTOCOL_ID_IPX`: UInt = 6u;
public const val `NDIS_PROTOCOL_ID_MASK`: UInt = 15u;
public const val `NDIS_PROTOCOL_ID_MAX`: UInt = 15u;
public const val `NDIS_PROTOCOL_ID_NBF`: UInt = 7u;
public const val `NDIS_PROTOCOL_ID_TCP_IP`: UInt = 2u;
public const val `NDIS_PROT_OPTION_ESTIMATED_LENGTH`: UInt = 1u;
public const val `NDIS_PROT_OPTION_NO_LOOPBACK`: UInt = 2u;
public const val `NDIS_PROT_OPTION_NO_RSVD_ON_RCVPKT`: UInt = 4u;
public const val `NDIS_PROT_OPTION_SEND_RESTRICTED`: UInt = 8u;
public const val `NDIS_QOS_ACTION_MAXIMUM`: UInt = 1u;
public const val `NDIS_QOS_ACTION_PRIORITY`: UInt = 0u;
public const val `NDIS_QOS_CAPABILITIES_CEE_DCBX_SUPPORTED`: UInt = 4u;
public const val `NDIS_QOS_CAPABILITIES_IEEE_DCBX_SUPPORTED`: UInt = 8u;
public const val `NDIS_QOS_CAPABILITIES_MACSEC_BYPASS_SUPPORTED`: UInt = 2u;
public const val `NDIS_QOS_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_CAPABILITIES_STRICT_TSA_SUPPORTED`: UInt = 1u;
public const val `NDIS_QOS_CLASSIFICATION_ELEMENT_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_CLASSIFICATION_ENFORCED_BY_MINIPORT`: UInt = 16777216u;
public const val `NDIS_QOS_CLASSIFICATION_SET_BY_MINIPORT_MASK`: UInt = 4278190080u;
public const val `NDIS_QOS_CONDITION_DEFAULT`: UInt = 1u;
public const val `NDIS_QOS_CONDITION_ETHERTYPE`: UInt = 5u;
public const val `NDIS_QOS_CONDITION_MAXIMUM`: UInt = 7u;
public const val `NDIS_QOS_CONDITION_NETDIRECT_PORT`: UInt = 6u;
public const val `NDIS_QOS_CONDITION_RESERVED`: UInt = 0u;
public const val `NDIS_QOS_CONDITION_TCP_OR_UDP_PORT`: UInt = 4u;
public const val `NDIS_QOS_CONDITION_TCP_PORT`: UInt = 2u;
public const val `NDIS_QOS_CONDITION_UDP_PORT`: UInt = 3u;
public const val `NDIS_QOS_DEFAULT_SQ_ID`: UInt = 0u;
public const val `NDIS_QOS_MAXIMUM_PRIORITIES`: UInt = 8u;
public const val `NDIS_QOS_MAXIMUM_TRAFFIC_CLASSES`: UInt = 8u;
public const val `NDIS_QOS_OFFLOAD_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_OFFLOAD_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_QOS_OFFLOAD_CAPS_GFT_SQ`: UInt = 2u;
public const val `NDIS_QOS_OFFLOAD_CAPS_STANDARD_SQ`: UInt = 1u;
public const val `NDIS_QOS_PARAMETERS_CLASSIFICATION_CHANGED`: UInt = 65536u;
public const val `NDIS_QOS_PARAMETERS_CLASSIFICATION_CONFIGURED`: UInt = 131072u;
public const val `NDIS_QOS_PARAMETERS_ETS_CHANGED`: UInt = 1u;
public const val `NDIS_QOS_PARAMETERS_ETS_CONFIGURED`: UInt = 2u;
public const val `NDIS_QOS_PARAMETERS_PFC_CHANGED`: UInt = 256u;
public const val `NDIS_QOS_PARAMETERS_PFC_CONFIGURED`: UInt = 512u;
public const val `NDIS_QOS_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_PARAMETERS_WILLING`: UInt = 2147483648u;
public const val `NDIS_QOS_SQ_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_PARAMETERS_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_QOS_SQ_RECEIVE_CAP_ENABLED`: UInt = 4u;
public const val `NDIS_QOS_SQ_STATS_REVISION_1`: UInt = 1u;
public const val `NDIS_QOS_SQ_TRANSMIT_CAP_ENABLED`: UInt = 1u;
public const val `NDIS_QOS_SQ_TRANSMIT_RESERVATION_ENABLED`: UInt = 2u;
public const val `NDIS_QOS_TSA_CBS`: UInt = 1u;
public const val `NDIS_QOS_TSA_ETS`: UInt = 2u;
public const val `NDIS_QOS_TSA_MAXIMUM`: UInt = 3u;
public const val `NDIS_QOS_TSA_STRICT`: UInt = 0u;
public const val `NDIS_RECEIVE_FILTER_ANY_VLAN_SUPPORTED`: UInt = 32u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_OPERATION_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_SPA_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_SUPPORTED`: UInt = 8u;
public const val `NDIS_RECEIVE_FILTER_ARP_HEADER_TPA_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_CLEAR_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_DYNAMIC_PROCESSOR_AFFINITY_CHANGE_FOR_DEFAULT_QUEUE_SUPPORTED`: UInt = 64u;
public const val `NDIS_RECEIVE_FILTER_DYNAMIC_PROCESSOR_AFFINITY_CHANGE_SUPPORTED`: UInt = 8u;
public const val `NDIS_RECEIVE_FILTER_FIELD_MAC_HEADER_VLAN_UNTAGGED_OR_ZERO`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_FIELD_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_FIELD_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_FLAGS_RESERVED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_GLOBAL_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_IMPLAT_MIN_OF_QUEUES_MODE`: UInt = 64u;
public const val `NDIS_RECEIVE_FILTER_IMPLAT_SUM_OF_QUEUES_MODE`: UInt = 128u;
public const val `NDIS_RECEIVE_FILTER_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_INFO_ARRAY_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_INFO_ARRAY_VPORT_ID_SPECIFIED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_INTERRUPT_VECTOR_COALESCING_SUPPORTED`: UInt = 16u;
public const val `NDIS_RECEIVE_FILTER_IPV4_HEADER_PROTOCOL_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_IPV4_HEADER_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_IPV6_HEADER_PROTOCOL_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_IPV6_HEADER_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_LOOKAHEAD_SPLIT_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_DEST_ADDR_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_PACKET_TYPE_SUPPORTED`: UInt = 32u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_PRIORITY_SUPPORTED`: UInt = 16u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_PROTOCOL_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_SOURCE_ADDR_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_MAC_HEADER_VLAN_ID_SUPPORTED`: UInt = 8u;
public const val `NDIS_RECEIVE_FILTER_MOVE_FILTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_MSI_X_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_PACKET_COALESCING_FILTERS_ENABLED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_PACKET_COALESCING_SUPPORTED_ON_DEFAULT_QUEUE`: UInt = 256u;
public const val `NDIS_RECEIVE_FILTER_PACKET_ENCAPSULATION`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_PACKET_ENCAPSULATION_GRE`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_RESERVED`: UInt = 254u;
public const val `NDIS_RECEIVE_FILTER_TEST_HEADER_FIELD_EQUAL_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_TEST_HEADER_FIELD_MASK_EQUAL_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_FILTER_TEST_HEADER_FIELD_NOT_EQUAL_SUPPORTED`: UInt = 4u;
public const val `NDIS_RECEIVE_FILTER_UDP_HEADER_DEST_PORT_SUPPORTED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_UDP_HEADER_SUPPORTED`: UInt = 16u;
public const val `NDIS_RECEIVE_FILTER_VMQ_FILTERS_ENABLED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_VM_QUEUES_ENABLED`: UInt = 1u;
public const val `NDIS_RECEIVE_FILTER_VM_QUEUE_SUPPORTED`: UInt = 2u;
public const val `NDIS_RECEIVE_HASH_FLAG_ENABLE_HASH`: UInt = 1u;
public const val `NDIS_RECEIVE_HASH_FLAG_HASH_INFO_UNCHANGED`: UInt = 2u;
public const val `NDIS_RECEIVE_HASH_FLAG_HASH_KEY_UNCHANGED`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_RECEIVE_HASH_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `HashInformation`: UInt,
    public var `HashSecretKeySize`: UShort,
    public var `HashSecretKeyOffset`: UInt,
)
public const val `NDIS_RECEIVE_HASH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_ALLOCATION_COMPLETE_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_ALLOCATION_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_FREE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_INFO_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_INFO_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_CHANGE_MASK`: UInt = 4294901760u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_FLAGS_CHANGED`: UInt = 65536u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_INTERRUPT_COALESCING_DOMAIN_ID_CHANGED`: UInt = 1048576u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_LOOKAHEAD_SPLIT_REQUIRED`: UInt = 2u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_NAME_CHANGED`: UInt = 524288u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_PER_QUEUE_RECEIVE_INDICATION`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_PROCESSOR_AFFINITY_CHANGED`: UInt = 131072u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_QOS_SQ_ID_CHANGED`: UInt = 2097152u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_RECEIVE_QUEUE_PARAMETERS_SUGGESTED_RECV_BUFFER_NUMBERS_CHANGED`: UInt = 262144u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_RECEIVE_SCALE_CAPABILITIES` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `CapabilitiesFlags`: UInt,
    public var `NumberOfInterruptMessages`: UInt,
    public var `NumberOfReceiveQueues`: UInt,
)
public const val `NDIS_RECEIVE_SCALE_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_CAPABILITIES_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_SCALE_CAPABILITIES_REVISION_3`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_RECEIVE_SCALE_PARAMETERS` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UShort,
    public var `BaseCpuNumber`: UShort,
    public var `HashInformation`: UInt,
    public var `IndirectionTableSize`: UShort,
    public var `IndirectionTableOffset`: UInt,
    public var `HashSecretKeySize`: UShort,
    public var `HashSecretKeyOffset`: UInt,
)
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_REVISION_3`: UInt = 3u;
public const val `NDIS_RECEIVE_SCALE_PARAMETERS_V2_REVISION_1`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_PARAM_ENABLE_RSS`: UInt = 1u;
public const val `NDIS_RECEIVE_SCALE_PARAM_HASH_INFO_CHANGED`: UInt = 2u;
public const val `NDIS_RECEIVE_SCALE_PARAM_HASH_KEY_CHANGED`: UInt = 4u;
public const val `NDIS_RECEIVE_SCALE_PARAM_NUMBER_OF_ENTRIES_CHANGED`: UInt = 16u;
public const val `NDIS_RECEIVE_SCALE_PARAM_NUMBER_OF_QUEUES_CHANGED`: UInt = 8u;
public typealias `NDIS_REQUEST_TYPE` = Int;
public const val `NDIS_RING_AUTO_REMOVAL_ERROR`: UInt = 1024u;
public const val `NDIS_RING_COUNTER_OVERFLOW`: UInt = 256u;
public const val `NDIS_RING_HARD_ERROR`: UInt = 16384u;
public const val `NDIS_RING_LOBE_WIRE_FAULT`: UInt = 2048u;
public const val `NDIS_RING_REMOVE_RECEIVED`: UInt = 512u;
public const val `NDIS_RING_RING_RECOVERY`: UInt = 64u;
public const val `NDIS_RING_SIGNAL_LOSS`: UInt = 32768u;
public const val `NDIS_RING_SINGLE_STATION`: UInt = 128u;
public const val `NDIS_RING_SOFT_ERROR`: UInt = 8192u;
public const val `NDIS_RING_TRANSMIT_BEACON`: UInt = 4096u;
public const val `NDIS_ROUTING_DOMAIN_ENTRY_REVISION_1`: UInt = 1u;
public const val `NDIS_ROUTING_DOMAIN_ISOLATION_ENTRY_REVISION_1`: UInt = 1u;
public const val `NDIS_RSC_STATISTICS_REVISION_1`: UInt = 1u;
public const val `NDIS_RSS_CAPS_CLASSIFICATION_AT_DPC`: UInt = 67108864u;
public const val `NDIS_RSS_CAPS_CLASSIFICATION_AT_ISR`: UInt = 33554432u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_TCP_IPV4`: UInt = 256u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_TCP_IPV6`: UInt = 512u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_TCP_IPV6_EX`: UInt = 1024u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_UDP_IPV4`: UInt = 2048u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_UDP_IPV6`: UInt = 4096u;
public const val `NDIS_RSS_CAPS_HASH_TYPE_UDP_IPV6_EX`: UInt = 8192u;
public const val `NDIS_RSS_CAPS_MESSAGE_SIGNALED_INTERRUPTS`: UInt = 16777216u;
public const val `NDIS_RSS_CAPS_RSS_AVAILABLE_ON_PORTS`: UInt = 268435456u;
public const val `NDIS_RSS_CAPS_SUPPORTS_INDEPENDENT_ENTRY_MOVE`: UInt = 1073741824u;
public const val `NDIS_RSS_CAPS_SUPPORTS_MSI_X`: UInt = 536870912u;
public const val `NDIS_RSS_CAPS_USING_MSI_X`: UInt = 134217728u;
public const val `NDIS_RSS_HASH_SECRET_KEY_MAX_SIZE_REVISION_1`: UInt = 40u;
public const val `NDIS_RSS_HASH_SECRET_KEY_MAX_SIZE_REVISION_2`: UInt = 40u;
public const val `NDIS_RSS_HASH_SECRET_KEY_MAX_SIZE_REVISION_3`: UInt = 40u;
public const val `NDIS_RSS_HASH_SECRET_KEY_SIZE_REVISION_1`: UInt = 40u;
public const val `NDIS_RSS_INDIRECTION_TABLE_MAX_SIZE_REVISION_1`: UInt = 128u;
public const val `NDIS_RSS_INDIRECTION_TABLE_SIZE_REVISION_1`: UInt = 128u;
public const val `NDIS_RSS_PARAM_FLAG_BASE_CPU_UNCHANGED`: UInt = 1u;
public const val `NDIS_RSS_PARAM_FLAG_DEFAULT_PROCESSOR_UNCHANGED`: UInt = 32u;
public const val `NDIS_RSS_PARAM_FLAG_DISABLE_RSS`: UInt = 16u;
public const val `NDIS_RSS_PARAM_FLAG_HASH_INFO_UNCHANGED`: UInt = 2u;
public const val `NDIS_RSS_PARAM_FLAG_HASH_KEY_UNCHANGED`: UInt = 8u;
public const val `NDIS_RSS_PARAM_FLAG_ITABLE_UNCHANGED`: UInt = 4u;
public const val `NDIS_RSS_PROCESSOR_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_RSS_PROCESSOR_INFO_REVISION_2`: UInt = 2u;
public const val `NDIS_RSS_SET_INDIRECTION_ENTRIES_REVISION_1`: UInt = 1u;
public const val `NDIS_RSS_SET_INDIRECTION_ENTRY_FLAG_DEFAULT_PROCESSOR`: UInt = 2u;
public const val `NDIS_RSS_SET_INDIRECTION_ENTRY_FLAG_PRIMARY_PROCESSOR`: UInt = 1u;
public const val `NDIS_SIZEOF_NDIS_PM_PROTOCOL_OFFLOAD_REVISION_1`: UInt = 240u;
public const val `NDIS_SRIOV_BAR_RESOURCES_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_CAPS_PF_MINIPORT`: UInt = 2u;
public const val `NDIS_SRIOV_CAPS_SRIOV_SUPPORTED`: UInt = 1u;
public const val `NDIS_SRIOV_CAPS_VF_MINIPORT`: UInt = 4u;
public const val `NDIS_SRIOV_CONFIG_STATE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_OVERLYING_ADAPTER_INFO_VERSION_1`: UInt = 1u;
public const val `NDIS_SRIOV_PF_LUID_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_PROBED_BARS_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_READ_VF_CONFIG_BLOCK_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_READ_VF_CONFIG_SPACE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_RESET_VF_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_SET_VF_POWER_STATE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_VF_INVALIDATE_CONFIG_BLOCK_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_VF_SERIAL_NUMBER_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_VF_VENDOR_DEVICE_ID_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_WRITE_VF_CONFIG_BLOCK_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SRIOV_WRITE_VF_CONFIG_SPACE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_BYTES_RCV`: UInt = 262144u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_BYTES_XMIT`: UInt = 2097152u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_FRAMES_RCV`: UInt = 4u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BROADCAST_FRAMES_XMIT`: UInt = 256u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BYTES_RCV`: UInt = 8u;
public const val `NDIS_STATISTICS_FLAGS_VALID_BYTES_XMIT`: UInt = 512u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_BYTES_RCV`: UInt = 65536u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_BYTES_XMIT`: UInt = 524288u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_FRAMES_RCV`: UInt = 1u;
public const val `NDIS_STATISTICS_FLAGS_VALID_DIRECTED_FRAMES_XMIT`: UInt = 64u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_BYTES_RCV`: UInt = 131072u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_BYTES_XMIT`: UInt = 1048576u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_FRAMES_RCV`: UInt = 2u;
public const val `NDIS_STATISTICS_FLAGS_VALID_MULTICAST_FRAMES_XMIT`: UInt = 128u;
public const val `NDIS_STATISTICS_FLAGS_VALID_RCV_DISCARDS`: UInt = 16u;
public const val `NDIS_STATISTICS_FLAGS_VALID_RCV_ERROR`: UInt = 32u;
public const val `NDIS_STATISTICS_FLAGS_VALID_XMIT_DISCARDS`: UInt = 32768u;
public const val `NDIS_STATISTICS_FLAGS_VALID_XMIT_ERROR`: UInt = 1024u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_STATISTICS_INFO` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `SupportedStatistics`: UInt,
    public var `ifInDiscards`: ULong,
    public var `ifInErrors`: ULong,
    public var `ifHCInOctets`: ULong,
    public var `ifHCInUcastPkts`: ULong,
    public var `ifHCInMulticastPkts`: ULong,
    public var `ifHCInBroadcastPkts`: ULong,
    public var `ifHCOutOctets`: ULong,
    public var `ifHCOutUcastPkts`: ULong,
    public var `ifHCOutMulticastPkts`: ULong,
    public var `ifHCOutBroadcastPkts`: ULong,
    public var `ifOutErrors`: ULong,
    public var `ifOutDiscards`: ULong,
    public var `ifHCInUcastOctets`: ULong,
    public var `ifHCInMulticastOctets`: ULong,
    public var `ifHCInBroadcastOctets`: ULong,
    public var `ifHCOutUcastOctets`: ULong,
    public var `ifHCOutMulticastOctets`: ULong,
    public var `ifHCOutBroadcastOctets`: ULong,
)
public const val `NDIS_STATISTICS_INFO_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_STATISTICS_VALUE` (
    public var `Oid`: UInt,
    public var `DataLength`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1738:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_STATISTICS_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_STATISTICS_VALUE_EX` (
    public var `Oid`: UInt,
    public var `DataLength`: UInt,
    public var `Length`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1751:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_STATISTICS_VALUE_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = Int;
public const val `NDIS_SUPPORT_NDIS6`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS61`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS620`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS630`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS640`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS650`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS651`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS660`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS670`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS680`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS681`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS682`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS683`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS684`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS685`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS686`: UInt = 1u;
public const val `NDIS_SUPPORT_NDIS687`: UInt = 1u;
public const val `NDIS_SWITCH_FEATURE_STATUS_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_FEATURE_STATUS_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_FLAGS_MAPPED_NIC_UPDATED`: UInt = 4u;
public const val `NDIS_SWITCH_NIC_FLAGS_NIC_INITIALIZING`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_FLAGS_NIC_SUSPENDED`: UInt = 2u;
public const val `NDIS_SWITCH_NIC_FLAGS_NIC_SUSPENDED_LM`: UInt = 16u;
public const val `NDIS_SWITCH_NIC_OID_REQUEST_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_PARAMETERS_REVISION_2`: UInt = 2u;
public const val `NDIS_SWITCH_NIC_SAVE_STATE_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_NIC_SAVE_STATE_REVISION_2`: UInt = 2u;
public const val `NDIS_SWITCH_OBJECT_SERIALIZATION_VERSION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_ARRAY_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_FEATURE_STATUS_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_FEATURE_STATUS_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PARAMETERS_FLAG_RESTORING_PORT`: UInt = 2u;
public const val `NDIS_SWITCH_PORT_PARAMETERS_FLAG_UNTRUSTED_INTERNAL_PORT`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_DELETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ENUM_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ENUM_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ISOLATION_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_PROFILE_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_ROUTING_DOMAIN_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_SECURITY_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PORT_PROPERTY_SECURITY_REVISION_2`: UInt = 2u;
public const val `NDIS_SWITCH_PORT_PROPERTY_VLAN_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_CUSTOM_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_DELETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_ENUM_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_ENUM_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SWITCH_PROPERTY_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `NDIS_SYSTEM_PROCESSOR_INFO_EX_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_CONNECTION_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
    public var `TcpConnectionOffloadCapacity`: UInt,
    public var `Flags`: UInt,
)
public const val `NDIS_TCP_CONNECTION_OFFLOAD_REVISION_1`: UInt = 1u;
public const val `NDIS_TCP_CONNECTION_OFFLOAD_REVISION_2`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD` (
    public var `IPv4Transmit`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_0`,
    public var `IPv4Receive`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_1`,
    public var `IPv6Transmit`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_2`,
    public var `IPv6Receive`: `NDIS_TCP_IP_CHECKSUM_OFFLOAD_3`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_1` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_0` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_3` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_IP_CHECKSUM_OFFLOAD_2` (
    public var `Encapsulation`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V1` (
    public var `IPv4`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V1_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V2` (
    public var `IPv4`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_0`,
    public var `IPv6`: `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TCP_LARGE_SEND_OFFLOAD_V2_1` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `_bitfield`: UInt,
)
public const val `NDIS_TCP_RECV_SEG_COALESC_OFFLOAD_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `TimeoutArrayLength`: UInt,
    public var `TimeoutArray`: UIntArray,
)
// UNSUPPORTED Rust 1897:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_TIMEOUT_DPC_REQUEST_CAPABILITIES_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TIMESTAMP_CAPABILITIES` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `HardwareClockFrequencyHz`: ULong,
    public var `CrossTimestamp`: Boolean,
    public var `Reserved1`: ULong,
    public var `Reserved2`: ULong,
    public var `TimestampFlags`: `NDIS_TIMESTAMP_CAPABILITY_FLAGS`,
)
public const val `NDIS_TIMESTAMP_CAPABILITIES_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_TIMESTAMP_CAPABILITY_FLAGS` (
    public var `PtpV2OverUdpIPv4EventMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv4AllMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv4EventMsgTransmitHw`: Boolean,
    public var `PtpV2OverUdpIPv4AllMsgTransmitHw`: Boolean,
    public var `PtpV2OverUdpIPv6EventMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv6AllMsgReceiveHw`: Boolean,
    public var `PtpV2OverUdpIPv6EventMsgTransmitHw`: Boolean,
    public var `PtpV2OverUdpIPv6AllMsgTransmitHw`: Boolean,
    public var `AllReceiveHw`: Boolean,
    public var `AllTransmitHw`: Boolean,
    public var `TaggedTransmitHw`: Boolean,
    public var `AllReceiveSw`: Boolean,
    public var `AllTransmitSw`: Boolean,
    public var `TaggedTransmitSw`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_VAR_DATA_DESC` (
    public var `Length`: UShort,
    public var `MaximumLength`: UShort,
    public var `Offset`: ULong,
)
public typealias `NDIS_WAN_HEADER_FORMAT` = Int;
public typealias `NDIS_WAN_MEDIUM_SUBTYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WAN_PROTOCOL_CAPS` (
    public var `Flags`: UInt,
    public var `Reserved`: UInt,
)
public typealias `NDIS_WAN_QUALITY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_WLAN_BSSID` (
    public var `Length`: UInt,
    public var `MacAddress`: UByteArray,
    public var `Reserved`: UByteArray,
    public var `Ssid`: `NDIS_802_11_SSID`,
    public var `Privacy`: UInt,
    public var `Rssi`: Int,
    public var `NetworkTypeInUse`: `NDIS_802_11_NETWORK_TYPE`,
    public var `Configuration`: `NDIS_802_11_CONFIGURATION`,
    public var `InfrastructureMode`: `NDIS_802_11_NETWORK_INFRASTRUCTURE`,
    public var `SupportedRates`: UByteArray,
)
// UNSUPPORTED Rust 1962:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WLAN_BSSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_WLAN_BSSID_EX` (
    public var `Length`: UInt,
    public var `MacAddress`: UByteArray,
    public var `Reserved`: UByteArray,
    public var `Ssid`: `NDIS_802_11_SSID`,
    public var `Privacy`: UInt,
    public var `Rssi`: Int,
    public var `NetworkTypeInUse`: `NDIS_802_11_NETWORK_TYPE`,
    public var `Configuration`: `NDIS_802_11_CONFIGURATION`,
    public var `InfrastructureMode`: `NDIS_802_11_NETWORK_INFRASTRUCTURE`,
    public var `SupportedRates`: UByteArray,
    public var `IELength`: UInt,
    public var `IEs`: UByteArray,
)
// UNSUPPORTED Rust 1983:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WLAN_BSSID_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WLAN_WAKE_ON_4WAY_HANDSHAKE_REQUEST_ENABLED`: UInt = 8u;
public const val `NDIS_WLAN_WAKE_ON_4WAY_HANDSHAKE_REQUEST_SUPPORTED`: UInt = 8u;
public const val `NDIS_WLAN_WAKE_ON_AP_ASSOCIATION_LOST_ENABLED`: UInt = 2u;
public const val `NDIS_WLAN_WAKE_ON_AP_ASSOCIATION_LOST_SUPPORTED`: UInt = 2u;
public const val `NDIS_WLAN_WAKE_ON_GTK_HANDSHAKE_ERROR_ENABLED`: UInt = 4u;
public const val `NDIS_WLAN_WAKE_ON_GTK_HANDSHAKE_ERROR_SUPPORTED`: UInt = 4u;
public const val `NDIS_WLAN_WAKE_ON_NLO_DISCOVERY_ENABLED`: UInt = 1u;
public const val `NDIS_WLAN_WAKE_ON_NLO_DISCOVERY_SUPPORTED`: UInt = 1u;
public const val `NDIS_WMI_DEFAULT_METHOD_ID`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_WMI_ENUM_ADAPTER` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `IfIndex`: UInt,
    public var `NetLuid`: `NET_LUID_LH`,
    public var `DeviceNameLength`: UShort,
    public var `DeviceName`: ByteArray,
)
// UNSUPPORTED Rust 2006:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WMI_ENUM_ADAPTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_ENUM_ADAPTER_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_WMI_EVENT_HEADER` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `IfIndex`: UInt,
    public var `NetLuid`: `NET_LUID_LH`,
    public var `RequestId`: ULong,
    public var `PortNumber`: UInt,
    public var `DeviceNameLength`: UInt,
    public var `DeviceNameOffset`: UInt,
    public var `Padding`: UByteArray,
)
// UNSUPPORTED Rust 2024:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WMI_EVENT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_EVENT_HEADER_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1` (
    public var `Supported`: `NDIS_WMI_IPSEC_OFFLOAD_V1_0`,
    public var `IPv4AH`: `NDIS_WMI_IPSEC_OFFLOAD_V1_1`,
    public var `IPv4ESP`: `NDIS_WMI_IPSEC_OFFLOAD_V1_2`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1_1` (
    public var `Md5`: UInt,
    public var `Sha_1`: UInt,
    public var `Transport`: UInt,
    public var `Tunnel`: UInt,
    public var `Send`: UInt,
    public var `Receive`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1_2` (
    public var `Des`: UInt,
    public var `Reserved`: UInt,
    public var `TripleDes`: UInt,
    public var `NullEsp`: UInt,
    public var `Transport`: UInt,
    public var `Tunnel`: UInt,
    public var `Send`: UInt,
    public var `Receive`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_IPSEC_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `AhEspCombined`: UInt,
    public var `TransportTunnelCombined`: UInt,
    public var `IPv4Options`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_WMI_METHOD_HEADER` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `PortNumber`: UInt,
    public var `NetLuid`: `NET_LUID_LH`,
    public var `RequestId`: ULong,
    public var `Timeout`: UInt,
    public var `Padding`: UByteArray,
)
// UNSUPPORTED Rust 2078:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WMI_METHOD_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_METHOD_HEADER_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_OBJECT_TYPE_ENUM_ADAPTER`: UInt = 4u;
public const val `NDIS_WMI_OBJECT_TYPE_EVENT`: UInt = 3u;
public const val `NDIS_WMI_OBJECT_TYPE_METHOD`: UInt = 2u;
public const val `NDIS_WMI_OBJECT_TYPE_OUTPUT_INFO`: UInt = 5u;
public const val `NDIS_WMI_OBJECT_TYPE_SET`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Checksum`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD`,
    public var `LsoV1`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1`,
    public var `IPsecV1`: `NDIS_WMI_IPSEC_OFFLOAD_V1`,
    public var `LsoV2`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2`,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_OUTPUT_INFO` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Flags`: UInt,
    public var `SupportedRevision`: UByte,
    public var `DataOffset`: UInt,
)
public const val `NDIS_WMI_PM_ACTIVE_CAPABILITIES_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_PM_ADMIN_CONFIG_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_RECEIVE_QUEUE_INFO_REVISION_1`: UInt = 1u;
public const val `NDIS_WMI_RECEIVE_QUEUE_PARAMETERS_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NDIS_WMI_SET_HEADER` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `PortNumber`: UInt,
    public var `NetLuid`: `NET_LUID_LH`,
    public var `RequestId`: ULong,
    public var `Timeout`: UInt,
    public var `Padding`: UByteArray,
)
// UNSUPPORTED Rust 2121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NDIS_WMI_SET_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NDIS_WMI_SET_HEADER_REVISION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_CONNECTION_OFFLOAD` (
    public var `Header`: `NDIS_OBJECT_HEADER`,
    public var `Encapsulation`: UInt,
    public var `SupportIPv4`: UInt,
    public var `SupportIPv6`: UInt,
    public var `SupportIPv6ExtensionHeaders`: UInt,
    public var `SupportSack`: UInt,
    public var `TcpConnectionOffloadCapacity`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD` (
    public var `IPv4Transmit`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_0`,
    public var `IPv4Receive`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_1`,
    public var `IPv6Transmit`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_2`,
    public var `IPv6Receive`: `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_3`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_1` (
    public var `Encapsulation`: UInt,
    public var `IpOptionsSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
    public var `IpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_0` (
    public var `Encapsulation`: UInt,
    public var `IpOptionsSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
    public var `IpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_3` (
    public var `Encapsulation`: UInt,
    public var `IpExtensionHeadersSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_IP_CHECKSUM_OFFLOAD_2` (
    public var `Encapsulation`: UInt,
    public var `IpExtensionHeadersSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
    public var `TcpChecksum`: UInt,
    public var `UdpChecksum`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1` (
    public var `IPv4`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V1_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `TcpOptions`: UInt,
    public var `IpOptions`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2` (
    public var `IPv4`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_0`,
    public var `IPv6`: `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_0` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDIS_WMI_TCP_LARGE_SEND_OFFLOAD_V2_1` (
    public var `Encapsulation`: UInt,
    public var `MaxOffLoadSize`: UInt,
    public var `MinSegmentCount`: UInt,
    public var `IpExtensionHeadersSupported`: UInt,
    public var `TcpOptionsSupported`: UInt,
)
public const val `NDIS_WWAN_WAKE_ON_PACKET_STATE_ENABLED`: UInt = 8u;
public const val `NDIS_WWAN_WAKE_ON_PACKET_STATE_SUPPORTED`: UInt = 8u;
public const val `NDIS_WWAN_WAKE_ON_REGISTER_STATE_ENABLED`: UInt = 1u;
public const val `NDIS_WWAN_WAKE_ON_REGISTER_STATE_SUPPORTED`: UInt = 1u;
public const val `NDIS_WWAN_WAKE_ON_SMS_RECEIVE_ENABLED`: UInt = 2u;
public const val `NDIS_WWAN_WAKE_ON_SMS_RECEIVE_SUPPORTED`: UInt = 2u;
public const val `NDIS_WWAN_WAKE_ON_UICC_CHANGE_ENABLED`: UInt = 16u;
public const val `NDIS_WWAN_WAKE_ON_UICC_CHANGE_SUPPORTED`: UInt = 16u;
public const val `NDIS_WWAN_WAKE_ON_USSD_RECEIVE_ENABLED`: UInt = 4u;
public const val `NDIS_WWAN_WAKE_ON_USSD_RECEIVE_SUPPORTED`: UInt = 4u;
public const val `NDK_ADAPTER_FLAG_CQ_INTERRUPT_MODERATION_SUPPORTED`: UInt = 4u;
public const val `NDK_ADAPTER_FLAG_CQ_RESIZE_SUPPORTED`: UInt = 256u;
public const val `NDK_ADAPTER_FLAG_IN_ORDER_DMA_SUPPORTED`: UInt = 1u;
public const val `NDK_ADAPTER_FLAG_LOOPBACK_CONNECTIONS_SUPPORTED`: UInt = 65536u;
public const val `NDK_ADAPTER_FLAG_MULTI_ENGINE_SUPPORTED`: UInt = 8u;
public const val `NDK_ADAPTER_FLAG_RDMA_READ_LOCAL_INVALIDATE_SUPPORTED`: UInt = 16u;
public const val `NDK_ADAPTER_FLAG_RDMA_READ_SINK_NOT_REQUIRED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDK_ADAPTER_INFO` (
    public var `Version`: `NDK_VERSION`,
    public var `VendorId`: UInt,
    public var `DeviceId`: UInt,
    public var `MaxRegistrationSize`: ULong,
    public var `MaxWindowSize`: ULong,
    public var `FRMRPageCount`: UInt,
    public var `MaxInitiatorRequestSge`: UInt,
    public var `MaxReceiveRequestSge`: UInt,
    public var `MaxReadRequestSge`: UInt,
    public var `MaxTransferLength`: UInt,
    public var `MaxInlineDataSize`: UInt,
    public var `MaxInboundReadLimit`: UInt,
    public var `MaxOutboundReadLimit`: UInt,
    public var `MaxReceiveQueueDepth`: UInt,
    public var `MaxInitiatorQueueDepth`: UInt,
    public var `MaxSrqDepth`: UInt,
    public var `MaxCqDepth`: UInt,
    public var `LargeRequestThreshold`: UInt,
    public var `MaxCallerData`: UInt,
    public var `MaxCalleeData`: UInt,
    public var `AdapterFlags`: UInt,
    public var `RdmaTechnology`: `NDK_RDMA_TECHNOLOGY`,
)
public typealias `NDK_RDMA_TECHNOLOGY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NDK_VERSION` (
    public var `Major`: UShort,
    public var `Minor`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETWORK_ADDRESS` (
    public var `AddressLength`: UShort,
    public var `AddressType`: UShort,
    public var `Address`: UByteArray,
)
// UNSUPPORTED Rust 2278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETWORK_ADDRESS_IP` (
    public var `sin_port`: UShort,
    public var `IN_ADDR`: UInt,
    public var `sin_zero`: UByteArray,
)
// UNSUPPORTED Rust 2290:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_IP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETWORK_ADDRESS_IP6` (
    public var `sin6_port`: UShort,
    public var `sin6_flowinfo`: UInt,
    public var `sin6_addr`: UShortArray,
    public var `sin6_scope_id`: UInt,
)
// UNSUPPORTED Rust 2303:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_IP6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETWORK_ADDRESS_IPX` (
    public var `NetworkAddress`: UInt,
    public var `NodeAddress`: UByteArray,
    public var `Socket`: UShort,
)
// UNSUPPORTED Rust 2315:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_IPX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NETWORK_ADDRESS_LIST` (
    public var `AddressCount`: Int,
    public var `AddressType`: UShort,
    public var `Address`: Array<`NETWORK_ADDRESS`>,
)
// UNSUPPORTED Rust 2327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NETWORK_ADDRESS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NET_IFLUID_UNSPECIFIED`: UInt = 0u;
public const val `NET_IF_ACCESS_BROADCAST`: `NET_IF_ACCESS_TYPE` = 2;
public const val `NET_IF_ACCESS_LOOPBACK`: `NET_IF_ACCESS_TYPE` = 1;
public const val `NET_IF_ACCESS_MAXIMUM`: `NET_IF_ACCESS_TYPE` = 5;
public const val `NET_IF_ACCESS_POINT_TO_MULTI_POINT`: `NET_IF_ACCESS_TYPE` = 4;
public const val `NET_IF_ACCESS_POINT_TO_POINT`: `NET_IF_ACCESS_TYPE` = 3;
public typealias `NET_IF_ACCESS_TYPE` = Int;
public typealias `NET_IF_ADMIN_STATUS` = Int;
public const val `NET_IF_ADMIN_STATUS_DOWN`: `NET_IF_ADMIN_STATUS` = 2;
public const val `NET_IF_ADMIN_STATUS_TESTING`: `NET_IF_ADMIN_STATUS` = 3;
public const val `NET_IF_ADMIN_STATUS_UP`: `NET_IF_ADMIN_STATUS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NET_IF_ALIAS_LH` (
    public var `ifAliasLength`: UShort,
    public var `ifAliasOffset`: UShort,
)
public typealias `NET_IF_COMPARTMENT_ID` = UInt;
public const val `NET_IF_COMPARTMENT_ID_PRIMARY`: UInt = 1u;
public const val `NET_IF_COMPARTMENT_ID_UNSPECIFIED`: UInt = 0u;
public const val `NET_IF_CONNECTION_DEDICATED`: `NET_IF_CONNECTION_TYPE` = 1;
public const val `NET_IF_CONNECTION_DEMAND`: `NET_IF_CONNECTION_TYPE` = 3;
public const val `NET_IF_CONNECTION_MAXIMUM`: `NET_IF_CONNECTION_TYPE` = 4;
public const val `NET_IF_CONNECTION_PASSIVE`: `NET_IF_CONNECTION_TYPE` = 2;
public typealias `NET_IF_CONNECTION_TYPE` = Int;
public const val `NET_IF_DIRECTION_MAXIMUM`: `NET_IF_DIRECTION_TYPE` = 3;
public const val `NET_IF_DIRECTION_RECEIVEONLY`: `NET_IF_DIRECTION_TYPE` = 2;
public const val `NET_IF_DIRECTION_SENDONLY`: `NET_IF_DIRECTION_TYPE` = 1;
public const val `NET_IF_DIRECTION_SENDRECEIVE`: `NET_IF_DIRECTION_TYPE` = 0;
public typealias `NET_IF_DIRECTION_TYPE` = Int;
public typealias `NET_IF_MEDIA_CONNECT_STATE` = Int;
public typealias `NET_IF_MEDIA_DUPLEX_STATE` = Int;
public const val `NET_IF_OID_COMPARTMENT_ID`: UInt = 2u;
public const val `NET_IF_OID_IF_ALIAS`: UInt = 1u;
public const val `NET_IF_OID_IF_ENTRY`: UInt = 4u;
public const val `NET_IF_OID_NETWORK_GUID`: UInt = 3u;
public typealias `NET_IF_OPER_STATUS` = Int;
public const val `NET_IF_OPER_STATUS_DORMANT`: `NET_IF_OPER_STATUS` = 5;
public const val `NET_IF_OPER_STATUS_DORMANT_LOW_POWER`: UInt = 8u;
public const val `NET_IF_OPER_STATUS_DORMANT_PAUSED`: UInt = 4u;
public const val `NET_IF_OPER_STATUS_DOWN`: `NET_IF_OPER_STATUS` = 2;
public const val `NET_IF_OPER_STATUS_DOWN_NOT_AUTHENTICATED`: UInt = 1u;
public const val `NET_IF_OPER_STATUS_DOWN_NOT_MEDIA_CONNECTED`: UInt = 2u;
public const val `NET_IF_OPER_STATUS_LOWER_LAYER_DOWN`: `NET_IF_OPER_STATUS` = 7;
public const val `NET_IF_OPER_STATUS_NOT_PRESENT`: `NET_IF_OPER_STATUS` = 6;
public const val `NET_IF_OPER_STATUS_TESTING`: `NET_IF_OPER_STATUS` = 3;
public const val `NET_IF_OPER_STATUS_UNKNOWN`: `NET_IF_OPER_STATUS` = 4;
public const val `NET_IF_OPER_STATUS_UP`: `NET_IF_OPER_STATUS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NET_IF_RCV_ADDRESS_LH` (
    public var `ifRcvAddressType`: `NET_IF_RCV_ADDRESS_TYPE`,
    public var `ifRcvAddressLength`: UShort,
    public var `ifRcvAddressOffset`: UShort,
)
public typealias `NET_IF_RCV_ADDRESS_TYPE` = Int;
public const val `NET_IF_RCV_ADDRESS_TYPE_NON_VOLATILE`: `NET_IF_RCV_ADDRESS_TYPE` = 3;
public const val `NET_IF_RCV_ADDRESS_TYPE_OTHER`: `NET_IF_RCV_ADDRESS_TYPE` = 1;
public const val `NET_IF_RCV_ADDRESS_TYPE_VOLATILE`: `NET_IF_RCV_ADDRESS_TYPE` = 2;
// UNSUPPORTED Rust 2391:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NET_LUID_LH {
//     pub Value: u64,
//     pub Info: NET_LUID_LH_0,
// }

// UNSUPPORTED Rust 2397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NET_LUID_LH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NET_LUID_LH_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NET_PHYSICAL_LOCATION_LH` (
    public var `BusNumber`: UInt,
    public var `SlotNumber`: UInt,
    public var `FunctionNumber`: UInt,
)
public const val `NET_SITEID_MAXSYSTEM`: UInt = 268435455u;
public const val `NET_SITEID_MAXUSER`: UInt = 134217727u;
public const val `NET_SITEID_UNSPECIFIED`: UInt = 0u;
public const val `NIIF_FILTER_INTERFACE`: UInt = 2u;
public const val `NIIF_HARDWARE_INTERFACE`: UInt = 1u;
public const val `NIIF_NDIS_ENDPOINT_INTERFACE`: UInt = 64u;
public const val `NIIF_NDIS_ISCSI_INTERFACE`: UInt = 128u;
public const val `NIIF_NDIS_RESERVED1`: UInt = 4u;
public const val `NIIF_NDIS_RESERVED2`: UInt = 8u;
public const val `NIIF_NDIS_RESERVED3`: UInt = 16u;
public const val `NIIF_NDIS_RESERVED4`: UInt = 256u;
public const val `NIIF_NDIS_WDM_INTERFACE`: UInt = 32u;
public const val `Ndis802_11AuthModeAutoSwitch`: `NDIS_802_11_AUTHENTICATION_MODE` = 2;
public const val `Ndis802_11AuthModeMax`: `NDIS_802_11_AUTHENTICATION_MODE` = 11;
public const val `Ndis802_11AuthModeOpen`: `NDIS_802_11_AUTHENTICATION_MODE` = 0;
public const val `Ndis802_11AuthModeShared`: `NDIS_802_11_AUTHENTICATION_MODE` = 1;
public const val `Ndis802_11AuthModeWPA`: `NDIS_802_11_AUTHENTICATION_MODE` = 3;
public const val `Ndis802_11AuthModeWPA2`: `NDIS_802_11_AUTHENTICATION_MODE` = 6;
public const val `Ndis802_11AuthModeWPA2PSK`: `NDIS_802_11_AUTHENTICATION_MODE` = 7;
public const val `Ndis802_11AuthModeWPA3`: `NDIS_802_11_AUTHENTICATION_MODE` = 8;
public const val `Ndis802_11AuthModeWPA3Ent`: `NDIS_802_11_AUTHENTICATION_MODE` = 10;
public const val `Ndis802_11AuthModeWPA3Ent192`: `NDIS_802_11_AUTHENTICATION_MODE` = 8;
public const val `Ndis802_11AuthModeWPA3SAE`: `NDIS_802_11_AUTHENTICATION_MODE` = 9;
public const val `Ndis802_11AuthModeWPANone`: `NDIS_802_11_AUTHENTICATION_MODE` = 5;
public const val `Ndis802_11AuthModeWPAPSK`: `NDIS_802_11_AUTHENTICATION_MODE` = 4;
public const val `Ndis802_11AutoUnknown`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 2;
public const val `Ndis802_11Automode`: `NDIS_802_11_NETWORK_TYPE` = 4;
public const val `Ndis802_11DS`: `NDIS_802_11_NETWORK_TYPE` = 1;
public const val `Ndis802_11Encryption1Enabled`: `NDIS_802_11_WEP_STATUS` = 0;
public const val `Ndis802_11Encryption1KeyAbsent`: `NDIS_802_11_WEP_STATUS` = 2;
public const val `Ndis802_11Encryption2Enabled`: `NDIS_802_11_WEP_STATUS` = 4;
public const val `Ndis802_11Encryption2KeyAbsent`: `NDIS_802_11_WEP_STATUS` = 5;
public const val `Ndis802_11Encryption3Enabled`: `NDIS_802_11_WEP_STATUS` = 6;
public const val `Ndis802_11Encryption3KeyAbsent`: `NDIS_802_11_WEP_STATUS` = 7;
public const val `Ndis802_11EncryptionDisabled`: `NDIS_802_11_WEP_STATUS` = 1;
public const val `Ndis802_11EncryptionNotSupported`: `NDIS_802_11_WEP_STATUS` = 3;
public const val `Ndis802_11FH`: `NDIS_802_11_NETWORK_TYPE` = 0;
public const val `Ndis802_11IBSS`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 0;
public const val `Ndis802_11Infrastructure`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 1;
public const val `Ndis802_11InfrastructureMax`: `NDIS_802_11_NETWORK_INFRASTRUCTURE` = 3;
public const val `Ndis802_11MediaStreamOff`: `NDIS_802_11_MEDIA_STREAM_MODE` = 0;
public const val `Ndis802_11MediaStreamOn`: `NDIS_802_11_MEDIA_STREAM_MODE` = 1;
public const val `Ndis802_11NetworkTypeMax`: `NDIS_802_11_NETWORK_TYPE` = 5;
public const val `Ndis802_11OFDM24`: `NDIS_802_11_NETWORK_TYPE` = 3;
public const val `Ndis802_11OFDM5`: `NDIS_802_11_NETWORK_TYPE` = 2;
public const val `Ndis802_11PowerModeCAM`: `NDIS_802_11_POWER_MODE` = 0;
public const val `Ndis802_11PowerModeFast_PSP`: `NDIS_802_11_POWER_MODE` = 2;
public const val `Ndis802_11PowerModeMAX_PSP`: `NDIS_802_11_POWER_MODE` = 1;
public const val `Ndis802_11PowerModeMax`: `NDIS_802_11_POWER_MODE` = 3;
public const val `Ndis802_11PrivFilter8021xWEP`: `NDIS_802_11_PRIVACY_FILTER` = 1;
public const val `Ndis802_11PrivFilterAcceptAll`: `NDIS_802_11_PRIVACY_FILTER` = 0;
public const val `Ndis802_11RadioStatusHardwareOff`: `NDIS_802_11_RADIO_STATUS` = 1;
public const val `Ndis802_11RadioStatusHardwareSoftwareOff`: `NDIS_802_11_RADIO_STATUS` = 3;
public const val `Ndis802_11RadioStatusMax`: `NDIS_802_11_RADIO_STATUS` = 4;
public const val `Ndis802_11RadioStatusOn`: `NDIS_802_11_RADIO_STATUS` = 0;
public const val `Ndis802_11RadioStatusSoftwareOff`: `NDIS_802_11_RADIO_STATUS` = 2;
public const val `Ndis802_11ReloadWEPKeys`: `NDIS_802_11_RELOAD_DEFAULTS` = 0;
public const val `Ndis802_11StatusTypeMax`: `NDIS_802_11_STATUS_TYPE` = 3;
public const val `Ndis802_11StatusType_Authentication`: `NDIS_802_11_STATUS_TYPE` = 0;
public const val `Ndis802_11StatusType_MediaStreamMode`: `NDIS_802_11_STATUS_TYPE` = 1;
public const val `Ndis802_11StatusType_PMKID_CandidateList`: `NDIS_802_11_STATUS_TYPE` = 2;
public const val `Ndis802_11WEPDisabled`: `NDIS_802_11_WEP_STATUS` = 1;
public const val `Ndis802_11WEPEnabled`: `NDIS_802_11_WEP_STATUS` = 0;
public const val `Ndis802_11WEPKeyAbsent`: `NDIS_802_11_WEP_STATUS` = 2;
public const val `Ndis802_11WEPNotSupported`: `NDIS_802_11_WEP_STATUS` = 3;
public const val `NdisDefinitelyNetworkChange`: `NDIS_NETWORK_CHANGE_TYPE` = 2;
public const val `NdisDeviceStateD0`: `NDIS_DEVICE_POWER_STATE` = 1;
public const val `NdisDeviceStateD1`: `NDIS_DEVICE_POWER_STATE` = 2;
public const val `NdisDeviceStateD2`: `NDIS_DEVICE_POWER_STATE` = 3;
public const val `NdisDeviceStateD3`: `NDIS_DEVICE_POWER_STATE` = 4;
public const val `NdisDeviceStateMaximum`: `NDIS_DEVICE_POWER_STATE` = 5;
public const val `NdisDeviceStateUnspecified`: `NDIS_DEVICE_POWER_STATE` = 0;
public const val `NdisFddiRingDetect`: `NDIS_FDDI_RING_MGT_STATE` = 4;
public const val `NdisFddiRingDirected`: `NDIS_FDDI_RING_MGT_STATE` = 7;
public const val `NdisFddiRingIsolated`: `NDIS_FDDI_RING_MGT_STATE` = 1;
public const val `NdisFddiRingNonOperational`: `NDIS_FDDI_RING_MGT_STATE` = 2;
public const val `NdisFddiRingNonOperationalDup`: `NDIS_FDDI_RING_MGT_STATE` = 5;
public const val `NdisFddiRingOperational`: `NDIS_FDDI_RING_MGT_STATE` = 3;
public const val `NdisFddiRingOperationalDup`: `NDIS_FDDI_RING_MGT_STATE` = 6;
public const val `NdisFddiRingTrace`: `NDIS_FDDI_RING_MGT_STATE` = 8;
public const val `NdisFddiStateActive`: `NDIS_FDDI_LCONNECTION_STATE` = 9;
public const val `NdisFddiStateBreak`: `NDIS_FDDI_LCONNECTION_STATE` = 2;
public const val `NdisFddiStateConnect`: `NDIS_FDDI_LCONNECTION_STATE` = 4;
public const val `NdisFddiStateJoin`: `NDIS_FDDI_LCONNECTION_STATE` = 7;
public const val `NdisFddiStateMaintenance`: `NDIS_FDDI_LCONNECTION_STATE` = 10;
public const val `NdisFddiStateNext`: `NDIS_FDDI_LCONNECTION_STATE` = 5;
public const val `NdisFddiStateOff`: `NDIS_FDDI_LCONNECTION_STATE` = 1;
public const val `NdisFddiStateSignal`: `NDIS_FDDI_LCONNECTION_STATE` = 6;
public const val `NdisFddiStateTrace`: `NDIS_FDDI_LCONNECTION_STATE` = 3;
public const val `NdisFddiStateVerify`: `NDIS_FDDI_LCONNECTION_STATE` = 8;
public const val `NdisFddiTypeCWrapA`: `NDIS_FDDI_ATTACHMENT_TYPE` = 10;
public const val `NdisFddiTypeCWrapB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 11;
public const val `NdisFddiTypeCWrapS`: `NDIS_FDDI_ATTACHMENT_TYPE` = 12;
public const val `NdisFddiTypeIsolated`: `NDIS_FDDI_ATTACHMENT_TYPE` = 1;
public const val `NdisFddiTypeLocalA`: `NDIS_FDDI_ATTACHMENT_TYPE` = 2;
public const val `NdisFddiTypeLocalAB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 4;
public const val `NdisFddiTypeLocalB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 3;
public const val `NdisFddiTypeLocalS`: `NDIS_FDDI_ATTACHMENT_TYPE` = 5;
public const val `NdisFddiTypeThrough`: `NDIS_FDDI_ATTACHMENT_TYPE` = 13;
public const val `NdisFddiTypeWrapA`: `NDIS_FDDI_ATTACHMENT_TYPE` = 6;
public const val `NdisFddiTypeWrapAB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 8;
public const val `NdisFddiTypeWrapB`: `NDIS_FDDI_ATTACHMENT_TYPE` = 7;
public const val `NdisFddiTypeWrapS`: `NDIS_FDDI_ATTACHMENT_TYPE` = 9;
public const val `NdisHardwareStatusClosing`: `NDIS_HARDWARE_STATUS` = 3;
public const val `NdisHardwareStatusInitializing`: `NDIS_HARDWARE_STATUS` = 1;
public const val `NdisHardwareStatusNotReady`: `NDIS_HARDWARE_STATUS` = 4;
public const val `NdisHardwareStatusReady`: `NDIS_HARDWARE_STATUS` = 0;
public const val `NdisHardwareStatusReset`: `NDIS_HARDWARE_STATUS` = 2;
public const val `NdisHashFunctionReserved1`: UInt = 2u;
public const val `NdisHashFunctionReserved2`: UInt = 4u;
public const val `NdisHashFunctionReserved3`: UInt = 8u;
public const val `NdisHashFunctionToeplitz`: UInt = 1u;
public const val `NdisInterruptModerationDisabled`: `NDIS_INTERRUPT_MODERATION` = 3;
public const val `NdisInterruptModerationEnabled`: `NDIS_INTERRUPT_MODERATION` = 2;
public const val `NdisInterruptModerationNotSupported`: `NDIS_INTERRUPT_MODERATION` = 1;
public const val `NdisInterruptModerationUnknown`: `NDIS_INTERRUPT_MODERATION` = 0;
public const val `NdisMediaStateConnected`: `NDIS_MEDIA_STATE` = 0;
public const val `NdisMediaStateDisconnected`: `NDIS_MEDIA_STATE` = 1;
public const val `NdisMedium1394`: `NDIS_MEDIUM` = 13;
public const val `NdisMedium802_3`: `NDIS_MEDIUM` = 0;
public const val `NdisMedium802_5`: `NDIS_MEDIUM` = 1;
public const val `NdisMediumArcnet878_2`: `NDIS_MEDIUM` = 7;
public const val `NdisMediumArcnetRaw`: `NDIS_MEDIUM` = 6;
public const val `NdisMediumAtm`: `NDIS_MEDIUM` = 8;
public const val `NdisMediumBpc`: `NDIS_MEDIUM` = 11;
public const val `NdisMediumCoWan`: `NDIS_MEDIUM` = 12;
public const val `NdisMediumDix`: `NDIS_MEDIUM` = 5;
public const val `NdisMediumFddi`: `NDIS_MEDIUM` = 2;
public const val `NdisMediumIP`: `NDIS_MEDIUM` = 19;
public const val `NdisMediumInfiniBand`: `NDIS_MEDIUM` = 14;
public const val `NdisMediumIrda`: `NDIS_MEDIUM` = 10;
public const val `NdisMediumLocalTalk`: `NDIS_MEDIUM` = 4;
public const val `NdisMediumLoopback`: `NDIS_MEDIUM` = 17;
public const val `NdisMediumMax`: `NDIS_MEDIUM` = 20;
public const val `NdisMediumNative802_11`: `NDIS_MEDIUM` = 16;
public const val `NdisMediumTunnel`: `NDIS_MEDIUM` = 15;
public const val `NdisMediumWan`: `NDIS_MEDIUM` = 3;
public const val `NdisMediumWiMAX`: `NDIS_MEDIUM` = 18;
public const val `NdisMediumWirelessWan`: `NDIS_MEDIUM` = 9;
public const val `NdisNetworkChangeFromMediaConnect`: `NDIS_NETWORK_CHANGE_TYPE` = 3;
public const val `NdisNetworkChangeMax`: `NDIS_NETWORK_CHANGE_TYPE` = 4;
public const val `NdisPauseFunctionsReceiveOnly`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 2;
public const val `NdisPauseFunctionsSendAndReceive`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 3;
public const val `NdisPauseFunctionsSendOnly`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 1;
public const val `NdisPauseFunctionsUnknown`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 4;
public const val `NdisPauseFunctionsUnsupported`: `NDIS_SUPPORTED_PAUSE_FUNCTIONS` = 0;
public const val `NdisPhysicalMedium1394`: `NDIS_PHYSICAL_MEDIUM` = 7;
public const val `NdisPhysicalMedium802_3`: `NDIS_PHYSICAL_MEDIUM` = 14;
public const val `NdisPhysicalMedium802_5`: `NDIS_PHYSICAL_MEDIUM` = 15;
public const val `NdisPhysicalMediumBluetooth`: `NDIS_PHYSICAL_MEDIUM` = 10;
public const val `NdisPhysicalMediumCableModem`: `NDIS_PHYSICAL_MEDIUM` = 2;
public const val `NdisPhysicalMediumDSL`: `NDIS_PHYSICAL_MEDIUM` = 5;
public const val `NdisPhysicalMediumFibreChannel`: `NDIS_PHYSICAL_MEDIUM` = 6;
public const val `NdisPhysicalMediumInfiniband`: `NDIS_PHYSICAL_MEDIUM` = 11;
public const val `NdisPhysicalMediumIrda`: `NDIS_PHYSICAL_MEDIUM` = 16;
public const val `NdisPhysicalMediumMax`: `NDIS_PHYSICAL_MEDIUM` = 21;
public const val `NdisPhysicalMediumNative802_11`: `NDIS_PHYSICAL_MEDIUM` = 9;
public const val `NdisPhysicalMediumNative802_15_4`: `NDIS_PHYSICAL_MEDIUM` = 20;
public const val `NdisPhysicalMediumOther`: `NDIS_PHYSICAL_MEDIUM` = 19;
public const val `NdisPhysicalMediumPhoneLine`: `NDIS_PHYSICAL_MEDIUM` = 3;
public const val `NdisPhysicalMediumPowerLine`: `NDIS_PHYSICAL_MEDIUM` = 4;
public const val `NdisPhysicalMediumUWB`: `NDIS_PHYSICAL_MEDIUM` = 13;
public const val `NdisPhysicalMediumUnspecified`: `NDIS_PHYSICAL_MEDIUM` = 0;
public const val `NdisPhysicalMediumWiMax`: `NDIS_PHYSICAL_MEDIUM` = 12;
public const val `NdisPhysicalMediumWiredCoWan`: `NDIS_PHYSICAL_MEDIUM` = 18;
public const val `NdisPhysicalMediumWiredWAN`: `NDIS_PHYSICAL_MEDIUM` = 17;
public const val `NdisPhysicalMediumWirelessLan`: `NDIS_PHYSICAL_MEDIUM` = 1;
public const val `NdisPhysicalMediumWirelessWan`: `NDIS_PHYSICAL_MEDIUM` = 8;
public const val `NdisPortAuthorizationUnknown`: `NDIS_PORT_AUTHORIZATION_STATE` = 0;
public const val `NdisPortAuthorized`: `NDIS_PORT_AUTHORIZATION_STATE` = 1;
public const val `NdisPortControlStateControlled`: `NDIS_PORT_CONTROL_STATE` = 1;
public const val `NdisPortControlStateUncontrolled`: `NDIS_PORT_CONTROL_STATE` = 2;
public const val `NdisPortControlStateUnknown`: `NDIS_PORT_CONTROL_STATE` = 0;
public const val `NdisPortReauthorizing`: `NDIS_PORT_AUTHORIZATION_STATE` = 3;
public const val `NdisPortType8021xSupplicant`: `NDIS_PORT_TYPE` = 3;
public const val `NdisPortTypeBridge`: `NDIS_PORT_TYPE` = 1;
public const val `NdisPortTypeMax`: `NDIS_PORT_TYPE` = 4;
public const val `NdisPortTypeRasConnection`: `NDIS_PORT_TYPE` = 2;
public const val `NdisPortTypeUndefined`: `NDIS_PORT_TYPE` = 0;
public const val `NdisPortUnauthorized`: `NDIS_PORT_AUTHORIZATION_STATE` = 2;
public const val `NdisPossibleNetworkChange`: `NDIS_NETWORK_CHANGE_TYPE` = 1;
public const val `NdisProcessorVendorAuthenticAMD`: `NDIS_PROCESSOR_VENDOR` = 2;
public const val `NdisProcessorVendorGenuinIntel`: `NDIS_PROCESSOR_VENDOR` = 1;
public const val `NdisProcessorVendorGenuineIntel`: `NDIS_PROCESSOR_VENDOR` = 1;
public const val `NdisProcessorVendorUnknown`: `NDIS_PROCESSOR_VENDOR` = 0;
public const val `NdisRequestClose`: `NDIS_REQUEST_TYPE` = 4;
public const val `NdisRequestGeneric1`: `NDIS_REQUEST_TYPE` = 8;
public const val `NdisRequestGeneric2`: `NDIS_REQUEST_TYPE` = 9;
public const val `NdisRequestGeneric3`: `NDIS_REQUEST_TYPE` = 10;
public const val `NdisRequestGeneric4`: `NDIS_REQUEST_TYPE` = 11;
public const val `NdisRequestOpen`: `NDIS_REQUEST_TYPE` = 3;
public const val `NdisRequestQueryInformation`: `NDIS_REQUEST_TYPE` = 0;
public const val `NdisRequestQueryStatistics`: `NDIS_REQUEST_TYPE` = 2;
public const val `NdisRequestReset`: `NDIS_REQUEST_TYPE` = 7;
public const val `NdisRequestSend`: `NDIS_REQUEST_TYPE` = 5;
public const val `NdisRequestSetInformation`: `NDIS_REQUEST_TYPE` = 1;
public const val `NdisRequestTransferData`: `NDIS_REQUEST_TYPE` = 6;
public const val `NdisRingStateClosed`: `NDIS_802_5_RING_STATE` = 2;
public const val `NdisRingStateClosing`: `NDIS_802_5_RING_STATE` = 4;
public const val `NdisRingStateOpenFailure`: `NDIS_802_5_RING_STATE` = 5;
public const val `NdisRingStateOpened`: `NDIS_802_5_RING_STATE` = 1;
public const val `NdisRingStateOpening`: `NDIS_802_5_RING_STATE` = 3;
public const val `NdisRingStateRingFailure`: `NDIS_802_5_RING_STATE` = 6;
public const val `NdisWanErrorControl`: `NDIS_WAN_QUALITY` = 1;
public const val `NdisWanHeaderEthernet`: `NDIS_WAN_HEADER_FORMAT` = 1;
public const val `NdisWanHeaderNative`: `NDIS_WAN_HEADER_FORMAT` = 0;
public const val `NdisWanMediumAgileVPN`: `NDIS_WAN_MEDIUM_SUBTYPE` = 14;
public const val `NdisWanMediumAtm`: `NDIS_WAN_MEDIUM_SUBTYPE` = 5;
public const val `NdisWanMediumFrameRelay`: `NDIS_WAN_MEDIUM_SUBTYPE` = 4;
public const val `NdisWanMediumGre`: `NDIS_WAN_MEDIUM_SUBTYPE` = 15;
public const val `NdisWanMediumHub`: `NDIS_WAN_MEDIUM_SUBTYPE` = 0;
public const val `NdisWanMediumIrda`: `NDIS_WAN_MEDIUM_SUBTYPE` = 10;
public const val `NdisWanMediumIsdn`: `NDIS_WAN_MEDIUM_SUBTYPE` = 2;
public const val `NdisWanMediumL2TP`: `NDIS_WAN_MEDIUM_SUBTYPE` = 9;
public const val `NdisWanMediumPPTP`: `NDIS_WAN_MEDIUM_SUBTYPE` = 8;
public const val `NdisWanMediumParallel`: `NDIS_WAN_MEDIUM_SUBTYPE` = 11;
public const val `NdisWanMediumPppoe`: `NDIS_WAN_MEDIUM_SUBTYPE` = 12;
public const val `NdisWanMediumSSTP`: `NDIS_WAN_MEDIUM_SUBTYPE` = 13;
public const val `NdisWanMediumSW56K`: `NDIS_WAN_MEDIUM_SUBTYPE` = 7;
public const val `NdisWanMediumSerial`: `NDIS_WAN_MEDIUM_SUBTYPE` = 3;
public const val `NdisWanMediumSonet`: `NDIS_WAN_MEDIUM_SUBTYPE` = 6;
public const val `NdisWanMediumSubTypeMax`: `NDIS_WAN_MEDIUM_SUBTYPE` = 16;
public const val `NdisWanMediumX_25`: `NDIS_WAN_MEDIUM_SUBTYPE` = 1;
public const val `NdisWanRaw`: `NDIS_WAN_QUALITY` = 0;
public const val `NdisWanReliable`: `NDIS_WAN_QUALITY` = 2;
public const val `NdkInfiniBand`: `NDK_RDMA_TECHNOLOGY` = 2;
public const val `NdkMaxTechnology`: `NDK_RDMA_TECHNOLOGY` = 5;
public const val `NdkRoCE`: `NDK_RDMA_TECHNOLOGY` = 3;
public const val `NdkRoCEv2`: `NDK_RDMA_TECHNOLOGY` = 4;
public const val `NdkUndefined`: `NDK_RDMA_TECHNOLOGY` = 0;
public const val `NdkiWarp`: `NDK_RDMA_TECHNOLOGY` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OFFLOAD_ALGO_INFO` (
    public var `algoIdentifier`: UInt,
    public var `algoKeylen`: UInt,
    public var `algoRounds`: UInt,
)
public typealias `OFFLOAD_CONF_ALGO` = Int;
public const val `OFFLOAD_INBOUND_SA`: UInt = 1u;
public typealias `OFFLOAD_INTEGRITY_ALGO` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFFLOAD_IPSEC_ADD_SA` (
    public var `SrcAddr`: UInt,
    public var `SrcMask`: UInt,
    public var `DestAddr`: UInt,
    public var `DestMask`: UInt,
    public var `Protocol`: UInt,
    public var `SrcPort`: UShort,
    public var `DestPort`: UShort,
    public var `SrcTunnelAddr`: UInt,
    public var `DestTunnelAddr`: UInt,
    public var `Flags`: UShort,
    public var `NumSAs`: Short,
    public var `SecAssoc`: Array<`OFFLOAD_SECURITY_ASSOCIATION`>,
    public var `OffloadHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `KeyLen`: UInt,
    public var `KeyMat`: UByteArray,
)
// UNSUPPORTED Rust 2674:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_ADD_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFFLOAD_IPSEC_ADD_UDPESP_SA` (
    public var `SrcAddr`: UInt,
    public var `SrcMask`: UInt,
    public var `DstAddr`: UInt,
    public var `DstMask`: UInt,
    public var `Protocol`: UInt,
    public var `SrcPort`: UShort,
    public var `DstPort`: UShort,
    public var `SrcTunnelAddr`: UInt,
    public var `DstTunnelAddr`: UInt,
    public var `Flags`: UShort,
    public var `NumSAs`: Short,
    public var `SecAssoc`: Array<`OFFLOAD_SECURITY_ASSOCIATION`>,
    public var `OffloadHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `EncapTypeEntry`: `OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_ENTRY`,
    public var `EncapTypeEntryOffldHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `KeyLen`: UInt,
    public var `KeyMat`: UByteArray,
)
// UNSUPPORTED Rust 2700:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_ADD_UDPESP_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OFFLOAD_IPSEC_CONF_3_DES`: `OFFLOAD_CONF_ALGO` = 3;
public const val `OFFLOAD_IPSEC_CONF_DES`: `OFFLOAD_CONF_ALGO` = 1;
public const val `OFFLOAD_IPSEC_CONF_MAX`: `OFFLOAD_CONF_ALGO` = 4;
public const val `OFFLOAD_IPSEC_CONF_NONE`: `OFFLOAD_CONF_ALGO` = 0;
public const val `OFFLOAD_IPSEC_CONF_RESERVED`: `OFFLOAD_CONF_ALGO` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFFLOAD_IPSEC_DELETE_SA` (
    public var `OffloadHandle`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 2715:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_DELETE_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFFLOAD_IPSEC_DELETE_UDPESP_SA` (
    public var `OffloadHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `EncapTypeEntryOffldHandle`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 2726:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFFLOAD_IPSEC_DELETE_UDPESP_SA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OFFLOAD_IPSEC_INTEGRITY_MAX`: `OFFLOAD_INTEGRITY_ALGO` = 3;
public const val `OFFLOAD_IPSEC_INTEGRITY_MD5`: `OFFLOAD_INTEGRITY_ALGO` = 1;
public const val `OFFLOAD_IPSEC_INTEGRITY_NONE`: `OFFLOAD_INTEGRITY_ALGO` = 0;
public const val `OFFLOAD_IPSEC_INTEGRITY_SHA`: `OFFLOAD_INTEGRITY_ALGO` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_ENTRY` (
    public var `UdpEncapType`: `UDP_ENCAP_TYPE`,
    public var `DstEncapPort`: UShort,
)
public const val `OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_IKE`: `UDP_ENCAP_TYPE` = 0;
public const val `OFFLOAD_IPSEC_UDPESP_ENCAPTYPE_OTHER`: `UDP_ENCAP_TYPE` = 1;
public const val `OFFLOAD_MAX_SAS`: UInt = 3u;
public typealias `OFFLOAD_OPERATION_E` = Int;
public const val `OFFLOAD_OUTBOUND_SA`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OFFLOAD_SECURITY_ASSOCIATION` (
    public var `Operation`: `OFFLOAD_OPERATION_E`,
    public var `SPI`: UInt,
    public var `IntegrityAlgo`: `OFFLOAD_ALGO_INFO`,
    public var `ConfAlgo`: `OFFLOAD_ALGO_INFO`,
    public var `Reserved`: `OFFLOAD_ALGO_INFO`,
)
public const val `OID_1394_LOCAL_NODE_INFO`: UInt = 201392385u;
public const val `OID_1394_VC_INFO`: UInt = 201392386u;
public const val `OID_802_11_ADD_KEY`: UInt = 218169629u;
public const val `OID_802_11_ADD_WEP`: UInt = 218169619u;
public const val `OID_802_11_ASSOCIATION_INFORMATION`: UInt = 218169631u;
public const val `OID_802_11_AUTHENTICATION_MODE`: UInt = 218169624u;
public const val `OID_802_11_BSSID`: UInt = 218169601u;
public const val `OID_802_11_BSSID_LIST`: UInt = 218169879u;
public const val `OID_802_11_BSSID_LIST_SCAN`: UInt = 218169626u;
public const val `OID_802_11_CAPABILITY`: UInt = 218169634u;
public const val `OID_802_11_CONFIGURATION`: UInt = 218169873u;
public const val `OID_802_11_DESIRED_RATES`: UInt = 218169872u;
public const val `OID_802_11_DISASSOCIATE`: UInt = 218169621u;
public const val `OID_802_11_ENCRYPTION_STATUS`: UInt = 218169627u;
public const val `OID_802_11_FRAGMENTATION_THRESHOLD`: UInt = 218169865u;
public const val `OID_802_11_INFRASTRUCTURE_MODE`: UInt = 218169608u;
public const val `OID_802_11_MEDIA_STREAM_MODE`: UInt = 218169633u;
public const val `OID_802_11_NETWORK_TYPES_SUPPORTED`: UInt = 218169859u;
public const val `OID_802_11_NETWORK_TYPE_IN_USE`: UInt = 218169860u;
public const val `OID_802_11_NON_BCAST_SSID_LIST`: UInt = 218169636u;
public const val `OID_802_11_NUMBER_OF_ANTENNAS`: UInt = 218169867u;
public const val `OID_802_11_PMKID`: UInt = 218169635u;
public const val `OID_802_11_POWER_MODE`: UInt = 218169878u;
public const val `OID_802_11_PRIVACY_FILTER`: UInt = 218169625u;
public const val `OID_802_11_RADIO_STATUS`: UInt = 218169637u;
public const val `OID_802_11_RELOAD_DEFAULTS`: UInt = 218169628u;
public const val `OID_802_11_REMOVE_KEY`: UInt = 218169630u;
public const val `OID_802_11_REMOVE_WEP`: UInt = 218169620u;
public const val `OID_802_11_RSSI`: UInt = 218169862u;
public const val `OID_802_11_RSSI_TRIGGER`: UInt = 218169863u;
public const val `OID_802_11_RTS_THRESHOLD`: UInt = 218169866u;
public const val `OID_802_11_RX_ANTENNA_SELECTED`: UInt = 218169868u;
public const val `OID_802_11_SSID`: UInt = 218169602u;
public const val `OID_802_11_STATISTICS`: UInt = 218235410u;
public const val `OID_802_11_SUPPORTED_RATES`: UInt = 218169870u;
public const val `OID_802_11_TEST`: UInt = 218169632u;
public const val `OID_802_11_TX_ANTENNA_SELECTED`: UInt = 218169869u;
public const val `OID_802_11_TX_POWER_LEVEL`: UInt = 218169861u;
public const val `OID_802_11_WEP_STATUS`: UInt = 218169627u;
public const val `OID_802_3_ADD_MULTICAST_ADDRESS`: UInt = 16843272u;
public const val `OID_802_3_CURRENT_ADDRESS`: UInt = 16843010u;
public const val `OID_802_3_DELETE_MULTICAST_ADDRESS`: UInt = 16843273u;
public const val `OID_802_3_MAC_OPTIONS`: UInt = 16843013u;
public const val `OID_802_3_MAXIMUM_LIST_SIZE`: UInt = 16843012u;
public const val `OID_802_3_MULTICAST_LIST`: UInt = 16843011u;
public const val `OID_802_3_PERMANENT_ADDRESS`: UInt = 16843009u;
public const val `OID_802_3_RCV_ERROR_ALIGNMENT`: UInt = 16908545u;
public const val `OID_802_3_RCV_OVERRUN`: UInt = 16908803u;
public const val `OID_802_3_XMIT_DEFERRED`: UInt = 16908801u;
public const val `OID_802_3_XMIT_HEARTBEAT_FAILURE`: UInt = 16908805u;
public const val `OID_802_3_XMIT_LATE_COLLISIONS`: UInt = 16908807u;
public const val `OID_802_3_XMIT_MAX_COLLISIONS`: UInt = 16908802u;
public const val `OID_802_3_XMIT_MORE_COLLISIONS`: UInt = 16908547u;
public const val `OID_802_3_XMIT_ONE_COLLISION`: UInt = 16908546u;
public const val `OID_802_3_XMIT_TIMES_CRS_LOST`: UInt = 16908806u;
public const val `OID_802_3_XMIT_UNDERRUN`: UInt = 16908804u;
public const val `OID_802_5_ABORT_DELIMETERS`: UInt = 33686019u;
public const val `OID_802_5_AC_ERRORS`: UInt = 33686018u;
public const val `OID_802_5_BURST_ERRORS`: UInt = 33686017u;
public const val `OID_802_5_CURRENT_ADDRESS`: UInt = 33620226u;
public const val `OID_802_5_CURRENT_FUNCTIONAL`: UInt = 33620227u;
public const val `OID_802_5_CURRENT_GROUP`: UInt = 33620228u;
public const val `OID_802_5_CURRENT_RING_STATE`: UInt = 33620231u;
public const val `OID_802_5_CURRENT_RING_STATUS`: UInt = 33620230u;
public const val `OID_802_5_FRAME_COPIED_ERRORS`: UInt = 33686020u;
public const val `OID_802_5_FREQUENCY_ERRORS`: UInt = 33686021u;
public const val `OID_802_5_INTERNAL_ERRORS`: UInt = 33686023u;
public const val `OID_802_5_LAST_OPEN_STATUS`: UInt = 33620229u;
public const val `OID_802_5_LINE_ERRORS`: UInt = 33685761u;
public const val `OID_802_5_LOST_FRAMES`: UInt = 33685762u;
public const val `OID_802_5_PERMANENT_ADDRESS`: UInt = 33620225u;
public const val `OID_802_5_TOKEN_ERRORS`: UInt = 33686022u;
public const val `OID_ARCNET_CURRENT_ADDRESS`: UInt = 100729090u;
public const val `OID_ARCNET_PERMANENT_ADDRESS`: UInt = 100729089u;
public const val `OID_ARCNET_RECONFIGURATIONS`: UInt = 100794881u;
public const val `OID_ATM_ACQUIRE_ACCESS_NET_RESOURCES`: UInt = 134283779u;
public const val `OID_ATM_ALIGNMENT_REQUIRED`: UInt = 134283784u;
public const val `OID_ATM_ASSIGNED_VPI`: UInt = 134283778u;
public const val `OID_ATM_CALL_ALERTING`: UInt = 134283788u;
public const val `OID_ATM_CALL_NOTIFY`: UInt = 134283790u;
public const val `OID_ATM_CALL_PROCEEDING`: UInt = 134283787u;
public const val `OID_ATM_CELLS_HEC_ERROR`: UInt = 134349314u;
public const val `OID_ATM_DIGITAL_BROADCAST_VPIVCI`: UInt = 134283782u;
public const val `OID_ATM_GET_NEAREST_FLOW`: UInt = 134283783u;
public const val `OID_ATM_HW_CURRENT_ADDRESS`: UInt = 134283524u;
public const val `OID_ATM_ILMI_VPIVCI`: UInt = 134283781u;
public const val `OID_ATM_LECS_ADDRESS`: UInt = 134283785u;
public const val `OID_ATM_MAX_AAL0_PACKET_SIZE`: UInt = 134283528u;
public const val `OID_ATM_MAX_AAL1_PACKET_SIZE`: UInt = 134283529u;
public const val `OID_ATM_MAX_AAL34_PACKET_SIZE`: UInt = 134283530u;
public const val `OID_ATM_MAX_AAL5_PACKET_SIZE`: UInt = 134283531u;
public const val `OID_ATM_MAX_ACTIVE_VCI_BITS`: UInt = 134283526u;
public const val `OID_ATM_MAX_ACTIVE_VCS`: UInt = 134283525u;
public const val `OID_ATM_MAX_ACTIVE_VPI_BITS`: UInt = 134283527u;
public const val `OID_ATM_MY_IP_NM_ADDRESS`: UInt = 134283791u;
public const val `OID_ATM_PARTY_ALERTING`: UInt = 134283789u;
public const val `OID_ATM_RCV_CELLS_DROPPED`: UInt = 134349059u;
public const val `OID_ATM_RCV_CELLS_OK`: UInt = 134349057u;
public const val `OID_ATM_RCV_INVALID_VPI_VCI`: UInt = 134349313u;
public const val `OID_ATM_RCV_REASSEMBLY_ERROR`: UInt = 134349315u;
public const val `OID_ATM_RELEASE_ACCESS_NET_RESOURCES`: UInt = 134283780u;
public const val `OID_ATM_SERVICE_ADDRESS`: UInt = 134283786u;
public const val `OID_ATM_SIGNALING_VPIVCI`: UInt = 134283777u;
public const val `OID_ATM_SUPPORTED_AAL_TYPES`: UInt = 134283523u;
public const val `OID_ATM_SUPPORTED_SERVICE_CATEGORY`: UInt = 134283522u;
public const val `OID_ATM_SUPPORTED_VC_RATES`: UInt = 134283521u;
public const val `OID_ATM_XMIT_CELLS_OK`: UInt = 134349058u;
public const val `OID_CO_ADDRESS_CHANGE`: UInt = 4261412871u;
public const val `OID_CO_ADD_ADDRESS`: UInt = 4261412868u;
public const val `OID_CO_ADD_PVC`: UInt = 4261412865u;
public const val `OID_CO_AF_CLOSE`: UInt = 4261412874u;
public const val `OID_CO_DELETE_ADDRESS`: UInt = 4261412869u;
public const val `OID_CO_DELETE_PVC`: UInt = 4261412866u;
public const val `OID_CO_GET_ADDRESSES`: UInt = 4261412870u;
public const val `OID_CO_GET_CALL_INFORMATION`: UInt = 4261412867u;
public const val `OID_CO_SIGNALING_DISABLED`: UInt = 4261412873u;
public const val `OID_CO_SIGNALING_ENABLED`: UInt = 4261412872u;
public const val `OID_CO_TAPI_ADDRESS_CAPS`: UInt = 4261416963u;
public const val `OID_CO_TAPI_CM_CAPS`: UInt = 4261416961u;
public const val `OID_CO_TAPI_DONT_REPORT_DIGITS`: UInt = 4261416969u;
public const val `OID_CO_TAPI_GET_CALL_DIAGNOSTICS`: UInt = 4261416967u;
public const val `OID_CO_TAPI_LINE_CAPS`: UInt = 4261416962u;
public const val `OID_CO_TAPI_REPORT_DIGITS`: UInt = 4261416968u;
public const val `OID_CO_TAPI_TRANSLATE_NDIS_CALLPARAMS`: UInt = 4261416965u;
public const val `OID_CO_TAPI_TRANSLATE_TAPI_CALLPARAMS`: UInt = 4261416964u;
public const val `OID_CO_TAPI_TRANSLATE_TAPI_SAP`: UInt = 4261416966u;
public const val `OID_FDDI_ATTACHMENT_TYPE`: UInt = 50462977u;
public const val `OID_FDDI_DOWNSTREAM_NODE_LONG`: UInt = 50462979u;
public const val `OID_FDDI_FRAMES_LOST`: UInt = 50462981u;
public const val `OID_FDDI_FRAME_ERRORS`: UInt = 50462980u;
public const val `OID_FDDI_IF_ADMIN_STATUS`: UInt = 50528894u;
public const val `OID_FDDI_IF_DESCR`: UInt = 50528889u;
public const val `OID_FDDI_IF_IN_DISCARDS`: UInt = 50528900u;
public const val `OID_FDDI_IF_IN_ERRORS`: UInt = 50528901u;
public const val `OID_FDDI_IF_IN_NUCAST_PKTS`: UInt = 50528899u;
public const val `OID_FDDI_IF_IN_OCTETS`: UInt = 50528897u;
public const val `OID_FDDI_IF_IN_UCAST_PKTS`: UInt = 50528898u;
public const val `OID_FDDI_IF_IN_UNKNOWN_PROTOS`: UInt = 50528902u;
public const val `OID_FDDI_IF_LAST_CHANGE`: UInt = 50528896u;
public const val `OID_FDDI_IF_MTU`: UInt = 50528891u;
public const val `OID_FDDI_IF_OPER_STATUS`: UInt = 50528895u;
public const val `OID_FDDI_IF_OUT_DISCARDS`: UInt = 50528906u;
public const val `OID_FDDI_IF_OUT_ERRORS`: UInt = 50528907u;
public const val `OID_FDDI_IF_OUT_NUCAST_PKTS`: UInt = 50528905u;
public const val `OID_FDDI_IF_OUT_OCTETS`: UInt = 50528903u;
public const val `OID_FDDI_IF_OUT_QLEN`: UInt = 50528908u;
public const val `OID_FDDI_IF_OUT_UCAST_PKTS`: UInt = 50528904u;
public const val `OID_FDDI_IF_PHYS_ADDRESS`: UInt = 50528893u;
public const val `OID_FDDI_IF_SPECIFIC`: UInt = 50528909u;
public const val `OID_FDDI_IF_SPEED`: UInt = 50528892u;
public const val `OID_FDDI_IF_TYPE`: UInt = 50528890u;
public const val `OID_FDDI_LCONNECTION_STATE`: UInt = 50462985u;
public const val `OID_FDDI_LCT_FAILURES`: UInt = 50462983u;
public const val `OID_FDDI_LEM_REJECTS`: UInt = 50462984u;
public const val `OID_FDDI_LONG_CURRENT_ADDR`: UInt = 50397442u;
public const val `OID_FDDI_LONG_MAX_LIST_SIZE`: UInt = 50397444u;
public const val `OID_FDDI_LONG_MULTICAST_LIST`: UInt = 50397443u;
public const val `OID_FDDI_LONG_PERMANENT_ADDR`: UInt = 50397441u;
public const val `OID_FDDI_MAC_AVAILABLE_PATHS`: UInt = 50528803u;
public const val `OID_FDDI_MAC_BRIDGE_FUNCTIONS`: UInt = 50528800u;
public const val `OID_FDDI_MAC_COPIED_CT`: UInt = 50528828u;
public const val `OID_FDDI_MAC_CURRENT_PATH`: UInt = 50528804u;
public const val `OID_FDDI_MAC_DA_FLAG`: UInt = 50528842u;
public const val `OID_FDDI_MAC_DOWNSTREAM_NBR`: UInt = 50528806u;
public const val `OID_FDDI_MAC_DOWNSTREAM_PORT_TYPE`: UInt = 50528811u;
public const val `OID_FDDI_MAC_DUP_ADDRESS_TEST`: UInt = 50528809u;
public const val `OID_FDDI_MAC_ERROR_CT`: UInt = 50528831u;
public const val `OID_FDDI_MAC_FRAME_CT`: UInt = 50528827u;
public const val `OID_FDDI_MAC_FRAME_ERROR_FLAG`: UInt = 50528844u;
public const val `OID_FDDI_MAC_FRAME_ERROR_RATIO`: UInt = 50528838u;
public const val `OID_FDDI_MAC_FRAME_ERROR_THRESHOLD`: UInt = 50528837u;
public const val `OID_FDDI_MAC_FRAME_STATUS_FUNCTIONS`: UInt = 50528799u;
public const val `OID_FDDI_MAC_HARDWARE_PRESENT`: UInt = 50528847u;
public const val `OID_FDDI_MAC_INDEX`: UInt = 50528812u;
public const val `OID_FDDI_MAC_LATE_CT`: UInt = 50528835u;
public const val `OID_FDDI_MAC_LONG_GRP_ADDRESS`: UInt = 50528814u;
public const val `OID_FDDI_MAC_LOST_CT`: UInt = 50528832u;
public const val `OID_FDDI_MAC_MA_UNITDATA_AVAILABLE`: UInt = 50528846u;
public const val `OID_FDDI_MAC_MA_UNITDATA_ENABLE`: UInt = 50528848u;
public const val `OID_FDDI_MAC_NOT_COPIED_CT`: UInt = 50528834u;
public const val `OID_FDDI_MAC_NOT_COPIED_FLAG`: UInt = 50528845u;
public const val `OID_FDDI_MAC_NOT_COPIED_RATIO`: UInt = 50528840u;
public const val `OID_FDDI_MAC_NOT_COPIED_THRESHOLD`: UInt = 50528839u;
public const val `OID_FDDI_MAC_OLD_DOWNSTREAM_NBR`: UInt = 50528808u;
public const val `OID_FDDI_MAC_OLD_UPSTREAM_NBR`: UInt = 50528807u;
public const val `OID_FDDI_MAC_REQUESTED_PATHS`: UInt = 50528810u;
public const val `OID_FDDI_MAC_RING_OP_CT`: UInt = 50528836u;
public const val `OID_FDDI_MAC_RMT_STATE`: UInt = 50528841u;
public const val `OID_FDDI_MAC_SHORT_GRP_ADDRESS`: UInt = 50528815u;
public const val `OID_FDDI_MAC_SMT_ADDRESS`: UInt = 50528813u;
public const val `OID_FDDI_MAC_TOKEN_CT`: UInt = 50528830u;
public const val `OID_FDDI_MAC_TRANSMIT_CT`: UInt = 50528829u;
public const val `OID_FDDI_MAC_TVX_CAPABILITY`: UInt = 50528802u;
public const val `OID_FDDI_MAC_TVX_EXPIRED_CT`: UInt = 50528833u;
public const val `OID_FDDI_MAC_TVX_VALUE`: UInt = 50528819u;
public const val `OID_FDDI_MAC_T_MAX`: UInt = 50528818u;
public const val `OID_FDDI_MAC_T_MAX_CAPABILITY`: UInt = 50528801u;
public const val `OID_FDDI_MAC_T_NEG`: UInt = 50528817u;
public const val `OID_FDDI_MAC_T_PRI0`: UInt = 50528820u;
public const val `OID_FDDI_MAC_T_PRI1`: UInt = 50528821u;
public const val `OID_FDDI_MAC_T_PRI2`: UInt = 50528822u;
public const val `OID_FDDI_MAC_T_PRI3`: UInt = 50528823u;
public const val `OID_FDDI_MAC_T_PRI4`: UInt = 50528824u;
public const val `OID_FDDI_MAC_T_PRI5`: UInt = 50528825u;
public const val `OID_FDDI_MAC_T_PRI6`: UInt = 50528826u;
public const val `OID_FDDI_MAC_T_REQ`: UInt = 50528816u;
public const val `OID_FDDI_MAC_UNDA_FLAG`: UInt = 50528843u;
public const val `OID_FDDI_MAC_UPSTREAM_NBR`: UInt = 50528805u;
public const val `OID_FDDI_PATH_CONFIGURATION`: UInt = 50528854u;
public const val `OID_FDDI_PATH_INDEX`: UInt = 50528849u;
public const val `OID_FDDI_PATH_MAX_T_REQ`: UInt = 50528859u;
public const val `OID_FDDI_PATH_RING_LATENCY`: UInt = 50528850u;
public const val `OID_FDDI_PATH_SBA_AVAILABLE`: UInt = 50528856u;
public const val `OID_FDDI_PATH_SBA_OVERHEAD`: UInt = 50528853u;
public const val `OID_FDDI_PATH_SBA_PAYLOAD`: UInt = 50528852u;
public const val `OID_FDDI_PATH_TRACE_STATUS`: UInt = 50528851u;
public const val `OID_FDDI_PATH_TVX_LOWER_BOUND`: UInt = 50528857u;
public const val `OID_FDDI_PATH_T_MAX_LOWER_BOUND`: UInt = 50528858u;
public const val `OID_FDDI_PATH_T_R_MODE`: UInt = 50528855u;
public const val `OID_FDDI_PORT_ACTION`: UInt = 50528888u;
public const val `OID_FDDI_PORT_AVAILABLE_PATHS`: UInt = 50528867u;
public const val `OID_FDDI_PORT_BS_FLAG`: UInt = 50528873u;
public const val `OID_FDDI_PORT_CONNECTION_CAPABILITIES`: UInt = 50528870u;
public const val `OID_FDDI_PORT_CONNECTION_POLICIES`: UInt = 50528862u;
public const val `OID_FDDI_PORT_CONNNECT_STATE`: UInt = 50528882u;
public const val `OID_FDDI_PORT_CURRENT_PATH`: UInt = 50528864u;
public const val `OID_FDDI_PORT_EB_ERROR_CT`: UInt = 50528875u;
public const val `OID_FDDI_PORT_HARDWARE_PRESENT`: UInt = 50528886u;
public const val `OID_FDDI_PORT_INDEX`: UInt = 50528871u;
public const val `OID_FDDI_PORT_LCT_FAIL_CT`: UInt = 50528876u;
public const val `OID_FDDI_PORT_LEM_CT`: UInt = 50528879u;
public const val `OID_FDDI_PORT_LEM_REJECT_CT`: UInt = 50528878u;
public const val `OID_FDDI_PORT_LER_ALARM`: UInt = 50528881u;
public const val `OID_FDDI_PORT_LER_CUTOFF`: UInt = 50528880u;
public const val `OID_FDDI_PORT_LER_ESTIMATE`: UInt = 50528877u;
public const val `OID_FDDI_PORT_LER_FLAG`: UInt = 50528885u;
public const val `OID_FDDI_PORT_MAC_INDICATED`: UInt = 50528863u;
public const val `OID_FDDI_PORT_MAC_LOOP_TIME`: UInt = 50528868u;
public const val `OID_FDDI_PORT_MAC_PLACEMENT`: UInt = 50528866u;
public const val `OID_FDDI_PORT_MAINT_LS`: UInt = 50528872u;
public const val `OID_FDDI_PORT_MY_TYPE`: UInt = 50528860u;
public const val `OID_FDDI_PORT_NEIGHBOR_TYPE`: UInt = 50528861u;
public const val `OID_FDDI_PORT_PCM_STATE`: UInt = 50528883u;
public const val `OID_FDDI_PORT_PC_LS`: UInt = 50528874u;
public const val `OID_FDDI_PORT_PC_WITHHOLD`: UInt = 50528884u;
public const val `OID_FDDI_PORT_PMD_CLASS`: UInt = 50528869u;
public const val `OID_FDDI_PORT_REQUESTED_PATHS`: UInt = 50528865u;
public const val `OID_FDDI_RING_MGT_STATE`: UInt = 50462982u;
public const val `OID_FDDI_SHORT_CURRENT_ADDR`: UInt = 50397446u;
public const val `OID_FDDI_SHORT_MAX_LIST_SIZE`: UInt = 50397448u;
public const val `OID_FDDI_SHORT_MULTICAST_LIST`: UInt = 50397447u;
public const val `OID_FDDI_SHORT_PERMANENT_ADDR`: UInt = 50397445u;
public const val `OID_FDDI_SMT_AVAILABLE_PATHS`: UInt = 50528779u;
public const val `OID_FDDI_SMT_BYPASS_PRESENT`: UInt = 50528788u;
public const val `OID_FDDI_SMT_CF_STATE`: UInt = 50528790u;
public const val `OID_FDDI_SMT_CONFIG_CAPABILITIES`: UInt = 50528780u;
public const val `OID_FDDI_SMT_CONFIG_POLICY`: UInt = 50528781u;
public const val `OID_FDDI_SMT_CONNECTION_POLICY`: UInt = 50528782u;
public const val `OID_FDDI_SMT_ECM_STATE`: UInt = 50528789u;
public const val `OID_FDDI_SMT_HI_VERSION_ID`: UInt = 50528771u;
public const val `OID_FDDI_SMT_HOLD_STATE`: UInt = 50528791u;
public const val `OID_FDDI_SMT_LAST_SET_STATION_ID`: UInt = 50528798u;
public const val `OID_FDDI_SMT_LO_VERSION_ID`: UInt = 50528772u;
public const val `OID_FDDI_SMT_MAC_CT`: UInt = 50528776u;
public const val `OID_FDDI_SMT_MAC_INDEXES`: UInt = 50528787u;
public const val `OID_FDDI_SMT_MANUFACTURER_DATA`: UInt = 50528773u;
public const val `OID_FDDI_SMT_MASTER_CT`: UInt = 50528778u;
public const val `OID_FDDI_SMT_MIB_VERSION_ID`: UInt = 50528775u;
public const val `OID_FDDI_SMT_MSG_TIME_STAMP`: UInt = 50528795u;
public const val `OID_FDDI_SMT_NON_MASTER_CT`: UInt = 50528777u;
public const val `OID_FDDI_SMT_OP_VERSION_ID`: UInt = 50528770u;
public const val `OID_FDDI_SMT_PEER_WRAP_FLAG`: UInt = 50528794u;
public const val `OID_FDDI_SMT_PORT_INDEXES`: UInt = 50528786u;
public const val `OID_FDDI_SMT_REMOTE_DISCONNECT_FLAG`: UInt = 50528792u;
public const val `OID_FDDI_SMT_SET_COUNT`: UInt = 50528797u;
public const val `OID_FDDI_SMT_STATION_ACTION`: UInt = 50528887u;
public const val `OID_FDDI_SMT_STATION_ID`: UInt = 50528769u;
public const val `OID_FDDI_SMT_STATION_STATUS`: UInt = 50528793u;
public const val `OID_FDDI_SMT_STAT_RPT_POLICY`: UInt = 50528784u;
public const val `OID_FDDI_SMT_TRACE_MAX_EXPIRATION`: UInt = 50528785u;
public const val `OID_FDDI_SMT_TRANSITION_TIME_STAMP`: UInt = 50528796u;
public const val `OID_FDDI_SMT_T_NOTIFY`: UInt = 50528783u;
public const val `OID_FDDI_SMT_USER_DATA`: UInt = 50528774u;
public const val `OID_FDDI_UPSTREAM_NODE_LONG`: UInt = 50462978u;
public const val `OID_FFP_ADAPTER_STATS`: UInt = 4227990033u;
public const val `OID_FFP_CONTROL`: UInt = 4227924498u;
public const val `OID_FFP_DATA`: UInt = 4227924500u;
public const val `OID_FFP_DRIVER_STATS`: UInt = 4227990032u;
public const val `OID_FFP_FLUSH`: UInt = 4227924497u;
public const val `OID_FFP_PARAMS`: UInt = 4227924499u;
public const val `OID_FFP_SUPPORT`: UInt = 4227924496u;
public const val `OID_GEN_ADMIN_STATUS`: UInt = 66184u;
public const val `OID_GEN_ALIAS`: UInt = 66185u;
public const val `OID_GEN_BROADCAST_BYTES_RCV`: UInt = 131595u;
public const val `OID_GEN_BROADCAST_BYTES_XMIT`: UInt = 131589u;
public const val `OID_GEN_BROADCAST_FRAMES_RCV`: UInt = 131596u;
public const val `OID_GEN_BROADCAST_FRAMES_XMIT`: UInt = 131590u;
public const val `OID_GEN_BYTES_RCV`: UInt = 131609u;
public const val `OID_GEN_BYTES_XMIT`: UInt = 131610u;
public const val `OID_GEN_CO_BYTES_RCV`: UInt = 131591u;
public const val `OID_GEN_CO_BYTES_XMIT`: UInt = 131585u;
public const val `OID_GEN_CO_BYTES_XMIT_OUTSTANDING`: UInt = 131617u;
public const val `OID_GEN_CO_DEVICE_PROFILE`: UInt = 131602u;
public const val `OID_GEN_CO_DRIVER_VERSION`: UInt = 65808u;
public const val `OID_GEN_CO_GET_NETCARD_TIME`: UInt = 131600u;
public const val `OID_GEN_CO_GET_TIME_CAPS`: UInt = 131599u;
public const val `OID_GEN_CO_HARDWARE_STATUS`: UInt = 65794u;
public const val `OID_GEN_CO_LINK_SPEED`: UInt = 65799u;
public const val `OID_GEN_CO_MAC_OPTIONS`: UInt = 65811u;
public const val `OID_GEN_CO_MEDIA_CONNECT_STATUS`: UInt = 65812u;
public const val `OID_GEN_CO_MEDIA_IN_USE`: UInt = 65796u;
public const val `OID_GEN_CO_MEDIA_SUPPORTED`: UInt = 65795u;
public const val `OID_GEN_CO_MINIMUM_LINK_SPEED`: UInt = 131360u;
public const val `OID_GEN_CO_NETCARD_LOAD`: UInt = 131601u;
public const val `OID_GEN_CO_PROTOCOL_OPTIONS`: UInt = 65810u;
public const val `OID_GEN_CO_RCV_CRC_ERROR`: UInt = 131597u;
public const val `OID_GEN_CO_RCV_PDUS_ERROR`: UInt = 131332u;
public const val `OID_GEN_CO_RCV_PDUS_NO_BUFFER`: UInt = 131333u;
public const val `OID_GEN_CO_RCV_PDUS_OK`: UInt = 131330u;
public const val `OID_GEN_CO_SUPPORTED_GUIDS`: UInt = 65815u;
public const val `OID_GEN_CO_SUPPORTED_LIST`: UInt = 65793u;
public const val `OID_GEN_CO_TRANSMIT_QUEUE_LENGTH`: UInt = 131598u;
public const val `OID_GEN_CO_VENDOR_DESCRIPTION`: UInt = 65805u;
public const val `OID_GEN_CO_VENDOR_DRIVER_VERSION`: UInt = 65814u;
public const val `OID_GEN_CO_VENDOR_ID`: UInt = 65804u;
public const val `OID_GEN_CO_XMIT_PDUS_ERROR`: UInt = 131331u;
public const val `OID_GEN_CO_XMIT_PDUS_OK`: UInt = 131329u;
public const val `OID_GEN_CURRENT_LOOKAHEAD`: UInt = 65807u;
public const val `OID_GEN_CURRENT_PACKET_FILTER`: UInt = 65806u;
public const val `OID_GEN_DEVICE_PROFILE`: UInt = 131602u;
public const val `OID_GEN_DIRECTED_BYTES_RCV`: UInt = 131591u;
public const val `OID_GEN_DIRECTED_BYTES_XMIT`: UInt = 131585u;
public const val `OID_GEN_DIRECTED_FRAMES_RCV`: UInt = 131592u;
public const val `OID_GEN_DIRECTED_FRAMES_XMIT`: UInt = 131586u;
public const val `OID_GEN_DISCONTINUITY_TIME`: UInt = 66178u;
public const val `OID_GEN_DRIVER_VERSION`: UInt = 65808u;
public const val `OID_GEN_ENUMERATE_PORTS`: UInt = 66061u;
public const val `OID_GEN_FRIENDLY_NAME`: UInt = 131606u;
public const val `OID_GEN_GET_NETCARD_TIME`: UInt = 131600u;
public const val `OID_GEN_GET_TIME_CAPS`: UInt = 131599u;
public const val `OID_GEN_HARDWARE_STATUS`: UInt = 65794u;
public const val `OID_GEN_HD_SPLIT_CURRENT_CONFIG`: UInt = 66080u;
public const val `OID_GEN_HD_SPLIT_PARAMETERS`: UInt = 66078u;
public const val `OID_GEN_INIT_TIME_MS`: UInt = 131603u;
public const val `OID_GEN_INTERFACE_INFO`: UInt = 66183u;
public const val `OID_GEN_INTERRUPT_MODERATION`: UInt = 66057u;
public const val `OID_GEN_IP_OPER_STATUS`: UInt = 66189u;
public const val `OID_GEN_ISOLATION_PARAMETERS`: UInt = 66304u;
public const val `OID_GEN_LAST_CHANGE`: UInt = 66177u;
public const val `OID_GEN_LINK_PARAMETERS`: UInt = 66056u;
public const val `OID_GEN_LINK_SPEED`: UInt = 65799u;
public const val `OID_GEN_LINK_SPEED_EX`: UInt = 66187u;
public const val `OID_GEN_LINK_STATE`: UInt = 66055u;
public const val `OID_GEN_MACHINE_NAME`: UInt = 66074u;
public const val `OID_GEN_MAC_ADDRESS`: UInt = 66053u;
public const val `OID_GEN_MAC_OPTIONS`: UInt = 65811u;
public const val `OID_GEN_MAXIMUM_FRAME_SIZE`: UInt = 65798u;
public const val `OID_GEN_MAXIMUM_LOOKAHEAD`: UInt = 65797u;
public const val `OID_GEN_MAXIMUM_SEND_PACKETS`: UInt = 65813u;
public const val `OID_GEN_MAXIMUM_TOTAL_SIZE`: UInt = 65809u;
public const val `OID_GEN_MAX_LINK_SPEED`: UInt = 66054u;
public const val `OID_GEN_MEDIA_CAPABILITIES`: UInt = 66049u;
public const val `OID_GEN_MEDIA_CONNECT_STATUS`: UInt = 65812u;
public const val `OID_GEN_MEDIA_CONNECT_STATUS_EX`: UInt = 66186u;
public const val `OID_GEN_MEDIA_DUPLEX_STATE`: UInt = 66188u;
public const val `OID_GEN_MEDIA_IN_USE`: UInt = 65796u;
public const val `OID_GEN_MEDIA_SENSE_COUNTS`: UInt = 131605u;
public const val `OID_GEN_MEDIA_SUPPORTED`: UInt = 65795u;
public const val `OID_GEN_MINIPORT_RESTART_ATTRIBUTES`: UInt = 66077u;
public const val `OID_GEN_MULTICAST_BYTES_RCV`: UInt = 131593u;
public const val `OID_GEN_MULTICAST_BYTES_XMIT`: UInt = 131587u;
public const val `OID_GEN_MULTICAST_FRAMES_RCV`: UInt = 131594u;
public const val `OID_GEN_MULTICAST_FRAMES_XMIT`: UInt = 131588u;
public const val `OID_GEN_NDIS_RESERVED_1`: UInt = 131607u;
public const val `OID_GEN_NDIS_RESERVED_2`: UInt = 131608u;
public const val `OID_GEN_NDIS_RESERVED_3`: UInt = 66058u;
public const val `OID_GEN_NDIS_RESERVED_4`: UInt = 66059u;
public const val `OID_GEN_NDIS_RESERVED_5`: UInt = 66060u;
public const val `OID_GEN_NDIS_RESERVED_6`: UInt = 66066u;
public const val `OID_GEN_NDIS_RESERVED_7`: UInt = 131614u;
public const val `OID_GEN_NETCARD_LOAD`: UInt = 131601u;
public const val `OID_GEN_NETWORK_LAYER_ADDRESSES`: UInt = 65816u;
public const val `OID_GEN_OPERATIONAL_STATUS`: UInt = 66179u;
public const val `OID_GEN_PCI_DEVICE_CUSTOM_PROPERTIES`: UInt = 66065u;
public const val `OID_GEN_PHYSICAL_MEDIUM`: UInt = 66050u;
public const val `OID_GEN_PHYSICAL_MEDIUM_EX`: UInt = 66067u;
public const val `OID_GEN_PORT_AUTHENTICATION_PARAMETERS`: UInt = 66063u;
public const val `OID_GEN_PORT_STATE`: UInt = 66062u;
public const val `OID_GEN_PROMISCUOUS_MODE`: UInt = 66176u;
public const val `OID_GEN_PROTOCOL_OPTIONS`: UInt = 65810u;
public const val `OID_GEN_RCV_CRC_ERROR`: UInt = 131597u;
public const val `OID_GEN_RCV_DISCARDS`: UInt = 131611u;
public const val `OID_GEN_RCV_ERROR`: UInt = 131332u;
public const val `OID_GEN_RCV_LINK_SPEED`: UInt = 66181u;
public const val `OID_GEN_RCV_NO_BUFFER`: UInt = 131333u;
public const val `OID_GEN_RCV_OK`: UInt = 131330u;
public const val `OID_GEN_RECEIVE_BLOCK_SIZE`: UInt = 65803u;
public const val `OID_GEN_RECEIVE_BUFFER_SPACE`: UInt = 65801u;
public const val `OID_GEN_RECEIVE_HASH`: UInt = 66079u;
public const val `OID_GEN_RECEIVE_SCALE_CAPABILITIES`: UInt = 66051u;
public const val `OID_GEN_RECEIVE_SCALE_PARAMETERS`: UInt = 66052u;
public const val `OID_GEN_RECEIVE_SCALE_PARAMETERS_V2`: UInt = 66068u;
public const val `OID_GEN_RESET_COUNTS`: UInt = 131604u;
public const val `OID_GEN_RNDIS_CONFIG_PARAMETER`: UInt = 66075u;
public const val `OID_GEN_RSS_SET_INDIRECTION_TABLE_ENTRIES`: UInt = 66240u;
public const val `OID_GEN_STATISTICS`: UInt = 131334u;
public const val `OID_GEN_SUPPORTED_GUIDS`: UInt = 65815u;
public const val `OID_GEN_SUPPORTED_LIST`: UInt = 65793u;
public const val `OID_GEN_TIMEOUT_DPC_REQUEST_CAPABILITIES`: UInt = 66064u;
public const val `OID_GEN_TRANSMIT_BLOCK_SIZE`: UInt = 65802u;
public const val `OID_GEN_TRANSMIT_BUFFER_SPACE`: UInt = 65800u;
public const val `OID_GEN_TRANSMIT_QUEUE_LENGTH`: UInt = 131598u;
public const val `OID_GEN_TRANSPORT_HEADER_OFFSET`: UInt = 65817u;
public const val `OID_GEN_UNKNOWN_PROTOS`: UInt = 66182u;
public const val `OID_GEN_VENDOR_DESCRIPTION`: UInt = 65805u;
public const val `OID_GEN_VENDOR_DRIVER_VERSION`: UInt = 65814u;
public const val `OID_GEN_VENDOR_ID`: UInt = 65804u;
public const val `OID_GEN_VLAN_ID`: UInt = 66076u;
public const val `OID_GEN_XMIT_DISCARDS`: UInt = 131612u;
public const val `OID_GEN_XMIT_ERROR`: UInt = 131331u;
public const val `OID_GEN_XMIT_LINK_SPEED`: UInt = 66180u;
public const val `OID_GEN_XMIT_OK`: UInt = 131329u;
public const val `OID_GFT_ACTIVATE_FLOW_ENTRIES`: UInt = 66575u;
public const val `OID_GFT_ADD_FLOW_ENTRIES`: UInt = 66572u;
public const val `OID_GFT_ALLOCATE_COUNTERS`: UInt = 66567u;
public const val `OID_GFT_COUNTER_VALUES`: UInt = 66570u;
public const val `OID_GFT_CREATE_LOGICAL_VPORT`: UInt = 66584u;
public const val `OID_GFT_CREATE_TABLE`: UInt = 66564u;
public const val `OID_GFT_CURRENT_CAPABILITIES`: UInt = 66562u;
public const val `OID_GFT_DEACTIVATE_FLOW_ENTRIES`: UInt = 66576u;
public const val `OID_GFT_DELETE_FLOW_ENTRIES`: UInt = 66573u;
public const val `OID_GFT_DELETE_LOGICAL_VPORT`: UInt = 66585u;
public const val `OID_GFT_DELETE_PROFILE`: UInt = 66582u;
public const val `OID_GFT_DELETE_TABLE`: UInt = 66565u;
public const val `OID_GFT_ENUM_COUNTERS`: UInt = 66569u;
public const val `OID_GFT_ENUM_FLOW_ENTRIES`: UInt = 66574u;
public const val `OID_GFT_ENUM_LOGICAL_VPORTS`: UInt = 66586u;
public const val `OID_GFT_ENUM_PROFILES`: UInt = 66581u;
public const val `OID_GFT_ENUM_TABLES`: UInt = 66566u;
public const val `OID_GFT_EXACT_MATCH_PROFILE`: UInt = 66578u;
public const val `OID_GFT_FLOW_ENTRY_PARAMETERS`: UInt = 66577u;
public const val `OID_GFT_FREE_COUNTERS`: UInt = 66568u;
public const val `OID_GFT_GLOBAL_PARAMETERS`: UInt = 66563u;
public const val `OID_GFT_HARDWARE_CAPABILITIES`: UInt = 66561u;
public const val `OID_GFT_HEADER_TRANSPOSITION_PROFILE`: UInt = 66579u;
public const val `OID_GFT_STATISTICS`: UInt = 66571u;
public const val `OID_GFT_VPORT_PARAMETERS`: UInt = 66583u;
public const val `OID_GFT_WILDCARD_MATCH_PROFILE`: UInt = 66580u;
public const val `OID_IP4_OFFLOAD_STATS`: UInt = 4227924489u;
public const val `OID_IP6_OFFLOAD_STATS`: UInt = 4227924490u;
public const val `OID_IRDA_EXTRA_RCV_BOFS`: UInt = 167838208u;
public const val `OID_IRDA_LINK_SPEED`: UInt = 167837955u;
public const val `OID_IRDA_MAX_RECEIVE_WINDOW_SIZE`: UInt = 167838212u;
public const val `OID_IRDA_MAX_SEND_WINDOW_SIZE`: UInt = 167838213u;
public const val `OID_IRDA_MAX_UNICAST_LIST_SIZE`: UInt = 167838211u;
public const val `OID_IRDA_MEDIA_BUSY`: UInt = 167837956u;
public const val `OID_IRDA_RATE_SNIFF`: UInt = 167838209u;
public const val `OID_IRDA_RECEIVING`: UInt = 167837952u;
public const val `OID_IRDA_RESERVED1`: UInt = 167838218u;
public const val `OID_IRDA_RESERVED2`: UInt = 167838223u;
public const val `OID_IRDA_SUPPORTED_SPEEDS`: UInt = 167837954u;
public const val `OID_IRDA_TURNAROUND_TIME`: UInt = 167837953u;
public const val `OID_IRDA_UNICAST_LIST`: UInt = 167838210u;
public const val `OID_KDNET_ADD_PF`: UInt = 131619u;
public const val `OID_KDNET_ENUMERATE_PFS`: UInt = 131618u;
public const val `OID_KDNET_QUERY_PF_INFORMATION`: UInt = 131621u;
public const val `OID_KDNET_REMOVE_PF`: UInt = 131620u;
public const val `OID_LTALK_COLLISIONS`: UInt = 84017666u;
public const val `OID_LTALK_CURRENT_NODE_ID`: UInt = 83951874u;
public const val `OID_LTALK_DEFERS`: UInt = 84017667u;
public const val `OID_LTALK_FCS_ERRORS`: UInt = 84017670u;
public const val `OID_LTALK_IN_BROADCASTS`: UInt = 84017409u;
public const val `OID_LTALK_IN_LENGTH_ERRORS`: UInt = 84017410u;
public const val `OID_LTALK_NO_DATA_ERRORS`: UInt = 84017668u;
public const val `OID_LTALK_OUT_NO_HANDLERS`: UInt = 84017665u;
public const val `OID_LTALK_RANDOM_CTS_ERRORS`: UInt = 84017669u;
public const val `OID_NDK_CONNECTIONS`: UInt = 4228121091u;
public const val `OID_NDK_LOCAL_ENDPOINTS`: UInt = 4228121092u;
public const val `OID_NDK_SET_STATE`: UInt = 4228121089u;
public const val `OID_NDK_STATISTICS`: UInt = 4228121090u;
public const val `OID_NIC_SWITCH_ALLOCATE_VF`: UInt = 66117u;
public const val `OID_NIC_SWITCH_CREATE_SWITCH`: UInt = 66103u;
public const val `OID_NIC_SWITCH_CREATE_VPORT`: UInt = 66113u;
public const val `OID_NIC_SWITCH_CURRENT_CAPABILITIES`: UInt = 66095u;
public const val `OID_NIC_SWITCH_DELETE_SWITCH`: UInt = 66105u;
public const val `OID_NIC_SWITCH_DELETE_VPORT`: UInt = 66116u;
public const val `OID_NIC_SWITCH_ENUM_SWITCHES`: UInt = 66112u;
public const val `OID_NIC_SWITCH_ENUM_VFS`: UInt = 66120u;
public const val `OID_NIC_SWITCH_ENUM_VPORTS`: UInt = 66115u;
public const val `OID_NIC_SWITCH_FREE_VF`: UInt = 66118u;
public const val `OID_NIC_SWITCH_HARDWARE_CAPABILITIES`: UInt = 66094u;
public const val `OID_NIC_SWITCH_PARAMETERS`: UInt = 66104u;
public const val `OID_NIC_SWITCH_VF_PARAMETERS`: UInt = 66119u;
public const val `OID_NIC_SWITCH_VPORT_PARAMETERS`: UInt = 66114u;
public const val `OID_OFFLOAD_ENCAPSULATION`: UInt = 16843018u;
public const val `OID_PACKET_COALESCING_FILTER_MATCH_COUNT`: UInt = 66101u;
public const val `OID_PD_CLOSE_PROVIDER`: UInt = 66818u;
public const val `OID_PD_OPEN_PROVIDER`: UInt = 66817u;
public const val `OID_PD_QUERY_CURRENT_CONFIG`: UInt = 66819u;
public const val `OID_PM_ADD_PROTOCOL_OFFLOAD`: UInt = 4244701453u;
public const val `OID_PM_ADD_WOL_PATTERN`: UInt = 4244701450u;
public const val `OID_PM_CURRENT_CAPABILITIES`: UInt = 4244701447u;
public const val `OID_PM_GET_PROTOCOL_OFFLOAD`: UInt = 4244701454u;
public const val `OID_PM_HARDWARE_CAPABILITIES`: UInt = 4244701448u;
public const val `OID_PM_PARAMETERS`: UInt = 4244701449u;
public const val `OID_PM_PROTOCOL_OFFLOAD_LIST`: UInt = 4244701456u;
public const val `OID_PM_REMOVE_PROTOCOL_OFFLOAD`: UInt = 4244701455u;
public const val `OID_PM_REMOVE_WOL_PATTERN`: UInt = 4244701451u;
public const val `OID_PM_RESERVED_1`: UInt = 4244701457u;
public const val `OID_PM_WOL_PATTERN_LIST`: UInt = 4244701452u;
public const val `OID_PNP_ADD_WAKE_UP_PATTERN`: UInt = 4244701443u;
public const val `OID_PNP_CAPABILITIES`: UInt = 4244701440u;
public const val `OID_PNP_ENABLE_WAKE_UP`: UInt = 4244701446u;
public const val `OID_PNP_QUERY_POWER`: UInt = 4244701442u;
public const val `OID_PNP_REMOVE_WAKE_UP_PATTERN`: UInt = 4244701444u;
public const val `OID_PNP_SET_POWER`: UInt = 4244701441u;
public const val `OID_PNP_WAKE_UP_ERROR`: UInt = 4244767233u;
public const val `OID_PNP_WAKE_UP_OK`: UInt = 4244767232u;
public const val `OID_PNP_WAKE_UP_PATTERN_LIST`: UInt = 4244701445u;
public const val `OID_QOS_CURRENT_CAPABILITIES`: UInt = 4228186114u;
public const val `OID_QOS_HARDWARE_CAPABILITIES`: UInt = 4228186113u;
public const val `OID_QOS_OFFLOAD_CREATE_SQ`: UInt = 67075u;
public const val `OID_QOS_OFFLOAD_CURRENT_CAPABILITIES`: UInt = 67074u;
public const val `OID_QOS_OFFLOAD_DELETE_SQ`: UInt = 67076u;
public const val `OID_QOS_OFFLOAD_ENUM_SQS`: UInt = 67078u;
public const val `OID_QOS_OFFLOAD_HARDWARE_CAPABILITIES`: UInt = 67073u;
public const val `OID_QOS_OFFLOAD_SQ_STATS`: UInt = 67079u;
public const val `OID_QOS_OFFLOAD_UPDATE_SQ`: UInt = 67077u;
public const val `OID_QOS_OPERATIONAL_PARAMETERS`: UInt = 4228186116u;
public const val `OID_QOS_PARAMETERS`: UInt = 4228186115u;
public const val `OID_QOS_REMOTE_PARAMETERS`: UInt = 4228186117u;
public const val `OID_QOS_RESERVED1`: UInt = 4211147008u;
public const val `OID_QOS_RESERVED10`: UInt = 4211147017u;
public const val `OID_QOS_RESERVED11`: UInt = 4211147018u;
public const val `OID_QOS_RESERVED12`: UInt = 4211147019u;
public const val `OID_QOS_RESERVED13`: UInt = 4211147020u;
public const val `OID_QOS_RESERVED14`: UInt = 4211147021u;
public const val `OID_QOS_RESERVED15`: UInt = 4211147022u;
public const val `OID_QOS_RESERVED16`: UInt = 4211147023u;
public const val `OID_QOS_RESERVED17`: UInt = 4211147024u;
public const val `OID_QOS_RESERVED18`: UInt = 4211147025u;
public const val `OID_QOS_RESERVED19`: UInt = 4211147026u;
public const val `OID_QOS_RESERVED2`: UInt = 4211147009u;
public const val `OID_QOS_RESERVED20`: UInt = 4211147027u;
public const val `OID_QOS_RESERVED3`: UInt = 4211147010u;
public const val `OID_QOS_RESERVED4`: UInt = 4211147011u;
public const val `OID_QOS_RESERVED5`: UInt = 4211147012u;
public const val `OID_QOS_RESERVED6`: UInt = 4211147013u;
public const val `OID_QOS_RESERVED7`: UInt = 4211147014u;
public const val `OID_QOS_RESERVED8`: UInt = 4211147015u;
public const val `OID_QOS_RESERVED9`: UInt = 4211147016u;
public const val `OID_RECEIVE_FILTER_ALLOCATE_QUEUE`: UInt = 66083u;
public const val `OID_RECEIVE_FILTER_CLEAR_FILTER`: UInt = 66088u;
public const val `OID_RECEIVE_FILTER_CURRENT_CAPABILITIES`: UInt = 66093u;
public const val `OID_RECEIVE_FILTER_ENUM_FILTERS`: UInt = 66089u;
public const val `OID_RECEIVE_FILTER_ENUM_QUEUES`: UInt = 66085u;
public const val `OID_RECEIVE_FILTER_FREE_QUEUE`: UInt = 66084u;
public const val `OID_RECEIVE_FILTER_GLOBAL_PARAMETERS`: UInt = 66082u;
public const val `OID_RECEIVE_FILTER_HARDWARE_CAPABILITIES`: UInt = 66081u;
public const val `OID_RECEIVE_FILTER_MOVE_FILTER`: UInt = 66096u;
public const val `OID_RECEIVE_FILTER_PARAMETERS`: UInt = 66090u;
public const val `OID_RECEIVE_FILTER_QUEUE_ALLOCATION_COMPLETE`: UInt = 66091u;
public const val `OID_RECEIVE_FILTER_QUEUE_PARAMETERS`: UInt = 66086u;
public const val `OID_RECEIVE_FILTER_SET_FILTER`: UInt = 66087u;
public const val `OID_SRIOV_BAR_RESOURCES`: UInt = 66137u;
public const val `OID_SRIOV_CONFIG_STATE`: UInt = 66145u;
public const val `OID_SRIOV_CURRENT_CAPABILITIES`: UInt = 66128u;
public const val `OID_SRIOV_HARDWARE_CAPABILITIES`: UInt = 66121u;
public const val `OID_SRIOV_OVERLYING_ADAPTER_INFO`: UInt = 66152u;
public const val `OID_SRIOV_PF_LUID`: UInt = 66144u;
public const val `OID_SRIOV_PROBED_BARS`: UInt = 66136u;
public const val `OID_SRIOV_READ_VF_CONFIG_BLOCK`: UInt = 66131u;
public const val `OID_SRIOV_READ_VF_CONFIG_SPACE`: UInt = 66129u;
public const val `OID_SRIOV_RESET_VF`: UInt = 66133u;
public const val `OID_SRIOV_SET_VF_POWER_STATE`: UInt = 66134u;
public const val `OID_SRIOV_VF_INVALIDATE_CONFIG_BLOCK`: UInt = 66153u;
public const val `OID_SRIOV_VF_SERIAL_NUMBER`: UInt = 66146u;
public const val `OID_SRIOV_VF_VENDOR_DEVICE_ID`: UInt = 66135u;
public const val `OID_SRIOV_WRITE_VF_CONFIG_BLOCK`: UInt = 66132u;
public const val `OID_SRIOV_WRITE_VF_CONFIG_SPACE`: UInt = 66130u;
public const val `OID_SWITCH_FEATURE_STATUS_QUERY`: UInt = 66151u;
public const val `OID_SWITCH_NIC_ARRAY`: UInt = 66167u;
public const val `OID_SWITCH_NIC_CONNECT`: UInt = 66171u;
public const val `OID_SWITCH_NIC_CREATE`: UInt = 66170u;
public const val `OID_SWITCH_NIC_DELETE`: UInt = 66173u;
public const val `OID_SWITCH_NIC_DIRECT_REQUEST`: UInt = 66198u;
public const val `OID_SWITCH_NIC_DISCONNECT`: UInt = 66172u;
public const val `OID_SWITCH_NIC_REQUEST`: UInt = 66160u;
public const val `OID_SWITCH_NIC_RESTORE`: UInt = 66194u;
public const val `OID_SWITCH_NIC_RESTORE_COMPLETE`: UInt = 66195u;
public const val `OID_SWITCH_NIC_RESUME`: UInt = 66200u;
public const val `OID_SWITCH_NIC_SAVE`: UInt = 66192u;
public const val `OID_SWITCH_NIC_SAVE_COMPLETE`: UInt = 66193u;
public const val `OID_SWITCH_NIC_SUSPEND`: UInt = 66199u;
public const val `OID_SWITCH_NIC_SUSPENDED_LM_SOURCE_FINISHED`: UInt = 66202u;
public const val `OID_SWITCH_NIC_SUSPENDED_LM_SOURCE_STARTED`: UInt = 66201u;
public const val `OID_SWITCH_NIC_UPDATED`: UInt = 66196u;
public const val `OID_SWITCH_PARAMETERS`: UInt = 66165u;
public const val `OID_SWITCH_PORT_ARRAY`: UInt = 66166u;
public const val `OID_SWITCH_PORT_CREATE`: UInt = 66168u;
public const val `OID_SWITCH_PORT_DELETE`: UInt = 66169u;
public const val `OID_SWITCH_PORT_FEATURE_STATUS_QUERY`: UInt = 66174u;
public const val `OID_SWITCH_PORT_PROPERTY_ADD`: UInt = 66161u;
public const val `OID_SWITCH_PORT_PROPERTY_DELETE`: UInt = 66163u;
public const val `OID_SWITCH_PORT_PROPERTY_ENUM`: UInt = 66164u;
public const val `OID_SWITCH_PORT_PROPERTY_UPDATE`: UInt = 66162u;
public const val `OID_SWITCH_PORT_TEARDOWN`: UInt = 66175u;
public const val `OID_SWITCH_PORT_UPDATED`: UInt = 66197u;
public const val `OID_SWITCH_PROPERTY_ADD`: UInt = 66147u;
public const val `OID_SWITCH_PROPERTY_DELETE`: UInt = 66149u;
public const val `OID_SWITCH_PROPERTY_ENUM`: UInt = 66150u;
public const val `OID_SWITCH_PROPERTY_UPDATE`: UInt = 66148u;
public const val `OID_TAPI_ACCEPT`: UInt = 117637377u;
public const val `OID_TAPI_ANSWER`: UInt = 117637378u;
public const val `OID_TAPI_CLOSE`: UInt = 117637379u;
public const val `OID_TAPI_CLOSE_CALL`: UInt = 117637380u;
public const val `OID_TAPI_CONDITIONAL_MEDIA_DETECTION`: UInt = 117637381u;
public const val `OID_TAPI_CONFIG_DIALOG`: UInt = 117637382u;
public const val `OID_TAPI_DEV_SPECIFIC`: UInt = 117637383u;
public const val `OID_TAPI_DIAL`: UInt = 117637384u;
public const val `OID_TAPI_DROP`: UInt = 117637385u;
public const val `OID_TAPI_GATHER_DIGITS`: UInt = 117637411u;
public const val `OID_TAPI_GET_ADDRESS_CAPS`: UInt = 117637386u;
public const val `OID_TAPI_GET_ADDRESS_ID`: UInt = 117637387u;
public const val `OID_TAPI_GET_ADDRESS_STATUS`: UInt = 117637388u;
public const val `OID_TAPI_GET_CALL_ADDRESS_ID`: UInt = 117637389u;
public const val `OID_TAPI_GET_CALL_INFO`: UInt = 117637390u;
public const val `OID_TAPI_GET_CALL_STATUS`: UInt = 117637391u;
public const val `OID_TAPI_GET_DEV_CAPS`: UInt = 117637392u;
public const val `OID_TAPI_GET_DEV_CONFIG`: UInt = 117637393u;
public const val `OID_TAPI_GET_EXTENSION_ID`: UInt = 117637394u;
public const val `OID_TAPI_GET_ID`: UInt = 117637395u;
public const val `OID_TAPI_GET_LINE_DEV_STATUS`: UInt = 117637396u;
public const val `OID_TAPI_MAKE_CALL`: UInt = 117637397u;
public const val `OID_TAPI_MONITOR_DIGITS`: UInt = 117637412u;
public const val `OID_TAPI_NEGOTIATE_EXT_VERSION`: UInt = 117637398u;
public const val `OID_TAPI_OPEN`: UInt = 117637399u;
public const val `OID_TAPI_PROVIDER_INITIALIZE`: UInt = 117637400u;
public const val `OID_TAPI_PROVIDER_SHUTDOWN`: UInt = 117637401u;
public const val `OID_TAPI_SECURE_CALL`: UInt = 117637402u;
public const val `OID_TAPI_SELECT_EXT_VERSION`: UInt = 117637403u;
public const val `OID_TAPI_SEND_USER_USER_INFO`: UInt = 117637404u;
public const val `OID_TAPI_SET_APP_SPECIFIC`: UInt = 117637405u;
public const val `OID_TAPI_SET_CALL_PARAMS`: UInt = 117637406u;
public const val `OID_TAPI_SET_DEFAULT_MEDIA_DETECTION`: UInt = 117637407u;
public const val `OID_TAPI_SET_DEV_CONFIG`: UInt = 117637408u;
public const val `OID_TAPI_SET_MEDIA_MODE`: UInt = 117637409u;
public const val `OID_TAPI_SET_STATUS_MESSAGES`: UInt = 117637410u;
public const val `OID_TCP4_OFFLOAD_STATS`: UInt = 4227924487u;
public const val `OID_TCP6_OFFLOAD_STATS`: UInt = 4227924488u;
public const val `OID_TCP_CONNECTION_OFFLOAD_CURRENT_CONFIG`: UInt = 4227924494u;
public const val `OID_TCP_CONNECTION_OFFLOAD_HARDWARE_CAPABILITIES`: UInt = 4227924495u;
public const val `OID_TCP_CONNECTION_OFFLOAD_PARAMETERS`: UInt = 4228055553u;
public const val `OID_TCP_OFFLOAD_CURRENT_CONFIG`: UInt = 4227924491u;
public const val `OID_TCP_OFFLOAD_HARDWARE_CAPABILITIES`: UInt = 4227924493u;
public const val `OID_TCP_OFFLOAD_PARAMETERS`: UInt = 4227924492u;
public const val `OID_TCP_RSC_STATISTICS`: UInt = 131613u;
public const val `OID_TCP_SAN_SUPPORT`: UInt = 4227924484u;
public const val `OID_TCP_TASK_IPSEC_ADD_SA`: UInt = 4227924482u;
public const val `OID_TCP_TASK_IPSEC_ADD_UDPESP_SA`: UInt = 4227924485u;
public const val `OID_TCP_TASK_IPSEC_DELETE_SA`: UInt = 4227924483u;
public const val `OID_TCP_TASK_IPSEC_DELETE_UDPESP_SA`: UInt = 4227924486u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_ADD_SA`: UInt = 4228055554u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_ADD_SA_EX`: UInt = 4228055557u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_DELETE_SA`: UInt = 4228055555u;
public const val `OID_TCP_TASK_IPSEC_OFFLOAD_V2_UPDATE_SA`: UInt = 4228055556u;
public const val `OID_TCP_TASK_OFFLOAD`: UInt = 4227924481u;
public const val `OID_TIMESTAMP_CAPABILITY`: UInt = 10485761u;
public const val `OID_TIMESTAMP_CURRENT_CONFIG`: UInt = 10485762u;
public const val `OID_TIMESTAMP_GET_CROSSTIMESTAMP`: UInt = 10485763u;
public const val `OID_TUNNEL_INTERFACE_RELEASE_OID`: UInt = 251724039u;
public const val `OID_TUNNEL_INTERFACE_SET_OID`: UInt = 251724038u;
public const val `OID_VLAN_RESERVED1`: UInt = 66097u;
public const val `OID_VLAN_RESERVED2`: UInt = 66098u;
public const val `OID_VLAN_RESERVED3`: UInt = 66099u;
public const val `OID_VLAN_RESERVED4`: UInt = 66100u;
public const val `OID_WAN_CO_GET_COMP_INFO`: UInt = 67175040u;
public const val `OID_WAN_CO_GET_INFO`: UInt = 67174784u;
public const val `OID_WAN_CO_GET_LINK_INFO`: UInt = 67174786u;
public const val `OID_WAN_CO_GET_STATS_INFO`: UInt = 67175042u;
public const val `OID_WAN_CO_SET_COMP_INFO`: UInt = 67175041u;
public const val `OID_WAN_CO_SET_LINK_INFO`: UInt = 67174785u;
public const val `OID_WAN_CURRENT_ADDRESS`: UInt = 67174658u;
public const val `OID_WAN_GET_BRIDGE_INFO`: UInt = 67174922u;
public const val `OID_WAN_GET_COMP_INFO`: UInt = 67174924u;
public const val `OID_WAN_GET_INFO`: UInt = 67174663u;
public const val `OID_WAN_GET_LINK_INFO`: UInt = 67174665u;
public const val `OID_WAN_GET_STATS_INFO`: UInt = 67174926u;
public const val `OID_WAN_HEADER_FORMAT`: UInt = 67174662u;
public const val `OID_WAN_LINE_COUNT`: UInt = 67174666u;
public const val `OID_WAN_MEDIUM_SUBTYPE`: UInt = 67174661u;
public const val `OID_WAN_PERMANENT_ADDRESS`: UInt = 67174657u;
public const val `OID_WAN_PROTOCOL_CAPS`: UInt = 67174667u;
public const val `OID_WAN_PROTOCOL_TYPE`: UInt = 67174660u;
public const val `OID_WAN_QUALITY_OF_SERVICE`: UInt = 67174659u;
public const val `OID_WAN_SET_BRIDGE_INFO`: UInt = 67174923u;
public const val `OID_WAN_SET_COMP_INFO`: UInt = 67174925u;
public const val `OID_WAN_SET_LINK_INFO`: UInt = 67174664u;
public const val `OID_WWAN_AUTH_CHALLENGE`: UInt = 234946837u;
public const val `OID_WWAN_BASE_STATIONS_INFO`: UInt = 234946888u;
public const val `OID_WWAN_CONNECT`: UInt = 234946828u;
public const val `OID_WWAN_CREATE_MAC`: UInt = 234946854u;
public const val `OID_WWAN_DELETE_MAC`: UInt = 234946855u;
public const val `OID_WWAN_DEVICE_BINDINGS`: UInt = 234946865u;
public const val `OID_WWAN_DEVICE_CAPS`: UInt = 234946817u;
public const val `OID_WWAN_DEVICE_CAPS_EX`: UInt = 234946862u;
public const val `OID_WWAN_DEVICE_RESET`: UInt = 234946887u;
public const val `OID_WWAN_DEVICE_SERVICE_COMMAND`: UInt = 234946840u;
public const val `OID_WWAN_DEVICE_SERVICE_SESSION`: UInt = 234946851u;
public const val `OID_WWAN_DEVICE_SERVICE_SESSION_WRITE`: UInt = 234946852u;
public const val `OID_WWAN_DRIVER_CAPS`: UInt = 234946816u;
public const val `OID_WWAN_ENUMERATE_DEVICE_SERVICES`: UInt = 234946838u;
public const val `OID_WWAN_ENUMERATE_DEVICE_SERVICE_COMMANDS`: UInt = 234946850u;
public const val `OID_WWAN_HOME_PROVIDER`: UInt = 234946822u;
public const val `OID_WWAN_IMS_VOICE_STATE`: UInt = 234946867u;
public const val `OID_WWAN_LOCATION_STATE`: UInt = 234946869u;
public const val `OID_WWAN_LTE_ATTACH_CONFIG`: UInt = 234946882u;
public const val `OID_WWAN_LTE_ATTACH_STATUS`: UInt = 234946883u;
public const val `OID_WWAN_MBIM_VERSION`: UInt = 234946860u;
public const val `OID_WWAN_MODEM_CONFIG_INFO`: UInt = 234946884u;
public const val `OID_WWAN_MODEM_LOGGING_CONFIG`: UInt = 234946891u;
public const val `OID_WWAN_MPDP`: UInt = 234946889u;
public const val `OID_WWAN_NETWORK_BLACKLIST`: UInt = 234946881u;
public const val `OID_WWAN_NETWORK_IDLE_HINT`: UInt = 234946871u;
public const val `OID_WWAN_NETWORK_PARAMS`: UInt = 234946893u;
public const val `OID_WWAN_NITZ`: UInt = 234946870u;
public const val `OID_WWAN_PACKET_SERVICE`: UInt = 234946826u;
public const val `OID_WWAN_PCO`: UInt = 234946885u;
public const val `OID_WWAN_PIN`: UInt = 234946820u;
public const val `OID_WWAN_PIN_EX`: UInt = 234946849u;
public const val `OID_WWAN_PIN_EX2`: UInt = 234946859u;
public const val `OID_WWAN_PIN_LIST`: UInt = 234946821u;
public const val `OID_WWAN_PREFERRED_MULTICARRIER_PROVIDERS`: UInt = 234946853u;
public const val `OID_WWAN_PREFERRED_PROVIDERS`: UInt = 234946823u;
public const val `OID_WWAN_PRESHUTDOWN`: UInt = 234946872u;
public const val `OID_WWAN_PROVISIONED_CONTEXTS`: UInt = 234946829u;
public const val `OID_WWAN_PS_MEDIA_CONFIG`: UInt = 234946878u;
public const val `OID_WWAN_RADIO_STATE`: UInt = 234946819u;
public const val `OID_WWAN_READY_INFO`: UInt = 234946818u;
public const val `OID_WWAN_REGISTER_PARAMS`: UInt = 234946892u;
public const val `OID_WWAN_REGISTER_STATE`: UInt = 234946825u;
public const val `OID_WWAN_REGISTER_STATE_EX`: UInt = 234946866u;
public const val `OID_WWAN_SAR_CONFIG`: UInt = 234946879u;
public const val `OID_WWAN_SAR_TRANSMISSION_STATUS`: UInt = 234946880u;
public const val `OID_WWAN_SERVICE_ACTIVATION`: UInt = 234946830u;
public const val `OID_WWAN_SIGNAL_STATE`: UInt = 234946827u;
public const val `OID_WWAN_SIGNAL_STATE_EX`: UInt = 234946868u;
public const val `OID_WWAN_SLOT_INFO_STATUS`: UInt = 234946864u;
public const val `OID_WWAN_SMS_CONFIGURATION`: UInt = 234946831u;
public const val `OID_WWAN_SMS_DELETE`: UInt = 234946834u;
public const val `OID_WWAN_SMS_READ`: UInt = 234946832u;
public const val `OID_WWAN_SMS_SEND`: UInt = 234946833u;
public const val `OID_WWAN_SMS_STATUS`: UInt = 234946835u;
public const val `OID_WWAN_SUBSCRIBE_DEVICE_SERVICE_EVENTS`: UInt = 234946839u;
public const val `OID_WWAN_SYS_CAPS`: UInt = 234946861u;
public const val `OID_WWAN_SYS_SLOTMAPPINGS`: UInt = 234946863u;
public const val `OID_WWAN_UE_POLICY`: UInt = 234946894u;
public const val `OID_WWAN_UICC_ACCESS_BINARY`: UInt = 234946857u;
public const val `OID_WWAN_UICC_ACCESS_RECORD`: UInt = 234946858u;
public const val `OID_WWAN_UICC_APDU`: UInt = 234946876u;
public const val `OID_WWAN_UICC_APP_LIST`: UInt = 234946890u;
public const val `OID_WWAN_UICC_ATR`: UInt = 234946873u;
public const val `OID_WWAN_UICC_CLOSE_CHANNEL`: UInt = 234946875u;
public const val `OID_WWAN_UICC_FILE_STATUS`: UInt = 234946856u;
public const val `OID_WWAN_UICC_OPEN_CHANNEL`: UInt = 234946874u;
public const val `OID_WWAN_UICC_RESET`: UInt = 234946886u;
public const val `OID_WWAN_UICC_TERMINAL_CAPABILITY`: UInt = 234946877u;
public const val `OID_WWAN_USSD`: UInt = 234946841u;
public const val `OID_WWAN_VENDOR_SPECIFIC`: UInt = 234946836u;
public const val `OID_WWAN_VISIBLE_PROVIDERS`: UInt = 234946824u;
public const val `OID_XBOX_ACC_RESERVED0`: UInt = 4194304000u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PMKID_CANDIDATE` (
    public var `BSSID`: UByteArray,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 3532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PMKID_CANDIDATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `READABLE_LOCAL_CLOCK`: UInt = 1u;
public const val `RECEIVE_TIME_INDICATION_CAPABLE`: UInt = 8u;
public const val `TIMED_SEND_CAPABLE`: UInt = 16u;
public const val `TIME_STAMP_CAPABLE`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSPORT_HEADER_OFFSET` (
    public var `ProtocolType`: UShort,
    public var `HeaderOffset`: UShort,
)
public typealias `TUNNEL_TYPE` = Int;
public const val `TUNNEL_TYPE_6TO4`: `TUNNEL_TYPE` = 11;
public const val `TUNNEL_TYPE_DIRECT`: `TUNNEL_TYPE` = 2;
public const val `TUNNEL_TYPE_IPHTTPS`: `TUNNEL_TYPE` = 15;
public const val `TUNNEL_TYPE_ISATAP`: `TUNNEL_TYPE` = 13;
public const val `TUNNEL_TYPE_NONE`: `TUNNEL_TYPE` = 0;
public const val `TUNNEL_TYPE_OTHER`: `TUNNEL_TYPE` = 1;
public const val `TUNNEL_TYPE_TEREDO`: `TUNNEL_TYPE` = 14;
public typealias `UDP_ENCAP_TYPE` = Int;
// UNSUPPORTED Rust 3556:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const UNSPECIFIED_NETWORK_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x12ba5bde_143e_4c0d_b66d_2379bb141913);

public const val `WAN_PROTOCOL_KEEPS_STATS`: UInt = 1u;
public const val `fNDIS_GUID_ALLOW_READ`: UInt = 32u;
public const val `fNDIS_GUID_ALLOW_WRITE`: UInt = 64u;
public const val `fNDIS_GUID_ANSI_STRING`: UInt = 4u;
public const val `fNDIS_GUID_ARRAY`: UInt = 16u;
public const val `fNDIS_GUID_METHOD`: UInt = 128u;
public const val `fNDIS_GUID_NDIS_RESERVED`: UInt = 256u;
public const val `fNDIS_GUID_SUPPORT_COMMON_HEADER`: UInt = 512u;
public const val `fNDIS_GUID_TO_OID`: UInt = 1u;
public const val `fNDIS_GUID_TO_STATUS`: UInt = 2u;
public const val `fNDIS_GUID_UNICODE_STRING`: UInt = 8u;
