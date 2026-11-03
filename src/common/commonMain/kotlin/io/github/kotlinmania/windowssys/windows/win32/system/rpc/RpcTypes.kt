package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface CS_TAG_GETTING_ROUTINEFn {
    public operator fun invoke(hbinding: Long, fserverside: Int, pulsendingtag: Long, puldesiredreceivingtag: Long, pulreceivingtag: Long, pstatus: Long)
}

public typealias CS_TAG_GETTING_ROUTINE = CS_TAG_GETTING_ROUTINEFn?

public fun interface CS_TYPE_FROM_NETCS_ROUTINEFn {
    public operator fun invoke(hbinding: Long, ulnetworkcodeset: UInt, pnetworkdata: Long, ulnetworkdatalength: UInt, ullocalbuffersize: UInt, plocaldata: Long, pullocaldatalength: Long, pstatus: Long)
}

public typealias CS_TYPE_FROM_NETCS_ROUTINE = CS_TYPE_FROM_NETCS_ROUTINEFn?

public fun interface CS_TYPE_LOCAL_SIZE_ROUTINEFn {
    public operator fun invoke(hbinding: Long, ulnetworkcodeset: UInt, ulnetworkbuffersize: UInt, conversiontype: Long, pullocalbuffersize: Long, pstatus: Long)
}

public typealias CS_TYPE_LOCAL_SIZE_ROUTINE = CS_TYPE_LOCAL_SIZE_ROUTINEFn?

public fun interface CS_TYPE_NET_SIZE_ROUTINEFn {
    public operator fun invoke(hbinding: Long, ulnetworkcodeset: UInt, ullocalbuffersize: UInt, conversiontype: Long, pulnetworkbuffersize: Long, pstatus: Long)
}

public typealias CS_TYPE_NET_SIZE_ROUTINE = CS_TYPE_NET_SIZE_ROUTINEFn?

public fun interface CS_TYPE_TO_NETCS_ROUTINEFn {
    public operator fun invoke(hbinding: Long, ulnetworkcodeset: UInt, plocaldata: Long, ullocaldatalength: UInt, pnetworkdata: Long, pulnetworkdatalength: Long, pstatus: Long)
}

public typealias CS_TYPE_TO_NETCS_ROUTINE = CS_TYPE_TO_NETCS_ROUTINEFn?

public fun interface EXPR_EVALFn {
    public operator fun invoke(param0: Long)
}

public typealias EXPR_EVAL = EXPR_EVALFn?

public typealias EXPR_TOKEN = Int

public typealias ExtendedErrorParamTypes = Int

public fun interface GENERIC_BINDING_ROUTINEFn {
    public operator fun invoke(param0: Long): Long
}

public typealias GENERIC_BINDING_ROUTINE = GENERIC_BINDING_ROUTINEFn?

public fun interface GENERIC_UNBIND_ROUTINEFn {
    public operator fun invoke(param0: Long, param1: Long)
}

public typealias GENERIC_UNBIND_ROUTINE = GENERIC_UNBIND_ROUTINEFn?

public typealias GROUP_NAME_SYNTAX = UInt

public typealias IDL_CS_CONVERT = Int

public fun interface I_RpcFreeCalloutStateFnFn {
    public operator fun invoke(calloutstate: Long)
}

public typealias I_RpcFreeCalloutStateFn = I_RpcFreeCalloutStateFnFn?

public fun interface I_RpcPerformCalloutFnFn {
    public operator fun invoke(context: Long, calloutstate: Long, stage: RPC_HTTP_REDIRECTOR_STAGE): RPC_STATUS
}

public typealias I_RpcPerformCalloutFn = I_RpcPerformCalloutFnFn?

public fun interface I_RpcProxyFilterIfFnFn {
    public operator fun invoke(context: Long, ifuuid: Long, ifmajorversion: UShort, fallow: Long): RPC_STATUS
}

public typealias I_RpcProxyFilterIfFn = I_RpcProxyFilterIfFnFn?

