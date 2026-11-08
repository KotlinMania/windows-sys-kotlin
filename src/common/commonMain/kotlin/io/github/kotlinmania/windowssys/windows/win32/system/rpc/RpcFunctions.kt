package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID

public fun interface FnCallback {
    public operator fun invoke(state: Long, pbuffer: Long, psize: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(state: Long, buffer: PCSTR, size: UInt)
}

public fun interface FnCallback2 {
    public operator fun invoke(context: Long)
}

public fun interface FnCallback3 {
    public operator fun invoke(clientbinding: Long, requestedmgmtoperation: UInt, status: Long): Int
}

public fun interface FnCallback4 {
    public operator fun invoke(ifgroup: Long, idlecallbackcontext: Long, isgroupidle: UInt)
}

public fun interface FnCallback5 {
    public operator fun invoke(arg: Long, serverprincname: PCWSTR, keyver: UInt, key: Long, status: Long)
}

public fun interface FnCallback6 {
    public operator fun invoke(interfaceuuid: Long, context: Long): RPC_STATUS
}

public fun interface FnCallback7 {
    public operator fun invoke(size: ULong): Long
}

public fun DceErrorInqTextA(rpcstatus: RPC_STATUS, errortext: PSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "DceErrorInqTextA", longArrayOf(rpcstatus.toLong(), errortext)).toInt()
}

public fun DceErrorInqTextW(rpcstatus: RPC_STATUS, errortext: PWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "DceErrorInqTextW", longArrayOf(rpcstatus.toLong(), errortext)).toInt()
}

public fun IUnknown_AddRef_Proxy(thisRef: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "IUnknown_AddRef_Proxy", longArrayOf(thisRef)).toUInt()
}

public fun IUnknown_QueryInterface_Proxy(thisRef: Long, riid: Long, ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "IUnknown_QueryInterface_Proxy", longArrayOf(thisRef, riid, ppvobject)).toInt()
}

public fun IUnknown_Release_Proxy(thisRef: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "IUnknown_Release_Proxy", longArrayOf(thisRef)).toUInt()
}

public fun I_RpcAllocate(size: UInt): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcAllocate", longArrayOf(size.toLong()))
}

public fun I_RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcAsyncAbortCall", longArrayOf(pasync, exceptioncode.toLong())).toInt()
}

public fun I_RpcAsyncSetHandle(message: Long, pasync: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcAsyncSetHandle", longArrayOf(message, pasync)).toInt()
}

public fun I_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingCopy", longArrayOf(sourcebinding, destinationbinding)).toInt()
}

public fun I_RpcBindingCreateNP(servername: PCWSTR, servicename: PCWSTR, networkoptions: PCWSTR, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingCreateNP", longArrayOf(servername, servicename, networkoptions, binding)).toInt()
}

public fun I_RpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingHandleToAsyncHandle", longArrayOf(binding, asynchandle)).toInt()
}

public fun I_RpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqClientTokenAttributes", longArrayOf(binding, tokenid, authenticationid, modifiedid)).toInt()
}

public fun I_RpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqDynamicEndpointA", longArrayOf(binding, dynamicendpoint)).toInt()
}

public fun I_RpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqDynamicEndpointW", longArrayOf(binding, dynamicendpoint)).toInt()
}

public fun I_RpcBindingInqLocalClientPID(binding: Long, pid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqLocalClientPID", longArrayOf(binding, pid)).toInt()
}

public fun I_RpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqMarshalledTargetInfo", longArrayOf(binding, marshalledtargetinfosize, marshalledtargetinfo)).toInt()
}

public fun I_RpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqSecurityContext", longArrayOf(binding, securitycontexthandle)).toInt()
}

public fun I_RpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqSecurityContextKeyInfo", longArrayOf(binding, keyinfo)).toInt()
}

public fun I_RpcBindingInqTransportType(binding: Long, type: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqTransportType", longArrayOf(binding, type)).toInt()
}

public fun I_RpcBindingInqWireIdForSnego(binding: Long, wireid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingInqWireIdForSnego", longArrayOf(binding, wireid)).toInt()
}

public fun I_RpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingIsClientLocal", longArrayOf(bindinghandle, clientlocalflag)).toInt()
}

public fun I_RpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingIsServerLocal", longArrayOf(binding, serverlocalflag)).toInt()
}

public fun I_RpcBindingSetPrivateOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingSetPrivateOption", longArrayOf(hbinding, option.toLong(), optionvalue.toLong())).toInt()
}

public fun I_RpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcBindingToStaticStringBindingW", longArrayOf(binding, stringbinding)).toInt()
}

public fun I_RpcClearMutex(mutex: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcClearMutex", longArrayOf(mutex))
}

public fun I_RpcDeleteMutex(mutex: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcDeleteMutex", longArrayOf(mutex))
}

public fun I_RpcExceptionFilter(exceptioncode: UInt): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcExceptionFilter", longArrayOf(exceptioncode.toLong())).toInt()
}

public fun I_RpcFree(obj: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcFree", longArrayOf(obj))
}

public fun I_RpcFreeBuffer(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcFreeBuffer", longArrayOf(message)).toInt()
}

public fun I_RpcFreePipeBuffer(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcFreePipeBuffer", longArrayOf(message)).toInt()
}

public fun I_RpcGetBuffer(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcGetBuffer", longArrayOf(message)).toInt()
}

public fun I_RpcGetBufferWithObject(message: Long, objectuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcGetBufferWithObject", longArrayOf(message, objectuuid)).toInt()
}

public fun I_RpcGetCurrentCallHandle(): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcGetCurrentCallHandle", longArrayOf())
}

public fun I_RpcGetDefaultSD(ppsecuritydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcGetDefaultSD", longArrayOf(ppsecuritydescriptor)).toInt()
}

public fun I_RpcGetExtendedError(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcGetExtendedError", longArrayOf()).toInt()
}

public fun I_RpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: UInt, transfersyntaxcount: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcIfInqTransferSyntaxes", longArrayOf(rpcifhandle, transfersyntaxes, transfersyntaxsize.toLong(), transfersyntaxcount)).toInt()
}

public fun I_RpcMapWin32Status(status: RPC_STATUS): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcMapWin32Status", longArrayOf(status.toLong())).toInt()
}

public fun I_RpcMgmtEnableDedicatedThreadPool(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcMgmtEnableDedicatedThreadPool", longArrayOf()).toInt()
}

public fun I_RpcNegotiateTransferSyntax(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcNegotiateTransferSyntax", longArrayOf(message)).toInt()
}

public fun I_RpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcNsBindingSetEntryNameA", longArrayOf(binding, entrynamesyntax.toLong(), entryname)).toInt()
}

public fun I_RpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcNsBindingSetEntryNameW", longArrayOf(binding, entrynamesyntax.toLong(), entryname)).toInt()
}

public fun I_RpcNsGetBuffer(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "I_RpcNsGetBuffer", longArrayOf(message)).toInt()
}

public fun I_RpcNsInterfaceExported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcNsInterfaceExported", longArrayOf(entrynamesyntax.toLong(), entryname, rpcinterfaceinformation)).toInt()
}

public fun I_RpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcNsInterfaceUnexported", longArrayOf(entrynamesyntax.toLong(), entryname, rpcinterfaceinformation)).toInt()
}

public fun I_RpcNsRaiseException(message: Long, status: RPC_STATUS) {
    Win32DynamicFfi.invoke("rpcns4.dll", "I_RpcNsRaiseException", longArrayOf(message, status.toLong()))
}

public fun I_RpcNsSendReceive(message: Long, handle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "I_RpcNsSendReceive", longArrayOf(message, handle)).toInt()
}

public fun I_RpcOpenClientProcess(binding: Long, desiredaccess: UInt, clientprocess: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcOpenClientProcess", longArrayOf(binding, desiredaccess.toLong(), clientprocess)).toInt()
}

public fun I_RpcPauseExecution(milliseconds: UInt) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcPauseExecution", longArrayOf(milliseconds.toLong()))
}

public fun I_RpcReBindBuffer(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "I_RpcReBindBuffer", longArrayOf(message)).toInt()
}

