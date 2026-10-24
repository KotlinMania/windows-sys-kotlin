// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `ApplicationSelected`: `SECURE_ELEMENT_EVENT_TYPE` = 2;
public const val `ConnectionOriented`: `NFC_LLCP_SOCKET_TYPE` = 0;
public const val `Connectionless`: `NFC_LLCP_SOCKET_TYPE` = 1;
public const val `DefaultSnepServer`: `NFC_SNEP_SERVER_TYPE` = 0;
public const val `DeviceHost`: `SECURE_ELEMENT_TYPE` = 2;
public const val `Discovery`: `NFC_RELEASE_TYPE` = 2;
public const val `EVT_TRANSACTION_PARAMETER_MAX_LEN`: UInt = 255u;
public const val `EVT_TRANSACTION_TAG_AID`: UInt = 129u;
public const val `EVT_TRANSACTION_TAG_PARAMETERS`: UInt = 130u;
public const val `EmulationDisabled`: `NFC_SE_EMULATION_MODE` = 0;
public const val `EmulationEnabled`: `NFC_SE_EMULATION_MODE` = 1;
public const val `EmulationOff`: `SECURE_ELEMENT_CARD_EMULATION_MODE` = 0;
public const val `EmulationOnPowerDependent`: `SECURE_ELEMENT_CARD_EMULATION_MODE` = 2;
public const val `EmulationOnPowerIndependent`: `SECURE_ELEMENT_CARD_EMULATION_MODE` = 1;
public const val `EmulationStealthListen`: `SECURE_ELEMENT_CARD_EMULATION_MODE` = 3;
public const val `ExtendedSnepServer`: `NFC_SNEP_SERVER_TYPE` = 1;
public const val `External`: `SECURE_ELEMENT_TYPE` = 1;
public const val `ExternalFieldEnter`: `SECURE_ELEMENT_EVENT_TYPE` = 6;
public const val `ExternalFieldExit`: `SECURE_ELEMENT_EVENT_TYPE` = 7;
public const val `ExternalReaderArrival`: `SECURE_ELEMENT_EVENT_TYPE` = 0;
public const val `ExternalReaderDeparture`: `SECURE_ELEMENT_EVENT_TYPE` = 1;
// UNSUPPORTED Rust 22:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_NFCDTA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7fd3f30b_5e49_4be1_b3aa_af06260d236a);

// UNSUPPORTED Rust 23:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_NFCSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8dc7c854_f5e5_4bed_815d_0c85ad047725);

// UNSUPPORTED Rust 24:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_NFCSE_RADIO_MEDIA_DEVICE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef8ba08f_148d_4116_83ef_a2679dfc3fa5);

// UNSUPPORTED Rust 25:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_NFC_RADIO_MEDIA_DEVICE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d51e930_750d_4a36_a9f7_91dc540fcd30);