public fun interface I_RpcProxyGetClientAddressFnFn {
    public operator fun invoke(context: Long, buffer: PCSTR, bufferlength: Long): RPC_STATUS
}

public typealias I_RpcProxyGetClientAddressFn = I_RpcProxyGetClientAddressFnFn?

public fun interface I_RpcProxyGetClientSessionAndResourceUUIDFn {
    public operator fun invoke(context: Long, sessionidpresent: Long, sessionid: Long, resourceidpresent: Long, resourceid: Long): RPC_STATUS
}

public typealias I_RpcProxyGetClientSessionAndResourceUUID = I_RpcProxyGetClientSessionAndResourceUUIDFn?

public fun interface I_RpcProxyGetConnectionTimeoutFnFn {
    public operator fun invoke(connectiontimeout: Long): RPC_STATUS
}

public typealias I_RpcProxyGetConnectionTimeoutFn = I_RpcProxyGetConnectionTimeoutFnFn?

public fun interface I_RpcProxyIsValidMachineFnFn {
    public operator fun invoke(machine: PCWSTR, dotmachine: PCWSTR, portnumber: UInt): RPC_STATUS
}

public typealias I_RpcProxyIsValidMachineFn = I_RpcProxyIsValidMachineFnFn?

public fun interface I_RpcProxyUpdatePerfCounterBackendServerFnFn {
    public operator fun invoke(machinename: Long, isconnectevent: Int)
}

public typealias I_RpcProxyUpdatePerfCounterBackendServerFn = I_RpcProxyUpdatePerfCounterBackendServerFnFn?

public fun interface I_RpcProxyUpdatePerfCounterFnFn {
    public operator fun invoke(counter: RpcPerfCounters, modifytrend: Int, size: UInt)
}

public typealias I_RpcProxyUpdatePerfCounterFn = I_RpcProxyUpdatePerfCounterFnFn?

public typealias LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION = Int

public fun interface MIDL_ES_ALLOCFn {
    public operator fun invoke(state: Long, pbuffer: Long, psize: Long)
}

public typealias MIDL_ES_ALLOC = MIDL_ES_ALLOCFn?

public typealias MIDL_ES_CODE = Int

public typealias MIDL_ES_HANDLE_STYLE = Int

public fun interface MIDL_ES_READFn {
    public operator fun invoke(state: Long, pbuffer: Long, psize: Long)
}

public typealias MIDL_ES_READ = MIDL_ES_READFn?

public fun interface MIDL_ES_WRITEFn {
    public operator fun invoke(state: Long, buffer: PCSTR, size: UInt)
}

public typealias MIDL_ES_WRITE = MIDL_ES_WRITEFn?

public typealias NDR_ALLOC_ALL_NODES_CONTEXT = Long

public fun interface NDR_NOTIFY2_ROUTINEFn {
    public operator fun invoke(flag: UByte)
}

public typealias NDR_NOTIFY2_ROUTINE = NDR_NOTIFY2_ROUTINEFn?

public fun interface NDR_NOTIFY_ROUTINEFn {
    public operator fun invoke()
}

public typealias NDR_NOTIFY_ROUTINE = NDR_NOTIFY_ROUTINEFn?

public typealias NDR_POINTER_QUEUE_STATE = Long

public fun interface NDR_RUNDOWNFn {
    public operator fun invoke(context: Long)
}

public typealias NDR_RUNDOWN = NDR_RUNDOWNFn?

public fun interface PFN_RPCNOTIFICATION_ROUTINEFn {
    public operator fun invoke(pasync: Long, context: Long, event: RPC_ASYNC_EVENT)
}

public typealias PFN_RPCNOTIFICATION_ROUTINE = PFN_RPCNOTIFICATION_ROUTINEFn?

public fun interface PFN_RPC_ALLOCATEFn {
    public operator fun invoke(param0: ULong): Long
}

public typealias PFN_RPC_ALLOCATE = PFN_RPC_ALLOCATEFn?

