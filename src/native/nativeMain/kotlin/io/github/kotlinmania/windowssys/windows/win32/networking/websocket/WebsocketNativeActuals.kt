@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketReceive
import io.github.kotlinmania.windowssys.windows.win32.networking.websocket.cinterop.windowssysWindowsWin32NetworkingWebsocketWebSocketSend
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun webSocketAbortHandle(hwebsocket: WebSocketHandle) {
    windowssysWindowsWin32NetworkingWebsocketWebSocketAbortHandle(hwebsocket.rawAddress.toCPointer<ByteVar>())
}

public actual fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr<Pcstr>, ulsubprotocolcount: UInt, pszextensions: ConstPtr<Pcstr>, ulextensioncount: UInt, pinitialheaders: ConstPtr<WebSocketHttpHeader>, ulinitialheadercount: UInt, padditionalheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, puladditionalheadercount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketBeginClientHandshake(hwebsocket.rawAddress.toCPointer<ByteVar>(), pszsubprotocols.rawAddress.toCPointer<ByteVar>(), ulsubprotocolcount, pszextensions.rawAddress.toCPointer<ByteVar>(), ulextensioncount, pinitialheaders.rawAddress.toCPointer<ByteVar>(), ulinitialheadercount, padditionalheaders.rawAddress.toCPointer<ByteVar>(), puladditionalheadercount.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr<Pcstr>, ulextensionselectedcount: UInt, prequestheaders: ConstPtr<WebSocketHttpHeader>, ulrequestheadercount: UInt, presponseheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, pulresponseheadercount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketBeginServerHandshake(hwebsocket.rawAddress.toCPointer<ByteVar>(), pszsubprotocolselected.rawAddress.toCPointer<ByteVar>(), pszextensionselected.rawAddress.toCPointer<ByteVar>(), ulextensionselectedcount, prequestheaders.rawAddress.toCPointer<ByteVar>(), ulrequestheadercount, presponseheaders.rawAddress.toCPointer<ByteVar>(), pulresponseheadercount.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr<CVoid>, ulbytestransferred: UInt) {
    windowssysWindowsWin32NetworkingWebsocketWebSocketCompleteAction(hwebsocket.rawAddress.toCPointer<ByteVar>(), pvactioncontext.rawAddress.toCPointer<ByteVar>(), ulbytestransferred)
}

public actual fun webSocketCreateClientHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketCreateClientHandle(pproperties.rawAddress.toCPointer<ByteVar>(), ulpropertycount, phwebsocket.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketCreateServerHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketCreateServerHandle(pproperties.rawAddress.toCPointer<ByteVar>(), ulpropertycount, phwebsocket.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketDeleteHandle(hwebsocket: WebSocketHandle) {
    windowssysWindowsWin32NetworkingWebsocketWebSocketDeleteHandle(hwebsocket.rawAddress.toCPointer<ByteVar>())
}

public actual fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr<WebSocketHttpHeader>, ulreponseheadercount: UInt, pulselectedextensions: MutPtr<UInt>, pulselectedextensioncount: MutPtr<UInt>, pulselectedsubprotocol: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketEndClientHandshake(hwebsocket.rawAddress.toCPointer<ByteVar>(), presponseheaders.rawAddress.toCPointer<ByteVar>(), ulreponseheadercount, pulselectedextensions.rawAddress.toCPointer<ByteVar>(), pulselectedextensioncount.rawAddress.toCPointer<ByteVar>(), pulselectedsubprotocol.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketEndServerHandshake(hwebsocket.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr<WebSocketBuffer>, puldatabuffercount: MutPtr<UInt>, paction: MutPtr<WebSocketAction>, pbuffertype: MutPtr<WebSocketBufferType>, pvapplicationcontext: MutPtr<MutPtr<CVoid>>, pvactioncontext: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketGetAction(hwebsocket.rawAddress.toCPointer<ByteVar>(), eactionqueue, pdatabuffers.rawAddress.toCPointer<ByteVar>(), puldatabuffercount.rawAddress.toCPointer<ByteVar>(), paction.rawAddress.toCPointer<ByteVar>(), pbuffertype.rawAddress.toCPointer<ByteVar>(), pvapplicationcontext.rawAddress.toCPointer<ByteVar>(), pvactioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr<CVoid>, ulsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketGetGlobalProperty(etype, pvvalue.rawAddress.toCPointer<ByteVar>(), ulsize.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr<WebSocketBuffer>, pvcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketReceive(hwebsocket.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>())

public actual fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr<WebSocketBuffer>, context: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32NetworkingWebsocketWebSocketSend(hwebsocket.rawAddress.toCPointer<ByteVar>(), buffertype, pbuffer.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())