public const val `HceActivated`: `SECURE_ELEMENT_EVENT_TYPE` = 4;
public const val `HceDeactivated`: `SECURE_ELEMENT_EVENT_TYPE` = 5;
public const val `IOCTL_NFCDTA_CONFIG_P2P_PARAM`: UInt = 2233376u;
public const val `IOCTL_NFCDTA_CONFIG_RF_DISCOVERY`: UInt = 2233344u;
public const val `IOCTL_NFCDTA_LLCP_ACTIVATE`: UInt = 2233476u;
public const val `IOCTL_NFCDTA_LLCP_CONFIG`: UInt = 2233472u;
public const val `IOCTL_NFCDTA_LLCP_DEACTIVATE`: UInt = 2233480u;
public const val `IOCTL_NFCDTA_LLCP_DISCOVER_SERVICES`: UInt = 2233484u;
public const val `IOCTL_NFCDTA_LLCP_GET_NEXT_LINK_STATUS`: UInt = 2233492u;
public const val `IOCTL_NFCDTA_LLCP_LINK_STATUS_CHECK`: UInt = 2233488u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_ACCEPT`: UInt = 2233512u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_BIND`: UInt = 2233504u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_CLOSE`: UInt = 2233500u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_CONNECT`: UInt = 2233516u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_CREATE`: UInt = 2233496u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_DISCONNECT`: UInt = 2233520u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_GET_NEXT_ERROR`: UInt = 2233540u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_LISTEN`: UInt = 2233508u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_RECV`: UInt = 2233524u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_RECV_FROM`: UInt = 2233528u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_SEND`: UInt = 2233532u;
public const val `IOCTL_NFCDTA_LLCP_SOCKET_SNED_TO`: UInt = 2233536u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_CHECK_PRESENCE`: UInt = 2233372u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_CONNECT`: UInt = 2233352u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_DISCONNECT`: UInt = 2233356u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_GET_NEXT`: UInt = 2233348u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_NDEF_CHECK`: UInt = 2233420u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_NDEF_CONVERT_READ_ONLY`: UInt = 2233416u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_NDEF_READ`: UInt = 2233412u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_NDEF_WRITE`: UInt = 2233408u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_RECV`: UInt = 2233364u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_SEND`: UInt = 2233368u;
public const val `IOCTL_NFCDTA_REMOTE_DEV_TRANSCEIVE`: UInt = 2233360u;
public const val `IOCTL_NFCDTA_SET_RF_CONFIG`: UInt = 2233380u;
public const val `IOCTL_NFCDTA_SE_ENUMERATE`: UInt = 2233728u;
public const val `IOCTL_NFCDTA_SE_GET_NEXT_EVENT`: UInt = 2233740u;
public const val `IOCTL_NFCDTA_SE_SET_EMULATION_MODE`: UInt = 2233732u;
public const val `IOCTL_NFCDTA_SE_SET_ROUTING_TABLE`: UInt = 2233736u;
public const val `IOCTL_NFCDTA_SNEP_CLIENT_GET`: UInt = 2233676u;
public const val `IOCTL_NFCDTA_SNEP_CLIENT_PUT`: UInt = 2233672u;
public const val `IOCTL_NFCDTA_SNEP_DEINIT_CLIENT`: UInt = 2233668u;
public const val `IOCTL_NFCDTA_SNEP_DEINIT_SERVER`: UInt = 2233604u;
public const val `IOCTL_NFCDTA_SNEP_INIT_CLIENT`: UInt = 2233664u;
public const val `IOCTL_NFCDTA_SNEP_INIT_SERVER`: UInt = 2233600u;
public const val `IOCTL_NFCDTA_SNEP_SERVER_ACCEPT`: UInt = 2233612u;
public const val `IOCTL_NFCDTA_SNEP_SERVER_GET_NEXT_CONNECTION`: UInt = 2233608u;
public const val `IOCTL_NFCDTA_SNEP_SERVER_GET_NEXT_REQUEST`: UInt = 2233616u;
public const val `IOCTL_NFCDTA_SNEP_SERVER_SEND_RESPONSE`: UInt = 2233620u;
public const val `IOCTL_NFCRM_QUERY_RADIO_STATE`: UInt = 5308808u;
public const val `IOCTL_NFCRM_SET_RADIO_STATE`: UInt = 5308804u;
public const val `IOCTL_NFCSERM_QUERY_RADIO_STATE`: UInt = 5308816u;
public const val `IOCTL_NFCSERM_SET_RADIO_STATE`: UInt = 5308812u;
public const val `IOCTL_NFCSE_ENUM_ENDPOINTS`: UInt = 2230272u;
public const val `IOCTL_NFCSE_GET_NEXT_EVENT`: UInt = 2230280u;
public const val `IOCTL_NFCSE_GET_NFCC_CAPABILITIES`: UInt = 2230288u;
public const val `IOCTL_NFCSE_GET_ROUTING_TABLE`: UInt = 2230292u;
public const val `IOCTL_NFCSE_HCE_REMOTE_RECV`: UInt = 2230592u;
public const val `IOCTL_NFCSE_HCE_REMOTE_SEND`: UInt = 2230596u;
public const val `IOCTL_NFCSE_SET_CARD_EMULATION_MODE`: UInt = 2230284u;
public const val `IOCTL_NFCSE_SET_POWER_MODE`: UInt = 2230600u;
public const val `IOCTL_NFCSE_SET_ROUTING_TABLE`: UInt = 2230296u;
public const val `IOCTL_NFCSE_SUBSCRIBE_FOR_EVENT`: UInt = 2230276u;
public const val `ISO_7816_MAXIMUM_AID_LENGTH`: UInt = 16u;
public const val `ISO_7816_MINIMUM_AID_LENGTH`: UInt = 5u;
public const val `IdleMode`: `NFC_RELEASE_TYPE` = 0;
public const val `Integrated`: `SECURE_ELEMENT_TYPE` = 0;
public const val `LinkActivated`: `NFC_LLCP_LINK_STATUS` = 0;
public const val `LinkDeactivated`: `NFC_LLCP_LINK_STATUS` = 1;
public const val `MAX_ATR_LENGTH`: UInt = 48u;
public const val `MAX_LLCP_SERVICE_NAME_SIZE`: UInt = 256u;
public const val `MAX_SNEP_SERVER_NAME_SIZE`: UInt = 256u;
public const val `MAX_UID_SIZE`: UInt = 16u;
public const val `NFCRMDDI_IOCTL_BASE`: UInt = 80u;
// UNSUPPORTED Rust 99:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFCRM_RADIO_STATE {
//     pub MediaRadioOn: bool,
// }

// UNSUPPORTED Rust 104:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFCRM_SET_RADIO_STATE {
//     pub SystemStateUpdate: bool,
//     pub MediaRadioOn: bool,
// }

// UNSUPPORTED Rust 110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_DATA_BUFFER {
//     pub cbBuffer: u16,
//     pub pbBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 116:1: declaration Impl has no candidate rule
// impl Default for NFC_DATA_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NFC_DEVICE_TYPE` = Int;
// UNSUPPORTED Rust 122:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_CONFIG {
//     pub uMIU: u16,
//     pub uWKS: u16,
//     pub bLTO: u8,
//     pub bOptions: u8,
//     pub fAutoActivate: bool,
// }

