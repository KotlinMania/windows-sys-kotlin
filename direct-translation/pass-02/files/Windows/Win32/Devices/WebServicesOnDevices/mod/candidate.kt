// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDAllocateLinkedMemory(pparent : *mut core::ffi::c_void, cbsize : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDAttachLinkedMemory(pparent : *mut core::ffi::c_void, pchild : *mut core::ffi::c_void));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDeviceHost(pszlocalid : windows_sys::core::PCWSTR, pcontext : * mut core::ffi::c_void, ppdevicehost : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDeviceHost2(pszlocalid : windows_sys::core::PCWSTR, pcontext : * mut core::ffi::c_void, pconfigparams : *const WSD_CONFIG_PARAM, dwconfigparamcount : u32, ppdevicehost : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDeviceHostAdvanced(pszlocalid : windows_sys::core::PCWSTR, pcontext : * mut core::ffi::c_void, pphostaddresses : *const * mut core::ffi::c_void, dwhostaddresscount : u32, ppdevicehost : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDeviceProxy(pszdeviceid : windows_sys::core::PCWSTR, pszlocalid : windows_sys::core::PCWSTR, pcontext : * mut core::ffi::c_void, ppdeviceproxy : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDeviceProxy2(pszdeviceid : windows_sys::core::PCWSTR, pszlocalid : windows_sys::core::PCWSTR, pcontext : * mut core::ffi::c_void, pconfigparams : *const WSD_CONFIG_PARAM, dwconfigparamcount : u32, ppdeviceproxy : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDeviceProxyAdvanced(pszdeviceid : windows_sys::core::PCWSTR, pdeviceaddress : * mut core::ffi::c_void, pszlocalid : windows_sys::core::PCWSTR, pcontext : * mut core::ffi::c_void, ppdeviceproxy : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDiscoveryProvider(pcontext : * mut core::ffi::c_void, ppprovider : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDiscoveryProvider2(pcontext : * mut core::ffi::c_void, pconfigparams : *const WSD_CONFIG_PARAM, dwconfigparamcount : u32, ppprovider : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDiscoveryPublisher(pcontext : * mut core::ffi::c_void, pppublisher : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateDiscoveryPublisher2(pcontext : * mut core::ffi::c_void, pconfigparams : *const WSD_CONFIG_PARAM, dwconfigparamcount : u32, pppublisher : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateHttpAddress(ppaddress : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateHttpMessageParameters(pptxparams : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateOutboundAttachment(ppattachment : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateUdpAddress(ppaddress : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDCreateUdpMessageParameters(pptxparams : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDDetachLinkedMemory(pvoid : *mut core::ffi::c_void));

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDFreeLinkedMemory(pvoid : *mut core::ffi::c_void));

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDGenerateFault(pszcode : windows_sys::core::PCWSTR, pszsubcode : windows_sys::core::PCWSTR, pszreason : windows_sys::core::PCWSTR, pszdetail : windows_sys::core::PCWSTR, pcontext : * mut core::ffi::c_void, ppfault : *mut *mut WSD_SOAP_FAULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDGenerateFaultEx(pcode : *const WSDXML_NAME, psubcode : *const WSDXML_NAME, preasons : *const WSD_LOCALIZED_STRING_LIST, pszdetail : windows_sys::core::PCWSTR, ppfault : *mut *mut WSD_SOAP_FAULT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDGetConfigurationOption(dwoption : u32, pvoid : *mut core::ffi::c_void, cboutbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDSetConfigurationOption(dwoption : u32, pvoid : *const core::ffi::c_void, cbinbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDUriDecode(source : windows_sys::core::PCWSTR, cchsource : u32, destout : *mut windows_sys::core::PWSTR, cchdestout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDUriEncode(source : windows_sys::core::PCWSTR, cchsource : u32, destout : *mut windows_sys::core::PWSTR, cchdestout : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDXMLAddChild(pparent : *mut WSDXML_ELEMENT, pchild : *mut WSDXML_ELEMENT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDXMLAddSibling(pfirst : *mut WSDXML_ELEMENT, psecond : *mut WSDXML_ELEMENT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDXMLBuildAnyForSingleElement(pelementname : *mut WSDXML_NAME, psztext : windows_sys::core::PCWSTR, ppany : *mut *mut WSDXML_ELEMENT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDXMLCleanupElement(pany : *mut WSDXML_ELEMENT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDXMLCreateContext(ppcontext : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDXMLGetNameFromBuiltinNamespace(psznamespace : windows_sys::core::PCWSTR, pszname : windows_sys::core::PCWSTR, ppname : *mut *mut WSDXML_NAME) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wsdapi.dll" "system" fn WSDXMLGetValueFromAny(psznamespace : windows_sys::core::PCWSTR, pszname : windows_sys::core::PCWSTR, pany : *mut WSDXML_ELEMENT, ppszvalue : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

public typealias `DeviceDiscoveryMechanism` = Int;
public const val `DirectedDiscovery`: `DeviceDiscoveryMechanism` = 1;
public const val `MulticastDiscovery`: `DeviceDiscoveryMechanism` = 0;
public const val `ONE_WAY`: `WSDUdpMessageType` = 0;
public const val `OpAnyElement`: `WSDXML_OP` = 6;
public const val `OpAnyElements`: `WSDXML_OP` = 7;
public const val `OpAnyNumber`: `WSDXML_OP` = 17;
public const val `OpAnyText`: `WSDXML_OP` = 8;
public const val `OpAnything`: `WSDXML_OP` = 16;
public const val `OpAttribute_`: `WSDXML_OP` = 9;
public const val `OpBeginAll`: `WSDXML_OP` = 14;
public const val `OpBeginAnyElement`: `WSDXML_OP` = 3;
public const val `OpBeginChoice`: `WSDXML_OP` = 10;
public const val `OpBeginElement_`: `WSDXML_OP` = 2;
public const val `OpBeginSequence`: `WSDXML_OP` = 12;
public const val `OpElement_`: `WSDXML_OP` = 5;
public const val `OpEndAll`: `WSDXML_OP` = 15;
public const val `OpEndChoice`: `WSDXML_OP` = 11;
public const val `OpEndElement`: `WSDXML_OP` = 4;
public const val `OpEndOfTable`: `WSDXML_OP` = 1;
public const val `OpEndSequence`: `WSDXML_OP` = 13;
public const val `OpFormatBool_`: `WSDXML_OP` = 20;
public const val `OpFormatDateTime_`: `WSDXML_OP` = 40;
public const val `OpFormatDom_`: `WSDXML_OP` = 30;
public const val `OpFormatDouble_`: `WSDXML_OP` = 42;
public const val `OpFormatDuration_`: `WSDXML_OP` = 39;
public const val `OpFormatDynamicType_`: `WSDXML_OP` = 37;
public const val `OpFormatFloat_`: `WSDXML_OP` = 41;
public const val `OpFormatInt16_`: `WSDXML_OP` = 22;
public const val `OpFormatInt32_`: `WSDXML_OP` = 23;
public const val `OpFormatInt64_`: `WSDXML_OP` = 24;
public const val `OpFormatInt8_`: `WSDXML_OP` = 21;
public const val `OpFormatListInsertTail_`: `WSDXML_OP` = 35;
public const val `OpFormatLookupType_`: `WSDXML_OP` = 38;
public const val `OpFormatMax`: `WSDXML_OP` = 46;
public const val `OpFormatName_`: `WSDXML_OP` = 34;
public const val `OpFormatStruct_`: `WSDXML_OP` = 31;
public const val `OpFormatType_`: `WSDXML_OP` = 36;
public const val `OpFormatUInt16_`: `WSDXML_OP` = 26;
public const val `OpFormatUInt32_`: `WSDXML_OP` = 27;
public const val `OpFormatUInt64_`: `WSDXML_OP` = 28;
public const val `OpFormatUInt8_`: `WSDXML_OP` = 25;
public const val `OpFormatUnicodeString_`: `WSDXML_OP` = 29;
public const val `OpFormatUri_`: `WSDXML_OP` = 32;
public const val `OpFormatUuidUri_`: `WSDXML_OP` = 33;
public const val `OpFormatXMLDeclaration_`: `WSDXML_OP` = 45;
public const val `OpNone`: `WSDXML_OP` = 0;
public const val `OpOneOrMore`: `WSDXML_OP` = 18;
public const val `OpOptional`: `WSDXML_OP` = 19;
public const val `OpProcess_`: `WSDXML_OP` = 43;
public const val `OpQualifiedAttribute_`: `WSDXML_OP` = 44;
// UNSUPPORTED Rust 84:1: generic scalar type unsupported
// pub type PWSD_SOAP_MESSAGE_HANDLER = Option<unsafe extern "system" fn(thisunknown: *mut core::ffi::c_void, event: *mut WSD_EVENT) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 85:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REQUESTBODY_GetStatus {
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 90:1: declaration Impl has no candidate rule
// impl Default for REQUESTBODY_GetStatus {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 95:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REQUESTBODY_Renew {
//     pub Expires: *mut WSD_EVENTING_EXPIRES,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 101:1: declaration Impl has no candidate rule
// impl Default for REQUESTBODY_Renew {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 106:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REQUESTBODY_Subscribe {
//     pub EndTo: *mut WSD_ENDPOINT_REFERENCE,
//     pub Delivery: *mut WSD_EVENTING_DELIVERY_MODE,
//     pub Expires: *mut WSD_EVENTING_EXPIRES,
//     pub Filter: *mut WSD_EVENTING_FILTER,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 115:1: declaration Impl has no candidate rule
// impl Default for REQUESTBODY_Subscribe {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REQUESTBODY_Unsubscribe {
//     pub any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 125:1: declaration Impl has no candidate rule
// impl Default for REQUESTBODY_Unsubscribe {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESPONSEBODY_GetMetadata {
//     pub Metadata: *mut WSD_METADATA_SECTION_LIST,
// }

// UNSUPPORTED Rust 135:1: declaration Impl has no candidate rule
// impl Default for RESPONSEBODY_GetMetadata {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESPONSEBODY_GetStatus {
//     pub expires: *mut WSD_EVENTING_EXPIRES,
//     pub any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 146:1: declaration Impl has no candidate rule
// impl Default for RESPONSEBODY_GetStatus {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESPONSEBODY_Renew {
//     pub expires: *mut WSD_EVENTING_EXPIRES,
//     pub any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 157:1: declaration Impl has no candidate rule
// impl Default for RESPONSEBODY_Renew {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 162:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESPONSEBODY_Subscribe {
//     pub SubscriptionManager: *mut WSD_ENDPOINT_REFERENCE,
//     pub expires: *mut WSD_EVENTING_EXPIRES,
//     pub any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 169:1: declaration Impl has no candidate rule
// impl Default for RESPONSEBODY_Subscribe {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 174:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESPONSEBODY_SubscriptionEnd {
//     pub SubscriptionManager: *mut WSD_ENDPOINT_REFERENCE,
//     pub Status: windows_sys::core::PCWSTR,
//     pub Reason: *mut WSD_LOCALIZED_STRING,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 182:1: declaration Impl has no candidate rule
// impl Default for RESPONSEBODY_SubscriptionEnd {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SecureDirectedDiscovery`: `DeviceDiscoveryMechanism` = 2;
public const val `TWO_WAY`: `WSDUdpMessageType` = 1;
public const val `WSDAPI_ADDRESSFAMILY_IPV4`: UInt = 1u;
public const val `WSDAPI_ADDRESSFAMILY_IPV6`: UInt = 2u;
public const val `WSDAPI_COMPACTSIG_ACCEPT_ALL_MESSAGES`: UInt = 1u;
public const val `WSDAPI_OPTION_MAX_INBOUND_MESSAGE_SIZE`: UInt = 1u;
public const val `WSDAPI_OPTION_TRACE_XML_TO_DEBUGGER`: UInt = 2u;
public const val `WSDAPI_OPTION_TRACE_XML_TO_FILE`: UInt = 3u;
public const val `WSDAPI_SSL_CERT_APPLY_DEFAULT_CHECKS`: UInt = 0u;
public const val `WSDAPI_SSL_CERT_IGNORE_EXPIRY`: UInt = 2u;
public const val `WSDAPI_SSL_CERT_IGNORE_INVALID_CN`: UInt = 16u;
public const val `WSDAPI_SSL_CERT_IGNORE_REVOCATION`: UInt = 1u;
public const val `WSDAPI_SSL_CERT_IGNORE_UNKNOWN_CA`: UInt = 8u;
public const val `WSDAPI_SSL_CERT_IGNORE_WRONG_USAGE`: UInt = 4u;
public const val `WSDET_INCOMING_FAULT`: `WSDEventType` = 2;
public const val `WSDET_INCOMING_MESSAGE`: `WSDEventType` = 1;
public const val `WSDET_NONE`: `WSDEventType` = 0;
public const val `WSDET_RESPONSE_TIMEOUT`: `WSDEventType` = 4;
public const val `WSDET_TRANSMISSION_FAILURE`: `WSDEventType` = 3;
public typealias `WSDEventType` = Int;
public typealias `WSDUdpMessageType` = Int;
// UNSUPPORTED Rust 208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WSDUdpRetransmitParams {
//     pub ulSendDelay: u32,
//     pub ulRepeat: u32,
//     pub ulRepeatMinDelay: u32,
//     pub ulRepeatMaxDelay: u32,
//     pub ulRepeatUpperDelay: u32,
// }

// UNSUPPORTED Rust 217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_ATTRIBUTE {
//     pub Element: *mut WSDXML_ELEMENT,
//     pub Next: *mut WSDXML_ATTRIBUTE,
//     pub Name: *mut WSDXML_NAME,
//     pub Value: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 225:1: declaration Impl has no candidate rule
// impl Default for WSDXML_ATTRIBUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_ELEMENT {
//     pub Node: WSDXML_NODE,
//     pub Name: *mut WSDXML_NAME,
//     pub FirstAttribute: *mut WSDXML_ATTRIBUTE,
//     pub FirstChild: *mut WSDXML_NODE,
//     pub PrefixMappings: *mut WSDXML_PREFIX_MAPPING,
// }

// UNSUPPORTED Rust 239:1: declaration Impl has no candidate rule
// impl Default for WSDXML_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_ELEMENT_LIST {
//     pub Next: *mut WSDXML_ELEMENT_LIST,
//     pub Element: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule
// impl Default for WSDXML_ELEMENT_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_NAME {
//     pub Space: *mut WSDXML_NAMESPACE,
//     pub LocalName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 261:1: declaration Impl has no candidate rule
// impl Default for WSDXML_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_NAMESPACE {
//     pub Uri: windows_sys::core::PCWSTR,
//     pub PreferredPrefix: windows_sys::core::PCWSTR,
//     pub Names: *mut WSDXML_NAME,
//     pub NamesCount: u16,
//     pub Encoding: u16,
// }

// UNSUPPORTED Rust 275:1: declaration Impl has no candidate rule
// impl Default for WSDXML_NAMESPACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_NODE {
//     pub Type: i32,
//     pub Parent: *mut WSDXML_ELEMENT,
//     pub Next: *mut WSDXML_NODE,
// }

// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule
// impl WSDXML_NODE {
//     pub const ElementType: i32 = 0i32;
//     pub const TextType: i32 = 1i32;
// }

// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule
// impl Default for WSDXML_NODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSDXML_OP` = Int;
// UNSUPPORTED Rust 297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_PREFIX_MAPPING {
//     pub Refs: u32,
//     pub Next: *mut WSDXML_PREFIX_MAPPING,
//     pub Space: *mut WSDXML_NAMESPACE,
//     pub Prefix: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 305:1: declaration Impl has no candidate rule
// impl Default for WSDXML_PREFIX_MAPPING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_TEXT {
//     pub Node: WSDXML_NODE,
//     pub Text: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 316:1: declaration Impl has no candidate rule
// impl Default for WSDXML_TEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSDXML_TYPE {
//     pub Uri: windows_sys::core::PCWSTR,
//     pub Table: *const u8,
// }

// UNSUPPORTED Rust 327:1: declaration Impl has no candidate rule
// impl Default for WSDXML_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_APP_SEQUENCE {
//     pub InstanceId: u64,
//     pub SequenceId: windows_sys::core::PCWSTR,
//     pub MessageNumber: u64,
// }

// UNSUPPORTED Rust 339:1: declaration Impl has no candidate rule
// impl Default for WSD_APP_SEQUENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_BYE {
//     pub EndpointReference: *mut WSD_ENDPOINT_REFERENCE,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 350:1: declaration Impl has no candidate rule
// impl Default for WSD_BYE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_CONFIG_ADDRESSES {
//     pub addresses: *mut *mut core::ffi::c_void,
//     pub dwAddressCount: u32,
// }

// UNSUPPORTED Rust 361:1: declaration Impl has no candidate rule
// impl Default for WSD_CONFIG_ADDRESSES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSD_CONFIG_DEVICE_ADDRESSES`: `WSD_CONFIG_PARAM_TYPE` = 10;
public const val `WSD_CONFIG_HOSTING_ADDRESSES`: `WSD_CONFIG_PARAM_TYPE` = 9;
public const val `WSD_CONFIG_MAX_INBOUND_MESSAGE_SIZE`: `WSD_CONFIG_PARAM_TYPE` = 1;
public const val `WSD_CONFIG_MAX_OUTBOUND_MESSAGE_SIZE`: `WSD_CONFIG_PARAM_TYPE` = 2;
// UNSUPPORTED Rust 370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_CONFIG_PARAM {
//     pub configParamType: WSD_CONFIG_PARAM_TYPE,
//     pub pConfigData: *mut core::ffi::c_void,
//     pub dwConfigDataSize: u32,
// }

// UNSUPPORTED Rust 377:1: declaration Impl has no candidate rule
// impl Default for WSD_CONFIG_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSD_CONFIG_PARAM_TYPE` = Int;
// UNSUPPORTED Rust 383:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WSD_DATETIME {
//     pub isPositive: windows_sys::core::BOOL,
//     pub year: u32,
//     pub month: u8,
//     pub day: u8,
//     pub hour: u8,
//     pub minute: u8,
//     pub second: u8,
//     pub millisecond: u32,
//     pub TZIsLocal: windows_sys::core::BOOL,
//     pub TZIsPositive: windows_sys::core::BOOL,
//     pub TZHour: u8,
//     pub TZMinute: u8,
// }

// UNSUPPORTED Rust 399:1: non-scalar type Ptr unsupported
// pub const WSD_DEFAULT_EVENTING_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("http://*:5357/");

// UNSUPPORTED Rust 400:1: non-scalar type Ptr unsupported
// pub const WSD_DEFAULT_HOSTING_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("http://*:5357/");

// UNSUPPORTED Rust 401:1: non-scalar type Ptr unsupported
// pub const WSD_DEFAULT_SECURE_HOSTING_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("https://*:5358/");

// UNSUPPORTED Rust 402:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WSD_DURATION {
//     pub isPositive: windows_sys::core::BOOL,
//     pub year: u32,
//     pub month: u32,
//     pub day: u32,
//     pub hour: u32,
//     pub minute: u32,
//     pub second: u32,
//     pub millisecond: u32,
// }

// UNSUPPORTED Rust 414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_ENDPOINT_REFERENCE {
//     pub Address: windows_sys::core::PCWSTR,
//     pub ReferenceProperties: WSD_REFERENCE_PROPERTIES,
//     pub ReferenceParameters: WSD_REFERENCE_PARAMETERS,
//     pub PortType: *mut WSDXML_NAME,
//     pub ServiceName: *mut WSDXML_NAME,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 424:1: declaration Impl has no candidate rule
// impl Default for WSD_ENDPOINT_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_ENDPOINT_REFERENCE_LIST {
//     pub Next: *mut WSD_ENDPOINT_REFERENCE_LIST,
//     pub Element: *mut WSD_ENDPOINT_REFERENCE,
// }

// UNSUPPORTED Rust 435:1: declaration Impl has no candidate rule
// impl Default for WSD_ENDPOINT_REFERENCE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_EVENT {
//     pub Hr: windows_sys::core::HRESULT,
//     pub EventType: u32,
//     pub DispatchTag: windows_sys::core::PWSTR,
//     pub HandlerContext: WSD_HANDLER_CONTEXT,
//     pub Soap: *mut WSD_SOAP_MESSAGE,
//     pub Operation: *mut WSD_OPERATION,
//     pub MessageParameters: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 451:1: declaration Impl has no candidate rule
// impl Default for WSD_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 456:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_EVENTING_DELIVERY_MODE {
//     pub Mode: windows_sys::core::PCWSTR,
//     pub Push: *mut WSD_EVENTING_DELIVERY_MODE_PUSH,
//     pub Data: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 463:1: declaration Impl has no candidate rule
// impl Default for WSD_EVENTING_DELIVERY_MODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_EVENTING_DELIVERY_MODE_PUSH {
//     pub NotifyTo: *mut WSD_ENDPOINT_REFERENCE,
// }

// UNSUPPORTED Rust 473:1: declaration Impl has no candidate rule
// impl Default for WSD_EVENTING_DELIVERY_MODE_PUSH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_EVENTING_EXPIRES {
//     pub Duration: *mut WSD_DURATION,
//     pub DateTime: *mut WSD_DATETIME,
// }

// UNSUPPORTED Rust 484:1: declaration Impl has no candidate rule
// impl Default for WSD_EVENTING_EXPIRES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 489:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_EVENTING_FILTER {
//     pub Dialect: windows_sys::core::PCWSTR,
//     pub FilterAction: *mut WSD_EVENTING_FILTER_ACTION,
//     pub Data: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 496:1: declaration Impl has no candidate rule
// impl Default for WSD_EVENTING_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_EVENTING_FILTER_ACTION {
//     pub Actions: *mut WSD_URI_LIST,
// }

// UNSUPPORTED Rust 506:1: declaration Impl has no candidate rule
// impl Default for WSD_EVENTING_FILTER_ACTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 511:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_HANDLER_CONTEXT {
//     pub Handler: PWSD_SOAP_MESSAGE_HANDLER,
//     pub PVoid: *mut core::ffi::c_void,
//     pub Unknown: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule
// impl Default for WSD_HANDLER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 523:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_HEADER_RELATESTO {
//     pub RelationshipType: *mut WSDXML_NAME,
//     pub MessageID: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 529:1: declaration Impl has no candidate rule
// impl Default for WSD_HEADER_RELATESTO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_HELLO {
//     pub EndpointReference: *mut WSD_ENDPOINT_REFERENCE,
//     pub Types: *mut WSD_NAME_LIST,
//     pub Scopes: *mut WSD_SCOPES,
//     pub XAddrs: *mut WSD_URI_LIST,
//     pub MetadataVersion: u64,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 544:1: declaration Impl has no candidate rule
// impl Default for WSD_HELLO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 549:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_HOST_METADATA {
//     pub Host: *mut WSD_SERVICE_METADATA,
//     pub Hosted: *mut WSD_SERVICE_METADATA_LIST,
// }

// UNSUPPORTED Rust 555:1: declaration Impl has no candidate rule
// impl Default for WSD_HOST_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_LOCALIZED_STRING {
//     pub lang: windows_sys::core::PCWSTR,
//     pub String: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 566:1: declaration Impl has no candidate rule
// impl Default for WSD_LOCALIZED_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 571:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_LOCALIZED_STRING_LIST {
//     pub Next: *mut WSD_LOCALIZED_STRING_LIST,
//     pub Element: *mut WSD_LOCALIZED_STRING,
// }

// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule
// impl Default for WSD_LOCALIZED_STRING_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 582:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_METADATA_SECTION {
//     pub Dialect: windows_sys::core::PCWSTR,
//     pub Identifier: windows_sys::core::PCWSTR,
//     pub Data: *mut core::ffi::c_void,
//     pub MetadataReference: *mut WSD_ENDPOINT_REFERENCE,
//     pub Location: windows_sys::core::PCWSTR,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 592:1: declaration Impl has no candidate rule
// impl Default for WSD_METADATA_SECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 597:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_METADATA_SECTION_LIST {
//     pub Next: *mut WSD_METADATA_SECTION_LIST,
//     pub Element: *mut WSD_METADATA_SECTION,
// }

// UNSUPPORTED Rust 603:1: declaration Impl has no candidate rule
// impl Default for WSD_METADATA_SECTION_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 608:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_NAME_LIST {
//     pub Next: *mut WSD_NAME_LIST,
//     pub Element: *mut WSDXML_NAME,
// }

// UNSUPPORTED Rust 614:1: declaration Impl has no candidate rule
// impl Default for WSD_NAME_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_OPERATION {
//     pub RequestType: *mut WSDXML_TYPE,
//     pub ResponseType: *mut WSDXML_TYPE,
//     pub RequestStubFunction: WSD_STUB_FUNCTION,
// }

// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule
// impl Default for WSD_OPERATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 631:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_PORT_TYPE {
//     pub EncodedName: u32,
//     pub OperationCount: u32,
//     pub Operations: *mut WSD_OPERATION,
//     pub ProtocolType: WSD_PROTOCOL_TYPE,
// }

// UNSUPPORTED Rust 639:1: declaration Impl has no candidate rule
// impl Default for WSD_PORT_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_PROBE {
//     pub Types: *mut WSD_NAME_LIST,
//     pub Scopes: *mut WSD_SCOPES,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 651:1: declaration Impl has no candidate rule
// impl Default for WSD_PROBE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 656:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_PROBE_MATCH {
//     pub EndpointReference: *mut WSD_ENDPOINT_REFERENCE,
//     pub Types: *mut WSD_NAME_LIST,
//     pub Scopes: *mut WSD_SCOPES,
//     pub XAddrs: *mut WSD_URI_LIST,
//     pub MetadataVersion: u64,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 666:1: declaration Impl has no candidate rule
// impl Default for WSD_PROBE_MATCH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_PROBE_MATCHES {
//     pub ProbeMatch: *mut WSD_PROBE_MATCH_LIST,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 677:1: declaration Impl has no candidate rule
// impl Default for WSD_PROBE_MATCHES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_PROBE_MATCH_LIST {
//     pub Next: *mut WSD_PROBE_MATCH_LIST,
//     pub Element: *mut WSD_PROBE_MATCH,
// }

// UNSUPPORTED Rust 688:1: declaration Impl has no candidate rule
// impl Default for WSD_PROBE_MATCH_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WSD_PROTOCOL_TYPE` = Int;
public const val `WSD_PT_ALL`: `WSD_PROTOCOL_TYPE` = 255;
public const val `WSD_PT_HTTP`: `WSD_PROTOCOL_TYPE` = 2;
public const val `WSD_PT_HTTPS`: `WSD_PROTOCOL_TYPE` = 4;
public const val `WSD_PT_NONE`: `WSD_PROTOCOL_TYPE` = 0;
public const val `WSD_PT_UDP`: `WSD_PROTOCOL_TYPE` = 1;
// UNSUPPORTED Rust 699:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_REFERENCE_PARAMETERS {
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 704:1: declaration Impl has no candidate rule
// impl Default for WSD_REFERENCE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_REFERENCE_PROPERTIES {
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule
// impl Default for WSD_REFERENCE_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 719:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_RELATIONSHIP_METADATA {
//     pub Type: windows_sys::core::PCWSTR,
//     pub Data: *mut WSD_HOST_METADATA,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 726:1: declaration Impl has no candidate rule
// impl Default for WSD_RELATIONSHIP_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 731:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_RESOLVE {
//     pub EndpointReference: *mut WSD_ENDPOINT_REFERENCE,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 737:1: declaration Impl has no candidate rule
// impl Default for WSD_RESOLVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 742:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_RESOLVE_MATCH {
//     pub EndpointReference: *mut WSD_ENDPOINT_REFERENCE,
//     pub Types: *mut WSD_NAME_LIST,
//     pub Scopes: *mut WSD_SCOPES,
//     pub XAddrs: *mut WSD_URI_LIST,
//     pub MetadataVersion: u64,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 752:1: declaration Impl has no candidate rule
// impl Default for WSD_RESOLVE_MATCH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 757:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_RESOLVE_MATCHES {
//     pub ResolveMatch: *mut WSD_RESOLVE_MATCH,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 763:1: declaration Impl has no candidate rule
// impl Default for WSD_RESOLVE_MATCHES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 768:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SCOPES {
//     pub MatchBy: windows_sys::core::PCWSTR,
//     pub Scopes: *mut WSD_URI_LIST,
// }

// UNSUPPORTED Rust 774:1: declaration Impl has no candidate rule
// impl Default for WSD_SCOPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 779:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WSD_SECURITY_CERT_VALIDATION {
//     pub certMatchArray: *mut *mut super::super::Security::Cryptography::CERT_CONTEXT,
//     pub dwCertMatchArrayCount: u32,
//     pub hCertMatchStore: super::super::Security::Cryptography::HCERTSTORE,
//     pub hCertIssuerStore: super::super::Security::Cryptography::HCERTSTORE,
//     pub dwCertCheckOptions: u32,
//     pub pszCNGHashAlgId: windows_sys::core::PCWSTR,
//     pub pbCertHash: *mut u8,
//     pub dwCertHashSize: u32,
// }

// UNSUPPORTED Rust 792:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WSD_SECURITY_CERT_VALIDATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 798:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WSD_SECURITY_CERT_VALIDATION_V1 {
//     pub certMatchArray: *mut *mut super::super::Security::Cryptography::CERT_CONTEXT,
//     pub dwCertMatchArrayCount: u32,
//     pub hCertMatchStore: super::super::Security::Cryptography::HCERTSTORE,
//     pub hCertIssuerStore: super::super::Security::Cryptography::HCERTSTORE,
//     pub dwCertCheckOptions: u32,
// }

// UNSUPPORTED Rust 808:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WSD_SECURITY_CERT_VALIDATION_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSD_SECURITY_COMPACTSIG_SIGNING_CERT`: `WSD_CONFIG_PARAM_TYPE` = 7;
public const val `WSD_SECURITY_COMPACTSIG_VALIDATION`: `WSD_CONFIG_PARAM_TYPE` = 8;
public const val `WSD_SECURITY_HTTP_AUTH_SCHEME_NEGOTIATE`: UInt = 1u;
public const val `WSD_SECURITY_HTTP_AUTH_SCHEME_NTLM`: UInt = 2u;
public const val `WSD_SECURITY_REQUIRE_CLIENT_CERT_OR_HTTP_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 12;
public const val `WSD_SECURITY_REQUIRE_HTTP_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 11;
// UNSUPPORTED Rust 820:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct WSD_SECURITY_SIGNATURE_VALIDATION {
//     pub signingCertArray: *mut *mut super::super::Security::Cryptography::CERT_CONTEXT,
//     pub dwSigningCertArrayCount: u32,
//     pub hSigningCertStore: super::super::Security::Cryptography::HCERTSTORE,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 829:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for WSD_SECURITY_SIGNATURE_VALIDATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WSD_SECURITY_SSL_CERT_FOR_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 3;
public const val `WSD_SECURITY_SSL_CLIENT_CERT_VALIDATION`: `WSD_CONFIG_PARAM_TYPE` = 5;
public const val `WSD_SECURITY_SSL_NEGOTIATE_CLIENT_CERT`: `WSD_CONFIG_PARAM_TYPE` = 6;
public const val `WSD_SECURITY_SSL_SERVER_CERT_VALIDATION`: `WSD_CONFIG_PARAM_TYPE` = 4;
public const val `WSD_SECURITY_USE_HTTP_CLIENT_AUTH`: `WSD_CONFIG_PARAM_TYPE` = 13;
// UNSUPPORTED Rust 840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SERVICE_METADATA {
//     pub EndpointReference: *mut WSD_ENDPOINT_REFERENCE_LIST,
//     pub Types: *mut WSD_NAME_LIST,
//     pub ServiceId: windows_sys::core::PCWSTR,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 848:1: declaration Impl has no candidate rule
// impl Default for WSD_SERVICE_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SERVICE_METADATA_LIST {
//     pub Next: *mut WSD_SERVICE_METADATA_LIST,
//     pub Element: *mut WSD_SERVICE_METADATA,
// }

// UNSUPPORTED Rust 859:1: declaration Impl has no candidate rule
// impl Default for WSD_SERVICE_METADATA_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 864:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SOAP_FAULT {
//     pub Code: *mut WSD_SOAP_FAULT_CODE,
//     pub Reason: *mut WSD_SOAP_FAULT_REASON,
//     pub Node: windows_sys::core::PCWSTR,
//     pub Role: windows_sys::core::PCWSTR,
//     pub Detail: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 873:1: declaration Impl has no candidate rule
// impl Default for WSD_SOAP_FAULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 878:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SOAP_FAULT_CODE {
//     pub Value: *mut WSDXML_NAME,
//     pub Subcode: *mut WSD_SOAP_FAULT_SUBCODE,
// }

// UNSUPPORTED Rust 884:1: declaration Impl has no candidate rule
// impl Default for WSD_SOAP_FAULT_CODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 889:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SOAP_FAULT_REASON {
//     pub Text: *mut WSD_LOCALIZED_STRING_LIST,
// }

// UNSUPPORTED Rust 894:1: declaration Impl has no candidate rule
// impl Default for WSD_SOAP_FAULT_REASON {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 899:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SOAP_FAULT_SUBCODE {
//     pub Value: *mut WSDXML_NAME,
//     pub Subcode: *mut WSD_SOAP_FAULT_SUBCODE,
// }

// UNSUPPORTED Rust 905:1: declaration Impl has no candidate rule
// impl Default for WSD_SOAP_FAULT_SUBCODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 910:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SOAP_HEADER {
//     pub To: windows_sys::core::PCWSTR,
//     pub Action: windows_sys::core::PCWSTR,
//     pub MessageID: windows_sys::core::PCWSTR,
//     pub RelatesTo: WSD_HEADER_RELATESTO,
//     pub ReplyTo: *mut WSD_ENDPOINT_REFERENCE,
//     pub From: *mut WSD_ENDPOINT_REFERENCE,
//     pub FaultTo: *mut WSD_ENDPOINT_REFERENCE,
//     pub AppSequence: *mut WSD_APP_SEQUENCE,
//     pub AnyHeaders: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 923:1: declaration Impl has no candidate rule
// impl Default for WSD_SOAP_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 928:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SOAP_MESSAGE {
//     pub Header: WSD_SOAP_HEADER,
//     pub Body: *mut core::ffi::c_void,
//     pub BodyType: *mut WSDXML_TYPE,
// }

// UNSUPPORTED Rust 935:1: declaration Impl has no candidate rule
// impl Default for WSD_SOAP_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 940:1: generic scalar type unsupported
// pub type WSD_STUB_FUNCTION = Option<unsafe extern "system" fn(server: *mut core::ffi::c_void, session: *mut core::ffi::c_void, event: *mut WSD_EVENT) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 941:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_SYNCHRONOUS_RESPONSE_CONTEXT {
//     pub hr: windows_sys::core::HRESULT,
//     pub eventHandle: super::super::Foundation::HANDLE,
//     pub messageParameters: *mut core::ffi::c_void,
//     pub results: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 949:1: declaration Impl has no candidate rule
// impl Default for WSD_SYNCHRONOUS_RESPONSE_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 954:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_THIS_DEVICE_METADATA {
//     pub FriendlyName: *mut WSD_LOCALIZED_STRING_LIST,
//     pub FirmwareVersion: windows_sys::core::PCWSTR,
//     pub SerialNumber: windows_sys::core::PCWSTR,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 962:1: declaration Impl has no candidate rule
// impl Default for WSD_THIS_DEVICE_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 967:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_THIS_MODEL_METADATA {
//     pub Manufacturer: *mut WSD_LOCALIZED_STRING_LIST,
//     pub ManufacturerUrl: windows_sys::core::PCWSTR,
//     pub ModelName: *mut WSD_LOCALIZED_STRING_LIST,
//     pub ModelNumber: windows_sys::core::PCWSTR,
//     pub ModelUrl: windows_sys::core::PCWSTR,
//     pub PresentationUrl: windows_sys::core::PCWSTR,
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 978:1: declaration Impl has no candidate rule
// impl Default for WSD_THIS_MODEL_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 983:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_UNKNOWN_LOOKUP {
//     pub Any: *mut WSDXML_ELEMENT,
// }

// UNSUPPORTED Rust 988:1: declaration Impl has no candidate rule
// impl Default for WSD_UNKNOWN_LOOKUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 993:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WSD_URI_LIST {
//     pub Next: *mut WSD_URI_LIST,
//     pub Element: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 999:1: declaration Impl has no candidate rule
// impl Default for WSD_URI_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