public fun I_RpcReallocPipeBuffer(message: Long, newsize: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcReallocPipeBuffer", longArrayOf(message, newsize.toLong())).toInt()
}

public fun I_RpcReceive(message: Long, size: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcReceive", longArrayOf(message, size.toLong())).toInt()
}

public fun I_RpcRecordCalloutFailure(rpcstatus: RPC_STATUS, calloutstate: Long, dllname: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcRecordCalloutFailure", longArrayOf(rpcstatus.toLong(), calloutstate, dllname))
}

public fun I_RpcRequestMutex(mutex: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcRequestMutex", longArrayOf(mutex))
}

public fun I_RpcSend(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcSend", longArrayOf(message)).toInt()
}

public fun I_RpcSendReceive(message: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcSendReceive", longArrayOf(message)).toInt()
}

public fun I_RpcServerCheckClientRestriction(context: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerCheckClientRestriction", longArrayOf(context)).toInt()
}

public fun I_RpcServerDisableExceptionFilter(): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerDisableExceptionFilter", longArrayOf()).toInt()
}

public fun I_RpcServerGetAssociationID(binding: Long, associationid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerGetAssociationID", longArrayOf(binding, associationid)).toInt()
}

public fun I_RpcServerInqAddressChangeFn(): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerInqAddressChangeFn", longArrayOf())
}

public fun I_RpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerInqLocalConnAddress", longArrayOf(binding, buffer, buffersize, addressformat)).toInt()
}

public fun I_RpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerInqRemoteConnAddress", longArrayOf(binding, buffer, buffersize, addressformat)).toInt()
}

public fun I_RpcServerInqTransportType(type: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerInqTransportType", longArrayOf(type)).toInt()
}

public fun I_RpcServerRegisterForwardFunction(pforwardfunction: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerRegisterForwardFunction", longArrayOf(pforwardfunction)).toInt()
}

public fun I_RpcServerSetAddressChangeFn(paddresschangefn: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerSetAddressChangeFn", longArrayOf(paddresschangefn)).toInt()
}

public fun I_RpcServerStartService(protseq: PCWSTR, endpoint: PCWSTR, ifspec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerStartService", longArrayOf(protseq, endpoint, ifspec)).toInt()
}

public fun I_RpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerSubscribeForDisconnectNotification", longArrayOf(binding, hevent)).toInt()
}

public fun I_RpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerSubscribeForDisconnectNotification2", longArrayOf(binding, hevent, subscriptionid)).toInt()
}

public fun I_RpcServerUnsubscribeForDisconnectNotification(binding: Long, subscriptionid: GUID): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerUnsubscribeForDisconnectNotification", longArrayOf(binding, run { val buf = ByteArray(16); buf[0] = (subscriptionid.data1.toInt() and 0xFF).toByte(); buf[1] = ((subscriptionid.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((subscriptionid.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((subscriptionid.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (subscriptionid.data2.toInt() and 0xFF).toByte(); buf[5] = ((subscriptionid.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (subscriptionid.data3.toInt() and 0xFF).toByte(); buf[7] = ((subscriptionid.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, subscriptionid.data4.size)) buf[8 + i] = subscriptionid.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr })).toInt()
}

public fun I_RpcServerUseProtseq2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerUseProtseq2A", longArrayOf(networkaddress, protseq, maxcalls.toLong(), securitydescriptor, policy)).toInt()
}

public fun I_RpcServerUseProtseq2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerUseProtseq2W", longArrayOf(networkaddress, protseq, maxcalls.toLong(), securitydescriptor, policy)).toInt()
}

public fun I_RpcServerUseProtseqEp2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerUseProtseqEp2A", longArrayOf(networkaddress, protseq, maxcalls.toLong(), endpoint, securitydescriptor, policy)).toInt()
}

public fun I_RpcServerUseProtseqEp2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcServerUseProtseqEp2W", longArrayOf(networkaddress, protseq, maxcalls.toLong(), endpoint, securitydescriptor, policy)).toInt()
}

public fun I_RpcSessionStrictContextHandle() {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcSessionStrictContextHandle", longArrayOf())
}

public fun I_RpcSsDontSerializeContext() {
    Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcSsDontSerializeContext", longArrayOf())
}

public fun I_RpcSystemHandleTypeSpecificWork(handle: Long, actualtype: UByte, idltype: UByte, marshaldirection: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcSystemHandleTypeSpecificWork", longArrayOf(handle, actualtype.toLong(), idltype.toLong(), marshaldirection.toLong())).toInt()
}

public fun I_RpcTurnOnEEInfoPropagation(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_RpcTurnOnEEInfoPropagation", longArrayOf()).toInt()
}

public fun I_UuidCreate(uuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "I_UuidCreate", longArrayOf(uuid)).toInt()
}

public fun MesBufferHandleReset(handle: Long, handlestyle: UInt, operation: MIDL_ES_CODE, pbuffer: Long, buffersize: UInt, pencodedsize: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesBufferHandleReset", longArrayOf(handle, handlestyle.toLong(), operation.toLong(), pbuffer, buffersize.toLong(), pencodedsize)).toInt()
}

public fun MesDecodeBufferHandleCreate(buffer: PCSTR, buffersize: UInt, phandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesDecodeBufferHandleCreate", longArrayOf(buffer, buffersize.toLong(), phandle)).toInt()
}

public fun MesDecodeIncrementalHandleCreate(userstate: Long, readfn: MIDL_ES_READ, phandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesDecodeIncrementalHandleCreate", longArrayOf(userstate, Win32DynamicFfi.objectSlot(readfn), phandle)).toInt()
}

public fun MesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesEncodeDynBufferHandleCreate", longArrayOf(pbuffer, pencodedsize, phandle)).toInt()
}

public fun MesEncodeFixedBufferHandleCreate(pbuffer: PSTR, buffersize: UInt, pencodedsize: Long, phandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesEncodeFixedBufferHandleCreate", longArrayOf(pbuffer, buffersize.toLong(), pencodedsize, phandle)).toInt()
}

public fun MesEncodeIncrementalHandleCreate(userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, phandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesEncodeIncrementalHandleCreate", longArrayOf(userstate, Win32DynamicFfi.objectSlot(allocfn), Win32DynamicFfi.objectSlot(writefn), phandle)).toInt()
}

public fun MesHandleFree(handle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesHandleFree", longArrayOf(handle)).toInt()
}

public fun MesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, readfn: MIDL_ES_READ, operation: MIDL_ES_CODE): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesIncrementalHandleReset", longArrayOf(handle, userstate, Win32DynamicFfi.objectSlot(allocfn), Win32DynamicFfi.objectSlot(writefn), Win32DynamicFfi.objectSlot(readfn), operation.toLong())).toInt()
}

public fun MesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "MesInqProcEncodingId", longArrayOf(handle, pinterfaceid, pprocnum)).toInt()
}

public fun NDRCContextBinding(ccontext: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NDRCContextBinding", longArrayOf(ccontext))
}

public fun NDRCContextMarshall(ccontext: Long, pbuff: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NDRCContextMarshall", longArrayOf(ccontext, pbuff))
}

public fun NDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: UInt) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NDRCContextUnmarshall", longArrayOf(pccontext, hbinding, pbuff, datarepresentation.toLong()))
}

public fun NDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NDRSContextMarshall", longArrayOf(ccontext, pbuff, Win32DynamicFfi.objectSlot(userrundownin)))
}

public fun NDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN, ctxguard: Long, flags: UInt) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NDRSContextMarshall2", longArrayOf(bindinghandle, ccontext, pbuff, Win32DynamicFfi.objectSlot(userrundownin), ctxguard, flags.toLong()))
}

public fun NDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NDRSContextMarshallEx", longArrayOf(bindinghandle, ccontext, pbuff, Win32DynamicFfi.objectSlot(userrundownin)))
}

public fun NDRSContextUnmarshall(pbuff: Long, datarepresentation: UInt): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NDRSContextUnmarshall", longArrayOf(pbuff, datarepresentation.toLong()))
}

