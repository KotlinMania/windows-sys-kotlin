// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("netshell.dll" "system" fn NcFreeNetconProperties(pprops : *mut NETCON_PROPERTIES));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("netshell.dll" "system" fn NcIsValidConnectionName(pszwname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername : windows_sys::core::PCWSTR, netisoerror : *mut NETISO_ERROR_TYPE) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationEnumAppContainers(flags : u32, pdwnumpublicappcs : *mut u32, pppublicappcs : *mut *mut INET_FIREWALL_APP_CONTAINER) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Ole")]
// windows_link::link!("firewallapi.dll" "system" fn NetworkIsolationEnumerateAppContainerRules(newenum : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationFreeAppContainers(ppublicappcs : *const INET_FIREWALL_APP_CONTAINER) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs : *mut u32, appcontainersids : *mut *mut super::super::Security:: SID_AND_ATTRIBUTES) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("firewallapi.dll" "system" fn NetworkIsolationGetEnterpriseIdAsync(wszservername : windows_sys::core::PCWSTR, dwflags : u32, context : *const core::ffi::c_void, callback : PNETISO_EDP_ID_CALLBACK_FN, hoperation : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("firewallapi.dll" "system" fn NetworkIsolationGetEnterpriseIdClose(hoperation : super::super::Foundation:: HANDLE, bwaitforoperation : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationRegisterForAppContainerChanges(flags : u32, callback : PAC_CHANGES_CALLBACK_FN, context : *const core::ffi::c_void, registrationobject : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationSetAppContainerConfig(dwnumpublicappcs : u32, appcontainersids : *const super::super::Security:: SID_AND_ATTRIBUTES) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationSetupAppContainerBinaries(applicationcontainersid : super::super::Security:: PSID, packagefullname : windows_sys::core::PCWSTR, packagefolder : windows_sys::core::PCWSTR, displayname : windows_sys::core::PCWSTR, bbinariesfullycomputed : windows_sys::core::BOOL, binaries : *const windows_sys::core::PCWSTR, binariescount : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-net-isolation-l1-1-0.dll" "system" fn NetworkIsolationUnregisterForAppContainerChanges(registrationobject : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 21:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FW_DYNAMIC_KEYWORD_ADDRESS0 {
//     pub id: windows_sys::core::GUID,
//     pub keyword: windows_sys::core::PCWSTR,
//     pub flags: u32,
//     pub addresses: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule
// impl Default for FW_DYNAMIC_KEYWORD_ADDRESS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 34:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FW_DYNAMIC_KEYWORD_ADDRESS_DATA0 {
//     pub dynamicKeywordAddress: FW_DYNAMIC_KEYWORD_ADDRESS0,
//     pub next: *mut FW_DYNAMIC_KEYWORD_ADDRESS_DATA0,
//     pub schemaVersion: u16,
//     pub originType: FW_DYNAMIC_KEYWORD_ORIGIN_TYPE,
// }

