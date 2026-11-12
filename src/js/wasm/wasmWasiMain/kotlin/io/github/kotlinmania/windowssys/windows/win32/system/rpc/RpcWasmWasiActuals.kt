@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.rpc

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun dceErrorInqTextA(rpcstatus: RpcStatus, errortext: Pstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcDceErrorInqTextA")

public actual fun dceErrorInqTextW(rpcstatus: RpcStatus, errortext: Pwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcDceErrorInqTextW")

public actual fun iunknownAddRefProxy(thisRef: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIunknownAddRefProxy")

public actual fun iunknownQueryInterfaceProxy(thisRef: MutPtr, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIunknownQueryInterfaceProxy")

public actual fun iunknownReleaseProxy(thisRef: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIunknownReleaseProxy")

public actual fun iRpcAllocate(size: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcAllocate")

public actual fun iRpcAsyncAbortCall(pasync: ConstPtr, exceptioncode: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcAsyncAbortCall")

public actual fun iRpcAsyncSetHandle(message: ConstPtr, pasync: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcAsyncSetHandle")

public actual fun iRpcBindingCopy(sourcebinding: MutPtr, destinationbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingCopy")

public actual fun iRpcBindingCreateNp(servername: Pcwstr, servicename: Pcwstr, networkoptions: Pcwstr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingCreateNp")

public actual fun iRpcBindingHandleToAsyncHandle(binding: MutPtr, asynchandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingHandleToAsyncHandle")

public actual fun iRpcBindingInqClientTokenAttributes(binding: ConstPtr, tokenid: MutPtr, authenticationid: MutPtr, modifiedid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqClientTokenAttributes")

public actual fun iRpcBindingInqDynamicEndpointA(binding: ConstPtr, dynamicendpoint: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointA")

public actual fun iRpcBindingInqDynamicEndpointW(binding: ConstPtr, dynamicendpoint: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqDynamicEndpointW")

public actual fun iRpcBindingInqLocalClientPid(binding: MutPtr, pid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqLocalClientPid")

public actual fun iRpcBindingInqMarshalledTargetInfo(binding: ConstPtr, marshalledtargetinfosize: MutPtr, marshalledtargetinfo: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqMarshalledTargetInfo")

public actual fun iRpcBindingInqSecurityContext(binding: MutPtr, securitycontexthandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContext")

public actual fun iRpcBindingInqSecurityContextKeyInfo(binding: ConstPtr, keyinfo: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqSecurityContextKeyInfo")

public actual fun iRpcBindingInqTransportType(binding: MutPtr, type: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqTransportType")

public actual fun iRpcBindingInqWireIdForSnego(binding: ConstPtr, wireid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingInqWireIdForSnego")

public actual fun iRpcBindingIsClientLocal(bindinghandle: MutPtr, clientlocalflag: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingIsClientLocal")

public actual fun iRpcBindingIsServerLocal(binding: ConstPtr, serverlocalflag: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingIsServerLocal")

public actual fun iRpcBindingSetPrivateOption(hbinding: ConstPtr, option: UInt, optionvalue: ULong): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingSetPrivateOption")

public actual fun iRpcBindingToStaticStringBindingW(binding: MutPtr, stringbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcBindingToStaticStringBindingW")

public actual fun iRpcClearMutex(mutex: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcClearMutex")

public actual fun iRpcDeleteMutex(mutex: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcDeleteMutex")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcExceptionFilter")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcExceptionFilter(exceptioncode: Int): Int

public actual fun iRpcExceptionFilter(exceptioncode: UInt): Int =
    wasiWindowssysWindowsWin32SystemRpcIRpcExceptionFilter(exceptioncode.toInt())

public actual fun iRpcFree(obj: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcFree")

public actual fun iRpcFreeBuffer(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcFreeBuffer")

public actual fun iRpcFreePipeBuffer(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcFreePipeBuffer")

public actual fun iRpcGetBuffer(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcGetBuffer")

public actual fun iRpcGetBufferWithObject(message: MutPtr, objectuuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcGetBufferWithObject")

public actual fun iRpcGetCurrentCallHandle(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcGetCurrentCallHandle")

public actual fun iRpcGetDefaultSd(ppsecuritydescriptor: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcGetDefaultSd")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcGetExtendedError")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcGetExtendedError(): Int

public actual fun iRpcGetExtendedError(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcIRpcGetExtendedError()

public actual fun iRpcIfInqTransferSyntaxes(rpcifhandle: MutPtr, transfersyntaxes: MutPtr, transfersyntaxsize: UInt, transfersyntaxcount: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcIfInqTransferSyntaxes")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcMapWin32Status")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcMapWin32Status(status: Int): Int

public actual fun iRpcMapWin32Status(status: RpcStatus): Int =
    wasiWindowssysWindowsWin32SystemRpcIRpcMapWin32Status(status)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool(): Int

public actual fun iRpcMgmtEnableDedicatedThreadPool(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcIRpcMgmtEnableDedicatedThreadPool()

public actual fun iRpcNegotiateTransferSyntax(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNegotiateTransferSyntax")

public actual fun iRpcNsBindingSetEntryNameA(binding: ConstPtr, entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameA")

public actual fun iRpcNsBindingSetEntryNameW(binding: ConstPtr, entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNsBindingSetEntryNameW")

public actual fun iRpcNsGetBuffer(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNsGetBuffer")

public actual fun iRpcNsInterfaceExported(entrynamesyntax: UInt, entryname: ConstPtr, rpcinterfaceinformation: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNsInterfaceExported")

public actual fun iRpcNsInterfaceUnexported(entrynamesyntax: UInt, entryname: MutPtr, rpcinterfaceinformation: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNsInterfaceUnexported")

public actual fun iRpcNsRaiseException(message: MutPtr, status: RpcStatus): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNsRaiseException")

public actual fun iRpcNsSendReceive(message: MutPtr, handle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcNsSendReceive")

public actual fun iRpcOpenClientProcess(binding: ConstPtr, desiredaccess: UInt, clientprocess: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcOpenClientProcess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcPauseExecution")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcPauseExecution(milliseconds: Int): Unit

public actual fun iRpcPauseExecution(milliseconds: UInt): Unit =
    wasiWindowssysWindowsWin32SystemRpcIRpcPauseExecution(milliseconds.toInt())

public actual fun iRpcReBindBuffer(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcReBindBuffer")

public actual fun iRpcReallocPipeBuffer(message: ConstPtr, newsize: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcReallocPipeBuffer")

public actual fun iRpcReceive(message: MutPtr, size: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcReceive")

public actual fun iRpcRecordCalloutFailure(rpcstatus: RpcStatus, calloutstate: MutPtr, dllname: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcRecordCalloutFailure")

public actual fun iRpcRequestMutex(mutex: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcRequestMutex")

public actual fun iRpcSend(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcSend")

public actual fun iRpcSendReceive(message: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcSendReceive")

public actual fun iRpcServerCheckClientRestriction(context: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerCheckClientRestriction")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter(): Int

public actual fun iRpcServerDisableExceptionFilter(): Int =
    wasiWindowssysWindowsWin32SystemRpcIRpcServerDisableExceptionFilter()

public actual fun iRpcServerGetAssociationId(binding: ConstPtr, associationid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerGetAssociationId")

public actual fun iRpcServerInqAddressChangeFn(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerInqAddressChangeFn")

public actual fun iRpcServerInqLocalConnAddress(binding: MutPtr, buffer: MutPtr, buffersize: MutPtr, addressformat: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerInqLocalConnAddress")

public actual fun iRpcServerInqRemoteConnAddress(binding: MutPtr, buffer: MutPtr, buffersize: MutPtr, addressformat: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerInqRemoteConnAddress")

public actual fun iRpcServerInqTransportType(type: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerInqTransportType")

public actual fun iRpcServerRegisterForwardFunction(pforwardfunction: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerRegisterForwardFunction")

public actual fun iRpcServerSetAddressChangeFn(paddresschangefn: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerSetAddressChangeFn")

public actual fun iRpcServerStartService(protseq: Pcwstr, endpoint: Pcwstr, ifspec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerStartService")

public actual fun iRpcServerSubscribeForDisconnectNotification(binding: ConstPtr, hevent: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification")

public actual fun iRpcServerSubscribeForDisconnectNotification2(binding: ConstPtr, hevent: ConstPtr, subscriptionid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerSubscribeForDisconnectNotification2")

public actual fun iRpcServerUnsubscribeForDisconnectNotification(binding: ConstPtr, subscriptionid: Guid): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerUnsubscribeForDisconnectNotification")

public actual fun iRpcServerUseProtseq2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2A")

public actual fun iRpcServerUseProtseq2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerUseProtseq2W")

public actual fun iRpcServerUseProtseqEp2A(networkaddress: Pcstr, protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2A")

public actual fun iRpcServerUseProtseqEp2W(networkaddress: Pcwstr, protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcServerUseProtseqEp2W")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle(): Unit

public actual fun iRpcSessionStrictContextHandle(): Unit =
    wasiWindowssysWindowsWin32SystemRpcIRpcSessionStrictContextHandle()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext(): Unit

public actual fun iRpcSsDontSerializeContext(): Unit =
    wasiWindowssysWindowsWin32SystemRpcIRpcSsDontSerializeContext()

public actual fun iRpcSystemHandleTypeSpecificWork(handle: MutPtr, actualtype: UByte, idltype: UByte, marshaldirection: LrpcSystemHandleMarshalDirection): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIRpcSystemHandleTypeSpecificWork")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation")
private external fun wasiWindowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation(): Int

public actual fun iRpcTurnOnEeinfoPropagation(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcIRpcTurnOnEeinfoPropagation()

public actual fun iUuidCreate(uuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcIUuidCreate")

public actual fun mesBufferHandleReset(handle: ConstPtr, handlestyle: UInt, operation: MidlEsCode, pbuffer: ConstPtr, buffersize: UInt, pencodedsize: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesBufferHandleReset")

public actual fun mesDecodeBufferHandleCreate(buffer: Pcstr, buffersize: UInt, phandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesDecodeBufferHandleCreate")

public actual fun mesDecodeIncrementalHandleCreate(userstate: MutPtr, readfn: MidlEsRead, phandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesDecodeIncrementalHandleCreate")

public actual fun mesEncodeDynBufferHandleCreate(pbuffer: MutPtr, pencodedsize: MutPtr, phandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesEncodeDynBufferHandleCreate")

public actual fun mesEncodeFixedBufferHandleCreate(pbuffer: Pstr, buffersize: UInt, pencodedsize: MutPtr, phandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesEncodeFixedBufferHandleCreate")

public actual fun mesEncodeIncrementalHandleCreate(userstate: MutPtr, allocfn: MidlEsAlloc, writefn: MidlEsWrite, phandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesEncodeIncrementalHandleCreate")

public actual fun mesHandleFree(handle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesHandleFree")

public actual fun mesIncrementalHandleReset(handle: MutPtr, userstate: MutPtr, allocfn: MidlEsAlloc, writefn: MidlEsWrite, readfn: MidlEsRead, operation: MidlEsCode): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesIncrementalHandleReset")

public actual fun mesInqProcEncodingId(handle: MutPtr, pinterfaceid: MutPtr, pprocnum: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcMesInqProcEncodingId")

public actual fun nDRCContextBinding(ccontext: Long): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRCContextBinding")

public actual fun nDRCContextMarshall(ccontext: Long, pbuff: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRCContextMarshall")

public actual fun nDRCContextUnmarshall(pccontext: MutPtr, hbinding: ConstPtr, pbuff: ConstPtr, datarepresentation: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRCContextUnmarshall")

public actual fun nDRSContextMarshall(ccontext: ConstPtr, pbuff: MutPtr, userrundownin: NdrRundown): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRSContextMarshall")

public actual fun nDRSContextMarshall2(bindinghandle: ConstPtr, ccontext: ConstPtr, pbuff: MutPtr, userrundownin: NdrRundown, ctxguard: ConstPtr, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRSContextMarshall2")

public actual fun nDRSContextMarshallEx(bindinghandle: ConstPtr, ccontext: ConstPtr, pbuff: MutPtr, userrundownin: NdrRundown): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRSContextMarshallEx")

public actual fun nDRSContextUnmarshall(pbuff: ConstPtr, datarepresentation: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRSContextUnmarshall")

public actual fun nDRSContextUnmarshall2(bindinghandle: ConstPtr, pbuff: ConstPtr, datarepresentation: UInt, ctxguard: ConstPtr, flags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRSContextUnmarshall2")

public actual fun nDRSContextUnmarshallEx(bindinghandle: ConstPtr, pbuff: ConstPtr, datarepresentation: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNDRSContextUnmarshallEx")

public actual fun ndr64AsyncClientCall(pproxyinfo: MutPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdr64AsyncClientCall")

public actual fun ndr64AsyncServerCall64(prpcmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdr64AsyncServerCall64")

public actual fun ndr64AsyncServerCallAll(prpcmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdr64AsyncServerCallAll")

public actual fun ndr64DcomAsyncClientCall(pproxyinfo: MutPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdr64DcomAsyncClientCall")

public actual fun ndr64DcomAsyncStubCall(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdr64DcomAsyncStubCall")

public actual fun ndrAllocate(pstubmsg: MutPtr, len: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrAllocate")

public actual fun ndrAsyncClientCall(pstubdescriptor: MutPtr, pformat: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrAsyncClientCall")

public actual fun ndrAsyncServerCall(prpcmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrAsyncServerCall")

public actual fun ndrByteCountPointerBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrByteCountPointerBufferSize")

public actual fun ndrByteCountPointerFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrByteCountPointerFree")

public actual fun ndrByteCountPointerMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrByteCountPointerMarshall")

public actual fun ndrByteCountPointerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrByteCountPointerUnmarshall")

public actual fun ndrClearOutParameters(pstubmsg: MutPtr, pformat: MutPtr, argaddr: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrClearOutParameters")

public actual fun ndrClientCall2(pstubdescriptor: MutPtr, pformat: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrClientCall2")

public actual fun ndrClientCall3(pproxyinfo: MutPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrClientCall3")

public actual fun ndrClientContextMarshall(pstubmsg: MutPtr, contexthandle: Long, fcheck: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrClientContextMarshall")

public actual fun ndrClientContextUnmarshall(pstubmsg: MutPtr, pcontexthandle: MutPtr, bindhandle: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrClientContextUnmarshall")

public actual fun ndrClientInitialize(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr, procnum: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrClientInitialize")

public actual fun ndrClientInitializeNew(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr, procnum: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrClientInitializeNew")

public actual fun ndrComplexArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexArrayBufferSize")

public actual fun ndrComplexArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexArrayFree")

public actual fun ndrComplexArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexArrayMarshall")

public actual fun ndrComplexArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexArrayMemorySize")

public actual fun ndrComplexArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexArrayUnmarshall")

public actual fun ndrComplexStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexStructBufferSize")

public actual fun ndrComplexStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexStructFree")

public actual fun ndrComplexStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexStructMarshall")

public actual fun ndrComplexStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexStructMemorySize")

public actual fun ndrComplexStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrComplexStructUnmarshall")

public actual fun ndrConformantArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantArrayBufferSize")

public actual fun ndrConformantArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantArrayFree")

public actual fun ndrConformantArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantArrayMarshall")

public actual fun ndrConformantArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantArrayMemorySize")

public actual fun ndrConformantArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantArrayUnmarshall")

public actual fun ndrConformantStringBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStringBufferSize")

public actual fun ndrConformantStringMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStringMarshall")

public actual fun ndrConformantStringMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStringMemorySize")

public actual fun ndrConformantStringUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStringUnmarshall")

public actual fun ndrConformantStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStructBufferSize")

public actual fun ndrConformantStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStructFree")

public actual fun ndrConformantStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStructMarshall")

public actual fun ndrConformantStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStructMemorySize")

public actual fun ndrConformantStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantStructUnmarshall")

public actual fun ndrConformantVaryingArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayBufferSize")

public actual fun ndrConformantVaryingArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayFree")

public actual fun ndrConformantVaryingArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMarshall")

public actual fun ndrConformantVaryingArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayMemorySize")

public actual fun ndrConformantVaryingArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingArrayUnmarshall")

public actual fun ndrConformantVaryingStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingStructBufferSize")

public actual fun ndrConformantVaryingStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingStructFree")

public actual fun ndrConformantVaryingStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMarshall")

public actual fun ndrConformantVaryingStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingStructMemorySize")

public actual fun ndrConformantVaryingStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConformantVaryingStructUnmarshall")

public actual fun ndrContextHandleInitialize(pstubmsg: ConstPtr, pformat: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrContextHandleInitialize")

public actual fun ndrContextHandleSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrContextHandleSize")

public actual fun ndrConvert(pstubmsg: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConvert")

public actual fun ndrConvert2(pstubmsg: MutPtr, pformat: MutPtr, numberparams: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrConvert2")

public actual fun ndrCorrelationFree(pstubmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrCorrelationFree")

public actual fun ndrCorrelationInitialize(pstubmsg: MutPtr, pmemory: MutPtr, cachesize: UInt, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrCorrelationInitialize")

public actual fun ndrCorrelationPass(pstubmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrCorrelationPass")

public actual fun ndrCreateServerInterfaceFromStub(pstub: MutPtr, pserverif: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrCreateServerInterfaceFromStub")

public actual fun ndrDcomAsyncClientCall(pstubdescriptor: MutPtr, pformat: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrDcomAsyncClientCall")

public actual fun ndrDcomAsyncStubCall(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrDcomAsyncStubCall")

public actual fun ndrEncapsulatedUnionBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionBufferSize")

public actual fun ndrEncapsulatedUnionFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionFree")

public actual fun ndrEncapsulatedUnionMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMarshall")

public actual fun ndrEncapsulatedUnionMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionMemorySize")

public actual fun ndrEncapsulatedUnionUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrEncapsulatedUnionUnmarshall")

public actual fun ndrFixedArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFixedArrayBufferSize")

public actual fun ndrFixedArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFixedArrayFree")

public actual fun ndrFixedArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFixedArrayMarshall")

public actual fun ndrFixedArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFixedArrayMemorySize")

public actual fun ndrFixedArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFixedArrayUnmarshall")

public actual fun ndrFreeBuffer(pstubmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFreeBuffer")

public actual fun ndrFullPointerXlatFree(pxlattables: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFullPointerXlatFree")

public actual fun ndrFullPointerXlatInit(numberofpointers: UInt, xlatside: XlatSide): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrFullPointerXlatInit")

public actual fun ndrGetBuffer(pstubmsg: MutPtr, bufferlength: UInt, handle: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrGetBuffer")

public actual fun ndrGetDcomProtocolVersion(pstubmsg: MutPtr, pversion: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrGetDcomProtocolVersion")

public actual fun ndrGetUserMarshalInfo(pflags: ConstPtr, informationlevel: UInt, pmarshalinfo: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrGetUserMarshalInfo")

public actual fun ndrInterfacePointerBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrInterfacePointerBufferSize")

public actual fun ndrInterfacePointerFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrInterfacePointerFree")

public actual fun ndrInterfacePointerMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrInterfacePointerMarshall")

public actual fun ndrInterfacePointerMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrInterfacePointerMemorySize")

public actual fun ndrInterfacePointerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrInterfacePointerUnmarshall")

public actual fun ndrMapCommAndFaultStatus(pstubmsg: MutPtr, pcommstatus: MutPtr, pfaultstatus: MutPtr, status: RpcStatus): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMapCommAndFaultStatus")

public actual fun ndrMesProcEncodeDecode(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode")

public actual fun ndrMesProcEncodeDecode2(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode2")

public actual fun ndrMesProcEncodeDecode3(handle: MutPtr, pproxyinfo: ConstPtr, nprocnum: UInt, preturnvalue: MutPtr, vararg variadicArgs: Long): ClientCallReturn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesProcEncodeDecode3")

public actual fun ndrMesSimpleTypeAlignSize(param0: MutPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSize")

public actual fun ndrMesSimpleTypeAlignSizeAll(handle: MutPtr, pproxyinfo: ConstPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesSimpleTypeAlignSizeAll")

public actual fun ndrMesSimpleTypeDecode(handle: MutPtr, pobject: MutPtr, size: Short): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecode")

public actual fun ndrMesSimpleTypeDecodeAll(handle: MutPtr, pproxyinfo: ConstPtr, pobject: MutPtr, size: Short): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesSimpleTypeDecodeAll")

public actual fun ndrMesSimpleTypeEncode(handle: MutPtr, pstubdesc: ConstPtr, pobject: ConstPtr, size: Short): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncode")

public actual fun ndrMesSimpleTypeEncodeAll(handle: MutPtr, pproxyinfo: ConstPtr, pobject: ConstPtr, size: Short): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesSimpleTypeEncodeAll")

public actual fun ndrMesTypeAlignSize(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize")

public actual fun ndrMesTypeAlignSize2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize2")

public actual fun ndrMesTypeAlignSize3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: ConstPtr): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeAlignSize3")

public actual fun ndrMesTypeDecode(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeDecode")

public actual fun ndrMesTypeDecode2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeDecode2")

public actual fun ndrMesTypeDecode3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeDecode3")

public actual fun ndrMesTypeEncode(handle: MutPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeEncode")

public actual fun ndrMesTypeEncode2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeEncode2")

public actual fun ndrMesTypeEncode3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeEncode3")

public actual fun ndrMesTypeFree2(handle: MutPtr, ppicklinginfo: ConstPtr, pstubdesc: ConstPtr, pformatstring: MutPtr, pobject: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeFree2")

public actual fun ndrMesTypeFree3(handle: MutPtr, ppicklinginfo: ConstPtr, pproxyinfo: ConstPtr, arrtypeoffset: ConstPtr, ntypeindex: UInt, pobject: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrMesTypeFree3")

public actual fun ndrNonConformantStringBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonConformantStringBufferSize")

public actual fun ndrNonConformantStringMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonConformantStringMarshall")

public actual fun ndrNonConformantStringMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonConformantStringMemorySize")

public actual fun ndrNonConformantStringUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonConformantStringUnmarshall")

public actual fun ndrNonEncapsulatedUnionBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionBufferSize")

public actual fun ndrNonEncapsulatedUnionFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionFree")

public actual fun ndrNonEncapsulatedUnionMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMarshall")

public actual fun ndrNonEncapsulatedUnionMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionMemorySize")

public actual fun ndrNonEncapsulatedUnionUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNonEncapsulatedUnionUnmarshall")

public actual fun ndrNsGetBuffer(pstubmsg: MutPtr, bufferlength: UInt, handle: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNsGetBuffer")

public actual fun ndrNsSendReceive(pstubmsg: MutPtr, pbufferend: MutPtr, pautohandle: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrNsSendReceive")

public actual fun ndrOleAllocate(size: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrOleAllocate")

public actual fun ndrOleFree(nodetofree: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrOleFree")

public actual fun ndrPartialIgnoreClientBufferSize(pstubmsg: MutPtr, pmemory: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientBufferSize")

public actual fun ndrPartialIgnoreClientMarshall(pstubmsg: MutPtr, pmemory: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPartialIgnoreClientMarshall")

public actual fun ndrPartialIgnoreServerInitialize(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerInitialize")

public actual fun ndrPartialIgnoreServerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPartialIgnoreServerUnmarshall")

public actual fun ndrPointerBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPointerBufferSize")

public actual fun ndrPointerFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPointerFree")

public actual fun ndrPointerMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPointerMarshall")

public actual fun ndrPointerMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPointerMemorySize")

public actual fun ndrPointerUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrPointerUnmarshall")

public actual fun ndrRangeUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRangeUnmarshall")

public actual fun ndrRpcSmClientAllocate(size: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRpcSmClientAllocate")

public actual fun ndrRpcSmClientFree(nodetofree: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRpcSmClientFree")

public actual fun ndrRpcSmSetClientToOsf(pmessage: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRpcSmSetClientToOsf")

public actual fun ndrRpcSsDefaultAllocate(size: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRpcSsDefaultAllocate")

public actual fun ndrRpcSsDefaultFree(nodetofree: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRpcSsDefaultFree")

public actual fun ndrRpcSsDisableAllocate(pmessage: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRpcSsDisableAllocate")

public actual fun ndrRpcSsEnableAllocate(pmessage: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrRpcSsEnableAllocate")

public actual fun ndrSendReceive(pstubmsg: MutPtr, pbufferend: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSendReceive")

public actual fun ndrServerCall2(prpcmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerCall2")

public actual fun ndrServerCallAll(prpcmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerCallAll")

public actual fun ndrServerCallNdr64(prpcmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerCallNdr64")

public actual fun ndrServerContextMarshall(pstubmsg: MutPtr, contexthandle: MutPtr, rundownroutine: NdrRundown): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerContextMarshall")

public actual fun ndrServerContextNewMarshall(pstubmsg: MutPtr, contexthandle: MutPtr, rundownroutine: NdrRundown, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerContextNewMarshall")

public actual fun ndrServerContextNewUnmarshall(pstubmsg: ConstPtr, pformat: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerContextNewUnmarshall")

public actual fun ndrServerContextUnmarshall(pstubmsg: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerContextUnmarshall")

public actual fun ndrServerInitialize(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerInitialize")

public actual fun ndrServerInitializeMarshall(prpcmsg: MutPtr, pstubmsg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerInitializeMarshall")

public actual fun ndrServerInitializeNew(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerInitializeNew")

public actual fun ndrServerInitializePartial(prpcmsg: MutPtr, pstubmsg: MutPtr, pstubdescriptor: MutPtr, requestedbuffersize: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerInitializePartial")

public actual fun ndrServerInitializeUnmarshall(pstubmsg: MutPtr, pstubdescriptor: MutPtr, prpcmsg: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrServerInitializeUnmarshall")

public actual fun ndrSimpleStructBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSimpleStructBufferSize")

public actual fun ndrSimpleStructFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSimpleStructFree")

public actual fun ndrSimpleStructMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSimpleStructMarshall")

public actual fun ndrSimpleStructMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSimpleStructMemorySize")

public actual fun ndrSimpleStructUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSimpleStructUnmarshall")

public actual fun ndrSimpleTypeMarshall(pstubmsg: MutPtr, pmemory: MutPtr, formatchar: UByte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSimpleTypeMarshall")

public actual fun ndrSimpleTypeUnmarshall(pstubmsg: MutPtr, pmemory: MutPtr, formatchar: UByte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrSimpleTypeUnmarshall")

public actual fun ndrStubCall2(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrStubCall2")

public actual fun ndrStubCall3(pthis: MutPtr, pchannel: MutPtr, prpcmsg: MutPtr, pdwstubphase: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrStubCall3")

public actual fun ndrUserMarshalBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrUserMarshalBufferSize")

public actual fun ndrUserMarshalFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrUserMarshalFree")

public actual fun ndrUserMarshalMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrUserMarshalMarshall")

public actual fun ndrUserMarshalMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrUserMarshalMemorySize")

public actual fun ndrUserMarshalSimpleTypeConvert(pflags: MutPtr, pbuffer: MutPtr, formatchar: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrUserMarshalSimpleTypeConvert")

public actual fun ndrUserMarshalUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrUserMarshalUnmarshall")

public actual fun ndrVaryingArrayBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrVaryingArrayBufferSize")

public actual fun ndrVaryingArrayFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrVaryingArrayFree")

public actual fun ndrVaryingArrayMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrVaryingArrayMarshall")

public actual fun ndrVaryingArrayMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrVaryingArrayMemorySize")

public actual fun ndrVaryingArrayUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrVaryingArrayUnmarshall")

public actual fun ndrXmitOrRepAsBufferSize(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrXmitOrRepAsBufferSize")

public actual fun ndrXmitOrRepAsFree(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrXmitOrRepAsFree")

public actual fun ndrXmitOrRepAsMarshall(pstubmsg: MutPtr, pmemory: MutPtr, pformat: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMarshall")

public actual fun ndrXmitOrRepAsMemorySize(pstubmsg: MutPtr, pformat: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrXmitOrRepAsMemorySize")

public actual fun ndrXmitOrRepAsUnmarshall(pstubmsg: MutPtr, ppmemory: MutPtr, pformat: MutPtr, fmustalloc: UByte): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcNdrXmitOrRepAsUnmarshall")

public actual fun rpcAsyncAbortCall(pasync: MutPtr, exceptioncode: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcAsyncAbortCall")

public actual fun rpcAsyncCancelCall(pasync: MutPtr, fabort: Bool): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcAsyncCancelCall")

public actual fun rpcAsyncCompleteCall(pasync: MutPtr, reply: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcAsyncCompleteCall")

public actual fun rpcAsyncGetCallStatus(pasync: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcAsyncGetCallStatus")

public actual fun rpcAsyncInitializeHandle(pasync: MutPtr, size: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcAsyncInitializeHandle")

public actual fun rpcAsyncRegisterInfo(pasync: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcAsyncRegisterInfo")

public actual fun rpcBindingBind(pasync: ConstPtr, binding: ConstPtr, ifspec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingBind")

public actual fun rpcBindingCopy(sourcebinding: ConstPtr, destinationbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingCopy")

public actual fun rpcBindingCreateA(template: ConstPtr, security: ConstPtr, options: ConstPtr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingCreateA")

public actual fun rpcBindingCreateW(template: ConstPtr, security: ConstPtr, options: ConstPtr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingCreateW")

public actual fun rpcBindingFree(binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingFree")

public actual fun rpcBindingFromStringBindingA(stringbinding: Pcstr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingA")

public actual fun rpcBindingFromStringBindingW(stringbinding: Pcwstr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingFromStringBindingW")

public actual fun rpcBindingInqAuthClientA(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientA")

public actual fun rpcBindingInqAuthClientExA(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr, flags: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExA")

public actual fun rpcBindingInqAuthClientExW(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr, flags: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientExW")

public actual fun rpcBindingInqAuthClientW(clientbinding: ConstPtr, privs: MutPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authzsvc: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthClientW")

public actual fun rpcBindingInqAuthInfoA(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoA")

public actual fun rpcBindingInqAuthInfoExA(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr, rpcqosversion: UInt, securityqos: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExA")

public actual fun rpcBindingInqAuthInfoExW(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr, rpcqosversion: UInt, securityqos: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoExW")

public actual fun rpcBindingInqAuthInfoW(binding: ConstPtr, serverprincname: MutPtr, authnlevel: MutPtr, authnsvc: MutPtr, authidentity: MutPtr, authzsvc: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqAuthInfoW")

public actual fun rpcBindingInqMaxCalls(binding: ConstPtr, maxcalls: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqMaxCalls")

public actual fun rpcBindingInqObject(binding: ConstPtr, objectuuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqObject")

public actual fun rpcBindingInqOption(hbinding: ConstPtr, option: UInt, poptionvalue: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingInqOption")

public actual fun rpcBindingReset(binding: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingReset")

public actual fun rpcBindingServerFromClient(clientbinding: ConstPtr, serverbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingServerFromClient")

public actual fun rpcBindingSetAuthInfoA(binding: ConstPtr, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoA")

public actual fun rpcBindingSetAuthInfoExA(binding: ConstPtr, serverprincname: Pcstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt, securityqos: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExA")

public actual fun rpcBindingSetAuthInfoExW(binding: ConstPtr, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt, securityqos: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoExW")

public actual fun rpcBindingSetAuthInfoW(binding: ConstPtr, serverprincname: Pcwstr, authnlevel: UInt, authnsvc: UInt, authidentity: ConstPtr, authzsvc: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingSetAuthInfoW")

public actual fun rpcBindingSetObject(binding: ConstPtr, objectuuid: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingSetObject")

public actual fun rpcBindingSetOption(hbinding: ConstPtr, option: UInt, optionvalue: ULong): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingSetOption")

public actual fun rpcBindingToStringBindingA(binding: ConstPtr, stringbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingToStringBindingA")

public actual fun rpcBindingToStringBindingW(binding: ConstPtr, stringbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingToStringBindingW")

public actual fun rpcBindingUnbind(binding: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingUnbind")

public actual fun rpcBindingVectorFree(bindingvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcBindingVectorFree")

public actual fun rpcCancelThread(thread: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcCancelThread")

public actual fun rpcCancelThreadEx(thread: ConstPtr, timeout: Int): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcCancelThreadEx")

public actual fun rpcCertGeneratePrincipalNameA(context: ConstPtr, flags: UInt, pbuffer: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameA")

public actual fun rpcCertGeneratePrincipalNameW(context: ConstPtr, flags: UInt, pbuffer: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcCertGeneratePrincipalNameW")

public actual fun rpcEpRegisterA(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcEpRegisterA")

public actual fun rpcEpRegisterNoReplaceA(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceA")

public actual fun rpcEpRegisterNoReplaceW(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcEpRegisterNoReplaceW")

public actual fun rpcEpRegisterW(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr, annotation: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcEpRegisterW")

public actual fun rpcEpResolveBinding(binding: ConstPtr, ifspec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcEpResolveBinding")

public actual fun rpcEpUnregister(ifspec: ConstPtr, bindingvector: ConstPtr, uuidvector: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcEpUnregister")

public actual fun rpcErrorAddRecord(errorinfo: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorAddRecord")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcErrorClearInformation")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcErrorClearInformation(): Unit

public actual fun rpcErrorClearInformation(): Unit =
    wasiWindowssysWindowsWin32SystemRpcRpcErrorClearInformation()

public actual fun rpcErrorEndEnumeration(enumhandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorEndEnumeration")

public actual fun rpcErrorGetNextRecord(enumhandle: ConstPtr, copystrings: Bool, errorinfo: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorGetNextRecord")

public actual fun rpcErrorGetNumberOfRecords(enumhandle: ConstPtr, records: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorGetNumberOfRecords")

public actual fun rpcErrorLoadErrorInfo(errorblob: ConstPtr, blobsize: ULong, enumhandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorLoadErrorInfo")

public actual fun rpcErrorResetEnumeration(enumhandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorResetEnumeration")

public actual fun rpcErrorSaveErrorInfo(enumhandle: ConstPtr, errorblob: MutPtr, blobsize: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorSaveErrorInfo")

public actual fun rpcErrorStartEnumeration(enumhandle: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcErrorStartEnumeration")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcExceptionFilter")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcExceptionFilter(exceptioncode: Int): Int

public actual fun rpcExceptionFilter(exceptioncode: UInt): Int =
    wasiWindowssysWindowsWin32SystemRpcRpcExceptionFilter(exceptioncode.toInt())

public actual fun rpcFreeAuthorizationContext(pauthzclientcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcFreeAuthorizationContext")

public actual fun rpcGetAuthorizationContextForClient(clientbinding: ConstPtr, impersonateonreturn: Bool, reserved1: ConstPtr, pexpirationtime: ConstPtr, reserved2: Luid, reserved3: UInt, reserved4: ConstPtr, pauthzclientcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcGetAuthorizationContextForClient")

public actual fun rpcIfIdVectorFree(ifidvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcIfIdVectorFree")

public actual fun rpcIfInqId(rpcifhandle: ConstPtr, rpcifid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcIfInqId")

public actual fun rpcImpersonateClient(bindinghandle: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcImpersonateClient")

public actual fun rpcImpersonateClient2(bindinghandle: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcImpersonateClient2")

public actual fun rpcImpersonateClientContainer(bindinghandle: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcImpersonateClientContainer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup(): Int

public actual fun rpcMgmtEnableIdleCleanup(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcMgmtEnableIdleCleanup()

public actual fun rpcMgmtEpEltInqBegin(epbinding: ConstPtr, inquirytype: UInt, ifid: ConstPtr, versoption: UInt, objectuuid: ConstPtr, inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqBegin")

public actual fun rpcMgmtEpEltInqDone(inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqDone")

public actual fun rpcMgmtEpEltInqNextA(inquirycontext: ConstPtr, ifid: MutPtr, binding: MutPtr, objectuuid: MutPtr, annotation: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextA")

public actual fun rpcMgmtEpEltInqNextW(inquirycontext: ConstPtr, ifid: MutPtr, binding: MutPtr, objectuuid: MutPtr, annotation: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtEpEltInqNextW")

public actual fun rpcMgmtEpUnregister(epbinding: ConstPtr, ifid: ConstPtr, binding: ConstPtr, objectuuid: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtEpUnregister")

public actual fun rpcMgmtInqComTimeout(binding: ConstPtr, timeout: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtInqComTimeout")

public actual fun rpcMgmtInqDefaultProtectLevel(authnsvc: UInt, authnlevel: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtInqDefaultProtectLevel")

public actual fun rpcMgmtInqIfIds(binding: ConstPtr, ifidvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtInqIfIds")

public actual fun rpcMgmtInqServerPrincNameA(binding: ConstPtr, authnsvc: UInt, serverprincname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameA")

public actual fun rpcMgmtInqServerPrincNameW(binding: ConstPtr, authnsvc: UInt, serverprincname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtInqServerPrincNameW")

public actual fun rpcMgmtInqStats(binding: ConstPtr, statistics: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtInqStats")

public actual fun rpcMgmtIsServerListening(binding: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtIsServerListening")

public actual fun rpcMgmtSetAuthorizationFn(authorizationfn: RpcMgmtAuthorizationFn): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtSetAuthorizationFn")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(timeout: Int): Int

public actual fun rpcMgmtSetCancelTimeout(timeout: Int): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcMgmtSetCancelTimeout(timeout)

public actual fun rpcMgmtSetComTimeout(binding: ConstPtr, timeout: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtSetComTimeout")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(threadstacksize: Int): Int

public actual fun rpcMgmtSetServerStackSize(threadstacksize: UInt): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcMgmtSetServerStackSize(threadstacksize.toInt())

public actual fun rpcMgmtStatsVectorFree(statsvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtStatsVectorFree")

public actual fun rpcMgmtStopServerListening(binding: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcMgmtStopServerListening")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen(): Int

public actual fun rpcMgmtWaitServerListen(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcMgmtWaitServerListen()

public actual fun rpcNetworkInqProtseqsA(protseqvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsA")

public actual fun rpcNetworkInqProtseqsW(protseqvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNetworkInqProtseqsW")

public actual fun rpcNetworkIsProtseqValidA(protseq: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidA")

public actual fun rpcNetworkIsProtseqValidW(protseq: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNetworkIsProtseqValidW")

public actual fun rpcNsBindingExportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, bindingvec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingExportA")

public actual fun rpcNsBindingExportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPA")

public actual fun rpcNsBindingExportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingExportPnPW")

public actual fun rpcNsBindingExportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, bindingvec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingExportW")

public actual fun rpcNsBindingImportBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objuuid: ConstPtr, importcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginA")

public actual fun rpcNsBindingImportBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objuuid: ConstPtr, importcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingImportBeginW")

public actual fun rpcNsBindingImportDone(importcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingImportDone")

public actual fun rpcNsBindingImportNext(importcontext: MutPtr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingImportNext")

public actual fun rpcNsBindingInqEntryNameA(binding: ConstPtr, entrynamesyntax: UInt, entryname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameA")

public actual fun rpcNsBindingInqEntryNameW(binding: ConstPtr, entrynamesyntax: UInt, entryname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingInqEntryNameW")

public actual fun rpcNsBindingLookupBeginA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objuuid: ConstPtr, bindingmaxcount: UInt, lookupcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginA")

public actual fun rpcNsBindingLookupBeginW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objuuid: ConstPtr, bindingmaxcount: UInt, lookupcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingLookupBeginW")

public actual fun rpcNsBindingLookupDone(lookupcontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingLookupDone")

public actual fun rpcNsBindingLookupNext(lookupcontext: MutPtr, bindingvec: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingLookupNext")

public actual fun rpcNsBindingSelect(bindingvec: MutPtr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingSelect")

public actual fun rpcNsBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingUnexportA")

public actual fun rpcNsBindingUnexportPnPA(entrynamesyntax: UInt, entryname: Pcstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPA")

public actual fun rpcNsBindingUnexportPnPW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objectvector: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingUnexportPnPW")

public actual fun rpcNsBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifspec: ConstPtr, objectuuidvec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsBindingUnexportW")

public actual fun rpcNsEntryExpandNameA(entrynamesyntax: UInt, entryname: Pcstr, expandedname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameA")

public actual fun rpcNsEntryExpandNameW(entrynamesyntax: UInt, entryname: Pcwstr, expandedname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsEntryExpandNameW")

public actual fun rpcNsEntryObjectInqBeginA(entrynamesyntax: UInt, entryname: Pcstr, inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginA")

public actual fun rpcNsEntryObjectInqBeginW(entrynamesyntax: UInt, entryname: Pcwstr, inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqBeginW")

public actual fun rpcNsEntryObjectInqDone(inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqDone")

public actual fun rpcNsEntryObjectInqNext(inquirycontext: MutPtr, objuuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsEntryObjectInqNext")

public actual fun rpcNsGroupDeleteA(groupnamesyntax: GroupNameSyntax, groupname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupDeleteA")

public actual fun rpcNsGroupDeleteW(groupnamesyntax: GroupNameSyntax, groupname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupDeleteW")

public actual fun rpcNsGroupMbrAddA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddA")

public actual fun rpcNsGroupMbrAddW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrAddW")

public actual fun rpcNsGroupMbrInqBeginA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginA")

public actual fun rpcNsGroupMbrInqBeginW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqBeginW")

public actual fun rpcNsGroupMbrInqDone(inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqDone")

public actual fun rpcNsGroupMbrInqNextA(inquirycontext: MutPtr, membername: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextA")

public actual fun rpcNsGroupMbrInqNextW(inquirycontext: MutPtr, membername: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrInqNextW")

public actual fun rpcNsGroupMbrRemoveA(groupnamesyntax: UInt, groupname: Pcstr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveA")

public actual fun rpcNsGroupMbrRemoveW(groupnamesyntax: UInt, groupname: Pcwstr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsGroupMbrRemoveW")

public actual fun rpcNsMgmtBindingUnexportA(entrynamesyntax: UInt, entryname: Pcstr, ifid: ConstPtr, versoption: UInt, objectuuidvec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportA")

public actual fun rpcNsMgmtBindingUnexportW(entrynamesyntax: UInt, entryname: Pcwstr, ifid: ConstPtr, versoption: UInt, objectuuidvec: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtBindingUnexportW")

public actual fun rpcNsMgmtEntryCreateA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateA")

public actual fun rpcNsMgmtEntryCreateW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtEntryCreateW")

public actual fun rpcNsMgmtEntryDeleteA(entrynamesyntax: UInt, entryname: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteA")

public actual fun rpcNsMgmtEntryDeleteW(entrynamesyntax: UInt, entryname: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtEntryDeleteW")

public actual fun rpcNsMgmtEntryInqIfIdsA(entrynamesyntax: UInt, entryname: Pcstr, ifidvec: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsA")

public actual fun rpcNsMgmtEntryInqIfIdsW(entrynamesyntax: UInt, entryname: Pcwstr, ifidvec: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtEntryInqIfIdsW")

public actual fun rpcNsMgmtHandleSetExpAge(nshandle: MutPtr, expirationage: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtHandleSetExpAge")

public actual fun rpcNsMgmtInqExpAge(expirationage: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsMgmtInqExpAge")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(expirationage: Int): Int

public actual fun rpcNsMgmtSetExpAge(expirationage: UInt): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcNsMgmtSetExpAge(expirationage.toInt())

public actual fun rpcNsProfileDeleteA(profilenamesyntax: UInt, profilename: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileDeleteA")

public actual fun rpcNsProfileDeleteW(profilenamesyntax: UInt, profilename: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileDeleteW")

public actual fun rpcNsProfileEltAddA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcstr, priority: UInt, annotation: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltAddA")

public actual fun rpcNsProfileEltAddW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcwstr, priority: UInt, annotation: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltAddW")

public actual fun rpcNsProfileEltInqBeginA(profilenamesyntax: UInt, profilename: Pcstr, inquirytype: UInt, ifid: ConstPtr, versoption: UInt, membernamesyntax: UInt, membername: Pcstr, inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginA")

public actual fun rpcNsProfileEltInqBeginW(profilenamesyntax: UInt, profilename: Pcwstr, inquirytype: UInt, ifid: ConstPtr, versoption: UInt, membernamesyntax: UInt, membername: Pcwstr, inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltInqBeginW")

public actual fun rpcNsProfileEltInqDone(inquirycontext: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltInqDone")

public actual fun rpcNsProfileEltInqNextA(inquirycontext: ConstPtr, ifid: MutPtr, membername: MutPtr, priority: MutPtr, annotation: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextA")

public actual fun rpcNsProfileEltInqNextW(inquirycontext: ConstPtr, ifid: MutPtr, membername: MutPtr, priority: MutPtr, annotation: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltInqNextW")

public actual fun rpcNsProfileEltRemoveA(profilenamesyntax: UInt, profilename: Pcstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveA")

public actual fun rpcNsProfileEltRemoveW(profilenamesyntax: UInt, profilename: Pcwstr, ifid: ConstPtr, membernamesyntax: UInt, membername: Pcwstr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcNsProfileEltRemoveW")

public actual fun rpcObjectInqType(objuuid: ConstPtr, typeuuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcObjectInqType")

public actual fun rpcObjectSetInqFn(inquiryfn: RpcObjectInqFn): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcObjectSetInqFn")

public actual fun rpcObjectSetType(objuuid: ConstPtr, typeuuid: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcObjectSetType")

public actual fun rpcProtseqVectorFreeA(protseqvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeA")

public actual fun rpcProtseqVectorFreeW(protseqvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcProtseqVectorFreeW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcRaiseException")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcRaiseException(exception: Int): Unit

public actual fun rpcRaiseException(exception: RpcStatus): Unit =
    wasiWindowssysWindowsWin32SystemRpcRpcRaiseException(exception)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation(): Int

public actual fun rpcRevertContainerImpersonation(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcRevertContainerImpersonation()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcRevertToSelf")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcRevertToSelf(): Int

public actual fun rpcRevertToSelf(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcRevertToSelf()

public actual fun rpcRevertToSelfEx(bindinghandle: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcRevertToSelfEx")

public actual fun rpcServerCompleteSecurityCallback(bindinghandle: ConstPtr, status: RpcStatus): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerCompleteSecurityCallback")

public actual fun rpcServerInqBindingHandle(binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqBindingHandle")

public actual fun rpcServerInqBindings(bindingvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqBindings")

public actual fun rpcServerInqBindingsEx(securitydescriptor: ConstPtr, bindingvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqBindingsEx")

public actual fun rpcServerInqCallAttributesA(clientbinding: ConstPtr, rpccallattributes: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesA")

public actual fun rpcServerInqCallAttributesW(clientbinding: ConstPtr, rpccallattributes: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqCallAttributesW")

public actual fun rpcServerInqDefaultPrincNameA(authnsvc: UInt, princname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameA")

public actual fun rpcServerInqDefaultPrincNameW(authnsvc: UInt, princname: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqDefaultPrincNameW")

public actual fun rpcServerInqIf(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInqIf")

public actual fun rpcServerInterfaceGroupActivate(ifgroup: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupActivate")

public actual fun rpcServerInterfaceGroupClose(ifgroup: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupClose")

public actual fun rpcServerInterfaceGroupCreateA(interfaces: ConstPtr, numifs: UInt, endpoints: ConstPtr, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr, ifgroup: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateA")

public actual fun rpcServerInterfaceGroupCreateW(interfaces: ConstPtr, numifs: UInt, endpoints: ConstPtr, numendpoints: UInt, idleperiod: UInt, idlecallbackfn: RpcInterfaceGroupIdleCallbackFn, idlecallbackcontext: ConstPtr, ifgroup: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupCreateW")

public actual fun rpcServerInterfaceGroupDeactivate(ifgroup: ConstPtr, forcedeactivation: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupDeactivate")

public actual fun rpcServerInterfaceGroupInqBindings(ifgroup: ConstPtr, bindingvector: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerInterfaceGroupInqBindings")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcServerListen")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcServerListen(minimumcallthreads: Int, maxcalls: Int, dontwait: Int): Int

public actual fun rpcServerListen(minimumcallthreads: UInt, maxcalls: UInt, dontwait: UInt): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcServerListen(minimumcallthreads.toInt(), maxcalls.toInt(), dontwait.toInt())

public actual fun rpcServerRegisterAuthInfoA(serverprincname: Pcstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoA")

public actual fun rpcServerRegisterAuthInfoW(serverprincname: Pcwstr, authnsvc: UInt, getkeyfn: RpcAuthKeyRetrievalFn, arg: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerRegisterAuthInfoW")

public actual fun rpcServerRegisterIf(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerRegisterIf")

public actual fun rpcServerRegisterIf2(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallbackfn: RpcIfCallbackFn): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerRegisterIf2")

public actual fun rpcServerRegisterIf3(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr, flags: UInt, maxcalls: UInt, maxrpcsize: UInt, ifcallback: RpcIfCallbackFn, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerRegisterIf3")

public actual fun rpcServerRegisterIfEx(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, mgrepv: ConstPtr, flags: UInt, maxcalls: UInt, ifcallback: RpcIfCallbackFn): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerRegisterIfEx")

public actual fun rpcServerSubscribeForNotification(binding: ConstPtr, notification: RpcNotifications, notificationtype: RpcNotificationTypes, notificationinfo: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerSubscribeForNotification")

public actual fun rpcServerTestCancel(bindinghandle: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerTestCancel")

public actual fun rpcServerUnregisterIf(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, waitforcallstocomplete: UInt): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUnregisterIf")

public actual fun rpcServerUnregisterIfEx(ifspec: ConstPtr, mgrtypeuuid: ConstPtr, rundowncontexthandles: Int): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUnregisterIfEx")

public actual fun rpcServerUnsubscribeForNotification(binding: ConstPtr, notification: RpcNotifications, notificationsqueued: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUnsubscribeForNotification")

public actual fun rpcServerUseAllProtseqs(maxcalls: UInt, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqs")

public actual fun rpcServerUseAllProtseqsEx(maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsEx")

public actual fun rpcServerUseAllProtseqsIf(maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIf")

public actual fun rpcServerUseAllProtseqsIfEx(maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseAllProtseqsIfEx")

public actual fun rpcServerUseProtseqA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqA")

public actual fun rpcServerUseProtseqEpA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpA")

public actual fun rpcServerUseProtseqEpExA(protseq: Pcstr, maxcalls: UInt, endpoint: Pcstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExA")

public actual fun rpcServerUseProtseqEpExW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpExW")

public actual fun rpcServerUseProtseqEpW(protseq: Pcwstr, maxcalls: UInt, endpoint: Pcwstr, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqEpW")

public actual fun rpcServerUseProtseqExA(protseq: Pcstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqExA")

public actual fun rpcServerUseProtseqExW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqExW")

public actual fun rpcServerUseProtseqIfA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfA")

public actual fun rpcServerUseProtseqIfExA(protseq: Pcstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExA")

public actual fun rpcServerUseProtseqIfExW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr, policy: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfExW")

public actual fun rpcServerUseProtseqIfW(protseq: Pcwstr, maxcalls: UInt, ifspec: ConstPtr, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqIfW")

public actual fun rpcServerUseProtseqW(protseq: Pcwstr, maxcalls: UInt, securitydescriptor: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcServerUseProtseqW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcServerYield")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcServerYield(): Unit

public actual fun rpcServerYield(): Unit =
    wasiWindowssysWindowsWin32SystemRpcRpcServerYield()

public actual fun rpcSmAllocate(size: ULong, pstatus: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmAllocate")

public actual fun rpcSmClientFree(pnodetofree: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmClientFree")

public actual fun rpcSmDestroyClientContext(contexthandle: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmDestroyClientContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcSmDisableAllocate")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcSmDisableAllocate(): Int

public actual fun rpcSmDisableAllocate(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcSmDisableAllocate()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcSmEnableAllocate")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcSmEnableAllocate(): Int

public actual fun rpcSmEnableAllocate(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcSmEnableAllocate()

public actual fun rpcSmFree(nodetofree: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmFree")

public actual fun rpcSmGetThreadHandle(pstatus: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmGetThreadHandle")

public actual fun rpcSmSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmSetClientAllocFree")

public actual fun rpcSmSetThreadHandle(id: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmSetThreadHandle")

public actual fun rpcSmSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr, oldclientfree: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSmSwapClientAllocFree")

public actual fun rpcSsAllocate(size: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsAllocate")

public actual fun rpcSsContextLockExclusive(serverbindinghandle: ConstPtr, usercontext: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsContextLockExclusive")

public actual fun rpcSsContextLockShared(serverbindinghandle: ConstPtr, usercontext: ConstPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsContextLockShared")

public actual fun rpcSsDestroyClientContext(contexthandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsDestroyClientContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcSsDisableAllocate")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcSsDisableAllocate(): Unit

public actual fun rpcSsDisableAllocate(): Unit =
    wasiWindowssysWindowsWin32SystemRpcRpcSsDisableAllocate()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcSsDontSerializeContext")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcSsDontSerializeContext(): Unit

public actual fun rpcSsDontSerializeContext(): Unit =
    wasiWindowssysWindowsWin32SystemRpcRpcSsDontSerializeContext()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcSsEnableAllocate")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcSsEnableAllocate(): Unit

public actual fun rpcSsEnableAllocate(): Unit =
    wasiWindowssysWindowsWin32SystemRpcRpcSsEnableAllocate()

public actual fun rpcSsFree(nodetofree: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsFree")

public actual fun rpcSsGetContextBinding(contexthandle: ConstPtr, binding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsGetContextBinding")

public actual fun rpcSsGetThreadHandle(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsGetThreadHandle")

public actual fun rpcSsSetClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsSetClientAllocFree")

public actual fun rpcSsSetThreadHandle(id: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsSetThreadHandle")

public actual fun rpcSsSwapClientAllocFree(clientalloc: RpcClientAlloc, clientfree: RpcClientFree, oldclientalloc: MutPtr, oldclientfree: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcSsSwapClientAllocFree")

public actual fun rpcStringBindingComposeA(objuuid: Pcstr, protseq: Pcstr, networkaddr: Pcstr, endpoint: Pcstr, options: Pcstr, stringbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcStringBindingComposeA")

public actual fun rpcStringBindingComposeW(objuuid: Pcwstr, protseq: Pcwstr, networkaddr: Pcwstr, endpoint: Pcwstr, options: Pcwstr, stringbinding: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcStringBindingComposeW")

public actual fun rpcStringBindingParseA(stringbinding: Pcstr, objuuid: MutPtr, protseq: MutPtr, networkaddr: MutPtr, endpoint: MutPtr, networkoptions: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcStringBindingParseA")

public actual fun rpcStringBindingParseW(stringbinding: Pcwstr, objuuid: MutPtr, protseq: MutPtr, networkaddr: MutPtr, endpoint: MutPtr, networkoptions: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcStringBindingParseW")

public actual fun rpcStringFreeA(string: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcStringFreeA")

public actual fun rpcStringFreeW(string: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcStringFreeW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRpcRpcTestCancel")
private external fun wasiWindowssysWindowsWin32SystemRpcRpcTestCancel(): Int

public actual fun rpcTestCancel(): RpcStatus =
    wasiWindowssysWindowsWin32SystemRpcRpcTestCancel()

public actual fun rpcUserFree(asynchandle: MutPtr, pbuffer: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcRpcUserFree")

public actual fun uuidCompare(uuid1: ConstPtr, uuid2: ConstPtr, status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidCompare")

public actual fun uuidCreate(uuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidCreate")

public actual fun uuidCreateNil(niluuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidCreateNil")

public actual fun uuidCreateSequential(uuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidCreateSequential")

public actual fun uuidEqual(uuid1: ConstPtr, uuid2: ConstPtr, status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidEqual")

public actual fun uuidFromStringA(stringuuid: Pcstr, uuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidFromStringA")

public actual fun uuidFromStringW(stringuuid: Pcwstr, uuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidFromStringW")

public actual fun uuidHash(uuid: ConstPtr, status: MutPtr): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidHash")

public actual fun uuidIsNil(uuid: ConstPtr, status: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidIsNil")

public actual fun uuidToStringA(uuid: ConstPtr, stringuuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidToStringA")

public actual fun uuidToStringW(uuid: ConstPtr, stringuuid: MutPtr): RpcStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRpcUuidToStringW")
