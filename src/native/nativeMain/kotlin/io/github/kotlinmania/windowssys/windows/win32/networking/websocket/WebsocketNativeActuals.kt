@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun WebSocketAbortHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketAbortHandle(hwebsocket.toCPointer<ByteVar>())
}

public actual fun WebSocketBeginClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocols: Long, ulsubprotocolcount: UInt, pszextensions: Long, ulextensioncount: UInt, pinitialheaders: Long, ulinitialheadercount: UInt, padditionalheaders: Long, puladditionalheadercount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketBeginClientHandshake(hwebsocket.toCPointer<ByteVar>(), pszsubprotocols.toCPointer<ByteVar>(), ulsubprotocolcount, pszextensions.toCPointer<ByteVar>(), ulextensioncount, pinitialheaders.toCPointer<ByteVar>(), ulinitialheadercount, padditionalheaders.toCPointer<ByteVar>(), puladditionalheadercount.toCPointer<ByteVar>())

public actual fun WebSocketBeginServerHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocolselected: PCSTR, pszextensionselected: Long, ulextensionselectedcount: UInt, prequestheaders: Long, ulrequestheadercount: UInt, presponseheaders: Long, pulresponseheadercount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketBeginServerHandshake(hwebsocket.toCPointer<ByteVar>(), pszsubprotocolselected.toCPointer<ByteVar>(), pszextensionselected.toCPointer<ByteVar>(), ulextensionselectedcount, prequestheaders.toCPointer<ByteVar>(), ulrequestheadercount, presponseheaders.toCPointer<ByteVar>(), pulresponseheadercount.toCPointer<ByteVar>())

public actual fun WebSocketCompleteAction(hwebsocket: WEB_SOCKET_HANDLE, pvactioncontext: Long, ulbytestransferred: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketCompleteAction(hwebsocket.toCPointer<ByteVar>(), pvactioncontext.toCPointer<ByteVar>(), ulbytestransferred)
}

public actual fun WebSocketCreateClientHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketCreateClientHandle(pproperties.toCPointer<ByteVar>(), ulpropertycount, phwebsocket.toCPointer<ByteVar>())

public actual fun WebSocketCreateServerHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketCreateServerHandle(pproperties.toCPointer<ByteVar>(), ulpropertycount, phwebsocket.toCPointer<ByteVar>())

public actual fun WebSocketDeleteHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketDeleteHandle(hwebsocket.toCPointer<ByteVar>())
}

public actual fun WebSocketEndClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, presponseheaders: Long, ulreponseheadercount: UInt, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketEndClientHandshake(hwebsocket.toCPointer<ByteVar>(), presponseheaders.toCPointer<ByteVar>(), ulreponseheadercount, pulselectedextensions.toCPointer<ByteVar>(), pulselectedextensioncount.toCPointer<ByteVar>(), pulselectedsubprotocol.toCPointer<ByteVar>())

public actual fun WebSocketEndServerHandshake(hwebsocket: WEB_SOCKET_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketEndServerHandshake(hwebsocket.toCPointer<ByteVar>())

public actual fun WebSocketGetAction(hwebsocket: WEB_SOCKET_HANDLE, eactionqueue: WEB_SOCKET_ACTION_QUEUE, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketGetAction(hwebsocket.toCPointer<ByteVar>(), eactionqueue, pdatabuffers.toCPointer<ByteVar>(), puldatabuffercount.toCPointer<ByteVar>(), paction.toCPointer<ByteVar>(), pbuffertype.toCPointer<ByteVar>(), pvapplicationcontext.toCPointer<ByteVar>(), pvactioncontext.toCPointer<ByteVar>())

public actual fun WebSocketGetGlobalProperty(etype: WEB_SOCKET_PROPERTY_TYPE, pvvalue: Long, ulsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketGetGlobalProperty(etype, pvvalue.toCPointer<ByteVar>(), ulsize.toCPointer<ByteVar>())

public actual fun WebSocketReceive(hwebsocket: WEB_SOCKET_HANDLE, pbuffer: Long, pvcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketReceive(hwebsocket.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun WebSocketSend(hwebsocket: WEB_SOCKET_HANDLE, buffertype: WEB_SOCKET_BUFFER_TYPE, pbuffer: Long, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_WebSocketSend(hwebsocket.toCPointer<ByteVar>(), buffertype, pbuffer.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