// UNSUPPORTED Rust 42:1: declaration Impl has no candidate rule
// impl Default for FW_DYNAMIC_KEYWORD_ADDRESS_DATA0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS` = Int;
public const val `FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS_ALL`: `FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS` = 3;
public const val `FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS_AUTO_RESOLVE`: `FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS` = 1;
public const val `FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS_NON_AUTO_RESOLVE`: `FW_DYNAMIC_KEYWORD_ADDRESS_ENUM_FLAGS` = 2;
public typealias `FW_DYNAMIC_KEYWORD_ADDRESS_FLAGS` = Int;
public const val `FW_DYNAMIC_KEYWORD_ADDRESS_FLAGS_AUTO_RESOLVE`: `FW_DYNAMIC_KEYWORD_ADDRESS_FLAGS` = 1;
public const val `FW_DYNAMIC_KEYWORD_ORIGIN_INVALID`: `FW_DYNAMIC_KEYWORD_ORIGIN_TYPE` = 0;
public const val `FW_DYNAMIC_KEYWORD_ORIGIN_LOCAL`: `FW_DYNAMIC_KEYWORD_ORIGIN_TYPE` = 1;
public const val `FW_DYNAMIC_KEYWORD_ORIGIN_MDM`: `FW_DYNAMIC_KEYWORD_ORIGIN_TYPE` = 2;
public typealias `FW_DYNAMIC_KEYWORD_ORIGIN_TYPE` = Int;
public const val `ICSSC_DEFAULT`: `SHARINGCONNECTION_ENUM_FLAGS` = 0;
public const val `ICSSC_ENABLED`: `SHARINGCONNECTION_ENUM_FLAGS` = 1;
public const val `ICSSHARINGTYPE_PRIVATE`: `SHARINGCONNECTIONTYPE` = 1;
public const val `ICSSHARINGTYPE_PUBLIC`: `SHARINGCONNECTIONTYPE` = 0;
public const val `ICSTT_IPADDRESS`: `ICS_TARGETTYPE` = 1;
public const val `ICSTT_NAME`: `ICS_TARGETTYPE` = 0;
public typealias `ICS_TARGETTYPE` = Int;
// UNSUPPORTED Rust 64:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INET_FIREWALL_AC_BINARIES {
//     pub count: u32,
//     pub binaries: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 70:1: declaration Impl has no candidate rule
// impl Default for INET_FIREWALL_AC_BINARIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INET_FIREWALL_AC_BINARY`: `INET_FIREWALL_AC_CREATION_TYPE` = 2;
// UNSUPPORTED Rust 76:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct INET_FIREWALL_AC_CAPABILITIES {
//     pub count: u32,
//     pub capabilities: *mut super::super::Security::SID_AND_ATTRIBUTES,
// }