public fun interface PFN_RPC_FREEFn {
    public operator fun invoke(param0: Long)
}

public typealias PFN_RPC_FREE = PFN_RPC_FREEFn?

public typealias PNDR_ASYNC_MESSAGE = Long

public typealias PNDR_CORRELATION_INFO = Long

public typealias PROXY_PHASE = Int

public fun interface PRPC_RUNDOWNFn {
    public operator fun invoke(associationcontext: Long)
}

public typealias PRPC_RUNDOWN = PRPC_RUNDOWNFn?

public fun interface RPCLT_PDU_FILTER_FUNCFn {
    public operator fun invoke(buffer: Long, bufferlength: UInt, fdatagram: Int)
}

public typealias RPCLT_PDU_FILTER_FUNC = RPCLT_PDU_FILTER_FUNCFn?

public fun interface RPC_ADDRESS_CHANGE_FNFn {
    public operator fun invoke(arg: Long)
}

public typealias RPC_ADDRESS_CHANGE_FN = RPC_ADDRESS_CHANGE_FNFn?

public typealias RPC_ADDRESS_CHANGE_TYPE = Int

public typealias RPC_ASYNC_EVENT = Int

public fun interface RPC_AUTH_KEY_RETRIEVAL_FNFn {
    public operator fun invoke(arg: Long, serverprincname: PCWSTR, keyver: UInt, key: Long, status: Long)
}

public typealias RPC_AUTH_KEY_RETRIEVAL_FN = RPC_AUTH_KEY_RETRIEVAL_FNFn?

public typealias RPC_BINDING_HANDLE_OPTIONS_FLAGS = UInt

public fun interface RPC_BLOCKING_FNFn {
    public operator fun invoke(hwnd: Long, context: Long, hsyncevent: Long): RPC_STATUS
}

public typealias RPC_BLOCKING_FN = RPC_BLOCKING_FNFn?

public fun interface RPC_CLIENT_ALLOCFn {
    public operator fun invoke(size: ULong): Long
}

public typealias RPC_CLIENT_ALLOC = RPC_CLIENT_ALLOCFn?

public fun interface RPC_CLIENT_FREEFn {
    public operator fun invoke(ptr: Long)
}

public typealias RPC_CLIENT_FREE = RPC_CLIENT_FREEFn?

public typealias RPC_C_AUTHN_INFO_TYPE = UInt

public typealias RPC_C_HTTP_AUTHN_TARGET = UInt

public typealias RPC_C_HTTP_FLAGS = UInt

public typealias RPC_C_QOS_CAPABILITIES = UInt

public typealias RPC_C_QOS_IDENTITY = UInt

public fun interface RPC_DISPATCH_FUNCTIONFn {
    public operator fun invoke(message: Long)
}

public typealias RPC_DISPATCH_FUNCTION = RPC_DISPATCH_FUNCTIONFn?

public fun interface RPC_FORWARD_FUNCTIONFn {
    public operator fun invoke(interfaceid: Long, interfaceversion: Long, objectid: Long, rpcpro: Long, ppdestendpoint: Long): RPC_STATUS
}

public typealias RPC_FORWARD_FUNCTION = RPC_FORWARD_FUNCTIONFn?

public fun interface RPC_HTTP_PROXY_FREE_STRINGFn {
    public operator fun invoke(string: PCWSTR)
}

public typealias RPC_HTTP_PROXY_FREE_STRING = RPC_HTTP_PROXY_FREE_STRINGFn?

public typealias RPC_HTTP_REDIRECTOR_STAGE = Int

public fun interface RPC_IF_CALLBACK_FNFn {
    public operator fun invoke(interfaceuuid: Long, context: Long): RPC_STATUS
}

public typealias RPC_IF_CALLBACK_FN = RPC_IF_CALLBACK_FNFn?

public fun interface RPC_INTERFACE_GROUP_IDLE_CALLBACK_FNFn {
    public operator fun invoke(ifgroup: Long, idlecallbackcontext: Long, isgroupidle: UInt)
}