public fun NDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: UInt, ctxguard: Long, flags: UInt): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NDRSContextUnmarshall2", longArrayOf(bindinghandle, pbuff, datarepresentation.toLong(), ctxguard, flags.toLong()))
}

public fun NDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: UInt): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NDRSContextUnmarshallEx", longArrayOf(bindinghandle, pbuff, datarepresentation.toLong()))
}

public fun Ndr64AsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "Ndr64AsyncClientCall", longArrayOf(pproxyinfo, nprocnum.toLong(), preturnvalue) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun Ndr64AsyncServerCall64(prpcmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "Ndr64AsyncServerCall64", longArrayOf(prpcmsg))
}

public fun Ndr64AsyncServerCallAll(prpcmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "Ndr64AsyncServerCallAll", longArrayOf(prpcmsg))
}

public fun Ndr64DcomAsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "Ndr64DcomAsyncClientCall", longArrayOf(pproxyinfo, nprocnum.toLong(), preturnvalue) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun Ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "Ndr64DcomAsyncStubCall", longArrayOf(pthis, pchannel, prpcmsg, pdwstubphase)).toInt()
}

public fun NdrAllocate(pstubmsg: Long, len: ULong): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrAllocate", longArrayOf(pstubmsg, len.toLong()))
}

public fun NdrAsyncClientCall(pstubdescriptor: Long, pformat: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "NdrAsyncClientCall", longArrayOf(pstubdescriptor, pformat) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun NdrAsyncServerCall(prpcmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrAsyncServerCall", longArrayOf(prpcmsg))
}

public fun NdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrByteCountPointerBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrByteCountPointerFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrByteCountPointerMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrByteCountPointerUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrClearOutParameters", longArrayOf(pstubmsg, pformat, argaddr))
}

public fun NdrClientCall2(pstubdescriptor: Long, pformat: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "NdrClientCall2", longArrayOf(pstubdescriptor, pformat) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun NdrClientCall3(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "NdrClientCall3", longArrayOf(pproxyinfo, nprocnum.toLong(), preturnvalue) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun NdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrClientContextMarshall", longArrayOf(pstubmsg, contexthandle, fcheck.toLong()))
}

public fun NdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrClientContextUnmarshall", longArrayOf(pstubmsg, pcontexthandle, bindhandle))
}

public fun NdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrClientInitialize", longArrayOf(prpcmsg, pstubmsg, pstubdescriptor, procnum.toLong()))
}

public fun NdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrClientInitializeNew", longArrayOf(prpcmsg, pstubmsg, pstubdescriptor, procnum.toLong()))
}

public fun NdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexArrayBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexArrayFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexArrayMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexArrayMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexArrayUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexStructBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexStructFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexStructMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexStructMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrComplexStructUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantArrayBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantArrayFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantArrayMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantArrayMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantArrayUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStringBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStringMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStringMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStringUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStructBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStructFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStructMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStructMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantStructUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingArrayBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingArrayFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingArrayMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingArrayMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingArrayUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingStructBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingStructFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingStructMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingStructMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConformantVaryingStructUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrContextHandleInitialize", longArrayOf(pstubmsg, pformat))
}

public fun NdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrContextHandleSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrConvert(pstubmsg: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConvert", longArrayOf(pstubmsg, pformat))
}

public fun NdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrConvert2", longArrayOf(pstubmsg, pformat, numberparams.toLong()))
}

public fun NdrCorrelationFree(pstubmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrCorrelationFree", longArrayOf(pstubmsg))
}

public fun NdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: UInt, flags: UInt) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrCorrelationInitialize", longArrayOf(pstubmsg, pmemory, cachesize.toLong(), flags.toLong()))
}

public fun NdrCorrelationPass(pstubmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrCorrelationPass", longArrayOf(pstubmsg))
}

public fun NdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrCreateServerInterfaceFromStub", longArrayOf(pstub, pserverif)).toInt()
}

public fun NdrDcomAsyncClientCall(pstubdescriptor: Long, pformat: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "NdrDcomAsyncClientCall", longArrayOf(pstubdescriptor, pformat) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun NdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrDcomAsyncStubCall", longArrayOf(pthis, pchannel, prpcmsg, pdwstubphase)).toInt()
}

public fun NdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrEncapsulatedUnionBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrEncapsulatedUnionFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrEncapsulatedUnionMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrEncapsulatedUnionMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrEncapsulatedUnionUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFixedArrayBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFixedArrayFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFixedArrayMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFixedArrayMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFixedArrayUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrFreeBuffer(pstubmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFreeBuffer", longArrayOf(pstubmsg))
}

public fun NdrFullPointerXlatFree(pxlattables: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFullPointerXlatFree", longArrayOf(pxlattables))
}

public fun NdrFullPointerXlatInit(numberofpointers: UInt, xlatside: XLAT_SIDE): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrFullPointerXlatInit", longArrayOf(numberofpointers.toLong(), xlatside.toLong()))
}

public fun NdrGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrGetBuffer", longArrayOf(pstubmsg, bufferlength.toLong(), handle))
}

public fun NdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): HRESULT {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrGetDcomProtocolVersion", longArrayOf(pstubmsg, pversion)).toInt()
}

public fun NdrGetUserMarshalInfo(pflags: Long, informationlevel: UInt, pmarshalinfo: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrGetUserMarshalInfo", longArrayOf(pflags, informationlevel.toLong(), pmarshalinfo)).toInt()
}

public fun NdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrInterfacePointerBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrInterfacePointerFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrInterfacePointerMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrInterfacePointerMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrInterfacePointerUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: RPC_STATUS): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMapCommAndFaultStatus", longArrayOf(pstubmsg, pcommstatus, pfaultstatus, status.toLong())).toInt()
}

public fun NdrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesProcEncodeDecode", longArrayOf(handle, pstubdesc, pformatstring) + variadicArgs)
}

public fun NdrMesProcEncodeDecode2(handle: Long, pstubdesc: Long, pformatstring: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesProcEncodeDecode2", longArrayOf(handle, pstubdesc, pformatstring) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun NdrMesProcEncodeDecode3(handle: Long, pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long, vararg variadicArgs: Long): CLIENT_CALL_RETURN {
    val rawRet = Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesProcEncodeDecode3", longArrayOf(handle, pproxyinfo, nprocnum.toLong(), preturnvalue) + variadicArgs)
    return CLIENT_CALL_RETURN(Pointer = rawRet, Simple = rawRet)
}

public fun NdrMesSimpleTypeAlignSize(param0: Long): ULong {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesSimpleTypeAlignSize", longArrayOf(param0)).toULong()
}

public fun NdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): ULong {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesSimpleTypeAlignSizeAll", longArrayOf(handle, pproxyinfo)).toULong()
}

public fun NdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesSimpleTypeDecode", longArrayOf(handle, pobject, size.toLong()))
}

public fun NdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesSimpleTypeDecodeAll", longArrayOf(handle, pproxyinfo, pobject, size.toLong()))
}

public fun NdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesSimpleTypeEncode", longArrayOf(handle, pstubdesc, pobject, size.toLong()))
}

public fun NdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesSimpleTypeEncodeAll", longArrayOf(handle, pproxyinfo, pobject, size.toLong()))
}

public fun NdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeAlignSize", longArrayOf(handle, pstubdesc, pformatstring, pobject)).toULong()
}

public fun NdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeAlignSize2", longArrayOf(handle, ppicklinginfo, pstubdesc, pformatstring, pobject)).toULong()
}

public fun NdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long): ULong {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeAlignSize3", longArrayOf(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toLong(), pobject)).toULong()
}

public fun NdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeDecode", longArrayOf(handle, pstubdesc, pformatstring, pobject))
}

public fun NdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeDecode2", longArrayOf(handle, ppicklinginfo, pstubdesc, pformatstring, pobject))
}

public fun NdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeDecode3", longArrayOf(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toLong(), pobject))
}

public fun NdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeEncode", longArrayOf(handle, pstubdesc, pformatstring, pobject))
}

public fun NdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeEncode2", longArrayOf(handle, ppicklinginfo, pstubdesc, pformatstring, pobject))
}

