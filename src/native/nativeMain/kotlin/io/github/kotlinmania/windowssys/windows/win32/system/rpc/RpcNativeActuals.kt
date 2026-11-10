@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_dceErrorInqTextA(rpcstatus, errortext?.value?.toCPointer<ByteVar>())

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_dceErrorInqTextW(rpcstatus, errortext?.value?.toCPointer<ByteVar>())

public actual fun iunknownAddRefProxy(thisRef: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iunknownAddRefProxy(thisRef?.value?.toCPointer<ByteVar>())

public actual fun iunknownQueryInterfaceProxy(thisRef: COpaquePointer?, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iunknownQueryInterfaceProxy(thisRef?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppvobject?.value?.toCPointer<ByteVar>())

public actual fun iunknownReleaseProxy(thisRef: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iunknownReleaseProxy(thisRef?.value?.toCPointer<ByteVar>())

public actual fun iRpcAllocate(size: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcAllocate(size)?.let { COpaquePointer(it.toLong()) }

public actual fun iRpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcAsyncAbortCall(pasync?.value?.toCPointer<ByteVar>(), exceptioncode)

public actual fun iRpcAsyncSetHandle(message: COpaquePointer?, pasync: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcAsyncSetHandle(message?.value?.toCPointer<ByteVar>(), pasync?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingCopy(sourcebinding?.value?.toCPointer<ByteVar>(), destinationbinding?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingCreateNp(servername?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), networkoptions?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingHandleToAsyncHandle(binding: COpaquePointer?, asynchandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingHandleToAsyncHandle(binding?.value?.toCPointer<ByteVar>(), asynchandle?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqClientTokenAttributes(binding: COpaquePointer?, tokenid: COpaquePointer?, authenticationid: COpaquePointer?, modifiedid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqClientTokenAttributes(binding?.value?.toCPointer<ByteVar>(), tokenid?.value?.toCPointer<ByteVar>(), authenticationid?.value?.toCPointer<ByteVar>(), modifiedid?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqDynamicEndpointA(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointA(binding?.value?.toCPointer<ByteVar>(), dynamicendpoint?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqDynamicEndpointW(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointW(binding?.value?.toCPointer<ByteVar>(), dynamicendpoint?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqLocalClientPid(binding: COpaquePointer?, pid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqLocalClientPid(binding?.value?.toCPointer<ByteVar>(), pid?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: COpaquePointer?, marshalledtargetinfosize: COpaquePointer?, marshalledtargetinfo: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqMarshalledTargetInfo(binding?.value?.toCPointer<ByteVar>(), marshalledtargetinfosize?.value?.toCPointer<ByteVar>(), marshalledtargetinfo?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqSecurityContext(binding: COpaquePointer?, securitycontexthandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContext(binding?.value?.toCPointer<ByteVar>(), securitycontexthandle?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: COpaquePointer?, keyinfo: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContextKeyInfo(binding?.value?.toCPointer<ByteVar>(), keyinfo?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqTransportType(binding: COpaquePointer?, type: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqTransportType(binding?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingInqWireIdForSnego(binding: COpaquePointer?, wireid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingInqWireIdForSnego(binding?.value?.toCPointer<ByteVar>(), wireid?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingIsClientLocal(bindinghandle: COpaquePointer?, clientlocalflag: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingIsClientLocal(bindinghandle?.value?.toCPointer<ByteVar>(), clientlocalflag?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingIsServerLocal(binding: COpaquePointer?, serverlocalflag: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingIsServerLocal(binding?.value?.toCPointer<ByteVar>(), serverlocalflag?.value?.toCPointer<ByteVar>())

public actual fun iRpcBindingSetPrivateOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingSetPrivateOption(hbinding?.value?.toCPointer<ByteVar>(), option, optionvalue)

public actual fun iRpcBindingToStaticStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcBindingToStaticStringBindingW(binding?.value?.toCPointer<ByteVar>(), stringbinding?.value?.toCPointer<ByteVar>())

public actual fun iRpcClearMutex(mutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcClearMutex(mutex?.value?.toCPointer<ByteVar>())
}

public actual fun iRpcDeleteMutex(mutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcDeleteMutex(mutex?.value?.toCPointer<ByteVar>())
}

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcExceptionFilter(exceptioncode)

public actual fun iRpcFree(obj: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcFree(obj?.value?.toCPointer<ByteVar>())
}

public actual fun iRpcFreeBuffer(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcFreeBuffer(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcFreePipeBuffer(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcFreePipeBuffer(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcGetBuffer(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcGetBuffer(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcGetBufferWithObject(message: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcGetBufferWithObject(message?.value?.toCPointer<ByteVar>(), objectuuid?.value?.toCPointer<ByteVar>())

public actual fun iRpcGetCurrentCallHandle(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcGetCurrentCallHandle()?.let { COpaquePointer(it.toLong()) }

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcGetDefaultSd(ppsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun iRpcGetExtendedError(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcGetExtendedError()

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: COpaquePointer?, transfersyntaxes: COpaquePointer?, transfersyntaxsize: UInt, transfersyntaxcount: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcIfInqTransferSyntaxes(rpcifhandle?.value?.toCPointer<ByteVar>(), transfersyntaxes?.value?.toCPointer<ByteVar>(), transfersyntaxsize, transfersyntaxcount?.value?.toCPointer<ByteVar>())

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcMapWin32Status(status)

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcMgmtEnableDedicatedThreadPool()

public actual fun iRpcNegotiateTransferSyntax(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNegotiateTransferSyntax(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcNsBindingSetEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameA(binding?.value?.toCPointer<ByteVar>(), entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun iRpcNsBindingSetEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameW(binding?.value?.toCPointer<ByteVar>(), entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun iRpcNsGetBuffer(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNsGetBuffer(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNsInterfaceExported(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), rpcinterfaceinformation?.value?.toCPointer<ByteVar>())

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNsInterfaceUnexported(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), rpcinterfaceinformation?.value?.toCPointer<ByteVar>())

public actual fun iRpcNsRaiseException(message: COpaquePointer?, status: RpcStatus) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNsRaiseException(message?.value?.toCPointer<ByteVar>(), status)
}

public actual fun iRpcNsSendReceive(message: COpaquePointer?, handle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcNsSendReceive(message?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun iRpcOpenClientProcess(binding: COpaquePointer?, desiredaccess: UInt, clientprocess: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcOpenClientProcess(binding?.value?.toCPointer<ByteVar>(), desiredaccess, clientprocess?.value?.toCPointer<ByteVar>())

public actual fun iRpcPauseExecution(milliseconds: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcPauseExecution(milliseconds)
}

public actual fun iRpcReBindBuffer(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcReBindBuffer(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcReallocPipeBuffer(message: COpaquePointer?, newsize: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcReallocPipeBuffer(message?.value?.toCPointer<ByteVar>(), newsize)

public actual fun iRpcReceive(message: COpaquePointer?, size: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcReceive(message?.value?.toCPointer<ByteVar>(), size)

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: COpaquePointer?, dllname: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcRecordCalloutFailure(rpcstatus, calloutstate?.value?.toCPointer<ByteVar>(), dllname?.value?.toCPointer<ByteVar>())
}

public actual fun iRpcRequestMutex(mutex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcRequestMutex(mutex?.value?.toCPointer<ByteVar>())
}

public actual fun iRpcSend(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcSend(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcSendReceive(message: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcSendReceive(message?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerCheckClientRestriction(context: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerCheckClientRestriction(context?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerDisableExceptionFilter(): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerDisableExceptionFilter()

public actual fun iRpcServerGetAssociationId(binding: COpaquePointer?, associationid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerGetAssociationId(binding?.value?.toCPointer<ByteVar>(), associationid?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerInqAddressChangeFn(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerInqAddressChangeFn()?.let { COpaquePointer(it.toLong()) }

public actual fun iRpcServerInqLocalConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerInqLocalConnAddress(binding?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>(), addressformat?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerInqRemoteConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerInqRemoteConnAddress(binding?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize?.value?.toCPointer<ByteVar>(), addressformat?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerInqTransportType(type: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerInqTransportType(type?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerRegisterForwardFunction(pforwardfunction?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerSetAddressChangeFn(paddresschangefn?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerStartService(protseq?.value?.toCPointer<ByteVar>(), endpoint?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: COpaquePointer?, hevent: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification(binding?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: COpaquePointer?, hevent: COpaquePointer?, subscriptionid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification2(binding?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>(), subscriptionid?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: COpaquePointer?, subscriptionid: Guid): RpcStatus =
    0

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2A(networkaddress?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2W(networkaddress?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2A(networkaddress?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), maxcalls, endpoint?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2W(networkaddress?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), maxcalls, endpoint?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun iRpcSessionStrictContextHandle() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcSessionStrictContextHandle()
}

public actual fun iRpcSsDontSerializeContext() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcSsDontSerializeContext()
}

public actual fun iRpcSystemHandleTypeSpecificWork(handle: COpaquePointer?, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcSystemHandleTypeSpecificWork(handle?.value?.toCPointer<ByteVar>(), actualtype, idltype, marshaldirection)

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iRpcTurnOnEeinfoPropagation()

public actual fun iUuidCreate(uuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_iUuidCreate(uuid?.value?.toCPointer<ByteVar>())

public actual fun mesBufferHandleReset(handle: COpaquePointer?, handlestyle: UInt, operation: MidlEsCode, pbuffer: COpaquePointer?, buffersize: UInt, pencodedsize: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesBufferHandleReset(handle?.value?.toCPointer<ByteVar>(), handlestyle, operation, pbuffer?.value?.toCPointer<ByteVar>(), buffersize, pencodedsize?.value?.toCPointer<ByteVar>())

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesDecodeBufferHandleCreate(buffer?.value?.toCPointer<ByteVar>(), buffersize, phandle?.value?.toCPointer<ByteVar>())

public actual fun mesDecodeIncrementalHandleCreate(userstate: COpaquePointer?, readfn: MidlEsRead, phandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesDecodeIncrementalHandleCreate(userstate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), phandle?.value?.toCPointer<ByteVar>())

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: COpaquePointer?, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesEncodeDynBufferHandleCreate(pbuffer?.value?.toCPointer<ByteVar>(), pencodedsize?.value?.toCPointer<ByteVar>(), phandle?.value?.toCPointer<ByteVar>())

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesEncodeFixedBufferHandleCreate(pbuffer?.value?.toCPointer<ByteVar>(), buffersize, pencodedsize?.value?.toCPointer<ByteVar>(), phandle?.value?.toCPointer<ByteVar>())

public actual fun mesEncodeIncrementalHandleCreate(userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesEncodeIncrementalHandleCreate(userstate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), phandle?.value?.toCPointer<ByteVar>())

public actual fun mesHandleFree(handle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesHandleFree(handle?.value?.toCPointer<ByteVar>())

public actual fun mesIncrementalHandleReset(handle: COpaquePointer?, userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesIncrementalHandleReset(handle?.value?.toCPointer<ByteVar>(), userstate?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), operation)

public actual fun mesInqProcEncodingId(handle: COpaquePointer?, pinterfaceid: COpaquePointer?, pprocnum: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_mesInqProcEncodingId(handle?.value?.toCPointer<ByteVar>(), pinterfaceid?.value?.toCPointer<ByteVar>(), pprocnum?.value?.toCPointer<ByteVar>())

public actual fun nDRCContextBinding(ccontext: Long): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRCContextBinding(ccontext)?.let { COpaquePointer(it.toLong()) }

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRCContextMarshall(ccontext, pbuff?.value?.toCPointer<ByteVar>())
}

public actual fun nDRCContextUnmarshall(pccontext: COpaquePointer?, hbinding: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRCContextUnmarshall(pccontext?.value?.toCPointer<ByteVar>(), hbinding?.value?.toCPointer<ByteVar>(), pbuff?.value?.toCPointer<ByteVar>(), datarepresentation)
}

public actual fun nDRSContextMarshall(ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRSContextMarshall(ccontext?.value?.toCPointer<ByteVar>(), pbuff?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun nDRSContextMarshall2(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown, ctxguard: COpaquePointer?, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRSContextMarshall2(bindinghandle?.value?.toCPointer<ByteVar>(), ccontext?.value?.toCPointer<ByteVar>(), pbuff?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ctxguard?.value?.toCPointer<ByteVar>(), flags)
}

public actual fun nDRSContextMarshallEx(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRSContextMarshallEx(bindinghandle?.value?.toCPointer<ByteVar>(), ccontext?.value?.toCPointer<ByteVar>(), pbuff?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun nDRSContextUnmarshall(pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRSContextUnmarshall(pbuff?.value?.toCPointer<ByteVar>(), datarepresentation)?.let { COpaquePointer(it.toLong()) }

public actual fun nDRSContextUnmarshall2(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt, ctxguard: COpaquePointer?, flags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRSContextUnmarshall2(bindinghandle?.value?.toCPointer<ByteVar>(), pbuff?.value?.toCPointer<ByteVar>(), datarepresentation, ctxguard?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun nDRSContextUnmarshallEx(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_nDRSContextUnmarshallEx(bindinghandle?.value?.toCPointer<ByteVar>(), pbuff?.value?.toCPointer<ByteVar>(), datarepresentation)?.let { COpaquePointer(it.toLong()) }

public actual fun ndr64AsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndr64AsyncServerCall64(prpcmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndr64AsyncServerCall64(prpcmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndr64AsyncServerCallAll(prpcmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndr64AsyncServerCallAll(prpcmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndr64DcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndr64DcomAsyncStubCall(pthis?.value?.toCPointer<ByteVar>(), pchannel?.value?.toCPointer<ByteVar>(), prpcmsg?.value?.toCPointer<ByteVar>(), pdwstubphase?.value?.toCPointer<ByteVar>())

public actual fun ndrAllocate(pstubmsg: COpaquePointer?, len: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrAllocate(pstubmsg?.value?.toCPointer<ByteVar>(), len)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrAsyncServerCall(prpcmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrAsyncServerCall(prpcmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrByteCountPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrByteCountPointerBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrByteCountPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrByteCountPointerFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrByteCountPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrByteCountPointerMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrByteCountPointerUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrClearOutParameters(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, argaddr: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrClearOutParameters(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), argaddr?.value?.toCPointer<ByteVar>())
}

public actual fun ndrClientCall2(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrClientCall3(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrClientContextMarshall(pstubmsg: COpaquePointer?, contexthandle: Long, fcheck: Int) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrClientContextMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), contexthandle, fcheck)
}

public actual fun ndrClientContextUnmarshall(pstubmsg: COpaquePointer?, pcontexthandle: COpaquePointer?, bindhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrClientContextUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pcontexthandle?.value?.toCPointer<ByteVar>(), bindhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndrClientInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrClientInitialize(prpcmsg?.value?.toCPointer<ByteVar>(), pstubmsg?.value?.toCPointer<ByteVar>(), pstubdescriptor?.value?.toCPointer<ByteVar>(), procnum)
}

public actual fun ndrClientInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrClientInitializeNew(prpcmsg?.value?.toCPointer<ByteVar>(), pstubmsg?.value?.toCPointer<ByteVar>(), pstubdescriptor?.value?.toCPointer<ByteVar>(), procnum)
}

public actual fun ndrComplexArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexArrayBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrComplexArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexArrayFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrComplexArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexArrayMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrComplexArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexArrayMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrComplexArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexArrayUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrComplexStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexStructBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrComplexStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexStructFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrComplexStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexStructMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrComplexStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexStructMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrComplexStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrComplexStructUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantArrayBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantArrayFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantArrayMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantArrayMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrConformantArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantArrayUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStringBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStringMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStringMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStringUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStructBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStructFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStructMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStructMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrConformantStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantStructUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantVaryingStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrContextHandleInitialize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrContextHandleInitialize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrContextHandleSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrContextHandleSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConvert(pstubmsg: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConvert(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrConvert2(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, numberparams: Int) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrConvert2(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), numberparams)
}

public actual fun ndrCorrelationFree(pstubmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrCorrelationFree(pstubmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrCorrelationInitialize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, cachesize: UInt, flags: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrCorrelationInitialize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), cachesize, flags)
}

public actual fun ndrCorrelationPass(pstubmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrCorrelationPass(pstubmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrCreateServerInterfaceFromStub(pstub: COpaquePointer?, pserverif: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrCreateServerInterfaceFromStub(pstub?.value?.toCPointer<ByteVar>(), pserverif?.value?.toCPointer<ByteVar>())

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrDcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrDcomAsyncStubCall(pthis?.value?.toCPointer<ByteVar>(), pchannel?.value?.toCPointer<ByteVar>(), prpcmsg?.value?.toCPointer<ByteVar>(), pdwstubphase?.value?.toCPointer<ByteVar>())

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrFixedArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFixedArrayBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrFixedArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFixedArrayFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrFixedArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFixedArrayMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrFixedArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFixedArrayMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrFixedArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFixedArrayUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrFreeBuffer(pstubmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFreeBuffer(pstubmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrFullPointerXlatFree(pxlattables: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFullPointerXlatFree(pxlattables?.value?.toCPointer<ByteVar>())
}

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrFullPointerXlatInit(numberofpointers, xlatside)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrGetBuffer(pstubmsg?.value?.toCPointer<ByteVar>(), bufferlength, handle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrGetDcomProtocolVersion(pstubmsg: COpaquePointer?, pversion: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrGetDcomProtocolVersion(pstubmsg?.value?.toCPointer<ByteVar>(), pversion?.value?.toCPointer<ByteVar>())

public actual fun ndrGetUserMarshalInfo(pflags: COpaquePointer?, informationlevel: UInt, pmarshalinfo: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrGetUserMarshalInfo(pflags?.value?.toCPointer<ByteVar>(), informationlevel, pmarshalinfo?.value?.toCPointer<ByteVar>())

public actual fun ndrInterfacePointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrInterfacePointerBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrInterfacePointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrInterfacePointerFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrInterfacePointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrInterfacePointerMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrInterfacePointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrInterfacePointerMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrInterfacePointerUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrMapCommAndFaultStatus(pstubmsg: COpaquePointer?, pcommstatus: COpaquePointer?, pfaultstatus: COpaquePointer?, status: RpcStatus): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMapCommAndFaultStatus(pstubmsg?.value?.toCPointer<ByteVar>(), pcommstatus?.value?.toCPointer<ByteVar>(), pfaultstatus?.value?.toCPointer<ByteVar>(), status)

public actual fun ndrMesProcEncodeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesProcEncodeDecode(handle?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndrMesProcEncodeDecode2(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrMesProcEncodeDecode3(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    ClientCallReturn()

public actual fun ndrMesSimpleTypeAlignSize(param0: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSize(param0?.value?.toCPointer<ByteVar>())

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSizeAll(handle?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>())

public actual fun ndrMesSimpleTypeDecode(handle: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecode(handle?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>(), size)
}

public actual fun ndrMesSimpleTypeDecodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecodeAll(handle?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>(), size)
}

public actual fun ndrMesSimpleTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncode(handle?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>(), size)
}

public actual fun ndrMesSimpleTypeEncodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncodeAll(handle?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>(), size)
}

public actual fun ndrMesTypeAlignSize(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize(handle?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>())

public actual fun ndrMesTypeAlignSize2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize2(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>())

public actual fun ndrMesTypeAlignSize3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize3(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>(), arrtypeoffset?.value?.toCPointer<ByteVar>(), ntypeindex, pobject?.value?.toCPointer<ByteVar>())

public actual fun ndrMesTypeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeDecode(handle?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrMesTypeDecode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeDecode2(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrMesTypeDecode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeDecode3(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>(), arrtypeoffset?.value?.toCPointer<ByteVar>(), ntypeindex, pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrMesTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeEncode(handle?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrMesTypeEncode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeEncode2(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrMesTypeEncode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeEncode3(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>(), arrtypeoffset?.value?.toCPointer<ByteVar>(), ntypeindex, pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrMesTypeFree2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeFree2(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pstubdesc?.value?.toCPointer<ByteVar>(), pformatstring?.value?.toCPointer<ByteVar>(), pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrMesTypeFree3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrMesTypeFree3(handle?.value?.toCPointer<ByteVar>(), ppicklinginfo?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>(), arrtypeoffset?.value?.toCPointer<ByteVar>(), ntypeindex, pobject?.value?.toCPointer<ByteVar>())
}

public actual fun ndrNonConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonConformantStringBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrNonConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonConformantStringMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrNonConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonConformantStringMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonConformantStringUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrNsGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNsGetBuffer(pstubmsg?.value?.toCPointer<ByteVar>(), bufferlength, handle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrNsSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?, pautohandle: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrNsSendReceive(pstubmsg?.value?.toCPointer<ByteVar>(), pbufferend?.value?.toCPointer<ByteVar>(), pautohandle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrOleAllocate(size: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrOleAllocate(size)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrOleFree(nodetofree: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrOleFree(nodetofree?.value?.toCPointer<ByteVar>())
}

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>())
}

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>())
}

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerInitialize(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>())
}

public actual fun ndrPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPointerBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPointerFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPointerMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrPointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPointerMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrPointerUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrRangeUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRangeUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrRpcSmClientAllocate(size: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRpcSmClientAllocate(size)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrRpcSmClientFree(nodetofree: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRpcSmClientFree(nodetofree?.value?.toCPointer<ByteVar>())
}

public actual fun ndrRpcSmSetClientToOsf(pmessage: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRpcSmSetClientToOsf(pmessage?.value?.toCPointer<ByteVar>())
}

public actual fun ndrRpcSsDefaultAllocate(size: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRpcSsDefaultAllocate(size)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrRpcSsDefaultFree(nodetofree: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRpcSsDefaultFree(nodetofree?.value?.toCPointer<ByteVar>())
}

public actual fun ndrRpcSsDisableAllocate(pmessage: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRpcSsDisableAllocate(pmessage?.value?.toCPointer<ByteVar>())
}

public actual fun ndrRpcSsEnableAllocate(pmessage: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrRpcSsEnableAllocate(pmessage?.value?.toCPointer<ByteVar>())
}

public actual fun ndrSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSendReceive(pstubmsg?.value?.toCPointer<ByteVar>(), pbufferend?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrServerCall2(prpcmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerCall2(prpcmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrServerCallAll(prpcmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerCallAll(prpcmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrServerCallNdr64(prpcmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerCallNdr64(prpcmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrServerContextMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerContextMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), contexthandle?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun ndrServerContextNewMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerContextNewMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), contexthandle?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrServerContextNewUnmarshall(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerContextNewUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrServerContextUnmarshall(pstubmsg: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerContextUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrServerInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerInitialize(prpcmsg?.value?.toCPointer<ByteVar>(), pstubmsg?.value?.toCPointer<ByteVar>(), pstubdescriptor?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrServerInitializeMarshall(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerInitializeMarshall(prpcmsg?.value?.toCPointer<ByteVar>(), pstubmsg?.value?.toCPointer<ByteVar>())
}

public actual fun ndrServerInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerInitializeNew(prpcmsg?.value?.toCPointer<ByteVar>(), pstubmsg?.value?.toCPointer<ByteVar>(), pstubdescriptor?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrServerInitializePartial(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, requestedbuffersize: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerInitializePartial(prpcmsg?.value?.toCPointer<ByteVar>(), pstubmsg?.value?.toCPointer<ByteVar>(), pstubdescriptor?.value?.toCPointer<ByteVar>(), requestedbuffersize)
}

public actual fun ndrServerInitializeUnmarshall(pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, prpcmsg: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrServerInitializeUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pstubdescriptor?.value?.toCPointer<ByteVar>(), prpcmsg?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrSimpleStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSimpleStructBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrSimpleStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSimpleStructFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrSimpleStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSimpleStructMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrSimpleStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSimpleStructMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrSimpleStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSimpleStructUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrSimpleTypeMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSimpleTypeMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), formatchar)
}

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrSimpleTypeUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), formatchar)
}

public actual fun ndrStubCall2(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrStubCall2(pthis?.value?.toCPointer<ByteVar>(), pchannel?.value?.toCPointer<ByteVar>(), prpcmsg?.value?.toCPointer<ByteVar>(), pdwstubphase?.value?.toCPointer<ByteVar>())

public actual fun ndrStubCall3(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrStubCall3(pthis?.value?.toCPointer<ByteVar>(), pchannel?.value?.toCPointer<ByteVar>(), prpcmsg?.value?.toCPointer<ByteVar>(), pdwstubphase?.value?.toCPointer<ByteVar>())

public actual fun ndrUserMarshalBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrUserMarshalBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrUserMarshalFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrUserMarshalFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrUserMarshalMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrUserMarshalMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrUserMarshalMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrUserMarshalMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: COpaquePointer?, pbuffer: COpaquePointer?, formatchar: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrUserMarshalSimpleTypeConvert(pflags?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), formatchar)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrUserMarshalUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrUserMarshalUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrVaryingArrayBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrVaryingArrayFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrVaryingArrayMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrVaryingArrayMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrVaryingArrayUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsBufferSize(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrXmitOrRepAsFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsFree(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())
}

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMarshall(pstubmsg?.value?.toCPointer<ByteVar>(), pmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMemorySize(pstubmsg?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>())

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsUnmarshall(pstubmsg?.value?.toCPointer<ByteVar>(), ppmemory?.value?.toCPointer<ByteVar>(), pformat?.value?.toCPointer<ByteVar>(), fmustalloc)?.let { COpaquePointer(it.toLong()) }

public actual fun rpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcAsyncAbortCall(pasync?.value?.toCPointer<ByteVar>(), exceptioncode)

public actual fun rpcAsyncCancelCall(pasync: COpaquePointer?, fabort: Bool): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcAsyncCancelCall(pasync?.value?.toCPointer<ByteVar>(), fabort)

public actual fun rpcAsyncCompleteCall(pasync: COpaquePointer?, reply: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcAsyncCompleteCall(pasync?.value?.toCPointer<ByteVar>(), reply?.value?.toCPointer<ByteVar>())

public actual fun rpcAsyncGetCallStatus(pasync: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcAsyncGetCallStatus(pasync?.value?.toCPointer<ByteVar>())

public actual fun rpcAsyncInitializeHandle(pasync: COpaquePointer?, size: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcAsyncInitializeHandle(pasync?.value?.toCPointer<ByteVar>(), size)

public actual fun rpcAsyncRegisterInfo(pasync: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcAsyncRegisterInfo(pasync?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingBind(pasync: COpaquePointer?, binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingBind(pasync?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingCopy(sourcebinding?.value?.toCPointer<ByteVar>(), destinationbinding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingCreateA(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingCreateA(template?.value?.toCPointer<ByteVar>(), security?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingCreateW(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingCreateW(template?.value?.toCPointer<ByteVar>(), security?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingFree(binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingFree(binding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingA(stringbinding?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingW(stringbinding?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqAuthClientA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientA(clientbinding?.value?.toCPointer<ByteVar>(), privs?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqAuthClientExA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExA(clientbinding?.value?.toCPointer<ByteVar>(), privs?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>(), flags)

public actual fun rpcBindingInqAuthClientExW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExW(clientbinding?.value?.toCPointer<ByteVar>(), privs?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>(), flags)

public actual fun rpcBindingInqAuthClientW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientW(clientbinding?.value?.toCPointer<ByteVar>(), privs?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqAuthInfoA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoA(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqAuthInfoExA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExA(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>(), rpcqosversion, securityqos?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqAuthInfoExW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExW(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>(), rpcqosversion, securityqos?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqAuthInfoW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoW(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel?.value?.toCPointer<ByteVar>(), authnsvc?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), authzsvc?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqMaxCalls(binding: COpaquePointer?, maxcalls: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqMaxCalls(binding?.value?.toCPointer<ByteVar>(), maxcalls?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqObject(binding?.value?.toCPointer<ByteVar>(), objectuuid?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingInqOption(hbinding: COpaquePointer?, option: UInt, poptionvalue: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingInqOption(hbinding?.value?.toCPointer<ByteVar>(), option, poptionvalue?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingReset(binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingReset(binding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingServerFromClient(clientbinding: COpaquePointer?, serverbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingServerFromClient(clientbinding?.value?.toCPointer<ByteVar>(), serverbinding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingSetAuthInfoA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoA(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity?.value?.toCPointer<ByteVar>(), authzsvc)

public actual fun rpcBindingSetAuthInfoExA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExA(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity?.value?.toCPointer<ByteVar>(), authzsvc, securityqos?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingSetAuthInfoExW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExW(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity?.value?.toCPointer<ByteVar>(), authzsvc, securityqos?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingSetAuthInfoW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoW(binding?.value?.toCPointer<ByteVar>(), serverprincname?.value?.toCPointer<ByteVar>(), authnlevel, authnsvc, authidentity?.value?.toCPointer<ByteVar>(), authzsvc)

public actual fun rpcBindingSetObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingSetObject(binding?.value?.toCPointer<ByteVar>(), objectuuid?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingSetOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingSetOption(hbinding?.value?.toCPointer<ByteVar>(), option, optionvalue)

public actual fun rpcBindingToStringBindingA(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingToStringBindingA(binding?.value?.toCPointer<ByteVar>(), stringbinding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingToStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingToStringBindingW(binding?.value?.toCPointer<ByteVar>(), stringbinding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingUnbind(binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingUnbind(binding?.value?.toCPointer<ByteVar>())

public actual fun rpcBindingVectorFree(bindingvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcBindingVectorFree(bindingvector?.value?.toCPointer<ByteVar>())

public actual fun rpcCancelThread(thread: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcCancelThread(thread?.value?.toCPointer<ByteVar>())

public actual fun rpcCancelThreadEx(thread: COpaquePointer?, timeout: Int): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcCancelThreadEx(thread?.value?.toCPointer<ByteVar>(), timeout)

public actual fun rpcCertGeneratePrincipalNameA(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameA(context?.value?.toCPointer<ByteVar>(), flags, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun rpcCertGeneratePrincipalNameW(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameW(context?.value?.toCPointer<ByteVar>(), flags, pbuffer?.value?.toCPointer<ByteVar>())

public actual fun rpcEpRegisterA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcEpRegisterA(ifspec?.value?.toCPointer<ByteVar>(), bindingvector?.value?.toCPointer<ByteVar>(), uuidvector?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcEpRegisterNoReplaceA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceA(ifspec?.value?.toCPointer<ByteVar>(), bindingvector?.value?.toCPointer<ByteVar>(), uuidvector?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcEpRegisterNoReplaceW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceW(ifspec?.value?.toCPointer<ByteVar>(), bindingvector?.value?.toCPointer<ByteVar>(), uuidvector?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcEpRegisterW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcEpRegisterW(ifspec?.value?.toCPointer<ByteVar>(), bindingvector?.value?.toCPointer<ByteVar>(), uuidvector?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcEpResolveBinding(binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcEpResolveBinding(binding?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>())

public actual fun rpcEpUnregister(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcEpUnregister(ifspec?.value?.toCPointer<ByteVar>(), bindingvector?.value?.toCPointer<ByteVar>(), uuidvector?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorAddRecord(errorinfo: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorAddRecord(errorinfo?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorClearInformation() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorClearInformation()
}

public actual fun rpcErrorEndEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorEndEnumeration(enumhandle?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorGetNextRecord(enumhandle: COpaquePointer?, copystrings: Bool, errorinfo: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorGetNextRecord(enumhandle?.value?.toCPointer<ByteVar>(), copystrings, errorinfo?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorGetNumberOfRecords(enumhandle: COpaquePointer?, records: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorGetNumberOfRecords(enumhandle?.value?.toCPointer<ByteVar>(), records?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorLoadErrorInfo(errorblob: COpaquePointer?, blobsize: ULong, enumhandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorLoadErrorInfo(errorblob?.value?.toCPointer<ByteVar>(), blobsize, enumhandle?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorResetEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorResetEnumeration(enumhandle?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorSaveErrorInfo(enumhandle: COpaquePointer?, errorblob: COpaquePointer?, blobsize: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorSaveErrorInfo(enumhandle?.value?.toCPointer<ByteVar>(), errorblob?.value?.toCPointer<ByteVar>(), blobsize?.value?.toCPointer<ByteVar>())

public actual fun rpcErrorStartEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcErrorStartEnumeration(enumhandle?.value?.toCPointer<ByteVar>())

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcExceptionFilter(exceptioncode)

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcFreeAuthorizationContext(pauthzclientcontext?.value?.toCPointer<ByteVar>())

public actual fun rpcGetAuthorizationContextForClient(clientbinding: COpaquePointer?, impersonateonreturn: Bool, reserved1: COpaquePointer?, pexpirationtime: COpaquePointer?, reserved2: Luid, reserved3: UInt, reserved4: COpaquePointer?, pauthzclientcontext: COpaquePointer?): RpcStatus =
    0

public actual fun rpcIfIdVectorFree(ifidvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcIfIdVectorFree(ifidvector?.value?.toCPointer<ByteVar>())

public actual fun rpcIfInqId(rpcifhandle: COpaquePointer?, rpcifid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcIfInqId(rpcifhandle?.value?.toCPointer<ByteVar>(), rpcifid?.value?.toCPointer<ByteVar>())

public actual fun rpcImpersonateClient(bindinghandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcImpersonateClient(bindinghandle?.value?.toCPointer<ByteVar>())

public actual fun rpcImpersonateClient2(bindinghandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcImpersonateClient2(bindinghandle?.value?.toCPointer<ByteVar>())

public actual fun rpcImpersonateClientContainer(bindinghandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcImpersonateClientContainer(bindinghandle?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtEnableIdleCleanup()

public actual fun rpcMgmtEpEltInqBegin(epbinding: COpaquePointer?, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, objectuuid: COpaquePointer?, inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqBegin(epbinding?.value?.toCPointer<ByteVar>(), inquirytype, ifid?.value?.toCPointer<ByteVar>(), versoption, objectuuid?.value?.toCPointer<ByteVar>(), inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtEpEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqDone(inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextA(inquirycontext?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>(), objectuuid?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextW(inquirycontext?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>(), objectuuid?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtEpUnregister(epbinding: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtEpUnregister(epbinding?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>(), objectuuid?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtInqComTimeout(binding: COpaquePointer?, timeout: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtInqComTimeout(binding?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtInqDefaultProtectLevel(authnsvc, authnlevel?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtInqIfIds(binding: COpaquePointer?, ifidvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtInqIfIds(binding?.value?.toCPointer<ByteVar>(), ifidvector?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtInqServerPrincNameA(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameA(binding?.value?.toCPointer<ByteVar>(), authnsvc, serverprincname?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtInqServerPrincNameW(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameW(binding?.value?.toCPointer<ByteVar>(), authnsvc, serverprincname?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtInqStats(binding: COpaquePointer?, statistics: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtInqStats(binding?.value?.toCPointer<ByteVar>(), statistics?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtIsServerListening(binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtIsServerListening(binding?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtSetAuthorizationFn(0L.toCPointer<ByteVar>())

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtSetCancelTimeout(timeout)

public actual fun rpcMgmtSetComTimeout(binding: COpaquePointer?, timeout: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtSetComTimeout(binding?.value?.toCPointer<ByteVar>(), timeout)

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtSetServerStackSize(threadstacksize)

public actual fun rpcMgmtStatsVectorFree(statsvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtStatsVectorFree(statsvector?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtStopServerListening(binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtStopServerListening(binding?.value?.toCPointer<ByteVar>())

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcMgmtWaitServerListen()

public actual fun rpcNetworkInqProtseqsA(protseqvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsA(protseqvector?.value?.toCPointer<ByteVar>())

public actual fun rpcNetworkInqProtseqsW(protseqvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsW(protseqvector?.value?.toCPointer<ByteVar>())

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidA(protseq?.value?.toCPointer<ByteVar>())

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidW(protseq?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingExportA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), bindingvec?.value?.toCPointer<ByteVar>(), objectuuidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objectvector?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objectvector?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingExportW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), bindingvec?.value?.toCPointer<ByteVar>(), objectuuidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objuuid?.value?.toCPointer<ByteVar>(), importcontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objuuid?.value?.toCPointer<ByteVar>(), importcontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingImportDone(importcontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingImportDone(importcontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingImportNext(importcontext: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingImportNext(importcontext?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingInqEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameA(binding?.value?.toCPointer<ByteVar>(), entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingInqEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameW(binding?.value?.toCPointer<ByteVar>(), entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objuuid?.value?.toCPointer<ByteVar>(), bindingmaxcount, lookupcontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objuuid?.value?.toCPointer<ByteVar>(), bindingmaxcount, lookupcontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingLookupDone(lookupcontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingLookupDone(lookupcontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingLookupNext(lookupcontext: COpaquePointer?, bindingvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingLookupNext(lookupcontext?.value?.toCPointer<ByteVar>(), bindingvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingSelect(bindingvec: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingSelect(bindingvec?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objectuuidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objectvector?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objectvector?.value?.toCPointer<ByteVar>())

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifspec?.value?.toCPointer<ByteVar>(), objectuuidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), expandedname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), expandedname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsEntryObjectInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqDone(inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsEntryObjectInqNext(inquirycontext: COpaquePointer?, objuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqNext(inquirycontext?.value?.toCPointer<ByteVar>(), objuuid?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupDeleteA(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupDeleteW(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddA(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddW(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginA(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>(), membernamesyntax, inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginW(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>(), membernamesyntax, inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqDone(inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextA(inquirycontext?.value?.toCPointer<ByteVar>(), membername?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextW(inquirycontext?.value?.toCPointer<ByteVar>(), membername?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveA(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>())

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveW(groupnamesyntax, groupname?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), versoption, objectuuidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), versoption, objectuuidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsA(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsW(entrynamesyntax, entryname?.value?.toCPointer<ByteVar>(), ifidvec?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: COpaquePointer?, expirationage: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtHandleSetExpAge(nshandle?.value?.toCPointer<ByteVar>(), expirationage)

public actual fun rpcNsMgmtInqExpAge(expirationage: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtInqExpAge(expirationage?.value?.toCPointer<ByteVar>())

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsMgmtSetExpAge(expirationage)

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileDeleteA(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileDeleteW(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltAddA(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>(), priority, annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltAddW(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>(), priority, annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginA(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>(), inquirytype, ifid?.value?.toCPointer<ByteVar>(), versoption, membernamesyntax, membername?.value?.toCPointer<ByteVar>(), inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginW(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>(), inquirytype, ifid?.value?.toCPointer<ByteVar>(), versoption, membernamesyntax, membername?.value?.toCPointer<ByteVar>(), inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqDone(inquirycontext?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextA(inquirycontext?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), membername?.value?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextW(inquirycontext?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), membername?.value?.toCPointer<ByteVar>(), priority?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveA(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>())

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveW(profilenamesyntax, profilename?.value?.toCPointer<ByteVar>(), ifid?.value?.toCPointer<ByteVar>(), membernamesyntax, membername?.value?.toCPointer<ByteVar>())

public actual fun rpcObjectInqType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcObjectInqType(objuuid?.value?.toCPointer<ByteVar>(), typeuuid?.value?.toCPointer<ByteVar>())

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcObjectSetInqFn(0L.toCPointer<ByteVar>())

public actual fun rpcObjectSetType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcObjectSetType(objuuid?.value?.toCPointer<ByteVar>(), typeuuid?.value?.toCPointer<ByteVar>())

public actual fun rpcProtseqVectorFreeA(protseqvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeA(protseqvector?.value?.toCPointer<ByteVar>())

public actual fun rpcProtseqVectorFreeW(protseqvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeW(protseqvector?.value?.toCPointer<ByteVar>())

public actual fun rpcRaiseException(exception: RpcStatus) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcRaiseException(exception)
}

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcRevertContainerImpersonation()

public actual fun rpcRevertToSelf(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcRevertToSelf()

public actual fun rpcRevertToSelfEx(bindinghandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcRevertToSelfEx(bindinghandle?.value?.toCPointer<ByteVar>())

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: COpaquePointer?, status: RpcStatus): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerCompleteSecurityCallback(bindinghandle?.value?.toCPointer<ByteVar>(), status)

public actual fun rpcServerInqBindingHandle(binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqBindingHandle(binding?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInqBindings(bindingvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqBindings(bindingvector?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInqBindingsEx(securitydescriptor: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqBindingsEx(securitydescriptor?.value?.toCPointer<ByteVar>(), bindingvector?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInqCallAttributesA(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesA(clientbinding?.value?.toCPointer<ByteVar>(), rpccallattributes?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInqCallAttributesW(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesW(clientbinding?.value?.toCPointer<ByteVar>(), rpccallattributes?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameA(authnsvc, princname?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameW(authnsvc, princname?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInqIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInqIf(ifspec?.value?.toCPointer<ByteVar>(), mgrtypeuuid?.value?.toCPointer<ByteVar>(), mgrepv?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInterfaceGroupActivate(ifgroup: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupActivate(ifgroup?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInterfaceGroupClose(ifgroup: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupClose(ifgroup?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInterfaceGroupCreateA(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateA(interfaces?.value?.toCPointer<ByteVar>(), numifs, endpoints?.value?.toCPointer<ByteVar>(), numendpoints, idleperiod, 0L.toCPointer<ByteVar>(), idlecallbackcontext?.value?.toCPointer<ByteVar>(), ifgroup?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInterfaceGroupCreateW(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateW(interfaces?.value?.toCPointer<ByteVar>(), numifs, endpoints?.value?.toCPointer<ByteVar>(), numendpoints, idleperiod, 0L.toCPointer<ByteVar>(), idlecallbackcontext?.value?.toCPointer<ByteVar>(), ifgroup?.value?.toCPointer<ByteVar>())

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: COpaquePointer?, forcedeactivation: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupDeactivate(ifgroup?.value?.toCPointer<ByteVar>(), forcedeactivation)

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupInqBindings(ifgroup?.value?.toCPointer<ByteVar>(), bindingvector?.value?.toCPointer<ByteVar>())

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerListen(minimumcallthreads, maxcalls, dontwait)

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoA(serverprincname?.value?.toCPointer<ByteVar>(), authnsvc, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoW(serverprincname?.value?.toCPointer<ByteVar>(), authnsvc, 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun rpcServerRegisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerRegisterIf(ifspec?.value?.toCPointer<ByteVar>(), mgrtypeuuid?.value?.toCPointer<ByteVar>(), mgrepv?.value?.toCPointer<ByteVar>())

public actual fun rpcServerRegisterIf2(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerRegisterIf2(ifspec?.value?.toCPointer<ByteVar>(), mgrtypeuuid?.value?.toCPointer<ByteVar>(), mgrepv?.value?.toCPointer<ByteVar>(), flags, maxcalls, maxrpcsize, 0L.toCPointer<ByteVar>())

public actual fun rpcServerRegisterIf3(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerRegisterIf3(ifspec?.value?.toCPointer<ByteVar>(), mgrtypeuuid?.value?.toCPointer<ByteVar>(), mgrepv?.value?.toCPointer<ByteVar>(), flags, maxcalls, maxrpcsize, 0L.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerRegisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerRegisterIfEx(ifspec?.value?.toCPointer<ByteVar>(), mgrtypeuuid?.value?.toCPointer<ByteVar>(), mgrepv?.value?.toCPointer<ByteVar>(), flags, maxcalls, 0L.toCPointer<ByteVar>())

public actual fun rpcServerSubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerSubscribeForNotification(binding?.value?.toCPointer<ByteVar>(), notification, notificationtype, notificationinfo?.value?.toCPointer<ByteVar>())

public actual fun rpcServerTestCancel(bindinghandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerTestCancel(bindinghandle?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUnregisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, waitforcallstocomplete: UInt): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUnregisterIf(ifspec?.value?.toCPointer<ByteVar>(), mgrtypeuuid?.value?.toCPointer<ByteVar>(), waitforcallstocomplete)

public actual fun rpcServerUnregisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, rundowncontexthandles: Int): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUnregisterIfEx(ifspec?.value?.toCPointer<ByteVar>(), mgrtypeuuid?.value?.toCPointer<ByteVar>(), rundowncontexthandles)

public actual fun rpcServerUnsubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationsqueued: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUnsubscribeForNotification(binding?.value?.toCPointer<ByteVar>(), notification, notificationsqueued?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqs(maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsEx(maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIf(maxcalls, ifspec?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIfEx(maxcalls, ifspec?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqA(protseq?.value?.toCPointer<ByteVar>(), maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpA(protseq?.value?.toCPointer<ByteVar>(), maxcalls, endpoint?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExA(protseq?.value?.toCPointer<ByteVar>(), maxcalls, endpoint?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExW(protseq?.value?.toCPointer<ByteVar>(), maxcalls, endpoint?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpW(protseq?.value?.toCPointer<ByteVar>(), maxcalls, endpoint?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqExA(protseq?.value?.toCPointer<ByteVar>(), maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqExW(protseq?.value?.toCPointer<ByteVar>(), maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfA(protseq?.value?.toCPointer<ByteVar>(), maxcalls, ifspec?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExA(protseq?.value?.toCPointer<ByteVar>(), maxcalls, ifspec?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExW(protseq?.value?.toCPointer<ByteVar>(), maxcalls, ifspec?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfW(protseq?.value?.toCPointer<ByteVar>(), maxcalls, ifspec?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerUseProtseqW(protseq?.value?.toCPointer<ByteVar>(), maxcalls, securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun rpcServerYield() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcServerYield()
}

public actual fun rpcSmAllocate(size: ULong, pstatus: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmAllocate(size, pstatus?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rpcSmClientFree(pnodetofree: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmClientFree(pnodetofree?.value?.toCPointer<ByteVar>())

public actual fun rpcSmDestroyClientContext(contexthandle: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmDestroyClientContext(contexthandle?.value?.toCPointer<ByteVar>())

public actual fun rpcSmDisableAllocate(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmDisableAllocate()

public actual fun rpcSmEnableAllocate(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmEnableAllocate()

public actual fun rpcSmFree(nodetofree: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmFree(nodetofree?.value?.toCPointer<ByteVar>())

public actual fun rpcSmGetThreadHandle(pstatus: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmGetThreadHandle(pstatus?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmSetClientAllocFree(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun rpcSmSetThreadHandle(id: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmSetThreadHandle(id?.value?.toCPointer<ByteVar>())

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSmSwapClientAllocFree(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), oldclientalloc?.value?.toCPointer<ByteVar>(), oldclientfree?.value?.toCPointer<ByteVar>())

public actual fun rpcSsAllocate(size: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsAllocate(size)?.let { COpaquePointer(it.toLong()) }

public actual fun rpcSsContextLockExclusive(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsContextLockExclusive(serverbindinghandle?.value?.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun rpcSsContextLockShared(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsContextLockShared(serverbindinghandle?.value?.toCPointer<ByteVar>(), usercontext?.value?.toCPointer<ByteVar>())

public actual fun rpcSsDestroyClientContext(contexthandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsDestroyClientContext(contexthandle?.value?.toCPointer<ByteVar>())
}

public actual fun rpcSsDisableAllocate() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsDisableAllocate()
}

public actual fun rpcSsDontSerializeContext() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsDontSerializeContext()
}

public actual fun rpcSsEnableAllocate() {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsEnableAllocate()
}

public actual fun rpcSsFree(nodetofree: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsFree(nodetofree?.value?.toCPointer<ByteVar>())
}

public actual fun rpcSsGetContextBinding(contexthandle: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsGetContextBinding(contexthandle?.value?.toCPointer<ByteVar>(), binding?.value?.toCPointer<ByteVar>())

public actual fun rpcSsGetThreadHandle(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsGetThreadHandle()?.let { COpaquePointer(it.toLong()) }

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsSetClientAllocFree(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun rpcSsSetThreadHandle(id: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsSetThreadHandle(id?.value?.toCPointer<ByteVar>())
}

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcSsSwapClientAllocFree(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), oldclientalloc?.value?.toCPointer<ByteVar>(), oldclientfree?.value?.toCPointer<ByteVar>())
}

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcStringBindingComposeA(objuuid?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), networkaddr?.value?.toCPointer<ByteVar>(), endpoint?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), stringbinding?.value?.toCPointer<ByteVar>())

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcStringBindingComposeW(objuuid?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), networkaddr?.value?.toCPointer<ByteVar>(), endpoint?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), stringbinding?.value?.toCPointer<ByteVar>())

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcStringBindingParseA(stringbinding?.value?.toCPointer<ByteVar>(), objuuid?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), networkaddr?.value?.toCPointer<ByteVar>(), endpoint?.value?.toCPointer<ByteVar>(), networkoptions?.value?.toCPointer<ByteVar>())

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcStringBindingParseW(stringbinding?.value?.toCPointer<ByteVar>(), objuuid?.value?.toCPointer<ByteVar>(), protseq?.value?.toCPointer<ByteVar>(), networkaddr?.value?.toCPointer<ByteVar>(), endpoint?.value?.toCPointer<ByteVar>(), networkoptions?.value?.toCPointer<ByteVar>())

public actual fun rpcStringFreeA(string: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcStringFreeA(string?.value?.toCPointer<ByteVar>())

public actual fun rpcStringFreeW(string: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcStringFreeW(string?.value?.toCPointer<ByteVar>())

public actual fun rpcTestCancel(): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcTestCancel()

public actual fun rpcUserFree(asynchandle: COpaquePointer?, pbuffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_rpcUserFree(asynchandle?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>())
}

public actual fun uuidCompare(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidCompare(uuid1?.value?.toCPointer<ByteVar>(), uuid2?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uuidCreate(uuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidCreate(uuid?.value?.toCPointer<ByteVar>())

public actual fun uuidCreateNil(niluuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidCreateNil(niluuid?.value?.toCPointer<ByteVar>())

public actual fun uuidCreateSequential(uuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidCreateSequential(uuid?.value?.toCPointer<ByteVar>())

public actual fun uuidEqual(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidEqual(uuid1?.value?.toCPointer<ByteVar>(), uuid2?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidFromStringA(stringuuid?.value?.toCPointer<ByteVar>(), uuid?.value?.toCPointer<ByteVar>())

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidFromStringW(stringuuid?.value?.toCPointer<ByteVar>(), uuid?.value?.toCPointer<ByteVar>())

public actual fun uuidHash(uuid: COpaquePointer?, status: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidHash(uuid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uuidIsNil(uuid: COpaquePointer?, status: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidIsNil(uuid?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())

public actual fun uuidToStringA(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidToStringA(uuid?.value?.toCPointer<ByteVar>(), stringuuid?.value?.toCPointer<ByteVar>())

public actual fun uuidToStringW(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    io.github.kotlinmania.windowssys.windows.win32.system.rpc.cinterop.windowssys_windows_win32_system_rpc_uuidToStringW(uuid?.value?.toCPointer<ByteVar>(), stringuuid?.value?.toCPointer<ByteVar>())
