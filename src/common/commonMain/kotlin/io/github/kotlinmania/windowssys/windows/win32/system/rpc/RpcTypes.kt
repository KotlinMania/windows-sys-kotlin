package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public fun interface CsTagGettingRoutineFn {
    public operator fun invoke(hbinding: MutPtr<CVoid>, fserverside: Int, pulsendingtag: MutPtr<UInt>, puldesiredreceivingtag: MutPtr<UInt>, pulreceivingtag: MutPtr<UInt>, pstatus: MutPtr<UInt>)
}

public typealias CsTagGettingRoutine = CsTagGettingRoutineFn?

public fun interface CsTypeFromNetcsRoutineFn {
    public operator fun invoke(hbinding: MutPtr<CVoid>, ulnetworkcodeset: UInt, pnetworkdata: MutPtr<UByte>, ulnetworkdatalength: UInt, ullocalbuffersize: UInt, plocaldata: MutPtr<CVoid>, pullocaldatalength: MutPtr<UInt>, pstatus: MutPtr<UInt>)
}

public typealias CsTypeFromNetcsRoutine = CsTypeFromNetcsRoutineFn?

public fun interface CsTypeLocalSizeRoutineFn {
    public operator fun invoke(hbinding: MutPtr<CVoid>, ulnetworkcodeset: UInt, ulnetworkbuffersize: UInt, conversiontype: MutPtr<IdlCsConvert>, pullocalbuffersize: MutPtr<UInt>, pstatus: MutPtr<UInt>)
}

public typealias CsTypeLocalSizeRoutine = CsTypeLocalSizeRoutineFn?

public fun interface CsTypeNetSizeRoutineFn {
    public operator fun invoke(hbinding: MutPtr<CVoid>, ulnetworkcodeset: UInt, ullocalbuffersize: UInt, conversiontype: MutPtr<IdlCsConvert>, pulnetworkbuffersize: MutPtr<UInt>, pstatus: MutPtr<UInt>)
}

public typealias CsTypeNetSizeRoutine = CsTypeNetSizeRoutineFn?

public fun interface CsTypeToNetcsRoutineFn {
    public operator fun invoke(hbinding: MutPtr<CVoid>, ulnetworkcodeset: UInt, plocaldata: MutPtr<CVoid>, ullocaldatalength: UInt, pnetworkdata: MutPtr<UByte>, pulnetworkdatalength: MutPtr<UInt>, pstatus: MutPtr<UInt>)
}

public typealias CsTypeToNetcsRoutine = CsTypeToNetcsRoutineFn?

public fun interface ExprEvalFn {
    public operator fun invoke(param0: MutPtr<MidlStubMessage>)
}

public typealias ExprEval = ExprEvalFn?

public typealias ExprToken = Int

public typealias ExtendedErrorParamTypes = Int

public fun interface GenericBindingRoutineFn {
    public operator fun invoke(param0: MutPtr<CVoid>): MutPtr<CVoid>
}

public typealias GenericBindingRoutine = GenericBindingRoutineFn?

public fun interface GenericUnbindRoutineFn {
    public operator fun invoke(param0: MutPtr<CVoid>, param1: MutPtr<UByte>)
}

public typealias GenericUnbindRoutine = GenericUnbindRoutineFn?

public typealias GroupNameSyntax = UInt

public typealias IdlCsConvert = Int

public fun interface IRpcFreeCalloutStateFnFn {
    public operator fun invoke(calloutstate: MutPtr<RdrCalloutState>)
}

public typealias IRpcFreeCalloutStateFn = IRpcFreeCalloutStateFnFn?

public fun interface IRpcPerformCalloutFnFn {
    public operator fun invoke(context: MutPtr<CVoid>, calloutstate: MutPtr<RdrCalloutState>, stage: RpcHttpRedirectorStage): RpcStatus
}

public typealias IRpcPerformCalloutFn = IRpcPerformCalloutFnFn?

public fun interface IRpcProxyFilterIfFnFn {
    public operator fun invoke(context: ConstPtr<CVoid>, ifuuid: ConstPtr<Guid>, ifmajorversion: UShort, fallow: MutPtr<Int>): RpcStatus
}

public typealias IRpcProxyFilterIfFn = IRpcProxyFilterIfFnFn?

public fun interface IRpcProxyGetClientAddressFnFn {
    public operator fun invoke(context: MutPtr<CVoid>, buffer: Pcstr, bufferlength: MutPtr<UInt>): RpcStatus
}

public typealias IRpcProxyGetClientAddressFn = IRpcProxyGetClientAddressFnFn?

public fun interface IRpcProxyGetClientSessionAndResourceUuidFn {
    public operator fun invoke(context: ConstPtr<CVoid>, sessionidpresent: MutPtr<Int>, sessionid: MutPtr<Guid>, resourceidpresent: MutPtr<Int>, resourceid: MutPtr<Guid>): RpcStatus
}

