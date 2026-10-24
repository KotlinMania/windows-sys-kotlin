// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpAddFragmentToCache(requestqueuehandle : super::super::Foundation:: HANDLE, urlprefix : windows_sys::core::PCWSTR, datachunk : *const HTTP_DATA_CHUNK, cachepolicy : *const HTTP_CACHE_POLICY, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpAddUrl(requestqueuehandle : super::super::Foundation:: HANDLE, fullyqualifiedurl : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpAddUrlToUrlGroup(urlgroupid : u64, pfullyqualifiedurl : windows_sys::core::PCWSTR, urlcontext : u64, reserved : u32) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpCancelHttpRequest(requestqueuehandle : super::super::Foundation:: HANDLE, requestid : u64, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpCloseRequestQueue(requestqueuehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpCloseServerSession(serversessionid : u64) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpCloseUrlGroup(urlgroupid : u64) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpCreateHttpHandle(requestqueuehandle : *mut super::super::Foundation:: HANDLE, reserved : u32) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("httpapi.dll" "system" fn HttpCreateRequestQueue(version : HTTPAPI_VERSION, name : windows_sys::core::PCWSTR, securityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, flags : u32, requestqueuehandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpCreateServerSession(version : HTTPAPI_VERSION, serversessionid : *mut u64, reserved : u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpCreateUrlGroup(serversessionid : u64, purlgroupid : *mut u64, reserved : u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpDeclarePush(requestqueuehandle : super::super::Foundation:: HANDLE, requestid : u64, verb : HTTP_VERB, path : windows_sys::core::PCWSTR, query : windows_sys::core::PCSTR, headers : *const HTTP_REQUEST_HEADERS) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpDelegateRequestEx(requestqueuehandle : super::super::Foundation:: HANDLE, delegatequeuehandle : super::super::Foundation:: HANDLE, requestid : u64, delegateurlgroupid : u64, propertyinfosetsize : u32, propertyinfoset : *const HTTP_DELEGATE_REQUEST_PROPERTY_INFO) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpDeleteServiceConfiguration(servicehandle : super::super::Foundation:: HANDLE, configid : HTTP_SERVICE_CONFIG_ID, pconfiginformation : *const core::ffi::c_void, configinformationlength : u32, poverlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpFindUrlGroupId(fullyqualifiedurl : windows_sys::core::PCWSTR, requestqueuehandle : super::super::Foundation:: HANDLE, urlgroupid : *mut u64) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpFlushResponseCache(requestqueuehandle : super::super::Foundation:: HANDLE, urlprefix : windows_sys::core::PCWSTR, flags : u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpGetExtension(version : HTTPAPI_VERSION, extension : u32, buffer : *mut core::ffi::c_void, buffersize : u32) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpInitialize(version : HTTPAPI_VERSION, flags : HTTP_INITIALIZE, preserved : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpIsFeatureSupported(featureid : HTTP_FEATURE_ID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpPrepareUrl(reserved : *const core::ffi::c_void, flags : u32, url : windows_sys::core::PCWSTR, preparedurl : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpQueryRequestQueueProperty(requestqueuehandle : super::super::Foundation:: HANDLE, property : HTTP_SERVER_PROPERTY, propertyinformation : *mut core::ffi::c_void, propertyinformationlength : u32, reserved1 : u32, returnlength : *mut u32, reserved2 : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpQueryServerSessionProperty(serversessionid : u64, property : HTTP_SERVER_PROPERTY, propertyinformation : *mut core::ffi::c_void, propertyinformationlength : u32, returnlength : *mut u32) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpQueryServiceConfiguration(servicehandle : super::super::Foundation:: HANDLE, configid : HTTP_SERVICE_CONFIG_ID, pinput : *const core::ffi::c_void, inputlength : u32, poutput : *mut core::ffi::c_void, outputlength : u32, preturnlength : *mut u32, poverlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpQueryUrlGroupProperty(urlgroupid : u64, property : HTTP_SERVER_PROPERTY, propertyinformation : *mut core::ffi::c_void, propertyinformationlength : u32, returnlength : *mut u32) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpReadFragmentFromCache(requestqueuehandle : super::super::Foundation:: HANDLE, urlprefix : windows_sys::core::PCWSTR, byterange : *const HTTP_BYTE_RANGE, buffer : *mut core::ffi::c_void, bufferlength : u32, bytesread : *mut u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpReceiveClientCertificate(requestqueuehandle : super::super::Foundation:: HANDLE, connectionid : u64, flags : u32, sslclientcertinfo : *mut HTTP_SSL_CLIENT_CERT_INFO, sslclientcertinfosize : u32, bytesreceived : *mut u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_System_IO"))]
// windows_link::link!("httpapi.dll" "system" fn HttpReceiveHttpRequest(requestqueuehandle : super::super::Foundation:: HANDLE, requestid : u64, flags : HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer : *mut HTTP_REQUEST_V2, requestbufferlength : u32, bytesreturned : *mut u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpReceiveRequestEntityBody(requestqueuehandle : super::super::Foundation:: HANDLE, requestid : u64, flags : u32, entitybuffer : *mut core::ffi::c_void, entitybufferlength : u32, bytesreturned : *mut u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpRemoveUrl(requestqueuehandle : super::super::Foundation:: HANDLE, fullyqualifiedurl : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpRemoveUrlFromUrlGroup(urlgroupid : u64, pfullyqualifiedurl : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpSendHttpResponse(requestqueuehandle : super::super::Foundation:: HANDLE, requestid : u64, flags : u32, httpresponse : *const HTTP_RESPONSE_V2, cachepolicy : *const HTTP_CACHE_POLICY, bytessent : *mut u32, reserved1 : *const core::ffi::c_void, reserved2 : u32, overlapped : *mut super::super::System::IO:: OVERLAPPED, logdata : *const HTTP_LOG_DATA) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpSendResponseEntityBody(requestqueuehandle : super::super::Foundation:: HANDLE, requestid : u64, flags : u32, entitychunkcount : u16, entitychunks : *const HTTP_DATA_CHUNK, bytessent : *mut u32, reserved1 : *const core::ffi::c_void, reserved2 : u32, overlapped : *mut super::super::System::IO:: OVERLAPPED, logdata : *const HTTP_LOG_DATA) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpSetRequestProperty(requestqueuehandle : super::super::Foundation:: HANDLE, id : u64, propertyid : HTTP_REQUEST_PROPERTY, input : *const core::ffi::c_void, inputpropertysize : u32, overlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpSetRequestQueueProperty(requestqueuehandle : super::super::Foundation:: HANDLE, property : HTTP_SERVER_PROPERTY, propertyinformation : *const core::ffi::c_void, propertyinformationlength : u32, reserved1 : u32, reserved2 : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpSetServerSessionProperty(serversessionid : u64, property : HTTP_SERVER_PROPERTY, propertyinformation : *const core::ffi::c_void, propertyinformationlength : u32) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpSetServiceConfiguration(servicehandle : super::super::Foundation:: HANDLE, configid : HTTP_SERVICE_CONFIG_ID, pconfiginformation : *const core::ffi::c_void, configinformationlength : u32, poverlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpSetUrlGroupProperty(urlgroupid : u64, property : HTTP_SERVER_PROPERTY, propertyinformation : *const core::ffi::c_void, propertyinformationlength : u32) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpShutdownRequestQueue(requestqueuehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("httpapi.dll" "system" fn HttpTerminate(flags : HTTP_INITIALIZE, preserved : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpUpdateServiceConfiguration(handle : super::super::Foundation:: HANDLE, configid : HTTP_SERVICE_CONFIG_ID, configinfo : *const core::ffi::c_void, configinfolength : u32, overlapped : *const super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpWaitForDemandStart(requestqueuehandle : super::super::Foundation:: HANDLE, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpWaitForDisconnect(requestqueuehandle : super::super::Foundation:: HANDLE, connectionid : u64, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("httpapi.dll" "system" fn HttpWaitForDisconnectEx(requestqueuehandle : super::super::Foundation:: HANDLE, connectionid : u64, reserved : u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> u32);