public typealias RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN = RPC_INTERFACE_GROUP_IDLE_CALLBACK_FNFn?

public fun interface RPC_MGMT_AUTHORIZATION_FNFn {
    public operator fun invoke(clientbinding: Long, requestedmgmtoperation: UInt, status: Long): Int
}

public typealias RPC_MGMT_AUTHORIZATION_FN = RPC_MGMT_AUTHORIZATION_FNFn?

public fun interface RPC_NEW_HTTP_PROXY_CHANNELFn {
    public operator fun invoke(redirectorstage: RPC_HTTP_REDIRECTOR_STAGE, servername: PCWSTR, serverport: PCWSTR, remoteuser: PCWSTR, authtype: PCWSTR, resourceuuid: Long, sessionid: Long, iface: Long, reserved: Long, flags: UInt, newservername: Long, newserverport: Long): RPC_STATUS
}

public typealias RPC_NEW_HTTP_PROXY_CHANNEL = RPC_NEW_HTTP_PROXY_CHANNELFn?

public typealias RPC_NOTIFICATIONS = Int

public typealias RPC_NOTIFICATION_TYPES = Int

public fun interface RPC_OBJECT_INQ_FNFn {
    public operator fun invoke(objectuuid: Long, typeuuid: Long, status: Long)
}

public typealias RPC_OBJECT_INQ_FN = RPC_OBJECT_INQ_FNFn?

public fun interface RPC_SECURITY_CALLBACK_FNFn {
    public operator fun invoke(context: Long)
}

public typealias RPC_SECURITY_CALLBACK_FN = RPC_SECURITY_CALLBACK_FNFn?

public fun interface RPC_SETFILTER_FUNCFn {
    public operator fun invoke(pfnfilter: RPCLT_PDU_FILTER_FUNC)
}

public typealias RPC_SETFILTER_FUNC = RPC_SETFILTER_FUNCFn?

public typealias RPC_STATUS = Int

public typealias RpcCallClientLocality = Int

public typealias RpcCallType = Int

public typealias RpcLocalAddressFormat = Int

public typealias RpcPerfCounters = Int

public typealias SEC_WINNT_AUTH_IDENTITY = UInt

public fun interface SERVER_ROUTINEFn {
    public operator fun invoke(): Int
}

public typealias SERVER_ROUTINE = SERVER_ROUTINEFn?

public typealias STUB_PHASE = Int

public fun interface STUB_THUNKFn {
    public operator fun invoke(param0: Long)
}

public typealias STUB_THUNK = STUB_THUNKFn?

public typealias USER_MARSHAL_CB_TYPE = Int

public fun interface USER_MARSHAL_FREEING_ROUTINEFn {
    public operator fun invoke(param0: Long, param1: Long)
}

public typealias USER_MARSHAL_FREEING_ROUTINE = USER_MARSHAL_FREEING_ROUTINEFn?

public fun interface USER_MARSHAL_MARSHALLING_ROUTINEFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long): Long
}

public typealias USER_MARSHAL_MARSHALLING_ROUTINE = USER_MARSHAL_MARSHALLING_ROUTINEFn?

public fun interface USER_MARSHAL_SIZING_ROUTINEFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long): UInt
}

public typealias USER_MARSHAL_SIZING_ROUTINE = USER_MARSHAL_SIZING_ROUTINEFn?

public fun interface USER_MARSHAL_UNMARSHALLING_ROUTINEFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long): Long
}

public typealias USER_MARSHAL_UNMARSHALLING_ROUTINE = USER_MARSHAL_UNMARSHALLING_ROUTINEFn?

public typealias XLAT_SIDE = Int

public fun interface XMIT_HELPER_ROUTINEFn {
    public operator fun invoke(param0: Long)
}

public typealias XMIT_HELPER_ROUTINE = XMIT_HELPER_ROUTINEFn?

public typealias _NDR_PROC_CONTEXT = Long

public typealias system_handle_t = Int
