// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn SwDeviceClose(hswdevice : HSWDEVICE));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Devices_Properties", feature = "Win32_Security"))]
// windows_link::link!("cfgmgr32.dll" "system" fn SwDeviceCreate(pszenumeratorname : windows_sys::core::PCWSTR, pszparentdeviceinstance : windows_sys::core::PCWSTR, pcreateinfo : *const SW_DEVICE_CREATE_INFO, cpropertycount : u32, pproperties : *const super::super::Properties:: DEVPROPERTY, pcallback : SW_DEVICE_CREATE_CALLBACK, pcontext : *const core::ffi::c_void, phswdevice : *mut HSWDEVICE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn SwDeviceGetLifetime(hswdevice : HSWDEVICE, plifetime : *mut SW_DEVICE_LIFETIME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn SwDeviceInterfacePropertySet(hswdevice : HSWDEVICE, pszdeviceinterfaceid : windows_sys::core::PCWSTR, cpropertycount : u32, pproperties : *const super::super::Properties:: DEVPROPERTY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn SwDeviceInterfaceRegister(hswdevice : HSWDEVICE, pinterfaceclassguid : *const windows_sys::core::GUID, pszreferencestring : windows_sys::core::PCWSTR, cpropertycount : u32, pproperties : *const super::super::Properties:: DEVPROPERTY, fenabled : windows_sys::core::BOOL, ppszdeviceinterfaceid : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn SwDeviceInterfaceSetState(hswdevice : HSWDEVICE, pszdeviceinterfaceid : windows_sys::core::PCWSTR, fenabled : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn SwDevicePropertySet(hswdevice : HSWDEVICE, cpropertycount : u32, pproperties : *const super::super::Properties:: DEVPROPERTY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn SwDeviceSetLifetime(hswdevice : HSWDEVICE, lifetime : SW_DEVICE_LIFETIME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn SwMemFree(pmem : *const core::ffi::c_void));

// UNSUPPORTED Rust 14:1: non-scalar type Ptr unsupported
// pub const ADDRESS_FAMILY_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AddressFamily");

public const val `FAULT_ACTION_SPECIFIC_BASE`: UInt = 600u;
public const val `FAULT_ACTION_SPECIFIC_MAX`: UInt = 899u;
public const val `FAULT_DEVICE_INTERNAL_ERROR`: UInt = 501u;
public const val `FAULT_INVALID_ACTION`: UInt = 401u;
public const val `FAULT_INVALID_ARG`: UInt = 402u;
public const val `FAULT_INVALID_SEQUENCE_NUMBER`: UInt = 403u;
public const val `FAULT_INVALID_VARIABLE`: UInt = 404u;
// UNSUPPORTED Rust 22:1: non-scalar type Ptr unsupported
// pub type HSWDEVICE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 23:1: non-scalar type Ptr unsupported
// pub const REMOTE_ADDRESS_VALUE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoteAddress");

public const val `SWDeviceCapabilitiesDriverRequired`: `SW_DEVICE_CAPABILITIES` = 8;
public const val `SWDeviceCapabilitiesNoDisplayInUI`: `SW_DEVICE_CAPABILITIES` = 4;
public const val `SWDeviceCapabilitiesNone`: `SW_DEVICE_CAPABILITIES` = 0;
public const val `SWDeviceCapabilitiesRemovable`: `SW_DEVICE_CAPABILITIES` = 1;
public const val `SWDeviceCapabilitiesSilentInstall`: `SW_DEVICE_CAPABILITIES` = 2;
public const val `SWDeviceLifetimeHandle`: `SW_DEVICE_LIFETIME` = 0;
public const val `SWDeviceLifetimeMax`: `SW_DEVICE_LIFETIME` = 2;
public const val `SWDeviceLifetimeParentPresent`: `SW_DEVICE_LIFETIME` = 1;
public typealias `SW_DEVICE_CAPABILITIES` = Int;
// UNSUPPORTED Rust 33:1: generic scalar type unsupported
// pub type SW_DEVICE_CREATE_CALLBACK = Option<unsafe extern "system" fn(hswdevice: HSWDEVICE, createresult: windows_sys::core::HRESULT, pcontext: *const core::ffi::c_void, pszdeviceinstanceid: windows_sys::core::PCWSTR)>;

