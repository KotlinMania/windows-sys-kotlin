// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("bthprops.cpl" "system" fn BluetoothAuthenticateDevice(hwndparent : super::super::Foundation:: HWND, hradio : super::super::Foundation:: HANDLE, pbtbi : *mut BLUETOOTH_DEVICE_INFO, pszpasskey : windows_sys::core::PCWSTR, ulpasskeylength : u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("bthprops.cpl" "system" fn BluetoothAuthenticateDeviceEx(hwndparentin : super::super::Foundation:: HWND, hradioin : super::super::Foundation:: HANDLE, pbtdiinout : *mut BLUETOOTH_DEVICE_INFO, pbtoobdata : *const BLUETOOTH_OOB_DATA_INFO, authenticationrequirement : AUTHENTICATION_REQUIREMENTS) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("bthprops.cpl" "system" fn BluetoothAuthenticateMultipleDevices(hwndparent : super::super::Foundation:: HWND, hradio : super::super::Foundation:: HANDLE, cdevices : u32, rgbtdi : *mut BLUETOOTH_DEVICE_INFO) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("bthprops.cpl" "system" fn BluetoothDisplayDeviceProperties(hwndparent : super::super::Foundation:: HWND, pbtdi : *mut BLUETOOTH_DEVICE_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothEnableDiscovery(hradio : super::super::Foundation:: HANDLE, fenabled : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothEnableIncomingConnections(hradio : super::super::Foundation:: HANDLE, fenabled : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothEnumerateInstalledServices(hradio : super::super::Foundation:: HANDLE, pbtdi : *const BLUETOOTH_DEVICE_INFO, pcserviceinout : *mut u32, pguidservices : *mut windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothFindDeviceClose(hfind : HBLUETOOTH_DEVICE_FIND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothFindFirstDevice(pbtsp : *const BLUETOOTH_DEVICE_SEARCH_PARAMS, pbtdi : *mut BLUETOOTH_DEVICE_INFO) -> HBLUETOOTH_DEVICE_FIND);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothFindFirstRadio(pbtfrp : *const BLUETOOTH_FIND_RADIO_PARAMS, phradio : *mut super::super::Foundation:: HANDLE) -> HBLUETOOTH_RADIO_FIND);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothFindNextDevice(hfind : HBLUETOOTH_DEVICE_FIND, pbtdi : *mut BLUETOOTH_DEVICE_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothFindNextRadio(hfind : HBLUETOOTH_RADIO_FIND, phradio : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothFindRadioClose(hfind : HBLUETOOTH_RADIO_FIND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTAbortReliableWrite(hdevice : super::super::Foundation:: HANDLE, reliablewritecontext : u64, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTBeginReliableWrite(hdevice : super::super::Foundation:: HANDLE, reliablewritecontext : *mut u64, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTEndReliableWrite(hdevice : super::super::Foundation:: HANDLE, reliablewritecontext : u64, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTGetCharacteristicValue(hdevice : super::super::Foundation:: HANDLE, characteristic : *const BTH_LE_GATT_CHARACTERISTIC, characteristicvaluedatasize : u32, characteristicvalue : *mut BTH_LE_GATT_CHARACTERISTIC_VALUE, characteristicvaluesizerequired : *mut u16, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTGetCharacteristics(hdevice : super::super::Foundation:: HANDLE, service : *const BTH_LE_GATT_SERVICE, characteristicsbuffercount : u16, characteristicsbuffer : *mut BTH_LE_GATT_CHARACTERISTIC, characteristicsbufferactual : *mut u16, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTGetDescriptorValue(hdevice : super::super::Foundation:: HANDLE, descriptor : *const BTH_LE_GATT_DESCRIPTOR, descriptorvaluedatasize : u32, descriptorvalue : *mut BTH_LE_GATT_DESCRIPTOR_VALUE, descriptorvaluesizerequired : *mut u16, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTGetDescriptors(hdevice : super::super::Foundation:: HANDLE, characteristic : *const BTH_LE_GATT_CHARACTERISTIC, descriptorsbuffercount : u16, descriptorsbuffer : *mut BTH_LE_GATT_DESCRIPTOR, descriptorsbufferactual : *mut u16, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTGetIncludedServices(hdevice : super::super::Foundation:: HANDLE, parentservice : *const BTH_LE_GATT_SERVICE, includedservicesbuffercount : u16, includedservicesbuffer : *mut BTH_LE_GATT_SERVICE, includedservicesbufferactual : *mut u16, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTGetServices(hdevice : super::super::Foundation:: HANDLE, servicesbuffercount : u16, servicesbuffer : *mut BTH_LE_GATT_SERVICE, servicesbufferactual : *mut u16, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTRegisterEvent(hservice : super::super::Foundation:: HANDLE, eventtype : BTH_LE_GATT_EVENT_TYPE, eventparameterin : *const core::ffi::c_void, callback : PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext : *const core::ffi::c_void, peventhandle : *mut isize, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTSetCharacteristicValue(hdevice : super::super::Foundation:: HANDLE, characteristic : *const BTH_LE_GATT_CHARACTERISTIC, characteristicvalue : *const BTH_LE_GATT_CHARACTERISTIC_VALUE, reliablewritecontext : u64, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTSetDescriptorValue(hdevice : super::super::Foundation:: HANDLE, descriptor : *const BTH_LE_GATT_DESCRIPTOR, descriptorvalue : *const BTH_LE_GATT_DESCRIPTOR_VALUE, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGATTUnregisterEvent(eventhandle : isize, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGetDeviceInfo(hradio : super::super::Foundation:: HANDLE, pbtdi : *mut BLUETOOTH_DEVICE_INFO) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothGetRadioInfo(hradio : super::super::Foundation:: HANDLE, pradioinfo : *mut BLUETOOTH_RADIO_INFO) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothIsConnectable(hradio : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothIsDiscoverable(hradio : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothIsVersionAvailable(majorversion : u8, minorversion : u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothRegisterForAuthentication(pbtdi : *const BLUETOOTH_DEVICE_INFO, phreghandle : *mut isize, pfncallback : PFN_AUTHENTICATION_CALLBACK, pvparam : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothRegisterForAuthenticationEx(pbtdiin : *const BLUETOOTH_DEVICE_INFO, phreghandleout : *mut isize, pfncallbackin : PFN_AUTHENTICATION_CALLBACK_EX, pvparam : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothRemoveDevice(paddress : *const BLUETOOTH_ADDRESS) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSdpEnumAttributes(psdpstream : *const u8, cbstreamsize : u32, pfncallback : PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK, pvparam : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSdpGetAttributeValue(precordstream : *const u8, cbrecordlength : u32, usattributeid : u16, pattributedata : *mut SDP_ELEMENT_DATA) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSdpGetContainerElementData(pcontainerstream : *const u8, cbcontainerlength : u32, pelement : *mut isize, pdata : *mut SDP_ELEMENT_DATA) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSdpGetElementData(psdpstream : *const u8, cbsdpstreamlength : u32, pdata : *mut SDP_ELEMENT_DATA) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSdpGetString(precordstream : *const u8, cbrecordlength : u32, pstringdata : *const SDP_STRING_TYPE_DATA, usstringoffset : u16, pszstring : windows_sys::core::PWSTR, pcchstringlength : *mut u32) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("bthprops.cpl" "system" fn BluetoothSelectDevices(pbtsdp : *mut BLUETOOTH_SELECT_DEVICE_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("bthprops.cpl" "system" fn BluetoothSelectDevicesFree(pbtsdp : *mut BLUETOOTH_SELECT_DEVICE_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSendAuthenticationResponse(hradio : super::super::Foundation:: HANDLE, pbtdi : *const BLUETOOTH_DEVICE_INFO, pszpasskey : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSendAuthenticationResponseEx(hradioin : super::super::Foundation:: HANDLE, pauthresponse : *const BLUETOOTH_AUTHENTICATE_RESPONSE) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSetLocalServiceInfo(hradioin : super::super::Foundation:: HANDLE, pclassguid : *const windows_sys::core::GUID, ulinstance : u32, pserviceinfoin : *const BLUETOOTH_LOCAL_SERVICE_INFO) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothSetServiceState(hradio : super::super::Foundation:: HANDLE, pbtdi : *const BLUETOOTH_DEVICE_INFO, pguidservice : *const windows_sys::core::GUID, dwserviceflags : u32) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothUnregisterAuthentication(hreghandle : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("bluetoothapis.dll" "system" fn BluetoothUpdateDeviceRecord(pbtdi : *const BLUETOOTH_DEVICE_INFO) -> u32);

public const val `A2DP_SINK_SUPPORTED_FEATURES_AMPLIFIER`: UInt = 8u;
public const val `A2DP_SINK_SUPPORTED_FEATURES_HEADPHONE`: UInt = 1u;
public const val `A2DP_SINK_SUPPORTED_FEATURES_RECORDER`: UInt = 4u;
public const val `A2DP_SINK_SUPPORTED_FEATURES_SPEAKER`: UInt = 2u;
public const val `A2DP_SOURCE_SUPPORTED_FEATURES_MICROPHONE`: UInt = 2u;
public const val `A2DP_SOURCE_SUPPORTED_FEATURES_MIXER`: UInt = 8u;
public const val `A2DP_SOURCE_SUPPORTED_FEATURES_PLAYER`: UInt = 1u;
public const val `A2DP_SOURCE_SUPPORTED_FEATURES_TUNER`: UInt = 4u;
public const val `AF_BTH`: UShort = 32u;
public const val `ATT_PROTOCOL_UUID16`: UInt = 7u;
public typealias `AUTHENTICATION_REQUIREMENTS` = Int;
public const val `AVCTP_PROTOCOL_UUID16`: UInt = 23u;
public const val `AVDTP_PROTOCOL_UUID16`: UInt = 25u;
public const val `AVRCP_SUPPORTED_FEATURES_CATEGORY_1`: UInt = 1u;
public const val `AVRCP_SUPPORTED_FEATURES_CATEGORY_2`: UInt = 2u;
public const val `AVRCP_SUPPORTED_FEATURES_CATEGORY_3`: UInt = 4u;
public const val `AVRCP_SUPPORTED_FEATURES_CATEGORY_4`: UInt = 8u;
public const val `AVRCP_SUPPORTED_FEATURES_CT_BROWSING`: UInt = 64u;
public const val `AVRCP_SUPPORTED_FEATURES_CT_COVER_ART_IMAGE`: UInt = 256u;
public const val `AVRCP_SUPPORTED_FEATURES_CT_COVER_ART_IMAGE_PROPERTIES`: UInt = 128u;
public const val `AVRCP_SUPPORTED_FEATURES_CT_COVER_ART_LINKED_THUMBNAIL`: UInt = 512u;
public const val `AVRCP_SUPPORTED_FEATURES_TG_BROWSING`: UInt = 64u;
public const val `AVRCP_SUPPORTED_FEATURES_TG_COVER_ART`: UInt = 256u;
public const val `AVRCP_SUPPORTED_FEATURES_TG_GROUP_NAVIGATION`: UInt = 32u;
public const val `AVRCP_SUPPORTED_FEATURES_TG_MULTIPLE_PLAYER_APPLICATIONS`: UInt = 128u;
public const val `AVRCP_SUPPORTED_FEATURES_TG_PLAYER_APPLICATION_SETTINGS`: UInt = 16u;
public const val `AVRemoteControlControllerServiceClass_UUID16`: UInt = 4367u;
public const val `AVRemoteControlServiceClassID_UUID16`: UInt = 4366u;
public const val `AVRemoteControlTargetServiceClassID_UUID16`: UInt = 4364u;
public const val `AdvancedAudioDistributionProfileID_UUID16`: UInt = 4365u;
public const val `AdvancedAudioDistributionServiceClassID_UUID16`: UInt = 4365u;
public const val `AudioSinkServiceClassID_UUID16`: UInt = 4363u;
public const val `AudioSinkSourceServiceClassID_UUID16`: UInt = 4363u;
public const val `AudioSourceServiceClassID_UUID16`: UInt = 4362u;
public const val `AudioVideoServiceClassID_UUID16`: UInt = 4396u;
public const val `AudioVideoServiceClass_UUID16`: UInt = 4396u;
public const val `BDIF_ADDRESS`: UInt = 1u;
public const val `BDIF_BR`: UInt = 16384u;
public const val `BDIF_BR_SECURE_CONNECTION_PAIRED`: UInt = 134217728u;
public const val `BDIF_COD`: UInt = 2u;
public const val `BDIF_CONNECTED`: UInt = 32u;
public const val `BDIF_DEBUGKEY`: UInt = 536870912u;
public const val `BDIF_EIR`: UInt = 8192u;
public const val `BDIF_LE`: UInt = 32768u;
public const val `BDIF_LE_CONNECTABLE`: UInt = 33554432u;
public const val `BDIF_LE_CONNECTED`: UInt = 16777216u;
public const val `BDIF_LE_DEBUGKEY`: UInt = 1073741824u;
public const val `BDIF_LE_DISCOVERABLE`: UInt = 2097152u;
public const val `BDIF_LE_MITM_PROTECTED`: UInt = 262144u;
public const val `BDIF_LE_NAME`: UInt = 4194304u;
public const val `BDIF_LE_PAIRED`: UInt = 65536u;
public const val `BDIF_LE_PERSONAL`: UInt = 131072u;
public const val `BDIF_LE_PRIVACY_ENABLED`: UInt = 524288u;
public const val `BDIF_LE_RANDOM_ADDRESS_TYPE`: UInt = 1048576u;
public const val `BDIF_LE_SECURE_CONNECTION_PAIRED`: UInt = 268435456u;
public const val `BDIF_LE_VISIBLE`: UInt = 8388608u;
public const val `BDIF_NAME`: UInt = 4u;
public const val `BDIF_PAIRED`: UInt = 8u;
public const val `BDIF_PERSONAL`: UInt = 16u;
public const val `BDIF_RSSI`: UInt = 4096u;
public const val `BDIF_SHORT_NAME`: UInt = 64u;
public const val `BDIF_SSP_MITM_PROTECTED`: UInt = 1024u;
public const val `BDIF_SSP_PAIRED`: UInt = 512u;
public const val `BDIF_SSP_SUPPORTED`: UInt = 256u;
public const val `BDIF_TX_POWER`: UInt = 2147483648u;
public const val `BDIF_VISIBLE`: UInt = 128u;
// UNSUPPORTED Rust 114:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_ADDRESS {
//     pub Anonymous: BLUETOOTH_ADDRESS_0,
// }

