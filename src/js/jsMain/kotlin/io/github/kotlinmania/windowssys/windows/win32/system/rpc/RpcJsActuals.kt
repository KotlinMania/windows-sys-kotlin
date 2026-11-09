@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID

private val _windowsWin32SystemRpcNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DceErrorInqTextA(rpcstatus: RPC_STATUS, errortext: PSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_DceErrorInqTextA(rpcstatus, errortext.toString()) as Int) else 0

public actual fun DceErrorInqTextW(rpcstatus: RPC_STATUS, errortext: PWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_DceErrorInqTextW(rpcstatus, errortext.toString()) as Int) else 0

public actual fun IUnknown_AddRef_Proxy(thisRef: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_IUnknown_AddRef_Proxy(thisRef.toString()) as Int).toUInt() else 0u

public actual fun IUnknown_QueryInterface_Proxy(thisRef: Long, riid: Long, ppvobject: Long): HRESULT =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_IUnknown_QueryInterface_Proxy(thisRef.toString(), riid.toString(), ppvobject.toString()) as Int) else 0

public actual fun IUnknown_Release_Proxy(thisRef: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_IUnknown_Release_Proxy(thisRef.toString()) as Int).toUInt() else 0u

public actual fun I_RpcAllocate(size: UInt): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcAllocate(size.toInt()) as String).toLong() else 0L

public actual fun I_RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcAsyncAbortCall(pasync.toString(), exceptioncode.toInt()) as Int) else 0

public actual fun I_RpcAsyncSetHandle(message: Long, pasync: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcAsyncSetHandle(message.toString(), pasync.toString()) as Int) else 0

public actual fun I_RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingCopy(sourcebinding.toString(), destinationbinding.toString()) as Int) else 0

public actual fun I_RpcBindingCreateNP(servername: PCWSTR, servicename: PCWSTR, networkoptions: PCWSTR, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingCreateNP(servername.toString(), servicename.toString(), networkoptions.toString(), binding.toString()) as Int) else 0

public actual fun I_RpcBindingHandleToAsyncHandle(binding: Long, asynchandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingHandleToAsyncHandle(binding.toString(), asynchandle.toString()) as Int) else 0

public actual fun I_RpcBindingInqClientTokenAttributes(binding: Long, tokenid: Long, authenticationid: Long, modifiedid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqClientTokenAttributes(binding.toString(), tokenid.toString(), authenticationid.toString(), modifiedid.toString()) as Int) else 0

public actual fun I_RpcBindingInqDynamicEndpointA(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointA(binding.toString(), dynamicendpoint.toString()) as Int) else 0

public actual fun I_RpcBindingInqDynamicEndpointW(binding: Long, dynamicendpoint: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqDynamicEndpointW(binding.toString(), dynamicendpoint.toString()) as Int) else 0

public actual fun I_RpcBindingInqLocalClientPID(binding: Long, pid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqLocalClientPID(binding.toString(), pid.toString()) as Int) else 0

public actual fun I_RpcBindingInqMarshalledTargetInfo(binding: Long, marshalledtargetinfosize: Long, marshalledtargetinfo: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqMarshalledTargetInfo(binding.toString(), marshalledtargetinfosize.toString(), marshalledtargetinfo.toString()) as Int) else 0

public actual fun I_RpcBindingInqSecurityContext(binding: Long, securitycontexthandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContext(binding.toString(), securitycontexthandle.toString()) as Int) else 0

public actual fun I_RpcBindingInqSecurityContextKeyInfo(binding: Long, keyinfo: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqSecurityContextKeyInfo(binding.toString(), keyinfo.toString()) as Int) else 0

public actual fun I_RpcBindingInqTransportType(binding: Long, type: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqTransportType(binding.toString(), type.toString()) as Int) else 0

public actual fun I_RpcBindingInqWireIdForSnego(binding: Long, wireid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingInqWireIdForSnego(binding.toString(), wireid.toString()) as Int) else 0

public actual fun I_RpcBindingIsClientLocal(bindinghandle: Long, clientlocalflag: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingIsClientLocal(bindinghandle.toString(), clientlocalflag.toString()) as Int) else 0

public actual fun I_RpcBindingIsServerLocal(binding: Long, serverlocalflag: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingIsServerLocal(binding.toString(), serverlocalflag.toString()) as Int) else 0

public actual fun I_RpcBindingSetPrivateOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingSetPrivateOption(hbinding.toString(), option.toInt(), optionvalue.toString()) as Int) else 0

public actual fun I_RpcBindingToStaticStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcBindingToStaticStringBindingW(binding.toString(), stringbinding.toString()) as Int) else 0

public actual fun I_RpcClearMutex(mutex: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcClearMutex(mutex.toString())
    }
}

public actual fun I_RpcDeleteMutex(mutex: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcDeleteMutex(mutex.toString())
    }
}

public actual fun I_RpcExceptionFilter(exceptioncode: UInt): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcExceptionFilter(exceptioncode.toInt()) as Int) else 0

public actual fun I_RpcFree(obj: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcFree(obj.toString())
    }
}

public actual fun I_RpcFreeBuffer(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcFreeBuffer(message.toString()) as Int) else 0

public actual fun I_RpcFreePipeBuffer(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcFreePipeBuffer(message.toString()) as Int) else 0

public actual fun I_RpcGetBuffer(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcGetBuffer(message.toString()) as Int) else 0

public actual fun I_RpcGetBufferWithObject(message: Long, objectuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcGetBufferWithObject(message.toString(), objectuuid.toString()) as Int) else 0

public actual fun I_RpcGetCurrentCallHandle(): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcGetCurrentCallHandle() as String).toLong() else 0L

public actual fun I_RpcGetDefaultSD(ppsecuritydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcGetDefaultSD(ppsecuritydescriptor.toString()) as Int) else 0

public actual fun I_RpcGetExtendedError(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcGetExtendedError() as Int) else 0

public actual fun I_RpcIfInqTransferSyntaxes(rpcifhandle: Long, transfersyntaxes: Long, transfersyntaxsize: UInt, transfersyntaxcount: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcIfInqTransferSyntaxes(rpcifhandle.toString(), transfersyntaxes.toString(), transfersyntaxsize.toInt(), transfersyntaxcount.toString()) as Int) else 0

public actual fun I_RpcMapWin32Status(status: RPC_STATUS): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcMapWin32Status(status) as Int) else 0

public actual fun I_RpcMgmtEnableDedicatedThreadPool(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcMgmtEnableDedicatedThreadPool() as Int) else 0

public actual fun I_RpcNegotiateTransferSyntax(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNegotiateTransferSyntax(message.toString()) as Int) else 0

public actual fun I_RpcNsBindingSetEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameA(binding.toString(), entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun I_RpcNsBindingSetEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNsBindingSetEntryNameW(binding.toString(), entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun I_RpcNsGetBuffer(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNsGetBuffer(message.toString()) as Int) else 0

public actual fun I_RpcNsInterfaceExported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNsInterfaceExported(entrynamesyntax.toInt(), entryname.toString(), rpcinterfaceinformation.toString()) as Int) else 0

public actual fun I_RpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: Long, rpcinterfaceinformation: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNsInterfaceUnexported(entrynamesyntax.toInt(), entryname.toString(), rpcinterfaceinformation.toString()) as Int) else 0

public actual fun I_RpcNsRaiseException(message: Long, status: RPC_STATUS) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNsRaiseException(message.toString(), status)
    }
}

public actual fun I_RpcNsSendReceive(message: Long, handle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcNsSendReceive(message.toString(), handle.toString()) as Int) else 0

public actual fun I_RpcOpenClientProcess(binding: Long, desiredaccess: UInt, clientprocess: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcOpenClientProcess(binding.toString(), desiredaccess.toInt(), clientprocess.toString()) as Int) else 0

public actual fun I_RpcPauseExecution(milliseconds: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcPauseExecution(milliseconds.toInt())
    }
}

public actual fun I_RpcReBindBuffer(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcReBindBuffer(message.toString()) as Int) else 0

public actual fun I_RpcReallocPipeBuffer(message: Long, newsize: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcReallocPipeBuffer(message.toString(), newsize.toInt()) as Int) else 0

public actual fun I_RpcReceive(message: Long, size: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcReceive(message.toString(), size.toInt()) as Int) else 0

public actual fun I_RpcRecordCalloutFailure(rpcstatus: RPC_STATUS, calloutstate: Long, dllname: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcRecordCalloutFailure(rpcstatus, calloutstate.toString(), dllname.toString())
    }
}

public actual fun I_RpcRequestMutex(mutex: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcRequestMutex(mutex.toString())
    }
}

public actual fun I_RpcSend(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcSend(message.toString()) as Int) else 0

public actual fun I_RpcSendReceive(message: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcSendReceive(message.toString()) as Int) else 0

public actual fun I_RpcServerCheckClientRestriction(context: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerCheckClientRestriction(context.toString()) as Int) else 0

public actual fun I_RpcServerDisableExceptionFilter(): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerDisableExceptionFilter() as Int) else 0

public actual fun I_RpcServerGetAssociationID(binding: Long, associationid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerGetAssociationID(binding.toString(), associationid.toString()) as Int) else 0