public const val `CacheRangeChunkSize`: `HTTP_SERVICE_CONFIG_CACHE_KEY` = 1;
public const val `CreateRequestQueueExternalIdProperty`: `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID` = 1;
public const val `CreateRequestQueueMax`: `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID` = 2;
public const val `DelegateRequestDelegateUrlProperty`: `HTTP_DELEGATE_REQUEST_PROPERTY_ID` = 1;
public const val `DelegateRequestReservedProperty`: `HTTP_DELEGATE_REQUEST_PROPERTY_ID` = 0;
public const val `ExParamTypeErrorHeaders`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 4;
public const val `ExParamTypeHttp2SettingsLimits`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 1;
public const val `ExParamTypeHttp2Window`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 0;
public const val `ExParamTypeHttpPerformance`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 2;
public const val `ExParamTypeMax`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 6;
public const val `ExParamTypeTlsRestrictions`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 3;
public const val `ExParamTypeTlsSessionTicketKeys`: `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = 5;
// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP2_SETTINGS_LIMITS_PARAM {
//     pub Http2MaxSettingsPerFrame: u32,
//     pub Http2MaxSettingsPerMinute: u32,
// }

// UNSUPPORTED Rust 80:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP2_WINDOW_SIZE_PARAM {
//     pub Http2ReceiveWindowSize: u32,
// }

// UNSUPPORTED Rust 85:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTPAPI_VERSION {
//     pub HttpApiMajorVersion: u16,
//     pub HttpApiMinorVersion: u16,
// }

public typealias `HTTP_503_RESPONSE_VERBOSITY` = Int;
public typealias `HTTP_AUTHENTICATION_HARDENING_LEVELS` = Int;
public const val `HTTP_AUTH_ENABLE_BASIC`: UInt = 1u;
public const val `HTTP_AUTH_ENABLE_DIGEST`: UInt = 2u;
public const val `HTTP_AUTH_ENABLE_KERBEROS`: UInt = 16u;
public const val `HTTP_AUTH_ENABLE_NEGOTIATE`: UInt = 8u;
public const val `HTTP_AUTH_ENABLE_NTLM`: UInt = 4u;
public const val `HTTP_AUTH_EX_FLAG_CAPTURE_CREDENTIAL`: UInt = 2u;
public const val `HTTP_AUTH_EX_FLAG_ENABLE_KERBEROS_CREDENTIAL_CACHING`: UInt = 1u;
public typealias `HTTP_AUTH_STATUS` = Int;
// UNSUPPORTED Rust 101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_BANDWIDTH_LIMIT_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub MaxBandwidth: u32,
// }

// UNSUPPORTED Rust 107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_BINDING_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub RequestQueueHandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule
// impl Default for HTTP_BINDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_BYTE_RANGE {
//     pub StartingOffset: u64,
//     pub Length: u64,
// }

// UNSUPPORTED Rust 124:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_CACHE_POLICY {
//     pub Policy: HTTP_CACHE_POLICY_TYPE,
//     pub SecondsToLive: u32,
// }

public typealias `HTTP_CACHE_POLICY_TYPE` = Int;
public const val `HTTP_CHANNEL_BIND_CLIENT_SERVICE`: UInt = 16u;
public const val `HTTP_CHANNEL_BIND_DOTLESS_SERVICE`: UInt = 4u;
// UNSUPPORTED Rust 133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_CHANNEL_BIND_INFO {
//     pub Hardening: HTTP_AUTHENTICATION_HARDENING_LEVELS,
//     pub Flags: u32,
//     pub ServiceNames: *mut *mut HTTP_SERVICE_BINDING_BASE,
//     pub NumberOfServiceNames: u32,
// }

// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule
// impl Default for HTTP_CHANNEL_BIND_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_CHANNEL_BIND_NO_SERVICE_NAME_CHECK`: UInt = 2u;
public const val `HTTP_CHANNEL_BIND_PROXY`: UInt = 1u;
public const val `HTTP_CHANNEL_BIND_PROXY_COHOSTING`: UInt = 32u;
public const val `HTTP_CHANNEL_BIND_SECURE_CHANNEL_TOKEN`: UInt = 8u;
// UNSUPPORTED Rust 150:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_CONNECTION_LIMIT_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub MaxConnections: u32,
// }

// UNSUPPORTED Rust 156:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_COOKED_URL {
//     pub FullUrlLength: u16,
//     pub HostLength: u16,
//     pub AbsPathLength: u16,
//     pub QueryStringLength: u16,
//     pub pFullUrl: windows_sys::core::PCWSTR,
//     pub pHost: windows_sys::core::PCWSTR,
//     pub pAbsPath: windows_sys::core::PCWSTR,
//     pub pQueryString: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule
// impl Default for HTTP_COOKED_URL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_CREATE_REQUEST_QUEUE_FLAG_CONTROLLER`: UInt = 2u;
public const val `HTTP_CREATE_REQUEST_QUEUE_FLAG_DELEGATION`: UInt = 8u;
public const val `HTTP_CREATE_REQUEST_QUEUE_FLAG_OPEN_EXISTING`: UInt = 1u;
public typealias `HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID` = Int;
// UNSUPPORTED Rust 177:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_CREATE_REQUEST_QUEUE_PROPERTY_INFO {
//     pub PropertyId: HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID,
//     pub PropertyInfoLength: u32,
//     pub PropertyInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 184:1: declaration Impl has no candidate rule
// impl Default for HTTP_CREATE_REQUEST_QUEUE_PROPERTY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 189:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_DATA_CHUNK {
//     pub DataChunkType: HTTP_DATA_CHUNK_TYPE,
//     pub Anonymous: HTTP_DATA_CHUNK_0,
// }

// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule
// impl Default for HTTP_DATA_CHUNK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 200:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HTTP_DATA_CHUNK_0 {
//     pub FromMemory: HTTP_DATA_CHUNK_0_0,
//     pub FromFileHandle: HTTP_DATA_CHUNK_0_1,
//     pub FromFragmentCache: HTTP_DATA_CHUNK_0_2,
//     pub FromFragmentCacheEx: HTTP_DATA_CHUNK_0_3,
//     pub Trailers: HTTP_DATA_CHUNK_0_4,
// }

// UNSUPPORTED Rust 209:1: declaration Impl has no candidate rule
// impl Default for HTTP_DATA_CHUNK_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_DATA_CHUNK_0_1 {
//     pub ByteRange: HTTP_BYTE_RANGE,
//     pub FileHandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 220:1: declaration Impl has no candidate rule
// impl Default for HTTP_DATA_CHUNK_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_DATA_CHUNK_0_3 {
//     pub ByteRange: HTTP_BYTE_RANGE,
//     pub pFragmentName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 231:1: declaration Impl has no candidate rule
// impl Default for HTTP_DATA_CHUNK_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 236:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_DATA_CHUNK_0_2 {
//     pub FragmentNameLength: u16,
//     pub pFragmentName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 242:1: declaration Impl has no candidate rule
// impl Default for HTTP_DATA_CHUNK_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_DATA_CHUNK_0_0 {
//     pub pBuffer: *mut core::ffi::c_void,
//     pub BufferLength: u32,
// }

// UNSUPPORTED Rust 253:1: declaration Impl has no candidate rule
// impl Default for HTTP_DATA_CHUNK_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 258:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_DATA_CHUNK_0_4 {
//     pub TrailerCount: u16,
//     pub pTrailers: *mut HTTP_UNKNOWN_HEADER,
// }

// UNSUPPORTED Rust 264:1: declaration Impl has no candidate rule
// impl Default for HTTP_DATA_CHUNK_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_DATA_CHUNK_TYPE` = Int;
public typealias `HTTP_DELEGATE_REQUEST_PROPERTY_ID` = Int;
// UNSUPPORTED Rust 271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_DELEGATE_REQUEST_PROPERTY_INFO {
//     pub PropertyId: HTTP_DELEGATE_REQUEST_PROPERTY_ID,
//     pub PropertyInfoLength: u32,
//     pub PropertyInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 278:1: declaration Impl has no candidate rule
// impl Default for HTTP_DELEGATE_REQUEST_PROPERTY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_DEMAND_CBT`: UInt = 4u;
public typealias `HTTP_ENABLED_STATE` = Int;
// UNSUPPORTED Rust 285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_ERROR_HEADERS_PARAM {
//     pub StatusCode: u16,
//     pub HeaderCount: u16,
//     pub Headers: *mut HTTP_UNKNOWN_HEADER,
// }

// UNSUPPORTED Rust 292:1: declaration Impl has no candidate rule
// impl Default for HTTP_ERROR_HEADERS_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_FEATURE_ID` = Int;
// UNSUPPORTED Rust 298:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_FLOWRATE_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub MaxBandwidth: u32,
//     pub MaxPeakBandwidth: u32,
//     pub BurstSize: u32,
// }

public const val `HTTP_FLUSH_RESPONSE_FLAG_RECURSIVE`: UInt = 1u;
public typealias `HTTP_HEADER_ID` = Int;
public typealias `HTTP_INITIALIZE` = UInt;
public const val `HTTP_INITIALIZE_CONFIG`: `HTTP_INITIALIZE` = 2u;
public const val `HTTP_INITIALIZE_SERVER`: `HTTP_INITIALIZE` = 1u;
// UNSUPPORTED Rust 311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_KNOWN_HEADER {
//     pub RawValueLength: u16,
//     pub pRawValue: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 317:1: declaration Impl has no candidate rule
// impl Default for HTTP_KNOWN_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_LISTEN_ENDPOINT_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub EnableSharing: bool,
// }

public const val `HTTP_LOGGING_FLAG_LOCAL_TIME_ROLLOVER`: UInt = 1u;
public const val `HTTP_LOGGING_FLAG_LOG_ERRORS_ONLY`: UInt = 4u;
public const val `HTTP_LOGGING_FLAG_LOG_SUCCESS_ONLY`: UInt = 8u;
public const val `HTTP_LOGGING_FLAG_USE_UTF8_CONVERSION`: UInt = 2u;
// UNSUPPORTED Rust 332:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct HTTP_LOGGING_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub LoggingFlags: u32,
//     pub SoftwareName: windows_sys::core::PCWSTR,
//     pub SoftwareNameLength: u16,
//     pub DirectoryNameLength: u16,
//     pub DirectoryName: windows_sys::core::PCWSTR,
//     pub Format: HTTP_LOGGING_TYPE,
//     pub Fields: u32,
//     pub pExtFields: *mut core::ffi::c_void,
//     pub NumOfExtFields: u16,
//     pub MaxRecordSize: u16,
//     pub RolloverType: HTTP_LOGGING_ROLLOVER_TYPE,
//     pub RolloverSize: u32,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 351:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for HTTP_LOGGING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_LOGGING_ROLLOVER_TYPE` = Int;
public typealias `HTTP_LOGGING_TYPE` = Int;
// UNSUPPORTED Rust 359:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_LOG_DATA {
//     pub Type: HTTP_LOG_DATA_TYPE,
// }

