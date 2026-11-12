package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr

public expect fun webSocketAbortHandle(hwebsocket: WebSocketHandle)

public expect fun webSocketBeginClientHandshake(hwebsocket: WebSocketHandle, pszsubprotocols: ConstPtr<Pcstr>, ulsubprotocolcount: UInt, pszextensions: ConstPtr<Pcstr>, ulextensioncount: UInt, pinitialheaders: ConstPtr<WebSocketHttpHeader>, ulinitialheadercount: UInt, padditionalheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, puladditionalheadercount: MutPtr<UInt>): Hresult

public expect fun webSocketBeginServerHandshake(hwebsocket: WebSocketHandle, pszsubprotocolselected: Pcstr, pszextensionselected: ConstPtr<Pcstr>, ulextensionselectedcount: UInt, prequestheaders: ConstPtr<WebSocketHttpHeader>, ulrequestheadercount: UInt, presponseheaders: MutPtr<MutPtr<WebSocketHttpHeader>>, pulresponseheadercount: MutPtr<UInt>): Hresult

public expect fun webSocketCompleteAction(hwebsocket: WebSocketHandle, pvactioncontext: ConstPtr<CVoid>, ulbytestransferred: UInt)

public expect fun webSocketCreateClientHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult

public expect fun webSocketCreateServerHandle(pproperties: ConstPtr<WebSocketProperty>, ulpropertycount: UInt, phwebsocket: MutPtr<WebSocketHandle>): Hresult

public expect fun webSocketDeleteHandle(hwebsocket: WebSocketHandle)

public expect fun webSocketEndClientHandshake(hwebsocket: WebSocketHandle, presponseheaders: ConstPtr<WebSocketHttpHeader>, ulreponseheadercount: UInt, pulselectedextensions: MutPtr<UInt>, pulselectedextensioncount: MutPtr<UInt>, pulselectedsubprotocol: MutPtr<UInt>): Hresult

public expect fun webSocketEndServerHandshake(hwebsocket: WebSocketHandle): Hresult

public expect fun webSocketGetAction(hwebsocket: WebSocketHandle, eactionqueue: WebSocketActionQueue, pdatabuffers: MutPtr<WebSocketBuffer>, puldatabuffercount: MutPtr<UInt>, paction: MutPtr<WebSocketAction>, pbuffertype: MutPtr<WebSocketBufferType>, pvapplicationcontext: MutPtr<MutPtr<CVoid>>, pvactioncontext: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun webSocketGetGlobalProperty(etype: WebSocketPropertyType, pvvalue: MutPtr<CVoid>, ulsize: MutPtr<UInt>): Hresult

public expect fun webSocketReceive(hwebsocket: WebSocketHandle, pbuffer: ConstPtr<WebSocketBuffer>, pvcontext: ConstPtr<CVoid>): Hresult

public expect fun webSocketSend(hwebsocket: WebSocketHandle, buffertype: WebSocketBufferType, pbuffer: ConstPtr<WebSocketBuffer>, context: ConstPtr<CVoid>): Hresult