public typealias `NFC_LLCP_LINK_STATUS` = Int;
// UNSUPPORTED Rust 132:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_LLCP_SERVICE_DISCOVER_REQUEST {
//     pub hRemoteDev: isize,
//     pub NumberOfEntries: u32,
//     pub ServiceNameEntries: [NFC_LLCP_SERVICE_NAME_ENTRY; 1],
// }

// UNSUPPORTED Rust 139:1: declaration Impl has no candidate rule
// impl Default for NFC_LLCP_SERVICE_DISCOVER_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 144:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_LLCP_SERVICE_DISCOVER_SAP {
//     pub NumberOfEntries: u32,
//     pub SAPEntries: [u8; 1],
// }

// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule
// impl Default for NFC_LLCP_SERVICE_DISCOVER_SAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_LLCP_SERVICE_NAME_ENTRY {
//     pub cbServiceName: u32,
//     pub pbServiceName: [u8; 1],
// }

// UNSUPPORTED Rust 161:1: declaration Impl has no candidate rule
// impl Default for NFC_LLCP_SERVICE_NAME_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 166:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_SOCKET_ACCEPT_INFO {
//     pub hSocket: isize,
//     pub sSocketOption: NFC_LLCP_SOCKET_OPTION,
// }

// UNSUPPORTED Rust 172:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_SOCKET_CL_PAYLOAD {
//     pub hSocket: isize,
//     pub bSAP: u8,
//     pub sPayload: NFC_DATA_BUFFER,
// }

// UNSUPPORTED Rust 179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_LLCP_SOCKET_CONNECT_INFO {
//     pub hRemoteDev: isize,
//     pub hSocket: isize,
//     pub eConnectType: NFC_LLCP_SOCKET_CONNECT_TYPE,
//     pub Anonymous: NFC_LLCP_SOCKET_CONNECT_INFO_0,
// }

// UNSUPPORTED Rust 187:1: declaration Impl has no candidate rule
// impl Default for NFC_LLCP_SOCKET_CONNECT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 192:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NFC_LLCP_SOCKET_CONNECT_INFO_0 {
//     pub bSAP: u8,
//     pub sServiceName: NFC_LLCP_SERVICE_NAME_ENTRY,
// }