public typealias `HTTP_LOG_DATA_TYPE` = Int;
// UNSUPPORTED Rust 365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_LOG_FIELDS_DATA {
//     pub Base: HTTP_LOG_DATA,
//     pub UserNameLength: u16,
//     pub UriStemLength: u16,
//     pub ClientIpLength: u16,
//     pub ServerNameLength: u16,
//     pub ServiceNameLength: u16,
//     pub ServerIpLength: u16,
//     pub MethodLength: u16,
//     pub UriQueryLength: u16,
//     pub HostLength: u16,
//     pub UserAgentLength: u16,
//     pub CookieLength: u16,
//     pub ReferrerLength: u16,
//     pub UserName: windows_sys::core::PWSTR,
//     pub UriStem: windows_sys::core::PWSTR,
//     pub ClientIp: windows_sys::core::PSTR,
//     pub ServerName: windows_sys::core::PSTR,
//     pub ServiceName: windows_sys::core::PSTR,
//     pub ServerIp: windows_sys::core::PSTR,
//     pub Method: windows_sys::core::PSTR,
//     pub UriQuery: windows_sys::core::PSTR,
//     pub Host: windows_sys::core::PSTR,
//     pub UserAgent: windows_sys::core::PSTR,
//     pub Cookie: windows_sys::core::PSTR,
//     pub Referrer: windows_sys::core::PSTR,
//     pub ServerPort: u16,
//     pub ProtocolStatus: u16,
//     pub Win32Status: u32,
//     pub MethodNum: HTTP_VERB,
//     pub SubStatus: u16,
// }

// UNSUPPORTED Rust 399:1: declaration Impl has no candidate rule
// impl Default for HTTP_LOG_FIELDS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_LOG_FIELD_BYTES_RECV`: UInt = 8192u;
public const val `HTTP_LOG_FIELD_BYTES_SENT`: UInt = 4096u;
public const val `HTTP_LOG_FIELD_CLIENT_IP`: UInt = 4u;
public const val `HTTP_LOG_FIELD_CLIENT_PORT`: UInt = 4194304u;
public const val `HTTP_LOG_FIELD_COMPUTER_NAME`: UInt = 32u;
public const val `HTTP_LOG_FIELD_COOKIE`: UInt = 131072u;
public const val `HTTP_LOG_FIELD_CORRELATION_ID`: UInt = 1073741824u;
public const val `HTTP_LOG_FIELD_DATE`: UInt = 1u;
public const val `HTTP_LOG_FIELD_FAULT_CODE`: UInt = 2147483648u;
public const val `HTTP_LOG_FIELD_HOST`: UInt = 1048576u;
public const val `HTTP_LOG_FIELD_METHOD`: UInt = 128u;
public const val `HTTP_LOG_FIELD_QUEUE_NAME`: UInt = 67108864u;
public const val `HTTP_LOG_FIELD_REASON`: UInt = 33554432u;
public const val `HTTP_LOG_FIELD_REFERER`: UInt = 262144u;
public const val `HTTP_LOG_FIELD_SERVER_IP`: UInt = 64u;
public const val `HTTP_LOG_FIELD_SERVER_PORT`: UInt = 32768u;
public const val `HTTP_LOG_FIELD_SITE_ID`: UInt = 16777216u;
public const val `HTTP_LOG_FIELD_SITE_NAME`: UInt = 16u;
public const val `HTTP_LOG_FIELD_STATUS`: UInt = 1024u;
public const val `HTTP_LOG_FIELD_STREAM_ID`: UInt = 134217728u;
public const val `HTTP_LOG_FIELD_STREAM_ID_EX`: UInt = 268435456u;
public const val `HTTP_LOG_FIELD_SUB_STATUS`: UInt = 2097152u;
public const val `HTTP_LOG_FIELD_TIME`: UInt = 2u;
public const val `HTTP_LOG_FIELD_TIME_TAKEN`: UInt = 16384u;
public const val `HTTP_LOG_FIELD_TRANSPORT_TYPE`: UInt = 536870912u;
public const val `HTTP_LOG_FIELD_URI`: UInt = 8388608u;
public const val `HTTP_LOG_FIELD_URI_QUERY`: UInt = 512u;
public const val `HTTP_LOG_FIELD_URI_STEM`: UInt = 256u;
public const val `HTTP_LOG_FIELD_USER_AGENT`: UInt = 65536u;
public const val `HTTP_LOG_FIELD_USER_NAME`: UInt = 8u;
public const val `HTTP_LOG_FIELD_VERSION`: UInt = 524288u;
public const val `HTTP_LOG_FIELD_WIN32_STATUS`: UInt = 2048u;
public const val `HTTP_MAX_SERVER_QUEUE_LENGTH`: UInt = 2147483647u;
public const val `HTTP_MIN_SERVER_QUEUE_LENGTH`: UInt = 1u;
// UNSUPPORTED Rust 438:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_MULTIPLE_KNOWN_HEADERS {
//     pub HeaderId: HTTP_HEADER_ID,
//     pub Flags: u32,
//     pub KnownHeaderCount: u16,
//     pub KnownHeaders: *mut HTTP_KNOWN_HEADER,
// }

// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule
// impl Default for HTTP_MULTIPLE_KNOWN_HEADERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_PERFORMANCE_PARAM {
//     pub Type: HTTP_PERFORMANCE_PARAM_TYPE,
//     pub BufferSize: u32,
//     pub Buffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 458:1: declaration Impl has no candidate rule
// impl Default for HTTP_PERFORMANCE_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_PERFORMANCE_PARAM_TYPE` = Int;
// UNSUPPORTED Rust 464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_PROPERTY_FLAGS {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_PROTECTION_LEVEL_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub Level: HTTP_PROTECTION_LEVEL_TYPE,
// }

public typealias `HTTP_PROTECTION_LEVEL_TYPE` = Int;
// UNSUPPORTED Rust 476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_QOS_SETTING_INFO {
//     pub QosType: HTTP_QOS_SETTING_TYPE,
//     pub QosSetting: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 482:1: declaration Impl has no candidate rule
// impl Default for HTTP_QOS_SETTING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_QOS_SETTING_TYPE` = Int;
// UNSUPPORTED Rust 488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_QUERY_REQUEST_QUALIFIER_QUIC {
//     pub Freshness: u64,
// }

// UNSUPPORTED Rust 493:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_QUERY_REQUEST_QUALIFIER_TCP {
//     pub Freshness: u64,
// }

// UNSUPPORTED Rust 498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_QUIC_API_TIMINGS {
//     pub ConnectionTimings: HTTP_QUIC_CONNECTION_API_TIMINGS,
//     pub StreamTimings: HTTP_QUIC_STREAM_API_TIMINGS,
// }

// UNSUPPORTED Rust 504:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_QUIC_CONNECTION_API_TIMINGS {
//     pub OpenTime: u64,
//     pub CloseTime: u64,
//     pub StartTime: u64,
//     pub ShutdownTime: u64,
//     pub SecConfigCreateTime: u64,
//     pub SecConfigDeleteTime: u64,
//     pub GetParamCount: u64,
//     pub GetParamSum: u64,
//     pub SetParamCount: u64,
//     pub SetParamSum: u64,
//     pub SetCallbackHandlerCount: u64,
//     pub SetCallbackHandlerSum: u64,
//     pub ControlStreamTimings: HTTP_QUIC_STREAM_API_TIMINGS,
// }

// UNSUPPORTED Rust 521:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_QUIC_STREAM_API_TIMINGS {
//     pub OpenCount: u64,
//     pub OpenSum: u64,
//     pub CloseCount: u64,
//     pub CloseSum: u64,
//     pub StartCount: u64,
//     pub StartSum: u64,
//     pub ShutdownCount: u64,
//     pub ShutdownSum: u64,
//     pub SendCount: u64,
//     pub SendSum: u64,
//     pub ReceiveSetEnabledCount: u64,
//     pub ReceiveSetEnabledSum: u64,
//     pub GetParamCount: u64,
//     pub GetParamSum: u64,
//     pub SetParamCount: u64,
//     pub SetParamSum: u64,
//     pub SetCallbackHandlerCount: u64,
//     pub SetCallbackHandlerSum: u64,
// }

// UNSUPPORTED Rust 543:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_QUIC_STREAM_REQUEST_STATS {
//     pub StreamWaitStart: u64,
//     pub StreamWaitEnd: u64,
//     pub RequestHeadersCompressionStart: u64,
//     pub RequestHeadersCompressionEnd: u64,
//     pub ResponseHeadersDecompressionStart: u64,
//     pub ResponseHeadersDecompressionEnd: u64,
//     pub RequestHeadersCompressedSize: u64,
//     pub ResponseHeadersCompressedSize: u64,
// }

