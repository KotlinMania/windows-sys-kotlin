@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

private val windowsWin32SystemRpcNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcDceErrorInqTextA(rpcstatus, errortext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcDceErrorInqTextW(rpcstatus, errortext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownAddRefProxy(thisRef: MutPtr<CVoid>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIunknownAddRefProxy(thisRef.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownQueryInterfaceProxy(thisRef: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy(thisRef.rawAddress.toString(), riid.rawAddress.toString(), ppvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownReleaseProxy(thisRef: MutPtr<CVoid>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIunknownReleaseProxy(thisRef.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAllocate(size: UInt): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcAllocate(size.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAsyncAbortCall(pasync: ConstPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcAsyncAbortCall(pasync.rawAddress.toString(), exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAsyncSetHandle(message: ConstPtr<RpcMessage>, pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcAsyncSetHandle(message.rawAddress.toString(), pasync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingCopy(sourcebinding: MutPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingCopy(sourcebinding.rawAddress.toString(), destinationbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingCreateNp(servername.rawAddress.toString(), servicename.rawAddress.toString(), networkoptions.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingHandleToAsyncHandle(binding: MutPtr<CVoid>, asynchandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle(binding.rawAddress.toString(), asynchandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqClientTokenAttributes(binding: ConstPtr<CVoid>, tokenid: MutPtr<Luid>, authenticationid: MutPtr<Luid>, modifiedid: MutPtr<Luid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes(binding.rawAddress.toString(), tokenid.rawAddress.toString(), authenticationid.rawAddress.toString(), modifiedid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqDynamicEndpointA(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA(binding.rawAddress.toString(), dynamicendpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqDynamicEndpointW(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW(binding.rawAddress.toString(), dynamicendpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqLocalClientPid(binding: MutPtr<CVoid>, pid: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid(binding.rawAddress.toString(), pid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: ConstPtr<CVoid>, marshalledtargetinfosize: MutPtr<UInt>, marshalledtargetinfo: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo(binding.rawAddress.toString(), marshalledtargetinfosize.rawAddress.toString(), marshalledtargetinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqSecurityContext(binding: MutPtr<CVoid>, securitycontexthandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext(binding.rawAddress.toString(), securitycontexthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: ConstPtr<CVoid>, keyinfo: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo(binding.rawAddress.toString(), keyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqTransportType(binding: MutPtr<CVoid>, type: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqTransportType(binding.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqWireIdForSnego(binding: ConstPtr<CVoid>, wireid: MutPtr<UByte>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego(binding.rawAddress.toString(), wireid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingIsClientLocal(bindinghandle: MutPtr<CVoid>, clientlocalflag: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal(bindinghandle.rawAddress.toString(), clientlocalflag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingIsServerLocal(binding: ConstPtr<CVoid>, serverlocalflag: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal(binding.rawAddress.toString(), serverlocalflag.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingSetPrivateOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption(hbinding.rawAddress.toString(), option.toInt(), optionvalue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingToStaticStringBindingW(binding: MutPtr<CVoid>, stringbinding: MutPtr<MutPtr<UShort>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW(binding.rawAddress.toString(), stringbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcClearMutex(mutex: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcClearMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcDeleteMutex(mutex: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcDeleteMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcExceptionFilter(exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcFree(obj: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcFree(obj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcFreeBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcFreeBuffer(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcFreePipeBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcFreePipeBuffer(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcGetBuffer(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetBufferWithObject(message: MutPtr<RpcMessage>, objectuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcGetBufferWithObject(message.rawAddress.toString(), objectuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetCurrentCallHandle(): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcGetDefaultSd(ppsecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetExtendedError(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcGetExtendedError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: MutPtr<CVoid>, transfersyntaxes: MutPtr<RpcTransferSyntax>, transfersyntaxsize: UInt, transfersyntaxcount: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes(rpcifhandle.rawAddress.toString(), transfersyntaxes.rawAddress.toString(), transfersyntaxsize.toInt(), transfersyntaxcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcMapWin32Status(status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNegotiateTransferSyntax(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsBindingSetEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsBindingSetEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsGetBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNsGetBuffer(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: ConstPtr<UShort>, rpcinterfaceinformation: ConstPtr<RpcServerInterface>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNsInterfaceExported(entrynamesyntax.toInt(), entryname.rawAddress.toString(), rpcinterfaceinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: MutPtr<UShort>, rpcinterfaceinformation: MutPtr<RpcServerInterface>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported(entrynamesyntax.toInt(), entryname.rawAddress.toString(), rpcinterfaceinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsRaiseException(message: MutPtr<RpcMessage>, status: RpcStatus) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNsRaiseException(message.rawAddress.toString(), status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcNsSendReceive(message: MutPtr<RpcMessage>, handle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcNsSendReceive(message.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcOpenClientProcess(binding: ConstPtr<CVoid>, desiredaccess: UInt, clientprocess: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcOpenClientProcess(binding.rawAddress.toString(), desiredaccess.toInt(), clientprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcPauseExecution(milliseconds: UInt) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcPauseExecution(milliseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcReBindBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcReBindBuffer(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcReallocPipeBuffer(message: ConstPtr<RpcMessage>, newsize: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer(message.rawAddress.toString(), newsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcReceive(message: MutPtr<RpcMessage>, size: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcReceive(message.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: MutPtr<RdrCalloutState>, dllname: MutPtr<UShort>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure(rpcstatus, calloutstate.rawAddress.toString(), dllname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcRequestMutex(mutex: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcRequestMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSend(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcSend(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcSendReceive(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcSendReceive(message.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerCheckClientRestriction(context: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction(context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerDisableExceptionFilter(): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerGetAssociationId(binding: ConstPtr<CVoid>, associationid: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerGetAssociationId(binding.rawAddress.toString(), associationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqAddressChangeFn(): MutPtr<RpcAddressChangeFn> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqLocalConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress(binding.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString(), addressformat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqRemoteConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress(binding.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString(), addressformat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqTransportType(type: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerInqTransportType(type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: MutPtr<RpcForwardFunction>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction(pforwardfunction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: MutPtr<RpcAddressChangeFn>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn(paddresschangefn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerStartService(protseq.rawAddress.toString(), endpoint.rawAddress.toString(), ifspec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification(binding.rawAddress.toString(), hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>, subscriptionid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2(binding.rawAddress.toString(), hevent.rawAddress.toString(), subscriptionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, subscriptionid: Guid): RpcStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcSessionStrictContextHandle() {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSsDontSerializeContext() {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSystemHandleTypeSpecificWork(handle: MutPtr<CVoid>, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork(handle.rawAddress.toString(), actualtype.toInt(), idltype.toInt(), marshaldirection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iUuidCreate(uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcIUuidCreate(uuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesBufferHandleReset(handle: ConstPtr<CVoid>, handlestyle: UInt, operation: MidlEsCode, pbuffer: ConstPtr<ConstPtr<Byte>>, buffersize: UInt, pencodedsize: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesBufferHandleReset(handle.rawAddress.toString(), handlestyle.toInt(), operation, pbuffer.rawAddress.toString(), buffersize.toInt(), pencodedsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate(buffer.rawAddress.toString(), buffersize.toInt(), phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesDecodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, readfn: MidlEsRead, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate(userstate.rawAddress.toString(), 0L.toString(), phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: MutPtr<MutPtr<Byte>>, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate(pbuffer.rawAddress.toString(), pencodedsize.rawAddress.toString(), phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate(pbuffer.rawAddress.toString(), buffersize.toInt(), pencodedsize.rawAddress.toString(), phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate(userstate.rawAddress.toString(), 0L.toString(), 0L.toString(), phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesHandleFree(handle: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesHandleFree(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesIncrementalHandleReset(handle: MutPtr<CVoid>, userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesIncrementalHandleReset(handle.rawAddress.toString(), userstate.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), operation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesInqProcEncodingId(handle: MutPtr<CVoid>, pinterfaceid: MutPtr<RpcSyntaxIdentifier>, pprocnum: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcMesInqProcEncodingId(handle.rawAddress.toString(), pinterfaceid.rawAddress.toString(), pprocnum.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRCContextBinding(ccontext: Long): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRCContextBinding(ccontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRCContextMarshall(ccontext.toString(), pbuff.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRCContextUnmarshall(pccontext: MutPtr<Long>, hbinding: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRCContextUnmarshall(pccontext.rawAddress.toString(), hbinding.rawAddress.toString(), pbuff.rawAddress.toString(), datarepresentation.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshall(ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRSContextMarshall(ccontext.rawAddress.toString(), pbuff.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshall2(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown, ctxguard: ConstPtr<CVoid>, flags: UInt) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRSContextMarshall2(bindinghandle.rawAddress.toString(), ccontext.rawAddress.toString(), pbuff.rawAddress.toString(), 0L.toString(), ctxguard.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshallEx(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRSContextMarshallEx(bindinghandle.rawAddress.toString(), ccontext.rawAddress.toString(), pbuff.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextUnmarshall(pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRSContextUnmarshall(pbuff.rawAddress.toString(), datarepresentation.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRSContextUnmarshall2(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt, ctxguard: ConstPtr<CVoid>, flags: UInt): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRSContextUnmarshall2(bindinghandle.rawAddress.toString(), pbuff.rawAddress.toString(), datarepresentation.toInt(), ctxguard.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRSContextUnmarshallEx(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx(bindinghandle.rawAddress.toString(), pbuff.rawAddress.toString(), datarepresentation.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64AsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64AsyncServerCall64(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdr64AsyncServerCall64(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndr64AsyncServerCallAll(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64DcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAllocate(pstubmsg: MutPtr<MidlStubMessage>, len: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrAllocate(pstubmsg.rawAddress.toString(), len.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAsyncServerCall(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrAsyncServerCall(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrByteCountPointerFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClearOutParameters(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, argaddr: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrClearOutParameters(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString(), argaddr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientCall2(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClientCall3(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClientContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: Long, fcheck: Int) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrClientContextMarshall(pstubmsg.rawAddress.toString(), contexthandle.toString(), fcheck)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pcontexthandle: MutPtr<Long>, bindhandle: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrClientContextUnmarshall(pstubmsg.rawAddress.toString(), pcontexthandle.rawAddress.toString(), bindhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrClientInitialize(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), procnum.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrClientInitializeNew(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), procnum.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStringBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStringMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStringMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrContextHandleInitialize(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrContextHandleInitialize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrContextHandleSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrContextHandleSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConvert(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConvert(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConvert2(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, numberparams: Int) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrConvert2(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString(), numberparams)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationFree(pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrCorrelationFree(pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationInitialize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>, cachesize: UInt, flags: UInt) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrCorrelationInitialize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), cachesize.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationPass(pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrCorrelationPass(pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCreateServerInterfaceFromStub(pstub: MutPtr<CVoid>, pserverif: MutPtr<RpcServerInterface>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub(pstub.rawAddress.toString(), pserverif.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrDcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFixedArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFixedArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFixedArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFixedArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFreeBuffer(pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFreeBuffer(pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFullPointerXlatFree(pxlattables: MutPtr<FullPtrXlatTables>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFullPointerXlatFree(pxlattables.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): MutPtr<FullPtrXlatTables> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrFullPointerXlatInit(numberofpointers.toInt(), xlatside) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrGetBuffer(pstubmsg.rawAddress.toString(), bufferlength.toInt(), handle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetDcomProtocolVersion(pstubmsg: MutPtr<MidlStubMessage>, pversion: MutPtr<RpcVersion>): Hresult =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion(pstubmsg.rawAddress.toString(), pversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetUserMarshalInfo(pflags: ConstPtr<UInt>, informationlevel: UInt, pmarshalinfo: MutPtr<NdrUserMarshalInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo(pflags.rawAddress.toString(), informationlevel.toInt(), pmarshalinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrInterfacePointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrInterfacePointerFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrInterfacePointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMapCommAndFaultStatus(pstubmsg: MutPtr<MidlStubMessage>, pcommstatus: MutPtr<UInt>, pfaultstatus: MutPtr<UInt>, status: RpcStatus): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus(pstubmsg.rawAddress.toString(), pcommstatus.rawAddress.toString(), pfaultstatus.rawAddress.toString(), status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesProcEncodeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesProcEncodeDecode2(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesProcEncodeDecode3(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeAlignSize(param0: MutPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize(param0.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>): ULong =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll(handle.rawAddress.toString(), pproxyinfo.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeDecode(handle: MutPtr<CVoid>, pobject: MutPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode(handle.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeDecodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: MutPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll(handle.rawAddress.toString(), pproxyinfo.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pobject: ConstPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeEncodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: ConstPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll(handle.rawAddress.toString(), pproxyinfo.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeAlignSize(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeAlignSize2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeAlignSize3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeDecode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeDecode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeDecode2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeDecode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeDecode3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeEncode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeEncode2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeEncode3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeFree2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeFree2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeFree3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrMesTypeFree3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNsGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNsGetBuffer(pstubmsg.rawAddress.toString(), bufferlength.toInt(), handle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNsSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>, pautohandle: MutPtr<MutPtr<CVoid>>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrNsSendReceive(pstubmsg.rawAddress.toString(), pbufferend.rawAddress.toString(), pautohandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrOleAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrOleAllocate(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrOleFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrOleFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPointerBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPointerFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPointerMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrPointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPointerMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrPointerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRangeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRangeUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSmClientAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSmClientFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRpcSmClientFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSmSetClientToOsf(pmessage: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf(pmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsDefaultAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSsDefaultFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsDisableAllocate(pmessage: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate(pmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsEnableAllocate(pmessage: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate(pmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSendReceive(pstubmsg.rawAddress.toString(), pbufferend.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerCall2(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerCall2(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerCallAll(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerCallAll(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerCallNdr64(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerCallNdr64(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerContextMarshall(pstubmsg.rawAddress.toString(), contexthandle.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextNewMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerContextNewMarshall(pstubmsg.rawAddress.toString(), contexthandle.rawAddress.toString(), 0L.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextNewUnmarshall(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerContextUnmarshall(pstubmsg.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerInitialize(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitializeMarshall(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerInitializeMarshall(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerInitializeNew(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitializePartial(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, requestedbuffersize: UInt) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerInitializePartial(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), requestedbuffersize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerInitializeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, prpcmsg: MutPtr<RpcMessage>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall(pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), prpcmsg.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSimpleStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSimpleStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleTypeMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), formatchar.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), formatchar.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrStubCall2(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrStubCall2(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrStubCall3(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrStubCall3(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrUserMarshalFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrUserMarshalFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrUserMarshalMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrUserMarshalMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: MutPtr<UInt>, pbuffer: MutPtr<UByte>, formatchar: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert(pflags.rawAddress.toString(), pbuffer.rawAddress.toString(), formatchar.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrVaryingArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrXmitOrRepAsFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncAbortCall(pasync: MutPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcAsyncAbortCall(pasync.rawAddress.toString(), exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncCancelCall(pasync: MutPtr<RpcAsyncState>, fabort: Bool): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcAsyncCancelCall(pasync.rawAddress.toString(), fabort) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncCompleteCall(pasync: MutPtr<RpcAsyncState>, reply: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcAsyncCompleteCall(pasync.rawAddress.toString(), reply.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncGetCallStatus(pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus(pasync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncInitializeHandle(pasync: MutPtr<RpcAsyncState>, size: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle(pasync.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncRegisterInfo(pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo(pasync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingBind(pasync: ConstPtr<RpcAsyncState>, binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingBind(pasync.rawAddress.toString(), binding.rawAddress.toString(), ifspec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCopy(sourcebinding: ConstPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingCopy(sourcebinding.rawAddress.toString(), destinationbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCreateA(template: ConstPtr<RpcBindingHandleTemplateV1A>, security: ConstPtr<RpcBindingHandleSecurityV1A>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingCreateA(template.rawAddress.toString(), security.rawAddress.toString(), options.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCreateW(template: ConstPtr<RpcBindingHandleTemplateV1W>, security: ConstPtr<RpcBindingHandleSecurityV1W>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingCreateW(template.rawAddress.toString(), security.rawAddress.toString(), options.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFree(binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingFree(binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA(stringbinding.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW(stringbinding.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientExA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientExW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString(), rpcqosversion.toInt(), securityqos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString(), rpcqosversion.toInt(), securityqos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqMaxCalls(binding: ConstPtr<CVoid>, maxcalls: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls(binding.rawAddress.toString(), maxcalls.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqObject(binding: ConstPtr<CVoid>, objectuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqObject(binding.rawAddress.toString(), objectuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqOption(hbinding: ConstPtr<CVoid>, option: UInt, poptionvalue: MutPtr<ULong>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingInqOption(hbinding.rawAddress.toString(), option.toInt(), poptionvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingReset(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingReset(binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingServerFromClient(clientbinding: ConstPtr<CVoid>, serverbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingServerFromClient(clientbinding.rawAddress.toString(), serverbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt(), securityqos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt(), securityqos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetObject(binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingSetObject(binding.rawAddress.toString(), objectuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingSetOption(hbinding.rawAddress.toString(), option.toInt(), optionvalue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingToStringBindingA(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingToStringBindingA(binding.rawAddress.toString(), stringbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingToStringBindingW(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingToStringBindingW(binding.rawAddress.toString(), stringbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingUnbind(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingUnbind(binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingVectorFree(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcBindingVectorFree(bindingvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCancelThread(thread: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcCancelThread(thread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCancelThreadEx(thread: ConstPtr<CVoid>, timeout: Int): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcCancelThreadEx(thread.rawAddress.toString(), timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCertGeneratePrincipalNameA(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA(context.rawAddress.toString(), flags.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCertGeneratePrincipalNameW(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW(context.rawAddress.toString(), flags.toInt(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcEpRegisterA(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterNoReplaceA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterNoReplaceW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcEpRegisterW(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpResolveBinding(binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcEpResolveBinding(binding.rawAddress.toString(), ifspec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpUnregister(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcEpUnregister(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorAddRecord(errorinfo: ConstPtr<RpcExtendedErrorInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorAddRecord(errorinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorClearInformation() {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorClearInformation()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcErrorEndEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorEndEnumeration(enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorGetNextRecord(enumhandle: ConstPtr<RpcErrorEnumHandle>, copystrings: Bool, errorinfo: MutPtr<RpcExtendedErrorInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorGetNextRecord(enumhandle.rawAddress.toString(), copystrings, errorinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorGetNumberOfRecords(enumhandle: ConstPtr<RpcErrorEnumHandle>, records: MutPtr<Int>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords(enumhandle.rawAddress.toString(), records.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorLoadErrorInfo(errorblob: ConstPtr<CVoid>, blobsize: ULong, enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo(errorblob.rawAddress.toString(), blobsize.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorResetEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorResetEnumeration(enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorSaveErrorInfo(enumhandle: ConstPtr<RpcErrorEnumHandle>, errorblob: MutPtr<MutPtr<CVoid>>, blobsize: MutPtr<ULong>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo(enumhandle.rawAddress.toString(), errorblob.rawAddress.toString(), blobsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorStartEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcErrorStartEnumeration(enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcExceptionFilter(exceptioncode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext(pauthzclientcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcGetAuthorizationContextForClient(clientbinding: ConstPtr<CVoid>, impersonateonreturn: Bool, reserved1: ConstPtr<CVoid>, pexpirationtime: ConstPtr<Long>, reserved2: Luid, reserved3: UInt, reserved4: ConstPtr<CVoid>, pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcIfIdVectorFree(ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcIfIdVectorFree(ifidvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcIfInqId(rpcifhandle: ConstPtr<CVoid>, rpcifid: MutPtr<RpcIfId>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcIfInqId(rpcifhandle.rawAddress.toString(), rpcifid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClient(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcImpersonateClient(bindinghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClient2(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcImpersonateClient2(bindinghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClientContainer(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcImpersonateClientContainer(bindinghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqBegin(epbinding: ConstPtr<CVoid>, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuid: ConstPtr<Guid>, inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin(epbinding.rawAddress.toString(), inquirytype.toInt(), ifid.rawAddress.toString(), versoption.toInt(), objectuuid.rawAddress.toString(), inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqDone(inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone(inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), binding.rawAddress.toString(), objectuuid.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), binding.rawAddress.toString(), objectuuid.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpUnregister(epbinding: ConstPtr<CVoid>, ifid: ConstPtr<RpcIfId>, binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtEpUnregister(epbinding.rawAddress.toString(), ifid.rawAddress.toString(), binding.rawAddress.toString(), objectuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqComTimeout(binding: ConstPtr<CVoid>, timeout: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout(binding.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel(authnsvc.toInt(), authnlevel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqIfIds(binding: ConstPtr<CVoid>, ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtInqIfIds(binding.rawAddress.toString(), ifidvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqServerPrincNameA(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA(binding.rawAddress.toString(), authnsvc.toInt(), serverprincname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqServerPrincNameW(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW(binding.rawAddress.toString(), authnsvc.toInt(), serverprincname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqStats(binding: ConstPtr<CVoid>, statistics: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtInqStats(binding.rawAddress.toString(), statistics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtIsServerListening(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtIsServerListening(binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(timeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetComTimeout(binding: ConstPtr<CVoid>, timeout: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout(binding.rawAddress.toString(), timeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(threadstacksize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtStatsVectorFree(statsvector: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree(statsvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtStopServerListening(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtStopServerListening(binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkInqProtseqsA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA(protseqvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkInqProtseqsW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW(protseqvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA(protseq.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW(protseq.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingExportA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), bindingvec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingExportW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), bindingvec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), importcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), importcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportDone(importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingImportDone(importcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportNext(importcontext: MutPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingImportNext(importcontext.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingInqEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingInqEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), bindingmaxcount.toInt(), lookupcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), bindingmaxcount.toInt(), lookupcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupDone(lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingLookupDone(lookupcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupNext(lookupcontext: MutPtr<CVoid>, bindingvec: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingLookupNext(lookupcontext.rawAddress.toString(), bindingvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingSelect(bindingvec: MutPtr<RpcBindingVector>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingSelect(bindingvec.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), expandedname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), expandedname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone(inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqNext(inquirycontext: MutPtr<CVoid>, objuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext(inquirycontext.rawAddress.toString(), objuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupDeleteA(groupnamesyntax.toInt(), groupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupDeleteW(groupnamesyntax.toInt(), groupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone(inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA(inquirycontext.rawAddress.toString(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW(inquirycontext.rawAddress.toString(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifid.rawAddress.toString(), versoption.toInt(), objectuuidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifid.rawAddress.toString(), versoption.toInt(), objectuuidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA(entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW(entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA(entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW(entrynamesyntax.toInt(), entryname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifidvec.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: MutPtr<CVoid>, expirationage: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge(nshandle.rawAddress.toString(), expirationage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtInqExpAge(expirationage: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge(expirationage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(expirationage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileDeleteA(profilenamesyntax.toInt(), profilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileDeleteW(profilenamesyntax.toInt(), profilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltAddA(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString(), priority.toInt(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltAddW(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString(), priority.toInt(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA(profilenamesyntax.toInt(), profilename.rawAddress.toString(), inquirytype.toInt(), ifid.rawAddress.toString(), versoption.toInt(), membernamesyntax.toInt(), membername.rawAddress.toString(), inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW(profilenamesyntax.toInt(), profilename.rawAddress.toString(), inquirytype.toInt(), ifid.rawAddress.toString(), versoption.toInt(), membernamesyntax.toInt(), membername.rawAddress.toString(), inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone(inquirycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqNextA(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), membername.rawAddress.toString(), priority.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqNextW(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pwstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), membername.rawAddress.toString(), priority.rawAddress.toString(), annotation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectInqType(objuuid: ConstPtr<Guid>, typeuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcObjectInqType(objuuid.rawAddress.toString(), typeuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcObjectSetInqFn(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectSetType(objuuid: ConstPtr<Guid>, typeuuid: ConstPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcObjectSetType(objuuid.rawAddress.toString(), typeuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcProtseqVectorFreeA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA(protseqvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcProtseqVectorFreeW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW(protseqvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRaiseException(exception: RpcStatus) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcRaiseException(exception)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRevertToSelf(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcRevertToSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRevertToSelfEx(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcRevertToSelfEx(bindinghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: ConstPtr<CVoid>, status: RpcStatus): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback(bindinghandle.rawAddress.toString(), status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindingHandle(binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqBindingHandle(binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindings(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqBindings(bindingvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindingsEx(securitydescriptor: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqBindingsEx(securitydescriptor.rawAddress.toString(), bindingvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqCallAttributesA(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA(clientbinding.rawAddress.toString(), rpccallattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqCallAttributesW(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW(clientbinding.rawAddress.toString(), rpccallattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA(authnsvc.toInt(), princname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW(authnsvc.toInt(), princname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInqIf(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupActivate(ifgroup: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate(ifgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupClose(ifgroup: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose(ifgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupCreateA(interfaces: ConstPtr<RpcInterfaceTemplatea>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatea>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA(interfaces.rawAddress.toString(), numifs.toInt(), endpoints.rawAddress.toString(), numendpoints.toInt(), idleperiod.toInt(), 0L.toString(), idlecallbackcontext.rawAddress.toString(), ifgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupCreateW(interfaces: ConstPtr<RpcInterfaceTemplatew>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatew>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW(interfaces.rawAddress.toString(), numifs.toInt(), endpoints.rawAddress.toString(), numendpoints.toInt(), idleperiod.toInt(), 0L.toString(), idlecallbackcontext.rawAddress.toString(), ifgroup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: ConstPtr<CVoid>, forcedeactivation: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate(ifgroup.rawAddress.toString(), forcedeactivation.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings(ifgroup.rawAddress.toString(), bindingvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA(serverprincname.rawAddress.toString(), authnsvc.toInt(), 0L.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW(serverprincname.rawAddress.toString(), authnsvc.toInt(), 0L.toString(), arg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerRegisterIf(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf2(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerRegisterIf2(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf3(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerRegisterIf3(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerRegisterIfEx(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString(), flags.toInt(), maxcalls.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerSubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: ConstPtr<RpcAsyncNotificationInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification(binding.rawAddress.toString(), notification, notificationtype, notificationinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerTestCancel(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerTestCancel(bindinghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnregisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, waitforcallstocomplete: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUnregisterIf(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), waitforcallstocomplete.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnregisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, rundowncontexthandles: Int): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), rundowncontexthandles) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnsubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationsqueued: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification(binding.rawAddress.toString(), notification, notificationsqueued.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs(maxcalls.toInt(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx(maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf(maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx(maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqA(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqExA(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqExW(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerUseProtseqW(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerYield() {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcServerYield()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSmAllocate(size: ULong, pstatus: MutPtr<RpcStatus>): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmAllocate(size.toString(), pstatus.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmClientFree(pnodetofree: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmClientFree(pnodetofree.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmDestroyClientContext(contexthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmDisableAllocate(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmDisableAllocate() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmEnableAllocate(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmEnableAllocate() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmFree(nodetofree: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmFree(nodetofree.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmGetThreadHandle(pstatus: MutPtr<RpcStatus>): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmGetThreadHandle(pstatus.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree(0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSetThreadHandle(id: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmSetThreadHandle(id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree(0L.toString(), 0L.toString(), oldclientalloc.rawAddress.toString(), oldclientfree.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsAllocate(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsContextLockExclusive(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsContextLockExclusive(serverbindinghandle.rawAddress.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsContextLockShared(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsContextLockShared(serverbindinghandle.rawAddress.toString(), usercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsDestroyClientContext(contexthandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsDisableAllocate() {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsDisableAllocate()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsDontSerializeContext() {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsDontSerializeContext()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsEnableAllocate() {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsEnableAllocate()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsGetContextBinding(contexthandle: ConstPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsGetContextBinding(contexthandle.rawAddress.toString(), binding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsGetThreadHandle(): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAddon != null) MutPtr((windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsGetThreadHandle() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsSetThreadHandle(id: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsSetThreadHandle(id.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree(0L.toString(), 0L.toString(), oldclientalloc.rawAddress.toString(), oldclientfree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcStringBindingComposeA(objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), options.rawAddress.toString(), stringbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcStringBindingComposeW(objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), options.rawAddress.toString(), stringbinding.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: MutPtr<Pstr>, protseq: MutPtr<Pstr>, networkaddr: MutPtr<Pstr>, endpoint: MutPtr<Pstr>, networkoptions: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcStringBindingParseA(stringbinding.rawAddress.toString(), objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), networkoptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: MutPtr<Pwstr>, protseq: MutPtr<Pwstr>, networkaddr: MutPtr<Pwstr>, endpoint: MutPtr<Pwstr>, networkoptions: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcStringBindingParseW(stringbinding.rawAddress.toString(), objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), networkoptions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringFreeA(string: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcStringFreeA(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringFreeW(string: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcStringFreeW(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcTestCancel(): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcTestCancel() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcUserFree(asynchandle: MutPtr<CVoid>, pbuffer: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAddon != null) {
        windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcRpcUserFree(asynchandle.rawAddress.toString(), pbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uuidCompare(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidCompare(uuid1.rawAddress.toString(), uuid2.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreate(uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidCreate(uuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreateNil(niluuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidCreateNil(niluuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreateSequential(uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidCreateSequential(uuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidEqual(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidEqual(uuid1.rawAddress.toString(), uuid2.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidFromStringA(stringuuid.rawAddress.toString(), uuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidFromStringW(stringuuid.rawAddress.toString(), uuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidHash(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): UShort =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidHash(uuid.rawAddress.toString(), status.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidIsNil(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidIsNil(uuid.rawAddress.toString(), status.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidToStringA(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidToStringA(uuid.rawAddress.toString(), stringuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidToStringW(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAddon != null) (windowsWin32SystemRpcNapiAddon.windowssysWindowsWin32SystemRpcUuidToStringW(uuid.rawAddress.toString(), stringuuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