// UNSUPPORTED Rust 119:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 124:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BLUETOOTH_ADDRESS_0 {
//     pub ullLong: u64,
//     pub rgBytes: [u8; 6],
// }

// UNSUPPORTED Rust 130:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_ADDRESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 135:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_AUTHENTICATE_RESPONSE {
//     pub bthAddressRemote: BLUETOOTH_ADDRESS,
//     pub authMethod: BLUETOOTH_AUTHENTICATION_METHOD,
//     pub Anonymous: BLUETOOTH_AUTHENTICATE_RESPONSE_0,
//     pub negativeResponse: u8,
// }

// UNSUPPORTED Rust 143:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_AUTHENTICATE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 148:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BLUETOOTH_AUTHENTICATE_RESPONSE_0 {
//     pub pinInfo: BLUETOOTH_PIN_INFO,
//     pub oobInfo: BLUETOOTH_OOB_DATA_INFO,
//     pub numericCompInfo: BLUETOOTH_NUMERIC_COMPARISON_INFO,
//     pub passkeyInfo: BLUETOOTH_PASSKEY_INFO,
// }

// UNSUPPORTED Rust 156:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_AUTHENTICATE_RESPONSE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS {
//     pub deviceInfo: BLUETOOTH_DEVICE_INFO,
//     pub authenticationMethod: BLUETOOTH_AUTHENTICATION_METHOD,
//     pub ioCapability: BLUETOOTH_IO_CAPABILITY,
//     pub authenticationRequirements: BLUETOOTH_AUTHENTICATION_REQUIREMENTS,
//     pub Anonymous: BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS_0,
// }

// UNSUPPORTED Rust 170:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 175:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS_0 {
//     pub Numeric_Value: u32,
//     pub Passkey: u32,
// }

// UNSUPPORTED Rust 181:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BLUETOOTH_AUTHENTICATION_METHOD` = Int;
public const val `BLUETOOTH_AUTHENTICATION_METHOD_LEGACY`: `BLUETOOTH_AUTHENTICATION_METHOD` = 1;
public const val `BLUETOOTH_AUTHENTICATION_METHOD_NUMERIC_COMPARISON`: `BLUETOOTH_AUTHENTICATION_METHOD` = 3;
public const val `BLUETOOTH_AUTHENTICATION_METHOD_OOB`: `BLUETOOTH_AUTHENTICATION_METHOD` = 2;
public const val `BLUETOOTH_AUTHENTICATION_METHOD_PASSKEY`: `BLUETOOTH_AUTHENTICATION_METHOD` = 5;
public const val `BLUETOOTH_AUTHENTICATION_METHOD_PASSKEY_NOTIFICATION`: `BLUETOOTH_AUTHENTICATION_METHOD` = 4;
public typealias `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = Int;
// UNSUPPORTED Rust 193:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_COD_PAIRS {
//     pub ulCODMask: u32,
//     pub pcszDescription: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 199:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_COD_PAIRS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 204:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_DEVICE_INFO {
//     pub dwSize: u32,
//     pub Address: BLUETOOTH_ADDRESS,
//     pub ulClassofDevice: u32,
//     pub fConnected: windows_sys::core::BOOL,
//     pub fRemembered: windows_sys::core::BOOL,
//     pub fAuthenticated: windows_sys::core::BOOL,
//     pub stLastSeen: super::super::Foundation::SYSTEMTIME,
//     pub stLastUsed: super::super::Foundation::SYSTEMTIME,
//     pub szName: [u16; 248],
// }

// UNSUPPORTED Rust 217:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BLUETOOTH_DEVICE_NAME_SIZE`: UInt = 256u;
// UNSUPPORTED Rust 223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_DEVICE_SEARCH_PARAMS {
//     pub dwSize: u32,
//     pub fReturnAuthenticated: windows_sys::core::BOOL,
//     pub fReturnRemembered: windows_sys::core::BOOL,
//     pub fReturnUnknown: windows_sys::core::BOOL,
//     pub fReturnConnected: windows_sys::core::BOOL,
//     pub fIssueInquiry: windows_sys::core::BOOL,
//     pub cTimeoutMultiplier: u8,
//     pub hRadio: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 235:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_DEVICE_SEARCH_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BLUETOOTH_FIND_RADIO_PARAMS {
//     pub dwSize: u32,
// }

public const val `BLUETOOTH_GATT_FLAG_CONNECTION_AUTHENTICATED`: UInt = 2u;
public const val `BLUETOOTH_GATT_FLAG_CONNECTION_ENCRYPTED`: UInt = 1u;
public const val `BLUETOOTH_GATT_FLAG_FORCE_READ_FROM_CACHE`: UInt = 8u;
public const val `BLUETOOTH_GATT_FLAG_FORCE_READ_FROM_DEVICE`: UInt = 4u;
public const val `BLUETOOTH_GATT_FLAG_NONE`: UInt = 0u;
public const val `BLUETOOTH_GATT_FLAG_RETURN_ALL`: UInt = 64u;
public const val `BLUETOOTH_GATT_FLAG_SIGNED_WRITE`: UInt = 16u;
public const val `BLUETOOTH_GATT_FLAG_WRITE_WITHOUT_RESPONSE`: UInt = 32u;
// UNSUPPORTED Rust 253:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_GATT_VALUE_CHANGED_EVENT {
//     pub ChangedAttributeHandle: u16,
//     pub CharacteristicValueDataSize: usize,
//     pub CharacteristicValue: *mut BTH_LE_GATT_CHARACTERISTIC_VALUE,
// }

// UNSUPPORTED Rust 260:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_GATT_VALUE_CHANGED_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_GATT_VALUE_CHANGED_EVENT_REGISTRATION {
//     pub NumCharacteristics: u16,
//     pub Characteristics: [BTH_LE_GATT_CHARACTERISTIC; 1],
// }

// UNSUPPORTED Rust 271:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_GATT_VALUE_CHANGED_EVENT_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BLUETOOTH_IO_CAPABILITY` = Int;
public const val `BLUETOOTH_IO_CAPABILITY_DISPLAYONLY`: `BLUETOOTH_IO_CAPABILITY` = 0;
public const val `BLUETOOTH_IO_CAPABILITY_DISPLAYYESNO`: `BLUETOOTH_IO_CAPABILITY` = 1;
public const val `BLUETOOTH_IO_CAPABILITY_KEYBOARDONLY`: `BLUETOOTH_IO_CAPABILITY` = 2;
public const val `BLUETOOTH_IO_CAPABILITY_NOINPUTNOOUTPUT`: `BLUETOOTH_IO_CAPABILITY` = 3;
public const val `BLUETOOTH_IO_CAPABILITY_UNDEFINED`: `BLUETOOTH_IO_CAPABILITY` = 255;
// UNSUPPORTED Rust 282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_LOCAL_SERVICE_INFO {
//     pub Enabled: windows_sys::core::BOOL,
//     pub btAddr: BLUETOOTH_ADDRESS,
//     pub szName: [u16; 256],
//     pub szDeviceString: [u16; 256],
// }

// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_LOCAL_SERVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BLUETOOTH_MAX_NAME_SIZE`: UInt = 248u;
public const val `BLUETOOTH_MAX_PASSKEY_BUFFER_SIZE`: UInt = 17u;
public const val `BLUETOOTH_MAX_PASSKEY_SIZE`: UInt = 16u;
public const val `BLUETOOTH_MAX_SERVICE_NAME_SIZE`: UInt = 256u;
public const val `BLUETOOTH_MITM_ProtectionNotDefined`: `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = 255;
public const val `BLUETOOTH_MITM_ProtectionNotRequired`: `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = 0;
public const val `BLUETOOTH_MITM_ProtectionNotRequiredBonding`: `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = 2;
public const val `BLUETOOTH_MITM_ProtectionNotRequiredGeneralBonding`: `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = 4;
public const val `BLUETOOTH_MITM_ProtectionRequired`: `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = 1;
public const val `BLUETOOTH_MITM_ProtectionRequiredBonding`: `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = 3;
public const val `BLUETOOTH_MITM_ProtectionRequiredGeneralBonding`: `BLUETOOTH_AUTHENTICATION_REQUIREMENTS` = 5;
// UNSUPPORTED Rust 306:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BLUETOOTH_NUMERIC_COMPARISON_INFO {
//     pub NumericValue: u32,
// }

// UNSUPPORTED Rust 311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_OOB_DATA_INFO {
//     pub C: [u8; 16],
//     pub R: [u8; 16],
// }

// UNSUPPORTED Rust 317:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_OOB_DATA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BLUETOOTH_PASSKEY_INFO {
//     pub passkey: u32,
// }

// UNSUPPORTED Rust 327:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_PIN_INFO {
//     pub pin: [u8; 16],
//     pub pinLength: u8,
// }

// UNSUPPORTED Rust 333:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_PIN_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 338:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_RADIO_INFO {
//     pub dwSize: u32,
//     pub address: BLUETOOTH_ADDRESS,
//     pub szName: [u16; 248],
//     pub ulClassofDevice: u32,
//     pub lmpSubversion: u16,
//     pub manufacturer: u16,
// }

// UNSUPPORTED Rust 348:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_RADIO_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BLUETOOTH_SELECT_DEVICE_PARAMS {
//     pub dwSize: u32,
//     pub cNumOfClasses: u32,
//     pub prgClassOfDevices: *mut BLUETOOTH_COD_PAIRS,
//     pub pszInfo: windows_sys::core::PWSTR,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub fForceAuthentication: windows_sys::core::BOOL,
//     pub fShowAuthenticated: windows_sys::core::BOOL,
//     pub fShowRemembered: windows_sys::core::BOOL,
//     pub fShowUnknown: windows_sys::core::BOOL,
//     pub fAddNewDeviceWizard: windows_sys::core::BOOL,
//     pub fSkipServicesPage: windows_sys::core::BOOL,
//     pub pfnDeviceCallback: PFN_DEVICE_CALLBACK,
//     pub pvParam: *mut core::ffi::c_void,
//     pub cNumDevices: u32,
//     pub pDevices: *mut BLUETOOTH_DEVICE_INFO,
// }

// UNSUPPORTED Rust 372:1: declaration Impl has no candidate rule
// impl Default for BLUETOOTH_SELECT_DEVICE_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BLUETOOTH_SERVICE_DISABLE`: UInt = 0u;
public const val `BLUETOOTH_SERVICE_ENABLE`: UInt = 1u;
public const val `BNEP_PROTOCOL_UUID16`: UInt = 15u;
public const val `BTHLEENUM_ATT_MTU_DEFAULT`: UInt = 23u;
public const val `BTHLEENUM_ATT_MTU_INITIAL_NEGOTIATION`: UInt = 525u;
public const val `BTHLEENUM_ATT_MTU_MAX`: UInt = 65535u;
public const val `BTHLEENUM_ATT_MTU_MIN`: UInt = 23u;
public const val `BTHNS_RESULT_DEVICE_AUTHENTICATED`: UInt = 262144u;
public const val `BTHNS_RESULT_DEVICE_CONNECTED`: UInt = 65536u;
public const val `BTHNS_RESULT_DEVICE_REMEMBERED`: UInt = 131072u;
public const val `BTHPROTO_L2CAP`: UInt = 256u;
public const val `BTHPROTO_RFCOMM`: UInt = 3u;
public const val `BTH_ADDR_GIAC`: UInt = 10390323u;
public const val `BTH_ADDR_IAC_FIRST`: UInt = 10390272u;
public const val `BTH_ADDR_IAC_LAST`: UInt = 10390335u;
public const val `BTH_ADDR_LIAC`: UInt = 10390272u;
public const val `BTH_ADDR_STRING_SIZE`: UInt = 12u;
// UNSUPPORTED Rust 394:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_DEVICE_INFO {
//     pub flags: u32,
//     pub address: u64,
//     pub classOfDevice: u32,
//     pub name: [i8; 248],
// }