public const val `HTTP_RECEIVE_FULL_CHAIN`: UInt = 2u;
public typealias `HTTP_RECEIVE_HTTP_REQUEST_FLAGS` = UInt;
public const val `HTTP_RECEIVE_REQUEST_ENTITY_BODY_FLAG_FILL_BUFFER`: UInt = 1u;
public const val `HTTP_RECEIVE_REQUEST_FLAG_COPY_BODY`: `HTTP_RECEIVE_HTTP_REQUEST_FLAGS` = 1u;
public const val `HTTP_RECEIVE_REQUEST_FLAG_FLUSH_BODY`: `HTTP_RECEIVE_HTTP_REQUEST_FLAGS` = 2u;
public const val `HTTP_RECEIVE_SECURE_CHANNEL_TOKEN`: UInt = 1u;
public const val `HTTP_REQUEST_AUTH_FLAG_TOKEN_FOR_CACHED_CRED`: UInt = 1u;
// UNSUPPORTED Rust 562:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_AUTH_INFO {
//     pub AuthStatus: HTTP_AUTH_STATUS,
//     pub SecStatus: windows_sys::core::HRESULT,
//     pub Flags: u32,
//     pub AuthType: HTTP_REQUEST_AUTH_TYPE,
//     pub AccessToken: super::super::Foundation::HANDLE,
//     pub ContextAttributes: u32,
//     pub PackedContextLength: u32,
//     pub PackedContextType: u32,
//     pub PackedContext: *mut core::ffi::c_void,
//     pub MutualAuthDataLength: u32,
//     pub pMutualAuthData: windows_sys::core::PSTR,
//     pub PackageNameLength: u16,
//     pub pPackageName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 579:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_AUTH_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_REQUEST_AUTH_TYPE` = Int;
// UNSUPPORTED Rust 585:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_CHANNEL_BIND_STATUS {
//     pub ServiceName: *mut HTTP_SERVICE_BINDING_BASE,
//     pub ChannelToken: *mut u8,
//     pub ChannelTokenSize: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_CHANNEL_BIND_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_REQUEST_FLAG_HTTP2`: UInt = 4u;
public const val `HTTP_REQUEST_FLAG_HTTP3`: UInt = 8u;
public const val `HTTP_REQUEST_FLAG_IP_ROUTED`: UInt = 2u;
public const val `HTTP_REQUEST_FLAG_MORE_ENTITY_BODY_EXISTS`: UInt = 1u;
// UNSUPPORTED Rust 602:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_HEADERS {
//     pub UnknownHeaderCount: u16,
//     pub pUnknownHeaders: *mut HTTP_UNKNOWN_HEADER,
//     pub TrailerCount: u16,
//     pub pTrailers: *mut HTTP_UNKNOWN_HEADER,
//     pub KnownHeaders: [HTTP_KNOWN_HEADER; 41],
// }

// UNSUPPORTED Rust 611:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_HEADERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 616:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_INFO {
//     pub InfoType: HTTP_REQUEST_INFO_TYPE,
//     pub InfoLength: u32,
//     pub pInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 623:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_REQUEST_INFO_TYPE` = Int;
public typealias `HTTP_REQUEST_PROPERTY` = Int;
// UNSUPPORTED Rust 630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_PROPERTY_SNI {
//     pub Hostname: [u16; 256],
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 636:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_PROPERTY_SNI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_REQUEST_PROPERTY_SNI_FLAG_NO_SNI`: UInt = 2u;
public const val `HTTP_REQUEST_PROPERTY_SNI_FLAG_SNI_USED`: UInt = 1u;
public const val `HTTP_REQUEST_PROPERTY_SNI_HOST_MAX_LENGTH`: UInt = 255u;
// UNSUPPORTED Rust 644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_REQUEST_PROPERTY_STREAM_ERROR {
//     pub ErrorCode: u32,
// }

// UNSUPPORTED Rust 649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_SIZING_INFO {
//     pub Flags: u64,
//     pub RequestIndex: u32,
//     pub RequestSizingCount: u32,
//     pub RequestSizing: [u64; 5],
// }

// UNSUPPORTED Rust 657:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_SIZING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_REQUEST_SIZING_INFO_FLAG_FIRST_REQUEST`: UInt = 8u;
public const val `HTTP_REQUEST_SIZING_INFO_FLAG_TCP_FAST_OPEN`: UInt = 1u;
public const val `HTTP_REQUEST_SIZING_INFO_FLAG_TLS_FALSE_START`: UInt = 4u;
public const val `HTTP_REQUEST_SIZING_INFO_FLAG_TLS_SESSION_RESUMPTION`: UInt = 2u;
public typealias `HTTP_REQUEST_SIZING_TYPE` = Int;
// UNSUPPORTED Rust 667:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_TIMING_INFO {
//     pub RequestTimingCount: u32,
//     pub RequestTiming: [u64; 30],
// }

// UNSUPPORTED Rust 673:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_TIMING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_REQUEST_TIMING_TYPE` = Int;
// UNSUPPORTED Rust 679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_TOKEN_BINDING_INFO {
//     pub TokenBinding: *mut u8,
//     pub TokenBindingSize: u32,
//     pub EKM: *mut u8,
//     pub EKMSize: u32,
//     pub KeyType: u8,
// }

// UNSUPPORTED Rust 688:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_TOKEN_BINDING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_V1 {
//     pub Flags: u32,
//     pub ConnectionId: u64,
//     pub RequestId: u64,
//     pub UrlContext: u64,
//     pub Version: HTTP_VERSION,
//     pub Verb: HTTP_VERB,
//     pub UnknownVerbLength: u16,
//     pub RawUrlLength: u16,
//     pub pUnknownVerb: windows_sys::core::PCSTR,
//     pub pRawUrl: windows_sys::core::PCSTR,
//     pub CookedUrl: HTTP_COOKED_URL,
//     pub Address: HTTP_TRANSPORT_ADDRESS,
//     pub Headers: HTTP_REQUEST_HEADERS,
//     pub BytesReceived: u64,
//     pub EntityChunkCount: u16,
//     pub pEntityChunks: *mut HTTP_DATA_CHUNK,
//     pub RawConnectionId: u64,
//     pub pSslInfo: *mut HTTP_SSL_INFO,
// }

// UNSUPPORTED Rust 716:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_REQUEST_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_V2 {
//     pub Base: HTTP_REQUEST_V1,
//     pub RequestInfoCount: u16,
//     pub pRequestInfo: *mut HTTP_REQUEST_INFO,
// }

// UNSUPPORTED Rust 730:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_REQUEST_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_RESPONSE_FLAG_MORE_ENTITY_BODY_EXISTS`: UInt = 2u;
public const val `HTTP_RESPONSE_FLAG_MULTIPLE_ENCODINGS_AVAILABLE`: UInt = 1u;
// UNSUPPORTED Rust 738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_RESPONSE_HEADERS {
//     pub UnknownHeaderCount: u16,
//     pub pUnknownHeaders: *mut HTTP_UNKNOWN_HEADER,
//     pub TrailerCount: u16,
//     pub pTrailers: *mut HTTP_UNKNOWN_HEADER,
//     pub KnownHeaders: [HTTP_KNOWN_HEADER; 30],
// }

// UNSUPPORTED Rust 747:1: declaration Impl has no candidate rule
// impl Default for HTTP_RESPONSE_HEADERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 752:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_RESPONSE_INFO {
//     pub Type: HTTP_RESPONSE_INFO_TYPE,
//     pub Length: u32,
//     pub pInfo: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule
// impl Default for HTTP_RESPONSE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_RESPONSE_INFO_FLAGS_PRESERVE_ORDER`: UInt = 1u;
public typealias `HTTP_RESPONSE_INFO_TYPE` = Int;
// UNSUPPORTED Rust 766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_RESPONSE_V1 {
//     pub Flags: u32,
//     pub Version: HTTP_VERSION,
//     pub StatusCode: u16,
//     pub ReasonLength: u16,
//     pub pReason: windows_sys::core::PCSTR,
//     pub Headers: HTTP_RESPONSE_HEADERS,
//     pub EntityChunkCount: u16,
//     pub pEntityChunks: *mut HTTP_DATA_CHUNK,
// }

// UNSUPPORTED Rust 778:1: declaration Impl has no candidate rule
// impl Default for HTTP_RESPONSE_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 783:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_RESPONSE_V2 {
//     pub Base: HTTP_RESPONSE_V1,
//     pub ResponseInfoCount: u16,
//     pub pResponseInfo: *mut HTTP_RESPONSE_INFO,
// }

// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule
// impl Default for HTTP_RESPONSE_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SCHEME` = Int;
public const val `HTTP_SEND_RESPONSE_FLAG_BUFFER_DATA`: UInt = 4u;
public const val `HTTP_SEND_RESPONSE_FLAG_DISCONNECT`: UInt = 1u;
public const val `HTTP_SEND_RESPONSE_FLAG_ENABLE_NAGLING`: UInt = 8u;
public const val `HTTP_SEND_RESPONSE_FLAG_GOAWAY`: UInt = 256u;
public const val `HTTP_SEND_RESPONSE_FLAG_MORE_DATA`: UInt = 2u;
public const val `HTTP_SEND_RESPONSE_FLAG_OPAQUE`: UInt = 64u;
public const val `HTTP_SEND_RESPONSE_FLAG_PROCESS_RANGES`: UInt = 32u;
// UNSUPPORTED Rust 803:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS {
//     pub RealmLength: u16,
//     pub Realm: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 809:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 814:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS {
//     pub DomainNameLength: u16,
//     pub DomainName: windows_sys::core::PWSTR,
//     pub RealmLength: u16,
//     pub Realm: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 822:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 827:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVER_AUTHENTICATION_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub AuthSchemes: u32,
//     pub ReceiveMutualAuth: bool,
//     pub ReceiveContextHandle: bool,
//     pub DisableNTLMCredentialCaching: bool,
//     pub ExFlags: u8,
//     pub DigestParams: HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS,
//     pub BasicParams: HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS,
// }