public actual fun I_RpcServerInqAddressChangeFn(): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerInqAddressChangeFn() as String).toLong() else 0L

public actual fun I_RpcServerInqLocalConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerInqLocalConnAddress(binding.toString(), buffer.toString(), buffersize.toString(), addressformat.toString()) as Int) else 0

public actual fun I_RpcServerInqRemoteConnAddress(binding: Long, buffer: Long, buffersize: Long, addressformat: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerInqRemoteConnAddress(binding.toString(), buffer.toString(), buffersize.toString(), addressformat.toString()) as Int) else 0

public actual fun I_RpcServerInqTransportType(type: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerInqTransportType(type.toString()) as Int) else 0

public actual fun I_RpcServerRegisterForwardFunction(pforwardfunction: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerRegisterForwardFunction(pforwardfunction.toString()) as Int) else 0

public actual fun I_RpcServerSetAddressChangeFn(paddresschangefn: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerSetAddressChangeFn(paddresschangefn.toString()) as Int) else 0

public actual fun I_RpcServerStartService(protseq: PCWSTR, endpoint: PCWSTR, ifspec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerStartService(protseq.toString(), endpoint.toString(), ifspec.toString()) as Int) else 0

public actual fun I_RpcServerSubscribeForDisconnectNotification(binding: Long, hevent: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification(binding.toString(), hevent.toString()) as Int) else 0

public actual fun I_RpcServerSubscribeForDisconnectNotification2(binding: Long, hevent: Long, subscriptionid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerSubscribeForDisconnectNotification2(binding.toString(), hevent.toString(), subscriptionid.toString()) as Int) else 0

public actual fun I_RpcServerUnsubscribeForDisconnectNotification(binding: Long, subscriptionid: GUID): RPC_STATUS =
    0

public actual fun I_RpcServerUseProtseq2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2A(networkaddress.toString(), protseq.toString(), maxcalls.toInt(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun I_RpcServerUseProtseq2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseq2W(networkaddress.toString(), protseq.toString(), maxcalls.toInt(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun I_RpcServerUseProtseqEp2A(networkaddress: PCSTR, protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2A(networkaddress.toString(), protseq.toString(), maxcalls.toInt(), endpoint.toString(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun I_RpcServerUseProtseqEp2W(networkaddress: PCWSTR, protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcServerUseProtseqEp2W(networkaddress.toString(), protseq.toString(), maxcalls.toInt(), endpoint.toString(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun I_RpcSessionStrictContextHandle() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcSessionStrictContextHandle()
    }
}

public actual fun I_RpcSsDontSerializeContext() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcSsDontSerializeContext()
    }
}

public actual fun I_RpcSystemHandleTypeSpecificWork(handle: Long, actualtype: UByte, idltype: UByte, marshaldirection: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcSystemHandleTypeSpecificWork(handle.toString(), actualtype.toInt(), idltype.toInt(), marshaldirection) as Int) else 0

public actual fun I_RpcTurnOnEEInfoPropagation(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_RpcTurnOnEEInfoPropagation() as Int) else 0

public actual fun I_UuidCreate(uuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_I_UuidCreate(uuid.toString()) as Int) else 0

public actual fun MesBufferHandleReset(handle: Long, handlestyle: UInt, operation: MIDL_ES_CODE, pbuffer: Long, buffersize: UInt, pencodedsize: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesBufferHandleReset(handle.toString(), handlestyle.toInt(), operation, pbuffer.toString(), buffersize.toInt(), pencodedsize.toString()) as Int) else 0

public actual fun MesDecodeBufferHandleCreate(buffer: PCSTR, buffersize: UInt, phandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesDecodeBufferHandleCreate(buffer.toString(), buffersize.toInt(), phandle.toString()) as Int) else 0

public actual fun MesDecodeIncrementalHandleCreate(userstate: Long, readfn: MIDL_ES_READ, phandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesDecodeIncrementalHandleCreate(userstate.toString(), readfn.toLong().toString(), phandle.toString()) as Int) else 0

public actual fun MesEncodeDynBufferHandleCreate(pbuffer: Long, pencodedsize: Long, phandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesEncodeDynBufferHandleCreate(pbuffer.toString(), pencodedsize.toString(), phandle.toString()) as Int) else 0

public actual fun MesEncodeFixedBufferHandleCreate(pbuffer: PSTR, buffersize: UInt, pencodedsize: Long, phandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesEncodeFixedBufferHandleCreate(pbuffer.toString(), buffersize.toInt(), pencodedsize.toString(), phandle.toString()) as Int) else 0

public actual fun MesEncodeIncrementalHandleCreate(userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, phandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesEncodeIncrementalHandleCreate(userstate.toString(), allocfn.toLong().toString(), writefn.toLong().toString(), phandle.toString()) as Int) else 0

public actual fun MesHandleFree(handle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesHandleFree(handle.toString()) as Int) else 0

public actual fun MesIncrementalHandleReset(handle: Long, userstate: Long, allocfn: MIDL_ES_ALLOC, writefn: MIDL_ES_WRITE, readfn: MIDL_ES_READ, operation: MIDL_ES_CODE): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesIncrementalHandleReset(handle.toString(), userstate.toString(), allocfn.toLong().toString(), writefn.toLong().toString(), readfn.toLong().toString(), operation) as Int) else 0

public actual fun MesInqProcEncodingId(handle: Long, pinterfaceid: Long, pprocnum: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_MesInqProcEncodingId(handle.toString(), pinterfaceid.toString(), pprocnum.toString()) as Int) else 0

public actual fun NDRCContextBinding(ccontext: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRCContextBinding(ccontext.toString()) as String).toLong() else 0L

public actual fun NDRCContextMarshall(ccontext: Long, pbuff: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRCContextMarshall(ccontext.toString(), pbuff.toString())
    }
}

public actual fun NDRCContextUnmarshall(pccontext: Long, hbinding: Long, pbuff: Long, datarepresentation: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRCContextUnmarshall(pccontext.toString(), hbinding.toString(), pbuff.toString(), datarepresentation.toInt())
    }
}

public actual fun NDRSContextMarshall(ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRSContextMarshall(ccontext.toString(), pbuff.toString(), userrundownin.toLong().toString())
    }
}

public actual fun NDRSContextMarshall2(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN, ctxguard: Long, flags: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRSContextMarshall2(bindinghandle.toString(), ccontext.toString(), pbuff.toString(), userrundownin.toLong().toString(), ctxguard.toString(), flags.toInt())
    }
}

public actual fun NDRSContextMarshallEx(bindinghandle: Long, ccontext: Long, pbuff: Long, userrundownin: NDR_RUNDOWN) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRSContextMarshallEx(bindinghandle.toString(), ccontext.toString(), pbuff.toString(), userrundownin.toLong().toString())
    }
}

public actual fun NDRSContextUnmarshall(pbuff: Long, datarepresentation: UInt): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRSContextUnmarshall(pbuff.toString(), datarepresentation.toInt()) as String).toLong() else 0L

public actual fun NDRSContextUnmarshall2(bindinghandle: Long, pbuff: Long, datarepresentation: UInt, ctxguard: Long, flags: UInt): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRSContextUnmarshall2(bindinghandle.toString(), pbuff.toString(), datarepresentation.toInt(), ctxguard.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun NDRSContextUnmarshallEx(bindinghandle: Long, pbuff: Long, datarepresentation: UInt): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NDRSContextUnmarshallEx(bindinghandle.toString(), pbuff.toString(), datarepresentation.toInt()) as String).toLong() else 0L

public actual fun Ndr64AsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64AsyncServerCall64(prpcmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_Ndr64AsyncServerCall64(prpcmsg.toString())
    }
}

public actual fun Ndr64AsyncServerCallAll(prpcmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_Ndr64AsyncServerCallAll(prpcmsg.toString())
    }
}

public actual fun Ndr64DcomAsyncClientCall(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun Ndr64DcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_Ndr64DcomAsyncStubCall(pthis.toString(), pchannel.toString(), prpcmsg.toString(), pdwstubphase.toString()) as Int) else 0

public actual fun NdrAllocate(pstubmsg: Long, len: ULong): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrAllocate(pstubmsg.toString(), len.toString()) as String).toLong() else 0L

public actual fun NdrAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrAsyncServerCall(prpcmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrAsyncServerCall(prpcmsg.toString())
    }
}

public actual fun NdrByteCountPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrByteCountPointerBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrByteCountPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrByteCountPointerFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrByteCountPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrByteCountPointerMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrByteCountPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrByteCountPointerUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrClearOutParameters(pstubmsg: Long, pformat: Long, argaddr: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrClearOutParameters(pstubmsg.toString(), pformat.toString(), argaddr.toString())
    }
}

public actual fun NdrClientCall2(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientCall3(pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrClientContextMarshall(pstubmsg: Long, contexthandle: Long, fcheck: Int) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrClientContextMarshall(pstubmsg.toString(), contexthandle.toString(), fcheck)
    }
}

public actual fun NdrClientContextUnmarshall(pstubmsg: Long, pcontexthandle: Long, bindhandle: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrClientContextUnmarshall(pstubmsg.toString(), pcontexthandle.toString(), bindhandle.toString())
    }
}