public typealias IRpcProxyGetClientSessionAndResourceUuid = IRpcProxyGetClientSessionAndResourceUuidFn?

public fun interface IRpcProxyGetConnectionTimeoutFnFn {
    public operator fun invoke(connectiontimeout: MutPtr<UInt>): RpcStatus
}

public typealias IRpcProxyGetConnectionTimeoutFn = IRpcProxyGetConnectionTimeoutFnFn?

public fun interface IRpcProxyIsValidMachineFnFn {
    public operator fun invoke(machine: Pcwstr, dotmachine: Pcwstr, portnumber: UInt): RpcStatus
}

public typealias IRpcProxyIsValidMachineFn = IRpcProxyIsValidMachineFnFn?

public fun interface IRpcProxyUpdatePerfCounterBackendServerFnFn {
    public operator fun invoke(machinename: ConstPtr<UShort>, isconnectevent: Int)
}

public typealias IRpcProxyUpdatePerfCounterBackendServerFn = IRpcProxyUpdatePerfCounterBackendServerFnFn?

public fun interface IRpcProxyUpdatePerfCounterFnFn {
    public operator fun invoke(counter: RpcPerfCounters, modifytrend: Int, size: UInt)
}

public typealias IRpcProxyUpdatePerfCounterFn = IRpcProxyUpdatePerfCounterFnFn?

public typealias LrpcSystemHandleMarshalDirection = Int

public fun interface MidlEsAllocFn {
    public operator fun invoke(state: MutPtr<CVoid>, pbuffer: MutPtr<MutPtr<Byte>>, psize: MutPtr<UInt>)
}

public typealias MidlEsAlloc = MidlEsAllocFn?

public typealias MidlEsCode = Int

public typealias MidlEsHandleStyle = Int

public fun interface MidlEsReadFn {
    public operator fun invoke(state: MutPtr<CVoid>, pbuffer: MutPtr<MutPtr<Byte>>, psize: MutPtr<UInt>)
}

public typealias MidlEsRead = MidlEsReadFn?

public fun interface MidlEsWriteFn {
    public operator fun invoke(state: MutPtr<CVoid>, buffer: Pcstr, size: UInt)
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
    public operator fun invoke(context: MutPtr<CVoid>)
}

public typealias NdrRundown = NdrRundownFn?

public fun interface PfnRpcnotificationRoutineFn {
    public operator fun invoke(pasync: MutPtr<RpcAsyncState>, context: MutPtr<CVoid>, event: RpcAsyncEvent)
}

public typealias PfnRpcnotificationRoutine = PfnRpcnotificationRoutineFn?

public fun interface PfnRpcAllocateFn {
    public operator fun invoke(param0: ULong): MutPtr<CVoid>
}

public typealias PfnRpcAllocate = PfnRpcAllocateFn?

public fun interface PfnRpcFreeFn {
    public operator fun invoke(param0: MutPtr<CVoid>)
}

public typealias PfnRpcFree = PfnRpcFreeFn?

public typealias PndrAsyncMessage = Long

public typealias PndrCorrelationInfo = Long

public typealias ProxyPhase = Int

public fun interface PrpcRundownFn {
    public operator fun invoke(associationcontext: MutPtr<CVoid>)
}

public typealias PrpcRundown = PrpcRundownFn?

public fun interface RpcltPduFilterFuncFn {
    public operator fun invoke(buffer: MutPtr<CVoid>, bufferlength: UInt, fdatagram: Int)
}

public typealias RpcltPduFilterFunc = RpcltPduFilterFuncFn?

public fun interface RpcAddressChangeFnFn {
    public operator fun invoke(arg: MutPtr<CVoid>)
}

public typealias RpcAddressChangeFn = RpcAddressChangeFnFn?

public typealias RpcAddressChangeType = Int

public typealias RpcAsyncEvent = Int

public fun interface RpcAuthKeyRetrievalFnFn {
    public operator fun invoke(arg: ConstPtr<CVoid>, serverprincname: Pcwstr, keyver: UInt, key: MutPtr<MutPtr<CVoid>>, status: MutPtr<RpcStatus>)
}

public typealias RpcAuthKeyRetrievalFn = RpcAuthKeyRetrievalFnFn?

public typealias RpcBindingHandleOptionsFlags = UInt

public fun interface RpcBlockingFnFn {
    public operator fun invoke(hwnd: MutPtr<CVoid>, context: MutPtr<CVoid>, hsyncevent: MutPtr<CVoid>): RpcStatus
}

public typealias RpcBlockingFn = RpcBlockingFnFn?

public fun interface RpcClientAllocFn {
    public operator fun invoke(size: ULong): MutPtr<CVoid>
}

public typealias RpcClientAlloc = RpcClientAllocFn?

public fun interface RpcClientFreeFn {
    public operator fun invoke(ptr: ConstPtr<CVoid>)
}

public typealias RpcClientFree = RpcClientFreeFn?

