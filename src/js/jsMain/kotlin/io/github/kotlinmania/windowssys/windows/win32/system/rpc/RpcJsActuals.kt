@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SystemRpcNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_dceErrorInqTextA(rpcstatus, (errortext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_dceErrorInqTextW(rpcstatus, (errortext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownAddRefProxy(thisRef: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iunknownAddRefProxy((thisRef?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownQueryInterfaceProxy(thisRef: COpaquePointer?, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iunknownQueryInterfaceProxy((thisRef?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppvobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownReleaseProxy(thisRef: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iunknownReleaseProxy((thisRef?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAllocate(size: UInt): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcAllocate(size.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcAsyncAbortCall((pasync?.value ?: 0L).toString(), exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAsyncSetHandle(message: COpaquePointer?, pasync: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcAsyncSetHandle((message?.value ?: 0L).toString(), (pasync?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingCopy((sourcebinding?.value ?: 0L).toString(), (destinationbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingCreateNp((servername?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (networkoptions?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingHandleToAsyncHandle(binding: COpaquePointer?, asynchandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingHandleToAsyncHandle((binding?.value ?: 0L).toString(), (asynchandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqClientTokenAttributes(binding: COpaquePointer?, tokenid: COpaquePointer?, authenticationid: COpaquePointer?, modifiedid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqClientTokenAttributes((binding?.value ?: 0L).toString(), (tokenid?.value ?: 0L).toString(), (authenticationid?.value ?: 0L).toString(), (modifiedid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqDynamicEndpointA(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointA((binding?.value ?: 0L).toString(), (dynamicendpoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqDynamicEndpointW(binding: COpaquePointer?, dynamicendpoint: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqDynamicEndpointW((binding?.value ?: 0L).toString(), (dynamicendpoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqLocalClientPid(binding: COpaquePointer?, pid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqLocalClientPid((binding?.value ?: 0L).toString(), (pid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: COpaquePointer?, marshalledtargetinfosize: COpaquePointer?, marshalledtargetinfo: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqMarshalledTargetInfo((binding?.value ?: 0L).toString(), (marshalledtargetinfosize?.value ?: 0L).toString(), (marshalledtargetinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqSecurityContext(binding: COpaquePointer?, securitycontexthandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContext((binding?.value ?: 0L).toString(), (securitycontexthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: COpaquePointer?, keyinfo: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqSecurityContextKeyInfo((binding?.value ?: 0L).toString(), (keyinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqTransportType(binding: COpaquePointer?, type: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqTransportType((binding?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqWireIdForSnego(binding: COpaquePointer?, wireid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingInqWireIdForSnego((binding?.value ?: 0L).toString(), (wireid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingIsClientLocal(bindinghandle: COpaquePointer?, clientlocalflag: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingIsClientLocal((bindinghandle?.value ?: 0L).toString(), (clientlocalflag?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingIsServerLocal(binding: COpaquePointer?, serverlocalflag: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingIsServerLocal((binding?.value ?: 0L).toString(), (serverlocalflag?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingSetPrivateOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingSetPrivateOption((hbinding?.value ?: 0L).toString(), option.toInt(), optionvalue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingToStaticStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcBindingToStaticStringBindingW((binding?.value ?: 0L).toString(), (stringbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcClearMutex(mutex: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcClearMutex((mutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcDeleteMutex(mutex: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcDeleteMutex((mutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcExceptionFilter(exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcFree(obj: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcFree((obj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcFreeBuffer(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcFreeBuffer((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcFreePipeBuffer(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcFreePipeBuffer((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetBuffer(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcGetBuffer((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetBufferWithObject(message: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcGetBufferWithObject((message?.value ?: 0L).toString(), (objectuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetCurrentCallHandle(): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcGetCurrentCallHandle() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcGetDefaultSd((ppsecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetExtendedError(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcGetExtendedError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: COpaquePointer?, transfersyntaxes: COpaquePointer?, transfersyntaxsize: UInt, transfersyntaxcount: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcIfInqTransferSyntaxes((rpcifhandle?.value ?: 0L).toString(), (transfersyntaxes?.value ?: 0L).toString(), transfersyntaxsize.toInt(), (transfersyntaxcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcMapWin32Status(status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcMgmtEnableDedicatedThreadPool() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNegotiateTransferSyntax(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNegotiateTransferSyntax((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsBindingSetEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameA((binding?.value ?: 0L).toString(), entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsBindingSetEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNsBindingSetEntryNameW((binding?.value ?: 0L).toString(), entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsGetBuffer(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNsGetBuffer((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNsInterfaceExported(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (rpcinterfaceinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: COpaquePointer?, rpcinterfaceinformation: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNsInterfaceUnexported(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (rpcinterfaceinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsRaiseException(message: COpaquePointer?, status: RpcStatus) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNsRaiseException((message?.value ?: 0L).toString(), status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcNsSendReceive(message: COpaquePointer?, handle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcNsSendReceive((message?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcOpenClientProcess(binding: COpaquePointer?, desiredaccess: UInt, clientprocess: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcOpenClientProcess((binding?.value ?: 0L).toString(), desiredaccess.toInt(), (clientprocess?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcPauseExecution(milliseconds: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcPauseExecution(milliseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcReBindBuffer(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcReBindBuffer((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcReallocPipeBuffer(message: COpaquePointer?, newsize: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcReallocPipeBuffer((message?.value ?: 0L).toString(), newsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcReceive(message: COpaquePointer?, size: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcReceive((message?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: COpaquePointer?, dllname: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcRecordCalloutFailure(rpcstatus, (calloutstate?.value ?: 0L).toString(), (dllname?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcRequestMutex(mutex: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcRequestMutex((mutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSend(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcSend((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcSendReceive(message: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcSendReceive((message?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerCheckClientRestriction(context: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerCheckClientRestriction((context?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerDisableExceptionFilter(): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerDisableExceptionFilter() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerGetAssociationId(binding: COpaquePointer?, associationid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerGetAssociationId((binding?.value ?: 0L).toString(), (associationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqAddressChangeFn(): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerInqAddressChangeFn() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqLocalConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerInqLocalConnAddress((binding?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (addressformat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqRemoteConnAddress(binding: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?, addressformat: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerInqRemoteConnAddress((binding?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (addressformat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqTransportType(type: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerInqTransportType((type?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerRegisterForwardFunction((pforwardfunction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerSetAddressChangeFn((paddresschangefn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerStartService((protseq?.value ?: 0L).toString(), (endpoint?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: COpaquePointer?, hevent: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification((binding?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: COpaquePointer?, hevent: COpaquePointer?, subscriptionid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerSubscribeForDisconnectNotification2((binding?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString(), (subscriptionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: COpaquePointer?, subscriptionid: Guid): RpcStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2A((networkaddress?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerUseProtseq2W((networkaddress?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2A((networkaddress?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), maxcalls.toInt(), (endpoint?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcServerUseProtseqEp2W((networkaddress?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), maxcalls.toInt(), (endpoint?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcSessionStrictContextHandle() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcSessionStrictContextHandle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSsDontSerializeContext() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcSsDontSerializeContext()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSystemHandleTypeSpecificWork(handle: COpaquePointer?, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcSystemHandleTypeSpecificWork((handle?.value ?: 0L).toString(), actualtype.toInt(), idltype.toInt(), marshaldirection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iRpcTurnOnEeinfoPropagation() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iUuidCreate(uuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_iUuidCreate((uuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesBufferHandleReset(handle: COpaquePointer?, handlestyle: UInt, operation: MidlEsCode, pbuffer: COpaquePointer?, buffersize: UInt, pencodedsize: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesBufferHandleReset((handle?.value ?: 0L).toString(), handlestyle.toInt(), operation, (pbuffer?.value ?: 0L).toString(), buffersize.toInt(), (pencodedsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesDecodeBufferHandleCreate((buffer?.value ?: 0L).toString(), buffersize.toInt(), (phandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesDecodeIncrementalHandleCreate(userstate: COpaquePointer?, readfn: MidlEsRead, phandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesDecodeIncrementalHandleCreate((userstate?.value ?: 0L).toString(), 0L.toString(), (phandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: COpaquePointer?, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesEncodeDynBufferHandleCreate((pbuffer?.value ?: 0L).toString(), (pencodedsize?.value ?: 0L).toString(), (phandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: COpaquePointer?, phandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesEncodeFixedBufferHandleCreate((pbuffer?.value ?: 0L).toString(), buffersize.toInt(), (pencodedsize?.value ?: 0L).toString(), (phandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeIncrementalHandleCreate(userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesEncodeIncrementalHandleCreate((userstate?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), (phandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesHandleFree(handle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesHandleFree((handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesIncrementalHandleReset(handle: COpaquePointer?, userstate: COpaquePointer?, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesIncrementalHandleReset((handle?.value ?: 0L).toString(), (userstate?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), operation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesInqProcEncodingId(handle: COpaquePointer?, pinterfaceid: COpaquePointer?, pprocnum: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_mesInqProcEncodingId((handle?.value ?: 0L).toString(), (pinterfaceid?.value ?: 0L).toString(), (pprocnum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRCContextBinding(ccontext: Long): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRCContextBinding(ccontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRCContextMarshall(ccontext.toString(), (pbuff?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRCContextUnmarshall(pccontext: COpaquePointer?, hbinding: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRCContextUnmarshall((pccontext?.value ?: 0L).toString(), (hbinding?.value ?: 0L).toString(), (pbuff?.value ?: 0L).toString(), datarepresentation.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshall(ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRSContextMarshall((ccontext?.value ?: 0L).toString(), (pbuff?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshall2(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown, ctxguard: COpaquePointer?, flags: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRSContextMarshall2((bindinghandle?.value ?: 0L).toString(), (ccontext?.value ?: 0L).toString(), (pbuff?.value ?: 0L).toString(), 0L.toString(), (ctxguard?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshallEx(bindinghandle: COpaquePointer?, ccontext: COpaquePointer?, pbuff: COpaquePointer?, userrundownin: NdrRundown) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRSContextMarshallEx((bindinghandle?.value ?: 0L).toString(), (ccontext?.value ?: 0L).toString(), (pbuff?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextUnmarshall(pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRSContextUnmarshall((pbuff?.value ?: 0L).toString(), datarepresentation.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRSContextUnmarshall2(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt, ctxguard: COpaquePointer?, flags: UInt): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRSContextUnmarshall2((bindinghandle?.value ?: 0L).toString(), (pbuff?.value ?: 0L).toString(), datarepresentation.toInt(), (ctxguard?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRSContextUnmarshallEx(bindinghandle: COpaquePointer?, pbuff: COpaquePointer?, datarepresentation: UInt): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_nDRSContextUnmarshallEx((bindinghandle?.value ?: 0L).toString(), (pbuff?.value ?: 0L).toString(), datarepresentation.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64AsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64AsyncServerCall64(prpcmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndr64AsyncServerCall64((prpcmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndr64AsyncServerCallAll(prpcmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndr64AsyncServerCallAll((prpcmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64DcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndr64DcomAsyncStubCall((pthis?.value ?: 0L).toString(), (pchannel?.value ?: 0L).toString(), (prpcmsg?.value ?: 0L).toString(), (pdwstubphase?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAllocate(pstubmsg: COpaquePointer?, len: ULong): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrAllocate((pstubmsg?.value ?: 0L).toString(), len.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAsyncServerCall(prpcmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrAsyncServerCall((prpcmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrByteCountPointerBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrByteCountPointerFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrByteCountPointerMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrByteCountPointerUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClearOutParameters(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, argaddr: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrClearOutParameters((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), (argaddr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientCall2(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClientCall3(pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClientContextMarshall(pstubmsg: COpaquePointer?, contexthandle: Long, fcheck: Int) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrClientContextMarshall((pstubmsg?.value ?: 0L).toString(), contexthandle.toString(), fcheck)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientContextUnmarshall(pstubmsg: COpaquePointer?, pcontexthandle: COpaquePointer?, bindhandle: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrClientContextUnmarshall((pstubmsg?.value ?: 0L).toString(), (pcontexthandle?.value ?: 0L).toString(), (bindhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrClientInitialize((prpcmsg?.value ?: 0L).toString(), (pstubmsg?.value ?: 0L).toString(), (pstubdescriptor?.value ?: 0L).toString(), procnum.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, procnum: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrClientInitializeNew((prpcmsg?.value ?: 0L).toString(), (pstubmsg?.value ?: 0L).toString(), (pstubdescriptor?.value ?: 0L).toString(), procnum.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexArrayBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexArrayFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexArrayMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexArrayMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexArrayUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexStructBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexStructFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexStructMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexStructMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrComplexStructUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantArrayBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantArrayFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantArrayMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantArrayMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantArrayUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStringBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStringMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStringMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStringUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStructBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStructFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStructMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStructMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantStructUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingArrayUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConformantVaryingStructUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrContextHandleInitialize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrContextHandleInitialize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrContextHandleSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrContextHandleSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConvert(pstubmsg: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConvert((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConvert2(pstubmsg: COpaquePointer?, pformat: COpaquePointer?, numberparams: Int) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrConvert2((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), numberparams)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationFree(pstubmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrCorrelationFree((pstubmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationInitialize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, cachesize: UInt, flags: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrCorrelationInitialize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), cachesize.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationPass(pstubmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrCorrelationPass((pstubmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCreateServerInterfaceFromStub(pstub: COpaquePointer?, pserverif: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrCreateServerInterfaceFromStub((pstub?.value ?: 0L).toString(), (pserverif?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: COpaquePointer?, pformat: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrDcomAsyncStubCall(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrDcomAsyncStubCall((pthis?.value ?: 0L).toString(), (pchannel?.value ?: 0L).toString(), (prpcmsg?.value ?: 0L).toString(), (pdwstubphase?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrEncapsulatedUnionUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFixedArrayBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFixedArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFixedArrayFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFixedArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFixedArrayMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFixedArrayMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFixedArrayUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFreeBuffer(pstubmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFreeBuffer((pstubmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFullPointerXlatFree(pxlattables: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFullPointerXlatFree((pxlattables?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrFullPointerXlatInit(numberofpointers.toInt(), xlatside) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrGetBuffer((pstubmsg?.value ?: 0L).toString(), bufferlength.toInt(), (handle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetDcomProtocolVersion(pstubmsg: COpaquePointer?, pversion: COpaquePointer?): Hresult =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrGetDcomProtocolVersion((pstubmsg?.value ?: 0L).toString(), (pversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetUserMarshalInfo(pflags: COpaquePointer?, informationlevel: UInt, pmarshalinfo: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrGetUserMarshalInfo((pflags?.value ?: 0L).toString(), informationlevel.toInt(), (pmarshalinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrInterfacePointerBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrInterfacePointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrInterfacePointerFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrInterfacePointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrInterfacePointerMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrInterfacePointerMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrInterfacePointerUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMapCommAndFaultStatus(pstubmsg: COpaquePointer?, pcommstatus: COpaquePointer?, pfaultstatus: COpaquePointer?, status: RpcStatus): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMapCommAndFaultStatus((pstubmsg?.value ?: 0L).toString(), (pcommstatus?.value ?: 0L).toString(), (pfaultstatus?.value ?: 0L).toString(), status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesProcEncodeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesProcEncodeDecode((handle?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesProcEncodeDecode2(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesProcEncodeDecode3(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, nprocnum: UInt, preturnvalue: COpaquePointer?, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeAlignSize(param0: COpaquePointer?): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSize((param0?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeAlignSizeAll((handle?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeDecode(handle: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecode((handle?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeDecodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeDecodeAll((handle?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncode((handle?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeEncodeAll(handle: COpaquePointer?, pproxyinfo: COpaquePointer?, pobject: COpaquePointer?, size: Short) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesSimpleTypeEncodeAll((handle?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeAlignSize(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize((handle?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeAlignSize2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize2((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeAlignSize3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?): ULong =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeAlignSize3((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString(), (arrtypeoffset?.value ?: 0L).toString(), ntypeindex.toInt(), (pobject?.value ?: 0L).toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeDecode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeDecode((handle?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeDecode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeDecode2((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeDecode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeDecode3((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString(), (arrtypeoffset?.value ?: 0L).toString(), ntypeindex.toInt(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode(handle: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeEncode((handle?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeEncode2((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeEncode3((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString(), (arrtypeoffset?.value ?: 0L).toString(), ntypeindex.toInt(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeFree2(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pstubdesc: COpaquePointer?, pformatstring: COpaquePointer?, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeFree2((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pstubdesc?.value ?: 0L).toString(), (pformatstring?.value ?: 0L).toString(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeFree3(handle: COpaquePointer?, ppicklinginfo: COpaquePointer?, pproxyinfo: COpaquePointer?, arrtypeoffset: COpaquePointer?, ntypeindex: UInt, pobject: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrMesTypeFree3((handle?.value ?: 0L).toString(), (ppicklinginfo?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString(), (arrtypeoffset?.value ?: 0L).toString(), ntypeindex.toInt(), (pobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonConformantStringBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonConformantStringBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonConformantStringMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonConformantStringMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonConformantStringMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonConformantStringMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonConformantStringUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNonEncapsulatedUnionUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNsGetBuffer(pstubmsg: COpaquePointer?, bufferlength: UInt, handle: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNsGetBuffer((pstubmsg?.value ?: 0L).toString(), bufferlength.toInt(), (handle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNsSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?, pautohandle: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrNsSendReceive((pstubmsg?.value ?: 0L).toString(), (pbufferend?.value ?: 0L).toString(), (pautohandle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrOleAllocate(size: ULong): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrOleAllocate(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrOleFree(nodetofree: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrOleFree((nodetofree?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPartialIgnoreClientMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerInitialize((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPartialIgnoreServerUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPointerBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPointerFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPointerMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrPointerMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPointerMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrPointerUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrPointerUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRangeUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRangeUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSmClientAllocate(size: ULong): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRpcSmClientAllocate(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSmClientFree(nodetofree: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRpcSmClientFree((nodetofree?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSmSetClientToOsf(pmessage: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRpcSmSetClientToOsf((pmessage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsDefaultAllocate(size: ULong): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRpcSsDefaultAllocate(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSsDefaultFree(nodetofree: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRpcSsDefaultFree((nodetofree?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsDisableAllocate(pmessage: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRpcSsDisableAllocate((pmessage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsEnableAllocate(pmessage: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrRpcSsEnableAllocate((pmessage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSendReceive(pstubmsg: COpaquePointer?, pbufferend: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSendReceive((pstubmsg?.value ?: 0L).toString(), (pbufferend?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerCall2(prpcmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerCall2((prpcmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerCallAll(prpcmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerCallAll((prpcmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerCallNdr64(prpcmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerCallNdr64((prpcmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerContextMarshall((pstubmsg?.value ?: 0L).toString(), (contexthandle?.value ?: 0L).toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextNewMarshall(pstubmsg: COpaquePointer?, contexthandle: COpaquePointer?, rundownroutine: NdrRundown, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerContextNewMarshall((pstubmsg?.value ?: 0L).toString(), (contexthandle?.value ?: 0L).toString(), 0L.toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextNewUnmarshall(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerContextNewUnmarshall((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerContextUnmarshall(pstubmsg: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerContextUnmarshall((pstubmsg?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitialize(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerInitialize((prpcmsg?.value ?: 0L).toString(), (pstubmsg?.value ?: 0L).toString(), (pstubdescriptor?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitializeMarshall(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerInitializeMarshall((prpcmsg?.value ?: 0L).toString(), (pstubmsg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerInitializeNew(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerInitializeNew((prpcmsg?.value ?: 0L).toString(), (pstubmsg?.value ?: 0L).toString(), (pstubdescriptor?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitializePartial(prpcmsg: COpaquePointer?, pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, requestedbuffersize: UInt) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerInitializePartial((prpcmsg?.value ?: 0L).toString(), (pstubmsg?.value ?: 0L).toString(), (pstubdescriptor?.value ?: 0L).toString(), requestedbuffersize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerInitializeUnmarshall(pstubmsg: COpaquePointer?, pstubdescriptor: COpaquePointer?, prpcmsg: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrServerInitializeUnmarshall((pstubmsg?.value ?: 0L).toString(), (pstubdescriptor?.value ?: 0L).toString(), (prpcmsg?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSimpleStructBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleStructFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSimpleStructFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleStructMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSimpleStructMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSimpleStructMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSimpleStructUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleTypeMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSimpleTypeMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), formatchar.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, formatchar: UByte) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrSimpleTypeUnmarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), formatchar.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrStubCall2(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrStubCall2((pthis?.value ?: 0L).toString(), (pchannel?.value ?: 0L).toString(), (prpcmsg?.value ?: 0L).toString(), (pdwstubphase?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrStubCall3(pthis: COpaquePointer?, pchannel: COpaquePointer?, prpcmsg: COpaquePointer?, pdwstubphase: COpaquePointer?): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrStubCall3((pthis?.value ?: 0L).toString(), (pchannel?.value ?: 0L).toString(), (prpcmsg?.value ?: 0L).toString(), (pdwstubphase?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrUserMarshalBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrUserMarshalFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrUserMarshalFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrUserMarshalMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrUserMarshalMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrUserMarshalMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: COpaquePointer?, pbuffer: COpaquePointer?, formatchar: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrUserMarshalSimpleTypeConvert((pflags?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), formatchar.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrUserMarshalUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrVaryingArrayBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrVaryingArrayFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrVaryingArrayFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrVaryingArrayMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrVaryingArrayMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrVaryingArrayMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrVaryingArrayUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsBufferSize((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrXmitOrRepAsFree(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsFree((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: COpaquePointer?, pmemory: COpaquePointer?, pformat: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMarshall((pstubmsg?.value ?: 0L).toString(), (pmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: COpaquePointer?, pformat: COpaquePointer?): UInt =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsMemorySize((pstubmsg?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: COpaquePointer?, ppmemory: COpaquePointer?, pformat: COpaquePointer?, fmustalloc: UByte): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_ndrXmitOrRepAsUnmarshall((pstubmsg?.value ?: 0L).toString(), (ppmemory?.value ?: 0L).toString(), (pformat?.value ?: 0L).toString(), fmustalloc.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncAbortCall(pasync: COpaquePointer?, exceptioncode: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcAsyncAbortCall((pasync?.value ?: 0L).toString(), exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncCancelCall(pasync: COpaquePointer?, fabort: Bool): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcAsyncCancelCall((pasync?.value ?: 0L).toString(), fabort) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncCompleteCall(pasync: COpaquePointer?, reply: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcAsyncCompleteCall((pasync?.value ?: 0L).toString(), (reply?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncGetCallStatus(pasync: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcAsyncGetCallStatus((pasync?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncInitializeHandle(pasync: COpaquePointer?, size: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcAsyncInitializeHandle((pasync?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncRegisterInfo(pasync: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcAsyncRegisterInfo((pasync?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingBind(pasync: COpaquePointer?, binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingBind((pasync?.value ?: 0L).toString(), (binding?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCopy(sourcebinding: COpaquePointer?, destinationbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingCopy((sourcebinding?.value ?: 0L).toString(), (destinationbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCreateA(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingCreateA((template?.value ?: 0L).toString(), (security?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCreateW(template: COpaquePointer?, security: COpaquePointer?, options: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingCreateW((template?.value ?: 0L).toString(), (security?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFree(binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingFree((binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingA((stringbinding?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingFromStringBindingW((stringbinding?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientA((clientbinding?.value ?: 0L).toString(), (privs?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientExA(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExA((clientbinding?.value ?: 0L).toString(), (privs?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientExW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?, flags: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientExW((clientbinding?.value ?: 0L).toString(), (privs?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientW(clientbinding: COpaquePointer?, privs: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthClientW((clientbinding?.value ?: 0L).toString(), (privs?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoA((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoExA(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExA((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString(), rpcqosversion.toInt(), (securityqos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoExW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?, rpcqosversion: UInt, securityqos: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoExW((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString(), rpcqosversion.toInt(), (securityqos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoW(binding: COpaquePointer?, serverprincname: COpaquePointer?, authnlevel: COpaquePointer?, authnsvc: COpaquePointer?, authidentity: COpaquePointer?, authzsvc: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqAuthInfoW((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), (authnlevel?.value ?: 0L).toString(), (authnsvc?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (authzsvc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqMaxCalls(binding: COpaquePointer?, maxcalls: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqMaxCalls((binding?.value ?: 0L).toString(), (maxcalls?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqObject((binding?.value ?: 0L).toString(), (objectuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqOption(hbinding: COpaquePointer?, option: UInt, poptionvalue: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingInqOption((hbinding?.value ?: 0L).toString(), option.toInt(), (poptionvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingReset(binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingReset((binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingServerFromClient(clientbinding: COpaquePointer?, serverbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingServerFromClient((clientbinding?.value ?: 0L).toString(), (serverbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoA((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L).toString(), authzsvc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoExA(binding: COpaquePointer?, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExA((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L).toString(), authzsvc.toInt(), (securityqos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoExW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt, securityqos: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoExW((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L).toString(), authzsvc.toInt(), (securityqos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoW(binding: COpaquePointer?, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: COpaquePointer?, authzsvc: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingSetAuthInfoW((binding?.value ?: 0L).toString(), (serverprincname?.value ?: 0L).toString(), authnlevel.toInt(), authnsvc.toInt(), (authidentity?.value ?: 0L).toString(), authzsvc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetObject(binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingSetObject((binding?.value ?: 0L).toString(), (objectuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetOption(hbinding: COpaquePointer?, option: UInt, optionvalue: ULong): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingSetOption((hbinding?.value ?: 0L).toString(), option.toInt(), optionvalue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingToStringBindingA(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingToStringBindingA((binding?.value ?: 0L).toString(), (stringbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingToStringBindingW(binding: COpaquePointer?, stringbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingToStringBindingW((binding?.value ?: 0L).toString(), (stringbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingUnbind(binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingUnbind((binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingVectorFree(bindingvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcBindingVectorFree((bindingvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCancelThread(thread: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcCancelThread((thread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCancelThreadEx(thread: COpaquePointer?, timeout: Int): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcCancelThreadEx((thread?.value ?: 0L).toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCertGeneratePrincipalNameA(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameA((context?.value ?: 0L).toString(), flags.toInt(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCertGeneratePrincipalNameW(context: COpaquePointer?, flags: UInt, pbuffer: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcCertGeneratePrincipalNameW((context?.value ?: 0L).toString(), flags.toInt(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcEpRegisterA((ifspec?.value ?: 0L).toString(), (bindingvector?.value ?: 0L).toString(), (uuidvector?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterNoReplaceA(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceA((ifspec?.value ?: 0L).toString(), (bindingvector?.value ?: 0L).toString(), (uuidvector?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterNoReplaceW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcEpRegisterNoReplaceW((ifspec?.value ?: 0L).toString(), (bindingvector?.value ?: 0L).toString(), (uuidvector?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterW(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?, annotation: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcEpRegisterW((ifspec?.value ?: 0L).toString(), (bindingvector?.value ?: 0L).toString(), (uuidvector?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpResolveBinding(binding: COpaquePointer?, ifspec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcEpResolveBinding((binding?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpUnregister(ifspec: COpaquePointer?, bindingvector: COpaquePointer?, uuidvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcEpUnregister((ifspec?.value ?: 0L).toString(), (bindingvector?.value ?: 0L).toString(), (uuidvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorAddRecord(errorinfo: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorAddRecord((errorinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorClearInformation() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorClearInformation()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcErrorEndEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorEndEnumeration((enumhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorGetNextRecord(enumhandle: COpaquePointer?, copystrings: Bool, errorinfo: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorGetNextRecord((enumhandle?.value ?: 0L).toString(), copystrings, (errorinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorGetNumberOfRecords(enumhandle: COpaquePointer?, records: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorGetNumberOfRecords((enumhandle?.value ?: 0L).toString(), (records?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorLoadErrorInfo(errorblob: COpaquePointer?, blobsize: ULong, enumhandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorLoadErrorInfo((errorblob?.value ?: 0L).toString(), blobsize.toString(), (enumhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorResetEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorResetEnumeration((enumhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorSaveErrorInfo(enumhandle: COpaquePointer?, errorblob: COpaquePointer?, blobsize: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorSaveErrorInfo((enumhandle?.value ?: 0L).toString(), (errorblob?.value ?: 0L).toString(), (blobsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorStartEnumeration(enumhandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcErrorStartEnumeration((enumhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcExceptionFilter(exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcFreeAuthorizationContext((pauthzclientcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcGetAuthorizationContextForClient(clientbinding: COpaquePointer?, impersonateonreturn: Bool, reserved1: COpaquePointer?, pexpirationtime: COpaquePointer?, reserved2: Luid, reserved3: UInt, reserved4: COpaquePointer?, pauthzclientcontext: COpaquePointer?): RpcStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcIfIdVectorFree(ifidvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcIfIdVectorFree((ifidvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcIfInqId(rpcifhandle: COpaquePointer?, rpcifid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcIfInqId((rpcifhandle?.value ?: 0L).toString(), (rpcifid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClient(bindinghandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcImpersonateClient((bindinghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClient2(bindinghandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcImpersonateClient2((bindinghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClientContainer(bindinghandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcImpersonateClientContainer((bindinghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtEnableIdleCleanup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqBegin(epbinding: COpaquePointer?, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, objectuuid: COpaquePointer?, inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqBegin((epbinding?.value ?: 0L).toString(), inquirytype.toInt(), (ifid?.value ?: 0L).toString(), versoption.toInt(), (objectuuid?.value ?: 0L).toString(), (inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqDone((inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextA((inquirycontext?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), (binding?.value ?: 0L).toString(), (objectuuid?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtEpEltInqNextW((inquirycontext?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), (binding?.value ?: 0L).toString(), (objectuuid?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpUnregister(epbinding: COpaquePointer?, ifid: COpaquePointer?, binding: COpaquePointer?, objectuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtEpUnregister((epbinding?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), (binding?.value ?: 0L).toString(), (objectuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqComTimeout(binding: COpaquePointer?, timeout: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtInqComTimeout((binding?.value ?: 0L).toString(), (timeout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtInqDefaultProtectLevel(authnsvc.toInt(), (authnlevel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqIfIds(binding: COpaquePointer?, ifidvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtInqIfIds((binding?.value ?: 0L).toString(), (ifidvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqServerPrincNameA(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameA((binding?.value ?: 0L).toString(), authnsvc.toInt(), (serverprincname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqServerPrincNameW(binding: COpaquePointer?, authnsvc: UInt, serverprincname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtInqServerPrincNameW((binding?.value ?: 0L).toString(), authnsvc.toInt(), (serverprincname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqStats(binding: COpaquePointer?, statistics: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtInqStats((binding?.value ?: 0L).toString(), (statistics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtIsServerListening(binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtIsServerListening((binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtSetAuthorizationFn(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtSetCancelTimeout(timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetComTimeout(binding: COpaquePointer?, timeout: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtSetComTimeout((binding?.value ?: 0L).toString(), timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtSetServerStackSize(threadstacksize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtStatsVectorFree(statsvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtStatsVectorFree((statsvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtStopServerListening(binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtStopServerListening((binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcMgmtWaitServerListen() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkInqProtseqsA(protseqvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsA((protseqvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkInqProtseqsW(protseqvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNetworkInqProtseqsW((protseqvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidA((protseq?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNetworkIsProtseqValidW((protseq?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingExportA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (bindingvec?.value ?: 0L).toString(), (objectuuidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objectvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingExportPnPW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objectvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, bindingvec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingExportW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (bindingvec?.value ?: 0L).toString(), (objectuuidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objuuid?.value ?: 0L).toString(), (importcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, importcontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingImportBeginW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objuuid?.value ?: 0L).toString(), (importcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportDone(importcontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingImportDone((importcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportNext(importcontext: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingImportNext((importcontext?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingInqEntryNameA(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameA((binding?.value ?: 0L).toString(), entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingInqEntryNameW(binding: COpaquePointer?, entrynamesyntax: UInt, entryname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingInqEntryNameW((binding?.value ?: 0L).toString(), entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objuuid?.value ?: 0L).toString(), bindingmaxcount.toInt(), (lookupcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objuuid: COpaquePointer?, bindingmaxcount: UInt, lookupcontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingLookupBeginW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objuuid?.value ?: 0L).toString(), bindingmaxcount.toInt(), (lookupcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupDone(lookupcontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingLookupDone((lookupcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupNext(lookupcontext: COpaquePointer?, bindingvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingLookupNext((lookupcontext?.value ?: 0L).toString(), (bindingvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingSelect(bindingvec: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingSelect((bindingvec?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objectuuidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objectvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportPnPW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objectvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: COpaquePointer?, objectuuidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsBindingUnexportW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifspec?.value ?: 0L).toString(), (objectuuidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (expandedname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsEntryExpandNameW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (expandedname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqBeginW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqDone((inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqNext(inquirycontext: COpaquePointer?, objuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsEntryObjectInqNext((inquirycontext?.value ?: 0L).toString(), (objuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupDeleteA(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupDeleteW(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddA(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrAddW(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginA(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString(), membernamesyntax.toInt(), (inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqBeginW(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString(), membernamesyntax.toInt(), (inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqDone((inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextA((inquirycontext?.value ?: 0L).toString(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: COpaquePointer?, membername: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrInqNextW((inquirycontext?.value ?: 0L).toString(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveA(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsGroupMbrRemoveW(groupnamesyntax.toInt(), (groupname?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), versoption.toInt(), (objectuuidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: COpaquePointer?, versoption: UInt, objectuuidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtBindingUnexportW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), versoption.toInt(), (objectuuidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryCreateW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryDeleteW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsA(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtEntryInqIfIdsW(entrynamesyntax.toInt(), (entryname?.value ?: 0L).toString(), (ifidvec?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: COpaquePointer?, expirationage: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtHandleSetExpAge((nshandle?.value ?: 0L).toString(), expirationage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtInqExpAge(expirationage: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtInqExpAge((expirationage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsMgmtSetExpAge(expirationage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileDeleteA(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileDeleteW(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltAddA(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString(), priority.toInt(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltAddW(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString(), priority.toInt(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginA(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString(), inquirytype.toInt(), (ifid?.value ?: 0L).toString(), versoption.toInt(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString(), (inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: COpaquePointer?, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqBeginW(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString(), inquirytype.toInt(), (ifid?.value ?: 0L).toString(), versoption.toInt(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString(), (inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqDone(inquirycontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqDone((inquirycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqNextA(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextA((inquirycontext?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), (membername?.value ?: 0L).toString(), (priority?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqNextW(inquirycontext: COpaquePointer?, ifid: COpaquePointer?, membername: COpaquePointer?, priority: COpaquePointer?, annotation: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltInqNextW((inquirycontext?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), (membername?.value ?: 0L).toString(), (priority?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveA(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: COpaquePointer?, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcNsProfileEltRemoveW(profilenamesyntax.toInt(), (profilename?.value ?: 0L).toString(), (ifid?.value ?: 0L).toString(), membernamesyntax.toInt(), (membername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectInqType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcObjectInqType((objuuid?.value ?: 0L).toString(), (typeuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcObjectSetInqFn(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectSetType(objuuid: COpaquePointer?, typeuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcObjectSetType((objuuid?.value ?: 0L).toString(), (typeuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcProtseqVectorFreeA(protseqvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeA((protseqvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcProtseqVectorFreeW(protseqvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcProtseqVectorFreeW((protseqvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRaiseException(exception: RpcStatus) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcRaiseException(exception)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcRevertContainerImpersonation() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRevertToSelf(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcRevertToSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRevertToSelfEx(bindinghandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcRevertToSelfEx((bindinghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: COpaquePointer?, status: RpcStatus): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerCompleteSecurityCallback((bindinghandle?.value ?: 0L).toString(), status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindingHandle(binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqBindingHandle((binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindings(bindingvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqBindings((bindingvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindingsEx(securitydescriptor: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqBindingsEx((securitydescriptor?.value ?: 0L).toString(), (bindingvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqCallAttributesA(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesA((clientbinding?.value ?: 0L).toString(), (rpccallattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqCallAttributesW(clientbinding: COpaquePointer?, rpccallattributes: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqCallAttributesW((clientbinding?.value ?: 0L).toString(), (rpccallattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameA(authnsvc.toInt(), (princname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqDefaultPrincNameW(authnsvc.toInt(), (princname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInqIf((ifspec?.value ?: 0L).toString(), (mgrtypeuuid?.value ?: 0L).toString(), (mgrepv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupActivate(ifgroup: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupActivate((ifgroup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupClose(ifgroup: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupClose((ifgroup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupCreateA(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateA((interfaces?.value ?: 0L).toString(), numifs.toInt(), (endpoints?.value ?: 0L).toString(), numendpoints.toInt(), idleperiod.toInt(), 0L.toString(), (idlecallbackcontext?.value ?: 0L).toString(), (ifgroup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupCreateW(interfaces: COpaquePointer?, numifs: UInt, endpoints: COpaquePointer?, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: COpaquePointer?, ifgroup: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupCreateW((interfaces?.value ?: 0L).toString(), numifs.toInt(), (endpoints?.value ?: 0L).toString(), numendpoints.toInt(), idleperiod.toInt(), 0L.toString(), (idlecallbackcontext?.value ?: 0L).toString(), (ifgroup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: COpaquePointer?, forcedeactivation: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupDeactivate((ifgroup?.value ?: 0L).toString(), forcedeactivation.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: COpaquePointer?, bindingvector: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerInterfaceGroupInqBindings((ifgroup?.value ?: 0L).toString(), (bindingvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoA((serverprincname?.value ?: 0L).toString(), authnsvc.toInt(), 0L.toString(), (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerRegisterAuthInfoW((serverprincname?.value ?: 0L).toString(), authnsvc.toInt(), 0L.toString(), (arg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerRegisterIf((ifspec?.value ?: 0L).toString(), (mgrtypeuuid?.value ?: 0L).toString(), (mgrepv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf2(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerRegisterIf2((ifspec?.value ?: 0L).toString(), (mgrtypeuuid?.value ?: 0L).toString(), (mgrepv?.value ?: 0L).toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf3(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerRegisterIf3((ifspec?.value ?: 0L).toString(), (mgrtypeuuid?.value ?: 0L).toString(), (mgrepv?.value ?: 0L).toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L.toString(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, mgrepv: COpaquePointer?, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerRegisterIfEx((ifspec?.value ?: 0L).toString(), (mgrtypeuuid?.value ?: 0L).toString(), (mgrepv?.value ?: 0L).toString(), flags.toInt(), maxcalls.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerSubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerSubscribeForNotification((binding?.value ?: 0L).toString(), notification, notificationtype, (notificationinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerTestCancel(bindinghandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerTestCancel((bindinghandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnregisterIf(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, waitforcallstocomplete: UInt): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUnregisterIf((ifspec?.value ?: 0L).toString(), (mgrtypeuuid?.value ?: 0L).toString(), waitforcallstocomplete.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnregisterIfEx(ifspec: COpaquePointer?, mgrtypeuuid: COpaquePointer?, rundowncontexthandles: Int): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUnregisterIfEx((ifspec?.value ?: 0L).toString(), (mgrtypeuuid?.value ?: 0L).toString(), rundowncontexthandles) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnsubscribeForNotification(binding: COpaquePointer?, notification: RpcNotifications, notificationsqueued: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUnsubscribeForNotification((binding?.value ?: 0L).toString(), notification, (notificationsqueued?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqs(maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsEx(maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIf(maxcalls.toInt(), (ifspec?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseAllProtseqsIfEx(maxcalls.toInt(), (ifspec?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqA((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpA((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (endpoint?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExA((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (endpoint?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpExW((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (endpoint?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqEpW((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (endpoint?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqExA((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqExW((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfA((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (ifspec?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExA((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (ifspec?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?, policy: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfExW((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (ifspec?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: COpaquePointer?, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqIfW((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (ifspec?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerUseProtseqW((protseq?.value ?: 0L).toString(), maxcalls.toInt(), (securitydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerYield() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcServerYield()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSmAllocate(size: ULong, pstatus: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmAllocate(size.toString(), (pstatus?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmClientFree(pnodetofree: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmClientFree((pnodetofree?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmDestroyClientContext(contexthandle: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmDestroyClientContext((contexthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmDisableAllocate(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmDisableAllocate() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmEnableAllocate(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmEnableAllocate() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmFree(nodetofree: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmFree((nodetofree?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmGetThreadHandle(pstatus: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmGetThreadHandle((pstatus?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmSetClientAllocFree(0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSetThreadHandle(id: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmSetThreadHandle((id?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSmSwapClientAllocFree(0L.toString(), 0L.toString(), (oldclientalloc?.value ?: 0L).toString(), (oldclientfree?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsAllocate(size: ULong): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsAllocate(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsContextLockExclusive(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsContextLockExclusive((serverbindinghandle?.value ?: 0L).toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsContextLockShared(serverbindinghandle: COpaquePointer?, usercontext: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsContextLockShared((serverbindinghandle?.value ?: 0L).toString(), (usercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsDestroyClientContext(contexthandle: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsDestroyClientContext((contexthandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsDisableAllocate() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsDisableAllocate()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsDontSerializeContext() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsDontSerializeContext()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsEnableAllocate() {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsEnableAllocate()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsFree(nodetofree: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsFree((nodetofree?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsGetContextBinding(contexthandle: COpaquePointer?, binding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsGetContextBinding((contexthandle?.value ?: 0L).toString(), (binding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsGetThreadHandle(): COpaquePointer? =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsGetThreadHandle() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsSetClientAllocFree(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsSetThreadHandle(id: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsSetThreadHandle((id?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: COpaquePointer?, oldclientfree: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcSsSwapClientAllocFree(0L.toString(), 0L.toString(), (oldclientalloc?.value ?: 0L).toString(), (oldclientfree?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcStringBindingComposeA((objuuid?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), (networkaddr?.value ?: 0L).toString(), (endpoint?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (stringbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcStringBindingComposeW((objuuid?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), (networkaddr?.value ?: 0L).toString(), (endpoint?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (stringbinding?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcStringBindingParseA((stringbinding?.value ?: 0L).toString(), (objuuid?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), (networkaddr?.value ?: 0L).toString(), (endpoint?.value ?: 0L).toString(), (networkoptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: COpaquePointer?, protseq: COpaquePointer?, networkaddr: COpaquePointer?, endpoint: COpaquePointer?, networkoptions: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcStringBindingParseW((stringbinding?.value ?: 0L).toString(), (objuuid?.value ?: 0L).toString(), (protseq?.value ?: 0L).toString(), (networkaddr?.value ?: 0L).toString(), (endpoint?.value ?: 0L).toString(), (networkoptions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringFreeA(string: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcStringFreeA((string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringFreeW(string: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcStringFreeW((string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcTestCancel(): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcTestCancel() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcUserFree(asynchandle: COpaquePointer?, pbuffer: COpaquePointer?) {
    if (_windowsWin32SystemRpcNapiAddon != null) {
        _windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_rpcUserFree((asynchandle?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uuidCompare(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidCompare((uuid1?.value ?: 0L).toString(), (uuid2?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreate(uuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidCreate((uuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreateNil(niluuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidCreateNil((niluuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreateSequential(uuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidCreateSequential((uuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidEqual(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidEqual((uuid1?.value ?: 0L).toString(), (uuid2?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidFromStringA((stringuuid?.value ?: 0L).toString(), (uuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidFromStringW((stringuuid?.value ?: 0L).toString(), (uuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidHash(uuid: COpaquePointer?, status: COpaquePointer?): UShort =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidHash((uuid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidIsNil(uuid: COpaquePointer?, status: COpaquePointer?): Int =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidIsNil((uuid?.value ?: 0L).toString(), (status?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidToStringA(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidToStringA((uuid?.value ?: 0L).toString(), (stringuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidToStringW(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus =
    if (_windowsWin32SystemRpcNapiAddon != null) (_windowsWin32SystemRpcNapiAddon.windowssys_windows_win32_system_rpc_uuidToStringW((uuid?.value ?: 0L).toString(), (stringuuid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