// UNSUPPORTED Rust 402:1: declaration Impl has no candidate rule
// impl Default for BTH_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BTH_EIR_128_UUIDS_COMPLETE_ID`: UInt = 7u;
public const val `BTH_EIR_128_UUIDS_PARTIAL_ID`: UInt = 6u;
public const val `BTH_EIR_16_UUIDS_COMPLETE_ID`: UInt = 3u;
public const val `BTH_EIR_16_UUIDS_PARTIAL_ID`: UInt = 2u;
public const val `BTH_EIR_32_UUIDS_COMPLETE_ID`: UInt = 5u;
public const val `BTH_EIR_32_UUIDS_PARTIAL_ID`: UInt = 4u;
public const val `BTH_EIR_FLAGS_ID`: UInt = 1u;
public const val `BTH_EIR_LOCAL_NAME_COMPLETE_ID`: UInt = 9u;
public const val `BTH_EIR_LOCAL_NAME_PARTIAL_ID`: UInt = 8u;
public const val `BTH_EIR_MANUFACTURER_ID`: UInt = 255u;
public const val `BTH_EIR_OOB_BD_ADDR_ID`: UInt = 12u;
public const val `BTH_EIR_OOB_COD_ID`: UInt = 13u;
public const val `BTH_EIR_OOB_OPT_DATA_LEN_ID`: UInt = 11u;
public const val `BTH_EIR_OOB_SP_HASH_ID`: UInt = 14u;
public const val `BTH_EIR_OOB_SP_RANDOMIZER_ID`: UInt = 15u;
public const val `BTH_EIR_SIZE`: UInt = 240u;
public const val `BTH_EIR_TX_POWER_LEVEL_ID`: UInt = 10u;
public const val `BTH_ERROR_ACL_CONNECTION_ALREADY_EXISTS`: UInt = 11u;
public const val `BTH_ERROR_AUTHENTICATION_FAILURE`: UInt = 5u;
public const val `BTH_ERROR_CHANNEL_CLASSIFICATION_NOT_SUPPORTED`: UInt = 46u;
public const val `BTH_ERROR_COARSE_CLOCK_ADJUSTMENT_REJECTED`: UInt = 64u;
public const val `BTH_ERROR_COMMAND_DISALLOWED`: UInt = 12u;
public const val `BTH_ERROR_CONNECTION_FAILED_TO_BE_ESTABLISHED`: UInt = 62u;
public const val `BTH_ERROR_CONNECTION_REJECTED_DUE_TO_NO_SUITABLE_CHANNEL_FOUND`: UInt = 57u;
public const val `BTH_ERROR_CONNECTION_TERMINATED_DUE_TO_MIC_FAILURE`: UInt = 61u;
public const val `BTH_ERROR_CONNECTION_TIMEOUT`: UInt = 8u;
public const val `BTH_ERROR_CONTROLLER_BUSY`: UInt = 58u;
public const val `BTH_ERROR_DIFFERENT_TRANSACTION_COLLISION`: UInt = 42u;
public const val `BTH_ERROR_DIRECTED_ADVERTISING_TIMEOUT`: UInt = 60u;
public const val `BTH_ERROR_ENCRYPTION_MODE_NOT_ACCEPTABLE`: UInt = 37u;
public const val `BTH_ERROR_EXTENDED_INQUIRY_RESPONSE_TOO_LARGE`: UInt = 54u;
public const val `BTH_ERROR_HARDWARE_FAILURE`: UInt = 3u;
public const val `BTH_ERROR_HOST_BUSY_PAIRING`: UInt = 56u;
public const val `BTH_ERROR_HOST_REJECTED_LIMITED_RESOURCES`: UInt = 13u;
public const val `BTH_ERROR_HOST_REJECTED_PERSONAL_DEVICE`: UInt = 15u;
public const val `BTH_ERROR_HOST_REJECTED_SECURITY_REASONS`: UInt = 14u;
public const val `BTH_ERROR_HOST_TIMEOUT`: UInt = 16u;
public const val `BTH_ERROR_INSTANT_PASSED`: UInt = 40u;
public const val `BTH_ERROR_INSUFFICIENT_SECURITY`: UInt = 47u;
public const val `BTH_ERROR_INVALID_HCI_PARAMETER`: UInt = 18u;
public const val `BTH_ERROR_INVALID_LMP_PARAMETERS`: UInt = 30u;
public const val `BTH_ERROR_KEY_MISSING`: UInt = 6u;
public const val `BTH_ERROR_LIMIT_REACHED`: UInt = 67u;
public const val `BTH_ERROR_LMP_PDU_NOT_ALLOWED`: UInt = 36u;
public const val `BTH_ERROR_LMP_RESPONSE_TIMEOUT`: UInt = 34u;
public const val `BTH_ERROR_LMP_TRANSACTION_COLLISION`: UInt = 35u;
public const val `BTH_ERROR_LOCAL_HOST_TERMINATED_CONNECTION`: UInt = 22u;
public const val `BTH_ERROR_MAC_CONNECTION_FAILED`: UInt = 63u;
public const val `BTH_ERROR_MAX_NUMBER_OF_CONNECTIONS`: UInt = 9u;
public const val `BTH_ERROR_MAX_NUMBER_OF_SCO_CONNECTIONS`: UInt = 10u;
public const val `BTH_ERROR_MEMORY_FULL`: UInt = 7u;
public const val `BTH_ERROR_NO_CONNECTION`: UInt = 2u;
public const val `BTH_ERROR_OPERATION_CANCELLED_BY_HOST`: UInt = 68u;
public const val `BTH_ERROR_PACKET_TOO_LONG`: UInt = 69u;
public const val `BTH_ERROR_PAGE_TIMEOUT`: UInt = 4u;
public const val `BTH_ERROR_PAIRING_NOT_ALLOWED`: UInt = 24u;
public const val `BTH_ERROR_PAIRING_WITH_UNIT_KEY_NOT_SUPPORTED`: UInt = 41u;
public const val `BTH_ERROR_PARAMETER_OUT_OF_MANDATORY_RANGE`: UInt = 48u;
public const val `BTH_ERROR_QOS_IS_NOT_SUPPORTED`: UInt = 39u;
public const val `BTH_ERROR_QOS_REJECTED`: UInt = 45u;
public const val `BTH_ERROR_QOS_UNACCEPTABLE_PARAMETER`: UInt = 44u;
public const val `BTH_ERROR_REMOTE_LOW_RESOURCES`: UInt = 20u;
public const val `BTH_ERROR_REMOTE_POWERING_OFF`: UInt = 21u;
public const val `BTH_ERROR_REMOTE_USER_ENDED_CONNECTION`: UInt = 19u;
public const val `BTH_ERROR_REPEATED_ATTEMPTS`: UInt = 23u;
public const val `BTH_ERROR_RESERVED_SLOT_VIOLATION`: UInt = 52u;
public const val `BTH_ERROR_ROLE_CHANGE_NOT_ALLOWED`: UInt = 33u;
public const val `BTH_ERROR_ROLE_SWITCH_FAILED`: UInt = 53u;
public const val `BTH_ERROR_ROLE_SWITCH_PENDING`: UInt = 50u;
public const val `BTH_ERROR_SCO_AIRMODE_REJECTED`: UInt = 29u;
public const val `BTH_ERROR_SCO_INTERVAL_REJECTED`: UInt = 28u;
public const val `BTH_ERROR_SCO_OFFSET_REJECTED`: UInt = 27u;
public const val `BTH_ERROR_SECURE_SIMPLE_PAIRING_NOT_SUPPORTED_BY_HOST`: UInt = 55u;
public const val `BTH_ERROR_SUCCESS`: UInt = 0u;
public const val `BTH_ERROR_TYPE_0_SUBMAP_NOT_DEFINED`: UInt = 65u;
public const val `BTH_ERROR_UKNOWN_LMP_PDU`: UInt = 25u;
public const val `BTH_ERROR_UNACCEPTABLE_CONNECTION_INTERVAL`: UInt = 59u;
public const val `BTH_ERROR_UNIT_KEY_NOT_USED`: UInt = 38u;
public const val `BTH_ERROR_UNKNOWN_ADVERTISING_IDENTIFIER`: UInt = 66u;
public const val `BTH_ERROR_UNKNOWN_HCI_COMMAND`: UInt = 1u;
public const val `BTH_ERROR_UNSPECIFIED`: UInt = 255u;
public const val `BTH_ERROR_UNSPECIFIED_ERROR`: UInt = 31u;
public const val `BTH_ERROR_UNSUPPORTED_FEATURE_OR_PARAMETER`: UInt = 17u;
public const val `BTH_ERROR_UNSUPPORTED_LMP_PARM_VALUE`: UInt = 32u;
public const val `BTH_ERROR_UNSUPPORTED_REMOTE_FEATURE`: UInt = 26u;
// UNSUPPORTED Rust 492:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_HCI_EVENT_INFO {
//     pub bthAddress: u64,
//     pub connectionType: u8,
//     pub connected: u8,
// }

public const val `BTH_HOST_FEATURE_ENHANCED_RETRANSMISSION_MODE`: ULong = 1uL;
public const val `BTH_HOST_FEATURE_LOW_ENERGY`: ULong = 4uL;
public const val `BTH_HOST_FEATURE_SCO_HCI`: ULong = 8uL;
public const val `BTH_HOST_FEATURE_SCO_HCIBYPASS`: ULong = 16uL;
public const val `BTH_HOST_FEATURE_STREAMING_MODE`: ULong = 2uL;
// UNSUPPORTED Rust 504:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_INFO_REQ {
//     pub btAddr: u64,
//     pub infoType: u16,
// }

// UNSUPPORTED Rust 510:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct BTH_INFO_RSP {
//     pub result: u16,
//     pub dataLen: u8,
//     pub Anonymous: BTH_INFO_RSP_0,
// }

// UNSUPPORTED Rust 517:1: declaration Impl has no candidate rule
// impl Default for BTH_INFO_RSP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 522:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union BTH_INFO_RSP_0 {
//     pub connectionlessMTU: u16,
//     pub data: [u8; 44],
// }

// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule
// impl Default for BTH_INFO_RSP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BTH_IOCTL_BASE`: UInt = 0u;
// UNSUPPORTED Rust 534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_L2CAP_EVENT_INFO {
//     pub bthAddress: u64,
//     pub psm: u16,
//     pub connected: u8,
//     pub initiated: u8,
// }

// UNSUPPORTED Rust 542:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const BTH_LE_ATT_BLUETOOTH_BASE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_1000_8000_00805f9b34fb);

