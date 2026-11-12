@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

private object WindowsWin32NetworkingWebsocketJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(hwebsocket: Long, pszsubprotocols: Long, ulsubprotocolcount: Int, pszextensions: Long, ulextensioncount: Int, pinitialheaders: Long, ulinitialheadercount: Int, padditionalheaders: Long, puladditionalheadercount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(hwebsocket: Long, pszsubprotocolselected: Long, pszextensionselected: Long, ulextensionselectedcount: Int, prequestheaders: Long, ulrequestheadercount: Int, presponseheaders: Long, pulresponseheadercount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(hwebsocket: Long, pvactioncontext: Long, ulbytestransferred: Int)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(pproperties: Long, ulpropertycount: Int, phwebsocket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(hwebsocket: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(hwebsocket: Long, presponseheaders: Long, ulreponseheadercount: Int, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(hwebsocket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(hwebsocket: Long, eactionqueue: Int, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(etype: Int, pvvalue: Long, ulsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(hwebsocket: Long, pbuffer: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWebsocketWebSocketSend(hwebsocket: Long, buffertype: Int, pbuffer: Long, context: Long): Int
}

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(hwebsocket.rawAddress)
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr<Pcstr>, ulsubprotocolcount: UInt, pszextensions: ConstPtr<Pcstr>, ulextensioncount: UInt, pinitialheaders: ConstPtr<WebSocketHttpHeader>, ulinitialheadercount: UInt, padditionalheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, puladditionalheadercount: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(hwebsocket.rawAddress, pszsubprotocols.rawAddress, ulsubprotocolcount.toInt(), pszextensions.rawAddress, ulextensioncount.toInt(), pinitialheaders.rawAddress, ulinitialheadercount.toInt(), padditionalheaders.rawAddress, puladditionalheadercount.rawAddress)

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr<Pcstr>, ulextensionselectedcount: UInt, prequestheaders: ConstPtr<WebSocketHttpHeader>, ulrequestheadercount: UInt, presponseheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, pulresponseheadercount: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(hwebsocket.rawAddress, pszsubprotocolselected.rawAddress, pszextensionselected.rawAddress, ulextensionselectedcount.toInt(), prequestheaders.rawAddress, ulrequestheadercount.toInt(), presponseheaders.rawAddress, pulresponseheadercount.rawAddress)

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr<CVoid>, ulbytestransferred: UInt) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(hwebsocket.rawAddress, pvactioncontext.rawAddress, ulbytestransferred.toInt())
}

public actual fun webSocketCreateClientHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(pproperties.rawAddress, ulpropertycount.toInt(), phwebsocket.rawAddress)

public actual fun webSocketCreateServerHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(pproperties.rawAddress, ulpropertycount.toInt(), phwebsocket.rawAddress)

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(hwebsocket.rawAddress)
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr<WebSocketHttpHeader>, ulreponseheadercount: UInt, pulselectedextensions: MutPtr<UInt>, pulselectedextensioncount: MutPtr<UInt>, pulselectedsubprotocol: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(hwebsocket.rawAddress, presponseheaders.rawAddress, ulreponseheadercount.toInt(), pulselectedextensions.rawAddress, pulselectedextensioncount.rawAddress, pulselectedsubprotocol.rawAddress)

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(hwebsocket.rawAddress)

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr<WebSocketBuffer>, puldatabuffercount: MutPtr<UInt>, paction: MutPtr<WebSocketAction>, pbuffertype: MutPtr<WebSocketBufferType>, pvapplicationcontext: MutPtr<MutPtr<CVoid>>, pvactioncontext: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(hwebsocket.rawAddress, eactionqueue, pdatabuffers.rawAddress, puldatabuffercount.rawAddress, paction.rawAddress, pbuffertype.rawAddress, pvapplicationcontext.rawAddress, pvactioncontext.rawAddress)

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr<CVoid>, ulsize: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(etype, pvvalue.rawAddress, ulsize.rawAddress)

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr<WebSocketBuffer>, pvcontext: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(hwebsocket.rawAddress, pbuffer.rawAddress, pvcontext.rawAddress)

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr<WebSocketBuffer>, context: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkingWebsocketJniBridge.windowssysWindowsWin32NetworkingWebsocketWebSocketSend(hwebsocket.rawAddress, buffertype, pbuffer.rawAddress, context.rawAddress)