// UNSUPPORTED Rust 198:1: declaration Impl has no candidate rule
// impl Default for NFC_LLCP_SOCKET_CONNECT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NFC_LLCP_SOCKET_CONNECT_TYPE` = Int;
public typealias `NFC_LLCP_SOCKET_ERROR` = Int;
// UNSUPPORTED Rust 205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_SOCKET_ERROR_INFO {
//     pub hSocket: isize,
//     pub eSocketError: NFC_LLCP_SOCKET_ERROR,
// }

// UNSUPPORTED Rust 211:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_SOCKET_INFO {
//     pub eSocketType: NFC_LLCP_SOCKET_TYPE,
//     pub sSocketOption: NFC_LLCP_SOCKET_OPTION,
// }

// UNSUPPORTED Rust 217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_SOCKET_OPTION {
//     pub uMIUX: u16,
//     pub bRW: u8,
// }

// UNSUPPORTED Rust 223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_SOCKET_PAYLOAD {
//     pub hSocket: isize,
//     pub bSAP: u8,
//     pub sPayload: NFC_DATA_BUFFER,
// }

// UNSUPPORTED Rust 230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_LLCP_SOCKET_SERVICE_INFO {
//     pub hSocket: isize,
//     pub bSAP: u8,
//     pub sServiceName: NFC_LLCP_SERVICE_NAME_ENTRY,
// }

public typealias `NFC_LLCP_SOCKET_TYPE` = Int;
// UNSUPPORTED Rust 238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_NDEF_INFO {
//     pub fIsNdefFormatted: bool,
//     pub fIsReadOnly: bool,
//     pub dwActualMessageLength: u32,
//     pub dwMaxMessageLength: u32,
// }

public typealias `NFC_P2P_MODE` = Int;
// UNSUPPORTED Rust 247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_P2P_PARAM_CONFIG {
//     pub eP2pMode: NFC_P2P_MODE,
//     pub cbGeneralBytes: u8,
//     pub pbGeneralBytes: [u8; 48],
// }

// UNSUPPORTED Rust 254:1: declaration Impl has no candidate rule
// impl Default for NFC_P2P_PARAM_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NFC_RELEASE_TYPE` = Int;
// UNSUPPORTED Rust 260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_REMOTE_DEVICE_DISCONNET {
//     pub hRemoteDev: isize,
//     pub eReleaseType: NFC_RELEASE_TYPE,
// }

// UNSUPPORTED Rust 266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_REMOTE_DEV_INFO {
//     pub hRemoteDev: isize,
//     pub eType: NFC_DEVICE_TYPE,
//     pub eRFTech: u8,
//     pub eProtocol: u8,
//     pub cbUid: u8,
//     pub pbUid: [u8; 16],
// }

// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule
// impl Default for NFC_REMOTE_DEV_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_REMOTE_DEV_RECV_INFO {
//     pub hRemoteDev: isize,
//     pub sRecvBuffer: NFC_DATA_BUFFER,
// }

// UNSUPPORTED Rust 287:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_REMOTE_DEV_SEND_INFO {
//     pub hRemoteDev: isize,
//     pub usTimeOut: u16,
//     pub sSendBuffer: NFC_DATA_BUFFER,
// }

// UNSUPPORTED Rust 294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_RF_DISCOVERY_CONFIG {
//     pub usTotalDuration: u16,
//     pub ulPollConfig: u32,
//     pub fDisableCardEmulation: bool,
//     pub ucNfcIPMode: u8,
//     pub fNfcIPTgtModeDisable: bool,
//     pub ucNfcIPTgtMode: u8,
//     pub ucNfcCEMode: u8,
//     pub ucBailoutConfig: u8,
//     pub ucSystemCode: [u8; 2],
//     pub ucRequestCode: u8,
//     pub ucTimeSlotNumber: u8,
//     pub eRfDiscoveryMode: NFC_RF_DISCOVERY_MODE,
// }

// UNSUPPORTED Rust 310:1: declaration Impl has no candidate rule
// impl Default for NFC_RF_DISCOVERY_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NFC_RF_DISCOVERY_MODE` = Int;
// UNSUPPORTED Rust 316:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_SE_AID_ROUTING_INFO {
//     pub hSecureElement: isize,
//     pub bPowerState: u8,
//     pub cbAid: u32,
//     pub pbAid: [u8; 16],
// }