public typealias `HTTP_SERVER_PROPERTY` = Int;
// UNSUPPORTED Rust 840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_BINDING_A {
//     pub Base: HTTP_SERVICE_BINDING_BASE,
//     pub Buffer: windows_sys::core::PSTR,
//     pub BufferSize: u32,
// }

// UNSUPPORTED Rust 847:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVICE_BINDING_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 852:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_BINDING_BASE {
//     pub Type: HTTP_SERVICE_BINDING_TYPE,
// }

public typealias `HTTP_SERVICE_BINDING_TYPE` = Int;
// UNSUPPORTED Rust 858:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_BINDING_W {
//     pub Base: HTTP_SERVICE_BINDING_BASE,
//     pub Buffer: windows_sys::core::PWSTR,
//     pub BufferSize: u32,
// }

// UNSUPPORTED Rust 865:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVICE_BINDING_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SERVICE_CONFIG_CACHE_KEY` = Int;
// UNSUPPORTED Rust 871:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_CACHE_SET {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_CACHE_KEY,
//     pub ParamDesc: u32,
// }

public typealias `HTTP_SERVICE_CONFIG_ID` = Int;
// UNSUPPORTED Rust 878:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_IP_LISTEN_PARAM {
//     pub AddrLength: u16,
//     pub pAddress: *mut super::WinSock::SOCKADDR,
// }

// UNSUPPORTED Rust 885:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_IP_LISTEN_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 891:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_IP_LISTEN_QUERY {
//     pub AddrCount: u32,
//     pub AddrList: [super::WinSock::SOCKADDR_STORAGE; 1],
// }

// UNSUPPORTED Rust 898:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_IP_LISTEN_QUERY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SERVICE_CONFIG_QUERY_TYPE` = Int;
public typealias `HTTP_SERVICE_CONFIG_SETTING_KEY` = Int;
// UNSUPPORTED Rust 906:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SETTING_SET {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SETTING_KEY,
//     pub ParamDesc: u32,
// }

// UNSUPPORTED Rust 912:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_CCS_KEY {
//     pub LocalAddress: super::WinSock::SOCKADDR_STORAGE,
// }

// UNSUPPORTED Rust 918:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_CCS_QUERY {
//     pub QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE,
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY,
//     pub dwToken: u32,
// }

// UNSUPPORTED Rust 926:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_CCS_QUERY_EX {
//     pub QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE,
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY,
//     pub dwToken: u32,
//     pub ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE,
// }

// UNSUPPORTED Rust 935:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_CCS_SET {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY,
//     pub ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM,
// }

// UNSUPPORTED Rust 942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_SSL_CCS_SET_EX {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY,
//     pub ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM_EX,
// }

// UNSUPPORTED Rust 949:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_CCS_SET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_HTTP2`: UInt = 16u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_LEGACY_TLS`: UInt = 1024u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_OCSP_STAPLING`: UInt = 128u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_QUIC`: UInt = 32u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_SESSION_ID`: UInt = 16384u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_TLS12`: UInt = 4096u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_TLS13`: UInt = 64u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_CLIENT_CORRELATION`: UInt = 8192u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_SESSION_TICKET`: UInt = 2048u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_TOKEN_BINDING`: UInt = 256u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_LOG_EXTENDED_EVENTS`: UInt = 512u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_NEGOTIATE_CLIENT_CERT`: UInt = 2u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_NO_RAW_FILTER`: UInt = 4u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_REJECT`: UInt = 8u;
public const val `HTTP_SERVICE_CONFIG_SSL_FLAG_USE_DS_MAPPER`: UInt = 1u;
// UNSUPPORTED Rust 970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_SSL_KEY {
//     pub pIpPort: *mut super::WinSock::SOCKADDR,
// }

// UNSUPPORTED Rust 976:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_KEY_EX {
//     pub IpPort: super::WinSock::SOCKADDR_STORAGE,
// }

// UNSUPPORTED Rust 988:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_SSL_PARAM {
//     pub SslHashLength: u32,
//     pub pSslHash: *mut core::ffi::c_void,
//     pub AppId: windows_sys::core::GUID,
//     pub pSslCertStoreName: windows_sys::core::PWSTR,
//     pub DefaultCertCheckMode: u32,
//     pub DefaultRevocationFreshnessTime: u32,
//     pub DefaultRevocationUrlRetrievalTimeout: u32,
//     pub pDefaultSslCtlIdentifier: windows_sys::core::PWSTR,
//     pub pDefaultSslCtlStoreName: windows_sys::core::PWSTR,
//     pub DefaultFlags: u32,
// }

// UNSUPPORTED Rust 1002:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVICE_CONFIG_SSL_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1007:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_SSL_PARAM_EX {
//     pub ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE,
//     pub Flags: u64,
//     pub Anonymous: HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0,
// }

// UNSUPPORTED Rust 1014:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVICE_CONFIG_SSL_PARAM_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1019:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0 {
//     pub Http2WindowSizeParam: HTTP2_WINDOW_SIZE_PARAM,
//     pub Http2SettingsLimitsParam: HTTP2_SETTINGS_LIMITS_PARAM,
//     pub HttpPerformanceParam: HTTP_PERFORMANCE_PARAM,
//     pub HttpTlsRestrictionsParam: HTTP_TLS_RESTRICTIONS_PARAM,
//     pub HttpErrorHeadersParam: HTTP_ERROR_HEADERS_PARAM,
//     pub HttpTlsSessionTicketKeysParam: HTTP_TLS_SESSION_TICKET_KEYS_PARAM,
// }

// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1034:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_QUERY {
//     pub QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE,
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY,
//     pub dwToken: u32,
// }

// UNSUPPORTED Rust 1042:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_QUERY_EX {
//     pub QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE,
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY_EX,
//     pub dwToken: u32,
//     pub ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE,
// }

// UNSUPPORTED Rust 1051:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_SET {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY,
//     pub ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM,
// }

// UNSUPPORTED Rust 1058:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_SSL_SET_EX {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY_EX,
//     pub ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM_EX,
// }

// UNSUPPORTED Rust 1065:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_SET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1071:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_SSL_SNI_KEY {
//     pub IpPort: super::WinSock::SOCKADDR_STORAGE,
//     pub Host: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1078:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_SNI_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1084:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_SNI_QUERY {
//     pub QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE,
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY,
//     pub dwToken: u32,
// }

// UNSUPPORTED Rust 1092:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_SNI_QUERY_EX {
//     pub QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE,
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY,
//     pub dwToken: u32,
//     pub ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE,
// }

// UNSUPPORTED Rust 1101:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_SSL_SNI_SET {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY,
//     pub ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM,
// }

// UNSUPPORTED Rust 1108:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_SSL_SNI_SET_EX {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY,
//     pub ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM_EX,
// }

// UNSUPPORTED Rust 1115:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_SERVICE_CONFIG_SSL_SNI_SET_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTTP_SERVICE_CONFIG_TIMEOUT_KEY` = Int;
// UNSUPPORTED Rust 1122:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_TIMEOUT_SET {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_TIMEOUT_KEY,
//     pub ParamDesc: u16,
// }

// UNSUPPORTED Rust 1128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_URLACL_KEY {
//     pub pUrlPrefix: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1133:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVICE_CONFIG_URLACL_KEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1138:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SERVICE_CONFIG_URLACL_PARAM {
//     pub pStringSecurityDescriptor: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1143:1: declaration Impl has no candidate rule
// impl Default for HTTP_SERVICE_CONFIG_URLACL_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1148:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_URLACL_QUERY {
//     pub QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE,
//     pub KeyDesc: HTTP_SERVICE_CONFIG_URLACL_KEY,
//     pub dwToken: u32,
// }

// UNSUPPORTED Rust 1155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SERVICE_CONFIG_URLACL_SET {
//     pub KeyDesc: HTTP_SERVICE_CONFIG_URLACL_KEY,
//     pub ParamDesc: HTTP_SERVICE_CONFIG_URLACL_PARAM,
// }

// UNSUPPORTED Rust 1161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SSL_CLIENT_CERT_INFO {
//     pub CertFlags: u32,
//     pub CertEncodedSize: u32,
//     pub pCertEncoded: *mut u8,
//     pub Token: super::super::Foundation::HANDLE,
//     pub CertDeniedByMapper: bool,
// }

// UNSUPPORTED Rust 1170:1: declaration Impl has no candidate rule
// impl Default for HTTP_SSL_CLIENT_CERT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_SSL_INFO {
//     pub ServerCertKeySize: u16,
//     pub ConnectionKeySize: u16,
//     pub ServerCertIssuerSize: u32,
//     pub ServerCertSubjectSize: u32,
//     pub pServerCertIssuer: windows_sys::core::PCSTR,
//     pub pServerCertSubject: windows_sys::core::PCSTR,
//     pub pClientCertInfo: *mut HTTP_SSL_CLIENT_CERT_INFO,
//     pub SslClientCertNegotiated: u32,
// }

