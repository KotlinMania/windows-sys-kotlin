@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkingWebsocketNapiAddon(): Boolean

private val _windowsWin32NetworkingWebsocketNapiAvailable: Boolean = _initWindowsWin32NetworkingWebsocketNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketAbortHandle(p0)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketAbortHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketCompleteAction(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketCompleteAction(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketDeleteHandle(p0)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketDeleteHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake(p0)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketGetAction(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketGetAction(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketReceive(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketReceive(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_websocket_webSocketSend(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_websocket_webSocketSend(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    if (_windowsWin32NetworkingWebsocketNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_websocket_webSocketAbortHandle((hwebsocket?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: COpaquePointer?, ulsubprotocolcount: UInt, pszextensions: COpaquePointer?, ulextensioncount: UInt, pinitialheaders: COpaquePointer?, ulinitialheadercount: UInt, padditionalheaders: COpaquePointer?, puladditionalheadercount: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake((hwebsocket?.value ?: 0L).toString(), (pszsubprotocols?.value ?: 0L).toString(), ulsubprotocolcount.toInt(), (pszextensions?.value ?: 0L).toString(), ulextensioncount.toInt(), (pinitialheaders?.value ?: 0L).toString(), ulinitialheadercount.toInt(), (padditionalheaders?.value ?: 0L).toString(), (puladditionalheadercount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: COpaquePointer?, ulextensionselectedcount: UInt, prequestheaders: COpaquePointer?, ulrequestheadercount: UInt, presponseheaders: COpaquePointer?, pulresponseheadercount: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake((hwebsocket?.value ?: 0L).toString(), (pszsubprotocolselected?.value ?: 0L).toString(), (pszextensionselected?.value ?: 0L).toString(), ulextensionselectedcount.toInt(), (prequestheaders?.value ?: 0L).toString(), ulrequestheadercount.toInt(), (presponseheaders?.value ?: 0L).toString(), (pulresponseheadercount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: COpaquePointer?, ulbytestransferred: UInt) {
    if (_windowsWin32NetworkingWebsocketNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_websocket_webSocketCompleteAction((hwebsocket?.value ?: 0L).toString(), (pvactioncontext?.value ?: 0L).toString(), ulbytestransferred.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketCreateClientHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle((pproperties?.value ?: 0L).toString(), ulpropertycount.toInt(), (phwebsocket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketCreateServerHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle((pproperties?.value ?: 0L).toString(), ulpropertycount.toInt(), (phwebsocket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    if (_windowsWin32NetworkingWebsocketNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_websocket_webSocketDeleteHandle((hwebsocket?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: COpaquePointer?, ulreponseheadercount: UInt, pulselectedextensions: COpaquePointer?, pulselectedextensioncount: COpaquePointer?, pulselectedsubprotocol: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake((hwebsocket?.value ?: 0L).toString(), (presponseheaders?.value ?: 0L).toString(), ulreponseheadercount.toInt(), (pulselectedextensions?.value ?: 0L).toString(), (pulselectedextensioncount?.value ?: 0L).toString(), (pulselectedsubprotocol?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake((hwebsocket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: COpaquePointer?, puldatabuffercount: COpaquePointer?, paction: COpaquePointer?, pbuffertype: COpaquePointer?, pvapplicationcontext: COpaquePointer?, pvactioncontext: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketGetAction((hwebsocket?.value ?: 0L).toString(), eactionqueue, (pdatabuffers?.value ?: 0L).toString(), (puldatabuffercount?.value ?: 0L).toString(), (paction?.value ?: 0L).toString(), (pbuffertype?.value ?: 0L).toString(), (pvapplicationcontext?.value ?: 0L).toString(), (pvactioncontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: COpaquePointer?, ulsize: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(etype, (pvvalue?.value ?: 0L).toString(), (ulsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: COpaquePointer?, pvcontext: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketReceive((hwebsocket?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: COpaquePointer?, context: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWebsocketNapiAvailable) _wasm_windowssys_windows_win32_networking_websocket_webSocketSend((hwebsocket?.value ?: 0L).toString(), buffertype, (pbuffer?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