// UNSUPPORTED Rust 324:1: declaration Impl has no candidate rule
// impl Default for NFC_SE_AID_ROUTING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NFC_SE_EMULATION_MODE` = Int;
// UNSUPPORTED Rust 330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SE_EMULATION_MODE_INFO {
//     pub hSecureElement: isize,
//     pub eMode: NFC_SE_EMULATION_MODE,
// }

// UNSUPPORTED Rust 336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_SE_EVENT_INFO {
//     pub hSecureElement: isize,
//     pub eEventType: SECURE_ELEMENT_EVENT_TYPE,
//     pub cbEventData: u32,
//     pub pbEventData: [u8; 1],
// }

// UNSUPPORTED Rust 344:1: declaration Impl has no candidate rule
// impl Default for NFC_SE_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SE_INFO {
//     pub hSecureElement: isize,
//     pub eSecureElementType: SECURE_ELEMENT_TYPE,
// }

// UNSUPPORTED Rust 355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_SE_LIST {
//     pub NumberOfEndpoints: u32,
//     pub EndpointList: [NFC_SE_INFO; 1],
// }

// UNSUPPORTED Rust 361:1: declaration Impl has no candidate rule
// impl Default for NFC_SE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SE_PROTO_ROUTING_INFO {
//     pub hSecureElement: isize,
//     pub bPowerState: u8,
//     pub eRfProtocolType: u8,
// }

// UNSUPPORTED Rust 373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_SE_ROUTING_TABLE {
//     pub NumberOfEntries: u32,
//     pub TableEntries: [NFC_SE_ROUTING_TABLE_ENTRY; 1],
// }

// UNSUPPORTED Rust 379:1: declaration Impl has no candidate rule
// impl Default for NFC_SE_ROUTING_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NFC_SE_ROUTING_TABLE_ENTRY {
//     pub eRoutingType: SECURE_ELEMENT_ROUTING_TYPE,
//     pub Anonymous: NFC_SE_ROUTING_TABLE_ENTRY_0,
// }

// UNSUPPORTED Rust 390:1: declaration Impl has no candidate rule
// impl Default for NFC_SE_ROUTING_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 395:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NFC_SE_ROUTING_TABLE_ENTRY_0 {
//     pub TechRoutingInfo: NFC_SE_TECH_ROUTING_INFO,
//     pub ProtoRoutingInfo: NFC_SE_PROTO_ROUTING_INFO,
//     pub AidRoutingInfo: NFC_SE_AID_ROUTING_INFO,
// }

// UNSUPPORTED Rust 402:1: declaration Impl has no candidate rule
// impl Default for NFC_SE_ROUTING_TABLE_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SE_TECH_ROUTING_INFO {
//     pub hSecureElement: isize,
//     pub bPowerState: u8,
//     pub eRfTechType: u8,
// }

// UNSUPPORTED Rust 414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SNEP_CLIENT_GET_INFO {
//     pub hSnepClient: isize,
//     pub sGetPayload: NFC_DATA_BUFFER,
// }

// UNSUPPORTED Rust 420:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SNEP_CLIENT_INFO {
//     pub hRemoteDev: isize,
//     pub eServerType: NFC_SNEP_SERVER_TYPE,
//     pub sSocketOption: NFC_LLCP_SOCKET_OPTION,
//     pub sService: NFC_LLCP_SERVICE_NAME_ENTRY,
// }

// UNSUPPORTED Rust 428:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SNEP_CLIENT_PUT_INFO {
//     pub hSnepClient: isize,
//     pub sPutPayload: NFC_DATA_BUFFER,
// }

public typealias `NFC_SNEP_REQUEST_TYPE` = Int;
// UNSUPPORTED Rust 435:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SNEP_SERVER_ACCEPT_INFO {
//     pub hSnepServer: isize,
//     pub hConnection: isize,
//     pub sSocketOption: NFC_LLCP_SOCKET_OPTION,
// }