public actual fun NdrClientInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrClientInitialize(prpcmsg.toString(), pstubmsg.toString(), pstubdescriptor.toString(), procnum.toInt())
    }
}

public actual fun NdrClientInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, procnum: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrClientInitializeNew(prpcmsg.toString(), pstubmsg.toString(), pstubdescriptor.toString(), procnum.toInt())
    }
}

public actual fun NdrComplexArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexArrayBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrComplexArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexArrayFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrComplexArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexArrayMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrComplexArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexArrayMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrComplexArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexArrayUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrComplexStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexStructBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrComplexStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexStructFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrComplexStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexStructMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrComplexStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexStructMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrComplexStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrComplexStructUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrConformantArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantArrayBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantArrayFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantArrayMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrConformantArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantArrayMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrConformantArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantArrayUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStringBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStringMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStringMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStringUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrConformantStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStructBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStructFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStructMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrConformantStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStructMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrConformantStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantStructUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrConformantVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrConformantVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrConformantVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingArrayUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrConformantVaryingStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantVaryingStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConformantVaryingStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrConformantVaryingStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrConformantVaryingStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConformantVaryingStructUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrContextHandleInitialize(pstubmsg: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrContextHandleInitialize(pstubmsg.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrContextHandleSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrContextHandleSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrConvert(pstubmsg: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConvert(pstubmsg.toString(), pformat.toString())
    }
}

public actual fun NdrConvert2(pstubmsg: Long, pformat: Long, numberparams: Int) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrConvert2(pstubmsg.toString(), pformat.toString(), numberparams)
    }
}

public actual fun NdrCorrelationFree(pstubmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrCorrelationFree(pstubmsg.toString())
    }
}

public actual fun NdrCorrelationInitialize(pstubmsg: Long, pmemory: Long, cachesize: UInt, flags: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrCorrelationInitialize(pstubmsg.toString(), pmemory.toString(), cachesize.toInt(), flags.toInt())
    }
}

public actual fun NdrCorrelationPass(pstubmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrCorrelationPass(pstubmsg.toString())
    }
}

public actual fun NdrCreateServerInterfaceFromStub(pstub: Long, pserverif: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrCreateServerInterfaceFromStub(pstub.toString(), pserverif.toString()) as Int) else 0

public actual fun NdrDcomAsyncClientCall(pstubdescriptor: Long, pformat: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrDcomAsyncStubCall(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrDcomAsyncStubCall(pthis.toString(), pchannel.toString(), prpcmsg.toString(), pdwstubphase.toString()) as Int) else 0

public actual fun NdrEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrEncapsulatedUnionUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrFixedArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFixedArrayBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrFixedArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFixedArrayFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrFixedArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFixedArrayMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrFixedArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFixedArrayMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrFixedArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFixedArrayUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrFreeBuffer(pstubmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFreeBuffer(pstubmsg.toString())
    }
}

public actual fun NdrFullPointerXlatFree(pxlattables: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFullPointerXlatFree(pxlattables.toString())
    }
}

public actual fun NdrFullPointerXlatInit(numberofpointers: UInt, xlatside: XLAT_SIDE): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrFullPointerXlatInit(numberofpointers.toInt(), xlatside) as String).toLong() else 0L

public actual fun NdrGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrGetBuffer(pstubmsg.toString(), bufferlength.toInt(), handle.toString()) as String).toLong() else 0L

public actual fun NdrGetDcomProtocolVersion(pstubmsg: Long, pversion: Long): HRESULT =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrGetDcomProtocolVersion(pstubmsg.toString(), pversion.toString()) as Int) else 0

public actual fun NdrGetUserMarshalInfo(pflags: Long, informationlevel: UInt, pmarshalinfo: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrGetUserMarshalInfo(pflags.toString(), informationlevel.toInt(), pmarshalinfo.toString()) as Int) else 0

public actual fun NdrInterfacePointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrInterfacePointerBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrInterfacePointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrInterfacePointerFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrInterfacePointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrInterfacePointerMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrInterfacePointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrInterfacePointerMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrInterfacePointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrInterfacePointerUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrMapCommAndFaultStatus(pstubmsg: Long, pcommstatus: Long, pfaultstatus: Long, status: RPC_STATUS): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMapCommAndFaultStatus(pstubmsg.toString(), pcommstatus.toString(), pfaultstatus.toString(), status) as Int) else 0

public actual fun NdrMesProcEncodeDecode(handle: Long, pstubdesc: Long, pformatstring: Long) {
}

public actual fun NdrMesProcEncodeDecode2(handle: Long, pstubdesc: Long, pformatstring: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesProcEncodeDecode3(handle: Long, pproxyinfo: Long, nprocnum: UInt, preturnvalue: Long): CLIENT_CALL_RETURN =
    CLIENT_CALL_RETURN()

public actual fun NdrMesSimpleTypeAlignSize(param0: Long): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSize(param0.toString()) as String).toULong() else 0uL

public actual fun NdrMesSimpleTypeAlignSizeAll(handle: Long, pproxyinfo: Long): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeAlignSizeAll(handle.toString(), pproxyinfo.toString()) as String).toULong() else 0uL

public actual fun NdrMesSimpleTypeDecode(handle: Long, pobject: Long, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecode(handle.toString(), pobject.toString(), size.toInt())
    }
}

public actual fun NdrMesSimpleTypeDecodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeDecodeAll(handle.toString(), pproxyinfo.toString(), pobject.toString(), size.toInt())
    }
}

public actual fun NdrMesSimpleTypeEncode(handle: Long, pstubdesc: Long, pobject: Long, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncode(handle.toString(), pstubdesc.toString(), pobject.toString(), size.toInt())
    }
}

public actual fun NdrMesSimpleTypeEncodeAll(handle: Long, pproxyinfo: Long, pobject: Long, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesSimpleTypeEncodeAll(handle.toString(), pproxyinfo.toString(), pobject.toString(), size.toInt())
    }
}

public actual fun NdrMesTypeAlignSize(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize(handle.toString(), pstubdesc.toString(), pformatstring.toString(), pobject.toString()) as String).toULong() else 0uL

public actual fun NdrMesTypeAlignSize2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize2(handle.toString(), ppicklinginfo.toString(), pstubdesc.toString(), pformatstring.toString(), pobject.toString()) as String).toULong() else 0uL

public actual fun NdrMesTypeAlignSize3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeAlignSize3(handle.toString(), ppicklinginfo.toString(), pproxyinfo.toString(), arrtypeoffset.toString(), ntypeindex.toInt(), pobject.toString()) as String).toULong() else 0uL

public actual fun NdrMesTypeDecode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeDecode(handle.toString(), pstubdesc.toString(), pformatstring.toString(), pobject.toString())
    }
}

public actual fun NdrMesTypeDecode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeDecode2(handle.toString(), ppicklinginfo.toString(), pstubdesc.toString(), pformatstring.toString(), pobject.toString())
    }
}

public actual fun NdrMesTypeDecode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeDecode3(handle.toString(), ppicklinginfo.toString(), pproxyinfo.toString(), arrtypeoffset.toString(), ntypeindex.toInt(), pobject.toString())
    }
}

public actual fun NdrMesTypeEncode(handle: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeEncode(handle.toString(), pstubdesc.toString(), pformatstring.toString(), pobject.toString())
    }
}

public actual fun NdrMesTypeEncode2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeEncode2(handle.toString(), ppicklinginfo.toString(), pstubdesc.toString(), pformatstring.toString(), pobject.toString())
    }
}

public actual fun NdrMesTypeEncode3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeEncode3(handle.toString(), ppicklinginfo.toString(), pproxyinfo.toString(), arrtypeoffset.toString(), ntypeindex.toInt(), pobject.toString())
    }
}

public actual fun NdrMesTypeFree2(handle: Long, ppicklinginfo: Long, pstubdesc: Long, pformatstring: Long, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeFree2(handle.toString(), ppicklinginfo.toString(), pstubdesc.toString(), pformatstring.toString(), pobject.toString())
    }
}

public actual fun NdrMesTypeFree3(handle: Long, ppicklinginfo: Long, pproxyinfo: Long, arrtypeoffset: Long, ntypeindex: UInt, pobject: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrMesTypeFree3(handle.toString(), ppicklinginfo.toString(), pproxyinfo.toString(), arrtypeoffset.toString(), ntypeindex.toInt(), pobject.toString())
    }
}

public actual fun NdrNonConformantStringBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonConformantStringBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrNonConformantStringMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonConformantStringMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrNonConformantStringMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonConformantStringMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrNonConformantStringUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonConformantStringUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrNonEncapsulatedUnionBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrNonEncapsulatedUnionFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrNonEncapsulatedUnionMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrNonEncapsulatedUnionMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrNonEncapsulatedUnionUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNonEncapsulatedUnionUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrNsGetBuffer(pstubmsg: Long, bufferlength: UInt, handle: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNsGetBuffer(pstubmsg.toString(), bufferlength.toInt(), handle.toString()) as String).toLong() else 0L

public actual fun NdrNsSendReceive(pstubmsg: Long, pbufferend: Long, pautohandle: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrNsSendReceive(pstubmsg.toString(), pbufferend.toString(), pautohandle.toString()) as String).toLong() else 0L