public fun NdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeEncode3", longArrayOf(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toLong(), pobject))
}

public fun NdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeFree2", longArrayOf(handle, ppicklinginfo, pstubdesc, pformatstring, pobject))
}

public fun NdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrMesTypeFree3", longArrayOf(handle, ppicklinginfo, pproxyinfo, arrtypeoffset, ntypeindex.toLong(), pobject))
}

public fun NdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonConformantStringBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonConformantStringMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonConformantStringMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonConformantStringUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonEncapsulatedUnionBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonEncapsulatedUnionFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonEncapsulatedUnionMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonEncapsulatedUnionMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNonEncapsulatedUnionUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrNsGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNsGetBuffer", longArrayOf(pstubmsg, bufferlength.toLong(), handle))
}

public fun NdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrNsSendReceive", longArrayOf(pstubmsg, pbufferend, pautohandle))
}

public fun NdrOleAllocate(size: ULong): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrOleAllocate", longArrayOf(size.toLong()))
}

public fun NdrOleFree(nodetofree: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrOleFree", longArrayOf(nodetofree))
}

public fun NdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPartialIgnoreClientBufferSize", longArrayOf(pstubmsg, pmemory))
}

public fun NdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPartialIgnoreClientMarshall", longArrayOf(pstubmsg, pmemory))
}

public fun NdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPartialIgnoreServerInitialize", longArrayOf(pstubmsg, ppmemory, pformat))
}

public fun NdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPartialIgnoreServerUnmarshall", longArrayOf(pstubmsg, ppmemory))
}

public fun NdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPointerBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPointerFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPointerMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrPointerMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPointerMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrPointerUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRangeUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrRpcSmClientAllocate(size: ULong): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRpcSmClientAllocate", longArrayOf(size.toLong()))
}

public fun NdrRpcSmClientFree(nodetofree: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRpcSmClientFree", longArrayOf(nodetofree))
}

public fun NdrRpcSmSetClientToOsf(pmessage: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRpcSmSetClientToOsf", longArrayOf(pmessage))
}

public fun NdrRpcSsDefaultAllocate(size: ULong): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRpcSsDefaultAllocate", longArrayOf(size.toLong()))
}

public fun NdrRpcSsDefaultFree(nodetofree: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRpcSsDefaultFree", longArrayOf(nodetofree))
}

public fun NdrRpcSsDisableAllocate(pmessage: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRpcSsDisableAllocate", longArrayOf(pmessage))
}

public fun NdrRpcSsEnableAllocate(pmessage: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrRpcSsEnableAllocate", longArrayOf(pmessage))
}

public fun NdrSendReceive(pstubmsg: Long, pbufferend: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSendReceive", longArrayOf(pstubmsg, pbufferend))
}

public fun NdrServerCall2(prpcmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerCall2", longArrayOf(prpcmsg))
}

public fun NdrServerCallAll(prpcmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerCallAll", longArrayOf(prpcmsg))
}

public fun NdrServerCallNdr64(prpcmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerCallNdr64", longArrayOf(prpcmsg))
}

public fun NdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerContextMarshall", longArrayOf(pstubmsg, contexthandle, Win32DynamicFfi.objectSlot(rundownroutine)))
}

public fun NdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerContextNewMarshall", longArrayOf(pstubmsg, contexthandle, Win32DynamicFfi.objectSlot(rundownroutine), pformat))
}

public fun NdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerContextNewUnmarshall", longArrayOf(pstubmsg, pformat))
}

public fun NdrServerContextUnmarshall(pstubmsg: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerContextUnmarshall", longArrayOf(pstubmsg))
}

public fun NdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerInitialize", longArrayOf(prpcmsg, pstubmsg, pstubdescriptor))
}

public fun NdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerInitializeMarshall", longArrayOf(prpcmsg, pstubmsg))
}

public fun NdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerInitializeNew", longArrayOf(prpcmsg, pstubmsg, pstubdescriptor))
}

public fun NdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: UInt) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerInitializePartial", longArrayOf(prpcmsg, pstubmsg, pstubdescriptor, requestedbuffersize.toLong()))
}

public fun NdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrServerInitializeUnmarshall", longArrayOf(pstubmsg, pstubdescriptor, prpcmsg))
}

public fun NdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSimpleStructBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSimpleStructFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSimpleStructMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSimpleStructMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSimpleStructUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSimpleTypeMarshall", longArrayOf(pstubmsg, pmemory, formatchar.toLong()))
}

public fun NdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrSimpleTypeUnmarshall", longArrayOf(pstubmsg, pmemory, formatchar.toLong()))
}

public fun NdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrStubCall2", longArrayOf(pthis, pchannel, prpcmsg, pdwstubphase)).toInt()
}

public fun NdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrStubCall3", longArrayOf(pthis, pchannel, prpcmsg, pdwstubphase)).toInt()
}

public fun NdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrUserMarshalBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrUserMarshalFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrUserMarshalMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrUserMarshalMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrUserMarshalSimpleTypeConvert", longArrayOf(pflags, pbuffer, formatchar.toLong()))
}

public fun NdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrUserMarshalUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrVaryingArrayBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrVaryingArrayFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrVaryingArrayMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrVaryingArrayMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrVaryingArrayUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun NdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrXmitOrRepAsBufferSize", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "NdrXmitOrRepAsFree", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrXmitOrRepAsMarshall", longArrayOf(pstubmsg, pmemory, pformat))
}

public fun NdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): UInt {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrXmitOrRepAsMemorySize", longArrayOf(pstubmsg, pformat)).toUInt()
}

public fun NdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "NdrXmitOrRepAsUnmarshall", longArrayOf(pstubmsg, ppmemory, pformat, fmustalloc.toLong()))
}

public fun RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcAsyncAbortCall", longArrayOf(pasync, exceptioncode.toLong())).toInt()
}

public fun RpcAsyncCancelCall(pasync: Long, fabort: BOOL): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcAsyncCancelCall", longArrayOf(pasync, fabort.toLong())).toInt()
}

public fun RpcAsyncCompleteCall(pasync: Long, reply: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcAsyncCompleteCall", longArrayOf(pasync, reply)).toInt()
}

public fun RpcAsyncGetCallStatus(pasync: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcAsyncGetCallStatus", longArrayOf(pasync)).toInt()
}

public fun RpcAsyncInitializeHandle(pasync: Long, size: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcAsyncInitializeHandle", longArrayOf(pasync, size.toLong())).toInt()
}

public fun RpcAsyncRegisterInfo(pasync: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcAsyncRegisterInfo", longArrayOf(pasync)).toInt()
}

public fun RpcBindingBind(pasync: Long, binding: Long, ifspec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingBind", longArrayOf(pasync, binding, ifspec)).toInt()
}

public fun RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingCopy", longArrayOf(sourcebinding, destinationbinding)).toInt()
}

public fun RpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingCreateA", longArrayOf(template, security, options, binding)).toInt()
}

public fun RpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingCreateW", longArrayOf(template, security, options, binding)).toInt()
}

public fun RpcBindingFree(binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingFree", longArrayOf(binding)).toInt()
}

public fun RpcBindingFromStringBindingA(stringbinding: PCSTR, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingFromStringBindingA", longArrayOf(stringbinding, binding)).toInt()
}

public fun RpcBindingFromStringBindingW(stringbinding: PCWSTR, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingFromStringBindingW", longArrayOf(stringbinding, binding)).toInt()
}

public fun RpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthClientA", longArrayOf(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc)).toInt()
}

public fun RpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthClientExA", longArrayOf(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags.toLong())).toInt()
}

public fun RpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthClientExW", longArrayOf(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc, flags.toLong())).toInt()
}

public fun RpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthClientW", longArrayOf(clientbinding, privs, serverprincname, authnlevel, authnsvc, authzsvc)).toInt()
}

public fun RpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthInfoA", longArrayOf(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc)).toInt()
}

public fun RpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthInfoExA", longArrayOf(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion.toLong(), securityqos)).toInt()
}