// UNSUPPORTED Rust 1187:1: declaration Impl has no candidate rule
// impl Default for HTTP_SSL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1192:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_SSL_PROTOCOL_INFO {
//     pub Protocol: u32,
//     pub CipherType: u32,
//     pub CipherStrength: u32,
//     pub HashType: u32,
//     pub HashStrength: u32,
//     pub KeyExchangeType: u32,
//     pub KeyExchangeStrength: u32,
// }

public typealias `HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE` = Int;
// UNSUPPORTED Rust 1204:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_STATE_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub State: HTTP_ENABLED_STATE,
// }

// UNSUPPORTED Rust 1210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_TIMEOUT_LIMIT_INFO {
//     pub Flags: HTTP_PROPERTY_FLAGS,
//     pub EntityBody: u16,
//     pub DrainEntityBody: u16,
//     pub RequestQueue: u16,
//     pub IdleConnection: u16,
//     pub HeaderWait: u16,
//     pub MinSendRate: u32,
// }

// UNSUPPORTED Rust 1221:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_TLS_RESTRICTIONS_PARAM {
//     pub RestrictionCount: u32,
//     pub TlsRestrictions: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1227:1: declaration Impl has no candidate rule
// impl Default for HTTP_TLS_RESTRICTIONS_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_TLS_SESSION_TICKET_KEYS_PARAM {
//     pub SessionTicketKeyCount: u32,
//     pub SessionTicketKeys: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1238:1: declaration Impl has no candidate rule
// impl Default for HTTP_TLS_SESSION_TICKET_KEYS_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1243:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct HTTP_TRANSPORT_ADDRESS {
//     pub pRemoteAddress: *mut super::WinSock::SOCKADDR,
//     pub pLocalAddress: *mut super::WinSock::SOCKADDR,
// }

// UNSUPPORTED Rust 1250:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for HTTP_TRANSPORT_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1256:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_UNKNOWN_HEADER {
//     pub NameLength: u16,
//     pub RawValueLength: u16,
//     pub pName: windows_sys::core::PCSTR,
//     pub pRawValue: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 1264:1: declaration Impl has no candidate rule
// impl Default for HTTP_UNKNOWN_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_URL_FLAG_REMOVE_ALL`: UInt = 1u;
public typealias `HTTP_VERB` = Int;
// UNSUPPORTED Rust 1271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_VERSION {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
// }

// UNSUPPORTED Rust 1277:1: non-scalar type Ptr unsupported
// pub const HTTP_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTP/1.0");

// UNSUPPORTED Rust 1278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_WSK_API_TIMINGS {
//     pub ConnectCount: u64,
//     pub ConnectSum: u64,
//     pub DisconnectCount: u64,
//     pub DisconnectSum: u64,
//     pub SendCount: u64,
//     pub SendSum: u64,
//     pub ReceiveCount: u64,
//     pub ReceiveSum: u64,
//     pub ReleaseCount: u64,
//     pub ReleaseSum: u64,
//     pub ControlSocketCount: u64,
//     pub ControlSocketSum: u64,
// }

