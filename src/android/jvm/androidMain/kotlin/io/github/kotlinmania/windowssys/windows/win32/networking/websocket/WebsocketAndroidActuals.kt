@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

private object WindowsWin32NetworkingWebsocketJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketAbortHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake(hwebsocket: Long, pszsubprotocols: Long, ulsubprotocolcount: Int, pszextensions: Long, ulextensioncount: Int, pinitialheaders: Long, ulinitialheadercount: Int, padditionalheaders: Long, puladditionalheadercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake(hwebsocket: Long, pszsubprotocolselected: Long, pszextensionselected: Long, ulextensionselectedcount: Int, prequestheaders: Long, ulrequestheadercount: Int, presponseheaders: Long, pulresponseheadercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketCompleteAction(hwebsocket: Long, pvactioncontext: Long, ulbytestransferred: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketDeleteHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake(hwebsocket: Long, presponseheaders: Long, ulreponseheadercount: Int, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake(hwebsocket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketGetAction(hwebsocket: Long, eactionqueue: Int, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(etype: Int, pvvalue: Long, ulsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketReceive(hwebsocket: Long, pbuffer: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_webSocketSend(hwebsocket: Long, buffertype: Int, pbuffer: Long, context: Long): Int
}

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketAbortHandle((hwebsocket?.value ?: 0L))
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: COpaquePointer?, ulsubprotocolcount: UInt, pszextensions: COpaquePointer?, ulextensioncount: UInt, pinitialheaders: COpaquePointer?, ulinitialheadercount: UInt, padditionalheaders: COpaquePointer?, puladditionalheadercount: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketBeginClientHandshake((hwebsocket?.value ?: 0L), (pszsubprotocols?.value ?: 0L), ulsubprotocolcount.toInt(), (pszextensions?.value ?: 0L), ulextensioncount.toInt(), (pinitialheaders?.value ?: 0L), ulinitialheadercount.toInt(), (padditionalheaders?.value ?: 0L), (puladditionalheadercount?.value ?: 0L))

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: COpaquePointer?, ulextensionselectedcount: UInt, prequestheaders: COpaquePointer?, ulrequestheadercount: UInt, presponseheaders: COpaquePointer?, pulresponseheadercount: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketBeginServerHandshake((hwebsocket?.value ?: 0L), (pszsubprotocolselected?.value ?: 0L), (pszextensionselected?.value ?: 0L), ulextensionselectedcount.toInt(), (prequestheaders?.value ?: 0L), ulrequestheadercount.toInt(), (presponseheaders?.value ?: 0L), (pulresponseheadercount?.value ?: 0L))

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: COpaquePointer?, ulbytestransferred: UInt) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketCompleteAction((hwebsocket?.value ?: 0L), (pvactioncontext?.value ?: 0L), ulbytestransferred.toInt())
}

public actual fun webSocketCreateClientHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketCreateClientHandle((pproperties?.value ?: 0L), ulpropertycount.toInt(), (phwebsocket?.value ?: 0L))

public actual fun webSocketCreateServerHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketCreateServerHandle((pproperties?.value ?: 0L), ulpropertycount.toInt(), (phwebsocket?.value ?: 0L))

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketDeleteHandle((hwebsocket?.value ?: 0L))
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: COpaquePointer?, ulreponseheadercount: UInt, pulselectedextensions: COpaquePointer?, pulselectedextensioncount: COpaquePointer?, pulselectedsubprotocol: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketEndClientHandshake((hwebsocket?.value ?: 0L), (presponseheaders?.value ?: 0L), ulreponseheadercount.toInt(), (pulselectedextensions?.value ?: 0L), (pulselectedextensioncount?.value ?: 0L), (pulselectedsubprotocol?.value ?: 0L))

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketEndServerHandshake((hwebsocket?.value ?: 0L))

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: COpaquePointer?, puldatabuffercount: COpaquePointer?, paction: COpaquePointer?, pbuffertype: COpaquePointer?, pvapplicationcontext: COpaquePointer?, pvactioncontext: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketGetAction((hwebsocket?.value ?: 0L), eactionqueue, (pdatabuffers?.value ?: 0L), (puldatabuffercount?.value ?: 0L), (paction?.value ?: 0L), (pbuffertype?.value ?: 0L), (pvapplicationcontext?.value ?: 0L), (pvactioncontext?.value ?: 0L))

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: COpaquePointer?, ulsize: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketGetGlobalProperty(etype, (pvvalue?.value ?: 0L), (ulsize?.value ?: 0L))

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: COpaquePointer?, pvcontext: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketReceive((hwebsocket?.value ?: 0L), (pbuffer?.value ?: 0L), (pvcontext?.value ?: 0L))

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: COpaquePointer?, context: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_webSocketSend((hwebsocket?.value ?: 0L), buffertype, (pbuffer?.value ?: 0L), (context?.value ?: 0L))
