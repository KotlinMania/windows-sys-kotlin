// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketAbortHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketAbortHandle`(`hwebsocket` : `WEB_SOCKET_HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketBeginClientHandshake; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketBeginClientHandshake`(`hwebsocket` : `WEB_SOCKET_HANDLE`, `pszsubprotocols` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `ulsubprotocolcount` : UInt, `pszextensions` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `ulextensioncount` : UInt, `pinitialheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEB_SOCKET_HTTP_HEADER`>?, `ulinitialheadercount` : UInt, `padditionalheaders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WEB_SOCKET_HTTP_HEADER`>>?, `puladditionalheadercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketBeginServerHandshake; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketBeginServerHandshake`(`hwebsocket` : `WEB_SOCKET_HANDLE`, `pszsubprotocolselected` : `windows_sys`.`core`.`PCSTR`, `pszextensionselected` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `ulextensionselectedcount` : UInt, `prequestheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEB_SOCKET_HTTP_HEADER`>?, `ulrequestheadercount` : UInt, `presponseheaders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WEB_SOCKET_HTTP_HEADER`>>?, `pulresponseheadercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketCompleteAction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketCompleteAction`(`hwebsocket` : `WEB_SOCKET_HANDLE`, `pvactioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulbytestransferred` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketCreateClientHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketCreateClientHandle`(`pproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEB_SOCKET_PROPERTY`>?, `ulpropertycount` : UInt, `phwebsocket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WEB_SOCKET_HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketCreateServerHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketCreateServerHandle`(`pproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEB_SOCKET_PROPERTY`>?, `ulpropertycount` : UInt, `phwebsocket` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WEB_SOCKET_HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketDeleteHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketDeleteHandle`(`hwebsocket` : `WEB_SOCKET_HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketEndClientHandshake; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketEndClientHandshake`(`hwebsocket` : `WEB_SOCKET_HANDLE`, `presponseheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEB_SOCKET_HTTP_HEADER`>?, `ulreponseheadercount` : UInt, `pulselectedextensions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulselectedextensioncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pulselectedsubprotocol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketEndServerHandshake; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketEndServerHandshake`(`hwebsocket` : `WEB_SOCKET_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketGetAction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketGetAction`(`hwebsocket` : `WEB_SOCKET_HANDLE`, `eactionqueue` : `WEB_SOCKET_ACTION_QUEUE`, `pdatabuffers` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WEB_SOCKET_BUFFER`>?, `puldatabuffercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `paction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WEB_SOCKET_ACTION`>?, `pbuffertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WEB_SOCKET_BUFFER_TYPE`>?, `pvapplicationcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pvactioncontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketGetGlobalProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketGetGlobalProperty`(`etype` : `WEB_SOCKET_PROPERTY_TYPE`, `pvvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ulsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketReceive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketReceive`(`hwebsocket` : `WEB_SOCKET_HANDLE`, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEB_SOCKET_BUFFER`>?, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=websocket.dll, ABI=system, export=WebSocketSend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WebSocketSend`(`hwebsocket` : `WEB_SOCKET_HANDLE`, `buffertype` : `WEB_SOCKET_BUFFER_TYPE`, `pbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`WEB_SOCKET_BUFFER`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
public const val `WEB_SOCKET_ABORTED_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1006;
public typealias `WEB_SOCKET_ACTION` = Int;
public typealias `WEB_SOCKET_ACTION_QUEUE` = Int;
public const val `WEB_SOCKET_ALLOCATED_BUFFER_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 3;
public const val `WEB_SOCKET_ALL_ACTION_QUEUE`: `WEB_SOCKET_ACTION_QUEUE` = 3;
public const val `WEB_SOCKET_BINARY_FRAGMENT_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483645;
public const val `WEB_SOCKET_BINARY_MESSAGE_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483646;
// UNSUPPORTED Rust 21:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WEB_SOCKET_BUFFER {
//     pub Data: WEB_SOCKET_BUFFER_0,
//     pub CloseStatus: WEB_SOCKET_BUFFER_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WEB_SOCKET_BUFFER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WEB_SOCKET_BUFFER`.Companion.`default`() : `WEB_SOCKET_BUFFER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEB_SOCKET_BUFFER_1` (
    public var `pbReason`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ulReasonLength`: UInt,
    public var `usStatus`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WEB_SOCKET_BUFFER_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WEB_SOCKET_BUFFER_1`.Companion.`default`() : `WEB_SOCKET_BUFFER_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEB_SOCKET_BUFFER_0` (
    public var `pbBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ulBufferLength`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WEB_SOCKET_BUFFER_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WEB_SOCKET_BUFFER_0`.Companion.`default`() : `WEB_SOCKET_BUFFER_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WEB_SOCKET_BUFFER_TYPE` = Int;
public const val `WEB_SOCKET_CLOSE_BUFFER_TYPE`: `WEB_SOCKET_BUFFER_TYPE` = -2147483644;
public typealias `WEB_SOCKET_CLOSE_STATUS` = Int;
public const val `WEB_SOCKET_DISABLE_MASKING_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 2;
public const val `WEB_SOCKET_DISABLE_UTF8_VERIFICATION_PROPERTY_TYPE`: `WEB_SOCKET_PROPERTY_TYPE` = 4;
public const val `WEB_SOCKET_EMPTY_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1005;
public const val `WEB_SOCKET_ENDPOINT_UNAVAILABLE_CLOSE_STATUS`: `WEB_SOCKET_CLOSE_STATUS` = 1001;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WEB_SOCKET_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEB_SOCKET_HTTP_HEADER` (
    public var `pcName`: `windows_sys`.`core`.`PSTR`,
    public var `ulNameLength`: UInt,
    public var `pcValue`: `windows_sys`.`core`.`PSTR`,
    public var `ulValueLength`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WEB_SOCKET_HTTP_HEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WEB_SOCKET_HTTP_HEADER`.Companion.`default`() : `WEB_SOCKET_HTTP_HEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WEB_SOCKET_PROPERTY` (
    public var `Type`: `WEB_SOCKET_PROPERTY_TYPE`,
    public var `pvValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulValueSize`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WEB_SOCKET_PROPERTY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WEB_SOCKET_PROPERTY`.Companion.`default`() : `WEB_SOCKET_PROPERTY` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
