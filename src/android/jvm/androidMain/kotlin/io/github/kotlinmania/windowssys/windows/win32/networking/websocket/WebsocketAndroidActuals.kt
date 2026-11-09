@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR

private object WindowsWin32NetworkingWebsocketJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketAbortHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketBeginClientHandshake(hwebsocket: Long, pszsubprotocols: Long, ulsubprotocolcount: Int, pszextensions: Long, ulextensioncount: Int, pinitialheaders: Long, ulinitialheadercount: Int, padditionalheaders: Long, puladditionalheadercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketBeginServerHandshake(hwebsocket: Long, pszsubprotocolselected: Long, pszextensionselected: Long, ulextensionselectedcount: Int, prequestheaders: Long, ulrequestheadercount: Int, presponseheaders: Long, pulresponseheadercount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketCompleteAction(hwebsocket: Long, pvactioncontext: Long, ulbytestransferred: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketCreateClientHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketCreateServerHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketDeleteHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketEndClientHandshake(hwebsocket: Long, presponseheaders: Long, ulreponseheadercount: Int, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketEndServerHandshake(hwebsocket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketGetAction(hwebsocket: Long, eactionqueue: Int, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketGetGlobalProperty(etype: Int, pvvalue: Long, ulsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketReceive(hwebsocket: Long, pbuffer: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_websocket_WebSocketSend(hwebsocket: Long, buffertype: Int, pbuffer: Long, context: Long): Int
}

public actual fun WebSocketAbortHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketAbortHandle(hwebsocket)
}

public actual fun WebSocketBeginClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocols: Long, ulsubprotocolcount: UInt, pszextensions: Long, ulextensioncount: UInt, pinitialheaders: Long, ulinitialheadercount: UInt, padditionalheaders: Long, puladditionalheadercount: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketBeginClientHandshake(hwebsocket, pszsubprotocols, ulsubprotocolcount.toInt(), pszextensions, ulextensioncount.toInt(), pinitialheaders, ulinitialheadercount.toInt(), padditionalheaders, puladditionalheadercount)

public actual fun WebSocketBeginServerHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocolselected: PCSTR, pszextensionselected: Long, ulextensionselectedcount: UInt, prequestheaders: Long, ulrequestheadercount: UInt, presponseheaders: Long, pulresponseheadercount: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketBeginServerHandshake(hwebsocket, pszsubprotocolselected, pszextensionselected, ulextensionselectedcount.toInt(), prequestheaders, ulrequestheadercount.toInt(), presponseheaders, pulresponseheadercount)

public actual fun WebSocketCompleteAction(hwebsocket: WEB_SOCKET_HANDLE, pvactioncontext: Long, ulbytestransferred: UInt) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketCompleteAction(hwebsocket, pvactioncontext, ulbytestransferred.toInt())
}

public actual fun WebSocketCreateClientHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketCreateClientHandle(pproperties, ulpropertycount.toInt(), phwebsocket)

public actual fun WebSocketCreateServerHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketCreateServerHandle(pproperties, ulpropertycount.toInt(), phwebsocket)

public actual fun WebSocketDeleteHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketDeleteHandle(hwebsocket)
}

public actual fun WebSocketEndClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, presponseheaders: Long, ulreponseheadercount: UInt, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketEndClientHandshake(hwebsocket, presponseheaders, ulreponseheadercount.toInt(), pulselectedextensions, pulselectedextensioncount, pulselectedsubprotocol)

public actual fun WebSocketEndServerHandshake(hwebsocket: WEB_SOCKET_HANDLE): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketEndServerHandshake(hwebsocket)

public actual fun WebSocketGetAction(hwebsocket: WEB_SOCKET_HANDLE, eactionqueue: WEB_SOCKET_ACTION_QUEUE, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketGetAction(hwebsocket, eactionqueue, pdatabuffers, puldatabuffercount, paction, pbuffertype, pvapplicationcontext, pvactioncontext)

public actual fun WebSocketGetGlobalProperty(etype: WEB_SOCKET_PROPERTY_TYPE, pvvalue: Long, ulsize: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketGetGlobalProperty(etype, pvvalue, ulsize)

public actual fun WebSocketReceive(hwebsocket: WEB_SOCKET_HANDLE, pbuffer: Long, pvcontext: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketReceive(hwebsocket, pbuffer, pvcontext)

public actual fun WebSocketSend(hwebsocket: WEB_SOCKET_HANDLE, buffertype: WEB_SOCKET_BUFFER_TYPE, pbuffer: Long, context: Long): HRESULT =
    WindowsWin32NetworkingWebsocketJniBridge.windowssys_windows_win32_networking_websocket_WebSocketSend(hwebsocket, buffertype, pbuffer, context)
