@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingWebsocketNapiAddon(): Boolean

private val windowsWin32NetworkingWebsocketNapiAvailable: Boolean = initWindowsWin32NetworkingWebsocketNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketReceive(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWebsocketWebSocketSend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketSend(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    if (windowsWin32NetworkingWebsocketNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(hwebsocket.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr<Pcstr>, ulsubprotocolcount: UInt, pszextensions: ConstPtr<Pcstr>, ulextensioncount: UInt, pinitialheaders: ConstPtr<WebSocketHttpHeader>, ulinitialheadercount: UInt, padditionalheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, puladditionalheadercount: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(hwebsocket.rawAddress.toString(), pszsubprotocols.rawAddress.toString(), ulsubprotocolcount.toInt(), pszextensions.rawAddress.toString(), ulextensioncount.toInt(), pinitialheaders.rawAddress.toString(), ulinitialheadercount.toInt(), padditionalheaders.rawAddress.toString(), puladditionalheadercount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr<Pcstr>, ulextensionselectedcount: UInt, prequestheaders: ConstPtr<WebSocketHttpHeader>, ulrequestheadercount: UInt, presponseheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, pulresponseheadercount: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(hwebsocket.rawAddress.toString(), pszsubprotocolselected.rawAddress.toString(), pszextensionselected.rawAddress.toString(), ulextensionselectedcount.toInt(), prequestheaders.rawAddress.toString(), ulrequestheadercount.toInt(), presponseheaders.rawAddress.toString(), pulresponseheadercount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr<CVoid>, ulbytestransferred: UInt) {
    if (windowsWin32NetworkingWebsocketNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(hwebsocket.rawAddress.toString(), pvactioncontext.rawAddress.toString(), ulbytestransferred.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketCreateClientHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(pproperties.rawAddress.toString(), ulpropertycount.toInt(), phwebsocket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketCreateServerHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(pproperties.rawAddress.toString(), ulpropertycount.toInt(), phwebsocket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    if (windowsWin32NetworkingWebsocketNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(hwebsocket.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr<WebSocketHttpHeader>, ulreponseheadercount: UInt, pulselectedextensions: MutPtr<UInt>, pulselectedextensioncount: MutPtr<UInt>, pulselectedsubprotocol: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(hwebsocket.rawAddress.toString(), presponseheaders.rawAddress.toString(), ulreponseheadercount.toInt(), pulselectedextensions.rawAddress.toString(), pulselectedextensioncount.rawAddress.toString(), pulselectedsubprotocol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(hwebsocket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr<WebSocketBuffer>, puldatabuffercount: MutPtr<UInt>, paction: MutPtr<WebSocketAction>, pbuffertype: MutPtr<WebSocketBufferType>, pvapplicationcontext: MutPtr<MutPtr<CVoid>>, pvactioncontext: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(hwebsocket.rawAddress.toString(), eactionqueue, pdatabuffers.rawAddress.toString(), puldatabuffercount.rawAddress.toString(), paction.rawAddress.toString(), pbuffertype.rawAddress.toString(), pvapplicationcontext.rawAddress.toString(), pvactioncontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr<CVoid>, ulsize: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(etype, pvvalue.rawAddress.toString(), ulsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr<WebSocketBuffer>, pvcontext: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketReceive(hwebsocket.rawAddress.toString(), pbuffer.rawAddress.toString(), pvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr<WebSocketBuffer>, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAvailable) wasmWindowssysWindowsWin32NetworkingWebsocketWebSocketSend(hwebsocket.rawAddress.toString(), buffertype, pbuffer.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