public const val `BTH_LE_ATT_CID`: UInt = 4u;
public const val `BTH_LE_ATT_MAX_VALUE_SIZE`: UInt = 512u;
public const val `BTH_LE_ATT_TRANSACTION_TIMEOUT`: UInt = 30u;
public const val `BTH_LE_ERROR_ATTRIBUTE_NOT_FOUND`: UInt = 10u;
public const val `BTH_LE_ERROR_ATTRIBUTE_NOT_LONG`: UInt = 11u;
public const val `BTH_LE_ERROR_INSUFFICIENT_AUTHENTICATION`: UInt = 5u;
public const val `BTH_LE_ERROR_INSUFFICIENT_AUTHORIZATION`: UInt = 8u;
public const val `BTH_LE_ERROR_INSUFFICIENT_ENCRYPTION`: UInt = 15u;
public const val `BTH_LE_ERROR_INSUFFICIENT_ENCRYPTION_KEY_SIZE`: UInt = 12u;
public const val `BTH_LE_ERROR_INSUFFICIENT_RESOURCES`: UInt = 17u;
public const val `BTH_LE_ERROR_INVALID_ATTRIBUTE_VALUE_LENGTH`: UInt = 13u;
public const val `BTH_LE_ERROR_INVALID_HANDLE`: UInt = 1u;
public const val `BTH_LE_ERROR_INVALID_OFFSET`: UInt = 7u;
public const val `BTH_LE_ERROR_INVALID_PDU`: UInt = 4u;
public const val `BTH_LE_ERROR_PREPARE_QUEUE_FULL`: UInt = 9u;
public const val `BTH_LE_ERROR_READ_NOT_PERMITTED`: UInt = 2u;
public const val `BTH_LE_ERROR_REQUEST_NOT_SUPPORTED`: UInt = 6u;
public const val `BTH_LE_ERROR_UNKNOWN`: UInt = 4096u;
public const val `BTH_LE_ERROR_UNLIKELY`: UInt = 14u;
public const val `BTH_LE_ERROR_UNSUPPORTED_GROUP_TYPE`: UInt = 16u;
public const val `BTH_LE_ERROR_WRITE_NOT_PERMITTED`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SINK_SUBCATEGORY_BOOKSHELF_SPEAKER`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SINK_SUBCATEGORY_SOUNDBAR`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SINK_SUBCATEGORY_SPEAKERPHONE`: UInt = 5u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SINK_SUBCATEGORY_STANDALONE_SPEAKER`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SINK_SUBCATEGORY_STANDMOUNTED_SPEAKER`: UInt = 4u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_ALARM`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_AUDITORIUM`: UInt = 9u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_BELL`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_BROADCASTING_DEVICE`: UInt = 5u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_BROADCASTING_ROOM`: UInt = 8u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_HORN`: UInt = 4u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_KIOSK`: UInt = 7u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_MICROPHONE`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_AUDIO_SOURCE_SUBCATEGORY_SERVICE_DESK`: UInt = 6u;
public const val `BTH_LE_GAP_APPEARANCE_BLOOD_PRESSURE_SUBCATEGORY_ARM`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_BLOOD_PRESSURE_SUBCATEGORY_WRIST`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_ACCESS_CONTROL`: UInt = 28u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_AIRCRAFT`: UInt = 38u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_AIR_CONDITIONING`: UInt = 25u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_AUDIO_SINK`: UInt = 33u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_AUDIO_SOURCE`: UInt = 34u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_AV_EQUIPMENT`: UInt = 39u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_BARCODE_SCANNER`: UInt = 11u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_BLOOD_PRESSURE`: UInt = 14u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_CLOCK`: UInt = 4u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_COMPUTER`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_CONTINUOUS_GLUCOSE_MONITOR`: UInt = 52u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_CONTROL_DEVICE`: UInt = 19u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_CYCLING`: UInt = 18u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_DISPLAY`: UInt = 5u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_DISPLAY_EQUIPMENT`: UInt = 40u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_DOMESTIC_APPLIANCE`: UInt = 36u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_EYE_GLASSES`: UInt = 7u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_FAN`: UInt = 23u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_GAMING`: UInt = 42u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_GLUCOSE_METER`: UInt = 16u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_HEARING_AID`: UInt = 41u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_HEART_RATE`: UInt = 13u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_HEATING`: UInt = 27u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_HID`: UInt = 15u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_HUMIDIFIER`: UInt = 26u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_HVAC`: UInt = 24u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_INSULIN_PUMP`: UInt = 53u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_KEYRING`: UInt = 9u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_LIGHT_FIXTURES`: UInt = 22u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_LIGHT_SOURCE`: UInt = 31u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_MASK`: UInt = 1023u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_MEDIA_PLAYER`: UInt = 10u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_MEDICATION_DELIVERY`: UInt = 54u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_MOTORIZED_DEVICE`: UInt = 29u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_MOTORIZED_VEHICLE`: UInt = 35u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_NETWORK_DEVICE`: UInt = 20u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_OFFSET`: UInt = 6u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_OUTDOOR_SPORTS_ACTIVITY`: UInt = 81u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_PERSONAL_MOBILITY_DEVICE`: UInt = 51u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_PHONE`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_PLUSE_OXIMETER`: UInt = 49u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_POWER_DEVICE`: UInt = 30u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_REMOTE_CONTROL`: UInt = 6u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_RUNNING_WALKING_SENSOR`: UInt = 17u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_SENSOR`: UInt = 21u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_SIGNAGE`: UInt = 43u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_TAG`: UInt = 8u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_THERMOMETER`: UInt = 12u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_UNCATEGORIZED`: UInt = 0u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_WATCH`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_WEARABLE_AUDIO_DEVICE`: UInt = 37u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_WEIGHT_SCALE`: UInt = 50u;
public const val `BTH_LE_GAP_APPEARANCE_CATEGORY_WINDOW_COVERING`: UInt = 32u;
public const val `BTH_LE_GAP_APPEARANCE_CYCLING_SUBCATEGORY_CADENCE_SENSOR`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_CYCLING_SUBCATEGORY_CYCLING_COMPUTER`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_CYCLING_SUBCATEGORY_POWER_SENSOR`: UInt = 4u;
public const val `BTH_LE_GAP_APPEARANCE_CYCLING_SUBCATEGORY_SPEED_AND_CADENCE_SENSOR`: UInt = 5u;
public const val `BTH_LE_GAP_APPEARANCE_CYCLING_SUBCATEGORY_SPEED_SENSOR`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_HEARING_AID_SUBCATEGORY_BEHIND_EAR_HEARING_AID`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_HEARING_AID_SUBCATEGORY_COCHLEAR_IMPLANT`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_HEARING_AID_SUBCATEGORY_IN_EAR_HEARING_AID`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_HEART_RATE_SUBCATEGORY_HEART_RATE_BELT`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_BARCODE_SCANNER`: UInt = 8u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_CARD_READER`: UInt = 6u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_DIGITAL_PEN`: UInt = 7u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_DIGITIZER_TABLET`: UInt = 5u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_GAMEPAD`: UInt = 4u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_JOYSTICK`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_KEYBOARD`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_HID_SUBCATEGORY_MOUSE`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_OUTDOOR_SPORTS_ACTIVITY_SUBCATEGORY_LOCATION_DISPLAY_DEVICE`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_OUTDOOR_SPORTS_ACTIVITY_SUBCATEGORY_LOCATION_NAVIGATION_DISPLAY_DEVICE`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_OUTDOOR_SPORTS_ACTIVITY_SUBCATEGORY_LOCATION_NAVIGATION_POD`: UInt = 4u;
public const val `BTH_LE_GAP_APPEARANCE_OUTDOOR_SPORTS_ACTIVITY_SUBCATEGORY_LOCATION_POD`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_PULSE_OXIMETER_SUBCATEGORY_FINGERTIP`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_PULSE_OXIMETER_SUBCATEGORY_WRIST_WORN`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_RUNNING_WALKING_SENSOR_SUBCATEGORY_IN_SHOE`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_RUNNING_WALKING_SENSOR_SUBCATEGORY_ON_HIP`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_RUNNING_WALKING_SENSOR_SUBCATEGORY_ON_SHOE`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_SUBCATEGORY_GENERIC`: UInt = 0u;
public const val `BTH_LE_GAP_APPEARANCE_SUB_CATEGORY_MASK`: UInt = 63u;
public const val `BTH_LE_GAP_APPEARANCE_THERMOMETER_SUBCATEGORY_EAR`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_WATCH_SUBCATEGORY_SPORTS_WATCH`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_WEARABLE_AUDIO_DEVICE_SUBCATEGORY_EARBUD`: UInt = 1u;
public const val `BTH_LE_GAP_APPEARANCE_WEARABLE_AUDIO_DEVICE_SUBCATEGORY_HEADPHONES`: UInt = 3u;
public const val `BTH_LE_GAP_APPEARANCE_WEARABLE_AUDIO_DEVICE_SUBCATEGORY_HEADSET`: UInt = 2u;
public const val `BTH_LE_GAP_APPEARANCE_WEARABLE_AUDIO_DEVICE_SUBCATEGORY_NECKBAND`: UInt = 4u;
public const val `BTH_LE_GATT_ATTRIBUTE_TYPE_CHARACTERISTIC`: UInt = 10243u;
public const val `BTH_LE_GATT_ATTRIBUTE_TYPE_INCLUDE`: UInt = 10242u;
public const val `BTH_LE_GATT_ATTRIBUTE_TYPE_PRIMARY_SERVICE`: UInt = 10240u;
public const val `BTH_LE_GATT_ATTRIBUTE_TYPE_SECONDARY_SERVICE`: UInt = 10241u;
// UNSUPPORTED Rust 671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_LE_GATT_CHARACTERISTIC {
//     pub ServiceHandle: u16,
//     pub CharacteristicUuid: BTH_LE_UUID,
//     pub AttributeHandle: u16,
//     pub CharacteristicValueHandle: u16,
//     pub IsBroadcastable: bool,
//     pub IsReadable: bool,
//     pub IsWritable: bool,
//     pub IsWritableWithoutResponse: bool,
//     pub IsSignedWritable: bool,
//     pub IsNotifiable: bool,
//     pub IsIndicatable: bool,
//     pub HasExtendedProperties: bool,
// }

// UNSUPPORTED Rust 687:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_GATT_CHARACTERISTIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BTH_LE_GATT_CHARACTERISTIC_DESCRIPTOR_AGGREGATE_FORMAT`: UInt = 10501u;
public const val `BTH_LE_GATT_CHARACTERISTIC_DESCRIPTOR_CLIENT_CONFIGURATION`: UInt = 10498u;
public const val `BTH_LE_GATT_CHARACTERISTIC_DESCRIPTOR_EXTENDED_PROPERTIES`: UInt = 10496u;
public const val `BTH_LE_GATT_CHARACTERISTIC_DESCRIPTOR_FORMAT`: UInt = 10500u;
public const val `BTH_LE_GATT_CHARACTERISTIC_DESCRIPTOR_SERVER_CONFIGURATION`: UInt = 10499u;
public const val `BTH_LE_GATT_CHARACTERISTIC_DESCRIPTOR_USER_DESCRIPTION`: UInt = 10497u;
public const val `BTH_LE_GATT_CHARACTERISTIC_TYPE_APPEARANCE`: UInt = 10753u;
public const val `BTH_LE_GATT_CHARACTERISTIC_TYPE_DEVICE_NAME`: UInt = 10752u;
public const val `BTH_LE_GATT_CHARACTERISTIC_TYPE_PERIPHERAL_PREFERED_CONNECTION_PARAMETER`: UInt = 10756u;
public const val `BTH_LE_GATT_CHARACTERISTIC_TYPE_PERIPHERAL_PRIVACY_FLAG`: UInt = 10754u;
public const val `BTH_LE_GATT_CHARACTERISTIC_TYPE_RECONNECTION_ADDRESS`: UInt = 10755u;
public const val `BTH_LE_GATT_CHARACTERISTIC_TYPE_SERVICE_CHANGED`: UInt = 10757u;
// UNSUPPORTED Rust 704:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_LE_GATT_CHARACTERISTIC_VALUE {
//     pub DataSize: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_GATT_CHARACTERISTIC_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BTH_LE_GATT_DEFAULT_MAX_INCLUDED_SERVICES_DEPTH`: UInt = 3u;
// UNSUPPORTED Rust 716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_LE_GATT_DESCRIPTOR {
//     pub ServiceHandle: u16,
//     pub CharacteristicHandle: u16,
//     pub DescriptorType: BTH_LE_GATT_DESCRIPTOR_TYPE,
//     pub DescriptorUuid: BTH_LE_UUID,
//     pub AttributeHandle: u16,
// }

// UNSUPPORTED Rust 725:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_GATT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `BTH_LE_GATT_DESCRIPTOR_TYPE` = Int;
// UNSUPPORTED Rust 731:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_LE_GATT_DESCRIPTOR_VALUE {
//     pub DescriptorType: BTH_LE_GATT_DESCRIPTOR_TYPE,
//     pub DescriptorUuid: BTH_LE_UUID,
//     pub Anonymous: BTH_LE_GATT_DESCRIPTOR_VALUE_0,
//     pub DataSize: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_GATT_DESCRIPTOR_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 745:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BTH_LE_GATT_DESCRIPTOR_VALUE_0 {
//     pub CharacteristicExtendedProperties: BTH_LE_GATT_DESCRIPTOR_VALUE_0_0,
//     pub ClientCharacteristicConfiguration: BTH_LE_GATT_DESCRIPTOR_VALUE_0_1,
//     pub ServerCharacteristicConfiguration: BTH_LE_GATT_DESCRIPTOR_VALUE_0_2,
//     pub CharacteristicFormat: BTH_LE_GATT_DESCRIPTOR_VALUE_0_3,
// }

// UNSUPPORTED Rust 753:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_GATT_DESCRIPTOR_VALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_LE_GATT_DESCRIPTOR_VALUE_0_0 {
//     pub IsReliableWriteEnabled: bool,
//     pub IsAuxiliariesWritable: bool,
// }

// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_LE_GATT_DESCRIPTOR_VALUE_0_3 {
//     pub Format: u8,
//     pub Exponent: u8,
//     pub Unit: BTH_LE_UUID,
//     pub NameSpace: u8,
//     pub Description: BTH_LE_UUID,
// }

// UNSUPPORTED Rust 773:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_GATT_DESCRIPTOR_VALUE_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_LE_GATT_DESCRIPTOR_VALUE_0_1 {
//     pub IsSubscribeToNotification: bool,
//     pub IsSubscribeToIndication: bool,
// }

// UNSUPPORTED Rust 784:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_LE_GATT_DESCRIPTOR_VALUE_0_2 {
//     pub IsBroadcast: bool,
// }

public typealias `BTH_LE_GATT_EVENT_TYPE` = Int;
// UNSUPPORTED Rust 790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_LE_GATT_SERVICE {
//     pub ServiceUuid: BTH_LE_UUID,
//     pub AttributeHandle: u16,
// }

// UNSUPPORTED Rust 796:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_GATT_SERVICE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BTH_LE_SERVICE_GAP`: UInt = 6144u;
public const val `BTH_LE_SERVICE_GATT`: UInt = 6145u;
// UNSUPPORTED Rust 803:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_LE_UUID {
//     pub IsShortUuid: bool,
//     pub Value: BTH_LE_UUID_0,
// }

// UNSUPPORTED Rust 809:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_UUID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 814:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union BTH_LE_UUID_0 {
//     pub ShortUuid: u16,
//     pub LongUuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 820:1: declaration Impl has no candidate rule
// impl Default for BTH_LE_UUID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BTH_LINK_KEY_LENGTH`: UInt = 16u;
public const val `BTH_MAJORVERSION`: UInt = 2u;
public const val `BTH_MAX_NAME_SIZE`: UInt = 248u;
public const val `BTH_MAX_PIN_SIZE`: UInt = 16u;
public const val `BTH_MAX_SERVICE_NAME_SIZE`: UInt = 256u;
public const val `BTH_MFG_3COM`: UInt = 5u;
public const val `BTH_MFG_ALCATEL`: UInt = 36u;
public const val `BTH_MFG_APPLE`: UInt = 76u;
public const val `BTH_MFG_ARUBA_NETWORKS`: UInt = 283u;
public const val `BTH_MFG_ATMEL`: UInt = 19u;
public const val `BTH_MFG_AVM_BERLIN`: UInt = 31u;
public const val `BTH_MFG_BANDSPEED`: UInt = 32u;
public const val `BTH_MFG_BROADCOM`: UInt = 15u;
public const val `BTH_MFG_CONEXANT`: UInt = 28u;
public const val `BTH_MFG_CSR`: UInt = 10u;
public const val `BTH_MFG_C_TECHNOLOGIES`: UInt = 38u;
public const val `BTH_MFG_DIGIANSWER`: UInt = 12u;
public const val `BTH_MFG_ERICSSON`: UInt = 0u;
public const val `BTH_MFG_HITACHI`: UInt = 41u;
public const val `BTH_MFG_IBM`: UInt = 3u;
public const val `BTH_MFG_INFINEON`: UInt = 9u;
public const val `BTH_MFG_INTEL`: UInt = 2u;
public const val `BTH_MFG_INTERNAL_USE`: UInt = 65535u;
public const val `BTH_MFG_INVENTEL`: UInt = 30u;
public const val `BTH_MFG_KC_TECHNOLOGY`: UInt = 22u;
public const val `BTH_MFG_LUCENT`: UInt = 7u;
public const val `BTH_MFG_MACRONIX_INTERNATIONAL`: UInt = 44u;
public const val `BTH_MFG_MANSELLA`: UInt = 33u;
public const val `BTH_MFG_MARVELL`: UInt = 72u;
public const val `BTH_MFG_MICROSOFT`: UInt = 6u;
public const val `BTH_MFG_MITEL`: UInt = 16u;
public const val `BTH_MFG_MITSIBUSHI`: UInt = 20u;
public const val `BTH_MFG_MOTOROLA`: UInt = 8u;
public const val `BTH_MFG_NEC`: UInt = 34u;
public const val `BTH_MFG_NEWLOGIC`: UInt = 23u;
public const val `BTH_MFG_NOKIA`: UInt = 1u;
public const val `BTH_MFG_NORDIC_SEMICONDUCTORS_ASA`: UInt = 89u;
public const val `BTH_MFG_OPEN_INTERFACE`: UInt = 39u;
public const val `BTH_MFG_PARTHUS`: UInt = 14u;
public const val `BTH_MFG_PHILIPS_SEMICONDUCTOR`: UInt = 37u;
public const val `BTH_MFG_QUALCOMM`: UInt = 29u;
public const val `BTH_MFG_RF_MICRO_DEVICES`: UInt = 40u;
public const val `BTH_MFG_ROHDE_SCHWARZ`: UInt = 25u;
public const val `BTH_MFG_RTX_TELECOM`: UInt = 21u;
public const val `BTH_MFG_SIGNIA`: UInt = 27u;
public const val `BTH_MFG_SILICONWAVE`: UInt = 11u;
public const val `BTH_MFG_SYMBOL_TECHNOLOGIES`: UInt = 42u;
public const val `BTH_MFG_TENOVIS`: UInt = 43u;
public const val `BTH_MFG_TI`: UInt = 13u;
public const val `BTH_MFG_TOSHIBA`: UInt = 4u;
public const val `BTH_MFG_TRANSILICA`: UInt = 24u;
public const val `BTH_MFG_TTPCOM`: UInt = 26u;
public const val `BTH_MFG_WAVEPLUS_TECHNOLOGY_CO`: UInt = 35u;
public const val `BTH_MFG_WIDCOMM`: UInt = 17u;
public const val `BTH_MFG_ZEEVO`: UInt = 18u;
public const val `BTH_MINORVERSION`: UInt = 1u;
// UNSUPPORTED Rust 881:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct BTH_PING_REQ {
//     pub btAddr: u64,
//     pub dataLen: u8,
//     pub data: [u8; 44],
// }