// UNSUPPORTED Rust 83:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for INET_FIREWALL_AC_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 89:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct INET_FIREWALL_AC_CHANGE {
//     pub changeType: INET_FIREWALL_AC_CHANGE_TYPE,
//     pub createType: INET_FIREWALL_AC_CREATION_TYPE,
//     pub appContainerSid: *mut super::super::Security::SID,
//     pub userSid: *mut super::super::Security::SID,
//     pub displayName: windows_sys::core::PWSTR,
//     pub Anonymous: INET_FIREWALL_AC_CHANGE_0,
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for INET_FIREWALL_AC_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 106:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union INET_FIREWALL_AC_CHANGE_0 {
//     pub capabilities: INET_FIREWALL_AC_CAPABILITIES,
//     pub binaries: INET_FIREWALL_AC_BINARIES,
// }

// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for INET_FIREWALL_AC_CHANGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INET_FIREWALL_AC_CHANGE_CREATE`: `INET_FIREWALL_AC_CHANGE_TYPE` = 1;
public const val `INET_FIREWALL_AC_CHANGE_DELETE`: `INET_FIREWALL_AC_CHANGE_TYPE` = 2;
public const val `INET_FIREWALL_AC_CHANGE_INVALID`: `INET_FIREWALL_AC_CHANGE_TYPE` = 0;
public const val `INET_FIREWALL_AC_CHANGE_MAX`: `INET_FIREWALL_AC_CHANGE_TYPE` = 3;
public typealias `INET_FIREWALL_AC_CHANGE_TYPE` = Int;
public typealias `INET_FIREWALL_AC_CREATION_TYPE` = Int;
public const val `INET_FIREWALL_AC_MAX`: `INET_FIREWALL_AC_CREATION_TYPE` = 4;
public const val `INET_FIREWALL_AC_NONE`: `INET_FIREWALL_AC_CREATION_TYPE` = 0;
public const val `INET_FIREWALL_AC_PACKAGE_ID_ONLY`: `INET_FIREWALL_AC_CREATION_TYPE` = 1;
// UNSUPPORTED Rust 128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct INET_FIREWALL_APP_CONTAINER {
//     pub appContainerSid: *mut super::super::Security::SID,
//     pub userSid: *mut super::super::Security::SID,
//     pub appContainerName: windows_sys::core::PWSTR,
//     pub displayName: windows_sys::core::PWSTR,
//     pub description: windows_sys::core::PWSTR,
//     pub capabilities: INET_FIREWALL_AC_CAPABILITIES,
//     pub binaries: INET_FIREWALL_AC_BINARIES,
//     pub workingDirectory: windows_sys::core::PWSTR,
//     pub packageFullName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 142:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for INET_FIREWALL_APP_CONTAINER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NCCF_ALLOW_DUPLICATION`: `NETCON_CHARACTERISTIC_FLAGS` = 2;
public const val `NCCF_ALLOW_REMOVAL`: `NETCON_CHARACTERISTIC_FLAGS` = 4;
public const val `NCCF_ALLOW_RENAME`: `NETCON_CHARACTERISTIC_FLAGS` = 8;
public const val `NCCF_ALL_USERS`: `NETCON_CHARACTERISTIC_FLAGS` = 1;
public const val `NCCF_BLUETOOTH_MASK`: `NETCON_CHARACTERISTIC_FLAGS` = 983040;
public const val `NCCF_BRANDED`: `NETCON_CHARACTERISTIC_FLAGS` = 128;
public const val `NCCF_BRIDGED`: `NETCON_CHARACTERISTIC_FLAGS` = 512;
public const val `NCCF_DEFAULT`: `NETCON_CHARACTERISTIC_FLAGS` = 2048;
public const val `NCCF_FIREWALLED`: `NETCON_CHARACTERISTIC_FLAGS` = 1024;
public const val `NCCF_HOMENET_CAPABLE`: `NETCON_CHARACTERISTIC_FLAGS` = 4096;
public const val `NCCF_HOSTED_NETWORK`: `NETCON_CHARACTERISTIC_FLAGS` = 65536;
public const val `NCCF_INCOMING_ONLY`: `NETCON_CHARACTERISTIC_FLAGS` = 32;
public const val `NCCF_LAN_MASK`: `NETCON_CHARACTERISTIC_FLAGS` = 15728640;
public const val `NCCF_NONE`: `NETCON_CHARACTERISTIC_FLAGS` = 0;
public const val `NCCF_OUTGOING_ONLY`: `NETCON_CHARACTERISTIC_FLAGS` = 64;
public const val `NCCF_QUARANTINED`: `NETCON_CHARACTERISTIC_FLAGS` = 16384;
public const val `NCCF_RESERVED`: `NETCON_CHARACTERISTIC_FLAGS` = 32768;
public const val `NCCF_SHARED`: `NETCON_CHARACTERISTIC_FLAGS` = 256;
public const val `NCCF_SHARED_PRIVATE`: `NETCON_CHARACTERISTIC_FLAGS` = 8192;
public const val `NCCF_VIRTUAL_STATION`: `NETCON_CHARACTERISTIC_FLAGS` = 131072;
public const val `NCCF_WIFI_DIRECT`: `NETCON_CHARACTERISTIC_FLAGS` = 262144;
public const val `NCME_DEFAULT`: `NETCONMGR_ENUM_FLAGS` = 0;
public const val `NCME_HIDDEN`: `NETCONMGR_ENUM_FLAGS` = 1;
public const val `NCM_BRIDGE`: `NETCON_MEDIATYPE` = 7;
public const val `NCM_DIRECT`: `NETCON_MEDIATYPE` = 1;
public const val `NCM_ISDN`: `NETCON_MEDIATYPE` = 2;
public const val `NCM_LAN`: `NETCON_MEDIATYPE` = 3;
public const val `NCM_NONE`: `NETCON_MEDIATYPE` = 0;
public const val `NCM_PHONE`: `NETCON_MEDIATYPE` = 4;
public const val `NCM_PPPOE`: `NETCON_MEDIATYPE` = 6;
public const val `NCM_SHAREDACCESSHOST_LAN`: `NETCON_MEDIATYPE` = 8;
public const val `NCM_SHAREDACCESSHOST_RAS`: `NETCON_MEDIATYPE` = 9;
public const val `NCM_TUNNEL`: `NETCON_MEDIATYPE` = 5;
public const val `NCS_ACTION_REQUIRED`: `NETCON_STATUS` = 13;
public const val `NCS_ACTION_REQUIRED_RETRY`: `NETCON_STATUS` = 14;
public const val `NCS_AUTHENTICATING`: `NETCON_STATUS` = 8;
public const val `NCS_AUTHENTICATION_FAILED`: `NETCON_STATUS` = 10;
public const val `NCS_AUTHENTICATION_SUCCEEDED`: `NETCON_STATUS` = 9;
public const val `NCS_CONNECTED`: `NETCON_STATUS` = 2;
public const val `NCS_CONNECTING`: `NETCON_STATUS` = 1;
public const val `NCS_CONNECT_FAILED`: `NETCON_STATUS` = 15;
public const val `NCS_CREDENTIALS_REQUIRED`: `NETCON_STATUS` = 12;
public const val `NCS_DISCONNECTED`: `NETCON_STATUS` = 0;
public const val `NCS_DISCONNECTING`: `NETCON_STATUS` = 3;
public const val `NCS_HARDWARE_DISABLED`: `NETCON_STATUS` = 5;
public const val `NCS_HARDWARE_MALFUNCTION`: `NETCON_STATUS` = 6;
public const val `NCS_HARDWARE_NOT_PRESENT`: `NETCON_STATUS` = 4;
public const val `NCS_INVALID_ADDRESS`: `NETCON_STATUS` = 11;
public const val `NCS_MEDIA_DISCONNECTED`: `NETCON_STATUS` = 7;
public const val `NCT_BRIDGE`: `NETCON_TYPE` = 6;
public const val `NCT_DIRECT_CONNECT`: `NETCON_TYPE` = 0;
public const val `NCT_INBOUND`: `NETCON_TYPE` = 1;
public const val `NCT_INTERNET`: `NETCON_TYPE` = 2;
public const val `NCT_LAN`: `NETCON_TYPE` = 3;
public const val `NCT_PHONE`: `NETCON_TYPE` = 4;
public const val `NCT_TUNNEL`: `NETCON_TYPE` = 5;
public const val `NCUC_DEFAULT`: `NETCONUI_CONNECT_FLAGS` = 0;
public const val `NCUC_ENABLE_DISABLE`: `NETCONUI_CONNECT_FLAGS` = 2;
public const val `NCUC_NO_UI`: `NETCONUI_CONNECT_FLAGS` = 1;
public typealias `NETCONMGR_ENUM_FLAGS` = Int;
public typealias `NETCONUI_CONNECT_FLAGS` = Int;
public typealias `NETCON_CHARACTERISTIC_FLAGS` = Int;
public const val `NETCON_MAX_NAME_LEN`: UInt = 256u;
public typealias `NETCON_MEDIATYPE` = Int;
// UNSUPPORTED Rust 212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NETCON_PROPERTIES {
//     pub guidId: windows_sys::core::GUID,
//     pub pszwName: windows_sys::core::PWSTR,
//     pub pszwDeviceName: windows_sys::core::PWSTR,
//     pub Status: NETCON_STATUS,
//     pub MediaType: NETCON_MEDIATYPE,
//     pub dwCharacter: u32,
//     pub clsidThisObject: windows_sys::core::GUID,
//     pub clsidUiObject: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 224:1: declaration Impl has no candidate rule
// impl Default for NETCON_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `NETCON_STATUS` = Int;
public typealias `NETCON_TYPE` = Int;
public typealias `NETISO_ERROR_TYPE` = Int;
public const val `NETISO_ERROR_TYPE_INTERNET_CLIENT`: `NETISO_ERROR_TYPE` = 2;
public const val `NETISO_ERROR_TYPE_INTERNET_CLIENT_SERVER`: `NETISO_ERROR_TYPE` = 3;
public const val `NETISO_ERROR_TYPE_MAX`: `NETISO_ERROR_TYPE` = 4;
public const val `NETISO_ERROR_TYPE_NONE`: `NETISO_ERROR_TYPE` = 0;
public const val `NETISO_ERROR_TYPE_PRIVATE_NETWORK`: `NETISO_ERROR_TYPE` = 1;
public typealias `NETISO_FLAG` = Int;
public const val `NETISO_FLAG_FORCE_COMPUTE_BINARIES`: `NETISO_FLAG` = 1;
public const val `NETISO_FLAG_MAX`: `NETISO_FLAG` = 2;
public const val `NETISO_GEID_FOR_NEUTRAL_AWARE`: UInt = 2u;
public const val `NETISO_GEID_FOR_WDAG`: UInt = 1u;
public typealias `NET_FW_ACTION` = Int;
public const val `NET_FW_ACTION_ALLOW`: `NET_FW_ACTION` = 1;
public const val `NET_FW_ACTION_BLOCK`: `NET_FW_ACTION` = 0;
public const val `NET_FW_ACTION_MAX`: `NET_FW_ACTION` = 2;
public const val `NET_FW_AUTHENTICATE_AND_ENCRYPT`: `NET_FW_AUTHENTICATE_TYPE` = 4;
public const val `NET_FW_AUTHENTICATE_AND_NEGOTIATE_ENCRYPTION`: `NET_FW_AUTHENTICATE_TYPE` = 3;
public const val `NET_FW_AUTHENTICATE_NONE`: `NET_FW_AUTHENTICATE_TYPE` = 0;
public const val `NET_FW_AUTHENTICATE_NO_ENCAPSULATION`: `NET_FW_AUTHENTICATE_TYPE` = 1;
public typealias `NET_FW_AUTHENTICATE_TYPE` = Int;
public const val `NET_FW_AUTHENTICATE_WITH_INTEGRITY`: `NET_FW_AUTHENTICATE_TYPE` = 2;
public typealias `NET_FW_EDGE_TRAVERSAL_TYPE` = Int;
public const val `NET_FW_EDGE_TRAVERSAL_TYPE_ALLOW`: `NET_FW_EDGE_TRAVERSAL_TYPE` = 1;
public const val `NET_FW_EDGE_TRAVERSAL_TYPE_DEFER_TO_APP`: `NET_FW_EDGE_TRAVERSAL_TYPE` = 2;
public const val `NET_FW_EDGE_TRAVERSAL_TYPE_DEFER_TO_USER`: `NET_FW_EDGE_TRAVERSAL_TYPE` = 3;
public const val `NET_FW_EDGE_TRAVERSAL_TYPE_DENY`: `NET_FW_EDGE_TRAVERSAL_TYPE` = 0;
public typealias `NET_FW_IP_PROTOCOL` = Int;
public const val `NET_FW_IP_PROTOCOL_ANY`: `NET_FW_IP_PROTOCOL` = 256;
public const val `NET_FW_IP_PROTOCOL_TCP`: `NET_FW_IP_PROTOCOL` = 6;
public const val `NET_FW_IP_PROTOCOL_UDP`: `NET_FW_IP_PROTOCOL` = 17;
public typealias `NET_FW_IP_VERSION` = Int;
public const val `NET_FW_IP_VERSION_ANY`: `NET_FW_IP_VERSION` = 2;
public const val `NET_FW_IP_VERSION_MAX`: `NET_FW_IP_VERSION` = 3;
public const val `NET_FW_IP_VERSION_V4`: `NET_FW_IP_VERSION` = 0;
public const val `NET_FW_IP_VERSION_V6`: `NET_FW_IP_VERSION` = 1;
public typealias `NET_FW_MODIFY_STATE` = Int;
public const val `NET_FW_MODIFY_STATE_GP_OVERRIDE`: `NET_FW_MODIFY_STATE` = 1;
public const val `NET_FW_MODIFY_STATE_INBOUND_BLOCKED`: `NET_FW_MODIFY_STATE` = 2;
public const val `NET_FW_MODIFY_STATE_OK`: `NET_FW_MODIFY_STATE` = 0;
public const val `NET_FW_POLICY_EFFECTIVE`: `NET_FW_POLICY_TYPE` = 2;
public const val `NET_FW_POLICY_GROUP`: `NET_FW_POLICY_TYPE` = 0;
public const val `NET_FW_POLICY_LOCAL`: `NET_FW_POLICY_TYPE` = 1;
public typealias `NET_FW_POLICY_TYPE` = Int;
public const val `NET_FW_POLICY_TYPE_MAX`: `NET_FW_POLICY_TYPE` = 3;
public const val `NET_FW_PROFILE2_ALL`: `NET_FW_PROFILE_TYPE2` = 2147483647;
public const val `NET_FW_PROFILE2_DOMAIN`: `NET_FW_PROFILE_TYPE2` = 1;
public const val `NET_FW_PROFILE2_PRIVATE`: `NET_FW_PROFILE_TYPE2` = 2;
public const val `NET_FW_PROFILE2_PUBLIC`: `NET_FW_PROFILE_TYPE2` = 4;
public const val `NET_FW_PROFILE_CURRENT`: `NET_FW_PROFILE_TYPE` = 2;
public const val `NET_FW_PROFILE_DOMAIN`: `NET_FW_PROFILE_TYPE` = 0;
public const val `NET_FW_PROFILE_STANDARD`: `NET_FW_PROFILE_TYPE` = 1;
public typealias `NET_FW_PROFILE_TYPE` = Int;
public typealias `NET_FW_PROFILE_TYPE2` = Int;
public const val `NET_FW_PROFILE_TYPE_MAX`: `NET_FW_PROFILE_TYPE` = 3;
public typealias `NET_FW_RULE_CATEGORY` = Int;
public const val `NET_FW_RULE_CATEGORY_BOOT`: `NET_FW_RULE_CATEGORY` = 0;
public const val `NET_FW_RULE_CATEGORY_CONSEC`: `NET_FW_RULE_CATEGORY` = 3;
public const val `NET_FW_RULE_CATEGORY_FIREWALL`: `NET_FW_RULE_CATEGORY` = 2;
public const val `NET_FW_RULE_CATEGORY_MAX`: `NET_FW_RULE_CATEGORY` = 4;
public const val `NET_FW_RULE_CATEGORY_STEALTH`: `NET_FW_RULE_CATEGORY` = 1;
public typealias `NET_FW_RULE_DIRECTION` = Int;
public const val `NET_FW_RULE_DIR_IN`: `NET_FW_RULE_DIRECTION` = 1;
public const val `NET_FW_RULE_DIR_MAX`: `NET_FW_RULE_DIRECTION` = 3;
public const val `NET_FW_RULE_DIR_OUT`: `NET_FW_RULE_DIRECTION` = 2;
public typealias `NET_FW_SCOPE` = Int;
public const val `NET_FW_SCOPE_ALL`: `NET_FW_SCOPE` = 0;
public const val `NET_FW_SCOPE_CUSTOM`: `NET_FW_SCOPE` = 2;
public const val `NET_FW_SCOPE_LOCAL_SUBNET`: `NET_FW_SCOPE` = 1;
public const val `NET_FW_SCOPE_MAX`: `NET_FW_SCOPE` = 3;
public const val `NET_FW_SERVICE_FILE_AND_PRINT`: `NET_FW_SERVICE_TYPE` = 0;
public const val `NET_FW_SERVICE_NONE`: `NET_FW_SERVICE_TYPE` = 3;
public const val `NET_FW_SERVICE_REMOTE_DESKTOP`: `NET_FW_SERVICE_TYPE` = 2;
public typealias `NET_FW_SERVICE_TYPE` = Int;
public const val `NET_FW_SERVICE_TYPE_MAX`: `NET_FW_SERVICE_TYPE` = 4;
public const val `NET_FW_SERVICE_UPNP`: `NET_FW_SERVICE_TYPE` = 1;
// UNSUPPORTED Rust 306:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetFwAuthorizedApplication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xec9846b3_2762_4a6b_a214_6acb603462d2);

// UNSUPPORTED Rust 307:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetFwMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x304ce942_6e39_40d8_943a_b913c40c9cd4);

// UNSUPPORTED Rust 308:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetFwOpenPort: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0ca545c6_37ad_4a6c_bf92_9f7610067ef5);

// UNSUPPORTED Rust 309:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetFwPolicy2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2b3c97f_6ae1_41ac_817a_f6f92166d7dd);

// UNSUPPORTED Rust 310:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetFwProduct: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d745ed8_c514_4d1d_bf42_751fed2d5ac7);

// UNSUPPORTED Rust 311:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetFwProducts: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc19079b_8272_4d73_bb70_cdb533527b61);

// UNSUPPORTED Rust 312:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetFwRule: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2c5bc43e_3369_4c33_ab0c_be9469677af4);

// UNSUPPORTED Rust 313:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetSharingManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c63c1ad_3956_4ff8_8486_40034758315b);

// UNSUPPORTED Rust 314:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type PAC_CHANGES_CALLBACK_FN = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, pchange: *const INET_FIREWALL_AC_CHANGE)>;

// UNSUPPORTED Rust 316:1: generic scalar type unsupported
// pub type PFN_FWADDDYNAMICKEYWORDADDRESS0 = Option<unsafe extern "system" fn(dynamickeywordaddress: *const FW_DYNAMIC_KEYWORD_ADDRESS0) -> u32>;

// UNSUPPORTED Rust 317:1: generic scalar type unsupported
// pub type PFN_FWDELETEDYNAMICKEYWORDADDRESS0 = Option<unsafe extern "system" fn(dynamickeywordaddressid: windows_sys::core::GUID) -> u32>;

// UNSUPPORTED Rust 318:1: generic scalar type unsupported
// pub type PFN_FWENUMDYNAMICKEYWORDADDRESSBYID0 = Option<unsafe extern "system" fn(dynamickeywordaddressid: windows_sys::core::GUID, dynamickeywordaddressdata: *mut *mut FW_DYNAMIC_KEYWORD_ADDRESS_DATA0) -> u32>;

// UNSUPPORTED Rust 319:1: generic scalar type unsupported
// pub type PFN_FWENUMDYNAMICKEYWORDADDRESSESBYTYPE0 = Option<unsafe extern "system" fn(flags: u32, dynamickeywordaddressdata: *mut *mut FW_DYNAMIC_KEYWORD_ADDRESS_DATA0) -> u32>;

// UNSUPPORTED Rust 320:1: generic scalar type unsupported
// pub type PFN_FWFREEDYNAMICKEYWORDADDRESSDATA0 = Option<unsafe extern "system" fn(dynamickeywordaddressdata: *const FW_DYNAMIC_KEYWORD_ADDRESS_DATA0) -> u32>;

// UNSUPPORTED Rust 321:1: generic scalar type unsupported
// pub type PFN_FWUPDATEDYNAMICKEYWORDADDRESS0 = Option<unsafe extern "system" fn(dynamickeywordaddressid: windows_sys::core::GUID, updatedaddresses: windows_sys::core::PCWSTR, append: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 322:1: generic scalar type unsupported
// pub type PNETISO_EDP_ID_CALLBACK_FN = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, wszenterpriseid: windows_sys::core::PCWSTR, dwerr: u32)>;

public typealias `SHARINGCONNECTIONTYPE` = Int;
public typealias `SHARINGCONNECTION_ENUM_FLAGS` = Int;
public const val `S_OBJECT_NO_LONGER_VALID`: Int = 2;
// UNSUPPORTED Rust 326:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPNAT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae1e00aa_3fd5_403c_8a27_2bbdc30cd0e1);

