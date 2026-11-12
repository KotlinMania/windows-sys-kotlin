@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle")

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr, ulsubprotocolcount: UInt, pszextensions: ConstPtr, ulextensioncount: UInt, pinitialheaders: ConstPtr, ulinitialheadercount: UInt, padditionalheaders: MutPtr, puladditionalheadercount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake")

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr, ulextensionselectedcount: UInt, prequestheaders: ConstPtr, ulrequestheadercount: UInt, presponseheaders: MutPtr, pulresponseheadercount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake")

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr, ulbytestransferred: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction")

public actual fun webSocketCreateClientHandle(pproperties: ConstPtr, ulpropertycount: UInt, phwebsocket: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle")

public actual fun webSocketCreateServerHandle(pproperties: ConstPtr, ulpropertycount: UInt, phwebsocket: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle")

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle")

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr, ulreponseheadercount: UInt, pulselectedextensions: MutPtr, pulselectedextensioncount: MutPtr, pulselectedsubprotocol: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake")

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake")

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr, puldatabuffercount: MutPtr, paction: MutPtr, pbuffertype: MutPtr, pvapplicationcontext: MutPtr, pvactioncontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction")

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr, ulsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty")

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr, pvcontext: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketReceive")

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr, context: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketSend")
