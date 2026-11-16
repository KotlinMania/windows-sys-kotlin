package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public fun interface CsTagGettingRoutineFn {
    public operator fun invoke(hbinding: MutPtr, fserverside: Int, pulsendingtag: MutPtr, puldesiredreceivingtag: MutPtr, pulreceivingtag: MutPtr, pstatus: MutPtr)
}

public typealias CsTagGettingRoutine = CsTagGettingRoutineFn?

public fun interface CsTypeFromNetcsRoutineFn {
    public operator fun invoke(hbinding: MutPtr, ulnetworkcodeset: UInt, pnetworkdata: MutPtr, ulnetworkdatalength: UInt, ullocalbuffersize: UInt, plocaldata: MutPtr, pullocaldatalength: MutPtr, pstatus: MutPtr)
}

public typealias CsTypeFromNetcsRoutine = CsTypeFromNetcsRoutineFn?

public fun interface CsTypeLocalSizeRoutineFn {
    public operator fun invoke(hbinding: MutPtr, ulnetworkcodeset: UInt, ulnetworkbuffersize: UInt, conversiontype: MutPtr, pullocalbuffersize: MutPtr, pstatus: MutPtr)
}

public typealias CsTypeLocalSizeRoutine = CsTypeLocalSizeRoutineFn?

public fun interface CsTypeNetSizeRoutineFn {
    public operator fun invoke(hbinding: MutPtr, ulnetworkcodeset: UInt, ullocalbuffersize: UInt, conversiontype: MutPtr, pulnetworkbuffersize: MutPtr, pstatus: MutPtr)
}

public typealias CsTypeNetSizeRoutine = CsTypeNetSizeRoutineFn?

public fun interface CsTypeToNetcsRoutineFn {
    public operator fun invoke(hbinding: MutPtr, ulnetworkcodeset: UInt, plocaldata: MutPtr, ullocaldatalength: UInt, pnetworkdata: MutPtr, pulnetworkdatalength: MutPtr, pstatus: MutPtr)
}

public typealias CsTypeToNetcsRoutine = CsTypeToNetcsRoutineFn?

public fun interface ExprEvalFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias ExprEval = ExprEvalFn?

public typealias ExprToken = Int

public typealias ExtendedErrorParamTypes = Int

public fun interface GenericBindingRoutineFn {
    public operator fun invoke(param0: MutPtr): MutPtr
}

public typealias GenericBindingRoutine = GenericBindingRoutineFn?

public fun interface GenericUnbindRoutineFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr)
}

public typealias GenericUnbindRoutine = GenericUnbindRoutineFn?

public typealias GroupNameSyntax = UInt

public typealias IdlCsConvert = Int

public fun interface IRpcFreeCalloutStateFnFn {
    public operator fun invoke(calloutstate: MutPtr)
}

public typealias IRpcFreeCalloutStateFn = IRpcFreeCalloutStateFnFn?

public fun interface IRpcPerformCalloutFnFn {
    public operator fun invoke(context: MutPtr, calloutstate: MutPtr, stage: RpcHttpRedirectorStage): RpcStatus
}

public typealias IRpcPerformCalloutFn = IRpcPerformCalloutFnFn?

public fun interface IRpcProxyFilterIfFnFn {
    public operator fun invoke(context: ConstPtr, ifuuid: ConstPtr, ifmajorversion: UShort, fallow: MutPtr): RpcStatus
}

public typealias IRpcProxyFilterIfFn = IRpcProxyFilterIfFnFn?

public fun interface IRpcProxyGetClientAddressFnFn {
    public operator fun invoke(context: MutPtr, buffer: Pcstr, bufferlength: MutPtr): RpcStatus
}

public typealias IRpcProxyGetClientAddressFn = IRpcProxyGetClientAddressFnFn?

public fun interface IRpcProxyGetClientSessionAndResourceUuidFn {
    public operator fun invoke(context: ConstPtr, sessionidpresent: MutPtr, sessionid: MutPtr, resourceidpresent: MutPtr, resourceid: MutPtr): RpcStatus
}

public typealias IRpcProxyGetClientSessionAndResourceUuid = IRpcProxyGetClientSessionAndResourceUuidFn?

public fun interface IRpcProxyGetConnectionTimeoutFnFn {
    public operator fun invoke(connectiontimeout: MutPtr): RpcStatus
}

public typealias IRpcProxyGetConnectionTimeoutFn = IRpcProxyGetConnectionTimeoutFnFn?

public fun interface IRpcProxyIsValidMachineFnFn {
    public operator fun invoke(machine: Pcwstr, dotmachine: Pcwstr, portnumber: UInt): RpcStatus
}