public fun RpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthInfoExW", longArrayOf(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc, rpcqosversion.toLong(), securityqos)).toInt()
}

public fun RpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqAuthInfoW", longArrayOf(binding, serverprincname, authnlevel, authnsvc, authidentity, authzsvc)).toInt()
}

public fun RpcBindingInqMaxCalls(binding: Long, maxcalls: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqMaxCalls", longArrayOf(binding, maxcalls)).toInt()
}

public fun RpcBindingInqObject(binding: Long, objectuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqObject", longArrayOf(binding, objectuuid)).toInt()
}

public fun RpcBindingInqOption(hbinding: Long, option: UInt, poptionvalue: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingInqOption", longArrayOf(hbinding, option.toLong(), poptionvalue)).toInt()
}

public fun RpcBindingReset(binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingReset", longArrayOf(binding)).toInt()
}

public fun RpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingServerFromClient", longArrayOf(clientbinding, serverbinding)).toInt()
}

public fun RpcBindingSetAuthInfoA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingSetAuthInfoA", longArrayOf(binding, serverprincname, authnlevel.toLong(), authnsvc.toLong(), authidentity, authzsvc.toLong())).toInt()
}

public fun RpcBindingSetAuthInfoExA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingSetAuthInfoExA", longArrayOf(binding, serverprincname, authnlevel.toLong(), authnsvc.toLong(), authidentity, authzsvc.toLong(), securityqos)).toInt()
}

public fun RpcBindingSetAuthInfoExW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingSetAuthInfoExW", longArrayOf(binding, serverprincname, authnlevel.toLong(), authnsvc.toLong(), authidentity, authzsvc.toLong(), securityqos)).toInt()
}

public fun RpcBindingSetAuthInfoW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingSetAuthInfoW", longArrayOf(binding, serverprincname, authnlevel.toLong(), authnsvc.toLong(), authidentity, authzsvc.toLong())).toInt()
}

public fun RpcBindingSetObject(binding: Long, objectuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingSetObject", longArrayOf(binding, objectuuid)).toInt()
}

public fun RpcBindingSetOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingSetOption", longArrayOf(hbinding, option.toLong(), optionvalue.toLong())).toInt()
}

public fun RpcBindingToStringBindingA(binding: Long, stringbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingToStringBindingA", longArrayOf(binding, stringbinding)).toInt()
}

public fun RpcBindingToStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingToStringBindingW", longArrayOf(binding, stringbinding)).toInt()
}

public fun RpcBindingUnbind(binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingUnbind", longArrayOf(binding)).toInt()
}

public fun RpcBindingVectorFree(bindingvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcBindingVectorFree", longArrayOf(bindingvector)).toInt()
}

public fun RpcCancelThread(thread: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcCancelThread", longArrayOf(thread)).toInt()
}

public fun RpcCancelThreadEx(thread: Long, timeout: Int): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcCancelThreadEx", longArrayOf(thread, timeout.toLong())).toInt()
}

public fun RpcCertGeneratePrincipalNameA(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcCertGeneratePrincipalNameA", longArrayOf(context, flags.toLong(), pbuffer)).toInt()
}

public fun RpcCertGeneratePrincipalNameW(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcCertGeneratePrincipalNameW", longArrayOf(context, flags.toLong(), pbuffer)).toInt()
}

public fun RpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcEpRegisterA", longArrayOf(ifspec, bindingvector, uuidvector, annotation)).toInt()
}

public fun RpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcEpRegisterNoReplaceA", longArrayOf(ifspec, bindingvector, uuidvector, annotation)).toInt()
}

public fun RpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcEpRegisterNoReplaceW", longArrayOf(ifspec, bindingvector, uuidvector, annotation)).toInt()
}

public fun RpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcEpRegisterW", longArrayOf(ifspec, bindingvector, uuidvector, annotation)).toInt()
}

public fun RpcEpResolveBinding(binding: Long, ifspec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcEpResolveBinding", longArrayOf(binding, ifspec)).toInt()
}

public fun RpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcEpUnregister", longArrayOf(ifspec, bindingvector, uuidvector)).toInt()
}

public fun RpcErrorAddRecord(errorinfo: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorAddRecord", longArrayOf(errorinfo)).toInt()
}

public fun RpcErrorClearInformation() {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorClearInformation", longArrayOf())
}

public fun RpcErrorEndEnumeration(enumhandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorEndEnumeration", longArrayOf(enumhandle)).toInt()
}

public fun RpcErrorGetNextRecord(enumhandle: Long, copystrings: BOOL, errorinfo: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorGetNextRecord", longArrayOf(enumhandle, copystrings.toLong(), errorinfo)).toInt()
}

public fun RpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorGetNumberOfRecords", longArrayOf(enumhandle, records)).toInt()
}

public fun RpcErrorLoadErrorInfo(errorblob: Long, blobsize: ULong, enumhandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorLoadErrorInfo", longArrayOf(errorblob, blobsize.toLong(), enumhandle)).toInt()
}

public fun RpcErrorResetEnumeration(enumhandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorResetEnumeration", longArrayOf(enumhandle)).toInt()
}

public fun RpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorSaveErrorInfo", longArrayOf(enumhandle, errorblob, blobsize)).toInt()
}

public fun RpcErrorStartEnumeration(enumhandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcErrorStartEnumeration", longArrayOf(enumhandle)).toInt()
}

public fun RpcExceptionFilter(exceptioncode: UInt): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcExceptionFilter", longArrayOf(exceptioncode.toLong())).toInt()
}

public fun RpcFreeAuthorizationContext(pauthzclientcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcFreeAuthorizationContext", longArrayOf(pauthzclientcontext)).toInt()
}

public fun RpcGetAuthorizationContextForClient(clientbinding: Long, impersonateonreturn: BOOL, reserved1: Long, pexpirationtime: Long, reserved2: LUID, reserved3: UInt, reserved4: Long, pauthzclientcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcGetAuthorizationContextForClient", longArrayOf(clientbinding, impersonateonreturn.toLong(), reserved1, pexpirationtime, ((reserved2.LowPart.toLong() and 0xFFFF_FFFFL) or ((reserved2.HighPart.toLong() and 0xFFFF_FFFFL) shl 32)), reserved3.toLong(), reserved4, pauthzclientcontext)).toInt()
}

public fun RpcIfIdVectorFree(ifidvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcIfIdVectorFree", longArrayOf(ifidvector)).toInt()
}

public fun RpcIfInqId(rpcifhandle: Long, rpcifid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcIfInqId", longArrayOf(rpcifhandle, rpcifid)).toInt()
}

public fun RpcImpersonateClient(bindinghandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcImpersonateClient", longArrayOf(bindinghandle)).toInt()
}

public fun RpcImpersonateClient2(bindinghandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcImpersonateClient2", longArrayOf(bindinghandle)).toInt()
}

public fun RpcImpersonateClientContainer(bindinghandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcImpersonateClientContainer", longArrayOf(bindinghandle)).toInt()
}

public fun RpcMgmtEnableIdleCleanup(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtEnableIdleCleanup", longArrayOf()).toInt()
}

public fun RpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: UInt, ifid: Long, versoption: UInt, objectuuid: Long, inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtEpEltInqBegin", longArrayOf(epbinding, inquirytype.toLong(), ifid, versoption.toLong(), objectuuid, inquirycontext)).toInt()
}

public fun RpcMgmtEpEltInqDone(inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtEpEltInqDone", longArrayOf(inquirycontext)).toInt()
}

public fun RpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtEpEltInqNextA", longArrayOf(inquirycontext, ifid, binding, objectuuid, annotation)).toInt()
}

public fun RpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtEpEltInqNextW", longArrayOf(inquirycontext, ifid, binding, objectuuid, annotation)).toInt()
}

public fun RpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtEpUnregister", longArrayOf(epbinding, ifid, binding, objectuuid)).toInt()
}

public fun RpcMgmtInqComTimeout(binding: Long, timeout: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtInqComTimeout", longArrayOf(binding, timeout)).toInt()
}