// UNSUPPORTED Rust 888:1: declaration Impl has no candidate rule
// impl Default for BTH_PING_REQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 893:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BTH_PING_RSP {
//     pub dataLen: u8,
//     pub data: [u8; 44],
// }

// UNSUPPORTED Rust 899:1: declaration Impl has no candidate rule
// impl Default for BTH_PING_RSP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 904:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_QUERY_DEVICE {
//     pub LAP: u32,
//     pub length: u8,
// }

// UNSUPPORTED Rust 910:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct BTH_QUERY_SERVICE {
//     pub r#type: u32,
//     pub serviceHandle: u32,
//     pub uuids: [SdpQueryUuid; 12],
//     pub numRange: u32,
//     pub pRange: [SdpAttributeRange; 1],
// }

// UNSUPPORTED Rust 919:1: declaration Impl has no candidate rule
// impl Default for BTH_QUERY_SERVICE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 924:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BTH_RADIO_IN_RANGE {
//     pub deviceInfo: BTH_DEVICE_INFO,
//     pub previousDeviceFlags: u32,
// }

public const val `BTH_SDP_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 931:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct BTH_SET_SERVICE {
//     pub pSdpVersion: *mut u32,
//     pub pRecordHandle: *mut super::super::Foundation::HANDLE,
//     pub fCodService: u32,
//     pub Reserved: [u32; 5],
//     pub ulRecordLength: u32,
//     pub pRecord: [u8; 1],
// }

// UNSUPPORTED Rust 941:1: declaration Impl has no candidate rule
// impl Default for BTH_SET_SERVICE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BTH_VID_DEFAULT_VALUE`: UInt = 65535u;
public const val `BT_PORT_DYN_FIRST`: UInt = 4097u;
public const val `BT_PORT_MAX`: UInt = 65535u;
public const val `BT_PORT_MIN`: UInt = 1u;
public const val `BasicPrintingProfileID_UUID16`: UInt = 4386u;
public const val `BasicPrintingServiceClassID_UUID16`: UInt = 4386u;
// UNSUPPORTED Rust 952:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Bluetooth_Base_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_1000_8000_00805f9b34fb);

public const val `BrowseGroupDescriptorServiceClassID_UUID16`: UInt = 4097u;
public const val `CMPT_PROTOCOL_UUID16`: UInt = 27u;
public const val `COD_AUDIO_MINOR_CAMCORDER`: UInt = 13u;
public const val `COD_AUDIO_MINOR_CAR_AUDIO`: UInt = 8u;
public const val `COD_AUDIO_MINOR_GAMING_TOY`: UInt = 18u;
public const val `COD_AUDIO_MINOR_HANDS_FREE`: UInt = 2u;
public const val `COD_AUDIO_MINOR_HEADPHONES`: UInt = 6u;
public const val `COD_AUDIO_MINOR_HEADSET`: UInt = 1u;
public const val `COD_AUDIO_MINOR_HEADSET_HANDS_FREE`: UInt = 3u;
public const val `COD_AUDIO_MINOR_HIFI_AUDIO`: UInt = 10u;
public const val `COD_AUDIO_MINOR_LOUDSPEAKER`: UInt = 5u;
public const val `COD_AUDIO_MINOR_MICROPHONE`: UInt = 4u;
public const val `COD_AUDIO_MINOR_PORTABLE_AUDIO`: UInt = 7u;
public const val `COD_AUDIO_MINOR_SET_TOP_BOX`: UInt = 9u;
public const val `COD_AUDIO_MINOR_UNCLASSIFIED`: UInt = 0u;
public const val `COD_AUDIO_MINOR_VCR`: UInt = 11u;
public const val `COD_AUDIO_MINOR_VIDEO_CAMERA`: UInt = 12u;
public const val `COD_AUDIO_MINOR_VIDEO_DISPLAY_CONFERENCING`: UInt = 16u;
public const val `COD_AUDIO_MINOR_VIDEO_DISPLAY_LOUDSPEAKER`: UInt = 15u;
public const val `COD_AUDIO_MINOR_VIDEO_MONITOR`: UInt = 14u;
public const val `COD_COMPUTER_MINOR_DESKTOP`: UInt = 1u;
public const val `COD_COMPUTER_MINOR_HANDHELD`: UInt = 4u;
public const val `COD_COMPUTER_MINOR_LAPTOP`: UInt = 3u;
public const val `COD_COMPUTER_MINOR_PALM`: UInt = 5u;
public const val `COD_COMPUTER_MINOR_SERVER`: UInt = 2u;
public const val `COD_COMPUTER_MINOR_UNCLASSIFIED`: UInt = 0u;
public const val `COD_COMPUTER_MINOR_WEARABLE`: UInt = 6u;
public const val `COD_FORMAT_BIT_OFFSET`: UInt = 0u;
public const val `COD_FORMAT_MASK`: UInt = 3u;
public const val `COD_HEALTH_MINOR_BLOOD_PRESSURE_MONITOR`: UInt = 1u;
public const val `COD_HEALTH_MINOR_GLUCOSE_METER`: UInt = 4u;
public const val `COD_HEALTH_MINOR_HEALTH_DATA_DISPLAY`: UInt = 7u;
public const val `COD_HEALTH_MINOR_HEART_PULSE_MONITOR`: UInt = 6u;
public const val `COD_HEALTH_MINOR_PULSE_OXIMETER`: UInt = 5u;
public const val `COD_HEALTH_MINOR_STEP_COUNTER`: UInt = 8u;
public const val `COD_HEALTH_MINOR_THERMOMETER`: UInt = 2u;
public const val `COD_HEALTH_MINOR_WEIGHING_SCALE`: UInt = 3u;
public const val `COD_IMAGING_MINOR_CAMERA_MASK`: UInt = 8u;
public const val `COD_IMAGING_MINOR_DISPLAY_MASK`: UInt = 4u;
public const val `COD_IMAGING_MINOR_PRINTER_MASK`: UInt = 32u;
public const val `COD_IMAGING_MINOR_SCANNER_MASK`: UInt = 16u;
public const val `COD_LAN_ACCESS_0_USED`: UInt = 0u;
public const val `COD_LAN_ACCESS_17_USED`: UInt = 1u;
public const val `COD_LAN_ACCESS_33_USED`: UInt = 2u;
public const val `COD_LAN_ACCESS_50_USED`: UInt = 3u;
public const val `COD_LAN_ACCESS_67_USED`: UInt = 4u;
public const val `COD_LAN_ACCESS_83_USED`: UInt = 5u;
public const val `COD_LAN_ACCESS_99_USED`: UInt = 6u;
public const val `COD_LAN_ACCESS_BIT_OFFSET`: UInt = 5u;
public const val `COD_LAN_ACCESS_FULL`: UInt = 7u;
public const val `COD_LAN_ACCESS_MASK`: UInt = 224u;
public const val `COD_LAN_MINOR_MASK`: UInt = 28u;
public const val `COD_LAN_MINOR_UNCLASSIFIED`: UInt = 0u;
public const val `COD_MAJOR_AUDIO`: UInt = 4u;
public const val `COD_MAJOR_COMPUTER`: UInt = 1u;
public const val `COD_MAJOR_HEALTH`: UInt = 9u;
public const val `COD_MAJOR_IMAGING`: UInt = 6u;
public const val `COD_MAJOR_LAN_ACCESS`: UInt = 3u;
public const val `COD_MAJOR_MASK`: UInt = 7936u;
public const val `COD_MAJOR_MISCELLANEOUS`: UInt = 0u;
public const val `COD_MAJOR_PERIPHERAL`: UInt = 5u;
public const val `COD_MAJOR_PHONE`: UInt = 2u;
public const val `COD_MAJOR_TOY`: UInt = 8u;
public const val `COD_MAJOR_UNCLASSIFIED`: UInt = 31u;
public const val `COD_MAJOR_WEARABLE`: UInt = 7u;
public const val `COD_MINOR_BIT_OFFSET`: UInt = 2u;
public const val `COD_MINOR_MASK`: UInt = 252u;
public const val `COD_PERIPHERAL_MINOR_GAMEPAD`: UInt = 2u;
public const val `COD_PERIPHERAL_MINOR_JOYSTICK`: UInt = 1u;
public const val `COD_PERIPHERAL_MINOR_KEYBOARD_MASK`: UInt = 16u;
public const val `COD_PERIPHERAL_MINOR_NO_CATEGORY`: UInt = 0u;
public const val `COD_PERIPHERAL_MINOR_POINTER_MASK`: UInt = 32u;
public const val `COD_PERIPHERAL_MINOR_REMOTE_CONTROL`: UInt = 3u;
public const val `COD_PERIPHERAL_MINOR_SENSING`: UInt = 4u;
public const val `COD_PHONE_MINOR_CELLULAR`: UInt = 1u;
public const val `COD_PHONE_MINOR_CORDLESS`: UInt = 2u;
public const val `COD_PHONE_MINOR_SMART`: UInt = 3u;
public const val `COD_PHONE_MINOR_UNCLASSIFIED`: UInt = 0u;
public const val `COD_PHONE_MINOR_WIRED_MODEM`: UInt = 4u;
public const val `COD_SERVICE_AUDIO`: UInt = 256u;
public const val `COD_SERVICE_CAPTURING`: UInt = 64u;
public const val `COD_SERVICE_INFORMATION`: UInt = 1024u;
public const val `COD_SERVICE_LE_AUDIO`: UInt = 2u;
public const val `COD_SERVICE_LIMITED`: UInt = 1u;
public const val `COD_SERVICE_MASK`: UInt = 16769024u;
public const val `COD_SERVICE_MAX_COUNT`: UInt = 10u;
public const val `COD_SERVICE_NETWORKING`: UInt = 16u;
public const val `COD_SERVICE_OBJECT_XFER`: UInt = 128u;
public const val `COD_SERVICE_POSITIONING`: UInt = 8u;
public const val `COD_SERVICE_RENDERING`: UInt = 32u;
public const val `COD_SERVICE_TELEPHONY`: UInt = 512u;
public const val `COD_TOY_MINOR_CONTROLLER`: UInt = 4u;
public const val `COD_TOY_MINOR_DOLL_ACTION_FIGURE`: UInt = 3u;
public const val `COD_TOY_MINOR_GAME`: UInt = 5u;
public const val `COD_TOY_MINOR_ROBOT`: UInt = 1u;
public const val `COD_TOY_MINOR_VEHICLE`: UInt = 2u;
public const val `COD_VERSION`: UInt = 0u;
public const val `COD_WEARABLE_MINOR_GLASSES`: UInt = 5u;
public const val `COD_WEARABLE_MINOR_HELMET`: UInt = 4u;
public const val `COD_WEARABLE_MINOR_JACKET`: UInt = 3u;
public const val `COD_WEARABLE_MINOR_PAGER`: UInt = 2u;
public const val `COD_WEARABLE_MINOR_WRIST_WATCH`: UInt = 1u;
public const val `CORDLESS_EXTERNAL_NETWORK_ANALOG_CELLULAR`: UInt = 5u;
public const val `CORDLESS_EXTERNAL_NETWORK_CDMA`: UInt = 4u;
public const val `CORDLESS_EXTERNAL_NETWORK_GSM`: UInt = 3u;
public const val `CORDLESS_EXTERNAL_NETWORK_ISDN`: UInt = 2u;
public const val `CORDLESS_EXTERNAL_NETWORK_OTHER`: UInt = 7u;
public const val `CORDLESS_EXTERNAL_NETWORK_PACKET_SWITCHED`: UInt = 6u;
public const val `CORDLESS_EXTERNAL_NETWORK_PSTN`: UInt = 1u;
public const val `CTNAccessServiceClassID_UUID16`: UInt = 4412u;
public const val `CTNNotificationServiceClassID_UUID16`: UInt = 4413u;
public const val `CTNProfileID_UUID16`: UInt = 4414u;
public const val `CharacteristicAggregateFormat`: `BTH_LE_GATT_DESCRIPTOR_TYPE` = 5;
public const val `CharacteristicExtendedProperties`: `BTH_LE_GATT_DESCRIPTOR_TYPE` = 0;
public const val `CharacteristicFormat`: `BTH_LE_GATT_DESCRIPTOR_TYPE` = 4;
public const val `CharacteristicUserDescription`: `BTH_LE_GATT_DESCRIPTOR_TYPE` = 1;
public const val `CharacteristicValueChangedEvent`: `BTH_LE_GATT_EVENT_TYPE` = 0;
public const val `ClientCharacteristicConfiguration`: `BTH_LE_GATT_DESCRIPTOR_TYPE` = 2;
public const val `CommonISDNAccessServiceClassID_UUID16`: UInt = 4392u;
public const val `CommonISDNAccessServiceClass_UUID16`: UInt = 4392u;
public const val `CordlessServiceClassID_UUID16`: UInt = 4361u;
public const val `CordlessTelephonyServiceClassID_UUID16`: UInt = 4361u;
public const val `CustomDescriptor`: `BTH_LE_GATT_DESCRIPTOR_TYPE` = 6;
public const val `DI_VENDOR_ID_SOURCE_BLUETOOTH_SIG`: UInt = 1u;
public const val `DI_VENDOR_ID_SOURCE_USB_IF`: UInt = 2u;
public const val `DialupNetworkingServiceClassID_UUID16`: UInt = 4355u;
public const val `DirectPrintingReferenceObjectsServiceClassID_UUID16`: UInt = 4384u;
public const val `DirectPrintingServiceClassID_UUID16`: UInt = 4376u;
public const val `ENCODING_UTF_8`: UInt = 106u;
public const val `ESdpUpnpIpLapServiceClassID_UUID16`: UInt = 4865u;
public const val `ESdpUpnpIpPanServiceClassID_UUID16`: UInt = 4864u;
public const val `ESdpUpnpL2capServiceClassID_UUID16`: UInt = 4866u;
public const val `FTP_PROTOCOL_UUID16`: UInt = 10u;
public const val `FaxServiceClassID_UUID16`: UInt = 4369u;
public const val `GNSSProfileID_UUID16`: UInt = 4405u;
public const val `GNSSServerServiceClassID_UUID16`: UInt = 4406u;
public const val `GNServiceClassID_UUID16`: UInt = 4375u;
// UNSUPPORTED Rust 1090:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTHLE_DEVICE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x781aee18_7733_4ce4_add0_91f41c67b592);