public typealias IRpcProxyIsValidMachineFn = IRpcProxyIsValidMachineFnFn?

public fun interface IRpcProxyUpdatePerfCounterBackendServerFnFn {
    public operator fun invoke(machinename: ConstPtr, isconnectevent: Int)
}

public typealias IRpcProxyUpdatePerfCounterBackendServerFn = IRpcProxyUpdatePerfCounterBackendServerFnFn?

public fun interface IRpcProxyUpdatePerfCounterFnFn {
    public operator fun invoke(counter: RpcPerfCounters, modifytrend: Int, size: UInt)
}

public typealias IRpcProxyUpdatePerfCounterFn = IRpcProxyUpdatePerfCounterFnFn?

public typealias LrpcSystemHandleMarshalDirection = Int

public fun interface MidlEsAllocFn {
    public operator fun invoke(state: MutPtr, pbuffer: MutPtr, psize: MutPtr)
}

public typealias MidlEsAlloc = MidlEsAllocFn?

public typealias MidlEsCode = Int

public typealias MidlEsHandleStyle = Int

public fun interface MidlEsReadFn {
    public operator fun invoke(state: MutPtr, pbuffer: MutPtr, psize: MutPtr)
}

public typealias MidlEsRead = MidlEsReadFn?

public fun interface MidlEsWriteFn {
    public operator fun invoke(state: MutPtr, buffer: Pcstr, size: UInt)
}

public typealias MidlEsWrite = MidlEsWriteFn?

public typealias NdrAllocAllNodesContext = Long

public fun interface NdrNotify2RoutineFn {
    public operator fun invoke(flag: UByte)
}

public typealias NdrNotify2Routine = NdrNotify2RoutineFn?

public fun interface NdrNotifyRoutineFn {
    public operator fun invoke()
}

public typealias NdrNotifyRoutine = NdrNotifyRoutineFn?

public typealias NdrPointerQueueState = Long

public fun interface NdrRundownFn {
    public operator fun invoke(context: MutPtr)
}

public typealias NdrRundown = NdrRundownFn?

public fun interface PfnRpcnotificationRoutineFn {
    public operator fun invoke(pasync: MutPtr, context: MutPtr, event: RpcAsyncEvent)
}

public typealias PfnRpcnotificationRoutine = PfnRpcnotificationRoutineFn?

public fun interface PfnRpcAllocateFn {
    public operator fun invoke(param0: ULong): MutPtr
}

public typealias PfnRpcAllocate = PfnRpcAllocateFn?

public fun interface PfnRpcFreeFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias PfnRpcFree = PfnRpcFreeFn?

public typealias PndrAsyncMessage = Long

public typealias PndrCorrelationInfo = Long

public typealias ProxyPhase = Int

public fun interface PrpcRundownFn {
    public operator fun invoke(associationcontext: MutPtr)
}

public typealias PrpcRundown = PrpcRundownFn?

public fun interface RpcltPduFilterFuncFn {
    public operator fun invoke(buffer: MutPtr, bufferlength: UInt, fdatagram: Int)
}

public typealias RpcltPduFilterFunc = RpcltPduFilterFuncFn?

public fun interface RpcAddressChangeFnFn {
    public operator fun invoke(arg: MutPtr)
}

public typealias RpcAddressChangeFn = RpcAddressChangeFnFn?

public typealias RpcAddressChangeType = Int

public typealias RpcAsyncEvent = Int

public fun interface RpcAuthKeyRetrievalFnFn {
    public operator fun invoke(arg: ConstPtr, serverprincname: Pcwstr, keyver: UInt, key: MutPtr, status: MutPtr)
}

public typealias RpcAuthKeyRetrievalFn = RpcAuthKeyRetrievalFnFn?

public typealias RpcBindingHandleOptionsFlags = UInt

public fun interface RpcBlockingFnFn {
    public operator fun invoke(hwnd: MutPtr, context: MutPtr, hsyncevent: MutPtr): RpcStatus
}

public typealias RpcBlockingFn = RpcBlockingFnFn?

public fun interface RpcClientAllocFn {
    public operator fun invoke(size: ULong): MutPtr
}

public typealias RpcClientAlloc = RpcClientAllocFn?

public fun interface RpcClientFreeFn {
    public operator fun invoke(ptr: ConstPtr)
}

public typealias RpcClientFree = RpcClientFreeFn?

public typealias RpcCAuthnInfoType = UInt

public typealias RpcCHttpAuthnTarget = UInt

public typealias RpcCHttpFlags = UInt

public typealias RpcCQosCapabilities = UInt