// UNSUPPORTED Rust 34:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct SW_DEVICE_CREATE_INFO {
//     pub cbSize: u32,
//     pub pszInstanceId: windows_sys::core::PCWSTR,
//     pub pszzHardwareIds: windows_sys::core::PCWSTR,
//     pub pszzCompatibleIds: windows_sys::core::PCWSTR,
//     pub pContainerId: *const windows_sys::core::GUID,
//     pub CapabilityFlags: u32,
//     pub pszDeviceDescription: windows_sys::core::PCWSTR,
//     pub pszDeviceLocation: windows_sys::core::PCWSTR,
//     pub pSecurityDescriptor: *const super::super::super::Security::SECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 48:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for SW_DEVICE_CREATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SW_DEVICE_LIFETIME` = Int;
public const val `UPNP_ADDRESSFAMILY_BOTH`: UInt = 3u;
public const val `UPNP_ADDRESSFAMILY_IPv4`: UInt = 1u;
public const val `UPNP_ADDRESSFAMILY_IPv6`: UInt = 2u;
public const val `UPNP_E_ACTION_REQUEST_FAILED`: Int = -2147220976;
public const val `UPNP_E_ACTION_SPECIFIC_BASE`: Int = -2147220736;
public const val `UPNP_E_DEVICE_ELEMENT_EXPECTED`: Int = -2147220991;
public const val `UPNP_E_DEVICE_ERROR`: Int = -2147220972;
public const val `UPNP_E_DEVICE_NODE_INCOMPLETE`: Int = -2147220988;
public const val `UPNP_E_DEVICE_NOTREGISTERED`: Int = -2147180494;
public const val `UPNP_E_DEVICE_RUNNING`: Int = -2147180495;
public const val `UPNP_E_DEVICE_TIMEOUT`: Int = -2147220969;
public const val `UPNP_E_DUPLICATE_NOT_ALLOWED`: Int = -2147180511;
public const val `UPNP_E_DUPLICATE_SERVICE_ID`: Int = -2147180510;
public const val `UPNP_E_ERROR_PROCESSING_RESPONSE`: Int = -2147220970;
public const val `UPNP_E_EVENT_SUBSCRIPTION_FAILED`: Int = -2147220223;
public const val `UPNP_E_ICON_ELEMENT_EXPECTED`: Int = -2147220987;
public const val `UPNP_E_ICON_NODE_INCOMPLETE`: Int = -2147220986;
public const val `UPNP_E_INVALID_ACTION`: Int = -2147220985;
public const val `UPNP_E_INVALID_ARGUMENTS`: Int = -2147220984;
public const val `UPNP_E_INVALID_DESCRIPTION`: Int = -2147180509;
public const val `UPNP_E_INVALID_DOCUMENT`: Int = -2147220224;
public const val `UPNP_E_INVALID_ICON`: Int = -2147180507;
public const val `UPNP_E_INVALID_ROOT_NAMESPACE`: Int = -2147180505;
public const val `UPNP_E_INVALID_SERVICE`: Int = -2147180508;
public const val `UPNP_E_INVALID_VARIABLE`: Int = -2147220973;
public const val `UPNP_E_INVALID_XML`: Int = -2147180506;
public const val `UPNP_E_OUT_OF_SYNC`: Int = -2147220983;
public const val `UPNP_E_PROTOCOL_ERROR`: Int = -2147220971;
public const val `UPNP_E_REQUIRED_ELEMENT_ERROR`: Int = -2147180512;
public const val `UPNP_E_ROOT_ELEMENT_EXPECTED`: Int = -2147220992;
public const val `UPNP_E_SERVICE_ELEMENT_EXPECTED`: Int = -2147220990;
public const val `UPNP_E_SERVICE_NODE_INCOMPLETE`: Int = -2147220989;
public const val `UPNP_E_SUFFIX_TOO_LONG`: Int = -2147180504;
public const val `UPNP_E_TRANSPORT_ERROR`: Int = -2147220975;
public const val `UPNP_E_URLBASE_PRESENT`: Int = -2147180503;
public const val `UPNP_E_VALUE_TOO_LONG`: Int = -2147180496;
public const val `UPNP_E_VARIABLE_VALUE_UNKNOWN`: Int = -2147220974;
public const val `UPNP_SERVICE_DELAY_SCPD_AND_SUBSCRIPTION`: UInt = 1u;
// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPDescriptionDocument: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d8a9b47_3a28_4ce2_8a4b_bd34e45bceeb);

// UNSUPPORTED Rust 94:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPDescriptionDocumentEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33fd0563_d81a_4393_83cc_0195b1da2f91);

// UNSUPPORTED Rust 95:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPDevice: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa32552c5_ba61_457a_b59a_a2561e125e33);

// UNSUPPORTED Rust 96:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPDeviceFinder: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2085f28_feb7_404a_b8e7_e659bdeaaa02);

// UNSUPPORTED Rust 97:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPDeviceFinderEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x181b54fc_380b_4a75_b3f1_4ac45e9605b0);

// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPDevices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9e84ffd_ad3c_40a4_b835_0882ebcbaaa8);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPRegistrar: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x204810b9_73b2_11d4_bf42_00b0d0118b56);

// UNSUPPORTED Rust 100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPRemoteEndpointInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2e5e84e9_4049_4244_b728_2d24227157c7);

// UNSUPPORTED Rust 101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPService: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc624ba95_fbcb_4409_8c03_8cceec533ef1);

// UNSUPPORTED Rust 102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const UPnPServices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc0bc4b4a_a406_4efc_932f_b8546b8100cc);

