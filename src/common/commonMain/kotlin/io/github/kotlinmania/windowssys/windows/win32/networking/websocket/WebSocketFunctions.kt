package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun webSocketAbortHandle(hwebsocket: WebSocketHandle)

public expect fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: COpaquePointer?, ulsubprotocolcount: UInt, pszextensions: COpaquePointer?, ulextensioncount: UInt, pinitialheaders: COpaquePointer?, ulinitialheadercount: UInt, padditionalheaders: COpaquePointer?, puladditionalheadercount: COpaquePointer?): Hresult

public expect fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: COpaquePointer?, ulextensionselectedcount: UInt, prequestheaders: COpaquePointer?, ulrequestheadercount: UInt, presponseheaders: COpaquePointer?, pulresponseheadercount: COpaquePointer?): Hresult

public expect fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: COpaquePointer?, ulbytestransferred: UInt)

public expect fun webSocketCreateClientHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult

public expect fun webSocketCreateServerHandle(pproperties: COpaquePointer?, ulpropertycount: UInt, phwebsocket: COpaquePointer?): Hresult

public expect fun webSocketDeleteHandle(hwebsocket: WebSocketHandle)

public expect fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: COpaquePointer?, ulreponseheadercount: UInt, pulselectedextensions: COpaquePointer?, pulselectedextensioncount: COpaquePointer?, pulselectedsubprotocol: COpaquePointer?): Hresult

public expect fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult

public expect fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: COpaquePointer?, puldatabuffercount: COpaquePointer?, paction: COpaquePointer?, pbuffertype: COpaquePointer?, pvapplicationcontext: COpaquePointer?, pvactioncontext: COpaquePointer?): Hresult

public expect fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: COpaquePointer?, ulsize: COpaquePointer?): Hresult

public expect fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: COpaquePointer?, pvcontext: COpaquePointer?): Hresult

public expect fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: COpaquePointer?, context: COpaquePointer?): Hresult