// UNSUPPORTED Rust 1091:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_AUTHENTICATION_REQUEST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5dc9136d_996c_46db_84f5_32c0a3f47352);

// UNSUPPORTED Rust 1092:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_GATT_SERVICE_DEVICE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e3bb679_4372_40c8_9eaa_4509df260cd8);

// UNSUPPORTED Rust 1093:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_HCI_EVENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc240062_1541_49be_b463_84c4dcd7bf7f);

// UNSUPPORTED Rust 1094:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_HCI_VENDOR_EVENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x547247e6_45bb_4c33_af8c_c00efe15a71d);

// UNSUPPORTED Rust 1095:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_KEYPRESS_EVENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd668dfcd_0f4e_4efc_bfe0_392eeec5109c);

// UNSUPPORTED Rust 1096:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_L2CAP_EVENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7eae4030_b709_4aa8_ac55_e953829c9daa);

// UNSUPPORTED Rust 1097:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_RADIO_IN_RANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea3b5b82_26ee_450e_b0d8_d26fe30a3869);

// UNSUPPORTED Rust 1098:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BLUETOOTH_RADIO_OUT_OF_RANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe28867c9_c2aa_4ced_b969_4570866037c4);

// UNSUPPORTED Rust 1099:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BTHPORT_DEVICE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0850302a_b344_4fda_9be9_90576b8d46f0);

// UNSUPPORTED Rust 1100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BTH_RFCOMM_SERVICE_DEVICE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb142fc3e_fa4e_460b_8abc_072b628b3c70);

public const val `GenericAudioServiceClassID_UUID16`: UInt = 4611u;
public const val `GenericFileTransferServiceClassID_UUID16`: UInt = 4610u;
public const val `GenericNetworkingServiceClassID_UUID16`: UInt = 4609u;
public const val `GenericTelephonyServiceClassID_UUID16`: UInt = 4612u;
public typealias `HANDLE_SDP_TYPE` = ULong;
// UNSUPPORTED Rust 1106:1: non-scalar type Ptr unsupported
// pub type HBLUETOOTH_DEVICE_FIND = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1107:1: non-scalar type Ptr unsupported
// pub type HBLUETOOTH_RADIO_FIND = *mut core::ffi::c_void;

public const val `HCCC_PROTOCOL_UUID16`: UInt = 18u;
public const val `HCDC_PROTOCOL_UUID16`: UInt = 20u;
public const val `HCI_CONNECTION_TYPE_ACL`: UInt = 1u;
public const val `HCI_CONNECTION_TYPE_LE`: UInt = 3u;
public const val `HCI_CONNECTION_TYPE_SCO`: UInt = 2u;
public const val `HCI_CONNNECTION_TYPE_ACL`: UInt = 1u;
public const val `HCI_CONNNECTION_TYPE_SCO`: UInt = 2u;
public const val `HCN_PROTOCOL_UUID16`: UInt = 22u;
public const val `HCRPrintServiceClassID_UUID16`: UInt = 4390u;
public const val `HCRScanServiceClassID_UUID16`: UInt = 4391u;
public const val `HID_PROTOCOL_UUID16`: UInt = 17u;
public const val `HTTP_PROTOCOL_UUID16`: UInt = 12u;
public const val `HandsfreeAudioGatewayServiceClassID_UUID16`: UInt = 4383u;
public const val `HandsfreeServiceClassID_UUID16`: UInt = 4382u;
public const val `HardcopyCableReplacementProfileID_UUID16`: UInt = 4389u;
public const val `HardcopyCableReplacementServiceClassID_UUID16`: UInt = 4389u;
public const val `HeadsetAudioGatewayServiceClassID_UUID16`: UInt = 4370u;
public const val `HeadsetHSServiceClassID_UUID16`: UInt = 4401u;
public const val `HeadsetServiceClassID_UUID16`: UInt = 4360u;
public const val `HealthDeviceProfileID_UUID16`: UInt = 5120u;
public const val `HealthDeviceProfileSinkServiceClassID_UUID16`: UInt = 5122u;
public const val `HealthDeviceProfileSourceServiceClassID_UUID16`: UInt = 5121u;
public const val `HumanInterfaceDeviceServiceClassID_UUID16`: UInt = 4388u;
public typealias `IO_CAPABILITY` = Int;
public const val `IP_PROTOCOL_UUID16`: UInt = 9u;
public const val `ImagingAutomaticArchiveServiceClassID_UUID16`: UInt = 4380u;
public const val `ImagingReferenceObjectsServiceClassID_UUID16`: UInt = 4381u;
public const val `ImagingResponderServiceClassID_UUID16`: UInt = 4379u;
public const val `ImagingServiceClassID_UUID16`: UInt = 4378u;
public const val `ImagingServiceProfileID_UUID16`: UInt = 4378u;
public const val `IntercomServiceClassID_UUID16`: UInt = 4368u;
public const val `IoCaps_DisplayOnly`: `IO_CAPABILITY` = 0;
public const val `IoCaps_DisplayYesNo`: `IO_CAPABILITY` = 1;
public const val `IoCaps_KeyboardOnly`: `IO_CAPABILITY` = 2;
public const val `IoCaps_NoInputNoOutput`: `IO_CAPABILITY` = 3;
public const val `IoCaps_Undefined`: `IO_CAPABILITY` = 255;
public const val `IrMCSyncServiceClassID_UUID16`: UInt = 4356u;
public const val `IrMcSyncCommandServiceClassID_UUID16`: UInt = 4359u;
public const val `L2CAP_DEFAULT_MTU`: UInt = 672u;
public const val `L2CAP_MAX_MTU`: UInt = 65535u;
public const val `L2CAP_MIN_MTU`: UInt = 48u;
public const val `L2CAP_PROTOCOL_UUID16`: UInt = 256u;
public const val `LANAccessUsingPPPServiceClassID_UUID16`: UInt = 4354u;
public const val `LANGUAGE_EN_US`: UInt = 25966u;
public const val `LANG_BASE_ENCODING_INDEX`: UInt = 1u;
public const val `LANG_BASE_LANGUAGE_INDEX`: UInt = 0u;
public const val `LANG_BASE_OFFSET_INDEX`: UInt = 2u;
public const val `LANG_DEFAULT_ID`: UInt = 256u;
public const val `LAP_GIAC_VALUE`: UInt = 10390323u;
public const val `LAP_LIAC_VALUE`: UInt = 10390272u;
public const val `MAX_L2CAP_INFO_DATA_LENGTH`: UInt = 44u;
public const val `MAX_L2CAP_PING_DATA_LENGTH`: UInt = 44u;
public const val `MAX_UUIDS_IN_QUERY`: UInt = 12u;
public const val `MITMProtectionNotDefined`: `AUTHENTICATION_REQUIREMENTS` = 255;
public const val `MITMProtectionNotRequired`: `AUTHENTICATION_REQUIREMENTS` = 0;
public const val `MITMProtectionNotRequiredBonding`: `AUTHENTICATION_REQUIREMENTS` = 2;
public const val `MITMProtectionNotRequiredGeneralBonding`: `AUTHENTICATION_REQUIREMENTS` = 4;
public const val `MITMProtectionRequired`: `AUTHENTICATION_REQUIREMENTS` = 1;
public const val `MITMProtectionRequiredBonding`: `AUTHENTICATION_REQUIREMENTS` = 3;
public const val `MITMProtectionRequiredGeneralBonding`: `AUTHENTICATION_REQUIREMENTS` = 5;
public const val `MPSProfileID_UUID16`: UInt = 4410u;
public const val `MPSServiceClassID_UUID16`: UInt = 4411u;
public const val `MessageAccessProfileID_UUID16`: UInt = 4404u;
public const val `MessageAccessServerServiceClassID_UUID16`: UInt = 4402u;
public const val `MessageNotificationServerServiceClassID_UUID16`: UInt = 4403u;
public const val `NAPServiceClassID_UUID16`: UInt = 4374u;
public const val `NS_BTH`: UInt = 16u;
public typealias `NodeContainerType` = Int;
public const val `NodeContainerTypeAlternative`: `NodeContainerType` = 1;
public const val `NodeContainerTypeSequence`: `NodeContainerType` = 0;
public const val `OBEXFileTransferServiceClassID_UUID16`: UInt = 4358u;
public const val `OBEXObjectPushServiceClassID_UUID16`: UInt = 4357u;
public const val `OBEX_PROTOCOL_UUID16`: UInt = 8u;
public const val `OBJECT_PUSH_FORMAT_ANY`: UInt = 255u;
public const val `OBJECT_PUSH_FORMAT_ICAL_2_0`: UInt = 4u;
public const val `OBJECT_PUSH_FORMAT_VCAL_1_0`: UInt = 3u;
public const val `OBJECT_PUSH_FORMAT_VCARD_2_1`: UInt = 1u;
public const val `OBJECT_PUSH_FORMAT_VCARD_3_0`: UInt = 2u;
public const val `OBJECT_PUSH_FORMAT_VMESSAGE`: UInt = 6u;
public const val `OBJECT_PUSH_FORMAT_VNOTE`: UInt = 5u;
public const val `PANUServiceClassID_UUID16`: UInt = 4373u;
// UNSUPPORTED Rust 1189:1: generic scalar type unsupported
// pub type PFNBLUETOOTH_GATT_EVENT_CALLBACK = Option<unsafe extern "system" fn(eventtype: BTH_LE_GATT_EVENT_TYPE, eventoutparameter: *const core::ffi::c_void, context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1190:1: generic scalar type unsupported
// pub type PFN_AUTHENTICATION_CALLBACK = Option<unsafe extern "system" fn(pvparam: *mut core::ffi::c_void, pdevice: *mut BLUETOOTH_DEVICE_INFO) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1191:1: generic scalar type unsupported
// pub type PFN_AUTHENTICATION_CALLBACK_EX = Option<unsafe extern "system" fn(pvparam: *const core::ffi::c_void, pauthcallbackparams: *const BLUETOOTH_AUTHENTICATION_CALLBACK_PARAMS) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1192:1: generic scalar type unsupported
// pub type PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK = Option<unsafe extern "system" fn(uattribid: u32, pvaluestream: *const u8, cbstreamsize: u32, pvparam: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1193:1: generic scalar type unsupported
// pub type PFN_DEVICE_CALLBACK = Option<unsafe extern "system" fn(pvparam: *mut core::ffi::c_void, pdevice: *const BLUETOOTH_DEVICE_INFO) -> windows_sys::core::BOOL>;