public fun RpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtInqDefaultProtectLevel", longArrayOf(authnsvc.toLong(), authnlevel)).toInt()
}

public fun RpcMgmtInqIfIds(binding: Long, ifidvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtInqIfIds", longArrayOf(binding, ifidvector)).toInt()
}

public fun RpcMgmtInqServerPrincNameA(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtInqServerPrincNameA", longArrayOf(binding, authnsvc.toLong(), serverprincname)).toInt()
}

public fun RpcMgmtInqServerPrincNameW(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtInqServerPrincNameW", longArrayOf(binding, authnsvc.toLong(), serverprincname)).toInt()
}

public fun RpcMgmtInqStats(binding: Long, statistics: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtInqStats", longArrayOf(binding, statistics)).toInt()
}

public fun RpcMgmtIsServerListening(binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtIsServerListening", longArrayOf(binding)).toInt()
}

public fun RpcMgmtSetAuthorizationFn(authorizationfn: RPC_MGMT_AUTHORIZATION_FN): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtSetAuthorizationFn", longArrayOf(Win32DynamicFfi.objectSlot(authorizationfn))).toInt()
}

public fun RpcMgmtSetCancelTimeout(timeout: Int): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtSetCancelTimeout", longArrayOf(timeout.toLong())).toInt()
}

public fun RpcMgmtSetComTimeout(binding: Long, timeout: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtSetComTimeout", longArrayOf(binding, timeout.toLong())).toInt()
}

public fun RpcMgmtSetServerStackSize(threadstacksize: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtSetServerStackSize", longArrayOf(threadstacksize.toLong())).toInt()
}

public fun RpcMgmtStatsVectorFree(statsvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtStatsVectorFree", longArrayOf(statsvector)).toInt()
}

public fun RpcMgmtStopServerListening(binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtStopServerListening", longArrayOf(binding)).toInt()
}

public fun RpcMgmtWaitServerListen(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcMgmtWaitServerListen", longArrayOf()).toInt()
}

public fun RpcNetworkInqProtseqsA(protseqvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcNetworkInqProtseqsA", longArrayOf(protseqvector)).toInt()
}

public fun RpcNetworkInqProtseqsW(protseqvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcNetworkInqProtseqsW", longArrayOf(protseqvector)).toInt()
}

public fun RpcNetworkIsProtseqValidA(protseq: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcNetworkIsProtseqValidA", longArrayOf(protseq)).toInt()
}

public fun RpcNetworkIsProtseqValidW(protseq: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcNetworkIsProtseqValidW", longArrayOf(protseq)).toInt()
}

public fun RpcNsBindingExportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingExportA", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, bindingvec, objectuuidvec)).toInt()
}

public fun RpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingExportPnPA", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objectvector)).toInt()
}

public fun RpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingExportPnPW", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objectvector)).toInt()
}

public fun RpcNsBindingExportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingExportW", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, bindingvec, objectuuidvec)).toInt()
}

public fun RpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingImportBeginA", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objuuid, importcontext)).toInt()
}

public fun RpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingImportBeginW", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objuuid, importcontext)).toInt()
}

public fun RpcNsBindingImportDone(importcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingImportDone", longArrayOf(importcontext)).toInt()
}

public fun RpcNsBindingImportNext(importcontext: Long, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingImportNext", longArrayOf(importcontext, binding)).toInt()
}

public fun RpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcNsBindingInqEntryNameA", longArrayOf(binding, entrynamesyntax.toLong(), entryname)).toInt()
}

public fun RpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcNsBindingInqEntryNameW", longArrayOf(binding, entrynamesyntax.toLong(), entryname)).toInt()
}

public fun RpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingLookupBeginA", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objuuid, bindingmaxcount.toLong(), lookupcontext)).toInt()
}

public fun RpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingLookupBeginW", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objuuid, bindingmaxcount.toLong(), lookupcontext)).toInt()
}

public fun RpcNsBindingLookupDone(lookupcontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingLookupDone", longArrayOf(lookupcontext)).toInt()
}

public fun RpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingLookupNext", longArrayOf(lookupcontext, bindingvec)).toInt()
}

public fun RpcNsBindingSelect(bindingvec: Long, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingSelect", longArrayOf(bindingvec, binding)).toInt()
}

public fun RpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingUnexportA", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objectuuidvec)).toInt()
}

public fun RpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingUnexportPnPA", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objectvector)).toInt()
}

public fun RpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingUnexportPnPW", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objectvector)).toInt()
}

public fun RpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsBindingUnexportW", longArrayOf(entrynamesyntax.toLong(), entryname, ifspec, objectuuidvec)).toInt()
}

public fun RpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: PCSTR, expandedname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsEntryExpandNameA", longArrayOf(entrynamesyntax.toLong(), entryname, expandedname)).toInt()
}

public fun RpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: PCWSTR, expandedname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsEntryExpandNameW", longArrayOf(entrynamesyntax.toLong(), entryname, expandedname)).toInt()
}

public fun RpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: PCSTR, inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsEntryObjectInqBeginA", longArrayOf(entrynamesyntax.toLong(), entryname, inquirycontext)).toInt()
}

public fun RpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: PCWSTR, inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsEntryObjectInqBeginW", longArrayOf(entrynamesyntax.toLong(), entryname, inquirycontext)).toInt()
}

public fun RpcNsEntryObjectInqDone(inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsEntryObjectInqDone", longArrayOf(inquirycontext)).toInt()
}

public fun RpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsEntryObjectInqNext", longArrayOf(inquirycontext, objuuid)).toInt()
}

public fun RpcNsGroupDeleteA(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupDeleteA", longArrayOf(groupnamesyntax.toLong(), groupname)).toInt()
}

public fun RpcNsGroupDeleteW(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupDeleteW", longArrayOf(groupnamesyntax.toLong(), groupname)).toInt()
}

public fun RpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrAddA", longArrayOf(groupnamesyntax.toLong(), groupname, membernamesyntax.toLong(), membername)).toInt()
}

public fun RpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrAddW", longArrayOf(groupnamesyntax.toLong(), groupname, membernamesyntax.toLong(), membername)).toInt()
}

public fun RpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrInqBeginA", longArrayOf(groupnamesyntax.toLong(), groupname, membernamesyntax.toLong(), inquirycontext)).toInt()
}

public fun RpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrInqBeginW", longArrayOf(groupnamesyntax.toLong(), groupname, membernamesyntax.toLong(), inquirycontext)).toInt()
}

public fun RpcNsGroupMbrInqDone(inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrInqDone", longArrayOf(inquirycontext)).toInt()
}

public fun RpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrInqNextA", longArrayOf(inquirycontext, membername)).toInt()
}

public fun RpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrInqNextW", longArrayOf(inquirycontext, membername)).toInt()
}

public fun RpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrRemoveA", longArrayOf(groupnamesyntax.toLong(), groupname, membernamesyntax.toLong(), membername)).toInt()
}

public fun RpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsGroupMbrRemoveW", longArrayOf(groupnamesyntax.toLong(), groupname, membernamesyntax.toLong(), membername)).toInt()
}

public fun RpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtBindingUnexportA", longArrayOf(entrynamesyntax.toLong(), entryname, ifid, versoption.toLong(), objectuuidvec)).toInt()
}

public fun RpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtBindingUnexportW", longArrayOf(entrynamesyntax.toLong(), entryname, ifid, versoption.toLong(), objectuuidvec)).toInt()
}

public fun RpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtEntryCreateA", longArrayOf(entrynamesyntax.toLong(), entryname)).toInt()
}

public fun RpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtEntryCreateW", longArrayOf(entrynamesyntax.toLong(), entryname)).toInt()
}

public fun RpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtEntryDeleteA", longArrayOf(entrynamesyntax.toLong(), entryname)).toInt()
}

public fun RpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtEntryDeleteW", longArrayOf(entrynamesyntax.toLong(), entryname)).toInt()
}

public fun RpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: PCSTR, ifidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtEntryInqIfIdsA", longArrayOf(entrynamesyntax.toLong(), entryname, ifidvec)).toInt()
}