public actual fun NdrOleAllocate(size: ULong): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrOleAllocate(size.toString()) as String).toLong() else 0L

public actual fun NdrOleFree(nodetofree: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrOleFree(nodetofree.toString())
    }
}

public actual fun NdrPartialIgnoreClientBufferSize(pstubmsg: Long, pmemory: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientBufferSize(pstubmsg.toString(), pmemory.toString())
    }
}

public actual fun NdrPartialIgnoreClientMarshall(pstubmsg: Long, pmemory: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPartialIgnoreClientMarshall(pstubmsg.toString(), pmemory.toString())
    }
}

public actual fun NdrPartialIgnoreServerInitialize(pstubmsg: Long, ppmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerInitialize(pstubmsg.toString(), ppmemory.toString(), pformat.toString())
    }
}

public actual fun NdrPartialIgnoreServerUnmarshall(pstubmsg: Long, ppmemory: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPartialIgnoreServerUnmarshall(pstubmsg.toString(), ppmemory.toString())
    }
}

public actual fun NdrPointerBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPointerBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrPointerFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPointerFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrPointerMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPointerMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrPointerMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPointerMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrPointerUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrPointerUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrRangeUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRangeUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrRpcSmClientAllocate(size: ULong): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRpcSmClientAllocate(size.toString()) as String).toLong() else 0L

public actual fun NdrRpcSmClientFree(nodetofree: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRpcSmClientFree(nodetofree.toString())
    }
}

public actual fun NdrRpcSmSetClientToOsf(pmessage: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRpcSmSetClientToOsf(pmessage.toString())
    }
}

public actual fun NdrRpcSsDefaultAllocate(size: ULong): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRpcSsDefaultAllocate(size.toString()) as String).toLong() else 0L

public actual fun NdrRpcSsDefaultFree(nodetofree: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRpcSsDefaultFree(nodetofree.toString())
    }
}

public actual fun NdrRpcSsDisableAllocate(pmessage: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRpcSsDisableAllocate(pmessage.toString())
    }
}

public actual fun NdrRpcSsEnableAllocate(pmessage: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrRpcSsEnableAllocate(pmessage.toString())
    }
}

public actual fun NdrSendReceive(pstubmsg: Long, pbufferend: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSendReceive(pstubmsg.toString(), pbufferend.toString()) as String).toLong() else 0L

public actual fun NdrServerCall2(prpcmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerCall2(prpcmsg.toString())
    }
}

public actual fun NdrServerCallAll(prpcmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerCallAll(prpcmsg.toString())
    }
}

public actual fun NdrServerCallNdr64(prpcmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerCallNdr64(prpcmsg.toString())
    }
}

public actual fun NdrServerContextMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerContextMarshall(pstubmsg.toString(), contexthandle.toString(), rundownroutine.toLong().toString())
    }
}

public actual fun NdrServerContextNewMarshall(pstubmsg: Long, contexthandle: Long, rundownroutine: NDR_RUNDOWN, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerContextNewMarshall(pstubmsg.toString(), contexthandle.toString(), rundownroutine.toLong().toString(), pformat.toString())
    }
}

public actual fun NdrServerContextNewUnmarshall(pstubmsg: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerContextNewUnmarshall(pstubmsg.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrServerContextUnmarshall(pstubmsg: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerContextUnmarshall(pstubmsg.toString()) as String).toLong() else 0L

public actual fun NdrServerInitialize(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerInitialize(prpcmsg.toString(), pstubmsg.toString(), pstubdescriptor.toString()) as String).toLong() else 0L

public actual fun NdrServerInitializeMarshall(prpcmsg: Long, pstubmsg: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerInitializeMarshall(prpcmsg.toString(), pstubmsg.toString())
    }
}

public actual fun NdrServerInitializeNew(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerInitializeNew(prpcmsg.toString(), pstubmsg.toString(), pstubdescriptor.toString()) as String).toLong() else 0L

public actual fun NdrServerInitializePartial(prpcmsg: Long, pstubmsg: Long, pstubdescriptor: Long, requestedbuffersize: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerInitializePartial(prpcmsg.toString(), pstubmsg.toString(), pstubdescriptor.toString(), requestedbuffersize.toInt())
    }
}

public actual fun NdrServerInitializeUnmarshall(pstubmsg: Long, pstubdescriptor: Long, prpcmsg: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrServerInitializeUnmarshall(pstubmsg.toString(), pstubdescriptor.toString(), prpcmsg.toString()) as String).toLong() else 0L

public actual fun NdrSimpleStructBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSimpleStructBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrSimpleStructFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSimpleStructFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrSimpleStructMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSimpleStructMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrSimpleStructMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSimpleStructMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrSimpleStructUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSimpleStructUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrSimpleTypeMarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSimpleTypeMarshall(pstubmsg.toString(), pmemory.toString(), formatchar.toInt())
    }
}

public actual fun NdrSimpleTypeUnmarshall(pstubmsg: Long, pmemory: Long, formatchar: UByte) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrSimpleTypeUnmarshall(pstubmsg.toString(), pmemory.toString(), formatchar.toInt())
    }
}

public actual fun NdrStubCall2(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrStubCall2(pthis.toString(), pchannel.toString(), prpcmsg.toString(), pdwstubphase.toString()) as Int) else 0

public actual fun NdrStubCall3(pthis: Long, pchannel: Long, prpcmsg: Long, pdwstubphase: Long): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrStubCall3(pthis.toString(), pchannel.toString(), prpcmsg.toString(), pdwstubphase.toString()) as Int) else 0

public actual fun NdrUserMarshalBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrUserMarshalBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrUserMarshalFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrUserMarshalFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrUserMarshalMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrUserMarshalMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrUserMarshalMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrUserMarshalMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrUserMarshalSimpleTypeConvert(pflags: Long, pbuffer: Long, formatchar: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrUserMarshalSimpleTypeConvert(pflags.toString(), pbuffer.toString(), formatchar.toInt()) as String).toLong() else 0L

public actual fun NdrUserMarshalUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrUserMarshalUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrVaryingArrayBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrVaryingArrayBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrVaryingArrayFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrVaryingArrayFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrVaryingArrayMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrVaryingArrayMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrVaryingArrayMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrVaryingArrayMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrVaryingArrayUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrVaryingArrayUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun NdrXmitOrRepAsBufferSize(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsBufferSize(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrXmitOrRepAsFree(pstubmsg: Long, pmemory: Long, pformat: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsFree(pstubmsg.toString(), pmemory.toString(), pformat.toString())
    }
}

public actual fun NdrXmitOrRepAsMarshall(pstubmsg: Long, pmemory: Long, pformat: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMarshall(pstubmsg.toString(), pmemory.toString(), pformat.toString()) as String).toLong() else 0L

public actual fun NdrXmitOrRepAsMemorySize(pstubmsg: Long, pformat: Long): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsMemorySize(pstubmsg.toString(), pformat.toString()) as Int).toUInt() else 0u

public actual fun NdrXmitOrRepAsUnmarshall(pstubmsg: Long, ppmemory: Long, pformat: Long, fmustalloc: UByte): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_NdrXmitOrRepAsUnmarshall(pstubmsg.toString(), ppmemory.toString(), pformat.toString(), fmustalloc.toInt()) as String).toLong() else 0L

public actual fun RpcAsyncAbortCall(pasync: Long, exceptioncode: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcAsyncAbortCall(pasync.toString(), exceptioncode.toInt()) as Int) else 0

public actual fun RpcAsyncCancelCall(pasync: Long, fabort: BOOL): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcAsyncCancelCall(pasync.toString(), fabort) as Int) else 0

public actual fun RpcAsyncCompleteCall(pasync: Long, reply: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcAsyncCompleteCall(pasync.toString(), reply.toString()) as Int) else 0

public actual fun RpcAsyncGetCallStatus(pasync: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcAsyncGetCallStatus(pasync.toString()) as Int) else 0

public actual fun RpcAsyncInitializeHandle(pasync: Long, size: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcAsyncInitializeHandle(pasync.toString(), size.toInt()) as Int) else 0

public actual fun RpcAsyncRegisterInfo(pasync: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcAsyncRegisterInfo(pasync.toString()) as Int) else 0

public actual fun RpcBindingBind(pasync: Long, binding: Long, ifspec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingBind(pasync.toString(), binding.toString(), ifspec.toString()) as Int) else 0

public actual fun RpcBindingCopy(sourcebinding: Long, destinationbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingCopy(sourcebinding.toString(), destinationbinding.toString()) as Int) else 0

public actual fun RpcBindingCreateA(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingCreateA(template.toString(), security.toString(), options.toString(), binding.toString()) as Int) else 0

public actual fun RpcBindingCreateW(template: Long, security: Long, options: Long, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingCreateW(template.toString(), security.toString(), options.toString(), binding.toString()) as Int) else 0

public actual fun RpcBindingFree(binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingFree(binding.toString()) as Int) else 0

public actual fun RpcBindingFromStringBindingA(stringbinding: PCSTR, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingA(stringbinding.toString(), binding.toString()) as Int) else 0

public actual fun RpcBindingFromStringBindingW(stringbinding: PCWSTR, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingFromStringBindingW(stringbinding.toString(), binding.toString()) as Int) else 0

