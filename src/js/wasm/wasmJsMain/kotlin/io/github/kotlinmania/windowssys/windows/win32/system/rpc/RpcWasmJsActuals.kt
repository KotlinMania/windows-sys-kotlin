@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemRpcNapiAddon(): Boolean

private val windowsWin32SystemRpcNapiAvailable: Boolean = initWindowsWin32SystemRpcNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcDceErrorInqTextA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcDceErrorInqTextA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcDceErrorInqTextW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcDceErrorInqTextW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIunknownAddRefProxy(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIunknownAddRefProxy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIunknownReleaseProxy(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIunknownReleaseProxy(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcAllocate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcAllocate(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcAsyncAbortCall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcAsyncAbortCall(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcAsyncSetHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcAsyncSetHandle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingCopy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingCreateNp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingCreateNp(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqTransportType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqTransportType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcClearMutex(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcClearMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcDeleteMutex(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcDeleteMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcExceptionFilter(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcExceptionFilter(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcFreeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcFreeBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcFreePipeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcFreePipeBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcGetBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcGetBuffer(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcGetBufferWithObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcGetBufferWithObject(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcGetDefaultSd(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcGetDefaultSd(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcGetExtendedError()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcGetExtendedError(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcMapWin32Status(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcMapWin32Status(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNsGetBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNsGetBuffer(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNsInterfaceExported(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNsInterfaceExported(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNsRaiseException(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNsRaiseException(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcNsSendReceive(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcNsSendReceive(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcOpenClientProcess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcOpenClientProcess(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcPauseExecution(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcPauseExecution(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcReBindBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcReBindBuffer(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcReceive(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcReceive(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure(p0: Int, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcRequestMutex(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcRequestMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcSend(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcSend(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcSendReceive(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcSendReceive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerGetAssociationId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerGetAssociationId(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerInqTransportType(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerInqTransportType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerStartService(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerStartService(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation()")
private external fun wasmWindowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcIUuidCreate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcIUuidCreate(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesBufferHandleReset(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesBufferHandleReset(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesHandleFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesHandleFree(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesIncrementalHandleReset(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesIncrementalHandleReset(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcMesInqProcEncodingId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcMesInqProcEncodingId(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRCContextBinding(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRCContextBinding(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRCContextMarshall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRCContextMarshall(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRCContextUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRCContextUnmarshall(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRSContextMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRSContextMarshall(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRSContextMarshall2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRSContextMarshall2(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRSContextMarshallEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRSContextMarshallEx(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRSContextUnmarshall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRSContextUnmarshall(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRSContextUnmarshall2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRSContextUnmarshall2(p0: String, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdr64AsyncServerCall64(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdr64AsyncServerCall64(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrAllocate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrAllocate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrAsyncServerCall(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrAsyncServerCall(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrByteCountPointerFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrClearOutParameters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrClearOutParameters(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrClientContextMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrClientContextMarshall(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrClientContextUnmarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrClientContextUnmarshall(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrClientInitialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrClientInitialize(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrClientInitializeNew(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrClientInitializeNew(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexArrayFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexArrayMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexStructBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexStructBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexStructFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexStructFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexStructMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexStructMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexStructMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexStructMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantArrayFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantArrayMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStringBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStringBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStringMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStringMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStringMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStringMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStructBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStructBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStructFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStructFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStructMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStructMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStructMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStructMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrContextHandleInitialize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrContextHandleInitialize(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrContextHandleSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrContextHandleSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConvert(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConvert(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrConvert2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrConvert2(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrCorrelationFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrCorrelationFree(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrCorrelationInitialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrCorrelationInitialize(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrCorrelationPass(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrCorrelationPass(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFixedArrayFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFixedArrayMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFreeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFreeBuffer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFullPointerXlatFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFullPointerXlatFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrFullPointerXlatInit(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrFullPointerXlatInit(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrGetBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrGetBuffer(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrInterfacePointerFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeAlignSize(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeDecode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeDecode(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeDecode2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeDecode2(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeDecode3(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeDecode3(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeEncode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeEncode(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeEncode2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeEncode2(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeEncode3(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeEncode3(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeFree2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeFree2(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrMesTypeFree3(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrMesTypeFree3(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNsGetBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNsGetBuffer(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrNsSendReceive(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrNsSendReceive(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrOleAllocate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrOleAllocate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrOleFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrOleFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPointerBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPointerBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPointerFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPointerFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPointerMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPointerMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPointerMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPointerMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrPointerUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrPointerUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRangeUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRangeUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRpcSmClientFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRpcSmClientFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSendReceive(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSendReceive(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerCall2(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerCall2(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerCallAll(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerCallAll(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerCallNdr64(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerCallNdr64(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerContextMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerContextMarshall(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerContextNewMarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerContextNewMarshall(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerContextUnmarshall(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerContextUnmarshall(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerInitialize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerInitialize(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerInitializeMarshall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerInitializeMarshall(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerInitializeNew(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerInitializeNew(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerInitializePartial(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerInitializePartial(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSimpleStructFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSimpleStructMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrStubCall2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrStubCall2(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrStubCall3(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrStubCall3(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrUserMarshalFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrUserMarshalMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrVaryingArrayFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcAsyncAbortCall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcAsyncAbortCall(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcAsyncCancelCall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcAsyncCancelCall(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcAsyncCompleteCall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcAsyncCompleteCall(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingBind(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingBind(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingCopy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingCopy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingCreateA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingCreateA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingCreateW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingCreateW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqObject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingInqOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingInqOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingReset(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingReset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingServerFromClient(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingServerFromClient(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingSetObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingSetObject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingSetOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingSetOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingToStringBindingA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingToStringBindingA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingToStringBindingW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingToStringBindingW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingUnbind(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingUnbind(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcBindingVectorFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcBindingVectorFree(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcCancelThread(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcCancelThread(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcCancelThreadEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcCancelThreadEx(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcEpRegisterA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcEpRegisterW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcEpResolveBinding(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcEpResolveBinding(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcEpUnregister(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcEpUnregister(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorAddRecord(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorAddRecord(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorClearInformation()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorClearInformation()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorEndEnumeration(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorEndEnumeration(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorGetNextRecord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorGetNextRecord(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorResetEnumeration(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorResetEnumeration(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcErrorStartEnumeration(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcErrorStartEnumeration(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcExceptionFilter(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcExceptionFilter(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcIfIdVectorFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcIfIdVectorFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcIfInqId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcIfInqId(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcImpersonateClient(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcImpersonateClient(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcImpersonateClient2(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcImpersonateClient2(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcImpersonateClientContainer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcImpersonateClientContainer(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtEpUnregister(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpUnregister(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtInqIfIds(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqIfIds(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtInqStats(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqStats(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtIsServerListening(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtIsServerListening(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtStopServerListening(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtStopServerListening(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingExportA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportA(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingExportW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportW(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingImportDone(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportDone(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingImportNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportNext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingLookupDone(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupDone(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingLookupNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupNext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingSelect(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingSelect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsBindingUnexportW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupDeleteA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupDeleteA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupDeleteW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupDeleteW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileDeleteA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileDeleteA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileDeleteW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileDeleteW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltAddA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltAddA(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltAddW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltAddW(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcObjectInqType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcObjectInqType(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcObjectSetInqFn(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcObjectSetInqFn(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcObjectSetType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcObjectSetType(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcRaiseException(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcRaiseException(p0: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcRevertToSelf()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcRevertToSelf(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcRevertToSelfEx(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcRevertToSelfEx(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqBindingHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqBindingHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqBindings(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqBindings(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqBindingsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqBindingsEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInqIf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInqIf(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerListen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerListen(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerRegisterIf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerRegisterIf2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIf2(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerRegisterIf3(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIf3(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerRegisterIfEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIfEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerTestCancel(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerTestCancel(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUnregisterIf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUnregisterIf(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqExA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqExW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerUseProtseqW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqW(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcServerYield()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcServerYield()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmAllocate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmAllocate(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmClientFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmClientFree(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmDestroyClientContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmDestroyClientContext(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmDisableAllocate()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmDisableAllocate(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmEnableAllocate()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmEnableAllocate(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmFree(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmGetThreadHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmGetThreadHandle(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmSetThreadHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmSetThreadHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsAllocate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsAllocate(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsContextLockExclusive(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsContextLockExclusive(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsContextLockShared(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsContextLockShared(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsDestroyClientContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsDestroyClientContext(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsDisableAllocate()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsDisableAllocate()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsDontSerializeContext()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsDontSerializeContext()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsEnableAllocate()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsEnableAllocate()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsGetContextBinding(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsGetContextBinding(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsGetThreadHandle()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsGetThreadHandle(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsSetThreadHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsSetThreadHandle(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcStringBindingComposeA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcStringBindingComposeA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcStringBindingComposeW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcStringBindingComposeW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcStringBindingParseA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcStringBindingParseA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcStringBindingParseW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcStringBindingParseW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcStringFreeA(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcStringFreeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcStringFreeW(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcStringFreeW(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcTestCancel()")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcTestCancel(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcRpcUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcRpcUserFree(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidCompare(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidCompare(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidCreate(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidCreateNil(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidCreateNil(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidCreateSequential(p0)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidCreateSequential(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidEqual(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidEqual(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidFromStringA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidFromStringA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidFromStringW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidFromStringW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidHash(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidHash(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidIsNil(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidIsNil(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidToStringA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidToStringA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRpcUuidToStringW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRpcUuidToStringW(p0: String, p1: String): Int

public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcDceErrorInqTextA(rpcstatus, errortext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcDceErrorInqTextW(rpcstatus, errortext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownAddRefProxy(thisRef: MutPtr<CVoid>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIunknownAddRefProxy(thisRef.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownQueryInterfaceProxy(thisRef: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy(thisRef.rawAddress.toString(), riid.rawAddress.toString(), ppvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownReleaseProxy(thisRef: MutPtr<CVoid>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIunknownReleaseProxy(thisRef.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAllocate(size: UInt): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcIRpcAllocate(size.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAsyncAbortCall(pasync: ConstPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcAsyncAbortCall(pasync.rawAddress.toString(), exceptioncode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcAsyncSetHandle(message: ConstPtr<RpcMessage>, pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcAsyncSetHandle(message.rawAddress.toString(), pasync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingCopy(sourcebinding: MutPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingCopy(sourcebinding.rawAddress.toString(), destinationbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingCreateNp(servername.rawAddress.toString(), servicename.rawAddress.toString(), networkoptions.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingHandleToAsyncHandle(binding: MutPtr<CVoid>, asynchandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle(binding.rawAddress.toString(), asynchandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqClientTokenAttributes(binding: ConstPtr<CVoid>, tokenid: MutPtr<Luid>, authenticationid: MutPtr<Luid>, modifiedid: MutPtr<Luid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes(binding.rawAddress.toString(), tokenid.rawAddress.toString(), authenticationid.rawAddress.toString(), modifiedid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqDynamicEndpointA(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA(binding.rawAddress.toString(), dynamicendpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqDynamicEndpointW(binding: ConstPtr<CVoid>, dynamicendpoint: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW(binding.rawAddress.toString(), dynamicendpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqLocalClientPid(binding: MutPtr<CVoid>, pid: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid(binding.rawAddress.toString(), pid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: ConstPtr<CVoid>, marshalledtargetinfosize: MutPtr<UInt>, marshalledtargetinfo: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo(binding.rawAddress.toString(), marshalledtargetinfosize.rawAddress.toString(), marshalledtargetinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqSecurityContext(binding: MutPtr<CVoid>, securitycontexthandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext(binding.rawAddress.toString(), securitycontexthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: ConstPtr<CVoid>, keyinfo: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo(binding.rawAddress.toString(), keyinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqTransportType(binding: MutPtr<CVoid>, type: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqTransportType(binding.rawAddress.toString(), type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingInqWireIdForSnego(binding: ConstPtr<CVoid>, wireid: MutPtr<UByte>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego(binding.rawAddress.toString(), wireid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingIsClientLocal(bindinghandle: MutPtr<CVoid>, clientlocalflag: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal(bindinghandle.rawAddress.toString(), clientlocalflag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingIsServerLocal(binding: ConstPtr<CVoid>, serverlocalflag: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal(binding.rawAddress.toString(), serverlocalflag.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingSetPrivateOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption(hbinding.rawAddress.toString(), option.toInt(), optionvalue.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcBindingToStaticStringBindingW(binding: MutPtr<CVoid>, stringbinding: MutPtr<MutPtr<UShort>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW(binding.rawAddress.toString(), stringbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcClearMutex(mutex: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcClearMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcDeleteMutex(mutex: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcDeleteMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcExceptionFilter(exceptioncode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcFree(obj: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcFree(obj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcFreeBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcFreeBuffer(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcFreePipeBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcFreePipeBuffer(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcGetBuffer(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetBufferWithObject(message: MutPtr<RpcMessage>, objectuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcGetBufferWithObject(message.rawAddress.toString(), objectuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetCurrentCallHandle(): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcGetDefaultSd(ppsecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcGetExtendedError(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcGetExtendedError() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: MutPtr<CVoid>, transfersyntaxes: MutPtr<RpcTransferSyntax>, transfersyntaxsize: UInt, transfersyntaxcount: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes(rpcifhandle.rawAddress.toString(), transfersyntaxes.rawAddress.toString(), transfersyntaxsize.toInt(), transfersyntaxcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcMapWin32Status(status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNegotiateTransferSyntax(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsBindingSetEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsBindingSetEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsGetBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcNsGetBuffer(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: ConstPtr<UShort>, rpcinterfaceinformation: ConstPtr<RpcServerInterface>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcNsInterfaceExported(entrynamesyntax.toInt(), entryname.rawAddress.toString(), rpcinterfaceinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: MutPtr<UShort>, rpcinterfaceinformation: MutPtr<RpcServerInterface>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported(entrynamesyntax.toInt(), entryname.rawAddress.toString(), rpcinterfaceinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcNsRaiseException(message: MutPtr<RpcMessage>, status: RpcStatus) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcNsRaiseException(message.rawAddress.toString(), status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcNsSendReceive(message: MutPtr<RpcMessage>, handle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcNsSendReceive(message.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcOpenClientProcess(binding: ConstPtr<CVoid>, desiredaccess: UInt, clientprocess: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcOpenClientProcess(binding.rawAddress.toString(), desiredaccess.toInt(), clientprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcPauseExecution(milliseconds: UInt) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcPauseExecution(milliseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcReBindBuffer(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcReBindBuffer(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcReallocPipeBuffer(message: ConstPtr<RpcMessage>, newsize: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer(message.rawAddress.toString(), newsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcReceive(message: MutPtr<RpcMessage>, size: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcReceive(message.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: MutPtr<RdrCalloutState>, dllname: MutPtr<UShort>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure(rpcstatus, calloutstate.rawAddress.toString(), dllname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcRequestMutex(mutex: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcRequestMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSend(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcSend(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcSendReceive(message: MutPtr<RpcMessage>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcSendReceive(message.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerCheckClientRestriction(context: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction(context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerDisableExceptionFilter(): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerGetAssociationId(binding: ConstPtr<CVoid>, associationid: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerGetAssociationId(binding.rawAddress.toString(), associationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqAddressChangeFn(): MutPtr<RpcAddressChangeFn> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqLocalConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress(binding.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString(), addressformat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqRemoteConnAddress(binding: MutPtr<CVoid>, buffer: MutPtr<CVoid>, buffersize: MutPtr<UInt>, addressformat: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress(binding.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString(), addressformat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerInqTransportType(type: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerInqTransportType(type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: MutPtr<RpcForwardFunction>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction(pforwardfunction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: MutPtr<RpcAddressChangeFn>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn(paddresschangefn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerStartService(protseq.rawAddress.toString(), endpoint.rawAddress.toString(), ifspec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification(binding.rawAddress.toString(), hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: ConstPtr<CVoid>, hevent: ConstPtr<CVoid>, subscriptionid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2(binding.rawAddress.toString(), hevent.rawAddress.toString(), subscriptionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: ConstPtr<CVoid>, subscriptionid: Guid): RpcStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W(networkaddress.rawAddress.toString(), protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcSessionStrictContextHandle() {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSsDontSerializeContext() {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iRpcSystemHandleTypeSpecificWork(handle: MutPtr<CVoid>, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork(handle.rawAddress.toString(), actualtype.toInt(), idltype.toInt(), marshaldirection) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iUuidCreate(uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcIUuidCreate(uuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesBufferHandleReset(handle: ConstPtr<CVoid>, handlestyle: UInt, operation: MidlEsCode, pbuffer: ConstPtr<ConstPtr<Byte>>, buffersize: UInt, pencodedsize: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesBufferHandleReset(handle.rawAddress.toString(), handlestyle.toInt(), operation, pbuffer.rawAddress.toString(), buffersize.toInt(), pencodedsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate(buffer.rawAddress.toString(), buffersize.toInt(), phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesDecodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, readfn: MidlEsRead, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate(userstate.rawAddress.toString(), 0L.toString(), phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: MutPtr<MutPtr<Byte>>, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate(pbuffer.rawAddress.toString(), pencodedsize.rawAddress.toString(), phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: MutPtr<UInt>, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate(pbuffer.rawAddress.toString(), buffersize.toInt(), pencodedsize.rawAddress.toString(), phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesEncodeIncrementalHandleCreate(userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate(userstate.rawAddress.toString(), 0L.toString(), 0L.toString(), phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesHandleFree(handle: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesHandleFree(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesIncrementalHandleReset(handle: MutPtr<CVoid>, userstate: MutPtr<CVoid>, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesIncrementalHandleReset(handle.rawAddress.toString(), userstate.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), operation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mesInqProcEncodingId(handle: MutPtr<CVoid>, pinterfaceid: MutPtr<RpcSyntaxIdentifier>, pprocnum: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcMesInqProcEncodingId(handle.rawAddress.toString(), pinterfaceid.rawAddress.toString(), pprocnum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRCContextBinding(ccontext: Long): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNDRCContextBinding(ccontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNDRCContextMarshall(ccontext.toString(), pbuff.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRCContextUnmarshall(pccontext: MutPtr<Long>, hbinding: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNDRCContextUnmarshall(pccontext.rawAddress.toString(), hbinding.rawAddress.toString(), pbuff.rawAddress.toString(), datarepresentation.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshall(ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNDRSContextMarshall(ccontext.rawAddress.toString(), pbuff.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshall2(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown, ctxguard: ConstPtr<CVoid>, flags: UInt) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNDRSContextMarshall2(bindinghandle.rawAddress.toString(), ccontext.rawAddress.toString(), pbuff.rawAddress.toString(), 0L.toString(), ctxguard.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextMarshallEx(bindinghandle: ConstPtr<CVoid>, ccontext: ConstPtr<NdrScontext>, pbuff: MutPtr<CVoid>, userrundownin: NdrRundown) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNDRSContextMarshallEx(bindinghandle.rawAddress.toString(), ccontext.rawAddress.toString(), pbuff.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun nDRSContextUnmarshall(pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNDRSContextUnmarshall(pbuff.rawAddress.toString(), datarepresentation.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRSContextUnmarshall2(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt, ctxguard: ConstPtr<CVoid>, flags: UInt): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNDRSContextUnmarshall2(bindinghandle.rawAddress.toString(), pbuff.rawAddress.toString(), datarepresentation.toInt(), ctxguard.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nDRSContextUnmarshallEx(bindinghandle: ConstPtr<CVoid>, pbuff: ConstPtr<CVoid>, datarepresentation: UInt): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx(bindinghandle.rawAddress.toString(), pbuff.rawAddress.toString(), datarepresentation.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64AsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64AsyncServerCall64(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdr64AsyncServerCall64(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndr64AsyncServerCallAll(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndr64DcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAllocate(pstubmsg: MutPtr<MidlStubMessage>, len: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrAllocate(pstubmsg.rawAddress.toString(), len.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrAsyncServerCall(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrAsyncServerCall(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrByteCountPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClearOutParameters(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, argaddr: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrClearOutParameters(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString(), argaddr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientCall2(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClientCall3(pproxyinfo: MutPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrClientContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: Long, fcheck: Int) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrClientContextMarshall(pstubmsg.rawAddress.toString(), contexthandle.toString(), fcheck)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pcontexthandle: MutPtr<Long>, bindhandle: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrClientContextUnmarshall(pstubmsg.rawAddress.toString(), pcontexthandle.rawAddress.toString(), bindhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrClientInitialize(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), procnum.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrClientInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, procnum: UInt) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrClientInitializeNew(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), procnum.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrComplexStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrComplexStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrComplexStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrComplexStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrComplexStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrComplexStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantStringBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantStringMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrConformantStringMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrConformantStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrContextHandleInitialize(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrContextHandleInitialize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrContextHandleSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrContextHandleSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConvert(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConvert(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrConvert2(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>, numberparams: Int) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrConvert2(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString(), numberparams)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationFree(pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrCorrelationFree(pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationInitialize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>, cachesize: UInt, flags: UInt) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrCorrelationInitialize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), cachesize.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCorrelationPass(pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrCorrelationPass(pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrCreateServerInterfaceFromStub(pstub: MutPtr<CVoid>, pserverif: MutPtr<RpcServerInterface>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub(pstub.rawAddress.toString(), pserverif.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: MutPtr<MidlStubDesc>, pformat: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrDcomAsyncStubCall(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFixedArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFixedArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFixedArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrFreeBuffer(pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrFreeBuffer(pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFullPointerXlatFree(pxlattables: MutPtr<FullPtrXlatTables>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrFullPointerXlatFree(pxlattables.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): MutPtr<FullPtrXlatTables> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrFullPointerXlatInit(numberofpointers.toInt(), xlatside).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrGetBuffer(pstubmsg.rawAddress.toString(), bufferlength.toInt(), handle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetDcomProtocolVersion(pstubmsg: MutPtr<MidlStubMessage>, pversion: MutPtr<RpcVersion>): Hresult =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion(pstubmsg.rawAddress.toString(), pversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrGetUserMarshalInfo(pflags: ConstPtr<UInt>, informationlevel: UInt, pmarshalinfo: MutPtr<NdrUserMarshalInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo(pflags.rawAddress.toString(), informationlevel.toInt(), pmarshalinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrInterfacePointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrInterfacePointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMapCommAndFaultStatus(pstubmsg: MutPtr<MidlStubMessage>, pcommstatus: MutPtr<UInt>, pfaultstatus: MutPtr<UInt>, status: RpcStatus): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus(pstubmsg.rawAddress.toString(), pcommstatus.rawAddress.toString(), pfaultstatus.rawAddress.toString(), status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesProcEncodeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesProcEncodeDecode2(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesProcEncodeDecode3(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, nprocnum: UInt, preturnvalue: MutPtr<CVoid>, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeAlignSize(param0: MutPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize(param0.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>): ULong =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll(handle.rawAddress.toString(), pproxyinfo.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesSimpleTypeDecode(handle: MutPtr<CVoid>, pobject: MutPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode(handle.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeDecodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: MutPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll(handle.rawAddress.toString(), pproxyinfo.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pobject: ConstPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesSimpleTypeEncodeAll(handle: MutPtr<CVoid>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, pobject: ConstPtr<CVoid>, size: Short) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll(handle.rawAddress.toString(), pproxyinfo.rawAddress.toString(), pobject.rawAddress.toString(), size.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeAlignSize(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrMesTypeAlignSize(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeAlignSize2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeAlignSize3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrMesTypeDecode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeDecode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeDecode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeDecode2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeDecode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeDecode3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode(handle: MutPtr<CVoid>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeEncode(handle.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeEncode2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeEncode3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeEncode3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeFree2(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pstubdesc: ConstPtr<MidlStubDesc>, pformatstring: MutPtr<UByte>, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeFree2(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pstubdesc.rawAddress.toString(), pformatstring.rawAddress.toString(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrMesTypeFree3(handle: MutPtr<CVoid>, ppicklinginfo: ConstPtr<MidlTypePicklingInfo>, pproxyinfo: ConstPtr<MidlStublessProxyInfo>, arrtypeoffset: ConstPtr<ConstPtr<UInt>>, ntypeindex: UInt, pobject: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrMesTypeFree3(handle.rawAddress.toString(), ppicklinginfo.rawAddress.toString(), pproxyinfo.rawAddress.toString(), arrtypeoffset.rawAddress.toString(), ntypeindex.toInt(), pobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonConformantStringBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonConformantStringMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonConformantStringMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNsGetBuffer(pstubmsg: MutPtr<MidlStubMessage>, bufferlength: UInt, handle: MutPtr<CVoid>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrNsGetBuffer(pstubmsg.rawAddress.toString(), bufferlength.toInt(), handle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrNsSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>, pautohandle: MutPtr<MutPtr<CVoid>>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrNsSendReceive(pstubmsg.rawAddress.toString(), pbufferend.rawAddress.toString(), pautohandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrOleAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrOleAllocate(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrOleFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrOleFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrPointerBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrPointerFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrPointerMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrPointerMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrPointerMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrPointerMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrPointerUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrPointerUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRangeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrRangeUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSmClientAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSmClientFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrRpcSmClientFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSmSetClientToOsf(pmessage: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf(pmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsDefaultAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrRpcSsDefaultFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsDisableAllocate(pmessage: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate(pmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrRpcSsEnableAllocate(pmessage: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate(pmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSendReceive(pstubmsg: MutPtr<MidlStubMessage>, pbufferend: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrSendReceive(pstubmsg.rawAddress.toString(), pbufferend.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerCall2(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrServerCall2(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerCallAll(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrServerCallAll(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerCallNdr64(prpcmsg: MutPtr<RpcMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrServerCallNdr64(prpcmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrServerContextMarshall(pstubmsg.rawAddress.toString(), contexthandle.rawAddress.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextNewMarshall(pstubmsg: MutPtr<MidlStubMessage>, contexthandle: MutPtr<NdrScontext>, rundownroutine: NdrRundown, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrServerContextNewMarshall(pstubmsg.rawAddress.toString(), contexthandle.rawAddress.toString(), 0L.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerContextNewUnmarshall(pstubmsg: ConstPtr<MidlStubMessage>, pformat: ConstPtr<UByte>): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerContextUnmarshall(pstubmsg: MutPtr<MidlStubMessage>): MutPtr<NdrScontext> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrServerContextUnmarshall(pstubmsg.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitialize(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrServerInitialize(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitializeMarshall(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrServerInitializeMarshall(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerInitializeNew(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrServerInitializeNew(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrServerInitializePartial(prpcmsg: MutPtr<RpcMessage>, pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, requestedbuffersize: UInt) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrServerInitializePartial(prpcmsg.rawAddress.toString(), pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), requestedbuffersize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrServerInitializeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pstubdescriptor: MutPtr<MidlStubDesc>, prpcmsg: MutPtr<RpcMessage>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall(pstubmsg.rawAddress.toString(), pstubdescriptor.rawAddress.toString(), prpcmsg.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleStructFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleStructMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleStructUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrSimpleTypeMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), formatchar.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, formatchar: UByte) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), formatchar.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrStubCall2(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrStubCall2(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrStubCall3(pthis: MutPtr<CVoid>, pchannel: MutPtr<CVoid>, prpcmsg: MutPtr<RpcMessage>, pdwstubphase: MutPtr<UInt>): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrStubCall3(pthis.rawAddress.toString(), pchannel.rawAddress.toString(), prpcmsg.rawAddress.toString(), pdwstubphase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrUserMarshalFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrUserMarshalMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: MutPtr<UInt>, pbuffer: MutPtr<UByte>, formatchar: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert(pflags.rawAddress.toString(), pbuffer.rawAddress.toString(), formatchar.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrUserMarshalUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrVaryingArrayFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrVaryingArrayMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrXmitOrRepAsFree(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: MutPtr<MidlStubMessage>, pmemory: MutPtr<UByte>, pformat: MutPtr<UByte>): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall(pstubmsg.rawAddress.toString(), pmemory.rawAddress.toString(), pformat.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: MutPtr<MidlStubMessage>, pformat: MutPtr<UByte>): UInt =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize(pstubmsg.rawAddress.toString(), pformat.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: MutPtr<MidlStubMessage>, ppmemory: MutPtr<MutPtr<UByte>>, pformat: MutPtr<UByte>, fmustalloc: UByte): MutPtr<UByte> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall(pstubmsg.rawAddress.toString(), ppmemory.rawAddress.toString(), pformat.rawAddress.toString(), fmustalloc.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncAbortCall(pasync: MutPtr<RpcAsyncState>, exceptioncode: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcAsyncAbortCall(pasync.rawAddress.toString(), exceptioncode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncCancelCall(pasync: MutPtr<RpcAsyncState>, fabort: Bool): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcAsyncCancelCall(pasync.rawAddress.toString(), fabort) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncCompleteCall(pasync: MutPtr<RpcAsyncState>, reply: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcAsyncCompleteCall(pasync.rawAddress.toString(), reply.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncGetCallStatus(pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus(pasync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncInitializeHandle(pasync: MutPtr<RpcAsyncState>, size: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle(pasync.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcAsyncRegisterInfo(pasync: ConstPtr<RpcAsyncState>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo(pasync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingBind(pasync: ConstPtr<RpcAsyncState>, binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingBind(pasync.rawAddress.toString(), binding.rawAddress.toString(), ifspec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCopy(sourcebinding: ConstPtr<CVoid>, destinationbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingCopy(sourcebinding.rawAddress.toString(), destinationbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCreateA(template: ConstPtr<RpcBindingHandleTemplateV1A>, security: ConstPtr<RpcBindingHandleSecurityV1A>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingCreateA(template.rawAddress.toString(), security.rawAddress.toString(), options.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingCreateW(template: ConstPtr<RpcBindingHandleTemplateV1W>, security: ConstPtr<RpcBindingHandleSecurityV1W>, options: ConstPtr<RpcBindingHandleOptionsV1>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingCreateW(template.rawAddress.toString(), security.rawAddress.toString(), options.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFree(binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingFree(binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA(stringbinding.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW(stringbinding.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientExA(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientExW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>, flags: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthClientW(clientbinding: ConstPtr<CVoid>, privs: MutPtr<MutPtr<CVoid>>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW(clientbinding.rawAddress.toString(), privs.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authzsvc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString(), rpcqosversion.toInt(), securityqos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>, rpcqosversion: UInt, securityqos: MutPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString(), rpcqosversion.toInt(), securityqos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: MutPtr<Pwstr>, authnlevel: MutPtr<UInt>, authnsvc: MutPtr<UInt>, authidentity: MutPtr<MutPtr<CVoid>>, authzsvc: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.rawAddress.toString(), authnsvc.rawAddress.toString(), authidentity.rawAddress.toString(), authzsvc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqMaxCalls(binding: ConstPtr<CVoid>, maxcalls: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls(binding.rawAddress.toString(), maxcalls.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqObject(binding: ConstPtr<CVoid>, objectuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqObject(binding.rawAddress.toString(), objectuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingInqOption(hbinding: ConstPtr<CVoid>, option: UInt, poptionvalue: MutPtr<ULong>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingInqOption(hbinding.rawAddress.toString(), option.toInt(), poptionvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingReset(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingReset(binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingServerFromClient(clientbinding: ConstPtr<CVoid>, serverbinding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingServerFromClient(clientbinding.rawAddress.toString(), serverbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoExA(binding: ConstPtr<CVoid>, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt(), securityqos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoExW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt, securityqos: ConstPtr<RpcSecurityQos>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt(), securityqos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetAuthInfoW(binding: ConstPtr<CVoid>, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr<CVoid>, authzsvc: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW(binding.rawAddress.toString(), serverprincname.rawAddress.toString(), authnlevel.toInt(), authnsvc.toInt(), authidentity.rawAddress.toString(), authzsvc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetObject(binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingSetObject(binding.rawAddress.toString(), objectuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingSetOption(hbinding: ConstPtr<CVoid>, option: UInt, optionvalue: ULong): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingSetOption(hbinding.rawAddress.toString(), option.toInt(), optionvalue.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingToStringBindingA(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingToStringBindingA(binding.rawAddress.toString(), stringbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingToStringBindingW(binding: ConstPtr<CVoid>, stringbinding: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingToStringBindingW(binding.rawAddress.toString(), stringbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingUnbind(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingUnbind(binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcBindingVectorFree(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcBindingVectorFree(bindingvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCancelThread(thread: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcCancelThread(thread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCancelThreadEx(thread: ConstPtr<CVoid>, timeout: Int): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcCancelThreadEx(thread.rawAddress.toString(), timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCertGeneratePrincipalNameA(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA(context.rawAddress.toString(), flags.toInt(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcCertGeneratePrincipalNameW(context: ConstPtr<CertContext>, flags: UInt, pbuffer: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW(context.rawAddress.toString(), flags.toInt(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterA(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterNoReplaceA(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterNoReplaceW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpRegisterW(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>, annotation: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcEpRegisterW(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpResolveBinding(binding: ConstPtr<CVoid>, ifspec: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcEpResolveBinding(binding.rawAddress.toString(), ifspec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcEpUnregister(ifspec: ConstPtr<CVoid>, bindingvector: ConstPtr<RpcBindingVector>, uuidvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcEpUnregister(ifspec.rawAddress.toString(), bindingvector.rawAddress.toString(), uuidvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorAddRecord(errorinfo: ConstPtr<RpcExtendedErrorInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorAddRecord(errorinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorClearInformation() {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcErrorClearInformation()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcErrorEndEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorEndEnumeration(enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorGetNextRecord(enumhandle: ConstPtr<RpcErrorEnumHandle>, copystrings: Bool, errorinfo: MutPtr<RpcExtendedErrorInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorGetNextRecord(enumhandle.rawAddress.toString(), copystrings, errorinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorGetNumberOfRecords(enumhandle: ConstPtr<RpcErrorEnumHandle>, records: MutPtr<Int>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords(enumhandle.rawAddress.toString(), records.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorLoadErrorInfo(errorblob: ConstPtr<CVoid>, blobsize: ULong, enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo(errorblob.rawAddress.toString(), blobsize.toString(), enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorResetEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorResetEnumeration(enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorSaveErrorInfo(enumhandle: ConstPtr<RpcErrorEnumHandle>, errorblob: MutPtr<MutPtr<CVoid>>, blobsize: MutPtr<ULong>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo(enumhandle.rawAddress.toString(), errorblob.rawAddress.toString(), blobsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcErrorStartEnumeration(enumhandle: MutPtr<RpcErrorEnumHandle>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcErrorStartEnumeration(enumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcExceptionFilter(exceptioncode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext(pauthzclientcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcGetAuthorizationContextForClient(clientbinding: ConstPtr<CVoid>, impersonateonreturn: Bool, reserved1: ConstPtr<CVoid>, pexpirationtime: ConstPtr<Long>, reserved2: Luid, reserved3: UInt, reserved4: ConstPtr<CVoid>, pauthzclientcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcIfIdVectorFree(ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcIfIdVectorFree(ifidvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcIfInqId(rpcifhandle: ConstPtr<CVoid>, rpcifid: MutPtr<RpcIfId>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcIfInqId(rpcifhandle.rawAddress.toString(), rpcifid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClient(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcImpersonateClient(bindinghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClient2(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcImpersonateClient2(bindinghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcImpersonateClientContainer(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcImpersonateClientContainer(bindinghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqBegin(epbinding: ConstPtr<CVoid>, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuid: ConstPtr<Guid>, inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin(epbinding.rawAddress.toString(), inquirytype.toInt(), ifid.rawAddress.toString(), versoption.toInt(), objectuuid.rawAddress.toString(), inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqDone(inquirycontext: MutPtr<MutPtr<MutPtr<CVoid>>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone(inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), binding.rawAddress.toString(), objectuuid.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: ConstPtr<ConstPtr<CVoid>>, ifid: MutPtr<RpcIfId>, binding: MutPtr<MutPtr<CVoid>>, objectuuid: MutPtr<Guid>, annotation: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), binding.rawAddress.toString(), objectuuid.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtEpUnregister(epbinding: ConstPtr<CVoid>, ifid: ConstPtr<RpcIfId>, binding: ConstPtr<CVoid>, objectuuid: ConstPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtEpUnregister(epbinding.rawAddress.toString(), ifid.rawAddress.toString(), binding.rawAddress.toString(), objectuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqComTimeout(binding: ConstPtr<CVoid>, timeout: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout(binding.rawAddress.toString(), timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel(authnsvc.toInt(), authnlevel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqIfIds(binding: ConstPtr<CVoid>, ifidvector: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqIfIds(binding.rawAddress.toString(), ifidvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqServerPrincNameA(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA(binding.rawAddress.toString(), authnsvc.toInt(), serverprincname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqServerPrincNameW(binding: ConstPtr<CVoid>, authnsvc: UInt, serverprincname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW(binding.rawAddress.toString(), authnsvc.toInt(), serverprincname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtInqStats(binding: ConstPtr<CVoid>, statistics: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtInqStats(binding.rawAddress.toString(), statistics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtIsServerListening(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtIsServerListening(binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(timeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetComTimeout(binding: ConstPtr<CVoid>, timeout: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout(binding.rawAddress.toString(), timeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(threadstacksize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtStatsVectorFree(statsvector: MutPtr<MutPtr<RpcStatsVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree(statsvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtStopServerListening(binding: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtStopServerListening(binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkInqProtseqsA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA(protseqvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkInqProtseqsW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW(protseqvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA(protseq.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW(protseq.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), bindingvec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, bindingvec: ConstPtr<RpcBindingVector>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingExportW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), bindingvec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), importcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), importcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportDone(importcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportDone(importcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingImportNext(importcontext: MutPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingImportNext(importcontext.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingInqEntryNameA(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingInqEntryNameW(binding: ConstPtr<CVoid>, entrynamesyntax: UInt, entryname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW(binding.rawAddress.toString(), entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), bindingmaxcount.toInt(), lookupcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objuuid: ConstPtr<Guid>, bindingmaxcount: UInt, lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objuuid.rawAddress.toString(), bindingmaxcount.toInt(), lookupcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupDone(lookupcontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupDone(lookupcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingLookupNext(lookupcontext: MutPtr<CVoid>, bindingvec: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingLookupNext(lookupcontext.rawAddress.toString(), bindingvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingSelect(bindingvec: MutPtr<RpcBindingVector>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingSelect(bindingvec.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectvector: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr<CVoid>, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsBindingUnexportW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifspec.rawAddress.toString(), objectuuidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), expandedname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), expandedname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone(inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsEntryObjectInqNext(inquirycontext: MutPtr<CVoid>, objuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext(inquirycontext.rawAddress.toString(), objuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupDeleteA(groupnamesyntax.toInt(), groupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupDeleteW(groupnamesyntax.toInt(), groupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone(inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA(inquirycontext.rawAddress.toString(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: MutPtr<CVoid>, membername: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW(inquirycontext.rawAddress.toString(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW(groupnamesyntax.toInt(), groupname.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifid.rawAddress.toString(), versoption.toInt(), objectuuidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: ConstPtr<RpcIfId>, versoption: UInt, objectuuidvec: ConstPtr<UuidVector>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifid.rawAddress.toString(), versoption.toInt(), objectuuidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA(entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW(entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA(entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW(entrynamesyntax.toInt(), entryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: MutPtr<MutPtr<RpcIfIdVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW(entrynamesyntax.toInt(), entryname.rawAddress.toString(), ifidvec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: MutPtr<CVoid>, expirationage: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge(nshandle.rawAddress.toString(), expirationage.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtInqExpAge(expirationage: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge(expirationage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(expirationage.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileDeleteA(profilenamesyntax.toInt(), profilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileDeleteW(profilenamesyntax.toInt(), profilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltAddA(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString(), priority.toInt(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltAddW(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString(), priority.toInt(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA(profilenamesyntax.toInt(), profilename.rawAddress.toString(), inquirytype.toInt(), ifid.rawAddress.toString(), versoption.toInt(), membernamesyntax.toInt(), membername.rawAddress.toString(), inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: ConstPtr<RpcIfId>, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW(profilenamesyntax.toInt(), profilename.rawAddress.toString(), inquirytype.toInt(), ifid.rawAddress.toString(), versoption.toInt(), membernamesyntax.toInt(), membername.rawAddress.toString(), inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqDone(inquirycontext: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone(inquirycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqNextA(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), membername.rawAddress.toString(), priority.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltInqNextW(inquirycontext: ConstPtr<CVoid>, ifid: MutPtr<RpcIfId>, membername: MutPtr<Pwstr>, priority: MutPtr<UInt>, annotation: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW(inquirycontext.rawAddress.toString(), ifid.rawAddress.toString(), membername.rawAddress.toString(), priority.rawAddress.toString(), annotation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr<RpcIfId>, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW(profilenamesyntax.toInt(), profilename.rawAddress.toString(), ifid.rawAddress.toString(), membernamesyntax.toInt(), membername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectInqType(objuuid: ConstPtr<Guid>, typeuuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcObjectInqType(objuuid.rawAddress.toString(), typeuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcObjectSetInqFn(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcObjectSetType(objuuid: ConstPtr<Guid>, typeuuid: ConstPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcObjectSetType(objuuid.rawAddress.toString(), typeuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcProtseqVectorFreeA(protseqvector: MutPtr<MutPtr<RpcProtseqVectora>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA(protseqvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcProtseqVectorFreeW(protseqvector: MutPtr<MutPtr<RpcProtseqVectorw>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW(protseqvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRaiseException(exception: RpcStatus) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcRaiseException(exception)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRevertToSelf(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcRevertToSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcRevertToSelfEx(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcRevertToSelfEx(bindinghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: ConstPtr<CVoid>, status: RpcStatus): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback(bindinghandle.rawAddress.toString(), status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindingHandle(binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqBindingHandle(binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindings(bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqBindings(bindingvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqBindingsEx(securitydescriptor: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqBindingsEx(securitydescriptor.rawAddress.toString(), bindingvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqCallAttributesA(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA(clientbinding.rawAddress.toString(), rpccallattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqCallAttributesW(clientbinding: ConstPtr<CVoid>, rpccallattributes: MutPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW(clientbinding.rawAddress.toString(), rpccallattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA(authnsvc.toInt(), princname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW(authnsvc.toInt(), princname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInqIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInqIf(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupActivate(ifgroup: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate(ifgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupClose(ifgroup: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose(ifgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupCreateA(interfaces: ConstPtr<RpcInterfaceTemplatea>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatea>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA(interfaces.rawAddress.toString(), numifs.toInt(), endpoints.rawAddress.toString(), numendpoints.toInt(), idleperiod.toInt(), 0L.toString(), idlecallbackcontext.rawAddress.toString(), ifgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupCreateW(interfaces: ConstPtr<RpcInterfaceTemplatew>, numifs: UInt, endpoints: ConstPtr<RpcEndpointTemplatew>, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr<CVoid>, ifgroup: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW(interfaces.rawAddress.toString(), numifs.toInt(), endpoints.rawAddress.toString(), numendpoints.toInt(), idleperiod.toInt(), 0L.toString(), idlecallbackcontext.rawAddress.toString(), ifgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: ConstPtr<CVoid>, forcedeactivation: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate(ifgroup.rawAddress.toString(), forcedeactivation.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: ConstPtr<CVoid>, bindingvector: MutPtr<MutPtr<RpcBindingVector>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings(ifgroup.rawAddress.toString(), bindingvector.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA(serverprincname.rawAddress.toString(), authnsvc.toInt(), 0L.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW(serverprincname.rawAddress.toString(), authnsvc.toInt(), 0L.toString(), arg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIf(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf2(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIf2(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIf3(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIf3(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString(), flags.toInt(), maxcalls.toInt(), maxrpcsize.toInt(), 0L.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerRegisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, mgrepv: ConstPtr<CVoid>, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerRegisterIfEx(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), mgrepv.rawAddress.toString(), flags.toInt(), maxcalls.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerSubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: ConstPtr<RpcAsyncNotificationInfo>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification(binding.rawAddress.toString(), notification, notificationtype, notificationinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerTestCancel(bindinghandle: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerTestCancel(bindinghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnregisterIf(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, waitforcallstocomplete: UInt): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUnregisterIf(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), waitforcallstocomplete.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnregisterIfEx(ifspec: ConstPtr<CVoid>, mgrtypeuuid: ConstPtr<Guid>, rundowncontexthandles: Int): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx(ifspec.rawAddress.toString(), mgrtypeuuid.rawAddress.toString(), rundowncontexthandles) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUnsubscribeForNotification(binding: ConstPtr<CVoid>, notification: RpcNotifications, notificationsqueued: MutPtr<UInt>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification(binding.rawAddress.toString(), notification, notificationsqueued.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs(maxcalls.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx(maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf(maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx(maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqA(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW(protseq.rawAddress.toString(), maxcalls.toInt(), endpoint.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqExA(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqExW(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>, policy: ConstPtr<RpcPolicy>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString(), policy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr<CVoid>, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW(protseq.rawAddress.toString(), maxcalls.toInt(), ifspec.rawAddress.toString(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcServerUseProtseqW(protseq.rawAddress.toString(), maxcalls.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcServerYield() {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcServerYield()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSmAllocate(size: ULong, pstatus: MutPtr<RpcStatus>): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcRpcSmAllocate(size.toString(), pstatus.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmClientFree(pnodetofree: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmClientFree(pnodetofree.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmDestroyClientContext(contexthandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmDisableAllocate(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmDisableAllocate() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmEnableAllocate(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmEnableAllocate() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmFree(nodetofree: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmFree(nodetofree.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmGetThreadHandle(pstatus: MutPtr<RpcStatus>): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcRpcSmGetThreadHandle(pstatus.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree(0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSetThreadHandle(id: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmSetThreadHandle(id.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree(0L.toString(), 0L.toString(), oldclientalloc.rawAddress.toString(), oldclientfree.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsAllocate(size: ULong): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcRpcSsAllocate(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsContextLockExclusive(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSsContextLockExclusive(serverbindinghandle.rawAddress.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsContextLockShared(serverbindinghandle: ConstPtr<CVoid>, usercontext: ConstPtr<CVoid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSsContextLockShared(serverbindinghandle.rawAddress.toString(), usercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsDestroyClientContext(contexthandle: ConstPtr<ConstPtr<CVoid>>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsDestroyClientContext(contexthandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsDisableAllocate() {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsDisableAllocate()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsDontSerializeContext() {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsDontSerializeContext()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsEnableAllocate() {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsEnableAllocate()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsFree(nodetofree: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsFree(nodetofree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsGetContextBinding(contexthandle: ConstPtr<CVoid>, binding: MutPtr<MutPtr<CVoid>>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcSsGetContextBinding(contexthandle.rawAddress.toString(), binding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsGetThreadHandle(): MutPtr<CVoid> =
    if (windowsWin32SystemRpcNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRpcRpcSsGetThreadHandle().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree(0L.toString(), 0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsSetThreadHandle(id: ConstPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsSetThreadHandle(id.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr<RpcClientAlloc>, oldclientfree: MutPtr<RpcClientFree>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree(0L.toString(), 0L.toString(), oldclientalloc.rawAddress.toString(), oldclientfree.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcStringBindingComposeA(objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), options.rawAddress.toString(), stringbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcStringBindingComposeW(objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), options.rawAddress.toString(), stringbinding.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: MutPtr<Pstr>, protseq: MutPtr<Pstr>, networkaddr: MutPtr<Pstr>, endpoint: MutPtr<Pstr>, networkoptions: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcStringBindingParseA(stringbinding.rawAddress.toString(), objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), networkoptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: MutPtr<Pwstr>, protseq: MutPtr<Pwstr>, networkaddr: MutPtr<Pwstr>, endpoint: MutPtr<Pwstr>, networkoptions: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcStringBindingParseW(stringbinding.rawAddress.toString(), objuuid.rawAddress.toString(), protseq.rawAddress.toString(), networkaddr.rawAddress.toString(), endpoint.rawAddress.toString(), networkoptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringFreeA(string: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcStringFreeA(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcStringFreeW(string: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcStringFreeW(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcTestCancel(): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcRpcTestCancel() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rpcUserFree(asynchandle: MutPtr<CVoid>, pbuffer: MutPtr<CVoid>) {
    if (windowsWin32SystemRpcNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRpcRpcUserFree(asynchandle.rawAddress.toString(), pbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uuidCompare(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidCompare(uuid1.rawAddress.toString(), uuid2.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreate(uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidCreate(uuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreateNil(niluuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidCreateNil(niluuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidCreateSequential(uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidCreateSequential(uuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidEqual(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidEqual(uuid1.rawAddress.toString(), uuid2.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidFromStringA(stringuuid.rawAddress.toString(), uuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: MutPtr<Guid>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidFromStringW(stringuuid.rawAddress.toString(), uuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidHash(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): UShort =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidHash(uuid.rawAddress.toString(), status.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidIsNil(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidIsNil(uuid.rawAddress.toString(), status.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidToStringA(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidToStringA(uuid.rawAddress.toString(), stringuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uuidToStringW(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pwstr>): RpcStatus =
    if (windowsWin32SystemRpcNapiAvailable) wasmWindowssysWindowsWin32SystemRpcUuidToStringW(uuid.rawAddress.toString(), stringuuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
