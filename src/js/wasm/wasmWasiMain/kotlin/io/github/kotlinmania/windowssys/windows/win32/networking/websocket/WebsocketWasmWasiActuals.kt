@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle")

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr<Pcstr>, ulsubprotocolcount: UInt, pszextensions: ConstPtr<Pcstr>, ulextensioncount: UInt, pinitialheaders: ConstPtr<WebSocketHttpHeader>, ulinitialheadercount: UInt, padditionalheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, puladditionalheadercount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake")

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr<Pcstr>, ulextensionselectedcount: UInt, prequestheaders: ConstPtr<WebSocketHttpHeader>, ulrequestheadercount: UInt, presponseheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, pulresponseheadercount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake")

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr<CVoid>, ulbytestransferred: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction")

public actual fun webSocketCreateClientHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle")

public actual fun webSocketCreateServerHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle")

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle")

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr<WebSocketHttpHeader>, ulreponseheadercount: UInt, pulselectedextensions: MutPtr<UInt>, pulselectedextensioncount: MutPtr<UInt>, pulselectedsubprotocol: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake")

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake")

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr<WebSocketBuffer>, puldatabuffercount: MutPtr<UInt>, paction: MutPtr<WebSocketAction>, pbuffertype: MutPtr<WebSocketBufferType>, pvapplicationcontext: MutPtr<MutPtr<CVoid>>, pvactioncontext: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction")

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr<CVoid>, ulsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty")

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr<WebSocketBuffer>, pvcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketReceive")

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr<WebSocketBuffer>, context: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWebsocketWebSocketSend")
