package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR

public fun WebSocketAbortHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    Win32DynamicFfi.invoke("websocket.dll", "WebSocketAbortHandle", longArrayOf(hwebsocket))
}

public fun WebSocketBeginClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocols: Long, ulsubprotocolcount: UInt, pszextensions: Long, ulextensioncount: UInt, pinitialheaders: Long, ulinitialheadercount: UInt, padditionalheaders: Long, puladditionalheadercount: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketBeginClientHandshake", longArrayOf(hwebsocket, pszsubprotocols, ulsubprotocolcount.toLong(), pszextensions, ulextensioncount.toLong(), pinitialheaders, ulinitialheadercount.toLong(), padditionalheaders, puladditionalheadercount)).toInt()
}

public fun WebSocketBeginServerHandshake(hwebsocket: WEB_SOCKET_HANDLE, pszsubprotocolselected: PCSTR, pszextensionselected: Long, ulextensionselectedcount: UInt, prequestheaders: Long, ulrequestheadercount: UInt, presponseheaders: Long, pulresponseheadercount: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketBeginServerHandshake", longArrayOf(hwebsocket, pszsubprotocolselected, pszextensionselected, ulextensionselectedcount.toLong(), prequestheaders, ulrequestheadercount.toLong(), presponseheaders, pulresponseheadercount)).toInt()
}

public fun WebSocketCompleteAction(hwebsocket: WEB_SOCKET_HANDLE, pvactioncontext: Long, ulbytestransferred: UInt) {
    Win32DynamicFfi.invoke("websocket.dll", "WebSocketCompleteAction", longArrayOf(hwebsocket, pvactioncontext, ulbytestransferred.toLong()))
}

public fun WebSocketCreateClientHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketCreateClientHandle", longArrayOf(pproperties, ulpropertycount.toLong(), phwebsocket)).toInt()
}

public fun WebSocketCreateServerHandle(pproperties: Long, ulpropertycount: UInt, phwebsocket: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketCreateServerHandle", longArrayOf(pproperties, ulpropertycount.toLong(), phwebsocket)).toInt()
}

public fun WebSocketDeleteHandle(hwebsocket: WEB_SOCKET_HANDLE) {
    Win32DynamicFfi.invoke("websocket.dll", "WebSocketDeleteHandle", longArrayOf(hwebsocket))
}

public fun WebSocketEndClientHandshake(hwebsocket: WEB_SOCKET_HANDLE, presponseheaders: Long, ulreponseheadercount: UInt, pulselectedextensions: Long, pulselectedextensioncount: Long, pulselectedsubprotocol: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketEndClientHandshake", longArrayOf(hwebsocket, presponseheaders, ulreponseheadercount.toLong(), pulselectedextensions, pulselectedextensioncount, pulselectedsubprotocol)).toInt()
}

public fun WebSocketEndServerHandshake(hwebsocket: WEB_SOCKET_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketEndServerHandshake", longArrayOf(hwebsocket)).toInt()
}

public fun WebSocketGetAction(hwebsocket: WEB_SOCKET_HANDLE, eactionqueue: WEB_SOCKET_ACTION_QUEUE, pdatabuffers: Long, puldatabuffercount: Long, paction: Long, pbuffertype: Long, pvapplicationcontext: Long, pvactioncontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketGetAction", longArrayOf(hwebsocket, eactionqueue.toLong(), pdatabuffers, puldatabuffercount, paction, pbuffertype, pvapplicationcontext, pvactioncontext)).toInt()
}

public fun WebSocketGetGlobalProperty(etype: WEB_SOCKET_PROPERTY_TYPE, pvvalue: Long, ulsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketGetGlobalProperty", longArrayOf(etype.toLong(), pvvalue, ulsize)).toInt()
}

public fun WebSocketReceive(hwebsocket: WEB_SOCKET_HANDLE, pbuffer: Long, pvcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketReceive", longArrayOf(hwebsocket, pbuffer, pvcontext)).toInt()
}

public fun WebSocketSend(hwebsocket: WEB_SOCKET_HANDLE, buffertype: WEB_SOCKET_BUFFER_TYPE, pbuffer: Long, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("websocket.dll", "WebSocketSend", longArrayOf(hwebsocket, buffertype.toLong(), pbuffer, context)).toInt()
}
