@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

private val windowsWin32NetworkingWebsocketNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    if (windowsWin32NetworkingWebsocketNapiAddon != null) {
        windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(hwebsocket.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr<Pcstr>, ulsubprotocolcount: UInt, pszextensions: ConstPtr<Pcstr>, ulextensioncount: UInt, pinitialheaders: ConstPtr<WebSocketHttpHeader>, ulinitialheadercount: UInt, padditionalheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, puladditionalheadercount: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(hwebsocket.rawAddress.toString(), pszsubprotocols.rawAddress.toString(), ulsubprotocolcount.toInt(), pszextensions.rawAddress.toString(), ulextensioncount.toInt(), pinitialheaders.rawAddress.toString(), ulinitialheadercount.toInt(), padditionalheaders.rawAddress.toString(), puladditionalheadercount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr<Pcstr>, ulextensionselectedcount: UInt, prequestheaders: ConstPtr<WebSocketHttpHeader>, ulrequestheadercount: UInt, presponseheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, pulresponseheadercount: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(hwebsocket.rawAddress.toString(), pszsubprotocolselected.rawAddress.toString(), pszextensionselected.rawAddress.toString(), ulextensionselectedcount.toInt(), prequestheaders.rawAddress.toString(), ulrequestheadercount.toInt(), presponseheaders.rawAddress.toString(), pulresponseheadercount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr<CVoid>, ulbytestransferred: UInt) {
    if (windowsWin32NetworkingWebsocketNapiAddon != null) {
        windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(hwebsocket.rawAddress.toString(), pvactioncontext.rawAddress.toString(), ulbytestransferred.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketCreateClientHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(pproperties.rawAddress.toString(), ulpropertycount.toInt(), phwebsocket.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketCreateServerHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(pproperties.rawAddress.toString(), ulpropertycount.toInt(), phwebsocket.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    if (windowsWin32NetworkingWebsocketNapiAddon != null) {
        windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(hwebsocket.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr<WebSocketHttpHeader>, ulreponseheadercount: UInt, pulselectedextensions: MutPtr<UInt>, pulselectedextensioncount: MutPtr<UInt>, pulselectedsubprotocol: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(hwebsocket.rawAddress.toString(), presponseheaders.rawAddress.toString(), ulreponseheadercount.toInt(), pulselectedextensions.rawAddress.toString(), pulselectedextensioncount.rawAddress.toString(), pulselectedsubprotocol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(hwebsocket.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr<WebSocketBuffer>, puldatabuffercount: MutPtr<UInt>, paction: MutPtr<WebSocketAction>, pbuffertype: MutPtr<WebSocketBufferType>, pvapplicationcontext: MutPtr<MutPtr<CVoid>>, pvactioncontext: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(hwebsocket.rawAddress.toString(), eactionqueue, pdatabuffers.rawAddress.toString(), puldatabuffercount.rawAddress.toString(), paction.rawAddress.toString(), pbuffertype.rawAddress.toString(), pvapplicationcontext.rawAddress.toString(), pvactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr<CVoid>, ulsize: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(etype, pvvalue.rawAddress.toString(), ulsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr<WebSocketBuffer>, pvcontext: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(hwebsocket.rawAddress.toString(), pbuffer.rawAddress.toString(), pvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr<WebSocketBuffer>, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkingWebsocketNapiAddon != null) (windowsWin32NetworkingWebsocketNapiAddon.windowssysWindowsWin32NetworkingWebsocketWebSocketSend(hwebsocket.rawAddress.toString(), buffertype, pbuffer.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
