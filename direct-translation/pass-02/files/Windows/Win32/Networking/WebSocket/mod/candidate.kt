// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketAbortHandle(hwebsocket : WEB_SOCKET_HANDLE));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketBeginClientHandshake(hwebsocket : WEB_SOCKET_HANDLE, pszsubprotocols : *const windows_sys::core::PCSTR, ulsubprotocolcount : u32, pszextensions : *const windows_sys::core::PCSTR, ulextensioncount : u32, pinitialheaders : *const WEB_SOCKET_HTTP_HEADER, ulinitialheadercount : u32, padditionalheaders : *mut *mut WEB_SOCKET_HTTP_HEADER, puladditionalheadercount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketBeginServerHandshake(hwebsocket : WEB_SOCKET_HANDLE, pszsubprotocolselected : windows_sys::core::PCSTR, pszextensionselected : *const windows_sys::core::PCSTR, ulextensionselectedcount : u32, prequestheaders : *const WEB_SOCKET_HTTP_HEADER, ulrequestheadercount : u32, presponseheaders : *mut *mut WEB_SOCKET_HTTP_HEADER, pulresponseheadercount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketCompleteAction(hwebsocket : WEB_SOCKET_HANDLE, pvactioncontext : *const core::ffi::c_void, ulbytestransferred : u32));

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketCreateClientHandle(pproperties : *const WEB_SOCKET_PROPERTY, ulpropertycount : u32, phwebsocket : *mut WEB_SOCKET_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketCreateServerHandle(pproperties : *const WEB_SOCKET_PROPERTY, ulpropertycount : u32, phwebsocket : *mut WEB_SOCKET_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketDeleteHandle(hwebsocket : WEB_SOCKET_HANDLE));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketEndClientHandshake(hwebsocket : WEB_SOCKET_HANDLE, presponseheaders : *const WEB_SOCKET_HTTP_HEADER, ulreponseheadercount : u32, pulselectedextensions : *mut u32, pulselectedextensioncount : *mut u32, pulselectedsubprotocol : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketEndServerHandshake(hwebsocket : WEB_SOCKET_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketGetAction(hwebsocket : WEB_SOCKET_HANDLE, eactionqueue : WEB_SOCKET_ACTION_QUEUE, pdatabuffers : *mut WEB_SOCKET_BUFFER, puldatabuffercount : *mut u32, paction : *mut WEB_SOCKET_ACTION, pbuffertype : *mut WEB_SOCKET_BUFFER_TYPE, pvapplicationcontext : *mut *mut core::ffi::c_void, pvactioncontext : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketGetGlobalProperty(etype : WEB_SOCKET_PROPERTY_TYPE, pvvalue : *mut core::ffi::c_void, ulsize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketReceive(hwebsocket : WEB_SOCKET_HANDLE, pbuffer : *const WEB_SOCKET_BUFFER, pvcontext : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("websocket.dll" "system" fn WebSocketSend(hwebsocket : WEB_SOCKET_HANDLE, buffertype : WEB_SOCKET_BUFFER_TYPE, pbuffer : *const WEB_SOCKET_BUFFER, context : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

public const val `WEB_SOCKET_ABORTED_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1006;
public typealias `WEB_SOCKET_ACTION` = Int;
public typealias `WEB_SOCKET_ACTION_QUEUE` = Int;
public const val `WEB_SOCKET_ALLOCATED_BUFFER_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 3;
public const val `WEB_SOCKET_ALL_ACTION_QUEUE`: `WEB_SOCKET_ACTION_QUEUE` = 3;
public const val `WEB_SOCKET_BINARY_FRAGMENT_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483645;
public const val `WEB_SOCKET_BINARY_MESSAGE_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483646;
// UNSUPPORTED Rust 21:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WEB_SOCKET_BUFFER {
//     pub Data: WEB_SOCKET_BUFFER_0,
//     pub CloseStatus: WEB_SOCKET_BUFFER_1,
// }

// UNSUPPORTED Rust 27:1: declaration Impl has no candidate rule
// impl Default for WEB_SOCKET_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 32:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEB_SOCKET_BUFFER_1 {
//     pub pbReason: *mut u8,
//     pub ulReasonLength: u32,
//     pub usStatus: u16,
// }

// UNSUPPORTED Rust 39:1: declaration Impl has no candidate rule
// impl Default for WEB_SOCKET_BUFFER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 44:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEB_SOCKET_BUFFER_0 {
//     pub pbBuffer: *mut u8,
//     pub ulBufferLength: u32,
// }

// UNSUPPORTED Rust 50:1: declaration Impl has no candidate rule
// impl Default for WEB_SOCKET_BUFFER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WEB_SOCKET_BUFFER_TYPE` = Int;
public const val `WEB_SOCKET_CLOSE_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483644;
public typealias `WEB_SOCKET_CLOSE_STATUS` = Int;
public const val `WEB_SOCKET_DISABLE_MASKING_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 2;
public const val `WEB_SOCKET_DISABLE_UTF8_VERIFICATION_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 4;
public const val `WEB_SOCKET_EMPTY_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1005;
public const val `WEB_SOCKET_ENDPOINT_UNAVAILABLE_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1001;
// UNSUPPORTED Rust 62:1: non-scalar type Ptr unsupported
// pub type WEB_SOCKET_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 63:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEB_SOCKET_HTTP_HEADER {
//     pub pcName: windows_sys::core::PSTR,
//     pub ulNameLength: u32,
//     pub pcValue: windows_sys::core::PSTR,
//     pub ulValueLength: u32,
// }

// UNSUPPORTED Rust 71:1: declaration Impl has no candidate rule
// impl Default for WEB_SOCKET_HTTP_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WEB_SOCKET_INDICATE_RECEIVE_COMPLETE_ACTION`: `WEB_SOCKET_ACTION` = 4;
public const val `WEB_SOCKET_INDICATE_SEND_COMPLETE_ACTION`: `WEB_SOCKET_ACTION` = 2;
public const val `WEB_SOCKET_INVALID_DATA_TYPE_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1003;
public const val `WEB_SOCKET_INVALID_PAYLOAD_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1007;
public const val `WEB_SOCKET_KEEPALIVE_INTERVAL_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 5;
public const val `WEB_SOCKET_MAX_CLOSE_REASON_LENGTH`: UInt = 123u;
public const val `WEB_SOCKET_MESSAGE_TOO_BIG_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1009;
public const val `WEB_SOCKET_NO_ACTION`: `WEB_SOCKET_ACTION` = 0;
public const val `WEB_SOCKET_PING_PONG_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483643;
public const val `WEB_SOCKET_POLICY_VIOLATION_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1008;
// UNSUPPORTED Rust 86:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WEB_SOCKET_PROPERTY {
//     pub Type: WEB_SOCKET_PROPERTY_TYPE,
//     pub pvValue: *mut core::ffi::c_void,
//     pub ulValueSize: u32,
// }

// UNSUPPORTED Rust 93:1: declaration Impl has no candidate rule
// impl Default for WEB_SOCKET_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WEB_SOCKET_PROPERTY_TYPE` = Int;
public const val `WEB_SOCKET_PROTOCOL_ERROR_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1002;
public const val `WEB_SOCKET_RECEIVE_ACTION_QUEUE`: `WEB_SOCKET_ACTION_QUEUE` = 2;
public const val `WEB_SOCKET_RECEIVE_BUFFER_SIZE_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 0;
public const val `WEB_SOCKET_RECEIVE_FROM_NETWORK_ACTION`: `WEB_SOCKET_ACTION` = 3;
public const val `WEB_SOCKET_SECURE_HANDSHAKE_ERROR_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1015;
public const val `WEB_SOCKET_SEND_ACTION_QUEUE`: `WEB_SOCKET_ACTION_QUEUE` = 1;
public const val `WEB_SOCKET_SEND_BUFFER_SIZE_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 1;
public const val `WEB_SOCKET_SEND_TO_NETWORK_ACTION`: `WEB_SOCKET_ACTION` = 1;
public const val `WEB_SOCKET_SERVER_ERROR_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1011;
public const val `WEB_SOCKET_SUCCESS_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1000;
public const val `WEB_SOCKET_SUPPORTED_VERSIONS_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 6;
public const val `WEB_SOCKET_UNSOLICITED_PONG_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483642;
public const val `WEB_SOCKET_UNSUPPORTED_EXTENSIONS_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1010;
public const val `WEB_SOCKET_UTF8_FRAGMENT_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483647;
public const val `WEB_SOCKET_UTF8_MESSAGE_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483648;