public actual fun RpcBindingInqAuthClientA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientA(clientbinding.toString(), privs.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authzsvc.toString()) as Int) else 0

public actual fun RpcBindingInqAuthClientExA(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExA(clientbinding.toString(), privs.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authzsvc.toString(), flags.toInt()) as Int) else 0

public actual fun RpcBindingInqAuthClientExW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long, flags: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientExW(clientbinding.toString(), privs.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authzsvc.toString(), flags.toInt()) as Int) else 0

public actual fun RpcBindingInqAuthClientW(clientbinding: Long, privs: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authzsvc: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthClientW(clientbinding.toString(), privs.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authzsvc.toString()) as Int) else 0

public actual fun RpcBindingInqAuthInfoA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoA(binding.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authidentity.toString(), authzsvc.toString()) as Int) else 0

public actual fun RpcBindingInqAuthInfoExA(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExA(binding.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authidentity.toString(), authzsvc.toString(), rpcqosversion.toInt(), securityqos.toString()) as Int) else 0

public actual fun RpcBindingInqAuthInfoExW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long, rpcqosversion: UInt, securityqos: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoExW(binding.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authidentity.toString(), authzsvc.toString(), rpcqosversion.toInt(), securityqos.toString()) as Int) else 0

public actual fun RpcBindingInqAuthInfoW(binding: Long, serverprincname: Long, authnlevel: Long, authnsvc: Long, authidentity: Long, authzsvc: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqAuthInfoW(binding.toString(), serverprincname.toString(), authnlevel.toString(), authnsvc.toString(), authidentity.toString(), authzsvc.toString()) as Int) else 0

public actual fun RpcBindingInqMaxCalls(binding: Long, maxcalls: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqMaxCalls(binding.toString(), maxcalls.toString()) as Int) else 0

public actual fun RpcBindingInqObject(binding: Long, objectuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqObject(binding.toString(), objectuuid.toString()) as Int) else 0

public actual fun RpcBindingInqOption(hbinding: Long, option: UInt, poptionvalue: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingInqOption(hbinding.toString(), option.toInt(), poptionvalue.toString()) as Int) else 0

public actual fun RpcBindingReset(binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingReset(binding.toString()) as Int) else 0

public actual fun RpcBindingServerFromClient(clientbinding: Long, serverbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingServerFromClient(clientbinding.toString(), serverbinding.toString()) as Int) else 0

public actual fun RpcBindingSetAuthInfoA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoA(binding.toString(), serverprincname.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.toString(), authzsvc.toInt()) as Int) else 0

public actual fun RpcBindingSetAuthInfoExA(binding: Long, serverprincname: PCSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExA(binding.toString(), serverprincname.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.toString(), authzsvc.toInt(), securityqos.toString()) as Int) else 0

public actual fun RpcBindingSetAuthInfoExW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt, securityqos: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoExW(binding.toString(), serverprincname.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.toString(), authzsvc.toInt(), securityqos.toString()) as Int) else 0

public actual fun RpcBindingSetAuthInfoW(binding: Long, serverprincname: PCWSTR, authnlevel: UInt, authnsvc: UInt, authidentity: Long, authzsvc: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingSetAuthInfoW(binding.toString(), serverprincname.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.toString(), authzsvc.toInt()) as Int) else 0

public actual fun RpcBindingSetObject(binding: Long, objectuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingSetObject(binding.toString(), objectuuid.toString()) as Int) else 0

public actual fun RpcBindingSetOption(hbinding: Long, option: UInt, optionvalue: ULong): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingSetOption(hbinding.toString(), option.toInt(), optionvalue.toString()) as Int) else 0

public actual fun RpcBindingToStringBindingA(binding: Long, stringbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingToStringBindingA(binding.toString(), stringbinding.toString()) as Int) else 0

public actual fun RpcBindingToStringBindingW(binding: Long, stringbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingToStringBindingW(binding.toString(), stringbinding.toString()) as Int) else 0

public actual fun RpcBindingUnbind(binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingUnbind(binding.toString()) as Int) else 0

public actual fun RpcBindingVectorFree(bindingvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcBindingVectorFree(bindingvector.toString()) as Int) else 0

public actual fun RpcCancelThread(thread: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcCancelThread(thread.toString()) as Int) else 0

public actual fun RpcCancelThreadEx(thread: Long, timeout: Int): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcCancelThreadEx(thread.toString(), timeout) as Int) else 0

public actual fun RpcCertGeneratePrincipalNameA(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameA(context.toString(), flags.toInt(), pbuffer.toString()) as Int) else 0

public actual fun RpcCertGeneratePrincipalNameW(context: Long, flags: UInt, pbuffer: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcCertGeneratePrincipalNameW(context.toString(), flags.toInt(), pbuffer.toString()) as Int) else 0

public actual fun RpcEpRegisterA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcEpRegisterA(ifspec.toString(), bindingvector.toString(), uuidvector.toString(), annotation.toString()) as Int) else 0

public actual fun RpcEpRegisterNoReplaceA(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceA(ifspec.toString(), bindingvector.toString(), uuidvector.toString(), annotation.toString()) as Int) else 0

public actual fun RpcEpRegisterNoReplaceW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcEpRegisterNoReplaceW(ifspec.toString(), bindingvector.toString(), uuidvector.toString(), annotation.toString()) as Int) else 0

public actual fun RpcEpRegisterW(ifspec: Long, bindingvector: Long, uuidvector: Long, annotation: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcEpRegisterW(ifspec.toString(), bindingvector.toString(), uuidvector.toString(), annotation.toString()) as Int) else 0

public actual fun RpcEpResolveBinding(binding: Long, ifspec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcEpResolveBinding(binding.toString(), ifspec.toString()) as Int) else 0

public actual fun RpcEpUnregister(ifspec: Long, bindingvector: Long, uuidvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcEpUnregister(ifspec.toString(), bindingvector.toString(), uuidvector.toString()) as Int) else 0

public actual fun RpcErrorAddRecord(errorinfo: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorAddRecord(errorinfo.toString()) as Int) else 0

public actual fun RpcErrorClearInformation() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorClearInformation()
    }
}

public actual fun RpcErrorEndEnumeration(enumhandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorEndEnumeration(enumhandle.toString()) as Int) else 0

public actual fun RpcErrorGetNextRecord(enumhandle: Long, copystrings: BOOL, errorinfo: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorGetNextRecord(enumhandle.toString(), copystrings, errorinfo.toString()) as Int) else 0

public actual fun RpcErrorGetNumberOfRecords(enumhandle: Long, records: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorGetNumberOfRecords(enumhandle.toString(), records.toString()) as Int) else 0

public actual fun RpcErrorLoadErrorInfo(errorblob: Long, blobsize: ULong, enumhandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorLoadErrorInfo(errorblob.toString(), blobsize.toString(), enumhandle.toString()) as Int) else 0

public actual fun RpcErrorResetEnumeration(enumhandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorResetEnumeration(enumhandle.toString()) as Int) else 0

public actual fun RpcErrorSaveErrorInfo(enumhandle: Long, errorblob: Long, blobsize: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorSaveErrorInfo(enumhandle.toString(), errorblob.toString(), blobsize.toString()) as Int) else 0

public actual fun RpcErrorStartEnumeration(enumhandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcErrorStartEnumeration(enumhandle.toString()) as Int) else 0

public actual fun RpcExceptionFilter(exceptioncode: UInt): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcExceptionFilter(exceptioncode.toInt()) as Int) else 0

public actual fun RpcFreeAuthorizationContext(pauthzclientcontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcFreeAuthorizationContext(pauthzclientcontext.toString()) as Int) else 0

public actual fun RpcGetAuthorizationContextForClient(clientbinding: Long, impersonateonreturn: BOOL, reserved1: Long, pexpirationtime: Long, reserved2: LUID, reserved3: UInt, reserved4: Long, pauthzclientcontext: Long): RPC_STATUS =
    0

public actual fun RpcIfIdVectorFree(ifidvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcIfIdVectorFree(ifidvector.toString()) as Int) else 0

public actual fun RpcIfInqId(rpcifhandle: Long, rpcifid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcIfInqId(rpcifhandle.toString(), rpcifid.toString()) as Int) else 0

public actual fun RpcImpersonateClient(bindinghandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcImpersonateClient(bindinghandle.toString()) as Int) else 0

public actual fun RpcImpersonateClient2(bindinghandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcImpersonateClient2(bindinghandle.toString()) as Int) else 0

public actual fun RpcImpersonateClientContainer(bindinghandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcImpersonateClientContainer(bindinghandle.toString()) as Int) else 0

public actual fun RpcMgmtEnableIdleCleanup(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtEnableIdleCleanup() as Int) else 0

public actual fun RpcMgmtEpEltInqBegin(epbinding: Long, inquirytype: UInt, ifid: Long, versoption: UInt, objectuuid: Long, inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqBegin(epbinding.toString(), inquirytype.toInt(), ifid.toString(), versoption.toInt(), objectuuid.toString(), inquirycontext.toString()) as Int) else 0

public actual fun RpcMgmtEpEltInqDone(inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqDone(inquirycontext.toString()) as Int) else 0