public const val `PF_BTH`: UShort = 32u;
public const val `PSM_3DSP`: UInt = 33u;
public const val `PSM_ATT`: UInt = 31u;
public const val `PSM_AVCTP`: UInt = 23u;
public const val `PSM_AVCTP_BROWSE`: UInt = 27u;
public const val `PSM_AVDTP`: UInt = 25u;
public const val `PSM_BNEP`: UInt = 15u;
public const val `PSM_HID_CONTROL`: UInt = 17u;
public const val `PSM_HID_INTERRUPT`: UInt = 19u;
public const val `PSM_LE_IPSP`: UInt = 35u;
public const val `PSM_RFCOMM`: UInt = 3u;
public const val `PSM_SDP`: UInt = 1u;
public const val `PSM_TCS_BIN`: UInt = 5u;
public const val `PSM_TCS_BIN_CORDLESS`: UInt = 7u;
public const val `PSM_UDI_C_PLANE`: UInt = 29u;
public const val `PSM_UPNP`: UInt = 21u;
public const val `PhonebookAccessPceServiceClassID_UUID16`: UInt = 4398u;
public const val `PhonebookAccessProfileID_UUID16`: UInt = 4400u;
public const val `PhonebookAccessPseServiceClassID_UUID16`: UInt = 4399u;
public const val `PnPInformationServiceClassID_UUID16`: UInt = 4608u;
public const val `PrintingStatusServiceClassID_UUID16`: UInt = 4387u;
public const val `PublicBrowseGroupServiceClassID_UUID16`: UInt = 4098u;
public const val `RFCOMM_CMD_MSC`: UInt = 1u;
public const val `RFCOMM_CMD_NONE`: UInt = 0u;
public const val `RFCOMM_CMD_RLS`: UInt = 2u;
public const val `RFCOMM_CMD_RPN`: UInt = 3u;
public const val `RFCOMM_CMD_RPN_REQUEST`: UInt = 4u;
public const val `RFCOMM_CMD_RPN_RESPONSE`: UInt = 5u;
// UNSUPPORTED Rust 1222:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct RFCOMM_COMMAND {
//     pub CmdType: u32,
//     pub Data: RFCOMM_COMMAND_0,
// }

// UNSUPPORTED Rust 1228:1: declaration Impl has no candidate rule
// impl Default for RFCOMM_COMMAND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1233:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RFCOMM_COMMAND_0 {
//     pub MSC: RFCOMM_MSC_DATA,
//     pub RLS: RFCOMM_RLS_DATA,
//     pub RPN: RFCOMM_RPN_DATA,
// }

// UNSUPPORTED Rust 1240:1: declaration Impl has no candidate rule
// impl Default for RFCOMM_COMMAND_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RFCOMM_MAX_MTU`: UInt = 1011u;
public const val `RFCOMM_MIN_MTU`: UInt = 23u;
// UNSUPPORTED Rust 1247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RFCOMM_MSC_DATA {
//     pub Signals: u8,
//     pub Break: u8,
// }

public const val `RFCOMM_PROTOCOL_UUID16`: UInt = 3u;
// UNSUPPORTED Rust 1254:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RFCOMM_RLS_DATA {
//     pub LineStatus: u8,
// }

// UNSUPPORTED Rust 1259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RFCOMM_RPN_DATA {
//     pub Baud: u8,
//     pub Data: u8,
//     pub FlowControl: u8,
//     pub XonChar: u8,
//     pub XoffChar: u8,
//     pub ParameterMask1: u8,
//     pub ParameterMask2: u8,
// }

public const val `RLS_ERROR`: UInt = 1u;
public const val `RLS_FRAMING`: UInt = 8u;
public const val `RLS_OVERRUN`: UInt = 2u;
public const val `RLS_PARITY`: UInt = 4u;
public const val `RPN_BAUD_115200`: UInt = 7u;
public const val `RPN_BAUD_19200`: UInt = 4u;
public const val `RPN_BAUD_230400`: UInt = 8u;
public const val `RPN_BAUD_2400`: UInt = 0u;
public const val `RPN_BAUD_38400`: UInt = 5u;
public const val `RPN_BAUD_4800`: UInt = 1u;
public const val `RPN_BAUD_57600`: UInt = 6u;
public const val `RPN_BAUD_7200`: UInt = 2u;
public const val `RPN_BAUD_9600`: UInt = 3u;
public const val `RPN_DATA_5`: UInt = 0u;
public const val `RPN_DATA_6`: UInt = 1u;
public const val `RPN_DATA_7`: UInt = 2u;
public const val `RPN_DATA_8`: UInt = 3u;
public const val `RPN_FLOW_RTC_IN`: UInt = 16u;
public const val `RPN_FLOW_RTC_OUT`: UInt = 32u;
public const val `RPN_FLOW_RTR_IN`: UInt = 4u;
public const val `RPN_FLOW_RTR_OUT`: UInt = 8u;
public const val `RPN_FLOW_X_IN`: UInt = 1u;
public const val `RPN_FLOW_X_OUT`: UInt = 2u;
public const val `RPN_PARAM_BAUD`: UInt = 1u;
public const val `RPN_PARAM_DATA`: UInt = 2u;
public const val `RPN_PARAM_PARITY`: UInt = 8u;
public const val `RPN_PARAM_P_TYPE`: UInt = 16u;
public const val `RPN_PARAM_RTC_IN`: UInt = 16u;
public const val `RPN_PARAM_RTC_OUT`: UInt = 32u;
public const val `RPN_PARAM_RTR_IN`: UInt = 4u;
public const val `RPN_PARAM_RTR_OUT`: UInt = 8u;
public const val `RPN_PARAM_STOP`: UInt = 4u;
public const val `RPN_PARAM_XOFF`: UInt = 64u;
public const val `RPN_PARAM_XON`: UInt = 32u;
public const val `RPN_PARAM_X_IN`: UInt = 1u;
public const val `RPN_PARAM_X_OUT`: UInt = 2u;
public const val `RPN_PARITY_EVEN`: UInt = 24u;
public const val `RPN_PARITY_MARK`: UInt = 40u;
public const val `RPN_PARITY_NONE`: UInt = 0u;
public const val `RPN_PARITY_ODD`: UInt = 8u;
public const val `RPN_PARITY_SPACE`: UInt = 56u;
public const val `RPN_STOP_1`: UInt = 0u;
public const val `RPN_STOP_1_5`: UInt = 4u;
public const val `ReferencePrintingServiceClassID_UUID16`: UInt = 4377u;
public const val `ReflectsUIServiceClassID_UUID16`: UInt = 4385u;
public const val `SAP_BIT_OFFSET`: UInt = 0u;
public const val `SDP_ATTRIB_A2DP_SUPPORTED_FEATURES`: UInt = 785u;
public const val `SDP_ATTRIB_ADDITIONAL_PROTOCOL_DESCRIPTOR_LIST`: UInt = 13u;
public const val `SDP_ATTRIB_AVAILABILITY`: UInt = 8u;
public const val `SDP_ATTRIB_AVRCP_SUPPORTED_FEATURES`: UInt = 785u;
public const val `SDP_ATTRIB_BROWSE_GROUP_ID`: UInt = 512u;
public const val `SDP_ATTRIB_BROWSE_GROUP_LIST`: UInt = 5u;
public const val `SDP_ATTRIB_CLASS_ID_LIST`: UInt = 1u;
public const val `SDP_ATTRIB_CLIENT_EXECUTABLE_URL`: UInt = 11u;
public const val `SDP_ATTRIB_CORDLESS_EXTERNAL_NETWORK`: UInt = 769u;
public const val `SDP_ATTRIB_DI_PRIMARY_RECORD`: UInt = 516u;
public const val `SDP_ATTRIB_DI_PRODUCT_ID`: UInt = 514u;
public const val `SDP_ATTRIB_DI_SPECIFICATION_ID`: UInt = 512u;
public const val `SDP_ATTRIB_DI_VENDOR_ID`: UInt = 513u;
public const val `SDP_ATTRIB_DI_VENDOR_ID_SOURCE`: UInt = 517u;
public const val `SDP_ATTRIB_DI_VERSION`: UInt = 515u;
public const val `SDP_ATTRIB_DOCUMENTATION_URL`: UInt = 10u;
public const val `SDP_ATTRIB_FAX_AUDIO_FEEDBACK_SUPPORT`: UInt = 773u;
public const val `SDP_ATTRIB_FAX_CLASS_1_SUPPORT`: UInt = 770u;
public const val `SDP_ATTRIB_FAX_CLASS_2_0_SUPPORT`: UInt = 771u;
public const val `SDP_ATTRIB_FAX_CLASS_2_SUPPORT`: UInt = 772u;
public const val `SDP_ATTRIB_HEADSET_REMOTE_AUDIO_VOLUME_CONTROL`: UInt = 770u;
public const val `SDP_ATTRIB_HFP_SUPPORTED_FEATURES`: UInt = 785u;
public const val `SDP_ATTRIB_HID_BATTERY_POWER`: UInt = 521u;
public const val `SDP_ATTRIB_HID_BOOT_DEVICE`: UInt = 526u;
public const val `SDP_ATTRIB_HID_COUNTRY_CODE`: UInt = 515u;
public const val `SDP_ATTRIB_HID_DESCRIPTOR_LIST`: UInt = 518u;
public const val `SDP_ATTRIB_HID_DEVICE_RELEASE_NUMBER`: UInt = 512u;
public const val `SDP_ATTRIB_HID_DEVICE_SUBCLASS`: UInt = 514u;
public const val `SDP_ATTRIB_HID_LANG_ID_BASE_LIST`: UInt = 519u;
public const val `SDP_ATTRIB_HID_NORMALLY_CONNECTABLE`: UInt = 525u;
public const val `SDP_ATTRIB_HID_PARSER_VERSION`: UInt = 513u;
public const val `SDP_ATTRIB_HID_PROFILE_VERSION`: UInt = 523u;
public const val `SDP_ATTRIB_HID_RECONNECT_INITIATE`: UInt = 517u;
public const val `SDP_ATTRIB_HID_REMOTE_WAKE`: UInt = 522u;
public const val `SDP_ATTRIB_HID_SDP_DISABLE`: UInt = 520u;
public const val `SDP_ATTRIB_HID_SSR_HOST_MAX_LATENCY`: UInt = 527u;
public const val `SDP_ATTRIB_HID_SSR_HOST_MIN_TIMEOUT`: UInt = 528u;
public const val `SDP_ATTRIB_HID_SUPERVISION_TIMEOUT`: UInt = 524u;
public const val `SDP_ATTRIB_HID_VIRTUAL_CABLE`: UInt = 516u;
public const val `SDP_ATTRIB_ICON_URL`: UInt = 12u;
public const val `SDP_ATTRIB_IMAGING_SUPPORTED_CAPABILITIES`: UInt = 784u;
public const val `SDP_ATTRIB_IMAGING_SUPPORTED_FEATURES`: UInt = 785u;
public const val `SDP_ATTRIB_IMAGING_SUPPORTED_FUNCTIONS`: UInt = 786u;
public const val `SDP_ATTRIB_IMAGING_TOTAL_DATA_CAPACITY`: UInt = 787u;
public const val `SDP_ATTRIB_INFO_TIME_TO_LIVE`: UInt = 7u;
public const val `SDP_ATTRIB_LANG_BASE_ATTRIB_ID_LIST`: UInt = 6u;
public const val `SDP_ATTRIB_LAN_LPSUBNET`: UInt = 512u;
public const val `SDP_ATTRIB_OBJECT_PUSH_SUPPORTED_FORMATS_LIST`: UInt = 771u;
public const val `SDP_ATTRIB_PAN_HOME_PAGE_URL`: UInt = 776u;
public const val `SDP_ATTRIB_PAN_MAX_NET_ACCESS_RATE`: UInt = 780u;
public const val `SDP_ATTRIB_PAN_NETWORK_ADDRESS`: UInt = 774u;
public const val `SDP_ATTRIB_PAN_NET_ACCESS_TYPE`: UInt = 779u;
public const val `SDP_ATTRIB_PAN_SECURITY_DESCRIPTION`: UInt = 778u;
public const val `SDP_ATTRIB_PAN_WAP_GATEWAY`: UInt = 775u;
public const val `SDP_ATTRIB_PAN_WAP_STACK_TYPE`: UInt = 777u;
public const val `SDP_ATTRIB_PROFILE_DESCRIPTOR_LIST`: UInt = 9u;
public const val `SDP_ATTRIB_PROFILE_SPECIFIC`: UInt = 512u;
public const val `SDP_ATTRIB_PROTOCOL_DESCRIPTOR_LIST`: UInt = 4u;
public const val `SDP_ATTRIB_RECORD_HANDLE`: UInt = 0u;
public const val `SDP_ATTRIB_RECORD_STATE`: UInt = 2u;
public const val `SDP_ATTRIB_SDP_DATABASE_STATE`: UInt = 513u;
public const val `SDP_ATTRIB_SDP_VERSION_NUMBER_LIST`: UInt = 512u;
public const val `SDP_ATTRIB_SERVICE_ID`: UInt = 3u;
public const val `SDP_ATTRIB_SERVICE_VERSION`: UInt = 768u;
public const val `SDP_ATTRIB_SYNCH_SUPPORTED_DATA_STORES_LIST`: UInt = 769u;
public const val `SDP_CONNECT_ALLOW_PIN`: UInt = 2u;
public const val `SDP_CONNECT_CACHE`: UInt = 1u;
public const val `SDP_DEFAULT_INQUIRY_MAX_RESPONSES`: UInt = 255u;
public const val `SDP_DEFAULT_INQUIRY_SECONDS`: UInt = 6u;
// UNSUPPORTED Rust 1385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SDP_ELEMENT_DATA {
//     pub r#type: SDP_TYPE,
//     pub specificType: SDP_SPECIFICTYPE,
//     pub data: SDP_ELEMENT_DATA_0,
// }