public fun RpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: PCWSTR, ifidvec: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtEntryInqIfIdsW", longArrayOf(entrynamesyntax.toLong(), entryname, ifidvec)).toInt()
}

public fun RpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtHandleSetExpAge", longArrayOf(nshandle, expirationage.toLong())).toInt()
}

public fun RpcNsMgmtInqExpAge(expirationage: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtInqExpAge", longArrayOf(expirationage)).toInt()
}

public fun RpcNsMgmtSetExpAge(expirationage: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsMgmtSetExpAge", longArrayOf(expirationage.toLong())).toInt()
}

public fun RpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileDeleteA", longArrayOf(profilenamesyntax.toLong(), profilename)).toInt()
}

public fun RpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileDeleteW", longArrayOf(profilenamesyntax.toLong(), profilename)).toInt()
}

public fun RpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR, priority: UInt, annotation: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltAddA", longArrayOf(profilenamesyntax.toLong(), profilename, ifid, membernamesyntax.toLong(), membername, priority.toLong(), annotation)).toInt()
}

public fun RpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR, priority: UInt, annotation: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltAddW", longArrayOf(profilenamesyntax.toLong(), profilename, ifid, membernamesyntax.toLong(), membername, priority.toLong(), annotation)).toInt()
}

public fun RpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: PCSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCSTR, inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltInqBeginA", longArrayOf(profilenamesyntax.toLong(), profilename, inquirytype.toLong(), ifid, versoption.toLong(), membernamesyntax.toLong(), membername, inquirycontext)).toInt()
}

public fun RpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: PCWSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCWSTR, inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltInqBeginW", longArrayOf(profilenamesyntax.toLong(), profilename, inquirytype.toLong(), ifid, versoption.toLong(), membernamesyntax.toLong(), membername, inquirycontext)).toInt()
}

public fun RpcNsProfileEltInqDone(inquirycontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltInqDone", longArrayOf(inquirycontext)).toInt()
}

public fun RpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltInqNextA", longArrayOf(inquirycontext, ifid, membername, priority, annotation)).toInt()
}

public fun RpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltInqNextW", longArrayOf(inquirycontext, ifid, membername, priority, annotation)).toInt()
}

public fun RpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltRemoveA", longArrayOf(profilenamesyntax.toLong(), profilename, ifid, membernamesyntax.toLong(), membername)).toInt()
}

public fun RpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcns4.dll", "RpcNsProfileEltRemoveW", longArrayOf(profilenamesyntax.toLong(), profilename, ifid, membernamesyntax.toLong(), membername)).toInt()
}

public fun RpcObjectInqType(objuuid: Long, typeuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcObjectInqType", longArrayOf(objuuid, typeuuid)).toInt()
}

public fun RpcObjectSetInqFn(inquiryfn: RPC_OBJECT_INQ_FN): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcObjectSetInqFn", longArrayOf(Win32DynamicFfi.objectSlot(inquiryfn))).toInt()
}

public fun RpcObjectSetType(objuuid: Long, typeuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcObjectSetType", longArrayOf(objuuid, typeuuid)).toInt()
}

public fun RpcProtseqVectorFreeA(protseqvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcProtseqVectorFreeA", longArrayOf(protseqvector)).toInt()
}

public fun RpcProtseqVectorFreeW(protseqvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcProtseqVectorFreeW", longArrayOf(protseqvector)).toInt()
}

public fun RpcRaiseException(exception: RPC_STATUS) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcRaiseException", longArrayOf(exception.toLong()))
}

public fun RpcRevertContainerImpersonation(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcRevertContainerImpersonation", longArrayOf()).toInt()
}

public fun RpcRevertToSelf(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcRevertToSelf", longArrayOf()).toInt()
}

public fun RpcRevertToSelfEx(bindinghandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcRevertToSelfEx", longArrayOf(bindinghandle)).toInt()
}

public fun RpcServerCompleteSecurityCallback(bindinghandle: Long, status: RPC_STATUS): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerCompleteSecurityCallback", longArrayOf(bindinghandle, status.toLong())).toInt()
}

public fun RpcServerInqBindingHandle(binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqBindingHandle", longArrayOf(binding)).toInt()
}

public fun RpcServerInqBindings(bindingvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqBindings", longArrayOf(bindingvector)).toInt()
}

public fun RpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqBindingsEx", longArrayOf(securitydescriptor, bindingvector)).toInt()
}

public fun RpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqCallAttributesA", longArrayOf(clientbinding, rpccallattributes)).toInt()
}

public fun RpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqCallAttributesW", longArrayOf(clientbinding, rpccallattributes)).toInt()
}

public fun RpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqDefaultPrincNameA", longArrayOf(authnsvc.toLong(), princname)).toInt()
}

public fun RpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqDefaultPrincNameW", longArrayOf(authnsvc.toLong(), princname)).toInt()
}

public fun RpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInqIf", longArrayOf(ifspec, mgrtypeuuid, mgrepv)).toInt()
}

public fun RpcServerInterfaceGroupActivate(ifgroup: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInterfaceGroupActivate", longArrayOf(ifgroup)).toInt()
}

public fun RpcServerInterfaceGroupClose(ifgroup: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInterfaceGroupClose", longArrayOf(ifgroup)).toInt()
}

public fun RpcServerInterfaceGroupCreateA(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInterfaceGroupCreateA", longArrayOf(interfaces, numifs.toLong(), endpoints, numendpoints.toLong(), idleperiod.toLong(), Win32DynamicFfi.objectSlot(idlecallbackfn), idlecallbackcontext, ifgroup)).toInt()
}

public fun RpcServerInterfaceGroupCreateW(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInterfaceGroupCreateW", longArrayOf(interfaces, numifs.toLong(), endpoints, numendpoints.toLong(), idleperiod.toLong(), Win32DynamicFfi.objectSlot(idlecallbackfn), idlecallbackcontext, ifgroup)).toInt()
}

public fun RpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInterfaceGroupDeactivate", longArrayOf(ifgroup, forcedeactivation.toLong())).toInt()
}

public fun RpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerInterfaceGroupInqBindings", longArrayOf(ifgroup, bindingvector)).toInt()
}

public fun RpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerListen", longArrayOf(minimumcallthreads.toLong(), maxcalls.toLong(), dontwait.toLong())).toInt()
}

public fun RpcServerRegisterAuthInfoA(serverprincname: PCSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerRegisterAuthInfoA", longArrayOf(serverprincname, authnsvc.toLong(), Win32DynamicFfi.objectSlot(getkeyfn), arg)).toInt()
}

public fun RpcServerRegisterAuthInfoW(serverprincname: PCWSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerRegisterAuthInfoW", longArrayOf(serverprincname, authnsvc.toLong(), Win32DynamicFfi.objectSlot(getkeyfn), arg)).toInt()
}

public fun RpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerRegisterIf", longArrayOf(ifspec, mgrtypeuuid, mgrepv)).toInt()
}

public fun RpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RPC_IF_CALLBACK_FN): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerRegisterIf2", longArrayOf(ifspec, mgrtypeuuid, mgrepv, flags.toLong(), maxcalls.toLong(), maxrpcsize.toLong(), Win32DynamicFfi.objectSlot(ifcallbackfn))).toInt()
}

public fun RpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RPC_IF_CALLBACK_FN, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerRegisterIf3", longArrayOf(ifspec, mgrtypeuuid, mgrepv, flags.toLong(), maxcalls.toLong(), maxrpcsize.toLong(), Win32DynamicFfi.objectSlot(ifcallback), securitydescriptor)).toInt()
}

public fun RpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, ifcallback: RPC_IF_CALLBACK_FN): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerRegisterIfEx", longArrayOf(ifspec, mgrtypeuuid, mgrepv, flags.toLong(), maxcalls.toLong(), Win32DynamicFfi.objectSlot(ifcallback))).toInt()
}

public fun RpcServerSubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationtype: RPC_NOTIFICATION_TYPES, notificationinfo: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerSubscribeForNotification", longArrayOf(binding, notification.toLong(), notificationtype.toLong(), notificationinfo)).toInt()
}