public actual fun RpcMgmtEpEltInqNextA(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextA(inquirycontext.toString(), ifid.toString(), binding.toString(), objectuuid.toString(), annotation.toString()) as Int) else 0

public actual fun RpcMgmtEpEltInqNextW(inquirycontext: Long, ifid: Long, binding: Long, objectuuid: Long, annotation: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtEpEltInqNextW(inquirycontext.toString(), ifid.toString(), binding.toString(), objectuuid.toString(), annotation.toString()) as Int) else 0

public actual fun RpcMgmtEpUnregister(epbinding: Long, ifid: Long, binding: Long, objectuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtEpUnregister(epbinding.toString(), ifid.toString(), binding.toString(), objectuuid.toString()) as Int) else 0

public actual fun RpcMgmtInqComTimeout(binding: Long, timeout: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtInqComTimeout(binding.toString(), timeout.toString()) as Int) else 0

public actual fun RpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtInqDefaultProtectLevel(authnsvc.toInt(), authnlevel.toString()) as Int) else 0

public actual fun RpcMgmtInqIfIds(binding: Long, ifidvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtInqIfIds(binding.toString(), ifidvector.toString()) as Int) else 0

public actual fun RpcMgmtInqServerPrincNameA(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameA(binding.toString(), authnsvc.toInt(), serverprincname.toString()) as Int) else 0

public actual fun RpcMgmtInqServerPrincNameW(binding: Long, authnsvc: UInt, serverprincname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtInqServerPrincNameW(binding.toString(), authnsvc.toInt(), serverprincname.toString()) as Int) else 0

public actual fun RpcMgmtInqStats(binding: Long, statistics: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtInqStats(binding.toString(), statistics.toString()) as Int) else 0

public actual fun RpcMgmtIsServerListening(binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtIsServerListening(binding.toString()) as Int) else 0

public actual fun RpcMgmtSetAuthorizationFn(authorizationfn: RPC_MGMT_AUTHORIZATION_FN): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtSetAuthorizationFn(authorizationfn.toLong().toString()) as Int) else 0

public actual fun RpcMgmtSetCancelTimeout(timeout: Int): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtSetCancelTimeout(timeout) as Int) else 0

public actual fun RpcMgmtSetComTimeout(binding: Long, timeout: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtSetComTimeout(binding.toString(), timeout.toInt()) as Int) else 0

public actual fun RpcMgmtSetServerStackSize(threadstacksize: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtSetServerStackSize(threadstacksize.toInt()) as Int) else 0

public actual fun RpcMgmtStatsVectorFree(statsvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtStatsVectorFree(statsvector.toString()) as Int) else 0

public actual fun RpcMgmtStopServerListening(binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtStopServerListening(binding.toString()) as Int) else 0

public actual fun RpcMgmtWaitServerListen(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcMgmtWaitServerListen() as Int) else 0

public actual fun RpcNetworkInqProtseqsA(protseqvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsA(protseqvector.toString()) as Int) else 0

public actual fun RpcNetworkInqProtseqsW(protseqvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNetworkInqProtseqsW(protseqvector.toString()) as Int) else 0

public actual fun RpcNetworkIsProtseqValidA(protseq: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidA(protseq.toString()) as Int) else 0

public actual fun RpcNetworkIsProtseqValidW(protseq: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNetworkIsProtseqValidW(protseq.toString()) as Int) else 0

public actual fun RpcNsBindingExportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingExportA(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), bindingvec.toString(), objectuuidvec.toString()) as Int) else 0

public actual fun RpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPA(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objectvector.toString()) as Int) else 0

public actual fun RpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingExportPnPW(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objectvector.toString()) as Int) else 0

public actual fun RpcNsBindingExportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, bindingvec: Long, objectuuidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingExportW(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), bindingvec.toString(), objectuuidvec.toString()) as Int) else 0

public actual fun RpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginA(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objuuid.toString(), importcontext.toString()) as Int) else 0

public actual fun RpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, importcontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingImportBeginW(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objuuid.toString(), importcontext.toString()) as Int) else 0

public actual fun RpcNsBindingImportDone(importcontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingImportDone(importcontext.toString()) as Int) else 0

public actual fun RpcNsBindingImportNext(importcontext: Long, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingImportNext(importcontext.toString(), binding.toString()) as Int) else 0

public actual fun RpcNsBindingInqEntryNameA(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameA(binding.toString(), entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun RpcNsBindingInqEntryNameW(binding: Long, entrynamesyntax: UInt, entryname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingInqEntryNameW(binding.toString(), entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun RpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginA(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objuuid.toString(), bindingmaxcount.toInt(), lookupcontext.toString()) as Int) else 0

public actual fun RpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objuuid: Long, bindingmaxcount: UInt, lookupcontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingLookupBeginW(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objuuid.toString(), bindingmaxcount.toInt(), lookupcontext.toString()) as Int) else 0

public actual fun RpcNsBindingLookupDone(lookupcontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingLookupDone(lookupcontext.toString()) as Int) else 0

public actual fun RpcNsBindingLookupNext(lookupcontext: Long, bindingvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingLookupNext(lookupcontext.toString(), bindingvec.toString()) as Int) else 0

public actual fun RpcNsBindingSelect(bindingvec: Long, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingSelect(bindingvec.toString(), binding.toString()) as Int) else 0

public actual fun RpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportA(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objectuuidvec.toString()) as Int) else 0

public actual fun RpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: PCSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPA(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objectvector.toString()) as Int) else 0

public actual fun RpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportPnPW(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objectvector.toString()) as Int) else 0

public actual fun RpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifspec: Long, objectuuidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsBindingUnexportW(entrynamesyntax.toInt(), entryname.toString(), ifspec.toString(), objectuuidvec.toString()) as Int) else 0

public actual fun RpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: PCSTR, expandedname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameA(entrynamesyntax.toInt(), entryname.toString(), expandedname.toString()) as Int) else 0

public actual fun RpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: PCWSTR, expandedname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsEntryExpandNameW(entrynamesyntax.toInt(), entryname.toString(), expandedname.toString()) as Int) else 0

public actual fun RpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: PCSTR, inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginA(entrynamesyntax.toInt(), entryname.toString(), inquirycontext.toString()) as Int) else 0

public actual fun RpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: PCWSTR, inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqBeginW(entrynamesyntax.toInt(), entryname.toString(), inquirycontext.toString()) as Int) else 0

public actual fun RpcNsEntryObjectInqDone(inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqDone(inquirycontext.toString()) as Int) else 0

public actual fun RpcNsEntryObjectInqNext(inquirycontext: Long, objuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsEntryObjectInqNext(inquirycontext.toString(), objuuid.toString()) as Int) else 0

public actual fun RpcNsGroupDeleteA(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupDeleteA(groupnamesyntax.toInt(), groupname.toString()) as Int) else 0

public actual fun RpcNsGroupDeleteW(groupnamesyntax: GROUP_NAME_SYNTAX, groupname: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupDeleteW(groupnamesyntax.toInt(), groupname.toString()) as Int) else 0

public actual fun RpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddA(groupnamesyntax.toInt(), groupname.toString(), membernamesyntax.toInt(), membername.toString()) as Int) else 0

public actual fun RpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrAddW(groupnamesyntax.toInt(), groupname.toString(), membernamesyntax.toInt(), membername.toString()) as Int) else 0

public actual fun RpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginA(groupnamesyntax.toInt(), groupname.toString(), membernamesyntax.toInt(), inquirycontext.toString()) as Int) else 0

public actual fun RpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqBeginW(groupnamesyntax.toInt(), groupname.toString(), membernamesyntax.toInt(), inquirycontext.toString()) as Int) else 0

public actual fun RpcNsGroupMbrInqDone(inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqDone(inquirycontext.toString()) as Int) else 0

public actual fun RpcNsGroupMbrInqNextA(inquirycontext: Long, membername: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextA(inquirycontext.toString(), membername.toString()) as Int) else 0

public actual fun RpcNsGroupMbrInqNextW(inquirycontext: Long, membername: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrInqNextW(inquirycontext.toString(), membername.toString()) as Int) else 0

public actual fun RpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: PCSTR, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveA(groupnamesyntax.toInt(), groupname.toString(), membernamesyntax.toInt(), membername.toString()) as Int) else 0

public actual fun RpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: PCWSTR, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsGroupMbrRemoveW(groupnamesyntax.toInt(), groupname.toString(), membernamesyntax.toInt(), membername.toString()) as Int) else 0

public actual fun RpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: PCSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportA(entrynamesyntax.toInt(), entryname.toString(), ifid.toString(), versoption.toInt(), objectuuidvec.toString()) as Int) else 0

public actual fun RpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: PCWSTR, ifid: Long, versoption: UInt, objectuuidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtBindingUnexportW(entrynamesyntax.toInt(), entryname.toString(), ifid.toString(), versoption.toInt(), objectuuidvec.toString()) as Int) else 0