public const val `HeaderWaitTimeout`: `HTTP_SERVICE_CONFIG_TIMEOUT_KEY` = 1;
public const val `Http503ResponseVerbosityBasic`: `HTTP_503_RESPONSE_VERBOSITY` = 0;
public const val `Http503ResponseVerbosityFull`: `HTTP_503_RESPONSE_VERBOSITY` = 2;
public const val `Http503ResponseVerbosityLimited`: `HTTP_503_RESPONSE_VERBOSITY` = 1;
public const val `HttpAuthStatusFailure`: `HTTP_AUTH_STATUS` = 2;
public const val `HttpAuthStatusNotAuthenticated`: `HTTP_AUTH_STATUS` = 1;
public const val `HttpAuthStatusSuccess`: `HTTP_AUTH_STATUS` = 0;
public const val `HttpAuthenticationHardeningLegacy`: `HTTP_AUTHENTICATION_HARDENING_LEVELS` = 0;
public const val `HttpAuthenticationHardeningMedium`: `HTTP_AUTHENTICATION_HARDENING_LEVELS` = 1;
public const val `HttpAuthenticationHardeningStrict`: `HTTP_AUTHENTICATION_HARDENING_LEVELS` = 2;
public const val `HttpCachePolicyMaximum`: `HTTP_CACHE_POLICY_TYPE` = 3;
public const val `HttpCachePolicyNocache`: `HTTP_CACHE_POLICY_TYPE` = 0;
public const val `HttpCachePolicyTimeToLive`: `HTTP_CACHE_POLICY_TYPE` = 2;
public const val `HttpCachePolicyUserInvalidates`: `HTTP_CACHE_POLICY_TYPE` = 1;
public const val `HttpDataChunkFromFileHandle`: `HTTP_DATA_CHUNK_TYPE` = 1;
public const val `HttpDataChunkFromFragmentCache`: `HTTP_DATA_CHUNK_TYPE` = 2;
public const val `HttpDataChunkFromFragmentCacheEx`: `HTTP_DATA_CHUNK_TYPE` = 3;
public const val `HttpDataChunkFromMemory`: `HTTP_DATA_CHUNK_TYPE` = 0;
public const val `HttpDataChunkMaximum`: `HTTP_DATA_CHUNK_TYPE` = 5;
public const val `HttpDataChunkTrailers`: `HTTP_DATA_CHUNK_TYPE` = 4;
public const val `HttpEnabledStateActive`: `HTTP_ENABLED_STATE` = 0;
public const val `HttpEnabledStateInactive`: `HTTP_ENABLED_STATE` = 1;
public const val `HttpFeatureApiTimings`: `HTTP_FEATURE_ID` = 2;
public const val `HttpFeatureDelegateEx`: `HTTP_FEATURE_ID` = 3;
public const val `HttpFeatureHttp3`: `HTTP_FEATURE_ID` = 4;
public const val `HttpFeatureLast`: `HTTP_FEATURE_ID` = 5;
public const val `HttpFeatureResponseTrailers`: `HTTP_FEATURE_ID` = 1;
public const val `HttpFeatureUnknown`: `HTTP_FEATURE_ID` = 0;
public const val `HttpFeaturemax`: `HTTP_FEATURE_ID` = -1;
public const val `HttpHeaderAccept`: `HTTP_HEADER_ID` = 20;
public const val `HttpHeaderAcceptCharset`: `HTTP_HEADER_ID` = 21;
public const val `HttpHeaderAcceptEncoding`: `HTTP_HEADER_ID` = 22;
public const val `HttpHeaderAcceptLanguage`: `HTTP_HEADER_ID` = 23;
public const val `HttpHeaderAcceptRanges`: `HTTP_HEADER_ID` = 20;
public const val `HttpHeaderAge`: `HTTP_HEADER_ID` = 21;
public const val `HttpHeaderAllow`: `HTTP_HEADER_ID` = 10;
public const val `HttpHeaderAuthorization`: `HTTP_HEADER_ID` = 24;
public const val `HttpHeaderCacheControl`: `HTTP_HEADER_ID` = 0;
public const val `HttpHeaderConnection`: `HTTP_HEADER_ID` = 1;
public const val `HttpHeaderContentEncoding`: `HTTP_HEADER_ID` = 13;
public const val `HttpHeaderContentLanguage`: `HTTP_HEADER_ID` = 14;
public const val `HttpHeaderContentLength`: `HTTP_HEADER_ID` = 11;
public const val `HttpHeaderContentLocation`: `HTTP_HEADER_ID` = 15;
public const val `HttpHeaderContentMd5`: `HTTP_HEADER_ID` = 16;
public const val `HttpHeaderContentRange`: `HTTP_HEADER_ID` = 17;
public const val `HttpHeaderContentType`: `HTTP_HEADER_ID` = 12;
public const val `HttpHeaderCookie`: `HTTP_HEADER_ID` = 25;
public const val `HttpHeaderDate`: `HTTP_HEADER_ID` = 2;
public const val `HttpHeaderEtag`: `HTTP_HEADER_ID` = 22;
public const val `HttpHeaderExpect`: `HTTP_HEADER_ID` = 26;
public const val `HttpHeaderExpires`: `HTTP_HEADER_ID` = 18;
public const val `HttpHeaderFrom`: `HTTP_HEADER_ID` = 27;
public const val `HttpHeaderHost`: `HTTP_HEADER_ID` = 28;
public const val `HttpHeaderIfMatch`: `HTTP_HEADER_ID` = 29;
public const val `HttpHeaderIfModifiedSince`: `HTTP_HEADER_ID` = 30;
public const val `HttpHeaderIfNoneMatch`: `HTTP_HEADER_ID` = 31;
public const val `HttpHeaderIfRange`: `HTTP_HEADER_ID` = 32;
public const val `HttpHeaderIfUnmodifiedSince`: `HTTP_HEADER_ID` = 33;
public const val `HttpHeaderKeepAlive`: `HTTP_HEADER_ID` = 3;
public const val `HttpHeaderLastModified`: `HTTP_HEADER_ID` = 19;
public const val `HttpHeaderLocation`: `HTTP_HEADER_ID` = 23;
public const val `HttpHeaderMaxForwards`: `HTTP_HEADER_ID` = 34;
public const val `HttpHeaderMaximum`: `HTTP_HEADER_ID` = 41;
public const val `HttpHeaderPragma`: `HTTP_HEADER_ID` = 4;
public const val `HttpHeaderProxyAuthenticate`: `HTTP_HEADER_ID` = 24;
public const val `HttpHeaderProxyAuthorization`: `HTTP_HEADER_ID` = 35;
public const val `HttpHeaderRange`: `HTTP_HEADER_ID` = 37;
public const val `HttpHeaderReferer`: `HTTP_HEADER_ID` = 36;
public const val `HttpHeaderRequestMaximum`: `HTTP_HEADER_ID` = 41;
public const val `HttpHeaderResponseMaximum`: `HTTP_HEADER_ID` = 30;
public const val `HttpHeaderRetryAfter`: `HTTP_HEADER_ID` = 25;
public const val `HttpHeaderServer`: `HTTP_HEADER_ID` = 26;
public const val `HttpHeaderSetCookie`: `HTTP_HEADER_ID` = 27;
public const val `HttpHeaderTe`: `HTTP_HEADER_ID` = 38;
public const val `HttpHeaderTrailer`: `HTTP_HEADER_ID` = 5;
public const val `HttpHeaderTransferEncoding`: `HTTP_HEADER_ID` = 6;
public const val `HttpHeaderTranslate`: `HTTP_HEADER_ID` = 39;
public const val `HttpHeaderUpgrade`: `HTTP_HEADER_ID` = 7;
public const val `HttpHeaderUserAgent`: `HTTP_HEADER_ID` = 40;
public const val `HttpHeaderVary`: `HTTP_HEADER_ID` = 28;
public const val `HttpHeaderVia`: `HTTP_HEADER_ID` = 8;
public const val `HttpHeaderWarning`: `HTTP_HEADER_ID` = 9;
public const val `HttpHeaderWwwAuthenticate`: `HTTP_HEADER_ID` = 29;
public const val `HttpLogDataTypeFields`: `HTTP_LOG_DATA_TYPE` = 0;
public const val `HttpLoggingRolloverDaily`: `HTTP_LOGGING_ROLLOVER_TYPE` = 1;
public const val `HttpLoggingRolloverHourly`: `HTTP_LOGGING_ROLLOVER_TYPE` = 4;
public const val `HttpLoggingRolloverMonthly`: `HTTP_LOGGING_ROLLOVER_TYPE` = 3;
public const val `HttpLoggingRolloverSize`: `HTTP_LOGGING_ROLLOVER_TYPE` = 0;
public const val `HttpLoggingRolloverWeekly`: `HTTP_LOGGING_ROLLOVER_TYPE` = 2;
public const val `HttpLoggingTypeIIS`: `HTTP_LOGGING_TYPE` = 1;
public const val `HttpLoggingTypeNCSA`: `HTTP_LOGGING_TYPE` = 2;
public const val `HttpLoggingTypeRaw`: `HTTP_LOGGING_TYPE` = 3;
public const val `HttpLoggingTypeW3C`: `HTTP_LOGGING_TYPE` = 0;
public const val `HttpNone`: `HTTP_SERVICE_CONFIG_SETTING_KEY` = 0;
public const val `HttpProtectionLevelEdgeRestricted`: `HTTP_PROTECTION_LEVEL_TYPE` = 1;
public const val `HttpProtectionLevelRestricted`: `HTTP_PROTECTION_LEVEL_TYPE` = 2;
public const val `HttpProtectionLevelUnrestricted`: `HTTP_PROTECTION_LEVEL_TYPE` = 0;
public const val `HttpQosSettingTypeBandwidth`: `HTTP_QOS_SETTING_TYPE` = 0;
public const val `HttpQosSettingTypeConnectionLimit`: `HTTP_QOS_SETTING_TYPE` = 1;
public const val `HttpQosSettingTypeFlowRate`: `HTTP_QOS_SETTING_TYPE` = 2;
public const val `HttpRequestAuthTypeBasic`: `HTTP_REQUEST_AUTH_TYPE` = 1;
public const val `HttpRequestAuthTypeDigest`: `HTTP_REQUEST_AUTH_TYPE` = 2;
public const val `HttpRequestAuthTypeKerberos`: `HTTP_REQUEST_AUTH_TYPE` = 5;
public const val `HttpRequestAuthTypeNTLM`: `HTTP_REQUEST_AUTH_TYPE` = 3;
public const val `HttpRequestAuthTypeNegotiate`: `HTTP_REQUEST_AUTH_TYPE` = 4;
public const val `HttpRequestAuthTypeNone`: `HTTP_REQUEST_AUTH_TYPE` = 0;
public const val `HttpRequestInfoTypeAuth`: `HTTP_REQUEST_INFO_TYPE` = 0;
public const val `HttpRequestInfoTypeChannelBind`: `HTTP_REQUEST_INFO_TYPE` = 1;
public const val `HttpRequestInfoTypeQuicStats`: `HTTP_REQUEST_INFO_TYPE` = 8;
public const val `HttpRequestInfoTypeRequestSizing`: `HTTP_REQUEST_INFO_TYPE` = 7;
public const val `HttpRequestInfoTypeRequestTiming`: `HTTP_REQUEST_INFO_TYPE` = 5;
public const val `HttpRequestInfoTypeSslProtocol`: `HTTP_REQUEST_INFO_TYPE` = 2;
public const val `HttpRequestInfoTypeSslTokenBinding`: `HTTP_REQUEST_INFO_TYPE` = 4;
public const val `HttpRequestInfoTypeSslTokenBindingDraft`: `HTTP_REQUEST_INFO_TYPE` = 3;
public const val `HttpRequestInfoTypeTcpInfoV0`: `HTTP_REQUEST_INFO_TYPE` = 6;
public const val `HttpRequestInfoTypeTcpInfoV1`: `HTTP_REQUEST_INFO_TYPE` = 9;
public const val `HttpRequestPropertyIsb`: `HTTP_REQUEST_PROPERTY` = 0;
public const val `HttpRequestPropertyQuicApiTimings`: `HTTP_REQUEST_PROPERTY` = 7;
public const val `HttpRequestPropertyQuicStats`: `HTTP_REQUEST_PROPERTY` = 2;
public const val `HttpRequestPropertySni`: `HTTP_REQUEST_PROPERTY` = 4;
public const val `HttpRequestPropertyStreamError`: `HTTP_REQUEST_PROPERTY` = 5;
public const val `HttpRequestPropertyTcpInfoV0`: `HTTP_REQUEST_PROPERTY` = 1;
public const val `HttpRequestPropertyTcpInfoV1`: `HTTP_REQUEST_PROPERTY` = 3;
public const val `HttpRequestPropertyWskApiTimings`: `HTTP_REQUEST_PROPERTY` = 6;
public const val `HttpRequestSizingTypeHeaders`: `HTTP_REQUEST_SIZING_TYPE` = 4;
public const val `HttpRequestSizingTypeMax`: `HTTP_REQUEST_SIZING_TYPE` = 5;
public const val `HttpRequestSizingTypeTlsHandshakeLeg1ClientData`: `HTTP_REQUEST_SIZING_TYPE` = 0;
public const val `HttpRequestSizingTypeTlsHandshakeLeg1ServerData`: `HTTP_REQUEST_SIZING_TYPE` = 1;
public const val `HttpRequestSizingTypeTlsHandshakeLeg2ClientData`: `HTTP_REQUEST_SIZING_TYPE` = 2;
public const val `HttpRequestSizingTypeTlsHandshakeLeg2ServerData`: `HTTP_REQUEST_SIZING_TYPE` = 3;
public const val `HttpRequestTimingTypeConnectionStart`: `HTTP_REQUEST_TIMING_TYPE` = 0;
public const val `HttpRequestTimingTypeDataStart`: `HTTP_REQUEST_TIMING_TYPE` = 1;
public const val `HttpRequestTimingTypeHttp2HeaderDecodeEnd`: `HTTP_REQUEST_TIMING_TYPE` = 14;
public const val `HttpRequestTimingTypeHttp2HeaderDecodeStart`: `HTTP_REQUEST_TIMING_TYPE` = 13;
public const val `HttpRequestTimingTypeHttp2StreamStart`: `HTTP_REQUEST_TIMING_TYPE` = 12;
public const val `HttpRequestTimingTypeHttp3HeaderDecodeEnd`: `HTTP_REQUEST_TIMING_TYPE` = 29;
public const val `HttpRequestTimingTypeHttp3HeaderDecodeStart`: `HTTP_REQUEST_TIMING_TYPE` = 28;
public const val `HttpRequestTimingTypeHttp3StreamStart`: `HTTP_REQUEST_TIMING_TYPE` = 27;
public const val `HttpRequestTimingTypeMax`: `HTTP_REQUEST_TIMING_TYPE` = 30;
public const val `HttpRequestTimingTypeRequestDeliveredForDelegation`: `HTTP_REQUEST_TIMING_TYPE` = 23;
public const val `HttpRequestTimingTypeRequestDeliveredForIO`: `HTTP_REQUEST_TIMING_TYPE` = 26;
public const val `HttpRequestTimingTypeRequestDeliveredForInspection`: `HTTP_REQUEST_TIMING_TYPE` = 20;
public const val `HttpRequestTimingTypeRequestHeaderParseEnd`: `HTTP_REQUEST_TIMING_TYPE` = 16;
public const val `HttpRequestTimingTypeRequestHeaderParseStart`: `HTTP_REQUEST_TIMING_TYPE` = 15;
public const val `HttpRequestTimingTypeRequestQueuedForDelegation`: `HTTP_REQUEST_TIMING_TYPE` = 22;
public const val `HttpRequestTimingTypeRequestQueuedForIO`: `HTTP_REQUEST_TIMING_TYPE` = 25;
public const val `HttpRequestTimingTypeRequestQueuedForInspection`: `HTTP_REQUEST_TIMING_TYPE` = 19;
public const val `HttpRequestTimingTypeRequestReturnedAfterDelegation`: `HTTP_REQUEST_TIMING_TYPE` = 24;
public const val `HttpRequestTimingTypeRequestReturnedAfterInspection`: `HTTP_REQUEST_TIMING_TYPE` = 21;
public const val `HttpRequestTimingTypeRequestRoutingEnd`: `HTTP_REQUEST_TIMING_TYPE` = 18;
public const val `HttpRequestTimingTypeRequestRoutingStart`: `HTTP_REQUEST_TIMING_TYPE` = 17;
public const val `HttpRequestTimingTypeTlsAttributesQueryEnd`: `HTTP_REQUEST_TIMING_TYPE` = 9;
public const val `HttpRequestTimingTypeTlsAttributesQueryStart`: `HTTP_REQUEST_TIMING_TYPE` = 8;
public const val `HttpRequestTimingTypeTlsCertificateLoadEnd`: `HTTP_REQUEST_TIMING_TYPE` = 3;
public const val `HttpRequestTimingTypeTlsCertificateLoadStart`: `HTTP_REQUEST_TIMING_TYPE` = 2;
public const val `HttpRequestTimingTypeTlsClientCertQueryEnd`: `HTTP_REQUEST_TIMING_TYPE` = 11;
public const val `HttpRequestTimingTypeTlsClientCertQueryStart`: `HTTP_REQUEST_TIMING_TYPE` = 10;
public const val `HttpRequestTimingTypeTlsHandshakeLeg1End`: `HTTP_REQUEST_TIMING_TYPE` = 5;
public const val `HttpRequestTimingTypeTlsHandshakeLeg1Start`: `HTTP_REQUEST_TIMING_TYPE` = 4;
public const val `HttpRequestTimingTypeTlsHandshakeLeg2End`: `HTTP_REQUEST_TIMING_TYPE` = 7;
public const val `HttpRequestTimingTypeTlsHandshakeLeg2Start`: `HTTP_REQUEST_TIMING_TYPE` = 6;
public const val `HttpResponseInfoTypeAuthenticationProperty`: `HTTP_RESPONSE_INFO_TYPE` = 1;
public const val `HttpResponseInfoTypeChannelBind`: `HTTP_RESPONSE_INFO_TYPE` = 3;
public const val `HttpResponseInfoTypeMultipleKnownHeaders`: `HTTP_RESPONSE_INFO_TYPE` = 0;
public const val `HttpResponseInfoTypeQoSProperty`: `HTTP_RESPONSE_INFO_TYPE` = 2;
public const val `HttpSchemeHttp`: `HTTP_SCHEME` = 0;
public const val `HttpSchemeHttps`: `HTTP_SCHEME` = 1;
public const val `HttpSchemeMaximum`: `HTTP_SCHEME` = 2;
public const val `HttpServer503VerbosityProperty`: `HTTP_SERVER_PROPERTY` = 6;
public const val `HttpServerAuthenticationProperty`: `HTTP_SERVER_PROPERTY` = 0;
public const val `HttpServerBindingProperty`: `HTTP_SERVER_PROPERTY` = 7;
public const val `HttpServerChannelBindProperty`: `HTTP_SERVER_PROPERTY` = 10;
public const val `HttpServerDelegationProperty`: `HTTP_SERVER_PROPERTY` = 16;
public const val `HttpServerExtendedAuthenticationProperty`: `HTTP_SERVER_PROPERTY` = 8;
public const val `HttpServerListenEndpointProperty`: `HTTP_SERVER_PROPERTY` = 9;
public const val `HttpServerLoggingProperty`: `HTTP_SERVER_PROPERTY` = 1;
public const val `HttpServerProtectionLevelProperty`: `HTTP_SERVER_PROPERTY` = 11;
public const val `HttpServerQosProperty`: `HTTP_SERVER_PROPERTY` = 2;
public const val `HttpServerQueueLengthProperty`: `HTTP_SERVER_PROPERTY` = 4;
public const val `HttpServerStateProperty`: `HTTP_SERVER_PROPERTY` = 5;
public const val `HttpServerTimeoutsProperty`: `HTTP_SERVER_PROPERTY` = 3;
public const val `HttpServiceBindingTypeA`: `HTTP_SERVICE_BINDING_TYPE` = 2;
public const val `HttpServiceBindingTypeNone`: `HTTP_SERVICE_BINDING_TYPE` = 0;
public const val `HttpServiceBindingTypeW`: `HTTP_SERVICE_BINDING_TYPE` = 1;
public const val `HttpServiceConfigCache`: `HTTP_SERVICE_CONFIG_ID` = 4;
public const val `HttpServiceConfigIPListenList`: `HTTP_SERVICE_CONFIG_ID` = 0;
public const val `HttpServiceConfigMax`: `HTTP_SERVICE_CONFIG_ID` = 13;
public const val `HttpServiceConfigQueryExact`: `HTTP_SERVICE_CONFIG_QUERY_TYPE` = 0;
public const val `HttpServiceConfigQueryMax`: `HTTP_SERVICE_CONFIG_QUERY_TYPE` = 2;
public const val `HttpServiceConfigQueryNext`: `HTTP_SERVICE_CONFIG_QUERY_TYPE` = 1;
public const val `HttpServiceConfigSSLCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 1;
public const val `HttpServiceConfigSetting`: `HTTP_SERVICE_CONFIG_ID` = 7;
public const val `HttpServiceConfigSslCcsCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 6;
public const val `HttpServiceConfigSslCcsCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 10;
public const val `HttpServiceConfigSslCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 8;
public const val `HttpServiceConfigSslScopedCcsCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 11;
public const val `HttpServiceConfigSslScopedCcsCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 12;
public const val `HttpServiceConfigSslSniCertInfo`: `HTTP_SERVICE_CONFIG_ID` = 5;
public const val `HttpServiceConfigSslSniCertInfoEx`: `HTTP_SERVICE_CONFIG_ID` = 9;
public const val `HttpServiceConfigTimeout`: `HTTP_SERVICE_CONFIG_ID` = 3;
public const val `HttpServiceConfigUrlAclInfo`: `HTTP_SERVICE_CONFIG_ID` = 2;
public const val `HttpTlsThrottle`: `HTTP_SERVICE_CONFIG_SETTING_KEY` = 1;
public const val `HttpVerbCONNECT`: `HTTP_VERB` = 10;
public const val `HttpVerbCOPY`: `HTTP_VERB` = 13;
public const val `HttpVerbDELETE`: `HTTP_VERB` = 8;
public const val `HttpVerbGET`: `HTTP_VERB` = 4;
public const val `HttpVerbHEAD`: `HTTP_VERB` = 5;
public const val `HttpVerbInvalid`: `HTTP_VERB` = 2;
public const val `HttpVerbLOCK`: `HTTP_VERB` = 17;
public const val `HttpVerbMKCOL`: `HTTP_VERB` = 16;
public const val `HttpVerbMOVE`: `HTTP_VERB` = 12;
public const val `HttpVerbMaximum`: `HTTP_VERB` = 20;
public const val `HttpVerbOPTIONS`: `HTTP_VERB` = 3;
public const val `HttpVerbPOST`: `HTTP_VERB` = 6;
public const val `HttpVerbPROPFIND`: `HTTP_VERB` = 14;
public const val `HttpVerbPROPPATCH`: `HTTP_VERB` = 15;
public const val `HttpVerbPUT`: `HTTP_VERB` = 7;
public const val `HttpVerbSEARCH`: `HTTP_VERB` = 19;
public const val `HttpVerbTRACE`: `HTTP_VERB` = 9;
public const val `HttpVerbTRACK`: `HTTP_VERB` = 11;
public const val `HttpVerbUNLOCK`: `HTTP_VERB` = 18;
public const val `HttpVerbUnknown`: `HTTP_VERB` = 1;
public const val `HttpVerbUnparsed`: `HTTP_VERB` = 0;
public const val `IdleConnectionTimeout`: `HTTP_SERVICE_CONFIG_TIMEOUT_KEY` = 0;
public const val `MaxCacheResponseSize`: `HTTP_SERVICE_CONFIG_CACHE_KEY` = 0;
public const val `PerformanceParamAggressiveICW`: `HTTP_PERFORMANCE_PARAM_TYPE` = 1;
public const val `PerformanceParamDecryptOnSspiThread`: `HTTP_PERFORMANCE_PARAM_TYPE` = 5;
public const val `PerformanceParamMax`: `HTTP_PERFORMANCE_PARAM_TYPE` = 6;
public const val `PerformanceParamMaxConcurrentClientStreams`: `HTTP_PERFORMANCE_PARAM_TYPE` = 3;
public const val `PerformanceParamMaxReceiveBufferSize`: `HTTP_PERFORMANCE_PARAM_TYPE` = 4;
public const val `PerformanceParamMaxSendBufferSize`: `HTTP_PERFORMANCE_PARAM_TYPE` = 2;
public const val `PerformanceParamSendBufferingFlags`: `HTTP_PERFORMANCE_PARAM_TYPE` = 0;
