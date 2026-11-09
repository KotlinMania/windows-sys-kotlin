@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun DceErrorInqTextA(rpcstatus: RPC_STATUS, errortext: PSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_DceErrorInqTextA(rpcstatus, errortext.toCPointer<ByteVar>())

public actual fun DceErrorInqTextW(rpcstatus: RPC_STATUS, errortext: PWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_DceErrorInqTextW(rpcstatus, errortext.toCPointer<ByteVar>())

public actual fun IUnknown_AddRef_Proxy(thisRef: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_IUnknown_AddRef_Proxy(thisRef.toCPointer<ByteVar>())

public actual fun IUnknown_QueryInterface_Proxy(thisRef: Long, riid: Long, ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_IUnknown_QueryInterface_Proxy(thisRef.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppvobject.toCPointer<ByteVar>())

public actual fun IUnknown_Release_Proxy(thisRef: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_IUnknown_Release_Proxy(thisRef.toCPointer<ByteVar>())

public actual fun I_RpcAllocate(size: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcAllocate(size)?.toLong() ?: 0L

public actual fun I_RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcAsyncAbortCall(pasync.toCPointer<ByteVar>(), exceptioncode)

public actual fun I_RpcAsyncSetHandle(message: Long, pasync: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcAsyncSetHandle(message.toCPointer<ByteVar>(), pasync.toCPointer<ByteVar>())

public actual fun I_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingCopy(sourcebinding.toCPointer<ByteVar>(), destinationbinding.toCPointer<ByteVar>())

public actual fun I_RpcBindingCreateNP(servername: PCWSTR, servicename: PCWSTR, networkoptions: PCWSTR, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingCreateNP(servername.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), networkoptions.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun I_RpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingHandleToAsyncHandle(binding.toCPointer<ByteVar>(), asynchandle.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqClientTokenAttributes(binding.toCPointer<ByteVar>(), tokenid.toCPointer<ByteVar>(), authenticationid.toCPointer<ByteVar>(), modifiedid.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointA(binding.toCPointer<ByteVar>(), dynamicendpoint.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointW(binding.toCPointer<ByteVar>(), dynamicendpoint.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqLocalClientPID(binding: Long, pid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqLocalClientPID(binding.toCPointer<ByteVar>(), pid.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqMarshalledTargetInfo(binding.toCPointer<ByteVar>(), marshalledtargetinfosize.toCPointer<ByteVar>(), marshalledtargetinfo.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContext(binding.toCPointer<ByteVar>(), securitycontexthandle.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContextKeyInfo(binding.toCPointer<ByteVar>(), keyinfo.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqTransportType(binding: Long, type: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqTransportType(binding.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun I_RpcBindingInqWireIdForSnego(binding: Long, wireid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingInqWireIdForSnego(binding.toCPointer<ByteVar>(), wireid.toCPointer<ByteVar>())

public actual fun I_RpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingIsClientLocal(bindinghandle.toCPointer<ByteVar>(), clientlocalflag.toCPointer<ByteVar>())

public actual fun I_RpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingIsServerLocal(binding.toCPointer<ByteVar>(), serverlocalflag.toCPointer<ByteVar>())

public actual fun I_RpcBindingSetPrivateOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingSetPrivateOption(hbinding.toCPointer<ByteVar>(), option, optionvalue)

public actual fun I_RpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcBindingToStaticStringBindingW(binding.toCPointer<ByteVar>(), stringbinding.toCPointer<ByteVar>())

public actual fun I_RpcClearMutex(mutex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcClearMutex(mutex.toCPointer<ByteVar>())
}

public actual fun I_RpcDeleteMutex(mutex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcDeleteMutex(mutex.toCPointer<ByteVar>())
}

public actual fun I_RpcExceptionFilter(exceptioncode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcExceptionFilter(exceptioncode)

public actual fun I_RpcFree(obj: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcFree(obj.toCPointer<ByteVar>())
}

public actual fun I_RpcFreeBuffer(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcFreeBuffer(message.toCPointer<ByteVar>())

public actual fun I_RpcFreePipeBuffer(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcFreePipeBuffer(message.toCPointer<ByteVar>())

public actual fun I_RpcGetBuffer(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcGetBuffer(message.toCPointer<ByteVar>())

public actual fun I_RpcGetBufferWithObject(message: Long, objectuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcGetBufferWithObject(message.toCPointer<ByteVar>(), objectuuid.toCPointer<ByteVar>())

public actual fun I_RpcGetCurrentCallHandle(): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcGetCurrentCallHandle()?.toLong() ?: 0L

public actual fun I_RpcGetDefaultSD(ppsecuritydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcGetDefaultSD(ppsecuritydescriptor.toCPointer<ByteVar>())

public actual fun I_RpcGetExtendedError(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcGetExtendedError()

public actual fun I_RpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: UInt, transfersyntaxcount: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcIfInqTransferSyntaxes(rpcifhandle.toCPointer<ByteVar>(), transfersyntaxes.toCPointer<ByteVar>(), transfersyntaxsize, transfersyntaxcount.toCPointer<ByteVar>())

public actual fun I_RpcMapWin32Status(status: RPC_STATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcMapWin32Status(status)

public actual fun I_RpcMgmtEnableDedicatedThreadPool(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcMgmtEnableDedicatedThreadPool()

public actual fun I_RpcNegotiateTransferSyntax(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNegotiateTransferSyntax(message.toCPointer<ByteVar>())

public actual fun I_RpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameA(binding.toCPointer<ByteVar>(), entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun I_RpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameW(binding.toCPointer<ByteVar>(), entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun I_RpcNsGetBuffer(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNsGetBuffer(message.toCPointer<ByteVar>())

public actual fun I_RpcNsInterfaceExported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNsInterfaceExported(entrynamesyntax, entryname.toCPointer<ByteVar>(), rpcinterfaceinformation.toCPointer<ByteVar>())

public actual fun I_RpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNsInterfaceUnexported(entrynamesyntax, entryname.toCPointer<ByteVar>(), rpcinterfaceinformation.toCPointer<ByteVar>())

public actual fun I_RpcNsRaiseException(message: Long, status: RPC_STATUS) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNsRaiseException(message.toCPointer<ByteVar>(), status)
}

public actual fun I_RpcNsSendReceive(message: Long, handle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcNsSendReceive(message.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun I_RpcOpenClientProcess(binding: Long, desiredaccess: UInt, clientprocess: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcOpenClientProcess(binding.toCPointer<ByteVar>(), desiredaccess, clientprocess.toCPointer<ByteVar>())

public actual fun I_RpcPauseExecution(milliseconds: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcPauseExecution(milliseconds)
}

public actual fun I_RpcReBindBuffer(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcReBindBuffer(message.toCPointer<ByteVar>())

public actual fun I_RpcReallocPipeBuffer(message: Long, newsize: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcReallocPipeBuffer(message.toCPointer<ByteVar>(), newsize)

public actual fun I_RpcReceive(message: Long, size: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcReceive(message.toCPointer<ByteVar>(), size)

public actual fun I_RpcRecordCalloutFailure(rpcstatus: RPC_STATUS, calloutstate: Long, dllname: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcRecordCalloutFailure(rpcstatus, calloutstate.toCPointer<ByteVar>(), dllname.toCPointer<ByteVar>())
}

public actual fun I_RpcRequestMutex(mutex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcRequestMutex(mutex.toCPointer<ByteVar>())
}

public actual fun I_RpcSend(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcSend(message.toCPointer<ByteVar>())

public actual fun I_RpcSendReceive(message: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcSendReceive(message.toCPointer<ByteVar>())

public actual fun I_RpcServerCheckClientRestriction(context: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerCheckClientRestriction(context.toCPointer<ByteVar>())

public actual fun I_RpcServerDisableExceptionFilter(): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerDisableExceptionFilter()

public actual fun I_RpcServerGetAssociationID(binding: Long, associationid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerGetAssociationID(binding.toCPointer<ByteVar>(), associationid.toCPointer<ByteVar>())

public actual fun I_RpcServerInqAddressChangeFn(): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerInqAddressChangeFn()?.toLong() ?: 0L

public actual fun I_RpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerInqLocalConnAddress(binding.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>(), addressformat.toCPointer<ByteVar>())

public actual fun I_RpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerInqRemoteConnAddress(binding.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>(), addressformat.toCPointer<ByteVar>())

public actual fun I_RpcServerInqTransportType(type: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerInqTransportType(type.toCPointer<ByteVar>())

public actual fun I_RpcServerRegisterForwardFunction(pforwardfunction: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerRegisterForwardFunction(pforwardfunction.toCPointer<ByteVar>())

public actual fun I_RpcServerSetAddressChangeFn(paddresschangefn: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerSetAddressChangeFn(paddresschangefn.toCPointer<ByteVar>())

public actual fun I_RpcServerStartService(protseq: PCWSTR, endpoint: PCWSTR, ifspec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerStartService(protseq.toCPointer<ByteVar>(), endpoint.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>())

public actual fun I_RpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification(binding.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>())

public actual fun I_RpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification2(binding.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>(), subscriptionid.toCPointer<ByteVar>())

public actual fun I_RpcServerUnsubscribeForDisconnectNotification(binding: Long, subscriptionid: GUID): RPC_STATUS =
    0

public actual fun I_RpcServerUseProtseq2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2A(networkaddress.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), maxcalls, securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun I_RpcServerUseProtseq2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2W(networkaddress.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), maxcalls, securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun I_RpcServerUseProtseqEp2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2A(networkaddress.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), maxcalls, endpoint.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun I_RpcServerUseProtseqEp2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2W(networkaddress.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), maxcalls, endpoint.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun I_RpcSessionStrictContextHandle() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcSessionStrictContextHandle()
}

public actual fun I_RpcSsDontSerializeContext() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcSsDontSerializeContext()
}

public actual fun I_RpcSystemHandleTypeSpecificWork(handle: Long, actualtype: UByte, idltype: UByte, marshaldirection: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcSystemHandleTypeSpecificWork(handle.toCPointer<ByteVar>(), actualtype, idltype, marshaldirection)

public actual fun I_RpcTurnOnEEInfoPropagation(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_RpcTurnOnEEInfoPropagation()

public actual fun I_UuidCreate(uuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_I_UuidCreate(uuid.toCPointer<ByteVar>())

public actual fun MesBufferHandleReset(handle: Long, handlestyle: UInt, operation: MIDL_ES_CODE, pbuffer: Long, buffersize: UInt, pencodedsize: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesBufferHandleReset(handle.toCPointer<ByteVar>(), handlestyle, operation, pbuffer.toCPointer<ByteVar>(), buffersize, pencodedsize.toCPointer<ByteVar>())

public actual fun MesDecodeBufferHandleCreate(buffer: PCSTR, buffersize: UInt, phandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesDecodeBufferHandleCreate(buffer.toCPointer<ByteVar>(), buffersize, phandle.toCPointer<ByteVar>())

public actual fun MesDecodeIncrementalHandleCreate(userstate: Long, readfn: MIDL_ES_READ, phandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesDecodeIncrementalHandleCreate(userstate.toCPointer<ByteVar>(), readfn.toLong().toCPointer<ByteVar>(), phandle.toCPointer<ByteVar>())

public actual fun MesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesEncodeDynBufferHandleCreate(pbuffer.toCPointer<ByteVar>(), pencodedsize.toCPointer<ByteVar>(), phandle.toCPointer<ByteVar>())

public actual fun MesEncodeFixedBufferHandleCreate(pbuffer: PSTR, buffersize: UInt, pencodedsize: Long, phandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesEncodeFixedBufferHandleCreate(pbuffer.toCPointer<ByteVar>(), buffersize, pencodedsize.toCPointer<ByteVar>(), phandle.toCPointer<ByteVar>())

public actual fun MesEncodeIncrementalHandleCreate(userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, phandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesEncodeIncrementalHandleCreate(userstate.toCPointer<ByteVar>(), allocfn.toLong().toCPointer<ByteVar>(), writefn.toLong().toCPointer<ByteVar>(), phandle.toCPointer<ByteVar>())

public actual fun MesHandleFree(handle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesHandleFree(handle.toCPointer<ByteVar>())

public actual fun MesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, readfn: MIDL_ES_READ, operation: MIDL_ES_CODE): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesIncrementalHandleReset(handle.toCPointer<ByteVar>(), userstate.toCPointer<ByteVar>(), allocfn.toLong().toCPointer<ByteVar>(), writefn.toLong().toCPointer<ByteVar>(), readfn.toLong().toCPointer<ByteVar>(), operation)

public actual fun MesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_MesInqProcEncodingId(handle.toCPointer<ByteVar>(), pinterfaceid.toCPointer<ByteVar>(), pprocnum.toCPointer<ByteVar>())

public actual fun NDRCContextBinding(ccontext: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRCContextBinding(ccontext)?.toLong() ?: 0L

public actual fun NDRCContextMarshall(ccontext: Long, pbuff: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRCContextMarshall(ccontext, pbuff.toCPointer<ByteVar>())
}

public actual fun NDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRCContextUnmarshall(pccontext.toCPointer<ByteVar>(), hbinding.toCPointer<ByteVar>(), pbuff.toCPointer<ByteVar>(), datarepresentation)
}

public actual fun NDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRSContextMarshall(ccontext.toCPointer<ByteVar>(), pbuff.toCPointer<ByteVar>(), userrundownin.toLong().toCPointer<ByteVar>())
}

public actual fun NDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN, ctxguard: Long, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRSContextMarshall2(bindinghandle.toCPointer<ByteVar>(), ccontext.toCPointer<ByteVar>(), pbuff.toCPointer<ByteVar>(), userrundownin.toLong().toCPointer<ByteVar>(), ctxguard.toCPointer<ByteVar>(), flags)
}

public actual fun NDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRSContextMarshallEx(bindinghandle.toCPointer<ByteVar>(), ccontext.toCPointer<ByteVar>(), pbuff.toCPointer<ByteVar>(), userrundownin.toLong().toCPointer<ByteVar>())
}

public actual fun NDRSContextUnmarshall(pbuff: Long, datarepresentation: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRSContextUnmarshall(pbuff.toCPointer<ByteVar>(), datarepresentation)?.toLong() ?: 0L

public actual fun NDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: UInt, ctxguard: Long, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRSContextUnmarshall2(bindinghandle.toCPointer<ByteVar>(), pbuff.toCPointer<ByteVar>(), datarepresentation, ctxguard.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun NDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NDRSContextUnmarshallEx(bindinghandle.toCPointer<ByteVar>(), pbuff.toCPointer<ByteVar>(), datarepresentation)?.toLong() ?: 0L

public actual fun Ndr64AsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64AsyncServerCall64(prpcmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_Ndr64AsyncServerCall64(prpcmsg.toCPointer<ByteVar>())
}

public actual fun Ndr64AsyncServerCallAll(prpcmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_Ndr64AsyncServerCallAll(prpcmsg.toCPointer<ByteVar>())
}

public actual fun Ndr64DcomAsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_Ndr64DcomAsyncStubCall(pthis.toCPointer<ByteVar>(), pchannel.toCPointer<ByteVar>(), prpcmsg.toCPointer<ByteVar>(), pdwstubphase.toCPointer<ByteVar>())

public actual fun NdrAllocate(pstubmsg: Long, len: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrAllocate(pstubmsg.toCPointer<ByteVar>(), len)?.toLong() ?: 0L

public actual fun NdrAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrAsyncServerCall(prpcmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrAsyncServerCall(prpcmsg.toCPointer<ByteVar>())
}

public actual fun NdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrByteCountPointerBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrByteCountPointerFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrByteCountPointerMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrByteCountPointerUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrClearOutParameters(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), argaddr.toCPointer<ByteVar>())
}

public actual fun NdrClientCall2(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientCall3(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrClientContextMarshall(pstubmsg.toCPointer<ByteVar>(), contexthandle, fcheck)
}

public actual fun NdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrClientContextUnmarshall(pstubmsg.toCPointer<ByteVar>(), pcontexthandle.toCPointer<ByteVar>(), bindhandle.toCPointer<ByteVar>())
}

public actual fun NdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrClientInitialize(prpcmsg.toCPointer<ByteVar>(), pstubmsg.toCPointer<ByteVar>(), pstubdescriptor.toCPointer<ByteVar>(), procnum)
}

public actual fun NdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrClientInitializeNew(prpcmsg.toCPointer<ByteVar>(), pstubmsg.toCPointer<ByteVar>(), pstubdescriptor.toCPointer<ByteVar>(), procnum)
}

public actual fun NdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexArrayBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexArrayFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexArrayMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexArrayMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexArrayUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexStructBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexStructFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexStructMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexStructMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrComplexStructUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantArrayBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantArrayFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantArrayMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantArrayMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantArrayUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStringBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStringMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStringMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStringUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStructBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStructFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStructMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStructMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantStructUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrContextHandleInitialize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrContextHandleSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConvert(pstubmsg: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConvert(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrConvert2(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), numberparams)
}

public actual fun NdrCorrelationFree(pstubmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrCorrelationFree(pstubmsg.toCPointer<ByteVar>())
}

public actual fun NdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: UInt, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrCorrelationInitialize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), cachesize, flags)
}

public actual fun NdrCorrelationPass(pstubmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrCorrelationPass(pstubmsg.toCPointer<ByteVar>())
}

public actual fun NdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrCreateServerInterfaceFromStub(pstub.toCPointer<ByteVar>(), pserverif.toCPointer<ByteVar>())

public actual fun NdrDcomAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrDcomAsyncStubCall(pthis.toCPointer<ByteVar>(), pchannel.toCPointer<ByteVar>(), prpcmsg.toCPointer<ByteVar>(), pdwstubphase.toCPointer<ByteVar>())

public actual fun NdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFixedArrayBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFixedArrayFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFixedArrayMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFixedArrayMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFixedArrayUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrFreeBuffer(pstubmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFreeBuffer(pstubmsg.toCPointer<ByteVar>())
}

public actual fun NdrFullPointerXlatFree(pxlattables: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFullPointerXlatFree(pxlattables.toCPointer<ByteVar>())
}

public actual fun NdrFullPointerXlatInit(numberofpointers: UInt, xlatside: XLAT_SIDE): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrFullPointerXlatInit(numberofpointers, xlatside)?.toLong() ?: 0L

public actual fun NdrGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrGetBuffer(pstubmsg.toCPointer<ByteVar>(), bufferlength, handle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrGetDcomProtocolVersion(pstubmsg.toCPointer<ByteVar>(), pversion.toCPointer<ByteVar>())

public actual fun NdrGetUserMarshalInfo(pflags: Long, informationlevel: UInt, pmarshalinfo: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrGetUserMarshalInfo(pflags.toCPointer<ByteVar>(), informationlevel, pmarshalinfo.toCPointer<ByteVar>())

public actual fun NdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrInterfacePointerBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrInterfacePointerFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrInterfacePointerMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrInterfacePointerMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrInterfacePointerUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: RPC_STATUS): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMapCommAndFaultStatus(pstubmsg.toCPointer<ByteVar>(), pcommstatus.toCPointer<ByteVar>(), pfaultstatus.toCPointer<ByteVar>(), status)

public actual fun NdrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long) {
}

public actual fun NdrMesProcEncodeDecode2(handle: Long, pstubdesc: Long, pformatstring: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesProcEncodeDecode3(handle: Long, pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesSimpleTypeAlignSize(param0: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSize(param0.toCPointer<ByteVar>())

public actual fun NdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSizeAll(handle.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>())

public actual fun NdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecode(handle.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>(), size)
}

public actual fun NdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecodeAll(handle.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>(), size)
}

public actual fun NdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncode(handle.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>(), size)
}

public actual fun NdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncodeAll(handle.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>(), size)
}

public actual fun NdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize(handle.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pformatstring.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>())

public actual fun NdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize2(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pformatstring.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>())

public actual fun NdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize3(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>(), arrtypeoffset.toCPointer<ByteVar>(), ntypeindex, pobject.toCPointer<ByteVar>())

public actual fun NdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeDecode(handle.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pformatstring.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>())
}

public actual fun NdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeDecode2(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pformatstring.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>())
}

public actual fun NdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeDecode3(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>(), arrtypeoffset.toCPointer<ByteVar>(), ntypeindex, pobject.toCPointer<ByteVar>())
}

public actual fun NdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeEncode(handle.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pformatstring.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>())
}

public actual fun NdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeEncode2(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pformatstring.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>())
}

public actual fun NdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeEncode3(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>(), arrtypeoffset.toCPointer<ByteVar>(), ntypeindex, pobject.toCPointer<ByteVar>())
}

public actual fun NdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeFree2(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pstubdesc.toCPointer<ByteVar>(), pformatstring.toCPointer<ByteVar>(), pobject.toCPointer<ByteVar>())
}

public actual fun NdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrMesTypeFree3(handle.toCPointer<ByteVar>(), ppicklinginfo.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>(), arrtypeoffset.toCPointer<ByteVar>(), ntypeindex, pobject.toCPointer<ByteVar>())
}

public actual fun NdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonConformantStringBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonConformantStringMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonConformantStringMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonConformantStringUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrNsGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNsGetBuffer(pstubmsg.toCPointer<ByteVar>(), bufferlength, handle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrNsSendReceive(pstubmsg.toCPointer<ByteVar>(), pbufferend.toCPointer<ByteVar>(), pautohandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrOleAllocate(size: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrOleAllocate(size)?.toLong() ?: 0L

public actual fun NdrOleFree(nodetofree: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrOleFree(nodetofree.toCPointer<ByteVar>())
}

public actual fun NdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>())
}

public actual fun NdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>())
}

public actual fun NdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerInitialize(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>())
}

public actual fun NdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPointerBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPointerFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPointerMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrPointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPointerMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrPointerUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRangeUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrRpcSmClientAllocate(size: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRpcSmClientAllocate(size)?.toLong() ?: 0L

public actual fun NdrRpcSmClientFree(nodetofree: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRpcSmClientFree(nodetofree.toCPointer<ByteVar>())
}

public actual fun NdrRpcSmSetClientToOsf(pmessage: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRpcSmSetClientToOsf(pmessage.toCPointer<ByteVar>())
}

public actual fun NdrRpcSsDefaultAllocate(size: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRpcSsDefaultAllocate(size)?.toLong() ?: 0L

public actual fun NdrRpcSsDefaultFree(nodetofree: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRpcSsDefaultFree(nodetofree.toCPointer<ByteVar>())
}

public actual fun NdrRpcSsDisableAllocate(pmessage: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRpcSsDisableAllocate(pmessage.toCPointer<ByteVar>())
}

public actual fun NdrRpcSsEnableAllocate(pmessage: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrRpcSsEnableAllocate(pmessage.toCPointer<ByteVar>())
}

public actual fun NdrSendReceive(pstubmsg: Long, pbufferend: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSendReceive(pstubmsg.toCPointer<ByteVar>(), pbufferend.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrServerCall2(prpcmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerCall2(prpcmsg.toCPointer<ByteVar>())
}

public actual fun NdrServerCallAll(prpcmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerCallAll(prpcmsg.toCPointer<ByteVar>())
}

public actual fun NdrServerCallNdr64(prpcmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerCallNdr64(prpcmsg.toCPointer<ByteVar>())
}

public actual fun NdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerContextMarshall(pstubmsg.toCPointer<ByteVar>(), contexthandle.toCPointer<ByteVar>(), rundownroutine.toLong().toCPointer<ByteVar>())
}

public actual fun NdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerContextNewMarshall(pstubmsg.toCPointer<ByteVar>(), contexthandle.toCPointer<ByteVar>(), rundownroutine.toLong().toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerContextNewUnmarshall(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrServerContextUnmarshall(pstubmsg: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerContextUnmarshall(pstubmsg.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerInitialize(prpcmsg.toCPointer<ByteVar>(), pstubmsg.toCPointer<ByteVar>(), pstubdescriptor.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerInitializeMarshall(prpcmsg.toCPointer<ByteVar>(), pstubmsg.toCPointer<ByteVar>())
}

public actual fun NdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerInitializeNew(prpcmsg.toCPointer<ByteVar>(), pstubmsg.toCPointer<ByteVar>(), pstubdescriptor.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerInitializePartial(prpcmsg.toCPointer<ByteVar>(), pstubmsg.toCPointer<ByteVar>(), pstubdescriptor.toCPointer<ByteVar>(), requestedbuffersize)
}

public actual fun NdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrServerInitializeUnmarshall(pstubmsg.toCPointer<ByteVar>(), pstubdescriptor.toCPointer<ByteVar>(), prpcmsg.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSimpleStructBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSimpleStructFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSimpleStructMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSimpleStructMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSimpleStructUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSimpleTypeMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), formatchar)
}

public actual fun NdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrSimpleTypeUnmarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), formatchar)
}

public actual fun NdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrStubCall2(pthis.toCPointer<ByteVar>(), pchannel.toCPointer<ByteVar>(), prpcmsg.toCPointer<ByteVar>(), pdwstubphase.toCPointer<ByteVar>())

public actual fun NdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrStubCall3(pthis.toCPointer<ByteVar>(), pchannel.toCPointer<ByteVar>(), prpcmsg.toCPointer<ByteVar>(), pdwstubphase.toCPointer<ByteVar>())

public actual fun NdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrUserMarshalBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrUserMarshalFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrUserMarshalMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrUserMarshalMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrUserMarshalSimpleTypeConvert(pflags.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), formatchar)?.toLong() ?: 0L

public actual fun NdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrUserMarshalUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrVaryingArrayBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrVaryingArrayFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrVaryingArrayMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrVaryingArrayMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrVaryingArrayUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun NdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsBufferSize(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsFree(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())
}

public actual fun NdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMarshall(pstubmsg.toCPointer<ByteVar>(), pmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMemorySize(pstubmsg.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>())

public actual fun NdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsUnmarshall(pstubmsg.toCPointer<ByteVar>(), ppmemory.toCPointer<ByteVar>(), pformat.toCPointer<ByteVar>(), fmustalloc)?.toLong() ?: 0L

public actual fun RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcAsyncAbortCall(pasync.toCPointer<ByteVar>(), exceptioncode)

public actual fun RpcAsyncCancelCall(pasync: Long, fabort: BOOL): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcAsyncCancelCall(pasync.toCPointer<ByteVar>(), fabort)

public actual fun RpcAsyncCompleteCall(pasync: Long, reply: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcAsyncCompleteCall(pasync.toCPointer<ByteVar>(), reply.toCPointer<ByteVar>())

public actual fun RpcAsyncGetCallStatus(pasync: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcAsyncGetCallStatus(pasync.toCPointer<ByteVar>())

public actual fun RpcAsyncInitializeHandle(pasync: Long, size: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcAsyncInitializeHandle(pasync.toCPointer<ByteVar>(), size)

public actual fun RpcAsyncRegisterInfo(pasync: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcAsyncRegisterInfo(pasync.toCPointer<ByteVar>())

public actual fun RpcBindingBind(pasync: Long, binding: Long, ifspec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingBind(pasync.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>())

public actual fun RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingCopy(sourcebinding.toCPointer<ByteVar>(), destinationbinding.toCPointer<ByteVar>())

public actual fun RpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingCreateA(template.toCPointer<ByteVar>(), security.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun RpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingCreateW(template.toCPointer<ByteVar>(), security.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun RpcBindingFree(binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingFree(binding.toCPointer<ByteVar>())

public actual fun RpcBindingFromStringBindingA(stringbinding: PCSTR, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingA(stringbinding.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun RpcBindingFromStringBindingW(stringbinding: PCWSTR, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingW(stringbinding.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun RpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientA(clientbinding.toCPointer<ByteVar>(), privs.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>())

public actual fun RpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExA(clientbinding.toCPointer<ByteVar>(), privs.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>(), flags)

public actual fun RpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExW(clientbinding.toCPointer<ByteVar>(), privs.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>(), flags)

public actual fun RpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientW(clientbinding.toCPointer<ByteVar>(), privs.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>())

public actual fun RpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoA(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>())

public actual fun RpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExA(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>(), rpcqosversion, securityqos.toCPointer<ByteVar>())

public actual fun RpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExW(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>(), rpcqosversion, securityqos.toCPointer<ByteVar>())

public actual fun RpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoW(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel.toCPointer<ByteVar>(), authnsvc.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), authzsvc.toCPointer<ByteVar>())

public actual fun RpcBindingInqMaxCalls(binding: Long, maxcalls: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqMaxCalls(binding.toCPointer<ByteVar>(), maxcalls.toCPointer<ByteVar>())

public actual fun RpcBindingInqObject(binding: Long, objectuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqObject(binding.toCPointer<ByteVar>(), objectuuid.toCPointer<ByteVar>())

public actual fun RpcBindingInqOption(hbinding: Long, option: UInt, poptionvalue: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingInqOption(hbinding.toCPointer<ByteVar>(), option, poptionvalue.toCPointer<ByteVar>())

public actual fun RpcBindingReset(binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingReset(binding.toCPointer<ByteVar>())

public actual fun RpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingServerFromClient(clientbinding.toCPointer<ByteVar>(), serverbinding.toCPointer<ByteVar>())

public actual fun RpcBindingSetAuthInfoA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoA(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity.toCPointer<ByteVar>(), authzsvc)

public actual fun RpcBindingSetAuthInfoExA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExA(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity.toCPointer<ByteVar>(), authzsvc, securityqos.toCPointer<ByteVar>())

public actual fun RpcBindingSetAuthInfoExW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExW(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity.toCPointer<ByteVar>(), authzsvc, securityqos.toCPointer<ByteVar>())

public actual fun RpcBindingSetAuthInfoW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoW(binding.toCPointer<ByteVar>(), serverprincname.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity.toCPointer<ByteVar>(), authzsvc)

public actual fun RpcBindingSetObject(binding: Long, objectuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingSetObject(binding.toCPointer<ByteVar>(), objectuuid.toCPointer<ByteVar>())

public actual fun RpcBindingSetOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingSetOption(hbinding.toCPointer<ByteVar>(), option, optionvalue)

public actual fun RpcBindingToStringBindingA(binding: Long, stringbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingToStringBindingA(binding.toCPointer<ByteVar>(), stringbinding.toCPointer<ByteVar>())

public actual fun RpcBindingToStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingToStringBindingW(binding.toCPointer<ByteVar>(), stringbinding.toCPointer<ByteVar>())

public actual fun RpcBindingUnbind(binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingUnbind(binding.toCPointer<ByteVar>())

public actual fun RpcBindingVectorFree(bindingvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcBindingVectorFree(bindingvector.toCPointer<ByteVar>())

public actual fun RpcCancelThread(thread: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcCancelThread(thread.toCPointer<ByteVar>())

public actual fun RpcCancelThreadEx(thread: Long, timeout: Int): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcCancelThreadEx(thread.toCPointer<ByteVar>(), timeout)

public actual fun RpcCertGeneratePrincipalNameA(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameA(context.toCPointer<ByteVar>(), flags, pbuffer.toCPointer<ByteVar>())

public actual fun RpcCertGeneratePrincipalNameW(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameW(context.toCPointer<ByteVar>(), flags, pbuffer.toCPointer<ByteVar>())

public actual fun RpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcEpRegisterA(ifspec.toCPointer<ByteVar>(), bindingvector.toCPointer<ByteVar>(), uuidvector.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceA(ifspec.toCPointer<ByteVar>(), bindingvector.toCPointer<ByteVar>(), uuidvector.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceW(ifspec.toCPointer<ByteVar>(), bindingvector.toCPointer<ByteVar>(), uuidvector.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcEpRegisterW(ifspec.toCPointer<ByteVar>(), bindingvector.toCPointer<ByteVar>(), uuidvector.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcEpResolveBinding(binding: Long, ifspec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcEpResolveBinding(binding.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>())

public actual fun RpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcEpUnregister(ifspec.toCPointer<ByteVar>(), bindingvector.toCPointer<ByteVar>(), uuidvector.toCPointer<ByteVar>())

public actual fun RpcErrorAddRecord(errorinfo: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorAddRecord(errorinfo.toCPointer<ByteVar>())

public actual fun RpcErrorClearInformation() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorClearInformation()
}

public actual fun RpcErrorEndEnumeration(enumhandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorEndEnumeration(enumhandle.toCPointer<ByteVar>())

public actual fun RpcErrorGetNextRecord(enumhandle: Long, copystrings: BOOL, errorinfo: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorGetNextRecord(enumhandle.toCPointer<ByteVar>(), copystrings, errorinfo.toCPointer<ByteVar>())

public actual fun RpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorGetNumberOfRecords(enumhandle.toCPointer<ByteVar>(), records.toCPointer<ByteVar>())

public actual fun RpcErrorLoadErrorInfo(errorblob: Long, blobsize: ULong, enumhandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorLoadErrorInfo(errorblob.toCPointer<ByteVar>(), blobsize, enumhandle.toCPointer<ByteVar>())

public actual fun RpcErrorResetEnumeration(enumhandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorResetEnumeration(enumhandle.toCPointer<ByteVar>())

public actual fun RpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorSaveErrorInfo(enumhandle.toCPointer<ByteVar>(), errorblob.toCPointer<ByteVar>(), blobsize.toCPointer<ByteVar>())

public actual fun RpcErrorStartEnumeration(enumhandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcErrorStartEnumeration(enumhandle.toCPointer<ByteVar>())

public actual fun RpcExceptionFilter(exceptioncode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcExceptionFilter(exceptioncode)

public actual fun RpcFreeAuthorizationContext(pauthzclientcontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcFreeAuthorizationContext(pauthzclientcontext.toCPointer<ByteVar>())

public actual fun RpcGetAuthorizationContextForClient(clientbinding: Long, impersonateonreturn: BOOL, reserved1: Long, pexpirationtime: Long, reserved2: LUID, reserved3: UInt, reserved4: Long, pauthzclientcontext: Long): RPC_STATUS =
    0

public actual fun RpcIfIdVectorFree(ifidvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcIfIdVectorFree(ifidvector.toCPointer<ByteVar>())

public actual fun RpcIfInqId(rpcifhandle: Long, rpcifid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcIfInqId(rpcifhandle.toCPointer<ByteVar>(), rpcifid.toCPointer<ByteVar>())

public actual fun RpcImpersonateClient(bindinghandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcImpersonateClient(bindinghandle.toCPointer<ByteVar>())

public actual fun RpcImpersonateClient2(bindinghandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcImpersonateClient2(bindinghandle.toCPointer<ByteVar>())

public actual fun RpcImpersonateClientContainer(bindinghandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcImpersonateClientContainer(bindinghandle.toCPointer<ByteVar>())

public actual fun RpcMgmtEnableIdleCleanup(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtEnableIdleCleanup()

public actual fun RpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: UInt, ifid: Long, versoption: UInt, objectuuid: Long, inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqBegin(epbinding.toCPointer<ByteVar>(), inquirytype, ifid.toCPointer<ByteVar>(), versoption, objectuuid.toCPointer<ByteVar>(), inquirycontext.toCPointer<ByteVar>())

public actual fun RpcMgmtEpEltInqDone(inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqDone(inquirycontext.toCPointer<ByteVar>())

public actual fun RpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextA(inquirycontext.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>(), objectuuid.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextW(inquirycontext.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>(), objectuuid.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtEpUnregister(epbinding.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>(), objectuuid.toCPointer<ByteVar>())

public actual fun RpcMgmtInqComTimeout(binding: Long, timeout: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtInqComTimeout(binding.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>())

public actual fun RpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtInqDefaultProtectLevel(authnsvc, authnlevel.toCPointer<ByteVar>())

public actual fun RpcMgmtInqIfIds(binding: Long, ifidvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtInqIfIds(binding.toCPointer<ByteVar>(), ifidvector.toCPointer<ByteVar>())

public actual fun RpcMgmtInqServerPrincNameA(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameA(binding.toCPointer<ByteVar>(), authnsvc, serverprincname.toCPointer<ByteVar>())

public actual fun RpcMgmtInqServerPrincNameW(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameW(binding.toCPointer<ByteVar>(), authnsvc, serverprincname.toCPointer<ByteVar>())

public actual fun RpcMgmtInqStats(binding: Long, statistics: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtInqStats(binding.toCPointer<ByteVar>(), statistics.toCPointer<ByteVar>())

public actual fun RpcMgmtIsServerListening(binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtIsServerListening(binding.toCPointer<ByteVar>())

public actual fun RpcMgmtSetAuthorizationFn(authorizationfn: RPC_MGMT_AUTHORIZATION_FN): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtSetAuthorizationFn(authorizationfn.toLong().toCPointer<ByteVar>())

public actual fun RpcMgmtSetCancelTimeout(timeout: Int): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtSetCancelTimeout(timeout)

public actual fun RpcMgmtSetComTimeout(binding: Long, timeout: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtSetComTimeout(binding.toCPointer<ByteVar>(), timeout)

public actual fun RpcMgmtSetServerStackSize(threadstacksize: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtSetServerStackSize(threadstacksize)

public actual fun RpcMgmtStatsVectorFree(statsvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtStatsVectorFree(statsvector.toCPointer<ByteVar>())

public actual fun RpcMgmtStopServerListening(binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtStopServerListening(binding.toCPointer<ByteVar>())

public actual fun RpcMgmtWaitServerListen(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcMgmtWaitServerListen()

public actual fun RpcNetworkInqProtseqsA(protseqvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsA(protseqvector.toCPointer<ByteVar>())

public actual fun RpcNetworkInqProtseqsW(protseqvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsW(protseqvector.toCPointer<ByteVar>())

public actual fun RpcNetworkIsProtseqValidA(protseq: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidA(protseq.toCPointer<ByteVar>())

public actual fun RpcNetworkIsProtseqValidW(protseq: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidW(protseq.toCPointer<ByteVar>())

public actual fun RpcNsBindingExportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingExportA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), bindingvec.toCPointer<ByteVar>(), objectuuidvec.toCPointer<ByteVar>())

public actual fun RpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objectvector.toCPointer<ByteVar>())

public actual fun RpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objectvector.toCPointer<ByteVar>())

public actual fun RpcNsBindingExportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingExportW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), bindingvec.toCPointer<ByteVar>(), objectuuidvec.toCPointer<ByteVar>())

public actual fun RpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objuuid.toCPointer<ByteVar>(), importcontext.toCPointer<ByteVar>())

public actual fun RpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objuuid.toCPointer<ByteVar>(), importcontext.toCPointer<ByteVar>())

public actual fun RpcNsBindingImportDone(importcontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingImportDone(importcontext.toCPointer<ByteVar>())

public actual fun RpcNsBindingImportNext(importcontext: Long, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingImportNext(importcontext.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun RpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameA(binding.toCPointer<ByteVar>(), entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun RpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameW(binding.toCPointer<ByteVar>(), entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun RpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objuuid.toCPointer<ByteVar>(), bindingmaxcount, lookupcontext.toCPointer<ByteVar>())

public actual fun RpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objuuid.toCPointer<ByteVar>(), bindingmaxcount, lookupcontext.toCPointer<ByteVar>())

public actual fun RpcNsBindingLookupDone(lookupcontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingLookupDone(lookupcontext.toCPointer<ByteVar>())

public actual fun RpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingLookupNext(lookupcontext.toCPointer<ByteVar>(), bindingvec.toCPointer<ByteVar>())

public actual fun RpcNsBindingSelect(bindingvec: Long, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingSelect(bindingvec.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun RpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objectuuidvec.toCPointer<ByteVar>())

public actual fun RpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objectvector.toCPointer<ByteVar>())

public actual fun RpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objectvector.toCPointer<ByteVar>())

public actual fun RpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifspec.toCPointer<ByteVar>(), objectuuidvec.toCPointer<ByteVar>())

public actual fun RpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: PCSTR, expandedname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameA(entrynamesyntax, entryname.toCPointer<ByteVar>(), expandedname.toCPointer<ByteVar>())

public actual fun RpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: PCWSTR, expandedname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameW(entrynamesyntax, entryname.toCPointer<ByteVar>(), expandedname.toCPointer<ByteVar>())

public actual fun RpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: PCSTR, inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginA(entrynamesyntax, entryname.toCPointer<ByteVar>(), inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: PCWSTR, inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginW(entrynamesyntax, entryname.toCPointer<ByteVar>(), inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsEntryObjectInqDone(inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqDone(inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqNext(inquirycontext.toCPointer<ByteVar>(), objuuid.toCPointer<ByteVar>())

public actual fun RpcNsGroupDeleteA(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupDeleteA(groupnamesyntax, groupname.toCPointer<ByteVar>())

public actual fun RpcNsGroupDeleteW(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupDeleteW(groupnamesyntax, groupname.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddA(groupnamesyntax, groupname.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddW(groupnamesyntax, groupname.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginA(groupnamesyntax, groupname.toCPointer<ByteVar>(), membernamesyntax, inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginW(groupnamesyntax, groupname.toCPointer<ByteVar>(), membernamesyntax, inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrInqDone(inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqDone(inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextA(inquirycontext.toCPointer<ByteVar>(), membername.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextW(inquirycontext.toCPointer<ByteVar>(), membername.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveA(groupnamesyntax, groupname.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>())

public actual fun RpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveW(groupnamesyntax, groupname.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>())

public actual fun RpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), versoption, objectuuidvec.toCPointer<ByteVar>())

public actual fun RpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), versoption, objectuuidvec.toCPointer<ByteVar>())

public actual fun RpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateA(entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun RpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateW(entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun RpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteA(entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun RpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteW(entrynamesyntax, entryname.toCPointer<ByteVar>())

public actual fun RpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: PCSTR, ifidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsA(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifidvec.toCPointer<ByteVar>())

public actual fun RpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: PCWSTR, ifidvec: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsW(entrynamesyntax, entryname.toCPointer<ByteVar>(), ifidvec.toCPointer<ByteVar>())

public actual fun RpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtHandleSetExpAge(nshandle.toCPointer<ByteVar>(), expirationage)

public actual fun RpcNsMgmtInqExpAge(expirationage: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtInqExpAge(expirationage.toCPointer<ByteVar>())

public actual fun RpcNsMgmtSetExpAge(expirationage: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsMgmtSetExpAge(expirationage)

public actual fun RpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileDeleteA(profilenamesyntax, profilename.toCPointer<ByteVar>())

public actual fun RpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileDeleteW(profilenamesyntax, profilename.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR, priority: UInt, annotation: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltAddA(profilenamesyntax, profilename.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>(), priority, annotation.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR, priority: UInt, annotation: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltAddW(profilenamesyntax, profilename.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>(), priority, annotation.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: PCSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCSTR, inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginA(profilenamesyntax, profilename.toCPointer<ByteVar>(), inquirytype, ifid.toCPointer<ByteVar>(), versoption, membernamesyntax, membername.toCPointer<ByteVar>(), inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: PCWSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCWSTR, inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginW(profilenamesyntax, profilename.toCPointer<ByteVar>(), inquirytype, ifid.toCPointer<ByteVar>(), versoption, membernamesyntax, membername.toCPointer<ByteVar>(), inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltInqDone(inquirycontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqDone(inquirycontext.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextA(inquirycontext.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), membername.toCPointer<ByteVar>(), priority.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextW(inquirycontext.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), membername.toCPointer<ByteVar>(), priority.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveA(profilenamesyntax, profilename.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>())

public actual fun RpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveW(profilenamesyntax, profilename.toCPointer<ByteVar>(), ifid.toCPointer<ByteVar>(), membernamesyntax, membername.toCPointer<ByteVar>())

public actual fun RpcObjectInqType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcObjectInqType(objuuid.toCPointer<ByteVar>(), typeuuid.toCPointer<ByteVar>())

public actual fun RpcObjectSetInqFn(inquiryfn: RPC_OBJECT_INQ_FN): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcObjectSetInqFn(inquiryfn.toLong().toCPointer<ByteVar>())

public actual fun RpcObjectSetType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcObjectSetType(objuuid.toCPointer<ByteVar>(), typeuuid.toCPointer<ByteVar>())

public actual fun RpcProtseqVectorFreeA(protseqvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeA(protseqvector.toCPointer<ByteVar>())

public actual fun RpcProtseqVectorFreeW(protseqvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeW(protseqvector.toCPointer<ByteVar>())

public actual fun RpcRaiseException(exception: RPC_STATUS) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcRaiseException(exception)
}

public actual fun RpcRevertContainerImpersonation(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcRevertContainerImpersonation()

public actual fun RpcRevertToSelf(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcRevertToSelf()

public actual fun RpcRevertToSelfEx(bindinghandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcRevertToSelfEx(bindinghandle.toCPointer<ByteVar>())

public actual fun RpcServerCompleteSecurityCallback(bindinghandle: Long, status: RPC_STATUS): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerCompleteSecurityCallback(bindinghandle.toCPointer<ByteVar>(), status)

public actual fun RpcServerInqBindingHandle(binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqBindingHandle(binding.toCPointer<ByteVar>())

public actual fun RpcServerInqBindings(bindingvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqBindings(bindingvector.toCPointer<ByteVar>())

public actual fun RpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqBindingsEx(securitydescriptor.toCPointer<ByteVar>(), bindingvector.toCPointer<ByteVar>())

public actual fun RpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesA(clientbinding.toCPointer<ByteVar>(), rpccallattributes.toCPointer<ByteVar>())

public actual fun RpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesW(clientbinding.toCPointer<ByteVar>(), rpccallattributes.toCPointer<ByteVar>())

public actual fun RpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameA(authnsvc, princname.toCPointer<ByteVar>())

public actual fun RpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameW(authnsvc, princname.toCPointer<ByteVar>())

public actual fun RpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInqIf(ifspec.toCPointer<ByteVar>(), mgrtypeuuid.toCPointer<ByteVar>(), mgrepv.toCPointer<ByteVar>())

public actual fun RpcServerInterfaceGroupActivate(ifgroup: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupActivate(ifgroup.toCPointer<ByteVar>())

public actual fun RpcServerInterfaceGroupClose(ifgroup: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupClose(ifgroup.toCPointer<ByteVar>())

public actual fun RpcServerInterfaceGroupCreateA(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateA(interfaces.toCPointer<ByteVar>(), numifs, endpoints.toCPointer<ByteVar>(), numendpoints, idleperiod, idlecallbackfn.toLong().toCPointer<ByteVar>(), idlecallbackcontext.toCPointer<ByteVar>(), ifgroup.toCPointer<ByteVar>())

public actual fun RpcServerInterfaceGroupCreateW(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateW(interfaces.toCPointer<ByteVar>(), numifs, endpoints.toCPointer<ByteVar>(), numendpoints, idleperiod, idlecallbackfn.toLong().toCPointer<ByteVar>(), idlecallbackcontext.toCPointer<ByteVar>(), ifgroup.toCPointer<ByteVar>())

public actual fun RpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupDeactivate(ifgroup.toCPointer<ByteVar>(), forcedeactivation)

public actual fun RpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupInqBindings(ifgroup.toCPointer<ByteVar>(), bindingvector.toCPointer<ByteVar>())

public actual fun RpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerListen(minimumcallthreads, maxcalls, dontwait)

public actual fun RpcServerRegisterAuthInfoA(serverprincname: PCSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoA(serverprincname.toCPointer<ByteVar>(), authnsvc, getkeyfn.toLong().toCPointer<ByteVar>(), arg.toCPointer<ByteVar>())

public actual fun RpcServerRegisterAuthInfoW(serverprincname: PCWSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoW(serverprincname.toCPointer<ByteVar>(), authnsvc, getkeyfn.toLong().toCPointer<ByteVar>(), arg.toCPointer<ByteVar>())

public actual fun RpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerRegisterIf(ifspec.toCPointer<ByteVar>(), mgrtypeuuid.toCPointer<ByteVar>(), mgrepv.toCPointer<ByteVar>())

public actual fun RpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RPC_IF_CALLBACK_FN): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerRegisterIf2(ifspec.toCPointer<ByteVar>(), mgrtypeuuid.toCPointer<ByteVar>(), mgrepv.toCPointer<ByteVar>(), flags, maxcalls, maxrpcsize, ifcallbackfn.toLong().toCPointer<ByteVar>())

public actual fun RpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RPC_IF_CALLBACK_FN, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerRegisterIf3(ifspec.toCPointer<ByteVar>(), mgrtypeuuid.toCPointer<ByteVar>(), mgrepv.toCPointer<ByteVar>(), flags, maxcalls, maxrpcsize, ifcallback.toLong().toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, ifcallback: RPC_IF_CALLBACK_FN): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerRegisterIfEx(ifspec.toCPointer<ByteVar>(), mgrtypeuuid.toCPointer<ByteVar>(), mgrepv.toCPointer<ByteVar>(), flags, maxcalls, ifcallback.toLong().toCPointer<ByteVar>())

public actual fun RpcServerSubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationtype: RPC_NOTIFICATION_TYPES, notificationinfo: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerSubscribeForNotification(binding.toCPointer<ByteVar>(), notification, notificationtype, notificationinfo.toCPointer<ByteVar>())

public actual fun RpcServerTestCancel(bindinghandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerTestCancel(bindinghandle.toCPointer<ByteVar>())

public actual fun RpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: UInt): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUnregisterIf(ifspec.toCPointer<ByteVar>(), mgrtypeuuid.toCPointer<ByteVar>(), waitforcallstocomplete)

public actual fun RpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUnregisterIfEx(ifspec.toCPointer<ByteVar>(), mgrtypeuuid.toCPointer<ByteVar>(), rundowncontexthandles)

public actual fun RpcServerUnsubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationsqueued: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUnsubscribeForNotification(binding.toCPointer<ByteVar>(), notification, notificationsqueued.toCPointer<ByteVar>())

public actual fun RpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqs(maxcalls, securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsEx(maxcalls, securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIf(maxcalls, ifspec.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIfEx(maxcalls, ifspec.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqA(protseq.toCPointer<ByteVar>(), maxcalls, securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqEpA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpA(protseq.toCPointer<ByteVar>(), maxcalls, endpoint.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqEpExA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExA(protseq.toCPointer<ByteVar>(), maxcalls, endpoint.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqEpExW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExW(protseq.toCPointer<ByteVar>(), maxcalls, endpoint.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqEpW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpW(protseq.toCPointer<ByteVar>(), maxcalls, endpoint.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqExA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqExA(protseq.toCPointer<ByteVar>(), maxcalls, securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqExW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqExW(protseq.toCPointer<ByteVar>(), maxcalls, securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqIfA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfA(protseq.toCPointer<ByteVar>(), maxcalls, ifspec.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqIfExA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExA(protseq.toCPointer<ByteVar>(), maxcalls, ifspec.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqIfExW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExW(protseq.toCPointer<ByteVar>(), maxcalls, ifspec.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqIfW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfW(protseq.toCPointer<ByteVar>(), maxcalls, ifspec.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerUseProtseqW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerUseProtseqW(protseq.toCPointer<ByteVar>(), maxcalls, securitydescriptor.toCPointer<ByteVar>())

public actual fun RpcServerYield() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcServerYield()
}

public actual fun RpcSmAllocate(size: ULong, pstatus: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmAllocate(size, pstatus.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RpcSmClientFree(pnodetofree: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmClientFree(pnodetofree.toCPointer<ByteVar>())

public actual fun RpcSmDestroyClientContext(contexthandle: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmDestroyClientContext(contexthandle.toCPointer<ByteVar>())

public actual fun RpcSmDisableAllocate(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmDisableAllocate()

public actual fun RpcSmEnableAllocate(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmEnableAllocate()

public actual fun RpcSmFree(nodetofree: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmFree(nodetofree.toCPointer<ByteVar>())

public actual fun RpcSmGetThreadHandle(pstatus: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmGetThreadHandle(pstatus.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RpcSmSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmSetClientAllocFree(clientalloc.toLong().toCPointer<ByteVar>(), clientfree.toLong().toCPointer<ByteVar>())

public actual fun RpcSmSetThreadHandle(id: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmSetThreadHandle(id.toCPointer<ByteVar>())

public actual fun RpcSmSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSmSwapClientAllocFree(clientalloc.toLong().toCPointer<ByteVar>(), clientfree.toLong().toCPointer<ByteVar>(), oldclientalloc.toCPointer<ByteVar>(), oldclientfree.toCPointer<ByteVar>())

public actual fun RpcSsAllocate(size: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsAllocate(size)?.toLong() ?: 0L

public actual fun RpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsContextLockExclusive(serverbindinghandle.toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun RpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsContextLockShared(serverbindinghandle.toCPointer<ByteVar>(), usercontext.toCPointer<ByteVar>())

public actual fun RpcSsDestroyClientContext(contexthandle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsDestroyClientContext(contexthandle.toCPointer<ByteVar>())
}

public actual fun RpcSsDisableAllocate() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsDisableAllocate()
}

public actual fun RpcSsDontSerializeContext() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsDontSerializeContext()
}

public actual fun RpcSsEnableAllocate() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsEnableAllocate()
}

public actual fun RpcSsFree(nodetofree: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsFree(nodetofree.toCPointer<ByteVar>())
}

public actual fun RpcSsGetContextBinding(contexthandle: Long, binding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsGetContextBinding(contexthandle.toCPointer<ByteVar>(), binding.toCPointer<ByteVar>())

public actual fun RpcSsGetThreadHandle(): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsGetThreadHandle()?.toLong() ?: 0L

public actual fun RpcSsSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsSetClientAllocFree(clientalloc.toLong().toCPointer<ByteVar>(), clientfree.toLong().toCPointer<ByteVar>())
}

public actual fun RpcSsSetThreadHandle(id: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsSetThreadHandle(id.toCPointer<ByteVar>())
}

public actual fun RpcSsSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcSsSwapClientAllocFree(clientalloc.toLong().toCPointer<ByteVar>(), clientfree.toLong().toCPointer<ByteVar>(), oldclientalloc.toCPointer<ByteVar>(), oldclientfree.toCPointer<ByteVar>())
}

public actual fun RpcStringBindingComposeA(objuuid: PCSTR, protseq: PCSTR, networkaddr: PCSTR, endpoint: PCSTR, options: PCSTR, stringbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcStringBindingComposeA(objuuid.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), networkaddr.toCPointer<ByteVar>(), endpoint.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), stringbinding.toCPointer<ByteVar>())

public actual fun RpcStringBindingComposeW(objuuid: PCWSTR, protseq: PCWSTR, networkaddr: PCWSTR, endpoint: PCWSTR, options: PCWSTR, stringbinding: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcStringBindingComposeW(objuuid.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), networkaddr.toCPointer<ByteVar>(), endpoint.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), stringbinding.toCPointer<ByteVar>())

public actual fun RpcStringBindingParseA(stringbinding: PCSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcStringBindingParseA(stringbinding.toCPointer<ByteVar>(), objuuid.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), networkaddr.toCPointer<ByteVar>(), endpoint.toCPointer<ByteVar>(), networkoptions.toCPointer<ByteVar>())

public actual fun RpcStringBindingParseW(stringbinding: PCWSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcStringBindingParseW(stringbinding.toCPointer<ByteVar>(), objuuid.toCPointer<ByteVar>(), protseq.toCPointer<ByteVar>(), networkaddr.toCPointer<ByteVar>(), endpoint.toCPointer<ByteVar>(), networkoptions.toCPointer<ByteVar>())

public actual fun RpcStringFreeA(string: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcStringFreeA(string.toCPointer<ByteVar>())

public actual fun RpcStringFreeW(string: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcStringFreeW(string.toCPointer<ByteVar>())

public actual fun RpcTestCancel(): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcTestCancel()

public actual fun RpcUserFree(asynchandle: Long, pbuffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_RpcUserFree(asynchandle.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>())
}

public actual fun UuidCompare(uuid1: Long, uuid2: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidCompare(uuid1.toCPointer<ByteVar>(), uuid2.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun UuidCreate(uuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidCreate(uuid.toCPointer<ByteVar>())

public actual fun UuidCreateNil(niluuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidCreateNil(niluuid.toCPointer<ByteVar>())

public actual fun UuidCreateSequential(uuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidCreateSequential(uuid.toCPointer<ByteVar>())

public actual fun UuidEqual(uuid1: Long, uuid2: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidEqual(uuid1.toCPointer<ByteVar>(), uuid2.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun UuidFromStringA(stringuuid: PCSTR, uuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidFromStringA(stringuuid.toCPointer<ByteVar>(), uuid.toCPointer<ByteVar>())

public actual fun UuidFromStringW(stringuuid: PCWSTR, uuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidFromStringW(stringuuid.toCPointer<ByteVar>(), uuid.toCPointer<ByteVar>())

public actual fun UuidHash(uuid: Long, status: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidHash(uuid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun UuidIsNil(uuid: Long, status: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidIsNil(uuid.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())

public actual fun UuidToStringA(uuid: Long, stringuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidToStringA(uuid.toCPointer<ByteVar>(), stringuuid.toCPointer<ByteVar>())

public actual fun UuidToStringW(uuid: Long, stringuuid: Long): RPC_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_UuidToStringW(uuid.toCPointer<ByteVar>(), stringuuid.toCPointer<ByteVar>())