// UNSUPPORTED Rust 442:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SNEP_SERVER_INFO {
//     pub eServerType: NFC_SNEP_SERVER_TYPE,
//     pub sSocketOption: NFC_LLCP_SOCKET_OPTION,
//     pub usInboxSize: u16,
//     pub bSAP: u8,
//     pub sService: NFC_LLCP_SERVICE_NAME_ENTRY,
// }

// UNSUPPORTED Rust 451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SNEP_SERVER_REQUEST {
//     pub hSnepServer: isize,
//     pub hConnection: isize,
//     pub eRequestType: NFC_SNEP_REQUEST_TYPE,
//     pub sRequestPayload: NFC_DATA_BUFFER,
// }

// UNSUPPORTED Rust 459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NFC_SNEP_SERVER_RESPONSE_INFO {
//     pub hSnepServer: isize,
//     pub hConnection: isize,
//     pub dwResponseStatus: u32,
//     pub sResponsePayload: NFC_DATA_BUFFER,
// }

public typealias `NFC_SNEP_SERVER_TYPE` = Int;
public const val `NfcConnectBySap`: `NFC_LLCP_SOCKET_CONNECT_TYPE` = 0;
public const val `NfcConnectByUri`: `NFC_LLCP_SOCKET_CONNECT_TYPE` = 1;
public const val `NfcDepDefault`: `NFC_P2P_MODE` = 0;
public const val `NfcDepListen`: `NFC_P2P_MODE` = 2;
public const val `NfcDepPoll`: `NFC_P2P_MODE` = 1;
public const val `NfcIP1Initiator`: `NFC_DEVICE_TYPE` = 5;
public const val `NfcIP1Target`: `NFC_DEVICE_TYPE` = 4;
public const val `NfcLlcpErrorBusyCondition`: `NFC_LLCP_SOCKET_ERROR` = 2;
public const val `NfcLlcpErrorDisconnected`: `NFC_LLCP_SOCKET_ERROR` = 0;
public const val `NfcLlcpErrorFrameRejected`: `NFC_LLCP_SOCKET_ERROR` = 1;
public const val `NfcLlcpErrorNotBusyCondition`: `NFC_LLCP_SOCKET_ERROR` = 3;
public const val `NfcReader`: `NFC_DEVICE_TYPE` = 6;
public const val `NfcType1Tag`: `NFC_DEVICE_TYPE` = 0;
public const val `NfcType2Tag`: `NFC_DEVICE_TYPE` = 1;
public const val `NfcType3Tag`: `NFC_DEVICE_TYPE` = 2;
public const val `NfcType4Tag`: `NFC_DEVICE_TYPE` = 3;
public const val `RFDiscoveryResume`: `NFC_RF_DISCOVERY_MODE` = 2;
public const val `RfDiscoveryConfig`: `NFC_RF_DISCOVERY_MODE` = 0;
public const val `RfDiscoveryStart`: `NFC_RF_DISCOVERY_MODE` = 1;
public const val `RoutingTypeAid`: `SECURE_ELEMENT_ROUTING_TYPE` = 2;
public const val `RoutingTypeProtocol`: `SECURE_ELEMENT_ROUTING_TYPE` = 1;
public const val `RoutingTypeTech`: `SECURE_ELEMENT_ROUTING_TYPE` = 0;
// UNSUPPORTED Rust 490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURE_ELEMENT_AID_ROUTING_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub cbAid: u32,
//     pub pbAid: [u8; 16],
// }

// UNSUPPORTED Rust 497:1: declaration Impl has no candidate rule
// impl Default for SECURE_ELEMENT_AID_ROUTING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECURE_ELEMENT_CARD_EMULATION_MODE` = Int;
// UNSUPPORTED Rust 503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_ENDPOINT_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub eSecureElementType: SECURE_ELEMENT_TYPE,
// }

// UNSUPPORTED Rust 509:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURE_ELEMENT_ENDPOINT_LIST {
//     pub NumberOfEndpoints: u32,
//     pub EndpointList: [SECURE_ELEMENT_ENDPOINT_INFO; 1],
// }

// UNSUPPORTED Rust 515:1: declaration Impl has no candidate rule
// impl Default for SECURE_ELEMENT_ENDPOINT_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 520:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURE_ELEMENT_EVENT_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub eEventType: SECURE_ELEMENT_EVENT_TYPE,
//     pub cbEventData: u32,
//     pub pbEventData: [u8; 1],
// }

// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule
// impl Default for SECURE_ELEMENT_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_EVENT_SUBSCRIPTION_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub eEventType: SECURE_ELEMENT_EVENT_TYPE,
// }

public typealias `SECURE_ELEMENT_EVENT_TYPE` = Int;
// UNSUPPORTED Rust 540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_HCE_ACTIVATION_PAYLOAD {
//     pub bConnectionId: u16,
//     pub eRfTechType: u8,
//     pub eRfProtocolType: u8,
// }

// UNSUPPORTED Rust 547:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURE_ELEMENT_HCE_DATA_PACKET {
//     pub bConnectionId: u16,
//     pub cbPayload: u16,
//     pub pbPayload: [u8; 1],
// }

// UNSUPPORTED Rust 554:1: declaration Impl has no candidate rule
// impl Default for SECURE_ELEMENT_HCE_DATA_PACKET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 559:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_NFCC_CAPABILITIES {
//     pub cbMaxRoutingTableSize: u16,
//     pub IsAidRoutingSupported: bool,
//     pub IsProtocolRoutingSupported: bool,
//     pub IsTechRoutingSupported: bool,
// }

public typealias `SECURE_ELEMENT_POWER_MODE` = Int;
// UNSUPPORTED Rust 568:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_PROTO_ROUTING_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub eRfProtocolType: u8,
// }

// UNSUPPORTED Rust 574:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURE_ELEMENT_ROUTING_TABLE {
//     pub NumberOfEntries: u32,
//     pub TableEntries: [SECURE_ELEMENT_ROUTING_TABLE_ENTRY; 1],
// }

// UNSUPPORTED Rust 580:1: declaration Impl has no candidate rule
// impl Default for SECURE_ELEMENT_ROUTING_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 585:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURE_ELEMENT_ROUTING_TABLE_ENTRY {
//     pub eRoutingType: SECURE_ELEMENT_ROUTING_TYPE,
//     pub Anonymous: SECURE_ELEMENT_ROUTING_TABLE_ENTRY_0,
// }

// UNSUPPORTED Rust 591:1: declaration Impl has no candidate rule
// impl Default for SECURE_ELEMENT_ROUTING_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 596:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SECURE_ELEMENT_ROUTING_TABLE_ENTRY_0 {
//     pub TechRoutingInfo: SECURE_ELEMENT_TECH_ROUTING_INFO,
//     pub ProtoRoutingInfo: SECURE_ELEMENT_PROTO_ROUTING_INFO,
//     pub AidRoutingInfo: SECURE_ELEMENT_AID_ROUTING_INFO,
// }

// UNSUPPORTED Rust 603:1: declaration Impl has no candidate rule
// impl Default for SECURE_ELEMENT_ROUTING_TABLE_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECURE_ELEMENT_ROUTING_TYPE` = Int;
// UNSUPPORTED Rust 609:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_SET_CARD_EMULATION_MODE_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub eMode: SECURE_ELEMENT_CARD_EMULATION_MODE,
// }

// UNSUPPORTED Rust 615:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_SET_POWER_MODE_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub powerMode: SECURE_ELEMENT_POWER_MODE,
// }

// UNSUPPORTED Rust 621:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SECURE_ELEMENT_TECH_ROUTING_INFO {
//     pub guidSecureElementId: windows_sys::core::GUID,
//     pub eRfTechType: u8,
// }

public typealias `SECURE_ELEMENT_TYPE` = Int;
public const val `SEPowerMode_AllowOff`: `SECURE_ELEMENT_POWER_MODE` = 1;
public const val `SEPowerMode_ForceOn`: `SECURE_ELEMENT_POWER_MODE` = 0;
public const val `SleepMode`: `NFC_RELEASE_TYPE` = 1;
public const val `SnepRequestGet`: `NFC_SNEP_REQUEST_TYPE` = 0;
public const val `SnepRequestPut`: `NFC_SNEP_REQUEST_TYPE` = 1;
public const val `Transaction`: `SECURE_ELEMENT_EVENT_TYPE` = 3;