public actual fun RpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateA(entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun RpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryCreateW(entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun RpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteA(entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun RpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryDeleteW(entrynamesyntax.toInt(), entryname.toString()) as Int) else 0

public actual fun RpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: PCSTR, ifidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsA(entrynamesyntax.toInt(), entryname.toString(), ifidvec.toString()) as Int) else 0

public actual fun RpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: PCWSTR, ifidvec: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtEntryInqIfIdsW(entrynamesyntax.toInt(), entryname.toString(), ifidvec.toString()) as Int) else 0

public actual fun RpcNsMgmtHandleSetExpAge(nshandle: Long, expirationage: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtHandleSetExpAge(nshandle.toString(), expirationage.toInt()) as Int) else 0

public actual fun RpcNsMgmtInqExpAge(expirationage: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtInqExpAge(expirationage.toString()) as Int) else 0

public actual fun RpcNsMgmtSetExpAge(expirationage: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsMgmtSetExpAge(expirationage.toInt()) as Int) else 0

public actual fun RpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileDeleteA(profilenamesyntax.toInt(), profilename.toString()) as Int) else 0

public actual fun RpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileDeleteW(profilenamesyntax.toInt(), profilename.toString()) as Int) else 0

public actual fun RpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR, priority: UInt, annotation: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltAddA(profilenamesyntax.toInt(), profilename.toString(), ifid.toString(), membernamesyntax.toInt(), membername.toString(), priority.toInt(), annotation.toString()) as Int) else 0

public actual fun RpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR, priority: UInt, annotation: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltAddW(profilenamesyntax.toInt(), profilename.toString(), ifid.toString(), membernamesyntax.toInt(), membername.toString(), priority.toInt(), annotation.toString()) as Int) else 0

public actual fun RpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: PCSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCSTR, inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginA(profilenamesyntax.toInt(), profilename.toString(), inquirytype.toInt(), ifid.toString(), versoption.toInt(), membernamesyntax.toInt(), membername.toString(), inquirycontext.toString()) as Int) else 0

public actual fun RpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: PCWSTR, inquirytype: UInt, ifid: Long, versoption: UInt, membernamesyntax: UInt, membername: PCWSTR, inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqBeginW(profilenamesyntax.toInt(), profilename.toString(), inquirytype.toInt(), ifid.toString(), versoption.toInt(), membernamesyntax.toInt(), membername.toString(), inquirycontext.toString()) as Int) else 0

public actual fun RpcNsProfileEltInqDone(inquirycontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqDone(inquirycontext.toString()) as Int) else 0

public actual fun RpcNsProfileEltInqNextA(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextA(inquirycontext.toString(), ifid.toString(), membername.toString(), priority.toString(), annotation.toString()) as Int) else 0

public actual fun RpcNsProfileEltInqNextW(inquirycontext: Long, ifid: Long, membername: Long, priority: Long, annotation: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltInqNextW(inquirycontext.toString(), ifid.toString(), membername.toString(), priority.toString(), annotation.toString()) as Int) else 0

public actual fun RpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: PCSTR, ifid: Long, membernamesyntax: UInt, membername: PCSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveA(profilenamesyntax.toInt(), profilename.toString(), ifid.toString(), membernamesyntax.toInt(), membername.toString()) as Int) else 0

public actual fun RpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: PCWSTR, ifid: Long, membernamesyntax: UInt, membername: PCWSTR): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcNsProfileEltRemoveW(profilenamesyntax.toInt(), profilename.toString(), ifid.toString(), membernamesyntax.toInt(), membername.toString()) as Int) else 0

public actual fun RpcObjectInqType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcObjectInqType(objuuid.toString(), typeuuid.toString()) as Int) else 0

public actual fun RpcObjectSetInqFn(inquiryfn: RPC_OBJECT_INQ_FN): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcObjectSetInqFn(inquiryfn.toLong().toString()) as Int) else 0

public actual fun RpcObjectSetType(objuuid: Long, typeuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcObjectSetType(objuuid.toString(), typeuuid.toString()) as Int) else 0

public actual fun RpcProtseqVectorFreeA(protseqvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeA(protseqvector.toString()) as Int) else 0

public actual fun RpcProtseqVectorFreeW(protseqvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcProtseqVectorFreeW(protseqvector.toString()) as Int) else 0

public actual fun RpcRaiseException(exception: RPC_STATUS) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcRaiseException(exception)
    }
}

public actual fun RpcRevertContainerImpersonation(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcRevertContainerImpersonation() as Int) else 0

public actual fun RpcRevertToSelf(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcRevertToSelf() as Int) else 0

public actual fun RpcRevertToSelfEx(bindinghandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcRevertToSelfEx(bindinghandle.toString()) as Int) else 0

public actual fun RpcServerCompleteSecurityCallback(bindinghandle: Long, status: RPC_STATUS): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerCompleteSecurityCallback(bindinghandle.toString(), status) as Int) else 0

public actual fun RpcServerInqBindingHandle(binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqBindingHandle(binding.toString()) as Int) else 0

public actual fun RpcServerInqBindings(bindingvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqBindings(bindingvector.toString()) as Int) else 0

public actual fun RpcServerInqBindingsEx(securitydescriptor: Long, bindingvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqBindingsEx(securitydescriptor.toString(), bindingvector.toString()) as Int) else 0

public actual fun RpcServerInqCallAttributesA(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesA(clientbinding.toString(), rpccallattributes.toString()) as Int) else 0

public actual fun RpcServerInqCallAttributesW(clientbinding: Long, rpccallattributes: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqCallAttributesW(clientbinding.toString(), rpccallattributes.toString()) as Int) else 0

public actual fun RpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameA(authnsvc.toInt(), princname.toString()) as Int) else 0

public actual fun RpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqDefaultPrincNameW(authnsvc.toInt(), princname.toString()) as Int) else 0

public actual fun RpcServerInqIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInqIf(ifspec.toString(), mgrtypeuuid.toString(), mgrepv.toString()) as Int) else 0

public actual fun RpcServerInterfaceGroupActivate(ifgroup: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupActivate(ifgroup.toString()) as Int) else 0

public actual fun RpcServerInterfaceGroupClose(ifgroup: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupClose(ifgroup.toString()) as Int) else 0

public actual fun RpcServerInterfaceGroupCreateA(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateA(interfaces.toString(), numifs.toInt(), endpoints.toString(), numendpoints.toInt(), idleperiod.toInt(), idlecallbackfn.toLong().toString(), idlecallbackcontext.toString(), ifgroup.toString()) as Int) else 0

public actual fun RpcServerInterfaceGroupCreateW(interfaces: Long, numifs: UInt, endpoints: Long, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RPC_INTERFACE_GROUP_IDLE_CALLBACK_FN, idlecallbackcontext: Long, ifgroup: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupCreateW(interfaces.toString(), numifs.toInt(), endpoints.toString(), numendpoints.toInt(), idleperiod.toInt(), idlecallbackfn.toLong().toString(), idlecallbackcontext.toString(), ifgroup.toString()) as Int) else 0

public actual fun RpcServerInterfaceGroupDeactivate(ifgroup: Long, forcedeactivation: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupDeactivate(ifgroup.toString(), forcedeactivation.toInt()) as Int) else 0

public actual fun RpcServerInterfaceGroupInqBindings(ifgroup: Long, bindingvector: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerInterfaceGroupInqBindings(ifgroup.toString(), bindingvector.toString()) as Int) else 0

public actual fun RpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt()) as Int) else 0

public actual fun RpcServerRegisterAuthInfoA(serverprincname: PCSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoA(serverprincname.toString(), authnsvc.toInt(), getkeyfn.toLong().toString(), arg.toString()) as Int) else 0

public actual fun RpcServerRegisterAuthInfoW(serverprincname: PCWSTR, authnsvc: UInt, getkeyfn: RPC_AUTH_KEY_RETRIEVAL_FN, arg: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerRegisterAuthInfoW(serverprincname.toString(), authnsvc.toInt(), getkeyfn.toLong().toString(), arg.toString()) as Int) else 0

public actual fun RpcServerRegisterIf(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerRegisterIf(ifspec.toString(), mgrtypeuuid.toString(), mgrepv.toString()) as Int) else 0

public actual fun RpcServerRegisterIf2(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RPC_IF_CALLBACK_FN): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerRegisterIf2(ifspec.toString(), mgrtypeuuid.toString(), mgrepv.toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), ifcallbackfn.toLong().toString()) as Int) else 0

public actual fun RpcServerRegisterIf3(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RPC_IF_CALLBACK_FN, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerRegisterIf3(ifspec.toString(), mgrtypeuuid.toString(), mgrepv.toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), ifcallback.toLong().toString(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerRegisterIfEx(ifspec: Long, mgrtypeuuid: Long, mgrepv: Long, flags: UInt, maxcalls: UInt, ifcallback: RPC_IF_CALLBACK_FN): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerRegisterIfEx(ifspec.toString(), mgrtypeuuid.toString(), mgrepv.toString(), flags.toInt(), maxcalls.toInt(), ifcallback.toLong().toString()) as Int) else 0

public actual fun RpcServerSubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationtype: RPC_NOTIFICATION_TYPES, notificationinfo: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerSubscribeForNotification(binding.toString(), notification, notificationtype, notificationinfo.toString()) as Int) else 0

public actual fun RpcServerTestCancel(bindinghandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerTestCancel(bindinghandle.toString()) as Int) else 0

