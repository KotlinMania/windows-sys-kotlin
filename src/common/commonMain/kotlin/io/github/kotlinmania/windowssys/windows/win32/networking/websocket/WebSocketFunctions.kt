package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR

public expect fun WebSocketAbortHandle(hwebsocket: WEB_SOCKET_HANDLE)

public expect fun WebSocketBeginClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocols: Long, ulsubprotocolcount: UInt, pszextensions: Long, ulextensioncount: UInt, pinitialheaders: Long, ulinitialheadercount: UInt, padditionalheaders: Long, puladditionalheadercount: Long): HRESULT

public expect fun WebSocketBeginServerHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocolselected: PCSTR, pszextensionselected: Long, ulextensionselectedcount: UInt, prequestheaders: Long, ulrequestheadercount: UInt, presponseheaders: Long, pulresponseheadercount: Long): HRESULT

public expect fun WebSocketCompleteAction(hwebsocket: WEB_SOCKET_HANDLE, pvactioncontext: Long, ulbytestransferred: UInt)

public expect fun WebSocketCreateClientHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT

public expect fun WebSocketCreateServerHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT

public expect fun WebSocketDeleteHandle(hwebsocket: WEB_SOCKET_HANDLE)

public expect fun WebSocketEndClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, presponseheaders: Long, ulreponseheadercount: UInt, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): HRESULT

public expect fun WebSocketEndServerHandshake(hwebsocket: WEB_SOCKET_HANDLE): HRESULT

public expect fun WebSocketGetAction(hwebsocket: WEB_SOCKET_HANDLE, eactionqueue: WEB_SOCKET_ACTION_QUEUE, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): HRESULT

public expect fun WebSocketGetGlobalProperty(etype: WEB_SOCKET_PROPERTY_TYPE, pvvalue: Long, ulsize: Long): HRESULT

public expect fun WebSocketReceive(hwebsocket: WEB_SOCKET_HANDLE, pbuffer: Long, pvcontext: Long): HRESULT

public expect fun WebSocketSend(hwebsocket: WEB_SOCKET_HANDLE, buffertype: WEB_SOCKET_BUFFER_TYPE, pbuffer: Long, context: Long): HRESULT
