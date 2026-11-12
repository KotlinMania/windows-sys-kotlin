package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun webSocketAbortHandle(hwebsocket: WebSocketHandle)

public expect fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr, ulsubprotocolcount: UInt, pszextensions: ConstPtr, ulextensioncount: UInt, pinitialheaders: ConstPtr, ulinitialheadercount: UInt, padditionalheaders: MutPtr, puladditionalheadercount: MutPtr): Hresult

public expect fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr, ulextensionselectedcount: UInt, prequestheaders: ConstPtr, ulrequestheadercount: UInt, presponseheaders: MutPtr, pulresponseheadercount: MutPtr): Hresult

public expect fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr, ulbytestransferred: UInt)

public expect fun webSocketCreateClientHandle(pproperties: ConstPtr, ulpropertycount: UInt, phwebsocket: MutPtr): Hresult

public expect fun webSocketCreateServerHandle(pproperties: ConstPtr, ulpropertycount: UInt, phwebsocket: MutPtr): Hresult

public expect fun webSocketDeleteHandle(hwebsocket: WebSocketHandle)

public expect fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr, ulreponseheadercount: UInt, pulselectedextensions: MutPtr, pulselectedextensioncount: MutPtr, pulselectedsubprotocol: MutPtr): Hresult

public expect fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult

public expect fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr, puldatabuffercount: MutPtr, paction: MutPtr, pbuffertype: MutPtr, pvapplicationcontext: MutPtr, pvactioncontext: MutPtr): Hresult

public expect fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr, ulsize: MutPtr): Hresult

public expect fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr, pvcontext: ConstPtr): Hresult

public expect fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr, context: ConstPtr): Hresult