public fun RpcServerTestCancel(bindinghandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerTestCancel", longArrayOf(bindinghandle)).toInt()
}

public fun RpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: UInt): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUnregisterIf", longArrayOf(ifspec, mgrtypeuuid, waitforcallstocomplete.toLong())).toInt()
}

public fun RpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUnregisterIfEx", longArrayOf(ifspec, mgrtypeuuid, rundowncontexthandles.toLong())).toInt()
}

public fun RpcServerUnsubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationsqueued: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUnsubscribeForNotification", longArrayOf(binding, notification.toLong(), notificationsqueued)).toInt()
}

public fun RpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseAllProtseqs", longArrayOf(maxcalls.toLong(), securitydescriptor)).toInt()
}

public fun RpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseAllProtseqsEx", longArrayOf(maxcalls.toLong(), securitydescriptor, policy)).toInt()
}

public fun RpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseAllProtseqsIf", longArrayOf(maxcalls.toLong(), ifspec, securitydescriptor)).toInt()
}

public fun RpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseAllProtseqsIfEx", longArrayOf(maxcalls.toLong(), ifspec, securitydescriptor, policy)).toInt()
}

public fun RpcServerUseProtseqA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqA", longArrayOf(protseq, maxcalls.toLong(), securitydescriptor)).toInt()
}

public fun RpcServerUseProtseqEpA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqEpA", longArrayOf(protseq, maxcalls.toLong(), endpoint, securitydescriptor)).toInt()
}

public fun RpcServerUseProtseqEpExA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqEpExA", longArrayOf(protseq, maxcalls.toLong(), endpoint, securitydescriptor, policy)).toInt()
}

public fun RpcServerUseProtseqEpExW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqEpExW", longArrayOf(protseq, maxcalls.toLong(), endpoint, securitydescriptor, policy)).toInt()
}

public fun RpcServerUseProtseqEpW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqEpW", longArrayOf(protseq, maxcalls.toLong(), endpoint, securitydescriptor)).toInt()
}

public fun RpcServerUseProtseqExA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqExA", longArrayOf(protseq, maxcalls.toLong(), securitydescriptor, policy)).toInt()
}

public fun RpcServerUseProtseqExW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqExW", longArrayOf(protseq, maxcalls.toLong(), securitydescriptor, policy)).toInt()
}

public fun RpcServerUseProtseqIfA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqIfA", longArrayOf(protseq, maxcalls.toLong(), ifspec, securitydescriptor)).toInt()
}

public fun RpcServerUseProtseqIfExA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqIfExA", longArrayOf(protseq, maxcalls.toLong(), ifspec, securitydescriptor, policy)).toInt()
}

public fun RpcServerUseProtseqIfExW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqIfExW", longArrayOf(protseq, maxcalls.toLong(), ifspec, securitydescriptor, policy)).toInt()
}

public fun RpcServerUseProtseqIfW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqIfW", longArrayOf(protseq, maxcalls.toLong(), ifspec, securitydescriptor)).toInt()
}

public fun RpcServerUseProtseqW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerUseProtseqW", longArrayOf(protseq, maxcalls.toLong(), securitydescriptor)).toInt()
}

public fun RpcServerYield() {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcServerYield", longArrayOf())
}

public fun RpcSmAllocate(size: ULong, pstatus: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmAllocate", longArrayOf(size.toLong(), pstatus))
}

public fun RpcSmClientFree(pnodetofree: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmClientFree", longArrayOf(pnodetofree)).toInt()
}

public fun RpcSmDestroyClientContext(contexthandle: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmDestroyClientContext", longArrayOf(contexthandle)).toInt()
}

public fun RpcSmDisableAllocate(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmDisableAllocate", longArrayOf()).toInt()
}

public fun RpcSmEnableAllocate(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmEnableAllocate", longArrayOf()).toInt()
}

public fun RpcSmFree(nodetofree: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmFree", longArrayOf(nodetofree)).toInt()
}

public fun RpcSmGetThreadHandle(pstatus: Long): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmGetThreadHandle", longArrayOf(pstatus))
}

public fun RpcSmSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmSetClientAllocFree", longArrayOf(Win32DynamicFfi.objectSlot(clientalloc), Win32DynamicFfi.objectSlot(clientfree))).toInt()
}

public fun RpcSmSetThreadHandle(id: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmSetThreadHandle", longArrayOf(id)).toInt()
}

public fun RpcSmSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSmSwapClientAllocFree", longArrayOf(Win32DynamicFfi.objectSlot(clientalloc), Win32DynamicFfi.objectSlot(clientfree), oldclientalloc, oldclientfree)).toInt()
}

public fun RpcSsAllocate(size: ULong): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsAllocate", longArrayOf(size.toLong()))
}

public fun RpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsContextLockExclusive", longArrayOf(serverbindinghandle, usercontext)).toInt()
}

public fun RpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsContextLockShared", longArrayOf(serverbindinghandle, usercontext)).toInt()
}

public fun RpcSsDestroyClientContext(contexthandle: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsDestroyClientContext", longArrayOf(contexthandle))
}

public fun RpcSsDisableAllocate() {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsDisableAllocate", longArrayOf())
}

public fun RpcSsDontSerializeContext() {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsDontSerializeContext", longArrayOf())
}

public fun RpcSsEnableAllocate() {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsEnableAllocate", longArrayOf())
}

public fun RpcSsFree(nodetofree: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsFree", longArrayOf(nodetofree))
}

public fun RpcSsGetContextBinding(contexthandle: Long, binding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsGetContextBinding", longArrayOf(contexthandle, binding)).toInt()
}

public fun RpcSsGetThreadHandle(): Long {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsGetThreadHandle", longArrayOf())
}

public fun RpcSsSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsSetClientAllocFree", longArrayOf(Win32DynamicFfi.objectSlot(clientalloc), Win32DynamicFfi.objectSlot(clientfree)))
}

public fun RpcSsSetThreadHandle(id: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsSetThreadHandle", longArrayOf(id))
}

public fun RpcSsSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcSsSwapClientAllocFree", longArrayOf(Win32DynamicFfi.objectSlot(clientalloc), Win32DynamicFfi.objectSlot(clientfree), oldclientalloc, oldclientfree))
}

public fun RpcStringBindingComposeA(objuuid: PCSTR, protseq: PCSTR, networkaddr: PCSTR, endpoint: PCSTR, options: PCSTR, stringbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcStringBindingComposeA", longArrayOf(objuuid, protseq, networkaddr, endpoint, options, stringbinding)).toInt()
}

public fun RpcStringBindingComposeW(objuuid: PCWSTR, protseq: PCWSTR, networkaddr: PCWSTR, endpoint: PCWSTR, options: PCWSTR, stringbinding: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcStringBindingComposeW", longArrayOf(objuuid, protseq, networkaddr, endpoint, options, stringbinding)).toInt()
}

public fun RpcStringBindingParseA(stringbinding: PCSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcStringBindingParseA", longArrayOf(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions)).toInt()
}

public fun RpcStringBindingParseW(stringbinding: PCWSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcStringBindingParseW", longArrayOf(stringbinding, objuuid, protseq, networkaddr, endpoint, networkoptions)).toInt()
}

public fun RpcStringFreeA(string: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcStringFreeA", longArrayOf(string)).toInt()
}

public fun RpcStringFreeW(string: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcStringFreeW", longArrayOf(string)).toInt()
}

public fun RpcTestCancel(): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "RpcTestCancel", longArrayOf()).toInt()
}

public fun RpcUserFree(asynchandle: Long, pbuffer: Long) {
    Win32DynamicFfi.invoke("rpcrt4.dll", "RpcUserFree", longArrayOf(asynchandle, pbuffer))
}

public fun UuidCompare(uuid1: Long, uuid2: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidCompare", longArrayOf(uuid1, uuid2, status)).toInt()
}

public fun UuidCreate(uuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidCreate", longArrayOf(uuid)).toInt()
}

public fun UuidCreateNil(niluuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidCreateNil", longArrayOf(niluuid)).toInt()
}