public actual fun RpcServerUnregisterIf(ifspec: Long, mgrtypeuuid: Long, waitforcallstocomplete: UInt): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUnregisterIf(ifspec.toString(), mgrtypeuuid.toString(), waitforcallstocomplete.toInt()) as Int) else 0

public actual fun RpcServerUnregisterIfEx(ifspec: Long, mgrtypeuuid: Long, rundowncontexthandles: Int): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUnregisterIfEx(ifspec.toString(), mgrtypeuuid.toString(), rundowncontexthandles) as Int) else 0

public actual fun RpcServerUnsubscribeForNotification(binding: Long, notification: RPC_NOTIFICATIONS, notificationsqueued: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUnsubscribeForNotification(binding.toString(), notification, notificationsqueued.toString()) as Int) else 0

public actual fun RpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqs(maxcalls.toInt(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsEx(maxcalls.toInt(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIf(maxcalls.toInt(), ifspec.toString(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseAllProtseqsIfEx(maxcalls.toInt(), ifspec.toString(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseProtseqA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqA(protseq.toString(), maxcalls.toInt(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerUseProtseqEpA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpA(protseq.toString(), maxcalls.toInt(), endpoint.toString(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerUseProtseqEpExA(protseq: PCSTR, maxcalls: UInt, endpoint: PCSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExA(protseq.toString(), maxcalls.toInt(), endpoint.toString(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseProtseqEpExW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpExW(protseq.toString(), maxcalls.toInt(), endpoint.toString(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseProtseqEpW(protseq: PCWSTR, maxcalls: UInt, endpoint: PCWSTR, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqEpW(protseq.toString(), maxcalls.toInt(), endpoint.toString(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerUseProtseqExA(protseq: PCSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqExA(protseq.toString(), maxcalls.toInt(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseProtseqExW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqExW(protseq.toString(), maxcalls.toInt(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseProtseqIfA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfA(protseq.toString(), maxcalls.toInt(), ifspec.toString(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerUseProtseqIfExA(protseq: PCSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExA(protseq.toString(), maxcalls.toInt(), ifspec.toString(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseProtseqIfExW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long, policy: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfExW(protseq.toString(), maxcalls.toInt(), ifspec.toString(), securitydescriptor.toString(), policy.toString()) as Int) else 0

public actual fun RpcServerUseProtseqIfW(protseq: PCWSTR, maxcalls: UInt, ifspec: Long, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqIfW(protseq.toString(), maxcalls.toInt(), ifspec.toString(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerUseProtseqW(protseq: PCWSTR, maxcalls: UInt, securitydescriptor: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerUseProtseqW(protseq.toString(), maxcalls.toInt(), securitydescriptor.toString()) as Int) else 0

public actual fun RpcServerYield() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcServerYield()
    }
}

public actual fun RpcSmAllocate(size: ULong, pstatus: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmAllocate(size.toString(), pstatus.toString()) as String).toLong() else 0L

public actual fun RpcSmClientFree(pnodetofree: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmClientFree(pnodetofree.toString()) as Int) else 0

public actual fun RpcSmDestroyClientContext(contexthandle: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmDestroyClientContext(contexthandle.toString()) as Int) else 0

public actual fun RpcSmDisableAllocate(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmDisableAllocate() as Int) else 0

public actual fun RpcSmEnableAllocate(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmEnableAllocate() as Int) else 0

public actual fun RpcSmFree(nodetofree: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmFree(nodetofree.toString()) as Int) else 0

public actual fun RpcSmGetThreadHandle(pstatus: Long): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmGetThreadHandle(pstatus.toString()) as String).toLong() else 0L

public actual fun RpcSmSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmSetClientAllocFree(clientalloc.toLong().toString(), clientfree.toLong().toString()) as Int) else 0

public actual fun RpcSmSetThreadHandle(id: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmSetThreadHandle(id.toString()) as Int) else 0

public actual fun RpcSmSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSmSwapClientAllocFree(clientalloc.toLong().toString(), clientfree.toLong().toString(), oldclientalloc.toString(), oldclientfree.toString()) as Int) else 0

public actual fun RpcSsAllocate(size: ULong): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsAllocate(size.toString()) as String).toLong() else 0L

public actual fun RpcSsContextLockExclusive(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsContextLockExclusive(serverbindinghandle.toString(), usercontext.toString()) as Int) else 0

public actual fun RpcSsContextLockShared(serverbindinghandle: Long, usercontext: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsContextLockShared(serverbindinghandle.toString(), usercontext.toString()) as Int) else 0

public actual fun RpcSsDestroyClientContext(contexthandle: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsDestroyClientContext(contexthandle.toString())
    }
}

public actual fun RpcSsDisableAllocate() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsDisableAllocate()
    }
}

public actual fun RpcSsDontSerializeContext() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsDontSerializeContext()
    }
}

public actual fun RpcSsEnableAllocate() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsEnableAllocate()
    }
}

public actual fun RpcSsFree(nodetofree: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsFree(nodetofree.toString())
    }
}

public actual fun RpcSsGetContextBinding(contexthandle: Long, binding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsGetContextBinding(contexthandle.toString(), binding.toString()) as Int) else 0

public actual fun RpcSsGetThreadHandle(): Long =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsGetThreadHandle() as String).toLong() else 0L

public actual fun RpcSsSetClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsSetClientAllocFree(clientalloc.toLong().toString(), clientfree.toLong().toString())
    }
}

public actual fun RpcSsSetThreadHandle(id: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsSetThreadHandle(id.toString())
    }
}

public actual fun RpcSsSwapClientAllocFree(clientalloc: RPC_CLIENT_ALLOC, clientfree: RPC_CLIENT_FREE, oldclientalloc: Long, oldclientfree: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcSsSwapClientAllocFree(clientalloc.toLong().toString(), clientfree.toLong().toString(), oldclientalloc.toString(), oldclientfree.toString())
    }
}

public actual fun RpcStringBindingComposeA(objuuid: PCSTR, protseq: PCSTR, networkaddr: PCSTR, endpoint: PCSTR, options: PCSTR, stringbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcStringBindingComposeA(objuuid.toString(), protseq.toString(), networkaddr.toString(), endpoint.toString(), options.toString(), stringbinding.toString()) as Int) else 0

public actual fun RpcStringBindingComposeW(objuuid: PCWSTR, protseq: PCWSTR, networkaddr: PCWSTR, endpoint: PCWSTR, options: PCWSTR, stringbinding: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcStringBindingComposeW(objuuid.toString(), protseq.toString(), networkaddr.toString(), endpoint.toString(), options.toString(), stringbinding.toString()) as Int) else 0

public actual fun RpcStringBindingParseA(stringbinding: PCSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcStringBindingParseA(stringbinding.toString(), objuuid.toString(), protseq.toString(), networkaddr.toString(), endpoint.toString(), networkoptions.toString()) as Int) else 0

public actual fun RpcStringBindingParseW(stringbinding: PCWSTR, objuuid: Long, protseq: Long, networkaddr: Long, endpoint: Long, networkoptions: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcStringBindingParseW(stringbinding.toString(), objuuid.toString(), protseq.toString(), networkaddr.toString(), endpoint.toString(), networkoptions.toString()) as Int) else 0

public actual fun RpcStringFreeA(string: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcStringFreeA(string.toString()) as Int) else 0

public actual fun RpcStringFreeW(string: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcStringFreeW(string.toString()) as Int) else 0

public actual fun RpcTestCancel(): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcTestCancel() as Int) else 0

public actual fun RpcUserFree(asynchandle: Long, pbuffer: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_RpcUserFree(asynchandle.toString(), pbuffer.toString())
    }
}

public actual fun UuidCompare(uuid1: Long, uuid2: Long, status: Long): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidCompare(uuid1.toString(), uuid2.toString(), status.toString()) as Int) else 0

public actual fun UuidCreate(uuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidCreate(uuid.toString()) as Int) else 0

public actual fun UuidCreateNil(niluuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidCreateNil(niluuid.toString()) as Int) else 0

public actual fun UuidCreateSequential(uuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidCreateSequential(uuid.toString()) as Int) else 0

public actual fun UuidEqual(uuid1: Long, uuid2: Long, status: Long): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidEqual(uuid1.toString(), uuid2.toString(), status.toString()) as Int) else 0

public actual fun UuidFromStringA(stringuuid: PCSTR, uuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidFromStringA(stringuuid.toString(), uuid.toString()) as Int) else 0

public actual fun UuidFromStringW(stringuuid: PCWSTR, uuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidFromStringW(stringuuid.toString(), uuid.toString()) as Int) else 0

public actual fun UuidHash(uuid: Long, status: Long): UShort =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidHash(uuid.toString(), status.toString()) as Int).toUShort() else 0u

public actual fun UuidIsNil(uuid: Long, status: Long): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidIsNil(uuid.toString(), status.toString()) as Int) else 0

public actual fun UuidToStringA(uuid: Long, stringuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidToStringA(uuid.toString(), stringuuid.toString()) as Int) else 0

public actual fun UuidToStringW(uuid: Long, stringuuid: Long): RPC_STATUS =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_UuidToStringW(uuid.toString(), stringuuid.toString()) as Int) else 0