// UNSUPPORTED Rust 1392:1: declaration Impl has no candidate rule
// impl Default for SDP_ELEMENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1397:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SDP_ELEMENT_DATA_0 {
//     pub int128: SDP_LARGE_INTEGER_16,
//     pub int64: i64,
//     pub int32: i32,
//     pub int16: i16,
//     pub int8: i8,
//     pub uint128: SDP_ULARGE_INTEGER_16,
//     pub uint64: u64,
//     pub uint32: u32,
//     pub uint16: u16,
//     pub uint8: u8,
//     pub booleanVal: u8,
//     pub uuid128: windows_sys::core::GUID,
//     pub uuid32: u32,
//     pub uuid16: u16,
//     pub string: SDP_ELEMENT_DATA_0_0,
//     pub url: SDP_ELEMENT_DATA_0_1,
//     pub sequence: SDP_ELEMENT_DATA_0_2,
//     pub alternative: SDP_ELEMENT_DATA_0_3,
// }

// UNSUPPORTED Rust 1419:1: declaration Impl has no candidate rule
// impl Default for SDP_ELEMENT_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SDP_ELEMENT_DATA_0_3 {
//     pub value: *mut u8,
//     pub length: u32,
// }

// UNSUPPORTED Rust 1430:1: declaration Impl has no candidate rule
// impl Default for SDP_ELEMENT_DATA_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1435:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SDP_ELEMENT_DATA_0_2 {
//     pub value: *mut u8,
//     pub length: u32,
// }

// UNSUPPORTED Rust 1441:1: declaration Impl has no candidate rule
// impl Default for SDP_ELEMENT_DATA_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SDP_ELEMENT_DATA_0_0 {
//     pub value: *mut u8,
//     pub length: u32,
// }

// UNSUPPORTED Rust 1452:1: declaration Impl has no candidate rule
// impl Default for SDP_ELEMENT_DATA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1457:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SDP_ELEMENT_DATA_0_1 {
//     pub value: *mut u8,
//     pub length: u32,
// }

// UNSUPPORTED Rust 1463:1: declaration Impl has no candidate rule
// impl Default for SDP_ELEMENT_DATA_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SDP_ERROR_INSUFFICIENT_RESOURCES`: UInt = 6u;
public const val `SDP_ERROR_INVALID_CONTINUATION_STATE`: UInt = 5u;
public const val `SDP_ERROR_INVALID_PDU_SIZE`: UInt = 4u;
public const val `SDP_ERROR_INVALID_RECORD_HANDLE`: UInt = 2u;
public const val `SDP_ERROR_INVALID_REQUEST_SYNTAX`: UInt = 3u;
public const val `SDP_ERROR_INVALID_SDP_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 1474:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SDP_LARGE_INTEGER_16 {
//     pub LowPart: u64,
//     pub HighPart: i64,
// }

public const val `SDP_MAX_INQUIRY_SECONDS`: UInt = 60u;
public const val `SDP_PROTOCOL_UUID16`: UInt = 1u;
public const val `SDP_REQUEST_TO_DEFAULT`: UInt = 0u;
public const val `SDP_REQUEST_TO_MAX`: UInt = 45u;
public const val `SDP_REQUEST_TO_MIN`: UInt = 10u;
public const val `SDP_SEARCH_NO_FORMAT_CHECK`: UInt = 2u;
public const val `SDP_SEARCH_NO_PARSE_CHECK`: UInt = 1u;
public const val `SDP_SERVICE_ATTRIBUTE_REQUEST`: UInt = 2u;
public const val `SDP_SERVICE_SEARCH_ATTRIBUTE_REQUEST`: UInt = 3u;
public const val `SDP_SERVICE_SEARCH_REQUEST`: UInt = 1u;
public typealias `SDP_SPECIFICTYPE` = Int;
// UNSUPPORTED Rust 1491:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SDP_STRING_TYPE_DATA {
//     pub encoding: u16,
//     pub mibeNum: u16,
//     pub attributeId: u16,
// }

public const val `SDP_ST_INT128`: `SDP_SPECIFICTYPE` = 1056;
public const val `SDP_ST_INT16`: `SDP_SPECIFICTYPE` = 288;
public const val `SDP_ST_INT32`: `SDP_SPECIFICTYPE` = 544;
public const val `SDP_ST_INT64`: `SDP_SPECIFICTYPE` = 800;
public const val `SDP_ST_INT8`: `SDP_SPECIFICTYPE` = 32;
public const val `SDP_ST_NONE`: `SDP_SPECIFICTYPE` = 0;
public const val `SDP_ST_UINT128`: `SDP_SPECIFICTYPE` = 1040;
public const val `SDP_ST_UINT16`: `SDP_SPECIFICTYPE` = 272;
public const val `SDP_ST_UINT32`: `SDP_SPECIFICTYPE` = 528;
public const val `SDP_ST_UINT64`: `SDP_SPECIFICTYPE` = 784;
public const val `SDP_ST_UINT8`: `SDP_SPECIFICTYPE` = 16;
public const val `SDP_ST_UUID128`: `SDP_SPECIFICTYPE` = 1072;
public const val `SDP_ST_UUID16`: `SDP_SPECIFICTYPE` = 304;
public const val `SDP_ST_UUID32`: `SDP_SPECIFICTYPE` = 544;
public typealias `SDP_TYPE` = Int;
public const val `SDP_TYPE_ALTERNATIVE`: `SDP_TYPE` = 7;
public const val `SDP_TYPE_BOOLEAN`: `SDP_TYPE` = 5;
public const val `SDP_TYPE_CONTAINER`: `SDP_TYPE` = 32;
public const val `SDP_TYPE_INT`: `SDP_TYPE` = 2;
public const val `SDP_TYPE_NIL`: `SDP_TYPE` = 0;
public const val `SDP_TYPE_SEQUENCE`: `SDP_TYPE` = 6;
public const val `SDP_TYPE_STRING`: `SDP_TYPE` = 4;
public const val `SDP_TYPE_UINT`: `SDP_TYPE` = 1;
public const val `SDP_TYPE_URL`: `SDP_TYPE` = 8;
public const val `SDP_TYPE_UUID`: `SDP_TYPE` = 3;
// UNSUPPORTED Rust 1523:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SDP_ULARGE_INTEGER_16 {
//     pub LowPart: u64,
//     pub HighPart: u64,
// }

public const val `SERVICE_OPTION_DO_NOT_PUBLISH`: UInt = 2u;
public const val `SERVICE_OPTION_DO_NOT_PUBLISH_EIR`: UInt = 8u;
public const val `SERVICE_OPTION_NO_PUBLIC_BROWSE`: UInt = 4u;
public const val `SERVICE_SECURITY_AUTHENTICATE`: UInt = 4u;
public const val `SERVICE_SECURITY_AUTHORIZE`: UInt = 2u;
public const val `SERVICE_SECURITY_DISABLED`: UInt = 268435456u;
public const val `SERVICE_SECURITY_ENCRYPT_OPTIONAL`: UInt = 32u;
public const val `SERVICE_SECURITY_ENCRYPT_REQUIRED`: UInt = 16u;
public const val `SERVICE_SECURITY_NONE`: UInt = 1u;
public const val `SERVICE_SECURITY_NO_ASK`: UInt = 536870912u;
public const val `SERVICE_SECURITY_USE_DEFAULTS`: UInt = 0u;
// UNSUPPORTED Rust 1540:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKADDR_BTH {
//     pub addressFamily: u16,
//     pub btAddr: u64,
//     pub serviceClassId: windows_sys::core::GUID,
//     pub port: u32,
// }

public const val `SOL_L2CAP`: UInt = 256u;
public const val `SOL_RFCOMM`: UInt = 3u;
public const val `SOL_SDP`: UInt = 257u;
public const val `SO_BTH_AUTHENTICATE`: UInt = 2147483649u;
public const val `SO_BTH_ENCRYPT`: UInt = 2u;
public const val `SO_BTH_MTU`: UInt = 2147483655u;
public const val `SO_BTH_MTU_MAX`: UInt = 2147483656u;
public const val `SO_BTH_MTU_MIN`: UInt = 2147483658u;
public const val `STRING_DESCRIPTION_OFFSET`: UInt = 1u;
public const val `STRING_NAME_OFFSET`: UInt = 0u;
public const val `STRING_PROVIDER_NAME_OFFSET`: UInt = 2u;
// UNSUPPORTED Rust 1559:1: non-scalar type Ptr unsupported
// pub const STR_ADDR_FMT: windows_sys::core::PCWSTR = windows_sys::core::w!("(%02x:%02x:%02x:%02x:%02x:%02x)");

// UNSUPPORTED Rust 1560:1: non-scalar type Ptr unsupported
// pub const STR_ADDR_FMTA: windows_sys::core::PCSTR = windows_sys::core::s!("(%02x:%02x:%02x:%02x:%02x:%02x)");

// UNSUPPORTED Rust 1561:1: non-scalar type Ptr unsupported
// pub const STR_ADDR_FMTW: windows_sys::core::PCWSTR = windows_sys::core::w!("(%02x:%02x:%02x:%02x:%02x:%02x)");

// UNSUPPORTED Rust 1562:1: non-scalar type Ptr unsupported
// pub const STR_ADDR_SHORT_FMT: windows_sys::core::PCWSTR = windows_sys::core::w!("%04x%08x");

// UNSUPPORTED Rust 1563:1: non-scalar type Ptr unsupported
// pub const STR_ADDR_SHORT_FMTA: windows_sys::core::PCSTR = windows_sys::core::s!("%04x%08x");

// UNSUPPORTED Rust 1564:1: non-scalar type Ptr unsupported
// pub const STR_ADDR_SHORT_FMTW: windows_sys::core::PCWSTR = windows_sys::core::w!("%04x%08x");

// UNSUPPORTED Rust 1565:1: non-scalar type Ptr unsupported
// pub const STR_USBHCI_CLASS_HARDWAREID: windows_sys::core::PCWSTR = windows_sys::core::w!("USB\\Class_E0&SubClass_01&Prot_01");

// UNSUPPORTED Rust 1566:1: non-scalar type Ptr unsupported
// pub const STR_USBHCI_CLASS_HARDWAREIDA: windows_sys::core::PCSTR = windows_sys::core::s!("USB\\Class_E0&SubClass_01&Prot_01");

// UNSUPPORTED Rust 1567:1: non-scalar type Ptr unsupported
// pub const STR_USBHCI_CLASS_HARDWAREIDW: windows_sys::core::PCWSTR = windows_sys::core::w!("USB\\Class_E0&SubClass_01&Prot_01");

// UNSUPPORTED Rust 1568:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SVCID_BTH_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x06aa63e0_7d60_41ff_afb2_3ee6d2d9392d);

public const val `SYNCH_DATA_STORE_CALENDAR`: UInt = 3u;
public const val `SYNCH_DATA_STORE_MESSAGES`: UInt = 6u;
public const val `SYNCH_DATA_STORE_NOTES`: UInt = 5u;
public const val `SYNCH_DATA_STORE_PHONEBOOK`: UInt = 1u;
// UNSUPPORTED Rust 1573:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SdpAttributeRange {
//     pub minAttribute: u16,
//     pub maxAttribute: u16,
// }

// UNSUPPORTED Rust 1579:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SdpQueryUuid {
//     pub u: SdpQueryUuidUnion,
//     pub uuidType: u16,
// }

// UNSUPPORTED Rust 1585:1: declaration Impl has no candidate rule
// impl Default for SdpQueryUuid {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1590:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SdpQueryUuidUnion {
//     pub uuid128: windows_sys::core::GUID,
//     pub uuid32: u32,
//     pub uuid16: u16,
// }

// UNSUPPORTED Rust 1597:1: declaration Impl has no candidate rule
// impl Default for SdpQueryUuidUnion {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SerialPortServiceClassID_UUID16`: UInt = 4353u;
public const val `ServerCharacteristicConfiguration`: `BTH_LE_GATT_DESCRIPTOR_TYPE` = 3;
public const val `ServiceDiscoveryServerServiceClassID_UUID16`: UInt = 4096u;
public const val `SimAccessServiceClassID_UUID16`: UInt = 4397u;
public const val `TCP_PROTOCOL_UUID16`: UInt = 4u;
public const val `TCSAT_PROTOCOL_UUID16`: UInt = 6u;
public const val `TCSBIN_PROTOCOL_UUID16`: UInt = 5u;
public const val `ThreeDimensionalDisplayServiceClassID_UUID16`: UInt = 4407u;
public const val `ThreeDimensionalGlassesServiceClassID_UUID16`: UInt = 4408u;
public const val `ThreeDimensionalSynchronizationProfileID_UUID16`: UInt = 4409u;
public const val `UDIMTServiceClassID_UUID16`: UInt = 4394u;
public const val `UDIMTServiceClass_UUID16`: UInt = 4394u;
public const val `UDITAServiceClassID_UUID16`: UInt = 4395u;
public const val `UDITAServiceClass_UUID16`: UInt = 4395u;
public const val `UDI_C_PLANE_PROTOCOL_UUID16`: UInt = 29u;
public const val `UDP_PROTOCOL_UUID16`: UInt = 2u;
public const val `UPNP_PROTOCOL_UUID16`: UInt = 16u;
public const val `UPnpIpServiceClassID_UUID16`: UInt = 4614u;
public const val `UPnpServiceClassID_UUID16`: UInt = 4613u;
public const val `VideoConferencingGWServiceClassID_UUID16`: UInt = 4393u;
public const val `VideoConferencingGWServiceClass_UUID16`: UInt = 4393u;
public const val `VideoConferencingServiceClassID_UUID16`: UInt = 4367u;
public const val `VideoDistributionProfileID_UUID16`: UInt = 4869u;
public const val `VideoSinkServiceClassID_UUID16`: UInt = 4868u;
public const val `VideoSourceServiceClassID_UUID16`: UInt = 4867u;
public const val `WAPClientServiceClassID_UUID16`: UInt = 4372u;
public const val `WAPServiceClassID_UUID16`: UInt = 4371u;
public const val `WSP_PROTOCOL_UUID16`: UInt = 14u;