public typealias RpcCAuthnInfoType = UInt

public typealias RpcCHttpAuthnTarget = UInt

public typealias RpcCHttpFlags = UInt

public typealias RpcCQosCapabilities = UInt

public typealias RpcCQosIdentity = UInt

public fun interface RpcDispatchFunctionFn {
    public operator fun invoke(message: MutPtr<RpcMessage>)
}

public typealias RpcDispatchFunction = RpcDispatchFunctionFn?

public fun interface RpcForwardFunctionFn {
    public operator fun invoke(interfaceid: MutPtr<Guid>, interfaceversion: MutPtr<RpcVersion>, objectid: MutPtr<Guid>, rpcpro: MutPtr<UByte>, ppdestendpoint: MutPtr<MutPtr<CVoid>>): RpcStatus
}

public typealias RpcForwardFunction = RpcForwardFunctionFn?

public fun interface RpcHttpProxyFreeStringFn {
    public operator fun invoke(string: Pcwstr)
}

public typealias RpcHttpProxyFreeString = RpcHttpProxyFreeStringFn?

public typealias RpcHttpRedirectorStage = Int

public fun interface RpcIfCallbackFnFn {
    public operator fun invoke(interfaceuuid: ConstPtr<CVoid>, context: ConstPtr<CVoid>): RpcStatus
}

public typealias RpcIfCallbackFn = RpcIfCallbackFnFn?

public fun interface RpcInterfaceGroupIdleCallbackFnFn {
    public operator fun invoke(ifgroup: ConstPtr<CVoid>, idlecallbackcontext: ConstPtr<CVoid>, isgroupidle: UInt)
}

public typealias RpcInterfaceGroupIdleCallbackFn = RpcInterfaceGroupIdleCallbackFnFn?

public fun interface RpcMgmtAuthorizationFnFn {
    public operator fun invoke(clientbinding: ConstPtr<CVoid>, requestedmgmtoperation: UInt, status: MutPtr<RpcStatus>): Int
}

public typealias RpcMgmtAuthorizationFn = RpcMgmtAuthorizationFnFn?

public fun interface RpcNewHttpProxyChannelFn {
    public operator fun invoke(redirectorstage: RpcHttpRedirectorStage, servername: Pcwstr, serverport: Pcwstr, remoteuser: Pcwstr, authtype: Pcwstr, resourceuuid: MutPtr<CVoid>, sessionid: MutPtr<CVoid>, iface: ConstPtr<CVoid>, reserved: ConstPtr<CVoid>, flags: UInt, newservername: MutPtr<Pwstr>, newserverport: MutPtr<Pwstr>): RpcStatus
}

public typealias RpcNewHttpProxyChannel = RpcNewHttpProxyChannelFn?

public typealias RpcNotifications = Int

public typealias RpcNotificationTypes = Int

public fun interface RpcObjectInqFnFn {
    public operator fun invoke(objectuuid: ConstPtr<Guid>, typeuuid: MutPtr<Guid>, status: MutPtr<RpcStatus>)
}

public typealias RpcObjectInqFn = RpcObjectInqFnFn?

public fun interface RpcSecurityCallbackFnFn {
    public operator fun invoke(context: ConstPtr<CVoid>)
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
    public operator fun invoke(param0: MutPtr<MidlStubMessage>)
}

public typealias StubThunk = StubThunkFn?

public typealias UserMarshalCbType = Int

public fun interface UserMarshalFreeingRoutineFn {
    public operator fun invoke(param0: MutPtr<UInt>, param1: MutPtr<CVoid>)
}

public typealias UserMarshalFreeingRoutine = UserMarshalFreeingRoutineFn?

public fun interface UserMarshalMarshallingRoutineFn {
    public operator fun invoke(param0: MutPtr<UInt>, param1: MutPtr<UByte>, param2: MutPtr<CVoid>): MutPtr<UByte>
}

public typealias UserMarshalMarshallingRoutine = UserMarshalMarshallingRoutineFn?

public fun interface UserMarshalSizingRoutineFn {
    public operator fun invoke(param0: MutPtr<UInt>, param1: UInt, param2: MutPtr<CVoid>): UInt
}

public typealias UserMarshalSizingRoutine = UserMarshalSizingRoutineFn?

public fun interface UserMarshalUnmarshallingRoutineFn {
    public operator fun invoke(param0: MutPtr<UInt>, param1: MutPtr<UByte>, param2: MutPtr<CVoid>): MutPtr<UByte>
}

public typealias UserMarshalUnmarshallingRoutine = UserMarshalUnmarshallingRoutineFn?

public typealias XlatSide = Int

public fun interface XmitHelperRoutineFn {
    public operator fun invoke(param0: MutPtr<MidlStubMessage>)
}

public typealias XmitHelperRoutine = XmitHelperRoutineFn?

public typealias NdrProcContext = Long

public typealias SystemHandleT = Int