public typealias RpcCQosIdentity = UInt

public fun interface RpcDispatchFunctionFn {
    public operator fun invoke(message: MutPtr)
}

public typealias RpcDispatchFunction = RpcDispatchFunctionFn?

public fun interface RpcForwardFunctionFn {
    public operator fun invoke(interfaceid: MutPtr, interfaceversion: MutPtr, objectid: MutPtr, rpcpro: MutPtr, ppdestendpoint: MutPtr): RpcStatus
}

public typealias RpcForwardFunction = RpcForwardFunctionFn?

public fun interface RpcHttpProxyFreeStringFn {
    public operator fun invoke(string: Pcwstr)
}

public typealias RpcHttpProxyFreeString = RpcHttpProxyFreeStringFn?

public typealias RpcHttpRedirectorStage = Int

public fun interface RpcIfCallbackFnFn {
    public operator fun invoke(interfaceuuid: ConstPtr, context: ConstPtr): RpcStatus
}

public typealias RpcIfCallbackFn = RpcIfCallbackFnFn?

public fun interface RpcInterfaceGroupIdleCallbackFnFn {
    public operator fun invoke(ifgroup: ConstPtr, idlecallbackcontext: ConstPtr, isgroupidle: UInt)
}

public typealias RpcInterfaceGroupIdleCallbackFn = RpcInterfaceGroupIdleCallbackFnFn?

public fun interface RpcMgmtAuthorizationFnFn {
    public operator fun invoke(clientbinding: ConstPtr, requestedmgmtoperation: UInt, status: MutPtr): Int
}

public typealias RpcMgmtAuthorizationFn = RpcMgmtAuthorizationFnFn?

public fun interface RpcNewHttpProxyChannelFn {
    public operator fun invoke(redirectorstage: RpcHttpRedirectorStage, servername: Pcwstr, serverport: Pcwstr, remoteuser: Pcwstr, authtype: Pcwstr, resourceuuid: MutPtr, sessionid: MutPtr, iface: ConstPtr, reserved: ConstPtr, flags: UInt, newservername: MutPtr, newserverport: MutPtr): RpcStatus
}

public typealias RpcNewHttpProxyChannel = RpcNewHttpProxyChannelFn?

public typealias RpcNotifications = Int

public typealias RpcNotificationTypes = Int

public fun interface RpcObjectInqFnFn {
    public operator fun invoke(objectuuid: ConstPtr, typeuuid: MutPtr, status: MutPtr)
}

public typealias RpcObjectInqFn = RpcObjectInqFnFn?

public fun interface RpcSecurityCallbackFnFn {
    public operator fun invoke(context: ConstPtr)
}

public typealias RpcSecurityCallbackFn = RpcSecurityCallbackFnFn?

public fun interface RpcSetfilterFuncFn {
    public operator fun invoke(pfnfilter: RpcltPduFilterFunc)
}

public typealias RpcSetfilterFunc = RpcSetfilterFuncFn?

public typealias RpcStatus = Int

public typealias RpcCallClientLocality = Int

public typealias RpcCallType = Int

public typealias RpcLocalAddressFormat = Int

public typealias RpcPerfCounters = Int

public typealias SecWinntAuthIdentity = UInt

public fun interface ServerRoutineFn {
    public operator fun invoke(): Int
}

public typealias ServerRoutine = ServerRoutineFn?

public typealias StubPhase = Int

public fun interface StubThunkFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias StubThunk = StubThunkFn?

public typealias UserMarshalCbType = Int

public fun interface UserMarshalFreeingRoutineFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr)
}

public typealias UserMarshalFreeingRoutine = UserMarshalFreeingRoutineFn?

public fun interface UserMarshalMarshallingRoutineFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr): MutPtr
}

public typealias UserMarshalMarshallingRoutine = UserMarshalMarshallingRoutineFn?

public fun interface UserMarshalSizingRoutineFn {
    public operator fun invoke(param0: MutPtr, param1: UInt, param2: MutPtr): UInt
}

public typealias UserMarshalSizingRoutine = UserMarshalSizingRoutineFn?

public fun interface UserMarshalUnmarshallingRoutineFn {
    public operator fun invoke(param0: MutPtr, param1: MutPtr, param2: MutPtr): MutPtr
}

public typealias UserMarshalUnmarshallingRoutine = UserMarshalUnmarshallingRoutineFn?

public typealias XlatSide = Int

public fun interface XmitHelperRoutineFn {
    public operator fun invoke(param0: MutPtr)
}

public typealias XmitHelperRoutine = XmitHelperRoutineFn?

public typealias NdrProcContext = Long

public typealias SystemHandleT = Int
