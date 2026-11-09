@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR

private val _windowsWin32NetworkingWebsocketNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun WebSocketAbortHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) {
        _windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketAbortHandle(hwebsocket.toString())
    }
}

public actual fun WebSocketBeginClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocols: Long, ulsubprotocolcount: UInt, pszextensions: Long, ulextensioncount: UInt, pinitialheaders: Long, ulinitialheadercount: UInt, padditionalheaders: Long, puladditionalheadercount: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketBeginClientHandshake(hwebsocket.toString(), pszsubprotocols.toString(), ulsubprotocolcount.toInt(), pszextensions.toString(), ulextensioncount.toInt(), pinitialheaders.toString(), ulinitialheadercount.toInt(), padditionalheaders.toString(), puladditionalheadercount.toString()) as Int) else 0

public actual fun WebSocketBeginServerHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocolselected: PCSTR, pszextensionselected: Long, ulextensionselectedcount: UInt, prequestheaders: Long, ulrequestheadercount: UInt, presponseheaders: Long, pulresponseheadercount: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketBeginServerHandshake(hwebsocket.toString(), pszsubprotocolselected.toString(), pszextensionselected.toString(), ulextensionselectedcount.toInt(), prequestheaders.toString(), ulrequestheadercount.toInt(), presponseheaders.toString(), pulresponseheadercount.toString()) as Int) else 0

public actual fun WebSocketCompleteAction(hwebsocket: WEB_SOCKET_HANDLE, pvactioncontext: Long, ulbytestransferred: UInt) {
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) {
        _windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketCompleteAction(hwebsocket.toString(), pvactioncontext.toString(), ulbytestransferred.toInt())
    }
}

public actual fun WebSocketCreateClientHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketCreateClientHandle(pproperties.toString(), ulpropertycount.toInt(), phwebsocket.toString()) as Int) else 0

public actual fun WebSocketCreateServerHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketCreateServerHandle(pproperties.toString(), ulpropertycount.toInt(), phwebsocket.toString()) as Int) else 0

public actual fun WebSocketDeleteHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) {
        _windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketDeleteHandle(hwebsocket.toString())
    }
}

public actual fun WebSocketEndClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, presponseheaders: Long, ulreponseheadercount: UInt, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketEndClientHandshake(hwebsocket.toString(), presponseheaders.toString(), ulreponseheadercount.toInt(), pulselectedextensions.toString(), pulselectedextensioncount.toString(), pulselectedsubprotocol.toString()) as Int) else 0

public actual fun WebSocketEndServerHandshake(hwebsocket: WEB_SOCKET_HANDLE): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketEndServerHandshake(hwebsocket.toString()) as Int) else 0

public actual fun WebSocketGetAction(hwebsocket: WEB_SOCKET_HANDLE, eactionqueue: WEB_SOCKET_ACTION_QUEUE, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketGetAction(hwebsocket.toString(), eactionqueue, pdatabuffers.toString(), puldatabuffercount.toString(), paction.toString(), pbuffertype.toString(), pvapplicationcontext.toString(), pvactioncontext.toString()) as Int) else 0

public actual fun WebSocketGetGlobalProperty(etype: WEB_SOCKET_PROPERTY_TYPE, pvvalue: Long, ulsize: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketGetGlobalProperty(etype, pvvalue.toString(), ulsize.toString()) as Int) else 0

public actual fun WebSocketReceive(hwebsocket: WEB_SOCKET_HANDLE, pbuffer: Long, pvcontext: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketReceive(hwebsocket.toString(), pbuffer.toString(), pvcontext.toString()) as Int) else 0

public actual fun WebSocketSend(hwebsocket: WEB_SOCKET_HANDLE, buffertype: WEB_SOCKET_BUFFER_TYPE, pbuffer: Long, context: Long): HRESULT =
    if (_windowsWin32NetworkingWebsocketNapiAddon != null) (_windowsWin32NetworkingWebsocketNapiAddon.windowssys_windows_win32_networking_websocket_WebSocketSend(hwebsocket.toString(), buffertype, pbuffer.toString(), context.toString()) as Int) else 0
