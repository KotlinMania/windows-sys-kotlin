@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketAbortHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketCompleteAction
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketDeleteHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketGetAction
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketReceive
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssys_windows_win32_networking_websocket_webSocketSend
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    windowssys_windows_win32_networking_websocket_webSocketAbortHandle(hwebsocket?.value?.toCPointer<ByteVar>())
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: COpaquePointer?, ulsubprotocolcount: UInt, pszextensions: COpaquePointer?, ulextensioncount: UInt, pinitialheaders: COpaquePointer?, ulinitialheadercount: UInt, padditionalheaders: COpaquePointer?, puladditionalheadercount: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake(hwebsocket?.value?.toCPointer<ByteVar>(), pszsubprotocols?.value?.toCPointer<ByteVar>(), ulsubprotocolcount, pszextensions?.value?.toCPointer<ByteVar>(), ulextensioncount, pinitialheaders?.value?.toCPointer<ByteVar>(), ulinitialheadercount, padditionalheaders?.value?.toCPointer<ByteVar>(), puladditionalheadercount?.value?.toCPointer<ByteVar>())

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: COpaquePointer?, ulextensionselectedcount: UInt, prequestheaders: COpaquePointer?, ulrequestheadercount: UInt, presponseheaders: COpaquePointer?, pulresponseheadercount: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake(hwebsocket?.value?.toCPointer<ByteVar>(), pszsubprotocolselected?.value?.toCPointer<ByteVar>(), pszextensionselected?.value?.toCPointer<ByteVar>(), ulextensionselectedcount, prequestheaders?.value?.toCPointer<ByteVar>(), ulrequestheadercount, presponseheaders?.value?.toCPointer<ByteVar>(), pulresponseheadercount?.value?.toCPointer<ByteVar>())

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: COpaquePointer?, ulbytestransferred: UInt) {
    windowssys_windows_win32_networking_websocket_webSocketCompleteAction(hwebsocket?.value?.toCPointer<ByteVar>(), pvactioncontext?.value?.toCPointer<ByteVar>(), ulbytestransferred)
}

public actual fun webSocketCreateClientHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle(pproperties?.value?.toCPointer<ByteVar>(), ulpropertycount, phwebsocket?.value?.toCPointer<ByteVar>())

public actual fun webSocketCreateServerHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle(pproperties?.value?.toCPointer<ByteVar>(), ulpropertycount, phwebsocket?.value?.toCPointer<ByteVar>())

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    windowssys_windows_win32_networking_websocket_webSocketDeleteHandle(hwebsocket?.value?.toCPointer<ByteVar>())
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: COpaquePointer?, ulreponseheadercount: UInt, pulselectedextensions: COpaquePointer?, pulselectedextensioncount: COpaquePointer?, pulselectedsubprotocol: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake(hwebsocket?.value?.toCPointer<ByteVar>(), presponseheaders?.value?.toCPointer<ByteVar>(), ulreponseheadercount, pulselectedextensions?.value?.toCPointer<ByteVar>(), pulselectedextensioncount?.value?.toCPointer<ByteVar>(), pulselectedsubprotocol?.value?.toCPointer<ByteVar>())

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake(hwebsocket?.value?.toCPointer<ByteVar>())

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: COpaquePointer?, puldatabuffercount: COpaquePointer?, paction: COpaquePointer?, pbuffertype: COpaquePointer?, pvapplicationcontext: COpaquePointer?, pvactioncontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketGetAction(hwebsocket?.value?.toCPointer<ByteVar>(), eactionqueue, pdatabuffers?.value?.toCPointer<ByteVar>(), puldatabuffercount?.value?.toCPointer<ByteVar>(), paction?.value?.toCPointer<ByteVar>(), pbuffertype?.value?.toCPointer<ByteVar>(), pvapplicationcontext?.value?.toCPointer<ByteVar>(), pvactioncontext?.value?.toCPointer<ByteVar>())

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: COpaquePointer?, ulsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(etype, pvvalue?.value?.toCPointer<ByteVar>(), ulsize?.value?.toCPointer<ByteVar>())

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: COpaquePointer?, pvcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketReceive(hwebsocket?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: COpaquePointer?, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_networking_websocket_webSocketSend(hwebsocket?.value?.toCPointer<ByteVar>(), buffertype, pbuffer?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())
